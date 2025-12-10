package com.muhua.wz;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;
import com.core.base.utils.RxUtils;
import com.core.base.utils.StatusBarUtil;
import com.muhua.wz.util.DialogUtil;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseActivity<Binding> extends AppCompatActivity {
    protected Binding binding;
    protected Context context;
    private DialogUtil dialogUtil;
    private List<Disposable> disposables = new ArrayList();
    boolean isTrans = false;

    protected abstract void initBinding();

    protected abstract void initData();

    protected abstract void initView();

    public void setToolbarTitle(String str) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.isTrans) {
            StatusBarUtil.INSTANCE.setStatusBarTransparent(this);
        } else {
            StatusBarUtil.INSTANCE.lightMode(this, true);
        }
        this.context = this;
        this.dialogUtil = new DialogUtil(this);
        initActivity();
    }

    public void setTrans(boolean z) {
        this.isTrans = z;
    }

    protected void initActivity() {
        initBinding();
        setContentView(((ViewBinding) this.binding).getRoot());
        initView();
        initData();
    }

    protected void initLayout() {
        Binding binding = this.binding;
        if (binding == null) {
            throw new NullPointerException("binding is null");
        }
        setContentView(((ViewBinding) binding).getRoot());
    }

    public void addDisp(Disposable disposable) {
        this.disposables.add(disposable);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        RxUtils.unSubscribe(this.disposables);
    }

    public void showProgress() {
        this.dialogUtil.showProgressDialog(null);
    }

    public void showProgressNoBg() {
        this.dialogUtil.showProgressDialogNoBg(null);
    }

    public void showProgress(DialogInterface.OnCancelListener onCancelListener) {
        this.dialogUtil.showProgressDialog(onCancelListener);
    }

    public void hideProgress() {
        this.dialogUtil.hideProgressDialog();
    }

    public void back() {
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = super.getResources();
        Configuration configuration = resources.getConfiguration();
        if (configuration.fontScale != 1.0f) {
            configuration.fontScale = 1.0f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return resources;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        hideProgress();
    }
}
