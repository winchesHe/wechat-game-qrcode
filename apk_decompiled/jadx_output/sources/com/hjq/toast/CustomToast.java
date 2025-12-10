package com.hjq.toast;

import android.view.View;
import android.widget.TextView;
import com.hjq.toast.config.IToast;

/* loaded from: classes.dex */
public abstract class CustomToast implements IToast {
    private int mDuration;
    private int mGravity;
    private float mHorizontalMargin;
    private TextView mMessageView;
    private float mVerticalMargin;
    private View mView;
    private int mXOffset;
    private int mYOffset;
    private int mAnimations = android.R.style.Animation.Toast;
    private int mShortDuration = 2000;
    private int mLongDuration = 3500;

    @Override // com.hjq.toast.config.IToast
    public /* synthetic */ TextView findMessageView(View view) {
        return IToast.CC.$default$findMessageView(this, view);
    }

    @Override // com.hjq.toast.config.IToast
    public void setText(int i) {
        View view = this.mView;
        if (view == null) {
            return;
        }
        setText(view.getResources().getString(i));
    }

    @Override // com.hjq.toast.config.IToast
    public void setText(CharSequence charSequence) {
        TextView textView = this.mMessageView;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // com.hjq.toast.config.IToast
    public void setView(View view) {
        this.mView = view;
        if (view == null) {
            this.mMessageView = null;
        } else {
            this.mMessageView = findMessageView(view);
        }
    }

    @Override // com.hjq.toast.config.IToast
    public View getView() {
        return this.mView;
    }

    @Override // com.hjq.toast.config.IToast
    public void setDuration(int i) {
        this.mDuration = i;
    }

    @Override // com.hjq.toast.config.IToast
    public int getDuration() {
        return this.mDuration;
    }

    @Override // com.hjq.toast.config.IToast
    public void setGravity(int i, int i2, int i3) {
        this.mGravity = i;
        this.mXOffset = i2;
        this.mYOffset = i3;
    }

    @Override // com.hjq.toast.config.IToast
    public int getGravity() {
        return this.mGravity;
    }

    @Override // com.hjq.toast.config.IToast
    public int getXOffset() {
        return this.mXOffset;
    }

    @Override // com.hjq.toast.config.IToast
    public int getYOffset() {
        return this.mYOffset;
    }

    @Override // com.hjq.toast.config.IToast
    public void setMargin(float f, float f2) {
        this.mHorizontalMargin = f;
        this.mVerticalMargin = f2;
    }

    @Override // com.hjq.toast.config.IToast
    public float getHorizontalMargin() {
        return this.mHorizontalMargin;
    }

    @Override // com.hjq.toast.config.IToast
    public float getVerticalMargin() {
        return this.mVerticalMargin;
    }

    public void setAnimationsId(int i) {
        this.mAnimations = i;
    }

    public int getAnimationsId() {
        return this.mAnimations;
    }

    public void setShortDuration(int i) {
        this.mShortDuration = i;
    }

    public int getShortDuration() {
        return this.mShortDuration;
    }

    public void setLongDuration(int i) {
        this.mLongDuration = i;
    }

    public int getLongDuration() {
        return this.mLongDuration;
    }
}
