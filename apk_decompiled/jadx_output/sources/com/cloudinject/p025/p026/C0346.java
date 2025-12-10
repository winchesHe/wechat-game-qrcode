package com.cloudinject.p025.p026;

import android.app.AlertDialog;
import android.app.C0009;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.util.SparseBooleanArray;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.utils.C0129;
import com.cloudinject.core.utils.compat.BuildCompat;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.customview.FeatureLinearLayout;
import com.cloudinject.feature.model.C0187;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p019.C0255;
import com.cloudinject.feature.p019.C0257;
import com.cloudinject.feature.p019.C0261;
import com.cloudinject.feature.p021.AlertDialogC0273;
import com.cloudinject.feature.p021.AlertDialogC0287;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.p025.C0362;
import com.sadfxg.fasg.$$Lambda$App$AZj7VToUaWoHalYcNREf9oB3Cc4;
import com.sadfxg.fasg.App;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.Objects;
import mirrorb.RefObject;
import mirrorb.android.accounts.C0375;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.app.servertransaction.ClientTransaction;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import org.json.JSONObject;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.̗.̗.۟۟ۡۦۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0346 {

    /* renamed from: ۟ۢۢۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean f581;

    /* renamed from: ۟۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3023(Object obj, Object obj2) {
        if (C0380.m5068() >= 0) {
            return Objects.equals(obj, obj2);
        }
        return false;
    }

    /* renamed from: ۟۟۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static String m3024() {
        if (C0397.m5814() >= 0) {
            return "android.net.wifi.IWifiManager$Stub";
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m3025(Object obj) {
        if (C0073.m265() >= 0) {
            ((PrintWriter) obj).close();
        }
    }

    /* renamed from: ۟۟ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static String m3026() {
        if (C0420.m6215() <= 0) {
            return "D6E7520CC664C117467388B15ED3BABA";
        }
        return null;
    }

    /* renamed from: ۟۠۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m3027() {
        if (C0183.m1464() > 0) {
            return "android.nfc.INfcAdapter$Stub";
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m3028() {
        if (C0206.m1807() <= 0) {
            return "43802EED616B59D7467DA6000C92DFBEB8715DA5837A93F3871DEFA21A41BC1E";
        }
        return null;
    }

    /* renamed from: ۟۠ۦۢۨ, reason: not valid java name and contains not printable characters */
    public static C0129 m3029(Object obj, Object obj2, Object obj3) {
        if (C0082.m410() < 0) {
            return ((C0129) obj).mo1062(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۟۠ۨۦۡ, reason: not valid java name and contains not printable characters */
    public static String m3030(Object obj) {
        if (m3059() < 0) {
            return ((C0187) obj).m1595();
        }
        return null;
    }

    /* renamed from: ۟ۡ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3031() {
        if (C0370.m3284() < 0) {
            return BuildCompat.m905();
        }
        return false;
    }

    /* renamed from: ۟ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static String m3032() {
        if (C0381.m5127() > 0) {
            return "android.app.servertransaction.ActivityLifecycleItem";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static C0343 m3033(Object obj, Object obj2) {
        if (C0420.m6215() < 0) {
            return ((C0343) obj).m2990((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۤۢۥ, reason: not valid java name and contains not printable characters */
    public static String m3034() {
        if (C0369.m3256() >= 0) {
            return "524F746AD6886CFE";
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m3035(Object obj) {
        if (C0164.m1359() <= 0) {
            ((HashSet) obj).clear();
        }
    }

    /* renamed from: ۣ۟ۥۡۡ, reason: not valid java name and contains not printable characters */
    public static ActivityInfo m3036(Object obj) {
        if (C0378.m4998() > 0) {
            return ((ResolveInfo) obj).activityInfo;
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static String m3037() {
        if (C0385.m5282() <= 0) {
            return "EA6D7A40C3E58714";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static $$Lambda$App$AZj7VToUaWoHalYcNREf9oB3Cc4 m3038() {
        if (C0086.m500() >= 0) {
            return $$Lambda$App$AZj7VToUaWoHalYcNREf9oB3Cc4.INSTANCE;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static Uri m3039(Object obj) {
        if (C0083.m448() < 0) {
            return Uri.parse((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤۢۥ۟, reason: not valid java name and contains not printable characters */
    public static void m3040(Object obj) throws IOException {
        if (C0370.m3284() <= 0) {
            ((DataOutputStream) obj).flush();
        }
    }

    /* renamed from: ۟ۤۨۤۦ, reason: not valid java name and contains not printable characters */
    public static String m3041() {
        if (C0191.m1627() < 0) {
            return "android.app.usage.IUsageStatsManager$Stub";
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3042(Object obj, int i, Object obj2, Object obj3, int i2) {
        if (C0206.m1807() < 0) {
            return ((IBinder) obj).transact(i, (Parcel) obj2, (Parcel) obj3, i2);
        }
        return false;
    }

    /* renamed from: ۟ۥۢۤۧ, reason: not valid java name and contains not printable characters */
    public static String m3043() {
        if (C0393.m5668() > 0) {
            return Build.BRAND;
        }
        return null;
    }

    /* renamed from: ۟ۥۢۧۨ, reason: not valid java name and contains not printable characters */
    public static String m3044(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۟ۦۣۤۨ, reason: not valid java name and contains not printable characters */
    public static void m3045(Object obj) {
        if (C0362.m3122() < 0) {
            ((C0255) obj).m2274();
        }
    }

    /* renamed from: ۟ۦۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m3046() {
        if (C0334.m2866() > 0) {
            App.m3213();
        }
    }

    /* renamed from: ۠ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static String m3047(Object obj, Object obj2) {
        if (C0388.m5430() >= 0) {
            return ((HttpURLConnection) obj).getHeaderField((String) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static String m3048() {
        if (C0394.m5672() > 0) {
            return "android.app.usage.IStorageStatsManager$Stub";
        }
        return null;
    }

    /* renamed from: ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3049(Object obj) {
        if (C0074.m307() <= 0) {
            return ((C0261) obj).f452;
        }
        return false;
    }

    /* renamed from: ۡ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m3050() {
        if (C0089.m592() >= 0) {
            return "68B05144A3322C6C";
        }
        return null;
    }

    /* renamed from: ۡۡۡۨ, reason: not valid java name and contains not printable characters */
    public static String m3051() {
        if (C0393.m5668() > 0) {
            return "F07AC86EE27AF30EC4D5F3842B47F8242D0033CFD814F4F49F9828F46A1D9785";
        }
        return null;
    }

    /* renamed from: ۡۡۧۨ, reason: not valid java name and contains not printable characters */
    public static String m3052() {
        if (C0400.m5961() >= 0) {
            return "805DC61EDA2351955360A309B8BD9EBA5118071B49D6531601266065A033D96B7747E549223BABA092D55DB072C29E7C4E493913AFE84BBA260D8A2DB5DC5B8F";
        }
        return null;
    }

    /* renamed from: ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static String m3053() {
        if (C0291.m2568() <= 0) {
            return "BB4AAA8C0B5287D3";
        }
        return null;
    }

    /* renamed from: ۡۦۧۨ, reason: not valid java name and contains not printable characters */
    public static void m3054(Object obj) {
        if (C0395.m5698() <= 0) {
            ((AlertDialogC0273) obj).dismiss();
        }
    }

    /* renamed from: ۡۧۢۦ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m3055(Object obj, Object obj2, Object obj3) {
        if (C0121.m1023() <= 0) {
            return ((AlertDialog.Builder) obj).setNegativeButton((CharSequence) obj2, (DialogInterface.OnClickListener) obj3);
        }
        return null;
    }

    /* renamed from: ۢ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m3056() {
        if (C0398.m5833() > 0) {
            return "android.os.ServiceManager";
        }
        return null;
    }

    /* renamed from: ۢ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static void m3057(Object obj) throws IOException {
        if (C0334.m2866() > 0) {
            ((OutputStream) obj).flush();
        }
    }

    /* renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static String m3058(String str) {
        String strM5220 = C0383.m5220();
        String strM52202 = C0383.m5220();
        for (int i = 0; i < 15; i++) {
            strM5220 = C0378.m5011(C0386.m5329(C0386.m5329(new StringBuffer(), strM5220), C0184.m1517(i)));
            strM52202 = C0378.m5011(C0399.m5879(C0386.m5329(new StringBuffer(), strM52202), ((int) (C0384.m5270() * 10)) ^ i));
        }
        while (C0191.m1625(strM5220) > 0) {
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
        return new String(bArrM17);
    }

    /* renamed from: ۤ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m3059() {
        return (-1747940) ^ C0395.m5690((Object) "۠ۦۦ");
    }

    /* renamed from: ۤۥۣۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3060(Object obj) {
        if (C0378.m4998() > 0) {
            return ((Class) obj).desiredAssertionStatus();
        }
        return false;
    }

    /* renamed from: ۦ۠۟۠, reason: contains not printable characters */
    public static String m3061() {
        if (C0369.m3256() > 0) {
            return "getUnsafe";
        }
        return null;
    }

    /* renamed from: ۦ۠۠, reason: contains not printable characters */
    public static void m3062(Object obj, Object obj2) {
        if (C0073.m265() > 0) {
            ((AlertDialogC0287) obj).setOnDismissListener((DialogInterface.OnDismissListener) obj2);
        }
    }

    /* renamed from: ۦۣۢۤ, reason: contains not printable characters */
    public static long m3063(Object obj, Object obj2) {
        if (C0399.m5914() >= 0) {
            return ((JSONObject) obj).optLong((String) obj2);
        }
        return 0L;
    }

    /* renamed from: ۦۥۥۣ, reason: contains not printable characters */
    public static String m3064() {
        if (C0191.m1627() <= 0) {
            return "53B24903AB99CAB8";
        }
        return null;
    }

    /* renamed from: ۦۣۧۦ, reason: contains not printable characters */
    public static void m3065(Object obj, int i, boolean z) {
        if (C0388.m5430() > 0) {
            ((SparseBooleanArray) obj).put(i, z);
        }
    }

    /* renamed from: ۧۡۤۥ, reason: not valid java name and contains not printable characters */
    public static String m3066() {
        if (C0334.m2866() > 0) {
            return "D1A3A4616B76FDC6";
        }
        return null;
    }

    /* renamed from: ۧۦۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3067(Object obj) {
        if (C0184.m1524() <= 0) {
            return ((C0257) obj).f443;
        }
        return false;
    }

    /* renamed from: ۣۧۧۦ, reason: not valid java name and contains not printable characters */
    public static String m3068(Object obj) {
        if (C0206.m1807() < 0) {
            return ((IBinder) obj).getInterfaceDescriptor();
        }
        return null;
    }

    /* renamed from: ۧۨۦ۠, reason: not valid java name and contains not printable characters */
    public static RefObject m3069() {
        if (C0398.m5833() > 0) {
            return ClientTransaction.mActivityCallbacks;
        }
        return null;
    }

    /* renamed from: ۨ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m3070(Object obj) {
        if (C0375.m4840() <= 0) {
            return ((FeatureLinearLayout) obj).getMeasuredHeight();
        }
        return 0;
    }

    /* renamed from: ۨۥۡۧ, reason: not valid java name and contains not printable characters */
    public static String m3071() {
        if (C0082.m410() < 0) {
            return "android.os.IPowerManager$Stub";
        }
        return null;
    }

    /* renamed from: ۨۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m3072(Object obj) {
        if (C0088.m573() > 0) {
            return ((C0187) obj).m1588();
        }
        return 0;
    }
}
