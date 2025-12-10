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
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
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
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

@Dex2C
/* renamed from: com.cloudinject.feature.model.̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0188 {

    /* renamed from: ̗̗̗̙̖̖̙, reason: not valid java name and contains not printable characters */
    public static final short f275 = 0;

    /* renamed from: ̗̗̗̙̙̙̗, reason: not valid java name and contains not printable characters */
    public static final short f276 = 1;
    private int status;

    /* renamed from: ̗̗̗̖̙̙̙, reason: not valid java name and contains not printable characters */
    private C0202 f277;

    /* renamed from: ̗̗̗̙̖̗̖, reason: not valid java name and contains not printable characters */
    private long f278;

    /* renamed from: ̗̖̙̗, reason: not valid java name and contains not printable characters */
    public static C0188 m1602(String str) {
        JSONObject jSONObject = null;
        String str2 = "ۤۨۧ";
        JSONTokener jSONTokener = null;
        C0188 c0188 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1752523) {
                case 1031:
                case 1728919:
                    if (C0121.m1023() < 0) {
                        str2 = "ۢۦ";
                        break;
                    } else {
                        C0368.m3171();
                        break;
                    }
                case 1832:
                    c0188 = new C0188();
                    if (C0370.m3284() >= 0) {
                        break;
                    } else {
                        str2 = "ۢۢۢ";
                        break;
                    }
                case 1987:
                    C0083.m460(c0188, C0389.m5462(C0362.m3103(C0376.m4913(jSONObject, C0385.m5310(C0386.m5323())))));
                    if (C0191.m1627() < 0) {
                        str2 = "ۣۣۡ";
                        break;
                    } else {
                        C0078.m361();
                        str2 = "ۤۡۨ";
                        break;
                    }
                case 2763:
                    if (C0383.m5203() > 0) {
                        str2 = "ۤۨۧ";
                        break;
                    } else {
                        C0387.m5374();
                        break;
                    }
                case 2826:
                    if (C0390.m5512() > 0) {
                        str2 = "ۣۨۨ";
                        break;
                    } else {
                        C0369.m3256();
                        break;
                    }
                case 3945:
                    jSONTokener = new JSONTokener(str);
                    if (C0073.m265() > 0) {
                        str2 = "ۣۨۨ";
                        break;
                    } else {
                        C0086.m500();
                        break;
                    }
                case 3950:
                    C0228.m2003(c0188, C0346.m3063(jSONObject, C0385.m5310(C0383.m5190())));
                    if (C0381.m5127() > 0) {
                        str2 = "ۤۡۥ";
                        break;
                    } else {
                        C0399.m5914();
                        break;
                    }
                case 4810:
                    str2 = "ۣ۟";
                    break;
                case 6827:
                    str2 = "ۣۣۡ";
                    break;
                case 29736:
                    JSONObject jSONObject2 = (JSONObject) C0370.m3276(jSONTokener);
                    if (C0121.m1023() < 0) {
                        jSONObject = jSONObject2;
                        str2 = "ۧۨۨ";
                        break;
                    } else {
                        jSONObject = jSONObject2;
                        str2 = "ۦۨۨ";
                        break;
                    }
                case 31724:
                    try {
                        C0229.m2052(c0188, C0390.m5535(jSONObject, C0385.m5310(C0389.m5471())));
                        if (C0009.m36() < 0) {
                            str2 = "ۢۢۥ";
                            break;
                        } else {
                            C0386.m5322();
                            break;
                        }
                    } catch (JSONException e) {
                        C0379.m5060(e);
                        if (C0379.m5056() > 0) {
                            str2 = "ۤ۟ۧ";
                            break;
                        } else {
                            C0375.m4840();
                            str2 = "ۣۧۧ";
                            break;
                        }
                    }
                case 1728911:
                    return c0188;
            }
        }
    }

    /* renamed from: ۠ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static long m1603(Object obj) {
        String str = "۠۟ۦ";
        long j = 0;
        long j2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752674) {
                case 104:
                    break;
                case 1085:
                case 2201:
                    str = "ۡۨۧ";
                    continue;
                case 1244:
                    if (C0392.m5595() <= 0) {
                        C0397.m5814();
                        str = "۠ۤ";
                    } else {
                        str = "۠۟ۦ";
                        continue;
                    }
                case 1963:
                    str = "۟ۤۤ";
                    continue;
                case 4546:
                    return j;
                case 5285:
                    if (C0074.m307() >= 0) {
                        break;
                    } else if (C0400.m5961() <= 0) {
                        C0391.m5571();
                        str = "ۦ۠ۤ";
                    } else {
                        str = "ۧۦۡ";
                    }
                case 5599:
                    if (C0346.m3059() >= 0) {
                        str = "ۣۥۣ";
                        j = j2;
                    } else {
                        str = "ۡۨۧ";
                        j = j2;
                        continue;
                    }
                case 6653:
                    if (C0228.m2012() <= 0) {
                        C0369.m3256();
                        j = 0;
                    } else {
                        str = "ۧۤۤ";
                        j = 0;
                        continue;
                    }
                case 31616:
                    j2 = ((C0188) obj).f278;
                    str = "۠ۧۤ";
                    continue;
                case 31685:
                    str = "ۣۧ۟";
                    continue;
            }
            if (C0400.m5961() > 0) {
                str = "ۤ۟ۤ";
            }
        }
    }

    /* renamed from: ۣۣۣۤ, reason: not valid java name and contains not printable characters */
    public static C0202 m1604(Object obj) {
        Object obj2 = "ۦۨۦ";
        C0202 c0202 = null;
        C0202 c02022 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1746820) {
                case 228:
                    if (C0396.m5741() >= 0) {
                        C0089.m592();
                    } else {
                        obj2 = "ۦۨۦ";
                        continue;
                    }
                case 2183:
                    c02022 = ((C0188) obj).f277;
                    if (C0400.m5961() <= 0) {
                        C0392.m5595();
                    } else {
                        obj2 = "ۣۣۦ";
                        continue;
                    }
                case 3271:
                    if (C0183.m1464() <= 0) {
                        C0377.m4944();
                    } else {
                        obj2 = "ۢ۠ۦ";
                        continue;
                    }
                case 4354:
                    if (C0390.m5512() <= 0) {
                        C0389.m5481();
                        c0202 = c02022;
                    } else {
                        obj2 = "ۤۨۢ";
                        c0202 = c02022;
                        continue;
                    }
                case 5612:
                    if (C0089.m592() <= 0) {
                        obj2 = "ۣۤۢ";
                        c0202 = null;
                    } else {
                        obj2 = "ۦۡۥ";
                        c0202 = null;
                        continue;
                    }
                case 6573:
                    break;
                case 7514:
                    return c0202;
                case 26080:
                    if (C0228.m2012() <= 0) {
                        break;
                    } else if (C0060.m216() <= 0) {
                        C0396.m5741();
                        obj2 = "ۣۧۨ";
                    } else {
                        obj2 = "ۣۡۥ";
                    }
                case 26126:
                    if (C0279.m2491() >= 0) {
                        obj2 = "۠ۦۥ";
                    } else {
                        obj2 = "ۣۨۧ";
                        continue;
                    }
                case 28224:
                case 28297:
                    if (C0389.m5481() <= 0) {
                        obj2 = "۠ۢۦ";
                    } else {
                        obj2 = "ۤۨۢ";
                        continue;
                    }
            }
            if (C0392.m5595() > 0) {
                obj2 = "ۣ۠ۦ";
            }
        }
    }

    /* renamed from: ۦۨ۟ۨ, reason: contains not printable characters */
    public static int m1605(Object obj) {
        String str = "ۣۣۡ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752579) {
                case 2118:
                    if (C0334.m2866() <= 0) {
                        break;
                    } else {
                        str = "ۨۦ۠";
                    }
                case 2311:
                    if (C0073.m265() <= 0) {
                        C0385.m5282();
                        str = "ۥ۟";
                    } else {
                        str = "ۧۦۣ";
                        continue;
                    }
                case 4507:
                case 31719:
                    if (C0025.m118() <= 0) {
                        C0206.m1807();
                    } else {
                        str = "۠ۢ۠";
                        continue;
                    }
                case 5405:
                    return i;
                case 5406:
                    str = "ۧۢۥ";
                    continue;
                case 5497:
                    break;
                case 30625:
                    i2 = ((C0188) obj).status;
                    str = "ۦ۟۟";
                    continue;
                case 31593:
                    if (C0082.m410() >= 0) {
                        str = "ۥۣۢ";
                        i = 0;
                    } else {
                        str = "ۣۧۨ";
                        i = 0;
                        continue;
                    }
                case 32581:
                    if (C0397.m5814() <= 0) {
                        C0395.m5698();
                        i = i2;
                    } else {
                        str = "۠ۢ۠";
                        i = i2;
                        continue;
                    }
                case 1729123:
                    if (C0386.m5322() > 0) {
                        str = "ۣۣۡ";
                    } else {
                        continue;
                    }
            }
            if (C0179.m1427() > 0) {
                str = "۠ۢ۟";
            }
        }
    }

    public int getStatus() {
        return m1605(this);
    }

    public void setStatus(int i) {
        String str = "ۣۧۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747936) {
                case 3202:
                    if (C0155.m1294() < 0) {
                        str = "ۣۧۢ";
                        break;
                    } else {
                        C0279.m2491();
                        break;
                    }
                case 28129:
                    return;
                case 28296:
                    this.status = i;
                    if (C0376.m4906() > 0) {
                        str = "ۧۧۡ";
                        break;
                    } else {
                        C0392.m5595();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public void m1606(C0202 c0202) {
        String str = "ۣۧۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56294) {
                case 1729956:
                    str = "ۣۧۨ";
                    break;
                case 1731810:
                    this.f277 = c0202;
                    if (C0396.m5741() < 0) {
                        str = "ۣ۠ۨ";
                        break;
                    } else {
                        C0191.m1627();
                        break;
                    }
                case 1732669:
                    return;
            }
        }
    }

    /* renamed from: ̗̖̗̙̗̖, reason: not valid java name and contains not printable characters */
    public boolean m1607() {
        String str = "۠ۤۧ";
        boolean z = false;
        boolean z2 = false;
        int iM1605 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752703) {
                case 226:
                    if (C0074.m307() < 0) {
                        str = "۠ۤۧ";
                    } else {
                        continue;
                    }
                case 1111:
                    if (C0229.m2064() >= 0) {
                        z = false;
                    } else {
                        str = "ۣۨۤ";
                        z = false;
                        continue;
                    }
                case 1941:
                    if (C0400.m5961() <= 0) {
                        z2 = true;
                    } else {
                        str = "ۣۣۢ";
                        z2 = true;
                        continue;
                    }
                case 2166:
                    if (C0390.m5512() <= 0) {
                        str = "ۥۨ۟";
                        z = z2;
                    } else {
                        str = "ۢۧۥ";
                        z = z2;
                        continue;
                    }
                case 2301:
                    if (iM1605 != 1) {
                        break;
                    } else {
                        str = "ۣ۟ۥ";
                    }
                case 3391:
                    if (C0009.m36() < 0) {
                        str = "۟ۨۢ";
                    } else {
                        continue;
                    }
                case 4606:
                    if (C0335.m2923() >= 0) {
                        C0383.m5203();
                    } else {
                        str = "ۤۢۦ";
                        continue;
                    }
                case 5404:
                    iM1605 = m1605(this);
                    str = "ۤ۠ۦ";
                    continue;
                case 5734:
                case 31840:
                    if (C0387.m5374() >= 0) {
                        C0394.m5672();
                        str = "۟۠ۧ";
                    } else {
                        str = "ۣۨۤ";
                        continue;
                    }
                case 30488:
                    return z;
                case 1729058:
                    break;
            }
            if (C0369.m3256() <= 0) {
                C0375.m4840();
            } else {
                str = "ۡۧۧ";
            }
        }
    }

    /* renamed from: ̗̙̗̙̖̖, reason: not valid java name and contains not printable characters */
    public C0202 m1608() {
        return m1604(this);
    }

    /* renamed from: ̗̙̗̙̙̖, reason: not valid java name and contains not printable characters */
    public long m1609() {
        return m1603(this);
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public void m1610(long j) {
        String str = "۟ۤۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751493) {
                case 7769:
                    this.f278 = j;
                    str = "ۦۥ۟";
                    break;
                case 7846:
                    if (C0368.m3171() >= 0) {
                        break;
                    } else {
                        str = "۟ۤۡ";
                        break;
                    }
                case 31685:
                    return;
            }
        }
    }
}
