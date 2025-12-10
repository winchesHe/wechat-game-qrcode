package com.cloudinject.feature.p018;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0074;
import android.net.C0083;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0189;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import okhttp3.internal.ws.WebSocketProtocol;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̗̗.̗̙, reason: contains not printable characters */
/* loaded from: classes6.dex */
class RunnableC0223 implements Runnable {

    /* renamed from: ̗̗̗̖̖̙̖, reason: not valid java name and contains not printable characters */
    final ExecutorService f365;

    /* renamed from: ̗̗̗̖̙̗̖, reason: not valid java name and contains not printable characters */
    final C0222 f366;

    /* renamed from: ̗̗̗̙̖̙̖, reason: not valid java name and contains not printable characters */
    final String f367;

    /* renamed from: ̗̗̗̙̙̙̖, reason: not valid java name and contains not printable characters */
    final AtomicBoolean f368;

    /* renamed from: ̗̗̙̗̗̙̗, reason: not valid java name and contains not printable characters */
    final long f369;

    /* renamed from: ̗̗̙̗̗̙̙, reason: not valid java name and contains not printable characters */
    final AtomicInteger f370;

    RunnableC0223(C0222 c0222, String str, long j, AtomicBoolean atomicBoolean, ExecutorService executorService, AtomicInteger atomicInteger) {
        this.f366 = c0222;
        this.f367 = str;
        this.f369 = j;
        this.f368 = atomicBoolean;
        this.f365 = executorService;
        this.f370 = atomicInteger;
    }

