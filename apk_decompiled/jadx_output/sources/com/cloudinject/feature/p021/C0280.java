package com.cloudinject.feature.p021;

import android.database.C0074;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.p025.C0362;
import com.px.C0368;
import mirrorb.android.accounts.C0375;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;

/* renamed from: com.cloudinject.feature.̙̗.̗̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
class C0280 extends WebChromeClient {

    /* renamed from: ̙̙̖̙̖̖̖, reason: not valid java name and contains not printable characters */
    final AlertDialogC0287 f515;

    C0280(AlertDialogC0287 alertDialogC0287) {
        this.f515 = alertDialogC0287;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = null;
        Object obj = "ۦ۠ۤ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1754563) {
                case 1193:
                    WebView webView3 = new WebView(C0362.m3127(webView));
                    if (C0392.m5595() > 0) {
                        webView2 = webView3;
                        obj = "۠ۦۧ";
                        break;
                    } else {
                        C0393.m5668();
                        webView2 = webView3;
                        obj = "ۣۤ";
                        break;
                    }
                case 3111:
                    C0368.m3162(webView2, new C0272(this));
                    if (C0396.m5741() >= 0) {
                        break;
                    } else {
                        obj = "ۨۨ";
                        break;
                    }
                case 28258:
                    C0386.m5331(C0229.m2059(webView2), true);
                    if (C0387.m5374() >= 0) {
                        break;
                    } else {
                        obj = "ۨۨۤ";
                        break;
                    }
                case 28417:
                    obj = "ۦ۠ۤ";
                    break;
                case 29642:
                    C0228.m2027(message);
                    if (C0395.m5698() < 0) {
                        obj = "ۥۤۦ";
                        break;
                    } else {
                        C0390.m5512();
                        break;
                    }
                case 31716:
                    return true;
                case 1710275:
                    C0385.m5290((WebView.WebViewTransport) C0121.m983(message), webView2);
                    if (C0074.m307() < 0) {
                        obj = "ۣ۟ۥ";
                        break;
                    } else {
                        C0375.m4840();
                        break;
                    }
            }
        }
    }
}
