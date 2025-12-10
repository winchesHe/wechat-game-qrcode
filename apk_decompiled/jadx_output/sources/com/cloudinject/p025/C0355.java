package com.cloudinject.p025;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.C0073;
import android.database.C0074;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.net.wifi.C0388;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;

@Dex2C
/* renamed from: com.cloudinject.̗.̗̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0355 extends ContextWrapper {

    /* renamed from: ̙̙̖̙̖̙̙, reason: not valid java name and contains not printable characters */
    private C0340 f585;

    public C0355(Context context) {
        super(context);
    }

    public C0355(C0340 c0340) {
        this(C0383.m5209(c0340));
        String str = "ۣۢ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56296) {
                case 1731830:
                    if (C0155.m1294() < 0) {
                        str = "ۣۢ۟";
                        break;
                    } else {
                        C0074.m307();
                        break;
                    }
                case 1731976:
                    this.f585 = c0340;
                    str = "۟ۥۣ";
                    break;
                case 1735765:
                    return;
            }
        }
    }

    /* renamed from: ۟ۦۧۧ۟, reason: not valid java name and contains not printable characters */
    public static C0340 m3080(Object obj) {
        Object obj2 = "ۣۨۧ";
        C0340 c0340 = null;
        C0340 c03402 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1754561) {
                case 1128:
                    if (C0279.m2491() >= 0) {
                        C0088.m573();
                    } else {
                        obj2 = "ۣۨۧ";
                        continue;
                    }
                case 3300:
                    if (C0378.m4998() <= 0) {
                        obj2 = "ۨۢ۠";
                    } else {
                        obj2 = "۟۟ۦ";
                        continue;
                    }
                case 25178:
                    return c0340;
                case 25287:
                case 27465:
                    if (C0164.m1359() >= 0) {
                        C0073.m265();
                    } else {
                        obj2 = "۟ۤ۠";
                        continue;
                    }
                case 28451:
                    c03402 = ((C0355) obj).f585;
                    if (C0398.m5833() > 0) {
                        obj2 = "ۥۣۧ";
                    } else {
                        continue;
                    }
                case 29411:
                    if (C0384.m5278() < 0) {
                        break;
                    } else if (C0291.m2568() < 0) {
                        obj2 = "۠۠ۢ";
                    }
                case 29443:
                    if (C0088.m573() <= 0) {
                        C0086.m500();
                    } else {
                        obj2 = "ۢۧ۟";
                        continue;
                    }
                case 30360:
                    break;
                case 30459:
                    if (C0382.m5180() <= 0) {
                        C0183.m1464();
                        c0340 = null;
                    } else {
                        obj2 = "ۨۢ۟";
                        c0340 = null;
                        continue;
                    }
                case 31688:
                    obj2 = "۟ۤ۠";
                    c0340 = c03402;
                    continue;
            }
            obj2 = "ۣۥۤ";
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return C0388.m5457(m3080(this));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ClassLoader getClassLoader() {
        return C0379.m5036(m3080(this));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
        return C0291.m2559(m3080(this));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return C0089.m632(m3080(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0059 A[SYNTHETIC] */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getSystemService(java.lang.String r8) {
        /*
            r7 = this;
            r2 = 0
            java.lang.String r0 = "ۤۨۡ"
            r1 = r2
            r3 = r2
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1748857(0x1aaf79, float:2.45067E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 36: goto L11;
                case 226: goto L1a;
                case 1148: goto L62;
                case 4568: goto L35;
                case 5489: goto L1f;
                case 5540: goto L24;
                case 6584: goto L53;
                case 26138: goto L1e;
                case 28214: goto L41;
                case 1733593: goto L46;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            boolean r0 = mirrorb.com.android.internal.content.C0395.m5699(r8, r3)
            if (r0 == 0) goto L62
            java.lang.String r0 = "ۥۨۤ"
            goto L5
        L1a:
            android.view.LayoutInflater r2 = androidx.core.graphics.drawable.C0086.m506(r1, r7)
        L1e:
            return r2
        L1f:
            java.lang.Object r2 = super.getSystemService(r8)
            goto L1e
        L24:
            java.lang.String r3 = android.arch.lifecycle.p000.C0025.m104()
            java.lang.String r3 = mirrorb.android.location.C0385.m5310(r3)
            int r4 = com.cloudinject.feature.p015.C0206.m1807()
            if (r4 >= 0) goto L5
            java.lang.String r0 = "ۡۦۢ"
            goto L5
        L35:
            java.lang.Object r0 = super.getSystemService(r3)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            java.lang.String r1 = "ۦ۟ۨ"
            r6 = r1
            r1 = r0
            r0 = r6
            goto L5
        L41:
            if (r1 != 0) goto L53
            java.lang.String r0 = "ۨۤ۟"
            goto L5
        L46:
            int r4 = com.cloudinject.feature.p021.C0291.m2568()
            if (r4 < 0) goto L50
            com.cloudinject.customview.C0184.m1524()
            goto L5
        L50:
            java.lang.String r0 = "ۤۨۡ"
            goto L5
        L53:
            int r0 = android.net.wifi.C0078.m361()
            if (r0 > 0) goto L5f
            mirrorb.android.app.admin.C0377.m4944()
            java.lang.String r0 = "۠ۤۤ"
            goto L5
        L5f:
            java.lang.String r0 = "ۡۨۢ"
            goto L5
        L62:
            int r0 = android.database.C0073.m265()
            if (r0 > 0) goto L6e
            mirrorb.com.android.internal.view.C0397.m5814()
            java.lang.String r0 = "ۥ۠ۦ"
            goto L5
        L6e:
            java.lang.String r0 = "ۤۡۥ"
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.p025.C0355.getSystemService(java.lang.String):java.lang.Object");
    }
}
