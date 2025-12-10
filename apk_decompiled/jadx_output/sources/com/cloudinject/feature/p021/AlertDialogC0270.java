package com.cloudinject.feature.p021;

import android.app.C0009;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.database.C0073;
import android.database.C0074;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0340;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
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
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

@Dex2C
/* renamed from: com.cloudinject.feature.̙̗.̖̖, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class AlertDialogC0270 extends AlertDialogC0273 {
    private Context mContext;
    private View mView;

    /* renamed from: ̖̖̙̖̖̖̗, reason: not valid java name and contains not printable characters */
    private TextView f473;

    /* renamed from: ̖̙̖̖̙̖̖, reason: not valid java name and contains not printable characters */
    private View f474;

    /* renamed from: ̖̙̖̙̖̖̖, reason: not valid java name and contains not printable characters */
    private boolean f475;

    /* renamed from: ̖̙̙̙̙̖̗, reason: not valid java name and contains not printable characters */
    private TextView f476;

    /* renamed from: ̙̖̙̖̖̖̖, reason: not valid java name and contains not printable characters */
    private TextView f477;

    /* renamed from: ̙̖̙̖̖̙̖, reason: not valid java name and contains not printable characters */
    private View f478;

    /* renamed from: ̙̖̙̙̙̖̖, reason: not valid java name and contains not printable characters */
    private TextView f479;

    /* renamed from: ̙̖̙̙̙̙̙, reason: not valid java name and contains not printable characters */
    private TextView f480;

    /* renamed from: ̙̙̖̖̙̖̖, reason: not valid java name and contains not printable characters */
    private View f481;

    /* renamed from: ̙̙̙̖̙̙̖, reason: not valid java name and contains not printable characters */
    private LinearLayout f482;

    public AlertDialogC0270(Context context) {
        this(context, true);
    }

    public AlertDialogC0270(Context context, boolean z) {
        super(context);
        String str = "ۣۨ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755530) {
                case 326:
                    this.f475 = z;
                    if (C0382.m5180() > 0) {
                        str = "ۡۥۥ";
                        break;
                    } else {
                        C0089.m592();
                        str = "۟ۧ۠";
                        break;
                    }
                case 26315:
                    this.mContext = context;
                    str = "ۤۧۧ";
                    break;
                case 26355:
                    str = "ۣۨ۟";
                    break;
                case 29518:
                    m2405(this);
                    if (C0089.m592() > 0) {
                        str = "ۢۥۧ";
                        break;
                    } else {
                        C0390.m5512();
                        break;
                    }
                case 31374:
                    return;
            }
        }
    }

    /* renamed from: ̗̗̖̖̙̖, reason: not valid java name and contains not printable characters */
    private void m2400() {
        Integer num;
        Object obj = "ۢۧۨ";
        float[] fArr = null;
        GradientDrawable gradientDrawable = null;
        int i = 0;
        View viewM2411 = null;
        int iM585 = 0;
        C0340 c0340 = null;
        Integer num2 = null;
        while (true) {
            switch (C0395.m5690(obj) ^ 1748736) {
                case 480:
                    this.f474 = C0228.m2029(C0385.m5288(C0164.m1370(c0340)), iM585, null, false);
                    this.f473 = (TextView) C0184.m1507(m2408(this), C0398.m5840(C0086.m523(c0340), C0385.m5310(C0393.m5658())));
                    obj = "ۣ۠ۤ";
                    continue;
                case FrameMetricsAggregator.EVERY_DURATION /* 511 */:
                    C0334.m2870(m2403(this), i);
                    gradientDrawable = new GradientDrawable();
                    if (C0335.m2923() >= 0) {
                        C0121.m1023();
                    } else {
                        obj = "ۦۥۨ";
                        continue;
                    }
                case 1119:
                    this.f477 = (TextView) C0184.m1507(m2408(this), C0398.m5840(C0086.m523(c0340), C0385.m5310(C0389.m5492())));
                    this.f479 = (TextView) C0184.m1507(m2408(this), C0398.m5840(C0086.m523(c0340), C0385.m5310(C0420.m6226())));
                    if (C0397.m5814() <= 0) {
                        C0382.m5180();
                    } else {
                        obj = "ۦۣۤ";
                        continue;
                    }
                case 1510:
                    C0369.m3226(viewM2411, i);
                    C0369.m3226(m2404(this), i);
                    if (C0381.m5127() > 0) {
                        obj = "ۥ۟ۨ";
                    } else {
                        continue;
                    }
                case 2085:
                    return;
                case 4750:
                    C0334.m2870(m2401(this), i);
                    C0334.m2870(m2402(this), i);
                    if (C0391.m5571() <= 0) {
                        C0398.m5833();
                        obj = "۠۟ۦ";
                    } else {
                        obj = "ۣۡۡ";
                        continue;
                    }
                case 4834:
                    num = num2;
                    break;
                case 5508:
                    fArr[0] = 30.0f;
                    fArr[1] = 30.0f;
                    fArr[2] = 30.0f;
                    fArr[3] = 30.0f;
                    fArr[4] = 30.0f;
                    fArr[5] = 30.0f;
                    fArr[6] = 30.0f;
                    fArr[7] = 30.0f;
                    C0191.m1652(gradientDrawable, fArr);
                    if (C0183.m1464() <= 0) {
                        C0291.m2568();
                    } else {
                        obj = "ۨۧۦ";
                        continue;
                    }
                case 5862:
                    C0340 c0340M5318 = C0386.m5318(C0334.m2895(), C0385.m5310(C0346.m3051()));
                    c0340 = c0340M5318;
                    iM585 = C0088.m585(C0086.m523(c0340M5318), C0385.m5310(C0183.m1481()));
                    obj = "ۡۢۡ";
                    continue;
                case 7235:
                    num = new Integer(3990037);
                    if (C0074.m291(this) == null) {
                        break;
                    } else {
                        num2 = num;
                        obj = "ۦ۠ۨ";
                    }
                case 7618:
                    int iIntValue = ((Integer) new Object[]{num2}[0]).intValue();
                    i = ((iIntValue ^ (-1)) & 3990045) | (iIntValue & (-3990046));
                    obj = "۠۠ۦ";
                    continue;
                case 26306:
                    this.f478 = C0184.m1507(m2408(this), C0398.m5840(C0086.m523(c0340), C0385.m5310(C0396.m5755())));
                    viewM2411 = m2411(this);
                    if (C0074.m307() < 0) {
                        obj = "ۣۣۢ";
                    } else {
                        continue;
                    }
                case 26311:
                    C0155.m1310(gradientDrawable, C0083.m464(C0385.m5310(C0164.m1353())));
                    C0389.m5474(m2410(this), gradientDrawable);
                    obj = "۟۠ۦ";
                    continue;
                case 27244:
                    this.f482 = (LinearLayout) C0184.m1507(m2408(this), C0398.m5840(C0086.m523(c0340), C0385.m5310(C0385.m5307())));
                    this.f481 = C0184.m1507(m2408(this), C0398.m5840(C0086.m523(c0340), C0385.m5310(C0074.m330())));
                    obj = "ۨۧۡ";
                    continue;
                case 27245:
                    if (C0164.m1359() >= 0) {
                        C0009.m36();
                    } else {
                        obj = "ۢۧۨ";
                        continue;
                    }
                case 27913:
                    C0082.m416(gradientDrawable, 0);
                    fArr = new float[i];
                    obj = "ۤۥۥ";
                    continue;
                case 28270:
                    C0279.m2465(C0074.m291(this), new ColorDrawable(0));
                    obj = "ۤ۠ۢ";
                    continue;
                case 28359:
                    this.f476 = (TextView) C0184.m1507(m2408(this), C0398.m5840(C0086.m523(c0340), C0385.m5310(C0074.m284())));
                    this.f480 = (TextView) C0184.m1507(m2408(this), C0398.m5840(C0086.m523(c0340), C0385.m5310(C0334.m2854())));
                    if (C0381.m5127() <= 0) {
                        C0389.m5481();
                    } else {
                        obj = "ۧۢۧ";
                        continue;
                    }
            }
            if (C0377.m4944() <= 0) {
                C0393.m5668();
                num2 = num;
                obj = "ۡۡ";
            } else {
                num2 = num;
                obj = "ۤ۠ۢ";
            }
        }
    }

    /* renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static TextView m2401(Object obj) {
        Object obj2 = "ۧۢ۠";
        TextView textView = null;
        TextView textView2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1746687) {
                case 2080:
                case 25403:
                    obj2 = "ۣۢۤ";
                    continue;
                case 4346:
                    break;
                case 5150:
                    return textView;
                case 5152:
                    textView2 = ((AlertDialogC0270) obj).f479;
                    if (C0362.m3122() < 0) {
                        obj2 = "ۢ۟ۨ";
                    } else {
                        continue;
                    }
                case 5274:
                    if (C0088.m573() > 0) {
                        obj2 = "ۧۥۢ";
                    } else {
                        continue;
                    }
                case 5300:
                    if (C0377.m4944() <= 0) {
                        textView = textView2;
                    } else {
                        obj2 = "ۣۢۤ";
                        textView = textView2;
                        continue;
                    }
                case 6303:
                    if (C0384.m5278() > 0) {
                        obj2 = "ۣۧۧ";
                    } else {
                        continue;
                    }
                case 25460:
                    obj2 = "ۣۢ۠";
                    textView = null;
                    continue;
                case 25498:
                    if (C0379.m5056() < 0) {
                        break;
                    } else {
                        obj2 = "ۢۤۡ";
                    }
                case 25762:
                    if (C0369.m3256() > 0) {
                        obj2 = "ۧۢ۠";
                    } else {
                        continue;
                    }
            }
            if (C0078.m361() <= 0) {
                C0009.m36();
            } else {
                obj2 = "ۥۦۡ";
            }
        }
    }

    /* renamed from: ۟ۢۥۡۦ, reason: not valid java name and contains not printable characters */
    public static TextView m2402(Object obj) {
        String str = "۟ۦۣ";
        TextView textView = null;
        TextView textView2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751650) {
                case 2:
                case 30720:
                    if (C0396.m5741() < 0) {
                        str = "ۨ۟ۨ";
                    } else {
                        continue;
                    }
                case 4515:
                    textView2 = ((AlertDialogC0270) obj).f476;
                    str = "ۡۤۦ";
                    continue;
                case 4536:
                    str = "۠ۥۧ";
                    continue;
                case 4576:
                    if (C0334.m2866() <= 0) {
                        textView = null;
                    } else {
                        str = "ۣۨۨ";
                        textView = null;
                        continue;
                    }
                case 5441:
                    str = "ۨ۟ۨ";
                    textView = textView2;
                    continue;
                case 7614:
                    if (C0060.m216() < 0) {
                        break;
                    } else {
                        str = "۠ۧۨ";
                    }
                case 29363:
                    return textView;
                case 29569:
                    if (C0397.m5814() <= 0) {
                        C0381.m5127();
                    } else {
                        str = "ۤۤ۠";
                        continue;
                    }
                case 31814:
                    break;
                case 1730301:
                    str = "۟ۦۣ";
                    continue;
            }
            str = C0184.m1524() >= 0 ? "ۣ۠ۡ" : "۠ۨۢ";
        }
    }

    /* renamed from: ۣ۟ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static TextView m2403(Object obj) {
        Object obj2 = "ۣۦۥ";
        TextView textView = null;
        TextView textView2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1749632) {
                case 4:
                    if (C0378.m4998() <= 0) {
                        C0370.m3284();
                        textView = textView2;
                    } else {
                        obj2 = "ۨۨ۟";
                        textView = textView2;
                        continue;
                    }
                case 1122:
                    if (C0155.m1294() >= 0) {
                        break;
                    } else if (C0346.m3059() < 0) {
                        obj2 = "۠ۧۢ";
                    }
                case 2891:
                    obj2 = "۠ۧۡ";
                    continue;
                case 3940:
                    obj2 = "ۤ۟ۦ";
                    textView = null;
                    continue;
                case 5473:
                    if (C0179.m1427() > 0) {
                        obj2 = "ۣۦۥ";
                    } else {
                        continue;
                    }
                case 6431:
                    if (C0155.m1294() < 0) {
                        obj2 = "ۥۢۡ";
                    } else {
                        continue;
                    }
                case 6458:
                case 1732125:
                    if (C0384.m5278() <= 0) {
                        obj2 = "ۡۧ۠";
                    } else {
                        obj2 = "ۨۨ۟";
                        continue;
                    }
                case 6459:
                    textView2 = ((AlertDialogC0270) obj).f480;
                    if (C0206.m1807() < 0) {
                        obj2 = "ۣۢۡ";
                    } else {
                        continue;
                    }
                case 31583:
                    return textView;
                case 1732285:
                    break;
            }
            if (C0377.m4944() <= 0) {
                C0378.m4998();
                obj2 = "ۡۨۨ";
            } else {
                obj2 = "۠ۦۥ";
            }
        }
    }

    /* renamed from: ۟ۤ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static View m2404(Object obj) {
        String str = "ۤۨۧ";
        View view = null;
        View view2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750724) {
                case 165:
                case 29679:
                    str = "ۥۤۤ";
                    continue;
                case 2273:
                    return view;
                case 2883:
                    if (C0368.m3171() < 0) {
                        str = "ۨۤۨ";
                    } else {
                        continue;
                    }
                case 3111:
                    if (C0335.m2923() > 0) {
                        break;
                    } else if (C0155.m1294() >= 0) {
                        C0362.m3122();
                    } else {
                        str = "ۣۤۢ";
                    }
                case 3207:
                    view2 = ((AlertDialogC0270) obj).f478;
                    if (C0082.m410() >= 0) {
                        str = "۠ۡ۠";
                    } else {
                        str = "۠ۡ";
                        continue;
                    }
                case 4413:
                    if (C0183.m1464() <= 0) {
                        str = "ۣۢۧ";
                    } else {
                        str = "ۤۨۧ";
                        continue;
                    }
                case 4516:
                    break;
                case 7170:
                    if (C0380.m5068() <= 0) {
                        str = "۟ۤۧ";
                    } else {
                        str = "ۧ۠ۤ";
                        continue;
                    }
                case 32680:
                    str = "۠۟ۥ";
                    view = null;
                    continue;
                case 1731269:
                    str = "ۥۤۤ";
                    view = view2;
                    continue;
            }
            if (C0390.m5512() > 0) {
                str = "ۥ۟ۡ";
            }
        }
    }

    /* renamed from: ۟ۥۥ۟, reason: not valid java name and contains not printable characters */
    public static void m2405(Object obj) {
        String str = "ۢۨۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747749) {
                case 249:
                    str = "۟ۡۡ";
                    continue;
                case 1452:
                    str = "ۢۨۨ";
                    continue;
                case 3098:
                case 5447:
                    str = "ۤۡۨ";
                    continue;
                case 4398:
                    return;
                case 6215:
                    if (C0228.m2012() < 0) {
                        break;
                    } else if (C0377.m4944() > 0) {
                        str = "ۧۨ";
                    }
                case 25198:
                    break;
                case 1734596:
                    ((AlertDialogC0270) obj).m2400();
                    str = "ۤۡۨ";
                    continue;
            }
            if (C0291.m2568() >= 0) {
                C0191.m1627();
                str = "ۨۨۥ";
            } else {
                str = "۠ۨۤ";
            }
        }
    }

    /* renamed from: ۟ۦۡۤۥ, reason: not valid java name and contains not printable characters */
    public static View m2406(Object obj) {
        String str = "ۨ۠ۨ";
        View view = null;
        View view2 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1748866) {
                case 380:
                    if (C0088.m573() <= 0) {
                        C0083.m448();
                        str = "ۣ۠ۢ";
                        view = null;
                    } else {
                        str = "ۦۨۥ";
                        view = null;
                        continue;
                    }
                case 1347:
                    return view;
                case 2076:
                case 6534:
                    if (C0291.m2568() >= 0) {
                        C0368.m3171();
                    } else {
                        str = "۠۟۠";
                        continue;
                    }
                case 4380:
                    break;
                case 4605:
                    str = "ۨ۠ۨ";
                    continue;
                case 26482:
                    if (C0420.m6215() > 0) {
                        break;
                    } else {
                        str = C0400.m5961() <= 0 ? "ۥ۟ۥ" : "ۧ۠ۤ";
                    }
                case 27305:
                    view2 = ((AlertDialogC0270) obj).mView;
                    if (C0379.m5056() <= 0) {
                        C0387.m5374();
                    } else {
                        str = "۠ۨ";
                        continue;
                    }
                case 28129:
                    if (C0089.m592() <= 0) {
                        C0060.m216();
                    } else {
                        str = "ۣ۟۠";
                        continue;
                    }
                case 28264:
                    str = "ۣۡ۠";
                    continue;
                case 1733514:
                    if (C0078.m361() <= 0) {
                        C0229.m2064();
                        view = view2;
                    } else {
                        str = "۠۟۠";
                        view = view2;
                        continue;
                    }
            }
            str = "ۦۤۨ";
        }
    }

    /* renamed from: ۣ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static TextView m2407(Object obj) {
        String str = "ۤ۟۟";
        TextView textView = null;
        TextView textView2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746909) {
                case 3174:
                    str = "ۤ۟۟";
                    continue;
                case 4567:
                case 5343:
                    if (C0164.m1359() >= 0) {
                        C0384.m5278();
                    } else {
                        str = "ۥۣۦ";
                        continue;
                    }
                case 6560:
                    textView2 = ((AlertDialogC0270) obj).f473;
                    if (C0183.m1464() <= 0) {
                        C0387.m5374();
                        str = "ۦۤۨ";
                    } else {
                        str = "ۦۡ۟";
                        continue;
                    }
                case 6613:
                    return textView;
                case 7705:
                    if (C0377.m4944() < 0) {
                        break;
                    } else if (C0377.m4944() <= 0) {
                        C0335.m2923();
                        str = "ۢۦ۟";
                    } else {
                        str = "ۥۧ۟";
                    }
                case 26073:
                    str = "ۢۥۥ";
                    continue;
                case 26201:
                    if (C0420.m6215() >= 0) {
                        C0334.m2866();
                        textView = textView2;
                    } else {
                        str = "ۥۣۦ";
                        textView = textView2;
                        continue;
                    }
                case 28405:
                    if (C0383.m5203() > 0) {
                        str = "ۦۣ";
                    } else {
                        continue;
                    }
                case 28435:
                    break;
                case 1735520:
                    if (C0395.m5698() >= 0) {
                        textView = null;
                    } else {
                        str = "ۦۥۣ";
                        textView = null;
                        continue;
                    }
            }
            str = "ۨۢۢ";
        }
    }

    /* renamed from: ۣۢۧۨ, reason: not valid java name and contains not printable characters */
    public static View m2408(Object obj) {
        Object obj2 = "ۣ۠ۤ";
        View view = null;
        View view2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1752462) {
                case 5:
                    break;
                case 1011:
                    view2 = ((AlertDialogC0270) obj).f474;
                    if (C0074.m307() >= 0) {
                        C0206.m1807();
                    } else {
                        obj2 = "ۤ۠۠";
                        continue;
                    }
                case 1130:
                    if (C0379.m5056() <= 0) {
                        C0398.m5833();
                        obj2 = "ۥ۟۟";
                        view = view2;
                    } else {
                        obj2 = "ۧۧ";
                        view = view2;
                        continue;
                    }
                case 5651:
                    if (C0088.m573() <= 0) {
                        C0383.m5203();
                    } else {
                        obj2 = "ۣ۠ۤ";
                        continue;
                    }
                case 5716:
                    if (C0121.m1023() < 0) {
                        obj2 = "ۣ۟ۤ";
                    } else {
                        continue;
                    }
                case 5841:
                    if (C0389.m5481() <= 0) {
                        break;
                    } else if (C0388.m5430() > 0) {
                        obj2 = "ۥۧ۟";
                    }
                case 5869:
                case 30952:
                    if (C0009.m36() >= 0) {
                        C0279.m2491();
                    } else {
                        obj2 = "ۧۧ";
                        continue;
                    }
                case 6670:
                    if (C0362.m3122() >= 0) {
                        C0368.m3171();
                        view = null;
                    } else {
                        obj2 = "ۣۢ";
                        view = null;
                        continue;
                    }
                case 1728878:
                    return view;
                case 1728977:
                    if (C0074.m307() < 0) {
                        obj2 = "ۧۢۡ";
                    } else {
                        continue;
                    }
            }
            if (C0191.m1627() >= 0) {
                C0073.m265();
            } else {
                obj2 = "۠ۨۢ";
            }
        }
    }

    /* renamed from: ۣۡۤ۟, reason: not valid java name and contains not printable characters */
    public static TextView m2409(Object obj) {
        String str = "ۤۢۨ";
        TextView textView = null;
        TextView textView2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753485) {
                case 1124:
                    break;
                case 1135:
                    if (C0382.m5180() <= 0) {
                        C0184.m1524();
                        textView = textView2;
                    } else {
                        str = "ۣ۠ۨ";
                        textView = textView2;
                        continue;
                    }
                case 28333:
                    if (C0362.m3122() >= 0) {
                        textView = null;
                    } else {
                        str = "ۤۡ۟";
                        textView = null;
                        continue;
                    }
                case 29553:
                case 30579:
                    if (C0397.m5814() <= 0) {
                        str = "۠ۧۧ";
                    } else {
                        str = "ۣ۠ۨ";
                        continue;
                    }
                case 30630:
                    return textView;
                case 31571:
                    textView2 = ((AlertDialogC0270) obj).f477;
                    str = "ۧۦۡ";
                    continue;
                case 31631:
                    str = "ۢۥ۟";
                    continue;
                case 31655:
                    if (C0399.m5914() < 0) {
                        break;
                    } else if (C0391.m5571() <= 0) {
                        C0385.m5282();
                        str = "ۣۢۤ";
                    } else {
                        str = "ۤۨۢ";
                    }
                case 1711447:
                    if (C0088.m573() <= 0) {
                        C0291.m2568();
                        str = "ۨۦ";
                    } else {
                        str = "ۣۡۤ";
                        continue;
                    }
                case 1711566:
                    if (C0009.m36() >= 0) {
                        str = "ۡۦۦ";
                    } else {
                        str = "ۤۢۨ";
                        continue;
                    }
            }
            if (C0179.m1427() > 0) {
                str = "ۧۡ";
            }
        }
    }

    /* renamed from: ۦۤۥ۠, reason: contains not printable characters */
    public static LinearLayout m2410(Object obj) {
        String str = "ۧۧۦ";
        LinearLayout linearLayout = null;
        LinearLayout linearLayout2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56443) {
                case 124:
                    if (C0183.m1464() <= 0) {
                        str = "ۦۦ";
                    } else {
                        str = "ۧۧۦ";
                        continue;
                    }
                case 1710717:
                    if (C0073.m265() <= 0) {
                        break;
                    } else if (C0082.m410() >= 0) {
                        C0228.m2012();
                    } else {
                        str = "ۥۡ۠";
                    }
                case 1710719:
                    return linearLayout;
                case 1711699:
                    break;
                case 1728959:
                    linearLayout2 = ((AlertDialogC0270) obj).f482;
                    if (C0082.m410() >= 0) {
                        str = "ۡۨۨ";
                    } else {
                        str = "ۢ۟ۨ";
                        continue;
                    }
                case 1729081:
                case 1733308:
                    if (C0368.m3171() >= 0) {
                        C0389.m5481();
                    } else {
                        str = "ۧۧۤ";
                        continue;
                    }
                case 1730052:
                    if (C0121.m1023() < 0) {
                        str = "ۥۥۢ";
                    } else {
                        continue;
                    }
                case 1731227:
                    if (C0386.m5322() > 0) {
                        str = "۠۟۟";
                    } else {
                        continue;
                    }
                case 1732144:
                    str = "ۧۧۤ";
                    linearLayout = linearLayout2;
                    continue;
                case 1734331:
                    if (C0370.m3284() >= 0) {
                        C0184.m1524();
                        str = "۠۟۠";
                        linearLayout = null;
                    } else {
                        str = "ۤۥ۠";
                        linearLayout = null;
                        continue;
                    }
            }
            str = C0390.m5512() <= 0 ? "ۣ۠ۡ" : "ۣۦۣ";
        }
    }

    /* renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static View m2411(Object obj) {
        Object obj2 = "ۡ۟ۢ";
        View view = null;
        View view2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1750599) {
                case 33:
                case 29482:
                    obj2 = "ۡۢۦ";
                    continue;
                case 2145:
                    break;
                case 6306:
                    return view;
                case 6339:
                    if (C0400.m5961() < 0) {
                        break;
                    } else if (C0121.m1023() >= 0) {
                        C0378.m4998();
                        obj2 = "ۥۢ۟";
                    } else {
                        obj2 = "ۣۧۥ";
                    }
                case 28772:
                    if (C0009.m36() < 0) {
                        obj2 = "ۣۨۥ";
                    } else {
                        continue;
                    }
                case 29453:
                    if (C0380.m5068() > 0) {
                        obj2 = "ۡ۟ۢ";
                    } else {
                        continue;
                    }
                case 29646:
                    view2 = ((AlertDialogC0270) obj).f481;
                    if (C0400.m5961() > 0) {
                        obj2 = "ۨۧۤ";
                    } else {
                        continue;
                    }
                case 32525:
                    obj2 = "ۣ۠";
                    view = null;
                    continue;
                case 32642:
                    obj2 = "ۡۢۦ";
                    view = view2;
                    continue;
                case 1731140:
                    if (C0279.m2491() >= 0) {
                        C0291.m2568();
                        obj2 = "ۣ۠ۥ";
                    } else {
                        obj2 = "ۧۢۨ";
                        continue;
                    }
            }
            if (C0164.m1359() < 0) {
                obj2 = "ۧۨۤ";
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    public void setMessage(String str) {
        TextView textViewM2409 = null;
        String str2 = "۟ۨۨ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1746944) {
                case 31:
                    textViewM2409 = m2409(this);
                    if (C0384.m5278() <= 0) {
                        C0291.m2568();
                        str2 = "ۤۢۡ";
                    } else {
                        str2 = "ۣۤۤ";
                        continue;
                    }
                case 952:
                    C0279.m2504(textViewM2409, str);
                    str2 = "۠ۨۧ";
                    continue;
                case 991:
                    return;
                case 6821:
                    break;
                case 7843:
                    if (textViewM2409 == null) {
                        break;
                    } else if (C0386.m5322() <= 0) {
                        C0155.m1294();
                        str2 = "۟ۡ";
                    } else {
                        str2 = "۠ۧ۟";
                    }
                case 1733850:
                    str2 = "۟ۨۨ";
                    continue;
            }
            if (C0228.m2012() <= 0) {
                C0420.m6215();
            } else {
                str2 = "۠ۨۧ";
            }
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        TextView textViewM2407 = null;
        String str = "ۢ۟ۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746939) {
                case 166:
                    C0279.m2504(textViewM2407, charSequence);
                    str = "ۣۡۢ";
                    continue;
                case 184:
                    if (textViewM2407 == null) {
                        break;
                    } else {
                        str = "۟ۢ۠";
                    }
                case 4543:
                    return;
                case 5555:
                    textViewM2407 = m2407(this);
                    str = "۟ۡۥ";
                    continue;
                case 6770:
                    str = "ۢ۟ۥ";
                    continue;
                case 7728:
                    break;
            }
            str = "ۣۡۢ";
        }
    }

    @Override // android.app.AlertDialog
    public void setView(View view) {
        String str = "ۨۦۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755556) {
                case 13:
                    this.mView = view;
                    str = "ۤۦۦ";
                    break;
                case 29440:
                    return;
                case 32601:
                    if (C0420.m6215() < 0) {
                        str = "ۨۦۧ";
                        break;
                    } else {
                        C0229.m2064();
                        break;
                    }
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273, android.app.Dialog
    public void show() {
        View viewM2406 = null;
        String str = "۠ۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752612) {
                case 897:
                    if (C0388.m5430() <= 0) {
                        C0346.m3059();
                        str = "ۣۣۤ";
                    } else {
                        str = "۠ۤ";
                        continue;
                    }
                case 1178:
                    break;
                case 4224:
                    if (viewM2406 != null) {
                        break;
                    } else {
                        str = C0346.m3059() >= 0 ? "ۧۡۦ" : "ۨۢۥ";
                    }
                case 4251:
                case 32673:
                    str = "۟ۧۨ";
                    continue;
                case 5668:
                    super.show();
                    str = "ۦۢۨ";
                    continue;
                case 30479:
                    super.setView(m2408(this));
                    str = "ۡۢ";
                    continue;
                case 30759:
                    super.setView(viewM2406);
                    if (C0362.m3122() >= 0) {
                        C0382.m5180();
                        str = "۟ۡۦ";
                    } else {
                        str = "۟ۧۨ";
                        continue;
                    }
                case 32648:
                    return;
                case 1729029:
                    if (C0389.m5481() <= 0) {
                        C0381.m5127();
                    } else {
                        str = "ۡۡ۟";
                        continue;
                    }
                case 1729056:
                    viewM2406 = m2406(this);
                    if (C0376.m4906() <= 0) {
                        C0394.m5672();
                    } else {
                        str = "ۣۡ۠";
                        continue;
                    }
            }
            if (C0291.m2568() < 0) {
                str = "ۣۧۧ";
            }
        }
    }

    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    /* renamed from: ̗ */
    public void mo2397(String str, View.OnClickListener onClickListener) {
        TextView textViewM2401 = null;
        String str2 = "ۢۥۡ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1749575) {
                case 185:
                    textViewM2401 = m2401(this);
                    str2 = "ۣۢۥ";
                    continue;
                case 1057:
                    if (textViewM2401 != null) {
                        break;
                    } else if (C0398.m5833() > 0) {
                        str2 = "ۧ۠";
                    }
                case 1368:
                    if (C0390.m5512() > 0) {
                        str2 = "ۢۥۡ";
                    } else {
                        continue;
                    }
                case 28775:
                case 1732254:
                    return;
                case 29605:
                    break;
                case 1730982:
                    C0379.m5044(m2401(this), onClickListener);
                    if (C0400.m5961() <= 0) {
                        C0009.m36();
                        str2 = "ۥۣ۟";
                    } else {
                        str2 = "ۦۦ۠";
                        continue;
                    }
                case 1732229:
                    C0279.m2504(m2401(this), str);
                    if (C0078.m361() > 0) {
                        str2 = "۟۠";
                    } else {
                        continue;
                    }
                case 1732324:
                    C0334.m2870(textViewM2401, 0);
                    if (C0379.m5056() <= 0) {
                        str2 = "ۨۧۦ";
                    } else {
                        str2 = "ۦۨ";
                        continue;
                    }
            }
            str2 = "ۥۨ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0010. Please report as an issue. */
    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    /* renamed from: ̗̖ */
    public void mo2398(String str, View.OnClickListener onClickListener) {
        String str2 = "ۣ۟ۢ";
        int iIntValue = 0;
        int iM1842 = 0;
        Integer num = null;
        int i = 0;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1746907) {
                case 219:
                case 2367:
                    if (C0392.m5595() > 0) {
                        str2 = "ۢۧۢ";
                    }
                case 2270:
                    C0334.m2870(m2403(this), 0);
                    str2 = C0334.m2866() <= 0 ? "۠ۢۥ" : "ۨ۟ۤ";
                case 3237:
                    C0369.m3226(m2411(this), 0);
                    str2 = "ۧۥۣ";
                case 3289:
                    C0369.m3226(m2411(this), i);
                    str2 = C0420.m6215() >= 0 ? "ۣۤۡ" : "ۢۧۢ";
                case 4312:
                    C0379.m5044(m2403(this), onClickListener);
                    if (C0060.m216() <= 0) {
                        C0228.m2012();
                        str2 = "ۣۡۤ";
                    } else {
                        str2 = "ۣ۟ۥ";
                    }
                case 4378:
                    if (iM1842 != 0) {
                        str2 = "ۣ۠ۡ";
                    } else if (C0380.m5068() <= 0) {
                        C0335.m2923();
                        str2 = "ۣ۠ۡ";
                    } else {
                        str2 = "۠ۥۣ";
                    }
                case 4411:
                    i = ((iIntValue ^ (-1)) & 1753432) | ((-1753433) & iIntValue);
                    if (C0155.m1294() < 0) {
                        str2 = "ۣۥۣ";
                    }
                case 4536:
                    str2 = "ۥۧۦ";
                case 4540:
                    str2 = "ۣ۠ۡ";
                case 4562:
                case 5306:
                    break;
                case 4573:
                    num = new Integer(1753424);
                    str2 = "ۢۡۡ";
                case 5350:
                    if (C0206.m1842(m2402(this)) != 0) {
                        str2 = "ۥۧۦ";
                    } else if (C0381.m5127() > 0) {
                        str2 = "ۢۡۦ";
                    }
                case 5464:
                    if (C0334.m2866() > 0) {
                        str2 = "ۣ۟ۢ";
                    }
                case 5465:
                    str2 = m2403(this) == null ? "ۢۨۧ" : "ۦۥ۠";
                case 5467:
                case 25308:
                    if (C0191.m1627() >= 0) {
                        C0074.m307();
                        str2 = "ۨۧۥ";
                    } else {
                        str2 = "ۣۡۧ";
                    }
                case 5468:
                    C0369.m3226(m2404(this), 0);
                    str2 = "ۣۧۢ";
                case 6495:
                    C0369.m3226(m2404(this), i);
                    str2 = C0368.m3171() >= 0 ? "ۣۡ" : "ۣۡۧ";
                case 25118:
                    str2 = "ۡۢۥ";
                case 25181:
                    if (C0380.m5068() <= 0) {
                        C0179.m1427();
                    } else {
                        str2 = "ۧ۟۟";
                    }
                case 26074:
                    iM1842 = C0206.m1842(m2401(this));
                    if (C0395.m5698() >= 0) {
                        C0377.m4944();
                    } else {
                        str2 = "ۨ۠ۥ";
                    }
                case 26262:
                case 28438:
                    C0279.m2504(m2403(this), str);
                    str2 = "ۣۧۧ";
                case 28470:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    str2 = "ۣۦۣ";
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016d A[SYNTHETIC] */
    @Override // com.cloudinject.feature.p021.AlertDialogC0273
    /* renamed from: ̙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2399(java.lang.String r9, android.view.View.OnClickListener r10) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p021.AlertDialogC0270.mo2399(java.lang.String, android.view.View$OnClickListener):void");
    }
}
