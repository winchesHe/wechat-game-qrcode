package com.baidu.mobstat;

import com.facebook.stetho.dumpapp.Framer;

/* loaded from: classes.dex */
public class ax {
    private static volatile byte[] a;

    public static byte[] a() {
        if (a == null) {
            synchronized (ax.class) {
                if (a == null) {
                    byte[] bArr = new byte[16];
                    System.arraycopy(be.b(), 0, bArr, 0, 16);
                    at atVar = new at();
                    atVar.a(2, bArr, bArr);
                    a = atVar.a(new byte[]{-71, -100, -115, 26, 39, -124, 14, 14, -31, -46, -56, 1, 25, -127, -99, -107, -54, 51, 46, 14, 68, -68, -19, 28, 66, 19, -113, 5, 25, -11, -123, Framer.STDERR_FRAME_PREFIX});
                }
            }
        }
        return a;
    }
}
