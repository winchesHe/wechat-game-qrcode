package com.baidu.mobstat;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class br {
    public String a;
    public String b;
    public int c = 2;
    private int d = 0;

    public static br a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        br brVar = new br();
        brVar.a = str;
        int length = TextUtils.isEmpty(str2) ? 0 : str2.length();
        brVar.d = length;
        if (length < 14) {
            if (TextUtils.isEmpty(str2)) {
                str2 = PropertyType.UID_PROPERTRY;
            }
            brVar.b = str2;
        }
        return brVar;
    }

    public static boolean a(int i) {
        return i >= 14;
    }

    public static boolean a(String str) {
        return TextUtils.isEmpty(str);
    }

    public static br b(String str) {
        return c(e(str));
    }

    private static br c(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            String str2 = PropertyType.UID_PROPERTRY;
            String strOptString = PropertyType.UID_PROPERTRY;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!d("ZGV2aWNlaWQ=").equals(next) && !d("dmVy").equals(next)) {
                    strOptString = jSONObject.optString(next, PropertyType.UID_PROPERTRY);
                }
            }
            String string = jSONObject.getString(d("ZGV2aWNlaWQ="));
            int i = jSONObject.getInt(d("dmVy"));
            int length = TextUtils.isEmpty(strOptString) ? 0 : strOptString.length();
            if (!TextUtils.isEmpty(string)) {
                br brVar = new br();
                brVar.a = string;
                brVar.c = i;
                brVar.d = length;
                if (length < 14) {
                    if (!TextUtils.isEmpty(strOptString)) {
                        str2 = strOptString;
                    }
                    brVar.b = str2;
                }
                brVar.d();
                return brVar;
            }
        } catch (JSONException e) {
            bu.a(e);
        }
        return null;
    }

    private static String d(String str) {
        return new String(bm.a(str.getBytes()));
    }

    private String e() {
        try {
            return new JSONObject().put(d("ZGV2aWNlaWQ="), this.a).put(d("aW1laQ=="), this.b).put(d("dmVy"), this.c).toString();
        } catch (JSONException e) {
            bu.a(e);
            return null;
        }
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrA = ax.a();
            return new String(at.b(bArrA, bArrA, bm.a(str.getBytes())));
        } catch (Exception e) {
            bu.a(e);
            return "";
        }
    }

    private static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrA = ax.a();
            return bm.a(at.a(bArrA, bArrA, str.getBytes()), "utf-8");
        } catch (UnsupportedEncodingException | Exception e) {
            bu.a(e);
            return "";
        }
    }

    boolean a() {
        return a(this.b);
    }

    boolean b() {
        return a(this.d);
    }

    public String c() {
        return f(e());
    }

    boolean d() {
        String str;
        if (b()) {
            str = "O";
        } else {
            if (!a()) {
                return false;
            }
            str = PropertyType.UID_PROPERTRY;
        }
        this.b = str;
        return true;
    }
}
