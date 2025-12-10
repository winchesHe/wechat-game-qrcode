package com.cloudinject.feature.p018;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.model.p014.C0189;
import com.cloudinject.feature.model.p014.C0190;
import com.cloudinject.feature.model.p014.C0191;
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
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
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
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0387;
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
import p027.p028.p029.C0420;

@Dex2C
/* renamed from: com.cloudinject.feature.̗̗.̗̗, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0222 {

    /* renamed from: ̗̗̖̗̗̗̙, reason: not valid java name and contains not printable characters */
    public static Map<String, String> f358 = new Hashtable();

    /* renamed from: ̗̗̗̖̙̖̖, reason: not valid java name and contains not printable characters */
    private CountDownLatch f359;

    /* renamed from: ̗̗̗̖̙̖̗, reason: not valid java name and contains not printable characters */
    private String[] f360;

    /* renamed from: ̗̗̗̖̙̖̙, reason: not valid java name and contains not printable characters */
    private C0189 f361;

    /* renamed from: ̗̗̙̗̗̗̖, reason: not valid java name and contains not printable characters */
    private C0190 f362;

    /* renamed from: ̗̗̙̗̗̗̗, reason: not valid java name and contains not printable characters */
    private String f363;

    /* renamed from: ̗̗̙̗̗̗̙, reason: not valid java name and contains not printable characters */
    private String f364;

    public C0222() {
        String str = "۟۠ۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747803) {
                case 3199:
                    this.f360 = new String[0];
                    if (C0395.m5698() >= 0) {
                        break;
                    } else {
                        str = "ۦۧۡ";
                        break;
                    }
                case 5457:
                    if (C0397.m5814() > 0) {
                        str = "۟۠ۥ";
                        break;
                    } else {
                        C0395.m5698();
                        break;
                    }
                case 26907:
                    this.f361 = new C0189();
                    if (C0362.m3122() >= 0) {
                        break;
                    } else {
                        str = "ۧ۟ۡ";
                        break;
                    }
                case 28242:
                    return;
            }
        }
    }

    public static /* synthetic */ void lambda$r4_p6kGgaXZNGxw9Tbf9ud28N_w(C0222 c0222) {
        String str = "ۣۨۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56296) {
                case 1708599:
                    if (C0393.m5668() <= 0) {
                        break;
                    } else {
                        str = "ۣۨۢ";
                        break;
                    }
                case 1708737:
                    m1930(c0222);
                    str = "ۣۧۡ";
                    break;
                case 1711777:
                    return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0011 A[SYNTHETIC] */
    /* renamed from: ̖̗̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.cloudinject.feature.model.p014.C0189 m1906(java.lang.String r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p018.C0222.m1906(java.lang.String):com.cloudinject.feature.model.̗.̖");
    }

    /* JADX WARN: Removed duplicated region for block: B:265:0x037c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x035d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x02da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x003a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x003a A[SYNTHETIC] */
    /* renamed from: ̖̗̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m1907(java.lang.String r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p018.C0222.m1907(java.lang.String):java.lang.String");
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    static /* synthetic */ C0189 m1909(C0222 c0222, String str) {
        String str2 = "ۦۣۨ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1746726) {
                case 3173:
                    if (C0420.m6215() < 0) {
                        str2 = "ۦۣۨ";
                        break;
                    } else {
                        C0164.m1359();
                        break;
                    }
                case 25927:
                    return m1931(c0222, str);
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    static /* synthetic */ C0190 m1910(C0222 c0222, C0190 c0190) {
        String str = "ۤ۠ۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753631) {
                case 853:
                    str = "ۤ۠ۥ";
                    break;
                case 27142:
                    return c0190;
                case 31734:
                    c0222.f362 = c0190;
                    if (C0375.m4840() < 0) {
                        str = "۟ۨۢ";
                        break;
                    } else {
                        str = "ۤ۠ۤ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    static /* synthetic */ void m1911(C0222 c0222, List list, AbstractC0307 abstractC0307) {
        String str = "ۡۥۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755407) {
                case 3850:
                    return;
                case 26190:
                    m1927(c0222, list, abstractC0307);
                    str = "ۧۧۥ";
                    break;
                case 29649:
                    if (C0335.m2923() >= 0) {
                        break;
                    } else {
                        str = "ۡۥۥ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    private void m1912(List<C0190> list, AbstractC0307<String> abstractC0307) {
        long jM5072 = 0;
        String str = "ۦۢۧ";
        Iterator itM554 = null;
        ExecutorService executorServiceM122 = null;
        AtomicInteger atomicInteger = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755522) {
                case 2089:
                    jM5072 = C0380.m5072();
                    if (C0279.m2491() >= 0) {
                        str = "ۧ۟ۡ";
                    } else {
                        str = "ۣ۠۟";
                        continue;
                    }
                case 2119:
                    if (!C0398.m5858(itM554)) {
                        break;
                    } else if (C0420.m6215() >= 0) {
                        C0279.m2491();
                    } else {
                        str = "ۧ۠۟";
                    }
                case 3115:
                    break;
                case 3236:
                    C0191.m1638(executorServiceM122, new RunnableC0227(this, (C0190) C0398.m5850(itM554), jM5072, abstractC0307, executorServiceM122, atomicInteger, list));
                    if (C0420.m6215() >= 0) {
                        C0164.m1359();
                        str = "ۥۡۨ";
                    } else {
                        str = "۟ۤۤ";
                        continue;
                    }
                case 25122:
                case 32572:
                    str = "ۦۣۢ";
                    continue;
                case 25278:
                    if (C0369.m3256() > 0) {
                        str = "ۦۢۧ";
                    } else {
                        continue;
                    }
                case 25314:
                    str = "ۦۣۢ";
                    itM554 = C0088.m554(list);
                    continue;
                case 25414:
                    atomicInteger = new AtomicInteger(0);
                    str = "ۢ۟ۢ";
                    continue;
                case 28189:
                    if (C0078.m361() > 0) {
                        str = "ۣۥ۠";
                    } else {
                        continue;
                    }
                case 31687:
                    executorServiceM122 = C0025.m122(C0362.m3094(list));
                    str = "۠ۤۤ";
                    continue;
                case 32637:
                    return;
                case 1709344:
                    C0384.m5258(executorServiceM122);
                    if (C0392.m5595() > 0) {
                        str = "ۣۣۧ";
                    } else {
                        continue;
                    }
            }
            str = "ۥۧ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c3 A[SYNTHETIC] */
    /* renamed from: ̗̖̗̖̖̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1914() {
        /*
            r8 = this;
            r1 = 0
            java.lang.String r0 = "ۦۧۥ"
            r2 = r1
            r3 = r1
            r4 = r1
        L6:
            int r5 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r6 = 1750568(0x1ab628, float:2.453068E-39)
            r5 = r5 ^ r6
            switch(r5) {
                case 267: goto L12;
                case 298: goto L42;
                case 1120: goto Lbd;
                case 1165: goto Laf;
                case 1227: goto L5c;
                case 1298: goto Laf;
                case 1385: goto L1e;
                case 2093: goto L9f;
                case 2144: goto L7b;
                case 2958: goto Lcb;
                case 3178: goto Laf;
                case 3243: goto Lc7;
                case 4032: goto L53;
                case 4457: goto L37;
                case 7670: goto Lb9;
                case 29804: goto L90;
                case 30595: goto L72;
                case 1731312: goto L6c;
                default: goto L11;
            }
        L11:
            goto L6
        L12:
            java.lang.Object r0 = mirrorb.com.android.internal.C0398.m5850(r2)
            com.cloudinject.feature.model.̗.̗ r0 = (com.cloudinject.feature.model.p014.C0190) r0
            java.lang.String r1 = "ۥۥۨ"
            r7 = r1
            r1 = r0
            r0 = r7
            goto L6
        L1e:
            com.cloudinject.feature.model.̗.̖ r2 = m1924(r8)
            java.util.List r2 = mirrorb.android.net.wifi.C0388.m5429(r2)
            java.util.Iterator r2 = androidx.core.p007.C0088.m554(r2)
            int r5 = mirrorb.android.os.mount.C0390.m5512()
            if (r5 > 0) goto L34
            com.cloudinject.feature.p018.C0229.m2064()
            goto L6
        L34:
            java.lang.String r0 = "ۥۣۣ"
            goto L6
        L37:
            com.cloudinject.feature.̗̗.̙̖ r0 = new com.cloudinject.feature.̗̗.̙̖
            r0.<init>(r8, r3)
            m1927(r8, r4, r0)
            java.lang.String r0 = "ۥ۠ۡ"
            goto L6
        L42:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r0 = com.cloudinject.customview.C0183.m1464()
            if (r0 > 0) goto L50
            java.lang.String r0 = "۟ۤ"
            goto L6
        L50:
            java.lang.String r0 = "ۢۧۦ"
            goto L6
        L53:
            int r5 = mirrorb.android.hardware.location.C0383.m5203()
            if (r5 <= 0) goto L6
            java.lang.String r0 = "ۢۧ۟"
            goto L6
        L5c:
            com.cloudinject.customview.C0184.m1513(r3, r1)
            int r5 = com.px.C0368.m3171()
            if (r5 < 0) goto L69
            android.net.wifi.C0078.m361()
            goto L6
        L69:
            java.lang.String r0 = "ۦۢۧ"
            goto L6
        L6c:
            com.cloudinject.customview.C0184.m1513(r4, r1)
            java.lang.String r0 = "ۤ۠ۤ"
            goto L6
        L72:
            int r5 = mirrorb.android.app.admin.C0377.m4944()
            if (r5 <= 0) goto L6
            java.lang.String r0 = "ۣۤۡ"
            goto L6
        L7b:
            int r5 = mirrorb.android.accounts.C0375.m4844(r1)
            if (r5 != 0) goto Lc7
            int r5 = com.sadfxg.fasg.C0370.m3284()
            if (r5 < 0) goto L8c
            com.cloudinject.feature.p021.C0291.m2568()
            goto L6
        L8c:
            java.lang.String r0 = "ۧ۟"
            goto L6
        L90:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = com.cloudinject.feature.p018.C0229.m2064()
            if (r5 >= 0) goto L6
            java.lang.String r0 = "ۣۧۦ"
            goto L6
        L9f:
            boolean r5 = mirrorb.com.android.internal.C0398.m5858(r2)
            if (r5 == 0) goto Lbd
            int r5 = mirrorb.com.android.internal.view.C0397.m5814()
            if (r5 <= 0) goto L6
            java.lang.String r0 = "ۣۨۨ"
            goto L6
        Laf:
            int r5 = mirrorb.android.hardware.fingerprint.C0381.m5127()
            if (r5 <= 0) goto L6
            java.lang.String r0 = "ۥۣۣ"
            goto L6
        Lb9:
            java.lang.String r0 = "ۦۧۥ"
            goto L6
        Lbd:
            int r5 = android.net.wifi.C0078.m361()
            if (r5 <= 0) goto L6
            java.lang.String r0 = "ۣ۟ۡ"
            goto L6
        Lc7:
            java.lang.String r0 = "ۢۤۥ"
            goto L6
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p018.C0222.m1914():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b6 A[SYNTHETIC] */
    /* renamed from: ̗̙̖̗̖̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private /* synthetic */ void m1917() {
        /*
            r3 = this;
            java.lang.String r0 = "ۣۣ۠"
        L2:
            int r1 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r2 = 1753541(0x1ac1c5, float:2.457234E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 36: goto Le;
                case 162: goto Lba;
                case 1028: goto Lc8;
                case 1229: goto L6e;
                case 2249: goto L1e;
                case 27269: goto L4d;
                case 28416: goto L77;
                case 29510: goto L9a;
                case 30501: goto L36;
                case 31557: goto Lb0;
                case 31822: goto Le2;
                case 32613: goto Lba;
                case 32673: goto Lb0;
                case 1710629: goto Lc4;
                case 1711428: goto Lde;
                case 1711553: goto L59;
                default: goto Ld;
            }
        Ld:
            goto L2
        Le:
            java.util.concurrent.CountDownLatch r0 = m1925(r3)     // Catch: java.lang.InterruptedException -> Lcc
            mirrorb.android.accounts.C0375.m4887(r0)     // Catch: java.lang.InterruptedException -> Lcc
            int r0 = mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            if (r0 < 0) goto L56
            java.lang.String r0 = "۠۠"
            goto L2
        L1e:
            java.util.Map r1 = android.arch.p003.p005.C0060.m189()
            java.lang.String r2 = m1929(r3)
            mirrorb.android.net.wifi.C0387.m5371(r1, r2)
            int r1 = android.arch.lifecycle.p000.C0025.m118()
            if (r1 > 0) goto L33
            mirrorb.com.android.internal.C0398.m5833()
            goto L2
        L33:
            java.lang.String r0 = "ۥ۟ۥ"
            goto L2
        L36:
            com.sadfxg.fasg.App r0 = com.px.C0368.m3187()
            android.app.Activity r1 = mirrorb.android.providers.C0391.m5560()
            com.sadfxg.fasg.C0370.m3271(r0, r1)
            int r0 = android.net.C0082.m410()
            if (r0 < 0) goto L4a
            java.lang.String r0 = "ۤۥۢ"
            goto L2
        L4a:
            java.lang.String r0 = "ۧ۟۠"
            goto L2
        L4d:
            int r1 = com.cloudinject.feature.p021.C0291.m2568()
            if (r1 >= 0) goto L2
            java.lang.String r0 = "ۦۤ۟"
            goto L2
        L56:
            java.lang.String r0 = "ۡۡۥ"
            goto L2
        L59:
            java.lang.String r1 = m1929(r3)
            java.lang.String r2 = com.sadfxg.fasg.C0369.m3263()
            java.lang.String r2 = mirrorb.android.location.C0385.m5310(r2)
            boolean r1 = mirrorb.com.android.internal.content.C0395.m5699(r1, r2)
            if (r1 == 0) goto Lb0
            java.lang.String r0 = "ۢۡۢ"
            goto L2
        L6e:
            int r1 = p027.p028.p029.C0420.m6215()
            if (r1 >= 0) goto L2
            java.lang.String r0 = "ۤۥۡ"
            goto L2
        L77:
            java.lang.String r0 = m1929(r3)
            java.lang.String r1 = com.sadfxg.fasg.C0369.m3230()
            java.lang.String r1 = mirrorb.android.location.C0385.m5310(r1)
            boolean r0 = mirrorb.com.android.internal.content.C0395.m5699(r0, r1)
            if (r0 == 0) goto Lc8
            int r0 = mirrorb.android.app.admin.C0377.m4944()
            if (r0 > 0) goto L96
            com.cloudinject.feature.p015.C0206.m1807()
            java.lang.String r0 = "ۣۢۡ"
            goto L2
        L96:
            java.lang.String r0 = "ۣۦۣ"
            goto L2
        L9a:
            com.cloudinject.feature.̗̙.̗̗ r1 = mirrorb.android.hardware.location.C0383.m5211()
            com.cloudinject.p025.p026.C0346.m3045(r1)
            int r1 = mirrorb.android.app.servertransaction.C0378.m4998()
            if (r1 > 0) goto Lac
            mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            goto L2
        Lac:
            java.lang.String r0 = "ۨۡۥ"
            goto L2
        Lb0:
            int r1 = mirrorb.android.location.C0385.m5282()
            if (r1 >= 0) goto L2
            java.lang.String r0 = "ۨۡۥ"
            goto L2
        Lba:
            int r1 = p027.p028.p029.C0420.m6215()
            if (r1 >= 0) goto L2
            java.lang.String r0 = "ۡۡۥ"
            goto L2
        Lc4:
            java.lang.String r0 = "ۣۣ۠"
            goto L2
        Lc8:
            java.lang.String r0 = "۠ۤ"
            goto L2
        Lcc:
            r0 = move-exception
            int r0 = com.cloudinject.feature.p023.C0335.m2923()
            if (r0 < 0) goto Lda
            mirrorb.android.hardware.fingerprint.C0382.m5180()
            java.lang.String r0 = "ۡ۟ۨ"
            goto L2
        Lda:
            java.lang.String r0 = "ۦ۠ۡ"
            goto L2
        Lde:
            java.lang.String r0 = "ۦۤ۟"
            goto L2
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p018.C0222.m1917():void");
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    static /* synthetic */ String m1918(C0222 c0222, String str) {
        String str2 = "۟۠۟";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56296) {
                case 1710766:
                    str2 = "۟۠۟";
                    break;
                case 1735926:
                    return m1926(c0222, str);
            }
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    static /* synthetic */ void m1919(C0222 c0222) {
        String str = "ۧۨ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753570) {
                case 1199:
                    if (C0009.m36() < 0) {
                        str = "ۧۨ۠";
                        break;
                    } else {
                        str = "ۧۤۧ";
                        break;
                    }
                case 2045:
                    m1932(c0222);
                    str = "ۤۡۤ";
                    break;
                case 31717:
                    return;
            }
        }
    }

    /* renamed from: ۟۠ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static C0190 m1922(Object obj) {
        String str = "ۢۥۤ";
        C0190 c0190 = null;
        C0190 c01902 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751587) {
                case 166:
                    if (C0279.m2491() < 0) {
                        str = "ۥۣۦ";
                    } else {
                        continue;
                    }
                case 1067:
                case 1994:
                    if (C0370.m3284() < 0) {
                        str = "ۧۤ";
                    } else {
                        continue;
                    }
                case 1153:
                    if (C0387.m5374() >= 0) {
                        C0369.m3256();
                        c0190 = null;
                    } else {
                        str = "ۤۥۦ";
                        c0190 = null;
                        continue;
                    }
                case 1995:
                    if (C0335.m2923() >= 0) {
                        C0385.m5282();
                        str = "ۧۧۡ";
                    } else {
                        str = "ۢۥۤ";
                        continue;
                    }
                case 2016:
                    break;
                case 2338:
                    if (C0279.m2491() > 0) {
                        break;
                    } else if (C0083.m448() >= 0) {
                        C0229.m2064();
                    } else {
                        str = "ۣ۟ۨ";
                    }
                case 4665:
                    c01902 = ((C0222) obj).f362;
                    if (C0396.m5741() >= 0) {
                        C0179.m1427();
                        str = "ۢۨۧ";
                    } else {
                        str = "ۣۨۦ";
                        continue;
                    }
                case 29453:
                    if (C0362.m3122() < 0) {
                        str = "ۥۨۥ";
                    } else {
                        continue;
                    }
                case 29544:
                    if (C0397.m5814() <= 0) {
                        C0078.m361();
                        c0190 = c01902;
                    } else {
                        str = "ۧۤ";
                        c0190 = c01902;
                        continue;
                    }
                case 1730302:
                    return c0190;
            }
            str = "ۨۢۨ";
        }
    }

    /* renamed from: ۟ۡ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1923(Object obj) {
        String str = "ۥۥۡ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751555) {
                case 39:
                    return str2;
                case 1090:
                    if (C0395.m5698() > 0) {
                        break;
                    } else if (C0383.m5203() <= 0) {
                        C0179.m1427();
                    } else {
                        str = "ۦ۟۟";
                    }
                case 1095:
                    str = "ۥۥۡ";
                    continue;
                case 1182:
                    if (C0074.m307() >= 0) {
                        C0391.m5571();
                    } else {
                        str = "ۡ۟ۦ";
                        continue;
                    }
                case 3293:
                    if (C0369.m3256() <= 0) {
                        str = "ۨۤۦ";
                        str2 = str3;
                    } else {
                        str = "ۤۢۢ";
                        str2 = str3;
                        continue;
                    }
                case 4445:
                    if (C0155.m1294() >= 0) {
                        str2 = null;
                    } else {
                        str = "ۥۨ۠";
                        str2 = null;
                        continue;
                    }
                case 5259:
                case 1730110:
                    str = "ۤۢۢ";
                    continue;
                case 31557:
                    str3 = ((C0222) obj).f364;
                    if (C0279.m2491() >= 0) {
                        C0368.m3171();
                        str = "ۨۨۧ";
                    } else {
                        str = "ۣۦۡ";
                        continue;
                    }
                case 1730083:
                    break;
                case 1730142:
                    if (C0183.m1464() <= 0) {
                        str = "۟۟ۨ";
                    } else {
                        str = "۠ۤۢ";
                        continue;
                    }
            }
            if (C0009.m36() >= 0) {
                C0073.m265();
            } else {
                str = "ۣ۠";
            }
        }
    }

    /* renamed from: ۟ۢۤۦۣ, reason: not valid java name and contains not printable characters */
    public static C0189 m1924(Object obj) {
        String str = "ۢۢۧ";
        C0189 c0189 = null;
        C0189 c01892 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751621) {
                case 931:
                    break;
                case 2092:
                    c01892 = ((C0222) obj).f361;
                    if (C0395.m5698() >= 0) {
                        str = "ۣۨۢ";
                    } else {
                        str = "ۣۣۦ";
                        continue;
                    }
                case 2274:
                    if (C0228.m2012() < 0) {
                        break;
                    } else {
                        str = "ۢ۠ۧ";
                    }
                case 3267:
                    str = "ۥۣ";
                    c0189 = c01892;
                    continue;
                case 4353:
                    if (C0083.m448() >= 0) {
                        str = "ۡۨ۠";
                    } else {
                        str = "ۧۥۧ";
                        continue;
                    }
                case 4449:
                    if (C0191.m1627() >= 0) {
                        C0368.m3171();
                        str = "ۣۧۥ";
                    } else {
                        str = "ۨۢۤ";
                        continue;
                    }
                case 4698:
                case 29551:
                    str = "ۥۣ";
                    continue;
                case 5593:
                    if (C0089.m592() <= 0) {
                        C0074.m307();
                        str = "ۨۨۨ";
                    } else {
                        str = "ۢۢۧ";
                        continue;
                    }
                case 32652:
                    str = "۠ۢۦ";
                    c0189 = null;
                    continue;
                case 1730267:
                    return c0189;
            }
            str = C0379.m5056() <= 0 ? "ۥۥ۠" : "ۣ۠ۧ";
        }
    }

    /* renamed from: ۟ۤۡۨ۟, reason: not valid java name and contains not printable characters */
    public static CountDownLatch m1925(Object obj) {
        String str = "ۦۣۡ";
        CountDownLatch countDownLatch = null;
        CountDownLatch countDownLatch2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755617) {
                case 2120:
                    if (C0376.m4906() <= 0) {
                        C0379.m5056();
                    } else {
                        str = "ۦۣۡ";
                        continue;
                    }
                case 2153:
                    if (C0025.m118() < 0) {
                        break;
                    } else {
                        str = "ۢۡۧ";
                    }
                case 2155:
                case 32481:
                    if (C0086.m500() > 0) {
                        str = "۠ۢۤ";
                    } else {
                        continue;
                    }
                case 2217:
                    if (C0082.m410() >= 0) {
                        countDownLatch = null;
                    } else {
                        str = "۠۠ۤ";
                        countDownLatch = null;
                        continue;
                    }
                case 25283:
                    return countDownLatch;
                case 25349:
                    if (C0386.m5322() > 0) {
                        str = "ۣۧۤ";
                    } else {
                        continue;
                    }
                case 28388:
                    break;
                case 29532:
                    str = "۠ۢۤ";
                    countDownLatch = countDownLatch2;
                    continue;
                case 30624:
                    if (C0378.m4998() <= 0) {
                        C0385.m5282();
                    } else {
                        str = "ۦ۟ۡ";
                        continue;
                    }
                case 31593:
                    countDownLatch2 = ((C0222) obj).f359;
                    str = "ۤۧ۠";
                    continue;
            }
            str = "ۥۥۡ";
        }
    }

    /* renamed from: ۟ۦۧۡۧ, reason: not valid java name and contains not printable characters */
    public static String m1926(Object obj, Object obj2) throws Throwable {
        String str = "ۥۢۧ";
        String str2 = null;
        String strM1907 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748863) {
                case 478:
                    if (C0164.m1359() >= 0) {
                        C0393.m5668();
                    } else {
                        str = "ۥۧۧ";
                        continue;
                    }
                case 4602:
                case 1733539:
                    str = "ۤۤۧ";
                    continue;
                case 4757:
                    if (C0400.m5961() < 0) {
                        break;
                    } else {
                        str = C0386.m5322() <= 0 ? "ۣۤ۟" : "ۢ۠";
                    }
                case 5400:
                    return str2;
                case 5811:
                    if (C0378.m4998() <= 0) {
                        C0179.m1427();
                        str = "۟ۢۥ";
                        str2 = null;
                    } else {
                        str = "ۡ۠۠";
                        str2 = null;
                        continue;
                    }
                case 6240:
                    break;
                case 6426:
                    if (C0089.m592() <= 0) {
                        C0378.m4998();
                        str = "ۧۥۣ";
                        str2 = strM1907;
                    } else {
                        str = "ۤۤۧ";
                        str2 = strM1907;
                        continue;
                    }
                case 28179:
                    if (C0060.m216() <= 0) {
                        C0386.m5322();
                    } else {
                        str = "ۤ۟ۧ";
                        continue;
                    }
                case 28379:
                    str = "ۥۢۧ";
                    continue;
                case 1733441:
                    strM1907 = ((C0222) obj).m1907((String) obj2);
                    str = "ۣۢۤ";
                    continue;
            }
            str = "ۦ۠ۦ";
        }
    }

    /* renamed from: ۟ۦۨۧ۠, reason: not valid java name and contains not printable characters */
    public static void m1927(Object obj, Object obj2, Object obj3) {
        Object obj4 = "ۧۡۦ";
        while (true) {
            switch (C0395.m5690(obj4) ^ 1746943) {
                case 2365:
                case 1735587:
                    obj4 = "۠۠ۦ";
                    continue;
                case 3323:
                    ((C0222) obj).m1912((List<C0190>) obj2, (AbstractC0307<String>) obj3);
                    if (C0387.m5374() < 0) {
                        obj4 = "۠۠ۦ";
                    } else {
                        continue;
                    }
                case 3353:
                    return;
                case 6678:
                    if (C0387.m5374() >= 0) {
                        C0083.m448();
                    } else {
                        obj4 = "ۣ۟";
                        continue;
                    }
                case 25267:
                    if (C0368.m3171() > 0) {
                        break;
                    } else if (C0398.m5833() <= 0) {
                        C0164.m1359();
                    } else {
                        obj4 = "۠ۡۥ";
                    }
                case 26261:
                    break;
                case 28408:
                    if (C0379.m5056() > 0) {
                        obj4 = "ۧۡۦ";
                    } else {
                        continue;
                    }
            }
            obj4 = "ۥۢۦ";
        }
    }

    /* renamed from: ۡ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static String[] m1928(Object obj) {
        Object obj2 = "ۦۥ";
        String[] strArr = null;
        String[] strArr2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 56506) {
                case 5:
                    if (C0420.m6215() >= 0) {
                        break;
                    } else if (C0395.m5698() < 0) {
                        obj2 = "۠۠";
                    }
                case 186:
                    strArr2 = ((C0222) obj).f360;
                    if (C0393.m5668() > 0) {
                        obj2 = "۠ۦۥ";
                    } else {
                        continue;
                    }
                case 1709337:
                case 1729212:
                    if (C0183.m1464() > 0) {
                        obj2 = "ۧۢۢ";
                    } else {
                        continue;
                    }
                case 1710557:
                    return strArr;
                case 1729178:
                    if (C0228.m2012() > 0) {
                        obj2 = "ۢۦۡ";
                    } else {
                        continue;
                    }
                case 1731129:
                    if (C0387.m5374() >= 0) {
                        C0383.m5203();
                        obj2 = "ۦ۟۠";
                    } else {
                        obj2 = "ۨۦۡ";
                        continue;
                    }
                case 1732519:
                    if (C0228.m2012() <= 0) {
                        C0386.m5322();
                        obj2 = "ۣۣۦ";
                        strArr = null;
                    } else {
                        obj2 = "ۣۣۣ";
                        strArr = null;
                        continue;
                    }
                case 1734437:
                    if (C0379.m5056() <= 0) {
                        strArr = strArr2;
                    } else {
                        obj2 = "ۧۢۢ";
                        strArr = strArr2;
                        continue;
                    }
                case 1734523:
                    break;
                case 1735460:
                    if (C0378.m4998() <= 0) {
                        C0380.m5068();
                        obj2 = "ۨۥ";
                    } else {
                        obj2 = "ۦۥ";
                        continue;
                    }
            }
            obj2 = "ۥۤ۟";
        }
    }

    /* renamed from: ۣۣۡۦ, reason: not valid java name and contains not printable characters */
    public static String m1929(Object obj) {
        String str = "۟۠ۢ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1750691) {
                case 96:
                    return str2;
                case 2085:
                    str = "ۡۦ۠";
                    continue;
                case 2825:
                    if (C0369.m3256() <= 0) {
                        C0385.m5282();
                    } else {
                        str = "ۣۨۤ";
                        continue;
                    }
                case 4482:
                    if (C0375.m4840() >= 0) {
                        break;
                    } else {
                        str = C0385.m5282() >= 0 ? "ۡ۟ۨ" : "ۦۤۨ";
                    }
                case 4604:
                    if (C0370.m3284() < 0) {
                        str = "۟۠ۢ";
                    } else {
                        continue;
                    }
                case 6559:
                    break;
                case 6648:
                case 29646:
                    if (C0383.m5203() <= 0) {
                        C0391.m5571();
                    } else {
                        str = "ۣۥۥ";
                        continue;
                    }
                case 30468:
                    str = "ۣۥۥ";
                    str2 = str3;
                    continue;
                case 30537:
                    str3 = ((C0222) obj).f363;
                    if (C0078.m361() > 0) {
                        str = "ۦۣۢ";
                    } else {
                        continue;
                    }
                case 32746:
                    if (C0334.m2866() <= 0) {
                        str2 = null;
                    } else {
                        str = "ۥۧۨ";
                        str2 = null;
                        continue;
                    }
            }
            str = "ۥ۠ۥ";
        }
    }

    /* renamed from: ۣۡۤۡ, reason: not valid java name and contains not printable characters */
    public static void m1930(Object obj) {
        Object obj2 = "ۥۣ۠";
        while (true) {
            switch (C0395.m5690(obj2) ^ 1751497) {
                case 887:
                    break;
                case 1995:
                    if (C0164.m1359() >= 0) {
                        break;
                    } else if (C0385.m5282() >= 0) {
                        C0083.m448();
                    } else {
                        obj2 = "ۧۥۤ";
                    }
                case 3796:
                    obj2 = "ۥۣ۠";
                    continue;
                case 5928:
                case 31822:
                    if (C0395.m5698() >= 0) {
                        C0394.m5672();
                    } else {
                        obj2 = "ۦ۟ۨ";
                        continue;
                    }
                case 5934:
                    if (C0393.m5668() > 0) {
                        obj2 = "ۣۣۧ";
                    } else {
                        continue;
                    }
                case 30854:
                    return;
                case 31759:
                    ((C0222) obj).m1917();
                    if (C0191.m1627() >= 0) {
                        C0380.m5068();
                    } else {
                        obj2 = "ۦ۟ۨ";
                        continue;
                    }
            }
            if (C0009.m36() < 0) {
                obj2 = "ۡۢۨ";
            }
        }
    }

    /* renamed from: ۣۢۧ, reason: not valid java name and contains not printable characters */
    public static C0189 m1931(Object obj, Object obj2) throws Throwable {
        Object obj3 = "ۤۡۤ";
        C0189 c0189 = null;
        C0189 c0189M1906 = null;
        while (true) {
            switch (C0395.m5690(obj3) ^ 1746814) {
                case 2077:
                    if (C0279.m2491() >= 0) {
                        C0397.m5814();
                    } else {
                        obj3 = "ۤۡۤ";
                        continue;
                    }
                case 2559:
                    return c0189;
                case 4442:
                    break;
                case 4540:
                    obj3 = "ۤۦ۠";
                    continue;
                case 5247:
                    obj3 = "ۨۤۢ";
                    continue;
                case 5396:
                    c0189M1906 = ((C0222) obj).m1906((String) obj2);
                    if (C0382.m5180() <= 0) {
                        C0376.m4906();
                    } else {
                        obj3 = "۟ۨ";
                        continue;
                    }
                case 7545:
                    if (C0228.m2012() <= 0) {
                        break;
                    } else if (C0228.m2012() <= 0) {
                        C0074.m307();
                    } else {
                        obj3 = "ۢ۠ۨ";
                    }
                case 7648:
                    if (C0400.m5961() <= 0) {
                        obj3 = "ۣۨ۟";
                        c0189 = null;
                    } else {
                        obj3 = "ۢۥۤ";
                        c0189 = null;
                        continue;
                    }
                case 7833:
                case 28184:
                    obj3 = "ۡ۟۟";
                    continue;
                case 1735831:
                    if (C0376.m4906() <= 0) {
                        C0291.m2568();
                        c0189 = c0189M1906;
                    } else {
                        obj3 = "ۡ۟۟";
                        c0189 = c0189M1906;
                        continue;
                    }
            }
            if (C0395.m5698() < 0) {
                obj3 = "ۣۥۤ";
            }
        }
    }

    /* renamed from: ۣۤۢۡ, reason: not valid java name and contains not printable characters */
    public static void m1932(Object obj) {
        String str = "ۤۢۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750757) {
                case 38:
                case 32545:
                    str = "ۡۢ۠";
                    continue;
                case 486:
                    ((C0222) obj).m1914();
                    str = "ۡۢ۠";
                    continue;
                case 3266:
                    if (C0384.m5278() <= 0) {
                        break;
                    } else if (C0089.m592() <= 0) {
                        C0377.m4944();
                    } else {
                        str = "ۣۧۧ";
                    }
                case 6202:
                    return;
                case 30531:
                    if (C0385.m5282() < 0) {
                        str = "ۤۢۥ";
                    } else {
                        continue;
                    }
                case 32515:
                    break;
                case 1731265:
                    if (C0386.m5322() <= 0) {
                        C0073.m265();
                    } else {
                        str = "ۣۥۥ";
                        continue;
                    }
            }
            if (C0073.m265() <= 0) {
                C0229.m2064();
            } else {
                str = "ۡۥ";
            }
        }
    }

    public void setHost(String str) {
        String str2 = "ۢۢۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1751492) {
                case 2915:
                    this.f363 = str;
                    if (C0387.m5374() < 0) {
                        str2 = "ۨۨۡ";
                        break;
                    } else {
                        C0086.m500();
                        break;
                    }
                case 28709:
                    return;
                case 1729883:
                    if (C0380.m5068() > 0) {
                        str2 = "ۢۢۧ";
                        break;
                    } else {
                        C0179.m1427();
                        str2 = "ۥۢ۠";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̖̙̖, reason: not valid java name and contains not printable characters */
    public void m1933(String str) {
        String str2 = "ۣۤۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1747936) {
                case 1244:
                    return;
                case 4582:
                    this.f364 = str;
                    if (C0279.m2491() < 0) {
                        str2 = "ۡۥ۠";
                        break;
                    } else {
                        C0183.m1464();
                        str2 = "ۤۥ";
                        break;
                    }
                case 25360:
                    str2 = "ۣۤۡ";
                    break;
            }
        }
    }

    /* renamed from: ̗̙̗̖̙̖, reason: not valid java name and contains not printable characters */
    public void m1934() {
        long jM5072 = 0;
        ExecutorService executorServiceM122 = null;
        int i = 0;
        int i2 = 0;
        String[] strArr = null;
        int i3 = 0;
        Integer num = null;
        int i4 = 0;
        AtomicBoolean atomicBoolean = null;
        int i5 = 0;
        AtomicInteger atomicInteger = null;
        String str = "ۢۨۡ";
        while (true) {
            switch (C0395.m5690(str) ^ 1750689) {
                case 165:
                case 30700:
                    if (C0074.m307() >= 0) {
                        C0229.m2064();
                        str = "ۤۥۨ";
                    } else {
                        str = "ۦۦۨ";
                        continue;
                    }
                case 173:
                    i = 0;
                    if (C0399.m5914() <= 0) {
                        C0074.m307();
                    } else {
                        str = "ۥۤ۠";
                        continue;
                    }
                case 1530:
                    str = "ۡۥۡ";
                    num = new Integer(2801435);
                    continue;
                case 2176:
                    if (C0376.m4906() <= 0) {
                        i4 = i;
                    } else {
                        str = "ۦۦۨ";
                        i4 = i;
                        continue;
                    }
                case 2181:
                    executorServiceM122 = C0025.m122(m1928(this).length);
                    if (C0060.m216() <= 0) {
                        C0009.m36();
                        str = "ۣ۟ۧ";
                    } else {
                        str = "ۦۡ۟";
                        continue;
                    }
                case 2208:
                    break;
                case 2919:
                    str = "ۣ۟۠";
                    continue;
                case 2923:
                    return;
                case 3171:
                    C0191.m1638(executorServiceM122, new RunnableC0223(this, strArr[i4], jM5072, atomicBoolean, executorServiceM122, atomicInteger));
                    if (C0228.m2012() > 0) {
                        str = "۠ۤ";
                    } else {
                        continue;
                    }
                case 3304:
                    if (C0088.m573() > 0) {
                        str = "ۢۨۡ";
                    } else {
                        continue;
                    }
                case 6145:
                    this.f359 = new CountDownLatch(((i3 ^ (-1)) & 2801433) | ((-2801434) & i3));
                    if (C0362.m3122() < 0) {
                        str = "ۦۡۢ";
                    } else {
                        continue;
                    }
                case 6556:
                    atomicInteger = new AtomicInteger(0);
                    if (C0346.m3059() < 0) {
                        str = "ۤۦ";
                    } else {
                        continue;
                    }
                case 29478:
                    int iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    if (C0334.m2866() <= 0) {
                        i3 = iIntValue;
                    } else {
                        str = "ۡ۠۟";
                        i3 = iIntValue;
                        continue;
                    }
                case 29833:
                    if (i4 >= i2) {
                        break;
                    } else {
                        str = C0398.m5833() <= 0 ? "ۡۤۨ" : "ۤۧۥ";
                    }
                case 29893:
                    C0384.m5258(executorServiceM122);
                    if (C0384.m5278() <= 0) {
                        C0400.m5961();
                        str = "ۥۣۨ";
                    } else {
                        str = "ۥۡۦ";
                        continue;
                    }
                case 30501:
                    String[] strArrM1928 = m1928(this);
                    if (C0385.m5282() >= 0) {
                        C0379.m5056();
                        str = "ۣۢ";
                        strArr = strArrM1928;
                    } else {
                        str = "ۦ۠ۨ";
                        strArr = strArrM1928;
                        continue;
                    }
                case 30502:
                    C0191.m1650(new Thread(new Runnable(this) { // from class: com.cloudinject.feature.̗̗.-$$Lambda$̗̗$r4_p6kGgaXZNGxw9Tbf9ud28N_w
                        private final C0222 f$0;

                        {
                            String str2 = "ۥ۠۠";
                            while (true) {
                                switch (C0395.m5690((Object) str2) ^ 1751620) {
                                    case 2017:
                                        this.f$0 = this;
                                        if (C0387.m5374() >= 0) {
                                            break;
                                        } else {
                                            str2 = "ۨۦ۟";
                                            break;
                                        }
                                    case 5598:
                                        if (C0086.m500() > 0) {
                                            str2 = "ۥ۠۠";
                                            break;
                                        } else {
                                            str2 = "ۣۡ۠";
                                            break;
                                        }
                                    case 29669:
                                        return;
                                }
                            }
                        }

                        /* renamed from: ۟ۢۥۨۢ, reason: not valid java name and contains not printable characters */
                        public static C0222 m1893(Object obj) {
                            String str2 = "ۥۥۣ";
                            C0222 c0222 = null;
                            C0222 c02222 = null;
                            while (true) {
                                switch (C0395.m5690((Object) str2) ^ 1753634) {
                                    case 2952:
                                    case 29697:
                                        if (C0089.m592() <= 0) {
                                            C0291.m2568();
                                        } else {
                                            str2 = "ۥۦ۠";
                                            continue;
                                        }
                                    case 3040:
                                        c02222 = (($$Lambda$$r4_p6kGgaXZNGxw9Tbf9ud28N_w) obj).f$0;
                                        if (C0387.m5374() >= 0) {
                                            str2 = "ۣۥۢ";
                                        } else {
                                            str2 = "ۣۡۢ";
                                            continue;
                                        }
                                    case 27070:
                                        if (C0382.m5180() <= 0) {
                                            str2 = "ۣ۠ۡ";
                                        } else {
                                            str2 = "ۥۥۣ";
                                            continue;
                                        }
                                    case 27840:
                                        if (C0121.m1023() >= 0) {
                                            c0222 = c02222;
                                        } else {
                                            str2 = "ۥۦ۠";
                                            c0222 = c02222;
                                            continue;
                                        }
                                    case 27943:
                                        break;
                                    case 28952:
                                        if (C0164.m1359() >= 0) {
                                            C0335.m2923();
                                        } else {
                                            str2 = "ۨۦۨ";
                                            continue;
                                        }
                                    case 29026:
                                        if (C0229.m2064() >= 0) {
                                            C0387.m5374();
                                        } else {
                                            str2 = "ۨۤ";
                                            continue;
                                        }
                                    case 31841:
                                        if (C0369.m3256() <= 0) {
                                            break;
                                        } else {
                                            str2 = C0155.m1294() >= 0 ? "ۣ۠ۧ" : "ۨۧۡ";
                                        }
                                    case 31869:
                                        return c0222;
                                    case 1711838:
                                        str2 = "ۢۧ۟";
                                        c0222 = null;
                                        continue;
                                }
                                str2 = "ۢۧۥ";
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str2 = "ۣۨ";
                            while (true) {
                                switch (C0395.m5690((Object) str2) ^ 1755337) {
                                    case 25591:
                                        return;
                                    case 28663:
                                        str2 = "ۣۨ";
                                        break;
                                    case 1709106:
                                        C0073.m266(m1893(this));
                                        if (C0398.m5833() <= 0) {
                                            break;
                                        } else {
                                            str2 = "ۣ۠ۡ";
                                            break;
                                        }
                                }
                            }
                        }
                    }));
                    if (C0088.m573() <= 0) {
                        C0375.m4840();
                        str = "۠ۨ۠";
                    } else {
                        str = "ۢۨ";
                        continue;
                    }
                case 30566:
                    if (C0379.m5056() <= 0) {
                        i4 = i5;
                    } else {
                        str = "ۥۡۢ";
                        i4 = i5;
                        continue;
                    }
                case 30671:
                    int length = strArr.length;
                    if (C0420.m6215() >= 0) {
                        C0089.m592();
                        i2 = length;
                    } else {
                        str = "ۣ۟ۨ";
                        i2 = length;
                        continue;
                    }
                case 1731107:
                    atomicBoolean = new AtomicBoolean(false);
                    str = "ۣۣۧ";
                    continue;
                case 1731237:
                    int i6 = (i4 - 28) + 1 + 28;
                    if (C0391.m5571() <= 0) {
                        str = "ۦۢۡ";
                        i5 = i6;
                    } else {
                        str = "ۦۣۤ";
                        i5 = i6;
                        continue;
                    }
                case 1731303:
                    jM5072 = C0380.m5072();
                    if (C0368.m3171() < 0) {
                        str = "ۥۣۤ";
                    } else {
                        continue;
                    }
            }
            if (C0362.m3122() < 0) {
                str = "ۦۨۦ";
            }
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public void m1935(String[] strArr) {
        String str = "ۨۨۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749697) {
                case 2185:
                    return;
                case 7618:
                    str = "ۨۨۨ";
                    break;
                case 31529:
                    this.f360 = strArr;
                    if (C0420.m6215() < 0) {
                        str = "ۣۤۧ";
                        break;
                    } else {
                        str = "ۧۥۥ";
                        break;
                    }
            }
        }
    }
}
