package com.px;

import android.app.CryptoBox;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;

/* loaded from: classes3.dex */
public class DaemonService extends Service {
    private static final int NOTIFY_ID = (int) (System.currentTimeMillis() / 1000);
    public static final String TAG = "DaemonService";

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        initNotificationManager();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        startService(new Intent(this, (Class<?>) DaemonInnerService.class));
        showNotification();
        return 1;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Log.d(CryptoBox.decrypt("0B7587B223255AD6D8C174B50A852906"), CryptoBox.decrypt("882EA9689C37C66833EB41A87D99D138"));
    }

    private void showNotification() {
        Notification.Builder builder;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(getApplicationContext(), getPackageName() + CryptoBox.decrypt("27282632DE17E5E9"));
        } else {
            builder = new Notification.Builder(getApplicationContext());
        }
        builder.setPriority(2);
        startForeground(NOTIFY_ID, builder.build());
    }

    private void initNotificationManager() {
        NotificationManager notificationManager = (NotificationManager) getSystemService(CryptoBox.decrypt("7A7E53F71C6813491663E1E6B648E727"));
        String str = getPackageName() + CryptoBox.decrypt("27282632DE17E5E9");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, CryptoBox.decrypt("1C1009470E55FCFA"), 4);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(SupportMenu.CATEGORY_MASK);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public class DaemonInnerService extends Service {
        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            Log.i(CryptoBox.decrypt("0B7587B223255AD6D8C174B50A852906"), CryptoBox.decrypt("1ADD19A77E504C1379FE58339DC14F9905F3AC14D2B98D9A6E9A0512C84083AE"));
            super.onCreate();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i, int i2) {
            Log.i(CryptoBox.decrypt("0B7587B223255AD6D8C174B50A852906"), CryptoBox.decrypt("1ADD19A77E504C1379FE58339DC14F9905F3AC14D2B98D9AD56895A0A781DBBCA91A6FE9C315F3B5"));
            ((NotificationManager) getSystemService(CryptoBox.decrypt("7A7E53F71C6813491663E1E6B648E727"))).cancel(DaemonService.NOTIFY_ID);
            stopSelf();
            return super.onStartCommand(intent, i, i2);
        }

        @Override // android.app.Service
        public void onDestroy() {
            Log.i(CryptoBox.decrypt("0B7587B223255AD6D8C174B50A852906"), CryptoBox.decrypt("1ADD19A77E504C1379FE58339DC14F9905F3AC14D2B98D9A5DE884AB7022C4D1"));
            super.onDestroy();
        }
    }
}
