package com.cloudinject.customview;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.database.C0073;
import android.database.C0074;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
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
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
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

/* loaded from: classes6.dex */
public class FeatureLinearLayout extends LinearLayout {
    private Context mContext;

    /* renamed from: ̗̗̖̖̖̙̗, reason: not valid java name and contains not printable characters */
    private String f240;

    /* renamed from: ̗̗̖̖̖̙̙, reason: not valid java name and contains not printable characters */
    private Paint f241;

    /* renamed from: ̗̗̖̖̗̙̖, reason: not valid java name and contains not printable characters */
    private float f242;

    /* renamed from: ̗̗̖̖̗̙̗, reason: not valid java name and contains not printable characters */
    private float f243;

    /* renamed from: ̗̗̖̖̗̙̙, reason: not valid java name and contains not printable characters */
    private float f244;

    /* renamed from: ̗̗̖̙̗̗̖, reason: not valid java name and contains not printable characters */
    private float f245;

    /* renamed from: ̗̗̙̖̖̖̗, reason: not valid java name and contains not printable characters */
    private Paint f246;

    /* renamed from: ̗̗̙̖̙̗̗, reason: not valid java name and contains not printable characters */
    private PaintFlagsDrawFilter f247;

    /* renamed from: ̗̗̙̙̗̖̗, reason: not valid java name and contains not printable characters */
    private float f248;

    /* renamed from: ̗̗̙̙̗̖̙, reason: not valid java name and contains not printable characters */
    private float f249;

    /* renamed from: ̗̗̙̙̗̗̗, reason: not valid java name and contains not printable characters */
    private Paint f250;

    public FeatureLinearLayout(Context context) {
        this(context, null);
    }

