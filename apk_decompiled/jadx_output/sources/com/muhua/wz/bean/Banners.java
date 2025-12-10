package com.muhua.wz.bean;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/muhua/wz/bean/Banners;", "", "Lists", "Ljava/util/ArrayList;", "Lcom/muhua/wz/bean/Banner;", "Lkotlin/collections/ArrayList;", "ShowDuration", "", "(Ljava/util/ArrayList;I)V", "getLists", "()Ljava/util/ArrayList;", "getShowDuration", "()I", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Banners {
    private final ArrayList<Banner> Lists;
    private final int ShowDuration;

    public Banners(ArrayList<Banner> Lists, int i) {
        Intrinsics.checkNotNullParameter(Lists, "Lists");
        this.Lists = Lists;
        this.ShowDuration = i;
    }

    public final ArrayList<Banner> getLists() {
        return this.Lists;
    }

    public final int getShowDuration() {
        return this.ShowDuration;
    }
}
