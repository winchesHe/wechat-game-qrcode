package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w {
    private static w a;
    private Context b;
    private JSONObject c = new JSONObject();
    private long d = 24;
    private long e = 0;
    private long f = 0;
    private long g = 0;
    private long h = 5;
    private long i = 24;
    private long j = 15;
    private long k = 15;
    private long l = 30;
    private long m = 12;
    private long n = 1;
    private long o = 24;
    private String p = "";
    private String q = "";

    public static w a(Context context) {
        if (a == null) {
            synchronized (w.class) {
                if (a == null) {
                    a = new w(context);
                }
            }
        }
        return a;
    }

    private w(Context context) {
        this.b = context;
        m();
        j();
        k();
    }

    private void m() {
        String strA = cn.a(this.b, y.d);
        try {
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            this.c = new JSONObject(strA);
        } catch (Exception unused) {
        }
    }

    public boolean a() {
        return this.e != 0;
    }

    public boolean b() {
        return this.f != 0;
    }

    public long c() {
        return this.d * 60 * 60 * 1000;
    }

    public long d() {
        return this.o * 60 * 60 * 1000;
    }

    public long e() {
        return this.h * 60 * 1000;
    }

    public long f() {
        return this.i * 60 * 60 * 1000;
    }

    public long g() {
        return this.j * 24 * 60 * 60 * 1000;
    }

    public long h() {
        return this.k * 24 * 60 * 60 * 1000;
    }

    public long i() {
        return this.m * 60 * 60 * 1000;
    }

    public void j() {
        try {
            String str = new String(cv.b(false, cq.a(), co.a(cn.a(this.b, ".config2").getBytes())));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            try {
                this.e = jSONObject.getLong("c");
            } catch (JSONException e) {
                cf.c().b(e);
            }
            try {
                this.h = jSONObject.getLong("d");
            } catch (JSONException e2) {
                cf.c().b(e2);
            }
            try {
                this.i = jSONObject.getLong("e");
            } catch (JSONException e3) {
                cf.c().b(e3);
            }
            try {
                this.j = jSONObject.getLong("i");
            } catch (JSONException e4) {
                cf.c().b(e4);
            }
            try {
                this.d = jSONObject.getLong("f");
            } catch (JSONException e5) {
                cf.c().b(e5);
            }
            try {
                this.o = jSONObject.getLong("s");
            } catch (JSONException e6) {
                cf.c().b(e6);
            }
            try {
                this.k = jSONObject.getLong("pk");
            } catch (JSONException e7) {
                cf.c().b(e7);
            }
            try {
                this.l = jSONObject.getLong("at");
            } catch (JSONException e8) {
                cf.c().b(e8);
            }
            try {
                this.m = jSONObject.getLong("as");
            } catch (JSONException e9) {
                cf.c().b(e9);
            }
            try {
                this.n = jSONObject.getLong("ac");
            } catch (JSONException e10) {
                cf.c().b(e10);
            }
            try {
                this.f = jSONObject.getLong(Config.DEVICE_MAC_ID);
            } catch (JSONException e11) {
                cf.c().b(e11);
            }
            try {
                this.g = jSONObject.getLong("lsc");
            } catch (JSONException e12) {
                cf.c().b(e12);
            }
        } catch (Exception e13) {
            cf.c().b(e13);
        }
    }

    public void k() {
        try {
            String str = new String(cv.b(false, cq.a(), co.a(cn.a(this.b, ".sign").getBytes())));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            try {
                this.q = jSONObject.getString("sign");
            } catch (Exception e) {
                cf.c().b(e);
            }
            try {
                this.p = jSONObject.getString("ver");
            } catch (Exception e2) {
                cf.c().b(e2);
            }
        } catch (Exception e3) {
            cf.c().b(e3);
        }
    }

    public void a(String str) {
        cn.a(this.b, ".config2", str, false);
        j();
    }

    public void b(String str) {
        cn.a(this.b, ".sign", str, false);
        k();
    }

    public long a(g gVar) throws JSONException {
        long j = gVar.j;
        try {
            String string = gVar.toString();
            if (this.c.has(string)) {
                j = this.c.getLong(string);
            }
        } catch (Exception e) {
            cf.c().a(e);
        }
        return b(j);
    }

    public void a(g gVar, long j) {
        gVar.j = j;
        try {
            this.c.put(gVar.toString(), j);
        } catch (Exception e) {
            cf.c().a(e);
        }
        try {
            cn.a(this.b, y.d, this.c.toString(), false);
        } catch (Exception e2) {
            cf.c().a(e2);
        }
    }

    public boolean l() throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jA = a(g.LAST_SEND);
        long jD = d();
        cf.c().a("canSend now=" + jCurrentTimeMillis + ";lastSendTime=" + jA + ";sendLogTimeInterval=" + jD);
        return jCurrentTimeMillis - jA > jD || !a(jA);
    }

    public boolean a(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        return simpleDateFormat.format(Long.valueOf(j)).equals(simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
    }

    private long b(long j) {
        if (j - System.currentTimeMillis() > 0) {
            return 0L;
        }
        return j;
    }
}
