package com.cloudinject.feature.p023;

import android.app.Activity;
import android.app.C0009;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.database.C0073;
import android.database.C0074;
import android.net.C0083;
import android.net.Uri;
import android.net.wifi.C0078;
import android.preference.PreferenceManager;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.utils.C0139;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.C0192;
import com.cloudinject.feature.model.C0198;
import com.cloudinject.feature.model.C0199;
import com.cloudinject.feature.model.C0200;
import com.cloudinject.feature.model.C0201;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0222;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p021.AbstractC0289;
import com.cloudinject.feature.p021.FragmentC0290;
import com.cloudinject.feature.p021.p022.C0279;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Executable;
import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.pm.ParceledListSlice;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.dalvik.system.C0399;
import org.lsposed.hiddenapibypass.HiddenApiBypass;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.feature.̙̙.۟ۤۨۥۨ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0335 {

    /* renamed from: ۟ۢۤۤۢ, reason: not valid java name and contains not printable characters */
    public static int f559 = 98;

    /* renamed from: ۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m2897(Object obj) {
        if (C0155.m1294() <= 0) {
            return ((DataInputStream) obj).read();
        }
        return 0;
    }

    /* renamed from: ۟۟ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m2898(String str) {
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

    /* renamed from: ۣ۟۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m2899() {
        if (C0368.m3171() <= 0) {
            return "android.os.INetworkManagementService";
        }
        return null;
    }

    /* renamed from: ۣ۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static C0199 m2900(Object obj) {
        if (C0073.m265() > 0) {
            return ((C0192) obj).m1685();
        }
        return null;
    }

    /* renamed from: ۟ۡۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m2901(Object obj) {
        if (C0073.m265() > 0) {
            return Long.parseLong((String) obj);
        }
        return 0L;
    }

    /* renamed from: ۟ۡۤۦۥ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m2902(Object obj) {
        if (C0088.m573() >= 0) {
            return PreferenceManager.getDefaultSharedPreferences((Context) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡۤۨۡ, reason: not valid java name and contains not printable characters */
    public static Class m2903() {
        if (m2923() < 0) {
            return ParceledListSlice.TYPE;
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static String m2904() {
        if (C0381.m5127() > 0) {
            return "android.app.IActivityTaskManager$Stub";
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m2905(Object obj, Object obj2) {
        if (C0121.m1023() <= 0) {
            C0330.m2823lambda$MyeFrbpMqLrtUpItLnbLWATsdk((String) obj, (Context) obj2);
        }
    }

    /* renamed from: ۟ۢ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static ProviderInfo[] m2906(Object obj) {
        if (C0383.m5203() >= 0) {
            return ((PackageInfo) obj).providers;
        }
        return null;
    }

    /* renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static Class[] m2907(Object obj) {
        if (C0379.m5056() > 0) {
            return ((Executable) obj).getParameterTypes();
        }
        return null;
    }

    /* renamed from: ۟ۤ, reason: not valid java name and contains not printable characters */
    public static InputStream m2908(Object obj) {
        if (C0376.m4906() >= 0) {
            return ((URL) obj).openStream();
        }
        return null;
    }

    /* renamed from: ۟ۥ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2909(Object obj, Object obj2) {
        if (C0380.m5068() >= 0) {
            return C0324.m2798((Context) obj, (String) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۥ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m2910() {
        if (C0228.m2012() >= 0) {
            return "DD632A40825E4C711E191152704CA5646A7395DE8BF0C39A90633F0423E24CE5BA40F669FC367022";
        }
        return null;
    }

    /* renamed from: ۟ۥۧۨۤ, reason: not valid java name and contains not printable characters */
    public static String m2911(Object obj) {
        if (C0279.m2491() < 0) {
            return ((File) obj).getParent();
        }
        return null;
    }

    /* renamed from: ۟ۦۣۡۨ, reason: not valid java name and contains not printable characters */
    public static String m2912() {
        if (C0228.m2012() >= 0) {
            return "DE15558774D90171011AF3CBFAD5452A0FB287614E9C78EB80E92E5A8D47ED324DBC285662B862A047946B8A304B6FD14DD16E38943B2D8891451E6C0C6822BC4A4CF5316B30AA74";
        }
        return null;
    }

    /* renamed from: ۟ۦۢۧۢ, reason: not valid java name and contains not printable characters */
    public static List m2913(Object obj) {
        if (C0206.m1807() <= 0) {
            return ((C0198) obj).m1750();
        }
        return null;
    }

    /* renamed from: ۟ۧۢۥۨ, reason: not valid java name and contains not printable characters */
    public static String m2914() {
        if (C0009.m36() <= 0) {
            return "android.app.ContentProviderHolder";
        }
        return null;
    }

    /* renamed from: ۠ۦۢۧ, reason: not valid java name and contains not printable characters */
    public static void m2915(Object obj, Object obj2, int i) {
        if (C0399.m5914() >= 0) {
            ((Activity) obj).startActivityForResult((Intent) obj2, i);
        }
    }

    /* renamed from: ۡۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m2916(Object obj, Object obj2) {
        if (C0370.m3284() < 0) {
            ((C0222) obj).m1933((String) obj2);
        }
    }

    /* renamed from: ۡۥۣ۠, reason: not valid java name and contains not printable characters */
    public static String m2917(Object obj) {
        if (C0086.m500() >= 0) {
            return ((C0201) obj).getCancelText();
        }
        return null;
    }

    /* renamed from: ۡۦۧ۠, reason: not valid java name and contains not printable characters */
    public static String m2918() {
        if (C0078.m361() >= 0) {
            return "8040D854FC7610984DEB8EB22272DF69";
        }
        return null;
    }

    /* renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static String m2919() {
        if (C0388.m5430() > 0) {
            return "android.hardware.fingerprint.IFingerprintService$Stub";
        }
        return null;
    }

    /* renamed from: ۢۦۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2920(Object obj) {
        if (C0088.m573() > 0) {
            return HiddenApiBypass.addHiddenApiExemptions((String[]) obj);
        }
        return false;
    }

    /* renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
    public static C0139 m2921(Object obj) {
        if (C0334.m2866() >= 0) {
            return ((C0139) obj).m1199();
        }
        return null;
    }

    /* renamed from: ۢۧۧ, reason: not valid java name and contains not printable characters */
    public static String m2922() {
        if (C0388.m5430() > 0) {
            return "Initialize error";
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m2923() {
        return (-1753604) ^ C0395.m5690((Object) "ۦۥۦ");
    }

    /* renamed from: ۣ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2924(Object obj, Object obj2) {
        if (C0074.m307() <= 0) {
            return ((HashSet) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* renamed from: ۣۥۨ۟, reason: not valid java name and contains not printable characters */
    public static Uri m2925(Object obj, long j) {
        if (C0383.m5203() > 0) {
            return ContentUris.withAppendedId((Uri) obj, j);
        }
        return null;
    }

    /* renamed from: ۤ۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m2926() {
        if (C0387.m5374() < 0) {
            return "1CBC72F9B572BA6195B65A226D7080E1";
        }
        return null;
    }

    /* renamed from: ۥۦۡۥ, reason: contains not printable characters */
    public static int m2927(Object obj, Object obj2) {
        if (C0164.m1359() < 0) {
            return ((String) obj).lastIndexOf((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۥۧۥۨ, reason: contains not printable characters */
    public static String m2928() {
        if (C0390.m5512() > 0) {
            return "android.view.IWindowManager";
        }
        return null;
    }

    /* renamed from: ۦۣ۠۠, reason: contains not printable characters */
    public static String m2929() {
        if (C0420.m6215() < 0) {
            return "android.view.WindowManagerGlobal";
        }
        return null;
    }

    /* renamed from: ۦۡۦۨ, reason: contains not printable characters */
    public static String m2930(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۦۤۢۧ, reason: contains not printable characters */
    public static void m2931(Object obj, Object obj2) {
        if (C0083.m448() < 0) {
            ((C0200) obj).setThemeColor((String) obj2);
        }
    }

    /* renamed from: ۦۥ۟ۢ, reason: contains not printable characters */
    public static String m2932() {
        if (C0369.m3256() > 0) {
            return "android.location.ILocationListener";
        }
        return null;
    }

    /* renamed from: ۣۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m2933() {
        if (C0073.m265() > 0) {
            return "this object is not an instance of the given class";
        }
        return null;
    }

    /* renamed from: ۧۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m2934() {
        if (C0121.m1023() <= 0) {
            return "D916D445AD8FBB4C820CF7A0E1BCE40CBDBE65358E2212D0CAB7EB2BC2B4F718";
        }
        return null;
    }

    /* renamed from: ۨۡۨۤ, reason: not valid java name and contains not printable characters */
    public static int m2935(Object obj) {
        if (C0369.m3256() >= 0) {
            return ((CharSequence) obj).length();
        }
        return 0;
    }

    /* renamed from: ۨۢۥ, reason: not valid java name and contains not printable characters */
    public static void m2936(Object obj, Object obj2) {
        if (C0378.m4998() > 0) {
            ((FragmentC0290) obj).m2539((AbstractC0289) obj2);
        }
    }
}
