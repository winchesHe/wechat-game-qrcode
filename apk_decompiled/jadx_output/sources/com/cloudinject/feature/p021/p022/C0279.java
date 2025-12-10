package com.cloudinject.feature.p021.p022;

import android.app.Activity;
import android.app.C0009;
import android.app.Instrumentation;
import android.arch.lifecycle.p000.C0025;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.C0082;
import android.net.C0083;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.provider.MediaStore;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.customview.C0184;
import com.cloudinject.customview.FeatureButton;
import com.cloudinject.customview.FeatureLinearLayout;
import com.cloudinject.feature.model.C0194;
import com.cloudinject.feature.model.C0200;
import com.cloudinject.feature.model.RemoteShareInfo;
import com.cloudinject.feature.model.p014.C0190;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p019.C0236;
import com.cloudinject.feature.p019.C0255;
import com.cloudinject.feature.p021.AlertDialogC0273;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p023.C0327;
import com.cloudinject.feature.p023.C0330;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0344;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.App;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Constructor;
import java.net.NetworkInterface;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Enumeration;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import org.json.JSONArray;

/* renamed from: com.cloudinject.feature.̙̗.̗.۠ۥۥ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0279 {

    /* renamed from: ۣ۟۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static int f514 = -3;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static void m2460(Object obj) {
        if (C0228.m2012() > 0) {
            C0236.m2104((Context) obj);
        }
    }

    /* renamed from: ۟۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2461(Object obj, Object obj2) {
        if (C0228.m2012() >= 0) {
            C0330.m2826((Context) obj, (String) obj2);
        }
    }

    /* renamed from: ۣ۟۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m2462() {
        if (C0082.m410() <= 0) {
            return "CD1305072CAE2473CE5D33AF5878B4DEF86BB05E23D9D1C8A9EB12BFACD085CC";
        }
        return null;
    }

    /* renamed from: ۟۟۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static void m2463(Object obj, int i) {
        if (C0379.m5056() >= 0) {
            ((C0194) obj).m1703(i);
        }
    }

    /* renamed from: ۣ۟۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m2464(Object obj, Object obj2) {
        if (C0384.m5278() >= 0) {
            ((ImageView) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* renamed from: ۟۟ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m2465(Object obj, Object obj2) {
        if (C0388.m5430() >= 0) {
            ((Window) obj).setBackgroundDrawable((Drawable) obj2);
        }
    }

    /* renamed from: ۟۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m2466(Object obj, Object obj2) {
        if (C0368.m3171() < 0) {
            return ((Constructor) obj).newInstance((Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m2467() {
        if (C0291.m2568() <= 0) {
            return "67EC82C6EA4A9B42";
        }
        return null;
    }

    /* renamed from: ۟۟ۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m2468(Object obj) {
        if (C0088.m573() > 0) {
            ((FeatureLinearLayout) obj).init();
        }
    }

    /* renamed from: ۟۟ۨۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2469(Object obj, Object obj2) {
        if (C0346.m3059() <= 0) {
            return ((C0255) obj).m2276((Context) obj2);
        }
        return false;
    }

    /* renamed from: ۟۠۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m2470() {
        if (C0393.m5668() >= 0) {
            return "7F8598621C2C2D6E";
        }
        return null;
    }

    /* renamed from: ۟۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static Long m2471(Object obj) {
        if (C0383.m5203() > 0) {
            return Long.valueOf((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۠ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static String m2472() {
        if (C0335.m2923() < 0) {
            return "com.android.internal.app.ISmtOpsService$Stub";
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m2473() {
        if (C0394.m5672() > 0) {
            return "android.app.ActivityThread$AppBindData";
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static String m2474(Object obj) {
        if (C0155.m1294() <= 0) {
            return ((C0200) obj).getMessage();
        }
        return null;
    }

    /* renamed from: ۟ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2475(Object obj, Object obj2) {
        if (C0335.m2923() < 0) {
            return ((String) obj).contains((CharSequence) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static String m2476(Object obj) {
        if (C0362.m3122() <= 0) {
            return ((RemoteShareInfo) obj).getMessage();
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m2477(Object obj, Object obj2) {
        if (C0382.m5180() > 0) {
            ((C0190) obj).setHost((String) obj2);
        }
    }

    /* renamed from: ۟ۢۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m2478() {
        if (C0393.m5668() > 0) {
            return "F07AC86EE27AF30EC4D5F3842B47F824FB10618D5CC87F772FB54D43CF7AE521";
        }
        return null;
    }

    /* renamed from: ۟ۢۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m2479() {
        if (C0089.m592() > 0) {
            return "F3FA29A454D58C281AC864E4D3CD2FF1C562E2D40EF22DE489747B5C837AA6A2";
        }
        return null;
    }

    /* renamed from: ۟ۢۨۢۧ, reason: not valid java name and contains not printable characters */
    public static String m2480() {
        if (C0399.m5914() >= 0) {
            return "android.location.ILocationListener$Stub";
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static Uri m2481(Object obj) {
        if (C0379.m5056() > 0) {
            return MediaStore.Files.getContentUri((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static String m2482() {
        if (C0370.m3284() <= 0) {
            return "F628A1E0C10978F9";
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static Charset m2483(Object obj) {
        if (C0397.m5814() > 0) {
            return Charset.forName((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۢۡ, reason: not valid java name and contains not printable characters */
    public static File m2484(Object obj, Object obj2) {
        if (C0088.m573() >= 0) {
            return C0327.m2815((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Uri m2485() {
        if (C0400.m5961() >= 0) {
            return MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        return null;
    }

    /* renamed from: ۟ۤۥۡۢ, reason: not valid java name and contains not printable characters */
    public static String m2486() {
        if (C0397.m5814() >= 0) {
            return "4261D7DD0EC287140E33180838779B54";
        }
        return null;
    }

    /* renamed from: ۟ۤۦۨ۟, reason: not valid java name and contains not printable characters */
    public static int m2487(Object obj) {
        if (C0089.m592() >= 0) {
            return ((JSONArray) obj).length();
        }
        return 0;
    }

    /* renamed from: ۟ۥۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m2488() {
        if (C0382.m5180() > 0) {
            return "android.app.ActivityManagerNative";
        }
        return null;
    }

    /* renamed from: ۟ۦۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m2489(Object obj, int i) {
        if (C0088.m573() >= 0) {
            return Integer.parseInt((String) obj, i);
        }
        return 0;
    }

    /* renamed from: ۟ۧۤۦۣ, reason: not valid java name and contains not printable characters */
    public static String m2490() {
        if (C0088.m573() > 0) {
            return "android.app.IAlarmManager$Stub";
        }
        return null;
    }

    /* renamed from: ۟ۧۧۧ۠, reason: not valid java name and contains not printable characters */
    public static int m2491() {
        return (-1749514) ^ C0395.m5690((Object) "ۢ۟ۧ");
    }

    /* renamed from: ۠ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static int m2492(Object obj) {
        if (C0291.m2568() <= 0) {
            return ((Collection) obj).size();
        }
        return 0;
    }

    /* renamed from: ۡۦ۠۠, reason: not valid java name and contains not printable characters */
    public static Enumeration m2493() {
        if (C0191.m1627() <= 0) {
            return NetworkInterface.getNetworkInterfaces();
        }
        return null;
    }

    /* renamed from: ۡۧۦۧ, reason: not valid java name and contains not printable characters */
    public static void m2494(Object obj, Object obj2) {
        if (C0387.m5374() < 0) {
            ((Parcel) obj).writeBundle((Bundle) obj2);
        }
    }

    /* renamed from: ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static C0344 m2495(Object obj, boolean z, Object obj2) {
        if (C0369.m3256() > 0) {
            return C0344.m3006((String) obj, z, (ClassLoader) obj2);
        }
        return null;
    }

    /* renamed from: ۢۨۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2496(Object obj, Object obj2, int i, int i2) {
        if (C0164.m1359() < 0) {
            return ((Instrumentation) obj).invokeContextMenuAction((Activity) obj2, i, i2);
        }
        return false;
    }

    /* renamed from: ۣ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static Uri m2497(Object obj, Object obj2, Object obj3) {
        if (C0206.m1807() <= 0) {
            return ((ContentResolver) obj).insert((Uri) obj2, (ContentValues) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static String m2498(String str) {
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

    /* renamed from: ۤۡۨۧ, reason: not valid java name and contains not printable characters */
    public static void m2499(Object obj, Object obj2) {
        if (C0083.m448() < 0) {
            ((AlertDialogC0277) obj).setView((View) obj2);
        }
    }

    /* renamed from: ۣۣۤۢ, reason: not valid java name and contains not printable characters */
    public static String m2500() {
        if (C0378.m4998() >= 0) {
            return App.VERSION_NAME;
        }
        return null;
    }

    /* renamed from: ۤۥۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m2501(Object obj, int i) {
        if (C0334.m2866() > 0) {
            return ((SparseArray) obj).valueAt(i);
        }
        return null;
    }

    /* renamed from: ۥ۟ۢۦ, reason: contains not printable characters */
    public static void m2502(Object obj, Object obj2) {
        if (C0184.m1524() <= 0) {
            ((AlertDialogC0273) obj).setTitle((CharSequence) obj2);
        }
    }

    /* renamed from: ۥۣۢۤ, reason: contains not printable characters */
    public static void m2503(Object obj, Object obj2) {
        if (C0362.m3122() < 0) {
            ((FeatureButton) obj).setText((CharSequence) obj2);
        }
    }

    /* renamed from: ۥۧۧ۠, reason: contains not printable characters */
    public static void m2504(Object obj, Object obj2) {
        if (C0392.m5595() >= 0) {
            ((TextView) obj).setText((CharSequence) obj2);
        }
    }

    /* renamed from: ۧ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static String m2505(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۧۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m2506() {
        if (C0025.m118() > 0) {
            return "android.nfc.INfcAdapter";
        }
        return null;
    }

    /* renamed from: ۧۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m2507() {
        if (C0334.m2866() >= 0) {
            return "huawei.android.app.HwApiCacheMangerEx";
        }
        return null;
    }

    /* renamed from: ۣۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m2508() {
        if (C0164.m1359() < 0) {
            return "android.accounts.IAccountManager";
        }
        return null;
    }
}
