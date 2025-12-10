package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mobstat.Session;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SessionAnalysis {
    private boolean a = false;
    private Map<String, a> b = new HashMap();
    private a c = new a();
    private a d = new a();
    private boolean e = false;
    private long f = 0;
    private Session g = new Session();
    private int h = 0;
    private int i = 0;
    private long j = 0;
    private boolean k = true;
    private LaunchInfo l;
    private LaunchInfo m;
    public Callback mCallback;

    public interface Callback {
        void onCallback(JSONObject jSONObject);
    }

    public void doSendNewSessionLog(Context context) {
    }

    public SessionAnalysis() {
    }

    public SessionAnalysis(Callback callback) {
        this.mCallback = callback;
    }

    public void setSessionTimeOut(int i) {
        if (i < 1) {
            cg.c().b("[WARNING] SessionTimeout should be between 1 and 600. Default value[30] is used");
            i = 30;
        } else if (i > 600) {
            cg.c().b("[WARNING] SessionTimeout should be between 1 and 600. Default value[600] is used");
            i = 600;
        }
        this.h = i * 1000;
    }

    public int getSessionTimeOut() {
        if (this.h <= 0) {
            this.h = 30000;
        }
        return this.h;
    }

    public long getSessionStartTime() {
        return this.g.getStartTime();
    }

    public JSONObject getPageSessionHead() {
        return this.g.getPageSessionHead();
    }

    public int getSessionSize() {
        return this.i;
    }

    public void doSendLogCheck(Context context, long j) {
        long j2 = this.f;
        if (j2 <= 0 || j - j2 <= getSessionTimeOut()) {
            return;
        }
        a(context, -1L, false, false, 0);
    }

    public void setAutoSend(boolean z) {
        this.k = z;
    }

    public void autoTrackLaunchInfo(LaunchInfo launchInfo, boolean z) {
        if (z) {
            this.l = launchInfo;
        } else {
            this.m = launchInfo;
        }
    }

    public void autoTrackSessionStartTime(Context context, long j) {
        if (context == null) {
            return;
        }
        this.g.setTrackStartTime(j);
        this.j = j;
    }

    public void autoTrackSessionEndTime(Context context, long j) {
        if (context == null) {
            return;
        }
        this.g.setTrackEndTime(j);
        a(context);
    }

    public void onSessionStart(Context context, long j, boolean z) {
        if (this.a) {
            return;
        }
        DataCore.instance().init(context);
        LaunchInfo launchInfo = this.l;
        a(context, j, z, true, launchInfo != null ? launchInfo.getLaunchType(context) : 0);
        this.a = true;
    }

    public void onPageStart(Context context, String str, int i, long j) {
        a aVarA;
        onSessionStart(context, j, false);
        if (TextUtils.isEmpty(str) || (aVarA = a(str)) == null) {
            return;
        }
        if (aVarA.c) {
            cg.c().c("[WARNING] 遗漏StatService.onPageEnd(), 请检查邻近页面埋点: " + str);
        }
        if (!this.e) {
            a(context, this.f, j, i, 3);
            this.e = true;
        }
        aVarA.c = true;
        aVarA.b = j;
    }

    public void onPageEnd(Context context, String str, String str2, String str3, long j, ExtraInfo extraInfo, boolean z) {
        a aVarA;
        this.e = false;
        if (TextUtils.isEmpty(str) || (aVarA = a(str)) == null) {
            return;
        }
        if (!aVarA.c) {
            cg.c().c("[WARNING] 遗漏StatService.onPageStart(), 请检查邻近页面埋点: " + str);
            return;
        }
        a(context, aVarA.a, str, aVarA.b, j, str2, "", str3, false, extraInfo, z);
        b(str);
        this.f = j;
    }

    public void onPageStartAct(Context context, String str, long j, boolean z) {
        onSessionStart(context, j, false);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a aVar = z ? this.d : this.c;
        if (aVar.c && !z) {
            cg.c().c("[WARNING] 遗漏StatService.onPause(Activity), 请检查邻近页面埋点: " + str);
        }
        if (!this.e) {
            a(context, this.f, j, 1, 1);
            this.e = true;
        }
        aVar.c = true;
        aVar.a = str;
        aVar.b = j;
    }

    public void onPageEndAct(Context context, String str, String str2, String str3, long j, boolean z, ExtraInfo extraInfo) {
        this.e = false;
        a aVar = z ? this.d : this.c;
        if (aVar.c) {
            a(context, aVar.a, str, aVar.b, j, str2, str3, str, z, extraInfo, false);
            aVar.c = false;
            this.f = j;
        } else {
            if (z) {
                return;
            }
            cg.c().c("[WARNING] 遗漏StatService.onResume(Activity), 请检查邻近页面埋点: " + str);
        }
    }

    public void onPageStartFrag(Context context, String str, long j) {
        onSessionStart(context, j, false);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a aVarA = a(str);
        if (aVarA.c) {
            cg.c().c("[WARNING] 遗漏StatService.onPause(Fragment), 请检查邻近页面埋点: " + str);
        }
        a(context, this.f, j, 2, 2);
        aVarA.c = true;
        aVarA.a = str;
        aVarA.b = j;
    }

    public void onPageEndFrag(Context context, String str, String str2, String str3, long j) {
        a aVarA;
        if (TextUtils.isEmpty(str) || (aVarA = a(str)) == null) {
            return;
        }
        if (!aVarA.c) {
            cg.c().c("[WARNING] 遗漏StatService.onResume(Fragment), 请检查邻近页面埋点: " + str);
            return;
        }
        a(context, aVarA.a, str, aVarA.b, j, str2, str3, null, false, null, false);
        b(str);
        this.f = j;
    }

    private void a(Context context, long j, long j2, int i, int i2) {
        if (j2 - j > ((long) getSessionTimeOut())) {
            if (j > 0) {
                if (2 == i2) {
                    this.g.setEndTime(j);
                }
                LaunchInfo launchInfo = this.m;
                a(context, j2, false, false, launchInfo != null ? launchInfo.getLaunchType(context) : 0);
            }
            this.g.setTrackStartTime(this.j);
            this.g.setInvokeType(i);
        }
    }

    private void a(Context context, String str, String str2, long j, long j2, String str3, String str4, String str5, boolean z, ExtraInfo extraInfo, boolean z2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2)) {
            return;
        }
        this.g.addPageView(new Session.a(str3, str4, str5, j2 - j, j, z, extraInfo, z2, DataCore.instance().getPagePy()));
        this.g.setEndTime(j2);
        a(context);
        if (TextUtils.isEmpty(DataCore.instance().getTempPyd())) {
            return;
        }
        DataCore.instance().flush(context);
    }

    private a a(String str) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, new a(str));
        }
        return this.b.get(str);
    }

    private void a(Context context, long j, boolean z, boolean z2, int i) {
        if (this.g.hasEnd()) {
            DataCore.instance().putSession(this.g);
            DataCore.instance().flush(context);
            cb.a(this.g.getPageSessionHead());
            this.g.setEndTime(0L);
        }
        boolean z3 = j > 0;
        long startTime = z3 ? j : this.g.getStartTime();
        if (z3) {
            this.g.reset();
            this.g.setStartTime(j);
        }
        DataCore.instance().saveLogData(context, z3, z, startTime, z2, null);
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onCallback(DataCore.instance().getLogData());
        }
        if (z3 || this.k) {
            LogSender.instance().onSend(context);
        }
        clearLastSessionCache(context);
    }

    private void a(Context context) {
        if (this.g.hasStart()) {
            String string = this.g.constructJSONObject().toString();
            this.i = string.getBytes().length;
            cn.a(context, cw.q(context) + Config.LAST_SESSION_FILE_NAME, string, false);
        }
    }

    public void clearLastSessionCache(Context context) {
        if (context == null) {
            return;
        }
        cn.a(context, cw.q(context) + Config.LAST_SESSION_FILE_NAME, new JSONObject().toString(), false);
    }

    private void b(String str) {
        if (!TextUtils.isEmpty(str) && this.b.containsKey(str)) {
            this.b.remove(str);
        }
    }

    public boolean isSessionStart() {
        return this.g.getStartTime() > 0;
    }

    static class a {
        String a;
        long b;
        boolean c = false;

        public a() {
        }

        public a(String str) {
            this.a = str;
        }
    }
}
