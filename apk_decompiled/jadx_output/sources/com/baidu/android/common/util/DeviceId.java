package com.baidu.android.common.util;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.baidu.mobstat.bl;
import com.baidu.mobstat.bq;
import com.baidu.mobstat.br;
import com.baidu.mobstat.bu;
import com.baidu.mobstat.bv;
import com.baidu.mobstat.bw;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class DeviceId {
    private static final String a = "DeviceId";
    private static final boolean b = false;
    private static bw.a d = null;
    private static volatile DeviceId g = null;
    private static CuidChangeCallback i = null;
    public static boolean sDataCuidInfoShable = true;
    private final Context c;
    private bw e;
    private bv f;
    private bl h;
    private Executor j = new ThreadPoolExecutor(0, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public interface CuidChangeCallback {
        void onCuidChanged(String str, String str2, CuidChangeReceivedCallback cuidChangeReceivedCallback);
    }

    public interface CuidChangeReceivedCallback {
        void onCuidChangeReceived();
    }

    private DeviceId(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.h = new bl();
        this.e = new bw(applicationContext, new bq(applicationContext), this.h);
        this.f = new bv(applicationContext, this.h);
    }

    static DeviceId a(Context context) {
        DeviceId deviceId;
        synchronized (br.class) {
            if (g == null) {
                g = new DeviceId(context);
            }
            deviceId = g;
        }
        return deviceId;
    }

    private bw.a a(String str) {
        return this.e.b(str);
    }

    private bw.a a(String str, String str2) {
        bw.a aVarC = this.e.c(str2);
        return aVarC == null ? b(str, str2) : aVarC;
    }

    private boolean a(bw.a aVar) {
        return (aVar == null || !aVar.d() || TextUtils.isEmpty(aVar.e()) || TextUtils.equals(aVar.e(), bw.b())) ? false : true;
    }

    private static bw.a b(Context context) {
        if (d == null) {
            synchronized (br.class) {
                if (d == null) {
                    SystemClock.uptimeMillis();
                    d = a(context).c();
                    SystemClock.uptimeMillis();
                }
            }
        }
        a(context).d();
        return d;
    }

    private bw.a b(String str, String str2) throws IOException {
        br brVarA = this.f.a(str);
        if (brVarA == null || TextUtils.equals(str2, brVarA.a)) {
            return null;
        }
        return this.e.a(brVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final bw.a aVar) {
        this.j.execute(new Runnable() { // from class: com.baidu.android.common.util.DeviceId.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (br.class) {
                    if (DeviceId.i == null) {
                        return;
                    }
                    DeviceId.this.e.c();
                    try {
                        aVar.a(true);
                        DeviceId.this.e.a(aVar, true, true);
                        CuidChangeCallback unused = DeviceId.i = null;
                    } finally {
                        DeviceId.this.e.d();
                    }
                }
            }
        });
    }

    private bw.a c() {
        this.e.c();
        try {
            bw.a aVarE = e();
            if (!a(aVarE)) {
                if (aVarE == null) {
                    aVarE = a((String) null, (String) null);
                }
                if (aVarE == null) {
                    aVarE = a((String) null);
                }
                c(aVarE);
                return aVarE;
            }
            bw.a aVarA = a((String) null, aVarE.a());
            if (aVarA == null) {
                aVarA = a((String) null);
            }
            aVarA.a(false);
            aVarA.a(aVarE.k());
            c(aVarA);
            return aVarA;
        } catch (Throwable th) {
            this.e.d();
            throw th;
        }
    }

    private synchronized void c(bw.a aVar) {
        this.j.execute(d(aVar));
    }

    private Runnable d(final bw.a aVar) {
        return new Runnable() { // from class: com.baidu.android.common.util.DeviceId.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    DeviceId.this.e(aVar);
                } finally {
                    DeviceId.this.e.d();
                }
            }
        };
    }

    private void d() {
        final bw.a aVar = d;
        if (i == null) {
            return;
        }
        if (aVar == null || aVar.f() || TextUtils.isEmpty(aVar.g())) {
            i = null;
        } else {
            this.j.execute(new Runnable() { // from class: com.baidu.android.common.util.DeviceId.1
                @Override // java.lang.Runnable
                public void run() {
                    if (DeviceId.i == null) {
                        return;
                    }
                    bw.a aVar2 = aVar;
                    if (aVar2 == null || aVar2.f() || TextUtils.isEmpty(aVar.g())) {
                        CuidChangeCallback unused = DeviceId.i = null;
                    } else {
                        DeviceId.i.onCuidChanged(aVar.k(), aVar.g(), new CuidChangeReceivedCallback() { // from class: com.baidu.android.common.util.DeviceId.1.1
                            @Override // com.baidu.android.common.util.DeviceId.CuidChangeReceivedCallback
                            public void onCuidChangeReceived() {
                                DeviceId.this.b(aVar);
                            }
                        });
                    }
                }
            });
        }
    }

    private bw.a e() {
        bw.a aVarF = f();
        return aVarF == null ? g() : aVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(bw.a aVar) throws IOException {
        if (aVar == null) {
            throw new NullPointerException("cuidV270Info should not be null");
        }
        br brVarI = aVar.i();
        if (!aVar.d() || TextUtils.isEmpty(aVar.e())) {
            aVar.h();
        }
        this.e.a(aVar, true, false);
        this.f.a(brVarI);
        this.e.a(aVar);
    }

    private bw.a f() {
        return this.e.a();
    }

    private bw.a g() {
        br brVarB;
        File file = new File(this.c.getFilesDir(), "libcuid.so");
        if (!file.exists() || (brVarB = br.b(bu.a(file))) == null) {
            return null;
        }
        return this.e.a(brVarB);
    }

    public static String getCUID(Context context) {
        return b(context).k();
    }

    public static String getDeviceID(Context context) {
        return b(context).a();
    }

    public static String getOldCUID(Context context) {
        return b(context).g();
    }

    public static boolean isMySelfTrusted(Context context) {
        return a(context).h.a(context.getApplicationContext());
    }

    public static void registerCuidChangeEvent(Context context, CuidChangeCallback cuidChangeCallback) {
        i = cuidChangeCallback;
        b(context);
    }

    @Deprecated
    public static void setCuidDataShable(Context context, boolean z) {
    }

    bw a() {
        return this.e;
    }
}
