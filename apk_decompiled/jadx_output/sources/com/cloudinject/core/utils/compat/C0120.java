package com.cloudinject.core.utils.compat;

import android.net.wifi.C0078;
import android.os.IBinder;
import android.os.IInterface;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.com.android.internal.content.C0395;

/* renamed from: com.cloudinject.core.utils.compat.̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0120 {
    /* renamed from: ̙̗, reason: not valid java name and contains not printable characters */
    public static IInterface m982(IBinder iBinder) {
        String str = "ۢۥۣ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755336) {
                case 3492:
                    return (IInterface) C0078.m358(C0395.m5697(), new Object[]{iBinder});
                case 26190:
                    return (IInterface) C0078.m358(C0206.m1838(), new Object[]{iBinder});
                case 26508:
                    if (C0379.m5056() > 0) {
                        str = "ۢۥۣ";
                    } else {
                        continue;
                    }
                case 31688:
                    if (!C0380.m5078()) {
                        break;
                    } else {
                        str = "ۡ۟ۤ";
                    }
                case 31724:
                    break;
            }
            if (C0228.m2012() > 0) {
                str = "ۧۢۧ";
            }
        }
    }
}
