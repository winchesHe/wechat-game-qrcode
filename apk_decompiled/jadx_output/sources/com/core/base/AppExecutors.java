package com.core.base;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class AppExecutors {
    private static volatile AppExecutors INSTANCE;
    private ExecutorService diskIOExecutor;
    private Executor mainThreadExecutor;
    private ExecutorService networkIOExecutor;

    public AppExecutors(ExecutorService executorService, ExecutorService executorService2, Executor executor) {
        this.diskIOExecutor = executorService;
        this.networkIOExecutor = executorService2;
        this.mainThreadExecutor = executor;
    }

    public static AppExecutors getInstance() {
        if (INSTANCE == null) {
            synchronized (AppExecutors.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AppExecutors();
                }
            }
        }
        return INSTANCE;
    }

    public ExecutorService diskIOExecutor() {
        return this.diskIOExecutor;
    }

    public ExecutorService networkIOExecutor() {
        return this.networkIOExecutor;
    }

    public Executor mainThreadExecutor() {
        return this.mainThreadExecutor;
    }

    public AppExecutors() {
        this(Executors.newSingleThreadExecutor(), Executors.newFixedThreadPool(3), new MainThreadExecutor());
    }

    public static class MainThreadExecutor implements Executor {
        private Handler mHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (Looper.getMainLooper().equals(Looper.myLooper())) {
                runnable.run();
            } else {
                this.mHandler.post(runnable);
            }
        }
    }
}
