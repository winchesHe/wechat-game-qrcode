package com.cloudinject.feature.p023;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.content.Intent;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.p025.p026.C0346;
import mirrorb.android.accounts.C0375;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.location.C0385;
import mirrorb.android.os.mount.C0390;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.dalvik.system.C0399;

/* renamed from: com.cloudinject.feature.̙̙.̗̙̖̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0324 {
    /* renamed from: ̙̙, reason: not valid java name and contains not printable characters */
    public static boolean m2798(Context context, String str) {
        int iIntValue = 0;
        StringBuilder sb = null;
        Intent intent = null;
        Integer num = null;
        Object obj = "ۣۤۨ";
        while (true) {
            switch (C0395.m5690(obj) ^ 56509) {
                case 159:
                    try {
                        C0390.m5510(context, intent);
                        obj = "ۢ۠۟";
                        break;
                    } catch (Exception e) {
                        return false;
                    }
                case 1709165:
                    if (C0390.m5512() > 0) {
                        obj = "ۢ۠۟";
                        break;
                    } else {
                        obj = "ۣۦۥ";
                        break;
                    }
                case 1711805:
                    obj = "ۣۡ";
                    break;
                case 1711806:
                    C0060.m211(sb, C0385.m5310(C0395.m5688()));
                    obj = "۠ۤۡ";
                    break;
                case 1711870:
                    obj = "ۣۤۨ";
                    break;
                case 1730051:
                    sb = new StringBuilder();
                    obj = "ۦۥۢ";
                    break;
                case 1731098:
                    num = new Integer(273458207);
                    if (C0382.m5180() <= 0) {
                        break;
                    } else {
                        obj = "ۣۡۨ";
                        break;
                    }
                case 1732316:
                    return true;
                case 1733563:
                    intent = new Intent();
                    obj = "ۤۧۡ";
                    break;
                case 1734406:
                    C0399.m5894(intent, ((iIntValue ^ (-1)) & 5022751) | ((-5022752) & iIntValue));
                    if (C0121.m1023() < 0) {
                        obj = "ۣۡ";
                        break;
                    } else {
                        C0009.m36();
                        break;
                    }
                case 1734624:
                    C0060.m211(sb, str);
                    obj = "۟ۧۦ";
                    break;
                case 1735424:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    if (C0334.m2866() <= 0) {
                        break;
                    } else {
                        obj = "۠ۧۢ";
                        break;
                    }
                case 1735491:
                    C0025.m99(intent, C0346.m3039(C0377.m4932(sb)));
                    if (C0375.m4840() < 0) {
                        obj = "۟ۥۣ";
                        break;
                    } else {
                        obj = "ۥ۟ۡ";
                        break;
                    }
            }
        }
    }
}
