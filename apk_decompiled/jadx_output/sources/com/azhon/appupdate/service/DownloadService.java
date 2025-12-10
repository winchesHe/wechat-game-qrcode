package com.azhon.appupdate.service;

import android.app.Service;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.IBinder;
import android.widget.Toast;
import com.azhon.appupdate.R;
import com.azhon.appupdate.base.BaseHttpDownloadManager;
import com.azhon.appupdate.config.Constant;
import com.azhon.appupdate.listener.OnDownloadListener;
import com.azhon.appupdate.manager.DownloadManager;
import com.azhon.appupdate.manager.HttpDownloadManager;
import com.azhon.appupdate.util.ApkUtil;
import com.azhon.appupdate.util.FileUtil;
import com.azhon.appupdate.util.LogUtil;
import com.azhon.appupdate.util.NotificationUtil;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DownloadService.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0014\u0010\u0013\u001a\u00020\t2\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0002J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\"\u0010\u001c\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\tH\u0002J\b\u0010 \u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/azhon/appupdate/service/DownloadService;", "Landroid/app/Service;", "Lcom/azhon/appupdate/listener/OnDownloadListener;", "()V", "lastProgress", "", "manager", "Lcom/azhon/appupdate/manager/DownloadManager;", "cancel", "", "checkApkMd5", "", "done", "apk", "Ljava/io/File;", "download", "downloading", "max", "progress", "error", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "init", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onStartCommand", "flags", "startId", "releaseResources", "start", "Companion", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DownloadService extends Service implements OnDownloadListener {
    private static final String TAG = "DownloadService";
    private int lastProgress;
    private DownloadManager manager;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) throws Resources.NotFoundException {
        if (intent == null) {
            return 1;
        }
        init();
        return super.onStartCommand(intent, flags, startId);
    }

    private final void init() throws Resources.NotFoundException {
        DownloadManager downloadManager = null;
        this.manager = DownloadManager.Companion.getInstance$default(DownloadManager.INSTANCE, null, 1, null);
        FileUtil.Companion companion = FileUtil.INSTANCE;
        DownloadManager downloadManager2 = this.manager;
        if (downloadManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager2 = null;
        }
        companion.createDirDirectory(downloadManager2.getDownloadPath());
        LogUtil.INSTANCE.d(TAG, NotificationUtil.INSTANCE.notificationEnable(this) ? "Notification switch status: opened" : " Notification switch status: closed");
        if (checkApkMd5()) {
            LogUtil.INSTANCE.d(TAG, "Apk already exist and install it directly.");
            DownloadManager downloadManager3 = this.manager;
            if (downloadManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager3 = null;
            }
            String downloadPath = downloadManager3.getDownloadPath();
            DownloadManager downloadManager4 = this.manager;
            if (downloadManager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
            } else {
                downloadManager = downloadManager4;
            }
            done(new File(downloadPath, downloadManager.getApkName()));
            return;
        }
        LogUtil.INSTANCE.d(TAG, "Apk don't exist will start download.");
        download();
    }

    private final boolean checkApkMd5() throws NoSuchAlgorithmException, IOException {
        DownloadManager downloadManager = this.manager;
        DownloadManager downloadManager2 = null;
        if (downloadManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager = null;
        }
        String downloadPath = downloadManager.getDownloadPath();
        DownloadManager downloadManager3 = this.manager;
        if (downloadManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager3 = null;
        }
        File file = new File(downloadPath, downloadManager3.getApkName());
        if (!file.exists()) {
            return false;
        }
        String strMd5 = FileUtil.INSTANCE.md5(file);
        DownloadManager downloadManager4 = this.manager;
        if (downloadManager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
        } else {
            downloadManager2 = downloadManager4;
        }
        return StringsKt.equals(strMd5, downloadManager2.getApkMD5(), true);
    }

    private final synchronized void download() {
        DownloadManager downloadManager = this.manager;
        DownloadManager downloadManager2 = null;
        if (downloadManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager = null;
        }
        if (downloadManager.getDownloadState()) {
            LogUtil.INSTANCE.e(TAG, "Currently downloading, please download again!");
            return;
        }
        DownloadManager downloadManager3 = this.manager;
        if (downloadManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager3 = null;
        }
        if (downloadManager3.getHttpManager() == null) {
            DownloadManager downloadManager4 = this.manager;
            if (downloadManager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager4 = null;
            }
            DownloadManager downloadManager5 = this.manager;
            if (downloadManager5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager5 = null;
            }
            downloadManager4.setHttpManager(new HttpDownloadManager(downloadManager5.getDownloadPath()));
        }
        DownloadManager downloadManager6 = this.manager;
        if (downloadManager6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager6 = null;
        }
        BaseHttpDownloadManager httpManager = downloadManager6.getHttpManager();
        Intrinsics.checkNotNull(httpManager);
        DownloadManager downloadManager7 = this.manager;
        if (downloadManager7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager7 = null;
        }
        String apkUrl = downloadManager7.getApkUrl();
        DownloadManager downloadManager8 = this.manager;
        if (downloadManager8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager8 = null;
        }
        httpManager.download(apkUrl, downloadManager8.getApkName(), this);
        DownloadManager downloadManager9 = this.manager;
        if (downloadManager9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
        } else {
            downloadManager2 = downloadManager9;
        }
        downloadManager2.setDownloadState(true);
    }

    @Override // com.azhon.appupdate.listener.OnDownloadListener
    public void start() throws Resources.NotFoundException {
        LogUtil.INSTANCE.i(TAG, "download start");
        DownloadManager downloadManager = this.manager;
        DownloadManager downloadManager2 = null;
        if (downloadManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager = null;
        }
        if (downloadManager.getShowBgdToast()) {
            Toast.makeText(this, R.string.background_downloading, 0);
        }
        DownloadManager downloadManager3 = this.manager;
        if (downloadManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager3 = null;
        }
        if (downloadManager3.getShowNotification()) {
            NotificationUtil.Companion companion = NotificationUtil.INSTANCE;
            DownloadService downloadService = this;
            DownloadManager downloadManager4 = this.manager;
            if (downloadManager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager4 = null;
            }
            int smallIcon = downloadManager4.getSmallIcon();
            String string = getResources().getString(R.string.start_download);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.start_download)");
            String string2 = getResources().getString(R.string.start_download_hint);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.start_download_hint)");
            companion.showNotification(downloadService, smallIcon, string, string2);
        }
        DownloadManager downloadManager5 = this.manager;
        if (downloadManager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
        } else {
            downloadManager2 = downloadManager5;
        }
        Iterator<T> it = downloadManager2.getOnDownloadListeners().iterator();
        while (it.hasNext()) {
            ((OnDownloadListener) it.next()).start();
        }
    }

    @Override // com.azhon.appupdate.listener.OnDownloadListener
    public void downloading(int max, int progress) throws Resources.NotFoundException {
        String string;
        DownloadManager downloadManager = this.manager;
        DownloadManager downloadManager2 = null;
        if (downloadManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager = null;
        }
        if (downloadManager.getShowNotification()) {
            int i = (int) ((progress / max) * 100.0d);
            if (i == this.lastProgress) {
                return;
            }
            LogUtil.INSTANCE.i(TAG, "downloading max: " + max + " --- progress: " + progress);
            this.lastProgress = i;
            if (i < 0) {
                string = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append('%');
                string = sb.toString();
            }
            String str = string;
            NotificationUtil.Companion companion = NotificationUtil.INSTANCE;
            DownloadService downloadService = this;
            DownloadManager downloadManager3 = this.manager;
            if (downloadManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager3 = null;
            }
            int smallIcon = downloadManager3.getSmallIcon();
            String string2 = getResources().getString(R.string.start_downloading);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.start_downloading)");
            companion.showProgressNotification(downloadService, smallIcon, string2, str, max == -1 ? -1 : 100, i);
        }
        DownloadManager downloadManager4 = this.manager;
        if (downloadManager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
        } else {
            downloadManager2 = downloadManager4;
        }
        Iterator<T> it = downloadManager2.getOnDownloadListeners().iterator();
        while (it.hasNext()) {
            ((OnDownloadListener) it.next()).downloading(max, progress);
        }
    }

    @Override // com.azhon.appupdate.listener.OnDownloadListener
    public void done(File apk) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(apk, "apk");
        LogUtil.INSTANCE.d(TAG, Intrinsics.stringPlus("apk downloaded to ", apk.getPath()));
        DownloadManager downloadManager = this.manager;
        DownloadManager downloadManager2 = null;
        if (downloadManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager = null;
        }
        downloadManager.setDownloadState(false);
        DownloadManager downloadManager3 = this.manager;
        if (downloadManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager3 = null;
        }
        if (downloadManager3.getShowNotification() || Build.VERSION.SDK_INT >= 29) {
            NotificationUtil.Companion companion = NotificationUtil.INSTANCE;
            DownloadService downloadService = this;
            DownloadManager downloadManager4 = this.manager;
            if (downloadManager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager4 = null;
            }
            int smallIcon = downloadManager4.getSmallIcon();
            String string = getResources().getString(R.string.download_completed);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.download_completed)");
            String string2 = getResources().getString(R.string.click_hint);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.click_hint)");
            String authorities = Constant.INSTANCE.getAUTHORITIES();
            Intrinsics.checkNotNull(authorities);
            companion.showDoneNotification(downloadService, smallIcon, string, string2, authorities, apk);
        }
        DownloadManager downloadManager5 = this.manager;
        if (downloadManager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager5 = null;
        }
        if (downloadManager5.getJumpInstallPage()) {
            String authorities2 = Constant.INSTANCE.getAUTHORITIES();
            Intrinsics.checkNotNull(authorities2);
            ApkUtil.INSTANCE.installApk(this, authorities2, apk);
        }
        DownloadManager downloadManager6 = this.manager;
        if (downloadManager6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
        } else {
            downloadManager2 = downloadManager6;
        }
        Iterator<T> it = downloadManager2.getOnDownloadListeners().iterator();
        while (it.hasNext()) {
            ((OnDownloadListener) it.next()).done(apk);
        }
        releaseResources();
    }

    @Override // com.azhon.appupdate.listener.OnDownloadListener
    public void cancel() {
        LogUtil.INSTANCE.i(TAG, "download cancel");
        DownloadManager downloadManager = this.manager;
        DownloadManager downloadManager2 = null;
        if (downloadManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager = null;
        }
        downloadManager.setDownloadState(false);
        DownloadManager downloadManager3 = this.manager;
        if (downloadManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager3 = null;
        }
        if (downloadManager3.getShowNotification()) {
            NotificationUtil.INSTANCE.cancelNotification(this);
        }
        DownloadManager downloadManager4 = this.manager;
        if (downloadManager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
        } else {
            downloadManager2 = downloadManager4;
        }
        Iterator<T> it = downloadManager2.getOnDownloadListeners().iterator();
        while (it.hasNext()) {
            ((OnDownloadListener) it.next()).cancel();
        }
    }

    @Override // com.azhon.appupdate.listener.OnDownloadListener
    public void error(Exception e) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(e, "e");
        LogUtil.INSTANCE.e(TAG, Intrinsics.stringPlus("download error: ", e));
        DownloadManager downloadManager = this.manager;
        DownloadManager downloadManager2 = null;
        if (downloadManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager = null;
        }
        downloadManager.setDownloadState(false);
        DownloadManager downloadManager3 = this.manager;
        if (downloadManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager3 = null;
        }
        if (downloadManager3.getShowNotification()) {
            NotificationUtil.Companion companion = NotificationUtil.INSTANCE;
            DownloadService downloadService = this;
            DownloadManager downloadManager4 = this.manager;
            if (downloadManager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                downloadManager4 = null;
            }
            int smallIcon = downloadManager4.getSmallIcon();
            String string = getResources().getString(R.string.download_error);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.download_error)");
            String string2 = getResources().getString(R.string.continue_downloading);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.continue_downloading)");
            companion.showErrorNotification(downloadService, smallIcon, string, string2);
        }
        DownloadManager downloadManager5 = this.manager;
        if (downloadManager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
        } else {
            downloadManager2 = downloadManager5;
        }
        Iterator<T> it = downloadManager2.getOnDownloadListeners().iterator();
        while (it.hasNext()) {
            ((OnDownloadListener) it.next()).error(e);
        }
    }

    private final void releaseResources() {
        DownloadManager downloadManager = this.manager;
        DownloadManager downloadManager2 = null;
        if (downloadManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            downloadManager = null;
        }
        BaseHttpDownloadManager httpManager = downloadManager.getHttpManager();
        if (httpManager != null) {
            httpManager.release();
        }
        DownloadManager downloadManager3 = this.manager;
        if (downloadManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
        } else {
            downloadManager2 = downloadManager3;
        }
        downloadManager2.release();
        stopSelf();
    }
}
