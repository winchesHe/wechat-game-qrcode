package com.cloudinject.core.utils.compat;

import android.app.Activity;
import android.app.Application;
import android.app.C0009;
import android.app.Instrumentation;
import android.arch.lifecycle.p000.C0025;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.C0074;
import android.net.C0082;
import android.net.wifi.C0078;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.core.p007.C0088;
import androidx.versionedparcelable.VersionedParcel;
import com.cloudinject.core.p009.p010.InterfaceC0150;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p011.InstrumentationC0154;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.BuildCompat;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.C0187;
import com.cloudinject.feature.model.C0197;
import com.cloudinject.feature.model.C0202;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p017.C0213;
import com.cloudinject.feature.p019.C0241;
import com.cloudinject.feature.p019.C0257;
import com.cloudinject.feature.p019.C0261;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0332;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import mirrorb.android.accounts.C0376;
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
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.core.utils.compat.ۧ۠۠ۥ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0121 {

    /* renamed from: ۡۧۢ, reason: not valid java name and contains not printable characters */
    public static int f196 = 11;

    /* renamed from: ۟۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m983(Object obj) {
        if (C0183.m1464() >= 0) {
            return ((Message) obj).obj;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m984(Object obj, Object obj2) {
        if (C0394.m5672() > 0) {
            C0213.lambda$0bzLb_Kb63hUUBGRP2qEPLtHkKQ((String) obj, (String) obj2);
        }
    }

    /* renamed from: ۣۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m985(Object obj, Object obj2) {
        if (C0291.m2568() < 0) {
            return ((String) obj).getBytes((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۤ۟۟, reason: not valid java name and contains not printable characters */
    public static String m986() {
        if (C0346.m3059() <= 0) {
            return "com.android.internal.appwidget.IAppWidgetService$Stub";
        }
        return null;
    }

    /* renamed from: ۟ۡۥۥۣ, reason: not valid java name and contains not printable characters */
    public static void m987(Object obj, Object obj2) {
        if (C0388.m5430() >= 0) {
            ((C0202) obj).m1801((String) obj2);
        }
    }

    /* renamed from: ۟ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static void m988(Object obj, Object obj2) {
        if (C0078.m361() >= 0) {
            ((C0197) obj).setCancelText((String) obj2);
        }
    }

    /* renamed from: ۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m989(String str) {
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

    /* renamed from: ۟ۢۤۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m990(Object obj) {
        if (C0393.m5668() >= 0) {
            return ((InterfaceC0150) obj).mo1234();
        }
        return false;
    }

    /* renamed from: ۟ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static Context m991(Object obj) {
        if (C0369.m3256() > 0) {
            return ((View) obj).getContext();
        }
        return null;
    }

    /* renamed from: ۟ۤ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m992(Object obj) {
        if (C0379.m5056() >= 0) {
            return ((List) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۟ۤ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static String m993() {
        if (C0382.m5180() >= 0) {
            return "1E21D241FB2B81CA";
        }
        return null;
    }

    /* renamed from: ۟ۤۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m994() {
        if (C0362.m3122() < 0) {
            return "DD2C128842403852C7D98FD676D78F74F23493D16CA376A853593A7F9D98701ABB0F3B1EE5AA4970";
        }
        return null;
    }

    /* renamed from: ۟ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static void m995(Object obj, Object obj2) {
        if (C0368.m3171() <= 0) {
            ((InstrumentationC0154) obj).callApplicationOnCreate((Application) obj2);
        }
    }

    /* renamed from: ۟ۥۤۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m996(Object obj) {
        if (C0386.m5322() >= 0) {
            return ((VersionedParcel) obj).mo740();
        }
        return false;
    }

    /* renamed from: ۟ۥۥۣۤ, reason: not valid java name and contains not printable characters */
    public static void m997(Object obj, Object obj2, Object obj3) {
        if (C0082.m410() < 0) {
            ((WindowManager) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* renamed from: ۟ۥۦۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m998(Object obj, Object obj2) {
        if (C0088.m573() > 0) {
            return ((Field) obj).get(obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۧۡ۟, reason: not valid java name and contains not printable characters */
    public static String m999() {
        if (C0396.m5741() <= 0) {
            return "69E5E65D1CD9BDD128978965CB7F00A5";
        }
        return null;
    }

    /* renamed from: ۟ۥۨۡۤ, reason: not valid java name and contains not printable characters */
    public static void m1000(Object obj, Object obj2) {
        if (C0179.m1427() > 0) {
            ((LinkedList) obj).addFirst(obj2);
        }
    }

    /* renamed from: ۟ۦۡ۠۟, reason: not valid java name and contains not printable characters */
    public static String m1001() {
        if (C0392.m5595() > 0) {
            return "54AE7E82911C0655";
        }
        return null;
    }

    /* renamed from: ۟ۦۥۧ, reason: not valid java name and contains not printable characters */
    public static String m1002() {
        if (C0389.m5481() >= 0) {
            return "30AA44FBD26BB397";
        }
        return null;
    }

    /* renamed from: ۟ۧۦۤ۠, reason: not valid java name and contains not printable characters */
    public static void m1003(Object obj, boolean z) {
        if (C0388.m5430() >= 0) {
            ((C0257) obj).m2311(z);
        }
    }

    /* renamed from: ۠۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m1004(Object obj, Object obj2) {
        if (C0074.m307() <= 0) {
            return ((StringBuilder) obj).append(obj2);
        }
        return null;
    }

    /* renamed from: ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m1005(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۡ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m1006(Object obj, Object obj2) {
        if (C0362.m3122() <= 0) {
            return ((Activity) obj).getSystemService((String) obj2);
        }
        return null;
    }

    /* renamed from: ۡۦۥ۟, reason: not valid java name and contains not printable characters */
    public static Intent m1007(Object obj, Object obj2, Object obj3) {
        if (C0379.m5056() > 0) {
            return ((Intent) obj).putExtra((String) obj2, (Parcelable) obj3);
        }
        return null;
    }

    /* renamed from: ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static String m1008() {
        if (C0387.m5374() <= 0) {
            return "5FC68A6AE004A308EF0FBF2953899370B09BD93EC55B6B11B81924B0130D80CB";
        }
        return null;
    }

    /* renamed from: ۣۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static BuildCompat.ROMType m1009() {
        if (C0369.m3256() >= 0) {
            return BuildCompat.ROMType._360;
        }
        return null;
    }

    /* renamed from: ۣۣۥۣ, reason: not valid java name and contains not printable characters */
    public static DisplayMetrics m1010(Object obj) {
        if (C0155.m1294() <= 0) {
            return ((Resources) obj).getDisplayMetrics();
        }
        return null;
    }

    /* renamed from: ۣۦۡۥ, reason: not valid java name and contains not printable characters */
    public static int m1011(Object obj) {
        if (C0380.m5068() > 0) {
            return ((Set) obj).size();
        }
        return 0;
    }

    /* renamed from: ۣۦۧۡ, reason: not valid java name and contains not printable characters */
    public static int m1012(Object obj, Object obj2) {
        if (C0164.m1359() < 0) {
            return C0332.m2834((Context) obj, (String) obj2);
        }
        return 0;
    }

    /* renamed from: ۣۨۨۦ, reason: not valid java name and contains not printable characters */
    public static void m1013(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0379.m5056() > 0) {
            C0261.m2329lambda$Qk8uAo2F2zyxXRfl3uMttwaJf4((C0261) obj, (EditText) obj2, (Context) obj3, (View) obj4);
        }
    }

    /* renamed from: ۤۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static C0241 m1014() {
        if (C0381.m5127() > 0) {
            return C0241.m2142();
        }
        return null;
    }

    /* renamed from: ۤۡۦۥ, reason: not valid java name and contains not printable characters */
    public static String m1015() {
        if (C0381.m5127() >= 0) {
            return "android.content.IRestrictionsManager$Stub";
        }
        return null;
    }

    /* renamed from: ۤۥۣۨ, reason: not valid java name and contains not printable characters */
    public static String m1016() {
        if (C0396.m5741() < 0) {
            return "62661CF6F711823A";
        }
        return null;
    }

    /* renamed from: ۥۣۢ۠, reason: contains not printable characters */
    public static void m1017(Object obj, Object obj2, Object obj3) {
        if (C0388.m5430() > 0) {
            ((Instrumentation) obj).callActivityOnPostCreate((Activity) obj2, (Bundle) obj3);
        }
    }

    /* renamed from: ۦ۠ۢۧ, reason: contains not printable characters */
    public static String m1018() {
        if (C0376.m4906() >= 0) {
            return "805DC61EDA23519528E6D0FFFAC3F9974874431025405532E96FFFFA847912C4B4AAB883FD97B85BA60D972A8C6992631D02F7669F96C0C915EE050B0BCF87381F25B43CC79685783578586F98D0C3F52AF37813733D86CA";
        }
        return null;
    }

    /* renamed from: ۦۤۧۤ, reason: contains not printable characters */
    public static Class m1019(Object obj) {
        if (C0385.m5282() < 0) {
            return ((Class) obj).getSuperclass();
        }
        return null;
    }

    /* renamed from: ۦۦۢۧ, reason: contains not printable characters */
    public static int m1020(Object obj) {
        if (C0279.m2491() <= 0) {
            return ((C0187) obj).m1589();
        }
        return 0;
    }

    /* renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static String m1021() {
        if (C0025.m118() > 0) {
            return "A7F185B65733FA1C";
        }
        return null;
    }

    /* renamed from: ۨ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static Configuration m1022(Object obj) {
        if (C0390.m5512() >= 0) {
            return ((Resources) obj).getConfiguration();
        }
        return null;
    }

    /* renamed from: ۨۤۤ۠, reason: not valid java name and contains not printable characters */
    public static int m1023() {
        return (-1749717) ^ C0395.m5690((Object) "ۣۢۥ");
    }

    /* renamed from: ۨۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m1024() {
        if (C0385.m5282() <= 0) {
            return "软件无联网权限，请在AndroidManifest.xml内配置！\n\n<uses-permission android:name=\"android.permission.INTERNET\" />";
        }
        return null;
    }
}
