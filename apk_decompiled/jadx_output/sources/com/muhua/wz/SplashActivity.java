package com.muhua.wz;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.core.base.Injection;
import com.core.base.image.ImageLoader;
import com.core.base.utils.RxUtils;
import com.muhua.cloud.net.ApiService;
import com.muhua.wz.bean.SplashAdBean;
import com.muhua.wz.databinding.ActivitySplashBinding;
import com.muhua.wz.fragment.WebViewFragment;
import com.muhua.wz.net.DefaultObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplashActivity.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0016H\u0014J\u001e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/muhua/wz/SplashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/muhua/wz/databinding/ActivitySplashBinding;", "getBinding", "()Lcom/muhua/wz/databinding/ActivitySplashBinding;", "setBinding", "(Lcom/muhua/wz/databinding/ActivitySplashBinding;)V", "d", "Lio/reactivex/rxjava3/disposables/Disposable;", "getD", "()Lio/reactivex/rxjava3/disposables/Disposable;", "setD", "(Lio/reactivex/rxjava3/disposables/Disposable;)V", "timer", "Landroid/os/CountDownTimer;", "getTimer", "()Landroid/os/CountDownTimer;", "setTimer", "(Landroid/os/CountDownTimer;)V", "next", "", WebViewFragment.URL, "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "showImage", com.baidu.mobstat.Config.FEED_LIST_ITEM_PATH, "time", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SplashActivity extends AppCompatActivity {
    public ActivitySplashBinding binding;
    public Disposable d;
    private CountDownTimer timer;

    public final ActivitySplashBinding getBinding() {
        ActivitySplashBinding activitySplashBinding = this.binding;
        if (activitySplashBinding != null) {
            return activitySplashBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivitySplashBinding activitySplashBinding) {
        Intrinsics.checkNotNullParameter(activitySplashBinding, "<set-?>");
        this.binding = activitySplashBinding;
    }

    public final CountDownTimer getTimer() {
        return this.timer;
    }

    public final void setTimer(CountDownTimer countDownTimer) {
        this.timer = countDownTimer;
    }

    public final Disposable getD() {
        Disposable disposable = this.d;
        if (disposable != null) {
            return disposable;
        }
        Intrinsics.throwUninitializedPropertyAccessException("d");
        return null;
    }

    public final void setD(Disposable disposable) {
        Intrinsics.checkNotNullParameter(disposable, "<set-?>");
        this.d = disposable;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySplashBinding activitySplashBindingInflate = ActivitySplashBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(activitySplashBindingInflate, "inflate(layoutInflater)");
        setBinding(activitySplashBindingInflate);
        setContentView(getBinding().getRoot());
        this.timer = new CountDownTimer() { // from class: com.muhua.wz.SplashActivity.onCreate.1
            @Override // android.os.CountDownTimer
            public void onTick(long p0) {
            }

            {
                super(2000L, 1000L);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                SplashActivity.this.next("");
            }
        };
        ((ApiService) Injection.INSTANCE.provideApi(ApiService.class)).getOpenScreenDiagram().compose(RxUtils.ioMain()).subscribe(new DefaultObserver<SplashAdBean>() { // from class: com.muhua.wz.SplashActivity.onCreate.2
            @Override // io.reactivex.rxjava3.core.Observer
            public void onSubscribe(Disposable d) {
                Intrinsics.checkNotNullParameter(d, "d");
                SplashActivity.this.setD(d);
            }

            @Override // com.muhua.wz.net.DefaultObserver
            public void onFailure(Throwable throwable) {
                CountDownTimer timer = SplashActivity.this.getTimer();
                if (timer != null) {
                    timer.start();
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onNext(SplashAdBean t) {
                Intrinsics.checkNotNullParameter(t, "t");
                String imageUrl = t.getImageUrl();
                if (!(imageUrl == null || imageUrl.length() == 0)) {
                    SplashActivity.this.showImage(t.getImageUrl(), t.getShowDuration(), t.getLinkUrl());
                    return;
                }
                CountDownTimer timer = SplashActivity.this.getTimer();
                if (timer != null) {
                    timer.start();
                }
            }
        });
    }

    public final void showImage(String path, int time, final String url) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(url, "url");
        getBinding().image.setVisibility(0);
        getBinding().jump.setVisibility(0);
        ImageLoader.with(this).load(path).into(getBinding().image);
        getBinding().jump.setText("跳过 " + time + 's');
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(time * 1000) { // from class: com.muhua.wz.SplashActivity.showImage.1
            @Override // android.os.CountDownTimer
            public void onTick(long p0) {
                SplashActivity.this.getBinding().jump.setText("跳过 " + (p0 / 1000) + 's');
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                SplashActivity.this.next("");
            }
        };
        this.timer = countDownTimer2;
        countDownTimer2.start();
        getBinding().image.setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.SplashActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SplashActivity.m3142showImage$lambda0(this.f$0, url, view);
            }
        });
        getBinding().jump.setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.SplashActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SplashActivity.m3143showImage$lambda1(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showImage$lambda-0, reason: not valid java name */
    public static final void m3142showImage$lambda0(SplashActivity this$0, String url, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "$url");
        this$0.next(url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showImage$lambda-1, reason: not valid java name */
    public static final void m3143showImage$lambda1(SplashActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.next("");
    }

    public final void next(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        Intent intent = new Intent(this, (Class<?>) HomeActivity.class);
        intent.putExtra(WebViewFragment.URL, url);
        startActivity(intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        RxUtils.unSubscribe(getD());
        finish();
    }
}
