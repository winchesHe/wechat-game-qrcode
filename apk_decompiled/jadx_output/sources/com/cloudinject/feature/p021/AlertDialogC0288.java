package com.cloudinject.feature.p021;

import android.app.AlertDialog;
import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.content.DialogInterface;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.view.View;
import android.widget.Button;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

@Dex2C
/* renamed from: com.cloudinject.feature.̙̗.̗̙̖, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class AlertDialogC0288 extends AlertDialog {

    /* renamed from: ̖̙̖̖̖̙̖, reason: not valid java name and contains not printable characters */
    private View.OnClickListener f525;

    /* renamed from: ̖̙̖̙̙̙̗, reason: not valid java name and contains not printable characters */
    private Button f526;

    /* renamed from: ̖̙̙̖̙̙̖, reason: not valid java name and contains not printable characters */
    private View.OnClickListener f527;

    /* renamed from: ̙̖̖̖̙̙̖, reason: not valid java name and contains not printable characters */
    private Button f528;

    /* renamed from: ̙̖̙̙̖̖̖, reason: not valid java name and contains not printable characters */
    private Button f529;

    /* renamed from: ̙̖̙̙̙̙̗, reason: not valid java name and contains not printable characters */
    private View.OnClickListener f530;

    public AlertDialogC0288(Context context) {
        super(context);
    }

    /* renamed from: ۟۠ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static Button m2529(Object obj) {
        String str = "ۤۤ۟";
        Button button = null;
        Button button2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749727) {
                case 2176:
                    if (C0334.m2866() <= 0) {
                        break;
                    } else if (C0089.m592() > 0) {
                        str = "ۣۨۧ";
                    }
                case 3320:
                    str = "ۣۨ";
                    button = null;
                    continue;
                case 3896:
                    break;
                case 5566:
                    if (C0334.m2866() <= 0) {
                        C0082.m410();
                        button = button2;
                    } else {
                        str = "ۦۡۢ";
                        button = button2;
                        continue;
                    }
                case 7231:
                case 30494:
                    if (C0398.m5833() > 0) {
                        str = "ۦۡۢ";
                    } else {
                        continue;
                    }
                case 29528:
                    return button;
                case 31515:
                    button2 = ((AlertDialogC0288) obj).f528;
                    str = "۟ۢۤ";
                    continue;
                case 31698:
                    if (C0378.m4998() <= 0) {
                        str = "ۧۧۦ";
                    } else {
                        str = "ۤۤ۟";
                        continue;
                    }
                case 1732132:
                    if (C0378.m4998() <= 0) {
                        str = "ۧۤ۠";
                    } else {
                        str = "ۧۥ۟";
                        continue;
                    }
                case 1732347:
                    if (C0397.m5814() > 0) {
                        str = "ۥۤۦ";
                    } else {
                        continue;
                    }
            }
            str = "ۡۥ";
        }
    }

    /* renamed from: ۟ۡۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Button m2530(Object obj) {
        Object obj2 = "۟ۤۨ";
        Button button = null;
        Button button2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1747778) {
                case 31:
                    obj2 = "ۤۥ۠";
                    continue;
                case 62:
                    if (C0078.m361() <= 0) {
                        button = button2;
                    } else {
                        obj2 = "ۤۨۤ";
                        button = button2;
                        continue;
                    }
                case 1030:
                    button2 = ((AlertDialogC0288) obj).f529;
                    if (C0389.m5481() <= 0) {
                        C0400.m5961();
                    } else {
                        obj2 = "۠ۥۡ";
                        continue;
                    }
                case 1116:
                    if (C0009.m36() < 0) {
                        obj2 = "ۡۤۨ";
                    } else {
                        continue;
                    }
                case 1127:
                    if (C0060.m216() <= 0) {
                        C0375.m4840();
                        obj2 = "ۨۢۨ";
                        button = null;
                    } else {
                        obj2 = "۠ۤۡ";
                        button = null;
                        continue;
                    }
                case 3294:
                case 4413:
                    obj2 = "ۤۨۤ";
                    continue;
                case 3297:
                    if (C0121.m1023() > 0) {
                        break;
                    } else if (C0382.m5180() > 0) {
                        obj2 = "ۡۥۨ";
                    }
                case 4514:
                    return button;
                case 1734469:
                    if (C0376.m4906() <= 0) {
                        C0378.m4998();
                    } else {
                        obj2 = "۟ۤۨ";
                        continue;
                    }
                case 1734588:
                    break;
            }
            obj2 = "ۡۤۡ";
        }
    }

    /* renamed from: ۠ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static View.OnClickListener m2531(Object obj) {
        String str = "ۧ۟ۢ";
        View.OnClickListener onClickListener = null;
        View.OnClickListener onClickListener2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746693) {
                case 33:
                    if (C0121.m1023() >= 0) {
                        C0380.m5068();
                    } else {
                        str = "ۧ۟ۢ";
                        continue;
                    }
                case 222:
                    if (C0291.m2568() >= 0) {
                        onClickListener = null;
                    } else {
                        str = "ۧۡۤ";
                        onClickListener = null;
                        continue;
                    }
                case 4601:
                    if (C0060.m216() <= 0) {
                        str = "۠ۨ۠";
                    } else {
                        str = "۟ۦۢ";
                        continue;
                    }
                case 4603:
                    break;
                case 5573:
                    return onClickListener;
                case 6887:
                case 1735623:
                    if (C0395.m5698() >= 0) {
                        C0397.m5814();
                        str = "ۣۧۢ";
                    } else {
                        str = "ۣۢۡ";
                        continue;
                    }
                case 25103:
                    if (C0396.m5741() > 0) {
                        break;
                    } else if (C0228.m2012() <= 0) {
                        C0060.m216();
                    } else {
                        str = "ۦ۟ۢ";
                    }
                case 25167:
                    str = "ۦۨ";
                    continue;
                case 25860:
                    str = "ۣۢۡ";
                    onClickListener = onClickListener2;
                    continue;
                case 26188:
                    onClickListener2 = ((AlertDialogC0288) obj).f527;
                    str = "ۦۥ۠";
                    continue;
            }
            str = C0291.m2568() >= 0 ? "۠ۥۡ" : "ۣۧ۠";
        }
    }

    /* renamed from: ۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static View.OnClickListener m2532(Object obj) {
        Object obj2 = "ۣۣۢ";
        View.OnClickListener onClickListener = null;
        View.OnClickListener onClickListener2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1749665) {
                case 36:
                    if (C0386.m5322() <= 0) {
                        C0089.m592();
                        onClickListener = onClickListener2;
                    } else {
                        obj2 = "ۣۥ۟";
                        onClickListener = onClickListener2;
                        continue;
                    }
                case 127:
                case 6435:
                    if (C0335.m2923() >= 0) {
                        obj2 = "۠ۥۢ";
                    } else {
                        obj2 = "ۣۥ۟";
                        continue;
                    }
                case 1052:
                    return onClickListener;
                case 1059:
                    if (C0089.m592() < 0) {
                        break;
                    } else {
                        obj2 = "ۣۤۥ";
                    }
                case 1252:
                    obj2 = "ۥۨۨ";
                    onClickListener = null;
                    continue;
                case 2279:
                    onClickListener2 = ((AlertDialogC0288) obj).f530;
                    if (C0376.m4906() <= 0) {
                        C0388.m5430();
                    } else {
                        obj2 = "ۢۡۤ";
                        continue;
                    }
                case 3076:
                    obj2 = "ۢۤ۠";
                    continue;
                case 30634:
                    break;
                case 31593:
                    if (C0388.m5430() > 0) {
                        obj2 = "ۣۣۢ";
                    } else {
                        continue;
                    }
                case 31614:
                    if (C0420.m6215() >= 0) {
                        C0376.m4906();
                    } else {
                        obj2 = "ۣۣۡ";
                        continue;
                    }
            }
            if (C0370.m3284() < 0) {
                obj2 = "ۨۨ۟";
            }
        }
    }

    /* renamed from: ۦۥۡ۠, reason: contains not printable characters */
    public static Button m2533(Object obj) {
        Object obj2 = "ۣۥۦ";
        Button button = null;
        Button button2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 56354) {
                case 1710446:
                    button2 = ((AlertDialogC0288) obj).f526;
                    if (C0083.m448() < 0) {
                        obj2 = "ۢۢۧ";
                    } else {
                        continue;
                    }
                case 1710560:
                    obj2 = "ۦ۠ۧ";
                    button = null;
                    continue;
                case 1710628:
                case 1711718:
                    if (C0155.m1294() >= 0) {
                        C0183.m1464();
                    } else {
                        obj2 = "۠۟ۤ";
                        continue;
                    }
                case 1711439:
                    if (C0025.m118() > 0) {
                        obj2 = "ۧۧۦ";
                    } else {
                        continue;
                    }
                case 1729188:
                    if (C0397.m5814() > 0) {
                        obj2 = "ۣۥۦ";
                    } else {
                        continue;
                    }
                case 1730020:
                    if (C0378.m4998() <= 0) {
                        C0389.m5481();
                        obj2 = "۟ۨۢ";
                    } else {
                        obj2 = "ۧۥ۠";
                        continue;
                    }
                case 1731302:
                    if (C0393.m5668() < 0) {
                        break;
                    } else if (C0334.m2866() <= 0) {
                        C0376.m4906();
                        obj2 = "۟ۨ۠";
                    } else {
                        obj2 = "ۧۡۦ";
                    }
                case 1732229:
                    if (C0392.m5595() <= 0) {
                        C0394.m5672();
                        obj2 = "ۢۨ۠";
                        button = button2;
                    } else {
                        obj2 = "۠۟ۤ";
                        button = button2;
                        continue;
                    }
                case 1733411:
                    break;
                case 1734375:
                    return button;
            }
            if (C0387.m5374() < 0) {
                obj2 = "ۤ۟ۡ";
            }
        }
    }

    /* renamed from: ۨۧ۠۠, reason: not valid java name and contains not printable characters */
    public static View.OnClickListener m2534(Object obj) {
        String str = "ۢ۠ۡ";
        View.OnClickListener onClickListener = null;
        View.OnClickListener onClickListener2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753485) {
                case 2278:
                    if (C0375.m4840() >= 0) {
                        C0395.m5698();
                        onClickListener = onClickListener2;
                    } else {
                        str = "۟ۨۧ";
                        onClickListener = onClickListener2;
                        continue;
                    }
                case 26315:
                    onClickListener2 = ((AlertDialogC0288) obj).f525;
                    str = "ۨۤۧ";
                    continue;
                case 27027:
                    return onClickListener;
                case 27273:
                case 31721:
                    str = "۟ۨۧ";
                    continue;
                case 27382:
                    if (C0073.m265() <= 0) {
                        C0395.m5698();
                    } else {
                        str = "۠ۡۥ";
                        continue;
                    }
                case 28172:
                    if (C0074.m307() >= 0) {
                        C0393.m5668();
                        str = "ۣۦۣ";
                    } else {
                        str = "ۥۢۡ";
                        continue;
                    }
                case 28183:
                    break;
                case 29678:
                    if (C0385.m5282() >= 0) {
                        break;
                    } else if (C0392.m5595() <= 0) {
                        C0060.m216();
                    } else {
                        str = "۟ۡۨ";
                    }
                case 31849:
                    if (C0183.m1464() <= 0) {
                        C0025.m118();
                        onClickListener = null;
                    } else {
                        str = "۠ۥ۠";
                        onClickListener = null;
                        continue;
                    }
                case 1711408:
                    if (C0291.m2568() >= 0) {
                        C0334.m2866();
                    } else {
                        str = "ۢ۠ۡ";
                        continue;
                    }
            }
            str = "ۡۧۧ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0186 A[SYNTHETIC] */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void show() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p021.AlertDialogC0288.show():void");
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public void m2535(String str, View.OnClickListener onClickListener) {
        String str2 = "ۧۧۧ";
        int iIntValue = 0;
        DialogInterface.OnClickListener onClickListener2 = null;
        Integer num = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56445) {
                case 30:
                    str2 = "ۣۧۥ";
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    break;
                case 1709210:
                    str2 = "ۧۧۧ";
                    break;
                case 1709237:
                    return;
                case 1710391:
                    this.f525 = onClickListener;
                    if (C0179.m1427() > 0) {
                        str2 = "ۣۢ۠";
                        break;
                    } else {
                        str2 = "ۦ۠ۨ";
                        break;
                    }
                case 1710580:
                    C0382.m5154(this, ((iIntValue ^ (-1)) & 9325948) | ((-9325949) & iIntValue), str, onClickListener2);
                    if (C0379.m5056() > 0) {
                        str2 = "ۨ۟۟";
                        break;
                    } else {
                        C0399.m5914();
                        break;
                    }
                case 1710714:
                    Integer num2 = new Integer(-9325949);
                    if (C0420.m6215() < 0) {
                        str2 = "ۧۡۤ";
                        num = num2;
                        break;
                    } else {
                        C0074.m307();
                        num = num2;
                        break;
                    }
                case 1731100:
                    onClickListener2 = (DialogInterface.OnClickListener) null;
                    str2 = "ۣۦ";
                    break;
            }
        }
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    public void m2536(String str, View.OnClickListener onClickListener) {
        String str2 = "ۣۤ۠";
        int iIntValue = 0;
        DialogInterface.OnClickListener onClickListener2 = null;
        Integer num = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56512) {
                case 192:
                    this.f530 = onClickListener;
                    str2 = "۟ۧ";
                    break;
                case 1832:
                    DialogInterface.OnClickListener onClickListener3 = (DialogInterface.OnClickListener) null;
                    if (C0399.m5914() > 0) {
                        onClickListener2 = onClickListener3;
                        str2 = "ۣۢ۟";
                        break;
                    } else {
                        C0369.m3256();
                        onClickListener2 = onClickListener3;
                        str2 = "ۣ۟ۥ";
                        break;
                    }
                case 1729831:
                    str2 = "۠۠";
                    num = new Integer(-3877434);
                    break;
                case 1730179:
                    return;
                case 1732222:
                    str2 = "ۡۡۦ";
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    break;
                case 1733126:
                    C0382.m5154(this, ((iIntValue ^ (-1)) & 3877435) | ((-3877436) & iIntValue), str, onClickListener2);
                    if (C0279.m2491() < 0) {
                        str2 = "ۣۤۢ";
                        break;
                    } else {
                        C0384.m5278();
                        break;
                    }
                case 1733598:
                    if (C0384.m5278() <= 0) {
                        break;
                    } else {
                        str2 = "ۣۤ۠";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public void m2537(String str, View.OnClickListener onClickListener) {
        String str2 = "ۤۧۡ";
        int iIntValue = 0;
        DialogInterface.OnClickListener onClickListener2 = null;
        Integer num = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56510) {
                case 1710457:
                    return;
                case 1710781:
                    if (C0082.m410() < 0) {
                        str2 = "ۤۧۡ";
                        break;
                    } else {
                        C0291.m2568();
                        str2 = "ۦۢۦ";
                        break;
                    }
                case 1729880:
                    C0382.m5154(this, ((iIntValue ^ (-1)) & 5948918) | ((-5948919) & iIntValue), str, onClickListener2);
                    if (C0370.m3284() >= 0) {
                        break;
                    } else {
                        str2 = "ۧۥۥ";
                        break;
                    }
                case 1730048:
                    Integer num2 = new Integer(-5948920);
                    if (C0335.m2923() < 0) {
                        str2 = "ۣۣۤ";
                        num = num2;
                        break;
                    } else {
                        C0420.m6215();
                        num = num2;
                        break;
                    }
                case 1730298:
                    this.f527 = onClickListener;
                    if (C0060.m216() <= 0) {
                        break;
                    } else {
                        str2 = "ۢۤۥ";
                        break;
                    }
                case 1732189:
                    onClickListener2 = (DialogInterface.OnClickListener) null;
                    str2 = "۟ۦۥ";
                    break;
                case 1735520:
                    str2 = "ۤ۠ۢ";
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    break;
            }
        }
    }
}
