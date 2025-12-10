package com.cloudinject.feature;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.p000.C0025;
import android.os.Bundle;
import androidx.core.p007.C0088;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.location.C0385;
import mirrorb.android.providers.C0391;
import mirrorb.com.android.internal.content.C0395;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0210 implements Application.ActivityLifecycleCallbacks {
    /* renamed from: ̙̙̖, reason: not valid java name and contains not printable characters */
    private static String m1847(String str) {
        return C0377.m4932(C0025.m84(new StringBuilder(str)));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119 A[SYNTHETIC] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    @com.cloudinject.feature.ann.Dex2C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityCreated(android.app.Activity r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.C0210.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @Dex2C
    public void onActivityDestroyed(Activity activity) {
        String str = "۠۟۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755525) {
                case 25112:
                    return;
                case 25412:
                    C0370.m3315(C0377.m4972(), activity);
                    if (C0334.m2866() > 0) {
                        str = "۠ۦۣ";
                        break;
                    } else {
                        C0183.m1464();
                        break;
                    }
                case 28347:
                    if (C0382.m5180() > 0) {
                        str = "۠۟۠";
                        break;
                    } else {
                        C0391.m5571();
                        str = "ۣ۟ۧ";
                        break;
                    }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        String str = "ۣۨ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746912) {
                case 231:
                    if (C0228.m2012() <= 0) {
                        break;
                    } else {
                        str = "ۣۨ۟";
                        break;
                    }
                case 28460:
                    return;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @Dex2C
    public void onActivityResumed(Activity activity) {
        String str = "۠ۧۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753665) {
                case 2887:
                    if (C0385.m5282() < 0) {
                        str = "۠ۧۥ";
                        break;
                    } else {
                        C0420.m6215();
                        break;
                    }
                case 2980:
                    return;
                case 27135:
                    C0370.m3315(C0377.m4972(), activity);
                    if (C0279.m2491() < 0) {
                        str = "ۣۥۨ";
                        break;
                    } else {
                        C0088.m573();
                        break;
                    }
                case 29831:
                    C0206.m1812(C0377.m4972(), 0, activity);
                    str = "ۨۨۥ";
                    break;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        String str = "ۤۡۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755463) {
                case 29506:
                    return;
                case 1709415:
                    str = "ۤۡۢ";
                    break;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        String str = "ۣ۟ۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754506) {
                case 25322:
                    return;
                case 32685:
                    if (C0369.m3256() > 0) {
                        str = "ۣ۟ۢ";
                        break;
                    } else {
                        str = "ۥۨۢ";
                        break;
                    }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        String str = "ۣ۠ۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748610) {
                case 1473:
                    return;
                case 7200:
                    if (C0206.m1807() < 0) {
                        str = "ۣ۠ۦ";
                        break;
                    } else {
                        C0378.m4998();
                        break;
                    }
            }
        }
    }
}
