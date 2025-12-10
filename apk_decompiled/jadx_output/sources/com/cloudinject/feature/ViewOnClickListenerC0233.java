package com.cloudinject.feature;

import android.content.Intent;
import android.net.wifi.C0078;
import android.view.View;
import androidx.core.graphics.drawable.C0086;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p015.C0206;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.java.lang.C0400;

/* renamed from: com.cloudinject.feature.̗̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
class ViewOnClickListenerC0233 implements View.OnClickListener {

    /* renamed from: ̗̗̖̙̖̗̗, reason: not valid java name and contains not printable characters */
    final MainActivity f384;

    ViewOnClickListenerC0233(MainActivity mainActivity) {
        this.f384 = mainActivity;
    }

    /* renamed from: ۟ۦۦۧۥ, reason: not valid java name and contains not printable characters */
    public static MainActivity m2068(Object obj) {
        Object obj2 = "ۥ۟ۤ";
        MainActivity mainActivity = null;
        MainActivity mainActivity2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1747750) {
                case 1119:
                    obj2 = "ۧ۟ۤ";
                    continue;
                case 4356:
                    if (C0394.m5672() <= 0) {
                        C0370.m3284();
                        mainActivity = mainActivity2;
                    } else {
                        obj2 = "ۣۨ۟";
                        mainActivity = mainActivity2;
                        continue;
                    }
                case 5804:
                    if (C0369.m3256() <= 0) {
                        break;
                    } else if (C0385.m5282() < 0) {
                        obj2 = "ۨۥ۠";
                    }
                case 6269:
                    break;
                case 6565:
                case 28202:
                    if (C0380.m5068() > 0) {
                        obj2 = "ۣۨ۟";
                    } else {
                        continue;
                    }
                case 7424:
                    if (C0393.m5668() > 0) {
                        obj2 = "ۦۨ";
                    } else {
                        continue;
                    }
                case 25186:
                    return mainActivity;
                case 25253:
                    mainActivity2 = ((ViewOnClickListenerC0233) obj).f384;
                    if (C0078.m361() <= 0) {
                        C0377.m4944();
                    } else {
                        obj2 = "ۤۢ۠";
                        continue;
                    }
                case 1734628:
                    obj2 = "ۡۧ۟";
                    mainActivity = null;
                    continue;
                case 1734631:
                    if (C0397.m5814() > 0) {
                        obj2 = "ۥ۟ۤ";
                    } else {
                        continue;
                    }
            }
            obj2 = "ۣۣ۠";
        }
    }

    /* renamed from: ۥ۠ۨ۠, reason: contains not printable characters */
    public static void m2069(Object obj, Object obj2) {
        String str = "ۥۦۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752670) {
                case 63:
                    if (C0377.m4944() < 0) {
                        break;
                    } else if (C0385.m5282() >= 0) {
                        C0086.m500();
                    } else {
                        str = "ۢۡۤ";
                    }
                case 2371:
                case 3394:
                    str = "۠۟۟";
                    continue;
                case 3095:
                    if (C0368.m3171() < 0) {
                        str = "ۣۨۢ";
                    } else {
                        continue;
                    }
                case 3291:
                    ((MainActivity) obj).startActivity((Intent) obj2);
                    str = "۠۟۟";
                    continue;
                case 5278:
                    return;
                case 31837:
                    str = "ۥۦۢ";
                    continue;
                case 31870:
                    break;
            }
            if (C0400.m5961() <= 0) {
                C0206.m1807();
            } else {
                str = "ۢ۟ۦ";
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent = null;
        String str = "ۣۨۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754594) {
                case 1924:
                    return;
                case 3247:
                    intent = new Intent();
                    if (C0383.m5203() > 0) {
                        str = "ۨ۟";
                        break;
                    } else {
                        C0368.m3171();
                        break;
                    }
                case 25122:
                    if (C0392.m5595() > 0) {
                        str = "ۣۨۨ";
                        break;
                    } else {
                        C0184.m1524();
                        str = "۠ۨۡ";
                        break;
                    }
                case 30760:
                    m2069(m2068(this), intent);
                    if (C0384.m5278() > 0) {
                        str = "ۦۨۨ";
                        break;
                    } else {
                        str = "ۨۧۢ";
                        break;
                    }
                case 1710357:
                    C0184.m1510(intent, m2068(this), Main2Activity.class);
                    str = "ۥۡۦ";
                    break;
            }
        }
    }
}
