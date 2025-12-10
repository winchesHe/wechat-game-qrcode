import CryptoJS from 'crypto-js';

// 工具类
export class Utils {
  static SDK_VERSION = '_mmessage_sdkVersion';
  static APP_PACKAGE = '_mmessage_appPackage';
  static CONTENT = '_mmessage_content';
  static TOKEN = '_message_token';
  static CHECK_SUM = '_mmessage_checksum';
  static DEFAULT_ENTRY_CLASS_NAME = '.wxapi.WXEntryActivity';
  static SDK_INT = 621086720;

  /**
   * 计算签名（对应 Android 的 sign 方法）
   * @param {string} content - 内容
   * @param {number} sdkVersion - SDK 版本
   * @param {string} appPackage - 应用包名
   * @returns {string} 签名字符串（16进制）
   */
  static sign(content, sdkVersion, appPackage) {
    const secret = 'mMcShCsTr';
    let buffer = '';
    
    if (content) {
      buffer += content;
    }
    buffer += sdkVersion;
    buffer += appPackage;
    buffer += secret;
    
    // 取第 1-8 个字符（substring(1, 9)）
    const subStr = buffer.substring(1, 9);
    
    // 将字符串转换为字节数组
    const bytes = [];
    for (let i = 0; i < subStr.length; i++) {
      bytes.push(subStr.charCodeAt(i));
    }
    
    // MD5 哈希（对字节数组进行 MD5）
    const wordArray = CryptoJS.lib.WordArray.create(bytes);
    const hash = CryptoJS.MD5(wordArray).toString();
    
    // Android 代码返回的是字节数组，这里返回 MD5 的 16 进制字符串
    // 注意：Android 的 sign 方法返回 byte[]，实际使用时可能需要进一步处理
    return hash;
  }

  /**
   * 从 URL 中提取参数
   * @param {string} url - URL 字符串
   * @param {string} paramName - 参数名
   * @returns {string|null} 参数值
   */
  static getUrlParameter(url, paramName) {
    try {
      const urlObj = new URL(url);
      return urlObj.searchParams.get(paramName);
    } catch (e) {
      // 如果不是完整 URL，尝试手动解析
      const regex = new RegExp(`[?&]${paramName}=([^&#]*)`);
      const match = url.match(regex);
      return match ? decodeURIComponent(match[1]) : null;
    }
  }

  /**
   * 检查字符串是否为空
   * @param {string} str - 字符串
   * @returns {boolean}
   */
  static isEmpty(str) {
    return !str || str.length === 0;
  }
}

