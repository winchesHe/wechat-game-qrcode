package com.cloudinject.feature.model;

import android.app.C0009;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.database.C0074;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p023.C0334;
import mirrorb.android.accounts.C0375;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.providers.C0391;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;
import org.json.JSONObject;

/* renamed from: com.cloudinject.feature.model.̗̗̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0196 {

    /* renamed from: ̗̗̗̗̖̗̗, reason: not valid java name and contains not printable characters */
    private String f301;

    /* renamed from: ̙̗, reason: not valid java name and contains not printable characters */
    public static C0196 m1721(JSONObject jSONObject) {
        String str = "ۥۡۧ";
        C0196 c0196 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753696) {
                case 64:
                    return null;
                case 1995:
                    str = "ۥۡۧ";
                    continue;
                case 25919:
                    c0196 = new C0196();
                    str = "ۤۢۢ";
                    continue;
                case 26881:
                    break;
                case 30788:
                    C0375.m4847(c0196, C0183.m1473(jSONObject, C0385.m5310(C0334.m2865())));
                    if (C0397.m5814() <= 0) {
                        str = "۠۠ۡ";
                    } else {
                        str = "ۥۤۢ";
                        continue;
                    }
                case 31811:
                    return c0196;
                case 32683:
                    if (jSONObject != null) {
                        break;
                    } else {
                        str = "ۦۦ۠";
                    }
            }
            str = "۟ۢۢ";
        }
    }

    /* renamed from: ۟ۧۡۢ۟, reason: not valid java name and contains not printable characters */
    public static String m1722(Object obj) {
        String str = "ۣ۠۠";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754437) {
                case 167:
                    str3 = ((C0196) obj).f301;
                    str = "ۣ۠ۢ";
                    continue;
                case 224:
                    break;
                case 1190:
                    if (C0060.m216() > 0) {
                        str = "ۣ۠۠";
                    } else {
                        continue;
                    }
                case 25185:
                    if (C0389.m5481() <= 0) {
                        C0385.m5282();
                        str2 = null;
                    } else {
                        str = "ۢۢ";
                        str2 = null;
                        continue;
                    }
                case 29252:
                case 31523:
                    str = "ۣۣۨ";
                    continue;
                case 29536:
                    if (C0155.m1294() >= 0) {
                        str2 = str3;
                    } else {
                        str = "ۣۣۨ";
                        str2 = str3;
                        continue;
                    }
                case 29542:
                    if (C0009.m36() >= 0) {
                        break;
                    } else {
                        str = "ۧۦۡ";
                    }
                case 29645:
                    return str2;
                case 1710341:
                    if (C0391.m5571() <= 0) {
                        C0399.m5914();
                        str = "ۡۤۧ";
                    } else {
                        str = "ۥۦۧ";
                        continue;
                    }
                case 1710427:
                    if (C0074.m307() < 0) {
                        str = "۟۠ۥ";
                    } else {
                        continue;
                    }
            }
            if (C0386.m5322() > 0) {
                str = "ۡ۟";
            }
        }
    }

    /* renamed from: ̗̙̗̖, reason: not valid java name and contains not printable characters */
    public void m1723(String str) {
        String str2 = "ۧۡۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1746718) {
                case 3550:
                    return;
                case 7482:
                    if (C0375.m4840() >= 0) {
                        break;
                    } else {
                        str2 = "ۧۡۦ";
                        break;
                    }
                case 25170:
                    this.f301 = str;
                    if (C0073.m265() > 0) {
                        str2 = "۠۟۟";
                        break;
                    } else {
                        C0228.m2012();
                        str2 = "ۢۤ۠";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̙̗̗̙̗, reason: not valid java name and contains not printable characters */
    public String m1724() {
        return m1722(this);
    }
}
