package com.muhua.wz.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdBean.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/muhua/wz/bean/Banner;", "", "ImageUrl", "", "LinkUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getLinkUrl", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Banner {
    private final String ImageUrl;
    private final String LinkUrl;

    public Banner(String ImageUrl, String LinkUrl) {
        Intrinsics.checkNotNullParameter(ImageUrl, "ImageUrl");
        Intrinsics.checkNotNullParameter(LinkUrl, "LinkUrl");
        this.ImageUrl = ImageUrl;
        this.LinkUrl = LinkUrl;
    }

    public final String getImageUrl() {
        return this.ImageUrl;
    }

    public final String getLinkUrl() {
        return this.LinkUrl;
    }
}
