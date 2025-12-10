package com.cloudinject.p025;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import androidx.core.view.PointerIconCompat;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
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
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import dalvik.system.DexClassLoader;
import java.io.File;
import mirrorb.android.accounts.C0375;
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
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

@Dex2C
/* renamed from: com.cloudinject.̗.̖, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0340 {

    /* renamed from: ̖̖̖̙̙̖̗, reason: not valid java name and contains not printable characters */
    private AssetManager f564;

    /* renamed from: ̖̖̖̙̙̖̙, reason: not valid java name and contains not printable characters */
    private File f565;

    /* renamed from: ̖̖̙̙̖̖̗, reason: not valid java name and contains not printable characters */
    private Context f566;

    /* renamed from: ̖̖̙̙̙̖̗, reason: not valid java name and contains not printable characters */
    private String f567;

    /* renamed from: ̙̖̙̖̖̖̗, reason: not valid java name and contains not printable characters */
    private Context f568;

    /* renamed from: ̙̖̙̖̙̙̖, reason: not valid java name and contains not printable characters */
    private File f569;

    /* renamed from: ̙̖̙̙̖̙̖, reason: not valid java name and contains not printable characters */
    private Resources f570;

    /* renamed from: ̙̙̙̖̖̖̖, reason: not valid java name and contains not printable characters */
    private ClassLoader f571;

    /* renamed from: ̙̙̙̙̙̖̗, reason: not valid java name and contains not printable characters */
    private C0341 f572;

    C0340(Context context, File file) throws Exception {
        C0341 c0341 = null;
        String str = "۟ۡ۟";
        C0355 c0355 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749664) {
                case 384:
                    try {
                        this.f564 = m2946(this, m2953(this));
                        str = "ۦ۠ۧ";
                        break;
                    } catch (Exception e) {
                        C0078.m344(e);
                        throw new Exception(C0385.m5310(C0334.m2857()), e);
                    }
                case 1217:
                    this.f568 = context;
                    if (C0380.m5068() <= 0) {
                        break;
                    } else {
                        str = "ۡ۟ۡ";
                        break;
                    }
                case 1257:
                    return;
                case 2145:
                    this.f572 = c0341;
                    if (C0391.m5571() > 0) {
                        str = "ۣۡۧ";
                        break;
                    } else {
                        C0380.m5068();
                        str = "ۢۡۥ";
                        break;
                    }
                case 2247:
                    if (C0121.m1023() >= 0) {
                        break;
                    } else {
                        str = "۟ۡ۟";
                        break;
                    }
                case 3072:
                    if (C0379.m5056() > 0) {
                        str = "ۣۡۧ";
                        break;
                    } else {
                        C0420.m6215();
                        break;
                    }
                case 3106:
                    this.f567 = C0393.m5635(context, C0400.m5919(file));
                    if (C0392.m5595() > 0) {
                        str = "۠ۢۧ";
                        break;
                    } else {
                        C0391.m5571();
                        str = "ۢۤۧ";
                        break;
                    }
                case 3845:
                    if (C0229.m2064() < 0) {
                        str = "ۥۧۤ";
                        break;
                    } else {
                        C0060.m216();
                        break;
                    }
                case 5533:
                    this.f569 = file;
                    if (C0086.m500() <= 0) {
                        break;
                    } else {
                        str = "ۣۢ۠";
                        break;
                    }
                case 6459:
                    c0355 = new C0355(this);
                    if (C0396.m5741() < 0) {
                        str = "ۧۧۡ";
                        break;
                    } else {
                        str = "ۦۢۥ";
                        break;
                    }
                case 6533:
                    this.f571 = m2951(this, context, file, m2949(this), C0089.m610(context));
                    if (C0400.m5961() > 0) {
                        str = "ۢۦۤ";
                        break;
                    } else {
                        C0393.m5668();
                        str = "۟ۤ";
                        break;
                    }
                case 7203:
                    this.f565 = C0179.m1398(context, C0385.m5310(C0291.m2569()), 0);
                    str = "ۥۧۤ";
                    break;
                case 29645:
                    this.f570 = m2943(this, context, m2945(this));
                    if (C0382.m5180() <= 0) {
                        break;
                    } else {
                        str = "۠ۦۡ";
                        break;
                    }
                case 29857:
                    this.f566 = c0355;
                    str = "ۨۡۥ";
                    break;
                case 31660:
                    c0341 = new C0341(this);
                    if (C0228.m2012() > 0) {
                        str = "ۤۧۤ";
                        break;
                    } else {
                        C0388.m5430();
                        str = "ۧۥۣ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ۟۠ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Resources m2942(Object obj) {
        String str = "ۤ۟ۨ";
        Resources resources = null;
        Resources resources2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746973) {
                case 793:
                    return resources;
                case PointerIconCompat.TYPE_GRABBING /* 1021 */:
                    if (C0369.m3256() > 0) {
                        str = "ۣۡۨ";
                    } else {
                        continue;
                    }
                case 1894:
                    if (C0088.m573() > 0) {
                        str = "ۤ۟ۨ";
                    } else {
                        continue;
                    }
                case 1921:
                case 27000:
                    if (C0121.m1023() >= 0) {
                        C0383.m5203();
                    } else {
                        str = "۠ۡۥ";
                        continue;
                    }
                case 3998:
                    if (C0393.m5668() > 0) {
                        str = "ۢ۠ۦ";
                    } else {
                        continue;
                    }
                case 4560:
                    if (C0368.m3171() >= 0) {
                        break;
                    } else if (C0392.m5595() > 0) {
                        str = "ۨ۟۠";
                    }
                case 6773:
                    if (C0183.m1464() <= 0) {
                        resources = null;
                    } else {
                        str = "۠ۨۨ";
                        resources = null;
                        continue;
                    }
                case 24788:
                    resources2 = ((C0340) obj).f570;
                    str = "ۨۧ";
                    continue;
                case 1733824:
                    break;
                case 1733858:
                    if (C0376.m4906() <= 0) {
                        C0279.m2491();
                        resources = resources2;
                    } else {
                        str = "۠ۡۥ";
                        resources = resources2;
                        continue;
                    }
            }
            str = C0025.m118() <= 0 ? "۠۠ۤ" : "ۣ۟ۧ";
        }
    }

    /* renamed from: ۟ۡۢۡۤ, reason: not valid java name and contains not printable characters */
    public static Resources m2943(Object obj, Object obj2, Object obj3) throws Exception {
        String str = "۟ۦۧ";
        Resources resources = null;
        Resources resourcesM2956 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56381) {
                case 134:
                    if (C0060.m216() <= 0) {
                        resources = resourcesM2956;
                    } else {
                        str = "ۦۢۨ";
                        resources = resourcesM2956;
                        continue;
                    }
                case 198:
                    resourcesM2956 = ((C0340) obj).m2956((Context) obj2, (AssetManager) obj3);
                    str = "ۦۡ";
                    continue;
                case 1709370:
                    str = "۟ۦۧ";
                    continue;
                case 1710623:
                    str = "ۦۨۨ";
                    continue;
                case 1711505:
                    return resources;
                case 1711514:
                case 1731189:
                    str = "ۦۢۨ";
                    continue;
                case 1711707:
                    str = "ۢۢۤ";
                    resources = null;
                    continue;
                case 1729141:
                    break;
                case 1732249:
                    str = "ۦۣۢ";
                    continue;
                case 1735645:
                    if (C0377.m4944() < 0) {
                        break;
                    } else if (C0184.m1524() < 0) {
                        str = "ۣۨ";
                    }
            }
            str = C0381.m5127() <= 0 ? "ۦۢۢ" : "ۣۧۨ";
        }
    }

    /* renamed from: ۟ۢۡۤۢ, reason: not valid java name and contains not printable characters */
    public static String m2944(Object obj) {
        Object obj2 = "ۡۨۥ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1752489) {
                case 1006:
                    str2 = ((C0340) obj).f567;
                    if (C0060.m216() <= 0) {
                        C0074.m307();
                    } else {
                        obj2 = "ۢۨۤ";
                        continue;
                    }
                case 3831:
                    obj2 = "۠ۨۨ";
                    str = str2;
                    continue;
                case 3850:
                    break;
                case 3887:
                case 30912:
                    if (C0089.m592() <= 0) {
                        C0155.m1294();
                    } else {
                        obj2 = "۠ۨۨ";
                        continue;
                    }
                case 4663:
                    if (C0384.m5278() < 0) {
                        break;
                    } else {
                        obj2 = "ۥۥۧ";
                    }
                case 5652:
                    if (C0396.m5741() >= 0) {
                        C0378.m4998();
                    } else {
                        obj2 = "ۧۢۤ";
                        continue;
                    }
                case 5705:
                    return str;
                case 5772:
                    if (C0377.m4944() > 0) {
                        obj2 = "۟ۤ۟";
                    } else {
                        continue;
                    }
                case 6707:
                    if (C0089.m592() <= 0) {
                        str = null;
                    } else {
                        obj2 = "۠ۧۤ";
                        str = null;
                        continue;
                    }
                case 1729014:
                    if (C0078.m361() > 0) {
                        obj2 = "ۡۨۥ";
                    } else {
                        continue;
                    }
            }
            obj2 = "۠ۢۧ";
        }
    }

    /* renamed from: ۟ۥۤۢ۠, reason: not valid java name and contains not printable characters */
    public static AssetManager m2945(Object obj) {
        String str = "ۦۥ";
        AssetManager assetManager = null;
        AssetManager assetManager2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750656) {
                case 97:
                    if (C0346.m3059() < 0) {
                        str = "ۧۨۡ";
                    } else {
                        continue;
                    }
                case 2053:
                    if (C0381.m5127() <= 0) {
                        C0206.m1807();
                        assetManager = null;
                    } else {
                        str = "ۣۦۤ";
                        assetManager = null;
                        continue;
                    }
                case 4355:
                    if (C0399.m5914() > 0) {
                        str = "ۥۧۧ";
                    } else {
                        continue;
                    }
                case 6177:
                case 28832:
                    str = "ۡۦۣ";
                    continue;
                case 6563:
                    assetManager2 = ((C0340) obj).f564;
                    if (C0384.m5278() <= 0) {
                        C0279.m2491();
                        str = "ۣۤۤ";
                    } else {
                        str = "ۣۧۡ";
                        continue;
                    }
                case 6622:
                    return assetManager;
                case 29641:
                    str = "ۡۦۣ";
                    assetManager = assetManager2;
                    continue;
                case 30702:
                    str = "ۦۥ";
                    continue;
                case 1731135:
                    if (C0368.m3171() > 0) {
                        break;
                    } else if (C0385.m5282() >= 0) {
                        C0335.m2923();
                        str = "ۦۥۥ";
                    } else {
                        str = "ۡۤۦ";
                    }
                case 1731296:
                    break;
            }
            if (C0229.m2064() >= 0) {
                C0279.m2491();
                str = "ۣۤ۟";
            } else {
                str = "ۣ۟ۧ";
            }
        }
    }

    /* renamed from: ۟ۦۥۢۥ, reason: not valid java name and contains not printable characters */
    public static AssetManager m2946(Object obj, Object obj2) throws Exception {
        Object obj3 = "ۣۢۤ";
        AssetManager assetManager = null;
        AssetManager assetManagerM2955 = null;
        while (true) {
            switch (C0395.m5690(obj3) ^ 1747750) {
                case 37:
                case 6542:
                    if (C0392.m5595() > 0) {
                        obj3 = "ۤۤۥ";
                    } else {
                        continue;
                    }
                case 198:
                    break;
                case 4353:
                    if (C0392.m5595() <= 0) {
                        assetManager = assetManagerM2955;
                    } else {
                        obj3 = "ۤۤۥ";
                        assetManager = assetManagerM2955;
                        continue;
                    }
                case 4419:
                    return assetManager;
                case 5380:
                    if (C0086.m500() <= 0) {
                        obj3 = "ۧ۠ۦ";
                    } else {
                        obj3 = "ۣۢۤ";
                        continue;
                    }
                case 5803:
                    obj3 = "ۧۥ";
                    assetManager = null;
                    continue;
                case 6629:
                    if (C0395.m5698() >= 0) {
                        break;
                    } else if (C0291.m2568() >= 0) {
                        C0377.m4944();
                    } else {
                        obj3 = "ۦ۠ۥ";
                    }
                case 27213:
                    assetManagerM2955 = ((C0340) obj).m2955((File) obj2);
                    if (C0179.m1427() > 0) {
                        obj3 = "ۤۢۥ";
                    } else {
                        continue;
                    }
                case 1734584:
                    if (C0391.m5571() <= 0) {
                        C0386.m5322();
                        obj3 = "ۥۥۧ";
                    } else {
                        obj3 = "ۥ۟ۧ";
                        continue;
                    }
                case 1734648:
                    obj3 = "ۢۢۨ";
                    continue;
            }
            if (C0228.m2012() > 0) {
                obj3 = "ۥۣ";
            }
        }
    }

    /* renamed from: ۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static Context m2947(Object obj) {
        String str = "ۦۦۣ";
        Context context = null;
        Context context2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750633) {
                case 1229:
                    str = "ۧۧۨ";
                    continue;
                case 4585:
                case 28769:
                    if (C0164.m1359() < 0) {
                        str = "ۨۤۦ";
                    } else {
                        continue;
                    }
                case 4599:
                    if (C0121.m1023() >= 0) {
                        context = null;
                    } else {
                        str = "ۢۢۤ";
                        context = null;
                        continue;
                    }
                case 7627:
                    break;
                case 7799:
                    if (C0183.m1464() <= 0) {
                        C0228.m2012();
                    } else {
                        str = "ۦۦۣ";
                        continue;
                    }
                case 29506:
                    str = "ۨۤۦ";
                    context = context2;
                    continue;
                case 29770:
                    if (C0379.m5056() <= 0) {
                        break;
                    } else if (C0383.m5203() > 0) {
                        str = "ۣۨ۠";
                    }
                case 32386:
                    context2 = ((C0340) obj).f568;
                    if (C0398.m5833() <= 0) {
                        C0369.m3256();
                        str = "ۡ۟ۤ";
                    } else {
                        str = "ۧ۠ۤ";
                        continue;
                    }
                case 32515:
                    return context;
                case 1731220:
                    if (C0291.m2568() >= 0) {
                        C0385.m5282();
                    } else {
                        str = "ۣ۟ۤ";
                        continue;
                    }
            }
            str = "ۨۥ";
        }
    }

    /* renamed from: ۟ۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static ClassLoader m2948(Object obj) {
        Object obj2 = "ۣ۠۟";
        ClassLoader classLoader = null;
        ClassLoader classLoader2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1752645) {
                case 67:
                    classLoader2 = ((C0340) obj).f571;
                    if (C0376.m4906() <= 0) {
                        C0229.m2064();
                    } else {
                        obj2 = "۟۟";
                        continue;
                    }
                case 2082:
                    if (C0382.m5180() > 0) {
                        obj2 = "۠ۡۥ";
                    } else {
                        continue;
                    }
                case 4376:
                    if (C0379.m5056() <= 0) {
                        obj2 = "ۣ۠ۤ";
                    } else {
                        obj2 = "ۦۣ";
                        continue;
                    }
                case 5403:
                    break;
                case 5414:
                    return classLoader;
                case 5441:
                    if (C0420.m6215() >= 0) {
                        C0379.m5056();
                        obj2 = "ۡۧۢ";
                        classLoader = null;
                    } else {
                        obj2 = "ۡۦۢ";
                        classLoader = null;
                        continue;
                    }
                case 5497:
                    if (C0383.m5203() <= 0) {
                        break;
                    } else if (C0395.m5698() >= 0) {
                        C0346.m3059();
                        obj2 = "ۡۥ";
                    } else {
                        obj2 = "ۥۣۤ";
                    }
                case 5625:
                case 1729272:
                    obj2 = "۠ۤۧ";
                    continue;
                case 1729125:
                    obj2 = "ۣ۠۟";
                    continue;
                case 1729957:
                    if (C0392.m5595() <= 0) {
                        obj2 = "۠۟";
                        classLoader = classLoader2;
                    } else {
                        obj2 = "۠ۤۧ";
                        classLoader = classLoader2;
                        continue;
                    }
            }
            if (C0383.m5203() <= 0) {
                C0398.m5833();
            } else {
                obj2 = "ۣۢۦ";
            }
        }
    }

    /* renamed from: ۡ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static File m2949(Object obj) {
        String str = "۠۠ۤ";
        File file = null;
        File file2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754663) {
                case 6:
                case 28836:
                    if (C0378.m4998() > 0) {
                        str = "۟۠ۡ";
                    } else {
                        continue;
                    }
                case 1964:
                    str = "۟۟ۦ";
                    continue;
                case 1988:
                    break;
                case 24839:
                    return file;
                case 24865:
                    str = "۠ۤ۟";
                    file = null;
                    continue;
                case 26969:
                    str = "۠۠ۤ";
                    continue;
                case 27843:
                    if (C0386.m5322() <= 0) {
                        break;
                    } else if (C0376.m4906() <= 0) {
                        C0397.m5814();
                        str = "۠ۨۦ";
                    } else {
                        str = "ۤۢۥ";
                    }
                case 28028:
                    if (C0387.m5374() >= 0) {
                        C0089.m592();
                        str = "۠۟ۥ";
                    } else {
                        str = "ۧۨۢ";
                        continue;
                    }
                case 31744:
                    file2 = ((C0340) obj).f565;
                    if (C0393.m5668() <= 0) {
                        str = "ۨۦۧ";
                    } else {
                        str = "ۦۣ";
                        continue;
                    }
                case 1710746:
                    if (C0191.m1627() >= 0) {
                        C0370.m3284();
                        file = file2;
                    } else {
                        str = "۟۠ۡ";
                        file = file2;
                        continue;
                    }
            }
            if (C0074.m307() < 0) {
                str = "ۦۡۦ";
            }
        }
    }

    /* renamed from: ۢۢۦۧ, reason: not valid java name and contains not printable characters */
    public static Context m2950(Object obj) {
        String str = "۠ۢ";
        Context context = null;
        Context context2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56417) {
                case 99:
                    if (C0083.m448() >= 0) {
                        break;
                    } else if (C0379.m5056() > 0) {
                        str = "ۨۦۢ";
                    }
                case 1709509:
                    context2 = ((C0340) obj).f566;
                    str = "ۥۣ۟";
                    continue;
                case 1711525:
                    if (C0291.m2568() >= 0) {
                        str = "ۨۥۤ";
                    } else {
                        str = "ۣ۟ۥ";
                        continue;
                    }
                case 1728898:
                    if (C0393.m5668() <= 0) {
                        str = "۠ۡۡ";
                    } else {
                        str = "۠ۢ";
                        continue;
                    }
                case 1729000:
                    if (C0376.m4906() <= 0) {
                        C0155.m1294();
                        context = context2;
                    } else {
                        str = "ۤۦ۟";
                        context = context2;
                        continue;
                    }
                case 1730300:
                    return context;
                case 1731176:
                    str = "ۡۥۥ";
                    context = null;
                    continue;
                case 1733406:
                case 1734273:
                    str = "ۤۦ۟";
                    continue;
                case 1733408:
                    if (C0376.m4906() > 0) {
                        str = "ۡۧۥ";
                    } else {
                        continue;
                    }
                case 1734627:
                    break;
            }
            if (C0279.m2491() < 0) {
                str = "ۦۣۡ";
            }
        }
    }

    /* renamed from: ۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static ClassLoader m2951(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws Exception {
        Object obj6 = "ۤۢۡ";
        ClassLoader classLoader = null;
        ClassLoader classLoaderM2957 = null;
        while (true) {
            switch (C0395.m5690(obj6) ^ 1747747) {
                case 157:
                    return classLoader;
                case 480:
                    if (C0073.m265() <= 0) {
                        obj6 = "ۧۤ۠";
                        classLoader = null;
                    } else {
                        obj6 = "ۧ۟۟";
                        classLoader = null;
                        continue;
                    }
                case 1473:
                case 5477:
                    obj6 = "۠ۧۥ";
                    continue;
                case 4352:
                    if (C0184.m1524() > 0) {
                        break;
                    } else if (C0385.m5282() >= 0) {
                        C0368.m3171();
                        obj6 = "۟ۡۧ";
                    } else {
                        obj6 = "ۦۢ";
                    }
                case 5862:
                    if (C0335.m2923() >= 0) {
                        C0393.m5668();
                    } else {
                        obj6 = "۠۟ۢ";
                        continue;
                    }
                case 27204:
                    if (C0334.m2866() <= 0) {
                        C0183.m1464();
                    } else {
                        obj6 = "ۤۢۡ";
                        continue;
                    }
                case 27279:
                    if (C0155.m1294() >= 0) {
                        classLoader = classLoaderM2957;
                    } else {
                        obj6 = "۠ۧۥ";
                        classLoader = classLoaderM2957;
                        continue;
                    }
                case 28196:
                    if (C0397.m5814() <= 0) {
                        C0369.m3256();
                        obj6 = "ۢۤۡ";
                    } else {
                        obj6 = "ۥۥۦ";
                        continue;
                    }
                case 1734495:
                    break;
                case 1734559:
                    classLoaderM2957 = ((C0340) obj).m2957((Context) obj2, (File) obj3, (File) obj4, (ClassLoader) obj5);
                    if (C0073.m265() <= 0) {
                        C0420.m6215();
                    } else {
                        obj6 = "ۦۢۨ";
                        continue;
                    }
            }
            if (C0229.m2064() >= 0) {
                C0183.m1464();
            } else {
                obj6 = "ۥۡۡ";
            }
        }
    }

    /* renamed from: ۣۤۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m2952(Object obj) throws IllegalAccessException, InstantiationException {
        String str = "۠۟ۧ";
        Object obj2 = null;
        Object objNewInstance = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751712) {
                case 837:
                    str = "ۦۦۢ";
                    obj2 = objNewInstance;
                    continue;
                case 1024:
                    break;
                case 3272:
                case 7548:
                    if (C0206.m1807() < 0) {
                        str = "ۦۦۢ";
                    } else {
                        continue;
                    }
                case 4200:
                    if (C0228.m2012() < 0) {
                        break;
                    } else if (C0399.m5914() > 0) {
                        str = "۠ۢۢ";
                    }
                case 4416:
                    if (C0399.m5914() > 0) {
                        str = "ۣۤ";
                    } else {
                        continue;
                    }
                case 4480:
                    objNewInstance = ((Class) obj).newInstance();
                    if (C0381.m5127() <= 0) {
                        str = "۟ۤ";
                    } else {
                        str = "ۤ۠ۡ";
                        continue;
                    }
                case 7512:
                    if (C0380.m5068() > 0) {
                        str = "۟ۦۣ";
                    } else {
                        continue;
                    }
                case 30850:
                    return obj2;
                case 31557:
                    if (C0386.m5322() <= 0) {
                        C0179.m1427();
                        str = "ۣۢ۠";
                    } else {
                        str = "۠۟ۧ";
                        continue;
                    }
                case 1730241:
                    str = "۟ۧ۠";
                    obj2 = null;
                    continue;
            }
            str = "۠ۨۨ";
        }
    }

    /* renamed from: ۥۣ۠ۨ, reason: contains not printable characters */
    public static File m2953(Object obj) {
        String str = "ۤۧۥ";
        File file = null;
        File file2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749821) {
                case 443:
                    if (C0396.m5741() < 0) {
                        str = "ۤۧۥ";
                    } else {
                        continue;
                    }
                case 1443:
                    str = "ۧۥۦ";
                    continue;
                case 2492:
                case 5278:
                    str = "ۥۢۢ";
                    continue;
                case 2559:
                    if (C0334.m2866() <= 0) {
                        break;
                    } else if (C0191.m1627() >= 0) {
                        C0383.m5203();
                    } else {
                        str = "ۤۥ";
                    }
                case 3800:
                    return file;
                case 7231:
                    if (C0398.m5833() > 0) {
                        str = "ۤۥۢ";
                    } else {
                        continue;
                    }
                case 7357:
                    break;
                case 30453:
                    if (C0088.m573() <= 0) {
                        C0390.m5512();
                        file = null;
                    } else {
                        str = "ۣۡۤ";
                        file = null;
                        continue;
                    }
                case 31455:
                    if (C0191.m1627() >= 0) {
                        C0375.m4840();
                        file = file2;
                    } else {
                        str = "ۥۢۢ";
                        file = file2;
                        continue;
                    }
                case 1732540:
                    file2 = ((C0340) obj).f569;
                    str = "ۨۨۢ";
                    continue;
            }
            str = "ۣۤ۟";
        }
    }

    /* renamed from: ۨ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static C0341 m2954(Object obj) {
        String str = "ۣۨۡ";
        C0341 c0341 = null;
        C0341 c03412 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56505) {
                case 1873:
                case 1729060:
                    if (C0382.m5180() <= 0) {
                        str = "۟ۨ۟";
                    } else {
                        str = "ۨۥۢ";
                        continue;
                    }
                case 1709372:
                    return c0341;
                case 1709458:
                    if (C0083.m448() < 0) {
                        str = "۟ۧ";
                    } else {
                        continue;
                    }
                case 1711376:
                    str = "ۨۢۥ";
                    c0341 = null;
                    continue;
                case 1711568:
                    if (C0381.m5127() <= 0) {
                        C0346.m3059();
                        str = "ۣۧۥ";
                    } else {
                        str = "ۦۢۥ";
                        continue;
                    }
                case 1728818:
                    if (C0391.m5571() <= 0) {
                        str = "ۣۥۡ";
                    } else {
                        str = "ۣۨۡ";
                        continue;
                    }
                case 1731493:
                    if (C0383.m5203() <= 0) {
                        break;
                    } else {
                        str = "۟۠ۢ";
                    }
                case 1732538:
                    break;
                case 1733208:
                    str = "ۨۥۢ";
                    c0341 = c03412;
                    continue;
                case 1735576:
                    c03412 = ((C0340) obj).f572;
                    if (C0229.m2064() >= 0) {
                        C0400.m5961();
                        str = "ۨۢ۟";
                    } else {
                        str = "ۡۢۢ";
                        continue;
                    }
            }
            if (C0164.m1359() < 0) {
                str = "ۦۣ۠";
            }
        }
    }

    /* renamed from: ̖̖, reason: not valid java name and contains not printable characters */
    protected AssetManager m2955(File file) throws Exception {
        AssetManager assetManager = null;
        String str = "ۦۧ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749671) {
                case 6847:
                    str = "ۦۧ۠";
                    break;
                case 28824:
                    AssetManager assetManager2 = (AssetManager) m2952(AssetManager.class);
                    if (C0379.m5056() > 0) {
                        assetManager = assetManager2;
                        str = "ۨ۠ۥ";
                        break;
                    } else {
                        C0088.m573();
                        assetManager = assetManager2;
                        str = "ۥۢۡ";
                        break;
                    }
                case 31306:
                    C0369.m3219(C0009.m32(C0073.m263(assetManager), C0385.m5310(C0387.m5383()), new Class[]{String.class}), new Object[]{C0400.m5919(file)});
                    if (C0082.m410() >= 0) {
                        break;
                    } else {
                        str = "ۨۧۡ";
                        break;
                    }
                case 31589:
                    return assetManager;
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    protected Resources m2956(Context context, AssetManager assetManager) throws Exception {
        String str = "ۣۣۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749669) {
                case 1248:
                    return new Resources(assetManager, C0121.m1010(C0083.m429(context)), C0121.m1022(C0083.m429(context)));
                case 6438:
                    if (C0228.m2012() > 0) {
                        str = "ۣۣۡ";
                        break;
                    } else {
                        C0370.m3284();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    protected ClassLoader m2957(Context context, File file, File file2, ClassLoader classLoader) throws Exception {
        String strM5919 = null;
        String str = "ۣۢ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748826) {
                case 1219:
                    if (C0183.m1464() > 0) {
                        str = "ۣۢ۠";
                        break;
                    } else {
                        str = "۟ۤۥ";
                        break;
                    }
                case 4453:
                    return new DexClassLoader(C0400.m5919(file), strM5919, C0400.m5919(file2), classLoader);
                case 7653:
                    strM5919 = C0400.m5919(C0155.m1306(context));
                    str = "ۥۥ۟";
                    break;
            }
        }
    }

    /* renamed from: ̗̗̖̙̖̖, reason: not valid java name and contains not printable characters */
    public Context m2958() {
        return m2950(this);
    }

    /* renamed from: ̗̗̖̙̖̗, reason: not valid java name and contains not printable characters */
    public Resources m2959() {
        return m2942(this);
    }

    /* renamed from: ̗̗̖̙̙̗, reason: not valid java name and contains not printable characters */
    public AssetManager m2960() {
        return C0388.m5439(m2942(this));
    }

    /* renamed from: ̗̗̖̙̙̙, reason: not valid java name and contains not printable characters */
    public String m2961() {
        return m2944(this);
    }

    /* renamed from: ̗̗̙̙̖̗, reason: not valid java name and contains not printable characters */
    public ClassLoader m2962() {
        return m2948(this);
    }

    /* renamed from: ̗̗̙̙̗̖, reason: not valid java name and contains not printable characters */
    public Context m2963() {
        return m2947(this);
    }

    /* renamed from: ̗̗̙̙̗̗, reason: not valid java name and contains not printable characters */
    public File m2964() {
        return m2949(this);
    }

    /* renamed from: ̗̗̙̙̗̙, reason: not valid java name and contains not printable characters */
    public C0341 m2965() {
        return m2954(this);
    }

    /* renamed from: ̗̗̙̙̙̙, reason: not valid java name and contains not printable characters */
    public File m2966() {
        return m2953(this);
    }
}
