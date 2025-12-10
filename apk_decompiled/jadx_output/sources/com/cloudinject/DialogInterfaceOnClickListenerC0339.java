package com.cloudinject;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.database.C0073;
import android.database.C0074;
import android.net.C0083;
import androidx.core.p007.C0088;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0335;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0385;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
final class DialogInterfaceOnClickListenerC0339 implements DialogInterface.OnClickListener {

    /* renamed from: ̗̖̗̗̖̙̖, reason: not valid java name and contains not printable characters */
    final CustomDialog f562;

    /* renamed from: ̗̖̗̗̙̙̗, reason: not valid java name and contains not printable characters */
    final String f563;

    DialogInterfaceOnClickListenerC0339(CustomDialog customDialog, String str) {
        this.f562 = customDialog;
        this.f563 = str;
    }

    /* renamed from: ۟ۨۦۡ, reason: not valid java name and contains not printable characters */
    public static String m2940(Object obj) {
        Object obj2 = "۠ۨۨ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1754409) {
                case 175:
                case 1089:
                    obj2 = "ۧۧ";
                    continue;
                case 1102:
                    break;
                case 27250:
                    obj2 = "۠ۨۨ";
                    continue;
                case 27626:
                    if (C0420.m6215() >= 0) {
                        C0279.m2491();
                        obj2 = "ۧۥۥ";
                    } else {
                        obj2 = "ۦ۠ۢ";
                        continue;
                    }
                case 28361:
                    if (C0335.m2923() > 0) {
                        break;
                    } else if (C0073.m265() > 0) {
                        obj2 = "ۢ۠";
                    }
                case 29512:
                    if (C0073.m265() <= 0) {
                        str = str2;
                    } else {
                        obj2 = "ۧۧ";
                        str = str2;
                        continue;
                    }
                case 31521:
                    obj2 = "ۣۡۡ";
                    str = null;
                    continue;
                case 31968:
                    obj2 = "ۥۣۦ";
                    continue;
                case 1710359:
                    str2 = ((DialogInterfaceOnClickListenerC0339) obj).f563;
                    if (C0397.m5814() <= 0) {
                        C0393.m5668();
                    } else {
                        obj2 = "ۣۢ۠";
                        continue;
                    }
                case 1710537:
                    return str;
            }
            if (C0184.m1524() < 0) {
                obj2 = "ۤ۟ۤ";
            }
        }
    }

    /* renamed from: ۨۥۣ۟, reason: not valid java name and contains not printable characters */
    public static Activity m2941() {
        String str = "ۥ۟۟";
        Activity activity = null;
        Activity activityM884 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753574) {
                case 2016:
                    str = "ۥ۟۟";
                    continue;
                case 2019:
                    break;
                case 2116:
                case 29543:
                    if (C0088.m573() > 0) {
                        str = "ۤۥ۟";
                    } else {
                        continue;
                    }
                case 26340:
                    if (C0074.m307() >= 0) {
                        C0083.m448();
                        str = "ۧۡۥ";
                    } else {
                        str = "ۡۢۦ";
                        continue;
                    }
                case 28419:
                    str = "ۡ۠۟";
                    activity = null;
                    continue;
                case 28486:
                    str = "ۨۦ۠";
                    continue;
                case 31554:
                    activityM884 = CustomDialog.m884();
                    str = "ۥۦۢ";
                    continue;
                case 31640:
                    return activity;
                case 31843:
                    if (C0395.m5698() > 0) {
                        break;
                    } else if (C0396.m5741() < 0) {
                        str = "ۤۦۦ";
                    }
                case 32647:
                    str = "ۤۥ۟";
                    activity = activityM884;
                    continue;
            }
            if (C0121.m1023() >= 0) {
                C0377.m4944();
                str = "ۥۥ۠";
            } else {
                str = "۟۟ۢ";
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = "ۡۢ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750664) {
                case 6230:
                    C0383.m5230((ClipboardManager) C0121.m1006(m2941(), C0385.m5310(C0382.m5158())), m2940(this));
                    str = "ۦۡۢ";
                    break;
                case 28810:
                    str = "ۡۢ۟";
                    break;
                case 30479:
                    return;
            }
        }
    }
}
