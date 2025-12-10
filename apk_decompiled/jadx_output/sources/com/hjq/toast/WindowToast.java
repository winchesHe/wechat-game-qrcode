package com.hjq.toast;

import android.app.Application;

/* loaded from: classes.dex */
public class WindowToast extends CustomToast {
    private final ToastImpl mToastImpl;

    public WindowToast(Application application) {
        this.mToastImpl = new ToastImpl(application, (CustomToast) this);
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
