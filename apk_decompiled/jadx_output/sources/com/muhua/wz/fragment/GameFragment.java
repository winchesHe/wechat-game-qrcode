package com.muhua.wz.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.baidu.mobstat.Config;
import com.core.base.image.ImageLoader;
import com.core.base.image.transformation.CropCornerTransformation;
import com.info.wz.R;
import com.muhua.wz.BuildConfig;
import com.muhua.wz.Constant;
import com.muhua.wz.HomeActivity;
import com.muhua.wz.Utils;
import com.muhua.wz.WebViewActivity;
import com.muhua.wz.bean.Banners;
import com.muhua.wz.bean.GameInfo;
import com.muhua.wz.databinding.FragmentGameBinding;
import com.muhua.wz.fragment.GameFragment;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.RectangleIndicator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: GameFragment.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003012B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0005J$\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u001fH\u0016J\b\u0010)\u001a\u00020\u001fH\u0016J\u000e\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\rJ\u000e\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u000bJ\u0006\u0010.\u001a\u00020\u001fJ\b\u0010/\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\u0015¨\u00063"}, d2 = {"Lcom/muhua/wz/fragment/GameFragment;", "Lcom/muhua/wz/fragment/BaseFragment;", "Lcom/muhua/wz/databinding/FragmentGameBinding;", "()V", "JS_FINISH", "", "JS_MODIFY", "getJS_MODIFY", "()Ljava/lang/String;", "JS_SHOW_SHARE", "banners", "Lcom/muhua/wz/bean/Banners;", "current", "Lcom/muhua/wz/bean/GameInfo;", "getCurrent", "()Lcom/muhua/wz/bean/GameInfo;", "setCurrent", "(Lcom/muhua/wz/bean/GameInfo;)V", "currentUrl", "getCurrentUrl", "setCurrentUrl", "(Ljava/lang/String;)V", "mHelpDialog", "Lcom/muhua/wz/fragment/MsgDialogFragment;", "pkgScan", "getPkgScan", "setPkgScan", "base64ToBitmap", "Landroid/graphics/Bitmap;", "base64Data", "goGame", "", "str", "initBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initViews", "onResume", "selectGame", "gameInfo", "setBanner", "t", "showBanners", "showMsgDialog", "JavaScriptInterface", "MyWebChromeClient", "MyWebViewClient", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GameFragment extends BaseFragment<FragmentGameBinding> {
    private Banners banners;
    private GameInfo current;
    private MsgDialogFragment mHelpDialog;
    private String currentUrl = "";
    private String pkgScan = "";
    private final String JS_MODIFY = "javascript: function modifyPage() {\n    var cancel = document.getElementById('js_cancel_login');\n    cancel.style.display = 'none';\n    document.getElementsByClassName('auth_msg_wrp')[0].style.background = 'white';\n    document.getElementsByClassName('auth_msg js_qrscan')[0].style.marginTop = '60px';\n    document.getElementsByClassName('auth_msg js_qrscan')[0].style.verticalAlign = 'top';\n    document.getElementsByClassName('auth_global_tips')[0].style.fontSize= '16px';\n    document.getElementsByClassName('auth_qrcode')[0].style.background= '#FFFFFF';\n    document.getElementsByClassName('auth_qrcode')[0].style.marginTop= '30px';\n    document.getElementsByClassName('auth_nickname')[0].style.fontSize= '14px';\n    document.getElementsByClassName('auth_nickname')[0].style.marginTop= '8px';\n    document.getElementsByClassName('auth_msg_bd')[0].remove();\n    document.getElementsByClassName('auth_msg_ft_link')[0].remove();\n    document.getElementsByClassName('auth_msg_ft')[0].style.fontSize= '12px';\n    document.getElementsByClassName('auth_msg_ft')[0].style.color= '#8F94A7';\n    document.getElementsByClassName('auth_msg_ft')[0].style.marginTop = '100px';\n    document.getElementsByClassName('auth_msg_ft')[0].innerHTML = '扫码只用于授权，不会登录你的微信<br>部分特殊游戏登录，<a class=\"auth_msg_ft_link\" href=\"javascript:android.showHelp()\">查看说明</a>仅支持摄像头扫码识别<br><a class=\"auth_msg_ft_link\" href=\"javascript:android.feedback()\"></a>';\n    document.getElementsByClassName('auth_msg_ft_link')[0].style.color= '#0C8FF7';\n\n};\nmodifyPage();";
    private final String JS_FINISH = "javascript:function getBase64Image(img,width,height){var canvas=document.createElement('canvas');let w=width?width:img.width;let h=height?height:img.height;canvas.width=w*1.1;canvas.height=h*1.1;var ctx=canvas.getContext('2d');ctx.fillStyle='#f3f3f3';ctx.fillRect(0,0,canvas.width,canvas.height);let padding=(canvas.width-w)/2;ctx.drawImage(img,padding,0,w,h);let fontSize=canvas.width/13;ctx.font=fontSize+'px Arial';ctx.textAlign='center';ctx.textBaseline='bottom';ctx.fillStyle='#f00';ctx.fillText('仅支持摄像头扫码识别',canvas.width/2,h*1.05);var dataURL=canvas.toDataURL();return dataURL};function loadImage(){modifyPage();var img=new Image();img.src=document.getElementsByClassName('auth_qrcode')[0].src;if(img.complete){android.loadQrcodeResult(getBase64Image(img));return}img.onload=function(){console.loadQrcodeResult(getBase64Image(img))}};jQuery(document).ready(function(){});loadImage();";
    private final String JS_SHOW_SHARE = "javascript:function showShare(){var share=document.getElementById('share');if(share){share.style.visibility='visible'}};showShare();";

    public final GameInfo getCurrent() {
        return this.current;
    }

    public final void setCurrent(GameInfo gameInfo) {
        this.current = gameInfo;
    }

    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    public final void setCurrentUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentUrl = str;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Binding, com.muhua.wz.databinding.FragmentGameBinding] */
    @Override // com.muhua.wz.fragment.BaseFragment
    public void initBinding(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.binding = FragmentGameBinding.inflate(inflater, container, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.muhua.wz.fragment.BaseFragment
    public void initViews() {
        WebSettings settings = ((FragmentGameBinding) this.binding).webview.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "binding.webview.getSettings()");
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        this.context.getCacheDir().getAbsolutePath();
        settings.setAllowFileAccess(true);
        settings.setMixedContentMode(0);
        settings.setJavaScriptEnabled(true);
        settings.setUserAgentString("Mozilla/5.0 (Linux; Android 7.0; Mi-4c Build/NRD90M; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/53.0.2785.49 Mobile MQQBrowser/6.2 TBS/043632 Safari/537.36 MicroMessenger/6.6.1.1220(0x26060135) NetType/WIFI Language/zh_CN MicroMessenger/6.6.1.1220(0x26060135) NetType/WIFI Language/zh_CN miniProgram");
        ((FragmentGameBinding) this.binding).webview.setWebViewClient(new MyWebViewClient());
        ((FragmentGameBinding) this.binding).webview.setWebChromeClient(new MyWebChromeClient());
        ((FragmentGameBinding) this.binding).webview.addJavascriptInterface(new JavaScriptInterface(), "android");
        ((FragmentGameBinding) this.binding).back.setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.fragment.GameFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameFragment.m3146initViews$lambda0(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initViews$lambda-0, reason: not valid java name */
    public static final void m3146initViews$lambda0(GameFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.muhua.wz.HomeActivity");
        }
        ((HomeActivity) activity).backtoMain();
    }

    public final void selectGame(GameInfo gameInfo) {
        Intrinsics.checkNotNullParameter(gameInfo, "gameInfo");
        this.current = gameInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.muhua.wz.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.binding != 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[2];
            GameInfo gameInfo = this.current;
            objArr[0] = gameInfo != null ? gameInfo.appId : null;
            GameInfo gameInfo2 = this.current;
            objArr[1] = gameInfo2 != null ? gameInfo2.bundleId : null;
            String str = String.format(locale, Constant.URL, Arrays.copyOf(objArr, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            this.currentUrl = str;
            ((FragmentGameBinding) this.binding).webview.clearHistory();
            ((FragmentGameBinding) this.binding).webview.loadUrl(this.currentUrl);
            TextView textView = ((FragmentGameBinding) this.binding).title;
            GameInfo gameInfo3 = this.current;
            textView.setText(gameInfo3 != null ? gameInfo3.name : null);
            showBanners();
        }
    }

    public final String getPkgScan() {
        return this.pkgScan;
    }

    public final void setPkgScan(String str) {
        this.pkgScan = str;
    }

    /* compiled from: GameFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/muhua/wz/fragment/GameFragment$MyWebChromeClient;", "Landroid/webkit/WebChromeClient;", "(Lcom/muhua/wz/fragment/GameFragment;)V", "onProgressChanged", "", "view", "Landroid/webkit/WebView;", "newProgress", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyWebChromeClient extends WebChromeClient {
        public MyWebChromeClient() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView view, int newProgress) {
            Intrinsics.checkNotNullParameter(view, "view");
            super.onProgressChanged(view, newProgress);
            if (newProgress == 100 && Intrinsics.areEqual(GameFragment.this.getCurrentUrl(), view.getUrl())) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.getDefault(), GameFragment.this.getJS_MODIFY(), Arrays.copyOf(new Object[]{"hidden", ""}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                view.loadUrl(str);
            }
        }
    }

    public final void setBanner(Banners t) {
        Intrinsics.checkNotNullParameter(t, "t");
        if (t.getLists() == null || t.getLists().size() == 0) {
            return;
        }
        this.banners = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showBanners() {
        if (this.banners == null) {
            return;
        }
        ((FragmentGameBinding) this.binding).banner.setVisibility(0);
        Banner bannerAddBannerLifecycleObserver = ((FragmentGameBinding) this.binding).banner.addBannerLifecycleObserver(this);
        Banners banners = this.banners;
        Intrinsics.checkNotNull(banners);
        Banner indicatorNormalColor = bannerAddBannerLifecycleObserver.setAdapter(new AnonymousClass1(banners.getLists())).setIndicator(new RectangleIndicator(this.context)).setIndicatorSelectedColor(268435455).setIndicatorNormalColor(2030043135);
        Intrinsics.checkNotNull(this.banners);
        indicatorNormalColor.setLoopTime(r1.getShowDuration() * 1000);
    }

    /* compiled from: GameFragment.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"com/muhua/wz/fragment/GameFragment$showBanners$1", "Lcom/youth/banner/adapter/BannerImageAdapter;", "Lcom/muhua/wz/bean/Banner;", "onBindView", "", "holder", "Lcom/youth/banner/holder/BannerImageHolder;", "data", "position", "", "size", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.muhua.wz.fragment.GameFragment$showBanners$1, reason: invalid class name */
    public static final class AnonymousClass1 extends BannerImageAdapter<com.muhua.wz.bean.Banner> {
        AnonymousClass1(ArrayList<com.muhua.wz.bean.Banner> arrayList) {
            super(arrayList);
        }

        @Override // com.youth.banner.holder.IViewHolder
        public void onBindView(BannerImageHolder holder, final com.muhua.wz.bean.Banner data, int position, int size) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            ImageLoader.with(GameFragment.this.context).load(data.getImageUrl()).apply(new CropCornerTransformation(12, true)).into(holder.imageView);
            holder.imageView.setTag(data.getLinkUrl());
            ImageView imageView = holder.imageView;
            final GameFragment gameFragment = GameFragment.this;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.fragment.GameFragment$showBanners$1$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GameFragment.AnonymousClass1.m3147onBindView$lambda0(gameFragment, data, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onBindView$lambda-0, reason: not valid java name */
        public static final void m3147onBindView$lambda0(GameFragment this$0, com.muhua.wz.bean.Banner data, View v) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(data, "$data");
            Intrinsics.checkNotNullParameter(v, "v");
            WebViewActivity.Companion companion = WebViewActivity.INSTANCE;
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            companion.open(contextRequireContext, data.getLinkUrl());
        }
    }

    public final void goGame(String str) {
        TextUtils.isEmpty(this.pkgScan);
        String queryParameter = Uri.parse(str).getQueryParameter("code");
        GameInfo gameInfo = this.current;
        String strValueOf = String.valueOf(gameInfo != null ? gameInfo.pkg : null);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_wxapi_sendauth_resp_url", str);
            bundle.putString("_wxapi_sendauth_resp_state", strValueOf);
            bundle.putString("_wxapi_sendauth_resp_token", queryParameter);
            bundle.putString("_wxapi_baseresp_transaction", null);
            bundle.putString("_wxapi_sendauth_resp_lang", "zh_CN");
            bundle.putInt("_wxapi_command_type", 1);
            bundle.putString("_wxapi_sendauth_resp_country", "CN");
            bundle.putInt("_wxapi_baseresp_errcode", 0);
            bundle.putString("_wxapi_baseresp_errstr", null);
            bundle.putString("_wxapi_baseresp_openId", null);
            bundle.putString("wx_token_key", "com.tencent.mm.openapi.token");
            Intent intent = new Intent();
            intent.setClassName(strValueOf, strValueOf + Utils.DEFAULT_ENTRY_CLASS_NAME);
            intent.putExtras(bundle);
            intent.putExtra(Utils.SDK_VERSION, 621086720);
            intent.putExtra(Utils.APP_PACKAGE, Constant.MMESSAGE_APPPACKAGE);
            intent.putExtra(Utils.CONTENT, BuildConfig.APPLICATION_ID);
            intent.putExtra(Utils.TOKEN, (String) null);
            intent.putExtra(Utils.CHECK_SUM, Utils.sign(BuildConfig.APPLICATION_ID, 621086720, Constant.MMESSAGE_APPPACKAGE));
            intent.addFlags(268435456);
            startActivity(intent);
            Toast.makeText(this.context, "登录成功！", 0);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this.context, "登录失败！请重试！", 0);
        }
    }

    public final String getJS_MODIFY() {
        return this.JS_MODIFY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMsgDialog() {
        Object[] objArr = new Object[1];
        GameInfo gameInfo = this.current;
        objArr[0] = gameInfo != null ? gameInfo.name : null;
        String string = getString(R.string.help_dialog_title, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.help_…log_title, current?.name)");
        GameInfo gameInfo2 = this.current;
        String str = gameInfo2 != null ? gameInfo2.help : null;
        if (this.mHelpDialog == null) {
            MsgDialogFragment msgDialogFragment = new MsgDialogFragment();
            this.mHelpDialog = msgDialogFragment;
            Intrinsics.checkNotNull(msgDialogFragment);
            msgDialogFragment.setLeftGone(true).setRightText(getString(R.string.help_known));
        }
        MsgDialogFragment msgDialogFragment2 = this.mHelpDialog;
        Intrinsics.checkNotNull(msgDialogFragment2);
        MsgDialogFragment msgText = msgDialogFragment2.setTitleText(string).setMsgText(str);
        FragmentActivity activity = getActivity();
        msgText.showAllowingStateLoss(activity != null ? activity.getFragmentManager() : null, "MsgDialog");
    }

    /* compiled from: GameFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lcom/muhua/wz/fragment/GameFragment$JavaScriptInterface;", "", "(Lcom/muhua/wz/fragment/GameFragment;)V", "feedback", "", "loadQrcodeResult", "image", "", "shareQr", "showHelp", "toUpdate", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class JavaScriptInterface {
        @JavascriptInterface
        public final void feedback() {
        }

        @JavascriptInterface
        public final void loadQrcodeResult(String image) {
            Intrinsics.checkNotNullParameter(image, "image");
        }

        @JavascriptInterface
        public final void shareQr() {
        }

        @JavascriptInterface
        public final void toUpdate() {
        }

        public JavaScriptInterface() {
        }

        @JavascriptInterface
        public final void showHelp() {
            GameFragment.this.showMsgDialog();
        }
    }

    public final Bitmap base64ToBitmap(String base64Data) {
        byte[] bArrDecode = Base64.decode(base64Data, 0);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeByteArray, "decodeByteArray(bytes, 0, bytes.size)");
        return bitmapDecodeByteArray;
    }

    /* compiled from: GameFragment.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\bH\u0016¨\u0006\u0013"}, d2 = {"Lcom/muhua/wz/fragment/GameFragment$MyWebViewClient;", "Landroid/webkit/WebViewClient;", "(Lcom/muhua/wz/fragment/GameFragment;)V", "onLoadResource", "", "view", "Landroid/webkit/WebView;", WebViewFragment.URL, "", "onPageFinished", "onReceivedSslError", "webView", "sslErrorHandler", "Landroid/webkit/SslErrorHandler;", "sslError", "Landroid/net/http/SslError;", "shouldOverrideUrlLoading", "", "str", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyWebViewClient extends WebViewClient {
        public MyWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            super.onLoadResource(view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            super.onPageFinished(view, url);
            if (Intrinsics.areEqual(GameFragment.this.getCurrentUrl(), url)) {
                view.loadUrl(GameFragment.this.JS_FINISH);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Intrinsics.checkNotNullParameter(str, "str");
            try {
                if (!StringsKt.startsWith$default(str, "https", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str, (CharSequence) "oauth?code", false, 2, (Object) null)) {
                    GameFragment.this.goGame(str);
                    return true;
                }
                Uri uri = Uri.parse(str);
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames.contains(Config.FEED_LIST_ITEM_CUSTOM_ID) && queryParameterNames.contains("c")) {
                    GameFragment.this.setPkgScan(uri.getQueryParameter("c"));
                }
                webView.loadUrl(str);
            } catch (Exception unused) {
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Intrinsics.checkNotNullParameter(sslErrorHandler, "sslErrorHandler");
            Intrinsics.checkNotNullParameter(sslError, "sslError");
            sslErrorHandler.proceed();
        }
    }
}
