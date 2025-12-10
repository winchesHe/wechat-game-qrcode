package com.cloudinject.feature.p021;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.content.DialogInterface;
import android.net.C0083;
import android.net.wifi.C0078;
import android.webkit.WebView;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.os.mount.C0390;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.java.lang.C0400;

/* renamed from: com.cloudinject.feature.̙̗.̖̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
class DialogInterfaceOnDismissListenerC0271 implements DialogInterface.OnDismissListener {

    /* renamed from: ̙̙̖̙̖̖̖, reason: not valid java name and contains not printable characters */
    final AlertDialogC0287 f483;

    DialogInterfaceOnDismissListenerC0271(AlertDialogC0287 alertDialogC0287) {
        this.f483 = alertDialogC0287;
    }

    /* renamed from: ۣ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static WebView m2412(Object obj, Object obj2) {
        String str = "ۨ۠۠";
        WebView webView = null;
        WebView webViewM2523 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752484) {
                case 1793:
                    str = "ۣۡ۟";
                    webView = null;
                    continue;
                case 1861:
                case 31649:
                    str = "ۡۨۥ";
                    continue;
                case 2860:
                    webViewM2523 = AlertDialogC0287.m2523((AlertDialogC0287) obj, (WebView) obj2);
                    str = "۟۟ۦ";
                    continue;
                case 2912:
                    str = "ۤۦۧ";
                    continue;
                case 3885:
                    break;
                case 4666:
                    return webView;
                case 4897:
                    if (C0009.m36() >= 0) {
                        str = "ۥۧ۟";
                    } else {
                        str = "ۧۧۥ";
                        continue;
                    }
                case 6818:
                    if (C0089.m592() <= 0) {
                        C0394.m5672();
                        str = "ۤۤ۠";
                        webView = webViewM2523;
                    } else {
                        str = "ۡۨۥ";
                        webView = webViewM2523;
                        continue;
                    }
                case 29703:
                    if (C0083.m448() >= 0) {
                        str = "ۥۣۢ";
                    } else {
                        str = "ۨ۠۠";
                        continue;
                    }
                case 30028:
                    if (C0346.m3059() > 0) {
                        break;
                    } else if (C0025.m118() > 0) {
                        str = "ۣۣۨ";
                    }
            }
            if (C0179.m1427() > 0) {
                str = "ۣۥۦ";
            }
        }
    }

    /* renamed from: ۣۣۤۦ, reason: not valid java name and contains not printable characters */
    public static AlertDialogC0287 m2413(Object obj) {
        Object obj2 = "ۦۤۨ";
        AlertDialogC0287 alertDialogC0287 = null;
        AlertDialogC0287 alertDialogC02872 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1752673) {
                case 196:
                    obj2 = "ۧۡ۠";
                    continue;
                case 3202:
                    alertDialogC02872 = ((DialogInterfaceOnDismissListenerC0271) obj).f483;
                    if (C0179.m1427() <= 0) {
                        C0379.m5056();
                    } else {
                        obj2 = "ۢۦۥ";
                        continue;
                    }
                case 3392:
                    obj2 = "ۡۥۢ";
                    alertDialogC0287 = alertDialogC02872;
                    continue;
                case 4447:
                    return alertDialogC0287;
                case 5567:
                    if (C0400.m5961() <= 0) {
                        C0191.m1627();
                    } else {
                        obj2 = "ۢۦ";
                        continue;
                    }
                case 5751:
                    break;
                case 31527:
                    if (C0291.m2568() >= 0) {
                        C0362.m3122();
                        alertDialogC0287 = null;
                    } else {
                        obj2 = "۠ۨۦ";
                        alertDialogC0287 = null;
                        continue;
                    }
                case 31839:
                    if (C0397.m5814() <= 0) {
                        C0369.m3256();
                    } else {
                        obj2 = "ۦۤۨ";
                        continue;
                    }
                case 32527:
                case 1729061:
                    obj2 = "ۡۥۢ";
                    continue;
                case 32651:
                    if (C0389.m5481() < 0) {
                        break;
                    } else if (C0379.m5056() <= 0) {
                        C0183.m1464();
                        obj2 = "۟ۨۡ";
                    } else {
                        obj2 = "ۢۤۥ";
                    }
            }
            if (C0362.m3122() < 0) {
                obj2 = "ۥۨۨ";
            }
        }
    }

    /* renamed from: ۣۧۧ۠, reason: not valid java name and contains not printable characters */
    public static WebView m2414(Object obj) {
        String str = "ۣۢ۟";
        WebView webView = null;
        WebView webViewM2526 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1752609) {
                case 1024:
                case 1121:
                    if (C0390.m5512() <= 0) {
                        C0368.m3171();
                    } else {
                        str = "ۣۧ۠";
                        continue;
                    }
                case 3143:
                    if (C0368.m3171() >= 0) {
                        webView = webViewM2526;
                    } else {
                        str = "ۣۧ۠";
                        webView = webViewM2526;
                        continue;
                    }
                case 3175:
                    if (C0386.m5322() < 0) {
                        break;
                    } else {
                        str = C0389.m5481() <= 0 ? "ۨ۟ۤ" : "ۡۢ۟";
                    }
                case 4351:
                    webViewM2526 = AlertDialogC0287.m2526((AlertDialogC0287) obj);
                    if (C0279.m2491() < 0) {
                        str = "ۢ۠ۤ";
                    } else {
                        continue;
                    }
                case 5343:
                    if (C0397.m5814() <= 0) {
                        C0380.m5068();
                        str = "۠۠ۢ";
                    } else {
                        str = "ۣۤ۟";
                        continue;
                    }
                case 6435:
                    break;
                case 6527:
                    if (C0206.m1807() >= 0) {
                        C0387.m5374();
                        str = "ۨۡ۠";
                        webView = null;
                    } else {
                        str = "۠ۡ۟";
                        webView = null;
                        continue;
                    }
                case 30449:
                    str = "۟ۢۡ";
                    continue;
                case 31499:
                    return webView;
                case 31721:
                    if (C0078.m361() > 0) {
                        str = "ۣۢ۟";
                    } else {
                        continue;
                    }
            }
            str = C0368.m3171() >= 0 ? "ۣ۟۠" : "ۨ۟ۧ";
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        String str = "۠ۨۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752676) {
                case 3226:
                    C0387.m5407(m2414(m2413(this)));
                    str = "۠ۡۦ";
                    break;
                case 5473:
                    m2412(m2413(this), null);
                    str = "ۦۢۢ";
                    break;
                case 5508:
                    C0155.m1305(m2414(m2413(this)));
                    str = "ۢۥۡ";
                    break;
                case 32706:
                    return;
                case 1729241:
                    if (C0382.m5180() > 0) {
                        str = "۠ۨۨ";
                        break;
                    } else {
                        C0228.m2012();
                        str = "۟ۤ";
                        break;
                    }
            }
        }
    }
}