    public FeatureLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str = "ۥ۠ۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754377) {
                case 235:
                    this.f243 = 0.0f;
                    if (C0393.m5668() > 0) {
                        str = "ۥ۟ۤ";
                        break;
                    } else {
                        str = "۠ۨ۟";
                        break;
                    }
                case 25174:
                    this.f244 = 0.02f;
                    if (C0362.m3122() < 0) {
                        str = "ۢۤۨ";
                        break;
                    } else {
                        C0164.m1359();
                        break;
                    }
                case 25291:
                    if (C0391.m5571() > 0) {
                        str = "ۥ۠ۥ";
                        break;
                    } else {
                        C0397.m5814();
                        break;
                    }
                case 27191:
                    return;
                case 28182:
                    this.f249 = 0.05f;
                    if (C0389.m5481() <= 0) {
                        break;
                    } else {
                        str = "۟ۢۢ";
                        break;
                    }
                case 28310:
                    C0279.m2468(this);
                    if (C0228.m2012() > 0) {
                        str = "ۡۥۢ";
                        break;
                    } else {
                        C0291.m2568();
                        str = "ۣۨ";
                        break;
                    }
                case 30703:
                    this.f240 = C0385.m5310(C0384.m5272());
                    if (C0009.m36() < 0) {
                        str = "ۤۨۧ";
                        break;
                    } else {
                        C0228.m2012();
                        break;
                    }
                case 30851:
                    this.f248 = 0.03f;
                    str = "۠ۢۡ";
                    break;
                case 30883:
                    this.f242 = 0.0f;
                    str = "ۥۣ";
                    break;
                case 32746:
                    this.mContext = context;
                    if (C0184.m1524() >= 0) {
                        break;
                    } else {
                        str = "۠ۦۥ";
                        break;
                    }
                case 1710487:
                    this.f245 = 0.0f;
                    if (C0386.m5322() > 0) {
                        str = "ۧۦۡ";
                        break;
                    } else {
                        str = "۟ۥ۠";
                        break;
                    }
            }
        }
    }

    /* renamed from: ۟۟ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static float m1451(Object obj) {
        String str = "ۣۤ";
        float f = 0.0f;
        float f2 = 0.0f;
        while (true) {
            switch (C0395.m5690(str) ^ 1746725) {
                case 231:
                    str = "ۣۤ";
                    continue;
                case 2499:
                case 5607:
                    if (C0389.m5481() <= 0) {
                        C0088.m573();
                    } else {
                        str = "ۤۦۢ";
                        continue;
                    }
                case 4579:
                    str = "ۤۦۢ";
                    f = f2;
                    continue;
                case 5220:
                    break;
                case 5443:
                    f2 = ((FeatureLinearLayout) obj).f244;
                    if (C0376.m4906() > 0) {
                        str = "ۣۥۨ";
                    } else {
                        continue;
                    }
                case 5473:
                    str = "ۨۦ۠";
                    f = 0.0f;
                    continue;
                case 7557:
                    return f;
                case 25152:
                    if (C0377.m4944() > 0) {
                        str = "ۢ۟ۡ";
                    } else {
                        continue;
                    }
                case 28295:
                    str = "ۡۢۧ";
                    continue;
                case 1735514:
                    if (C0078.m361() < 0) {
                        break;
                    } else {
                        str = "ۢ۠ۤ";
                    }
            }
            str = C0083.m448() >= 0 ? "۟۠" : "ۧۢ۠";
        }
    }

    /* renamed from: ۟۟ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static float m1452(Object obj) {
        Object obj2 = "۟ۥ۠";
        float f = 0.0f;
        float f2 = 0.0f;
        while (true) {
            switch (C0395.m5690(obj2) ^ 56449) {
                case 1728781:
                    if (C0229.m2064() >= 0) {
                        obj2 = "ۦۨۥ";
                    } else {
                        obj2 = "ۢۢۦ";
                        continue;
                    }
                case 1731079:
                    f2 = ((FeatureLinearLayout) obj).f243;
                    if (C0179.m1427() > 0) {
                        obj2 = "۠ۡۨ";
                    } else {
                        continue;
                    }
                case 1731270:
                    obj2 = "۟ۥ۠";
                    continue;
                case 1732135:
                    if (C0380.m5068() <= 0) {
                        C0377.m4944();
                        f = 0.0f;
                    } else {
                        obj2 = "۠ۥۨ";
                        f = 0.0f;
                        continue;
                    }
                case 1732320:
                    return f;
                case 1733629:
                    break;
                case 1734271:
                case 1735677:
                    if (C0078.m361() <= 0) {
                        C0386.m5322();
                        obj2 = "۠۠ۨ";
                    } else {
                        obj2 = "ۢ۠۟";
                        continue;
                    }
                case 1734402:
                    obj2 = "ۣ۟۠";
                    continue;
                case 1734534:
                    obj2 = "ۢ۠۟";
                    f = f2;
                    continue;
                case 1735483:
                    if (C0025.m118() <= 0) {
                        break;
                    } else if (C0279.m2491() >= 0) {
                        C0121.m1023();
                        obj2 = "ۨ۟ۧ";
                    } else {
                        obj2 = "ۣۣۦ";
                    }
            }
            if (C0183.m1464() <= 0) {
                C0370.m3284();
                obj2 = "ۤۥۥ";
            } else {
                obj2 = "ۥ۟ۦ";
            }
        }
    }

    /* renamed from: ۟۠ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static Paint m1453(Object obj) {
        Object obj2 = "ۣۨۦ";
        Paint paint = null;
        Paint paint2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1750719) {
                case 2231:
                    if (C0121.m1023() >= 0) {
                        C0083.m448();
                        obj2 = "ۣۢۡ";
                        paint = null;
                    } else {
                        obj2 = "ۤۢۡ";
                        paint = null;
                        continue;
                    }
                case 3228:
                    if (C0088.m573() > 0) {
                        obj2 = "ۧۥۦ";
                    } else {
                        continue;
                    }
                case 4421:
                case 29559:
                    if (C0060.m216() <= 0) {
                        C0369.m3256();
                        obj2 = "ۦۣ۟";
                    } else {
                        obj2 = "ۦۢۡ";
                        continue;
                    }
                case 6269:
                    if (C0383.m5203() <= 0) {
                        C0396.m5741();
                        obj2 = "ۤۢۥ";
                    } else {
                        obj2 = "ۥۣۦ";
                        continue;
                    }
                case 29686:
                    break;
                case 30490:
                    return paint;
                case 32571:
                    if (C0368.m3171() < 0) {
                        obj2 = "ۣۨۦ";
                    } else {
                        continue;
                    }
                case 32756:
                    if (C0420.m6215() >= 0) {
                        break;
                    } else if (C0083.m448() < 0) {
                        obj2 = "ۨ۟";
                    }
                case 1731106:
                    if (C0375.m4840() >= 0) {
                        paint = paint2;
                    } else {
                        obj2 = "ۦۢۡ";
                        paint = paint2;
                        continue;
                    }
                case 1731144:
                    paint2 = ((FeatureLinearLayout) obj).f250;
                    if (C0179.m1427() <= 0) {
                        C0089.m592();
                    } else {
                        obj2 = "ۥۢ";
                        continue;
                    }
            }
            obj2 = "ۡۡۢ";
        }
    }

    /* renamed from: ۣ۟۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static Paint m1454(Object obj) {
        String str = "ۣۣۡ";
        Paint paint = null;
        Paint paint2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751501) {
                case 1121:
                    str = "ۣۣۡ";
                    continue;
                case 1131:
                case 2793:
                    str = "ۧۡۢ";
                    continue;
                case 2025:
                    paint2 = ((FeatureLinearLayout) obj).f241;
                    if (C0164.m1359() >= 0) {
                        C0335.m2923();
                        str = "ۢۧۥ";
                    } else {
                        str = "ۣ۟۟";
                        continue;
                    }
                case 3916:
                    if (C0387.m5374() >= 0) {
                        break;
                    } else {
                        str = "ۥۣۤ";
                    }
                case 5988:
                    break;
                case 7862:
                    if (C0060.m216() <= 0) {
                        str = "ۣ۟ۤ";
                        paint = paint2;
                    } else {
                        str = "ۧۡۢ";
                        paint = paint2;
                        continue;
                    }
                case 28743:
                    if (C0385.m5282() < 0) {
                        str = "ۣ۠";
                    } else {
                        continue;
                    }
                case 30852:
                    if (C0155.m1294() >= 0) {
                        C0078.m361();
                    } else {
                        str = "ۢۦۨ";
                        continue;
                    }
                case 31877:
                    return paint;
                case 1729998:
                    str = "ۦ۟ۢ";
                    paint = null;
                    continue;
            }
            if (C0381.m5127() > 0) {
                str = "ۨۥۧ";
            }
        }
    }

    /* renamed from: ۟ۦۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static float m1455(Object obj) {
        Object obj2 = "ۡۢۥ";
        float f = 0.0f;
        float f2 = 0.0f;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1747899) {
                case 376:
                case 27218:
                    if (C0393.m5668() <= 0) {
                        obj2 = "۠ۥ";
                    } else {
                        obj2 = "ۤ۟";
                        continue;
                    }
                case 1058:
                    if (C0164.m1359() < 0) {
                        obj2 = "۠۟ۢ";
                    } else {
                        continue;
                    }
                case 1191:
                    obj2 = "ۡۨ۠";
                    f = 0.0f;
                    continue;
                case 1375:
                    if (C0279.m2491() > 0) {
                        break;
                    } else {
                        obj2 = "ۣۧ";
                    }
                case 3077:
                    break;
                case 3396:
                    if (C0368.m3171() >= 0) {
                        C0184.m1524();
                        f = f2;
                    } else {
                        obj2 = "ۤ۟";
                        f = f2;
                        continue;
                    }
                case 7452:
                    obj2 = "ۡۢۥ";
                    continue;
                case 1732701:
                    if (C0074.m307() < 0) {
                        obj2 = "ۡۤ۟";
                    } else {
                        continue;
                    }
                case 1734592:
                    return f;
                case 1734623:
                    f2 = ((FeatureLinearLayout) obj).f249;
                    if (C0369.m3256() > 0) {
                        obj2 = "۟۟۟";
                    } else {
                        continue;
                    }
            }
            if (C0387.m5374() < 0) {
                obj2 = "۟ۥ";
            }
        }
    }

    /* renamed from: ۠ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static float m1456(Object obj) {
        String str = "ۥۣ۠";
        float f = 0.0f;
        float f2 = 0.0f;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751526) {
                case 1071:
                    f2 = ((FeatureLinearLayout) obj).f248;
                    str = "ۧ۠۟";
                    continue;
                case 1956:
                case 4865:
                    if (C0121.m1023() < 0) {
                        str = "ۥۢ";
                    } else {
                        continue;
                    }
                case 2020:
                    if (C0086.m500() < 0) {
                        break;
                    } else if (C0398.m5833() <= 0) {
                        C0073.m265();
                    } else {
                        str = "ۥۡۥ";
                    }
                case 3905:
                    str = "ۧۤۦ";
                    continue;
                case 7811:
                    break;
                case 28676:
                    if (C0086.m500() <= 0) {
                        str = "ۨۥۨ";
                    } else {
                        str = "ۥۣ۠";
                        continue;
                    }
                case 28909:
                    if (C0089.m592() > 0) {
                        str = "ۥۥۢ";
                    } else {
                        continue;
                    }
                case 31823:
                    if (C0334.m2866() <= 0) {
                        C0082.m410();
                        str = "ۣۡ۟";
                        f = 0.0f;
                    } else {
                        str = "ۨۡۤ";
                        f = 0.0f;
                        continue;
                    }
                case 31936:
                    str = "ۥۢ";
                    f = f2;
                    continue;
                case 1729915:
                    return f;
            }
            str = C0082.m410() >= 0 ? "۠ۤ" : "ۣۤۨ";
        }
    }

    /* renamed from: ۣۡۡۧ, reason: not valid java name and contains not printable characters */
    public static float m1457(Object obj) {
        Object obj2 = "ۣۡ۟";
        float f = 0.0f;
        float f2 = 0.0f;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1753668) {
                case 2831:
                    if (C0370.m3284() >= 0) {
                        obj2 = "ۧۤۢ";
                        f = f2;
                    } else {
                        obj2 = "ۣۨۢ";
                        f = f2;
                        continue;
                    }
                case 2925:
                    return f;
                case 3015:
                case 31778:
                    obj2 = "ۣۨۢ";
                    continue;
                case 27803:
                    f2 = ((FeatureLinearLayout) obj).f245;
                    if (C0391.m5571() <= 0) {
                        C0335.m2923();
                    } else {
                        obj2 = "ۣۨۦ";
                        continue;
                    }
                case 27833:
                    if (C0179.m1427() <= 0) {
                        break;
                    } else {
                        obj2 = "ۡۢ۠";
                    }
                case 27885:
                    break;
                case 27904:
                    obj2 = "ۨۥ۠";
                    continue;
                case 32643:
                    obj2 = "ۡۥۨ";
                    f = 0.0f;
                    continue;
                case 32706:
                    if (C0394.m5672() <= 0) {
                        C0346.m3059();
                    } else {
                        obj2 = "ۣۡ۟";
                        continue;
                    }
                case 32739:
                    if (C0179.m1427() <= 0) {
                        C0206.m1807();
                    } else {
                        obj2 = "ۥۣۡ";
                        continue;
                    }
            }
            if (C0229.m2064() < 0) {
                obj2 = "ۥ۠ۢ";
            }
        }
    }

    /* renamed from: ۢۧۧۤ, reason: not valid java name and contains not printable characters */
    public static PaintFlagsDrawFilter m1458(Object obj) {
        String str = "ۣۡۧ";
        PaintFlagsDrawFilter paintFlagsDrawFilter = null;
        PaintFlagsDrawFilter paintFlagsDrawFilter2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746845) {
                case 2328:
                    if (C0089.m592() <= 0) {
                        paintFlagsDrawFilter = null;
                    } else {
                        str = "ۣ۟۟";
                        paintFlagsDrawFilter = null;
                        continue;
                    }
                case 3265:
                    if (C0378.m4998() > 0) {
                        str = "ۣۡ۟";
                    } else {
                        continue;
                    }
                case 3450:
                    break;
                case 4510:
                    if (C0380.m5068() <= 0) {
                        str = "ۣۥۣ";
                    } else {
                        str = "ۨۧۢ";
                        continue;
                    }
                case 4542:
                    return paintFlagsDrawFilter;
                case 4564:
                    if (C0164.m1359() > 0) {
                        break;
                    } else if (C0397.m5814() <= 0) {
                        C0396.m5741();
                    } else {
                        str = "ۣۨۡ";
                    }
                case 25271:
                case 28254:
                    str = "ۣ۠۠";
                    continue;
                case 26322:
                    if (C0370.m3284() >= 0) {
                        C0375.m4840();
                        paintFlagsDrawFilter = paintFlagsDrawFilter2;
                    } else {
                        str = "ۣ۠۠";
                        paintFlagsDrawFilter = paintFlagsDrawFilter2;
                        continue;
                    }
                case 28309:
                    if (C0086.m500() > 0) {
                        str = "ۣۡۧ";
                    } else {
                        continue;
                    }
                case 28379:
                    paintFlagsDrawFilter2 = ((FeatureLinearLayout) obj).f247;
                    if (C0291.m2568() >= 0) {
                        C0382.m5180();
                        str = "۟۟";
                    } else {
                        str = "ۦ۟ۨ";
                        continue;
                    }
            }
            if (C0191.m1627() >= 0) {
                C0206.m1807();
                str = "ۥۧۨ";
            } else {
                str = "۠ۤ۠";
            }
        }
    }

    /* renamed from: ۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static void m1459(Object obj, int i, int i2) {
        Object obj2 = "ۣۧۦ";
        while (true) {
            switch (C0395.m5690(obj2) ^ 1752648) {
                case 1224:
                case 4333:
                    if (C0381.m5127() <= 0) {
                        C0392.m5595();
                    } else {
                        obj2 = "ۣۣ۠";
                        continue;
                    }
                case 2146:
                    obj2 = "ۣۧۦ";
                    continue;
                case 2248:
                    return;
                case 2378:
                    if (C0184.m1524() >= 0) {
                        break;
                    } else {
                        obj2 = "ۢۡۥ";
                    }
                case 3278:
                    ((FeatureLinearLayout) obj).setMeasuredDimension(i, i2);
                    if (C0396.m5741() >= 0) {
                        C0362.m3122();
                    } else {
                        obj2 = "ۣۣ۠";
                        continue;
                    }
                case 6440:
                    if (C0398.m5833() > 0) {
                        obj2 = "ۡ۠ۤ";
                    } else {
                        continue;
                    }
                case 32739:
                    break;
            }
            if (C0074.m307() < 0) {
                obj2 = "ۣ۟ۢ";
            }
        }
    }

    /* renamed from: ۣۣۡ۠, reason: not valid java name and contains not printable characters */
    public static float m1460(Object obj) {
        String str = "ۣۢۢ";
        float f = 0.0f;
        float f2 = 0.0f;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56573) {
                case 64:
                    str = "ۣۢۢ";
                    continue;
                case 1709470:
                    f2 = ((FeatureLinearLayout) obj).f242;
                    str = "۟ۧۧ";
                    continue;
                case 1709555:
                case 1710431:
                    if (C0086.m500() > 0) {
                        str = "ۦۤۦ";
                    } else {
                        continue;
                    }
                case 1711381:
                    return f;
                case 1731230:
                    if (C0335.m2923() > 0) {
                        break;
                    } else {
                        str = "ۨۤ۟";
                    }
                case 1732515:
                    str = "ۧۤ۟";
                    continue;
                case 1734429:
                    break;
                case 1734498:
                    if (C0009.m36() >= 0) {
                        str = "ۢ۠۠";
                        f = 0.0f;
                    } else {
                        str = "ۢۨۤ";
                        f = 0.0f;
                        continue;
                    }
                case 1735426:
                    if (C0397.m5814() <= 0) {
                        f = f2;
                    } else {
                        str = "ۦۤۦ";
                        f = f2;
                        continue;
                    }
                case 1735488:
                    if (C0420.m6215() >= 0) {
                        C0396.m5741();
                    } else {
                        str = "۠ۦۥ";
                        continue;
                    }
            }
            if (C0346.m3059() < 0) {
                str = "۟ۥۣ";
            }
        }
    }

    /* renamed from: ۥۤ۟۠, reason: contains not printable characters */
    public static String m1461(Object obj) {
        Object obj2 = "ۣۧۧ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1746814) {
                case 2435:
                case 1735457:
                    if (C0398.m5833() <= 0) {
                        C0380.m5068();
                    } else {
                        obj2 = "ۢۧۥ";
                        continue;
                    }
                case 3238:
                    break;
                case 5182:
                    return str;
                case 5624:
                    if (C0164.m1359() < 0) {
                        obj2 = "ۣۡ۟";
                    } else {
                        continue;
                    }
                case 6493:
                    if (C0073.m265() <= 0) {
                        C0387.m5374();
                        str = null;
                    } else {
                        obj2 = "ۢۡۥ";
                        str = null;
                        continue;
                    }
                case 7481:
                    str2 = ((FeatureLinearLayout) obj).f240;
                    if (C0082.m410() < 0) {
                        obj2 = "ۤۡۦ";
                    } else {
                        continue;
                    }
                case 7543:
                    if (C0074.m307() >= 0) {
                        C0378.m4998();
                        str = str2;
                    } else {
                        obj2 = "ۢۧۥ";
                        str = str2;
                        continue;
                    }
                case 24957:
                    if (C0386.m5322() <= 0) {
                        break;
                    } else if (C0391.m5571() <= 0) {
                        C0384.m5278();
                    } else {
                        obj2 = "ۣۤۦ";
                    }
                case 28279:
                    if (C0088.m573() <= 0) {
                        C0369.m3256();
                    } else {
                        obj2 = "ۣۧۧ";
                        continue;
                    }
                case 28343:
                    if (C0397.m5814() <= 0) {
                        C0389.m5481();
                    } else {
                        obj2 = "ۥۤۢ";
                        continue;
                    }
            }
            if (C0393.m5668() <= 0) {
                C0383.m5203();
            } else {
                obj2 = "ۨۧۨ";
            }
        }
    }

    /* renamed from: ۦۨۧۧ, reason: contains not printable characters */
    public static Paint m1462(Object obj) {
        String str = "ۨ۠ۥ";
        Paint paint = null;
        Paint paint2 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1748672) {
                case 446:
                    return paint;
                case 477:
                    if (C0121.m1023() >= 0) {
                        C0399.m5914();
                    } else {
                        str = "ۦ۠ۨ";
                        continue;
                    }
                case 1438:
                    paint2 = ((FeatureLinearLayout) obj).f246;
                    if (C0381.m5127() <= 0) {
                        C0279.m2491();
                    } else {
                        str = "ۨۨۥ";
                        continue;
                    }
                case 4260:
                    str = "ۨ۠ۥ";
                    continue;
                case 7198:
                case 27426:
                    if (C0089.m592() > 0) {
                        str = "ۡۧۤ";
                    } else {
                        continue;
                    }
                case 26157:
                    if (C0382.m5180() <= 0) {
                        break;
                    } else if (C0184.m1524() >= 0) {
                        C0184.m1524();
                    } else {
                        str = "۠ۤۢ";
                    }
                case 26405:
                    str = "ۡۧۤ";
                    paint = paint2;
                    continue;
                case 26540:
                    break;
                case 27493:
                    if (C0375.m4840() < 0) {
                        str = "ۧۦۡ";
                    } else {
                        continue;
                    }
                case 28590:
                    str = "ۧۤۢ";
                    paint = null;
                    continue;
            }
            str = C0346.m3059() >= 0 ? "ۢۡۤ" : "ۡۤ۠";
        }
    }

    public String getColor() {
        return m1461(this);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init() {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.customview.FeatureLinearLayout.init():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0017. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x000f A[SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onDraw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.customview.FeatureLinearLayout.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        String str = "ۣۦۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749792) {
                case 1474:
                    super.onMeasure(i, i2);
                    if (C0394.m5672() > 0) {
                        str = "ۤۨۨ";
                        break;
                    } else {
                        str = "ۣۦۣ";
                        break;
                    }
                case 2469:
                    return;
                case 2500:
                    m1459(this, C0395.m5682(i), C0346.m3070(this));
                    if (C0369.m3256() > 0) {
                        str = "ۤۥۦ";
                        break;
                    } else {
                        C0183.m1464();
                        break;
                    }
                case 31239:
                    if (C0400.m5961() > 0) {
                        str = "ۣۦۥ";
                        break;
                    } else {
                        C0088.m573();
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setColor(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.customview.FeatureLinearLayout.setColor(java.lang.String):void");
    }
}
