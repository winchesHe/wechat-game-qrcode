package com.cloudinject.feature.p019;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.content.DialogInterface;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.model.C0201;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p019.p020.RunnableC0248;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p021.p022.InterfaceC0275;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
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
/* renamed from: com.cloudinject.feature.̗̙.̗̗̗, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0257 {

    /* renamed from: ̗̗̙̗̖̖̙, reason: not valid java name and contains not printable characters */
    private static C0257 f439;

    /* renamed from: ̗̗̙̗̙̖̗, reason: not valid java name and contains not printable characters */
    private static AtomicBoolean f440 = new AtomicBoolean(false);

    /* renamed from: ̗̗̖̗̙̖̖, reason: not valid java name and contains not printable characters */
    public Map<Activity, AlertDialog> f441;

    /* renamed from: ̗̗̖̗̙̙̙, reason: not valid java name and contains not printable characters */
    private AtomicBoolean f442;

    /* renamed from: ̗̗̙̖̗̙̗, reason: not valid java name and contains not printable characters */
    public volatile boolean f443;

    private C0257() {
        String str = "ۡ۟۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754377) {
                case 3151:
                    this.f442 = new AtomicBoolean(false);
                    if (C0229.m2064() < 0) {
                        str = "۠ۦۥ";
                        break;
                    } else {
                        C0377.m4944();
                        str = "ۢۤۤ";
                        break;
                    }
                case 27531:
                    this.f443 = false;
                    if (C0291.m2568() < 0) {
                        str = "ۣۨۡ";
                        break;
                    } else {
                        C0391.m5571();
                        break;
                    }
                case 28237:
                    str = "ۡ۟۠";
                    break;
                case 28310:
                    this.f441 = new Hashtable();
                    if (C0078.m361() > 0) {
                        str = "ۣۦۢ";
                        break;
                    } else {
                        C0082.m410();
                        break;
                    }
                case 29654:
                    return;
            }
        }
    }

    /* renamed from: lambda$-PAkDLu4fTPS7c-hdr3Qces_OKw, reason: not valid java name */
    public static /* synthetic */ void m2286lambda$PAkDLu4fTPS7chdr3Qces_OKw(C0257 c0257, DialogInterface dialogInterface) {
        String str = "ۤۨۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748707) {
                case 2328:
                    if (C0121.m1023() < 0) {
                        str = "ۤۨۤ";
                        break;
                    } else {
                        C0394.m5672();
                        break;
                    }
                case 5123:
                    m2304(c0257, dialogInterface);
                    str = "ۢ۠ۥ";
                    break;
                case 7300:
                    return;
            }
        }
    }

    /* renamed from: lambda$eOkF9rtkf9mWiSYTgi-aXtxc3ZA, reason: not valid java name */
    public static /* synthetic */ boolean m2287lambda$eOkF9rtkf9mWiSYTgiaXtxc3ZA(InterfaceC0275 interfaceC0275, TextView textView, int i, KeyEvent keyEvent) {
        String str = "ۦۥ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754412) {
                case 1836:
                    return m2302(interfaceC0275, textView, i, keyEvent);
                case 1710347:
                    if (C0391.m5571() > 0) {
                        str = "ۦۥ۟";
                        break;
                    } else {
                        C0074.m307();
                        str = "ۧۧ۠";
                        break;
                    }
            }
        }
    }

    public static /* synthetic */ void lambda$rz29sgtU4jwZpkCdFfpVuoKbGJI(C0257 c0257, EditText editText, Context context, View view) {
        String str = "ۣۤۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755337) {
                case 303:
                    return;
                case 29327:
                    m2303(c0257, editText, context, view);
                    if (C0291.m2568() >= 0) {
                        break;
                    } else {
                        str = "ۨۨۦ";
                        break;
                    }
                case 32364:
                    str = "ۣۤۥ";
                    break;
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    private /* synthetic */ void m2289(EditText editText, Context context, View view) {
        String strM250 = null;
        String str = "ۢۢۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746789) {
                case 2298:
                case 7619:
                    return;
                case 5538:
                    if (!C0164.m1363(strM250)) {
                        break;
                    } else if (C0381.m5127() <= 0) {
                        C0089.m592();
                    } else {
                        str = "ۨۢۨ";
                    }
                case 5570:
                    strM250 = C0073.m250(C0383.m5212(editText));
                    if (C0388.m5430() <= 0) {
                        C0291.m2568();
                    } else {
                        str = "ۣۢۨ";
                        continue;
                    }
                case 7817:
                    break;
                case 24903:
                    if (C0121.m1023() >= 0) {
                        C0386.m5322();
                    } else {
                        str = "ۢۢۧ";
                        continue;
                    }
                case 25165:
                    m2309(this, strM250);
                    str = "ۡۨۦ";
                    continue;
                case 28235:
                    C0089.m625(C0393.m5650(context, C0385.m5310(C0368.m3197()), 0));
                    if (C0082.m410() >= 0) {
                        C0025.m118();
                    } else {
                        str = "ۤۦۨ";
                        continue;
                    }
            }
            str = "ۧ۠ۡ";
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    private static /* synthetic */ boolean m2290(InterfaceC0275 interfaceC0275, TextView textView, int i, KeyEvent keyEvent) {
        String str = "ۡ۠ۡ";
        Integer num = null;
        int iIntValue = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753414) {
                case 836:
                    return true;
                case 28642:
                    C0074.m327(interfaceC0275, ((iIntValue ^ (-1)) & 6243515) | ((-6243516) & iIntValue));
                    if (C0394.m5672() <= 0) {
                        C0400.m5961();
                        str = "ۡۥۨ";
                    } else {
                        str = "ۦۥۡ";
                        continue;
                    }
                case 28644:
                    num = new Integer(-6243516);
                    if (C0395.m5698() >= 0) {
                        str = "ۦۦ۠";
                    } else {
                        str = "ۤۨ";
                        continue;
                    }
                case 29454:
                    if (C0377.m4944() > 0) {
                        str = "ۡ۠ۡ";
                    } else {
                        continue;
                    }
                case 30542:
                    return false;
                case 32623:
                    break;
                case 1711480:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    if (C0291.m2568() >= 0) {
                        C0362.m3122();
                        str = "۟ۥۢ";
                    } else {
                        str = "ۣۡ۠";
                        continue;
                    }
                case 1711554:
                    if (i != 6) {
                        break;
                    } else {
                        str = C0399.m5914() <= 0 ? "۠۠۟" : "ۢ۠";
                    }
            }
            if (C0376.m4906() <= 0) {
                C0335.m2923();
                str = "ۢۨۧ";
            } else {
                str = "ۣ۟ۤ";
            }
        }
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    static /* synthetic */ void m2291(C0257 c0257) {
        String str = "ۨۥۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56324) {
                case 1709443:
                    m2300(c0257);
                    if (C0395.m5698() < 0) {
                        str = "ۥۨۥ";
                        break;
                    } else {
                        str = "ۨۥۣ";
                        break;
                    }
                case 1729190:
                    return;
                case 1735515:
                    if (C0395.m5698() >= 0) {
                        break;
                    } else {
                        str = "ۨۥۤ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̖̖̖, reason: not valid java name and contains not printable characters */
    private void m2292(String str) {
        String strM5584 = null;
        String str2 = "ۣۢۦ";
        Hashtable hashtable = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56545) {
                case 228:
                    C0392.m5619(C0164.m1366(), hashtable, new C0256(this, str));
                    str2 = "ۢۢۢ";
                    break;
                case 1709353:
                    strM5584 = C0392.m5584(str);
                    if (C0376.m4906() > 0) {
                        str2 = "ۣۦۢ";
                        break;
                    } else {
                        str2 = "ۦۨ۠";
                        break;
                    }
                case 1711468:
                    if (C0228.m2012() > 0) {
                        str2 = "ۣۢۦ";
                        break;
                    } else {
                        C0386.m5322();
                        str2 = "ۣۢۤ";
                        break;
                    }
                case 1731134:
                    C0420.m6218(hashtable, C0385.m5310(C0346.m3064()), strM5584);
                    if (C0375.m4840() >= 0) {
                        break;
                    } else {
                        str2 = "۠ۥ";
                        break;
                    }
                case 1731206:
                    hashtable = new Hashtable();
                    if (C0089.m592() > 0) {
                        str2 = "ۨۧۧ";
                        break;
                    } else {
                        C0387.m5374();
                        break;
                    }
                case 1732163:
                    return;
            }
        }
    }

    /* renamed from: ̗̖̖̗̙̗, reason: not valid java name and contains not printable characters */
    private AlertDialog m2293() {
        return (AlertDialog) C0078.m334(C0377.m4956(this), C0391.m5560());
    }

    /* renamed from: ̗̖̖̗̙̙, reason: not valid java name and contains not printable characters */
    public static C0257 m2294() {
        String str = "ۧۧ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755524) {
                case 3970:
                    break;
                case 3972:
                    if (m2305() != null) {
                        break;
                    } else {
                        str = "ۥۡۤ";
                    }
                case 26427:
                    return m2305();
                case 28739:
                    str = "ۧۧ۠";
                    continue;
                case 29772:
                    f439 = new C0257();
                    if (C0375.m4840() >= 0) {
                        C0385.m5282();
                    } else {
                        str = "ۡۡ۟";
                        continue;
                    }
            }
            str = "ۡۡ۟";
        }
    }

    /* renamed from: ̗̖̗̙̖̗, reason: not valid java name and contains not printable characters */
    private void m2295() {
        AlertDialog alertDialogM2301 = null;
        String str = "ۤ۠ۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755522) {
                case 172:
                    return;
                case 26401:
                    if (C0009.m36() >= 0) {
                        C0387.m5374();
                        str = "۟ۨۨ";
                    } else {
                        str = "ۤ۠ۨ";
                        continue;
                    }
                case 26407:
                    break;
                case 26461:
                    if (C0369.m3256() > 0) {
                        str = "ۥۧۡ";
                    } else {
                        continue;
                    }
                case 28782:
                    alertDialogM2301 = m2301(this);
                    if (C0380.m5068() <= 0) {
                        C0390.m5512();
                    } else {
                        str = "ۡۨ";
                        continue;
                    }
                case 29534:
                    C0377.m4937(m2306(this), false);
                    if (C0387.m5374() >= 0) {
                        C0378.m4998();
                        str = "ۡۤۦ";
                    } else {
                        str = "ۥۣۡ";
                        continue;
                    }
                case 29765:
                    C0191.m1638(C0378.m4991(), new RunnableC0248());
                    str = "ۨۢۨ";
                    continue;
                case 30717:
                    try {
                        C0206.m1815(alertDialogM2301);
                        if (C0089.m592() <= 0) {
                            str = "ۢۡ۟";
                        } else {
                            str = "ۤۨ۠";
                            continue;
                        }
                    } catch (Throwable th) {
                        if (C0073.m265() > 0) {
                            str = "۠ۦ";
                        }
                    }
                case 31391:
                case 1709444:
                    str = "ۤۨ۠";
                    continue;
                case 1709477:
                    if (alertDialogM2301 == null) {
                        break;
                    } else {
                        str = "ۥۧۡ";
                    }
            }
            str = "ۥۣۡ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c5 A[SYNTHETIC] */
    /* renamed from: ̗̙̙̗̗̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2296() {
        /*
            r6 = this;
            r1 = 0
            java.lang.String r0 = "ۢۥۡ"
            r2 = r1
        L4:
            int r3 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r4 = 56292(0xdbe4, float:7.8882E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 1829: goto L10;
                case 1710555: goto Lbf;
                case 1710595: goto L4a;
                case 1710663: goto L76;
                case 1711557: goto Ldd;
                case 1728932: goto L41;
                case 1729070: goto L23;
                case 1730726: goto Lb5;
                case 1730778: goto L85;
                case 1730842: goto L63;
                case 1730852: goto Lbf;
                case 1732731: goto Lce;
                case 1732869: goto Lbf;
                case 1733830: goto L29;
                case 1735709: goto La4;
                case 1735842: goto L1a;
                default: goto Lf;
            }
        Lf:
            goto L4
        L10:
            java.util.Map r0 = mirrorb.android.app.admin.C0377.m4956(r6)
            android.net.C0083.m434(r0)
            java.lang.String r0 = "ۧۨۢ"
            goto L4
        L1a:
            boolean r0 = mirrorb.com.android.internal.C0398.m5858(r2)
            if (r0 == 0) goto La4
            java.lang.String r0 = "ۡۤۥ"
            goto L4
        L23:
            mirrorb.android.rms.C0392.m5603(r1)     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = "ۣۤ۟"
            goto L4
        L29:
            java.lang.Object r0 = mirrorb.com.android.internal.C0398.m5850(r2)
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            int r1 = com.cloudinject.feature.p018.C0229.m2064()
            if (r1 < 0) goto L3b
            java.lang.String r1 = "۟ۧ"
            r5 = r1
            r1 = r0
            r0 = r5
            goto L4
        L3b:
            java.lang.String r1 = "ۦۢ۟"
            r5 = r1
            r1 = r0
            r0 = r5
            goto L4
        L41:
            int r3 = mirrorb.android.accounts.C0375.m4840()
            if (r3 >= 0) goto L4
            java.lang.String r0 = "ۦۧ۠"
            goto L4
        L4a:
            java.util.Map r2 = mirrorb.android.app.admin.C0377.m4956(r6)
            java.util.Collection r2 = mirrorb.android.app.admin.C0377.m4965(r2)
            java.util.Iterator r2 = mirrorb.android.providers.C0391.m5543(r2)
            int r3 = mirrorb.android.accounts.C0375.m4840()
            if (r3 < 0) goto L60
            p027.p028.p029.C0420.m6215()
            goto L4
        L60:
            java.lang.String r0 = "۟ۡۨ"
            goto L4
        L63:
            java.util.Map r3 = mirrorb.android.app.admin.C0377.m4956(r6)
            boolean r3 = androidx.core.p007.C0088.m590(r3)
            if (r3 == 0) goto La4
            int r3 = com.cloudinject.feature.p021.C0291.m2568()
            if (r3 >= 0) goto L4
            java.lang.String r0 = "ۦۤۥ"
            goto L4
        L76:
            if (r1 == 0) goto Lbf
            int r3 = mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            if (r3 < 0) goto L82
            com.cloudinject.feature.p018.C0228.m2012()
            goto L4
        L82:
            java.lang.String r0 = "ۤ۟ۥ"
            goto L4
        L85:
            int r3 = com.sadfxg.fasg.C0369.m3256()
            if (r3 > 0) goto L90
            mirrorb.java.lang.C0400.m5961()
            goto L4
        L90:
            java.lang.String r0 = "ۤ۟ۥ"
            goto L4
        L94:
            r3 = move-exception
            int r3 = mirrorb.android.rms.C0392.m5595()
            if (r3 > 0) goto La0
            com.cloudinject.feature.p023.C0334.m2866()
            goto L4
        La0:
            java.lang.String r0 = "۠۠ۡ"
            goto L4
        La4:
            int r0 = p027.p028.p029.C0420.m6215()
            if (r0 < 0) goto Lb1
            mirrorb.android.location.C0385.m5282()
            java.lang.String r0 = "ۥ۟۠"
            goto L4
        Lb1:
            java.lang.String r0 = "ۦۧ"
            goto L4
        Lb5:
            int r3 = mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            if (r3 >= 0) goto L4
            java.lang.String r0 = "ۣۤ۟"
            goto L4
        Lbf:
            int r3 = mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            if (r3 < 0) goto Lca
            mirrorb.android.app.admin.C0377.m4944()
            goto L4
        Lca:
            java.lang.String r0 = "۟ۡۨ"
            goto L4
        Lce:
            int r3 = mirrorb.android.app.admin.C0377.m4944()
            if (r3 > 0) goto Ld9
            com.cloudinject.feature.p015.C0206.m1807()
            goto L4
        Ld9:
            java.lang.String r0 = "ۢۥۡ"
            goto L4
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p019.C0257.m2296():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x000d A[SYNTHETIC] */
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.app.AlertDialog m2297(com.cloudinject.feature.model.C0201 r21) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p019.C0257.m2297(com.cloudinject.feature.model.̗̙̙):android.app.AlertDialog");
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    private /* synthetic */ void m2298(DialogInterface dialogInterface) {
        String str = "۠ۤۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754562) {
                case 34:
                    break;
                case 169:
                    m2300(this);
                    str = "ۣۤ۟";
                    continue;
                case 28184:
                    if (C0206.m1807() >= 0) {
                        C0420.m6215();
                    } else {
                        str = "۠ۤۧ";
                        continue;
                    }
                case 28321:
                    if (C0346.m3067(this)) {
                        break;
                    } else if (C0397.m5814() > 0) {
                        str = "ۣ۟";
                    }
                case 32642:
                    return;
                case 1711654:
                    C0025.m116(C0206.m1837(C0385.m5310(C0383.m5208())));
                    str = "ۧۢۦ";
                    continue;
            }
            if (C0334.m2866() <= 0) {
                C0392.m5595();
            } else {
                str = "ۧۢۦ";
            }
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    static /* synthetic */ void m2299(C0257 c0257) {
        String str = "ۦۡۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755587) {
                case 164:
                    if (C0179.m1427() <= 0) {
                        break;
                    } else {
                        str = "ۦۡۧ";
                        break;
                    }
                case 2127:
                    m2308(c0257);
                    if (C0382.m5180() > 0) {
                        str = "ۣۢ";
                        break;
                    } else {
                        C0088.m573();
                        break;
                    }
                case 1709442:
                    return;
            }
        }
    }

    /* renamed from: ۣ۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m2300(Object obj) {
        String str = "ۥۥۣ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750563) {
                case 103:
                    if (C0393.m5668() <= 0) {
                        str = "ۢۡ";
                    } else {
                        str = "ۥۥۣ";
                        continue;
                    }
                case 167:
                    return;
                case 252:
                    str = "ۢۡۦ";
                    continue;
                case 1188:
                case 3109:
                    str = "ۣۣۤ";
                    continue;
                case 2144:
                    if (C0083.m448() > 0) {
                        break;
                    } else if (C0291.m2568() >= 0) {
                        C0379.m5056();
                        str = "۠ۥۦ";
                    } else {
                        str = "ۤۢۧ";
                    }
                case 3082:
                    ((C0257) obj).m2296();
                    str = "ۣۣۤ";
                    continue;
                case 3178:
                    break;
            }
            str = "ۣۦۢ";
        }
    }

    /* renamed from: ۟ۡ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m2301(Object obj) {
        String str = "۠ۤ";
        AlertDialog alertDialog = null;
        AlertDialog alertDialogM2293 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1754561) {
                case 69:
                    str = "ۥۧ۠";
                    continue;
                case 1959:
                    if (C0228.m2012() > 0) {
                        str = "ۢ۠ۨ";
                    } else {
                        continue;
                    }
                case 25185:
                    return alertDialog;
                case 28385:
                    if (C0074.m307() >= 0) {
                        alertDialog = alertDialogM2293;
                    } else {
                        str = "۟ۤۥ";
                        alertDialog = alertDialogM2293;
                        continue;
                    }
                case 29534:
                case 31679:
                    if (C0389.m5481() <= 0) {
                        str = "۟۠ۢ";
                    } else {
                        str = "۟ۤۥ";
                        continue;
                    }
                case 30431:
                    break;
                case 30635:
                    if (C0206.m1807() >= 0) {
                        alertDialog = null;
                    } else {
                        str = "ۣۧ۠";
                        alertDialog = null;
                        continue;
                    }
                case 31586:
                    str = "۠ۤ";
                    continue;
                case 1710465:
                    alertDialogM2293 = ((C0257) obj).m2293();
                    if (C0393.m5668() > 0) {
                        str = "۠ۢۢ";
                    } else {
                        continue;
                    }
                case 1710533:
                    if (C0334.m2866() < 0) {
                        break;
                    } else {
                        str = C0384.m5278() <= 0 ? "۠ۧۡ" : "ۢۢ";
                    }
            }
            if (C0380.m5068() <= 0) {
                C0384.m5278();
                str = "ۨۦ۠";
            } else {
                str = "ۦۨۨ";
            }
        }
    }

    /* renamed from: ۟ۡۤۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2302(Object obj, Object obj2, int i, Object obj3) {
        String str = "ۣۡ۠";
        boolean z = false;
        boolean zM2290 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752484) {
                case 773:
                    zM2290 = m2290((InterfaceC0275) obj, (TextView) obj2, i, (KeyEvent) obj3);
                    str = "ۡۡۢ";
                    continue;
                case 941:
                    if (C0060.m216() > 0) {
                        str = "ۨ۟";
                    } else {
                        continue;
                    }
                case 3046:
                    if (C0380.m5068() <= 0) {
                        break;
                    } else {
                        str = "ۥۨۤ";
                    }
                case 3832:
                case 3873:
                    if (C0279.m2491() >= 0) {
                        str = "ۨۥۨ";
                    } else {
                        str = "ۢۢ۟";
                        continue;
                    }
                case 3899:
                    return z;
                case 4966:
                    if (C0086.m500() <= 0) {
                        C0155.m1294();
                        str = "ۤۨۨ";
                        z = zM2290;
                    } else {
                        str = "ۢۢ۟";
                        z = zM2290;
                        continue;
                    }
                case 5555:
                    break;
                case 29833:
                    str = "ۢۨۢ";
                    continue;
                case 31855:
                    str = "ۣۡ۠";
                    continue;
                case 1728851:
                    if (C0400.m5961() <= 0) {
                        C0191.m1627();
                        z = false;
                    } else {
                        str = "ۨۢۧ";
                        z = false;
                        continue;
                    }
            }
            if (C0398.m5833() > 0) {
                str = "ۥۣۧ";
            }
        }
    }

    /* renamed from: ۣۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static void m2303(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = "ۦ۠ۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755465) {
                case 2087:
                    if (C0335.m2923() >= 0) {
                        break;
                    } else if (C0206.m1807() < 0) {
                        str = "ۢۢ۟";
                    }
                case 2186:
                    if (C0390.m5512() > 0) {
                        str = "۟ۨ۠";
                    } else {
                        continue;
                    }
                case 3106:
                case 24926:
                    if (C0083.m448() >= 0) {
                        str = "ۡۤۤ";
                    } else {
                        str = "ۣ۠۠";
                        continue;
                    }
                case 25514:
                    return;
                case 31626:
                    if (C0396.m5741() < 0) {
                        str = "ۦ۠ۨ";
                    } else {
                        continue;
                    }
                case 31694:
                    break;
                case 31702:
                    ((C0257) obj).m2289((EditText) obj2, (Context) obj3, (View) obj4);
                    str = "ۣ۠۠";
                    continue;
            }
            str = "ۦۣ۠";
        }
    }

    /* renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m2304(Object obj, Object obj2) {
        String str = "ۣۣۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755338) {
                case 25448:
                case 25577:
                    str = "ۢ۠ۥ";
                    continue;
                case 25544:
                    break;
                case 28628:
                    if (C0155.m1294() >= 0) {
                        C0078.m361();
                    } else {
                        str = "۠ۦۨ";
                        continue;
                    }
                case 29263:
                    ((C0257) obj).m2298((DialogInterface) obj2);
                    str = "ۢ۠ۥ";
                    continue;
                case 31240:
                    if (C0121.m1023() >= 0) {
                        break;
                    } else if (C0420.m6215() >= 0) {
                        C0382.m5180();
                    } else {
                        str = "ۤۥۦ";
                    }
                case 31405:
                    return;
                case 32303:
                    str = "ۣۣۢ";
                    continue;
            }
            if (C0291.m2568() >= 0) {
                C0385.m5282();
                str = "ۣ۟۠";
            } else {
                str = "۟۠۟";
            }
        }
    }

    /* renamed from: ۣ۟ۥۥۧ, reason: not valid java name and contains not printable characters */
    public static C0257 m2305() {
        String str = "ۡۤۢ";
        C0257 c0257 = null;
        C0257 c02572 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746944) {
                case 31:
                case 6978:
                    if (C0073.m265() <= 0) {
                        C0086.m500();
                        str = "ۨۤۤ";
                    } else {
                        str = "ۣۥ۠";
                        continue;
                    }
                case 1823:
                    if (C0206.m1807() > 0) {
                        break;
                    } else if (C0384.m5278() <= 0) {
                        C0397.m5814();
                    } else {
                        str = "ۥۨۧ";
                    }
                case 4550:
                    if (C0088.m573() <= 0) {
                        C0377.m4944();
                        c0257 = null;
                    } else {
                        str = "ۨۤ۠";
                        c0257 = null;
                        continue;
                    }
                case 4712:
                    break;
                case 4803:
                    str = "ۡۤۢ";
                    continue;
                case 5796:
                    c02572 = f439;
                    if (C0399.m5914() <= 0) {
                        str = "ۡۡۨ";
                    } else {
                        str = "ۢ۠۠";
                        continue;
                    }
                case 6754:
                    if (C0399.m5914() <= 0) {
                        c0257 = c02572;
                    } else {
                        str = "ۣۥ۠";
                        c0257 = c02572;
                        continue;
                    }
                case 7870:
                    return c0257;
                case 7962:
                    if (C0089.m592() > 0) {
                        str = "ۤ۟ۡ";
                    } else {
                        continue;
                    }
                case 24932:
                    if (C0083.m448() >= 0) {
                        C0206.m1807();
                        str = "ۥۧ۟";
                    } else {
                        str = "ۢۧۧ";
                        continue;
                    }
            }
            str = "ۣۨ۟";
        }
    }

    /* renamed from: ۟ۥۦۧۧ, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m2306(Object obj) {
        Object obj2 = "ۨۨ۠";
        AtomicBoolean atomicBoolean = null;
        AtomicBoolean atomicBoolean2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1749634) {
                case 3:
                    return atomicBoolean;
                case 60:
                    if (C0392.m5595() > 0) {
                        obj2 = "ۤۤۥ";
                    } else {
                        continue;
                    }
                case 448:
                    break;
                case 1259:
                case 2279:
                    if (C0334.m2866() > 0) {
                        obj2 = "ۢۡ۠";
                    } else {
                        continue;
                    }
                case 5377:
                    if (C0400.m5961() > 0) {
                        obj2 = "ۨۨ۠";
                    } else {
                        continue;
                    }
                case 6534:
                    obj2 = "ۢۡ۠";
                    atomicBoolean = atomicBoolean2;
                    continue;
                case 29641:
                    obj2 = "ۧۢ";
                    continue;
                case 31563:
                    atomicBoolean2 = ((C0257) obj).f442;
                    if (C0394.m5672() > 0) {
                        obj2 = "۠ۡۥ";
                    } else {
                        continue;
                    }
                case 31586:
                    if (C0279.m2491() >= 0) {
                        break;
                    } else {
                        obj2 = "ۨۧۨ";
                    }
                case 1732185:
                    if (C0384.m5278() <= 0) {
                        C0346.m3059();
                        obj2 = "ۣۤۨ";
                        atomicBoolean = null;
                    } else {
                        obj2 = "ۣۢ۟";
                        atomicBoolean = null;
                        continue;
                    }
            }
            if (C0155.m1294() >= 0) {
                C0334.m2866();
            } else {
                obj2 = "ۦ۟ۤ";
            }
        }
    }

    /* renamed from: ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static AlertDialog m2307(Object obj, Object obj2) {
        Object obj3 = "۟ۤۥ";
        AlertDialog alertDialog = null;
        AlertDialog alertDialogM2297 = null;
        while (true) {
            switch (C0395.m5690(obj3) ^ 1749756) {
                case 2082:
                    obj3 = "ۥ۠ۡ";
                    alertDialog = alertDialogM2297;
                    continue;
                case 3930:
                    return alertDialog;
                case 5468:
                    if (C0191.m1627() > 0) {
                        break;
                    } else if (C0362.m3122() < 0) {
                        obj3 = "۟ۨۧ";
                    }
                case 6173:
                    if (C0388.m5430() <= 0) {
                        obj3 = "ۢۨۡ";
                    } else {
                        obj3 = "۟ۤۥ";
                        continue;
                    }
                case 6882:
                    alertDialogM2297 = ((C0257) obj).m2297((C0201) obj2);
                    if (C0383.m5203() > 0) {
                        obj3 = "ۤۨۢ";
                    } else {
                        continue;
                    }
                case 7225:
                    obj3 = "ۨۤۦ";
                    continue;
                case 7235:
                    break;
                case 7641:
                case 29622:
                    if (C0396.m5741() >= 0) {
                        obj3 = "ۢۢ۟";
                    } else {
                        obj3 = "ۥ۠ۡ";
                        continue;
                    }
                case 31577:
                    obj3 = "ۦۣ۟";
                    continue;
                case 31638:
                    if (C0121.m1023() >= 0) {
                        C0086.m500();
                        alertDialog = null;
                    } else {
                        obj3 = "ۨۦۣ";
                        alertDialog = null;
                        continue;
                    }
            }
            obj3 = "ۡۡۥ";
        }
    }

    /* renamed from: ۠ۥۨۧ, reason: not valid java name and contains not printable characters */
    public static void m2308(Object obj) {
        Object obj2 = "۟ۥۤ";
        while (true) {
            switch (C0395.m5690(obj2) ^ 1750756) {
                case 166:
                case 1159:
                    if (C0089.m592() <= 0) {
                        obj2 = "ۥۧ";
                    } else {
                        obj2 = "۟۟ۢ";
                        continue;
                    }
                case 4442:
                    if (C0184.m1524() >= 0) {
                        break;
                    } else {
                        obj2 = "ۡۤۦ";
                    }
                case 4582:
                    return;
                case 6599:
                    ((C0257) obj).m2295();
                    if (C0191.m1627() >= 0) {
                        C0346.m3059();
                    } else {
                        obj2 = "۟۟ۢ";
                        continue;
                    }
                case 29441:
                    break;
                case 30600:
                    if (C0191.m1627() < 0) {
                        obj2 = "ۣۡ۠";
                    } else {
                        continue;
                    }
                case 1731842:
                    if (C0191.m1627() >= 0) {
                        obj2 = "ۣۨ۟";
                    } else {
                        obj2 = "۟ۥۤ";
                        continue;
                    }
            }
            if (C0391.m5571() <= 0) {
                C0228.m2012();
                obj2 = "ۧ۟ۡ";
            } else {
                obj2 = "ۦ۠ۦ";
            }
        }
    }

    /* renamed from: ۣۢۧۨ, reason: not valid java name and contains not printable characters */
    public static void m2309(Object obj, Object obj2) {
        String str = "ۢۤ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749759) {
                case 34:
                    if (C0183.m1464() < 0) {
                        break;
                    } else {
                        str = "۠۠ۧ";
                    }
                case 155:
                    str = "ۢۤ۟";
                    continue;
                case 1058:
                case 31671:
                    str = "۠ۤۡ";
                    continue;
                case 2169:
                    break;
                case 6168:
                    ((C0257) obj).m2292((String) obj2);
                    str = "۠ۤۡ";
                    continue;
                case 6562:
                    return;
                case 31287:
                    if (C0279.m2491() < 0) {
                        str = "ۣۦ۠";
                    } else {
                        continue;
                    }
            }
            if (C0078.m361() > 0) {
                str = "ۨ۟۟";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0004 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2310(com.cloudinject.feature.model.C0201 r6) {
        /*
            r5 = this;
            r4 = 0
            r3 = 1
            java.lang.String r0 = "ۡۡ"
        L4:
            int r1 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r2 = 1751680(0x1aba80, float:2.454626E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 138: goto L10;
                case 1053: goto L5d;
                case 2050: goto Lcd;
                case 3197: goto Lcd;
                case 3270: goto L43;
                case 4197: goto L1f;
                case 5125: goto Lde;
                case 5221: goto L9a;
                case 5599: goto L63;
                case 7456: goto L2e;
                case 7516: goto Lc9;
                case 7547: goto Le2;
                case 31500: goto L57;
                case 31586: goto Lb0;
                case 32586: goto Le2;
                case 32685: goto Le2;
                case 1728873: goto Lba;
                case 1730052: goto L3d;
                case 1730078: goto L81;
                case 1730208: goto L34;
                default: goto Lf;
            }
        Lf:
            goto L4
        L10:
            int r1 = android.net.C0083.m439(r6)
            if (r1 != r3) goto Lb0
            int r1 = com.cloudinject.feature.p023.C0334.m2866()
            if (r1 <= 0) goto L4
            java.lang.String r0 = "ۡۦۤ"
            goto L4
        L1f:
            int r0 = com.cloudinject.customview.C0183.m1464()
            if (r0 > 0) goto L2b
            com.cloudinject.feature.p023.C0335.m2923()
            java.lang.String r0 = "ۣۣۤ"
            goto L4
        L2b:
            java.lang.String r0 = "ۣۧۡ"
            goto L4
        L2e:
            m2307(r5, r6)
            java.lang.String r0 = "ۥۣ"
            goto L4
        L34:
            boolean r1 = com.cloudinject.p025.p026.C0346.m3067(r5)
            if (r1 == 0) goto Lba
            java.lang.String r0 = "ۧ۠ۦ"
            goto L4
        L3d:
            m2308(r5)
            java.lang.String r0 = "۠۠ۥ"
            goto L4
        L43:
            java.util.concurrent.atomic.AtomicBoolean r1 = m2306(r5)
            mirrorb.android.app.admin.C0377.m4937(r1, r3)
            int r1 = mirrorb.com.android.internal.C0398.m5833()
            if (r1 > 0) goto L54
            com.cloudinject.core.p009.p012.C0164.m1359()
            goto L4
        L54:
            java.lang.String r0 = "ۡۢۦ"
            goto L4
        L57:
            com.cloudinject.core.utils.compat.C0121.m1003(r5, r3)
            java.lang.String r0 = "ۧۥۨ"
            goto L4
        L5d:
            com.cloudinject.core.utils.compat.C0121.m1003(r5, r4)
            java.lang.String r0 = "ۤۡۧ"
            goto L4
        L63:
            android.content.Context r0 = com.cloudinject.feature.p018.C0229.m2043()
            java.lang.String r1 = android.app.C0009.m23(r6)
            android.widget.Toast r0 = mirrorb.android.util.C0393.m5650(r0, r1, r4)
            androidx.core.p007.C0089.m625(r0)
            int r0 = mirrorb.android.net.wifi.C0387.m5374()
            if (r0 < 0) goto L7e
            com.cloudinject.core.p009.p011.C0155.m1294()
            java.lang.String r0 = "ۣۧۨ"
            goto L4
        L7e:
            java.lang.String r0 = "ۦۡۧ"
            goto L4
        L81:
            java.lang.String r1 = mirrorb.com.android.internal.content.C0395.m5681()
            boolean r1 = com.cloudinject.core.p009.p012.C0164.m1363(r1)
            if (r1 == 0) goto Lc9
            int r1 = com.cloudinject.feature.p023.C0335.m2923()
            if (r1 < 0) goto L96
            com.cloudinject.customview.C0183.m1464()
            goto L4
        L96:
            java.lang.String r0 = "ۤۨ"
            goto L4
        L9a:
            java.lang.String r1 = mirrorb.com.android.internal.content.C0395.m5681()
            m2309(r5, r1)
            int r1 = com.px.C0368.m3171()
            if (r1 < 0) goto Lac
            mirrorb.android.media.session.C0386.m5322()
            goto L4
        Lac:
            java.lang.String r0 = "ۣ۟ۧ"
            goto L4
        Lb0:
            int r1 = com.cloudinject.p025.p026.C0346.m3059()
            if (r1 >= 0) goto L4
            java.lang.String r0 = "۟ۤۥ"
            goto L4
        Lba:
            int r1 = mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            if (r1 < 0) goto Lc5
            mirrorb.android.net.wifi.C0387.m5374()
            goto L4
        Lc5:
            java.lang.String r0 = "ۥۨ۠"
            goto L4
        Lc9:
            java.lang.String r0 = "ۣۡۤ"
            goto L4
        Lcd:
            int r0 = mirrorb.com.android.internal.C0398.m5833()
            if (r0 > 0) goto Lda
            mirrorb.android.content.C0380.m5068()
            java.lang.String r0 = "ۣۢ۠"
            goto L4
        Lda:
            java.lang.String r0 = "ۣ۟ۧ"
            goto L4
        Lde:
            java.lang.String r0 = "ۡۡ"
            goto L4
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p019.C0257.m2310(com.cloudinject.feature.model.̗̙̙):void");
    }

    /* renamed from: ̗̙̖̙, reason: not valid java name and contains not printable characters */
    public void m2311(boolean z) {
        String str = "۟ۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56480) {
                case 2:
                    break;
                case 1863:
                    this.f443 = z;
                    if (C0335.m2923() >= 0) {
                        C0384.m5278();
                    } else {
                        str = "ۢۧ۠";
                        continue;
                    }
                case 1709453:
                    C0074.m298(this);
                    if (C0392.m5595() <= 0) {
                        C0346.m3059();
                    } else {
                        str = "ۢۡۢ";
                        continue;
                    }
                case 1709543:
                    str = "۟ۦ";
                    continue;
                case 1710724:
                    if (C0183.m1464() > 0) {
                        str = "ۣۣ۟";
                    } else {
                        continue;
                    }
                case 1711402:
                    C0164.m1375(this);
                    str = "ۧۨۥ";
                    continue;
                case 1731295:
                case 1731517:
                    if (C0387.m5374() >= 0) {
                        C0398.m5833();
                    } else {
                        str = "ۢۡۢ";
                        continue;
                    }
                case 1732131:
                    return;
                case 1732507:
                    if (!z) {
                        break;
                    } else if (C0384.m5278() <= 0) {
                        C0183.m1464();
                    } else {
                        str = "ۦۡۥ";
                    }
            }
            str = "ۨۢۧ";
        }
    }
}
