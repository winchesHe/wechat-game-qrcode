package com.azhon.appupdate.config;

import kotlin.Metadata;

/* compiled from: Constant.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/azhon/appupdate/config/Constant;", "", "()V", "APK_SUFFIX", "", "AUTHORITIES", "getAUTHORITIES", "()Ljava/lang/String;", "setAUTHORITIES", "(Ljava/lang/String;)V", "COROUTINE_NAME", "DEFAULT_CHANNEL_ID", "DEFAULT_CHANNEL_NAME", "HTTP_TIME_OUT", "", "TAG", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Constant {
    public static final String APK_SUFFIX = ".apk";
    private static String AUTHORITIES = null;
    public static final String COROUTINE_NAME = "app-update-coroutine";
    public static final String DEFAULT_CHANNEL_ID = "appUpdate";
    public static final String DEFAULT_CHANNEL_NAME = "AppUpdate";
    public static final int HTTP_TIME_OUT = 30000;
    public static final Constant INSTANCE = new Constant();
    public static final String TAG = "AppUpdate.";

    private Constant() {
    }

    public final String getAUTHORITIES() {
        return AUTHORITIES;
    }

    public final void setAUTHORITIES(String str) {
        AUTHORITIES = str;
    }
}
