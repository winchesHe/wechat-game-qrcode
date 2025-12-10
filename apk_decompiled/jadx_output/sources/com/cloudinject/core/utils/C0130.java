package com.cloudinject.core.utils;

import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.p025.C0362;
import com.sadfxg.fasg.C0369;
import mirrorb.android.accounts.C0375;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.location.C0384;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0388;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.java.lang.C0400;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: com.cloudinject.core.utils.̗̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
class C0130<E> extends AbstractC0132<E> {

    /* renamed from: ̗̗̖̙̙̙̙, reason: not valid java name and contains not printable characters */
    final Object f206;

    C0130(Object obj) {
        this.f206 = obj;
    }

    /* renamed from: ۧۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m1066(Object obj) {
        Object obj2 = "۟ۡۦ";
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1746875) {
                case 199:
                    break;
                case 255:
                    if (C0369.m3256() < 0) {
                        break;
                    } else if (C0362.m3122() < 0) {
                        obj2 = "ۣ۠ۤ";
                    }
                case 3300:
                    obj4 = ((C0130) obj).f206;
                    if (C0155.m1294() < 0) {
                        obj2 = "ۡ۠";
                    } else {
                        continue;
                    }
                case 4421:
                case 26012:
                    if (C0395.m5698() >= 0) {
                        C0381.m5127();
                    } else {
                        obj2 = "ۢۨۤ";
                        continue;
                    }
                case 4540:
                    if (C0375.m4840() >= 0) {
                        obj3 = null;
                    } else {
                        obj2 = "۠ۦ";
                        obj3 = null;
                        continue;
                    }
                case 5349:
                    return obj3;
                case 28338:
                    if (C0388.m5430() > 0) {
                        obj2 = "۟ۡۦ";
                    } else {
                        continue;
                    }
                case 1735462:
                    if (C0362.m3122() < 0) {
                        obj2 = "ۣۣ۟";
                    } else {
                        continue;
                    }
                case 1735588:
                    if (C0183.m1464() <= 0) {
                        obj3 = obj4;
                    } else {
                        obj2 = "ۢۨۤ";
                        obj3 = obj4;
                        continue;
                    }
                case 1735613:
                    if (C0384.m5278() <= 0) {
                        C0400.m5961();
                    } else {
                        obj2 = "ۣۧۢ";
                        continue;
                    }
            }
            if (C0389.m5481() > 0) {
                obj2 = "ۥۢ";
            }
        }
    }

    @Override // com.cloudinject.core.utils.AbstractC0132
    /* renamed from: ̗̖̖ */
    public boolean mo1034(E e) {
        String str = "۟ۤۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56355) {
                case 1711618:
                    if (C0228.m2012() <= 0) {
                        break;
                    } else {
                        str = "۟ۤۢ";
                        break;
                    }
                case 1735614:
                    return C0089.m617(e, m1066(this));
            }
        }
    }
}
