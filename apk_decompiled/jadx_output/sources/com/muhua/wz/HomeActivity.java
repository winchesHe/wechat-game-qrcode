package com.muhua.wz;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.core.base.Injection;
import com.core.base.utils.RxUtils;
import com.core.base.utils.SystemUtils;
import com.core.base.utils.ToastUtil;
import com.muhua.cloud.net.ApiService;
import com.muhua.wz.bean.Banners;
import com.muhua.wz.bean.FirstAdBean;
import com.muhua.wz.bean.GameInfo;
import com.muhua.wz.bean.VersionInfo;
import com.muhua.wz.databinding.ActivityHomeBinding;
import com.muhua.wz.fragment.FirstPageDialog;
import com.muhua.wz.fragment.GameFragment;
import com.muhua.wz.fragment.MainFragment;
import com.muhua.wz.fragment.UpdateDialogFragment;
import com.muhua.wz.fragment.WebViewFragment;
import com.muhua.wz.net.DefaultObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeActivity.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020%H\u0002J\u0006\u0010'\u001a\u00020%J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020%H\u0014J\b\u0010*\u001a\u00020%H\u0014J\b\u0010+\u001a\u00020%H\u0014J\b\u0010,\u001a\u00020%H\u0016J\b\u0010-\u001a\u00020%H\u0014J\u000e\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u000200J\u0010\u00101\u001a\u00020%2\u0006\u00102\u001a\u000203H\u0002J\u000e\u00104\u001a\u00020%2\u0006\u00105\u001a\u000206J\b\u00107\u001a\u00020%H\u0002J\u0012\u00108\u001a\u00020%2\b\u00109\u001a\u0004\u0018\u00010:H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006;"}, d2 = {"Lcom/muhua/wz/HomeActivity;", "Lcom/muhua/wz/BaseActivity;", "Lcom/muhua/wz/databinding/ActivityHomeBinding;", "()V", "OUT_DELAY", "", "gameFragment", "Lcom/muhua/wz/fragment/GameFragment;", "getGameFragment", "()Lcom/muhua/wz/fragment/GameFragment;", "setGameFragment", "(Lcom/muhua/wz/fragment/GameFragment;)V", "isGetAd", "", "()Z", "setGetAd", "(Z)V", "mLastBackPressTime", "mainFragment", "Lcom/muhua/wz/fragment/MainFragment;", "getMainFragment", "()Lcom/muhua/wz/fragment/MainFragment;", "setMainFragment", "(Lcom/muhua/wz/fragment/MainFragment;)V", "mineFragment", "Lcom/muhua/wz/fragment/WebViewFragment;", "getMineFragment", "()Lcom/muhua/wz/fragment/WebViewFragment;", "setMineFragment", "(Lcom/muhua/wz/fragment/WebViewFragment;)V", WebViewFragment.URL, "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "backtoMain", "", "close", "getAd", "getVersion", "initBinding", "initData", "initView", "onBackPressed", "onResume", "setGame", com.baidu.mobstat.Config.LAUNCH_INFO, "Lcom/muhua/wz/bean/GameInfo;", "showFirst", "t", "Lcom/muhua/wz/bean/FirstAdBean;", "showFragment", "fragment", "Landroidx/fragment/app/Fragment;", "showScan", "showUpdateDialog", "versionInfo", "Lcom/muhua/wz/bean/VersionInfo;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HomeActivity extends BaseActivity<ActivityHomeBinding> {
    private final long OUT_DELAY = 3000;
    public GameFragment gameFragment;
    private boolean isGetAd;
    private long mLastBackPressTime;
    public MainFragment mainFragment;
    public WebViewFragment mineFragment;
    private String url;

    public final MainFragment getMainFragment() {
        MainFragment mainFragment = this.mainFragment;
        if (mainFragment != null) {
            return mainFragment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainFragment");
        return null;
    }

    public final void setMainFragment(MainFragment mainFragment) {
        Intrinsics.checkNotNullParameter(mainFragment, "<set-?>");
        this.mainFragment = mainFragment;
    }

    public final WebViewFragment getMineFragment() {
        WebViewFragment webViewFragment = this.mineFragment;
        if (webViewFragment != null) {
            return webViewFragment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mineFragment");
        return null;
    }

    public final void setMineFragment(WebViewFragment webViewFragment) {
        Intrinsics.checkNotNullParameter(webViewFragment, "<set-?>");
        this.mineFragment = webViewFragment;
    }

    public final GameFragment getGameFragment() {
        GameFragment gameFragment = this.gameFragment;
        if (gameFragment != null) {
            return gameFragment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gameFragment");
        return null;
    }

    public final void setGameFragment(GameFragment gameFragment) {
        Intrinsics.checkNotNullParameter(gameFragment, "<set-?>");
        this.gameFragment = gameFragment;
    }

    /* renamed from: isGetAd, reason: from getter */
    public final boolean getIsGetAd() {
        return this.isGetAd;
    }

    public final void setGetAd(boolean z) {
        this.isGetAd = z;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Binding, com.muhua.wz.databinding.ActivityHomeBinding] */
    @Override // com.muhua.wz.BaseActivity
    protected void initBinding() {
        this.binding = ActivityHomeBinding.inflate(getLayoutInflater());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.muhua.wz.BaseActivity
    protected void initView() {
        setMainFragment(new MainFragment());
        WebViewFragment webViewFragmentNewInstance = WebViewFragment.newInstance("", "我的");
        Intrinsics.checkNotNullExpressionValue(webViewFragmentNewInstance, "newInstance(\"https://cmm…akeji.com/scanner\", \"我的\")");
        setMineFragment(webViewFragmentNewInstance);
        setGameFragment(new GameFragment());
        showFragment(getMainFragment());
        ((ActivityHomeBinding) this.binding).scan.setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.HomeActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.m3135initView$lambda0(this.f$0, view);
            }
        });
        ((ActivityHomeBinding) this.binding).mine.setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.HomeActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.m3136initView$lambda1(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-0, reason: not valid java name */
    public static final void m3135initView$lambda0(HomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showScan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m3136initView$lambda1(HomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((ActivityHomeBinding) this$0.binding).scan.setTextColor(this$0.getResources().getColor(com.info.wz.R.color.black_a5));
        ((ActivityHomeBinding) this$0.binding).mine.setTextColor(this$0.getResources().getColor(com.info.wz.R.color.blue_74FF));
        HomeActivity homeActivity = this$0;
        Drawable drawable = AppCompatResources.getDrawable(homeActivity, com.info.wz.R.mipmap.ic_scan_unselect);
        Drawable drawable2 = AppCompatResources.getDrawable(homeActivity, com.info.wz.R.mipmap.ic_mine_select);
        Rect rect = new Rect(0, 0, SystemUtils.INSTANCE.dp2px(22.0f), SystemUtils.INSTANCE.dp2px(22.0f));
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
        ((ActivityHomeBinding) this$0.binding).scan.setCompoundDrawables(null, drawable, null, null);
        ((ActivityHomeBinding) this$0.binding).mine.setCompoundDrawables(null, drawable2, null, null);
        this$0.showFragment(this$0.getMineFragment());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showScan() {
        ((ActivityHomeBinding) this.binding).mine.setTextColor(getResources().getColor(com.info.wz.R.color.black_a5));
        ((ActivityHomeBinding) this.binding).scan.setTextColor(getResources().getColor(com.info.wz.R.color.blue_74FF));
        HomeActivity homeActivity = this;
        Drawable drawable = AppCompatResources.getDrawable(homeActivity, com.info.wz.R.mipmap.ic_scan);
        Drawable drawable2 = AppCompatResources.getDrawable(homeActivity, com.info.wz.R.mipmap.ic_mine);
        Rect rect = new Rect(0, 0, SystemUtils.INSTANCE.dp2px(22.0f), SystemUtils.INSTANCE.dp2px(22.0f));
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
        ((ActivityHomeBinding) this.binding).scan.setCompoundDrawables(null, drawable, null, null);
        ((ActivityHomeBinding) this.binding).mine.setCompoundDrawables(null, drawable2, null, null);
        showFragment(getMainFragment());
    }

    @Override // com.muhua.wz.BaseActivity
    protected void initData() {
        this.url = getIntent().getStringExtra(WebViewFragment.URL);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getGameFragment().isVisible()) {
            showFragment(getMainFragment());
        } else {
            close();
        }
    }

    private final void close() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.mLastBackPressTime < this.OUT_DELAY) {
            super.onBackPressed();
        }
        this.mLastBackPressTime = jCurrentTimeMillis;
        ToastUtil toastUtil = ToastUtil.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        toastUtil.show(context, "再次返回退出程序");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        String str = this.url;
        if (str == null || str.length() == 0) {
            getAd();
        } else {
            String str2 = this.url;
            Intrinsics.checkNotNull(str2);
            WebViewActivity.INSTANCE.open(this, str2);
            this.url = null;
        }
        getVersion();
    }

    private final void getVersion() {
        ((ApiService) Injection.INSTANCE.provideApi(ApiService.class)).version(Constant.VERSION).compose(RxUtils.ioMain()).subscribe(new Observer<VersionInfo>() { // from class: com.muhua.wz.HomeActivity.getVersion.1
            @Override // io.reactivex.rxjava3.core.Observer
            public void onComplete() {
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onError(Throwable e) {
                Intrinsics.checkNotNullParameter(e, "e");
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onSubscribe(Disposable d) {
                Intrinsics.checkNotNullParameter(d, "d");
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onNext(VersionInfo versionInfo) {
                Intrinsics.checkNotNullParameter(versionInfo, "versionInfo");
                HomeActivity.this.showUpdateDialog(versionInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showUpdateDialog(VersionInfo versionInfo) {
        if (versionInfo == null || versionInfo.Version <= 7 || TextUtils.isEmpty(versionInfo.DownloadUrl)) {
            return;
        }
        String str = versionInfo.DownloadUrl;
        Intrinsics.checkNotNullExpressionValue(str, "versionInfo.DownloadUrl");
        new UpdateDialogFragment(str).show(getSupportFragmentManager(), "update");
    }

    public final void setGame(GameInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        getGameFragment().selectGame(info);
        showFragment(getGameFragment());
    }

    public final void showFragment(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "supportFragmentManager.beginTransaction()");
        fragmentTransactionBeginTransaction.replace(com.info.wz.R.id.container, fragment).commitAllowingStateLoss();
    }

    public final void getAd() {
        if (this.isGetAd) {
            return;
        }
        this.isGetAd = true;
        ((ApiService) Injection.INSTANCE.provideApi(ApiService.class)).getFirstPagePopupInfo(SystemUtils.INSTANCE.getUniqueID(this)).compose(RxUtils.ioMain()).subscribe(new DefaultObserver<FirstAdBean>() { // from class: com.muhua.wz.HomeActivity.getAd.1
            @Override // com.muhua.wz.net.DefaultObserver
            public void onFailure(Throwable throwable) {
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onSubscribe(Disposable d) {
                Intrinsics.checkNotNullParameter(d, "d");
                HomeActivity.this.addDisp(d);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onNext(FirstAdBean t) {
                Intrinsics.checkNotNullParameter(t, "t");
                HomeActivity.this.showFirst(t);
            }
        });
        ((ApiService) Injection.INSTANCE.provideApi(ApiService.class)).getAdsenseList(1, 20, 1).compose(RxUtils.ioMain()).subscribe(new DefaultObserver<Banners>() { // from class: com.muhua.wz.HomeActivity.getAd.2
            @Override // com.muhua.wz.net.DefaultObserver
            public void onFailure(Throwable throwable) {
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onSubscribe(Disposable d) {
                Intrinsics.checkNotNullParameter(d, "d");
                HomeActivity.this.addDisp(d);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onNext(Banners t) {
                Intrinsics.checkNotNullParameter(t, "t");
                HomeActivity.this.getMainFragment().setBanner(t);
            }
        });
        ((ApiService) Injection.INSTANCE.provideApi(ApiService.class)).getAdsenseList(1, 20, 4).compose(RxUtils.ioMain()).subscribe(new DefaultObserver<Banners>() { // from class: com.muhua.wz.HomeActivity.getAd.3
            @Override // com.muhua.wz.net.DefaultObserver
            public void onFailure(Throwable throwable) {
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onSubscribe(Disposable d) {
                Intrinsics.checkNotNullParameter(d, "d");
                HomeActivity.this.addDisp(d);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onNext(Banners t) {
                Intrinsics.checkNotNullParameter(t, "t");
                HomeActivity.this.getGameFragment().setBanner(t);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFirst(FirstAdBean t) {
        String imageUrl = t.getImageUrl();
        if (imageUrl == null || imageUrl.length() == 0) {
            return;
        }
        String linkUrl = t.getLinkUrl();
        if (linkUrl == null || linkUrl.length() == 0) {
            return;
        }
        new FirstPageDialog(t).show(this);
    }

    public final void backtoMain() {
        showScan();
    }
}
