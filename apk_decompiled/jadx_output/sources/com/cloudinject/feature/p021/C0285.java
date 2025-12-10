package com.cloudinject.feature.p021;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cloudinject.feature.p018.C0229;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.content.C0380;
import mirrorb.android.location.C0385;
import mirrorb.com.android.internal.content.C0395;

/* renamed from: com.cloudinject.feature.̙̗.̗̗̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
class C0285 extends WebViewClient {

    /* renamed from: ̖̙̖̙̙̖̖, reason: not valid java name and contains not printable characters */
    final AlertDialogC0286 f520;

    C0285(AlertDialogC0286 alertDialogC0286) {
        this.f520 = alertDialogC0286;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = "ۢۤ۠";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1746848) {
                case 64:
                    str2 = "ۢۤ۠";
                    continue;
                case 5474:
                    return super.shouldOverrideUrlLoading(webView, str);
                case 5502:
                    if (!C0380.m5096(str, C0385.m5310(C0229.m2065()))) {
                        break;
                    } else if (C0377.m4944() > 0) {
                        str2 = "ۣۣۢ";
                    }
                case 6722:
                    break;
                case 26049:
                    return false;
            }
            str2 = "ۦۣۨ";
        }
    }
}
