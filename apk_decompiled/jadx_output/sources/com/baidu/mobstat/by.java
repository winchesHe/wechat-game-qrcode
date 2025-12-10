package com.baidu.mobstat;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
class by extends cm {
    private static final String a = "baidu_mtj_sdk_record";
    private static by b = new by();

    private by() {
    }

    public static by a() {
        return b;
    }

    @Override // com.baidu.mobstat.cm
    public SharedPreferences a(Context context) {
        return context.getSharedPreferences(a, 0);
    }

    public void a(Context context, long j) {
        b(context, "session_first_visit_time", j);
    }

    public Long b(Context context) {
        return Long.valueOf(a(context, "session_first_visit_time", 0L));
    }

    public void b(Context context, long j) {
        b(context, "session_last_visit_time", j);
    }

    public Long c(Context context) {
        return Long.valueOf(a(context, "session_last_visit_time", 0L));
    }

    public void c(Context context, long j) {
        b(context, "session_visit_interval", j);
    }

    public Long d(Context context) {
        return Long.valueOf(a(context, "session_visit_interval", 0L));
    }

    public void a(Context context, String str) {
        b(context, "session_today_visit_count", str);
    }

    public String e(Context context) {
        return a(context, "session_today_visit_count", "");
    }

    public void b(Context context, String str) {
        b(context, "session_recent_visit", str);
    }

    public String f(Context context) {
        return a(context, "session_recent_visit", "");
    }
}
