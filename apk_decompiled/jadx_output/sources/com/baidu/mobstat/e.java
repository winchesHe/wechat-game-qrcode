package com.baidu.mobstat;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.baidu.mobstat.cl;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class e {
    static final e a = new e();

    e() {
    }

    public synchronized void a(Context context, boolean z) {
        b(context, z);
    }

    private void b(Context context, boolean z) throws JSONException {
        String strA;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return;
        }
        List<PackageInfo> arrayList = new ArrayList<>(1);
        try {
            arrayList = packageManager.getInstalledPackages(0);
        } catch (Exception e) {
            cf.c().b(e);
        }
        JSONArray jSONArray = new JSONArray();
        for (PackageInfo packageInfo : arrayList) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                boolean z2 = (applicationInfo.flags & 1) != 0;
                String str = applicationInfo.sourceDir;
                if (z == z2) {
                    a(z, "", str, packageInfo, jSONArray);
                }
            }
        }
        if (jSONArray.length() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis() + "|");
        sb.append(z ? 1 : 0);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_list", jSONArray);
            jSONObject.put("meta-data", sb.toString());
            strA = cl.a.a(jSONObject.toString().getBytes());
        } catch (Exception unused) {
            strA = "";
        }
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        k.b.a(context, System.currentTimeMillis(), strA);
    }

    private void a(boolean z, String str, String str2, PackageInfo packageInfo, JSONArray jSONArray) throws JSONException {
        long j;
        if (z && packageInfo.packageName.startsWith("com.android.")) {
            return;
        }
        long j2 = 0;
        try {
            j = packageInfo.firstInstallTime;
        } catch (Throwable th) {
            cf.c().b(th);
            j = 0;
        }
        try {
            j2 = packageInfo.lastUpdateTime;
        } catch (Throwable th2) {
            cf.c().b(th2);
        }
        long jA = a(str2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("n", packageInfo.packageName);
            jSONObject.put(Config.APP_VERSION_CODE, str);
            jSONObject.put("v", String.valueOf(packageInfo.versionName));
            jSONObject.put("f", j);
            jSONObject.put("l", j2);
            jSONObject.put(Config.MODEL, jA);
            jSONArray.put(jSONObject);
        } catch (JSONException e) {
            cf.c().b(e);
        }
    }

    private long a(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                return file.lastModified();
            }
        }
        return 0L;
    }
}
