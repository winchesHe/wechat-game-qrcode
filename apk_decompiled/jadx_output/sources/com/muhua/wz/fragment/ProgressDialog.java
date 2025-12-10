package com.muhua.wz.fragment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.core.base.image.ImageLoader;
import com.info.wz.R;

/* loaded from: classes.dex */
public class ProgressDialog extends AppCompatDialog {
    private boolean isNoBg;
    private boolean mDismiss;
    private ImageView mProgressBar;
    private final Runnable mShowAction;
    private String mText;
    private TextView mTextView;

    public ProgressDialog(Context context) {
        super(context, 2131756036);
        this.mShowAction = new Runnable() { // from class: com.muhua.wz.fragment.ProgressDialog.1
            @Override // java.lang.Runnable
            public void run() {
                if (ProgressDialog.this.mDismiss) {
                    return;
                }
                Activity ownerActivity = ProgressDialog.this.getOwnerActivity();
                if (ownerActivity == null && (ProgressDialog.this.getContext() instanceof Activity)) {
                    ownerActivity = (Activity) ProgressDialog.this.getContext();
                }
                if (ownerActivity == null || !ownerActivity.isFinishing()) {
                    try {
                        ProgressDialog.this.show();
                    } catch (Throwable unused) {
                    }
                }
            }
        };
        this.isNoBg = false;
        setContentView(R.layout.dialog_progress);
        getWindow().setGravity(17);
        this.mTextView = (TextView) findViewById(R.id.text);
        setText(null);
        this.mProgressBar = (ImageView) findViewById(R.id.view_progress_bar);
        setCanceledOnTouchOutside(false);
        ImageLoader.with(context).load(R.mipmap.ic_loading).asGif().into(this.mProgressBar);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        getWindow().setDimAmount(0.0f);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void setText(String str) {
        this.mText = str;
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.mTextView.post(new Runnable() { // from class: com.muhua.wz.fragment.ProgressDialog.2
                @Override // java.lang.Runnable
                public void run() {
                    ProgressDialog progressDialog = ProgressDialog.this;
                    progressDialog.setText(progressDialog.mText);
                }
            });
        } else if (TextUtils.isEmpty(this.mText)) {
            this.mTextView.setVisibility(8);
        } else {
            this.mTextView.setVisibility(0);
            this.mTextView.setText(this.mText);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.mDismiss = false;
        } catch (Throwable unused) {
        }
    }

    public void show(long j) {
        this.mDismiss = false;
        this.mTextView.postDelayed(this.mShowAction, j);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.mDismiss = true;
        this.mTextView.removeCallbacks(this.mShowAction);
        super.dismiss();
    }

    public void setProgress(final int i) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.mTextView.post(new Runnable() { // from class: com.muhua.wz.fragment.ProgressDialog.3
                @Override // java.lang.Runnable
                public void run() {
                    ProgressDialog.this.setProgress(i);
                }
            });
        }
    }

    public void setNoBg(boolean z) {
        this.isNoBg = z;
    }

    public static class CircleProgressDrawable extends Drawable {
        private static final float MAX_LEVEL = 10000.0f;
        private float mLineWidth;
        private Paint mPaint;
        private RectF mRectF = new RectF();
        private int mForegroundColor = -1;
        private int mBackgroundColor = -1713512995;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public CircleProgressDrawable(Context context) {
            this.mLineWidth = context.getResources().getDisplayMetrics().density * 3.0f;
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.mPaint.setAntiAlias(true);
            this.mPaint.setStrokeWidth(this.mLineWidth);
            RectF rectF = this.mRectF;
            float f = this.mLineWidth;
            rectF.inset(f, f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            this.mPaint.setColor(this.mBackgroundColor);
            canvas.drawOval(this.mRectF, this.mPaint);
            this.mPaint.setColor(this.mForegroundColor);
            canvas.drawArc(this.mRectF, -90.0f, (getLevel() / 10000.0f) * 360.0f, false, this.mPaint);
        }

        @Override // android.graphics.drawable.Drawable
        protected void onBoundsChange(Rect rect) {
            this.mRectF.set(getBounds());
            RectF rectF = this.mRectF;
            float f = this.mLineWidth;
            rectF.inset(f / 2.0f, f / 2.0f);
            super.onBoundsChange(rect);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.mPaint.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.mPaint.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.Drawable
        protected boolean onLevelChange(int i) {
            invalidateSelf();
            return true;
        }

        public void setLineWidth(float f) {
            if (this.mLineWidth == f) {
                return;
            }
            this.mLineWidth = f;
            this.mRectF.set(getBounds());
            float f2 = f / 2.0f;
            this.mRectF.inset(f2, f2);
            this.mPaint.setStrokeWidth(this.mLineWidth);
            invalidateSelf();
        }

        public float getLineWidth() {
            return this.mLineWidth;
        }

        public int getForegroundColor() {
            return this.mForegroundColor;
        }

        public void setForegroundColor(int i) {
            this.mForegroundColor = i;
            invalidateSelf();
        }

        public int getBackgroundColor() {
            return this.mBackgroundColor;
        }

        public void setBackgroundColor(int i) {
            this.mBackgroundColor = i;
            invalidateSelf();
        }
    }
}
