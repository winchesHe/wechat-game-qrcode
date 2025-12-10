package com.azhon.appupdate.base;

import com.azhon.appupdate.listener.OnDownloadListener;
import kotlin.Metadata;

/* compiled from: BaseHttpDownloadManager.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0004H&¨\u0006\f"}, d2 = {"Lcom/azhon/appupdate/base/BaseHttpDownloadManager;", "", "()V", "cancel", "", "download", "apkUrl", "", "apkName", "listener", "Lcom/azhon/appupdate/listener/OnDownloadListener;", "release", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class BaseHttpDownloadManager {
    public abstract void cancel();

    public abstract void download(String apkUrl, String apkName, OnDownloadListener listener);

    public abstract void release();
}
