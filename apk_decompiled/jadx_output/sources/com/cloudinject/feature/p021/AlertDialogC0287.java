package com.cloudinject.feature.p021;

import android.arch.lifecycle.p000.C0025;
import android.content.Context;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0089;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0370;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.rms.C0392;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̙̗.̗̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class AlertDialogC0287 extends AlertDialogC0273 {
    private Context mContext;

    /* renamed from: ̖̙̙̙̙̖̖, reason: not valid java name and contains not printable characters */
    private WebView f523;

    /* renamed from: ̙̙̙̙̙̖̖, reason: not valid java name and contains not printable characters */
    private String f524;

    public AlertDialogC0287(Context context, String str) {
        super(context);
        String str2 = "ۧ۟ۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753697) {
                case 1903:
                    this.mContext = context;
                    str2 = "ۡۧۧ";
                    break;
                case 27106:
                    C0073.m274(this);
                    if (C0191.m1627() < 0) {
                        str2 = "ۡۢۡ";
                        break;
                    } else {
                        str2 = "ۥۣۦ";
                        break;
                    }
                case 27777:
                    return;
                case 28128:
                    this.f524 = str;
                    str2 = "۠ۥۨ";
                    break;
                case 32715:
                    if (C0398.m5833() <= 0) {
                        break;
                    } else {
                        str2 = "ۧ۟ۦ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    static /* synthetic */ WebView m2523(AlertDialogC0287 alertDialogC0287, WebView webView) {
        String str = "۟۟ۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754630) {
                case 929:
                    if (C0121.m1023() < 0) {
                        str = "۟۟ۧ";
                        break;
                    } else {
                        C0229.m2064();
                        break;
                    }
                case 24833:
                    alertDialogC0287.f523 = webView;
                    str = "ۣۡ۟";
                    break;
                case 28743:
                    return webView;
            }
        }
    }

    /* renamed from: ۟ۢ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m2525(Object obj) {
        String str = "ۣۨۢ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56350) {
                case 1709334:
                case 1735451:
                    if (C0121.m1023() >= 0) {
                        C0335.m2923();
                        str = "ۣ۟ۦ";
                    } else {
                        str = "ۥۥۧ";
                        continue;
                    }
                case 1709367:
                    if (C0184.m1524() >= 0) {
                        C0380.m5068();
                        str = "ۥۡ";
                    } else {
                        str = "۟۟ۥ";
                        continue;
                    }
                case 1711706:
                    if (C0362.m3122() >= 0) {
                        C0420.m6215();
                        str2 = str3;
                    } else {
                        str = "ۥۥۧ";
                        str2 = str3;
                        continue;
                    }
                case 1729113:
                    return str2;
                case 1729154:
                    if (C0400.m5961() > 0) {
                        str = "ۣۤ۟";
                    } else {
                        continue;
                    }
                case 1729215:
                    if (C0206.m1807() >= 0) {
                        C0025.m118();
                        str = "ۥۣۥ";
                    } else {
                        str = "ۣۨۢ";
                        continue;
                    }
                case 1731200:
                    str = "ۣۨۢ";
                    str2 = null;
                    continue;
                case 1731331:
                    if (C0346.m3059() > 0) {
                        break;
                    } else if (C0183.m1464() > 0) {
                        str = "۠۠ۧ";
                    }
                case 1734393:
                    str3 = ((AlertDialogC0287) obj).f524;
                    str = "ۦۧۥ";
                    continue;
                case 1735679:
                    break;
            }
            str = C0086.m500() <= 0 ? "ۣۨۧ" : "ۥۨ۟";
        }
    }

    /* renamed from: ۟ۦۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static WebView m2526(Object obj) {
        String str = "ۦۢۥ";
        WebView webView = null;
        WebView webView2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754375) {
                case 74:
                    break;
                case 1198:
                    if (C0389.m5481() < 0) {
                        break;
                    } else {
                        str = "۠ۨ۠";
                    }
                case 3279:
                    str = "۠ۤ۟";
                    continue;
                case 3533:
                case 28252:
                    str = "ۥ۟ۧ";
                    continue;
                case 27559:
                    if (C0086.m500() > 0) {
                        str = "ۦۢۥ";
                    } else {
                        continue;
                    }
                case 28383:
                    webView2 = ((AlertDialogC0287) obj).f523;
                    str = "ۢ۠ۨ";
                    continue;
                case 30573:
                    if (C0086.m500() <= 0) {
                        webView = webView2;
                    } else {
                        str = "ۥ۟ۧ";
                        webView = webView2;
                        continue;
                    }
                case 30849:
                    str = "ۨۧۧ";
                    webView = null;
                    continue;
                case 30858:
                    return webView;
                case 1711847:
                    if (C0392.m5595() <= 0) {
                        C0089.m592();
                    } else {
                        str = "ۥ۟۠";
                        continue;
                    }
            }
            str = "۟۟";
        }
    }

    /* renamed from: ۣۢۤۡ, reason: not valid java name and contains not printable characters */
    public static Context m2527(Object obj) {
        String str = "۟ۥۥ";
        Context context = null;
        Context context2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751554) {
                case 1124:
                    break;
                case 2302:
                    if (C0394.m5672() <= 0) {
                        C0380.m5068();
                    } else {
                        str = "ۣ۟";
                        continue;
                    }
                case 2366:
                case 1730233:
                    if (C0229.m2064() >= 0) {
                        str = "ۣۡۡ";
                    } else {
                        str = "ۧۧ۠";
                        continue;
                    }
                case 4388:
                    str = "ۧۧ۠";
                    context = context2;
                    continue;
                case 4480:
                    str = "ۦۡ";
                    continue;
                case 5471:
                    context2 = ((AlertDialogC0287) obj).mContext;
                    if (C0229.m2064() >= 0) {
                        C0399.m5914();
                        str = "ۡۦ";
                    } else {
                        str = "۠ۢۨ";
                        continue;
                    }
                case 7613:
                    if (C0083.m448() > 0) {
                        break;
                    } else {
                        str = "ۡۦۢ";
                    }
                case 7615:
                    str = "۟ۥۥ";
                    continue;
                case 31746:
                    return context;
                case 1728998:
                    if (C0382.m5180() <= 0) {
                        str = "ۥۣۡ";
                        context = null;
                    } else {
                        str = "۠ۥۧ";
                        context = null;
                        continue;
                    }
            }
            if (C0121.m1023() < 0) {
                str = "ۢۥ۟";
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    public void setMessage(String str) {
        String str2 = "ۥۦۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1747867) {
                case 5630:
                    return;
                case 28255:
                    if (C0385.m5282() < 0) {
                        str2 = "ۥۦۦ";
                        break;
                    } else {
                        C0400.m5961();
                        str2 = "ۣۢ۟";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̗̖̖̙̖, reason: not valid java name and contains not printable characters */
    public void m2528() {
        WebSettings webSettingsM2059 = null;
        String str = "ۣۨۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749637) {
                case 4:
                    C0380.m5077(m2526(this), new C0280(this));
                    if (C0346.m3059() < 0) {
                        str = "ۤۦ۟";
                        break;
                    } else {
                        C0395.m5698();
                        str = "ۨ۟ۨ";
                        break;
                    }
                case 37:
                    str = "ۣۨۨ";
                    break;
                case 236:
                    C0082.m398(this, m2526(this));
                    str = "۟ۦ۠";
                    break;
                case 2072:
                    C0346.m3062(this, new DialogInterfaceOnDismissListenerC0271(this));
                    str = "ۨ۠";
                    break;
                case 3322:
                    C0386.m5331(webSettingsM2059, true);
                    if (C0380.m5068() > 0) {
                        str = "ۨۥۡ";
                        break;
                    } else {
                        C0397.m5814();
                        break;
                    }
                case 5468:
                    return;
                case 5507:
                    C0368.m3162(m2526(this), new C0283(this));
                    if (C0378.m4998() <= 0) {
                        break;
                    } else {
                        str = "ۢۡ۠";
                        break;
                    }
                case 31489:
                    C0389.m5480(webSettingsM2059, true);
                    if (C0074.m307() >= 0) {
                        break;
                    } else {
                        str = "۟۟ۦ";
                        break;
                    }
                case 31688:
                    this.f523 = new WebView(m2527(this));
                    str = "ۨۤۧ";
                    break;
                case 31726:
                    webSettingsM2059 = C0229.m2059(m2526(this));
                    str = "ۥۧۡ";
                    break;
                case 1732221:
                    C0386.m5353(m2526(this), m2525(this), C0385.m5310(C0370.m3318()), C0385.m5310(C0377.m4936()));
                    if (C0381.m5127() > 0) {
                        str = "ۢ۠ۧ";
                        break;
                    } else {
                        C0388.m5430();
                        break;
                    }
            }
        }
    }
}
