package com.cloudinject.core.p009.p012;

import com.cloudinject.core.p009.p010.AbstractC0149;
import com.cloudinject.core.p009.p010.InterfaceC0147;
import com.cloudinject.feature.p023.C0335;
import com.sadfxg.fasg.C0369;
import java.lang.reflect.Method;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;

@InterfaceC0147(name = "activityResumed")
/* renamed from: com.cloudinject.core.̗.̗̙.̗̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0160 extends AbstractC0149 {
    @Override // com.cloudinject.core.p009.p010.AbstractC0149
    /* renamed from: ̙ */
    protected Object mo1233(Object obj, Method method, Object[] objArr) throws Throwable {
        String str = "ۦۢۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751777) {
                case 5126:
                    if (C0369.m3256() > 0) {
                        str = "ۦۢۥ";
                        break;
                    } else {
                        C0335.m2923();
                        break;
                    }
                case 31560:
                    return C0397.m5812(method, obj, objArr);
            }
        }
    }
}
