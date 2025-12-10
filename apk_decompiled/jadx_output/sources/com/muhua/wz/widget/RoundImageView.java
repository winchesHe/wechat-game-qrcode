package com.muhua.wz.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import com.muhua.wz.R;

/* loaded from: classes.dex */
public class RoundImageView extends ImageView {
    private static final Bitmap.Config BITMAP_CONFIG = Bitmap.Config.ARGB_8888;
    private static final int BORDER_RADIUS_DEFAULT = 10;
    private static final int COLOR_DRAWABLE_DIMENSION = 2;
    private static final int DEFAULT_BORDER_COLOR = 0;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final String STATE_BORDER_RADIUS = "state_border_radius";
    private static final String STATE_INSTANCE = "state_instance";
    private static final String STATE_TYPE = "state_type";
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_ROUND = 1;
    private Bitmap mBitmap;
    private Paint mBitmapPaint;
    private BitmapShader mBitmapShader;
    private int mBorderColor;
    private final Paint mBorderPaint;
    private int mBorderRadius;
    private RectF mBorderRect;
    private int mBorderWidth;
    private Matrix mMatrix;
    private boolean mReady;
    private RectF mRoundRect;
    private boolean mSetupPending;
    private int type;

    public RoundImageView(Context context) {
        super(context);
        this.mBorderPaint = new Paint();
        this.mBorderColor = 0;
        this.mBorderWidth = 0;
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBorderPaint = new Paint();
        this.mBorderColor = 0;
        this.mBorderWidth = 0;
        super.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.mMatrix = new Matrix();
        Paint paint = new Paint();
        this.mBitmapPaint = paint;
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundImageView);
        this.mBorderRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, (int) TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics()));
        this.mBorderWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.mBorderColor = typedArrayObtainStyledAttributes.getColor(0, 0);
        this.type = typedArrayObtainStyledAttributes.getInt(3, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.mReady = true;
        if (this.mSetupPending) {
            setUpShader();
            this.mSetupPending = false;
        }
    }

    private void setUpShader() {
        float width;
        float height;
        if (!this.mReady) {
            this.mSetupPending = true;
            return;
        }
        if (this.mBitmap == null) {
            return;
        }
        this.mBitmapShader = new BitmapShader(this.mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.mBitmapPaint.setAntiAlias(true);
        this.mBitmapPaint.setShader(this.mBitmapShader);
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setAntiAlias(true);
        this.mBorderPaint.setColor(this.mBorderColor);
        this.mBorderPaint.setStrokeWidth(this.mBorderWidth);
        float width2 = 0.0f;
        if (this.mBitmap.getWidth() * getHeight() > getWidth() * this.mBitmap.getHeight()) {
            width = getHeight() / this.mBitmap.getHeight();
            width2 = (getWidth() - (this.mBitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = getWidth() / this.mBitmap.getWidth();
            height = (getHeight() - (this.mBitmap.getHeight() * width)) * 0.5f;
        }
        this.mMatrix.reset();
        this.mMatrix.setScale(width, width);
        this.mMatrix.postTranslate(Math.round(width2), Math.round(height));
        this.mBitmapShader.setLocalMatrix(this.mMatrix);
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        if (this.type == 1) {
            RectF rectF = this.mRoundRect;
            int i = this.mBorderRadius;
            canvas.drawRoundRect(rectF, i, i, this.mBitmapPaint);
            RectF rectF2 = this.mBorderRect;
            int i2 = this.mBorderRadius;
            canvas.drawRoundRect(rectF2, i2, i2, this.mBorderPaint);
            return;
        }
        float width = getWidth() >> 1;
        canvas.drawCircle(width, width, width, this.mBitmapPaint);
        canvas.drawCircle(width, width, (getWidth() - this.mBorderWidth) >> 1, this.mBorderPaint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.type == 1) {
            this.mRoundRect = new RectF(0.0f, 0.0f, i, i2);
            float f = this.mBorderWidth >> 1;
            this.mBorderRect = new RectF(f, f, getWidth() - f, getHeight() - f);
        }
        setUpShader();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(STATE_INSTANCE, super.onSaveInstanceState());
        bundle.putInt(STATE_TYPE, this.type);
        bundle.putInt(STATE_BORDER_RADIUS, this.mBorderRadius);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable(STATE_INSTANCE));
            this.type = bundle.getInt(STATE_TYPE);
            this.mBorderRadius = bundle.getInt(STATE_BORDER_RADIUS);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setBorderRadius(int i) {
        int iDp2px = dp2px(i);
        if (this.mBorderRadius != iDp2px) {
            this.mBorderRadius = iDp2px;
            invalidate();
        }
    }

    public void setType(int i) {
        if (this.type != i) {
            this.type = i;
            if (i != 1 && i != 0) {
                this.type = 0;
            }
            requestLayout();
        }
    }

    public int dp2px(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.mBitmap = bitmap;
        setUpShader();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.mBitmap = getBitmapFromDrawable(drawable);
        setUpShader();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.mBitmap = getBitmapFromDrawable(getDrawable());
        setUpShader();
    }

    private Bitmap getBitmapFromDrawable(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                bitmapCreateBitmap = Bitmap.createBitmap(2, 2, BITMAP_CONFIG);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), BITMAP_CONFIG);
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
