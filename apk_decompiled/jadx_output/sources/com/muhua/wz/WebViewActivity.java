package com.muhua.wz;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.muhua.wz.databinding.ActivityWebViewBinding;
import com.muhua.wz.fragment.WebViewFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebViewActivity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0013\u001a\u00020\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/muhua/wz/WebViewActivity;", "Lcom/muhua/wz/BaseActivity;", "Lcom/muhua/wz/databinding/ActivityWebViewBinding;", "()V", "fragment", "Lcom/muhua/wz/fragment/WebViewFragment;", "getFragment", "()Lcom/muhua/wz/fragment/WebViewFragment;", "setFragment", "(Lcom/muhua/wz/fragment/WebViewFragment;)V", WebViewFragment.URL, "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "initBinding", "", "initData", "initView", "onBackPressed", "onPause", "setToolbar", com.baidu.mobstat.Config.FEED_LIST_ITEM_TITLE, "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebViewActivity extends BaseActivity<ActivityWebViewBinding> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String KEY = WebViewFragment.URL;
    private static final String TITLE = com.baidu.mobstat.Config.FEED_LIST_ITEM_TITLE;
    public WebViewFragment fragment;
    private String url;

    @Override // com.muhua.wz.BaseActivity
    protected void initData() {
    }

    public final WebViewFragment getFragment() {
        WebViewFragment webViewFragment = this.fragment;
        if (webViewFragment != null) {
            return webViewFragment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragment");
        return null;
    }

    public final void setFragment(WebViewFragment webViewFragment) {
        Intrinsics.checkNotNullParameter(webViewFragment, "<set-?>");
        this.fragment = webViewFragment;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Binding, com.muhua.wz.databinding.ActivityWebViewBinding] */
    @Override // com.muhua.wz.BaseActivity
    protected void initBinding() {
        this.binding = ActivityWebViewBinding.inflate(getLayoutInflater());
    }

    @Override // com.muhua.wz.BaseActivity
    protected void initView() {
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(com.info.wz.R.id.fragment);
        if (fragmentFindFragmentById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.muhua.wz.fragment.WebViewFragment");
        }
        setFragment((WebViewFragment) fragmentFindFragmentById);
        this.url = getIntent().getStringExtra(KEY);
        String stringExtra = getIntent().getStringExtra(TITLE);
        if (stringExtra != null) {
            setToolbar(stringExtra);
        }
        getFragment().startLoadUrl(this.url);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setToolbar(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        String str = title;
        if (TextUtils.isEmpty(str)) {
            ((ActivityWebViewBinding) this.binding).title.setVisibility(8);
            ((ActivityWebViewBinding) this.binding).back.setVisibility(8);
        } else {
            ((ActivityWebViewBinding) this.binding).title.setVisibility(0);
            ((ActivityWebViewBinding) this.binding).back.setVisibility(0);
            ((ActivityWebViewBinding) this.binding).title.setText(str);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getFragment().onBackPress()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    /* compiled from: WebViewActivity.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/muhua/wz/WebViewActivity$Companion;", "", "()V", "KEY", "", "getKEY", "()Ljava/lang/String;", "TITLE", "getTITLE", "open", "", "context", "Landroid/content/Context;", WebViewFragment.URL, com.baidu.mobstat.Config.FEED_LIST_ITEM_TITLE, "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getKEY() {
            return WebViewActivity.KEY;
        }

        public final String getTITLE() {
            return WebViewActivity.TITLE;
        }

        public final void open(Context context, String url) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Uri uri = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(url)");
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
        }

        public final void open(Context context, String url, String title) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(title, "title");
            Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
            intent.putExtra(getKEY(), url);
            intent.putExtra(getTITLE(), title);
            context.startActivity(intent);
        }
    }
}
