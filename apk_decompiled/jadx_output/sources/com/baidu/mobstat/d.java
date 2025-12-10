package com.baidu.mobstat;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.baidu.mobstat.cl;
import com.baidu.mobstat.cs;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    static d a = new d();

    public synchronized void a(Context context) {
        b(context);
    }

    private void b(Context context) throws JSONException {
        a(context, c(context));
    }

    private ArrayList<a> c(Context context) {
        ArrayList<a> arrayList = new ArrayList<>();
        Iterator<PackageInfo> it = d(context).iterator();
        while (it.hasNext()) {
            PackageInfo next = it.next();
            ApplicationInfo applicationInfo = next.applicationInfo;
            if (applicationInfo != null) {
                String str = next.packageName;
                String str2 = next.versionName;
                Signature[] signatureArr = next.signatures;
                String strA = cs.b.a(((signatureArr == null || signatureArr.length == 0) ? "" : signatureArr[0].toChars().toString()).getBytes());
                String str3 = applicationInfo.sourceDir;
                arrayList.add(new a(str, str2, strA, TextUtils.isEmpty(str3) ? "" : cs.b.a(new File(str3))));
            }
        }
        return arrayList;
    }

    private ArrayList<PackageInfo> d(Context context) {
        ArrayList<PackageInfo> arrayList = new ArrayList<>();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return arrayList;
        }
        List<PackageInfo> arrayList2 = new ArrayList<>(1);
        try {
            arrayList2 = packageManager.getInstalledPackages(64);
        } catch (Exception e) {
            cf.c().b(e);
        }
        for (PackageInfo packageInfo : arrayList2) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && (applicationInfo.flags & 1) == 0) {
                arrayList.add(packageInfo);
            }
        }
        return arrayList;
    }

    private void a(Context context, ArrayList<a> arrayList) throws JSONException {
        String strA;
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectA = it.next().a();
                if (jSONObjectA != null) {
                    jSONArray.put(jSONObjectA);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_apk", jSONArray);
            jSONObject.put("meta-data", sb.toString());
            strA = cl.a.a(jSONObject.toString().getBytes());
        } catch (Exception e) {
            cf.c().b(e);
            strA = "";
        }
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        k.e.a(context, System.currentTimeMillis(), strA);
    }

    static class a {
        private String a;
        private String b;
        private String c;
        private String d;

        public a(String str, String str2, String str3, String str4) {
            str = str == null ? "" : str;
            str2 = str2 == null ? "" : str2;
            str3 = str3 == null ? "" : str3;
            str4 = str4 == null ? "" : str4;
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public JSONObject a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("n", this.a);
                jSONObject.put("v", this.b);
                jSONObject.put("c", this.c);
                jSONObject.put(Config.APP_VERSION_CODE, this.d);
                return jSONObject;
            } catch (JSONException e) {
                cf.c().b(e);
                return null;
            }
        }
    }
}
