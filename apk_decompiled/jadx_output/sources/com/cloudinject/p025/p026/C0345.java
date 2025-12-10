package com.cloudinject.p025.p026;

import android.arch.lifecycle.p000.C0025;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.wifi.C0078;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.feature.p023.C0335;
import mirrorb.android.accounts.C0375;
import mirrorb.android.content.C0380;
import mirrorb.android.location.C0384;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.dalvik.system.C0399;

/* renamed from: com.cloudinject.̗.̗.̗̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0345 {
    /* renamed from: ̙̗, reason: not valid java name and contains not printable characters */
    public static String m3022(Context context, String str) {
        String str2 = "ۣ۟ۧ";
        ApplicationInfo applicationInfoM4846 = null;
        PackageInfo packageInfoM1428 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753508) {
                case 929:
                    if (packageInfoM1428 == null) {
                        break;
                    } else if (C0384.m5278() <= 0) {
                        C0398.m5833();
                    } else {
                        str2 = "ۤۧ۠";
                    }
                case 1154:
                    return null;
                case 2054:
                    return C0025.m105(applicationInfoM4846);
                case 27161:
                    applicationInfoM4846.publicSourceDir = str;
                    str2 = "ۨۦ۠";
                    continue;
                case 27333:
                    if (C0380.m5068() <= 0) {
                        C0088.m573();
                        str2 = "ۧۦۢ";
                    } else {
                        str2 = "ۣ۟ۧ";
                        continue;
                    }
                case 30368:
                    break;
                case 30523:
                    applicationInfoM4846.sourceDir = str;
                    if (C0078.m361() <= 0) {
                        C0335.m2923();
                    } else {
                        str2 = "۠ۧۤ";
                        continue;
                    }
                case 30639:
                    packageInfoM1428 = C0179.m1428(C0086.m511(context), str, 1);
                    if (C0399.m5914() > 0) {
                        str2 = "ۦۥۤ";
                    } else {
                        continue;
                    }
                case 31513:
                    applicationInfoM4846 = C0375.m4846(packageInfoM1428);
                    str2 = "ۣۤ۠";
                    continue;
            }
            str2 = "ۧ۠۟";
        }
    }
}
