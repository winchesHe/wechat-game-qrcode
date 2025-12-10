package com.cloudinject.core.p009.p011;

import android.app.Activity;
import android.app.Application;
import android.app.C0009;
import android.app.Instrumentation;
import android.arch.lifecycle.p000.C0025;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.C0074;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.net.wifi.C0078;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.BuildCompat;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.C0185;
import com.cloudinject.feature.model.RemoteShareInfo;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p018.C0224;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p019.C0246;
import com.cloudinject.feature.p023.AbstractC0302;
import com.cloudinject.feature.p023.C0297;
import com.cloudinject.feature.p023.C0320;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.p024.AbstractC0307;
import com.cloudinject.p025.C0340;
import com.cloudinject.p025.C0351;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import com.sadfxg.fasg.C0370;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import mirrorb.RefObject;
import mirrorb.android.accounts.C0375;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.app.servertransaction.ClientTransaction;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.core.̗.̗.ۣ۟ۧ۠ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0155 {

    /* renamed from: ۟ۦۨۨۥ, reason: not valid java name and contains not printable characters */
    public static int f227 = -98;

    /* renamed from: ۣ۟۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m1278(Object obj, Object obj2) {
        if (C0383.m5203() >= 0) {
            ((Application.ActivityLifecycleCallbacks) obj).onActivityResumed((Activity) obj2);
        }
    }

    /* renamed from: ۟۟ۥ۠۠, reason: not valid java name and contains not printable characters */
    public static String m1279() {
        if (C0164.m1359() <= 0) {
            return "04E992D675EDF9EC7E250E6E7DF77D2D";
        }
        return null;
    }

    /* renamed from: ۟۟ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static ContentProviderClient m1280(Object obj, Object obj2) {
        if (C0089.m592() > 0) {
            return ((ContentResolver) obj).acquireContentProviderClient((Uri) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۦۨ۠, reason: not valid java name and contains not printable characters */
    public static String m1281() {
        if (C0121.m1023() <= 0) {
            return "758CB5A7B208A09936F64E52305802D1A8B62F339EFD403FFF1A07AC9E46FDB1ADE8948FA15FB65376BB2EA021ADA7F4";
        }
        return null;
    }

    /* renamed from: ۟۠۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1282(Object obj) {
        if (C0078.m361() > 0) {
            return ((C0246) obj).f421;
        }
        return false;
    }

    /* renamed from: ۣ۟۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static String m1283(Object obj) {
        if (C0370.m3284() < 0) {
            return ((Class) obj).getCanonicalName();
        }
        return null;
    }

    /* renamed from: ۟۠ۦۧ۟, reason: not valid java name and contains not printable characters */
    public static String m1284() {
        if (C0398.m5833() > 0) {
            return "4E6B5EB223A4E062";
        }
        return null;
    }

    /* renamed from: ۟۠ۨۥۡ, reason: not valid java name and contains not printable characters */
    public static String m1285() {
        if (C0164.m1359() <= 0) {
            return "6F868D2063D650801E98BD1068BDFD22";
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static ContentProviderClient m1286(Object obj, Object obj2) {
        if (C0388.m5430() > 0) {
            return ((ContentResolver) obj).acquireUnstableContentProviderClient((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m1287(Object obj, Object obj2) {
        if (C0393.m5668() >= 0) {
            ((RemoteShareInfo) obj).setShareCount((Integer) obj2);
        }
    }

    /* renamed from: ۟ۡ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static RefObject m1288() {
        if (C0009.m36() <= 0) {
            return ClientTransaction.mActivityToken;
        }
        return null;
    }

    /* renamed from: ۟ۡۡۨۥ, reason: not valid java name and contains not printable characters */
    public static String m1289() {
        if (C0378.m4998() >= 0) {
            return "invoke";
        }
        return null;
    }

    /* renamed from: ۟ۡۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Integer m1290(Object obj) {
        if (C0009.m36() <= 0) {
            return ((RemoteShareInfo) obj).getNeutralActionType();
        }
        return null;
    }

    /* renamed from: ۟ۡۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static List m1291(Object obj, Object obj2) {
        if (C0086.m500() >= 0) {
            return C0297.m2680((AbstractC0302) obj, (List) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static Boolean m1292(Object obj, Object obj2) {
        if (C0375.m4840() <= 0) {
            return ((AbstractC0302) obj).m2733(obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static String m1293() {
        if (C0121.m1023() < 0) {
            return "DD2C128842403852E10FF0F005DEC3FCAF219861952D8A553B8B6D2940C9C01D1D7CF42F5D8584852C9381A5915F7F02";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static int m1294() {
        return (-1755428) ^ C0395.m5690((Object) "ۨۡ۠");
    }

    /* renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static Iterator m1295(Object obj) {
        if (C0025.m118() >= 0) {
            return ((LinkedList) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static void m1296(Object obj, int i) {
        if (C0179.m1427() > 0) {
            ((Activity) obj).setRequestedOrientation(i);
        }
    }

    /* renamed from: ۟ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static String m1297() {
        if (C0334.m2866() >= 0) {
            return "android.content.pm.PackageUserState";
        }
        return null;
    }

    /* renamed from: ۟ۤۦۥۥ, reason: not valid java name and contains not printable characters */
    public static String m1298() {
        if (C0229.m2064() < 0) {
            return "F1ACDF9AE022A2791A6D9D33E394BE6C";
        }
        return null;
    }

    /* renamed from: ۟ۥۢۢۦ, reason: not valid java name and contains not printable characters */
    public static Bundle m1299(Object obj) {
        if (C0398.m5833() > 0) {
            return ((Instrumentation) obj).getBinderCounts();
        }
        return null;
    }

    /* renamed from: ۟ۥۦۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1300() {
        if (C0334.m2866() > 0) {
            return BuildCompat.m910();
        }
        return false;
    }

    /* renamed from: ۟ۥۣۨۡ, reason: not valid java name and contains not printable characters */
    public static String m1301() {
        if (C0229.m2064() < 0) {
            return "AE86BAA1829D60CDF3BC75A83A3C794D098AC32A3BC0F29D8038252F52DC412366D0DA38EB1E93850B3FA26DA2FF871906E622A4CAEB6C60";
        }
        return null;
    }

    /* renamed from: ۟ۦۡۡۤ, reason: not valid java name and contains not printable characters */
    public static C0340 m1302(Object obj, Object obj2) {
        if (C0369.m3256() > 0) {
            return ((C0351) obj).m3077((File) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۦۡۥ, reason: not valid java name and contains not printable characters */
    public static String m1303() {
        if (C0074.m307() < 0) {
            return "F955D6CD6E76262A89F98455D93D803224EA3AA4C86860A3";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m1304(Object obj) {
        if (C0382.m5180() >= 0) {
            ((InterruptedException) obj).printStackTrace();
        }
    }

    /* renamed from: ۟ۨۡۤ, reason: not valid java name and contains not printable characters */
    public static void m1305(Object obj) {
        if (C0086.m500() >= 0) {
            ((WebView) obj).stopLoading();
        }
    }

    /* renamed from: ۣ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static File m1306(Object obj) {
        if (C0184.m1524() <= 0) {
            return ((Context) obj).getFilesDir();
        }
        return null;
    }

    /* renamed from: ۢ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m1307() {
        if (C0088.m573() >= 0) {
            return "android.os.storage.StorageVolume";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m1308(Object obj, Object obj2) {
        if (C0400.m5961() > 0) {
            return ((Field) obj).getInt(obj2);
        }
        return 0;
    }

    /* renamed from: ۣۡۡۥ, reason: not valid java name and contains not printable characters */
    public static String m1309(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۣۣۤ, reason: not valid java name and contains not printable characters */
    public static void m1310(Object obj, int i) {
        if (C0368.m3171() < 0) {
            ((GradientDrawable) obj).setColor(i);
        }
    }

    /* renamed from: ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m1311() {
        if (C0381.m5127() > 0) {
            return "\">";
        }
        return null;
    }

    /* renamed from: ۤۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m1312() {
        if (C0386.m5322() > 0) {
            return "070250D9A74ACCE8";
        }
        return null;
    }

    /* renamed from: ۣۤۧۢ, reason: not valid java name and contains not printable characters */
    public static String m1313(String str) {
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

    /* renamed from: ۥۢۨ۠, reason: contains not printable characters */
    public static String m1314() {
        if (C0184.m1524() < 0) {
            return "com.android.internal.os.IDropBoxManagerService";
        }
        return null;
    }

    /* renamed from: ۥۥۢۢ, reason: contains not printable characters */
    public static String m1315(Object obj) {
        if (C0395.m5698() < 0) {
            return ((C0185) obj).getCancelExt();
        }
        return null;
    }

    /* renamed from: ۦ۟ۡ, reason: contains not printable characters */
    public static String m1316(Object obj) {
        if (C0384.m5278() >= 0) {
            return C0320.m2789((String) obj);
        }
        return null;
    }

    /* renamed from: ۨۢۨۥ, reason: not valid java name and contains not printable characters */
    public static void m1317(Object obj, Object obj2) {
        if (C0228.m2012() >= 0) {
            ((RemoteShareInfo) obj).setCancelActionType((Integer) obj2);
        }
    }

    /* renamed from: ۨۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m1318() {
        if (C0387.m5374() < 0) {
            return "190567F62F3A2684C9FC4CA8CF90DC11";
        }
        return null;
    }

    /* renamed from: ۨۧۧ۠, reason: not valid java name and contains not printable characters */
    public static void m1319(Object obj, Object obj2, Object obj3) {
        if (C0394.m5672() > 0) {
            C0224.lambda$JJJzMkMx_FBpskpNv5OAxSbFJ3U((C0224) obj, (String) obj2, (AbstractC0307) obj3);
        }
    }

    /* renamed from: ۨۧۨۢ, reason: not valid java name and contains not printable characters */
    public static String m1320() {
        if (C0397.m5814() > 0) {
            return "android.app.LoadedApk";
        }
        return null;
    }
}
