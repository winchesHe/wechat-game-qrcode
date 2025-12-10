package com.baidu.mobstat;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.baidu.mobstat.cl;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CooperService implements ICooperService {
    private static CooperService a;
    private HeadObject b = new HeadObject();
    private boolean c = true;
    private String d = PropertyType.UID_PROPERTRY;
    private boolean e = false;
    private boolean f = true;

    @Override // com.baidu.mobstat.ICooperService
    public String getMTJSDKVersion() {
        return "4.0.7.6";
    }

    @Override // com.baidu.mobstat.ICooperService
    public int getTagValue() {
        return 1;
    }

    public void setZid(String str) {
    }

    public static synchronized CooperService instance() {
        if (a == null) {
            a = new CooperService();
        }
        return a;
    }

    public HeadObject getHeadObject() {
        return this.b;
    }

    @Override // com.baidu.mobstat.ICooperService
    public String getHost() {
        return Config.LOG_SEND_URL;
    }

    @Override // com.baidu.mobstat.ICooperService
    public void installHeader(Context context, JSONObject jSONObject) {
        this.b.installHeader(context, jSONObject);
    }

    public JSONObject getHeaderExt(Context context) {
        String strK = cp.a().k(context);
        if (!TextUtils.isEmpty(strK)) {
            try {
                return new JSONObject(strK);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public void setHeaderExt(Context context, ExtraInfo extraInfo) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (extraInfo != null) {
            jSONObject = extraInfo.dumpToJson();
        }
        this.b.setHeaderExt(jSONObject);
        cp.a().g(context, jSONObject.toString());
        if (extraInfo != null) {
            str = "Set global ExtraInfo: " + jSONObject;
        } else {
            str = "Clear global ExtraInfo";
        }
        cg.c().a(str);
    }

    public JSONObject getPushId(Context context) {
        String strL = cp.a().l(context);
        if (!TextUtils.isEmpty(strL)) {
            try {
                return new JSONObject(strL);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public void setPushId(Context context, String str, String str2, String str3) throws JSONException {
        String str4;
        JSONObject pushId = getPushId(context);
        if (pushId == null) {
            pushId = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str3)) {
                pushId.put(str, str3);
            } else {
                pushId.remove(str);
            }
        } catch (Exception unused) {
        }
        this.b.setPushInfo(pushId);
        cp.a().h(context, pushId.toString());
        if (str3 != null) {
            str4 = "Set platform:" + str2 + " pushId: " + str3;
        } else {
            str4 = "Clear platform:" + str2 + " pushId";
        }
        cg.c().a(str4);
    }

    public void setStartType(boolean z) {
        this.b.setStartType(z);
    }

    private static String a(Context context) {
        if (!cu.a().c()) {
            return Config.DEF_MAC_ID;
        }
        String strI = cw.i(context);
        return !TextUtils.isEmpty(strI) ? strI.replaceAll(Config.TRACE_TODAY_VISIT_SPLIT, "") : Config.DEF_MAC_ID;
    }

    private static String b(Context context) {
        if (!cu.a().c()) {
            return "";
        }
        String strH = cw.h(context);
        return !TextUtils.isEmpty(strH) ? strH.replaceAll(Config.TRACE_TODAY_VISIT_SPLIT, "") : strH;
    }

    public String getPhoneAddress(Context context, boolean z) {
        String strReplace = Config.DEF_MAC_ID.replace(Config.TRACE_TODAY_VISIT_SPLIT, "");
        if (!z && Build.VERSION.SDK_INT >= 23) {
            return getSecretValue(strReplace);
        }
        if (!TextUtils.isEmpty(this.b.q)) {
            return this.b.q;
        }
        String strH = cp.a().h(context);
        if (!TextUtils.isEmpty(strH)) {
            this.b.q = strH;
            return this.b.q;
        }
        String strA = a(context, z);
        if (!TextUtils.isEmpty(strA) && !strReplace.equals(strA)) {
            this.b.q = getSecretValue(strA);
            cp.a().e(context, this.b.q);
            return this.b.q;
        }
        this.b.q = "";
        return this.b.q;
    }

    private String a(Context context, boolean z) {
        String strA;
        if (z) {
            strA = b(context);
        } else {
            strA = a(context);
        }
        return TextUtils.isEmpty(strA) ? "" : strA;
    }

    public String getMacIdForTv(Context context) throws Throwable {
        if (!cu.a().c()) {
            return "";
        }
        if (!TextUtils.isEmpty(this.b.r)) {
            return this.b.r;
        }
        String strJ = cp.a().j(context);
        if (!TextUtils.isEmpty(strJ)) {
            this.b.r = strJ;
            return this.b.r;
        }
        String strI = cw.i(1, context);
        if (!TextUtils.isEmpty(strI)) {
            this.b.r = strI;
            cp.a().f(context, strI);
            return this.b.r;
        }
        this.b.r = "";
        return this.b.r;
    }

    @Override // com.baidu.mobstat.ICooperService
    public String getCUID(Context context, boolean z) {
        cp.a().b(context, "");
        if (this.b.f == null || "".equalsIgnoreCase(this.b.f)) {
            try {
                this.b.f = cx.a(context);
                Matcher matcher = Pattern.compile("\\s*|\t|\r|\n").matcher(this.b.f);
                this.b.f = matcher.replaceAll("");
                HeadObject headObject = this.b;
                headObject.f = getSecretValue(headObject.f);
            } catch (Exception unused) {
            }
        }
        if (z) {
            return this.b.f;
        }
        try {
            String str = this.b.f;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new String(cl.b.b(1, co.a(str.getBytes())));
        } catch (Exception unused2) {
            return null;
        }
    }

    public String getDevicImei(Context context) {
        if (!cu.a().c()) {
            return "";
        }
        try {
            return cn.e(context, "android.permission.READ_PHONE_STATE") ? ((TelephonyManager) context.getSystemService("phone")).getDeviceId() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    @Override // com.baidu.mobstat.ICooperService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getDeviceId(android.telephony.TelephonyManager r12, android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mobstat.CooperService.getDeviceId(android.telephony.TelephonyManager, android.content.Context):java.lang.String");
    }

    public boolean filterCuid(Context context, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2 = "";
        String strReplace = str.replace(Config.TRACE_TODAY_VISIT_SPLIT, "");
        if (strReplace.equals(Config.DEF_MAC_ID.replace(Config.TRACE_TODAY_VISIT_SPLIT, ""))) {
            if (TextUtils.isEmpty(this.b.f)) {
                this.b.i = getSecretValue(c(context));
                return true;
            }
            try {
                str2 = new String(cl.b.b(1, co.a(this.b.f.getBytes())));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (TextUtils.isEmpty(str2)) {
                this.b.i = getSecretValue(c(context));
                z = true;
            } else {
                this.b.i = getSecretValue(strReplace);
            }
            return z;
        }
        this.b.i = getSecretValue(strReplace);
        return true;
    }

    private String c(Context context) {
        String strE = cp.a().e(context);
        if (!TextUtils.isEmpty(strE) && !strE.equals(Config.NULL_DEVICE_ID)) {
            return strE;
        }
        String str = "hol" + (new Date().getTime() + "").hashCode() + "mes";
        cp.a().a(context, str);
        return str;
    }

    public String getPlainDeviceIdForCar(Context context) {
        String strOptUUID = CarUUID.optUUID(context);
        if (TextUtils.isEmpty(strOptUUID)) {
            strOptUUID = c(context);
        }
        return TextUtils.isEmpty(strOptUUID) ? "" : strOptUUID;
    }

    @Override // com.baidu.mobstat.ICooperService
    public String getAppChannel(Context context) {
        return d(context);
    }

    private String d(Context context) {
        try {
            if (this.b.l == null || this.b.l.equals("")) {
                boolean zG = cp.a().g(context);
                if (zG) {
                    this.b.l = cp.a().f(context);
                }
                if (!zG || this.b.l == null || this.b.l.equals("")) {
                    this.b.l = cw.a(context, Config.CHANNEL_META_NAME);
                }
            }
        } catch (Exception unused) {
        }
        return this.b.l;
    }

    @Override // com.baidu.mobstat.ICooperService
    public String getAppKey(Context context) {
        if (this.b.e == null) {
            this.b.e = cw.a(context, Config.APPKEY_META_NAME);
        }
        return this.b.e;
    }

    @Override // com.baidu.mobstat.ICooperService
    public int getAppVersionCode(Context context) {
        if (this.b.g == -1) {
            this.b.g = cw.f(context);
        }
        return this.b.g;
    }

    @Override // com.baidu.mobstat.ICooperService
    public String getAppVersionName(Context context) {
        if (TextUtils.isEmpty(this.b.h)) {
            this.b.h = cw.g(context);
        }
        return this.b.h;
    }

    public void setAppVersionName(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.h = str;
    }

    @Override // com.baidu.mobstat.ICooperService
    public String getOperator(TelephonyManager telephonyManager) {
        if (TextUtils.isEmpty(this.b.m)) {
            this.b.m = telephonyManager.getNetworkOperator();
        }
        return this.b.m;
    }

    @Override // com.baidu.mobstat.ICooperService
    public String getLinkedWay(Context context) {
        if (TextUtils.isEmpty(this.b.p)) {
            this.b.p = cw.o(context);
        }
        return this.b.p;
    }

    @Override // com.baidu.mobstat.ICooperService
    public String getOSVersion() {
        if (TextUtils.isEmpty(this.b.b)) {
            this.b.b = Integer.toString(Build.VERSION.SDK_INT);
        }
        return this.b.b;
    }

    public String getOSSysVersion() {
        if (TextUtils.isEmpty(this.b.c)) {
            this.b.c = Build.VERSION.RELEASE;
        }
        return this.b.c;
    }

    @Override // com.baidu.mobstat.ICooperService
    public String getPhoneModel() {
        if (TextUtils.isEmpty(this.b.n)) {
            this.b.n = android.os.Build.MODEL;
        }
        return this.b.n;
    }

    public String getManufacturer() {
        if (TextUtils.isEmpty(this.b.o)) {
            this.b.o = android.os.Build.MANUFACTURER;
        }
        return this.b.o;
    }

    @Override // com.baidu.mobstat.ICooperService
    public boolean checkWifiLocationSetting(Context context) {
        return "true".equalsIgnoreCase(cw.a(context, Config.GET_WIFI_LOCATION));
    }

    @Override // com.baidu.mobstat.ICooperService
    public String getSecretValue(String str) {
        return cl.b.c(1, str.getBytes());
    }

    public String getUUID() {
        return UUID.randomUUID().toString().replace(HelpFormatter.DEFAULT_OPT_PREFIX, "");
    }

    public void resetHeadSign() {
        this.b.x = instance().getUUID();
    }

    public void enableDeviceMac(Context context, boolean z) {
        cp.a().d(context, z);
    }

    public boolean isDeviceMacEnabled(Context context) {
        return cp.a().m(context);
    }

    public void setUserId(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (str.length() > 256) {
            str = str.substring(0, 256);
        }
        cp.a().i(context, str);
        this.b.setUserId(str);
        cg.c().a("Set user id " + str);
    }

    public String getUserId(Context context) {
        return cp.a().n(context);
    }

    public String getLastUserId(Context context) {
        return cp.a().o(context);
    }

    public void setLastUserId(Context context, String str) {
        cp.a().j(context, str);
    }

    public void setUserProperty(Context context, Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        boolean z = false;
        try {
        } catch (Exception e) {
            cg.c().c("[Exception] " + e.getMessage());
            e.printStackTrace();
        }
        if (map == null) {
            cp.a().l(context, "");
            this.b.setUserProperty("");
            return;
        }
        if (map.size() > 100) {
            cg.c().c("[WARNING] setUserProperty failed,map size can not over 100 !");
            return;
        }
        boolean z2 = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            String key = entry.getKey();
            String value = entry.getValue();
            if (TextUtils.isEmpty(key) || value == null) {
                cg.c().c("[WARNING] setUserProperty failed,key or value can not null !");
            } else {
                if (key.length() <= 256 && (TextUtils.isEmpty(value) || value.length() <= 256)) {
                    jSONArray.put(value);
                    jSONArray.put("1");
                    jSONObject.put(key, jSONArray);
                }
                cg.c().c("[WARNING] setUserProperty failed,key or value can not over 256 bytes !");
            }
            z2 = false;
        }
        z = z2;
        if (z) {
            cp.a().l(context, jSONObject.toString());
            this.b.setUserProperty(jSONObject.toString());
        }
    }

    public void setHeaderPy(String str) {
        this.b.setHeaderPy(str);
    }

    public boolean isEnabledAutoEvent() {
        return this.c;
    }

    public void setEnableAutoEvent(boolean z) {
        this.c = z;
    }

    public void setPlatformType(int i) {
        this.d = i + "";
    }

    public String getPlatformType() {
        return this.d;
    }

    public boolean isCloseTrace() {
        return this.e;
    }

    public void closeTrace() {
        this.e = true;
    }

    public boolean isEnableDownloadJs() {
        return this.f;
    }

    public void setEnableDownloadJs(boolean z) {
        this.f = z;
    }

    public boolean isEnableBplus(Context context) {
        return cp.a().t(context);
    }

    public void setEnableBplus(Context context, boolean z) {
        cp.a().e(context, z);
    }
}
