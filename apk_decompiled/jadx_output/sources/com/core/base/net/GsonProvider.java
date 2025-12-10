package com.core.base.net;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GsonProvider.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/core/base/net/GsonProvider;", "", "()V", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "getGson", "()Lcom/google/gson/Gson;", "Companion", "base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GsonProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile GsonProvider INSTANCE;
    private final Gson gson = new GsonBuilder().create();

    @JvmStatic
    public static final GsonProvider getInstance() {
        return INSTANCE.getInstance();
    }

    public final Gson getGson() {
        return this.gson;
    }

    /* compiled from: GsonProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/core/base/net/GsonProvider$Companion;", "", "()V", "INSTANCE", "Lcom/core/base/net/GsonProvider;", "getInstance", "base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GsonProvider getInstance() {
            if (GsonProvider.INSTANCE == null) {
                synchronized (GsonProvider.class) {
                    if (GsonProvider.INSTANCE == null) {
                        Companion companion = GsonProvider.INSTANCE;
                        GsonProvider.INSTANCE = new GsonProvider();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            GsonProvider gsonProvider = GsonProvider.INSTANCE;
            Intrinsics.checkNotNull(gsonProvider);
            return gsonProvider;
        }
    }
}
