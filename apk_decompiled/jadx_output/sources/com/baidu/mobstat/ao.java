package com.baidu.mobstat;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.system.Os;
import android.text.TextUtils;
import com.baidu.mobstat.am;
import com.baidu.mobstat.bq;
import com.baidu.mobstat.bw;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ao extends am {
    bq.a d;
    private b e;

    static class a {
        static boolean a(bq.a aVar, bq bqVar) {
            if (Build.VERSION.SDK_INT < 23) {
                while (aVar != null && !aVar.b().equals(bqVar.a())) {
                    aVar.b().setExecutable(true, false);
                    aVar = aVar.d();
                }
                return true;
            }
            while (aVar != null) {
                if (!a(aVar.b())) {
                    return false;
                }
                aVar = aVar.d();
            }
            return a(bqVar.a());
        }

        private static boolean a(File file) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    int i = Os.stat(file.getAbsolutePath()).st_mode;
                    if ((i & 1) == 0) {
                        Os.chmod(file.getAbsolutePath(), i | 1);
                    }
                    return true;
                } catch (Throwable unused) {
                }
            }
            return false;
        }
    }

    class b {
        private long c;
        private bw.a d;
        private boolean e;
        private int g;
        private bt b = new bt();
        private boolean f = true;

        b() {
        }

        private boolean a(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    this.c = jSONObject.getLong("pub_lst_ts");
                    this.d = bw.a(jSONObject.getString("pub_info"));
                    this.g = jSONObject.getInt("d_form_ver");
                    this.e = false;
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        public long a() {
            return this.c;
        }

        public void a(long j) {
            if (this.c != j) {
                this.c = j;
                this.e = true;
            }
        }

        public void a(long j, long j2) {
            if (this.b.a(j, j2)) {
                this.e = true;
            }
        }

        public void a(bw.a aVar) {
            if (aVar.equals(this.d)) {
                return;
            }
            this.d = aVar;
            this.e = true;
        }

        public boolean a(PackageInfo packageInfo) {
            String strA = ao.this.d.a(new File(packageInfo.applicationInfo.dataDir)).a("pub.dat", true);
            this.f = false;
            return a(strA);
        }

        public bw.a b() {
            return this.d;
        }

        public boolean c() {
            return a(ao.this.d.a("pub.dat", true));
        }

        public boolean d() throws JSONException {
            if (!this.f) {
                throw new IllegalStateException();
            }
            if (this.e) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("pub_info", this.d.j());
                    jSONObject.put("pub_lst_ts", this.c);
                    jSONObject.put("d_form_ver", 1);
                    ao.this.d.a("pub.dat", jSONObject.toString(), true);
                    this.e = false;
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        public boolean e() {
            return ao.b(ao.this.d.b("pub.dat"), true);
        }
    }

    class c extends am.b {
        private int b;
        private String c;
        private long d;
        private long e;
        private long f;
        private bw.a g;

        public c(String str) {
            super(ao.this.d, str);
        }

        public void a(b bVar) {
            a(bVar.b());
            b(bVar.a());
        }

        @Override // com.baidu.mobstat.am.b
        public void a(JSONObject jSONObject) {
            this.c = jSONObject.getString(Config.INPUT_DEF_PKG);
            this.e = jSONObject.getInt("tar_pkg_lst_pub_ts");
            this.d = jSONObject.getLong("last_fe_ts");
            this.g = bw.a(jSONObject.getString(Config.LAUNCH_INFO));
            this.f = jSONObject.getLong("tar_pkg_lst_up_ts");
            this.b = jSONObject.getInt("d_form_ver");
        }

        public boolean a(long j) {
            if (this.d == j) {
                return false;
            }
            this.d = j;
            a(true);
            return true;
        }

        public boolean a(bw.a aVar) {
            if (aVar.equals(this.g)) {
                return false;
            }
            this.g = aVar;
            a(true);
            return true;
        }

        public boolean a(String str) {
            if (str.equals(this.c)) {
                return false;
            }
            this.c = str;
            a(true);
            return true;
        }

        @Override // com.baidu.mobstat.am.b
        public void b(JSONObject jSONObject) throws JSONException {
            jSONObject.put(Config.INPUT_DEF_PKG, this.c);
            jSONObject.put("last_fe_ts", this.d);
            jSONObject.put("tar_pkg_lst_pub_ts", this.e);
            jSONObject.put(Config.LAUNCH_INFO, this.g.j());
            jSONObject.put("tar_pkg_lst_up_ts", this.f);
            jSONObject.put("d_form_ver", 1);
        }

        public boolean b(long j) {
            if (this.e == j) {
                return false;
            }
            this.e = j;
            a(true);
            return true;
        }

        public String c() {
            return this.c;
        }

        public boolean c(long j) {
            if (this.f == j) {
                return false;
            }
            this.f = j;
            a(true);
            return true;
        }

        public bw.a d() {
            return this.g;
        }

        public long e() {
            return this.f;
        }
    }

    public ao() {
        super("isc", 8000000L);
        this.e = new b();
    }

    private am.e b(am.d dVar, bw.a aVar) {
        this.e.c();
        this.d.a();
        if (aVar.equals(this.e.b())) {
            return am.e.a();
        }
        this.e.a(aVar);
        this.e.a(System.currentTimeMillis());
        return am.e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(File file, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Os.chmod(file.getAbsolutePath(), z ? 436 : 432);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        try {
            if (z) {
                return file.setReadable(true, false);
            }
            return file.setReadable(false, false) && file.setReadable(true, true);
        } catch (Throwable unused2) {
            return false;
        }
    }

    private void c() {
        this.e.a(a.a(this.d, this.a.b) ? 1 : 2, 3L);
    }

    @Override // com.baidu.mobstat.am
    public am.e a(am.d dVar, bw.a aVar) throws JSONException {
        Context context = this.a.a;
        if (Build.VERSION.SDK_INT >= 28 && context.getApplicationInfo().targetSdkVersion >= 28) {
            return am.e.a(-100);
        }
        this.e.c();
        try {
            return b(dVar, aVar);
        } finally {
            this.e.d();
            c();
            this.e.d();
            this.e.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061 A[PHI: r2
      0x0061: PHI (r2v1 com.baidu.mobstat.ao$c) = 
      (r2v0 com.baidu.mobstat.ao$c)
      (r2v2 com.baidu.mobstat.ao$c)
      (r2v2 com.baidu.mobstat.ao$c)
      (r2v2 com.baidu.mobstat.ao$c)
     binds: [B:11:0x001b, B:13:0x002d, B:24:0x0054, B:25:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.baidu.mobstat.am
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.baidu.mobstat.am.g a(java.lang.String r12, com.baidu.mobstat.am.f r13) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r11 = this;
            com.baidu.mobstat.am$a r0 = r11.a
            android.content.Context r0 = r0.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r12, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lf
            goto L11
        Lf:
            r0 = r2
        L11:
            r3 = -2
            if (r0 != 0) goto L19
            com.baidu.mobstat.am$g r12 = com.baidu.mobstat.am.g.a(r3)
            return r12
        L19:
            boolean r4 = r13.a
            if (r4 == 0) goto L61
            com.baidu.mobstat.ao$c r2 = new com.baidu.mobstat.ao$c
            r2.<init>(r12)
            r2.a()
            java.lang.String r4 = r2.c()
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto L61
            com.baidu.mobstat.bw$a r4 = r2.d()
            long r5 = r0.lastUpdateTime
            long r7 = r2.e()
            r9 = 1
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L40
            r5 = 1
            goto L41
        L40:
            r5 = 0
        L41:
            if (r4 == 0) goto L54
            boolean r6 = r4.d()
            if (r6 == 0) goto L54
            java.lang.String r4 = r4.e()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L54
            r1 = 1
        L54:
            if (r5 == 0) goto L61
            if (r1 == 0) goto L61
            com.baidu.mobstat.bw$a r12 = r2.d()
        L5c:
            com.baidu.mobstat.am$g r12 = com.baidu.mobstat.am.g.a(r12)
            return r12
        L61:
            com.baidu.mobstat.ao$b r1 = new com.baidu.mobstat.ao$b
            r1.<init>()
            boolean r4 = r1.a(r0)
            if (r4 != 0) goto L71
            com.baidu.mobstat.am$g r12 = com.baidu.mobstat.am.g.a(r3)
            return r12
        L71:
            boolean r13 = r13.a
            if (r13 == 0) goto L8c
            if (r2 == 0) goto L8c
            r2.a(r1)
            long r3 = java.lang.System.currentTimeMillis()
            r2.a(r3)
            long r3 = r0.lastUpdateTime
            r2.c(r3)
            r2.a(r12)
            r2.b()
        L8c:
            com.baidu.mobstat.bw$a r12 = r1.b()
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mobstat.ao.a(java.lang.String, com.baidu.mobstat.am$f):com.baidu.mobstat.am$g");
    }

    @Override // com.baidu.mobstat.am
    public void a(am.c cVar) {
        this.d = this.b.a("isc");
    }
}
