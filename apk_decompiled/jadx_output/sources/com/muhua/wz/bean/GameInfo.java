package com.muhua.wz.bean;

import com.muhua.wz.Utils;

/* loaded from: classes.dex */
public class GameInfo {
    public String appId;
    public String bundleId;
    public String cls;
    public String help;
    public String icon;
    public String name;
    public String pkg;
    public String py;

    public GameInfo(String str, String str2, String str3) {
        this(str, str2, str3, str3, str3 + Utils.DEFAULT_ENTRY_CLASS_NAME, "1.打开要登录的游戏，注销当前登录。\n2.登录页如有用户协议等，勾选后游戏切换后台\n3.切换到扫码APP，出现二维码后点击分享给对方\n4.在扫码APP内等待对方扫码授权就可以自动跳转并登录游戏。\n5.如果跳转后没有自动登录，请杀掉游戏进程，重新打开游戏查看。\n6.如果还是没登录，请仔细检查步骤，步骤没错，那就是工具失效了。", "", "");
    }

    public GameInfo(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str3, str3 + Utils.DEFAULT_ENTRY_CLASS_NAME, str4, "", "");
    }

    public GameInfo(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3);
        this.icon = str4;
        this.py = str5;
    }

    public GameInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4);
        this.icon = str5;
        this.py = str6;
    }

    public GameInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.name = str;
        this.appId = str2;
        this.bundleId = str3;
        this.pkg = str4;
        this.cls = str5;
        this.help = str6;
        this.icon = str7;
        this.py = str8;
    }
}
