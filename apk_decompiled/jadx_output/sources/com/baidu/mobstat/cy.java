package com.baidu.mobstat;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;
import com.baidu.mobstat.dd;

/* loaded from: classes.dex */
public class cy {
    public static void a(Context context, final db dbVar) {
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        context.bindService(intent, new ServiceConnection() { // from class: com.baidu.mobstat.cy.1
            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                db dbVar2;
                try {
                    dd ddVarA = dd.a.a(iBinder);
                    if (TextUtils.isEmpty(ddVarA.a()) || (dbVar2 = dbVar) == null) {
                        return;
                    }
                    dbVar2.a(ddVarA.a());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 1);
    }
}
