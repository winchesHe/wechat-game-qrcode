package com.cloudinject.p025;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.C0009;
import android.app.Instrumentation;
import android.arch.p003.p005.C0060;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import androidx.versionedparcelable.VersionedParcel;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p011.InstrumentationC0154;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.C0125;
import com.cloudinject.core.utils.C0129;
import com.cloudinject.core.utils.C0138;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.C0185;
import com.cloudinject.feature.model.C0194;
import com.cloudinject.feature.model.C0195;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p018.C0222;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.AlertDialogC0273;
import com.cloudinject.feature.p021.AlertDialogC0286;
import com.cloudinject.feature.p023.C0297;
import com.cloudinject.feature.p023.C0300;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.App;
import com.sadfxg.fasg.C0369;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import mirrorb.RefClass;
import mirrorb.RefStaticInt;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.ActivityManager;
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
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.rms.C0392;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import org.json.JSONObject;

/* renamed from: com.cloudinject.̗.ۡۡۧ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0362 {

    /* renamed from: ۢۥۤۥ, reason: not valid java name and contains not printable characters */
    public static int f586 = 6;

    /* renamed from: ۣ۟۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3081(Object obj, int i) {
        if (C0397.m5814() > 0) {
            return ((StringBuilder) obj).append(i);
        }
        return null;
    }

    /* renamed from: ۟۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimator m3082(Object obj, long j) {
        if (C0368.m3171() <= 0) {
            return ((ViewPropertyAnimator) obj).setDuration(j);
        }
        return null;
    }

    /* renamed from: ۟۟ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static void m3083(Object obj) {
        if (C0073.m265() >= 0) {
            C0300.m2730((String) obj);
        }
    }

    /* renamed from: ۟۠ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static void m3084(Object obj, int i) {
        if (C0369.m3256() > 0) {
            ((Parcel) obj).writeInt(i);
        }
    }

    /* renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m3085(Object obj) {
        if (C0074.m307() < 0) {
            ((AlertDialogC0286) obj).m2521();
        }
    }

    /* renamed from: ۟۠ۥۥۦ, reason: not valid java name and contains not printable characters */
    public static String m3086() {
        if (C0383.m5203() > 0) {
            return "0A619AA875621E42";
        }
        return null;
    }

    /* renamed from: ۟۠ۦۢۧ, reason: not valid java name and contains not printable characters */
    public static int m3087() {
        if (C0183.m1464() > 0) {
            return App.VERSION_CODE;
        }
        return 0;
    }

    /* renamed from: ۟ۡۥۧۧ, reason: not valid java name and contains not printable characters */
    public static void m3088(Object obj, Object obj2) {
        if (C0379.m5056() >= 0) {
            ((Parcel) obj).enforceInterface((String) obj2);
        }
    }

    /* renamed from: ۟ۢۤۥۥ, reason: not valid java name and contains not printable characters */
    public static String m3089() {
        if (C0088.m573() > 0) {
            return "18504195CB08533C97F59685CDAE8BEA";
        }
        return null;
    }

    /* renamed from: ۟ۢۧۨۦ, reason: not valid java name and contains not printable characters */
    public static void m3090(Object obj, boolean z, boolean z2) {
        if (m3122() < 0) {
            ((VersionedParcel) obj).mo736(z, z2);
        }
    }

    /* renamed from: ۣ۟ۦۦۣ, reason: not valid java name and contains not printable characters */
    public static Object m3091(Object obj) {
        if (C0381.m5127() >= 0) {
            return ((Callable) obj).call();
        }
        return null;
    }

    /* renamed from: ۣ۟ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static C0129 m3092(Object obj, Object obj2, Object obj3) {
        if (C0369.m3256() > 0) {
            return ((C0129) obj).mo1054((String) obj2, (Class<?>[]) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۧۢ, reason: not valid java name and contains not printable characters */
    public static int m3093(Object obj) {
        if (C0390.m5512() >= 0) {
            return ((Parcel) obj).readInt();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤۧۧ, reason: not valid java name and contains not printable characters */
    public static int m3094(Object obj) {
        if (C0179.m1427() > 0) {
            return ((List) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۤۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m3095() {
        if (C0395.m5698() < 0) {
            return "java.io.FileSystem";
        }
        return null;
    }

    /* renamed from: ۟ۥۡۥۣ, reason: not valid java name and contains not printable characters */
    public static void m3096(Object obj) {
        if (C0390.m5512() >= 0) {
            ((C0222) obj).m1934();
        }
    }

    /* renamed from: ۟ۥۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static OutputStream m3097(Object obj) {
        if (C0379.m5056() >= 0) {
            return ((HttpURLConnection) obj).getOutputStream();
        }
        return null;
    }

    /* renamed from: ۟ۥۣ۟۟, reason: not valid java name and contains not printable characters */
    public static void m3098(Object obj) {
        if (C0346.m3059() < 0) {
            ((Instrumentation) obj).endPerformanceSnapshot();
        }
    }

    /* renamed from: ۟ۥۧۨۡ, reason: not valid java name and contains not printable characters */
    public static String m3099() {
        if (C0380.m5068() >= 0) {
            return "406659E6E08B5997A6BDD15813D1921C0943BD4E7C5F247E7E16FACFDD3A1098";
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static Class m3100(Object obj, Object obj2) {
        if (C0368.m3171() <= 0) {
            return RefClass.load((Class<?>) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m3101() {
        if (C0396.m5741() < 0) {
            return "F88AF004D42BE2E2A4A6B62EFDFD422A895A1421FE2D595671E7A3C18D19670D86B37AD2A58A0B66C7F39D2B88FE1093";
        }
        return null;
    }

    /* renamed from: ۟ۦۥۨ۟, reason: not valid java name and contains not printable characters */
    public static String m3102() {
        if (C0400.m5961() > 0) {
            return Build.DISPLAY;
        }
        return null;
    }

    /* renamed from: ۟ۦۦۣ, reason: not valid java name and contains not printable characters */
    public static String m3103(Object obj) {
        if (C0088.m573() > 0) {
            return ((JSONObject) obj).toString();
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m3104(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0395.m5698() <= 0) {
            ((Instrumentation) obj).callActivityOnRestoreInstanceState((Activity) obj2, (Bundle) obj3, (PersistableBundle) obj4);
        }
    }

    /* renamed from: ۟ۧۢۥۦ, reason: not valid java name and contains not printable characters */
    public static String m3105() {
        if (C0060.m216() > 0) {
            return "A2ECDE587D1C7C48A4AC4061647F0717";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۥۧ, reason: not valid java name and contains not printable characters */
    public static void m3106(Object obj, boolean z) {
        if (C0155.m1294() <= 0) {
            ((AlertDialog) obj).setCancelable(z);
        }
    }

    /* renamed from: ۟ۧۦۣۡ, reason: not valid java name and contains not printable characters */
    public static String m3107(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۣ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3108(Object obj) {
        if (C0388.m5430() > 0) {
            return ((AlertDialogC0273) obj).isCancelable();
        }
        return false;
    }

    /* renamed from: ۠ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static String m3109() {
        if (C0385.m5282() <= 0) {
            return "C45A08C84FF16FDF";
        }
        return null;
    }

    /* renamed from: ۡۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m3110(Object obj) {
        if (C0191.m1627() <= 0) {
            ((ConditionVariable) obj).open();
        }
    }

    /* renamed from: ۢ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static RefStaticInt m3111() {
        if (C0376.m4906() >= 0) {
            return ActivityManager.START_SUCCESS;
        }
        return null;
    }

    /* renamed from: ۢ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m3112(Object obj) {
        if (C0379.m5056() > 0) {
            return C0297.m2676((Collection<?>) obj);
        }
        return 0;
    }

    /* renamed from: ۣۢۡۢ, reason: not valid java name and contains not printable characters */
    public static int m3113(Object obj) {
        if (C0383.m5203() > 0) {
            return C0138.m1078((Object[]) obj);
        }
        return 0;
    }

    /* renamed from: ۣۢۡۨ, reason: not valid java name and contains not printable characters */
    public static String m3114(String str) {
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

    /* renamed from: ۣۢۤۡ, reason: not valid java name and contains not printable characters */
    public static void m3115(Object obj, int i) {
        if (C0082.m410() < 0) {
            ((C0185) obj).m1568(i);
        }
    }

    /* renamed from: ۢۤۤۨ, reason: not valid java name and contains not printable characters */
    public static String m3116() {
        if (C0229.m2064() <= 0) {
            return "android.hardware.fingerprint.IFingerprintService";
        }
        return null;
    }

    /* renamed from: ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static String m3117() {
        if (C0334.m2866() > 0) {
            return "android.app.role.IRoleManager";
        }
        return null;
    }

    /* renamed from: ۢۨۦۣ, reason: not valid java name and contains not printable characters */
    public static byte[] m3118(Object obj) {
        if (C0396.m5741() <= 0) {
            return C0125.m1027((String) obj);
        }
        return null;
    }

    /* renamed from: ۢۨۨۥ, reason: not valid java name and contains not printable characters */
    public static void m3119(Object obj, int i) {
        if (C0073.m265() >= 0) {
            ((C0185) obj).m1569(i);
        }
    }

    /* renamed from: ۣ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static void m3120(Object obj, Object obj2, Object obj3) {
        if (C0389.m5481() > 0) {
            ((Bundle) obj).putDoubleArray((String) obj2, (double[]) obj3);
        }
    }

    /* renamed from: ۣۡۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3121(Object obj) {
        if (m3122() < 0) {
            return ((ContentProviderClient) obj).release();
        }
        return false;
    }

    /* renamed from: ۣۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m3122() {
        return (-1752795) ^ C0395.m5690((Object) "ۥۧۤ");
    }

    /* renamed from: ۣۨۤ, reason: not valid java name and contains not printable characters */
    public static String m3123() {
        if (C0228.m2012() > 0) {
            return "com.android.internal.R$id";
        }
        return null;
    }

    /* renamed from: ۤۥۤۥ, reason: not valid java name and contains not printable characters */
    public static String m3124() {
        if (C0164.m1359() <= 0) {
            return "DF4F7C479D85A37F8FFB4B99A1ACA025C80A6935D923582D91C88F8BDDDF8FED";
        }
        return null;
    }

    /* renamed from: ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static String m3125() {
        if (C0089.m592() > 0) {
            return "com.android.internal.telephony.IPhoneSubInfo";
        }
        return null;
    }

    /* renamed from: ۤۦۧۧ, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m3126(Object obj) {
        if (C0392.m5595() >= 0) {
            return ((InstrumentationC0154) obj).f225;
        }
        return null;
    }

    /* renamed from: ۥۦۡ, reason: contains not printable characters */
    public static Context m3127(Object obj) {
        if (m3122() <= 0) {
            return ((WebView) obj).getContext();
        }
        return null;
    }

    /* renamed from: ۦۢۥۢ, reason: contains not printable characters */
    public static String m3128(Object obj) {
        if (C0088.m573() >= 0) {
            return ((C0195) obj).getUrl();
        }
        return null;
    }

    /* renamed from: ۧ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static void m3129(Object obj, int i) {
        if (C0082.m410() <= 0) {
            ((HttpURLConnection) obj).setConnectTimeout(i);
        }
    }

    /* renamed from: ۧ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m3130(Object obj) {
        if (C0382.m5180() > 0) {
            return ((C0194) obj).m1706();
        }
        return 0;
    }

    /* renamed from: ۣۧ۠۠, reason: not valid java name and contains not printable characters */
    public static void m3131(Object obj) {
        if (C0334.m2866() > 0) {
            ((Instrumentation) obj).start();
        }
    }

    /* renamed from: ۨۥۦۣ, reason: not valid java name and contains not printable characters */
    public static String m3132() {
        if (C0183.m1464() >= 0) {
            return "251DF560A41CE6C33C769746E5C41AD2FB519A0383624D74";
        }
        return null;
    }
}
