package com.cloudinject.core.p013;

import android.app.Activity;
import android.os.Bundle;
import com.sadfxg.fasg.C0370;
import mirrorb.com.android.internal.content.C0395;

/* renamed from: com.cloudinject.core.̙.̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ActivityC0178 extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        String str = "ۧ۟ۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747935) {
                case 27158:
                    if (C0370.m3284() < 0) {
                        str = "ۧ۟ۦ";
                        break;
                    } else {
                        C0370.m3284();
                        str = "ۤۤ۟";
                        break;
                    }
                case 28124:
                    return;
                case 28369:
                    super.onCreate(bundle);
                    str = "ۣۧۧ";
                    break;
            }
        }
    }
}
