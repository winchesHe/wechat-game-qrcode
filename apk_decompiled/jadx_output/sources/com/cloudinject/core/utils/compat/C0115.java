package com.cloudinject.core.utils.compat;

import android.net.C0082;
import android.net.wifi.C0078;
import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.location.C0385;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;

/* renamed from: com.cloudinject.core.utils.compat.̖̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0115 {
    public static String get(String str) {
        String str2 = "ۣ۟ۡ";
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755431) {
                case 2:
                    if (C0396.m5741() < 0) {
                        str2 = "۠ۤۤ";
                        break;
                    } else {
                        C0392.m5595();
                        break;
                    }
                case 231:
                    if (C0399.m5914() > 0) {
                        str2 = "ۣۨ";
                        break;
                    } else {
                        C0397.m5814();
                        str2 = "ۦۢ۠";
                        break;
                    }
                case 25159:
                    try {
                        str3 = (String) C0229.m2056(C0362.m3092(C0369.m3239(C0385.m5310(C0377.m4928())), C0385.m5310(C0334.m2868()), new Class[]{String.class}), new Object[]{str});
                        str2 = "ۣۨ";
                        break;
                    } catch (Exception e) {
                        C0078.m344(e);
                        return null;
                    }
                case 28262:
                    str2 = "۠ۤۤ";
                    break;
                case 29891:
                    if (C0385.m5282() >= 0) {
                        break;
                    } else {
                        str2 = "ۣ۟ۡ";
                        break;
                    }
                case 1709378:
                    return str3;
            }
        }
    }

    public static String get(String str, String str2) {
        String str3 = null;
        String str4 = "ۧۨۤ";
        while (true) {
            switch (C0395.m5690((Object) str4) ^ 1751526) {
                case 2788:
                    str4 = "ۦ۟ۥ";
                    break;
                case 4015:
                    if (C0377.m4944() > 0) {
                        str4 = "ۧۨۤ";
                        break;
                    } else {
                        C0088.m573();
                        break;
                    }
                case 4865:
                    return str3;
                case 7739:
                    if (C0082.m410() >= 0) {
                        break;
                    } else {
                        str4 = "۠۠ۧ";
                        break;
                    }
                case 30890:
                    try {
                        String str5 = (String) C0229.m2056(C0362.m3092(C0369.m3239(C0385.m5310(C0377.m4928())), C0385.m5310(C0334.m2868()), new Class[]{String.class, String.class}), new Object[]{str, str2});
                        if (C0388.m5430() > 0) {
                            str4 = "۠۠ۧ";
                            str3 = str5;
                            break;
                        } else {
                            str3 = str5;
                            break;
                        }
                    } catch (Exception e) {
                        C0078.m344(e);
                        return str2;
                    }
                case 32709:
                    if (C0346.m3059() >= 0) {
                        break;
                    } else {
                        str4 = "ۦ۟ۥ";
                        break;
                    }
            }
        }
    }

    public static int getInt(String str, int i) {
        int iM5774 = 0;
        String str2 = "ۤۨ۟";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56414) {
                case 58:
                    str2 = "ۣ۠ۨ";
                    break;
                case 1710355:
                    return iM5774;
                case 1730181:
                    if (C0206.m1807() < 0) {
                        str2 = "ۣ۠ۨ";
                        break;
                    } else {
                        C0399.m5914();
                        str2 = "ۧۡۦ";
                        break;
                    }
                case 1731202:
                    str2 = "ۧۡۧ";
                    break;
                case 1733698:
                    if (C0335.m2923() >= 0) {
                        break;
                    } else {
                        str2 = "ۤۨ۟";
                        break;
                    }
                case 1734533:
                    try {
                        iM5774 = C0397.m5774((Integer) C0229.m2056(C0362.m3092(C0369.m3239(C0385.m5310(C0377.m4928())), C0385.m5310(C0390.m5520()), new Class[]{String.class, C0391.m5545()}), new Object[]{str, C0078.m339(i)}));
                        if (C0155.m1294() < 0) {
                            str2 = "ۧۡۧ";
                            break;
                        } else {
                            str2 = "ۥ۟۟";
                            break;
                        }
                    } catch (Exception e) {
                        C0078.m344(e);
                        return i;
                    }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ̖̖̖, reason: not valid java name and contains not printable characters */
    public static boolean m964(String str) {
        boolean zM5564 = false;
        String str2 = "ۣ۟۠";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1749757) {
                case 1273:
                    zM5564 = C0391.m5564(C0370.m3314(str));
                    str2 = "ۦۣ۟";
                    break;
                case 29503:
                    return (((zM5564 ? 1 : 0) ^ 65535) & 1) | ((zM5564 ? 1 : 0) & 65534);
                case 31700:
                    if (C0183.m1464() <= 0) {
                        break;
                    } else {
                        str2 = "ۣ۟۠";
                        break;
                    }
            }
        }
    }
}
