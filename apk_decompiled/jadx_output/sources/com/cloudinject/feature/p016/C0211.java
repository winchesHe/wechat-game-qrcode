package com.cloudinject.feature.p016;

import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.SharedPreferences;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0299;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import mirrorb.android.accounts.C0375;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̗.̗, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0211 {

    /* renamed from: ̗̗̖̖̗̗̗, reason: not valid java name and contains not printable characters */
    private static final String f335 = "c";

    /* renamed from: ̗̗̖̙̖̖̗, reason: not valid java name and contains not printable characters */
    private static final String f336 = "a";

    /* renamed from: ̗̗̙̖̖̖̙, reason: not valid java name and contains not printable characters */
    private static final String f337 = "h";

    /* renamed from: ̗̗̙̖̗̙̖, reason: not valid java name and contains not printable characters */
    private static final String f338 = "i";

    /* renamed from: ̗̗̙̗̖̖̖, reason: not valid java name and contains not printable characters */
    private static final String f339 = "e";

    /* renamed from: ̗̗̙̗̖̙̖, reason: not valid java name and contains not printable characters */
    private static final String f340 = "d";

    /* renamed from: ̗̗̙̗̖̙̗, reason: not valid java name and contains not printable characters */
    private static final SharedPreferences f341 = C0370.m3269(C0229.m2043(), C0385.m5310(C0420.m6217()), 0);

    /* renamed from: ̗̗̙̗̙̖̖, reason: not valid java name and contains not printable characters */
    private static final String f342 = "g";

    /* renamed from: ̗̗̙̗̙̙̖, reason: not valid java name and contains not printable characters */
    private static final String f343 = "f";

    /* renamed from: ̗̗̙̗̙̙̗, reason: not valid java name and contains not printable characters */
    private static final String f344 = "j";

    /* renamed from: ̗̗̙̙̗̗̙, reason: not valid java name and contains not printable characters */
    private static final String f345 = "b";

    public static String getHost() {
        String strM467 = null;
        String str = "ۤۦۣ";
        String strM3195 = null;
        C0299 c0299M5723 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751778) {
                case 67:
                    c0299M5723 = C0396.m5723();
                    if (C0370.m3284() < 0) {
                        str = "۠ۦۧ";
                        break;
                    } else {
                        C0391.m5571();
                        break;
                    }
                case 224:
                    strM467 = C0083.m467(c0299M5723, C0385.m5310(C0369.m3230()), strM3195);
                    str = "ۧۤ۟";
                    break;
                case 4419:
                    strM3195 = C0368.m3195();
                    str = "ۤۡ۟";
                    break;
                case 30848:
                    if (C0228.m2012() <= 0) {
                        break;
                    } else {
                        str = "ۤۦۣ";
                        break;
                    }
                case 32576:
                    return C0083.m467(C0396.m5723(), C0385.m5310(C0388.m5421()), strM467);
            }
        }
    }

    public static String getImei() {
        return C0229.m2053(m1863(), C0385.m5310(C0383.m5208()), C0383.m5220());
    }

    public static String getPassword() {
        return C0229.m2053(m1863(), C0385.m5310(C0391.m5546()), C0383.m5220());
    }

    public static void setHost(String str) {
        String str2 = "ۨۢ۠";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56297) {
                case 1708620:
                    if (C0060.m216() > 0) {
                        str2 = "ۨۢ۠";
                        break;
                    } else {
                        C0395.m5698();
                        break;
                    }
                case 1708751:
                    C0384.m5243(C0387.m5402(C0183.m1500(m1863()), C0385.m5310(C0370.m3298()), str));
                    if (C0279.m2491() < 0) {
                        str2 = "ۨ۠ۧ";
                        break;
                    } else {
                        C0089.m592();
                        break;
                    }
                case 1708806:
                    C0395.m5710();
                    if (C0375.m4840() < 0) {
                        str2 = "ۣۤۢ";
                        break;
                    } else {
                        C0396.m5741();
                        break;
                    }
                case 1731912:
                    return;
            }
        }
    }

    public static void setPassword(String str) {
        String str2 = "ۣ۠ۨ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755437) {
                case 2249:
                    return;
                case 25096:
                    if (C0382.m5180() > 0) {
                        str2 = "ۣ۠ۨ";
                        break;
                    } else {
                        C0395.m5698();
                        str2 = "ۥۥ۠";
                        break;
                    }
                case 25334:
                    C0384.m5243(C0387.m5402(C0183.m1500(m1863()), C0385.m5310(C0391.m5546()), str));
                    if (C0387.m5374() < 0) {
                        str2 = "ۦۤۢ";
                        break;
                    } else {
                        C0377.m4944();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̖̖̗, reason: not valid java name and contains not printable characters */
    public static void m1848(String str) {
        String str2 = "ۥۤۤ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1748797) {
                case 4376:
                    C0384.m5243(C0387.m5402(C0183.m1500(m1863()), C0385.m5310(C0083.m431()), str));
                    str2 = "ۦۡۡ";
                    break;
                case 27934:
                    if (C0025.m118() > 0) {
                        str2 = "ۥۤۤ";
                        break;
                    } else {
                        str2 = "ۣ۟ۥ";
                        break;
                    }
                case 28347:
                    return;
            }
        }
    }

    /* renamed from: ̖̖̙, reason: not valid java name and contains not printable characters */
    public static void m1849(String str) {
        String str2 = "ۣۨۤ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1752487) {
                case 5852:
                    if (C0179.m1427() > 0) {
                        str2 = "ۣۨۤ";
                        break;
                    } else {
                        C0082.m410();
                        str2 = "ۣۢۡ";
                        break;
                    }
                case 5984:
                    return;
                case 29934:
                    C0384.m5243(C0387.m5402(C0183.m1500(m1863()), C0385.m5310(C0386.m5356()), str));
                    if (C0368.m3171() < 0) {
                        str2 = "۠۟ۦ";
                        break;
                    } else {
                        C0377.m4944();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̖̙̗, reason: not valid java name and contains not printable characters */
    public static void m1850(String str) {
        String strM1316 = null;
        String str2 = "ۤۦۨ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1750662) {
                case 389:
                    str2 = "ۤۦۨ";
                    break;
                case 1260:
                    return;
                case 3104:
                    strM1316 = C0155.m1316(str);
                    str2 = "ۧ۟ۧ";
                    break;
                case 29577:
                    C0384.m5243(C0387.m5402(C0183.m1500(m1863()), C0385.m5310(C0279.m2482()), strM1316));
                    str2 = "ۢ۠ۨ";
                    break;
            }
        }
    }

    /* renamed from: ̗̖̖̖̗̗, reason: not valid java name and contains not printable characters */
    public static String m1851() {
        return C0400.m5945(C0229.m2053(m1863(), C0385.m5310(C0279.m2482()), C0383.m5220()));
    }

    /* renamed from: ̗̖̖̗̖̖, reason: not valid java name and contains not printable characters */
    public static String m1852() {
        return C0229.m2053(m1863(), C0385.m5310(C0386.m5356()), C0385.m5310(C0387.m5410()));
    }

    /* renamed from: ̗̖̖̗̖̗, reason: not valid java name and contains not printable characters */
    public static String m1853() {
        String strM467 = null;
        String str = "ۣۢۨ";
        String strM5137 = null;
        C0299 c0299M5723 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56511) {
                case 1709562:
                    strM5137 = C0381.m5137();
                    if (C0378.m4998() <= 0) {
                        break;
                    } else {
                        str = "ۦ۠ۨ";
                        break;
                    }
                case 1711569:
                    strM467 = C0083.m467(c0299M5723, C0385.m5310(C0369.m3263()), strM5137);
                    if (C0377.m4944() > 0) {
                        str = "ۥ۟۠";
                        break;
                    } else {
                        str = "ۡۡ۟";
                        break;
                    }
                case 1728825:
                    return C0083.m467(C0396.m5723(), C0385.m5310(C0387.m5367()), strM467);
                case 1732216:
                    c0299M5723 = C0396.m5723();
                    if (C0179.m1427() > 0) {
                        str = "ۣۨ۠";
                        break;
                    } else {
                        C0391.m5571();
                        break;
                    }
                case 1735428:
                    if (C0184.m1524() < 0) {
                        str = "ۣۢۨ";
                        break;
                    } else {
                        C0381.m5127();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̙̖̗̖̗, reason: not valid java name and contains not printable characters */
    public static int m1854() {
        return C0291.m2557(m1863(), C0385.m5310(C0370.m3309()), 0);
    }

    /* renamed from: ̗̙̙̗̖̖, reason: not valid java name and contains not printable characters */
    public static void m1855() {
        int iM3189 = 0;
        String str = "ۣۧۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755433) {
                case 2848:
                    C0384.m5243(C0392.m5592(C0183.m1500(m1863()), C0385.m5310(C0370.m3309()), 0 - ((0 - iM3189) - 1)));
                    if (C0396.m5741() >= 0) {
                        break;
                    } else {
                        str = "ۣۣۤ";
                        break;
                    }
                case 3168:
                    iM3189 = C0368.m3189();
                    if (C0078.m361() > 0) {
                        str = "ۦۥۨ";
                        break;
                    } else {
                        C0385.m5282();
                        str = "ۦ۟ۥ";
                        break;
                    }
                case 32651:
                    return;
                case 1709334:
                    str = "ۣۧۡ";
                    break;
            }
        }
    }

    /* renamed from: ̗̙̙̗̖̗, reason: not valid java name and contains not printable characters */
    public static String m1856() {
        return C0229.m2053(m1863(), C0385.m5310(C0369.m3243()), C0383.m5220());
    }

    /* renamed from: ̗̙̙̗̙̗, reason: not valid java name and contains not printable characters */
    public static String m1857() {
        return C0229.m2053(m1863(), C0385.m5310(C0083.m431()), C0383.m5220());
    }

    /* renamed from: ̗̙̙̗̙̙, reason: not valid java name and contains not printable characters */
    public static String m1858() {
        return C0229.m2053(m1863(), C0385.m5310(C0386.m5345()), C0383.m5220());
    }

    /* renamed from: ̙̖̖, reason: not valid java name and contains not printable characters */
    public static void m1859(String str) {
        String str2 = "ۥۦۣ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753540) {
                case 139:
                    return;
                case 1230:
                    str2 = "ۥۦۣ";
                    break;
                case 27429:
                    C0395.m5710();
                    str2 = "ۦ۟ۨ";
                    break;
                case 32678:
                    C0384.m5243(C0387.m5402(C0183.m1500(m1863()), C0385.m5310(C0400.m5930()), str));
                    str2 = "۠۠ۡ";
                    break;
            }
        }
    }

    /* renamed from: ̙̗̖, reason: not valid java name and contains not printable characters */
    public static void m1860(String str) {
        String str2 = "ۤۥۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1754438) {
                case 27587:
                    if (C0385.m5282() < 0) {
                        str2 = "ۤۥۦ";
                        break;
                    } else {
                        C0382.m5180();
                        break;
                    }
                case 32707:
                    C0384.m5243(C0387.m5402(C0183.m1500(m1863()), C0385.m5310(C0369.m3243()), str));
                    str2 = "ۤۧۡ";
                    break;
                case 32760:
                    return;
            }
        }
    }

    /* renamed from: ̙̙̗, reason: not valid java name and contains not printable characters */
    public static String m1861(String str) {
        String str2 = "۠ۤۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755555) {
                case 25281:
                    C0384.m5243(C0387.m5402(C0183.m1500(m1863()), C0385.m5310(C0383.m5208()), str));
                    if (C0060.m216() > 0) {
                        str2 = "۠ۢ";
                        break;
                    } else {
                        str2 = "ۨۤ۠";
                        break;
                    }
                case 30635:
                    str2 = "۠ۤۦ";
                    break;
                case 1709473:
                    return str;
            }
        }
    }

    /* renamed from: ̙̙̙, reason: not valid java name and contains not printable characters */
    public static void m1862(String str) {
        String str2 = "ۧ۠ۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1752740) {
                case 4187:
                    C0395.m5710();
                    str2 = "ۣۡۢ";
                    break;
                case 4516:
                    return;
                case 5562:
                    if (C0155.m1294() < 0) {
                        str2 = "ۧ۠ۦ";
                        break;
                    } else {
                        C0370.m3284();
                        str2 = "ۤۢ";
                        break;
                    }
                case 31625:
                    C0384.m5243(C0387.m5402(C0183.m1500(m1863()), C0385.m5310(C0386.m5345()), str));
                    if (C0384.m5278() <= 0) {
                        break;
                    } else {
                        str2 = "ۣۡۡ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m1863() {
        String str = "۠ۢ";
        SharedPreferences sharedPreferences = null;
        SharedPreferences sharedPreferences2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755500) {
                case 389:
                case 30707:
                    str = "ۣۢۥ";
                    continue;
                case 3219:
                    if (C0164.m1359() >= 0) {
                        sharedPreferences = sharedPreferences2;
                    } else {
                        str = "ۣۢۥ";
                        sharedPreferences = sharedPreferences2;
                        continue;
                    }
                case 25483:
                    sharedPreferences2 = f341;
                    if (C0379.m5056() > 0) {
                        str = "ۧۧ۟";
                    } else {
                        continue;
                    }
                case 30573:
                    str = "۠ۢ";
                    continue;
                case 31493:
                    str = "ۣۦ۠";
                    sharedPreferences = null;
                    continue;
                case 31656:
                    return sharedPreferences;
                case 32517:
                    break;
                case 32689:
                    str = "ۨ۠ۡ";
                    continue;
                case 1709422:
                    if (C0398.m5833() < 0) {
                        break;
                    } else {
                        str = "۠۠ۧ";
                    }
                case 1709423:
                    if (C0369.m3256() <= 0) {
                        str = "ۣ۠ۡ";
                    } else {
                        str = "ۢ۠ۧ";
                        continue;
                    }
            }
            str = "ۣ۠";
        }
    }
}
