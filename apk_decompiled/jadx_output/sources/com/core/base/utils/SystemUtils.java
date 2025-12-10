package com.core.base.utils;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.ActivityCompat;
import com.baidu.mobstat.Config;
import com.core.base.Injection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;

/* compiled from: SystemUtils.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u000bJ\u0018\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bJ\u0018\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bJ\u000e\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\rJ!\u0010$\u001a\u00020\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010&\u001a\u00020'¢\u0006\u0002\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/core/base/utils/SystemUtils;", "", "()V", "UNIQUE_ID", "", "copy2Clipboard", "", "context", "Landroid/content/Context;", "text", "dp2px", "", "dpValue", "", "getAppVersion", "getDimen", Config.FEED_LIST_ITEM_CUSTOM_ID, "getHeightPixels", "getPackageName", "getPixels", "", "(Landroid/content/Context;)[Ljava/lang/Integer;", "getString", "res", "int", TypedValues.Custom.S_STRING, "getUniqueID", "getWidthPixels", "isNotificationEnabled", "", "openSettingsActivity", "paste", "ps2px", "ps", "px2dp", "pxValue", "shouldShowRequest", "permissions", "activity", "Landroid/app/Activity;", "([Ljava/lang/String;Landroid/app/Activity;)Z", "base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SystemUtils {
    public static final SystemUtils INSTANCE = new SystemUtils();
    private static final String UNIQUE_ID = "unique_id";

    private SystemUtils() {
    }

    public final boolean isNotificationEnabled(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            Object systemService = context.getSystemService("notification");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            return ((NotificationManager) systemService).areNotificationsEnabled();
        }
        Object systemService2 = context.getSystemService("appops");
        if (systemService2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.AppOpsManager");
        }
        AppOpsManager appOpsManager = (AppOpsManager) systemService2;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Method method = cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class);
            Object obj = cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.TYPE);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            Object objInvoke = method.invoke(appOpsManager, Integer.valueOf(((Integer) obj).intValue()), Integer.valueOf(i), packageName);
            if (objInvoke != null) {
                return ((Integer) objInvoke).intValue() == 0;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        } catch (Exception unused) {
            return true;
        }
    }

    public final void openSettingsActivity(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public final int dp2px(float dpValue) {
        return (int) ((dpValue * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public final int getDimen(Context context, int id) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDimensionPixelOffset(id);
    }

    public final int ps2px(int ps) {
        return (int) (TypedValue.applyDimension(2, ps, Injection.INSTANCE.provideApplicationContext().getResources().getDisplayMetrics()) + 0.5f);
    }

    public final int px2dp(float pxValue) {
        return (int) ((pxValue / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public final String getUniqueID(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = PreferenceUtil.INSTANCE.getInstance().getString(UNIQUE_ID);
        if (string != null) {
            if (!(string.length() == 0)) {
                return string;
            }
        }
        byte[] bytes = "".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String string2 = UUID.nameUUIDFromBytes(bytes).toString();
        PreferenceUtil.INSTANCE.getInstance().putString(UNIQUE_ID, string2);
        return string2;
    }

    public final void copy2Clipboard(Context context, String text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Object systemService = context.getSystemService("clipboard");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", text));
    }

    public final String paste(Context context) {
        ClipData.Item itemAt;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("clipboard");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (clipboardManager.hasPrimaryClip()) {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if ((primaryClip != null ? primaryClip.getItemCount() : 0) > 0) {
                StringBuilder sb = new StringBuilder("");
                ClipData primaryClip2 = clipboardManager.getPrimaryClip();
                String text = (primaryClip2 == null || (itemAt = primaryClip2.getItemAt(0)) == null) ? null : itemAt.getText();
                if (text == null) {
                }
                sb.append((Object) text);
                return sb.toString();
            }
        }
        return "";
    }

    public final String getPackageName(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final String getAppVersion(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str, "context.packageManager.g…ckageName, 0).versionName");
            return str;
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public final int getWidthPixels(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "manager.currentWindowMetrics");
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "windowMetrics.windowInse…Insets.Type.systemBars())");
            return (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public final int getHeightPixels(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "manager.currentWindowMetrics");
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "windowMetrics.windowInse…Insets.Type.systemBars())");
            return (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public final Integer[] getPixels(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        WindowManager windowManager = (WindowManager) systemService;
        Integer[] numArr = new Integer[2];
        for (int i = 0; i < 2; i++) {
            numArr[i] = 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "manager.currentWindowMetrics");
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "windowMetrics.windowInse…Insets.Type.systemBars())");
            numArr[0] = Integer.valueOf((currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right);
            numArr[1] = Integer.valueOf((currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom);
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            numArr[0] = Integer.valueOf(displayMetrics.widthPixels);
            numArr[1] = Integer.valueOf(displayMetrics.heightPixels);
        }
        return numArr;
    }

    public final boolean shouldShowRequest(String[] permissions, Activity activity) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        for (String str : permissions) {
            if (ActivityCompat.checkSelfPermission(activity, str) == -1 && !ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) {
                return false;
            }
        }
        return true;
    }

    public final String getString(int res) {
        String string = Injection.INSTANCE.provideApplicationContext().getString(res);
        Intrinsics.checkNotNullExpressionValue(string, "Injection.provideApplica…nContext().getString(res)");
        return string;
    }

    public final String getString(int res, int i) {
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = Injection.INSTANCE.provideApplicationContext().getString(res);
            Intrinsics.checkNotNullExpressionValue(string, "Injection.provideApplica…nContext().getString(res)");
            String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String getString(int res, String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string2 = Injection.INSTANCE.provideApplicationContext().getString(res);
            Intrinsics.checkNotNullExpressionValue(string2, "Injection.provideApplica…nContext().getString(res)");
            String str = String.format(string2, Arrays.copyOf(new Object[]{string}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            return str;
        } catch (Exception unused) {
            return "";
        }
    }
}
