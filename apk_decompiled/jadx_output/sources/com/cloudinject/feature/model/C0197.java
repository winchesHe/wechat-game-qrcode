package com.cloudinject.feature.model;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import androidx.core.view.PointerIconCompat;
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
/* renamed from: com.cloudinject.feature.model.̗̗̙, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0197 {
    public static final int ACTION_BROWSER = 2;
    public static final int ACTION_QQ = 1;
    public static final int ACTION_SHARE = 4;

    /* renamed from: ̗̗̗̗̙̙̖, reason: not valid java name and contains not printable characters */
    public static final int f302 = 3;
    private String cancelExt;
    private String cancelText;
    private String message;
    private String neutralExt;
    private String neutralText;
    private String title;

    /* renamed from: ̗̗̗̖̖̗̙, reason: not valid java name and contains not printable characters */
    private int f303;

    /* renamed from: ̗̗̗̖̗̙̙, reason: not valid java name and contains not printable characters */
    private int f304;

    /* renamed from: ̗̗̗̗̖̙̗, reason: not valid java name and contains not printable characters */
    private String f305;

    /* renamed from: ̗̗̗̙̙̗̖, reason: not valid java name and contains not printable characters */
    private int f306;

    /* renamed from: ̗̗̗̙̙̗̗, reason: not valid java name and contains not printable characters */
    private int f307;

    /* renamed from: ̙̙, reason: not valid java name and contains not printable characters */
    public static C0197 m1725(JSONObject jSONObject) {
        String str = "ۣ۠";
        C0197 c0197 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751559) {
                case 218:
                    C0206.m1824(c0197, C0183.m1473(jSONObject, C0385.m5310(C0386.m5344())));
                    if (C0368.m3171() < 0) {
                        str = "۟ۨۨ";
                    } else {
                        continue;
                    }
                case 1996:
                    return c0197;
                case 4358:
                    C0088.m587(c0197, C0183.m1473(jSONObject, C0385.m5310(C0073.m244())));
                    if (C0121.m1023() < 0) {
                        str = "۠ۤ";
                    } else {
                        continue;
                    }
                case 4632:
                    C0086.m515(c0197, C0183.m1473(jSONObject, C0385.m5310(C0078.m345())));
                    str = "ۣۧ۠";
                    continue;
                case 5382:
                    C0089.m612(c0197, C0390.m5535(jSONObject, C0385.m5310(C0387.m5394())));
                    str = "ۤۨۡ";
                    continue;
                case 5412:
                    c0197 = new C0197();
                    str = "ۧۤۨ";
                    continue;
                case 7613:
                    break;
                case 7676:
                    str = "ۣ۠";
                    continue;
                case 29408:
                    return null;
                case 30726:
                    C0398.m5842(c0197, C0390.m5535(jSONObject, C0385.m5310(C0420.m6242())));
                    if (C0073.m265() > 0) {
                        str = "۠ۡ";
                    } else {
                        continue;
                    }
                case 32557:
                    C0379.m5016(c0197, C0183.m1473(jSONObject, C0385.m5310(C0375.m4867())));
                    str = "۠ۡۢ";
                    continue;
                case 32684:
                    C0078.m340(c0197, C0390.m5535(jSONObject, C0385.m5310(C0400.m5921())));
                    if (C0383.m5203() <= 0) {
                        C0395.m5698();
                    } else {
                        str = "ۣۣۡ";
                        continue;
                    }
                case 32705:
                    C0121.m988(c0197, C0183.m1473(jSONObject, C0385.m5310(C0379.m5030())));
                    if (C0388.m5430() <= 0) {
                        C0060.m216();
                    } else {
                        str = "ۦۥ۠";
                        continue;
                    }
                case 1730051:
                    C0385.m5284(c0197, C0390.m5535(jSONObject, C0385.m5310(C0074.m292())));
                    str = "ۢۨ";
                    continue;
                case 1730054:
                    C0399.m5888(c0197, C0183.m1473(jSONObject, C0385.m5310(C0391.m5561())));
                    if (C0191.m1627() < 0) {
                        str = "ۥۡۧ";
                    } else {
                        continue;
                    }
                case 1730113:
                    C0164.m1348(c0197, C0183.m1473(jSONObject, C0385.m5310(C0397.m5770())));
                    if (C0089.m592() > 0) {
                        str = "ۧۥۤ";
                    } else {
                        continue;
                    }
                case 1730138:
                    if (jSONObject != null) {
                        break;
                    } else if (C0394.m5672() > 0) {
                        str = "ۨ۠۟";
                    }
            }
            if (C0395.m5698() < 0) {
                str = "ۡۤۦ";
            }
        }
    }

    /* renamed from: ۟۟۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static int m1726(Object obj) {
        String str = "ۧ۟ۢ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56512) {
                case 191:
                    str = "ۧ۟ۢ";
                    continue;
                case 1710408:
                    break;
                case 1710538:
                    if (C0155.m1294() >= 0) {
                        break;
                    } else if (C0009.m36() < 0) {
                        str = "ۤۢۡ";
                    }
                case 1730051:
                    if (C0073.m265() <= 0) {
                        C0380.m5068();
                        str = "۠ۤۥ";
                        i = i2;
                    } else {
                        str = "ۣۨۨ";
                        i = i2;
                        continue;
                    }
                case 1730181:
                case 1733122:
                    str = "ۣۨۨ";
                    continue;
                case 1730275:
                    i2 = ((C0197) obj).f303;
                    if (C0383.m5203() <= 0) {
                        str = "۟ۢ";
                    } else {
                        str = "ۤۧۦ";
                        continue;
                    }
                case 1731107:
                    if (C0060.m216() <= 0) {
                        str = "۠ۤۨ";
                    } else {
                        str = "ۡۡۢ";
                        continue;
                    }
                case 1731523:
                    str = "ۣ۟ۤ";
                    continue;
                case 1731555:
                    return i;
                case 1735518:
                    str = "ۣۦۦ";
                    i = 0;
                    continue;
            }
            if (C0377.m4944() > 0) {
                str = "ۣۧۧ";
            }
        }
    }

    /* renamed from: ۣ۟ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static int m1727(Object obj) {
        String str = "ۧۢۨ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690(str) ^ 1747743) {
                case 1149:
                    if (C0388.m5430() <= 0) {
                        C0121.m1023();
                    } else {
                        str = "ۢۥۤ";
                        continue;
                    }
                case 4480:
                case 5812:
                    if (C0009.m36() >= 0) {
                        C0369.m3256();
                        str = "ۦ۟ۧ";
                    } else {
                        str = "ۥۨ۟";
                        continue;
                    }
                case 5507:
                    return i;
                case 5816:
                    break;
                case 6174:
                    if (C0291.m2568() >= 0) {
                        C0060.m216();
                        i = 0;
                    } else {
                        str = "ۣۧۡ";
                        i = 0;
                        continue;
                    }
                case 6179:
                    i2 = ((C0197) obj).f304;
                    if (C0279.m2491() >= 0) {
                        C0393.m5668();
                    } else {
                        str = "ۧۦۤ";
                        continue;
                    }
                case 25584:
                    str = "ۧۢۨ";
                    continue;
                case 28246:
                    if (C0334.m2866() <= 0) {
                        C0384.m5278();
                        str = "ۨۤۥ";
                    } else {
                        str = "ۥ۠ۦ";
                        continue;
                    }
                case 28274:
                    if (C0393.m5668() < 0) {
                        break;
                    } else if (C0379.m5056() <= 0) {
                        C0082.m410();
                    } else {
                        str = "ۢۧۡ";
                    }
                case 28410:
                    if (C0368.m3171() >= 0) {
                        i = i2;
                    } else {
                        str = "ۥۨ۟";
                        i = i2;
                        continue;
                    }
            }
            str = C0394.m5672() <= 0 ? "ۢۢۥ" : "ۡۦۧ";
        }
    }

    /* renamed from: ۟ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m1728(Object obj) {
        String str = "ۥۡۧ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754659) {
                case 999:
                    if (C0387.m5374() >= 0) {
                        i = i2;
                    } else {
                        str = "ۣۡۤ";
                        i = i2;
                        continue;
                    }
                case 1123:
                case 25051:
                    if (C0183.m1464() > 0) {
                        str = "ۣۡۤ";
                    } else {
                        continue;
                    }
                case 24865:
                    break;
                case 24924:
                    if (C0191.m1627() >= 0) {
                        str = "ۨۢۥ";
                    } else {
                        str = "ۥۡۧ";
                        continue;
                    }
                case 26913:
                    return i;
                case 27878:
                    if (C0362.m3122() >= 0) {
                        str = "ۢ۠ۦ";
                    } else {
                        str = "۟ۧ۠";
                        continue;
                    }
                case 28152:
                    i2 = ((C0197) obj).f307;
                    if (C0392.m5595() <= 0) {
                        str = "۠ۢۦ";
                    } else {
                        str = "ۧۥۢ";
                        continue;
                    }
                case 30012:
                    if (C0376.m4906() <= 0) {
                        C0397.m5814();
                    } else {
                        str = "ۣۤۨ";
                        continue;
                    }
                case 31720:
                    if (C0279.m2491() > 0) {
                        break;
                    } else if (C0370.m3284() >= 0) {
                        C0388.m5430();
                        str = "ۣۡۨ";
                    } else {
                        str = "ۣ۠ۨ";
                    }
                case 31850:
                    str = "۠۟ۤ";
                    i = 0;
                    continue;
            }
            str = "ۢۦۣ";
        }
    }

    /* renamed from: ۟ۥ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m1729(Object obj) {
        String str = "۟ۡ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753418) {
                case 1167:
                    if (C0388.m5430() > 0) {
                        str = "ۨۨ۠";
                    } else {
                        continue;
                    }
                case 2218:
                case 26315:
                    if (C0383.m5203() <= 0) {
                        C0369.m3256();
                    } else {
                        str = "ۥۦۡ";
                        continue;
                    }
                case 26288:
                    str = "۟ۡ";
                    continue;
                case 26344:
                    str3 = ((C0197) obj).neutralExt;
                    str = "ۡۤۧ";
                    continue;
                case 28270:
                    if (C0009.m36() >= 0) {
                        C0086.m500();
                        str2 = str3;
                    } else {
                        str = "ۥۦۡ";
                        str2 = str3;
                        continue;
                    }
                case 31553:
                    if (C0025.m118() <= 0) {
                        C0121.m1023();
                        str2 = null;
                    } else {
                        str = "ۧۥۣ";
                        str2 = null;
                        continue;
                    }
                case 32554:
                    return str2;
                case 32715:
                    break;
                case 1710760:
                    if (C0073.m265() < 0) {
                        break;
                    } else if (C0420.m6215() < 0) {
                        str = "۟ۤۧ";
                    }
                case 1710767:
                    if (C0334.m2866() <= 0) {
                        C0384.m5278();
                    } else {
                        str = "ۤۡۨ";
                        continue;
                    }
            }
            if (C0378.m4998() <= 0) {
                C0393.m5668();
            } else {
                str = "۟ۤ";
            }
        }
    }

    /* renamed from: ۠ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static String m1730(Object obj) {
        String str = "ۨۧۦ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753636) {
                case 1058:
                    if (C0179.m1427() > 0) {
                        str = "ۨۧۦ";
                    } else {
                        continue;
                    }
                case 2829:
                case 27995:
                    if (C0335.m2923() >= 0) {
                        str = "ۡ۟ۢ";
                    } else {
                        str = "ۥۣ۟";
                        continue;
                    }
                case 3043:
                    if (C0228.m2012() <= 0) {
                        break;
                    } else if (C0334.m2866() <= 0) {
                        C0229.m2064();
                        str = "ۣۣ۠";
                    } else {
                        str = "ۢ۟ۦ";
                    }
                case 26818:
                    if (C0375.m4840() >= 0) {
                        C0368.m3171();
                        str = "ۧ۠ۡ";
                    } else {
                        str = "ۤ۟۟";
                        continue;
                    }
                case 26886:
                    break;
                case 28781:
                    str3 = ((C0197) obj).message;
                    if (C0382.m5180() <= 0) {
                        str = "ۨۢۡ";
                    } else {
                        str = "ۢۤ۠";
                        continue;
                    }
                case 28922:
                    if (C0379.m5056() <= 0) {
                        C0362.m3122();
                        str2 = str3;
                    } else {
                        str = "ۥۣ۟";
                        str2 = str3;
                        continue;
                    }
                case 30722:
                    str = "ۡۧۥ";
                    continue;
                case 31712:
                    if (C0086.m500() <= 0) {
                        C0346.m3059();
                        str = "ۡۧ۠";
                        str2 = null;
                    } else {
                        str = "ۤۢۤ";
                        str2 = null;
                        continue;
                    }
                case 32685:
                    return str2;
            }
            str = C0391.m5571() <= 0 ? "ۡۢۢ" : "۠۠ۦ";
        }
    }

    /* renamed from: ۠ۦۨۤ, reason: not valid java name and contains not printable characters */
    public static String m1731(Object obj) {
        String str = "ۤۤ۠";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746878) {
                case 2232:
                    break;
                case 3079:
                    if (C0382.m5180() > 0) {
                        str = "ۣ۠ۦ";
                    } else {
                        continue;
                    }
                case 3325:
                    if (C0279.m2491() >= 0) {
                        str2 = null;
                    } else {
                        str = "ۦۢۦ";
                        str2 = null;
                        continue;
                    }
                case 5308:
                case 25209:
                    if (C0390.m5512() > 0) {
                        str = "ۣۧ۠";
                    } else {
                        continue;
                    }
                case 5430:
                    str3 = ((C0197) obj).title;
                    str = "ۤۥۡ";
                    continue;
                case 6740:
                    str = "ۤۤ۠";
                    continue;
                case 7486:
                    str = "ۣۧ۠";
                    str2 = str3;
                    continue;
                case 7646:
                    if (C0228.m2012() <= 0) {
                        break;
                    } else {
                        str = "ۢۡۧ";
                    }
                case 25146:
                    return str2;
                case 26132:
                    if (C0025.m118() > 0) {
                        str = "ۢۥۥ";
                    } else {
                        continue;
                    }
            }
            if (C0397.m5814() <= 0) {
                C0398.m5833();
            } else {
                str = "۠ۧ۠";
            }
        }
    }

    /* renamed from: ۣۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String m1732(Object obj) {
        String str = "ۣ۠ۨ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753484) {
                case 5:
                    if (C0375.m4840() >= 0) {
                        str2 = str3;
                    } else {
                        str = "ۦ۠۟";
                        str2 = str3;
                        continue;
                    }
                case 233:
                    return str2;
                case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                    if (C0346.m3059() >= 0) {
                        C0393.m5668();
                        str2 = null;
                    } else {
                        str = "ۢۢۤ";
                        str2 = null;
                        continue;
                    }
                case 27337:
                    if (C0381.m5127() <= 0) {
                        break;
                    } else if (C0088.m573() <= 0) {
                        C0184.m1524();
                        str = "ۥۣۦ";
                    } else {
                        str = "ۡ۟۠";
                    }
                case 27383:
                    if (C0369.m3256() <= 0) {
                        C0369.m3256();
                        str = "ۢۡۢ";
                    } else {
                        str = "ۣ۠ۨ";
                        continue;
                    }
                case 28430:
                    str3 = ((C0197) obj).neutralText;
                    str = "ۦۡۤ";
                    continue;
                case 29395:
                    if (C0183.m1464() <= 0) {
                        str = "ۦۨۢ";
                    } else {
                        str = "ۦۥۤ";
                        continue;
                    }
                case 29480:
                    if (C0206.m1807() >= 0) {
                        C0179.m1427();
                    } else {
                        str = "ۣۦ۠";
                        continue;
                    }
                case 29517:
                    break;
                case 30545:
                case 31745:
                    if (C0391.m5571() <= 0) {
                        str = "ۥۣۨ";
                    } else {
                        str = "ۦ۠۟";
                        continue;
                    }
            }
            if (C0370.m3284() >= 0) {
                C0400.m5961();
            } else {
                str = "ۢۨۥ";
            }
        }
    }

    /* renamed from: ۣۦۦ۠, reason: not valid java name and contains not printable characters */
    public static int m1733(Object obj) {
        String str = "ۣۧ۠";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690(str) ^ 1749668) {
                case 227:
                    if (C0083.m448() >= 0) {
                        i = i2;
                    } else {
                        str = "ۣۥۥ";
                        i = i2;
                        continue;
                    }
                case 1112:
                    if (C0400.m5961() < 0) {
                        break;
                    } else {
                        str = C0074.m307() >= 0 ? "ۧ۟ۧ" : "ۡۦ۟";
                    }
                case 1127:
                    return i;
                case 1223:
                    break;
                case 1465:
                    if (C0391.m5571() > 0) {
                        str = "ۣ۟ۤ";
                    } else {
                        continue;
                    }
                case 5412:
                    if (C0380.m5068() <= 0) {
                        i = 0;
                    } else {
                        str = "ۨۤ۟";
                        i = 0;
                        continue;
                    }
                case 6428:
                case 7558:
                    if (C0334.m2866() <= 0) {
                        C0381.m5127();
                    } else {
                        str = "ۣۥۥ";
                        continue;
                    }
                case 7642:
                    if (C0229.m2064() < 0) {
                        str = "ۣۧ۠";
                    } else {
                        continue;
                    }
                case 7678:
                    i2 = ((C0197) obj).f306;
                    if (C0378.m4998() > 0) {
                        str = "ۢ۟ۤ";
                    } else {
                        continue;
                    }
                case 31687:
                    if (C0184.m1524() < 0) {
                        str = "ۡۤۥ";
                    } else {
                        continue;
                    }
            }
            str = "ۣۨۢ";
        }
    }

    /* renamed from: ۣۧۧۨ, reason: not valid java name and contains not printable characters */
    public static String m1734(Object obj) {
        String str = "ۧۢۥ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754376) {
                case 98:
                    if (C0394.m5672() < 0) {
                        break;
                    } else {
                        str = "ۨ۠ۨ";
                    }
                case 174:
                    if (C0229.m2064() >= 0) {
                        C0334.m2866();
                    } else {
                        str = "ۧۢۥ";
                        continue;
                    }
                case 234:
                    str = "ۢۥۡ";
                    continue;
                case 1197:
                case 30710:
                    str = "۟ۨۡ";
                    continue;
                case 1864:
                    if (C0377.m4944() <= 0) {
                        C0009.m36();
                        str = "ۢ۠۠";
                    } else {
                        str = "ۢۥۨ";
                        continue;
                    }
                case 3576:
                    str3 = ((C0197) obj).cancelText;
                    str = "۟ۧ";
                    continue;
                case 27920:
                    return str2;
                case 29577:
                    break;
                case 30221:
                    if (C0009.m36() >= 0) {
                        str2 = null;
                    } else {
                        str = "ۧۦۡ";
                        str2 = null;
                        continue;
                    }
                case 1711840:
                    if (C0387.m5374() >= 0) {
                        str = "ۡۥۧ";
                        str2 = str3;
                    } else {
                        str = "۟ۨۡ";
                        str2 = str3;
                        continue;
                    }
            }
            if (C0390.m5512() > 0) {
                str = "ۦۧۡ";
            }
        }
    }

    /* renamed from: ۥۣۤۨ, reason: contains not printable characters */
    public static String m1735(Object obj) {
        String str = "ۨۧۢ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 56388) {
                case 324:
                    if (C0369.m3256() > 0) {
                        str = "ۣۤۧ";
                    } else {
                        continue;
                    }
                case 1979:
                    if (C0368.m3171() < 0) {
                        str = "ۨۧۢ";
                    } else {
                        continue;
                    }
                case 1709447:
                    if (C0387.m5374() >= 0) {
                        break;
                    } else if (C0086.m500() <= 0) {
                        C0380.m5068();
                        str = "ۧۧ۟";
                    } else {
                        str = "ۨۥۦ";
                    }
                case 1709517:
                    str3 = ((C0197) obj).cancelExt;
                    if (C0183.m1464() > 0) {
                        str = "۟۟۟";
                    } else {
                        continue;
                    }
                case 1710409:
                case 1730060:
                    if (C0083.m448() >= 0) {
                        str = "ۧۥۥ";
                    } else {
                        str = "ۢۡۡ";
                        continue;
                    }
                case 1711372:
                    break;
                case 1732294:
                    return str2;
                case 1733348:
                    if (C0074.m307() >= 0) {
                        C0379.m5056();
                        str2 = null;
                    } else {
                        str = "ۨۨ";
                        str2 = null;
                        continue;
                    }
                case 1733720:
                    if (C0155.m1294() >= 0) {
                        C0396.m5741();
                    } else {
                        str = "ۡ۠۟";
                        continue;
                    }
                case 1735355:
                    if (C0206.m1807() >= 0) {
                        str2 = str3;
                    } else {
                        str = "ۢۡۡ";
                        str2 = str3;
                        continue;
                    }
            }
            str = C0391.m5571() <= 0 ? "۟ۦ۟" : "۟ۨۥ";
        }
    }

    /* renamed from: ۧۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m1736(Object obj) {
        Object obj2 = "ۦۣۥ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1753663) {
                case PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW /* 1015 */:
                    if (C0396.m5741() > 0) {
                        break;
                    } else if (C0398.m5833() <= 0) {
                        C0279.m2491();
                    } else {
                        obj2 = "۠ۧ۠";
                    }
                case 1816:
                case 1711750:
                    if (C0179.m1427() <= 0) {
                        C0089.m592();
                    } else {
                        obj2 = "ۧۦۢ";
                        continue;
                    }
                case 1946:
                    if (C0184.m1524() >= 0) {
                        str = null;
                    } else {
                        obj2 = "ۤۤۨ";
                        str = null;
                        continue;
                    }
                case 2012:
                    return str;
                case 27014:
                    str2 = ((C0197) obj).f305;
                    if (C0060.m216() <= 0) {
                        C0393.m5668();
                    } else {
                        obj2 = "ۡۦۣ";
                        continue;
                    }
                case 27936:
                    if (C0082.m410() >= 0) {
                        C0164.m1359();
                    } else {
                        obj2 = "ۧۤۢ";
                        continue;
                    }
                case 28001:
                    if (C0291.m2568() >= 0) {
                        C0206.m1807();
                        str = str2;
                    } else {
                        obj2 = "ۧۦۢ";
                        str = str2;
                        continue;
                    }
                case 30807:
                    if (C0388.m5430() <= 0) {
                        C0380.m5068();
                    } else {
                        obj2 = "ۧ۠۠";
                        continue;
                    }
                case 32659:
                    obj2 = "ۦۣۥ";
                    continue;
                case 32663:
                    break;
            }
            obj2 = "ۡۤۢ";
        }
    }

    public int getActionType() {
        return m1726(this);
    }

    public String getCancelExt() {
        return m1735(this);
    }

    public String getCancelText() {
        return m1734(this);
    }

    public String getMessage() {
        return m1730(this);
    }

    public String getNeutralExt() {
        return m1729(this);
    }

    public String getNeutralText() {
        return m1732(this);
    }

    public String getTitle() {
        return m1731(this);
    }

    public void setCancelExt(String str) {
        String str2 = "ۡ۟ۨ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1748680) {
                case 66:
                    this.cancelExt = str;
                    if (C0164.m1359() < 0) {
                        str2 = "ۦۧۡ";
                        break;
                    } else {
                        C0387.m5374();
                        str2 = "۠ۦ۟";
                        break;
                    }
                case 26565:
                    if (C0386.m5322() <= 0) {
                        break;
                    } else {
                        str2 = "ۡ۟ۨ";
                        break;
                    }
                case 27784:
                    return;
            }
        }
    }

    public void setCancelText(String str) {
        String str2 = "ۣۨۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56418) {
                case 1709353:
                    this.cancelText = str;
                    str2 = "ۦ۠۠";
                    break;
                case 1711364:
                    return;
                case 1732285:
                    if (C0378.m4998() > 0) {
                        str2 = "ۣۨۦ";
                        break;
                    } else {
                        C0291.m2568();
                        str2 = "ۤۥ۟";
                        break;
                    }
            }
        }
    }

    public void setMessage(String str) {
        String str2 = "ۢۨۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1754413) {
                case 3279:
                    return;
                case 27149:
                    if (C0368.m3171() < 0) {
                        str2 = "ۢۨۧ";
                        break;
                    } else {
                        str2 = "ۦۧۤ";
                        break;
                    }
                case 30284:
                    this.message = str;
                    if (C0390.m5512() > 0) {
                        str2 = "ۨۨۢ";
                        break;
                    } else {
                        C0228.m2012();
                        break;
                    }
            }
        }
    }

    public void setNeutralExt(String str) {
        String str2 = "۟ۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755341) {
                case 297:
                    return;
                case 1708836:
                    str2 = "۟ۦ";
                    break;
                case 1708842:
                    this.neutralExt = str;
                    if (C0392.m5595() > 0) {
                        str2 = "ۨۨۤ";
                        break;
                    } else {
                        C0121.m1023();
                        break;
                    }
            }
        }
    }

    public void setNeutralText(String str) {
        String str2 = "ۥۦۥ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755407) {
                case 28302:
                    return;
                case 30571:
                    this.neutralText = str;
                    if (C0206.m1807() < 0) {
                        str2 = "ۣ۟ۥ";
                        break;
                    } else {
                        C0082.m410();
                        break;
                    }
                case 1709455:
                    if (C0387.m5374() < 0) {
                        str2 = "ۥۦۥ";
                        break;
                    } else {
                        C0229.m2064();
                        str2 = "ۥۢۥ";
                        break;
                    }
            }
        }
    }

    public void setTitle(String str) {
        String str2 = "ۣۡۨ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753485) {
                case 26196:
                    return;
                case 28177:
                    this.title = str;
                    if (C0184.m1524() < 0) {
                        str2 = "۟ۦ۠";
                        break;
                    } else {
                        C0400.m5961();
                        str2 = "ۨ۟";
                        break;
                    }
                case 31653:
                    str2 = "ۣۡۨ";
                    break;
            }
        }
    }

    /* renamed from: ̗̖̗̗, reason: not valid java name and contains not printable characters */
    public void m1737(String str) {
        String str2 = "ۣ۟ۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1752677) {
                case 2159:
                    this.f305 = str;
                    if (C0378.m4998() > 0) {
                        str2 = "ۣۣۡ";
                        break;
                    } else {
                        str2 = "ۡۨۦ";
                        break;
                    }
                case 2276:
                    return;
                case 4358:
                    if (C0009.m36() >= 0) {
                        break;
                    } else {
                        str2 = "ۣ۟ۦ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̖̗̗̗̖, reason: not valid java name and contains not printable characters */
    public int m1738() {
        return m1728(this);
    }

    /* renamed from: ̗̙̖̙̖, reason: not valid java name and contains not printable characters */
    public void m1739(int i) {
        String str = "ۣ۠ۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749762) {
                case 5148:
                    return;
                case 5157:
                    if (C0392.m5595() > 0) {
                        str = "ۣ۠ۢ";
                        break;
                    } else {
                        C0228.m2012();
                        break;
                    }
                case 6179:
                    this.f304 = i;
                    if (C0078.m361() > 0) {
                        str = "۟۠۟";
                        break;
                    } else {
                        C0398.m5833();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̙̖̙̗, reason: not valid java name and contains not printable characters */
    public void m1740(int i) {
        String str = "ۣۤۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751742) {
                case 155:
                    this.f307 = i;
                    if (C0369.m3256() > 0) {
                        str = "ۦۨ۠";
                        break;
                    } else {
                        C0164.m1359();
                        break;
                    }
                case 29691:
                    if (C0089.m592() > 0) {
                        str = "ۣۤۢ";
                        break;
                    } else {
                        str = "ۥۧۢ";
                        break;
                    }
                case 30944:
                    return;
            }
        }
    }

    /* renamed from: ̗̙̗̖̗̗, reason: not valid java name and contains not printable characters */
    public int m1741() {
        return m1727(this);
    }

    /* renamed from: ̗̙̗̖̗̙, reason: not valid java name and contains not printable characters */
    public String m1742() {
        return m1736(this);
    }

    /* renamed from: ̗̙̗̙̗̗, reason: not valid java name and contains not printable characters */
    public int m1743() {
        return m1733(this);
    }

    /* renamed from: ̙̗̖̙, reason: not valid java name and contains not printable characters */
    public void m1744(int i) {
        String str = "ۦۤۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749730) {
                case 3914:
                    if (C0088.m573() > 0) {
                        str = "ۦۤۡ";
                        break;
                    } else {
                        C0368.m3171();
                        break;
                    }
                case 29441:
                    this.f306 = i;
                    str = "ۦۤۦ";
                    break;
                case 29450:
                    return;
            }
        }
    }

    /* renamed from: ̙̙̗̖, reason: not valid java name and contains not printable characters */
    public void m1745(int i) {
        String str = "ۧ۟ۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754474) {
                case 99:
                    this.f303 = i;
                    if (C0279.m2491() < 0) {
                        str = "ۥۦۡ";
                        break;
                    } else {
                        C0335.m2923();
                        str = "ۨۨۦ";
                        break;
                    }
                case 31498:
                    return;
                case 31541:
                    str = "ۧ۟ۡ";
                    break;
            }
        }
    }
}
