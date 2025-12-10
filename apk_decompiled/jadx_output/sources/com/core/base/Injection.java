package com.core.base;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.core.base.net.GsonProvider;
import com.core.base.net.NetworkProvider;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Injection.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u001f\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/core/base/Injection;", "", "()V", "mApplicationContext", "Landroid/content/Context;", "init", "", "applicationContext", "provideApi", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "provideApplicationContext", "provideGson", "Lcom/google/gson/Gson;", "base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Injection {
    public static final Injection INSTANCE = new Injection();
    private static Context mApplicationContext;

    private Injection() {
    }

    public final void init(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        mApplicationContext = applicationContext;
    }

    public final Context provideApplicationContext() {
        Context context = mApplicationContext;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("application not inited.".toString());
    }

    @JvmStatic
    public static final Gson provideGson() {
        Gson gson = GsonProvider.INSTANCE.getInstance().getGson();
        Intrinsics.checkNotNullExpressionValue(gson, "GsonProvider.getInstance().gson");
        return gson;
    }

    public final <T> T provideApi(Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) NetworkProvider.getInstance().provide(clazz);
    }
}
