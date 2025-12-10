package com.muhua.wz.bean;

import android.text.TextUtils;
import com.baidu.mobstat.Config;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MenuList implements JsonParse<MenuList> {
    public static final int DEFAULT_VERSION = 1;
    public Map<String, GameInfo> menu;
    public int version = 1;
    public boolean isCache = false;

    @Override // com.muhua.wz.bean.JsonParse
    public String toJson() {
        return null;
    }

    @Override // com.muhua.wz.bean.JsonParse
    public void parse(String str) throws JSONException {
        parseFormJson(this, str);
    }

    public static MenuList parseFormJson(MenuList menuList, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("version");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("helpList");
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("game");
            if (jSONArrayOptJSONArray2 == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                String strOptString = jSONObject2.optString(Config.FEED_LIST_NAME);
                String strOptString2 = jSONObject2.optString("appId");
                String strOptString3 = jSONObject2.optString("bundleId");
                String strOptString4 = jSONObject2.optString(Config.INPUT_DEF_PKG);
                String strOptString5 = jSONObject2.optString("cls");
                String strOptString6 = jSONObject2.optString("help");
                String strOptString7 = jSONObject2.optString(Config.PY, "");
                GameInfo gameInfo = new GameInfo(strOptString, strOptString2, strOptString3, jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.optString(jSONObject2.optInt("helpIndex", 0), "") : "", jSONObject2.optString("icon", ""), strOptString7);
                if (!TextUtils.isEmpty(strOptString4)) {
                    gameInfo.pkg = strOptString4;
                }
                if (!TextUtils.isEmpty(strOptString5)) {
                    gameInfo.cls = strOptString5;
                }
                if (!TextUtils.isEmpty(strOptString6)) {
                    gameInfo.help = strOptString6;
                }
                linkedHashMap.put(gameInfo.name, gameInfo);
            }
            MenuList menuList2 = menuList == null ? new MenuList() : menuList;
            menuList2.version = iOptInt;
            menuList2.menu = linkedHashMap;
            return menuList2;
        } catch (Exception unused) {
            return null;
        }
    }
}
