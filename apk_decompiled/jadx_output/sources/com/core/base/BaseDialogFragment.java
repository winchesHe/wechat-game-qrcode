package com.core.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBinding;
import com.core.base.utils.RxUtils;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseDialogFragment<T extends ViewBinding> extends DialogFragment {
    public T binding;
    List<Disposable> disposables = new ArrayList();

    protected abstract T initBinding(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z);

    protected abstract void initData();

    protected abstract void initView();

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.BaseDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        T t = (T) initBinding(layoutInflater, viewGroup, false);
        this.binding = t;
        return t.getRoot();
    }

    public void show(FragmentActivity fragmentActivity) {
        try {
            super.show(fragmentActivity.getSupportFragmentManager(), getClass().getSimpleName());
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public void addDisposable(Disposable disposable) {
        this.disposables.add(disposable);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView();
        initData();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        RxUtils.unSubscribe(this.disposables);
    }
}
