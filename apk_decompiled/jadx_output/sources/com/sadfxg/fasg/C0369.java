package com.sadfxg.fasg;

import android.app.C0009;
import android.app.Instrumentation;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.content.DialogInterface;
import android.database.C0073;
import android.net.C0083;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.cloudinject.core.C0176;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.utils.C0129;
import com.cloudinject.core.utils.C0138;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.customview.FeatureButton;
import com.cloudinject.feature.model.C0187;
import com.cloudinject.feature.model.C0192;
import com.cloudinject.feature.model.C0195;
import com.cloudinject.feature.model.C0200;
import com.cloudinject.feature.model.C0201;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p016.C0211;
import com.cloudinject.feature.p017.C0215;
import com.cloudinject.feature.p019.C0246;
import com.cloudinject.feature.p019.C0255;
import com.cloudinject.feature.p021.AlertDialogC0273;
import com.cloudinject.feature.p021.AlertDialogC0286;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.AlertDialogC0276;
import com.cloudinject.feature.p021.p022.InterfaceC0275;
import com.cloudinject.feature.p023.AbstractC0313;
import com.cloudinject.feature.p023.C0297;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.feature.p023.p024.AbstractC0307;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0344;
import com.px.C0368;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import mirrorb.RefObject;
import mirrorb.android.accounts.C0375;
import mirrorb.android.app.ActivityThread;
import mirrorb.android.app.ContextImpl;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;

