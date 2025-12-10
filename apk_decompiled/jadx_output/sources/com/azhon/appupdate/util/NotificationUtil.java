package com.azhon.appupdate.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.azhon.appupdate.config.Constant;
import com.azhon.appupdate.manager.DownloadManager;
import com.azhon.appupdate.service.DownloadService;
import com.baidu.mobstat.Config;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/azhon/appupdate/util/NotificationUtil;", "", "()V", "Companion", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: NotificationUtil.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0011\u001a\u00020\u000eH\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nJ6\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017J&\u0010\u0018\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ&\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ6\u0010\u001a\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f¨\u0006\u001d"}, d2 = {"Lcom/azhon/appupdate/util/NotificationUtil$Companion;", "", "()V", "afterO", "", "manager", "Landroid/app/NotificationManager;", "builderNotification", "Landroidx/core/app/NotificationCompat$Builder;", "context", "Landroid/content/Context;", "icon", "", Config.FEED_LIST_ITEM_TITLE, "", "content", "cancelNotification", "getNotificationChannelId", "notificationEnable", "", "showDoneNotification", "authorities", "apk", "Ljava/io/File;", "showErrorNotification", "showNotification", "showProgressNotification", "max", "progress", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean notificationEnable(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return NotificationManagerCompat.from(context).areNotificationsEnabled();
        }

        private final String getNotificationChannelId() {
            NotificationChannel notificationChannel = DownloadManager.Companion.getInstance$default(DownloadManager.INSTANCE, null, 1, null).getNotificationChannel();
            if (notificationChannel == null) {
                return Constant.DEFAULT_CHANNEL_ID;
            }
            String id = notificationChannel.getId();
            Intrinsics.checkNotNullExpressionValue(id, "{\n                channel.id\n            }");
            return id;
        }

        private final NotificationCompat.Builder builderNotification(Context context, int icon, String title, String content) {
            NotificationCompat.Builder ongoing = new NotificationCompat.Builder(context, Build.VERSION.SDK_INT >= 26 ? getNotificationChannelId() : "").setSmallIcon(icon).setContentTitle(title).setWhen(System.currentTimeMillis()).setContentText(content).setAutoCancel(false).setOngoing(true);
            Intrinsics.checkNotNullExpressionValue(ongoing, "Builder(context, channel…        .setOngoing(true)");
            return ongoing;
        }

        public final void showNotification(Context context, int icon, String title, String content) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            Object systemService = context.getSystemService("notification");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                afterO(notificationManager);
            }
            Notification notificationBuild = builderNotification(context, icon, title, content).setDefaults(1).build();
            Intrinsics.checkNotNullExpressionValue(notificationBuild, "builderNotification(cont…\n                .build()");
            notificationManager.notify(DownloadManager.Companion.getInstance$default(DownloadManager.INSTANCE, null, 1, null).getNotifyId(), notificationBuild);
        }

        public final void showProgressNotification(Context context, int icon, String title, String content, int max, int progress) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            Object systemService = context.getSystemService("notification");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            NotificationManager notificationManager = (NotificationManager) systemService;
            Notification notificationBuild = builderNotification(context, icon, title, content).setProgress(max, progress, max == -1).build();
            Intrinsics.checkNotNullExpressionValue(notificationBuild, "builderNotification(cont…gress, max == -1).build()");
            notificationManager.notify(DownloadManager.Companion.getInstance$default(DownloadManager.INSTANCE, null, 1, null).getNotifyId(), notificationBuild);
        }

        public final void showDoneNotification(Context context, int icon, String title, String content, String authorities, File apk) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(authorities, "authorities");
            Intrinsics.checkNotNullParameter(apk, "apk");
            Object systemService = context.getSystemService("notification");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            NotificationManager notificationManager = (NotificationManager) systemService;
            notificationManager.cancel(DownloadManager.Companion.getInstance$default(DownloadManager.INSTANCE, null, 1, null).getNotifyId());
            Notification notificationBuild = builderNotification(context, icon, title, content).setContentIntent(PendingIntent.getActivity(context, 0, ApkUtil.INSTANCE.createInstallIntent(context, authorities, apk), 67108864)).build();
            Intrinsics.checkNotNullExpressionValue(notificationBuild, "builderNotification(cont…\n                .build()");
            notificationBuild.flags |= 16;
            notificationManager.notify(DownloadManager.Companion.getInstance$default(DownloadManager.INSTANCE, null, 1, null).getNotifyId(), notificationBuild);
        }

        public final void showErrorNotification(Context context, int icon, String title, String content) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            Object systemService = context.getSystemService("notification");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                afterO(notificationManager);
            }
            Notification notificationBuild = builderNotification(context, icon, title, content).setAutoCancel(true).setOngoing(false).setContentIntent(PendingIntent.getService(context, 0, new Intent(context, (Class<?>) DownloadService.class), 67108864)).setDefaults(1).build();
            Intrinsics.checkNotNullExpressionValue(notificationBuild, "builderNotification(cont…\n                .build()");
            notificationManager.notify(DownloadManager.Companion.getInstance$default(DownloadManager.INSTANCE, null, 1, null).getNotifyId(), notificationBuild);
        }

        public final void cancelNotification(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("notification");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            ((NotificationManager) systemService).cancel(DownloadManager.Companion.getInstance$default(DownloadManager.INSTANCE, null, 1, null).getNotifyId());
        }

        private final void afterO(NotificationManager manager) {
            NotificationChannel notificationChannel = DownloadManager.Companion.getInstance$default(DownloadManager.INSTANCE, null, 1, null).getNotificationChannel();
            if (notificationChannel == null) {
                notificationChannel = new NotificationChannel(Constant.DEFAULT_CHANNEL_ID, Constant.DEFAULT_CHANNEL_NAME, 2);
                notificationChannel.enableLights(true);
                notificationChannel.setShowBadge(true);
            }
            manager.createNotificationChannel(notificationChannel);
        }
    }
}
