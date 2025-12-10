package com.core.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.signature.ObjectKey;
import com.core.base.image.IImageLoader;
import com.core.base.image.ImageLoaderOptions;
import com.core.base.utils.CheckUtils;

/* loaded from: classes.dex */
public class CompatGlideImageLoader implements IImageLoader {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.core.base.image.IImageLoader
    public <T> void into(T t, ImageLoaderOptions imageLoaderOptions) {
        RequestBuilder requestBuilderAsDrawable;
        CheckUtils.checkNotNull(t, "target can not be null.");
        CheckUtils.checkNotNull(imageLoaderOptions, "options can not be null.");
        RequestManager requestManagerWith = Glide.with((Context) CheckUtils.checkNotNull(imageLoaderOptions.getContext(), "Context can not be null in GlideImageLoader."));
        if (imageLoaderOptions.isBitmap()) {
            requestBuilderAsDrawable = requestManagerWith.asBitmap();
        } else if (imageLoaderOptions.isGif()) {
            requestBuilderAsDrawable = requestManagerWith.asGif();
        } else {
            requestBuilderAsDrawable = requestManagerWith.asDrawable();
        }
        if (!TextUtils.isEmpty(imageLoaderOptions.getUrl()) || imageLoaderOptions.getUri() != null) {
            requestBuilderAsDrawable = requestBuilderAsDrawable.load(imageLoaderOptions.getUrl());
        } else if (imageLoaderOptions.getDrawableId() > 0) {
            requestBuilderAsDrawable = requestBuilderAsDrawable.load(Integer.valueOf(imageLoaderOptions.getDrawableId()));
        }
        if (imageLoaderOptions.getRequestListener() != null) {
            requestBuilderAsDrawable = requestBuilderAsDrawable.listener(imageLoaderOptions.getRequestListener());
        }
        if (imageLoaderOptions.getPlaceholderId() > 0) {
            requestBuilderAsDrawable.apply((BaseRequestOptions<?>) RequestOptions.placeholderOf(imageLoaderOptions.getPlaceholderId()));
        } else if (imageLoaderOptions.getPlaceholderDrawable() != null) {
            requestBuilderAsDrawable = requestBuilderAsDrawable.apply((BaseRequestOptions<?>) RequestOptions.placeholderOf(imageLoaderOptions.getPlaceholderDrawable()));
        }
        if (imageLoaderOptions.getErrorId() > 0) {
            requestBuilderAsDrawable = requestBuilderAsDrawable.apply((BaseRequestOptions<?>) RequestOptions.errorOf(imageLoaderOptions.getErrorId()));
        } else if (imageLoaderOptions.getErrorDrawable() != null) {
            requestBuilderAsDrawable = requestBuilderAsDrawable.apply((BaseRequestOptions<?>) RequestOptions.errorOf(imageLoaderOptions.getErrorDrawable()));
        }
        if (imageLoaderOptions.isCenterCrop()) {
            requestBuilderAsDrawable = requestBuilderAsDrawable.apply((BaseRequestOptions<?>) RequestOptions.centerCropTransform());
        } else if (imageLoaderOptions.isFitCenter()) {
            requestBuilderAsDrawable = requestBuilderAsDrawable.apply((BaseRequestOptions<?>) RequestOptions.fitCenterTransform());
        } else if (imageLoaderOptions.isCenterInside()) {
            requestBuilderAsDrawable = requestBuilderAsDrawable.apply((BaseRequestOptions<?>) RequestOptions.centerInsideTransform());
        } else if (imageLoaderOptions.isCircleCrop()) {
            requestBuilderAsDrawable = requestBuilderAsDrawable.apply((BaseRequestOptions<?>) RequestOptions.circleCropTransform());
        }
        if (imageLoaderOptions.getSize() > 0) {
            requestBuilderAsDrawable = requestBuilderAsDrawable.apply((BaseRequestOptions<?>) RequestOptions.overrideOf(imageLoaderOptions.getSize()));
        }
        RequestBuilder requestBuilderSkipMemoryCache = requestBuilderAsDrawable.apply((BaseRequestOptions<?>) RequestOptions.overrideOf(imageLoaderOptions.getWidth(), imageLoaderOptions.getHeight())).skipMemoryCache(imageLoaderOptions.isSkipMemoryCache());
        if (imageLoaderOptions.isSkipMemoryCache()) {
            requestBuilderSkipMemoryCache = (RequestBuilder) requestBuilderSkipMemoryCache.signature(new ObjectKey(Long.valueOf(System.currentTimeMillis())));
        }
        if (imageLoaderOptions.getTransformation() instanceof Transformation) {
            try {
                requestBuilderSkipMemoryCache = requestBuilderSkipMemoryCache.apply((BaseRequestOptions<?>) RequestOptions.bitmapTransform((Transformation) imageLoaderOptions.getTransformation()));
            } catch (Exception unused) {
            }
        }
        if (t instanceof ImageView) {
            requestBuilderSkipMemoryCache.into((ImageView) t);
        } else if (t instanceof Target) {
            requestBuilderSkipMemoryCache.into((RequestBuilder) t);
        }
    }

