package com.cloudinject.customview;

import android.app.C0009;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.content.Intent;
import android.content.PeriodicSync;
import android.content.pm.Signature;
import android.database.C0073;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.versionedparcelable.VersionedParcel;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.feature.model.C0187;
import com.cloudinject.feature.model.C0194;
import com.cloudinject.feature.model.C0195;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p021.AbstractC0289;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p021.p022.InterfaceC0275;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.p026.C0346;
import com.sadfxg.fasg.C0370;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectStreamClass;
import java.util.Collection;
import java.util.List;
import mirrorb.RefObject;
import mirrorb.RefStaticMethod;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.BaseBundle;
import mirrorb.android.os.ServiceManager;
import mirrorb.android.os.mount.C0390;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import org.json.JSONObject;
import p027.p028.p029.C0420;

/* renamed from: com.cloudinject.customview.ۦۤۤۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0184 {

    /* renamed from: ۟۠۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean f252;

    /* renamed from: ۣ۟۟۠۠, reason: not valid java name and contains not printable characters */
    public static RefStaticMethod m1505() {
        if (C0060.m216() >= 0) {
            return ServiceManager.getService;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static C0195 m1506(Object obj) {
        if (C0086.m500() > 0) {
            return C0195.m1713((JSONObject) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static View m1507(Object obj, int i) {
        if (C0400.m5961() > 0) {
            return ((View) obj).findViewById(i);
        }
        return null;
    }

    /* renamed from: ۟ۡۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m1508(Object obj, Object obj2) {
        if (C0206.m1807() <= 0) {
            ((Paint) obj).setStyle((Paint.Style) obj2);
        }
    }

    /* renamed from: ۟ۡۦۧۥ, reason: not valid java name and contains not printable characters */
    public static String m1509() {
        if (C0346.m3059() <= 0) {
            return "libcore.io.Os";
        }
        return null;
    }

    /* renamed from: ۟ۢۢۨۡ, reason: not valid java name and contains not printable characters */
    public static Intent m1510(Object obj, Object obj2, Object obj3) {
        if (C0279.m2491() < 0) {
            return ((Intent) obj).setClass((Context) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۧۨۤ, reason: not valid java name and contains not printable characters */
    public static int m1511(Object obj) {
        if (C0370.m3284() <= 0) {
            return ((Signature) obj).hashCode();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static String m1512() {
        if (C0376.m4906() >= 0) {
            return "BD4567619649E3D124654A74BEC7D9908022F141AFFF8DB9F2848701D5BFDD58";
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1513(Object obj, Object obj2) {
        if (C0420.m6215() < 0) {
            return ((List) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۤۡ۟۟, reason: not valid java name and contains not printable characters */
    public static String m1514(Object obj) {
        if (C0398.m5833() > 0) {
            return ((ObjectStreamClass) obj).getName();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m1515() {
        if (C0335.m2923() <= 0) {
            return "short";
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static void m1516(Object obj) {
        if (C0086.m500() > 0) {
            ((AbstractC0289) obj).onStop();
        }
    }

    /* renamed from: ۟ۥۢۥۤ, reason: not valid java name and contains not printable characters */
    public static String m1517(int i) {
        if (C0088.m573() >= 0) {
            return Integer.toHexString(i);
        }
        return null;
    }

    /* renamed from: ۟ۦۤۧۨ, reason: not valid java name and contains not printable characters */
    public static int[] m1518(Object obj) {
        if (C0086.m500() > 0) {
            return ((Parcel) obj).createIntArray();
        }
        return null;
    }

    /* renamed from: ۟ۧۥۦ۟, reason: not valid java name and contains not printable characters */
    public static String m1519() {
        if (C0390.m5512() >= 0) {
            return "A8B3935A5AF942C8E6B4307C0B594BCA2947B9CE575A82ABD1E43B3C432527EF767C08ABC0AE81840EBECEBB5DFE3E2D";
        }
        return null;
    }

    /* renamed from: ۟ۧۦۦۥ, reason: not valid java name and contains not printable characters */
    public static void m1520(Object obj) throws IOException {
        if (C0228.m2012() > 0) {
            ((BufferedWriter) obj).flush();
        }
    }

    /* renamed from: ۠۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static RefObject m1521() {
        if (C0183.m1464() > 0) {
            return BaseBundle.mParcelledData;
        }
        return null;
    }

    /* renamed from: ۡۦۣ۠, reason: not valid java name and contains not printable characters */
    public static void m1522(Object obj, Object obj2, int i) {
        if (C0206.m1807() <= 0) {
            ((VersionedParcel) obj).writeParcelable((Parcelable) obj2, i);
        }
    }

    /* renamed from: ۤ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1523(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۤۡۤ۟, reason: not valid java name and contains not printable characters */
    public static int m1524() {
        return (-1746801) ^ C0395.m5690((Object) "۟ۡۥ");
    }

    /* renamed from: ۣۤۧۧ, reason: not valid java name and contains not printable characters */
    public static int m1525(Object obj) {
        if (C0121.m1023() < 0) {
            return ((C0187) obj).getActionType();
        }
        return 0;
    }

    /* renamed from: ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static long m1526(Object obj) {
        if (C0378.m4998() >= 0) {
            return ((PeriodicSync) obj).period;
        }
        return 0L;
    }

    /* renamed from: ۤۨۥۥ, reason: not valid java name and contains not printable characters */
    public static void m1527(Object obj, int i) {
        if (C0420.m6215() <= 0) {
            ((C0194) obj).m1710(i);
        }
    }

    /* renamed from: ۥ۠ۧۥ, reason: contains not printable characters */
    public static String m1528(String str) {
        String strM5220 = C0383.m5220();
        String strM52202 = C0383.m5220();
        for (int i = 0; i < 15; i++) {
            strM5220 = C0378.m5011(C0386.m5329(C0386.m5329(new StringBuffer(), strM5220), m1517(i)));
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

    /* renamed from: ۦۤۨ, reason: contains not printable characters */
    public static void m1529(Object obj, int i) {
        if (C0394.m5672() > 0) {
            ((C0187) obj).m1601(i);
        }
    }

    /* renamed from: ۦۧۤۤ, reason: contains not printable characters */
    public static boolean m1530(Object obj, Object obj2) {
        if (C0073.m265() >= 0) {
            return ((Collection) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: ۦۨۤۦ, reason: contains not printable characters */
    public static void m1531(Object obj, Object obj2) {
        if (C0377.m4944() > 0) {
            ((InterfaceC0275) obj).setTitle((String) obj2);
        }
    }
}
