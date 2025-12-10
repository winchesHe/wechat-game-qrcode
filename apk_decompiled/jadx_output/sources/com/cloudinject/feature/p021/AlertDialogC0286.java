package com.cloudinject.feature.p021;

import android.app.C0009;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.graphics.drawable.C0086;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import mirrorb.android.accounts.C0375;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̙̗.̗̗̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class AlertDialogC0286 extends AlertDialogC0273 {
    private Context mContext;

    /* renamed from: ̖̙̙̙̙̖̖, reason: not valid java name and contains not printable characters */
    private WebView f521;

    /* renamed from: ̖̙̙̙̙̙̖, reason: not valid java name and contains not printable characters */
    private String f522;

    public AlertDialogC0286(Context context, String str) {
        super(context);
        String str2 = "ۡ۠ۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56451) {
                case 92:
                    str2 = "ۡ۠ۡ";
                    break;
                case 1709160:
                    this.f522 = str;
                    str2 = "ۥۣۥ";
                    break;
                case 1729156:
                    C0362.m3085(this);
                    if (C0375.m4840() < 0) {
                        str2 = "۟ۨۧ";
                        break;
                    } else {
                        C0381.m5127();
                        break;
                    }
                case 1733153:
                    this.mContext = context;
                    str2 = "ۣۨ۠";
                    break;
                case 1733789:
                    return;
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    static /* synthetic */ WebView m2516(AlertDialogC0286 alertDialogC0286, WebView webView) {
        String str = "ۣۤۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750781) {
                case 3262:
                    alertDialogC0286.f521 = webView;
                    if (C0377.m4944() > 0) {
                        str = "۠ۧۨ";
                        break;
                    } else {
                        C0060.m216();
                        str = "ۡۢۢ";
                        break;
                    }
                case 7484:
                    return webView;
                case 30581:
                    if (C0397.m5814() > 0) {
                        str = "ۣۤۢ";
                        break;
                    } else {
                        str = "ۣۤۧ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ۟ۢۥۥ۠, reason: not valid java name and contains not printable characters */
    public static WebView m2518(Object obj) {
        String str = "ۣۤۤ";
        WebView webView = null;
        WebView webView2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746727) {
                case 188:
                case 24870:
                    str = "ۦۧۨ";
                    continue;
                case 2232:
                    if (C0420.m6215() < 0) {
                        str = "ۣۤۤ";
                    } else {
                        continue;
                    }
                case 3139:
                    break;
                case 4484:
                    if (C0334.m2866() <= 0) {
                        break;
                    } else {
                        str = C0362.m3122() >= 0 ? "ۤۥۨ" : "ۦۢۢ";
                    }
                case 7590:
                    if (C0375.m4840() >= 0) {
                        C0191.m1627();
                        webView = null;
                    } else {
                        str = "ۣ۟";
                        webView = null;
                        continue;
                    }
                case 25261:
                    if (C0369.m3256() <= 0) {
                        C0082.m410();
                    } else {
                        str = "ۤۥۢ";
                        continue;
                    }
                case 25262:
                    if (C0191.m1627() >= 0) {
                        C0370.m3284();
                        webView = webView2;
                    } else {
                        str = "ۦۧۨ";
                        webView = webView2;
                        continue;
                    }
                case 25952:
                    return webView;
                case 26241:
                    webView2 = ((AlertDialogC0286) obj).f521;
                    str = "ۣۧۥ";
                    continue;
                case 1735875:
                    if (C0378.m4998() <= 0) {
                        C0375.m4840();
                        str = "ۣۦۦ";
                    } else {
                        str = "۟ۤ۠";
                        continue;
                    }
            }
            str = "ۣۧۦ";
        }
    }

    /* renamed from: ۟ۧ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static String m2519(Object obj) {
        String str = "۠ۧ۟";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747650) {
                case 378:
                    if (C0074.m307() > 0) {
                        break;
                    } else if (C0383.m5203() <= 0) {
                        C0397.m5814();
                        str = "ۥۡۡ";
                    } else {
                        str = "ۨۡۥ";
                    }
                case 1122:
                case 7170:
                    str = "۟ۢ";
                    continue;
                case 1468:
                    if (C0082.m410() >= 0) {
                        str = "ۧۥۦ";
                        str2 = str3;
                    } else {
                        str = "۟ۢ";
                        str2 = str3;
                        continue;
                    }
                case 4165:
                    if (C0334.m2866() <= 0) {
                        C0379.m5056();
                        str = "ۦۢۦ";
                    } else {
                        str = "ۣۥۢ";
                        continue;
                    }
                case 5927:
                    str = "ۨۡۨ";
                    continue;
                case 25445:
                    if (C0399.m5914() <= 0) {
                        C0384.m5278();
                    } else {
                        str = "۠ۧ۟";
                        continue;
                    }
                case 25549:
                    if (C0362.m3122() >= 0) {
                        C0086.m500();
                        str2 = null;
                    } else {
                        str = "ۤۥۨ";
                        str2 = null;
                        continue;
                    }
                case 25550:
                    str3 = ((AlertDialogC0286) obj).f522;
                    str = "ۡۧۤ";
                    continue;
                case 26852:
                    break;
                case 1732897:
                    return str2;
            }
            str = "ۥۢۢ";
        }
    }

    /* renamed from: ۟ۧۦۤۥ, reason: not valid java name and contains not printable characters */
    public static Context m2520(Object obj) {
        String str = "۟۠ۢ";
        Context context = null;
        Context context2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753693) {
                case 917:
                case 29724:
                    str = "ۣۦۣ";
                    continue;
                case 1145:
                    context2 = ((AlertDialogC0286) obj).mContext;
                    str = "۠ۧۢ";
                    continue;
                case 25980:
                    if (C0379.m5056() < 0) {
                        break;
                    } else if (C0369.m3256() <= 0) {
                        C0394.m5672();
                    } else {
                        str = "ۧۨۥ";
                    }
                case 26054:
                    break;
                case 27110:
                    if (C0377.m4944() <= 0) {
                        context = context2;
                    } else {
                        str = "ۣۦۣ";
                        context = context2;
                        continue;
                    }
                case 28031:
                    if (C0391.m5571() <= 0) {
                        C0397.m5814();
                    } else {
                        str = "۟۠ۢ";
                        continue;
                    }
                case 28098:
                    str = "ۦۣۥ";
                    continue;
                case 29885:
                    return context;
                case 29913:
                    if (C0009.m36() >= 0) {
                        C0206.m1807();
                    } else {
                        str = "ۤۢۦ";
                        continue;
                    }
                case 30837:
                    if (C0184.m1524() >= 0) {
                        context = null;
                    } else {
                        str = "ۡۨۦ";
                        context = null;
                        continue;
                    }
            }
            if (C0191.m1627() >= 0) {
                C0073.m265();
            } else {
                str = "ۣۣۤ";
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    public void setMessage(String str) {
        String str2 = "ۨ۟";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1751616) {
                case 1996:
                    if (C0334.m2866() > 0) {
                        str2 = "ۨ۟";
                        break;
                    } else {
                        str2 = "ۧۡۧ";
                        break;
                    }
                case 1730231:
                    return;
            }
        }
    }

    /* renamed from: ̗̗̖̖̙̖, reason: not valid java name and contains not printable characters */
    public void m2521() {
        WebSettings webSettingsM2059 = null;
        String str = "۟ۧ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753477) {
                case 239:
                    C0380.m5077(m2518(this), new C0284(this));
                    str = "ۥۦۧ";
                    break;
                case 1186:
                    C0389.m5480(webSettingsM2059, true);
                    str = "ۣۤۤ";
                    break;
                case 1256:
                    C0291.m2543(m2518(this), m2519(this));
                    if (C0009.m36() < 0) {
                        str = "ۤۥۢ";
                        break;
                    } else {
                        C0395.m5698();
                        break;
                    }
                case 26206:
                    C0386.m5331(webSettingsM2059, true);
                    if (C0206.m1807() < 0) {
                        str = "ۧ۠۠";
                        break;
                    } else {
                        C0392.m5595();
                        str = "ۤۦ";
                        break;
                    }
                case 26226:
                    this.f521 = new WebView(m2520(this));
                    if (C0346.m3059() < 0) {
                        str = "ۤۦ۠";
                        break;
                    } else {
                        C0334.m2866();
                        break;
                    }
                case 30587:
                    return;
                case 31492:
                    C0369.m3258(this, m2518(this));
                    str = "ۣۧۢ";
                    break;
                case 31515:
                    webSettingsM2059 = C0229.m2059(m2518(this));
                    if (C0396.m5741() < 0) {
                        str = "۟ۦۢ";
                        break;
                    } else {
                        C0387.m5374();
                        break;
                    }
                case 31718:
                    C0368.m3162(m2518(this), new C0285(this));
                    str = "ۦ۠ۤ";
                    break;
                case 32739:
                    C0386.m5321(this, new DialogInterfaceOnDismissListenerC0281(this));
                    if (C0206.m1807() < 0) {
                        str = "ۧۢۨ";
                        break;
                    } else {
                        C0375.m4840();
                        break;
                    }
                case 1711484:
                    str = "۟ۧ۟";
                    break;
            }
        }
    }
}
