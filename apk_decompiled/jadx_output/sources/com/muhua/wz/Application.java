package com.muhua.wz;

import com.baidu.mobstat.StatService;
import com.core.base.CompatGlideImageLoader;
import com.core.base.Injection;
import com.core.base.image.ImageLoader;
import com.core.base.net.NetworkConfig;
import com.core.base.net.NetworkProvider;
import com.core.base.utils.PreferenceUtil;
import com.core.base.utils.ToastUtil;
import com.muhua.wz.net.CustomizeGsonConverterFactory;
import com.muhua.wz.net.interceptor.HeaderInterceptor;
import java.net.Proxy;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;

/* loaded from: classes.dex */
public class Application extends android.app.Application {
    private static final String TOKEN = "TOKEN";
    private static Application application;

    public static Application getInstance() {
        return application;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        application = this;
        ToastUtil.INSTANCE.init(this);
        Injection.INSTANCE.init(this);
        initNetwork();
        ImageLoader.init(new CompatGlideImageLoader());
        startBaidu();
    }

    private void initNetwork() {
        NetworkConfig networkConfig = new NetworkConfig();
        networkConfig.setBaseUrl(Config.getBaseUrl());
        networkConfig.setReadTimeout(60000L);
        networkConfig.setProxy(Proxy.NO_PROXY);
        networkConfig.setConnectTimeout(60000L);
        networkConfig.setWriteTimeout(60000L);
        networkConfig.addInterceptor(new HeaderInterceptor());
        networkConfig.addConverterFactory(CustomizeGsonConverterFactory.create(Injection.provideGson()));
        networkConfig.addCallAdapterFactory(RxJava3CallAdapterFactory.create());
        NetworkProvider.getInstance().init(networkConfig);
    }

    public void setToken(String str) {
        PreferenceUtil.getInstance().putString(TOKEN, str);
    }

    public String getToken() {
        String string = PreferenceUtil.getInstance().getString(TOKEN);
        return string == null ? "" : string;
    }

    private void startBaidu() {
        StatService.setAuthorizedState(this, false);
        StatService.setAppKey("270ce685d8");
        StatService.setAppChannel(this, "ziyong", true);
        StatService.setOn(this, 16);
        StatService.enableDeviceMac(this, false);
        StatService.crashEnableSendLog(true);
        StatService.setDebugOn(false);
        StatService.start(this);
    }
}
