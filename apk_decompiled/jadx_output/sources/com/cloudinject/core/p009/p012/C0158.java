package com.cloudinject.core.p009.p012;

import android.content.Intent;
import android.database.C0073;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import com.cloudinject.core.p009.p010.AbstractC0149;
import com.cloudinject.core.p009.p010.InterfaceC0147;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.C0362;
import java.lang.reflect.Method;
import mirrorb.android.accounts.C0376;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

@InterfaceC0147(name = "startActivity")
/* renamed from: com.cloudinject.core.̗.̗̙.̗̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0158 extends AbstractC0149 {
    /* renamed from: ̗̙̖̖̗̗, reason: not valid java name and contains not printable characters */
    private int m1321() {
        String str = "ۡۤۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750633) {
                case 76:
                    return 2;
                case 6476:
                    if (!C0420.m6230()) {
                        break;
                    } else if (C0121.m1023() >= 0) {
                        C0184.m1524();
                    } else {
                        str = "ۥۨ";
                    }
                case 7633:
                    str = "ۡۤۨ";
                    continue;
                case 28745:
                    break;
                case 1731274:
                    return 3;
            }
            if (C0384.m5278() <= 0) {
                C0400.m5961();
            } else {
                str = "ۣ۠ۢ";
            }
        }
    }

    /* renamed from: ۟ۤۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m1322(Object obj) {
        String str = "ۢۤۧ";
        int i = 0;
        int iM1321 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754663) {
                case 942:
                    if (C0334.m2866() <= 0) {
                        C0384.m5278();
                        i = iM1321;
                    } else {
                        str = "ۣۤۡ";
                        i = iM1321;
                        continue;
                    }
                case 26754:
                case 27840:
                    str = "ۣۤۡ";
                    continue;
                case 28922:
                    if (C0398.m5833() <= 0) {
                        C0082.m410();
                    } else {
                        str = "۠۠ۧ";
                        continue;
                    }
                case 29773:
                    if (C0229.m2064() >= 0) {
                        C0184.m1524();
                    } else {
                        str = "ۢۤۧ";
                        continue;
                    }
                case 29890:
                    if (C0396.m5741() > 0) {
                        break;
                    } else {
                        str = "ۤۡۡ";
                    }
                case 29925:
                    if (C0385.m5282() < 0) {
                        str = "ۤۨۧ";
                    } else {
                        continue;
                    }
                case 31723:
                    break;
                case 31777:
                    return i;
                case 31779:
                    iM1321 = ((C0158) obj).m1321();
                    str = "ۣۧۥ";
                    continue;
                case 31940:
                    str = "ۣۦ۠";
                    i = 0;
                    continue;
            }
            str = C0183.m1464() <= 0 ? "ۡۦۧ" : "ۣۣۢ";
        }
    }

    @Override // com.cloudinject.core.p009.p010.AbstractC0149
    /* renamed from: ̙ */
    protected Object mo1233(Object obj, Method method, Object[] objArr) throws Throwable {
        Object obj2 = null;
        Object obj3 = "۟ۨۥ";
        while (true) {
            switch (C0395.m5690(obj3) ^ 1754536) {
                case 1997:
                    return C0397.m5812(method, obj, objArr);
                case 3107:
                    break;
                case 3115:
                    return C0078.m339(0);
                case 28084:
                    obj2 = objArr[m1322(this)];
                    obj3 = "۠ۧۥ";
                    continue;
                case 28182:
                    if (!(obj2 instanceof Intent)) {
                        break;
                    } else if (C0380.m5068() > 0) {
                        obj3 = "ۥۡۦ";
                    }
                case 29676:
                    if (C0382.m5180() <= 0) {
                        C0384.m5278();
                    } else {
                        obj3 = "۟ۨۥ";
                        continue;
                    }
                case 30818:
                    if (C0376.m4906() <= 0) {
                        C0383.m5203();
                    } else {
                        obj3 = "ۤۤۢ";
                        continue;
                    }
                case 32714:
                    if (C0362.m3094(C0073.m245(C0334.m2895())) > 0) {
                        break;
                    } else if (C0397.m5814() <= 0) {
                        C0083.m448();
                    } else {
                        obj3 = "ۨۥ۠";
                    }
            }
            if (C0362.m3122() < 0) {
                obj3 = "ۦۨۧ";
            }
        }
    }
}
