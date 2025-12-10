package com.px;

import android.app.AlertDialog;
import android.app.Instrumentation;
import android.arch.p003.p005.C0060;
import android.content.DialogInterface;
import android.database.C0073;
import android.net.C0082;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.AbstractC0132;
import com.cloudinject.core.utils.C0125;
import com.cloudinject.core.utils.compat.BuildCompat;
import com.cloudinject.customview.C0183;
import com.cloudinject.feature.model.C0187;
import com.cloudinject.feature.model.C0201;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p016.C0211;
import com.cloudinject.feature.p017.C0213;
import com.cloudinject.feature.p017.C0214;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p019.C0264;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.p026.C0346;
import com.sadfxg.fasg.App;
import com.sadfxg.fasg.C0369;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Map;
import mirrorb.RefMethod;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.dalvik.system.C0399;
import org.json.JSONArray;
import org.json.JSONObject;
import p027.p028.p029.C0416;
import p027.p028.p029.InterfaceC0417;

/* renamed from: com.px.ۣۢۨۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0368 {

    /* renamed from: ۟ۢۥۡۧ, reason: not valid java name and contains not printable characters */
    public static int f612 = 85;

    /* renamed from: ۟۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m3160(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m3161() {
        if (C0376.m4906() >= 0) {
            return "C6EC87467D057F4F5F3C9F508819F6CDCBC006215D427ED73307267933E53321F3620DCA4F5CA11D";
        }
        return null;
    }

    /* renamed from: ۟۟ۥۡ۟, reason: not valid java name and contains not printable characters */
    public static void m3162(Object obj, Object obj2) {
        if (C0060.m216() > 0) {
            ((WebView) obj).setWebViewClient((WebViewClient) obj2);
        }
    }

    /* renamed from: ۟۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m3163() {
        if (C0389.m5481() >= 0) {
            return "android.net.̙";
        }
        return null;
    }

    /* renamed from: ۣۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m3164(Object obj, Object obj2) {
        if (C0394.m5672() >= 0) {
            return ((C0125) obj).decrypt((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m3166() {
        if (C0346.m3059() <= 0) {
            return "A141A5ACC1B2944C";
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static Package m3167(Object obj) {
        if (C0334.m2866() >= 0) {
            return ((Class) obj).getPackage();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static JSONObject m3168(Object obj, int i) {
        if (C0378.m4998() > 0) {
            return ((JSONArray) obj).optJSONObject(i);
        }
        return null;
    }

    /* renamed from: ۟ۡۥۣ۟, reason: not valid java name and contains not printable characters */
    public static void m3169(Object obj, int i) {
        if (C0082.m410() <= 0) {
            ((C0187) obj).m1592(i);
        }
    }

    /* renamed from: ۟ۢۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m3170() {
        if (C0394.m5672() > 0) {
            return "CC38E38E25CEAD0CC1E1FAACE677AE624BB95F42CF37F653EF7FD8B9CC5E8A8803F8306571ADE336B9B21D9B7E580BB6";
        }
        return null;
    }

    /* renamed from: ۟ۢۨ۠۠, reason: not valid java name and contains not printable characters */
    public static int m3171() {
        return (-1749715) ^ C0395.m5690((Object) "ۣۢۤ");
    }

    /* renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimator m3172(Object obj, float f) {
        if (C0377.m4944() >= 0) {
            return ((ViewPropertyAnimator) obj).scaleX(f);
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3173() {
        if (C0389.m5481() >= 0) {
            return BuildCompat.m920();
        }
        return false;
    }

    /* renamed from: ۟ۤۡۤۡ, reason: not valid java name and contains not printable characters */
    public static String m3174() {
        if (C0387.m5374() < 0) {
            return "android.media.session.ISessionManager$Stub";
        }
        return null;
    }

    /* renamed from: ۟ۤۦۨ۠, reason: not valid java name and contains not printable characters */
    public static int m3175(Object obj, int i) {
        if (C0155.m1294() < 0) {
            return ((SparseIntArray) obj).valueAt(i);
        }
        return 0;
    }

    /* renamed from: ۟ۤۨۡ۠, reason: not valid java name and contains not printable characters */
    public static C0416 m3176(Object obj, Object obj2) {
        if (C0369.m3256() >= 0) {
            return ((C0416) obj).m6207((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static String m3177() {
        if (C0394.m5672() >= 0) {
            return "A35E9295E9852B63";
        }
        return null;
    }

    /* renamed from: ۟ۦۣۢۢ, reason: not valid java name and contains not printable characters */
    public static String m3178(Object obj, int i, Object obj2) {
        if (C0073.m265() >= 0) {
            return C0213.m1874((String) obj, i, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m3179() {
        if (C0392.m5595() > 0) {
            return "4B92A3DDC04674D4A53329E91FAA9D57";
        }
        return null;
    }

    /* renamed from: ۟ۧۧۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3180(Object obj) {
        if (C0206.m1807() < 0) {
            return ((C0264) obj).f461;
        }
        return false;
    }

    /* renamed from: ۠ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static Looper m3181() {
        if (C0379.m5056() > 0) {
            return Looper.myLooper();
        }
        return null;
    }

    /* renamed from: ۠ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3182(Object obj, Object obj2) {
        if (C0183.m1464() > 0) {
            return ((AbstractC0132) obj).mo1034(obj2);
        }
        return false;
    }

    /* renamed from: ۠ۦۢۡ, reason: not valid java name and contains not printable characters */
    public static String m3183() {
        if (C0381.m5127() >= 0) {
            return "8EDEDB9AAAB6D41F59A4B53E0ECF6732";
        }
        return null;
    }

    /* renamed from: ۠ۦۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m3184(Object obj, Object obj2, Object obj3) {
        if (C0387.m5374() <= 0) {
            return ((RefMethod) obj).callWithException(obj2, (Object[]) obj3);
        }
        return null;
    }

    /* renamed from: ۡۨۧۤ, reason: not valid java name and contains not printable characters */
    public static String m3185() {
        if (C0089.m592() > 0) {
            return "DES";
        }
        return null;
    }

    /* renamed from: ۢۥۥۥ, reason: not valid java name and contains not printable characters */
    public static String m3186(Object obj) {
        if (C0375.m4840() < 0) {
            return ((C0201) obj).getMessage();
        }
        return null;
    }

    /* renamed from: ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static App m3187() {
        if (C0183.m1464() >= 0) {
            return App.m3204();
        }
        return null;
    }

    /* renamed from: ۣۣۤۡ, reason: not valid java name and contains not printable characters */
    public static void m3188(Object obj) {
        if (C0382.m5180() >= 0) {
            ((Instrumentation) obj).onDestroy();
        }
    }

    /* renamed from: ۣۤۧۡ, reason: not valid java name and contains not printable characters */
    public static int m3189() {
        if (C0377.m4944() >= 0) {
            return C0211.m1854();
        }
        return 0;
    }

    /* renamed from: ۥۡۨ۠, reason: contains not printable characters */
    public static String m3190() {
        if (C0393.m5668() > 0) {
            return "android.app.Activity";
        }
        return null;
    }

    /* renamed from: ۥۢۥۦ, reason: contains not printable characters */
    public static String m3191() {
        if (C0377.m4944() >= 0) {
            return InterfaceC0417.f661;
        }
        return null;
    }

    /* renamed from: ۥۣۨ۟, reason: contains not printable characters */
    public static String m3192(Object obj) {
        if (C0335.m2923() <= 0) {
            return ((Locale) obj).getLanguage();
        }
        return null;
    }

    /* renamed from: ۦۢۧ۟, reason: contains not printable characters */
    public static AlertDialog.Builder m3193(Object obj, Object obj2, Object obj3) {
        if (C0399.m5914() > 0) {
            return ((AlertDialog.Builder) obj).setNeutralButton((CharSequence) obj2, (DialogInterface.OnClickListener) obj3);
        }
        return null;
    }

    /* renamed from: ۦۣۤۨ, reason: contains not printable characters */
    public static String m3194() {
        if (C0073.m265() > 0) {
            return " cannot be VersionedParcelled";
        }
        return null;
    }

    /* renamed from: ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static String m3195() {
        if (C0060.m216() >= 0) {
            return C0214.HOST;
        }
        return null;
    }

    /* renamed from: ۨ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m3196(Object obj) {
        if (C0073.m265() > 0) {
            ((Instrumentation) obj).setAutomaticPerformanceSnapshots();
        }
    }

    /* renamed from: ۨۡۥۡ, reason: not valid java name and contains not printable characters */
    public static String m3197() {
        if (C0179.m1427() >= 0) {
            return "50FD1D84C447912A1ADC14C15FB56994";
        }
        return null;
    }

    /* renamed from: ۨۤۥ۟, reason: not valid java name and contains not printable characters */
    public static void m3198(Object obj, int i, int i2) {
        if (C0229.m2064() <= 0) {
            ((SparseIntArray) obj).put(i, i2);
        }
    }

    /* renamed from: ۟ۡ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m3165(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
