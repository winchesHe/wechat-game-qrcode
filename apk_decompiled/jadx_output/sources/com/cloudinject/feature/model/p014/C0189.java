package com.cloudinject.feature.model.p014;

import android.net.C0082;
import android.net.wifi.C0078;
import androidx.core.graphics.drawable.C0086;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.p018.C0229;
import com.sadfxg.fasg.C0369;
import java.util.ArrayList;
import java.util.List;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;

/* renamed from: com.cloudinject.feature.model.̗.̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0189 {

    /* renamed from: ̗̗̗̗̙̙̙, reason: not valid java name and contains not printable characters */
    private List<C0190> f279;

    public C0189() {
        String str = "ۡۧۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752459) {
                case 4617:
                    this.f279 = new ArrayList();
                    str = "۠ۧ";
                    break;
                case 1728784:
                    str = "ۡۧۨ";
                    break;
                case 1728908:
                    return;
            }
        }
    }

    /* renamed from: ۡۧۥۧ, reason: not valid java name and contains not printable characters */
    public static List m1611(Object obj) {
        Object obj2 = "ۧۡ۟";
        List<C0190> list = null;
        List<C0190> list2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1748803) {
                case 1887:
                case 7648:
                    if (C0381.m5127() <= 0) {
                        C0369.m3256();
                        obj2 = "ۢۥ۠";
                    } else {
                        obj2 = "ۥۣۡ";
                        continue;
                    }
                case 2140:
                    if (C0398.m5833() <= 0) {
                        C0385.m5282();
                        obj2 = "ۥۥۥ";
                    } else {
                        obj2 = "ۦۦۣ";
                        continue;
                    }
                case 4380:
                    list2 = ((C0189) obj).f279;
                    if (C0078.m361() > 0) {
                        obj2 = "ۥۦۥ";
                    } else {
                        continue;
                    }
                case 4391:
                    if (C0398.m5833() <= 0) {
                        C0183.m1464();
                        list = list2;
                    } else {
                        obj2 = "ۥۣۡ";
                        list = list2;
                        continue;
                    }
                case 4416:
                    return list;
                case 5771:
                    if (C0399.m5914() > 0) {
                        obj2 = "ۧۡ۟";
                    } else {
                        continue;
                    }
                case 6236:
                    break;
                case 27142:
                    if (C0155.m1294() > 0) {
                        break;
                    } else if (C0082.m410() >= 0) {
                        C0400.m5961();
                        obj2 = "ۣۡۤ";
                    } else {
                        obj2 = "ۥۦ۠";
                    }
                case 28000:
                    if (C0179.m1427() <= 0) {
                        list = null;
                    } else {
                        obj2 = "۟۟";
                        list = null;
                        continue;
                    }
                case 1733795:
                    if (C0086.m500() <= 0) {
                        C0396.m5741();
                    } else {
                        obj2 = "۟ۨۥ";
                        continue;
                    }
            }
            if (C0393.m5668() <= 0) {
                C0384.m5278();
                obj2 = "ۡ۟ۥ";
            } else {
                obj2 = "۟۠۠";
            }
        }
    }

    /* renamed from: ̗̖̗, reason: not valid java name and contains not printable characters */
    public void m1612(List<C0190> list) {
        String str = "۠ۦۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746752) {
                case 2052:
                    return;
                case 3295:
                    this.f279 = list;
                    str = "ۡۥۨ";
                    break;
                case 4163:
                    if (C0229.m2064() >= 0) {
                        break;
                    } else {
                        str = "۠ۦۥ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̙̗̗̙̙, reason: not valid java name and contains not printable characters */
    public List<C0190> m1613() {
        return m1611(this);
    }
}
