package com.cloudinject.core.p013;

import android.app.Activity;
import android.app.Application;
import android.app.C0009;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.arch.lifecycle.p000.C0025;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.C0074;
import android.graphics.drawable.Drawable;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.os.Parcel;
import android.os.Process;
import android.util.SparseIntArray;
import android.view.View;
import androidx.core.p007.C0088;
import com.cloudinject.core.C0176;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0184;
import com.cloudinject.customview.FeatureLinearLayout;
import com.cloudinject.feature.model.C0187;
import com.cloudinject.feature.model.C0199;
import com.cloudinject.feature.model.C0201;
import com.cloudinject.feature.model.C0202;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p019.C0241;
import com.cloudinject.feature.p019.C0247;
import com.cloudinject.feature.p021.p022.AlertDialogC0276;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.AbstractC0313;
import com.cloudinject.feature.p023.C0297;
import com.cloudinject.feature.p023.C0327;
import com.cloudinject.feature.p023.C0328;
import com.cloudinject.feature.p023.C0334;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import mirrorb.RefObject;
import mirrorb.RefStaticMethod;
import mirrorb.android.app.ActivityThread;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.BaseBundle;
import mirrorb.android.os.BundleICS;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.rms.C0392;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.core.̙.ۨۥ۠ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0179 {

    /* renamed from: ۣ۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static int f238 = 67;

    /* renamed from: ۣۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m1396() {
        if (C0382.m5180() > 0) {
            return "com.android.internal.policy.PhoneWindow$WindowManagerHolder";
        }
        return null;
    }

    /* renamed from: ۟۟ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static int m1397(Object obj) {
        if (C0381.m5127() > 0) {
            return ((Long) obj).intValue();
        }
        return 0;
    }

    /* renamed from: ۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static File m1398(Object obj, Object obj2, int i) {
        if (C0279.m2491() < 0) {
            return ((Context) obj).getDir((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ۟۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m1399(Object obj) {
        if (C0025.m118() >= 0) {
            return ((C0202) obj).m1802();
        }
        return null;
    }

    /* renamed from: ۟۠ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static void m1400(Object obj, Object obj2) {
        if (C0229.m2064() < 0) {
            ((AlertDialogC0276) obj).setView((View) obj2);
        }
    }

    /* renamed from: ۟ۢ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static String m1401(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۟ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static String m1402() {
        if (C0083.m448() <= 0) {
            return "49598275AD670617D38DF02958AFD76F";
        }
        return null;
    }

    /* renamed from: ۟ۢۨۤۦ, reason: not valid java name and contains not printable characters */
    public static String m1403(Object obj) {
        if (C0088.m573() >= 0) {
            return ((Executable) obj).getName();
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m1404(Object obj, Object obj2, int i) {
        if (C0184.m1524() <= 0) {
            return ((PackageManager) obj).getPackageInfo((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m1405(Object obj) {
        if (C0228.m2012() >= 0) {
            return ((Parcel) obj).readLong();
        }
        return 0L;
    }

    /* renamed from: ۣۣ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m1406() {
        if (C0382.m5180() >= 0) {
            return "android.app.LoadedApk$ServiceDispatcher$InnerConnection";
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۡۡ, reason: not valid java name and contains not printable characters */
    public static RefObject m1407() {
        if (C0388.m5430() > 0) {
            return BundleICS.mParcelledData;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static C0176 m1408() {
        if (C0382.m5180() >= 0) {
            return C0176.m1382();
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۧ۠, reason: not valid java name and contains not printable characters */
    public static Drawable m1409(Object obj, Object obj2) {
        if (C0382.m5180() > 0) {
            return ((ApplicationInfo) obj).loadIcon((PackageManager) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static List m1410(Object obj, Object obj2) {
        if (C0206.m1807() <= 0) {
            return C0297.m2643((AbstractC0313) obj, (List) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m1411() {
        if (C0400.m5961() >= 0) {
            return "BF414359B1C23DB3B2BDC4A7C3B344EBF59B79F1B2334B5F";
        }
        return null;
    }

    /* renamed from: ۟ۤۢ۠۟, reason: not valid java name and contains not printable characters */
    public static Annotation m1412(Object obj, Object obj2) {
        if (C0383.m5203() > 0) {
            return ((Class) obj).getAnnotation((Class) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۢۢۢ, reason: not valid java name and contains not printable characters */
    public static RefObject m1413() {
        if (C0388.m5430() >= 0) {
            return ActivityThread.AppBindData.info;
        }
        return null;
    }

    /* renamed from: ۟ۥۤۤۢ, reason: not valid java name and contains not printable characters */
    public static int m1414(Object obj) {
        if (C0380.m5068() >= 0) {
            return ((FeatureLinearLayout) obj).getWidth();
        }
        return 0;
    }

    /* renamed from: ۟ۥۥۣ۠, reason: not valid java name and contains not printable characters */
    public static void m1415(Object obj, Object obj2) {
        if (C0377.m4944() > 0) {
            ((C0187) obj).setMessage((String) obj2);
        }
    }

    /* renamed from: ۟ۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static SecretKeyFactory m1416(Object obj) {
        if (C0382.m5180() >= 0) {
            return SecretKeyFactory.getInstance((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۢۦۥ, reason: not valid java name and contains not printable characters */
    public static int m1417(Object obj, int i) {
        if (C0370.m3284() < 0) {
            return ((SparseIntArray) obj).get(i);
        }
        return 0;
    }

    /* renamed from: ۟ۦۣۦۤ, reason: not valid java name and contains not printable characters */
    public static String m1418() {
        if (C0191.m1627() <= 0) {
            return "android.os.Handler";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static String m1419() {
        if (C0389.m5481() >= 0) {
            return "20A8FE156CD69E38";
        }
        return null;
    }

    /* renamed from: ۟ۧۤۢۡ, reason: not valid java name and contains not printable characters */
    public static C0247 m1420() {
        if (C0370.m3284() <= 0) {
            return C0247.m2207();
        }
        return null;
    }

    /* renamed from: ۟ۧۤۦۦ, reason: not valid java name and contains not printable characters */
    public static void m1421(Object obj, Object obj2) {
        if (C0191.m1627() <= 0) {
            ((C0199) obj).m1754((String) obj2);
        }
    }

    /* renamed from: ۟ۧۧۤۦ, reason: not valid java name and contains not printable characters */
    public static String m1422() {
        if (C0394.m5672() >= 0) {
            return "6F26F074A06EF9E94BCF9D07875834B24D4683BEE4F9844132FDA71B26DB0884";
        }
        return null;
    }

    /* renamed from: ۠۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m1423(Object obj) {
        if (C0379.m5056() > 0) {
            return ((C0201) obj).getCancelExt();
        }
        return null;
    }

    /* renamed from: ۠ۥۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1424(Object obj) {
        if (C0078.m361() > 0) {
            return C0328.m2819((Context) obj);
        }
        return false;
    }

    /* renamed from: ۠ۥۨۧ, reason: not valid java name and contains not printable characters */
    public static void m1425(Object obj, Object obj2) {
        if (C0395.m5698() < 0) {
            ((Application.ActivityLifecycleCallbacks) obj).onActivityDestroyed((Activity) obj2);
        }
    }

    /* renamed from: ۠ۨۧۦ, reason: not valid java name and contains not printable characters */
    public static String m1426(String str) {
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

    /* renamed from: ۡ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m1427() {
        return 1748646 ^ C0395.m5690((Object) "ۡۡۤ");
    }

    /* renamed from: ۡۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m1428(Object obj, Object obj2, int i) {
        if (C0392.m5595() > 0) {
            return ((PackageManager) obj).getPackageArchiveInfo((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ۢۢۤۤ, reason: not valid java name and contains not printable characters */
    public static String m1429() {
        if (C0383.m5203() > 0) {
            return "556AC84FD8C24C421FE8B40889575B33";
        }
        return null;
    }

    /* renamed from: ۣۡۤۨ, reason: not valid java name and contains not printable characters */
    public static FragmentTransaction m1430(Object obj) {
        if (C0389.m5481() >= 0) {
            return ((FragmentManager) obj).beginTransaction();
        }
        return null;
    }

    /* renamed from: ۣۦۤ, reason: not valid java name and contains not printable characters */
    public static Boolean m1431() {
        if (C0082.m410() <= 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static String m1432(Object obj) {
        if (C0379.m5056() >= 0) {
            return ((CharSequence) obj).toString();
        }
        return null;
    }

    /* renamed from: ۣۧۤۧ, reason: not valid java name and contains not printable characters */
    public static void m1433(Object obj, boolean z) {
        if (C0121.m1023() <= 0) {
            ((C0241) obj).m2157(z);
        }
    }

    /* renamed from: ۤۥۡ۠, reason: not valid java name and contains not printable characters */
    public static RefObject m1434() {
        if (C0368.m3171() < 0) {
            return mirrorb.android.app.Activity.mToken;
        }
        return null;
    }

    /* renamed from: ۤۧۥۣ, reason: not valid java name and contains not printable characters */
    public static Cipher m1435(Object obj) {
        if (C0377.m4944() > 0) {
            return Cipher.getInstance((String) obj);
        }
        return null;
    }

    /* renamed from: ۤۨۤۧ, reason: not valid java name and contains not printable characters */
    public static String m1436() {
        if (C0088.m573() > 0) {
            return "805DC61EDA23519536679026062157C8A8F75600C5E8ACF4";
        }
        return null;
    }

    /* renamed from: ۤۨۦۡ, reason: not valid java name and contains not printable characters */
    public static String m1437() {
        if (C0390.m5512() >= 0) {
            return "com.android.internal.app.IAppOpsService$Stub";
        }
        return null;
    }

    /* renamed from: ۥۢۢۦ, reason: contains not printable characters */
    public static RefStaticMethod m1438() {
        if (C0392.m5595() >= 0) {
            return ActivityThread.currentActivityThread;
        }
        return null;
    }

    /* renamed from: ۦۢۨۦ, reason: contains not printable characters */
    public static RefObject m1439() {
        if (C0334.m2866() >= 0) {
            return ActivityThread.AppBindData.instrumentationName;
        }
        return null;
    }

    /* renamed from: ۧ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static void m1440(Object obj, Object obj2, boolean z) throws IllegalAccessException, IllegalArgumentException {
        if (C0074.m307() <= 0) {
            ((Field) obj).setBoolean(obj2, z);
        }
    }

    /* renamed from: ۧۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m1441(Object obj, Object obj2) {
        if (C0397.m5814() >= 0) {
            C0327.m2808((InputStream) obj, (File) obj2);
        }
    }

    /* renamed from: ۧۨ۟۟, reason: not valid java name and contains not printable characters */
    public static int m1442() {
        if (C0384.m5278() >= 0) {
            return Process.myUid();
        }
        return 0;
    }

    /* renamed from: ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static Class m1443() {
        if (C0369.m3256() > 0) {
            return BaseBundle.TYPE;
        }
        return null;
    }
}
