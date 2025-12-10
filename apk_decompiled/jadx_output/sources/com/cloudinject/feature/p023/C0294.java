package com.cloudinject.feature.p023;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.ann.Dex2C;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import p027.p028.p029.C0420;

@Dex2C
/* renamed from: com.cloudinject.feature.̙̙.̖̖̖, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0294 {

    /* renamed from: ̖̖̙̖̖̖̖, reason: not valid java name and contains not printable characters */
    protected static char[] f533;

    /* renamed from: ̙̖̖̖̖̙̖, reason: not valid java name and contains not printable characters */
    protected static MessageDigest f534;

    static {
        String str = "ۣۡۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754377) {
                case 246:
                    if (C0396.m5741() < 0) {
                        str = "ۤۥ";
                        break;
                    } else {
                        C0394.m5672();
                        break;
                    }
                case 1839:
                case 1710472:
                    if (C0396.m5741() < 0) {
                        str = "ۢۨۥ";
                        break;
                    } else {
                        C0335.m2923();
                        break;
                    }
                case 3173:
                    if (C0083.m448() < 0) {
                        str = "ۧۧ۟";
                        break;
                    } else {
                        C0346.m3059();
                        break;
                    }
                case 25299:
                    f534 = null;
                    if (C0376.m4906() > 0) {
                        str = "ۨۢ";
                        break;
                    } else {
                        C0083.m448();
                        str = "ۤۤۦ";
                        break;
                    }
                case 29517:
                    f533 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                    str = "۟ۦۡ";
                    break;
                case 30294:
                    return;
                case 31534:
                    if (C0380.m5068() <= 0) {
                        break;
                    } else {
                        str = "ۣۡۢ";
                        break;
                    }
                case 1710579:
                    try {
                        f534 = C0379.m5057(C0385.m5310(C0392.m5613()));
                        if (C0370.m3284() >= 0) {
                            break;
                        } else {
                            str = "ۧۧ۟";
                            break;
                        }
                    } catch (NoSuchAlgorithmException e) {
                        PrintStream printStreamM5275 = C0384.m5275();
                        StringBuilder sb = new StringBuilder();
                        C0060.m211(sb, C0078.m352(C0294.class));
                        C0060.m211(sb, C0385.m5310(C0155.m1301()));
                        C0228.m1982(printStreamM5275, C0377.m4932(sb));
                        C0375.m4842(e);
                        if (C0073.m265() > 0) {
                            str = "ۦۦۦ";
                            break;
                        } else {
                            C0083.m448();
                            str = "ۣۢ۟";
                            break;
                        }
                    }
                case 1711853:
                    if (C0390.m5512() <= 0) {
                        break;
                    } else {
                        str = "ۨۢ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̖̖, reason: not valid java name and contains not printable characters */
    private static String m2583(byte[] bArr) {
        return m2593(bArr, 0, bArr.length);
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    private static String m2584(byte[] bArr, int i, int i2) {
        int i3 = 0;
        String str = "ۡ۟۟";
        int i4 = 0;
        StringBuffer stringBuffer = null;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748711) {
                case 88:
                    if (i6 >= i2 - (0 - i5)) {
                        break;
                    } else {
                        str = C0395.m5698() >= 0 ? "ۣۣۤ" : "ۤۥۥ";
                    }
                case 102:
                    str = "ۨۥۥ";
                    i5 = i;
                    continue;
                case 1383:
                    if (C0184.m1524() >= 0) {
                        C0083.m448();
                        i6 = i4;
                    } else {
                        str = "ۡۡ۟";
                        i6 = i4;
                        continue;
                    }
                case 1784:
                    str = "ۡ۟۟";
                    continue;
                case 4333:
                    if (C0082.m410() >= 0) {
                        C0362.m3122();
                    } else {
                        str = "ۥ۟۠";
                        continue;
                    }
                case 4961:
                case 28462:
                    if (C0060.m216() > 0) {
                        str = "۠ۥۥ";
                    } else {
                        continue;
                    }
                case 5219:
                    m2592(bArr[i6], stringBuffer);
                    if (C0377.m4944() <= 0) {
                        str = "ۣۧ۠";
                    } else {
                        str = "ۧۡ۠";
                        continue;
                    }
                case 6309:
                    break;
                case 6379:
                    if (C0420.m6215() >= 0) {
                        C0086.m500();
                        i4 = i5;
                    } else {
                        str = "۠ۥۥ";
                        i4 = i5;
                        continue;
                    }
                case 7644:
                    return C0378.m5011(stringBuffer);
                case 26479:
                    stringBuffer = new StringBuffer(i2 * 2);
                    str = "ۣ۟ۨ";
                    continue;
                case 27553:
                    i3 = 1 - (0 - i6);
                    if (C0009.m36() < 0) {
                        str = "ۡۤ";
                    } else {
                        continue;
                    }
                case 1733316:
                    str = "ۥۣۨ";
                    i4 = i3;
                    continue;
            }
            str = "ۢۧ۠";
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    private static void m2585(byte b, StringBuffer stringBuffer) {
        char c = 0;
        String str = "۠ۤۤ";
        char[] cArrM2594 = null;
        char c2 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750726) {
                case 142:
                    c = cArrM2594[(b ^ (-16)) & b];
                    str = "ۡۥۨ";
                    break;
                case 1413:
                    C0086.m533(stringBuffer, c);
                    if (C0389.m5481() <= 0) {
                        break;
                    } else {
                        str = "ۡۧۥ";
                        break;
                    }
                case 6530:
                    C0086.m533(stringBuffer, c2);
                    str = "ۢۧۨ";
                    break;
                case 6585:
                    return;
                case 6653:
                    str = "۠ۤۤ";
                    break;
                case 7590:
                    cArrM2594 = m2594();
                    str = "ۨۨۢ";
                    break;
                case 32548:
                    c2 = cArrM2594[((b ^ (-241)) & b) >> 4];
                    if (C0368.m3171() < 0) {
                        str = "ۣۡۦ";
                        break;
                    } else {
                        str = "ۦۦ۠";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    public static String m2586(File file) throws IOException {
        Long l = null;
        long jM6220 = 0;
        FileChannel fileChannel = null;
        FileChannel.MapMode mapModeM243 = null;
        long jLongValue = 0;
        MappedByteBuffer mappedByteBufferM2561 = null;
        String str = "ۣۨ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751655) {
                case 2274:
                    return m2590(C0334.m2860(m2591()));
                case 2406:
                    mapModeM243 = C0073.m243();
                    str = "ۧۤۥ";
                    break;
                case 3452:
                    l = new Long(5198568L);
                    str = "ۣ۠";
                    break;
                case 4569:
                    mappedByteBufferM2561 = C0291.m2561(fileChannel, mapModeM243, (((-1) ^ jLongValue) & 5198568) | ((5198568 ^ (-1)) & jLongValue), jM6220);
                    str = "۟ۨۧ";
                    break;
                case 4729:
                    C0385.m5289(m2591(), mappedByteBufferM2561);
                    if (C0376.m4906() <= 0) {
                        break;
                    } else {
                        str = "ۢۡۤ";
                        break;
                    }
                case 29646:
                    jLongValue = ((Long) new Object[]{l}[0]).longValue();
                    if (C0393.m5668() > 0) {
                        str = "۠ۧۥ";
                        break;
                    } else {
                        str = "ۡۦ۟";
                        break;
                    }
                case 32622:
                    if (C0382.m5180() <= 0) {
                        break;
                    } else {
                        str = "ۣۨ۠";
                        break;
                    }
                case 32719:
                    jM6220 = C0420.m6220(file);
                    str = "ۨۦۧ";
                    break;
                case 1730106:
                    FileChannel fileChannelM2020 = C0228.m2020(new FileInputStream(file));
                    if (C0382.m5180() > 0) {
                        fileChannel = fileChannelM2020;
                        str = "ۢۥۤ";
                        break;
                    } else {
                        fileChannel = fileChannelM2020;
                        str = "ۧۦۡ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̗̗̖, reason: not valid java name and contains not printable characters */
    public static String m2587(String str) {
        return C0380.m5071(C0391.m5538(str));
    }

    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    public static String m2588(byte[] bArr) {
        String str = "ۢۢۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753482) {
                case 26327:
                    str = "ۢۢۦ";
                    break;
                case 29484:
                    C0078.m363(m2591(), bArr);
                    if (C0228.m2012() <= 0) {
                        break;
                    } else {
                        str = "ۤ۠۟";
                        break;
                    }
                case 30825:
                    return m2590(C0334.m2860(m2591()));
            }
        }
    }

    /* renamed from: ̙̗, reason: not valid java name and contains not printable characters */
    public static boolean m2589(String str, String str2) {
        String str3 = "ۣۨۦ";
        while (true) {
            switch (C0395.m5690((Object) str3) ^ 1754570) {
                case 28181:
                    if (C0074.m307() < 0) {
                        str3 = "ۣۨۦ";
                        break;
                    } else {
                        C0385.m5282();
                        break;
                    }
                case 29419:
                    return C0395.m5699(C0206.m1806(str), str2);
            }
        }
    }

    /* renamed from: ۣۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static String m2590(Object obj) {
        String str = "ۢ۟ۡ";
        String str2 = null;
        String strM2583 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1751716) {
                case 59:
                    strM2583 = m2583((byte[]) obj);
                    if (C0179.m1427() <= 0) {
                        C0382.m5180();
                    } else {
                        str = "ۡۡ۟";
                        continue;
                    }
                case 1060:
                case 1730177:
                    if (C0155.m1294() < 0) {
                        str = "ۡۢ۠";
                    } else {
                        continue;
                    }
                case 2272:
                    if (C0279.m2491() >= 0) {
                        break;
                    } else if (C0362.m3122() >= 0) {
                        C0381.m5127();
                    } else {
                        str = "ۤۦۡ";
                    }
                case 3169:
                    if (C0397.m5814() > 0) {
                        str = "۟۟ۢ";
                    } else {
                        continue;
                    }
                case 3174:
                    break;
                case 3463:
                    if (C0394.m5672() <= 0) {
                        C0377.m4944();
                    } else {
                        str = "ۢ۟ۡ";
                        continue;
                    }
                case 5147:
                    str = "ۡۢ۠";
                    str2 = strM2583;
                    continue;
                case 5243:
                    return str2;
                case 5625:
                    str = "ۥۧۢ";
                    continue;
                case 7590:
                    str = "ۡۦۢ";
                    str2 = null;
                    continue;
            }
            str = C0229.m2064() >= 0 ? "ۦۧۤ" : "ۣۥۧ";
        }
    }

    /* renamed from: ۟ۦ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m2591() {
        String str = "ۤۦۧ";
        MessageDigest messageDigest = null;
        MessageDigest messageDigest2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56573) {
                case 1709397:
                    messageDigest2 = f534;
                    str = "ۥ۟۠";
                    continue;
                case 1709399:
                    break;
                case 1709520:
                case 1728794:
                    str = "۠ۨۧ";
                    continue;
                case 1710847:
                    str = "ۨۢۧ";
                    continue;
                case 1728891:
                    str = "۠ۨۧ";
                    messageDigest = messageDigest2;
                    continue;
                case 1729120:
                    str = "ۤۧ۠";
                    continue;
                case 1729183:
                    if (C0362.m3122() >= 0) {
                        str = "۠ۥۧ";
                    } else {
                        str = "ۤۦۧ";
                        continue;
                    }
                case 1730112:
                    str = "ۧۧۢ";
                    messageDigest = null;
                    continue;
                case 1730136:
                    if (C0420.m6215() > 0) {
                        break;
                    } else if (C0183.m1464() <= 0) {
                        C0009.m36();
                        str = "ۧۧۧ";
                    } else {
                        str = "ۨۦۦ";
                    }
                case 1734434:
                    return messageDigest;
            }
            if (C0381.m5127() <= 0) {
                C0398.m5833();
            } else {
                str = "ۥۨ۠";
            }
        }
    }

    /* renamed from: ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m2592(byte b, Object obj) {
        Object obj2 = "ۣۤۦ";
        while (true) {
            switch (C0395.m5690(obj2) ^ 1752487) {
                case 107:
                    m2585(b, (StringBuffer) obj);
                    if (C0380.m5068() <= 0) {
                        C0379.m5056();
                    } else {
                        obj2 = "ۢۧۦ";
                        continue;
                    }
                case 2818:
                    if (C0083.m448() >= 0) {
                        break;
                    } else {
                        obj2 = "ۥۡۨ";
                    }
                case 2820:
                    if (C0389.m5481() <= 0) {
                        C0164.m1359();
                        obj2 = "ۣۨ۠";
                    } else {
                        obj2 = "ۨۨ۠";
                        continue;
                    }
                case 2872:
                    break;
                case 3814:
                    return;
                case 29767:
                case 29797:
                    obj2 = "ۢۧۦ";
                    continue;
                case 30944:
                    if (C0385.m5282() >= 0) {
                        C0370.m3284();
                        obj2 = "ۥ۠ۨ";
                    } else {
                        obj2 = "ۣۤۦ";
                        continue;
                    }
            }
            if (C0368.m3171() < 0) {
                obj2 = "ۣۤۤ";
            }
        }
    }

    /* renamed from: ۦۢ۟ۥ, reason: contains not printable characters */
    public static String m2593(Object obj, int i, int i2) {
        String str = "ۣۧۦ";
        String str2 = null;
        String strM2584 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751651) {
                case 2305:
                case 3425:
                    if (C0086.m500() <= 0) {
                        C0291.m2568();
                        str = "ۡ۟";
                    } else {
                        str = "ۨۦ";
                        continue;
                    }
                case 3079:
                    if (C0025.m118() <= 0) {
                        str2 = null;
                    } else {
                        str = "ۡۧۥ";
                        str2 = null;
                        continue;
                    }
                case 5254:
                    if (C0383.m5203() <= 0) {
                        C0386.m5322();
                    } else {
                        str = "ۣۣۢ";
                        continue;
                    }
                case 5404:
                    if (C0376.m4906() <= 0) {
                        C0206.m1807();
                    } else {
                        str = "ۣۧۦ";
                        continue;
                    }
                case 29486:
                    break;
                case 31530:
                    strM2584 = m2584((byte[]) obj, i, i2);
                    str = "ۦۣۨ";
                    continue;
                case 31656:
                    if (C0385.m5282() >= 0) {
                        C0397.m5814();
                        str2 = strM2584;
                    } else {
                        str = "ۨۦ";
                        str2 = strM2584;
                        continue;
                    }
                case 32745:
                    if (C0398.m5833() < 0) {
                        break;
                    } else {
                        str = "ۦ۟ۢ";
                    }
                case 1730085:
                    if (C0420.m6215() < 0) {
                        str = "ۣۧۦ";
                    } else {
                        continue;
                    }
                case 1730205:
                    return str2;
            }
            if (C0370.m3284() >= 0) {
                C0384.m5278();
                str = "ۤۦۡ";
            } else {
                str = "ۡۢۦ";
            }
        }
    }

    /* renamed from: ۨ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static char[] m2594() {
        String str = "ۣۢۢ";
        char[] cArr = null;
        char[] cArr2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746689) {
                case 3557:
                    str = "ۣۢۢ";
                    continue;
                case 5538:
                    if (C0377.m4944() <= 0) {
                        break;
                    } else {
                        str = "ۤۦۢ";
                    }
                case 6561:
                    if (C0082.m410() >= 0) {
                        C0184.m1524();
                        cArr = null;
                    } else {
                        str = "ۦۦۥ";
                        cArr = null;
                        continue;
                    }
                case 6858:
                    if (C0369.m3256() <= 0) {
                        str = "ۥۧۤ";
                    } else {
                        str = "ۥۣۨ";
                        continue;
                    }
                case 7585:
                    cArr2 = f533;
                    if (C0334.m2866() <= 0) {
                        C0088.m573();
                    } else {
                        str = "ۣ۠";
                        continue;
                    }
                case 7615:
                    return cArr;
                case 24841:
                case 1735913:
                    str = "ۤۧۡ";
                    continue;
                case 25892:
                    if (C0376.m4906() <= 0) {
                        C0368.m3171();
                    } else {
                        str = "ۧۧۨ";
                        continue;
                    }
                case 28263:
                    break;
                case 1735426:
                    if (C0390.m5512() <= 0) {
                        C0392.m5595();
                        cArr = cArr2;
                    } else {
                        str = "ۤۧۡ";
                        cArr = cArr2;
                        continue;
                    }
            }
            str = "ۥۡۧ";
        }
    }
}
