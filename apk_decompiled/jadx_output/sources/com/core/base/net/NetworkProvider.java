package com.core.base.net;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public class NetworkProvider {
    private HashMap<String, Object> mApis;
    private NetworkConfig mConfig;
    private boolean mInit;
    private OkHttpClient mOkHttpClient;
    private Retrofit mRetrofit;

    private NetworkProvider() {
        this.mApis = new HashMap<>();
        this.mInit = false;
    }

    public static NetworkProvider getInstance() {
        return SingleInstanceHolder.sInstance;
    }

    private static class SingleInstanceHolder {
        private static NetworkProvider sInstance = new NetworkProvider();

        private SingleInstanceHolder() {
        }
    }

    public void init(NetworkConfig networkConfig) {
        if (this.mInit) {
            throw new IllegalStateException("Already init!");
        }
        OkHttpClient.Builder builderProxy = new OkHttpClient.Builder().readTimeout(networkConfig.getReadTimeout(), TimeUnit.MILLISECONDS).writeTimeout(networkConfig.getWriteTimeout(), TimeUnit.MILLISECONDS).connectTimeout(networkConfig.getConnectTimeout(), TimeUnit.MILLISECONDS).retryOnConnectionFailure(networkConfig.isRetryOnConnectionFailure()).cache(networkConfig.getCache()).proxy(networkConfig.getProxy());
        if (networkConfig.getCookieJar() != null) {
            builderProxy.cookieJar(networkConfig.getCookieJar());
        }
        if (networkConfig.getEventListener() != null) {
            builderProxy.eventListener(networkConfig.getEventListener());
        }
        builderProxy.interceptors().addAll(networkConfig.getInterceptors());
        builderProxy.networkInterceptors().addAll(networkConfig.getNetworkInterceptors());
        this.mOkHttpClient = builderProxy.build();
        Retrofit.Builder builderBaseUrl = new Retrofit.Builder().client(this.mOkHttpClient).baseUrl(networkConfig.getBaseUrl());
        builderBaseUrl.converterFactories().addAll(networkConfig.getConverterFactories());
        builderBaseUrl.callAdapterFactories().addAll(networkConfig.getCallAdapterFactories());
        this.mRetrofit = builderBaseUrl.build();
        this.mConfig = networkConfig;
        this.mInit = true;
    }

    public OkHttpClient provideOkhttpClient() {
        OkHttpClient okHttpClient = this.mOkHttpClient;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        throw new IllegalStateException("Call init() first!");
    }

    public <T> T provide(Class<T> cls) {
        T t;
        if (!this.mInit) {
            throw new IllegalStateException("Call init() first!");
        }
        try {
            try {
                T t2 = (T) this.mApis.get(cls.getName());
                if (t2 != null) {
                    return t2;
                }
            } catch (ClassCastException e) {
                e.printStackTrace();
            }
            return t;
        } finally {
            this.mApis.put(cls.getName(), this.mRetrofit.create(cls));
        }
    }
}
