package com.baidu.mobstat;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.muhua.wz.fragment.WebViewFragment;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ck {
    private static String a;
    private WeakReference<WebView> b;
    private WeakReference<Activity> c;
    private JSONObject d;
    private boolean e;

    @JavascriptInterface
    public void setViewportTreeToNative(String str) {
        if (ch.c().b()) {
            ch.c().a("setViewportTreeToNative " + str);
        }
        a = str;
    }

    @JavascriptInterface
    public void setEventToNative(String str) throws JSONException, Resources.NotFoundException {
        Activity activity;
        WeakReference<WebView> weakReference;
        WebView webView;
        if (ch.c().b() && this.e) {
            ch.c().a("setEventToNative: " + str);
        }
        if (ci.c().b()) {
            ci.c().a("setEventToNative: " + str);
        }
        WeakReference<Activity> weakReference2 = this.c;
        if (weakReference2 == null || (activity = weakReference2.get()) == null || (weakReference = this.b) == null || (webView = weakReference.get()) == null) {
            return;
        }
        a(str, activity, webView);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r37, android.app.Activity r38, android.webkit.WebView r39) throws org.json.JSONException, android.content.res.Resources.NotFoundException {
        /*
            r36 = this;
            r6 = r36
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L28
            r2 = r37
            r1.<init>(r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = "h3"
            org.json.JSONArray r2 = r1.optJSONArray(r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r3 = "p2"
            java.lang.String r3 = r1.optString(r3)     // Catch: java.lang.Exception -> L26
            java.lang.String r4 = "l"
            java.lang.String r4 = r1.optString(r4)     // Catch: java.lang.Exception -> L24
            java.lang.String r5 = "point"
            org.json.JSONObject r0 = r1.optJSONObject(r5)     // Catch: java.lang.Exception -> L2b
            r1 = 1
            goto L2c
        L24:
            r4 = r0
            goto L2b
        L26:
            r3 = r0
            goto L2a
        L28:
            r2 = r0
            r3 = r2
        L2a:
            r4 = r3
        L2b:
            r1 = 0
        L2c:
            r22 = r0
            r26 = r2
            r25 = r4
            if (r1 != 0) goto L35
            return
        L35:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L40
            java.lang.String r0 = "/"
            r27 = r0
            goto L42
        L40:
            r27 = r3
        L42:
            org.json.JSONArray r28 = com.baidu.mobstat.cj.a(r38, r39)
            java.lang.Class r0 = r38.getClass()
            java.lang.String r29 = r0.getName()
            java.lang.String r4 = com.baidu.mobstat.cj.a(r28)
            java.lang.String r5 = com.baidu.mobstat.cj.b(r26)
            java.lang.String r30 = com.baidu.mobstat.cj.d(r39)
            java.util.Map r31 = com.baidu.mobstat.cj.e(r39)
            android.content.Context r32 = r38.getApplicationContext()
            java.lang.String r33 = ""
            long r34 = java.lang.System.currentTimeMillis()
            org.json.JSONObject r1 = r6.d
            java.lang.Class r0 = r38.getClass()
            java.lang.String r2 = r0.getName()
            r0 = r36
            r3 = r27
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L9d
            com.baidu.mobstat.BDStatCore r7 = com.baidu.mobstat.BDStatCore.instance()
            r11 = 1
            long r12 = java.lang.System.currentTimeMillis()
            r20 = 1
            r8 = r32
            r9 = r33
            r10 = r25
            r14 = r28
            r15 = r26
            r16 = r29
            r17 = r27
            r18 = r30
            r19 = r31
            r7.onEvent(r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20)
            goto Lb4
        L9d:
            com.baidu.mobstat.ch r0 = com.baidu.mobstat.ch.c()
            boolean r0 = r0.b()
            if (r0 == 0) goto Lb4
            boolean r0 = r6.e
            if (r0 == 0) goto Lb4
            com.baidu.mobstat.ch r0 = com.baidu.mobstat.ch.c()
            java.lang.String r1 = "setEventToNative: not circle event, will not take effect"
            r0.a(r1)
        Lb4:
            com.baidu.mobstat.cc r7 = com.baidu.mobstat.cc.a()
            java.lang.String r11 = ""
            r12 = 1
            r21 = 1
            java.lang.String r23 = ""
            r24 = 0
            r8 = r32
            r9 = r33
            r10 = r25
            r13 = r34
            r15 = r29
            r16 = r28
            r17 = r27
            r18 = r26
            r19 = r30
            r20 = r31
            r7.a(r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mobstat.ck.a(java.lang.String, android.app.Activity, android.webkit.WebView):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        int i = 0;
        if (jSONObject == null || jSONObject.toString().equals(new JSONObject().toString()) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            return false;
        }
        try {
            if (((JSONObject) jSONObject.get("meta")).getInt("matchAll") != 0) {
                return true;
            }
        } catch (Exception unused) {
        }
        try {
            JSONArray jSONArray = (JSONArray) jSONObject.get("data");
            boolean z = false;
            while (i < jSONArray.length()) {
                try {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                    String strOptString = jSONObject2.optString("page");
                    String strOptString2 = jSONObject2.optString("layout");
                    String str5 = (String) jSONObject2.opt(WebViewFragment.URL);
                    String str6 = (String) jSONObject2.opt("webLayout");
                    if (str.equals(strOptString) && str2.equals(str5) && str3.equals(strOptString2) && str4.equals(str6)) {
                        z = true;
                    }
                    i++;
                } catch (Exception unused2) {
                    i = z ? 1 : 0;
                    return i;
                }
            }
            return z;
        } catch (Exception unused3) {
        }
    }
}
