package com.core.base.image.transformation;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import com.core.base.utils.SystemUtils;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class CropCornerTransformation extends BitmapTransformation {
    private boolean isCircle;
    private boolean isCrop;
    private float mRadius;

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }

    public CropCornerTransformation() {
        this(3);
    }

    public CropCornerTransformation(boolean z) {
        this.mRadius = 0.0f;
        this.isCrop = false;
        this.isCircle = z;
    }

    public CropCornerTransformation(int i) {
        this.mRadius = 0.0f;
        this.isCircle = false;
        this.isCrop = false;
        this.mRadius = SystemUtils.INSTANCE.dp2px(i);
    }

    public CropCornerTransformation(int i, boolean z) {
        this.mRadius = 0.0f;
        this.isCircle = false;
        this.isCrop = false;
        this.mRadius = SystemUtils.INSTANCE.dp2px(i);
        this.isCrop = z;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    protected Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        if (this.isCircle || this.isCrop) {
            return roundCrop(bitmapPool, TransformationUtils.centerCrop(bitmapPool, bitmap, i, i2));
        }
        return roundCrop(bitmapPool, bitmap);
    }

    private Bitmap roundCrop(BitmapPool bitmapPool, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        if (this.isCircle) {
            this.mRadius = Math.min(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        float f = this.mRadius;
        canvas.drawRoundRect(rectF, f, f, paint);
        return bitmapCreateBitmap;
    }
}
