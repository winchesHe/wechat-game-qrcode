package com.muhua.wz.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdBean.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/muhua/wz/bean/FirstAdBean;", "", "ImageUrl", "", "LinkUrl", "Status", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getImageUrl", "()Ljava/lang/String;", "getLinkUrl", "getStatus", "()Z", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirstAdBean {
    private final String ImageUrl;
    private final String LinkUrl;
    private final boolean Status;

    public FirstAdBean(String ImageUrl, String LinkUrl, boolean z) {
        Intrinsics.checkNotNullParameter(ImageUrl, "ImageUrl");
        Intrinsics.checkNotNullParameter(LinkUrl, "LinkUrl");
        this.ImageUrl = ImageUrl;
        this.LinkUrl = LinkUrl;
        this.Status = z;
    }

    public final String getImageUrl() {
        return this.ImageUrl;
    }

    public final String getLinkUrl() {
        return this.LinkUrl;
    }

    public final boolean getStatus() {
        return this.Status;
    }
}
