package com.cloudinject.core.utils.compat;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.content.Intent;
import android.database.C0074;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.C0362;
import com.px.C0368;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.location.C0385;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.core.utils.compat.̗̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0117 {
    public static IBinder getBinder(Bundle bundle, String str) {
        String str2 = "۟۟ۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56390) {
                case 1709537:
                    return (IBinder) C0399.m5877(C0381.m5134(), bundle, new Object[]{str});
                case 1710660:
                    str2 = "۟۟ۡ";
                    continue;
                case 1731236:
                    break;
                case 1733467:
                    return C0380.m5081(bundle, str);
                case 1735495:
                    if (C0388.m5428() < 18) {
                        break;
                    } else {
                        str2 = "ۡۤ۠";
                    }
            }
            if (C0074.m307() >= 0) {
                C0391.m5571();
            } else {
                str2 = "ۨۦۥ";
            }
        }
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        String str2 = "۟۟ۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1754660) {
                case 1123:
                    C0420.m6231(bundle, str, iBinder);
                    str2 = "ۤ۟ۡ";
                    continue;
                case 24869:
                    if (C0388.m5428() < 18) {
                        break;
                    } else {
                        str2 = "ۦۧۨ";
                    }
                case 24987:
                case 28005:
                    if (C0164.m1359() < 0) {
                        str2 = "۠ۧ";
                    } else {
                        continue;
                    }
                case 26754:
                    C0399.m5877(C0074.m308(), bundle, new Object[]{str, iBinder});
                    if (C0025.m118() <= 0) {
                        str2 = "ۧ۟ۨ";
                    } else {
                        str2 = "۠ۧ";
                        continue;
                    }
                case 26842:
                    break;
                case 26938:
                    str2 = "۟۟ۡ";
                    continue;
                case 32738:
                    if (C0164.m1359() < 0) {
                        str2 = "۟ۥۥ";
                    } else {
                        continue;
                    }
                case 1710627:
                    return;
            }
            if (C0397.m5814() <= 0) {
                C0179.m1427();
                str2 = "ۣۡۢ";
            } else {
                str2 = "ۡ۠ۥ";
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static IBinder m967(Intent intent, String str) {
        String str2 = "ۣ۠ۧ";
        Bundle bundleM5440 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755590) {
                case 3233:
                    return C0088.m578(bundleM5440, C0385.m5310(C0206.m1809()));
                case 25210:
                    bundleM5440 = C0388.m5440(intent, str);
                    if (C0368.m3171() >= 0) {
                        C0393.m5668();
                        str2 = "ۤۦۥ";
                    } else {
                        str2 = "ۡ۠ۨ";
                        continue;
                    }
                case 26446:
                    if (C0362.m3122() >= 0) {
                        str2 = "ۥۥ";
                    } else {
                        str2 = "ۣ۠ۧ";
                        continue;
                    }
                case 26479:
                    if (bundleM5440 == null) {
                        break;
                    } else {
                        str2 = C0009.m36() >= 0 ? "ۢۢ" : "ۧۢۢ";
                    }
                case 28704:
                    return null;
                case 29469:
                    break;
            }
            if (C0396.m5741() < 0) {
                str2 = "ۤ۠ۢ";
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static void m968(Intent intent, String str, IBinder iBinder) {
        Bundle bundle = null;
        String str2 = "ۦۤۤ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1749633) {
                case 5539:
                    C0392.m5594(intent, str, bundle);
                    if (C0378.m4998() > 0) {
                        str2 = "ۡۦۨ";
                        break;
                    } else {
                        str2 = "ۤۥۧ";
                        break;
                    }
                case 6461:
                    C0396.m5747(bundle, C0385.m5310(C0206.m1809()), iBinder);
                    if (C0382.m5180() > 0) {
                        str2 = "ۣ۟۠";
                        break;
                    } else {
                        str2 = "۟ۧۦ";
                        break;
                    }
                case 7650:
                    return;
                case 28805:
                    if (C0179.m1427() > 0) {
                        str2 = "ۦۤۤ";
                        break;
                    } else {
                        C0074.m307();
                        break;
                    }
                case 29543:
                    bundle = new Bundle();
                    if (C0334.m2866() > 0) {
                        str2 = "ۣ۠ۧ";
                        break;
                    } else {
                        str2 = "۟ۥۣ";
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118 A[SYNTHETIC] */
    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m969(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.C0117.m969(android.os.Bundle):void");
    }
}
