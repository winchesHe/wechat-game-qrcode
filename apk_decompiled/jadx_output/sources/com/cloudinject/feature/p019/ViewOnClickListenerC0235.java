package com.cloudinject.feature.p019;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.view.View;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.C0187;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0370;
import mirrorb.android.accounts.C0375;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0385;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̗̙.̖̖, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class ViewOnClickListenerC0235 implements View.OnClickListener {
    private int action;

    /* renamed from: ̗̗̖̖̗̗̙, reason: not valid java name and contains not printable characters */
    private String f389;

    /* renamed from: ̗̗̖̗̖̙̗, reason: not valid java name and contains not printable characters */
    final C0239 f390;

    /* renamed from: ̗̗̖̗̙̙̗, reason: not valid java name and contains not printable characters */
    private C0187 f391;

    /* renamed from: ̗̗̙̖̗̗̗, reason: not valid java name and contains not printable characters */
    private AlertDialog f392;

    /* renamed from: ̗̗̙̖̗̙̙, reason: not valid java name and contains not printable characters */
    private Activity f393;

    public ViewOnClickListenerC0235(C0239 c0239, C0187 c0187, String str, int i, Activity activity, AlertDialog alertDialog) {
        this.f390 = c0239;
        String str2 = "ۦۣۥ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1747934) {
                case 4511:
                    this.f392 = alertDialog;
                    if (C0089.m592() > 0) {
                        str2 = "ۣۡۢ";
                        break;
                    } else {
                        C0375.m4840();
                        break;
                    }
                case 4601:
                    if (C0400.m5961() > 0) {
                        str2 = "ۦۣۥ";
                        break;
                    } else {
                        C0380.m5068();
                        break;
                    }
                case 6363:
                    this.f391 = c0187;
                    if (C0379.m5056() > 0) {
                        str2 = "ۦۣۤ";
                        break;
                    } else {
                        C0382.m5180();
                        str2 = "ۨۦۧ";
                        break;
                    }
                case 6556:
                    this.f393 = activity;
                    if (C0395.m5698() >= 0) {
                        break;
                    } else {
                        str2 = "ۣۤ۠";
                        break;
                    }
                case 7578:
                    return;
                case 27158:
                    this.f389 = str;
                    if (C0179.m1427() > 0) {
                        str2 = "ۢۥۨ";
                        break;
                    } else {
                        C0400.m5961();
                        break;
                    }
                case 27161:
                    this.action = i;
                    if (C0086.m500() > 0) {
                        str2 = "ۢ۟۟";
                        break;
                    } else {
                        C0362.m3122();
                        break;
                    }
            }
        }
    }

    /* renamed from: ۟۟۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static C0187 m2096(Object obj) {
        String str = "ۤۦۦ";
        C0187 c0187 = null;
        C0187 c01872 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1750720) {
                case 2242:
                    if (C0121.m1023() >= 0) {
                        C0179.m1427();
                        c0187 = c01872;
                    } else {
                        str = "ۨ۟ۤ";
                        c0187 = c01872;
                        continue;
                    }
                case 3099:
                    if (C0073.m265() > 0) {
                        str = "ۤۦۦ";
                    } else {
                        continue;
                    }
                case 3172:
                    if (C0155.m1294() >= 0) {
                        break;
                    } else {
                        str = C0399.m5914() <= 0 ? "۠ۢۧ" : "ۨۦ";
                    }
                case 4444:
                    str = "ۧۡۦ";
                    continue;
                case 7175:
                case 29580:
                    if (C0397.m5814() <= 0) {
                        C0387.m5374();
                    } else {
                        str = "ۨ۟ۤ";
                        continue;
                    }
                case 32269:
                    return c0187;
                case 32676:
                    if (C0083.m448() >= 0) {
                        C0383.m5203();
                        str = "ۤۧۤ";
                    } else {
                        str = "۟۠";
                        continue;
                    }
                case 1731134:
                    c01872 = ((ViewOnClickListenerC0235) obj).f391;
                    if (C0346.m3059() < 0) {
                        str = "ۥۣ۠";
                    } else {
                        continue;
                    }
                case 1731195:
                    break;
                case 1731873:
                    if (C0399.m5914() <= 0) {
                        str = "ۢۦ۠";
                        c0187 = null;
                    } else {
                        str = "۟ۤۡ";
                        c0187 = null;
                        continue;
                    }
            }
            if (C0009.m36() < 0) {
                str = "ۨۤ۠";
            }
        }
    }

    /* renamed from: ۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static C0239 m2097(Object obj) {
        String str = "ۣ۠ۨ";
        C0239 c0239 = null;
        C0239 c02392 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56289) {
                case 1711854:
                    return c0239;
                case 1728832:
                case 1733825:
                    if (C0083.m448() >= 0) {
                        str = "۟۟ۥ";
                    } else {
                        str = "ۧ۟ۧ";
                        continue;
                    }
                case 1729031:
                    break;
                case 1730050:
                    if (C0387.m5374() >= 0) {
                        C0291.m2568();
                        c0239 = c02392;
                    } else {
                        str = "ۧ۟ۧ";
                        c0239 = c02392;
                        continue;
                    }
                case 1730151:
                    c02392 = ((ViewOnClickListenerC0235) obj).f390;
                    str = "ۥۢ۠";
                    continue;
                case 1731813:
                    if (C0082.m410() >= 0) {
                        str = "ۣۢۦ";
                    } else {
                        str = "ۣ۠ۨ";
                        continue;
                    }
                case 1731932:
                    str = "ۣۡۤ";
                    continue;
                case 1732042:
                    if (C0396.m5741() >= 0) {
                        break;
                    } else {
                        str = "ۥ۟۠";
                    }
                case 1733852:
                    str = "ۣۥ۟";
                    c0239 = null;
                    continue;
                case 1733955:
                    if (C0025.m118() <= 0) {
                        str = "ۢ۠ۢ";
                    } else {
                        str = "ۡۥۡ";
                        continue;
                    }
            }
            if (C0420.m6215() >= 0) {
                C0074.m307();
            } else {
                str = "ۡ۠ۡ";
            }
        }
    }

    /* renamed from: ۣ۟ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m2098(Object obj) {
        Object obj2 = "ۨۢۢ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1746878) {
                case 3077:
                    if (C0089.m592() <= 0) {
                        C0368.m3171();
                        obj2 = "۟ۥ۟";
                    } else {
                        obj2 = "ۨۥ";
                        continue;
                    }
                case 3198:
                case 1735491:
                    if (C0379.m5056() <= 0) {
                        obj2 = "ۢۡ";
                    } else {
                        obj2 = "ۥۢ۠";
                        continue;
                    }
                case 3326:
                    if (C0086.m500() > 0) {
                        obj2 = "ۦ۠ۨ";
                    } else {
                        continue;
                    }
                case 4532:
                    i2 = ((ViewOnClickListenerC0235) obj).action;
                    if (C0385.m5282() < 0) {
                        obj2 = "ۨ۠ۨ";
                    } else {
                        continue;
                    }
                case 5599:
                    if (C0183.m1464() <= 0) {
                        C0179.m1427();
                    } else {
                        obj2 = "ۨۢۢ";
                        continue;
                    }
                case 6749:
                    return i;
                case 26320:
                    if (C0183.m1464() <= 0) {
                        C0387.m5374();
                        i = 0;
                    } else {
                        obj2 = "۠ۧۢ";
                        i = 0;
                        continue;
                    }
                case 28310:
                    if (C0377.m4944() <= 0) {
                        break;
                    } else if (C0368.m3171() >= 0) {
                        C0291.m2568();
                    } else {
                        obj2 = "ۣ۟ۦ";
                    }
                case 28494:
                    if (C0291.m2568() >= 0) {
                        i = i2;
                    } else {
                        obj2 = "ۥۢ۠";
                        i = i2;
                        continue;
                    }
                case 1735608:
                    break;
            }
            obj2 = "ۣۣ۠";
        }
    }

    /* renamed from: ۟ۦۤۥ۠, reason: not valid java name and contains not printable characters */
    public static void m2099(Object obj) {
        Object obj2 = "ۣۧۦ";
        while (true) {
            switch (C0395.m5690(obj2) ^ 1749671) {
                case 1048:
                    if (C0379.m5056() <= 0) {
                        C0083.m448();
                    } else {
                        obj2 = "ۨۤۧ";
                        continue;
                    }
                case 6428:
                    if (C0379.m5056() > 0) {
                        obj2 = "ۣۧۦ";
                    } else {
                        continue;
                    }
                case 29536:
                    C0239.m2114((C0239) obj);
                    if (C0088.m573() <= 0) {
                        C0228.m2012();
                    } else {
                        obj2 = "ۧۤۦ";
                        continue;
                    }
                case 30478:
                    return;
                case 30509:
                    if (C0385.m5282() > 0) {
                        break;
                    } else {
                        obj2 = "ۦۣۤ";
                    }
                case 31336:
                    break;
                case 31692:
                case 1732120:
                    if (C0396.m5741() < 0) {
                        obj2 = "ۧۤۦ";
                    } else {
                        continue;
                    }
            }
            if (C0346.m3059() >= 0) {
                C0228.m2012();
            } else {
                obj2 = "ۣۥۡ";
            }
        }
    }

    /* renamed from: ۠ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2100(Object obj, boolean z) {
        Object obj2 = "ۡۦۨ";
        boolean z2 = false;
        boolean zM2115 = false;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1750569) {
                case 46:
                    if (C0400.m5961() > 0) {
                        obj2 = "ۡۦۨ";
                    } else {
                        continue;
                    }
                case 161:
                    break;
                case 1184:
                    if (C0229.m2064() >= 0) {
                        C0396.m5741();
                        z2 = zM2115;
                    } else {
                        obj2 = "ۣۧ۠";
                        z2 = zM2115;
                        continue;
                    }
                case 3181:
                case 1731189:
                    if (C0088.m573() <= 0) {
                        obj2 = "ۧۥۣ";
                    } else {
                        obj2 = "ۣۧ۠";
                        continue;
                    }
                case 4064:
                    if (C0088.m573() <= 0) {
                        C0334.m2866();
                    } else {
                        obj2 = "ۣ۟";
                        continue;
                    }
                case 6474:
                    if (C0078.m361() < 0) {
                        break;
                    } else {
                        obj2 = "۠ۧۦ";
                    }
                case 7574:
                    zM2115 = C0239.m2115((C0239) obj, z);
                    if (C0387.m5374() >= 0) {
                        C0399.m5914();
                    } else {
                        obj2 = "ۢۡۨ";
                        continue;
                    }
                case 29613:
                    return z2;
                case 30595:
                    if (C0291.m2568() >= 0) {
                        obj2 = "۠ۢۤ";
                        z2 = false;
                    } else {
                        obj2 = "ۤ۟ۤ";
                        z2 = false;
                        continue;
                    }
                case 30666:
                    if (C0334.m2866() > 0) {
                        obj2 = "ۦۢۦ";
                    } else {
                        continue;
                    }
            }
            if (C0378.m4998() > 0) {
                obj2 = "ۦۤۡ";
            }
        }
    }

    /* renamed from: ۣۤۨ۟, reason: not valid java name and contains not printable characters */
    public static AlertDialog m2101(Object obj) {
        String str = "ۣ۠ۤ";
        AlertDialog alertDialog = null;
        AlertDialog alertDialog2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754407) {
                case 3105:
                    str = "ۣۨۦ";
                    continue;
                case 25122:
                    alertDialog2 = ((ViewOnClickListenerC0235) obj).f392;
                    if (C0368.m3171() >= 0) {
                        C0073.m265();
                        str = "ۣۡۡ";
                    } else {
                        str = "ۡۤ۟";
                        continue;
                    }
                case 27195:
                    str = "ۡۨۧ";
                    alertDialog = alertDialog2;
                    continue;
                case 27271:
                    return alertDialog;
                case 27523:
                    str = "ۣ۠ۤ";
                    continue;
                case 27622:
                    if (C0073.m265() <= 0) {
                        C0228.m2012();
                    } else {
                        str = "ۤ۟ۦ";
                        continue;
                    }
                case 28409:
                    break;
                case 28610:
                case 29190:
                    str = "ۡۨۧ";
                    continue;
                case 29440:
                    if (C0370.m3284() >= 0) {
                        break;
                    } else {
                        str = C0383.m5203() <= 0 ? "ۤۥۧ" : "۟۟ۥ";
                    }
                case 31980:
                    if (C0378.m4998() <= 0) {
                        C0385.m5282();
                        alertDialog = null;
                    } else {
                        str = "ۨۡ۟";
                        alertDialog = null;
                        continue;
                    }
            }
            str = C0382.m5180() <= 0 ? "ۥۢۤ" : "ۡۡۡ";
        }
    }

    /* renamed from: ۥۦۣۧ, reason: contains not printable characters */
    public static Activity m2102(Object obj) {
        String str = "ۨ۟ۤ";
        Activity activity = null;
        Activity activity2 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1755624) {
                case 108:
                case 3082:
                    if (C0229.m2064() >= 0) {
                        C0396.m5741();
                    } else {
                        str = "ۣۡۤ";
                        continue;
                    }
                case 293:
                    if (C0229.m2064() > 0) {
                        break;
                    } else {
                        str = C0393.m5668() <= 0 ? "ۡۢۦ" : "ۢۧ۠";
                    }
                case 2210:
                    if (C0397.m5814() <= 0) {
                        C0382.m5180();
                    } else {
                        str = "ۨۥۡ";
                        continue;
                    }
                case 3170:
                    if (C0377.m4944() <= 0) {
                        str = "ۥۦ";
                        activity = null;
                    } else {
                        str = "ۦۣ۟";
                        activity = null;
                        continue;
                    }
                case 26282:
                    break;
                case 26291:
                    if (C0381.m5127() <= 0) {
                        C0368.m3171();
                    } else {
                        str = "ۨ۟ۤ";
                        continue;
                    }
                case 26346:
                    return activity;
                case 29760:
                    if (C0078.m361() > 0) {
                        str = "ۣۧۦ";
                    } else {
                        continue;
                    }
                case 30541:
                    str = "ۣۡۤ";
                    activity = activity2;
                    continue;
                case 31443:
                    activity2 = ((ViewOnClickListenerC0235) obj).f393;
                    if (C0394.m5672() <= 0) {
                        C0086.m500();
                    } else {
                        str = "ۥۨۨ";
                        continue;
                    }
            }
            if (C0083.m448() < 0) {
                str = "ۥۣ۠";
            }
        }
    }

    /* renamed from: ۧۡۥۦ, reason: not valid java name and contains not printable characters */
    public static String m2103(Object obj) {
        Object obj2 = "ۨۦۤ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1747717) {
                case 1114:
                    obj2 = "ۤۢۢ";
                    continue;
                case 3108:
                case 1734438:
                    if (C0375.m4840() >= 0) {
                        C0388.m5430();
                    } else {
                        obj2 = "ۧۡ";
                        continue;
                    }
                case 3161:
                    break;
                case 4385:
                    if (C0395.m5698() >= 0) {
                        C0390.m5512();
                        str = null;
                    } else {
                        obj2 = "ۦۤۡ";
                        str = null;
                        continue;
                    }
                case 6213:
                    if (C0009.m36() >= 0) {
                        C0394.m5672();
                        obj2 = "۟ۥۡ";
                    } else {
                        obj2 = "ۨۦۤ";
                        continue;
                    }
                case 7172:
                    str2 = ((ViewOnClickListenerC0235) obj).f389;
                    if (C0184.m1524() < 0) {
                        obj2 = "ۣ۠ۨ";
                    } else {
                        continue;
                    }
                case 7470:
                    obj2 = "ۧۡ";
                    str = str2;
                    continue;
                case 25251:
                    if (C0389.m5481() <= 0) {
                        break;
                    } else if (C0393.m5668() <= 0) {
                        C0291.m2568();
                    } else {
                        obj2 = "ۣۧۥ";
                    }
                case 27366:
                    if (C0074.m307() >= 0) {
                        C0375.m4840();
                        obj2 = "ۦۦۤ";
                    } else {
                        obj2 = "۟۠ۢ";
                        continue;
                    }
                case 1734623:
                    return str;
            }
            obj2 = "ۡۦۤ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0005 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0005 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0154 A[SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r7) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p019.ViewOnClickListenerC0235.onClick(android.view.View):void");
    }
}
