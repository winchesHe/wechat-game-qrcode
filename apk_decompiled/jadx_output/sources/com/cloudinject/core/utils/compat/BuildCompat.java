package com.cloudinject.core.utils.compat;

import android.app.C0009;
import android.app.CryptoBox;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import mirrorb.android.accounts.C0375;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* loaded from: classes6.dex */
public class BuildCompat {

    /* renamed from: ̗̗̙̙̖̗̗, reason: not valid java name and contains not printable characters */
    private static ROMType f170;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes3.dex */
    public final class ROMType {
        private static final ROMType[] $VALUES;
        public static final ROMType COLOR_OS;
        public static final ROMType EMUI;
        public static final ROMType FLYME;
        public static final ROMType LETV;
        public static final ROMType MIUI;
        public static final ROMType OTHER;
        public static final ROMType SAMSUNG;
        public static final ROMType VIVO;
        public static final ROMType _360;

        static {
            Object[] objArr = null;
            int i = 0;
            int iIntValue = 0;
            int i2 = 0;
            int i3 = 0;
            int iIntValue2 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            ROMType[] rOMTypeArr = null;
            Object obj = "ۦۣۢ";
            while (true) {
                switch (C0395.m5690(obj) ^ 1754378) {
                    case 3:
                        int i9 = ((-5264837) & iIntValue) | ((iIntValue ^ (-1)) & 5264836);
                        COLOR_OS = new ROMType(CryptoBox.decrypt("491A55DC89E6FC11571B3460B8CCA37D"), i9);
                        if (C0164.m1359() < 0) {
                            i2 = i9;
                            obj = "ۧۥ";
                            break;
                        } else {
                            i2 = i9;
                            obj = "ۥۣ";
                            break;
                        }
                    case 97:
                        rOMTypeArr[i8] = OTHER;
                        $VALUES = rOMTypeArr;
                        if (C0155.m1294() >= 0) {
                            break;
                        } else {
                            obj = "ۥ۠ۥ";
                            break;
                        }
                    case 206:
                        LETV = new ROMType(CryptoBox.decrypt("5AA4016D5AB38135"), i3);
                        iIntValue2 = ((Integer) objArr[2]).intValue();
                        if (C0389.m5481() > 0) {
                            obj = "ۡۨ";
                            break;
                        } else {
                            C0291.m2568();
                            break;
                        }
                    case 1126:
                        FLYME = new ROMType(CryptoBox.decrypt("CEC9565C412F902B"), i);
                        iIntValue = ((Integer) objArr[1]).intValue();
                        if (C0370.m3284() < 0) {
                            obj = "ۧ۟ۡ";
                            break;
                        } else {
                            C0400.m5961();
                            break;
                        }
                    case 1197:
                        objArr = new Object[7];
                        objArr[3] = new Integer(1048638);
                        if (C0381.m5127() <= 0) {
                            break;
                        } else {
                            obj = "ۥۨۦ";
                            break;
                        }
                    case 3232:
                        OTHER = new ROMType(CryptoBox.decrypt("1AF39A84751305E3"), i8);
                        ROMType[] rOMTypeArr2 = new ROMType[9];
                        if (C0074.m307() < 0) {
                            rOMTypeArr = rOMTypeArr2;
                            obj = "ۢۡۢ";
                            break;
                        } else {
                            rOMTypeArr = rOMTypeArr2;
                            obj = "ۢۧۧ";
                            break;
                        }
                    case 3308:
                        i7 = ((-4688280) & i6) | ((i6 ^ (-1)) & 4688279);
                        SAMSUNG = new ROMType(CryptoBox.decrypt("0DBA781B12DFB91C"), i7);
                        if (C0184.m1524() >= 0) {
                            break;
                        } else {
                            obj = "ۤۧۢ";
                            break;
                        }
                    case 25099:
                        int iIntValue3 = ((Integer) objArr[3]).intValue();
                        i = ((iIntValue3 ^ (-1)) & 1048636) | (iIntValue3 & (-1048637));
                        obj = "ۦ۠ۦ";
                        break;
                    case 27223:
                        rOMTypeArr[i] = FLYME;
                        rOMTypeArr[i2] = COLOR_OS;
                        if (C0228.m2012() <= 0) {
                            break;
                        } else {
                            obj = "۠ۨۨ";
                            break;
                        }
                    case 27241:
                        objArr[2] = new Integer(8080417);
                        objArr[4] = new Integer(5607695);
                        if (C0279.m2491() < 0) {
                            obj = "ۥۦۢ";
                            break;
                        } else {
                            C0389.m5481();
                            obj = "۟ۥۡ";
                            break;
                        }
                    case 27529:
                        int iIntValue4 = ((Integer) objArr[4]).intValue();
                        i5 = ((iIntValue4 ^ (-1)) & 5607689) | (iIntValue4 & (-5607690));
                        obj = "۠ۢ";
                        break;
                    case 28172:
                        EMUI = new ROMType(CryptoBox.decrypt("1E21D241FB2B81CA"), 0);
                        MIUI = new ROMType(CryptoBox.decrypt("A7B0A11A5AA072E5"), 1);
                        if (C0391.m5571() > 0) {
                            obj = "۟۟ۡ";
                            break;
                        } else {
                            C0380.m5068();
                            break;
                        }
                    case 28394:
                        rOMTypeArr[i3] = LETV;
                        rOMTypeArr[i4] = VIVO;
                        if (C0083.m448() >= 0) {
                            break;
                        } else {
                            obj = "ۣۤۥ";
                            break;
                        }
                    case 30601:
                        rOMTypeArr[0] = EMUI;
                        rOMTypeArr[1] = MIUI;
                        if (C0392.m5595() <= 0) {
                            break;
                        } else {
                            obj = "ۡۦۢ";
                            break;
                        }
                    case 30880:
                        return;
                    case 31595:
                        objArr[0] = new Integer(4688272);
                        objArr[6] = new Integer(11849);
                        obj = "۠ۡۧ";
                        break;
                    case 31657:
                        objArr[1] = new Integer(5264839);
                        objArr[5] = new Integer(9329177);
                        obj = "ۡۦۨ";
                        break;
                    case 32588:
                        rOMTypeArr[i5] = _360;
                        rOMTypeArr[i7] = SAMSUNG;
                        if (C0390.m5512() > 0) {
                            obj = "ۧۢۦ";
                            break;
                        } else {
                            obj = "ۢۢۥ";
                            break;
                        }
                    case 32693:
                        int iIntValue5 = ((Integer) objArr[6]).intValue();
                        i8 = ((iIntValue5 ^ (-1)) & 11841) | (iIntValue5 & (-11842));
                        if (C0088.m573() <= 0) {
                            break;
                        } else {
                            obj = "ۨۦۨ";
                            break;
                        }
                    case 1710344:
                        _360 = new ROMType(CryptoBox.decrypt("6421234A1B7D138D"), i5);
                        int iIntValue6 = ((Integer) objArr[0]).intValue();
                        if (C0395.m5698() < 0) {
                            i6 = iIntValue6;
                            obj = "ۨۨۦ";
                            break;
                        } else {
                            C0082.m410();
                            i6 = iIntValue6;
                            obj = "ۤۢۤ";
                            break;
                        }
                    case 1710381:
                        i4 = ((-8080421) & iIntValue2) | ((iIntValue2 ^ (-1)) & 8080420);
                        VIVO = new ROMType(CryptoBox.decrypt("0AF43215CF70F0D7"), i4);
                        if (C0086.m500() > 0) {
                            obj = "ۡ۟ۡ";
                            break;
                        } else {
                            C0378.m4998();
                            break;
                        }
                    case 1710519:
                        if (C0083.m448() >= 0) {
                            break;
                        } else {
                            obj = "ۦۣۢ";
                            break;
                        }
                    case 1710548:
                        int iIntValue7 = ((Integer) objArr[5]).intValue();
                        i3 = ((iIntValue7 ^ (-1)) & 9329181) | (iIntValue7 & (-9329182));
                        obj = "ۧۥۢ";
                        break;
                }
            }
        }

