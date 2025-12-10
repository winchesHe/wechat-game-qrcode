package com.core.base.websocket;

import okhttp3.WebSocket;
import okio.ByteString;

/* loaded from: classes.dex */
public class WebSocketInfo {
    private ByteString mByteString;
    private String mString;
    private WebSocket mWebSocket;
    private boolean onOpen;
    private boolean onReconnect;

    private WebSocketInfo() {
    }

    WebSocketInfo(WebSocket webSocket, boolean z) {
        this.mWebSocket = webSocket;
        this.onOpen = z;
    }

    WebSocketInfo(WebSocket webSocket, String str) {
        this.mWebSocket = webSocket;
        this.mString = str;
    }

    WebSocketInfo(WebSocket webSocket, ByteString byteString) {
        this.mWebSocket = webSocket;
        this.mByteString = byteString;
    }

    static WebSocketInfo createReconnect() {
        WebSocketInfo webSocketInfo = new WebSocketInfo();
        webSocketInfo.onReconnect = true;
        return webSocketInfo;
    }

    public WebSocket getWebSocket() {
        return this.mWebSocket;
    }

    public void setWebSocket(WebSocket webSocket) {
        this.mWebSocket = webSocket;
    }

    public String getString() {
        return this.mString;
    }

    public void setString(String str) {
        this.mString = str;
    }

    public ByteString getByteString() {
        return this.mByteString;
    }

    public void setByteString(ByteString byteString) {
        this.mByteString = byteString;
    }

    public boolean isOnOpen() {
        return this.onOpen;
    }

    public boolean isOnReconnect() {
        return this.onReconnect;
    }
}
