package com.cloudinject.feature.model;

import com.cloudinject.core.p013.C0179;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0335;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.location.C0385;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.os.mount.C0390;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.java.lang.C0400;
import org.json.JSONObject;

@Dex2C
/* renamed from: com.cloudinject.feature.model.̗̙̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0199 {

    /* renamed from: ̗̗̗̗̙̖̖, reason: not valid java name and contains not printable characters */
    private String f315;

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    public static C0199 m1752(JSONObject jSONObject) {
        String str = "۠ۡۤ";
        C0199 c0199 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753451) {
                case 14:
                    break;
                case 169:
                    return null;
                case 27223:
                    str = "۠ۡۤ";
                    continue;
                case 27240:
                    if (jSONObject != null) {
                        break;
                    } else {
                        str = "ۦۣ۟";
                    }
                case 28182:
                    c0199 = new C0199();
                    str = "ۢۤۦ";
                    continue;
                case 29227:
                    return c0199;
                case 29583:
                    C0179.m1421(c0199, C0183.m1473(jSONObject, C0385.m5310(C0385.m5283())));
                    if (C0279.m2491() < 0) {
                        str = "ۢۧۥ";
                    } else {
                        continue;
                    }
            }
            str = "ۣۡۧ";
        }
    }

    /* renamed from: ۦۢۨۡ, reason: contains not printable characters */
    public static String m1753(Object obj) {
        String str = "ۨۤۤ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747869) {
                case 896:
                    str = "ۦ۠ۤ";
                    str2 = str3;
                    continue;
                case 4600:
                    str = "ۨۤۤ";
                    continue;
                case 5530:
                case 25243:
                    if (C0389.m5481() <= 0) {
                        C0387.m5374();
                        str = "ۤۢ";
                    } else {
                        str = "ۦ۠ۤ";
                        continue;
                    }
                case 7458:
                    str3 = ((C0199) obj).f315;
                    str = "۟ۨۦ";
                    continue;
                case 7488:
                    break;
                case 7609:
                    str = "ۨۡ۟";
                    continue;
                case 25333:
                    if (C0398.m5833() < 0) {
                        break;
                    } else if (C0390.m5512() <= 0) {
                        C0382.m5180();
                        str = "۠ۤ۟";
                    } else {
                        str = "ۣۥۡ";
                    }
                case 27260:
                    str = "ۦۣ۠";
                    continue;
                case 27380:
                    str = "ۣ۠ۡ";
                    str2 = null;
                    continue;
                case 27383:
                    return str2;
            }
            if (C0400.m5961() <= 0) {
                C0397.m5814();
            } else {
                str = "ۦۤ۟";
            }
        }
    }

    /* renamed from: ̗̙̖̗, reason: not valid java name and contains not printable characters */
    public void m1754(String str) {
        String str2 = "ۨ۟ۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56573) {
                case 1709101:
                    this.f315 = str;
                    if (C0335.m2923() < 0) {
                        str2 = "ۧۤۤ";
                        break;
                    } else {
                        C0279.m2491();
                        break;
                    }
                case 1710426:
                    return;
                case 1730206:
                    str2 = "ۨ۟ۧ";
                    break;
            }
        }
    }

    /* renamed from: ̗̙̗̙̗̙, reason: not valid java name and contains not printable characters */
    public String m1755() {
        return m1753(this);
    }
}
