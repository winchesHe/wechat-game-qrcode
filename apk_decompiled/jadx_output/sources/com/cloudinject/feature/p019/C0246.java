package com.cloudinject.feature.p019;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.DialogInterface;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import androidx.fragment.app.FragmentTransaction;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.model.RemoteShareInfo;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p019.p020.RunnableC0250;
import com.cloudinject.feature.p021.AbstractC0289;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.FragmentC0290;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p021.p022.InterfaceC0275;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
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
import p027.p028.p029.C0420;

@Dex2C
/* renamed from: com.cloudinject.feature.̗̙.̖̙̙, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0246 {

    /* renamed from: ̗̗̖̗̙̖̗, reason: not valid java name and contains not printable characters */
    private static C0246 f416;

    /* renamed from: ̗̗̖̗̖̗̙, reason: not valid java name and contains not printable characters */
    private final AtomicBoolean f417;

    /* renamed from: ̗̗̖̗̙̖̖, reason: not valid java name and contains not printable characters */
    public Map<Activity, AlertDialog> f418;

    /* renamed from: ̗̗̖̗̙̖̙, reason: not valid java name and contains not printable characters */
    private long f419;

    /* renamed from: ̗̗̙̖̗̗̙, reason: not valid java name and contains not printable characters */
    private FragmentC0290 f420;

    /* renamed from: ̗̗̙̖̗̙̗, reason: not valid java name and contains not printable characters */
    public volatile boolean f421;

    private C0246() {
        String str = "ۨۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56382) {
                case 192:
                    this.f421 = false;
                    str = "ۣۨۨ";
                    break;
                case 1709427:
                    this.f419 = 0L;
                    if (C0335.m2923() >= 0) {
                        break;
                    } else {
                        str = "ۤ۟ۢ";
                        break;
                    }
                case 1728951:
                    if (C0206.m1807() < 0) {
                        str = "ۨۦ";
                        break;
                    } else {
                        C0346.m3059();
                        str = "۠ۥۢ";
                        break;
                    }
                case 1730041:
                    this.f417 = new AtomicBoolean(false);
                    str = "ۣۡۧ";
                    break;
                case 1733435:
                    this.f418 = new Hashtable();
                    if (C0370.m3284() >= 0) {
                        break;
                    } else {
                        str = "ۣ۠ۨ";
                        break;
                    }
                case 1734629:
                    return;
            }
        }
    }

    /* renamed from: lambda$_PE1SFBTjHE29XouLg8YLZ-hIy4, reason: not valid java name */
    public static /* synthetic */ void m2179lambda$_PE1SFBTjHE29XouLg8YLZhIy4(C0246 c0246, DialogInterface dialogInterface) {
        String str = "ۦۤۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750754) {
                case 6181:
                    if (C0088.m573() > 0) {
                        str = "ۦۤۨ";
                        break;
                    } else {
                        C0391.m5571();
                        str = "ۧ۠ۧ";
                        break;
                    }
                case 30472:
                    m2198(c0246, dialogInterface);
                    if (C0390.m5512() > 0) {
                        str = "ۨۦۤ";
                        break;
                    } else {
                        str = "ۣۡۡ";
                        break;
                    }
                case 32580:
                    return;
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    static /* synthetic */ long m2181(C0246 c0246, long j) {
        String str = "ۨۦۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754505) {
                case 3118:
                    c0246.f419 = j;
                    str = "ۤۥۤ";
                    break;
                case 28493:
                    if (C0394.m5672() <= 0) {
                        break;
                    } else {
                        str = "ۨۦۥ";
                        break;
                    }
                case 32522:
                    return j;
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    private /* synthetic */ void m2182(DialogInterface dialogInterface) {
        String str = "ۥۥۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748803) {
                case 4358:
                    if (C0155.m1282(this)) {
                        break;
                    } else if (C0078.m361() <= 0) {
                        C0395.m5698();
                        str = "ۣۡ";
                    } else {
                        str = "ۣۢۢ";
                    }
                case 4811:
                    if (C0370.m3284() >= 0) {
                        C0025.m118();
                        str = "ۤۡۢ";
                    } else {
                        str = "ۥۥۥ";
                        continue;
                    }
                case 6432:
                    C0025.m116(C0206.m1837(C0385.m5310(C0383.m5208())));
                    if (C0385.m5282() < 0) {
                        str = "ۦۣۨ";
                    } else {
                        continue;
                    }
                case 27247:
                    break;
                case 27938:
                    m2193(this);
                    if (C0385.m5282() >= 0) {
                        C0346.m3059();
                        str = "ۦۡۨ";
                    } else {
                        str = "ۦۡ";
                        continue;
                    }
                case 1733624:
                    return;
            }
            str = C0378.m4998() <= 0 ? "ۦۤۤ" : "ۦۣۨ";
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    private void m2183(RemoteShareInfo remoteShareInfo, InterfaceC0275 interfaceC0275) {
        String str = "ۣۧۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746818) {
                case 25097:
                    m2202(this, new C0245(this, remoteShareInfo, interfaceC0275));
                    if (C0368.m3171() < 0) {
                        str = "ۧۤۧ";
                        break;
                    } else {
                        C0184.m1524();
                        break;
                    }
                case 25128:
                    return;
                case 26218:
                    if (C0164.m1359() >= 0) {
                        break;
                    } else {
                        str = "ۣۧۧ";
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0002 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2184(com.cloudinject.feature.p021.AbstractC0289 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ۣۧۤ"
        L2:
            int r1 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r2 = 1748801(0x1aaf41, float:2.450592E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 58: goto Le;
                case 390: goto L2d;
                case 1089: goto L66;
                case 5603: goto L17;
                case 5607: goto L8f;
                case 5772: goto Lc9;
                case 6407: goto Lb7;
                case 27367: goto L40;
                case 28199: goto L52;
                case 28325: goto Lbb;
                default: goto Ld;
            }
        Ld:
            goto L2
        Le:
            int r0 = com.cloudinject.core.utils.compat.C0121.m1023()
            if (r0 < 0) goto Lc5
            java.lang.String r0 = "ۣۣۤ"
            goto L2
        L17:
            com.cloudinject.feature.̙̗.̗̙̙ r0 = new com.cloudinject.feature.̙̗.̗̙̙
            r0.<init>()
            r4.f420 = r0
            int r0 = android.net.C0083.m448()
            if (r0 < 0) goto L2a
            com.cloudinject.customview.C0183.m1464()
            java.lang.String r0 = "ۢۨۦ"
            goto L2
        L2a:
            java.lang.String r0 = "ۦ۠۠"
            goto L2
        L2d:
            com.cloudinject.feature.̙̗.̗̙̙ r1 = m2201(r4)
            android.app.FragmentManager r1 = android.net.C0082.m390(r1)
            if (r1 == 0) goto Lbb
            int r1 = android.database.C0074.m307()
            if (r1 >= 0) goto L2
            java.lang.String r0 = "ۤۦۨ"
            goto L2
        L40:
            com.cloudinject.feature.̙̗.̗̙̙ r0 = m2201(r4)
            if (r0 != 0) goto Le
            int r0 = com.cloudinject.feature.model.p014.C0191.m1627()
            if (r0 < 0) goto L4f
            java.lang.String r0 = "ۣۨۦ"
            goto L2
        L4f:
            java.lang.String r0 = "ۤۦۤ"
            goto L2
        L52:
            com.cloudinject.feature.̙̗.̗̙̙ r1 = m2201(r4)
            com.cloudinject.feature.p023.C0335.m2936(r1, r5)
            int r1 = com.cloudinject.core.p013.C0179.m1427()
            if (r1 > 0) goto L63
            com.cloudinject.feature.p018.C0229.m2064()
            goto L2
        L63:
            java.lang.String r0 = "ۡۡۧ"
            goto L2
        L66:
            android.app.Activity r1 = mirrorb.android.providers.C0391.m5560()
            android.app.FragmentManager r1 = androidx.core.p007.C0088.m555(r1)
            android.app.FragmentTransaction r1 = com.cloudinject.core.p013.C0179.m1430(r1)
            com.cloudinject.feature.̙̗.̗̙̙ r2 = m2201(r4)
            java.lang.String r3 = mirrorb.android.net.wifi.C0388.m5459()
            java.lang.String r3 = mirrorb.android.location.C0385.m5310(r3)
            android.app.FragmentTransaction r1 = androidx.core.p007.C0089.m608(r1, r2, r3)
            mirrorb.com.android.internal.C0398.m5848(r1)
            int r1 = com.cloudinject.feature.p021.p022.C0279.m2491()
            if (r1 >= 0) goto L2
            java.lang.String r0 = "ۤ۟ۨ"
            goto L2
        L8f:
            com.cloudinject.feature.̙̗.̗̙̙ r0 = m2201(r4)
            android.app.FragmentManager r0 = android.net.C0082.m390(r0)
            android.app.FragmentTransaction r0 = com.cloudinject.core.p013.C0179.m1430(r0)
            com.cloudinject.feature.̙̗.̗̙̙ r1 = m2201(r4)
            android.app.FragmentTransaction r0 = androidx.core.graphics.drawable.C0086.m497(r0, r1)
            mirrorb.com.android.internal.C0398.m5848(r0)
            int r0 = mirrorb.android.net.wifi.C0387.m5374()
            if (r0 < 0) goto Lb3
            androidx.core.p007.C0088.m573()
            java.lang.String r0 = "ۦ۠ۤ"
            goto L2
        Lb3:
            java.lang.String r0 = "۠ۡۡ"
            goto L2
        Lb7:
            java.lang.String r0 = "ۣۧۤ"
            goto L2
        Lbb:
            int r1 = com.cloudinject.feature.p018.C0228.m2012()
            if (r1 <= 0) goto L2
            java.lang.String r0 = "۠ۡۡ"
            goto L2
        Lc5:
            java.lang.String r0 = "ۡۡۧ"
            goto L2
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p019.C0246.m2184(com.cloudinject.feature.̙̗.̗̙̗):void");
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    static /* synthetic */ void m2185(C0246 c0246) {
        String str = "ۡۢۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747742) {
                case 1528:
                    m2193(c0246);
                    if (C0384.m5278() > 0) {
                        str = "ۥۣۣ";
                        break;
                    } else {
                        C0335.m2923();
                        break;
                    }
                case 5403:
                    return;
                case 26909:
                    str = "ۡۢۧ";
                    break;
            }
        }
    }

    /* renamed from: ̗̖̖̗̗̙, reason: not valid java name and contains not printable characters */
    public static C0246 m2186() {
        String str = "۠ۡ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747686) {
                case 25:
                    if (m2194() != null) {
                        break;
                    } else if (C0393.m5668() <= 0) {
                        C0383.m5203();
                    } else {
                        str = "ۥ۟ۢ";
                    }
                case 1511:
                    str = "۠ۡ۠";
                    continue;
                case 5998:
                    f416 = new C0246();
                    if (C0025.m118() > 0) {
                        str = "ۦۤۨ";
                    } else {
                        continue;
                    }
                case 25505:
                    break;
                case 27404:
                    return m2194();
            }
            str = C0383.m5203() <= 0 ? "۟۠ۡ" : "ۦۤۨ";
        }
    }

    /* renamed from: ̗̖̖̗̙̗, reason: not valid java name and contains not printable characters */
    private AlertDialog m2187() {
        return (AlertDialog) C0078.m334(C0369.m3249(this), C0391.m5560());
    }

    /* renamed from: ̗̙̖̗̗̗, reason: not valid java name and contains not printable characters */
    private void m2188() {
        AlertDialog alertDialogM2195 = null;
        String str = "۠ۨ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753573) {
                case 1986:
                case 31756:
                    break;
                case 27141:
                    C0191.m1638(C0378.m4991(), new RunnableC0250());
                    if (C0370.m3284() < 0) {
                        str = "ۢۡۤ";
                    } else {
                        continue;
                    }
                case 27186:
                    alertDialogM2195 = m2195(this);
                    str = "ۥۥۦ";
                    continue;
                case 29536:
                    return;
                case 31527:
                    try {
                        C0206.m1815(alertDialogM2195);
                        if (C0391.m5571() > 0) {
                            str = "۠ۨۨ";
                        } else {
                            continue;
                        }
                    } catch (Throwable th) {
                        if (C0380.m5068() <= 0) {
                            C0191.m1627();
                            str = "ۣۣۤ";
                        } else {
                            str = "ۥۢۦ";
                        }
                    }
                case 32675:
                    if (alertDialogM2195 == null) {
                        break;
                    } else {
                        str = "ۤۧۥ";
                    }
                case 32748:
                    if (C0375.m4840() >= 0) {
                        str = "ۨۧۨ";
                    } else {
                        str = "ۤۧۥ";
                        continue;
                    }
                case 1711364:
                    str = "۠ۨ۟";
                    continue;
            }
            str = C0164.m1359() >= 0 ? "۠ۡ" : "۠ۨۨ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d9 A[SYNTHETIC] */
    /* renamed from: ̗̙̙̗̗̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2189() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p019.C0246.m2189():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:109:0x000c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ad A[SYNTHETIC] */
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.app.AlertDialog m2190(com.cloudinject.feature.model.RemoteShareInfo r15) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p019.C0246.m2190(com.cloudinject.feature.model.RemoteShareInfo):android.app.AlertDialog");
    }

    /* renamed from: ۟ۡ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m2192(Object obj) {
        Object obj2 = "ۨ۠ۡ";
        AtomicBoolean atomicBoolean = null;
        AtomicBoolean atomicBoolean2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 56354) {
                case 162:
                    atomicBoolean2 = ((C0246) obj).f417;
                    if (C0396.m5741() >= 0) {
                        C0378.m4998();
                    } else {
                        obj2 = "۠ۡۢ";
                        continue;
                    }
                case 1709259:
                    if (C0400.m5961() <= 0) {
                        break;
                    } else if (C0384.m5278() > 0) {
                        obj2 = "ۤۤ";
                    }
                case 1709383:
                    break;
                case 1710529:
                    if (C0334.m2866() <= 0) {
                        C0291.m2568();
                    } else {
                        obj2 = "ۢۧۦ";
                        continue;
                    }
                case 1711651:
                    obj2 = "ۨ۠ۡ";
                    continue;
                case 1730141:
                    obj2 = "ۤۦ۟";
                    continue;
                case 1730239:
                    if (C0370.m3284() >= 0) {
                        C0191.m1627();
                        atomicBoolean = null;
                    } else {
                        obj2 = "ۧۦۢ";
                        atomicBoolean = null;
                        continue;
                    }
                case 1731176:
                case 1732451:
                    if (C0089.m592() <= 0) {
                        C0346.m3059();
                    } else {
                        obj2 = "ۣۢ۠";
                        continue;
                    }
                case 1732253:
                    return atomicBoolean;
                case 1734435:
                    obj2 = "ۣۢ۠";
                    atomicBoolean = atomicBoolean2;
                    continue;
            }
            if (C0206.m1807() >= 0) {
                C0399.m5914();
            } else {
                obj2 = "ۤۥ۠";
            }
        }
    }

    /* renamed from: ۟ۢۦۣۧ, reason: not valid java name and contains not printable characters */
    public static void m2193(Object obj) {
        String str = "ۣۤ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746937) {
                case 3175:
                    break;
                case 4441:
                    if (C0383.m5203() > 0) {
                        str = "ۣ۟ۨ";
                    } else {
                        continue;
                    }
                case 4455:
                    if (C0384.m5278() <= 0) {
                        break;
                    } else if (C0393.m5668() <= 0) {
                        C0334.m2866();
                        str = "ۦۡۥ";
                    } else {
                        str = "ۣ۟۠";
                    }
                case 4597:
                case 26141:
                    str = "ۧۦۢ";
                    continue;
                case 4605:
                    ((C0246) obj).m2189();
                    if (C0375.m4840() >= 0) {
                        str = "ۥۨۢ";
                    } else {
                        str = "ۧۦۢ";
                        continue;
                    }
                case 5563:
                    if (C0378.m4998() <= 0) {
                        C0370.m3284();
                        str = "ۨۢ";
                    } else {
                        str = "ۣۤ۟";
                        continue;
                    }
                case 25114:
                    return;
            }
            if (C0384.m5278() <= 0) {
                C0060.m216();
            } else {
                str = "ۣۤۡ";
            }
        }
    }

    /* renamed from: ۟ۤۦۡۧ, reason: not valid java name and contains not printable characters */
    public static C0246 m2194() {
        String str = "۟ۤۦ";
        C0246 c0246 = null;
        C0246 c02462 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752670) {
                case 31:
                case 3420:
                    if (C0074.m307() < 0) {
                        str = "۟ۤ";
                    } else {
                        continue;
                    }
                case 981:
                    if (C0392.m5595() <= 0) {
                        str = "ۣ۟۟";
                    } else {
                        str = "ۣۡۤ";
                        continue;
                    }
                case 1981:
                    if (C0082.m410() >= 0) {
                        C0183.m1464();
                        str = "ۦۨۦ";
                        c0246 = c02462;
                    } else {
                        str = "۟ۤ";
                        c0246 = c02462;
                        continue;
                    }
                case 4444:
                    if (C0088.m573() <= 0) {
                        c0246 = null;
                    } else {
                        str = "ۧۤۦ";
                        c0246 = null;
                        continue;
                    }
                case 6429:
                    c02462 = f416;
                    if (C0396.m5741() < 0) {
                        str = "ۤ۠۟";
                    } else {
                        continue;
                    }
                case 6655:
                    if (C0279.m2491() > 0) {
                        break;
                    } else if (C0083.m448() < 0) {
                        str = "۟ۡۥ";
                    }
                case 31703:
                    break;
                case 31735:
                    if (C0397.m5814() <= 0) {
                        C0291.m2568();
                        str = "ۢۢۨ";
                    } else {
                        str = "ۢۥۥ";
                        continue;
                    }
                case 1729113:
                    if (C0387.m5374() >= 0) {
                        C0400.m5961();
                    } else {
                        str = "۟ۤۦ";
                        continue;
                    }
                case 1729979:
                    return c0246;
            }
            str = "ۥ۟ۥ";
        }
    }

    /* renamed from: ۟ۤۧۢ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m2195(Object obj) {
        String str = "ۣۥۡ";
        AlertDialog alertDialog = null;
        AlertDialog alertDialogM2187 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752740) {
                case 1859:
                    alertDialogM2187 = ((C0246) obj).m2187();
                    str = "ۣۣۡ";
                    continue;
                case 2075:
                    if (C0074.m307() > 0) {
                        break;
                    } else if (C0376.m4906() <= 0) {
                        C0397.m5814();
                    } else {
                        str = "ۣۤ۠";
                    }
                case 2085:
                    if (C0381.m5127() <= 0) {
                        alertDialog = alertDialogM2187;
                    } else {
                        str = "ۡ۠ۦ";
                        alertDialog = alertDialogM2187;
                        continue;
                    }
                case 3099:
                    if (C0420.m6215() < 0) {
                        str = "ۣۥۡ";
                    } else {
                        continue;
                    }
                case FragmentTransaction.TRANSIT_FRAGMENT_FADE /* 4099 */:
                    return alertDialog;
                case 4414:
                case 30534:
                    if (C0378.m4998() > 0) {
                        str = "ۡ۠ۦ";
                    } else {
                        continue;
                    }
                case 5510:
                    str = "ۨۨۢ";
                    continue;
                case 30595:
                    if (C0334.m2866() <= 0) {
                        C0376.m4906();
                        str = "ۥۢۤ";
                        alertDialog = null;
                    } else {
                        str = "۠ۢۤ";
                        alertDialog = null;
                        continue;
                    }
                case 32547:
                    if (C0382.m5180() <= 0) {
                        C0399.m5914();
                    } else {
                        str = "ۨۢۡ";
                        continue;
                    }
                case 1729083:
                    break;
            }
            str = "ۦۡۢ";
        }
    }

    /* renamed from: ۟ۦۨۨۤ, reason: not valid java name and contains not printable characters */
    public static void m2196(Object obj, Object obj2, Object obj3) {
        Object obj4 = "۠ۥۡ";
        while (true) {
            switch (C0395.m5690(obj4) ^ 1747897) {
                case 135:
                    return;
                case 156:
                    break;
                case 197:
                    if (C0086.m500() <= 0) {
                        break;
                    } else if (C0398.m5833() > 0) {
                        obj4 = "ۣ۟۠";
                    }
                case 1331:
                case 27347:
                    if (C0184.m1524() >= 0) {
                        obj4 = "ۦۧۧ";
                    } else {
                        obj4 = "ۣ۠ۡ";
                        continue;
                    }
                case 3269:
                    ((C0246) obj).m2183((RemoteShareInfo) obj2, (InterfaceC0275) obj3);
                    if (C0389.m5481() > 0) {
                        obj4 = "ۣ۠ۡ";
                    } else {
                        continue;
                    }
                case 5535:
                    obj4 = "۠ۥۡ";
                    continue;
                case 7582:
                    if (C0009.m36() >= 0) {
                        C0381.m5127();
                    } else {
                        obj4 = "ۡ۟ۨ";
                        continue;
                    }
            }
            obj4 = "ۣ۠ۤ";
        }
    }

    /* renamed from: ۟ۦۨۨۦ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m2197(Object obj, Object obj2) {
        String str = "۠ۦۦ";
        AlertDialog alertDialog = null;
        AlertDialog alertDialogM2190 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747874) {
                case 2:
                    if (C0346.m3059() > 0) {
                        break;
                    } else {
                        str = C0369.m3256() <= 0 ? "ۦ۟ۦ" : "ۣۨ";
                    }
                case 949:
                    if (C0386.m5322() <= 0) {
                        str = "ۦۨ۠";
                    } else {
                        str = "ۡۧۧ";
                        continue;
                    }
                case 1059:
                case 5541:
                    str = "ۥۦۧ";
                    continue;
                case 1378:
                    str = "ۥۦۧ";
                    alertDialog = alertDialogM2190;
                    continue;
                case 5572:
                    return alertDialog;
                case 6392:
                    str = "۠ۦۦ";
                    continue;
                case 7522:
                    break;
                case 27178:
                    str = "۟ۨ۠";
                    alertDialog = null;
                    continue;
                case 1734424:
                    if (C0388.m5430() <= 0) {
                        C0074.m307();
                        str = "ۣۤ۟";
                    } else {
                        str = "ۦۣۡ";
                        continue;
                    }
                case 1734489:
                    alertDialogM2190 = ((C0246) obj).m2190((RemoteShareInfo) obj2);
                    str = "ۡۡ۠";
                    continue;
            }
            if (C0383.m5203() <= 0) {
                C0376.m4906();
            } else {
                str = "ۦ۠";
            }
        }
    }

    /* renamed from: ۣۢۡ, reason: not valid java name and contains not printable characters */
    public static void m2198(Object obj, Object obj2) {
        Object obj3 = "ۢۥۨ";
        while (true) {
            switch (C0395.m5690(obj3) ^ 1755588) {
                case 236:
                case 3151:
                    obj3 = "ۥۢ";
                    continue;
                case 31365:
                    ((C0246) obj).m2182((DialogInterface) obj2);
                    if (C0155.m1294() >= 0) {
                        C0388.m5430();
                    } else {
                        obj3 = "ۥۢ";
                        continue;
                    }
                case 31425:
                    if (C0082.m410() >= 0) {
                        break;
                    } else if (C0060.m216() > 0) {
                        obj3 = "ۢۧۦ";
                    }
                case 31483:
                    if (C0184.m1524() < 0) {
                        obj3 = "ۢۥۨ";
                    } else {
                        continue;
                    }
                case 31655:
                    break;
                case 32588:
                    obj3 = "ۨۢۢ";
                    continue;
                case 1709401:
                    return;
            }
            if (C0388.m5430() > 0) {
                obj3 = "ۣۣۨ";
            }
        }
    }

    /* renamed from: ۥۣ۟ۨ, reason: contains not printable characters */
    public static void m2199(Object obj) {
        String str = "۠ۢۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749694) {
                case 245:
                    str = "۠ۢۥ";
                    continue;
                case 484:
                case 7460:
                    if (C0379.m5056() > 0) {
                        str = "ۣۧۦ";
                    } else {
                        continue;
                    }
                case 1468:
                    return;
                case 2203:
                    break;
                case 3224:
                    ((C0246) obj).m2188();
                    str = "ۣۧۦ";
                    continue;
                case 5479:
                    if (C0379.m5056() <= 0) {
                        C0083.m448();
                        str = "ۥۡ۟";
                    } else {
                        str = "ۢۨ۠";
                        continue;
                    }
                case 6557:
                    if (C0376.m4906() <= 0) {
                        break;
                    } else if (C0229.m2064() < 0) {
                        str = "ۥۤۥ";
                    }
            }
            str = "۟ۦ۠";
        }
    }

    /* renamed from: ۦ۠ۤۢ, reason: contains not printable characters */
    public static long m2200(Object obj) {
        String str = "ۧ۟ۨ";
        long j = 0;
        long j2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751590) {
                case 110:
                    str = "ۧ۟ۨ";
                    continue;
                case 994:
                    return j;
                case 2222:
                    if (C0025.m118() <= 0) {
                        C0384.m5278();
                        str = "ۤۥ۠";
                    } else {
                        str = "ۣۨۧ";
                        continue;
                    }
                case 2360:
                    break;
                case 7547:
                    if (C0206.m1807() >= 0) {
                        j = j2;
                    } else {
                        str = "ۤ۟۟";
                        j = j2;
                        continue;
                    }
                case 29519:
                case 29666:
                    if (C0228.m2012() <= 0) {
                        C0390.m5512();
                    } else {
                        str = "ۤ۟۟";
                        continue;
                    }
                case 30726:
                    if (C0378.m4998() <= 0) {
                        j = 0;
                    } else {
                        str = "ۢۡۧ";
                        j = 0;
                        continue;
                    }
                case 32566:
                    if (C0384.m5278() <= 0) {
                        break;
                    } else {
                        str = "ۣۢ";
                    }
                case 32642:
                    if (C0380.m5068() <= 0) {
                        C0121.m1023();
                    } else {
                        str = "ۦۦ۠";
                        continue;
                    }
                case 1730169:
                    j2 = ((C0246) obj).f419;
                    str = "۟ۢ۠";
                    continue;
            }
            if (C0025.m118() <= 0) {
                C0390.m5512();
                str = "ۧۢۡ";
            } else {
                str = "ۧۤۡ";
            }
        }
    }

    /* renamed from: ۧۨۧۨ, reason: not valid java name and contains not printable characters */
    public static FragmentC0290 m2201(Object obj) {
        Object obj2 = "ۣ۠ۤ";
        FragmentC0290 fragmentC0290 = null;
        FragmentC0290 fragmentC02902 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1746757) {
                case 25:
                    if (C0393.m5668() <= 0) {
                        obj2 = "ۢۧۤ";
                    } else {
                        obj2 = "ۤۡ";
                        continue;
                    }
                case 218:
                    obj2 = "ۣ۠ۤ";
                    continue;
                case 3076:
                    if (C0025.m118() <= 0) {
                        break;
                    } else if (C0191.m1627() >= 0) {
                        C0394.m5672();
                    } else {
                        obj2 = "ۣ۟ۧ";
                    }
                case 3143:
                    if (C0121.m1023() < 0) {
                        obj2 = "ۣۨۡ";
                    } else {
                        continue;
                    }
                case 4353:
                case 1735480:
                    if (C0291.m2568() >= 0) {
                        C0121.m1023();
                        obj2 = "۟۠ۧ";
                    } else {
                        obj2 = "ۧۢۤ";
                        continue;
                    }
                case 4430:
                    fragmentC02902 = ((C0246) obj).f420;
                    if (C0386.m5322() > 0) {
                        obj2 = "ۤۧ";
                    } else {
                        continue;
                    }
                case 25132:
                    return fragmentC0290;
                case 28239:
                    obj2 = "۟ۢ۟";
                    fragmentC0290 = null;
                    continue;
                case 28565:
                    break;
                case 1735622:
                    if (C0086.m500() <= 0) {
                        C0121.m1023();
                        fragmentC0290 = fragmentC02902;
                    } else {
                        obj2 = "ۧۢۤ";
                        fragmentC0290 = fragmentC02902;
                        continue;
                    }
            }
            if (C0334.m2866() <= 0) {
                C0381.m5127();
            } else {
                obj2 = "ۣ۠ۡ";
            }
        }
    }

    /* renamed from: ۨۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m2202(Object obj, Object obj2) {
        Object obj3 = "ۧ۟۠";
        while (true) {
            switch (C0395.m5690(obj3) ^ 1748858) {
                case 127:
                case 5528:
                    if (C0179.m1427() <= 0) {
                        C0385.m5282();
                        obj3 = "۟ۧۨ";
                    } else {
                        obj3 = "۠ۥۥ";
                        continue;
                    }
                case 466:
                    if (C0385.m5282() < 0) {
                        obj3 = "ۧ۟۠";
                    } else {
                        continue;
                    }
                case 467:
                    ((C0246) obj).m2184((AbstractC0289) obj2);
                    if (C0385.m5282() < 0) {
                        obj3 = "۠ۥۥ";
                    } else {
                        continue;
                    }
                case 1274:
                    return;
                case 6616:
                    if (C0025.m118() > 0) {
                        obj3 = "ۣۡۧ";
                    } else {
                        continue;
                    }
                case 27199:
                    break;
                case 27250:
                    if (C0088.m573() <= 0) {
                        break;
                    } else {
                        obj3 = "ۡ۠ۨ";
                    }
            }
            obj3 = "ۣۣۤ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0085 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2203(com.cloudinject.feature.model.RemoteShareInfo r4) {
        /*
            r3 = this;
            java.lang.String r0 = "ۨۡۧ"
        L2:
            int r1 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r2 = 1746787(0x1aa763, float:2.44777E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 2528: goto Le;
                case 3252: goto L1b;
                case 5417: goto L38;
                case 5537: goto L9a;
                case 5571: goto Lad;
                case 6852: goto L18;
                case 7484: goto L6e;
                case 7494: goto Le;
                case 7845: goto L3e;
                case 25124: goto L2b;
                case 25289: goto L7f;
                case 25322: goto Lad;
                case 28235: goto L90;
                case 28269: goto L59;
                default: goto Ld;
            }
        Ld:
            goto L2
        Le:
            int r1 = com.cloudinject.feature.p015.C0206.m1807()
            if (r1 < 0) goto La9
            android.net.C0082.m410()
            goto L2
        L18:
            java.lang.String r0 = "ۡ۟ۡ"
            goto L2
        L1b:
            m2197(r3, r4)
            int r1 = mirrorb.android.media.session.C0386.m5322()
            if (r1 > 0) goto L28
            android.net.wifi.C0078.m361()
            goto L2
        L28:
            java.lang.String r0 = "ۢ۟ۧ"
            goto L2
        L2b:
            r1 = 1
            android.net.C0082.m420(r3, r1)
            int r1 = com.px.C0368.m3171()
            if (r1 >= 0) goto L2
            java.lang.String r0 = "ۢۢ۠"
            goto L2
        L38:
            m2199(r3)
            java.lang.String r0 = "ۥ۠ۢ"
            goto L2
        L3e:
            int r1 = com.px.C0368.m3189()
            java.lang.Integer r2 = android.app.C0009.m40(r4)
            int r2 = mirrorb.com.android.internal.view.C0397.m5774(r2)
            if (r1 >= r2) goto L9a
            int r1 = android.arch.lifecycle.p000.C0025.m118()
            if (r1 > 0) goto L56
            com.cloudinject.feature.p018.C0228.m2012()
            goto L2
        L56:
            java.lang.String r0 = "۠ۨ۟"
            goto L2
        L59:
            boolean r0 = com.cloudinject.core.p009.p011.C0155.m1282(r3)
            if (r0 == 0) goto L7f
            int r0 = androidx.core.p007.C0088.m573()
            if (r0 > 0) goto L6b
            mirrorb.android.hardware.location.C0383.m5203()
            java.lang.String r0 = "ۣۣۦ"
            goto L2
        L6b:
            java.lang.String r0 = "ۣۧۥ"
            goto L2
        L6e:
            r1 = 0
            android.net.C0082.m420(r3, r1)
            int r1 = p027.p028.p029.C0420.m6215()
            if (r1 < 0) goto L7c
            mirrorb.com.android.internal.app.C0394.m5672()
            goto L2
        L7c:
            java.lang.String r0 = "ۤ۟ۡ"
            goto L2
        L7f:
            int r0 = mirrorb.android.hardware.location.C0383.m5203()
            if (r0 > 0) goto L8c
            androidx.core.p007.C0088.m573()
            java.lang.String r0 = "۟ۤۤ"
            goto L2
        L8c:
            java.lang.String r0 = "ۤۤ۟"
            goto L2
        L90:
            int r1 = android.arch.p003.p005.C0060.m216()
            if (r1 <= 0) goto L2
            java.lang.String r0 = "ۨۡۧ"
            goto L2
        L9a:
            int r1 = android.app.C0009.m36()
            if (r1 < 0) goto La5
            com.cloudinject.core.utils.compat.C0121.m1023()
            goto L2
        La5:
            java.lang.String r0 = "ۧۡۡ"
            goto L2
        La9:
            java.lang.String r0 = "ۢۢ۠"
            goto L2
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p019.C0246.m2203(com.cloudinject.feature.model.RemoteShareInfo):void");
    }

    /* renamed from: ̗̙̖̙, reason: not valid java name and contains not printable characters */
    public void m2204(boolean z) {
        String str = "ۣۦۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748893) {
                case 1248:
                    if (C0073.m265() <= 0) {
                        C0191.m1627();
                    } else {
                        str = "ۨۨۥ";
                        continue;
                    }
                case 5596:
                    C0164.m1375(this);
                    if (C0384.m5278() > 0) {
                        str = "۠ۥۢ";
                    } else {
                        continue;
                    }
                case 6466:
                    this.f421 = z;
                    if (C0377.m4944() <= 0) {
                        C0291.m2568();
                        str = "ۨۦ۠";
                    } else {
                        str = "ۨۡۦ";
                        continue;
                    }
                case 6591:
                    break;
                case 7549:
                    if (C0390.m5512() <= 0) {
                        C0228.m2012();
                        str = "ۡۢۧ";
                    } else {
                        str = "ۣۦۢ";
                        continue;
                    }
                case 26232:
                case 27350:
                    if (C0060.m216() > 0) {
                        str = "ۨۨۤ";
                    } else {
                        continue;
                    }
                case 26233:
                    return;
                case 26256:
                    if (!z) {
                        break;
                    } else if (C0025.m118() <= 0) {
                        C0396.m5741();
                    } else {
                        str = "ۣۤ۠";
                    }
                case 27032:
                    C0074.m298(this);
                    str = "ۨۨۤ";
                    continue;
            }
            if (C0392.m5595() <= 0) {
                C0368.m3171();
                str = "۠ۧ۠";
            } else {
                str = "ۧۧۥ";
            }
        }
    }
}
