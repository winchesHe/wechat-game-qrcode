package com.cloudinject.core.p009.p012;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.os.Handler;
import android.os.Message;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p010.InterfaceC0150;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.util.concurrent.atomic.AtomicBoolean;
import mirrorb.android.accounts.C0376;
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
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.core.̗.̗̙.̙̙, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0163 implements Handler.Callback, InterfaceC0150 {
    public static final String TAG = "HCallbackStub";

    /* renamed from: ̗̗̖̙̙̗̗, reason: not valid java name and contains not printable characters */
    private final AtomicBoolean f228;

    /* renamed from: ̗̗̙̙̖̖̗, reason: not valid java name and contains not printable characters */
    private Handler.Callback f229;

    public C0163() {
        String str = "ۨۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746939) {
                case 28318:
                    return;
                case 1735430:
                    this.f228 = new AtomicBoolean(false);
                    str = "ۨۤۡ";
                    break;
                case 1735708:
                    str = "ۨۥ";
                    break;
            }
        }
    }

    /* renamed from: ̗̖̙̖̗̙, reason: not valid java name and contains not printable characters */
    private Handler.Callback m1324() {
        return (Handler.Callback) C0088.m568(C0400.m5948(), m1332(this));
    }

    /* renamed from: ̗̙̖̙̗̖, reason: not valid java name and contains not printable characters */
    private Handler m1325() {
        Object objM5580 = null;
        String str = "ۧۦ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753416) {
                case 1193:
                    objM5580 = C0391.m5580();
                    if (C0379.m5056() <= 0) {
                        break;
                    } else {
                        str = "ۢۨۡ";
                        break;
                    }
                case 26122:
                    if (C0420.m6215() >= 0) {
                        break;
                    } else {
                        str = "ۧۦ۠";
                        break;
                    }
                case 29203:
                    return (Handler) C0088.m568(C0395.m5711(), objM5580);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a A[SYNTHETIC] */
    /* renamed from: ̙̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object m1326(java.lang.Object r7) {
        /*
            r6 = this;
            r3 = 0
            java.lang.String r0 = "۠ۧۥ"
            r1 = r0
            r2 = r3
            r4 = r3
        L6:
            int r0 = mirrorb.com.android.internal.content.C0395.m5690(r1)
            r5 = 56537(0xdcd9, float:7.9225E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 68: goto L12;
                case 1710517: goto L6c;
                case 1710558: goto L29;
                case 1710815: goto L1f;
                case 1711519: goto L6d;
                case 1730214: goto L6e;
                case 1731263: goto L7c;
                case 1734503: goto L50;
                case 1734555: goto L84;
                default: goto L11;
            }
        L11:
            goto L6
        L12:
            int r0 = mirrorb.android.hardware.location.C0383.m5203()
            if (r0 > 0) goto L80
            mirrorb.android.media.session.C0386.m5322()
            java.lang.String r0 = "ۣۤ"
            r1 = r0
            goto L6
        L1f:
            boolean r0 = mirrorb.com.android.internal.C0398.m5858(r4)
            if (r0 == 0) goto L84
            java.lang.String r0 = "ۤۥ۠"
            r1 = r0
            goto L6
        L29:
            java.lang.Class r0 = com.cloudinject.feature.p015.C0206.m1826()
            java.lang.String r0 = android.net.wifi.C0078.m352(r0)
            java.lang.Class r1 = android.arch.p003.p005.C0060.m194(r2)
            java.lang.String r1 = com.cloudinject.core.p009.p011.C0155.m1283(r1)
            boolean r0 = mirrorb.com.android.internal.content.C0395.m5699(r0, r1)
            if (r0 == 0) goto L7c
            int r0 = com.cloudinject.core.utils.compat.C0121.m1023()
            if (r0 < 0) goto L4c
            androidx.core.graphics.drawable.C0086.m500()
            java.lang.String r0 = "ۣ۠ۤ"
            r1 = r0
            goto L6
        L4c:
            java.lang.String r0 = "ۦ۟۟"
            r1 = r0
            goto L6
        L50:
            mirrorb.RefObject r0 = com.cloudinject.p025.p026.C0346.m3069()
            java.lang.Object r0 = androidx.core.p007.C0088.m568(r0, r7)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r4 = androidx.core.p007.C0088.m554(r0)
            int r0 = mirrorb.com.android.internal.content.C0395.m5698()
            if (r0 < 0) goto L68
            mirrorb.android.location.C0385.m5282()
            goto L6
        L68:
            java.lang.String r0 = "ۧۧۦ"
            r1 = r0
            goto L6
        L6c:
            r2 = r3
        L6d:
            return r2
        L6e:
            java.lang.Object r2 = mirrorb.com.android.internal.C0398.m5850(r4)
            int r0 = mirrorb.android.accounts.C0375.m4840()
            if (r0 >= 0) goto L6
            java.lang.String r0 = "ۧ۟۟"
            r1 = r0
            goto L6
        L7c:
            java.lang.String r0 = "ۧۧۦ"
            r1 = r0
            goto L6
        L80:
            java.lang.String r0 = "۠ۧۥ"
            r1 = r0
            goto L6
        L84:
            int r0 = mirrorb.android.content.res.C0379.m5056()
            if (r0 > 0) goto L8f
            java.lang.String r0 = "۠ۡۥ"
            r1 = r0
            goto L6
        L8f:
            java.lang.String r0 = "ۧۢۧ"
            r1 = r0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.p009.p012.C0163.m1326(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x000b A[SYNTHETIC] */
    /* renamed from: ̙̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m1327(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.p009.p012.C0163.m1327(java.lang.Object):boolean");
    }

    /* renamed from: ۟ۡۡۡ۠, reason: not valid java name and contains not printable characters */
    public static Handler.Callback m1328(Object obj) {
        String str = "ۨۤۢ";
        Handler.Callback callback = null;
        Handler.Callback callback2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749606) {
                case 263:
                    callback2 = ((C0163) obj).f229;
                    if (C0025.m118() <= 0) {
                        C0083.m448();
                        str = "ۣۤۤ";
                    } else {
                        str = "ۧۧۢ";
                        continue;
                    }
                case 1024:
                    if (C0155.m1294() >= 0) {
                        str = "ۧۨ۟";
                    } else {
                        str = "ۣۡۧ";
                        continue;
                    }
                case 2296:
                    return callback;
                case 2947:
                case 28740:
                    if (C0206.m1807() < 0) {
                        str = "ۤۦ۠";
                    } else {
                        continue;
                    }
                case 6275:
                    if (C0368.m3171() < 0) {
                        str = "ۨۤۢ";
                    } else {
                        continue;
                    }
                case 7523:
                    str = "ۣۧۥ";
                    callback = null;
                    continue;
                case 29796:
                    if (C0379.m5056() <= 0) {
                        str = "ۣۧۥ";
                        callback = callback2;
                    } else {
                        str = "ۤۦ۠";
                        callback = callback2;
                        continue;
                    }
                case 30703:
                    if (C0398.m5833() <= 0) {
                        C0164.m1359();
                    } else {
                        str = "ۤ۠ۡ";
                        continue;
                    }
                case 31488:
                    if (C0073.m265() < 0) {
                        break;
                    } else {
                        str = "ۢۨۧ";
                    }
                case 1732313:
                    break;
            }
            if (C0387.m5374() < 0) {
                str = "ۣۢۥ";
            }
        }
    }

    /* renamed from: ۣ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m1329(Object obj, Object obj2) {
        Object obj3 = "۟۠ۡ";
        Object obj4 = null;
        Object objM1326 = null;
        while (true) {
            switch (C0395.m5690(obj3) ^ 1746753) {
                case 97:
                    if (C0378.m4998() <= 0) {
                        break;
                    } else if (C0390.m5512() <= 0) {
                        C0382.m5180();
                    } else {
                        obj3 = "ۥۥ۟";
                    }
                case 2243:
                    obj3 = "ۡۡۤ";
                    continue;
                case 2437:
                    obj3 = "ۣ۠ۤ";
                    obj4 = null;
                    continue;
                case 3102:
                    if (C0399.m5914() <= 0) {
                        C0078.m361();
                    } else {
                        obj3 = "۠۟ۨ";
                        continue;
                    }
                case 3464:
                case 5382:
                    if (C0191.m1627() >= 0) {
                        obj3 = "ۦۥۥ";
                    } else {
                        obj3 = "ۦۥۤ";
                        continue;
                    }
                case 5148:
                    break;
                case 6463:
                    if (C0086.m500() <= 0) {
                        obj3 = "ۣ۠ۧ";
                        obj4 = objM1326;
                    } else {
                        obj3 = "ۦۥۤ";
                        obj4 = objM1326;
                        continue;
                    }
                case 6526:
                    objM1326 = ((C0163) obj).m1326(obj2);
                    if (C0089.m592() > 0) {
                        obj3 = "ۥۧ۠";
                    } else {
                        continue;
                    }
                case 25924:
                    return obj4;
                case 28360:
                    if (C0362.m3122() < 0) {
                        obj3 = "۟۠ۡ";
                    } else {
                        continue;
                    }
            }
            obj3 = "ۡۧۨ";
        }
    }

    /* renamed from: ۡۧۦۧ, reason: not valid java name and contains not printable characters */
    public static Handler.Callback m1330(Object obj) {
        String str = "ۢۢۦ";
        Handler.Callback callback = null;
        Handler.Callback callbackM1324 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751562) {
                case 79:
                    if (C0377.m4944() <= 0) {
                        C0394.m5672();
                        callback = null;
                    } else {
                        str = "ۦ۠ۡ";
                        callback = null;
                        continue;
                    }
                case 175:
                    callbackM1324 = ((C0163) obj).m1324();
                    str = "ۦۧ۠";
                    continue;
                case 2220:
                    if (C0009.m36() >= 0) {
                        break;
                    } else {
                        str = C0379.m5056() <= 0 ? "ۧۥ۠" : "ۤۦۧ";
                    }
                case 3208:
                    return callback;
                case 3221:
                    if (C0074.m307() >= 0) {
                        str = "ۧۦۡ";
                    } else {
                        str = "ۣۤۤ";
                        continue;
                    }
                case 4290:
                case 31631:
                    str = "ۣۣۢ";
                    continue;
                case 7435:
                    break;
                case 30773:
                    str = "ۣۣۢ";
                    callback = callbackM1324;
                    continue;
                case 31597:
                    if (C0083.m448() >= 0) {
                        C0386.m5322();
                    } else {
                        str = "ۦۡ۠";
                        continue;
                    }
                case 1730193:
                    if (C0395.m5698() >= 0) {
                        C0334.m2866();
                    } else {
                        str = "ۢۢۦ";
                        continue;
                    }
            }
            if (C0389.m5481() > 0) {
                str = "ۣۤ۠";
            }
        }
    }

    /* renamed from: ۢۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m1331(Object obj) {
        String str = "ۣۨۧ";
        AtomicBoolean atomicBoolean = null;
        AtomicBoolean atomicBoolean2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753702) {
                case 38:
                case 29828:
                    if (C0376.m4906() <= 0) {
                        C0386.m5322();
                    } else {
                        str = "ۤۥۦ";
                        continue;
                    }
                case 1997:
                    if (C0074.m307() >= 0) {
                        C0229.m2064();
                        str = "ۢۢۨ";
                    } else {
                        str = "۠۠ۡ";
                        continue;
                    }
                case 2978:
                    if (C0383.m5203() < 0) {
                        break;
                    } else {
                        str = "ۥ۠ۧ";
                    }
                case 26046:
                    if (C0383.m5203() <= 0) {
                        C0380.m5068();
                        str = "ۧۢۢ";
                    } else {
                        str = "ۦۧۡ";
                        continue;
                    }
                case 26759:
                    str = "۟ۦ۟";
                    atomicBoolean = null;
                    continue;
                case 27066:
                    str = "ۣۨۧ";
                    continue;
                case 30947:
                    return atomicBoolean;
                case 32714:
                    atomicBoolean2 = ((C0163) obj).f228;
                    if (C0179.m1427() <= 0) {
                        C0382.m5180();
                        str = "ۢ۟ۦ";
                    } else {
                        str = "۟ۥ";
                        continue;
                    }
                case 1710464:
                    if (C0378.m4998() <= 0) {
                        C0183.m1464();
                        atomicBoolean = atomicBoolean2;
                    } else {
                        str = "ۤۥۦ";
                        atomicBoolean = atomicBoolean2;
                        continue;
                    }
                case 1711845:
                    break;
            }
            if (C0368.m3171() < 0) {
                str = "ۧۤۨ";
            }
        }
    }

    /* renamed from: ۧۥۢۧ, reason: not valid java name and contains not printable characters */
    public static Handler m1332(Object obj) {
        String str = "ۣۡۥ";
        Handler handler = null;
        Handler handlerM1325 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755404) {
                case 132:
                    if (C0377.m4944() <= 0) {
                        C0184.m1524();
                        str = "۠ۦۡ";
                    } else {
                        str = "ۣۤ۟";
                        continue;
                    }
                case 137:
                    if (C0155.m1294() >= 0) {
                        str = "ۤۤ۟";
                    } else {
                        str = "ۣۡۥ";
                        continue;
                    }
                case 2898:
                    if (C0386.m5322() <= 0) {
                        str = "ۢۤۧ";
                        handler = null;
                    } else {
                        str = "ۨۥۥ";
                        handler = null;
                        continue;
                    }
                case 25166:
                    return handler;
                case 25231:
                    if (C0088.m573() <= 0) {
                        str = "۟ۦۥ";
                        handler = handlerM1325;
                    } else {
                        str = "ۣ۠ۥ";
                        handler = handlerM1325;
                        continue;
                    }
                case 26127:
                    if (C0164.m1359() > 0) {
                        break;
                    } else if (C0370.m3284() < 0) {
                        str = "ۤۧۥ";
                    }
                case 26284:
                case 29516:
                    if (C0088.m573() <= 0) {
                        C0382.m5180();
                    } else {
                        str = "ۣ۠ۥ";
                        continue;
                    }
                case 26501:
                    if (C0370.m3284() >= 0) {
                        C0082.m410();
                    } else {
                        str = "ۦۨ۠";
                        continue;
                    }
                case 29476:
                    break;
                case 29646:
                    handlerM1325 = ((C0163) obj).m1325();
                    str = "۠ۥۨ";
                    continue;
            }
            str = "ۡ۟ۧ";
        }
    }

    /* renamed from: ۨۤۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1333(Object obj, Object obj2) {
        Object obj3 = "ۤۤ";
        boolean z = false;
        boolean zM1327 = false;
        while (true) {
            switch (C0395.m5690(obj3) ^ 1752519) {
                case 1860:
                    obj3 = "ۨۧۦ";
                    continue;
                case 1959:
                    obj3 = "۟۟ۢ";
                    z = zM1327;
                    continue;
                case 1987:
                    zM1327 = ((C0163) obj).m1327(obj2);
                    if (C0082.m410() >= 0) {
                        C0387.m5374();
                    } else {
                        obj3 = "ۤۤ۠";
                        continue;
                    }
                case 2875:
                case 6787:
                    obj3 = "۟۟ۢ";
                    continue;
                case 4902:
                    if (C0390.m5512() <= 0) {
                        C0386.m5322();
                        obj3 = "ۥۥۦ";
                    } else {
                        obj3 = "۟ۡۦ";
                        continue;
                    }
                case 6853:
                    return z;
                case 29696:
                    obj3 = "ۡۢۢ";
                    z = false;
                    continue;
                case 29899:
                    break;
                case 29967:
                    obj3 = "ۤۤ";
                    continue;
                case 1728839:
                    if (C0369.m3256() < 0) {
                        break;
                    } else {
                        obj3 = "ۤۡۡ";
                    }
            }
            obj3 = "ۤۥۤ";
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        String str = "ۦۧۨ";
        boolean zM1630 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750780) {
                case 3:
                    if (C0073.m265() <= 0) {
                        C0073.m265();
                    } else {
                        str = "ۣۡۡ";
                    }
                case 123:
                case 6168:
                    return false;
                case 124:
                    str = "ۡۢۥ";
                case 479:
                    return true;
                case 1504:
                    if (C0377.m4958(message) == C0380.m5082(C0384.m5262())) {
                        str = C0376.m4906() <= 0 ? "ۣۢۥ" : "۟۠ۦ";
                    }
                case 2137:
                case 2268:
                    if (!C0088.m562()) {
                        str = "ۢۦ۠";
                    } else if (C0396.m5741() < 0) {
                        str = "ۤۦۡ";
                    }
                case 3171:
                    str = C0377.m4958(message) == C0380.m5082(C0384.m5263()) ? "ۧۤ۟" : "ۦۧۢ";
                case 3227:
                    if (C0335.m2923() >= 0) {
                        C0279.m2491();
                        str = "ۣۤۥ";
                    } else {
                        str = "ۥۤ۟";
                    }
                case 3261:
                case 4478:
                    C0377.m4937(m1331(this), false);
                    str = C0183.m1464() <= 0 ? "ۦۣۡ" : "ۣۣۧ";
                case 4568:
                    zM1630 = C0191.m1630(m1328(this), message);
                    str = "ۨۨ۠";
                case 4569:
                    if (m1333(this, C0121.m983(message))) {
                        str = "ۡۤۤ";
                    }
                case 4607:
                    str = "ۦۧۨ";
                case 6207:
                case 30582:
                    str = C0379.m5056() <= 0 ? "ۨۡۨ" : "ۣۨۤ";
                case 6621:
                    try {
                        C0378.m4980(m1332(this), C0384.m5256(message));
                        if (C0377.m4944() > 0) {
                            str = "ۣۣۧ";
                        }
                    } catch (Throwable th) {
                        C0377.m4937(m1331(this), false);
                        throw th;
                    }
                case 6626:
                    return zM1630;
                case 29534:
                    if (m1333(this, C0121.m983(message))) {
                        str = C0346.m3059() >= 0 ? "۟ۦۤ" : "ۨۡۥ";
                    }
                case 29658:
                    str = "ۢۦ۠";
                case 29883:
                    if (C0078.m374(m1331(this), true)) {
                        str = "ۡۢۥ";
                    } else if (C0291.m2568() >= 0) {
                        C0362.m3122();
                    } else {
                        str = "ۥۤ۟";
                    }
                case 29885:
                    str = m1328(this) != null ? "۟۠ۥ" : "ۣ۟ۦ";
                case 30608:
                    if (C0380.m5068() <= 0) {
                        C0346.m3059();
                        str = "۠ۤۤ";
                    } else {
                        str = "ۨۨ۠";
                    }
                case 32540:
                    C0377.m4937(m1331(this), false);
                    str = C0369.m3256() <= 0 ? "ۦۡۨ" : "ۡۤۡ";
                case 32667:
                    C0377.m4937(m1331(this), false);
                    if (C0121.m1023() < 0) {
                        str = "ۣۨۨ";
                    }
                case 32752:
                    C0378.m4980(m1332(this), C0384.m5256(message));
                    if (C0078.m361() > 0) {
                        str = "ۣۨۤ";
                    }
            }
        }
    }

    @Override // com.cloudinject.core.p009.p010.InterfaceC0150
    /* renamed from: ̗̖̙̙̙̗ */
    public boolean mo1234() {
        String str = "ۡ۠ۨ";
        boolean z = false;
        Handler.Callback callbackM1330 = null;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753575) {
                case 1088:
                    str = "ۣۡۤ";
                    z2 = false;
                    continue;
                case 1089:
                    str = "۠۠ۦ";
                    z2 = z;
                    continue;
                case 2349:
                    if (callbackM1330 == null) {
                        break;
                    } else {
                        str = "ۤۢۤ";
                    }
                case 26299:
                case 28380:
                    str = "ۣۡۤ";
                    continue;
                case 27393:
                    str = "۟ۢ۟";
                    continue;
                case 28359:
                    return z2;
                case 28494:
                    callbackM1330 = m1330(this);
                    if (C0396.m5741() < 0) {
                        str = "ۨ۟ۡ";
                    } else {
                        continue;
                    }
                case 28527:
                    if (C0335.m2923() >= 0) {
                        str = "ۣۨۧ";
                    } else {
                        str = "ۡ۠ۨ";
                        continue;
                    }
                case 29435:
                    z = true;
                    if (C0335.m2923() < 0) {
                        str = "ۣۧۤ";
                    } else {
                        continue;
                    }
                case 31681:
                    if (callbackM1330 == this) {
                        break;
                    } else {
                        str = "ۢۦ۠";
                    }
                case 31818:
                    str = "ۧۤۤ";
                    continue;
                case 1711460:
                    break;
            }
            if (C0384.m5278() > 0) {
                str = "ۥ۠ۨ";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    @Override // com.cloudinject.core.p009.p010.InterfaceC0150
    /* renamed from: ̗̙̖̖̗̖ */
    public void mo1223() {
        String str = "ۡۡۥ";
        Handler.Callback callbackM1328 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754592) {
                case 1190:
                    break;
                case 25119:
                    this.f229 = null;
                    if (C0390.m5512() <= 0) {
                        C0073.m265();
                    } else {
                        str = "ۥ۠";
                    }
                case 27330:
                case 27429:
                    this.f229 = m1330(this);
                    if (C0291.m2568() < 0) {
                        str = "ۢۥۧ";
                    }
                case 29509:
                    if (C0228.m2012() > 0) {
                        str = "ۡۡۥ";
                    }
                case 30434:
                    str = C0395.m5699(C0078.m352(C0060.m194(callbackM1328)), C0078.m352(C0060.m194(this))) ? "۟ۧۧ" : "ۥ۠";
                case 30436:
                    callbackM1328 = m1328(this);
                    str = "ۦۥ";
                case 31722:
                    str = callbackM1328 != this ? "ۢۥۥ" : "۟ۧۧ";
                case 32545:
                case 1710431:
                    if (callbackM1328 != null) {
                        str = "ۥۣۨ";
                    }
                case 1710459:
                    C0393.m5655(C0400.m5948(), m1332(this), this);
                    str = "ۦ۟۟";
            }
            return;
        }
    }

    @Override // com.cloudinject.core.p009.p010.InterfaceC0150
    /* renamed from: ̗̙̙̙̖̗ */
    public void mo1235() {
    }
}