    /* renamed from: ۟ۡۨۨ۟, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m1936(Object obj) {
        Object obj2 = "۟ۧۦ";
        AtomicBoolean atomicBoolean = null;
        AtomicBoolean atomicBoolean2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1748617) {
                case 499:
                    if (C0390.m5512() <= 0) {
                        obj2 = "ۨۤۢ";
                    } else {
                        obj2 = "۟ۧۦ";
                        continue;
                    }
                case 2423:
                    if (C0376.m4906() <= 0) {
                        break;
                    } else if (C0377.m4944() <= 0) {
                        C0381.m5127();
                        obj2 = "ۦۢ۟";
                    } else {
                        obj2 = "ۢۧۨ";
                    }
                case 5356:
                    break;
                case 6377:
                    return atomicBoolean;
                case 6536:
                    obj2 = "ۢۥۣ";
                    atomicBoolean = null;
                    continue;
                case 7277:
                case 26447:
                    if (C0375.m4840() < 0) {
                        obj2 = "ۣۢ۟";
                    } else {
                        continue;
                    }
                case 7561:
                    obj2 = "ۨۧۥ";
                    continue;
                case 7626:
                    atomicBoolean2 = ((RunnableC0223) obj).f368;
                    if (C0390.m5512() <= 0) {
                        C0398.m5833();
                    } else {
                        obj2 = "ۨۥۨ";
                        continue;
                    }
                case 26370:
                    if (C0387.m5374() >= 0) {
                        atomicBoolean = atomicBoolean2;
                    } else {
                        obj2 = "ۣۢ۟";
                        atomicBoolean = atomicBoolean2;
                        continue;
                    }
                case 1733204:
                    if (C0376.m4906() <= 0) {
                        obj2 = "ۣۧۡ";
                    } else {
                        obj2 = "ۣۧۥ";
                        continue;
                    }
            }
            obj2 = "ۧۤ";
        }
    }

    /* renamed from: ۣ۟ۨۡۤ, reason: not valid java name and contains not printable characters */
    public static CountDownLatch m1937(Object obj) {
        String str = "۟ۨ۠";
        CountDownLatch countDownLatch = null;
        CountDownLatch countDownLatchM1925 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56477) {
                case 35:
                case 1728792:
                    if (C0155.m1294() < 0) {
                        str = "ۤۡۡ";
                    } else {
                        continue;
                    }
                case 1730112:
                    if (C0385.m5282() >= 0) {
                        str = "ۣۢۢ";
                    } else {
                        str = "ۣۤۡ";
                        continue;
                    }
                case 1730201:
                    return countDownLatch;
                case 1730271:
                    if (C0335.m2923() >= 0) {
                        str = "ۦۤۦ";
                        countDownLatch = null;
                    } else {
                        str = "ۢۡۤ";
                        countDownLatch = null;
                        continue;
                    }
                case 1731196:
                    break;
                case 1732120:
                    if (C0381.m5127() > 0) {
                        str = "ۥ۟۟";
                    } else {
                        continue;
                    }
                case 1733770:
                    if (C0279.m2491() >= 0) {
                        break;
                    } else if (C0184.m1524() >= 0) {
                        C0368.m3171();
                    } else {
                        str = "۠ۧۡ";
                    }
                case 1734439:
                    countDownLatchM1925 = C0222.m1925((C0222) obj);
                    str = "۠ۡۡ";
                    continue;
                case 1734557:
                    if (C0009.m36() >= 0) {
                        countDownLatch = countDownLatchM1925;
                    } else {
                        str = "ۤۡۡ";
                        countDownLatch = countDownLatchM1925;
                        continue;
                    }
                case 1734625:
                    str = "۟ۨ۠";
                    continue;
            }
            if (C0086.m500() > 0) {
                str = "ۤۨۡ";
            }
        }
    }

    /* renamed from: ۟ۥ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static void m1938(Object obj) {
        String str = "ۧۢۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755368) {
                case 329:
                    break;
                case 398:
                    str = "ۤ۟ۦ";
                    continue;
                case 3340:
                    str = "ۧۢۡ";
                    continue;
                case 3470:
                    if (C0155.m1294() >= 0) {
                        break;
                    } else if (C0391.m5571() <= 0) {
                        C0379.m5056();
                        str = "ۡۢۢ";
                    } else {
                        str = "ۣ۟ۢ";
                    }
                case 24818:
                case 28963:
                    str = "۠ۥ۟";
                    continue;
                case 25490:
                    return;
                case 28552:
                    C0222.m1919((C0222) obj);
                    str = "۠ۥ۟";
                    continue;
            }
            str = C0089.m592() <= 0 ? "ۡۡ" : "ۨۤۢ";
        }
    }

    /* renamed from: ۟ۧۥۣۣ, reason: not valid java name and contains not printable characters */
    public static long m1939(Object obj) {
        String str = "ۥۣۥ";
        long j = 0;
        long j2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750600) {
                case 2127:
                    if (C0379.m5056() < 0) {
                        break;
                    } else if (C0279.m2491() >= 0) {
                        C0009.m36();
                    } else {
                        str = "ۨ۠ۢ";
                    }
                case 3317:
                    break;
                case 4456:
                    if (C0291.m2568() < 0) {
                        str = "ۥۣۥ";
                    } else {
                        continue;
                    }
                case 6380:
                case 29633:
                    str = "ۦۢۧ";
                    continue;
                case 6609:
                    str = "ۣۧۢ";
                    continue;
                case 29646:
                    str = "ۣۧ";
                    j = 0;
                    continue;
                case 30691:
                    return j;
                case 32418:
                    j2 = ((RunnableC0223) obj).f369;
                    if (C0397.m5814() <= 0) {
                        C0377.m4944();
                        str = "ۧۧۡ";
                    } else {
                        str = "ۨۦۣ";
                        continue;
                    }
                case 32749:
                    if (C0385.m5282() >= 0) {
                        C0229.m2064();
                        j = j2;
                    } else {
                        str = "ۦۢۧ";
                        j = j2;
                        continue;
                    }
                case 1731116:
                    str = "ۣۡ۠";
                    continue;
            }
            if (C0400.m5961() > 0) {
                str = "ۡۨ۠";
            }
        }
    }

    /* renamed from: ۣ۠۠۟, reason: not valid java name and contains not printable characters */
    public static C0189 m1940(Object obj) {
        String str = "ۧۡۦ";
        C0189 c0189 = null;
        C0189 c0189M1924 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755465) {
                case 79:
                    return c0189;
                case 236:
                    str = "۠ۦۧ";
                    c0189 = null;
                    continue;
                case 2286:
                case 28173:
                    if (C0400.m5961() > 0) {
                        str = "ۨۡ۟";
                    } else {
                        continue;
                    }
                case 3077:
                    if (C0385.m5282() > 0) {
                        break;
                    } else if (C0191.m1627() >= 0) {
                        C0392.m5595();
                        str = "ۥۧۤ";
                    } else {
                        str = "ۧ۟ۨ";
                    }
                case 3161:
                    c0189M1924 = C0222.m1924((C0222) obj);
                    if (C0206.m1807() >= 0) {
                        C0009.m36();
                        str = "ۦۢۦ";
                    } else {
                        str = "ۣۧۦ";
                        continue;
                    }
                case 3267:
                    if (C0376.m4906() <= 0) {
                        C0388.m5430();
                        c0189 = c0189M1924;
                    } else {
                        str = "ۨۡ۟";
                        c0189 = c0189M1924;
                        continue;
                    }
                case 25320:
                    str = "ۦۣۢ";
                    continue;
                case 28278:
                    break;
                case 29676:
                    if (C0179.m1427() <= 0) {
                        C0121.m1023();
                    } else {
                        str = "ۧۡۦ";
                        continue;
                    }
                case 32526:
                    str = "ۨۦۣ";
                    continue;
            }
            str = "ۣۡۥ";
        }
    }

    /* renamed from: ۣ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static C0189 m1941(Object obj, Object obj2) {
        String str = "ۥۣۢ";
        C0189 c0189 = null;
        C0189 c0189M1909 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755463) {
                case 3:
                    str = "ۡ۟";
                    c0189 = c0189M1909;
                    continue;
                case 2287:
                    if (C0378.m4998() <= 0) {
                        C0392.m5595();
                        c0189 = null;
                    } else {
                        str = "ۣ۟ۥ";
                        c0189 = null;
                        continue;
                    }
                case 26333:
                    if (C0384.m5278() <= 0) {
                        str = "ۦۦۣ";
                    } else {
                        str = "ۥۣۢ";
                        continue;
                    }
                case 28280:
                case 32641:
                    if (C0060.m216() <= 0) {
                        C0206.m1807();
                    } else {
                        str = "ۡ۟";
                        continue;
                    }
                case 28358:
                    str = "ۣۥۨ";
                    continue;
                case 29477:
                    c0189M1909 = C0222.m1909((C0222) obj, (String) obj2);
                    if (C0400.m5961() <= 0) {
                        C0386.m5322();
                        str = "ۨۡ۠";
                    } else {
                        str = "ۣۨ۟";
                        continue;
                    }
                case 30531:
                    if (C0396.m5741() >= 0) {
                        break;
                    } else if (C0191.m1627() < 0) {
                        str = "ۤۤۢ";
                    }
                case 31622:
                    if (C0183.m1464() > 0) {
                        str = "ۦۢۤ";
                    } else {
                        continue;
                    }
                case 32709:
                    break;
                case 1709401:
                    return c0189;
            }
            if (C0385.m5282() < 0) {
                str = "ۣۢۢ";
            }
        }
    }

    /* renamed from: ۡۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static AtomicInteger m1942(Object obj) {
        String str = "ۦۣۤ";
        AtomicInteger atomicInteger = null;
        AtomicInteger atomicInteger2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753608) {
                case 993:
                case 27093:
                    if (C0420.m6215() >= 0) {
                        C0378.m4998();
                    } else {
                        str = "ۥۣۣ";
                        continue;
                    }
                case WebSocketProtocol.CLOSE_NO_STATUS_CODE /* 1005 */:
                    if (C0376.m4906() < 0) {
                        break;
                    } else if (C0400.m5961() <= 0) {
                        C0393.m5668();
                        str = "ۡۥۣ";
                    } else {
                        str = "ۢۤۨ";
                    }
                case 1829:
                    if (C0083.m448() < 0) {
                        str = "ۦۤۧ";
                    } else {
                        continue;
                    }
                case 2016:
                    str = "ۨۨ";
                    continue;
                case 28020:
                    str = "ۥۣۣ";
                    atomicInteger = atomicInteger2;
                    continue;
                case 28877:
                    str = "ۦۣۤ";
                    continue;
                case 28910:
                    atomicInteger2 = ((RunnableC0223) obj).f370;
                    str = "ۡۧۢ";
                    continue;
                case 31757:
                    return atomicInteger;
                case 31817:
                    break;
                case 1711880:
                    if (C0386.m5322() <= 0) {
                        atomicInteger = null;
                    } else {
                        str = "ۧ۠ۦ";
                        atomicInteger = null;
                        continue;
                    }
            }
            str = "ۧۦۧ";
        }
    }

    /* renamed from: ۡۥۡۧ, reason: not valid java name and contains not printable characters */
    public static String[] m1943(Object obj) {
        String str = "ۥۦۨ";
        String[] strArr = null;
        String[] strArrM1928 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749668) {
                case 1056:
                    str = "ۤ۟ۤ";
                    strArr = null;
                    continue;
                case 1196:
                    if (C0382.m5180() <= 0) {
                        C0394.m5672();
                        str = "ۣۨ۟";
                    } else {
                        str = "ۥۦۨ";
                        continue;
                    }
                case 1260:
                    str = "ۤۥۣ";
                    strArr = strArrM1928;
                    continue;
                case 2086:
                    return strArr;
                case 2925:
                    if (C0074.m307() >= 0) {
                        C0183.m1464();
                    } else {
                        str = "ۨۨ";
                        continue;
                    }
                case 3076:
                case 1732516:
                    if (C0379.m5056() <= 0) {
                        C0391.m5571();
                    } else {
                        str = "ۤۥۣ";
                        continue;
                    }
                case 3267:
                    if (C0382.m5180() < 0) {
                        break;
                    } else if (C0390.m5512() > 0) {
                        str = "ۡۦۤ";
                    }
                case 7202:
                    if (C0376.m4906() <= 0) {
                        str = "ۦۧۦ";
                    } else {
                        str = "ۣۣۤ";
                        continue;
                    }
                case 7675:
                    strArrM1928 = C0222.m1928((C0222) obj);
                    str = "ۣۡۦ";
                    continue;
                case 29829:
                    break;
            }
            str = "ۡ۟ۤ";
        }
    }

    /* renamed from: ۦۧۨۦ, reason: contains not printable characters */
    public static ExecutorService m1944(Object obj) {
        String str = "ۧۥۣ";
        ExecutorService executorService = null;
        ExecutorService executorService2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754439) {
                case 111:
                    return executorService;
                case 130:
                    if (C0121.m1023() > 0) {
                        break;
                    } else {
                        str = "ۣ۠۟";
                    }
                case 1035:
                case 28582:
                    str = "ۧ۠ۡ";
                    continue;
                case 3302:
                    break;
                case 28378:
                    str = "۠۠ۡ";
                    continue;
                case 28551:
                    if (C0089.m592() <= 0) {
                        executorService = null;
                    } else {
                        str = "۠ۦۣ";
                        executorService = null;
                        continue;
                    }
                case 29541:
                    executorService2 = ((RunnableC0223) obj).f365;
                    str = "ۥۢ۟";
                    continue;
                case 30885:
                    if (C0399.m5914() <= 0) {
                        C0386.m5322();
                        executorService = executorService2;
                    } else {
                        str = "ۧ۠ۡ";
                        executorService = executorService2;
                        continue;
                    }
                case 31682:
                    str = "۠۟۟";
                    continue;
                case 32623:
                    str = "ۧۥۣ";
                    continue;
            }
            if (C0388.m5430() <= 0) {
                C0121.m1023();
                str = "ۧ۟ۡ";
            } else {
                str = "ۥۧۧ";
            }
        }
    }

    /* renamed from: ۧۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static C0222 m1945(Object obj) {
        String str = "ۦۣۤ";
        C0222 c0222 = null;
        C0222 c02222 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750689) {
                case 95:
                    str = "ۦۢۡ";
                    c0222 = c02222;
                    continue;
                case 132:
                    break;
                case 200:
                case 4378:
                    if (C0390.m5512() <= 0) {
                        C0083.m448();
                        str = "ۣۤۤ";
                    } else {
                        str = "ۦۢۡ";
                        continue;
                    }
                case 4570:
                    if (C0228.m2012() <= 0) {
                        C0420.m6215();
                    } else {
                        str = "۟ۥۡ";
                        continue;
                    }
                case 6530:
                    str = "ۣۧ۠";
                    continue;
                case 7425:
                    c02222 = ((RunnableC0223) obj).f366;
                    str = "ۣۧۢ";
                    continue;
                case 29477:
                    if (C0164.m1359() >= 0) {
                        C0025.m118();
                        str = "ۨ۟ۤ";
                        c0222 = null;
                    } else {
                        str = "ۣ۟۟";
                        c0222 = null;
                        continue;
                    }
                case 29889:
                    if (C0369.m3256() > 0) {
                        str = "ۦۣۤ";
                    } else {
                        continue;
                    }
                case 30468:
                    return c0222;
                case 30566:
                    if (C0387.m5374() >= 0) {
                        break;
                    } else {
                        str = C0396.m5741() >= 0 ? "ۣۤ۟" : "۠ۦۦ";
                    }
            }
            if (C0229.m2064() >= 0) {
                C0191.m1627();
            } else {
                str = "ۡۤۦ";
            }
        }
    }

    /* renamed from: ۨۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m1946(Object obj) {
        Object obj2 = "ۦۡۡ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1750564) {
                case 6:
                    obj2 = "ۣۡۨ";
                    continue;
                case 35:
                    str2 = ((RunnableC0223) obj).f367;
                    if (C0155.m1294() >= 0) {
                        C0346.m3059();
                    } else {
                        obj2 = "۟ۤ";
                        continue;
                    }
                case 186:
                    if (C0382.m5180() <= 0) {
                        obj2 = "۠ۢ۟";
                    } else {
                        obj2 = "ۦۡۡ";
                        continue;
                    }
                case 315:
                    return str;
                case 1250:
                    obj2 = "ۧۧۦ";
                    continue;
                case 2214:
                case 28706:
                    obj2 = "ۣۨۤ";
                    continue;
                case 6273:
                    break;
                case 6434:
                    if (C0291.m2568() >= 0) {
                        str = null;
                    } else {
                        obj2 = "ۣۢۧ";
                        str = null;
                        continue;
                    }
                case 30626:
                    if (C0229.m2064() >= 0) {
                        break;
                    } else if (C0394.m5672() > 0) {
                        obj2 = "ۣۣ۟";
                    }
                case 1732033:
                    if (C0370.m3284() >= 0) {
                        C0389.m5481();
                        str = str2;
                    } else {
                        obj2 = "ۣۨۤ";
                        str = str2;
                        continue;
                    }
            }
            if (C0183.m1464() <= 0) {
                C0335.m2923();
            } else {
                obj2 = "ۣ۠۟";
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a5 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    @com.cloudinject.feature.ann.Dex2C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p018.RunnableC0223.run():void");
    }
}
