package com.cloudinject.core.utils.compat;

import android.app.Activity;
import android.arch.lifecycle.p000.C0025;
import android.net.wifi.C0078;
import android.os.IBinder;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p023.C0334;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0385;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.core.utils.compat.̗, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0116 {

    /* renamed from: ̗̗̖̖̖̗̗, reason: not valid java name and contains not printable characters */
    public static final int f184 = 1;

    /* renamed from: ̗̗̖̙̖̙̙, reason: not valid java name and contains not printable characters */
    public static final int f185;

    /* renamed from: ̗̗̖̙̗̖̖, reason: not valid java name and contains not printable characters */
    public static final int f186 = 0;

    /* renamed from: ̗̗̖̙̗̙̗, reason: not valid java name and contains not printable characters */
    public static final int f187;

    /* renamed from: ̗̗̙̖̖̗̖, reason: not valid java name and contains not printable characters */
    public static final int f188;

    /* renamed from: ̗̗̙̖̖̗̗, reason: not valid java name and contains not printable characters */
    public static final int f189 = 1;

    /* renamed from: ̗̗̙̖̖̙̙, reason: not valid java name and contains not printable characters */
    public static final int f190 = 0;

    /* renamed from: ̗̗̙̖̙̗̖, reason: not valid java name and contains not printable characters */
    public static final int f191 = 4;

    /* renamed from: ̗̗̙̖̙̙̙, reason: not valid java name and contains not printable characters */
    public static final int f192;

    /* renamed from: ̗̗̙̙̖̖̙, reason: not valid java name and contains not printable characters */
    public static final int f193 = 3;

    /* renamed from: ̗̗̙̙̖̗̖, reason: not valid java name and contains not printable characters */
    public static final int f194 = 2;

    /* renamed from: ̗̗̙̙̗̙̗, reason: not valid java name and contains not printable characters */
    public static final int f195 = 2;

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:143:0x014c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x015a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0156 A[SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.C0116.<clinit>():void");
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static void m965(Activity activity, int i) {
        IBinder iBinder = null;
        Activity activity2 = null;
        Activity activity3 = null;
        String str = "ۦۣ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751687) {
                case 1838:
                    try {
                        C0399.m5877(C0391.m5539(), C0078.m358(C0086.m505(), new Object[0]), new Object[]{iBinder, C0078.m339(i)});
                        if (C0393.m5668() > 0) {
                            str = "۠ۥ۟";
                        } else {
                            continue;
                        }
                    } catch (Throwable th) {
                        C0025.m109(th);
                        str = "ۦۥۦ";
                    }
                case 2095:
                    str = "۟ۧۤ";
                    activity3 = activity2;
                    continue;
                case 2456:
                case 32610:
                    str = "ۧۡۢ";
                    continue;
                case 3482:
                case 4413:
                case 30848:
                    str = "ۨۦۦ";
                    continue;
                case 4422:
                    if (C0334.m2866() <= 0) {
                        C0381.m5127();
                    } else {
                        str = "ۡ۠ۧ";
                        continue;
                    }
                case 4481:
                    if (C0191.m1627() < 0) {
                        str = "ۥ۠ۤ";
                    } else {
                        continue;
                    }
                case 4605:
                    str = "ۣۨۢ";
                    continue;
                case 5121:
                    Activity activity4 = (Activity) C0088.m568(C0388.m5424(), activity3);
                    if (C0396.m5741() >= 0) {
                        activity2 = activity4;
                    } else {
                        str = "ۢۢۨ";
                        activity2 = activity4;
                        continue;
                    }
                case 5167:
                    try {
                        C0155.m1296(activity, i);
                        if (C0025.m118() > 0) {
                            str = "ۧۨۢ";
                        } else {
                            continue;
                        }
                    } catch (Throwable th2) {
                        C0025.m109(th2);
                        Activity activity5 = (Activity) C0088.m568(C0388.m5424(), activity);
                        if (C0191.m1627() >= 0) {
                            C0396.m5741();
                            str = "۟ۧۡ";
                            activity3 = activity5;
                        } else {
                            str = "ۧۦۤ";
                            activity3 = activity5;
                        }
                    }
                case 7547:
                    if (C0388.m5430() <= 0) {
                        C0385.m5282();
                        str = "ۦۡ۟";
                    } else {
                        str = "ۢۦۣ";
                        continue;
                    }
                case 7548:
                    if (C0229.m2064() < 0) {
                        str = "ۧۨۢ";
                    } else {
                        continue;
                    }
                case 29475:
                    break;
                case 29487:
                    return;
                case 29519:
                    if (C0380.m5068() > 0) {
                        str = "۠ۥ۟";
                    } else {
                        continue;
                    }
                case 31726:
                    if (C0394.m5672() <= 0) {
                        str = "ۧ۟ۡ";
                    } else {
                        str = "ۡ۠ۧ";
                        continue;
                    }
                case 31908:
                    if (C0179.m1427() <= 0) {
                        C0383.m5203();
                        str = "۟ۡۥ";
                    } else {
                        str = "ۦۣ۠";
                        continue;
                    }
                case 31910:
                    if (C0390.m5512() <= 0) {
                        C0184.m1524();
                    } else {
                        str = "۠ۧۡ";
                        continue;
                    }
                case 32719:
                    if (activity3 == null) {
                        break;
                    } else if (C0164.m1359() < 0) {
                        str = "ۡ۟ۤ";
                    }
                case 1730277:
                    IBinder iBinder2 = (IBinder) C0088.m568(C0179.m1434(), activity3);
                    if (C0420.m6215() >= 0) {
                        iBinder = iBinder2;
                    } else {
                        str = "ۥ۠ۤ";
                        iBinder = iBinder2;
                        continue;
                    }
            }
            str = C0390.m5512() <= 0 ? "ۦ۟۟" : "ۣۥ";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0007 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m966(android.os.IBinder r9, int r10, android.content.Intent r11) {
        /*
            r8 = 4
            r7 = 3
            r6 = 2
            r5 = 1
            r1 = 0
            java.lang.String r0 = "۠ۥۢ"
        L7:
            int r2 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r3 = 1753419(0x1ac14b, float:2.457063E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 1161: goto L13;
                case 26134: goto Lc1;
                case 27190: goto L9c;
                case 27191: goto L71;
                case 28610: goto Lb2;
                case 29288: goto L5e;
                case 31689: goto Lae;
                case 32586: goto L33;
                case 1711434: goto L60;
                default: goto L12;
            }
        L12:
            goto L7
        L13:
            mirrorb.RefMethod r0 = mirrorb.android.app.admin.C0377.m4970()
            mirrorb.RefStaticMethod r2 = androidx.core.graphics.drawable.C0086.m505()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Object r2 = android.net.wifi.C0078.m358(r2, r3)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r1] = r9
            java.lang.Integer r4 = android.net.wifi.C0078.m339(r10)
            r3[r5] = r4
            r3[r6] = r11
            mirrorb.dalvik.system.C0399.m5877(r0, r2, r3)
            java.lang.String r0 = "ۢۦۧ"
            goto L7
        L33:
            mirrorb.RefMethod r0 = mirrorb.android.net.C0389.m5475()
            mirrorb.RefStaticMethod r2 = androidx.core.graphics.drawable.C0086.m505()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Object r2 = android.net.wifi.C0078.m358(r2, r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r1] = r9
            java.lang.Integer r4 = android.net.wifi.C0078.m339(r10)
            r3[r5] = r4
            r3[r6] = r11
            java.lang.Boolean r1 = mirrorb.android.content.res.C0379.m5038(r1)
            r3[r7] = r1
            java.lang.Object r0 = mirrorb.dalvik.system.C0399.m5877(r0, r2, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = mirrorb.android.media.session.C0386.m5326(r0)
        L5d:
            return r0
        L5e:
            r0 = r1
            goto L5d
        L60:
            int r2 = mirrorb.android.net.wifi.C0388.m5428()
            r3 = 21
            if (r2 < r3) goto Lb2
            int r2 = mirrorb.android.net.C0389.m5481()
            if (r2 <= 0) goto L7
            java.lang.String r0 = "ۥۣ۟"
            goto L7
        L71:
            mirrorb.RefMethod r0 = mirrorb.android.providers.C0391.m5572()
            mirrorb.RefStaticMethod r2 = androidx.core.graphics.drawable.C0086.m505()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Object r2 = android.net.wifi.C0078.m358(r2, r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r1] = r9
            java.lang.Integer r4 = android.net.wifi.C0078.m339(r10)
            r3[r5] = r4
            r3[r6] = r11
            java.lang.Integer r1 = android.net.wifi.C0078.m339(r1)
            r3[r7] = r1
            java.lang.Object r0 = mirrorb.dalvik.system.C0399.m5877(r0, r2, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = mirrorb.android.media.session.C0386.m5326(r0)
            goto L5d
        L9c:
            int r2 = mirrorb.android.net.wifi.C0388.m5428()
            r3 = 24
            if (r2 < r3) goto Lc1
            int r2 = android.net.wifi.C0078.m361()
            if (r2 <= 0) goto L7
            java.lang.String r0 = "۠ۥۡ"
            goto L7
        Lae:
            java.lang.String r0 = "۠ۥۢ"
            goto L7
        Lb2:
            int r2 = mirrorb.android.net.wifi.C0388.m5430()
            if (r2 > 0) goto Lbd
            android.database.C0074.m307()
            goto L7
        Lbd:
            java.lang.String r0 = "ۧۥ۠"
            goto L7
        Lc1:
            int r2 = mirrorb.android.content.C0380.m5068()
            if (r2 <= 0) goto L7
            java.lang.String r0 = "۠ۡ"
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.C0116.m966(android.os.IBinder, int, android.content.Intent):boolean");
    }
}
