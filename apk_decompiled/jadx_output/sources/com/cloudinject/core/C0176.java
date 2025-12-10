package com.cloudinject.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.C0129;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0362;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.util.ArrayList;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;

@SuppressLint({"StaticFieldLeak"})
/* renamed from: com.cloudinject.core.̙, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0176 {
    private static String APP_ID;

    /* renamed from: ̗̖̗̗̗̗̖, reason: not valid java name and contains not printable characters */
    private static Context f234;

    /* renamed from: ̗̖̗̗̗̗̗, reason: not valid java name and contains not printable characters */
    private static final C0176 f235;

    /* renamed from: ̗̗̖̙̙̖̙, reason: not valid java name and contains not printable characters */
    private static C0129 f236;

    /* renamed from: ̗̗̖̖̙̖̙, reason: not valid java name and contains not printable characters */
    private ArrayList<Application.ActivityLifecycleCallbacks> f237;

    static {
        String str = "۟ۧۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751593) {
                case 2127:
                    return;
                case 7470:
                    str = "۟ۧۤ";
                    break;
                case 7597:
                    f236 = null;
                    if (C0380.m5068() <= 0) {
                        break;
                    } else {
                        str = "ۧ۟ۤ";
                        break;
                    }
                case 7637:
                    f235 = new C0176();
                    if (C0399.m5914() > 0) {
                        str = "ۣ۟ۨ";
                        break;
                    } else {
                        C0368.m3171();
                        break;
                    }
                case 32549:
                    APP_ID = C0383.m5220();
                    if (C0369.m3256() > 0) {
                        str = "ۢ۠ۤ";
                        break;
                    } else {
                        C0383.m5203();
                        str = "ۤۢۨ";
                        break;
                    }
            }
        }
    }

    public C0176() {
        String str = "ۥۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746689) {
                case 2111:
                    str = "ۥۧ";
                    break;
                case 1735521:
                    return;
                case 1735587:
                    this.f237 = new ArrayList<>();
                    str = "ۣۣ";
                    break;
            }
        }
    }

    public static Context getContext() {
        return m1388();
    }

    public static PackageManager getPackageManager() {
        return C0086.m511(C0396.m5736());
    }

    /* renamed from: ̗̖̖̖̖̖, reason: not valid java name and contains not printable characters */
    public static C0129 m1380() {
        return m1385();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00cb A[SYNTHETIC] */
    /* renamed from: ̗̖̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m1381(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.C0176.m1381(android.content.Context):java.lang.String");
    }

    /* renamed from: ̗̖̙̖̙̙, reason: not valid java name and contains not printable characters */
    public static C0176 m1382() {
        return m1389();
    }

    /* renamed from: ̗̙̖̖̖̙, reason: not valid java name and contains not printable characters */
    public static Object m1383() {
        return C0078.m358(C0179.m1438(), new Object[0]);
    }

    /* renamed from: ̗̙̙̙̙̙, reason: not valid java name and contains not printable characters */
    public static String m1384() {
        return m1390();
    }

    /* renamed from: ۣ۟۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static C0129 m1385() {
        String str = "ۣۨۢ";
        C0129 c0129 = null;
        C0129 c01292 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751622) {
                case 2273:
                    str = "ۣۨۢ";
                    continue;
                case 2343:
                    if (C0388.m5430() > 0) {
                        str = "۠ۦۢ";
                    } else {
                        continue;
                    }
                case 3146:
                    return c0129;
                case 3171:
                    str = "ۧۢ";
                    continue;
                case 3419:
                    if (C0362.m3122() > 0) {
                        break;
                    } else {
                        str = "ۧۡۨ";
                    }
                case 4507:
                    str = "ۣ۟ۨ";
                    c0129 = c01292;
                    continue;
                case 4570:
                case 5467:
                    if (C0381.m5127() <= 0) {
                        C0397.m5814();
                    } else {
                        str = "ۣ۟ۨ";
                        continue;
                    }
                case 4573:
                    break;
                case 32520:
                    c01292 = f236;
                    if (C0206.m1807() >= 0) {
                        C0279.m2491();
                        str = "ۣۤۡ";
                    } else {
                        str = "۠ۨۥ";
                        continue;
                    }
                case 1730205:
                    if (C0229.m2064() >= 0) {
                        C0394.m5672();
                        c0129 = null;
                    } else {
                        str = "ۢۨۧ";
                        c0129 = null;
                        continue;
                    }
            }
            str = "ۣ۠ۢ";
        }
    }

    /* renamed from: ۣ۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1386(Object obj) {
        String str = "ۤۦۦ";
        ArrayList<Application.ActivityLifecycleCallbacks> arrayList = null;
        ArrayList<Application.ActivityLifecycleCallbacks> arrayList2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751532) {
                case 15:
                    if (C0393.m5668() <= 0) {
                        C0279.m2491();
                        arrayList = null;
                    } else {
                        str = "ۨۤ۠";
                        arrayList = null;
                        continue;
                    }
                case 781:
                    return arrayList;
                case 840:
                    if (C0191.m1627() > 0) {
                        break;
                    } else if (C0390.m5512() > 0) {
                        str = "ۥ۠۟";
                    }
                case 1096:
                    arrayList2 = ((C0176) obj).f237;
                    str = "۟ۦ";
                    continue;
                case 1994:
                    if (C0385.m5282() >= 0) {
                        C0362.m3122();
                        str = "ۢۢۧ";
                    } else {
                        str = "ۤ۠۟";
                        continue;
                    }
                case 2856:
                case 4752:
                    str = "ۤۨۥ";
                    continue;
                case 3830:
                    break;
                case 28808:
                    if (C0362.m3122() >= 0) {
                        C0184.m1524();
                    } else {
                        str = "۠ۥۡ";
                        continue;
                    }
                case 32749:
                    if (C0179.m1427() <= 0) {
                        C0400.m5961();
                        str = "ۡۡۥ";
                    } else {
                        str = "ۤۦۦ";
                        continue;
                    }
                case 1729035:
                    str = "ۤۨۥ";
                    arrayList = arrayList2;
                    continue;
            }
            if (C0382.m5180() <= 0) {
                C0155.m1294();
            } else {
                str = "ۥۤۥ";
            }
        }
    }

    /* renamed from: ۟ۥۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m1387(Object obj) {
        Object obj2 = "ۦۣۦ";
        String str = null;
        String strM1381 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1752461) {
                case 972:
                    if (C0060.m216() > 0) {
                        obj2 = "ۦۣۦ";
                    } else {
                        continue;
                    }
                case 4940:
                case 5719:
                    obj2 = "۠ۢۢ";
                    continue;
                case 5768:
                    strM1381 = m1381((Context) obj);
                    if (C0387.m5374() >= 0) {
                        C0390.m5512();
                    } else {
                        obj2 = "۟ۢۤ";
                        continue;
                    }
                case 5805:
                    return str;
                case 5998:
                    if (C0393.m5668() > 0) {
                        obj2 = "ۡۡۡ";
                    } else {
                        continue;
                    }
                case 6892:
                    obj2 = "۠ۢۢ";
                    str = strM1381;
                    continue;
                case 30793:
                    if (C0183.m1464() <= 0) {
                        C0383.m5203();
                    } else {
                        obj2 = "ۦۤ";
                        continue;
                    }
                case 31750:
                    break;
                case 31812:
                    if (C0387.m5374() > 0) {
                        break;
                    } else if (C0385.m5282() >= 0) {
                        C0164.m1359();
                        obj2 = "ۢ۟۟";
                    } else {
                        obj2 = "۠ۡۦ";
                    }
                case 1728819:
                    obj2 = "ۣ۠۠";
                    str = null;
                    continue;
            }
            if (C0179.m1427() <= 0) {
                C0369.m3256();
            } else {
                obj2 = "ۧۥۢ";
            }
        }
    }

    /* renamed from: ۠ۥۡۡ, reason: not valid java name and contains not printable characters */
    public static Context m1388() {
        String str = "ۢۢۨ";
        Context context = null;
        Context context2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753600) {
                case 878:
                    context2 = f234;
                    if (C0206.m1807() >= 0) {
                        str = "ۧۧ۠";
                    } else {
                        str = "ۧۨ";
                        continue;
                    }
                case 2949:
                    if (C0378.m4998() > 0) {
                        str = "ۢۢۨ";
                    } else {
                        continue;
                    }
                case 26948:
                case 29885:
                    if (C0025.m118() <= 0) {
                        C0377.m4944();
                    } else {
                        str = "۟ۥ";
                        continue;
                    }
                case 27963:
                    str = "ۣۥ۟";
                    continue;
                case 28838:
                    if (C0121.m1023() < 0) {
                        str = "۟ۦ";
                    } else {
                        continue;
                    }
                case 28840:
                    if (C0370.m3284() >= 0) {
                        break;
                    } else if (C0400.m5961() <= 0) {
                        C0378.m4998();
                    } else {
                        str = "ۦ۠ۨ";
                    }
                case 29954:
                    break;
                case 1710566:
                    return context;
                case 1710567:
                    if (C0386.m5322() <= 0) {
                        context = null;
                    } else {
                        str = "ۡۥ۟";
                        context = null;
                        continue;
                    }
                case 1711841:
                    str = "۟ۥ";
                    context = context2;
                    continue;
            }
            str = C0386.m5322() <= 0 ? "ۧۢۥ" : "ۢۢۦ";
        }
    }

    /* renamed from: ۣۦ۠۟, reason: not valid java name and contains not printable characters */
    public static C0176 m1389() {
        String str = "ۤ۟ۦ";
        C0176 c0176 = null;
        C0176 c01762 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746727) {
                case 38:
                case 28355:
                    if (C0382.m5180() <= 0) {
                        str = "ۣۨۥ";
                    } else {
                        str = "ۥۤۨ";
                        continue;
                    }
                case 2073:
                    str = "۟۟ۡ";
                    continue;
                case 3896:
                    if (C0387.m5374() >= 0) {
                        C0184.m1524();
                        str = "ۤۦۧ";
                    } else {
                        str = "ۣۨۢ";
                        continue;
                    }
                case 5595:
                    break;
                case 6414:
                    return c0176;
                case 6797:
                    if (C0082.m410() < 0) {
                        str = "ۤ۟ۦ";
                    } else {
                        continue;
                    }
                case 7623:
                    c01762 = f235;
                    str = "ۧۥ";
                    continue;
                case 7916:
                    if (C0279.m2491() > 0) {
                        break;
                    } else if (C0082.m410() >= 0) {
                        C0376.m4906();
                    } else {
                        str = "ۤۨۤ";
                    }
                case 28256:
                    str = "ۡۥۢ";
                    c0176 = null;
                    continue;
                case 1735673:
                    str = "ۥۤۨ";
                    c0176 = c01762;
                    continue;
            }
            if (C0369.m3256() <= 0) {
                C0279.m2491();
            } else {
                str = "۟ۨۨ";
            }
        }
    }

    /* renamed from: ۤۦۦۨ, reason: not valid java name and contains not printable characters */
    public static String m1390() {
        String str = "۟۟";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755617) {
                case 103:
                    str3 = APP_ID;
                    str = "۟ۥۤ";
                    continue;
                case 3306:
                    if (C0082.m410() < 0) {
                        str = "۠۠ۨ";
                    } else {
                        continue;
                    }
                case 25155:
                    str = "۟۟";
                    continue;
                case 25249:
                    return str2;
                case 25353:
                case 32481:
                    if (C0083.m448() < 0) {
                        str = "ۣۣ۠";
                    } else {
                        continue;
                    }
                case 28255:
                    if (C0382.m5180() <= 0) {
                        str2 = str3;
                    } else {
                        str = "ۣۣ۠";
                        str2 = str3;
                        continue;
                    }
                case 28382:
                    break;
                case 1708545:
                    if (C0025.m118() <= 0) {
                        break;
                    } else {
                        str = "ۨۥۣ";
                    }
                case 1708553:
                    if (C0396.m5741() >= 0) {
                        C0121.m1023();
                    } else {
                        str = "ۢۢ";
                        continue;
                    }
                case 1709473:
                    if (C0060.m216() <= 0) {
                        C0082.m410();
                        str2 = null;
                    } else {
                        str = "ۣۧ۟";
                        str2 = null;
                        continue;
                    }
            }
            str = C0191.m1627() >= 0 ? "ۡۡۨ" : "۟ۧ";
        }
    }

    public void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        String str = "ۨۥۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750784) {
                case 30342:
                    str = "ۨۥۥ";
                    break;
                case 32358:
                    return;
                case 32392:
                    C0399.m5885(m1386(this), activityLifecycleCallbacks);
                    if (C0088.m573() > 0) {
                        str = "ۨۤۢ";
                        break;
                    } else {
                        C0394.m5672();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̖̖̖̙̙, reason: not valid java name and contains not printable characters */
    public ArrayList<Application.ActivityLifecycleCallbacks> m1391() {
        return m1386(this);
    }

    /* renamed from: ̗̖̗, reason: not valid java name and contains not printable characters */
    public void m1392(Context context) {
        String str = "۟ۢۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752738) {
                case 1190:
                    break;
                case 3582:
                    C0228.m1994(C0086.m524());
                    if (C0155.m1294() < 0) {
                        str = "۟ۢ";
                    } else {
                        continue;
                    }
                case 4163:
                    f234 = context;
                    str = "ۢۨۢ";
                    continue;
                case 5185:
                    if (C0396.m5741() < 0) {
                        str = "۟ۢۨ";
                    } else {
                        continue;
                    }
                case 6401:
                    return;
                case 6599:
                    if (C0388.m5428() < 28) {
                        break;
                    } else if (C0396.m5741() >= 0) {
                        C0378.m4998();
                    } else {
                        str = "ۧۨ";
                    }
                case 1729091:
                    C0335.m2920(new String[]{C0383.m5220()});
                    if (C0078.m361() <= 0) {
                        C0086.m500();
                    } else {
                        str = "ۡۢۢ";
                        continue;
                    }
                case 1729857:
                    C0378.m5009(C0086.m524());
                    if (C0164.m1359() < 0) {
                        str = "۟ۤۨ";
                    } else {
                        continue;
                    }
            }
            str = "ۡۢۢ";
        }
    }

    /* renamed from: ̗̖̙̖̗̖, reason: not valid java name and contains not printable characters */
    public void m1393() {
        Object obj = "۠ۦ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1754377) {
                case 202:
                case 29549:
                    obj = "ۤۡ";
                    continue;
                case 25130:
                    f236 = C0369.m3239(C0385.m5310(C0279.m2478()));
                    obj = "ۥ۠ۥ";
                    continue;
                case 25196:
                    C0378.m5009(C0086.m524());
                    obj = "ۣۦ۟";
                    continue;
                case 27156:
                    obj = "ۣۣۢ";
                    continue;
                case 27250:
                    if (C0206.m1807() >= 0) {
                        C0381.m5127();
                        obj = "ۥ۟ۨ";
                    } else {
                        obj = "۠ۦ";
                        continue;
                    }
                case 28336:
                    obj = "ۡۤ۠";
                    continue;
                case 29653:
                    return;
                case 30883:
                    try {
                        APP_ID = (String) C0060.m185(C0083.m446(m1385(), C0385.m5310(C0164.m1346())));
                        if (C0396.m5741() >= 0) {
                            C0206.m1807();
                        } else {
                            obj = "ۡۤ۠";
                            continue;
                        }
                    } catch (Exception e) {
                        C0078.m344(e);
                        if (C0390.m5512() > 0) {
                            obj = "ۧۥۡ";
                        }
                    }
                case 32745:
                    if (C0370.m3284() >= 0) {
                        C0191.m1627();
                        obj = "ۣۧۢ";
                    } else {
                        obj = "۟۠ۤ";
                        continue;
                    }
                case 1710351:
                    if (C0191.m1627() < 0) {
                        obj = "۟۠ۤ";
                    } else {
                        continue;
                    }
                case 1710440:
                    break;
                case 1710452:
                    if (C0385.m5296(C0228.m2014())) {
                        break;
                    } else {
                        obj = "ۥۣ";
                    }
                case 1710487:
                    C0389.m5466(C0228.m2014(), C0397.m5776(C0396.m5736()), m1387(C0396.m5736()));
                    if (C0370.m3284() < 0) {
                        obj = "۟ۢۨ";
                    } else {
                        continue;
                    }
            }
            obj = "۟ۢۨ";
        }
    }
}
