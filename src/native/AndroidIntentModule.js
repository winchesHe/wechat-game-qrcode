import { NativeModules, Platform } from 'react-native';

/**
 * Android Intent 原生模块
 * 用于启动其他 Android 应用
 * 
 * 注意：这需要创建对应的原生模块
 * Android: android/app/src/main/java/com/yourpackage/AndroidIntentModule.java
 */
class AndroidIntentModule {
  /**
   * 启动 Activity
   * @param {Object} intentData - Intent 数据
   * @param {string} intentData.packageName - 目标包名
   * @param {string} intentData.className - 目标类名
   * @param {Object} intentData.bundle - Bundle 数据
   * @param {Object} intentData.extras - Extra 数据
   * @param {number} intentData.flags - Intent 标志
   * @returns {Promise<boolean>} 是否成功
   */
  static async startActivity(intentData) {
    if (Platform.OS !== 'android') {
      console.warn('AndroidIntentModule 仅在 Android 平台可用');
      return false;
    }

    try {
      // 调用原生模块
      const { AndroidIntentModule: NativeModule } = NativeModules;
      
      if (!NativeModule) {
        console.error('AndroidIntentModule 原生模块未找到，请确保已正确链接');
        return false;
      }

      const result = await NativeModule.startActivity(intentData);
      return result === true;
    } catch (error) {
      console.error('启动 Activity 失败:', error);
      return false;
    }
  }

  /**
   * 检查应用是否已安装
   * @param {string} packageName - 包名
   * @returns {Promise<boolean>}
   */
  static async isAppInstalled(packageName) {
    if (Platform.OS !== 'android') {
      return false;
    }

    try {
      const { AndroidIntentModule: NativeModule } = NativeModules;
      if (!NativeModule) {
        return false;
      }
      return await NativeModule.isAppInstalled(packageName);
    } catch (error) {
      console.error('检查应用安装状态失败:', error);
      return false;
    }
  }
}

export { AndroidIntentModule };

