package com.azhon.appupdate.view;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.azhon.appupdate.R;
import com.azhon.appupdate.config.Constant;
import com.azhon.appupdate.listener.OnButtonClickListener;
import com.azhon.appupdate.listener.OnDownloadListenerAdapter;
import com.azhon.appupdate.manager.DownloadManager;
import com.azhon.appupdate.service.DownloadService;
import com.azhon.appupdate.util.ApkUtil;
import com.azhon.appupdate.util.DensityUtil;
import com.baidu.mobstat.Config;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: UpdateDialogActivity.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/azhon/appupdate/view/UpdateDialogActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "apk", "Ljava/io/File;", "btnUpdate", "Landroid/widget/Button;", Config.INPUT_INSTALLED_PKG, "", "listenerAdapter", "Lcom/azhon/appupdate/listener/OnDownloadListenerAdapter;", "manager", "Lcom/azhon/appupdate/manager/DownloadManager;", "progressBar", "Lcom/azhon/appupdate/view/NumberProgressBar;", "finish", "", "init", "initView", "onBackPressed", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setWindowSize", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UpdateDialogActivity extends AppCompatActivity implements View.OnClickListener {
    private File apk;
    private Button btnUpdate;
    private final int install = 69;
    private final OnDownloadListenerAdapter listenerAdapter = new OnDownloadListenerAdapter() { // from class: com.azhon.appupdate.view.UpdateDialogActivity$listenerAdapter$1
        @Override // com.azhon.appupdate.listener.OnDownloadListenerAdapter, com.azhon.appupdate.listener.OnDownloadListener
        public void downloading(int max, int progress) {
            NumberProgressBar numberProgressBar = null;
            if (max != -1) {
                NumberProgressBar numberProgressBar2 = this.this$0.progressBar;
                if (numberProgressBar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                    numberProgressBar2 = null;
                }
                if (numberProgressBar2.getVisibility() == 0) {
                    int i = (int) ((progress / max) * 100.0d);
                    NumberProgressBar numberProgressBar3 = this.this$0.progressBar;
                    if (numberProgressBar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                    } else {
                        numberProgressBar = numberProgressBar3;
                    }
                    numberProgressBar.setProgress(i);
                    return;
                }
            }
            NumberProgressBar numberProgressBar4 = this.this$0.progressBar;
            if (numberProgressBar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            } else {
                numberProgressBar = numberProgressBar4;
            }
            numberProgressBar.setVisibility(8);
        }

        @Override // com.azhon.appupdate.listener.OnDownloadListenerAdapter, com.azhon.appupdate.listener.OnDownloadListener
        public void done(File apk) {
            Intrinsics.checkNotNullParameter(apk, "apk");
            this.this$0.apk = apk;
            DownloadManager downloadManager = this.this$0.manager;
            Button button = null;
            if (downloadManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager = null;
            }
            if (downloadManager.getForcedUpgrade()) {
                Button button2 = this.this$0.btnUpdate;
                if (button2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("btnUpdate");
                    button2 = null;
                }
                button2.setTag(Integer.valueOf(this.this$0.install));
                Button button3 = this.this$0.btnUpdate;
                if (button3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("btnUpdate");
                    button3 = null;
                }
                button3.setEnabled(true);
                Button button4 = this.this$0.btnUpdate;
                if (button4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("btnUpdate");
                } else {
                    button = button4;
                }
                button.setText(this.this$0.getResources().getString(R.string.click_hint));
            }
        }
    };
    private DownloadManager manager;
    private NumberProgressBar progressBar;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws Resources.NotFoundException {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setTitle("");
        setContentView(R.layout.dialog_update);
        init();
    }

    private final void init() throws Resources.NotFoundException {
        DownloadManager downloadManager = null;
        DownloadManager instance$default = DownloadManager.Companion.getInstance$default(DownloadManager.INSTANCE, null, 1, null);
        this.manager = instance$default;
        if (instance$default == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
        } else {
            downloadManager = instance$default;
        }
        downloadManager.getOnDownloadListeners().add(this.listenerAdapter);
        setWindowSize();
        initView();
    }

    private final void initView() throws Resources.NotFoundException {
        View viewFindViewById = findViewById(R.id.ib_close);
        View viewFindViewById2 = findViewById(R.id.line);
        ImageView imageView = (ImageView) findViewById(R.id.iv_bg);
        TextView textView = (TextView) findViewById(R.id.tv_title);
        TextView textView2 = (TextView) findViewById(R.id.tv_size);
        TextView textView3 = (TextView) findViewById(R.id.tv_description);
        View viewFindViewById3 = findViewById(R.id.np_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.np_bar)");
        this.progressBar = (NumberProgressBar) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.btn_update);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.btn_update)");
        this.btnUpdate = (Button) viewFindViewById4;
        NumberProgressBar numberProgressBar = this.progressBar;
        DownloadManager downloadManager = null;
        if (numberProgressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            numberProgressBar = null;
        }
        DownloadManager downloadManager2 = this.manager;
        if (downloadManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager2 = null;
        }
        numberProgressBar.setVisibility(downloadManager2.getForcedUpgrade() ? 0 : 8);
        Button button = this.btnUpdate;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnUpdate");
            button = null;
        }
        button.setTag(0);
        Button button2 = this.btnUpdate;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnUpdate");
            button2 = null;
        }
        UpdateDialogActivity updateDialogActivity = this;
        button2.setOnClickListener(updateDialogActivity);
        viewFindViewById.setOnClickListener(updateDialogActivity);
        DownloadManager downloadManager3 = this.manager;
        if (downloadManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager3 = null;
        }
        if (downloadManager3.getDialogImage() != -1) {
            DownloadManager downloadManager4 = this.manager;
            if (downloadManager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager4 = null;
            }
            imageView.setBackgroundResource(downloadManager4.getDialogImage());
        }
        DownloadManager downloadManager5 = this.manager;
        if (downloadManager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager5 = null;
        }
        if (downloadManager5.getDialogButtonTextColor() != -1) {
            Button button3 = this.btnUpdate;
            if (button3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnUpdate");
                button3 = null;
            }
            DownloadManager downloadManager6 = this.manager;
            if (downloadManager6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager6 = null;
            }
            button3.setTextColor(downloadManager6.getDialogButtonTextColor());
        }
        DownloadManager downloadManager7 = this.manager;
        if (downloadManager7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager7 = null;
        }
        if (downloadManager7.getDialogProgressBarColor() != -1) {
            NumberProgressBar numberProgressBar2 = this.progressBar;
            if (numberProgressBar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                numberProgressBar2 = null;
            }
            DownloadManager downloadManager8 = this.manager;
            if (downloadManager8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager8 = null;
            }
            numberProgressBar2.setReachedBarColor(downloadManager8.getDialogProgressBarColor());
            NumberProgressBar numberProgressBar3 = this.progressBar;
            if (numberProgressBar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                numberProgressBar3 = null;
            }
            DownloadManager downloadManager9 = this.manager;
            if (downloadManager9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager9 = null;
            }
            numberProgressBar3.setProgressTextColor(downloadManager9.getDialogProgressBarColor());
        }
        DownloadManager downloadManager10 = this.manager;
        if (downloadManager10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager10 = null;
        }
        if (downloadManager10.getDialogButtonColor() != -1) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            DownloadManager downloadManager11 = this.manager;
            if (downloadManager11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager11 = null;
            }
            gradientDrawable.setColor(downloadManager11.getDialogButtonColor());
            gradientDrawable.setCornerRadius(DensityUtil.INSTANCE.dip2px(this, 3.0f));
            StateListDrawable stateListDrawable = new StateListDrawable();
            GradientDrawable gradientDrawable2 = gradientDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
            stateListDrawable.addState(new int[0], gradientDrawable2);
            Button button4 = this.btnUpdate;
            if (button4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnUpdate");
                button4 = null;
            }
            button4.setBackground(stateListDrawable);
        }
        DownloadManager downloadManager12 = this.manager;
        if (downloadManager12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager12 = null;
        }
        if (downloadManager12.getForcedUpgrade()) {
            viewFindViewById2.setVisibility(8);
            viewFindViewById.setVisibility(8);
        }
        DownloadManager downloadManager13 = this.manager;
        if (downloadManager13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager13 = null;
        }
        if (downloadManager13.getApkVersionName().length() > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = getResources().getString(R.string.dialog_new);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.dialog_new)");
            Object[] objArr = new Object[1];
            DownloadManager downloadManager14 = this.manager;
            if (downloadManager14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager14 = null;
            }
            objArr[0] = downloadManager14.getApkVersionName();
            String str = String.format(string, Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            textView.setText(str);
        }
        DownloadManager downloadManager15 = this.manager;
        if (downloadManager15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager15 = null;
        }
        if (downloadManager15.getApkSize().length() > 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String string2 = getResources().getString(R.string.dialog_new_size);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.dialog_new_size)");
            Object[] objArr2 = new Object[1];
            DownloadManager downloadManager16 = this.manager;
            if (downloadManager16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager16 = null;
            }
            objArr2[0] = downloadManager16.getApkSize();
            String str2 = String.format(string2, Arrays.copyOf(objArr2, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            textView2.setText(str2);
            textView2.setVisibility(0);
        }
        DownloadManager downloadManager17 = this.manager;
        if (downloadManager17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
        } else {
            downloadManager = downloadManager17;
        }
        textView3.setText(downloadManager.getApkDescription());
    }

    private final void setWindowSize() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = (int) (getResources().getDisplayMetrics().widthPixels * 0.75f);
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        DownloadManager downloadManager = null;
        DownloadManager downloadManager2 = null;
        File file = null;
        Integer numValueOf = v == null ? null : Integer.valueOf(v.getId());
        int i = R.id.ib_close;
        if (numValueOf != null && numValueOf.intValue() == i) {
            DownloadManager downloadManager3 = this.manager;
            if (downloadManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager3 = null;
            }
            if (!downloadManager3.getForcedUpgrade()) {
                finish();
            }
            DownloadManager downloadManager4 = this.manager;
            if (downloadManager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
            } else {
                downloadManager2 = downloadManager4;
            }
            OnButtonClickListener onButtonClickListener = downloadManager2.getOnButtonClickListener();
            if (onButtonClickListener == null) {
                return;
            }
            onButtonClickListener.onButtonClick(1);
            return;
        }
        int i2 = R.id.btn_update;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            Button button = this.btnUpdate;
            if (button == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnUpdate");
                button = null;
            }
            if (Intrinsics.areEqual(button.getTag(), Integer.valueOf(this.install))) {
                ApkUtil.Companion companion = ApkUtil.INSTANCE;
                UpdateDialogActivity updateDialogActivity = this;
                String authorities = Constant.INSTANCE.getAUTHORITIES();
                Intrinsics.checkNotNull(authorities);
                File file2 = this.apk;
                if (file2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("apk");
                } else {
                    file = file2;
                }
                companion.installApk(updateDialogActivity, authorities, file);
                return;
            }
            DownloadManager downloadManager5 = this.manager;
            if (downloadManager5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager5 = null;
            }
            if (downloadManager5.getForcedUpgrade()) {
                Button button2 = this.btnUpdate;
                if (button2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("btnUpdate");
                    button2 = null;
                }
                button2.setEnabled(false);
                Button button3 = this.btnUpdate;
                if (button3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("btnUpdate");
                    button3 = null;
                }
                button3.setText(getResources().getString(R.string.background_downloading));
            } else {
                finish();
            }
            DownloadManager downloadManager6 = this.manager;
            if (downloadManager6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
            } else {
                downloadManager = downloadManager6;
            }
            OnButtonClickListener onButtonClickListener2 = downloadManager.getOnButtonClickListener();
            if (onButtonClickListener2 != null) {
                onButtonClickListener2.onButtonClick(0);
            }
            startService(new Intent(this, (Class<?>) DownloadService.class));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DownloadManager downloadManager = this.manager;
        if (downloadManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager = null;
        }
        if (downloadManager.getForcedUpgrade()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }
}
