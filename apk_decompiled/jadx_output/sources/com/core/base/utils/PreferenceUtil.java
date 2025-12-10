package com.core.base.utils;

import com.core.base.ContextProvider;
import com.tencent.mmkv.MMKV;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreferenceUtil.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nJ\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¨\u0006\u0013"}, d2 = {"Lcom/core/base/utils/PreferenceUtil;", "", "()V", "getBoolean", "", "key", "", "getInt", "", "getLong", "", "getString", "putBoolean", "", "value", "putInt", "putLong", "putString", "Companion", "base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PreferenceUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile PreferenceUtil INSTANCE;

    @JvmStatic
    public static final PreferenceUtil getInstance() {
        return INSTANCE.getInstance();
    }

    public PreferenceUtil() {
        MMKV.initialize(ContextProvider.context);
    }

    public final void putString(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        MMKV.defaultMMKV().encode(key, value);
    }

    public final String getString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return MMKV.defaultMMKV().decodeString(key);
    }

    public final void putInt(String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        MMKV.defaultMMKV().encode(key, value);
    }

    public final int getInt(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return MMKV.defaultMMKV().decodeInt(key, 0);
    }

    public final boolean getBoolean(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return MMKV.defaultMMKV().decodeBool(key, false);
    }

    public final void putBoolean(String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        MMKV.defaultMMKV().encode(key, value);
    }

    public final void putLong(String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        MMKV.defaultMMKV().encode(key, value);
    }

    public final long getLong(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return MMKV.defaultMMKV().decodeLong(key, 0L);
    }

    /* compiled from: PreferenceUtil.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/core/base/utils/PreferenceUtil$Companion;", "", "()V", "INSTANCE", "Lcom/core/base/utils/PreferenceUtil;", "getInstance", "base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PreferenceUtil getInstance() {
            if (PreferenceUtil.INSTANCE == null) {
                synchronized (PreferenceUtil.class) {
                    if (PreferenceUtil.INSTANCE == null) {
                        Companion companion = PreferenceUtil.INSTANCE;
                        PreferenceUtil.INSTANCE = new PreferenceUtil();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            PreferenceUtil preferenceUtil = PreferenceUtil.INSTANCE;
            Intrinsics.checkNotNull(preferenceUtil);
            return preferenceUtil;
        }
    }
}
