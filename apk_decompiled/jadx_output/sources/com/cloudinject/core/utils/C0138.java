package com.cloudinject.core.utils;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import androidx.fragment.app.FragmentTransaction;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
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
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.core.utils.̙, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0138 {
    public static <T> void swap(List<T> list, int i, int i2) {
        Object objM3273 = null;
        String str = "ۣۤۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751586) {
                case 253:
                    objM3273 = C0370.m3273(list, i);
                    if (C0382.m5180() > 0) {
                        str = "ۥ۠ۡ";
                        break;
                    } else {
                        C0368.m3171();
                        break;
                    }
                case 1924:
                    C0383.m5223(list, i, C0370.m3273(list, i2));
                    if (C0082.m410() < 0) {
                        str = "ۧۥ۟";
                        break;
                    } else {
                        C0183.m1464();
                        break;
                    }
                case 2209:
                    if (C0391.m5571() > 0) {
                        str = "ۣۤۨ";
                        break;
                    } else {
                        C0184.m1524();
                        break;
                    }
                case 32645:
                    return;
                case 32739:
                    C0383.m5223(list, i2, objM3273);
                    if (C0206.m1807() < 0) {
                        str = "ۧۤۤ";
                        break;
                    } else {
                        str = "ۥۤۦ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̖̖, reason: not valid java name and contains not printable characters */
    public static int m1075(SparseArray<?> sparseArray) {
        return C0025.m108(sparseArray);
    }

    /* renamed from: ̖̖, reason: not valid java name and contains not printable characters */
    public static int m1076(List<?> list) {
        int iM3094 = 0;
        String str = "۟ۥۥ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747867) {
                case 3108:
                    if (!C0089.m623(list)) {
                        break;
                    } else if (C0380.m5068() <= 0) {
                        C0376.m4906();
                        str = "ۥۡۢ";
                    } else {
                        str = "ۥۦۨ";
                    }
                case 4728:
                    if (C0060.m216() <= 0) {
                        C0088.m573();
                    } else {
                        str = "ۢۨۨ";
                        continue;
                    }
                case 5628:
                    i2 = -1;
                    str = "ۣۨۦ";
                    continue;
                case 5745:
                    return i;
                case 6393:
                case 1734522:
                    if (C0393.m5668() <= 0) {
                        C0164.m1359();
                        str = "ۧۦۦ";
                    } else {
                        str = "ۥۢۧ";
                        continue;
                    }
                case 6429:
                    if (C0078.m361() <= 0) {
                        C0164.m1359();
                    } else {
                        str = "۟ۥۥ";
                        continue;
                    }
                case 7527:
                    iM3094 = ((C0362.m3094(list) + 30) - 1) - 30;
                    str = "ۨۢۨ";
                    continue;
                case 25269:
                    if (C0164.m1359() >= 0) {
                        str = "ۣۢ۟";
                        i = iM3094;
                    } else {
                        str = "ۥۢۧ";
                        i = iM3094;
                        continue;
                    }
                case 25296:
                    str = "ۤ۠۟";
                    i = i2;
                    continue;
                case 1734564:
                    break;
            }
            if (C0375.m4840() >= 0) {
                C0391.m5571();
            } else {
                str = "ۣۧ۠";
            }
        }
    }

    /* renamed from: ̖̖, reason: not valid java name and contains not printable characters */
    public static int m1077(int... iArr) {
        String str = "ۣۣۢ";
        int i = 0;
        int iM2564 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int length = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754476) {
                case 1157:
                    if (C0078.m361() <= 0) {
                        C0229.m2064();
                        str = "ۣۥۢ";
                    } else {
                        str = "ۥۤۡ";
                        continue;
                    }
                case 3463:
                    str = "ۣۣۢ";
                    continue;
                case 25107:
                    if (C0164.m1359() >= 0) {
                        C0377.m4944();
                        i2 = i4;
                    } else {
                        str = "ۢ۟۟";
                        i2 = i4;
                        continue;
                    }
                case 27223:
                    break;
                case 28173:
                    str = "ۣۣ۟";
                    i3 = 0;
                    continue;
                case 28557:
                    return i2;
                case 28595:
                    str = "۠ۤۥ";
                    continue;
                case 29641:
                case 31566:
                    if (C0399.m5914() <= 0) {
                        C0229.m2064();
                    } else {
                        str = "ۢ۟۟";
                        continue;
                    }
                case 30468:
                    if (C0399.m5914() <= 0) {
                        C0377.m4944();
                        i3 = i;
                    } else {
                        str = "ۦۤۧ";
                        i3 = i;
                        continue;
                    }
                case 30510:
                    if (i3 >= length) {
                        break;
                    } else {
                        str = C0376.m4906() <= 0 ? "ۣۣۡ" : "ۤۤۧ";
                    }
                case 30638:
                    length = iArr.length;
                    str = "ۥۡۧ";
                    continue;
                case 30664:
                    i = 1 - (0 - i3);
                    if (C0279.m2491() >= 0) {
                        C0395.m5698();
                    } else {
                        str = "ۤ۟ۥ";
                        continue;
                    }
                case 30887:
                    i4 = Integer.MIN_VALUE;
                    if (C0083.m448() >= 0) {
                        C0379.m5056();
                    } else {
                        str = "۠۠۟";
                        continue;
                    }
                case 31910:
                    str = "ۢ۠ۦ";
                    i2 = iM2564;
                    continue;
                case 32523:
                    iM2564 = C0291.m2564(i2, iArr[i3]);
                    if (C0279.m2491() >= 0) {
                        str = "ۣۤۧ";
                    } else {
                        str = "ۢۢۤ";
                        continue;
                    }
            }
            if (C0346.m3059() >= 0) {
                C0009.m36();
            } else {
                str = "۠۠ۡ";
            }
        }
    }

    /* renamed from: ̖̖, reason: not valid java name and contains not printable characters */
    public static <T> int m1078(T[] tArr) {
        return C0089.m633(tArr);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006d A[SYNTHETIC] */
    /* renamed from: ̖̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <E> java.util.List<E> m1079(com.cloudinject.core.utils.AbstractC0132<E> r6, java.util.List<E> r7) {
        /*
            r1 = 0
            java.lang.String r0 = "ۤ۟ۦ"
            r2 = r1
            r3 = r1
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1751683(0x1aba83, float:2.45463E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 161: goto L11;
                case 170: goto L67;
                case 840: goto L3a;
                case 1057: goto L2a;
                case 1251: goto L1a;
                case 2283: goto L79;
                case 5188: goto L76;
                case 7480: goto L2d;
                case 29294: goto L11;
                case 29647: goto L4c;
                case 32751: goto L5b;
                case 1730214: goto L52;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            int r0 = mirrorb.android.content.res.C0379.m5056()
            if (r0 > 0) goto L64
            java.lang.String r0 = "ۣۢۧ"
            goto L5
        L1a:
            java.lang.Object r1 = mirrorb.com.android.internal.C0398.m5850(r2)
            int r0 = com.cloudinject.feature.p023.C0334.m2866()
            if (r0 > 0) goto L27
            java.lang.String r0 = "ۤۢ۠"
            goto L5
        L27:
            java.lang.String r0 = "ۧۢۧ"
            goto L5
        L2a:
            java.lang.String r0 = "ۤۢ۠"
            goto L5
        L2d:
            java.util.Iterator r2 = androidx.core.p007.C0088.m554(r7)
            int r4 = com.cloudinject.feature.p015.C0206.m1807()
            if (r4 >= 0) goto L5
            java.lang.String r0 = "ۡۦ"
            goto L5
        L3a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = p027.p028.p029.C0420.m6215()
            if (r4 < 0) goto L49
            com.cloudinject.p025.p026.C0346.m3059()
            goto L5
        L49:
            java.lang.String r0 = "۟ۥۡ"
            goto L5
        L4c:
            com.cloudinject.customview.C0184.m1513(r3, r1)
            java.lang.String r0 = "ۥۨۥ"
            goto L5
        L52:
            boolean r0 = mirrorb.com.android.internal.C0398.m5858(r2)
            if (r0 == 0) goto L67
            java.lang.String r0 = "ۥۦۡ"
            goto L5
        L5b:
            boolean r0 = com.px.C0368.m3182(r6, r1)
            if (r0 == 0) goto L11
            java.lang.String r0 = "ۣۨۧ"
            goto L5
        L64:
            java.lang.String r0 = "ۡۦ"
            goto L5
        L67:
            int r0 = com.cloudinject.feature.p018.C0228.m2012()
            if (r0 > 0) goto L73
            com.cloudinject.feature.p018.C0229.m2064()
            java.lang.String r0 = "ۥۣۨ"
            goto L5
        L73:
            java.lang.String r0 = "ۢ۠ۦ"
            goto L5
        L76:
            java.lang.String r0 = "ۤ۟ۦ"
            goto L5
        L79:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1079(com.cloudinject.core.utils.̗̗̗, java.util.List):java.util.List");
    }

    /* renamed from: ̖̗, reason: not valid java name and contains not printable characters */
    public static <E> List<Pair<Integer, E>> m1080(SparseArray<E> sparseArray) {
        String str = "ۡۨ۟";
        int i = 0;
        ArrayList arrayList = null;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749756) {
                case 2196:
                    str = "ۡۨ۟";
                    continue;
                case 3865:
                    if (C0384.m5250(sparseArray)) {
                        break;
                    } else if (C0082.m410() < 0) {
                        str = "۟۠۟";
                    }
                case 5123:
                    return arrayList;
                case 5505:
                    C0184.m1513(arrayList, C0228.m1988(C0078.m339(C0369.m3247(sparseArray, i)), C0279.m2501(sparseArray, i)));
                    if (C0385.m5282() >= 0) {
                        C0206.m1807();
                        str = "ۦۣۤ";
                    } else {
                        str = "ۣۧۤ";
                        continue;
                    }
                case 5569:
                    if (i >= C0397.m5793(sparseArray)) {
                        break;
                    } else {
                        str = C0291.m2568() >= 0 ? "ۨ۠ۤ" : "ۣ۟ۡ";
                    }
                case 5602:
                    str = "۠ۨۡ";
                    continue;
                case 6437:
                    if (C0392.m5595() <= 0) {
                        C0392.m5595();
                        str = "ۣۨۢ";
                        i = 0;
                    } else {
                        str = "۟ۡ۟";
                        i = 0;
                        continue;
                    }
                case 6494:
                    if (C0279.m2491() >= 0) {
                        str = "ۥۨۨ";
                    } else {
                        str = "ۣۡۥ";
                        continue;
                    }
                case 7193:
                    break;
                case 7258:
                case 7679:
                    str = "۟ۡ۟";
                    continue;
                case 7524:
                    arrayList = new ArrayList();
                    str = "ۥۢۢ";
                    continue;
                case 30554:
                    i2 = i + 1;
                    str = "ۧۡ";
                    continue;
                case 1732134:
                    if (C0384.m5278() <= 0) {
                        C0073.m265();
                        str = "ۥۥۡ";
                        i = i2;
                    } else {
                        str = "۠ۦۨ";
                        i = i2;
                        continue;
                    }
            }
            str = "۟۟۟";
        }
    }

    /* renamed from: ̖̗, reason: not valid java name and contains not printable characters */
    public static <E> List<E> m1081(List<E> list) {
        ArrayList arrayList = null;
        String str = "ۥۦۧ";
        List<E> list2 = null;
        List<E> list3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56448) {
                case 253:
                    arrayList = new ArrayList();
                    if (C0279.m2491() >= 0) {
                        str = "ۦۡۢ";
                    } else {
                        str = "ۣۤۧ";
                        continue;
                    }
                case 1711399:
                    if (C0387.m5374() >= 0) {
                        list2 = list3;
                    } else {
                        str = "۟ۤ۠";
                        list2 = list3;
                        continue;
                    }
                case 1729254:
                    str = "ۦۣۢ";
                    list3 = list;
                    continue;
                case 1729900:
                    break;
                case 1730248:
                    if (C0228.m2012() <= 0) {
                        list2 = arrayList;
                    } else {
                        str = "ۡۡۥ";
                        list2 = arrayList;
                        continue;
                    }
                case 1732547:
                    if (C0387.m5374() >= 0) {
                        C0383.m5203();
                    } else {
                        str = "ۥۦۧ";
                        continue;
                    }
                case 1733189:
                    return list2;
                case 1735451:
                    if (list3 != null) {
                        break;
                    } else {
                        str = "ۤۡ";
                    }
            }
            str = C0397.m5814() <= 0 ? "ۤ۠ۨ" : "ۡۡۥ";
        }
    }

    /* renamed from: ̖̗, reason: not valid java name and contains not printable characters */
    public static <T> List<T> m1082(T[] tArr) {
        String str = "ۨۡۧ";
        int i = 0;
        int length = 0;
        ArrayList arrayList = null;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750659) {
                case 164:
                case 1731271:
                    str = "ۤۢۤ";
                    continue;
                case 1093:
                    return arrayList;
                case 1095:
                    str = "ۨۡۧ";
                    continue;
                case 3237:
                    if (i >= length) {
                        break;
                    } else if (C0384.m5278() <= 0) {
                        C0380.m5068();
                    } else {
                        str = "ۡۥۣ";
                    }
                case 4474:
                    length = tArr.length;
                    str = "۠ۦۤ";
                    continue;
                case 6219:
                    str = "ۡۧۢ";
                    i = i2;
                    continue;
                case 6588:
                    C0184.m1513(arrayList, tArr[i]);
                    if (C0392.m5595() <= 0) {
                        C0179.m1427();
                        str = "۠ۤ";
                    } else {
                        str = "۠۟ۧ";
                        continue;
                    }
                case 6655:
                    if (C0184.m1524() < 0) {
                        str = "ۣ۠ۤ";
                    } else {
                        continue;
                    }
                case 7243:
                    i2 = 0 - ((0 - i) - 1);
                    if (C0396.m5741() >= 0) {
                        C0390.m5512();
                    } else {
                        str = "ۡۡۨ";
                        continue;
                    }
                case 7453:
                    if (C0086.m500() > 0) {
                        str = "۟ۧۨ";
                    } else {
                        continue;
                    }
                case 7811:
                    if (C0375.m4840() >= 0) {
                        C0397.m5814();
                        str = "ۣۨ";
                        i = 0;
                    } else {
                        str = "ۤۢۤ";
                        i = 0;
                        continue;
                    }
                case 32653:
                    arrayList = new ArrayList();
                    if (C0369.m3256() > 0) {
                        str = "ۨۤ۟";
                    } else {
                        continue;
                    }
                case 32736:
                    if (C0381.m5140(tArr)) {
                        break;
                    } else {
                        str = "۟ۧۡ";
                    }
                case 32747:
                    break;
            }
            str = C0060.m216() <= 0 ? "ۤۦۥ" : "ۣۢۧ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0005 A[SYNTHETIC] */
    /* renamed from: ̖̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1083(int[] r6) {
        /*
            r2 = 0
            java.lang.String r0 = "ۣۧۧ"
            r1 = r2
            r3 = r2
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1751746(0x1abac2, float:2.454719E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 68: goto L11;
                case 776: goto L11;
                case 1866: goto L4a;
                case 1895: goto L1a;
                case 2110: goto L79;
                case 2432: goto L39;
                case 5464: goto L6a;
                case 5575: goto L1d;
                case 7587: goto L5c;
                case 7649: goto L56;
                case 29512: goto L97;
                case 29678: goto L86;
                case 31528: goto L79;
                case 31626: goto L30;
                case 32585: goto L21;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            int r4 = mirrorb.android.accounts.C0376.m4906()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "۟ۢۤ"
            goto L5
        L1a:
            java.lang.String r0 = "ۣۡۧ"
            goto L5
        L1d:
            java.lang.String r0 = "ۥ۟ۢ"
            r3 = r2
            goto L5
        L21:
            if (r6 == 0) goto L11
            int r4 = com.cloudinject.feature.p021.p022.C0279.m2491()
            if (r4 < 0) goto L2d
            mirrorb.android.location.C0384.m5278()
            goto L5
        L2d:
            java.lang.String r0 = "۟۠ۤ"
            goto L5
        L30:
            int r4 = com.cloudinject.feature.p023.C0334.m2866()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۤۥۧ"
            goto L5
        L39:
            int r0 = mirrorb.android.net.wifi.C0388.m5430()
            if (r0 > 0) goto L46
            mirrorb.android.hardware.fingerprint.C0382.m5180()
            java.lang.String r0 = "ۥۢۢ"
            r3 = r1
            goto L5
        L46:
            java.lang.String r0 = "ۨۥۧ"
            r3 = r1
            goto L5
        L4a:
            int r0 = android.net.wifi.C0078.m361()
            if (r0 > 0) goto L53
            java.lang.String r0 = "ۧۦۢ"
            goto L5
        L53:
            java.lang.String r0 = "ۦۤۨ"
            goto L5
        L56:
            int r0 = r6.length
            if (r0 != 0) goto L6a
            java.lang.String r0 = "ۦ۟ۡ"
            goto L5
        L5c:
            r1 = 1
            int r4 = com.cloudinject.customview.C0183.m1464()
            if (r4 > 0) goto L67
            mirrorb.android.hardware.fingerprint.C0382.m5180()
            goto L5
        L67:
            java.lang.String r0 = "ۢۧۧ"
            goto L5
        L6a:
            int r0 = com.cloudinject.customview.C0183.m1464()
            if (r0 > 0) goto L76
            com.cloudinject.feature.p015.C0206.m1807()
            java.lang.String r0 = "ۧۦ"
            goto L5
        L76:
            java.lang.String r0 = "ۥ۠۠"
            goto L5
        L79:
            int r4 = android.app.C0009.m36()
            if (r4 < 0) goto L83
            mirrorb.android.accounts.C0375.m4840()
            goto L5
        L83:
            java.lang.String r0 = "ۨۥۧ"
            goto L5
        L86:
            int r0 = mirrorb.dalvik.system.C0399.m5914()
            if (r0 > 0) goto L93
            android.net.wifi.C0078.m361()
            java.lang.String r0 = "۠ۡۦ"
            goto L5
        L93:
            java.lang.String r0 = "ۣۧۧ"
            goto L5
        L97:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1083(int[]):boolean");
    }

    /* renamed from: ̖̙, reason: not valid java name and contains not printable characters */
    public static int m1084(List<Integer> list) {
        int iM5774 = 0;
        int i = 0;
        Iterator itM554 = null;
        String str = "ۣۧۨ";
        while (true) {
            switch (C0395.m5690(str) ^ 1750750) {
                case 1085:
                    if (C0420.m6215() >= 0) {
                        C0335.m2923();
                        str = "۠۠ۤ";
                    } else {
                        str = "ۦۡۧ";
                        continue;
                    }
                case 1474:
                    break;
                case 1535:
                    str = "ۥۨ";
                    continue;
                case 3100:
                case 1731197:
                    if (C0362.m3122() >= 0) {
                        C0385.m5282();
                    } else {
                        str = "۠ۢۦ";
                        continue;
                    }
                case 6595:
                    return i;
                case 7674:
                    if (!C0398.m5858(itM554)) {
                        break;
                    } else {
                        str = C0179.m1427() <= 0 ? "۠ۦ۟" : "ۣۧۡ";
                    }
                case 29522:
                    itM554 = C0088.m554(list);
                    str = "ۢۤۥ";
                    continue;
                case 29591:
                    iM5774 = 0 - ((0 - i) - C0397.m5774((Integer) C0398.m5850(itM554)));
                    if (C0179.m1427() <= 0) {
                        C0389.m5481();
                    } else {
                        str = "ۧۥ";
                        continue;
                    }
                case 30546:
                    if (C0380.m5068() <= 0) {
                        C0395.m5698();
                        i = 0;
                    } else {
                        str = "۠ۢۦ";
                        i = 0;
                        continue;
                    }
                case 32542:
                    str = "ۣۧۨ";
                    continue;
                case 1731072:
                    if (C0420.m6215() >= 0) {
                        C0184.m1524();
                        i = iM5774;
                    } else {
                        str = "ۢۦۥ";
                        i = iM5774;
                        continue;
                    }
            }
            str = C0362.m3122() >= 0 ? "ۧ۟۟" : "ۡۤ۠";
        }
    }

    /* renamed from: ̖̙, reason: not valid java name and contains not printable characters */
    public static List<Integer> m1085(int[] iArr) {
        String str = "ۣ۟ۦ";
        int i = 0;
        int length = 0;
        ArrayList arrayList = null;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748705) {
                case 1761:
                    return arrayList;
                case 2364:
                    if (C0388.m5430() <= 0) {
                        C0291.m2568();
                        i = 0;
                    } else {
                        str = "ۦۦۥ";
                        i = 0;
                        continue;
                    }
                case 2403:
                    arrayList = new ArrayList();
                    if (C0370.m3284() >= 0) {
                        str = "۟۟ۡ";
                    } else {
                        str = "ۨۤۦ";
                        continue;
                    }
                case 2531:
                    if (C0086.m500() <= 0) {
                        C0291.m2568();
                    } else {
                        str = "۟ۦۤ";
                        continue;
                    }
                case 4223:
                case 26564:
                    if (C0381.m5127() <= 0) {
                        C0386.m5322();
                        str = "ۡۧۦ";
                    } else {
                        str = "ۦۦۥ";
                        continue;
                    }
                case 6309:
                    break;
                case 6378:
                    str = "ۨۢ۟";
                    continue;
                case 26507:
                    if (C0089.m616(iArr)) {
                        break;
                    } else if (C0184.m1524() >= 0) {
                        C0379.m5056();
                    } else {
                        str = "ۢۧ";
                    }
                case 27530:
                    str = "ۣ۟ۦ";
                    continue;
                case 27844:
                    if (i >= length) {
                        break;
                    } else {
                        str = "ۣۦ";
                    }
                case 28516:
                    i2 = 0 - ((0 - i) - 1);
                    if (C0089.m592() <= 0) {
                        C0400.m5961();
                    } else {
                        str = "ۥۤ";
                        continue;
                    }
                case 1733246:
                    if (C0078.m361() <= 0) {
                        i = i2;
                    } else {
                        str = "ۣ۟ۧ";
                        i = i2;
                        continue;
                    }
                case 1733250:
                    C0184.m1513(arrayList, C0078.m339(iArr[i]));
                    str = "ۦۡ۠";
                    continue;
                case 1733284:
                    length = iArr.length;
                    if (C0206.m1807() >= 0) {
                        C0396.m5741();
                        str = "ۨۢۨ";
                    } else {
                        str = "۟۟ۢ";
                        continue;
                    }
            }
            str = "۟ۧۨ";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: ̖̙, reason: not valid java name and contains not printable characters */
    public static <E> E[] m1086(E[] eArr) {
        ?? r1 = 0;
        String str = "ۤ۠ۢ";
        E[] eArr2 = null;
        E[] eArr3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752733) {
                case 1272:
                    str = "ۣ۟ۡ";
                    eArr2 = eArr3;
                    continue;
                case 1915:
                    if (C0399.m5914() <= 0) {
                        str = "ۡۨۢ";
                        eArr3 = eArr;
                    } else {
                        str = "ۤۤۥ";
                        eArr3 = eArr;
                        continue;
                    }
                case 2200:
                    if (eArr3 != null) {
                        break;
                    } else {
                        str = "ۣۢ";
                    }
                case 5444:
                    if (C0384.m5278() > 0) {
                        str = "ۤ۠ۢ";
                    } else {
                        continue;
                    }
                case 5537:
                    return eArr2;
                case 30294:
                    break;
                case 1729062:
                    str = "ۣ۠۟";
                    eArr2 = r1;
                    continue;
                case 1729244:
                    r1 = new Object[0];
                    str = "ۦۡ";
                    continue;
            }
            str = "ۣ۠۟";
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static int m1087(int i, int i2, int i3) {
        String str = "ۤ۠ۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754502) {
                case 25220:
                    if (C0384.m5278() > 0) {
                        str = "ۤ۠ۥ";
                        break;
                    } else {
                        str = "۠ۦۢ";
                        break;
                    }
                case 31855:
                    return C0009.m45(C0291.m2564(i2, i), i3);
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static int m1088(Integer num) {
        String str = "۟ۦۧ";
        int iM5774 = 0;
        int i = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748896) {
                case 1055:
                    iM5774 = C0397.m5774(num);
                    str = "۠ۡۢ";
                    continue;
                case 1185:
                    str = "ۤۢۢ";
                    i = iM5774;
                    continue;
                case 2112:
                    if (num != null) {
                        break;
                    } else {
                        str = "۟۠۠";
                    }
                case 2239:
                    str = "ۦۦۥ";
                    continue;
                case 5507:
                case 27369:
                    str = "ۤۢۢ";
                    continue;
                case 5508:
                    return i;
                case 5514:
                    if (C0074.m307() >= 0) {
                        C0376.m4906();
                        str = "ۣ۟ۤ";
                    } else {
                        str = "۟ۦۧ";
                        continue;
                    }
                case 6429:
                    break;
                case 6438:
                    if (C0397.m5814() <= 0) {
                        C0370.m3284();
                    } else {
                        str = "ۣۧۡ";
                        continue;
                    }
                case 28037:
                    if (C0362.m3122() >= 0) {
                        C0399.m5914();
                        str = "ۡ۠ۨ";
                        i = 0;
                    } else {
                        str = "ۣۣۦ";
                        i = 0;
                        continue;
                    }
            }
            if (C0378.m4998() > 0) {
                str = "۠ۧۦ";
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static int m1089(Integer[] numArr) {
        String str = "ۢۦۤ";
        int i = 0;
        int iM5774 = 0;
        int i2 = 0;
        int i3 = 0;
        int length = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747838) {
                case 870:
                    if (i2 >= length) {
                        break;
                    } else {
                        str = "ۣۧۤ";
                    }
                case 3130:
                    str = "۟۠۠";
                    i3 = 0;
                    continue;
                case 3169:
                    if (C0183.m1464() <= 0) {
                        C0334.m2866();
                        i2 = 0;
                    } else {
                        str = "۟ۨۡ";
                        i2 = 0;
                        continue;
                    }
                case 3197:
                case 28289:
                    str = "۟ۨۡ";
                    continue;
                case 4756:
                    if (C0086.m500() > 0) {
                        str = "۟ۡۦ";
                    } else {
                        continue;
                    }
                case 5596:
                    break;
                case 5812:
                    i = (i2 - 14) + 1 + 14;
                    str = "ۣۢۢ";
                    continue;
                case 5848:
                    if (C0382.m5180() <= 0) {
                        C0082.m410();
                    } else {
                        str = "ۣ۟۟";
                        continue;
                    }
                case 6238:
                    length = numArr.length;
                    if (C0335.m2923() < 0) {
                        str = "ۦ۠ۢ";
                    } else {
                        continue;
                    }
                case 6461:
                    str = "ۥ۠ۡ";
                    i3 = iM5774;
                    continue;
                case 6591:
                    str = "ۢ۟۠";
                    i2 = i;
                    continue;
                case 27158:
                    str = "ۤ۠ۦ";
                    continue;
                case 27382:
                    if (C0375.m4840() >= 0) {
                        C0398.m5833();
                    } else {
                        str = "ۢۦۤ";
                        continue;
                    }
                case 27992:
                    return i3;
                case 28406:
                    iM5774 = i3 - (0 - C0397.m5774(numArr[i2]));
                    str = "ۥۡۦ";
                    continue;
            }
            str = "ۧۨۧ";
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static long m1090(List<Long> list, Long l) {
        Iterator itM554 = null;
        String str = "ۢۦۧ";
        long jM329 = 0;
        long j = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753664) {
                case 780:
                    str = "۠ۢۤ";
                    j = jM329;
                    continue;
                case TypedValues.Custom.TYPE_STRING /* 903 */:
                case 28128:
                    str = "ۥۨۡ";
                    continue;
                case 2921:
                    str = "ۥۨۡ";
                    j = 0;
                    continue;
                case 26753:
                    str = "ۣۨۢ";
                    continue;
                case 26978:
                    str = "ۡۨۧ";
                    continue;
                case 28864:
                    return j;
                case 29027:
                    itM554 = C0088.m554(list);
                    str = "۠۟۠";
                    continue;
                case 29883:
                    break;
                case 30882:
                    jM329 = (j - 8) + C0074.m329((Long) C0398.m5850(itM554)) + 8;
                    str = "ۦ۟ۥ";
                    continue;
                case 31966:
                    if (!C0398.m5858(itM554)) {
                        break;
                    } else {
                        str = "ۤۨۦ";
                    }
                case 1711675:
                    str = "ۢۦۧ";
                    continue;
            }
            if (C0082.m410() < 0) {
                str = "ۢۡ۟";
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static long m1091(Long[] lArr) {
        int i = 0;
        long jM329 = 0;
        int i2 = 0;
        long j = 0;
        String str = "۟ۢ۟";
        int i3 = 0;
        int length = 0;
        long j2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748677) {
                case TypedValues.PositionType.TYPE_POSITION_TYPE /* 510 */:
                    str = "ۦۦ۟";
                    j = jM329;
                    continue;
                case 1036:
                    str = "۟ۡۡ";
                    continue;
                case 2373:
                    j2 = 0;
                    if (C0384.m5278() <= 0) {
                        str = "ۨ۟۟";
                    } else {
                        str = "ۧۤۧ";
                        continue;
                    }
                case 2457:
                    length = lArr.length;
                    str = "ۣ۟ۤ";
                    continue;
                case 2554:
                case 1733318:
                    str = "ۥۨۦ";
                    continue;
                case 4198:
                    if (i3 >= length) {
                        break;
                    } else if (C0362.m3122() < 0) {
                        str = "ۦۧۤ";
                    }
                case 5896:
                    str = "ۣۧۦ";
                    i3 = i;
                    continue;
                case 5934:
                    i2 = 1 - (0 - i3);
                    if (C0378.m4998() <= 0) {
                        C0183.m1464();
                        str = "ۨ۠";
                    } else {
                        str = "ۡۥ۟";
                        continue;
                    }
                case 6267:
                    break;
                case 27471:
                    str = "ۥۨۦ";
                    j = j2;
                    continue;
                case 27503:
                    i = 0;
                    if (C0398.m5833() <= 0) {
                        str = "ۣۤۡ";
                    } else {
                        str = "ۤ۟ۨ";
                        continue;
                    }
                case 27782:
                    jM329 = ((25 + j) + C0074.m329(lArr[i3])) - 25;
                    str = "ۤ۠ۧ";
                    continue;
                case 27802:
                    if (C0375.m4840() < 0) {
                        str = "۟ۢ۟";
                    } else {
                        continue;
                    }
                case 27866:
                    str = "۠۟ۨ";
                    i3 = i2;
                    continue;
                case 1733215:
                    return j;
            }
            if (C0334.m2866() <= 0) {
                C0378.m4998();
            } else {
                str = "ۥ۟";
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <E> AbstractC0132<E> m1092(AbstractC0132<E> abstractC0132) {
        return new C0126(abstractC0132);
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <A, B, C> C0133<A, B, C> m1093(A a, B b, C c) {
        String str = "ۡۤ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56545) {
                case 1733628:
                    return new C0133<>(a, b, c);
                case 1735644:
                    str = "ۡۤ۠";
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <E> E m1094(int i, SparseArray<E> sparseArray) {
        String str = "ۨۡ۟";
        Object objM88 = 0;
        E e = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749796) {
                case 321:
                    str = "ۣۤۨ";
                    e = null;
                    continue;
                case 443:
                    break;
                case 1312:
                    if (C0386.m5322() <= 0) {
                        e = objM88;
                    } else {
                        str = "ۣ۠۠";
                        e = objM88;
                        continue;
                    }
                case 1411:
                    if (C0379.m5056() <= 0) {
                        C0385.m5282();
                    } else {
                        str = "ۡ۠ۧ";
                        continue;
                    }
                case 3745:
                    objM88 = C0025.m88(sparseArray, i);
                    str = "ۣ۟۠";
                    continue;
                case 5343:
                    if (C0392.m5595() <= 0) {
                        str = "۟ۧۦ";
                    } else {
                        str = "ۨۡ۟";
                        continue;
                    }
                case 6169:
                    return e;
                case 7226:
                    if (C0397.m5814() > 0) {
                        str = "ۣۢ۠";
                    } else {
                        continue;
                    }
                case 7564:
                case 30221:
                    str = "ۣ۠۠";
                    continue;
                case 31266:
                    if (!C0384.m5250(sparseArray)) {
                        break;
                    } else if (C0400.m5961() > 0) {
                        str = "ۡۤۡ";
                    }
            }
            str = "ۥ۟۟";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006a A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <E> E m1095(com.cloudinject.core.utils.AbstractC0132<E> r6, java.util.List<E> r7) {
        /*
            r2 = 0
            java.lang.String r0 = "۠ۨۨ"
            r1 = r2
            r3 = r2
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1755528(0x1ac988, float:2.460019E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 3207: goto L11;
                case 3277: goto L1b;
                case 25192: goto L3c;
                case 26415: goto L24;
                case 26441: goto L4e;
                case 28170: goto L2d;
                case 32554: goto L64;
                case 32586: goto L71;
                case 32672: goto L22;
                case 1709364: goto L23;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            int r4 = android.net.C0082.m410()
            if (r4 < 0) goto L61
            android.net.C0082.m410()
            goto L5
        L1b:
            java.lang.Object r1 = mirrorb.com.android.internal.C0398.m5850(r3)
            java.lang.String r0 = "ۡ۠ۦ"
            goto L5
        L22:
            r2 = r1
        L23:
            return r2
        L24:
            boolean r4 = com.px.C0368.m3182(r6, r1)
            if (r4 == 0) goto L64
            java.lang.String r0 = "ۣ۠ۥ"
            goto L5
        L2d:
            boolean r4 = mirrorb.com.android.internal.C0398.m5858(r3)
            if (r4 == 0) goto L71
            int r4 = com.cloudinject.core.p009.p011.C0155.m1294()
            if (r4 >= 0) goto L5
            java.lang.String r0 = "ۧۡ۟"
            goto L5
        L3c:
            boolean r0 = androidx.core.p007.C0089.m623(r7)
            if (r0 != 0) goto L71
            int r0 = android.arch.lifecycle.p000.C0025.m118()
            if (r0 > 0) goto L4b
            java.lang.String r0 = "۠ۥۢ"
            goto L5
        L4b:
            java.lang.String r0 = "ۡۡۡ"
            goto L5
        L4e:
            java.util.Iterator r3 = androidx.core.p007.C0088.m554(r7)
            int r0 = mirrorb.android.net.wifi.C0387.m5374()
            if (r0 < 0) goto L5e
            android.net.wifi.C0078.m361()
            java.lang.String r0 = "ۦۣۦ"
            goto L5
        L5e:
            java.lang.String r0 = "ۣ۟ۦ"
            goto L5
        L61:
            java.lang.String r0 = "۠ۨۨ"
            goto L5
        L64:
            int r4 = android.arch.p003.p005.C0060.m216()
            if (r4 > 0) goto L6e
            mirrorb.android.app.servertransaction.C0378.m4998()
            goto L5
        L6e:
            java.lang.String r0 = "ۣ۟ۦ"
            goto L5
        L71:
            java.lang.String r0 = "ۦۢ"
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1095(com.cloudinject.core.utils.̗̗̗, java.util.List):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <S, E> S m1096(InterfaceC0136<S, S, E> interfaceC0136, S s, Collection<E> collection) {
        Object objM1646 = 0;
        String str = "ۡۤۧ";
        S s2 = null;
        Iterator itM5543 = null;
        S s3 = null;
        S s4 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755585) {
                case 135:
                    itM5543 = C0391.m5543(collection);
                    if (C0086.m500() <= 0) {
                        str = "ۦ۠ۦ";
                    } else {
                        str = "ۧۥ";
                        continue;
                    }
                case 2153:
                    if (C0385.m5282() < 0) {
                        str = "ۡۤۧ";
                    } else {
                        continue;
                    }
                case 2214:
                    if (!C0398.m5858(itM5543)) {
                        break;
                    } else if (C0379.m5056() <= 0) {
                        C0088.m573();
                    } else {
                        str = "ۢۥۧ";
                    }
                case 3013:
                    if (C0386.m5322() <= 0) {
                        str = "ۤۤۤ";
                    } else {
                        str = "۠ۡ";
                        continue;
                    }
                case 3111:
                case 1709504:
                    if (C0393.m5668() <= 0) {
                        str = "ۨۨۧ";
                    } else {
                        str = "۠۠ۡ";
                        continue;
                    }
                case 25317:
                    if (C0390.m5512() <= 0) {
                        C0387.m5374();
                        str = "۟ۦۣ";
                        s3 = s4;
                    } else {
                        str = "ۣۡۧ";
                        s3 = s4;
                        continue;
                    }
                case 25376:
                    if (C0376.m4906() <= 0) {
                        s3 = s2;
                    } else {
                        str = "ۦ۠ۡ";
                        s3 = s2;
                        continue;
                    }
                case 26337:
                    if (C0089.m592() <= 0) {
                        C0377.m4944();
                        s2 = objM1646;
                    } else {
                        str = "ۦۥۣ";
                        s2 = objM1646;
                        continue;
                    }
                case 26341:
                    if (C0089.m592() <= 0) {
                        C0229.m2064();
                        s4 = s;
                    } else {
                        str = "۠ۢۦ";
                        s4 = s;
                        continue;
                    }
                case 28214:
                    break;
                case 31429:
                    objM1646 = C0191.m1646(interfaceC0136, s2, C0398.m5850(itM5543));
                    str = "ۣۡۤ";
                    continue;
                case 32648:
                    if (C0089.m623(collection)) {
                        break;
                    } else {
                        str = "ۣۨۡ";
                    }
                case 32738:
                    return s3;
                case 1709343:
                    str = "۠۠ۡ";
                    s2 = s4;
                    continue;
            }
            str = "ۣ۠۠";
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <E> E m1097(E e, List<E> list) {
        String str = "۠ۨ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753575) {
                case 27184:
                    return (E) C0395.m5678(new C0130(e), list);
                case 1711494:
                    if (C0346.m3059() < 0) {
                        str = "۠ۨ۟";
                        break;
                    } else {
                        C0385.m5282();
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <E> E m1098(LinkedList<E> linkedList) {
        String str = "ۣۤ۟";
        Object objM5821 = 0;
        E e = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750722) {
                case 65:
                    if (C0377.m4944() > 0) {
                        str = "ۨ۠ۦ";
                    } else {
                        continue;
                    }
                case 2239:
                    str = "ۣۤ۟";
                    continue;
                case 3202:
                    if (!C0089.m623(linkedList)) {
                        break;
                    } else {
                        str = "ۣۣۣ";
                    }
                case 3206:
                    break;
                case 3849:
                    if (C0155.m1294() >= 0) {
                        C0382.m5180();
                    } else {
                        str = "ۡ۟ۤ";
                        continue;
                    }
                case 4486:
                    if (C0389.m5481() <= 0) {
                        C0184.m1524();
                        str = "ۥ۟ۢ";
                        e = objM5821;
                    } else {
                        str = "ۣ۠ۧ";
                        e = objM5821;
                        continue;
                    }
                case 6207:
                    objM5821 = C0398.m5821(linkedList);
                    str = "۟ۡۦ";
                    continue;
                case 6212:
                case 1731271:
                    if (C0387.m5374() < 0) {
                        str = "ۣ۠ۧ";
                    } else {
                        continue;
                    }
                case 7558:
                    return e;
                case 32300:
                    str = "ۤ۟ۦ";
                    e = null;
                    continue;
            }
            str = "ۣۡ۟";
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <E> LinkedList<E> m1099(E e, LinkedList<E> linkedList) {
        LinkedList<E> linkedList2 = null;
        String str = "ۣۥۡ";
        LinkedList<E> linkedList3 = null;
        LinkedList<E> linkedList4 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754408) {
                case 65:
                    break;
                case 1833:
                    return linkedList3;
                case 25333:
                    if (C0155.m1294() >= 0) {
                        linkedList3 = linkedList2;
                    } else {
                        str = "ۢۧۦ";
                        linkedList3 = linkedList2;
                        continue;
                    }
                case 29591:
                    if (C0086.m500() <= 0) {
                        C0377.m4944();
                        linkedList4 = linkedList;
                    } else {
                        str = "۠ۡ";
                        linkedList4 = linkedList;
                        continue;
                    }
                case 30280:
                    if (C0389.m5481() > 0) {
                        str = "ۣۥۡ";
                    } else {
                        continue;
                    }
                case 30313:
                    C0121.m1000(linkedList3, e);
                    if (C0229.m2064() >= 0) {
                        C0393.m5668();
                    } else {
                        str = "ۦۥ۠";
                        continue;
                    }
                case 31973:
                    if (!C0089.m623(linkedList4)) {
                        break;
                    } else if (C0389.m5481() > 0) {
                        str = "ۣۤ۠";
                    }
                case 32617:
                    linkedList2 = new LinkedList<>();
                    if (C0369.m3256() <= 0) {
                        C0369.m3256();
                    } else {
                        str = "۟ۦۤ";
                        continue;
                    }
                case 1710377:
                    str = "ۤ۟ۨ";
                    linkedList3 = linkedList4;
                    continue;
            }
            str = "ۢۧۦ";
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <E> List<E> m1100(int i, E e) {
        int i2 = 0;
        String str = "ۤۨۤ";
        ArrayList arrayList = null;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749853) {
                case 2328:
                    arrayList = new ArrayList();
                    if (C0086.m500() <= 0) {
                        C0228.m2012();
                    } else {
                        str = "ۤ۠ۨ";
                        continue;
                    }
                case 2421:
                    str = "۟ۤ۟";
                    i4 = i2;
                    continue;
                case 2493:
                    if (C0073.m265() <= 0) {
                        str = "ۦۣۡ";
                        i3 = i;
                    } else {
                        str = "ۣۤۤ";
                        i3 = i;
                        continue;
                    }
                case 2737:
                    if (C0368.m3171() >= 0) {
                        i4 = i3;
                    } else {
                        str = "ۧۦۨ";
                        i4 = i3;
                        continue;
                    }
                case 3771:
                    return arrayList;
                case 5319:
                    if (C0393.m5668() > 0) {
                        str = "ۡۡ";
                    } else {
                        continue;
                    }
                case 6563:
                    C0184.m1513(arrayList, e);
                    str = "ۦۨ۟";
                    continue;
                case 7367:
                    if (C0346.m3059() >= 0) {
                        str = "ۣۨۧ";
                    } else {
                        str = "ۤۨۤ";
                        continue;
                    }
                case 7646:
                case 1732477:
                    if (C0391.m5571() <= 0) {
                        C0386.m5322();
                    } else {
                        str = "ۧۦۨ";
                        continue;
                    }
                case 28928:
                    i2 = i4 - 1;
                    if (C0346.m3059() < 0) {
                        str = "ۤۢۦ";
                    } else {
                        continue;
                    }
                case 30388:
                    if (i4 <= 0) {
                        break;
                    } else {
                        str = "۠ۡ۟";
                    }
                case 31420:
                    break;
            }
            str = C0089.m592() <= 0 ? "ۢ۠ۡ" : "ۥۣۢ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <E> List<E> m1101(int i, List<E> list) {
        ArrayList arrayList = null;
        String str = "ۢۡۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754384) {
                case 1212:
                    if (C0089.m623(list)) {
                        str = "ۨۢۦ";
                    } else if (C0073.m265() <= 0) {
                        C0377.m4944();
                    } else {
                        str = "ۣۢ۟";
                    }
                case 3132:
                    break;
                case 27158:
                    if (C0396.m5741() >= 0) {
                        C0385.m5282();
                    } else {
                        str = "ۢۦۧ";
                    }
                case 27541:
                case 30259:
                    str = "ۨۢۦ";
                case 30550:
                    if (i > 0) {
                        str = "ۦ۟";
                    } else if (C0088.m573() <= 0) {
                        C0279.m2491();
                        str = "ۤۤۧ";
                    } else {
                        str = "ۣۡۨ";
                    }
                case 30608:
                    if (C0206.m1807() >= 0) {
                        C0025.m118();
                    } else {
                        str = "ۢۡۤ";
                    }
                case 30613:
                    arrayList = new ArrayList();
                    str = C0335.m2923() >= 0 ? "ۣۢۥ" : "ۦۢۨ";
                case 31637:
                    str = "ۦ۟";
                case 1710505:
                    C0191.m1655(arrayList, C0375.m4862(list, 0, C0009.m45(i, C0400.m5932(list))));
                    if (C0380.m5068() > 0) {
                        str = "ۨۢۦ";
                    }
            }
            return arrayList;
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <E> List<E> m1102(int i, Callable<E> callable) {
        int i2 = 0;
        String str = "ۣۧۡ";
        ArrayList arrayList = null;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56538) {
                case 122:
                    if (C0089.m592() <= 0) {
                        i4 = i3;
                    } else {
                        str = "ۣ۠ۡ";
                        i4 = i3;
                        continue;
                    }
                case 155:
                    str = "ۣۨۦ";
                    continue;
                case 197:
                case 1734149:
                    break;
                case 222:
                case 1732484:
                    if (C0121.m1023() >= 0) {
                        C0025.m118();
                    } else {
                        str = "ۣ۠ۡ";
                        continue;
                    }
                case 1709392:
                    str = "ۣۧۡ";
                    continue;
                case 1709457:
                    i2 = i4 - 1;
                    str = "ۣ۠ۤ";
                    continue;
                case 1709470:
                    try {
                        C0184.m1513(arrayList, C0362.m3091(callable));
                        if (C0078.m361() <= 0) {
                            str = "۠ۨۧ";
                        } else {
                            str = "ۣۨۦ";
                            continue;
                        }
                    } catch (Exception e) {
                        str = "ۡ۠";
                    }
                case 1710483:
                    if (C0334.m2866() <= 0) {
                        C0088.m573();
                        i3 = i;
                    } else {
                        str = "ۡۢۢ";
                        i3 = i;
                        continue;
                    }
                case 1710583:
                    if (C0381.m5127() <= 0) {
                        C0184.m1524();
                    } else {
                        str = "ۢۨۤ";
                        continue;
                    }
                case 1729214:
                    if (C0390.m5512() <= 0) {
                        C0060.m216();
                    } else {
                        str = "ۣۨ۟";
                        continue;
                    }
                case 1731230:
                    return arrayList;
                case 1733179:
                    arrayList = new ArrayList();
                    if (C0368.m3171() >= 0) {
                        C0420.m6215();
                    } else {
                        str = "ۥۥ";
                        continue;
                    }
                case 1734555:
                    str = "ۧ۠ۦ";
                    i4 = i2;
                    continue;
                case 1734616:
                    if (i4 <= 0) {
                        break;
                    } else {
                        str = C0375.m4840() >= 0 ? "۟ۦ۟" : "ۣۨ۟";
                    }
            }
            if (C0191.m1627() >= 0) {
                C0121.m1023();
            } else {
                str = "ۣۡۢ";
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <A, B> List<B> m1103(InterfaceC0127<B, A> interfaceC0127, List<A> list) {
        Iterator itM554 = null;
        String str = "۠۟ۢ";
        ArrayList arrayList = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750751) {
                case 478:
                case 1053:
                    if (C0009.m36() < 0) {
                        str = "۟ۧ۠";
                    } else {
                        continue;
                    }
                case 1177:
                    C0184.m1513(arrayList, C0420.m6216(interfaceC0127, C0398.m5850(itM554)));
                    if (C0346.m3059() >= 0) {
                        str = "ۥۣۢ";
                    } else {
                        str = "ۢۧۤ";
                        continue;
                    }
                case 1504:
                    str = "ۣۣۢ";
                    continue;
                case 2202:
                    itM554 = C0088.m554(C0392.m5591(list));
                    if (C0378.m4998() <= 0) {
                        C0398.m5833();
                    } else {
                        str = "۟ۧ۠";
                        continue;
                    }
                case 4391:
                    if (!C0398.m5858(itM554)) {
                        break;
                    } else if (C0334.m2866() <= 0) {
                        C0083.m448();
                        str = "۠ۥۦ";
                    } else {
                        str = "ۣۢ۟";
                    }
                case 4506:
                    return arrayList;
                case 7196:
                    arrayList = new ArrayList();
                    str = "ۥۥۥ";
                    continue;
                case 7611:
                    break;
                case 29825:
                    str = "۠۟ۢ";
                    continue;
            }
            if (C0397.m5814() <= 0) {
                C0392.m5595();
            } else {
                str = "۟ۡۧ";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0005 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <E> java.util.List<E> m1104(com.cloudinject.core.utils.AbstractC0137<E> r6, java.util.List<E> r7) {
        /*
            r1 = 0
            java.lang.String r0 = "ۨۡۦ"
            r2 = r1
            r3 = r1
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1748609(0x1aae81, float:2.450323E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 6: goto L11;
                case 67: goto L56;
                case 1097: goto L37;
                case 1504: goto L27;
                case 2174: goto L85;
                case 4130: goto L9e;
                case 4265: goto L6e;
                case 6266: goto L8f;
                case 26508: goto L45;
                case 27814: goto L65;
                case 27817: goto L1b;
                case 28458: goto L7f;
                case 1733255: goto L8f;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            int r4 = mirrorb.android.location.C0385.m5282()
            if (r4 < 0) goto L82
            android.net.wifi.C0078.m361()
            goto L5
        L1b:
            com.cloudinject.customview.C0184.m1513(r3, r1)
            int r4 = mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            if (r4 >= 0) goto L5
            java.lang.String r0 = "ۦۢۧ"
            goto L5
        L27:
            java.util.Iterator r2 = androidx.core.p007.C0088.m554(r7)
            int r0 = mirrorb.android.hardware.fingerprint.C0382.m5180()
            if (r0 > 0) goto L34
            java.lang.String r0 = "ۥۡ"
            goto L5
        L34:
            java.lang.String r0 = "ۡۡۢ"
            goto L5
        L37:
            com.cloudinject.core.utils.̗̙ r4 = new com.cloudinject.core.utils.̗̙
            r4.<init>(r6, r1)
            java.lang.Object r4 = mirrorb.com.android.internal.content.C0395.m5678(r4, r3)
            if (r4 != 0) goto L8f
            java.lang.String r0 = "ۦۦۨ"
            goto L5
        L45:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r0 = android.app.C0009.m36()
            if (r0 < 0) goto L53
            java.lang.String r0 = "ۣۤ۠"
            goto L5
        L53:
            java.lang.String r0 = "ۦۦۧ"
            goto L5
        L56:
            boolean r4 = mirrorb.com.android.internal.C0398.m5858(r2)
            if (r4 == 0) goto L85
            int r4 = com.cloudinject.p025.C0362.m3122()
            if (r4 >= 0) goto L5
            java.lang.String r0 = "ۥۤۧ"
            goto L5
        L65:
            boolean r4 = androidx.core.p007.C0089.m623(r7)
            if (r4 != 0) goto L85
            java.lang.String r0 = "۠ۤۥ"
            goto L5
        L6e:
            java.lang.Object r1 = mirrorb.com.android.internal.C0398.m5850(r2)
            int r4 = android.app.C0009.m36()
            if (r4 < 0) goto L7c
            mirrorb.android.content.C0380.m5068()
            goto L5
        L7c:
            java.lang.String r0 = "۠۟ۧ"
            goto L5
        L7f:
            java.lang.String r0 = "ۣۧ۟"
            goto L5
        L82:
            java.lang.String r0 = "ۨۡۦ"
            goto L5
        L85:
            int r4 = androidx.core.p007.C0089.m592()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۥۨۦ"
            goto L5
        L8f:
            int r4 = com.cloudinject.feature.p023.C0334.m2866()
            if (r4 > 0) goto L9a
            com.cloudinject.core.p013.C0179.m1427()
            goto L5
        L9a:
            java.lang.String r0 = "ۡۡۢ"
            goto L5
        L9e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1104(com.cloudinject.core.utils.̗̙̙, java.util.List):java.util.List");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c3 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <E> java.util.List<E> m1105(com.cloudinject.core.utils.AbstractC0137<E> r7, java.util.List<E> r8, E r9) {
        /*
            r2 = 0
            java.lang.String r0 = "ۣۤۧ"
            r1 = r2
            r3 = r2
            r4 = r2
        L6:
            int r5 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r6 = 1752456(0x1abd88, float:2.455714E-39)
            r5 = r5 ^ r6
            switch(r5) {
                case 1093: goto L12;
                case 1100: goto L1b;
                case 1802: goto L98;
                case 1864: goto L56;
                case 1934: goto L47;
                case 4756: goto L78;
                case 6708: goto Lcb;
                case 6711: goto L69;
                case 6729: goto L75;
                case 6738: goto L30;
                case 6784: goto Laa;
                case 29783: goto Lae;
                case 29859: goto Lcb;
                case 1728786: goto L87;
                case 1728884: goto Lcf;
                case 1728918: goto Lbd;
                default: goto L11;
            }
        L11:
            goto L6
        L12:
            int r5 = com.cloudinject.feature.model.p014.C0191.m1627()
            if (r5 >= 0) goto L6
            java.lang.String r0 = "ۡۤ۟"
            goto L6
        L1b:
            int r0 = r3 + 5
            int r0 = r0 + 1
            int r1 = r0 + (-5)
            int r0 = mirrorb.android.net.wifi.C0388.m5430()
            if (r0 > 0) goto L2d
            com.sadfxg.fasg.C0369.m3256()
            java.lang.String r0 = "ۡۧۥ"
            goto L6
        L2d:
            java.lang.String r0 = "ۥ۟"
            goto L6
        L30:
            java.lang.Object r5 = com.sadfxg.fasg.C0370.m3273(r8, r3)
            boolean r5 = mirrorb.android.app.admin.C0377.m4966(r7, r5, r9)
            if (r5 != 0) goto L12
            int r5 = mirrorb.android.net.wifi.C0388.m5430()
            if (r5 > 0) goto L44
            com.cloudinject.feature.p015.C0206.m1807()
            goto L6
        L44:
            java.lang.String r0 = "ۤ۟۟"
            goto L6
        L47:
            if (r3 >= r4) goto L12
            int r5 = mirrorb.android.net.wifi.C0387.m5374()
            if (r5 < 0) goto L53
            android.arch.p003.p005.C0060.m216()
            goto L6
        L53:
            java.lang.String r0 = "۟ۦۡ"
            goto L6
        L56:
            int r4 = mirrorb.java.lang.C0400.m5932(r8)
            int r0 = com.cloudinject.customview.C0184.m1524()
            if (r0 < 0) goto L66
            mirrorb.android.providers.C0391.m5571()
            java.lang.String r0 = "۟ۡ۟"
            goto L6
        L66:
            java.lang.String r0 = "۟۟ۨ"
            goto L6
        L69:
            int r3 = com.cloudinject.core.p013.C0179.m1427()
            if (r3 > 0) goto L71
            r3 = r2
            goto L6
        L71:
            java.lang.String r0 = "ۣۤۡ"
            r3 = r2
            goto L6
        L75:
            java.lang.String r0 = "۟ۥۢ"
            goto L6
        L78:
            if (r3 >= r4) goto Lbd
            int r5 = android.net.C0082.m410()
            if (r5 < 0) goto L84
            mirrorb.android.net.wifi.C0387.m5374()
            goto L6
        L84:
            java.lang.String r0 = "ۤۥۣ"
            goto L6
        L87:
            int r3 = mirrorb.java.lang.C0400.m5961()
            if (r3 > 0) goto L93
            com.cloudinject.feature.p023.C0334.m2866()
            r3 = r1
            goto L6
        L93:
            java.lang.String r0 = "۟ۥۧ"
            r3 = r1
            goto L6
        L98:
            androidx.core.graphics.drawable.C0086.m496(r8, r3)
            int r5 = com.cloudinject.p025.C0362.m3122()
            if (r5 < 0) goto La6
            mirrorb.com.android.internal.C0398.m5833()
            goto L6
        La6:
            java.lang.String r0 = "ۨۤ"
            goto L6
        Laa:
            java.lang.String r0 = "۟ۥۥ"
            goto L6
        Lae:
            int r5 = com.cloudinject.p025.p026.C0346.m3059()
            if (r5 < 0) goto Lb9
            mirrorb.android.media.session.C0386.m5322()
            goto L6
        Lb9:
            java.lang.String r0 = "ۣۤۧ"
            goto L6
        Lbd:
            int r0 = mirrorb.android.os.mount.C0390.m5512()
            if (r0 > 0) goto Lc7
            java.lang.String r0 = "۠ۡ"
            goto L6
        Lc7:
            java.lang.String r0 = "ۨۤ"
            goto L6
        Lcb:
            java.lang.String r0 = "ۣۤۡ"
            goto L6
        Lcf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1105(com.cloudinject.core.utils.̗̙̙, java.util.List, java.lang.Object):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x012c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x000a A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.util.List<T> m1106(com.cloudinject.core.utils.AbstractC0137<T> r10, java.util.List<T> r11, java.util.List<T> r12) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1106(com.cloudinject.core.utils.̗̙̙, java.util.List, java.util.List):java.util.List");
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <E> List<E> m1107(Comparator<E> comparator, E e, List<E> list) {
        int i = 0;
        String str = "ۡۧ";
        int i2 = 0;
        int iM310 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750657) {
                case 64:
                    C0206.m1812(list, (((-i2) - 24) - 1) + 24, e);
                    if (C0346.m3059() >= 0) {
                        C0179.m1427();
                    } else {
                        str = "۠ۢۨ";
                        continue;
                    }
                case 233:
                    str = "۟ۧۨ";
                    i2 = iM310;
                    continue;
                case 6654:
                    i = (-1) - (0 - (-iM310));
                    if (C0362.m3122() >= 0) {
                        C0089.m592();
                    } else {
                        str = "ۣ۠ۤ";
                        continue;
                    }
                case 7591:
                    return list;
                case 7616:
                    if (C0397.m5814() <= 0) {
                        C0228.m2012();
                        i2 = i;
                    } else {
                        str = "ۣۥۣ";
                        i2 = i;
                        continue;
                    }
                case 7809:
                    if (iM310 >= 0) {
                        break;
                    } else {
                        str = C0370.m3284() >= 0 ? "ۢۧۧ" : "ۡۧۥ";
                    }
                case 30506:
                    if (C0164.m1359() < 0) {
                        str = "ۡۧ";
                    } else {
                        continue;
                    }
                case 1731239:
                    iM310 = C0074.m310(list, e, comparator);
                    str = "ۣۢۧ";
                    continue;
                case 1731943:
                    break;
            }
            if (C0060.m216() > 0) {
                str = "ۣۥۣ";
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <E> List<E> m1108(Comparator<E> comparator, List<E> list) {
        List<E> listM5591 = null;
        String str = "۟ۨۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755370) {
                case 485:
                    return listM5591;
                case 3339:
                case 26544:
                    str = "ۨۡۨ";
                    break;
                case 3342:
                    if (C0291.m2568() < 0) {
                        str = "ۧۥۧ";
                        break;
                    } else {
                        str = "ۢۥۧ";
                        break;
                    }
                case 3363:
                    try {
                        C0334.m2869(listM5591, comparator);
                        if (C0398.m5833() > 0) {
                            str = "ۨۡۨ";
                            break;
                        } else {
                            C0291.m2568();
                            break;
                        }
                    } catch (Exception e) {
                        if (C0086.m500() > 0) {
                            str = "ۡۦ۟";
                            break;
                        } else {
                            C0362.m3122();
                            break;
                        }
                    }
                case 24821:
                    listM5591 = C0392.m5591(list);
                    str = "ۧۥۧ";
                    break;
                case 29391:
                    if (C0164.m1359() >= 0) {
                        break;
                    } else {
                        str = "۟ۨۨ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <E> List<E> m1109(List<E> list, E e) {
        ArrayList arrayList = null;
        String str = "ۣۡۥ";
        List<E> list2 = null;
        List<E> list3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751678) {
                case 1116:
                    str = "ۣۡۥ";
                    continue;
                case 2270:
                    str = "۟ۢ";
                    list2 = list3;
                    continue;
                case 2399:
                    if (C0073.m265() <= 0) {
                        C0335.m2923();
                        list2 = arrayList;
                    } else {
                        str = "ۡۥۣ";
                        list2 = arrayList;
                        continue;
                    }
                case 3129:
                    if (C0377.m4944() <= 0) {
                        str = "ۣۨۨ";
                        list3 = list;
                    } else {
                        str = "ۢۢ۠";
                        list3 = list;
                        continue;
                    }
                case 3188:
                    arrayList = new ArrayList();
                    str = "ۢۦۥ";
                    continue;
                case 5276:
                    break;
                case 5441:
                    C0184.m1513(list2, e);
                    if (C0383.m5203() <= 0) {
                        str = "ۢۦ۠";
                    } else {
                        str = "۟۠ۨ";
                        continue;
                    }
                case 7513:
                    return list2;
                case 1728925:
                    if (list3 != null) {
                        break;
                    } else if (C0362.m3122() < 0) {
                        str = "ۣ۟ۦ";
                    }
            }
            if (C0369.m3256() > 0) {
                str = "ۡۥۣ";
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <A, B> List<Pair<A, B>> m1110(List<A> list, List<B> list2) {
        Iterator itM554 = null;
        String str = "ۡۥۦ";
        Iterator itM5542 = null;
        ArrayList arrayList = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754475) {
                case 65:
                    if (C0279.m2491() >= 0) {
                        C0191.m1627();
                        str = "ۢۥۢ";
                    } else {
                        str = "ۡۥۦ";
                        continue;
                    }
                case 97:
                    itM5542 = C0088.m554(list);
                    str = "۟ۢۥ";
                    continue;
                case 175:
                    C0184.m1513(arrayList, C0228.m1988(C0398.m5850(itM5542), C0398.m5850(itM554)));
                    if (C0346.m3059() >= 0) {
                        C0400.m5961();
                        str = "۠ۡ۟";
                    } else {
                        str = "ۢۧۡ";
                        continue;
                    }
                case 1908:
                case 30888:
                    if (C0420.m6215() < 0) {
                        str = "ۤ۠۟";
                    } else {
                        continue;
                    }
                case 3143:
                    return arrayList;
                case 3149:
                    if (!C0398.m5858(itM554)) {
                        break;
                    } else if (C0078.m361() <= 0) {
                        C0379.m5056();
                        str = "ۡ۠۟";
                    } else {
                        str = "ۧۥۢ";
                    }
                case 25097:
                    itM554 = C0088.m554(list2);
                    str = "ۤ۠۟";
                    continue;
                case 27177:
                    arrayList = new ArrayList();
                    if (C0383.m5203() > 0) {
                        str = "ۡ۟ۥ";
                    } else {
                        continue;
                    }
                case 27628:
                    if (C0089.m623(list)) {
                        break;
                    } else {
                        str = "ۣۨۡ";
                    }
                case 29303:
                    if (C0089.m623(list2)) {
                        break;
                    } else if (C0382.m5180() > 0) {
                        str = "ۧ۟ۢ";
                    }
                case 30295:
                    if (C0334.m2866() <= 0) {
                        C0155.m1294();
                    } else {
                        str = "ۦۦ۟";
                        continue;
                    }
                case 30327:
                    break;
                case 31880:
                    if (!C0398.m5858(itM5542)) {
                        break;
                    } else if (C0390.m5512() > 0) {
                        str = "ۨۢ۠";
                    }
            }
            str = "ۨۢۦ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:65:0x001c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x000a A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <K, V> java.util.Map<K, V> m1111(int r9, java.util.Map<K, V> r10) {
        /*
            r2 = 0
            r1 = 0
            java.lang.String r0 = "ۦۨۦ"
            r3 = r2
            r4 = r1
            r6 = r2
            r7 = r2
            r5 = r1
            r2 = r1
        La:
            int r1 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r8 = 1749636(0x1ab284, float:2.451762E-39)
            r1 = r1 ^ r8
            switch(r1) {
                case 1165: goto L16;
                case 1187: goto La3;
                case 2086: goto Lc4;
                case 3942: goto Lb5;
                case 5432: goto L49;
                case 6437: goto L89;
                case 6456: goto L7b;
                case 6489: goto L3b;
                case 7266: goto Lb1;
                case 28896: goto L1f;
                case 29504: goto La3;
                case 30472: goto L59;
                case 30612: goto L9d;
                case 30634: goto L3e;
                case 31586: goto L93;
                case 1732157: goto L6d;
                case 1732222: goto L2d;
                default: goto L15;
            }
        L15:
            goto La
        L16:
            int r1 = com.sadfxg.fasg.C0370.m3284()
            if (r1 >= 0) goto La
            java.lang.String r0 = "۟ۥۢ"
            goto La
        L1f:
            int r0 = com.cloudinject.feature.p018.C0228.m2012()
            if (r0 > 0) goto L29
            java.lang.String r0 = "ۤۧۢ"
            r5 = r9
            goto La
        L29:
            java.lang.String r0 = "۠ۦۧ"
            r5 = r9
            goto La
        L2d:
            int r0 = android.database.C0073.m265()
            if (r0 > 0) goto L37
            java.lang.String r0 = "۠ۤ۟"
            r4 = r5
            goto La
        L37:
            java.lang.String r0 = "ۨۨۦ"
            r4 = r5
            goto La
        L3b:
            java.lang.String r0 = "ۣ۠ۤ"
            goto La
        L3e:
            java.lang.Object r0 = mirrorb.com.android.internal.C0398.m5850(r6)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.String r1 = "ۧ۟ۨ"
            r3 = r0
            r0 = r1
            goto La
        L49:
            int r1 = 0 - r4
            int r1 = (-1) - r1
            int r2 = com.cloudinject.feature.model.p014.C0191.m1627()
            if (r2 < 0) goto L55
            r2 = r1
            goto La
        L55:
            java.lang.String r0 = "ۦ۟"
            r2 = r1
            goto La
        L59:
            java.util.Set r1 = android.net.wifi.C0078.m377(r10)
            java.util.Iterator r1 = mirrorb.android.location.C0384.m5271(r1)
            int r6 = mirrorb.android.media.session.C0386.m5322()
            if (r6 > 0) goto L69
            r6 = r1
            goto La
        L69:
            java.lang.String r0 = "ۨۢ"
            r6 = r1
            goto La
        L6d:
            int r0 = mirrorb.android.providers.C0391.m5571()
            if (r0 > 0) goto L77
            java.lang.String r0 = "ۣۣۨ"
            r4 = r2
            goto La
        L77:
            java.lang.String r0 = "۠ۨۥ"
            r4 = r2
            goto La
        L7b:
            java.lang.Object r0 = mirrorb.android.net.C0389.m5472(r3)
            java.lang.Object r1 = mirrorb.java.lang.C0400.m5944(r3)
            p027.p028.p029.C0420.m6218(r7, r0, r1)
            java.lang.String r0 = "۟ۥۢ"
            goto La
        L89:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r0 = "ۣۧۨ"
            r7 = r1
            goto La
        L93:
            boolean r1 = mirrorb.com.android.internal.C0398.m5858(r6)
            if (r1 == 0) goto Lb5
            java.lang.String r0 = "ۧ۠ۧ"
            goto La
        L9d:
            if (r4 <= 0) goto L16
            java.lang.String r0 = "ۣ۠ۧ"
            goto La
        La3:
            int r0 = mirrorb.android.content.res.C0379.m5056()
            if (r0 > 0) goto Lad
            java.lang.String r0 = "ۡۤ۟"
            goto La
        Lad:
            java.lang.String r0 = "ۨۨۦ"
            goto La
        Lb1:
            java.lang.String r0 = "ۦۨۦ"
            goto La
        Lb5:
            int r1 = android.database.C0074.m307()
            if (r1 < 0) goto Lc0
            mirrorb.android.rms.C0392.m5595()
            goto La
        Lc0:
            java.lang.String r0 = "ۤۦۤ"
            goto La
        Lc4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1111(int, java.util.Map):java.util.Map");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:117:0x000b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x001d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e7 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> void m1112(java.util.List<T> r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1112(java.util.List, int, int):void");
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <T> void m1113(T[] tArr, int i, int i2) {
        T t = null;
        String str = "ۥۧۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748707) {
                case 481:
                    if (C0384.m5278() > 0) {
                        str = "ۥۧۦ";
                        break;
                    } else {
                        str = "ۣۤۨ";
                        break;
                    }
                case 4199:
                    t = tArr[i];
                    if (C0385.m5282() >= 0) {
                        break;
                    } else {
                        str = "ۥۣ۟";
                        break;
                    }
                case 4322:
                    tArr[i] = tArr[i2];
                    if (C0378.m4998() <= 0) {
                        break;
                    } else {
                        str = "ۦ۟ۥ";
                        break;
                    }
                case 28591:
                    tArr[i2] = t;
                    str = "ۡۡ";
                    break;
                case 1733315:
                    return;
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <T> void m1114(T[] tArr, Object[] objArr) {
        String str = "ۣۨۧ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755398) {
                case 129:
                    if (C0060.m216() <= 0) {
                        i2 = 0;
                    } else {
                        str = "۟ۨۨ";
                        i2 = 0;
                        continue;
                    }
                case 194:
                    if (C0179.m1427() > 0) {
                        str = "ۨۥۤ";
                    } else {
                        continue;
                    }
                case 2124:
                    i = i2 + 1;
                    str = "ۣۢ۠";
                    continue;
                case 24857:
                    if (i2 >= objArr.length) {
                        break;
                    } else if (C0380.m5068() <= 0) {
                        C0009.m36();
                    } else {
                        str = "ۣۣۧ";
                    }
                case 25304:
                    break;
                case 26584:
                    if (C0179.m1427() <= 0) {
                        C0073.m265();
                    } else {
                        str = "۠ۦ";
                        continue;
                    }
                case 28875:
                    str = "ۣۨۧ";
                    continue;
                case 31623:
                case 1709312:
                    if (C0089.m592() > 0) {
                        str = "۟ۨۨ";
                    } else {
                        continue;
                    }
                case 31673:
                    if (C0086.m500() <= 0) {
                        i2 = i;
                    } else {
                        str = "ۡۢ۟";
                        i2 = i;
                        continue;
                    }
                case 32622:
                    return;
                case 32761:
                    tArr[i2] = objArr;
                    str = "ۦۣ۟";
                    continue;
            }
            if (C0279.m2491() < 0) {
                str = "ۣۢۧ";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0088 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1115(android.util.SparseIntArray r6) {
        /*
            r2 = 0
            java.lang.String r0 = "۟ۢۦ"
            r1 = r2
            r3 = r2
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1754592(0x1ac5e0, float:2.458707E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 73: goto L11;
                case 963: goto L60;
                case 1165: goto L91;
                case 1923: goto L75;
                case 25219: goto L2a;
                case 27392: goto L91;
                case 27395: goto L4f;
                case 28319: goto L53;
                case 28418: goto L1b;
                case 28422: goto L82;
                case 30336: goto L82;
                case 31780: goto L41;
                case 32545: goto L38;
                case 32576: goto Laa;
                case 1710591: goto L99;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            int r4 = mirrorb.dalvik.system.C0399.m5914()
            if (r4 > 0) goto L95
            mirrorb.dalvik.system.C0399.m5914()
            goto L5
        L1b:
            int r3 = android.arch.p003.p005.C0060.m216()
            if (r3 > 0) goto L26
            mirrorb.android.content.res.C0379.m5056()
            r3 = r2
            goto L5
        L26:
            java.lang.String r0 = "ۤۧۤ"
            r3 = r2
            goto L5
        L2a:
            if (r6 == 0) goto L82
            int r0 = mirrorb.android.net.wifi.C0387.m5374()
            if (r0 < 0) goto L35
            java.lang.String r0 = "ۣۨۧ"
            goto L5
        L35:
            java.lang.String r0 = "ۧۨۤ"
            goto L5
        L38:
            int r4 = com.cloudinject.customview.C0183.m1464()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۦ۠ۧ"
            goto L5
        L41:
            r1 = 1
            int r4 = mirrorb.android.util.C0393.m5668()
            if (r4 > 0) goto L4c
            mirrorb.android.location.C0385.m5282()
            goto L5
        L4c:
            java.lang.String r0 = "ۡۢۤ"
            goto L5
        L4f:
            java.lang.String r0 = "ۤۦۢ"
            r3 = r1
            goto L5
        L53:
            int r4 = mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            if (r4 < 0) goto L5d
            com.cloudinject.feature.p023.C0335.m2923()
            goto L5
        L5d:
            java.lang.String r0 = "۠۠ۢ"
            goto L5
        L60:
            int r4 = mirrorb.android.hardware.fingerprint.C0381.m5117(r6)
            if (r4 != 0) goto L11
            int r0 = com.cloudinject.customview.C0183.m1464()
            if (r0 > 0) goto L72
            androidx.core.p007.C0089.m592()
            java.lang.String r0 = "ۢۨۨ"
            goto L5
        L72:
            java.lang.String r0 = "ۦۨۥ"
            goto L5
        L75:
            int r4 = mirrorb.com.android.internal.app.C0394.m5672()
            if (r4 > 0) goto L7f
            mirrorb.android.accounts.C0376.m4906()
            goto L5
        L7f:
            java.lang.String r0 = "ۢۨۦ"
            goto L5
        L82:
            int r4 = com.cloudinject.core.p009.p012.C0164.m1359()
            if (r4 < 0) goto L8d
            com.cloudinject.feature.p018.C0229.m2064()
            goto L5
        L8d:
            java.lang.String r0 = "ۤ۟۟"
            goto L5
        L91:
            java.lang.String r0 = "ۤۦۢ"
            goto L5
        L95:
            java.lang.String r0 = "۠ۥۤ"
            goto L5
        L99:
            int r0 = mirrorb.android.location.C0385.m5282()
            if (r0 < 0) goto La6
            com.cloudinject.feature.p023.C0335.m2923()
            java.lang.String r0 = "ۥۢ"
            goto L5
        La6:
            java.lang.String r0 = "۟ۢۦ"
            goto L5
        Laa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1115(android.util.SparseIntArray):boolean");
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <T> boolean m1116(T t, Collection<T> collection) {
        String str = "ۦۥۢ";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752580) {
                case 975:
                    if (C0391.m5571() > 0) {
                        str = "ۣ۟۠";
                    } else {
                        continue;
                    }
                case 1090:
                    return z;
                case 2087:
                    break;
                case 4475:
                    if (C0025.m118() <= 0) {
                        C0335.m2923();
                    } else {
                        str = "ۦۥۢ";
                        continue;
                    }
                case 6520:
                case 1729036:
                    if (C0279.m2491() >= 0) {
                        C0191.m1627();
                        str = "ۤ۟ۦ";
                    } else {
                        str = "ۣۤۥ";
                        continue;
                    }
                case 30411:
                    str = "۟ۤ";
                    continue;
                case 31560:
                    z2 = true;
                    if (C0088.m573() <= 0) {
                        C0378.m4998();
                    } else {
                        str = "ۧۥ۠";
                        continue;
                    }
                case 31686:
                    if (C0383.m5203() <= 0) {
                        z = z2;
                    } else {
                        str = "ۥۡۧ";
                        z = z2;
                        continue;
                    }
                case 31751:
                    if (C0089.m623(collection)) {
                        break;
                    } else {
                        str = "ۥۧ";
                    }
                case 1729190:
                    if (!C0184.m1530(collection, t)) {
                        break;
                    } else if (C0228.m2012() <= 0) {
                        C0228.m2012();
                    } else {
                        str = "ۧۡۦ";
                    }
                case 1730017:
                    str = "ۣۤۥ";
                    z = false;
                    continue;
            }
            str = C0073.m265() <= 0 ? "ۣۥ" : "ۨ۟ۦ";
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <T> boolean m1117(T t, T[] tArr) {
        String str = "ۦۣۦ";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751594) {
                case 175:
                    if (C0083.m448() >= 0) {
                        C0191.m1627();
                        z = z2;
                    } else {
                        str = "ۢۦ";
                        z = z2;
                        continue;
                    }
                case 183:
                    break;
                case 1098:
                    z2 = true;
                    str = "ۤۥۦ";
                    continue;
                case 4298:
                    if (C0362.m3122() >= 0) {
                        z = false;
                    } else {
                        str = "ۧۢۧ";
                        z = false;
                        continue;
                    }
                case 4362:
                    if (C0385.m5282() < 0) {
                        str = "۠۠۠";
                    } else {
                        continue;
                    }
                case 29452:
                case 32608:
                    if (C0420.m6215() >= 0) {
                        C0179.m1427();
                    } else {
                        str = "ۧۢۧ";
                        continue;
                    }
                case 29479:
                    if (C0368.m3171() >= 0) {
                        C0346.m3059();
                        str = "ۧۤ۟";
                    } else {
                        str = "ۦۣۦ";
                        continue;
                    }
                case 31559:
                    if (!C0164.m1336(C0025.m113(tArr), t)) {
                        break;
                    } else if (C0346.m3059() >= 0) {
                        C0191.m1627();
                        str = "ۦۡۢ";
                    } else {
                        str = "ۥۦۡ";
                    }
                case 31715:
                    if (C0381.m5140(tArr)) {
                        break;
                    } else if (C0183.m1464() <= 0) {
                        C0206.m1807();
                    } else {
                        str = "ۦ۠ۧ";
                    }
                case 32582:
                    return z;
                case 1730158:
                    str = "ۨۢ۠";
                    continue;
            }
            if (C0346.m3059() >= 0) {
                C0291.m2568();
            } else {
                str = "۠ۢۢ";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0086 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1118(java.util.Collection<?> r6) {
        /*
            r2 = 0
            java.lang.String r0 = "ۤۧۦ"
            r1 = r2
            r3 = r2
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1749608(0x1ab268, float:2.451723E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 1036: goto L11;
                case 1237: goto L67;
                case 1354: goto L14;
                case 2187: goto L52;
                case 2219: goto L38;
                case 3971: goto L43;
                case 6411: goto L46;
                case 29610: goto L74;
                case 29669: goto L63;
                case 29814: goto L8e;
                case 30535: goto L29;
                case 31671: goto L7d;
                case 1730957: goto L80;
                case 1732279: goto L80;
                case 1732456: goto L74;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            java.lang.String r0 = "ۧۦ"
            goto L5
        L14:
            boolean r0 = mirrorb.android.net.C0389.m5461(r6)
            if (r0 == 0) goto L7d
            int r0 = com.cloudinject.feature.p018.C0228.m2012()
            if (r0 > 0) goto L26
            android.database.C0074.m307()
            java.lang.String r0 = "ۤ۟ۢ"
            goto L5
        L26:
            java.lang.String r0 = "ۣۣۢ"
            goto L5
        L29:
            int r3 = com.cloudinject.feature.p018.C0228.m2012()
            if (r3 > 0) goto L34
            com.cloudinject.customview.C0184.m1524()
            r3 = r1
            goto L5
        L34:
            java.lang.String r0 = "ۧۨ۟"
            r3 = r1
            goto L5
        L38:
            if (r6 == 0) goto L80
            int r4 = mirrorb.java.lang.C0400.m5961()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۣۨۧ"
            goto L5
        L43:
            java.lang.String r0 = "ۤۨۧ"
            goto L5
        L46:
            int r0 = mirrorb.android.accounts.C0375.m4840()
            if (r0 < 0) goto L4f
            java.lang.String r0 = "ۣۤۧ"
            goto L5
        L4f:
            java.lang.String r0 = "ۨۨ"
            goto L5
        L52:
            int r0 = mirrorb.android.os.mount.C0390.m5512()
            if (r0 > 0) goto L5f
            com.cloudinject.core.p009.p012.C0164.m1359()
            java.lang.String r0 = "ۥۡۤ"
            r3 = r2
            goto L5
        L5f:
            java.lang.String r0 = "۠ۤۧ"
            r3 = r2
            goto L5
        L63:
            r1 = 1
            java.lang.String r0 = "ۧ۠ۨ"
            goto L5
        L67:
            int r4 = com.cloudinject.feature.model.p014.C0191.m1627()
            if (r4 < 0) goto L71
            mirrorb.android.net.wifi.C0387.m5374()
            goto L5
        L71:
            java.lang.String r0 = "ۤۧۦ"
            goto L5
        L74:
            int r4 = mirrorb.android.net.wifi.C0388.m5430()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۧۨ۟"
            goto L5
        L7d:
            java.lang.String r0 = "ۥۢۨ"
            goto L5
        L80:
            int r0 = com.cloudinject.core.p009.p011.C0155.m1294()
            if (r0 < 0) goto L8a
            java.lang.String r0 = "۟ۡ۠"
            goto L5
        L8a:
            java.lang.String r0 = "ۦۡۨ"
            goto L5
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1118(java.util.Collection):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008b A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1119(java.util.Map<?, ?> r6) {
        /*
            r2 = 0
            java.lang.String r0 = "۠ۤۢ"
            r1 = r2
            r3 = r2
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1755461(0x1ac945, float:2.459925E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 9: goto L11;
                case 2821: goto L94;
                case 3075: goto L4f;
                case 3107: goto L34;
                case 3207: goto L59;
                case 3309: goto L85;
                case 3906: goto L27;
                case 25115: goto L22;
                case 25127: goto L6f;
                case 25478: goto L43;
                case 26564: goto L78;
                case 28414: goto L6c;
                case 29869: goto L78;
                case 31715: goto L98;
                case 32590: goto L85;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            int r0 = mirrorb.dalvik.system.C0399.m5914()
            if (r0 > 0) goto L1e
            mirrorb.android.content.res.C0379.m5056()
            java.lang.String r0 = "۟ۤ۟"
            r3 = r1
            goto L5
        L1e:
            java.lang.String r0 = "ۢۢۦ"
            r3 = r1
            goto L5
        L22:
            if (r6 == 0) goto L85
            java.lang.String r0 = "ۧۥ۠"
            goto L5
        L27:
            int r4 = com.cloudinject.p025.p026.C0346.m3059()
            if (r4 < 0) goto L31
            com.cloudinject.feature.p015.C0206.m1807()
            goto L5
        L31:
            java.lang.String r0 = "ۧۢۡ"
            goto L5
        L34:
            int r3 = mirrorb.android.location.C0385.m5282()
            if (r3 < 0) goto L3f
            mirrorb.android.providers.C0391.m5571()
            r3 = r2
            goto L5
        L3f:
            java.lang.String r0 = "۠۟ۢ"
            r3 = r2
            goto L5
        L43:
            int r0 = mirrorb.android.hardware.fingerprint.C0382.m5180()
            if (r0 > 0) goto L4c
            java.lang.String r0 = "ۣ۠ۢ"
            goto L5
        L4c:
            java.lang.String r0 = "ۥۢۥ"
            goto L5
        L4f:
            r1 = 1
            int r4 = mirrorb.com.android.internal.C0398.m5833()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۣۨۧ"
            goto L5
        L59:
            boolean r4 = mirrorb.android.hardware.fingerprint.C0381.m5139(r6)
            if (r4 == 0) goto L94
            int r4 = mirrorb.android.accounts.C0376.m4906()
            if (r4 > 0) goto L69
            android.net.C0082.m410()
            goto L5
        L69:
            java.lang.String r0 = "۟ۥۡ"
            goto L5
        L6c:
            java.lang.String r0 = "ۣ۟ۧ"
            goto L5
        L6f:
            int r4 = mirrorb.android.accounts.C0376.m4906()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "۠ۤۢ"
            goto L5
        L78:
            int r4 = com.cloudinject.core.p013.C0179.m1427()
            if (r4 > 0) goto L82
            com.cloudinject.feature.p023.C0334.m2866()
            goto L5
        L82:
            java.lang.String r0 = "ۢۢۦ"
            goto L5
        L85:
            int r4 = mirrorb.android.accounts.C0376.m4906()
            if (r4 > 0) goto L90
            android.database.C0074.m307()
            goto L5
        L90:
            java.lang.String r0 = "ۧۡ۠"
            goto L5
        L94:
            java.lang.String r0 = "ۧۧۧ"
            goto L5
        L98:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1119(java.util.Map):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0005 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1120(long[] r6) {
        /*
            r2 = 0
            java.lang.String r0 = "ۨ۟ۧ"
            r1 = r2
            r3 = r2
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1755467(0x1ac94b, float:2.459933E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 46: goto L11;
                case 411: goto L64;
                case 2217: goto L69;
                case 3234: goto L1a;
                case 3304: goto L42;
                case 24925: goto L24;
                case 25140: goto L6c;
                case 28330: goto L90;
                case 29893: goto L53;
                case 30517: goto L69;
                case 30696: goto L6c;
                case 31732: goto L75;
                case 32337: goto L33;
                case 32564: goto L46;
                case 32623: goto L81;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            int r4 = androidx.core.p007.C0089.m592()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۦۤ۠"
            goto L5
        L1a:
            r1 = 1
            int r4 = mirrorb.dalvik.system.C0399.m5914()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۥ۟ۨ"
            goto L5
        L24:
            int r0 = com.cloudinject.feature.p023.C0334.m2866()
            if (r0 > 0) goto L30
            mirrorb.android.net.wifi.C0387.m5374()
            java.lang.String r0 = "ۥۨۡ"
            goto L5
        L30:
            java.lang.String r0 = "ۧۤ۠"
            goto L5
        L33:
            int r0 = r6.length
            if (r0 != 0) goto L75
            int r0 = com.cloudinject.feature.model.p014.C0191.m1627()
            if (r0 < 0) goto L3f
            java.lang.String r0 = "ۦۣۧ"
            goto L5
        L3f:
            java.lang.String r0 = "ۣۣ۟"
            goto L5
        L42:
            java.lang.String r0 = "ۨۤۡ"
            r3 = r2
            goto L5
        L46:
            int r4 = com.cloudinject.feature.p023.C0335.m2923()
            if (r4 < 0) goto L50
            androidx.core.p007.C0089.m592()
            goto L5
        L50:
            java.lang.String r0 = "ۥۨۦ"
            goto L5
        L53:
            int r0 = mirrorb.android.location.C0384.m5278()
            if (r0 > 0) goto L60
            mirrorb.com.android.internal.app.C0394.m5672()
            java.lang.String r0 = "ۨ۟ۤ"
            r3 = r1
            goto L5
        L60:
            java.lang.String r0 = "۟ۦۨ"
            r3 = r1
            goto L5
        L64:
            if (r6 == 0) goto L6c
            java.lang.String r0 = "ۣۨ۟"
            goto L5
        L69:
            java.lang.String r0 = "۟ۦۨ"
            goto L5
        L6c:
            int r4 = mirrorb.com.android.internal.C0398.m5833()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۧۦۨ"
            goto L5
        L75:
            int r0 = mirrorb.android.providers.C0391.m5571()
            if (r0 > 0) goto L7e
            java.lang.String r0 = "ۢ۟ۡ"
            goto L5
        L7e:
            java.lang.String r0 = "۟ۨ۟"
            goto L5
        L81:
            int r4 = com.sadfxg.fasg.C0369.m3256()
            if (r4 > 0) goto L8c
            mirrorb.android.net.wifi.C0387.m5374()
            goto L5
        L8c:
            java.lang.String r0 = "ۨ۟ۧ"
            goto L5
        L90:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1120(long[]):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0025. Please report as an issue. */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static int[] m1121(int[] iArr, int[] iArr2) {
        int[] iArr3 = null;
        int length = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String str = "۟ۢۨ";
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int length2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56575) {
                case 68:
                    if (C0376.m4906() <= 0) {
                        i4 = i2;
                        i8 = i3;
                    } else {
                        str = "ۧۦۨ";
                        i4 = i2;
                        i8 = i3;
                    }
                case 1710358:
                    if (C0183.m1464() > 0) {
                        str = "ۦۡۧ";
                    }
                case 1710392:
                    break;
                case 1710453:
                    str = "۠ۤۧ";
                    i6 = i7;
                    i10 = i9;
                case 1711382:
                    str = "۟۟ۥ";
                case 1711475:
                case 1734559:
                    str = "ۡۢۥ";
                case 1711541:
                    i5 = 0;
                    i = 0;
                    if (C0375.m4840() >= 0) {
                        C0368.m3171();
                    } else {
                        str = "ۤ۠ۦ";
                    }
                case 1728821:
                    i2 = (i4 - 29) + 1 + 29;
                    i3 = (i8 - 31) + 1 + 31;
                    str = "ۦۡ";
                case 1728826:
                case 1733537:
                    if (C0378.m4998() > 0) {
                        str = "ۢۧ۟";
                    }
                case 1729215:
                    str = "ۡۢۥ";
                    i4 = i5;
                case 1729272:
                    str = "ۧۥۥ";
                case 1729813:
                    i10 = 0;
                    str = "ۣۢۨ";
                case 1729845:
                    str = "۟ۢۨ";
                case 1730206:
                    i7 = 1 - (0 - i6);
                    i9 = (i10 - 25) + 1 + 25;
                    str = C0377.m4944() <= 0 ? "ۢۤۢ" : "ۣۧۦ";
                case 1732152:
                    if (C0377.m4944() <= 0) {
                        C0398.m5833();
                        str = "ۥۢ۟";
                        i6 = i;
                    } else {
                        str = "ۢۧ۟";
                        i6 = i;
                    }
                case 1732549:
                    if (i6 < length) {
                        iArr3[i10] = iArr[i6];
                        str = "ۤۤۡ";
                    } else {
                        str = "۟۟ۥ";
                    }
                case 1733147:
                    if (i4 < length2) {
                        iArr3[i8] = iArr2[i4];
                        if (C0121.m1023() < 0) {
                            str = "ۥۡۦ";
                        }
                    } else {
                        str = "ۧۥۥ";
                    }
                case 1734556:
                    if (C0025.m118() <= 0) {
                        C0387.m5374();
                        str = "ۢۡۨ";
                    } else {
                        str = "ۥۡۡ";
                    }
                case 1735578:
                    iArr3 = new int[(C0074.m301(iArr) - 15) + C0074.m301(iArr2) + 15];
                    length = iArr.length;
                    str = "ۦۣ۟";
                case 1735674:
                    str = "ۥۥ۠";
                    length2 = iArr2.length;
                    i8 = i10;
            }
            return iArr3;
        }
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    public static int m1122(SparseIntArray sparseIntArray) {
        String str = "ۢۢۡ";
        int iM5117 = 0;
        int i = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754472) {
                case 162:
                    if (C0083.m448() >= 0) {
                        C0391.m5571();
                        i = 0;
                    } else {
                        str = "ۨۤ۟";
                        i = 0;
                        continue;
                    }
                case 1061:
                    iM5117 = C0381.m5117(sparseIntArray);
                    if (C0420.m6215() >= 0) {
                        C0382.m5180();
                    } else {
                        str = "۟ۨۢ";
                        continue;
                    }
                case 1847:
                    break;
                case 3083:
                    str = "ۤ۟";
                    continue;
                case 28017:
                    str = "۠ۢۤ";
                    i = iM5117;
                    continue;
                case 28171:
                    if (C0073.m265() <= 0) {
                        str = "ۣۨۧ";
                    } else {
                        str = "ۧۥۨ";
                        continue;
                    }
                case 28234:
                    return i;
                case 30294:
                case 1710355:
                    if (C0384.m5278() > 0) {
                        str = "۠ۢۤ";
                    } else {
                        continue;
                    }
                case 30665:
                    if (sparseIntArray != null) {
                        break;
                    } else {
                        str = C0073.m265() <= 0 ? "ۨۨ۟" : "۠ۤۧ";
                    }
                case 1710472:
                    if (C0179.m1427() <= 0) {
                        str = "ۡۢ۟";
                    } else {
                        str = "ۢۢۡ";
                        continue;
                    }
            }
            if (C0086.m500() <= 0) {
                C0395.m5698();
            } else {
                str = "ۦ۟ۦ";
            }
        }
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    public static int m1123(Collection<?> collection) {
        String str = "ۡۡۤ";
        int iM2492 = 0;
        int i = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56483) {
                case 35:
                    if (C0089.m592() <= 0) {
                        C0393.m5668();
                    } else {
                        str = "ۣ۟ۤ";
                        continue;
                    }
                case 1710722:
                    str = "ۥۦۨ";
                    continue;
                case 1729157:
                    return i;
                case 1729189:
                    if (C0074.m307() >= 0) {
                        C0375.m4840();
                        str = "۟ۦۡ";
                    } else {
                        str = "ۡۡۤ";
                        continue;
                    }
                case 1729220:
                    str = "ۤۤ";
                    i = 0;
                    continue;
                case 1729249:
                    iM2492 = C0279.m2492(collection);
                    if (C0083.m448() >= 0) {
                        C0369.m3256();
                    } else {
                        str = "ۡ۟ۧ";
                        continue;
                    }
                case 1731240:
                case 1731243:
                    str = "ۥۤۥ";
                    continue;
                case 1731242:
                    break;
                case 1733162:
                    str = "ۥۤۥ";
                    i = iM2492;
                    continue;
                case 1733223:
                    if (collection != null) {
                        break;
                    } else if (C0228.m2012() > 0) {
                        str = "ۧۨۢ";
                    }
            }
            str = "ۥۥۢ";
        }
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    public static int m1124(Map<?, ?> map) {
        String str = "ۣۤۢ";
        int iM4943 = 0;
        int i = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753453) {
                case 230:
                    str = "ۣۤۢ";
                    continue;
                case 818:
                    break;
                case 1090:
                case 29289:
                    if (C0394.m5672() > 0) {
                        str = "ۢ۠ۥ";
                    } else {
                        continue;
                    }
                case 1092:
                    iM4943 = C0377.m4943(map);
                    if (C0376.m4906() <= 0) {
                        C0335.m2923();
                    } else {
                        str = "ۢۧۨ";
                        continue;
                    }
                case 26327:
                    if (C0375.m4840() < 0) {
                        str = "۟ۦ";
                    } else {
                        continue;
                    }
                case 29230:
                    str = "ۢ۠ۥ";
                    i = iM4943;
                    continue;
                case 29450:
                    return i;
                case 31560:
                    if (map != null) {
                        break;
                    } else if (C0279.m2491() >= 0) {
                        C0385.m5282();
                        str = "ۣ۠۠";
                    } else {
                        str = "۟ۥ۠";
                    }
                case 32712:
                    if (C0279.m2491() >= 0) {
                        str = "۟ۢۡ";
                    } else {
                        str = "ۢۥۧ";
                        continue;
                    }
                case 1710730:
                    if (C0389.m5481() <= 0) {
                        C0334.m2866();
                        i = 0;
                    } else {
                        str = "ۥۨۨ";
                        i = 0;
                        continue;
                    }
            }
            str = "ۧ۠ۢ";
        }
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    public static int m1125(long[] jArr) {
        String str = "ۥۣۧ";
        int length = 0;
        int i = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746935) {
                case 181:
                    str = "۟ۨۦ";
                    i = 0;
                    continue;
                case 201:
                    break;
                case 2320:
                    length = jArr.length;
                    if (C0025.m118() <= 0) {
                        C0397.m5814();
                        str = "۟ۡۤ";
                    } else {
                        str = "۠ۦۦ";
                        continue;
                    }
                case 2359:
                case 7508:
                    if (C0164.m1359() < 0) {
                        str = "ۦۢ";
                    } else {
                        continue;
                    }
                case 3159:
                    if (C0291.m2568() >= 0) {
                        C0385.m5282();
                        i = length;
                    } else {
                        str = "ۦۢ";
                        i = length;
                        continue;
                    }
                case 3368:
                    if (C0083.m448() < 0) {
                        str = "۟ۡۤ";
                    } else {
                        continue;
                    }
                case 4074:
                    if (C0380.m5068() > 0) {
                        str = "ۡۡ۠";
                    } else {
                        continue;
                    }
                case 6654:
                    if (jArr != null) {
                        break;
                    } else {
                        str = "۠۠۟";
                    }
                case 28478:
                    str = "ۥۣۧ";
                    continue;
                case 1735499:
                    return i;
            }
            str = "ۡۢۨ";
        }
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    public static <E> Pair<List<E>, List<E>> m1126(AbstractC0132<E> abstractC0132, List<E> list) {
        String str = "ۡۨۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750813) {
                case 6333:
                    return C0228.m1988(C0395.m5700(abstractC0132, list), C0291.m2565(abstractC0132, list));
                case 29432:
                    if (C0386.m5322() <= 0) {
                        break;
                    } else {
                        str = "ۡۨۧ";
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    public static <E> E m1127(List<E> list) {
        String str = "ۣۡ۟";
        Object objM3273 = 0;
        E e = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746726) {
                case 34:
                    if (C0369.m3256() <= 0) {
                        str = "۠ۤ۠";
                    } else {
                        str = "ۦ۠ۤ";
                        continue;
                    }
                case 2523:
                    if (!C0089.m623(list)) {
                        break;
                    } else {
                        str = C0384.m5278() <= 0 ? "ۢۨۨ" : "ۧۨ۠";
                    }
                case 4441:
                    if (C0184.m1524() >= 0) {
                        C0390.m5512();
                        e = objM3273;
                    } else {
                        str = "ۣۤۧ";
                        e = objM3273;
                        continue;
                    }
                case 4547:
                    if (C0155.m1294() >= 0) {
                        str = "ۣ۠۟";
                        e = null;
                    } else {
                        str = "۟۟ۤ";
                        e = null;
                        continue;
                    }
                case 5179:
                case 26188:
                    str = "ۣۤۧ";
                    continue;
                case 5518:
                    if (C0384.m5278() > 0) {
                        str = "ۣۡ۟";
                    } else {
                        continue;
                    }
                case 6860:
                    break;
                case 7534:
                    return e;
                case 24889:
                    if (C0089.m592() <= 0) {
                        C0379.m5056();
                    } else {
                        str = "ۣۦۨ";
                        continue;
                    }
                case 28654:
                    objM3273 = C0370.m3273(list, 0);
                    if (C0025.m118() <= 0) {
                        str = "۟ۦۢ";
                    } else {
                        str = "ۣۣ۟";
                        continue;
                    }
            }
            if (C0390.m5512() > 0) {
                str = "ۨ۟۟";
            }
        }
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    public static String m1128(int i, String str) {
        String str2 = "ۡۨۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1746786) {
                case 2301:
                    return C0379.m5019(str, 0, C0025.m87(i, 0, C0380.m5091(str)));
                case 5596:
                    str2 = "ۡۨۦ";
                    break;
            }
        }
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    public static <T> List<T> m1129(List<T> list, List<T> list2) {
        List<T> listM5591 = null;
        String str = "۟ۡۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753479) {
                case 1124:
                    C0191.m1655(listM5591, C0392.m5591(list2));
                    if (C0389.m5481() > 0) {
                        str = "۟۟۟";
                        break;
                    } else {
                        C0073.m265();
                        str = "ۦۤۡ";
                        break;
                    }
                case 26305:
                    listM5591 = C0392.m5591(list);
                    if (C0391.m5571() <= 0) {
                        break;
                    } else {
                        str = "ۧۦۢ";
                        break;
                    }
                case 26488:
                    return listM5591;
                case 29505:
                    str = "۟ۡۨ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076 A[SYNTHETIC] */
    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1130(android.util.SparseArray<?> r6) {
        /*
            r2 = 0
            java.lang.String r0 = "ۣ۠ۡ"
            r1 = r2
            r3 = r2
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1750626(0x1ab662, float:2.45315E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 70: goto L11;
                case 195: goto L82;
                case 352: goto L5b;
                case 2272: goto L93;
                case 2949: goto L82;
                case 3260: goto L70;
                case 4385: goto L4c;
                case 4421: goto L37;
                case 7296: goto L49;
                case 29483: goto L46;
                case 29796: goto L1c;
                case 30505: goto L7f;
                case 32585: goto La2;
                case 1731103: goto L29;
                case 1731261: goto L7f;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            if (r6 == 0) goto L82
            int r4 = com.cloudinject.core.p009.p011.C0155.m1294()
            if (r4 >= 0) goto L5
            java.lang.String r0 = "ۣۧۦ"
            goto L5
        L1c:
            int r4 = com.cloudinject.core.utils.compat.C0121.m1023()
            if (r4 < 0) goto L26
            android.app.C0009.m36()
            goto L5
        L26:
            java.lang.String r0 = "۟ۡۥ"
            goto L5
        L29:
            r1 = 1
            int r4 = com.cloudinject.feature.p023.C0334.m2866()
            if (r4 > 0) goto L34
            mirrorb.android.net.wifi.C0387.m5374()
            goto L5
        L34:
            java.lang.String r0 = "۟۠ۨ"
            goto L5
        L37:
            int r3 = com.cloudinject.feature.p023.C0335.m2923()
            if (r3 < 0) goto L42
            mirrorb.dalvik.system.C0399.m5914()
            r3 = r1
            goto L5
        L42:
            java.lang.String r0 = "ۨۢۥ"
            r3 = r1
            goto L5
        L46:
            java.lang.String r0 = "ۥۢۤ"
            goto L5
        L49:
            java.lang.String r0 = "ۦ۟ۤ"
            goto L5
        L4c:
            int r3 = com.cloudinject.p025.p026.C0346.m3059()
            if (r3 < 0) goto L57
            mirrorb.android.app.servertransaction.C0378.m4998()
            r3 = r2
            goto L5
        L57:
            java.lang.String r0 = "۠۠ۢ"
            r3 = r2
            goto L5
        L5b:
            int r0 = mirrorb.com.android.internal.view.C0397.m5793(r6)
            if (r0 != 0) goto L70
            int r0 = mirrorb.android.content.C0380.m5068()
            if (r0 > 0) goto L6d
            mirrorb.dalvik.system.C0399.m5914()
            java.lang.String r0 = "ۣۧۡ"
            goto L5
        L6d:
            java.lang.String r0 = "ۣۧۡ"
            goto L5
        L70:
            int r0 = android.arch.p003.p005.C0060.m216()
            if (r0 > 0) goto L7c
            com.cloudinject.core.utils.compat.C0121.m1023()
            java.lang.String r0 = "ۣۢ۟"
            goto L5
        L7c:
            java.lang.String r0 = "ۦۥۥ"
            goto L5
        L7f:
            java.lang.String r0 = "ۨۢۥ"
            goto L5
        L82:
            int r0 = mirrorb.android.providers.C0391.m5571()
            if (r0 > 0) goto L8f
            com.cloudinject.feature.p021.p022.C0279.m2491()
            java.lang.String r0 = "ۦۥۡ"
            goto L5
        L8f:
            java.lang.String r0 = "ۤۡ"
            goto L5
        L93:
            int r4 = com.cloudinject.p025.p026.C0346.m3059()
            if (r4 < 0) goto L9e
            p027.p028.p029.C0420.m6215()
            goto L5
        L9e:
            java.lang.String r0 = "ۣ۠ۡ"
            goto L5
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1130(android.util.SparseArray):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0002 A[SYNTHETIC] */
    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1131(java.lang.Object r3, java.lang.Object r4) {
        /*
            java.lang.String r0 = "ۣۤۢ"
        L2:
            int r1 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r2 = 1747773(0x1aab3d, float:2.449152E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 135: goto Le;
                case 3195: goto L13;
                case 3204: goto L31;
                case 4376: goto L26;
                case 5808: goto L42;
                case 5851: goto L4f;
                case 6650: goto L36;
                case 7230: goto L15;
                case 1734424: goto L17;
                default: goto Ld;
            }
        Ld:
            goto L2
        Le:
            if (r4 != 0) goto L42
            java.lang.String r0 = "ۣۧۧ"
            goto L2
        L13:
            r0 = 0
        L14:
            return r0
        L15:
            r0 = 1
            goto L14
        L17:
            if (r3 != 0) goto L4f
            int r1 = mirrorb.com.android.internal.content.C0395.m5698()
            if (r1 < 0) goto L23
            mirrorb.android.net.wifi.C0388.m5430()
            goto L2
        L23:
            java.lang.String r0 = "۟ۡۨ"
            goto L2
        L26:
            if (r3 != 0) goto L42
            int r1 = mirrorb.java.lang.C0400.m5961()
            if (r1 <= 0) goto L2
            java.lang.String r0 = "۠ۧۡ"
            goto L2
        L31:
            boolean r0 = androidx.core.p007.C0089.m617(r3, r4)
            goto L14
        L36:
            int r0 = com.cloudinject.feature.p023.C0335.m2923()
            if (r0 < 0) goto L3f
            java.lang.String r0 = "ۣ۟ۨ"
            goto L2
        L3f:
            java.lang.String r0 = "ۣۤۢ"
            goto L2
        L42:
            int r1 = com.px.C0368.m3171()
            if (r1 < 0) goto L4c
            com.cloudinject.feature.model.p014.C0191.m1627()
            goto L2
        L4c:
            java.lang.String r0 = "ۡۦ"
            goto L2
        L4f:
            int r1 = mirrorb.android.accounts.C0376.m4906()
            if (r1 <= 0) goto L2
            java.lang.String r0 = "۟ۥ۟"
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1131(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0002 A[SYNTHETIC] */
    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1132(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "۠ۡۤ"
        L2:
            int r1 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r2 = 1746695(0x1aa707, float:2.447641E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 3076: goto Le;
                case 4352: goto L1d;
                case 5191: goto L3b;
                case 7521: goto L24;
                case 28206: goto L38;
                case 28301: goto L3e;
                case 1735612: goto L22;
                case 1735672: goto L26;
                default: goto Ld;
            }
        Ld:
            goto L2
        Le:
            boolean r1 = com.cloudinject.core.p009.p012.C0164.m1364(r3)
            if (r1 == 0) goto L3e
            int r1 = mirrorb.android.util.C0393.m5668()
            if (r1 <= 0) goto L2
            java.lang.String r0 = "ۦۡ"
            goto L2
        L1d:
            boolean r0 = mirrorb.android.content.C0380.m5096(r4, r3)
        L21:
            return r0
        L22:
            r0 = 1
            goto L21
        L24:
            r0 = 0
            goto L21
        L26:
            boolean r0 = com.cloudinject.core.p009.p012.C0164.m1364(r4)
            if (r0 == 0) goto L3b
            int r0 = mirrorb.android.accounts.C0376.m4906()
            if (r0 > 0) goto L35
            java.lang.String r0 = "۠ۧۦ"
            goto L2
        L35:
            java.lang.String r0 = "ۤۤۦ"
            goto L2
        L38:
            java.lang.String r0 = "۠ۡۤ"
            goto L2
        L3b:
            java.lang.String r0 = "ۣۣ۟"
            goto L2
        L3e:
            int r1 = android.net.C0082.m410()
            if (r1 >= 0) goto L2
            java.lang.String r0 = "ۨۧ"
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1132(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0005 A[SYNTHETIC] */
    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> boolean m1133(T[] r6) {
        /*
            r2 = 0
            java.lang.String r0 = "ۢۢۦ"
            r1 = r2
            r3 = r2
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1751647(0x1aba5f, float:2.45458E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 2008: goto L11;
                case 2297: goto L12;
                case 3127: goto L78;
                case 3188: goto L81;
                case 5369: goto L66;
                case 5405: goto L4d;
                case 5469: goto L44;
                case 5575: goto L75;
                case 29629: goto L81;
                case 30745: goto L38;
                case 31637: goto L1d;
                case 31705: goto L72;
                case 32664: goto L29;
                case 1728928: goto L72;
                case 1730215: goto L57;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            return r3
        L12:
            if (r6 == 0) goto L72
            int r4 = com.sadfxg.fasg.C0369.m3256()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۨ۠"
            goto L5
        L1d:
            int r3 = android.net.C0082.m410()
            if (r3 < 0) goto L25
            r3 = r2
            goto L5
        L25:
            java.lang.String r0 = "ۦۧۧ"
            r3 = r2
            goto L5
        L29:
            int r3 = mirrorb.com.android.internal.app.C0394.m5672()
            if (r3 > 0) goto L34
            androidx.core.p007.C0088.m573()
            r3 = r1
            goto L5
        L34:
            java.lang.String r0 = "ۥ۟ۡ"
            r3 = r1
            goto L5
        L38:
            int r0 = android.net.C0082.m410()
            if (r0 < 0) goto L41
            java.lang.String r0 = "ۢۡ۟"
            goto L5
        L41:
            java.lang.String r0 = "ۣ۠ۨ"
            goto L5
        L44:
            int r4 = mirrorb.android.hardware.fingerprint.C0382.m5180()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۦۡۡ"
            goto L5
        L4d:
            r1 = 1
            int r4 = androidx.core.p007.C0089.m592()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۧۥۥ"
            goto L5
        L57:
            int r4 = r6.length
            if (r4 != 0) goto L78
            int r0 = com.px.C0368.m3171()
            if (r0 < 0) goto L63
            java.lang.String r0 = "ۡۨۥ"
            goto L5
        L63:
            java.lang.String r0 = "ۣۡۤ"
            goto L5
        L66:
            int r0 = mirrorb.android.content.C0380.m5068()
            if (r0 > 0) goto L6f
            java.lang.String r0 = "ۣۧۧ"
            goto L5
        L6f:
            java.lang.String r0 = "ۦۣۧ"
            goto L5
        L72:
            java.lang.String r0 = "ۡۥۦ"
            goto L5
        L75:
            java.lang.String r0 = "ۢۢۦ"
            goto L5
        L78:
            int r4 = android.net.wifi.C0078.m361()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۡ۠ۥ"
            goto L5
        L81:
            java.lang.String r0 = "ۥ۟ۡ"
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1133(java.lang.Object[]):boolean");
    }

    /* renamed from: ̗̖̖̗, reason: not valid java name and contains not printable characters */
    public static int m1134(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0005 A[SYNTHETIC] */
    /* renamed from: ̗̖̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1135(java.lang.CharSequence r6) {
        /*
            r2 = 0
            java.lang.String r0 = "ۦۣۡ"
            r1 = r2
            r3 = r2
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1752487(0x1abda7, float:2.455757E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 98: goto L11;
                case 3717: goto L85;
                case 4069: goto L48;
                case 5984: goto L11;
                case 6784: goto L62;
                case 29763: goto L2a;
                case 29807: goto La0;
                case 30016: goto L6b;
                case 30756: goto L96;
                case 30925: goto L75;
                case 31744: goto L96;
                case 31791: goto L3d;
                case 31936: goto L39;
                case 1728895: goto L51;
                case 1728935: goto L1b;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            int r4 = mirrorb.android.hardware.fingerprint.C0382.m5180()
            if (r4 > 0) goto L82
            com.cloudinject.feature.model.p014.C0191.m1627()
            goto L5
        L1b:
            int r0 = android.arch.p003.p005.C0060.m216()
            if (r0 > 0) goto L27
            mirrorb.android.hardware.fingerprint.C0382.m5180()
            java.lang.String r0 = "ۦۢ۟"
            goto L5
        L27:
            java.lang.String r0 = "ۦ۠ۡ"
            goto L5
        L2a:
            int r0 = mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            if (r0 < 0) goto L36
            mirrorb.android.net.wifi.C0388.m5430()
            java.lang.String r0 = "ۨۢۧ"
            goto L5
        L36:
            java.lang.String r0 = "ۦۣۢ"
            goto L5
        L39:
            java.lang.String r0 = "ۢ۟۟"
            r3 = r2
            goto L5
        L3d:
            if (r6 == 0) goto L96
            int r4 = mirrorb.android.content.res.C0379.m5056()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "۟۠ۨ"
            goto L5
        L48:
            int r4 = com.sadfxg.fasg.C0369.m3256()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "۠۟ۦ"
            goto L5
        L51:
            int r0 = mirrorb.android.net.wifi.C0387.m5374()
            if (r0 < 0) goto L5e
            com.cloudinject.p025.p026.C0346.m3059()
            java.lang.String r0 = "ۣۤ۠"
            r3 = r1
            goto L5
        L5e:
            java.lang.String r0 = "ۨۧۧ"
            r3 = r1
            goto L5
        L62:
            int r0 = com.cloudinject.feature.p023.C0335.m2935(r6)
            if (r0 != 0) goto L85
            java.lang.String r0 = "ۨۨۤ"
            goto L5
        L6b:
            r1 = 1
            int r4 = mirrorb.android.net.wifi.C0387.m5374()
            if (r4 >= 0) goto L5
            java.lang.String r0 = "ۧ۟"
            goto L5
        L75:
            int r4 = mirrorb.android.providers.C0391.m5571()
            if (r4 > 0) goto L7f
            mirrorb.com.android.internal.view.C0397.m5814()
            goto L5
        L7f:
            java.lang.String r0 = "ۦۣۡ"
            goto L5
        L82:
            java.lang.String r0 = "ۨۧۧ"
            goto L5
        L85:
            int r0 = com.cloudinject.feature.p018.C0228.m2012()
            if (r0 > 0) goto L92
            com.cloudinject.customview.C0183.m1464()
            java.lang.String r0 = "ۣۨۧ"
            goto L5
        L92:
            java.lang.String r0 = "۠۠"
            goto L5
        L96:
            int r4 = mirrorb.com.android.internal.app.C0394.m5672()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۨ۠۟"
            goto L5
        La0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1135(java.lang.CharSequence):boolean");
    }

    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    public static int m1136(SparseIntArray sparseIntArray) {
        return C0060.m206(sparseIntArray);
    }

    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    public static int m1137(Collection<?> collection) {
        return C0387.m5382(collection);
    }

    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    public static int m1138(Map<?, ?> map) {
        return C0082.m413(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    public static <E> E m1139(List<E> list) {
        String str = "ۨۢ۠";
        Object objM3273 = 0;
        E e = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747874) {
                case 1080:
                case 7620:
                    str = "ۨۦۥ";
                    continue;
                case 5732:
                    if (C0291.m2568() < 0) {
                        str = "ۦۢۨ";
                    } else {
                        continue;
                    }
                case 7461:
                    break;
                case 7463:
                    if (C0388.m5430() <= 0) {
                        e = objM3273;
                    } else {
                        str = "ۨۦۥ";
                        e = objM3273;
                        continue;
                    }
                case 25093:
                    return e;
                case 25220:
                    if (C0387.m5382(list) >= 2) {
                        break;
                    } else if (C0393.m5668() <= 0) {
                        C0384.m5278();
                    } else {
                        str = "ۥۡۢ";
                    }
                case 25317:
                    if (C0191.m1627() < 0) {
                        str = "ۨۢ۠";
                    } else {
                        continue;
                    }
                case 27150:
                    if (C0191.m1627() >= 0) {
                        C0378.m4998();
                        e = null;
                    } else {
                        str = "ۦ۟۠";
                        e = null;
                        continue;
                    }
                case 27238:
                    objM3273 = C0370.m3273(list, 1);
                    if (C0397.m5814() <= 0) {
                        C0388.m5430();
                    } else {
                        str = "ۣۣۥ";
                        continue;
                    }
                case 27365:
                    if (C0379.m5056() <= 0) {
                        C0089.m592();
                    } else {
                        str = "ۡۨۡ";
                        continue;
                    }
            }
            str = "ۦۣۡ";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0002 A[SYNTHETIC] */
    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m1140(int r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "ۤۧۨ"
        L2:
            int r1 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r2 = 1747836(0x1aab7c, float:2.44924E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 1277: goto Le;
                case 3079: goto L3f;
                case 4537: goto L17;
                case 6427: goto L26;
                case 6462: goto L44;
                case 25204: goto L35;
                case 25517: goto L44;
                case 26909: goto L4d;
                case 28274: goto L56;
                default: goto Ld;
            }
        Ld:
            goto L2
        Le:
            int r1 = mirrorb.android.content.C0380.m5091(r4)
            if (r3 <= r1) goto L4d
            java.lang.String r0 = "ۢ۠ۥ"
            goto L2
        L17:
            if (r4 == 0) goto L44
            int r1 = com.sadfxg.fasg.C0369.m3256()
            if (r1 > 0) goto L23
            com.cloudinject.p025.C0362.m3122()
            goto L2
        L23:
            java.lang.String r0 = "ۡۧۧ"
            goto L2
        L26:
            int r0 = androidx.core.graphics.drawable.C0086.m500()
            if (r0 > 0) goto L32
            com.cloudinject.customview.C0183.m1464()
            java.lang.String r0 = "ۣۢ۟"
            goto L2
        L32:
            java.lang.String r0 = "ۢ۟۟"
            goto L2
        L35:
            r0 = 0
            int r0 = com.cloudinject.feature.p021.C0291.m2564(r0, r3)
            java.lang.String r0 = android.database.C0074.m311(r4, r0)
        L3e:
            return r0
        L3f:
            java.lang.String r0 = mirrorb.android.hardware.location.C0383.m5220()
            goto L3e
        L44:
            int r1 = com.cloudinject.core.p009.p012.C0164.m1359()
            if (r1 >= 0) goto L2
            java.lang.String r0 = "ۣ۟۟"
            goto L2
        L4d:
            int r1 = android.database.C0073.m265()
            if (r1 <= 0) goto L2
            java.lang.String r0 = "ۨۡۡ"
            goto L2
        L56:
            int r0 = com.cloudinject.core.p009.p011.C0155.m1294()
            if (r0 < 0) goto L5f
            java.lang.String r0 = "ۣۥۣ"
            goto L2
        L5f:
            java.lang.String r0 = "ۤۧۨ"
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1140(int, java.lang.String):java.lang.String");
    }

    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    public static <E> List<E> m1141(AbstractC0132<E> abstractC0132, List<E> list) {
        String str = "ۥۣ۠";
        int i = 0;
        int i2 = 0;
        int iM5932 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753539) {
                case 72:
                    if (C0370.m3284() >= 0) {
                        C0164.m1359();
                    } else {
                        str = "ۧۧ۠";
                        continue;
                    }
                case 1987:
                case 30603:
                    if (C0279.m2491() < 0) {
                        str = "ۤۥۤ";
                    } else {
                        continue;
                    }
                case 27234:
                    break;
                case 28249:
                    str = "ۥۣ۠";
                    continue;
                case 28322:
                    if (!C0368.m3182(abstractC0132, C0370.m3273(list, i2))) {
                        break;
                    } else {
                        str = C0083.m448() >= 0 ? "ۦۥۨ" : "ۥۢۧ";
                    }
                case 30425:
                    if (C0191.m1627() >= 0) {
                        i2 = 0;
                    } else {
                        str = "ۤۥۤ";
                        i2 = 0;
                        continue;
                    }
                case 30469:
                    return C0369.m3255(i2, list);
                case 30671:
                    if (C0083.m448() < 0) {
                        str = "ۣۨ۟";
                    } else {
                        continue;
                    }
                case 31552:
                    if (i2 >= iM5932) {
                        break;
                    } else {
                        str = "ۡۦۦ";
                    }
                case 31652:
                    if (C0384.m5278() <= 0) {
                        C0184.m1524();
                        i2 = i;
                    } else {
                        str = "ۦۡۦ";
                        i2 = i;
                        continue;
                    }
                case 31785:
                    i = 0 - ((0 - i2) - 1);
                    if (C0346.m3059() >= 0) {
                        C0385.m5282();
                        str = "ۨۤۢ";
                    } else {
                        str = "ۤۤۧ";
                        continue;
                    }
                case 31851:
                    iM5932 = C0400.m5932(list);
                    str = "ۣ۟ۨ";
                    continue;
            }
            str = "ۣۥۨ";
        }
    }

    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    public static <T> List<T> m1142(List<T> list, List<T> list2) {
        String str = "ۣۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747777) {
                case 4605:
                    if (C0377.m4944() > 0) {
                        str = "ۣۡ";
                        break;
                    } else {
                        C0376.m4906();
                        break;
                    }
                case 1734499:
                    return C0164.m1379(new C0124(), list, list2);
            }
        }
    }

    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    public static List<Long> m1143(long[] jArr) {
        String str = "ۨۤۢ";
        int i = 0;
        int length = 0;
        ArrayList arrayList = null;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750533) {
                case 45:
                    str = "ۣ۠";
                    continue;
                case 254:
                    break;
                case 1248:
                    return arrayList;
                case 1336:
                    if (C0379.m5056() <= 0) {
                        i = 0;
                    } else {
                        str = "ۡۨۤ";
                        i = 0;
                        continue;
                    }
                case 2208:
                    if (C0183.m1502(jArr)) {
                        break;
                    } else {
                        str = C0376.m4906() <= 0 ? "ۤۢۤ" : "ۡۢۥ";
                    }
                case 4485:
                    C0184.m1513(arrayList, C0073.m260(jArr[i]));
                    str = "ۧ۠ۦ";
                    continue;
                case 6284:
                    if (C0394.m5672() > 0) {
                        str = "ۨۤۢ";
                    } else {
                        continue;
                    }
                case 6369:
                    length = jArr.length;
                    str = "ۦ۠ۦ";
                    continue;
                case 6552:
                    if (i >= length) {
                        break;
                    } else if (C0392.m5595() > 0) {
                        str = "ۣ۟ۤ";
                    }
                case 7513:
                case 1731078:
                    if (C0399.m5914() <= 0) {
                        str = "ۧۧۥ";
                    } else {
                        str = "ۡۨۤ";
                        continue;
                    }
                case 29480:
                    i2 = 1 - (0 - i);
                    if (C0083.m448() >= 0) {
                        str = "ۡ۟ۥ";
                    } else {
                        str = "ۦۦ۠";
                        continue;
                    }
                case 29733:
                    if (C0229.m2064() >= 0) {
                        str = "ۣۧۧ";
                        i = i2;
                    } else {
                        str = "ۣ۠ۥ";
                        i = i2;
                        continue;
                    }
                case 30569:
                    if (C0388.m5430() <= 0) {
                        str = "ۣۧۥ";
                    } else {
                        str = "ۢۧۢ";
                        continue;
                    }
                case 32611:
                    arrayList = new ArrayList();
                    str = "ۥۨۨ";
                    continue;
            }
            if (C0388.m5430() <= 0) {
                C0088.m573();
            } else {
                str = "ۢۤۧ";
            }
        }
    }

    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    public static boolean m1144(SparseArray<?> sparseArray) {
        String str = "ۡۢۡ";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750753) {
                case 1057:
                    str = "ۥ۠ۦ";
                    z = z2;
                    continue;
                case 1469:
                    break;
                case 2283:
                    str = "ۡۢۡ";
                    continue;
                case 2890:
                    if (C0375.m4840() >= 0) {
                        C0378.m4998();
                    } else {
                        str = "ۨۥۢ";
                        continue;
                    }
                case 3241:
                    if (C0291.m2568() >= 0) {
                        C0184.m1524();
                        z = false;
                    } else {
                        str = "۠ۧۢ";
                        z = false;
                        continue;
                    }
                case 4447:
                    str = "ۣۤۧ";
                    continue;
                case 4510:
                case 32612:
                    if (C0179.m1427() > 0) {
                        str = "۠ۧۢ";
                    } else {
                        continue;
                    }
                case 6145:
                    if (sparseArray != null) {
                        break;
                    } else if (C0399.m5914() <= 0) {
                        C0086.m500();
                    } else {
                        str = "ۨۦۧ";
                    }
                case 6591:
                    z2 = true;
                    if (C0009.m36() >= 0) {
                        C0191.m1627();
                    } else {
                        str = "ۣۢۡ";
                        continue;
                    }
                case 7514:
                    return z;
                case 32584:
                    if (C0397.m5793(sparseArray) != 0) {
                        break;
                    } else {
                        str = "ۡۦۣ";
                    }
            }
            str = C0025.m118() <= 0 ? "ۨ۠ۥ" : "۟ۥۤ";
        }
    }

    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    public static <T> boolean m1145(T[] tArr) {
        String str = "ۧۦ";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751498) {
                case 992:
                    break;
                case 1867:
                    if (C0191.m1627() >= 0) {
                        C0377.m4944();
                    } else {
                        str = "ۨ۠ۨ";
                        continue;
                    }
                case 3981:
                    if (C0382.m5180() <= 0) {
                        C0346.m3059();
                        z = z2;
                    } else {
                        str = "ۥۣۧ";
                        z = z2;
                        continue;
                    }
                case 5839:
                    if (C0392.m5595() <= 0) {
                        str = "ۦ۠ۤ";
                    } else {
                        str = "ۧۦ";
                        continue;
                    }
                case 5909:
                case 28986:
                    if (C0394.m5672() > 0) {
                        str = "ۧۤۧ";
                    } else {
                        continue;
                    }
                case 7760:
                    str = "ۧۤۧ";
                    z = false;
                    continue;
                case 30852:
                    str = "۟ۤ۟";
                    continue;
                case 31840:
                    return z;
                case 32748:
                    if (tArr.length <= 0) {
                        break;
                    } else if (C0379.m5056() <= 0) {
                        C0387.m5374();
                    } else {
                        str = "ۡۥ";
                    }
                case 1729813:
                    if (tArr == null) {
                        break;
                    } else if (C0396.m5741() >= 0) {
                        C0386.m5322();
                        str = "ۣۤ۠";
                    } else {
                        str = "ۧۨۧ";
                    }
                case 1730030:
                    z2 = true;
                    if (C0179.m1427() > 0) {
                        str = "ۣۡۥ";
                    } else {
                        continue;
                    }
            }
            str = "ۦ۟ۧ";
        }
    }

    /* renamed from: ̗̗̖, reason: not valid java name and contains not printable characters */
    public static boolean m1146(CharSequence charSequence) {
        String str = "۟۠";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749857) {
                case 93:
                case 6305:
                    str = "ۣۢۡ";
                    continue;
                case 1122:
                    if (C0375.m4840() >= 0) {
                        C0381.m5127();
                    } else {
                        str = "۟۠";
                        continue;
                    }
                case 1283:
                    return z;
                case 1502:
                    if (C0335.m2935(charSequence) <= 0) {
                        break;
                    } else {
                        str = "ۦۧۧ";
                    }
                case 3749:
                    if (C0082.m410() >= 0) {
                        C0368.m3171();
                        str = "ۣۢۧ";
                    } else {
                        str = "ۦۤۨ";
                        continue;
                    }
                case 3753:
                    break;
                case 5279:
                    if (C0382.m5180() <= 0) {
                        C0279.m2491();
                    } else {
                        str = "۠ۧۧ";
                        continue;
                    }
                case 7236:
                    if (C0368.m3171() >= 0) {
                        z = z2;
                    } else {
                        str = "۟ۧۦ";
                        z = z2;
                        continue;
                    }
                case 28967:
                    z2 = true;
                    if (C0229.m2064() < 0) {
                        str = "ۡۤۨ";
                    } else {
                        continue;
                    }
                case 29323:
                    str = "ۣۢۡ";
                    z = false;
                    continue;
                case 1730688:
                    if (charSequence == null) {
                        break;
                    } else if (C0088.m573() <= 0) {
                        C0369.m3256();
                    } else {
                        str = "ۣۥۡ";
                    }
            }
            if (C0390.m5512() > 0) {
                str = "ۥۡ۠";
            }
        }
    }

    /* renamed from: ̗̗̗, reason: not valid java name and contains not printable characters */
    public static int m1147(CharSequence charSequence) {
        String str = "ۣۡۡ";
        int iM2935 = 0;
        int i = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747929) {
                case 25:
                    if (C0291.m2568() < 0) {
                        str = "ۤ۟ۤ";
                    } else {
                        continue;
                    }
                case 1240:
                    str = "ۣۡ۟";
                    i = iM2935;
                    continue;
                case 1304:
                    if (C0393.m5668() <= 0) {
                        C0121.m1023();
                    } else {
                        str = "ۣۡۡ";
                        continue;
                    }
                case 1306:
                    if (charSequence != null) {
                        break;
                    } else if (C0382.m5180() <= 0) {
                        C0387.m5374();
                    } else {
                        str = "۠ۧۧ";
                    }
                case 1316:
                    return i;
                case 3327:
                case 27294:
                    if (C0377.m4944() <= 0) {
                        str = "ۣۧۧ";
                    } else {
                        str = "ۣۡ۟";
                        continue;
                    }
                case 4624:
                    if (C0397.m5814() <= 0) {
                        C0385.m5282();
                        i = 0;
                    } else {
                        str = "ۨۥ۠";
                        i = 0;
                        continue;
                    }
                case 25178:
                    if (C0420.m6215() < 0) {
                        str = "۟۠ۧ";
                    } else {
                        continue;
                    }
                case 25200:
                    iM2935 = C0335.m2935(charSequence);
                    str = "ۣۣۡ";
                    continue;
                case 28124:
                    break;
            }
            if (C0089.m592() <= 0) {
                C0370.m3284();
            } else {
                str = "ۨۦۧ";
            }
        }
    }

    /* renamed from: ̗̗̙, reason: not valid java name and contains not printable characters */
    public static int m1148(CharSequence charSequence) {
        return C0396.m5754(charSequence);
    }

    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    public static int m1149(SparseArray<?> sparseArray) {
        String str = "ۦۢۤ";
        int iM5793 = 0;
        int i = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56450) {
                case 1709162:
                case 1728871:
                    if (C0376.m4906() <= 0) {
                        str = "ۡ۟ۨ";
                    } else {
                        str = "ۤۡۦ";
                        continue;
                    }
                case 1709167:
                    iM5793 = C0397.m5793(sparseArray);
                    if (C0291.m2568() >= 0) {
                        C0376.m4906();
                    } else {
                        str = "ۦۥۨ";
                        continue;
                    }
                case 1709405:
                    if (C0420.m6215() >= 0) {
                        i = 0;
                    } else {
                        str = "۟ۨۡ";
                        i = 0;
                        continue;
                    }
                case 1710476:
                    break;
                case 1711402:
                    if (sparseArray != null) {
                        break;
                    } else {
                        str = "ۣۧ۟";
                    }
                case 1711755:
                    str = "ۤۡۦ";
                    i = iM5793;
                    continue;
                case 1730187:
                    return i;
                case 1731193:
                    str = "ۨۨ۟";
                    continue;
                case 1732193:
                    str = "ۦۢۤ";
                    continue;
                case 1733786:
                    if (C0083.m448() < 0) {
                        str = "ۨ۠۠";
                    } else {
                        continue;
                    }
            }
            str = "ۨ۠ۥ";
        }
    }

    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    public static <T> int m1150(T[] tArr) {
        String str = "ۨ۠ۥ";
        int length = 0;
        int i = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56420) {
                case 36:
                    return i;
                case 1709193:
                    if (tArr != null) {
                        break;
                    } else {
                        str = "ۥۡۤ";
                    }
                case 1710409:
                    length = tArr.length;
                    str = "ۦۤۤ";
                    continue;
                case 1711490:
                    if (C0376.m4906() <= 0) {
                        i = length;
                    } else {
                        str = "ۢۢ";
                        i = length;
                        continue;
                    }
                case 1711649:
                case 1733433:
                    if (C0387.m5374() < 0) {
                        str = "ۢۢ";
                    } else {
                        continue;
                    }
                case 1728940:
                    str = "ۣۧۡ";
                    continue;
                case 1730114:
                    str = "ۨ۠ۥ";
                    continue;
                case 1730244:
                    break;
                case 1731225:
                    str = "۠ۧۨ";
                    i = 0;
                    continue;
                case 1734565:
                    if (C0377.m4944() > 0) {
                        str = "ۦۧۦ";
                    } else {
                        continue;
                    }
            }
            if (C0385.m5282() >= 0) {
                C0089.m592();
            } else {
                str = "ۧ۠ۦ";
            }
        }
    }

    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    public static <E> E m1151(Collection<E> collection) {
        String str = "ۥ۠ۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755623) {
                case 3032:
                    break;
                case 3170:
                    return null;
                case 3247:
                    return (E) C0398.m5850(C0391.m5543(collection));
                case 28683:
                    str = "ۥ۠ۤ";
                    continue;
                case 29774:
                    if (!C0089.m623(collection)) {
                        break;
                    } else {
                        str = "ۣۧۡ";
                    }
            }
            if (C0228.m2012() > 0) {
                str = "ۧۡۢ";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    public static <E> E m1152(List<E> list) {
        String str = "۠ۧ";
        Object objM3273 = 0;
        E e = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747808) {
                case 4359:
                case 27340:
                    if (C0378.m4998() <= 0) {
                        str = "۟ۦۢ";
                    } else {
                        str = "ۨۨۥ";
                        continue;
                    }
                case 4773:
                    if (C0377.m4944() <= 0) {
                        str = "ۥۧۢ";
                        e = null;
                    } else {
                        str = "ۥۣۥ";
                        e = null;
                        continue;
                    }
                case 5479:
                    str = "ۦۢۨ";
                    continue;
                case 25091:
                    if (C0082.m410() < 0) {
                        str = "۠ۧ";
                    } else {
                        continue;
                    }
                case 25096:
                    if (C0164.m1359() >= 0) {
                        C0060.m216();
                    } else {
                        str = "ۤ۟۠";
                        continue;
                    }
                case 25221:
                    return e;
                case 25515:
                    break;
                case 27175:
                    objM3273 = C0370.m3273(list, C0089.m615(list));
                    str = "ۤۡ";
                    continue;
                case 1734429:
                    str = "ۨۨۥ";
                    e = objM3273;
                    continue;
                case 1734503:
                    if (!C0089.m623(list)) {
                        break;
                    } else if (C0089.m592() <= 0) {
                        C0025.m118();
                    } else {
                        str = "ۨۤۤ";
                    }
            }
            str = "ۦ۟۠";
        }
    }

    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    public static List<Pair<Integer, Integer>> m1153(SparseIntArray sparseIntArray) {
        String str = "ۢ۟ۡ";
        int i = 0;
        ArrayList arrayList = null;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56570) {
                case 132:
                    if (C0390.m5512() <= 0) {
                        C0377.m4944();
                        str = "ۢ۠ۧ";
                    } else {
                        str = "ۣۤۥ";
                        continue;
                    }
                case 1710582:
                    if (C0383.m5203() <= 0) {
                        str = "ۣۢۨ";
                        i = 0;
                    } else {
                        str = "ۣۤۢ";
                        i = 0;
                        continue;
                    }
                case 1710814:
                    break;
                case 1711833:
                    if (C0183.m1464() <= 0) {
                        C0396.m5741();
                    } else {
                        str = "ۢ۟ۡ";
                        continue;
                    }
                case 1728860:
                case 1730236:
                    str = "ۣۤۢ";
                    continue;
                case 1730205:
                    if (C0396.m5717(sparseIntArray)) {
                        break;
                    } else if (C0179.m1427() <= 0) {
                        C0164.m1359();
                    } else {
                        str = "ۡۧ۟";
                    }
                case 1730233:
                    if (i >= C0381.m5117(sparseIntArray)) {
                        break;
                    } else if (C0392.m5595() > 0) {
                        str = "ۣۤ۠";
                    }
                case 1731173:
                    C0184.m1513(arrayList, C0228.m1988(C0078.m339(C0399.m5897(sparseIntArray, i)), C0078.m339(C0368.m3175(sparseIntArray, i))));
                    if (C0379.m5056() <= 0) {
                        str = "ۧۡۢ";
                    } else {
                        str = "۠ۢ۟";
                        continue;
                    }
                case 1732286:
                    arrayList = new ArrayList();
                    if (C0228.m2012() <= 0) {
                        C0009.m36();
                    } else {
                        str = "ۤۤۧ";
                        continue;
                    }
                case 1733507:
                    if (C0420.m6215() < 0) {
                        str = "ۧ۟ۤ";
                    } else {
                        continue;
                    }
                case 1733624:
                    return arrayList;
                case 1734587:
                    if (C0384.m5278() <= 0) {
                        C0375.m4840();
                        i = i2;
                    } else {
                        str = "ۤۢ";
                        i = i2;
                        continue;
                    }
                case 1734631:
                    i2 = ((i + 20) + 1) - 20;
                    if (C0369.m3256() <= 0) {
                        str = "ۣۨۢ";
                    } else {
                        str = "ۣ۠ۤ";
                        continue;
                    }
            }
            if (C0089.m592() <= 0) {
                C0164.m1359();
            } else {
                str = "ۣۡۤ";
            }
        }
    }

    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    public static <E> List<E> m1154(AbstractC0132<E> abstractC0132, List<E> list) {
        String str = "ۨۡۥ";
        int i = 0;
        int i2 = 0;
        int iM5932 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755590) {
                case 141:
                    return C0398.m5863(iM5932, list);
                case 202:
                    iM5932 = C0400.m5932(list);
                    str = "ۦۤۡ";
                    continue;
                case 2085:
                    if (C0383.m5203() <= 0) {
                        C0370.m3284();
                    } else {
                        str = "ۦۢۧ";
                        continue;
                    }
                case 2157:
                    if (C0088.m573() <= 0) {
                        i2 = 0;
                    } else {
                        str = "ۥۨۡ";
                        i2 = 0;
                        continue;
                    }
                case 3311:
                    if (!C0368.m3182(abstractC0132, C0370.m3273(list, i2))) {
                        break;
                    } else {
                        str = "ۣۡۡ";
                    }
                case 25245:
                    str = "ۤ۟ۨ";
                    continue;
                case 26373:
                    i = i2 + 1;
                    if (C0399.m5914() <= 0) {
                        C0387.m5374();
                        str = "ۡۢۧ";
                    } else {
                        str = "ۣۤۧ";
                        continue;
                    }
                case 28292:
                case 28683:
                    str = "ۥۨۡ";
                    continue;
                case 29582:
                    if (C0370.m3284() >= 0) {
                        C0121.m1023();
                        i2 = i;
                    } else {
                        str = "۠ۤ۟";
                        i2 = i;
                        continue;
                    }
                case 30552:
                    if (i2 >= iM5932) {
                        break;
                    } else {
                        str = "ۧ۠ۢ";
                    }
                case 31585:
                    break;
                case 1709507:
                    if (C0368.m3171() >= 0) {
                        str = "ۡۥۣ";
                    } else {
                        str = "ۨۡۥ";
                        continue;
                    }
            }
            str = "ۣۨۦ";
        }
    }

    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    public static <T> List<T> m1155(List<T> list, List<T> list2) {
        String str = "ۥۤۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754595) {
                case 31686:
                    return C0009.m35(new C0135(), list, list2);
                case 1710524:
                    if (C0376.m4906() > 0) {
                        str = "ۥۤۤ";
                        break;
                    } else {
                        C0335.m2923();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̙̖, reason: not valid java name and contains not printable characters */
    public static int[] m1156(int[] iArr) {
        int[] iArr2 = null;
        String str = "ۣۨ";
        int[] iArr3 = null;
        int[] iArr4 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748773) {
                case 1157:
                    if (C0121.m1023() >= 0) {
                        iArr3 = iArr2;
                    } else {
                        str = "ۥۡۨ";
                        iArr3 = iArr2;
                        continue;
                    }
                case 2303:
                    if (C0183.m1464() <= 0) {
                        str = "ۦۧۡ";
                        iArr3 = iArr4;
                    } else {
                        str = "ۥۥۨ";
                        iArr3 = iArr4;
                        continue;
                    }
                case 4461:
                    if (iArr4 != null) {
                        break;
                    } else if (C0393.m5668() <= 0) {
                        C0082.m410();
                        str = "ۨ۟ۢ";
                    } else {
                        str = "ۢۤ۠";
                    }
                case 4841:
                    return iArr3;
                case 7495:
                    break;
                case 7675:
                    iArr2 = new int[0];
                    if (C0334.m2866() <= 0) {
                        str = "ۣۣ۠";
                    } else {
                        str = "۠ۦۦ";
                        continue;
                    }
                case 1733412:
                    if (C0377.m4944() <= 0) {
                        C0387.m5374();
                    } else {
                        str = "ۣۨ";
                        continue;
                    }
                case 1733440:
                    str = "۟ۦۡ";
                    iArr4 = iArr;
                    continue;
            }
            str = C0385.m5282() >= 0 ? "ۨۧۢ" : "ۥۡۨ";
        }
    }

    /* renamed from: ̗̙̗, reason: not valid java name and contains not printable characters */
    public static String m1157(String str) {
        String strM5220 = null;
        String str2 = "ۦۥ۟";
        String str3 = null;
        String str4 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755624) {
                case 2955:
                    if (C0383.m5203() <= 0) {
                        C0335.m2923();
                        str3 = strM5220;
                    } else {
                        str2 = "ۣ۠۠";
                        str3 = strM5220;
                        continue;
                    }
                case 3048:
                    str2 = "ۥۦۧ";
                    str4 = str;
                    continue;
                case 25352:
                    str2 = "ۦۥ۟";
                    continue;
                case 29452:
                    break;
                case 29551:
                    strM5220 = C0383.m5220();
                    if (C0279.m2491() >= 0) {
                        C0083.m448();
                    } else {
                        str2 = "ۦۨۥ";
                        continue;
                    }
                case 30606:
                    if (C0386.m5322() <= 0) {
                        str3 = str4;
                    } else {
                        str2 = "ۣۣ۟";
                        str3 = str4;
                        continue;
                    }
                case 32715:
                    return str3;
                case 32751:
                    if (str4 != null) {
                        break;
                    } else if (C0346.m3059() >= 0) {
                        C0334.m2866();
                        str2 = "ۨۧۧ";
                    } else {
                        str2 = "ۤۥۨ";
                    }
            }
            if (C0400.m5961() > 0) {
                str2 = "ۣ۠۠";
            }
        }
    }

    /* renamed from: ̗̙̙, reason: not valid java name and contains not printable characters */
    public static String m1158(String str) {
        String strM5220 = null;
        String str2 = "ۥۢۡ";
        String str3 = null;
        String str4 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753606) {
                case 2762:
                    if (C0164.m1359() >= 0) {
                        C0086.m500();
                        str3 = str4;
                    } else {
                        str2 = "ۨۥۦ";
                        str3 = str4;
                        continue;
                    }
                case 2959:
                    if (str4 != null) {
                        break;
                    } else {
                        str2 = "ۣۨۦ";
                    }
                case 26881:
                    if (C0155.m1294() >= 0) {
                        str3 = strM5220;
                    } else {
                        str2 = "۠ۨۧ";
                        str3 = strM5220;
                        continue;
                    }
                case 27097:
                    return str3;
                case 29709:
                    break;
                case 29859:
                    if (C0088.m573() > 0) {
                        str2 = "ۥۢۡ";
                    } else {
                        continue;
                    }
                case 29991:
                    strM5220 = C0383.m5220();
                    str2 = "۠ۡۨ";
                    continue;
                case 32738:
                    str2 = "ۣۨ۟";
                    str4 = str;
                    continue;
            }
            if (C0074.m307() < 0) {
                str2 = "۠ۨۧ";
            }
        }
    }

    /* renamed from: ̗̙̙, reason: not valid java name and contains not printable characters */
    public static <T> List<T> m1159(T t) {
        return C0384.m5252(t);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00de A[SYNTHETIC] */
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <E> int m1160(com.cloudinject.core.utils.AbstractC0132<E> r9, java.util.List<E> r10) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1160(com.cloudinject.core.utils.̗̗̗, java.util.List):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0006 A[SYNTHETIC] */
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <K, V> V m1161(K r6, java.util.List<android.util.Pair<K, V>> r7) {
        /*
            r3 = 0
            java.lang.String r0 = "ۣۧۥ"
            r1 = r0
            r2 = r3
            r4 = r3
        L6:
            int r0 = mirrorb.com.android.internal.content.C0395.m5690(r1)
            r5 = 1752738(0x1abea2, float:2.456109E-39)
            r0 = r0 ^ r5
            switch(r0) {
                case 2077: goto L12;
                case 2243: goto L44;
                case 2269: goto L73;
                case 5812: goto L6f;
                case 30503: goto L30;
                case 31531: goto L1c;
                case 31694: goto L57;
                case 1729190: goto L65;
                case 1729254: goto L40;
                case 1729858: goto L45;
                default: goto L11;
            }
        L11:
            goto L6
        L12:
            boolean r0 = mirrorb.com.android.internal.C0398.m5858(r4)
            if (r0 == 0) goto L6f
            java.lang.String r0 = "۟۟"
            r1 = r0
            goto L6
        L1c:
            boolean r0 = androidx.core.p007.C0089.m623(r7)
            if (r0 != 0) goto L6f
            int r0 = mirrorb.android.hardware.fingerprint.C0381.m5127()
            if (r0 > 0) goto L2c
            java.lang.String r0 = "ۤۨ۠"
            r1 = r0
            goto L6
        L2c:
            java.lang.String r0 = "ۧۢۧ"
            r1 = r0
            goto L6
        L30:
            java.lang.Object r0 = mirrorb.java.lang.C0400.m5963(r2)
            if (r6 != r0) goto L65
            int r0 = mirrorb.android.net.wifi.C0387.m5374()
            if (r0 >= 0) goto L6
            java.lang.String r0 = "ۢۦ"
            r1 = r0
            goto L6
        L40:
            java.lang.Object r3 = mirrorb.dalvik.system.C0399.m5884(r2)
        L44:
            return r3
        L45:
            java.lang.Object r0 = mirrorb.com.android.internal.C0398.m5850(r4)
            android.util.Pair r0 = (android.util.Pair) r0
            int r2 = android.net.C0083.m448()
            if (r2 < 0) goto L53
            r2 = r0
            goto L6
        L53:
            java.lang.String r1 = "ۨۥۢ"
            r2 = r0
            goto L6
        L57:
            java.util.Iterator r4 = androidx.core.p007.C0088.m554(r7)
            int r0 = com.cloudinject.core.utils.compat.C0121.m1023()
            if (r0 >= 0) goto L6
            java.lang.String r0 = "ۣۥۡ"
            r1 = r0
            goto L6
        L65:
            int r0 = android.database.C0074.m307()
            if (r0 >= 0) goto L6
            java.lang.String r0 = "ۣۥۡ"
            r1 = r0
            goto L6
        L6f:
            java.lang.String r0 = "ۣۢ۠"
            r1 = r0
            goto L6
        L73:
            int r0 = com.cloudinject.core.p013.C0179.m1427()
            if (r0 > 0) goto L7d
            com.cloudinject.feature.p018.C0228.m2012()
            goto L6
        L7d:
            java.lang.String r0 = "ۣۧۥ"
            r1 = r0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1161(java.lang.Object, java.util.List):java.lang.Object");
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public static <E> LinkedList<E> m1162(LinkedList<E> linkedList) {
        LinkedList<E> linkedList2 = null;
        String str = "ۧۡۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748861) {
                case 1251:
                    if (C0368.m3171() >= 0) {
                        C0362.m3122();
                        str = "ۤۥۡ";
                    } else {
                        str = "ۧۡۨ";
                        continue;
                    }
                case 1465:
                    return linkedList;
                case 27187:
                    if (!C0089.m623(linkedList)) {
                        break;
                    } else {
                        str = "ۣ۠۟";
                    }
                case 27251:
                    linkedList2 = new LinkedList<>(linkedList);
                    if (C0206.m1807() >= 0) {
                        str = "ۦۥۣ";
                    } else {
                        str = "ۣۤ";
                        continue;
                    }
                case 27295:
                    return linkedList2;
                case 28182:
                    break;
                case 1733404:
                    C0392.m5608(linkedList2);
                    if (C0375.m4840() < 0) {
                        str = "ۧۦۡ";
                    } else {
                        continue;
                    }
            }
            str = "ۧ۟ۦ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006e A[SYNTHETIC] */
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <E> java.util.List<E> m1163(int r4, java.util.List<E> r5) {
        /*
            r1 = 0
            java.lang.String r0 = "ۣۤ۟"
        L3:
            int r2 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r3 = 1755465(0x1ac949, float:2.45993E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 3242: goto Lf;
                case 3266: goto L5f;
                case 3927: goto L2c;
                case 26540: goto L78;
                case 28801: goto L4e;
                case 29825: goto L68;
                case 29871: goto L3f;
                case 30676: goto L29;
                case 31624: goto L75;
                case 1709129: goto L75;
                default: goto Le;
            }
        Le:
            goto L3
        Lf:
            r2 = 0
            int r2 = com.cloudinject.feature.p021.C0291.m2564(r2, r4)
            int r3 = mirrorb.java.lang.C0400.m5932(r5)
            java.util.List r2 = mirrorb.android.accounts.C0375.m4862(r5, r2, r3)
            com.cloudinject.feature.model.p014.C0191.m1655(r1, r2)
            int r2 = androidx.core.graphics.drawable.C0086.m500()
            if (r2 > 0) goto L5c
            androidx.core.p007.C0089.m592()
            goto L3
        L29:
            java.lang.String r0 = "ۨۨ"
            goto L3
        L2c:
            int r2 = mirrorb.java.lang.C0400.m5932(r5)
            if (r4 <= r2) goto L68
            int r2 = mirrorb.android.net.wifi.C0387.m5374()
            if (r2 < 0) goto L3c
            com.cloudinject.feature.p018.C0228.m2012()
            goto L3
        L3c:
            java.lang.String r0 = "ۥۨ۠"
            goto L3
        L3f:
            if (r5 == 0) goto L75
            int r2 = android.database.C0074.m307()
            if (r2 < 0) goto L4b
            com.cloudinject.feature.model.p014.C0191.m1627()
            goto L3
        L4b:
            java.lang.String r0 = "ۧۨ۟"
            goto L3
        L4e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = com.cloudinject.core.p009.p011.C0155.m1294()
            if (r2 >= 0) goto L3
            java.lang.String r0 = "ۥۣۢ"
            goto L3
        L5c:
            java.lang.String r0 = "ۡۢۦ"
            goto L3
        L5f:
            int r2 = mirrorb.android.location.C0385.m5282()
            if (r2 >= 0) goto L3
            java.lang.String r0 = "ۣۤ۟"
            goto L3
        L68:
            int r2 = mirrorb.android.hardware.fingerprint.C0381.m5127()
            if (r2 > 0) goto L72
            mirrorb.android.net.wifi.C0388.m5430()
            goto L3
        L72:
            java.lang.String r0 = "ۧۦۢ"
            goto L3
        L75:
            java.lang.String r0 = "ۡۢۦ"
            goto L3
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1163(int, java.util.List):java.util.List");
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public static <T> List<T> m1164(AbstractC0137<T> abstractC0137, List<T> list, List<T> list2) {
        List<T> listM5300 = null;
        String str = "۟۠ۤ";
        List<T> list3 = null;
        Iterator itM554 = null;
        List<T> listM426 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746820) {
                case 167:
                    listM426 = C0082.m426(list);
                    str = "ۡۥۥ";
                    continue;
                case 224:
                    str = "ۤ۠ۡ";
                    list3 = listM5300;
                    continue;
                case 2234:
                    return list3;
                case 2239:
                case 28501:
                    if (C0155.m1294() < 0) {
                        str = "ۤۨۡ";
                    } else {
                        continue;
                    }
                case 2245:
                    itM554 = C0088.m554(list2);
                    if (C0025.m118() <= 0) {
                        C0089.m592();
                        str = "ۤۧۢ";
                    } else {
                        str = "ۢ۠ۡ";
                        continue;
                    }
                case 3997:
                    listM5300 = C0385.m5300(abstractC0137, list3, C0398.m5850(itM554));
                    if (C0191.m1627() < 0) {
                        str = "۟ۢۧ";
                    } else {
                        continue;
                    }
                case 5376:
                    break;
                case 5607:
                    str = "ۤۨۡ";
                    list3 = listM426;
                    continue;
                case 5612:
                    if (C0229.m2064() < 0) {
                        str = "۟۠ۤ";
                    } else {
                        continue;
                    }
                case 7513:
                    if (!C0398.m5858(itM554)) {
                        break;
                    } else if (C0228.m2012() > 0) {
                        str = "۟ۨۢ";
                    }
                case 7777:
                    str = "ۡۥ۟";
                    continue;
            }
            str = "ۡۥۢ";
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public static <E> List<E> m1165(List<E> list) {
        return C0375.m4880(new C0122(), list);
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public static <E> List<E> m1166(List<E> list, E e) {
        String str = "ۡۢۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746939) {
                case 2328:
                    return C0385.m5300(new C0123(), list, e);
                case 2360:
                    if (C0390.m5512() > 0) {
                        str = "ۡۢۤ";
                        break;
                    } else {
                        C0378.m4998();
                        str = "۠۠ۧ";
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x000b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x001d A[SYNTHETIC] */
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> void m1167(T[] r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1167(java.lang.Object[], int, int):void");
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public static boolean m1168(SparseIntArray sparseIntArray) {
        String str = "ۢۢۨ";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753668) {
                case 96:
                    return z;
                case 935:
                    if (C0088.m573() > 0) {
                        str = "ۢۢۨ";
                    } else {
                        continue;
                    }
                case 2922:
                    if (C0073.m265() > 0) {
                        str = "۟ۥۤ";
                    } else {
                        continue;
                    }
                case 26106:
                case 29860:
                    if (C0397.m5814() <= 0) {
                        C0397.m5814();
                    } else {
                        str = "ۦۦۤ";
                        continue;
                    }
                case 26911:
                    str = "ۤۤۥ";
                    continue;
                case 27813:
                    z2 = true;
                    if (C0392.m5595() <= 0) {
                        C0384.m5278();
                        str = "ۥۨۥ";
                    } else {
                        str = "ۤۡۦ";
                        continue;
                    }
                case 28908:
                    if (sparseIntArray == null) {
                        break;
                    } else if (C0370.m3284() >= 0) {
                        C0086.m500();
                    } else {
                        str = "ۢۢ";
                    }
                case 30753:
                    if (C0398.m5833() <= 0) {
                        str = "ۨۧۤ";
                        z = false;
                    } else {
                        str = "ۦۦۤ";
                        z = false;
                        continue;
                    }
                case 30797:
                    if (C0089.m592() <= 0) {
                        C0389.m5481();
                        z = z2;
                    } else {
                        str = "ۨۢۨ";
                        z = z2;
                        continue;
                    }
                case 1711620:
                    if (C0381.m5117(sparseIntArray) <= 0) {
                        break;
                    } else if (C0395.m5698() < 0) {
                        str = "ۡۢۢ";
                    }
                case 1711940:
                    break;
            }
            str = "۠ۤ۟";
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public static boolean m1169(Collection<?> collection) {
        String str = "۠۟ۤ";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751563) {
                case 213:
                    break;
                case 1108:
                    str = "۠۟ۤ";
                    continue;
                case 4302:
                    if (collection == null) {
                        break;
                    } else {
                        str = "ۣۦ";
                    }
                case 4364:
                    if (C0384.m5278() <= 0) {
                        C0086.m500();
                        z = z2;
                    } else {
                        str = "ۦۥۤ";
                        z = z2;
                        continue;
                    }
                case 5327:
                    if (C0164.m1359() >= 0) {
                        C0368.m3171();
                    } else {
                        str = "۟۠۟";
                        continue;
                    }
                case 5353:
                case 7574:
                    str = "ۦۣ۠";
                    continue;
                case 7445:
                    str = "ۦۣ۠";
                    z = false;
                    continue;
                case 30734:
                    if (C0369.m3256() <= 0) {
                        C0382.m5180();
                        str = "۠ۧۡ";
                    } else {
                        str = "۟ۤۢ";
                        continue;
                    }
                case 31648:
                    z2 = true;
                    str = "۠ۡۨ";
                    continue;
                case 31688:
                    return z;
                case 1730152:
                    if (C0389.m5461(collection)) {
                        break;
                    } else {
                        str = C0396.m5741() >= 0 ? "ۣۤۧ" : "ۦۢۧ";
                    }
            }
            str = "ۡۡۤ";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0002 A[SYNTHETIC] */
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <E> boolean m1170(java.util.List<E> r3, java.util.List<E> r4) {
        /*
            java.lang.String r0 = "۟۠ۥ"
        L2:
            int r1 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r2 = 1753546(0x1ac1ca, float:2.457241E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 2272: goto Le;
                case 2343: goto L43;
                case 26173: goto L17;
                case 26350: goto L31;
                case 27178: goto L24;
                case 27279: goto L26;
                case 29455: goto L2f;
                case 1711445: goto L4c;
                default: goto Ld;
            }
        Ld:
            goto L2
        Le:
            int r1 = androidx.core.p007.C0089.m592()
            if (r1 <= 0) goto L2
            java.lang.String r0 = "۟ۧ۟"
            goto L2
        L17:
            int r0 = mirrorb.java.lang.C0400.m5932(r3)
            java.util.List r0 = com.sadfxg.fasg.C0369.m3255(r0, r4)
            boolean r0 = android.database.C0073.m271(r3, r0)
        L23:
            return r0
        L24:
            r0 = 1
            goto L23
        L26:
            boolean r1 = androidx.core.p007.C0089.m623(r4)
            if (r1 == 0) goto Le
            java.lang.String r0 = "ۣۢۦ"
            goto L2
        L2f:
            r0 = 0
            goto L23
        L31:
            boolean r1 = androidx.core.p007.C0089.m623(r3)
            if (r1 == 0) goto L43
            int r0 = android.net.C0082.m410()
            if (r0 < 0) goto L40
            java.lang.String r0 = "ۧ۠ۡ"
            goto L2
        L40:
            java.lang.String r0 = "۠ۨۨ"
            goto L2
        L43:
            int r1 = mirrorb.java.lang.C0400.m5961()
            if (r1 <= 0) goto L2
            java.lang.String r0 = "ۣ۠ۨ"
            goto L2
        L4c:
            int r0 = mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            if (r0 < 0) goto L58
            mirrorb.com.android.internal.content.C0395.m5698()
            java.lang.String r0 = "ۤ۟ۤ"
            goto L2
        L58:
            java.lang.String r0 = "۟۠ۥ"
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1170(java.util.List, java.util.List):boolean");
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public static boolean m1171(Map<?, ?> map) {
        String str = "ۦۤۢ";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749575) {
                case 1091:
                    if (C0381.m5139(map)) {
                        break;
                    } else if (C0395.m5698() >= 0) {
                        C0335.m2923();
                    } else {
                        str = "ۨۨۥ";
                    }
                case 1254:
                    str = "ۡۨۤ";
                    continue;
                case 5630:
                    if (C0379.m5056() > 0) {
                        str = "ۦۤۢ";
                    } else {
                        continue;
                    }
                case 6468:
                case 30497:
                    str = "ۧۥۥ";
                    continue;
                case 6745:
                    if (C0183.m1464() <= 0) {
                        C0089.m592();
                    } else {
                        str = "۠ۡۤ";
                        continue;
                    }
                case 7547:
                    str = "۟ۨۧ";
                    z = z2;
                    continue;
                case 7642:
                    str = "ۧۥۥ";
                    z = false;
                    continue;
                case 29603:
                    if (map == null) {
                        break;
                    } else if (C0228.m2012() <= 0) {
                        C0184.m1524();
                        str = "۠ۦۨ";
                    } else {
                        str = "ۣ۟۠";
                    }
                case 30592:
                    return z;
                case 31619:
                    break;
                case 31650:
                    z2 = true;
                    if (C0184.m1524() >= 0) {
                        C0420.m6215();
                    } else {
                        str = "ۡۥ۠";
                        continue;
                    }
            }
            if (C0393.m5668() <= 0) {
                C0088.m573();
                str = "ۥۣۢ";
            } else {
                str = "ۣۤۢ";
            }
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public static boolean m1172(long[] jArr) {
        String str = "ۧۤۡ";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751585) {
                case 1061:
                    z2 = true;
                    if (C0179.m1427() > 0) {
                        str = "۠ۧۦ";
                    } else {
                        continue;
                    }
                case 2018:
                    break;
                case 2023:
                    if (C0392.m5595() <= 0) {
                        C0382.m5180();
                        str = "۠ۡۥ";
                    } else {
                        str = "ۧۤۡ";
                        continue;
                    }
                case 2270:
                    return z;
                case 3081:
                    if (C0378.m4998() <= 0) {
                        z = false;
                    } else {
                        str = "ۢۥۢ";
                        z = false;
                        continue;
                    }
                case 3330:
                    if (jArr.length <= 0) {
                        break;
                    } else if (C0400.m5961() <= 0) {
                        C0397.m5814();
                    } else {
                        str = "ۥۣۢ";
                    }
                case 4510:
                    str = "ۡۤۡ";
                    z = z2;
                    continue;
                case 5439:
                    if (C0393.m5668() <= 0) {
                        str = "ۡۤۡ";
                    } else {
                        str = "۟ۡۦ";
                        continue;
                    }
                case 7525:
                case 31720:
                    str = "ۢۥۢ";
                    continue;
                case 32645:
                    if (jArr == null) {
                        break;
                    } else if (C0291.m2568() < 0) {
                        str = "ۣۨۨ";
                    }
                case 1730208:
                    str = "ۣ۠ۥ";
                    continue;
            }
            if (C0379.m5056() <= 0) {
                C0083.m448();
            } else {
                str = "ۤۥ";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0030 A[SYNTHETIC] */
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T[] m1173(T[] r20, T[] r21) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1173(java.lang.Object[], java.lang.Object[]):java.lang.Object[]");
    }

    /* renamed from: ̙̖, reason: not valid java name and contains not printable characters */
    public static <E> List<E> m1174(Collection<? extends E> collection) {
        ArrayList arrayList = null;
        String str = "ۤ۟";
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747679) {
                case TypedValues.PositionType.TYPE_CURVE_FIT /* 508 */:
                    arrayList3 = new ArrayList();
                    if (C0184.m1524() >= 0) {
                        C0228.m2012();
                    } else {
                        str = "ۣۡۦ";
                        continue;
                    }
                case 1532:
                    return arrayList2;
                case 3546:
                    if (C0393.m5668() <= 0) {
                        C0384.m5278();
                        str = "ۡۢ۠";
                        arrayList2 = arrayList;
                    } else {
                        str = "ۡۤۦ";
                        arrayList2 = arrayList;
                        continue;
                    }
                case 6231:
                    arrayList = new ArrayList(collection);
                    if (C0334.m2866() <= 0) {
                        str = "۠۠ۨ";
                    } else {
                        str = "۟۟ۥ";
                        continue;
                    }
                case 7319:
                    if (C0184.m1524() >= 0) {
                        arrayList2 = arrayList3;
                    } else {
                        str = "ۨ۠ۦ";
                        arrayList2 = arrayList3;
                        continue;
                    }
                case 7645:
                case 1734303:
                    str = "ۡۤۦ";
                    continue;
                case 25137:
                    if (C0083.m448() < 0) {
                        str = "ۢۢ";
                    } else {
                        continue;
                    }
                case 27452:
                    if (C0369.m3256() > 0) {
                        str = "ۤ۟";
                    } else {
                        continue;
                    }
                case 28563:
                    break;
                case 1734308:
                    if (!C0089.m623(collection)) {
                        break;
                    } else {
                        str = "۠ۢۥ";
                    }
            }
            str = C0378.m4998() <= 0 ? "۟ۥ۟" : "ۢۡۧ";
        }
    }

    /* renamed from: ̙̖, reason: not valid java name and contains not printable characters */
    public static boolean m1175(int[] iArr) {
        String str = "ۦۣۧ";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751715) {
                case 193:
                    return z;
                case 3110:
                case 30948:
                    if (C0390.m5512() <= 0) {
                        C0009.m36();
                        str = "ۤۡۦ";
                    } else {
                        str = "ۤۤۢ";
                        continue;
                    }
                case 3305:
                    if (iArr.length <= 0) {
                        break;
                    } else if (C0206.m1807() < 0) {
                        str = "ۣ۠";
                    }
                case 5564:
                    str = "ۦۣۧ";
                    continue;
                case 29442:
                    if (C0420.m6215() >= 0) {
                        C0368.m3171();
                    } else {
                        str = "ۣۣۥ";
                        continue;
                    }
                case 29615:
                    if (C0121.m1023() >= 0) {
                        C0228.m2012();
                    } else {
                        str = "ۣۣۧ";
                        continue;
                    }
                case 30945:
                    if (iArr == null) {
                        break;
                    } else if (C0025.m118() > 0) {
                        str = "ۣۡۨ";
                    }
                case 32548:
                    if (C0376.m4906() <= 0) {
                        C0121.m1023();
                        z = false;
                    } else {
                        str = "ۤۤۢ";
                        z = false;
                        continue;
                    }
                case 1730212:
                    if (C0385.m5282() >= 0) {
                        z = z2;
                    } else {
                        str = "ۨۦ۟";
                        z = z2;
                        continue;
                    }
                case 1730273:
                    break;
                case 1730302:
                    z2 = true;
                    if (C0228.m2012() <= 0) {
                        C0346.m3059();
                        str = "۠ۨ۟";
                    } else {
                        str = "۠ۧ";
                        continue;
                    }
            }
            str = "ۨۡۥ";
        }
    }

    /* renamed from: ̙̖, reason: not valid java name and contains not printable characters */
    public static int[] m1176(List<Integer> list) {
        String str = "ۣۥۦ";
        int i = 0;
        int[] iArr = null;
        int iM5932 = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747650) {
                case 355:
                case 1374:
                    if (C0400.m5961() > 0) {
                        str = "ۤۧۧ";
                    } else {
                        continue;
                    }
                case 1092:
                    i2 = ((i + 9) + 1) - 9;
                    str = "ۣۤۤ";
                    continue;
                case FragmentTransaction.TRANSIT_FRAGMENT_FADE /* 4099 */:
                    if (C0082.m410() < 0) {
                        str = "ۣۥۦ";
                    } else {
                        continue;
                    }
                case 4102:
                    if (i >= iM5932) {
                        break;
                    } else {
                        str = C0383.m5203() <= 0 ? "ۣۧۧ" : "ۣۤ۠";
                    }
                case 4257:
                    str = "ۤۨ";
                    i = i2;
                    continue;
                case 4266:
                    if (C0368.m3171() >= 0) {
                        str = "۟ۢ۠";
                        i = 0;
                    } else {
                        str = "ۤۧۧ";
                        i = 0;
                        continue;
                    }
                case 4901:
                    iArr[i] = C0397.m5774((Integer) C0370.m3273(list, i));
                    if (C0009.m36() >= 0) {
                        C0362.m3122();
                        str = "ۢۧۢ";
                    } else {
                        str = "ۡ۟ۤ";
                        continue;
                    }
                case 7170:
                    return iArr;
                case 7174:
                    iM5932 = C0400.m5932(list);
                    str = "ۣۣ۠";
                    continue;
                case 7301:
                    if (C0074.m307() < 0) {
                        str = "ۤۤۨ";
                    } else {
                        continue;
                    }
                case 7396:
                    iArr = new int[iM5932];
                    if (C0390.m5512() > 0) {
                        str = "ۣۡۥ";
                    } else {
                        continue;
                    }
                case 1734207:
                    break;
                case 1734214:
                    if (C0009.m36() >= 0) {
                        C0375.m4840();
                        str = "۟ۥۤ";
                    } else {
                        str = "ۣۡۨ";
                        continue;
                    }
            }
            if (C0078.m361() <= 0) {
                C0164.m1359();
            } else {
                str = "ۣۥۢ";
            }
        }
    }

    /* renamed from: ̙̗, reason: not valid java name and contains not printable characters */
    public static int m1177(int[] iArr) {
        String str = "ۨۥ۠";
        int length = 0;
        int i = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755528) {
                case 11:
                    if (iArr != null) {
                        break;
                    } else if (C0370.m3284() >= 0) {
                        C0121.m1023();
                    } else {
                        str = "۟ۥۧ";
                    }
                case 109:
                    if (C0387.m5374() >= 0) {
                        C0370.m3284();
                    } else {
                        str = "ۤ۠ۧ";
                        continue;
                    }
                case 2048:
                    if (C0155.m1294() >= 0) {
                        i = length;
                    } else {
                        str = "ۡۢۡ";
                        i = length;
                        continue;
                    }
                case 25226:
                    break;
                case 26472:
                    return i;
                case 28233:
                    str = "ۤۨۡ";
                    continue;
                case 28393:
                    str = "ۨۥ۠";
                    continue;
                case 28403:
                    length = iArr.length;
                    str = "ۦۣۡ";
                    continue;
                case 28771:
                case 31499:
                    str = "ۡۢۡ";
                    continue;
                case 29525:
                    str = "ۨۨۥ";
                    i = 0;
                    continue;
            }
            if (C0398.m5833() <= 0) {
                C0164.m1359();
                str = "ۣۤۤ";
            } else {
                str = "ۣ۟۟";
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0077 A[SYNTHETIC] */
    /* renamed from: ̙̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.Integer> m1178(java.util.List<java.lang.Long> r6) {
        /*
            r2 = 0
            java.lang.String r0 = "ۢ۟ۦ"
            r1 = r2
            r3 = r2
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1749634(0x1ab282, float:2.45176E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 203: goto L11;
                case 231: goto L56;
                case 1259: goto L53;
                case 2215: goto L16;
                case 2242: goto L71;
                case 2282: goto L53;
                case 2894: goto L3f;
                case 5443: goto L41;
                case 6491: goto L2b;
                case 6562: goto L44;
                case 7453: goto L4b;
                case 31625: goto L62;
                case 1732121: goto L40;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            if (r6 != 0) goto L56
            java.lang.String r0 = "ۥ۠"
            goto L5
        L16:
            boolean r0 = mirrorb.com.android.internal.C0398.m5858(r1)
            if (r0 == 0) goto L71
            int r0 = com.cloudinject.customview.C0184.m1524()
            if (r0 < 0) goto L28
            mirrorb.android.media.session.C0386.m5322()
            java.lang.String r0 = "ۣ۟۠"
            goto L5
        L28:
            java.lang.String r0 = "۠ۨۡ"
            goto L5
        L2b:
            java.lang.Object r0 = mirrorb.com.android.internal.C0398.m5850(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            int r0 = com.cloudinject.core.p013.C0179.m1397(r0)
            java.lang.Integer r0 = android.net.wifi.C0078.m339(r0)
            com.cloudinject.customview.C0184.m1513(r3, r0)
            java.lang.String r0 = "۟ۥۧ"
            goto L5
        L3f:
            r2 = r3
        L40:
            return r2
        L41:
            java.lang.String r0 = "ۣۢۨ"
            goto L5
        L44:
            java.util.Iterator r1 = androidx.core.p007.C0088.m554(r6)
            java.lang.String r0 = "ۣۤۢ"
            goto L5
        L4b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r0 = "۠ۢۢ"
            goto L5
        L53:
            java.lang.String r0 = "ۣۤۢ"
            goto L5
        L56:
            int r0 = com.cloudinject.feature.p018.C0228.m2012()
            if (r0 > 0) goto L5f
            java.lang.String r0 = "ۥۢۧ"
            goto L5
        L5f:
            java.lang.String r0 = "ۡۨۦ"
            goto L5
        L62:
            int r0 = com.cloudinject.feature.model.p014.C0191.m1627()
            if (r0 < 0) goto L6e
            mirrorb.android.os.mount.C0390.m5512()
            java.lang.String r0 = "۠ۥ۟"
            goto L5
        L6e:
            java.lang.String r0 = "ۢ۟ۦ"
            goto L5
        L71:
            int r0 = mirrorb.java.lang.C0400.m5961()
            if (r0 > 0) goto L7d
            com.cloudinject.feature.p023.C0334.m2866()
            java.lang.String r0 = "ۥ۟۠"
            goto L5
        L7d:
            java.lang.String r0 = "ۤ۟ۧ"
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1178(java.util.List):java.util.List");
    }

    /* renamed from: ̙̙, reason: not valid java name and contains not printable characters */
    public static int m1179(int[] iArr) {
        return C0375.m4864(iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0071 A[SYNTHETIC] */
    /* renamed from: ̙̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.Long> m1180(java.util.List<java.lang.Integer> r6) {
        /*
            r2 = 0
            java.lang.String r0 = "ۢۨۨ"
            r1 = r2
            r3 = r2
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 56327(0xdc07, float:7.8931E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 2020: goto L11;
                case 1710351: goto L8d;
                case 1711524: goto L77;
                case 1728911: goto L36;
                case 1728941: goto L77;
                case 1730062: goto L83;
                case 1731224: goto L12;
                case 1731302: goto L47;
                case 1732292: goto L58;
                case 1732453: goto L27;
                case 1733350: goto L44;
                case 1733383: goto L6b;
                case 1734400: goto L13;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            r3 = r2
        L12:
            return r3
        L13:
            java.lang.Object r0 = mirrorb.com.android.internal.C0398.m5850(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            long r4 = com.cloudinject.customview.C0183.m1467(r0)
            java.lang.Long r0 = android.database.C0073.m260(r4)
            com.cloudinject.customview.C0184.m1513(r3, r0)
            java.lang.String r0 = "ۡۢۢ"
            goto L5
        L27:
            if (r6 != 0) goto L6b
            int r4 = mirrorb.java.lang.C0400.m5961()
            if (r4 > 0) goto L33
            mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            goto L5
        L33:
            java.lang.String r0 = "۟ۢ"
            goto L5
        L36:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = mirrorb.android.rms.C0392.m5595()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۣۦۤ"
            goto L5
        L44:
            java.lang.String r0 = "ۥ۠ۥ"
            goto L5
        L47:
            java.util.Iterator r1 = androidx.core.p007.C0088.m554(r6)
            int r4 = android.net.C0082.m410()
            if (r4 < 0) goto L55
            com.cloudinject.core.p013.C0179.m1427()
            goto L5
        L55:
            java.lang.String r0 = "ۣۢۤ"
            goto L5
        L58:
            boolean r4 = mirrorb.com.android.internal.C0398.m5858(r1)
            if (r4 == 0) goto L8d
            int r4 = com.cloudinject.feature.p021.C0291.m2568()
            if (r4 < 0) goto L68
            mirrorb.com.android.internal.app.C0394.m5672()
            goto L5
        L68:
            java.lang.String r0 = "۠ۡۨ"
            goto L5
        L6b:
            int r0 = androidx.core.graphics.drawable.C0086.m500()
            if (r0 > 0) goto L74
            java.lang.String r0 = "ۣ۠ۧ"
            goto L5
        L74:
            java.lang.String r0 = "ۥ۟ۢ"
            goto L5
        L77:
            int r0 = mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            if (r0 < 0) goto L80
            java.lang.String r0 = "ۦۣۢ"
            goto L5
        L80:
            java.lang.String r0 = "ۣۢۤ"
            goto L5
        L83:
            int r4 = com.cloudinject.customview.C0183.m1464()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۢۨۨ"
            goto L5
        L8d:
            java.lang.String r0 = "ۣۤ۠"
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0138.m1180(java.util.List):java.util.List");
    }
}
