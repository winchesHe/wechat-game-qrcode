package com.core.base.utils;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes.dex */
public final class RxUtils {
    private RxUtils() {
        throw new UnsupportedOperationException("RxUtils not support initialize.");
    }

    public static <T> FlowableTransformer<T, T> _ioMain() {
        return new FlowableTransformer() { // from class: com.core.base.utils.RxUtils$$ExternalSyntheticLambda0
            @Override // io.reactivex.rxjava3.core.FlowableTransformer
            public final Publisher apply(Flowable flowable) {
                return flowable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

    public static <T> SingleTransformer<T, T> __ioMain() {
        return new SingleTransformer() { // from class: com.core.base.utils.RxUtils$$ExternalSyntheticLambda1
            @Override // io.reactivex.rxjava3.core.SingleTransformer
            public final SingleSource apply(Single single) {
                return single.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

    public static <T> ObservableTransformer<T, T> ioMain() {
        return new ObservableTransformer() { // from class: com.core.base.utils.RxUtils$$ExternalSyntheticLambda2
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource apply(Observable observable) {
                return observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

    public static void unSubscribe(Subscription subscription) {
        if (subscription != null) {
            subscription.cancel();
        }
    }

    public static void unSubscribe(Disposable disposable) {
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        disposable.dispose();
    }

    public static void unSubscribe(Subscription... subscriptionArr) {
        for (Subscription subscription : subscriptionArr) {
            unSubscribe(subscription);
        }
    }

    public static void unSubscribe(Disposable... disposableArr) {
        for (Disposable disposable : disposableArr) {
            unSubscribe(disposable);
        }
    }

    public static void unSubscribe(List<Disposable> list) {
        Iterator<Disposable> it = list.iterator();
        while (it.hasNext()) {
            unSubscribe(it.next());
        }
    }
}
