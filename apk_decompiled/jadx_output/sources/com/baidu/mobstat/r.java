package com.baidu.mobstat;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.baidu.mobstat.cl;
import com.facebook.stetho.dumpapp.Framer;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r {
    private static String a = "https://openrcv.baidu.com/1010/bplus.gif";
    private static r b;
    private Handler c;

    private r() {
        HandlerThread handlerThread = new HandlerThread("LogSender");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
    }

    public static r a() {
        if (b == null) {
            synchronized (r.class) {
                if (b == null) {
                    b = new r();
                }
            }
        }
        return b;
    }

    public void a(final Context context, final String str) {
        cf.c().a("data = " + str);
        if (str == null || "".equals(str)) {
            return;
        }
        this.c.post(new Runnable() { // from class: com.baidu.mobstat.r.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Context context2 = context;
                    if (context2 == null) {
                        return;
                    }
                    r.this.b(context2, str);
                    r.this.a(context.getApplicationContext());
                } catch (Throwable th) {
                    cf.c().b(th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, String str) {
        cn.a(context, y.f + System.currentTimeMillis(), str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) throws JSONException {
        String next;
        Iterator<String> it = c(context, y.f).iterator();
        while (true) {
            int i = 0;
            while (it.hasNext()) {
                next = it.next();
                String strA = cn.a(context, next);
                if (TextUtils.isEmpty(strA)) {
                    cn.b(context, next);
                } else {
                    if (d(context, strA)) {
                        break;
                    }
                    a(context, strA, next);
                    i++;
                    if (i >= 5) {
                        return;
                    }
                }
            }
            return;
            cn.b(context, next);
        }
    }

    private ArrayList<String> c(Context context, final String str) {
        File filesDir;
        String[] list;
        ArrayList<String> arrayList = new ArrayList<>();
        if (context != null && (filesDir = context.getFilesDir()) != null && filesDir.exists()) {
            try {
                list = filesDir.list(new FilenameFilter() { // from class: com.baidu.mobstat.r.2
                    @Override // java.io.FilenameFilter
                    public boolean accept(File file, String str2) {
                        return str2.startsWith(str);
                    }
                });
            } catch (Exception unused) {
                list = null;
            }
            if (list != null && list.length != 0) {
                try {
                    Arrays.sort(list, new Comparator<String>() { // from class: com.baidu.mobstat.r.3
                        @Override // java.util.Comparator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public int compare(String str2, String str3) {
                            return str2.compareTo(str3);
                        }
                    });
                } catch (Exception unused2) {
                }
                for (String str2 : list) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    private void a(Context context, String str, String str2) throws JSONException {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = null;
        }
        JSONObject jSONObjectA = h.a(jSONObject);
        if (jSONObjectA != null) {
            h.b(jSONObjectA);
            if (jSONObject != null) {
                cn.a(context, str2, jSONObject.toString(), false);
            }
        }
    }

    private boolean d(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!cw.c().booleanValue()) {
            return true;
        }
        try {
            b(context, a, str);
            return true;
        } catch (Exception e) {
            cf.c().c(e);
            return false;
        }
    }

    private String b(Context context, String str, String str2) throws JSONException, IOException {
        byte[] bytes;
        boolean z = !str.startsWith("https:");
        HttpURLConnection httpURLConnectionD = cn.d(context, str);
        httpURLConnectionD.setDoOutput(true);
        httpURLConnectionD.setInstanceFollowRedirects(false);
        httpURLConnectionD.setUseCaches(false);
        httpURLConnectionD.setRequestProperty("Content-Encoding", "gzip");
        try {
            JSONObject jSONObject = new JSONObject(str2).getJSONArray("payload").getJSONObject(0).getJSONObject(Config.HEADER_PART);
            httpURLConnectionD.setRequestProperty(HttpHeaders.CONTENT_TYPE, "gzip");
            httpURLConnectionD.setRequestProperty("mtj_appversion", jSONObject.getString("n"));
            httpURLConnectionD.setRequestProperty("mtj_os", "Android");
            httpURLConnectionD.setRequestProperty("mtj_pn", jSONObject.getString(Config.PACKAGE_NAME));
            httpURLConnectionD.setRequestProperty("mtj_tg", "1");
            httpURLConnectionD.setRequestProperty("mtj_ii", jSONObject.getString(Config.CUID_SEC));
            httpURLConnectionD.setRequestProperty("from", jSONObject.getString("from"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        httpURLConnectionD.connect();
        try {
            try {
                OutputStream outputStream = httpURLConnectionD.getOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                gZIPOutputStream.write(new byte[]{72, 77, 48, Framer.STDOUT_FRAME_PREFIX});
                gZIPOutputStream.write(new byte[]{0, 0, 0, 1});
                gZIPOutputStream.write(new byte[]{0, 0, 3, -14});
                gZIPOutputStream.write(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
                gZIPOutputStream.write(new byte[]{0, 2});
                if (z) {
                    gZIPOutputStream.write(new byte[]{0, 1});
                } else {
                    gZIPOutputStream.write(new byte[]{0, 0});
                }
                gZIPOutputStream.write(new byte[]{72, 77, 48, Framer.STDOUT_FRAME_PREFIX});
                if (z) {
                    byte[] bArrA = cl.a.a();
                    byte[] bArrA2 = cv.a(false, cq.a(), bArrA);
                    gZIPOutputStream.write(a(bArrA2.length, 4));
                    gZIPOutputStream.write(bArrA2);
                    bytes = cl.a.a(bArrA, new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, str2.getBytes("utf-8"));
                    gZIPOutputStream.write(a(bytes.length, 2));
                } else {
                    bytes = str2.getBytes("utf-8");
                }
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                outputStream.close();
                int responseCode = httpURLConnectionD.getResponseCode();
                int contentLength = httpURLConnectionD.getContentLength();
                cf.c().c("code: " + responseCode + "; len: " + contentLength);
                if (responseCode != 200 || contentLength != 0) {
                    throw new IOException("Response code = " + httpURLConnectionD.getResponseCode());
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionD.getInputStream()));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                    } else {
                        return sb.toString();
                    }
                }
            } catch (Exception e2) {
                cf.c().b(e2);
                httpURLConnectionD.disconnect();
                return "";
            }
        } finally {
            httpURLConnectionD.disconnect();
        }
    }

    private static byte[] a(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[(i - i2) - 1] = (byte) (255 & j);
            j >>= 8;
        }
        return bArr;
    }
}
