package com.cloudinject.feature.p023.p024;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.os.Handler;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.px.C0368;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import mirrorb.android.accounts.C0375;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;

/* renamed from: com.cloudinject.feature.̙̙.̗.̗̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0310<T> {

    /* renamed from: ̖̙̖̙̖̙̖, reason: not valid java name and contains not printable characters */
    private static final Handler f544;

    /* renamed from: ̙̖̖̙̙̖̖, reason: not valid java name and contains not printable characters */
    private static final ExecutorService f545;

    /* renamed from: ̙̖̖̙̖̙̖, reason: not valid java name and contains not printable characters */
    private InterfaceC0306<T> f546;

    /* renamed from: ̙̖̙̖̙̖̖, reason: not valid java name and contains not printable characters */
    private final LinkedList<AbstractC0307<T>> f547;

    /* renamed from: ̙̖̙̙̙̙̖, reason: not valid java name and contains not printable characters */
    private final AbstractC0307<T> f548;

    static {
        String str = "ۧۡ۟";
        Integer num = null;
        int iIntValue = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746942) {
                case 6648:
                    f544 = new Handler(C0399.m5866());
                    if (C0368.m3171() >= 0) {
                        break;
                    } else {
                        str = "ۤۦۣ";
                        break;
                    }
                case 7457:
                    if (C0082.m410() < 0) {
                        str = "ۧۡ۟";
                        break;
                    } else {
                        str = "ۦۨ۟";
                        break;
                    }
                case 7519:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    if (C0398.m5833() > 0) {
                        str = "ۨۡۡ";
                        break;
                    } else {
                        C0229.m2064();
                        str = "ۣۤۤ";
                        break;
                    }
                case 25243:
                    return;
                case 25275:
                    num = new Integer(4171862);
                    if (C0025.m118() > 0) {
                        str = "ۥۣۤ";
                        break;
                    } else {
                        C0388.m5430();
                        break;
                    }
                case 28406:
                    f545 = C0025.m122(((iIntValue ^ (-1)) & 4171860) | ((-4171861) & iIntValue));
                    str = "ۧۢ۠";
                    break;
            }
        }
    }

    public C0310() {
        String str = "ۢۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746724) {
                case 2235:
                    return;
                case 4154:
                    this.f548 = new C0309(this);
                    if (C0083.m448() < 0) {
                        str = "ۡۨۦ";
                        break;
                    } else {
                        C0380.m5068();
                        break;
                    }
                case 25123:
                    str = "ۢۢ";
                    break;
                case 1735524:
                    this.f547 = new LinkedList<>();
                    if (C0380.m5068() <= 0) {
                        break;
                    } else {
                        str = "ۣۣۨ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static <T> C0310<T> m2756(InterfaceC0306<T> interfaceC0306) {
        C0310<T> c0310 = null;
        String str = "ۢۨۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746723) {
                case 161:
                    ((C0310) c0310).f546 = interfaceC0306;
                    if (C0229.m2064() < 0) {
                        str = "۠۠ۦ";
                        break;
                    } else {
                        str = "ۣۤۨ";
                        break;
                    }
                case 3525:
                    return c0310;
                case 5186:
                    c0310 = new C0310<>();
                    str = "ۣ۟ۦ";
                    break;
                case 25927:
                    if (C0279.m2491() < 0) {
                        str = "ۢۨۧ";
                        break;
                    } else {
                        str = "ۣۤۧ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ۟۠ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static ExecutorService m2761() {
        String str = "ۤۡۦ";
        ExecutorService executorService = null;
        ExecutorService executorService2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748739) {
                case 1123:
                    if (C0228.m2012() <= 0) {
                        C0398.m5833();
                    } else {
                        str = "۟۠۟";
                        continue;
                    }
                case 1813:
                    return executorService;
                case 2077:
                    str = "ۨۡۨ";
                    executorService = null;
                    continue;
                case 2172:
                    executorService2 = f545;
                    if (C0074.m307() < 0) {
                        str = "ۥ۠ۥ";
                    } else {
                        continue;
                    }
                case 2274:
                case 7230:
                    if (C0394.m5672() > 0) {
                        str = "۟ۨ۟";
                    } else {
                        continue;
                    }
                case 4777:
                    str = "۟ۨ۟";
                    executorService = executorService2;
                    continue;
                case 5386:
                    if (C0009.m36() > 0) {
                        break;
                    } else if (C0368.m3171() < 0) {
                        str = "ۣۣ۟";
                    }
                case 7588:
                    if (C0375.m4840() >= 0) {
                        str = "۟ۥۤ";
                    } else {
                        str = "ۤۡۦ";
                        continue;
                    }
                case 26124:
                    if (C0334.m2866() > 0) {
                        str = "۟ۦۨ";
                    } else {
                        continue;
                    }
                case 27172:
                    break;
            }
            if (C0397.m5814() <= 0) {
                C0368.m3171();
            } else {
                str = "۠ۤۤ";
            }
        }
    }

    /* renamed from: ۟ۢۨۢۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0306 m2762(Object obj) {
        Object obj2 = "ۥۢۢ";
        InterfaceC0306<T> interfaceC0306 = null;
        InterfaceC0306<T> interfaceC03062 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1753635) {
                case 97:
                    obj2 = "۟۠۟";
                    interfaceC0306 = null;
                    continue;
                case 1871:
                case 28952:
                    if (C0397.m5814() <= 0) {
                        C0399.m5914();
                    } else {
                        obj2 = "ۥۨ۟";
                        continue;
                    }
                case 2760:
                    break;
                case 25917:
                    obj2 = "ۧۢۧ";
                    continue;
                case 26975:
                    obj2 = "ۦۣۧ";
                    continue;
                case 27007:
                    if (C0399.m5914() <= 0) {
                        C0083.m448();
                        interfaceC0306 = interfaceC03062;
                    } else {
                        obj2 = "ۥۨ۟";
                        interfaceC0306 = interfaceC03062;
                        continue;
                    }
                case 27069:
                    if (C0382.m5180() <= 0) {
                        C0386.m5322();
                        obj2 = "ۦۤ۠";
                    } else {
                        obj2 = "ۥۢۢ";
                        continue;
                    }
                case 31935:
                    return interfaceC0306;
                case 32676:
                    interfaceC03062 = ((C0310) obj).f546;
                    if (C0378.m4998() > 0) {
                        obj2 = "۠ۤ۠";
                    } else {
                        continue;
                    }
                case 32710:
                    if (C0383.m5203() <= 0) {
                        break;
                    } else if (C0229.m2064() < 0) {
                        obj2 = "ۥ۟ۡ";
                    }
            }
            if (C0397.m5814() <= 0) {
                C0399.m5914();
                obj2 = "ۢۢۢ";
            } else {
                obj2 = "۠ۥۡ";
            }
        }
    }

    /* renamed from: ۟ۥۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static AbstractC0307 m2763(Object obj) {
        Object obj2 = "ۣۡۢ";
        AbstractC0307<T> abstractC0307 = null;
        AbstractC0307<T> abstractC03072 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1747652) {
                case 1062:
                    if (C0399.m5914() < 0) {
                        break;
                    } else if (C0384.m5278() <= 0) {
                        C0164.m1359();
                    } else {
                        obj2 = "ۣۢۤ";
                    }
                case 6181:
                    abstractC03072 = ((C0310) obj).f548;
                    if (C0009.m36() >= 0) {
                        C0390.m5512();
                    } else {
                        obj2 = "ۢۢ۟";
                        continue;
                    }
                case 6235:
                    if (C0388.m5430() <= 0) {
                        C0390.m5512();
                        abstractC0307 = abstractC03072;
                    } else {
                        obj2 = "ۦۤۥ";
                        abstractC0307 = abstractC03072;
                        continue;
                    }
                case 6619:
                    if (C0383.m5203() <= 0) {
                        C0083.m448();
                    } else {
                        obj2 = "ۣۧۤ";
                        continue;
                    }
                case 7405:
                case 28422:
                    if (C0399.m5914() <= 0) {
                        C0229.m2064();
                    } else {
                        obj2 = "ۦۤۥ";
                        continue;
                    }
                case 7643:
                    if (C0388.m5430() > 0) {
                        obj2 = "ۣۡۢ";
                    } else {
                        continue;
                    }
                case 27427:
                    return abstractC0307;
                case 27533:
                    obj2 = "ۧۥ۠";
                    continue;
                case 28514:
                    obj2 = "ۦ۟ۢ";
                    abstractC0307 = null;
                    continue;
                case 28576:
                    break;
            }
            if (C0334.m2866() > 0) {
                obj2 = "ۢۦۣ";
            }
        }
    }

    /* renamed from: ۣ۟ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static LinkedList m2764(Object obj) {
        Object obj2 = "۠ۢۧ";
        LinkedList<AbstractC0307<T>> linkedList = null;
        LinkedList<AbstractC0307<T>> linkedList2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1746879) {
                case 2180:
                    linkedList2 = ((C0310) obj).f547;
                    if (C0073.m265() > 0) {
                        obj2 = "ۦ۟۟";
                    } else {
                        continue;
                    }
                case 2206:
                    if (C0368.m3171() >= 0) {
                        linkedList = null;
                    } else {
                        obj2 = "ۥ۟";
                        linkedList = null;
                        continue;
                    }
                case 3226:
                    if (C0388.m5430() < 0) {
                        break;
                    } else {
                        obj2 = "ۡۥ۟";
                    }
                case 4382:
                case 7608:
                    if (C0228.m2012() > 0) {
                        obj2 = "ۧۨۦ";
                    } else {
                        continue;
                    }
                case 5466:
                    if (C0083.m448() >= 0) {
                        obj2 = "ۥۥ۠";
                    } else {
                        obj2 = "۠ۢۧ";
                        continue;
                    }
                case 24986:
                    return linkedList;
                case 25109:
                    break;
                case 26361:
                    if (C0391.m5571() <= 0) {
                        linkedList = linkedList2;
                    } else {
                        obj2 = "ۧۨۦ";
                        linkedList = linkedList2;
                        continue;
                    }
                case 28336:
                    obj2 = "ۡۤۤ";
                    continue;
                case 1735461:
                    if (C0164.m1359() >= 0) {
                        C0377.m4944();
                    } else {
                        obj2 = "ۤۡۤ";
                        continue;
                    }
            }
            obj2 = "ۨۡۨ";
        }
    }

    /* renamed from: ۥۥۢۦ, reason: contains not printable characters */
    public static Handler m2765() {
        String str = "ۧ۟۠";
        Handler handler = null;
        Handler handler2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747903) {
                case 1086:
                    break;
                case 1214:
                    if (C0179.m1427() <= 0) {
                        C0060.m216();
                    } else {
                        str = "ۥۣۥ";
                        continue;
                    }
                case 5560:
                case 28184:
                    str = "ۦۣۥ";
                    continue;
                case 27070:
                    str = "ۦ۠ۢ";
                    continue;
                case 27255:
                    return handler;
                case 27351:
                    if (C0083.m448() >= 0) {
                        C0179.m1427();
                        handler = null;
                    } else {
                        str = "ۣۣۡ";
                        handler = null;
                        continue;
                    }
                case 28279:
                    if (C0279.m2491() >= 0) {
                        C0396.m5741();
                    } else {
                        str = "ۧ۟۠";
                        continue;
                    }
                case 28343:
                    if (C0387.m5374() > 0) {
                        break;
                    } else if (C0386.m5322() > 0) {
                        str = "ۢۦ";
                    }
                case 1734590:
                    if (C0389.m5481() <= 0) {
                        C0398.m5833();
                        str = "ۦۣۡ";
                        handler = handler2;
                    } else {
                        str = "ۦۣۥ";
                        handler = handler2;
                        continue;
                    }
                case 1734651:
                    handler2 = f544;
                    if (C0083.m448() >= 0) {
                        str = "ۧ۠ۤ";
                    } else {
                        str = "۠ۡ";
                        continue;
                    }
            }
            str = "ۦۥ۠";
        }
    }

    public void start() {
        String str = "ۢۨ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56540) {
                case 1710362:
                    str = "ۢۨ۠";
                    break;
                case 1732486:
                    C0191.m1638(m2761(), new RunnableC0308(this));
                    str = "ۡۧۡ";
                    break;
                case 1733543:
                    return;
            }
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public C0310<T> m2766(AbstractC0307<T> abstractC0307) {
        String str = "ۨۦۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754625) {
                case 4002:
                    C0382.m5161(m2764(this), abstractC0307);
                    if (C0379.m5056() > 0) {
                        str = "ۨۤ";
                        break;
                    } else {
                        str = "ۣۡۡ";
                        break;
                    }
                case 28056:
                    if (C0386.m5322() > 0) {
                        str = "ۨۦۡ";
                        break;
                    } else {
                        C0392.m5595();
                        break;
                    }
                case 1710845:
                    return this;
            }
        }
    }
}
