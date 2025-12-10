package com.hjq.toast.config;

import android.app.Application;

/* loaded from: classes.dex */
public interface IToastStrategy {
    void bindStyle(IToastStyle<?> iToastStyle);

    void cancelToast();

    IToast createToast(Application application);

    void registerStrategy(Application application);

    void showToast(CharSequence charSequence, long j);
}
