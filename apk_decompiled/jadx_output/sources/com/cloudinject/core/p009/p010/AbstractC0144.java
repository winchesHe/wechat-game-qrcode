package com.cloudinject.core.p009.p010;

import android.app.C0009;
import android.arch.p003.p005.C0060;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
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
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
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
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.core.̗.̖.̖, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0144 implements InterfaceC0150, InvocationHandler {
    public static final String TAG = "̖";

    /* renamed from: ̗̗̖̖̙̗̖, reason: not valid java name and contains not printable characters */
    private Object f213;

    /* renamed from: ̗̗̙̙̖̙̖, reason: not valid java name and contains not printable characters */
    private Object f214;

    /* renamed from: ̗̗̙̙̙̗̗, reason: not valid java name and contains not printable characters */
    private Map<String, AbstractC0149> f215;

    public AbstractC0144() {
        String str = "ۧۥۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750531) {
                case 2058:
                    return;
                case 29642:
                    this.f215 = new HashMap();
                    if (C0386.m5322() > 0) {
                        str = "ۥۣۧ";
                        break;
                    } else {
                        C0389.m5481();
                        break;
                    }
                case 29799:
                    str = "ۧۥۧ";
                    break;
            }
        }
    }

    /* renamed from: ۟۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m1206(Object obj, Object obj2, Object obj3) {
        Object obj4 = "ۨۡۡ";
        while (true) {
            switch (C0395.m5690(obj4) ^ 1754504) {
                case 46:
                    return;
                case 3200:
                    if (C0228.m2012() < 0) {
                        break;
                    } else if (C0384.m5278() <= 0) {
                        C0009.m36();
                    } else {
                        obj4 = "ۢ۠۠";
                    }
                case 3298:
                case 27340:
                    obj4 = "ۣۧۤ";
                    continue;
                case 25110:
                    obj4 = "ۨۡۡ";
                    continue;
                case 29632:
                    obj4 = "ۡۥۨ";
                    continue;
                case 30345:
                    break;
                case 30698:
                    ((AbstractC0144) obj).m1221((String) obj2, (AbstractC0149) obj3);
                    if (C0389.m5481() > 0) {
                        obj4 = "ۣۧۤ";
                    } else {
                        continue;
                    }
            }
            obj4 = "ۣۡۦ";
        }
    }

    /* renamed from: ۟۟ۥۤۢ, reason: not valid java name and contains not printable characters */
    public static String m1207(Object obj) {
        String str = "ۨۨ";
        String str2 = null;
        String methodName = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751771) {
                case 1877:
                    methodName = ((AbstractC0149) obj).getMethodName();
                    str = "۟ۨ۠";
                    continue;
                case 1919:
                    str = "ۨ۠ۥ";
                    continue;
                case 3172:
                    break;
                case 3320:
                    str = "ۨۨ";
                    continue;
                case 4411:
                    if (C0121.m1023() >= 0) {
                        C0228.m2012();
                    } else {
                        str = "ۣۡ۟";
                        continue;
                    }
                case 4812:
                    str = "ۨ۟ۤ";
                    str2 = methodName;
                    continue;
                case 5214:
                case 5465:
                    str = "ۨ۟ۤ";
                    continue;
                case 29206:
                    return str2;
                case 29238:
                    if (C0389.m5481() <= 0) {
                        C0379.m5056();
                        str2 = null;
                    } else {
                        str = "۠ۨۨ";
                        str2 = null;
                        continue;
                    }
                case 1730523:
                    if (C0368.m3171() > 0) {
                        break;
                    } else {
                        str = "ۥ۟ۨ";
                    }
            }
            str = "ۥ۠۟";
        }
    }

    /* renamed from: ۟۠ۦۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m1208(Object obj) throws IllegalAccessException, InstantiationException {
        String str = "ۡۡۡ";
        Object obj2 = null;
        Object objNewInstance = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753420) {
                case 1122:
                    str = "۠ۢ";
                    obj2 = null;
                    continue;
                case 26357:
                    return obj2;
                case 27373:
                    break;
                case 27382:
                    objNewInstance = ((Class) obj).newInstance();
                    if (C0378.m4998() <= 0) {
                        C0121.m1023();
                        str = "۠ۧۥ";
                    } else {
                        str = "ۥۣۨ";
                        continue;
                    }
                case 28168:
                case 1711370:
                    str = "۟ۥ۟";
                    continue;
                case 28557:
                    if (C0179.m1427() < 0) {
                        break;
                    } else if (C0089.m592() <= 0) {
                        C0375.m4840();
                        str = "ۤۧۦ";
                    } else {
                        str = "۠ۧۡ";
                    }
                case 31628:
                    str = "ۡۡۡ";
                    continue;
                case 32582:
                    str = "۟ۥ۟";
                    obj2 = objNewInstance;
                    continue;
                case 32723:
                    str = "ۧ۠ۧ";
                    continue;
                case 1711438:
                    if (C0334.m2866() <= 0) {
                        C0381.m5127();
                        str = "۠ۡ۟";
                    } else {
                        str = "ۢۨ";
                        continue;
                    }
            }
            str = "ۥۨۢ";
        }
    }

    /* renamed from: ۣ۟ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m1209(Object obj, Object obj2) throws Throwable {
        String str = "ۦۧ۟";
        Object obj3 = null;
        Object objM1231 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751681) {
                case 7:
                    if (C0009.m36() >= 0) {
                        str = "ۦۥ";
                    } else {
                        str = "ۦ۟ۤ";
                        continue;
                    }
                case 1833:
                case 3106:
                    str = "۠ۥ۟";
                    continue;
                case 3136:
                    if (C0376.m4906() > 0) {
                        str = "ۥۣ۠";
                    } else {
                        continue;
                    }
                case 3207:
                    objM1231 = ((AbstractC0149) obj).m1231(obj2);
                    str = "ۦ۠ۡ";
                    continue;
                case 4603:
                    return obj3;
                case 5122:
                    break;
                case 30911:
                    if (C0191.m1627() > 0) {
                        break;
                    } else if (C0155.m1294() < 0) {
                        str = "ۣ۟ۢ";
                    }
                case 31690:
                    if (C0420.m6215() >= 0) {
                        obj3 = null;
                    } else {
                        str = "ۣۥۣ";
                        obj3 = null;
                        continue;
                    }
                case 31718:
                    if (C0378.m4998() <= 0) {
                        C0392.m5595();
                        str = "ۥۣ۟";
                        obj3 = objM1231;
                    } else {
                        str = "۠ۥ۟";
                        obj3 = objM1231;
                        continue;
                    }
                case 31877:
                    if (C0009.m36() >= 0) {
                        C0074.m307();
                    } else {
                        str = "ۦۧ۟";
                        continue;
                    }
            }
            str = "ۤۥۧ";
        }
    }

    /* renamed from: ۟ۧ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m1210(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        String str = "۟ۥ۠";
        Object obj5 = null;
        Object objMo1233 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749632) {
                case 1257:
                    if (C0390.m5512() <= 0) {
                        C0398.m5833();
                        str = "ۧ۟ۤ";
                    } else {
                        str = "ۣۧۧ";
                        continue;
                    }
                case 2050:
                    break;
                case 2117:
                    if (C0121.m1023() >= 0) {
                        C0384.m5278();
                    } else {
                        str = "ۨۨ";
                        continue;
                    }
                case 2184:
                case 1732480:
                    if (C0088.m573() <= 0) {
                        C0384.m5278();
                    } else {
                        str = "ۦۧۧ";
                        continue;
                    }
                case 5434:
                    if (C0362.m3122() > 0) {
                        break;
                    } else if (C0386.m5322() > 0) {
                        str = "ۧۡۨ";
                    }
                case 6401:
                    str = "۟ۥ۠";
                    continue;
                case 28870:
                    return obj5;
                case 30475:
                    if (C0391.m5571() <= 0) {
                        obj5 = null;
                    } else {
                        str = "ۤۧۨ";
                        obj5 = null;
                        continue;
                    }
                case 30670:
                    objMo1233 = ((AbstractC0149) obj).mo1233(obj2, (Method) obj3, (Object[]) obj4);
                    if (C0088.m573() <= 0) {
                        C0399.m5914();
                        str = "ۡ۟ۨ";
                    } else {
                        str = "ۣ۟";
                        continue;
                    }
                case 1732316:
                    if (C0389.m5481() <= 0) {
                        C0383.m5203();
                        str = "ۨۡۨ";
                        obj5 = objMo1233;
                    } else {
                        str = "ۦۧۧ";
                        obj5 = objMo1233;
                        continue;
                    }
            }
            if (C0009.m36() >= 0) {
                C0383.m5203();
                str = "ۣۦ۠";
            } else {
                str = "ۣۢۨ";
            }
        }
    }

    /* renamed from: ۡ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static Object m1211(Object obj) {
        String str = "ۣۣۢ";
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752487) {
                case 801:
                case 32686:
                    if (C0384.m5278() <= 0) {
                        C0335.m2923();
                    } else {
                        str = "ۨۤۦ";
                        continue;
                    }
                case 996:
                    if (C0391.m5571() <= 0) {
                        C0384.m5278();
                        obj2 = null;
                    } else {
                        str = "ۣۥۥ";
                        obj2 = null;
                        continue;
                    }
                case 2853:
                    if (C0179.m1427() < 0) {
                        break;
                    } else if (C0400.m5961() > 0) {
                        str = "ۣۣ۟";
                    }
                case 2916:
                    str = "ۥۧۨ";
                    continue;
                case 5991:
                    str = "ۥۥۣ";
                    continue;
                case 6872:
                    obj3 = ((AbstractC0144) obj).f213;
                    str = "ۧۤ۠";
                    continue;
                case 29702:
                    if (C0375.m4840() >= 0) {
                        C0388.m5430();
                    } else {
                        str = "ۣۣۢ";
                        continue;
                    }
                case 29901:
                    return obj2;
                case 30724:
                    if (C0335.m2923() >= 0) {
                        C0083.m448();
                        str = "ۥۡۥ";
                        obj2 = obj3;
                    } else {
                        str = "ۨۤۦ";
                        obj2 = obj3;
                        continue;
                    }
                case 32710:
                    break;
            }
            if (C0164.m1359() >= 0) {
                C0380.m5068();
                str = "۠۠";
            } else {
                str = "۠۟۟";
            }
        }
    }

    /* renamed from: ۡۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m1212(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        String str = "ۤۨۢ";
        Object obj5 = null;
        Object objM1232 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754654) {
                case 886:
                    str = "ۡ۟ۧ";
                    obj5 = null;
                    continue;
                case 991:
                    break;
                case 1048:
                    if (C0386.m5322() <= 0) {
                        C0184.m1524();
                        str = "ۧۡۧ";
                    } else {
                        str = "ۣۧۢ";
                        continue;
                    }
                case 2040:
                case 28799:
                    if (C0335.m2923() < 0) {
                        str = "۠ۥۦ";
                    } else {
                        continue;
                    }
                case 2045:
                    if (C0088.m573() <= 0) {
                        obj5 = objM1232;
                    } else {
                        str = "۠ۥۦ";
                        obj5 = objM1232;
                        continue;
                    }
                case 24833:
                    str = "ۤۨۢ";
                    continue;
                case 26775:
                    str = "ۣۢ۠";
                    continue;
                case 28063:
                    return obj5;
                case 31765:
                    objM1232 = ((AbstractC0149) obj).m1232(obj2, (Method) obj3, (Object[]) obj4);
                    str = "ۦۤۡ";
                    continue;
                case 31936:
                    if (C0384.m5278() <= 0) {
                        break;
                    } else if (C0397.m5814() <= 0) {
                        C0362.m3122();
                    } else {
                        str = "ۤۡۨ";
                    }
            }
            if (C0229.m2064() >= 0) {
                C0060.m216();
                str = "ۢۨۢ";
            } else {
                str = "ۦۥۥ";
            }
        }
    }

    /* renamed from: ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static void m1213(Object obj, Object obj2, Object obj3) {
        String str = "۠ۥۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748706) {
                case 1379:
                    if (C0388.m5430() < 0) {
                        break;
                    } else {
                        str = C0121.m1023() >= 0 ? "ۥۡۧ" : "ۣۧۢ";
                    }
                case 1507:
                    break;
                case 1780:
                case 26159:
                    if (C0184.m1524() < 0) {
                        str = "ۤۨ";
                    } else {
                        continue;
                    }
                case 27530:
                    ((AbstractC0144) obj).mo1227(obj2, obj3);
                    str = "ۤۨ";
                    continue;
                case 28489:
                    if (C0362.m3122() >= 0) {
                        C0229.m2064();
                    } else {
                        str = "۟ۨ۟";
                        continue;
                    }
                case 28555:
                    str = "۠ۥۦ";
                    continue;
                case 1733222:
                    return;
            }
            if (C0335.m2923() >= 0) {
                C0376.m4906();
                str = "ۡۨ۠";
            } else {
                str = "ۦۢۧ";
            }
        }
    }

    /* renamed from: ۢۦۥۡ, reason: not valid java name and contains not printable characters */
    public static Object m1214(Object obj) {
        String str = "ۣ۠ۨ";
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1749696) {
                case 38:
                    if (C0370.m3284() >= 0) {
                        C0368.m3171();
                    } else {
                        str = "ۤۨ۠";
                        continue;
                    }
                case 1254:
                case 6876:
                    if (C0164.m1359() < 0) {
                        str = "ۨۥۨ";
                    } else {
                        continue;
                    }
                case 1259:
                    if (C0291.m2568() > 0) {
                        break;
                    } else if (C0383.m5203() <= 0) {
                        C0291.m2568();
                        str = "ۥۥۦ";
                    } else {
                        str = "ۥۣۤ";
                    }
                case 2076:
                    str = "ۣۡۢ";
                    obj2 = null;
                    continue;
                case 2181:
                    str = "ۨۥۨ";
                    obj2 = obj3;
                    continue;
                case 3300:
                    obj3 = ((AbstractC0144) obj).f214;
                    if (C0400.m5961() > 0) {
                        str = "ۣۤۤ";
                    } else {
                        continue;
                    }
                case 5438:
                    break;
                case 6521:
                    if (C0387.m5374() < 0) {
                        str = "ۣ۠ۨ";
                    } else {
                        continue;
                    }
                case 7616:
                    if (C0369.m3256() > 0) {
                        str = "ۣۣ۠";
                    } else {
                        continue;
                    }
                case 31563:
                    return obj2;
            }
            str = C0400.m5961() <= 0 ? "۟ۨۤ" : "ۢۤۨ";
        }
    }

    /* renamed from: ۣۤۧ۠, reason: not valid java name and contains not printable characters */
    public static void m1215(Object obj, Object obj2) {
        String str = "ۧۡۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754570) {
                case 41:
                case 42:
                    str = "ۣۧۢ";
                    continue;
                case 76:
                    return;
                case 128:
                    if (C0397.m5814() < 0) {
                        break;
                    } else {
                        str = "ۣۤۡ";
                    }
                case 25096:
                    str = "ۧۡۤ";
                    continue;
                case 28112:
                    if (C0387.m5374() < 0) {
                        str = "ۧۦ۟";
                    } else {
                        continue;
                    }
                case 28125:
                    break;
                case 29546:
                    ((AbstractC0144) obj).m1219((Class) obj2);
                    str = "ۣۧۢ";
                    continue;
            }
            if (C0279.m2491() >= 0) {
                C0060.m216();
            } else {
                str = "ۣ۟ۨ";
            }
        }
    }

    /* renamed from: ۥۧۨ۟, reason: contains not printable characters */
    public static Object m1216(Object obj) {
        Object obj2 = "ۧۥۣ";
        Object obj3 = null;
        Object objMo1224 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1755433) {
                case 2112:
                    objMo1224 = ((AbstractC0144) obj).mo1224();
                    if (C0397.m5814() > 0) {
                        obj2 = "ۣۥۢ";
                    } else {
                        continue;
                    }
                case 2212:
                    obj2 = "ۡۥۥ";
                    continue;
                case 2282:
                    break;
                case 3308:
                    if (C0420.m6215() >= 0) {
                        break;
                    } else if (C0369.m3256() <= 0) {
                        C0392.m5595();
                    } else {
                        obj2 = "ۦۣ۠";
                    }
                case 25559:
                case 26216:
                    if (C0375.m4840() >= 0) {
                        C0397.m5814();
                    } else {
                        obj2 = "ۥۢۢ";
                        continue;
                    }
                case 28276:
                    if (C0346.m3059() >= 0) {
                        C0121.m1023();
                        obj2 = "ۦۢۥ";
                    } else {
                        obj2 = "ۧۥۣ";
                        continue;
                    }
                case 29448:
                    if (C0380.m5068() <= 0) {
                        obj2 = "ۨۥۥ";
                        obj3 = null;
                    } else {
                        obj2 = "ۦۡۨ";
                        obj3 = null;
                        continue;
                    }
                case 29900:
                    return obj3;
                case 29920:
                    if (C0384.m5278() <= 0) {
                        C0395.m5698();
                        obj2 = "ۧۤۢ";
                    } else {
                        obj2 = "ۤۢ۟";
                        continue;
                    }
                case 32745:
                    if (C0089.m592() <= 0) {
                        C0392.m5595();
                        obj3 = objMo1224;
                    } else {
                        obj2 = "ۥۢۢ";
                        obj3 = objMo1224;
                        continue;
                    }
            }
            if (C0291.m2568() >= 0) {
                C0377.m4944();
                obj2 = "ۦۨۢ";
            } else {
                obj2 = "ۥۡۥ";
            }
        }
    }

    /* renamed from: ۨ۟۠۟, reason: not valid java name and contains not printable characters */
    public static Map m1217(Object obj) {
        String str = "ۤۥۦ";
        Map<String, AbstractC0149> map = null;
        Map<String, AbstractC0149> map2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755434) {
                case 136:
                case 32719:
                    if (C0376.m4906() <= 0) {
                        C0082.m410();
                    } else {
                        str = "ۣۡ۟";
                        continue;
                    }
                case 484:
                    str = "ۣۡ۟";
                    map = map2;
                    continue;
                case 2148:
                    if (C0386.m5322() <= 0) {
                        str = "۠۟ۥ";
                    } else {
                        str = "ۤۥۦ";
                        continue;
                    }
                case 3215:
                    str = "۠ۤۤ";
                    continue;
                case 25162:
                    str = "ۦۣ";
                    map = null;
                    continue;
                case 26283:
                    break;
                case 26583:
                    return map;
                case 29615:
                    if (C0378.m4998() <= 0) {
                        break;
                    } else if (C0229.m2064() >= 0) {
                        C0383.m5203();
                    } else {
                        str = "ۥۢۢ";
                    }
                case 29903:
                    map2 = ((AbstractC0144) obj).f215;
                    if (C0376.m4906() <= 0) {
                        C0381.m5127();
                        str = "۟۟۟";
                    } else {
                        str = "ۨ۟ۥ";
                        continue;
                    }
                case 1709463:
                    if (C0383.m5203() <= 0) {
                        C0083.m448();
                    } else {
                        str = "ۨۦ۠";
                        continue;
                    }
            }
            if (C0420.m6215() < 0) {
                str = "ۧۤۢ";
            }
        }
    }

    /* renamed from: ۨۦۤۦ, reason: not valid java name and contains not printable characters */
    public static void m1218(Object obj) {
        String str = "ۣ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56483) {
                case 57:
                    break;
                case 156:
                    return;
                case 255:
                    if (C0392.m5595() <= 0) {
                        break;
                    } else {
                        str = "ۦۤۢ";
                    }
                case 1709124:
                    str = "ۣۣۢ";
                    continue;
                case 1710780:
                case 1731271:
                    if (C0279.m2491() >= 0) {
                        C0279.m2491();
                    } else {
                        str = "ۢۡ";
                        continue;
                    }
                case 1711431:
                    ((AbstractC0144) obj).mo1222();
                    str = "ۢۡ";
                    continue;
                case 1731115:
                    if (C0376.m4906() <= 0) {
                        C0376.m4906();
                        str = "۟۟ۦ";
                    } else {
                        str = "ۣ۟";
                        continue;
                    }
            }
            str = "ۨ۠۟";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0006 A[SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) throws java.lang.Throwable {
        /*
            r6 = this;
            r1 = 0
            java.lang.String r0 = "۠۠۠"
            r2 = r1
            r3 = r1
            r4 = r1
        L6:
            int r1 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1754657(0x1ac621, float:2.458798E-39)
            r1 = r1 ^ r5
            switch(r1) {
                case 899: goto L12;
                case 3787: goto L91;
                case 3791: goto L6a;
                case 3941: goto L7f;
                case 26915: goto L9f;
                case 27841: goto L1d;
                case 28709: goto L30;
                case 28960: goto L69;
                case 29861: goto L5d;
                case 29921: goto L6c;
                case 29922: goto L3c;
                case 1710817: goto L47;
                case 1710819: goto L82;
                default: goto L11;
            }
        L11:
            goto L6
        L12:
            if (r4 != 0) goto L9f
            int r1 = mirrorb.android.accounts.C0376.m4906()
            if (r1 <= 0) goto L6
            java.lang.String r0 = "ۣ۟۠"
            goto L6
        L1d:
            java.util.Map r0 = m1217(r6)
            java.lang.String r1 = mirrorb.android.net.wifi.C0387.m5397(r8)
            java.lang.Object r0 = android.net.wifi.C0078.m334(r0, r1)
            com.cloudinject.core.̗.̖.̗̖ r0 = (com.cloudinject.core.p009.p010.AbstractC0149) r0
            java.lang.String r1 = "ۧۤ۟"
            r4 = r0
            r0 = r1
            goto L6
        L30:
            java.lang.Object r0 = m1214(r6)     // Catch: java.lang.Throwable -> L79
            java.lang.Object r1 = mirrorb.com.android.internal.view.C0397.m5812(r8, r0, r9)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "ۣۧۥ"
            r3 = r1
            goto L6
        L3c:
            if (r2 == 0) goto L91
            int r1 = mirrorb.com.android.internal.app.C0394.m5672()
            if (r1 <= 0) goto L6
            java.lang.String r0 = "ۨ۠ۦ"
            goto L6
        L47:
            java.lang.Object r0 = m1214(r6)
            java.lang.Object r1 = m1212(r4, r0, r8, r9)
            int r0 = mirrorb.android.accounts.C0376.m4906()
            if (r0 > 0) goto L59
            java.lang.String r0 = "ۣۣ۟"
            r2 = r1
            goto L6
        L59:
            java.lang.String r0 = "ۣۢۤ"
            r2 = r1
            goto L6
        L5d:
            java.lang.Object r0 = m1214(r6)
            java.lang.Object r0 = m1210(r4, r0, r8, r9)
            java.lang.Object r3 = m1209(r4, r0)
        L69:
            return r3
        L6a:
            r3 = r2
            goto L69
        L6c:
            int r1 = com.cloudinject.core.p009.p012.C0164.m1359()
            if (r1 < 0) goto L76
            com.cloudinject.feature.p015.C0206.m1807()
            goto L6
        L76:
            java.lang.String r0 = "ۣۧۥ"
            goto L6
        L79:
            r0 = move-exception
            java.lang.Throwable r0 = mirrorb.android.location.C0385.m5292(r0)
            throw r0
        L7f:
            java.lang.String r0 = "۠۠۠"
            goto L6
        L82:
            int r1 = com.cloudinject.customview.C0184.m1524()
            if (r1 < 0) goto L8d
            android.app.C0009.m36()
            goto L6
        L8d:
            java.lang.String r0 = "ۣ۟۠"
            goto L6
        L91:
            int r0 = mirrorb.android.hardware.fingerprint.C0382.m5180()
            if (r0 > 0) goto L9b
            java.lang.String r0 = "ۡۧۨ"
            goto L6
        L9b:
            java.lang.String r0 = "ۣۢۡ"
            goto L6
        L9f:
            int r1 = com.cloudinject.customview.C0183.m1464()
            if (r1 <= 0) goto L6
            java.lang.String r0 = "ۦۦ"
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.p009.p010.AbstractC0144.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x000c A[SYNTHETIC] */
    /* renamed from: ̖̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void m1219(java.lang.Class<?> r12) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.p009.p010.AbstractC0144.m1219(java.lang.Class):void");
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    protected void m1220(AbstractC0149 abstractC0149) {
        String str = "ۣۨۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746912) {
                case 4349:
                    C0420.m6218(m1217(this), m1207(abstractC0149), abstractC0149);
                    if (C0400.m5961() > 0) {
                        str = "ۤۥۡ";
                        break;
                    } else {
                        C0377.m4944();
                        break;
                    }
                case 7520:
                    return;
                case 7626:
                    str = "ۣۨۢ";
                    break;
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    protected void m1221(String str, AbstractC0149 abstractC0149) {
        String str2 = "ۡۥۥ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56417) {
                case 1732263:
                    if (C0335.m2923() < 0) {
                        str2 = "ۡۥۥ";
                        break;
                    } else {
                        str2 = "ۦۧۥ";
                        break;
                    }
                case 1733313:
                    return;
                case 1733408:
                    C0420.m6218(m1217(this), str, abstractC0149);
                    if (C0382.m5180() > 0) {
                        str2 = "ۡ۠۟";
                        break;
                    } else {
                        str2 = "ۣۢۧ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̖̖̙̗̖, reason: not valid java name and contains not printable characters */
    protected void mo1222() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0017. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x000f A[SYNTHETIC] */
    @Override // com.cloudinject.core.p009.p010.InterfaceC0150
    /* renamed from: ̗̙̖̖̗̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1223() {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.p009.p010.AbstractC0144.mo1223():void");
    }

    /* renamed from: ̗̙̖̖̙̙, reason: not valid java name and contains not printable characters */
    protected abstract Object mo1224();

    /* renamed from: ̗̙̖̙̙̗, reason: not valid java name and contains not printable characters */
    protected Object m1225() {
        return m1214(this);
    }

    /* renamed from: ̗̙̙̖̙̖, reason: not valid java name and contains not printable characters */
    protected Object m1226() {
        return m1211(this);
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    protected abstract void mo1227(Object obj, Object obj2);
}
