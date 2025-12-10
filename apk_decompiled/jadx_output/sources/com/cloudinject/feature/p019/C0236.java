package com.cloudinject.feature.p019;

import android.arch.p003.p005.C0060;
import android.content.Context;
import android.content.IntentFilter;
import android.net.C0082;
import androidx.fragment.app.FragmentTransaction;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.p025.p026.C0346;
import com.sadfxg.fasg.C0369;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.location.C0385;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;

@Dex2C
/* renamed from: com.cloudinject.feature.̗̙.̖̖̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0236 {
    /* renamed from: ̗̗̖, reason: not valid java name and contains not printable characters */
    public static void m2104(Context context) {
        IntentFilter intentFilter = null;
        String str = "ۡ۟۠";
        C0265 c0265 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752705) {
                case 840:
                    if (C0229.m2064() < 0) {
                        str = "ۡ۟۠";
                        break;
                    } else {
                        C0387.m5374();
                        break;
                    }
                case 1057:
                    try {
                        C0060.m190(context, c0265, intentFilter);
                        if (C0400.m5961() > 0) {
                            str = "ۦۣ۟";
                            break;
                        } else {
                            C0291.m2568();
                            break;
                        }
                    } catch (Exception e) {
                        if (C0279.m2491() < 0) {
                            str = "ۨۤۢ";
                            break;
                        } else {
                            C0385.m5282();
                            break;
                        }
                    }
                case FragmentTransaction.TRANSIT_FRAGMENT_FADE /* 4099 */:
                    if (C0369.m3256() > 0) {
                        str = "ۡ۟ۥ";
                        break;
                    } else {
                        C0206.m1807();
                        break;
                    }
                case 4102:
                    C0265 c02652 = new C0265();
                    if (C0183.m1464() > 0) {
                        str = "ۣۧۢ";
                        c0265 = c02652;
                        break;
                    } else {
                        C0082.m410();
                        str = "ۣۡۤ";
                        c0265 = c02652;
                        break;
                    }
                case 30528:
                    C0387.m5389(intentFilter, C0385.m5310(C0388.m5425()));
                    if (C0155.m1294() < 0) {
                        str = "ۤۦۢ";
                        break;
                    } else {
                        str = "ۣ۠ۤ";
                        break;
                    }
                case 30636:
                case 30695:
                    if (C0346.m3059() < 0) {
                        str = "ۦۣ۟";
                        break;
                    } else {
                        C0381.m5127();
                        break;
                    }
                case 30662:
                    str = "ۡ۟ۥ";
                    break;
                case 31721:
                    IntentFilter intentFilter2 = new IntentFilter();
                    if (C0399.m5914() > 0) {
                        str = "ۨۧ۠";
                        intentFilter = intentFilter2;
                        break;
                    } else {
                        str = "ۣۣۡ";
                        intentFilter = intentFilter2;
                        break;
                    }
                case 32715:
                    return;
            }
        }
    }
}
