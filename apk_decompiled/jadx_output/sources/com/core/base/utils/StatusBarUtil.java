package com.core.base.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.baidu.mobstat.PropertyType;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StatusBarUtil.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0003J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0017"}, d2 = {"Lcom/core/base/utils/StatusBarUtil;", "", "()V", "FlymeLightMode", "", "activity", "Landroid/app/Activity;", "dark", "MIUILightMode", "SystemLightMode", "", "checkDeviceHasNavigationBar", "context", "Landroid/content/Context;", "getNavHeight", "", "getStatusBarHeight", "getStatusBarHeightOnlyFromM", "isFromM", "lightMode", "setStatusBarColor", TypedValues.Custom.S_COLOR, "setStatusBarTransparent", "base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StatusBarUtil {
    public static final StatusBarUtil INSTANCE = new StatusBarUtil();

    private StatusBarUtil() {
    }

    @JvmStatic
    public static final int getStatusBarHeightOnlyFromM(Context context) {
        int identifier;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!INSTANCE.isFromM() || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public final int getStatusBarHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final void setStatusBarTransparent(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (isFromM()) {
            WindowCompat.setDecorFitsSystemWindows(activity.getWindow(), false);
            activity.getWindow().setStatusBarColor(0);
        }
    }

    public final void setStatusBarColor(Activity activity, int color) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (isFromM()) {
            Window window = activity.getWindow();
            WindowCompat.setDecorFitsSystemWindows(window, false);
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, activity.getWindow().getDecorView());
            windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.systemBars());
            windowInsetsControllerCompat.setSystemBarsBehavior(2);
            activity.getWindow().setStatusBarColor(color);
        }
    }

    public final void lightMode(Activity activity, boolean dark) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (isFromM()) {
            try {
                if (MIUILightMode(activity, dark) || FlymeLightMode(activity, dark)) {
                    return;
                }
                SystemLightMode(activity, dark);
            } catch (Exception unused) {
            }
        }
    }

    private final boolean isFromM() {
        return Build.VERSION.SDK_INT >= 23;
    }

    private final void SystemLightMode(Activity activity, boolean dark) {
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        new WindowInsetsControllerCompat(window, decorView).setAppearanceLightStatusBars(dark);
        if (dark) {
            window.setStatusBarColor(-1);
        }
    }

    private final boolean FlymeLightMode(Activity activity, boolean dark) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Window window = activity.getWindow();
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i = declaredField.getInt(null);
                int i2 = declaredField2.getInt(attributes);
                declaredField2.setInt(attributes, dark ? i2 | i : (~i) & i2);
                window.setAttributes(attributes);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private final boolean MIUILightMode(Activity activity, boolean dark) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Window window = activity.getWindow();
        if (window == null) {
            return false;
        }
        Class<?> cls = window.getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            if (dark) {
                method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
            } else {
                method.invoke(window, 0, Integer.valueOf(i));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                SystemLightMode(activity, dark);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean checkDeviceHasNavigationBar(Context context) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        boolean z = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            objInvoke = cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
        } catch (Exception unused) {
        }
        if (objInvoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str = (String) objInvoke;
        if ("1".equals(str)) {
            return false;
        }
        if (PropertyType.UID_PROPERTRY.equals(str)) {
            return true;
        }
        return z;
    }

    public final int getNavHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier <= 0 || !checkDeviceHasNavigationBar(context)) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }
}
