package com.azhon.appupdate.manager;

import android.app.Activity;
import android.app.Application;
import android.app.NotificationChannel;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.Toast;
import com.azhon.appupdate.R;
import com.azhon.appupdate.base.BaseHttpDownloadManager;
import com.azhon.appupdate.config.Constant;
import com.azhon.appupdate.listener.LifecycleCallbacksAdapter;
import com.azhon.appupdate.listener.OnButtonClickListener;
import com.azhon.appupdate.listener.OnDownloadListener;
import com.azhon.appupdate.service.DownloadService;
import com.azhon.appupdate.util.ApkUtil;
import com.azhon.appupdate.util.LogUtil;
import com.azhon.appupdate.view.UpdateDialogActivity;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DownloadManager.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 t2\u00020\u0001:\u0002stB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010l\u001a\u00020mJ\b\u0010n\u001a\u000209H\u0002J\b\u0010o\u001a\u000209H\u0002J\b\u0010p\u001a\u00020mH\u0002J\u0006\u0010q\u001a\u00020mJ\u0006\u0010r\u001a\u00020mR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR\u001a\u0010)\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001a\u0010,\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001a\u0010/\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR\u001a\u00102\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\u001a\u00105\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\b\"\u0004\b7\u0010\nR\u001a\u00108\u001a\u000209X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u000209X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R\u001c\u0010A\u001a\u0004\u0018\u00010BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u000209X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010;\"\u0004\bI\u0010=R\u001c\u0010J\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u001a\"\u0004\bR\u0010\u001cR\u001c\u0010S\u001a\u0004\u0018\u00010TX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR \u0010Y\u001a\b\u0012\u0004\u0012\u00020[0ZX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001a\u0010`\u001a\u000209X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010;\"\u0004\bb\u0010=R\u001a\u0010c\u001a\u000209X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010;\"\u0004\be\u0010=R\u001a\u0010f\u001a\u000209X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010;\"\u0004\bh\u0010=R\u001a\u0010i\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u001a\"\u0004\bk\u0010\u001c¨\u0006u"}, d2 = {"Lcom/azhon/appupdate/manager/DownloadManager;", "Ljava/io/Serializable;", "builder", "Lcom/azhon/appupdate/manager/DownloadManager$Builder;", "(Lcom/azhon/appupdate/manager/DownloadManager$Builder;)V", "apkDescription", "", "getApkDescription", "()Ljava/lang/String;", "setApkDescription", "(Ljava/lang/String;)V", "apkMD5", "getApkMD5", "setApkMD5", "apkName", "getApkName", "setApkName", "apkSize", "getApkSize", "setApkSize", "apkUrl", "getApkUrl", "setApkUrl", "apkVersionCode", "", "getApkVersionCode", "()I", "setApkVersionCode", "(I)V", "apkVersionName", "getApkVersionName", "setApkVersionName", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "contextClsName", "getContextClsName", "setContextClsName", "dialogButtonColor", "getDialogButtonColor", "setDialogButtonColor", "dialogButtonTextColor", "getDialogButtonTextColor", "setDialogButtonTextColor", "dialogImage", "getDialogImage", "setDialogImage", "dialogProgressBarColor", "getDialogProgressBarColor", "setDialogProgressBarColor", "downloadPath", "getDownloadPath", "setDownloadPath", "downloadState", "", "getDownloadState", "()Z", "setDownloadState", "(Z)V", "forcedUpgrade", "getForcedUpgrade", "setForcedUpgrade", "httpManager", "Lcom/azhon/appupdate/base/BaseHttpDownloadManager;", "getHttpManager", "()Lcom/azhon/appupdate/base/BaseHttpDownloadManager;", "setHttpManager", "(Lcom/azhon/appupdate/base/BaseHttpDownloadManager;)V", "jumpInstallPage", "getJumpInstallPage", "setJumpInstallPage", "notificationChannel", "Landroid/app/NotificationChannel;", "getNotificationChannel", "()Landroid/app/NotificationChannel;", "setNotificationChannel", "(Landroid/app/NotificationChannel;)V", "notifyId", "getNotifyId", "setNotifyId", "onButtonClickListener", "Lcom/azhon/appupdate/listener/OnButtonClickListener;", "getOnButtonClickListener", "()Lcom/azhon/appupdate/listener/OnButtonClickListener;", "setOnButtonClickListener", "(Lcom/azhon/appupdate/listener/OnButtonClickListener;)V", "onDownloadListeners", "", "Lcom/azhon/appupdate/listener/OnDownloadListener;", "getOnDownloadListeners", "()Ljava/util/List;", "setOnDownloadListeners", "(Ljava/util/List;)V", "showBgdToast", "getShowBgdToast", "setShowBgdToast", "showNewerToast", "getShowNewerToast", "setShowNewerToast", "showNotification", "getShowNotification", "setShowNotification", "smallIcon", "getSmallIcon", "setSmallIcon", "cancel", "", "checkParams", "checkVersionCode", "clearListener", "download", "release", "Builder", "Companion", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DownloadManager implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "DownloadManager";
    private static DownloadManager instance;
    private String apkDescription;
    private String apkMD5;
    private String apkName;
    private String apkSize;
    private String apkUrl;
    private int apkVersionCode;
    private String apkVersionName;
    private transient Application application;
    private String contextClsName;
    private int dialogButtonColor;
    private int dialogButtonTextColor;
    private int dialogImage;
    private int dialogProgressBarColor;
    private String downloadPath;
    private boolean downloadState;
    private boolean forcedUpgrade;
    private BaseHttpDownloadManager httpManager;
    private boolean jumpInstallPage;
    private NotificationChannel notificationChannel;
    private int notifyId;
    private OnButtonClickListener onButtonClickListener;
    private List<OnDownloadListener> onDownloadListeners;
    private boolean showBgdToast;
    private boolean showNewerToast;
    private boolean showNotification;
    private int smallIcon;

    public /* synthetic */ DownloadManager(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    private DownloadManager(Builder builder) {
        this.application = builder.getApplication();
        this.contextClsName = builder.getContextClsName();
        this.apkUrl = builder.getApkUrl();
        this.apkName = builder.getApkName();
        this.apkVersionCode = builder.getApkVersionCode();
        this.apkVersionName = builder.getApkVersionName();
        String downloadPath = builder.getDownloadPath();
        if (downloadPath == null) {
            downloadPath = "/storage/emulated/0/Android/data/" + ((Object) this.application.getPackageName()) + "/cache";
        }
        this.downloadPath = downloadPath;
        this.showNewerToast = builder.getShowNewerToast();
        this.smallIcon = builder.getSmallIcon();
        this.apkDescription = builder.getApkDescription();
        this.apkSize = builder.getApkSize();
        this.apkMD5 = builder.getApkMD5();
        this.httpManager = builder.getHttpManager();
        this.notificationChannel = builder.getNotificationChannel();
        this.onDownloadListeners = builder.getOnDownloadListeners$appupdate_release();
        this.onButtonClickListener = builder.getOnButtonClickListener();
        this.showNotification = builder.getShowNotification();
        this.jumpInstallPage = builder.getJumpInstallPage();
        this.showBgdToast = builder.getShowBgdToast();
        this.forcedUpgrade = builder.getForcedUpgrade();
        this.notifyId = builder.getNotifyId();
        this.dialogImage = builder.getDialogImage();
        this.dialogButtonColor = builder.getDialogButtonColor();
        this.dialogButtonTextColor = builder.getDialogButtonTextColor();
        this.dialogProgressBarColor = builder.getDialogProgressBarColor();
        this.application.registerActivityLifecycleCallbacks(new LifecycleCallbacksAdapter() { // from class: com.azhon.appupdate.manager.DownloadManager.1
            @Override // com.azhon.appupdate.listener.LifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                super.onActivityDestroyed(activity);
                if (Intrinsics.areEqual(DownloadManager.this.getContextClsName(), activity.getClass().getName())) {
                    DownloadManager.this.clearListener();
                }
            }
        });
    }

    /* compiled from: DownloadManager.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/azhon/appupdate/manager/DownloadManager$Companion;", "", "()V", "TAG", "", "instance", "Lcom/azhon/appupdate/manager/DownloadManager;", "getInstance", "builder", "Lcom/azhon/appupdate/manager/DownloadManager$Builder;", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DownloadManager getInstance$default(Companion companion, Builder builder, int i, Object obj) {
            if ((i & 1) != 0) {
                builder = null;
            }
            return companion.getInstance(builder);
        }

        public final DownloadManager getInstance(Builder builder) {
            if (DownloadManager.instance == null) {
                Intrinsics.checkNotNull(builder);
                DownloadManager.instance = new DownloadManager(builder, null);
            }
            DownloadManager downloadManager = DownloadManager.instance;
            Intrinsics.checkNotNull(downloadManager);
            return downloadManager;
        }
    }

    public final Application getApplication() {
        return this.application;
    }

    public final void setApplication(Application application) {
        Intrinsics.checkNotNullParameter(application, "<set-?>");
        this.application = application;
    }

    public final String getContextClsName() {
        return this.contextClsName;
    }

    public final void setContextClsName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contextClsName = str;
    }

    public final boolean getDownloadState() {
        return this.downloadState;
    }

    public final void setDownloadState(boolean z) {
        this.downloadState = z;
    }

    public final String getApkUrl() {
        return this.apkUrl;
    }

    public final void setApkUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.apkUrl = str;
    }

    public final String getApkName() {
        return this.apkName;
    }

    public final void setApkName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.apkName = str;
    }

    public final int getApkVersionCode() {
        return this.apkVersionCode;
    }

    public final void setApkVersionCode(int i) {
        this.apkVersionCode = i;
    }

    public final String getApkVersionName() {
        return this.apkVersionName;
    }

    public final void setApkVersionName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.apkVersionName = str;
    }

    public final String getDownloadPath() {
        return this.downloadPath;
    }

    public final void setDownloadPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.downloadPath = str;
    }

    public final boolean getShowNewerToast() {
        return this.showNewerToast;
    }

    public final void setShowNewerToast(boolean z) {
        this.showNewerToast = z;
    }

    public final int getSmallIcon() {
        return this.smallIcon;
    }

    public final void setSmallIcon(int i) {
        this.smallIcon = i;
    }

    public final String getApkDescription() {
        return this.apkDescription;
    }

    public final void setApkDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.apkDescription = str;
    }

    public final String getApkSize() {
        return this.apkSize;
    }

    public final void setApkSize(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.apkSize = str;
    }

    public final String getApkMD5() {
        return this.apkMD5;
    }

    public final void setApkMD5(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.apkMD5 = str;
    }

    public final BaseHttpDownloadManager getHttpManager() {
        return this.httpManager;
    }

    public final void setHttpManager(BaseHttpDownloadManager baseHttpDownloadManager) {
        this.httpManager = baseHttpDownloadManager;
    }

    public final NotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    public final void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public final List<OnDownloadListener> getOnDownloadListeners() {
        return this.onDownloadListeners;
    }

    public final void setOnDownloadListeners(List<OnDownloadListener> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.onDownloadListeners = list;
    }

    public final OnButtonClickListener getOnButtonClickListener() {
        return this.onButtonClickListener;
    }

    public final void setOnButtonClickListener(OnButtonClickListener onButtonClickListener) {
        this.onButtonClickListener = onButtonClickListener;
    }

    public final boolean getShowNotification() {
        return this.showNotification;
    }

    public final void setShowNotification(boolean z) {
        this.showNotification = z;
    }

    public final boolean getJumpInstallPage() {
        return this.jumpInstallPage;
    }

    public final void setJumpInstallPage(boolean z) {
        this.jumpInstallPage = z;
    }

    public final boolean getShowBgdToast() {
        return this.showBgdToast;
    }

    public final void setShowBgdToast(boolean z) {
        this.showBgdToast = z;
    }

    public final boolean getForcedUpgrade() {
        return this.forcedUpgrade;
    }

    public final void setForcedUpgrade(boolean z) {
        this.forcedUpgrade = z;
    }

    public final int getNotifyId() {
        return this.notifyId;
    }

    public final void setNotifyId(int i) {
        this.notifyId = i;
    }

    public final int getDialogImage() {
        return this.dialogImage;
    }

    public final void setDialogImage(int i) {
        this.dialogImage = i;
    }

    public final int getDialogButtonColor() {
        return this.dialogButtonColor;
    }

    public final void setDialogButtonColor(int i) {
        this.dialogButtonColor = i;
    }

    public final int getDialogButtonTextColor() {
        return this.dialogButtonTextColor;
    }

    public final void setDialogButtonTextColor(int i) {
        this.dialogButtonTextColor = i;
    }

    public final int getDialogProgressBarColor() {
        return this.dialogProgressBarColor;
    }

    public final void setDialogProgressBarColor(int i) {
        this.dialogProgressBarColor = i;
    }

    public final void download() throws Resources.NotFoundException {
        if (checkParams()) {
            if (checkVersionCode()) {
                this.application.startService(new Intent(this.application, (Class<?>) DownloadService.class));
                return;
            }
            if (this.apkVersionCode > ApkUtil.INSTANCE.getVersionCode(this.application)) {
                this.application.startActivity(new Intent(this.application, (Class<?>) UpdateDialogActivity.class).setFlags(268435456));
                return;
            }
            if (this.showNewerToast) {
                Toast.makeText(this.application, R.string.latest_version, 0);
            }
            LogUtil.Companion companion = LogUtil.INSTANCE;
            String string = this.application.getResources().getString(R.string.latest_version);
            Intrinsics.checkNotNullExpressionValue(string, "application.resources.ge…(R.string.latest_version)");
            companion.d(TAG, string);
        }
    }

    private final boolean checkParams() {
        if (this.apkUrl.length() == 0) {
            LogUtil.INSTANCE.e(TAG, "apkUrl can not be empty!");
            return false;
        }
        if (this.apkName.length() == 0) {
            LogUtil.INSTANCE.e(TAG, "apkName can not be empty!");
            return false;
        }
        if (!StringsKt.endsWith$default(this.apkName, Constant.APK_SUFFIX, false, 2, (Object) null)) {
            LogUtil.INSTANCE.e(TAG, "apkName must endsWith .apk!");
            return false;
        }
        if (this.smallIcon == -1) {
            LogUtil.INSTANCE.e(TAG, "smallIcon can not be empty!");
            return false;
        }
        Constant.INSTANCE.setAUTHORITIES(Intrinsics.stringPlus(this.application.getPackageName(), ".fileProvider"));
        return true;
    }

    private final boolean checkVersionCode() {
        if (this.apkVersionCode == Integer.MIN_VALUE) {
            return true;
        }
        if (this.apkDescription.length() == 0) {
            LogUtil.INSTANCE.e(TAG, "apkDescription can not be empty!");
        }
        return false;
    }

    public final void cancel() {
        BaseHttpDownloadManager baseHttpDownloadManager = this.httpManager;
        if (baseHttpDownloadManager == null) {
            return;
        }
        baseHttpDownloadManager.cancel();
    }

    public final void release() {
        instance = null;
        clearListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearListener() {
        this.onButtonClickListener = null;
        this.onDownloadListeners.clear();
    }

    /* compiled from: DownloadManager.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010i\u001a\u00020jJ\u000e\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0018J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0018J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0018J\u000e\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0018J\u000e\u0010k\u001a\u00020\u00002\u0006\u0010l\u001a\u000209J\u000e\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u000209J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020?J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010D\u001a\u000209J\u000e\u0010G\u001a\u00020\u00002\u0006\u0010G\u001a\u00020HJ\u000e\u0010M\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0018J\u000e\u0010P\u001a\u00020\u00002\u0006\u0010P\u001a\u00020QJ\u000e\u0010m\u001a\u00020\u00002\u0006\u0010m\u001a\u00020XJ\u000e\u0010]\u001a\u00020\u00002\u0006\u0010]\u001a\u000209J\u000e\u0010`\u001a\u00020\u00002\u0006\u0010`\u001a\u000209J\u000e\u0010c\u001a\u00020\u00002\u0006\u0010c\u001a\u000209J\u000e\u0010f\u001a\u00020\u00002\u0006\u0010f\u001a\u00020\u0018R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020!X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR\u001a\u0010)\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001a\u0010,\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001a\u0010/\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR\u001a\u00102\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\u001c\u00105\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\b\"\u0004\b7\u0010\nR\u001a\u00108\u001a\u000209X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u000209X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010;\"\u0004\bF\u0010=R\u001c\u0010G\u001a\u0004\u0018\u00010HX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u001a\"\u0004\bO\u0010\u001cR\u001c\u0010P\u001a\u0004\u0018\u00010QX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR \u0010V\u001a\b\u0012\u0004\u0012\u00020X0WX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010]\u001a\u000209X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010;\"\u0004\b_\u0010=R\u001a\u0010`\u001a\u000209X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010;\"\u0004\bb\u0010=R\u001a\u0010c\u001a\u000209X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010;\"\u0004\be\u0010=R\u001a\u0010f\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u001a\"\u0004\bh\u0010\u001c¨\u0006n"}, d2 = {"Lcom/azhon/appupdate/manager/DownloadManager$Builder;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "apkDescription", "", "getApkDescription$appupdate_release", "()Ljava/lang/String;", "setApkDescription$appupdate_release", "(Ljava/lang/String;)V", "apkMD5", "getApkMD5$appupdate_release", "setApkMD5$appupdate_release", "apkName", "getApkName$appupdate_release", "setApkName$appupdate_release", "apkSize", "getApkSize$appupdate_release", "setApkSize$appupdate_release", "apkUrl", "getApkUrl$appupdate_release", "setApkUrl$appupdate_release", "apkVersionCode", "", "getApkVersionCode$appupdate_release", "()I", "setApkVersionCode$appupdate_release", "(I)V", "apkVersionName", "getApkVersionName$appupdate_release", "setApkVersionName$appupdate_release", "application", "Landroid/app/Application;", "getApplication$appupdate_release", "()Landroid/app/Application;", "setApplication$appupdate_release", "(Landroid/app/Application;)V", "contextClsName", "getContextClsName$appupdate_release", "setContextClsName$appupdate_release", "dialogButtonColor", "getDialogButtonColor$appupdate_release", "setDialogButtonColor$appupdate_release", "dialogButtonTextColor", "getDialogButtonTextColor$appupdate_release", "setDialogButtonTextColor$appupdate_release", "dialogImage", "getDialogImage$appupdate_release", "setDialogImage$appupdate_release", "dialogProgressBarColor", "getDialogProgressBarColor$appupdate_release", "setDialogProgressBarColor$appupdate_release", "downloadPath", "getDownloadPath$appupdate_release", "setDownloadPath$appupdate_release", "forcedUpgrade", "", "getForcedUpgrade$appupdate_release", "()Z", "setForcedUpgrade$appupdate_release", "(Z)V", "httpManager", "Lcom/azhon/appupdate/base/BaseHttpDownloadManager;", "getHttpManager$appupdate_release", "()Lcom/azhon/appupdate/base/BaseHttpDownloadManager;", "setHttpManager$appupdate_release", "(Lcom/azhon/appupdate/base/BaseHttpDownloadManager;)V", "jumpInstallPage", "getJumpInstallPage$appupdate_release", "setJumpInstallPage$appupdate_release", "notificationChannel", "Landroid/app/NotificationChannel;", "getNotificationChannel$appupdate_release", "()Landroid/app/NotificationChannel;", "setNotificationChannel$appupdate_release", "(Landroid/app/NotificationChannel;)V", "notifyId", "getNotifyId$appupdate_release", "setNotifyId$appupdate_release", "onButtonClickListener", "Lcom/azhon/appupdate/listener/OnButtonClickListener;", "getOnButtonClickListener$appupdate_release", "()Lcom/azhon/appupdate/listener/OnButtonClickListener;", "setOnButtonClickListener$appupdate_release", "(Lcom/azhon/appupdate/listener/OnButtonClickListener;)V", "onDownloadListeners", "", "Lcom/azhon/appupdate/listener/OnDownloadListener;", "getOnDownloadListeners$appupdate_release", "()Ljava/util/List;", "setOnDownloadListeners$appupdate_release", "(Ljava/util/List;)V", "showBgdToast", "getShowBgdToast$appupdate_release", "setShowBgdToast$appupdate_release", "showNewerToast", "getShowNewerToast$appupdate_release", "setShowNewerToast$appupdate_release", "showNotification", "getShowNotification$appupdate_release", "setShowNotification$appupdate_release", "smallIcon", "getSmallIcon$appupdate_release", "setSmallIcon$appupdate_release", "build", "Lcom/azhon/appupdate/manager/DownloadManager;", "enableLog", "enable", "onDownloadListener", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {
        private String apkDescription;
        private String apkMD5;
        private String apkName;
        private String apkSize;
        private String apkUrl;
        private int apkVersionCode;
        private String apkVersionName;
        private Application application;
        private String contextClsName;
        private int dialogButtonColor;
        private int dialogButtonTextColor;
        private int dialogImage;
        private int dialogProgressBarColor;
        private String downloadPath;
        private boolean forcedUpgrade;
        private BaseHttpDownloadManager httpManager;
        private boolean jumpInstallPage;
        private NotificationChannel notificationChannel;
        private int notifyId;
        private OnButtonClickListener onButtonClickListener;
        private List<OnDownloadListener> onDownloadListeners;
        private boolean showBgdToast;
        private boolean showNewerToast;
        private boolean showNotification;
        private int smallIcon;

        public Builder(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Application application = activity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "activity.application");
            this.application = application;
            String name = activity.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "activity.javaClass.name");
            this.contextClsName = name;
            this.apkUrl = "";
            this.apkName = "";
            this.apkVersionCode = Integer.MIN_VALUE;
            this.apkVersionName = "";
            File externalCacheDir = this.application.getExternalCacheDir();
            this.downloadPath = externalCacheDir == null ? null : externalCacheDir.getPath();
            this.smallIcon = -1;
            this.apkDescription = "";
            this.apkSize = "";
            this.apkMD5 = "";
            this.onDownloadListeners = new ArrayList();
            this.showNotification = true;
            this.jumpInstallPage = true;
            this.showBgdToast = true;
            this.notifyId = 1011;
            this.dialogImage = -1;
            this.dialogButtonColor = -1;
            this.dialogButtonTextColor = -1;
            this.dialogProgressBarColor = -1;
        }

        /* renamed from: getApplication$appupdate_release, reason: from getter */
        public final Application getApplication() {
            return this.application;
        }

        public final void setApplication$appupdate_release(Application application) {
            Intrinsics.checkNotNullParameter(application, "<set-?>");
            this.application = application;
        }

        /* renamed from: getContextClsName$appupdate_release, reason: from getter */
        public final String getContextClsName() {
            return this.contextClsName;
        }

        public final void setContextClsName$appupdate_release(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.contextClsName = str;
        }

        /* renamed from: getApkUrl$appupdate_release, reason: from getter */
        public final String getApkUrl() {
            return this.apkUrl;
        }

        public final void setApkUrl$appupdate_release(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.apkUrl = str;
        }

        /* renamed from: getApkName$appupdate_release, reason: from getter */
        public final String getApkName() {
            return this.apkName;
        }

        public final void setApkName$appupdate_release(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.apkName = str;
        }

        /* renamed from: getApkVersionCode$appupdate_release, reason: from getter */
        public final int getApkVersionCode() {
            return this.apkVersionCode;
        }

        public final void setApkVersionCode$appupdate_release(int i) {
            this.apkVersionCode = i;
        }

        /* renamed from: getApkVersionName$appupdate_release, reason: from getter */
        public final String getApkVersionName() {
            return this.apkVersionName;
        }

        public final void setApkVersionName$appupdate_release(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.apkVersionName = str;
        }

        /* renamed from: getDownloadPath$appupdate_release, reason: from getter */
        public final String getDownloadPath() {
            return this.downloadPath;
        }

        public final void setDownloadPath$appupdate_release(String str) {
            this.downloadPath = str;
        }

        /* renamed from: getShowNewerToast$appupdate_release, reason: from getter */
        public final boolean getShowNewerToast() {
            return this.showNewerToast;
        }

        public final void setShowNewerToast$appupdate_release(boolean z) {
            this.showNewerToast = z;
        }

        /* renamed from: getSmallIcon$appupdate_release, reason: from getter */
        public final int getSmallIcon() {
            return this.smallIcon;
        }

        public final void setSmallIcon$appupdate_release(int i) {
            this.smallIcon = i;
        }

        /* renamed from: getApkDescription$appupdate_release, reason: from getter */
        public final String getApkDescription() {
            return this.apkDescription;
        }

        public final void setApkDescription$appupdate_release(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.apkDescription = str;
        }

        /* renamed from: getApkSize$appupdate_release, reason: from getter */
        public final String getApkSize() {
            return this.apkSize;
        }

        public final void setApkSize$appupdate_release(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.apkSize = str;
        }

        /* renamed from: getApkMD5$appupdate_release, reason: from getter */
        public final String getApkMD5() {
            return this.apkMD5;
        }

        public final void setApkMD5$appupdate_release(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.apkMD5 = str;
        }

        /* renamed from: getHttpManager$appupdate_release, reason: from getter */
        public final BaseHttpDownloadManager getHttpManager() {
            return this.httpManager;
        }

        public final void setHttpManager$appupdate_release(BaseHttpDownloadManager baseHttpDownloadManager) {
            this.httpManager = baseHttpDownloadManager;
        }

        /* renamed from: getNotificationChannel$appupdate_release, reason: from getter */
        public final NotificationChannel getNotificationChannel() {
            return this.notificationChannel;
        }

        public final void setNotificationChannel$appupdate_release(NotificationChannel notificationChannel) {
            this.notificationChannel = notificationChannel;
        }

        public final List<OnDownloadListener> getOnDownloadListeners$appupdate_release() {
            return this.onDownloadListeners;
        }

        public final void setOnDownloadListeners$appupdate_release(List<OnDownloadListener> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.onDownloadListeners = list;
        }

        /* renamed from: getOnButtonClickListener$appupdate_release, reason: from getter */
        public final OnButtonClickListener getOnButtonClickListener() {
            return this.onButtonClickListener;
        }

        public final void setOnButtonClickListener$appupdate_release(OnButtonClickListener onButtonClickListener) {
            this.onButtonClickListener = onButtonClickListener;
        }

        /* renamed from: getShowNotification$appupdate_release, reason: from getter */
        public final boolean getShowNotification() {
            return this.showNotification;
        }

        public final void setShowNotification$appupdate_release(boolean z) {
            this.showNotification = z;
        }

        /* renamed from: getJumpInstallPage$appupdate_release, reason: from getter */
        public final boolean getJumpInstallPage() {
            return this.jumpInstallPage;
        }

        public final void setJumpInstallPage$appupdate_release(boolean z) {
            this.jumpInstallPage = z;
        }

        /* renamed from: getShowBgdToast$appupdate_release, reason: from getter */
        public final boolean getShowBgdToast() {
            return this.showBgdToast;
        }

        public final void setShowBgdToast$appupdate_release(boolean z) {
            this.showBgdToast = z;
        }

        /* renamed from: getForcedUpgrade$appupdate_release, reason: from getter */
        public final boolean getForcedUpgrade() {
            return this.forcedUpgrade;
        }

        public final void setForcedUpgrade$appupdate_release(boolean z) {
            this.forcedUpgrade = z;
        }

        /* renamed from: getNotifyId$appupdate_release, reason: from getter */
        public final int getNotifyId() {
            return this.notifyId;
        }

        public final void setNotifyId$appupdate_release(int i) {
            this.notifyId = i;
        }

        /* renamed from: getDialogImage$appupdate_release, reason: from getter */
        public final int getDialogImage() {
            return this.dialogImage;
        }

        public final void setDialogImage$appupdate_release(int i) {
            this.dialogImage = i;
        }

        /* renamed from: getDialogButtonColor$appupdate_release, reason: from getter */
        public final int getDialogButtonColor() {
            return this.dialogButtonColor;
        }

        public final void setDialogButtonColor$appupdate_release(int i) {
            this.dialogButtonColor = i;
        }

        /* renamed from: getDialogButtonTextColor$appupdate_release, reason: from getter */
        public final int getDialogButtonTextColor() {
            return this.dialogButtonTextColor;
        }

        public final void setDialogButtonTextColor$appupdate_release(int i) {
            this.dialogButtonTextColor = i;
        }

        /* renamed from: getDialogProgressBarColor$appupdate_release, reason: from getter */
        public final int getDialogProgressBarColor() {
            return this.dialogProgressBarColor;
        }

        public final void setDialogProgressBarColor$appupdate_release(int i) {
            this.dialogProgressBarColor = i;
        }

        public final Builder apkUrl(String apkUrl) {
            Intrinsics.checkNotNullParameter(apkUrl, "apkUrl");
            this.apkUrl = apkUrl;
            return this;
        }

        public final Builder apkName(String apkName) {
            Intrinsics.checkNotNullParameter(apkName, "apkName");
            this.apkName = apkName;
            return this;
        }

        public final Builder apkVersionCode(int apkVersionCode) {
            this.apkVersionCode = apkVersionCode;
            return this;
        }

        public final Builder apkVersionName(String apkVersionName) {
            Intrinsics.checkNotNullParameter(apkVersionName, "apkVersionName");
            this.apkVersionName = apkVersionName;
            return this;
        }

        public final Builder showNewerToast(boolean showNewerToast) {
            this.showNewerToast = showNewerToast;
            return this;
        }

        public final Builder smallIcon(int smallIcon) {
            this.smallIcon = smallIcon;
            return this;
        }

        public final Builder apkDescription(String apkDescription) {
            Intrinsics.checkNotNullParameter(apkDescription, "apkDescription");
            this.apkDescription = apkDescription;
            return this;
        }

        public final Builder apkSize(String apkSize) {
            Intrinsics.checkNotNullParameter(apkSize, "apkSize");
            this.apkSize = apkSize;
            return this;
        }

        public final Builder apkMD5(String apkMD5) {
            Intrinsics.checkNotNullParameter(apkMD5, "apkMD5");
            this.apkMD5 = apkMD5;
            return this;
        }

        public final Builder httpManager(BaseHttpDownloadManager httpManager) {
            Intrinsics.checkNotNullParameter(httpManager, "httpManager");
            this.httpManager = httpManager;
            return this;
        }

        public final Builder notificationChannel(NotificationChannel notificationChannel) {
            Intrinsics.checkNotNullParameter(notificationChannel, "notificationChannel");
            this.notificationChannel = notificationChannel;
            return this;
        }

        public final Builder onButtonClickListener(OnButtonClickListener onButtonClickListener) {
            Intrinsics.checkNotNullParameter(onButtonClickListener, "onButtonClickListener");
            this.onButtonClickListener = onButtonClickListener;
            return this;
        }

        public final Builder onDownloadListener(OnDownloadListener onDownloadListener) {
            Intrinsics.checkNotNullParameter(onDownloadListener, "onDownloadListener");
            this.onDownloadListeners.add(onDownloadListener);
            return this;
        }

        public final Builder showNotification(boolean showNotification) {
            this.showNotification = showNotification;
            return this;
        }

        public final Builder jumpInstallPage(boolean jumpInstallPage) {
            this.jumpInstallPage = jumpInstallPage;
            return this;
        }

        public final Builder showBgdToast(boolean showBgdToast) {
            this.showBgdToast = showBgdToast;
            return this;
        }

        public final Builder forcedUpgrade(boolean forcedUpgrade) {
            this.forcedUpgrade = forcedUpgrade;
            return this;
        }

        public final Builder notifyId(int notifyId) {
            this.notifyId = notifyId;
            return this;
        }

        public final Builder dialogImage(int dialogImage) {
            this.dialogImage = dialogImage;
            return this;
        }

        public final Builder dialogButtonColor(int dialogButtonColor) {
            this.dialogButtonColor = dialogButtonColor;
            return this;
        }

        public final Builder dialogButtonTextColor(int dialogButtonTextColor) {
            this.dialogButtonTextColor = dialogButtonTextColor;
            return this;
        }

        public final Builder dialogProgressBarColor(int dialogProgressBarColor) {
            this.dialogProgressBarColor = dialogProgressBarColor;
            return this;
        }

        public final Builder enableLog(boolean enable) {
            LogUtil.INSTANCE.enable(enable);
            return this;
        }

        public final DownloadManager build() {
            return DownloadManager.INSTANCE.getInstance(this);
        }
    }
}
