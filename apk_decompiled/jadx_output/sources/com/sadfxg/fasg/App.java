package com.sadfxg.fasg;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.wifi.C0078;
import android.os.Handler;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import androidx.core.view.InputDeviceCompat;
import com.cloudinject.core.p009.p011.C0155;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.C0210;
import com.cloudinject.feature.C0336;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.feature.p023.C0334;
import com.cloudinject.feature.p023.C0335;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.app.servertransaction.C0378;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.os.mount.C0390;
import mirrorb.android.providers.C0391;
import mirrorb.android.rms.C0392;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.dalvik.system.C0399;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes6.dex */
public class App extends Application {
    public static String A = "a00bcabddb387905c4e3b917042db1efcf5e1c4813fa5e84858912b534a925a7";
    public static String ACTIVITY = "";
    public static int API_VERSION = 1;
    public static String APP_ID = "a8614eda8ba24c7e0000242d50cf1fff";
    public static String INCREMENT_DATA = "09c745e38497aeb4";
    public static int PLATFORM = 2;
    public static String PLUGIN_VERIFY = "1b30a96bc56458d6f0ebaace72d6a300";
    public static String RS = "WfNqAydtGZ";
    public static final String TAG = "App";
    public static int VERSION_CODE = 23;
    public static String VERSION_NAME = "2.3";
    public static IvParameterSpec iv;
    public static DESKeySpec keySpec;
    public static List<Activity> sActivities;
    public static ExecutorService sExecutorService;
    public static SecretKey secretKey;

    /* renamed from: ̗̖̗̗̗̗̖, reason: not valid java name and contains not printable characters */
    private static Context f613;

    /* renamed from: ̙̖̙̖̖̖̙, reason: not valid java name and contains not printable characters */
    private static App f614;

