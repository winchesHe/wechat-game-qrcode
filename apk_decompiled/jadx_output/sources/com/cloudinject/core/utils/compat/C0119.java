package com.cloudinject.core.utils.compat;

import android.app.C0009;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import java.lang.reflect.Method;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;

/* renamed from: com.cloudinject.core.utils.compat.̗̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0119 {
    /* renamed from: ̖̙̖, reason: not valid java name and contains not printable characters */
    public static boolean m979(Object obj) {
        String str = "ۦ۠";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753670) {
                case 909:
                    if (C0346.m3059() >= 0) {
                        z = false;
                    } else {
                        str = "ۥۣۨ";
                        z = false;
                        continue;
                    }
                case 931:
                    z2 = true;
                    if (C0369.m3256() > 0) {
                        str = "۠ۢۢ";
                    } else {
                        continue;
                    }
                case 1920:
                    if (C0155.m1294() < 0) {
                        str = "ۦۣۨ";
                    } else {
                        continue;
                    }
                case 1923:
                    if (C0060.m194(obj) != C0335.m2903()) {
                        break;
                    } else if (C0398.m5833() <= 0) {
                        C0383.m5203();
                    } else {
                        str = "ۦۣۤ";
                    }
                case 26788:
                case 32748:
                    str = "ۥۣۨ";
                    continue;
                case 26982:
                    if (C0334.m2866() <= 0) {
                        z = z2;
                    } else {
                        str = "ۣۤۨ";
                        z = z2;
                        continue;
                    }
                case 27840:
                    str = "ۦ۠";
                    continue;
                case 30735:
                    if (C0009.m36() < 0) {
                        str = "ۥ۠ۥ";
                    } else {
                        continue;
                    }
                case 31820:
                    return z;
                case 31840:
                    break;
                case 1711868:
                    if (obj == null) {
                        break;
                    } else if (C0073.m265() > 0) {
                        str = "ۧۥۣ";
                    }
            }
            str = "ۧۥۤ";
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static boolean m980(Method method) {
        String str = "ۦۦۤ";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747685) {
                case 483:
                    if (C0009.m36() >= 0) {
                        z = false;
                    } else {
                        str = "ۤۤ";
                        z = false;
                        continue;
                    }
                case 3423:
                    if (C0388.m5430() > 0) {
                        str = "۠ۡۧ";
                    } else {
                        continue;
                    }
                case 3553:
                    if (C0009.m36() >= 0) {
                        C0206.m1807();
                        str = "ۡۨ۟";
                        z = z2;
                    } else {
                        str = "ۡۡ";
                        z = z2;
                        continue;
                    }
                case 6273:
                    z2 = true;
                    if (C0229.m2064() < 0) {
                        str = "۟۟ۤ";
                    } else {
                        continue;
                    }
                case 6304:
                    str = "ۦۦۤ";
                    continue;
                case 25345:
                case 26818:
                    if (C0121.m1023() >= 0) {
                        C0346.m3059();
                    } else {
                        str = "ۤۤ";
                        continue;
                    }
                case 26756:
                    break;
                case 26817:
                    if (method == null) {
                        break;
                    } else if (C0378.m4998() > 0) {
                        str = "ۦۢۦ";
                    }
                case 27471:
                    if (C0379.m5041(method) != C0335.m2903()) {
                        break;
                    } else if (C0368.m3171() >= 0) {
                        C0228.m2012();
                        str = "۟ۡۢ";
                    } else {
                        str = "ۢ۠ۢ";
                    }
                case 1734245:
                    return z;
                case 1734341:
                    if (C0380.m5068() <= 0) {
                        C0368.m3171();
                    } else {
                        str = "ۦۦۧ";
                        continue;
                    }
            }
            if (C0393.m5668() > 0) {
                str = "۟ۥ۠";
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bd A[SYNTHETIC] */
    /* renamed from: ̗̙̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m981(java.util.List r9) {
        /*
            r1 = 0
            r8 = 0
            r7 = 1
            java.lang.String r0 = "ۤۤ۠"
            r2 = r1
            r3 = r1
        L7:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1748797(0x1aaf3d, float:2.450587E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 61: goto L13;
                case 1498: goto Lb7;
                case 1828: goto L35;
                case 2171: goto Lad;
                case 5401: goto L5d;
                case 5469: goto L3e;
                case 5602: goto Lad;
                case 5631: goto Lca;
                case 5846: goto L5e;
                case 6204: goto La5;
                case 6651: goto L51;
                case 7544: goto L75;
                case 27255: goto Lc6;
                case 27352: goto L2c;
                case 1733439: goto L8e;
                default: goto L12;
            }
        L12:
            goto L7
        L13:
            mirrorb.RefMethod r4 = android.app.C0009.m26()
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Boolean r6 = mirrorb.android.content.res.C0379.m5038(r7)
            r5[r8] = r6
            mirrorb.dalvik.system.C0399.m5877(r4, r3, r5)
            int r4 = androidx.core.graphics.drawable.C0086.m500()
            if (r4 > 0) goto La1
            mirrorb.android.hardware.fingerprint.C0381.m5127()
            goto L7
        L2c:
            int r4 = mirrorb.android.content.C0380.m5068()
            if (r4 <= 0) goto L7
            java.lang.String r0 = "۟ۡۨ"
            goto L7
        L35:
            boolean r0 = mirrorb.com.android.internal.C0398.m5858(r2)
            if (r0 == 0) goto Lca
            java.lang.String r0 = "ۣۧۥ"
            goto L7
        L3e:
            mirrorb.RefConstructor r4 = mirrorb.android.providers.C0391.m5555()
            if (r4 == 0) goto Lb7
            int r4 = mirrorb.com.android.internal.content.C0395.m5698()
            if (r4 < 0) goto L4e
            mirrorb.android.providers.C0391.m5571()
            goto L7
        L4e:
            java.lang.String r0 = "ۣۥۨ"
            goto L7
        L51:
            mirrorb.RefConstructor r0 = mirrorb.android.providers.C0391.m5555()
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r8] = r9
            java.lang.Object r3 = android.database.C0073.m262(r0, r1)
        L5d:
            return r3
        L5e:
            mirrorb.RefMethod r0 = mirrorb.android.accounts.C0375.m4859()
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r8] = r1
            mirrorb.dalvik.system.C0399.m5877(r0, r3, r4)
            int r0 = android.net.C0082.m410()
            if (r0 < 0) goto L72
            java.lang.String r0 = "ۡۥۧ"
            goto L7
        L72:
            java.lang.String r0 = "ۧۦۤ"
            goto L7
        L75:
            mirrorb.RefConstructor r0 = com.cloudinject.feature.p018.C0229.m2044()
            java.lang.Object r3 = com.cloudinject.feature.p021.C0291.m2550(r0)
            int r0 = mirrorb.dalvik.system.C0399.m5914()
            if (r0 > 0) goto L8a
            mirrorb.android.accounts.C0375.m4840()
            java.lang.String r0 = "۟ۧۥ"
            goto L7
        L8a:
            java.lang.String r0 = "۠ۢ"
            goto L7
        L8e:
            java.util.Iterator r2 = androidx.core.p007.C0088.m554(r9)
            int r4 = com.cloudinject.p025.p026.C0346.m3059()
            if (r4 < 0) goto L9d
            android.app.C0009.m36()
            goto L7
        L9d:
            java.lang.String r0 = "۟ۨۢ"
            goto L7
        La1:
            java.lang.String r0 = "ۤۢۢ"
            goto L7
        La5:
            java.lang.Object r1 = mirrorb.com.android.internal.C0398.m5850(r2)
            java.lang.String r0 = "ۤ۠ۧ"
            goto L7
        Lad:
            int r4 = com.cloudinject.feature.p018.C0228.m2012()
            if (r4 <= 0) goto L7
            java.lang.String r0 = "۟ۨۢ"
            goto L7
        Lb7:
            int r4 = com.cloudinject.feature.model.p014.C0191.m1627()
            if (r4 < 0) goto Lc2
            com.cloudinject.feature.p021.C0291.m2568()
            goto L7
        Lc2:
            java.lang.String r0 = "ۢ۟ۢ"
            goto L7
        Lc6:
            java.lang.String r0 = "ۤۤ۠"
            goto L7
        Lca:
            int r0 = com.sadfxg.fasg.C0370.m3284()
            if (r0 < 0) goto Ld7
            com.cloudinject.core.p009.p012.C0164.m1359()
            java.lang.String r0 = "ۨۦ"
            goto L7
        Ld7:
            java.lang.String r0 = "ۣۡۢ"
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.C0119.m981(java.util.List):java.lang.Object");
    }
}