    @Override // com.core.base.image.IImageLoader
    public void trimMemory(final Context context, final int i) {
        AppExecutors.getInstance().mainThreadExecutor().execute(new Runnable() { // from class: com.core.base.CompatGlideImageLoader$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Glide.get(((Context) CheckUtils.checkNotNull(context, "Context can not be null in CompatGlideImageLoader")).getApplicationContext()).trimMemory(i);
            }
        });
    }

    @Override // com.core.base.image.IImageLoader
    public void clearDiskCache(final Context context) {
        AppExecutors.getInstance().diskIOExecutor().execute(new Runnable() { // from class: com.core.base.CompatGlideImageLoader$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Glide.get(((Context) CheckUtils.checkNotNull(context, "Context can not be null in CompatGlideImageLoader")).getApplicationContext()).clearDiskCache();
            }
        });
    }

    @Override // com.core.base.image.IImageLoader
    public void clearMemoryCache(final Context context) {
        AppExecutors.getInstance().diskIOExecutor().execute(new Runnable() { // from class: com.core.base.CompatGlideImageLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Glide.get(((Context) CheckUtils.checkNotNull(context, "Context can not be null in CompatGlideImageLoader")).getApplicationContext()).clearMemory();
            }
        });
    }

    @Override // com.core.base.image.IImageLoader
    public FutureTarget submit(ImageLoaderOptions imageLoaderOptions) {
        CheckUtils.checkNotNull(imageLoaderOptions, "options can not be null.");
        RequestBuilder<Bitmap> requestBuilderAsBitmap = Glide.with((Context) CheckUtils.checkNotNull(imageLoaderOptions.getContext(), "Context can not be null in GlideImageLoader.")).asBitmap();
        if (!TextUtils.isEmpty(imageLoaderOptions.getUrl()) || imageLoaderOptions.getUri() != null) {
            RequestBuilder<Bitmap> requestBuilderLoad = requestBuilderAsBitmap.load(imageLoaderOptions.getUrl());
            if (imageLoaderOptions.getDrawableId() > 0) {
                requestBuilderLoad = requestBuilderLoad.load(Integer.valueOf(imageLoaderOptions.getDrawableId()));
            }
            if (imageLoaderOptions.getRequestListener() != null) {
                requestBuilderLoad = requestBuilderLoad.listener(imageLoaderOptions.getRequestListener());
            }
            if (imageLoaderOptions.getPlaceholderId() > 0) {
                requestBuilderLoad.apply((BaseRequestOptions<?>) RequestOptions.placeholderOf(imageLoaderOptions.getPlaceholderId()));
            } else if (imageLoaderOptions.getPlaceholderDrawable() != null) {
                requestBuilderLoad = requestBuilderLoad.apply((BaseRequestOptions<?>) RequestOptions.placeholderOf(imageLoaderOptions.getPlaceholderDrawable()));
            }
            if (imageLoaderOptions.getErrorId() > 0) {
                requestBuilderLoad = requestBuilderLoad.apply((BaseRequestOptions<?>) RequestOptions.errorOf(imageLoaderOptions.getErrorId()));
            } else if (imageLoaderOptions.getErrorDrawable() != null) {
                requestBuilderLoad = requestBuilderLoad.apply((BaseRequestOptions<?>) RequestOptions.errorOf(imageLoaderOptions.getErrorDrawable()));
            }
            if (imageLoaderOptions.isCenterCrop()) {
                requestBuilderLoad = requestBuilderLoad.apply((BaseRequestOptions<?>) RequestOptions.centerCropTransform());
            } else if (imageLoaderOptions.isFitCenter()) {
                requestBuilderLoad = requestBuilderLoad.apply((BaseRequestOptions<?>) RequestOptions.fitCenterTransform());
            } else if (imageLoaderOptions.isCenterInside()) {
                requestBuilderLoad = requestBuilderLoad.apply((BaseRequestOptions<?>) RequestOptions.centerInsideTransform());
            } else if (imageLoaderOptions.isCircleCrop()) {
                requestBuilderLoad = requestBuilderLoad.apply((BaseRequestOptions<?>) RequestOptions.circleCropTransform());
            }
            if (imageLoaderOptions.getSize() > 0) {
                requestBuilderLoad = requestBuilderLoad.apply((BaseRequestOptions<?>) RequestOptions.overrideOf(imageLoaderOptions.getSize()));
            }
            if (imageLoaderOptions.getWidth() > 0 && imageLoaderOptions.getHeight() > 0) {
                requestBuilderLoad = requestBuilderLoad.apply((BaseRequestOptions<?>) RequestOptions.overrideOf(imageLoaderOptions.getWidth(), imageLoaderOptions.getHeight()));
            }
            if (imageLoaderOptions.getTransformation() instanceof Transformation) {
                requestBuilderLoad = requestBuilderLoad.apply((BaseRequestOptions<?>) RequestOptions.bitmapTransform((Transformation) imageLoaderOptions.getTransformation()));
            }
            return requestBuilderLoad.submit();
        }
        throw new NullPointerException("url and uri are null.");
    }
}
