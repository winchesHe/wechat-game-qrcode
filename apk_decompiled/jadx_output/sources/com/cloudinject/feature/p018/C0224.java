package com.cloudinject.feature.p018;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.graphics.drawable.Drawable;
import android.net.C0082;
import android.net.C0083;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.feature.p023.p024.AbstractC0307;
import com.cloudinject.feature.p023.p024.InterfaceC0306;
import com.cloudinject.p025.C0362;
import com.facebook.stetho.server.http.HttpStatus;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
import mirrorb.android.net.wifi.C0388;
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

/* renamed from: com.cloudinject.feature.̗̗.̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0224 {
    public static final String TAG = "DrawableManager";

    /* renamed from: ̗̗̖̗̗̖̙, reason: not valid java name and contains not printable characters */
    private static C0224 f371;

    public static /* synthetic */ void lambda$JJJzMkMx_FBpskpNv5OAxSbFJ3U(C0224 c0224, String str, AbstractC0307 abstractC0307) {
        String str2 = "ۢۨۢ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1754502) {
                case 30396:
                    return;
                case 30426:
                    m1952(c0224, str, abstractC0307);
                    str2 = "ۢۧ۟";
                    break;
                case 1710364:
                    str2 = "ۢۨۢ";
                    break;
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    static /* synthetic */ Drawable m1947(C0224 c0224, File file) {
        String str = "ۣۨۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749730) {
                case 7584:
                    if (C0089.m592() <= 0) {
                        break;
                    } else {
                        str = "ۣۨۧ";
                        break;
                    }
                case 31662:
                    return m1951(c0224, file);
            }
        }
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    private Drawable m1948(File file) {
        String str = "ۧۧۥ";
        Drawable drawableM193 = null;
        FileInputStream fileInputStream = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754597) {
                case 992:
                    if (C0377.m4944() <= 0) {
                        break;
                    } else {
                        str = "ۨۥ۠";
                        break;
                    }
                case 1152:
                    if (C0025.m118() <= 0) {
                        break;
                    } else {
                        str = "ۨۧۡ";
                        break;
                    }
                case 1165:
                    str = "ۧۧۥ";
                    break;
                case 3111:
                    return drawableM193;
                case 3174:
                    fileInputStream = new FileInputStream(file);
                    str = "ۨۤۥ";
                    break;
                case 3212:
                    try {
                        drawableM193 = C0060.m193(fileInputStream, C0397.m5779(file));
                        str = "ۨۧۡ";
                        break;
                    } catch (IOException e) {
                        return null;
                    }
                case 30340:
                    str = "ۨۥ۠";
                    break;
            }
        }
    }

    /* renamed from: ̗̖̗̖̙̗, reason: not valid java name and contains not printable characters */
    public static C0224 m1949() {
        C0224 c0224M1953 = m1953();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = c0224M1953 == null ? 1709 : 1678;
                case 204:
                    synchronized (C0224.class) {
                        try {
                            C0224 c0224M19532 = m1953();
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = c0224M19532 == null ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case HttpStatus.HTTP_INTERNAL_SERVER_ERROR /* 500 */:
                                        f371 = new C0224();
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
        return m1953();
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    private /* synthetic */ void m1950(String str, AbstractC0307 abstractC0307) {
        C0221 c0221 = null;
        String str2 = "ۥ۠ۤ";
        File file = null;
        boolean z = false;
        String str3 = null;
        String strM5919 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1749825) {
                case 69:
                    try {
                    } catch (Exception e) {
                        C0381.m5110(abstractC0307, new Exception(C0385.m5310(C0086.m513())));
                        if (C0391.m5571() > 0) {
                            str2 = "ۨۡۨ";
                        }
                    }
                    if (C0420.m6220(file) <= 0) {
                        break;
                    } else if (C0088.m573() <= 0) {
                        C0397.m5814();
                        str2 = "ۧ۟ۢ";
                    } else {
                        str2 = "ۣۣۢ";
                    }
                case 387:
                    if (((C0380.m5072() - 30) - C0395.m5714(file)) + 30 >= 259200000) {
                        break;
                    } else {
                        str2 = "ۣۧۢ";
                    }
                case 453:
                    File file2 = new File(C0379.m5047(C0229.m2043()), C0206.m1806(str));
                    if (C0025.m118() <= 0) {
                        str2 = "ۦۣۨ";
                        file = file2;
                    } else {
                        str2 = "ۡ۟ۡ";
                        file = file2;
                        continue;
                    }
                case 1117:
                    String strM5310 = C0385.m5310(C0388.m5442());
                    if (C0386.m5322() <= 0) {
                        str3 = strM5310;
                    } else {
                        str2 = "ۡۤ۟";
                        str3 = strM5310;
                        continue;
                    }
                case 1119:
                    C0221 c02212 = new C0221(this, abstractC0307, file);
                    if (C0383.m5203() <= 0) {
                        c0221 = c02212;
                    } else {
                        str2 = "ۣۤۦ";
                        c0221 = c02212;
                        continue;
                    }
                case 1476:
                    C0009.m31(str3, C0385.m5310(C0228.m2013()));
                    str2 = "ۨۨ";
                    continue;
                case 1508:
                    C0395.m5685(str, strM5919, 0, c0221);
                    if (C0086.m500() > 0) {
                        str2 = "ۣۧۨ";
                    } else {
                        continue;
                    }
                case 2524:
                case 6147:
                case 31310:
                    if (C0395.m5698() < 0) {
                        str2 = "ۥۦۨ";
                    } else {
                        continue;
                    }
                case 2526:
                    if (C0420.m6215() >= 0) {
                        C0089.m592();
                        str2 = "ۨۤۡ";
                    } else {
                        str2 = "ۣۧۨ";
                        continue;
                    }
                case 3366:
                    return;
                case 3522:
                    if (C0377.m4944() <= 0) {
                        str2 = "ۥ۠۟";
                    } else {
                        str2 = "ۥ۠ۤ";
                        continue;
                    }
                case 3816:
                    if (C0155.m1294() < 0) {
                        str2 = "ۣۢۡ";
                    } else {
                        continue;
                    }
                case 6298:
                    if (C0334.m2866() > 0) {
                        str2 = "ۣۨۡ";
                    } else {
                        continue;
                    }
                case 6529:
                    if (C0086.m500() > 0) {
                        str2 = "ۤۦ۟";
                    } else {
                        continue;
                    }
                case 7261:
                    if (!z) {
                        break;
                    } else if (C0379.m5056() <= 0) {
                        C0082.m410();
                    } else {
                        str2 = "ۢۥۧ";
                    }
                case 7614:
                    str2 = "ۣۣۨ";
                    strM5919 = C0400.m5919(file);
                    continue;
                case 7618:
                    boolean zM5061 = C0379.m5061(file);
                    if (C0228.m2012() <= 0) {
                        C0382.m5180();
                        z = zM5061;
                    } else {
                        str2 = "ۣۨۡ";
                        z = zM5061;
                        continue;
                    }
                case 7624:
                    if (C0179.m1427() <= 0) {
                        str2 = "ۥۤ۟";
                    } else {
                        str2 = "ۣۢۡ";
                        continue;
                    }
                case 30051:
                    str2 = "ۣ۠ۥ";
                    continue;
                case 30377:
                    str2 = "ۢۥۧ";
                    continue;
                case 30407:
                    C0009.m31(str3, C0385.m5310(C0388.m5423()));
                    str2 = "ۨۡ";
                    continue;
                case 31463:
                    break;
                case 1732161:
                    C0086.m529(file);
                    str2 = "ۣۡۡ";
                    continue;
                case 1732536:
                    C0397.m5773(abstractC0307, m1951(this, file));
                    str2 = "۠۟۟";
                    continue;
            }
            str2 = "ۣۣۥ";
        }
    }

    /* renamed from: ۟۠۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static Drawable m1951(Object obj, Object obj2) {
        String str = "ۣۡ۠";
        Drawable drawable = null;
        Drawable drawableM1948 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753546) {
                case 1242:
                    str = "ۣۡۧ";
                    drawable = drawableM1948;
                    continue;
                case 2029:
                    str = "۟ۦۥ";
                    drawable = null;
                    continue;
                case 26132:
                    if (C0396.m5741() >= 0) {
                        C0380.m5068();
                    } else {
                        str = "ۥۤۥ";
                        continue;
                    }
                case 26281:
                    str = "ۣۡ۠";
                    continue;
                case 28468:
                    if (C0397.m5814() <= 0) {
                        break;
                    } else if (C0391.m5571() <= 0) {
                        C0086.m500();
                        str = "ۣۧ۟";
                    } else {
                        str = "ۢۢ";
                    }
                case 29583:
                    break;
                case 30595:
                    return drawable;
                case 31791:
                    if (C0385.m5282() >= 0) {
                        str = "ۣۤ۠";
                    } else {
                        str = "ۧۨۨ";
                        continue;
                    }
                case 32623:
                case 32748:
                    if (C0370.m3284() >= 0) {
                        C0121.m1023();
                    } else {
                        str = "ۣۡۧ";
                        continue;
                    }
                case 1711498:
                    drawableM1948 = ((C0224) obj).m1948((File) obj2);
                    str = "ۧ۟ۨ";
                    continue;
            }
            str = "ۥۢۢ";
        }
    }

    /* renamed from: ۟ۦۦۡ۟, reason: not valid java name and contains not printable characters */
    public static void m1952(Object obj, Object obj2, Object obj3) {
        String str = "ۥۦ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56387) {
                case 1709422:
                    return;
                case 1710382:
                    if (C0083.m448() >= 0) {
                        C0362.m3122();
                    } else {
                        str = "ۥۦ۟";
                        continue;
                    }
                case 1729035:
                    ((C0224) obj).m1950((String) obj2, (AbstractC0307) obj3);
                    str = "ۨۢۧ";
                    continue;
                case 1729053:
                    if (C0389.m5481() <= 0) {
                        break;
                    } else if (C0381.m5127() <= 0) {
                        C0392.m5595();
                        str = "ۦۥۦ";
                    } else {
                        str = "ۥۥۨ";
                    }
                case 1733346:
                case 1733496:
                    str = "ۨۢۧ";
                    continue;
                case 1734652:
                    break;
                case 1735650:
                    if (C0009.m36() < 0) {
                        str = "ۡۥ۟";
                    } else {
                        continue;
                    }
            }
            str = C0388.m5430() <= 0 ? "۟ۢۢ" : "۟ۤۦ";
        }
    }

    /* renamed from: ۣۨۥ۠, reason: not valid java name and contains not printable characters */
    public static C0224 m1953() {
        String str = "ۧۢۢ";
        C0224 c0224 = null;
        C0224 c02242 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753541) {
                case 6:
                    str = "ۨۢۥ";
                    c0224 = null;
                    continue;
                case 1026:
                    break;
                case 1186:
                    if (C0089.m592() < 0) {
                        break;
                    } else {
                        str = "ۥۡۦ";
                    }
                case 2178:
                    str = "ۧۢۢ";
                    continue;
                case 2286:
                    if (C0384.m5278() <= 0) {
                        C0377.m4944();
                    } else {
                        str = "ۤۦۨ";
                        continue;
                    }
                case 27205:
                    if (C0082.m410() >= 0) {
                        C0376.m4906();
                    } else {
                        str = "ۦۣ۠";
                        continue;
                    }
                case 29381:
                case 31587:
                    if (C0381.m5127() > 0) {
                        str = "ۣۡۥ";
                    } else {
                        continue;
                    }
                case 30594:
                    return c0224;
                case 31759:
                    c02242 = f371;
                    if (C0379.m5056() > 0) {
                        str = "ۥۦۡ";
                    } else {
                        continue;
                    }
                case 32677:
                    if (C0191.m1627() >= 0) {
                        str = "ۧ۟ۡ";
                        c0224 = c02242;
                    } else {
                        str = "ۣۡۥ";
                        c0224 = c02242;
                        continue;
                    }
            }
            str = C0088.m573() <= 0 ? "ۣ۠۠" : "۠ۥۥ";
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public void m1954(final String str, AbstractC0307<Drawable> abstractC0307) {
        String str2 = "ۦۤۢ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1750535) {
                case 3141:
                    str2 = "ۦۤۢ";
                    break;
                case 29582:
                    return;
                case 30691:
                    C0377.m4968(C0073.m248(C0398.m5864(new InterfaceC0306(this, str) { // from class: com.cloudinject.feature.̗̗.-$$Lambda$̙$JJJzMkMx_FBpskpNv5OAxSbFJ3U
                        private final C0224 f$0;
                        private final String f$1;

                        {
                            String str3 = "۠ۤۨ";
                            while (true) {
                                switch (C0395.m5690((Object) str3) ^ 1753699) {
                                    case 26042:
                                        if (C0400.m5961() > 0) {
                                            str3 = "۠ۤۨ";
                                            break;
                                        } else {
                                            str3 = "ۣۥۣ";
                                            break;
                                        }
                                    case 26887:
                                        this.f$0 = this;
                                        if (C0381.m5127() > 0) {
                                            str3 = "ۤۢ";
                                            break;
                                        } else {
                                            C0393.m5668();
                                            break;
                                        }
                                    case 32718:
                                        return;
                                    case 1711645:
                                        this.f$1 = str;
                                        str3 = "ۥ۠ۨ";
                                        break;
                                }
                            }
                        }

                        /* renamed from: ۣۡۢ۟, reason: not valid java name and contains not printable characters */
                        public static String m1894(Object obj) {
                            String str3 = "ۤۤ";
                            String str4 = null;
                            String str5 = null;
                            while (true) {
                                switch (C0395.m5690((Object) str3) ^ 1754594) {
                                    case 103:
                                        break;
                                    case 205:
                                        if (C0399.m5914() <= 0) {
                                            C0398.m5833();
                                            str3 = "ۢۡ";
                                        } else {
                                            str3 = "ۨۡۥ";
                                            continue;
                                        }
                                    case 3238:
                                        str5 = (($$Lambda$$JJJzMkMx_FBpskpNv5OAxSbFJ3U) obj).f$1;
                                        if (C0381.m5127() <= 0) {
                                            C0420.m6215();
                                            str3 = "ۥۤۢ";
                                        } else {
                                            str3 = "ۤۦۢ";
                                            continue;
                                        }
                                    case 3304:
                                        if (C0388.m5430() <= 0) {
                                            C0082.m410();
                                            str4 = null;
                                        } else {
                                            str3 = "ۧ۠ۨ";
                                            str4 = null;
                                            continue;
                                        }
                                    case 3310:
                                    case 31623:
                                        str3 = "ۥۣ۟";
                                        continue;
                                    case 28448:
                                        if (C0378.m4998() <= 0) {
                                            C0334.m2866();
                                        } else {
                                            str3 = "ۤۤ";
                                            continue;
                                        }
                                    case 30827:
                                        return str4;
                                    case 32578:
                                        if (C0083.m448() >= 0) {
                                            C0368.m3171();
                                            str3 = "ۨ۠ۥ";
                                            str4 = str5;
                                        } else {
                                            str3 = "ۥۣ۟";
                                            str4 = str5;
                                            continue;
                                        }
                                    case 32606:
                                        if (C0155.m1294() >= 0) {
                                            C0183.m1464();
                                        } else {
                                            str3 = "ۣۨۡ";
                                            continue;
                                        }
                                    case 1710434:
                                        if (C0060.m216() <= 0) {
                                            break;
                                        } else if (C0369.m3256() > 0) {
                                            str3 = "ۣۨ۟";
                                        }
                                }
                                if (C0370.m3284() < 0) {
                                    str3 = "ۤۧ۟";
                                }
                            }
                        }

                        /* renamed from: ۥۣ۟, reason: contains not printable characters */
                        public static C0224 m1895(Object obj) {
                            String str3 = "ۣ۠۠";
                            C0224 c0224 = null;
                            C0224 c02242 = null;
                            while (true) {
                                switch (C0395.m5690((Object) str3) ^ 1754384) {
                                    case 24:
                                        if (C0025.m118() <= 0) {
                                            C0375.m4840();
                                            str3 = "ۢ۟ۤ";
                                            c0224 = null;
                                        } else {
                                            str3 = "۟ۦ";
                                            c0224 = null;
                                            continue;
                                        }
                                    case 122:
                                    case 213:
                                        if (C0179.m1427() <= 0) {
                                            C0025.m118();
                                            str3 = "ۢ۠ۤ";
                                        } else {
                                            str3 = "ۣ۠";
                                            continue;
                                        }
                                    case 1113:
                                        c02242 = (($$Lambda$$JJJzMkMx_FBpskpNv5OAxSbFJ3U) obj).f$0;
                                        if (C0362.m3122() >= 0) {
                                            C0206.m1807();
                                            str3 = "۟ۨۦ";
                                        } else {
                                            str3 = "ۥۧۢ";
                                            continue;
                                        }
                                    case 3581:
                                        break;
                                    case 28205:
                                        if (C0397.m5814() < 0) {
                                            break;
                                        } else if (C0398.m5833() <= 0) {
                                            C0279.m2491();
                                            str3 = "ۥۧۨ";
                                        } else {
                                            str3 = "ۦ۟ۢ";
                                        }
                                    case 31598:
                                        if (C0392.m5595() <= 0) {
                                            C0392.m5595();
                                            str3 = "ۢۢۨ";
                                        } else {
                                            str3 = "ۧ۟۠";
                                            continue;
                                        }
                                    case 31632:
                                        str3 = "ۣ۠";
                                        c0224 = c02242;
                                        continue;
                                    case 1710413:
                                        return c0224;
                                    case 1710422:
                                        if (C0370.m3284() >= 0) {
                                            str3 = "ۥ۠ۧ";
                                        } else {
                                            str3 = "ۣ۠۠";
                                            continue;
                                        }
                                    case 1711863:
                                        if (C0335.m2923() < 0) {
                                            str3 = "ۧۢۥ";
                                        } else {
                                            continue;
                                        }
                                }
                                if (C0334.m2866() > 0) {
                                    str3 = "ۥۧ۠";
                                }
                            }
                        }

                        @Override // com.cloudinject.feature.p023.p024.InterfaceC0306
                        public final void call(AbstractC0307 abstractC03072) {
                            String str3 = "ۣۤۡ";
                            while (true) {
                                switch (C0395.m5690((Object) str3) ^ 1747842) {
                                    case 1345:
                                        return;
                                    case 3134:
                                        if (C0399.m5914() <= 0) {
                                            break;
                                        } else {
                                            str3 = "ۣۤۡ";
                                            break;
                                        }
                                    case 4544:
                                        C0155.m1319(m1895(this), m1894(this), abstractC03072);
                                        if (C0391.m5571() > 0) {
                                            str3 = "ۣۡۡ";
                                            break;
                                        } else {
                                            str3 = "ۣۢۨ";
                                            break;
                                        }
                                }
                            }
                        }
                    }), abstractC0307));
                    if (C0164.m1359() >= 0) {
                        break;
                    } else {
                        str2 = "ۣۧۥ";
                        break;
                    }
            }
        }
    }
}
