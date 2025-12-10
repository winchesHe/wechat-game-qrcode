package com.azhon.appupdate.manager;

import com.azhon.appupdate.base.BaseHttpDownloadManager;
import com.azhon.appupdate.config.Constant;
import com.azhon.appupdate.listener.OnDownloadListener;
import com.baidu.mobstat.Config;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

/* compiled from: HttpDownloadManager.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/azhon/appupdate/manager/HttpDownloadManager;", "Lcom/azhon/appupdate/base/BaseHttpDownloadManager;", Config.FEED_LIST_ITEM_PATH, "", "(Ljava/lang/String;)V", "job", "Lkotlinx/coroutines/Job;", "shutdown", "", "cancel", "", "connectToDownload", "apkUrl", "apkName", "listener", "Lcom/azhon/appupdate/listener/OnDownloadListener;", "(Ljava/lang/String;Ljava/lang/String;Lcom/azhon/appupdate/listener/OnDownloadListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "download", "release", "Companion", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class HttpDownloadManager extends BaseHttpDownloadManager {
    private static final String TAG = "HttpDownloadManager";
    private Job job;
    private final String path;
    private boolean shutdown;

    /* compiled from: HttpDownloadManager.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "com.azhon.appupdate.manager.HttpDownloadManager", f = "HttpDownloadManager.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3}, l = {79, 87, 98, 100}, m = "connectToDownload", n = {"this", "listener", "con", "inStream", "len", "progress", "buffer", "file", "outSteam", "length", "con", "con", "con"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$0", "L$0"})
    /* renamed from: com.azhon.appupdate.manager.HttpDownloadManager$connectToDownload$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpDownloadManager.this.connectToDownload(null, null, null, this);
        }
    }

    public HttpDownloadManager(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
    }

    @Override // com.azhon.appupdate.base.BaseHttpDownloadManager
    public void download(String apkUrl, String apkName, OnDownloadListener listener) {
        Intrinsics.checkNotNullParameter(apkUrl, "apkUrl");
        Intrinsics.checkNotNullParameter(apkName, "apkName");
        this.shutdown = false;
        File file = new File(this.path, apkName);
        if (file.exists()) {
            file.delete();
        }
        CoroutineName coroutineName = new CoroutineName(Constant.COROUTINE_NAME);
        this.job = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().plus(coroutineName), null, new AnonymousClass2(listener, coroutineName, this, apkUrl, apkName, null), 2, null);
    }

    /* compiled from: HttpDownloadManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "com.azhon.appupdate.manager.HttpDownloadManager$download$2", f = "HttpDownloadManager.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.azhon.appupdate.manager.HttpDownloadManager$download$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $apkName;
        final /* synthetic */ String $apkUrl;
        final /* synthetic */ CoroutineName $coroutineName;
        final /* synthetic */ OnDownloadListener $listener;
        int label;
        final /* synthetic */ HttpDownloadManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(OnDownloadListener onDownloadListener, CoroutineName coroutineName, HttpDownloadManager httpDownloadManager, String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$listener = onDownloadListener;
            this.$coroutineName = coroutineName;
            this.this$0 = httpDownloadManager;
            this.$apkUrl = str;
            this.$apkName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$listener, this.$coroutineName, this.this$0, this.$apkUrl, this.$apkName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            OnDownloadListener onDownloadListener;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    OnDownloadListener onDownloadListener2 = this.$listener;
                    if (onDownloadListener2 != null) {
                        onDownloadListener2.start();
                    }
                    this.label = 1;
                    if (BuildersKt.withContext(Dispatchers.getIO().plus(this.$coroutineName), new AnonymousClass1(this.this$0, this.$apkUrl, this.$apkName, this.$listener, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (CancellationException unused) {
                if (this.this$0.shutdown && (onDownloadListener = this.$listener) != null) {
                    onDownloadListener.cancel();
                }
            } catch (Exception e) {
                e.printStackTrace();
                OnDownloadListener onDownloadListener3 = this.$listener;
                if (onDownloadListener3 != null) {
                    onDownloadListener3.error(e);
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: HttpDownloadManager.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        @DebugMetadata(c = "com.azhon.appupdate.manager.HttpDownloadManager$download$2$1", f = "HttpDownloadManager.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.azhon.appupdate.manager.HttpDownloadManager$download$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $apkName;
            final /* synthetic */ String $apkUrl;
            final /* synthetic */ OnDownloadListener $listener;
            int label;
            final /* synthetic */ HttpDownloadManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HttpDownloadManager httpDownloadManager, String str, String str2, OnDownloadListener onDownloadListener, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = httpDownloadManager;
                this.$apkUrl = str;
                this.$apkName = str2;
                this.$listener = onDownloadListener;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$apkUrl, this.$apkName, this.$listener, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.connectToDownload(this.$apkUrl, this.$apkName, this.$listener, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x011c -> B:31:0x011f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectToDownload(java.lang.String r18, java.lang.String r19, com.azhon.appupdate.listener.OnDownloadListener r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.azhon.appupdate.manager.HttpDownloadManager.connectToDownload(java.lang.String, java.lang.String, com.azhon.appupdate.listener.OnDownloadListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: HttpDownloadManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "com.azhon.appupdate.manager.HttpDownloadManager$connectToDownload$4", f = "HttpDownloadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.azhon.appupdate.manager.HttpDownloadManager$connectToDownload$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $length;
        final /* synthetic */ OnDownloadListener $listener;
        final /* synthetic */ Ref.IntRef $progress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(OnDownloadListener onDownloadListener, int i, Ref.IntRef intRef, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$listener = onDownloadListener;
            this.$length = i;
            this.$progress = intRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$listener, this.$length, this.$progress, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OnDownloadListener onDownloadListener = this.$listener;
            if (onDownloadListener == null) {
                return null;
            }
            onDownloadListener.downloading(this.$length, this.$progress.element);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: HttpDownloadManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "com.azhon.appupdate.manager.HttpDownloadManager$connectToDownload$6", f = "HttpDownloadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.azhon.appupdate.manager.HttpDownloadManager$connectToDownload$6, reason: invalid class name */
    static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $file;
        final /* synthetic */ OnDownloadListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(OnDownloadListener onDownloadListener, File file, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$listener = onDownloadListener;
            this.$file = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.$listener, this.$file, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OnDownloadListener onDownloadListener = this.$listener;
            if (onDownloadListener == null) {
                return null;
            }
            onDownloadListener.done(this.$file);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: HttpDownloadManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "com.azhon.appupdate.manager.HttpDownloadManager$connectToDownload$7", f = "HttpDownloadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.azhon.appupdate.manager.HttpDownloadManager$connectToDownload$7, reason: invalid class name */
    static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HttpURLConnection $con;
        final /* synthetic */ OnDownloadListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(OnDownloadListener onDownloadListener, HttpURLConnection httpURLConnection, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.$listener = onDownloadListener;
            this.$con = httpURLConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.$listener, this.$con, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OnDownloadListener onDownloadListener = this.$listener;
            if (onDownloadListener == null) {
                return null;
            }
            onDownloadListener.error(new SocketTimeoutException(Intrinsics.stringPlus("Error: Http response code = ", Boxing.boxInt(this.$con.getResponseCode()))));
            return Unit.INSTANCE;
        }
    }

    @Override // com.azhon.appupdate.base.BaseHttpDownloadManager
    public void cancel() {
        this.shutdown = true;
        release();
    }

    @Override // com.azhon.appupdate.base.BaseHttpDownloadManager
    public void release() {
        Job job = this.job;
        if (job == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }
}
