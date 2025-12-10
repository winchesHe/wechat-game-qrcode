package com.android.internal.p008;

import android.arch.lifecycle.p000.C0025;
import android.arch.p003.p005.C0060;
import android.net.C0083;
import android.net.wifi.C0078;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.graphics.drawable.C0086;
import androidx.core.p007.C0088;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.core.p013.C0179;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.model.p014.C0191;
import com.cloudinject.feature.p015.C0206;
import com.cloudinject.feature.p018.C0228;
import com.cloudinject.feature.p021.p022.C0279;
import com.cloudinject.p025.C0362;
import com.cloudinject.p025.p026.C0346;
import com.px.C0368;
import com.sadfxg.fasg.C0369;
import mirrorb.android.accounts.C0375;
import mirrorb.android.content.C0380;
import mirrorb.android.location.C0384;
import mirrorb.android.location.C0385;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.net.wifi.C0388;
import mirrorb.android.providers.C0391;
import mirrorb.com.android.internal.C0398;
import mirrorb.com.android.internal.app.C0394;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.inputmethod.C0396;
import mirrorb.java.lang.C0400;
import p027.p028.p029.C0420;

/* renamed from: com.android.internal.̗.̗̙, reason: contains not printable characters */
/* loaded from: classes3.dex */
class C0107 implements InterfaceC0106 {
    private IBinder mRemote;

