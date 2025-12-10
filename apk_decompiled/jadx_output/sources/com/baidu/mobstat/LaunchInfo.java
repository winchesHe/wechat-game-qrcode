package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class LaunchInfo {
    private String a;
    private String b;
    private String c;

    public String getPushLandingPage() {
        return !TextUtils.isEmpty(this.a) ? this.a : "";
    }

    public String getPushContent() {
        return !TextUtils.isEmpty(this.b) ? this.b : "";
    }

    public String getRefererPkgName() {
        return !TextUtils.isEmpty(this.c) ? this.c : "";
    }

    public void setPushInfo(String str, String str2) {
        this.a = str;
        this.b = cx.a(str2, 1024);
    }

    public void setRefererPkgName(String str) {
        this.c = str;
    }

    public int getLaunchType(Context context) {
        if (!TextUtils.isEmpty(this.a)) {
            return 2;
        }
        String packageName = context != null ? context.getPackageName() : "";
        if (TextUtils.isEmpty(this.c) || this.c.equals(packageName)) {
            return 0;
        }
        String strA = cj.a(context);
        return !TextUtils.isEmpty(strA) ? !this.c.equals(strA) ? 1 : 0 : !cj.a(context, this.c) ? 1 : 0;
    }

    public static JSONObject getConvertedJson(int i, String str, String str2) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
        }
        try {
            jSONObject.put(Config.LAUNCH_TYPE, String.valueOf(i));
            if (str == null) {
                str = "";
            }
            jSONObject.put(Config.LAUNCH_REFERER, str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put(Config.LAUNCH_INFO, str2);
            jSONObject.put("content", "");
            return jSONObject;
        } catch (Exception unused2) {
            jSONObject2 = jSONObject;
            return jSONObject2;
        }
    }

    public static String getLauncherHomePkgName(Context context) {
        String strA = cj.a(context);
        return !TextUtils.isEmpty(strA) ? strA : "";
    }
}
