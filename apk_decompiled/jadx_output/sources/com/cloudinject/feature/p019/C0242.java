package com.cloudinject.feature.p019;

import android.app.Activity;
import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Intent;
import android.database.C0074;
import android.net.wifi.C0078;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.p025.C0362;
import com.px.C0368;
import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Method;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.net.C0389;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̗̙.̖̗̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0242 {
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static void m2158(Intent intent, Activity activity) {
        Method methodM19 = null;
        String str = "ۣۧۢ";
        Object objM5744 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747928) {
                case 1090:
                case 5501:
                    str = "ۤۧ۠";
                    break;
                case 3138:
                    if (C0400.m5961() > 0) {
                        str = "ۦۤ۟";
                        break;
                    } else {
                        C0279.m2491();
                        break;
                    }
                case 3204:
                    if (C0400.m5961() <= 0) {
                        break;
                    } else {
                        str = "ۣۧۢ";
                        break;
                    }
                case 4453:
                    return;
                case 5497:
                    str = "ۢۤ۟";
                    break;
                case 5680:
                    try {
                        C0420.m6227(methodM19, true);
                        if (C0382.m5180() > 0) {
                            str = "ۧۤۦ";
                            break;
                        } else {
                            C0155.m1294();
                            break;
                        }
                    } catch (Throwable th) {
                        C0025.m109(th);
                        if (C0394.m5672() > 0) {
                            str = "ۥۨۨ";
                            break;
                        } else {
                            C0078.m361();
                            str = "ۨۤۧ";
                            break;
                        }
                    }
                case 6405:
                    if (C0291.m2568() < 0) {
                        str = "ۡۨۡ";
                        break;
                    } else {
                        str = "ۨۥۦ";
                        break;
                    }
                case 7461:
                    methodM19 = C0009.m19(C0060.m194(objM5744), C0385.m5310(C0164.m1373()), new Class[]{Intent.class, Activity.class});
                    if (C0385.m5282() < 0) {
                        str = "ۥۢۥ";
                        break;
                    } else {
                        C0228.m2012();
                        str = "ۥ۠";
                        break;
                    }
                case 27193:
                    objM5744 = C0396.m5744(C0383.m5211());
                    if (C0184.m1524() < 0) {
                        str = "ۣۧۡ";
                        break;
                    } else {
                        C0229.m2064();
                        break;
                    }
                case 28254:
                    if (C0279.m2491() < 0) {
                        str = "ۦۤ۟";
                        break;
                    } else {
                        str = "ۣۨ";
                        break;
                    }
                case 28273:
                    C0397.m5812(methodM19, objM5744, new Object[]{intent, activity});
                    if (C0398.m5833() > 0) {
                        str = "ۢۤ۟";
                        break;
                    } else {
                        C0376.m4906();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̙̖̗̗̙, reason: not valid java name and contains not printable characters */
    public static ClassLoader m2159() {
        String str = "۠ۨۨ";
        BaseDexClassLoader baseDexClassLoader = null;
        Method methodM19 = null;
        Object objM5744 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752454) {
                case 2724:
                    try {
                        objM5744 = C0396.m5744(C0383.m5211());
                        if (C0164.m1359() < 0) {
                            str = "ۨ۟ۤ";
                            break;
                        } else {
                            C0183.m1464();
                            break;
                        }
                    } catch (Throwable th) {
                        C0025.m109(th);
                        return null;
                    }
                case 2958:
                    BaseDexClassLoader baseDexClassLoader2 = (BaseDexClassLoader) C0397.m5812(methodM19, objM5744, new Object[0]);
                    if (C0074.m307() < 0) {
                        str = "ۧۤۧ";
                        baseDexClassLoader = baseDexClassLoader2;
                        break;
                    } else {
                        C0377.m4944();
                        baseDexClassLoader = baseDexClassLoader2;
                        break;
                    }
                case 5727:
                    if (C0395.m5698() < 0) {
                        str = "۠ۨۨ";
                        break;
                    } else {
                        C0384.m5278();
                        str = "ۦۧۢ";
                        break;
                    }
                case 5734:
                    if (C0368.m3171() < 0) {
                        str = "ۣۨۧ";
                        break;
                    } else {
                        C0382.m5180();
                        str = "ۡۧ";
                        break;
                    }
                case 6816:
                    C0420.m6227(methodM19, true);
                    if (C0395.m5698() < 0) {
                        str = "ۣ۟ۤ";
                        break;
                    } else {
                        C0384.m5278();
                        str = "ۥۧۨ";
                        break;
                    }
                case 30027:
                    methodM19 = C0009.m19(C0060.m194(objM5744), C0385.m5310(C0228.m1997()), new Class[0]);
                    if (C0389.m5481() > 0) {
                        str = "۟۠ۧ";
                        break;
                    } else {
                        C0362.m3122();
                        break;
                    }
                case 30764:
                    return baseDexClassLoader;
                case 31821:
                    if (C0397.m5814() > 0) {
                        str = "ۧۤۧ";
                        break;
                    } else {
                        C0183.m1464();
                        break;
                    }
                case 31981:
                    if (C0378.m4998() > 0) {
                        str = "ۣۨۧ";
                        break;
                    } else {
                        C0378.m4998();
                        break;
                    }
            }
        }
    }
}
