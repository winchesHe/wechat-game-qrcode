package com.muhua.wz;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.core.base.Injection;
import com.core.base.utils.RxUtils;
import com.muhua.cloud.net.ApiService;
import com.muhua.wz.bean.GameInfo;
import com.muhua.wz.bean.MenuList;
import com.muhua.wz.bean.VersionInfo;
import com.muhua.wz.fragment.MenuDialogFragment;
import com.muhua.wz.fragment.MsgDialogFragment;
import com.muhua.wz.fragment.ProgressDialogFragment;
import com.muhua.wz.fragment.UpdateDialogFragment;
import com.muhua.wz.menu.MenuAdapter;
import com.muhua.wz.util.ImageLoaderUtil;
import com.muhua.wz.util.MenuUtil;
import com.muhua.wz.util.image.ImageUtils;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import p027.p028.p029.InterfaceC0417;

/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity implements MenuDialogFragment.MenuClickListener {
    private static final String JS_FINISH = "javascript:function getBase64Image(img,width,height){var canvas=document.createElement('canvas');let w=width?width:img.width;let h=height?height:img.height;canvas.width=w*1.1;canvas.height=h*1.1;var ctx=canvas.getContext('2d');ctx.fillStyle='#f3f3f3';ctx.fillRect(0,0,canvas.width,canvas.height);let padding=(canvas.width-w)/2;ctx.drawImage(img,padding,0,w,h);let fontSize=canvas.width/13;ctx.font=fontSize+'px Arial';ctx.textAlign='center';ctx.textBaseline='bottom';ctx.fillStyle='#f00';ctx.fillText('仅支持摄像头扫码识别',canvas.width/2,h*1.05);var dataURL=canvas.toDataURL();return dataURL};function loadImage(){modifyPage();var img=new Image();img.src=document.getElementsByClassName('auth_qrcode')[0].src;if(img.complete){android.loadQrcodeResult(getBase64Image(img));return}img.onload=function(){console.loadQrcodeResult(getBase64Image(img))}};jQuery(document).ready(function(){});loadImage();";
    private static final String JS_MODIFY = "javascript:function modifyPage(){var cancel=document.getElementById('js_cancel_login');cancel.style.display='none';document.getElementsByClassName('auth_msg_bd')[0].style.marginTop='60px';document.getElementsByClassName('auth_rights_tips')[0].innerHTML='扫码只用于授权，不会登录你的微信<br>部分特殊游戏登录，<a class=\"auth_msg_ft_link\" href=\"javascript:android.showHelp()\">查看说明</a><br>仅支持摄像头扫码识别<br><br><a class=\"auth_msg_ft_link\" href=\"javascript:android.feedback()\"></a>';if(!document.getElementById('update')){var update = document.createElement('div');update.id='update';update.style.display='block';update.style.color='#f00';update.style.marginTop='10px';update.style.visibility='%s';update.innerHTML='发现新版本%s<a class=\"auth_msg_ft_link\" href=\"javascript:android.toUpdate()\"></a>';document.getElementsByClassName('auth_rights_tips')[0].appendChild(update);}if(!document.getElementById('share')){var share = document.createElement('a');share.id='share';share.className='auth_msg_ft_link';share.style.display='block';share.style.marginTop='10px';share.style.visibility='hidden';share.href='javascript:android.shareQr()';share.appendChild(document.createTextNode(''));document.getElementsByClassName('auth_msg_hd')[0].appendChild(share);}};modifyPage();";
    private static final String JS_SHOW_SHARE = "javascript:function showShare(){var share=document.getElementById('share');if(share){share.style.visibility='visible'}};showShare();";
    private SharedPreferences mConfig;
    private GameInfo mCurrentGame;
    private String mCurrentUrl;
    private MsgDialogFragment mHelpDialog;
    private Bitmap mIdentityBitmap;
    private MsgDialogFragment mIdentityDialog;
    private MenuAdapter mMenuAdapter;
    private MenuDialogFragment mMenuDialog;
    private MenuList mMenuList;
    private ProgressDialogFragment mProgressDialog;
    private Bitmap mQrBitmap;
    private MenuItem mRefreshItem;
    private WebView mWebView;
    String pkgScan = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void feedback() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startToRelease() {
    }

    private void update() {
    }

    @Override // com.muhua.wz.fragment.MenuDialogFragment.MenuClickListener
    public void onGameUpdateClick() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    private void initView() {
        WebView.setWebContentsDebuggingEnabled(false);
        setStatusBarColor();
        setContentView(com.info.wz.R.layout.activity_main);
        WebView webView = (WebView) findViewById(com.info.wz.R.id.web_view);
        this.mWebView = webView;
        WebSettings settings = webView.getSettings();
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        getApplicationContext().getCacheDir().getAbsolutePath();
        settings.setAllowFileAccess(true);
        settings.setMixedContentMode(0);
        settings.setJavaScriptEnabled(true);
        settings.setUserAgentString("Mozilla/5.0 (Linux; Android 7.0; Mi-4c Build/NRD90M; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/53.0.2785.49 Mobile MQQBrowser/6.2 TBS/043632 Safari/537.36 MicroMessenger/6.6.1.1220(0x26060135) NetType/WIFI Language/zh_CN MicroMessenger/6.6.1.1220(0x26060135) NetType/WIFI Language/zh_CN miniProgram");
        this.mWebView.setWebViewClient(new MyWebViewClient());
        this.mWebView.setWebChromeClient(new MyWebChromeClient());
        this.mWebView.addJavascriptInterface(new JavaScriptInterface(), "android");
        getConfig();
        getVersion();
        initMenu();
    }

    private void initMenu() {
        MenuList menu = MenuUtil.getMenu(this);
        this.mMenuList = menu;
        selectGame(menu.menu.get(getConfig().getString(Constant.CONFIG_GAME, "")));
    }

    private SharedPreferences getConfig() {
        if (this.mConfig == null) {
            this.mConfig = getSharedPreferences("config", 0);
        }
        return this.mConfig;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clear() {
        ImageLoaderUtil.getInstance().cancelAll((ImageLoaderUtil.RequestFilter) null);
        Bitmap bitmap = this.mQrBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.mQrBitmap = null;
        }
        Bitmap bitmap2 = this.mIdentityBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.mIdentityBitmap = null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            if (iArr[0] == 0) {
                startShare();
            } else {
                Toast.makeText(this, "二维码写入失败", 0);
            }
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.info.wz.R.menu.main, menu);
        this.mRefreshItem = menu.findItem(com.info.wz.R.id.refresh);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (menuItem.getItemId() == com.info.wz.R.id.refresh) {
            WebView webView = this.mWebView;
            if (webView != null) {
                webView.clearHistory();
                this.mWebView.loadUrl(this.mCurrentUrl);
            }
            return true;
        }
        if (menuItem.getItemId() == com.info.wz.R.id.more) {
            showGameMenu();
            return true;
        }
        GameInfo gameInfo = this.mMenuList.menu.get(menuItem.getTitle().toString());
        if (gameInfo != null) {
            selectGame(gameInfo);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startShare() {
        File fileSaveQrBitmapFile;
        try {
            Bitmap bitmap = this.mQrBitmap;
            if (bitmap == null || bitmap.isRecycled() || (fileSaveQrBitmapFile = ImageUtils.saveQrBitmapFile(this, this.mQrBitmap, "qr.jpg")) == null) {
                return;
            }
            shareOneFile(fileSaveQrBitmapFile.getAbsolutePath());
        } catch (Exception unused) {
            Toast.makeText(this, "分享二维码失败", 0);
        }
    }

    private void startShareIdentity() {
        File fileSaveQrBitmapFile;
        try {
            Bitmap bitmap = this.mIdentityBitmap;
            if (bitmap == null || bitmap.isRecycled()) {
                this.mIdentityBitmap = BitmapFactory.decodeStream(getAssets().open("identity_qr.png"));
            }
            Bitmap bitmap2 = this.mIdentityBitmap;
            if (bitmap2 == null || bitmap2.isRecycled() || (fileSaveQrBitmapFile = ImageUtils.saveQrBitmapFile(this, this.mIdentityBitmap, "identity.jpg")) == null) {
                return;
            }
            shareOneFile(fileSaveQrBitmapFile.getAbsolutePath());
        } catch (Exception unused) {
            Toast.makeText(this, "分享二维码失败", 0);
        }
    }

    private boolean checkPermission() {
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT >= 24 || checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        return false;
    }

    private void setStatusBarColor() {
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(getResources().getColor(com.info.wz.R.color.colorPrimary));
    }

    public class MyWebViewClient extends WebViewClient {
        public MyWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (MainActivity.this.mCurrentUrl.equals(str)) {
                webView.loadUrl(MainActivity.JS_FINISH);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            try {
                if (!str.startsWith("https") && str.contains("oauth?code")) {
                    MainActivity.this.goGame(str);
                    return true;
                }
                Uri uri = Uri.parse(str);
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames.contains(com.baidu.mobstat.Config.FEED_LIST_ITEM_CUSTOM_ID) && queryParameterNames.contains("c")) {
                    MainActivity.this.pkgScan = uri.getQueryParameter("c");
                }
                webView.loadUrl(str);
            } catch (Exception unused) {
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.proceed();
        }
    }

    public class MyWebChromeClient extends WebChromeClient {
        public MyWebChromeClient() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            if (i == 100 && MainActivity.this.mCurrentUrl.equals(webView.getUrl())) {
                webView.loadUrl(String.format(Locale.getDefault(), MainActivity.JS_MODIFY, "hidden", ""));
            }
        }
    }

    public void goGame(String str) {
        TextUtils.isEmpty(this.pkgScan);
        String queryParameter = Uri.parse(str).getQueryParameter("code");
        String str2 = this.mCurrentGame.pkg;
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_wxapi_sendauth_resp_url", str);
            bundle.putString("_wxapi_sendauth_resp_state", str2);
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
            intent.setClassName(str2, str2 + Utils.DEFAULT_ENTRY_CLASS_NAME);
            intent.putExtras(bundle);
            intent.putExtra(Utils.SDK_VERSION, 621086720);
            intent.putExtra(Utils.APP_PACKAGE, Constant.MMESSAGE_APPPACKAGE);
            intent.putExtra(Utils.CONTENT, BuildConfig.APPLICATION_ID);
            intent.putExtra(Utils.TOKEN, (String) null);
            intent.putExtra(Utils.CHECK_SUM, Utils.sign(BuildConfig.APPLICATION_ID, 621086720, Constant.MMESSAGE_APPPACKAGE));
            intent.addFlags(268435456);
            startActivity(intent);
            Toast.makeText(this, "登录成功！", 0);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "登录失败！请重试！", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class JavaScriptInterface {
        private JavaScriptInterface() {
        }

        @JavascriptInterface
        public void loadQrcodeResult(String str) {
            MainActivity.this.clear();
            MainActivity.this.mQrBitmap = MainActivity.base64ToBitmap(str.replace("data:image/png;base64,", ""));
            MainActivity.this.runOnUiThread(new Runnable() { // from class: com.muhua.wz.MainActivity$JavaScriptInterface$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3138x982d1343();
                }
            });
        }

        /* renamed from: lambda$loadQrcodeResult$0$com-muhua-wz-MainActivity$JavaScriptInterface, reason: not valid java name */
        /* synthetic */ void m3138x982d1343() {
            if (MainActivity.this.mWebView != null) {
                MainActivity.this.mWebView.loadUrl(MainActivity.JS_SHOW_SHARE);
            }
        }

        /* renamed from: lambda$showHelp$1$com-muhua-wz-MainActivity$JavaScriptInterface, reason: not valid java name */
        /* synthetic */ void m3139lambda$showHelp$1$commuhuawzMainActivity$JavaScriptInterface() {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.showMsgDialog(mainActivity.getString(com.info.wz.R.string.help_dialog_title, new Object[]{mainActivity.mCurrentGame.name}), MainActivity.this.mCurrentGame.help);
        }

        @JavascriptInterface
        public void showHelp() {
            MainActivity.this.runOnUiThread(new Runnable() { // from class: com.muhua.wz.MainActivity$JavaScriptInterface$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3139lambda$showHelp$1$commuhuawzMainActivity$JavaScriptInterface();
                }
            });
        }

        @JavascriptInterface
        public void shareQr() {
            final MainActivity mainActivity = MainActivity.this;
            mainActivity.runOnUiThread(new Runnable() { // from class: com.muhua.wz.MainActivity$JavaScriptInterface$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    mainActivity.startShare();
                }
            });
        }

        @JavascriptInterface
        public void toUpdate() {
            final MainActivity mainActivity = MainActivity.this;
            mainActivity.runOnUiThread(new Runnable() { // from class: com.muhua.wz.MainActivity$JavaScriptInterface$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    mainActivity.startToRelease();
                }
            });
        }

        @JavascriptInterface
        public void feedback() {
            final MainActivity mainActivity = MainActivity.this;
            mainActivity.runOnUiThread(new Runnable() { // from class: com.muhua.wz.MainActivity$JavaScriptInterface$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    mainActivity.feedback();
                }
            });
        }
    }

    public static Bitmap base64ToBitmap(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    private void selectGame(GameInfo gameInfo) {
        if (gameInfo == null) {
            gameInfo = this.mMenuList.menu.get(this.mMenuList.menu.keySet().iterator().next());
        }
        if (gameInfo != null) {
            this.mCurrentGame = gameInfo;
            this.mCurrentUrl = String.format(Locale.getDefault(), Constant.URL, this.mCurrentGame.appId, this.mCurrentGame.bundleId);
            this.mWebView.clearHistory();
            this.mWebView.loadUrl(this.mCurrentUrl);
            getConfig().edit().putString(Constant.CONFIG_GAME, gameInfo.name).apply();
        }
    }

    private void shareOneFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            Uri uri = getUri(file);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.addFlags(1);
            intent.setDataAndType(uri, InterfaceC0417.f661);
            intent.putExtra("android.intent.extra.STREAM", uri);
            startActivity(Intent.createChooser(intent, "二维码分享"));
        }
    }

    private Uri getUri(File file) {
        if (Build.VERSION.SDK_INT >= 24) {
            return FileProvider.getUriForFile(getApplicationContext(), getApplicationInfo().packageName + ".fileProvider", file);
        }
        return Uri.fromFile(file);
    }

    private void showGameMenu() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (this.mMenuList == null) {
            return;
        }
        if (this.mMenuDialog == null) {
            MenuAdapter menuAdapter = new MenuAdapter(this, new ArrayList(this.mMenuList.menu.values()));
            this.mMenuAdapter = menuAdapter;
            this.mMenuDialog = MenuDialogFragment.getInstance(menuAdapter, this);
        }
        this.mMenuDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.muhua.wz.MainActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.m3137lambda$showGameMenu$0$commuhuawzMainActivity(dialogInterface);
            }
        }).showAllowingStateLoss(getFragmentManager(), "MenuDialog");
    }

    /* renamed from: lambda$showGameMenu$0$com-muhua-wz-MainActivity, reason: not valid java name */
    /* synthetic */ void m3137lambda$showGameMenu$0$commuhuawzMainActivity(DialogInterface dialogInterface) {
        MenuItem menuItem = this.mRefreshItem;
        if (menuItem != null) {
            menuItem.getIcon().setTint(getResources().getColor(com.info.wz.R.color.white));
            this.mRefreshItem.getIcon().invalidateSelf();
        }
    }

    private void getVersion() {
        ((ApiService) Injection.INSTANCE.provideApi(ApiService.class)).version(Constant.VERSION).compose(RxUtils.ioMain()).subscribe(new Observer<VersionInfo>() { // from class: com.muhua.wz.MainActivity.1
            @Override // io.reactivex.rxjava3.core.Observer
            public void onComplete() {
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onError(Throwable th) {
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onSubscribe(Disposable disposable) {
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onNext(VersionInfo versionInfo) {
                MainActivity.this.showUpdateDialog(versionInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showUpdateDialog(VersionInfo versionInfo) {
        if (versionInfo == null || versionInfo.Version <= 7 || TextUtils.isEmpty(versionInfo.DownloadUrl)) {
            return;
        }
        new UpdateDialogFragment(versionInfo.DownloadUrl).show(getSupportFragmentManager(), "update");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMsgDialog(String str, String str2) {
        if (this.mHelpDialog == null) {
            MsgDialogFragment msgDialogFragment = new MsgDialogFragment();
            this.mHelpDialog = msgDialogFragment;
            msgDialogFragment.setLeftGone(true).setRightText(getString(com.info.wz.R.string.help_known));
        }
        this.mHelpDialog.setTitleText(str).setMsgText(str2).showAllowingStateLoss(getFragmentManager(), "MsgDialog");
    }

    public void showProgressDialog() {
        if (getDialog() != null) {
            getDialog().showAllowingStateLoss(getFragmentManager(), "dialog");
        }
    }

    public void dismissProgressDialog() {
        if (getDialog() != null) {
            try {
                getDialog().dismissAllowingStateLoss();
            } catch (Exception unused) {
            }
        }
    }

    public ProgressDialogFragment getDialog() {
        if (this.mProgressDialog == null) {
            this.mProgressDialog = new ProgressDialogFragment();
        }
        return this.mProgressDialog;
    }

    @Override // com.muhua.wz.fragment.MenuDialogFragment.MenuClickListener
    public void onGameSelect(GameInfo gameInfo) {
        selectGame(gameInfo);
    }
}
