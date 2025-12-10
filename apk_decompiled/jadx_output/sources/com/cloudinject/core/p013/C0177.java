package com.cloudinject.core.p013;

import android.app.C0009;
import android.arch.p003.p005.C0060;
import android.database.C0074;
import android.net.wifi.C0078;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p023.C0334;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.providers.C0391;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;

/* renamed from: com.cloudinject.core.̙.̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0177 {
    /* renamed from: ̗̙̖, reason: not valid java name and contains not printable characters */
    public static void m1394(Object obj) {
        String str = "۠ۨ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752640) {
                case TypedValues.Custom.TYPE_COLOR /* 902 */:
                    str = "۠ۨ۟";
                    continue;
                case 1123:
                case 32680:
                    return;
                case 2051:
                    break;
                case 3078:
                    C0382.m5155(C0009.m28(), C0078.m352(C0060.m194(obj)));
                    if (C0391.m5571() <= 0) {
                        C0078.m361();
                    } else {
                        str = "ۤۢۡ";
                        continue;
                    }
                case 5527:
                    if (C0334.m2887(C0379.m5014(C0383.m5204()))) {
                        break;
                    } else {
                        str = C0396.m5741() >= 0 ? "۠ۤ۠" : "ۦۤۦ";
                    }
            }
            if (C0184.m1524() >= 0) {
                C0074.m307();
            } else {
                str = "ۣۢ۟";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0003 A[SYNTHETIC] */
    /* renamed from: ̗̙̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1395(java.lang.Object r4) {
        /*
            r1 = 0
            java.lang.String r0 = "ۣۤۤ"
        L3:
            int r2 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r3 = 1753668(0x1ac244, float:2.457412E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 100: goto Lf;
                case 969: goto Lb4;
                case 1901: goto L57;
                case 2016: goto Laa;
                case 2708: goto L2e;
                case 26043: goto L21;
                case 27228: goto L68;
                case 27879: goto L9c;
                case 27904: goto L9c;
                case 28896: goto L4f;
                case 29927: goto L7f;
                case 30752: goto La6;
                case 32737: goto L42;
                default: goto Le;
            }
        Le:
            goto L3
        Lf:
            java.util.Set r0 = android.app.C0009.m28()
            java.lang.Class r2 = android.arch.p003.p005.C0060.m194(r4)
            java.lang.String r2 = android.net.wifi.C0078.m352(r2)
            mirrorb.android.rms.C0392.m5607(r0, r2)
            java.lang.String r0 = "۟ۧۧ"
            goto L3
        L21:
            java.util.Set r2 = android.app.C0009.m28()
            boolean r2 = androidx.core.p007.C0089.m601(r2)
            if (r2 == 0) goto L9c
            java.lang.String r0 = "ۢۢۤ"
            goto L3
        L2e:
            android.content.Context r2 = mirrorb.com.android.internal.view.inputmethod.C0396.m5736()
            mirrorb.com.android.internal.content.C0395.m5715(r2, r1)
            int r2 = mirrorb.android.media.session.C0386.m5322()
            if (r2 > 0) goto L3f
            com.cloudinject.feature.model.p014.C0191.m1627()
            goto L3
        L3f:
            java.lang.String r0 = "ۦۡۨ"
            goto L3
        L42:
            int r2 = mirrorb.com.android.internal.app.C0394.m5672()
            if (r2 > 0) goto L4c
            com.px.C0368.m3171()
            goto L3
        L4c:
            java.lang.String r0 = "ۡ۠ۢ"
            goto L3
        L4f:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r0 = "۟ۨۡ"
            goto L3
        L57:
            com.cloudinject.core.̗.̗.̗ r0 = mirrorb.android.hardware.location.C0383.m5204()
            java.util.concurrent.atomic.AtomicBoolean r0 = mirrorb.android.content.res.C0379.m5014(r0)
            boolean r0 = com.cloudinject.feature.p023.C0334.m2887(r0)
            if (r0 != 0) goto La6
            java.lang.String r0 = "ۥ۠۠"
            goto L3
        L68:
            java.lang.String r0 = mirrorb.android.net.wifi.C0388.m5425()
            java.lang.String r0 = mirrorb.android.location.C0385.m5310(r0)
            mirrorb.android.accounts.C0376.m4918(r1, r0)
            int r0 = com.sadfxg.fasg.C0370.m3284()
            if (r0 < 0) goto L7c
            java.lang.String r0 = "ۦۣ"
            goto L3
        L7c:
            java.lang.String r0 = "ۨ۟ۧ"
            goto L3
        L7f:
            com.cloudinject.core.̗.̗.̗ r2 = mirrorb.android.hardware.location.C0383.m5204()
            java.util.concurrent.atomic.AtomicBoolean r2 = com.cloudinject.p025.C0362.m3126(r2)
            boolean r2 = com.cloudinject.feature.p023.C0334.m2887(r2)
            if (r2 == 0) goto L9c
            int r2 = com.cloudinject.feature.p023.C0335.m2923()
            if (r2 < 0) goto L98
            mirrorb.android.util.C0393.m5668()
            goto L3
        L98:
            java.lang.String r0 = "ۧ۠ۢ"
            goto L3
        L9c:
            int r2 = mirrorb.android.accounts.C0376.m4906()
            if (r2 <= 0) goto L3
            java.lang.String r0 = "ۦۡۨ"
            goto L3
        La6:
            java.lang.String r0 = "ۦۦ۠"
            goto L3
        Laa:
            int r2 = android.net.wifi.C0078.m361()
            if (r2 <= 0) goto L3
            java.lang.String r0 = "ۣۤۤ"
            goto L3
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.p013.C0177.m1395(java.lang.Object):void");
    }
}
