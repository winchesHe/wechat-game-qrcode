package com.baidu.mobstat;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.baidu.mobstat.cl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class f {
    static f a = new f();
    private String b = "";

    private boolean a(int i) {
        return i == 100 || i == 200 || i == 130;
    }

    f() {
    }

    public synchronized void a(Context context, boolean z) {
        a(context, z, !z ? 20 : 1);
    }

    private void a(Context context, boolean z, int i) throws JSONException {
        ArrayList<a> arrayListA = a(context, i);
        if (arrayListA == null || arrayListA.size() == 0) {
            return;
        }
        if (z) {
            String strB = arrayListA.get(0).b();
            if (a(strB, this.b)) {
                this.b = strB;
            }
        }
        a(context, arrayListA, z);
    }

    private ArrayList<a> a(Context context, int i) {
        return c(context, i);
    }

    private ArrayList<a> b(Context context, int i) throws SecurityException {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        try {
            runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(50);
        } catch (Exception e) {
            cf.c().b(e);
            runningTasks = null;
        }
        if (runningTasks == null) {
            return new ArrayList<>();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
            if (linkedHashMap.size() > i) {
                break;
            }
            ComponentName componentName = runningTaskInfo.topActivity;
            if (componentName != null) {
                String packageName = componentName.getPackageName();
                if (!TextUtils.isEmpty(packageName) && !b(context, packageName) && !linkedHashMap.containsKey(packageName)) {
                    linkedHashMap.put(packageName, new a(packageName, a(context, packageName), ""));
                }
            }
        }
        return new ArrayList<>(linkedHashMap.values());
    }

    private ArrayList<a> c(Context context, int i) {
        String[] strArr;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return new ArrayList<>();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 0; i2 < runningAppProcesses.size() && linkedHashMap.size() <= i; i2++) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i2);
            if (a(runningAppProcessInfo.importance) && (strArr = runningAppProcessInfo.pkgList) != null && strArr.length != 0) {
                String str = runningAppProcessInfo.pkgList[0];
                if (!TextUtils.isEmpty(str) && !b(context, str) && !linkedHashMap.containsKey(str)) {
                    linkedHashMap.put(str, new a(str, a(context, str), String.valueOf(runningAppProcessInfo.importance)));
                }
            }
        }
        return new ArrayList<>(linkedHashMap.values());
    }

    private boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) || str.equals(this.b)) ? false : true;
    }

    private String a(Context context, String str) {
        String str2;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        try {
            str2 = packageManager.getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            cf.c().b(e);
            str2 = "";
        }
        return str2 == null ? "" : str2;
    }

    private boolean b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(str, 0).applicationInfo;
            if (applicationInfo == null) {
                return false;
            }
            return (applicationInfo.flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            cf.c().b(e);
            return false;
        }
    }

    private void a(Context context, ArrayList<a> arrayList, boolean z) throws JSONException {
        String strA;
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis() + "|");
        sb.append(z ? 1 : 0);
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
            jSONObject.put("app_trace", jSONArray);
            jSONObject.put("meta-data", sb.toString());
            strA = cl.a.a(jSONObject.toString().getBytes());
        } catch (Exception e) {
            cf.c().b(e);
            strA = "";
        }
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        k.c.a(context, System.currentTimeMillis(), strA);
    }

    static class a {
        private String a;
        private String b;
        private String c;

        public a(String str, String str2, String str3) {
            this.a = str == null ? "" : str;
            this.b = str2 == null ? "" : str2;
            this.c = str3 == null ? "" : str3;
        }

        public JSONObject a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("n", this.a);
                jSONObject.put("v", this.b);
                jSONObject.put(Config.DEVICE_WIDTH, this.c);
                return jSONObject;
            } catch (JSONException e) {
                cf.c().b(e);
                return null;
            }
        }

        public String b() {
            return this.a;
        }
    }
}
