package com.cloudinject.feature.p023;

import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p021.C0291;
import com.px.C0368;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0385;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.dalvik.system.C0399;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: com.cloudinject.feature.̙̙.̗̙̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
class C0325<E> extends AbstractC0302<E> {

    /* renamed from: ̗̗̖̙̙̙̙, reason: not valid java name and contains not printable characters */
    final Object f553;

    /* renamed from: ̗̗̗̗̗̖̖, reason: not valid java name and contains not printable characters */
    final AbstractC0313 f554;

    C0325(AbstractC0313 abstractC0313, Object obj) {
        this.f554 = abstractC0313;
        this.f553 = obj;
    }

    /* renamed from: ۟ۨۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m2799(Object obj) {
        String str = "۟ۨ";
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751678) {
                case 2034:
                case 2397:
                    str = "ۧۦ";
                    continue;
                case 2372:
                    if (C0380.m5068() <= 0) {
                        C0060.m216();
                        str = "۟۟۠";
                    } else {
                        str = "ۢۦۧ";
                        continue;
                    }
                case 4478:
                    str = "ۧۦ";
                    obj2 = obj3;
                    continue;
                case 4605:
                    str = "ۢۧ۟";
                    obj2 = null;
                    continue;
                case 5371:
                    break;
                case 7546:
                    if (C0291.m2568() < 0) {
                        str = "۠ۥۨ";
                    } else {
                        continue;
                    }
                case 29528:
                    if (C0025.m118() <= 0) {
                        str = "ۦۧۢ";
                    } else {
                        str = "۟ۨ";
                        continue;
                    }
                case 1728919:
                    if (C0385.m5282() > 0) {
                        break;
                    } else {
                        str = "ۨ۠";
                    }
                case 1730182:
                    obj3 = ((C0325) obj).f553;
                    str = "۠ۡۡ";
                    continue;
                case 1730209:
                    return obj2;
            }
            str = "۟۟ۤ";
        }
    }

    /* renamed from: ۢۧۡ۠, reason: not valid java name and contains not printable characters */
    public static AbstractC0313 m2800(Object obj) {
        Object obj2 = "ۣۧ";
        AbstractC0313 abstractC0313 = null;
        AbstractC0313 abstractC03132 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1749700) {
                case 5:
                case 1125:
                    obj2 = "ۣۤۤ";
                    continue;
                case 2052:
                    obj2 = "ۣۤۢ";
                    continue;
                case 2215:
                    return abstractC0313;
                case 3226:
                    if (C0387.m5374() >= 0) {
                        abstractC0313 = null;
                    } else {
                        obj2 = "ۣۤۧ";
                        abstractC0313 = null;
                        continue;
                    }
                case 3840:
                    break;
                case 6425:
                    if (C0399.m5914() <= 0) {
                        obj2 = "ۦۧ۠";
                    } else {
                        obj2 = "ۥۦ۟";
                        continue;
                    }
                case 7558:
                    if (C0334.m2866() <= 0) {
                        abstractC0313 = abstractC03132;
                    } else {
                        obj2 = "ۣۤۤ";
                        abstractC0313 = abstractC03132;
                        continue;
                    }
                case 31520:
                    abstractC03132 = ((C0325) obj).f554;
                    if (C0376.m4906() > 0) {
                        obj2 = "ۡۥۦ";
                    } else {
                        continue;
                    }
                case 1732229:
                    if (C0368.m3171() >= 0) {
                        C0376.m4906();
                        obj2 = "ۥ۠ۥ";
                    } else {
                        obj2 = "ۣۧ";
                        continue;
                    }
                case 1732256:
                    if (C0388.m5430() < 0) {
                        break;
                    } else if (C0383.m5203() <= 0) {
                        C0191.m1627();
                    } else {
                        obj2 = "ۨۨۤ";
                    }
            }
            obj2 = "۠ۨۥ";
        }
    }

    @Override // com.cloudinject.feature.p023.AbstractC0302
    /* renamed from: ̗̖̖ */
    public boolean mo2732(E e) {
        String str = "ۥۦۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749792) {
                case 3392:
                    return C0389.m5478(m2800(this), m2799(this), e);
                case 29031:
                    if (C0377.m4944() <= 0) {
                        break;
                    } else {
                        str = "ۥۦۡ";
                        break;
                    }
            }
        }
    }
}
