package com.hjq.toast.style;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;

/* loaded from: classes.dex */
public class WhiteToastStyle extends BlackToastStyle {
    @Override // com.hjq.toast.style.BlackToastStyle
    protected int getTextColor(Context context) {
        return -1157627904;
    }

    @Override // com.hjq.toast.style.BlackToastStyle
    protected Drawable getBackgroundDrawable(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1381654);
        gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics()));
        return gradientDrawable;
    }
}
