package com.muhua.wz.bean;

import androidx.core.app.NotificationCompat;
import com.baidu.mobstat.Config;
import com.muhua.wz.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Version implements JsonParse<Version> {
    public static final int MSG_SHOW_MODE_DAY = 2;
    public static final int MSG_SHOW_MODE_ONE = 1;
    public static final int MSG_SHOW_MODE_START = 0;
    public int version = 0;
    public int versionCode = 7;
    public String versionName = BuildConfig.VERSION_NAME;
    public int menuVersion = 1;
    public Msg msg = new Msg();
    public boolean isCache = false;

    public static class Msg {
        public boolean enable = false;
        public String title = "";
        public String msg = "";
        public int mode = 0;
    }

    @Override // com.muhua.wz.bean.JsonParse
    public void parse(String str) {
        parseFormJson(this, str);
    }

    @Override // com.muhua.wz.bean.JsonParse
    public String toJson() {
        return toJson(this);
    }

    public static String toJson(Version version) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", version.version);
            jSONObject.put("versionCode", version.versionCode);
            jSONObject.put("versionName", version.versionName);
            jSONObject.put("menuVersion", version.menuVersion);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, jSONObject2);
            Msg msg = version.msg;
            if (msg != null) {
                jSONObject2.put("enable", msg.enable);
                jSONObject2.put(Config.FEED_LIST_ITEM_TITLE, version.msg.title);
                jSONObject2.put(NotificationCompat.CATEGORY_MESSAGE, version.msg.msg);
                jSONObject2.optInt("mode", version.msg.mode);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Version parseFormJson(Version version, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (version == null) {
                version = new Version();
            }
            version.version = jSONObject.optInt("versionCode", 0);
            version.versionCode = jSONObject.optInt("versionCode", 7);
            version.versionName = jSONObject.optString("versionName", BuildConfig.VERSION_NAME);
            version.menuVersion = jSONObject.optInt("menuVersion", 1);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(NotificationCompat.CATEGORY_MESSAGE);
            if (jSONObjectOptJSONObject != null) {
                version.msg.enable = jSONObjectOptJSONObject.optBoolean("enable", false);
                version.msg.title = jSONObjectOptJSONObject.optString(Config.FEED_LIST_ITEM_TITLE, "");
                version.msg.msg = jSONObjectOptJSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, "");
                version.msg.mode = jSONObjectOptJSONObject.optInt("mode", 0);
            }
            return version;
        } catch (Exception unused) {
            return null;
        }
    }
}
