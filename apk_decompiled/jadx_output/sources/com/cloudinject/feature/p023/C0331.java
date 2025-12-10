package com.cloudinject.feature.p023;

import android.annotation.SuppressLint;
import android.app.C0009;
import android.content.ClipboardManager;
import android.content.Context;
import android.database.C0074;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.p025.p026.C0346;
import com.sadfxg.fasg.C0370;
import mirrorb.android.accounts.C0376;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.location.C0385;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.providers.C0391;
import mirrorb.com.android.internal.content.C0395;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̙̙.̗̙̙̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0331 {
    @SuppressLint({"NewApi"})
    /* renamed from: ̗̙̙̗, reason: not valid java name and contains not printable characters */
    public static void m2829(String str) {
        int i = 0;
        Context contextM2043 = null;
        String strM5310 = null;
        Object obj = "ۦۣ۠";
        while (true) {
            switch (C0395.m5690(obj) ^ 1754503) {
                case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                case 30820:
                    if (C0184.m1524() < 0) {
                        obj = "۠ۦۧ";
                    } else {
                        continue;
                    }
                case 1092:
                    contextM2043 = C0229.m2043();
                    obj = "ۣ۟ۥ";
                    continue;
                case 1262:
                    C0291.m2574((ClipboardManager) C0420.m6229(contextM2043, strM5310), C0229.m2037(C0385.m5310(C0074.m317()), str));
                    if (C0346.m3059() < 0) {
                        obj = "ۦۥۦ";
                    } else {
                        continue;
                    }
                case 1920:
                    if (C0228.m2012() > 0) {
                        obj = "ۥۢ۠";
                    } else {
                        continue;
                    }
                case 2008:
                    if (i < 11) {
                        break;
                    } else {
                        obj = "ۦۣ۠";
                    }
                case 25116:
                    break;
                case 27332:
                    if (C0391.m5571() <= 0) {
                        C0155.m1294();
                    } else {
                        obj = "ۦۣ۠";
                        continue;
                    }
                case 28198:
                    return;
                case 29582:
                    int iM5428 = C0388.m5428();
                    if (C0376.m4906() <= 0) {
                        i = iM5428;
                        obj = "ۧۧۡ";
                    } else {
                        i = iM5428;
                        obj = "ۥۣۧ";
                        continue;
                    }
                case 30586:
                    C0086.m509((android.text.ClipboardManager) C0420.m6229(contextM2043, strM5310), str);
                    if (C0229.m2064() >= 0) {
                        C0009.m36();
                        obj = "ۨۦۢ";
                    } else {
                        obj = "۠ۦۧ";
                        continue;
                    }
                case 31494:
                    strM5310 = C0385.m5310(C0382.m5158());
                    if (C0089.m592() <= 0) {
                        C0279.m2491();
                    } else {
                        obj = "ۦۨۡ";
                        continue;
                    }
            }
            if (C0370.m3284() < 0) {
                obj = "ۢۥ۠";
            }
        }
    }
}
