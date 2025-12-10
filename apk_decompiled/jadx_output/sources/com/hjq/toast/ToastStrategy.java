package com.hjq.toast;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.hjq.toast.config.IToast;
import com.hjq.toast.config.IToastStrategy;
import com.hjq.toast.config.IToastStyle;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class ToastStrategy implements IToastStrategy {
    private static final int DELAY_TIMEOUT = 200;
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());
    private ActivityStack mActivityStack;
    private Application mApplication;
    private volatile CharSequence mLatestText;
    private WeakReference<IToast> mToastReference;
    private IToastStyle<?> mToastStyle;
    private final Runnable mShowRunnable = new Runnable() { // from class: com.hjq.toast.ToastStrategy.1
        @Override // java.lang.Runnable
        public void run() {
            IToast iToast = ToastStrategy.this.mToastReference != null ? (IToast) ToastStrategy.this.mToastReference.get() : null;
            if (iToast != null) {
                iToast.cancel();
            }
            ToastStrategy toastStrategy = ToastStrategy.this;
            IToast iToastCreateToast = toastStrategy.createToast(toastStrategy.mApplication);
            ToastStrategy.this.mToastReference = new WeakReference(iToastCreateToast);
            ToastStrategy toastStrategy2 = ToastStrategy.this;
            iToastCreateToast.setDuration(toastStrategy2.getToastDuration(toastStrategy2.mLatestText));
            iToastCreateToast.setText(ToastStrategy.this.mLatestText);
            iToastCreateToast.show();
        }
    };
    private final Runnable mCancelRunnable = new Runnable() { // from class: com.hjq.toast.ToastStrategy.2
        @Override // java.lang.Runnable
        public void run() {
            IToast iToast = ToastStrategy.this.mToastReference != null ? (IToast) ToastStrategy.this.mToastReference.get() : null;
            if (iToast == null) {
                return;
            }
            iToast.cancel();
        }
    };

    @Override // com.hjq.toast.config.IToastStrategy
    public void registerStrategy(Application application) {
        this.mApplication = application;
        this.mActivityStack = ActivityStack.register(application);
    }

    @Override // com.hjq.toast.config.IToastStrategy
    public void bindStyle(IToastStyle<?> iToastStyle) {
        this.mToastStyle = iToastStyle;
    }

    @Override // com.hjq.toast.config.IToastStrategy
    public IToast createToast(Application application) {
        IToast systemToast;
        Activity foregroundActivity = this.mActivityStack.getForegroundActivity();
        if (foregroundActivity != null) {
            systemToast = new ActivityToast(foregroundActivity);
        } else if (Build.VERSION.SDK_INT >= 23 && Settings.canDrawOverlays(application)) {
            systemToast = new WindowToast(application);
        } else if (Build.VERSION.SDK_INT == 25) {
            systemToast = new SafeToast(application);
        } else if (Build.VERSION.SDK_INT < 29 && !areNotificationsEnabled(application)) {
            systemToast = new NotificationToast(application);
        } else {
            systemToast = new SystemToast(application);
        }
        if ((systemToast instanceof CustomToast) || Build.VERSION.SDK_INT < 30 || application.getApplicationInfo().targetSdkVersion < 30) {
            systemToast.setView(this.mToastStyle.createView(application));
            systemToast.setGravity(this.mToastStyle.getGravity(), this.mToastStyle.getXOffset(), this.mToastStyle.getYOffset());
            systemToast.setMargin(this.mToastStyle.getHorizontalMargin(), this.mToastStyle.getVerticalMargin());
        }
        return systemToast;
    }

    @Override // com.hjq.toast.config.IToastStrategy
    public void showToast(CharSequence charSequence, long j) {
        this.mLatestText = charSequence;
        Handler handler = HANDLER;
        handler.removeCallbacks(this.mShowRunnable);
        handler.postDelayed(this.mShowRunnable, j + 200);
    }

    @Override // com.hjq.toast.config.IToastStrategy
    public void cancelToast() {
        Handler handler = HANDLER;
        handler.removeCallbacks(this.mCancelRunnable);
        handler.post(this.mCancelRunnable);
    }

    protected int getToastDuration(CharSequence charSequence) {
        return charSequence.length() > 20 ? 1 : 0;
    }

    protected boolean areNotificationsEnabled(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((NotificationManager) context.getSystemService(NotificationManager.class)).areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        try {
            return ((Integer) appOpsManager.getClass().getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) appOpsManager.getClass().getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName())).intValue() == 0;
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException e) {
            e.printStackTrace();
            return true;
        }
    }
}
