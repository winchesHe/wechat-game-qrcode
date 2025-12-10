package com.baidu.mobstat;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.mobstat.am;
import com.baidu.mobstat.bq;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw {
    private static boolean b;
    private static String h;
    bl a;
    private Context c;
    private bq.a d;
    private volatile FileLock e;
    private volatile RandomAccessFile f;
    private an g;

    public static class a {
        public static final String[] a = {ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "O", PropertyType.UID_PROPERTRY};
        private String b;
        private String c;
        private String d;
        private long e;
        private String f;
        private boolean g;
        private String h;
        private String j;
        private boolean i = true;
        private int k = 1;

        public String a() {
            return this.b;
        }

        public void a(String str) {
            this.j = str;
        }

        public synchronized void a(boolean z) {
            this.i = z;
        }

        public String b() {
            return this.f;
        }

        public String c() {
            return this.c;
        }

        public boolean d() {
            return this.g;
        }

        public String e() {
            return this.h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.k == aVar.k && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.g == aVar.g && this.h.equals(aVar.h)) {
                String str = this.f;
                String str2 = aVar.f;
                if (str == str2) {
                    return true;
                }
                if (str != null && str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }

        public synchronized boolean f() {
            return this.i;
        }

        public String g() {
            return this.j;
        }

        public void h() {
            String strB = bw.b();
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            this.g = true;
            this.h = strB;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.b, this.c, this.d, Boolean.valueOf(this.g), this.h, this.f, Integer.valueOf(this.k)});
        }

        public br i() {
            br brVar = new br();
            brVar.a = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            if (ExifInterface.GPS_MEASUREMENT_INTERRUPTED.equals(this.c)) {
                sb.append(this.d);
            }
            if (!TextUtils.isEmpty(this.f)) {
                sb.append(this.f);
            }
            brVar.b = sb.toString().trim();
            return brVar;
        }

        public String j() throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dik", this.b);
                jSONObject.put("v270fk", this.c);
                jSONObject.put("cck", this.d);
                jSONObject.put("vsk", this.k);
                jSONObject.put("ctk", this.e);
                jSONObject.put("csk", this.g);
                if (!TextUtils.isEmpty(this.h)) {
                    jSONObject.put("pmk", this.h);
                }
                if (!TextUtils.isEmpty(this.j)) {
                    jSONObject.put("ock", this.j);
                }
                jSONObject.put("hrk", this.i);
                jSONObject.put("ek", this.f);
                return jSONObject.toString();
            } catch (JSONException e) {
                bu.a(e);
                return null;
            }
        }

        public String k() {
            String str = this.c;
            if (TextUtils.isEmpty(str)) {
                str = PropertyType.UID_PROPERTRY;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append("|");
            sb.append(str);
            if (ExifInterface.GPS_MEASUREMENT_INTERRUPTED.equals(str)) {
                sb.append(this.d);
            }
            if (!TextUtils.isEmpty(this.f)) {
                sb.append(this.f);
            }
            return sb.toString().trim();
        }
    }

    public bw(Context context, bq bqVar, bl blVar) {
        if (context == null) {
            throw new NullPointerException("context should not be null!!!");
        }
        this.c = context.getApplicationContext();
        bq.a aVarA = bqVar.b().a("bohrium");
        this.d = aVarA;
        aVarA.a();
        this.a = blVar;
        a(bqVar);
    }

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("dik", "");
            String strOptString2 = jSONObject.optString("cck", "");
            long jOptLong = jSONObject.optLong("ctk", 0L);
            int iOptInt = jSONObject.optInt("vsk", 1);
            boolean zOptBoolean = jSONObject.optBoolean("csk", false);
            String strOptString3 = jSONObject.optString("pmk", "");
            boolean zOptBoolean2 = jSONObject.optBoolean("hrk", true);
            String strOptString4 = jSONObject.optString("ock", null);
            String strOptString5 = jSONObject.optString("ek", "");
            String strOptString6 = jSONObject.optString("v270fk", ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
            if (!TextUtils.isEmpty(strOptString)) {
                a aVar = new a();
                aVar.b = strOptString;
                aVar.d = strOptString2;
                aVar.e = jOptLong;
                aVar.k = iOptInt;
                aVar.f = strOptString5;
                aVar.c = strOptString6;
                aVar.g = zOptBoolean;
                aVar.h = strOptString3;
                aVar.i = zOptBoolean2;
                aVar.j = strOptString4;
                return aVar;
            }
        } catch (Exception e) {
            bu.a(e);
        }
        return null;
    }

    public static a a(String str, String str2, String str3, boolean z, String str4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                String strD = d(str);
                long jCurrentTimeMillis = System.currentTimeMillis();
                a aVar = new a();
                aVar.b = str;
                aVar.d = strD;
                aVar.e = jCurrentTimeMillis;
                aVar.k = 1;
                aVar.f = str3;
                aVar.c = str2;
                aVar.g = z;
                aVar.h = str4;
                return aVar;
            } catch (Exception e) {
                bu.a(e);
            }
        }
        return null;
    }

    private String a(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        return TextUtils.isEmpty(string) ? "" : string;
    }

    private String a(boolean z) {
        return this.d.a("libbh.so", z);
    }

    private void a(bq bqVar) {
        an anVar = new an(new al());
        am.a aVar = new am.a();
        aVar.a = this.c;
        aVar.b = bqVar;
        am.c cVar = new am.c();
        for (am amVar : anVar.a()) {
            amVar.a(aVar);
            amVar.a(cVar);
        }
        this.g = anVar;
    }

    public static String b() {
        String str = h;
        if (str != null) {
            return str;
        }
        if (TextUtils.isEmpty(android.os.Build.MODEL)) {
            return "";
        }
        String strSubstring = bn.a(android.os.Build.MODEL.getBytes(), false).substring(3, 15);
        h = strSubstring;
        return strSubstring;
    }

    private static String d(String str) {
        try {
            return new bs("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567=", false, false).a(new ab().a(str.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public a a() {
        if (new File(this.d.b(), "libbh.so").exists()) {
            return a(a(true));
        }
        return null;
    }

    public a a(br brVar) {
        if (brVar == null) {
            throw new IllegalArgumentException("arg non-nullable is expected");
        }
        a aVar = new a();
        aVar.e = System.currentTimeMillis();
        aVar.k = 1;
        try {
            boolean z = false;
            aVar.c = brVar.b.substring(0, 1);
            aVar.b = brVar.a;
            aVar.d = d(brVar.a);
            String[] strArr = a.a;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (strArr[i].equals(aVar.c)) {
                    break;
                }
                i++;
            }
            if (z && brVar.b != null && brVar.b.length() >= 2) {
                aVar.f = brVar.b.substring(1);
            }
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public a a(String str, String str2) {
        am amVarA = this.g.a(str2);
        am.f fVar = new am.f();
        fVar.a = true;
        am.g gVarA = amVarA.a(str, fVar);
        if (gVarA == null || !gVarA.a()) {
            return null;
        }
        return gVarA.a;
    }

    public void a(a aVar) {
        am.d dVar = new am.d();
        Iterator<am> it = this.g.a().iterator();
        while (it.hasNext()) {
            it.next().a(dVar, aVar);
        }
    }

    public boolean a(a aVar, boolean z, boolean z2) {
        a aVarA;
        if (aVar == null || TextUtils.isEmpty(aVar.b)) {
            throw new NullPointerException("content should not be null");
        }
        if (!z2) {
            try {
                if (new File(this.d.b(), "libbh.so").exists() && (aVarA = a(a(true))) != null) {
                    String strK = aVarA.k();
                    boolean z3 = !TextUtils.isEmpty(strK) && strK.equals(aVar.k());
                    boolean z4 = aVarA.d() && !TextUtils.isEmpty(aVarA.e()) && TextUtils.equals(aVarA.e(), b());
                    if (z3 && z4) {
                        return true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return this.d.a("libbh.so", aVar.j(), z);
    }

    public a b(String str) throws NoSuchAlgorithmException {
        String str2;
        String strA = a(this.c);
        if (Build.VERSION.SDK_INT < 23) {
            String string = UUID.randomUUID().toString();
            if (b) {
                Log.d("CuidV270Manager", "uuid: " + string);
            }
            str2 = str + strA + string;
        } else {
            str2 = "com.baidu" + strA;
        }
        String strA2 = bn.a(str2.getBytes(), true);
        String strB = b();
        a aVar = new a();
        aVar.e = System.currentTimeMillis();
        aVar.k = 1;
        aVar.b = strA2;
        aVar.c = ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
        aVar.d = d(strA2);
        aVar.g = true;
        aVar.h = strB;
        aVar.f = null;
        return aVar;
    }

    public a c(String str) {
        am.f fVar = new am.f();
        fVar.a = true;
        List<am> listA = this.g.a();
        Collections.sort(listA, am.c);
        List<aq> listB = this.a.b(this.c);
        if (listB == null) {
            return null;
        }
        for (aq aqVar : listB) {
            if (!aqVar.d && aqVar.c) {
                Iterator<am> it = listA.iterator();
                while (it.hasNext()) {
                    am.g gVarA = it.next().a(aqVar.a.packageName, fVar);
                    if (gVarA != null && gVarA.a() && gVarA.a != null) {
                        a aVar = gVarA.a;
                        if (TextUtils.equals(aVar.a(), str)) {
                            continue;
                        } else {
                            if (!(aVar.d() && !TextUtils.equals(b(), aVar.e()))) {
                                return gVarA.a;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean c() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.baidu.mobstat.bq$a r0 = r6.d     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = ".lock"
            java.io.File r0 = r0.b(r1)     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L17
            r0.createNewFile()     // Catch: java.io.IOException -> L13 java.lang.Throwable -> L4c
            goto L17
        L13:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L4c
        L17:
            r1 = 0
            r2 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L4c
            java.lang.String r4 = "rw"
            r3.<init>(r0, r4)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L4c
            r0 = 0
        L21:
            r2 = 100
            if (r0 >= r2) goto L4a
            java.nio.channels.FileChannel r2 = r3.getChannel()     // Catch: java.lang.Exception -> L34 java.nio.channels.OverlappingFileLockException -> L37 java.lang.Throwable -> L4c
            java.nio.channels.FileLock r2 = r2.lock()     // Catch: java.lang.Exception -> L34 java.nio.channels.OverlappingFileLockException -> L37 java.lang.Throwable -> L4c
            r6.e = r2     // Catch: java.lang.Exception -> L34 java.nio.channels.OverlappingFileLockException -> L37 java.lang.Throwable -> L4c
            r6.f = r3     // Catch: java.lang.Exception -> L34 java.nio.channels.OverlappingFileLockException -> L37 java.lang.Throwable -> L4c
            monitor-exit(r6)
            r0 = 1
            return r0
        L34:
            r0 = move-exception
            r2 = r3
            goto L40
        L37:
            r4 = 100
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L4c
            int r0 = r0 + 1
            goto L21
        L3f:
            r0 = move-exception
        L40:
            com.baidu.mobstat.bu.a(r0)     // Catch: java.lang.Throwable -> L4c
            java.nio.channels.FileLock r0 = r6.e     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L4a
            com.baidu.mobstat.bu.a(r2)     // Catch: java.lang.Throwable -> L4c
        L4a:
            monitor-exit(r6)
            return r1
        L4c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mobstat.bw.c():boolean");
    }

    public synchronized void d() {
        if (this.e != null) {
            try {
                this.e.release();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.e = null;
            bu.a(this.f);
            this.f = null;
        } else {
            bu.a(this.f);
            this.f = null;
        }
    }
}