        private ROMType(String str, int i) {
        }

        public static ROMType valueOf(String str) {
            return (ROMType) Enum.valueOf(ROMType.class, str);
        }

        public static ROMType[] values() {
            return (ROMType[]) $VALUES.clone();
        }
    }

    /* renamed from: ̗̖̖̙̗̙, reason: not valid java name and contains not printable characters */
    public static boolean m902() {
        return C0089.m629(C0384.m5244(), C0385.m5310(C0346.m3037()));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a1 A[SYNTHETIC] */
    /* renamed from: ̗̖̙̖̖̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m903() {
        /*
            r4 = 1
            r2 = 0
            java.lang.String r0 = "ۥۧ"
            r1 = r2
            r3 = r2
            r5 = r2
        L7:
            int r6 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r7 = 1750748(0x1ab6dc, float:2.45332E-39)
            r6 = r6 ^ r7
            switch(r6) {
                case 1048: goto L13;
                case 1534: goto L2b;
                case 4357: goto L1c;
                case 4446: goto L65;
                case 4454: goto L34;
                case 4477: goto L52;
                case 4578: goto Lac;
                case 4601: goto L4b;
                case 6238: goto L88;
                case 6267: goto L9b;
                case 7225: goto L84;
                case 30491: goto L13;
                case 32273: goto Lbf;
                case 32542: goto L56;
                case 1731198: goto L74;
                default: goto L12;
            }
        L12:
            goto L7
        L13:
            int r0 = com.cloudinject.feature.p023.C0334.m2866()
            if (r0 > 0) goto Lbb
            java.lang.String r0 = "ۣۤۢ"
            goto L7
        L1c:
            int r0 = android.net.wifi.C0078.m361()
            if (r0 > 0) goto L28
            mirrorb.com.android.internal.C0398.m5833()
            java.lang.String r0 = "۠ۢ۟"
            goto L7
        L28:
            java.lang.String r0 = "۟ۤۦ"
            goto L7
        L2b:
            int r6 = mirrorb.android.app.servertransaction.C0378.m4998()
            if (r6 <= 0) goto L7
            java.lang.String r0 = "ۣۢۥ"
            goto L7
        L34:
            int r0 = mirrorb.android.net.wifi.C0388.m5428()
            r6 = 27
            if (r0 < r6) goto L9b
            int r0 = mirrorb.android.hardware.fingerprint.C0382.m5180()
            if (r0 > 0) goto L48
            p027.p028.p029.C0420.m6215()
            java.lang.String r0 = "ۦۣۡ"
            goto L7
        L48:
            java.lang.String r0 = "ۣ۟ۦ"
            goto L7
        L4b:
            r0 = 28
            if (r5 >= r0) goto L13
            java.lang.String r0 = "۟ۥ۠"
            goto L7
        L52:
            java.lang.String r0 = "ۨ۟ۤ"
            r1 = r2
            goto L7
        L56:
            int r3 = com.cloudinject.customview.C0183.m1464()
            if (r3 > 0) goto L61
            mirrorb.android.net.wifi.C0388.m5430()
            r3 = r4
            goto L7
        L61:
            java.lang.String r0 = "۠۠ۥ"
            r3 = r4
            goto L7
        L65:
            int r6 = mirrorb.android.hardware.location.C0383.m5194()
            if (r6 != r4) goto L9b
            int r6 = mirrorb.android.app.servertransaction.C0378.m4998()
            if (r6 <= 0) goto L7
            java.lang.String r0 = "ۡ۟۠"
            goto L7
        L74:
            int r5 = mirrorb.android.net.wifi.C0388.m5428()
            int r0 = mirrorb.android.providers.C0391.m5571()
            if (r0 > 0) goto L81
            java.lang.String r0 = "ۧۡۦ"
            goto L7
        L81:
            java.lang.String r0 = "ۨۧۡ"
            goto L7
        L84:
            java.lang.String r0 = "۟۠ۦ"
            r1 = r3
            goto L7
        L88:
            int r0 = mirrorb.android.accounts.C0375.m4840()
            if (r0 < 0) goto L96
            mirrorb.android.os.mount.C0390.m5512()
            java.lang.String r0 = "ۥۣۤ"
            r1 = r3
            goto L7
        L96:
            java.lang.String r0 = "ۢۦۦ"
            r1 = r3
            goto L7
        L9b:
            int r0 = mirrorb.java.lang.C0400.m5961()
            if (r0 > 0) goto La8
            mirrorb.com.android.internal.view.C0397.m5814()
            java.lang.String r0 = "ۣۧۤ"
            goto L7
        La8:
            java.lang.String r0 = "۟ۦ۠"
            goto L7
        Lac:
            int r6 = mirrorb.android.app.servertransaction.C0378.m4998()
            if (r6 > 0) goto Lb7
            com.cloudinject.core.p009.p012.C0164.m1359()
            goto L7
        Lb7:
            java.lang.String r0 = "ۥۧ"
            goto L7
        Lbb:
            java.lang.String r0 = "ۨ۟ۤ"
            goto L7
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.BuildCompat.m903():boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cd A[SYNTHETIC] */
    /* renamed from: ̗̖̙̖̖̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m904() {
        /*
            r4 = 1
            r2 = 0
            java.lang.String r0 = "ۤۧۧ"
            r1 = r2
            r3 = r2
            r5 = r2
        L7:
            int r6 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r7 = 1748800(0x1aaf40, float:2.450591E-39)
            r6 = r6 ^ r7
            switch(r6) {
                case 31: goto L13;
                case 1057: goto L97;
                case 1118: goto L1c;
                case 1175: goto La8;
                case 2054: goto L48;
                case 4747: goto Ld1;
                case 5508: goto L38;
                case 6595: goto L57;
                case 6596: goto Lbd;
                case 7582: goto L71;
                case 26306: goto Lc7;
                case 27910: goto Lbd;
                case 28364: goto L2f;
                case 1733626: goto L60;
                case 1733628: goto L80;
                default: goto L12;
            }
        L12:
            goto L7
        L13:
            int r0 = com.cloudinject.feature.p018.C0228.m2012()
            if (r0 > 0) goto Lb9
            java.lang.String r0 = "ۨۨۡ"
            goto L7
        L1c:
            r6 = 24
            if (r5 >= r6) goto Lbd
            int r0 = com.sadfxg.fasg.C0370.m3284()
            if (r0 < 0) goto L2c
            com.px.C0368.m3171()
            java.lang.String r0 = "ۡ۟ۥ"
            goto L7
        L2c:
            java.lang.String r0 = "ۦۢ"
            goto L7
        L2f:
            int r6 = mirrorb.android.hardware.location.C0383.m5194()
            if (r6 != r4) goto Lc7
            java.lang.String r0 = "ۢۤ۠"
            goto L7
        L38:
            int r5 = mirrorb.android.net.wifi.C0388.m5428()
            int r0 = com.cloudinject.feature.p023.C0334.m2866()
            if (r0 > 0) goto L45
            java.lang.String r0 = "۠ۡ۠"
            goto L7
        L45:
            java.lang.String r0 = "۟ۡۨ"
            goto L7
        L48:
            int r3 = mirrorb.com.android.internal.view.C0397.m5814()
            if (r3 > 0) goto L53
            com.cloudinject.p025.p026.C0346.m3059()
            r3 = r4
            goto L7
        L53:
            java.lang.String r0 = "۠ۤۥ"
            r3 = r4
            goto L7
        L57:
            int r6 = android.net.C0082.m410()
            if (r6 >= 0) goto L7
            java.lang.String r0 = "ۦ۠"
            goto L7
        L60:
            int r0 = mirrorb.android.content.res.C0379.m5056()
            if (r0 > 0) goto L6d
            com.cloudinject.feature.p023.C0334.m2866()
            java.lang.String r0 = "ۥۡۨ"
            r1 = r2
            goto L7
        L6d:
            java.lang.String r0 = "ۥۡۧ"
            r1 = r2
            goto L7
        L71:
            int r1 = mirrorb.android.media.session.C0386.m5322()
            if (r1 > 0) goto L7c
            androidx.core.p007.C0088.m573()
            r1 = r3
            goto L7
        L7c:
            java.lang.String r0 = "۠ۨ۟"
            r1 = r3
            goto L7
        L80:
            int r6 = mirrorb.android.net.wifi.C0388.m5428()
            r7 = 23
            if (r6 < r7) goto Lc7
            int r6 = mirrorb.android.hardware.location.C0383.m5203()
            if (r6 > 0) goto L93
            mirrorb.android.net.wifi.C0388.m5430()
            goto L7
        L93:
            java.lang.String r0 = "ۦۡۧ"
            goto L7
        L97:
            int r1 = android.net.wifi.C0078.m361()
            if (r1 > 0) goto La3
            com.sadfxg.fasg.C0370.m3284()
            r1 = r3
            goto L7
        La3:
            java.lang.String r0 = "۠ۢ۠"
            r1 = r3
            goto L7
        La8:
            int r0 = com.cloudinject.feature.p021.p022.C0279.m2491()
            if (r0 < 0) goto Lb5
            mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            java.lang.String r0 = "ۣۦۡ"
            goto L7
        Lb5:
            java.lang.String r0 = "ۣۣۤ"
            goto L7
        Lb9:
            java.lang.String r0 = "ۤۧۧ"
            goto L7
        Lbd:
            int r6 = mirrorb.android.hardware.location.C0383.m5203()
            if (r6 <= 0) goto L7
            java.lang.String r0 = "ۥۡۧ"
            goto L7
        Lc7:
            int r6 = mirrorb.android.hardware.fingerprint.C0381.m5127()
            if (r6 <= 0) goto L7
            java.lang.String r0 = "ۣۣۣ"
            goto L7
        Ld1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.BuildCompat.m904():boolean");
    }

    /* renamed from: ̗̖̙̖̖̙, reason: not valid java name and contains not printable characters */
    public static boolean m905() {
        String str = "ۧ۟ۨ";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748736) {
                case 394:
                    if (C0392.m5595() <= 0) {
                        C0206.m1807();
                        z = false;
                    } else {
                        str = "ۣۤۡ";
                        z = false;
                        continue;
                    }
                case 1475:
                    break;
                case 4391:
                case 7521:
                    if (C0384.m5278() > 0) {
                        str = "ۣۤۡ";
                    } else {
                        continue;
                    }
                case 5442:
                    return z;
                case 6498:
                    if (C0155.m1294() >= 0) {
                        str = "ۥۣۣ";
                    } else {
                        str = "ۥۤۦ";
                        continue;
                    }
                case 7498:
                    z2 = true;
                    if (C0390.m5512() <= 0) {
                        str = "ۥۡۤ";
                    } else {
                        str = "ۡ۟";
                        continue;
                    }
                case 27152:
                    if (C0388.m5428() < 23) {
                        break;
                    } else {
                        str = "ۢ۟ۧ";
                    }
                case 27910:
                    if (C0380.m5068() <= 0) {
                        C0385.m5282();
                    } else {
                        str = "ۡ۟ۨ";
                        continue;
                    }
                case 28392:
                    if (C0191.m1627() < 0) {
                        str = "ۧ۟ۨ";
                    } else {
                        continue;
                    }
                case 1733406:
                    if (C0396.m5741() >= 0) {
                        C0420.m6215();
                        str = "ۦۣ۠";
                        z = z2;
                    } else {
                        str = "ۣۢۡ";
                        z = z2;
                        continue;
                    }
            }
            if (C0183.m1464() <= 0) {
                C0386.m5322();
                str = "ۦۣ۠";
            } else {
                str = "ۦۥۥ";
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0009 A[SYNTHETIC] */
    /* renamed from: ̗̖̙̗̙̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m906() {
        /*
            r5 = 1
            r2 = 0
            r1 = 0
            java.lang.String r0 = "ۧۧۥ"
            r4 = r1
            r3 = r2
            r6 = r2
            r1 = r2
        L9:
            int r7 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r8 = 1753483(0x1ac18b, float:2.457153E-39)
            r7 = r7 ^ r8
            switch(r7) {
                case 34: goto L15;
                case 971: goto L9d;
                case 1934: goto L83;
                case 2255: goto Lbb;
                case 26133: goto L2a;
                case 26162: goto Lbb;
                case 26351: goto L33;
                case 27154: goto L1f;
                case 28462: goto Lc9;
                case 30518: goto La1;
                case 30831: goto L9c;
                case 31529: goto L69;
                case 31540: goto Lbf;
                case 31715: goto L50;
                case 31746: goto L9b;
                case 31747: goto La6;
                case 32744: goto L44;
                default: goto L14;
            }
        L14:
            goto L9
        L15:
            int r7 = com.cloudinject.feature.p018.C0229.m2064()
            if (r7 < 0) goto Lb7
            com.cloudinject.customview.C0184.m1524()
            goto L9
        L1f:
            if (r6 == 0) goto Lbf
            int r7 = mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            if (r7 >= 0) goto L9
            java.lang.String r0 = "ۥۣ۟"
            goto L9
        L2a:
            int r7 = mirrorb.android.app.admin.C0377.m4944()
            if (r7 <= 0) goto L9
            java.lang.String r0 = "ۣۨ۟"
            goto L9
        L33:
            int r0 = androidx.core.p007.C0089.m592()
            if (r0 > 0) goto L40
            android.arch.p003.p005.C0060.m216()
            java.lang.String r0 = "ۧ۟ۨ"
            r3 = r5
            goto L9
        L40:
            java.lang.String r0 = "۠ۦ۟"
            r3 = r5
            goto L9
        L44:
            int r1 = com.cloudinject.core.p009.p011.C0155.m1294()
            if (r1 < 0) goto L4c
            r1 = r2
            goto L9
        L4c:
            java.lang.String r0 = "ۤ۠۠"
            r1 = r2
            goto L9
        L50:
            java.lang.String r4 = mirrorb.com.android.internal.view.inputmethod.C0396.m5759()
            java.lang.String r4 = mirrorb.android.location.C0385.m5310(r4)
            java.lang.String r4 = com.sadfxg.fasg.C0370.m3314(r4)
            int r7 = mirrorb.android.content.res.C0379.m5056()
            if (r7 > 0) goto L66
            android.database.C0073.m265()
            goto L9
        L66:
            java.lang.String r0 = "ۥ۟ۢ"
            goto L9
        L69:
            java.lang.String r7 = mirrorb.android.media.session.C0386.m5332()
            java.lang.String r7 = mirrorb.android.location.C0385.m5310(r7)
            boolean r7 = com.cloudinject.feature.p021.p022.C0279.m2475(r4, r7)
            if (r7 == 0) goto L15
            int r0 = mirrorb.android.util.C0393.m5668()
            if (r0 > 0) goto L80
            java.lang.String r0 = "ۢ۟ۧ"
            goto L9
        L80:
            java.lang.String r0 = "ۣۥ۟"
            goto L9
        L83:
            java.lang.String r0 = com.cloudinject.p025.C0362.m3102()
            java.lang.String r0 = android.database.C0073.m252(r0)
            java.lang.String r6 = com.cloudinject.core.utils.compat.C0121.m993()
            java.lang.String r6 = mirrorb.android.location.C0385.m5310(r6)
            boolean r6 = mirrorb.android.content.C0380.m5096(r0, r6)
            java.lang.String r0 = "۟ۢۧ"
            goto L9
        L9b:
            r1 = r5
        L9c:
            return r1
        L9d:
            java.lang.String r0 = "ۥۦۤ"
            goto L9
        La1:
            java.lang.String r0 = "ۣ۟ۤ"
            r1 = r3
            goto L9
        La6:
            if (r4 == 0) goto L15
            int r7 = com.px.C0368.m3171()
            if (r7 < 0) goto Lb3
            mirrorb.com.android.internal.app.C0394.m5672()
            goto L9
        Lb3:
            java.lang.String r0 = "ۤۦۤ"
            goto L9
        Lb7:
            java.lang.String r0 = "ۦۧۡ"
            goto L9
        Lbb:
            java.lang.String r0 = "ۤ۠۠"
            goto L9
        Lbf:
            int r7 = com.cloudinject.core.p009.p011.C0155.m1294()
            if (r7 >= 0) goto L9
            java.lang.String r0 = "ۤۤۨ"
            goto L9
        Lc9:
            java.lang.String r0 = "ۧۧۥ"
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.BuildCompat.m906():boolean");
    }

    /* renamed from: ̗̖̙̗̙̗, reason: not valid java name and contains not printable characters */
    public static boolean m907() {
        return C0388.m5436(C0385.m5310(C0362.m3099()));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a2 A[SYNTHETIC] */
    /* renamed from: ̗̖̙̙̖̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m908() {
        /*
            r4 = 1
            r2 = 0
            java.lang.String r0 = "ۧۥۡ"
            r1 = r2
            r3 = r2
            r5 = r2
        L7:
            int r6 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r7 = 56450(0xdc82, float:7.9103E-41)
            r6 = r6 ^ r7
            switch(r6) {
                case 30: goto L13;
                case 66: goto L66;
                case 121: goto L41;
                case 1710401: goto L53;
                case 1730050: goto L31;
                case 1730108: goto L2d;
                case 1731487: goto Laa;
                case 1732132: goto Lb4;
                case 1732138: goto L1f;
                case 1732296: goto Laa;
                case 1732323: goto L80;
                case 1732572: goto L3a;
                case 1733624: goto L71;
                case 1734458: goto L8d;
                case 1735523: goto L9c;
                default: goto L12;
            }
        L12:
            goto L7
        L13:
            int r0 = mirrorb.android.location.C0385.m5282()
            if (r0 < 0) goto L7d
            mirrorb.android.hardware.location.C0383.m5203()
            java.lang.String r0 = "ۧ۟"
            goto L7
        L1f:
            int r0 = androidx.core.graphics.drawable.C0086.m500()
            if (r0 > 0) goto L29
            java.lang.String r0 = "ۧۦۤ"
            r1 = r3
            goto L7
        L29:
            java.lang.String r0 = "ۢۨۤ"
            r1 = r3
            goto L7
        L2d:
            java.lang.String r0 = "ۢۢۦ"
            r1 = r2
            goto L7
        L31:
            int r6 = mirrorb.com.android.internal.view.C0397.m5814()
            if (r6 <= 0) goto L7
            java.lang.String r0 = "ۤۧۡ"
            goto L7
        L3a:
            r6 = 29
            if (r5 >= r6) goto Laa
            java.lang.String r0 = "ۦۦ"
            goto L7
        L41:
            int r0 = mirrorb.android.hardware.location.C0383.m5194()
            if (r0 != r4) goto L9c
            int r0 = mirrorb.android.util.C0393.m5668()
            if (r0 > 0) goto L50
            java.lang.String r0 = "ۦۧۨ"
            goto L7
        L50:
            java.lang.String r0 = "ۢ۠۟"
            goto L7
        L53:
            int r5 = mirrorb.android.net.wifi.C0388.m5428()
            int r0 = com.cloudinject.core.p009.p012.C0164.m1359()
            if (r0 < 0) goto L63
            mirrorb.android.providers.C0391.m5571()
            java.lang.String r0 = "ۢۧ"
            goto L7
        L63:
            java.lang.String r0 = "ۡۧ۠"
            goto L7
        L66:
            int r0 = mirrorb.android.net.wifi.C0388.m5428()
            r6 = 28
            if (r0 < r6) goto L9c
            java.lang.String r0 = "ۣۨ"
            goto L7
        L71:
            int r3 = mirrorb.android.os.mount.C0390.m5512()
            if (r3 > 0) goto L79
            r3 = r4
            goto L7
        L79:
            java.lang.String r0 = "ۢۢۨ"
            r3 = r4
            goto L7
        L7d:
            java.lang.String r0 = "ۢ۟ۧ"
            goto L7
        L80:
            int r1 = mirrorb.com.android.internal.view.C0397.m5814()
            if (r1 > 0) goto L88
            r1 = r3
            goto L7
        L88:
            java.lang.String r0 = "ۥۡ"
            r1 = r3
            goto L7
        L8d:
            int r6 = com.cloudinject.feature.p015.C0206.m1807()
            if (r6 < 0) goto L98
            androidx.core.p007.C0089.m592()
            goto L7
        L98:
            java.lang.String r0 = "ۧۥۡ"
            goto L7
        L9c:
            int r0 = com.cloudinject.p025.C0362.m3122()
            if (r0 < 0) goto La6
            java.lang.String r0 = "۟ۧۢ"
            goto L7
        La6:
            java.lang.String r0 = "ۤۥۡ"
            goto L7
        Laa:
            int r6 = mirrorb.com.android.internal.view.C0397.m5814()
            if (r6 <= 0) goto L7
            java.lang.String r0 = "ۢۢۦ"
            goto L7
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.BuildCompat.m908():boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    /* renamed from: ̗̖̙̙̖̙, reason: not valid java name and contains not printable characters */
    public static boolean m909() {
        String str = "ۧۧۦ";
        boolean z = false;
        boolean z2 = false;
        int iM5428 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750633) {
                case 173:
                    str = "ۧۧۦ";
                case 234:
                    str = "ۡۨ۟";
                    z = false;
                case 1260:
                    if (C0388.m5428() < 25) {
                        str = "ۦۨۤ";
                    } else if (C0206.m1807() >= 0) {
                        C0377.m4944();
                    } else {
                        str = "۠ۢۦ";
                    }
                case 1323:
                    str = "۠ۥ۟";
                    z = z2;
                case 2956:
                case 4015:
                    str = "ۡۨ۟";
                case 6641:
                    break;
                case 7443:
                    if (iM5428 >= 26) {
                        str = "ۡۨ۟";
                    } else if (C0398.m5833() > 0) {
                        str = "ۢۡۤ";
                    }
                case 7501:
                    if (C0383.m5194() != 1) {
                        str = "ۦۨۤ";
                    } else if (C0385.m5282() >= 0) {
                        C0086.m500();
                    } else {
                        str = "ۨۧۨ";
                    }
                case 28783:
                    iM5428 = C0388.m5428();
                    str = "ۣۨۧ";
                case 29707:
                    str = "ۣۣۣ";
                case 30607:
                    str = C0380.m5068() <= 0 ? "ۣۢۡ" : "ۤ۟ۡ";
                case 32672:
                    str = "ۦۤۤ";
                    z = z2;
                case 32685:
                    str = "ۢۧۧ";
                    z2 = true;
                case 32694:
                    str = "ۦۨۤ";
            }
            return z;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    /* renamed from: ̗̖̙̙̗̖, reason: not valid java name and contains not printable characters */
    public static boolean m910() {
        String str = "ۧۨۢ";
        boolean z = false;
        boolean z2 = false;
        int iM5428 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56542) {
                case 1709107:
                    break;
                case 1709434:
                    str = "ۣۨ۟";
                    z = z2;
                case 1710847:
                    iM5428 = C0388.m5428();
                    if (C0334.m2866() > 0) {
                        str = "ۢۦۧ";
                    }
                case 1729811:
                    if (C0191.m1627() < 0) {
                        str = "ۧۨۢ";
                    }
                case 1730238:
                    str = "ۣۡۡ";
                case 1731227:
                    if (iM5428 >= 25) {
                        str = "ۨ۠ۥ";
                    } else if (C0381.m5127() > 0) {
                        str = "ۡۡۢ";
                    }
                case 1731524:
                    if (C0393.m5668() > 0) {
                        str = "۟ۦۨ";
                    }
                case 1732547:
                case 1732605:
                    str = "ۣۡۥ";
                    z2 = true;
                case 1733148:
                    str = C0388.m5428() >= 24 ? "۟ۢۨ" : "ۤۤ۠";
                case 1733153:
                    if (C0083.m448() >= 0) {
                        C0380.m5068();
                        z = false;
                    } else {
                        str = "ۨ۠ۥ";
                        z = false;
                    }
                case 1733567:
                case 1735487:
                    str = "ۨ۠ۥ";
                case 1733597:
                    str = "ۣۣۡ";
                    z = z2;
                case 1735611:
                    if (C0383.m5194() == 1) {
                        str = C0086.m500() <= 0 ? "ۡۥ" : "ۨۦۢ";
                    }
            }
            return z;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008e A[SYNTHETIC] */
    /* renamed from: ̗̖̙̙̗̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m911() {
        /*
            r2 = 0
            java.lang.String r0 = "ۡۨۥ"
            r1 = r2
            r3 = r2
        L5:
            int r4 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1747897(0x1aabb9, float:2.449325E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 348: goto L11;
                case 1063: goto L36;
                case 3079: goto L84;
                case 4511: goto L55;
                case 5607: goto L75;
                case 5695: goto L6f;
                case 25119: goto L47;
                case 27057: goto L88;
                case 27067: goto L99;
                case 27155: goto L25;
                case 27383: goto L1b;
                case 28093: goto L88;
                case 28220: goto L6c;
                case 28340: goto L84;
                case 1734464: goto L72;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            int r4 = com.cloudinject.customview.C0183.m1464()
            if (r4 > 0) goto L81
            mirrorb.android.hardware.location.C0383.m5203()
            goto L5
        L1b:
            r1 = 1
            int r4 = mirrorb.android.hardware.location.C0383.m5203()
            if (r4 <= 0) goto L5
            java.lang.String r0 = "ۨۦۤ"
            goto L5
        L25:
            int r0 = com.cloudinject.core.p013.C0179.m1427()
            if (r0 > 0) goto L32
            androidx.core.p007.C0088.m573()
            java.lang.String r0 = "ۥۣۥ"
            r3 = r2
            goto L5
        L32:
            java.lang.String r0 = "ۣۧۡ"
            r3 = r2
            goto L5
        L36:
            java.lang.String r0 = com.cloudinject.feature.p021.C0291.m2572()
            java.lang.String r0 = mirrorb.android.location.C0385.m5310(r0)
            boolean r0 = mirrorb.android.net.wifi.C0388.m5436(r0)
            if (r0 != 0) goto L88
            java.lang.String r0 = "ۤۢۤ"
            goto L5
        L47:
            int r0 = mirrorb.android.accounts.C0376.m4906()
            if (r0 > 0) goto L51
            java.lang.String r0 = "ۢۤ۟"
            r3 = r1
            goto L5
        L51:
            java.lang.String r0 = "ۦۥۡ"
            r3 = r1
            goto L5
        L55:
            java.lang.String r4 = androidx.core.graphics.drawable.C0086.m487()
            java.lang.String r4 = mirrorb.android.location.C0385.m5310(r4)
            boolean r4 = mirrorb.android.net.wifi.C0388.m5436(r4)
            if (r4 == 0) goto L11
            int r4 = com.cloudinject.core.p009.p012.C0164.m1359()
            if (r4 >= 0) goto L5
            java.lang.String r0 = "ۥ۟۠"
            goto L5
        L6c:
            java.lang.String r0 = "ۧ۟ۥ"
            goto L5
        L6f:
            java.lang.String r0 = "ۦۥۧ"
            goto L5
        L72:
            java.lang.String r0 = "ۦۢۦ"
            goto L5
        L75:
            int r0 = mirrorb.android.os.mount.C0390.m5512()
            if (r0 > 0) goto L7e
            java.lang.String r0 = "ۥۣ۟"
            goto L5
        L7e:
            java.lang.String r0 = "ۡۨۥ"
            goto L5
        L81:
            java.lang.String r0 = "ۨۡ"
            goto L5
        L84:
            java.lang.String r0 = "ۦۥۡ"
            goto L5
        L88:
            int r0 = com.cloudinject.customview.C0184.m1524()
            if (r0 < 0) goto L95
            mirrorb.android.app.admin.C0377.m4944()
            java.lang.String r0 = "ۢ۟ۡ"
            goto L5
        L95:
            java.lang.String r0 = "ۦ۟ۧ"
            goto L5
        L99:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.BuildCompat.m911():boolean");
    }

    /* renamed from: ̗̖̙̙̗̙, reason: not valid java name and contains not printable characters */
    public static boolean m912() {
        String str = "ۨۦۤ";
        boolean z = false;
        String strM3314 = null;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753640) {
                case 2822:
                    if (!C0279.m2475(C0073.m252(strM3314), C0385.m5310(C0392.m5624()))) {
                        break;
                    } else if (C0060.m216() <= 0) {
                        C0394.m5672();
                    } else {
                        str = "ۤۢ۟";
                    }
                case 2854:
                    str = "ۤۢ";
                    continue;
                case 2958:
                    strM3314 = C0370.m3314(C0385.m5310(C0395.m5683()));
                    str = "۠ۤۤ";
                    continue;
                case 2959:
                    return z2;
                case 26922:
                    if (C0009.m36() < 0) {
                        str = "ۤ۠ۧ";
                    } else {
                        continue;
                    }
                case 26952:
                    if (strM3314 == null) {
                        break;
                    } else if (C0009.m36() >= 0) {
                        C0394.m5672();
                    } else {
                        str = "ۨۢۨ";
                    }
                case 27947:
                case 31683:
                    if (C0291.m2568() >= 0) {
                        C0089.m592();
                        str = "۟۠ۡ";
                    } else {
                        str = "ۨۦۥ";
                        continue;
                    }
                case 28083:
                    if (C0009.m36() >= 0) {
                        str = "ۨۥۢ";
                    } else {
                        str = "ۨۦۤ";
                        continue;
                    }
                case 30729:
                    z = true;
                    str = "ۥۦ۠";
                    continue;
                case 31863:
                    if (C0191.m1627() >= 0) {
                        C0362.m3122();
                        z2 = z;
                    } else {
                        str = "ۣ۠ۡ";
                        z2 = z;
                        continue;
                    }
                case 1711702:
                    if (C0121.m1023() >= 0) {
                        C0398.m5833();
                        z2 = false;
                    } else {
                        str = "ۨۦۥ";
                        z2 = false;
                        continue;
                    }
                case 1711912:
                    break;
            }
            str = "ۨۡۧ";
        }
    }

    /* renamed from: ̗̙̖̙̖̙, reason: not valid java name and contains not printable characters */
    public static boolean m913() {
        String str = "ۣ۟ۨ";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56390) {
                case 1709325:
                    if (C0384.m5278() <= 0) {
                        str = "ۧۧۦ";
                        z2 = z;
                    } else {
                        str = "ۤۧۡ";
                        z2 = z;
                        continue;
                    }
                case 1729123:
                    str = "ۣ۟ۨ";
                    continue;
                case 1729923:
                    break;
                case 1730296:
                    return z2;
                case 1733272:
                    str = "۠ۤۡ";
                    z2 = false;
                    continue;
                case 1733724:
                    str = "ۡۢ۟";
                    continue;
                case 1734427:
                    if (C0060.m188(C0385.m5310(C0060.m202()), 0) <= 0) {
                        break;
                    } else {
                        str = "۟ۦۤ";
                    }
                case 1735579:
                    z = true;
                    if (C0377.m4944() > 0) {
                        str = "ۣۨۦ";
                    } else {
                        continue;
                    }
            }
            if (C0368.m3171() < 0) {
                str = "ۤۧۡ";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d4 A[SYNTHETIC] */
    /* renamed from: ̗̙̖̙̗̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m914() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.BuildCompat.m914():boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x015e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x017a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x014f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0002 A[SYNTHETIC] */
    /* renamed from: ̗̙̖̙̗̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.cloudinject.core.utils.compat.BuildCompat.ROMType m915() {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.BuildCompat.m915():com.cloudinject.core.utils.compat.BuildCompat$ROMType");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a6 A[SYNTHETIC] */
    /* renamed from: ̗̙̙̖̗̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m916() {
        /*
            r4 = 1
            r2 = 0
            java.lang.String r0 = "ۢۢۢ"
            r1 = r2
            r3 = r2
            r5 = r2
        L7:
            int r6 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r7 = 1748710(0x1aaee6, float:2.450465E-39)
            r6 = r6 ^ r7
            switch(r6) {
                case 379: goto L13;
                case 1497: goto L14;
                case 4291: goto L4a;
                case 5124: goto L25;
                case 6242: goto L2e;
                case 6348: goto L3f;
                case 6651: goto L31;
                case 7236: goto L56;
                case 7301: goto Laa;
                case 7342: goto L7c;
                case 26373: goto La0;
                case 26476: goto Lb4;
                case 27874: goto L69;
                case 28584: goto La0;
                case 1733144: goto L8f;
                default: goto L12;
            }
        L12:
            goto L7
        L13:
            return r1
        L14:
            int r0 = android.app.C0009.m36()
            if (r0 < 0) goto L21
            android.database.C0074.m307()
            java.lang.String r0 = "ۨۤ"
            r1 = r3
            goto L7
        L21:
            java.lang.String r0 = "ۢ۟ۥ"
            r1 = r3
            goto L7
        L25:
            int r6 = mirrorb.android.app.servertransaction.C0378.m4998()
            if (r6 <= 0) goto L7
            java.lang.String r0 = "ۦ۟ۧ"
            goto L7
        L2e:
            java.lang.String r0 = "ۣۨۢ"
            goto L7
        L31:
            int r0 = mirrorb.android.util.C0393.m5668()
            if (r0 > 0) goto L3b
            java.lang.String r0 = "ۣ۠ۡ"
            r1 = r2
            goto L7
        L3b:
            java.lang.String r0 = "ۡۨۤ"
            r1 = r2
            goto L7
        L3f:
            int r6 = mirrorb.android.net.wifi.C0388.m5428()
            r7 = 30
            if (r6 < r7) goto Lb4
            java.lang.String r0 = "ۦۥۣ"
            goto L7
        L4a:
            int r1 = com.sadfxg.fasg.C0369.m3256()
            if (r1 > 0) goto L52
            r1 = r3
            goto L7
        L52:
            java.lang.String r0 = "ۤۨۦ"
            r1 = r3
            goto L7
        L56:
            int r5 = mirrorb.android.net.wifi.C0388.m5428()
            int r0 = com.cloudinject.feature.p023.C0334.m2866()
            if (r0 > 0) goto L66
            mirrorb.android.net.wifi.C0388.m5430()
            java.lang.String r0 = "ۡۥۡ"
            goto L7
        L66:
            java.lang.String r0 = "ۨۦ"
            goto L7
        L69:
            int r6 = mirrorb.android.hardware.location.C0383.m5194()
            if (r6 != r4) goto Lb4
            int r6 = mirrorb.android.content.C0380.m5068()
            if (r6 > 0) goto L79
            com.cloudinject.feature.model.p014.C0191.m1627()
            goto L7
        L79:
            java.lang.String r0 = "ۥۤۤ"
            goto L7
        L7c:
            r6 = 31
            if (r5 >= r6) goto La0
            int r6 = mirrorb.com.android.internal.view.inputmethod.C0396.m5741()
            if (r6 < 0) goto L8b
            com.cloudinject.feature.p015.C0206.m1807()
            goto L7
        L8b:
            java.lang.String r0 = "ۣ۠ۧ"
            goto L7
        L8f:
            int r3 = mirrorb.com.android.internal.app.C0394.m5672()
            if (r3 > 0) goto L9b
            com.cloudinject.p025.p026.C0346.m3059()
            r3 = r4
            goto L7
        L9b:
            java.lang.String r0 = "ۣ۠ۢ"
            r3 = r4
            goto L7
        La0:
            int r6 = com.cloudinject.p025.C0362.m3122()
            if (r6 >= 0) goto L7
            java.lang.String r0 = "ۡۨۤ"
            goto L7
        Laa:
            int r6 = mirrorb.android.accounts.C0375.m4840()
            if (r6 >= 0) goto L7
            java.lang.String r0 = "ۢۢۢ"
            goto L7
        Lb4:
            int r6 = mirrorb.android.net.wifi.C0388.m5430()
            if (r6 <= 0) goto L7
            java.lang.String r0 = "ۣۣۤ"
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.BuildCompat.m916():boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0098 A[SYNTHETIC] */
    /* renamed from: ̗̙̙̖̗̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m917() {
        /*
            r4 = 1
            r2 = 0
            java.lang.String r0 = "ۡۨۥ"
            r1 = r2
            r3 = r2
            r5 = r2
        L7:
            int r6 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r7 = 1749758(0x1ab2fe, float:2.451933E-39)
            r6 = r6 ^ r7
            switch(r6) {
                case 1142: goto L13;
                case 3323: goto L65;
                case 3928: goto L3e;
                case 5538: goto L16;
                case 7520: goto L29;
                case 7524: goto L62;
                case 7678: goto L83;
                case 28897: goto L69;
                case 29495: goto L53;
                case 30518: goto L92;
                case 30707: goto La1;
                case 31284: goto L7a;
                case 31287: goto L1a;
                case 31737: goto L3a;
                case 1732191: goto L92;
                default: goto L12;
            }
        L12:
            goto L7
        L13:
            java.lang.String r0 = "ۨ۟ۡ"
            goto L7
        L16:
            java.lang.String r0 = "ۡۨۡ"
            r1 = r3
            goto L7
        L1a:
            int r6 = mirrorb.android.hardware.location.C0383.m5194()
            if (r6 != r4) goto L13
            int r6 = mirrorb.android.os.mount.C0390.m5512()
            if (r6 <= 0) goto L7
            java.lang.String r0 = "۟ۢ۟"
            goto L7
        L29:
            int r5 = mirrorb.android.net.wifi.C0388.m5428()
            int r6 = mirrorb.android.app.servertransaction.C0378.m4998()
            if (r6 > 0) goto L37
            mirrorb.android.content.C0380.m5068()
            goto L7
        L37:
            java.lang.String r0 = "ۦۣۦ"
            goto L7
        L3a:
            java.lang.String r0 = "ۧ۟ۥ"
            r1 = r2
            goto L7
        L3e:
            int r6 = mirrorb.android.net.wifi.C0388.m5428()
            r7 = 29
            if (r6 < r7) goto L13
            int r6 = mirrorb.android.net.wifi.C0388.m5430()
            if (r6 > 0) goto L50
            mirrorb.dalvik.system.C0399.m5914()
            goto L7
        L50:
            java.lang.String r0 = "ۨ۟۠"
            goto L7
        L53:
            int r3 = mirrorb.com.android.internal.C0398.m5833()
            if (r3 > 0) goto L5e
            com.px.C0368.m3171()
            r3 = r4
            goto L7
        L5e:
            java.lang.String r0 = "ۥۣۣ"
            r3 = r4
            goto L7
        L62:
            java.lang.String r0 = "ۧۥۦ"
            goto L7
        L65:
            java.lang.String r0 = "ۦۦ۟"
            r1 = r3
            goto L7
        L69:
            r6 = 30
            if (r5 >= r6) goto L92
            int r6 = mirrorb.android.net.wifi.C0387.m5374()
            if (r6 < 0) goto L77
            mirrorb.android.location.C0384.m5278()
            goto L7
        L77:
            java.lang.String r0 = "ۥ۠ۡ"
            goto L7
        L7a:
            int r6 = mirrorb.android.hardware.fingerprint.C0381.m5127()
            if (r6 <= 0) goto L7
            java.lang.String r0 = "ۨۡ۠"
            goto L7
        L83:
            int r6 = p027.p028.p029.C0420.m6215()
            if (r6 < 0) goto L8e
            android.database.C0073.m265()
            goto L7
        L8e:
            java.lang.String r0 = "ۡۨۥ"
            goto L7
        L92:
            int r6 = com.cloudinject.feature.p023.C0334.m2866()
            if (r6 > 0) goto L9d
            mirrorb.dalvik.system.C0399.m5914()
            goto L7
        L9d:
            java.lang.String r0 = "ۧ۟ۥ"
            goto L7
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.compat.BuildCompat.m917():boolean");
    }

    /* renamed from: ̗̙̙̖̗̙, reason: not valid java name and contains not printable characters */
    public static boolean m918() {
        return C0279.m2475(C0191.m1629(C0362.m3102()), C0385.m5310(C0164.m1372()));
    }

    /* renamed from: ̗̙̙̙̗̖, reason: not valid java name and contains not printable characters */
    public static int m919() {
        String str = "ۦۢۥ";
        int iM5194 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755371) {
                case 265:
                    if (C0393.m5668() > 0) {
                        str = "ۦۢۥ";
                    } else {
                        continue;
                    }
                case 2370:
                    if (C0388.m5428() < 23) {
                        break;
                    } else if (C0380.m5068() > 0) {
                        str = "ۤ۠۠";
                    }
                case 3491:
                case 28629:
                    break;
                case 24816:
                    if (C0399.m5914() <= 0) {
                        C0229.m2064();
                        str = "ۡ۟ۢ";
                    } else {
                        str = "ۥۡۡ";
                        continue;
                    }
                case 26186:
                    return 0;
                case 28943:
                    try {
                        iM5194 = C0383.m5194();
                        str = "ۥۡۡ";
                        continue;
                    } catch (Throwable th) {
                        if (C0191.m1627() >= 0) {
                            C0379.m5056();
                            str = "ۦۦۢ";
                        } else {
                            str = "۟ۡ۠";
                        }
                    }
                case 29998:
                    return iM5194;
                case 31658:
                    str = "ۤ۠۠";
                    continue;
            }
            str = "ۡ۠۠";
        }
    }

