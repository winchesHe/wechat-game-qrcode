package com.cloudinject.feature.p023;

import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.net.wifi.C0078;
import android.util.Pair;
import android.util.SparseArray;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
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

/* renamed from: com.cloudinject.feature.̙̙.̗̖̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0314 {
    /* renamed from: ̖̙, reason: not valid java name and contains not printable characters */
    public static <V> Map<Integer, V> m2775(SparseArray<V> sparseArray) {
        String str = "ۤۤۥ";
        int i = 0;
        TreeMap treeMap = null;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751622) {
                case 35:
                    treeMap = new TreeMap();
                    if (C0073.m265() <= 0) {
                        C0388.m5430();
                    } else {
                        str = "ۦۡۡ";
                        continue;
                    }
                case 2233:
                    return treeMap;
                case 4355:
                    C0420.m6218(treeMap, C0078.m339(C0369.m3247(sparseArray, i)), C0279.m2501(sparseArray, i));
                    if (C0394.m5672() <= 0) {
                        C0388.m5430();
                        str = "ۣۧۢ";
                    } else {
                        str = "ۧۧ";
                        continue;
                    }
                case 4606:
                    str = "۟ۤۦ";
                    i = 0;
                    continue;
                case 5412:
                case 1728943:
                    str = "۟ۤۦ";
                    continue;
                case 5467:
                    str = "ۨ۠";
                    i = i2;
                    continue;
                case 5598:
                    if (C0368.m3171() < 0) {
                        str = "ۤۤۥ";
                    } else {
                        continue;
                    }
                case 7459:
                    str = "۠ۧ۟";
                    continue;
                case 7655:
                    if (i >= C0397.m5793(sparseArray)) {
                        break;
                    } else {
                        str = "ۣ۠ۨ";
                    }
                case 31680:
                    if (C0391.m5558(sparseArray)) {
                        break;
                    } else if (C0335.m2923() >= 0) {
                        C0389.m5481();
                    } else {
                        str = "۟ۢۨ";
                    }
                case 31693:
                    break;
                case 1730214:
                    i2 = i + 1;
                    str = "ۡۤ۠";
                    continue;
                case 1730238:
                    if (C0183.m1464() <= 0) {
                        C0334.m2866();
                    } else {
                        str = "۟ۨ";
                        continue;
                    }
            }
            str = C0291.m2568() >= 0 ? "ۡۨۨ" : "ۢۥۢ";
        }
    }

    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    public static <K, V> List<Pair<K, V>> m2776(Map<K, V> map) {
        Map.Entry entry = null;
        String str = "۟ۡۧ";
        Iterator itM5271 = null;
        ArrayList arrayList = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755342) {
                case 2797:
                case 26548:
                    str = "۠ۧۢ";
                    continue;
                case 25359:
                    itM5271 = C0384.m5271(C0078.m377(map));
                    str = "۠ۧۢ";
                    continue;
                case 25454:
                    C0184.m1513(arrayList, C0228.m1988(C0389.m5472(entry), C0400.m5944(entry)));
                    if (C0389.m5481() <= 0) {
                        C0381.m5127();
                    } else {
                        str = "۠ۥۣ";
                        continue;
                    }
                case 25461:
                    if (!C0398.m5858(itM5271)) {
                        break;
                    } else if (C0089.m592() <= 0) {
                        C0395.m5698();
                    } else {
                        str = "ۣۡ۠";
                    }
                case 25520:
                    if (C0183.m1464() <= 0) {
                        C0397.m5814();
                        str = "۠ۤۥ";
                    } else {
                        str = "ۦۦۣ";
                        continue;
                    }
                case 26160:
                    entry = (Map.Entry) C0398.m5850(itM5271);
                    str = "۠ۦۦ";
                    continue;
                case 28555:
                    arrayList = new ArrayList();
                    str = "ۤۦۣ";
                    continue;
                case 29295:
                    if (C0392.m5596(map)) {
                        break;
                    } else if (C0385.m5282() >= 0) {
                        C0400.m5961();
                    } else {
                        str = "۠ۧۨ";
                    }
                case 29990:
                    return arrayList;
                case 32720:
                    break;
                case 1709109:
                    if (C0375.m4840() < 0) {
                        str = "۟ۡۧ";
                    } else {
                        continue;
                    }
            }
            str = "ۥۢۥ";
        }
    }

    /* renamed from: ̗̙̖, reason: not valid java name and contains not printable characters */
    public static <K extends Comparable<K>, V> Map<K, V> m2777(List<Pair<K, V>> list) {
        Pair pair = null;
        String str = "ۦۤ۟";
        Iterator itM554 = null;
        TreeMap treeMap = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752454) {
                case 2021:
                    str = "ۦۤ۟";
                    continue;
                case 3041:
                    itM554 = C0088.m554(list);
                    str = "۟ۥۧ";
                    continue;
                case 3877:
                case 32676:
                    if (C0396.m5741() >= 0) {
                        C0376.m4906();
                        str = "۟ۥ۟";
                    } else {
                        str = "۟ۥۧ";
                        continue;
                    }
                case 4932:
                    if (C0369.m3228(list)) {
                        break;
                    } else if (C0382.m5180() <= 0) {
                        C0389.m5481();
                    } else {
                        str = "ۣۢۦ";
                    }
                case 5690:
                    C0420.m6218(treeMap, (Comparable) C0400.m5963(pair), C0399.m5884(pair));
                    str = "ۧۢ";
                    continue;
                case 5952:
                    break;
                case 6727:
                    if (!C0398.m5858(itM554)) {
                        break;
                    } else {
                        str = "۠ۨ";
                    }
                case 31847:
                    treeMap = new TreeMap();
                    str = "ۡۡۢ";
                    continue;
                case 1728796:
                    return treeMap;
                case 1728861:
                    if (C0334.m2866() > 0) {
                        str = "ۦۦۢ";
                    } else {
                        continue;
                    }
                case 1728910:
                    pair = (Pair) C0398.m5850(itM554);
                    str = "ۣ۠ۧ";
                    continue;
            }
            str = "ۥ۟";
        }
    }

    /* renamed from: ̙̖, reason: not valid java name and contains not printable characters */
    public static <V> List<V> m2778(SparseArray<V> sparseArray) {
        String str = "ۨۧۧ";
        int i = 0;
        int iM214 = 0;
        ArrayList arrayList = null;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746843) {
                case 71:
                    if (C0369.m3256() <= 0) {
                        C0164.m1359();
                    } else {
                        str = "۠ۦۨ";
                        continue;
                    }
                case 2206:
                    i2 = ((i + 13) + 1) - 13;
                    str = "ۣۡ۟";
                    continue;
                case 2334:
                    str = "ۦۨۢ";
                    i = i2;
                    continue;
                case 2355:
                case 2425:
                    str = "ۤ۠۟";
                    continue;
                case 2429:
                    return arrayList;
                case 3129:
                    if (C0164.m1359() >= 0) {
                        C0183.m1464();
                        i = 0;
                    } else {
                        str = "ۤ۠۟";
                        i = 0;
                        continue;
                    }
                case 3453:
                    break;
                case 4422:
                    C0184.m1513(arrayList, C0279.m2501(sparseArray, i));
                    if (C0394.m5672() <= 0) {
                        C0073.m265();
                    } else {
                        str = "ۣۡۧ";
                        continue;
                    }
                case 7800:
                    if (i >= iM214) {
                        break;
                    } else {
                        str = "ۣۦ۠";
                    }
                case 26054:
                    iM214 = C0060.m214(sparseArray);
                    if (C0089.m592() <= 0) {
                        C0279.m2491();
                    } else {
                        str = "۟ۦۣ";
                        continue;
                    }
                case 26107:
                    if (C0395.m5698() < 0) {
                        str = "ۡ۠ۧ";
                    } else {
                        continue;
                    }
                case 28243:
                    arrayList = new ArrayList();
                    if (C0393.m5668() <= 0) {
                        C0375.m4840();
                        str = "ۣۨۨ";
                    } else {
                        str = "ۦۨ۟";
                        continue;
                    }
                case 1735546:
                    if (C0387.m5374() >= 0) {
                        C0397.m5814();
                    } else {
                        str = "ۨۧۧ";
                        continue;
                    }
            }
            str = "ۡۢۧ";
        }
    }
}
