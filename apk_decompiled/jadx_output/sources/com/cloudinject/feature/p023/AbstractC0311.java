package com.cloudinject.feature.p023;

import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.database.C0074;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.location.C0385;
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
import p027.p028.p029.C0420;

@Dex2C
/* renamed from: com.cloudinject.feature.̙̙.̗̖, reason: contains not printable characters */
/* loaded from: classes6.dex */
abstract class AbstractC0311 {
    private IvParameterSpec iv;
    private SecretKey secretKey;

    protected AbstractC0311(String str) {
        IvParameterSpec ivParameterSpec = null;
        String strM5310 = C0385.m5310(C0377.m4936());
        String str2 = "ۦۣۧ";
        DESKeySpec dESKeySpec = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56508) {
                case 62:
                    try {
                        IvParameterSpec ivParameterSpec2 = new IvParameterSpec(C0121.m985(str, strM5310));
                        if (C0382.m5180() > 0) {
                            str2 = "ۡ۠ۦ";
                            ivParameterSpec = ivParameterSpec2;
                            break;
                        } else {
                            C0399.m5914();
                            ivParameterSpec = ivParameterSpec2;
                            break;
                        }
                    } catch (Exception e) {
                        if (C0121.m1023() < 0) {
                            str2 = "۟۠ۧ";
                            break;
                        } else {
                            str2 = "۟۠۠";
                            break;
                        }
                    }
                case 1882:
                    str2 = "ۨۧ۠";
                    break;
                case 1709437:
                    str2 = "ۡ۟ۧ";
                    dESKeySpec = new DESKeySpec(C0121.m985(str, strM5310));
                    break;
                case 1711478:
                    if (C0279.m2491() >= 0) {
                        break;
                    } else {
                        str2 = "ۨۧ۠";
                        break;
                    }
                case 1728822:
                case 1735578:
                    if (C0396.m5741() >= 0) {
                        break;
                    } else {
                        str2 = "ۢۤۢ";
                        break;
                    }
                case 1730203:
                    if (C0380.m5068() > 0) {
                        str2 = "ۦۣۧ";
                        break;
                    } else {
                        C0191.m1627();
                        break;
                    }
                case 1732188:
                    return;
                case 1733147:
                    this.iv = ivParameterSpec;
                    if (C0228.m2012() > 0) {
                        str2 = "ۢۤۢ";
                        break;
                    } else {
                        str2 = "ۤۤ۠";
                        break;
                    }
                case 1733173:
                    this.secretKey = C0206.m1816(C0179.m1416(C0385.m5310(C0399.m5895())), dESKeySpec);
                    if (C0377.m4944() > 0) {
                        str2 = "ۤۦ";
                        break;
                    } else {
                        C0179.m1427();
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x000c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] hex2Byte(byte[] r13) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.AbstractC0311.hex2Byte(byte[]):byte[]");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f1 A[SYNTHETIC] */
    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m2767(byte[] r15) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.AbstractC0311.m2767(byte[]):java.lang.String");
    }

