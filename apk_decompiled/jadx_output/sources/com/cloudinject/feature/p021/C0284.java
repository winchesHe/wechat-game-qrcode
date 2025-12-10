package com.cloudinject.feature.p021;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0388;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.dalvik.system.C0399;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̙̗.̗̗̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
class C0284 extends WebChromeClient {

    /* renamed from: ̖̙̖̙̙̖̖, reason: not valid java name and contains not printable characters */
    final AlertDialogC0286 f519;

    C0284(AlertDialogC0286 alertDialogC0286) {
        this.f519 = alertDialogC0286;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = null;
        Object obj = "ۨۦۧ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1753479) {
                case 2094:
                    webView2 = new WebView(C0362.m3127(webView));
                    obj = "۟۟";
                    break;
                case 28379:
                    if (C0381.m5127() > 0) {
                        obj = "ۨۦۧ";
                        break;
                    } else {
                        C0362.m3122();
                        obj = "۟ۤۦ";
                        break;
                    }
                case 30489:
                    C0385.m5290((WebView.WebViewTransport) C0121.m983(message), webView2);
                    if (C0420.m6215() < 0) {
                        obj = "ۧ۠";
                        break;
                    } else {
                        C0385.m5282();
                        break;
                    }
                case 32738:
                    return true;
                case 1710695:
                    C0386.m5331(C0229.m2059(webView2), true);
                    if (C0335.m2923() < 0) {
                        obj = "ۢۢ";
                        break;
                    } else {
                        C0346.m3059();
                        break;
                    }
                case 1711454:
                    C0228.m2027(message);
                    if (C0388.m5430() <= 0) {
                        break;
                    } else {
                        obj = "ۥۦۦ";
                        break;
                    }
                case 1711559:
                    C0368.m3162(webView2, new C0282(this));
                    if (C0399.m5914() <= 0) {
                        break;
                    } else {
                        obj = "ۣۤ۟";
                        break;
                    }
            }
        }
    }
}
