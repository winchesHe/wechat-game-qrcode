package com.cloudinject.core.utils.compat;

import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.Uri;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import androidx.core.view.InputDeviceCompat;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.core.utils.compat.̗̗, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0118 {
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    private static ContentProviderClient m970(Context context, Uri uri) {
        String str = "ۣۤ۠";
        ContentProviderClient contentProviderClientM1280 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56384) {
                case 1709226:
                    try {
                        if (C0388.m5428() < 16) {
                            break;
                        } else if (C0382.m5180() <= 0) {
                            C0378.m4998();
                        } else {
                            str = "۠ۡۦ";
                        }
                    } catch (SecurityException e) {
                        C0398.m5856(e);
                        return null;
                    }
                case 1711370:
                    return contentProviderClientM1280;
                case 1728936:
                    if (C0394.m5672() <= 0) {
                        str = "ۡۧۧ";
                    } else {
                        str = "ۦۣ۟";
                        continue;
                    }
                case 1730053:
                    break;
                case 1730209:
                    str = "ۨ۠ۢ";
                    continue;
                case 1731295:
                    str = "ۨ۠ۢ";
                    continue;
                case 1732386:
                    contentProviderClientM1280 = C0155.m1280(C0387.m5364(context), uri);
                    if (C0384.m5278() <= 0) {
                        C0386.m5322();
                    } else {
                        str = "ۦۣ۟";
                        continue;
                    }
                case 1733469:
                    if (C0392.m5595() <= 0) {
                        C0025.m118();
                    } else {
                        str = "ۣۤ۠";
                        continue;
                    }
                case 1734469:
                    return C0420.m6238(C0387.m5364(context), uri);
            }
            str = "ۢۨۨ";
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static ContentProviderClient m971(Context context, Uri uri, int i) {
        Long l = null;
        int i2 = 0;
        long jLongValue = 0;
        int i3 = 0;
        ContentProviderClient contentProviderClientM976 = null;
        ContentProviderClient contentProviderClient = null;
        String str = "ۢ۟۠";
        ContentProviderClient contentProviderClientM9762 = null;
        ContentProviderClient contentProviderClient2 = null;
        int i4 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753478) {
                case 76:
                    break;
                case 933:
                    return contentProviderClient2;
                case 1059:
                    if (i4 >= i) {
                        break;
                    } else if (C0389.m5481() <= 0) {
                        C0392.m5595();
                        str = "ۡۡ۠";
                    } else {
                        str = "ۢ۠ۢ";
                    }
                case 1091:
                    if (C0385.m5282() >= 0) {
                        str = "ۤۥ۠";
                        contentProviderClient2 = contentProviderClient;
                    } else {
                        str = "ۧۤۢ";
                        contentProviderClient2 = contentProviderClient;
                        continue;
                    }
                case 1263:
                case 1920:
                    if (C0382.m5180() <= 0) {
                        C0334.m2866();
                        str = "ۤ۟ۨ";
                    } else {
                        str = "ۧۥۣ";
                        continue;
                    }
                case 27174:
                    str = "ۧۥۣ";
                    contentProviderClient = contentProviderClientM9762;
                    continue;
                case 27271:
                    str = "۠ۦۦ";
                    i4 = i2;
                    continue;
                case 27365:
                    if (contentProviderClientM9762 != null) {
                        break;
                    } else if (C0396.m5741() >= 0) {
                        C0395.m5698();
                    } else {
                        str = "ۤۢ۟";
                    }
                case 28379:
                    C0379.m5018((((-1) ^ jLongValue) & 8886440) | ((8886440 ^ (-1)) & jLongValue));
                    if (C0083.m448() >= 0) {
                        C0387.m5374();
                    } else {
                        str = "ۥۥۦ";
                        continue;
                    }
                case 28417:
                    contentProviderClientM976 = m976(context, uri);
                    if (C0370.m3284() < 0) {
                        str = "ۣۧۢ";
                    } else {
                        continue;
                    }
                case 29637:
                    l = new Long(8886476L);
                    if (C0346.m3059() >= 0) {
                        C0390.m5512();
                        str = "ۣ۟۟";
                    } else {
                        str = "ۥۨۥ";
                        continue;
                    }
                case 29666:
                    if (C0086.m500() <= 0) {
                        contentProviderClient2 = contentProviderClient;
                    } else {
                        str = "ۣۨۢ";
                        contentProviderClient2 = contentProviderClient;
                        continue;
                    }
                case 29671:
                    str = "ۧۧۦ";
                    continue;
                case 30363:
                    if (contentProviderClient != null) {
                        break;
                    } else if (C0384.m5278() <= 0) {
                        C0390.m5512();
                        str = "ۨ۠ۨ";
                    } else {
                        str = "ۣۤۢ";
                    }
                case 30503:
                    jLongValue = ((Long) new Object[]{l}[0]).longValue();
                    str = "ۡۦۢ";
                    continue;
                case 30584:
                    if (C0369.m3256() <= 0) {
                        contentProviderClient = contentProviderClientM976;
                    } else {
                        str = "ۤۧ۟";
                        contentProviderClient = contentProviderClientM976;
                        continue;
                    }
                case 31546:
                    str = "ۢ۠۟";
                    i4 = i3;
                    continue;
                case 31655:
                    i2 = 0;
                    if (C0398.m5833() > 0) {
                        str = "۠ۡۢ";
                    } else {
                        continue;
                    }
                case 31808:
                    str = "ۢ۟۠";
                    continue;
                case 32548:
                    contentProviderClientM9762 = m976(context, uri);
                    str = "۟ۧ";
                    continue;
                case 32704:
                    i3 = i4 + 1;
                    str = "ۡ۟ۥ";
                    continue;
                case 1710702:
                    if (C0377.m4944() <= 0) {
                        C0184.m1524();
                        contentProviderClient2 = contentProviderClientM9762;
                    } else {
                        str = "۠ۤۧ";
                        contentProviderClient2 = contentProviderClientM9762;
                        continue;
                    }
            }
            if (C0074.m307() < 0) {
                str = "ۦۦۣ";
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static ContentProviderClient m972(Context context, String str, int i) {
        int i2 = 0;
        long jLongValue = 0;
        Long l = null;
        ContentProviderClient contentProviderClient = null;
        ContentProviderClient contentProviderClientM978 = null;
        int i3 = 0;
        ContentProviderClient contentProviderClient2 = null;
        int i4 = 0;
        ContentProviderClient contentProviderClientM9782 = null;
        Object obj = "ۡۢۡ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1748646) {
                case 70:
                    l = new Long(1236441L);
                    obj = "ۥ۠۟";
                    continue;
                case 390:
                    if (C0376.m4906() <= 0) {
                        C0396.m5741();
                        obj = "ۤۨۢ";
                    } else {
                        obj = "ۦ۟ۧ";
                        continue;
                    }
                case 1089:
                    if (contentProviderClientM978 != null) {
                        break;
                    } else if (C0387.m5374() >= 0) {
                        C0390.m5512();
                        obj = "ۤۧۢ";
                    } else {
                        obj = "ۨۤۥ";
                    }
                case 1337:
                    return contentProviderClient;
                case 1382:
                    obj = "۟ۥۦ";
                    contentProviderClient2 = contentProviderClientM978;
                    continue;
                case 2363:
                    obj = "ۡۢۡ";
                    continue;
                case 2406:
                    if (C0183.m1464() <= 0) {
                        C0381.m5127();
                        obj = "۠ۦۦ";
                        contentProviderClient = contentProviderClient2;
                    } else {
                        obj = "ۤۢۢ";
                        contentProviderClient = contentProviderClient2;
                        continue;
                    }
                case 4323:
                    obj = "ۨ۟۠";
                    contentProviderClient = contentProviderClient2;
                    continue;
                case 4866:
                    contentProviderClientM978 = m978(context, str);
                    if (C0389.m5481() <= 0) {
                        C0400.m5961();
                        obj = "ۦۥۤ";
                    } else {
                        obj = "ۤۦ";
                        continue;
                    }
                case 4960:
                    i4 = 0 - ((0 - i3) - 1);
                    obj = "ۨۨۡ";
                    continue;
                case 5250:
                    if (i3 >= i) {
                        break;
                    } else {
                        obj = "ۥۥۥ";
                    }
                case 6343:
                    jLongValue = ((Long) new Object[]{l}[0]).longValue();
                    if (C0164.m1359() >= 0) {
                        C0378.m4998();
                    } else {
                        obj = "ۢۨ۟";
                        continue;
                    }
                case 6368:
                case 28648:
                    obj = "۟ۥۦ";
                    continue;
                case 7588:
                    if (C0389.m5481() <= 0) {
                        C0362.m3122();
                        i3 = i4;
                    } else {
                        obj = "ۣۡۤ";
                        i3 = i4;
                        continue;
                    }
                case 7679:
                    C0379.m5018((((-1) ^ jLongValue) & 1236413) | ((1236413 ^ (-1)) & jLongValue));
                    if (C0396.m5741() >= 0) {
                        C0191.m1627();
                        obj = "ۤۤۨ";
                    } else {
                        obj = "ۥۡۢ";
                        continue;
                    }
                case 26223:
                    if (contentProviderClient2 != null) {
                        break;
                    } else {
                        obj = "ۣۢ۠";
                    }
                case 26439:
                    contentProviderClientM9782 = m978(context, str);
                    if (C0164.m1359() < 0) {
                        obj = "ۦ۟ۡ";
                    } else {
                        continue;
                    }
                case 26575:
                    i2 = 0;
                    if (C0368.m3171() < 0) {
                        obj = "ۦۦۦ";
                    } else {
                        continue;
                    }
                case 27776:
                    if (C0088.m573() <= 0) {
                        i3 = i2;
                    } else {
                        obj = "۠ۧۧ";
                        i3 = i2;
                        continue;
                    }
                case 28654:
                    obj = "ۢۥۥ";
                    contentProviderClient2 = contentProviderClientM9782;
                    continue;
                case 1733144:
                    break;
                case 1733156:
                    if (C0083.m448() >= 0) {
                        contentProviderClient = contentProviderClientM978;
                    } else {
                        obj = "۠۠ۧ";
                        contentProviderClient = contentProviderClientM978;
                        continue;
                    }
            }
            if (C0393.m5668() > 0) {
                obj = "۠ۦۥ";
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0008 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle m973(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String r12, android.os.Bundle r13, int r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.C0118.m973(android.content.Context, android.net.Uri, java.lang.String, java.lang.String, android.os.Bundle, int):android.os.Bundle");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006e A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m974(android.content.ContentProviderClient r3) {
        /*
            java.lang.String r0 = "۠۠ۦ"
        L2:
            int r1 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r2 = 1754500(0x1ac584, float:2.458578E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 44: goto Le;
                case 70: goto L38;
                case 3085: goto L75;
                case 3138: goto L68;
                case 25274: goto L86;
                case 27391: goto L68;
                case 28514: goto L3e;
                case 29601: goto L1d;
                case 30752: goto L5b;
                case 31652: goto L1a;
                case 32655: goto L68;
                case 1710424: goto L2d;
                default: goto Ld;
            }
        Ld:
            goto L2
        Le:
            int r0 = com.cloudinject.feature.model.p014.C0191.m1627()
            if (r0 < 0) goto L82
            mirrorb.android.hardware.fingerprint.C0381.m5127()
            java.lang.String r0 = "ۢۦۥ"
            goto L2
        L1a:
            java.lang.String r0 = "ۨۧۥ"
            goto L2
        L1d:
            mirrorb.android.net.C0389.m5498(r3)     // Catch: java.lang.Exception -> L4d
            int r1 = androidx.core.p007.C0089.m592()
            if (r1 > 0) goto L2a
            mirrorb.com.android.internal.content.C0395.m5698()
            goto L2
        L2a:
            java.lang.String r0 = "ۥۤ۟"
            goto L2
        L2d:
            int r1 = mirrorb.android.net.wifi.C0388.m5428()     // Catch: java.lang.Exception -> L4d
            r2 = 24
            if (r1 < r2) goto L5b
            java.lang.String r0 = "ۣ۠ۢ"
            goto L2
        L38:
            com.cloudinject.p025.C0362.m3121(r3)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = "۟ۡ۠"
            goto L2
        L3e:
            if (r3 == 0) goto L68
            int r1 = android.database.C0073.m265()
            if (r1 > 0) goto L4a
            com.cloudinject.feature.p021.C0291.m2568()
            goto L2
        L4a:
            java.lang.String r0 = "ۣۧ"
            goto L2
        L4d:
            r1 = move-exception
            int r1 = com.cloudinject.core.p009.p012.C0164.m1359()
            if (r1 < 0) goto L58
            android.arch.p003.p005.C0060.m216()
            goto L2
        L58:
            java.lang.String r0 = "ۤۡۨ"
            goto L2
        L5b:
            int r1 = com.cloudinject.core.utils.compat.C0121.m1023()
            if (r1 < 0) goto L65
            com.cloudinject.p025.p026.C0346.m3059()
            goto L2
        L65:
            java.lang.String r0 = "ۧۥ۠"
            goto L2
        L68:
            int r1 = com.cloudinject.feature.p018.C0229.m2064()
            if (r1 < 0) goto L72
            mirrorb.android.os.mount.C0390.m5512()
            goto L2
        L72:
            java.lang.String r0 = "۟ۡ۠"
            goto L2
        L75:
            int r1 = mirrorb.android.util.C0393.m5668()
            if (r1 > 0) goto L7f
            mirrorb.android.app.servertransaction.C0378.m4998()
            goto L2
        L7f:
            java.lang.String r0 = "ۣۧ"
            goto L2
        L82:
            java.lang.String r0 = "۠۠ۦ"
            goto L2
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.C0118.m974(android.content.ContentProviderClient):void");
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    private static ContentProviderClient m975(Context context, String str) {
        String str2 = "ۤۨۥ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753640) {
                case 1997:
                    return C0375.m4860(C0387.m5364(context), str);
                case 2817:
                    str2 = "ۤۨۥ";
                    continue;
                case 26963:
                    return C0155.m1286(C0387.m5364(context), str);
                case 28884:
                    break;
                case 30921:
                    if (C0388.m5428() < 16) {
                        break;
                    } else if (C0377.m4944() <= 0) {
                        C0420.m6215();
                        str2 = "ۥ۠ۥ";
                    } else {
                        str2 = "۠ۥ۠";
                    }
            }
            if (C0369.m3256() <= 0) {
                C0391.m5571();
            } else {
                str2 = "ۧۦۤ";
            }
        }
    }

    /* renamed from: ۣ۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static ContentProviderClient m976(Object obj, Object obj2) {
        String str = "ۣ۠۟";
        ContentProviderClient contentProviderClient = null;
        ContentProviderClient contentProviderClientM970 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748706) {
                case 102:
                case 2396:
                    if (C0388.m5430() > 0) {
                        str = "ۥ۟ۤ";
                    } else {
                        continue;
                    }
                case 1502:
                    if (C0335.m2923() >= 0) {
                        break;
                    } else if (C0291.m2568() >= 0) {
                        C0377.m4944();
                    } else {
                        str = "ۣ۟ۦ";
                    }
                case 2393:
                    str = "۟ۥۤ";
                    continue;
                case 2527:
                    if (C0089.m592() <= 0) {
                        str = "ۨۤۦ";
                    } else {
                        str = "ۣ۠۟";
                        continue;
                    }
                case 4968:
                    return contentProviderClient;
                case 5353:
                    str = "۟ۥۡ";
                    contentProviderClient = null;
                    continue;
                case 6204:
                    if (C0184.m1524() >= 0) {
                        str = "ۣۡ۟";
                        contentProviderClient = contentProviderClientM970;
                    } else {
                        str = "ۥ۟ۤ";
                        contentProviderClient = contentProviderClientM970;
                        continue;
                    }
                case 6376:
                    contentProviderClientM970 = m970((Context) obj, (Uri) obj2);
                    str = "ۣۦۡ";
                    continue;
                case 7617:
                    break;
                case 1733177:
                    if (C0393.m5668() > 0) {
                        str = "ۤۡۨ";
                    } else {
                        continue;
                    }
            }
            if (C0334.m2866() <= 0) {
                C0383.m5203();
                str = "ۧۦۣ";
            } else {
                str = "ۧۢ";
            }
        }
    }

    /* renamed from: ۟ۦۥۣۨ, reason: not valid java name and contains not printable characters */
    public static void m977(Object obj) {
        Object obj2 = "ۥۨۦ";
        while (true) {
            switch (C0395.m5690(obj2) ^ 1751589) {
                case 254:
                    if (C0388.m5430() > 0) {
                        obj2 = "ۥۨۦ";
                    } else {
                        continue;
                    }
                case 1158:
                    if (C0380.m5068() <= 0) {
                        break;
                    } else if (C0400.m5961() > 0) {
                        obj2 = "ۣۢۤ";
                    }
                case 2267:
                    return;
                case 2278:
                    m974((ContentProviderClient) obj);
                    if (C0391.m5571() <= 0) {
                        C0369.m3256();
                    } else {
                        obj2 = "ۢۥۡ";
                        continue;
                    }
                case 4346:
                case 1730052:
                    if (C0082.m410() < 0) {
                        obj2 = "ۢۥۡ";
                    } else {
                        continue;
                    }
                case 4504:
                    obj2 = "ۡۢ";
                    continue;
                case 1728967:
                    break;
            }
            if (C0335.m2923() < 0) {
                obj2 = "۠ۧۤ";
            }
        }
    }

    /* renamed from: ۥۣ۠ۢ, reason: contains not printable characters */
    public static ContentProviderClient m978(Object obj, Object obj2) {
        Object obj3 = "۠۠ۢ";
        ContentProviderClient contentProviderClient = null;
        ContentProviderClient contentProviderClientM975 = null;
        while (true) {
            switch (C0395.m5690(obj3) ^ 1751618) {
                case 11:
                    if (C0164.m1359() >= 0) {
                        obj3 = "ۦ۠ۤ";
                        contentProviderClient = null;
                    } else {
                        obj3 = "ۥۣۧ";
                        contentProviderClient = null;
                        continue;
                    }
                case 68:
                    obj3 = "ۦۤ۠";
                    contentProviderClient = contentProviderClientM975;
                    continue;
                case 159:
                case 32673:
                    if (C0060.m216() > 0) {
                        obj3 = "ۦۤ۠";
                    } else {
                        continue;
                    }
                case InputDeviceCompat.SOURCE_GAMEPAD /* 1025 */:
                    if (C0279.m2491() >= 0) {
                        C0183.m1464();
                    } else {
                        obj3 = "۠۠ۢ";
                        continue;
                    }
                case 1219:
                    obj3 = "ۧۦۢ";
                    continue;
                case 3141:
                    obj3 = "ۣۤۨ";
                    continue;
                case 4256:
                    if (C0380.m5068() <= 0) {
                        break;
                    } else {
                        obj3 = "ۣۡ۟";
                    }
                case 5319:
                    contentProviderClientM975 = m975((Context) obj, (String) obj2);
                    if (C0083.m448() < 0) {
                        obj3 = "ۣۤۡ";
                    } else {
                        continue;
                    }
                case 29672:
                    break;
                case 31648:
                    return contentProviderClient;
            }
            obj3 = "ۣۣ۟";
        }
    }
}
