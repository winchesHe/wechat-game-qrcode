package com.cloudinject.feature.p023;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.net.C0083;
import androidx.core.p007.C0089;
import com.cloudinject.feature.p015.C0206;
import com.sadfxg.fasg.C0370;
import java.text.NumberFormat;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.rms.C0392;
import mirrorb.com.android.internal.content.C0395;

/* renamed from: com.cloudinject.feature.̙̙.̗̙̖̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0322 {
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static String m2793(long j, long j2) {
        int iIntValue = 0;
        NumberFormat numberFormat = null;
        Integer num = null;
        Object obj = "ۥۢ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1752736) {
                case 168:
                    C0025.m97(numberFormat, ((iIntValue ^ (-1)) & 7171787) | ((-7171788) & iIntValue));
                    if (C0389.m5481() > 0) {
                        obj = "ۣۡۨ";
                        break;
                    } else {
                        obj = "۠۟ۥ";
                        break;
                    }
                case 4518:
                    return C0206.m1827(numberFormat, (j / j2) * 100.0f);
                case 30694:
                    obj = "ۥۢ";
                    break;
                case 30701:
                    NumberFormat numberFormatM5216 = C0383.m5216();
                    if (C0009.m36() < 0) {
                        numberFormat = numberFormatM5216;
                        obj = "ۧۡ۠";
                        break;
                    } else {
                        C0083.m448();
                        numberFormat = numberFormatM5216;
                        obj = "ۣۤۧ";
                        break;
                    }
                case 31718:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    if (C0392.m5595() > 0) {
                        obj = "ۥۣۦ";
                        break;
                    } else {
                        C0381.m5127();
                        break;
                    }
                case 1729085:
                    num = new Integer(7171785);
                    if (C0395.m5698() >= 0) {
                        break;
                    } else {
                        obj = "ۣۨۨ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public static float m2794(long j, long j2) {
        int iIntValue = 0;
        NumberFormat numberFormatM5216 = null;
        Integer num = null;
        Object obj = "ۤۡۤ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1754376) {
                case 139:
                    obj = "ۤۡۤ";
                    break;
                case 1805:
                    C0025.m97(numberFormatM5216, ((iIntValue ^ (-1)) & 8733026) | ((-8733027) & iIntValue));
                    if (C0370.m3284() < 0) {
                        obj = "ۣ۠ۢ";
                        break;
                    } else {
                        C0384.m5278();
                        break;
                    }
                case 29485:
                    return (j / j2) * 100.0f;
                case 32513:
                    numberFormatM5216 = C0383.m5216();
                    obj = "ۤۢ۠";
                    break;
                case 32527:
                    Integer num2 = new Integer(8733024);
                    if (C0386.m5322() > 0) {
                        num = num2;
                        obj = "ۤۡۦ";
                        break;
                    } else {
                        num = num2;
                        obj = "ۥۦ";
                        break;
                    }
                case 32554:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    if (C0378.m4998() > 0) {
                        obj = "ۦۥۤ";
                        break;
                    } else {
                        C0089.m592();
                        break;
                    }
            }
        }
    }
}