    static {
        String str = "ۣۡ۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748647) {
                case 34:
                    sActivities = new ArrayList();
                    if (C0389.m5481() > 0) {
                        str = "ۣۡۤ";
                        break;
                    } else {
                        str = "ۢۡۧ";
                        break;
                    }
                case 421:
                    sExecutorService = C0392.m5625();
                    if (C0191.m1627() < 0) {
                        str = "۟۠ۢ";
                        break;
                    } else {
                        C0384.m5278();
                        break;
                    }
                case 2438:
                    return;
                case 1733317:
                    str = "ۣۡ۟";
                    break;
            }
        }
    }

    public static Context getContext() {
        return m3214();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0093 A[SYNTHETIC] */
    /* renamed from: ̖̖̖̖, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3199(java.lang.String r7) {
        /*
            r6 = this;
            r1 = 0
            java.lang.String r0 = "ۤۦۧ"
            r3 = r1
            r4 = r1
        L5:
            int r2 = mirrorb.com.android.internal.content.C0395.m5690(r0)
            r5 = 1753570(0x1ac1e2, float:2.457275E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 903: goto L11;
                case 962: goto L9c;
                case 992: goto L8d;
                case 1061: goto L6e;
                case 2346: goto L4c;
                case 26233: goto L61;
                case 26302: goto La0;
                case 27192: goto L1f;
                case 28350: goto L3d;
                case 28523: goto Lbd;
                case 31559: goto L79;
                case 31749: goto L34;
                case 31752: goto Lb3;
                case 1711519: goto La0;
                case 1711520: goto L1a;
                default: goto L10;
            }
        L10:
            goto L5
        L11:
            javax.crypto.spec.DESKeySpec r2 = com.cloudinject.customview.C0183.m1476()     // Catch: java.lang.Exception -> La4
            if (r2 == 0) goto L8d
            java.lang.String r0 = "ۥۢۤ"
            goto L5
        L1a:
            com.sadfxg.fasg.App.keySpec = r3     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = "۠ۨۢ"
            goto L5
        L1f:
            java.lang.String r0 = com.px.C0368.m3185()     // Catch: java.lang.Exception -> La4
            javax.crypto.SecretKeyFactory r0 = com.cloudinject.core.p013.C0179.m1416(r0)     // Catch: java.lang.Exception -> La4
            javax.crypto.spec.DESKeySpec r2 = com.cloudinject.customview.C0183.m1476()     // Catch: java.lang.Exception -> La4
            javax.crypto.SecretKey r0 = com.cloudinject.feature.p015.C0206.m1816(r0, r2)     // Catch: java.lang.Exception -> La4
            com.sadfxg.fasg.App.secretKey = r0     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = "۟ۤ۠"
            goto L5
        L34:
            javax.crypto.spec.IvParameterSpec r2 = com.cloudinject.customview.C0183.m1469()     // Catch: java.lang.Exception -> La4
            if (r2 == 0) goto L8d
            java.lang.String r0 = "ۡۦۡ"
            goto L5
        L3d:
            javax.crypto.SecretKey r2 = com.cloudinject.feature.p018.C0229.m2036()     // Catch: java.lang.Exception -> La4
            if (r2 != 0) goto La0
            int r2 = mirrorb.android.media.session.C0386.m5322()
            if (r2 <= 0) goto L5
            java.lang.String r0 = "ۨ۟۟"
            goto L5
        L4c:
            javax.crypto.spec.DESKeySpec r2 = new javax.crypto.spec.DESKeySpec     // Catch: java.lang.Exception -> La4
            byte[] r5 = com.cloudinject.core.utils.compat.C0121.m985(r7, r4)     // Catch: java.lang.Exception -> La4
            r2.<init>(r5)     // Catch: java.lang.Exception -> La4
            int r3 = android.database.C0073.m265()
            if (r3 > 0) goto L5d
            r3 = r2
            goto L5
        L5d:
            java.lang.String r0 = "ۢۤ"
            r3 = r2
            goto L5
        L61:
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> La4
            byte[] r0 = com.cloudinject.core.utils.compat.C0121.m985(r7, r4)     // Catch: java.lang.Exception -> La4
            r2.<init>(r0)     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = "ۧۥۥ"
            r1 = r2
            goto L5
        L6e:
            com.sadfxg.fasg.App.iv = r1     // Catch: java.lang.Exception -> La4
            int r2 = mirrorb.android.media.session.C0386.m5322()
            if (r2 <= 0) goto L5
            java.lang.String r0 = "ۡ۟ۧ"
            goto L5
        L79:
            java.lang.String r2 = com.cloudinject.core.p009.p012.C0164.m1342()
            int r0 = com.cloudinject.p025.C0362.m3122()
            if (r0 < 0) goto L88
            java.lang.String r0 = "ۣۡ۟"
            r4 = r2
            goto L5
        L88:
            java.lang.String r0 = "ۦۨۧ"
            r4 = r2
            goto L5
        L8d:
            int r2 = mirrorb.android.accounts.C0376.m4906()
            if (r2 > 0) goto L98
            mirrorb.com.android.internal.C0398.m5833()
            goto L5
        L98:
            java.lang.String r0 = "ۨ۟۟"
            goto L5
        L9c:
            java.lang.String r0 = "ۤۦۧ"
            goto L5
        La0:
            java.lang.String r0 = "ۡ۟ۧ"
            goto L5
        La4:
            r0 = move-exception
            int r0 = mirrorb.android.content.res.C0379.m5056()
            if (r0 > 0) goto Laf
            java.lang.String r0 = "۠ۧۦ"
            goto L5
        Laf:
            java.lang.String r0 = "۟ۢ۟"
            goto L5
        Lb3:
            int r2 = mirrorb.android.content.C0380.m5068()
            if (r2 <= 0) goto L5
            java.lang.String r0 = "ۦۨۧ"
            goto L5
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sadfxg.fasg.App.m3199(java.lang.String):void");
    }

    /* renamed from: ̗̖̖̖, reason: not valid java name and contains not printable characters */
    private void m3200(Context context) {
        Exception e = null;
        boolean zM5699 = false;
        String str = "ۨۦ۟";
        StringBuilder sb = null;
        StringBuilder sb2 = null;
        File file = null;
        File file2 = null;
        String str2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748615) {
                case 66:
                case 6533:
                    if (C0089.m592() <= 0) {
                        str = "ۢۥۧ";
                    } else {
                        str = "ۧ۟ۦ";
                        continue;
                    }
                case 388:
                    C0060.m211(sb2, str2);
                    if (C0362.m3122() >= 0) {
                        C0121.m1023();
                    } else {
                        str = "ۡۧ";
                        continue;
                    }
                case 411:
                    C0379.m5017(C0334.m2895(), context);
                    if (C0399.m5914() <= 0) {
                        C0379.m5056();
                    } else {
                        str = "ۣ۟ۡ";
                        continue;
                    }
                case 441:
                    try {
                        String strM5153 = C0382.m5153();
                        File fileM5047 = C0379.m5047(context);
                        if (C0395.m5698() >= 0) {
                            file = fileM5047;
                            str2 = strM5153;
                        } else {
                            str = "ۣ۟ۦ";
                            file = fileM5047;
                            str2 = strM5153;
                            continue;
                        }
                    } catch (Exception e2) {
                        if (C0346.m3059() < 0) {
                            str = "ۦۧ";
                        }
                    }
                case 454:
                    if (C0370.m3284() < 0) {
                        str = "۟ۦۢ";
                    } else {
                        continue;
                    }
                case 484:
                    zM5699 = C0395.m5699(C0206.m1806(C0377.m4932(sb)), C0392.m5614());
                    if (C0400.m5961() > 0) {
                        str = "۟ۦۢ";
                    } else {
                        continue;
                    }
                case 1121:
                    C0060.m211(sb, C0388.m5447(file2));
                    str = "ۥۣۥ";
                    continue;
                case 1304:
                    try {
                        C0179.m1441(C0009.m38(C0388.m5427(context), C0379.m5059()), file2);
                        str = "۟۠ۥ";
                        continue;
                    } catch (Throwable th) {
                        str = "ۢۤ";
                    }
                case 1343:
                case 5262:
                case 1733190:
                case 1733372:
                    if (C0380.m5068() <= 0) {
                        str = "ۢۥۢ";
                    } else {
                        str = "ۣۥۤ";
                        continue;
                    }
                case 1446:
                case 1733317:
                    if (C0184.m1524() >= 0) {
                        C0391.m5571();
                        str = "۟ۡۤ";
                    } else {
                        str = "۟۠ۥ";
                        continue;
                    }
                case 1671:
                    if (C0184.m1524() >= 0) {
                        C0334.m2866();
                    } else {
                        str = "۠ۧ۟";
                        continue;
                    }
                case 2309:
                    StringBuilder sb3 = new StringBuilder();
                    if (C0377.m4944() <= 0) {
                        sb2 = sb3;
                    } else {
                        str = "ۣۡۥ";
                        sb2 = sb3;
                        continue;
                    }
                case 2396:
                    if (zM5699) {
                        break;
                    } else if (C0073.m265() <= 0) {
                        C0184.m1524();
                    } else {
                        str = "ۢۧ۠";
                    }
                case 2467:
                    try {
                        C0179.m1441(C0009.m38(C0388.m5427(context), C0088.m563()), file2);
                        if (C0334.m2866() <= 0) {
                            C0291.m2568();
                        } else {
                            str = "ۧ۟ۦ";
                            continue;
                        }
                    } catch (Throwable th2) {
                        str = C0385.m5282() >= 0 ? "ۣ۟۟" : "ۣۧۦ";
                    }
                case 2554:
                    try {
                        C0155.m1302(C0334.m2895(), file2);
                        if (C0335.m2923() < 0) {
                            str = "۟ۧۨ";
                        } else {
                            continue;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        if (C0378.m4998() > 0) {
                            str = "ۦۢۡ";
                        }
                    }
                case 4224:
                    C0060.m211(sb, C0228.m2019());
                    if (C0369.m3256() <= 0) {
                        str = "۠ۨۦ";
                    } else {
                        str = "ۡۦۨ";
                        continue;
                    }
                case 4225:
                    str = "۠ۦۥ";
                    continue;
                case 5177:
                    C0375.m4853(C0420.m6250(), C0397.m5765(C0229.m2043(), e));
                    if (C0382.m5180() <= 0) {
                        str = "ۤ۟ۨ";
                    } else {
                        str = "ۣۥۤ";
                        continue;
                    }
                case 6213:
                    return;
                case 7612:
                    str = "ۤ۟";
                    continue;
                case 26406:
                    str = "ۡۥۢ";
                    continue;
                case 26537:
                    File file3 = new File(file, C0377.m4932(sb2));
                    if (C0346.m3059() >= 0) {
                        C0382.m5180();
                        file2 = file3;
                    } else {
                        str = "۠ۦۥ";
                        file2 = file3;
                        continue;
                    }
                case 27456:
                    C0078.m344(e);
                    if (C0388.m5430() <= 0) {
                        str = "ۤۢۡ";
                    } else {
                        str = "ۤۧۡ";
                        continue;
                    }
                case 27529:
                    StringBuilder sb4 = new StringBuilder();
                    if (C0060.m216() <= 0) {
                        sb = sb4;
                    } else {
                        str = "۠۠ۦ";
                        sb = sb4;
                        continue;
                    }
                case 27593:
                    str = "ۡۥۢ";
                    continue;
                case 27791:
                    str = "ۨۦ۟";
                    continue;
                case 28449:
                    break;
                case 28450:
                    str = "ۧۥۥ";
                    continue;
                case 28619:
                    if (C0383.m5203() > 0) {
                        str = "۟ۧۨ";
                    } else {
                        continue;
                    }
                case 1733281:
                    C0060.m211(sb2, C0291.m2570());
                    if (C0386.m5322() <= 0) {
                        C0370.m3284();
                    } else {
                        str = "ۨۢۨ";
                        continue;
                    }
            }
            str = "ۡۤ۟";
        }
    }

    /* renamed from: ̗̖̙̖, reason: not valid java name and contains not printable characters */
    private void m3201(Context context) {
        String str = "ۢۦۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753576) {
                case 28338:
                    m3209(this, context);
                    if (C0083.m448() >= 0) {
                        break;
                    } else {
                        str = "ۣۤ";
                        break;
                    }
                case 29430:
                    m3215(this, context);
                    if (C0179.m1427() > 0) {
                        str = "ۡۦ۟";
                        break;
                    } else {
                        C0228.m2012();
                        break;
                    }
                case 30452:
                    if (C0380.m5068() <= 0) {
                        break;
                    } else {
                        str = "ۢۦۢ";
                        break;
                    }
                case 1711511:
                    return;
            }
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 49, insns: 0 */
    /* renamed from: ̗̗̖̖̙̗, reason: not valid java name and contains not printable characters */
    private static /* synthetic */ void m3202() {
        String str = "ۣۣۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746943) {
                case 2362:
                    if (C0191.m1627() < 0) {
                        str = "ۨ۠";
                        break;
                    } else {
                        C0388.m5430();
                        str = "ۨ۠ۦ";
                        break;
                    }
                case 4445:
                    if (C0396.m5741() >= 0) {
                        break;
                    } else {
                        str = "ۧۨ";
                        break;
                    }
                case 5314:
                case 25303:
                case 28281:
                    if (C0389.m5481() <= 0) {
                        break;
                    } else {
                        str = "ۧۨ";
                        break;
                    }
                case 25150:
                    str = "ۣۣۤ";
                    break;
                case 1735431:
                    if (C0370.m3284() < 0) {
                        str = "ۢۧۢ";
                        break;
                    } else {
                        C0388.m5430();
                        str = "ۨۦۣ";
                        break;
                    }
                case 1735454:
                    try {
                        C0191.m1640();
                        str = "ۨ۠";
                        break;
                    } catch (Throwable th) {
                        C0025.m109(th);
                        str = "ۧ۠ۡ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̗̖̙̗̙, reason: not valid java name and contains not printable characters */
    private void m3203() {
        String str = "ۢ۟۟";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1746814) {
                case 2081:
                    return;
                case 5436:
                    C0083.m456();
                    if (C0386.m5322() > 0) {
                        str = "ۥۢ";
                        break;
                    } else {
                        C0378.m4998();
                        break;
                    }
                case 25217:
                    C0088.m558(new Handler(C0399.m5866()), C0346.m3038());
                    if (C0392.m5595() > 0) {
                        str = "ۡۦۤ";
                        break;
                    } else {
                        C0164.m1359();
                        break;
                    }
                case 26357:
                    str = "ۢ۟۟";
                    break;
                case 1735651:
                    C0228.m2022();
                    if (C0335.m2923() >= 0) {
                        break;
                    } else {
                        str = "ۧۧ۟";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗̗̙̖̖̙, reason: not valid java name and contains not printable characters */
    public static App m3204() {
        return m3212();
    }

    /* renamed from: ̗̗̙̗̙̖, reason: not valid java name and contains not printable characters */
    public static Activity m3205() {
        String str = "ۣۡ۠";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753605) {
                case 2792:
                    return (Activity) C0370.m3273(C0377.m4972(), 0);
                case 25956:
                    return null;
                case 29767:
                    if (!C0121.m992(C0377.m4972())) {
                        break;
                    } else {
                        str = C0391.m5571() <= 0 ? "۟ۡۦ" : "۟ۢۤ";
                    }
                case 31911:
                    break;
                case 1711858:
                    str = "ۣۡ۠";
                    continue;
            }
            if (C0391.m5571() > 0) {
                str = "ۨ۠ۥ";
            }
        }
    }

    /* renamed from: ̗̗̙̙̖̙, reason: not valid java name and contains not printable characters */
    private void m3206() {
        String str = "ۡۦ۠";
        String strM2019 = null;
        Integer num = null;
        int iIntValue = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753669) {
                case 98:
                    if (C0078.m361() <= 0) {
                        break;
                    } else {
                        str = "ۡۦ۠";
                        break;
                    }
                case 972:
                    strM2019 = C0228.m2019();
                    if (C0368.m3171() >= 0) {
                        break;
                    } else {
                        str = "ۧ۠ۥ";
                        break;
                    }
                case 1897:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    str = "ۨۦ۠";
                    break;
                case 3047:
                    C0397.m5807(C0291.m2567(C0383.m5200(C0379.m5019(strM2019, 0, ((iIntValue ^ (-1)) & 2601973) | ((-2601974) & iIntValue)), C0378.m5007())));
                    if (C0387.m5374() < 0) {
                        str = "۠۟ۤ";
                        break;
                    } else {
                        str = "ۧۥۢ";
                        break;
                    }
                case 26752:
                    C0400.m5951(this, new C0210());
                    if (C0378.m4998() > 0) {
                        str = "ۤۢ۠";
                        break;
                    } else {
                        C0398.m5833();
                        str = "ۤۧ";
                        break;
                    }
                case 27855:
                    f614 = this;
                    if (C0394.m5672() > 0) {
                        str = "ۦۡۤ";
                        break;
                    } else {
                        C0379.m5056();
                        str = "ۡۢ۠";
                        break;
                    }
                case 27934:
                    num = new Integer(2601968);
                    if (C0388.m5430() <= 0) {
                        break;
                    } else {
                        str = "ۡ۟ۨ";
                        break;
                    }
                case 30823:
                    return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0036. Please report as an issue. */
    /* renamed from: ̗̙̙̖, reason: not valid java name and contains not printable characters */
    private void m3207(Context context) {
        int i = 0;
        C0336 c0336 = null;
        Object objM1345 = null;
        PackageManager packageManagerM511 = null;
        Field fieldM5040 = null;
        String str = "ۡ۠ۤ";
        DataInputStream dataInputStream = null;
        String strM5199 = null;
        int i2 = 0;
        ByteArrayInputStream byteArrayInputStream = null;
        int i3 = 0;
        byte[][] bArr = null;
        Class clsM269 = null;
        int i4 = 0;
        Field fieldM50402 = null;
        Object obj = null;
        Class cls = null;
        Object objM998 = null;
        String str2 = null;
        ClassLoader classLoader = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1749726) {
                case 186:
                    if (C0420.m6215() >= 0) {
                        i3 = i4;
                    } else {
                        str = "ۨ۠ۨ";
                        i3 = i4;
                    }
                case 1211:
                case 31673:
                    if (C0379.m5056() <= 0) {
                        C0083.m448();
                    } else {
                        str = "ۦ۟ۤ";
                    }
                case 1238:
                case 2076:
                case 30705:
                    str = "ۦۡ۟";
                case 2113:
                case 29530:
                    break;
                case 2168:
                    if (C0025.m118() <= 0) {
                        C0334.m2866();
                        str = "ۡۡۨ";
                        i3 = i;
                    } else {
                        str = "ۦ۟ۤ";
                        i3 = i;
                    }
                case 2174:
                    Object objM5812 = C0397.m5812(C0009.m19(clsM269, C0078.m371(), new Class[0]), null, new Object[0]);
                    if (C0362.m3122() >= 0) {
                        str = "۟ۡۢ";
                        obj = objM5812;
                    } else {
                        str = "ۡۢۥ";
                        obj = objM5812;
                    }
                case 2263:
                    str = "ۨ۠۠";
                    strM5199 = C0383.m5199();
                case 3962:
                    String strM5776 = C0397.m5776(context);
                    if (C0389.m5481() <= 0) {
                        C0291.m2568();
                        str2 = strM5776;
                    } else {
                        str = "ۨۢۨ";
                        str2 = strM5776;
                    }
                case 5442:
                    C0399.m5870(fieldM5040, true);
                    if (C0229.m2064() >= 0) {
                        C0346.m3059();
                    } else {
                        str = "ۡۥۢ";
                    }
                case 5531:
                    str = "ۨۢۤ";
                case 6168:
                    C0398.m5860(dataInputStream, bArr[i3]);
                    str = "ۢ۠ۢ";
                    i4 = 1 - (0 - i3);
                case 6431:
                    C0378.m5010(fieldM50402, obj, objM1345);
                    packageManagerM511 = C0086.m511(context);
                    str = "۠ۥ۠";
                case 6529:
                    bArr[i3] = new byte[C0390.m5536(dataInputStream)];
                    if (C0164.m1359() >= 0) {
                        C0025.m118();
                    } else {
                        str = "۠۟ۥ";
                    }
                case 6565:
                    try {
                        fieldM5040 = C0379.m5040(C0060.m194(packageManagerM511), C0397.m5764());
                        str = "۟ۤۡ";
                    } catch (Throwable th) {
                        if (C0400.m5961() > 0) {
                            str = "ۤۧۥ";
                        }
                    }
                case 7226:
                    str = "ۢ۟";
                    fieldM50402 = C0379.m5040(clsM269, C0206.m1822());
                case 7291:
                    str = "ۤۡۦ";
                case 7293:
                    if (C0370.m3284() >= 0) {
                        C0009.m36();
                    } else {
                        str = "ۤۡۦ";
                    }
                case 7648:
                    C0378.m5010(fieldM5040, packageManagerM511, objM1345);
                    str = C0009.m36() >= 0 ? "۟۟ۡ" : "ۦۡ۟";
                case 29589:
                    if (i3 >= bArr.length) {
                        str = "ۨۢۤ";
                    } else if (C0370.m3284() >= 0) {
                        C0379.m5056();
                        str = "۟۟";
                    } else {
                        str = "ۣ۠ۤ";
                    }
                case 30548:
                    objM1345 = C0164.m1345(classLoader, new Class[]{cls}, c0336);
                    str = "۠ۧۨ";
                case 30557:
                    DataInputStream dataInputStream2 = new DataInputStream(byteArrayInputStream);
                    if (C0184.m1524() >= 0) {
                        dataInputStream = dataInputStream2;
                    } else {
                        str = "ۤۧ";
                        dataInputStream = dataInputStream2;
                    }
                case 30584:
                    i = 0;
                    if (C0397.m5814() <= 0) {
                        C0368.m3171();
                    } else {
                        str = "ۤۦۨ";
                    }
                case 31278:
                    str = C0377.m4944() <= 0 ? "ۤۨۢ" : "ۣۨۤ";
                case 31286:
                    str = !C0385.m5303(strM5199) ? C0393.m5668() <= 0 ? "ۤۧۤ" : "ۤۦۡ" : "۠۟";
                case 31544:
                    Class clsM2692 = C0073.m269(C0380.m5083());
                    if (C0082.m410() >= 0) {
                        cls = clsM2692;
                    } else {
                        str = "ۥ۠۟";
                        cls = clsM2692;
                    }
                case 31581:
                    str = "ۣۧۤ";
                    bArr = new byte[(i2 ^ InputDeviceCompat.SOURCE_ANY) & i2][];
                case 31728:
                    ClassLoader classLoaderM1843 = C0206.m1843(cls);
                    C0336 c03362 = new C0336(objM998, bArr, str2);
                    if (C0191.m1627() >= 0) {
                        C0369.m3256();
                        str = "۠ۧ۠";
                        c0336 = c03362;
                        classLoader = classLoaderM1843;
                    } else {
                        str = "ۣۧۦ";
                        c0336 = c03362;
                        classLoader = classLoaderM1843;
                    }
                case 31732:
                    str = "ۤۦۢ";
                    clsM269 = C0073.m269(C0396.m5731());
                case 1730849:
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(C0380.m5070(strM5199, 0));
                    if (C0400.m5961() <= 0) {
                        str = "۟ۢ۟";
                        byteArrayInputStream = byteArrayInputStream2;
                    } else {
                        str = "ۣۧ۟";
                        byteArrayInputStream = byteArrayInputStream2;
                    }
                case 1730878:
                    str = "ۡ۠ۤ";
                case 1732189:
                    int iM2897 = C0335.m2897(dataInputStream);
                    if (C0291.m2568() >= 0) {
                        i2 = iM2897;
                    } else {
                        str = "ۨۥ۠";
                        i2 = iM2897;
                    }
                case 1732323:
                    C0399.m5870(fieldM50402, true);
                    str = "ۨۨۦ";
                    objM998 = C0121.m998(fieldM50402, obj);
            }
            return;
        }
    }

    /* renamed from: ۣۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m3208(Object obj, Object obj2) {
        String str = "ۡۤۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1750535) {
                case 261:
                case 6341:
                    str = "۟ۥۢ";
                    continue;
                case 1153:
                    break;
                case 2977:
                    if (C0074.m307() >= 0) {
                        C0396.m5741();
                        str = "۠ۨۥ";
                    } else {
                        str = "ۡۡۢ";
                        continue;
                    }
                case 3259:
                    ((App) obj).m3199((String) obj2);
                    str = "۟ۥۢ";
                    continue;
                case 4539:
                    return;
                case 6435:
                    if (C0395.m5698() > 0) {
                        break;
                    } else if (C0183.m1464() > 0) {
                        str = "ۤۧ۟";
                    }
                case 32644:
                    str = "ۡۤۧ";
                    continue;
            }
            str = "ۥ۠ۡ";
        }
    }

    /* renamed from: ۟ۥ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static void m3209(Object obj, Object obj2) {
        Object obj3 = "ۣۥ۠";
        while (true) {
            switch (C0395.m5690(obj3) ^ 1746755) {
                case 4184:
                case 25285:
                    obj3 = "ۤ۠ۡ";
                    continue;
                case 4605:
                    if (C0379.m5056() <= 0) {
                        break;
                    } else if (C0334.m2866() <= 0) {
                        C0377.m4944();
                    } else {
                        obj3 = "ۢ۠ۦ";
                    }
                case 5219:
                    break;
                case 5419:
                    ((App) obj).m3207((Context) obj2);
                    if (C0155.m1294() < 0) {
                        obj3 = "ۤ۠ۡ";
                    } else {
                        continue;
                    }
                case 7846:
                    return;
                case 28169:
                    if (C0388.m5430() <= 0) {
                        C0399.m5914();
                    } else {
                        obj3 = "ۣۥ۠";
                        continue;
                    }
                case 28395:
                    if (C0396.m5741() < 0) {
                        obj3 = "ۣۨ۠";
                    } else {
                        continue;
                    }
            }
            obj3 = "ۨۦۦ";
        }
    }

    /* renamed from: ۟ۥۦۣۢ, reason: not valid java name and contains not printable characters */
    public static void m3210(Object obj) {
        String str = "۟ۡۧ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56511) {
                case 103:
                    ((App) obj).m3203();
                    if (C0400.m5961() <= 0) {
                        str = "ۢۨۢ";
                    } else {
                        str = "ۡۨۥ";
                        continue;
                    }
                case 1709532:
                case 1709559:
                    if (C0089.m592() <= 0) {
                        C0346.m3059();
                    } else {
                        str = "ۡۨۥ";
                        continue;
                    }
                case 1731129:
                    if (C0387.m5374() < 0) {
                        str = "۟ۡۧ";
                    } else {
                        continue;
                    }
                case 1731226:
                    break;
                case 1733409:
                    return;
                case 1735644:
                    if (C0378.m4998() <= 0) {
                        str = "ۡۥۦ";
                    } else {
                        str = "ۣۣۨ";
                        continue;
                    }
                case 1735674:
                    if (C0420.m6215() >= 0) {
                        break;
                    } else if (C0383.m5203() > 0) {
                        str = "ۧ۟";
                    }
            }
            str = C0183.m1464() <= 0 ? "۟ۥۧ" : "۟ۢۦ";
        }
    }

    /* renamed from: ۟ۦۧۡۢ, reason: not valid java name and contains not printable characters */
    public static void m3211(Object obj, Object obj2) {
        String str = "ۡۡۤ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752708) {
                case 1050:
                    ((App) obj).m3201((Context) obj2);
                    str = "ۣ۠ۢ";
                    continue;
                case 1250:
                    str = "ۡۡۤ";
                    continue;
                case 1889:
                case 30284:
                    if (C0074.m307() < 0) {
                        str = "ۣ۠ۢ";
                    } else {
                        continue;
                    }
                case 2209:
                    return;
                case 3519:
                    break;
                case 4160:
                    if (C0073.m265() <= 0) {
                        break;
                    } else if (C0191.m1627() < 0) {
                        str = "ۤۦ۠";
                    }
                case 30532:
                    str = "ۤ۠ۡ";
                    continue;
            }
            if (C0335.m2923() < 0) {
                str = "ۨۧ۟";
            }
        }
    }

    /* renamed from: ۠ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static App m3212() {
        String str = "ۧۦ";
        App app = null;
        App app2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748866) {
                case 1083:
                    if (C0184.m1524() >= 0) {
                        C0089.m592();
                        str = "ۡۦۤ";
                    } else {
                        str = "ۣۦۡ";
                        continue;
                    }
                case 2115:
                    return app;
                case 2278:
                    if (C0183.m1464() > 0) {
                        str = "ۧۨۡ";
                    } else {
                        continue;
                    }
                case 4491:
                    if (C0073.m265() <= 0) {
                        C0376.m4906();
                        str = "ۣ۠ۢ";
                        app = app2;
                    } else {
                        str = "۟ۥۧ";
                        app = app2;
                        continue;
                    }
                case 6492:
                case 28068:
                    str = "۟ۥۧ";
                    continue;
                case 27042:
                    if (C0383.m5203() <= 0) {
                        C0388.m5430();
                        app = null;
                    } else {
                        str = "۠ۧ۠";
                        app = null;
                        continue;
                    }
                case 27279:
                    if (C0060.m216() <= 0) {
                        C0009.m36();
                    } else {
                        str = "ۧۦ";
                        continue;
                    }
                case 28035:
                    break;
                case 28127:
                    app2 = f614;
                    if (C0229.m2064() >= 0) {
                        C0369.m3256();
                        str = "ۨۤۢ";
                    } else {
                        str = "ۥۣۧ";
                        continue;
                    }
                case 1733469:
                    if (C0060.m216() < 0) {
                        break;
                    } else {
                        str = "ۦۨ۟";
                    }
            }
            if (C0279.m2491() >= 0) {
                C0335.m2923();
            } else {
                str = "۟ۢۧ";
            }
        }
    }

    /* renamed from: ۡ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static void m3213() {
        String str = "۠ۨۨ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1753508) {
                case InputDeviceCompat.SOURCE_GAMEPAD /* 1025 */:
                    str = "۠ۨۨ";
                    continue;
                case 2177:
                case 27323:
                    if (C0183.m1464() <= 0) {
                        str = "ۤۧۨ";
                    } else {
                        str = "ۣ۟ۨ";
                        continue;
                    }
                case 2275:
                    if (C0385.m5282() >= 0) {
                        str = "ۦ۠۟";
                    } else {
                        str = "ۨۢ۟";
                        continue;
                    }
                case 26144:
                    return;
                case 27204:
                    if (C0375.m4840() >= 0) {
                        break;
                    } else {
                        str = "ۥ۟";
                    }
                case 30693:
                    break;
                case 1711422:
                    m3202();
                    if (C0380.m5068() <= 0) {
                        C0121.m1023();
                    } else {
                        str = "ۣ۟ۨ";
                        continue;
                    }
            }
            if (C0060.m216() <= 0) {
                C0384.m5278();
                str = "ۥ۠ۧ";
            } else {
                str = "ۣۨۢ";
            }
        }
    }

    /* renamed from: ۣۤۡ۠, reason: not valid java name and contains not printable characters */
    public static Context m3214() {
        String str = "ۧ۟ۢ";
        Context context = null;
        Context context2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56448) {
                case 1710474:
                    if (C0083.m448() > 0) {
                        break;
                    } else {
                        str = "ۧ۠ۨ";
                    }
                case 1710480:
                    if (C0368.m3171() < 0) {
                        str = "ۧ۟ۢ";
                    } else {
                        continue;
                    }
                case 1710511:
                    context2 = f613;
                    if (C0121.m1023() >= 0) {
                        C0388.m5430();
                    } else {
                        str = "۟۠ۤ";
                        continue;
                    }
                case 1710757:
                    str = "۠ۥۥ";
                    continue;
                case 1728804:
                    break;
                case 1728835:
                    str = "ۤۨۧ";
                    continue;
                case 1730147:
                    if (C0389.m5481() <= 0) {
                        C0083.m448();
                        str = "ۣۢۡ";
                        context = null;
                    } else {
                        str = "ۧۨۦ";
                        context = null;
                        continue;
                    }
                case 1732196:
                case 1734400:
                    if (C0396.m5741() >= 0) {
                        C0089.m592();
                        str = "ۧ۟ۥ";
                    } else {
                        str = "۠۟ۦ";
                        continue;
                    }
                case 1734215:
                    return context;
                case 1735587:
                    if (C0379.m5056() <= 0) {
                        C0229.m2064();
                        context = context2;
                    } else {
                        str = "۠۟ۦ";
                        context = context2;
                        continue;
                    }
            }
            str = "ۥۡ۟";
        }
    }

    /* renamed from: ۥۧۢۨ, reason: contains not printable characters */
    public static void m3215(Object obj, Object obj2) {
        Object obj3 = "ۦۡ";
        while (true) {
            switch (C0395.m5690(obj3) ^ 1752586) {
                case 2154:
                case 32578:
                    if (C0382.m5180() <= 0) {
                        C0362.m3122();
                    } else {
                        obj3 = "ۣۢۤ";
                        continue;
                    }
                case 3273:
                    return;
                case 3368:
                    obj3 = "ۦۡ";
                    continue;
                case 5461:
                    break;
                case 5515:
                    ((App) obj).m3200((Context) obj2);
                    if (C0383.m5203() > 0) {
                        obj3 = "ۣۢۤ";
                    } else {
                        continue;
                    }
                case 32739:
                    if (C0155.m1294() < 0) {
                        obj3 = "ۣۢ۟";
                    } else {
                        continue;
                    }
                case 1729201:
                    if (C0392.m5595() < 0) {
                        break;
                    } else {
                        obj3 = "۠ۥۦ";
                    }
            }
            if (C0420.m6215() >= 0) {
                C0184.m1524();
            } else {
                obj3 = "ۦۤۧ";
            }
        }
    }

    /* renamed from: ۨۨۥۥ, reason: not valid java name and contains not printable characters */
    public static void m3216(Object obj) {
        String str = "ۢۨۦ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1747898) {
                case 135:
                case 954:
                    if (C0083.m448() >= 0) {
                        C0155.m1294();
                    } else {
                        str = "ۧۥۧ";
                        continue;
                    }
                case 3169:
                    break;
                case 3173:
                    ((App) obj).m3206();
                    if (C0191.m1627() >= 0) {
                        C0291.m2568();
                        str = "ۡ۠ۥ";
                    } else {
                        str = "ۧۥۧ";
                        continue;
                    }
                case 6362:
                    if (C0191.m1627() >= 0) {
                        break;
                    } else {
                        str = C0025.m118() <= 0 ? "۟ۦۧ" : "۟ۦۦ";
                    }
                case 7449:
                    if (C0179.m1427() <= 0) {
                        C0391.m5571();
                    } else {
                        str = "ۢۨۦ";
                        continue;
                    }
                case 7482:
                    if (C0383.m5203() <= 0) {
                        C0088.m573();
                    } else {
                        str = "ۣ۠۠";
                        continue;
                    }
                case 28275:
                    return;
            }
            if (C0369.m3256() <= 0) {
                C0384.m5278();
            } else {
                str = "ۣۣ۠";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124 A[SYNTHETIC] */
    @Override // android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void attachBaseContext(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sadfxg.fasg.App.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Application
    public void onCreate() {
        String str = "ۣ۠ۥ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1748704) {
                case 40:
                    break;
                case 2304:
                    C0279.m2460(this);
                    if (C0393.m5668() > 0) {
                        str = "ۣۧ۠";
                    } else {
                        continue;
                    }
                case 4297:
                case 4901:
                    return;
                case 6344:
                    super.onCreate();
                    if (C0377.m4944() > 0) {
                        str = "ۢۥۣ";
                    } else {
                        continue;
                    }
                case 7648:
                    if (!C0369.m3266(C0383.m5211(), this)) {
                        break;
                    } else if (C0388.m5430() <= 0) {
                        C0086.m500();
                    } else {
                        str = "ۥۤۨ";
                    }
                case 27492:
                    m3216(this);
                    str = "ۥۡۡ";
                    continue;
                case 28485:
                    if (C0376.m4906() > 0) {
                        str = "ۣ۠ۥ";
                    } else {
                        continue;
                    }
            }
            str = C0383.m5203() <= 0 ? "ۢۧۦ" : "۟ۦۧ";
        }
    }

    /* renamed from: ̖̖, reason: not valid java name and contains not printable characters */
    public void m3217(Activity activity) {
        int iM1442 = 0;
        String str = "ۣۡۦ";
        int iM385 = 0;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1754663) {
                case 940:
                    C0088.m560(activity);
                    str = "ۢۢۤ";
                    continue;
                case 963:
                    C0089.m625(C0393.m5650(activity, C0121.m1024(), 1));
                    if (C0291.m2568() >= 0) {
                        C0396.m5741();
                        str = "ۣۣۨ";
                    } else {
                        str = "ۣۧۧ";
                        continue;
                    }
                case 1146:
                    if (C0089.m592() <= 0) {
                        C0078.m361();
                    } else {
                        str = "ۣۡۦ";
                        continue;
                    }
                case 24966:
                    C0396.m5753(C0183.m1483());
                    if (C0082.m410() < 0) {
                        str = "ۡ۟ۡ";
                    } else {
                        continue;
                    }
                case 26788:
                case 29827:
                    return;
                case 26979:
                    break;
                case 27940:
                    iM1442 = C0179.m1442();
                    str = "ۢۧۡ";
                    continue;
                case 28783:
                    iM385 = C0082.m385();
                    if (C0370.m3284() >= 0) {
                        C0400.m5961();
                    } else {
                        str = "۠ۡۤ";
                        continue;
                    }
                case 29979:
                    if (C0387.m5380(activity, C0391.m5569(), iM385, iM1442) != -1) {
                        break;
                    } else if (C0183.m1464() <= 0) {
                        C0082.m410();
                        str = "ۤ۠ۦ";
                    } else {
                        str = "ۧۦۣ";
                    }
            }
            if (C0399.m5914() <= 0) {
                C0397.m5814();
            } else {
                str = "۟ۤۦ";
            }
        }
    }
}
