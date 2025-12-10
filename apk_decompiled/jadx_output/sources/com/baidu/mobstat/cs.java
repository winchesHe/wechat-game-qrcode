package com.baidu.mobstat;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class cs {

    public static class a {
        public static String a(byte[] bArr) {
            try {
                return cs.b(MessageDigest.getInstance("md5"), bArr);
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public static class b {
        public static String a(byte[] bArr) {
            try {
                return cs.b(MessageDigest.getInstance("SHA-256"), bArr);
            } catch (Exception unused) {
                return "";
            }
        }

        public static String a(File file) {
            try {
                return cs.b(MessageDigest.getInstance("SHA-256"), file);
            } catch (NoSuchAlgorithmException unused) {
                return "";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        return a(messageDigest.digest());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(MessageDigest messageDigest, File file) throws Throwable {
        FileInputStream fileInputStream;
        if (!file.isFile()) {
            return "";
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception unused) {
            }
            try {
                byte[] bArr = new byte[4048];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                }
                fileInputStream.close();
            } catch (Exception unused2) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                return a(messageDigest.digest());
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
        return a(messageDigest.digest());
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            int i = (b2 >> 4) & 15;
            int i2 = b2 & 15;
            sb.append((char) (i >= 10 ? (i + 97) - 10 : i + 48));
            sb.append((char) (i2 >= 10 ? (i2 + 97) - 10 : i2 + 48));
        }
        return sb.toString();
    }
}
