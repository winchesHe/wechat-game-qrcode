package com.baidu.mobstat;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;

/* loaded from: classes.dex */
class v {
    private static volatile boolean a;

    public static synchronized void a(Context context, com.baidu.mobstat.a aVar) {
        if (a) {
            return;
        }
        if (!cw.n(context)) {
            cf.c().a("isWifiAvailable = false, will not to update");
        } else {
            if (!aVar.a(context)) {
                cf.c().a("check time, will not to update");
                return;
            }
            cf.c().a("can start update config");
            new a(context, aVar).start();
            a = true;
        }
    }

    static class a extends Thread {
        private Context a;
        private com.baidu.mobstat.a b;

        public a(Context context, com.baidu.mobstat.a aVar) {
            this.a = context;
            this.b = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                int i = y.a ? 3 : 10;
                cf.c().a("start version check in " + i + "s");
                sleep((long) (i * 1000));
                a();
                a(this.a);
            } catch (Exception e) {
                cf.c().a(e);
            }
            boolean unused = v.a = false;
        }

        private void a(Context context) {
            this.b.a(context, System.currentTimeMillis());
        }

        private synchronized void a() throws Exception {
            cf.c().a("start get config");
            Context context = this.a;
            com.baidu.mobstat.a aVar = this.b;
            String strB = b(context);
            cf.c().c("update req url is:" + strB);
            HttpURLConnection httpURLConnectionD = cn.d(context, strB);
            try {
                httpURLConnectionD.connect();
                String headerField = httpURLConnectionD.getHeaderField("X-CONFIG");
                cf.c().a("config is: " + headerField);
                String headerField2 = httpURLConnectionD.getHeaderField("X-SIGN");
                cf.c().a("sign is: " + headerField2);
                int responseCode = httpURLConnectionD.getResponseCode();
                cf.c().a("update response code is: " + responseCode);
                int contentLength = httpURLConnectionD.getContentLength();
                cf.c().a("update response content length is: " + contentLength);
                if (responseCode == 200) {
                    cf.c().a("request  success");
                }
                if (!TextUtils.isEmpty(headerField)) {
                    cf.c().a("save Config " + headerField);
                    aVar.a(context, headerField);
                }
                if (!TextUtils.isEmpty(headerField2)) {
                    cf.c().a("save Sign " + headerField2);
                    aVar.b(context, headerField2);
                }
                httpURLConnectionD.disconnect();
                cf.c().a("finish get config");
            } catch (Throwable th) {
                httpURLConnectionD.disconnect();
                throw th;
            }
        }

        private String b(Context context) throws UnsupportedEncodingException {
            ArrayList<Pair> arrayList = new ArrayList();
            arrayList.add(new Pair("dynamicVersion", "35"));
            arrayList.add(new Pair("packageName", cw.p(context)));
            arrayList.add(new Pair("appVersion", cw.g(context)));
            arrayList.add(new Pair("cuid", cw.a(context)));
            arrayList.add(new Pair("platform", "Android"));
            arrayList.add(new Pair(Config.MODEL, android.os.Build.MODEL));
            arrayList.add(new Pair("s", Build.VERSION.SDK_INT + ""));
            arrayList.add(new Pair(Config.OS, Build.VERSION.RELEASE));
            arrayList.add(new Pair("i", "35"));
            StringBuilder sb = new StringBuilder();
            for (Pair pair : arrayList) {
                try {
                    String strEncode = URLEncoder.encode(((String) pair.first).toString(), "UTF-8");
                    String strEncode2 = URLEncoder.encode(((String) pair.second).toString(), "UTF-8");
                    if (TextUtils.isEmpty(sb.toString())) {
                        sb.append(strEncode + "=" + strEncode2);
                    } else {
                        sb.append("&" + strEncode + "=" + strEncode2);
                    }
                } catch (Exception unused) {
                }
            }
            return y.c + "?" + sb.toString();
        }
    }
}
