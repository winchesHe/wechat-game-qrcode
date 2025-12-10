package com.cloudinject.feature.p019;

import android.app.Activity;
import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.database.C0074;
import android.net.C0083;
import android.net.wifi.C0078;
import android.view.View;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import java.util.concurrent.atomic.AtomicBoolean;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̗̙.̖̙̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ViewOnClickListenerC0244 implements View.OnClickListener {
    private int action;

    /* renamed from: ̗̗̖̖̗̗̙, reason: not valid java name and contains not printable characters */
    private String f410;

    /* renamed from: ̗̗̖̗̙̗̗, reason: not valid java name and contains not printable characters */
    final C0246 f411;

    /* renamed from: ̗̗̙̖̗̙̙, reason: not valid java name and contains not printable characters */
    private Activity f412;

    public ViewOnClickListenerC0244(C0246 c0246, String str, int i, Activity activity) {
        this.f411 = c0246;
        String str2 = "ۣ۠ۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1746881) {
                case 3267:
                    this.f410 = str;
                    if (C0179.m1427() > 0) {
                        str2 = "ۨۤۡ";
                        break;
                    } else {
                        str2 = "ۡۧۥ";
                        break;
                    }
                case 4318:
                    this.f412 = activity;
                    str2 = "ۧۥۣ";
                    break;
                case 25092:
                    return;
                case 26118:
                    if (C0386.m5322() > 0) {
                        str2 = "ۣ۠ۡ";
                        break;
                    } else {
                        C0395.m5698();
                        break;
                    }
                case 28324:
                    this.action = i;
                    if (C0121.m1023() < 0) {
                        str2 = "ۣۨۤ";
                        break;
                    } else {
                        C0155.m1294();
                        str2 = "ۥۦ۟";
                        break;
                    }
            }
        }
    }

    /* renamed from: ۟ۢ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static Activity m2167(Object obj) {
        Object obj2 = "ۢۢۨ";
        Activity activity = null;
        Activity activity2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1750593) {
                case 35:
                    if (C0391.m5571() > 0) {
                        obj2 = "ۢۢۨ";
                    } else {
                        continue;
                    }
                case 355:
                    obj2 = "ۣۧۧ";
                    activity = null;
                    continue;
                case 1065:
                    if (C0155.m1294() < 0) {
                        obj2 = "ۣۨۧ";
                    } else {
                        continue;
                    }
                case 1257:
                    if (C0377.m4944() <= 0) {
                        break;
                    } else {
                        obj2 = "۟ۧ";
                    }
                case 4453:
                    obj2 = "ۧ۠ۥ";
                    activity = activity2;
                    continue;
                case 28738:
                    if (C0385.m5282() >= 0) {
                        C0384.m5278();
                        obj2 = "ۢۢۤ";
                    } else {
                        obj2 = "ۦۥۦ";
                        continue;
                    }
                case 29549:
                    return activity;
                case 29639:
                case 29766:
                    obj2 = "ۧ۠ۥ";
                    continue;
                case 30635:
                    break;
                case 1732009:
                    activity2 = ((ViewOnClickListenerC0244) obj).f412;
                    if (C0391.m5571() <= 0) {
                        C0398.m5833();
                    } else {
                        obj2 = "۟۠ۥ";
                        continue;
                    }
            }
            obj2 = "ۢ۠ۦ";
        }
    }

    /* renamed from: ۟ۤۢۦۣ, reason: not valid java name and contains not printable characters */
    public static C0246 m2168(Object obj) {
        String str = "ۣۥۤ";
        C0246 c0246 = null;
        C0246 c02462 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752493) {
                case 2927:
                    if (C0083.m448() >= 0) {
                        break;
                    } else if (C0009.m36() >= 0) {
                        C0391.m5571();
                    } else {
                        str = "۠ۨ۟";
                    }
                case 5745:
                case 31780:
                    if (C0381.m5127() > 0) {
                        str = "ۢۨ";
                    } else {
                        continue;
                    }
                case 5754:
                    c02462 = ((ViewOnClickListenerC0244) obj).f411;
                    str = "ۨۡۥ";
                    continue;
                case 29807:
                    if (C0387.m5374() >= 0) {
                        str = "ۥ۠ۦ";
                    } else {
                        str = "ۨ۟۠";
                        continue;
                    }
                case 29857:
                    str = "ۢۨ";
                    c0246 = c02462;
                    continue;
                case 30022:
                    if (C0335.m2923() < 0) {
                        str = "ۣۥۤ";
                    } else {
                        continue;
                    }
                case 30052:
                    if (C0420.m6215() >= 0) {
                        str = "ۡۦۢ";
                        c0246 = null;
                    } else {
                        str = "ۧۧۧ";
                        c0246 = null;
                        continue;
                    }
                case 30830:
                    break;
                case 31658:
                    if (C0183.m1464() > 0) {
                        str = "۠ۨۤ";
                    } else {
                        continue;
                    }
                case 1729003:
                    return c0246;
            }
            if (C0335.m2923() < 0) {
                str = "ۨۧۡ";
            }
        }
    }

    /* renamed from: ۟ۦۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m2169(Object obj) {
        String str = "ۣۣۢ";
        AtomicBoolean atomicBoolean = null;
        AtomicBoolean atomicBooleanM2192 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747656) {
                case 4302:
                    if (C0346.m3059() < 0) {
                        str = "ۣۧۦ";
                    } else {
                        continue;
                    }
                case 4331:
                    if (C0383.m5203() <= 0) {
                        C0083.m448();
                        str = "ۤۥۢ";
                    } else {
                        str = "ۦۤۤ";
                        continue;
                    }
                case 5358:
                case 27438:
                    if (C0078.m361() <= 0) {
                        C0393.m5668();
                        str = "ۧۢ۟";
                    } else {
                        str = "ۨۡۥ";
                        continue;
                    }
                case 6154:
                    if (C0025.m118() < 0) {
                        break;
                    } else if (C0074.m307() >= 0) {
                        C0184.m1524();
                        str = "ۦۢۦ";
                    } else {
                        str = "ۧۢ۠";
                    }
                case 6272:
                    break;
                case 25540:
                    return atomicBoolean;
                case 27553:
                    if (C0384.m5278() <= 0) {
                        C0073.m265();
                        atomicBoolean = atomicBooleanM2192;
                    } else {
                        str = "ۨۡۥ";
                        atomicBoolean = atomicBooleanM2192;
                        continue;
                    }
                case 28482:
                    if (C0368.m3171() >= 0) {
                        str = "۠ۦۢ";
                        atomicBoolean = null;
                    } else {
                        str = "ۤۢۡ";
                        atomicBoolean = null;
                        continue;
                    }
                case 28558:
                    if (C0377.m4944() > 0) {
                        str = "ۣۣۢ";
                    } else {
                        continue;
                    }
                case 28589:
                    atomicBooleanM2192 = C0246.m2192((C0246) obj);
                    str = "ۦۣ۠";
                    continue;
            }
            if (C0392.m5595() <= 0) {
                C0397.m5814();
                str = "ۥۨۧ";
            } else {
                str = "ۣۤۡ";
            }
        }
    }

    /* renamed from: ۡۦۨ۟, reason: not valid java name and contains not printable characters */
    public static String m2170(Object obj) {
        String str = "ۦ۠ۨ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748704) {
                case 413:
                    str = "۠ۥ۠";
                    continue;
                case 417:
                    break;
                case 1435:
                    if (C0089.m592() <= 0) {
                        C0229.m2064();
                        str2 = null;
                    } else {
                        str = "ۥۧۡ";
                        str2 = null;
                        continue;
                    }
                case 2332:
                    if (C0334.m2866() <= 0) {
                        str = "ۨۦۧ";
                        str2 = str3;
                    } else {
                        str = "ۧۡۤ";
                        str2 = str3;
                        continue;
                    }
                case 4255:
                    if (C0184.m1524() < 0) {
                        str = "ۨ۠ۧ";
                    } else {
                        continue;
                    }
                case 5352:
                    if (C0386.m5322() <= 0) {
                        C0397.m5814();
                    } else {
                        str = "ۦ۠ۨ";
                        continue;
                    }
                case 26127:
                case 1733209:
                    if (C0383.m5203() <= 0) {
                        C0335.m2923();
                    } else {
                        str = "ۧۡۤ";
                        continue;
                    }
                case 27562:
                    return str2;
                case 28558:
                    if (C0400.m5961() < 0) {
                        break;
                    } else if (C0074.m307() >= 0) {
                        C0385.m5282();
                    } else {
                        str = "ۣۡ";
                    }
                case 1733310:
                    str3 = ((ViewOnClickListenerC0244) obj).f410;
                    str = "۟ۧۤ";
                    continue;
            }
            if (C0398.m5833() > 0) {
                str = "ۣۡۧ";
            }
        }
    }

    /* renamed from: ۥ۠۟ۥ, reason: contains not printable characters */
    public static int m2171(Object obj) {
        String str = "ۨ۠ۡ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750784) {
                case 481:
                    break;
                case 1446:
                    i2 = ((ViewOnClickListenerC0244) obj).action;
                    if (C0377.m4944() <= 0) {
                        str = "ۣۧ";
                    } else {
                        str = "ۥۦۡ";
                        continue;
                    }
                case 1505:
                case 32262:
                    if (C0393.m5668() > 0) {
                        str = "ۡۢۡ";
                    } else {
                        continue;
                    }
                case 2400:
                    if (C0191.m1627() >= 0) {
                        C0073.m265();
                        str = "ۡۡۢ";
                        i = i2;
                    } else {
                        str = "ۡۢۡ";
                        i = i2;
                        continue;
                    }
                case 3362:
                    str = "ۨۡ۟";
                    continue;
                case 6274:
                    str = "ۦۥۧ";
                    continue;
                case 6565:
                    if (C0291.m2568() >= 0) {
                        C0399.m5914();
                        str = "ۨۤۨ";
                    } else {
                        str = "ۨ۠ۡ";
                        continue;
                    }
                case 6624:
                    return i;
                case 29960:
                    str = "ۤۢ۠";
                    i = 0;
                    continue;
                case 32745:
                    if (C0386.m5322() < 0) {
                        break;
                    } else {
                        str = "ۢۢۦ";
                    }
            }
            if (C0060.m216() > 0) {
                str = "ۡۧۨ";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x000a A[SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r12) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p019.ViewOnClickListenerC0244.onClick(android.view.View):void");
    }
}
