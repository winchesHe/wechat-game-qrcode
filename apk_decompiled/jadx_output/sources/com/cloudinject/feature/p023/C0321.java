package com.cloudinject.feature.p023;

import android.arch.p003.p005.C0060;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.feature.p018.C0229;
import com.px.C0368;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.os.mount.C0390;
import mirrorb.com.android.internal.content.C0395;
import p027.p028.p029.C0420;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: com.cloudinject.feature.̙̙.̗̙̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
class C0321<E> extends AbstractC0302<E> {

    /* renamed from: ̗̗̖̙̙̙̙, reason: not valid java name and contains not printable characters */
    final Object f552;

    C0321(Object obj) {
        this.f552 = obj;
    }

    /* renamed from: ۟ۤۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m2792(Object obj) {
        Object obj2 = "ۥۥ۠";
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 56545) {
                case 1822:
                    return obj3;
                case 1709316:
                    if (C0060.m216() > 0) {
                        obj2 = "۠ۥ۠";
                    } else {
                        continue;
                    }
                case 1710471:
                    if (C0390.m5512() <= 0) {
                        obj2 = "ۡۧۥ";
                    } else {
                        obj2 = "ۥۥ۠";
                        continue;
                    }
                case 1711782:
                    if (C0368.m3171() >= 0) {
                        C0380.m5068();
                        obj3 = obj4;
                    } else {
                        obj2 = "۠۟";
                        obj3 = obj4;
                        continue;
                    }
                case 1728841:
                    if (C0420.m6215() < 0) {
                        obj2 = "ۢۤ۟";
                    } else {
                        continue;
                    }
                case 1729185:
                    if (C0377.m4944() <= 0) {
                        break;
                    } else {
                        obj2 = "۠ۨۦ";
                    }
                case 1729801:
                    break;
                case 1729834:
                case 1732156:
                    if (C0379.m5056() > 0) {
                        obj2 = "۠۟";
                    } else {
                        continue;
                    }
                case 1734463:
                    obj4 = ((C0321) obj).f552;
                    if (C0179.m1427() > 0) {
                        obj2 = "ۦۧۨ";
                    } else {
                        continue;
                    }
                case 1734554:
                    if (C0088.m573() <= 0) {
                        C0086.m500();
                        obj3 = null;
                    } else {
                        obj2 = "ۥۣ۠";
                        obj3 = null;
                        continue;
                    }
            }
            if (C0229.m2064() < 0) {
                obj2 = "ۨۨۥ";
            }
        }
    }

    @Override // com.cloudinject.feature.p023.AbstractC0302
    /* renamed from: ̗̖̖ */
    public boolean mo2732(E e) {
        String str = "۟ۨۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753477) {
                case 27036:
                    return C0089.m617(e, m2792(this));
                case 32517:
                    if (C0377.m4944() > 0) {
                        str = "۟ۨۢ";
                        break;
                    } else {
                        C0420.m6215();
                        break;
                    }
            }
        }
    }
}
