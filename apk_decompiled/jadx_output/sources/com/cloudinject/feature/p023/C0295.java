package com.cloudinject.feature.p023;

import android.app.C0009;
import android.app.KeyguardManager;
import android.arch.lifecycle.p000.C0025;
import android.content.Context;
import android.database.C0073;
import android.graphics.Point;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0089;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.p025.C0362;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import mirrorb.android.accounts.C0375;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.providers.C0391;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̙̙.̖̖̗, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0295 {
    private static final String TAG = "UtilsScreen";

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ̖̖̖, reason: not valid java name and contains not printable characters */
    public static boolean m2595(Context context) {
        boolean zM4976 = false;
        String str = "۟ۧۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748768) {
                case 2236:
                    return (((zM4976 ? 1 : 0) ^ 65535) & 1) | ((zM4976 ? 1 : 0) & 65534);
                case 2270:
                    zM4976 = C0378.m4976((KeyguardManager) C0420.m6229(context, C0385.m5310(C0291.m2555())));
                    str = "۟ۤۡ";
                    break;
                case 6179:
                    if (C0393.m5668() <= 0) {
                        break;
                    } else {
                        str = "۟ۧۦ";
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2 A[SYNTHETIC] */
    /* renamed from: ̖̖̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point m2596(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.C0295.m2596(android.content.Context):android.graphics.Point");
    }

    /* renamed from: ̖̖̗, reason: not valid java name and contains not printable characters */
    public static void m2597(View view) {
        InputMethodManager inputMethodManager = null;
        String str = "ۡۨۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748705) {
                case 321:
                    InputMethodManager inputMethodManager2 = (InputMethodManager) C0420.m6229(C0121.m991(view), C0385.m5310(C0362.m3089()));
                    if (C0391.m5571() <= 0) {
                        C0400.m5961();
                        inputMethodManager = inputMethodManager2;
                    } else {
                        str = "ۥۡۥ";
                        inputMethodManager = inputMethodManager2;
                        continue;
                    }
                case 4904:
                    if (inputMethodManager == null) {
                        break;
                    } else if (C0078.m361() <= 0) {
                        C0229.m2064();
                        str = "ۢۦۨ";
                    } else {
                        str = "ۨ۟۟";
                    }
                case 5251:
                    break;
                case 26153:
                    C0384.m5254(inputMethodManager, view, 1);
                    if (C0368.m3171() >= 0) {
                        C0386.m5322();
                        str = "ۣ۟ۧ";
                    } else {
                        str = "ۡۧ";
                        continue;
                    }
                case 1733319:
                    return;
                case 1733374:
                    if (C0369.m3256() > 0) {
                        str = "ۡۨۧ";
                    } else {
                        continue;
                    }
            }
            str = C0073.m265() <= 0 ? "ۧۥۨ" : "ۡۧ";
        }
    }

    /* renamed from: ̖̙̖, reason: not valid java name and contains not printable characters */
    public static float m2598(Context context) {
        String str = "ۦۣۥ";
        float f = 0.0f;
        float fM5465 = 0.0f;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746811) {
                case 3165:
                    if (C0378.m4998() > 0) {
                        str = "ۦۣۥ";
                    } else {
                        continue;
                    }
                case 3492:
                    return 0.0f;
                case 3942:
                case 7870:
                    if (C0377.m4944() > 0) {
                        str = "ۢۨۦ";
                    } else {
                        continue;
                    }
                case 4480:
                    if (context != null) {
                        break;
                    } else {
                        str = C0179.m1427() <= 0 ? "ۤۢۦ" : "۠۠۟";
                    }
                case 5147:
                    return f;
                case 7512:
                    str = "ۢۨۦ";
                    f = fM5465;
                    continue;
                case 7536:
                    try {
                        fM5465 = C0389.m5465(C0121.m1010(C0083.m429(context)));
                        str = "ۤۢۡ";
                        continue;
                    } catch (Exception e) {
                        str = "۟ۨۦ";
                        f = 0.0f;
                    }
                case 26164:
                    break;
                case 26291:
                    if (C0078.m361() <= 0) {
                        str = "ۤۢۨ";
                    } else {
                        str = "ۣۧ۟";
                        continue;
                    }
            }
            str = "ۤۡۨ";
        }
    }

    /* renamed from: ̖̙̗, reason: not valid java name and contains not printable characters */
    public static int m2599(Context context) {
        return C0206.m1833(C0121.m1010(C0083.m429(context)));
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static float m2600(float f, Context context) {
        String str = "۠ۥۣ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751678) {
                case 3235:
                    if (C0184.m1524() < 0) {
                        str = "۠ۥۣ";
                        break;
                    } else {
                        C0179.m1427();
                        break;
                    }
                case 4352:
                    return (C0082.m409(C0121.m1010(C0083.m429(context))) / 160.0f) * f;
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static int m2601(Context context, float f) {
        String str = "ۣۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746845) {
                case 2208:
                    if (C0388.m5430() > 0) {
                        str = "ۣۨ";
                        break;
                    } else {
                        C0179.m1427();
                        str = "ۥۤۦ";
                        break;
                    }
                case 1735672:
                    return (int) (0.0f - ((0.0f - (f / C0389.m5465(C0121.m1010(C0083.m429(context))))) - 0.5f));
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be A[SYNTHETIC] */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point m2602(android.content.Context r8, android.graphics.Point r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.C0295.m2602(android.content.Context, android.graphics.Point):android.graphics.Point");
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static void m2603(View view, long j) {
        String str = "ۢۥۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751557) {
                case 2146:
                    return;
                case 2308:
                    C0083.m453(new Handler(), new RunnableC0296(view), j);
                    if (C0393.m5668() > 0) {
                        str = "ۢ۠ۥ";
                        break;
                    } else {
                        C0025.m118();
                        str = "ۥۥۡ";
                        break;
                    }
                case 4613:
                    str = "ۢۥۤ";
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x010f A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2604(android.app.Activity r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.C0295.m2604(android.app.Activity, int, int):boolean");
    }

    /* renamed from: ̗̗̗, reason: not valid java name and contains not printable characters */
    public static int m2605(Context context) {
        return C0191.m1628(C0395.m5687(context, null));
    }

    /* renamed from: ̗̗̙, reason: not valid java name and contains not printable characters */
    public static int m2606(Context context) {
        return C0387.m5377(C0395.m5687(context, null));
    }

    /* renamed from: ̗̙̙, reason: not valid java name and contains not printable characters */
    public static int m2607(Context context, int i) {
        String str = "ۡۢۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749702) {
                case 3904:
                    str = "ۡۢۦ";
                    break;
                case 7203:
                    return (int) (((i * C0389.m5465(C0121.m1010(C0083.m429(context)))) - 2.0f) + 0.5f + 2.0f);
            }
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public static float m2608(float f, Context context) {
        String str = "ۢۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748861) {
                case 26544:
                    str = "ۢۧ";
                    break;
                case 1733432:
                    return f / (C0082.m409(C0121.m1010(C0083.m429(context))) / 160.0f);
            }
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public static int m2609(Context context, float f) {
        String str = "۠ۡ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753663) {
                case 26817:
                    return (int) (0.5f - (0.0f - (C0383.m5185(C0121.m1010(C0083.m429(context))) * f)));
                case 1711816:
                    str = "۠ۡ۟";
                    break;
            }
        }
    }

    /* renamed from: ̙̖̖, reason: not valid java name and contains not printable characters */
    public static int m2610(Context context) {
        return C0086.m512(C0121.m1010(C0083.m429(context)));
    }

    /* renamed from: ̙̖̗, reason: not valid java name and contains not printable characters */
    public static Point m2611(Context context) {
        String str = "ۥۣۢ";
        Point pointM6248 = null;
        Point pointM5687 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755589) {
                case 70:
                    if (C0384.m5278() <= 0) {
                        str = "ۣۤۦ";
                    } else {
                        str = "ۥۣۢ";
                        continue;
                    }
                case 3079:
                    return new Point(C0191.m1628(pointM5687), ((C0387.m5377(pointM6248) - 16) - C0387.m5377(pointM5687)) + 16);
                case 25370:
                    if (C0387.m5377(pointM5687) >= C0387.m5377(pointM6248)) {
                        break;
                    } else {
                        str = "ۧۥ۠";
                    }
                case 30657:
                    pointM5687 = C0395.m5687(context, null);
                    if (C0375.m4840() >= 0) {
                        str = "ۣۤۥ";
                    } else {
                        str = "ۡۤ";
                        continue;
                    }
                case 31554:
                    break;
                case 32449:
                    return new Point();
                case 1709542:
                    pointM6248 = C0420.m6248(context);
                    if (C0206.m1807() >= 0) {
                        str = "۟ۦۥ";
                    } else {
                        str = "۠۠۟";
                        continue;
                    }
            }
            if (C0183.m1464() > 0) {
                str = "ۣۧۨ";
            }
        }
    }

    /* renamed from: ̙̗̗, reason: not valid java name and contains not printable characters */
    public static void m2612(View view) {
        InputMethodManager inputMethodManager = null;
        String str = "ۦۢۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56413) {
                case 1711601:
                    InputMethodManager inputMethodManager2 = (InputMethodManager) C0420.m6229(C0121.m991(view), C0385.m5310(C0362.m3089()));
                    if (C0009.m36() >= 0) {
                        inputMethodManager = inputMethodManager2;
                    } else {
                        str = "۟ۤ۠";
                        inputMethodManager = inputMethodManager2;
                        continue;
                    }
                case 1730271:
                    return;
                case 1732258:
                    C0334.m2855(inputMethodManager, C0396.m5746(view), 0);
                    str = "ۤۥۣ";
                    continue;
                case 1734332:
                    break;
                case 1735622:
                    if (inputMethodManager == null) {
                        break;
                    } else {
                        str = C0086.m500() <= 0 ? "۟ۦۡ" : "ۢۥۢ";
                    }
                case 1735655:
                    str = "ۦۢۨ";
                    continue;
            }
            if (C0025.m118() <= 0) {
                C0395.m5698();
            } else {
                str = "ۤۥۣ";
            }
        }
    }

    /* renamed from: ̙̙̖, reason: not valid java name and contains not printable characters */
    public static int m2613(Context context) {
        int i = 0;
        String str = "ۣۢۡ";
        int iM1837 = 0;
        Object objM2614 = null;
        Class clsM269 = null;
        int iM595 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752648) {
                case 109:
                    try {
                        iM595 = C0089.m595(C0083.m429(context), iM1837);
                        if (C0073.m265() <= 0) {
                            break;
                        } else {
                            str = "ۢۡ۟";
                            break;
                        }
                    } catch (Exception e) {
                        C0078.m344(e);
                        i = 38;
                        if (C0381.m5127() > 0) {
                            str = "ۣ۟ۢ";
                            break;
                        } else {
                            str = "ۨۦۥ";
                            break;
                        }
                    }
                case 911:
                    str = "ۢۡ۟";
                    break;
                case 2126:
                case 4562:
                    if (C0399.m5914() > 0) {
                        str = "۟ۤۢ";
                        break;
                    } else {
                        C0335.m2923();
                        break;
                    }
                case 2185:
                    if (C0009.m36() < 0) {
                        str = "ۣۢۡ";
                        break;
                    } else {
                        C0009.m36();
                        break;
                    }
                case 3083:
                    if (C0370.m3284() < 0) {
                        str = "۠ۧۢ";
                        break;
                    } else {
                        C0384.m5278();
                        str = "ۢۤۢ";
                        break;
                    }
                case 3208:
                    if (C0086.m500() > 0) {
                        str = "۠ۧۢ";
                        break;
                    } else {
                        C0184.m1524();
                        break;
                    }
                case 3272:
                    if (C0082.m410() < 0) {
                        str = "۠ۧۨ";
                        i = iM595;
                        break;
                    } else {
                        C0395.m5698();
                        str = "ۤۡۢ";
                        i = iM595;
                        break;
                    }
                case 4552:
                    iM1837 = C0206.m1837(C0073.m250(C0121.m998(C0009.m24(clsM269, C0385.m5310(C0385.m5286())), objM2614)));
                    if (C0391.m5571() > 0) {
                        str = "ۥۤۤ";
                        break;
                    } else {
                        C0385.m5282();
                        break;
                    }
                case 5513:
                    if (C0082.m410() < 0) {
                        str = "ۡۨۡ";
                        break;
                    } else {
                        str = "ۢۤۥ";
                        break;
                    }
                case 5619:
                    clsM269 = C0073.m269(C0385.m5310(C0291.m2549()));
                    if (C0420.m6215() >= 0) {
                        break;
                    } else {
                        str = "ۤۢ";
                        break;
                    }
                case 6613:
                    return i;
                case 1729078:
                    objM2614 = m2614(clsM269);
                    str = "ۡۧۦ";
                    break;
            }
        }
    }

    /* renamed from: ۟ۡ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m2614(Object obj) throws IllegalAccessException, InstantiationException {
        String str = "ۣۨۢ";
        Object obj2 = null;
        Object objNewInstance = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755622) {
                case 175:
                    if (C0082.m410() >= 0) {
                        C0399.m5914();
                    } else {
                        str = "ۦۥ۟";
                        continue;
                    }
                case 207:
                    if (C0394.m5672() < 0) {
                        break;
                    } else {
                        str = C0184.m1524() >= 0 ? "ۣۧ۠" : "۠ۢۦ";
                    }
                case 3046:
                case 25377:
                    str = "ۥ۠ۤ";
                    continue;
                case 25282:
                    objNewInstance = ((Class) obj).newInstance();
                    if (C0394.m5672() <= 0) {
                        C0378.m4998();
                        str = "ۣۤ۟";
                    } else {
                        str = "ۣۢۤ";
                        continue;
                    }
                case 26328:
                    if (C0378.m4998() <= 0) {
                        str = "ۣۦۦ";
                        obj2 = null;
                    } else {
                        str = "ۣۨۤ";
                        obj2 = null;
                        continue;
                    }
                case 28185:
                    if (C0206.m1807() >= 0) {
                        C0378.m4998();
                    } else {
                        str = "ۣۨۢ";
                        continue;
                    }
                case 29442:
                    str = "ۡۥۢ";
                    continue;
                case 29775:
                    return obj2;
                case 31525:
                    str = "ۥ۠ۤ";
                    obj2 = objNewInstance;
                    continue;
                case 1709350:
                    break;
            }
            str = "ۤۨۨ";
        }
    }
}
