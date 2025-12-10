package com.cloudinject.core.utils;

import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.p025.C0362;
import com.px.C0368;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.net.C0389;
import mirrorb.android.providers.C0391;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.java.lang.C0400;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: com.cloudinject.core.utils.̗̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
class C0126<E> extends AbstractC0132<E> {

    /* renamed from: ̗̗̙̙̖̙̗, reason: not valid java name and contains not printable characters */
    final AbstractC0132 f200;

    C0126(AbstractC0132 abstractC0132) {
        this.f200 = abstractC0132;
    }

    /* renamed from: ۣۤ۟۠, reason: not valid java name and contains not printable characters */
    public static AbstractC0132 m1033(Object obj) {
        String str = "ۤۡۡ";
        AbstractC0132 abstractC0132 = null;
        AbstractC0132 abstractC01322 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1749641) {
                case 78:
                    return abstractC0132;
                case 2189:
                    if (C0228.m2012() <= 0) {
                        break;
                    } else {
                        str = "۠۟ۢ";
                    }
                case 3244:
                    if (C0382.m5180() <= 0) {
                        C0382.m5180();
                        str = "ۤۨۨ";
                        abstractC0132 = abstractC01322;
                    } else {
                        str = "ۣۢۨ";
                        abstractC0132 = abstractC01322;
                        continue;
                    }
                case 5394:
                    str = "ۨۥۧ";
                    continue;
                case 5558:
                    str = "ۤۡۡ";
                    continue;
                case 6218:
                    abstractC01322 = ((C0126) obj).f200;
                    if (C0279.m2491() >= 0) {
                        C0362.m3122();
                    } else {
                        str = "ۥۤۤ";
                        continue;
                    }
                case 7215:
                    break;
                case 29506:
                    if (C0121.m1023() < 0) {
                        str = "ۦۥ";
                    } else {
                        continue;
                    }
                case 31491:
                    str = "ۦۣۨ";
                    abstractC0132 = null;
                    continue;
                case 1732150:
                case 1732266:
                    if (C0389.m5481() <= 0) {
                        C0377.m4944();
                    } else {
                        str = "ۣۢۨ";
                        continue;
                    }
            }
            str = C0400.m5961() <= 0 ? "ۢ۟" : "۟ۤ۠";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cloudinject.core.utils.AbstractC0132
    /* renamed from: ̗̖̖, reason: not valid java name and contains not printable characters */
    public boolean mo1034(E e) {
        boolean zM3182 = false;
        String str = "ۢۨۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755617) {
                case 2946:
                    return (((zM3182 ? 1 : 0) ^ 65535) & 1) | ((zM3182 ? 1 : 0) & 65534);
                case 2982:
                    str = "ۢۨۢ";
                    break;
                case 31421:
                    zM3182 = C0368.m3182(m1033(this), e);
                    if (C0155.m1294() < 0) {
                        str = "ۦۨۥ";
                        break;
                    } else {
                        C0391.m5571();
                        str = "ۣۧۦ";
                        break;
                    }
            }
        }
    }
}
