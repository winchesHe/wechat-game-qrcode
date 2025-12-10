package com.core.base.image;

import android.content.Context;
import com.bumptech.glide.request.FutureTarget;

/* loaded from: classes.dex */
public interface IImageLoader {
    void clearDiskCache(Context context);

    void clearMemoryCache(Context context);

    <Target> void into(Target target, ImageLoaderOptions imageLoaderOptions);

    FutureTarget submit(ImageLoaderOptions imageLoaderOptions);

    void trimMemory(Context context, int i);
}
