package com.cloudinject.customview;

import android.annotation.SuppressLint;
import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.database.C0074;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.net.C0082;
import android.net.C0083;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
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
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import p027.p028.p029.C0420;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes6.dex */
public class FeatureButton extends TextView {

    /* renamed from: ̗̗̖̖̖̙̗, reason: not valid java name and contains not printable characters */
    private String f239;

    public FeatureButton(Context context) {
        this(context, null);
    }

    public FeatureButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str = "ۧ۟ۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748893) {
                case 1095:
                    return;
                case 4624:
                    if (C0396.m5741() < 0) {
                        str = "ۧ۟ۤ";
                        break;
                    } else {
                        C0346.m3059();
                        break;
                    }
                case 26366:
                    m1450(this);
                    if (C0362.m3122() >= 0) {
                        break;
                    } else {
                        str = "۠ۨۢ";
                        break;
                    }
                case 27281:
                    this.f239 = C0385.m5310(C0088.m575());
                    if (C0382.m5180() > 0) {
                        str = "ۨۤ۟";
                        break;
                    } else {
                        str = "ۣۣۡ";
                        break;
                    }
            }
        }
    }

    private void init() {
        String str = "ۤۤ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752736) {
                case 1279:
                    C0386.m5352(this, new View.OnTouchListener(this) { // from class: com.cloudinject.customview.-$$Lambda$FeatureButton$Nn-fVA3z9nfiwP30mYZaD9w3gxE
                        private final FeatureButton f$0;

                        {
                            String str2 = "۟ۧۦ";
                            while (true) {
                                switch (C0395.m5690((Object) str2) ^ 1750631) {
                                    case 1381:
                                        if (C0229.m2064() < 0) {
                                            str2 = "۟ۧۦ";
                                            break;
                                        } else {
                                            C0121.m1023();
                                            break;
                                        }
                                    case 4505:
                                        this.f$0 = this;
                                        if (C0335.m2923() >= 0) {
                                            break;
                                        } else {
                                            str2 = "ۦ۟ۥ";
                                            break;
                                        }
                                    case 30507:
                                        return;
                                }
                            }
                        }

                        /* renamed from: ۥۣۨۦ, reason: contains not printable characters */
                        public static FeatureButton m1444(Object obj) {
                            String str2 = "ۣۢۡ";
                            FeatureButton featureButton = null;
                            FeatureButton featureButton2 = null;
                            while (true) {
                                switch (C0395.m5690((Object) str2) ^ 1751652) {
                                    case 134:
                                        break;
                                    case 1061:
                                        featureButton2 = (($$Lambda$FeatureButton$NnfVA3z9nfiwP30mYZaD9w3gxE) obj).f$0;
                                        str2 = "ۣ۠۟";
                                        continue;
                                    case 2368:
                                        if (C0392.m5595() <= 0) {
                                            C0060.m216();
                                        } else {
                                            str2 = "ۦۣۣ";
                                            continue;
                                        }
                                    case 3078:
                                        if (C0164.m1359() > 0) {
                                            break;
                                        } else if (C0279.m2491() >= 0) {
                                            C0025.m118();
                                            str2 = "ۦ۠ۤ";
                                        } else {
                                            str2 = "ۥۥۡ";
                                        }
                                    case 4256:
                                        str2 = "ۣۧ";
                                        featureButton = featureButton2;
                                        continue;
                                    case 7620:
                                        if (C0291.m2568() >= 0) {
                                            str2 = "ۡۢ";
                                        } else {
                                            str2 = "ۣۢۡ";
                                            continue;
                                        }
                                    case 29487:
                                        str2 = "ۧۤۧ";
                                        continue;
                                    case 31650:
                                        if (C0086.m500() <= 0) {
                                            featureButton = null;
                                        } else {
                                            str2 = "ۣۨۦ";
                                            featureButton = null;
                                            continue;
                                        }
                                    case 32718:
                                    case 1730117:
                                        if (C0291.m2568() >= 0) {
                                            C0376.m4906();
                                            str2 = "ۦۣۧ";
                                        } else {
                                            str2 = "ۣۧ";
                                            continue;
                                        }
                                    case 1730048:
                                        return featureButton;
                                }
                                str2 = C0086.m500() <= 0 ? "ۣۤۥ" : "ۢۦۨ";
                            }
                        }

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            String str2 = "ۡۥۢ";
                            while (true) {
                                switch (C0395.m5690((Object) str2) ^ 1747900) {
                                    case 1154:
                                        return C0389.m5499(m1444(this), view, motionEvent);
                                    case 1732697:
                                        str2 = "ۡۥۢ";
                                        break;
                                }
                            }
                        }
                    });
                    if (C0387.m5374() >= 0) {
                        break;
                    } else {
                        str = "ۢۥۤ";
                        break;
                    }
                case 3489:
                    return;
                case 31877:
                    if (C0420.m6215() >= 0) {
                        break;
                    } else {
                        str = "ۤۤ۟";
                        break;
                    }
            }
        }
    }

    /* renamed from: lambda$Nn-fVA3z9nfiwP30mYZaD9w3gxE, reason: not valid java name */
    public static /* synthetic */ boolean m1445lambda$NnfVA3z9nfiwP30mYZaD9w3gxE(FeatureButton featureButton, View view, MotionEvent motionEvent) {
        String str = "ۣۤۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751500) {
                case 911:
                    return m1449(featureButton, view, motionEvent);
                case 1966:
                    str = "ۣۤۢ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b3 A[SYNTHETIC] */
    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private /* synthetic */ boolean m1446(android.view.View r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.customview.FeatureButton.m1446(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: ۣ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static void m1447(Object obj, int i, int i2) {
        String str = "ۣ۟ۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746758) {
                case 221:
                    break;
                case 3492:
                case 25316:
                    if (C0009.m36() >= 0) {
                        C0362.m3122();
                        str = "ۦۡ۟";
                    } else {
                        str = "ۣۧۧ";
                        continue;
                    }
                case 4431:
                    if (C0228.m2012() <= 0) {
                        break;
                    } else {
                        str = "ۢۧ";
                    }
                case 24901:
                    return;
                case 25254:
                    if (C0184.m1524() < 0) {
                        str = "ۧۤ۟";
                    } else {
                        continue;
                    }
                case 25860:
                    str = "ۣ۟ۥ";
                    continue;
                case 1735427:
                    ((FeatureButton) obj).setMeasuredDimension(i, i2);
                    str = "ۣۧۧ";
                    continue;
            }
            str = "ۧۦ۟";
        }
    }

    /* renamed from: ۢۢۥۤ, reason: not valid java name and contains not printable characters */
    public static String m1448(Object obj) {
        Object obj2 = "ۢۨۧ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1752710) {
                case 769:
                case 1051:
                    obj2 = "ۣۢۡ";
                    continue;
                case 1094:
                    if (C0388.m5430() <= 0) {
                        C0391.m5571();
                        obj2 = "ۣۨۧ";
                    } else {
                        obj2 = "ۢۨۧ";
                        continue;
                    }
                case 3074:
                    return str;
                case 3111:
                    if (C0381.m5127() <= 0) {
                        C0393.m5668();
                        str = null;
                    } else {
                        obj2 = "ۥۤ";
                        str = null;
                        continue;
                    }
                case 3559:
                    if (C0420.m6215() > 0) {
                        break;
                    } else if (C0382.m5180() <= 0) {
                        C0368.m3171();
                        obj2 = "ۢ۠ۡ";
                    } else {
                        obj2 = "ۣۧ۟";
                    }
                case 30476:
                    if (C0387.m5374() >= 0) {
                        C0279.m2491();
                    } else {
                        obj2 = "ۢۢۡ";
                        continue;
                    }
                case 31493:
                    str2 = ((FeatureButton) obj).f239;
                    if (C0384.m5278() > 0) {
                        obj2 = "ۧۤۨ";
                    } else {
                        continue;
                    }
                case 31533:
                    if (C0362.m3122() >= 0) {
                        C0397.m5814();
                        str = str2;
                    } else {
                        obj2 = "ۣۢۡ";
                        str = str2;
                        continue;
                    }
                case 1729049:
                    obj2 = "ۥ۟ۡ";
                    continue;
                case 1729240:
                    break;
            }
            if (C0088.m573() <= 0) {
                C0279.m2491();
            } else {
                obj2 = "ۨۥۧ";
            }
        }
    }

    /* renamed from: ۢۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1449(Object obj, Object obj2, Object obj3) {
        String str = "ۣۡۢ";
        boolean z = false;
        boolean zM1446 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751557) {
                case 217:
                    break;
                case 3300:
                    str = "ۣۡۢ";
                    continue;
                case 4346:
                    str = "۟ۤۥ";
                    z = false;
                    continue;
                case 4390:
                    return z;
                case 5381:
                    if (C0380.m5068() < 0) {
                        break;
                    } else if (C0229.m2064() < 0) {
                        str = "ۡۦ۟";
                    }
                case 5382:
                case 29506:
                    str = "۠ۢۥ";
                    continue;
                case 5471:
                    zM1446 = ((FeatureButton) obj).m1446((View) obj2, (MotionEvent) obj3);
                    str = "ۦۧ۠";
                    continue;
                case 7589:
                    if (C0025.m118() > 0) {
                        str = "ۣۨۢ";
                    } else {
                        continue;
                    }
                case 30778:
                    if (C0385.m5282() >= 0) {
                        C0388.m5430();
                        z = zM1446;
                    } else {
                        str = "۠ۢۥ";
                        z = zM1446;
                        continue;
                    }
                case 31564:
                    if (C0088.m573() <= 0) {
                        C0391.m5571();
                    } else {
                        str = "۠ۡ۠";
                        continue;
                    }
            }
            if (C0025.m118() <= 0) {
                C0399.m5914();
                str = "ۧۦ";
            } else {
                str = "ۦ۟ۢ";
            }
        }
    }

    /* renamed from: ۦۡۥۡ, reason: contains not printable characters */
    public static void m1450(Object obj) {
        String str = "ۡۧۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755562) {
                case 3084:
                    return;
                case 25231:
                    if (C0396.m5741() >= 0) {
                        C0390.m5512();
                    } else {
                        str = "ۡۧۥ";
                        continue;
                    }
                case 26282:
                case 1709526:
                    str = "ۣۧۤ";
                    continue;
                case 26325:
                    if (C0184.m1524() > 0) {
                        break;
                    } else {
                        str = "ۣۣ";
                    }
                case 28240:
                    break;
                case 1709322:
                    if (C0155.m1294() >= 0) {
                        C0335.m2923();
                    } else {
                        str = "ۤ۠";
                        continue;
                    }
                case 1709514:
                    ((FeatureButton) obj).init();
                    if (C0179.m1427() <= 0) {
                        str = "ۨ۠ۢ";
                    } else {
                        str = "ۣۧۤ";
                        continue;
                    }
            }
            if (C0368.m3171() >= 0) {
                C0291.m2568();
                str = "ۣۢۤ";
            } else {
                str = "ۥۥ";
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        String str = "ۤۨ۟";
        int i = 0;
        int iIntValue = 0;
        LinearLayout.LayoutParams layoutParams = null;
        int iIntValue2 = 0;
        GradientDrawable gradientDrawable = null;
        Object[] objArr = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748711) {
                case 327:
                    C0191.m1652(gradientDrawable, new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f});
                    str = "ۢۨۧ";
                    break;
                case 482:
                    C0389.m5495(layoutParams, 0, i, 0, i);
                    if (C0074.m307() < 0) {
                        str = "ۦۣۢ";
                        break;
                    } else {
                        C0420.m6215();
                        break;
                    }
                case 1062:
                    if (C0183.m1464() <= 0) {
                        break;
                    } else {
                        str = "۟ۧ۟";
                        break;
                    }
                case 1351:
                    objArr[1] = new Integer(2940211);
                    if (C0387.m5374() < 0) {
                        str = "ۦۨ۠";
                        break;
                    } else {
                        C0379.m5056();
                        break;
                    }
                case 1504:
                    int i2 = ((iIntValue ^ (-1)) & 2533846) | ((-2533847) & iIntValue);
                    if (C0086.m500() > 0) {
                        str = "ۣۡۧ";
                        i = i2;
                        break;
                    } else {
                        C0384.m5278();
                        i = i2;
                        break;
                    }
                case 2320:
                    if (C0381.m5127() <= 0) {
                        break;
                    } else {
                        str = "ۣۦۧ";
                        break;
                    }
                case 2407:
                    C0082.m416(gradientDrawable, 0);
                    str = "ۡۨۧ";
                    break;
                case 2489:
                    str = "۠ۡۨ";
                    iIntValue = ((Integer) objArr[0]).intValue();
                    break;
                case 5180:
                    Object[] objArr2 = new Object[2];
                    if (C0389.m5481() > 0) {
                        str = "۠ۦۦ";
                        objArr = objArr2;
                        break;
                    } else {
                        C0060.m216();
                        str = "ۣۨ";
                        objArr = objArr2;
                        break;
                    }
                case 6147:
                    super.onDraw(canvas);
                    str = "ۧۥ۠";
                    break;
                case 7558:
                    C0155.m1310(gradientDrawable, C0083.m464(m1448(this)));
                    if (C0391.m5571() <= 0) {
                        break;
                    } else {
                        str = "ۥۡ";
                        break;
                    }
                case 7622:
                    str = "ۣۧۢ";
                    iIntValue2 = ((Integer) objArr[1]).intValue();
                    break;
                case 7641:
                    return;
                case 26542:
                    str = "ۤۨ۟";
                    break;
                case 27429:
                    str = "ۣ۟ۤ";
                    gradientDrawable = new GradientDrawable();
                    break;
                case 27530:
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) C0381.m5103(this);
                    if (C0164.m1359() < 0) {
                        layoutParams = layoutParams2;
                        str = "۟ۢۡ";
                        break;
                    } else {
                        layoutParams = layoutParams2;
                        str = "ۥۢۤ";
                        break;
                    }
                case 27535:
                    C0060.m184(this, ((iIntValue2 ^ (-1)) & 2940194) | ((-2940195) & iIntValue2));
                    str = "ۧۢۨ";
                    break;
                case 27833:
                    objArr[0] = new Integer(2533843);
                    if (C0183.m1464() > 0) {
                        str = "۠۟۠";
                        break;
                    } else {
                        str = "ۣۤ۟";
                        break;
                    }
                case 28480:
                    C0392.m5616(this, layoutParams);
                    str = "ۣۢۧ";
                    break;
                case 28491:
                    C0369.m3262(this, C0083.m464(C0385.m5310(C0164.m1353())));
                    if (C0279.m2491() < 0) {
                        str = "ۢۦۥ";
                        break;
                    } else {
                        C0228.m2012();
                        break;
                    }
                case 1733243:
                    C0089.m593(this, gradientDrawable);
                    if (C0335.m2923() < 0) {
                        str = "ۦۢۨ";
                        break;
                    } else {
                        C0385.m5282();
                        break;
                    }
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        String str = "۠ۥۨ";
        int iM5682 = 0;
        Integer num = null;
        int iIntValue = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753667) {
                case 1900:
                    return;
                case 1999:
                    str = "۠ۥۨ";
                    break;
                case 2699:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    str = "ۣۡ۠";
                    break;
                case 26950:
                    iM5682 = C0395.m5682(i);
                    if (C0369.m3256() > 0) {
                        str = "ۨ۟۟";
                        break;
                    } else {
                        C0377.m4944();
                        break;
                    }
                case 27072:
                    num = new Integer(6525092);
                    if (C0060.m216() > 0) {
                        str = "ۢۥۧ";
                        break;
                    } else {
                        C0346.m3059();
                        break;
                    }
                case 28999:
                    super.onMeasure(i, i2);
                    if (C0380.m5068() > 0) {
                        str = "۠ۡۦ";
                        break;
                    } else {
                        str = "ۣۤ";
                        break;
                    }
                case 29697:
                    m1447(this, iM5682, ((iIntValue ^ (-1)) & 6525120) | ((-6525121) & iIntValue));
                    str = "ۧ۠ۨ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setColor(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "ۢۧۦ"
        L2:
            int r1 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r2 = 1752461(0x1abd8d, float:2.455721E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 1927: goto Le;
                case 2863: goto L58;
                case 3788: goto L25;
                case 3849: goto L64;
                case 3952: goto L49;
                case 4914: goto L58;
                case 31744: goto L6a;
                case 31749: goto L67;
                case 1728885: goto L38;
                default: goto Ld;
            }
        Ld:
            goto L2
        Le:
            java.lang.String r1 = com.cloudinject.core.utils.compat.C0121.m1001()
            java.lang.String r1 = mirrorb.android.location.C0385.m5310(r1)
            boolean r1 = mirrorb.android.content.C0380.m5096(r4, r1)
            if (r1 != 0) goto L64
            int r1 = com.cloudinject.feature.p023.C0335.m2923()
            if (r1 >= 0) goto L2
            java.lang.String r0 = "ۢۥ۠"
            goto L2
        L25:
            boolean r1 = mirrorb.android.providers.C0391.m5564(r4)
            if (r1 != 0) goto L58
            int r1 = p027.p028.p029.C0420.m6215()
            if (r1 < 0) goto L35
            com.cloudinject.core.p009.p012.C0164.m1359()
            goto L2
        L35:
            java.lang.String r0 = "ۤۡۧ"
            goto L2
        L38:
            r3.f239 = r4
            int r0 = android.database.C0074.m307()
            if (r0 < 0) goto L46
            com.cloudinject.feature.p023.C0334.m2866()
            java.lang.String r0 = "ۥۣۣ"
            goto L2
        L46:
            java.lang.String r0 = "ۦۡۨ"
            goto L2
        L49:
            int r0 = mirrorb.com.android.internal.content.C0395.m5698()
            if (r0 < 0) goto L55
            com.cloudinject.core.utils.compat.C0121.m1023()
            java.lang.String r0 = "ۦۥۢ"
            goto L2
        L55:
            java.lang.String r0 = "ۣۣۤ"
            goto L2
        L58:
            int r0 = mirrorb.android.location.C0384.m5278()
            if (r0 > 0) goto L61
            java.lang.String r0 = "۠ۥ۠"
            goto L2
        L61:
            java.lang.String r0 = "ۦۡۨ"
            goto L2
        L64:
            java.lang.String r0 = "ۨ۠"
            goto L2
        L67:
            java.lang.String r0 = "ۢۧۦ"
            goto L2
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.customview.FeatureButton.setColor(java.lang.String):void");
    }
}
