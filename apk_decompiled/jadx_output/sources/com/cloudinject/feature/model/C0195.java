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
import androidx.core.view.PointerIconCompat;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
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
import mirrorb.java.lang.C0400;
import org.json.JSONObject;
import p027.p028.p029.C0420;

@Dex2C
/* renamed from: com.cloudinject.feature.model.̗̗̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0195 {
    public static final int ACTION_BROWSER = 2;
    public static final int ACTION_QQ = 1;
    public static final int ACTION_SHARE = 4;

    /* renamed from: ̗̗̗̗̙̙̖, reason: not valid java name and contains not printable characters */
    public static final int f298 = 3;
    private int second;
    private String url;

    /* renamed from: ̗̗̗̖̖̗̙, reason: not valid java name and contains not printable characters */
    private int f299;

    /* renamed from: ̗̗̗̗̙̖̙, reason: not valid java name and contains not printable characters */
    private String f300;

    /* renamed from: ̙̖, reason: not valid java name and contains not printable characters */
    public static C0195 m1713(JSONObject jSONObject) {
        String str = "ۨۢۧ";
        C0195 c0195 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749610) {
                case 1067:
                    break;
                case 2956:
                    C0381.m5113(c0195, C0390.m5535(jSONObject, C0385.m5310(C0370.m3277())));
                    if (C0155.m1294() >= 0) {
                        C0379.m5056();
                    } else {
                        str = "ۥۤ";
                        continue;
                    }
                case 2989:
                    str = "ۨۢۧ";
                    continue;
                case 3316:
                    C0384.m5267(c0195, C0183.m1473(jSONObject, C0385.m5310(C0391.m5579())));
                    if (C0376.m4906() <= 0) {
                        str = "ۡ۠";
                    } else {
                        str = "ۦ۟ۨ";
                        continue;
                    }
                case 6274:
                    C0388.m5431(c0195, C0183.m1473(jSONObject, C0385.m5310(C0082.m396())));
                    if (C0121.m1023() >= 0) {
                        C0380.m5068();
                        str = "ۣۢۨ";
                    } else {
                        str = "ۤ۠ۢ";
                        continue;
                    }
                case 6453:
                    return null;
                case 6615:
                    c0195 = new C0195();
                    if (C0400.m5961() > 0) {
                        str = "۠۠ۨ";
                    } else {
                        continue;
                    }
                case 29477:
                    return c0195;
                case 31559:
                    if (jSONObject != null) {
                        break;
                    } else if (C0398.m5833() <= 0) {
                        C0362.m3122();
                        str = "ۣۡۥ";
                    } else {
                        str = "ۣ۠ۤ";
                    }
                case 1732341:
                    C0387.m5390(c0195, C0390.m5535(jSONObject, C0385.m5310(C0400.m5921())));
                    str = "ۥۨۡ";
                    continue;
            }
            if (C0379.m5056() <= 0) {
                C0388.m5430();
                str = "ۢ۠۟";
            } else {
                str = "۠ۧۤ";
            }
        }
    }

    /* renamed from: ۟۟ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int m1714(Object obj) {
        String str = "ۣۤۢ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749664) {
                case 2181:
                    if (C0382.m5180() < 0) {
                        break;
                    } else {
                        str = "ۥۨۦ";
                    }
                case 2925:
                    break;
                case 3075:
                    i2 = ((C0195) obj).second;
                    if (C0086.m500() <= 0) {
                        C0387.m5374();
                        str = "ۡۥ۠";
                    } else {
                        str = "ۨۤۡ";
                        continue;
                    }
                case 3203:
                    if (C0009.m36() >= 0) {
                        C0383.m5203();
                    } else {
                        str = "ۥۣۤ";
                        continue;
                    }
                case 3238:
                    str = "۟ۥۡ";
                    i = 0;
                    continue;
                case 5403:
                    if (C0025.m118() <= 0) {
                        C0088.m573();
                        str = "ۦۥ";
                    } else {
                        str = "ۧ۟ۦ";
                        continue;
                    }
                case 5434:
                    if (C0393.m5668() > 0) {
                        str = "ۣۤۢ";
                    } else {
                        continue;
                    }
                case 6521:
                    return i;
                case 28831:
                case 30638:
                    if (C0228.m2012() <= 0) {
                        C0387.m5374();
                    } else {
                        str = "۠ۨۡ";
                        continue;
                    }
                case 31685:
                    if (C0088.m573() <= 0) {
                        C0179.m1427();
                        str = "۟ۥۦ";
                        i = i2;
                    } else {
                        str = "۠ۨۡ";
                        i = i2;
                        continue;
                    }
            }
            if (C0380.m5068() <= 0) {
                C0397.m5814();
                str = "ۨ۟۟";
            } else {
                str = "ۥۤۢ";
            }
        }
    }

    /* renamed from: ۟ۥۣۢ۟, reason: not valid java name and contains not printable characters */
    public static int m1715(Object obj) {
        String str = "ۥۧۥ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752645) {
                case 198:
                    if (C0083.m448() > 0) {
                        break;
                    } else if (C0379.m5056() <= 0) {
                        C0378.m4998();
                    } else {
                        str = "ۥ۠ۤ";
                    }
                case PointerIconCompat.TYPE_WAIT /* 1004 */:
                    i2 = ((C0195) obj).f299;
                    if (C0179.m1427() <= 0) {
                        C0279.m2491();
                        str = "ۡۦۡ";
                    } else {
                        str = "ۡۡ۠";
                        continue;
                    }
                case 2158:
                    str = "ۥۧۥ";
                    continue;
                case 4229:
                    str = "۟ۦۣ";
                    i = i2;
                    continue;
                case 4301:
                    str = "ۧۤۥ";
                    continue;
                case 6405:
                case 32546:
                    if (C0228.m2012() <= 0) {
                        C0420.m6215();
                    } else {
                        str = "۟ۦۣ";
                        continue;
                    }
                case 6553:
                    return i;
                case 30379:
                    break;
                case 31725:
                    if (C0121.m1023() >= 0) {
                        C0387.m5374();
                        i = 0;
                    } else {
                        str = "ۦۥۥ";
                        i = 0;
                        continue;
                    }
                case 31811:
                    if (C0073.m265() <= 0) {
                        C0383.m5203();
                    } else {
                        str = "۟ۡۢ";
                        continue;
                    }
            }
            if (C0362.m3122() >= 0) {
                C0394.m5672();
            } else {
                str = "ۡ۟ۦ";
            }
        }
    }

    /* renamed from: ۣۢۨۥ, reason: not valid java name and contains not printable characters */
    public static String m1716(Object obj) {
        String str = "ۣۣۣ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750720) {
                case 32:
                    if (C0394.m5672() <= 0) {
                        C0086.m500();
                        str = "ۢۥۣ";
                        str2 = null;
                    } else {
                        str = "ۣۣۧ";
                        str2 = null;
                        continue;
                    }
                case 63:
                    if (C0387.m5374() < 0) {
                        str = "ۣۤۧ";
                    } else {
                        continue;
                    }
                case 67:
                    if (C0164.m1359() >= 0) {
                        break;
                    } else if (C0370.m3284() >= 0) {
                        C0370.m3284();
                    } else {
                        str = "ۦۦۡ";
                    }
                case 102:
                case 30501:
                    if (C0392.m5595() <= 0) {
                        C0334.m2866();
                        str = "ۣۨۡ";
                    } else {
                        str = "ۣ۠ۡ";
                        continue;
                    }
                case 2215:
                    str = "ۣۣۣ";
                    continue;
                case 7678:
                    return str2;
                case 29582:
                    if (C0389.m5481() > 0) {
                        str = "ۣۦۣ";
                    } else {
                        continue;
                    }
                case 29921:
                    str3 = ((C0195) obj).url;
                    str = "ۨۦۧ";
                    continue;
                case 32586:
                    break;
                case 32617:
                    if (C0362.m3122() >= 0) {
                        C0191.m1627();
                        str2 = str3;
                    } else {
                        str = "ۣ۠ۡ";
                        str2 = str3;
                        continue;
                    }
            }
            if (C0078.m361() > 0) {
                str = "ۧۡۨ";
            }
        }
    }

    /* renamed from: ۨۡۦۨ, reason: not valid java name and contains not printable characters */
    public static String m1717(Object obj) {
        Object obj2 = "ۨۤ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1746938) {
                case 3130:
                    if (C0391.m5571() > 0) {
                        obj2 = "ۥۨۨ";
                    } else {
                        continue;
                    }
                case 3193:
                    return str;
                case 3326:
                    break;
                case 6495:
                case 1735460:
                    obj2 = "۠ۥۨ";
                    continue;
                case 6557:
                    obj2 = "۠ۥۨ";
                    str = str2;
                    continue;
                case 6719:
                    if (C0420.m6215() >= 0) {
                        C0121.m1023();
                    } else {
                        obj2 = "ۨۤ";
                        continue;
                    }
                case 28188:
                    if (C0369.m3256() <= 0) {
                        str = null;
                    } else {
                        obj2 = "۠ۧۧ";
                        str = null;
                        continue;
                    }
                case 1735424:
                    if (C0228.m2012() <= 0) {
                        C0346.m3059();
                    } else {
                        obj2 = "ۨۨۦ";
                        continue;
                    }
                case 1735430:
                    if (C0009.m36() > 0) {
                        break;
                    } else if (C0420.m6215() < 0) {
                        obj2 = "ۦۣ";
                    }
                case 1735495:
                    str2 = ((C0195) obj).f300;
                    if (C0060.m216() <= 0) {
                        C0206.m1807();
                    } else {
                        obj2 = "ۥۦۨ";
                        continue;
                    }
            }
            if (C0086.m500() > 0) {
                obj2 = "ۨۢ";
            }
        }
    }

    public int getActionType() {
        return m1715(this);
    }

    public int getSecond() {
        return m1714(this);
    }

    public String getUrl() {
        return m1716(this);
    }

    public void setSecond(int i) {
        String str = "ۦۤۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56359) {
                case 1711567:
                    this.second = i;
                    if (C0060.m216() > 0) {
                        str = "ۥۣ۠";
                        break;
                    } else {
                        C0074.m307();
                        break;
                    }
                case 1729038:
                    if (C0346.m3059() < 0) {
                        str = "ۦۤۦ";
                        break;
                    } else {
                        C0377.m4944();
                        str = "ۤۥۨ";
                        break;
                    }
                case 1729061:
                    return;
            }
        }
    }

    public void setUrl(String str) {
        String str2 = "ۢۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56291) {
                case 1859:
                    if (C0420.m6215() >= 0) {
                        break;
                    } else {
                        str2 = "ۢۧ";
                        break;
                    }
                case 1958:
                    this.url = str;
                    if (C0400.m5961() > 0) {
                        str2 = "۟ۤۢ";
                        break;
                    } else {
                        C0380.m5068();
                        break;
                    }
                case 1735806:
                    return;
            }
        }
    }

    /* renamed from: ̗̖̗̗̗̗, reason: not valid java name and contains not printable characters */
    public String m1718() {
        return m1717(this);
    }

    /* renamed from: ̗̙̖̙, reason: not valid java name and contains not printable characters */
    public void m1719(String str) {
        String str2 = "۟ۥۥ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56414) {
                case 1709339:
                    return;
                case 1710550:
                    str2 = "۟ۥۥ";
                    break;
                case 1735649:
                    this.f300 = str;
                    if (C0346.m3059() < 0) {
                        str2 = "ۣۨ۠";
                        break;
                    } else {
                        C0121.m1023();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̙̙̗̖, reason: not valid java name and contains not printable characters */
    public void m1720(int i) {
        String str = "۠ۤۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755524) {
                case 4005:
                    return;
                case 25316:
                    this.f299 = i;
                    if (C0376.m4906() > 0) {
                        str = "ۧۨۢ";
                        break;
                    } else {
                        C0346.m3059();
                        str = "ۧۨۤ";
                        break;
                    }
                case 26329:
                    if (C0074.m307() >= 0) {
                        break;
                    } else {
                        str = "۠ۤۤ";
                        break;
                    }
            }
        }
    }
}
