package com.cloudinject.feature.p021;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.C0009;
import android.app.Instrumentation;
import android.arch.lifecycle.p000.C0025;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.database.C0073;
import android.net.wifi.C0078;
import android.os.Parcel;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.utils.AbstractC0132;
import com.cloudinject.core.utils.C0138;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.C0185;
import com.cloudinject.feature.model.C0187;
import com.cloudinject.feature.model.C0194;
import com.cloudinject.feature.model.C0197;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p019.C0239;
import com.cloudinject.feature.p019.C0264;
import com.cloudinject.feature.p023.C0297;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.C0340;
import com.px.C0368;
import java.io.ByteArrayOutputStream;
import java.net.NetworkInterface;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import mirrorb.RefConstructor;
import mirrorb.RefObject;
import mirrorb.android.app.LoadedApk;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̙̗.۟ۥۣۧۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0291 {

    /* renamed from: ۣ۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean f532;

    /* renamed from: ۟۟ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static String m2540() {
        if (C0384.m5278() > 0) {
            return "97745B701803821F4B0400CEF14AEAB87126529B8EEF34F4";
        }
        return null;
    }

    /* renamed from: ۟۠ۦۢۡ, reason: not valid java name and contains not printable characters */
    public static void m2541(Object obj, Object obj2) {
        if (C0183.m1464() >= 0) {
            ((Instrumentation) obj).sendStringSync((String) obj2);
        }
    }

    /* renamed from: ۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m2542(Object obj) {
        if (C0009.m36() <= 0) {
            return ((C0185) obj).m1561();
        }
        return 0;
    }

    /* renamed from: ۟ۢۤۥ۟, reason: not valid java name and contains not printable characters */
    public static void m2543(Object obj, Object obj2) {
        if (C0380.m5068() > 0) {
            ((WebView) obj).loadUrl((String) obj2);
        }
    }

    /* renamed from: ۟ۢۨۦۢ, reason: not valid java name and contains not printable characters */
    public static String m2544() {
        if (C0380.m5068() > 0) {
            return "android.content.pm.IShortcutService$Stub";
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static String m2545() {
        if (C0379.m5056() >= 0) {
            return "AE94B1FDF788E016";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static void m2546(Object obj, Object obj2) {
        if (C0385.m5282() < 0) {
            ((C0185) obj).m1560((String) obj2);
        }
    }

    /* renamed from: ۟ۥۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m2547(String str) {
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
        int length = bArrM17.length;
        int iM1625 = C0191.m1625(strM52202);
        while (length > 0) {
            bArrM17[-1] = (byte) (bArrM17[-1] ^ C0388.m5438(strM52202, (-1) % iM1625));
        }
        for (int iM16252 = 0; iM16252 < bArrM17.length; iM16252 = C0191.m1625(C0383.m5220()) + 1) {
        }
        return new String(bArrM17);
    }

    /* renamed from: ۟ۥۡۢۤ, reason: not valid java name and contains not printable characters */
    public static void m2548(Object obj, Object obj2) {
        if (C0386.m5322() > 0) {
            C0239.lambda$ihyzgMZF8fGq2ywWynCYoiCD7is((C0239) obj, (DialogInterface) obj2);
        }
    }

    /* renamed from: ۟ۦۣ۠۠, reason: not valid java name and contains not printable characters */
    public static String m2549() {
        if (C0334.m2866() >= 0) {
            return "DD2C128842403852C7D98FD676D78F746E380C18DA5E850D1271B1A123DDCFF3";
        }
        return null;
    }

    /* renamed from: ۟ۦۦۣۥ, reason: not valid java name and contains not printable characters */
    public static Object m2550(Object obj) {
        if (C0395.m5698() < 0) {
            return ((RefConstructor) obj).newInstance();
        }
        return null;
    }

    /* renamed from: ۟ۧۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m2551() {
        if (C0387.m5374() < 0) {
            return "E329259EB99343E7";
        }
        return null;
    }

    /* renamed from: ۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m2552(Object obj) {
        if (C0384.m5278() > 0) {
            return ((NetworkInterface) obj).getName();
        }
        return null;
    }

    /* renamed from: ۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2553(Object obj) {
        if (C0386.m5322() >= 0) {
            return C0297.m2623((int[]) obj);
        }
        return false;
    }

    /* renamed from: ۠ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static String m2554() {
        if (C0395.m5698() <= 0) {
            return ")";
        }
        return null;
    }

    /* renamed from: ۡ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m2555() {
        if (C0206.m1807() <= 0) {
            return "5973240BF0813B78E1727C9F54D288F4";
        }
        return null;
    }

    /* renamed from: ۣۡ۟, reason: not valid java name and contains not printable characters */
    public static String m2556(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۡ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static int m2557(Object obj, Object obj2, int i) {
        if (C0387.m5374() <= 0) {
            return ((SharedPreferences) obj).getInt((String) obj2, i);
        }
        return 0;
    }

    /* renamed from: ۡۧۤۡ, reason: not valid java name and contains not printable characters */
    public static Window m2558(Object obj) {
        if (C0073.m265() >= 0) {
            return ((AlertDialog) obj).getWindow();
        }
        return null;
    }

    /* renamed from: ۢۤۢۡ, reason: not valid java name and contains not printable characters */
    public static String m2559(Object obj) {
        if (C0368.m3171() <= 0) {
            return ((C0340) obj).m2961();
        }
        return null;
    }

    /* renamed from: ۣ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m2560() {
        if (C0395.m5698() < 0) {
            return "6D3CF1F37F96CC87";
        }
        return null;
    }

    /* renamed from: ۣۦۡ۠, reason: not valid java name and contains not printable characters */
    public static MappedByteBuffer m2561(Object obj, Object obj2, long j, long j2) {
        if (C0368.m3171() < 0) {
            return ((FileChannel) obj).map((FileChannel.MapMode) obj2, j, j2);
        }
        return null;
    }

    /* renamed from: ۣۧ, reason: not valid java name and contains not printable characters */
    public static String m2562() {
        if (C0191.m1627() < 0) {
            return "android.os.IVibratorService";
        }
        return null;
    }

    /* renamed from: ۣۧۤۧ, reason: not valid java name and contains not printable characters */
    public static String m2563(Object obj) {
        if (C0073.m265() >= 0) {
            return ((C0187) obj).m1594();
        }
        return null;
    }

    /* renamed from: ۤۦۥۣ, reason: not valid java name and contains not printable characters */
    public static int m2564(int i, int i2) {
        if (C0025.m118() > 0) {
            return Math.max(i, i2);
        }
        return 0;
    }

    /* renamed from: ۣۤۨۡ, reason: not valid java name and contains not printable characters */
    public static List m2565(Object obj, Object obj2) {
        if (C0420.m6215() < 0) {
            return C0138.m1154((AbstractC0132) obj, (List) obj2);
        }
        return null;
    }

    /* renamed from: ۥۢۨۦ, reason: contains not printable characters */
    public static RefObject m2566() {
        if (C0368.m3171() < 0) {
            return LoadedApk.mApplication;
        }
        return null;
    }

    /* renamed from: ۥۦۨ, reason: contains not printable characters */
    public static C0194 m2567(Object obj) {
        if (C0155.m1294() <= 0) {
            return C0194.m1694((String) obj);
        }
        return null;
    }

    /* renamed from: ۥۧۥۢ, reason: contains not printable characters */
    public static int m2568() {
        return (-1753700) ^ C0395.m5690((Object) "ۦۦۥ");
    }

    /* renamed from: ۦۢۡۢ, reason: contains not printable characters */
    public static String m2569() {
        if (C0400.m5961() > 0) {
            return "477578BC5424458F";
        }
        return null;
    }

    /* renamed from: ۦۢۦۦ, reason: contains not printable characters */
    public static String m2570() {
        if (C0089.m592() > 0) {
            return "xz.apk";
        }
        return null;
    }

    /* renamed from: ۦۥۣۡ, reason: contains not printable characters */
    public static String m2571() {
        if (C0078.m361() > 0) {
            return "C0B5306C831C8111";
        }
        return null;
    }

    /* renamed from: ۦۦۡۧ, reason: contains not printable characters */
    public static String m2572() {
        if (C0394.m5672() > 0) {
            return "A08C863135F09F0897F5F89B5CE46D7314B8C4F1F9E32C96C32AB90843107F6B";
        }
        return null;
    }

    /* renamed from: ۦۦۣۡ, reason: contains not printable characters */
    public static void m2573(Object obj, boolean z, Object obj2, Object obj3) {
        if (C0086.m500() >= 0) {
            C0264.lambda$m1O8xWnmApSwwf25_lnbrFDtUEs((C0197) obj, z, (AlertDialogC0269) obj2, (View) obj3);
        }
    }

    /* renamed from: ۣۧۢ۟, reason: not valid java name and contains not printable characters */
    public static void m2574(Object obj, Object obj2) {
        if (C0086.m500() >= 0) {
            ((ClipboardManager) obj).setPrimaryClip((ClipData) obj2);
        }
    }

    /* renamed from: ۧۤۤۧ, reason: not valid java name and contains not printable characters */
    public static int m2575(Object obj) {
        if (C0164.m1359() <= 0) {
            return ((Parcel) obj).dataPosition();
        }
        return 0;
    }

    /* renamed from: ۧۦۣۣ, reason: not valid java name and contains not printable characters */
    public static int m2576(Object obj) {
        if (C0397.m5814() > 0) {
            return ((ActivityManager.RunningAppProcessInfo) obj).pid;
        }
        return 0;
    }

    /* renamed from: ۧۧۤۨ, reason: not valid java name and contains not printable characters */
    public static String m2577() {
        if (C0184.m1524() < 0) {
            return "6977C9672D1480353F71FE36FA3D286F";
        }
        return null;
    }

    /* renamed from: ۧۨۡ, reason: not valid java name and contains not printable characters */
    public static String m2578() {
        if (C0073.m265() > 0) {
            return "android.security.net.config.NetworkSecurityConfigProvider";
        }
        return null;
    }

    /* renamed from: ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static void m2579(Object obj, double d) {
        if (C0395.m5698() < 0) {
            ((Parcel) obj).writeDouble(d);
        }
    }
}
