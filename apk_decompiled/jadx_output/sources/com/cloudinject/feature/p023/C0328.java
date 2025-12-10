package com.cloudinject.feature.p023;

import android.content.Context;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.core.graphics.drawable.C0086;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.p025.C0362;
import com.px.C0368;
import com.sadfxg.fasg.C0370;
import mirrorb.android.accounts.C0376;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.providers.C0391;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

@Dex2C
/* renamed from: com.cloudinject.feature.̙̙.̗̙̗̙, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0328 {
    /* renamed from: ̖̗̙, reason: not valid java name and contains not printable characters */
    public static boolean m2816(Context context) {
        String str = "۟ۧۦ";
        boolean zM2822 = false;
        boolean zM2821 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755522) {
                case 143:
                    return true;
                case 25117:
                    zM2822 = m2822(context);
                    if (C0164.m1359() < 0) {
                        str = "ۥۢ۠";
                    } else {
                        continue;
                    }
                case 28284:
                    zM2821 = m2821(context);
                    if (C0382.m5180() <= 0) {
                        C0376.m4906();
                    } else {
                        str = "۠ۦۥ";
                        continue;
                    }
                case 29446:
                    return false;
                case 29738:
                    break;
                case 29793:
                    if (zM2821) {
                        break;
                    } else if (C0164.m1359() >= 0) {
                        C0362.m3122();
                        str = "ۣۨۢ";
                    } else {
                        str = "ۥۢۡ";
                    }
                case 29798:
                    if (zM2822) {
                        break;
                    } else if (C0368.m3171() < 0) {
                        str = "ۤۥۥ";
                    }
                case 31686:
                    if (C0179.m1427() <= 0) {
                        C0074.m307();
                    } else {
                        str = "۟ۧۦ";
                        continue;
                    }
            }
            if (C0228.m2012() > 0) {
                str = "ۨۡۦ";
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0009 A[SYNTHETIC] */
    /* renamed from: ̗̙̗̗̗̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2817() {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.C0328.m2817():boolean");
    }

    /* renamed from: ̙̗̗, reason: not valid java name and contains not printable characters */
    private static boolean m2818(Context context) {
        NetworkInfo networkInfoM5141 = null;
        String str = "ۤۤۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754530) {
                case 1228:
                    break;
                case 29675:
                    if (C0368.m3171() >= 0) {
                        C0383.m5203();
                    } else {
                        str = "ۤۤۢ";
                        continue;
                    }
                case 30393:
                    if (networkInfoM5141 == null) {
                        break;
                    } else {
                        str = "ۤۦۥ";
                    }
                case 30695:
                    return false;
                case 30790:
                    return true;
                case 32513:
                    if (!C0086.m520(networkInfoM5141)) {
                        break;
                    } else if (C0384.m5278() <= 0) {
                        C0391.m5571();
                        str = "ۡۢۤ";
                    } else {
                        str = "ۥۢۡ";
                    }
                case 32704:
                    networkInfoM5141 = C0381.m5141((ConnectivityManager) C0420.m6229(context, C0385.m5310(C0183.m1491())), 1);
                    str = "ۢۦ۟";
                    continue;
            }
            if (C0398.m5833() <= 0) {
                C0073.m265();
            } else {
                str = "ۢ۟ۢ";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0028. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x018f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x001f A[SYNTHETIC] */
    /* renamed from: ̙̗̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2819(android.content.Context r20) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.C0328.m2819(android.content.Context):boolean");
    }

    /* renamed from: ̙̙̙, reason: not valid java name and contains not printable characters */
    private static boolean m2820(Context context) {
        NetworkInfo networkInfoM5141 = null;
        String str = "ۢۦۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56291) {
                case 1955:
                    if (C0385.m5282() >= 0) {
                        str = "ۨۡ۟";
                    } else {
                        str = "ۢۦۨ";
                        continue;
                    }
                case 1710562:
                    return true;
                case 1730759:
                    networkInfoM5141 = C0381.m5141((ConnectivityManager) C0420.m6229(context, C0385.m5310(C0183.m1491())), 0);
                    str = "ۢۥۦ";
                    continue;
                case 1730784:
                    if (networkInfoM5141 == null) {
                        break;
                    } else {
                        str = "ۡۡ۠";
                    }
                case 1730954:
                    break;
                case 1733923:
                    if (!C0086.m520(networkInfoM5141)) {
                        break;
                    } else if (C0073.m265() <= 0) {
                        C0086.m500();
                    } else {
                        str = "ۦۥ۠";
                    }
                case 1735773:
                    return false;
            }
            str = "۟ۥۤ";
        }
    }

    /* renamed from: ۟ۤ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2821(Object obj) {
        String str = "ۣۡۨ";
        boolean z = false;
        boolean zM2820 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754379) {
                case 162:
                    if (C0279.m2491() >= 0) {
                        str = "ۡۥۤ";
                    } else {
                        str = "ۣۡۨ";
                        continue;
                    }
                case 777:
                    break;
                case 1158:
                case 32545:
                    if (C0389.m5481() <= 0) {
                        C0183.m1464();
                    } else {
                        str = "ۤۤۧ";
                        continue;
                    }
                case 25167:
                    str = "ۡۥۤ";
                    z = false;
                    continue;
                case 27211:
                    if (C0385.m5282() >= 0) {
                        C0380.m5068();
                    } else {
                        str = "ۤۢۨ";
                        continue;
                    }
                case 28617:
                    str = "ۤۤۧ";
                    z = zM2820;
                    continue;
                case 28649:
                    str = "۟ۡۦ";
                    continue;
                case 29505:
                    if (C0380.m5068() < 0) {
                        break;
                    } else if (C0397.m5814() > 0) {
                        str = "ۨ۠";
                    }
                case 32620:
                    return z;
                case 1710579:
                    zM2820 = m2820((Context) obj);
                    str = "۠۟ۡ";
                    continue;
            }
            if (C0391.m5571() <= 0) {
                C0387.m5374();
            } else {
                str = "۠۠ۢ";
            }
        }
    }

    /* renamed from: ۡۢۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2822(Object obj) {
        Object obj2 = "ۣۡۧ";
        boolean z = false;
        boolean zM2818 = false;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1754444) {
                case 179:
                    obj2 = "ۦۢۡ";
                    continue;
                case 1257:
                case 28272:
                    if (C0385.m5282() >= 0) {
                        C0384.m5278();
                    } else {
                        obj2 = "ۡۧ";
                        continue;
                    }
                case 1896:
                    if (C0082.m410() >= 0) {
                        z = zM2818;
                    } else {
                        obj2 = "ۡۧ";
                        z = zM2818;
                        continue;
                    }
                case 27209:
                    if (C0376.m4906() < 0) {
                        break;
                    } else {
                        obj2 = "۠ۦۢ";
                    }
                case 28368:
                    zM2818 = m2818((Context) obj);
                    if (C0400.m5961() <= 0) {
                        C0382.m5180();
                    } else {
                        obj2 = "ۦۦۤ";
                        continue;
                    }
                case 28402:
                    if (C0399.m5914() <= 0) {
                        obj2 = "۠۠۠";
                    } else {
                        obj2 = "ۣۡۧ";
                        continue;
                    }
                case 30471:
                    if (C0383.m5203() <= 0) {
                        C0370.m3284();
                    } else {
                        obj2 = "ۥۥۤ";
                        continue;
                    }
                case 31496:
                    if (C0420.m6215() >= 0) {
                        C0228.m2012();
                        z = false;
                    } else {
                        obj2 = "ۧۧ۟";
                        z = false;
                        continue;
                    }
                case 31688:
                    break;
                case 1710442:
                    return z;
            }
            if (C0387.m5374() < 0) {
                obj2 = "ۢ۟ۨ";
            }
        }
    }
}
