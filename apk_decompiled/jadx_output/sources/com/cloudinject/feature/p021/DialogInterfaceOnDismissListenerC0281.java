package com.cloudinject.feature.p021;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.DialogInterface;
import android.database.C0074;
import android.net.C0082;
import android.webkit.WebView;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.C0362;
import com.px.C0368;
import com.sadfxg.fasg.C0370;
import mirrorb.android.accounts.C0375;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.location.C0384;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.os.mount.C0390;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;

/* renamed from: com.cloudinject.feature.̙̗.̗̖̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
class DialogInterfaceOnDismissListenerC0281 implements DialogInterface.OnDismissListener {

    /* renamed from: ̖̙̖̙̙̖̖, reason: not valid java name and contains not printable characters */
    final AlertDialogC0286 f516;

    DialogInterfaceOnDismissListenerC0281(AlertDialogC0286 alertDialogC0286) {
        this.f516 = alertDialogC0286;
    }

    /* renamed from: ۟ۢۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static WebView m2509(Object obj, Object obj2) {
        String str = "ۡۧۡ";
        WebView webView = null;
        WebView webViewM2516 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755429) {
                case 2853:
                    str = "ۤۥ۠";
                    continue;
                case 3113:
                    break;
                case 3269:
                    if (C0368.m3171() >= 0) {
                        C0362.m3122();
                    } else {
                        str = "۠ۦۦ";
                        continue;
                    }
                case 25221:
                case 1709466:
                    if (C0378.m4998() <= 0) {
                        C0089.m592();
                    } else {
                        str = "ۣۤۢ";
                        continue;
                    }
                case 26206:
                    if (C0229.m2064() >= 0) {
                        break;
                    } else if (C0384.m5278() <= 0) {
                        C0387.m5374();
                    } else {
                        str = "۠ۦ";
                    }
                case 28346:
                    str = "ۣۤۢ";
                    webView = webViewM2516;
                    continue;
                case 29440:
                    return webView;
                case 29530:
                    if (C0379.m5056() <= 0) {
                        str = "ۤۤ";
                        webView = null;
                    } else {
                        str = "ۧۦ۟";
                        webView = null;
                        continue;
                    }
                case 32611:
                    if (C0191.m1627() >= 0) {
                        C0009.m36();
                        str = "۟ۥ۟";
                    } else {
                        str = "ۡۧۡ";
                        continue;
                    }
                case 1709347:
                    webViewM2516 = AlertDialogC0286.m2516((AlertDialogC0286) obj, (WebView) obj2);
                    if (C0390.m5512() <= 0) {
                        str = "ۦۤ۠";
                    } else {
                        str = "۟ۤۤ";
                        continue;
                    }
            }
            if (C0390.m5512() <= 0) {
                C0370.m3284();
                str = "ۦۧ۟";
            } else {
                str = "ۦۥ۟";
            }
        }
    }

    /* renamed from: ۦۣۢۡ, reason: contains not printable characters */
    public static WebView m2510(Object obj) {
        String str = "ۨ۠";
        WebView webView = null;
        WebView webViewM2518 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746877) {
                case 2176:
                    break;
                case 3231:
                case 28251:
                    if (C0375.m4840() >= 0) {
                        C0334.m2866();
                    } else {
                        str = "ۥۣۧ";
                        continue;
                    }
                case 3421:
                    if (C0025.m118() <= 0) {
                        C0184.m1524();
                        webView = webViewM2518;
                    } else {
                        str = "ۥۣۧ";
                        webView = webViewM2518;
                        continue;
                    }
                case 5281:
                    if (C0086.m500() > 0) {
                        str = "ۨ۠";
                    } else {
                        continue;
                    }
                case 5434:
                    str = "۠ۢۤ";
                    continue;
                case 6428:
                    if (C0384.m5278() <= 0) {
                        webView = null;
                    } else {
                        str = "ۢۡۦ";
                        webView = null;
                        continue;
                    }
                case 6553:
                    if (C0375.m4840() < 0) {
                        str = "ۥۨۤ";
                    } else {
                        continue;
                    }
                case 6580:
                    return webView;
                case 7645:
                    webViewM2518 = AlertDialogC0286.m2518((AlertDialogC0286) obj);
                    if (C0394.m5672() <= 0) {
                        str = "ۣۤ۟";
                    } else {
                        str = "۠۠۠";
                        continue;
                    }
                case 1735493:
                    if (C0396.m5741() >= 0) {
                        break;
                    } else if (C0334.m2866() <= 0) {
                        C0398.m5833();
                    } else {
                        str = "ۤۤ۠";
                    }
            }
            str = C0400.m5961() <= 0 ? "ۨۨۢ" : "ۥۣۤ";
        }
    }

    /* renamed from: ۧ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static AlertDialogC0286 m2511(Object obj) {
        String str = "ۧۤۡ";
        AlertDialogC0286 alertDialogC0286 = null;
        AlertDialogC0286 alertDialogC02862 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1752524) {
                case 2926:
                    str = "ۧۤۡ";
                    continue;
                case 3949:
                    return alertDialogC0286;
                case 4817:
                    if (C0399.m5914() <= 0) {
                        C0400.m5961();
                    } else {
                        str = "ۦۦ۟";
                        continue;
                    }
                case 4874:
                case 29931:
                    if (C0384.m5278() <= 0) {
                        C0386.m5322();
                    } else {
                        str = "ۢۢۡ";
                        continue;
                    }
                case 6738:
                    break;
                case 30824:
                    if (C0179.m1427() < 0) {
                        break;
                    } else if (C0380.m5068() <= 0) {
                        C0179.m1427();
                    } else {
                        str = "ۨ۟";
                    }
                case 31879:
                    str = "ۨۢۡ";
                    continue;
                case 32723:
                    if (C0074.m307() >= 0) {
                        alertDialogC0286 = null;
                    } else {
                        str = "ۦ۟ۤ";
                        alertDialogC0286 = null;
                        continue;
                    }
                case 1728827:
                    alertDialogC02862 = ((DialogInterfaceOnDismissListenerC0281) obj).f516;
                    if (C0395.m5698() < 0) {
                        str = "۟۠";
                    } else {
                        continue;
                    }
                case 1730093:
                    if (C0377.m4944() <= 0) {
                        alertDialogC0286 = alertDialogC02862;
                    } else {
                        str = "ۢۢۡ";
                        alertDialogC0286 = alertDialogC02862;
                        continue;
                    }
            }
            str = C0368.m3171() >= 0 ? "ۦۨۢ" : "ۡۤ۠";
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        String str = "ۤ۟۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751624) {
                case 23:
                    str = "ۤ۟۠";
                    break;
                case 909:
                    C0155.m1305(m2510(m2511(this)));
                    if (C0082.m410() >= 0) {
                        break;
                    } else {
                        str = "ۡ۠";
                        break;
                    }
                case 4597:
                    m2509(m2511(this), null);
                    if (C0396.m5741() < 0) {
                        str = "ۥۤ";
                        break;
                    } else {
                        C0394.m5672();
                        break;
                    }
                case 1730135:
                    C0387.m5407(m2510(m2511(this)));
                    if (C0060.m216() > 0) {
                        str = "۠ۧۤ";
                        break;
                    } else {
                        C0334.m2866();
                        break;
                    }
                case 1730263:
                    return;
            }
        }
    }
}
