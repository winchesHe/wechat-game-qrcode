package com.cloudinject.core.p009;

import android.app.Application;
import android.app.C0009;
import android.app.Instrumentation;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.os.ConditionVariable;
import android.os.Handler;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
import com.facebook.stetho.server.http.HttpStatus;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
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

/* renamed from: com.cloudinject.core.̗.̗, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0152 {
    static final boolean $assertionsDisabled = false;
    public static final String TAG = "BActivityThread";

    /* renamed from: ̗̗̖̖̙̙̖, reason: not valid java name and contains not printable characters */
    private static C0152 f219;
    private Application mInitialApplication;

    /* renamed from: ̗̖̗̗̗̗̙, reason: not valid java name and contains not printable characters */
    private final List<ProviderInfo> f220;

    /* renamed from: ̗̗̖̖̖̖̖, reason: not valid java name and contains not printable characters */
    private C0165 f221;

    public C0152() {
        String str = "ۧ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753544) {
                case 27283:
                    str = "ۧ۠";
                    break;
                case 1711377:
                    this.f220 = new ArrayList();
                    if (C0393.m5668() <= 0) {
                        break;
                    } else {
                        str = "ۣ۟";
                        break;
                    }
                case 1711508:
                    return;
            }
        }
    }

    public static Application getApplication() {
        return m1252(C0228.m2014());
    }

    public static /* synthetic */ void lambda$qY3X1rVfzPcou9swaJcIInQmOXI(C0152 c0152, String str, String str2, ConditionVariable conditionVariable) {
        String str3 = "ۧۢ";
        while (true) {
            switch (C0395.m5690((Object) str3) ^ 56506) {
                case 97:
                    m1254(c0152, str, str2, conditionVariable);
                    if (C0400.m5961() > 0) {
                        str3 = "ۡۤۤ";
                        break;
                    } else {
                        C0382.m5180();
                        str3 = "۟ۧۨ";
                        break;
                    }
                case 1711868:
                    if (C0393.m5668() <= 0) {
                        break;
                    } else {
                        str3 = "ۧۢ";
                        break;
                    }
                case 1733531:
                    return;
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    private Context m1244(ApplicationInfo applicationInfo) {
        Context contextM5470 = null;
        int iIntValue = 0;
        String strM105 = null;
        Context contextM5736 = null;
        Integer num = null;
        Object obj = "۟ۤ۠";
        while (true) {
            switch (C0395.m5690(obj) ^ 1748861) {
                case 414:
                    return contextM5470;
                case 2278:
                    num = new Integer(8977021);
                    obj = "ۣۨۤ";
                    break;
                case 6453:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    if (C0009.m36() >= 0) {
                        break;
                    } else {
                        obj = "ۧۡۦ";
                        break;
                    }
                case 7483:
                    obj = "۟ۤ۠";
                    break;
                case 26138:
                    contextM5736 = C0396.m5736();
                    obj = "ۣۨۧ";
                    break;
                case 26161:
                    try {
                        strM105 = C0025.m105(applicationInfo);
                        obj = "ۣۡۦ";
                        break;
                    } catch (Exception e) {
                        C0078.m344(e);
                        return null;
                    }
                case 27152:
                    if (C0060.m216() <= 0) {
                        break;
                    } else {
                        obj = "ۡۢۤ";
                        break;
                    }
                case 27185:
                    contextM5470 = C0389.m5470(contextM5736, strM105, ((iIntValue ^ (-1)) & 8977022) | ((-8977023) & iIntValue));
                    if (C0391.m5571() <= 0) {
                        break;
                    } else {
                        obj = "ۡۢۤ";
                        break;
                    }
                case 1733502:
                    obj = "ۣۨۤ";
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a9 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1245(android.content.Context r9, java.lang.String r10, java.util.List<android.content.pm.ProviderInfo> r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.p009.C0152.m1245(android.content.Context, java.lang.String, java.util.List):void");
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    private /* synthetic */ void m1246(String str, String str2, ConditionVariable conditionVariable) {
        String str3 = "ۦ۠ۥ";
        while (true) {
            switch (C0395.m5690((Object) str3) ^ 1749826) {
                case 1355:
                    return;
                case 1410:
                    C0362.m3110(conditionVariable);
                    if (C0183.m1464() > 0) {
                        str3 = "ۣ۟ۥ";
                        break;
                    } else {
                        C0183.m1464();
                        break;
                    }
                case 2410:
                    str3 = "ۦ۠ۥ";
                    break;
                case 29225:
                    m1256(this, str, str2);
                    if (C0397.m5814() <= 0) {
                        break;
                    } else {
                        str3 = "ۣۥۢ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̖̖̙̙̗, reason: not valid java name and contains not printable characters */
    public static C0152 m1247() {
        C0152 c0152M1253 = m1253();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = c0152M1253 == null ? 1709 : 1678;
                case 204:
                    synchronized (C0152.class) {
                        try {
                            C0152 c0152M12532 = m1253();
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = c0152M12532 == null ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case HttpStatus.HTTP_INTERNAL_SERVER_ERROR /* 500 */:
                                        f219 = new C0152();
                                        break;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = 48674;
                                continue;
                            case 47483:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        return m1253();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00c4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x0106. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:72:0x0214. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:79:0x0229. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x0256. Please report as an issue. */
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    private void m1248(String str, String str2) {
        PackageInfo packageInfoM1404;
        Application application;
        Iterator itM5782;
        int i;
        Integer num = new Integer(2338742);
        synchronized (this) {
            int iIntValue = ((Integer) new Object[]{num}[0]).intValue();
            int i2 = ((iIntValue ^ (-1)) & 2338750) | (iIntValue & (-2338751));
            try {
                try {
                    packageInfoM1404 = C0179.m1404(C0393.m5669(), str, i2);
                    i = 1616;
                } catch (PackageManager.NameNotFoundException e) {
                    C0206.m1805(e);
                    packageInfoM1404 = null;
                }
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                            break;
                        case 49:
                            i = 1647;
                            continue;
                    }
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = packageInfoM1404 != null ? 48736 : 48705;
                            case 47384:
                                throw new RuntimeException(C0385.m5310(C0228.m2016()));
                            case 47417:
                                ApplicationInfo applicationInfoM4846 = C0375.m4846(packageInfoM1404);
                                ProviderInfo[] providerInfoArrM2906 = C0335.m2906(packageInfoM1404);
                                int i4 = 48767;
                                while (true) {
                                    i4 ^= 48784;
                                    switch (i4) {
                                        case 14:
                                        case 45:
                                            break;
                                        case 76:
                                            packageInfoM1404.providers = new ProviderInfo[0];
                                            break;
                                        case 239:
                                            i4 = providerInfoArrM2906 == null ? 48860 : 48829;
                                    }
                                }
                                C0191.m1655(m1257(this), C0025.m113(C0335.m2906(packageInfoM1404)));
                                try {
                                    String str3 = (String) C0060.m185(C0083.m446(C0378.m5003(), C0385.m5310(C0229.m2066())));
                                    boolean zM1364 = C0164.m1364(str3);
                                    int i5 = 48891;
                                    while (true) {
                                        i5 ^= 48908;
                                        switch (i5) {
                                            case 22:
                                            case 53:
                                                boolean zM5096 = C0380.m5096(str3, C0385.m5310(C0121.m1001()));
                                                int i6 = 49790;
                                                while (true) {
                                                    i6 ^= 49807;
                                                    switch (i6) {
                                                        case 18:
                                                        case 51:
                                                            applicationInfoM4846.className = C0082.m386(C0379.m5019(C0369.m3225(), 0, i2), str3);
                                                            break;
                                                        case 84:
                                                            applicationInfoM4846.className = C0388.m5435(str3, C0385.m5310(C0121.m1001()), C0383.m5220());
                                                            int i7 = 49914;
                                                            while (true) {
                                                                i7 ^= 49931;
                                                                switch (i7) {
                                                                    case 497:
                                                                        i7 = 50596;
                                                                    case 1711:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 241:
                                                            i6 = zM5096 ? 49883 : 49852;
                                                    }
                                                }
                                                break;
                                            case TypedValues.PositionType.TYPE_PERCENT_WIDTH /* 503 */:
                                                i5 = zM1364 ? 49635 : 48953;
                                            case 32495:
                                                applicationInfoM4846.className = null;
                                                int i8 = 49666;
                                                while (true) {
                                                    i8 ^= 49683;
                                                    switch (i8) {
                                                        case 17:
                                                            i8 = 49697;
                                                        case 50:
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                } catch (Exception e2) {
                                    int i9 = 52735;
                                    while (true) {
                                        i9 ^= 52752;
                                        switch (i9) {
                                            case 14:
                                                break;
                                            case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                                                i9 = 52766;
                                                continue;
                                        }
                                    }
                                }
                                Object objM568 = C0088.m568(C0369.m3241(), C0391.m5580());
                                Object objM5682 = C0088.m568(C0369.m3229(), m1251(this, applicationInfoM4846));
                                C0074.m320(C0379.m5024(), objM5682, false);
                                C0393.m5655(C0088.m581(), objM5682, applicationInfoM4846);
                                C0393.m5655(C0291.m2566(), objM5682, null);
                                C0165 c0165 = new C0165();
                                c0165.f231 = applicationInfoM4846;
                                c0165.processName = str2;
                                c0165.f233 = objM5682;
                                c0165.f232 = m1257(this);
                                C0393.m5655(C0179.m1439(), objM568, new ComponentName(C0025.m105(m1258(c0165)), C0078.m352(Instrumentation.class)));
                                C0393.m5655(C0086.m495(), objM568, m1258(c0165));
                                C0393.m5655(C0179.m1413(), objM568, m1259(c0165));
                                C0393.m5655(C0382.m5173(), objM568, m1249(c0165));
                                C0393.m5655(C0396.m5724(), objM568, m1255(c0165));
                                this.f221 = c0165;
                                try {
                                    application = (Application) C0399.m5877(C0387.m5385(), objM5682, new Object[]{C0379.m5038(false), null});
                                    try {
                                        itM5782 = C0397.m5782((ArrayList) C0060.m185(C0083.m446(C0392.m5600(C0391.m5580()), C0385.m5310(C0392.m5581()))));
                                    } catch (Exception e3) {
                                        C0078.m344(e3);
                                    }
                                } catch (Exception e4) {
                                    C0078.m344(e4);
                                }
                                while (true) {
                                    boolean zM5858 = C0398.m5858(itM5782);
                                    int i10 = 50689;
                                    while (true) {
                                        i10 ^= 50706;
                                        switch (i10) {
                                            case 19:
                                                i10 = zM5858 ? 50782 : 50751;
                                            case 45:
                                                break;
                                            case 50:
                                            case 76:
                                                Application application2 = (Application) C0398.m5850(itM5782);
                                                boolean zM5699 = C0395.m5699(C0078.m352(C0060.m194(application2)), C0393.m5661(applicationInfoM4846));
                                                int i11 = 50813;
                                                while (true) {
                                                    i11 ^= 50830;
                                                    switch (i11) {
                                                        case 18:
                                                        case 53:
                                                            Iterator itM57822 = C0397.m5782((ArrayList) C0060.m185(C0083.m446(C0392.m5600(application2), C0385.m5310(C0375.m4872()))));
                                                            while (true) {
                                                                boolean zM58582 = C0398.m5858(itM57822);
                                                                int i12 = 51712;
                                                                while (true) {
                                                                    i12 ^= 51729;
                                                                    switch (i12) {
                                                                        case 14:
                                                                        case 17:
                                                                            i12 = zM58582 ? 51805 : 51774;
                                                                        case 47:
                                                                            break;
                                                                        case 76:
                                                                            C0088.m571(application, (Application.ActivityLifecycleCallbacks) C0398.m5850(itM57822));
                                                                            int i13 = 51836;
                                                                            while (true) {
                                                                                i13 ^= 51853;
                                                                                switch (i13) {
                                                                                    case 241:
                                                                                        i13 = 52518;
                                                                                        break;
                                                                                    case 1963:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 243:
                                                            i11 = zM5699 ? 51557 : 50875;
                                                        case 4075:
                                                            int i14 = 51588;
                                                            while (true) {
                                                                i14 ^= 51605;
                                                                switch (i14) {
                                                                    case 17:
                                                                        i14 = 51619;
                                                                    case 54:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    this.mInitialApplication = application;
                                    C0393.m5655(C0370.m3310(), C0391.m5580(), m1252(this));
                                    C0121.m995(C0383.m5204(), application);
                                    int i15 = 52611;
                                    while (true) {
                                        i15 ^= 52628;
                                        switch (i15) {
                                            case 23:
                                                i15 = 52642;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 47483:
                        }
                    }
                }
            } catch (Throwable th) {
                int i16 = 1740;
                while (true) {
                    i16 ^= 1757;
                    switch (i16) {
                        case 17:
                            i16 = 1771;
                            break;
                        case 54:
                            throw th;
                    }
                }
            }
        }
    }

    /* renamed from: ۟ۡۨۥ, reason: not valid java name and contains not printable characters */
    public static String m1249(Object obj) {
        Object obj2 = "ۥ۠ۦ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 56569) {
                case 1709405:
                    return str;
                case 1709527:
                    if (C0025.m118() > 0) {
                        obj2 = "ۥ۠ۦ";
                    } else {
                        continue;
                    }
                case 1710392:
                    if (C0179.m1427() <= 0) {
                        str = null;
                    } else {
                        obj2 = "۟ۧ۟";
                        str = null;
                        continue;
                    }
                case 1711477:
                    if (C0155.m1294() >= 0) {
                        C0376.m4906();
                        obj2 = "ۥۧ۟";
                    } else {
                        obj2 = "ۧۥ۟";
                        continue;
                    }
                case 1728850:
                    if (C0384.m5278() <= 0) {
                        break;
                    } else if (C0379.m5056() <= 0) {
                        C0334.m2866();
                    } else {
                        obj2 = "۠ۦۦ";
                    }
                case 1729115:
                    break;
                case 1731132:
                    obj2 = "ۨۦۢ";
                    str = str2;
                    continue;
                case 1734489:
                    str2 = ((C0165) obj).processName;
                    if (C0399.m5914() <= 0) {
                        C0386.m5322();
                    } else {
                        obj2 = "ۣۥۧ";
                        continue;
                    }
                case 1735438:
                    obj2 = "۟ۦۥ";
                    continue;
                case 1735463:
                case 1735577:
                    if (C0228.m2012() <= 0) {
                        C0291.m2568();
                    } else {
                        obj2 = "ۨۦۢ";
                        continue;
                    }
            }
            obj2 = "ۦۡۧ";
        }
    }

    /* renamed from: ۟ۢۨۡ۠, reason: not valid java name and contains not printable characters */
    public static C0165 m1250(Object obj) {
        Object obj2 = "۟۟۠";
        C0165 c0165 = null;
        C0165 c01652 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 56381) {
                case 202:
                    if (C0073.m265() <= 0) {
                        C0391.m5571();
                    } else {
                        obj2 = "ۥۡۧ";
                        continue;
                    }
                case 1709270:
                    c01652 = ((C0152) obj).f221;
                    if (C0396.m5741() >= 0) {
                        C0399.m5914();
                    } else {
                        obj2 = "ۣۣۨ";
                        continue;
                    }
                case 1709429:
                    if (C0399.m5914() <= 0) {
                        C0383.m5203();
                        c0165 = c01652;
                    } else {
                        obj2 = "ۣۨۥ";
                        c0165 = c01652;
                        continue;
                    }
                case 1709431:
                    return c0165;
                case 1710591:
                    obj2 = "ۨ۟";
                    c0165 = null;
                    continue;
                case 1729014:
                case 1732384:
                    obj2 = "ۣۨۥ";
                    continue;
                case 1729019:
                    break;
                case 1731325:
                    if (C0082.m410() >= 0) {
                        C0396.m5741();
                    } else {
                        obj2 = "۟۟۠";
                        continue;
                    }
                case 1735485:
                    if (C0388.m5430() <= 0) {
                        break;
                    } else {
                        obj2 = "ۣۨ۠";
                    }
                case 1735651:
                    if (C0392.m5595() <= 0) {
                        obj2 = "ۧۢ";
                    } else {
                        obj2 = "ۧۥ۠";
                        continue;
                    }
            }
            if (C0384.m5278() <= 0) {
                C0397.m5814();
            } else {
                obj2 = "۟ۦۥ";
            }
        }
    }

    /* renamed from: ۣ۟ۢۦۣ, reason: not valid java name and contains not printable characters */
    public static Context m1251(Object obj, Object obj2) {
        Object obj3 = "ۨۥۢ";
        Context context = null;
        Context contextM1244 = null;
        while (true) {
            switch (C0395.m5690(obj3) ^ 1754473) {
                case 1221:
                    break;
                case 3267:
                    if (C0385.m5282() >= 0) {
                        obj3 = "۟۠ۨ";
                    } else {
                        obj3 = "ۤۨ۠";
                        continue;
                    }
                case 3308:
                    if (C0078.m361() < 0) {
                        break;
                    } else {
                        obj3 = "ۨ۠";
                    }
                case 3494:
                case 32693:
                    if (C0376.m4906() <= 0) {
                        obj3 = "ۣۥۧ";
                    } else {
                        obj3 = "۟۟۟";
                        continue;
                    }
                case 3512:
                    if (C0083.m448() >= 0) {
                        C0397.m5814();
                    } else {
                        obj3 = "ۨۥۢ";
                        continue;
                    }
                case 25494:
                    return context;
                case 27619:
                    if (C0389.m5481() <= 0) {
                        context = contextM1244;
                    } else {
                        obj3 = "۟۟۟";
                        context = contextM1244;
                        continue;
                    }
                case 29441:
                    obj3 = "ۦۨ";
                    continue;
                case 1710481:
                    contextM1244 = ((C0152) obj).m1244((ApplicationInfo) obj2);
                    if (C0377.m4944() <= 0) {
                        C0346.m3059();
                    } else {
                        obj3 = "ۡ۟ۨ";
                        continue;
                    }
                case 1710507:
                    obj3 = "ۨۦۨ";
                    context = null;
                    continue;
            }
            obj3 = "ۣۢۧ";
        }
    }

    /* renamed from: ۟ۤۦۣۡ, reason: not valid java name and contains not printable characters */
    public static Application m1252(Object obj) {
        Object obj2 = "۠۟۠";
        Application application = null;
        Application application2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1755560) {
                case 106:
                    if (C0398.m5833() <= 0) {
                        C0381.m5127();
                        application = null;
                    } else {
                        obj2 = "ۣ۠ۨ";
                        application = null;
                        continue;
                    }
                case 229:
                    if (C0375.m4840() >= 0) {
                        C0397.m5814();
                    } else {
                        obj2 = "ۨۧۡ";
                        continue;
                    }
                case 236:
                    break;
                case 25131:
                    if (C0346.m3059() >= 0) {
                        C0388.m5430();
                        obj2 = "ۡۢۨ";
                        application = application2;
                    } else {
                        obj2 = "۟ۤۥ";
                        application = application2;
                        continue;
                    }
                case 25271:
                    application2 = ((C0152) obj).mInitialApplication;
                    if (C0086.m500() <= 0) {
                        C0397.m5814();
                    } else {
                        obj2 = "۠ۥۨ";
                        continue;
                    }
                case 25449:
                    if (C0228.m2012() <= 0) {
                        break;
                    } else if (C0398.m5833() <= 0) {
                        C0086.m500();
                        obj2 = "ۧۤ۠";
                    } else {
                        obj2 = "۠ۢۡ";
                    }
                case 26376:
                case 1709453:
                    if (C0384.m5278() > 0) {
                        obj2 = "۟ۤۥ";
                    } else {
                        continue;
                    }
                case 26479:
                    obj2 = "۠۟۠";
                    continue;
                case 28168:
                    return application;
                case 32643:
                    if (C0384.m5278() <= 0) {
                        C0228.m2012();
                    } else {
                        obj2 = "ۡۦ";
                        continue;
                    }
            }
            obj2 = "ۣۨۨ";
        }
    }

    /* renamed from: ۣ۟ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static C0152 m1253() {
        String str = "ۣۧۢ";
        C0152 c0152 = null;
        C0152 c01522 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748671) {
                case 446:
                    break;
                case 1287:
                    return c0152;
                case 1435:
                    str = "ۣۧۢ";
                    continue;
                case 1702:
                    if (C0397.m5814() <= 0) {
                        c0152 = null;
                    } else {
                        str = "ۤۨ۠";
                        c0152 = null;
                        continue;
                    }
                case 2461:
                case 27899:
                    if (C0396.m5741() >= 0) {
                        str = "۟ۢۨ";
                    } else {
                        str = "۠ۧ۟";
                        continue;
                    }
                case 4891:
                    c01522 = f219;
                    if (C0086.m500() <= 0) {
                        C0420.m6215();
                    } else {
                        str = "ۤۢۥ";
                        continue;
                    }
                case 5219:
                    if (C0375.m4840() >= 0) {
                        C0088.m573();
                    } else {
                        str = "ۣ۟۠";
                        continue;
                    }
                case 5272:
                    if (C0362.m3122() >= 0) {
                        str = "ۡۡۤ";
                        c0152 = c01522;
                    } else {
                        str = "۠ۧ۟";
                        c0152 = c01522;
                        continue;
                    }
                case 6359:
                    if (C0089.m592() <= 0) {
                        C0179.m1427();
                    } else {
                        str = "۟ۨۢ";
                        continue;
                    }
                case 27449:
                    if (C0370.m3284() >= 0) {
                        break;
                    } else {
                        str = "ۥ۠۟";
                    }
            }
            if (C0206.m1807() >= 0) {
                C0362.m3122();
                str = "ۤ۠ۧ";
            } else {
                str = "ۣۢۧ";
            }
        }
    }

    /* renamed from: ۟ۥۣۨۨ, reason: not valid java name and contains not printable characters */
    public static void m1254(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = "ۨۤ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746907) {
                case 88:
                    return;
                case 218:
                case 25265:
                    str = "ۣ۟ۧ";
                    continue;
                case 3239:
                    if (C0420.m6215() >= 0) {
                        str = "ۡۧۤ";
                    } else {
                        str = "۟۟ۡ";
                        continue;
                    }
                case 4604:
                    ((C0152) obj).m1246((String) obj2, (String) obj3, (ConditionVariable) obj4);
                    if (C0334.m2866() <= 0) {
                        C0391.m5571();
                        str = "ۡۨۤ";
                    } else {
                        str = "ۣ۟ۧ";
                        continue;
                    }
                case 5438:
                    break;
                case 25299:
                    if (C0279.m2491() < 0) {
                        str = "ۨۤ۠";
                    } else {
                        continue;
                    }
                case 28351:
                    if (C0381.m5127() <= 0) {
                        break;
                    } else if (C0375.m4840() < 0) {
                        str = "ۣ۠ۤ";
                    }
            }
            if (C0078.m361() <= 0) {
                C0191.m1627();
                str = "۠ۧۦ";
            } else {
                str = "۠ۥۡ";
            }
        }
    }

    /* renamed from: ۟ۥۣۧۧ, reason: not valid java name and contains not printable characters */
    public static List m1255(Object obj) {
        String str = "ۦۣۨ";
        List<ProviderInfo> list = null;
        List<ProviderInfo> list2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753631) {
                case 64:
                case 3034:
                    str = "ۣۨۦ";
                    continue;
                case 122:
                    str = "ۦۣۨ";
                    continue;
                case 980:
                    if (C0376.m4906() <= 0) {
                        break;
                    } else if (C0279.m2491() >= 0) {
                        C0121.m1023();
                    } else {
                        str = "ۧ۠ۦ";
                    }
                case 1842:
                    list2 = ((C0165) obj).f232;
                    if (C0397.m5814() <= 0) {
                        C0073.m265();
                        str = "۠۟۠";
                    } else {
                        str = "۟ۧۨ";
                        continue;
                    }
                case 2900:
                    return list;
                case 27167:
                    str = "ۣۨۦ";
                    list = list2;
                    continue;
                case 27799:
                    str = "ۢۨۢ";
                    continue;
                case 28995:
                    str = "ۣۡ۠";
                    list = null;
                    continue;
                case 29023:
                    break;
                case 29789:
                    if (C0362.m3122() < 0) {
                        str = "ۨۧۤ";
                    } else {
                        continue;
                    }
            }
            str = "ۡ۟ۦ";
        }
    }

    /* renamed from: ۠۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m1256(Object obj, Object obj2, Object obj3) {
        String str = "۟ۡۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56321) {
                case 1709385:
                    break;
                case 1710383:
                    if (C0179.m1427() <= 0) {
                        C0155.m1294();
                    } else {
                        str = "۟ۡۦ";
                        continue;
                    }
                case 1710624:
                    str = "ۡۢ۟";
                    continue;
                case 1731324:
                    return;
                case 1733343:
                case 1734337:
                    str = "ۣۧۡ";
                    continue;
                case 1735493:
                    if (C0400.m5961() < 0) {
                        break;
                    } else {
                        str = C0391.m5571() <= 0 ? "۟ۡ" : "۟ۢ۟";
                    }
                case 1735517:
                    ((C0152) obj).m1248((String) obj2, (String) obj3);
                    if (C0025.m118() <= 0) {
                        C0386.m5322();
                        str = "ۥۤۨ";
                    } else {
                        str = "ۣۧۡ";
                        continue;
                    }
            }
            if (C0388.m5430() <= 0) {
                C0083.m448();
                str = "ۣۣۦ";
            } else {
                str = "ۧۨۢ";
            }
        }
    }

    /* renamed from: ۢۤ۟۟, reason: not valid java name and contains not printable characters */
    public static List m1257(Object obj) {
        Object obj2 = "ۡۢ۟";
        List<ProviderInfo> list = null;
        List<ProviderInfo> list2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1754441) {
                case 27243:
                    obj2 = "ۥۨۦ";
                    list = null;
                    continue;
                case 27543:
                    if (C0395.m5698() > 0) {
                        break;
                    } else if (C0399.m5914() <= 0) {
                        C0362.m3122();
                    } else {
                        obj2 = "ۢۡ۠";
                    }
                case 27574:
                    obj2 = "ۣۤۡ";
                    list = list2;
                    continue;
                case 27624:
                case 1710548:
                    if (C0395.m5698() >= 0) {
                        obj2 = "ۤۥۨ";
                    } else {
                        obj2 = "ۣۤۡ";
                        continue;
                    }
                case 30664:
                    list2 = ((C0152) obj).f220;
                    if (C0381.m5127() <= 0) {
                        C0086.m500();
                    } else {
                        obj2 = "ۣۡۡ";
                        continue;
                    }
                case 31540:
                    break;
                case 31593:
                    obj2 = "ۡۤۥ";
                    continue;
                case 31722:
                    if (C0228.m2012() <= 0) {
                        C0394.m5672();
                        obj2 = "۟ۥۦ";
                    } else {
                        obj2 = "ۥۢ";
                        continue;
                    }
                case 32591:
                    return list;
                case 32747:
                    if (C0382.m5180() > 0) {
                        obj2 = "ۡۢ۟";
                    } else {
                        continue;
                    }
            }
            if (C0164.m1359() < 0) {
                obj2 = "ۥۤ۟";
            }
        }
    }

    /* renamed from: ۣۤۧۨ, reason: not valid java name and contains not printable characters */
    public static ApplicationInfo m1258(Object obj) {
        String str = "ۤۡۧ";
        ApplicationInfo applicationInfo = null;
        ApplicationInfo applicationInfo2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56568) {
                case 216:
                    if (C0394.m5672() <= 0) {
                        applicationInfo = null;
                    } else {
                        str = "ۡۡۧ";
                        applicationInfo = null;
                        continue;
                    }
                case 253:
                case 1731108:
                    if (C0089.m592() <= 0) {
                        C0400.m5961();
                    } else {
                        str = "ۣۧ۟";
                        continue;
                    }
                case 1711838:
                    applicationInfo2 = ((C0165) obj).f231;
                    str = "ۢۦ۟";
                    continue;
                case 1730290:
                    if (C0362.m3122() >= 0) {
                        break;
                    } else if (C0228.m2012() <= 0) {
                        C0377.m4944();
                        str = "ۥۥۣ";
                    } else {
                        str = "ۦۦۦ";
                    }
                case 1731075:
                    return applicationInfo;
                case 1732579:
                    str = "ۣۧ۟";
                    applicationInfo = applicationInfo2;
                    continue;
                case 1733183:
                    if (C0388.m5430() <= 0) {
                        str = "ۢۧۤ";
                    } else {
                        str = "۠ۥ";
                        continue;
                    }
                case 1733233:
                    if (C0396.m5741() < 0) {
                        str = "ۤۡۧ";
                    } else {
                        continue;
                    }
                case 1735527:
                    if (C0420.m6215() < 0) {
                        str = "ۡۡ";
                    } else {
                        continue;
                    }
                case 1735613:
                    break;
            }
            if (C0184.m1524() >= 0) {
                C0184.m1524();
                str = "ۦۡ۟";
            } else {
                str = "۟ۤۤ";
            }
        }
    }

    /* renamed from: ۣۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m1259(Object obj) {
        String str = "ۤ۠ۡ";
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749794) {
                case 2557:
                    str = "ۦۦۧ";
                    obj2 = null;
                    continue;
                case 2559:
                    obj3 = ((C0165) obj).f233;
                    if (C0386.m5322() <= 0) {
                        C0383.m5203();
                        str = "ۥۦ";
                    } else {
                        str = "ۥۤۧ";
                        continue;
                    }
                case 2759:
                    if (C0060.m216() <= 0) {
                        break;
                    } else if (C0393.m5668() <= 0) {
                        C0229.m2064();
                    } else {
                        str = "ۤۨۡ";
                    }
                case 3338:
                    if (C0420.m6215() >= 0) {
                        C0078.m361();
                        obj2 = obj3;
                    } else {
                        str = "۠ۡ";
                        obj2 = obj3;
                        continue;
                    }
                case 3339:
                    if (C0082.m410() >= 0) {
                        C0009.m36();
                    } else {
                        str = "ۤ۠ۡ";
                        continue;
                    }
                case 3749:
                    if (C0334.m2866() <= 0) {
                        str = "ۣۢۨ";
                    } else {
                        str = "ۣۤۨ";
                        continue;
                    }
                case 5375:
                case 30369:
                    if (C0399.m5914() > 0) {
                        str = "۠ۡ";
                    } else {
                        continue;
                    }
                case 6176:
                    break;
                case 28933:
                    if (C0025.m118() <= 0) {
                        C0083.m448();
                        str = "ۤۧ";
                    } else {
                        str = "۟ۦۤ";
                        continue;
                    }
                case 1732387:
                    return obj2;
            }
            if (C0346.m3059() < 0) {
                str = "ۥ۟ۡ";
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public void m1260(final String str, final String str2) {
        final ConditionVariable conditionVariable = null;
        String str3 = "ۨۥ۠";
        while (true) {
            switch (C0395.m5690((Object) str3) ^ 56476) {
                case 254:
                    if (C0389.m5481() <= 0) {
                        str3 = "۠۠ۧ";
                    } else {
                        str3 = "۠ۥۨ";
                        continue;
                    }
                case 1917:
                    C0088.m558(new Handler(C0399.m5866()), new Runnable(this, str, str2, conditionVariable) { // from class: com.cloudinject.core.̗.-$$Lambda$̗$qY3X1rVfzPcou9swaJcIInQmOXI
                        private final C0152 f$0;
                        private final String f$1;
                        private final String f$2;
                        private final ConditionVariable f$3;

                        {
                            String str4 = "ۣۤۦ";
                            while (true) {
                                switch (C0395.m5690((Object) str4) ^ 1751617) {
                                    case 6:
                                        this.f$0 = this;
                                        if (C0394.m5672() > 0) {
                                            str4 = "ۣۢۤ";
                                            break;
                                        } else {
                                            C0291.m2568();
                                            break;
                                        }
                                    case 2208:
                                        this.f$1 = str;
                                        if (C0378.m4998() <= 0) {
                                            break;
                                        } else {
                                            str4 = "ۧ۟ۡ";
                                            break;
                                        }
                                    case 3233:
                                        this.f$3 = conditionVariable;
                                        if (C0060.m216() > 0) {
                                            str4 = "۟ۧۤ";
                                            break;
                                        } else {
                                            C0334.m2866();
                                            break;
                                        }
                                    case 7613:
                                        return;
                                    case 32584:
                                        this.f$2 = str2;
                                        str4 = "ۣۦۣ";
                                        break;
                                    case 1730243:
                                        if (C0395.m5698() >= 0) {
                                            break;
                                        } else {
                                            str4 = "ۣۤۦ";
                                            break;
                                        }
                                }
                            }
                        }

                        /* renamed from: ۥ۟ۦۡ, reason: contains not printable characters */
                        public static ConditionVariable m1202(Object obj) {
                            String str4 = "ۣۣ۠";
                            ConditionVariable conditionVariable2 = null;
                            ConditionVariable conditionVariable3 = null;
                            while (true) {
                                switch (C0395.m5690((Object) str4) ^ 1752614) {
                                    case 973:
                                        if (C0397.m5814() <= 0) {
                                            C0376.m4906();
                                        } else {
                                            str4 = "ۦۣ";
                                            continue;
                                        }
                                    case 1178:
                                        str4 = "ۥۢۨ";
                                        conditionVariable2 = null;
                                        continue;
                                    case 1211:
                                        break;
                                    case 2214:
                                        if (C0088.m573() < 0) {
                                            break;
                                        } else if (C0397.m5814() <= 0) {
                                            C0383.m5203();
                                        } else {
                                            str4 = "ۨۢۧ";
                                        }
                                    case 3136:
                                        str4 = "ۨ۟ۨ";
                                        conditionVariable2 = conditionVariable3;
                                        continue;
                                    case 4355:
                                        str4 = "ۣۣ۠";
                                        continue;
                                    case 6628:
                                    case 1729179:
                                        if (C0191.m1627() >= 0) {
                                            C0400.m5961();
                                            str4 = "۟ۥ";
                                        } else {
                                            str4 = "ۨ۟ۨ";
                                            continue;
                                        }
                                    case 30455:
                                        return conditionVariable2;
                                    case 30475:
                                        conditionVariable3 = (($$Lambda$$qY3X1rVfzPcou9swaJcIInQmOXI) obj).f$3;
                                        str4 = "ۢ۠ۤ";
                                        continue;
                                    case 30597:
                                        if (C0397.m5814() <= 0) {
                                            C0088.m573();
                                            str4 = "ۨۡ";
                                        } else {
                                            str4 = "ۤۧ۟";
                                            continue;
                                        }
                                }
                                if (C0382.m5180() <= 0) {
                                    C0392.m5595();
                                } else {
                                    str4 = "ۨۦۡ";
                                }
                            }
                        }

                        /* renamed from: ۥ۠۠۟, reason: contains not printable characters */
                        public static C0152 m1203(Object obj) {
                            String str4 = "ۥۣۤ";
                            C0152 c0152 = null;
                            C0152 c01522 = null;
                            while (true) {
                                switch (C0395.m5690(str4) ^ 1750779) {
                                    case 26:
                                        if (C0388.m5430() <= 0) {
                                            C0400.m5961();
                                            str4 = "ۥۡۥ";
                                        } else {
                                            str4 = "ۥۣۤ";
                                            continue;
                                        }
                                    case 178:
                                        return c0152;
                                    case 2271:
                                        if (C0291.m2568() > 0) {
                                            break;
                                        } else {
                                            str4 = C0279.m2491() >= 0 ? "ۡۥۦ" : "ۨ۠ۧ";
                                        }
                                    case 3166:
                                        if (C0396.m5741() >= 0) {
                                            C0381.m5127();
                                            c0152 = c01522;
                                        } else {
                                            str4 = "ۣۡۧ";
                                            c0152 = c01522;
                                            continue;
                                        }
                                    case 3326:
                                    case 4537:
                                        str4 = "ۣۡۧ";
                                        continue;
                                    case 29489:
                                        break;
                                    case 29623:
                                        if (C0394.m5672() <= 0) {
                                            C0384.m5278();
                                        } else {
                                            str4 = "ۢۢ";
                                            continue;
                                        }
                                    case 30652:
                                        str4 = "۟ۡۤ";
                                        continue;
                                    case 32276:
                                        c01522 = (($$Lambda$$qY3X1rVfzPcou9swaJcIInQmOXI) obj).f$0;
                                        if (C0025.m118() > 0) {
                                            str4 = "ۤۦۧ";
                                        } else {
                                            continue;
                                        }
                                    case 1731259:
                                        str4 = "ۦ۟۠";
                                        c0152 = null;
                                        continue;
                                }
                                if (C0009.m36() >= 0) {
                                    C0397.m5814();
                                } else {
                                    str4 = "ۧۡۦ";
                                }
                            }
                        }

                        /* renamed from: ۦۣۤۥ, reason: contains not printable characters */
                        public static String m1204(Object obj) {
                            String str4 = "۟ۦۡ";
                            String str5 = null;
                            String str6 = null;
                            while (true) {
                                switch (C0395.m5690((Object) str4) ^ 1750564) {
                                    case 3084:
                                        break;
                                    case 4574:
                                    case 29455:
                                        if (C0381.m5127() > 0) {
                                            str4 = "ۣۤ";
                                        } else {
                                            continue;
                                        }
                                    case 4606:
                                        if (C0009.m36() >= 0) {
                                            break;
                                        } else if (C0155.m1294() >= 0) {
                                            C0377.m4944();
                                        } else {
                                            str4 = "ۦۦۣ";
                                        }
                                    case 29570:
                                        if (C0391.m5571() <= 0) {
                                            C0183.m1464();
                                            str4 = "ۨۥۣ";
                                            str5 = null;
                                        } else {
                                            str4 = "ۦۣۤ";
                                            str5 = null;
                                            continue;
                                        }
                                    case 29703:
                                        str6 = (($$Lambda$$qY3X1rVfzPcou9swaJcIInQmOXI) obj).f$1;
                                        str4 = "ۦۡ۟";
                                        continue;
                                    case 29765:
                                        if (C0346.m3059() < 0) {
                                            str4 = "ۣۧۤ";
                                        } else {
                                            continue;
                                        }
                                    case 30624:
                                        if (C0394.m5672() <= 0) {
                                            str5 = str6;
                                        } else {
                                            str4 = "ۣۤ";
                                            str5 = str6;
                                            continue;
                                        }
                                    case 30657:
                                        if (C0388.m5430() > 0) {
                                            str4 = "ۧ۠ۤ";
                                        } else {
                                            continue;
                                        }
                                    case 32489:
                                        if (C0393.m5668() <= 0) {
                                            C0164.m1359();
                                            str4 = "ۧۦ";
                                        } else {
                                            str4 = "۟ۦۡ";
                                            continue;
                                        }
                                    case 1731141:
                                        return str5;
                                }
                                str4 = "ۦۣۨ";
                            }
                        }

                        /* renamed from: ۧۡۥۥ, reason: not valid java name and contains not printable characters */
                        public static String m1205(Object obj) {
                            String str4 = "ۥ۟ۢ";
                            String str5 = null;
                            String str6 = null;
                            while (true) {
                                switch (C0395.m5690((Object) str4) ^ 1747742) {
                                    case 4514:
                                    case 6586:
                                        str4 = "ۥۦۡ";
                                        continue;
                                    case 5502:
                                        return str5;
                                    case 5782:
                                        if (C0228.m2012() <= 0) {
                                            break;
                                        } else {
                                            str4 = "ۣۤۡ";
                                        }
                                    case 6270:
                                        str4 = "ۣۡۧ";
                                        continue;
                                    case 7511:
                                        if (C0389.m5481() <= 0) {
                                            C0387.m5374();
                                            str4 = "ۡ۟ۧ";
                                            str5 = null;
                                        } else {
                                            str4 = "ۨۤۡ";
                                            str5 = null;
                                            continue;
                                        }
                                    case 7576:
                                        if (C0393.m5668() > 0) {
                                            str4 = "ۥ۟ۢ";
                                        } else {
                                            continue;
                                        }
                                    case 7614:
                                        str6 = (($$Lambda$$qY3X1rVfzPcou9swaJcIInQmOXI) obj).f$2;
                                        if (C0121.m1023() >= 0) {
                                            str4 = "ۥۤۡ";
                                        } else {
                                            str4 = "ۦ۟ۨ";
                                            continue;
                                        }
                                    case 25211:
                                        if (C0397.m5814() <= 0) {
                                            C0369.m3256();
                                        } else {
                                            str4 = "ۤۧ۟";
                                            continue;
                                        }
                                    case 25559:
                                        break;
                                    case 27217:
                                        str4 = "ۥۦۡ";
                                        str5 = str6;
                                        continue;
                                }
                                if (C0184.m1524() >= 0) {
                                    C0400.m5961();
                                    str4 = "ۤۢ";
                                } else {
                                    str4 = "ۢۨۦ";
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str4 = "ۣۡۧ";
                            while (true) {
                                switch (C0395.m5690((Object) str4) ^ 1755368) {
                                    case 2337:
                                        if (C0086.m500() <= 0) {
                                            break;
                                        } else {
                                            str4 = "ۣۡۧ";
                                            break;
                                        }
                                    case 26605:
                                        C0391.m5578(m1203(this), m1204(this), m1205(this), m1202(this));
                                        if (C0334.m2866() > 0) {
                                            str4 = "ۡۡ";
                                            break;
                                        } else {
                                            C0370.m3284();
                                            break;
                                        }
                                    case 1709256:
                                        return;
                                }
                            }
                        }
                    });
                    str3 = "ۢۨۢ";
                    continue;
                case 1709168:
                    return;
                case 1709343:
                    if (C0368.m3181() == C0399.m5866()) {
                        break;
                    } else if (C0184.m1524() < 0) {
                        str3 = "ۧۤۡ";
                    }
                case 1710392:
                    conditionVariable = new ConditionVariable();
                    if (C0395.m5698() >= 0) {
                        str3 = "۠ۤۥ";
                    } else {
                        str3 = "۟۠";
                        continue;
                    }
                case 1710778:
                case 1734431:
                    if (C0086.m500() > 0) {
                        str3 = "ۨ۠ۤ";
                    } else {
                        continue;
                    }
                case 1729881:
                    m1256(this, str, str2);
                    if (C0396.m5741() >= 0) {
                        str3 = "ۣۣۨ";
                    } else {
                        str3 = "ۨ۠ۤ";
                        continue;
                    }
                case 1732544:
                    C0164.m1341(conditionVariable);
                    if (C0155.m1294() >= 0) {
                        C0382.m5180();
                    } else {
                        str3 = "ۣۥ";
                        continue;
                    }
                case 1733183:
                    str3 = "ۨۥ۠";
                    continue;
                case 1734466:
                    break;
            }
            if (C0228.m2012() <= 0) {
                C0073.m265();
                str3 = "ۣۦۧ";
            } else {
                str3 = "ۤ۟۠";
            }
        }
    }

    /* renamed from: ̗̙̖̖̙̗, reason: not valid java name and contains not printable characters */
    public boolean m1261() {
        String str = "ۦۥ۟";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751554) {
                case 227:
                    if (C0206.m1807() >= 0) {
                        C0393.m5668();
                        str = "ۡۧۦ";
                        z = false;
                    } else {
                        str = "ۨۤ";
                        z = false;
                        continue;
                    }
                case 1030:
                case 1730269:
                    str = "ۨۤ";
                    continue;
                case 1059:
                    if (C0368.m3171() >= 0) {
                        C0377.m4944();
                    } else {
                        str = "ۤۨۥ";
                        continue;
                    }
                case 2236:
                    if (C0420.m6215() >= 0) {
                        str = "۟۟ۤ";
                        z = z2;
                    } else {
                        str = "ۦ۠";
                        z = z2;
                        continue;
                    }
                case 2305:
                    if (C0370.m3284() >= 0) {
                        C0392.m5595();
                    } else {
                        str = "ۦۥ۟";
                        continue;
                    }
                case 29483:
                    z2 = true;
                    if (C0396.m5741() < 0) {
                        str = "ۣۢ۟";
                    } else {
                        continue;
                    }
                case 30722:
                    if (m1250(this) == null) {
                        break;
                    } else {
                        str = "ۣۨۢ";
                    }
                case 32619:
                    break;
                case 1730232:
                    str = "ۥۣۢ";
                    continue;
                case 1730302:
                    return z;
            }
            if (C0384.m5278() <= 0) {
                C0377.m4944();
            } else {
                str = "ۥۤ۠";
            }
        }
    }
}
