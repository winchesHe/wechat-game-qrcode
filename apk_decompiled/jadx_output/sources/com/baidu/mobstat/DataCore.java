package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mobstat.StatService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class DataCore {
    private static JSONObject a = new JSONObject();
    private static String b = "";
    private static DataCore c = new DataCore();
    private StatService.WearListener i;
    private JSONObject j;
    private JSONArray d = new JSONArray();
    private JSONArray e = new JSONArray();
    private JSONArray f = new JSONArray();
    private boolean g = false;
    private volatile int h = 0;
    private Object k = new Object();
    private boolean l = false;
    private HashMap<String, String> m = new HashMap<>();
    private List<String> n = Collections.synchronizedList(new ArrayList());
    private JSONObject o = new JSONObject();

    private void a(Context context, JSONObject jSONObject) {
    }

    private void b(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
    }

    private void b(JSONObject jSONObject) {
    }

    public void sendDataForDueros(Context context) {
    }

    public static DataCore instance() {
        return c;
    }

    private DataCore() {
    }

    public void init(Context context) {
        instance().loadStatData(context);
        instance().loadLastSession(context);
        instance().installHeader(context);
    }

    public void updatePyd(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            b = str;
        } catch (Exception unused) {
        }
    }

    public void loadProperty(Context context) {
        String strQ = cp.a().q(context);
        if (!TextUtils.isEmpty(strQ)) {
            HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(strQ);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArray = (JSONArray) jSONObject.get(next);
                    if (jSONArray != null && jSONArray.length() > 0) {
                        map.put(next, jSONArray.optString(0));
                    }
                }
            } catch (Exception unused) {
            }
            if (map.size() > 0) {
                setPydProperty(context, cx.a(map), "1", "1");
            }
        }
        String strN = cp.a().n(context);
        if (TextUtils.isEmpty(strN)) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("uid_", strN);
        setPydProperty(context, cx.a(map2), "1", PropertyType.UID_PROPERTRY);
    }

    public int getCacheFileSzie() {
        return this.h;
    }

    public JSONObject getLogData() {
        return this.j;
    }

    public void putSession(Session session) {
        putSession(session.constructJSONObject());
    }

    public void putSession(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (a(jSONObject.toString())) {
            cg.c().b("[WARNING] data to put exceed limit, ignored");
            return;
        }
        synchronized (this.d) {
            try {
                this.d.put(this.d.length(), jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public void putSession(String str) {
        if (TextUtils.isEmpty(str) || str.equals(new JSONObject().toString())) {
            return;
        }
        try {
            putSession(new JSONObject(str));
        } catch (JSONException unused) {
        }
    }

    private boolean a(String str) {
        return (str.getBytes().length + BDStatCore.instance().getSessionSize()) + this.h > 184320;
    }

    public void putEvent(Context context, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (a(jSONObject.toString())) {
            cg.c().b("[WARNING] data to put exceed limit, ignored");
            return;
        }
        synchronized (this.e) {
            EventAnalysis.doEventMerge(this.e, jSONObject);
        }
    }

    public void installHeader(Context context) {
        synchronized (a) {
            CooperService.instance().getHeadObject().installHeader(context, a);
        }
    }

    public void flush(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            synchronized (this.d) {
                jSONObject.put(Config.PRINCIPAL_PART, new JSONArray(this.d.toString()));
            }
            synchronized (this.e) {
                jSONObject.put(Config.EVENT_PART, new JSONArray(this.e.toString()));
            }
            synchronized (a) {
                jSONObject.put(Config.HEADER_PART, new JSONObject(a.toString()));
            }
            jSONObject.put(Config.PYD, b);
        } catch (Exception unused) {
        }
        String string = jSONObject.toString();
        if (a()) {
            cg.c().a("[WARNING] stat cache exceed 184320 Bytes, ignored");
            return;
        }
        int length = string.getBytes().length;
        if (length >= 184320) {
            a(true);
            return;
        }
        this.h = length;
        cn.a(context, cw.q(context) + Config.STAT_CACHE_FILE_NAME, string, false);
        synchronized (this.f) {
            cn.a(context, Config.LAST_AP_INFO_FILE_NAME, this.f.toString(), false);
        }
    }

    private void a(boolean z) {
        this.g = z;
    }

    private boolean a() {
        return this.g;
    }

    public void loadLastSession(Context context) {
        if (context == null) {
            return;
        }
        String str = cw.q(context) + Config.LAST_SESSION_FILE_NAME;
        if (cn.c(context, str)) {
            String strA = cn.a(context, str);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            cn.a(context, str, new JSONObject().toString(), false);
            putSession(strA);
            flush(context);
        }
    }

    public void loadWifiData(Context context) {
        if (context != null && cn.c(context, Config.LAST_AP_INFO_FILE_NAME)) {
            try {
                JSONArray jSONArray = new JSONArray(cn.a(context, Config.LAST_AP_INFO_FILE_NAME));
                int length = jSONArray.length();
                if (length >= 10) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = length - 10; i < length; i++) {
                        jSONArray2.put(jSONArray.get(i));
                    }
                    jSONArray = jSONArray2;
                }
                String strM = cw.m(1, context);
                if (!TextUtils.isEmpty(strM)) {
                    jSONArray.put(strM);
                }
                synchronized (this.f) {
                    this.f = jSONArray;
                }
            } catch (JSONException unused) {
            }
        }
    }

    public void loadStatData(Context context) throws JSONException {
        JSONObject jSONObject;
        if (context == null) {
            return;
        }
        String str = cw.q(context) + Config.STAT_CACHE_FILE_NAME;
        if (cn.c(context, str)) {
            String strA = cn.a(context, str);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            try {
                jSONObject = new JSONObject(strA);
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(Config.PRINCIPAL_PART);
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jCurrentTimeMillis - jSONObject2.getLong("s") <= Config.MAX_LOG_DATA_EXSIT_TIME) {
                            putSession(jSONObject2);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
            try {
                JSONArray jSONArray2 = jSONObject.getJSONArray(Config.EVENT_PART);
                if (jSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                        if (jCurrentTimeMillis - jSONObject3.getLong("t") <= Config.MAX_LOG_DATA_EXSIT_TIME) {
                            putEvent(context, jSONObject3);
                        }
                    }
                }
            } catch (Exception unused3) {
            }
            try {
                JSONObject jSONObject4 = jSONObject.getJSONObject(Config.HEADER_PART);
                if (jSONObject4 != null) {
                    synchronized (a) {
                        a = jSONObject4;
                    }
                }
            } catch (Exception unused4) {
            }
            try {
                String strOptString = jSONObject.optString(Config.PYD);
                if (TextUtils.isEmpty(strOptString)) {
                    strOptString = "";
                }
                b = strOptString;
            } catch (Exception unused5) {
            }
        }
    }

    public String constructLogWithEmptyBody(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        HeadObject headObject = CooperService.instance().getHeadObject();
        if (TextUtils.isEmpty(headObject.e)) {
            headObject.installHeader(context, jSONObject2);
        } else {
            headObject.updateHeader(context, jSONObject2);
        }
        JSONArray jSONArray = new JSONArray();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject2.put("t", jCurrentTimeMillis);
            jSONObject2.put("ss", jCurrentTimeMillis);
            jSONObject2.put(Config.WIFI_LOCATION, jSONArray);
            jSONObject2.put(Config.SEQUENCE_INDEX, 0);
            jSONObject2.put("sign", CooperService.instance().getUUID());
            jSONObject2.put(Config.APP_KEY, str);
            jSONObject.put(Config.HEADER_PART, jSONObject2);
            jSONObject.put(Config.PRINCIPAL_PART, jSONArray);
            jSONObject.put(Config.EVENT_PART, jSONArray);
            jSONObject.put(Config.EXCEPTION_PART, jSONArray);
            return jSONObject.toString();
        } catch (JSONException | Exception unused) {
            return null;
        }
    }

    private void a(Context context, JSONObject jSONObject, boolean z) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        boolean z2 = true;
        try {
            jSONObject2.put(Config.TRACE_APPLICATION_SESSION, z ? 1 : 0);
        } catch (Exception unused) {
        }
        try {
            jSONObject2.put(Config.TRACE_FAILED_CNT, 0);
        } catch (Exception unused2) {
        }
        try {
            jSONObject2.put(Config.TRACE_CIRCLE, bz.a());
        } catch (Exception unused3) {
        }
        try {
            jSONObject.put(Config.TRACE_PART, jSONObject2);
        } catch (Exception unused4) {
            z2 = false;
        }
        if (z2) {
            a(context, jSONObject, jSONObject2);
        }
    }

    private void a(Context context, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3;
        int iA = a(jSONObject);
        try {
            jSONObject3 = jSONObject.getJSONObject(Config.HEADER_PART);
        } catch (Exception unused) {
        }
        long j = jSONObject3 != null ? jSONObject3.getLong("ss") : 0L;
        a(context, jSONObject2, j == 0 ? System.currentTimeMillis() : j, iA);
    }

    private int a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return 0;
        }
        try {
            jSONObject2 = jSONObject.getJSONObject(Config.HEADER_PART);
        } catch (Exception unused) {
        }
        int i = (jSONObject2.getLong("ss") <= 0 || jSONObject2.getLong(Config.SEQUENCE_INDEX) != 0) ? 0 : 1;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(Config.PRINCIPAL_PART);
            if (jSONArray != null && jSONArray.length() != 0) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject3 = (JSONObject) jSONArray.get(i2);
                    long j = jSONObject3.getLong("c");
                    if (jSONObject3.getLong("e") != 0 && j == 0) {
                        i++;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return i;
    }

    private void a(Context context, JSONObject jSONObject, long j, int i) throws JSONException {
        long jLongValue;
        String str;
        String str2;
        long jIntValue;
        Object jSONArray;
        String[] strArrSplit;
        long jLongValue2 = by.a().b(context).longValue();
        if (jLongValue2 <= 0 && i != 0) {
            by.a().a(context, j);
            jLongValue2 = j;
        }
        a(jSONObject, Config.TRACE_VISIT_FIRST, Long.valueOf(jLongValue2));
        if (i != 0) {
            long jLongValue3 = by.a().c(context).longValue();
            jLongValue = j - jLongValue3;
            if (jLongValue3 != 0 && jLongValue <= 0) {
                jLongValue = -1;
            } else if (jLongValue3 == 0) {
                jLongValue = 0;
            }
            by.a().b(context, j);
            by.a().c(context, jLongValue);
        } else {
            jLongValue = by.a().d(context).longValue();
        }
        a(jSONObject, Config.TRACE_VISIT_SESSION_LAST_INTERVAL, Long.valueOf(jLongValue));
        String strE = by.a().e(context);
        int iIntValue = 0;
        if (TextUtils.isEmpty(strE) || !strE.contains(Config.TRACE_TODAY_VISIT_SPLIT) || (strArrSplit = strE.split(Config.TRACE_TODAY_VISIT_SPLIT)) == null || strArrSplit.length != 2) {
            str = "";
            str2 = "";
        } else {
            str = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                iIntValue = Integer.valueOf(str2).intValue();
            } catch (Exception unused) {
            }
        }
        String strA = cx.a(j);
        int i2 = (TextUtils.isEmpty(str) || strA.equals(str)) ? i + iIntValue : i;
        if (i != 0) {
            by.a().a(context, strA + Config.TRACE_TODAY_VISIT_SPLIT + i2);
        }
        a(jSONObject, Config.TRACE_VISIT_SESSION_TODAY_COUNT, Integer.valueOf(i2));
        if (TextUtils.isEmpty(str)) {
            jIntValue = 0;
        } else {
            try {
                jIntValue = Integer.valueOf(str).intValue();
            } catch (Exception unused2) {
            }
        }
        if (jIntValue != 0 && !TextUtils.isEmpty(str) && !strA.equals(str) && i != 0) {
            JSONArray jSONArrayA = a(context, jIntValue, iIntValue);
            by.a().b(context, jSONArrayA.toString());
            a(jSONObject, Config.TRACE_VISIT_RECENT, jSONArrayA);
            return;
        }
        String strF = by.a().f(context);
        if (TextUtils.isEmpty(strF)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(strF);
            } catch (Exception unused3) {
            }
        }
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        a(jSONObject, Config.TRACE_VISIT_RECENT, jSONArray);
    }

    private JSONArray a(Context context, long j, long j2) throws JSONException {
        List arrayList = new ArrayList();
        String strF = by.a().f(context);
        boolean z = false;
        if (!TextUtils.isEmpty(strF)) {
            try {
                JSONArray jSONArray = new JSONArray(strF);
                if (jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add((JSONObject) jSONArray.get(i));
                    }
                }
            } catch (Exception unused) {
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            if (((JSONObject) it.next()).getLong(Config.TRACE_VISIT_RECENT_DAY) == j) {
                break;
            }
        }
        if (z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Config.TRACE_VISIT_RECENT_DAY, j);
                jSONObject.put(Config.TRACE_VISIT_RECENT_COUNT, j2);
                arrayList.add(jSONObject);
            } catch (Exception unused2) {
            }
        }
        int size = arrayList.size();
        if (size > 5) {
            arrayList = arrayList.subList(size - 5, size);
        }
        return new JSONArray((Collection) arrayList);
    }

    private void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        if (!jSONObject.has(Config.TRACE_VISIT)) {
            try {
                jSONObject.put(Config.TRACE_VISIT, new JSONObject());
            } catch (Exception unused) {
            }
        }
        try {
            ((JSONObject) jSONObject.get(Config.TRACE_VISIT)).put(str, obj);
        } catch (Exception unused2) {
        }
    }

    public void saveLogDataAndSendForRaven(Context context) {
        synchronized (this.k) {
        }
    }

    public void saveLogData(Context context, boolean z, boolean z2, long j, boolean z3) {
        saveLogData(context, z, z2, j, z3, null);
    }

    public void saveLogData(Context context, boolean z, boolean z2, long j, boolean z3, JSONObject jSONObject) {
        HeadObject headObject = CooperService.instance().getHeadObject();
        if (headObject != null) {
            synchronized (a) {
                if (TextUtils.isEmpty(headObject.e)) {
                    headObject.installHeader(context, a);
                } else {
                    headObject.updateHeader(context, a);
                }
            }
            if (TextUtils.isEmpty(headObject.e)) {
                cg.c().c("[WARNING] 无法找到有效APP Key, 请参考文档配置");
                return;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        synchronized (a) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                String strOptString = a.optString("at");
                String strOptString2 = a.optString(Config.CUSTOM_USER_ID);
                if (!TextUtils.isEmpty(strOptString) && strOptString.equals(PropertyType.UID_PROPERTRY)) {
                    if (!strOptString2.equals(CooperService.instance().getLastUserId(context))) {
                        a.put(Config.UID_CHANGE, strOptString2);
                    } else {
                        a.put(Config.UID_CHANGE, "");
                    }
                    CooperService.instance().setLastUserId(context, strOptString2);
                }
                a.put("t", jCurrentTimeMillis);
                a.put(Config.SEQUENCE_INDEX, z ? 0 : 1);
                a.put("ss", j);
                synchronized (this.f) {
                    a.put(Config.WIFI_LOCATION, this.f);
                }
                a.put("sign", CooperService.instance().getUUID());
                b(context, a, jSONObject);
                jSONObject2.put(Config.HEADER_PART, a);
                synchronized (this.d) {
                    try {
                        try {
                            jSONObject2.put(Config.PRINCIPAL_PART, this.d);
                            synchronized (this.e) {
                                try {
                                    jSONObject2.put(Config.EVENT_PART, this.e);
                                    try {
                                        jSONObject2.put(Config.EXCEPTION_PART, new JSONArray());
                                        try {
                                            jSONObject2.put(Config.PYD, b);
                                            a(context, jSONObject2, z2);
                                            b(jSONObject2);
                                            a(context, jSONObject2);
                                            a(context, jSONObject2.toString(), z, z3);
                                            this.j = jSONObject2;
                                            clearCache(context);
                                            if (!this.l) {
                                                this.l = true;
                                                updatePyd("");
                                                loadProperty(context);
                                                updatePyd(getTempPyd());
                                            }
                                        } catch (JSONException unused) {
                                        }
                                    } catch (JSONException unused2) {
                                    }
                                } catch (JSONException unused3) {
                                }
                            }
                        } finally {
                        }
                    } catch (JSONException unused4) {
                    }
                }
            } catch (Exception unused5) {
            }
        }
    }

    private void a(Context context, String str, boolean z, boolean z2) throws IOException {
        StatService.WearListener wearListener = this.i;
        if (wearListener != null && wearListener.onSendLogData(str)) {
            cg.c().a("Log has been passed to app level, log: " + str);
            return;
        }
        LogSender.instance().saveLogData(context, str, false);
        cg.c().a("Save log: " + str);
    }

    public void clearCache(Context context) {
        a(false);
        String strOptString = a.optString(Config.DEVICE_ID_SEC);
        if (!TextUtils.isEmpty(strOptString)) {
            cp.a().k(context, strOptString);
        }
        synchronized (a) {
            a = new JSONObject();
        }
        installHeader(context);
        a(context);
    }

    private void a(Context context) {
        synchronized (this.e) {
            this.e = new JSONArray();
        }
        synchronized (this.d) {
            this.d = new JSONArray();
        }
        synchronized (this.f) {
            this.f = new JSONArray();
        }
        flush(context);
    }

    public void setPydProperty(Context context, Map<String, String> map, String str, String str2) {
        String str3;
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2;
        JSONObject jSONObject;
        StringBuffer stringBuffer3;
        String str4;
        int size;
        String str5 = Config.APP_KEY;
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                if (map == null) {
                    clearProperty(str2);
                    return;
                }
                if (map.size() <= 100 && this.n.size() <= 100) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    StringBuffer stringBuffer5 = new StringBuffer();
                    StringBuffer stringBuffer6 = new StringBuffer();
                    StringBuffer stringBuffer7 = new StringBuffer();
                    StringBuffer stringBuffer8 = new StringBuffer();
                    JSONObject jSONObject2 = new JSONObject();
                    Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                    while (true) {
                        JSONObject jSONObject3 = jSONObject2;
                        StringBuffer stringBuffer9 = stringBuffer7;
                        String str6 = "2";
                        if (it.hasNext()) {
                            Map.Entry<String, String> next = it.next();
                            Iterator<Map.Entry<String, String>> it2 = it;
                            String key = next.getKey();
                            String value = next.getValue();
                            if (TextUtils.isEmpty(key) || TextUtils.isEmpty(value)) {
                                str3 = str5;
                                stringBuffer = stringBuffer6;
                                stringBuffer2 = stringBuffer8;
                                jSONObject = jSONObject3;
                                stringBuffer7 = stringBuffer9;
                                cg.c().c("[WARNING] setProperty failed,key or value can not null !");
                            } else {
                                StringBuffer stringBuffer10 = stringBuffer8;
                                if (key.length() > 256 || value.length() > 256) {
                                    str3 = str5;
                                    stringBuffer = stringBuffer6;
                                    jSONObject = jSONObject3;
                                    stringBuffer7 = stringBuffer9;
                                    stringBuffer2 = stringBuffer10;
                                    cg.c().c("[WARNING] setProperty failed,key or value can not over 256 bytes !");
                                } else {
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put(str5, key);
                                    jSONObject4.put("v", value);
                                    jSONObject4.put("s", str);
                                    boolean z = false;
                                    if (this.n.size() > 0) {
                                        stringBuffer3 = stringBuffer6;
                                        size = 0;
                                        while (size < this.n.size()) {
                                            str4 = str6;
                                            JSONObject jSONObject5 = new JSONObject(this.n.get(size));
                                            String strOptString = jSONObject5.optString(str5);
                                            str3 = str5;
                                            String strOptString2 = jSONObject5.optString("v");
                                            String strOptString3 = jSONObject5.optString("s");
                                            if (key.equals(strOptString) && value.equals(strOptString2) && str.equals(strOptString3)) {
                                                break;
                                            }
                                            size++;
                                            str6 = str4;
                                            str5 = str3;
                                        }
                                        str3 = str5;
                                    } else {
                                        str3 = str5;
                                        stringBuffer3 = stringBuffer6;
                                    }
                                    str4 = str6;
                                    size = 0;
                                    z = true;
                                    if (this.n.size() > 100) {
                                        return;
                                    }
                                    if (z) {
                                        try {
                                            this.n.add(jSONObject4.toString());
                                            size = this.n.size() - 1;
                                            this.o.put(size + "", jSONObject4);
                                        } catch (Exception unused) {
                                        }
                                    }
                                    updatePropertyKey(str2, stringBuffer4, PropertyType.UID_PROPERTRY, size);
                                    updatePropertyKey(str2, stringBuffer5, "1", size);
                                    stringBuffer = stringBuffer3;
                                    String str7 = str4;
                                    updatePropertyKey(str2, stringBuffer, str7, size);
                                    stringBuffer2 = stringBuffer10;
                                    updatePropertyKey(str2, stringBuffer2, "3", size);
                                    stringBuffer7 = stringBuffer9;
                                    updatePropertyKey(str2, stringBuffer7, PropertyType.PAGE_PROPERTRY, size);
                                    if (str2.equals(str7)) {
                                        JSONArray jSONArray = new JSONArray();
                                        jSONArray.put(value);
                                        jSONArray.put(str7);
                                        jSONObject = jSONObject3;
                                        jSONObject.put(key, jSONArray);
                                    } else {
                                        jSONObject = jSONObject3;
                                    }
                                }
                            }
                            stringBuffer8 = stringBuffer2;
                            jSONObject2 = jSONObject;
                            it = it2;
                            stringBuffer6 = stringBuffer;
                            str5 = str3;
                        } else {
                            StringBuffer stringBuffer11 = stringBuffer6;
                            StringBuffer stringBuffer12 = stringBuffer8;
                            String string = this.o.toString();
                            if (str2.equals(PropertyType.UID_PROPERTRY) && !TextUtils.isEmpty(stringBuffer4)) {
                                this.m.put(Config.UID_PY, stringBuffer4.toString());
                            } else if (str2.equals("1") && !TextUtils.isEmpty(stringBuffer5)) {
                                this.m.put(Config.USER_PY, stringBuffer5.toString());
                            } else if (str2.equals("2") && !TextUtils.isEmpty(stringBuffer11)) {
                                this.m.put(Config.SESSION_PY, stringBuffer11.toString());
                                this.m.put(Config.SESSION_JSON_PY, jSONObject3.toString());
                            } else if (str2.equals("3") && !TextUtils.isEmpty(stringBuffer12)) {
                                this.m.put(Config.EVENT_PY, stringBuffer12.toString());
                            } else if (str2.equals(PropertyType.PAGE_PROPERTRY) && !TextUtils.isEmpty(stringBuffer9)) {
                                this.m.put(Config.PAGE_PY, stringBuffer9.toString());
                            }
                            if (str2.equals("2")) {
                                CooperService.instance().setHeaderPy(jSONObject3.toString());
                            }
                            if (this.l) {
                                updatePyd(string);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    public void clearProperty(String str) {
        if (str.equals(PropertyType.UID_PROPERTRY)) {
            this.m.put(Config.UID_PY, "");
            return;
        }
        if (str.equals("1")) {
            this.m.put(Config.USER_PY, "");
            return;
        }
        if (str.equals("2")) {
            this.m.put(Config.SESSION_PY, "");
            this.m.put(Config.SESSION_JSON_PY, "");
        } else if (str.equals("3")) {
            this.m.put(Config.EVENT_PY, "");
        } else if (str.equals(PropertyType.PAGE_PROPERTRY)) {
            this.m.put(Config.PAGE_PY, "");
        }
    }

    public void updatePropertyKey(String str, StringBuffer stringBuffer, String str2, int i) {
        if (i >= 0 && str.equals(str2)) {
            if (!TextUtils.isEmpty(stringBuffer)) {
                stringBuffer.append(Config.replace);
            }
            stringBuffer.append(i);
        }
    }

    public String getTempPyd() {
        JSONObject jSONObject = this.o;
        return (jSONObject == null || jSONObject.length() <= 0) ? "" : this.o.toString();
    }

    public String getHeadSessionPy() {
        String str = this.m.get(Config.SESSION_JSON_PY);
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public String getSessionPy() {
        String str = this.m.get(Config.SESSION_PY);
        String str2 = this.m.get(Config.USER_PY);
        String str3 = this.m.get(Config.UID_PY);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return replace(replace(str + Config.replace + str3, Config.replace) + Config.replace + str2, Config.replace);
    }

    public String getPagePy() {
        String str = this.m.get(Config.PAGE_PY);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return replace(getSessionPy() + Config.replace + str, Config.replace);
    }

    public String getEventPy() {
        String str = this.m.get(Config.EVENT_PY);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return replace(getSessionPy() + Config.replace + str, Config.replace);
    }

    public String replace(String str, String str2) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(str2)) {
            str = str.replaceFirst(str2, "");
        }
        if (str.endsWith(str2)) {
            str = str.substring(0, str.length() - 1);
        }
        str = str.replace("null", "");
        return TextUtils.isEmpty(str) ? "" : str;
    }
}
