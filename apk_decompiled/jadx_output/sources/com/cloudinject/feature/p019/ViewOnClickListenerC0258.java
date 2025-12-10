package com.cloudinject.feature.p019;

import android.app.C0009;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.view.View;
import androidx.core.p007.C0089;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.C0362;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0385;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;

/* renamed from: com.cloudinject.feature.̗̙.̗̗̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ViewOnClickListenerC0258 implements View.OnClickListener {
    private int action;
    private Context mContext;

    /* renamed from: ̗̗̖̖̗̗̙, reason: not valid java name and contains not printable characters */
    private String f444;

    /* renamed from: ̗̗̖̗̙̗̖, reason: not valid java name and contains not printable characters */
    final C0261 f445;

    public ViewOnClickListenerC0258(C0261 c0261, String str, int i, Context context) {
        this.f445 = c0261;
        String str2 = "ۧۧۥ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1752486) {
                case 79:
                    this.action = i;
                    if (C0396.m5741() < 0) {
                        str2 = "۟ۨۦ";
                        break;
                    } else {
                        str2 = "ۧۢۥ";
                        break;
                    }
                case 101:
                    if (C0369.m3256() > 0) {
                        str2 = "ۧۧۥ";
                        break;
                    } else {
                        C0083.m448();
                        str2 = "ۥۢۨ";
                        break;
                    }
                case 5563:
                    this.mContext = context;
                    if (C0378.m4998() > 0) {
                        str2 = "۠ۥۧ";
                        break;
                    } else {
                        C0398.m5833();
                        break;
                    }
                case 5668:
                    return;
                case 31651:
                    this.f444 = str;
                    if (C0383.m5203() > 0) {
                        str2 = "ۥۢۦ";
                        break;
                    } else {
                        C0362.m3122();
                        str2 = "ۣۤ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ۟ۡۦۨ, reason: not valid java name and contains not printable characters */
    public static String m2312(Object obj) {
        String str = "ۥۣۣ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746693) {
                case 2118:
                    str3 = ((ViewOnClickListenerC0258) obj).f444;
                    str = "ۣ۠ۤ";
                    continue;
                case 2168:
                    break;
                case 2171:
                case 5573:
                    if (C0060.m216() > 0) {
                        str = "ۨۨ۠";
                    } else {
                        continue;
                    }
                case 3140:
                    str = "ۨۨ۠";
                    str2 = str3;
                    continue;
                case 5150:
                    if (C0393.m5668() <= 0) {
                        C0083.m448();
                    } else {
                        str = "ۤۥۡ";
                        continue;
                    }
                case 6400:
                    if (C0334.m2866() <= 0) {
                        break;
                    } else if (C0375.m4840() >= 0) {
                        C0370.m3284();
                    } else {
                        str = "ۡۥۧ";
                    }
                case 6531:
                    if (C0376.m4906() > 0) {
                        str = "ۥۣۣ";
                    } else {
                        continue;
                    }
                case 6784:
                    str = "ۣۢۡ";
                    continue;
                case 7557:
                    if (C0377.m4944() <= 0) {
                        C0395.m5698();
                        str = "ۦۢ";
                        str2 = null;
                    } else {
                        str = "ۥ۟۟";
                        str2 = null;
                        continue;
                    }
                case 28389:
                    return str2;
            }
            if (C0009.m36() < 0) {
                str = "ۢۦ۟";
            }
        }
    }

    /* renamed from: ۟ۢۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m2313(Object obj) {
        Object obj2 = "۠ۨۢ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1751620) {
                case 2252:
                    break;
                case 2267:
                    i2 = ((ViewOnClickListenerC0258) obj).action;
                    if (C0398.m5833() <= 0) {
                        C0385.m5282();
                    } else {
                        obj2 = "ۡۧۨ";
                        continue;
                    }
                case 3110:
                    return i;
                case 4454:
                case 31689:
                    obj2 = "ۣۢۡ";
                    continue;
                case 4510:
                    if (C0060.m216() <= 0) {
                        break;
                    } else if (C0082.m410() >= 0) {
                        C0385.m5282();
                        obj2 = "ۤ۟۠";
                    } else {
                        obj2 = "ۢۢ۟";
                    }
                case 5574:
                    if (C0370.m3284() >= 0) {
                        C0183.m1464();
                        i = i2;
                    } else {
                        obj2 = "ۣۢۡ";
                        i = i2;
                        continue;
                    }
                case 29320:
                    obj2 = "ۧۤۧ";
                    i = 0;
                    continue;
                case 31648:
                    if (C0362.m3122() >= 0) {
                        obj2 = "ۣۦۢ";
                    } else {
                        obj2 = "ۣۨ۟";
                        continue;
                    }
                case 32739:
                    if (C0380.m5068() > 0) {
                        obj2 = "۠ۨۢ";
                    } else {
                        continue;
                    }
                case 32750:
                    if (C0279.m2491() < 0) {
                        obj2 = "ۦۡۨ";
                    } else {
                        continue;
                    }
            }
            if (C0206.m1807() >= 0) {
                C0397.m5814();
                obj2 = "ۢۦۡ";
            } else {
                obj2 = "ۦۤۢ";
            }
        }
    }

    /* renamed from: ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static Context m2314(Object obj) {
        Object obj2 = "ۦۣۤ";
        Context context = null;
        Context context2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1747803) {
                case 409:
                    if (C0388.m5430() > 0) {
                        obj2 = "ۤۤۦ";
                    } else {
                        continue;
                    }
                case 4413:
                case 7643:
                    obj2 = "ۨۦ۟";
                    continue;
                case 5496:
                    if (C0184.m1524() >= 0) {
                        context = null;
                    } else {
                        obj2 = "۠۟ۡ";
                        context = null;
                        continue;
                    }
                case 6619:
                    if (C0074.m307() < 0) {
                        obj2 = "ۥۤۢ";
                    } else {
                        continue;
                    }
                case 25338:
                    return context;
                case 26942:
                    if (C0378.m4998() <= 0) {
                        context = context2;
                    } else {
                        obj2 = "ۨۦ۟";
                        context = context2;
                        continue;
                    }
                case 27326:
                    if (C0378.m4998() < 0) {
                        break;
                    } else if (C0395.m5698() < 0) {
                        obj2 = "ۦۡۡ";
                    }
                case 27357:
                    context2 = ((ViewOnClickListenerC0258) obj).mContext;
                    if (C0229.m2064() >= 0) {
                        C0089.m592();
                    } else {
                        obj2 = "ۦۨۧ";
                        continue;
                    }
                case 28349:
                    if (C0009.m36() >= 0) {
                        C0398.m5833();
                        obj2 = "ۤۧۡ";
                    } else {
                        obj2 = "ۦۣۤ";
                        continue;
                    }
                case 1734468:
                    break;
            }
            if (C0389.m5481() > 0) {
                obj2 = "ۢۡ۟";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f9 A[SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r6) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p019.ViewOnClickListenerC0258.onClick(android.view.View):void");
    }
}
