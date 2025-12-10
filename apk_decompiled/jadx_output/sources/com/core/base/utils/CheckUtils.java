package com.core.base.utils;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class CheckUtils {
    private CheckUtils() {
        throw new UnsupportedOperationException("CheckUtils not support initialize.");
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String checkNotEmpty(String str, String str2) {
        if (isNullOrEmpty(str)) {
            throw new NullPointerException(str2);
        }
        return str;
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty() || str.trim().isEmpty();
    }

    public static void checkNotPrimitive(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static String checkNullOrEmpty(String str, String str2) {
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            throw new NullPointerException(str2);
        }
        return str;
    }
}
