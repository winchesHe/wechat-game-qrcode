package com.baidu.mobstat;

/* loaded from: classes.dex */
public class cg extends ce {
    private static cg c = new cg();
    private boolean b;

    @Override // com.baidu.mobstat.ce
    public String a() {
        return "BaiduMobStat";
    }

    private cg() {
    }

    public static cg c() {
        return c;
    }

    public void a(boolean z) {
        this.b = z;
    }

    @Override // com.baidu.mobstat.ce
    public boolean b() {
        return this.b;
    }
}
