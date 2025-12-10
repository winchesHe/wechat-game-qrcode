package com.cloudinject.core.p009.p012;

import android.net.wifi.C0078;
import android.os.IBinder;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p010.AbstractC0148;
import com.cloudinject.core.p009.p010.InterfaceC0145;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import mirrorb.android.location.C0385;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;

@InterfaceC0145({C0157.class})
/* renamed from: com.cloudinject.core.̗.̗̙.̙̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0161 extends AbstractC0148 {
    public static final String TAG = "ActivityTaskManager";

    public C0161() {
        super((IBinder) C0078.m358(C0184.m1505(), new Object[]{C0385.m5310(C0395.m5689())}));
    }

    /* renamed from: ۡۨۦۧ, reason: not valid java name and contains not printable characters */
    public static void m1323(Object obj, Object obj2) {
        String str = "۠ۡۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56574) {
                case 1709433:
                    return;
                case 1709555:
                    break;
                case 1710359:
                    ((C0161) obj).m1230((String) obj2);
                    if (C0393.m5668() <= 0) {
                        C0394.m5672();
                        str = "ۤ۟";
                    } else {
                        str = "ۨۥۤ";
                        continue;
                    }
                case 1731075:
                    if (C0279.m2491() < 0) {
                        str = "ۢۥۧ";
                    } else {
                        continue;
                    }
                case 1732602:
                case 1734525:
                    if (C0370.m3284() >= 0) {
                        C0368.m3171();
                    } else {
                        str = "ۨۥۤ";
                        continue;
                    }
                case 1734204:
                    if (C0368.m3171() < 0) {
                        str = "۠ۡۥ";
                    } else {
                        continue;
                    }
                case 1734650:
                    if (C0089.m592() < 0) {
                        break;
                    } else if (C0183.m1464() <= 0) {
                        C0369.m3256();
                    } else {
                        str = "ۧۦۨ";
                    }
            }
            str = "ۣۧۡ";
        }
    }

    @Override // com.cloudinject.core.p009.p010.InterfaceC0150
    /* renamed from: ̗̖̙̙̙̗ */
    public boolean mo1234() {
        return false;
    }

    @Override // com.cloudinject.core.p009.p010.AbstractC0144
    /* renamed from: ̗̙̖̖̙̙ */
    protected Object mo1224() {
        return C0078.m358(C0183.m1475(), new Object[]{C0078.m358(C0184.m1505(), new Object[]{C0385.m5310(C0395.m5689())})});
    }

    @Override // com.cloudinject.core.p009.p010.InterfaceC0150
    /* renamed from: ̗̙̙̙̖̗ */
    public void mo1235() {
    }

    @Override // com.cloudinject.core.p009.p010.AbstractC0144
    /* renamed from: ̙ */
    protected void mo1227(Object obj, Object obj2) {
        String str = "۟ۢۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746780) {
                case 63:
                    m1323(this, C0385.m5310(C0395.m5689()));
                    if (C0291.m2568() < 0) {
                        str = "ۡ۠ۤ";
                        break;
                    } else {
                        C0334.m2866();
                        str = "۟ۢۨ";
                        break;
                    }
                case 2553:
                    return;
                case 7860:
                    if (C0390.m5512() > 0) {
                        str = "۟ۢۦ";
                        break;
                    } else {
                        C0089.m592();
                        break;
                    }
            }
        }
    }
}
