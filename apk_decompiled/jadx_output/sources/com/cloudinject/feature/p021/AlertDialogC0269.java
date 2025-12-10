package com.cloudinject.feature.p021;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import androidx.core.view.PointerIconCompat;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0184;
import com.cloudinject.customview.FeatureButton;
import com.cloudinject.customview.FeatureLinearLayout;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
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
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
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
/* renamed from: com.cloudinject.feature.̙̗.̖, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class AlertDialogC0269 extends AlertDialogC0273 {
    private Context mContext;
    private View mView;

    /* renamed from: ̖̖̙̖̖̖̗, reason: not valid java name and contains not printable characters */
    private TextView f462;

    /* renamed from: ̖̖̙̙̖̙̖, reason: not valid java name and contains not printable characters */
    private TextView f463;

    /* renamed from: ̖̖̙̙̙̖̖, reason: not valid java name and contains not printable characters */
    private TextView f464;

    /* renamed from: ̖̙̖̖̙̖̖, reason: not valid java name and contains not printable characters */
    private View f465;

    /* renamed from: ̖̙̙̙̖̙̖, reason: not valid java name and contains not printable characters */
    private FeatureLinearLayout f466;

    /* renamed from: ̗̗̖̖̖̙̗, reason: not valid java name and contains not printable characters */
    private String f467;

    /* renamed from: ̗̙̖̙̙̗, reason: not valid java name and contains not printable characters */
    private ImageView f468;

    /* renamed from: ̙̖̖̙̖̖̗, reason: not valid java name and contains not printable characters */
    private FeatureButton f469;

    /* renamed from: ̙̖̙̖̖̖̖, reason: not valid java name and contains not printable characters */
    private TextView f470;

    /* renamed from: ̙̙̖̙̖̙̖, reason: not valid java name and contains not printable characters */
    private FeatureButton f471;

    /* renamed from: ̙̙̙̙̖̙̖, reason: not valid java name and contains not printable characters */
    private FeatureButton f472;

    public AlertDialogC0269(Context context) {
        this(context, null);
    }

    public AlertDialogC0269(Context context, String str) {
        super(context);
        String str2 = "ۥ۟ۥ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753545) {
                case 26349:
                    m2384(this);
                    if (C0391.m5571() > 0) {
                        str2 = "۠ۥۨ";
                        break;
                    } else {
                        C0398.m5833();
                        break;
                    }
                case 27210:
                    return;
                case 29517:
                    if (C0391.m5571() > 0) {
                        str2 = "ۥ۟ۥ";
                        break;
                    } else {
                        C0389.m5481();
                        str2 = "ۦ۟ۦ";
                        break;
                    }
                case 31810:
                    this.f467 = str;
                    str2 = "ۥۤ۠";
                    break;
                case 32744:
                    this.mContext = context;
                    if (C0398.m5833() > 0) {
                        str2 = "۟۠ۥ";
                        break;
                    } else {
                        C0368.m3171();
                        str2 = "۠ۧۦ";
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x033d A[SYNTHETIC] */
    /* renamed from: ̗̗̖̖̙̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2382() {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p021.AlertDialogC0269.m2382():void");
    }

    /* renamed from: ۟۟ۥۨ۠, reason: not valid java name and contains not printable characters */
    public static FeatureButton m2383(Object obj) {
        String str = "ۥ۟ۥ";
        FeatureButton featureButton = null;
        FeatureButton featureButton2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748709) {
                case 1024:
                case 6649:
                    if (C0291.m2568() < 0) {
                        str = "ۣۦۥ";
                    } else {
                        continue;
                    }
                case 1380:
                    if (C0155.m1294() >= 0) {
                        C0089.m592();
                    } else {
                        str = "ۢۡۥ";
                        continue;
                    }
                case 1779:
                    str = "ۣۨۡ";
                    continue;
                case 4974:
                    if (C0387.m5374() > 0) {
                        break;
                    } else if (C0399.m5914() > 0) {
                        str = "ۦۤۦ";
                    }
                case 5250:
                    if (C0384.m5278() <= 0) {
                        featureButton = featureButton2;
                    } else {
                        str = "ۣۦۥ";
                        featureButton = featureButton2;
                        continue;
                    }
                case 6151:
                    return featureButton;
                case 7267:
                    if (C0396.m5741() >= 0) {
                        featureButton = null;
                    } else {
                        str = "۟ۨ۟";
                        featureButton = null;
                        continue;
                    }
                case 26121:
                    break;
                case 27424:
                    if (C0362.m3122() >= 0) {
                        C0206.m1807();
                    } else {
                        str = "ۥ۟ۥ";
                        continue;
                    }
                case 28429:
                    featureButton2 = ((AlertDialogC0269) obj).f471;
                    str = "ۤۤۧ";
                    continue;
            }
            if (C0368.m3171() >= 0) {
                C0382.m5180();
            } else {
                str = "۠ۥۦ";
            }
        }
    }

    /* renamed from: ۟۟ۧۥۧ, reason: not valid java name and contains not printable characters */
    public static void m2384(Object obj) {
        String str = "ۣۣۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755464) {
                case 2208:
                    if (C0083.m448() >= 0) {
                        C0335.m2923();
                        str = "ۢۦ۟";
                    } else {
                        str = "۠ۡۨ";
                        continue;
                    }
                case 2217:
                case 25167:
                    str = "ۧۤۨ";
                    continue;
                case 2218:
                    break;
                case 3299:
                    return;
                case 28813:
                    if (C0380.m5068() > 0) {
                        str = "ۣۣۧ";
                    } else {
                        continue;
                    }
                case 31340:
                    ((AlertDialogC0269) obj).m2382();
                    if (C0060.m216() <= 0) {
                        str = "ۨۡ۠";
                    } else {
                        str = "ۧۤۨ";
                        continue;
                    }
                case 32719:
                    if (C0385.m5282() >= 0) {
                        break;
                    } else if (C0089.m592() <= 0) {
                        C0400.m5961();
                        str = "ۡ۠ۨ";
                    } else {
                        str = "ۢۦۨ";
                    }
            }
            str = "ۦۤۦ";
        }
    }

    /* renamed from: ۟ۥ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static View m2385(Object obj) {
        Object obj2 = "ۡۢۦ";
        View view = null;
        View view2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1747870) {
                case 351:
                    if (C0383.m5203() > 0) {
                        obj2 = "ۧ۟ۥ";
                    } else {
                        continue;
                    }
                case 383:
                    obj2 = "ۡۢۦ";
                    continue;
                case 1403:
                    if (C0362.m3122() > 0) {
                        break;
                    } else {
                        obj2 = "ۨۧۨ";
                    }
                case 3225:
                    obj2 = "ۦۥ۠";
                    view = view2;
                    continue;
                case 4408:
                case 1734554:
                    if (C0229.m2064() < 0) {
                        obj2 = "ۦۥ۠";
                    } else {
                        continue;
                    }
                case 4694:
                    break;
                case 25175:
                    view2 = ((AlertDialogC0269) obj).f465;
                    if (C0376.m4906() > 0) {
                        obj2 = "۟۟ۧ";
                    } else {
                        continue;
                    }
                case 27039:
                    return view;
                case 28307:
                    if (C0397.m5814() <= 0) {
                        C0390.m5512();
                        obj2 = "۟ۨۥ";
                        view = null;
                    } else {
                        obj2 = "ۡ۠";
                        view = null;
                        continue;
                    }
                case 1734529:
                    if (C0369.m3256() <= 0) {
                        C0382.m5180();
                        obj2 = "ۨۥ۠";
                    } else {
                        obj2 = "ۤۦۨ";
                        continue;
                    }
            }
            obj2 = "۠۟۠";
        }
    }

    /* renamed from: ۟ۥۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m2386(Object obj) {
        String str = "ۣۢۨ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750814) {
                case FrameMetricsAggregator.EVERY_DURATION /* 511 */:
                    str3 = ((AlertDialogC0269) obj).f467;
                    str = "ۣۧۡ";
                    continue;
                case 1497:
                    if (C0279.m2491() >= 0) {
                        break;
                    } else if (C0385.m5282() >= 0) {
                        C0393.m5668();
                        str = "ۤ۟ۧ";
                    } else {
                        str = "ۣۦۤ";
                    }
                case 2492:
                    str = "ۡۢۨ";
                    continue;
                case 4289:
                    return str2;
                case 4323:
                    if (C0291.m2568() >= 0) {
                        str = "ۢۡۤ";
                    } else {
                        str = "ۦ۠ۦ";
                        continue;
                    }
                case 6649:
                    if (C0334.m2866() <= 0) {
                        str2 = null;
                    } else {
                        str = "۟ۧۥ";
                        str2 = null;
                        continue;
                    }
                case 7638:
                    str = "ۣۢۨ";
                    continue;
                case 29271:
                    if (C0385.m5282() >= 0) {
                        C0179.m1427();
                        str2 = str3;
                    } else {
                        str = "۟ۦۦ";
                        str2 = str3;
                        continue;
                    }
                case 30322:
                case 30390:
                    str = "۟ۦۦ";
                    continue;
                case 1731454:
                    break;
            }
            str = "ۥۨۥ";
        }
    }

    /* renamed from: ۟ۥۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static ImageView m2387(Object obj) {
        String str = "ۦۣۤ";
        ImageView imageView = null;
        ImageView imageView2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746974) {
                case 890:
                case 1895:
                    if (C0086.m500() > 0) {
                        str = "ۣۧۢ";
                    } else {
                        continue;
                    }
                case 961:
                    if (C0229.m2064() >= 0) {
                        C0009.m36();
                        imageView = null;
                    } else {
                        str = "ۨۤۨ";
                        imageView = null;
                        continue;
                    }
                case 6779:
                    str = "۠ۨۧ";
                    continue;
                case 7904:
                    return imageView;
                case 24787:
                    break;
                case 24946:
                    if (C0206.m1807() >= 0) {
                        str = "ۢۥۡ";
                    } else {
                        str = "ۡۧ۟";
                        continue;
                    }
                case 25082:
                    imageView2 = ((AlertDialogC0269) obj).f468;
                    str = "ۣۧۧ";
                    continue;
                case 27097:
                    if (C0086.m500() <= 0) {
                        break;
                    } else if (C0400.m5961() > 0) {
                        str = "ۨۨۤ";
                    }
                case 27198:
                    str = "ۦۣۤ";
                    continue;
                case 28189:
                    if (C0368.m3171() >= 0) {
                        C0387.m5374();
                        imageView = imageView2;
                    } else {
                        str = "ۣۧۢ";
                        imageView = imageView2;
                        continue;
                    }
            }
            if (C0228.m2012() > 0) {
                str = "ۣۢ۠";
            }
        }
    }

    /* renamed from: ۟ۦۣۥ۠, reason: not valid java name and contains not printable characters */
    public static TextView m2388(Object obj) {
        String str = "ۢۥۦ";
        TextView textView = null;
        TextView textView2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753542) {
                case 26173:
                    str = "۠ۤۡ";
                    textView = null;
                    continue;
                case 27289:
                    break;
                case 27291:
                    str = "ۢۥۥ";
                    continue;
                case 28475:
                    textView2 = ((AlertDialogC0269) obj).f470;
                    str = "ۣۣۥ";
                    continue;
                case 29380:
                case 1710626:
                    str = "ۣۧۨ";
                    continue;
                case 29381:
                    if (C0379.m5056() < 0) {
                        break;
                    } else if (C0392.m5595() <= 0) {
                        C0390.m5512();
                    } else {
                        str = "ۣۡ۟";
                    }
                case 30402:
                    return textView;
                case 30531:
                    str = "ۣۧۨ";
                    textView = textView2;
                    continue;
                case 31715:
                    if (C0362.m3122() < 0) {
                        str = "ۣ۟ۧ";
                    } else {
                        continue;
                    }
                case 1711545:
                    if (C0086.m500() > 0) {
                        str = "ۢۥۦ";
                    } else {
                        continue;
                    }
            }
            if (C0383.m5203() <= 0) {
                C0121.m1023();
                str = "ۣۣۦ";
            } else {
                str = "ۣۤۢ";
            }
        }
    }

    /* renamed from: ۟ۦۤ۟, reason: not valid java name and contains not printable characters */
    public static TextView m2389(Object obj) {
        String str = "ۤۢۥ";
        TextView textView = null;
        TextView textView2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751499) {
                case PointerIconCompat.TYPE_WAIT /* 1004 */:
                    if (C0060.m216() <= 0) {
                        break;
                    } else {
                        str = "ۦ۟۠";
                    }
                case 2837:
                    str = "ۢۢۥ";
                    textView = null;
                    continue;
                case 2926:
                    if (C0379.m5056() > 0) {
                        str = "ۧۦۢ";
                    } else {
                        continue;
                    }
                case 2984:
                    str = "ۤۢۥ";
                    continue;
                case 3848:
                case 31784:
                    if (C0279.m2491() >= 0) {
                        C0385.m5282();
                    } else {
                        str = "ۦۣۢ";
                        continue;
                    }
                case 4690:
                    if (C0078.m361() <= 0) {
                        C0394.m5672();
                        str = "ۥۥۡ";
                        textView = textView2;
                    } else {
                        str = "ۦۣۢ";
                        textView = textView2;
                        continue;
                    }
                case 28812:
                    if (C0025.m118() <= 0) {
                        str = "۠ۢۢ";
                    } else {
                        str = "ۢۤ۠";
                        continue;
                    }
                case 30828:
                    return textView;
                case 30860:
                    textView2 = ((AlertDialogC0269) obj).f464;
                    str = "۠ۦ۟";
                    continue;
                case 31841:
                    break;
            }
            str = "ۣۨۢ";
        }
    }

    /* renamed from: ۟ۦۣۧۧ, reason: not valid java name and contains not printable characters */
    public static FeatureButton m2390(Object obj) {
        Object obj2 = "ۦۣ۠";
        FeatureButton featureButton = null;
        FeatureButton featureButton2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1747749) {
                case 242:
                    obj2 = "ۣۨۥ";
                    continue;
                case 3105:
                    obj2 = "ۦۣ۠";
                    continue;
                case 4354:
                    obj2 = "ۤۥۨ";
                    featureButton = featureButton2;
                    continue;
                case 4514:
                    return featureButton;
                case 7553:
                case 27330:
                    if (C0392.m5595() <= 0) {
                        C0393.m5668();
                        obj2 = "۠ۡۤ";
                    } else {
                        obj2 = "ۤۥۨ";
                        continue;
                    }
                case 25199:
                    if (C0362.m3122() >= 0) {
                        C0346.m3059();
                        featureButton = null;
                    } else {
                        obj2 = "ۨ۟ۤ";
                        featureButton = null;
                        continue;
                    }
                case 25576:
                    if (C0389.m5481() <= 0) {
                        C0362.m3122();
                        obj2 = "ۦۣ";
                    } else {
                        obj2 = "ۦۤۥ";
                        continue;
                    }
                case 27366:
                    if (C0399.m5914() < 0) {
                        break;
                    } else if (C0083.m448() >= 0) {
                        C0385.m5282();
                    } else {
                        obj2 = "ۧۨۦ";
                    }
                case 27904:
                    featureButton2 = ((AlertDialogC0269) obj).f472;
                    if (C0378.m4998() <= 0) {
                        C0382.m5180();
                    } else {
                        obj2 = "ۤۢۥ";
                        continue;
                    }
                case 28269:
                    break;
            }
            if (C0179.m1427() > 0) {
                obj2 = "۠ۨ۟";
            }
        }
    }

    /* renamed from: ۟ۧۦۢۥ, reason: not valid java name and contains not printable characters */
    public static TextView m2391(Object obj) {
        String str = "ۨۤ۠";
        TextView textView = null;
        TextView textView2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752453) {
                case 931:
                    return textView;
                case 3044:
                    break;
                case 3716:
                    str = "ۢۨۤ";
                    continue;
                case 3803:
                    str = "ۨۧۧ";
                    textView = null;
                    continue;
                case 3962:
                case 1730145:
                    if (C0380.m5068() > 0) {
                        str = "ۥۤۥ";
                    } else {
                        continue;
                    }
                case 5863:
                    if (C0380.m5068() <= 0) {
                        C0279.m2491();
                        str = "ۧ۠ۧ";
                    } else {
                        str = "ۨۤ۠";
                        continue;
                    }
                case 5883:
                    textView2 = ((AlertDialogC0269) obj).f462;
                    str = "ۧۧۡ";
                    continue;
                case 29773:
                    str = "ۢۥۢ";
                    continue;
                case 29921:
                    if (C0291.m2568() >= 0) {
                        break;
                    } else {
                        str = "۠ۥۣ";
                    }
                case 31620:
                    str = "ۥۤۥ";
                    textView = textView2;
                    continue;
            }
            if (C0279.m2491() < 0) {
                str = "ۢۥۤ";
            }
        }
    }

    /* renamed from: ۢ۠۠۟, reason: not valid java name and contains not printable characters */
    public static FeatureButton m2392(Object obj) {
        Object obj2 = "ۥۦۡ";
        FeatureButton featureButton = null;
        FeatureButton featureButton2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1755493) {
                case 13:
                    if (C0376.m4906() <= 0) {
                        featureButton = featureButton2;
                    } else {
                        obj2 = "ۣۣۣ";
                        featureButton = featureButton2;
                        continue;
                    }
                case 2222:
                    featureButton2 = ((AlertDialogC0269) obj).f469;
                    if (C0346.m3059() >= 0) {
                        C0086.m500();
                    } else {
                        obj2 = "ۨۤۤ";
                        continue;
                    }
                case 3085:
                    if (C0369.m3256() > 0) {
                        obj2 = "ۥۦۡ";
                    } else {
                        continue;
                    }
                case 26363:
                    obj2 = "ۦۡ";
                    continue;
                case 26604:
                case 29442:
                    obj2 = "ۣۣۣ";
                    continue;
                case 29857:
                    break;
                case 30469:
                    if (C0155.m1294() > 0) {
                        break;
                    } else if (C0398.m5833() > 0) {
                        obj2 = "ۦۣۨ";
                    }
                case 32742:
                    return featureButton;
                case 1708673:
                    if (C0206.m1807() < 0) {
                        obj2 = "ۤۤۧ";
                    } else {
                        continue;
                    }
                case 1709534:
                    if (C0060.m216() <= 0) {
                        featureButton = null;
                    } else {
                        obj2 = "ۣ۟";
                        featureButton = null;
                        continue;
                    }
            }
            obj2 = "ۡۨۥ";
        }
    }

    /* renamed from: ۥ۠۠ۡ, reason: contains not printable characters */
    public static FeatureLinearLayout m2393(Object obj) {
        String str = "۠۠ۤ";
        FeatureLinearLayout featureLinearLayout = null;
        FeatureLinearLayout featureLinearLayout2 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1749734) {
                case 1048:
                case 6592:
                    str = "ۥۦۨ";
                    continue;
                case 1122:
                    str = "ۡۥۥ";
                    featureLinearLayout = null;
                    continue;
                case 3201:
                    return featureLinearLayout;
                case 6146:
                    if (C0420.m6215() > 0) {
                        break;
                    } else {
                        str = "ۣۨۡ";
                    }
                case 6598:
                    if (C0398.m5833() > 0) {
                        str = "۠۠ۤ";
                    } else {
                        continue;
                    }
                case 7246:
                    if (C0394.m5672() <= 0) {
                        C0164.m1359();
                    } else {
                        str = "ۣۣۤ";
                        continue;
                    }
                case 7591:
                    if (C0376.m4906() <= 0) {
                        C0399.m5914();
                    } else {
                        str = "ۣۧۢ";
                        continue;
                    }
                case 29504:
                    break;
                case 30701:
                    if (C0009.m36() >= 0) {
                        C0179.m1427();
                        str = "ۦۤۧ";
                        featureLinearLayout = featureLinearLayout2;
                    } else {
                        str = "ۥۦۨ";
                        featureLinearLayout = featureLinearLayout2;
                        continue;
                    }
                case 31724:
                    featureLinearLayout2 = ((AlertDialogC0269) obj).f466;
                    if (C0229.m2064() >= 0) {
                        C0398.m5833();
                    } else {
                        str = "ۣۧ۟";
                        continue;
                    }
            }
            str = C0164.m1359() >= 0 ? "ۡۤۡ" : "ۡ۠ۧ";
        }
    }

    /* renamed from: ۥۡۡۦ, reason: contains not printable characters */
    public static TextView m2394(Object obj) {
        Object obj2 = "ۧۦۤ";
        TextView textView = null;
        TextView textView2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1746942) {
                case 255:
                    if (C0391.m5571() <= 0) {
                        C0386.m5322();
                        textView = null;
                    } else {
                        obj2 = "ۧۡ۟";
                        textView = null;
                        continue;
                    }
                case 2146:
                case 6680:
                    if (C0369.m3256() > 0) {
                        obj2 = "ۥ۠۟";
                    } else {
                        continue;
                    }
                case 3233:
                    if (C0386.m5322() > 0) {
                        obj2 = "ۧۦۤ";
                    } else {
                        continue;
                    }
                case 6619:
                    obj2 = "ۥ۠۟";
                    textView = textView2;
                    continue;
                case 6746:
                    return textView;
                case 7549:
                    textView2 = ((AlertDialogC0269) obj).f463;
                    if (C0386.m5322() > 0) {
                        obj2 = "ۥۤۤ";
                    } else {
                        continue;
                    }
                case 25115:
                    if (C0389.m5481() <= 0) {
                        break;
                    } else if (C0397.m5814() > 0) {
                        obj2 = "ۤۥۤ";
                    }
                case 25272:
                    break;
                case 25275:
                    if (C0382.m5180() > 0) {
                        obj2 = "ۣۡۨ";
                    } else {
                        continue;
                    }
                case 28430:
                    if (C0346.m3059() >= 0) {
                        C0074.m307();
                    } else {
                        obj2 = "۟۟ۡ";
                        continue;
                    }
            }
            if (C0362.m3122() >= 0) {
                C0164.m1359();
                obj2 = "ۧۨۦ";
            } else {
                obj2 = "ۨ۠ۨ";
            }
        }
    }

    /* renamed from: ۥۥۣۣ, reason: contains not printable characters */
    public static View m2395(Object obj) {
        String str = "ۦۧۤ";
        View view = null;
        View view2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746753) {
                case 2463:
                    break;
                case 3324:
                    if (C0164.m1359() >= 0) {
                        str = "ۧۧۤ";
                    } else {
                        str = "ۨۢۢ";
                        continue;
                    }
                case 5416:
                case 28265:
                    str = "ۥۢۤ";
                    continue;
                case 6599:
                    str = "ۤ۠۠";
                    continue;
                case 6822:
                    return view;
                case 7845:
                    str = "۠ۧۤ";
                    view = null;
                    continue;
                case 25250:
                    view2 = ((AlertDialogC0269) obj).mView;
                    str = "ۢۢ";
                    continue;
                case 25858:
                    if (C0229.m2064() >= 0) {
                        break;
                    } else if (C0191.m1627() >= 0) {
                        C0377.m4944();
                    } else {
                        str = "ۧۦۢ";
                    }
                case 1735425:
                    if (C0377.m4944() <= 0) {
                        str = "ۣ۟ۧ";
                        view = view2;
                    } else {
                        str = "ۥۢۤ";
                        view = view2;
                        continue;
                    }
                case 1735648:
                    if (C0383.m5203() <= 0) {
                        C0121.m1023();
                    } else {
                        str = "ۦۧۤ";
                        continue;
                    }
            }
            str = C0382.m5180() <= 0 ? "ۣۣۥ" : "ۥۧۨ";
        }
    }

    /* renamed from: ۨۦۢۧ, reason: not valid java name and contains not printable characters */
    public static Context m2396(Object obj) {
        String str = "۟۟۠";
        Context context = null;
        Context context2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56328) {
                case 1709273:
                case 1733325:
                    str = "ۣ۟ۡ";
                    continue;
                case 1709474:
                    if (C0073.m265() > 0) {
                        str = "ۡۡۥ";
                    } else {
                        continue;
                    }
                case 1731369:
                    str = "ۨۦۨ";
                    context = null;
                    continue;
                case 1733421:
                    break;
                case 1733459:
                    context2 = ((AlertDialogC0269) obj).mContext;
                    if (C0009.m36() >= 0) {
                        C0362.m3122();
                        str = "۟۟۟";
                    } else {
                        str = "۠ۨۤ";
                        continue;
                    }
                case 1733481:
                    if (C0121.m1023() >= 0) {
                        C0082.m410();
                    } else {
                        str = "۟۟۠";
                        continue;
                    }
                case 1733491:
                    if (C0060.m216() <= 0) {
                        C0399.m5914();
                    } else {
                        str = "ۣۨۦ";
                        continue;
                    }
                case 1734612:
                    if (C0184.m1524() >= 0) {
                        str = "۟ۤۦ";
                        context = context2;
                    } else {
                        str = "ۣ۟ۡ";
                        context = context2;
                        continue;
                    }
                case 1735432:
                    if (C0073.m265() <= 0) {
                        break;
                    } else {
                        str = "ۡۦ۠";
                    }
                case 1735541:
                    return context;
            }
            str = "ۡۧۡ";
        }
    }

    public void setColor(String str) {
        String str2 = "ۣ۟۠";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1746846) {
                case 3265:
                    str2 = "ۣ۟۠";
                    break;
                case 4506:
                    this.f467 = str;
                    str2 = "ۦۣۦ";
                    break;
                case 26199:
                    return;
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    public void setMessage(String str) {
        TextView textViewM2388 = null;
        String str2 = "ۧ۟ۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753540) {
                case 1063:
                    str2 = "ۧ۟ۡ";
                    continue;
                case 1229:
                    textViewM2388 = m2388(this);
                    if (C0191.m1627() < 0) {
                        str2 = "ۨۥۤ";
                    } else {
                        continue;
                    }
                case 2115:
                    if (textViewM2388 == null) {
                        break;
                    } else if (C0335.m2923() >= 0) {
                        C0383.m5203();
                        str2 = "ۢۡۥ";
                    } else {
                        str2 = "ۣۨۤ";
                    }
                case 26361:
                    break;
                case 30427:
                    C0279.m2504(textViewM2388, str);
                    if (C0025.m118() > 0) {
                        str2 = "۟ۧ";
                    } else {
                        continue;
                    }
                case 1710636:
                    return;
            }
            if (C0368.m3171() < 0) {
                str2 = "۟ۧ";
            }
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        TextView textViewM2391 = null;
        String str = "ۡ۟۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753603) {
                case 2894:
                    if (textViewM2391 == null) {
                        break;
                    } else if (C0400.m5961() <= 0) {
                        C0391.m5571();
                        str = "ۥ۠ۦ";
                    } else {
                        str = "ۣۤۦ";
                    }
                case 26881:
                    break;
                case 27778:
                    textViewM2391 = m2391(this);
                    str = "ۣۨۨ";
                    continue;
                case 28838:
                    return;
                case 28924:
                    str = "ۡ۟۟";
                    continue;
                case 29862:
                    C0279.m2504(textViewM2391, charSequence);
                    if (C0074.m307() >= 0) {
                        C0074.m307();
                    } else {
                        str = "ۢۢۥ";
                        continue;
                    }
            }
            if (C0391.m5571() > 0) {
                str = "ۢۢۥ";
            }
        }
    }

    @Override // android.app.AlertDialog
    public void setView(View view) {
        String str = "ۦۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753509) {
                case 30682:
                    return;
                case 31654:
                    if (C0396.m5741() < 0) {
                        str = "ۦۢ";
                        break;
                    } else {
                        C0083.m448();
                        break;
                    }
                case 1711385:
                    this.mView = view;
                    if (C0279.m2491() < 0) {
                        str = "ۣۣ۟";
                        break;
                    } else {
                        str = "ۧۤ";
                        break;
                    }
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273, android.app.Dialog
    public void show() {
        View viewM2395 = null;
        String str = "ۣۧۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753571) {
                case 27107:
                    if (C0390.m5512() > 0) {
                        str = "ۤ۠ۥ";
                    } else {
                        continue;
                    }
                case 28459:
                    super.show();
                    if (C0009.m36() >= 0) {
                        str = "ۦ۟ۧ";
                    } else {
                        str = "ۤۨۧ";
                        continue;
                    }
                case 28518:
                    break;
                case 29437:
                    super.setView(m2385(this));
                    if (C0381.m5127() > 0) {
                        str = "۟ۧۨ";
                    } else {
                        continue;
                    }
                case 29546:
                    if (C0385.m5282() < 0) {
                        str = "ۣۧۦ";
                    } else {
                        continue;
                    }
                case 30433:
                    viewM2395 = m2395(this);
                    if (C0392.m5595() <= 0) {
                        C0385.m5282();
                    } else {
                        str = "ۤۤۤ";
                        continue;
                    }
                case 30730:
                case 32646:
                    if (C0397.m5814() <= 0) {
                        C0155.m1294();
                    } else {
                        str = "ۡۡۨ";
                        continue;
                    }
                case 31488:
                    return;
                case 31623:
                    if (viewM2395 != null) {
                        break;
                    } else {
                        str = "ۢۦۢ";
                    }
                case 31791:
                    super.setView(viewM2395);
                    if (C0078.m361() > 0) {
                        str = "ۡۡۨ";
                    } else {
                        continue;
                    }
            }
            str = "ۥۡۨ";
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public void mo2397(String str, View.OnClickListener onClickListener) {
        FeatureButton featureButtonM2390 = null;
        String str2 = "ۤۧ۠";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755339) {
                case 34:
                case 26165:
                    return;
                case 2369:
                    C0279.m2503(m2390(this), str);
                    if (C0073.m265() <= 0) {
                        str2 = "ۣۦۣ";
                    } else {
                        str2 = "ۤۢۢ";
                        continue;
                    }
                case 3404:
                    if (C0346.m3059() >= 0) {
                        C0390.m5512();
                    } else {
                        str2 = "ۤۧ۠";
                        continue;
                    }
                case 29302:
                    featureButtonM2390 = m2390(this);
                    str2 = "ۢۥۣ";
                    continue;
                case 29423:
                    C0229.m2054(m2390(this), onClickListener);
                    str2 = "ۨ۠ۡ";
                    continue;
                case 31691:
                    if (featureButtonM2390 != null) {
                        break;
                    } else if (C0089.m592() > 0) {
                        str2 = "ۣۡ۠";
                    }
                case 32424:
                    break;
                case 1709140:
                    C0398.m5851(featureButtonM2390, 0);
                    if (C0399.m5914() <= 0) {
                        C0393.m5668();
                    } else {
                        str2 = "ۦۡۥ";
                        continue;
                    }
            }
            if (C0088.m573() > 0) {
                str2 = "ۥۤ";
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    public void mo2398(String str, View.OnClickListener onClickListener) {
        FeatureButton featureButtonM2383 = null;
        String str2 = "ۣۣۢ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1749636) {
                case 1155:
                case 31695:
                    return;
                case 1248:
                    featureButtonM2383 = m2383(this);
                    if (C0369.m3256() <= 0) {
                        C0184.m1524();
                    } else {
                        str2 = "ۧۧۤ";
                        continue;
                    }
                case 5605:
                    break;
                case 29824:
                    if (featureButtonM2383 != null) {
                        break;
                    } else {
                        str2 = "ۣۨۦ";
                    }
                case 30635:
                    C0229.m2054(m2383(this), onClickListener);
                    str2 = "ۣۣ۟";
                    continue;
                case 31619:
                    C0279.m2503(m2383(this), str);
                    if (C0375.m4840() >= 0) {
                        C0382.m5180();
                    } else {
                        str2 = "ۧ۠ۨ";
                        continue;
                    }
                case 1732154:
                    if (C0279.m2491() < 0) {
                        str2 = "ۣۣۢ";
                    } else {
                        continue;
                    }
                case 1732290:
                    C0398.m5851(featureButtonM2383, 0);
                    if (C0074.m307() >= 0) {
                        C0392.m5595();
                    } else {
                        str2 = "ۨۡ۠";
                        continue;
                    }
            }
            if (C0370.m3284() >= 0) {
                C0191.m1627();
            } else {
                str2 = "ۢۨ";
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    public void mo2399(String str, View.OnClickListener onClickListener) {
        FeatureButton featureButtonM2392 = null;
        String str2 = "ۥ۟۠";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753545) {
                case 1219:
                case 26219:
                    return;
                case 2006:
                    break;
                case 2310:
                    C0229.m2054(m2392(this), onClickListener);
                    if (C0383.m5203() <= 0) {
                        C0381.m5127();
                    } else {
                        str2 = "ۧ۟ۢ";
                        continue;
                    }
                case 27210:
                    C0398.m5851(featureButtonM2392, 0);
                    if (C0396.m5741() >= 0) {
                        C0370.m3284();
                    } else {
                        str2 = "ۤ۠۟";
                        continue;
                    }
                case 30762:
                    C0279.m2503(m2392(this), str);
                    if (C0206.m1807() < 0) {
                        str2 = "ۨ۟ۦ";
                    } else {
                        continue;
                    }
                case 31604:
                    if (featureButtonM2392 != null) {
                        break;
                    } else {
                        str2 = "۟ۤۧ";
                    }
                case 31823:
                    featureButtonM2392 = m2392(this);
                    if (C0394.m5672() <= 0) {
                        C0089.m592();
                    } else {
                        str2 = "ۤۧ۠";
                        continue;
                    }
                case 1711383:
                    str2 = "ۥ۟۠";
                    continue;
            }
            str2 = "۠ۥۨ";
        }
    }
}