    /* renamed from: ۟ۥۣۣۡ, reason: not valid java name and contains not printable characters */
    public static SecretKey m2768(Object obj) {
        String str = "ۤۢۨ";
        SecretKey secretKey = null;
        SecretKey secretKey2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752455) {
                case 1925:
                    return secretKey;
                case 1965:
                    if (C0184.m1524() >= 0) {
                        break;
                    } else if (C0334.m2866() <= 0) {
                        C0073.m265();
                        str = "ۣۧۥ";
                    } else {
                        str = "ۨۨ۟";
                    }
                case 2714:
                case 5862:
                    if (C0379.m5056() > 0) {
                        str = "ۤۡ۟";
                    } else {
                        continue;
                    }
                case 5535:
                    break;
                case 6777:
                    if (C0381.m5127() <= 0) {
                        C0074.m307();
                        str = "ۣ۠ۨ";
                    } else {
                        str = "ۧۡۢ";
                        continue;
                    }
                case 29711:
                    str = "۠ۤۥ";
                    continue;
                case 29784:
                    secretKey2 = ((AbstractC0311) obj).secretKey;
                    str = "ۣۧ۠";
                    continue;
                case 30720:
                    str = "ۤۢۨ";
                    continue;
                case 30893:
                    if (C0089.m592() <= 0) {
                        secretKey = secretKey2;
                    } else {
                        str = "ۤۡ۟";
                        secretKey = secretKey2;
                        continue;
                    }
                case 30927:
                    str = "ۨۥۥ";
                    secretKey = null;
                    continue;
            }
            if (C0369.m3256() <= 0) {
                C0183.m1464();
            } else {
                str = "۟ۧۦ";
            }
        }
    }

    /* renamed from: ۟ۥۣۤۨ, reason: not valid java name and contains not printable characters */
    public static String m2769(Object obj, Object obj2) {
        Object obj3 = "ۦۥۧ";
        String str = null;
        String strM2767 = null;
        while (true) {
            switch (C0395.m5690(obj3) ^ 1753631) {
                case 23:
                    if (C0025.m118() <= 0) {
                        break;
                    } else if (C0387.m5374() >= 0) {
                        C0399.m5914();
                        obj3 = "ۣ۠ۨ";
                    } else {
                        obj3 = "ۢۤۡ";
                    }
                case PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW /* 1017 */:
                    break;
                case 2902:
                    obj3 = "ۡۤۤ";
                    str = null;
                    continue;
                case 3002:
                    if (C0389.m5481() > 0) {
                        obj3 = "ۦۥۧ";
                    } else {
                        continue;
                    }
                case 26046:
                    obj3 = "ۣۨۤ";
                    continue;
                case 27966:
                    obj3 = "ۤۢۧ";
                    continue;
                case 28864:
                    strM2767 = ((AbstractC0311) obj).m2767((byte[]) obj2);
                    if (C0398.m5833() > 0) {
                        obj3 = "ۥۤۧ";
                    } else {
                        continue;
                    }
                case 29020:
                case 30774:
                    if (C0393.m5668() <= 0) {
                        obj3 = "ۣۨ";
                    } else {
                        obj3 = "ۣۣۡ";
                        continue;
                    }
                case 29854:
                    return str;
                case 31799:
                    obj3 = "ۣۣۡ";
                    str = strM2767;
                    continue;
            }
            if (C0291.m2568() >= 0) {
                C0399.m5914();
            } else {
                obj3 = "۟ۤۦ";
            }
        }
    }

    /* renamed from: ۣۥۨۤ, reason: not valid java name and contains not printable characters */
    public static IvParameterSpec m2770(Object obj) {
        String str = "ۣۧۡ";
        IvParameterSpec ivParameterSpec = null;
        IvParameterSpec ivParameterSpec2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755468) {
                case 103:
                    return ivParameterSpec;
                case 2055:
                case 29828:
                    if (C0390.m5512() <= 0) {
                        C0393.m5668();
                    } else {
                        str = "ۨۢۥ";
                        continue;
                    }
                case 2082:
                    if (C0398.m5833() <= 0) {
                        C0377.m4944();
                    } else {
                        str = "ۥۡۤ";
                        continue;
                    }
                case 2893:
                    str = "ۣۧۡ";
                    continue;
                case 26324:
                    break;
                case 30565:
                    ivParameterSpec2 = ((AbstractC0311) obj).iv;
                    str = "ۢۨۧ";
                    continue;
                case 31277:
                    if (C0378.m4998() <= 0) {
                        C0394.m5672();
                        ivParameterSpec = ivParameterSpec2;
                    } else {
                        str = "ۨۢۥ";
                        ivParameterSpec = ivParameterSpec2;
                        continue;
                    }
                case 32689:
                    if (C0389.m5481() <= 0) {
                        break;
                    } else {
                        str = "ۥۤۨ";
                    }
                case 32753:
                    str = "ۦ۠ۨ";
                    ivParameterSpec = null;
                    continue;
                case 1708719:
                    str = "ۣۥ۟";
                    continue;
            }
            str = "۟ۢ";
        }
    }

    /* renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static byte[] m2771(Object obj, Object obj2) {
        String str = "۠ۦ";
        byte[] bArr = null;
        byte[] bArrHex2Byte = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750813) {
                case 346:
                    bArrHex2Byte = ((AbstractC0311) obj).hex2Byte((byte[]) obj2);
                    if (C0370.m3284() >= 0) {
                        str = "ۦۤۦ";
                    } else {
                        str = "ۥۧۤ";
                        continue;
                    }
                case 2463:
                    if (C0377.m4944() <= 0) {
                        bArr = bArrHex2Byte;
                    } else {
                        str = "ۥۢۥ";
                        bArr = bArrHex2Byte;
                        continue;
                    }
                case 2805:
                    return bArr;
                case 3455:
                    str = "ۦ۟ۤ";
                    bArr = null;
                    continue;
                case 3458:
                    if (C0078.m361() <= 0) {
                        C0379.m5056();
                        str = "۟ۧۢ";
                    } else {
                        str = "ۤۤۢ";
                        continue;
                    }
                case 4155:
                    str = "۠ۦ";
                    continue;
                case 29406:
                    break;
                case 30294:
                    if (C0420.m6215() < 0) {
                        str = "ۨۥۤ";
                    } else {
                        continue;
                    }
                case 32407:
                case 32410:
                    if (C0390.m5512() <= 0) {
                        C0396.m5741();
                    } else {
                        str = "ۥۢۥ";
                        continue;
                    }
                case 1731355:
                    if (C0392.m5595() < 0) {
                        break;
                    } else if (C0089.m592() <= 0) {
                        C0088.m573();
                    } else {
                        str = "ۣۡۥ";
                    }
            }
            if (C0388.m5430() > 0) {
                str = "ۤۦۡ";
            }
        }
    }

    protected String decrypt(String str) {
        String str2 = null;
        int iIntValue = 0;
        Cipher cipherM1435 = null;
        String strM5310 = null;
        Integer num = null;
        Object obj = "ۤ۠ۤ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1752553) {
                case 885:
                    return str2;
                case InputDeviceCompat.SOURCE_GAMEPAD /* 1025 */:
                    Integer num2 = new Integer(8967561);
                    if (C0390.m5512() > 0) {
                        num = num2;
                        obj = "۟ۢ۠";
                        break;
                    } else {
                        num = num2;
                        obj = "ۨۧ";
                        break;
                    }
                case 3848:
                    String str3 = new String(C0073.m257(cipherM1435, m2771(this, C0121.m985(str, strM5310))), strM5310);
                    if (C0060.m216() > 0) {
                        str2 = str3;
                        obj = "ۥۨ۟";
                        break;
                    } else {
                        str2 = str3;
                        obj = "ۡ۟ۥ";
                        break;
                    }
                case 6736:
                    cipherM1435 = C0179.m1435(C0385.m5310(C0078.m337()));
                    if (C0060.m216() <= 0) {
                        break;
                    } else {
                        obj = "ۧۢۧ";
                        break;
                    }
                case 6836:
                    strM5310 = C0385.m5310(C0377.m4936());
                    if (C0083.m448() < 0) {
                        obj = "۟ۥ۟";
                        break;
                    } else {
                        C0183.m1464();
                        break;
                    }
                case 29711:
                    if (C0391.m5571() > 0) {
                        obj = "ۥۨ۟";
                        break;
                    } else {
                        C0395.m5698();
                        break;
                    }
                case 29952:
                    obj = "ۤ۠ۤ";
                    break;
                case 30821:
                    if (C0370.m3284() >= 0) {
                        break;
                    } else {
                        obj = "۟ۥ۟";
                        break;
                    }
                case 30853:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    if (C0155.m1294() >= 0) {
                        break;
                    } else {
                        obj = "ۦۦۢ";
                        break;
                    }
                case 32715:
                    try {
                        C0393.m5642(cipherM1435, ((iIntValue ^ (-1)) & 8967563) | ((-8967564) & iIntValue), m2768(this), m2770(this));
                        if (C0379.m5056() > 0) {
                            obj = "ۣۢۤ";
                            break;
                        } else {
                            C0074.m307();
                            break;
                        }
                    } catch (Exception e) {
                        return null;
                    }
            }
        }
    }

    /* renamed from: ̗̙̙̖, reason: not valid java name and contains not printable characters */
    protected String m2772(String str) {
        String str2 = "ۣۡ";
        String strM2769 = null;
        Cipher cipherM1435 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1755376) {
                case 370:
                    return strM2769;
                case 2809:
                    if (C0392.m5595() <= 0) {
                        break;
                    } else {
                        str2 = "ۣۡ";
                        break;
                    }
                case 3580:
                    try {
                        strM2769 = m2769(this, C0073.m257(cipherM1435, C0121.m985(str, C0385.m5310(C0377.m4936()))));
                        if (C0074.m307() < 0) {
                            str2 = "ۨۥ۟";
                            break;
                        } else {
                            str2 = "۟ۢۧ";
                            break;
                        }
                    } catch (Exception e) {
                        return null;
                    }
                case 25419:
                    cipherM1435 = C0179.m1435(C0385.m5310(C0078.m337()));
                    if (C0334.m2866() > 0) {
                        str2 = "ۤۥۢ";
                        break;
                    } else {
                        str2 = "ۣۣۡ";
                        break;
                    }
                case 29297:
                    C0393.m5642(cipherM1435, 1, m2768(this), m2770(this));
                    str2 = "ۧ۟ۤ";
                    break;
                case 30076:
                    str2 = "۠ۧۢ";
                    break;
                case 30323:
                    str2 = "ۨۥ۟";
                    break;
                case 1709230:
                    if (C0184.m1524() >= 0) {
                        break;
                    } else {
                        str2 = "۠ۧۢ";
                        break;
                    }
            }
        }
    }
}
