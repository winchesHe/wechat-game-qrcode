package com.hjq.toast.config;

import android.content.Context;
import android.view.View;
import com.android.tools.r8.annotations.SynthesizedClassV2;

/* loaded from: classes.dex */
public interface IToastStyle<V extends View> {

    @SynthesizedClassV2(kind = 8, versionHash = "7a5b85d3ee2e0991ca3502602e9389a98f55c0576b887125894a7ec03823f8d3")
    /* renamed from: com.hjq.toast.config.IToastStyle$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<V extends View> {
        public static int $default$getGravity(IToastStyle _this) {
            return 17;
        }

        public static float $default$getHorizontalMargin(IToastStyle _this) {
            return 0.0f;
        }

        public static float $default$getVerticalMargin(IToastStyle _this) {
            return 0.0f;
        }

        public static int $default$getXOffset(IToastStyle _this) {
            return 0;
        }

        public static int $default$getYOffset(IToastStyle _this) {
            return 0;
        }
    }

    V createView(Context context);

    int getGravity();

    float getHorizontalMargin();

    float getVerticalMargin();

    int getXOffset();

    int getYOffset();
}
