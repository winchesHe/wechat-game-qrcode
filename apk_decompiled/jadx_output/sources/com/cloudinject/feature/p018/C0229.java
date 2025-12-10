package com.cloudinject.feature.p018;

import android.app.Activity;
import android.app.Application;
import android.app.C0009;
import android.app.Instrumentation;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.C0129;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.customview.FeatureButton;
import com.cloudinject.customview.FeatureLinearLayout;
import com.cloudinject.feature.model.C0188;
import com.cloudinject.feature.model.C0195;
import com.cloudinject.feature.model.C0200;
import com.cloudinject.feature.model.RemoteShareInfo;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p019.C0261;
import com.cloudinject.feature.p021.AbstractC0289;
import com.cloudinject.feature.p021.AlertDialogC0273;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p023.C0295;
import com.cloudinject.feature.p023.C0297;
import com.cloudinject.feature.p023.C0327;
import com.px.C0368;
import com.sadfxg.fasg.App;
import com.sadfxg.fasg.C0370;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import javax.crypto.SecretKey;
import mirrorb.RefClass;
import mirrorb.RefConstructor;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.pm.ParceledListSlice;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̗̗.۟ۧۦۤۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0229 {

    /* renamed from: ۤۥۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean f383 = true;

    /* renamed from: ۟۟ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static String m2031() {
        if (C0088.m573() > 0) {
            return "com.android.internal.telephony.IHwTelephony$Stub";
        }
        return null;
    }

    /* renamed from: ۟۟ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Class m2032(Object obj, Object obj2) {
        if (C0395.m5698() <= 0) {
            return RefClass.load((Class) obj, (Class<?>) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m2033(Object obj) {
        if (C0397.m5814() > 0) {
            ((AbstractC0289) obj).onStart();
        }
    }

    /* renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m2034() {
        if (C0121.m1023() < 0) {
            return "77690C3D24D4E5A30539247ED7501040BC123D6873C82E97";
        }
        return null;
    }

    /* renamed from: ۟ۡۤۦۣ, reason: not valid java name and contains not printable characters */
    public static MethodHandle m2035(Object obj, Object obj2) {
        if (C0390.m5512() > 0) {
            return ((MethodHandles.Lookup) obj).unreflectGetter((Field) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۤۧۢ, reason: not valid java name and contains not printable characters */
    public static SecretKey m2036() {
        if (C0420.m6215() <= 0) {
            return App.secretKey;
        }
        return null;
    }

    /* renamed from: ۟ۢ۠۠۟, reason: not valid java name and contains not printable characters */
    public static ClipData m2037(Object obj, Object obj2) {
        if (C0395.m5698() <= 0) {
            return ClipData.newPlainText((CharSequence) obj, (CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۡۢۡ, reason: not valid java name and contains not printable characters */
    public static void m2038(Object obj) {
        if (C0395.m5698() <= 0) {
            ((AbstractC0289) obj).onDestroy();
        }
    }

    /* renamed from: ۟ۤۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static ComponentName m2039(Object obj, Object obj2) {
        if (C0089.m592() >= 0) {
            return ((Intent) obj).resolveActivity((PackageManager) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2040(Object obj, Object obj2) {
        if (C0291.m2568() < 0) {
            ((RemoteShareInfo) obj).setMessage((String) obj2);
        }
    }

    /* renamed from: ۟ۥۣۥۧ, reason: not valid java name and contains not printable characters */
    public static String m2041(Object obj) {
        if (C0368.m3171() <= 0) {
            return ((RemoteShareInfo) obj).getCancelText();
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m2042(Object obj, Object obj2) {
        if (m2064() <= 0) {
            ((C0261) obj).m2352((C0200) obj2);
        }
    }

    /* renamed from: ۟ۦۦۨۧ, reason: not valid java name and contains not printable characters */
    public static Context m2043() {
        if (C0179.m1427() > 0) {
            return App.getContext();
        }
        return null;
    }

    /* renamed from: ۟ۦۣۧۧ, reason: not valid java name and contains not printable characters */
    public static RefConstructor m2044() {
        if (C0386.m5322() >= 0) {
            return ParceledListSlice.ctor;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۡۧ, reason: not valid java name and contains not printable characters */
    public static String m2045() {
        if (C0383.m5203() >= 0) {
            return "android.media.IAudioService";
        }
        return null;
    }

    /* renamed from: ۡۡۢۧ, reason: not valid java name and contains not printable characters */
    public static void m2046(Object obj) {
        if (m2064() <= 0) {
            ((Instrumentation) obj).onStart();
        }
    }

    /* renamed from: ۢۢ۟۟, reason: not valid java name and contains not printable characters */
    public static String m2047() {
        if (C0060.m216() > 0) {
            return "F9C392D2E8760C045A20C29C283AB2EA";
        }
        return null;
    }

    /* renamed from: ۢۥۥ۠, reason: not valid java name and contains not printable characters */
    public static int m2048(Object obj) {
        if (C0390.m5512() >= 0) {
            return ((C0195) obj).getSecond();
        }
        return 0;
    }

    /* renamed from: ۣۢۧ, reason: not valid java name and contains not printable characters */
    public static void m2049(Object obj, Object obj2) {
        if (C0388.m5430() > 0) {
            ((C0200) obj).setMessage((String) obj2);
        }
    }

    /* renamed from: ۣۤۥۥ, reason: not valid java name and contains not printable characters */
    public static void m2050(Object obj, boolean z) {
        if (m2064() < 0) {
            ((AlertDialogC0273) obj).setCancelable(z);
        }
    }

    /* renamed from: ۣۦۤۧ, reason: not valid java name and contains not printable characters */
    public static String m2051() {
        if (C0191.m1627() < 0) {
            return "android.content.pm.PackageParser$Activity";
        }
        return null;
    }

    /* renamed from: ۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m2052(Object obj, int i) {
        if (C0393.m5668() >= 0) {
            ((C0188) obj).setStatus(i);
        }
    }

    /* renamed from: ۣۤۢ۠, reason: not valid java name and contains not printable characters */
    public static String m2053(Object obj, Object obj2, Object obj3) {
        if (C0389.m5481() > 0) {
            return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m2054(Object obj, Object obj2) {
        if (C0389.m5481() >= 0) {
            ((FeatureButton) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* renamed from: ۤۦۡۦ, reason: not valid java name and contains not printable characters */
    public static Integer m2055(Object obj) {
        if (C0370.m3284() < 0) {
            return ((C0200) obj).getNeutralActionType();
        }
        return null;
    }

    /* renamed from: ۣۤۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m2056(Object obj, Object obj2) {
        if (C0191.m1627() <= 0) {
            return ((C0129) obj).call((Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ۤۨۦۥ, reason: not valid java name and contains not printable characters */
    public static void m2057(Object obj, Object obj2) {
        if (C0398.m5833() > 0) {
            ((Application.ActivityLifecycleCallbacks) obj).onActivityStopped((Activity) obj2);
        }
    }

    /* renamed from: ۥۡۥۢ, reason: contains not printable characters */
    public static String m2058(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۥۢۥ۟, reason: contains not printable characters */
    public static WebSettings m2059(Object obj) {
        if (C0397.m5814() >= 0) {
            return ((WebView) obj).getSettings();
        }
        return null;
    }

    /* renamed from: ۥۣۧۤ, reason: contains not printable characters */
    public static boolean m2060(Object obj) {
        if (C0183.m1464() > 0) {
            return C0297.m2672((Object[]) obj);
        }
        return false;
    }

    /* renamed from: ۥۨ۟ۨ, reason: contains not printable characters */
    public static void m2061(Object obj) {
        if (C0395.m5698() < 0) {
            ((FeatureLinearLayout) obj).postInvalidate();
        }
    }

    /* renamed from: ۦۡۥۢ, reason: contains not printable characters */
    public static void m2062(Object obj) {
        if (C0388.m5430() >= 0) {
            C0295.m2597((View) obj);
        }
    }

    /* renamed from: ۦۢۤۥ, reason: contains not printable characters */
    public static String m2063(String str) {
        String strM5220 = C0383.m5220();
        String strM52202 = C0383.m5220();
        for (int i = 0; i < 15; i++) {
            strM5220 = C0378.m5011(C0386.m5329(C0386.m5329(new StringBuffer(), strM5220), C0184.m1517(i)));
            strM52202 = C0378.m5011(C0399.m5879(C0386.m5329(new StringBuffer(), strM52202), ((int) (C0384.m5270() * 10)) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0191.m1625(str) / 2);
        while (C0191.m1625(str) > 0) {
            C0399.m5883(byteArrayOutputStream, (C0164.m1371(strM5220, C0388.m5438(str, -2)) << 4) | C0164.m1371(strM5220, C0388.m5438(str, -1)));
        }
        byte[] bArrM17 = C0009.m17(byteArrayOutputStream);
        int length = bArrM17.length;
        int iM1625 = C0191.m1625(strM52202);
        for (int i2 = 0; i2 < length; i2++) {
            bArrM17[i2] = (byte) (bArrM17[i2] ^ C0388.m5438(strM52202, i2 % iM1625));
        }
        return new String(bArrM17);
    }

    /* renamed from: ۦۣۧ, reason: contains not printable characters */
    public static int m2064() {
        return (-56525) ^ C0395.m5690((Object) "ۨ۟");
    }

    /* renamed from: ۧۤۡۨ, reason: not valid java name and contains not printable characters */
    public static String m2065() {
        if (C0025.m118() >= 0) {
            return "0C0285679C042A08";
        }
        return null;
    }

    /* renamed from: ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static String m2066() {
        if (C0206.m1807() <= 0) {
            return "F53AB758A7E87450";
        }
        return null;
    }

    /* renamed from: ۨۡۨۧ, reason: not valid java name and contains not printable characters */
    public static File m2067(Object obj, Object obj2) {
        if (C0400.m5961() > 0) {
            return C0327.m2813((File) obj, (String) obj2);
        }
        return null;
    }
}