    C0107(IBinder iBinder) {
        String str = "ۢۦۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752611) {
                case 1035:
                    return;
                case 1067:
                    if (C0088.m573() > 0) {
                        str = "ۢۦۢ";
                        break;
                    } else {
                        C0060.m216();
                        break;
                    }
                case 3389:
                    this.mRemote = iBinder;
                    if (C0396.m5741() < 0) {
                        str = "ۤۢۦ";
                        break;
                    } else {
                        str = "۟ۤۢ";
                        break;
                    }
            }
        }
    }

    /* renamed from: ۟ۤ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static IBinder m856(Object obj) {
        String str = "ۤۡ۠";
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1755555) {
                case 2245:
                    if (C0369.m3256() <= 0) {
                        iBinder = iBinder2;
                    } else {
                        str = "ۥۣ۟";
                        iBinder = iBinder2;
                        continue;
                    }
                case 2950:
                    if (C0400.m5961() > 0) {
                        str = "ۣۧۦ";
                    } else {
                        continue;
                    }
                case 3113:
                case 1709342:
                    if (C0179.m1427() <= 0) {
                        C0369.m3256();
                    } else {
                        str = "ۥۣ۟";
                        continue;
                    }
                case 3169:
                    str = "ۦۦۥ";
                    iBinder = null;
                    continue;
                case 26493:
                    iBinder2 = ((C0107) obj).mRemote;
                    if (C0228.m2012() <= 0) {
                        C0183.m1464();
                        str = "ۥ۠۟";
                    } else {
                        str = "ۦ۠۠";
                        continue;
                    }
                case 28162:
                    if (C0396.m5741() >= 0) {
                        C0400.m5961();
                    } else {
                        str = "ۧۥ۠";
                        continue;
                    }
                case 29600:
                    if (C0396.m5741() >= 0) {
                        break;
                    } else if (C0164.m1359() >= 0) {
                        C0183.m1464();
                        str = "ۣۣ۠";
                    } else {
                        str = "ۡۢ۟";
                    }
                case 30626:
                    return iBinder;
                case 32704:
                    if (C0384.m5278() <= 0) {
                        C0164.m1359();
                    } else {
                        str = "ۤۡ۠";
                        continue;
                    }
                case 32747:
                    break;
            }
            str = C0394.m5672() <= 0 ? "ۨۡۦ" : "۟ۤۦ";
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return m856(this);
    }

    public String getInterfaceDescriptor() {
        return C0385.m5310(C0398.m5846());
    }

    @Override // com.android.internal.p008.InterfaceC0106
    /* renamed from: ̗̙ */
    public void mo854(int[] iArr) throws RemoteException {
        Parcel parcelM5446 = null;
        String str = "ۣ۟ۢ";
        Parcel parcelM54462 = null;
        while (true) {
            switch (C0395.m5690((Object) str) ^ 1752519) {
                case 962:
                    try {
                        C0388.m5433(parcelM5446);
                        if (C0368.m3171() >= 0) {
                            break;
                        } else {
                            str = "ۣۤۢ";
                            break;
                        }
                    } catch (Throwable th) {
                        C0400.m5950(parcelM5446);
                        C0400.m5950(parcelM54462);
                        throw th;
                    }
                case 1889:
                    str = "ۣۤۢ";
                    break;
                case 2018:
                    C0400.m5950(parcelM5446);
                    if (C0183.m1464() > 0) {
                        str = "۠ۨ۠";
                        break;
                    } else {
                        C0400.m5961();
                        break;
                    }
                case 3009:
                    parcelM54462 = C0388.m5446();
                    if (C0400.m5961() > 0) {
                        str = "۟ۧۥ";
                        break;
                    } else {
                        C0206.m1807();
                        str = "۠ۡۤ";
                        break;
                    }
                case 4703:
                    if (C0083.m448() >= 0) {
                        break;
                    } else {
                        str = "ۣ۟ۢ";
                        break;
                    }
                case 5639:
                    C0078.m372(parcelM54462, iArr);
                    if (C0395.m5698() < 0) {
                        str = "ۦۣ۟";
                        break;
                    } else {
                        C0387.m5374();
                        str = "ۨۥۦ";
                        break;
                    }
                case 5663:
                    C0400.m5950(parcelM54462);
                    if (C0420.m6215() < 0) {
                        str = "ۤۡ";
                        break;
                    } else {
                        C0380.m5068();
                        break;
                    }
                case 6714:
                    parcelM5446 = C0388.m5446();
                    if (C0391.m5571() > 0) {
                        str = "ۧۧۡ";
                        break;
                    } else {
                        str = "ۣۧۡ";
                        break;
                    }
                case 31686:
                    C0375.m4886(parcelM54462, C0385.m5310(C0398.m5846()));
                    str = "۠ۧۧ";
                    break;
                case 31749:
                    C0346.m3042(m856(this), 1, parcelM54462, parcelM5446, 0);
                    if (C0060.m216() <= 0) {
                        break;
                    } else {
                        str = "ۥۣۣ";
                        break;
                    }
                case 32665:
                    if (C0206.m1807() < 0) {
                        str = "ۧۧۡ";
                        break;
                    } else {
                        C0184.m1524();
                        break;
                    }
                case 1728954:
                    return;
            }
        }
    }

    @Override // com.android.internal.p008.InterfaceC0106
    /* renamed from: ̗̙̖̖̙̖ */
    public int[] mo855() throws RemoteException {
        int iIntValue = 0;
        IBinder iBinderM856 = null;
        Parcel parcelM5446 = null;
        Parcel parcelM54462 = null;
        Integer num = null;
        int[] iArrM1518 = null;
        Object obj = "ۨۡ۟";
        while (true) {
            switch (C0395.m5690(obj) ^ 1750688) {
                case 1533:
                    try {
                        C0388.m5433(parcelM5446);
                        if (C0206.m1807() < 0) {
                            obj = "ۥۡۢ";
                            break;
                        } else {
                            C0362.m3122();
                            break;
                        }
                    } catch (Throwable th) {
                        C0400.m5950(parcelM5446);
                        C0400.m5950(parcelM54462);
                        throw th;
                    }
                case 2918:
                    iArrM1518 = C0184.m1518(parcelM5446);
                    obj = "ۣۧۤ";
                    break;
                case 4509:
                    parcelM54462 = C0388.m5446();
                    obj = "ۡۡۧ";
                    break;
                case 4512:
                    C0400.m5950(parcelM54462);
                    if (C0086.m500() <= 0) {
                        break;
                    } else {
                        obj = "۠۟";
                        break;
                    }
                case 6247:
                    parcelM5446 = C0388.m5446();
                    if (C0060.m216() > 0) {
                        obj = "ۧ۟ۥ";
                        break;
                    } else {
                        C0279.m2491();
                        break;
                    }
                case 6652:
                    iBinderM856 = m856(this);
                    obj = "ۨۨۥ";
                    break;
                case 7270:
                    C0346.m3042(iBinderM856, ((iIntValue ^ (-1)) & 3533718) | ((-3533719) & iIntValue), parcelM54462, parcelM5446, 0);
                    obj = "ۣۢۨ";
                    break;
                case 29480:
                    C0400.m5950(parcelM5446);
                    obj = "۟۟۠";
                    break;
                case 29613:
                    C0375.m4886(parcelM54462, C0385.m5310(C0398.m5846()));
                    if (C0025.m118() > 0) {
                        obj = "ۡۦۡ";
                        break;
                    } else {
                        obj = "۠ۡۡ";
                        break;
                    }
                case 29675:
                    obj = "ۨۡ۟";
                    break;
                case 29887:
                    obj = "ۧ۟ۥ";
                    break;
                case 30569:
                    obj = "ۣۧۤ";
                    break;
                case 32581:
                    iIntValue = ((Integer) new Object[]{num}[0]).intValue();
                    if (C0179.m1427() <= 0) {
                        break;
                    } else {
                        obj = "۠۟ۥ";
                        break;
                    }
                case 32678:
                    num = new Integer(3533716);
                    if (C0191.m1627() >= 0) {
                        break;
                    } else {
                        obj = "۟ۡ۟";
                        break;
                    }
                case 1731935:
                    return iArrM1518;
            }
        }
    }
}
