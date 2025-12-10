package com.core.base.utils;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.hjq.toast.ToastStrategy;
import com.hjq.toast.ToastUtils;
import com.hjq.toast.style.BlackToastStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ToastUtil.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/core/base/utils/ToastUtil;", "", "()V", "hasInit", "", "init", "", "application", "Landroid/app/Application;", "show", "context", "Landroid/content/Context;", "text", "", TypedValues.TransitionType.S_DURATION, "", "base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ToastUtil {
    public static final ToastUtil INSTANCE = new ToastUtil();
    private static boolean hasInit;

    private ToastUtil() {
    }

    public final void init(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        ToastUtils.init(application);
        ToastUtils.setStrategy(new ToastStrategy() { // from class: com.core.base.utils.ToastUtil.init.1
            @Override // com.hjq.toast.ToastStrategy
            protected int getToastDuration(CharSequence text) {
                return 0;
            }
        });
        ToastUtils.setStyle(new BlackToastStyle() { // from class: com.core.base.utils.ToastUtil.init.2
            @Override // com.hjq.toast.style.BlackToastStyle, com.hjq.toast.config.IToastStyle
            public int getGravity() {
                return 17;
            }

            @Override // com.hjq.toast.style.BlackToastStyle
            protected int getMaxLines(Context context) {
                return 32;
            }

            @Override // com.hjq.toast.style.BlackToastStyle, com.hjq.toast.config.IToastStyle
            public int getYOffset() {
                return SystemUtils.INSTANCE.dp2px(16.0f);
            }
        });
        hasInit = true;
    }

    public final void show(Context context, CharSequence text) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (text != null) {
            show(context, text, 0);
        }
    }

    public final void show(Context context, CharSequence text, int duration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        if (StringsKt.isBlank(text)) {
            return;
        }
        try {
            if (!hasInit) {
                throw new IllegalStateException("Notification is not enabled, call init(application) method first.".toString());
            }
            ToastUtils.show(text);
        } catch (Exception unused) {
            Toast.makeText(context, text, duration);
        }
    }
}
