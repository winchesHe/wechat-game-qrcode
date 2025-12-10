package com.cloudinject.core.utils;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
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
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.core.utils.̗̖̙, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0129 {
    public static final String LOG_TAG = "Reflector";

    /* renamed from: ̗̗̖̙̗̙̖, reason: not valid java name and contains not printable characters */
    protected Field f201;

    /* renamed from: ̗̗̖̙̙̗̙, reason: not valid java name and contains not printable characters */
    protected Constructor f202;

    /* renamed from: ̗̗̙̖̙̖̗, reason: not valid java name and contains not printable characters */
    protected Class<?> f203;

    /* renamed from: ̗̗̙̙̖̙̙, reason: not valid java name and contains not printable characters */
    protected Object f204;

    /* renamed from: ̙̗̖, reason: not valid java name and contains not printable characters */
    protected Method f205;

    protected C0129() {
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static C0129 m1040(String str, boolean z) throws Exception {
        String str2 = "ۡ۟ۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1754563) {
                case 27467:
                    return C0387.m5363(str, z, C0206.m1843(C0129.class));
                case 28412:
                    str2 = "ۡ۟ۦ";
                    break;
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static C0129 m1041(String str, boolean z, ClassLoader classLoader) throws Exception {
        C0129 c0129M341 = null;
        String str2 = "۟۟۟";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753477) {
                case 26113:
                    if (C0083.m448() < 0) {
                        str2 = "۟۟۟";
                        break;
                    } else {
                        C0335.m2923();
                        str2 = "ۧۨۥ";
                        break;
                    }
                case 26242:
                    if (C0400.m5961() > 0) {
                        str2 = "۟ۥ";
                        break;
                    } else {
                        C0387.m5374();
                        break;
                    }
                case 26361:
                    str2 = "۠ۨۤ";
                    break;
                case 26490:
                    str2 = "۟ۥ";
                    break;
                case 27225:
                    return c0129M341;
                case 1710691:
                    try {
                        c0129M341 = C0078.m341(C0383.m5202(str, z, classLoader));
                        if (C0389.m5481() > 0) {
                            str2 = "۠ۨۤ";
                            break;
                        } else {
                            C0385.m5282();
                            str2 = "ۣ۠ۨ";
                            break;
                        }
                    } catch (Throwable th) {
                        throw new Exception(C0385.m5310(C0382.m5148()), th);
                    }
            }
        }
    }

    /* renamed from: ̗̖̗, reason: not valid java name and contains not printable characters */
    public static C0129 m1042(Class<?> cls) {
        C0129 c0129 = null;
        String str = "ۦۢۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748640) {
                case 1280:
                    c0129.f203 = cls;
                    str = "ۦۦۣ";
                    break;
                case 5315:
                    str = "ۦۢۤ";
                    break;
                case 27779:
                    return c0129;
                case 28424:
                    c0129 = new C0129();
                    if (C0380.m5068() > 0) {
                        str = "۠ۦۦ";
                        break;
                    } else {
                        C0380.m5068();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̖̙, reason: not valid java name and contains not printable characters */
    public static C0129 m1043(String str) throws Exception {
        return C0387.m5363(str, true, C0206.m1843(C0129.class));
    }

    /* renamed from: ̗̗̗, reason: not valid java name and contains not printable characters */
    public static C0129 m1044(Object obj) throws Exception {
        return C0089.m624(C0078.m341(C0060.m194(obj)), obj);
    }

    /* renamed from: ۟۠ۥۥۣ, reason: not valid java name and contains not printable characters */
    public static Field m1045(Object obj, Object obj2) throws NoSuchFieldException {
        String str = "ۦۢۡ";
        Field field = null;
        Field fieldM1060 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755556) {
                case 2049:
                    if (C0376.m4906() < 0) {
                        break;
                    } else if (C0009.m36() < 0) {
                        str = "ۣۧۧ";
                    }
                case 2063:
                    if (C0379.m5056() > 0) {
                        str = "ۥ۟ۨ";
                    } else {
                        continue;
                    }
                case 25019:
                    str = "۟ۥۨ";
                    field = fieldM1060;
                    continue;
                case 26434:
                    str = "ۦۢۡ";
                    continue;
                case 28262:
                    return field;
                case 28291:
                    if (C0394.m5672() <= 0) {
                        field = null;
                    } else {
                        str = "ۦۢۧ";
                        field = null;
                        continue;
                    }
                case 28776:
                case 29738:
                    if (C0291.m2568() >= 0) {
                        C0346.m3059();
                    } else {
                        str = "۟ۥۨ";
                        continue;
                    }
                case 31554:
                    break;
                case 32423:
                    fieldM1060 = ((C0129) obj).m1060((String) obj2);
                    str = "۟ۨۨ";
                    continue;
                case 1709439:
                    if (C0420.m6215() >= 0) {
                        C0396.m5741();
                    } else {
                        str = "۟۠ۨ";
                        continue;
                    }
            }
            if (C0335.m2923() < 0) {
                str = "ۧۢ";
            }
        }
    }

    /* renamed from: ۣ۟۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m1046(Object obj, Object obj2, Object obj3, Object obj4) throws Exception {
        String str = "۟ۨۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747654) {
                case 56:
                    return;
                case 729:
                    if (C0279.m2491() > 0) {
                        break;
                    } else if (C0073.m265() <= 0) {
                        C0369.m3256();
                    } else {
                        str = "ۣۢۢ";
                    }
                case 5998:
                case 27429:
                    if (C0362.m3122() >= 0) {
                        str = "۠۟ۨ";
                    } else {
                        str = "۠ۡ۟";
                        continue;
                    }
                case 6151:
                    ((C0129) obj).m1056(obj2, (Member) obj3, (String) obj4);
                    if (C0380.m5068() <= 0) {
                        str = "ۣۣ۠";
                    } else {
                        str = "۠ۡ۟";
                        continue;
                    }
                case 25409:
                    break;
                case 25475:
                    if (C0393.m5668() <= 0) {
                        C0362.m3122();
                        str = "۠ۥۣ";
                    } else {
                        str = "۟ۨۨ";
                        continue;
                    }
                case 26752:
                    str = "ۥۣ۠";
                    continue;
            }
            str = "ۦۧۧ";
        }
    }

    /* renamed from: ۟ۤ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static Class m1047(Object obj) {
        Object obj2 = "ۥۥۧ";
        Class<?> cls = null;
        Class<?> cls2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1752518) {
                case 897:
                    if (C0155.m1294() >= 0) {
                        break;
                    } else if (C0179.m1427() <= 0) {
                        C0395.m5698();
                    } else {
                        obj2 = "ۣۥۦ";
                    }
                case 2818:
                    cls2 = ((C0129) obj).f203;
                    if (C0381.m5127() <= 0) {
                        C0376.m4906();
                    } else {
                        obj2 = "۠ۥۤ";
                        continue;
                    }
                case 3908:
                    if (C0335.m2923() < 0) {
                        obj2 = "ۥۥۧ";
                    } else {
                        continue;
                    }
                case 4000:
                    obj2 = "۠ۡۢ";
                    cls = null;
                    continue;
                case 4742:
                case 6660:
                    if (C0368.m3171() >= 0) {
                        C0420.m6215();
                    } else {
                        obj2 = "ۧۡ";
                        continue;
                    }
                case 5817:
                    obj2 = "ۧۡ";
                    cls = cls2;
                    continue;
                case 5831:
                    if (C0086.m500() <= 0) {
                        C0397.m5814();
                        obj2 = "ۣۧۤ";
                    } else {
                        obj2 = "۟ۥۨ";
                        continue;
                    }
                case 1728796:
                    return cls;
                case 1728888:
                    if (C0376.m4906() <= 0) {
                        C0179.m1427();
                    } else {
                        obj2 = "ۢ۠ۤ";
                        continue;
                    }
                case 1730105:
                    break;
            }
            if (C0335.m2923() >= 0) {
                C0334.m2866();
            } else {
                obj2 = "ۦۤ";
            }
        }
    }

    /* renamed from: ۟ۦۧۧۡ, reason: not valid java name and contains not printable characters */
    public static Object m1048(Object obj) {
        String str = "ۧۤ۟";
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753418) {
                case 192:
                    str = "ۦۢۢ";
                    continue;
                case 236:
                case 28370:
                    if (C0083.m448() >= 0) {
                        C0335.m2923();
                        str = "ۨۤۤ";
                    } else {
                        str = "ۢۥۣ";
                        continue;
                    }
                case 1058:
                    if (C0082.m410() < 0) {
                        str = "ۡۥۥ";
                    } else {
                        continue;
                    }
                case 1256:
                    if (C0400.m5961() <= 0) {
                        break;
                    } else {
                        str = "ۣۤۤ";
                    }
                case 27306:
                    str = "ۧۤ۟";
                    continue;
                case 28171:
                    if (C0191.m1627() >= 0) {
                        C0184.m1524();
                        obj2 = null;
                    } else {
                        str = "ۦۡۥ";
                        obj2 = null;
                        continue;
                    }
                case 29258:
                    return obj2;
                case 29621:
                    str = "ۢۥۣ";
                    obj2 = obj3;
                    continue;
                case 30541:
                    break;
                case 30697:
                    obj3 = ((C0129) obj).f204;
                    str = "ۢۥۢ";
                    continue;
            }
            if (C0155.m1294() >= 0) {
                C0191.m1627();
                str = "ۥۡ۟";
            } else {
                str = "ۣۧۢ";
            }
        }
    }

    /* renamed from: ۢۥۣۡ, reason: not valid java name and contains not printable characters */
    public static Method m1049(Object obj, Object obj2, Object obj3) throws NoSuchMethodException {
        String str = "ۥ۠";
        Method method = null;
        Method methodM1065 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747715) {
                case 93:
                    methodM1065 = ((C0129) obj).m1065((String) obj2, (Class<?>[]) obj3);
                    if (C0397.m5814() <= 0) {
                        C0164.m1359();
                        str = "ۤۥ۠";
                    } else {
                        str = "ۥۧ۠";
                        continue;
                    }
                case 4444:
                    if (C0395.m5698() >= 0) {
                        str = "ۡ۠ۦ";
                    } else {
                        str = "ۨۧۦ";
                        continue;
                    }
                case 5501:
                    str = "ۣۧ";
                    method = methodM1065;
                    continue;
                case 6503:
                    if (C0378.m4998() <= 0) {
                        C0346.m3059();
                        str = "ۤۨ۠";
                        method = null;
                    } else {
                        str = "ۤۤ۟";
                        method = null;
                        continue;
                    }
                case 7645:
                    break;
                case 25284:
                case 27908:
                    str = "ۣۧ";
                    continue;
                case 25551:
                    if (C0370.m3284() >= 0) {
                        C0362.m3122();
                    } else {
                        str = "ۥ۠";
                        continue;
                    }
                case 28235:
                    str = "ۢ۠ۢ";
                    continue;
                case 1734552:
                    if (C0025.m118() < 0) {
                        break;
                    } else if (C0073.m265() <= 0) {
                        C0060.m216();
                    } else {
                        str = "۠ۤۢ";
                    }
                case 1734623:
                    return method;
            }
            str = C0386.m5322() <= 0 ? "ۤ۠ۨ" : "ۧۡۢ";
        }
    }

    /* renamed from: ۤۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Method m1050(Object obj) {
        String str = "۟ۨ۠";
        Method method = null;
        Method method2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749577) {
                case 141:
                    method2 = ((C0129) obj).f205;
                    str = "ۦۦۨ";
                    continue;
                case 1056:
                case 5463:
                    if (C0073.m265() <= 0) {
                        str = "ۨ۟ۥ";
                    } else {
                        str = "ۣۤ۠";
                        continue;
                    }
                case 1238:
                    return method;
                case 6750:
                    if (C0206.m1807() > 0) {
                        break;
                    } else {
                        str = "ۣۢۥ";
                    }
                case 7435:
                    break;
                case 28769:
                    if (C0420.m6215() >= 0) {
                        method = method2;
                    } else {
                        str = "ۣۤ۠";
                        method = method2;
                        continue;
                    }
                case 30624:
                    if (C0078.m361() <= 0) {
                        method = null;
                    } else {
                        str = "ۣۨۤ";
                        method = null;
                        continue;
                    }
                case 31488:
                    if (C0400.m5961() > 0) {
                        str = "ۣۢۨ";
                    } else {
                        continue;
                    }
                case 31556:
                    if (C0397.m5814() <= 0) {
                        str = "۠ۨۦ";
                    } else {
                        str = "۟ۨ۠";
                        continue;
                    }
                case 31712:
                    str = "ۧۦۨ";
                    continue;
            }
            if (C0060.m216() <= 0) {
                C0073.m265();
            } else {
                str = "ۨۦۧ";
            }
        }
    }

    /* renamed from: ۣۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m1051(Object obj, Object obj2) throws Exception {
        String str = "ۨۨۤ";
        Object obj3 = null;
        Object objM1061 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752641) {
                case 100:
                    if (C0386.m5322() <= 0) {
                        C0375.m4840();
                    } else {
                        str = "ۨۨۤ";
                        continue;
                    }
                case 2121:
                    if (C0082.m410() >= 0) {
                        C0392.m5595();
                        str = "ۦ۠";
                    } else {
                        str = "ۧۧۡ";
                        continue;
                    }
                case 5253:
                    if (C0369.m3256() <= 0) {
                        str = "۟ۨۢ";
                        obj3 = objM1061;
                    } else {
                        str = "ۨ۠ۢ";
                        obj3 = objM1061;
                        continue;
                    }
                case 5718:
                    str = "ۦ۟ۢ";
                    continue;
                case 30379:
                    return obj3;
                case 30629:
                    if (C0400.m5961() <= 0) {
                        break;
                    } else if (C0025.m118() <= 0) {
                        C0395.m5698();
                    } else {
                        str = "ۧۧۢ";
                    }
                case 30784:
                    if (C0385.m5282() >= 0) {
                        C0370.m3284();
                        obj3 = null;
                    } else {
                        str = "۟ۨ۠";
                        obj3 = null;
                        continue;
                    }
                case 30787:
                    objM1061 = ((C0129) obj).m1061(obj2);
                    if (C0060.m216() <= 0) {
                        C0121.m1023();
                        str = "ۧۦ۠";
                    } else {
                        str = "ۣ۠۟";
                        continue;
                    }
                case 32520:
                case 1729955:
                    if (C0385.m5282() >= 0) {
                        str = "ۦ۟۠";
                    } else {
                        str = "ۨ۠ۢ";
                        continue;
                    }
                case 32683:
                    break;
            }
            str = "ۣ۟ۤ";
        }
    }

    /* renamed from: ۣۤۦۢ, reason: not valid java name and contains not printable characters */
    public static Field m1052(Object obj) {
        Object obj2 = "ۥۢۦ";
        Field field = null;
        Field field2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1748641) {
                case 414:
                case 27902:
                    if (C0291.m2568() < 0) {
                        obj2 = "ۥۧ۟";
                    } else {
                        continue;
                    }
                case 4133:
                    if (C0179.m1427() <= 0) {
                        C0334.m2866();
                        obj2 = "ۧ۟ۡ";
                    } else {
                        obj2 = "ۥۢۦ";
                        continue;
                    }
                case 4316:
                    return field;
                case 4936:
                    if (C0378.m4998() <= 0) {
                        break;
                    } else if (C0388.m5430() > 0) {
                        obj2 = "ۦۥۧ";
                    }
                case 26221:
                    obj2 = "ۣۨۡ";
                    field = null;
                    continue;
                case 26403:
                    break;
                case 26504:
                    if (C0335.m2923() >= 0) {
                        obj2 = "ۣۨ۠";
                        field = field2;
                    } else {
                        obj2 = "ۥۧ۟";
                        field = field2;
                        continue;
                    }
                case 26599:
                    if (C0380.m5068() <= 0) {
                        C0380.m5068();
                        obj2 = "ۦۡۡ";
                    } else {
                        obj2 = "ۦۨۡ";
                        continue;
                    }
                case 27817:
                    field2 = ((C0129) obj).f201;
                    if (C0025.m118() <= 0) {
                        C0391.m5571();
                    } else {
                        obj2 = "ۣۨۢ";
                        continue;
                    }
                case 27873:
                    if (C0228.m2012() > 0) {
                        obj2 = "ۣۨ۟";
                    } else {
                        continue;
                    }
            }
            if (C0229.m2064() < 0) {
                obj2 = "ۦۧۡ";
            }
        }
    }

    /* renamed from: ۤۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Constructor m1053(Object obj) {
        String str = "ۣ۠ۥ";
        Constructor constructor = null;
        Constructor constructor2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751686) {
                case 1152:
                case 29440:
                    str = "۟۟ۦ";
                    continue;
                case 1888:
                    if (C0384.m5278() <= 0) {
                        C0388.m5430();
                    } else {
                        str = "ۣ۠ۥ";
                        continue;
                    }
                case 3197:
                    str = "ۧۢۥ";
                    continue;
                case 3246:
                    if (C0396.m5741() >= 0) {
                        break;
                    } else if (C0078.m361() > 0) {
                        str = "۠ۡ";
                    }
                case 7552:
                    return constructor;
                case 30914:
                    break;
                case 31522:
                    str = "۟۟ۦ";
                    constructor = constructor2;
                    continue;
                case 31877:
                    str = "ۥۣۤ";
                    continue;
                case 32748:
                    if (C0179.m1427() <= 0) {
                        constructor = null;
                    } else {
                        str = "ۣۧۧ";
                        constructor = null;
                        continue;
                    }
                case 1730183:
                    constructor2 = ((C0129) obj).f202;
                    str = "ۦۢ۠";
                    continue;
            }
            str = C0384.m5278() <= 0 ? "ۨۤ۠" : "ۣۧ۟";
        }
    }

    public <R> R call(Object... objArr) throws Exception {
        String str = "ۨۧۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749758) {
                case 3294:
                    if (C0164.m1359() >= 0) {
                        break;
                    } else {
                        str = "ۨۧۢ";
                        break;
                    }
                case 31549:
                    return (R) C0388.m5418(this, m1048(this), objArr);
            }
        }
    }

    public <R> R get() throws Exception {
        return (R) C0378.m4974(this, m1048(this));
    }

    public <R> R get(Object obj) throws Exception {
        R r = null;
        String str = "۟۠ۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747897) {
                case 932:
                    str = "۟۠ۢ";
                    break;
                case 1401:
                    str = "ۢۨ۟";
                    break;
                case 3224:
                    m1046(this, obj, m1052(this), C0385.m5310(C0392.m5597()));
                    str = "۟۠ۡ";
                    break;
                case 3225:
                    try {
                        r = (R) C0121.m998(m1052(this), obj);
                        str = "ۢۨ۟";
                        break;
                    } catch (Throwable th) {
                        throw new Exception(C0385.m5310(C0382.m5148()), th);
                    }
                case 5528:
                    if (C0384.m5278() > 0) {
                        str = "۟۠ۡ";
                        break;
                    } else {
                        C0383.m5203();
                        break;
                    }
                case 6368:
                    return r;
            }
        }
    }

    public <R> R newInstance(Object... objArr) throws Exception {
        R r = null;
        String str = "ۣۧۤ";
        Constructor constructorM1053 = null;
        String strM5310 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747928) {
                case 24:
                    str = "ۧۤۦ";
                    continue;
                case 131:
                    constructorM1053 = m1053(this);
                    str = "ۡۧۨ";
                    continue;
                case 963:
                    break;
                case 1114:
                    if (constructorM1053 == null) {
                        break;
                    } else {
                        str = "ۤ۟ۥ";
                    }
                case 3110:
                    throw new Exception(C0385.m5310(C0369.m3236()));
                case 3324:
                    if (C0383.m5203() <= 0) {
                        C0400.m5961();
                    } else {
                        str = "ۤ۟ۥ";
                        continue;
                    }
                case 4626:
                    try {
                        r = (R) C0279.m2466(constructorM1053, objArr);
                        if (C0368.m3171() >= 0) {
                            C0392.m5595();
                            str = "۟۟ۧ";
                        } else {
                            str = "ۧۤۦ";
                            continue;
                        }
                    } catch (InvocationTargetException e) {
                        throw new Exception(strM5310, C0387.m5359(e));
                    } catch (Throwable th) {
                        throw new Exception(strM5310, th);
                    }
                case 25332:
                    str = "ۣۧۤ";
                    continue;
                case 28240:
                    strM5310 = C0385.m5310(C0382.m5148());
                    if (C0164.m1359() >= 0) {
                        str = "ۧۧۤ";
                    } else {
                        str = "۠ۤ۟";
                        continue;
                    }
                case 28273:
                    return r;
            }
            str = "۟ۧۦ";
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public C0129 mo1054(String str, Class<?>... clsArr) throws Exception {
        String str2 = "ۥۨۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1750624) {
                case 34:
                    if (C0183.m1464() > 0) {
                        str2 = "ۡۥۦ";
                        break;
                    } else {
                        str2 = "ۤۢ۠";
                        break;
                    }
                case 221:
                    str2 = "ۥۨۧ";
                    break;
                case 2244:
                    str2 = "ۡۥۦ";
                    break;
                case 3144:
                    C0420.m6227(m1050(this), true);
                    if (C0390.m5512() > 0) {
                        str2 = "ۨۤۥ";
                        break;
                    } else {
                        C0179.m1427();
                        break;
                    }
                case 6344:
                    this.f201 = null;
                    if (C0375.m4840() >= 0) {
                        break;
                    } else {
                        str2 = "ۥۥ";
                        break;
                    }
                case 6434:
                    this.f205 = m1049(this, str, clsArr);
                    if (C0078.m361() > 0) {
                        str2 = "ۤۢۦ";
                        break;
                    } else {
                        C0391.m5571();
                        break;
                    }
                case 32521:
                    try {
                        this.f202 = null;
                        if (C0346.m3059() < 0) {
                            str2 = "ۡ۠ۧ";
                            break;
                        } else {
                            C0228.m2012();
                            break;
                        }
                    } catch (NoSuchMethodException e) {
                        throw new Exception(C0385.m5310(C0382.m5148()), e);
                    }
                case 1731264:
                    return this;
                case 1731975:
                    if (C0378.m4998() > 0) {
                        str2 = "ۥۥ";
                        break;
                    } else {
                        C0420.m6215();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public C0129 mo1055(Class<?>... clsArr) throws Exception {
        String str = "ۦۣۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749574) {
                case 1154:
                    if (C0025.m118() > 0) {
                        str = "ۦۣۢ";
                        break;
                    } else {
                        str = "ۡ۟";
                        break;
                    }
                case 2178:
                    C0395.m5701(m1053(this), true);
                    if (C0391.m5571() > 0) {
                        str = "ۣۧ";
                        break;
                    } else {
                        C0376.m4906();
                        break;
                    }
                case 3139:
                    this.f202 = C0088.m582(m1047(this), clsArr);
                    if (C0384.m5278() <= 0) {
                        break;
                    } else {
                        str = "ۤۧۧ";
                        break;
                    }
                case 7426:
                    if (C0082.m410() < 0) {
                        str = "۠۟";
                        break;
                    } else {
                        C0393.m5668();
                        break;
                    }
                case 28710:
                    str = "ۥۣۣ";
                    break;
                case 28738:
                    this.f205 = null;
                    if (C0381.m5127() > 0) {
                        str = "۠۟";
                        break;
                    } else {
                        str = "۠ۦۦ";
                        break;
                    }
                case 29665:
                    if (C0228.m2012() <= 0) {
                        break;
                    } else {
                        str = "ۥۣۣ";
                        break;
                    }
                case 1731001:
                    return this;
                case 1732130:
                    try {
                        this.f201 = null;
                        str = "ۦۥۣ";
                        break;
                    } catch (Throwable th) {
                        throw new Exception(C0385.m5310(C0382.m5148()), th);
                    }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0003 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void m1056(java.lang.Object r5, java.lang.reflect.Member r6, java.lang.String r7) throws java.lang.Exception {
        /*
            r4 = this;
            r1 = 0
            java.lang.String r0 = "ۨۨۥ"
        L3:
            int r2 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r3 = 1753478(0x1ac186, float:2.457146E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto Lf;
                case 1228: goto L9a;
                case 2147: goto L2a;
                case 26247: goto L6f;
                case 26360: goto L7e;
                case 27141: goto L96;
                case 27458: goto La9;
                case 28312: goto L25;
                case 28452: goto L17;
                case 29473: goto L96;
                case 29540: goto L38;
                case 29542: goto L44;
                case 30340: goto L92;
                case 30638: goto L61;
                case 1711577: goto L88;
                case 1711588: goto L5b;
                default: goto Le;
            }
        Le:
            goto L3
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "۟۟ۡ"
            goto L3
        L17:
            java.lang.String r0 = android.net.wifi.C0078.m378()
            java.lang.String r0 = mirrorb.android.location.C0385.m5310(r0)
            android.arch.p003.p005.C0060.m211(r1, r0)
            java.lang.String r0 = "ۣ۟ۢ"
            goto L3
        L25:
            if (r5 != 0) goto L96
            java.lang.String r0 = "ۢۤۢ"
            goto L3
        L2a:
            if (r6 == 0) goto L92
            int r0 = mirrorb.android.net.wifi.C0388.m5430()
            if (r0 > 0) goto L35
            java.lang.String r0 = "ۢۢ۟"
            goto L3
        L35:
            java.lang.String r0 = "ۡۤۡ"
            goto L3
        L38:
            int r0 = mirrorb.com.android.internal.view.C0397.m5814()
            if (r0 > 0) goto L41
            java.lang.String r0 = "ۣ۟ۤ"
            goto L3
        L41:
            java.lang.String r0 = "ۢۢۧ"
            goto L3
        L44:
            int r2 = androidx.core.p007.C0089.m619(r6)
            boolean r2 = mirrorb.android.providers.C0391.m5567(r2)
            if (r2 == 0) goto L88
            int r2 = android.net.wifi.C0078.m361()
            if (r2 > 0) goto L58
            android.database.C0074.m307()
            goto L3
        L58:
            java.lang.String r0 = "ۢۤۤ"
            goto L3
        L5b:
            m1051(r4, r5)
            java.lang.String r0 = "ۣ۠۟"
            goto L3
        L61:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = android.net.wifi.C0078.m362()
            java.lang.String r1 = mirrorb.android.location.C0385.m5310(r1)
            r0.<init>(r1)
            throw r0
        L6f:
            android.arch.p003.p005.C0060.m211(r1, r7)
            int r0 = android.net.C0083.m448()
            if (r0 < 0) goto L7b
            java.lang.String r0 = "ۢۧۥ"
            goto L3
        L7b:
            java.lang.String r0 = "ۡ۠ۡ"
            goto L3
        L7e:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = mirrorb.android.app.admin.C0377.m4932(r1)
            r0.<init>(r1)
            throw r0
        L88:
            int r2 = mirrorb.android.content.res.C0379.m5056()
            if (r2 <= 0) goto L3
            java.lang.String r0 = "ۣ۠ۥ"
            goto L3
        L92:
            java.lang.String r0 = "ۦۣۡ"
            goto L3
        L96:
            java.lang.String r0 = "ۣۥ"
            goto L3
        L9a:
            int r2 = com.cloudinject.feature.p018.C0228.m2012()
            if (r2 > 0) goto La5
            android.arch.lifecycle.p000.C0025.m118()
            goto L3
        La5:
            java.lang.String r0 = "ۨۨۥ"
            goto L3
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0129.m1056(java.lang.Object, java.lang.reflect.Member, java.lang.String):void");
    }

    /* renamed from: ̗̖̗, reason: not valid java name and contains not printable characters */
    public C0129 mo1057(Object obj) throws Exception {
        String str = "ۦۦۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753453) {
                case 840:
                    this.f204 = m1051(this, obj);
                    if (C0386.m5322() > 0) {
                        str = "ۤ۟۟";
                        break;
                    } else {
                        C0377.m4944();
                        str = "ۦۦۧ";
                        break;
                    }
                case 30889:
                    return this;
                case 31693:
                    if (C0380.m5068() > 0) {
                        str = "ۦۦۥ";
                        break;
                    } else {
                        C0399.m5914();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̖̙, reason: not valid java name and contains not printable characters */
    public C0129 mo1058(Object obj) throws Exception {
        String str = "ۧۤۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752612) {
                case 6497:
                    if (C0121.m1023() < 0) {
                        str = "ۧۤۥ";
                        break;
                    } else {
                        str = "۟ۢ۟";
                        break;
                    }
                case 31628:
                    return C0346.m3029(this, m1048(this), obj);
            }
        }
    }

    /* renamed from: ̗̗̖, reason: not valid java name and contains not printable characters */
    public C0129 mo1059(String str) throws Exception {
        String str2 = "ۨۦ۠";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1754624) {
                case 1893:
                    if (C0362.m3122() >= 0) {
                        break;
                    } else {
                        str2 = "ۨۦ۠";
                        break;
                    }
                case 2019:
                    try {
                        C0399.m5870(m1052(this), true);
                        if (C0179.m1427() > 0) {
                            str2 = "ۦۤۦ";
                            break;
                        } else {
                            str2 = "ۢۤ";
                            break;
                        }
                    } catch (Throwable th) {
                        throw new Exception(C0385.m5310(C0382.m5148()), th);
                    }
                case 2024:
                    this.f202 = null;
                    str2 = "۠ۦ";
                    break;
                case 4002:
                    str2 = "ۨۧ۟";
                    break;
                case 4032:
                    this.f201 = m1045(this, str);
                    if (C0088.m573() <= 0) {
                        break;
                    } else {
                        str2 = "ۦۤۡ";
                        break;
                    }
                case 27936:
                    if (C0191.m1627() >= 0) {
                        break;
                    } else {
                        str2 = "ۤ۟ۤ";
                        break;
                    }
                case 31871:
                    if (C0391.m5571() <= 0) {
                        break;
                    } else {
                        str2 = "ۨۧ۟";
                        break;
                    }
                case 32713:
                    return this;
                case 1710598:
                    this.f205 = null;
                    str2 = "ۤ۟ۤ";
                    break;
            }
        }
    }

    /* renamed from: ̗̗̗, reason: not valid java name and contains not printable characters */
    protected Field m1060(String str) throws NoSuchFieldException {
        Field fieldM5040 = null;
        String str2 = "ۨۦ";
        Class clsM1047 = null;
        NoSuchFieldException e = null;
        Field fieldM24 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56479) {
                case 69:
                    if (C0368.m3171() >= 0) {
                        C0183.m1464();
                    } else {
                        str2 = "ۨۦ";
                        continue;
                    }
                case 97:
                    str2 = "ۣۥۤ";
                    continue;
                case 223:
                    if (C0060.m216() <= 0) {
                        C0191.m1627();
                    } else {
                        str2 = "ۦۡ۟";
                        continue;
                    }
                case 1710521:
                    try {
                        fieldM5040 = C0379.m5040(clsM1047, str);
                        str2 = "۠ۢ۟";
                        continue;
                    } catch (NoSuchFieldException e2) {
                        clsM1047 = C0121.m1019(clsM1047);
                        str2 = "ۥ۟۟";
                    }
                case 1711387:
                    return fieldM24;
                case 1711420:
                    break;
                case 1728794:
                case 1734433:
                    if (C0279.m2491() >= 0) {
                        C0229.m2064();
                    } else {
                        str2 = "۠ۧۧ";
                        continue;
                    }
                case 1729174:
                    if (C0382.m5180() <= 0) {
                        C0025.m118();
                    } else {
                        str2 = "ۣۥۤ";
                        continue;
                    }
                case 1730072:
                    str2 = "ۧ۠۟";
                    continue;
                case 1731165:
                    try {
                        fieldM24 = C0009.m24(m1047(this), str);
                        str2 = "ۦۡ۟";
                        continue;
                    } catch (NoSuchFieldException e3) {
                        e = e3;
                        clsM1047 = m1047(this);
                        str2 = C0376.m4906() <= 0 ? "ۦۦۦ" : "۠ۧۥ";
                    }
                case 1732549:
                    if (C0382.m5180() > 0) {
                        str2 = "۠ۢ۟";
                    } else {
                        continue;
                    }
                case 1734495:
                    if (clsM1047 == null) {
                        break;
                    } else if (C0370.m3284() < 0) {
                        str2 = "ۧ۠۟";
                    }
                case 1734530:
                    return fieldM5040;
                case 1734585:
                    throw e;
            }
            str2 = "۠ۢۨ";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae A[SYNTHETIC] */
    /* renamed from: ̗̗̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object m1061(java.lang.Object r5) throws java.lang.Exception {
        /*
            r4 = this;
            r1 = 0
            java.lang.String r0 = "ۧۨ"
        L3:
            int r2 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r3 = 1748738(0x1aaf02, float:2.450504E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 64: goto Lf;
                case 94: goto L19;
                case 1819: goto Lb6;
                case 2115: goto L86;
                case 2209: goto L52;
                case 4748: goto L1f;
                case 6496: goto La0;
                case 6525: goto L4a;
                case 26154: goto La4;
                case 26885: goto L29;
                case 27336: goto L78;
                case 27965: goto La8;
                case 1733440: goto La8;
                case 1733568: goto L36;
                case 1733603: goto L6a;
                default: goto Le;
            }
        Le:
            goto L3
        Lf:
            java.lang.Class r0 = m1047(r4)
            com.cloudinject.core.utils.compat.C0121.m1004(r1, r0)
            java.lang.String r0 = "ۦۨ"
            goto L3
        L19:
            com.cloudinject.core.utils.compat.C0121.m1004(r1, r5)
            java.lang.String r0 = "ۣ۟ۡ"
            goto L3
        L1f:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = mirrorb.android.app.admin.C0377.m4932(r1)
            r0.<init>(r1)
            throw r0
        L29:
            int r2 = mirrorb.com.android.internal.view.C0397.m5814()
            if (r2 > 0) goto L33
            mirrorb.android.net.wifi.C0387.m5374()
            goto L3
        L33:
            java.lang.String r0 = "ۢۤ"
            goto L3
        L36:
            java.lang.String r2 = mirrorb.android.media.session.C0386.m5348()
            java.lang.String r2 = mirrorb.android.location.C0385.m5310(r2)
            android.arch.p003.p005.C0060.m211(r1, r2)
            int r2 = mirrorb.com.android.internal.C0398.m5833()
            if (r2 <= 0) goto L3
            java.lang.String r0 = "ۥ۟ۨ"
            goto L3
        L4a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "۟ۤۨ"
            goto L3
        L52:
            java.lang.String r2 = mirrorb.android.app.admin.C0377.m4940()
            java.lang.String r2 = mirrorb.android.location.C0385.m5310(r2)
            android.arch.p003.p005.C0060.m211(r1, r2)
            int r2 = mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            if (r2 < 0) goto L67
            com.cloudinject.feature.p018.C0228.m2012()
            goto L3
        L67:
            java.lang.String r0 = "ۡۦۡ"
            goto L3
        L6a:
            if (r5 == 0) goto La8
            int r0 = android.arch.lifecycle.p000.C0025.m118()
            if (r0 > 0) goto L75
            java.lang.String r0 = "ۡۤۤ"
            goto L3
        L75:
            java.lang.String r0 = "ۧۥۨ"
            goto L3
        L78:
            java.lang.Class r0 = m1047(r4)
            boolean r0 = android.database.C0073.m253(r0, r5)
            if (r0 == 0) goto La0
            java.lang.String r0 = "ۧۧۧ"
            goto L3
        L86:
            java.lang.String r2 = com.cloudinject.p025.C0362.m3124()
            java.lang.String r2 = mirrorb.android.location.C0385.m5310(r2)
            android.arch.p003.p005.C0060.m211(r1, r2)
            int r2 = mirrorb.com.android.internal.view.C0397.m5814()
            if (r2 > 0) goto L9c
            com.sadfxg.fasg.C0369.m3256()
            goto L3
        L9c:
            java.lang.String r0 = "ۡۥۦ"
            goto L3
        La0:
            java.lang.String r0 = "ۣۣ۟"
            goto L3
        La4:
            java.lang.String r0 = "ۧۨ"
            goto L3
        La8:
            int r0 = com.px.C0368.m3171()
            if (r0 < 0) goto Lb2
            java.lang.String r0 = "ۤۢۢ"
            goto L3
        Lb2:
            java.lang.String r0 = "۟ۨۢ"
            goto L3
        Lb6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0129.m1061(java.lang.Object):java.lang.Object");
    }

    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    public C0129 mo1062(Object obj, Object obj2) throws Exception {
        String str = "ۥۥۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753415) {
                case 26149:
                    try {
                        C0378.m5010(m1052(this), obj, obj2);
                        if (C0368.m3171() < 0) {
                            str = "ۡۨۧ";
                            break;
                        } else {
                            C0369.m3256();
                            break;
                        }
                    } catch (Throwable th) {
                        throw new Exception(C0385.m5310(C0382.m5148()), th);
                    }
                case 27192:
                    if (C0387.m5374() < 0) {
                        str = "ۥۥۧ";
                        break;
                    } else {
                        C0391.m5571();
                        str = "۠ۢۢ";
                        break;
                    }
                case 28391:
                    return this;
                case 29255:
                    str = "۟ۢۥ";
                    break;
                case 31618:
                    if (C0078.m361() <= 0) {
                        break;
                    } else {
                        str = "ۡۨۧ";
                        break;
                    }
                case 32512:
                    m1046(this, obj, m1052(this), C0385.m5310(C0392.m5597()));
                    str = "۟ۢۥ";
                    break;
            }
        }
    }

    /* renamed from: ̗̙̖̙̖̗, reason: not valid java name and contains not printable characters */
    public C0129 mo1063() {
        String str = "ۣۤۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747806) {
                case 4380:
                    this.f204 = null;
                    if (C0369.m3256() <= 0) {
                        break;
                    } else {
                        str = "ۣۢۨ";
                        break;
                    }
                case 6587:
                    str = "ۣۤۡ";
                    break;
                case 7479:
                    return this;
            }
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public <R> R mo1064(Object obj, Object... objArr) throws Exception {
        R r = null;
        String str = "ۥۢۢ";
        String strM5310 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749727) {
                case 384:
                    try {
                        r = (R) C0397.m5812(m1050(this), obj, objArr);
                        if (C0369.m3256() > 0) {
                            str = "ۦۤۡ";
                            break;
                        } else {
                            C0183.m1464();
                            break;
                        }
                    } catch (InvocationTargetException e) {
                        throw new Exception(strM5310, C0387.m5359(e));
                    } catch (Throwable th) {
                        throw new Exception(strM5310, th);
                    }
                case 1113:
                    m1046(this, obj, m1050(this), C0385.m5310(C0334.m2877()));
                    if (C0335.m2923() < 0) {
                        str = "ۢۨۥ";
                        break;
                    } else {
                        C0398.m5833();
                        break;
                    }
                case 3898:
                    strM5310 = C0385.m5310(C0382.m5148());
                    if (C0397.m5814() <= 0) {
                        break;
                    } else {
                        str = "ۣۣۦ";
                        break;
                    }
                case 3901:
                    if (C0083.m448() < 0) {
                        str = "ۢۨۥ";
                        break;
                    } else {
                        C0394.m5672();
                        break;
                    }
                case 29467:
                    if (C0291.m2568() >= 0) {
                        break;
                    } else {
                        str = "ۦۤۡ";
                        break;
                    }
                case 29500:
                    return r;
                case 30496:
                    if (C0089.m592() > 0) {
                        str = "ۥۢۢ";
                        break;
                    } else {
                        str = "ۣۨ۟";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    protected Method m1065(String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method methodM19 = null;
        String str2 = "ۡۤۨ";
        Class clsM1019 = null;
        NoSuchMethodException e = null;
        Method methodM5034 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1751652) {
                case 67:
                case 5380:
                    if (C0179.m1427() > 0) {
                        str2 = "ۧۡۥ";
                    } else {
                        continue;
                    }
                case 1082:
                    try {
                        methodM5034 = C0379.m5034(m1047(this), str, clsArr);
                        if (C0346.m3059() < 0) {
                            str2 = "ۧۨۨ";
                        } else {
                            continue;
                        }
                    } catch (NoSuchMethodException e2) {
                        e = e2;
                        clsM1019 = m1047(this);
                        if (C0184.m1524() >= 0) {
                            C0060.m216();
                        } else {
                            str2 = "ۤۢۥ";
                        }
                    }
                case 1092:
                    str2 = "ۧۨۨ";
                    continue;
                case 2019:
                    try {
                        methodM19 = C0009.m19(clsM1019, str, clsArr);
                        if (C0396.m5741() >= 0) {
                            C0398.m5833();
                        } else {
                            str2 = "ۣ۟۠";
                            continue;
                        }
                    } catch (NoSuchMethodException e3) {
                        clsM1019 = C0121.m1019(clsM1019);
                        str2 = "ۡۦۥ";
                    }
                case 2028:
                    break;
                case 2401:
                    str2 = "ۥۦ۟";
                    continue;
                case 3430:
                    if (C0073.m265() > 0) {
                        str2 = "ۡۤۨ";
                    } else {
                        continue;
                    }
                case 5441:
                    str2 = "ۥۦ۟";
                    continue;
                case 7448:
                    return methodM19;
                case 7450:
                    throw e;
                case 29676:
                    str2 = "ۣ۟۠";
                    continue;
                case 31663:
                    if (C0399.m5914() > 0) {
                        str2 = "ۥ۟ۡ";
                    } else {
                        continue;
                    }
                case 31811:
                    return methodM5034;
                case 32559:
                    if (clsM1019 == null) {
                        break;
                    } else if (C0394.m5672() > 0) {
                        str2 = "ۥ۟ۡ";
                    }
            }
            if (C0086.m500() > 0) {
                str2 = "ۣ۟ۢ";
            }
        }
    }
}
