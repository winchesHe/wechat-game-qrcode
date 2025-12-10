package com.core.base.image;

import android.content.Context;
import com.core.base.utils.CheckUtils;

/* loaded from: classes.dex */
public class ImageLoader {
    private IImageLoader mImageLoader;

    private ImageLoader() {
    }

    private static class SingletonHolder {
        private static final ImageLoader INSTANCE = new ImageLoader();

        private SingletonHolder() {
        }
    }

    public static ImageLoader getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void init(IImageLoader iImageLoader) {
        getInstance().mImageLoader = (IImageLoader) CheckUtils.checkNotNull(iImageLoader, "image loader can not be null.");
    }

    public static void init(String str) {
        try {
            getInstance().mImageLoader = (IImageLoader) Class.forName(CheckUtils.checkNullOrEmpty(str, "loaderClazz can not be null.")).newInstance();
        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (InstantiationException e4) {
            e4.printStackTrace();
        }
        CheckUtils.checkNotNull(getInstance().mImageLoader, "initialize failed.");
    }

    public static ImageLoaderOptions with(Context context) {
        return new ImageLoaderOptions(context, (IImageLoader) CheckUtils.checkNotNull(getInstance().mImageLoader, "image loader is null, call init() method first."));
    }
}
