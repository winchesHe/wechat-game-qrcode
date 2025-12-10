package com.azhon.appupdate.util;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.azhon.appupdate.config.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/azhon/appupdate/util/LogUtil;", "", "()V", "Companion", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LogUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean b = true;

    /* compiled from: LogUtil.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/azhon/appupdate/util/LogUtil$Companion;", "", "()V", "b", "", "getB", "()Z", "setB", "(Z)V", "d", "", "tag", "", NotificationCompat.CATEGORY_MESSAGE, "e", "enable", "i", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getB() {
            return LogUtil.b;
        }

        public final void setB(boolean z) {
            LogUtil.b = z;
        }

        public final void enable(boolean enable) {
            setB(enable);
        }

        public final void e(String tag, String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (getB()) {
                Log.e(Intrinsics.stringPlus(Constant.TAG, tag), msg);
            }
        }

        public final void d(String tag, String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (getB()) {
                Log.d(Intrinsics.stringPlus(Constant.TAG, tag), msg);
            }
        }

        public final void i(String tag, String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (getB()) {
                Log.i(Intrinsics.stringPlus(Constant.TAG, tag), msg);
            }
        }
    }
}