/* renamed from: com.sadfxg.fasg.۟ۧ۟ۦۣ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0369 {

    /* renamed from: ۡۤۢۤ, reason: not valid java name and contains not printable characters */
    public static int f615 = -39;

    /* renamed from: ۟۟۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static String m3218() {
        if (C0390.m5512() > 0) {
            return "1D186817FF6E4F9594857239CC26E52C";
        }
        return null;
    }

    /* renamed from: ۟۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m3219(Object obj, Object obj2) {
        if (C0398.m5833() > 0) {
            return ((C0344) obj).call((Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m3220(Object obj, Object obj2) {
        if (C0191.m1627() < 0) {
            ((AlertDialogC0273) obj).setOnDismissListener((DialogInterface.OnDismissListener) obj2);
        }
    }

    /* renamed from: ۣۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static String m3221() {
        if (C0291.m2568() <= 0) {
            return "byte";
        }
        return null;
    }

    /* renamed from: ۟۠۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static String m3222(String str) {
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

    /* renamed from: ۟۠ۥۦ۟, reason: not valid java name and contains not printable characters */
    public static Bundle m3223(Object obj, Object obj2) {
        if (C0397.m5814() >= 0) {
            return ((Parcel) obj).readBundle((ClassLoader) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۢۡ۟, reason: not valid java name and contains not printable characters */
    public static List m3224(Object obj, Object obj2, Object obj3) {
        if (C0385.m5282() < 0) {
            return C0297.m2644((AbstractC0313<Object>) obj, (List<Object>) obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۟ۡۥۢۥ, reason: not valid java name and contains not printable characters */
    public static String m3225() {
        if (C0362.m3122() <= 0) {
            return C0176.m1384();
        }
        return null;
    }

    /* renamed from: ۟ۡۥۤۦ, reason: not valid java name and contains not printable characters */
    public static void m3226(Object obj, int i) {
        if (C0379.m5056() > 0) {
            ((View) obj).setVisibility(i);
        }
    }

    /* renamed from: ۟ۡۦۤۦ, reason: not valid java name and contains not printable characters */
    public static void m3227(Object obj, Object obj2, Object obj3) {
        if (C0184.m1524() <= 0) {
            ((InterfaceC0275) obj).m2436((String) obj2, (View.OnClickListener) obj3);
        }
    }

    /* renamed from: ۣ۟ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3228(Object obj) {
        if (C0183.m1464() >= 0) {
            return C0297.m2657((Collection<?>) obj);
        }
        return false;
    }

    /* renamed from: ۟ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static RefObject m3229() {
        if (C0385.m5282() <= 0) {
            return ContextImpl.mPackageInfo;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m3230() {
        if (C0370.m3284() < 0) {
            return "D831E7BB9E94ABF4";
        }
        return null;
    }

    /* renamed from: ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m3231(Object obj, Object obj2, Object obj3) {
        if (C0400.m5961() > 0) {
            return ((Instrumentation) obj).onException(obj2, (Throwable) obj3);
        }
        return false;
    }

    /* renamed from: ۟ۥۤۥۤ, reason: not valid java name and contains not printable characters */
    public static String m3232(Object obj) {
        if (C0060.m216() > 0) {
            return ((C0201) obj).m1783();
        }
        return null;
    }

    /* renamed from: ۟ۥۤۦۨ, reason: not valid java name and contains not printable characters */
    public static String m3233() {
        if (C0375.m4840() <= 0) {
            return "27A4FD61C5821BA9842C39B7A5F723E4";
        }
        return null;
    }

    /* renamed from: ۟ۥۦۨۤ, reason: not valid java name and contains not printable characters */
    public static Window m3234(Object obj) {
        if (C0073.m265() >= 0) {
            return ((AlertDialogC0276) obj).getWindow();
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m3235(Object obj, Object obj2) {
        if (C0206.m1807() < 0) {
            ((C0200) obj).setNeutralExt((String) obj2);
        }
    }

    /* renamed from: ۟ۦۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m3236() {
        if (C0184.m1524() <= 0) {
            return "ABE0E02AA611094E693D7AA27004D9476D7BECC94A9E275C";
        }
        return null;
    }

    /* renamed from: ۟ۦۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m3237() {
        if (C0381.m5127() >= 0) {
            return C0211.m1858();
        }
        return null;
    }

    /* renamed from: ۟ۦۧۥ۟, reason: not valid java name and contains not printable characters */
    public static void m3238(Object obj, Object obj2) {
        if (C0397.m5814() > 0) {
            ((C0192) obj).m1677((C0187) obj2);
        }
    }

    /* renamed from: ۟ۧ۟۟۠, reason: not valid java name and contains not printable characters */
    public static C0129 m3239(Object obj) {
        if (C0393.m5668() >= 0) {
            return C0129.m1043((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static String m3240(Object obj) {
        if (C0083.m448() < 0) {
            return ((C0187) obj).getThemeColor();
        }
        return null;
    }

    /* renamed from: ۟ۧۢۢ۟, reason: not valid java name and contains not printable characters */
    public static RefObject m3241() {
        if (C0383.m5203() > 0) {
            return ActivityThread.mBoundApplication;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static void m3242(Object obj, Object obj2) {
        if (C0379.m5056() > 0) {
            ((Instrumentation) obj).sendPointerSync((MotionEvent) obj2);
        }
    }

    /* renamed from: ۟ۧۧۦۣ, reason: not valid java name and contains not printable characters */
    public static String m3243() {
        if (C0390.m5512() > 0) {
            return "D98640EA4A311696";
        }
        return null;
    }

    /* renamed from: ۠ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static String m3244(Object obj) {
        if (C0383.m5203() >= 0) {
            return ((C0195) obj).m1718();
        }
        return null;
    }

    /* renamed from: ۣ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m3245() {
        if (C0396.m5741() < 0) {
            return "F15E2C1A08995427";
        }
        return null;
    }

    /* renamed from: ۣ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m3246() {
        if (C0083.m448() <= 0) {
            return "3577B6E635644962CAD4AD27EFB65A2D";
        }
        return null;
    }

    /* renamed from: ۠ۥ۠۟, reason: not valid java name and contains not printable characters */
    public static int m3247(Object obj, int i) {
        if (C0335.m2923() < 0) {
            return ((SparseArray) obj).keyAt(i);
        }
        return 0;
    }

    /* renamed from: ۠ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m3248(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۣۡ۟۠, reason: not valid java name and contains not printable characters */
    public static Map m3249(Object obj) {
        if (C0394.m5672() > 0) {
            return ((C0246) obj).f418;
        }
        return null;
    }

    /* renamed from: ۡۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m3250(Object obj, Object obj2, Object obj3) {
        if (C0368.m3171() <= 0) {
            C0215.lambda$9birpDhrW5iM1kk1CVKR5t9GCm0((String) obj, (Map) obj2, (AbstractC0307) obj3);
        }
    }

    /* renamed from: ۡۧۢ۠, reason: not valid java name and contains not printable characters */
    public static String m3251() {
        if (C0384.m5278() >= 0) {
            return "android.app.IActivityManager";
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3252(Object obj) {
        if (C0398.m5833() >= 0) {
            return C0297.m2659((long[]) obj);
        }
        return false;
    }

    /* renamed from: ۣۡۤ۠, reason: not valid java name and contains not printable characters */
    public static String m3253() {
        if (C0400.m5961() > 0) {
            return "F955D6CD6E76262AB26C4420649E0613BEB077357DFB74DE735C91ED866341DA";
        }
        return null;
    }

    /* renamed from: ۣۢۡۥ, reason: not valid java name and contains not printable characters */
    public static int m3254(Object obj) {
        if (C0394.m5672() >= 0) {
            return ((Bundle) obj).size();
        }
        return 0;
    }

    /* renamed from: ۣۥۦۧ, reason: not valid java name and contains not printable characters */
    public static List m3255(int i, Object obj) {
        if (C0291.m2568() < 0) {
            return C0138.m1101(i, (List) obj);
        }
        return null;
    }

    /* renamed from: ۣۦۡۤ, reason: not valid java name and contains not printable characters */
    public static int m3256() {
        return 1751764 ^ C0395.m5690((Object) "ۤۥۤ");
    }

    /* renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static String m3257() {
        if (C0009.m36() < 0) {
            return "android.app.IApplicationThread";
        }
        return null;
    }

    /* renamed from: ۥۢۦۤ, reason: contains not printable characters */
    public static void m3258(Object obj, Object obj2) {
        if (C0335.m2923() < 0) {
            ((AlertDialogC0286) obj).setView((View) obj2);
        }
    }

    /* renamed from: ۥۥۤۡ, reason: contains not printable characters */
    public static String m3259() {
        if (C0025.m118() > 0) {
            return "KbMMxfM";
        }
        return null;
    }

    /* renamed from: ۦۣۦۤ, reason: contains not printable characters */
    public static String m3260() {
        if (C0400.m5961() > 0) {
            return "android.content.pm.PackageParser$Permission";
        }
        return null;
    }

    /* renamed from: ۦۦۡۨ, reason: contains not printable characters */
    public static String m3261() {
        if (C0399.m5914() >= 0) {
            return "C749D033AFE42204C50F7DDCD8F0565800DB62E255463F18CD1C0D0504AD5A87";
        }
        return null;
    }

    /* renamed from: ۦۨۢۧ, reason: contains not printable characters */
    public static void m3262(Object obj, int i) {
        if (C0382.m5180() >= 0) {
            ((FeatureButton) obj).setTextColor(i);
        }
    }

    /* renamed from: ۣۧۡ۠, reason: not valid java name and contains not printable characters */
    public static String m3263() {
        if (C0206.m1807() <= 0) {
            return "CEFDF5660E4D8517";
        }
        return null;
    }

    /* renamed from: ۣۧۢۢ, reason: not valid java name and contains not printable characters */
    public static C0195 m3264(Object obj) {
        if (C0397.m5814() > 0) {
            return ((C0192) obj).m1688();
        }
        return null;
    }

    /* renamed from: ۣۧۤۢ, reason: not valid java name and contains not printable characters */
    public static Object m3265(Object obj, Object obj2) {
        if (C0386.m5322() >= 0) {
            return ((Bundle) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۧۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3266(Object obj, Object obj2) {
        if (m3256() >= 0) {
            return ((C0255) obj).m2277((Context) obj2);
        }
        return false;
    }

    /* renamed from: ۨۧۥۨ, reason: not valid java name and contains not printable characters */
    public static float m3267(Object obj) {
        if (C0396.m5741() < 0) {
            return ((Parcel) obj).readFloat();
        }
        return 0.0f;
    }
}
