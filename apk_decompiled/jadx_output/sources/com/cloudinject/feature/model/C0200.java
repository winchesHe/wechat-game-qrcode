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
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
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
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0385;
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
import org.json.JSONObject;
import p027.p028.p029.C0420;

@Dex2C
/* renamed from: com.cloudinject.feature.model.̗̙̗, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0200 {
    public static final int ACTION_BROWSER = 2;
    public static final int ACTION_QQ_GROUP = 1;
    public static final int ACTION_SHARE = 4;

    /* renamed from: ̗̗̗̗̙̙̖, reason: not valid java name and contains not printable characters */
    public static final int f316 = 3;
    private String message;
    private Integer neutralActionType;
    private String neutralExt;
    private String neutralText;
    private String themeColor;

    /* renamed from: ̗̗̗̗̖̖̗, reason: not valid java name and contains not printable characters */
    private String f317;

    /* renamed from: ̗̗̗̗̖̖̙, reason: not valid java name and contains not printable characters */
    private String f318;

    /* renamed from: ̗̗̗̙̗̗̙, reason: not valid java name and contains not printable characters */
    private int f319;

    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    public static C0200 m1756(JSONObject jSONObject) {
        String str = "ۣۡۢ";
        C0200 c0200 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755590) {
                case 97:
                    if (C0382.m5180() <= 0) {
                        str = "۠ۤ۟";
                    } else {
                        str = "ۣۡۢ";
                        continue;
                    }
                case 299:
                    C0229.m2049(c0200, C0183.m1473(jSONObject, C0385.m5310(C0375.m4867())));
                    if (C0382.m5180() > 0) {
                        str = "ۤۢۨ";
                    } else {
                        continue;
                    }
                case 3079:
                    return c0200;
                case 25245:
                    return null;
                case 26268:
                    C0183.m1487(c0200, C0390.m5535(jSONObject, C0385.m5310(C0074.m313())));
                    str = "ۧۥ۟";
                    continue;
                case 26404:
                    if (jSONObject != null) {
                        break;
                    } else if (C0335.m2923() >= 0) {
                        C0395.m5698();
                    } else {
                        str = "۠ۤ۟";
                    }
                case 28376:
                    C0334.m2858(c0200, C0183.m1473(jSONObject, C0385.m5310(C0009.m25())));
                    str = "ۥۧۡ";
                    continue;
                case 28473:
                    C0082.m422(c0200, C0078.m339(C0390.m5535(jSONObject, C0385.m5310(C0074.m292()))));
                    if (C0396.m5741() < 0) {
                        str = "ۣۤۥ";
                    } else {
                        continue;
                    }
                case 29568:
                    C0369.m3235(c0200, C0183.m1473(jSONObject, C0385.m5310(C0397.m5770())));
                    str = "۟۠۟";
                    continue;
                case 29624:
                    c0200 = new C0200();
                    str = "ۨ۠ۥ";
                    continue;
                case 29676:
                    C0382.m5157(c0200, C0183.m1473(jSONObject, C0385.m5310(C0073.m244())));
                    if (C0368.m3171() >= 0) {
                        C0382.m5180();
                    } else {
                        str = "۟۟۟";
                        continue;
                    }
                case 30616:
                    break;
                case 30649:
                    C0335.m2931(c0200, C0183.m1473(jSONObject, C0385.m5310(C0383.m5191())));
                    if (C0335.m2923() >= 0) {
                        str = "ۣۣۦ";
                    } else {
                        str = "ۡۦ۟";
                        continue;
                    }
            }
            if (C0184.m1524() < 0) {
                str = "ۤۥ۟";
            }
        }
    }

    /* renamed from: ۣ۟۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m1757(Object obj) {
        Object obj2 = "۠ۧ۠";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1748897) {
                case 132:
                case 6331:
                    obj2 = "ۤۧۤ";
                    continue;
                case 1048:
                    if (C0346.m3059() > 0) {
                        break;
                    } else {
                        obj2 = "ۨ۟۟";
                    }
                case 1049:
                    if (C0375.m4840() >= 0) {
                        C0375.m4840();
                    } else {
                        obj2 = "۠ۧ۠";
                        continue;
                    }
                case 1142:
                    if (C0390.m5512() <= 0) {
                        C0229.m2064();
                        obj2 = "ۣۥۣ";
                    } else {
                        obj2 = "ۧ۟ۡ";
                        continue;
                    }
                case 1376:
                    obj2 = "ۤۧۤ";
                    str = str2;
                    continue;
                case 5472:
                    return str;
                case 26473:
                    str2 = ((C0200) obj).neutralText;
                    if (C0370.m3284() < 0) {
                        obj2 = "۠۟۠";
                    } else {
                        continue;
                    }
                case 27139:
                    if (C0385.m5282() >= 0) {
                        C0334.m2866();
                    } else {
                        obj2 = "ۡۤۨ";
                        continue;
                    }
                case 27236:
                    break;
                case 27304:
                    if (C0383.m5203() <= 0) {
                        C0387.m5374();
                        str = null;
                    } else {
                        obj2 = "ۧۤ۟";
                        str = null;
                        continue;
                    }
            }
            if (C0388.m5430() > 0) {
                obj2 = "۠ۨ۟";
            }
        }
    }

    /* renamed from: ۣ۟۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m1758(Object obj) {
        String str = "۟۟۟";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1749726) {
                case 2233:
                case 6468:
                    str = "ۨۤۤ";
                    continue;
                case 5153:
                    if (C0229.m2064() > 0) {
                        break;
                    } else if (C0179.m1427() <= 0) {
                        C0291.m2568();
                    } else {
                        str = "ۨ۟ۢ";
                    }
                case 5626:
                    str = "ۢۨ";
                    str2 = null;
                    continue;
                case 28861:
                    break;
                case 31253:
                    str3 = ((C0200) obj).themeColor;
                    if (C0377.m4944() <= 0) {
                        C0399.m5914();
                    } else {
                        str = "ۨۥۥ";
                        continue;
                    }
                case 31574:
                    if (C0089.m592() <= 0) {
                        str2 = str3;
                    } else {
                        str = "ۨۤۤ";
                        str2 = str3;
                        continue;
                    }
                case 31670:
                    return str2;
                case 31673:
                    if (C0229.m2064() < 0) {
                        str = "۟۠ۥ";
                    } else {
                        continue;
                    }
                case 1730876:
                    if (C0346.m3059() >= 0) {
                        C0164.m1359();
                        str = "ۧ۟ۧ";
                    } else {
                        str = "۟۟۟";
                        continue;
                    }
                case 1732248:
                    str = "۠ۦ۠";
                    continue;
            }
            str = C0291.m2568() >= 0 ? "ۣۤۡ" : "ۣۨۤ";
        }
    }

    /* renamed from: ۣ۟۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static String m1759(Object obj) {
        String str = "ۣۤۦ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755498) {
                case 442:
                    str = "ۦۢۡ";
                    str2 = str3;
                    continue;
                case 2255:
                    return str2;
                case 2287:
                case 30530:
                    str = "ۦۢۡ";
                    continue;
                case 3108:
                    if (C0398.m5833() <= 0) {
                        C0375.m4840();
                    } else {
                        str = "ۣۤۦ";
                        continue;
                    }
                case 26123:
                    break;
                case 29485:
                    if (C0393.m5668() <= 0) {
                        break;
                    } else if (C0377.m4944() <= 0) {
                        C0362.m3122();
                    } else {
                        str = "ۣۤۨ";
                    }
                case 29519:
                    if (C0379.m5056() <= 0) {
                        C0060.m216();
                        str = "ۤ۠۟";
                    } else {
                        str = "ۥۤۧ";
                        continue;
                    }
                case 32717:
                    str3 = ((C0200) obj).message;
                    str = "ۨ۟ۧ";
                    continue;
                case 1708683:
                    if (C0381.m5127() <= 0) {
                        str2 = null;
                    } else {
                        str = "ۣۤۢ";
                        str2 = null;
                        continue;
                    }
                case 1709463:
                    if (C0377.m4944() > 0) {
                        str = "۟۠";
                    } else {
                        continue;
                    }
            }
            if (C0420.m6215() < 0) {
                str = "ۨۥ";
            }
        }
    }

    /* renamed from: ۟ۥۡۧۢ, reason: not valid java name and contains not printable characters */
    public static String m1760(Object obj) {
        String str = "ۣۨۡ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747905) {
                case 5574:
                    if (C0229.m2064() >= 0) {
                        C0164.m1359();
                        str2 = null;
                    } else {
                        str = "ۢۤۦ";
                        str2 = null;
                        continue;
                    }
                case 5666:
                    if (C0370.m3284() >= 0) {
                        C0083.m448();
                    } else {
                        str = "ۥۣۥ";
                        continue;
                    }
                case 6434:
                    str = "ۣۨۡ";
                    continue;
                case 6437:
                    if (C0334.m2866() <= 0) {
                        C0388.m5430();
                    } else {
                        str = "ۦۥۨ";
                        continue;
                    }
                case 6439:
                    str = "ۦۨۨ";
                    str2 = str3;
                    continue;
                case 7390:
                case 27080:
                    str = "ۦۨۨ";
                    continue;
                case 25261:
                    str3 = ((C0200) obj).f317;
                    str = "ۢۤۨ";
                    continue;
                case 25291:
                    if (C0382.m5180() < 0) {
                        break;
                    } else if (C0184.m1524() >= 0) {
                        C0228.m2012();
                    } else {
                        str = "ۨۤۨ";
                    }
                case 27040:
                    break;
                case 27047:
                    return str2;
            }
            if (C0375.m4840() >= 0) {
                C0073.m265();
                str = "ۨۢ۠";
            } else {
                str = "ۥۢ۠";
            }
        }
    }

    /* renamed from: ۢۢۨۧ, reason: not valid java name and contains not printable characters */
    public static int m1761(Object obj) {
        String str = "ۨۨ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690(str) ^ 1748647) {
                case 453:
                    if (C0398.m5833() <= 0) {
                        C0394.m5672();
                    } else {
                        str = "ۨۨ";
                        continue;
                    }
                case 1724:
                    str = "ۥۣۨ";
                    continue;
                case 4248:
                    if (C0379.m5056() <= 0) {
                        i = 0;
                    } else {
                        str = "۟ۨۤ";
                        i = 0;
                        continue;
                    }
                case 4269:
                case 26479:
                    str = "ۣۤ۟";
                    continue;
                case 5999:
                    return i;
                case 6191:
                    break;
                case 7207:
                    str = "ۣۤ۟";
                    i = i2;
                    continue;
                case 7678:
                    i2 = ((C0200) obj).f319;
                    if (C0206.m1807() < 0) {
                        str = "ۢۡ۟";
                    } else {
                        continue;
                    }
                case 28429:
                    str = "ۥۥ۟";
                    continue;
                case 1733543:
                    if (C0393.m5668() <= 0) {
                        break;
                    } else if (C0335.m2923() >= 0) {
                        C0380.m5068();
                        str = "ۢۦۣ";
                    } else {
                        str = "ۢۨ۟";
                    }
            }
            str = C0025.m118() <= 0 ? "ۣ۟۟" : "ۦۢۦ";
        }
    }

    /* renamed from: ۣۥۦ۟, reason: not valid java name and contains not printable characters */
    public static Integer m1762(Object obj) {
        String str = "ۥۣ۟";
        Integer num = null;
        Integer num2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755374) {
                case 2766:
                    if (C0368.m3171() >= 0) {
                        C0378.m4998();
                    } else {
                        str = "ۢ۟";
                        continue;
                    }
                case 3466:
                case 31279:
                    if (C0228.m2012() > 0) {
                        str = "ۣ۟ۢ";
                    } else {
                        continue;
                    }
                case 24823:
                    str = "ۥۣ۟";
                    continue;
                case 26186:
                    break;
                case 28586:
                    num2 = ((C0200) obj).neutralActionType;
                    if (C0391.m5571() <= 0) {
                        str = "ۨ۟ۢ";
                    } else {
                        str = "ۣۦ۟";
                        continue;
                    }
                case 30055:
                    if (C0385.m5282() >= 0) {
                        break;
                    } else if (C0369.m3256() > 0) {
                        str = "۟ۡۦ";
                    }
                case 32306:
                    str = "ۣ۟ۢ";
                    num = num2;
                    continue;
                case 32488:
                    return num;
                case 1708810:
                    if (C0388.m5430() <= 0) {
                        C0229.m2064();
                    } else {
                        str = "ۣۢۢ";
                        continue;
                    }
                case 1709267:
                    if (C0082.m410() >= 0) {
                        str = "۟۠ۢ";
                        num = null;
                    } else {
                        str = "ۣ۟";
                        num = null;
                        continue;
                    }
            }
            if (C0368.m3171() >= 0) {
                C0082.m410();
            } else {
                str = "ۦۦ۠";
            }
        }
    }

    /* renamed from: ۣۧۤۡ, reason: not valid java name and contains not printable characters */
    public static String m1763(Object obj) {
        String str = "ۨۨۧ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755437) {
                case 202:
                    if (C0184.m1524() >= 0) {
                        break;
                    } else if (C0025.m118() > 0) {
                        str = "ۤ۠ۡ";
                    }
                case 3104:
                    if (C0370.m3284() < 0) {
                        str = "ۨ۟";
                    } else {
                        continue;
                    }
                case 28872:
                    str3 = ((C0200) obj).neutralExt;
                    if (C0398.m5833() <= 0) {
                        str = "۠ۢۥ";
                    } else {
                        str = "ۣ۠";
                        continue;
                    }
                case 29862:
                case 31248:
                    str = "ۢ۟ۥ";
                    continue;
                case 30579:
                    break;
                case 31589:
                    return str2;
                case 32551:
                    if (C0078.m361() > 0) {
                        str = "ۥ۟ۥ";
                    } else {
                        continue;
                    }
                case 32653:
                    if (C0381.m5127() <= 0) {
                        str = "ۢۨۦ";
                    } else {
                        str = "ۨۨۧ";
                        continue;
                    }
                case 1709424:
                    if (C0392.m5595() <= 0) {
                        str2 = str3;
                    } else {
                        str = "ۢ۟ۥ";
                        str2 = str3;
                        continue;
                    }
                case 1709530:
                    str = "ۣ۟ۦ";
                    str2 = null;
                    continue;
            }
            if (C0378.m4998() > 0) {
                str = "ۧ۟ۥ";
            }
        }
    }

    /* renamed from: ۧۧۨ۠, reason: not valid java name and contains not printable characters */
    public static String m1764(Object obj) {
        String str = "ۤۤۧ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747839) {
                case 167:
                    if (C0279.m2491() >= 0) {
                        str = "ۡۧۢ";
                        str2 = str3;
                    } else {
                        str = "ۡۤۨ";
                        str2 = str3;
                        continue;
                    }
                case 1114:
                    return str2;
                case 3205:
                    if (C0291.m2568() >= 0) {
                        C0183.m1464();
                    } else {
                        str = "ۤۤۧ";
                        continue;
                    }
                case 4376:
                    if (C0229.m2064() >= 0) {
                        break;
                    } else if (C0155.m1294() < 0) {
                        str = "ۧۢۢ";
                    }
                case 4576:
                case 27321:
                    str = "ۡۤۨ";
                    continue;
                case 4786:
                    if (C0393.m5668() <= 0) {
                        C0393.m5668();
                    } else {
                        str = "ۤ۟۠";
                        continue;
                    }
                case 4794:
                    if (C0082.m410() >= 0) {
                        str = "۟ۢۤ";
                        str2 = null;
                    } else {
                        str = "ۢۢۨ";
                        str2 = null;
                        continue;
                    }
                case 6615:
                    if (C0387.m5374() >= 0) {
                        C0385.m5282();
                    } else {
                        str = "ۤۦۡ";
                        continue;
                    }
                case 25332:
                    break;
                case 28184:
                    str3 = ((C0200) obj).f318;
                    str = "۠ۨ۠";
                    continue;
            }
            str = "ۤ۟ۨ";
        }
    }

    public String getMessage() {
        return m1759(this);
    }

    public Integer getNeutralActionType() {
        return m1762(this);
    }

    public String getNeutralExt() {
        return m1763(this);
    }

    public String getNeutralText() {
        return m1757(this);
    }

    public String getPassword() {
        return m1760(this);
    }

    public String getThemeColor() {
        return m1758(this);
    }

    public void setMessage(String str) {
        String str2 = "ۡۦ۟";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1746847) {
                case 184:
                    return;
                case 2245:
                    this.message = str;
                    if (C0164.m1359() >= 0) {
                        break;
                    } else {
                        str2 = "۟۠ۨ";
                        break;
                    }
                case 2424:
                    if (C0335.m2923() < 0) {
                        str2 = "ۡۦ۟";
                        break;
                    } else {
                        C0368.m3171();
                        break;
                    }
            }
        }
    }

    public void setNeutralActionType(Integer num) {
        String str = "ۦۡۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749758) {
                case 1215:
                    str = "ۦۡۧ";
                    break;
                case 29497:
                    return;
                case 29554:
                    this.neutralActionType = num;
                    if (C0009.m36() < 0) {
                        str = "ۦۣۤ";
                        break;
                    } else {
                        C0378.m4998();
                        break;
                    }
            }
        }
    }

    public void setNeutralExt(String str) {
        String str2 = "ۣۨۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1747688) {
                case 462:
                    if (C0291.m2568() >= 0) {
                        break;
                    } else {
                        str2 = "ۣۨۡ";
                        break;
                    }
                case 3351:
                    return;
                case 7668:
                    this.neutralExt = str;
                    if (C0191.m1627() >= 0) {
                        break;
                    } else {
                        str2 = "۟ۧۧ";
                        break;
                    }
            }
        }
    }

    public void setNeutralText(String str) {
        String str2 = "ۡۨۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753417) {
                case 2280:
                    str2 = "ۡۨۡ";
                    break;
                case 28371:
                    this.neutralText = str;
                    str2 = "ۥۤۦ";
                    break;
                case 32622:
                    return;
            }
        }
    }

    public void setPassword(String str) {
        String str2 = "ۡۢۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1746784) {
                case 2438:
                    this.f317 = str;
                    str2 = "ۦۧۧ";
                    break;
                case 25894:
                    return;
                case 28326:
                    str2 = "ۡۢۧ";
                    break;
            }
        }
    }

    public void setThemeColor(String str) {
        String str2 = "ۣۨۢ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1746721) {
                case 3136:
                    return;
                case 28168:
                    this.themeColor = str;
                    if (C0009.m36() < 0) {
                        str2 = "۠ۤۥ";
                        break;
                    } else {
                        C0369.m3256();
                        break;
                    }
                case 28207:
                    if (C0025.m118() > 0) {
                        str2 = "ۣۨۢ";
                        break;
                    } else {
                        str2 = "ۣۣۨ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̖̗̗̙̖, reason: not valid java name and contains not printable characters */
    public int m1765() {
        return m1761(this);
    }

    /* renamed from: ̗̖̗̙, reason: not valid java name and contains not printable characters */
    public void m1766(String str) {
        String str2 = "ۤۦۣ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1752641) {
                case 36:
                    if (C0086.m500() <= 0) {
                        break;
                    } else {
                        str2 = "ۤۦۣ";
                        break;
                    }
                case 1056:
                    return;
                case 1248:
                    this.f318 = str;
                    if (C0089.m592() > 0) {
                        str2 = "ۤۤۡ";
                        break;
                    } else {
                        C0377.m4944();
                        str2 = "۟ۥۡ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̙̗̙̖̙, reason: not valid java name and contains not printable characters */
    public String m1767() {
        return m1764(this);
    }

    /* renamed from: ̗̙̙̖̖, reason: not valid java name and contains not printable characters */
    public void m1768(int i) {
        String str = "ۣۤۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748772) {
                case 127:
                    return;
                case 5475:
                    this.f319 = i;
                    str = "ۡۦ۠";
                    break;
                case 5506:
                    if (C0088.m573() > 0) {
                        str = "ۣۤۦ";
                        break;
                    } else {
                        str = "ۨۢ";
                        break;
                    }
            }
        }
    }
}
