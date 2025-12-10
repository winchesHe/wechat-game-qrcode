package com.muhua.wz.fragment;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.core.base.image.ImageLoader;
import com.core.base.image.transformation.CropCornerTransformation;
import com.core.base.utils.SystemUtils;
import com.info.wz.R;
import com.muhua.wz.WebViewActivity;
import com.muhua.wz.bean.FirstAdBean;
import com.muhua.wz.databinding.DialogFirstPageBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FirstPageDialog.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J$\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/muhua/wz/fragment/FirstPageDialog;", "Lcom/muhua/wz/fragment/BaseDialogTFragment;", "Lcom/muhua/wz/databinding/DialogFirstPageBinding;", "data", "Lcom/muhua/wz/bean/FirstAdBean;", "(Lcom/muhua/wz/bean/FirstAdBean;)V", "getData", "()Lcom/muhua/wz/bean/FirstAdBean;", "initBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "b", "", "initData", "", "initView", "onStart", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirstPageDialog extends BaseDialogTFragment<DialogFirstPageBinding> {
    private final FirstAdBean data;

    @Override // com.muhua.wz.fragment.BaseDialogTFragment
    protected void initData() {
    }

    public FirstPageDialog(FirstAdBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public final FirstAdBean getData() {
        return this.data;
    }

    @Override // com.muhua.wz.fragment.BaseDialogTFragment
    protected void initView() {
        ((DialogFirstPageBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.fragment.FirstPageDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FirstPageDialog.m3144initView$lambda0(this.f$0, view);
            }
        });
        setCancelable(false);
        ImageLoader.with(getContext()).load(this.data.getImageUrl()).apply(new CropCornerTransformation(15, true)).into(((DialogFirstPageBinding) this.binding).iv);
        ((DialogFirstPageBinding) this.binding).iv.setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.fragment.FirstPageDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FirstPageDialog.m3145initView$lambda1(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-0, reason: not valid java name */
    public static final void m3144initView$lambda0(FirstPageDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m3145initView$lambda1(FirstPageDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewActivity.Companion companion = WebViewActivity.INSTANCE;
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        companion.open(contextRequireContext, this$0.data.getLinkUrl());
        this$0.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            Intrinsics.checkNotNull(dialog);
            Window window = dialog.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                window.getDecorView().setPadding(0, 0, 0, 0);
                attributes.gravity = 17;
                SystemUtils systemUtils = SystemUtils.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
                int widthPixels = systemUtils.getWidthPixels(contextRequireContext);
                SystemUtils systemUtils2 = SystemUtils.INSTANCE;
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext()");
                attributes.width = widthPixels - systemUtils2.getDimen(contextRequireContext2, R.dimen.sw_px_60);
                int i = attributes.width;
                SystemUtils systemUtils3 = SystemUtils.INSTANCE;
                Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext()");
                attributes.height = i + systemUtils3.getDimen(contextRequireContext3, R.dimen.sw_px_45);
                window.setAttributes(attributes);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.muhua.wz.fragment.BaseDialogTFragment
    public DialogFirstPageBinding initBinding(LayoutInflater inflater, ViewGroup container, boolean b) {
        Intrinsics.checkNotNull(inflater);
        DialogFirstPageBinding dialogFirstPageBindingInflate = DialogFirstPageBinding.inflate(inflater, container, b);
        Intrinsics.checkNotNullExpressionValue(dialogFirstPageBindingInflate, "inflate(inflater!!, container, b)");
        return dialogFirstPageBindingInflate;
    }
}
