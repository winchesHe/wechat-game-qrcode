package com.cloudinject.feature.p021;

import android.arch.lifecycle.p000.C0025;
import android.content.Context;
import android.net.C0083;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.px.C0368;
import com.sadfxg.fasg.C0370;
import mirrorb.android.accounts.C0375;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̙̗.̗̖̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
class C0282 extends WebViewClient {

    /* renamed from: ̖̙̖̖̙̖̗, reason: not valid java name and contains not printable characters */
    final C0284 f517;

    C0282(C0284 c0284) {
        this.f517 = c0284;
    }

    /* renamed from: ۟ۤۡۥۡ, reason: not valid java name and contains not printable characters */
    public static AlertDialogC0286 m2512(Object obj) {
        String str = "ۦۡۥ";
        AlertDialogC0286 alertDialogC0286 = null;
        AlertDialogC0286 alertDialogC02862 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751560) {
                case 2217:
                case 4498:
                    if (C0184.m1524() >= 0) {
                        str = "ۤ۟ۤ";
                    } else {
                        str = "ۧۧ";
                        continue;
                    }
                case 2283:
                    if (C0386.m5322() > 0) {
                        str = "ۦۡۥ";
                    } else {
                        continue;
                    }
                case 3107:
                    str = "۠ۦ۠";
                    continue;
                case 3286:
                    alertDialogC02862 = ((C0284) obj).f519;
                    if (C0334.m2866() <= 0) {
                        str = "ۡۥۦ";
                    } else {
                        str = "ۡۥ۠";
                        continue;
                    }
                case 5428:
                    if (C0384.m5278() <= 0) {
                        C0025.m118();
                        str = "ۣۢۢ";
                        alertDialogC0286 = alertDialogC02862;
                    } else {
                        str = "ۧۧ";
                        alertDialogC0286 = alertDialogC02862;
                        continue;
                    }
                case 29633:
                    if (C0377.m4944() <= 0) {
                        C0378.m4998();
                        alertDialogC0286 = null;
                    } else {
                        str = "ۣ۠ۨ";
                        alertDialogC0286 = null;
                        continue;
                    }
                case 30798:
                    break;
                case 31555:
                    if (C0370.m3284() >= 0) {
                        C0229.m2064();
                    } else {
                        str = "ۨۧۨ";
                        continue;
                    }
                case 31618:
                    if (C0397.m5814() < 0) {
                        break;
                    } else if (C0399.m5914() > 0) {
                        str = "ۣۦۡ";
                    }
                case 1730280:
                    return alertDialogC0286;
            }
            str = "ۦ۟ۤ";
        }
    }

    /* renamed from: ۡۦۢۥ, reason: not valid java name and contains not printable characters */
    public static Context m2513(Object obj) {
        String str = "۟۟۠";
        Context context = null;
        Context contextM2520 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754471) {
                case 163:
                    break;
                case 195:
                    str = "ۣۡۨ";
                    context = contextM2520;
                    continue;
                case 1218:
                case 3178:
                    if (C0088.m573() <= 0) {
                        C0025.m118();
                    } else {
                        str = "ۣۡۨ";
                        continue;
                    }
                case 3179:
                    if (C0291.m2568() >= 0) {
                        C0392.m5595();
                    } else {
                        str = "ۢ۠۟";
                        continue;
                    }
                case 3246:
                    contextM2520 = AlertDialogC0286.m2520((AlertDialogC0286) obj);
                    str = "ۧۤۡ";
                    continue;
                case 25094:
                    if (C0399.m5914() <= 0) {
                        C0386.m5322();
                        str = "ۤ۠ۨ";
                    } else {
                        str = "ۨۡۦ";
                        continue;
                    }
                case 25191:
                    if (C0386.m5322() <= 0) {
                        break;
                    } else if (C0335.m2923() < 0) {
                        str = "ۨۧۨ";
                    }
                case 28189:
                    if (C0155.m1294() >= 0) {
                        C0420.m6215();
                    } else {
                        str = "۟۟۠";
                        continue;
                    }
                case 29485:
                    return context;
                case 30470:
                    if (C0184.m1524() >= 0) {
                        str = "ۤۦ";
                        context = null;
                    } else {
                        str = "۟ۢۤ";
                        context = null;
                        continue;
                    }
            }
            str = "ۨۡۥ";
        }
    }

    /* renamed from: ۥۢ۟ۨ, reason: contains not printable characters */
    public static C0284 m2514(Object obj) {
        String str = "ۤۥ۠";
        C0284 c0284 = null;
        C0284 c02842 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753540) {
                case 2223:
                    return c0284;
                case 26118:
                    break;
                case 26279:
                    if (C0121.m1023() >= 0) {
                        C0083.m448();
                    } else {
                        str = "ۦۦ";
                        continue;
                    }
                case 26304:
                    if (C0393.m5668() <= 0) {
                        c0284 = null;
                    } else {
                        str = "۟ۢۦ";
                        c0284 = null;
                        continue;
                    }
                case 27204:
                    if (C0395.m5698() >= 0) {
                        C0378.m4998();
                    } else {
                        str = "ۤۥ۠";
                        continue;
                    }
                case 27386:
                    c02842 = ((C0282) obj).f517;
                    str = "ۡۨۤ";
                    continue;
                case 27393:
                    str = "۟۟ۤ";
                    continue;
                case 28249:
                    if (C0395.m5698() >= 0) {
                        C0335.m2923();
                        c0284 = c02842;
                    } else {
                        str = "ۨۤۧ";
                        c0284 = c02842;
                        continue;
                    }
                case 31675:
                    if (C0368.m3171() > 0) {
                        break;
                    } else if (C0398.m5833() <= 0) {
                        C0389.m5481();
                    } else {
                        str = "ۣ۠ۡ";
                    }
                case 1711364:
                case 1711417:
                    if (C0375.m4840() >= 0) {
                        C0377.m4944();
                        str = "ۣۢۨ";
                    } else {
                        str = "ۨۤۧ";
                        continue;
                    }
            }
            if (C0279.m2491() < 0) {
                str = "۠۟ۤ";
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = "ۦ۠ۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1750598) {
                case 2087:
                    return true;
                case 30507:
                    C0279.m2461(m2513(m2512(m2514(this))), str);
                    str2 = "ۥۦۢ";
                    break;
                case 32705:
                    if (C0385.m5282() < 0) {
                        str2 = "ۦ۠ۧ";
                        break;
                    } else {
                        C0025.m118();
                        break;
                    }
            }
        }
    }
}
