package com.baidu.mobstat;

import android.app.Activity;
import android.os.Bundle;
import com.baidu.mobstat.ActivityLifeObserver;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cb {

    public static class a implements ActivityLifeObserver.IActivityLifeCallback {
        @Override // com.baidu.mobstat.ActivityLifeObserver.IActivityLifeCallback
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // com.baidu.mobstat.ActivityLifeObserver.IActivityLifeCallback
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // com.baidu.mobstat.ActivityLifeObserver.IActivityLifeCallback
        public void onActivityPaused(Activity activity) {
        }

        @Override // com.baidu.mobstat.ActivityLifeObserver.IActivityLifeCallback
        public void onActivityResumed(Activity activity) {
        }

        @Override // com.baidu.mobstat.ActivityLifeObserver.IActivityLifeCallback
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // com.baidu.mobstat.ActivityLifeObserver.IActivityLifeCallback
        public void onActivityStarted(Activity activity) {
        }

        @Override // com.baidu.mobstat.ActivityLifeObserver.IActivityLifeCallback
        public void onActivityStopped(Activity activity) {
        }
    }

    public static void a(JSONObject jSONObject) {
    }
}
