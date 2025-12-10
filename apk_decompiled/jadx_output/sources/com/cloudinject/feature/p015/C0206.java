package com.cloudinject.feature.p015;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.database.C0073;
import android.database.C0074;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.C0187;
import com.cloudinject.feature.model.C0197;
import com.cloudinject.feature.model.RemoteShareInfo;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p019.C0239;
import com.cloudinject.feature.p019.C0255;
import com.cloudinject.feature.p021.AlertDialogC0273;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0294;
import com.cloudinject.feature.p023.C0298;
import com.cloudinject.feature.p023.C0305;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.feature.p023.p024.AbstractC0307;
import com.cloudinject.p025.C0362;
import com.sadfxg.fasg.C0369;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.spec.KeySpec;
import java.text.NumberFormat;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import mirrorb.RefObject;
import mirrorb.RefStaticMethod;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.IApplicationThreadOreo;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.app.servertransaction.LaunchActivityItem;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.Singleton;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;
import org.json.JSONObject;

/* renamed from: com.cloudinject.feature.̖.ۣ۟ۤۡۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0206 {

    /* renamed from: ۨۦۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean f334;

    /* renamed from: ۣ۟۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static void m1805(Object obj) {
        if (C0398.m5833() >= 0) {
            ((PackageManager.NameNotFoundException) obj).printStackTrace();
        }
    }

    /* renamed from: ۟۟ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static String m1806(Object obj) {
        if (C0395.m5698() < 0) {
            return C0294.m2587((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static int m1807() {
        return (-1753474) ^ C0395.m5690((Object) "ۦۣۥ");
    }

    /* renamed from: ۟۠۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static String m1808(Object obj) {
        if (C0376.m4906() >= 0) {
            return ((Uri) obj).getPath();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m1809() {
        if (C0279.m2491() <= 0) {
            return "BB265C72A9B4C3F5";
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1810() {
        if (C0379.m5056() >= 0) {
            return "com.android.internal.telecom.ITelecomService$Stub";
        }
        return null;
    }

    /* renamed from: ۟ۢۢۨۨ, reason: not valid java name and contains not printable characters */
    public static String m1811() {
        if (C0385.m5282() < 0) {
            return "95F3AD89CB274DB4";
        }
        return null;
    }

    /* renamed from: ۟ۢۤۨۦ, reason: not valid java name and contains not printable characters */
    public static void m1812(Object obj, int i, Object obj2) {
        if (C0060.m216() > 0) {
            ((List) obj).add(i, obj2);
        }
    }

    /* renamed from: ۣ۟۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m1813() {
        if (C0369.m3256() > 0) {
            return "DC9E886A46189C061ED1A008CDF331C8";
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m1814() {
        if (C0060.m216() > 0) {
            return "61A87CDCA18609F004A1F4ED569593B9";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static void m1815(Object obj) {
        if (C0025.m118() >= 0) {
            ((AlertDialog) obj).show();
        }
    }

    /* renamed from: ۟ۤۡۥۨ, reason: not valid java name and contains not printable characters */
    public static SecretKey m1816(Object obj, Object obj2) {
        if (C0025.m118() > 0) {
            return ((SecretKeyFactory) obj).generateSecret((KeySpec) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m1817(Object obj, int i) {
        if (C0184.m1524() < 0) {
            ((TextView) obj).setTextColor(i);
        }
    }

    /* renamed from: ۟ۥ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m1818(Object obj, Object obj2) {
        if (C0383.m5203() > 0) {
            ((AlertDialog) obj).setOnDismissListener((DialogInterface.OnDismissListener) obj2);
        }
    }

    /* renamed from: ۟ۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m1819(Object obj) {
        if (C0191.m1627() <= 0) {
            C0305.m2734((Closeable[]) obj);
        }
    }

    /* renamed from: ۟ۦ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m1820(Object obj) {
        if (C0369.m3256() >= 0) {
            return ((Size) obj).getHeight();
        }
        return 0;
    }

    /* renamed from: ۟ۦۡۤۥ, reason: not valid java name and contains not printable characters */
    public static List m1821(Object obj) {
        if (C0179.m1427() > 0) {
            return ((ActivityManager) obj).getRunningAppProcesses();
        }
        return null;
    }

    /* renamed from: ۟ۦۦۢۥ, reason: not valid java name and contains not printable characters */
    public static String m1822() {
        if (C0394.m5672() > 0) {
            return "sPackageManager";
        }
        return null;
    }

    /* renamed from: ۟ۧۦۨۢ, reason: not valid java name and contains not printable characters */
    public static int m1823(Object obj) {
        if (C0362.m3122() <= 0) {
            return ((C0187) obj).m1596();
        }
        return 0;
    }

    /* renamed from: ۟ۧۧۢۢ, reason: not valid java name and contains not printable characters */
    public static void m1824(Object obj, Object obj2) {
        if (C0379.m5056() > 0) {
            ((C0197) obj).m1737((String) obj2);
        }
    }

    /* renamed from: ۣ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m1825(Object obj, Object obj2) {
        if (C0009.m36() <= 0) {
            C0298.m2722((File) obj, (String) obj2);
        }
    }

    /* renamed from: ۠۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static Class m1826() {
        if (C0025.m118() > 0) {
            return LaunchActivityItem.TYPE;
        }
        return null;
    }

    /* renamed from: ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static String m1827(Object obj, double d) {
        if (C0362.m3122() <= 0) {
            return ((NumberFormat) obj).format(d);
        }
        return null;
    }

    /* renamed from: ۠ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static String m1828(Object obj) {
        if (C0399.m5914() > 0) {
            return ((RemoteShareInfo) obj).getThemeColor();
        }
        return null;
    }

    /* renamed from: ۠ۧۥۨ, reason: not valid java name and contains not printable characters */
    public static RefObject m1829() {
        if (C0397.m5814() >= 0) {
            return Singleton.mInstance;
        }
        return null;
    }

    /* renamed from: ۡ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m1830(Object obj, Object obj2) {
        if (C0088.m573() > 0) {
            C0255.lambda$7lfzp50D3o46P3tRg82xrCpTZGw((C0255) obj, (AbstractC0307) obj2);
        }
    }

    /* renamed from: ۡ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m1831() {
        if (C0379.m5056() >= 0) {
            return "\\u003C";
        }
        return null;
    }

    /* renamed from: ۢۢۧۨ, reason: not valid java name and contains not printable characters */
    public static JSONObject m1832(Object obj, Object obj2) {
        if (C0394.m5672() >= 0) {
            return ((JSONObject) obj).optJSONObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۢۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m1833(Object obj) {
        if (C0073.m265() >= 0) {
            return ((DisplayMetrics) obj).widthPixels;
        }
        return 0;
    }

    /* renamed from: ۣۣۧ, reason: not valid java name and contains not printable characters */
    public static String m1834() {
        if (C0392.m5595() > 0) {
            return "1AC4474F806E1B4F1C220214BA11F9D40889D5C311620A2C7F2790D1889A1357B4FA16E8A0E82708";
        }
        return null;
    }

    /* renamed from: ۣۧۥۤ, reason: not valid java name and contains not printable characters */
    public static String m1835(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۣۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m1836(String str) {
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

    /* renamed from: ۣۤۢۡ, reason: not valid java name and contains not printable characters */
    public static int m1837(Object obj) {
        if (C0179.m1427() > 0) {
            return Integer.parseInt((String) obj);
        }
        return 0;
    }

    /* renamed from: ۤۧۤۡ, reason: not valid java name and contains not printable characters */
    public static RefStaticMethod m1838() {
        if (C0335.m2923() < 0) {
            return IApplicationThreadOreo.Stub.asInterface;
        }
        return null;
    }

    /* renamed from: ۥۣۡۥ, reason: contains not printable characters */
    public static void m1839(Object obj, boolean z) throws IOException {
        if (C0121.m1023() <= 0) {
            ((DataOutputStream) obj).writeBoolean(z);
        }
    }

    /* renamed from: ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m1840(Object obj, Object obj2, Object obj3) {
        if (C0074.m307() < 0) {
            ((AlertDialogC0273) obj).mo2399((String) obj2, (View.OnClickListener) obj3);
        }
    }

    /* renamed from: ۧ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m1841() {
        if (C0089.m592() >= 0) {
            return "3EB6650D8639BD6BA801D70D2B1590AC2B6B52E3E7EC12F8";
        }
        return null;
    }

    /* renamed from: ۨ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m1842(Object obj) {
        if (C0009.m36() <= 0) {
            return ((TextView) obj).getVisibility();
        }
        return 0;
    }

    /* renamed from: ۣۨ۠, reason: not valid java name and contains not printable characters */
    public static ClassLoader m1843(Object obj) {
        if (C0390.m5512() >= 0) {
            return ((Class) obj).getClassLoader();
        }
        return null;
    }

    /* renamed from: ۨۧۦ, reason: not valid java name and contains not printable characters */
    public static C0239 m1844() {
        if (C0392.m5595() >= 0) {
            return C0239.m2117();
        }
        return null;
    }

    /* renamed from: ۨۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m1845(Object obj) {
        if (C0009.m36() <= 0) {
            return ((ByteArrayOutputStream) obj).size();
        }
        return 0;
    }

    /* renamed from: ۨۨۡۢ, reason: not valid java name and contains not printable characters */
    public static void m1846(Object obj, Object obj2, int i, int i2) throws IOException {
        if (C0164.m1359() < 0) {
            ((DataOutputStream) obj).write((byte[]) obj2, i, i2);
        }
    }
}