    /* renamed from: ̗̙̙̙̗̗, reason: not valid java name and contains not printable characters */
    public static boolean m920() {
        String str = "ۢۥ۟";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750722) {
                case 68:
                case 29543:
                    if (C0279.m2491() < 0) {
                        str = "ۨۥۢ";
                    } else {
                        continue;
                    }
                case 1086:
                    if (C0388.m5428() < 21) {
                        break;
                    } else {
                        str = "ۤ۠ۢ";
                    }
                case 1191:
                    str = "ۢۥ۟";
                    continue;
                case 2826:
                    if (C0388.m5430() <= 0) {
                        C0088.m573();
                        str = "ۧۢۦ";
                    } else {
                        str = "ۤۢۢ";
                        continue;
                    }
                case 3075:
                    str = "ۣ۠";
                    z = z2;
                    continue;
                case 3302:
                    if (C0383.m5203() <= 0) {
                        C0335.m2923();
                        z = false;
                    } else {
                        str = "ۨۥۢ";
                        z = false;
                        continue;
                    }
                case 3876:
                    z2 = true;
                    if (C0375.m4840() >= 0) {
                        str = "ۢۢۥ";
                    } else {
                        str = "ۤۧۤ";
                        continue;
                    }
                case 29898:
                    break;
                case 32583:
                    return z;
                case 1731231:
                    if (C0420.m6215() >= 0) {
                        C0375.m4840();
                    } else {
                        str = "ۧۤۢ";
                        continue;
                    }
            }
            if (C0389.m5481() <= 0) {
                C0368.m3171();
                str = "۟ۧ۠";
            } else {
                str = "ۥۡۤ";
            }
        }
    }

    /* renamed from: ۨ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static ROMType m921() {
        String str = "۟۠۠";
        ROMType rOMType = null;
        ROMType rOMType2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748671) {
                case 25:
                    if (C0183.m1464() <= 0) {
                        rOMType = null;
                    } else {
                        str = "ۨۢۤ";
                        rOMType = null;
                        continue;
                    }
                case 88:
                    if (C0089.m592() <= 0) {
                        rOMType = rOMType2;
                    } else {
                        str = "ۦۧۤ";
                        rOMType = rOMType2;
                        continue;
                    }
                case 410:
                case 28536:
                    if (C0420.m6215() >= 0) {
                        str = "ۦۣۣ";
                    } else {
                        str = "ۦۧۤ";
                        continue;
                    }
                case 1699:
                    rOMType2 = f170;
                    if (C0394.m5672() > 0) {
                        str = "ۡۢۨ";
                    } else {
                        continue;
                    }
                case 2374:
                    if (C0396.m5741() >= 0) {
                        C0377.m4944();
                    } else {
                        str = "۟۠۠";
                        continue;
                    }
                case 2464:
                    if (C0369.m3256() < 0) {
                        break;
                    } else {
                        str = "۟ۨۥ";
                    }
                case 26517:
                    if (C0279.m2491() >= 0) {
                        C0400.m5961();
                    } else {
                        str = "ۡۤۨ";
                        continue;
                    }
                case 27610:
                    break;
                case 27900:
                    return rOMType;
                case 1733272:
                    if (C0228.m2012() <= 0) {
                        str = "ۡ۠ۨ";
                    } else {
                        str = "ۡ۠ۥ";
                        continue;
                    }
            }
            if (C0191.m1627() >= 0) {
                C0381.m5127();
            } else {
                str = "ۡۨ";
            }
        }
    }
}
