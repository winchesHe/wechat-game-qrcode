package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
class b {
    static b a = new b();

    b() {
    }

    public synchronized void a(Context context) {
        String strL = cw.l(context);
        if (!TextUtils.isEmpty(strL)) {
            k.a.a(context, System.currentTimeMillis(), strL);
        }
    }
}
