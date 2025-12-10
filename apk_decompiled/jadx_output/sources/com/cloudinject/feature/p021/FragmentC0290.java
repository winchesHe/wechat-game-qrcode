package com.cloudinject.feature.p021;

import android.app.C0009;
import android.app.Fragment;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.wifi.C0078;
import android.os.Bundle;
import android.support.annotation.̗̖̖̙;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import androidx.core.view.PointerIconCompat;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import mirrorb.android.accounts.C0375;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.net.C0389;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̙̗.̗̙̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class FragmentC0290 extends Fragment {

    /* renamed from: ̖̙̙̖̙̖̖, reason: not valid java name and contains not printable characters */
    private AbstractC0289 f531;

    /* renamed from: ۢۨۢۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC0289 m2538(Object obj) {
        String str = "ۢ۠ۤ";
        AbstractC0289 abstractC0289 = null;
        AbstractC0289 abstractC02892 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1749669) {
                case 195:
                    if (C0393.m5668() <= 0) {
                        break;
                    } else {
                        str = C0155.m1294() >= 0 ? "ۢۨۤ" : "۟ۤۨ";
                    }
                case 2072:
                    if (C0396.m5741() >= 0) {
                        str = "ۣۤۧ";
                    } else {
                        str = "۟ۢۤ";
                        continue;
                    }
                case 2244:
                    if (C0086.m500() <= 0) {
                        str = "ۡ۠۠";
                    } else {
                        str = "ۡۡ۟";
                        continue;
                    }
                case 5382:
                    abstractC02892 = ((FragmentC0290) obj).f531;
                    if (C0183.m1464() <= 0) {
                        C0184.m1524();
                    } else {
                        str = "ۣ۟";
                        continue;
                    }
                case 5531:
                    break;
                case 5572:
                case 7172:
                    if (C0400.m5961() > 0) {
                        str = "ۣۡ۟";
                    } else {
                        continue;
                    }
                case 6625:
                    if (C0082.m410() >= 0) {
                        str = "ۣۨۥ";
                    } else {
                        str = "ۢ۠ۤ";
                        continue;
                    }
                case 7194:
                    if (C0393.m5668() <= 0) {
                        C0383.m5203();
                        abstractC0289 = null;
                    } else {
                        str = "ۤۧ۠";
                        abstractC0289 = null;
                        continue;
                    }
                case 7256:
                    return abstractC0289;
                case 1730881:
                    str = "ۣۡ۟";
                    abstractC0289 = abstractC02892;
                    continue;
            }
            if (C0088.m573() <= 0) {
                C0396.m5741();
            } else {
                str = "ۤۤۡ";
            }
        }
    }

    @Override // android.app.Fragment
    public void onCreate(@̗̖̖̙ Bundle bundle) {
        AbstractC0289 abstractC0289M2538 = null;
        String str = "۟ۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747905) {
                case 130:
                    C0228.m2008(abstractC0289M2538);
                    str = "ۦ۠ۢ";
                    continue;
                case 4483:
                    if (abstractC0289M2538 == null) {
                        break;
                    } else {
                        str = "ۣ۠ۦ";
                    }
                case 27079:
                    if (C0392.m5595() > 0) {
                        str = "۟ۧ";
                    } else {
                        continue;
                    }
                case 27305:
                    return;
                case 28128:
                    abstractC0289M2538 = m2538(this);
                    str = "ۣۤۡ";
                    continue;
                case 1732649:
                    super.onCreate(bundle);
                    if (C0060.m216() <= 0) {
                        C0074.m307();
                    } else {
                        str = "ۧۨۢ";
                        continue;
                    }
                case 1734623:
                    break;
            }
            str = C0279.m2491() >= 0 ? "ۣۤۦ" : "ۦ۠ۢ";
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        AbstractC0289 abstractC0289M2538 = null;
        String str = "ۧۥۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755588) {
                case 2152:
                    break;
                case 3075:
                    super.onDestroy();
                    str = "ۡۧ";
                    continue;
                case 3077:
                    C0229.m2038(abstractC0289M2538);
                    if (C0375.m4840() >= 0) {
                        str = "ۢۨۦ";
                    } else {
                        str = "ۥۨۨ";
                        continue;
                    }
                case 28231:
                    if (abstractC0289M2538 == null) {
                        break;
                    } else {
                        str = C0229.m2064() >= 0 ? "۟ۢۡ" : "ۧۥ۟";
                    }
                case 30561:
                    return;
                case 30597:
                    if (C0009.m36() < 0) {
                        str = "ۧۥۥ";
                    } else {
                        continue;
                    }
                case 1709538:
                    abstractC0289M2538 = m2538(this);
                    str = "ۣ۟ۧ";
                    continue;
            }
            str = "ۥۨۨ";
        }
    }

    @Override // android.app.Fragment
    public void onPause() {
        AbstractC0289 abstractC0289M2538 = null;
        String str = "ۦۦۣ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747899) {
                case 38:
                    abstractC0289M2538 = m2538(this);
                    str = "ۣۢۡ";
                    continue;
                case 3270:
                    return;
                case 5599:
                    C0089.m630(abstractC0289M2538);
                    if (C0088.m573() <= 0) {
                        C0155.m1294();
                        str = "ۣ۠۟";
                    } else {
                        str = "ۣ۟ۡ";
                        continue;
                    }
                case 6297:
                    break;
                case 7641:
                    if (abstractC0289M2538 == null) {
                        break;
                    } else if (C0398.m5833() <= 0) {
                        C0334.m2866();
                    } else {
                        str = "ۥۦۥ";
                    }
                case 27032:
                    super.onPause();
                    if (C0397.m5814() <= 0) {
                        str = "ۨۥ۟";
                    } else {
                        str = "۠ۦۣ";
                        continue;
                    }
                case 27038:
                    str = "ۦۦۣ";
                    continue;
            }
            str = "ۣ۟ۡ";
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        AbstractC0289 abstractC0289M2538 = null;
        String str = "ۥۦۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749792) {
                case 509:
                    if (C0400.m5961() > 0) {
                        str = "ۥۦۢ";
                    } else {
                        continue;
                    }
                case 3393:
                    super.onResume();
                    str = "ۡۨ";
                    continue;
                case 7195:
                    C0089.m609(abstractC0289M2538);
                    if (C0164.m1359() >= 0) {
                        str = "ۨۨ۟";
                    } else {
                        str = "ۤۧ";
                        continue;
                    }
                case 30404:
                    if (abstractC0289M2538 == null) {
                        break;
                    } else if (C0391.m5571() > 0) {
                        str = "ۡۥ۟";
                    }
                case 1732359:
                    abstractC0289M2538 = m2538(this);
                    if (C0362.m3122() >= 0) {
                        C0335.m2923();
                    } else {
                        str = "ۧۦۣ";
                        continue;
                    }
                case 1732507:
                    break;
                case 1732515:
                    return;
            }
            if (C0073.m265() <= 0) {
                C0078.m361();
            } else {
                str = "ۤۧ";
            }
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        AbstractC0289 abstractC0289M2538 = null;
        String str = "ۣۢۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56576) {
                case 1709187:
                    C0229.m2033(abstractC0289M2538);
                    if (C0375.m4840() >= 0) {
                        C0346.m3059();
                    } else {
                        str = "ۥۦۥ";
                        continue;
                    }
                case 1711881:
                    if (abstractC0289M2538 == null) {
                        break;
                    } else if (C0390.m5512() <= 0) {
                        C0229.m2064();
                        str = "ۣۡۡ";
                    } else {
                        str = "ۨۥ۠";
                    }
                case 1729380:
                    return;
                case 1730376:
                    abstractC0289M2538 = m2538(this);
                    if (C0396.m5741() >= 0) {
                        C0155.m1294();
                        str = "ۡ۟";
                    } else {
                        str = "ۦۥۨ";
                        continue;
                    }
                case 1732158:
                    super.onStart();
                    str = "ۣۤۧ";
                    continue;
                case 1733567:
                    break;
                case 1734600:
                    if (C0420.m6215() >= 0) {
                        C0391.m5571();
                    } else {
                        str = "ۣۢۧ";
                        continue;
                    }
            }
            if (C0377.m4944() <= 0) {
                C0383.m5203();
            } else {
                str = "ۥۦۥ";
            }
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        AbstractC0289 abstractC0289M2538 = null;
        String str = "ۣۧۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753546) {
                case PointerIconCompat.TYPE_ALL_SCROLL /* 1013 */:
                    abstractC0289M2538 = m2538(this);
                    if (C0334.m2866() <= 0) {
                        C0121.m1023();
                        str = "ۤۢۤ";
                    } else {
                        str = "۟ۨۧ";
                        continue;
                    }
                case 1187:
                    return;
                case 2024:
                    super.onStop();
                    if (C0179.m1427() <= 0) {
                        C0398.m5833();
                    } else {
                        str = "ۦۧ۠";
                        continue;
                    }
                case 27092:
                    if (abstractC0289M2538 == null) {
                        break;
                    } else {
                        str = "ۤۧ";
                    }
                case 30440:
                    break;
                case 32618:
                    str = "ۣۧۨ";
                    continue;
                case 1711433:
                    C0184.m1516(abstractC0289M2538);
                    str = "ۧۢۤ";
                    continue;
            }
            if (C0397.m5814() <= 0) {
                C0400.m5961();
                str = "ۨ۠ۨ";
            } else {
                str = "ۧۢۤ";
            }
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public void m2539(AbstractC0289 abstractC0289) {
        String str = "ۨۢۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749701) {
                case 2818:
                    str = "ۨۢۨ";
                    break;
                case 31555:
                    return;
                case 31723:
                    this.f531 = abstractC0289;
                    if (C0389.m5481() > 0) {
                        str = "ۨۥۣ";
                        break;
                    } else {
                        C0088.m573();
                        str = "۠ۦ۠";
                        break;
                    }
            }
        }
    }
}
