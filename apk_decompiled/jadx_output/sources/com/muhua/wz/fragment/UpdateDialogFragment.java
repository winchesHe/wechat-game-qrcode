package com.muhua.wz.fragment;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.azhon.appupdate.listener.OnDownloadListener;
import com.azhon.appupdate.manager.DownloadManager;
import com.baidu.mobstat.Config;
import com.info.wz.R;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateDialogFragment.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/muhua/wz/fragment/UpdateDialogFragment;", "Landroidx/fragment/app/DialogFragment;", Config.FEED_LIST_ITEM_PATH, "", "(Ljava/lang/String;)V", "confirm", "Landroid/widget/TextView;", "getConfirm", "()Landroid/widget/TextView;", "setConfirm", "(Landroid/widget/TextView;)V", "contextView", "Landroid/view/View;", "getContextView", "()Landroid/view/View;", "setContextView", "(Landroid/view/View;)V", "dialog", "Landroid/app/Dialog;", "dialogStyle", "", "isCancelAble", "", "getPath", "()Ljava/lang/String;", "onCreateDialog", "savedInstanceState", "Landroid/os/Bundle;", "update", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UpdateDialogFragment extends DialogFragment {
    private TextView confirm;
    private View contextView;
    private Dialog dialog;
    private final int dialogStyle;
    private boolean isCancelAble;
    private final String path;

    public UpdateDialogFragment(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        this.isCancelAble = true;
        this.dialogStyle = R.style.dialog_transparent;
    }

    public final String getPath() {
        return this.path;
    }

    public final View getContextView() {
        return this.contextView;
    }

    public final void setContextView(View view) {
        this.contextView = view;
    }

    public final TextView getConfirm() {
        return this.confirm;
    }

    public final void setConfirm(TextView textView) {
        this.confirm = textView;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (this.dialog == null) {
            this.contextView = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_update_version, (ViewGroup) null);
            setCancelable(this.isCancelAble);
            Dialog dialog = new Dialog(requireActivity(), this.dialogStyle);
            this.dialog = dialog;
            Intrinsics.checkNotNull(dialog);
            View view = this.contextView;
            Intrinsics.checkNotNull(view);
            dialog.setContentView(view);
            View view2 = this.contextView;
            Intrinsics.checkNotNull(view2);
            this.confirm = (TextView) view2.findViewById(R.id.confirm);
            Dialog dialog2 = this.dialog;
            Intrinsics.checkNotNull(dialog2);
            dialog2.setCanceledOnTouchOutside(false);
            Dialog dialog3 = this.dialog;
            Intrinsics.checkNotNull(dialog3);
            Window window = dialog3.getWindow();
            Intrinsics.checkNotNull(window);
            window.setGravity(17);
        }
        TextView textView = this.confirm;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.fragment.UpdateDialogFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) throws Resources.NotFoundException {
                    UpdateDialogFragment.m3155onCreateDialog$lambda0(this.f$0, view3);
                }
            });
        }
        Dialog dialog4 = this.dialog;
        Intrinsics.checkNotNull(dialog4);
        return dialog4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreateDialog$lambda-0, reason: not valid java name */
    public static final void m3155onCreateDialog$lambda0(UpdateDialogFragment this$0, View view) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.update();
    }

    public final void update() throws Resources.NotFoundException {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        new DownloadManager.Builder(fragmentActivityRequireActivity).apkUrl(this.path).jumpInstallPage(true).apkName("updatte.apk").onDownloadListener(new OnDownloadListener() { // from class: com.muhua.wz.fragment.UpdateDialogFragment$update$manager$1
            @Override // com.azhon.appupdate.listener.OnDownloadListener
            public void cancel() {
            }

            @Override // com.azhon.appupdate.listener.OnDownloadListener
            public void done(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
            }

            @Override // com.azhon.appupdate.listener.OnDownloadListener
            public void error(Exception e) {
                Intrinsics.checkNotNullParameter(e, "e");
            }

            @Override // com.azhon.appupdate.listener.OnDownloadListener
            public void start() {
            }

            @Override // com.azhon.appupdate.listener.OnDownloadListener
            public void downloading(int i, int i1) {
                int i2 = (int) ((i1 / i) * 100);
                TextView confirm = this.this$0.getConfirm();
                if (confirm == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append('%');
                confirm.setText(sb.toString());
            }
        }).jumpInstallPage(true).smallIcon(R.mipmap.ic_launcher).build().download();
    }
}
