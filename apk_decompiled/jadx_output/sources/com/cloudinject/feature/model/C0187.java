package com.cloudinject.feature.model;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0089;
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
/* renamed from: com.cloudinject.feature.model.̖̙, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0187 {
    public static final int ACTION_BROWSER = 2;
    public static final int ACTION_QQ_GROUP = 1;
    public static final int ACTION_SHARE = 4;

    /* renamed from: ̗̗̗̖̗̗̗, reason: not valid java name and contains not printable characters */
    public static final int f260 = 1;

    /* renamed from: ̗̗̗̖̗̗̙, reason: not valid java name and contains not printable characters */
    public static final int f261 = 2;

    /* renamed from: ̗̗̗̗̖̖̖, reason: not valid java name and contains not printable characters */
    public static final int f262 = 6;

    /* renamed from: ̗̗̗̗̖̙̖, reason: not valid java name and contains not printable characters */
    public static final int f263 = 5;

    /* renamed from: ̗̗̗̗̙̙̖, reason: not valid java name and contains not printable characters */
    public static final int f264 = 3;

    /* renamed from: ̗̗̗̙̗̗̗, reason: not valid java name and contains not printable characters */
    public static final int f265 = 4;

    /* renamed from: ̗̗̗̙̗̙̙, reason: not valid java name and contains not printable characters */
    public static final int f266 = 3;
    private String cancelExt;
    private String cancelText;
    private String message;
    private String neutralExt;
    private String neutralText;
    private String themeColor;
    private String title;

    /* renamed from: ̗̗̗̖̖̗̙, reason: not valid java name and contains not printable characters */
    private int f267;

    /* renamed from: ̗̗̗̖̗̖̙, reason: not valid java name and contains not printable characters */
    private String f268;

    /* renamed from: ̗̗̗̖̗̙̙, reason: not valid java name and contains not printable characters */
    private int f269;

    /* renamed from: ̗̗̗̗̖̙̗, reason: not valid java name and contains not printable characters */
    private String f270;

    /* renamed from: ̗̗̗̙̗̗̙, reason: not valid java name and contains not printable characters */
    private int f271;

    /* renamed from: ̗̗̗̙̙̗̖, reason: not valid java name and contains not printable characters */
    private int f272;

    /* renamed from: ̗̗̗̙̙̗̗, reason: not valid java name and contains not printable characters */
    private int f273;

    /* renamed from: ̗̗̗̙̙̗̙, reason: not valid java name and contains not printable characters */
    private int f274;

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public static C0187 m1571(JSONObject jSONObject) {
        String str = "ۥ۠ۤ";
        C0187 c0187 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749663) {
                case 65:
                    C0073.m239(c0187, C0183.m1473(jSONObject, C0385.m5310(C0379.m5030())));
                    if (C0394.m5672() > 0) {
                        str = "ۣۣ۟";
                    } else {
                        continue;
                    }
                case 1084:
                    return null;
                case 2115:
                    C0078.m366(c0187, C0183.m1473(jSONObject, C0385.m5310(C0383.m5191())));
                    if (C0086.m500() <= 0) {
                        C0378.m4998();
                        str = "ۣ۠۠";
                    } else {
                        str = "ۢۨ";
                        continue;
                    }
                case 2234:
                    break;
                case 2933:
                    C0397.m5769(c0187, C0183.m1473(jSONObject, C0385.m5310(C0391.m5561())));
                    str = "ۦۦ";
                    continue;
                case 3130:
                    C0025.m95(c0187, C0390.m5535(jSONObject, C0385.m5310(C0074.m292())));
                    if (C0334.m2866() > 0) {
                        str = "ۦۥ۠";
                    } else {
                        continue;
                    }
                case 3134:
                    C0383.m5231(c0187, C0183.m1473(jSONObject, C0385.m5310(C0386.m5344())));
                    if (C0206.m1807() < 0) {
                        str = "ۤۨ۠";
                    } else {
                        continue;
                    }
                case 3894:
                    if (jSONObject != null) {
                        break;
                    } else {
                        str = "ۣۤۤ";
                    }
                case 5503:
                    C0073.m275(c0187, C0183.m1473(jSONObject, C0385.m5310(C0078.m345())));
                    if (C0078.m361() > 0) {
                        str = "ۦۧۦ";
                    } else {
                        continue;
                    }
                case 5600:
                    C0396.m5761(c0187, C0390.m5535(jSONObject, C0385.m5310(C0420.m6242())));
                    str = "ۤ۠ۦ";
                    continue;
                case 7610:
                    C0078.m376(c0187, C0390.m5535(jSONObject, C0385.m5310(C0384.m5260())));
                    if (C0083.m448() >= 0) {
                        C0370.m3284();
                    } else {
                        str = "۟ۦۧ";
                        continue;
                    }
                case 7654:
                    C0368.m3169(c0187, C0390.m5535(jSONObject, C0385.m5310(C0387.m5394())));
                    if (C0395.m5698() >= 0) {
                        C0388.m5430();
                        str = "۠ۤۧ";
                    } else {
                        str = "ۡۤۨ";
                        continue;
                    }
                case 28830:
                    C0378.m4994(c0187, C0183.m1473(jSONObject, C0385.m5310(C0397.m5770())));
                    str = "ۢۤ۠";
                    continue;
                case 28890:
                    C0179.m1415(c0187, C0183.m1473(jSONObject, C0385.m5310(C0375.m4867())));
                    str = "ۣۧۤ";
                    continue;
                case 30487:
                    C0376.m4917(c0187, C0183.m1473(jSONObject, C0385.m5310(C0073.m244())));
                    str = "ۥۨۨ";
                    continue;
                case 30550:
                    c0187 = new C0187();
                    str = "ۧۦۧ";
                    continue;
                case 30583:
                    C0025.m115(c0187, C0390.m5535(jSONObject, C0385.m5310(C0074.m313())));
                    str = "ۡۧ۟";
                    continue;
                case 31515:
                    if (C0379.m5056() > 0) {
                        str = "ۥ۠ۤ";
                    } else {
                        continue;
                    }
                case 1732162:
                    C0184.m1529(c0187, C0390.m5535(jSONObject, C0385.m5310(C0400.m5921())));
                    if (C0420.m6215() < 0) {
                        str = "ۥۨۤ";
                    } else {
                        continue;
                    }
                case 1732191:
                    C0380.m5075(c0187, C0183.m1473(jSONObject, C0385.m5310(C0370.m3319())));
                    if (C0394.m5672() <= 0) {
                        C0082.m410();
                        str = "ۣۤۧ";
                    } else {
                        str = "ۧۤ";
                        continue;
                    }
                case 1732313:
                    return c0187;
            }
            if (C0086.m500() <= 0) {
                C0073.m265();
            } else {
                str = "ۧۥۧ";
            }
        }
    }

    /* renamed from: ۟۟ۤۦۢ, reason: not valid java name and contains not printable characters */
    public static String m1572(Object obj) {
        Object obj2 = "ۥۨۢ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 56574) {
                case 156:
                case 1733179:
                    if (C0400.m5961() <= 0) {
                        C0397.m5814();
                    } else {
                        obj2 = "۟ۧۡ";
                        continue;
                    }
                case 1711387:
                    obj2 = "ۣ۟۟";
                    continue;
                case 1729121:
                    if (C0291.m2568() >= 0) {
                        break;
                    } else if (C0078.m361() <= 0) {
                        C0184.m1524();
                    } else {
                        obj2 = "۟ۦۤ";
                    }
                case 1731288:
                    if (C0083.m448() < 0) {
                        obj2 = "ۥۨۢ";
                    } else {
                        continue;
                    }
                case 1731325:
                    obj2 = "۟ۥۥ";
                    str = null;
                    continue;
                case 1733601:
                    break;
                case 1735431:
                    return str;
                case 1735459:
                    str2 = ((C0187) obj).f270;
                    if (C0420.m6215() >= 0) {
                        C0346.m3059();
                    } else {
                        obj2 = "۟۠ۡ";
                        continue;
                    }
                case 1735489:
                    if (C0291.m2568() >= 0) {
                        C0279.m2491();
                        obj2 = "ۣۣۡ";
                    } else {
                        obj2 = "ۣۥ";
                        continue;
                    }
                case 1735646:
                    obj2 = "۟ۧۡ";
                    str = str2;
                    continue;
            }
            if (C0179.m1427() <= 0) {
                C0089.m592();
                obj2 = "ۤۦۧ";
            } else {
                obj2 = "ۦۣۤ";
            }
        }
    }

    /* renamed from: ۟۟ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static int m1573(Object obj) {
        String str = "ۣۨ۠";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750757) {
                case 230:
                    return i;
                case TypedValues.PositionType.TYPE_POSITION_TYPE /* 510 */:
                    if (C0335.m2923() >= 0) {
                        break;
                    } else if (C0376.m4906() > 0) {
                        str = "ۦۦ۠";
                    }
                case 1413:
                    if (C0362.m3122() >= 0) {
                        str = "ۣۢ۟";
                        i = i2;
                    } else {
                        str = "ۣ۟۟";
                        i = i2;
                        continue;
                    }
                case 3161:
                    str = "ۡ۠ۥ";
                    continue;
                case 4408:
                    str = "ۤۧ۟";
                    i = 0;
                    continue;
                case 6211:
                case 30638:
                    if (C0390.m5512() <= 0) {
                        C0378.m4998();
                        str = "ۤۨۥ";
                    } else {
                        str = "ۣ۟۟";
                        continue;
                    }
                case 6533:
                    if (C0082.m410() < 0) {
                        str = "۟ۦۤ";
                    } else {
                        continue;
                    }
                case 7619:
                    str = "ۣۨ۠";
                    continue;
                case 28864:
                    break;
                case 29893:
                    i2 = ((C0187) obj).f267;
                    if (C0392.m5595() <= 0) {
                        C0155.m1294();
                        str = "۟ۤ۠";
                    } else {
                        str = "ۢۨۦ";
                        continue;
                    }
            }
            if (C0183.m1464() <= 0) {
                C0346.m3059();
            } else {
                str = "ۡۦۥ";
            }
        }
    }

    /* renamed from: ۣ۟۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m1574(Object obj) {
        String str = "ۣۥۧ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749663) {
                case 415:
                    if (C0382.m5180() > 0) {
                        str = "ۣۥۧ";
                    } else {
                        continue;
                    }
                case 1114:
                    if (C0389.m5481() <= 0) {
                        break;
                    } else if (C0400.m5961() <= 0) {
                        C0388.m5430();
                    } else {
                        str = "ۦ۟۠";
                    }
                case 1151:
                    return str2;
                case 3925:
                    if (C0346.m3059() >= 0) {
                        str = "ۣۢۧ";
                        str2 = null;
                    } else {
                        str = "ۡۡ۟";
                        str2 = null;
                        continue;
                    }
                case 5565:
                case 6439:
                    if (C0394.m5672() > 0) {
                        str = "ۣۦۣ";
                    } else {
                        continue;
                    }
                case 6629:
                    if (C0228.m2012() <= 0) {
                        C0378.m4998();
                        str = "ۦۣۡ";
                        str2 = str3;
                    } else {
                        str = "ۣۦۣ";
                        str2 = str3;
                        continue;
                    }
                case 7200:
                    if (C0383.m5203() <= 0) {
                        str = "ۦ۠ۡ";
                    } else {
                        str = "ۣ۟۠";
                        continue;
                    }
                case 7579:
                    break;
                case 29565:
                    str = "ۥۡۦ";
                    continue;
                case 29656:
                    str3 = ((C0187) obj).neutralText;
                    str = "۠ۥ۟";
                    continue;
            }
            str = "ۦۤ۠";
        }
    }

    /* renamed from: ۟۠ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static int m1575(Object obj) {
        String str = "ۢۧۤ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747742) {
                case 3261:
                case 26939:
                    if (C0393.m5668() <= 0) {
                        C0179.m1427();
                        str = "۠ۥۧ";
                    } else {
                        str = "ۥۦۧ";
                        continue;
                    }
                case 4571:
                    i2 = ((C0187) obj).f271;
                    str = "ۥۦۦ";
                    continue;
                case 5439:
                    str = "ۨۡۢ";
                    i = 0;
                    continue;
                case 5496:
                    return i;
                case 5499:
                    if (C0377.m4944() <= 0) {
                        C0362.m3122();
                        i = i2;
                    } else {
                        str = "ۥۦۧ";
                        i = i2;
                        continue;
                    }
                case 6177:
                    if (C0279.m2491() >= 0) {
                        break;
                    } else {
                        str = "ۤۧۨ";
                    }
                case 25111:
                    if (C0390.m5512() <= 0) {
                        str = "ۣۤۨ";
                    } else {
                        str = "ۦۦۥ";
                        continue;
                    }
                case 25276:
                    if (C0073.m265() > 0) {
                        str = "ۥۤ۠";
                    } else {
                        continue;
                    }
                case 28209:
                    break;
                case 28240:
                    str = "ۢۧۤ";
                    continue;
            }
            if (C0083.m448() < 0) {
                str = "ۨۦ۠";
            }
        }
    }

    /* renamed from: ۣۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static String m1576(Object obj) {
        String str = "ۣۥۢ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749826) {
                case 34:
                case 30020:
                    if (C0381.m5127() <= 0) {
                        C0377.m4944();
                    } else {
                        str = "ۤۨۢ";
                        continue;
                    }
                case 1382:
                    break;
                case 1410:
                    if (C0074.m307() >= 0) {
                        break;
                    } else if (C0369.m3256() <= 0) {
                        C0073.m265();
                        str = "ۥۨ";
                    } else {
                        str = "ۧۢۥ";
                    }
                case 2460:
                    return str2;
                case 2557:
                    if (C0184.m1524() < 0) {
                        str = "ۣۥۢ";
                    } else {
                        continue;
                    }
                case 3814:
                    str = "ۧۧۦ";
                    continue;
                case 7260:
                    if (C0164.m1359() >= 0) {
                        str = "۟ۤ۠";
                        str2 = null;
                    } else {
                        str = "ۥ۠۟";
                        str2 = null;
                        continue;
                    }
                case 30244:
                    if (C0386.m5322() <= 0) {
                        str = "۠۠ۨ";
                    } else {
                        str = "ۡۤۡ";
                        continue;
                    }
                case 30248:
                    str3 = ((C0187) obj).title;
                    if (C0191.m1627() >= 0) {
                        str = "۟ۡۨ";
                    } else {
                        str = "ۥۢ";
                        continue;
                    }
                case 1732575:
                    if (C0400.m5961() <= 0) {
                        str2 = str3;
                    } else {
                        str = "ۤۨۢ";
                        str2 = str3;
                        continue;
                    }
            }
            if (C0382.m5180() > 0) {
                str = "ۧۢۡ";
            }
        }
    }

    /* renamed from: ۟ۡۧۢ۟, reason: not valid java name and contains not printable characters */
    public static String m1577(Object obj) {
        Object obj2 = "ۣۧ۟";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1750718) {
                case 215:
                    if (C0388.m5430() <= 0) {
                        obj2 = "ۡ۠ۢ";
                    } else {
                        obj2 = "ۦۦۢ";
                        continue;
                    }
                case 1245:
                    return str;
                case 7551:
                case 1731254:
                    if (C0334.m2866() <= 0) {
                        C0009.m36();
                    } else {
                        obj2 = "ۢ۠ۡ";
                        continue;
                    }
                case 7843:
                    break;
                case 28824:
                    obj2 = "ۢ۠ۡ";
                    str = str2;
                    continue;
                case 28833:
                    if (C0228.m2012() > 0) {
                        obj2 = "۠ۧۨ";
                    } else {
                        continue;
                    }
                case 29621:
                    if (C0183.m1464() <= 0) {
                        break;
                    } else if (C0398.m5833() > 0) {
                        obj2 = "ۣۨۨ";
                    }
                case 29852:
                    if (C0073.m265() <= 0) {
                        C0400.m5961();
                        str = null;
                    } else {
                        obj2 = "ۧۨ۠";
                        str = null;
                        continue;
                    }
                case 32564:
                    if (C0078.m361() <= 0) {
                        C0400.m5961();
                        obj2 = "ۢۡۨ";
                    } else {
                        obj2 = "ۣۧ۟";
                        continue;
                    }
                case 32605:
                    str2 = ((C0187) obj).f268;
                    if (C0398.m5833() > 0) {
                        obj2 = "ۧۨۧ";
                    } else {
                        continue;
                    }
            }
            obj2 = "ۣۢۨ";
        }
    }

    /* renamed from: ۟ۥۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int m1578(Object obj) {
        Object obj2 = "۠ۤۤ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1746752) {
                case 66:
                    break;
                case 3104:
                    if (C0385.m5282() >= 0) {
                        break;
                    } else if (C0378.m4998() <= 0) {
                        C0393.m5668();
                    } else {
                        obj2 = "ۣۨۢ";
                    }
                case 3324:
                case 4358:
                    if (C0380.m5068() <= 0) {
                        obj2 = "۟۟ۢ";
                    } else {
                        obj2 = "ۦۧۤ";
                        continue;
                    }
                case 4459:
                    if (C0078.m361() <= 0) {
                        C0396.m5741();
                    } else {
                        obj2 = "ۦۡ۟";
                        continue;
                    }
                case 5533:
                    obj2 = "ۦۧۤ";
                    i = i2;
                    continue;
                case 25859:
                    return i;
                case 26308:
                    if (C0382.m5180() <= 0) {
                        C0380.m5068();
                        obj2 = "۠ۡۨ";
                        i = 0;
                    } else {
                        obj2 = "ۨ۠ۤ";
                        i = 0;
                        continue;
                    }
                case 28167:
                    i2 = ((C0187) obj).f272;
                    if (C0369.m3256() <= 0) {
                        C0073.m265();
                    } else {
                        obj2 = "ۢۤ۟";
                        continue;
                    }
                case 28387:
                    obj2 = "۠ۤۤ";
                    continue;
                case 28588:
                    obj2 = "ۣۡۤ";
                    continue;
            }
            obj2 = "ۣ۠ۨ";
        }
    }

    /* renamed from: ۟ۦ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static int m1579(Object obj) {
        Object obj2 = "ۤ۠ۧ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1749788) {
                case 2:
                    return i;
                case 373:
                case 2435:
                    if (C0398.m5833() > 0) {
                        obj2 = "ۢۦۢ";
                    } else {
                        continue;
                    }
                case 482:
                    if (C0396.m5741() >= 0) {
                        i = 0;
                    } else {
                        obj2 = "۟ۨۦ";
                        i = 0;
                        continue;
                    }
                case 2800:
                    if (C0179.m1427() <= 0) {
                        C0334.m2866();
                        obj2 = "ۣۨۢ";
                    } else {
                        obj2 = "ۢۥۡ";
                        continue;
                    }
                case 2807:
                    if (C0387.m5374() >= 0) {
                        break;
                    } else {
                        obj2 = "ۥ۠ۢ";
                    }
                case 2811:
                    break;
                case 3771:
                    i2 = ((C0187) obj).f269;
                    if (C0394.m5672() > 0) {
                        obj2 = "۟۠ۨ";
                    } else {
                        continue;
                    }
                case 5179:
                    obj2 = "ۢۦۢ";
                    i = i2;
                    continue;
                case 6913:
                    obj2 = "ۤۦۡ";
                    continue;
                case 30258:
                    if (C0420.m6215() >= 0) {
                        C0377.m4944();
                        obj2 = "ۢۡۤ";
                    } else {
                        obj2 = "ۤ۠ۧ";
                        continue;
                    }
            }
            if (C0399.m5914() > 0) {
                obj2 = "ۤ۠ۨ";
            }
        }
    }

    /* renamed from: ۟ۧۦۥۣ, reason: not valid java name and contains not printable characters */
    public static String m1580(Object obj) {
        String str = "ۡۤۧ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751780) {
                case 4:
                    str = "ۥۢۦ";
                    continue;
                case 154:
                    str3 = ((C0187) obj).neutralExt;
                    if (C0388.m5430() <= 0) {
                        str = "ۢۡ۟";
                    } else {
                        str = "۠ۡۡ";
                        continue;
                    }
                case 1805:
                case 32519:
                    if (C0382.m5180() <= 0) {
                        C0368.m3171();
                        str = "ۧۥ۠";
                    } else {
                        str = "ۡۤۥ";
                        continue;
                    }
                case 2533:
                    if (C0179.m1427() > 0) {
                        str = "ۡۤۧ";
                    } else {
                        continue;
                    }
                case 3180:
                    str = "ۤۨۤ";
                    str2 = null;
                    continue;
                case 4580:
                    if (C0375.m4840() >= 0) {
                        str = "ۡۧ۟";
                        str2 = str3;
                    } else {
                        str = "ۡۤۥ";
                        str2 = str3;
                        continue;
                    }
                case 5568:
                    if (C0396.m5741() > 0) {
                        break;
                    } else {
                        str = "ۤۥ۟";
                    }
                case 5573:
                    break;
                case 5574:
                    return str2;
                case 1730144:
                    str = "ۣۣۨ";
                    continue;
            }
            if (C0370.m3284() >= 0) {
                C0229.m2064();
            } else {
                str = "ۤۨ";
            }
        }
    }

    /* renamed from: ۠ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static String m1581(Object obj) {
        String str = "ۣ۟۠";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1752457) {
                case 1876:
                    if (C0380.m5068() > 0) {
                        str = "ۣ۟ۢ";
                    } else {
                        continue;
                    }
                case 1953:
                    str3 = ((C0187) obj).cancelExt;
                    if (C0074.m307() < 0) {
                        str = "ۣۣ";
                    } else {
                        continue;
                    }
                case 2710:
                    break;
                case 2958:
                    if (C0228.m2012() <= 0) {
                        C0121.m1023();
                        str = "ۧ۠۠";
                    } else {
                        str = "ۣ۟۠";
                        continue;
                    }
                case 2959:
                    if (C0380.m5068() <= 0) {
                        C0380.m5068();
                        str2 = null;
                    } else {
                        str = "ۧۡ";
                        str2 = null;
                        continue;
                    }
                case 6901:
                    if (C0334.m2866() < 0) {
                        break;
                    } else {
                        str = C0387.m5374() >= 0 ? "ۤۥ۠" : "ۤۢۦ";
                    }
                case 29743:
                case 1730156:
                    str = "ۦۧ۟";
                    continue;
                case 32695:
                    return str2;
                case 1728851:
                    str = "۟ۤ";
                    continue;
                case 1729001:
                    if (C0390.m5512() <= 0) {
                        C0391.m5571();
                        str = "ۨ۟ۤ";
                        str2 = str3;
                    } else {
                        str = "ۦۧ۟";
                        str2 = str3;
                        continue;
                    }
            }
            if (C0393.m5668() <= 0) {
                C0086.m500();
            } else {
                str = "ۤۨۡ";
            }
        }
    }

    /* renamed from: ۢۨۤۨ, reason: not valid java name and contains not printable characters */
    public static String m1582(Object obj) {
        String str = "ۧ۠ۦ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751682) {
                case 137:
                    str3 = ((C0187) obj).message;
                    str = "ۨۦ۟";
                    continue;
                case 1158:
                    return str2;
                case 2115:
                    if (C0392.m5595() <= 0) {
                        C0387.m5374();
                        str = "ۨۨۨ";
                        str2 = null;
                    } else {
                        str = "ۡ۠ۡ";
                        str2 = null;
                        continue;
                    }
                case 2461:
                    break;
                case 4355:
                case 29573:
                    if (C0398.m5833() <= 0) {
                        C0009.m36();
                    } else {
                        str = "ۥۣۢ";
                        continue;
                    }
                case 5152:
                    str = "ۨۡ۠";
                    continue;
                case 29475:
                    if (C0393.m5668() <= 0) {
                        C0082.m410();
                        str = "ۨۥۨ";
                        str2 = str3;
                    } else {
                        str = "ۥۣۢ";
                        str2 = str3;
                        continue;
                    }
                case 31552:
                    str = "ۣۢۢ";
                    continue;
                case 31688:
                    str = "ۧ۠ۦ";
                    continue;
                case 32687:
                    if (C0386.m5322() <= 0) {
                        break;
                    } else {
                        str = "ۤۡۨ";
                    }
            }
            str = "ۦۣ۟";
        }
    }

    /* renamed from: ۣۣۨۨ, reason: not valid java name and contains not printable characters */
    public static String m1583(Object obj) {
        String str = "ۣۨۨ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751648) {
                case 1087:
                case 29447:
                    str = "ۤۡ";
                    continue;
                case 1125:
                    if (C0184.m1524() >= 0) {
                        C0183.m1464();
                    } else {
                        str = "ۥۦ۠";
                        continue;
                    }
                case 2084:
                    if (C0388.m5430() <= 0) {
                        str2 = str3;
                    } else {
                        str = "ۤۡ";
                        str2 = str3;
                        continue;
                    }
                case 2086:
                    if (C0009.m36() >= 0) {
                        str = "ۥۦۥ";
                    } else {
                        str = "۠۠ۨ";
                        continue;
                    }
                case 4232:
                    str = "ۥۣۣ";
                    str2 = null;
                    continue;
                case 4419:
                    str3 = ((C0187) obj).themeColor;
                    str = "ۢ۟ۡ";
                    continue;
                case 29485:
                    if (C0335.m2923() > 0) {
                        break;
                    } else if (C0009.m36() >= 0) {
                        C0083.m448();
                    } else {
                        str = "۠ۢۥ";
                    }
                case 30815:
                    if (C0346.m3059() >= 0) {
                        str = "ۡۤۡ";
                    } else {
                        str = "ۣۨۨ";
                        continue;
                    }
                case 32556:
                    break;
                case 1730077:
                    return str2;
            }
            if (C0377.m4944() > 0) {
                str = "ۣۢ۟";
            }
        }
    }

    /* renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static int m1584(Object obj) {
        String str = "ۨۨۦ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751653) {
                case 224:
                    i2 = ((C0187) obj).f274;
                    str = "۟۠۠";
                    continue;
                case 1920:
                case 4603:
                    str = "ۣ۠۠";
                    continue;
                case 2342:
                    break;
                case 3151:
                    if (C0346.m3059() >= 0) {
                        C0397.m5814();
                        str = "ۥۧ۟";
                        i = 0;
                    } else {
                        str = "۟ۨۦ";
                        i = 0;
                        continue;
                    }
                case 4440:
                    return i;
                case 4728:
                    str = "ۥۢۢ";
                    continue;
                case 5312:
                    str = "ۣ۠ۧ";
                    continue;
                case 7546:
                    if (C0398.m5833() <= 0) {
                        C0191.m1627();
                        i = i2;
                    } else {
                        str = "ۣ۠۠";
                        i = i2;
                        continue;
                    }
                case 29571:
                    if (C0009.m36() > 0) {
                        break;
                    } else if (C0384.m5278() > 0) {
                        str = "ۤۥۦ";
                    }
                case 29626:
                    if (C0121.m1023() >= 0) {
                        C0121.m1023();
                        str = "ۢۡ";
                    } else {
                        str = "ۨۨۦ";
                        continue;
                    }
            }
            str = "ۡ۠ۤ";
        }
    }

    /* renamed from: ۥۡۦ۠, reason: contains not printable characters */
    public static int m1585(Object obj) {
        String str = "ۣ۟ۥ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751587) {
                case 32:
                    i2 = ((C0187) obj).f273;
                    if (C0393.m5668() <= 0) {
                        C0279.m2491();
                        str = "۠ۧۤ";
                    } else {
                        str = "ۨۡ۟";
                        continue;
                    }
                case 2148:
                    break;
                case 2335:
                    if (C0396.m5741() >= 0) {
                        C0025.m118();
                        str = "ۣ۟ۡ";
                        i = 0;
                    } else {
                        str = "ۣۡ۠";
                        i = 0;
                        continue;
                    }
                case 3114:
                    if (C0390.m5512() < 0) {
                        break;
                    } else if (C0395.m5698() >= 0) {
                        C0082.m410();
                    } else {
                        str = "ۤۡ۠";
                    }
                case 3230:
                case 1730209:
                    if (C0335.m2923() >= 0) {
                        C0387.m5374();
                    } else {
                        str = "ۧ۠ۤ";
                        continue;
                    }
                case 3288:
                    str = "ۢۧۡ";
                    continue;
                case 5255:
                    if (C0376.m4906() > 0) {
                        str = "ۣۥ۟";
                    } else {
                        continue;
                    }
                case 29390:
                    if (C0420.m6215() >= 0) {
                        C0335.m2923();
                    } else {
                        str = "ۣ۟ۥ";
                        continue;
                    }
                case 29477:
                    if (C0386.m5322() <= 0) {
                        C0025.m118();
                        i = i2;
                    } else {
                        str = "ۧ۠ۤ";
                        i = i2;
                        continue;
                    }
                case 32520:
                    return i;
            }
            if (C0191.m1627() >= 0) {
                C0155.m1294();
                str = "ۨۥ۠";
            } else {
                str = "ۣۧ۟";
            }
        }
    }

    /* renamed from: ۧۦۢ۠, reason: not valid java name and contains not printable characters */
    public static String m1586(Object obj) {
        Object obj2 = "ۢۢۢ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1748673) {
                case 417:
                case 1733248:
                    if (C0164.m1359() >= 0) {
                        C0346.m3059();
                    } else {
                        obj2 = "ۢۧۥ";
                        continue;
                    }
                case 1033:
                    if (C0391.m5571() <= 0) {
                        C0392.m5595();
                        obj2 = "۠ۦۤ";
                        str = null;
                    } else {
                        obj2 = "ۨۦۦ";
                        str = null;
                        continue;
                    }
                case 5316:
                    obj2 = "۠۟ۧ";
                    continue;
                case 7267:
                    if (C0399.m5914() < 0) {
                        break;
                    } else if (C0279.m2491() < 0) {
                        obj2 = "۟ۡ";
                    }
                case 7553:
                    return str;
                case 26473:
                    if (C0386.m5322() > 0) {
                        obj2 = "ۡۦۥ";
                    } else {
                        continue;
                    }
                case 27596:
                    break;
                case 28419:
                    if (C0400.m5961() <= 0) {
                        C0334.m2866();
                        obj2 = "ۥۦۦ";
                    } else {
                        obj2 = "ۢۢۢ";
                        continue;
                    }
                case 1733278:
                    obj2 = "ۢۧۥ";
                    str = str2;
                    continue;
                case 1733923:
                    str2 = ((C0187) obj).cancelText;
                    if (C0073.m265() <= 0) {
                        C0179.m1427();
                    } else {
                        obj2 = "ۣۢ";
                        continue;
                    }
            }
            if (C0383.m5203() <= 0) {
                C0155.m1294();
            } else {
                obj2 = "ۤۡۢ";
            }
        }
    }

    public int getActionType() {
        return m1573(this);
    }

    public String getCancelExt() {
        return m1581(this);
    }

    public String getCancelText() {
        return m1586(this);
    }

    public String getMessage() {
        return m1582(this);
    }

    public String getNeutralExt() {
        return m1580(this);
    }

    public String getNeutralText() {
        return m1574(this);
    }

    public String getThemeColor() {
        return m1583(this);
    }

    public String getTitle() {
        return m1576(this);
    }

    public void setCancelExt(String str) {
        String str2 = "ۥۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1746786) {
                case 5187:
                    return;
                case 25129:
                    str2 = "ۥۦ";
                    break;
                case 1735619:
                    this.cancelExt = str;
                    if (C0400.m5961() > 0) {
                        str2 = "ۢۦۥ";
                        break;
                    } else {
                        C0385.m5282();
                        break;
                    }
            }
        }
    }

    public void setCancelText(String str) {
        String str2 = "ۣۢۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1754660) {
                case 25055:
                    str2 = "ۣۢۡ";
                    break;
                case 28742:
                    this.cancelText = str;
                    if (C0393.m5668() > 0) {
                        str2 = "ۥۣ۟";
                        break;
                    } else {
                        str2 = "۠ۧۤ";
                        break;
                    }
                case 31661:
                    return;
            }
        }
    }

    public void setMessage(String str) {
        String str2 = "ۣۣۣ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1754655) {
                case 28828:
                    this.message = str;
                    if (C0383.m5203() > 0) {
                        str2 = "ۣۤۡ";
                        break;
                    } else {
                        str2 = "۟ۥۨ";
                        break;
                    }
                case 31769:
                    return;
                case 32727:
                    if (C0383.m5203() > 0) {
                        str2 = "ۣۣۣ";
                        break;
                    } else {
                        str2 = "ۡۡۤ";
                        break;
                    }
            }
        }
    }

    public void setNeutralExt(String str) {
        String str2 = "۟۟ۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1751587) {
                case 3207:
                    if (C0390.m5512() > 0) {
                        str2 = "۟۟ۦ";
                        break;
                    } else {
                        str2 = "ۥۦ۠";
                        break;
                    }
                case 7461:
                    this.neutralExt = str;
                    if (C0376.m4906() > 0) {
                        str2 = "۟ۤۥ";
                        break;
                    } else {
                        C0370.m3284();
                        break;
                    }
                case 7555:
                    return;
            }
        }
    }

    public void setNeutralText(String str) {
        String str2 = "ۥۢۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1750659) {
                case 2922:
                    this.neutralText = str;
                    if (C0397.m5814() <= 0) {
                        break;
                    } else {
                        str2 = "ۣۡ۠";
                        break;
                    }
                case 6183:
                    return;
                case 1731096:
                    str2 = "ۥۢۦ";
                    break;
            }
        }
    }

    public void setThemeColor(String str) {
        String str2 = "ۡ۟۟";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753640) {
                case 25933:
                    if (C0393.m5668() <= 0) {
                        break;
                    } else {
                        str2 = "ۡ۟۟";
                        break;
                    }
                case 27817:
                    this.themeColor = str;
                    if (C0381.m5127() > 0) {
                        str2 = "ۣ۠ۤ";
                        break;
                    } else {
                        str2 = "۠۟";
                        break;
                    }
                case 29711:
                    return;
            }
        }
    }

    public void setTitle(String str) {
        String str2 = "ۣ۠ۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1750532) {
                case 4507:
                    return;
                case 7608:
                    this.title = str;
                    if (C0291.m2568() >= 0) {
                        break;
                    } else {
                        str2 = "۟ۤۤ";
                        break;
                    }
                case 1732091:
                    if (C0206.m1807() >= 0) {
                        break;
                    } else {
                        str2 = "ۣ۠ۧ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̖̗̗, reason: not valid java name and contains not printable characters */
    public void m1587(String str) {
        String str2 = "ۥۣ۠";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56290) {
                case 1728867:
                    return;
                case 1730016:
                    this.f270 = str;
                    str2 = "ۤۥۢ";
                    break;
                case 1733930:
                    if (C0375.m4840() >= 0) {
                        break;
                    } else {
                        str2 = "ۥۣ۠";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̖̗̗̗̖, reason: not valid java name and contains not printable characters */
    public int m1588() {
        return m1585(this);
    }

    /* renamed from: ̗̖̗̗̙̖, reason: not valid java name and contains not printable characters */
    public int m1589() {
        return m1575(this);
    }

    /* renamed from: ̗̙̖̖, reason: not valid java name and contains not printable characters */
    public void m1590(String str) {
        String str2 = "۠ۧۢ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56483) {
                case 1731136:
                    return;
                case 1734250:
                    if (C0382.m5180() <= 0) {
                        break;
                    } else {
                        str2 = "۠ۧۢ";
                        break;
                    }
                case 1734424:
                    this.f268 = str;
                    str2 = "ۣۦۦ";
                    break;
            }
        }
    }

    /* renamed from: ̗̙̖̙̖, reason: not valid java name and contains not printable characters */
    public void m1591(int i) {
        String str = "۟ۥۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56483) {
                case 1732519:
                    if (C0086.m500() <= 0) {
                        break;
                    } else {
                        str = "۟ۥۥ";
                        break;
                    }
                case 1733157:
                    return;
                case 1735452:
                    this.f269 = i;
                    str = "ۡ۟ۤ";
                    break;
            }
        }
    }

    /* renamed from: ̗̙̖̙̗, reason: not valid java name and contains not printable characters */
    public void m1592(int i) {
        String str = "ۦۣۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753668) {
                case 808:
                    if (C0398.m5833() > 0) {
                        str = "ۦۣۦ";
                        break;
                    } else {
                        str = "ۦۨ۠";
                        break;
                    }
                case 909:
                    this.f273 = i;
                    str = "ۢ۠۠";
                    break;
                case 28710:
                    return;
            }
        }
    }

    /* renamed from: ̗̙̗̖̗̗, reason: not valid java name and contains not printable characters */
    public int m1593() {
        return m1579(this);
    }

    /* renamed from: ̗̙̗̖̗̙, reason: not valid java name and contains not printable characters */
    public String m1594() {
        return m1572(this);
    }

    /* renamed from: ̗̙̗̖̙̙, reason: not valid java name and contains not printable characters */
    public String m1595() {
        return m1577(this);
    }

    /* renamed from: ̗̙̗̗̙̖, reason: not valid java name and contains not printable characters */
    public int m1596() {
        return m1584(this);
    }

    /* renamed from: ̗̙̗̙̗̗, reason: not valid java name and contains not printable characters */
    public int m1597() {
        return m1578(this);
    }

    /* renamed from: ̗̙̙̖̖, reason: not valid java name and contains not printable characters */
    public void m1598(int i) {
        String str = "ۨۧۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746815) {
                case 119:
                    if (C0009.m36() < 0) {
                        str = "ۨۧۢ";
                        break;
                    } else {
                        C0206.m1807();
                        break;
                    }
                case 5592:
                    return;
                case 28348:
                    this.f271 = i;
                    if (C0394.m5672() <= 0) {
                        break;
                    } else {
                        str = "ۢۢۧ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̙̙̙̗, reason: not valid java name and contains not printable characters */
    public void m1599(int i) {
        String str = "۠ۦۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755437) {
                case 25229:
                    return;
                case 25270:
                    this.f274 = i;
                    str = "۠ۦۦ";
                    break;
                case 1709486:
                    str = "۠ۦۡ";
                    break;
            }
        }
    }

    /* renamed from: ̙̗̖̙, reason: not valid java name and contains not printable characters */
    public void m1600(int i) {
        String str = "ۥ۠۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755529) {
                case 73:
                    str = "ۥ۠۟";
                    break;
                case 29741:
                    this.f272 = i;
                    if (C0179.m1427() > 0) {
                        str = "۠ۢ";
                        break;
                    } else {
                        C0376.m4906();
                        break;
                    }
                case 1709451:
                    return;
            }
        }
    }

    /* renamed from: ̙̙̗̖, reason: not valid java name and contains not printable characters */
    public void m1601(int i) {
        String str = "ۨۥۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754532) {
                case 3116:
                    this.f267 = i;
                    if (C0387.m5374() < 0) {
                        str = "ۥۢۦ";
                        break;
                    } else {
                        str = "ۣۡۧ";
                        break;
                    }
                case 30797:
                    return;
                case 30830:
                    if (C0073.m265() <= 0) {
                        break;
                    } else {
                        str = "ۨۥۥ";
                        break;
                    }
            }
        }
    }
}
