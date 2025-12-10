package com.cloudinject.core.utils.compat;

import android.arch.lifecycle.p000.C0025;
import android.net.wifi.C0078;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.px.C0368;
import mirrorb.android.accounts.C0376;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.providers.C0391;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;

/* renamed from: com.cloudinject.core.utils.compat.̖̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0114 {

    /* renamed from: ̗̗̖̙̗̖̙, reason: not valid java name and contains not printable characters */
    public static int f182;

    /* renamed from: ̗̗̙̖̙̖̙, reason: not valid java name and contains not printable characters */
    public static int f183;

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d5 A[SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.C0114.<clinit>():void");
    }

    /* renamed from: ̗̙̙̙̗̙, reason: not valid java name and contains not printable characters */
    public static boolean m963() {
        String str = "ۣۤۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752521) {
                case 99:
                    if (C0206.m1807() >= 0) {
                        break;
                    } else {
                        str = "ۣۤۤ";
                        break;
                    }
                case 1932:
                    str = "ۣۨۦ";
                    break;
                case 3904:
                    return true;
                case 3980:
                    if (C0368.m3171() >= 0) {
                        break;
                    } else {
                        str = "ۢۡۨ";
                        break;
                    }
                case 29826:
                    try {
                        C0078.m358(C0381.m5130(), new Object[0]);
                        if (C0164.m1359() >= 0) {
                            break;
                        } else {
                            str = "ۢۡۨ";
                            break;
                        }
                    } catch (Throwable th) {
                        try {
                            int iM5082 = C0380.m5082(C0388.m5460());
                            int iM5873 = C0399.m5873();
                            int iM5549 = C0391.m5549();
                            C0396.m5739(C0388.m5460(), iM5082 & (((((iM5873 & iM5549) | (iM5873 ^ iM5549)) ^ (-1)) ^ (-1)) ^ iM5082));
                            if (C0334.m2866() <= 0) {
                                break;
                            } else {
                                str = "ۦۧ۠";
                                break;
                            }
                        } catch (Throwable th2) {
                            C0025.m109(th2);
                            return false;
                        }
                    }
                case 32683:
                    if (C0279.m2491() < 0) {
                        str = "ۣۨۦ";
                        break;
                    } else {
                        C0229.m2064();
                        str = "ۦۣۧ";
                        break;
                    }
                case 32758:
                    if (C0376.m4906() <= 0) {
                        break;
                    } else {
                        str = "ۡۤ";
                        break;
                    }
                case 1729002:
                    return true;
            }
        }
    }
}
