package com.baidu.mobstat;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class af {

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    public static String a(byte[] bArr) {
        byte[] bArrA = ax.a();
        return new String(at.b(bArrA, bArrA, bArr));
    }

    public static Method a(Class<?> cls, String str, Class<?>[] clsArr) throws NoSuchMethodException, SecurityException {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
