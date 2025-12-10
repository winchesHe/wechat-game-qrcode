package com.cloudinject.feature.p021;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cloudinject.feature.p018.C0229;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.location.C0385;
import mirrorb.com.android.internal.content.C0395;

/* renamed from: com.cloudinject.feature.̙̗.̗̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
class C0283 extends WebViewClient {

    /* renamed from: ̙̙̖̙̖̖̖, reason: not valid java name and contains not printable characters */
    final AlertDialogC0287 f518;

    C0283(AlertDialogC0287 alertDialogC0287) {
        this.f518 = alertDialogC0287;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = "ۧۢۨ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1754662) {
                case 843:
                    if (!C0380.m5096(str, C0385.m5310(C0229.m2065()))) {
                        break;
                    } else {
                        str2 = "ۦۧۤ";
                    }
                case 1125:
                    return super.shouldOverrideUrlLoading(webView, str);
                case 27994:
                    break;
                case 29795:
                    if (C0382.m5180() > 0) {
                        str2 = "ۧۢۨ";
                    } else {
                        continue;
                    }
                case 31812:
                    return false;
            }
            str2 = "ۤۤۢ";
        }
    }
}
