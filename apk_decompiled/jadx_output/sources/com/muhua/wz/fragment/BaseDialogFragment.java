package com.muhua.wz.fragment;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class BaseDialogFragment extends DialogFragment {
    private AtomicBoolean isShow = new AtomicBoolean(false);
    private DialogInterface.OnDismissListener mOnDismissListener;

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        if (isAdded() || !this.isShow.compareAndSet(false, true)) {
            return;
        }
        super.show(fragmentManager, str);
    }

    public void showAllowingStateLoss(FragmentManager fragmentManager, String str) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (isAdded() || !this.isShow.compareAndSet(false, true)) {
            return;
        }
        try {
            Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
            declaredField.setAccessible(true);
            declaredField.set(this, false);
            Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
            declaredField2.setAccessible(true);
            declaredField2.set(this, true);
        } catch (Exception unused) {
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.add(this, str);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // android.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (getFragmentManager() == null) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.isShow.set(false);
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public BaseDialogFragment setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
        return this;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mOnDismissListener = null;
    }
}
