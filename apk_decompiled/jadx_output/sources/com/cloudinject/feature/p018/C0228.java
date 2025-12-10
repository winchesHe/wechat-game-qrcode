package com.cloudinject.feature.p018;

import android.accounts.Account;
import android.app.Activity;
import android.app.C0009;
import android.app.Instrumentation;
import android.arch.p003.p005.C0060;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.PeriodicSync;
import android.database.C0073;
import android.database.C0074;
import android.net.C0083;
import android.net.Uri;
import android.os.Message;
import android.provider.DocumentsContract;
import android.provider.Settings;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.C0176;
import com.cloudinject.core.p009.C0152;
import com.cloudinject.core.p009.p010.C0151;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.BuildCompat;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.C0185;
import com.cloudinject.feature.model.C0187;
import com.cloudinject.feature.model.C0188;
import com.cloudinject.feature.model.C0192;
import com.cloudinject.feature.model.C0200;
import com.cloudinject.feature.model.RemoteShareInfo;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p019.C0257;
import com.cloudinject.feature.p021.AbstractC0289;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p023.C0297;
import com.cloudinject.feature.p023.C0331;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0362;
import com.sadfxg.fasg.App;
import com.sadfxg.fasg.C0369;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Set;
import mirrorb.RefLong;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import org.json.JSONObject;

