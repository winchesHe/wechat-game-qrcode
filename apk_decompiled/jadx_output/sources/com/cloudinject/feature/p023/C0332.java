package com.cloudinject.feature.p023;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.C0073;
import android.database.C0074;
import android.graphics.drawable.Drawable;
import android.net.C0082;
import android.net.wifi.C0078;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
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
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
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
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̙̙.̗̙̙̙, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0332 {
    /* renamed from: ̖̖, reason: not valid java name and contains not printable characters */
    public static List<String> m2830(Context context, String str) {
        String str2 = "ۡۧۨ";
        int i = 0;
        int length = 0;
        ActivityInfo[] activityInfoArrM5379 = null;
        ArrayList arrayList = null;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1750783) {
                case 181:
                case 28897:
                    str2 = "ۥۣۣ";
                    continue;
                case 1145:
                    break;
                case 2298:
                    if (i >= length) {
                        break;
                    } else if (C0394.m5672() <= 0) {
                        C0155.m1294();
                        str2 = "ۥۨۢ";
                    } else {
                        str2 = "ۡ۟ۥ";
                    }
                case 3169:
                    activityInfoArrM5379 = C0387.m5379(C0179.m1428(C0086.m511(context), str, 1));
                    if (C0394.m5672() <= 0) {
                        C0121.m1023();
                        str2 = "ۣۨۦ";
                    } else {
                        str2 = "ۡ۠ۡ";
                        continue;
                    }
                case 3318:
                    str2 = "ۤۦ۠";
                    continue;
                case 6237:
                    length = activityInfoArrM5379.length;
                    str2 = "ۨ۠ۡ";
                    continue;
                case 6264:
                    try {
                        C0184.m1513(arrayList, C0183.m1471(activityInfoArrM5379[i]));
                        if (C0377.m4944() <= 0) {
                            C0025.m118();
                            str2 = "ۡۢۨ";
                        } else {
                            str2 = "ۣۡۨ";
                            continue;
                        }
                    } catch (Throwable th) {
                        C0025.m109(th);
                        if (C0379.m5056() > 0) {
                            str2 = "ۢۡۥ";
                        }
                    }
                case 6499:
                    i2 = 1 - (0 - i);
                    if (C0228.m2012() <= 0) {
                        C0388.m5430();
                        str2 = "ۢۢ۟";
                    } else {
                        str2 = "ۦۥۥ";
                        continue;
                    }
                case 6525:
                    arrayList = new ArrayList();
                    if (C0391.m5571() <= 0) {
                        C0378.m4998();
                    } else {
                        str2 = "ۤۦ۠";
                        continue;
                    }
                case 7229:
                    if (C0086.m500() > 0) {
                        str2 = "ۣۡۨ";
                    } else {
                        continue;
                    }
                case 29465:
                    str2 = "ۥۣۣ";
                    i = 0;
                    continue;
                case 29945:
                    if (C0420.m6215() >= 0) {
                        C0082.m410();
                        i = i2;
                    } else {
                        str2 = "ۨ۠";
                        i = i2;
                        continue;
                    }
                case 32274:
                    if (C0399.m5914() <= 0) {
                        C0229.m2064();
                    } else {
                        str2 = "ۡۧۨ";
                        continue;
                    }
                case 32278:
                    str2 = "ۧۦۥ";
                    continue;
                case 32632:
                    return arrayList;
                case 1731079:
                    if (C0390.m5512() <= 0) {
                        C0379.m5056();
                        str2 = "ۤۧ";
                    } else {
                        str2 = "ۣۡۨ";
                        continue;
                    }
            }
            if (C0378.m4998() > 0) {
                str2 = "ۨۥۤ";
            }
        }
    }

    /* renamed from: ̖̖̙, reason: not valid java name and contains not printable characters */
    public static Drawable m2831(Context context) {
        String str = "ۨ۠ۦ";
        OutOfMemoryError e = null;
        Drawable drawableM1409 = null;
        ApplicationInfo applicationInfoM4846 = null;
        PackageInfo packageInfoM1404 = null;
        PackageManager packageManagerM511 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754508) {
                case 41:
                    if (packageInfoM1404 == null) {
                        break;
                    } else {
                        str = "ۦۤۡ";
                    }
                case 203:
                    return drawableM1409;
                case 1135:
                    applicationInfoM4846 = C0375.m4846(packageInfoM1404);
                    if (C0291.m2568() < 0) {
                        str = "ۣۧ۠";
                    } else {
                        continue;
                    }
                case 3426:
                    packageManagerM511 = C0086.m511(context);
                    str = "ۤۢۢ";
                    continue;
                case 27398:
                    C0385.m5310(C0388.m5444());
                    if (C0009.m36() >= 0) {
                        C0074.m307();
                        str = "۟ۡۥ";
                    } else {
                        str = "ۢۦ۠";
                        continue;
                    }
                case 29552:
                    try {
                        try {
                            drawableM1409 = C0179.m1409(applicationInfoM4846, packageManagerM511);
                            if (C0370.m3284() < 0) {
                                str = "ۧۡۡ";
                            } else {
                                continue;
                            }
                        } catch (OutOfMemoryError e2) {
                            e = e2;
                            str = "ۥۨ";
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        C0206.m1805(e3);
                        return null;
                    }
                case 30352:
                    C0379.m5021(e);
                    if (C0379.m5056() > 0) {
                        str = "ۢۢ۟";
                    } else {
                        continue;
                    }
                case 30385:
                    break;
                case 30483:
                    return null;
                case 30515:
                    if (C0088.m573() <= 0) {
                        C0334.m2866();
                    } else {
                        str = "ۧۡۡ";
                        continue;
                    }
                case 32680:
                    packageInfoM1404 = C0179.m1404(packageManagerM511, C0397.m5776(context), 1);
                    if (C0121.m1023() < 0) {
                        str = "ۧۤۢ";
                    } else {
                        continue;
                    }
                case 32708:
                    if (C0060.m216() <= 0) {
                        C0396.m5741();
                    } else {
                        str = "ۣۧ۠";
                        continue;
                    }
                case 32744:
                    if (C0370.m3284() >= 0) {
                        str = "ۣۡۨ";
                    } else {
                        str = "ۤۢۢ";
                        continue;
                    }
                case 1710383:
                    str = "ۡ۟ۨ";
                    continue;
                case 1710454:
                    if (C0394.m5672() > 0) {
                        str = "ۨ۠ۦ";
                    } else {
                        continue;
                    }
            }
            if (C0381.m5127() > 0) {
                str = "ۢۢ۟";
            }
        }
    }

    /* renamed from: ̖̗, reason: not valid java name and contains not printable characters */
    public static Drawable m2832(Context context, String str) {
        String str2 = "ۢۨ۠";
        Drawable drawableM1409 = null;
        ApplicationInfo applicationInfoM4846 = null;
        PackageInfo packageInfoM1428 = null;
        PackageManager packageManagerM511 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1751686) {
                case 224:
                    return null;
                case 1857:
                    applicationInfoM4846 = C0375.m4846(packageInfoM1428);
                    if (C0155.m1294() >= 0) {
                        C0420.m6215();
                    } else {
                        str2 = "ۨ۟ۤ";
                        continue;
                    }
                case 2524:
                    packageManagerM511 = C0086.m511(context);
                    if (C0389.m5481() <= 0) {
                        str2 = "ۨۦ";
                    } else {
                        str2 = "ۦۣۧ";
                        continue;
                    }
                case 3143:
                    if (C0379.m5056() <= 0) {
                        C0279.m2491();
                        str2 = "ۦۢ";
                    } else {
                        str2 = "ۦ۟ۤ";
                        continue;
                    }
                case 4515:
                    break;
                case 5184:
                    if (C0385.m5282() >= 0) {
                        str2 = "۟ۤ۟";
                    } else {
                        str2 = "۟ۡ";
                        continue;
                    }
                case 7429:
                    if (C0376.m4906() > 0) {
                        str2 = "ۢۨ۠";
                    } else {
                        continue;
                    }
                case 29259:
                    applicationInfoM4846.sourceDir = str;
                    str2 = "ۦۣۣ";
                    continue;
                case 31552:
                    applicationInfoM4846.publicSourceDir = str;
                    if (C0389.m5481() <= 0) {
                        str2 = "ۣۧۢ";
                    } else {
                        str2 = "۟ۡ";
                        continue;
                    }
                case 31564:
                    packageInfoM1428 = C0179.m1428(packageManagerM511, str, 1);
                    if (C0370.m3284() < 0) {
                        str2 = "ۣۧۤ";
                    } else {
                        continue;
                    }
                case 31693:
                    return drawableM1409;
                case 32526:
                    if (packageInfoM1428 == null) {
                        break;
                    } else if (C0389.m5481() > 0) {
                        str2 = "ۥۣۡ";
                    }
                case 1728868:
                    try {
                        drawableM1409 = C0179.m1409(applicationInfoM4846, packageManagerM511);
                        if (C0074.m307() >= 0) {
                            C0060.m216();
                        } else {
                            str2 = "ۦ۟ۤ";
                            continue;
                        }
                    } catch (OutOfMemoryError e) {
                        C0379.m5021(e);
                        C0385.m5310(C0388.m5444());
                        if (C0398.m5833() <= 0) {
                            C0183.m1464();
                            str2 = "ۤۥۢ";
                        } else {
                            str2 = "۠ۢۧ";
                        }
                    }
            }
            str2 = "ۤۤۦ";
        }
    }

    /* renamed from: ̖̗̖, reason: not valid java name and contains not printable characters */
    public static String m2833(Context context) {
        String strM4932 = null;
        String str = "ۧۥ";
        StringBuilder sb = null;
        PackageInfo packageInfoM1404 = null;
        PackageManager packageManagerM511 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755494) {
                case 79:
                    try {
                        C0060.m211(sb, C0399.m5892(packageInfoM1404));
                        str = "ۦۨۨ";
                        break;
                    } catch (PackageManager.NameNotFoundException e) {
                        C0206.m1805(e);
                        return C0383.m5220();
                    }
                case 167:
                    return strM4932;
                case 194:
                    if (C0229.m2064() < 0) {
                        str = "ۧۥ";
                        break;
                    } else {
                        str = "ۣ۟ۤ";
                        break;
                    }
                case 2816:
                    C0060.m211(sb, C0385.m5310(C0074.m312()));
                    str = "ۢۧ۠";
                    break;
                case 3278:
                    if (C0088.m573() > 0) {
                        str = "ۨۧ۠";
                        break;
                    } else {
                        C0394.m5672();
                        break;
                    }
                case 24953:
                    if (C0155.m1294() < 0) {
                        str = "ۣ۟۟";
                        break;
                    } else {
                        C0370.m3284();
                        break;
                    }
                case 28189:
                    packageInfoM1404 = C0179.m1404(packageManagerM511, C0397.m5776(context), 1);
                    if (C0368.m3171() >= 0) {
                        break;
                    } else {
                        str = "ۣۧۧ";
                        break;
                    }
                case 31325:
                    C0362.m3081(sb, C0078.m369(packageInfoM1404));
                    if (C0397.m5814() <= 0) {
                        break;
                    } else {
                        str = "ۨۦ";
                        break;
                    }
                case 31694:
                    strM4932 = C0377.m4932(sb);
                    str = "ۨۧ۠";
                    break;
                case 32357:
                    sb = new StringBuilder();
                    if (C0390.m5512() <= 0) {
                        break;
                    } else {
                        str = "ۣۨۢ";
                        break;
                    }
                case 1709464:
                    C0060.m211(sb, C0385.m5310(C0121.m1021()));
                    if (C0393.m5668() <= 0) {
                        break;
                    } else {
                        str = "ۢۢۨ";
                        break;
                    }
                case 1709496:
                    packageManagerM511 = C0086.m511(context);
                    if (C0389.m5481() <= 0) {
                        break;
                    } else {
                        str = "ۣ۟۟";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̖̙, reason: not valid java name and contains not printable characters */
    public static int m2834(Context context, String str) {
        String str2 = "ۣۨۢ";
        PackageManager packageManagerM511 = null;
        int iM369 = 0;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1747868) {
                case 6452:
                    if (C0346.m3059() < 0) {
                        str2 = "ۨۢۧ";
                        break;
                    } else {
                        str2 = "ۧۥۡ";
                        break;
                    }
                case 25265:
                    return iM369;
                case 25269:
                    packageManagerM511 = C0086.m511(context);
                    if (C0397.m5814() > 0) {
                        str2 = "ۦۥۤ";
                        break;
                    } else {
                        C0291.m2568();
                        str2 = "ۢۥۤ";
                        break;
                    }
                case 25459:
                    if (C0074.m307() < 0) {
                        str2 = "ۣۨۢ";
                        break;
                    } else {
                        C0389.m5481();
                        break;
                    }
                case 27033:
                    try {
                        iM369 = C0078.m369(C0179.m1404(packageManagerM511, str, 1));
                        if (C0380.m5068() > 0) {
                            str2 = "ۨۢۧ";
                            break;
                        } else {
                            str2 = "ۤۡۨ";
                            break;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        C0206.m1805(e);
                        return 0;
                    }
                case 1734501:
                    str2 = "ۦۥۤ";
                    break;
            }
        }
    }

    /* renamed from: ̖̙̙, reason: not valid java name and contains not printable characters */
    public static List<String> m2835(Context context) {
        String strM5776 = null;
        PackageManager packageManagerM511 = null;
        ArrayList arrayList = null;
        Integer num = null;
        int iIntValue = 0;
        Object obj = "ۥۢۤ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1755433) {
                case 224:
                    obj = "ۥۢۤ";
                    break;
                case 2857:
                    try {
                        C0191.m1655(arrayList, C0025.m113(C0086.m527(C0179.m1404(packageManagerM511, strM5776, ((iIntValue ^ (-1)) & 895) | (iIntValue & (-896))))));
                        if (C0082.m410() < 0) {
                            obj = "ۥۥۧ";
                            break;
                        } else {
                            C0191.m1627();
                            obj = "ۧۧ";
                            break;
                        }
                    } catch (Throwable th) {
                        C0025.m109(th);
                        if (C0228.m2012() > 0) {
                            obj = "ۡۦۤ";
                            break;
                        } else {
                            C0369.m3256();
                            break;
                        }
                    }
                case 25099:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    obj = "ۦۥ۟";
                    break;
                case 25163:
                case 26230:
                    if (C0164.m1359() >= 0) {
                        break;
                    } else {
                        obj = "ۣ۠۟";
                        break;
                    }
                case 29902:
                    Integer num2 = new Integer(4991);
                    if (C0394.m5672() > 0) {
                        num = num2;
                        obj = "ۣۡۨ";
                        break;
                    } else {
                        C0396.m5741();
                        num = num2;
                        obj = "ۦۥۢ";
                        break;
                    }
                case 30497:
                    packageManagerM511 = C0086.m511(context);
                    if (C0082.m410() >= 0) {
                        break;
                    } else {
                        obj = "ۢۤۨ";
                        break;
                    }
                case 30574:
                    if (C0184.m1524() >= 0) {
                        break;
                    } else {
                        obj = "۠ۤۦ";
                        break;
                    }
                case 31695:
                    strM5776 = C0397.m5776(context);
                    if (C0164.m1359() < 0) {
                        obj = "۠ۢۤ";
                        break;
                    } else {
                        C0378.m4998();
                        break;
                    }
                case 32523:
                    return arrayList;
                case 32611:
                    arrayList = new ArrayList();
                    obj = "ۥۣۦ";
                    break;
                case 32618:
                    if (C0074.m307() >= 0) {
                        break;
                    } else {
                        obj = "ۥۥۧ";
                        break;
                    }
                case 1709398:
                    if (C0392.m5595() > 0) {
                        obj = "ۥۣۦ";
                        break;
                    } else {
                        obj = "۟ۢۨ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static int m2836(Context context, File file) {
        String str = "ۤۤ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754569) {
                case 3352:
                    if (C0009.m36() < 0) {
                        str = "ۤۤ۠";
                        break;
                    } else {
                        C0384.m5278();
                        break;
                    }
                case 32681:
                    return C0078.m369(C0179.m1428(C0086.m511(context), C0400.m5919(file), 1));
            }
        }
    }

    /* renamed from: ̗̗̗̗, reason: not valid java name and contains not printable characters */
    public static boolean m2837(String str) {
        String str2 = "ۨۥۨ";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755527) {
                case 1:
                    z2 = true;
                    if (C0206.m1807() >= 0) {
                        C0155.m1294();
                    } else {
                        str2 = "۟۟۟";
                        continue;
                    }
                case 12:
                    if (!C0379.m5058(str)) {
                        break;
                    } else if (C0073.m265() > 0) {
                        str2 = "ۢۡ";
                    }
                case 162:
                case 25283:
                    if (C0078.m361() <= 0) {
                        C0082.m410();
                    } else {
                        str2 = "ۨۤۨ";
                        continue;
                    }
                case 235:
                    return z;
                case 3172:
                    break;
                case 28536:
                    str2 = "ۢۡۧ";
                    z = z2;
                    continue;
                case 31503:
                    if (C0089.m592() <= 0) {
                        C0025.m118();
                    } else {
                        str2 = "ۨۢ۟";
                        continue;
                    }
                case 32633:
                    if (C0086.m500() > 0) {
                        str2 = "ۨۥۨ";
                    } else {
                        continue;
                    }
                case 32644:
                    str2 = "ۦۥ";
                    continue;
                case 1709368:
                    if (C0229.m2064() >= 0) {
                        C0078.m361();
                        str2 = "ۨ۟ۡ";
                        z = false;
                    } else {
                        str2 = "ۨۤۨ";
                        z = false;
                        continue;
                    }
                case 1709496:
                    if (C0191.m1625(str) <= 21) {
                        break;
                    } else {
                        str2 = "ۨۥۣ";
                    }
            }
            if (C0191.m1627() < 0) {
                str2 = "ۣ۟۟";
            }
        }
    }

    /* renamed from: ̗̙̖, reason: not valid java name and contains not printable characters */
    public static int m2838(Context context, String str) {
        String str2 = "ۣۧ۟";
        int iIntValue = 0;
        PackageManager packageManagerM511 = null;
        Integer num = null;
        int iM1511 = 0;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1752519) {
                case 3782:
                    str2 = "ۦۨۢ";
                    break;
                case 4899:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    str2 = "ۣۣ۠";
                    break;
                case 5767:
                    iM1511 = C0184.m1511(C0378.m4981(C0179.m1404(packageManagerM511, str, ((iIntValue ^ (-1)) & 8475203) | ((-8475204) & iIntValue)))[0]);
                    str2 = "ۦۧۢ";
                    break;
                case 29807:
                    if (C0379.m5056() <= 0) {
                        break;
                    } else {
                        str2 = "ۣۧ۟";
                        break;
                    }
                case 30725:
                    str2 = "ۦۧۢ";
                    break;
                case 30788:
                    num = new Integer(8475139);
                    if (C0392.m5595() > 0) {
                        str2 = "ۦۨۢ";
                        break;
                    } else {
                        str2 = "ۥ۠ۤ";
                        break;
                    }
                case 32646:
                    return iM1511;
                case 32679:
                    try {
                        packageManagerM511 = C0086.m511(context);
                        if (C0398.m5833() > 0) {
                            str2 = "ۡۢۥ";
                            break;
                        } else {
                            str2 = "ۨ۟ۧ";
                            break;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        C0206.m1805(e);
                        return 0;
                    }
            }
        }
    }

    /* renamed from: ̗̙̗, reason: not valid java name and contains not printable characters */
    public static int m2839(Context context, String str) {
        int iM1511 = 0;
        int iIntValue = 0;
        PackageManager packageManagerM511 = null;
        Integer num = null;
        Object obj = "ۡ۠ۨ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1752586) {
                case 935:
                    obj = "ۢۢۧ";
                    break;
                case 2050:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    if (C0368.m3171() >= 0) {
                        break;
                    } else {
                        obj = "۟ۡۦ";
                        break;
                    }
                case 3245:
                    packageManagerM511 = C0086.m511(context);
                    obj = "ۣ۟ۤ";
                    break;
                case 3277:
                    if (C0397.m5814() <= 0) {
                        break;
                    } else {
                        obj = "ۡ۠ۨ";
                        break;
                    }
                case 4259:
                    num = new Integer(7619830);
                    if (C0279.m2491() < 0) {
                        obj = "ۢۢۧ";
                        break;
                    } else {
                        C0391.m5571();
                        break;
                    }
                case 4330:
                    return iM1511;
                case 6478:
                    try {
                        iM1511 = C0184.m1511(C0378.m4981(C0179.m1428(packageManagerM511, str, ((iIntValue ^ (-1)) & 7619766) | ((-7619767) & iIntValue)))[0]);
                        if (C0229.m2064() >= 0) {
                            break;
                        } else {
                            obj = "ۡۢۡ";
                            break;
                        }
                    } catch (Exception e) {
                        return 0;
                    }
                case 6647:
                    if (C0378.m4998() > 0) {
                        obj = "ۡۢۡ";
                        break;
                    } else {
                        obj = "۠ۥۨ";
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x000d A[SYNTHETIC] */
    /* renamed from: ̙̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2840(android.content.Context r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.C0332.m2840(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: ̙̖̙, reason: not valid java name and contains not printable characters */
    public static String m2841(Context context) {
        String str = "۟ۦۤ";
        OutOfMemoryError e = null;
        String strM1432 = null;
        ApplicationInfo applicationInfoM4846 = null;
        PackageInfo packageInfoM1404 = null;
        PackageManager packageManagerM511 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750811) {
                case 1082:
                    break;
                case 1434:
                    if (C0362.m3122() >= 0) {
                        C0368.m3171();
                    } else {
                        str = "ۤۧۢ";
                        continue;
                    }
                case 3492:
                    packageInfoM1404 = C0179.m1404(packageManagerM511, C0397.m5776(context), 1);
                    if (C0393.m5668() <= 0) {
                        C0397.m5814();
                    } else {
                        str = "ۧۡۤ";
                        continue;
                    }
                case 4158:
                    try {
                        C0379.m5021(e);
                        if (C0375.m4840() >= 0) {
                            C0164.m1359();
                            str = "ۤۨۨ";
                        } else {
                            str = "۟ۢۦ";
                            continue;
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        C0206.m1805(e2);
                        return null;
                    }
                case 4216:
                    return null;
                case 4294:
                    packageManagerM511 = C0086.m511(context);
                    if (C0392.m5595() > 0) {
                        str = "ۤۧۢ";
                    } else {
                        continue;
                    }
                case 6299:
                    str = "۟ۨۥ";
                    continue;
                case 7365:
                    C0385.m5310(C0388.m5444());
                    if (C0191.m1627() >= 0) {
                        C0395.m5698();
                        str = "ۢۧۦ";
                    } else {
                        str = "۟۠ۦ";
                        continue;
                    }
                case 7943:
                    try {
                        strM1432 = C0179.m1432(C0396.m5760(applicationInfoM4846, packageManagerM511));
                        if (C0009.m36() < 0) {
                            str = "ۦ۟ۦ";
                        } else {
                            continue;
                        }
                    } catch (OutOfMemoryError e3) {
                        e = e3;
                        if (C0121.m1023() >= 0) {
                            C0183.m1464();
                        } else {
                            str = "ۨ۟ۤ";
                        }
                    }
                case 29265:
                    if (packageInfoM1404 == null) {
                        break;
                    } else {
                        str = "ۦۣۢ";
                    }
                case 29297:
                    str = "۟ۦۤ";
                    continue;
                case 30294:
                    return strM1432;
                case 30396:
                    applicationInfoM4846 = C0375.m4846(packageInfoM1404);
                    str = "۟ۨۥ";
                    continue;
                case 32726:
                    if (C0191.m1627() < 0) {
                        str = "۠ۨۦ";
                    } else {
                        continue;
                    }
                case 1731495:
                    str = "ۦ۟ۦ";
                    continue;
            }
            if (C0420.m6215() >= 0) {
                C0089.m592();
            } else {
                str = "۟ۢۦ";
            }
        }
    }

    /* renamed from: ̙̗, reason: not valid java name and contains not printable characters */
    public static String m2842(Context context, String str) {
        String str2 = "ۧۢۡ";
        ApplicationInfo applicationInfoM4846 = null;
        PackageInfo packageInfoM1428 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1751718) {
                case 3105:
                    return null;
                case 4166:
                    applicationInfoM4846 = C0375.m4846(packageInfoM1428);
                    if (C0375.m4840() >= 0) {
                        C0377.m4944();
                    } else {
                        str2 = "ۣۡۨ";
                        continue;
                    }
                case 5536:
                    applicationInfoM4846.sourceDir = str;
                    str2 = "ۧۥ";
                    continue;
                case 7524:
                    return C0025.m105(applicationInfoM4846);
                case 7648:
                    break;
                case 29256:
                    if (packageInfoM1428 == null) {
                        break;
                    } else {
                        str2 = "۠۠۠";
                    }
                case 32546:
                    str2 = "ۧۢۡ";
                    continue;
                case 32704:
                    packageInfoM1428 = C0179.m1428(C0086.m511(context), str, 1);
                    if (C0394.m5672() <= 0) {
                        str2 = "ۨۦۢ";
                    } else {
                        str2 = "ۨ۠ۦ";
                        continue;
                    }
                case 1730168:
                    applicationInfoM4846.publicSourceDir = str;
                    if (C0074.m307() >= 0) {
                        C0089.m592();
                    } else {
                        str2 = "۟ۥۨ";
                        continue;
                    }
            }
            str2 = C0191.m1627() >= 0 ? "ۢ۠ۢ" : "ۣۣۧ";
        }
    }

    /* renamed from: ̙̗̖, reason: not valid java name and contains not printable characters */
    public static int m2843(Context context) {
        return C0121.m1012(context, C0397.m5776(context));
    }

    /* renamed from: ̙̙̗, reason: not valid java name and contains not printable characters */
    public static String m2844(Context context) {
        String strM5892 = null;
        String str = "ۨۧۨ";
        PackageManager packageManagerM511 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747865) {
                case 4390:
                    return strM5892;
                case 5436:
                    try {
                        strM5892 = C0399.m5892(C0179.m1404(packageManagerM511, C0397.m5776(context), 1));
                        if (C0073.m265() > 0) {
                            str = "ۤۧۢ";
                            break;
                        } else {
                            C0009.m36();
                            break;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        C0206.m1805(e);
                        return C0383.m5220();
                    }
                case 25168:
                    packageManagerM511 = C0086.m511(context);
                    if (C0228.m2012() > 0) {
                        str = "ۥۨۨ";
                        break;
                    } else {
                        str = "ۨۢ۠";
                        break;
                    }
                case 25209:
                    str = "ۨۧۨ";
                    break;
                case 1734598:
                    str = "ۥۨۨ";
                    break;
                case 1734629:
                    if (C0191.m1627() >= 0) {
                        break;
                    } else {
                        str = "ۤۧۢ";
                        break;
                    }
            }
        }
    }
}
