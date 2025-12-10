package com.core.base.event;

/* loaded from: classes.dex */
public class RestartDeviceEvent {
    String deviceId;

    public String getDeviceId() {
        return this.deviceId;
    }

    public RestartDeviceEvent(String str) {
        this.deviceId = str;
    }
}
