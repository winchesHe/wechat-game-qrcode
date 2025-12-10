package com.sadfxg.fasg;

import android.app.Activity;
import android.app.C0009;
import android.app.Instrumentation;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.C0074;
import android.net.wifi.C0078;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.BuildCompat;
import com.cloudinject.core.utils.compat.C0115;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.C0185;
import com.cloudinject.feature.model.C0201;
import com.cloudinject.feature.model.RemoteShareInfo;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p019.C0261;
import com.cloudinject.feature.p023.C0326;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.p026.C0344;
import com.cloudinject.p025.p026.C0346;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;
import mirrorb.RefObject;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.ActivityThread;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.dalvik.system.C0399;
import org.json.JSONTokener;
import p027.p028.p029.C0420;
import p027.p028.p029.InterfaceC0417;
import sun.misc.Unsafe;

/* renamed from: com.sadfxg.fasg.ۡ۠ۨ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0370 {

    /* renamed from: ۟۟ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static int f616 = 10;

    /* renamed from: ۟۟۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m3268(Object obj, int i) {
        if (C0377.m4944() >= 0) {
            ((C0201) obj).m1792(i);
        }
    }

    /* renamed from: ۟۟ۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m3269(Object obj, Object obj2, int i) {
        if (C0378.m4998() > 0) {
            return ((Context) obj).getSharedPreferences((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ۟۟ۧۥۧ, reason: not valid java name and contains not printable characters */
    public static String m3270() {
        if (C0184.m1524() <= 0) {
            return "android.app.ApplicationThreadNative";
        }
        return null;
    }

    /* renamed from: ۟۠ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static void m3271(Object obj, Object obj2) {
        if (C0369.m3256() > 0) {
            ((App) obj).m3217((Activity) obj2);
        }
    }

    /* renamed from: ۟۠ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static String m3272(Object obj) {
        if (C0183.m1464() >= 0) {
            return ((UUID) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m3273(Object obj, int i) {
        if (C0074.m307() < 0) {
            return ((List) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static String m3274() {
        if (C0228.m2012() >= 0) {
            return "50FD1D84C447912A8C276F0BF96EAAE0";
        }
        return null;
    }

    /* renamed from: ۟ۡۦۡۥ, reason: not valid java name and contains not printable characters */
    public static String m3275() {
        if (C0074.m307() < 0) {
            return "657C78DEFD378479";
        }
        return null;
    }

    /* renamed from: ۟ۡۨ۟۠, reason: not valid java name and contains not printable characters */
    public static Object m3276(Object obj) {
        if (C0179.m1427() > 0) {
            return ((JSONTokener) obj).nextValue();
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static String m3277() {
        if (C0009.m36() <= 0) {
            return "B8CFEA4C64F77E48";
        }
        return null;
    }

    /* renamed from: ۟ۢۥۡۢ, reason: not valid java name and contains not printable characters */
    public static String m3278() {
        if (C0346.m3059() < 0) {
            return "453A22F91EDD6D8778544FAA6B899687E2E36D8A9A1411D4";
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m3279(Object obj) {
        if (C0025.m118() > 0) {
            return ((C0185) obj).getMessage();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static C0344 m3280(Object obj) {
        if (C0184.m1524() < 0) {
            return C0344.m3007((Class) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3281() {
        if (C0334.m2866() > 0) {
            return BuildCompat.m906();
        }
        return false;
    }

    /* renamed from: ۣ۟ۦ۠۟, reason: not valid java name and contains not printable characters */
    public static String m3282() {
        if (C0420.m6215() <= 0) {
            return "805DC61EDA235195C2EAE0467763D50764457F78BFEE9FD2A94EA097D5D510446199F38186E13E162134BFBAEFA362C3";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static String m3283(Object obj) {
        if (C0376.m4906() > 0) {
            return C0326.m2801((Context) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static int m3284() {
        return (-1748825) ^ C0395.m5690((Object) "ۣۡۤ");
    }

    /* renamed from: ۟ۤۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m3285(String str) {
        String strM5220 = C0383.m5220();
        String strM52202 = C0383.m5220();
        for (int i = 0; i < 15; i++) {
            strM5220 = C0378.m5011(C0386.m5329(C0386.m5329(new StringBuffer(), strM5220), C0184.m1517(i)));
            strM52202 = C0378.m5011(C0399.m5879(C0386.m5329(new StringBuffer(), strM52202), ((int) (C0384.m5270() * 10)) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0191.m1625(str) / 2);
        for (int i2 = 0; i2 < C0191.m1625(str); i2 += 2) {
            C0399.m5883(byteArrayOutputStream, (C0164.m1371(strM5220, C0388.m5438(str, i2)) << 4) | C0164.m1371(strM5220, C0388.m5438(str, i2 + 1)));
        }
        byte[] bArrM17 = C0009.m17(byteArrayOutputStream);
        String strM6244 = C0420.m6244();
        while (C0191.m1625(strM6244) > 0) {
            strM6244 = C0383.m5220();
            if (C0191.m1625(strM6244) == 0) {
                strM6244 = C0420.m6244();
            }
        }
        int iM1625 = C0191.m1625(strM6244);
        int iM16252 = C0191.m1625(strM52202);
        for (int i3 = 0; i3 < iM1625; i3++) {
            bArrM17[i3] = (byte) (bArrM17[i3] ^ C0388.m5438(strM52202, i3 % iM16252));
        }
        for (int iM16253 = 0; iM16253 < bArrM17.length; iM16253 = C0191.m1625(C0383.m5220()) + 1) {
        }
        return new String(bArrM17);
    }

    /* renamed from: ۟ۥۡۧۥ, reason: not valid java name and contains not printable characters */
    public static String m3286() {
        if (C0378.m4998() > 0) {
            return "write";
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m3287() {
        if (C0398.m5833() > 0) {
            return "com.android.internal.telephony.ITelephonyRegistry$Stub";
        }
        return null;
    }

    /* renamed from: ۟ۦۢۦۡ, reason: not valid java name and contains not printable characters */
    public static String m3288(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۟ۦۣۨ۟, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m3289(Object obj) {
        if (C0388.m5430() > 0) {
            return ByteBuffer.wrap((byte[]) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m3290() {
        if (C0377.m4944() > 0) {
            return "C84261386B30D677887D1EA344E5DC55";
        }
        return null;
    }

    /* renamed from: ۣ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static C0261 m3291() {
        if (C0088.m573() > 0) {
            return C0261.m2335();
        }
        return null;
    }

    /* renamed from: ۠ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static String m3292() {
        if (C0394.m5672() >= 0) {
            return "android.os.Bundle";
        }
        return null;
    }

    /* renamed from: ۣۣۡۨ, reason: not valid java name and contains not printable characters */
    public static String m3293() {
        if (C0380.m5068() >= 0) {
            return "android.bluetooth.IBluetooth";
        }
        return null;
    }

    /* renamed from: ۡۤۤۥ, reason: not valid java name and contains not printable characters */
    public static String m3294() {
        if (C0346.m3059() <= 0) {
            return "6352198648D6644D8CEE503AC5102735D89C5146153C05C307E94C287C7D7F39";
        }
        return null;
    }

    /* renamed from: ۡۥۣۢ, reason: not valid java name and contains not printable characters */
    public static void m3295(Object obj) throws IOException {
        if (C0399.m5914() > 0) {
            ((BufferedReader) obj).close();
        }
    }

    /* renamed from: ۡۦۦۧ, reason: not valid java name and contains not printable characters */
    public static String m3296() {
        if (C0378.m4998() > 0) {
            return "0CB4D09FEB2B6050";
        }
        return null;
    }

    /* renamed from: ۢۤۨۦ, reason: not valid java name and contains not printable characters */
    public static Bundle m3297(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0078.m361() > 0) {
            return ((ContentProviderClient) obj).call((String) obj2, (String) obj3, (Bundle) obj4);
        }
        return null;
    }

    /* renamed from: ۣۦۢ۠, reason: not valid java name and contains not printable characters */
    public static String m3298() {
        if (C0395.m5698() < 0) {
            return "500273F9288CEB77";
        }
        return null;
    }

    /* renamed from: ۤۢۥ۟, reason: not valid java name and contains not printable characters */
    public static String m3299() {
        if (C0381.m5127() >= 0) {
            return "methods";
        }
        return null;
    }

    /* renamed from: ۤۢۧۦ, reason: not valid java name and contains not printable characters */
    public static void m3300(Object obj, Object obj2) throws ProtocolException {
        if (C0078.m361() > 0) {
            ((HttpURLConnection) obj).setRequestMethod((String) obj2);
        }
    }

    /* renamed from: ۤۥۢۦ, reason: not valid java name and contains not printable characters */
    public static String m3301() {
        if (C0191.m1627() <= 0) {
            return "com.android.internal.telephony.IPhoneSubInfo$Stub";
        }
        return null;
    }

    /* renamed from: ۣۤۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3302(Object obj, Object obj2, int i) {
        if (C0009.m36() <= 0) {
            return ((Instrumentation) obj).checkMonitorHit((Instrumentation.ActivityMonitor) obj2, i);
        }
        return false;
    }

    /* renamed from: ۥۣۥۡ, reason: contains not printable characters */
    public static void m3303(Object obj, Object obj2) {
        if (C0346.m3059() <= 0) {
            ((RemoteShareInfo) obj).setTitle((String) obj2);
        }
    }

    /* renamed from: ۥۣۦۡ, reason: contains not printable characters */
    public static String m3304() {
        if (C0025.m118() > 0) {
            return InterfaceC0417.f664;
        }
        return null;
    }

    /* renamed from: ۥۣۤ۠, reason: contains not printable characters */
    public static StringBuilder m3305(Object obj, char c) {
        if (C0334.m2866() > 0) {
            return ((StringBuilder) obj).append(c);
        }
        return null;
    }

    /* renamed from: ۥۥۣۧ, reason: contains not printable characters */
    public static void m3306(Object obj) {
        if (C0386.m5322() >= 0) {
            ((Instrumentation) obj).stopProfiling();
        }
    }

    /* renamed from: ۥۨۤۤ, reason: contains not printable characters */
    public static boolean m3307(Object obj) {
        if (C0375.m4840() <= 0) {
            return ((IBinder) obj).isBinderAlive();
        }
        return false;
    }

    /* renamed from: ۦۣ۟۠, reason: contains not printable characters */
    public static void m3308(long j) {
        if (C0393.m5668() >= 0) {
            Binder.restoreCallingIdentity(j);
        }
    }

    /* renamed from: ۦ۟ۨۡ, reason: contains not printable characters */
    public static String m3309() {
        if (C0089.m592() > 0) {
            return "529762442784415B";
        }
        return null;
    }

    /* renamed from: ۦۡۦۤ, reason: contains not printable characters */
    public static RefObject m3310() {
        if (C0399.m5914() > 0) {
            return ActivityThread.mInitialApplication;
        }
        return null;
    }

    /* renamed from: ۦۤ۟ۥ, reason: contains not printable characters */
    public static Object m3311(Object obj, Object obj2, long j) {
        if (C0393.m5668() > 0) {
            return ((Unsafe) obj).getObject(obj2, j);
        }
        return null;
    }

    /* renamed from: ۦۧ۠ۧ, reason: contains not printable characters */
    public static String m3312() {
        if (C0184.m1524() < 0) {
            return "8A7A3A1C64D23EF6";
        }
        return null;
    }

    /* renamed from: ۧ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static String m3313() {
        if (C0009.m36() < 0) {
            return "android.content.IRestrictionsManager";
        }
        return null;
    }

    /* renamed from: ۧۡۢۨ, reason: not valid java name and contains not printable characters */
    public static String m3314(Object obj) {
        if (C0334.m2866() > 0) {
            return C0115.get((String) obj);
        }
        return null;
    }

    /* renamed from: ۧۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3315(Object obj, Object obj2) {
        if (C0086.m500() > 0) {
            return ((List) obj).remove(obj2);
        }
        return false;
    }

    /* renamed from: ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static String m3316() {
        if (m3284() < 0) {
            return "8F92F0DBBAF88C840CC684B2DCD097C944829ECB8ADE1E70B2A12FB78315C016";
        }
        return null;
    }

    /* renamed from: ۧۥ۟, reason: not valid java name and contains not printable characters */
    public static String m3317() {
        if (C0399.m5914() > 0) {
            return "D4A737180F99CAB727E24BAE6FBC256BA940D1E488300D30D10CCA08B5B95176";
        }
        return null;
    }

    /* renamed from: ۧۧۤۧ, reason: not valid java name and contains not printable characters */
    public static String m3318() {
        if (C0060.m216() >= 0) {
            return "A790F71AB57DD5C2DE1326DCDC5471F9";
        }
        return null;
    }

    /* renamed from: ۨۦۥۥ, reason: not valid java name and contains not printable characters */
    public static String m3319() {
        if (C0377.m4944() > 0) {
            return "6F08F6E4ABB7AA63F0DEA6CFD356CA8F";
        }
        return null;
    }
}
