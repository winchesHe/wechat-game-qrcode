package com.cloudinject.feature.p023;

import android.app.Activity;
import android.app.C0009;
import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.content.Context;
import android.content.Intent;
import android.database.C0073;
import android.database.C0074;
import android.net.C0082;
import android.net.C0083;
import android.net.Uri;
import android.net.wifi.C0078;
import android.os.Handler;
import android.support.annotation.̗̖̗̖;
import android.support.v4.content.FileProvider;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.p007.C0088;
import androidx.core.p007.C0089;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.core.utils.compat.C0121;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p018.C0229;
import com.cloudinject.feature.p021.C0291;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.sadfxg.fasg.C0369;
import java.io.File;
import mirrorb.android.accounts.C0375;
import mirrorb.android.accounts.C0376;
import mirrorb.android.app.admin.C0377;
import mirrorb.android.content.C0380;
import mirrorb.android.content.res.C0379;
import mirrorb.android.hardware.fingerprint.C0381;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
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

/* renamed from: com.cloudinject.feature.̙̙.̗̙̙̖, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0330 {
    /* renamed from: lambda$MyeFrbpMq-LrtUpItLnbLWATsdk, reason: not valid java name */
    public static /* synthetic */ void m2823lambda$MyeFrbpMqLrtUpItLnbLWATsdk(String str, Context context) {
        String str2 = "۠ۨ۠";
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 1748646) {
                case 1406:
                    m2827(str, context);
                    if (C0420.m6215() < 0) {
                        str2 = "۟ۢۢ";
                        break;
                    } else {
                        C0382.m5180();
                        break;
                    }
                case 2553:
                    return;
                case 5954:
                    if (C0362.m3122() >= 0) {
                        break;
                    } else {
                        str2 = "۠ۨ۠";
                        break;
                    }
            }
        }
    }

    /* renamed from: ̗, reason: not valid java name and contains not printable characters */
    private static /* synthetic */ void m2824(String str, Context context) {
        String str2 = "ۡۡ۠";
        Intent intent = null;
        Integer num = null;
        int iIntValue = 0;
        while (true) {
            switch (C0395.m5690((Object) str2) ^ 56289) {
                case 7:
                    C0399.m5894(intent, ((iIntValue ^ (-1)) & 3720440) | ((-3720441) & iIntValue));
                    if (C0386.m5322() > 0) {
                        str2 = "۟ۡۥ";
                        break;
                    } else {
                        C0377.m4944();
                        str2 = "ۦۢ۟";
                        break;
                    }
                case 1951:
                    if (C0379.m5056() <= 0) {
                        break;
                    } else {
                        str2 = "۟ۡۥ";
                        break;
                    }
                case 1708649:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    str2 = "۟ۥ";
                    break;
                case 1729067:
                    if (C0183.m1464() > 0) {
                        str2 = "ۡۡ۠";
                        break;
                    } else {
                        str2 = "ۨۥۣ";
                        break;
                    }
                case 1729993:
                    intent = new Intent();
                    if (C0074.m307() < 0) {
                        str2 = "ۣۢۡ";
                        break;
                    } else {
                        C0369.m3256();
                        str2 = "۠ۡ۠";
                        break;
                    }
                case 1730815:
                case 1730916:
                    str2 = "ۣ۠ۡ";
                    break;
                case 1731971:
                    C0376.m4918(intent, C0385.m5310(C0083.m452()));
                    if (C0377.m4944() <= 0) {
                        break;
                    } else {
                        str2 = "۟۟ۨ";
                        break;
                    }
                case 1732037:
                    return;
                case 1733921:
                    num = new Integer(272155896);
                    if (C0385.m5282() < 0) {
                        str2 = "ۥۤۧ";
                        break;
                    } else {
                        C0291.m2568();
                        str2 = "ۥۧ۠";
                        break;
                    }
                case 1735842:
                    try {
                        C0390.m5510(context, intent);
                        str2 = "ۣ۠ۡ";
                        break;
                    } catch (Throwable th) {
                        if (C0391.m5571() > 0) {
                            str2 = "ۢۦۢ";
                            break;
                        } else {
                            str2 = "ۡۦۦ";
                            break;
                        }
                    }
                case 1735913:
                    C0025.m99(intent, C0346.m3039(str));
                    str2 = "ۨۥۥ";
                    break;
            }
        }
    }

    /* renamed from: ̗̖, reason: not valid java name and contains not printable characters */
    public static void m2825(Activity activity, String str) {
        StringBuilder sb = null;
        Intent intent = null;
        StringBuilder sb2 = null;
        int iIntValue = 0;
        Intent intent2 = null;
        String str2 = null;
        String strM5310 = null;
        int iM5428 = 0;
        Integer num = null;
        Object obj = "ۢۧۤ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1754662) {
                case 33:
                    C0089.m614(activity, intent);
                    obj = "ۣۣۦ";
                    continue;
                case TypedValues.Custom.TYPE_INT /* 900 */:
                    C0382.m5174(intent2, m2828(activity, C0377.m4932(sb2), new File(str)), strM5310);
                    if (C0397.m5814() > 0) {
                        obj = "ۤۢۤ";
                    } else {
                        continue;
                    }
                case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                    break;
                case 963:
                    C0376.m4918(intent2, str2);
                    if (C0397.m5814() <= 0) {
                        C0385.m5282();
                        obj = "ۤۨ";
                    } else {
                        obj = "ۡۦ";
                        continue;
                    }
                case 1061:
                    C0060.m211(sb, C0385.m5310(C0400.m5928()));
                    obj = "ۣ۠ۤ";
                    continue;
                case 1063:
                    if (iM5428 < 24) {
                        break;
                    } else if (C0346.m3059() < 0) {
                        obj = "ۧ۠";
                    }
                case 1093:
                    intent = new Intent();
                    obj = "ۨۢ۟";
                    continue;
                case 1902:
                    C0382.m5174(intent, C0346.m3039(C0377.m4932(sb)), strM5310);
                    obj = "ۧۧۧ";
                    continue;
                case 3843:
                    C0376.m4918(intent, str2);
                    if (C0400.m5961() <= 0) {
                        C0380.m5068();
                    } else {
                        obj = "ۨۤۦ";
                        continue;
                    }
                case 3916:
                    sb = new StringBuilder();
                    obj = "ۦۥۢ";
                    continue;
                case 4039:
                    iM5428 = C0388.m5428();
                    if (C0375.m4840() >= 0) {
                        C0073.m265();
                    } else {
                        obj = "۟۠";
                        continue;
                    }
                case 4079:
                    String strM53102 = C0385.m5310(C0083.m452());
                    if (C0183.m1464() <= 0) {
                        C0369.m3256();
                        str2 = strM53102;
                        obj = "ۢۢۡ";
                    } else {
                        str2 = strM53102;
                        obj = "ۦۥ۠";
                        continue;
                    }
                case 24832:
                    sb2 = new StringBuilder();
                    if (C0381.m5127() <= 0) {
                        C0391.m5571();
                    } else {
                        obj = "ۡۥۦ";
                        continue;
                    }
                case 24922:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    if (C0380.m5068() <= 0) {
                        C0060.m216();
                    } else {
                        obj = "ۣۧۨ";
                        continue;
                    }
                case 26849:
                case 27974:
                    if (C0380.m5068() <= 0) {
                        C0082.m410();
                    } else {
                        obj = "ۣۣۦ";
                        continue;
                    }
                case 26980:
                    C0060.m211(sb2, C0375.m4873(activity));
                    if (C0078.m361() > 0) {
                        obj = "ۡۨ۠";
                    } else {
                        continue;
                    }
                case 27071:
                    C0060.m211(sb2, C0385.m5310(C0191.m1659()));
                    if (C0291.m2568() >= 0) {
                        C0184.m1524();
                        obj = "ۣۣۡ";
                    } else {
                        obj = "ۧۤ۟";
                        continue;
                    }
                case 28673:
                    C0060.m211(sb, str);
                    if (C0088.m573() <= 0) {
                        obj = "ۢ۟ۡ";
                    } else {
                        obj = "ۦ۟ۡ";
                        continue;
                    }
                case 28832:
                    return;
                case 28962:
                    C0399.m5894(intent2, ((iIntValue ^ (-1)) & 4354094) | ((-4354095) & iIntValue));
                    if (C0380.m5068() <= 0) {
                        C0334.m2866();
                        obj = "ۢ۠ۡ";
                    } else {
                        obj = "۟۠ۧ";
                        continue;
                    }
                case 29977:
                    Integer num2 = new Integer(272789550);
                    if (C0384.m5278() <= 0) {
                        C0179.m1427();
                        num = num2;
                        obj = "ۢۨۥ";
                    } else {
                        num = num2;
                        obj = "ۨۨۡ";
                        continue;
                    }
                case 30725:
                    if (C0394.m5672() > 0) {
                        obj = "۠ۤۤ";
                    } else {
                        continue;
                    }
                case 31744:
                    C0089.m614(activity, intent2);
                    if (C0382.m5180() <= 0) {
                        obj = "ۨۥۣ";
                    } else {
                        obj = "ۥۤۢ";
                        continue;
                    }
                case 31809:
                    if (C0383.m5203() <= 0) {
                        C0183.m1464();
                    } else {
                        obj = "ۢۧۤ";
                        continue;
                    }
                case 1710595:
                    C0384.m5239(intent2, 1);
                    if (C0184.m1524() >= 0) {
                        C0179.m1427();
                        obj = "ۦۦ";
                    } else {
                        obj = "ۣ۟۠";
                        continue;
                    }
                case 1710847:
                    Intent intent3 = new Intent();
                    if (C0229.m2064() >= 0) {
                        intent2 = intent3;
                        obj = "ۤۦۧ";
                    } else {
                        intent2 = intent3;
                        obj = "ۧۦۤ";
                        continue;
                    }
                case 1711559:
                    strM5310 = C0385.m5310(C0420.m6245());
                    obj = "ۨۧۨ";
                    continue;
            }
            obj = "ۦۨۥ";
        }
    }

    /* renamed from: ̗̙, reason: not valid java name and contains not printable characters */
    public static void m2826(@̗̖̗̖ final Context context, @̗̖̗̖ final String str) {
        long jLongValue = 0;
        Long l = null;
        Runnable runnable = null;
        Handler handler = null;
        Object obj = "ۣۤۦ";
        while (true) {
            switch (C0395.m5690(obj) ^ 1753547) {
                case 111:
                    if (C0088.m573() > 0) {
                        obj = "ۣۤۦ";
                    } else {
                        continue;
                    }
                case 972:
                    break;
                case 1155:
                    C0083.m453(handler, runnable, (((-1) ^ jLongValue) & 8022469) | ((8022469 ^ (-1)) & jLongValue));
                    obj = "ۡۧ";
                    continue;
                case 2243:
                    C0396.m5727(runnable);
                    if (C0335.m2923() < 0) {
                        obj = "ۥۧۢ";
                    } else {
                        continue;
                    }
                case 26263:
                    runnable = new Runnable(str, context) { // from class: com.cloudinject.feature.̙̙.-$$Lambda$̗̙̙̖$MyeFrbpMq-LrtUpItLnbLWATsdk
                        private final String f$0;
                        private final Context f$1;

                        {
                            String str2 = "ۤۢۥ";
                            while (true) {
                                switch (C0395.m5690((Object) str2) ^ 1750718) {
                                    case TypedValues.CycleType.TYPE_EASING /* 420 */:
                                        return;
                                    case 2900:
                                        if (C0179.m1427() <= 0) {
                                            break;
                                        } else {
                                            str2 = "ۤۢۥ";
                                            break;
                                        }
                                    case 3225:
                                        this.f$0 = str;
                                        if (C0078.m361() > 0) {
                                            str2 = "ۨ۟ۤ";
                                            break;
                                        } else {
                                            str2 = "۠ۨۢ";
                                            break;
                                        }
                                    case 32371:
                                        this.f$1 = context;
                                        if (C0381.m5127() <= 0) {
                                            break;
                                        } else {
                                            str2 = "ۣۨ۟";
                                            break;
                                        }
                                }
                            }
                        }

                        /* renamed from: ۟ۢ۠ۧۨ, reason: not valid java name and contains not printable characters */
                        public static Context m2580(Object obj2) {
                            String str2 = "ۥۥۡ";
                            Context context2 = null;
                            Context context3 = null;
                            while (true) {
                                switch (C0395.m5690((Object) str2) ^ 1749789) {
                                    case 3420:
                                        if (C0393.m5668() <= 0) {
                                            break;
                                        } else if (C0025.m118() <= 0) {
                                            C0384.m5278();
                                        } else {
                                            str2 = "ۨۡۤ";
                                        }
                                    case 3834:
                                    case 6206:
                                        str2 = "ۦۤۧ";
                                        continue;
                                    case 5344:
                                        if (C0420.m6215() >= 0) {
                                            C0335.m2923();
                                            str2 = "ۤۧۡ";
                                        } else {
                                            str2 = "ۥۥۡ";
                                            continue;
                                        }
                                    case 6203:
                                        str2 = "۠ۢۥ";
                                        continue;
                                    case 6364:
                                        if (C0389.m5481() <= 0) {
                                            context2 = null;
                                        } else {
                                            str2 = "۠ۢۨ";
                                            context2 = null;
                                            continue;
                                        }
                                    case 29428:
                                        return context2;
                                    case 29983:
                                        str2 = "۠ۧۨ";
                                        continue;
                                    case 30228:
                                        break;
                                    case 31254:
                                        context3 = (($$Lambda$$MyeFrbpMqLrtUpItLnbLWATsdk) obj2).f$1;
                                        if (C0184.m1524() >= 0) {
                                            C0389.m5481();
                                            str2 = "ۣۧۧ";
                                        } else {
                                            str2 = "ۨۦ";
                                            continue;
                                        }
                                    case 1732579:
                                        str2 = "ۦۤۧ";
                                        context2 = context3;
                                        continue;
                                }
                                if (C0279.m2491() >= 0) {
                                    C0082.m410();
                                    str2 = "۠ۨۥ";
                                } else {
                                    str2 = "ۧۧۢ";
                                }
                            }
                        }

                        /* renamed from: ۢۧۧۨ, reason: not valid java name and contains not printable characters */
                        public static String m2581(Object obj2) {
                            String str2 = "ۨۥۡ";
                            String str3 = null;
                            String str4 = null;
                            while (true) {
                                switch (C0395.m5690((Object) str2) ^ 1752582) {
                                    case 911:
                                        return str3;
                                    case 1223:
                                    case 1729242:
                                        if (C0228.m2012() <= 0) {
                                            C0390.m5512();
                                        } else {
                                            str2 = "ۥۣ۟";
                                            continue;
                                        }
                                    case 4226:
                                        if (C0191.m1627() >= 0) {
                                            str3 = null;
                                        } else {
                                            str2 = "ۧۤۨ";
                                            str3 = null;
                                            continue;
                                        }
                                    case 4408:
                                        str2 = "ۥۣ۟";
                                        str3 = str4;
                                        continue;
                                    case 5377:
                                        break;
                                    case 5567:
                                        if (C0382.m5180() <= 0) {
                                            C0382.m5180();
                                        } else {
                                            str2 = "ۨۥۡ";
                                            continue;
                                        }
                                    case 30594:
                                        if (C0392.m5595() <= 0) {
                                            break;
                                        } else if (C0183.m1464() > 0) {
                                            str2 = "ۧۨۧ";
                                        }
                                    case 30752:
                                        str4 = (($$Lambda$$MyeFrbpMqLrtUpItLnbLWATsdk) obj2).f$0;
                                        str2 = "ۡۥۢ";
                                        continue;
                                    case 31530:
                                        str2 = "ۡ۟ۢ";
                                        continue;
                                    case 31661:
                                        str2 = "ۤۧۤ";
                                        continue;
                                }
                                if (C0089.m592() > 0) {
                                    str2 = "ۧ۠ۥ";
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str2 = "ۣۢ۟";
                            while (true) {
                                switch (C0395.m5690((Object) str2) ^ 1750810) {
                                    case 1444:
                                        C0335.m2905(m2581(this), m2580(this));
                                        if (C0346.m3059() < 0) {
                                            str2 = "ۤۢ";
                                            break;
                                        } else {
                                            str2 = "ۢۨۤ";
                                            break;
                                        }
                                    case 32441:
                                        str2 = "ۣۢ۟";
                                        break;
                                    case 1731428:
                                        return;
                                }
                            }
                        }
                    };
                    if (C0346.m3059() >= 0) {
                        C0398.m5833();
                    } else {
                        obj = "۟ۡ۠";
                        continue;
                    }
                case 26357:
                    if (!C0334.m2887(C0379.m5014(C0383.m5204()))) {
                        break;
                    } else if (C0335.m2923() < 0) {
                        obj = "ۡ۟۠";
                    }
                case 28489:
                    handler = new Handler(C0399.m5866());
                    if (C0391.m5571() <= 0) {
                        C0291.m2568();
                    } else {
                        obj = "ۡ۠۠";
                        continue;
                    }
                case 28522:
                    jLongValue = ((Long) new Object[]{l}[0]).longValue();
                    if (C0383.m5203() <= 0) {
                        C0083.m448();
                    } else {
                        obj = "ۧۡۢ";
                        continue;
                    }
                case 31628:
                    l = new Long(8022065L);
                    if (C0009.m36() < 0) {
                        obj = "۟ۢ۟";
                    } else {
                        continue;
                    }
                case 31776:
                case 1711408:
                    obj = "ۥۧۢ";
                    continue;
                case 32587:
                    return;
                case 1711597:
                    if (C0228.m2012() <= 0) {
                        C0060.m216();
                    } else {
                        obj = "ۥۢۨ";
                        continue;
                    }
            }
            if (C0388.m5430() <= 0) {
                C0279.m2491();
                obj = "ۣۡۨ";
            } else {
                obj = "ۨۡۡ";
            }
        }
    }

    /* renamed from: ۡۥ۠۠, reason: not valid java name and contains not printable characters */
    public static void m2827(Object obj, Object obj2) {
        Object obj3 = "۠ۦۧ";
        while (true) {
            switch (C0395.m5690(obj3) ^ 1753479) {
                case 2126:
                    return;
                case 26183:
                case 29414:
                    if (C0376.m4906() <= 0) {
                        obj3 = "ۢۨۢ";
                    } else {
                        obj3 = "ۨۧۨ";
                        continue;
                    }
                case 26329:
                    m2824((String) obj, (Context) obj2);
                    if (C0334.m2866() > 0) {
                        obj3 = "ۨۧۨ";
                    } else {
                        continue;
                    }
                case 27174:
                    if (C0191.m1627() >= 0) {
                        break;
                    } else if (C0377.m4944() > 0) {
                        obj3 = "۟ۢۡ";
                    }
                case 31618:
                    if (C0420.m6215() >= 0) {
                        C0078.m361();
                    } else {
                        obj3 = "۟ۥۦ";
                        continue;
                    }
                case 1711554:
                    break;
                case 1711609:
                    obj3 = "۠ۦۧ";
                    continue;
            }
            obj3 = "ۤۡۢ";
        }
    }

    /* renamed from: ۤۤۢۡ, reason: not valid java name and contains not printable characters */
    public static Uri m2828(Object obj, Object obj2, Object obj3) {
        Object obj4 = "ۨۧ۠";
        Uri uri = null;
        Uri uriForFile = null;
        while (true) {
            switch (C0395.m5690(obj4) ^ 1751777) {
                case 126:
                    if (C0376.m4906() <= 0) {
                        C0228.m2012();
                        obj4 = "ۣۧ";
                    } else {
                        obj4 = "ۨۦۥ";
                        continue;
                    }
                case 1153:
                    obj4 = "ۦۡۦ";
                    continue;
                case 4857:
                case 31594:
                    if (C0397.m5814() <= 0) {
                        C0179.m1427();
                    } else {
                        obj4 = "ۢ۟";
                        continue;
                    }
                case 7490:
                    obj4 = "ۨۧ۠";
                    continue;
                case 7620:
                    if (C0385.m5282() >= 0) {
                        uri = uriForFile;
                    } else {
                        obj4 = "ۢ۟";
                        uri = uriForFile;
                        continue;
                    }
                case 29472:
                    if (C0384.m5278() < 0) {
                        break;
                    } else {
                        obj4 = "ۨۤۤ";
                    }
                case 29510:
                    if (C0380.m5068() <= 0) {
                        C0089.m592();
                        uri = null;
                    } else {
                        obj4 = "ۥۦۡ";
                        uri = null;
                        continue;
                    }
                case 29577:
                    uriForFile = FileProvider.getUriForFile((Context) obj, (String) obj2, (File) obj3);
                    if (C0121.m1023() < 0) {
                        obj4 = "۟۠ۦ";
                    } else {
                        continue;
                    }
                case 32512:
                    break;
                case 1730268:
                    return uri;
            }
            obj4 = "ۤۦۡ";
        }
    }
}
