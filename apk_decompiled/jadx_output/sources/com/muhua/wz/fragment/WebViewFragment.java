package com.muhua.wz.fragment;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.baidu.mobstat.Config;
import com.muhua.wz.databinding.FragmentWebViewBinding;
import com.muhua.wz.util.WebViewSettingUtil;
import p027.p028.p029.InterfaceC0417;

/* loaded from: classes.dex */
public class WebViewFragment extends BaseFragment<FragmentWebViewBinding> {
    public static final String URL = "url";
    ValueCallback mReceiver;
    private String mUrl = "";
    String title;

    public static WebViewFragment newInstance(String str) {
        WebViewFragment webViewFragment = new WebViewFragment();
        Bundle bundle = new Bundle();
        bundle.putString(URL, str);
        webViewFragment.setArguments(bundle);
        return webViewFragment;
    }

    public static WebViewFragment newInstance(String str, String str2) {
        WebViewFragment webViewFragment = new WebViewFragment();
        Bundle bundle = new Bundle();
        bundle.putString(URL, str);
        bundle.putString(Config.FEED_LIST_ITEM_TITLE, str2);
        webViewFragment.setArguments(bundle);
        return webViewFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.mUrl = getArguments().getString(URL);
            this.title = getArguments().getString(Config.FEED_LIST_ITEM_TITLE);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Binding, com.muhua.wz.databinding.FragmentWebViewBinding] */
    @Override // com.muhua.wz.fragment.BaseFragment
    public void initBinding(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.binding = FragmentWebViewBinding.inflate(layoutInflater, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.muhua.wz.fragment.BaseFragment
    public void initViews() {
        getActivity().getWindow().setSoftInputMode(18);
        ((FragmentWebViewBinding) this.binding).webview.setWebChromeClient(new WebChromeClient() { // from class: com.muhua.wz.fragment.WebViewFragment.1
            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                WebViewFragment.this.mReceiver = valueCallback;
                WebViewFragment.this.openFileChooserActivity();
                return true;
            }
        });
        WebViewSettingUtil.INSTANCE.setWebView(((FragmentWebViewBinding) this.binding).webview);
        if (TextUtils.isEmpty(this.title)) {
            return;
        }
        ((FragmentWebViewBinding) this.binding).title.setVisibility(0);
        ((FragmentWebViewBinding) this.binding).title.setText(this.title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openFileChooserActivity() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType(InterfaceC0417.f664);
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        intent.addCategory("android.intent.category.OPENABLE");
        startActivityForResult(intent, 1000);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri[] uriArr;
        if (i != 1000 || this.mReceiver == null) {
            return;
        }
        if (i2 != -1 || intent == null) {
            uriArr = null;
        } else {
            String dataString = intent.getDataString();
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                uriArr = new Uri[clipData.getItemCount()];
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    uriArr[i3] = clipData.getItemAt(i3).getUri();
                }
            } else {
                uriArr = null;
            }
            if (dataString != null) {
                uriArr = new Uri[]{Uri.parse(dataString)};
            }
        }
        ValueCallback valueCallback = this.mReceiver;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
        }
        this.mReceiver = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.muhua.wz.fragment.BaseFragment
    public void initData() {
        if (TextUtils.isEmpty(this.mUrl)) {
            return;
        }
        ((FragmentWebViewBinding) this.binding).webview.loadUrl(this.mUrl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void loadUrl(String str) {
        this.mUrl = str;
        if (TextUtils.isEmpty(str) || this.binding == 0) {
            return;
        }
        ((FragmentWebViewBinding) this.binding).webview.loadUrl(str);
    }

    public void startLoadUrl(String str) {
        if (TextUtils.isEmpty(str) || str.equals(this.mUrl)) {
            return;
        }
        this.mUrl = str;
        loadUrl(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onBackPress() {
        if (((FragmentWebViewBinding) this.binding).webview == null || !((FragmentWebViewBinding) this.binding).webview.canGoBack()) {
            return false;
        }
        ((FragmentWebViewBinding) this.binding).webview.goBack();
        return true;
    }
}
