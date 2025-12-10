package com.baidu.mobstat;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.baidu.mobstat.Config;
import com.baidu.mobstat.ca;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cc {
    private static cc b = new cc();
    private static String l = "";
    public a a;
    private Handler d;
    private volatile int e;
    private int f;
    private HandlerThread c = new HandlerThread("fullTraceHandleThread");
    private JSONObject g = new JSONObject();
    private JSONArray h = new JSONArray();
    private JSONArray i = new JSONArray();
    private JSONArray j = new JSONArray();
    private JSONArray k = new JSONArray();
    private boolean m = false;
    private List<JSONObject> n = new ArrayList();
    private List<String> o = new ArrayList();
    private List<String> p = new ArrayList();

    public interface a {
        void a(JSONObject jSONObject);
    }

    private void a(JSONObject jSONObject) {
    }

    public static cc a() {
        return b;
    }

    private cc() {
        this.c.start();
        this.c.setPriority(10);
        this.d = new Handler(this.c.getLooper());
    }

    public void a(final Context context, final String str, final String str2, final String str3, final int i, final long j, final String str4, final JSONArray jSONArray, final String str5, final JSONArray jSONArray2, final String str6, final Map<String, String> map, final boolean z, final JSONObject jSONObject, final String str7, final JSONArray jSONArray3) {
        if (cu.a().d()) {
            this.d.post(new Runnable() { // from class: com.baidu.mobstat.cc.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long sessionStartTime = BDStatCore.instance().getSessionStartTime();
                    if (sessionStartTime <= 0) {
                        return;
                    }
                    cc.this.a(context, sessionStartTime, str, str2, str3, i, j, str4, jSONArray, str5, jSONArray2, str6, map, z, jSONObject, str7, jSONArray3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, long j, String str, String str2, String str3, int i, long j2, String str4, JSONArray jSONArray, String str5, JSONArray jSONArray2, String str6, Map<String, String> map, boolean z, JSONObject jSONObject, String str7, JSONArray jSONArray3) throws JSONException {
        a(context, EventAnalysis.getEvent(context, j, str, str2, str3, i, j2, 0L, "", null, null, cj.a(str4), cj.a(str5), str6, Config.EventViewType.EDIT.getValue(), 3, null, map, cj.c(jSONArray), cj.d(jSONArray2), z, jSONObject, str7, jSONArray3));
        b(context);
    }

    private void a(Context context, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        if (ci.c().b()) {
            ci.c().a("putEvent: " + jSONObject.toString());
        }
        String string = jSONObject.toString();
        if (b(context, string)) {
            if (ci.c().b()) {
                ci.c().a("checkExceedLogLimit exceed:true; mCacheLogSize: " + this.e + "; addedSize:" + string.length());
            }
            c(context);
        }
        try {
            jSONObject.put(Config.EVENT_NEXT_PAGENAME, "");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        EventAnalysis.doEventMerge(this.h, jSONObject);
    }

    private boolean b(Context context, String str) {
        return (str != null ? str.getBytes().length : 0) + this.e > 184320;
    }

    public void a(Context context, boolean z) {
        try {
            if (z) {
                c();
            } else {
                b();
            }
            try {
                b(context, this.g);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.h.length() == 0 && this.i.length() == 0 && this.j.length() == 0 && this.k.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Config.HEADER_PART, this.g);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            jSONObject.put(Config.PRINCIPAL_PART, this.i);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            jSONObject.put(Config.EVENT_PART, this.h);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            jSONObject.put(Config.FEED_LIST_PART, this.j);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            jSONObject.put("sv", this.k);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        try {
            jSONObject.put(Config.EVENT_PAGE_MAPPING, ca.a().a(ca.a.b));
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        try {
            jSONObject.put(Config.EVENT_PATH_MAPPING, ca.a().a(ca.a.a));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        try {
            jSONObject.put(Config.FEED_LIST_MAPPING, ca.a().a(ca.a.c));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            jSONObject.put(Config.PYD, l);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        c(context, jSONObject);
        a(jSONObject);
        String string = jSONObject.toString();
        if (ci.c().b()) {
            ci.c().a("saveCurrentCacheToSend content: " + string);
        }
        c(context, string);
        b(context, !z);
        this.m = true;
    }

    public void b(Context context, boolean z) {
        this.g = new JSONObject();
        a(context);
        this.i = new JSONArray();
        this.h = new JSONArray();
        this.j = new JSONArray();
        this.k = new JSONArray();
        if (!z) {
            ca.a().b();
        }
        b(context);
    }

    public void a(Context context) {
        CooperService.instance().getHeadObject().installHeader(context, this.g);
    }

    public void b(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(Config.HEADER_PART, new JSONObject(this.g.toString()));
                jSONObject.put(Config.PRINCIPAL_PART, new JSONArray(this.i.toString()));
                jSONObject.put(Config.EVENT_PART, new JSONArray(this.h.toString()));
                jSONObject.put(Config.FEED_LIST_PART, new JSONArray(this.j.toString()));
                jSONObject.put("sv", new JSONArray(this.k.toString()));
                jSONObject.put(Config.PYD, l);
                jSONObject.put(Config.EVENT_PAGE_MAPPING, ca.a().a(ca.a.b));
                jSONObject.put(Config.EVENT_PATH_MAPPING, ca.a().a(ca.a.a));
                jSONObject.put(Config.FEED_LIST_MAPPING, ca.a().a(ca.a.c));
            } catch (Exception e) {
                e.printStackTrace();
            }
            String string = jSONObject.toString();
            int length = string.getBytes().length;
            if (length >= 184320) {
                return;
            }
            this.e = length;
            cn.a(context, cw.q(context) + Config.STAT_FULL_CACHE_FILE_NAME, string, false);
        } catch (Throwable th) {
            th.printStackTrace();
            StatService.closeTrace();
        }
    }

    private void b(Context context, JSONObject jSONObject) throws JSONException {
        CooperService.instance().getHeadObject().installHeader(context, jSONObject);
        try {
            jSONObject.put("t", System.currentTimeMillis());
            jSONObject.put(Config.SEQUENCE_INDEX, this.f);
            jSONObject.put("ss", BDStatCore.instance().getSessionStartTime());
            jSONObject.put("at", "1");
            jSONObject.put("sign", CooperService.instance().getUUID());
            jSONObject.put(Config.PY, DataCore.instance().getHeadSessionPy());
            jSONObject.put(Config.PLT, CooperService.instance().getPlatformType());
        } catch (Exception unused) {
        }
    }

    private void c(Context context) {
        this.i = a(this.i, BDStatCore.instance().getPageSessionHead());
        a(context, false);
        b();
    }

    private void b() {
        this.f++;
    }

    private void c() {
        this.f = 0;
    }

    private void c(Context context, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(Config.TRACE_FAILED_CNT, 0);
        } catch (Exception unused) {
        }
        try {
            jSONObject.put(Config.TRACE_PART, jSONObject2);
        } catch (Exception unused2) {
        }
    }

    private void c(Context context, String str) throws IOException {
        LogSender.instance().saveLogData(context, str, true);
        if (this.a != null) {
            try {
                this.a.a(new JSONObject(str));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONArray a(org.json.JSONArray r6, org.json.JSONObject r7) throws org.json.JSONException {
        /*
            r5 = this;
            if (r7 == 0) goto L67
            if (r6 != 0) goto L6
            goto L67
        L6:
            java.lang.String r0 = "s"
            long r0 = r7.optLong(r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L13
            return r6
        L13:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            int r1 = r6.length()
            java.lang.String r2 = "p"
            r3 = 0
            if (r1 != 0) goto L3e
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Exception -> L36
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L36
            r7.<init>(r6)     // Catch: java.lang.Exception -> L36
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Exception -> L33
            r6.<init>()     // Catch: java.lang.Exception -> L33
            r7.put(r2, r6)     // Catch: java.lang.Exception -> L33
            goto L38
        L33:
            r3 = r7
            goto L37
        L36:
        L37:
            r7 = r3
        L38:
            if (r7 == 0) goto L66
            r0.put(r7)
            goto L66
        L3e:
            r1 = 0
            org.json.JSONObject r6 = r6.getJSONObject(r1)     // Catch: java.lang.Exception -> L44
            goto L45
        L44:
            r6 = r3
        L45:
            if (r6 == 0) goto L4c
            org.json.JSONArray r6 = r6.getJSONArray(r2)     // Catch: java.lang.Exception -> L4c
            goto L4d
        L4c:
            r6 = r3
        L4d:
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L5f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5f
            r1.<init>(r7)     // Catch: java.lang.Exception -> L5f
            if (r6 == 0) goto L61
            r1.put(r2, r6)     // Catch: java.lang.Exception -> L5c
            goto L61
        L5c:
            r3 = r1
            goto L60
        L5f:
        L60:
            r1 = r3
        L61:
            if (r1 == 0) goto L66
            r0.put(r1)
        L66:
            return r0
        L67:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mobstat.cc.a(org.json.JSONArray, org.json.JSONObject):org.json.JSONArray");
    }

    public void a(Context context, String str) {
        JSONArray jSONArray = this.h;
        if (jSONArray == null || jSONArray.length() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (str.length() > 1024) {
                str = str.substring(0, 1024);
            }
            JSONObject jSONObject = (JSONObject) this.h.get(r1.length() - 1);
            if (jSONObject != null) {
                String strOptString = jSONObject.optString(Config.EVENT_NEXT_PAGENAME);
                long jOptLong = jSONObject.optLong("t");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - jOptLong <= 1500 && TextUtils.isEmpty(strOptString)) {
                    jSONObject.put(Config.EVENT_NEXT_PAGENAME, str + "|" + jCurrentTimeMillis);
                    JSONArray jSONArray2 = this.h;
                    jSONArray2.put(jSONArray2.length() + (-1), jSONObject);
                    b(context);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
