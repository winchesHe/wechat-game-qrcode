package com.cloudinject.feature.p023;

import android.arch.lifecycle.p000.C0025;
import android.net.wifi.C0078;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.px.C0368;
import mirrorb.android.accounts.C0375;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.location.C0385;
import mirrorb.android.providers.C0391;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.dalvik.system.C0399;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: com.cloudinject.feature.̙̙.̖̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
class C0301<E> extends AbstractC0302<E> {

    /* renamed from: ̗̗̗̗̗̗̙, reason: not valid java name and contains not printable characters */
    final AbstractC0302 f538;

    C0301(AbstractC0302 abstractC0302) {
        this.f538 = abstractC0302;
    }

    /* renamed from: ۣۢۧۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC0302 m2731(Object obj) {
        String str = "۠ۦ۠";
        AbstractC0302 abstractC0302 = null;
        AbstractC0302 abstractC03022 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746781) {
                case 2491:
                    abstractC03022 = ((C0301) obj).f538;
                    str = "ۡ۠ۦ";
                    continue;
                case 2554:
                    if (C0368.m3171() >= 0) {
                        str = "ۤۨۥ";
                        abstractC0302 = abstractC03022;
                    } else {
                        str = "۟ۢ";
                        abstractC0302 = abstractC03022;
                        continue;
                    }
                case 2558:
                    str = "ۦۧۡ";
                    continue;
                case 3271:
                    if (C0380.m5068() < 0) {
                        break;
                    } else {
                        str = "ۡۢۧ";
                    }
                case 5597:
                    if (C0385.m5282() < 0) {
                        str = "۠ۦ۠";
                    } else {
                        continue;
                    }
                case 25882:
                case 25885:
                    if (C0382.m5180() <= 0) {
                        C0228.m2012();
                    } else {
                        str = "۟ۢ";
                        continue;
                    }
                case 28217:
                    if (C0382.m5180() <= 0) {
                        C0078.m361();
                        str = "ۤۤۢ";
                    } else {
                        str = "ۥۣ";
                        continue;
                    }
                case 28250:
                    break;
                case 1735619:
                    if (C0375.m4840() >= 0) {
                        C0385.m5282();
                        str = "ۣۥۣ";
                        abstractC0302 = null;
                    } else {
                        str = "ۡ۠ۢ";
                        abstractC0302 = null;
                        continue;
                    }
                case 1735870:
                    return abstractC0302;
            }
            if (C0391.m5571() <= 0) {
                C0155.m1294();
                str = "ۢ۠ۥ";
            } else {
                str = "ۨۤ۠";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cloudinject.feature.p023.AbstractC0302
    /* renamed from: ̗̖̖, reason: not valid java name and contains not printable characters */
    public boolean mo2732(E e) {
        boolean zM83 = false;
        String str = "۠ۥۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754384) {
                case 3190:
                    str = "۠ۥۥ";
                    break;
                case 28304:
                    zM83 = C0025.m83(m2731(this), e);
                    if (C0229.m2064() < 0) {
                        str = "۠ۦ";
                        break;
                    } else {
                        C0399.m5914();
                        break;
                    }
                case 1710358:
                    return (((zM83 ? 1 : 0) ^ 65535) & 1) | ((zM83 ? 1 : 0) & 65534);
            }
        }
    }
}
