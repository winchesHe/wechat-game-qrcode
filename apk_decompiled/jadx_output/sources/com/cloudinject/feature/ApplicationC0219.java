package com.cloudinject.feature;

import android.app.Application;
import android.app.C0009;
import android.database.C0074;
import android.net.C0083;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p021.C0291;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;

/* renamed from: com.cloudinject.feature.̗̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ApplicationC0219 extends Application {

    /* renamed from: ̗̗̖̖̗̖̖, reason: not valid java name and contains not printable characters */
    private static Application f353;

    /* renamed from: ̗̖̖̖̖̙, reason: not valid java name and contains not printable characters */
    public static Application m1887() {
        return m1888();
    }

    /* renamed from: ۤۥۣۥ, reason: not valid java name and contains not printable characters */
    public static Application m1888() {
        String str = "ۣۡۧ";
        Application application = null;
        Application application2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746814) {
                case 132:
                    if (C0009.m36() < 0) {
                        str = "ۦۧۥ";
                    } else {
                        continue;
                    }
                case 2175:
                    if (C0291.m2568() >= 0) {
                        C0228.m2012();
                        application = application2;
                    } else {
                        str = "ۣۨ";
                        application = application2;
                        continue;
                    }
                case 3239:
                    break;
                case 4376:
                    if (C0394.m5672() <= 0) {
                        C0398.m5833();
                        str = "ۧ۟ۥ";
                    } else {
                        str = "ۣۡۧ";
                        continue;
                    }
                case 4407:
                    if (C0393.m5668() <= 0) {
                        break;
                    } else if (C0380.m5068() <= 0) {
                        C0191.m1627();
                        str = "ۤ۟ۥ";
                    } else {
                        str = "ۦ۠ۥ";
                    }
                case 7544:
                    if (C0388.m5430() <= 0) {
                        str = "ۡ۠۠";
                    } else {
                        str = "ۨۢۨ";
                        continue;
                    }
                case 25914:
                case 26169:
                    if (C0074.m307() >= 0) {
                        C0399.m5914();
                    } else {
                        str = "ۣۨ";
                        continue;
                    }
                case 26133:
                    application2 = f353;
                    if (C0383.m5203() <= 0) {
                        C0384.m5278();
                        str = "ۣۡۢ";
                    } else {
                        str = "ۣۣۡ";
                        continue;
                    }
                case 28240:
                    str = "۟ۧۢ";
                    application = null;
                    continue;
                case 1735451:
                    return application;
            }
            if (C0400.m5961() > 0) {
                str = "ۣۤۡ";
            }
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        String str = "ۣۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56538) {
                case 133:
                    super.onCreate();
                    str = "ۤ۟ۧ";
                    break;
                case 1710526:
                    return;
                case 1729814:
                    f353 = this;
                    if (C0206.m1807() >= 0) {
                        break;
                    } else {
                        str = "ۧۢ۟";
                        break;
                    }
                case 1733824:
                    if (C0083.m448() >= 0) {
                        break;
                    } else {
                        str = "ۣۢ";
                        break;
                    }
            }
        }
    }
}
