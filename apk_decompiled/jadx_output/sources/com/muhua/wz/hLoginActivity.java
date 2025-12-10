package com.muhua.wz;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import com.core.base.Injection;
import com.core.base.utils.RxUtils;
import com.core.base.utils.SystemUtils;
import com.core.base.utils.ToastUtil;
import com.muhua.cloud.net.ApiService;
import com.muhua.wz.bean.UserModel;
import com.muhua.wz.net.DefaultObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginActivity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0016J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/muhua/wz/hLoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "editMobile", "Landroidx/appcompat/widget/AppCompatEditText;", "getEditMobile", "()Landroidx/appcompat/widget/AppCompatEditText;", "setEditMobile", "(Landroidx/appcompat/widget/AppCompatEditText;)V", "editPassword", "getEditPassword", "setEditPassword", "mobileNumber", "", "getMobileNumber", "()Ljava/lang/String;", "setMobileNumber", "(Ljava/lang/String;)V", "password", "getPassword", "setPassword", "login", "", "next", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class hLoginActivity extends AppCompatActivity {
    public AppCompatEditText editMobile;
    public AppCompatEditText editPassword;
    private String mobileNumber = "";
    private String password = "";

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final void setMobileNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final String getPassword() {
        return this.password;
    }

    public final void setPassword(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.password = str;
    }

    public final AppCompatEditText getEditMobile() {
        AppCompatEditText appCompatEditText = this.editMobile;
        if (appCompatEditText != null) {
            return appCompatEditText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editMobile");
        return null;
    }

    public final void setEditMobile(AppCompatEditText appCompatEditText) {
        Intrinsics.checkNotNullParameter(appCompatEditText, "<set-?>");
        this.editMobile = appCompatEditText;
    }

    public final AppCompatEditText getEditPassword() {
        AppCompatEditText appCompatEditText = this.editPassword;
        if (appCompatEditText != null) {
            return appCompatEditText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editPassword");
        return null;
    }

    public final void setEditPassword(AppCompatEditText appCompatEditText) {
        Intrinsics.checkNotNullParameter(appCompatEditText, "<set-?>");
        this.editPassword = appCompatEditText;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.info.wz.R.layout.activity_login);
        View viewFindViewById = findViewById(com.info.wz.R.id.edit_mobile);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.edit_mobile)");
        setEditMobile((AppCompatEditText) viewFindViewById);
        View viewFindViewById2 = findViewById(com.info.wz.R.id.edit_password);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.edit_password)");
        setEditPassword((AppCompatEditText) viewFindViewById2);
        findViewById(com.info.wz.R.id.confirm).setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.hLoginActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hLoginActivity.m3156onCreate$lambda0(this.f$0, view);
            }
        });
        String token = Application.getInstance().getToken();
        if (token == null || token.length() == 0) {
            return;
        }
        next();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m3156onCreate$lambda0(hLoginActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.login();
    }

    private final void login() {
        this.mobileNumber = String.valueOf(getEditMobile().getText());
        this.password = String.valueOf(getEditPassword().getText());
        if (TextUtils.isEmpty(this.mobileNumber)) {
            ToastUtil.INSTANCE.show(this, "请输入手机号");
            return;
        }
        if (TextUtils.isEmpty(this.password)) {
            ToastUtil.INSTANCE.show(this, "请输入密码");
            return;
        }
        HashMap map = new HashMap();
        map.put("mobile", this.mobileNumber);
        map.put("password", this.password);
        map.put(com.baidu.mobstat.Config.LAUNCH_TYPE, "2");
        map.put("code", "");
        map.put("device_id", SystemUtils.INSTANCE.getUniqueID(this));
        map.put("registration_id", "123123");
        ((ApiService) Injection.INSTANCE.provideApi(ApiService.class)).login(map).compose(RxUtils.ioMain()).subscribe(new DefaultObserver<UserModel>() { // from class: com.muhua.wz.hLoginActivity.login.1
            @Override // com.muhua.wz.net.DefaultObserver
            public void onFailure(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onSubscribe(Disposable d) {
                Intrinsics.checkNotNullParameter(d, "d");
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onNext(UserModel userModel) {
                Intrinsics.checkNotNullParameter(userModel, "userModel");
                if (TextUtils.isEmpty(userModel.getToken())) {
                    return;
                }
                Application.getInstance().setToken(userModel.getToken());
                hLoginActivity.this.finish();
                hLoginActivity.this.next();
            }
        });
    }

    public final void next() {
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
    }
}
