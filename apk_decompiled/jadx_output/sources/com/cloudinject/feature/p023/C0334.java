package com.cloudinject.feature.p023;

import android.app.Activity;
import android.app.C0009;
import android.app.Instrumentation;
import android.arch.p003.p005.C0060;
import android.content.ComponentName;
import android.content.Intent;
import android.net.C0082;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.provider.MediaStore;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.BuildCompat;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.C0185;
import com.cloudinject.feature.model.C0197;
import com.cloudinject.feature.model.C0200;
import com.cloudinject.feature.model.RemoteShareInfo;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p016.C0211;
import com.cloudinject.feature.p018.C0220;
import com.cloudinject.feature.p021.p022.InterfaceC0275;
import com.cloudinject.feature.p023.p024.AbstractC0307;
import com.cloudinject.p025.C0351;
import com.cloudinject.p025.C0362;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.io.ByteArrayOutputStream;
import java.lang.Thread;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̙̙.۟ۢۨ۠ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0334 {

    /* renamed from: ۥۦۤۡ, reason: contains not printable characters */
    public static int f558 = 78;

    /* renamed from: ۣ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m2854() {
        if (C0191.m1627() < 0) {
            return "54F1A687613DE487D99311F51858570F";
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2855(Object obj, Object obj2, int i) {
        if (C0420.m6215() <= 0) {
            return ((InputMethodManager) obj).hideSoftInputFromWindow((IBinder) obj2, i);
        }
        return false;
    }

    /* renamed from: ۣ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m2856(Object obj, Object obj2) {
        if (C0121.m1023() < 0) {
            ((Parcel) obj).writeByteArray((byte[]) obj2);
        }
    }

    /* renamed from: ۟۟ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static String m2857() {
        if (C0400.m5961() > 0) {
            return "71BF65DF8979788932577F7C7117A487";
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m2858(Object obj, Object obj2) {
        if (C0184.m1524() <= 0) {
            ((C0200) obj).m1766((String) obj2);
        }
    }

    /* renamed from: ۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m2859() {
        if (C0381.m5127() >= 0) {
            return "android.app.LoadedApk$ServiceDispatcher";
        }
        return null;
    }

    /* renamed from: ۟ۢ۟۟۟, reason: not valid java name and contains not printable characters */
    public static byte[] m2860(Object obj) {
        if (C0396.m5741() < 0) {
            return ((MessageDigest) obj).digest();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Intent m2861(Object obj, Object obj2) {
        if (C0088.m573() > 0) {
            return ((Intent) obj).setComponent((ComponentName) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m2862(Object obj) {
        if (C0362.m3122() < 0) {
            return C0297.m2687((CharSequence) obj);
        }
        return 0;
    }

    /* renamed from: ۟ۢۨۤ۟, reason: not valid java name and contains not printable characters */
    public static String m2863(Object obj) {
        if (C0369.m3256() >= 0) {
            return ((C0197) obj).getTitle();
        }
        return null;
    }

    /* renamed from: ۟ۢۨۤۥ, reason: not valid java name and contains not printable characters */
    public static void m2864(Object obj, Object obj2) {
        if (C0389.m5481() >= 0) {
            ((RemoteShareInfo) obj).setNeutralActionType((Integer) obj2);
        }
    }

    /* renamed from: ۣ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m2865() {
        if (C0191.m1627() < 0) {
            return "9DA80C95B6FD5B2A";
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static int m2866() {
        return 1752502 ^ C0395.m5690((Object) "ۥ۟ۧ");
    }

    /* renamed from: ۣ۟ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static void m2867(Object obj, Object obj2, Object obj3) {
        if (C0388.m5430() > 0) {
            ((InterfaceC0275) obj).mo2433((String) obj2, (String) obj3);
        }
    }

    /* renamed from: ۟ۤۢۧۥ, reason: not valid java name and contains not printable characters */
    public static String m2868() {
        if (C0375.m4840() < 0) {
            return "5C4A128BCB3DA1F3";
        }
        return null;
    }

    /* renamed from: ۟ۤۦۣۧ, reason: not valid java name and contains not printable characters */
    public static void m2869(Object obj, Object obj2) {
        if (C0370.m3284() <= 0) {
            Collections.sort((List) obj, (Comparator) obj2);
        }
    }

    /* renamed from: ۟ۥ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m2870(Object obj, int i) {
        if (C0060.m216() > 0) {
            ((TextView) obj).setVisibility(i);
        }
    }

    /* renamed from: ۟ۥۡ۠, reason: not valid java name and contains not printable characters */
    public static Thread.UncaughtExceptionHandler m2871() {
        if (C0369.m3256() > 0) {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
        return null;
    }

    /* renamed from: ۟ۥۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m2872() {
        if (C0400.m5961() >= 0) {
            return "CB7F341DA6C1022620DE491823774AF1DC2454B41538417B";
        }
        return null;
    }

    /* renamed from: ۟ۥۣۤۦ, reason: not valid java name and contains not printable characters */
    public static String m2873(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۟ۥۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m2874() {
        if (C0376.m4906() > 0) {
            return "android.content.pm.PackageParser$Package";
        }
        return null;
    }

    /* renamed from: ۟ۦۤۧۨ, reason: not valid java name and contains not printable characters */
    public static String m2875() {
        if (C0383.m5203() >= 0) {
            return "D6953CE052C20DFD";
        }
        return null;
    }

    /* renamed from: ۟ۦۨ۟۠, reason: not valid java name and contains not printable characters */
    public static long m2876() {
        if (C0088.m573() > 0) {
            return Binder.clearCallingIdentity();
        }
        return 0L;
    }

    /* renamed from: ۟ۦۨۦۥ, reason: not valid java name and contains not printable characters */
    public static String m2877() {
        if (C0164.m1359() < 0) {
            return "001D2762A753560B";
        }
        return null;
    }

    /* renamed from: ۟ۧۡۦۤ, reason: not valid java name and contains not printable characters */
    public static void m2878(Object obj, Object obj2, int i, Object obj3, Object obj4) throws Throwable {
        if (C0164.m1359() <= 0) {
            C0220.lambda$czFund5QbCSPYSituDUwK7K1WYE((String) obj, (String) obj2, i, (AbstractC0307) obj3, (AbstractC0307) obj4);
        }
    }

    /* renamed from: ۣ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static String m2879() {
        if (C0390.m5512() > 0) {
            return "57829289BF1FBFA6";
        }
        return null;
    }

    /* renamed from: ۠ۡۦۨ, reason: not valid java name and contains not printable characters */
    public static String m2880(Object obj) {
        if (C0388.m5430() > 0) {
            return String.valueOf(obj);
        }
        return null;
    }

    /* renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m2881() {
        if (C0384.m5278() > 0) {
            return "1BF4DCA5779DA562";
        }
        return null;
    }

    /* renamed from: ۠ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m2882(Object obj, Object obj2) {
        if (C0086.m500() > 0) {
            ((Instrumentation) obj).callActivityOnRestart((Activity) obj2);
        }
    }

    /* renamed from: ۡۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m2883(String str) {
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
        for (int i3 = 0; i3 < length; i3++) {
            bArrM17[i3] = (byte) (bArrM17[i3] ^ C0388.m5438(strM52202, i3 % iM1625));
        }
        for (int iM16252 = 0; iM16252 < bArrM17.length; iM16252 = C0191.m1625(C0383.m5220()) + 1) {
        }
        return new String(bArrM17);
    }

    /* renamed from: ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m2884(Object obj) {
        if (C0420.m6215() < 0) {
            return System.getProperty((String) obj);
        }
        return null;
    }

    /* renamed from: ۢۢۡۢ, reason: not valid java name and contains not printable characters */
    public static Uri m2885(Object obj, long j) {
        if (m2866() > 0) {
            return MediaStore.Files.getContentUri((String) obj, j);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2886() {
        if (C0184.m1524() < 0) {
            return BuildCompat.m902();
        }
        return false;
    }

    /* renamed from: ۣۢۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2887(Object obj) {
        if (C0082.m410() <= 0) {
            return ((AtomicBoolean) obj).get();
        }
        return false;
    }

    /* renamed from: ۤۥۢۧ, reason: not valid java name and contains not printable characters */
    public static void m2888(Object obj) {
        if (C0389.m5481() > 0) {
            ((Instrumentation) obj).stopAllocCounting();
        }
    }

    /* renamed from: ۤۥۣ, reason: not valid java name and contains not printable characters */
    public static String m2889() {
        if (C0393.m5668() >= 0) {
            return "9717D0C529424CB872339577454CCE1D";
        }
        return null;
    }

    /* renamed from: ۥۢۧۨ, reason: contains not printable characters */
    public static String m2890() {
        if (C0088.m573() >= 0) {
            return "805DC61EDA2351957CB095263BE78E79EC6EE3B35B4A9279";
        }
        return null;
    }

    /* renamed from: ۣۧ۟۟, reason: not valid java name and contains not printable characters */
    public static String m2891() {
        if (C0179.m1427() > 0) {
            return "android.app.usage.StorageStats";
        }
        return null;
    }

    /* renamed from: ۣۧۢۨ, reason: not valid java name and contains not printable characters */
    public static String m2892(Object obj) {
        if (C0009.m36() <= 0) {
            return ((StackTraceElement) obj).getClassName();
        }
        return null;
    }

    /* renamed from: ۧۦۤۨ, reason: not valid java name and contains not printable characters */
    public static void m2893(Object obj) {
        if (C0368.m3171() < 0) {
            C0211.m1848((String) obj);
        }
    }

    /* renamed from: ۧۧۡ۠, reason: not valid java name and contains not printable characters */
    public static String m2894() {
        if (C0386.m5322() >= 0) {
            return "android.app.admin.IDevicePolicyManager";
        }
        return null;
    }

    /* renamed from: ۣۨۡۦ, reason: not valid java name and contains not printable characters */
    public static C0351 m2895() {
        if (C0369.m3256() >= 0) {
            return C0351.m3073();
        }
        return null;
    }

    /* renamed from: ۨۧۤ۠, reason: not valid java name and contains not printable characters */
    public static int m2896(Object obj) {
        if (C0184.m1524() < 0) {
            return ((C0185) obj).m1567();
        }
        return 0;
    }
}
