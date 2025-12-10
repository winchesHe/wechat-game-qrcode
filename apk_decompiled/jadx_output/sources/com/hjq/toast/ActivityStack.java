package com.hjq.toast;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class ActivityStack implements Application.ActivityLifecycleCallbacks {
    private Activity mForegroundActivity;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
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

    ActivityStack() {
    }

    static ActivityStack register(Application application) {
        ActivityStack activityStack = new ActivityStack();
        application.registerActivityLifecycleCallbacks(activityStack);
        return activityStack;
    }

    public Activity getForegroundActivity() {
        return this.mForegroundActivity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.mForegroundActivity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.mForegroundActivity != activity) {
            return;
        }
        this.mForegroundActivity = null;
    }
}
