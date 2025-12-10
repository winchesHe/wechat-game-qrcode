# React Native 微信扫码登录实现

这是将 Android 原生扫码登录代码转换为 React Native 的实现。

## 功能说明

实现了以下核心功能：
1. 加载微信授权二维码页面
2. 通过 JavaScript 提取二维码图片
3. 监听 URL 变化，检测授权回调
4. 提取授权 code
5. 启动目标应用（对战精灵）并传递授权信息

## 安装依赖

```bash
npm install react-native-webview crypto-js
# 或
yarn add react-native-webview crypto-js
```

## 文件说明

### 1. `src/constants/Constants.js`
- 常量定义
- 包含微信授权 URL 模板
- 对战精灵配置信息

### 2. `src/utils/Utils.js`
- 工具函数
- 签名计算（对应 Android 的 sign 方法）
- URL 参数提取

### 3. `src/components/WeChatQRLogin.js`
- 主组件
- 包含 WebView 和扫码逻辑
- 处理授权回调并启动目标应用

### 4. `src/native/AndroidIntentModule.js`
- React Native 桥接模块
- 调用原生 Android Intent 功能

### 5. `android/app/src/main/java/com/yourpackage/AndroidIntentModule.java`
- Android 原生模块
- 实现启动其他应用的功能

## 使用示例

```javascript
import React from 'react';
import { View } from 'react-native';
import { WeChatQRLogin } from './src/components/WeChatQRLogin';
import { Constants } from './src/constants/Constants';

export default function App() {
  const handleLoginSuccess = (url, code) => {
    console.log('登录成功:', { url, code });
  };

  const handleLoginError = (error) => {
    console.error('登录失败:', error);
  };

  return (
    <View style={{ flex: 1 }}>
      <WeChatQRLogin
        gameInfo={Constants.DUIZHAN_JINGLING}
        onLoginSuccess={handleLoginSuccess}
        onLoginError={handleLoginError}
      />
    </View>
  );
}
```

## 原生模块配置

### 1. 修改包名
将 `com.yourpackage` 替换为你的实际包名。

### 2. 注册模块
在 `MainApplication.java` 中注册：

```java
import com.yourpackage.AndroidIntentPackage;

@Override
protected List<ReactPackage> getPackages() {
    return Arrays.<ReactPackage>asList(
        new MainReactPackage(),
        new AndroidIntentPackage() // 添加这一行
    );
}
```

### 3. 链接模块
如果使用 React Native 0.60+，自动链接应该会自动处理。否则需要手动链接。

## 注意事项

1. **原生模块**：需要正确配置 Android 原生模块才能启动其他应用
2. **权限**：确保应用有必要的权限
3. **包名**：确保目标应用（对战精灵）已安装
4. **签名**：签名计算逻辑需要与 Android 原生代码保持一致

## 与原 Android 代码的对应关系

| Android 代码 | React Native 代码 |
|-------------|------------------|
| `MainActivity.goGame()` | `WeChatQRLogin.handleAuthCallback()` |
| `MyWebViewClient.shouldOverrideUrlLoading()` | `WeChatQRLogin.handleShouldStartLoadWithRequest()` |
| `JavaScriptInterface.loadQrcodeResult()` | `WeChatQRLogin.handleMessage()` |
| `Bundle` + `Intent` | `AndroidIntentModule.startActivity()` |
| `Utils.sign()` | `Utils.sign()` |

## 测试

1. 确保对战精灵应用已安装
2. 运行 React Native 应用
3. 等待二维码加载
4. 使用微信扫码
5. 确认是否成功跳转到对战精灵应用

