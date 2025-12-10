package com.core.base.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.core.base.utils.CheckUtils;

/* loaded from: classes.dex */
public class ImageLoaderOptions {
    boolean asBitmap;
    boolean asGif;
    boolean centerCrop;
    boolean centerInside;
    boolean circleCrop;
    Context context;
    int drawableId;
    Drawable errorDrawable;
    int errorId;
    boolean fitCenter;
    int height;
    final IImageLoader imageLoader;
    boolean isSkipMemoryCache;
    Drawable placeholderDrawable;
    int placeholderId;
    RequestListener requestListener;
    int size;
    Object transformation;
    Uri uri;
    String url;
    int width;

    public ImageLoaderOptions(Context context, IImageLoader iImageLoader) {
        this.context = context;
        this.imageLoader = (IImageLoader) CheckUtils.checkNotNull(iImageLoader, "image loader can not be null.");
    }

    public ImageLoaderOptions load(String str) {
        this.url = CheckUtils.checkNullOrEmpty(str, "url can not be null or empty.");
        return this;
    }

    public ImageLoaderOptions load(Uri uri) {
        this.uri = (Uri) CheckUtils.checkNotNull(uri, "uri can not be null.");
        return this;
    }

    public ImageLoaderOptions asGif() {
        this.asGif = true;
        return this;
    }

    public ImageLoaderOptions asBitmap() {
        this.asBitmap = true;
        return this;
    }

    public ImageLoaderOptions load(int i) {
        this.drawableId = i;
        return this;
    }

    public ImageLoaderOptions placeholder(int i) {
        this.placeholderId = i;
        return this;
    }

    public ImageLoaderOptions placeholder(Drawable drawable) {
        this.placeholderDrawable = drawable;
        return this;
    }

    public ImageLoaderOptions error(int i) {
        this.errorId = i;
        return this;
    }

    public ImageLoaderOptions listener(RequestListener requestListener) {
        this.requestListener = requestListener;
        return this;
    }

    public ImageLoaderOptions error(Drawable drawable) {
        this.errorDrawable = drawable;
        return this;
    }

    public ImageLoaderOptions skipMemoryCache(boolean z) {
        this.isSkipMemoryCache = z;
        return this;
    }

    public ImageLoaderOptions override(int i) {
        this.size = i;
        return this;
    }

    public ImageLoaderOptions override(int i, int i2) {
        this.width = i;
        this.height = i2;
        return this;
    }

    public ImageLoaderOptions centerCrop() {
        this.centerCrop = true;
        return this;
    }

    public ImageLoaderOptions centerInside() {
        this.centerInside = true;
        return this;
    }

    public ImageLoaderOptions fitCenter() {
        this.fitCenter = true;
        return this;
    }

    public ImageLoaderOptions circleCrop() {
        this.circleCrop = true;
        return this;
    }

    public ImageLoaderOptions apply(Object obj) {
        this.transformation = CheckUtils.checkNotNull(obj, "transformation can not be null.");
        return this;
    }

    public <Target> void into(Target target) {
        this.imageLoader.into(target, this);
    }

    public void into(ImageView imageView) {
        this.imageLoader.into(imageView, this);
    }

    public FutureTarget<Bitmap> download() {
        return this.imageLoader.submit(this);
    }

    public Context getContext() {
        return this.context;
    }

    public String getUrl() {
        return this.url;
    }

    public Uri getUri() {
        return this.uri;
    }

    public int getPlaceholderId() {
        return this.placeholderId;
    }

    public Drawable getPlaceholderDrawable() {
        return this.placeholderDrawable;
    }

    public int getErrorId() {
        return this.errorId;
    }

    public Drawable getErrorDrawable() {
        return this.errorDrawable;
    }

    public int getSize() {
        return this.size;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean isCenterCrop() {
        return this.centerCrop;
    }

    public boolean isFitCenter() {
        return this.fitCenter;
    }

    public boolean isCenterInside() {
        return this.centerInside;
    }

    public boolean isCircleCrop() {
        return this.circleCrop;
    }

    public Object getTransformation() {
        return this.transformation;
    }

    public int getDrawableId() {
        return this.drawableId;
    }

    public boolean isSkipMemoryCache() {
        return this.isSkipMemoryCache;
    }

    public boolean isBitmap() {
        return this.asBitmap;
    }

    public boolean isGif() {
        return this.asGif;
    }

    public RequestListener getRequestListener() {
        return this.requestListener;
    }
}
