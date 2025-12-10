package com.core.base.utils;

import android.view.Window;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PopupWindowUtil.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/core/base/utils/PopupWindowUtil;", "", "()V", "appendHalfDark", "", "window", "Landroid/view/Window;", "removeHalfDark", "base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PopupWindowUtil {
    public static final PopupWindowUtil INSTANCE = new PopupWindowUtil();

    private PopupWindowUtil() {
    }

    public final void appendHalfDark(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.7f;
        window.addFlags(2);
        window.setAttributes(attributes);
    }

    public final void removeHalfDark(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 1.0f;
        window.addFlags(2);
        window.setAttributes(attributes);
    }
}
