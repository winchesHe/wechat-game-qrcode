package com.core.base.websocket;

import android.os.SystemClock;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.core.base.utils.Lg;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

/* loaded from: classes.dex */
public class RxWebSocketUtil {
    private static RxWebSocketUtil instance;
    private boolean showLog = false;
    private String logTag = "RxWebSocket";
    private long interval = 1;
    private TimeUnit reconnectIntervalTimeUnit = TimeUnit.SECONDS;
    private Map<String, Observable<WebSocketInfo>> observableMap = new ArrayMap();
    private Map<String, WebSocket> webSocketMap = new ArrayMap();
    private OkHttpClient client = new OkHttpClient();

    private RxWebSocketUtil() {
    }

    public static RxWebSocketUtil getInstance() {
        if (instance == null) {
            synchronized (RxWebSocketUtil.class) {
                if (instance == null) {
                    instance = new RxWebSocketUtil();
                }
            }
        }
        return instance;
    }

    public void setClient(OkHttpClient okHttpClient) {
        if (okHttpClient == null) {
            throw new NullPointerException(" Are you stupid ? client == null");
        }
        this.client = okHttpClient;
    }

    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        this.client = this.client.newBuilder().sslSocketFactory(sSLSocketFactory, x509TrustManager).build();
    }

    public void setShowLog(boolean z) {
        this.showLog = z;
    }

    public void setShowLog(boolean z, String str) {
        setShowLog(z);
        this.logTag = str;
    }

    public void setReconnectInterval(long j, TimeUnit timeUnit) {
        this.interval = j;
        this.reconnectIntervalTimeUnit = timeUnit;
    }

    public Observable<WebSocketInfo> getWebSocketInfo(final String str, long j, TimeUnit timeUnit) {
        Observable<WebSocketInfo> observable = this.observableMap.get(str);
        if (observable == null) {
            Observable<WebSocketInfo> observableShare = Observable.create(new WebSocketOnSubscribe(str)).timeout(j, timeUnit).retry().doOnDispose(new Action() { // from class: com.core.base.websocket.RxWebSocketUtil.2
                @Override // io.reactivex.rxjava3.functions.Action
                public void run() throws Throwable {
                    RxWebSocketUtil.this.observableMap.remove(str);
                    RxWebSocketUtil.this.webSocketMap.remove(str);
                    if (RxWebSocketUtil.this.showLog) {
                        Lg.d(RxWebSocketUtil.this.logTag, "unsubscribe");
                    }
                }
            }).doOnNext(new Consumer<WebSocketInfo>() { // from class: com.core.base.websocket.RxWebSocketUtil.1
                @Override // io.reactivex.rxjava3.functions.Consumer
                public void accept(WebSocketInfo webSocketInfo) throws Throwable {
                    if (webSocketInfo.isOnOpen()) {
                        RxWebSocketUtil.this.webSocketMap.put(str, webSocketInfo.getWebSocket());
                    }
                }
            }).share();
            this.observableMap.put(str, observableShare);
            return observableShare;
        }
        final WebSocket webSocket = this.webSocketMap.get(str);
        return webSocket != null ? observable.startWith(new ObservableSource<WebSocketInfo>() { // from class: com.core.base.websocket.RxWebSocketUtil.3
            @Override // io.reactivex.rxjava3.core.ObservableSource
            public void subscribe(Observer<? super WebSocketInfo> observer) {
                observer.onNext(new WebSocketInfo(webSocket, true));
            }
        }) : observable;
    }

    public Observable<WebSocketInfo> getWebSocketInfo(String str) {
        return getWebSocketInfo(str, 60L, TimeUnit.DAYS);
    }

    public Observable<String> getWebSocketString(String str) {
        return getWebSocketInfo(str).map(new Function<WebSocketInfo, String>() { // from class: com.core.base.websocket.RxWebSocketUtil.5
            @Override // io.reactivex.rxjava3.functions.Function
            public String apply(WebSocketInfo webSocketInfo) throws Throwable {
                return webSocketInfo.getString();
            }
        }).filter(new Predicate<String>() { // from class: com.core.base.websocket.RxWebSocketUtil.4
            @Override // io.reactivex.rxjava3.functions.Predicate
            public boolean test(String str2) throws Throwable {
                return str2 != null;
            }
        });
    }

    public Observable<ByteString> getWebSocketByteString(String str) {
        return getWebSocketInfo(str).map(new Function<WebSocketInfo, ByteString>() { // from class: com.core.base.websocket.RxWebSocketUtil.7
            @Override // io.reactivex.rxjava3.functions.Function
            public ByteString apply(WebSocketInfo webSocketInfo) throws Throwable {
                return webSocketInfo.getByteString();
            }
        }).filter(new Predicate<ByteString>() { // from class: com.core.base.websocket.RxWebSocketUtil.6
            @Override // io.reactivex.rxjava3.functions.Predicate
            public boolean test(ByteString byteString) throws Throwable {
                return byteString != null;
            }
        });
    }

    public Observable<WebSocket> getWebSocket(String str) {
        return getWebSocketInfo(str).map(new Function<WebSocketInfo, WebSocket>() { // from class: com.core.base.websocket.RxWebSocketUtil.8
            @Override // io.reactivex.rxjava3.functions.Function
            public WebSocket apply(WebSocketInfo webSocketInfo) throws Throwable {
                return webSocketInfo.getWebSocket();
            }
        });
    }

    public void send(String str, String str2) {
        WebSocket webSocket = this.webSocketMap.get(str);
        if (webSocket != null) {
            webSocket.send(str2);
            return;
        }
        throw new IllegalStateException("The WebSokcet not open");
    }

    public void send(String str, ByteString byteString) {
        WebSocket webSocket = this.webSocketMap.get(str);
        if (webSocket != null) {
            webSocket.send(byteString);
            return;
        }
        throw new IllegalStateException("The WebSokcet not open");
    }

    public void asyncSend(String str, final String str2) {
        getWebSocket(str).firstElement().subscribe(new Consumer<WebSocket>() { // from class: com.core.base.websocket.RxWebSocketUtil.9
            @Override // io.reactivex.rxjava3.functions.Consumer
            public void accept(WebSocket webSocket) throws Throwable {
                webSocket.send(str2);
            }
        });
    }

    public void asyncSend(String str, final ByteString byteString) {
        getWebSocket(str).firstElement().subscribe(new Consumer<WebSocket>() { // from class: com.core.base.websocket.RxWebSocketUtil.10
            @Override // io.reactivex.rxjava3.functions.Consumer
            public void accept(WebSocket webSocket) throws Throwable {
                webSocket.send(byteString);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Request getRequest(String str) {
        return new Request.Builder().get().url(str).build();
    }

    private final class WebSocketOnSubscribe implements ObservableOnSubscribe<WebSocketInfo> {
        private String url;
        private WebSocket webSocket;

        public WebSocketOnSubscribe(String str) {
            this.url = str;
        }

        @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<WebSocketInfo> observableEmitter) throws Throwable {
            if (this.webSocket != null && !"main".equals(Thread.currentThread().getName())) {
                long millis = RxWebSocketUtil.this.reconnectIntervalTimeUnit.toMillis(RxWebSocketUtil.this.interval);
                if (millis == 0) {
                    millis = 2000;
                }
                SystemClock.sleep(millis);
                observableEmitter.onNext(WebSocketInfo.createReconnect());
            }
            initWebSocket(observableEmitter);
        }

        private void initWebSocket(final ObservableEmitter<? super WebSocketInfo> observableEmitter) {
            this.webSocket = RxWebSocketUtil.this.client.newWebSocket(RxWebSocketUtil.this.getRequest(this.url), new WebSocketListener() { // from class: com.core.base.websocket.RxWebSocketUtil.WebSocketOnSubscribe.1
                @Override // okhttp3.WebSocketListener
                public void onOpen(WebSocket webSocket, Response response) {
                    if (RxWebSocketUtil.this.showLog) {
                        Log.d(RxWebSocketUtil.this.logTag, WebSocketOnSubscribe.this.url + " --> onOpen");
                    }
                    RxWebSocketUtil.this.webSocketMap.put(WebSocketOnSubscribe.this.url, webSocket);
                    if (observableEmitter.isDisposed()) {
                        return;
                    }
                    observableEmitter.onNext(new WebSocketInfo(webSocket, true));
                }

                @Override // okhttp3.WebSocketListener
                public void onMessage(WebSocket webSocket, String str) {
                    if (observableEmitter.isDisposed()) {
                        return;
                    }
                    observableEmitter.onNext(new WebSocketInfo(webSocket, str));
                }

                @Override // okhttp3.WebSocketListener
                public void onMessage(WebSocket webSocket, ByteString byteString) {
                    if (observableEmitter.isDisposed()) {
                        return;
                    }
                    observableEmitter.onNext(new WebSocketInfo(webSocket, byteString));
                }

                @Override // okhttp3.WebSocketListener
                public void onFailure(WebSocket webSocket, Throwable th, Response response) {
                    if (RxWebSocketUtil.this.showLog) {
                        Lg.e(RxWebSocketUtil.this.logTag, th.toString() + webSocket.getOriginalRequest().url().uri().getPath());
                    }
                    if (observableEmitter.isDisposed()) {
                        return;
                    }
                    observableEmitter.onError(th);
                }

                @Override // okhttp3.WebSocketListener
                public void onClosing(WebSocket webSocket, int i, String str) {
                    webSocket.close(1001, null);
                }

                @Override // okhttp3.WebSocketListener
                public void onClosed(WebSocket webSocket, int i, String str) {
                    if (RxWebSocketUtil.this.showLog) {
                        Log.d(RxWebSocketUtil.this.logTag, WebSocketOnSubscribe.this.url + " --> onClosed:code = " + i + ", reason = " + str);
                    }
                }
            });
            observableEmitter.setCancellable(new Cancellable() { // from class: com.core.base.websocket.RxWebSocketUtil.WebSocketOnSubscribe.2
                @Override // io.reactivex.rxjava3.functions.Cancellable
                public void cancel() throws Throwable {
                    if (RxWebSocketUtil.this.showLog) {
                        Log.d(RxWebSocketUtil.this.logTag, WebSocketOnSubscribe.this.url + " --> cancel ");
                    }
                }
            });
        }
    }
}
