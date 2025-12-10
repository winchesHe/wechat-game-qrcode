package com.hjq.toast.config;

import android.R;
import android.view.View;
import android.widget.TextView;
import com.android.tools.r8.annotations.SynthesizedClassV2;

/* loaded from: classes.dex */
public interface IToast {
    void cancel();

    TextView findMessageView(View view);

    int getDuration();

    int getGravity();

    float getHorizontalMargin();

    float getVerticalMargin();

    View getView();

    int getXOffset();

    int getYOffset();

    void setDuration(int i);

    void setGravity(int i, int i2, int i3);

    void setMargin(float f, float f2);

    void setText(int i);

    void setText(CharSequence charSequence);

    void setView(View view);

    void show();

    @SynthesizedClassV2(kind = 8, versionHash = "7a5b85d3ee2e0991ca3502602e9389a98f55c0576b887125894a7ec03823f8d3")
    /* renamed from: com.hjq.toast.config.IToast$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static TextView $default$findMessageView(IToast _this, View view) {
            if (view instanceof TextView) {
                if (view.getId() == -1) {
                    view.setId(R.id.message);
                } else if (view.getId() != 16908299) {
                    throw new IllegalArgumentException("You must set the ID value of TextView to android.R.id.message");
                }
                return (TextView) view;
            }
            View viewFindViewById = view.findViewById(R.id.message);
            if (viewFindViewById instanceof TextView) {
                return (TextView) viewFindViewById;
            }
            throw new IllegalArgumentException("You must include a TextView with an ID value of android.R.id.message");
        }
    }
}
