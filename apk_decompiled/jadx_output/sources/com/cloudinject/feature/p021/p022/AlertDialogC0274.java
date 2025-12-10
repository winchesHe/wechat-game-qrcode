package com.cloudinject.feature.p021.p022;

import android.app.AlertDialog;
import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.database.C0073;
import android.database.C0074;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.customview.FeatureButton;
import com.cloudinject.customview.FeatureLinearLayout;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.AlertDialogC0273;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0340;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
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
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̙̗.̗.̖, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class AlertDialogC0274 extends AlertDialogC0273 implements InterfaceC0275 {

    /* renamed from: ̖̖̖̖̖̖̖, reason: not valid java name and contains not printable characters */
    private FeatureButton f492;

    /* renamed from: ̖̖̙̖̖̖̙, reason: not valid java name and contains not printable characters */
    private FeatureButton f493;

    /* renamed from: ̖̙̙̙̖̙̗, reason: not valid java name and contains not printable characters */
    private TextView f494;

    /* renamed from: ̖̙̙̙̙̖̙, reason: not valid java name and contains not printable characters */
    private ImageView f495;

    /* renamed from: ̙̖̖̖̖̙̗, reason: not valid java name and contains not printable characters */
    private FeatureLinearLayout f496;

    /* renamed from: ̙̙̖̙̖̖̗, reason: not valid java name and contains not printable characters */
    private TextView f497;

    /* renamed from: ̙̙̖̙̖̙̗, reason: not valid java name and contains not printable characters */
    private FeatureButton f498;

    /* renamed from: ̙̙̙̖̖̙̖, reason: not valid java name and contains not printable characters */
    private EditText f499;

    public AlertDialogC0274(Context context, C0340 c0340) {
        Integer num = new Integer(4345777);
        super(context);
        int iM585 = 0;
        View view = null;
        GradientDrawable gradientDrawable = null;
        int i = 0;
        int i2 = 0;
        float[] fArr = null;
        Object obj = "ۣۥۧ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1755337) {
                case 2729:
                    this.f493 = (FeatureButton) C0184.m1507(view, C0398.m5840(C0086.m523(c0340), C0385.m5310(C0074.m284())));
                    if (C0121.m1023() >= 0) {
                        break;
                    } else {
                        obj = "ۢۡۧ";
                        break;
                    }
                case 3397:
                    return;
                case 3437:
                    C0375.m4861(m2432(this), i2);
                    if (C0362.m3122() < 0) {
                        obj = "ۣ۠۠";
                        break;
                    } else {
                        obj = "ۣ۟۟";
                        break;
                    }
                case 3468:
                    C0155.m1310(gradientDrawable, C0083.m464(C0385.m5310(C0164.m1353())));
                    obj = "ۥۧۦ";
                    break;
                case 24777:
                    View viewM2029 = C0228.m2029(C0385.m5288(C0164.m1370(c0340)), iM585, null, false);
                    if (C0378.m4998() > 0) {
                        view = viewM2029;
                        obj = "ۣۥۥ";
                        break;
                    } else {
                        C0379.m5056();
                        view = viewM2029;
                        obj = "ۨۧۡ";
                        break;
                    }
                case 25588:
                    C0089.m599(this, view);
                    obj = "ۣۧۨ";
                    break;
                case 26515:
                    C0191.m1652(gradientDrawable, fArr);
                    if (C0089.m592() > 0) {
                        obj = "ۧۡ۟";
                        break;
                    } else {
                        obj = "ۥۥ۠";
                        break;
                    }
                case 28425:
                    this.f496 = (FeatureLinearLayout) C0184.m1507(view, C0398.m5840(C0086.m523(c0340), C0385.m5310(C0385.m5307())));
                    if (C0381.m5127() > 0) {
                        obj = "ۤۦ۟";
                        break;
                    } else {
                        C0346.m3059();
                        obj = "ۣۧۤ";
                        break;
                    }
                case 28435:
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    if (C0009.m36() < 0) {
                        gradientDrawable = gradientDrawable2;
                        obj = "ۣۣۡ";
                        break;
                    } else {
                        C0392.m5595();
                        gradientDrawable = gradientDrawable2;
                        obj = "ۣۤ";
                        break;
                    }
                case 28467:
                    this.f499 = (EditText) C0184.m1507(view, C0398.m5840(C0086.m523(c0340), C0385.m5310(C0398.m5849())));
                    obj = "ۡۤ";
                    break;
                case 28523:
                    this.f494 = (TextView) C0184.m1507(view, C0398.m5840(C0086.m523(c0340), C0385.m5310(C0389.m5492())));
                    if (C0393.m5668() > 0) {
                        obj = "۟ۧۢ";
                        break;
                    } else {
                        C0420.m6215();
                        obj = "ۣۣ۟";
                        break;
                    }
                case 28654:
                    if (C0155.m1294() >= 0) {
                        break;
                    } else {
                        obj = "ۣۥۧ";
                        break;
                    }
                case 29197:
                    fArr[0] = 10.0f;
                    fArr[1] = 10.0f;
                    fArr[2] = 10.0f;
                    fArr[3] = 10.0f;
                    fArr[4] = 10.0f;
                    fArr[5] = 10.0f;
                    fArr[6] = 10.0f;
                    fArr[7] = 10.0f;
                    if (C0386.m5322() > 0) {
                        obj = "ۡۦ۟";
                        break;
                    } else {
                        C0375.m4840();
                        break;
                    }
                case 29259:
                    fArr = new float[i2];
                    if (C0155.m1294() >= 0) {
                        break;
                    } else {
                        obj = "ۤۧۧ";
                        break;
                    }
                case 29268:
                    this.f495 = (ImageView) C0184.m1507(view, C0398.m5840(C0086.m523(c0340), C0385.m5310(C0398.m5845())));
                    if (C0383.m5203() > 0) {
                        obj = "ۣۣ۠";
                        break;
                    } else {
                        C0382.m5180();
                        break;
                    }
                case 29366:
                    i2 = ((-4345786) & i) | ((i ^ (-1)) & 4345785);
                    if (C0089.m592() <= 0) {
                        break;
                    } else {
                        obj = "ۤۥۣ";
                        break;
                    }
                case 30285:
                    C0393.m5654(m2429(this), gradientDrawable);
                    if (C0385.m5282() < 0) {
                        obj = "ۧۤۡ";
                        break;
                    } else {
                        obj = "۟ۨ";
                        break;
                    }
                case 31297:
                    this.f498 = (FeatureButton) C0184.m1507(view, C0398.m5840(C0086.m523(c0340), C0385.m5310(C0334.m2854())));
                    obj = "۟ۥۦ";
                    break;
                case 31702:
                    int iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    if (C0386.m5322() > 0) {
                        i = iIntValue;
                        obj = "ۤۥ۠";
                        break;
                    } else {
                        i = iIntValue;
                        obj = "ۥۣ۠";
                        break;
                    }
                case 32266:
                    this.f497 = (TextView) C0184.m1507(view, C0398.m5840(C0086.m523(c0340), C0385.m5310(C0420.m6247())));
                    obj = "۟ۤۧ";
                    break;
                case 32268:
                    iM585 = C0088.m585(C0086.m523(c0340), C0385.m5310(C0386.m5340()));
                    obj = "۟ۧۨ";
                    break;
                case 32328:
                    C0082.m416(gradientDrawable, 0);
                    if (C0009.m36() < 0) {
                        obj = "ۢۦۣ";
                        break;
                    } else {
                        C0389.m5481();
                        break;
                    }
                case 32495:
                    C0279.m2504((TextView) C0184.m1507(view, C0398.m5840(C0086.m523(c0340), C0385.m5310(C0388.m5456()))), C0420.m6232(context));
                    obj = "۟ۦۡ";
                    break;
                case 1709290:
                    this.f492 = (FeatureButton) C0184.m1507(view, C0398.m5840(C0086.m523(c0340), C0385.m5310(C0060.m210())));
                    if (C0398.m5833() > 0) {
                        obj = "ۦۨۢ";
                        break;
                    } else {
                        C0370.m3284();
                        obj = "ۤۨۨ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ۟ۢۧۤۡ, reason: not valid java name and contains not printable characters */
    public static TextView m2425(Object obj) {
        String str = "۠ۧۧ";
        TextView textView = null;
        TextView textView2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56382) {
                case 1709402:
                    str = "ۤۦۤ";
                    continue;
                case 1709561:
                    if (C0083.m448() >= 0) {
                        str = "۠ۡۨ";
                    } else {
                        str = "ۣۢۨ";
                        continue;
                    }
                case 1710552:
                    return textView;
                case 1729210:
                    if (C0078.m361() <= 0) {
                        textView = textView2;
                    } else {
                        str = "ۧۦۥ";
                        textView = textView2;
                        continue;
                    }
                case 1730204:
                case 1733372:
                    str = "ۧۦۥ";
                    continue;
                case 1730207:
                    textView2 = ((AlertDialogC0274) obj).f497;
                    if (C0420.m6215() >= 0) {
                        str = "ۦۥۥ";
                    } else {
                        str = "ۥۧۦ";
                        continue;
                    }
                case 1730234:
                    break;
                case 1731388:
                    if (C0228.m2012() <= 0) {
                        C0398.m5833();
                    } else {
                        str = "۠ۧۧ";
                        continue;
                    }
                case 1732345:
                    if (C0379.m5056() <= 0) {
                        C0183.m1464();
                        textView = null;
                    } else {
                        str = "ۨۤ۠";
                        textView = null;
                        continue;
                    }
                case 1734654:
                    if (C0398.m5833() <= 0) {
                        break;
                    } else if (C0370.m3284() < 0) {
                        str = "ۤۦۣ";
                    }
            }
            str = C0335.m2923() >= 0 ? "۟ۥۢ" : "ۨۧۦ";
        }
    }

    /* renamed from: ۣ۟ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static TextView m2426(Object obj) {
        String str = "ۥۢۢ";
        TextView textView = null;
        TextView textView2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751497) {
                case 1068:
                    if (C0393.m5668() < 0) {
                        break;
                    } else {
                        str = "ۨۡۧ";
                    }
                case 1868:
                    return textView;
                case 2026:
                    break;
                case 2707:
                    str = "ۣۨۤ";
                    textView = null;
                    continue;
                case 2890:
                case 3852:
                    if (C0191.m1627() < 0) {
                        str = "ۥۧۧ";
                    } else {
                        continue;
                    }
                case 3798:
                    str = "ۢۡۢ";
                    continue;
                case 4822:
                    if (C0383.m5203() <= 0) {
                        C0089.m592();
                        textView = textView2;
                    } else {
                        str = "ۥۧۧ";
                        textView = textView2;
                        continue;
                    }
                case 28871:
                    textView2 = ((AlertDialogC0274) obj).f494;
                    str = "۠ۢۡ";
                    continue;
                case 30895:
                    str = "ۥۢۢ";
                    continue;
                case 31726:
                    if (C0346.m3059() >= 0) {
                        C0074.m307();
                        str = "۟ۧۢ";
                    } else {
                        str = "ۢۨ۠";
                        continue;
                    }
            }
            str = "ۦۦۧ";
        }
    }

    /* renamed from: ۟ۥۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static FeatureButton m2427(Object obj) {
        String str = "ۣۡۤ";
        FeatureButton featureButton = null;
        FeatureButton featureButton2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749826) {
                case 1284:
                    if (C0291.m2568() >= 0) {
                        break;
                    } else {
                        str = "ۨۥۦ";
                    }
                case 1477:
                case 1732573:
                    if (C0395.m5698() >= 0) {
                        C0362.m3122();
                    } else {
                        str = "ۦۡۨ";
                        continue;
                    }
                case 3388:
                    if (C0392.m5595() <= 0) {
                        C0381.m5127();
                        str = "ۡۢۥ";
                    } else {
                        str = "ۣۡۤ";
                        continue;
                    }
                case 3430:
                    break;
                case 7004:
                    str = "ۦۧ";
                    featureButton = null;
                    continue;
                case 7384:
                    if (C0382.m5180() > 0) {
                        str = "۟ۨۧ";
                    } else {
                        continue;
                    }
                case 29391:
                    return featureButton;
                case 31335:
                    if (C0377.m4944() <= 0) {
                        featureButton = featureButton2;
                    } else {
                        str = "ۦۡۨ";
                        featureButton = featureButton2;
                        continue;
                    }
                case 31435:
                    featureButton2 = ((AlertDialogC0274) obj).f493;
                    if (C0183.m1464() <= 0) {
                        str = "ۣۣ۟";
                    } else {
                        str = "ۨۢ۟";
                        continue;
                    }
                case 1732483:
                    if (C0384.m5278() <= 0) {
                        C0395.m5698();
                        str = "ۤۢۤ";
                    } else {
                        str = "ۣۣۧ";
                        continue;
                    }
            }
            if (C0379.m5056() <= 0) {
                C0369.m3256();
                str = "ۣۧۢ";
            } else {
                str = "ۡۨۡ";
            }
        }
    }

    /* renamed from: ۠۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static ImageView m2428(Object obj) {
        String str = "۠ۥۦ";
        ImageView imageView = null;
        ImageView imageView2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754502) {
                case 1984:
                    if (C0086.m500() <= 0) {
                        str = "ۤۦ۠";
                        imageView = null;
                    } else {
                        str = "ۣ۠ۨ";
                        imageView = null;
                        continue;
                    }
                case 2019:
                case 25283:
                    str = "ۡۧۤ";
                    continue;
                case 3276:
                    imageView2 = ((AlertDialogC0274) obj).f495;
                    if (C0397.m5814() <= 0) {
                        C0060.m216();
                        str = "ۣۨۤ";
                    } else {
                        str = "ۢۡۧ";
                        continue;
                    }
                case 27384:
                    return imageView;
                case 28167:
                    if (C0393.m5668() < 0) {
                        break;
                    } else {
                        str = "ۣۨۥ";
                    }
                case 28315:
                    if (C0388.m5430() <= 0) {
                        str = "ۢۡ۟";
                    } else {
                        str = "۠ۥۦ";
                        continue;
                    }
                case 28355:
                    if (C0179.m1427() > 0) {
                        str = "۟ۡۧ";
                    } else {
                        continue;
                    }
                case 28512:
                    if (C0399.m5914() <= 0) {
                        str = "ۣۣۢ";
                    } else {
                        str = "ۦۧۧ";
                        continue;
                    }
                case 30478:
                    str = "ۡۧۤ";
                    imageView = imageView2;
                    continue;
                case 32568:
                    break;
            }
            if (C0399.m5914() <= 0) {
                C0191.m1627();
                str = "ۣۧۥ";
            } else {
                str = "۠۠ۦ";
            }
        }
    }

    /* renamed from: ۣۣ۠۟, reason: not valid java name and contains not printable characters */
    public static FeatureLinearLayout m2429(Object obj) {
        String str = "ۣۨۥ";
        FeatureLinearLayout featureLinearLayout = null;
        FeatureLinearLayout featureLinearLayout2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750602) {
                case 1196:
                    str = "ۣۨۥ";
                    continue;
                case 4395:
                case 32750:
                    if (C0155.m1294() < 0) {
                        str = "ۦۤۤ";
                    } else {
                        continue;
                    }
                case 7441:
                    if (C0399.m5914() <= 0) {
                        C0381.m5127();
                        featureLinearLayout = null;
                    } else {
                        str = "ۨۡۤ";
                        featureLinearLayout = null;
                        continue;
                    }
                case 28745:
                    featureLinearLayout2 = ((AlertDialogC0274) obj).f496;
                    str = "ۧ۟ۤ";
                    continue;
                case 29474:
                    if (C0060.m216() <= 0) {
                        C0392.m5595();
                        str = "ۣۣۨ";
                    } else {
                        str = "۠ۤ۟";
                        continue;
                    }
                case 29510:
                    if (C0368.m3171() >= 0) {
                        featureLinearLayout = featureLinearLayout2;
                    } else {
                        str = "ۦۤۤ";
                        featureLinearLayout = featureLinearLayout2;
                        continue;
                    }
                case 30636:
                    return featureLinearLayout;
                case 32512:
                    if (C0389.m5481() <= 0) {
                        break;
                    } else if (C0385.m5282() < 0) {
                        str = "ۣۧۧ";
                    }
                case 32577:
                    str = "ۨۦۢ";
                    continue;
                case 32579:
                    break;
            }
            str = "ۣۧۢ";
        }
    }

    /* renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static FeatureButton m2430(Object obj) {
        Object obj2 = "ۣۣۧ";
        FeatureButton featureButton = null;
        FeatureButton featureButton2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1749789) {
                case 373:
                    if (C0388.m5430() <= 0) {
                        C0184.m1524();
                        obj2 = "ۥ۟ۦ";
                    } else {
                        obj2 = "ۡۢۧ";
                        continue;
                    }
                case 1337:
                    break;
                case 1434:
                    if (C0380.m5068() < 0) {
                        break;
                    } else if (C0420.m6215() < 0) {
                        obj2 = "ۣۨ۠";
                    }
                case 1533:
                case 7675:
                    if (C0073.m265() <= 0) {
                        obj2 = "۟ۧۨ";
                    } else {
                        obj2 = "۟ۡ۟";
                        continue;
                    }
                case 2361:
                    obj2 = "ۨۧۥ";
                    continue;
                case 5152:
                    return featureButton;
                case 6307:
                    obj2 = "ۣۣۧ";
                    continue;
                case 7268:
                    obj2 = "۟ۡ۟";
                    featureButton = featureButton2;
                    continue;
                case 31451:
                    if (C0382.m5180() <= 0) {
                        featureButton = null;
                    } else {
                        obj2 = "ۢ۠ۦ";
                        featureButton = null;
                        continue;
                    }
                case 31734:
                    featureButton2 = ((AlertDialogC0274) obj).f498;
                    if (C0060.m216() > 0) {
                        obj2 = "ۡۧ۟";
                    } else {
                        continue;
                    }
            }
            if (C0060.m216() <= 0) {
                C0387.m5374();
            } else {
                obj2 = "ۤۢۢ";
            }
        }
    }

    /* renamed from: ۤۢۦۨ, reason: not valid java name and contains not printable characters */
    public static FeatureButton m2431(Object obj) {
        String str = "ۦۨۡ";
        FeatureButton featureButton = null;
        FeatureButton featureButton2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747749) {
                case 165:
                    if (C0376.m4906() <= 0) {
                        C0334.m2866();
                        featureButton = featureButton2;
                    } else {
                        str = "۟۠۠";
                        featureButton = featureButton2;
                        continue;
                    }
                case 3110:
                    if (C0279.m2491() < 0) {
                        str = "ۦۦۡ";
                    } else {
                        continue;
                    }
                case 3130:
                    return featureButton;
                case 3195:
                case 25100:
                    if (C0376.m4906() <= 0) {
                        C0400.m5961();
                        str = "ۣۤۡ";
                    } else {
                        str = "۟۠۠";
                        continue;
                    }
                case 3321:
                    if (C0380.m5068() > 0) {
                        str = "ۦۨۡ";
                    } else {
                        continue;
                    }
                case 25091:
                    featureButton2 = ((AlertDialogC0274) obj).f492;
                    if (C0391.m5571() <= 0) {
                        C0082.m410();
                        str = "ۣۡۥ";
                    } else {
                        str = "۠ۥۥ";
                        continue;
                    }
                case 26884:
                    if (C0385.m5282() >= 0) {
                        C0074.m307();
                        featureButton = null;
                    } else {
                        str = "ۧۨۢ";
                        featureButton = null;
                        continue;
                    }
                case 27002:
                    if (C0389.m5481() < 0) {
                        break;
                    } else if (C0420.m6215() < 0) {
                        str = "ۨۢ۠";
                    }
                case 27908:
                    str = "۟ۢۡ";
                    continue;
                case 1734459:
                    break;
            }
            if (C0368.m3171() < 0) {
                str = "ۣ۟۟";
            }
        }
    }

    /* renamed from: ۦۥ۟ۥ, reason: contains not printable characters */
    public static EditText m2432(Object obj) {
        Object obj2 = "ۣۢۧ";
        EditText editText = null;
        EditText editText2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1754379) {
                case 1155:
                    obj2 = "ۣ۟ۧ";
                    editText = editText2;
                    continue;
                case 1224:
                    editText2 = ((AlertDialogC0274) obj).f499;
                    if (C0089.m592() <= 0) {
                        C0088.m573();
                    } else {
                        obj2 = "ۦۣۡ";
                        continue;
                    }
                case 25173:
                    break;
                case 25224:
                    return editText;
                case 25227:
                case 29615:
                    obj2 = "ۣ۟ۧ";
                    continue;
                case 29550:
                    if (C0279.m2491() < 0) {
                        obj2 = "ۣۢۧ";
                    } else {
                        continue;
                    }
                case 30573:
                    obj2 = "ۣ۟ۤ";
                    continue;
                case 30669:
                    if (C0191.m1627() >= 0) {
                        break;
                    } else {
                        obj2 = "ۦۣ۠";
                    }
                case 30944:
                    if (C0389.m5481() <= 0) {
                        obj2 = "ۡ۟ۢ";
                    } else {
                        obj2 = "ۥۢۦ";
                        continue;
                    }
                case 30946:
                    if (C0382.m5180() <= 0) {
                        C0206.m1807();
                        obj2 = "ۣۥۨ";
                        editText = null;
                    } else {
                        obj2 = "ۢ۠ۤ";
                        editText = null;
                        continue;
                    }
            }
            if (C0121.m1023() < 0) {
                obj2 = "ۥۢۨ";
            }
        }
    }

    @Override // com.cloudinject.feature.p021.p022.InterfaceC0275
    public EditText getEditText() {
        String str = "۠ۡ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753631) {
                case 26849:
                    C0375.m4861(m2432(this), 0);
                    str = "ۡۢۦ";
                    break;
                case 27872:
                    str = "۠ۡ۟";
                    break;
                case 27898:
                    return m2432(this);
            }
        }
    }

    @Override // android.app.AlertDialog, com.cloudinject.feature.p021.p022.InterfaceC0275
    public void setIcon(Drawable drawable) {
        String str = "۠ۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747897) {
                case 6522:
                    str = "۠ۥ";
                    break;
                case 25214:
                    return;
                case 1734588:
                    C0392.m5599(m2428(this), drawable);
                    str = "ۨۧۦ";
                    break;
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    public void setMessage(String str) {
        String str2 = "ۣۤ۟";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1749665) {
                case 2273:
                    return;
                case 2921:
                    C0279.m2504(m2426(this), str);
                    if (C0368.m3171() >= 0) {
                        break;
                    } else {
                        str2 = "ۣۤ۟";
                        break;
                    }
                case 6246:
                    str2 = "ۣۤ۟";
                    break;
            }
        }
    }

    @Override // com.cloudinject.feature.p021.p022.InterfaceC0275
    public void setThemeColor(String str) {
        String str2 = "ۡ۟";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753484) {
                case 1064:
                    return;
                case 28462:
                    C0400.m5929(m2430(this), str);
                    if (C0382.m5180() <= 0) {
                        break;
                    } else {
                        str2 = "ۢۥۦ";
                        break;
                    }
                case 29327:
                    C0384.m5264(m2429(this), str);
                    if (C0388.m5430() > 0) {
                        str2 = "ۧۤۡ";
                        break;
                    } else {
                        C0385.m5282();
                        break;
                    }
                case 29677:
                    if (C0183.m1464() > 0) {
                        str2 = "ۡ۟";
                        break;
                    } else {
                        C0086.m500();
                        break;
                    }
                case 31630:
                    C0400.m5929(m2427(this), str);
                    if (C0191.m1627() < 0) {
                        str2 = "ۡ۠ۡ";
                        break;
                    } else {
                        C0121.m1023();
                        break;
                    }
                case 1711506:
                    C0400.m5929(m2431(this), str);
                    if (C0420.m6215() >= 0) {
                        break;
                    } else {
                        str2 = "ۤۡ۟";
                        break;
                    }
            }
        }
    }

    @Override // com.cloudinject.feature.p021.p022.InterfaceC0275
    public void setTitle(String str) {
        String str2 = "ۦۦۨ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1748737) {
                case 6500:
                    return;
                case 7230:
                    str2 = "ۦۦۨ";
                    break;
                case 27945:
                    C0279.m2504(m2425(this), str);
                    if (C0399.m5914() > 0) {
                        str2 = "ۣۢۤ";
                        break;
                    } else {
                        C0088.m573();
                        break;
                    }
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    /* renamed from: ̗ */
    public void mo2397(String str, View.OnClickListener onClickListener) {
        String str2 = "ۣۤ۟";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1751684) {
                case 1859:
                    return;
                case 3098:
                    C0279.m2503(m2431(this), str);
                    if (C0229.m2064() < 0) {
                        str2 = "ۤۧ";
                        break;
                    } else {
                        C0335.m2923();
                        break;
                    }
                case 29602:
                    if (C0121.m1023() < 0) {
                        str2 = "ۣۤ۟";
                        break;
                    } else {
                        C0378.m4998();
                        str2 = "ۢ۟۟";
                        break;
                    }
                case 1730055:
                    C0229.m2054(m2431(this), onClickListener);
                    if (C0397.m5814() <= 0) {
                        break;
                    } else {
                        str2 = "ۥۣۡ";
                        break;
                    }
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    /* renamed from: ̗̖ */
    public void mo2398(String str, View.OnClickListener onClickListener) {
        String str2 = "ۦۧ";
        FeatureButton featureButtonM2427 = null;
        Integer num = null;
        int iIntValue = 0;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755398) {
                case 2221:
                    C0398.m5851(featureButtonM2427, ((iIntValue ^ (-1)) & 5405221) | ((-5405222) & iIntValue));
                    if (C0396.m5741() >= 0) {
                        C0086.m500();
                        str2 = "ۣۣ";
                    } else {
                        str2 = "ۧۡۧ";
                        continue;
                    }
                case 2823:
                    break;
                case 2851:
                    if (C0384.m5278() > 0) {
                        str2 = "ۦۧ";
                    } else {
                        continue;
                    }
                case 2907:
                case 32762:
                    if (C0386.m5322() <= 0) {
                        C0390.m5512();
                    } else {
                        str2 = "ۧۡۧ";
                        continue;
                    }
                case 3147:
                    C0229.m2054(m2427(this), onClickListener);
                    str2 = "ۣۤ۠";
                    continue;
                case 28313:
                    C0279.m2503(m2427(this), str);
                    if (C0379.m5056() <= 0) {
                        C0228.m2012();
                    } else {
                        str2 = "ۨۧ";
                        continue;
                    }
                case 29511:
                    return;
                case 30617:
                    if (!C0379.m5058(str)) {
                        break;
                    } else if (C0121.m1023() < 0) {
                        str2 = "ۣۦ۟";
                    }
                case 32710:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    if (C0369.m3256() <= 0) {
                        str2 = "ۥۣۢ";
                    } else {
                        str2 = "ۦۢۧ";
                        continue;
                    }
                case 32730:
                    C0398.m5851(m2427(this), 0);
                    str2 = "۟ۤۤ";
                    continue;
                case 1709511:
                    num = new Integer(5405229);
                    str2 = "ۥۨۢ";
                    continue;
                case 1709543:
                    featureButtonM2427 = m2427(this);
                    if (C0380.m5068() <= 0) {
                        C0420.m6215();
                    } else {
                        str2 = "ۣۥۢ";
                        continue;
                    }
                case 1709561:
                    str2 = "ۦۨ۟";
                    continue;
            }
            str2 = "ۧۨ";
        }
    }

    @Override // com.cloudinject.feature.p021.p022.InterfaceC0275
    /* renamed from: ̗̖̖, reason: not valid java name and contains not printable characters */
    public void mo2433(String str, String str2) {
        String str3 = "۠ۥ";
        while (true) {
            switch (C0395.m5690((Object) str3) ^ 1749574) {
                case 1102:
                    return;
                case 30550:
                    if (C0228.m2012() <= 0) {
                        break;
                    } else {
                        str3 = "۠ۥ";
                        break;
                    }
                case 1732163:
                    C0191.m1635(m2432(this), str2);
                    if (C0179.m1427() > 0) {
                        str3 = "ۣ۟ۤ";
                        break;
                    } else {
                        str3 = "ۥۣۣ";
                        break;
                    }
            }
        }
    }

    @Override // com.cloudinject.feature.p021.p022.InterfaceC0275
    /* renamed from: ̗̗̙̖̖̗, reason: not valid java name and contains not printable characters */
    public AlertDialog mo2434() {
        String str = "ۣ۟ۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750629) {
                case 111:
                    C0387.m5369(this);
                    if (C0391.m5571() > 0) {
                        str = "ۣۡۡ";
                        break;
                    } else {
                        C0191.m1627();
                        str = "ۥۥۤ";
                        break;
                    }
                case 6298:
                    return this;
                case 6431:
                    if (C0400.m5961() <= 0) {
                        break;
                    } else {
                        str = "ۣ۟ۦ";
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c6 A[SYNTHETIC] */
    @Override // com.cloudinject.feature.p021.p022.InterfaceC0275
    /* renamed from: ̗̙̙̖̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2435(int r8) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p021.p022.AlertDialogC0274.mo2435(int):void");
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    /* renamed from: ̙ */
    public void mo2399(String str, View.OnClickListener onClickListener) {
        String str2 = "ۣۤۡ";
        FeatureButton featureButtonM2430 = null;
        Integer num = null;
        int iIntValue = 0;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56479) {
                case 61:
                    C0279.m2503(m2430(this), str);
                    str2 = "ۥ۠۠";
                    continue;
                case 1709498:
                    if (!C0379.m5058(str)) {
                        break;
                    } else if (C0025.m118() <= 0) {
                        C0391.m5571();
                    } else {
                        str2 = "۟۟ۥ";
                    }
                case 1710462:
                    if (C0384.m5278() <= 0) {
                        C0025.m118();
                    } else {
                        str2 = "ۣۤۡ";
                        continue;
                    }
                case 1710586:
                    break;
                case 1711448:
                case 1734428:
                    str2 = "۠۟ۥ";
                    continue;
                case 1728826:
                    if (C0397.m5814() <= 0) {
                        C0395.m5698();
                    } else {
                        str2 = "۠ۥۨ";
                        continue;
                    }
                case 1731135:
                    num = new Integer(7716793);
                    if (C0378.m4998() <= 0) {
                        C0073.m265();
                        str2 = "ۥۣۤ";
                    } else {
                        str2 = "ۨۢ۟";
                        continue;
                    }
                case 1733213:
                    return;
                case 1733765:
                    C0398.m5851(featureButtonM2430, ((iIntValue ^ (-1)) & 7716785) | ((-7716786) & iIntValue));
                    if (C0368.m3171() >= 0) {
                        str2 = "ۨۧۧ";
                    } else {
                        str2 = "۠۟ۥ";
                        continue;
                    }
                case 1734233:
                    C0229.m2054(m2430(this), onClickListener);
                    str2 = "ۡۡۢ";
                    continue;
                case 1734553:
                    featureButtonM2430 = m2430(this);
                    if (C0370.m3284() < 0) {
                        str2 = "۠ۤۧ";
                    } else {
                        continue;
                    }
                case 1734652:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    str2 = "ۣ۟ۨ";
                    continue;
                case 1735578:
                    C0398.m5851(m2430(this), 0);
                    str2 = "ۥۧ";
                    continue;
            }
            str2 = "۠ۡۧ";
        }
    }
}
