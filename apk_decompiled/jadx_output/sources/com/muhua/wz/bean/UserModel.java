package com.muhua.wz.bean;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class UserModel {
    private int DeviceNumber;
    private int GId;
    private String GroupName;
    private String HeadPortrait;
    private String Mobile;
    private int ThirdId;
    private int UId;
    private String UserName;

    @SerializedName(alternate = {"Token"}, value = "token")
    private String token;

    public int getThirdId() {
        return this.ThirdId;
    }

    public String getHeadPortrait() {
        return this.HeadPortrait;
    }

    public String getUserName() {
        return this.UserName;
    }

    public String getGroupName() {
        return this.GroupName;
    }

    public int getUId() {
        return this.UId;
    }

    public int getDeviceNumber() {
        return this.DeviceNumber;
    }

    public int getGId() {
        return this.GId;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String getMobile() {
        return this.Mobile;
    }

    public void setMobile(String str) {
        this.Mobile = str;
    }
}
