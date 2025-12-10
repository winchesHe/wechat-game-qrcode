package com.cloudinject.core.utils;

import android.net.C0082;
import androidx.core.p007.C0089;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.px.C0368;
import java.util.HashSet;
import mirrorb.android.accounts.C0375;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.rms.C0392;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.core.utils.̗̖̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0128 {
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static int m1035(Class[] clsArr, Class<?> cls) {
        String str = "ۥۣۧ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750631) {
                case 2051:
                    str = "ۤۥ";
                case 2244:
                    str = "ۨۨۥ";
                case 2278:
                    str = "۟ۧ";
                case 2988:
                    if (C0388.m5430() <= 0) {
                        i2 = i;
                    } else {
                        str = "ۨۧ";
                        i2 = i;
                    }
                case 3203:
                    if (i2 >= clsArr.length) {
                        str = "ۨۨۥ";
                    } else if (C0383.m5203() <= 0) {
                        C0420.m6215();
                    } else {
                        str = "ۨ۟۟";
                    }
                case 3290:
                    if (C0229.m2064() < 0) {
                        str = "ۥۣۧ";
                    }
                case 29455:
                case 1731321:
                    str = "ۤۨۨ";
                case 32431:
                    if (!C0089.m617(clsArr[i2], cls)) {
                        str = "ۤۥ";
                    } else if (C0388.m5430() > 0) {
                        str = "ۨۤۤ";
                    }
                case 32527:
                    return i2;
                case 32642:
                    return -1;
                case 1731224:
                    if (C0380.m5068() <= 0) {
                        C0392.m5595();
                    } else {
                        str = "ۥۣ";
                    }
                case 1731302:
                    i = (i2 - 29) + 1 + 29;
                    str = "ۥۡۧ";
                case 1731983:
                    str = "ۤۨۨ";
                    i2 = 0;
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static int m1036(Object[] objArr, Class<?> cls) {
        String str = "ۣ۠ۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751749) {
                case 230:
                    if (C0394.m5672() > 0) {
                        str = "ۣ۠ۥ";
                        break;
                    } else {
                        str = "ۢۡۨ";
                        break;
                    }
                case 3309:
                    return C0420.m6209(objArr, cls, 0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b2 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m1037(java.lang.Object[] r7, java.lang.Class<?> r8, int r9) {
        /*
            r1 = 0
            r2 = 0
            java.lang.String r0 = "ۡۥ۠"
            r3 = r1
            r4 = r1
        L6:
            int r5 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r6 = 1747930(0x1aabda, float:2.449372E-39)
            r5 = r5 ^ r6
            switch(r5) {
                case 1210: goto L12;
                case 1254: goto L85;
                case 3239: goto L51;
                case 4507: goto Lbb;
                case 5498: goto L55;
                case 6398: goto L3e;
                case 6527: goto L93;
                case 7463: goto L35;
                case 7481: goto L1b;
                case 7633: goto L65;
                case 25215: goto L64;
                case 25264: goto L66;
                case 25329: goto La8;
                case 27222: goto L65;
                case 28189: goto La4;
                case 28211: goto L93;
                case 28407: goto Lac;
                case 1734619: goto L26;
                case 1734650: goto L75;
                default: goto L11;
            }
        L11:
            goto L6
        L12:
            int r5 = com.cloudinject.p025.p026.C0346.m3059()
            if (r5 >= 0) goto L6
            java.lang.String r0 = "ۢۢۥ"
            goto L6
        L1b:
            r2 = r7[r3]
            int r5 = mirrorb.android.accounts.C0375.m4840()
            if (r5 >= 0) goto L6
            java.lang.String r0 = "۠ۡ"
            goto L6
        L26:
            if (r2 == 0) goto La4
            int r5 = com.cloudinject.feature.p021.p022.C0279.m2491()
            if (r5 < 0) goto L32
            android.database.C0073.m265()
            goto L6
        L32:
            java.lang.String r0 = "ۢۦۨ"
            goto L6
        L35:
            boolean r0 = android.database.C0073.m253(r8, r2)
            if (r0 == 0) goto Lbb
            java.lang.String r0 = "ۣ۟ۧ"
            goto L6
        L3e:
            java.lang.Class r5 = android.arch.p003.p005.C0060.m194(r2)
            if (r5 != r8) goto La4
            int r5 = com.sadfxg.fasg.C0370.m3284()
            if (r5 < 0) goto L4e
            android.database.C0074.m307()
            goto L6
        L4e:
            java.lang.String r0 = "ۦۡۧ"
            goto L6
        L51:
            java.lang.String r0 = "ۡۡ"
            r3 = r4
            goto L6
        L55:
            int r3 = com.cloudinject.core.utils.compat.C0121.m1023()
            if (r3 < 0) goto L60
            androidx.core.p007.C0088.m573()
            r3 = r1
            goto L6
        L60:
            java.lang.String r0 = "ۡۦۥ"
            r3 = r1
            goto L6
        L64:
            r3 = -1
        L65:
            return r3
        L66:
            int r1 = r3 + 1
            int r5 = android.database.C0074.m307()
            if (r5 < 0) goto L72
            mirrorb.android.net.C0389.m5481()
            goto L6
        L72:
            java.lang.String r0 = "ۥۣۨ"
            goto L6
        L75:
            int r5 = r7.length
            if (r3 >= r5) goto Lac
            int r5 = com.cloudinject.customview.C0183.m1464()
            if (r5 > 0) goto L82
            com.cloudinject.feature.p015.C0206.m1807()
            goto L6
        L82:
            java.lang.String r0 = "ۣۦۦ"
            goto L6
        L85:
            int r4 = android.database.C0074.m307()
            if (r4 < 0) goto L8e
            r4 = r9
            goto L6
        L8e:
            java.lang.String r0 = "ۣ۟ۡ"
            r4 = r9
            goto L6
        L93:
            int r0 = androidx.core.p007.C0089.m592()
            if (r0 > 0) goto La0
            android.net.C0083.m448()
            java.lang.String r0 = "ۢ۠ۡ"
            goto L6
        La0:
            java.lang.String r0 = "ۡۡ"
            goto L6
        La4:
            java.lang.String r0 = "ۣۧۡ"
            goto L6
        La8:
            java.lang.String r0 = "ۡۥ۠"
            goto L6
        Lac:
            int r5 = android.app.C0009.m36()
            if (r5 < 0) goto Lb7
            mirrorb.android.util.C0393.m5668()
            goto L6
        Lb7:
            java.lang.String r0 = "ۨۦۣ"
            goto L6
        Lbb:
            java.lang.String r0 = "ۨۤۦ"
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0128.m1037(java.lang.Object[], java.lang.Class, int):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0064 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1038(java.lang.Class r4, java.util.HashSet<java.lang.Class<?>> r5) {
        /*
            r1 = 0
            java.lang.String r0 = "ۢۦ۠"
        L3:
            int r2 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r3 = 1746782(0x1aa75e, float:2.447763E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 2139: goto Lf;
                case 3485: goto L6a;
                case 3911: goto L24;
                case 5186: goto L4e;
                case 6484: goto L48;
                case 7546: goto L10;
                case 26163: goto L5e;
                case 26266: goto L5b;
                case 1735549: goto L38;
                default: goto Le;
            }
        Le:
            goto L3
        Lf:
            return
        L10:
            java.lang.Class r0 = com.cloudinject.core.utils.compat.C0121.m1019(r4)
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r0 == r2) goto L5e
            int r0 = mirrorb.android.location.C0384.m5278()
            if (r0 > 0) goto L21
            java.lang.String r0 = "ۦۣۡ"
            goto L3
        L21:
            java.lang.String r0 = "۟ۨۢ"
            goto L3
        L24:
            java.lang.Class r2 = com.cloudinject.core.utils.compat.C0121.m1019(r4)
            android.net.C0082.m427(r2, r5)
            int r2 = com.cloudinject.core.p009.p012.C0164.m1359()
            if (r2 < 0) goto L35
            p027.p028.p029.C0420.m6215()
            goto L3
        L35:
            java.lang.String r0 = "ۣۡۧ"
            goto L3
        L38:
            java.util.List r2 = android.arch.lifecycle.p000.C0025.m113(r1)
            com.cloudinject.feature.p023.C0335.m2924(r5, r2)
            int r2 = com.sadfxg.fasg.C0370.m3284()
            if (r2 >= 0) goto L3
            java.lang.String r0 = "ۤۢۢ"
            goto L3
        L48:
            int r0 = r1.length
            if (r0 == 0) goto L5b
            java.lang.String r0 = "ۡۤ"
            goto L3
        L4e:
            java.lang.Class[] r1 = mirrorb.android.util.C0393.m5652(r4)
            int r2 = com.cloudinject.feature.p021.C0291.m2568()
            if (r2 >= 0) goto L3
            java.lang.String r0 = "ۥۣۨ"
            goto L3
        L5b:
            java.lang.String r0 = "ۤۢۢ"
            goto L3
        L5e:
            int r0 = mirrorb.dalvik.system.C0399.m5914()
            if (r0 > 0) goto L67
            java.lang.String r0 = "ۡۧ۟"
            goto L3
        L67:
            java.lang.String r0 = "ۣۡۧ"
            goto L3
        L6a:
            int r2 = mirrorb.android.hardware.fingerprint.C0381.m5127()
            if (r2 > 0) goto L74
            com.cloudinject.feature.p021.C0291.m2568()
            goto L3
        L74:
            java.lang.String r0 = "ۢۦ۠"
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0128.m1038(java.lang.Class, java.util.HashSet):void");
    }

    /* renamed from: ̗̖̖, reason: not valid java name and contains not printable characters */
    public static Class<?>[] m1039(Class cls) {
        Class<?>[] clsArr = null;
        String str = "ۧۥۨ";
        HashSet hashSet = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747896) {
                case 5652:
                    clsArr = new Class[C0388.m5417(hashSet)];
                    str = "ۧۢۦ";
                    break;
                case 7673:
                    if (C0368.m3171() < 0) {
                        str = "ۧۥۨ";
                        break;
                    } else {
                        C0228.m2012();
                        str = "ۧ۟ۡ";
                        break;
                    }
                case 25233:
                    return clsArr;
                case 28274:
                    hashSet = new HashSet();
                    str = "ۧ۠";
                    break;
                case 28371:
                    C0375.m4845(hashSet, clsArr);
                    if (C0375.m4840() < 0) {
                        str = "ۣۨۢ";
                        break;
                    } else {
                        str = "ۧۧۨ";
                        break;
                    }
                case 1734497:
                    C0082.m427(cls, hashSet);
                    str = "ۥ۠ۧ";
                    break;
            }
        }
    }
}
