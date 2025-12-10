package com.px;

import android.app.CryptoBox;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import com.cloudinject.core.utils.C0129;
import com.cloudinject.feature.p019.C0242;
import com.sadfxg.fasg.App;

/* loaded from: classes3.dex */
public class FService extends Service {
    private Service mRealService;

    public FService() {
        try {
            this.mRealService = (Service) C0242.m2159().loadClass(getClass().getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() {
        try {
            C0129.m1042((Class<?>) Service.class).mo1054(CryptoBox.decrypt("1BB470FD7C2F29C85C3EB743D7F0A5B84E1A8ACC2DAAD605"), Context.class).mo1064(this.mRealService, App.getContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mRealService.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        String strDecrypt = CryptoBox.decrypt("F657BC81DE9DF531");
        init();
        this.mRealService.onCreate();
        try {
            C0129.m1042((Class<?>) Service.class).mo1059(strDecrypt).mo1062(this.mRealService, C0129.m1042((Class<?>) Service.class).mo1059(strDecrypt).get(this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.mRealService.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return this.mRealService.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.mRealService.onDestroy();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mRealService.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mRealService.onLowMemory();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        this.mRealService.onTrimMemory(i);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return this.mRealService.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        this.mRealService.onRebind(intent);
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.mRealService.onTaskRemoved(intent);
    }
}
