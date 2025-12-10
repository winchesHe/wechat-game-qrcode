package com.cloudinject.feature.p023;

import android.app.C0009;
import android.content.Context;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.baidu.mobstat.Config;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.model.p014.C0191;
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
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
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
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̙̙.̗̙̗̗, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0327 {

    /* renamed from: ̙̙̖̖̖̙̖, reason: not valid java name and contains not printable characters */
    public static final long f555 = 31457280;

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static void m2807(File file, File file2) throws Throwable {
        FileChannel fileChannel = null;
        long j = 0;
        FileInputStream fileInputStream = null;
        Long l = null;
        FileChannel fileChannel2 = null;
        Throwable th = null;
        FileOutputStream fileOutputStream = null;
        FileChannel fileChannel3 = null;
        Object obj = "۠ۤ";
        FileChannel fileChannel4 = null;
        FileChannel fileChannel5 = null;
        FileChannel fileChannel6 = null;
        FileChannel fileChannel7 = null;
        FileChannel fileChannel8 = null;
        Exception exc = null;
        while (true) {
            switch (C0395.m5690(obj) ^ 1755345) {
                case TypedValues.PositionType.TYPE_DRAWPATH /* 502 */:
                    if (C0228.m2012() > 0) {
                        obj = "۠ۤ";
                        break;
                    } else {
                        C0206.m1807();
                        break;
                    }
                case 2492:
                    if (C0396.m5741() < 0) {
                        obj = "ۧۦۡ";
                        break;
                    } else {
                        obj = "ۣ۠";
                        break;
                    }
                case 3379:
                    C0206.m1819(new Closeable[]{fileChannel8, fileChannel4});
                    if (C0391.m5571() > 0) {
                        obj = "ۣۤۧ";
                        break;
                    } else {
                        C0399.m5914();
                        break;
                    }
                case 25104:
                    throw th;
                case 25111:
                    if (C0397.m5814() > 0) {
                        obj = "۠ۤۤ";
                        break;
                    } else {
                        C0380.m5068();
                        break;
                    }
                case 25418:
                    C0206.m1819(new Closeable[]{fileChannel6, fileChannel7});
                    obj = "۠۟ۥ";
                    break;
                case 25491:
                case 25521:
                    if (C0082.m410() < 0) {
                        obj = "ۣۤۧ";
                        break;
                    } else {
                        C0379.m5056();
                        break;
                    }
                case 26161:
                    if (C0346.m3059() < 0) {
                        obj = "ۥۣۧ";
                        break;
                    } else {
                        C0088.m573();
                        break;
                    }
                case 26448:
                    try {
                        obj = "ۣۢۨ";
                        fileInputStream = new FileInputStream(file);
                        break;
                    } catch (Exception e) {
                        if (C0191.m1627() < 0) {
                            obj = "۟ۡۨ";
                            fileChannel4 = null;
                            exc = e;
                            fileChannel8 = fileChannel3;
                            break;
                        } else {
                            fileChannel4 = null;
                            exc = e;
                            fileChannel8 = fileChannel3;
                            break;
                        }
                    } catch (Throwable th2) {
                        obj = "ۤ۠ۤ";
                        fileChannel2 = null;
                        th = th2;
                        fileChannel5 = fileChannel;
                        break;
                    }
                case 28429:
                    long jLongValue = ((Long) new Object[]{l}[0]).longValue();
                    if (C0378.m4998() > 0) {
                        obj = "ۣ۟ۤ";
                        j = jLongValue;
                        break;
                    } else {
                        j = jLongValue;
                        break;
                    }
                case 28456:
                case 28567:
                case 29267:
                    obj = "ۧۦ";
                    break;
                case 28524:
                    if (C0383.m5203() > 0) {
                        obj = "۠ۦۡ";
                        break;
                    } else {
                        C0379.m5056();
                        break;
                    }
                case 28628:
                    obj = "ۡۧۧ";
                    break;
                case 28985:
                case 31251:
                case 31381:
                case 1708853:
                    if (C0390.m5512() > 0) {
                        obj = "ۣ۠ۢ";
                        break;
                    } else {
                        C0388.m5430();
                        break;
                    }
                case 29196:
                    if (C0086.m500() > 0) {
                        obj = "ۣ۟ۤ";
                        break;
                    } else {
                        obj = "ۥۧۡ";
                        break;
                    }
                case 29201:
                    return;
                case 30288:
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    if (C0089.m592() > 0) {
                        obj = "ۥۦۡ";
                        fileOutputStream = fileOutputStream2;
                        break;
                    } else {
                        obj = "ۣۡۧ";
                        fileOutputStream = fileOutputStream2;
                        break;
                    }
                case 30385:
                    try {
                        FileChannel fileChannelM287 = C0074.m287(fileOutputStream);
                        if (C0191.m1627() < 0) {
                            obj = "۟ۦۣ";
                            fileChannel7 = fileChannelM287;
                            break;
                        } else {
                            obj = "ۢۨ۠";
                            fileChannel7 = fileChannelM287;
                            break;
                        }
                    } catch (Exception e2) {
                        obj = "ۤۥۣ";
                        fileChannel4 = null;
                        exc = e2;
                        fileChannel8 = fileChannel6;
                        break;
                    } catch (Throwable th3) {
                        if (C0397.m5814() > 0) {
                            obj = "ۢ۟ۡ";
                            fileChannel2 = null;
                            th = th3;
                            fileChannel5 = fileChannel6;
                            break;
                        } else {
                            fileChannel2 = null;
                            th = th3;
                            fileChannel5 = fileChannel6;
                            break;
                        }
                    }
                case 31254:
                    FileChannel fileChannelM2020 = C0228.m2020(fileInputStream);
                    if (C0420.m6215() < 0) {
                        obj = "ۥۣۧ";
                        fileChannel6 = fileChannelM2020;
                        break;
                    } else {
                        fileChannel6 = fileChannelM2020;
                        break;
                    }
                case 32473:
                    try {
                        C0378.m5012(fileChannel7, fileChannel6, (((-1) ^ j) & 1020060) | ((1020060 ^ (-1)) & j), C0391.m5563(fileChannel6));
                        if (C0387.m5374() < 0) {
                            obj = "۠ۦۡ";
                            break;
                        } else {
                            obj = "ۧۤۡ";
                            break;
                        }
                    } catch (Exception e3) {
                        if (C0385.m5282() < 0) {
                            obj = "۟ۧۡ";
                            fileChannel4 = fileChannel7;
                            exc = e3;
                            fileChannel8 = fileChannel6;
                            break;
                        } else {
                            obj = "۠ۥ۟";
                            fileChannel4 = fileChannel7;
                            exc = e3;
                            fileChannel8 = fileChannel6;
                            break;
                        }
                    } catch (Throwable th4) {
                        if (C0362.m3122() < 0) {
                            obj = "ۣۣۢ";
                            fileChannel2 = fileChannel7;
                            th = th4;
                            fileChannel5 = fileChannel6;
                            break;
                        } else {
                            fileChannel2 = fileChannel7;
                            th = th4;
                            fileChannel5 = fileChannel6;
                            break;
                        }
                    }
                case 32500:
                    C0206.m1819(new Closeable[]{fileChannel5, fileChannel2});
                    obj = "۠۟۠";
                    break;
                case 1709070:
                    try {
                        C0078.m344(exc);
                        if (C0291.m2568() >= 0) {
                            break;
                        } else {
                            obj = "ۧۦۡ";
                            break;
                        }
                    } catch (Throwable th5) {
                        obj = "ۣ۟";
                        fileChannel2 = fileChannel4;
                        th = th5;
                        fileChannel5 = fileChannel8;
                        break;
                    }
                case 1709162:
                    if (C0083.m448() < 0) {
                        obj = "۟ۦۣ";
                        break;
                    } else {
                        obj = "ۥۤ۟";
                        break;
                    }
                case 1709169:
                    fileChannel3 = null;
                    if (C0368.m3171() >= 0) {
                        break;
                    } else {
                        obj = "ۡۧۧ";
                        break;
                    }
                case 1709269:
                    Long l2 = new Long(1020060L);
                    fileChannel = null;
                    if (C0380.m5068() > 0) {
                        obj = "ۥۥ";
                        l = l2;
                        break;
                    } else {
                        l = l2;
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static void m2808(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream = null;
        Exception e = null;
        FileOutputStream fileOutputStream2 = null;
        String str = "ۣۤۡ";
        FileOutputStream fileOutputStream3 = null;
        byte[] bArr = null;
        FileOutputStream fileOutputStream4 = null;
        FileOutputStream fileOutputStream5 = null;
        FileOutputStream fileOutputStream6 = null;
        int iM5484 = 0;
        Throwable th = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755336) {
                case 2:
                case 31691:
                case 1709072:
                    if (C0381.m5127() <= 0) {
                        C0083.m448();
                    } else {
                        str = "ۣۤۤ";
                        continue;
                    }
                case 269:
                    return;
                case 270:
                case 29259:
                    if (C0377.m4944() <= 0) {
                        str = "ۨۧ";
                    } else {
                        str = "ۢۨ۟";
                        continue;
                    }
                case 334:
                    C0206.m1819(new Closeable[]{inputStream, fileOutputStream2});
                    str = "ۨۧۤ";
                    continue;
                case 449:
                    if (C0370.m3284() >= 0) {
                        C0083.m448();
                        str = "ۣۣ۟";
                    } else {
                        str = "ۥ۠ۤ";
                        continue;
                    }
                case 462:
                    str = "ۥۡۦ";
                    continue;
                case 493:
                    C0206.m1819(new Closeable[]{inputStream, fileOutputStream5});
                    str = "۠ۥۧ";
                    continue;
                case 3341:
                    C0383.m5201(fileOutputStream5, bArr, 0, iM5484);
                    str = "ۣۧ";
                    continue;
                case 25418:
                    if (C0390.m5512() <= 0) {
                        C0382.m5180();
                    } else {
                        str = "ۣ۟ۢ";
                        continue;
                    }
                case 25456:
                case 32462:
                    if (C0399.m5914() <= 0) {
                        C0155.m1294();
                    } else {
                        str = "ۨۧۤ";
                        continue;
                    }
                case 25495:
                case 1709228:
                    str = "ۤۢ";
                    continue;
                case 25522:
                    fileOutputStream = null;
                    if (C0121.m1023() >= 0) {
                        C0370.m3284();
                        str = "۠ۥۣ";
                    } else {
                        str = "ۥۡۦ";
                        continue;
                    }
                case 25576:
                    str = "ۨۥۣ";
                    continue;
                case 28465:
                    if (C0074.m307() >= 0) {
                        C0379.m5056();
                        str = "ۢۡۧ";
                    } else {
                        str = "ۣۧ";
                        continue;
                    }
                case 29263:
                    bArr = new byte[Config.MAX_CACHE_JSON_CAPACIT_EXCEPTION];
                    if (C0229.m2064() >= 0) {
                        C0191.m1627();
                    } else {
                        str = "ۤۢ";
                        continue;
                    }
                case 29293:
                    if (C0279.m2491() >= 0) {
                        str = "ۥۤۧ";
                    } else {
                        str = "ۤۥۨ";
                        continue;
                    }
                case 29322:
                    fileOutputStream3 = null;
                    str = "۠ۥ۟";
                    continue;
                case 29355:
                    C0206.m1819(new Closeable[]{inputStream, fileOutputStream4});
                    str = "ۢۨۡ";
                    continue;
                case 29954:
                    str = "ۥۣۡ";
                    fileOutputStream6 = fileOutputStream;
                    continue;
                case 29967:
                    try {
                        str = "ۥ۠ۤ";
                        fileOutputStream5 = new FileOutputStream(file);
                        continue;
                    } catch (Exception e2) {
                        e = e2;
                        if (C0228.m2012() <= 0) {
                            C0380.m5068();
                            str = "ۣۣۡ";
                            fileOutputStream2 = fileOutputStream3;
                        } else {
                            str = "ۨۧۥ";
                            fileOutputStream2 = fileOutputStream3;
                        }
                    }
                case 30049:
                    if (C0369.m3256() <= 0) {
                        C0400.m5961();
                    } else {
                        str = "ۤۥۨ";
                        continue;
                    }
                case 30413:
                    if (C0362.m3122() < 0) {
                        str = "ۣۤۡ";
                    } else {
                        continue;
                    }
                case 31370:
                    break;
                case 31633:
                    str = "ۣۢ";
                    fileOutputStream6 = fileOutputStream2;
                    continue;
                case 31635:
                    throw th;
                case 32461:
                    if (iM5484 == -1) {
                        break;
                    } else {
                        str = C0385.m5282() >= 0 ? "ۣۤ" : "ۧۥۣ";
                    }
                case 1709076:
                    if (C0390.m5512() > 0) {
                        str = "ۣ۠ۤ";
                    } else {
                        continue;
                    }
                case 1709193:
                    try {
                        C0078.m344(e);
                        if (C0399.m5914() <= 0) {
                            C0378.m4998();
                            str = "ۢۡۥ";
                        } else {
                            str = "ۨۥۣ";
                            continue;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (C0073.m265() <= 0) {
                            C0073.m265();
                            fileOutputStream4 = fileOutputStream6;
                        } else {
                            str = "ۨ۟ۡ";
                            fileOutputStream4 = fileOutputStream6;
                        }
                    }
                case 1709238:
                    try {
                        iM5484 = C0389.m5484(inputStream, bArr);
                        str = "ۣ۟ۡ";
                        continue;
                    } catch (Exception e3) {
                        e = e3;
                        if (C0393.m5668() <= 0) {
                            fileOutputStream2 = fileOutputStream5;
                        } else {
                            str = "ۤۥۤ";
                            fileOutputStream2 = fileOutputStream5;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str = "ۢۥۦ";
                        fileOutputStream4 = fileOutputStream5;
                    }
            }
            if (C0335.m2923() < 0) {
                str = "ۨۢ۟";
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c5 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2809(java.io.File r13, long r14) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.C0327.m2809(java.io.File, long):boolean");
    }

    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    public static String m2810(Context context, String str) throws Throwable {
        String str2 = "۟۠ۨ";
        Throwable th = null;
        String str3 = null;
        byte[] bArr = null;
        InputStream inputStream = null;
        InputStream inputStream2 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56446) {
                case 33:
                    if (C0386.m5322() > 0) {
                        str2 = "۠ۨۧ";
                        inputStream2 = inputStream;
                        break;
                    } else {
                        str2 = "ۣۧۤ";
                        inputStream2 = inputStream;
                        break;
                    }
                case 1709338:
                    if (C0400.m5961() > 0) {
                        str2 = "ۥۡۧ";
                        inputStream2 = inputStream;
                        break;
                    } else {
                        C0183.m1464();
                        inputStream2 = inputStream;
                        break;
                    }
                case 1709424:
                    return str3;
                case 1709500:
                    str2 = "ۥۥۧ";
                    break;
                case 1710684:
                    String str4 = new String(bArr);
                    if (C0362.m3122() < 0) {
                        str2 = "ۢۦۡ";
                        str3 = str4;
                        break;
                    } else {
                        C0089.m592();
                        str3 = str4;
                        break;
                    }
                case 1728949:
                    if (C0009.m36() < 0) {
                        str2 = "ۢۡۦ";
                        break;
                    } else {
                        str2 = "ۦۥ۠";
                        break;
                    }
                case 1729080:
                    str2 = "ۢۦۡ";
                    break;
                case 1729081:
                    if (C0379.m5056() > 0) {
                        str2 = "ۣۤ۠";
                        inputStream2 = null;
                        break;
                    } else {
                        C0420.m6215();
                        inputStream2 = null;
                        break;
                    }
                case 1729945:
                    str2 = "ۢۨۢ";
                    break;
                case 1730234:
                    throw th;
                case 1731267:
                    byte[] bArr2 = new byte[C0183.m1504(inputStream)];
                    if (C0377.m4944() > 0) {
                        str2 = "ۨۤ۠";
                        bArr = bArr2;
                        break;
                    } else {
                        bArr = bArr2;
                        break;
                    }
                case 1732319:
                    if (C0377.m4944() > 0) {
                        str2 = "ۥۥۧ";
                        break;
                    } else {
                        str2 = "ۣۢۧ";
                        break;
                    }
                case 1732345:
                    try {
                        try {
                            C0389.m5484(inputStream, bArr);
                            if (C0179.m1427() > 0) {
                                str2 = "ۣۡۤ";
                                inputStream2 = inputStream;
                                break;
                            } else {
                                inputStream2 = inputStream;
                                break;
                            }
                        } catch (IOException e) {
                            throw new NullPointerException();
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (C0368.m3171() >= 0) {
                            break;
                        } else {
                            str2 = "۟ۦۢ";
                            break;
                        }
                    }
                case 1732386:
                    InputStream inputStreamM38 = C0009.m38(C0388.m5427(context), str);
                    if (C0228.m2012() > 0) {
                        str2 = "ۣۢ";
                        inputStream = inputStreamM38;
                        break;
                    } else {
                        C0388.m5430();
                        inputStream = inputStreamM38;
                        break;
                    }
                case 1732446:
                case 1735589:
                    str2 = "۠ۡ۟";
                    break;
                case 1732451:
                    C0206.m1819(new Closeable[]{inputStream});
                    str2 = "ۨۡۧ";
                    break;
                case 1733500:
                    if (C0383.m5203() > 0) {
                        str2 = "ۣۧۨ";
                        break;
                    } else {
                        C0362.m3122();
                        break;
                    }
                case 1734272:
                    C0206.m1819(new Closeable[]{inputStream2});
                    if (C0164.m1359() >= 0) {
                        break;
                    } else {
                        str2 = "ۤۧۧ";
                        break;
                    }
                case 1734561:
                    if (C0164.m1359() < 0) {
                        str2 = "ۣۥ۟";
                        break;
                    } else {
                        C0291.m2568();
                        str2 = "ۣۨۧ";
                        break;
                    }
                case 1735513:
                    str2 = "ۨۧۡ";
                    break;
                case 1735519:
                    if (C0394.m5672() > 0) {
                        str2 = "۟۠ۨ";
                        break;
                    } else {
                        str2 = "ۥۡۢ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̗̗̙, reason: not valid java name and contains not printable characters */
    public static void m2811(String str) {
        String str2 = "ۨۡۢ";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753697) {
                case 1090:
                    break;
                case 1121:
                case 27937:
                    return;
                case 2920:
                    if (!C0164.m1363(str)) {
                        break;
                    } else {
                        str2 = C0390.m5512() <= 0 ? "ۧۢۡ" : "ۡۥۤ";
                    }
                case 32678:
                    if (C0073.m265() <= 0) {
                        str2 = "۠ۥۡ";
                    } else {
                        str2 = "ۨۡۢ";
                        continue;
                    }
                case 1711868:
                    C0086.m529(new File(str));
                    if (C0383.m5203() > 0) {
                        str2 = "ۧۧ۠";
                    } else {
                        continue;
                    }
            }
            if (C0388.m5430() <= 0) {
                C0384.m5278();
            } else {
                str2 = "ۥۢ";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f4 A[SYNTHETIC] */
    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2812(java.io.File r8) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.C0327.m2812(java.io.File):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0014 A[SYNTHETIC] */
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File m2813(java.io.File r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "ۨۨ۟"
        L2:
            int r1 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r2 = 1754379(0x1ac50b, float:2.458409E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 3139: goto Le;
                case 3284: goto L3b;
                case 25334: goto L5c;
                case 28173: goto L32;
                case 28182: goto L4c;
                case 29448: goto L29;
                case 29583: goto L1a;
                case 30959: goto L18;
                case 1711855: goto L5c;
                default: goto Ld;
            }
        Ld:
            goto L2
        Le:
            int r1 = com.cloudinject.feature.p023.C0335.m2923()
            if (r1 < 0) goto L59
            mirrorb.android.content.C0380.m5068()
            goto L2
        L18:
            r0 = 0
        L19:
            return r0
        L1a:
            boolean r1 = com.cloudinject.core.p009.p012.C0164.m1363(r4)
            if (r1 == 0) goto Le
            int r1 = mirrorb.android.app.servertransaction.C0378.m4998()
            if (r1 <= 0) goto L2
            java.lang.String r0 = "ۣ۟۟"
            goto L2
        L29:
            int r1 = mirrorb.com.android.internal.C0398.m5833()
            if (r1 <= 0) goto L2
            java.lang.String r0 = "۟ۧۥ"
            goto L2
        L32:
            java.lang.String r0 = mirrorb.java.lang.C0400.m5919(r3)
            java.io.File r0 = com.cloudinject.feature.p021.p022.C0279.m2484(r0, r4)
            goto L19
        L3b:
            if (r3 == 0) goto L5c
            int r0 = mirrorb.com.android.internal.content.C0395.m5698()
            if (r0 < 0) goto L49
            mirrorb.com.android.internal.app.C0394.m5672()
            java.lang.String r0 = "ۧ۠"
            goto L2
        L49:
            java.lang.String r0 = "ۣۣۤ"
            goto L2
        L4c:
            int r1 = android.net.wifi.C0078.m361()
            if (r1 > 0) goto L56
            mirrorb.android.hardware.fingerprint.C0381.m5127()
            goto L2
        L56:
            java.lang.String r0 = "ۨۨ۟"
            goto L2
        L59:
            java.lang.String r0 = "۠ۡۧ"
            goto L2
        L5c:
            java.lang.String r0 = "ۥۢۡ"
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.C0327.m2813(java.io.File, java.lang.String):java.io.File");
    }

    /* renamed from: ̙̖, reason: not valid java name and contains not printable characters */
    public static void m2814(File file) {
        String str = "ۡۨۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751497) {
                case 1090:
                    return;
                case 2991:
                    C0399.m5868(file);
                    if (C0388.m5430() > 0) {
                        str = "ۥ۟ۥ";
                    } else {
                        continue;
                    }
                case 3956:
                    break;
                case 5719:
                    if (C0379.m5061(file)) {
                        break;
                    } else {
                        str = C0399.m5914() <= 0 ? "ۦۥ" : "ۢ۠ۤ";
                    }
                case 28715:
                    if (C0387.m5374() < 0) {
                        str = "ۡۨۥ";
                    } else {
                        continue;
                    }
            }
            if (C0335.m2923() >= 0) {
                C0086.m500();
                str = "ۥۦۥ";
            } else {
                str = "ۥ۟ۥ";
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0002 A[SYNTHETIC] */
    /* renamed from: ̙̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File m2815(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "ۣ۟"
        L2:
            int r1 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r2 = 1752741(0x1abea5, float:2.456113E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 3527: goto Le;
                case 4357: goto L2b;
                case 4606: goto L31;
                case 5229: goto L20;
                case 6426: goto L37;
                case 6438: goto L11;
                case 30561: goto L37;
                case 1729856: goto L34;
                case 1729857: goto L22;
                default: goto Ld;
            }
        Ld:
            goto L2
        Le:
            java.lang.String r0 = "ۣ۟"
            goto L2
        L11:
            boolean r1 = com.cloudinject.core.p009.p012.C0164.m1363(r4)
            if (r1 == 0) goto L34
            int r1 = mirrorb.dalvik.system.C0399.m5914()
            if (r1 <= 0) goto L2
            java.lang.String r0 = "ۡۦ۠"
            goto L2
        L20:
            r0 = 0
        L21:
            return r0
        L22:
            boolean r1 = com.cloudinject.core.p009.p012.C0164.m1363(r3)
            if (r1 != 0) goto L37
            java.lang.String r0 = "ۣ۟ۧ"
            goto L2
        L2b:
            java.io.File r0 = new java.io.File
            r0.<init>(r3, r4)
            goto L21
        L31:
            java.lang.String r0 = "۟ۥۥ"
            goto L2
        L34:
            java.lang.String r0 = "ۡۨۧ"
            goto L2
        L37:
            int r1 = com.cloudinject.core.p013.C0179.m1427()
            if (r1 <= 0) goto L2
            java.lang.String r0 = "۠۟ۧ"
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.C0327.m2815(java.lang.String, java.lang.String):java.io.File");
    }
}
