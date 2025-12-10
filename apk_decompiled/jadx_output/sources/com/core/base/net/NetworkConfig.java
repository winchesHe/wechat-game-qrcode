package com.core.base.net;

import java.net.Proxy;
import java.util.LinkedList;
import java.util.List;
import okhttp3.Cache;
import okhttp3.CookieJar;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class NetworkConfig {
    private Cache mCache;
    private CookieJar mCookieJar;
    private EventListener mEventListener;
    private long mReadTimeout = 1000;
    private long mWriteTimeout = 1000;
    private long mConnectTimeout = 1000;
    private boolean mRetryOnConnectionFailure = false;
    private final List<Interceptor> mInterceptors = new LinkedList();
    private final List<Interceptor> mNetworkInterceptors = new LinkedList();
    private final List<Converter.Factory> mConverterFactories = new LinkedList();
    private final List<CallAdapter.Factory> mCallAdapterFactories = new LinkedList();
    private Proxy mProxy = null;
    private String mBaseUrl = "";

    public NetworkConfig setReadTimeout(long j) {
        if (j <= 0) {
            throw new IllegalStateException("ReadTimeout must > 0");
        }
        this.mReadTimeout = j;
        return this;
    }

    public NetworkConfig setConnectTimeout(long j) {
        if (j <= 0) {
            throw new IllegalStateException("ConnectTimeout must > 0");
        }
        this.mConnectTimeout = j;
        return this;
    }

    public NetworkConfig setWriteTimeout(long j) {
        if (j <= 0) {
            throw new IllegalStateException("WriteTimeout must > 0");
        }
        this.mWriteTimeout = j;
        return this;
    }

    public NetworkConfig addInterceptor(Interceptor interceptor) {
        this.mInterceptors.add(interceptor);
        return this;
    }

    public NetworkConfig addNetworkInterceptor(Interceptor interceptor) {
        this.mNetworkInterceptors.add(interceptor);
        return this;
    }

    public NetworkConfig setInterceptors(List<Interceptor> list) {
        this.mInterceptors.clear();
        this.mInterceptors.addAll(list);
        return this;
    }

    public NetworkConfig setNetworkInterceptors(List<Interceptor> list) {
        this.mNetworkInterceptors.clear();
        this.mNetworkInterceptors.addAll(list);
        return this;
    }

    public NetworkConfig setBaseUrl(String str) {
        this.mBaseUrl = str;
        return this;
    }

    public NetworkConfig addConverterFactory(Converter.Factory factory) {
        this.mConverterFactories.add(factory);
        return this;
    }

    public NetworkConfig addCallAdapterFactory(CallAdapter.Factory factory) {
        this.mCallAdapterFactories.add(factory);
        return this;
    }

    public NetworkConfig setConverterFactories(List<Converter.Factory> list) {
        this.mConverterFactories.clear();
        this.mConverterFactories.addAll(list);
        return this;
    }

    public NetworkConfig setCallAdapterFactories(List<CallAdapter.Factory> list) {
        this.mCallAdapterFactories.clear();
        this.mCallAdapterFactories.addAll(list);
        return this;
    }

    public NetworkConfig setRetryOnConnectionFailure(boolean z) {
        this.mRetryOnConnectionFailure = z;
        return this;
    }

    public NetworkConfig setCache(Cache cache) {
        this.mCache = cache;
        return this;
    }

    public NetworkConfig setProxy(Proxy proxy) {
        this.mProxy = proxy;
        return this;
    }

    public NetworkConfig setEventListener(EventListener eventListener) {
        this.mEventListener = eventListener;
        return this;
    }

    public NetworkConfig setCookieJar(CookieJar cookieJar) {
        this.mCookieJar = cookieJar;
        return this;
    }

    public long getReadTimeout() {
        return this.mReadTimeout;
    }

    public long getWriteTimeout() {
        return this.mWriteTimeout;
    }

    public long getConnectTimeout() {
        return this.mConnectTimeout;
    }

    public boolean isRetryOnConnectionFailure() {
        return this.mRetryOnConnectionFailure;
    }

    public List<Interceptor> getInterceptors() {
        return this.mInterceptors;
    }

    public List<Interceptor> getNetworkInterceptors() {
        return this.mNetworkInterceptors;
    }

    public List<Converter.Factory> getConverterFactories() {
        return this.mConverterFactories;
    }

    public List<CallAdapter.Factory> getCallAdapterFactories() {
        return this.mCallAdapterFactories;
    }

    public Cache getCache() {
        return this.mCache;
    }

    public Proxy getProxy() {
        return this.mProxy;
    }

    public EventListener getEventListener() {
        return this.mEventListener;
    }

    public CookieJar getCookieJar() {
        return this.mCookieJar;
    }

    public String getBaseUrl() {
        return this.mBaseUrl;
    }
}
