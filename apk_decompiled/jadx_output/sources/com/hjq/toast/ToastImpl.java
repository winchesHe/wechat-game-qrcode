package com.hjq.toast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;

/* loaded from: classes.dex */
final class ToastImpl {
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());
    private final Runnable mCancelRunnable;
    private boolean mGlobalShow;
    private final String mPackageName;
    private boolean mShow;
    private final Runnable mShowRunnable;
    private final CustomToast mToast;
    private WindowLifecycle mWindowLifecycle;

    ToastImpl(Activity activity, CustomToast customToast) {
        this((Context) activity, customToast);
        this.mGlobalShow = false;
        this.mWindowLifecycle = new WindowLifecycle(activity);
    }

    ToastImpl(Application application, CustomToast customToast) {
        this((Context) application, customToast);
        this.mGlobalShow = true;
        this.mWindowLifecycle = new WindowLifecycle(application);
    }

    private ToastImpl(Context context, CustomToast customToast) {
        this.mShowRunnable = new AnonymousClass1();
        this.mCancelRunnable = new Runnable() { // from class: com.hjq.toast.ToastImpl.2
            @Override // java.lang.Runnable
            public void run() {
                WindowManager windowManager;
                try {
                    try {
                        windowManager = ToastImpl.this.mWindowLifecycle.getWindowManager();
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    }
                    if (windowManager == null) {
                        return;
                    }
                    windowManager.removeViewImmediate(ToastImpl.this.mToast.getView());
                } finally {
                    ToastImpl.this.mWindowLifecycle.unregister();
                    ToastImpl.this.setShow(false);
                }
            }
        };
        this.mToast = customToast;
        this.mPackageName = context.getPackageName();
    }

    boolean isShow() {
        return this.mShow;
    }

    void setShow(boolean z) {
        this.mShow = z;
    }

    void show() {
        if (isShow()) {
            return;
        }
        if (isMainThread()) {
            this.mShowRunnable.run();
            return;
        }
        Handler handler = HANDLER;
        handler.removeCallbacks(this.mShowRunnable);
        handler.post(this.mShowRunnable);
    }

    void cancel() {
        if (isShow()) {
            Handler handler = HANDLER;
            handler.removeCallbacks(this.mShowRunnable);
            if (isMainThread()) {
                this.mCancelRunnable.run();
            } else {
                handler.removeCallbacks(this.mCancelRunnable);
                handler.post(this.mCancelRunnable);
            }
        }
    }

    private boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: com.hjq.toast.ToastImpl$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WindowManager windowManager = ToastImpl.this.mWindowLifecycle.getWindowManager();
            if (windowManager == null) {
                return;
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.height = -2;
            layoutParams.width = -2;
            layoutParams.format = -3;
            layoutParams.flags = 152;
            layoutParams.packageName = ToastImpl.this.mPackageName;
            layoutParams.gravity = ToastImpl.this.mToast.getGravity();
            layoutParams.x = ToastImpl.this.mToast.getXOffset();
            layoutParams.y = ToastImpl.this.mToast.getYOffset();
            layoutParams.verticalMargin = ToastImpl.this.mToast.getVerticalMargin();
            layoutParams.horizontalMargin = ToastImpl.this.mToast.getHorizontalMargin();
            layoutParams.windowAnimations = ToastImpl.this.mToast.getAnimationsId();
            if (ToastImpl.this.mGlobalShow) {
                if (Build.VERSION.SDK_INT >= 26) {
                    layoutParams.type = 2038;
                } else {
                    layoutParams.type = 2003;
                }
            }
            try {
                windowManager.addView(ToastImpl.this.mToast.getView(), layoutParams);
                ToastImpl.HANDLER.postDelayed(new Runnable() { // from class: com.hjq.toast.ToastImpl$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3134lambda$run$0$comhjqtoastToastImpl$1();
                    }
                }, ToastImpl.this.mToast.getDuration() == 1 ? ToastImpl.this.mToast.getLongDuration() : ToastImpl.this.mToast.getShortDuration());
                ToastImpl.this.mWindowLifecycle.register(ToastImpl.this);
                ToastImpl.this.setShow(true);
            } catch (WindowManager.BadTokenException | IllegalStateException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: lambda$run$0$com-hjq-toast-ToastImpl$1, reason: not valid java name */
        /* synthetic */ void m3134lambda$run$0$comhjqtoastToastImpl$1() {
            ToastImpl.this.cancel();
        }
    }
}
