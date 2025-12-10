package com.hjq.toast;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;

/* loaded from: classes.dex */
final class WindowLifecycle implements Application.ActivityLifecycleCallbacks {
    private Activity mActivity;
    private Application mApplication;
    private ToastImpl mToastImpl;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    WindowLifecycle(Activity activity) {
        this.mActivity = activity;
    }

    WindowLifecycle(Application application) {
        this.mApplication = application;
    }

    public WindowManager getWindowManager() {
        if (this.mActivity != null) {
            if (this.mActivity.isDestroyed()) {
                return null;
            }
            return this.mActivity.getWindowManager();
        }
        Application application = this.mApplication;
        if (application != null) {
            return (WindowManager) application.getSystemService("window");
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ToastImpl toastImpl;
        if (this.mActivity == activity && (toastImpl = this.mToastImpl) != null) {
            toastImpl.cancel();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.mActivity != activity) {
            return;
        }
        ToastImpl toastImpl = this.mToastImpl;
        if (toastImpl != null) {
            toastImpl.cancel();
        }
        unregister();
        this.mActivity = null;
    }

    void register(ToastImpl toastImpl) {
        this.mToastImpl = toastImpl;
        if (this.mActivity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.mActivity.registerActivityLifecycleCallbacks(this);
        } else {
            this.mActivity.getApplication().registerActivityLifecycleCallbacks(this);
        }
    }

    void unregister() {
        this.mToastImpl = null;
        if (this.mActivity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.mActivity.unregisterActivityLifecycleCallbacks(this);
        } else {
            this.mActivity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }
}
