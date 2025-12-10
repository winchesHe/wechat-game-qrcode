package com.hjq.toast;

import android.app.Activity;

/* loaded from: classes.dex */
public class ActivityToast extends CustomToast {
    private final ToastImpl mToastImpl;

    public ActivityToast(Activity activity) {
        this.mToastImpl = new ToastImpl(activity, (CustomToast) this);
    }

    @Override // com.hjq.toast.config.IToast
    public void show() {
        this.mToastImpl.show();
    }

    @Override // com.hjq.toast.config.IToast
    public void cancel() {
        this.mToastImpl.cancel();
    }
}
