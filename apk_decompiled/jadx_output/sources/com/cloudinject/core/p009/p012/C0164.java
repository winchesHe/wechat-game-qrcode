package com.cloudinject.core.p009.p012;

import android.app.AlertDialog;
import android.app.C0009;
import android.app.Instrumentation;
import android.arch.p003.p005.C0060;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.C0073;
import android.graphics.Paint;
import android.net.C0082;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Parcel;
import android.widget.Button;
import androidx.core.graphics.drawable.C0086;
import com.alibaba.android.arouter.utils.Consts;
import com.cloudinject.core.p009.p010.InterfaceC0145;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p011.InstrumentationC0154;
import com.cloudinject.core.p013.C0177;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.AbstractC0137;
import com.cloudinject.core.utils.C0138;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.C0185;
import com.cloudinject.feature.model.C0197;
import com.cloudinject.feature.model.C0201;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p017.C0214;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.AlertDialogC0273;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p023.C0297;
import com.cloudinject.feature.p023.C0326;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0340;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;

/* renamed from: com.cloudinject.core.̗.̗̙.۟۠ۦۢ۟, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0164 {

    /* renamed from: ۟ۡۥۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean f230;

    /* renamed from: ۟۟ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m1334(Object obj, int i) {
        if (C0291.m2568() < 0) {
            ((Instrumentation) obj).sendKeyDownUpSync(i);
        }
    }

    /* renamed from: ۟۟ۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m1335() {
        if (C0381.m5127() > 0) {
            return Consts.DOT;
        }
        return null;
    }

    /* renamed from: ۟۠ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1336(Object obj, Object obj2) {
        if (C0121.m1023() <= 0) {
            return ((List) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۡۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1337(Object obj) {
        if (C0009.m36() <= 0) {
            return Collections.list((Enumeration) obj);
        }
        return null;
    }

    /* renamed from: ۟ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static String m1338() {
        if (C0073.m265() >= 0) {
            return "F16533F57FBF200AA27C6BAD4C0CD1A3336767E6D41F8274";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static String m1339(Object obj) {
        if (C0396.m5741() < 0) {
            return ((C0185) obj).getCancelText();
        }
        return null;
    }

    /* renamed from: ۟ۢۢۥ۟, reason: not valid java name and contains not printable characters */
    public static String m1340(Object obj) {
        if (C0362.m3122() <= 0) {
            return ((C0197) obj).getCancelExt();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static void m1341(Object obj) {
        if (C0390.m5512() >= 0) {
            ((ConditionVariable) obj).block();
        }
    }

    /* renamed from: ۣ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m1342() {
        if (C0375.m4840() <= 0) {
            return "UTF-8";
        }
        return null;
    }

    /* renamed from: ۟ۤۥۧۡ, reason: not valid java name and contains not printable characters */
    public static String m1343(Object obj) {
        if (C0389.m5481() >= 0) {
            return ((C0201) obj).getNeutralExt();
        }
        return null;
    }

    /* renamed from: ۟ۤۧۤۧ, reason: not valid java name and contains not printable characters */
    public static String m1344(String str) {
        String strM5220 = C0383.m5220();
        String strM52202 = C0383.m5220();
        for (int i = 0; i < 15; i++) {
            strM5220 = C0378.m5011(C0386.m5329(C0386.m5329(new StringBuffer(), strM5220), C0184.m1517(i)));
            strM52202 = C0378.m5011(C0399.m5879(C0386.m5329(new StringBuffer(), strM52202), ((int) (C0384.m5270() * 10)) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0191.m1625(str) / 2);
        while (C0191.m1625(str) > 0) {
            C0399.m5883(byteArrayOutputStream, (m1371(strM5220, C0388.m5438(str, -2)) << 4) | m1371(strM5220, C0388.m5438(str, -1)));
        }
        byte[] bArrM17 = C0009.m17(byteArrayOutputStream);
        int length = bArrM17.length;
        int iM1625 = C0191.m1625(strM52202);
        for (int i2 = 0; i2 < length; i2++) {
            bArrM17[i2] = (byte) (bArrM17[i2] ^ C0388.m5438(strM52202, i2 % iM1625));
        }
        return new String(bArrM17);
    }

    /* renamed from: ۟ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static Object m1345(Object obj, Object obj2, Object obj3) {
        if (C0179.m1427() >= 0) {
            return Proxy.newProxyInstance((ClassLoader) obj, (Class[]) obj2, (InvocationHandler) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۢۦ, reason: not valid java name and contains not printable characters */
    public static String m1346() {
        if (C0390.m5512() >= 0) {
            return "44FD19A6686EA863";
        }
        return null;
    }

    /* renamed from: ۟ۧ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static Intent m1347(Object obj, Object obj2, Object obj3) {
        if (C0086.m500() > 0) {
            return ((Intent) obj).putExtra((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static void m1348(Object obj, Object obj2) {
        if (C0389.m5481() >= 0) {
            ((C0197) obj).setNeutralExt((String) obj2);
        }
    }

    /* renamed from: ۠۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static int m1349(Object obj) {
        if (C0121.m1023() < 0) {
            return C0297.m2662((Collection<?>) obj);
        }
        return 0;
    }

    /* renamed from: ۠ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static String m1350() {
        if (C0073.m265() > 0) {
            return "iFields";
        }
        return null;
    }

    /* renamed from: ۠ۧۡۦ, reason: not valid java name and contains not printable characters */
    public static String m1351() {
        if (C0387.m5374() <= 0) {
            return "F955D6CD6E76262A237F1EF828990672CC883835ACD83E891AD3799AF97A67F7";
        }
        return null;
    }

    /* renamed from: ۠ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static void m1352(Object obj) {
        if (m1359() < 0) {
            ((Parcel) obj).writeNoException();
        }
    }

    /* renamed from: ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m1353() {
        if (C0389.m5481() >= 0) {
            return "10A98633697E4106";
        }
        return null;
    }

    /* renamed from: ۡۡۤۥ, reason: not valid java name and contains not printable characters */
    public static String m1354() {
        if (C0184.m1524() < 0) {
            return C0326.m2803();
        }
        return null;
    }

    /* renamed from: ۣۡۦۦ, reason: not valid java name and contains not printable characters */
    public static Set m1355(Object obj) {
        if (C0060.m216() > 0) {
            return ((Bundle) obj).keySet();
        }
        return null;
    }

    /* renamed from: ۡۥۣۤ, reason: not valid java name and contains not printable characters */
    public static void m1356(Object obj, Object obj2) {
        if (C0228.m2012() >= 0) {
            ((AlertDialogC0273) obj).setMessage((String) obj2);
        }
    }

    /* renamed from: ۡۦۧ۟, reason: not valid java name and contains not printable characters */
    public static void m1357(Object obj, int i, Object obj2) {
        if (C0346.m3059() <= 0) {
            ((Instrumentation) obj).finish(i, (Bundle) obj2);
        }
    }

    /* renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static String m1358() {
        if (C0229.m2064() < 0) {
            return "F3FA29A454D58C286DEC92B9DCF29CFA3DAA9A533324989D";
        }
        return null;
    }

    /* renamed from: ۣۢۡۦ, reason: not valid java name and contains not printable characters */
    public static int m1359() {
        return (-1746783) ^ C0395.m5690((Object) "۟ۡۡ");
    }

    /* renamed from: ۢۦۦۦ, reason: not valid java name and contains not printable characters */
    public static Button m1360(Object obj, int i) {
        if (C0375.m4840() < 0) {
            return ((AlertDialog) obj).getButton(i);
        }
        return null;
    }

    /* renamed from: ۣۣۢۧ, reason: not valid java name and contains not printable characters */
    public static void m1361(Object obj, Object obj2, boolean z) {
        if (C0393.m5668() >= 0) {
            ((Bundle) obj).putBoolean((String) obj2, z);
        }
    }

    /* renamed from: ۣۡۥۣ, reason: not valid java name and contains not printable characters */
    public static ComponentName m1362(Object obj) {
        if (C0384.m5278() >= 0) {
            return ((Instrumentation) obj).getComponentName();
        }
        return null;
    }

    /* renamed from: ۣۣۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1363(Object obj) {
        if (C0379.m5056() >= 0) {
            return C0297.m2674((CharSequence) obj);
        }
        return false;
    }

    /* renamed from: ۣۥۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1364(Object obj) {
        if (C0394.m5672() > 0) {
            return C0138.m1135((CharSequence) obj);
        }
        return false;
    }

    /* renamed from: ۣۥۣۡ, reason: not valid java name and contains not printable characters */
    public static String m1365() {
        if (C0386.m5322() > 0) {
            return "android.content.pm.PackageParser$SigningDetails";
        }
        return null;
    }

    /* renamed from: ۤ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m1366() {
        if (C0121.m1023() < 0) {
            return C0214.f350;
        }
        return null;
    }

    /* renamed from: ۥ۠۠۟, reason: contains not printable characters */
    public static Class[] m1367(Object obj) {
        if (C0384.m5278() >= 0) {
            return ((InterfaceC0145) obj).value();
        }
        return null;
    }

    /* renamed from: ۥۡۡ۟, reason: contains not printable characters */
    public static void m1368(Object obj, boolean z) {
        if (C0385.m5282() <= 0) {
            ((Paint) obj).setAntiAlias(z);
        }
    }

    /* renamed from: ۥۣۡۨ, reason: contains not printable characters */
    public static String m1369() {
        if (C0121.m1023() <= 0) {
            return "android.os.INetworkManagementService$Stub";
        }
        return null;
    }

    /* renamed from: ۥۨ۠ۥ, reason: contains not printable characters */
    public static Context m1370(Object obj) {
        if (C0389.m5481() >= 0) {
            return ((C0340) obj).m2958();
        }
        return null;
    }

    /* renamed from: ۦۤ۠ۤ, reason: contains not printable characters */
    public static int m1371(Object obj, int i) {
        if (C0334.m2866() >= 0) {
            return ((String) obj).indexOf(i);
        }
        return 0;
    }

    /* renamed from: ۦۦۣۤ, reason: contains not printable characters */
    public static String m1372() {
        if (C0378.m4998() > 0) {
            return "803E0E03226AC0F9";
        }
        return null;
    }

    /* renamed from: ۨ۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m1373() {
        if (C0388.m5430() >= 0) {
            return "ACAB82F91A92816EB4A62947FC83AB4F63E8DAFFEEA5B378";
        }
        return null;
    }

    /* renamed from: ۨ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m1374(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۣۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m1375(Object obj) {
        if (C0387.m5374() < 0) {
            C0177.m1395(obj);
        }
    }

    /* renamed from: ۣۨۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1376() {
        if (C0082.m410() <= 0) {
            return "setHiddenApiExemptions";
        }
        return null;
    }

    /* renamed from: ۨۢۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1377(Object obj) {
        if (C0335.m2923() <= 0) {
            return ((InstrumentationC0154) obj).mo1234();
        }
        return false;
    }

    /* renamed from: ۣۨ۟, reason: not valid java name and contains not printable characters */
    public static void m1378(Object obj, float f) throws IOException {
        if (C0376.m4906() > 0) {
            ((DataOutputStream) obj).writeFloat(f);
        }
    }

    /* renamed from: ۣۨۤ, reason: not valid java name and contains not printable characters */
    public static List m1379(Object obj, Object obj2, Object obj3) {
        if (C0155.m1294() < 0) {
            return C0138.m1106((AbstractC0137) obj, (List) obj2, (List) obj3);
        }
        return null;
    }
}
