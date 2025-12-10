package com.cloudinject.feature.p023;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.database.C0074;
import android.net.C0083;
import android.net.wifi.C0078;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;

/* renamed from: com.cloudinject.feature.̙̙.̖̗̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0298 {
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    public static void m2722(File file, String str) throws Throwable {
        String str2 = "ۢۧ۠";
        Exception e = null;
        BufferedWriter bufferedWriter = null;
        Throwable th = null;
        BufferedWriter bufferedWriter2 = null;
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedWriter bufferedWriter3 = null;
        BufferedWriter bufferedWriter4 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1754531) {
                case 107:
                case 30724:
                    str2 = "۟ۡ";
                    break;
                case 203:
                    C0206.m1819(new Closeable[]{bufferedWriter2});
                    str2 = "ۣۤۧ";
                    break;
                case 899:
                    if (C0388.m5430() > 0) {
                        str2 = "ۣۨۢ";
                        bufferedWriter4 = null;
                        break;
                    } else {
                        bufferedWriter4 = null;
                        break;
                    }
                case 1924:
                case 3279:
                case 27459:
                    str2 = "ۣۧۢ";
                    break;
                case 3147:
                    C0184.m1520(bufferedWriter3);
                    str2 = "ۢۦۡ";
                    break;
                case 3210:
                    try {
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            if (C0164.m1359() < 0) {
                                str2 = "ۣۡ";
                                fileOutputStream = fileOutputStream2;
                                break;
                            } else {
                                C0379.m5056();
                                fileOutputStream = fileOutputStream2;
                                break;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str2 = "ۥۥۧ";
                            bufferedWriter = null;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = "ۡۢۡ";
                        bufferedWriter2 = bufferedWriter4;
                        break;
                    }
                case 25120:
                    if (C0385.m5282() < 0) {
                        str2 = "ۥ۠ۢ";
                        break;
                    } else {
                        C0376.m4906();
                        break;
                    }
                case 27270:
                    OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(fileOutputStream);
                    if (C0183.m1464() > 0) {
                        str2 = "ۣۤۡ";
                        outputStreamWriter = outputStreamWriter2;
                        break;
                    } else {
                        C0078.m361();
                        str2 = "ۣۢۨ";
                        outputStreamWriter = outputStreamWriter2;
                        break;
                    }
                case 27327:
                    if (C0376.m4906() > 0) {
                        str2 = "ۢۦۡ";
                        break;
                    } else {
                        C0088.m573();
                        break;
                    }
                case 27460:
                    try {
                        C0060.m197(bufferedWriter3, str);
                        if (C0379.m5056() > 0) {
                            str2 = "ۨۨۨ";
                            break;
                        } else {
                            C0370.m3284();
                            break;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str2 = "ۣۣۡ";
                        bufferedWriter = bufferedWriter3;
                        break;
                    } catch (Throwable th3) {
                        th = th3;
                        if (C0380.m5068() > 0) {
                            str2 = "ۦۦۧ";
                            bufferedWriter2 = bufferedWriter3;
                            break;
                        } else {
                            bufferedWriter2 = bufferedWriter3;
                            break;
                        }
                    }
                case 27494:
                    str2 = "ۣۨ";
                    break;
                case 29351:
                    if (C0009.m36() < 0) {
                        str2 = "ۢۧ۠";
                        break;
                    } else {
                        C0376.m4906();
                        break;
                    }
                case 29445:
                    throw th;
                case 29474:
                case 31716:
                    if (C0086.m500() > 0) {
                        str2 = "ۥۧۢ";
                        break;
                    } else {
                        C0383.m5203();
                        break;
                    }
                case 29505:
                    BufferedWriter bufferedWriter5 = new BufferedWriter(outputStreamWriter);
                    if (C0388.m5430() > 0) {
                        str2 = "ۡۢۨ";
                        bufferedWriter3 = bufferedWriter5;
                        break;
                    } else {
                        C0380.m5068();
                        bufferedWriter3 = bufferedWriter5;
                        break;
                    }
                case 30360:
                    if (C0389.m5481() > 0) {
                        str2 = "ۡۡۥ";
                        break;
                    } else {
                        C0334.m2866();
                        str2 = "ۨۤ۠";
                        break;
                    }
                case 30398:
                    C0206.m1819(new Closeable[]{bufferedWriter3});
                    str2 = "ۣ۟ۧ";
                    break;
                case 30693:
                    str2 = "ۣۨ";
                    break;
                case 31523:
                    if (C0179.m1427() > 0) {
                        str2 = "ۥۤۢ";
                        bufferedWriter4 = bufferedWriter;
                        break;
                    } else {
                        C0184.m1524();
                        str2 = "۟ۦ۟";
                        bufferedWriter4 = bufferedWriter;
                        break;
                    }
                case 31527:
                    str2 = "ۡۢۨ";
                    break;
                case 31616:
                    C0078.m344(e);
                    str2 = "ۤۡۡ";
                    break;
                case 31658:
                    if (C0400.m5961() > 0) {
                        str2 = "ۤۡۡ";
                        break;
                    } else {
                        C0335.m2923();
                        break;
                    }
                case 32679:
                    C0206.m1819(new Closeable[]{bufferedWriter});
                    str2 = "۟ۡ";
                    break;
                case 32737:
                    if (C0395.m5698() < 0) {
                        str2 = "ۣۦۥ";
                        bufferedWriter4 = null;
                        break;
                    } else {
                        bufferedWriter4 = null;
                        break;
                    }
                case 1710465:
                    str2 = "ۡۤۨ";
                    bufferedWriter4 = null;
                    break;
                case 1710534:
                    if (C0334.m2866() > 0) {
                        str2 = "ۧۨۡ";
                        bufferedWriter4 = null;
                        break;
                    } else {
                        bufferedWriter4 = null;
                        break;
                    }
                case 1711681:
                    return;
            }
        }
    }

    /* renamed from: ̗̗, reason: not valid java name and contains not printable characters */
    public static String m2723(Context context, String str) throws Throwable {
        String str2 = "۟ۢۢ";
        Throwable th = null;
        String str3 = null;
        byte[] bArr = null;
        InputStream inputStream = null;
        InputStream inputStream2 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1753575) {
                case 15:
                    str2 = "ۦۣۢ";
                    continue;
                case 34:
                    try {
                        try {
                            InputStream inputStreamM38 = C0009.m38(C0388.m5427(context), str);
                            if (C0346.m3059() >= 0) {
                                inputStream = inputStreamM38;
                            } else {
                                str2 = "ۣۡ۠";
                                inputStream = inputStreamM38;
                                continue;
                            }
                        } catch (IOException e) {
                            throw new NullPointerException();
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (C0060.m216() <= 0) {
                            C0377.m4944();
                        } else {
                            str2 = "ۧۤۢ";
                        }
                    }
                case 37:
                    byte[] bArr2 = new byte[C0183.m1504(inputStream)];
                    if (C0385.m5282() >= 0) {
                        bArr = bArr2;
                    } else {
                        str2 = "ۣۣۡ";
                        bArr = bArr2;
                        continue;
                    }
                case 995:
                    if (C0376.m4906() <= 0) {
                        C0398.m5833();
                        inputStream2 = null;
                    } else {
                        str2 = "ۦۤۦ";
                        inputStream2 = null;
                        continue;
                    }
                case 999:
                    return str3;
                case 1090:
                case 2080:
                    if (C0368.m3171() >= 0) {
                        C0362.m3122();
                    } else {
                        str2 = "ۤۤ۟";
                        continue;
                    }
                case 1225:
                    C0206.m1819(new Closeable[]{inputStream});
                    if (C0380.m5068() > 0) {
                        str2 = "ۦۥ۟";
                    } else {
                        continue;
                    }
                case 2083:
                    if (C0399.m5914() <= 0) {
                        C0334.m2866();
                    } else {
                        str2 = "۟ۢۢ";
                        continue;
                    }
                case 26296:
                    if (C0386.m5322() <= 0) {
                        str2 = "ۣۨ۠";
                    } else {
                        str2 = "ۥۣۧ";
                        continue;
                    }
                case 27134:
                    C0389.m5484(inputStream, bArr);
                    str2 = "ۥۣۨ";
                    inputStream2 = inputStream;
                    continue;
                case 27195:
                    str2 = "ۧ۠ۧ";
                    str3 = new String(bArr);
                    continue;
                case 27329:
                    throw th;
                case 28441:
                    if (C0395.m5698() >= 0) {
                        str2 = "ۢۤۢ";
                        inputStream2 = inputStream;
                    } else {
                        str2 = "ۤۨ";
                        inputStream2 = inputStream;
                        continue;
                    }
                case 29348:
                    str2 = "ۧ۠ۧ";
                    continue;
                case 30535:
                    str2 = "ۦۥۣ";
                    continue;
                case 30561:
                    return null;
                case 30626:
                    if (C0078.m361() <= 0) {
                        str2 = "۟ۤۢ";
                        inputStream2 = inputStream;
                    } else {
                        str2 = "ۥۨۥ";
                        inputStream2 = inputStream;
                        continue;
                    }
                case 31672:
                    C0206.m1819(new Closeable[]{inputStream2});
                    if (C0369.m3256() <= 0) {
                        str2 = "ۨۢۤ";
                    } else {
                        str2 = "۠ۢۨ";
                        continue;
                    }
                case 31851:
                    if (C0389.m5481() > 0) {
                        str2 = "ۦۥۣ";
                    } else {
                        continue;
                    }
                case 32581:
                    if (C0074.m307() >= 0) {
                        C0398.m5833();
                    } else {
                        str2 = "۟ۨۢ";
                        continue;
                    }
                case 32583:
                    if (C0083.m448() >= 0) {
                        str2 = "ۥۥۥ";
                    } else {
                        str2 = "۠ۨۤ";
                        continue;
                    }
                case 32750:
                    if (context != null) {
                        break;
                    } else if (C0025.m118() > 0) {
                        str2 = "ۣۣۦ";
                    }
                case 1711390:
                    break;
                case 1711459:
                    if (C0379.m5056() <= 0) {
                        C0393.m5668();
                    } else {
                        str2 = "ۦۣ۟";
                        continue;
                    }
            }
            str2 = "ۣۤۡ";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0021 A[SYNTHETIC] */
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2724(android.content.Context r19, java.lang.String r20, java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.feature.p023.C0298.m2724(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
