package com.cloudinject.feature.p021.p022;

import android.app.AlertDialog;
import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.C0073;
import android.graphics.drawable.Drawable;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.view.View;
import android.widget.EditText;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.AlertDialogC0273;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0340;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.util.concurrent.atomic.AtomicBoolean;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̙̗.̗.̗̗, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class AlertDialogC0277 extends AlertDialogC0273 implements InterfaceC0275 {
    private int color;
    private View view;

    /* renamed from: ̖̙̖̖̖̙̗, reason: not valid java name and contains not printable characters */
    private final AtomicBoolean f512;

    /* renamed from: ̖̙̙̙̙̙̗, reason: not valid java name and contains not printable characters */
    private EditText f513;

    public AlertDialogC0277(Context context, C0340 c0340) {
        super(context);
        String str = "ۣۡۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747713) {
                case 4392:
                    if (C0086.m500() > 0) {
                        str = "ۣۡۦ";
                        break;
                    } else {
                        C0384.m5278();
                        break;
                    }
                case 7497:
                    this.f512 = new AtomicBoolean(false);
                    if (C0291.m2568() < 0) {
                        str = "ۦۧ۟";
                        break;
                    } else {
                        C0362.m3122();
                        str = "ۦۥۤ";
                        break;
                    }
                case 25289:
                    m2457(this, c0340);
                    if (C0398.m5833() <= 0) {
                        break;
                    } else {
                        str = "ۨ۠";
                        break;
                    }
                case 26943:
                    this.color = 0;
                    str = "ۨۧۧ";
                    break;
                case 1734649:
                    return;
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    private void m2453(C0340 c0340) {
        Object obj = "ۤۥ";
        int iM5840 = 0;
        int iM585 = 0;
        while (true) {
            switch (C0395.m5690(obj) ^ 1746687) {
                case 2402:
                    iM5840 = C0398.m5840(C0086.m523(c0340), C0385.m5310(C0009.m42()));
                    if (C0382.m5180() > 0) {
                        obj = "۟ۨۤ";
                        break;
                    } else {
                        C0375.m4840();
                        break;
                    }
                case 2495:
                    return;
                case 3812:
                    this.f513 = (EditText) C0184.m1507(m2455(this), iM5840);
                    if (C0346.m3059() >= 0) {
                        break;
                    } else {
                        obj = "ۡۥۤ";
                        break;
                    }
                case 7389:
                    this.view = C0228.m2029(C0385.m5288(C0164.m1370(c0340)), iM585, null, false);
                    obj = "ۡۨۤ";
                    break;
                case 1735171:
                    if (C0397.m5814() <= 0) {
                        break;
                    } else {
                        obj = "ۤۥ";
                        break;
                    }
                case 1735294:
                    iM585 = C0088.m585(C0086.m523(c0340), C0385.m5310(C0086.m503()));
                    if (C0121.m1023() < 0) {
                        obj = "ۤۢ۠";
                        break;
                    } else {
                        C0380.m5068();
                        break;
                    }
            }
        }
    }

    /* renamed from: ۟ۡۢۧۤ, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m2454(Object obj) {
        Object obj2 = "ۧۤۢ";
        AtomicBoolean atomicBoolean = null;
        AtomicBoolean atomicBoolean2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1750818) {
                case 63:
                    if (C0376.m4906() <= 0) {
                        atomicBoolean = null;
                    } else {
                        obj2 = "ۣۣ۟";
                        atomicBoolean = null;
                        continue;
                    }
                case 384:
                    return atomicBoolean;
                case 509:
                    if (C0398.m5833() <= 0) {
                        C0387.m5374();
                        atomicBoolean = atomicBoolean2;
                    } else {
                        obj2 = "ۣۣۤ";
                        atomicBoolean = atomicBoolean2;
                        continue;
                    }
                case 1385:
                    break;
                case 4130:
                    obj2 = "ۣۨۢ";
                    continue;
                case 4189:
                    if (C0386.m5322() <= 0) {
                        C0384.m5278();
                        obj2 = "ۡ۟ۦ";
                    } else {
                        obj2 = "ۨۧۡ";
                        continue;
                    }
                case 6206:
                    if (C0397.m5814() <= 0) {
                        C0389.m5481();
                        obj2 = "۠ۦۢ";
                    } else {
                        obj2 = "ۧۤۢ";
                        continue;
                    }
                case 6332:
                    atomicBoolean2 = ((AlertDialogC0277) obj).f512;
                    if (C0385.m5282() < 0) {
                        obj2 = "ۣۦۢ";
                    } else {
                        continue;
                    }
                case 29319:
                    if (C0378.m4998() < 0) {
                        break;
                    } else {
                        obj2 = "ۡۨۥ";
                    }
                case 32455:
                case 32480:
                    if (C0291.m2568() >= 0) {
                        C0393.m5668();
                        obj2 = "ۣۣۢ";
                    } else {
                        obj2 = "ۣۣۤ";
                        continue;
                    }
            }
            if (C0375.m4840() >= 0) {
                C0082.m410();
            } else {
                obj2 = "۟۟۠";
            }
        }
    }

    /* renamed from: ۣ۟ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static View m2455(Object obj) {
        Object obj2 = "ۢ۠ۦ";
        View view = null;
        View view2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1748611) {
                case 413:
                    break;
                case 1306:
                    if (C0279.m2491() < 0) {
                        obj2 = "ۢ۠ۦ";
                    } else {
                        continue;
                    }
                case 1342:
                    if (C0279.m2491() >= 0) {
                        view = null;
                    } else {
                        obj2 = "ۧۤ۟";
                        view = null;
                        continue;
                    }
                case 2336:
                case 5256:
                    obj2 = "ۥۧ۟";
                    continue;
                case 4299:
                    if (C0384.m5278() > 0) {
                        obj2 = "۠ۧۤ";
                    } else {
                        continue;
                    }
                case 4350:
                    return view;
                case 6314:
                    if (C0279.m2491() >= 0) {
                        C0395.m5698();
                        view = view2;
                    } else {
                        obj2 = "ۥۧ۟";
                        view = view2;
                        continue;
                    }
                case 7403:
                    if (C0183.m1464() < 0) {
                        break;
                    } else if (C0380.m5068() > 0) {
                        obj2 = "ۥۡ";
                    }
                case 27425:
                    if (C0375.m4840() < 0) {
                        obj2 = "۟ۤۨ";
                    } else {
                        continue;
                    }
                case 1733151:
                    view2 = ((AlertDialogC0277) obj).view;
                    if (C0229.m2064() >= 0) {
                        C0381.m5127();
                    } else {
                        obj2 = "ۣ۠ۦ";
                        continue;
                    }
            }
            if (C0376.m4906() <= 0) {
                C0335.m2923();
            } else {
                obj2 = "ۥۥۨ";
            }
        }
    }

    /* renamed from: ۥ۟ۢۨ, reason: contains not printable characters */
    public static EditText m2456(Object obj) {
        String str = "۠ۡۥ";
        EditText editText = null;
        EditText editText2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749728) {
                case 478:
                    editText2 = ((AlertDialogC0277) obj).f513;
                    str = "ۦۢۤ";
                    continue;
                case 5439:
                    if (C0082.m410() >= 0) {
                        C0388.m5430();
                        editText = null;
                    } else {
                        str = "ۦۨ۟";
                        editText = null;
                        continue;
                    }
                case 5533:
                    if (C0291.m2568() >= 0) {
                        C0375.m4840();
                        str = "ۣۥۥ";
                    } else {
                        str = "۟ۦۦ";
                        continue;
                    }
                case 6626:
                    if (C0086.m500() <= 0) {
                        C0377.m4944();
                    } else {
                        str = "۠ۡۥ";
                        continue;
                    }
                case 6628:
                    if (C0088.m573() < 0) {
                        break;
                    } else {
                        str = "ۣۢۧ";
                    }
                case 6909:
                    break;
                case 7651:
                case 31553:
                    if (C0370.m3284() >= 0) {
                        C0377.m4944();
                        str = "ۢ۠۟";
                    } else {
                        str = "ۥۨ";
                        continue;
                    }
                case 28861:
                    if (C0009.m36() >= 0) {
                        C0394.m5672();
                    } else {
                        str = "ۣۡۥ";
                        continue;
                    }
                case 29512:
                    if (C0078.m361() <= 0) {
                        C0379.m5056();
                        editText = editText2;
                    } else {
                        str = "ۥۨ";
                        editText = editText2;
                        continue;
                    }
                case 1732163:
                    return editText;
            }
            if (C0073.m265() <= 0) {
                C0228.m2012();
                str = "ۤۨۤ";
            } else {
                str = "ۣ۟ۡ";
            }
        }
    }

    /* renamed from: ۦۢۥۡ, reason: contains not printable characters */
    public static void m2457(Object obj, Object obj2) {
        String str = "۠ۦۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755553) {
                case 2984:
                    ((AlertDialogC0277) obj).m2453((C0340) obj2);
                    if (C0369.m3256() <= 0) {
                        C0386.m5322();
                        str = "۟ۢۧ";
                    } else {
                        str = "ۢ۟ۤ";
                        continue;
                    }
                case 25146:
                    if (C0025.m118() < 0) {
                        break;
                    } else if (C0376.m4906() <= 0) {
                        C0376.m4906();
                    } else {
                        str = "ۦۥۨ";
                    }
                case 26144:
                case 31421:
                    if (C0383.m5203() <= 0) {
                        C0206.m1807();
                        str = "ۢۦ";
                    } else {
                        str = "ۢ۟ۤ";
                        continue;
                    }
                case 28387:
                    str = "۠ۦۡ";
                    continue;
                case 31526:
                    if (C0392.m5595() > 0) {
                        str = "ۡۧۧ";
                    } else {
                        continue;
                    }
                case 31718:
                    return;
                case 32443:
                    break;
            }
            str = C0376.m4906() <= 0 ? "ۡۨۥ" : "ۢۡۦ";
        }
    }

    /* renamed from: ۦۦۤۡ, reason: contains not printable characters */
    public static int m2458(Object obj) {
        Object obj2 = "ۣۨۧ";
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1748803) {
                case 384:
                    if (C0398.m5833() <= 0) {
                        C0164.m1359();
                        obj2 = "ۢۥ۠";
                    } else {
                        obj2 = "ۣۨۧ";
                        continue;
                    }
                case 4769:
                    if (C0228.m2012() > 0) {
                        obj2 = "ۢۢ۠";
                    } else {
                        continue;
                    }
                case 5378:
                    break;
                case 5477:
                case 6239:
                    if (C0420.m6215() >= 0) {
                        C0387.m5374();
                    } else {
                        obj2 = "ۣۢ۟";
                        continue;
                    }
                case 6435:
                    return i;
                case 7591:
                    i2 = ((AlertDialogC0277) obj).color;
                    if (C0383.m5203() > 0) {
                        obj2 = "ۨۥۧ";
                    } else {
                        continue;
                    }
                case 7651:
                    if (C0164.m1359() >= 0) {
                        i = 0;
                    } else {
                        obj2 = "ۦۤ";
                        i = 0;
                        continue;
                    }
                case 26247:
                    if (C0388.m5430() < 0) {
                        break;
                    } else if (C0390.m5512() > 0) {
                        obj2 = "ۢۤۦ";
                    }
                case 26313:
                    if (C0396.m5741() >= 0) {
                        C0400.m5961();
                        i = i2;
                    } else {
                        obj2 = "ۣۢ۟";
                        i = i2;
                        continue;
                    }
                case 1733629:
                    obj2 = "ۣۨۡ";
                    continue;
            }
            obj2 = "ۥۢ۟";
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.cloudinject.feature.p021.p022.InterfaceC0275
    public void dismiss() {
        String str = "ۦۧۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747810) {
                case 1469:
                    return;
                case 6621:
                    if (C0025.m118() <= 0) {
                        break;
                    } else {
                        str = "ۦۧۦ";
                        break;
                    }
                case 26919:
                    super.dismiss();
                    if (C0228.m2012() <= 0) {
                        break;
                    } else {
                        str = "ۡۢ۠";
                        break;
                    }
            }
        }
    }

    @Override // com.cloudinject.feature.p021.p022.InterfaceC0275
    public EditText getEditText() {
        String str = "ۣۢۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754440) {
                case 3105:
                    str = "ۣۢۥ";
                    continue;
                case 3170:
                    break;
                case 25323:
                    C0279.m2499(this, m2455(this));
                    if (C0155.m1294() >= 0) {
                        C0386.m5322();
                    } else {
                        str = "ۡۢۥ";
                        continue;
                    }
                case 27564:
                    return m2456(this);
                case 30604:
                    if (C0078.m374(m2454(this), true)) {
                        break;
                    } else if (C0420.m6215() < 0) {
                        str = "۟ۤۨ";
                    }
            }
            str = "ۡۢۥ";
        }
    }

    @Override // android.app.AlertDialog, com.cloudinject.feature.p021.p022.InterfaceC0275
    public void setIcon(Drawable drawable) {
        String str = "ۥۨۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748830) {
                case 4570:
                    return;
                case 4604:
                    super.setIcon(drawable);
                    if (C0229.m2064() >= 0) {
                        break;
                    } else {
                        str = "ۥۧۦ";
                        break;
                    }
                case 1733536:
                    str = "ۥۨۥ";
                    break;
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    public void setMessage(String str) {
        String str2 = "ۡۤۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755624) {
                case 25359:
                    if (C0384.m5278() > 0) {
                        str2 = "ۡۤۧ";
                        break;
                    } else {
                        C0391.m5571();
                        str2 = "ۦۨۤ";
                        break;
                    }
                case 26316:
                    super.setMessage(str);
                    if (C0073.m265() <= 0) {
                        break;
                    } else {
                        str2 = "۟۠ۡ";
                        break;
                    }
                case 28360:
                    return;
            }
        }
    }

    @Override // com.cloudinject.feature.p021.p022.InterfaceC0275
    public void setThemeColor(String str) {
        String str2 = "ۧۤۥ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755591) {
                case 110:
                    return;
                case 2095:
                    str2 = "ۧۤۥ";
                    break;
                case 3136:
                case 1709337:
                    if (C0082.m410() >= 0) {
                        break;
                    } else {
                        str2 = "ۨۦۧ";
                        break;
                    }
                case 3183:
                    str2 = "ۣۡۧ";
                    break;
                case 26306:
                    try {
                        this.color = C0083.m464(str);
                        str2 = "ۨۦۧ";
                        break;
                    } catch (Exception e) {
                        if (C0393.m5668() > 0) {
                            str2 = "ۣۣۧ";
                            break;
                        } else {
                            C0383.m5203();
                            str2 = "۟ۤۤ";
                            break;
                        }
                    }
                case 31367:
                    str2 = "ۣۡۧ";
                    break;
            }
        }
    }

    @Override // com.cloudinject.feature.p021.p022.InterfaceC0275
    public void setTitle(String str) {
        String str2 = "ۥۢۢ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1749636) {
                case 101:
                    return;
                case 3937:
                    super.setTitle((CharSequence) str);
                    str2 = "ۣۢۤ";
                    break;
                case 5383:
                    str2 = "ۥۢۢ";
                    break;
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    /* renamed from: ̗ */
    public void mo2397(String str, View.OnClickListener onClickListener) {
        String str2 = "ۨۦ۟";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1752586) {
                case 5455:
                    return;
                case 30635:
                    super.mo2397(str, onClickListener);
                    if (C0369.m3256() > 0) {
                        str2 = "ۣ۠ۨ";
                        break;
                    } else {
                        C0060.m216();
                        break;
                    }
                case 32705:
                    if (C0179.m1427() > 0) {
                        str2 = "ۨۦ۟";
                        break;
                    } else {
                        C0400.m5961();
                        str2 = "۟ۦۡ";
                        break;
                    }
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    /* renamed from: ̗̖ */
    public void mo2398(String str, View.OnClickListener onClickListener) {
        String str2 = "۟ۤۥ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1747650) {
                case 1473:
                    return;
                case 3426:
                    super.mo2398(str, onClickListener);
                    if (C0083.m448() < 0) {
                        str2 = "ۣۡۥ";
                        break;
                    } else {
                        str2 = "ۡۢۡ";
                        break;
                    }
                case 1734273:
                    if (C0389.m5481() <= 0) {
                        break;
                    } else {
                        str2 = "۟ۤۥ";
                        break;
                    }
            }
        }
    }

    @Override // com.cloudinject.feature.p021.p022.InterfaceC0275
    /* renamed from: ̗̖̖ */
    public void mo2433(String str, String str2) {
        String str3 = "ۡۨۢ";
        while (true) {
            switch (C0395.m5690((Object) str3) ^ 1752546) {
                case 1925:
                    str3 = "ۡۨۢ";
                    break;
                case 3906:
                    return;
                case 4729:
                    C0191.m1635(m2456(this), str2);
                    str3 = "ۢۢ۠";
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    @Override // com.cloudinject.feature.p021.p022.InterfaceC0275
    /* renamed from: ̗̗̙̖̖̗ */
    public AlertDialog mo2434() {
        ColorStateList colorStateListM5485 = null;
        int iIntValue = 0;
        int iIntValue2 = 0;
        int i = 0;
        Integer[] numArr = null;
        Object obj = "ۣۤۦ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1746904) {
                case 24:
                    if (C0383.m5203() <= 0) {
                        obj = "ۦۡۦ";
                    } else {
                        obj = "ۣۤۦ";
                        continue;
                    }
                case 123:
                    C0391.m5576(C0060.m213(this, ((iIntValue ^ (-1)) & 1163548) | ((-1163549) & iIntValue)), m2458(this));
                    if (C0073.m265() > 0) {
                        obj = "ۧۡۧ";
                    } else {
                        continue;
                    }
                case 2117:
                    C0381.m5107(this);
                    obj = "ۨۥ";
                    continue;
                case 3173:
                    numArr[1] = new Integer(-2401522);
                    obj = "ۥۨۤ";
                    continue;
                case 3359:
                    C0391.m5576(C0060.m213(this, ((i ^ (-1)) & 2401521) | ((-2401522) & i)), m2458(this));
                    obj = "ۨۧ";
                    continue;
                case 4046:
                    int iIntValue3 = numArr[1].intValue();
                    if (C0378.m4998() <= 0) {
                        i = iIntValue3;
                        obj = "ۨ۠۟";
                    } else {
                        i = iIntValue3;
                        obj = "۠۟ۦ";
                        continue;
                    }
                case 5305:
                    obj = "ۡۨۤ";
                    continue;
                case 5402:
                    numArr[2] = new Integer(-1163550);
                    obj = "ۢۨۧ";
                    continue;
                case 5523:
                    return this;
                case 6521:
                    numArr[0] = new Integer(-8484818);
                    obj = "ۣۣۢ";
                    continue;
                case 7583:
                    numArr = new Object[3];
                    obj = "۠ۧۤ";
                    continue;
                case 25183:
                    C0383.m5221(m2456(this), colorStateListM5485);
                    obj = "ۢ۟ۨ";
                    continue;
                case 25237:
                    colorStateListM5485 = C0389.m5485(m2458(this));
                    if (C0335.m2923() < 0) {
                        obj = "ۣۣۧ";
                    } else {
                        continue;
                    }
                case 28241:
                    iIntValue = numArr[2].intValue();
                    if (C0362.m3122() >= 0) {
                        C0385.m5282();
                    } else {
                        obj = "۟ۤۨ";
                        continue;
                    }
                case 1735461:
                    if (m2458(this) == 0) {
                        break;
                    } else if (C0060.m216() > 0) {
                        obj = "۟ۨ۟";
                    }
                case 1735463:
                    iIntValue2 = numArr[0].intValue();
                    obj = "ۣۤ";
                    continue;
                case 1735609:
                    C0391.m5576(C0060.m213(this, ((iIntValue2 ^ (-1)) & 8484819) | ((-8484820) & iIntValue2)), m2458(this));
                    if (C0375.m4840() >= 0) {
                        C0385.m5282();
                    } else {
                        obj = "ۨۥۦ";
                        continue;
                    }
                case 1735643:
                    break;
            }
            if (C0073.m265() <= 0) {
                C0121.m1023();
            } else {
                obj = "ۢ۟ۨ";
            }
        }
    }

    @Override // com.cloudinject.feature.p021.p022.InterfaceC0275
    /* renamed from: ̗̙̙̖̗ */
    public void mo2435(int i) {
        String str = "ۤۨۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748739) {
                case 1187:
                    if (C0228.m2012() <= 0) {
                        break;
                    } else {
                        str = "ۤۨۨ";
                        break;
                    }
                case 5500:
                    return;
                case 5607:
                    C0191.m1663(C0060.m213(this, i));
                    if (C0394.m5672() > 0) {
                        str = "ۤۥ۠";
                        break;
                    } else {
                        C0375.m4840();
                        break;
                    }
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    /* renamed from: ̙ */
    public void mo2399(String str, View.OnClickListener onClickListener) {
        String str2 = "۠ۢۤ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1750627) {
                case 33:
                    if (C0370.m3284() < 0) {
                        str2 = "۠ۢۤ";
                        break;
                    } else {
                        C0388.m5430();
                        str2 = "ۨ۠ۢ";
                        break;
                    }
                case 7489:
                    super.mo2399(str, onClickListener);
                    if (C0078.m361() > 0) {
                        str2 = "ۨۡۤ";
                        break;
                    } else {
                        C0380.m5068();
                        break;
                    }
                case 32616:
                    return;
            }
        }
    }
}
