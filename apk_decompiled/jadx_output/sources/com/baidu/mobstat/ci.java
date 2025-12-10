package com.baidu.mobstat;

/* loaded from: classes.dex */
public class ci extends ce {
    private static ci b = new ci();

    @Override // com.baidu.mobstat.ce
    public String a() {
        return "mtj.fulltrace";
    }

    @Override // com.baidu.mobstat.ce
    public boolean b() {
        return false;
    }

    private ci() {
    }

    public static ci c() {
        return b;
    }
}
