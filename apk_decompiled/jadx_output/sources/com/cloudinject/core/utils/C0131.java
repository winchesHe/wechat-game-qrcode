package com.cloudinject.core.utils;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.database.C0074;
import android.net.C0082;
import android.net.wifi.C0078;
import android.util.Pair;
import android.util.SparseArray;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.p026.C0346;
import com.sadfxg.fasg.C0369;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.rms.C0392;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.core.utils.̗̗̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0131 {
    /* renamed from: ̖̙, reason: not valid java name and contains not printable characters */
    public static <V> Map<Integer, V> m1067(SparseArray<V> sparseArray) {
        String str = "۟ۨۡ";
        int i = 0;
        TreeMap treeMap = null;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746850) {
                case 2375:
                    if (C0384.m5250(sparseArray)) {
                        break;
                    } else {
                        str = "ۤۧۧ";
                    }
                case 3170:
                    str = "ۧۨۧ";
                    i = i2;
                    continue;
                case 4026:
                    treeMap = new TreeMap();
                    if (C0388.m5430() <= 0) {
                        C0375.m4840();
                        str = "۟۟۟";
                    } else {
                        str = "ۡۢۦ";
                        continue;
                    }
                case 6597:
                    break;
                case 7526:
                    if (C0388.m5430() <= 0) {
                        C0369.m3256();
                    } else {
                        str = "ۨۨ۠";
                        continue;
                    }
                case 7626:
                    str = "۟ۨۡ";
                    continue;
                case 7749:
                    return treeMap;
                case 24964:
                    if (C0396.m5741() >= 0) {
                        C0384.m5278();
                    } else {
                        str = "ۧۥۦ";
                        continue;
                    }
                case 25194:
                case 28229:
                    if (C0394.m5672() <= 0) {
                        C0078.m361();
                        str = "ۢۥۣ";
                    } else {
                        str = "ۧۢ۠";
                        continue;
                    }
                case 25287:
                    if (i >= C0397.m5793(sparseArray)) {
                        break;
                    } else if (C0389.m5481() <= 0) {
                        C0382.m5180();
                        str = "ۤ۟۠";
                    } else {
                        str = "ۨ۟ۡ";
                    }
                case 28226:
                    if (C0025.m118() <= 0) {
                        C0378.m4998();
                        i = 0;
                    } else {
                        str = "ۧۢ۠";
                        i = 0;
                        continue;
                    }
                case 28293:
                    i2 = (i - 24) + 1 + 24;
                    str = "۠ۧۧ";
                    continue;
                case 28520:
                    C0420.m6218(treeMap, C0078.m339(C0369.m3247(sparseArray, i)), C0279.m2501(sparseArray, i));
                    if (C0009.m36() >= 0) {
                        C0380.m5068();
                    } else {
                        str = "ۨۢۡ";
                        continue;
                    }
            }
            str = C0183.m1464() <= 0 ? "ۡۡ" : "ۣۤ۠";
        }
    }

    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    public static <K, V> List<Pair<K, V>> m1068(Map<K, V> map) {
        Map.Entry entry = null;
        String str = "ۧۢۤ";
        Iterator itM5271 = null;
        ArrayList arrayList = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755345) {
                case 2495:
                    if (C0229.m2064() >= 0) {
                        str = "ۣ۠ۥ";
                    } else {
                        str = "ۧۡ۟";
                        continue;
                    }
                case 3416:
                    if (!C0398.m5858(itM5271)) {
                        break;
                    } else {
                        str = "ۣ۠ۧ";
                    }
                case 3476:
                case 1709201:
                    if (C0074.m307() >= 0) {
                        C0395.m5698();
                        str = "ۥۤۢ";
                    } else {
                        str = "ۣۧۥ";
                        continue;
                    }
                case 3512:
                    arrayList = new ArrayList();
                    if (C0392.m5595() <= 0) {
                        str = "ۨۢ۠";
                    } else {
                        str = "ۢۡۦ";
                        continue;
                    }
                case 25453:
                    Map.Entry entry2 = (Map.Entry) C0398.m5850(itM5271);
                    if (C0082.m410() >= 0) {
                        C0420.m6215();
                        entry = entry2;
                        str = "۠ۢۧ";
                    } else {
                        entry = entry2;
                        str = "ۣۧ۟";
                        continue;
                    }
                case 28629:
                    itM5271 = C0384.m5271(C0078.m377(map));
                    if (C0420.m6215() >= 0) {
                        C0074.m307();
                    } else {
                        str = "ۣۧۥ";
                        continue;
                    }
                case 28985:
                    if (C0384.m5278() <= 0) {
                        C0394.m5672();
                    } else {
                        str = "ۧۢۤ";
                        continue;
                    }
                case 29294:
                    return arrayList;
                case 29328:
                    break;
                case 31318:
                    if (C0380.m5064(map)) {
                        break;
                    } else if (C0383.m5203() <= 0) {
                        C0164.m1359();
                    } else {
                        str = "۟۟ۤ";
                    }
                case 32298:
                    C0184.m1513(arrayList, C0228.m1988(C0389.m5472(entry), C0400.m5944(entry)));
                    str = "ۦ۠ۨ";
                    continue;
            }
            if (C0376.m4906() <= 0) {
                C0346.m3059();
            } else {
                str = "ۤۧۢ";
            }
        }
    }

    /* renamed from: ̗̙̖, reason: not valid java name and contains not printable characters */
    public static <K extends Comparable<K>, V> Map<K, V> m1069(List<Pair<K, V>> list) {
        Pair pair = null;
        Iterator itM554 = null;
        TreeMap treeMap = null;
        String str = "۟ۧۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754659) {
                case 43:
                    break;
                case 783:
                    itM554 = C0088.m554(list);
                    if (C0395.m5698() >= 0) {
                        C0184.m1524();
                    } else {
                        str = "ۨ۟ۡ";
                        continue;
                    }
                case 1990:
                    if (C0191.m1627() >= 0) {
                        C0384.m5278();
                    } else {
                        str = "ۢۨۧ";
                        continue;
                    }
                case 2023:
                    C0420.m6218(treeMap, (Comparable) C0400.m5963(pair), C0399.m5884(pair));
                    if (C0387.m5374() < 0) {
                        str = "ۦۣۤ";
                    } else {
                        continue;
                    }
                case 3817:
                    if (!C0398.m5858(itM554)) {
                        break;
                    } else if (C0088.m573() <= 0) {
                        C0291.m2568();
                    } else {
                        str = "ۣۥۨ";
                    }
                case 3822:
                    return treeMap;
                case 3826:
                case 30018:
                    str = "ۨ۟ۡ";
                    continue;
                case 28195:
                    treeMap = new TreeMap();
                    if (C0025.m118() > 0) {
                        str = "ۢۦۧ";
                    } else {
                        continue;
                    }
                case 28901:
                    str = "ۦۣۡ";
                    pair = (Pair) C0398.m5850(itM554);
                    continue;
                case 29952:
                    if (C0089.m623(list)) {
                        break;
                    } else if (C0375.m4840() >= 0) {
                        C0191.m1627();
                        str = "ۤۢۡ";
                    } else {
                        str = "ۧ۠ۥ";
                    }
                case 32751:
                    str = "۟ۧۨ";
                    continue;
            }
            str = "ۨ۟ۤ";
        }
    }

    /* renamed from: ̙̖, reason: not valid java name and contains not printable characters */
    public static <V> List<V> m1070(SparseArray<V> sparseArray) {
        String str = "ۦۣۢ";
        int i = 0;
        int iM108 = 0;
        ArrayList arrayList = null;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753453) {
                case 175:
                    if (C0387.m5374() >= 0) {
                        i = i2;
                    } else {
                        str = "ۦۦۧ";
                        i = i2;
                        continue;
                    }
                case 202:
                    arrayList = new ArrayList();
                    if (C0388.m5430() <= 0) {
                        str = "ۣۣۡ";
                    } else {
                        str = "ۣۤۢ";
                        continue;
                    }
                case 842:
                    if (C0334.m2866() <= 0) {
                        str = "ۤۨۨ";
                    } else {
                        str = "۠ۢۨ";
                        continue;
                    }
                case 26292:
                    return arrayList;
                case 27211:
                case 30674:
                    str = "ۤ۠۟";
                    continue;
                case 27241:
                    str = "ۢ۟ۤ";
                    continue;
                case 27565:
                    i2 = (i - 14) + 1 + 14;
                    if (C0378.m4998() <= 0) {
                        str = "ۣۨۨ";
                    } else {
                        str = "ۦۣ۟";
                        continue;
                    }
                case 28246:
                    break;
                case 28562:
                    if (C0395.m5698() < 0) {
                        str = "ۦۣۢ";
                    } else {
                        continue;
                    }
                case 29482:
                    if (C0191.m1627() >= 0) {
                        str = "ۣۦۤ";
                        i = 0;
                    } else {
                        str = "ۤ۠۟";
                        i = 0;
                        continue;
                    }
                case 30668:
                    iM108 = C0025.m108(sparseArray);
                    if (C0383.m5203() > 0) {
                        str = "۠ۡۥ";
                    } else {
                        continue;
                    }
                case 30862:
                    if (i >= iM108) {
                        break;
                    } else if (C0074.m307() >= 0) {
                        C0183.m1464();
                        str = "ۡ۠۟";
                    } else {
                        str = "ۤۨۨ";
                    }
                case 31625:
                    C0184.m1513(arrayList, C0279.m2501(sparseArray, i));
                    str = "۠۟۟";
                    continue;
            }
            if (C0420.m6215() >= 0) {
                C0383.m5203();
            } else {
                str = "۟ۦ۠";
            }
        }
    }
}
