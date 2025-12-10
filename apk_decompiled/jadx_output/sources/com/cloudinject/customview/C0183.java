package com.cloudinject.customview;

import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.net.wifi.C0078;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.C0138;
import com.cloudinject.core.utils.compat.BuildCompat;
import com.cloudinject.feature.model.C0195;
import com.cloudinject.feature.model.C0199;
import com.cloudinject.feature.model.C0200;
import com.cloudinject.feature.model.C0201;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p017.C0214;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p019.C0241;
import com.cloudinject.feature.p019.C0253;
import com.cloudinject.feature.p019.C0262;
import com.cloudinject.feature.p021.p022.InterfaceC0275;
import com.cloudinject.feature.p023.C0297;
import com.cloudinject.p025.C0362;
import com.sadfxg.fasg.App;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.util.List;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import mirrorb.RefStaticInt;
import mirrorb.RefStaticMethod;
import mirrorb.android.app.IActivityTaskManager;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.StrictMode;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import org.json.JSONObject;
import p027.p028.p029.C0416;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.customview.ۣ۟ۢۧۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0183 {

    /* renamed from: ۟ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean f251;

    /* renamed from: ۟۟ۦۨ۠, reason: not valid java name and contains not printable characters */
    public static float m1463(Object obj, Object obj2) {
        if (C0060.m216() > 0) {
            return ((Field) obj).getFloat(obj2);
        }
        return 0.0f;
    }

    /* renamed from: ۟ۡ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m1464() {
        return 1754458 ^ C0395.m5690((Object) "ۧۢۢ");
    }

    /* renamed from: ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static void m1465(Object obj, Object obj2) {
        if (C0395.m5698() < 0) {
            ((ImageView) obj).setScaleType((ImageView.ScaleType) obj2);
        }
    }

    /* renamed from: ۣ۟ۡۦۥ, reason: not valid java name and contains not printable characters */
    public static String m1466() {
        if (C0378.m4998() >= 0) {
            return "F955D6CD6E76262AB0BB177417B0F4E900F4BCBADC2A72B1B7A2E3CAD4CD7331";
        }
        return null;
    }

    /* renamed from: ۟ۡۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static long m1467(Object obj) {
        if (C0380.m5068() >= 0) {
            return ((Integer) obj).longValue();
        }
        return 0L;
    }

    /* renamed from: ۟ۢ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1468() {
        if (C0179.m1427() > 0) {
            return BuildCompat.m907();
        }
        return false;
    }

    /* renamed from: ۟ۢۡۤۨ, reason: not valid java name and contains not printable characters */
    public static IvParameterSpec m1469() {
        if (C0390.m5512() > 0) {
            return App.iv;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static String m1470() {
        if (C0396.m5741() < 0) {
            return "518DD1C0FC554C9D8C1DC73B157DD86961F0AC949AF7FE80F451A545A9835C0B696F6E66F2685405259A02D19DB7302D";
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m1471(Object obj) {
        if (C0388.m5430() >= 0) {
            return ((ActivityInfo) obj).name;
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۥۣ, reason: not valid java name and contains not printable characters */
    public static C0416 m1472(Object obj, Object obj2) {
        if (C0229.m2064() < 0) {
            return ((C0416) obj).m6202((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m1473(Object obj, Object obj2) {
        if (C0206.m1807() < 0) {
            return ((JSONObject) obj).optString((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m1474(Object obj, Object obj2) {
        if (m1464() > 0) {
            return String.format((String) obj, (Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۥۦۧ, reason: not valid java name and contains not printable characters */
    public static RefStaticMethod m1475() {
        if (C0060.m216() >= 0) {
            return IActivityTaskManager.Stub.asInterface;
        }
        return null;
    }

    /* renamed from: ۟ۤۨۦۨ, reason: not valid java name and contains not printable characters */
    public static DESKeySpec m1476() {
        if (C0362.m3122() < 0) {
            return App.keySpec;
        }
        return null;
    }

    /* renamed from: ۟ۥ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static C0262 m1477() {
        if (m1464() >= 0) {
            return C0262.m2354();
        }
        return null;
    }

    /* renamed from: ۟ۥۥۥۢ, reason: not valid java name and contains not printable characters */
    public static String m1478(String str) {
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

    /* renamed from: ۟ۥۥۨۡ, reason: not valid java name and contains not printable characters */
    public static String m1479() {
        if (C0386.m5322() > 0) {
            return "android.content.pm.UserInfo";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m1480() {
        if (m1464() >= 0) {
            return "android.webkit.IWebViewUpdateService";
        }
        return null;
    }

    /* renamed from: ۣ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m1481() {
        if (C0420.m6215() < 0) {
            return "485C1F3488C571E9CE6C5B59194088AC10DA5DBA4445AACB";
        }
        return null;
    }

    /* renamed from: ۠ۥۦۤ, reason: not valid java name and contains not printable characters */
    public static String m1482() {
        if (C0089.m592() > 0) {
            return "android.app.ServiceStartArgs";
        }
        return null;
    }

    /* renamed from: ۠ۦ۠۟, reason: not valid java name and contains not printable characters */
    public static C0253 m1483() {
        if (C0384.m5278() >= 0) {
            return C0253.m2235();
        }
        return null;
    }

    /* renamed from: ۡۡۤۤ, reason: not valid java name and contains not printable characters */
    public static int m1484(Object obj, int i) {
        if (C0086.m500() > 0) {
            return ((Cursor) obj).getInt(i);
        }
        return 0;
    }

    /* renamed from: ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static void m1485(Object obj, Object obj2, long j) {
        if (C0088.m573() >= 0) {
            ((Bundle) obj).putLong((String) obj2, j);
        }
    }

    /* renamed from: ۣۡۧ, reason: not valid java name and contains not printable characters */
    public static String m1486() {
        if (C0389.m5481() > 0) {
            return "8C8CB738F2CD708D";
        }
        return null;
    }

    /* renamed from: ۢ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m1487(Object obj, int i) {
        if (C0009.m36() <= 0) {
            ((C0200) obj).m1768(i);
        }
    }

    /* renamed from: ۢ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static RefStaticInt m1488() {
        if (C0381.m5127() > 0) {
            return StrictMode.PENALTY_DEATH_ON_FILE_URI_EXPOSURE;
        }
        return null;
    }

    /* renamed from: ۢۨۢ۠, reason: not valid java name and contains not printable characters */
    public static String m1489(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static void m1490(Object obj, Object obj2) {
        if (C0385.m5282() <= 0) {
            ((C0241) obj).m2156((C0195) obj2);
        }
    }

    /* renamed from: ۣۢۥ, reason: not valid java name and contains not printable characters */
    public static String m1491() {
        if (C0191.m1627() < 0) {
            return "1FC618E831D14ADCDE7B948E1891DA9A";
        }
        return null;
    }

    /* renamed from: ۣۥۣۢ, reason: not valid java name and contains not printable characters */
    public static C0199 m1492(Object obj) {
        if (C0025.m118() > 0) {
            return C0199.m1752((JSONObject) obj);
        }
        return null;
    }

    /* renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static String m1493() {
        if (C0420.m6215() < 0) {
            return "704661021022A659";
        }
        return null;
    }

    /* renamed from: ۣۤۥ, reason: not valid java name and contains not printable characters */
    public static String m1494() {
        if (C0388.m5430() > 0) {
            return C0214.f349;
        }
        return null;
    }

    /* renamed from: ۤۨۥ۠, reason: not valid java name and contains not printable characters */
    public static int m1495(Object obj) {
        if (C0390.m5512() >= 0) {
            return C0297.m2617((List<?>) obj);
        }
        return 0;
    }

    /* renamed from: ۤۨۨۥ, reason: not valid java name and contains not printable characters */
    public static MethodHandles.Lookup m1496() {
        if (C0393.m5668() >= 0) {
            return MethodHandles.lookup();
        }
        return null;
    }

    /* renamed from: ۥ۟ۧۧ, reason: contains not printable characters */
    public static EditText m1497(Object obj) {
        if (C0089.m592() > 0) {
            return ((InterfaceC0275) obj).getEditText();
        }
        return null;
    }

    /* renamed from: ۥۣۧ۟, reason: contains not printable characters */
    public static void m1498(Object obj, Object obj2) throws IOException {
        if (C0191.m1627() <= 0) {
            ((ByteArrayOutputStream) obj).writeTo((OutputStream) obj2);
        }
    }

    /* renamed from: ۥۧۨۧ, reason: contains not printable characters */
    public static void m1499(Object obj, Object obj2) {
        if (C0388.m5430() >= 0) {
            ((C0201) obj).m1786((String) obj2);
        }
    }

    /* renamed from: ۣۧۢ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m1500(Object obj) {
        if (C0378.m4998() > 0) {
            return ((SharedPreferences) obj).edit();
        }
        return null;
    }

    /* renamed from: ۣۣۧ, reason: not valid java name and contains not printable characters */
    public static String m1501() {
        if (C0155.m1294() <= 0) {
            return "android.os.storage.IStorageManager$Stub";
        }
        return null;
    }

    /* renamed from: ۨۢۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1502(Object obj) {
        if (C0390.m5512() >= 0) {
            return C0138.m1120((long[]) obj);
        }
        return false;
    }

    /* renamed from: ۨۤۧ۠, reason: not valid java name and contains not printable characters */
    public static InputStream m1503(Object obj) {
        if (C0078.m361() > 0) {
            return ((HttpURLConnection) obj).getInputStream();
        }
        return null;
    }

    /* renamed from: ۨۧۤ, reason: not valid java name and contains not printable characters */
    public static int m1504(Object obj) {
        if (C0184.m1524() < 0) {
            return ((InputStream) obj).available();
        }
        return 0;
    }
}
