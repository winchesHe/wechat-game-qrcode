package com.cloudinject.feature;

import androidx.core.graphics.drawable.C0086;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.p025.p026.C0346;
import java.lang.Thread;
import mirrorb.android.accounts.C0375;
import mirrorb.android.location.C0385;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;

/* renamed from: com.cloudinject.feature.̙̗̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0292 implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        String strM5765 = null;
        String str = "ۡۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751526) {
                case 2787:
                    return;
                case 3782:
                    C0375.m4853(C0385.m5310(C0086.m516()), strM5765);
                    str = "ۢۥۨ";
                    break;
                case 30859:
                    if (C0346.m3059() >= 0) {
                        break;
                    } else {
                        str = "ۡۨ";
                        break;
                    }
                case 1729985:
                    strM5765 = C0397.m5765(C0229.m2043(), th);
                    if (C0346.m3059() < 0) {
                        str = "ۣۨۥ";
                        break;
                    } else {
                        str = "ۦۡ";
                        break;
                    }
            }
        }
    }
}
