package com.core.base;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RxBus.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/core/base/RxBus;", "", "()V", "mBus", "Lio/reactivex/rxjava3/subjects/Subject;", "hasObservers", "", "post", "", "obj", "toObservable", "Lio/reactivex/rxjava3/core/Observable;", ExifInterface.GPS_DIRECTION_TRUE, "tClass", "Ljava/lang/Class;", "Companion", "Holder", "base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RxBus {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Subject<Object> mBus;

    public /* synthetic */ RxBus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RxBus() {
        Subject<T> serialized = PublishSubject.create().toSerialized();
        Intrinsics.checkNotNullExpressionValue(serialized, "create<Any>().toSerialized()");
        this.mBus = serialized;
    }

    public final void post(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.mBus.onNext(obj);
    }

    public final <T> Observable<T> toObservable(Class<T> tClass) {
        Observable<T> observable = (Observable<T>) this.mBus.ofType(tClass);
        Intrinsics.checkNotNullExpressionValue(observable, "mBus.ofType(tClass)");
        return observable;
    }

    public final Observable<Object> toObservable() {
        return this.mBus;
    }

    public final boolean hasObservers() {
        return this.mBus.hasObservers();
    }

    /* compiled from: RxBus.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/core/base/RxBus$Holder;", "", "()V", "BUS", "Lcom/core/base/RxBus;", "getBUS", "()Lcom/core/base/RxBus;", "base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class Holder {
        public static final Holder INSTANCE = new Holder();
        private static final RxBus BUS = new RxBus(null);

        private Holder() {
        }

        public final RxBus getBUS() {
            return BUS;
        }
    }

    /* compiled from: RxBus.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/core/base/RxBus$Companion;", "", "()V", "get", "Lcom/core/base/RxBus;", "base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RxBus get() {
            return Holder.INSTANCE.getBUS();
        }
    }
}
