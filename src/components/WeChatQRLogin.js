import React, { useState, useRef, useEffect } from 'react';
import {
  View,
  StyleSheet,
  Alert,
  ActivityIndicator,
  Text,
  TouchableOpacity,
} from 'react-native';
import { WebView } from 'react-native-webview';
import { Constants } from '../constants/Constants';
import { Utils } from '../utils/Utils';
import { AndroidIntentModule } from '../native/AndroidIntentModule';

/**
 * 微信扫码登录组件
 * 对应 Android MainActivity 的功能
 */
export const WeChatQRLogin = ({ gameInfo = Constants.DUIZHAN_JINGLING, onLoginSuccess, onLoginError }) => {
  const [currentUrl, setCurrentUrl] = useState('');
  const [loading, setLoading] = useState(true);
  const [qrCodeBase64, setQrCodeBase64] = useState(null);
  const webViewRef = useRef(null);
  const pkgScan = useRef('');

  // 构建微信授权 URL
  const buildAuthUrl = () => {
    const { appId, bundleId } = gameInfo;
    return Constants.WX_AUTH_URL
      .replace('%s', appId)
      .replace('%s', bundleId);
  };

  // JavaScript 注入代码 - 修改页面并提取二维码
  const jsCode = `
    (function() {
      // 修改页面样式
      function modifyPage() {
        var cancel = document.getElementById('js_cancel_login');
        if (cancel) {
          cancel.style.display = 'none';
        }
        
        var authMsgBd = document.getElementsByClassName('auth_msg_bd')[0];
        if (authMsgBd) {
          authMsgBd.style.marginTop = '60px';
        }
        
        var authRightsTips = document.getElementsByClassName('auth_rights_tips')[0];
        if (authRightsTips) {
          authRightsTips.innerHTML = '扫码只用于授权，不会登录你的微信<br>部分特殊游戏登录，<a class="auth_msg_ft_link" href="javascript:window.ReactNativeWebView.postMessage(JSON.stringify({type: 'showHelp'}))">查看说明</a><br>仅支持摄像头扫码识别<br><br><a class="auth_msg_ft_link" href="javascript:window.ReactNativeWebView.postMessage(JSON.stringify({type: 'feedback'}))"></a>';
        }
      }

      // 获取二维码 Base64
      function getBase64Image(img, width, height) {
        var canvas = document.createElement('canvas');
        let w = width || img.width;
        let h = height || img.height;
        canvas.width = w * 1.1;
        canvas.height = h * 1.1;
        var ctx = canvas.getContext('2d');
        ctx.fillStyle = '#f3f3f3';
        ctx.fillRect(0, 0, canvas.width, canvas.height);
        let padding = (canvas.width - w) / 2;
        ctx.drawImage(img, padding, 0, w, h);
        let fontSize = canvas.width / 13;
        ctx.font = fontSize + 'px Arial';
        ctx.textAlign = 'center';
        ctx.textBaseline = 'bottom';
        ctx.fillStyle = '#f00';
        ctx.fillText('仅支持摄像头扫码识别', canvas.width / 2, h * 1.05);
        var dataURL = canvas.toDataURL();
        return dataURL;
      }

      // 加载二维码
      function loadImage() {
        modifyPage();
        var img = new Image();
        var qrCodeElement = document.getElementsByClassName('auth_qrcode')[0];
        if (!qrCodeElement) {
          setTimeout(loadImage, 500);
          return;
        }
        img.src = qrCodeElement.src;
        
        if (img.complete) {
          var base64 = getBase64Image(img);
          window.ReactNativeWebView.postMessage(JSON.stringify({
            type: 'qrcode',
            data: base64
          }));
          return;
        }
        
        img.onload = function() {
          var base64 = getBase64Image(img);
          window.ReactNativeWebView.postMessage(JSON.stringify({
            type: 'qrcode',
            data: base64
          }));
        };
      }

      // 页面加载完成后执行
      if (document.readyState === 'complete') {
        loadImage();
      } else {
        window.addEventListener('load', loadImage);
      }
    })();
    true; // 注意：注入的代码必须以 true 结尾
  `;

  // 处理 WebView 消息
  const handleMessage = (event) => {
    try {
      const data = JSON.parse(event.nativeEvent.data);
      
      if (data.type === 'qrcode') {
        setQrCodeBase64(data.data);
      } else if (data.type === 'showHelp') {
        Alert.alert('使用说明', gameInfo.help || '请按照提示操作');
      } else if (data.type === 'feedback') {
        // 反馈功能
      }
    } catch (e) {
      console.error('解析消息失败:', e);
    }
  };

  // 处理 URL 导航（对应 shouldOverrideUrlLoading）
  const handleShouldStartLoadWithRequest = (request) => {
    const { url } = request;
    
    // 检测授权回调（oauth?code）
    if (!url.startsWith('https') && url.includes('oauth?code')) {
      handleAuthCallback(url);
      return false; // 阻止加载
    }
    
    // 检测其他参数
    try {
      const urlObj = new URL(url);
      const hasId = urlObj.searchParams.has('id');
      const hasC = urlObj.searchParams.has('c');
      
      if (hasId && hasC) {
        pkgScan.current = urlObj.searchParams.get('c');
      }
    } catch (e) {
      // URL 解析失败，继续加载
    }
    
    return true; // 允许加载
  };

  // 处理授权回调（对应 goGame 方法）
  const handleAuthCallback = async (url) => {
    try {
      // 提取 code
      const code = Utils.getUrlParameter(url, 'code');
      if (!code) {
        throw new Error('未找到授权码');
      }

      // 构建 Bundle 数据
      const bundle = {
        '_wxapi_sendauth_resp_url': url,
        '_wxapi_sendauth_resp_state': gameInfo.pkg,
        '_wxapi_sendauth_resp_token': code,
        '_wxapi_baseresp_transaction': null,
        '_wxapi_sendauth_resp_lang': 'zh_CN',
        '_wxapi_command_type': 1,
        '_wxapi_sendauth_resp_country': 'CN',
        '_wxapi_baseresp_errcode': 0,
        '_wxapi_baseresp_errstr': null,
        '_wxapi_baseresp_openId': null,
        'wx_token_key': 'com.tencent.mm.openapi.token',
      };

      // 计算签名
      // 注意：这里的 appId 应该是你的 React Native 应用的包名
      const appId = 'com.yourpackage'; // 替换为你的实际包名
      const checkSum = Utils.sign(
        appId,
        Constants.MMESSAGE_SDKVERSION,
        Constants.MMESSAGE_APPPACKAGE
      );

      // 构建 Intent 数据
      const intentData = {
        packageName: gameInfo.pkg,
        className: gameInfo.pkg + Utils.DEFAULT_ENTRY_CLASS_NAME,
        bundle: bundle,
        extras: {
          [Utils.SDK_VERSION]: Constants.MMESSAGE_SDKVERSION,
          [Utils.APP_PACKAGE]: Constants.MMESSAGE_APPPACKAGE,
          [Utils.CONTENT]: appId,
          [Utils.TOKEN]: null,
          [Utils.CHECK_SUM]: checkSum,
        },
        flags: 268435456, // FLAG_ACTIVITY_NEW_TASK
      };

      // 调用原生模块启动应用
      const success = await AndroidIntentModule.startActivity(intentData);
      
      if (success) {
        Alert.alert('成功', '登录成功！');
        onLoginSuccess && onLoginSuccess(url, code);
      } else {
        throw new Error('启动应用失败');
      }
    } catch (error) {
      console.error('登录失败:', error);
      Alert.alert('失败', '登录失败！请重试！');
      onLoginError && onLoginError(error);
    }
  };

  // 页面加载完成
  const handleLoadEnd = () => {
    setLoading(false);
    // 注入 JavaScript
    if (webViewRef.current) {
      webViewRef.current.injectJavaScript(jsCode);
    }
  };

  // 刷新
  const handleRefresh = () => {
    setLoading(true);
    setCurrentUrl(buildAuthUrl());
    if (webViewRef.current) {
      webViewRef.current.reload();
    }
  };

  useEffect(() => {
    setCurrentUrl(buildAuthUrl());
  }, [gameInfo]);

  return (
    <View style={styles.container}>
      <WebView
        ref={webViewRef}
        source={{ uri: currentUrl }}
        style={styles.webview}
        onShouldStartLoadWithRequest={handleShouldStartLoadWithRequest}
        onMessage={handleMessage}
        onLoadEnd={handleLoadEnd}
        javaScriptEnabled={true}
        domStorageEnabled={true}
        mixedContentMode="always"
        userAgent="Mozilla/5.0 (Linux; Android 7.0; Mi-4c Build/NRD90M; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/53.0.2785.49 Mobile MQQBrowser/6.2 TBS/043632 Safari/537.36 MicroMessenger/6.6.1.1220(0x26060135) NetType/WIFI Language/zh_CN MicroMessenger/6.6.1.1220(0x26060135) NetType/WIFI Language/zh_CN miniProgram"
        onError={(syntheticEvent) => {
          const { nativeEvent } = syntheticEvent;
          console.error('WebView 错误:', nativeEvent);
        }}
        onHttpError={(syntheticEvent) => {
          const { nativeEvent } = syntheticEvent;
          console.error('HTTP 错误:', nativeEvent);
        }}
      />
      
      {loading && (
        <View style={styles.loadingContainer}>
          <ActivityIndicator size="large" color="#07c160" />
          <Text style={styles.loadingText}>加载中...</Text>
        </View>
      )}
      
      <View style={styles.toolbar}>
        <TouchableOpacity style={styles.button} onPress={handleRefresh}>
          <Text style={styles.buttonText}>刷新</Text>
        </TouchableOpacity>
      </View>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
  },
  webview: {
    flex: 1,
  },
  loadingContainer: {
    position: 'absolute',
    top: 0,
    left: 0,
    right: 0,
    bottom: 0,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: 'rgba(255, 255, 255, 0.8)',
  },
  loadingText: {
    marginTop: 10,
    fontSize: 14,
    color: '#666',
  },
  toolbar: {
    flexDirection: 'row',
    padding: 10,
    backgroundColor: '#f5f5f5',
    borderTopWidth: 1,
    borderTopColor: '#e0e0e0',
  },
  button: {
    paddingHorizontal: 20,
    paddingVertical: 10,
    backgroundColor: '#07c160',
    borderRadius: 4,
  },
  buttonText: {
    color: '#fff',
    fontSize: 14,
    fontWeight: 'bold',
  },
});

