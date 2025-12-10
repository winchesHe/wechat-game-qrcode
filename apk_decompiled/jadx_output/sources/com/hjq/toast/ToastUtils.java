package com.hjq.toast;

import android.app.Application;
import android.content.res.Resources;
import com.hjq.toast.config.IToastInterceptor;
import com.hjq.toast.config.IToastStrategy;
import com.hjq.toast.config.IToastStyle;
import com.hjq.toast.style.BlackToastStyle;
import com.hjq.toast.style.LocationToastStyle;
import com.hjq.toast.style.ViewToastStyle;

/* loaded from: classes.dex */
public final class ToastUtils {
    private static Application sApplication;
    private static Boolean sDebugMode;
    private static IToastInterceptor sToastInterceptor;
    private static IToastStrategy sToastStrategy;
    private static IToastStyle<?> sToastStyle;

    private ToastUtils() {
    }

    public static void init(Application application) {
        init(application, sToastStyle);
    }

    public static void init(Application application, IToastStrategy iToastStrategy) {
        init(application, iToastStrategy, null);
    }

    public static void init(Application application, IToastStyle<?> iToastStyle) {
        init(application, null, iToastStyle);
    }

    public static void init(Application application, IToastStrategy iToastStrategy, IToastStyle<?> iToastStyle) {
        sApplication = application;
        if (iToastStrategy == null) {
            iToastStrategy = new ToastStrategy();
        }
        setStrategy(iToastStrategy);
        if (iToastStyle == null) {
            iToastStyle = new BlackToastStyle();
        }
        setStyle(iToastStyle);
    }

    public static boolean isInit() {
        return (sApplication == null || sToastStrategy == null || sToastStyle == null) ? false : true;
    }

    public static void delayedShow(int i, long j) {
        show(i, j);
    }

    public static void delayedShow(CharSequence charSequence, long j) {
        show(charSequence, j);
    }

    public static void delayedShow(Object obj, long j) {
        show(obj, j);
    }

    public static void debugShow(int i) {
        if (isDebugMode()) {
            show(i, 0L);
        }
    }

    public static void debugShow(CharSequence charSequence) {
        if (isDebugMode()) {
            show(charSequence, 0L);
        }
    }

    public static void debugShow(Object obj) {
        if (isDebugMode()) {
            show(obj, 0L);
        }
    }

    public static void show(int i) {
        show(i, 0L);
    }

    public static void show(Object obj) {
        show(obj, 0L);
    }

    public static void show(CharSequence charSequence) {
        show(charSequence, 0L);
    }

    private static void show(int i, long j) {
        try {
            show(sApplication.getResources().getText(i));
        } catch (Resources.NotFoundException unused) {
            show((CharSequence) String.valueOf(i));
        }
    }

    private static void show(Object obj, long j) {
        show((CharSequence) (obj != null ? obj.toString() : "null"), j);
    }

    private static void show(CharSequence charSequence, long j) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        if (sToastInterceptor == null) {
            sToastInterceptor = new ToastLogInterceptor();
        }
        if (sToastInterceptor.intercept(charSequence)) {
            return;
        }
        sToastStrategy.showToast(charSequence, j);
    }

    public static void cancel() {
        sToastStrategy.cancelToast();
    }

    public static void setGravity(int i) {
        setGravity(i, 0, 0);
    }

    public static void setGravity(int i, int i2, int i3) {
        setGravity(i, i2, i3, 0.0f, 0.0f);
    }

    public static void setGravity(int i, int i2, int i3, float f, float f2) {
        sToastStrategy.bindStyle(new LocationToastStyle(sToastStyle, i, i2, i3, f, f2));
    }

    public static void setView(int i) {
        if (i <= 0) {
            return;
        }
        setStyle(new ViewToastStyle(i, sToastStyle));
    }

    public static void setStyle(IToastStyle<?> iToastStyle) {
        sToastStyle = iToastStyle;
        sToastStrategy.bindStyle(iToastStyle);
    }

    public static IToastStyle<?> getStyle() {
        return sToastStyle;
    }

    public static void setStrategy(IToastStrategy iToastStrategy) {
        sToastStrategy = iToastStrategy;
        iToastStrategy.registerStrategy(sApplication);
    }

    public static IToastStrategy getStrategy() {
        return sToastStrategy;
    }

    public static void setInterceptor(IToastInterceptor iToastInterceptor) {
        sToastInterceptor = iToastInterceptor;
    }

    public static IToastInterceptor getInterceptor() {
        return sToastInterceptor;
    }

    public static void setDebugMode(boolean z) {
        sDebugMode = Boolean.valueOf(z);
    }

    static boolean isDebugMode() {
        if (sDebugMode == null) {
            sDebugMode = Boolean.valueOf((sApplication.getApplicationInfo().flags & 2) != 0);
        }
        return sDebugMode.booleanValue();
    }
}
