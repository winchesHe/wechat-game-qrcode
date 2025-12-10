package com.baidu.mobstat;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class be {
    private static byte[] a;
    private static byte[] b;

    public static byte[] a() {
        byte[] bArr = a;
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = new BigInteger(bd.a).modPow(new BigInteger(bd.b), new BigInteger(bd.e)).toByteArray();
        a = byteArray;
        return byteArray;
    }

    public static byte[] b() {
        byte[] bArr = b;
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = new BigInteger(bd.c).modPow(new BigInteger(bd.d), new BigInteger(bd.e)).toByteArray();
        b = byteArray;
        return byteArray;
    }
}
