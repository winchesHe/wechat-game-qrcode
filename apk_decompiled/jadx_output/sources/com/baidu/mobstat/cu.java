package com.baidu.mobstat;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cu {
    private static volatile cu b;
    private static OnAppBackgroundListener k;
    private String f;
    private String g;
    private static final Pattern c = Pattern.compile("\\s*|\t|\r|\n");
    private static boolean i = true;
    private static boolean j = false;
    private static boolean l = true;
    private List<PermissionEnum> d = new ArrayList();
    private String e = "android.permission.APP_LIST";
    public final int a = 100;
    private List<JSONObject> h = new ArrayList();

    public static cu a() {
        if (b == null) {
            synchronized (cu.class) {
                if (b == null) {
                    b = new cu();
                }
            }
        }
        return b;
    }

    public void a(String str) {
        this.g = str;
    }

    public String b() {
        return TextUtils.isEmpty(this.f) ? "" : cw.a(c.matcher(this.f).replaceAll(""));
    }

    public boolean c() {
        return a(true);
    }

    public boolean a(boolean z) {
        if (z) {
            return i && !e();
        }
        return i;
    }

    public void b(boolean z) {
        i = z;
    }

    private boolean e() {
        OnAppBackgroundListener onAppBackgroundListener = k;
        if (onAppBackgroundListener != null) {
            return onAppBackgroundListener.isBackground();
        }
        return j;
    }

    public void a(OnAppBackgroundListener onAppBackgroundListener) {
        k = onAppBackgroundListener;
    }

    public boolean d() {
        return l;
    }

    public void c(boolean z) {
        l = z;
    }
}
