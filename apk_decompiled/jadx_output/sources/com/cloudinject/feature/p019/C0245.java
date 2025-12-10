package com.cloudinject.feature.p019;

import android.arch.p003.p005.C0060;
import android.net.C0082;
import android.net.wifi.C0078;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.RemoteShareInfo;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p021.AbstractC0289;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p021.p022.InterfaceC0275;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.util.concurrent.atomic.AtomicBoolean;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;

/* renamed from: com.cloudinject.feature.̗̙.̖̙̗, reason: contains not printable characters */
/* loaded from: classes6.dex */
class C0245 extends AbstractC0289 {

    /* renamed from: ̗̗̖̗̖̙̙, reason: not valid java name and contains not printable characters */
    final InterfaceC0275 f413;

    /* renamed from: ̗̗̖̗̙̗̗, reason: not valid java name and contains not printable characters */
    final C0246 f414;

    /* renamed from: ̗̗̙̗̗̖̗, reason: not valid java name and contains not printable characters */
    final RemoteShareInfo f415;

    C0245(C0246 c0246, RemoteShareInfo remoteShareInfo, InterfaceC0275 interfaceC0275) {
        this.f414 = c0246;
        this.f415 = remoteShareInfo;
        this.f413 = interfaceC0275;
    }

    /* renamed from: ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m2172(Object obj) {
        String str = "ۧۡ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750531) {
                case 41:
                    C0246.m2185((C0246) obj);
                    if (C0384.m5278() <= 0) {
                        str = "ۦۥۢ";
                    } else {
                        str = "ۢۡۨ";
                        continue;
                    }
                case 1162:
                    return;
                case 4538:
                case 32488:
                    str = "ۢۡۨ";
                    continue;
                case 7491:
                    if (C0155.m1294() >= 0) {
                        C0346.m3059();
                        str = "ۥۨ۠";
                    } else {
                        str = "۟ۥ۟";
                        continue;
                    }
                case 29509:
                    if (C0279.m2491() > 0) {
                        break;
                    } else if (C0369.m3256() > 0) {
                        str = "ۣ۠ۧ";
                    }
                case 30566:
                    break;
                case 1731290:
                    if (C0391.m5571() <= 0) {
                        C0279.m2491();
                    } else {
                        str = "ۧۡ۠";
                        continue;
                    }
            }
            str = "ۣۣ۠";
        }
    }

    /* renamed from: ۟ۡۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static RemoteShareInfo m2173(Object obj) {
        Object obj2 = "ۥۦۥ";
        RemoteShareInfo remoteShareInfo = null;
        RemoteShareInfo remoteShareInfo2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1746812) {
                case 2077:
                    break;
                case 5398:
                    if (C0206.m1807() >= 0) {
                        C0078.m361();
                    } else {
                        obj2 = "ۢ۟";
                        continue;
                    }
                case 6424:
                    if (C0385.m5282() >= 0) {
                        break;
                    } else {
                        obj2 = "ۧۡۤ";
                    }
                case 25142:
                    remoteShareInfo2 = ((C0245) obj).f415;
                    if (C0164.m1359() < 0) {
                        obj2 = "ۣۨ۟";
                    } else {
                        continue;
                    }
                case 25168:
                case 1735489:
                    if (C0381.m5127() <= 0) {
                        C0376.m4906();
                    } else {
                        obj2 = "ۧ۟ۥ";
                        continue;
                    }
                case 25201:
                    return remoteShareInfo;
                case 25300:
                    if (C0400.m5961() > 0) {
                        obj2 = "ۥۦۥ";
                    } else {
                        continue;
                    }
                case 28216:
                    obj2 = "ۧ۟ۥ";
                    remoteShareInfo = remoteShareInfo2;
                    continue;
                case 28278:
                    obj2 = "ۨ۟ۧ";
                    continue;
                case 28588:
                    if (C0086.m500() <= 0) {
                        remoteShareInfo = null;
                    } else {
                        obj2 = "ۢ۠ۨ";
                        remoteShareInfo = null;
                        continue;
                    }
            }
            if (C0164.m1359() >= 0) {
                C0394.m5672();
            } else {
                obj2 = "ۣۨۡ";
            }
        }
    }

    /* renamed from: ۟ۢۦۦۣ, reason: not valid java name and contains not printable characters */
    public static C0246 m2174(Object obj) {
        String str = "ۥۣ";
        C0246 c0246 = null;
        C0246 c02462 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56575) {
                case 97:
                    if (C0089.m592() < 0) {
                        break;
                    } else if (C0368.m3171() < 0) {
                        str = "ۦۢۦ";
                    }
                case 159:
                case 1711544:
                    str = "۠ۨۤ";
                    continue;
                case 1823:
                    str = "ۥۣ";
                    continue;
                case 1709401:
                    str = "ۦ۟۠";
                    continue;
                case 1711445:
                    c02462 = ((C0245) obj).f414;
                    str = "۠ۧ۠";
                    continue;
                case 1731255:
                    if (C0335.m2923() >= 0) {
                        C0394.m5672();
                    } else {
                        str = "ۡۥۨ";
                        continue;
                    }
                case 1733537:
                    break;
                case 1733563:
                    if (C0385.m5282() >= 0) {
                        C0164.m1359();
                        c0246 = null;
                    } else {
                        str = "ۨۦۤ";
                        c0246 = null;
                        continue;
                    }
                case 1734435:
                    return c0246;
                case 1734470:
                    str = "۠ۨۤ";
                    c0246 = c02462;
                    continue;
            }
            str = "ۣۡۦ";
        }
    }

    /* renamed from: ۣ۟ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0275 m2175(Object obj) {
        Object obj2 = "ۧۨۥ";
        InterfaceC0275 interfaceC0275 = null;
        InterfaceC0275 interfaceC02752 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1754598) {
                case 129:
                    if (C0346.m3059() >= 0) {
                        obj2 = "ۣۤۤ";
                    } else {
                        obj2 = "ۧۨۥ";
                        continue;
                    }
                case 141:
                    interfaceC02752 = ((C0245) obj).f413;
                    if (C0383.m5203() > 0) {
                        obj2 = "ۣۣۢ";
                    } else {
                        continue;
                    }
                case 962:
                    if (C0390.m5512() < 0) {
                        break;
                    } else {
                        obj2 = "ۧۢۦ";
                    }
                case 1098:
                case 28253:
                    if (C0368.m3171() >= 0) {
                        C0399.m5914();
                        obj2 = "ۦۧ";
                    } else {
                        obj2 = "ۡۦۨ";
                        continue;
                    }
                case 25209:
                    obj2 = "۟ۢۤ";
                    interfaceC0275 = null;
                    continue;
                case 25223:
                    if (C0388.m5430() <= 0) {
                        obj2 = "ۣۨۡ";
                    } else {
                        obj2 = "۠ۧۢ";
                        continue;
                    }
                case 27269:
                    return interfaceC0275;
                case 28262:
                    obj2 = "۟ۤۤ";
                    continue;
                case 30500:
                    obj2 = "ۡۦۨ";
                    interfaceC0275 = interfaceC02752;
                    continue;
                case 31712:
                    break;
            }
            if (C0399.m5914() <= 0) {
                C0388.m5430();
                obj2 = "ۦۧ۠";
            } else {
                obj2 = "۠ۥۥ";
            }
        }
    }

    /* renamed from: ۟ۧۡۤۧ, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m2176(Object obj) {
        Object obj2 = "ۢۢۦ";
        AtomicBoolean atomicBoolean = null;
        AtomicBoolean atomicBooleanM2192 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1747871) {
                case 34:
                    obj2 = "ۢۢۦ";
                    continue;
                case 1250:
                case 1734528:
                    obj2 = "ۦۡ۠";
                    continue;
                case 4541:
                    break;
                case 4572:
                    if (C0206.m1807() >= 0) {
                        obj2 = "ۨۥۤ";
                        atomicBoolean = atomicBooleanM2192;
                    } else {
                        obj2 = "ۦۡ۠";
                        atomicBoolean = atomicBooleanM2192;
                        continue;
                    }
                case 5439:
                    if (C0389.m5481() > 0) {
                        obj2 = "ۦۦ";
                    } else {
                        continue;
                    }
                case 5689:
                    atomicBooleanM2192 = C0246.m2192((C0246) obj);
                    if (C0082.m410() < 0) {
                        obj2 = "ۣۤۢ";
                    } else {
                        continue;
                    }
                case 6457:
                    if (C0384.m5278() < 0) {
                        break;
                    } else {
                        obj2 = "ۥ۠ۡ";
                    }
                case 27162:
                    return atomicBoolean;
                case 27256:
                    obj2 = "ۣۡۧ";
                    continue;
                case 1734495:
                    if (C0384.m5278() <= 0) {
                        atomicBoolean = null;
                    } else {
                        obj2 = "ۦۤۥ";
                        atomicBoolean = null;
                        continue;
                    }
            }
            if (C0060.m216() <= 0) {
                C0378.m4998();
            } else {
                obj2 = "ۥۣۨ";
            }
        }
    }

    /* renamed from: ۟ۧۢۨۤ, reason: not valid java name and contains not printable characters */
    public static long m2177(Object obj, long j) {
        String str = "ۦۧ۟";
        long j2 = 0;
        long jM2181 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746878) {
                case 2086:
                    if (C0155.m1294() >= 0) {
                        C0191.m1627();
                        j2 = 0;
                    } else {
                        str = "۠۟ۨ";
                        j2 = 0;
                        continue;
                    }
                case 3447:
                    if (C0179.m1427() > 0) {
                        str = "ۤ۠ۨ";
                    } else {
                        continue;
                    }
                case 4030:
                case 7762:
                    str = "ۣۥ۠";
                    continue;
                case 4352:
                    return j2;
                case 4567:
                    break;
                case 7484:
                    str = "ۦۧ۟";
                    continue;
                case 7605:
                    if (C0388.m5430() <= 0) {
                        C0369.m3256();
                        str = "ۣۢ۟";
                    } else {
                        str = "ۡۨ۟";
                        continue;
                    }
                case 7800:
                    if (C0183.m1464() <= 0) {
                        C0390.m5512();
                        j2 = jM2181;
                    } else {
                        str = "ۣۥ۠";
                        j2 = jM2181;
                        continue;
                    }
                case 25016:
                    jM2181 = C0246.m2181((C0246) obj, j);
                    str = "ۤ۟ۡ";
                    continue;
                case 25984:
                    if (C0370.m3284() > 0) {
                        break;
                    } else if (C0393.m5668() > 0) {
                        str = "ۧۧۦ";
                    }
            }
            if (C0387.m5374() < 0) {
                str = "ۤۡۨ";
            }
        }
    }

    /* renamed from: ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static long m2178(Object obj) {
        String str = "ۦۢۡ";
        long j = 0;
        long jM2200 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753543) {
                case 98:
                    if (C0399.m5914() <= 0) {
                        break;
                    } else if (C0179.m1427() <= 0) {
                        C0078.m361();
                        str = "ۥ۠۠";
                    } else {
                        str = "ۣ۟ۥ";
                    }
                case 2272:
                case 2318:
                    str = "۠ۥۦ";
                    continue;
                case 26182:
                    jM2200 = C0246.m2200((C0246) obj);
                    if (C0089.m592() <= 0) {
                        C0385.m5282();
                        str = "ۣۨۢ";
                    } else {
                        str = "ۣۤۨ";
                        continue;
                    }
                case 27206:
                    return j;
                case 28326:
                    break;
                case 29581:
                    if (C0184.m1524() < 0) {
                        str = "ۦۢۡ";
                    } else {
                        continue;
                    }
                case 29602:
                    str = "۠ۧ";
                    continue;
                case 31512:
                    str = "۠ۥۦ";
                    j = jM2200;
                    continue;
                case 1711462:
                    if (C0393.m5668() <= 0) {
                        C0089.m592();
                        str = "ۥۣ۠";
                    } else {
                        str = "ۨ۟۠";
                        continue;
                    }
                case 1711552:
                    str = "ۥۦ";
                    j = 0;
                    continue;
            }
            str = "ۣۢ۠";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016b A[SYNTHETIC] */
    @Override // com.cloudinject.feature.p021.AbstractC0289
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p019.C0245.onStart():void");
    }

    @Override // com.cloudinject.feature.p021.AbstractC0289
    public void onStop() {
        String str = "ۣۢۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752553) {
                case 2959:
                    m2177(m2174(this), C0380.m5072());
                    if (C0385.m5282() < 0) {
                        str = "ۦۨۨ";
                        break;
                    } else {
                        C0370.m3284();
                        str = "ۡۥۣ";
                        break;
                    }
                case 5771:
                    str = "ۣۢۥ";
                    break;
                case 32655:
                    return;
            }
        }
    }
}
