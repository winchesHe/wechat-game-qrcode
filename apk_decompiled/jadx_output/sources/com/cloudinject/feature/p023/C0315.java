package com.cloudinject.feature.p023;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.database.C0074;
import android.net.wifi.C0078;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.p025.C0362;
import com.px.C0368;
import com.sadfxg.fasg.C0370;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;

/* renamed from: com.cloudinject.feature.̙̙.̗̗, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0315 {

    /* renamed from: ̗̗̖̙̖̙̗, reason: not valid java name and contains not printable characters */
    private static final String f549 = "default_secret_key";

    /* renamed from: ̗̗̖̖̙̙̗, reason: not valid java name and contains not printable characters */
    private Cipher f550;

    /* renamed from: ̗̗̙̙̙̙̙, reason: not valid java name and contains not printable characters */
    private Cipher f551;

    public C0315() {
        this(C0385.m5310(C0362.m3132()));
    }

    public C0315(String str) throws Exception {
        Integer num = new Integer(4256539);
        String strM5310 = C0385.m5310(C0399.m5895());
        int iIntValue = 0;
        Cipher cipher = null;
        Key keyM2784 = null;
        Object obj = "ۤۡۨ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1752615) {
                case 162:
                    try {
                        iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                        if (C0390.m5512() > 0) {
                            obj = "۟۟ۨ";
                            break;
                        } else {
                            C0078.m361();
                            break;
                        }
                    } catch (Exception e) {
                        obj = "۟۟۠";
                        break;
                    }
                case 1068:
                    this.f551 = null;
                    if (C0384.m5278() > 0) {
                        obj = "ۡۥۥ";
                        break;
                    } else {
                        C0393.m5668();
                        break;
                    }
                case 3247:
                    C0387.m5405(m2782(this), 1, keyM2784);
                    if (C0184.m1524() < 0) {
                        obj = "۟ۤۨ";
                        break;
                    } else {
                        C0334.m2866();
                        break;
                    }
                case 3296:
                    return;
                case 3388:
                    this.f551 = C0179.m1435(strM5310);
                    if (C0398.m5833() > 0) {
                        obj = "ۢۡۧ";
                        break;
                    } else {
                        obj = "ۣۡ۟";
                        break;
                    }
                case 4231:
                    Cipher cipherM2783 = m2783(this);
                    if (C0398.m5833() > 0) {
                        cipher = cipherM2783;
                        obj = "ۥۧۧ";
                        break;
                    } else {
                        cipher = cipherM2783;
                        obj = "ۦۡۡ";
                        break;
                    }
                case 4454:
                    this.f550 = null;
                    obj = "۠۟ۦ";
                    break;
                case 5344:
                    keyM2784 = m2784(this, C0391.m5538(str));
                    obj = "ۢۦ۟";
                    break;
                case 6439:
                case 1729176:
                    if (C0368.m3171() >= 0) {
                        break;
                    } else {
                        obj = "ۣۢۨ";
                        break;
                    }
                case 6447:
                    C0387.m5405(cipher, ((iIntValue ^ (-1)) & 4256537) | ((-4256538) & iIntValue), keyM2784);
                    if (C0400.m5961() > 0) {
                        obj = "ۣۢۨ";
                        break;
                    } else {
                        C0025.m118();
                        break;
                    }
                case 6532:
                    this.f550 = C0179.m1435(strM5310);
                    obj = "ۡ۠۟";
                    break;
                case 30509:
                    if (C0398.m5833() > 0) {
                        obj = "ۤۡۨ";
                        break;
                    } else {
                        C0382.m5180();
                        obj = "ۦۣۨ";
                        break;
                    }
                case 31815:
                    if (C0279.m2491() < 0) {
                        obj = "۠۟ۦ";
                        break;
                    } else {
                        C0391.m5571();
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String decode(java.lang.String r7, java.lang.String r8) {
        /*
            r1 = 0
            r2 = 0
            java.lang.String r0 = "ۣۣۢ"
            r3 = r1
            r4 = r2
            r2 = r1
        L7:
            int r5 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r6 = 1748893(0x1aaf9d, float:2.450721E-39)
            r5 = r5 ^ r6
            switch(r5) {
                case 31: goto L13;
                case 1092: goto L3c;
                case 2051: goto L94;
                case 5531: goto L2d;
                case 5562: goto L32;
                case 6431: goto L56;
                case 6552: goto L73;
                case 7549: goto L3a;
                case 26238: goto L16;
                case 27033: goto La7;
                case 27159: goto L67;
                case 27285: goto L73;
                case 28213: goto L3b;
                case 28369: goto L43;
                case 1733277: goto La3;
                default: goto L12;
            }
        L12:
            goto L7
        L13:
            java.lang.String r0 = "ۧ۟۠"
            goto L7
        L16:
            java.lang.String r5 = com.cloudinject.core.utils.compat.C0121.m1001()
            java.lang.String r5 = mirrorb.android.location.C0385.m5310(r5)
            boolean r5 = mirrorb.android.content.C0380.m5096(r8, r5)
            if (r5 == 0) goto La3
            int r5 = mirrorb.com.android.internal.content.C0395.m5698()
            if (r5 >= 0) goto L7
            java.lang.String r0 = "ۡۧۨ"
            goto L7
        L2d:
            if (r4 != 0) goto L73
            java.lang.String r0 = "ۣۨۨ"
            goto L7
        L32:
            com.cloudinject.feature.̙̙.̗̗ r2 = new com.cloudinject.feature.̙̙.̗̗
            r2.<init>(r7)
            java.lang.String r0 = "۠ۨۡ"
            goto L7
        L3a:
            r1 = r3
        L3b:
            return r1
        L3c:
            java.lang.String r1 = mirrorb.android.accounts.C0376.m4888(r2, r8)     // Catch: java.lang.Exception -> L7f
            java.lang.String r0 = "ۦۢۤ"
            goto L7
        L43:
            java.lang.String r3 = mirrorb.android.hardware.location.C0383.m5220()
            int r0 = android.net.wifi.C0078.m361()
            if (r0 > 0) goto L53
            mirrorb.android.app.servertransaction.C0378.m4998()
            java.lang.String r0 = "ۥۦۥ"
            goto L7
        L53:
            java.lang.String r0 = "ۣۤۡ"
            goto L7
        L56:
            boolean r4 = com.cloudinject.core.p009.p012.C0164.m1363(r8)
            int r5 = mirrorb.com.android.internal.view.C0397.m5814()
            if (r5 > 0) goto L64
            android.arch.p003.p005.C0060.m216()
            goto L7
        L64:
            java.lang.String r0 = "ۦ۟ۥ"
            goto L7
        L67:
            int r0 = mirrorb.android.os.mount.C0390.m5512()
            if (r0 > 0) goto L70
            java.lang.String r0 = "ۤۦ"
            goto L7
        L70:
            java.lang.String r0 = "۠ۨۡ"
            goto L7
        L73:
            int r0 = mirrorb.android.net.wifi.C0387.m5374()
            if (r0 < 0) goto L7c
            java.lang.String r0 = "ۤۡۨ"
            goto L7
        L7c:
            java.lang.String r0 = "ۢۤۢ"
            goto L7
        L7f:
            r0 = move-exception
            android.net.wifi.C0078.m344(r0)
            int r0 = mirrorb.android.media.session.C0386.m5322()
            if (r0 > 0) goto L90
            androidx.core.p007.C0088.m573()
            java.lang.String r0 = "ۥۧۤ"
            goto L7
        L90:
            java.lang.String r0 = "ۣ۟ۡ"
            goto L7
        L94:
            int r5 = mirrorb.com.android.internal.view.C0397.m5814()
            if (r5 > 0) goto L9f
            com.cloudinject.customview.C0183.m1464()
            goto L7
        L9f:
            java.lang.String r0 = "ۣۣۢ"
            goto L7
        La3:
            java.lang.String r0 = "ۤۢۥ"
            goto L7
        La7:
            int r5 = com.cloudinject.core.p009.p012.C0164.m1359()
            if (r5 >= 0) goto L7
            java.lang.String r0 = "ۦۢۤ"
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.C0315.decode(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    private Key m2779(byte[] bArr) throws Exception {
        String str = "ۥۤۦ";
        int i = 0;
        byte[] bArr2 = null;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754567) {
                case 1991:
                case 2008:
                    if (C0387.m5374() < 0) {
                        str = "ۥۦ";
                    } else {
                        continue;
                    }
                case 3203:
                    bArr2[i] = bArr[i];
                    str = "ۢۢۥ";
                    continue;
                case 28283:
                    return new SecretKeySpec(bArr2, C0385.m5310(C0399.m5895()));
                case 28290:
                    str = "ۤۦۢ";
                    continue;
                case 30360:
                    str = "ۥۤۦ";
                    continue;
                case 30406:
                    if (i >= bArr2.length) {
                        break;
                    } else if (C0368.m3171() >= 0) {
                        C0191.m1627();
                    } else {
                        str = "ۣۨ۟";
                    }
                case 30424:
                    if (C0060.m216() <= 0) {
                        str = "ۣۢ۠";
                    } else {
                        str = "ۦۥ۟";
                        continue;
                    }
                case 30562:
                    i2 = 0 - ((0 - i) - 1);
                    if (C0389.m5481() <= 0) {
                        str = "ۢ۠ۢ";
                    } else {
                        str = "ۤ۠";
                        continue;
                    }
                case 31555:
                    break;
                case 31712:
                    bArr2 = new byte[8];
                    if (C0386.m5322() <= 0) {
                        C0398.m5833();
                        str = "۠ۡ۟";
                    } else {
                        str = "ۣ۠ۨ";
                        continue;
                    }
                case 32615:
                    if (C0379.m5056() <= 0) {
                        str = "ۣۧۤ";
                        i = 0;
                    } else {
                        str = "ۥۦ";
                        i = 0;
                        continue;
                    }
                case 1710438:
                    if (i >= bArr.length) {
                        break;
                    } else if (C0381.m5127() > 0) {
                        str = "ۢۥۤ";
                    }
                case 1710523:
                    if (C0376.m4906() <= 0) {
                        str = "ۣۨۡ";
                        i = i2;
                    } else {
                        str = "ۢۦۣ";
                        i = i2;
                        continue;
                    }
            }
            if (C0086.m500() > 0) {
                str = "ۣ۠ۧ";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object[]] */
    /* renamed from: ̗̖̗, reason: not valid java name and contains not printable characters */
    public static byte[] m2780(String str) throws Exception {
        int i = 0;
        int iIntValue = 0;
        int i2 = 0;
        String str2 = null;
        int iIntValue2 = 0;
        int i3 = 0;
        byte[] bArr = null;
        int length = 0;
        byte[] bArrM5538 = null;
        Integer[] numArr = null;
        Object obj = "ۥۢۨ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1747905) {
                case 97:
                    if (C0074.m307() >= 0) {
                        C0397.m5814();
                        obj = "ۥۤۤ";
                    } else {
                        obj = "ۥۡۤ";
                        continue;
                    }
                case 165:
                case 253:
                    obj = "ۣۤۤ";
                    continue;
                case 225:
                    break;
                case TypedValues.AttributesType.TYPE_PIVOT_TARGET /* 318 */:
                    bArr = new byte[length / 2];
                    obj = "ۢۨۨ";
                    continue;
                case 5507:
                    length = bArrM5538.length;
                    if (C0088.m573() > 0) {
                        obj = "۠ۡ۠";
                    } else {
                        continue;
                    }
                case 5508:
                    iIntValue = numArr[0].intValue();
                    if (C0390.m5512() > 0) {
                        obj = "ۣۡ";
                    } else {
                        continue;
                    }
                case 5601:
                    return bArr;
                case 5641:
                    bArrM5538 = C0391.m5538(str);
                    obj = "ۥۥۢ";
                    continue;
                case 5667:
                    if (C0390.m5512() <= 0) {
                        i3 = 0;
                    } else {
                        obj = "ۣۤۤ";
                        i3 = 0;
                        continue;
                    }
                case 5674:
                    ?? r1 = new Object[2];
                    if (C0291.m2568() >= 0) {
                        numArr = r1;
                        obj = "ۦ۟ۡ";
                    } else {
                        numArr = r1;
                        obj = "ۢ۟ۤ";
                        continue;
                    }
                case 6307:
                    obj = "ۥۢ۟";
                    continue;
                case 6394:
                    i = ((i3 + 19) + 2) - 19;
                    if (C0388.m5430() > 0) {
                        obj = "ۧۨ۟";
                    } else {
                        continue;
                    }
                case 6534:
                    numArr[1] = new Integer(6264750);
                    obj = "ۧۢۨ";
                    continue;
                case 7522:
                    if (i3 >= length) {
                        break;
                    } else {
                        obj = "ۦۡ۠";
                    }
                case 25184:
                    if (C0184.m1524() >= 0) {
                        obj = "۠ۤۢ";
                    } else {
                        obj = "ۣ۠۟";
                        continue;
                    }
                case 25253:
                    int i4 = i3 / 2;
                    if (C0025.m118() <= 0) {
                        C0334.m2866();
                        i2 = i4;
                        obj = "۟۟۟";
                    } else {
                        i2 = i4;
                        obj = "ۥۥۥ";
                        continue;
                    }
                case 27204:
                    iIntValue2 = numArr[1].intValue();
                    obj = "ۦ۟ۡ";
                    continue;
                case 27273:
                    str2 = new String(bArrM5538, i3, ((iIntValue2 ^ (-1)) & 6264748) | ((-6264749) & iIntValue2));
                    if (C0334.m2866() <= 0) {
                        C0009.m36();
                    } else {
                        obj = "ۨۤ۠";
                        continue;
                    }
                case 28127:
                    if (C0179.m1427() <= 0) {
                        i3 = i;
                    } else {
                        obj = "ۨۦ۟";
                        i3 = i;
                        continue;
                    }
                case 28332:
                    numArr[0] = new Integer(7959347);
                    if (C0397.m5814() <= 0) {
                        C0386.m5322();
                        obj = "ۥۣۥ";
                    } else {
                        obj = "۠ۦۦ";
                        continue;
                    }
                case 1734530:
                    if (C0291.m2568() >= 0) {
                        C0400.m5961();
                    } else {
                        obj = "ۥۢۨ";
                        continue;
                    }
                case 1734627:
                    bArr[i2] = (byte) C0279.m2489(str2, ((iIntValue ^ (-1)) & 7959331) | ((-7959332) & iIntValue));
                    obj = "ۢۧ۠";
                    continue;
            }
            obj = "ۥۤ۟";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x000d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2781(byte[] r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.C0315.m2781(byte[]):java.lang.String");
    }

    /* renamed from: ۣ۟ۦۧۦ, reason: not valid java name and contains not printable characters */
    public static Cipher m2782(Object obj) {
        String str = "ۧۦۧ";
        Cipher cipher = null;
        Cipher cipher2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754499) {
                case 107:
                    if (C0025.m118() < 0) {
                        break;
                    } else if (C0179.m1427() > 0) {
                        str = "ۤۥۥ";
                    }
                case 1990:
                    if (C0382.m5180() <= 0) {
                        C0368.m3171();
                        cipher = null;
                    } else {
                        str = "۟ۤۤ";
                        cipher = null;
                        continue;
                    }
                case 25113:
                    if (C0164.m1359() >= 0) {
                        C0086.m500();
                        cipher = cipher2;
                    } else {
                        str = "ۣ۠ۨ";
                        cipher = cipher2;
                        continue;
                    }
                case 25116:
                    str = "۟ۢ";
                    continue;
                case 28358:
                    return cipher;
                case 32519:
                    cipher2 = ((C0315) obj).f551;
                    str = "۟ۤ۟";
                    continue;
                case 32600:
                case 1711712:
                    str = "ۣ۠ۨ";
                    continue;
                case 32644:
                    if (C0383.m5203() <= 0) {
                        str = "ۣۤ۟";
                    } else {
                        str = "ۦۧۦ";
                        continue;
                    }
                case 1710336:
                    str = "ۧۦۧ";
                    continue;
                case 1710431:
                    break;
            }
            str = "ۤۡۤ";
        }
    }

    /* renamed from: ۟ۤۧۡ۟, reason: not valid java name and contains not printable characters */
    public static Cipher m2783(Object obj) {
        String str = "ۤۦۨ";
        Cipher cipher = null;
        Cipher cipher2 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1749667) {
                case 28:
                    if (C0184.m1524() >= 0) {
                        C0399.m5914();
                        str = "ۤ۠ۡ";
                    } else {
                        str = "ۢۧۧ";
                        continue;
                    }
                case 233:
                    cipher2 = ((C0315) obj).f550;
                    if (C0386.m5322() > 0) {
                        str = "ۣۨۤ";
                    } else {
                        continue;
                    }
                case 481:
                    if (C0164.m1359() >= 0) {
                        cipher = null;
                    } else {
                        str = "ۣۨ۟";
                        cipher = null;
                        continue;
                    }
                case 1060:
                    break;
                case 2053:
                    if (C0025.m118() <= 0) {
                        break;
                    } else {
                        str = C0370.m3284() >= 0 ? "ۣۣۨ" : "ۢ۟ۧ";
                    }
                case 3241:
                case 5605:
                    str = "ۡۧ";
                    continue;
                case 3243:
                    if (C0025.m118() <= 0) {
                        C0387.m5374();
                        str = "ۦۤ۠";
                    } else {
                        str = "ۤۦۨ";
                        continue;
                    }
                case 31684:
                    if (C0074.m307() >= 0) {
                        C0394.m5672();
                        cipher = cipher2;
                    } else {
                        str = "ۡۧ";
                        cipher = cipher2;
                        continue;
                    }
                case 31719:
                    if (C0382.m5180() <= 0) {
                        C0390.m5512();
                    } else {
                        str = "ۥۣۨ";
                        continue;
                    }
                case 1732229:
                    return cipher;
            }
            if (C0279.m2491() < 0) {
                str = "ۣۢ۠";
            }
        }
    }

    /* renamed from: ۣ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static Key m2784(Object obj, Object obj2) throws Exception {
        String str = "ۤۨۤ";
        Key key = null;
        Key keyM2779 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746935) {
                case 41:
                    keyM2779 = ((C0315) obj).m2779((byte[]) obj2);
                    if (C0009.m36() >= 0) {
                        C0394.m5672();
                        str = "۟ۢ۠";
                    } else {
                        str = "۟ۡۧ";
                        continue;
                    }
                case 178:
                    if (C0397.m5814() <= 0) {
                        str = "ۥۣۨ";
                        key = keyM2779;
                    } else {
                        str = "۟ۡۢ";
                        key = keyM2779;
                        continue;
                    }
                case 183:
                    return key;
                case 3275:
                    str = "ۥۨ۟";
                    key = null;
                    continue;
                case 3376:
                    if (C0390.m5512() <= 0) {
                        C0382.m5180();
                    } else {
                        str = "ۤۨۤ";
                        continue;
                    }
                case 4465:
                case 5386:
                    if (C0335.m2923() < 0) {
                        str = "۟ۡۢ";
                    } else {
                        continue;
                    }
                case 6507:
                    if (C0370.m3284() < 0) {
                        str = "ۢۥ۠";
                    } else {
                        continue;
                    }
                case 6768:
                    break;
                case 7447:
                    if (C0060.m216() < 0) {
                        break;
                    } else if (C0389.m5481() <= 0) {
                        C0179.m1427();
                    } else {
                        str = "۟ۦۥ";
                    }
                case 7634:
                    str = "ۣ۠۟";
                    continue;
            }
            if (C0386.m5322() > 0) {
                str = "ۣۤۢ";
            }
        }
    }

    public String decrypt(String str) throws Exception {
        String str2 = "ۥۨۧ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1747649) {
                case 3518:
                    str2 = "ۥۨۧ";
                    break;
                case 5221:
                    return new String(C0060.m215(this, C0384.m5246(str)));
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public byte[] m2785(byte[] bArr) throws Exception {
        String str = "ۢ۠ۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752740) {
                case 2092:
                    if (C0375.m4840() >= 0) {
                        break;
                    } else {
                        str = "ۢ۠ۧ";
                        break;
                    }
                case 3277:
                    return C0073.m257(m2783(this), bArr);
            }
        }
    }
}
