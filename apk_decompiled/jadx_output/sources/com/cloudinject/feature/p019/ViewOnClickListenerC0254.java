package com.cloudinject.feature.p019;

import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.database.C0073;
import android.view.View;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p023.C0334;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.rms.C0392;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.java.lang.C0400;

/* renamed from: com.cloudinject.feature.̗̙.̗̖̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ViewOnClickListenerC0254 implements View.OnClickListener {
    private int action;
    private Context mContext;

    /* renamed from: ̗̗̖̖̗̗̙, reason: not valid java name and contains not printable characters */
    private String f430;

    /* renamed from: ̗̗̙̗̙̗̗, reason: not valid java name and contains not printable characters */
    final C0257 f431;

    public ViewOnClickListenerC0254(C0257 c0257, String str, int i, Context context) {
        this.f431 = c0257;
        String str2 = "ۣۧۤ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1752677) {
                case 229:
                    if (C0073.m265() <= 0) {
                        break;
                    } else {
                        str2 = "ۣۧۤ";
                        break;
                    }
                case 2114:
                    this.action = i;
                    if (C0383.m5203() <= 0) {
                        break;
                    } else {
                        str2 = "ۣۡ۠";
                        break;
                    }
                case 3227:
                    return;
                case 4251:
                    this.mContext = context;
                    if (C0395.m5698() < 0) {
                        str2 = "ۢۥۡ";
                        break;
                    } else {
                        str2 = "۟۟ۥ";
                        break;
                    }
                case 31725:
                    this.f430 = str;
                    str2 = "ۣ۠ۤ";
                    break;
            }
        }
    }

    /* renamed from: ۟ۦۢۢ۟, reason: not valid java name and contains not printable characters */
    public static String m2241(Object obj) {
        String str = "ۥۦ۟";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747775) {
                case 58:
                    if (C0368.m3171() >= 0) {
                        C0392.m5595();
                        str = "ۨۦ۠";
                    } else {
                        str = "ۥۦ۟";
                        continue;
                    }
                case 93:
                case 7607:
                    if (C0229.m2064() >= 0) {
                        str = "ۡۧ۠";
                    } else {
                        str = "ۥۢ۟";
                        continue;
                    }
                case 1215:
                    if (C0369.m3256() <= 0) {
                        C0388.m5430();
                    } else {
                        str = "ۣۣۨ";
                        continue;
                    }
                case 3104:
                    if (C0394.m5672() <= 0) {
                        C0334.m2866();
                        str = "ۧۥۨ";
                        str2 = str3;
                    } else {
                        str = "ۥۢ۟";
                        str2 = str3;
                        continue;
                    }
                case 3230:
                    if (C0025.m118() > 0) {
                        str = "ۥ۟۠";
                    } else {
                        continue;
                    }
                case 5473:
                    if (C0384.m5278() <= 0) {
                        break;
                    } else if (C0228.m2012() > 0) {
                        str = "ۥ۠ۨ";
                    }
                case 5778:
                    str3 = ((ViewOnClickListenerC0254) obj).f430;
                    str = "۟۠۠";
                    continue;
                case 5817:
                    str = "ۡۧۦ";
                    str2 = null;
                    continue;
                case 5853:
                    return str2;
                case 25178:
                    break;
            }
            str = "۟ۤۦ";
        }
    }

    /* renamed from: ۡۥۣۡ, reason: not valid java name and contains not printable characters */
    public static int m2242(Object obj) {
        String str = "۠ۡ۠";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746873) {
                case 3271:
                    i2 = ((ViewOnClickListenerC0254) obj).action;
                    str = "ۣ۟ۨ";
                    continue;
                case 3398:
                    if (C0060.m216() <= 0) {
                        break;
                    } else if (C0060.m216() <= 0) {
                        C0375.m4840();
                    } else {
                        str = "۠ۥۣ";
                    }
                case 4421:
                    break;
                case 4533:
                    if (C0400.m5961() <= 0) {
                        C0377.m4944();
                        i = i2;
                    } else {
                        str = "ۣۧ۠";
                        i = i2;
                        continue;
                    }
                case 5626:
                case 28528:
                    str = "ۣۧ۠";
                    continue;
                case 6773:
                    if (C0375.m4840() >= 0) {
                        C0376.m4906();
                    } else {
                        str = "۠ۡ۠";
                        continue;
                    }
                case 25016:
                    if (C0390.m5512() <= 0) {
                        i = 0;
                    } else {
                        str = "ۨۨۤ";
                        i = 0;
                        continue;
                    }
                case 25137:
                    if (C0334.m2866() > 0) {
                        str = "ۧۧۡ";
                    } else {
                        continue;
                    }
                case 25149:
                    return i;
                case 28253:
                    if (C0377.m4944() <= 0) {
                        C0390.m5512();
                        str = "ۨۦۣ";
                    } else {
                        str = "ۢ۟۠";
                        continue;
                    }
            }
            if (C0179.m1427() > 0) {
                str = "ۣۧۤ";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0006 A[SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r8) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p019.ViewOnClickListenerC0254.onClick(android.view.View):void");
    }
}
