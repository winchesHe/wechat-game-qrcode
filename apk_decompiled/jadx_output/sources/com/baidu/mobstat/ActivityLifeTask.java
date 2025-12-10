package com.baidu.mobstat;

import android.content.Context;
import com.baidu.mobstat.ActivityLifeObserver;
import com.baidu.mobstat.AutoTrack;
import com.baidu.mobstat.bz;
import com.baidu.mobstat.cb;

/* loaded from: classes.dex */
public class ActivityLifeTask {
    private static boolean a;
    private static ActivityLifeObserver.IActivityLifeCallback b;
    private static ActivityLifeObserver.IActivityLifeCallback c;
    private static ActivityLifeObserver.IActivityLifeCallback d;
    private static ActivityLifeObserver.IActivityLifeCallback e;

    public static synchronized void registerActivityLifeCallback(Context context) {
        if (a) {
            return;
        }
        a(context);
        ActivityLifeObserver.instance().clearObservers();
        ActivityLifeObserver.instance().addObserver(b);
        ActivityLifeObserver.instance().addObserver(e);
        ActivityLifeObserver.instance().registerActivityLifeCallback(context);
        a = true;
    }

    private static synchronized void a(Context context) {
        b = new AutoTrack.MyActivityLifeCallback(1);
        d = new bz.a();
        c = new cb.a();
        e = new AutoTrack.MyActivityLifeCallback(2);
    }
}
