package com.cloudinject.feature.p018;

import android.app.C0009;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0190;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.feature.p023.p024.AbstractC0307;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;

/* renamed from: com.cloudinject.feature.̗̗.̙̙, reason: contains not printable characters */
/* loaded from: classes6.dex */
class RunnableC0227 implements Runnable {

    /* renamed from: ̗̗̖̗̗̗̖, reason: not valid java name and contains not printable characters */
    final AbstractC0307 f375;

    /* renamed from: ̗̗̗̖̖̙̖, reason: not valid java name and contains not printable characters */
    final ExecutorService f376;

    /* renamed from: ̗̗̗̖̙̗̖, reason: not valid java name and contains not printable characters */
    final C0222 f377;

    /* renamed from: ̗̗̗̖̙̙̗, reason: not valid java name and contains not printable characters */
    final C0190 f378;

    /* renamed from: ̗̗̗̙̖̖̗, reason: not valid java name and contains not printable characters */
    final List f379;

    /* renamed from: ̗̗̙̗̗̙̗, reason: not valid java name and contains not printable characters */
    final long f380;

    /* renamed from: ̗̗̙̗̗̙̙, reason: not valid java name and contains not printable characters */
    final AtomicInteger f381;

    RunnableC0227(C0222 c0222, C0190 c0190, long j, AbstractC0307 abstractC0307, ExecutorService executorService, AtomicInteger atomicInteger, List list) {
        this.f377 = c0222;
        this.f378 = c0190;
        this.f380 = j;
        this.f375 = abstractC0307;
        this.f376 = executorService;
        this.f381 = atomicInteger;
        this.f379 = list;
    }

