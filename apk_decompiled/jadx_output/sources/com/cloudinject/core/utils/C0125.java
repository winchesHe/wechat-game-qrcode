package com.cloudinject.core.utils;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
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
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.core.utils.̗, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0125 {

    /* renamed from: ̗̗̖̙̖̙̗, reason: not valid java name and contains not printable characters */
    private static final String f197 = "default_secret_key";

    /* renamed from: ̗̗̖̖̙̙̗, reason: not valid java name and contains not printable characters */
    private Cipher f198;

    /* renamed from: ̗̗̙̙̙̙̙, reason: not valid java name and contains not printable characters */
    private Cipher f199;

    public C0125() {
        this(C0385.m5310(C0362.m3132()));
    }

    public C0125(String str) {
        int iIntValue = 0;
        Integer num = new Integer(2299156);
        String strM5310 = C0385.m5310(C0399.m5895());
        String str2 = "۠ۥۡ";
        Cipher cipherM1030 = null;
        Key keyM1029 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1747749) {
                case 89:
                    this.f199 = null;
                    if (C0379.m5056() > 0) {
                        str2 = "ۥ۟ۡ";
                        break;
                    } else {
                        C0370.m3284();
                        break;
                    }
                case 135:
                    keyM1029 = m1029(this, C0391.m5538(str));
                    if (C0378.m4998() > 0) {
                        str2 = "۟۟ۤ";
                        break;
                    } else {
                        str2 = "ۣۣ۟";
                        break;
                    }
                case 1050:
                    C0387.m5405(cipherM1030, ((iIntValue ^ (-1)) & 2299158) | ((-2299159) & iIntValue), keyM1029);
                    if (C0398.m5833() > 0) {
                        str2 = "۟۠ۥ";
                        break;
                    } else {
                        C0155.m1294();
                        break;
                    }
                case 1208:
                    try {
                        cipherM1030 = m1030(this);
                        if (C0377.m4944() > 0) {
                            str2 = "۟ۦۦ";
                            break;
                        } else {
                            C0088.m573();
                            break;
                        }
                    } catch (Exception e) {
                        str2 = "ۢۡۤ";
                        break;
                    }
                case 3073:
                    return;
                case 3105:
                    this.f199 = C0179.m1435(strM5310);
                    str2 = "ۢۥ";
                    break;
                case 3322:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    str2 = "ۡۥۣ";
                    break;
                case 5794:
                    this.f198 = null;
                    if (C0184.m1524() < 0) {
                        str2 = "۠ۦۨ";
                        break;
                    } else {
                        C0375.m4840();
                        break;
                    }
                case 6560:
                case 1734566:
                    str2 = "۟۠ۥ";
                    break;
                case 6619:
                    this.f198 = C0179.m1435(strM5310);
                    if (C0396.m5741() < 0) {
                        str2 = "ۡۨۤ";
                        break;
                    } else {
                        C0394.m5672();
                        break;
                    }
                case 1734436:
                    str2 = "۠ۥۡ";
                    break;
                case 1734502:
                    C0387.m5405(m1031(this), 1, keyM1029);
                    if (C0362.m3122() >= 0) {
                        break;
                    } else {
                        str2 = "ۢۥۡ";
                        break;
                    }
                case 1734655:
                    if (C0025.m118() <= 0) {
                        break;
                    } else {
                        str2 = "۠ۦۨ";
                        break;
                    }
            }
        }
    }

    public static String decode(String str, String str2) {
        String strM3164 = null;
        String str3 = "ۣۨۡ";
        String strM5220 = null;
        boolean zM1364 = false;
        C0125 c0125 = null;
        while (true) {
            switch (C0395.m5690((Object) str3) ^ 56326) {
                case 1709324:
                    zM1364 = C0164.m1364(str2);
                    str3 = "ۡۡۢ";
                case 1709352:
                    c0125 = new C0125(str);
                    str3 = "ۢۢ۠";
                case 1709473:
                case 1730049:
                case 1709475:
                    str3 = !zM1364 ? "ۣۤ۠" : "ۧ۠ۡ";
                case 1710382:
                    return strM5220;
                case 1711631:
                    if (C0229.m2064() < 0) {
                        str3 = "ۤۡۤ";
                    }
                case 1730235:
                    return strM3164;
                case 1731137:
                case 1731225:
                    str3 = C0380.m5096(str2, C0385.m5310(C0121.m1001())) ? "ۦۥۨ" : "ۨۢۨ";
                case 1732262:
                    try {
                        strM3164 = C0368.m3164(c0125, str2);
                        str3 = "ۤۧ۠";
                    } catch (Exception e) {
                        C0078.m344(e);
                        str3 = "ۨۦۥ";
                    }
                case 1733294:
                    str3 = "ۢۢ۠";
                case 1733316:
                    strM5220 = C0383.m5220();
                    if (C0392.m5595() > 0) {
                        str3 = "ۨۦۣ";
                    }
                case 1734392:
                    if (C0420.m6215() < 0) {
                        str3 = "ۤۧ۠";
                    }
                case 1734437:
                    str3 = "ۣۨۡ";
            }
        }
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    private Key m1026(byte[] bArr) throws Exception {
        String str = "۠۟ۨ";
        int i = 0;
        byte[] bArr2 = null;
        int i2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753484) {
                case 915:
                    if (i >= bArr2.length) {
                        break;
                    } else {
                        str = C0089.m592() <= 0 ? "ۥۤۨ" : "ۣۧۤ";
                    }
                case 1066:
                    bArr2[i] = bArr[i];
                    str = "ۣۣۡ";
                    continue;
                case 1098:
                    break;
                case 2157:
                    if (C0398.m5833() <= 0) {
                        C0377.m4944();
                    } else {
                        str = "ۢ۠۟";
                        continue;
                    }
                case 2411:
                case 30660:
                    str = "ۣۣ۟";
                    continue;
                case 26281:
                    if (C0082.m410() >= 0) {
                        C0346.m3059();
                    } else {
                        str = "۠۟ۨ";
                        continue;
                    }
                case 27309:
                    str = "ۣۡۦ";
                    continue;
                case 27461:
                    bArr2 = new byte[8];
                    if (C0389.m5481() <= 0) {
                        C0382.m5180();
                    } else {
                        str = "ۨۨۡ";
                        continue;
                    }
                case 28523:
                    if (C0368.m3171() >= 0) {
                        C0369.m3256();
                        str = "ۧۡۥ";
                        i = i2;
                    } else {
                        str = "ۣ۠ۢ";
                        i = i2;
                        continue;
                    }
                case 29677:
                    if (C0370.m3284() >= 0) {
                        str = "ۨۤۨ";
                        i = 0;
                    } else {
                        str = "ۣۣ۟";
                        i = 0;
                        continue;
                    }
                case 30354:
                    return new SecretKeySpec(bArr2, C0385.m5310(C0399.m5895()));
                case 30665:
                    i2 = ((i + 22) + 1) - 22;
                    if (C0380.m5068() <= 0) {
                        C0086.m500();
                        str = "ۥۣۢ";
                    } else {
                        str = "ۡۢۨ";
                        continue;
                    }
                case 30707:
                    if (i >= bArr.length) {
                        break;
                    } else {
                        str = "ۦۦ۟";
                    }
            }
            str = "ۣۣۨ";
        }
    }

    /* renamed from: ̗̖̗, reason: not valid java name and contains not printable characters */
    public static byte[] m1027(String str) throws Exception {
        int i = 0;
        int iIntValue = 0;
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        int i4 = 0;
        byte[] bArr = null;
        int length = 0;
        byte[] bArrM5538 = null;
        Object[] objArr = null;
        Object obj = "ۣۡۦ";
        while (true) {
            switch (C0395.m5690(obj) ^ 56448) {
                case 190:
                    if (C0291.m2568() >= 0) {
                        C0390.m5512();
                        obj = "ۢۢۥ";
                    } else {
                        obj = "ۣۡۦ";
                        continue;
                    }
                case 1709381:
                    int iIntValue2 = ((Integer) objArr[0]).intValue();
                    if (C0381.m5127() <= 0) {
                        C0387.m5374();
                        i3 = iIntValue2;
                        obj = "ۣۧۤ";
                    } else {
                        i3 = iIntValue2;
                        obj = "ۡ۠۠";
                        continue;
                    }
                case 1709411:
                    bArr[i2] = (byte) C0279.m2489(str2, ((iIntValue ^ (-1)) & 4973557) | ((-4973558) & iIntValue));
                    if (C0396.m5741() < 0) {
                        obj = "ۦۦۣ";
                    } else {
                        continue;
                    }
                case 1710344:
                    if (C0387.m5374() >= 0) {
                        C0383.m5203();
                        i4 = 0;
                    } else {
                        obj = "ۤۥۢ";
                        i4 = 0;
                        continue;
                    }
                case 1711366:
                    obj = "ۦ۟ۥ";
                    continue;
                case 1711564:
                case 1732167:
                    obj = "ۤۥۢ";
                    continue;
                case 1711779:
                    i = (i4 - 24) + 2 + 24;
                    obj = "ۣۨۦ";
                    continue;
                case 1711837:
                    length = bArrM5538.length;
                    obj = "ۡ۠ۧ";
                    continue;
                case 1730049:
                    if (i4 >= length) {
                        break;
                    } else if (C0382.m5180() <= 0) {
                        C0376.m4906();
                    } else {
                        obj = "ۨۧۤ";
                    }
                case 1731203:
                    objArr[1] = new Integer(4973541);
                    if (C0009.m36() >= 0) {
                        C0376.m4906();
                    } else {
                        obj = "ۢۨۥ";
                        continue;
                    }
                case 1731212:
                    objArr[0] = new Integer(9850527);
                    if (C0393.m5668() > 0) {
                        obj = "ۣ۟۟";
                    } else {
                        continue;
                    }
                case 1731272:
                    Object[] objArr2 = new Object[2];
                    if (C0386.m5322() <= 0) {
                        objArr = objArr2;
                        obj = "ۤۧ";
                    } else {
                        objArr = objArr2;
                        obj = "ۣ۟ۨ";
                        continue;
                    }
                case 1731486:
                    i2 = i4 / 2;
                    obj = "ۣۨۧ";
                    continue;
                case 1731489:
                    if (C0078.m361() <= 0) {
                        C0362.m3122();
                        i4 = i;
                    } else {
                        obj = "ۦۡۡ";
                        i4 = i;
                        continue;
                    }
                case 1731490:
                    iIntValue = ((Integer) objArr[1]).intValue();
                    if (C0382.m5180() > 0) {
                        obj = "ۣۨۨ";
                    } else {
                        continue;
                    }
                case 1732575:
                    if (C0191.m1627() < 0) {
                        obj = "۟ۦۤ";
                    } else {
                        continue;
                    }
                case 1733122:
                    if (C0375.m4840() >= 0) {
                        C0387.m5374();
                    } else {
                        obj = "ۣۧۤ";
                        continue;
                    }
                case 1733153:
                    String str3 = new String(bArrM5538, i4, ((i3 ^ (-1)) & 9850525) | ((-9850526) & i3));
                    if (C0346.m3059() >= 0) {
                        C0362.m3122();
                        str2 = str3;
                        obj = "ۤۡ۟";
                    } else {
                        str2 = str3;
                        obj = "ۣۣۨ";
                        continue;
                    }
                case 1733160:
                    bArr = new byte[length / 2];
                    if (C0346.m3059() >= 0) {
                        C0387.m5374();
                    } else {
                        obj = "ۡ۟۠";
                        continue;
                    }
                case 1733510:
                    break;
                case 1735517:
                    bArrM5538 = C0391.m5538(str);
                    obj = "ۦۨ۟";
                    continue;
                case 1735547:
                    return bArr;
            }
            obj = "ۣ۟ۧ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x010f A[SYNTHETIC] */
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
    public static java.lang.String m1028(byte[] r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.core.utils.C0125.m1028(byte[]):java.lang.String");
    }

    /* renamed from: ۟۟ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static Key m1029(Object obj, Object obj2) throws Exception {
        String str = "ۥ۠ۦ";
        Key key = null;
        Key keyM1026 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752488) {
                case 3:
                    if (C0399.m5914() <= 0) {
                        break;
                    } else if (C0229.m2064() >= 0) {
                        C0400.m5961();
                    } else {
                        str = "۠۟ۤ";
                    }
                case 939:
                    return key;
                case 1967:
                    break;
                case 3049:
                    if (C0088.m573() <= 0) {
                        C0400.m5961();
                        str = "ۦۡ";
                        key = keyM1026;
                    } else {
                        str = "ۥۣۡ";
                        key = keyM1026;
                        continue;
                    }
                case 3735:
                    str = "ۦ۟";
                    continue;
                case 5556:
                    if (C0078.m361() > 0) {
                        str = "ۤۢ";
                    } else {
                        continue;
                    }
                case 5997:
                    keyM1026 = ((C0125) obj).m1026((byte[]) obj2);
                    str = "ۣۡ۟";
                    continue;
                case 6856:
                case 1728785:
                    if (C0082.m410() >= 0) {
                        C0399.m5914();
                        str = "ۢۢۦ";
                    } else {
                        str = "ۥۣۡ";
                        continue;
                    }
                case 1728982:
                    if (C0370.m3284() >= 0) {
                        key = null;
                    } else {
                        str = "ۢۧۤ";
                        key = null;
                        continue;
                    }
                case 1729012:
                    if (C0155.m1294() >= 0) {
                        C0391.m5571();
                    } else {
                        str = "ۥ۠ۦ";
                        continue;
                    }
            }
            str = "۟ۨۥ";
        }
    }

    /* renamed from: ۟ۥۦۦۨ, reason: not valid java name and contains not printable characters */
    public static Cipher m1030(Object obj) {
        Object obj2 = "۟ۢۡ";
        Cipher cipher = null;
        Cipher cipher2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 56358) {
                case 1709444:
                    return cipher;
                case 1709473:
                    obj2 = "۟ۢۡ";
                    continue;
                case 1710528:
                    if (C0376.m4906() > 0) {
                        obj2 = "ۣۧۧ";
                    } else {
                        continue;
                    }
                case 1710629:
                    obj2 = "۟ۨ۠";
                    cipher = null;
                    continue;
                case 1711552:
                    if (C0388.m5430() <= 0) {
                        cipher = cipher2;
                    } else {
                        obj2 = "ۨۦ۠";
                        cipher = cipher2;
                        continue;
                    }
                case 1729155:
                    break;
                case 1730028:
                case 1734565:
                    if (C0184.m1524() < 0) {
                        obj2 = "ۨۦ۠";
                    } else {
                        continue;
                    }
                case 1731207:
                    cipher2 = ((C0125) obj).f198;
                    if (C0383.m5203() > 0) {
                        obj2 = "ۦۤۤ";
                    } else {
                        continue;
                    }
                case 1733681:
                    obj2 = "ۤ۟ۥ";
                    continue;
                case 1735544:
                    if (C0083.m448() > 0) {
                        break;
                    } else {
                        obj2 = "ۣۤۢ";
                    }
            }
            if (C0399.m5914() <= 0) {
                C0025.m118();
            } else {
                obj2 = "ۧۦۥ";
            }
        }
    }

    /* renamed from: ۣۢۨۤ, reason: not valid java name and contains not printable characters */
    public static Cipher m1031(Object obj) {
        String str = "۠ۡۥ";
        Cipher cipher = null;
        Cipher cipher2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746755) {
                case 2049:
                case 28236:
                    if (C0074.m307() < 0) {
                        str = "۠ۤ۟";
                    } else {
                        continue;
                    }
                case 2439:
                    break;
                case 3096:
                    return cipher;
                case 3143:
                    if (C0377.m4944() < 0) {
                        break;
                    } else if (C0394.m5672() <= 0) {
                        C0390.m5512();
                    } else {
                        str = "ۦۥۤ";
                    }
                case 4191:
                    str = "۠ۤ۟";
                    cipher = cipher2;
                    continue;
                case 5247:
                    if (C0384.m5278() > 0) {
                        str = "ۨۡۨ";
                    } else {
                        continue;
                    }
                case 6598:
                    if (C0088.m573() <= 0) {
                        C0390.m5512();
                        str = "ۢۧ۠";
                    } else {
                        str = "ۦۣۦ";
                        continue;
                    }
                case 25926:
                    cipher2 = ((C0125) obj).f199;
                    str = "ۣۨۡ";
                    continue;
                case 26250:
                    if (C0334.m2866() <= 0) {
                        C0121.m1023();
                        cipher = null;
                    } else {
                        str = "ۢۧۡ";
                        cipher = null;
                        continue;
                    }
                case 26313:
                    if (C0164.m1359() >= 0) {
                        C0369.m3256();
                    } else {
                        str = "۠ۡۥ";
                        continue;
                    }
            }
            str = "ۥۧۧ";
        }
    }

    public String decrypt(String str) throws Exception {
        String str2 = "ۣۥۦ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755522) {
                case 31455:
                    if (C0382.m5180() > 0) {
                        str2 = "ۣۥۦ";
                        break;
                    } else {
                        C0291.m2568();
                        break;
                    }
                case 32582:
                    return new String(C0396.m5721(this, C0362.m3118(str)));
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public byte[] m1032(byte[] bArr) throws Exception {
        String str = "ۣ۠ۡ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747747) {
                case 7431:
                    return C0073.m257(m1030(this), bArr);
                case 27941:
                    if (C0362.m3122() < 0) {
                        str = "ۣ۠ۡ";
                        break;
                    } else {
                        C0400.m5961();
                        break;
                    }
            }
        }
    }
}
