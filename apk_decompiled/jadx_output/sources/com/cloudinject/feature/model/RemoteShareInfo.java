package com.cloudinject.feature.model;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
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
import java.io.Serializable;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
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

/* loaded from: classes6.dex */
public class RemoteShareInfo implements Serializable {
    public static final int ACTION_BROWSER = 0;
    public static final int ACTION_COPY = 3;
    public static final int ACTION_QQ = 2;
    public static final int ACTION_QQ_GROUP = 1;
    public static final int ACTION_SHARE = 4;
    private Integer cancelActionType;
    private String cancelExt;
    private String cancelText;
    private String message;
    private Integer neutralActionType;
    private String neutralExt;
    private String neutralText;
    private String shareContent;
    private Integer shareCount;
    private Integer showType;
    private String themeColor;
    private String title;

    public static RemoteShareInfo parse(JSONObject jSONObject) {
        String str = "ۡۥۧ";
        RemoteShareInfo remoteShareInfo = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56387) {
                case 33:
                    C0088.m565(remoteShareInfo, C0183.m1473(jSONObject, C0385.m5310(C0391.m5561())));
                    if (C0334.m2866() <= 0) {
                        C0279.m2491();
                        str = "۟ۤۨ";
                    } else {
                        str = "ۣۢ۠";
                        continue;
                    }
                case 252:
                    break;
                case 1709416:
                    C0229.m2040(remoteShareInfo, C0183.m1473(jSONObject, C0385.m5310(C0375.m4867())));
                    str = "ۦۣۢ";
                    continue;
                case 1710658:
                    return remoteShareInfo;
                case 1710689:
                    C0334.m2864(remoteShareInfo, C0078.m339(C0390.m5535(jSONObject, C0385.m5310(C0074.m292()))));
                    if (C0074.m307() >= 0) {
                        C0279.m2491();
                        str = "ۥۢۦ";
                    } else {
                        str = "ۦۣ۠";
                        continue;
                    }
                case 1710690:
                    C0382.m5156(remoteShareInfo, C0183.m1473(jSONObject, C0385.m5310(C0379.m5030())));
                    if (C0394.m5672() <= 0) {
                        C0009.m36();
                    } else {
                        str = "ۣۤۢ";
                        continue;
                    }
                case 1711488:
                    C0375.m4869(remoteShareInfo, C0183.m1473(jSONObject, C0385.m5310(C0397.m5770())));
                    str = "ۧۨۢ";
                    continue;
                case 1711494:
                    C0370.m3303(remoteShareInfo, C0183.m1473(jSONObject, C0385.m5310(C0078.m345())));
                    str = "ۡۤۢ";
                    continue;
                case 1729120:
                    return null;
                case 1730278:
                    remoteShareInfo = new RemoteShareInfo();
                    str = "ۨۢۥ";
                    continue;
                case 1731207:
                    C0397.m5803(remoteShareInfo, C0078.m339(C0390.m5535(jSONObject, C0385.m5310(C0074.m313()))));
                    if (C0291.m2568() < 0) {
                        str = "۟ۧۢ";
                    } else {
                        continue;
                    }
                case 1731238:
                    if (C0382.m5180() <= 0) {
                        C0390.m5512();
                    } else {
                        str = "ۡۥۧ";
                        continue;
                    }
                case 1731298:
                    C0155.m1317(remoteShareInfo, C0078.m339(C0390.m5535(jSONObject, C0385.m5310(C0420.m6242()))));
                    str = "ۣۥ";
                    continue;
                case 1732101:
                    C0155.m1287(remoteShareInfo, C0078.m339(C0390.m5535(jSONObject, C0385.m5310(C0378.m4989()))));
                    if (C0025.m118() > 0) {
                        str = "ۣۥۦ";
                    } else {
                        continue;
                    }
                case 1732348:
                    C0078.m370(remoteShareInfo, C0183.m1473(jSONObject, C0385.m5310(C0420.m6237())));
                    str = "ۣۢ۟";
                    continue;
                case 1733376:
                    if (jSONObject != null) {
                        break;
                    } else if (C0078.m361() > 0) {
                        str = "ۥۤۢ";
                    }
                case 1733468:
                    C0388.m5450(remoteShareInfo, C0183.m1473(jSONObject, C0385.m5310(C0073.m244())));
                    str = "ۣۧۨ";
                    continue;
                case 1735609:
                    C0378.m5002(remoteShareInfo, C0183.m1473(jSONObject, C0385.m5310(C0383.m5191())));
                    str = "ۧۧۡ";
                    continue;
            }
            if (C0083.m448() >= 0) {
                C0369.m3256();
            } else {
                str = "ۤۦۧ";
            }
        }
    }

    /* renamed from: ۟۟۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m1534(Object obj) {
        String str = "ۡۥۦ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56537) {
                case 1709104:
                    break;
                case 1709370:
                    if (C0390.m5512() <= 0) {
                        C0381.m5127();
                        str = "ۢۥۤ";
                        str2 = null;
                    } else {
                        str = "ۣۡۤ";
                        str2 = null;
                        continue;
                    }
                case 1711420:
                    str3 = ((RemoteShareInfo) obj).title;
                    str = "ۥۣ۟";
                    continue;
                case 1729190:
                    return str2;
                case 1729240:
                    str = "ۥۧۡ";
                    str2 = str3;
                    continue;
                case 1729275:
                    if (C0179.m1427() > 0) {
                        str = "ۣۨۨ";
                    } else {
                        continue;
                    }
                case 1731294:
                case 1734501:
                    if (C0399.m5914() > 0) {
                        str = "ۥۧۡ";
                    } else {
                        continue;
                    }
                case 1733531:
                    if (C0393.m5668() <= 0) {
                        break;
                    } else if (C0378.m4998() <= 0) {
                        C0346.m3059();
                    } else {
                        str = "ۦۣۤ";
                    }
                case 1733625:
                    if (C0376.m4906() <= 0) {
                        str = "۟۠ۧ";
                    } else {
                        str = "ۣ۠ۧ";
                        continue;
                    }
                case 1735578:
                    if (C0179.m1427() <= 0) {
                        C0388.m5430();
                    } else {
                        str = "ۡۥۦ";
                        continue;
                    }
            }
            str = "ۥۤۡ";
        }
    }

    /* renamed from: ۣ۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m1535(Object obj) {
        Object obj2 = "ۤۥۧ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1750539) {
                case 170:
                case 32686:
                    if (C0121.m1023() >= 0) {
                        obj2 = "ۨۡۡ";
                    } else {
                        obj2 = "ۧۢ۟";
                        continue;
                    }
                case 2945:
                    if (C0083.m448() >= 0) {
                        obj2 = "ۣۣ۠";
                    } else {
                        obj2 = "۟۟ۧ";
                        continue;
                    }
                case 3139:
                    if (C0334.m2866() > 0) {
                        obj2 = "ۣۤۢ";
                    } else {
                        continue;
                    }
                case 3213:
                    if (C0083.m448() > 0) {
                        break;
                    } else if (C0395.m5698() < 0) {
                        obj2 = "ۦۢۦ";
                    }
                case 4364:
                    obj2 = "ۣۤۧ";
                    str = null;
                    continue;
                case 6312:
                    obj2 = "ۧۢ۟";
                    str = str2;
                    continue;
                case 7606:
                    if (C0083.m448() >= 0) {
                        C0334.m2866();
                    } else {
                        obj2 = "ۤۥۧ";
                        continue;
                    }
                case 29551:
                    return str;
                case 30625:
                    str2 = ((RemoteShareInfo) obj).neutralExt;
                    if (C0388.m5430() <= 0) {
                        C0184.m1524();
                    } else {
                        obj2 = "ۡ۠ۢ";
                        continue;
                    }
                case 1731179:
                    break;
            }
            if (C0393.m5668() > 0) {
                obj2 = "ۥ۟ۤ";
            }
        }
    }

    /* renamed from: ۟ۢۧۤۥ, reason: not valid java name and contains not printable characters */
    public static String m1536(Object obj) {
        String str = "ۤ۠ۨ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752517) {
                case 99:
                    str = "ۤ۠ۨ";
                    continue;
                case 909:
                    str3 = ((RemoteShareInfo) obj).shareContent;
                    if (C0369.m3256() <= 0) {
                        C0385.m5282();
                        str = "۟ۤۤ";
                    } else {
                        str = "ۦۣ۠";
                        continue;
                    }
                case 1065:
                    if (C0376.m4906() < 0) {
                        break;
                    } else if (C0369.m3256() <= 0) {
                        C0191.m1627();
                    } else {
                        str = "ۥۥۨ";
                    }
                case 3936:
                    if (C0386.m5322() <= 0) {
                        C0384.m5278();
                        str2 = null;
                    } else {
                        str = "ۢۢۨ";
                        str2 = null;
                        continue;
                    }
                case 3949:
                    str = "ۦۥۦ";
                    continue;
                case 6756:
                case 32706:
                    if (C0179.m1427() > 0) {
                        str = "ۣۧۦ";
                    } else {
                        continue;
                    }
                case 29890:
                    break;
                case 30799:
                    return str2;
                case 31750:
                    str = "ۣۧۦ";
                    str2 = str3;
                    continue;
                case 1728992:
                    if (C0362.m3122() >= 0) {
                        C0379.m5056();
                    } else {
                        str = "ۢۢۥ";
                        continue;
                    }
            }
            if (C0362.m3122() < 0) {
                str = "ۡۦ";
            }
        }
    }

    /* renamed from: ۟ۥۧۦۣ, reason: not valid java name and contains not printable characters */
    public static String m1537(Object obj) {
        String str = "ۥۧ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747712) {
                case 66:
                    str3 = ((RemoteShareInfo) obj).message;
                    if (C0377.m4944() <= 0) {
                        str = "ۥۤ";
                    } else {
                        str = "ۦۣ";
                        continue;
                    }
                case 448:
                    if (C0009.m36() >= 0) {
                        C0191.m1627();
                        str = "ۣۨ۠";
                        str2 = null;
                    } else {
                        str = "ۥۥۡ";
                        str2 = null;
                        continue;
                    }
                case 3167:
                    if (C0384.m5278() <= 0) {
                        C0395.m5698();
                        str = "۠۠ۦ";
                    } else {
                        str = "ۥۧ";
                        continue;
                    }
                case 3231:
                case 1734497:
                    if (C0387.m5374() < 0) {
                        str = "ۧۢ";
                    } else {
                        continue;
                    }
                case 5441:
                    if (C0206.m1807() < 0) {
                        str = "۟ۤۤ";
                    } else {
                        continue;
                    }
                case 25317:
                    if (C0385.m5282() < 0) {
                        str = "۠۟۟";
                    } else {
                        continue;
                    }
                case 28291:
                    break;
                case 1734562:
                    if (C0393.m5668() < 0) {
                        break;
                    } else if (C0383.m5203() > 0) {
                        str = "ۣ۠ۥ";
                    }
                case 1734589:
                    str = "ۧۢ";
                    str2 = str3;
                    continue;
                case 1734619:
                    return str2;
            }
            str = "ۨۨۥ";
        }
    }

    /* renamed from: ۠ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static Integer m1538(Object obj) {
        String str = "ۥۣۨ";
        Integer num = null;
        Integer num2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56416) {
                case 1709321:
                case 1711622:
                    if (C0121.m1023() >= 0) {
                        C0191.m1627();
                    } else {
                        str = "ۣ۠۟";
                        continue;
                    }
                case 1710565:
                    str = "ۦۨۨ";
                    continue;
                case 1729130:
                    if (C0155.m1294() > 0) {
                        break;
                    } else {
                        str = "ۣۢ۟";
                    }
                case 1729219:
                    if (C0083.m448() >= 0) {
                        C0368.m3171();
                        str = "ۥۧۧ";
                        num = null;
                    } else {
                        str = "ۣۧۡ";
                        num = null;
                        continue;
                    }
                case 1729926:
                    break;
                case 1731072:
                    num2 = ((RemoteShareInfo) obj).neutralActionType;
                    str = "ۣۤ۟";
                    continue;
                case 1731326:
                    str = "ۣ۠۟";
                    num = num2;
                    continue;
                case 1731455:
                    str = "ۥۨۦ";
                    continue;
                case 1734492:
                    return num;
                case 1735489:
                    str = "ۥۣۨ";
                    continue;
            }
            str = "ۣۨۤ";
        }
    }

    /* renamed from: ۢ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static Integer m1539(Object obj) {
        String str = "ۨۥ۟";
        Integer num = null;
        Integer num2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746904) {
                case 2267:
                    if (C0155.m1294() >= 0) {
                        C0391.m5571();
                        num = num2;
                    } else {
                        str = "ۣۣۦ";
                        num = num2;
                        continue;
                    }
                case 3078:
                    if (C0368.m3171() < 0) {
                        str = "ۨۥ۟";
                    } else {
                        continue;
                    }
                case 4446:
                    return num;
                case 4498:
                    if (C0279.m2491() >= 0) {
                        C0291.m2568();
                        str = "ۨۦۧ";
                        num = null;
                    } else {
                        str = "۟ۨ";
                        num = null;
                        continue;
                    }
                case 5255:
                case 7613:
                    str = "ۣۣۦ";
                    continue;
                case 6586:
                    num2 = ((RemoteShareInfo) obj).shareCount;
                    str = "ۣۡۥ";
                    continue;
                case 25137:
                    if (C0377.m4944() > 0) {
                        str = "ۣۡۨ";
                    } else {
                        continue;
                    }
                case 25210:
                    break;
                case 28250:
                    if (C0368.m3171() > 0) {
                        break;
                    } else {
                        str = "ۥۦۣ";
                    }
                case 1735729:
                    str = "ۤۤۥ";
                    continue;
            }
            str = C0391.m5571() <= 0 ? "۠۠" : "ۧۦۨ";
        }
    }

    /* renamed from: ۢۤۥ۠, reason: not valid java name and contains not printable characters */
    public static Integer m1540(Object obj) {
        Object obj2 = "۟ۢۤ";
        Integer num = null;
        Integer num2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1751529) {
                case 854:
                    break;
                case 2795:
                    return num;
                case 2927:
                    obj2 = "ۣ۟۟";
                    num = null;
                    continue;
                case 3818:
                case 30735:
                    obj2 = "ۢۥۥ";
                    continue;
                case 5845:
                    if (C0368.m3171() >= 0) {
                        C0088.m573();
                        num = num2;
                    } else {
                        obj2 = "ۢۥۥ";
                        num = num2;
                        continue;
                    }
                case 7816:
                    if (C0370.m3284() > 0) {
                        break;
                    } else if (C0391.m5571() > 0) {
                        obj2 = "۟ۢ";
                    }
                case 7826:
                    if (C0383.m5203() <= 0) {
                        C0387.m5374();
                        obj2 = "ۡ۠ۢ";
                    } else {
                        obj2 = "ۦۤۤ";
                        continue;
                    }
                case 28933:
                    if (C0025.m118() <= 0) {
                        C0155.m1294();
                        obj2 = "۟ۡۤ";
                    } else {
                        obj2 = "ۢۡۥ";
                        continue;
                    }
                case 31942:
                    if (C0206.m1807() < 0) {
                        obj2 = "۟ۢۤ";
                    } else {
                        continue;
                    }
                case 1729034:
                    num2 = ((RemoteShareInfo) obj).showType;
                    if (C0228.m2012() <= 0) {
                        C0400.m5961();
                    } else {
                        obj2 = "ۡۥ۠";
                        continue;
                    }
            }
            if (C0379.m5056() > 0) {
                obj2 = "ۨ۠ۤ";
            }
        }
    }

    /* renamed from: ۢۦۤۧ, reason: not valid java name and contains not printable characters */
    public static String m1541(Object obj) {
        Object obj2 = "ۤۨ۟";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1747808) {
                case 1085:
                    if (C0089.m592() <= 0) {
                        C0389.m5481();
                    } else {
                        obj2 = "ۣ۟۠";
                        continue;
                    }
                case 1089:
                    if (C0393.m5668() <= 0) {
                        C0398.m5833();
                        obj2 = "۠ۡ";
                    } else {
                        obj2 = "ۤۨ۟";
                        continue;
                    }
                case 3138:
                case 3140:
                    obj2 = "ۤ۟";
                    continue;
                case 4425:
                    str2 = ((RemoteShareInfo) obj).neutralText;
                    if (C0335.m2923() < 0) {
                        obj2 = "ۤ۠۟";
                    } else {
                        continue;
                    }
                case 4539:
                    if (C0379.m5056() <= 0) {
                        break;
                    } else if (C0390.m5512() <= 0) {
                        C0082.m410();
                    } else {
                        obj2 = "ۤۢۧ";
                    }
                case 4739:
                    if (C0088.m573() <= 0) {
                        C0088.m573();
                        obj2 = "ۤ۟";
                        str = str2;
                    } else {
                        obj2 = "ۤ۟";
                        str = str2;
                        continue;
                    }
                case 7612:
                    if (C0279.m2491() >= 0) {
                        str = null;
                    } else {
                        obj2 = "ۡۦۢ";
                        str = null;
                        continue;
                    }
                case 25161:
                    if (C0369.m3256() <= 0) {
                        C0370.m3284();
                        obj2 = "ۢۦۤ";
                    } else {
                        obj2 = "ۣۦ۟";
                        continue;
                    }
                case 27970:
                    break;
                case 1734427:
                    return str;
            }
            if (C0025.m118() <= 0) {
                C0191.m1627();
            } else {
                obj2 = "ۣۨۢ";
            }
        }
    }

    /* renamed from: ۣۢۦۤ, reason: not valid java name and contains not printable characters */
    public static String m1542(Object obj) {
        String str = "ۡ۟ۨ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752710) {
                case 132:
                case 3161:
                    str = "ۥۡۧ";
                    continue;
                case 174:
                    str = "ۢۤۡ";
                    continue;
                case 769:
                    if (C0397.m5814() <= 0) {
                        str = "ۡۥۧ";
                        str2 = str3;
                    } else {
                        str = "ۥۡۧ";
                        str2 = str3;
                        continue;
                    }
                case 845:
                    return str2;
                case 847:
                    str = "ۦۡ۠";
                    continue;
                case 3301:
                    str3 = ((RemoteShareInfo) obj).cancelText;
                    str = "ۥ۟ۡ";
                    continue;
                case 4108:
                    if (C0121.m1023() >= 0) {
                        break;
                    } else {
                        str = C0088.m573() <= 0 ? "ۧۦۧ" : "ۢ۠ۡ";
                    }
                case 6459:
                    str = "ۡ۟ۨ";
                    continue;
                case 32515:
                    if (C0388.m5430() <= 0) {
                        str2 = null;
                    } else {
                        str = "ۥۤۧ";
                        str2 = null;
                        continue;
                    }
                case 1729902:
                    break;
            }
            if (C0379.m5056() <= 0) {
                C0346.m3059();
            } else {
                str = "ۥۡۥ";
            }
        }
    }

    /* renamed from: ۣۣۣۧ, reason: not valid java name and contains not printable characters */
    public static String m1543(Object obj) {
        String str = "ۣۣۡ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749851) {
                case 286:
                    str3 = ((RemoteShareInfo) obj).cancelExt;
                    str = "ۥۡۦ";
                    continue;
                case 1498:
                    if (C0335.m2923() >= 0) {
                        break;
                    } else if (C0184.m1524() >= 0) {
                        C0397.m5814();
                    } else {
                        str = "ۢ۟ۢ";
                    }
                case 3729:
                    if (C0369.m3256() <= 0) {
                        str2 = str3;
                    } else {
                        str = "ۥۣ۠";
                        str2 = str3;
                        continue;
                    }
                case 3805:
                    break;
                case 3827:
                    return str2;
                case 5126:
                    if (C0368.m3171() >= 0) {
                        str = "ۨ۠ۧ";
                        str2 = null;
                    } else {
                        str = "۟۠ۦ";
                        str2 = null;
                        continue;
                    }
                case 5177:
                    if (C0206.m1807() < 0) {
                        str = "۟ۢ۠";
                    } else {
                        continue;
                    }
                case 5246:
                    if (C0386.m5322() > 0) {
                        str = "ۦۣ۠";
                    } else {
                        continue;
                    }
                case 29336:
                case 1732454:
                    str = "ۥۣ۠";
                    continue;
                case 30326:
                    str = "ۣۣۡ";
                    continue;
            }
            if (C0346.m3059() >= 0) {
                C0082.m410();
                str = "ۧۤ۠";
            } else {
                str = "۟ۢۥ";
            }
        }
    }

    /* renamed from: ۦۦۥۦ, reason: contains not printable characters */
    public static Integer m1544(Object obj) {
        String str = "ۦۢۧ";
        Integer num = null;
        Integer num2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749792) {
                case 327:
                    if (C0384.m5278() <= 0) {
                        str = "۟ۨۧ";
                        num = num2;
                    } else {
                        str = "ۣ۠۠";
                        num = num2;
                        continue;
                    }
                case 1350:
                case 31362:
                    if (C0082.m410() >= 0) {
                        C0362.m3122();
                        str = "ۣ۟ۢ";
                    } else {
                        str = "ۣ۠۠";
                        continue;
                    }
                case 1442:
                    if (C0397.m5814() > 0) {
                        str = "ۦۢۧ";
                    } else {
                        continue;
                    }
                case 1535:
                    break;
                case 6595:
                    return num;
                case 7202:
                    if (C0391.m5571() <= 0) {
                        C0384.m5278();
                    } else {
                        str = "ۨۦ۠";
                        continue;
                    }
                case 29323:
                    if (C0395.m5698() >= 0) {
                        break;
                    } else {
                        str = C0073.m265() <= 0 ? "۟ۧۨ" : "ۨ۠ۢ";
                    }
                case 31301:
                    if (C0368.m3171() >= 0) {
                        num = null;
                    } else {
                        str = "ۣۡۤ";
                        num = null;
                        continue;
                    }
                case 31690:
                    num2 = ((RemoteShareInfo) obj).cancelActionType;
                    str = "ۢ۠ۥ";
                    continue;
                case 1732418:
                    if (C0009.m36() >= 0) {
                        C0082.m410();
                    } else {
                        str = "ۨۤۡ";
                        continue;
                    }
            }
            if (C0396.m5741() >= 0) {
                C0394.m5672();
            } else {
                str = "ۣۥ";
            }
        }
    }

    /* renamed from: ۦۣۨۦ, reason: contains not printable characters */
    public static String m1545(Object obj) {
        String str = "ۣۣۧ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748858) {
                case 4854:
                    str3 = ((RemoteShareInfo) obj).themeColor;
                    str = "ۣۢ۠";
                    continue;
                case 5566:
                    if (C0083.m448() >= 0) {
                        str = "ۣۢۨ";
                    } else {
                        str = "ۣۣۧ";
                        continue;
                    }
                case 7262:
                    if (C0382.m5180() <= 0) {
                        C0206.m1807();
                    } else {
                        str = "ۨۦۡ";
                        continue;
                    }
                case 7609:
                case 1733778:
                    if (C0279.m2491() >= 0) {
                        C0279.m2491();
                    } else {
                        str = "ۦۦۡ";
                        continue;
                    }
                case 7621:
                    str = "ۦۦۡ";
                    str2 = str3;
                    continue;
                case 26329:
                    str = "ۦۢۧ";
                    str2 = null;
                    continue;
                case 27389:
                    if (C0393.m5668() <= 0) {
                        break;
                    } else if (C0391.m5571() <= 0) {
                        C0074.m307();
                        str = "ۨۢۦ";
                    } else {
                        str = "ۥ۟ۦ";
                    }
                case 27928:
                    break;
                case 27995:
                    return str2;
                case 28369:
                    if (C0400.m5961() <= 0) {
                        C0392.m5595();
                        str = "ۡ۠ۥ";
                    } else {
                        str = "۟ۧ";
                        continue;
                    }
            }
            str = "ۢۦۨ";
        }
    }

    public Integer getCancelActionType() {
        return m1544(this);
    }

    public String getCancelExt() {
        return m1543(this);
    }

    public String getCancelText() {
        return m1542(this);
    }

    public String getMessage() {
        return m1537(this);
    }

    public Integer getNeutralActionType() {
        return m1538(this);
    }

    public String getNeutralExt() {
        return m1535(this);
    }

    public String getNeutralText() {
        return m1541(this);
    }

    public String getShareContent() {
        return m1536(this);
    }

    public Integer getShareCount() {
        return m1539(this);
    }

    public Integer getShowType() {
        return m1540(this);
    }

    public String getThemeColor() {
        return m1545(this);
    }

    public String getTitle() {
        return m1534(this);
    }

    public void setCancelActionType(Integer num) {
        String str = "ۣۨۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754658) {
                case 24797:
                    return;
                case 26887:
                    if (C0346.m3059() < 0) {
                        str = "ۣۨۡ";
                        break;
                    } else {
                        C0074.m307();
                        break;
                    }
                case 28990:
                    this.cancelActionType = num;
                    if (C0083.m448() < 0) {
                        str = "۟۟۟";
                        break;
                    } else {
                        C0086.m500();
                        break;
                    }
            }
        }
    }

    public void setCancelExt(String str) {
        String str2 = "ۡۡۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1748711) {
                case 32:
                    this.cancelExt = str;
                    if (C0362.m3122() < 0) {
                        str2 = "ۨ۠";
                        break;
                    } else {
                        C0391.m5571();
                        break;
                    }
                case 27812:
                    str2 = "ۡۡۧ";
                    break;
                case 1733151:
                    return;
            }
        }
    }

    public void setCancelText(String str) {
        String str2 = "ۨۡۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1751776) {
                case 1795:
                    return;
                case 29677:
                    this.cancelText = str;
                    str2 = "ۥۢ۠";
                    break;
                case 32551:
                    if (C0335.m2923() < 0) {
                        str2 = "ۨۡۦ";
                        break;
                    } else {
                        str2 = "۟ۥۥ";
                        break;
                    }
            }
        }
    }

    public void setMessage(String str) {
        String str2 = "ۧۦۢ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1747870) {
                case 4541:
                    return;
                case 28285:
                    this.message = str;
                    str2 = "ۤۢۡ";
                    break;
                case 1732733:
                    if (C0394.m5672() <= 0) {
                        break;
                    } else {
                        str2 = "ۧۦۢ";
                        break;
                    }
            }
        }
    }

    public void setNeutralActionType(Integer num) {
        String str = "۟ۡۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752459) {
                case 97:
                    return;
                case 6859:
                    this.neutralActionType = num;
                    if (C0388.m5430() > 0) {
                        str = "ۥۢۧ";
                        break;
                    } else {
                        C0078.m361();
                        break;
                    }
                case 30051:
                    if (C0394.m5672() > 0) {
                        str = "۟ۡۢ";
                        break;
                    } else {
                        C0183.m1464();
                        str = "۠۠۟";
                        break;
                    }
            }
        }
    }

    public void setNeutralExt(String str) {
        String str2 = "ۡۥۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56356) {
                case 248:
                    return;
                case 1733466:
                    str2 = "ۡۥۦ";
                    break;
                case 1733478:
                    this.neutralExt = str;
                    str2 = "ۣۧ";
                    break;
            }
        }
    }

    public void setNeutralText(String str) {
        String str2 = "ۣۨۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56452) {
                case 1729273:
                    return;
                case 1730116:
                    if (C0394.m5672() > 0) {
                        str2 = "ۣۨۧ";
                        break;
                    } else {
                        C0082.m410();
                        break;
                    }
                case 1731494:
                    this.neutralText = str;
                    if (C0375.m4840() < 0) {
                        str2 = "ۥۧ۟";
                        break;
                    } else {
                        C0291.m2568();
                        break;
                    }
            }
        }
    }

    public void setShareContent(String str) {
        String str2 = "۟ۥ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1751741) {
                case 32667:
                    if (C0379.m5056() <= 0) {
                        break;
                    } else {
                        str2 = "۟ۥ";
                        break;
                    }
                case 32691:
                    return;
                case 1728859:
                    this.shareContent = str;
                    if (C0376.m4906() <= 0) {
                        break;
                    } else {
                        str2 = "ۧ۟ۦ";
                        break;
                    }
            }
        }
    }

    public void setShareCount(Integer num) {
        String str = "ۣۣ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749761) {
                case 5246:
                    this.shareCount = num;
                    str = "ۤۥ";
                    break;
                case 31307:
                    if (C0386.m5322() > 0) {
                        str = "ۣۣ۟";
                        break;
                    } else {
                        C0228.m2012();
                        break;
                    }
                case 1732480:
                    return;
            }
        }
    }

    public void setShowType(Integer num) {
        String str = "ۢۦ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748707) {
                case 2367:
                    return;
                case 5316:
                    if (C0335.m2923() < 0) {
                        str = "ۢۦ۟";
                        break;
                    } else {
                        C0279.m2491();
                        str = "ۡۧۥ";
                        break;
                    }
                case 7672:
                    this.showType = num;
                    str = "۟ۦۣ";
                    break;
            }
        }
    }

    public void setThemeColor(String str) {
        String str2 = "ۦۣ۟";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56505) {
                case 1710783:
                    return;
                case 1711603:
                    this.themeColor = str;
                    if (C0370.m3284() < 0) {
                        str2 = "ۧۧۦ";
                        break;
                    } else {
                        C0389.m5481();
                        break;
                    }
                case 1732186:
                    if (C0399.m5914() <= 0) {
                        break;
                    } else {
                        str2 = "ۦۣ۟";
                        break;
                    }
            }
        }
    }

    public void setTitle(String str) {
        String str2 = "ۢۧۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1754379) {
                case 129:
                    return;
                case 30263:
                    this.title = str;
                    if (C0229.m2064() >= 0) {
                        break;
                    } else {
                        str2 = "ۣۧۦ";
                        break;
                    }
                case 1711850:
                    if (C0383.m5203() > 0) {
                        str2 = "ۢۧۡ";
                        break;
                    } else {
                        C0399.m5914();
                        break;
                    }
            }
        }
    }
}
