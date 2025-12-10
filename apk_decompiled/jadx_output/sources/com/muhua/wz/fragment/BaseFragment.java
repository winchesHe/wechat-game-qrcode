package com.muhua.wz.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.core.base.utils.RxUtils;
import com.muhua.wz.BaseActivity;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseFragment<Binding> extends Fragment {
    protected Binding binding;
    protected Context context;
    List<Disposable> disposables = new ArrayList();
    protected boolean mIsInitData;
    private boolean mIsPrepared;
    protected View mView;

    private boolean needLazyLoad() {
        return false;
    }

    public abstract void initBinding(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public void initData() {
    }

    public void initViews() {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        initBinding(layoutInflater, viewGroup, bundle);
        this.mView = ((ViewBinding) this.binding).getRoot();
        this.context = getContext();
        return this.mView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        initViews();
        this.mIsPrepared = true;
        if (needLazyLoad()) {
            return;
        }
        this.mIsInitData = true;
        initData();
    }

    private void lazyLoad() {
        if (this.mIsInitData || isHidden() || !this.mIsPrepared || !needLazyLoad()) {
            return;
        }
        this.mIsInitData = true;
        initData();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        lazyLoad();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mIsInitData = false;
        this.binding = null;
        RxUtils.unSubscribe(this.disposables);
    }

    protected void removeParent(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public void addDisposable(Disposable disposable) {
        this.disposables.add(disposable);
    }

    public void showProgress() {
        if (getActivity() instanceof BaseActivity) {
            ((BaseActivity) getActivity()).showProgress();
        }
    }

    public void hideProgress() {
        if (getActivity() instanceof BaseActivity) {
            ((BaseActivity) getActivity()).hideProgress();
        }
    }
}
