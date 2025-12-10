package com.baidu.mobstat;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {
    public static JSONObject a(Context context) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("s", Build.VERSION.SDK_INT);
            jSONObject.put("sv", Build.VERSION.RELEASE);
            String strB = cu.a().b();
            if (TextUtils.isEmpty(strB)) {
                strB = cw.a(2, context);
            }
            jSONObject.put(Config.CUID_SEC, strB);
            jSONObject.put(Config.DEVICE_WIDTH, cw.c(context));
            jSONObject.put("h", cw.d(context));
            jSONObject.put("ly", z.c);
            jSONObject.put("pv", "35");
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                jSONObject.put(Config.PACKAGE_NAME, cw.n(2, context));
                jSONObject.put(Config.APP_VERSION_CODE, packageInfo.versionCode);
                jSONObject.put("n", packageInfo.versionName);
            } catch (Exception e) {
                cf.c().a(e);
            }
            jSONObject.put(Config.DEVICE_MAC_ID, cw.h(2, context));
            jSONObject.put(Config.DEVICE_BLUETOOTH_MAC, cw.l(2, context));
            jSONObject.put(Config.MODEL, android.os.Build.MODEL);
            jSONObject.put(Config.DEVICE_NAME, cw.a(context, 2));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Config.TRACE_FAILED_CNT, 0);
            jSONObject2.put("send_index", 0);
            String strB2 = cw.b();
            if (strB2 == null) {
                strB2 = "";
            }
            jSONObject2.put(Config.ROM, strB2);
            jSONObject.put(Config.TRACE_PART, jSONObject2);
            jSONObject.put(Config.DEVICE_IMEI, cw.u(context));
            jSONObject.put(Config.OAID, cw.b(2, context));
            jSONObject.put(Config.OUT_OAID, cw.c(2, context));
            jSONObject.put("from", PropertyType.UID_PROPERTRY);
            jSONObject.put(Config.GAID, cw.e(2, context));
            jSONObject.put(Config.IID, cw.d(2, context));
            jSONObject.put(Config.CUID3, cw.f(2, context));
            jSONObject.put(Config.SSAID, cw.g(2, context));
        } catch (JSONException e2) {
            cf.c().b(e2);
        }
        return jSONObject;
    }

    public static JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray jSONArray = (JSONArray) jSONObject.get("payload");
            JSONObject jSONObject2 = (jSONArray == null || jSONArray.length() <= 0) ? null : (JSONObject) jSONArray.get(0);
            if (jSONObject2 != null) {
                return jSONObject2.getJSONObject(Config.HEADER_PART);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void b(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(Config.TRACE_PART);
            jSONObject2.put(Config.TRACE_FAILED_CNT, jSONObject2.getLong(Config.TRACE_FAILED_CNT) + 1);
        } catch (Exception unused) {
        }
    }

    public static void c(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(Config.TRACE_PART);
            jSONObject2.put("send_index", jSONObject2.getLong("send_index") + 1);
        } catch (Exception unused) {
        }
    }
}
