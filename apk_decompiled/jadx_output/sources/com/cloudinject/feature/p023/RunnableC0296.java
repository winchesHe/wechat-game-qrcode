package com.cloudinject.feature.p023;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.view.View;
import androidx.core.graphics.drawable.C0086;
import com.cloudinject.feature.p018.C0229;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.net.wifi.C0388;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.java.lang.C0400;

/* renamed from: com.cloudinject.feature.̙̙.̖̖̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
class RunnableC0296 implements Runnable {
    final View val$view;

    RunnableC0296(View view) {
        this.val$view = view;
    }

    /* renamed from: ۣۣۡۡ, reason: not valid java name and contains not printable characters */
    public static View m2615(Object obj) {
        Object obj2 = "ۤ۟ۦ";
        View view = null;
        View view2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1749640) {
                case 1166:
                    if (C0400.m5961() <= 0) {
                        obj2 = "ۡۥۣ";
                    } else {
                        obj2 = "۠ۡۤ";
                        continue;
                    }
                case 2883:
                    if (C0384.m5278() < 0) {
                        break;
                    } else {
                        obj2 = "ۦۨ۟";
                    }
                case 3885:
                    break;
                case 5489:
                    return view;
                case 6451:
                    if (C0009.m36() >= 0) {
                        C0381.m5127();
                        view = view2;
                    } else {
                        obj2 = "۟ۧۡ";
                        view = view2;
                        continue;
                    }
                case 6539:
                    if (C0083.m448() >= 0) {
                        C0074.m307();
                        view = null;
                    } else {
                        obj2 = "ۨۦۧ";
                        view = null;
                        continue;
                    }
                case 7563:
                case 1732302:
                    if (C0086.m500() > 0) {
                        obj2 = "۟ۧۡ";
                    } else {
                        continue;
                    }
                case 28885:
                    view2 = ((RunnableC0296) obj).val$view;
                    if (C0383.m5203() <= 0) {
                        C0376.m4906();
                    } else {
                        obj2 = "۠ۧۢ";
                        continue;
                    }
                case 31521:
                    if (C0396.m5741() >= 0) {
                        C0380.m5068();
                        obj2 = "ۥ۠ۢ";
                    } else {
                        obj2 = "ۣۡۥ";
                        continue;
                    }
                case 31592:
                    if (C0082.m410() >= 0) {
                        C0388.m5430();
                    } else {
                        obj2 = "ۤ۟ۦ";
                        continue;
                    }
            }
            if (C0375.m4840() < 0) {
                obj2 = "ۣ۟ۢ";
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = "ۣۧۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752486) {
                case 1088:
                    if (C0073.m265() > 0) {
                        str = "ۣۧۡ";
                        break;
                    } else {
                        C0025.m118();
                        break;
                    }
                case 2907:
                    C0229.m2062(m2615(this));
                    str = "ۧۥۤ";
                    break;
                case 30816:
                    return;
            }
        }
    }
}
