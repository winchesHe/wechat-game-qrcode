package com.hjq.toast;

import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;

/* loaded from: classes.dex */
final class SafeHandler extends Handler {
    private final Handler mHandler;

    SafeHandler(Handler handler) {
        this.mHandler = handler;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            this.mHandler.handleMessage(message);
        } catch (WindowManager.BadTokenException | IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
