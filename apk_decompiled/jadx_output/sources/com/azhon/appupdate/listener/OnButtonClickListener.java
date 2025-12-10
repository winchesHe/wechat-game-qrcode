package com.azhon.appupdate.listener;

import com.baidu.mobstat.Config;
import kotlin.Metadata;

/* compiled from: OnButtonClickListener.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/azhon/appupdate/listener/OnButtonClickListener;", "", "onButtonClick", "", Config.FEED_LIST_ITEM_CUSTOM_ID, "", "Companion", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface OnButtonClickListener {
    public static final int CANCEL = 1;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int UPDATE = 0;

    void onButtonClick(int id);

    /* compiled from: OnButtonClickListener.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/azhon/appupdate/listener/OnButtonClickListener$Companion;", "", "()V", "CANCEL", "", "UPDATE", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int CANCEL = 1;
        public static final int UPDATE = 0;

        private Companion() {
        }
    }
}
