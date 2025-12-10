package com.baidu.mobstat;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.muhua.wz.util.DialogUtil;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x {
    public static final x a = new x();

    public void a(Context context, JSONObject jSONObject) {
        cf.c().a("startDataAnynalyzed start");
        a(jSONObject);
        w wVarA = w.a(context);
        boolean zA = wVarA.a();
        cf.c().a("is data collect closed:" + zA);
        if (!zA) {
            if (!k.a.b(context, DialogUtil.CANCELABLE_DELAY_TIME)) {
                c(context);
            }
            String str = android.os.Build.MANUFACTURER;
            boolean z = !TextUtils.isEmpty(str) && "huawei".equals(str.trim().toLowerCase()) && Build.VERSION.SDK_INT >= 28;
            if (!k.b.b(context, DialogUtil.CANCELABLE_DELAY_TIME) && !z) {
                d(context);
            }
            if (!k.c.b(context, DialogUtil.CANCELABLE_DELAY_TIME) && !z) {
                e(context);
            }
            if (z.e && !k.e.b(context, DialogUtil.CANCELABLE_DELAY_TIME) && !z) {
                f(context);
            }
            boolean zN = cw.n(context);
            if (zN && wVarA.l()) {
                cf.c().a("sendLog");
                g(context);
            } else if (!zN) {
                cf.c().a("isWifiAvailable = false, will not sendLog");
            } else {
                cf.c().a("can not sendLog due to time stratergy");
            }
        }
        cf.c().a("startDataAnynalyzed finished");
    }

    private void a(JSONObject jSONObject) {
        aa aaVar = new aa(jSONObject);
        z.b = aaVar.a;
        z.c = aaVar.b;
        z.d = aaVar.c;
    }

    private void c(Context context) throws JSONException {
        cf.c().a("collectAPWithStretegy 1");
        w wVarA = w.a(context);
        long jA = wVarA.a(g.AP_LIST);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jE = wVarA.e();
        cf.c().a("now time: " + jCurrentTimeMillis + ": last time: " + jA + "; time interval: " + jE);
        if (jA == 0 || jCurrentTimeMillis - jA > jE) {
            cf.c().a("collectAPWithStretegy 2");
            c.a(context);
        }
    }

    private void d(Context context) throws JSONException {
        cf.c().a("collectAPPListWithStretegy 1");
        long jCurrentTimeMillis = System.currentTimeMillis();
        w wVarA = w.a(context);
        long jA = wVarA.a(g.APP_USER_LIST);
        long jF = wVarA.f();
        cf.c().a("now time: " + jCurrentTimeMillis + ": last time: " + jA + "; userInterval : " + jF);
        if (jA == 0 || jCurrentTimeMillis - jA > jF || !wVarA.a(jA)) {
            cf.c().a("collectUserAPPListWithStretegy 2");
            c.a(context, false);
        }
        long jA2 = wVarA.a(g.APP_SYS_LIST);
        long jG = wVarA.g();
        cf.c().a("now time: " + jCurrentTimeMillis + ": last time: " + jA2 + "; sysInterval : " + jG);
        if (jA2 == 0 || jCurrentTimeMillis - jA2 > jG) {
            cf.c().a("collectSysAPPListWithStretegy 2");
            c.a(context, true);
        }
    }

    private void e(Context context) throws JSONException {
        cf.c().a("collectAPPTraceWithStretegy 1");
        long jCurrentTimeMillis = System.currentTimeMillis();
        w wVarA = w.a(context);
        long jA = wVarA.a(g.APP_TRACE_HIS);
        long jI = wVarA.i();
        cf.c().a("now time: " + jCurrentTimeMillis + ": last time: " + jA + "; time interval: " + jI);
        if (jA == 0 || jCurrentTimeMillis - jA > jI) {
            cf.c().a("collectAPPTraceWithStretegy 2");
            c.b(context, false);
        }
    }

    private void f(Context context) throws JSONException {
        cf.c().a("collectAPKWithStretegy 1");
        long jCurrentTimeMillis = System.currentTimeMillis();
        w wVarA = w.a(context);
        long jA = wVarA.a(g.APP_APK);
        long jH = wVarA.h();
        cf.c().a("now time: " + jCurrentTimeMillis + ": last time: " + jA + "; interval : " + jH);
        if (jA == 0 || jCurrentTimeMillis - jA > jH) {
            cf.c().a("collectAPKWithStretegy 2");
            c.b(context);
        }
    }

    public void a(Context context, String str) {
        w.a(context).a(str);
    }

    public void b(Context context, String str) {
        w.a(context).b(str);
    }

    public void a(Context context, long j) {
        w.a(context).a(g.LAST_UPDATE, j);
    }

    private void g(Context context) throws Throwable {
        w.a(context).a(g.LAST_SEND, System.currentTimeMillis());
        JSONObject jSONObjectA = h.a(context);
        cf.c().a("header: " + jSONObjectA);
        int i = 0;
        while (h(context)) {
            int i2 = i + 1;
            if (i > 0) {
                h.c(jSONObjectA);
            }
            b(context, jSONObjectA);
            i = i2;
        }
    }

    private boolean h(Context context) {
        return (k.a.b(context) && k.b.b(context) && k.c.b(context) && k.d.b(context) && k.e.b(context)) ? false : true;
    }

    private void b(Context context, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        int length = 0;
        try {
            jSONObject2.put(Config.HEADER_PART, jSONObject);
            length = 0 + jSONObject.toString().length();
        } catch (JSONException e) {
            cf.c().a(e);
        }
        cf.c().a("APP_MEM");
        if (!w.a(context).b()) {
            String strT = cw.t(context);
            JSONArray jSONArray = new JSONArray();
            cf.c().a(strT);
            jSONArray.put(strT);
            if (jSONArray.length() > 0) {
                try {
                    jSONObject2.put("app_mem3", jSONArray);
                    length += jSONArray.toString().length();
                } catch (JSONException e2) {
                    cf.c().a(e2);
                }
            }
        }
        cf.c().a("APP_APK");
        List<String> listA = k.e.a(context, 20480);
        JSONArray jSONArray2 = new JSONArray();
        for (String str : listA) {
            cf.c().a(str);
            jSONArray2.put(str);
        }
        if (jSONArray2.length() > 0) {
            try {
                jSONObject2.put("app_apk3", jSONArray2);
                length += jSONArray2.toString().length();
            } catch (JSONException e3) {
                cf.c().a(e3);
            }
        }
        cf.c().a("APP_CHANGE");
        List<String> listA2 = k.d.a(context, 10240);
        JSONArray jSONArray3 = new JSONArray();
        for (String str2 : listA2) {
            cf.c().a(str2);
            jSONArray3.put(str2);
        }
        if (jSONArray3.length() > 0) {
            try {
                jSONObject2.put("app_change3", jSONArray3);
                length += jSONArray3.toString().length();
            } catch (JSONException e4) {
                cf.c().a(e4);
            }
        }
        cf.c().a("APP_TRACE");
        List<String> listA3 = k.c.a(context, 15360);
        JSONArray jSONArray4 = new JSONArray();
        for (String str3 : listA3) {
            cf.c().a(str3);
            jSONArray4.put(str3);
        }
        if (jSONArray4.length() > 0) {
            try {
                jSONObject2.put("app_trace3", jSONArray4);
                length += jSONArray4.toString().length();
            } catch (JSONException e5) {
                cf.c().a(e5);
            }
        }
        cf.c().a("APP_LIST");
        List<String> listA4 = k.b.a(context, 46080);
        JSONArray jSONArray5 = new JSONArray();
        for (String str4 : listA4) {
            cf.c().a(str4);
            jSONArray5.put(str4);
        }
        if (jSONArray5.length() > 0) {
            try {
                jSONObject2.put("app_list3", jSONArray5);
                length += jSONArray5.toString().length();
            } catch (JSONException e6) {
                cf.c().a(e6);
            }
        }
        cf.c().a("AP_LIST");
        List<String> listA5 = k.a.a(context, 184320 - length);
        JSONArray jSONArray6 = new JSONArray();
        for (String str5 : listA5) {
            cf.c().a(str5);
            jSONArray6.put(str5);
        }
        if (jSONArray6.length() > 0) {
            try {
                jSONObject2.put("ap_list3", jSONArray6);
                length += jSONArray6.toString().length();
            } catch (JSONException e7) {
                cf.c().a(e7);
            }
        }
        cf.c().a("log in bytes is almost :" + length);
        JSONArray jSONArray7 = new JSONArray();
        jSONArray7.put(jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("payload", jSONArray7);
            r.a().a(context, jSONObject3.toString());
        } catch (Exception e8) {
            cf.c().a(e8);
        }
    }

    public boolean a(Context context) throws JSONException {
        if (!cw.c().booleanValue()) {
            return false;
        }
        w wVarA = w.a(context);
        long jA = wVarA.a(g.LAST_UPDATE);
        long jC = wVarA.c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jA > jC) {
            cf.c().a("need to update, checkWithLastUpdateTime lastUpdateTime =" + jA + "nowTime=" + jCurrentTimeMillis + ";timeInteveral=" + jC);
            return true;
        }
        cf.c().a("no need to update, checkWithLastUpdateTime lastUpdateTime =" + jA + "nowTime=" + jCurrentTimeMillis + ";timeInteveral=" + jC);
        return false;
    }

    public boolean b(Context context) {
        return !w.a(context).a() || a(context);
    }
}
