package com.baidu.mobstat;

import android.content.Context;

/* loaded from: classes.dex */
public class c {
    public static void a(Context context) {
        if (cu.a().c()) {
            b.a.a(context);
            w.a(context).a(g.AP_LIST, System.currentTimeMillis());
        }
    }

    public static void a(Context context, boolean z) {
        if (cu.a().c()) {
            e.a.a(context, z);
            w.a(context).a(z ? g.APP_SYS_LIST : g.APP_USER_LIST, System.currentTimeMillis());
        }
    }

    public static void b(Context context, boolean z) {
        if (cu.a().c()) {
            f.a.a(context, z);
            w.a(context).a(z ? g.APP_TRACE_CURRENT : g.APP_TRACE_HIS, System.currentTimeMillis());
        }
    }

    public static void b(Context context) {
        if (cu.a().c()) {
            d.a.a(context);
            w.a(context).a(g.APP_APK, System.currentTimeMillis());
        }
    }
}
