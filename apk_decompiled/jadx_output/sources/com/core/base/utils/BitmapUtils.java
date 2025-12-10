package com.core.base.utils;

import android.graphics.Bitmap;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public class BitmapUtils {
    public static boolean saveBitmap(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i) {
        try {
            return bitmap.compress(compressFormat, i, new FileOutputStream(str));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