/* renamed from: com.cloudinject.feature.̗̗.۟ۦۣۤۥ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0228 {

    /* renamed from: ۟ۧ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int f382 = -92;

    /* renamed from: ۟۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static BuildCompat.ROMType m1978() {
        if (C0388.m5430() >= 0) {
            return BuildCompat.ROMType.VIVO;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m1979() {
        if (C0184.m1524() <= 0) {
            return "B95C2A929A9FD5A7CFD2C19662D4D8E2";
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m1980() {
        if (C0088.m573() >= 0) {
            return "C8721ECEE5722052F77953B9C62900B67F6949A18A9841C7";
        }
        return null;
    }

    /* renamed from: ۟۠ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static String m1981() {
        if (C0073.m265() >= 0) {
            return "FB0EA09AC009DA48B1402CC3F5DC830EE4E734AD29EACF310091FCF8F9AAC3BC";
        }
        return null;
    }

    /* renamed from: ۟۠ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static void m1982(Object obj, Object obj2) {
        if (C0379.m5056() >= 0) {
            ((PrintStream) obj).println((String) obj2);
        }
    }

    /* renamed from: ۟ۡۡۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1983(Object obj, Object obj2) {
        if (C0384.m5278() >= 0) {
            return DocumentsContract.isDocumentUri((Context) obj, (Uri) obj2);
        }
        return false;
    }

    /* renamed from: ۣ۟ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static int m1984(Object obj) {
        if (C0206.m1807() < 0) {
            return C0297.m2689((Object[]) obj);
        }
        return 0;
    }

    /* renamed from: ۟ۡۥ۟۟, reason: not valid java name and contains not printable characters */
    public static String m1985(Object obj) {
        if (C0393.m5668() > 0) {
            return ((RemoteShareInfo) obj).getTitle();
        }
        return null;
    }

    /* renamed from: ۟ۡۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m1986() {
        if (C0399.m5914() > 0) {
            return "com.android.internal.telephony.ITelephonyRegistry";
        }
        return null;
    }

    /* renamed from: ۟ۢۡۤۥ, reason: not valid java name and contains not printable characters */
    public static String m1987() {
        if (C0389.m5481() >= 0) {
            return "7BE95BB408B3958CA14EAA5277609E5954FF69021688CFEDCCF14BC9B890265A";
        }
        return null;
    }

    /* renamed from: ۟ۢۢۡۡ, reason: not valid java name and contains not printable characters */
    public static Pair m1988(Object obj, Object obj2) {
        if (C0385.m5282() < 0) {
            return Pair.create(obj, obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۤۦ۟, reason: not valid java name and contains not printable characters */
    public static void m1989(Object obj, Object obj2, long j) {
        if (C0394.m5672() > 0) {
            ((RefLong) obj).set(obj2, j);
        }
    }

    /* renamed from: ۟ۢۦۣۦ, reason: not valid java name and contains not printable characters */
    public static Activity m1990(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0400.m5961() > 0) {
            return ((Instrumentation) obj).newActivity((ClassLoader) obj2, (String) obj3, (Intent) obj4);
        }
        return null;
    }

    /* renamed from: ۟ۢۨۢۨ, reason: not valid java name and contains not printable characters */
    public static String m1991() {
        if (C0009.m36() < 0) {
            return "B2528FFF4F0FF3F0";
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m1992() {
        if (C0396.m5741() < 0) {
            return "getRuntime";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1993(Object obj) {
        if (C0083.m448() <= 0) {
            return ((C0176) obj).m1391();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static void m1994(Object obj) {
        if (C0060.m216() > 0) {
            ((C0151) obj).init();
        }
    }

    /* renamed from: ۣ۟ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static String m1995(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۟ۤۢۡۥ, reason: not valid java name and contains not printable characters */
    public static String m1996() {
        if (C0397.m5814() >= 0) {
            return "805DC61EDA235195E08E2B9BAEA3D64FE4CAEDE81E02921AF5E92E609F9E764771DE2A73DE3A4D814F8FC1561DF692783BF8785C05CD18A03B4843384D2724C1630EEC6339993691BF605B9BE61B0C39";
        }
        return null;
    }

    /* renamed from: ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static String m1997() {
        if (C0376.m4906() > 0) {
            return "4E6C33CC2225B4CA3181A694DDA0B783B005462FBE5D7514";
        }
        return null;
    }

    /* renamed from: ۟ۤۧۦۧ, reason: not valid java name and contains not printable characters */
    public static String m1998() {
        if (m2012() > 0) {
            return "android.media.MediaRouter$Static";
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m1999() {
        if (C0088.m573() > 0) {
            return "137A16D0AA2DD7EE";
        }
        return null;
    }

    /* renamed from: ۟ۥۤۢۨ, reason: not valid java name and contains not printable characters */
    public static String m2000() {
        if (C0074.m307() < 0) {
            return "C98DCD01A14E341D";
        }
        return null;
    }

    /* renamed from: ۟ۥۤۨۤ, reason: not valid java name and contains not printable characters */
    public static String m2001() {
        if (C0378.m4998() > 0) {
            return "android.os.StrictMode";
        }
        return null;
    }

    /* renamed from: ۟ۥۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static C0200 m2002(Object obj) {
        if (C0385.m5282() < 0) {
            return C0200.m1756((JSONObject) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۢۥ, reason: not valid java name and contains not printable characters */
    public static void m2003(Object obj, long j) {
        if (C0179.m1427() > 0) {
            ((C0188) obj).m1610(j);
        }
    }

    /* renamed from: ۟ۦۣۢۦ, reason: not valid java name and contains not printable characters */
    public static void m2004(Object obj) {
        if (m2012() >= 0) {
            C0331.m2829((String) obj);
        }
    }

    /* renamed from: ۟ۦۣۤۦ, reason: not valid java name and contains not printable characters */
    public static void m2005(Object obj, int i) {
        if (C0362.m3122() < 0) {
            ((C0185) obj).setType(i);
        }
    }

    /* renamed from: ۟ۦۦۦۤ, reason: not valid java name and contains not printable characters */
    public static String m2006() {
        if (C0191.m1627() <= 0) {
            return "2C670D8DE3CF72F34E7A3F6FDDB5365B";
        }
        return null;
    }

    /* renamed from: ۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static C0257 m2007() {
        if (C0179.m1427() >= 0) {
            return C0257.m2294();
        }
        return null;
    }

    /* renamed from: ۡۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m2008(Object obj) {
        if (C0291.m2568() < 0) {
            ((AbstractC0289) obj).onCreate();
        }
    }

    /* renamed from: ۡۥۦۤ, reason: not valid java name and contains not printable characters */
    public static String m2009() {
        if (C0400.m5961() > 0) {
            return "50A1CFACDA1251B7";
        }
        return null;
    }

    /* renamed from: ۡۦۢۤ, reason: not valid java name and contains not printable characters */
    public static Object[] m2010(Object obj, Object obj2) {
        if (C0291.m2568() <= 0) {
            return ((Set) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ۣۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m2011(Object obj) {
        if (C0384.m5278() >= 0) {
            return ((RemoteShareInfo) obj).getNeutralText();
        }
        return null;
    }

    /* renamed from: ۣۢۨ, reason: not valid java name and contains not printable characters */
    public static int m2012() {
        return 1752568 ^ C0395.m5690((Object) "ۥۡۦ");
    }

    /* renamed from: ۢۤۤۦ, reason: not valid java name and contains not printable characters */
    public static String m2013() {
        if (C0089.m592() > 0) {
            return "2ADFAB91DFF1C8C9195C18FD780C8C510D85BB8FFE8957C3";
        }
        return null;
    }

    /* renamed from: ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static C0152 m2014() {
        if (C0086.m500() > 0) {
            return C0152.m1247();
        }
        return null;
    }

    /* renamed from: ۢۨۦۦ, reason: not valid java name and contains not printable characters */
    public static File m2015(Object obj) {
        if (C0179.m1427() > 0) {
            return ((Context) obj).getExternalCacheDir();
        }
        return null;
    }

    /* renamed from: ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m2016() {
        if (C0229.m2064() <= 0) {
            return "07624E2EA5FF6B0051197838FD91ED1C1F141C638E36C783";
        }
        return null;
    }

    /* renamed from: ۤ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m2017(Object obj, Object obj2) {
        if (C0183.m1464() > 0) {
            return Settings.System.getString((ContentResolver) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۢۥۣ, reason: contains not printable characters */
    public static String m2018(String str) {
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

    /* renamed from: ۥۥۢ۟, reason: contains not printable characters */
    public static String m2019() {
        if (C0089.m592() >= 0) {
            return App.APP_ID;
        }
        return null;
    }

    /* renamed from: ۦ۠ۧ۠, reason: contains not printable characters */
    public static FileChannel m2020(Object obj) {
        if (C0089.m592() >= 0) {
            return ((FileInputStream) obj).getChannel();
        }
        return null;
    }

    /* renamed from: ۦۣ۠ۧ, reason: contains not printable characters */
    public static Class[] m2021(Object obj) {
        if (C0074.m307() < 0) {
            return ((Method) obj).getParameterTypes();
        }
        return null;
    }

    /* renamed from: ۦۤۦ۠, reason: contains not printable characters */
    public static String m2022() {
        if (C0390.m5512() > 0) {
            return "handleCrash: ";
        }
        return null;
    }

    /* renamed from: ۦۤۧۥ, reason: contains not printable characters */
    public static Annotation m2023(Object obj, Object obj2) {
        if (C0381.m5127() > 0) {
            return ((Field) obj).getAnnotation((Class) obj2);
        }
        return null;
    }

    /* renamed from: ۦۧۤۧ, reason: contains not printable characters */
    public static Object[] m2024(Object obj, Object obj2) {
        if (C0060.m216() > 0) {
            return ((ArrayList) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ۧۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static C0187 m2025(Object obj) {
        if (C0369.m3256() >= 0) {
            return ((C0192) obj).m1687();
        }
        return null;
    }

    /* renamed from: ۣۧۨ۠, reason: not valid java name and contains not printable characters */
    public static String m2026() {
        if (C0229.m2064() < 0) {
            return "42845300EA9C1428080C68DB34E4A91A";
        }
        return null;
    }

    /* renamed from: ۧۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m2027(Object obj) {
        if (C0381.m5127() >= 0) {
            ((Message) obj).sendToTarget();
        }
    }

    /* renamed from: ۧۦۢۨ, reason: not valid java name and contains not printable characters */
    public static Account m2028(Object obj) {
        if (C0060.m216() > 0) {
            return ((PeriodicSync) obj).account;
        }
        return null;
    }

    /* renamed from: ۨ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static View m2029(Object obj, int i, Object obj2, boolean z) {
        if (C0385.m5282() <= 0) {
            return ((LayoutInflater) obj).inflate(i, (ViewGroup) obj2, z);
        }
        return null;
    }

    /* renamed from: ۨۦۧ۟, reason: not valid java name and contains not printable characters */
    public static String m2030() {
        if (C0335.m2923() < 0) {
            return "Serialization of this object is not allowed";
        }
        return null;
    }
}
