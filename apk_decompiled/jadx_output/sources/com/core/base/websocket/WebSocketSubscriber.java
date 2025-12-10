package com.core.base.websocket;

import io.reactivex.rxjava3.core.Observer;
import okhttp3.WebSocket;
import okio.ByteString;

/* loaded from: classes.dex */
public abstract class WebSocketSubscriber implements Observer<WebSocketInfo> {
    private boolean hasOpened;

    protected void onClose() {
    }

    protected void onMessage(String str) {
    }

    protected void onMessage(WebSocket webSocket, ByteString byteString) {
    }

    protected void onMessage(ByteString byteString) {
    }

    protected void onOpen(WebSocket webSocket) {
    }

    protected void onReconnect() {
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(WebSocketInfo webSocketInfo) {
        if (webSocketInfo.isOnOpen()) {
            this.hasOpened = true;
            onOpen(webSocketInfo.getWebSocket());
        } else {
            if (webSocketInfo.getString() != null) {
                onMessage(webSocketInfo.getString());
                return;
            }
            if (webSocketInfo.getByteString() != null) {
                onMessage(webSocketInfo.getByteString());
                onMessage(webSocketInfo.getWebSocket(), webSocketInfo.getByteString());
            } else if (webSocketInfo.isOnReconnect()) {
                onReconnect();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (this.hasOpened) {
            onClose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th) {
        th.printStackTrace();
    }
}
