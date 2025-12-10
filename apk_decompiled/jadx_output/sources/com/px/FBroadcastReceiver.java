package com.px;

import android.app.CryptoBox;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cloudinject.core.utils.C0129;
import com.cloudinject.feature.p019.C0242;

/* loaded from: classes3.dex */
public class FBroadcastReceiver extends BroadcastReceiver {
    private BroadcastReceiver mRealReceiver;

    public FBroadcastReceiver() {
        try {
            this.mRealReceiver = (BroadcastReceiver) C0242.m2159().loadClass(getClass().getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        try {
            C0129.m1042((Class<?>) BroadcastReceiver.class).mo1059(CryptoBox.decrypt("6DDA1554C7397DA638F5BF6A0B3CA362")).mo1062(this.mRealReceiver, pendingResultGoAsync);
            this.mRealReceiver.onReceive(context, intent);
        } catch (Throwable th) {
            th.printStackTrace();
            pendingResultGoAsync.finish();
        }
    }
}