    /* renamed from: ۣ۟۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static C0190 m1966(Object obj) {
        String str = "ۣۤ۠";
        C0190 c0190 = null;
        C0190 c0190M1922 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746811) {
                case 4:
                    str = "۟ۨۧ";
                    continue;
                case 88:
                    return c0190;
                case 3194:
                case 25913:
                    if (C0164.m1359() < 0) {
                        str = "۟۠ۤ";
                    } else {
                        continue;
                    }
                case 3941:
                    if (C0082.m410() >= 0) {
                        C0379.m5056();
                        str = "۟ۨ";
                        c0190 = null;
                    } else {
                        str = "ۦ۠ۥ";
                        c0190 = null;
                        continue;
                    }
                case 5425:
                    break;
                case 7482:
                    if (C0083.m448() > 0) {
                        break;
                    } else {
                        str = C0086.m500() <= 0 ? "ۧ۟۠" : "ۧ۟ۥ";
                    }
                case 25206:
                    c0190M1922 = C0222.m1922((C0222) obj);
                    str = "ۦۢۧ";
                    continue;
                case 26128:
                    if (C0385.m5282() >= 0) {
                        C0397.m5814();
                    } else {
                        str = "ۦۣۧ";
                        continue;
                    }
                case 26320:
                    str = "۟۠ۤ";
                    c0190 = c0190M1922;
                    continue;
                case 1735833:
                    str = "ۣۤ۠";
                    continue;
            }
            if (C0183.m1464() > 0) {
                str = "ۣۣ۟";
            }
        }
    }

    /* renamed from: ۟ۡ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static C0222 m1967(Object obj) {
        String str = "ۨۤۦ";
        C0222 c0222 = null;
        C0222 c02222 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753635) {
                case 1929:
                case 28959:
                    if (C0279.m2491() >= 0) {
                        C0380.m5068();
                        str = "ۣۧۨ";
                    } else {
                        str = "۟ۨۧ";
                        continue;
                    }
                case 2889:
                    if (C0009.m36() > 0) {
                        break;
                    } else if (C0179.m1427() <= 0) {
                        C0060.m216();
                        str = "ۨۥۦ";
                    } else {
                        str = "ۢ۠ۢ";
                    }
                case 25860:
                    if (C0206.m1807() >= 0) {
                        C0083.m448();
                    } else {
                        str = "ۡۥ۠";
                        continue;
                    }
                case 27197:
                    return c0222;
                case 27935:
                    if (C0073.m265() <= 0) {
                        c0222 = null;
                    } else {
                        str = "ۥۣۤ";
                        c0222 = null;
                        continue;
                    }
                case 28743:
                    c02222 = ((RunnableC0227) obj).f377;
                    if (C0073.m265() <= 0) {
                        C0393.m5668();
                        str = "ۣۤۡ";
                    } else {
                        str = "ۣۣ۟";
                        continue;
                    }
                case 28828:
                    break;
                case 29788:
                    if (C0362.m3122() >= 0) {
                        c0222 = c02222;
                    } else {
                        str = "۟ۨۧ";
                        c0222 = c02222;
                        continue;
                    }
                case 30919:
                    if (C0387.m5374() >= 0) {
                        C0121.m1023();
                        str = "ۡ۟ۤ";
                    } else {
                        str = "ۨۤۦ";
                        continue;
                    }
                case 31751:
                    if (C0397.m5814() <= 0) {
                        C0179.m1427();
                    } else {
                        str = "ۧۤۧ";
                        continue;
                    }
            }
            if (C0228.m2012() > 0) {
                str = "۟۠ۨ";
            }
        }
    }

    /* renamed from: ۟ۢ۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m1968(Object obj) {
        String str = "ۨ۠ۦ";
        String str2 = null;
        String strM1923 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755560) {
                case 32:
                    if (C0291.m2568() >= 0) {
                        C0394.m5672();
                    } else {
                        str = "ۨ۠ۦ";
                        continue;
                    }
                case 326:
                    if (C0086.m500() < 0) {
                        break;
                    } else {
                        str = "۟۟ۦ";
                    }
                case 2126:
                    str = "ۥۧ۟";
                    continue;
                case 25009:
                    if (C0078.m361() <= 0) {
                        str = "ۡۢۢ";
                        str2 = null;
                    } else {
                        str = "ۦۤۤ";
                        str2 = null;
                        continue;
                    }
                case 28334:
                    strM1923 = C0222.m1923((C0222) obj);
                    if (C0385.m5282() >= 0) {
                        str = "ۢۧۧ";
                    } else {
                        str = "ۥ۟۟";
                        continue;
                    }
                case 29558:
                    break;
                case 29741:
                    if (C0378.m4998() <= 0) {
                        C0279.m2491();
                        str2 = strM1923;
                    } else {
                        str = "ۢۢۤ";
                        str2 = strM1923;
                        continue;
                    }
                case 30677:
                case 32438:
                    if (C0388.m5430() <= 0) {
                        str = "۟ۥۡ";
                    } else {
                        str = "ۢۢۤ";
                        continue;
                    }
                case 31500:
                    return str2;
                case 1709385:
                    if (C0082.m410() >= 0) {
                        C0334.m2866();
                    } else {
                        str = "۟ۨۢ";
                        continue;
                    }
            }
            str = C0382.m5180() <= 0 ? "۠ۧۢ" : "ۧۨ";
        }
    }

    /* renamed from: ۟ۢۨۢۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC0307 m1969(Object obj) {
        Object obj2 = "ۦۣۧ";
        AbstractC0307 abstractC0307 = null;
        AbstractC0307 abstractC03072 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1746813) {
                case 91:
                    if (C0184.m1524() < 0) {
                        obj2 = "ۤۥۥ";
                    } else {
                        continue;
                    }
                case 2077:
                    if (C0393.m5668() <= 0) {
                        C0078.m361();
                        obj2 = "ۡۢۦ";
                    } else {
                        obj2 = "ۧۦۣ";
                        continue;
                    }
                case 2300:
                    if (C0388.m5430() <= 0) {
                        obj2 = "ۣ۟ۡ";
                    } else {
                        obj2 = "ۦۣۧ";
                        continue;
                    }
                case 3102:
                    abstractC03072 = ((RunnableC0227) obj).f375;
                    if (C0382.m5180() <= 0) {
                        C0121.m1023();
                    } else {
                        obj2 = "ۥۤۦ";
                        continue;
                    }
                case 3192:
                    break;
                case 3232:
                    return abstractC0307;
                case 6490:
                    obj2 = "۠ۨۥ";
                    abstractC0307 = abstractC03072;
                    continue;
                case 7487:
                case 25241:
                    if (C0089.m592() <= 0) {
                        C0393.m5668();
                        obj2 = "ۢۤۡ";
                    } else {
                        obj2 = "۠ۨۥ";
                        continue;
                    }
                case 7673:
                    if (C0009.m36() >= 0) {
                        C0291.m2568();
                        abstractC0307 = null;
                    } else {
                        obj2 = "ۡۦۥ";
                        abstractC0307 = null;
                        continue;
                    }
                case 26295:
                    if (C0206.m1807() > 0) {
                        break;
                    } else if (C0393.m5668() <= 0) {
                        C0183.m1464();
                        obj2 = "ۣ۠ۡ";
                    } else {
                        obj2 = "۠ۤۧ";
                    }
            }
            obj2 = "۟۠ۧ";
        }
    }

    /* renamed from: ۟ۥۢۨۤ, reason: not valid java name and contains not printable characters */
    public static List m1970(Object obj) {
        String str = "ۧۡۥ";
        List list = null;
        List list2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755398) {
                case 196:
                    break;
                case 3136:
                    list2 = ((RunnableC0227) obj).f379;
                    str = "ۥۨۤ";
                    continue;
                case 3149:
                    if (C0346.m3059() >= 0) {
                        break;
                    } else if (C0368.m3171() >= 0) {
                        C0060.m216();
                    } else {
                        str = "ۧۡ۠";
                    }
                case 3278:
                    str = "۠ۡۦ";
                    list = null;
                    continue;
                case 25091:
                    if (C0369.m3256() <= 0) {
                        C0279.m2491();
                    } else {
                        str = "۠ۥۢ";
                        continue;
                    }
                case 25211:
                case 25213:
                    if (C0279.m2491() < 0) {
                        str = "ۢۧ";
                    } else {
                        continue;
                    }
                case 26567:
                    if (C0082.m410() < 0) {
                        str = "ۧۡۥ";
                    } else {
                        continue;
                    }
                case 30631:
                    if (C0380.m5068() <= 0) {
                        list = list2;
                    } else {
                        str = "ۢۧ";
                        list = list2;
                        continue;
                    }
                case 31564:
                    if (C0206.m1807() >= 0) {
                        str = "ۧ۟ۤ";
                    } else {
                        str = "ۧۥۦ";
                        continue;
                    }
                case 1709379:
                    return list;
            }
            if (C0291.m2568() < 0) {
                str = "ۢ۟ۧ";
            }
        }
    }

    /* renamed from: ۟ۦۣۧۨ, reason: not valid java name and contains not printable characters */
    public static AtomicInteger m1971(Object obj) {
        Object obj2 = "ۣ۟۠";
        AtomicInteger atomicInteger = null;
        AtomicInteger atomicInteger2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1750661) {
                case 2861:
                    if (C0073.m265() <= 0) {
                        C0184.m1524();
                    } else {
                        obj2 = "ۤۤۥ";
                        continue;
                    }
                case 3296:
                    obj2 = "ۧ۟ۡ";
                    atomicInteger = null;
                    continue;
                case 4569:
                case 7827:
                    if (C0346.m3059() >= 0) {
                        C0121.m1023();
                    } else {
                        obj2 = "ۦۡ۟";
                        continue;
                    }
                case 4601:
                    if (C0379.m5056() < 0) {
                        break;
                    } else if (C0395.m5698() >= 0) {
                        C0279.m2491();
                    } else {
                        obj2 = "ۦۡۢ";
                    }
                case 7428:
                    if (C0380.m5068() <= 0) {
                        obj2 = "ۧۤۥ";
                        atomicInteger = atomicInteger2;
                    } else {
                        obj2 = "ۦۡ۟";
                        atomicInteger = atomicInteger2;
                        continue;
                    }
                case 28833:
                    break;
                case 29580:
                    if (C0073.m265() <= 0) {
                        C0083.m448();
                    } else {
                        obj2 = "۟ۢ۟";
                        continue;
                    }
                case 30465:
                    return atomicInteger;
                case 30466:
                    atomicInteger2 = ((RunnableC0227) obj).f381;
                    if (C0388.m5430() <= 0) {
                        C0089.m592();
                    } else {
                        obj2 = "۠ۥۦ";
                        continue;
                    }
                case 32686:
                    if (C0191.m1627() < 0) {
                        obj2 = "ۣ۟۠";
                    } else {
                        continue;
                    }
            }
            if (C0088.m573() > 0) {
                obj2 = "ۥۣ۠";
            }
        }
    }

    /* renamed from: ۟ۦۧۧۧ, reason: not valid java name and contains not printable characters */
    public static long m1972(Object obj) {
        String str = "ۢۨۨ";
        long j = 0;
        long j2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754445) {
                case 1035:
                case 31881:
                    if (C0382.m5180() <= 0) {
                        str = "۟۠ۨ";
                    } else {
                        str = "ۣۨۢ";
                        continue;
                    }
                case 3172:
                    return j;
                case 25302:
                    j2 = ((RunnableC0227) obj).f380;
                    if (C0229.m2064() >= 0) {
                        str = "ۨ۟ۡ";
                    } else {
                        str = "ۣۢۡ";
                        continue;
                    }
                case 27249:
                    if (C0370.m3284() >= 0) {
                        C0389.m5481();
                        str = "ۧۢۧ";
                    } else {
                        str = "ۦ۟۟";
                        continue;
                    }
                case 27344:
                    break;
                case 27987:
                    if (C0088.m573() > 0) {
                        str = "ۢۨۨ";
                    } else {
                        continue;
                    }
                case 29487:
                    if (C0383.m5203() <= 0) {
                        C0376.m4906();
                        j = j2;
                    } else {
                        str = "ۣۨۢ";
                        j = j2;
                        continue;
                    }
                case 30255:
                    if (C0370.m3284() > 0) {
                        break;
                    } else {
                        str = C0376.m4906() <= 0 ? "ۡ۟ۡ" : "۟ۤ۠";
                    }
                case 30669:
                    if (C0082.m410() < 0) {
                        str = "ۧۥ";
                    } else {
                        continue;
                    }
                case 1710483:
                    str = "ۡۥ۠";
                    j = 0;
                    continue;
            }
            if (C0389.m5481() > 0) {
                str = "ۢۡ۟";
            }
        }
    }

    /* renamed from: ۢۨۡۦ, reason: not valid java name and contains not printable characters */
    public static C0190 m1973(Object obj, Object obj2) {
        String str = "ۥۣۧ";
        C0190 c0190 = null;
        C0190 c0190M1910 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752515) {
                case 834:
                    if (C0346.m3059() >= 0) {
                        break;
                    } else if (C0376.m4906() > 0) {
                        str = "ۣۨۤ";
                    }
                case 1071:
                case 3833:
                    if (C0382.m5180() <= 0) {
                        str = "ۣۧۨ";
                    } else {
                        str = "ۤۧۤ";
                        continue;
                    }
                case 1794:
                    return c0190;
                case 1922:
                    if (C0164.m1359() >= 0) {
                        C0179.m1427();
                        str = "ۣۡۢ";
                        c0190 = c0190M1910;
                    } else {
                        str = "ۤۧۤ";
                        c0190 = c0190M1910;
                        continue;
                    }
                case 2780:
                    c0190M1910 = C0222.m1910((C0222) obj, (C0190) obj2);
                    if (C0164.m1359() >= 0) {
                        str = "ۣۤ۠";
                    } else {
                        str = "ۣۤ۠";
                        continue;
                    }
                case 4736:
                    if (C0362.m3122() < 0) {
                        str = "۠ۧۨ";
                    } else {
                        continue;
                    }
                case 4797:
                    if (C0388.m5430() <= 0) {
                        C0382.m5180();
                        str = "ۣۡ۠";
                    } else {
                        str = "ۢۧ۟";
                        continue;
                    }
                case 5634:
                    str = "ۡۧۤ";
                    c0190 = null;
                    continue;
                case 5730:
                    break;
                case 30725:
                    str = "ۥۣۧ";
                    continue;
            }
            str = "ۡۥۧ";
        }
    }

    /* renamed from: ۣۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m1974(Object obj) {
        String str = "ۣۥۧ";
        String str2 = null;
        String strM1929 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56443) {
                case 69:
                    break;
                case 1709341:
                case 1735547:
                    str = "ۢۢۧ";
                    continue;
                case 1709424:
                    if (C0086.m500() > 0) {
                        str = "ۣۥۧ";
                    } else {
                        continue;
                    }
                case 1709436:
                    if (C0391.m5571() > 0) {
                        str = "ۨۤۢ";
                    } else {
                        continue;
                    }
                case 1710448:
                    str = "ۢۢۧ";
                    str2 = strM1929;
                    continue;
                case 1710683:
                    strM1929 = C0222.m1929((C0222) obj);
                    str = "ۣۧ۟";
                    continue;
                case 1731262:
                    if (C0362.m3122() >= 0) {
                        break;
                    } else {
                        str = C0398.m5833() <= 0 ? "ۢ۟ۡ" : "ۧۨۡ";
                    }
                case 1732316:
                    return str2;
                case 1733476:
                    if (C0392.m5595() <= 0) {
                        C0121.m1023();
                    } else {
                        str = "۠ۦۥ";
                        continue;
                    }
                case 1734628:
                    if (C0179.m1427() <= 0) {
                        str = "ۨۦۨ";
                        str2 = null;
                    } else {
                        str = "ۨۡ۠";
                        str2 = null;
                        continue;
                    }
            }
            if (C0009.m36() >= 0) {
                C0398.m5833();
            } else {
                str = "ۡۤۢ";
            }
        }
    }

    /* renamed from: ۣۤۢۦ, reason: not valid java name and contains not printable characters */
    public static ExecutorService m1975(Object obj) {
        Object obj2 = "ۨۤۧ";
        ExecutorService executorService = null;
        ExecutorService executorService2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1748708) {
                case 6:
                    if (C0291.m2568() >= 0) {
                        C0191.m1627();
                        obj2 = "۠ۥۥ";
                    } else {
                        obj2 = "ۨۤۧ";
                        continue;
                    }
                case TypedValues.CycleType.TYPE_EASING /* 420 */:
                case 4300:
                    if (C0191.m1627() >= 0) {
                        obj2 = "۠ۥۣ";
                    } else {
                        obj2 = "ۧ۟۟";
                        continue;
                    }
                case 484:
                    obj2 = "ۧ۟۟";
                    executorService = executorService2;
                    continue;
                case 4294:
                    obj2 = "ۡۥۤ";
                    continue;
                case 5317:
                    if (C0396.m5741() >= 0) {
                        C0393.m5668();
                    } else {
                        obj2 = "ۦ۟ۨ";
                        continue;
                    }
                case 7194:
                    executorService2 = ((RunnableC0227) obj).f376;
                    if (C0291.m2568() >= 0) {
                        C0279.m2491();
                    } else {
                        obj2 = "ۣۡۢ";
                        continue;
                    }
                case 26511:
                    if (C0384.m5278() <= 0) {
                        break;
                    } else {
                        obj2 = "ۢۥۡ";
                    }
                case 27619:
                    return executorService;
                case 27776:
                    break;
                case 28587:
                    obj2 = "ۥۤۡ";
                    executorService = null;
                    continue;
            }
            if (C0164.m1359() >= 0) {
                C0086.m500();
                obj2 = "ۢ۠۟";
            } else {
                obj2 = "ۤۢ۟";
            }
        }
    }

    /* renamed from: ۥۦۨۡ, reason: contains not printable characters */
    public static C0190 m1976(Object obj) {
        String str = "ۣ۟ۦ";
        C0190 c0190 = null;
        C0190 c01902 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749570) {
                case 196:
                    break;
                case 326:
                    if (C0389.m5481() <= 0) {
                        c0190 = c01902;
                    } else {
                        str = "ۤ۠ۡ";
                        c0190 = c01902;
                        continue;
                    }
                case 1124:
                case 1732162:
                    str = "ۤ۠ۡ";
                    continue;
                case 1252:
                    if (C0335.m2923() >= 0) {
                        str = "ۥۣ۟";
                    } else {
                        str = "ۦ۟ۤ";
                        continue;
                    }
                case 2207:
                    if (C0377.m4944() <= 0) {
                        C0396.m5741();
                        str = "ۡۥۢ";
                    } else {
                        str = "۠۠";
                        continue;
                    }
                case 2983:
                    return c0190;
                case 5568:
                    if (C0398.m5833() <= 0) {
                        break;
                    } else {
                        str = "۠ۨ";
                    }
                case 29449:
                    str = "ۤۨۡ";
                    c0190 = null;
                    continue;
                case 31530:
                    str = "ۣ۟ۦ";
                    continue;
                case 1732170:
                    c01902 = ((RunnableC0227) obj).f378;
                    str = "ۢۥۧ";
                    continue;
            }
            str = "ۣۤۧ";
        }
    }

    /* renamed from: ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m1977(Object obj, Object obj2) {
        String str = "ۤۥ۟";
        String str2 = null;
        String strM1918 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747843) {
                case 1218:
                    str = "ۣۧ";
                    continue;
                case 1313:
                    if (C0082.m410() >= 0) {
                        str2 = strM1918;
                    } else {
                        str = "ۥۧۤ";
                        str2 = strM1918;
                        continue;
                    }
                case 3134:
                    if (C0399.m5914() <= 0) {
                        C0397.m5814();
                        str = "۠۟ۧ";
                    } else {
                        str = "ۨۨ۟";
                        continue;
                    }
                case 4605:
                    if (C0389.m5481() <= 0) {
                        break;
                    } else {
                        str = "ۨۦ۠";
                    }
                case 5377:
                    return str2;
                case 6370:
                case 1734631:
                    if (C0389.m5481() <= 0) {
                        C0279.m2491();
                    } else {
                        str = "ۥۧۤ";
                        continue;
                    }
                case 6403:
                    if (C0375.m4840() >= 0) {
                        C0379.m5056();
                        str = "ۢۥۢ";
                    } else {
                        str = "ۤۥ۟";
                        continue;
                    }
                case 25121:
                    strM1918 = C0222.m1918((C0222) obj, (String) obj2);
                    str = "ۡ۠ۡ";
                    continue;
                case 25180:
                    if (C0380.m5068() <= 0) {
                        C0164.m1359();
                        str2 = null;
                    } else {
                        str = "ۡۥۥ";
                        str2 = null;
                        continue;
                    }
                case 27341:
                    break;
            }
            str = "۟ۥۣ";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0301 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0016 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    @com.cloudinject.feature.ann.Dex2C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p018.RunnableC0227.run():void");
    }
}
