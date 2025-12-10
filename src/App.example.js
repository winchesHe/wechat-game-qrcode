import React from 'react';
import { View, StyleSheet, SafeAreaView } from 'react-native';
import { WeChatQRLogin } from './components/WeChatQRLogin';
import { Constants } from './constants/Constants';

/**
 * 使用示例
 */
export default function App() {
  const handleLoginSuccess = (url, code) => {
    console.log('登录成功!');
    console.log('授权 URL:', url);
    console.log('授权码:', code);
    // 这里可以处理登录成功后的逻辑
  };

  const handleLoginError = (error) => {
    console.error('登录失败:', error);
    // 这里可以处理登录失败后的逻辑
  };

  return (
    <SafeAreaView style={styles.container}>
      <WeChatQRLogin
        gameInfo={Constants.DUIZHAN_JINGLING}
        onLoginSuccess={handleLoginSuccess}
        onLoginError={handleLoginError}
      />
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
  },
});

