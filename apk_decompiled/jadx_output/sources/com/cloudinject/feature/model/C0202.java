package com.cloudinject.feature.model;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import androidx.core.graphics.drawable.C0086;
import androidx.core.view.InputDeviceCompat;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.util.List;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.location.C0385;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.rms.C0392;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p027.p028.p029.C0420;

@Dex2C
/* renamed from: com.cloudinject.feature.model.̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0202<T> {

    /* renamed from: ̗̗̗̙̖̗̗, reason: not valid java name and contains not printable characters */
    public static final int f326 = 1;
    private int code;
    private T result;

    /* renamed from: ̗̗̗̖̖̖̖, reason: not valid java name and contains not printable characters */
    private String f327;

    /* renamed from: ̗̗̗̖̖̖̗, reason: not valid java name and contains not printable characters */
    private List<T> f328;

    /* renamed from: ̖̗̙, reason: not valid java name and contains not printable characters */
    public static C0202 m1794(String str) {
        JSONObject jSONObject = null;
        JSONTokener jSONTokener = null;
        C0202 c0202 = null;
        String str2 = "ۤ۟ۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56385) {
                case 1709196:
                    if (C0228.m2012() <= 0) {
                        break;
                    } else {
                        str2 = "ۤ۟ۡ";
                        break;
                    }
                case 1710345:
                    C0375.m4852(c0202, C0390.m5535(jSONObject, C0385.m5310(C0378.m4995())));
                    if (C0074.m307() < 0) {
                        str2 = "ۦۣۢ";
                        break;
                    } else {
                        C0369.m3256();
                        break;
                    }
                case 1711492:
                    C0121.m987(c0202, C0183.m1473(jSONObject, C0385.m5310(C0399.m5899())));
                    str2 = "ۡ۟ۨ";
                    break;
                case 1729927:
                    c0202 = new C0202();
                    if (C0390.m5512() > 0) {
                        str2 = "ۡۡ۟";
                        break;
                    } else {
                        C0376.m4906();
                        break;
                    }
                case 1731273:
                case 1731302:
                    str2 = "۠ۡۢ";
                    break;
                case 1731422:
                    if (C0368.m3171() < 0) {
                        str2 = "ۣۢ۟";
                        break;
                    } else {
                        C0362.m3122();
                        str2 = "ۧ۠";
                        break;
                    }
                case 1732134:
                    if (C0389.m5481() > 0) {
                        str2 = "ۡ۟ۨ";
                        break;
                    } else {
                        C0183.m1464();
                        str2 = "ۣۧۢ";
                        break;
                    }
                case 1732351:
                    try {
                        JSONObject jSONObject2 = (JSONObject) C0370.m3276(jSONTokener);
                        if (C0025.m118() > 0) {
                            str2 = "ۧۡۢ";
                            jSONObject = jSONObject2;
                            break;
                        } else {
                            jSONObject = jSONObject2;
                            break;
                        }
                    } catch (JSONException e) {
                        C0379.m5060(e);
                        if (C0086.m500() > 0) {
                            str2 = "ۣۣۨ";
                            break;
                        } else {
                            str2 = "ۧۨ۠";
                            break;
                        }
                    }
                case 1733323:
                    if (C0381.m5127() <= 0) {
                        break;
                    } else {
                        str2 = "ۣۤۨ";
                        break;
                    }
                case 1733374:
                    JSONTokener jSONTokener2 = new JSONTokener(str);
                    if (C0400.m5961() > 0) {
                        jSONTokener = jSONTokener2;
                        str2 = "ۣۢ۟";
                        break;
                    } else {
                        C0060.m216();
                        jSONTokener = jSONTokener2;
                        str2 = "۟ۨۦ";
                        break;
                    }
                case 1734464:
                    return c0202;
            }
        }
    }

    /* renamed from: ۠۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m1795(Object obj) {
        String str = "۟ۤۨ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752555) {
                case 79:
                    str = "۟۠ۥ";
                    i = 0;
                    continue;
                case InputDeviceCompat.SOURCE_GAMEPAD /* 1025 */:
                case 4725:
                    if (C0392.m5595() > 0) {
                        str = "ۨۢۡ";
                    } else {
                        continue;
                    }
                case 3880:
                    str = "ۥ۠۟";
                    continue;
                case 3918:
                    if (C0388.m5430() <= 0) {
                        i = i2;
                    } else {
                        str = "ۨۢۡ";
                        i = i2;
                        continue;
                    }
                case 4014:
                    if (C0388.m5430() > 0) {
                        str = "۟ۤۨ";
                    } else {
                        continue;
                    }
                case 4911:
                    break;
                case 6728:
                    if (C0155.m1294() >= 0) {
                        break;
                    } else if (C0400.m5961() > 0) {
                        str = "ۣۤ";
                    }
                case 6863:
                    str = "ۤ۠ۦ";
                    continue;
                case 29900:
                    return i;
                case 1728916:
                    i2 = ((C0202) obj).code;
                    str = "ۢۢۥ";
                    continue;
            }
            if (C0375.m4840() >= 0) {
                C0179.m1427();
            } else {
                str = "ۣۢۤ";
            }
        }
    }

    /* renamed from: ۠ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static String m1796(Object obj) {
        String str = "ۢ۠۠";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746781) {
                case 122:
                    return str2;
                case 2244:
                    if (C0191.m1627() < 0) {
                        str = "ۢ۠۠";
                    } else {
                        continue;
                    }
                case 3166:
                case 5598:
                    str = "۟۠ۨ";
                    continue;
                case 5245:
                    str3 = ((C0202) obj).f327;
                    str = "ۣۤۤ";
                    continue;
                case 5439:
                    if (C0155.m1294() > 0) {
                        break;
                    } else if (C0060.m216() > 0) {
                        str = "ۢۦۤ";
                    }
                case 5506:
                    if (C0379.m5056() <= 0) {
                        str2 = null;
                    } else {
                        str = "ۨۤۢ";
                        str2 = null;
                        continue;
                    }
                case 7486:
                    if (C0060.m216() <= 0) {
                        str = "ۥۣۣ";
                        str2 = str3;
                    } else {
                        str = "۟۠ۨ";
                        str2 = str3;
                        continue;
                    }
                case 7514:
                    break;
                case 28219:
                    if (C0074.m307() >= 0) {
                        C0388.m5430();
                    } else {
                        str = "ۢۡۢ";
                        continue;
                    }
                case 1735842:
                    if (C0387.m5374() >= 0) {
                        C0400.m5961();
                        str = "۟۠۠";
                    } else {
                        str = "ۢۤۡ";
                        continue;
                    }
            }
            if (C0377.m4944() > 0) {
                str = "۠۟";
            }
        }
    }

    /* renamed from: ۢۧۡۨ, reason: not valid java name and contains not printable characters */
    public static List m1797(Object obj) {
        String str = "ۣۡۥ";
        List<T> list = null;
        List<T> list2 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1748679) {
                case 1473:
                case 2335:
                    if (C0368.m3171() < 0) {
                        str = "ۥۦۨ";
                    } else {
                        continue;
                    }
                case 2502:
                    if (C0346.m3059() >= 0) {
                        C0390.m5512();
                        str = "ۣۥۥ";
                        list = null;
                    } else {
                        str = "ۤۡۥ";
                        list = null;
                        continue;
                    }
                case 4187:
                    if (C0073.m265() > 0) {
                        str = "ۣۡۥ";
                    } else {
                        continue;
                    }
                case 4256:
                    return list;
                case 5263:
                    break;
                case 5327:
                    if (C0369.m3256() <= 0) {
                        C0379.m5056();
                    } else {
                        str = "۟ۦ۟";
                        continue;
                    }
                case 6272:
                    if (C0155.m1294() >= 0) {
                        break;
                    } else {
                        str = "ۧۦۢ";
                    }
                case 27428:
                    list2 = ((C0202) obj).f328;
                    if (C0396.m5741() >= 0) {
                        C0379.m5056();
                    } else {
                        str = "۠ۦ";
                        continue;
                    }
                case 27598:
                    str = "۟۟ۡ";
                    continue;
                case 1733313:
                    if (C0375.m4840() >= 0) {
                        str = "۟۠ۧ";
                        list = list2;
                    } else {
                        str = "ۥۦۨ";
                        list = list2;
                        continue;
                    }
            }
            str = C0380.m5068() <= 0 ? "ۢۨ۟" : "ۧ۟ۡ";
        }
    }

    /* renamed from: ۦۨۥۡ, reason: contains not printable characters */
    public static Object m1798(Object obj) {
        String str = "۠۠ۤ";
        T t = null;
        T t2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751682) {
                case 3:
                    str = "ۦۥۨ";
                    continue;
                case 60:
                    if (C0229.m2064() < 0) {
                        str = "۠۠ۤ";
                    } else {
                        continue;
                    }
                case 202:
                    t2 = ((C0202) obj).result;
                    str = "۟ۧۡ";
                    continue;
                case 2086:
                    str = "ۦ۠ۢ";
                    continue;
                case 4198:
                    if (C0346.m3059() >= 0) {
                        break;
                    } else {
                        str = "ۣۤۧ";
                    }
                case 4508:
                    return t;
                case 7547:
                    str = "۠ۢ۠";
                    t = t2;
                    continue;
                case 30859:
                    if (C0369.m3256() <= 0) {
                        C0083.m448();
                        t = null;
                    } else {
                        str = "ۢۢۤ";
                        t = null;
                        continue;
                    }
                case 30916:
                case 31722:
                    if (C0184.m1524() >= 0) {
                        C0121.m1023();
                    } else {
                        str = "۠ۢ۠";
                        continue;
                    }
                case 32650:
                    break;
            }
            if (C0397.m5814() <= 0) {
                C0420.m6215();
                str = "ۥ۟ۦ";
            } else {
                str = "ۤۥۢ";
            }
        }
    }

    public int getCode() {
        return m1795(this);
    }

    public T getResult() {
        return (T) m1798(this);
    }

    /* renamed from: ̖̗̗̖, reason: not valid java name and contains not printable characters */
    public void m1799(int i) {
        String str = "۟ۧۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749795) {
                case 5338:
                    this.code = i;
                    if (C0390.m5512() > 0) {
                        str = "ۦۦ۠";
                        break;
                    } else {
                        str = "ۨ۟";
                        break;
                    }
                case 28931:
                    return;
                case 1732416:
                    if (C0291.m2568() >= 0) {
                        break;
                    } else {
                        str = "۟ۧۡ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̖̖, reason: not valid java name and contains not printable characters */
    public void m1800(List<T> list) {
        String str = "۠ۨۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56508) {
                case 199:
                    if (C0073.m265() > 0) {
                        str = "۠ۨۧ";
                        break;
                    } else {
                        C0377.m4944();
                        str = "ۨۦۤ";
                        break;
                    }
                case 1711419:
                    return;
                case 1734499:
                    this.f328 = list;
                    if (C0082.m410() < 0) {
                        str = "ۦۡۢ";
                        break;
                    } else {
                        str = "ۣۧ۠";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̖̖̗, reason: not valid java name and contains not printable characters */
    public void m1801(String str) {
        String str2 = "ۦۥ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755523) {
                case 3015:
                    return;
                case 31557:
                    str2 = "ۦۥ";
                    break;
                case 1709372:
                    this.f327 = str;
                    if (C0179.m1427() > 0) {
                        str2 = "ۦۧۥ";
                        break;
                    } else {
                        C0389.m5481();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̙̗̖̙̗, reason: not valid java name and contains not printable characters */
    public String m1802() {
        return m1796(this);
    }

    /* renamed from: ̗̙̗̙̙̗, reason: not valid java name and contains not printable characters */
    public List<T> m1803() {
        return m1797(this);
    }

    /* renamed from: ̙̖̖, reason: not valid java name and contains not printable characters */
    public void m1804(T t) {
        String str = "ۣۧۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752489) {
                case 2731:
                    this.result = t;
                    if (C0009.m36() >= 0) {
                        break;
                    } else {
                        str = "ۣۧ۟";
                        break;
                    }
                case 30882:
                    return;
                case 31937:
                    if (C0390.m5512() > 0) {
                        str = "ۣۧۦ";
                        break;
                    } else {
                        str = "ۥۢۧ";
                        break;
                    }
            }
        }
    }
}
