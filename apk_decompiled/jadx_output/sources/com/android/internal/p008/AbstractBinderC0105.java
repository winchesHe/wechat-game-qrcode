package com.android.internal.p008;

import android.net.C0082;
import android.net.C0083;
import android.os.Binder;
import android.os.IBinder;
import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.p025.C0362;
import mirrorb.android.content.C0380;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;

/* renamed from: com.android.internal.̗.̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC0105 extends Binder implements InterfaceC0106 {
    private static final String DESCRIPTOR = "com.android.internal.̗.̗";

    /* renamed from: ̗̖̗̗̖̖̖, reason: not valid java name and contains not printable characters */
    static final int f164 = 1;

    /* renamed from: ̗̖̗̗̖̖̗, reason: not valid java name and contains not printable characters */
    static final int f165 = 2;

    public AbstractBinderC0105() {
        String str = "ۨۦ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748804) {
                case 26342:
                    C0083.m443(this, this, C0385.m5310(C0398.m5846()));
                    if (C0279.m2491() < 0) {
                        str = "ۧۧ۟";
                        break;
                    } else {
                        C0279.m2491();
                        break;
                    }
                case 27323:
                    return;
                case 1733534:
                    if (C0362.m3122() >= 0) {
                        break;
                    } else {
                        str = "ۨۦ۠";
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0005 A[SYNTHETIC] */
    /* renamed from: ̖̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.android.internal.p008.InterfaceC0106 m851(android.os.IBinder r6) {
        /*
            r2 = 0
            java.lang.String r0 = "ۣ۠۠"
            r1 = r0
            r0 = r2
        L5:
            int r3 = mirrorb.com.android.internal.content.C0395.m5690(r1)
            r4 = 1755559(0x1ac9a7, float:2.460062E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 142: goto L11;
                case 192: goto L2b;
                case 2156: goto L5d;
                case 25242: goto L20;
                case 25455: goto L4e;
                case 26171: goto L1c;
                case 26298: goto L1f;
                case 32635: goto L6a;
                case 1709402: goto L54;
                case 1709438: goto L3d;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            if (r0 == 0) goto L54
            int r3 = android.database.C0073.m265()
            if (r3 <= 0) goto L5
            java.lang.String r1 = "ۧ۠"
            goto L5
        L1c:
            com.android.internal.̗.̗ r0 = (com.android.internal.p008.InterfaceC0106) r0
            r2 = r0
        L1f:
            return r2
        L20:
            if (r6 != 0) goto L5d
            int r3 = mirrorb.com.android.internal.app.C0394.m5672()
            if (r3 <= 0) goto L5
            java.lang.String r1 = "ۡۤ۠"
            goto L5
        L2b:
            java.lang.String r0 = mirrorb.com.android.internal.C0398.m5846()
            java.lang.String r0 = mirrorb.android.location.C0385.m5310(r0)
            android.os.IInterface r1 = mirrorb.android.content.C0380.m5067(r6, r0)
            java.lang.String r0 = "ۣۨۢ"
            r5 = r0
            r0 = r1
            r1 = r5
            goto L5
        L3d:
            boolean r3 = r0 instanceof com.android.internal.p008.InterfaceC0106
            if (r3 == 0) goto L54
            int r3 = mirrorb.android.media.session.C0386.m5322()
            if (r3 > 0) goto L4b
            mirrorb.android.net.wifi.C0387.m5374()
            goto L5
        L4b:
            java.lang.String r1 = "ۣۡۨ"
            goto L5
        L4e:
            com.android.internal.̗.̗̙ r2 = new com.android.internal.̗.̗̙
            r2.<init>(r6)
            goto L1f
        L54:
            int r3 = com.sadfxg.fasg.C0369.m3256()
            if (r3 <= 0) goto L5
            java.lang.String r1 = "۠۟ۧ"
            goto L5
        L5d:
            int r3 = com.cloudinject.core.utils.compat.C0121.m1023()
            if (r3 < 0) goto L67
            com.cloudinject.core.utils.compat.C0121.m1023()
            goto L5
        L67:
            java.lang.String r1 = "ۣۨۤ"
            goto L5
        L6a:
            int r1 = mirrorb.android.location.C0385.m5282()
            if (r1 < 0) goto L76
            com.cloudinject.p025.p026.C0346.m3059()
            java.lang.String r1 = "ۨۢ۟"
            goto L5
        L76:
            java.lang.String r1 = "ۣ۠۠"
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.internal.p008.AbstractBinderC0105.m851(android.os.IBinder):com.android.internal.̗.̗");
    }

    /* renamed from: ۟ۡ۟۠۠, reason: not valid java name and contains not printable characters */
    public static int[] m852(Object obj) {
        String str = "ۣۢ۟";
        int[] iArr = null;
        int[] iArr2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751652) {
                case 1063:
                    str = "ۢۢۡ";
                    continue;
                case 2240:
                case 2245:
                    if (C0389.m5481() <= 0) {
                        C0386.m5322();
                    } else {
                        str = "۟ۤۢ";
                        continue;
                    }
                case 3076:
                    if (C0164.m1359() > 0) {
                        break;
                    } else if (C0088.m573() <= 0) {
                        C0387.m5374();
                        str = "ۧۨۡ";
                    } else {
                        str = "ۣۡۦ";
                    }
                case 5472:
                    iArr2 = ((AbstractBinderC0105) obj).mo855();
                    str = "ۢۧ";
                    continue;
                case 5476:
                    if (C0396.m5741() < 0) {
                        str = "ۣۢ۟";
                    } else {
                        continue;
                    }
                case 7521:
                    if (C0228.m2012() <= 0) {
                        C0164.m1359();
                        iArr = null;
                    } else {
                        str = "ۥۥۣ";
                        iArr = null;
                        continue;
                    }
                case 7673:
                    return iArr;
                case 29322:
                    break;
                case 31844:
                    str = "۟۟ۥ";
                    continue;
                case 1730081:
                    str = "۟ۤۢ";
                    iArr = iArr2;
                    continue;
            }
            str = "ۧۧ۠";
        }
    }

    /* renamed from: ۟ۢ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m853(Object obj, Object obj2) {
        String str = "ۢۡۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750630) {
                case 14:
                    ((AbstractBinderC0105) obj).mo854((int[]) obj2);
                    str = "ۥۣ۠";
                    continue;
                case 108:
                    if (C0380.m5068() > 0) {
                        str = "ۢۡۢ";
                    } else {
                        continue;
                    }
                case 1253:
                    if (C0390.m5512() <= 0) {
                        break;
                    } else if (C0393.m5668() <= 0) {
                        C0184.m1524();
                        str = "ۣۨ";
                    } else {
                        str = "ۣۢۧ";
                    }
                case 2073:
                case 4536:
                    if (C0082.m410() < 0) {
                        str = "ۥۣ۠";
                    } else {
                        continue;
                    }
                case 3022:
                    return;
                case 7590:
                    if (C0395.m5698() < 0) {
                        str = "ۥۧۡ";
                    } else {
                        continue;
                    }
                case 1731142:
                    break;
            }
            if (C0191.m1627() < 0) {
                str = "۠ۧۧ";
            }
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0005 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00cf A[SYNTHETIC] */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) throws android.os.RemoteException {
        /*
            r6 = this;
            r1 = 0
            r3 = 1
            java.lang.String r0 = "ۣۥۡ"
            r2 = r1
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1753574(0x1ac1e6, float:2.45728E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 45: goto L11;
                case 168: goto L5e;
                case 974: goto L3a;
                case 995: goto Lc9;
                case 2050: goto L9c;
                case 2251: goto Lc5;
                case 26328: goto La3;
                case 27185: goto Lbb;
                case 28263: goto L23;
                case 28384: goto L21;
                case 28473: goto L7b;
                case 29496: goto L52;
                case 30553: goto L16;
                case 30574: goto L40;
                case 30690: goto L73;
                case 30701: goto L60;
                case 31576: goto Lb1;
                case 31621: goto L29;
                case 31714: goto L99;
                case 31776: goto L88;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            boolean r0 = super.onTransact(r7, r8, r9, r10)
        L15:
            return r0
        L16:
            java.lang.String r0 = mirrorb.com.android.internal.C0398.m5846()
            java.lang.String r2 = mirrorb.android.location.C0385.m5310(r0)
            java.lang.String r0 = "ۣۤۤ"
            goto L5
        L21:
            r0 = r3
            goto L15
        L23:
            android.net.wifi.C0078.m372(r9, r1)
            java.lang.String r0 = "ۣۡۨ"
            goto L5
        L29:
            if (r7 == r3) goto Lbb
            int r0 = android.net.C0083.m448()
            if (r0 < 0) goto L37
            mirrorb.com.android.internal.app.C0394.m5672()
            java.lang.String r0 = "ۣ۟ۥ"
            goto L5
        L37:
            java.lang.String r0 = "ۣۣۨ"
            goto L5
        L3a:
            com.cloudinject.p025.C0362.m3088(r8, r2)
            java.lang.String r0 = "۟ۡ۠"
            goto L5
        L40:
            r0 = 2
            if (r7 == r0) goto Lc9
            int r0 = mirrorb.java.lang.C0400.m5961()
            if (r0 > 0) goto L4f
            mirrorb.android.net.C0389.m5481()
            java.lang.String r0 = "ۣۤۤ"
            goto L5
        L4f:
            java.lang.String r0 = "ۣ۟۠"
            goto L5
        L52:
            mirrorb.android.accounts.C0376.m4920(r9, r2)
            int r4 = com.cloudinject.feature.p015.C0206.m1807()
            if (r4 >= 0) goto L5
            java.lang.String r0 = "ۦ۟ۧ"
            goto L5
        L5e:
            r0 = r3
            goto L15
        L60:
            int[] r0 = com.cloudinject.customview.C0184.m1518(r8)
            m853(r6, r0)
            int r0 = com.cloudinject.customview.C0184.m1524()
            if (r0 < 0) goto L70
            java.lang.String r0 = "ۣ۠ۤ"
            goto L5
        L70:
            java.lang.String r0 = "ۡۢ۠"
            goto L5
        L73:
            r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r7 == r0) goto Lc5
            java.lang.String r0 = "ۦۣۨ"
            goto L5
        L7b:
            com.cloudinject.core.p009.p012.C0164.m1352(r9)
            int r4 = mirrorb.android.hardware.location.C0383.m5203()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۤۡۡ"
            goto L5
        L88:
            com.cloudinject.p025.C0362.m3088(r8, r2)
            int r0 = mirrorb.com.android.internal.app.C0394.m5672()
            if (r0 > 0) goto L95
            java.lang.String r0 = "۟ۥۦ"
            goto L5
        L95:
            java.lang.String r0 = "ۣ۟ۧ"
            goto L5
        L99:
            r0 = r3
            goto L15
        L9c:
            com.cloudinject.core.p009.p012.C0164.m1352(r9)
            java.lang.String r0 = "ۡۧۧ"
            goto L5
        La3:
            int[] r1 = m852(r6)
            int r4 = com.cloudinject.feature.p023.C0334.m2866()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۨۨۤ"
            goto L5
        Lb1:
            int r4 = mirrorb.android.util.C0393.m5668()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۣۥۡ"
            goto L5
        Lbb:
            int r4 = android.net.C0082.m410()
            if (r4 >= 0) goto L5
            java.lang.String r0 = "ۥۡۢ"
            goto L5
        Lc5:
            java.lang.String r0 = "ۢۤ۠"
            goto L5
        Lc9:
            int r0 = android.app.C0009.m36()
            if (r0 < 0) goto Ld6
            mirrorb.android.net.wifi.C0387.m5374()
            java.lang.String r0 = "ۦۦۥ"
            goto L5
        Ld6:
            java.lang.String r0 = "ۦۦۨ"
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.internal.p008.AbstractBinderC0105.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
