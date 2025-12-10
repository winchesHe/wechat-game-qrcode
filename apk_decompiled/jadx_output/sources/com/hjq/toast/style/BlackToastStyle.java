package com.hjq.toast.style;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;
import com.hjq.toast.config.IToastStyle;
import com.youth.banner.config.BannerConfig;

/* loaded from: classes.dex */
public class BlackToastStyle implements IToastStyle<TextView> {
    @Override // com.hjq.toast.config.IToastStyle
    public /* synthetic */ int getGravity() {
        return IToastStyle.CC.$default$getGravity(this);
    }

    @Override // com.hjq.toast.config.IToastStyle
    public /* synthetic */ float getHorizontalMargin() {
        return IToastStyle.CC.$default$getHorizontalMargin(this);
    }

    protected int getMaxLines(Context context) {
        return 5;
    }

    protected int getTextColor(Context context) {
        return -285212673;
    }

    protected int getTextGravity(Context context) {
        return 17;
    }

    @Override // com.hjq.toast.config.IToastStyle
    public /* synthetic */ float getVerticalMargin() {
        return IToastStyle.CC.$default$getVerticalMargin(this);
    }

    @Override // com.hjq.toast.config.IToastStyle
    public /* synthetic */ int getXOffset() {
        return IToastStyle.CC.$default$getXOffset(this);
    }

    @Override // com.hjq.toast.config.IToastStyle
    public /* synthetic */ int getYOffset() {
        return IToastStyle.CC.$default$getYOffset(this);
    }

    @Override // com.hjq.toast.config.IToastStyle
    public TextView createView(Context context) {
        TextView textView = new TextView(context);
        textView.setId(R.id.message);
        textView.setGravity(getTextGravity(context));
        textView.setTextColor(getTextColor(context));
        textView.setTextSize(0, getTextSize(context));
        int horizontalPadding = getHorizontalPadding(context);
        int verticalPadding = getVerticalPadding(context);
        textView.setPaddingRelative(horizontalPadding, verticalPadding, horizontalPadding, verticalPadding);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView.setBackground(getBackgroundDrawable(context));
        textView.setZ(getTranslationZ(context));
        textView.setMaxLines(getMaxLines(context));
        return textView;
    }

    protected float getTextSize(Context context) {
        return TypedValue.applyDimension(2, 14.0f, context.getResources().getDisplayMetrics());
    }

    protected int getHorizontalPadding(Context context) {
        return (int) TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
    }

    protected int getVerticalPadding(Context context) {
        return (int) TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics());
    }

    protected Drawable getBackgroundDrawable(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(BannerConfig.INDICATOR_SELECTED_COLOR);
        gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics()));
        return gradientDrawable;
    }

    protected float getTranslationZ(Context context) {
        return TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics());
    }
}
