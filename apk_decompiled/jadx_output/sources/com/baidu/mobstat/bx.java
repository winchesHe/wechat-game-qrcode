package com.baidu.mobstat;

import android.content.Context;
import java.lang.Thread;

/* loaded from: classes.dex */
class bx implements Thread.UncaughtExceptionHandler {
    private static final bx a = new bx();
    private Thread.UncaughtExceptionHandler b;
    private Context c;

    public static bx a() {
        return a;
    }

    private bx() {
    }

    public void a(Context context) {
        this.c = context;
        if (this.b == null) {
            this.b = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (!CooperService.instance().isCloseTrace()) {
            ExceptionAnalysis.getInstance().saveCrashInfo(this.c, th, true);
        }
        if (this.b.equals(this)) {
            return;
        }
        this.b.uncaughtException(thread, th);
    }
}
