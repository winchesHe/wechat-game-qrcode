package com.cloudinject.feature.p019;

import android.arch.p003.p005.C0060;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.graphics.drawable.C0086;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.p025.C0362;
import com.sadfxg.fasg.C0369;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;

/* renamed from: com.cloudinject.feature.̗̙.̗̙̙̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
class C0265 extends BroadcastReceiver {
    C0265() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str = "ۧۤ۟";
        int iIntValue = 0;
        Intent intentM181 = null;
        Object[] objArr = null;
        int iIntValue2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753667) {
                case 1839:
                    if (C0369.m3256() > 0) {
                        str = "ۢۡۡ";
                        break;
                    } else {
                        str = "۠ۤۥ";
                        break;
                    }
                case 2017:
                    objArr = new Object[2];
                    if (C0392.m5595() <= 0) {
                        break;
                    } else {
                        str = "ۡۧ";
                        break;
                    }
                case 26019:
                    C0390.m5510(context, intentM181);
                    if (C0380.m5068() > 0) {
                        str = "ۢۤ۠";
                        break;
                    } else {
                        C0380.m5068();
                        break;
                    }
                case 26919:
                    C0399.m5894(intentM181, ((iIntValue2 ^ (-1)) & 7459119) | ((-7459120) & iIntValue2));
                    str = "۟ۦۧ";
                    break;
                case 27101:
                    C0377.m4937(C0362.m3126(C0383.m5204()), false);
                    str = "ۣۢۧ";
                    break;
                case 27928:
                    objArr[1] = new Integer(7426351);
                    str = "ۧۢۧ";
                    break;
                case 27939:
                    iIntValue2 = ((Integer) objArr[1]).intValue();
                    str = "۠ۤۨ";
                    break;
                case 28829:
                    return;
                case 28865:
                    str = "ۣۤ";
                    break;
                case 28899:
                    str = "ۧۤ۟";
                    break;
                case 29698:
                    iIntValue = ((Integer) objArr[0]).intValue();
                    if (C0121.m1023() < 0) {
                        str = "ۤۦۨ";
                        break;
                    } else {
                        str = "ۥۨۨ";
                        break;
                    }
                case 29739:
                    intentM181 = C0060.m181(C0086.m511(context), C0397.m5776(context));
                    if (C0392.m5595() <= 0) {
                        break;
                    } else {
                        str = "ۤۤۦ";
                        break;
                    }
                case 30757:
                    C0376.m4918(intentM181, C0383.m5220());
                    if (C0393.m5668() > 0) {
                        str = "ۣۡ۟";
                        break;
                    } else {
                        str = "ۧۥۡ";
                        break;
                    }
                case 30949:
                    C0399.m5894(intentM181, ((iIntValue ^ (-1)) & 8312062) | ((-8312063) & iIntValue));
                    str = "ۡۦۥ";
                    break;
                case 1711672:
                    C0387.m5368(C0377.m4972());
                    str = "۠ۦۤ";
                    break;
                case 1711676:
                    if (C0206.m1807() >= 0) {
                        break;
                    } else {
                        str = "ۤ۟";
                        break;
                    }
                case 1711717:
                    objArr[0] = new Integer(276747518);
                    str = "ۡۦ۠";
                    break;
            }
        }
    }
}
