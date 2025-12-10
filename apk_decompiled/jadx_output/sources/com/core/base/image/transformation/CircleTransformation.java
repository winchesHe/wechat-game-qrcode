package com.core.base.image.transformation;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class CircleTransformation extends BitmapTransformation {
    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    protected Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
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
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        float fMin = Math.min(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        canvas.drawRoundRect(rectF, fMin, fMin, paint);
        return bitmapCreateBitmap;
    }
}
