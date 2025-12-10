package com.cloudinject.core.p009.p011;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.C0009;
import android.app.Fragment;
import android.app.Instrumentation;
import android.app.UiAutomation;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.C0129;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
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
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.core.̗.̗.̖, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class InstrumentationC0153 extends Instrumentation {

    /* renamed from: ̗̗̙̖̖̙̖, reason: not valid java name and contains not printable characters */
    protected Instrumentation f222;

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    private static C0129 m1262(Object obj, Class<?>... clsArr) throws NoSuchMethodException {
        C0129 c0129M3092 = null;
        String str = "ۤۥۥ";
        Class clsM1019 = null;
        Class clsM194 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753546) {
                case 1260:
                    if (C0385.m5282() >= 0) {
                        C0082.m410();
                        str = "ۣۣۢ";
                    } else {
                        str = "ۤۥۥ";
                        continue;
                    }
                case 26135:
                    if (clsM1019 == null) {
                        break;
                    } else if (C0184.m1524() < 0) {
                        str = "ۣ۟۠";
                    }
                case 26197:
                    break;
                case 27338:
                    if (C0229.m2064() >= 0) {
                        C0370.m3284();
                        str = "ۦۣۧ";
                    } else {
                        str = "۠ۢۡ";
                        continue;
                    }
                case 27349:
                    return c0129M3092;
                case 27444:
                    str = "۟ۦۤ";
                    clsM1019 = clsM194;
                    continue;
                case 28234:
                    if (C0184.m1524() >= 0) {
                        C0377.m4944();
                        str = "ۦ۟ۤ";
                    } else {
                        str = "ۣ۟۠";
                        continue;
                    }
                case 29422:
                case 29571:
                    if (C0206.m1807() >= 0) {
                        C0334.m2866();
                        str = "ۤۢۢ";
                    } else {
                        str = "۟ۦۤ";
                        continue;
                    }
                case 29544:
                    throw new NoSuchMethodException();
                case 30670:
                    try {
                        c0129M3092 = C0362.m3092(C0078.m341(C0060.m194(obj)), C0385.m5310(C0229.m2034()), clsArr);
                        if (C0385.m5282() >= 0) {
                            C0382.m5180();
                            str = "ۥۨۨ";
                        } else {
                            str = "۠ۢۡ";
                            continue;
                        }
                    } catch (Exception e) {
                        clsM1019 = C0121.m1019(clsM1019);
                        str = "ۢ۟ۦ";
                    }
                case 31566:
                    clsM194 = C0060.m194(obj);
                    if (C0082.m410() >= 0) {
                        C0387.m5374();
                    } else {
                        str = "۠ۡ۟";
                        continue;
                    }
            }
            if (C0009.m36() >= 0) {
                C0399.m5914();
                str = "۠ۥۡ";
            } else {
                str = "ۢۢۢ";
            }
        }
    }

    /* renamed from: ۠ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static Instrumentation m1263(Object obj) {
        String str = "ۤ۟۟";
        Instrumentation instrumentation = null;
        Instrumentation instrumentation2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752705) {
                case 7:
                    if (C0155.m1294() >= 0) {
                        C0368.m3171();
                    } else {
                        str = "ۣۥ۠";
                        continue;
                    }
                case 222:
                    return instrumentation;
                case 1861:
                    if (C0334.m2866() <= 0) {
                        break;
                    } else if (C0386.m5322() <= 0) {
                        C0396.m5741();
                        str = "ۦۡۦ";
                    } else {
                        str = "ۨۧۧ";
                    }
                case 2111:
                case 5406:
                    if (C0086.m500() <= 0) {
                        str = "۠ۢۦ";
                    } else {
                        str = "ۥۦ۠";
                        continue;
                    }
                case 3108:
                    break;
                case 3270:
                    str = "۟ۡۤ";
                    continue;
                case 6595:
                    if (C0184.m1524() >= 0) {
                        C0074.m307();
                        instrumentation = null;
                    } else {
                        str = "ۥۧۨ";
                        instrumentation = null;
                        continue;
                    }
                case 30537:
                    instrumentation2 = ((InstrumentationC0153) obj).f222;
                    str = "ۦۣۢ";
                    continue;
                case 32580:
                    if (C0088.m573() <= 0) {
                        C0121.m1023();
                        str = "۟ۧۡ";
                        instrumentation = instrumentation2;
                    } else {
                        str = "ۥۦ۠";
                        instrumentation = instrumentation2;
                        continue;
                    }
                case 1729190:
                    str = "ۤ۟۟";
                    continue;
            }
            if (C0164.m1359() >= 0) {
                C0369.m3256();
            } else {
                str = "ۢ۟ۤ";
            }
        }
    }

    /* renamed from: ۧۡۦۥ, reason: not valid java name and contains not printable characters */
    public static C0129 m1264(Object obj, Object obj2) throws NoSuchMethodException {
        Object obj3 = "ۣۣۧ";
        C0129 c0129 = null;
        C0129 c0129M1262 = null;
        while (true) {
            switch (C0395.m5690(obj3) ^ 1749795) {
                case 485:
                    c0129M1262 = m1262(obj, (Class[]) obj2);
                    if (C0380.m5068() <= 0) {
                        C0391.m5571();
                    } else {
                        obj3 = "۟ۢ۟";
                        continue;
                    }
                case 1372:
                    obj3 = "ۣۣۧ";
                    continue;
                case 1444:
                    if (C0086.m500() <= 0) {
                        break;
                    } else if (C0089.m592() > 0) {
                        obj3 = "ۣۢۧ";
                    }
                case 2437:
                case 3458:
                    if (C0078.m361() > 0) {
                        obj3 = "ۥ۠";
                    } else {
                        continue;
                    }
                case 5247:
                    obj3 = "ۥ۠";
                    c0129 = c0129M1262;
                    continue;
                case 6178:
                    if (C0383.m5203() > 0) {
                        obj3 = "ۤۦۨ";
                    } else {
                        continue;
                    }
                case 29318:
                    if (C0228.m2012() <= 0) {
                        obj3 = "ۡۡۥ";
                        c0129 = null;
                    } else {
                        obj3 = "۠ۡۢ";
                        c0129 = null;
                        continue;
                    }
                case 31431:
                    break;
                case 31435:
                    obj3 = "ۦۢۡ";
                    continue;
                case 1732536:
                    return c0129;
            }
            obj3 = "ۨۨۨ";
        }
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z) {
        String str = "ۣۢۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755554) {
                case 29473:
                    if (C0383.m5203() > 0) {
                        str = "ۣۢۢ";
                        break;
                    } else {
                        C0391.m5571();
                        str = "ۨۧۧ";
                        break;
                    }
                case 32705:
                    return C0389.m5473(m1263(this), intentFilter, activityResult, z);
            }
        }
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z) {
        String str2 = "۟ۢ۠";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1749571) {
                case 257:
                    if (C0089.m592() > 0) {
                        str2 = "۟ۢ۠";
                        break;
                    } else {
                        C0082.m410();
                        break;
                    }
                case 5406:
                    return C0388.m5455(m1263(this), str, activityResult, z);
            }
        }
    }

    @Override // android.app.Instrumentation
    public void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        String str = "ۤۤۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752485) {
                case 78:
                    return;
                case 1991:
                    C0082.m417(m1263(this), activityMonitor);
                    str = "ۥۢۨ";
                    break;
                case 4761:
                    if (C0279.m2491() >= 0) {
                        break;
                    } else {
                        str = "ۤۤۢ";
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        String str = "ۡۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753509) {
                case 28199:
                    if (C0368.m3171() >= 0) {
                        break;
                    } else {
                        str = "ۡۨ";
                        break;
                    }
                case 29336:
                    return;
                case 1711490:
                    C0378.m4990(m1263(this), activity, bundle);
                    if (C0086.m500() > 0) {
                        str = "ۢۧۢ";
                        break;
                    } else {
                        C0368.m3171();
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        String str = "ۡۤۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753669) {
                case 27834:
                    if (C0385.m5282() < 0) {
                        str = "ۡۤۢ";
                        break;
                    } else {
                        C0384.m5278();
                        break;
                    }
                case 27994:
                    C0397.m5806(m1263(this), activity, bundle, persistableBundle);
                    if (C0183.m1464() > 0) {
                        str = "ۣ۠ۢ";
                        break;
                    } else {
                        C0379.m5056();
                        break;
                    }
                case 29792:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnDestroy(Activity activity) {
        String str = "ۦ۟ۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749635) {
                case 2143:
                    return;
                case 5511:
                    str = "ۦ۟ۡ";
                    break;
                case 29643:
                    C0387.m5408(m1263(this), activity);
                    if (C0078.m361() > 0) {
                        str = "ۤۨ۠";
                        break;
                    } else {
                        str = "ۤۢۥ";
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        String str = "ۣۨۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755405) {
                case 11:
                    return;
                case 74:
                    C0397.m5816(m1263(this), activity, intent);
                    str = "ۨۡ۟";
                    break;
                case 25578:
                    str = "ۣۨۢ";
                    break;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPause(Activity activity) {
        String str = "ۣۨۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752517) {
                case TypedValues.Custom.TYPE_STRING /* 903 */:
                    return;
                case 3877:
                    if (C0391.m5571() <= 0) {
                        break;
                    } else {
                        str = "ۣۨۢ";
                        break;
                    }
                case 29826:
                    C0382.m5166(m1263(this), activity);
                    if (C0393.m5668() > 0) {
                        str = "ۥۥۢ";
                        break;
                    } else {
                        C0089.m592();
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        String str = "ۦۣۣ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754475) {
                case 1197:
                    C0121.m1017(m1263(this), activity, bundle);
                    if (C0279.m2491() < 0) {
                        str = "ۥۤۤ";
                        break;
                    } else {
                        C0191.m1627();
                        break;
                    }
                case 27596:
                    if (C0382.m5180() > 0) {
                        str = "ۦۣۣ";
                        break;
                    } else {
                        C0375.m4840();
                        break;
                    }
                case 31566:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        String str = "ۤۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753572) {
                case TypedValues.Custom.TYPE_STRING /* 903 */:
                    return;
                case 28385:
                    if (C0078.m361() > 0) {
                        str = "ۤۤ";
                        break;
                    } else {
                        str = "ۨۢ۟";
                        break;
                    }
                case 1711460:
                    C0388.m5416(m1263(this), activity, bundle, persistableBundle);
                    str = "ۦۨۥ";
                    break;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestart(Activity activity) {
        String str = "ۣۤۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753415) {
                case 27358:
                    return;
                case 31490:
                    C0334.m2882(m1263(this), activity);
                    if (C0089.m592() > 0) {
                        str = "۠ۦ۟";
                        break;
                    } else {
                        C0389.m5481();
                        str = "ۦۡۥ";
                        break;
                    }
                case 1711512:
                    str = "ۣۤۤ";
                    break;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        String str = "ۡ۟۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746935) {
                case 2422:
                    C0375.m4881(m1263(this), activity, bundle);
                    if (C0074.m307() >= 0) {
                        break;
                    } else {
                        str = "ۣۤ۠";
                        break;
                    }
                case 7570:
                    str = "ۡ۟۟";
                    break;
                case 7696:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        String str = "۟ۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750657) {
                case 7677:
                    if (C0184.m1524() < 0) {
                        str = "۟ۦ";
                        break;
                    } else {
                        str = "ۣ۟۠";
                        break;
                    }
                case 32577:
                    return;
                case 1731942:
                    C0362.m3104(m1263(this), activity, bundle, persistableBundle);
                    if (C0183.m1464() > 0) {
                        str = "ۨۧ۟";
                        break;
                    } else {
                        C0121.m1023();
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnResume(Activity activity) {
        String str = "ۥۣ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753632) {
                case 28773:
                    return;
                case 28775:
                    if (C0380.m5068() > 0) {
                        str = "ۥۣ۟";
                        break;
                    } else {
                        str = "ۤ۠ۢ";
                        break;
                    }
                case 32681:
                    C0391.m5574(m1263(this), activity);
                    if (C0377.m4944() <= 0) {
                        break;
                    } else {
                        str = "ۢ۟ۢ";
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        String str = "ۨۨۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750599) {
                case 6278:
                    return;
                case 29774:
                    if (C0368.m3171() < 0) {
                        str = "ۨۨۢ";
                        break;
                    } else {
                        str = "ۣۨۧ";
                        break;
                    }
                case 32677:
                    C0400.m5940(m1263(this), activity, bundle);
                    if (C0362.m3122() < 0) {
                        str = "ۡۡۡ";
                        break;
                    } else {
                        C0375.m4840();
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        String str = "۟ۡۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748764) {
                case 408:
                    str = "۟ۡۡ";
                    break;
                case 2083:
                    C0082.m407(m1263(this), activity, bundle, persistableBundle);
                    str = "ۨۧۤ";
                    break;
                case 26329:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStart(Activity activity) {
        String str = "ۡۥۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748709) {
                case TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE /* 422 */:
                    C0074.m283(m1263(this), activity);
                    if (C0399.m5914() <= 0) {
                        break;
                    } else {
                        str = "ۦۢ۟";
                        break;
                    }
                case 27834:
                    if (C0382.m5180() <= 0) {
                        break;
                    } else {
                        str = "ۡۥۧ";
                        break;
                    }
                case 28486:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStop(Activity activity) {
        String str = "ۡۤۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753449) {
                case 28279:
                    C0074.m297(m1263(this), activity);
                    if (C0073.m265() > 0) {
                        str = "ۤ۠ۤ";
                        break;
                    } else {
                        C0191.m1627();
                        break;
                    }
                case 30849:
                    return;
                case 1711541:
                    if (C0362.m3122() >= 0) {
                        break;
                    } else {
                        str = "ۡۤۡ";
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnUserLeaving(Activity activity) {
        String str = "ۤۥ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746782) {
                case 3107:
                    str = "ۤۥ۠";
                    break;
                case 7457:
                    C0400.m5927(m1263(this), activity);
                    if (C0279.m2491() >= 0) {
                        break;
                    } else {
                        str = "ۨۨۧ";
                        break;
                    }
                case 28345:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        String str = "ۢۨۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747651) {
                case 4288:
                    return;
                case 6150:
                    if (C0391.m5571() > 0) {
                        str = "ۢۨۥ";
                        break;
                    } else {
                        C0206.m1807();
                        break;
                    }
                case 6556:
                    C0377.m4962(m1263(this), application);
                    if (C0377.m4944() > 0) {
                        str = "ۤۡ۠";
                        break;
                    } else {
                        C0386.m5322();
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i) {
        String str = "ۢ۟۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750602) {
                case 1032:
                    return C0370.m3302(m1263(this), activityMonitor, i);
                case 3316:
                    str = "ۢ۟۟";
                    break;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void endPerformanceSnapshot() {
        String str = "ۢۢۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754475) {
                case 3488:
                    return;
                case 30659:
                    C0362.m3098(m1263(this));
                    if (C0375.m4840() >= 0) {
                        break;
                    } else {
                        str = "ۨ۟ۢ";
                        break;
                    }
                case 32609:
                    str = "ۢۢۨ";
                    break;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void finish(int i, Bundle bundle) {
        String str = "۟ۦ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750663) {
                case 1250:
                    return;
                case 4447:
                    C0164.m1357(m1263(this), i, bundle);
                    if (C0396.m5741() < 0) {
                        str = "ۣۢ۠";
                        break;
                    } else {
                        C0386.m5322();
                        str = "ۧ۟ۡ";
                        break;
                    }
                case 29829:
                    if (C0228.m2012() > 0) {
                        str = "۟ۦ۟";
                        break;
                    } else {
                        C0381.m5127();
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public Bundle getAllocCounts() {
        return C0399.m5902(m1263(this));
    }

    @Override // android.app.Instrumentation
    public Bundle getBinderCounts() {
        return C0155.m1299(m1263(this));
    }

    @Override // android.app.Instrumentation
    public ComponentName getComponentName() {
        return C0164.m1362(m1263(this));
    }

    @Override // android.app.Instrumentation
    public Context getContext() {
        return C0400.m5943(m1263(this));
    }

    @Override // android.app.Instrumentation
    public Context getTargetContext() {
        return C0060.m224(m1263(this));
    }

    @Override // android.app.Instrumentation
    public UiAutomation getUiAutomation() {
        return C0089.m618(m1263(this));
    }

    @Override // android.app.Instrumentation
    public boolean invokeContextMenuAction(Activity activity, int i, int i2) {
        String str = "ۦ۟ۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746967) {
                case 3871:
                    if (C0089.m592() > 0) {
                        str = "ۦ۟ۢ";
                        break;
                    } else {
                        str = "ۣۣ۠";
                        break;
                    }
                case 26974:
                    return C0279.m2496(m1263(this), activity, i, i2);
            }
        }
    }

    @Override // android.app.Instrumentation
    public boolean invokeMenuActionSync(Activity activity, int i, int i2) {
        String str = "ۨۤۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755338) {
                case 428:
                    return C0388.m5451(m1263(this), activity, i, i2);
                case 25486:
                    if (C0155.m1294() < 0) {
                        str = "ۨۤۢ";
                        break;
                    } else {
                        C0391.m5571();
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public boolean isProfiling() {
        return C0391.m5551(m1263(this));
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws IllegalAccessException, InstantiationException {
        String str2 = "ۣۨۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56418) {
                case 1731392:
                    return C0390.m5518(m1263(this), cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
                case 1733286:
                    str2 = "ۣۨۧ";
                    break;
            }
        }
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String str2 = "ۣۣۢ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1751526) {
                case 2852:
                    return C0228.m1990(m1263(this), classLoader, str, intent);
                case 30859:
                    str2 = "ۣۣۢ";
                    break;
            }
        }
    }

    @Override // android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String str2 = "۟ۦۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1747713) {
                case 3138:
                    if (C0382.m5180() <= 0) {
                        break;
                    } else {
                        str2 = "۟ۦۦ";
                        break;
                    }
                case 3294:
                    return C0083.m430(m1263(this), classLoader, str, context);
            }
        }
    }

    @Override // android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        String str = "ۥ۟ۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751532) {
                case 915:
                    return;
                case 1124:
                    C0089.m602(m1263(this), bundle);
                    if (C0089.m592() > 0) {
                        str = "ۤۥ۠";
                        break;
                    } else {
                        C0384.m5278();
                        break;
                    }
                case 5872:
                    if (C0025.m118() <= 0) {
                        break;
                    } else {
                        str = "ۥ۟ۢ";
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void onDestroy() {
        String str = "۟۠۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747811) {
                case 3197:
                    C0368.m3188(m1263(this));
                    if (C0086.m500() <= 0) {
                        break;
                    } else {
                        str = "۟ۥۣ";
                        break;
                    }
                case 3294:
                    return;
                case 6634:
                    str = "۟۠۟";
                    break;
            }
        }
    }

    @Override // android.app.Instrumentation
    public boolean onException(Object obj, Throwable th) {
        String str = "ۤ۟۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752704) {
                case 1861:
                    return C0369.m3231(m1263(this), obj, th);
                case 1729087:
                    if (C0381.m5127() > 0) {
                        str = "ۤ۟۠";
                        break;
                    } else {
                        str = "ۣۤۦ";
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void onStart() {
        String str = "۠ۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749699) {
                case 125:
                    return;
                case 7648:
                    if (C0164.m1359() >= 0) {
                        break;
                    } else {
                        str = "۠ۨ";
                        break;
                    }
                case 1732299:
                    C0229.m2046(m1263(this));
                    str = "ۣۢ۟";
                    break;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        String str = "ۤۤۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750664) {
                case 3311:
                    C0390.m5507(m1263(this), activityMonitor);
                    if (C0228.m2012() <= 0) {
                        break;
                    } else {
                        str = "ۣۧۢ";
                        break;
                    }
                case 6646:
                    str = "ۤۤۧ";
                    break;
                case 29454:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void runOnMainSync(Runnable runnable) {
        String str = "ۤ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751777) {
                case 135:
                    str = "ۤ۟";
                    break;
                case 7523:
                    return;
                case 1730202:
                    C0420.m6236(m1263(this), runnable);
                    if (C0025.m118() > 0) {
                        str = "ۣ۟ۦ";
                        break;
                    } else {
                        C0394.m5672();
                        str = "ۤۨۨ";
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void sendCharacterSync(int i) {
        String str = "ۨۤۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753482) {
                case 2278:
                    C0073.m273(m1263(this), i);
                    str = "ۧۢ";
                    break;
                case 31503:
                    if (C0384.m5278() > 0) {
                        str = "ۨۤۨ";
                        break;
                    } else {
                        C0086.m500();
                        break;
                    }
                case 1711441:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void sendKeyDownUpSync(int i) {
        String str = "ۤۢۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56482) {
                case 1730186:
                    C0164.m1334(m1263(this), i);
                    if (C0396.m5741() < 0) {
                        str = "۟ۤۡ";
                        break;
                    } else {
                        C0395.m5698();
                        break;
                    }
                case 1731517:
                    str = "ۤۢۦ";
                    break;
                case 1735486:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void sendKeySync(KeyEvent keyEvent) {
        String str = "۠ۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753702) {
                case 34:
                    return;
                case 26042:
                    if (C0073.m265() <= 0) {
                        break;
                    } else {
                        str = "۠ۨ";
                        break;
                    }
                case 1711726:
                    C0378.m5005(m1263(this), keyEvent);
                    str = "ۦۧۥ";
                    break;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void sendPointerSync(MotionEvent motionEvent) {
        String str = "ۧۡۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754601) {
                case 163:
                    C0369.m3242(m1263(this), motionEvent);
                    str = "ۢۤ۠";
                    break;
                case 29608:
                    if (C0228.m2012() > 0) {
                        str = "ۧۡۤ";
                        break;
                    } else {
                        C0396.m5741();
                        break;
                    }
                case 30519:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void sendStatus(int i, Bundle bundle) {
        String str = "ۣۨۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754628) {
                case 3885:
                    C0395.m5712(m1263(this), i, bundle);
                    if (C0191.m1627() < 0) {
                        str = "ۣۤۥ";
                        break;
                    } else {
                        C0368.m3171();
                        break;
                    }
                case 27840:
                    if (C0380.m5068() > 0) {
                        str = "ۣۨۢ";
                        break;
                    } else {
                        str = "ۥۨ";
                        break;
                    }
                case 28832:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void sendStringSync(String str) {
        String str2 = "ۣۡۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1752737) {
                case 4572:
                    C0291.m2541(m1263(this), str);
                    str2 = "۟ۦۧ";
                    break;
                case 4602:
                    if (C0229.m2064() < 0) {
                        str2 = "ۣۡۧ";
                        break;
                    } else {
                        C0387.m5374();
                        break;
                    }
                case 6465:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void sendTrackballEventSync(MotionEvent motionEvent) {
        String str = "۠ۧۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749671) {
                case 2055:
                    if (C0399.m5914() > 0) {
                        str = "۠ۧۥ";
                        break;
                    } else {
                        C0164.m1359();
                        str = "۟ۦۡ";
                        break;
                    }
                case 6425:
                    C0089.m620(m1263(this), motionEvent);
                    if (C0183.m1464() > 0) {
                        str = "ۧۡۢ";
                        break;
                    } else {
                        C0370.m3284();
                        str = "ۣۥ";
                        break;
                    }
                case 30703:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void setAutomaticPerformanceSnapshots() {
        String str = "۠ۥ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746780) {
                case 3110:
                    C0368.m3196(m1263(this));
                    str = "ۣۨۦ";
                    break;
                case 25278:
                    if (C0393.m5668() > 0) {
                        str = "۠ۥ۟";
                        break;
                    } else {
                        C0164.m1359();
                        break;
                    }
                case 28183:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void setInTouchMode(boolean z) {
        String str = "ۣۧۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56319) {
                case 1983:
                    if (C0395.m5698() >= 0) {
                        break;
                    } else {
                        str = "ۣۧۢ";
                        break;
                    }
                case 1711669:
                    return;
                case 1731841:
                    C0386.m5350(m1263(this), z);
                    if (C0393.m5668() > 0) {
                        str = "ۧۥۨ";
                        break;
                    } else {
                        C0420.m6215();
                        str = "ۣۧۨ";
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void start() {
        String str = "ۨۧ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56383) {
                case 1709566:
                    C0362.m3131(m1263(this));
                    if (C0086.m500() > 0) {
                        str = "ۧۢۤ";
                        break;
                    } else {
                        C0362.m3122();
                        break;
                    }
                case 1710422:
                    return;
                case 1731321:
                    if (C0384.m5278() > 0) {
                        str = "ۨۧ۠";
                        break;
                    } else {
                        C0397.m5814();
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public Activity startActivitySync(Intent intent) {
        String str = "۟ۧۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748735) {
                case 1791:
                    return C0074.m315(m1263(this), intent);
                case 5946:
                    if (C0191.m1627() >= 0) {
                        break;
                    } else {
                        str = "۟ۧۨ";
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void startAllocCounting() {
        String str = "ۦۦ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747776) {
                case 1123:
                    return;
                case 26976:
                    C0088.m559(m1263(this));
                    if (C0086.m500() > 0) {
                        str = "ۡۤۦ";
                        break;
                    } else {
                        C0089.m592();
                        break;
                    }
                case 1734585:
                    if (C0025.m118() > 0) {
                        str = "ۦۦ۠";
                        break;
                    } else {
                        C0334.m2866();
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void startPerformanceSnapshot() {
        String str = "ۥۡ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752580) {
                case 960:
                    C0088.m572(m1263(this));
                    if (C0346.m3059() < 0) {
                        str = "ۣۤۡ";
                        break;
                    } else {
                        C0392.m5595();
                        str = "ۥۦۡ";
                        break;
                    }
                case 2212:
                    return;
                case 4391:
                    if (C0025.m118() <= 0) {
                        break;
                    } else {
                        str = "ۥۡ۠";
                        break;
                    }
            }
        }
    }

    @Override // android.app.Instrumentation
    public void startProfiling() {
        String str = "۠ۥۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751647) {
                case 4574:
                    C0379.m5055(m1263(this));
                    if (C0291.m2568() >= 0) {
                        break;
                    } else {
                        str = "ۡ۠ۤ";
                        break;
                    }
                case 4579:
                    if (C0379.m5056() > 0) {
                        str = "۠ۥۦ";
                        break;
                    } else {
                        C0379.m5056();
                        str = "ۥۥ۟";
                        break;
                    }
                case 5370:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void stopAllocCounting() {
        String str = "۠ۨۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56355) {
                case 1728965:
                    if (C0228.m2012() > 0) {
                        str = "۠ۨۡ";
                        break;
                    } else {
                        str = "ۣۨۧ";
                        break;
                    }
                case 1734650:
                    C0334.m2888(m1263(this));
                    if (C0399.m5914() > 0) {
                        str = "ۣ۟ۡ";
                        break;
                    } else {
                        C0183.m1464();
                        str = "۟۠۟";
                        break;
                    }
                case 1735522:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void stopProfiling() {
        String str = "ۥ۟۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746696) {
                case 3856:
                    return;
                case 6798:
                    C0370.m3306(m1263(this));
                    if (C0378.m4998() > 0) {
                        str = "۟ۨۡ";
                        break;
                    } else {
                        C0060.m216();
                        break;
                    }
                case 25282:
                    str = "ۥ۟۠";
                    break;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void waitForIdle(Runnable runnable) {
        String str = "۠ۨۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748891) {
                case 1093:
                    C0388.m5432(m1263(this), runnable);
                    str = "ۦۨۨ";
                    break;
                case 27071:
                    if (C0088.m573() > 0) {
                        str = "۠ۨۦ";
                        break;
                    } else {
                        C0368.m3171();
                        break;
                    }
                case 28157:
                    return;
            }
        }
    }

    @Override // android.app.Instrumentation
    public void waitForIdleSync() {
        String str = "ۡۨۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749574) {
                case 1252:
                    str = "ۡۨۢ";
                    break;
                case 1383:
                    return;
                case 7645:
                    C0384.m5237(m1263(this));
                    str = "ۣۨۦ";
                    break;
            }
        }
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        String str = "ۡ۠ۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747680) {
                case 1097:
                    return C0060.m226(m1263(this), activityMonitor);
                case 4330:
                    str = "ۡ۠ۨ";
                    break;
            }
        }
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j) {
        String str = "ۤۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754473) {
                case 3201:
                    if (C0060.m216() > 0) {
                        str = "ۤۥ";
                        break;
                    } else {
                        C0376.m4906();
                        break;
                    }
                case 1710568:
                    return C0083.m428(m1263(this), activityMonitor, j);
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public Instrumentation.ActivityResult m1265(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i) throws Throwable {
        String str = "ۤۧۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752553) {
                case 1878:
                    return (Instrumentation.ActivityResult) C0388.m5418(m1264(m1263(this), new Class[]{Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, C0391.m5545()}), m1263(this), new Object[]{context, iBinder, iBinder2, activity, intent, C0078.m339(i)});
                case 29985:
                    if (C0009.m36() < 0) {
                        str = "ۤۧۢ";
                        break;
                    } else {
                        C0074.m307();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public Instrumentation.ActivityResult m1266(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle) throws Throwable {
        String str = "۠۟ۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752516) {
                case 5891:
                    return (Instrumentation.ActivityResult) C0388.m5418(m1264(m1263(this), new Class[]{Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, C0391.m5545(), Bundle.class}), m1263(this), new Object[]{context, iBinder, iBinder2, activity, intent, C0078.m339(i), bundle});
                case 30816:
                    str = "۠۟ۦ";
                    break;
            }
        }
    }

    @TargetApi(17)
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public Instrumentation.ActivityResult m1267(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle, UserHandle userHandle) throws Throwable {
        String str = "۠ۨۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751749) {
                case 91:
                    if (C0390.m5512() > 0) {
                        str = "۠ۨۧ";
                        break;
                    } else {
                        C0370.m3284();
                        break;
                    }
                case 4378:
                    return (Instrumentation.ActivityResult) C0388.m5418(m1264(m1263(this), new Class[]{Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, C0391.m5545(), Bundle.class, UserHandle.class}), m1263(this), new Object[]{context, iBinder, iBinder2, activity, intent, C0078.m339(i), bundle, userHandle});
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public Instrumentation.ActivityResult m1268(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i) throws Throwable {
        String str = "ۤ۟ۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56321) {
                case 1709508:
                    if (C0179.m1427() > 0) {
                        str = "ۤ۟ۤ";
                        break;
                    } else {
                        str = "ۣۢۨ";
                        break;
                    }
                case 1729992:
                    return (Instrumentation.ActivityResult) C0388.m5418(m1264(m1263(this), new Class[]{Context.class, IBinder.class, IBinder.class, Fragment.class, Intent.class, C0391.m5545()}), m1263(this), new Object[]{context, iBinder, iBinder2, fragment, intent, C0078.m339(i)});
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public Instrumentation.ActivityResult m1269(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i, Bundle bundle) throws Throwable {
        String str = "ۨۡۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746727) {
                case 6884:
                    if (C0399.m5914() > 0) {
                        str = "ۨۡۡ";
                        break;
                    } else {
                        C0391.m5571();
                        str = "ۡ۠ۢ";
                        break;
                    }
                case 28207:
                    return (Instrumentation.ActivityResult) C0388.m5418(m1264(m1263(this), new Class[]{Context.class, IBinder.class, IBinder.class, Fragment.class, Intent.class, C0391.m5545(), Bundle.class}), m1263(this), new Object[]{context, iBinder, iBinder2, fragment, intent, C0078.m339(i), bundle});
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public Instrumentation.ActivityResult m1270(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle) throws Throwable {
        String str2 = "ۤۥۢ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1754446) {
                case 30893:
                    if (C0082.m410() < 0) {
                        str2 = "ۤۥۢ";
                        break;
                    } else {
                        C0398.m5833();
                        str2 = "ۥۨۢ";
                        break;
                    }
                case 32719:
                    return (Instrumentation.ActivityResult) C0388.m5418(m1264(m1263(this), new Class[]{Context.class, IBinder.class, IBinder.class, String.class, Intent.class, C0391.m5545(), Bundle.class}), m1263(this), new Object[]{context, iBinder, iBinder2, str, intent, C0078.m339(i), bundle});
            }
        }
    }
}
