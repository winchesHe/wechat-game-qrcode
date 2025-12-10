package com.cloudinject.feature.p019;

import android.app.Activity;
import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0074;
import android.net.C0083;
import android.net.wifi.C0078;
import android.view.View;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.AlertDialogC0273;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0370;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.content.C0380;
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
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.java.lang.C0400;

/* renamed from: com.cloudinject.feature.̗̙.̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ViewOnClickListenerC0234 implements View.OnClickListener {
    private int action;

    /* renamed from: ̗̗̖̖̗̖̗, reason: not valid java name and contains not printable characters */
    final C0247 f385;

    /* renamed from: ̗̗̖̖̗̗̙, reason: not valid java name and contains not printable characters */
    private String f386;

    /* renamed from: ̗̗̖̙̖̖̙, reason: not valid java name and contains not printable characters */
    private AlertDialogC0273 f387;

    /* renamed from: ̗̗̙̖̗̙̙, reason: not valid java name and contains not printable characters */
    private Activity f388;

    public ViewOnClickListenerC0234(C0247 c0247, String str, int i, Activity activity, AlertDialogC0273 alertDialogC0273) {
        this.f385 = c0247;
        String str2 = "ۣۡۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1754628) {
                case 2030:
                    this.f387 = alertDialogC0273;
                    str2 = "۟ۢۥ";
                    break;
                case 24835:
                    this.action = i;
                    str2 = "ۡۨ۟";
                    break;
                case 24934:
                    return;
                case 25016:
                    str2 = "ۣۡۡ";
                    break;
                case 26875:
                    this.f386 = str;
                    str2 = "۟۟ۧ";
                    break;
                case 27036:
                    this.f388 = activity;
                    if (C0380.m5068() > 0) {
                        str2 = "ۦۤۨ";
                        break;
                    } else {
                        C0397.m5814();
                        break;
                    }
            }
        }
    }

    /* renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m2090(Object obj) {
        String str = "ۡۧ۟";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748835) {
                case 26:
                    if (C0074.m307() >= 0) {
                        break;
                    } else if (C0398.m5833() <= 0) {
                        C0385.m5282();
                    } else {
                        str = "ۡۦ۠";
                    }
                case 56:
                    i2 = ((ViewOnClickListenerC0234) obj).action;
                    str = "ۣۤ";
                    continue;
                case 1031:
                    if (C0384.m5278() <= 0) {
                        C0078.m361();
                        str = "ۣۢۢ";
                    } else {
                        str = "ۤۦۨ";
                        continue;
                    }
                case 2055:
                case 4416:
                    str = "ۦۤ۠";
                    continue;
                case 5573:
                    if (C0376.m4906() <= 0) {
                        C0025.m118();
                        str = "ۨۦۨ";
                        i = 0;
                    } else {
                        str = "ۧۡۢ";
                        i = 0;
                        continue;
                    }
                case 26123:
                    if (C0334.m2866() <= 0) {
                        C0387.m5374();
                        str = "ۣۣۡ";
                    } else {
                        str = "ۡۧ۟";
                        continue;
                    }
                case 27179:
                    str = "۟ۢۧ";
                    continue;
                case 27973:
                    break;
                case 28289:
                    return i;
                case 1733404:
                    if (C0229.m2064() >= 0) {
                        str = "ۤ۟ۤ";
                        i = i2;
                    } else {
                        str = "ۦۤ۠";
                        i = i2;
                        continue;
                    }
            }
            if (C0184.m1524() >= 0) {
                C0086.m500();
            } else {
                str = "۠ۤۨ";
            }
        }
    }

    /* renamed from: ۟ۤۢۢ۟, reason: not valid java name and contains not printable characters */
    public static AlertDialogC0273 m2091(Object obj) {
        String str = "ۧۡۧ";
        AlertDialogC0273 alertDialogC0273 = null;
        AlertDialogC0273 alertDialogC02732 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748614) {
                case 71:
                    if (C0390.m5512() > 0) {
                        str = "ۧۡۧ";
                    } else {
                        continue;
                    }
                case 1445:
                    if (C0389.m5481() <= 0) {
                        str = "ۢۢۢ";
                    } else {
                        str = "ۣۧ۟";
                        continue;
                    }
                case 4344:
                    str = "ۦۧۤ";
                    continue;
                case 5248:
                    alertDialogC02732 = ((ViewOnClickListenerC0234) obj).f387;
                    str = "ۣۨۦ";
                    continue;
                case 6567:
                    if (C0400.m5961() <= 0) {
                        str = "۠۟ۤ";
                        alertDialogC0273 = alertDialogC02732;
                    } else {
                        str = "ۦۡ";
                        alertDialogC0273 = alertDialogC02732;
                        continue;
                    }
                case 7207:
                    break;
                case 26776:
                case 27397:
                    if (C0155.m1294() >= 0) {
                        C0375.m4840();
                    } else {
                        str = "ۦۡ";
                        continue;
                    }
                case 27595:
                    if (C0382.m5180() <= 0) {
                        break;
                    } else {
                        str = "ۣۤۡ";
                    }
                case 27845:
                    str = "۠ۢۥ";
                    alertDialogC0273 = null;
                    continue;
                case 1733181:
                    return alertDialogC0273;
            }
            if (C0389.m5481() <= 0) {
                C0009.m36();
            } else {
                str = "ۥۧ۠";
            }
        }
    }

    /* renamed from: ۟ۥ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static Activity m2092(Object obj) {
        Object obj2 = "ۥۥۢ";
        Activity activity = null;
        Activity activity2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1746749) {
                case 134:
                    if (C0346.m3059() >= 0) {
                        activity = null;
                    } else {
                        obj2 = "۠۟ۤ";
                        activity = null;
                        continue;
                    }
                case 3576:
                    if (C0397.m5814() > 0) {
                        obj2 = "ۤۧ۟";
                    } else {
                        continue;
                    }
                case 5176:
                    return activity;
                case 6527:
                    if (C0386.m5322() < 0) {
                        break;
                    } else if (C0009.m36() < 0) {
                        obj2 = "ۥۨۢ";
                    }
                case 6562:
                    activity2 = ((ViewOnClickListenerC0234) obj).f388;
                    if (C0183.m1464() <= 0) {
                        C0368.m3171();
                    } else {
                        obj2 = "ۧۡ۠";
                        continue;
                    }
                case 6870:
                case 7553:
                    obj2 = "ۢۥۨ";
                    continue;
                case 7577:
                    break;
                case 25211:
                    obj2 = "ۢۥۨ";
                    activity = activity2;
                    continue;
                case 25301:
                    if (C0389.m5481() <= 0) {
                        C0397.m5814();
                    } else {
                        obj2 = "ۥۥۢ";
                        continue;
                    }
                case 28624:
                    if (C0279.m2491() < 0) {
                        obj2 = "۟ۥۡ";
                    } else {
                        continue;
                    }
            }
            if (C0400.m5961() > 0) {
                obj2 = "ۨ۠ۥ";
            }
        }
    }

    /* renamed from: ۣ۠۠۟, reason: not valid java name and contains not printable characters */
    public static C0247 m2093(Object obj) {
        String str = "ۧۢۦ";
        C0247 c0247 = null;
        C0247 c02472 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752585) {
                case 150:
                    str = "ۧۢۦ";
                    continue;
                case 993:
                case 32581:
                    if (C0382.m5180() <= 0) {
                        str = "۟ۥ۟";
                    } else {
                        str = "ۧ۟۟";
                        continue;
                    }
                case 3284:
                    if (C0382.m5180() <= 0) {
                        C0279.m2491();
                        str = "ۥۡۨ";
                        c0247 = c02472;
                    } else {
                        str = "ۧ۟۟";
                        c0247 = c02472;
                        continue;
                    }
                case 4310:
                    break;
                case 30434:
                    if (C0060.m216() <= 0) {
                        c0247 = null;
                    } else {
                        str = "ۦۡۤ";
                        c0247 = null;
                        continue;
                    }
                case 31502:
                    return c0247;
                case 31586:
                    if (C0089.m592() < 0) {
                        break;
                    } else if (C0228.m2012() <= 0) {
                        C0362.m3122();
                    } else {
                        str = "ۣۡ";
                    }
                case 32640:
                    if (C0083.m448() < 0) {
                        str = "ۥۢۥ";
                    } else {
                        continue;
                    }
                case 1729111:
                    c02472 = ((ViewOnClickListenerC0234) obj).f385;
                    if (C0184.m1524() >= 0) {
                        str = "ۥ۠ۨ";
                    } else {
                        str = "ۢۤ۟";
                        continue;
                    }
                case 1729130:
                    if (C0183.m1464() > 0) {
                        str = "ۣۨ۠";
                    } else {
                        continue;
                    }
            }
            if (C0398.m5833() <= 0) {
                C0362.m3122();
            } else {
                str = "ۣۦ";
            }
        }
    }

    /* renamed from: ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2094(Object obj) {
        String str = "۠ۢۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755429) {
                case 228:
                    return;
                case 3112:
                case 1709465:
                    if (C0025.m118() <= 0) {
                        C0377.m4944();
                    } else {
                        str = "ۨۧ۠";
                        continue;
                    }
                case 25094:
                    if (C0121.m1023() >= 0) {
                        break;
                    } else if (C0025.m118() <= 0) {
                        C0388.m5430();
                    } else {
                        str = "ۥۦۦ";
                    }
                case 25247:
                    str = "ۧ۟ۥ";
                    continue;
                case 26567:
                    break;
                case 29933:
                    if (C0389.m5481() <= 0) {
                        C0370.m3284();
                        str = "ۦۡۤ";
                    } else {
                        str = "۠ۢۥ";
                        continue;
                    }
                case 30528:
                    C0247.m2206((C0247) obj);
                    if (C0388.m5430() <= 0) {
                        str = "ۡۨۡ";
                    } else {
                        str = "ۨۧ۠";
                        continue;
                    }
            }
            str = "۠ۧۡ";
        }
    }

    /* renamed from: ۣۧۧ۟, reason: not valid java name and contains not printable characters */
    public static String m2095(Object obj) {
        String str = "ۢۢۡ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751684) {
                case 1243:
                    str3 = ((ViewOnClickListenerC0234) obj).f386;
                    if (C0387.m5374() >= 0) {
                        str = "ۦ۠ۤ";
                    } else {
                        str = "ۣ۠ۦ";
                        continue;
                    }
                case 1800:
                    if (C0362.m3122() >= 0) {
                        C0393.m5668();
                    } else {
                        str = "ۨ۟۠";
                        continue;
                    }
                case 1857:
                    if (C0370.m3284() < 0) {
                        str = "ۦۣ۠";
                    } else {
                        continue;
                    }
                case 1894:
                    break;
                case 2085:
                    if (C0381.m5127() < 0) {
                        break;
                    } else if (C0183.m1464() <= 0) {
                        C0379.m5056();
                    } else {
                        str = "ۥۦ۠";
                    }
                case 3108:
                    if (C0183.m1464() <= 0) {
                        C0391.m5571();
                    } else {
                        str = "ۢۢۡ";
                        continue;
                    }
                case 3245:
                    if (C0279.m2491() >= 0) {
                        C0083.m448();
                        str2 = str3;
                    } else {
                        str = "ۨۢۤ";
                        str2 = str3;
                        continue;
                    }
                case 29261:
                case 1730279:
                    if (C0382.m5180() <= 0) {
                        C0155.m1294();
                    } else {
                        str = "ۨۢۤ";
                        continue;
                    }
                case 29614:
                    return str2;
                case 31559:
                    if (C0380.m5068() <= 0) {
                        str = "ۨۤ۠";
                        str2 = null;
                    } else {
                        str = "ۥ۟ۦ";
                        str2 = null;
                        continue;
                    }
            }
            str = "ۥۡۡ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x012a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0005 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0005 A[SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r7) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p019.ViewOnClickListenerC0234.onClick(android.view.View):void");
    }
}
