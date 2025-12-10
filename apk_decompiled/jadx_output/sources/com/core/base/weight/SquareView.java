package com.core.base.weight;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class SquareView extends View {
    public SquareView(Context context) {
        this(context, null);
    }

    public SquareView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SquareView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }
}
