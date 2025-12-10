package com.baidu.mobstat;

import com.muhua.wz.util.MD5Util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class bn {
    public static String a(byte[] bArr, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & UByte.MAX_VALUE);
            if (z) {
                hexString = hexString.toUpperCase();
            }
            if (hexString.length() == 1) {
                sb.append(PropertyType.UID_PROPERTRY);
            }
            sb.append(hexString);
            sb.append(str);
        }
        return sb.toString();
    }

    public static String a(byte[] bArr, boolean z) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MD5Util.TAG);
            messageDigest.reset();
            messageDigest.update(bArr);
            return a(messageDigest.digest(), "", z);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
