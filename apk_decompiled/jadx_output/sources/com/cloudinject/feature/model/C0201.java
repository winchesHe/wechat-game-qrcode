package com.cloudinject.feature.model;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.ann.Dex2C;
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
import org.json.JSONObject;
import p027.p028.p029.C0420;

@Dex2C
/* renamed from: com.cloudinject.feature.model.̗̙̙, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0201 {
    public static final int ACTION_BROWSER = 0;
    public static final int ACTION_COPY = 3;
    public static final int ACTION_QQ = 2;
    public static final int ACTION_QQ_GROUP = 1;
    private String cancelExt;
    private String cancelText;
    private String message;
    private String neutralExt;
    private String neutralText;
    private String themeColor;

    /* renamed from: ̗̗̗̖̗̙̙, reason: not valid java name and contains not printable characters */
    private int f320;

    /* renamed from: ̗̗̗̗̖̗̖, reason: not valid java name and contains not printable characters */
    private String f321;

    /* renamed from: ̗̗̗̗̙̖̗, reason: not valid java name and contains not printable characters */
    private String f322;

    /* renamed from: ̗̗̗̗̙̙̗, reason: not valid java name and contains not printable characters */
    private int f323;

    /* renamed from: ̗̗̗̙̗̗̙, reason: not valid java name and contains not printable characters */
    private int f324;

    /* renamed from: ̗̗̗̙̙̗̖, reason: not valid java name and contains not printable characters */
    private int f325;

    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    public static C0201 m1769(JSONObject jSONObject) {
        String str = "ۢۨۤ";
        C0201 c0201 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747807) {
                case 1056:
                    c0201 = new C0201();
                    if (C0388.m5430() <= 0) {
                        C0375.m4840();
                    } else {
                        str = "ۥۧ۟";
                        continue;
                    }
                case 1468:
                    C0396.m5743(c0201, C0390.m5535(jSONObject, C0385.m5310(C0420.m6242())));
                    if (C0183.m1464() <= 0) {
                        C0334.m2866();
                    } else {
                        str = "ۨۧ۟";
                        continue;
                    }
                case 3296:
                    C0386.m5338(c0201, C0183.m1473(jSONObject, C0385.m5310(C0397.m5770())));
                    if (C0400.m5961() <= 0) {
                        C0078.m361();
                        str = "ۡ۠ۢ";
                    } else {
                        str = "ۥۣۥ";
                        continue;
                    }
                case 4410:
                    return null;
                case 4443:
                    str = "ۢۨۤ";
                    continue;
                case 5410:
                    C0083.m438(c0201, C0183.m1473(jSONObject, C0385.m5310(C0375.m4867())));
                    str = "ۧۡۤ";
                    continue;
                case 5464:
                    C0382.m5162(c0201, C0183.m1473(jSONObject, C0385.m5310(C0379.m5030())));
                    str = "ۡۢۤ";
                    continue;
                case 5503:
                    C0060.m199(c0201, C0183.m1473(jSONObject, C0385.m5310(C0073.m244())));
                    if (C0334.m2866() > 0) {
                        str = "ۦۣۦ";
                    } else {
                        continue;
                    }
                case 6145:
                    if (jSONObject != null) {
                        break;
                    } else {
                        str = "ۤۤۥ";
                    }
                case 6453:
                    return c0201;
                case 7511:
                    break;
                case 7677:
                    C0393.m5653(c0201, C0390.m5535(jSONObject, C0385.m5310(C0392.m5609())));
                    if (C0387.m5374() >= 0) {
                        C0400.m5961();
                    } else {
                        str = "ۡۦ";
                        continue;
                    }
                case 25247:
                    C0400.m5954(c0201, C0183.m1473(jSONObject, C0385.m5310(C0391.m5561())));
                    if (C0179.m1427() <= 0) {
                        C0376.m4906();
                    } else {
                        str = "ۣۣۤ";
                        continue;
                    }
                case 25277:
                    C0060.m220(c0201, C0183.m1473(jSONObject, C0385.m5310(C0383.m5191())));
                    if (C0380.m5068() <= 0) {
                        C0334.m2866();
                        str = "ۧۨۨ";
                    } else {
                        str = "ۨۦۣ";
                        continue;
                    }
                case 25338:
                    C0384.m5242(c0201, C0390.m5535(jSONObject, C0385.m5310(C0074.m313())));
                    if (C0369.m3256() > 0) {
                        str = "ۢ۠ۨ";
                    } else {
                        continue;
                    }
                case 27286:
                    C0370.m3268(c0201, C0390.m5535(jSONObject, C0385.m5310(C0074.m292())));
                    if (C0191.m1627() >= 0) {
                        C0088.m573();
                        str = "ۦۦۧ";
                    } else {
                        str = "۟ۥۥ";
                        continue;
                    }
                case 28181:
                    C0078.m365(c0201, C0183.m1473(jSONObject, C0385.m5310(C0398.m5824())));
                    if (C0291.m2568() < 0) {
                        str = "ۥۤ۟";
                    } else {
                        continue;
                    }
                case 1734522:
                    C0183.m1499(c0201, C0183.m1473(jSONObject, C0385.m5310(C0370.m3290())));
                    if (C0399.m5914() <= 0) {
                        C0390.m5512();
                    } else {
                        str = "ۨۨۢ";
                        continue;
                    }
            }
            if (C0121.m1023() >= 0) {
                C0376.m4906();
                str = "۟ۦۢ";
            } else {
                str = "ۡۧۥ";
            }
        }
    }

    /* renamed from: ۟ۡ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m1770(Object obj) {
        Object obj2 = "ۧۧۤ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1755460) {
                case 3084:
                    if (C0228.m2012() <= 0) {
                        C0400.m5961();
                        str = str2;
                    } else {
                        obj2 = "۟ۡۧ";
                        str = str2;
                        continue;
                    }
                case 3904:
                    if (C0400.m5961() <= 0) {
                        break;
                    } else {
                        obj2 = "ۤ۟ۧ";
                    }
                case 26183:
                    obj2 = "۟ۨ";
                    continue;
                case 26201:
                    break;
                case 26555:
                    if (C0060.m216() > 0) {
                        obj2 = "ۧۧۤ";
                    } else {
                        continue;
                    }
                case 28161:
                    return str;
                case 28808:
                    str2 = ((C0201) obj).neutralText;
                    if (C0381.m5127() > 0) {
                        obj2 = "ۧۡۢ";
                    } else {
                        continue;
                    }
                case 29479:
                    obj2 = "ۣۡۥ";
                    str = null;
                    continue;
                case 1708716:
                    if (C0083.m448() >= 0) {
                        obj2 = "ۡۦۦ";
                    } else {
                        obj2 = "ۣۤۤ";
                        continue;
                    }
                case 1708717:
                case 1709543:
                    if (C0386.m5322() <= 0) {
                        C0291.m2568();
                    } else {
                        obj2 = "۟ۡۧ";
                        continue;
                    }
            }
            if (C0379.m5056() > 0) {
                obj2 = "۟ۧ";
            }
        }
    }

    /* renamed from: ۟ۡۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m1771(Object obj) {
        String str = "ۦۢۢ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750566) {
                case 129:
                    if (C0121.m1023() >= 0) {
                        C0009.m36();
                        str = "۟ۥ۠";
                    } else {
                        str = "ۦۢۢ";
                        continue;
                    }
                case 3013:
                    return i;
                case 3200:
                    break;
                case 3301:
                    if (C0083.m448() >= 0) {
                        i = i2;
                    } else {
                        str = "ۥۢ۠";
                        i = i2;
                        continue;
                    }
                case 4582:
                case 4600:
                    if (C0025.m118() <= 0) {
                        C0088.m573();
                    } else {
                        str = "ۥۢ۠";
                        continue;
                    }
                case 6439:
                    if (C0279.m2491() >= 0) {
                        C0420.m6215();
                    } else {
                        str = "ۡۥۥ";
                        continue;
                    }
                case 6490:
                    if (C0394.m5672() > 0) {
                        str = "۟ۦۥ";
                    } else {
                        continue;
                    }
                case 6503:
                    if (C0009.m36() >= 0) {
                        str = "ۣۣ";
                        i = 0;
                    } else {
                        str = "ۡۧۢ";
                        i = 0;
                        continue;
                    }
                case 28728:
                    i2 = ((C0201) obj).f320;
                    if (C0060.m216() <= 0) {
                        C0121.m1023();
                        str = "۟۟۟";
                    } else {
                        str = "ۤۧۦ";
                        continue;
                    }
                case 30592:
                    if (C0362.m3122() >= 0) {
                        break;
                    } else if (C0390.m5512() <= 0) {
                        C0086.m500();
                    } else {
                        str = "ۧۨ۟";
                    }
            }
            str = C0191.m1627() >= 0 ? "ۦۤۧ" : "ۣۣۡ";
        }
    }

    /* renamed from: ۣ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static int m1772(Object obj) {
        Object obj2 = "ۨۦۣ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1755617) {
                case 68:
                    if (C0279.m2491() >= 0) {
                        break;
                    } else if (C0382.m5180() > 0) {
                        obj2 = "ۡ۠ۨ";
                    }
                case 3045:
                    return i;
                case 3076:
                    obj2 = "ۤۨۤ";
                    continue;
                case 3242:
                    break;
                case 26404:
                case 31418:
                    if (C0369.m3256() > 0) {
                        obj2 = "ۦۥۣ";
                    } else {
                        continue;
                    }
                case 26440:
                    i2 = ((C0201) obj).f324;
                    if (C0060.m216() <= 0) {
                        C0184.m1524();
                    } else {
                        obj2 = "ۤ۟ۥ";
                        continue;
                    }
                case 26473:
                    if (C0009.m36() >= 0) {
                        C0335.m2923();
                    } else {
                        obj2 = "ۢۨۡ";
                        continue;
                    }
                case 28715:
                    if (C0073.m265() <= 0) {
                        i = i2;
                    } else {
                        obj2 = "ۦۥۣ";
                        i = i2;
                        continue;
                    }
                case 29441:
                    obj2 = "ۡ۟ۦ";
                    i = 0;
                    continue;
                case 32509:
                    if (C0399.m5914() > 0) {
                        obj2 = "ۨۦۣ";
                    } else {
                        continue;
                    }
            }
            obj2 = "ۧۦۤ";
        }
    }

    /* renamed from: ۟ۦ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m1773(Object obj) {
        Object obj2 = "۟ۧۢ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1751558) {
                case 166:
                    if (C0086.m500() <= 0) {
                        C0396.m5741();
                        i = 0;
                    } else {
                        obj2 = "ۣۦۦ";
                        i = 0;
                        continue;
                    }
                case 1123:
                    if (C0399.m5914() <= 0) {
                        obj2 = "۠ۥ۟";
                    } else {
                        obj2 = "۟ۧۢ";
                        continue;
                    }
                case 1985:
                case 1730139:
                    if (C0086.m500() > 0) {
                        obj2 = "ۧۧۦ";
                    } else {
                        continue;
                    }
                case 3301:
                    obj2 = "ۣ۠";
                    continue;
                case 3357:
                    if (C0083.m448() >= 0) {
                        C0025.m118();
                        obj2 = "ۣۤۥ";
                        i = i2;
                    } else {
                        obj2 = "ۧۧۦ";
                        i = i2;
                        continue;
                    }
                case 5280:
                    if (C0155.m1294() >= 0) {
                        obj2 = "ۣۣۡ";
                    } else {
                        obj2 = "ۤۦۢ";
                        continue;
                    }
                case 5533:
                    break;
                case 7676:
                    if (C0393.m5668() <= 0) {
                        break;
                    } else if (C0073.m265() <= 0) {
                        C0025.m118();
                    } else {
                        obj2 = "ۢۨ";
                    }
                case 31744:
                    return i;
                case 1730112:
                    i2 = ((C0201) obj).f325;
                    if (C0391.m5571() > 0) {
                        obj2 = "ۣۨ۠";
                    } else {
                        continue;
                    }
            }
            if (C0377.m4944() <= 0) {
                C0375.m4840();
                obj2 = "۟۟";
            } else {
                obj2 = "ۡ۠ۥ";
            }
        }
    }

    /* renamed from: ۟ۧۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m1774(Object obj) {
        Object obj2 = "ۤ۠۟";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1752520) {
                case 1067:
                    if (C0082.m410() > 0) {
                        break;
                    } else if (C0086.m500() <= 0) {
                        C0228.m2012();
                    } else {
                        obj2 = "ۤۥۥ";
                    }
                case 1868:
                    str2 = ((C0201) obj).cancelText;
                    if (C0279.m2491() < 0) {
                        obj2 = "ۧۨۦ";
                    } else {
                        continue;
                    }
                case 2839:
                case 6797:
                    obj2 = "۟ۧۡ";
                    continue;
                case 4809:
                    obj2 = "ۤ۠۟";
                    continue;
                case 5663:
                    break;
                case 6705:
                    return str;
                case 31725:
                    if (C0179.m1427() <= 0) {
                        C0121.m1023();
                        str = str2;
                    } else {
                        obj2 = "۟ۧۡ";
                        str = str2;
                        continue;
                    }
                case 32747:
                    if (C0391.m5571() > 0) {
                        obj2 = "۟ۧ";
                    } else {
                        continue;
                    }
                case 1730080:
                    obj2 = "۠۟";
                    str = null;
                    continue;
                case 1730103:
                    if (C0078.m361() > 0) {
                        obj2 = "ۣۦۢ";
                    } else {
                        continue;
                    }
            }
            if (C0121.m1023() < 0) {
                obj2 = "ۦۦۣ";
            }
        }
    }

    /* renamed from: ۟ۧۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m1775(Object obj) {
        String str = "ۧۤۥ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746694) {
                case 3204:
                    str = "ۧ۠ۧ";
                    continue;
                case 3257:
                    i2 = ((C0201) obj).f323;
                    str = "ۨۤۥ";
                    continue;
                case 4605:
                    if (C0386.m5322() > 0) {
                        str = "ۢۢ۟";
                    } else {
                        continue;
                    }
                case 5475:
                case 5529:
                    str = "ۥۢۨ";
                    continue;
                case 5626:
                    break;
                case 6858:
                    if (C0392.m5595() <= 0) {
                        C0396.m5741();
                        str = "ۡ۠۟";
                    } else {
                        str = "ۧۤۥ";
                        continue;
                    }
                case 6893:
                    return i;
                case 25128:
                    str = "ۣۧ۟";
                    i = 0;
                    continue;
                case 25262:
                    if (C0164.m1359() >= 0) {
                        break;
                    } else {
                        str = "۠ۧۦ";
                    }
                case 28271:
                    if (C0082.m410() >= 0) {
                        C0386.m5322();
                        i = i2;
                    } else {
                        str = "ۥۢۨ";
                        i = i2;
                        continue;
                    }
            }
            if (C0206.m1807() >= 0) {
                C0388.m5430();
            } else {
                str = "۠ۥۧ";
            }
        }
    }

    /* renamed from: ۡۡۤۡ, reason: not valid java name and contains not printable characters */
    public static String m1776(Object obj) {
        String str = "ۣۦ۟";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746750) {
                case 2119:
                case 3101:
                    if (C0291.m2568() < 0) {
                        str = "۟ۨ";
                    } else {
                        continue;
                    }
                case 2461:
                    if (C0395.m5698() >= 0) {
                        str2 = str3;
                    } else {
                        str = "۟ۨ";
                        str2 = str3;
                        continue;
                    }
                case 4578:
                    if (C0362.m3122() > 0) {
                        break;
                    } else {
                        str = C0083.m448() >= 0 ? "ۧۦۤ" : "ۧ۟۠";
                    }
                case 6877:
                    str = "ۣۦ۟";
                    continue;
                case 25142:
                    str3 = ((C0201) obj).themeColor;
                    if (C0088.m573() <= 0) {
                        str = "ۦۦۤ";
                    } else {
                        str = "ۡ۠ۢ";
                        continue;
                    }
                case 25953:
                    if (C0389.m5481() <= 0) {
                        C0121.m1023();
                        str = "ۥ۟۠";
                    } else {
                        str = "ۡۧ۟";
                        continue;
                    }
                case 1735454:
                    str = "ۦۨۡ";
                    str2 = null;
                    continue;
                case 1735515:
                    if (C0346.m3059() >= 0) {
                        str = "ۨۦۨ";
                    } else {
                        str = "ۡۡ";
                        continue;
                    }
                case 1735580:
                    break;
                case 1735895:
                    return str2;
            }
            str = C0391.m5571() <= 0 ? "ۣۧۨ" : "ۣۨ";
        }
    }

    /* renamed from: ۡۦۣ۠, reason: not valid java name and contains not printable characters */
    public static String m1777(Object obj) {
        Object obj2 = "ۧۨۨ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1752608) {
                case 166:
                    obj2 = "ۦۢ";
                    continue;
                case 1032:
                case 1729180:
                    obj2 = "۟۠ۧ";
                    continue;
                case 2269:
                    obj2 = "ۥۧۨ";
                    str = null;
                    continue;
                case 5378:
                    if (C0073.m265() <= 0) {
                        C0398.m5833();
                    } else {
                        obj2 = "ۣۧۡ";
                        continue;
                    }
                case 6406:
                    return str;
                case 30407:
                    str2 = ((C0201) obj).f322;
                    if (C0191.m1627() < 0) {
                        obj2 = "ۦۤۧ";
                    } else {
                        continue;
                    }
                case 30727:
                    if (C0375.m4840() >= 0) {
                        break;
                    } else {
                        obj2 = "ۨ۠۟";
                    }
                case 31714:
                    break;
                case 32708:
                    if (C0390.m5512() > 0) {
                        obj2 = "ۧۨۨ";
                    } else {
                        continue;
                    }
                case 32713:
                    if (C0386.m5322() <= 0) {
                        C0334.m2866();
                        str = str2;
                    } else {
                        obj2 = "۟۠ۧ";
                        str = str2;
                        continue;
                    }
            }
            if (C0388.m5430() <= 0) {
                C0399.m5914();
                obj2 = "ۡۦۥ";
            } else {
                obj2 = "۠ۢۤ";
            }
        }
    }

    /* renamed from: ۡۨۦۣ, reason: not valid java name and contains not printable characters */
    public static String m1778(Object obj) {
        String str = "ۡۤ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749610) {
                case 194:
                    str3 = ((C0201) obj).neutralExt;
                    str = "ۡ۠۟";
                    continue;
                case 2251:
                case 5455:
                    if (C0074.m307() >= 0) {
                        C0346.m3059();
                    } else {
                        str = "۠ۨۢ";
                        continue;
                    }
                case 3117:
                    str = "ۡۤ";
                    continue;
                case 5450:
                    break;
                case 5557:
                    if (C0385.m5282() >= 0) {
                        C0420.m6215();
                        str = "ۣۣۤ";
                    } else {
                        str = "ۡۢۦ";
                        continue;
                    }
                case 6576:
                    return str2;
                case 7311:
                    if (C0394.m5672() <= 0) {
                        C0395.m5698();
                        str2 = null;
                    } else {
                        str = "ۧۨۡ";
                        str2 = null;
                        continue;
                    }
                case 7370:
                    if (C0384.m5278() <= 0) {
                        str2 = str3;
                    } else {
                        str = "۠ۨۢ";
                        str2 = str3;
                        continue;
                    }
                case 29770:
                    if (C0368.m3171() >= 0) {
                        C0388.m5430();
                    } else {
                        str = "ۤۦۣ";
                        continue;
                    }
                case 1732169:
                    if (C0386.m5322() < 0) {
                        break;
                    } else if (C0375.m4840() < 0) {
                        str = "ۢۢۨ";
                    }
            }
            str = "۟ۦۦ";
        }
    }

    /* renamed from: ۢۨۨۢ, reason: not valid java name and contains not printable characters */
    public static String m1779(Object obj) {
        Object obj2 = "ۤۧۢ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1751557) {
                case 186:
                    if (C0378.m4998() < 0) {
                        break;
                    } else {
                        obj2 = "ۣۨۢ";
                    }
                case 3265:
                    if (C0392.m5595() > 0) {
                        obj2 = "ۨۤۡ";
                    } else {
                        continue;
                    }
                case 3358:
                    if (C0390.m5512() > 0) {
                        obj2 = "ۤۧۢ";
                    } else {
                        continue;
                    }
                case 7488:
                    return str;
                case 7609:
                case 31712:
                    obj2 = "۟ۡۧ";
                    continue;
                case 29484:
                    str2 = ((C0201) obj).cancelExt;
                    if (C0184.m1524() >= 0) {
                        C0368.m3171();
                    } else {
                        obj2 = "ۨۥۤ";
                        continue;
                    }
                case 29536:
                    obj2 = "ۧۦۧ";
                    str = null;
                    continue;
                case 29570:
                    obj2 = "۟ۡۧ";
                    str = str2;
                    continue;
                case 32706:
                    break;
                case 32749:
                    if (C0396.m5741() >= 0) {
                        obj2 = "ۨۥۡ";
                    } else {
                        obj2 = "۟ۥۢ";
                        continue;
                    }
            }
            if (C0335.m2923() >= 0) {
                C0381.m5127();
            } else {
                obj2 = "ۣۥۦ";
            }
        }
    }

    /* renamed from: ۥۧۦۣ, reason: contains not printable characters */
    public static String m1780(Object obj) {
        Object obj2 = "ۣۤۧ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1746718) {
                case 167:
                    return str;
                case 196:
                    obj2 = "ۧۤۥ";
                    continue;
                case 2080:
                    if (C0376.m4906() <= 0) {
                        C0376.m4906();
                        str = str2;
                    } else {
                        obj2 = "۟ۥ۟";
                        str = str2;
                        continue;
                    }
                case 2151:
                case 25270:
                    if (C0291.m2568() < 0) {
                        obj2 = "۟ۥ۟";
                    } else {
                        continue;
                    }
                case 4157:
                    if (C0397.m5814() > 0) {
                        obj2 = "ۣۤۧ";
                    } else {
                        continue;
                    }
                case 7646:
                    if (C0387.m5374() >= 0) {
                        break;
                    } else {
                        obj2 = "ۥ۠";
                    }
                case 25168:
                    if (C0073.m265() <= 0) {
                        C0025.m118();
                        obj2 = "ۤ۟۠";
                    } else {
                        obj2 = "ۣۧ";
                        continue;
                    }
                case 1735556:
                    break;
                case 1735557:
                    str2 = ((C0201) obj).message;
                    if (C0386.m5322() > 0) {
                        obj2 = "ۡۥۢ";
                    } else {
                        continue;
                    }
                case 1735618:
                    if (C0082.m410() >= 0) {
                        str = null;
                    } else {
                        obj2 = "۟ۦۡ";
                        str = null;
                        continue;
                    }
            }
            if (C0191.m1627() < 0) {
                obj2 = "ۧۡۨ";
            }
        }
    }

    /* renamed from: ۦ۠۠۟, reason: contains not printable characters */
    public static String m1781(Object obj) {
        String str = "ۦۥۤ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751650) {
                case 910:
                    return str2;
                case 1924:
                    if (C0398.m5833() <= 0) {
                        C0229.m2064();
                    } else {
                        str = "ۢۢۤ";
                        continue;
                    }
                case 2180:
                    break;
                case 2246:
                    if (C0346.m3059() >= 0) {
                        str2 = null;
                    } else {
                        str = "ۦۤۢ";
                        str2 = null;
                        continue;
                    }
                case 4547:
                    if (C0362.m3122() >= 0) {
                        str = "ۨۡ";
                        str2 = str3;
                    } else {
                        str = "ۤ۠ۨ";
                        str2 = str3;
                        continue;
                    }
                case 4606:
                case 31498:
                    str = "ۤ۠ۨ";
                    continue;
                case 7485:
                    str3 = ((C0201) obj).f321;
                    str = "۠ۦۧ";
                    continue;
                case 30727:
                    if (C0392.m5595() <= 0) {
                        C0388.m5430();
                    } else {
                        str = "ۦۥۤ";
                        continue;
                    }
                case 30823:
                    if (C0386.m5322() <= 0) {
                        break;
                    } else {
                        str = "۟ۢۢ";
                    }
                case 31622:
                    if (C0191.m1627() < 0) {
                        str = "ۦ۠ۢ";
                    } else {
                        continue;
                    }
            }
            if (C0086.m500() <= 0) {
                C0368.m3171();
            } else {
                str = "ۥۣۢ";
            }
        }
    }

    public String getCancelExt() {
        return m1779(this);
    }

    public String getCancelText() {
        return m1774(this);
    }

    public String getMessage() {
        return m1780(this);
    }

    public String getNeutralExt() {
        return m1778(this);
    }

    public String getNeutralText() {
        return m1770(this);
    }

    public String getThemeColor() {
        return m1776(this);
    }

    public void setCancelExt(String str) {
        String str2 = "ۢۧۤ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1751650) {
                case 2212:
                    if (C0362.m3122() < 0) {
                        str2 = "ۢۧۤ";
                        break;
                    } else {
                        C0179.m1427();
                        break;
                    }
                case 2397:
                    this.cancelExt = str;
                    if (C0378.m4998() <= 0) {
                        break;
                    } else {
                        str2 = "۠۠ۢ";
                        break;
                    }
                case 4224:
                    return;
            }
        }
    }

    public void setCancelText(String str) {
        String str2 = "ۦ۟ۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753699) {
                case 814:
                    this.cancelText = str;
                    if (C0399.m5914() > 0) {
                        str2 = "ۤۡۤ";
                        break;
                    } else {
                        C0379.m5056();
                        str2 = "۠ۦۥ";
                        break;
                    }
                case 26050:
                    if (C0382.m5180() <= 0) {
                        break;
                    } else {
                        str2 = "ۦ۟ۦ";
                        break;
                    }
                case 30820:
                    return;
            }
        }
    }

    public void setMessage(String str) {
        String str2 = "ۣۨۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1754381) {
                case 28612:
                    return;
                case 29231:
                    this.message = str;
                    str2 = "۠۟ۨ";
                    break;
                case 1710387:
                    if (C0391.m5571() <= 0) {
                        break;
                    } else {
                        str2 = "ۣۨۧ";
                        break;
                    }
            }
        }
    }

    public void setNeutralExt(String str) {
        String str2 = "ۡ۟۟";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1749601) {
                case 7298:
                    if (C0389.m5481() > 0) {
                        str2 = "ۡ۟۟";
                        break;
                    } else {
                        C0179.m1427();
                        break;
                    }
                case 7392:
                    this.neutralExt = str;
                    if (C0381.m5127() > 0) {
                        str2 = "ۡۥ۟";
                        break;
                    } else {
                        str2 = "۠ۥۡ";
                        break;
                    }
                case 7514:
                    return;
            }
        }
    }

    public void setNeutralText(String str) {
        String str2 = "ۥۤۢ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1746966) {
                case 1749:
                    if (C0279.m2491() >= 0) {
                        break;
                    } else {
                        str2 = "ۥۤۢ";
                        break;
                    }
                case 5685:
                    this.neutralText = str;
                    str2 = "ۣۧۥ";
                    break;
                case 7959:
                    return;
            }
        }
    }

    public void setThemeColor(String str) {
        String str2 = "ۡۥۥ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1750694) {
                case 6631:
                    this.themeColor = str;
                    if (C0390.m5512() > 0) {
                        str2 = "ۦ۟۠";
                        break;
                    } else {
                        str2 = "ۣۥ۟";
                        break;
                    }
                case 30689:
                    return;
                case 32548:
                    if (C0009.m36() < 0) {
                        str2 = "ۡۥۥ";
                        break;
                    } else {
                        C0393.m5668();
                        str2 = "ۡۤۦ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̖̗̗̙̖, reason: not valid java name and contains not printable characters */
    public int m1782() {
        return m1772(this);
    }

    /* renamed from: ̗̖̗̗̙̗, reason: not valid java name and contains not printable characters */
    public String m1783() {
        return m1781(this);
    }

    /* renamed from: ̗̖̗̗̙̙, reason: not valid java name and contains not printable characters */
    public String m1784() {
        return m1777(this);
    }

    /* renamed from: ̗̗̖̖, reason: not valid java name and contains not printable characters */
    public void m1785(String str) {
        String str2 = "ۣۡۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1746966) {
                case 1749:
                    this.f321 = str;
                    str2 = "۟۟ۤ";
                    break;
                case 3858:
                    return;
                case 6751:
                    str2 = "ۣۡۡ";
                    break;
            }
        }
    }

    /* renamed from: ̗̗̙̖, reason: not valid java name and contains not printable characters */
    public void m1786(String str) {
        String str2 = "ۣ۟۠";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1747713) {
                case 3197:
                    this.f322 = str;
                    if (C0334.m2866() > 0) {
                        str2 = "ۦ۟ۧ";
                        break;
                    } else {
                        str2 = "ۣۦۤ";
                        break;
                    }
                case 5826:
                    if (C0398.m5833() > 0) {
                        str2 = "ۣ۟۠";
                        break;
                    } else {
                        C0370.m3284();
                        str2 = "ۣۢ۠";
                        break;
                    }
                case 27215:
                    return;
            }
        }
    }

    /* renamed from: ̗̙̖̙̖, reason: not valid java name and contains not printable characters */
    public void m1787(int i) {
        String str = "ۢۦۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753509) {
                case 2255:
                    return;
                case 29368:
                    this.f320 = i;
                    str = "ۨۤۦ";
                    break;
                case 29562:
                    str = "ۢۦۡ";
                    break;
            }
        }
    }

    /* renamed from: ̗̙̗̖̗̗, reason: not valid java name and contains not printable characters */
    public int m1788() {
        return m1771(this);
    }

    /* renamed from: ̗̙̗̗̖̖, reason: not valid java name and contains not printable characters */
    public int m1789() {
        return m1775(this);
    }

    /* renamed from: ̗̙̗̙̗̗, reason: not valid java name and contains not printable characters */
    public int m1790() {
        return m1773(this);
    }

    /* renamed from: ̗̙̙̖̖, reason: not valid java name and contains not printable characters */
    public void m1791(int i) {
        String str = "ۣۧۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746784) {
                case 4193:
                    this.f324 = i;
                    str = "ۤۢۨ";
                    break;
                case 7498:
                    return;
                case 25927:
                    str = "ۣۧۥ";
                    break;
            }
        }
    }

    /* renamed from: ̙̗̖̙, reason: not valid java name and contains not printable characters */
    public void m1792(int i) {
        String str = "ۦ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748740) {
                case 421:
                    if (C0025.m118() > 0) {
                        str = "ۦ۠";
                        break;
                    } else {
                        C0388.m5430();
                        str = "ۡ۟ۧ";
                        break;
                    }
                case 7610:
                    return;
                case 1733566:
                    this.f325 = i;
                    str = "ۣۢ۟";
                    break;
            }
        }
    }

    /* renamed from: ̙̗̙̗, reason: not valid java name and contains not printable characters */
    public void m1793(int i) {
        String str = "ۢۡۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749729) {
                case 99:
                    this.f323 = i;
                    if (C0381.m5127() > 0) {
                        str = "ۧۤۦ";
                        break;
                    } else {
                        C0335.m2923();
                        break;
                    }
                case 30536:
                    return;
                case 1732123:
                    if (C0382.m5180() > 0) {
                        str = "ۢۡۡ";
                        break;
                    } else {
                        C0335.m2923();
                        break;
                    }
            }
        }
    }
}
