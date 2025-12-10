package com.core.base;

import android.app.Application;

/* loaded from: classes.dex */
public class BaseApplication extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        init();
    }

    public void init() {
        for (String str : ModuleConfig.moduleInits) {
            try {
                ((BaseAppInit) Class.forName(str).newInstance()).onInit(this);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
