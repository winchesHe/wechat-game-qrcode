package com.cloudinject;

import android.app.Activity;
import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.os.AsyncTask;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
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
import com.facebook.stetho.server.http.HttpStatus;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
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
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* loaded from: classes6.dex */
public class CustomDialog extends AsyncTask<String, Exception, C0363> implements DialogInterface.OnClickListener {

    /* renamed from: ̗̖̗̗̖̙̖, reason: not valid java name and contains not printable characters */
    private static CustomDialog f166;

    /* renamed from: ̗̗̙̖̖̖̖, reason: not valid java name and contains not printable characters */
    private static SharedPreferences f167;

    /* renamed from: ̗̗̙̙̙̖̖, reason: not valid java name and contains not printable characters */
    private static boolean f168;

    /* renamed from: ̗̗̙̙̙̖̗, reason: not valid java name and contains not printable characters */
    private static Activity f169;

    static {
        String str = "ۧ۟ۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750686) {
                case 96:
                    C0385.m5310(C0155.m1279());
                    str = "ۢ۟ۥ";
                    break;
                case 1238:
                    C0385.m5310(C0334.m2879());
                    if (C0164.m1359() >= 0) {
                        break;
                    } else {
                        str = "ۦۨۡ";
                        break;
                    }
                case 29582:
                    f166 = new CustomDialog();
                    if (C0382.m5180() > 0) {
                        str = "ۣۧۢ";
                        break;
                    } else {
                        str = "ۣ۠ۢ";
                        break;
                    }
                case 29889:
                    return;
                case 30514:
                    if (C0073.m265() > 0) {
                        str = "ۧ۟ۨ";
                        break;
                    } else {
                        C0346.m3059();
                        break;
                    }
            }
        }
    }

    /* renamed from: ̖̙, reason: not valid java name and contains not printable characters */
    private static String m859(String str) {
        String str2;
        byte[] bArrM257 = null;
        SecretKeySpec secretKeySpec = null;
        String str3 = null;
        Object[] objArr = null;
        byte[] bArrM985 = null;
        char[] cArr = null;
        SecretKeyFactory secretKeyFactory = null;
        Cipher cipher = null;
        int iIntValue = 0;
        int iIntValue2 = 0;
        String str4 = null;
        PBEKeySpec pBEKeySpec = null;
        int i = 0;
        IvParameterSpec ivParameterSpec = null;
        byte[] bArr = null;
        String str5 = null;
        String str6 = null;
        Object obj = "ۥ۠ۦ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1750598) {
                case 37:
                    return str5;
                case 167:
                    Cipher cipherM1435 = C0179.m1435(C0385.m5310(C0420.m6233()));
                    IvParameterSpec ivParameterSpec2 = new IvParameterSpec(C0121.m985(C0385.m5310(C0060.m195()), str3));
                    if (C0164.m1359() >= 0) {
                        ivParameterSpec = ivParameterSpec2;
                        cipher = cipherM1435;
                    } else {
                        obj = "۟ۥۣ";
                        ivParameterSpec = ivParameterSpec2;
                        cipher = cipherM1435;
                        continue;
                    }
                case 1191:
                    obj = "ۦۤۧ";
                    continue;
                case 1309:
                    if (bArr == null) {
                        str2 = str4;
                        break;
                    } else if (C0191.m1627() >= 0) {
                        str5 = str4;
                    } else {
                        obj = "۟ۤۧ";
                        str5 = str4;
                    }
                case 2053:
                    if (C0390.m5512() <= 0) {
                        C0380.m5068();
                        str4 = str;
                    } else {
                        obj = "ۡۤۤ";
                        str4 = str;
                        continue;
                    }
                case 3053:
                    Object[] objArr2 = new Object[3];
                    objArr2[1] = new Integer(6078878);
                    objArr = objArr2;
                    obj = "ۡ۠ۡ";
                    continue;
                case 3289:
                case 32717:
                    if (C0387.m5374() >= 0) {
                        C0420.m6215();
                        obj = "۠۠ۦ";
                    } else {
                        obj = "ۢۨۡ";
                        continue;
                    }
                case 4509:
                    secretKeySpec = new SecretKeySpec(C0383.m5184(C0206.m1816(secretKeyFactory, pBEKeySpec)), C0385.m5310(C0025.m107()));
                    obj = "ۣۦۤ";
                    continue;
                case 4580:
                    str6 = new String(bArr);
                    if (C0369.m3256() <= 0) {
                        C0395.m5698();
                    } else {
                        obj = "ۦۦ۟";
                        continue;
                    }
                case 4603:
                    iIntValue2 = ((Integer) objArr[2]).intValue();
                    if (C0121.m1023() < 0) {
                        obj = "ۣۨۦ";
                    } else {
                        continue;
                    }
                case 6372:
                    objArr[0] = new Integer(7191117);
                    objArr[2] = new Integer(5295155);
                    if (C0086.m500() <= 0) {
                        obj = "ۣۨ۟";
                    } else {
                        obj = "ۥۥۣ";
                        continue;
                    }
                case 6503:
                    String strM5310 = C0385.m5310(C0377.m4936());
                    if (C0025.m118() <= 0) {
                        C0391.m5571();
                        str3 = strM5310;
                    } else {
                        obj = "ۦۤۧ";
                        str3 = strM5310;
                        continue;
                    }
                case 7335:
                    if (C0191.m1627() < 0) {
                        obj = "ۥ۠ۦ";
                    } else {
                        continue;
                    }
                case 7482:
                    int iIntValue3 = ((Integer) objArr[0]).intValue();
                    if (C0387.m5374() >= 0) {
                        i = iIntValue3;
                        obj = "ۡۡۨ";
                    } else {
                        i = iIntValue3;
                        obj = "۠۟";
                        continue;
                    }
                case 7520:
                    if (C0073.m265() <= 0) {
                        bArr = bArrM257;
                    } else {
                        obj = "ۦۥۡ";
                        bArr = bArrM257;
                        continue;
                    }
                case 7547:
                    bArrM985 = C0121.m985(C0385.m5310(C0229.m2047()), str3);
                    obj = "ۧۧ۟";
                    continue;
                case 7769:
                    if (C0388.m5430() <= 0) {
                        C0376.m4906();
                    } else {
                        obj = "۠ۢۨ";
                        continue;
                    }
                case 29625:
                    try {
                        iIntValue = ((Integer) objArr[1]).intValue();
                        obj = "۠ۥۡ";
                        continue;
                    } catch (Exception e) {
                        if (C0191.m1627() >= 0) {
                            C0393.m5668();
                            bArr = null;
                            obj = "ۤۡۨ";
                        } else {
                            bArr = null;
                            obj = "ۤۦۡ";
                        }
                    }
                case 29764:
                    if (C0387.m5374() >= 0) {
                        C0155.m1294();
                    } else {
                        obj = "ۨۥۨ";
                        continue;
                    }
                case 29785:
                    obj = "ۣۢۢ";
                    str5 = str6;
                    continue;
                case 30639:
                    SecretKeyFactory secretKeyFactoryM1416 = C0179.m1416(C0385.m5310(C0420.m6214()));
                    char[] cArrM5205 = C0383.m5205(C0385.m5310(C0370.m3296()));
                    if (C0398.m5833() <= 0) {
                        C0386.m5322();
                        cArr = cArrM5205;
                        secretKeyFactory = secretKeyFactoryM1416;
                    } else {
                        obj = "ۣ۠۠";
                        cArr = cArrM5205;
                        secretKeyFactory = secretKeyFactoryM1416;
                        continue;
                    }
                case 32525:
                    C0393.m5642(cipher, ((iIntValue2 ^ (-1)) & 5295153) | ((-5295154) & iIntValue2), secretKeySpec, ivParameterSpec);
                    obj = "ۨۨۥ";
                    continue;
                case 32675:
                    bArrM257 = C0073.m257(cipher, C0380.m5070(str4, 0));
                    if (C0386.m5322() > 0) {
                        obj = "۠ۢۨ";
                    } else {
                        continue;
                    }
                case 1731288:
                    str2 = str5;
                    break;
                case 1732025:
                    PBEKeySpec pBEKeySpec2 = new PBEKeySpec(cArr, bArrM985, ((iIntValue ^ (-1)) & 6078875) | ((-6078876) & iIntValue), ((i ^ (-1)) & 7191373) | ((-7191374) & i));
                    if (C0368.m3171() >= 0) {
                        C0164.m1359();
                        pBEKeySpec = pBEKeySpec2;
                    } else {
                        obj = "۟ۦۢ";
                        pBEKeySpec = pBEKeySpec2;
                        continue;
                    }
            }
            if (C0083.m448() >= 0) {
                C0397.m5814();
                str5 = str2;
                obj = "ۣ۠۟";
            } else {
                str5 = str2;
                obj = "ۣۢۢ";
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:337:0x0680 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x067c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0663 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x065c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0652 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x064d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x068e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x068a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0039 A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.cloudinject.C0363 m860(java.lang.String[] r28) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 2030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.CustomDialog.m860(java.lang.String[]):com.cloudinject.̙");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x001b A[SYNTHETIC] */
    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m861(android.app.Activity r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.CustomDialog.m861(android.app.Activity, java.lang.String):void");
    }

    /* renamed from: ̗̙̖, reason: not valid java name and contains not printable characters */
    private final String m863(String str) {
        String strM5019 = null;
        String str2 = "۠ۡ۟";
        String strM891 = null;
        String strM4932 = null;
        StringBuilder sb = null;
        String str3 = null;
        StringBuilder sb2 = null;
        String str4 = null;
        String strM5220 = null;
        String str5 = null;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1752643) {
                case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                    if (C0392.m5595() <= 0) {
                        C0073.m265();
                        str2 = "ۨۢۦ";
                        str4 = strM5220;
                    } else {
                        str2 = "۟ۧۤ";
                        str4 = strM5220;
                        continue;
                    }
                case 933:
                    C0060.m211(sb, str);
                    if (C0379.m5056() <= 0) {
                        C0346.m3059();
                    } else {
                        str2 = "ۤۦ";
                        continue;
                    }
                case 1056:
                    return str4;
                case 1244:
                    if (C0420.m6215() < 0) {
                        str2 = "۠ۡ۟";
                    } else {
                        continue;
                    }
                case 1927:
                    strM891 = m891();
                    if (C0335.m2923() >= 0) {
                        C0184.m1524();
                        str2 = "ۣۤۡ";
                    } else {
                        str2 = "۠ۡ۠";
                        continue;
                    }
                case 3357:
                    str2 = "ۨۢۦ";
                    continue;
                case 5308:
                    strM5019 = C0379.m5019(strM891, C0395.m5677(strM891, str3) - (0 - C0191.m1625(str3)), C0395.m5677(m891(), strM4932));
                    str2 = "ۨۨۧ";
                    continue;
                case 5309:
                    String strM5310 = C0385.m5310(C0291.m2551());
                    if (C0073.m265() <= 0) {
                        C0073.m265();
                        str5 = strM5310;
                    } else {
                        str2 = "ۦۦۤ";
                        str5 = strM5310;
                        continue;
                    }
                case 5533:
                    str2 = "ۣۧۤ";
                    str4 = strM5220;
                    continue;
                case 5627:
                    C0060.m211(sb2, str5);
                    if (C0382.m5180() <= 0) {
                        C0382.m5180();
                    } else {
                        str2 = "ۣۨ۠";
                        continue;
                    }
                case 6591:
                    if (str == null) {
                        break;
                    } else if (C0369.m3256() <= 0) {
                        C0384.m5278();
                        str2 = "ۣۤ۠";
                    } else {
                        str2 = "۠ۨۦ";
                    }
                case 30470:
                    String strM49322 = C0377.m4932(sb2);
                    if (C0370.m3284() >= 0) {
                        C0385.m5282();
                        str2 = "ۥۦۥ";
                        str3 = strM49322;
                    } else {
                        str2 = "ۧ۟ۡ";
                        str3 = strM49322;
                        continue;
                    }
                case 30575:
                case 32527:
                    break;
                case 30628:
                    if (C0393.m5668() <= 0) {
                        str4 = strM5019;
                    } else {
                        str2 = "ۢۨۤ";
                        str4 = strM5019;
                        continue;
                    }
                case 30822:
                    if (C0025.m118() > 0) {
                        str2 = "ۨۨۧ";
                    } else {
                        continue;
                    }
                case 31562:
                    StringBuilder sb3 = new StringBuilder(C0385.m5310(C0191.m1623()));
                    if (C0362.m3122() >= 0) {
                        C0368.m3171();
                        sb = sb3;
                    } else {
                        str2 = "ۥۣۢ";
                        sb = sb3;
                        continue;
                    }
                case 31691:
                    if (C0389.m5486(C0392.m5584(str))) {
                        break;
                    } else {
                        str2 = "ۦۦ۠";
                    }
                case 31843:
                    StringBuilder sb4 = new StringBuilder(C0385.m5310(C0228.m1999()));
                    if (C0335.m2923() >= 0) {
                        C0229.m2064();
                        str2 = "ۤ۠ۥ";
                        sb2 = sb4;
                    } else {
                        str2 = "۠۠";
                        sb2 = sb4;
                        continue;
                    }
                case 31847:
                    strM5220 = C0383.m5220();
                    str2 = "ۥۡۢ";
                    continue;
                case 32712:
                    if (C0362.m3122() >= 0) {
                        C0083.m448();
                    } else {
                        str2 = "۠ۨۦ";
                        continue;
                    }
                case 1729091:
                    C0060.m211(sb2, str);
                    if (C0184.m1524() >= 0) {
                        str2 = "ۣۣ۠";
                    } else {
                        str2 = "۠ۧ۟";
                        continue;
                    }
                case 1729217:
                    C0060.m211(sb, str5);
                    if (C0370.m3284() >= 0) {
                        C0009.m36();
                    } else {
                        str2 = "۟۠";
                        continue;
                    }
                case 1729954:
                    try {
                        strM4932 = C0377.m4932(sb);
                        if (C0377.m4944() <= 0) {
                            C0074.m307();
                            str2 = "ۡ۟ۤ";
                        } else {
                            str2 = "ۤ۟۟";
                            continue;
                        }
                    } catch (Exception e) {
                        m882(this, new Exception[]{e});
                        if (C0382.m5180() <= 0) {
                            C0370.m3284();
                            str2 = "ۣۥۣ";
                            str4 = strM5220;
                        } else {
                            str2 = "ۦ۟ۥ";
                            str4 = strM5220;
                        }
                    }
            }
            str2 = C0164.m1359() >= 0 ? "ۦۧۤ" : "ۣۤۤ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0153 A[SYNTHETIC] */
    /* renamed from: ̙, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m864(android.app.Activity r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.CustomDialog.m864(android.app.Activity, java.lang.String):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x004b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x048f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x048a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x047f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x047a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x050a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0505 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0043 A[SYNTHETIC] */
    /* renamed from: ̙̗, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m865(java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.CustomDialog.m865(java.lang.String):void");
    }

    /* renamed from: ̙̙, reason: not valid java name and contains not printable characters */
    private static String m866(String str) {
        return str;
    }

    /* renamed from: ۟۟ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static String m867(Object obj) {
        String str = "ۣ۠ۦ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 56510) {
                case 1709366:
                    str = "ۣ۠ۧ";
                    continue;
                case 1709371:
                    if (C0362.m3122() >= 0) {
                        str2 = str3;
                    } else {
                        str = "۠ۧۧ";
                        str2 = str3;
                        continue;
                    }
                case 1709559:
                    if (C0382.m5180() <= 0) {
                        C0393.m5668();
                    } else {
                        str = "ۢۢۥ";
                        continue;
                    }
                case 1711384:
                    break;
                case 1729082:
                    str = "ۣ۠ۦ";
                    continue;
                case 1731223:
                    if (C0392.m5595() <= 0) {
                        break;
                    } else {
                        str = "۠ۤۦ";
                    }
                case 1732123:
                case 1733179:
                    str = "۠ۧۧ";
                    continue;
                case 1734402:
                    if (C0378.m4998() <= 0) {
                        str = "ۣ۟ۢ";
                        str2 = null;
                    } else {
                        str = "ۣۨۤ";
                        str2 = null;
                        continue;
                    }
                case 1734526:
                    return str2;
                case 1734620:
                    str3 = ((C0363) obj).f605;
                    if (C0078.m361() <= 0) {
                        C0420.m6215();
                    } else {
                        str = "ۨۥۢ";
                        continue;
                    }
            }
            str = C0383.m5203() <= 0 ? "ۨۡ" : "ۨۥۥ";
        }
    }

    /* renamed from: ۟۠۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static String m868(Object obj) {
        String str = "ۦۦۥ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755592) {
                case 2095:
                    if (C0420.m6215() >= 0) {
                        C0362.m3122();
                    } else {
                        str = "ۦۦۥ";
                        continue;
                    }
                case 3053:
                    if (C0396.m5741() > 0) {
                        break;
                    } else if (C0121.m1023() >= 0) {
                        C0386.m5322();
                        str = "ۣ۟ۨ";
                    } else {
                        str = "ۣ۟ۥ";
                    }
                case 28233:
                    str3 = ((C0363) obj).f600;
                    if (C0389.m5481() <= 0) {
                        str = "ۢۨۡ";
                    } else {
                        str = "ۧ۠";
                        continue;
                    }
                case 28245:
                case 32685:
                    if (C0377.m4944() <= 0) {
                        C0060.m216();
                        str = "ۧۢ۠";
                    } else {
                        str = "ۢۢۥ";
                        continue;
                    }
                case 28361:
                    if (C0228.m2012() <= 0) {
                        C0400.m5961();
                        str2 = null;
                    } else {
                        str = "ۥ۠۠";
                        str2 = null;
                        continue;
                    }
                case 29805:
                    if (C0375.m4840() < 0) {
                        str = "ۣۢۤ";
                    } else {
                        continue;
                    }
                case 31528:
                    if (C0179.m1427() <= 0) {
                        C0380.m5068();
                    } else {
                        str = "۟۟ۡ";
                        continue;
                    }
                case 31597:
                    return str2;
                case 1709329:
                    if (C0398.m5833() <= 0) {
                        C0074.m307();
                        str2 = str3;
                    } else {
                        str = "ۢۢۥ";
                        str2 = str3;
                        continue;
                    }
                case 1709454:
                    break;
            }
            if (C0383.m5203() <= 0) {
                C0380.m5068();
            } else {
                str = "ۢۤۢ";
            }
        }
    }

    /* renamed from: ۟۠ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static String m869(Object obj) {
        String str = "ۤۧۥ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750539) {
                case 1259:
                    return str2;
                case 2050:
                    if (C0386.m5322() > 0) {
                        str = "ۡۢۤ";
                    } else {
                        continue;
                    }
                case 3213:
                    if (C0073.m265() <= 0) {
                        str = "ۨۥۧ";
                    } else {
                        str = "ۤۧۥ";
                        continue;
                    }
                case 3273:
                    if (C0229.m2064() >= 0) {
                        break;
                    } else if (C0391.m5571() <= 0) {
                        C0385.m5282();
                        str = "ۢۨۧ";
                    } else {
                        str = "ۡ۟ۤ";
                    }
                case 6285:
                    str3 = ((C0363) obj).f603;
                    if (C0369.m3256() <= 0) {
                        C0394.m5672();
                        str = "ۣۤ۟";
                    } else {
                        str = "ۦۣۧ";
                        continue;
                    }
                case 6376:
                case 1732072:
                    if (C0380.m5068() > 0) {
                        str = "ۢۤۢ";
                    } else {
                        continue;
                    }
                case 7380:
                    if (C0381.m5127() > 0) {
                        str = "ۤۤ";
                    } else {
                        continue;
                    }
                case 29769:
                    if (C0393.m5668() <= 0) {
                        str2 = str3;
                    } else {
                        str = "ۢۤۢ";
                        str2 = str3;
                        continue;
                    }
                case 32517:
                    break;
                case 1731211:
                    str = "ۥۣۧ";
                    str2 = null;
                    continue;
            }
            str = C0074.m307() >= 0 ? "ۣ۠۟" : "۠۠۟";
        }
    }

    /* renamed from: ۟۠ۥۧ۠, reason: not valid java name and contains not printable characters */
    public static String m870() {
        String str = "ۣۤۤ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751623) {
                case 36:
                    if (C0206.m1807() > 0) {
                        break;
                    } else {
                        str = C0400.m5961() <= 0 ? "۠ۡۨ" : "ۣۥۥ";
                    }
                case 943:
                    return str2;
                case 3204:
                    str3 = C0363.f592;
                    str = "۟ۥۣ";
                    continue;
                case 3256:
                case 29327:
                    if (C0379.m5056() <= 0) {
                        str = "ۨۧۢ";
                    } else {
                        str = "ۤ۠ۤ";
                        continue;
                    }
                case 3421:
                    str = "ۦ۠ۢ";
                    str2 = null;
                    continue;
                case 5306:
                    if (C0394.m5672() > 0) {
                        str = "ۣۤۤ";
                    } else {
                        continue;
                    }
                case 7674:
                    if (C0391.m5571() <= 0) {
                        C0191.m1627();
                        str = "ۡ۠ۤ";
                        str2 = str3;
                    } else {
                        str = "ۤ۠ۤ";
                        str2 = str3;
                        continue;
                    }
                case 31535:
                    str = "ۣۣۧ";
                    continue;
                case 31845:
                    str = "ۣۨ۟";
                    continue;
                case 1728928:
                    break;
            }
            if (C0397.m5814() <= 0) {
                C0378.m4998();
            } else {
                str = "ۣۧۨ";
            }
        }
    }

    /* renamed from: ۟ۡ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static String m871(Object obj) {
        String str = "۟ۧۧ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754535) {
                case 2:
                    str = "ۢۦۤ";
                    continue;
                case 1258:
                    return str2;
                case 2016:
                    if (C0179.m1427() <= 0) {
                        str = "۟ۨۢ";
                        str2 = str3;
                    } else {
                        str = "ۦ۟ۦ";
                        str2 = str3;
                        continue;
                    }
                case 2019:
                case 30343:
                    if (C0375.m4840() >= 0) {
                        C0375.m4840();
                    } else {
                        str = "ۦ۟ۦ";
                        continue;
                    }
                case 25176:
                    if (C0083.m448() >= 0) {
                        break;
                    } else {
                        str = "ۢۢۥ";
                    }
                case 25304:
                    break;
                case 27290:
                    if (C0396.m5741() >= 0) {
                        C0089.m592();
                        str2 = null;
                    } else {
                        str = "ۧۤۢ";
                        str2 = null;
                        continue;
                    }
                case 27367:
                    if (C0391.m5571() > 0) {
                        str = "۟ۧۧ";
                    } else {
                        continue;
                    }
                case 29507:
                    str = "ۡۥۡ";
                    continue;
                case 30466:
                    str3 = ((C0363) obj).f607;
                    if (C0420.m6215() >= 0) {
                        str = "ۨ۠۠";
                    } else {
                        str = "ۦۧۨ";
                        continue;
                    }
            }
            if (C0387.m5374() >= 0) {
                C0206.m1807();
                str = "ۨ۟ۢ";
            } else {
                str = "ۣۦۧ";
            }
        }
    }

    /* renamed from: ۣ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static String m872(Object obj) {
        String str = "ۨ۟ۥ";
        String str2 = null;
        String strM866 = null;
        while (true) {
            switch (C0395.m5690(str) ^ 1753663) {
                case 858:
                case 32698:
                    if (C0397.m5814() <= 0) {
                        str = "ۣۧۨ";
                    } else {
                        str = "۠۠ۨ";
                        continue;
                    }
                case 2801:
                    if (C0060.m216() < 0) {
                        break;
                    } else if (C0088.m573() > 0) {
                        str = "ۣ۠ۡ";
                    }
                case 26839:
                    return str2;
                case 26881:
                    strM866 = m866((String) obj);
                    if (C0389.m5481() > 0) {
                        str = "۠ۨ";
                    } else {
                        continue;
                    }
                case 27068:
                    str = "ۡۥ۠";
                    str2 = null;
                    continue;
                case 27801:
                    if (C0387.m5374() >= 0) {
                        C0009.m36();
                        str = "ۨۤۡ";
                    } else {
                        str = "۠ۥۨ";
                        continue;
                    }
                case 27803:
                    break;
                case 27907:
                    if (C0389.m5481() > 0) {
                        str = "ۦ۠۟";
                    } else {
                        continue;
                    }
                case 32664:
                    if (C0164.m1359() >= 0) {
                        str = "ۧۦۨ";
                    } else {
                        str = "ۨ۟ۥ";
                        continue;
                    }
                case 1711671:
                    str = "۠۠ۨ";
                    str2 = strM866;
                    continue;
            }
            str = C0377.m4944() <= 0 ? "ۣۤۥ" : "ۡ۠ۥ";
        }
    }

    /* renamed from: ۟ۢۨۨۡ, reason: not valid java name and contains not printable characters */
    public static String m873(Object obj) {
        Object obj2 = "ۣۧۤ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1748859) {
                case 445:
                    if (C0121.m1023() < 0) {
                        obj2 = "ۣۢۨ";
                    } else {
                        continue;
                    }
                case 1196:
                    break;
                case 2136:
                    if (C0379.m5056() <= 0) {
                        C0025.m118();
                        str = null;
                    } else {
                        obj2 = "ۡۡۦ";
                        str = null;
                        continue;
                    }
                case 5575:
                case 7206:
                    obj2 = "ۤۥ";
                    continue;
                case 6650:
                    str2 = ((C0363) obj).f604;
                    if (C0083.m448() < 0) {
                        obj2 = "ۡ۟";
                    } else {
                        continue;
                    }
                case 7290:
                    obj2 = "۟۠ۤ";
                    continue;
                case 27357:
                    if (C0400.m5961() <= 0) {
                        break;
                    } else {
                        obj2 = "ۣۣۡ";
                    }
                case 27942:
                    obj2 = "ۣۧۤ";
                    continue;
                case 1733477:
                    if (C0420.m6215() >= 0) {
                        str = str2;
                    } else {
                        obj2 = "ۤۥ";
                        str = str2;
                        continue;
                    }
                case 1733626:
                    return str;
            }
            obj2 = "ۢۥۤ";
        }
    }

    /* renamed from: ۣۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m874() {
        String str = "ۥۣ۟";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750633) {
                case 202:
                    if (C0379.m5056() <= 0) {
                        C0376.m4906();
                        str = "ۤۡۨ";
                    } else {
                        str = "۟ۥۣ";
                        continue;
                    }
                case 329:
                    return str2;
                case 1239:
                    if (C0346.m3059() >= 0) {
                        C0184.m1524();
                        str2 = null;
                    } else {
                        str = "ۣۤۤ";
                        str2 = null;
                        continue;
                    }
                case 1384:
                    str3 = C0363.f591;
                    if (C0206.m1807() >= 0) {
                        C0390.m5512();
                        str = "۟ۥۤ";
                    } else {
                        str = "ۢۥۨ";
                        continue;
                    }
                case 1388:
                    if (C0379.m5056() <= 0) {
                        str2 = str3;
                    } else {
                        str = "ۣۨۥ";
                        str2 = str3;
                        continue;
                    }
                case 3040:
                    if (C0394.m5672() < 0) {
                        break;
                    } else {
                        str = "ۢۥۤ";
                    }
                case 3112:
                    break;
                case 4564:
                case 29664:
                    str = "ۣۨۥ";
                    continue;
                case 7341:
                    str = "ۥۣ۟";
                    continue;
                case 29666:
                    str = "ۣۢ۟";
                    continue;
            }
            if (C0375.m4840() >= 0) {
                C0089.m592();
            } else {
                str = "ۣۧۧ";
            }
        }
    }

    /* renamed from: ۣ۟ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static String m875(Object obj) {
        Object obj2 = "ۣۢۤ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1747687) {
                case TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE /* 422 */:
                    if (C0025.m118() <= 0) {
                        str = str2;
                    } else {
                        obj2 = "ۨۨ۠";
                        str = str2;
                        continue;
                    }
                case 3461:
                case 4257:
                    if (C0398.m5833() > 0) {
                        obj2 = "ۨۨ۠";
                    } else {
                        continue;
                    }
                case 6147:
                    if (C0399.m5914() <= 0) {
                        C0389.m5481();
                        obj2 = "ۤۦۦ";
                    } else {
                        obj2 = "ۣۢۤ";
                        continue;
                    }
                case 6170:
                    obj2 = "ۦۦۨ";
                    str = null;
                    continue;
                case 7298:
                    if (C0390.m5512() < 0) {
                        break;
                    } else if (C0369.m3256() > 0) {
                        obj2 = "ۦۣۧ";
                    }
                case 25351:
                    return str;
                case 25579:
                    obj2 = "ۢۥ۠";
                    continue;
                case 26789:
                    str2 = ((C0363) obj).f606;
                    if (C0368.m3171() >= 0) {
                        C0391.m5571();
                    } else {
                        obj2 = "ۣ۠ۤ";
                        continue;
                    }
                case 26831:
                    obj2 = "۟ۢۥ";
                    continue;
                case 27522:
                    break;
            }
            obj2 = "ۨۡۥ";
        }
    }

    /* renamed from: ۣ۟ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static String m876(Object obj) {
        String str = "ۤۡ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752553) {
                case 840:
                    if (C0400.m5961() > 0) {
                        str = "ۢ۟ۢ";
                    } else {
                        continue;
                    }
                case 2793:
                    if (C0394.m5672() <= 0) {
                        str2 = str3;
                    } else {
                        str = "ۣ۠ۤ";
                        str2 = str3;
                        continue;
                    }
                case 3852:
                    if (C0390.m5512() <= 0) {
                        C0078.m361();
                    } else {
                        str = "ۤۡ";
                        continue;
                    }
                case 3853:
                case 4012:
                    str = "ۣ۠ۤ";
                    continue;
                case 3882:
                    break;
                case 5814:
                    return str2;
                case 6828:
                    str3 = ((C0363) obj).f611;
                    str = "ۣۧۤ";
                    continue;
                case 31695:
                    str = "ۥۨۤ";
                    str2 = null;
                    continue;
                case 32726:
                    str = "ۧۨۧ";
                    continue;
                case 1728916:
                    if (C0121.m1023() >= 0) {
                        break;
                    } else {
                        str = "۟ۡۧ";
                    }
            }
            if (C0086.m500() > 0) {
                str = "ۦۧ۠";
            }
        }
    }

    /* renamed from: ۣ۟ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static String m877(Object obj) {
        Object obj2 = "ۡۤ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1754439) {
                case 1035:
                    return str;
                case 25090:
                    if (C0179.m1427() <= 0) {
                        obj2 = "ۥۤۡ";
                    } else {
                        obj2 = "ۣۥ۟";
                        continue;
                    }
                case 25278:
                    str2 = ((C0363) obj).f599;
                    if (C0376.m4906() > 0) {
                        obj2 = "ۣ۠ۡ";
                    } else {
                        continue;
                    }
                case 28281:
                    if (C0368.m3171() >= 0) {
                        obj2 = "ۣۡۧ";
                        str = str2;
                    } else {
                        obj2 = "ۦ۟ۥ";
                        str = str2;
                        continue;
                    }
                case 28576:
                    break;
                case 29455:
                case 29632:
                    obj2 = "ۦ۟ۥ";
                    continue;
                case 29690:
                    if (C0183.m1464() <= 0) {
                        C0389.m5481();
                        str = null;
                    } else {
                        obj2 = "ۨۦ";
                        str = null;
                        continue;
                    }
                case 30468:
                    if (C0368.m3171() >= 0) {
                        C0392.m5595();
                    } else {
                        obj2 = "ۡۤ";
                        continue;
                    }
                case 1710436:
                    if (C0206.m1807() >= 0) {
                        break;
                    } else {
                        obj2 = "۟ۧۡ";
                    }
                case 1710521:
                    obj2 = "ۣۣۧ";
                    continue;
            }
            obj2 = "۟ۡۧ";
        }
    }

    /* renamed from: ۟ۥۢ۟, reason: not valid java name and contains not printable characters */
    public static String m878(Object obj) {
        Object obj2 = "ۤۨۡ";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 56385) {
                case 33:
                    obj2 = "ۨۤ";
                    str = str2;
                    continue;
                case 70:
                    obj2 = "۟ۧ۟";
                    continue;
                case 189:
                    return str;
                case 1709387:
                    str2 = ((C0363) obj).f609;
                    if (C0060.m216() <= 0) {
                        C0398.m5833();
                    } else {
                        obj2 = "ۣۣ";
                        continue;
                    }
                case 1709389:
                    obj2 = "ۨۥۢ";
                    continue;
                case 1709508:
                    if (C0398.m5833() <= 0) {
                        str = null;
                    } else {
                        obj2 = "۠ۧ";
                        str = null;
                        continue;
                    }
                case 1730055:
                    break;
                case 1730204:
                    if (C0089.m592() < 0) {
                        break;
                    } else if (C0229.m2064() < 0) {
                        obj2 = "ۣۨۡ";
                    }
                case 1732296:
                case 1735606:
                    obj2 = "ۨۤ";
                    continue;
                case 1735485:
                    if (C0206.m1807() >= 0) {
                        C0164.m1359();
                    } else {
                        obj2 = "ۤۨۡ";
                        continue;
                    }
            }
            if (C0164.m1359() >= 0) {
                C0378.m4998();
            } else {
                obj2 = "ۨۡۥ";
            }
        }
    }

    /* renamed from: ۟ۥۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m879() {
        String str = "ۦۧ۟";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751648) {
                case 1218:
                case 5477:
                    str = "ۣۧۧ";
                    continue;
                case 2400:
                    str = "ۦ۟۟";
                    continue;
                case 3234:
                    str = "ۦۧ۟";
                    continue;
                case 4382:
                    if (C0335.m2923() < 0) {
                        str = "ۥۨۥ";
                    } else {
                        continue;
                    }
                case 4422:
                    str = "ۣۧۧ";
                    z = z2;
                    continue;
                case 30722:
                    z2 = f168;
                    if (C0370.m3284() < 0) {
                        str = "۠ۢۨ";
                    } else {
                        continue;
                    }
                case 30814:
                    if (C0376.m4906() < 0) {
                        break;
                    } else if (C0082.m410() >= 0) {
                        C0393.m5668();
                    } else {
                        str = "ۦۨۤ";
                    }
                case 31526:
                    str = "۠ۥۣ";
                    z = false;
                    continue;
                case 31843:
                    return z;
                case 1730204:
                    break;
            }
            if (C0397.m5814() <= 0) {
                C0375.m4840();
                str = "ۡ۟ۡ";
            } else {
                str = "ۢۥۣ";
            }
        }
    }

    /* renamed from: ۟ۦۤۡۧ, reason: not valid java name and contains not printable characters */
    public static CustomDialog m880() {
        String str = "ۨۥ۟";
        CustomDialog customDialog = null;
        CustomDialog customDialog2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752611) {
                case 938:
                    if (C0376.m4906() <= 0) {
                        C0388.m5430();
                        customDialog = customDialog2;
                    } else {
                        str = "ۨۢۡ";
                        customDialog = customDialog2;
                        continue;
                    }
                case 1061:
                case 2210:
                    str = "ۨۢۡ";
                    continue;
                case 3137:
                    customDialog2 = f166;
                    str = "ۥۣ۟";
                    continue;
                case 4291:
                    if (C0121.m1023() >= 0) {
                        str = "ۤ۟ۨ";
                    } else {
                        str = "ۨۥ۟";
                        continue;
                    }
                case 5313:
                    if (C0396.m5741() >= 0) {
                        C0082.m410();
                        str = "ۤ۟ۢ";
                        customDialog = null;
                    } else {
                        str = "۟ۧۥ";
                        customDialog = null;
                        continue;
                    }
                case 6622:
                    str = "ۣۣۡ";
                    continue;
                case 30468:
                    return customDialog;
                case 30625:
                    if (C0393.m5668() < 0) {
                        break;
                    } else if (C0179.m1427() <= 0) {
                        C0384.m5278();
                    } else {
                        str = "ۢ۠۠";
                    }
                case 30720:
                    if (C0396.m5741() < 0) {
                        str = "۠۠ۢ";
                    } else {
                        continue;
                    }
                case 32584:
                    break;
            }
            str = "ۧۨۤ";
        }
    }

    /* renamed from: ۟ۦۤۢۨ, reason: not valid java name and contains not printable characters */
    public static String m881(Object obj) {
        String str = "ۥۦۦ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748802) {
                case 1094:
                    str3 = ((C0363) obj).f608;
                    str = "ۢۤۥ";
                    continue;
                case 4391:
                    if (C0380.m5068() <= 0) {
                        break;
                    } else if (C0078.m361() <= 0) {
                        C0083.m448();
                    } else {
                        str = "۠ۡۥ";
                    }
                case 4450:
                    if (C0334.m2866() <= 0) {
                        str2 = null;
                    } else {
                        str = "ۢۡۦ";
                        str2 = null;
                        continue;
                    }
                case 4769:
                case 5774:
                    if (C0389.m5481() <= 0) {
                        C0228.m2012();
                        str = "ۧۦۡ";
                    } else {
                        str = "ۧۨۥ";
                        continue;
                    }
                case 5379:
                    str = "ۥۦۦ";
                    continue;
                case 7585:
                    if (C0362.m3122() >= 0) {
                        str2 = str3;
                    } else {
                        str = "ۧۨۥ";
                        str2 = str3;
                        continue;
                    }
                case 7621:
                    str = "ۥۢ۠";
                    continue;
                case 26242:
                    if (C0376.m4906() <= 0) {
                        str = "ۣۨ۠";
                    } else {
                        str = "ۥۤ۟";
                        continue;
                    }
                case 26982:
                    return str2;
                case 28327:
                    break;
            }
            str = C0395.m5698() >= 0 ? "ۣۨۦ" : "ۨۧ۟";
        }
    }

    /* renamed from: ۟ۦۧۨۦ, reason: not valid java name and contains not printable characters */
    public static void m882(Object obj, Object obj2) {
        Object obj3 = "۠۠ۡ";
        while (true) {
            switch (C0395.m5690(obj3) ^ 1748894) {
                case 191:
                case 379:
                    if (C0391.m5571() <= 0) {
                        C0060.m216();
                    } else {
                        obj3 = "ۣۢۡ";
                        continue;
                    }
                case 1377:
                    if (C0164.m1359() >= 0) {
                        C0089.m592();
                        obj3 = "ۦۣۨ";
                    } else {
                        obj3 = "۠۠ۡ";
                        continue;
                    }
                case 1407:
                    if (C0384.m5278() < 0) {
                        break;
                    } else if (C0386.m5322() > 0) {
                        obj3 = "ۥۣۧ";
                    }
                case 4383:
                    ((CustomDialog) obj).publishProgress((Object[]) obj2);
                    if (C0164.m1359() < 0) {
                        obj3 = "ۣۢۡ";
                    } else {
                        continue;
                    }
                case 7518:
                    return;
                case 7645:
                    break;
                case 1733381:
                    obj3 = "ۡۢۦ";
                    continue;
            }
            if (C0121.m1023() < 0) {
                obj3 = "ۥ۠";
            }
        }
    }

    /* renamed from: ۟ۧ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m883() {
        String str = "ۤ۟۟";
        SharedPreferences sharedPreferences = null;
        SharedPreferences sharedPreferences2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747773) {
                case 27:
                case 167:
                    str = "ۣۣ۠";
                    continue;
                case HttpStatus.HTTP_INTERNAL_SERVER_ERROR /* 500 */:
                    if (C0396.m5741() >= 0) {
                        C0393.m5668();
                    } else {
                        str = "۠ۢۨ";
                        continue;
                    }
                case 3229:
                    if (C0391.m5571() <= 0) {
                        sharedPreferences = null;
                    } else {
                        str = "۠۟ۨ";
                        sharedPreferences = null;
                        continue;
                    }
                case 3293:
                    if (C0399.m5914() <= 0) {
                        str = "۟۟ۨ";
                        sharedPreferences = sharedPreferences2;
                    } else {
                        str = "ۣۣ۠";
                        sharedPreferences = sharedPreferences2;
                        continue;
                    }
                case 4857:
                    if (C0381.m5127() <= 0) {
                        break;
                    } else if (C0386.m5322() <= 0) {
                        C0420.m6215();
                    } else {
                        str = "ۦ۟ۧ";
                    }
                case 7200:
                    break;
                case 7451:
                    return sharedPreferences;
                case 27251:
                    sharedPreferences2 = f167;
                    if (C0399.m5914() > 0) {
                        str = "۟ۦۧ";
                    } else {
                        continue;
                    }
                case 28383:
                    str = "۟ۤۥ";
                    continue;
                case 1734459:
                    str = "ۤ۟۟";
                    continue;
            }
            str = C0382.m5180() <= 0 ? "ۨۥ" : "ۧۦۡ";
        }
    }

    /* renamed from: ۟ۨ۠۟, reason: not valid java name and contains not printable characters */
    public static Activity m884() {
        String str = "ۧ۠۠";
        Activity activity = null;
        Activity activity2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754627) {
                case 804:
                    if (C0380.m5068() < 0) {
                        break;
                    } else {
                        str = C0384.m5278() <= 0 ? "ۧ۟ۧ" : "ۢ۟ۢ";
                    }
                case 1869:
                    break;
                case 1931:
                case 3795:
                    if (C0335.m2923() < 0) {
                        str = "ۡ۠۟";
                    } else {
                        continue;
                    }
                case 3945:
                    if (C0164.m1359() >= 0) {
                        C0375.m4840();
                    } else {
                        str = "ۣۤۡ";
                        continue;
                    }
                case 4071:
                    if (C0229.m2064() >= 0) {
                        str = "ۢۢۧ";
                        activity = activity2;
                    } else {
                        str = "ۡ۠۟";
                        activity = activity2;
                        continue;
                    }
                case 26787:
                    return activity;
                case 29766:
                    activity2 = f169;
                    str = "ۨۨۤ";
                    continue;
                case 31689:
                    str = "ۧ۠۠";
                    continue;
                case 31749:
                    if (C0370.m3284() >= 0) {
                        str = "ۧۧۧ";
                        activity = null;
                    } else {
                        str = "ۦ۟";
                        activity = null;
                        continue;
                    }
                case 1710778:
                    if (C0362.m3122() >= 0) {
                        C0368.m3171();
                    } else {
                        str = "ۦۣۡ";
                        continue;
                    }
            }
            if (C0385.m5282() >= 0) {
                C0009.m36();
            } else {
                str = "ۨۤۦ";
            }
        }
    }

    /* renamed from: ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m885(Object obj) {
        String str = "ۡ۠۠";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753421) {
                case 172:
                    break;
                case 1256:
                    if (C0362.m3122() >= 0) {
                        C0025.m118();
                        str = "ۧ۟";
                        str2 = null;
                    } else {
                        str = "۟ۧۨ";
                        str2 = null;
                        continue;
                    }
                case 26957:
                    if (C0387.m5374() >= 0) {
                        str = "ۤۧ۟";
                    } else {
                        str = "۠ۥۥ";
                        continue;
                    }
                case 26964:
                case 27341:
                    if (C0060.m216() <= 0) {
                        C0184.m1524();
                        str = "ۦۣۧ";
                    } else {
                        str = "ۢ۠ۢ";
                        continue;
                    }
                case 28652:
                    if (C0369.m3256() < 0) {
                        break;
                    } else {
                        str = "ۣۦۡ";
                    }
                case 29481:
                    return str2;
                case 29483:
                    if (C0376.m4906() <= 0) {
                        C0229.m2064();
                    } else {
                        str = "ۡ۠۠";
                        continue;
                    }
                case 29578:
                    if (C0395.m5698() >= 0) {
                        C0279.m2491();
                    } else {
                        str = "ۧۤۢ";
                        continue;
                    }
                case 30611:
                    str3 = ((C0363) obj).f597;
                    if (C0387.m5374() >= 0) {
                        str = "ۧۥۣ";
                    } else {
                        str = "ۤ۟۟";
                        continue;
                    }
                case 30857:
                    if (C0183.m1464() <= 0) {
                        C0396.m5741();
                        str2 = str3;
                    } else {
                        str = "ۢ۠ۢ";
                        str2 = str3;
                        continue;
                    }
            }
            if (C0397.m5814() <= 0) {
                C0191.m1627();
            } else {
                str = "ۣۢۨ";
            }
        }
    }

    /* renamed from: ۠۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m886(Object obj) {
        String str = "ۨ۠ۡ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746690) {
                case 195:
                    if (C0386.m5322() <= 0) {
                        C0206.m1807();
                        str2 = str3;
                    } else {
                        str = "ۥۨۦ";
                        str2 = str3;
                        continue;
                    }
                case 2140:
                    if (C0379.m5056() <= 0) {
                        C0083.m448();
                        str = "۠۟";
                    } else {
                        str = "ۨ۠ۡ";
                        continue;
                    }
                case 4459:
                case 7457:
                    if (C0389.m5481() <= 0) {
                        C0368.m3171();
                    } else {
                        str = "ۥۨۦ";
                        continue;
                    }
                case 5148:
                    break;
                case 5571:
                    if (C0184.m1524() >= 0) {
                        str = "ۦۦۦ";
                        str2 = null;
                    } else {
                        str = "ۢۤ۟";
                        str2 = null;
                        continue;
                    }
                case 5599:
                    if (C0078.m361() <= 0) {
                        C0362.m3122();
                    } else {
                        str = "ۣۢۨ";
                        continue;
                    }
                case 6561:
                    return str2;
                case 7583:
                    str3 = ((C0363) obj).f610;
                    str = "۟ۥۧ";
                    continue;
                case 28651:
                    if (C0025.m118() <= 0) {
                        break;
                    } else if (C0346.m3059() < 0) {
                        str = "ۤۦ۟";
                    }
                case 1735583:
                    str = "ۣۢۢ";
                    continue;
            }
            if (C0389.m5481() <= 0) {
                C0083.m448();
            } else {
                str = "ۥۢ";
            }
        }
    }

    /* renamed from: ۠ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static String m887(Object obj) {
        Object obj2 = "ۦ۠۠";
        String str = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690(obj2) ^ 1754536) {
                case 129:
                case 3148:
                    if (C0399.m5914() <= 0) {
                        obj2 = "ۢ۠۟";
                    } else {
                        obj2 = "ۡۤۨ";
                        continue;
                    }
                case 1230:
                    if (C0060.m216() <= 0) {
                        break;
                    } else if (C0229.m2064() < 0) {
                        obj2 = "ۣۤۤ";
                    }
                case 3427:
                    if (C0291.m2568() >= 0) {
                        C0377.m4944();
                        str = str2;
                    } else {
                        obj2 = "ۡۤۨ";
                        str = str2;
                        continue;
                    }
                case 25098:
                    obj2 = "ۦ۠۠";
                    continue;
                case 25142:
                    obj2 = "ۧ۠ۢ";
                    continue;
                case 27277:
                    return str;
                case 29486:
                    if (C0291.m2568() >= 0) {
                        obj2 = "ۦۥۦ";
                        str = null;
                    } else {
                        obj2 = "ۣ۟ۤ";
                        str = null;
                        continue;
                    }
                case 30348:
                    obj2 = "ۣۣۦ";
                    continue;
                case 32749:
                    str2 = ((C0363) obj).f596;
                    if (C0088.m573() > 0) {
                        obj2 = "ۨ۟ۢ";
                    } else {
                        continue;
                    }
                case 32750:
                    break;
            }
            obj2 = "ۢۦۨ";
        }
    }

    /* renamed from: ۡۥۢۥ, reason: not valid java name and contains not printable characters */
    public static void m888(Object obj, Object obj2) {
        Object obj3 = "ۡ۠ۥ";
        while (true) {
            switch (C0395.m5690(obj3) ^ 1753572) {
                case 67:
                    obj3 = "ۨ۟ۥ";
                    continue;
                case 2019:
                    return;
                case 2346:
                case 32748:
                    if (C0379.m5056() > 0) {
                        obj3 = "ۧۧۧ";
                    } else {
                        continue;
                    }
                case 26278:
                    if (C0206.m1807() >= 0) {
                        obj3 = "ۣۨ۠";
                    } else {
                        obj3 = "ۡ۠ۥ";
                        continue;
                    }
                case 26305:
                    ((CustomDialog) obj).m865((String) obj2);
                    if (C0335.m2923() >= 0) {
                        C0335.m2923();
                    } else {
                        obj3 = "ۧۧۧ";
                        continue;
                    }
                case 28482:
                    if (C0089.m592() < 0) {
                        break;
                    } else if (C0379.m5056() > 0) {
                        obj3 = "۟۠ۦ";
                    }
                case 31693:
                    break;
            }
            if (C0420.m6215() >= 0) {
                C0334.m2866();
            } else {
                obj3 = "ۦۣۢ";
            }
        }
    }

    /* renamed from: ۢ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m889(Object obj) {
        String str = "ۣۣ۟";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747932) {
                case 319:
                case 28123:
                    str = "ۣۢۧ";
                    continue;
                case 3102:
                    if (C0083.m448() >= 0) {
                        C0387.m5374();
                    } else {
                        str = "ۣۣ۟";
                        continue;
                    }
                case 3142:
                    str = "ۧۧۧ";
                    continue;
                case 4377:
                    str3 = ((C0363) obj).f593;
                    if (C0086.m500() <= 0) {
                        C0083.m448();
                        str = "ۧۤ";
                    } else {
                        str = "ۣۢ۟";
                        continue;
                    }
                case 7587:
                    if (C0073.m265() <= 0) {
                        break;
                    } else {
                        str = "ۤۧۨ";
                    }
                case 7604:
                    return str2;
                case 7612:
                    str = "ۣۢۧ";
                    str2 = str3;
                    continue;
                case 7613:
                    break;
                case 27199:
                    str = "۟ۤ۟";
                    str2 = null;
                    continue;
                case 27224:
                    if (C0386.m5322() <= 0) {
                        C0368.m3171();
                        str = "۠ۤ";
                    } else {
                        str = "ۦۤۡ";
                        continue;
                    }
            }
            if (C0362.m3122() >= 0) {
                C0089.m592();
            } else {
                str = "ۦۡ۟";
            }
        }
    }

    /* renamed from: ۢۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m890() {
        String str = "ۦۡ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752702) {
                case 94:
                    break;
                case 2106:
                    str = "ۣۧۡ";
                    str2 = str3;
                    continue;
                case 3224:
                    str3 = C0363.f588;
                    if (C0390.m5512() <= 0) {
                        C0400.m5961();
                    } else {
                        str = "ۣۡۢ";
                        continue;
                    }
                case 4250:
                case 30518:
                    if (C0390.m5512() <= 0) {
                        C0334.m2866();
                        str = "ۡۨ";
                    } else {
                        str = "ۣۧۡ";
                        continue;
                    }
                case 6558:
                    if (C0390.m5512() <= 0) {
                        C0335.m2923();
                    } else {
                        str = "ۣۧۢ";
                        continue;
                    }
                case 30617:
                    if (C0206.m1807() < 0) {
                        str = "ۦۡ";
                    } else {
                        continue;
                    }
                case 31510:
                    str = "ۦۣ۠";
                    str2 = null;
                    continue;
                case 31543:
                    return str2;
                case 32701:
                    str = "ۣۣۨ";
                    continue;
                case 1729221:
                    if (C0088.m573() < 0) {
                        break;
                    } else {
                        str = "ۢۤۨ";
                    }
            }
            str = C0394.m5672() <= 0 ? "ۡۤۧ" : "۟ۦۧ";
        }
    }

    /* renamed from: ۢۥۢۢ, reason: not valid java name and contains not printable characters */
    public static String m891() {
        String str = "ۥۡۨ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749666) {
                case 1465:
                    if (C0082.m410() >= 0) {
                        C0389.m5481();
                        str = "ۤۡۦ";
                    } else {
                        str = "ۨۥ۠";
                        continue;
                    }
                case 2217:
                case 3846:
                    if (C0191.m1627() >= 0) {
                        C0228.m2012();
                    } else {
                        str = "ۣۨۢ";
                        continue;
                    }
                case 3204:
                    break;
                case 3268:
                    if (C0191.m1627() >= 0) {
                        C0155.m1294();
                        str = "ۦ۠ۢ";
                    } else {
                        str = "ۥ۠۟";
                        continue;
                    }
                case 3950:
                    if (C0368.m3171() >= 0) {
                        break;
                    } else {
                        str = "ۣۡۧ";
                    }
                case 6432:
                    if (C0228.m2012() > 0) {
                        str = "ۥۡۨ";
                    } else {
                        continue;
                    }
                case 6517:
                    if (C0184.m1524() >= 0) {
                        str2 = str3;
                    } else {
                        str = "ۣۨۢ";
                        str2 = str3;
                        continue;
                    }
                case 7591:
                    str3 = C0363.f590;
                    if (C0375.m4840() >= 0) {
                        C0370.m3284();
                    } else {
                        str = "۠ۨ۟";
                        continue;
                    }
                case 31521:
                    if (C0369.m3256() <= 0) {
                        str2 = null;
                    } else {
                        str = "ۥۦۧ";
                        str2 = null;
                        continue;
                    }
                case 31717:
                    return str2;
            }
            if (C0381.m5127() <= 0) {
                C0086.m500();
                str = "۟۟ۤ";
            } else {
                str = "ۣۨ۠";
            }
        }
    }

    /* renamed from: ۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m892() {
        String str = "ۥۣۢ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753699) {
                case 3:
                    if (C0088.m573() <= 0) {
                        C0391.m5571();
                    } else {
                        str = "ۦۢۥ";
                        continue;
                    }
                case 970:
                case 28099:
                    if (C0383.m5203() > 0) {
                        str = "۠ۤ۟";
                    } else {
                        continue;
                    }
                case 26076:
                    str = "ۣۣۦ";
                    continue;
                case 26936:
                    return str2;
                case 27777:
                    str = "ۥۣۢ";
                    continue;
                case 29026:
                    str3 = C0363.f587;
                    str = "ۥۣۥ";
                    continue;
                case 29925:
                    if (C0388.m5430() <= 0) {
                        str2 = null;
                    } else {
                        str = "ۦۨۢ";
                        str2 = null;
                        continue;
                    }
                case 30850:
                    break;
                case 31844:
                    str = "۠ۤ۟";
                    str2 = str3;
                    continue;
                case 32645:
                    if (C0279.m2491() >= 0) {
                        break;
                    } else if (C0088.m573() > 0) {
                        str = "ۢۥۤ";
                    }
            }
            if (C0370.m3284() >= 0) {
                C0395.m5698();
            } else {
                str = "۟ۥۥ";
            }
        }
    }

    /* renamed from: ۣۤ۟, reason: not valid java name and contains not printable characters */
    public static C0363 m893(Object obj, Object obj2) throws Exception {
        String str = "ۢۥ۟";
        C0363 c0363 = null;
        C0363 c0363M860 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746904) {
                case 2333:
                    break;
                case 3359:
                case 1735450:
                    if (C0078.m361() > 0) {
                        str = "ۤۧۥ";
                    } else {
                        continue;
                    }
                case 3386:
                    if (C0074.m307() >= 0) {
                        str = "ۦۨۥ";
                    } else {
                        str = "ۣۡۢ";
                        continue;
                    }
                case 4508:
                    if (C0121.m1023() >= 0) {
                        C0395.m5698();
                        c0363 = null;
                    } else {
                        str = "ۣۨۢ";
                        c0363 = null;
                        continue;
                    }
                case 5412:
                    if (C0393.m5668() <= 0) {
                        break;
                    } else {
                        str = "ۥ۟ۧ";
                    }
                case 6741:
                    c0363M860 = ((CustomDialog) obj).m860((String[]) obj2);
                    str = "ۧ۠ۤ";
                    continue;
                case 7450:
                    return c0363;
                case 25331:
                    str = "ۤۧۥ";
                    c0363 = c0363M860;
                    continue;
                case 28319:
                    if (C0179.m1427() <= 0) {
                        C0395.m5698();
                    } else {
                        str = "۠۟ۦ";
                        continue;
                    }
                case 1735589:
                    str = "ۢۥ۟";
                    continue;
            }
            str = "۠۠ۢ";
        }
    }

    /* renamed from: ۤۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m894(Object obj) {
        String str = "۠ۧۤ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753454) {
                case 1093:
                case 31530:
                    if (C0386.m5322() > 0) {
                        str = "ۢۢۡ";
                    } else {
                        continue;
                    }
                case 27000:
                    str3 = ((C0363) obj).f594;
                    str = "۠ۦ";
                    continue;
                case 27310:
                    if (C0370.m3284() >= 0) {
                        C0394.m5672();
                        str = "ۡۧۦ";
                        str2 = null;
                    } else {
                        str = "ۣۤ";
                        str2 = null;
                        continue;
                    }
                case 27347:
                    if (C0155.m1294() > 0) {
                        break;
                    } else if (C0394.m5672() > 0) {
                        str = "۟ۨ۟";
                    }
                case 27372:
                    if (C0386.m5322() <= 0) {
                        str = "ۡۤۤ";
                    } else {
                        str = "۠ۧۧ";
                        continue;
                    }
                case 29452:
                    break;
                case 29647:
                    return str2;
                case 30884:
                    str = "۠ۧۤ";
                    continue;
                case 1711375:
                    if (C0376.m4906() > 0) {
                        str = "ۧ۠ۤ";
                    } else {
                        continue;
                    }
                case 1711464:
                    str = "ۢۢۡ";
                    str2 = str3;
                    continue;
            }
            str = "۠ۥۧ";
        }
    }

    /* renamed from: ۥۣۡۤ, reason: contains not printable characters */
    public static String m895(Object obj) {
        String str = "ۣۣ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747811) {
                case 187:
                    return str2;
                case 3136:
                    if (C0191.m1627() < 0) {
                        str = "ۣۣ";
                    } else {
                        continue;
                    }
                case 3138:
                case 1732743:
                    if (C0291.m2568() >= 0) {
                        str = "ۤۢۨ";
                    } else {
                        str = "۠ۨ۠";
                        continue;
                    }
                case 4452:
                    str = "ۤۦۢ";
                    continue;
                case 4519:
                    break;
                case 4547:
                    str = "ۥۨۡ";
                    str2 = null;
                    continue;
                case 5629:
                    str = "۟۠ۢ";
                    continue;
                case 7580:
                    str3 = ((C0363) obj).f601;
                    str = "ۦۣۡ";
                    continue;
                case 27303:
                    str = "۠ۨ۠";
                    str2 = str3;
                    continue;
                case 1734403:
                    if (C0380.m5068() <= 0) {
                        break;
                    } else if (C0368.m3171() < 0) {
                        str = "ۣۣۧ";
                    }
            }
            str = "ۤۡۤ";
        }
    }

    /* renamed from: ۥۧۨۦ, reason: contains not printable characters */
    public static String m896(Object obj, Object obj2) {
        String str = "ۣۡۢ";
        String str2 = null;
        String strM863 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56382) {
                case 91:
                    if (C0206.m1807() >= 0) {
                        C0376.m4906();
                        str2 = null;
                    } else {
                        str = "ۨۦۢ";
                        str2 = null;
                        continue;
                    }
                case 126:
                case 1735617:
                    if (C0382.m5180() > 0) {
                        str = "ۣۡۡ";
                    } else {
                        continue;
                    }
                case 198:
                    if (C0390.m5512() <= 0) {
                        str = "ۨ۠ۦ";
                        str2 = strM863;
                    } else {
                        str = "ۣۡۡ";
                        str2 = strM863;
                        continue;
                    }
                case 1709463:
                    if (C0381.m5127() <= 0) {
                        C0179.m1427();
                    } else {
                        str = "ۣۨ";
                        continue;
                    }
                case 1709466:
                    str = "ۢۢ";
                    continue;
                case 1731197:
                    return str2;
                case 1731226:
                    if (C0206.m1807() >= 0) {
                        C0393.m5668();
                    } else {
                        str = "ۣۡۢ";
                        continue;
                    }
                case 1733340:
                    if (C0385.m5282() >= 0) {
                        break;
                    } else if (C0391.m5571() <= 0) {
                        C0346.m3059();
                    } else {
                        str = "ۣ۠ۦ";
                    }
                case 1734525:
                    strM863 = ((CustomDialog) obj).m863((String) obj2);
                    if (C0391.m5571() <= 0) {
                        C0088.m573();
                        str = "ۨۥۢ";
                    } else {
                        str = "ۨ۠";
                        continue;
                    }
                case 1735655:
                    break;
            }
            str = "ۨۦۧ";
        }
    }

    /* renamed from: ۦۤ۠ۥ, reason: contains not printable characters */
    public static String m897(Object obj) {
        String str = "ۥۡۡ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754601) {
                case 101:
                    return str2;
                case 1125:
                case 3149:
                    if (C0391.m5571() <= 0) {
                        str = "ۢۤ۟";
                    } else {
                        str = "ۣۧۨ";
                        continue;
                    }
                case 27284:
                    str = "ۣۧ۠";
                    continue;
                case 29461:
                    str = "ۢۤۥ";
                    str2 = null;
                    continue;
                case 29483:
                    str3 = ((C0363) obj).f598;
                    if (C0082.m410() >= 0) {
                        str = "ۣۨۤ";
                    } else {
                        str = "ۣ۟۟";
                        continue;
                    }
                case 29674:
                    if (C0155.m1294() >= 0) {
                        str = "ۡۢۨ";
                        str2 = str3;
                    } else {
                        str = "ۣۧۨ";
                        str2 = str3;
                        continue;
                    }
                case 30474:
                    if (C0370.m3284() >= 0) {
                        C0229.m2064();
                        str = "ۥۥۧ";
                    } else {
                        str = "ۦۡۧ";
                        continue;
                    }
                case 30764:
                    if (C0206.m1807() >= 0) {
                        break;
                    } else {
                        str = "ۣۥۤ";
                    }
                case 32707:
                    if (C0073.m265() <= 0) {
                        C0060.m216();
                        str = "ۦۤۧ";
                    } else {
                        str = "ۥۡۡ";
                        continue;
                    }
                case 1710505:
                    break;
            }
            if (C0060.m216() > 0) {
                str = "ۣۡۧ";
            }
        }
    }

    /* renamed from: ۦۦۥۦ, reason: contains not printable characters */
    public static String m898(Object obj) {
        String str = "ۣۨۢ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746782) {
                case 2241:
                    str = "ۦ۠ۤ";
                    str2 = null;
                    continue;
                case 2459:
                    return str2;
                case 4439:
                    str = "ۡۡۥ";
                    str2 = str3;
                    continue;
                case 5563:
                    break;
                case 5595:
                    if (C0228.m2012() > 0) {
                        str = "ۡۨۦ";
                    } else {
                        continue;
                    }
                case 5596:
                case 7862:
                    str = "ۡۡۥ";
                    continue;
                case 6484:
                    str = "ۣۨۢ";
                    continue;
                case 26128:
                    str3 = ((C0363) obj).f595;
                    str = "ۣ۟ۥ";
                    continue;
                case 26164:
                    if (C0291.m2568() >= 0) {
                        C0384.m5278();
                    } else {
                        str = "ۤ۠ۤ";
                        continue;
                    }
                case 28185:
                    if (C0025.m118() <= 0) {
                        break;
                    } else {
                        str = C0379.m5056() <= 0 ? "ۦۣۦ" : "ۦ۟ۧ";
                    }
            }
            if (C0370.m3284() >= 0) {
                C0082.m410();
            } else {
                str = "ۢۡۤ";
            }
        }
    }

    /* renamed from: ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static String m899() {
        String str = "۠ۡۧ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749698) {
                case 476:
                    if (C0229.m2064() >= 0) {
                        C0229.m2064();
                    } else {
                        str = "ۦ۟۟";
                        continue;
                    }
                case 3265:
                    str3 = C0363.f589;
                    if (C0390.m5512() <= 0) {
                        C0388.m5430();
                    } else {
                        str = "ۡ۟ۡ";
                        continue;
                    }
                case 5376:
                case 29572:
                    str = "ۣۨۥ";
                    continue;
                case 5574:
                    break;
                case 5601:
                    str = "ۨۤۦ";
                    continue;
                case 6596:
                    if (C0083.m448() > 0) {
                        break;
                    } else {
                        str = "ۥۣۡ";
                    }
                case 7233:
                    str = "ۣۨۥ";
                    str2 = str3;
                    continue;
                case 31624:
                    return str2;
                case 31656:
                    str = "ۢۦۢ";
                    str2 = null;
                    continue;
                case 1732227:
                    str = "۠ۡۧ";
                    continue;
            }
            if (C0164.m1359() >= 0) {
                C0391.m5571();
            } else {
                str = "۟۠ۤ";
            }
        }
    }

    /* renamed from: ۣۨۨۨ, reason: not valid java name and contains not printable characters */
    public static String m900(Object obj) {
        String str = "ۨۨ۠";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746936) {
                case 131:
                    return str2;
                case 3259:
                    str3 = ((C0363) obj).f602;
                    if (C0082.m410() >= 0) {
                        str = "ۧۦۣ";
                    } else {
                        str = "ۤۢۦ";
                        continue;
                    }
                case 4358:
                    break;
                case 4474:
                    str = "ۥۢ۠";
                    str2 = null;
                    continue;
                case 4509:
                case 6655:
                    if (C0381.m5127() <= 0) {
                        str = "ۣ۠ۦ";
                    } else {
                        str = "ۣ۟۟";
                        continue;
                    }
                case 5439:
                    str = "ۨۨ۠";
                    continue;
                case 6683:
                    if (C0009.m36() >= 0) {
                        C0334.m2866();
                        str = "ۣۣۢ";
                    } else {
                        str = "ۣۢۤ";
                        continue;
                    }
                case 7632:
                    str = "ۣ۟۟";
                    str2 = str3;
                    continue;
                case 28184:
                    if (C0346.m3059() >= 0) {
                        break;
                    } else {
                        str = "ۣ۠ۦ";
                    }
                case 1735461:
                    if (C0380.m5068() <= 0) {
                        C0179.m1427();
                    } else {
                        str = "ۣۣۢ";
                        continue;
                    }
            }
            str = "ۧۤ";
        }
    }

    /* renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static String m901(Object obj) {
        String str = "ۡۡ";
        String str2 = null;
        String strM859 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746881) {
                case 2142:
                case 7692:
                    if (C0121.m1023() < 0) {
                        str = "ۣۢ۟";
                    } else {
                        continue;
                    }
                case 2311:
                    str = "ۤ۟ۨ";
                    continue;
                case 4519:
                    if (C0369.m3256() > 0) {
                        str = "ۡۡ";
                    } else {
                        continue;
                    }
                case 5383:
                    break;
                case 5503:
                    return str2;
                case 6537:
                    if (C0074.m307() >= 0) {
                        str = "ۣ۠ۨ";
                    } else {
                        str = "ۤۧۦ";
                        continue;
                    }
                case 7426:
                    str = "ۡۡۦ";
                    str2 = null;
                    continue;
                case 7551:
                    str = "ۣۢ۟";
                    str2 = strM859;
                    continue;
                case 28164:
                    strM859 = m859((String) obj);
                    if (C0025.m118() <= 0) {
                        C0155.m1294();
                        str = "۠۠ۨ";
                    } else {
                        str = "ۤۧۡ";
                        continue;
                    }
                case 1735649:
                    if (C0390.m5512() < 0) {
                        break;
                    } else if (C0082.m410() >= 0) {
                        C0206.m1807();
                    } else {
                        str = "ۨۧۤ";
                    }
            }
            str = "ۥۥۨ";
        }
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ C0363 doInBackground(String[] strArr) {
        String str = "ۥۣۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748829) {
                case 4437:
                    return m893(this, strArr);
                case 27001:
                    if (C0378.m4998() <= 0) {
                        break;
                    } else {
                        str = "ۥۣۦ";
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x00c1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:1006:0x0e73 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1008:0x0e6e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1011:0x0fa5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1020:0x0ca3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1022:0x0c9e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1028:0x0e8e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1053:0x0cae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1057:0x0f14 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1059:0x0f0f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1062:0x0ec1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1063:0x0ebc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1068:0x0c78 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1071:0x0f9a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1076:0x0ee9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1078:0x0ee4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1082:0x0d84 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1088:0x0fb8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1090:0x0fb0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1187:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1233:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1250:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1297:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1315:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1349:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1363:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1367:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1377:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:902:0x0dfe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:903:0x0deb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:904:0x0cda A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:906:0x0cc7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:911:0x0c93 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:912:0x0c8e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:923:0x0fd8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:929:0x0e83 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:931:0x0e7e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:945:0x0da4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:947:0x0d9f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:962:0x0f7a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:974:0x0e48 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:980:0x0d79 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:981:0x0d74 A[SYNTHETIC] */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.content.DialogInterface r60, int r61) {
        /*
            Method dump skipped, instructions count: 4950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.CustomDialog.onClick(android.content.DialogInterface, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0045. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:453:0x062a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x061e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0797 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x078f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x070b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0706 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0651 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x064c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0784 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x077f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0641 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0639 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0665 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x065e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x07a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0697 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0692 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x06d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:545:0x06cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:658:0x003c A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected /* synthetic */ void onPostExecute(com.cloudinject.C0363 r28) {
        /*
            Method dump skipped, instructions count: 2510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.CustomDialog.onPostExecute(java.lang.Object):void");
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        String str = "ۣۣۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1751492) {
                case 3899:
                    super.onPreExecute();
                    if (C0082.m410() >= 0) {
                        break;
                    } else {
                        str = "ۣ۠ۤ";
                        break;
                    }
                case 4741:
                    return;
                case 1729914:
                    if (C0009.m36() < 0) {
                        str = "ۣۣۧ";
                        break;
                    } else {
                        C0388.m5430();
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected /* synthetic */ void onProgressUpdate(java.lang.Exception[] r10) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudinject.CustomDialog.onProgressUpdate(java.lang.Object[]):void");
    }
}
