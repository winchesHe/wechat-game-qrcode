package com.cloudinject.core.p009.p012;

import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p010.AbstractC0149;
import com.cloudinject.core.p009.p010.InterfaceC0147;
import java.lang.reflect.Method;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;

@InterfaceC0147(name = "finishActivity")
/* renamed from: com.cloudinject.core.̗.̗̙.̗̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0159 extends AbstractC0149 {
    @Override // com.cloudinject.core.p009.p010.AbstractC0149
    /* renamed from: ̙ */
    protected Object mo1233(Object obj, Method method, Object[] objArr) throws Throwable {
        String str = "۟ۤۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754472) {
                case 25109:
                    if (C0088.m573() > 0) {
                        str = "۟ۤۤ";
                        break;
                    } else {
                        str = "ۣۤ۠";
                        break;
                    }
                case 25335:
                    return C0397.m5812(method, obj, objArr);
            }
        }
    }
}
