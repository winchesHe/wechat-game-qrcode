package com.core.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.core.base.R;

/* loaded from: classes.dex */
public final class BaseLayoutRefreshFooterBinding implements ViewBinding {
    public final LinearLayout llEnd;
    public final ProgressBar pbLoading;
    private final LinearLayout rootView;
    public final TextView tvLoading;

    private BaseLayoutRefreshFooterBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ProgressBar progressBar, TextView textView) {
        this.rootView = linearLayout;
        this.llEnd = linearLayout2;
        this.pbLoading = progressBar;
        this.tvLoading = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static BaseLayoutRefreshFooterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BaseLayoutRefreshFooterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.base_layout_refresh_footer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static BaseLayoutRefreshFooterBinding bind(View view) {
        int i = R.id.ll_end;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.pb_loading;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null) {
                i = R.id.tv_loading;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new BaseLayoutRefreshFooterBinding((LinearLayout) view, linearLayout, progressBar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
