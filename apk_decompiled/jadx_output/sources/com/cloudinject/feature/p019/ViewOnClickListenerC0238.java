package com.cloudinject.feature.p019;

import android.app.Activity;
import android.database.C0074;
import android.net.C0083;
import android.view.View;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.C0362;
import com.px.C0368;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.net.C0389;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.content.C0395;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̗̙.̖̖̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ViewOnClickListenerC0238 implements View.OnClickListener {
    private int action;

    /* renamed from: ̗̗̖̖̗̗̙, reason: not valid java name and contains not printable characters */
    private String f396;

    /* renamed from: ̗̗̖̗̗̙̗, reason: not valid java name and contains not printable characters */
    final C0241 f397;

    /* renamed from: ̗̗̙̖̗̙̙, reason: not valid java name and contains not printable characters */
    private Activity f398;

    public ViewOnClickListenerC0238(C0241 c0241, String str, int i, Activity activity) {
        this.f397 = c0241;
        String str2 = "ۥۧۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56444) {
                case 1711649:
                    if (C0183.m1464() > 0) {
                        str2 = "ۥۧۡ";
                        break;
                    } else {
                        C0083.m448();
                        break;
                    }
                case 1729027:
                    this.f396 = str;
                    str2 = "ۤۦۦ";
                    break;
                case 1730141:
                    return;
                case 1730264:
                    this.action = i;
                    str2 = "ۣ۟ۥ";
                    break;
                case 1731189:
                    this.f398 = activity;
                    str2 = "ۤۢ۟";
                    break;
            }
        }
    }

    /* renamed from: ۡۥ۟۟, reason: not valid java name and contains not printable characters */
    public static String m2109(Object obj) {
        String str = "ۡ۟۟";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1751501) {
                case 1029:
                    break;
                case 2860:
                    str3 = ((ViewOnClickListenerC0238) obj).f396;
                    if (C0088.m573() > 0) {
                        str = "ۦۢۤ";
                    } else {
                        continue;
                    }
                case 3948:
                    return str2;
                case 4560:
                    str = "ۡۧۦ";
                    continue;
                case 5709:
                    if (C0164.m1359() >= 0) {
                        C0229.m2064();
                        str2 = null;
                    } else {
                        str = "ۨۨۧ";
                        str2 = null;
                        continue;
                    }
                case 5901:
                case 30824:
                    str = "ۣۤۢ";
                    continue;
                case 5964:
                    if (C0334.m2866() < 0) {
                        break;
                    } else {
                        str = "ۣۢۤ";
                    }
                case 28714:
                    str = "ۡۡ۠";
                    continue;
                case 30821:
                    str = "ۣۤۢ";
                    str2 = str3;
                    continue;
                case 30853:
                    str = "ۡ۟۟";
                    continue;
            }
            str = C0392.m5595() <= 0 ? "۠ۦ۟" : "۟ۨۦ";
        }
    }

    /* renamed from: ۤۧ۠۟, reason: not valid java name and contains not printable characters */
    public static Activity m2110(Object obj) {
        String str = "۠ۡۤ";
        Activity activity = null;
        Activity activity2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56390) {
                case 230:
                    break;
                case 1709443:
                    if (C0074.m307() >= 0) {
                        C0382.m5180();
                    } else {
                        str = "ۡۤۨ";
                        continue;
                    }
                case 1710521:
                    return activity;
                case 1710538:
                    str = "ۧۧ۟";
                    activity = activity2;
                    continue;
                case 1728993:
                    if (C0074.m307() >= 0) {
                        C0291.m2568();
                        str = "ۡۧ";
                    } else {
                        str = "۠ۡۤ";
                        continue;
                    }
                case 1730183:
                    activity2 = ((ViewOnClickListenerC0238) obj).f398;
                    str = "ۣۧۨ";
                    continue;
                case 1733405:
                case 1733475:
                    if (C0383.m5203() <= 0) {
                        str = "۟۟";
                    } else {
                        str = "ۧۧ۟";
                        continue;
                    }
                case 1733413:
                    if (C0183.m1464() <= 0) {
                        C0393.m5668();
                    } else {
                        str = "۠ۦۨ";
                        continue;
                    }
                case 1734469:
                    if (C0229.m2064() >= 0) {
                        break;
                    } else if (C0191.m1627() >= 0) {
                        C0378.m4998();
                    } else {
                        str = "ۤۧۤ";
                    }
                case 1734628:
                    if (C0381.m5127() <= 0) {
                        C0368.m3171();
                        activity = null;
                    } else {
                        str = "ۨۧۤ";
                        activity = null;
                        continue;
                    }
            }
            if (C0089.m592() <= 0) {
                C0383.m5203();
            } else {
                str = "ۡۦۨ";
            }
        }
    }

    /* renamed from: ۣۤۧۧ, reason: not valid java name and contains not printable characters */
    public static int m2111(Object obj) {
        Object obj2 = "ۦۦۨ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1747772) {
                case 34:
                    i2 = ((ViewOnClickListenerC0238) obj).action;
                    if (C0389.m5481() > 0) {
                        obj2 = "ۥۡۤ";
                    } else {
                        continue;
                    }
                case 1496:
                    return i;
                case 4447:
                    break;
                case 5876:
                    if (C0377.m4944() <= 0) {
                        obj2 = "۠ۡۨ";
                        i = i2;
                    } else {
                        obj2 = "ۡۢۥ";
                        i = i2;
                        continue;
                    }
                case 6592:
                    if (C0368.m3171() >= 0) {
                        C0362.m3122();
                    } else {
                        obj2 = "ۣۧۨ";
                        continue;
                    }
                case 6617:
                    if (C0183.m1464() > 0) {
                        obj2 = "ۦۦۨ";
                    } else {
                        continue;
                    }
                case 26900:
                    if (C0378.m4998() <= 0) {
                        break;
                    } else {
                        obj2 = "۠ۢ۠";
                    }
                case 27934:
                case 28377:
                    if (C0420.m6215() < 0) {
                        obj2 = "ۡۢۥ";
                    } else {
                        continue;
                    }
                case 1734464:
                    if (C0083.m448() < 0) {
                        obj2 = "ۣۦ";
                    } else {
                        continue;
                    }
                case 1734495:
                    if (C0291.m2568() >= 0) {
                        C0088.m573();
                        obj2 = "ۨۢۨ";
                        i = 0;
                    } else {
                        obj2 = "ۢۥ۟";
                        i = 0;
                        continue;
                    }
            }
            if (C0155.m1294() >= 0) {
                C0179.m1427();
            } else {
                obj2 = "ۤ۠";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d0 A[SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r6) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p019.ViewOnClickListenerC0238.onClick(android.view.View):void");
    }
}
