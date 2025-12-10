package com.muhua.wz;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.muhua.wz.util.MD5Util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* loaded from: classes.dex */
public class Utils {
    public static final String APP_PACKAGE = "_mmessage_appPackage";
    public static final String APP_SUPORT_CONTENT_TYPE = "_mmessage_support_content_type";
    public static final String CHECK_SUM = "_mmessage_checksum";
    public static final String CONTENT = "_mmessage_content";
    public static final String DEFAULT_ENTRY_CLASS_NAME = ".wxapi.WXEntryActivity";
    public static final int SDK_INT = 621086720;
    public static final String SDK_VERSION = "_mmessage_sdkVersion";
    public static String TAG = "zxl";
    public static final String TOKEN = "_message_token";
    public static final String checkQrUrl = "https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s";
    public static final String getQrUrl = "http://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s";
    public static final String scope = "snsapi_login,snsapi_userinfo,snsapi_friend,snsapi_message,scope_what_you_want";

    public static boolean isEmpty(String str) {
        return str == null || str.length() <= 0;
    }

    public static byte[] sign(String str, int i, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        return m9826c(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    }

    private static final String m9826c(byte[] bArr) throws NoSuchAlgorithmException {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MD5Util.TAG);
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            int length = bArrDigest.length;
            char[] cArr2 = new char[length * 2];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte b = bArrDigest[i];
                int i3 = i2 + 1;
                cArr2[i2] = cArr[(b >>> 4) & 15];
                cArr2[i3] = cArr[b & 15];
                i++;
                i2 = i3 + 1;
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isInstalled(Context context, String str) {
        List<PackageInfo> installedPackages;
        if (str != null && !str.isEmpty() && (installedPackages = context.getPackageManager().getInstalledPackages(0)) != null && !installedPackages.isEmpty()) {
            for (int i = 0; i < installedPackages.size(); i++) {
                if (str.equals(installedPackages.get(i).packageName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
