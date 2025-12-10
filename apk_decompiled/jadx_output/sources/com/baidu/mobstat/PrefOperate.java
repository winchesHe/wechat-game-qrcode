package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class PrefOperate {
    public static void loadMetaDataConfig(Context context) {
        SendStrategyEnum sendStrategyEnum = SendStrategyEnum.APP_START;
        try {
            String strA = cw.a(context, Config.EXCEPTION_LOG_META_NAME);
            if (!TextUtils.isEmpty(strA) && "true".equals(strA)) {
                ExceptionAnalysis.getInstance().openExceptionAnalysis(context, false);
            }
        } catch (Exception unused) {
        }
        try {
            String strA2 = cw.a(context, Config.SEND_STRATEGY_META_NAME);
            if (!TextUtils.isEmpty(strA2)) {
                if (strA2.equals(SendStrategyEnum.APP_START.name())) {
                    sendStrategyEnum = SendStrategyEnum.APP_START;
                    cp.a().a(context, sendStrategyEnum.ordinal());
                } else if (strA2.equals(SendStrategyEnum.ONCE_A_DAY.name())) {
                    sendStrategyEnum = SendStrategyEnum.ONCE_A_DAY;
                    cp.a().a(context, sendStrategyEnum.ordinal());
                    cp.a().b(context, 24);
                } else if (strA2.equals(SendStrategyEnum.SET_TIME_INTERVAL.name())) {
                    sendStrategyEnum = SendStrategyEnum.SET_TIME_INTERVAL;
                    cp.a().a(context, sendStrategyEnum.ordinal());
                }
            }
        } catch (Exception unused2) {
        }
        try {
            String strA3 = cw.a(context, Config.TIME_INTERVAL_META_NAME);
            if (!TextUtils.isEmpty(strA3)) {
                int i = Integer.parseInt(strA3);
                if (sendStrategyEnum.ordinal() == SendStrategyEnum.SET_TIME_INTERVAL.ordinal() && i > 0 && i <= 24) {
                    cp.a().b(context, i);
                }
            }
        } catch (Exception unused3) {
        }
        try {
            String strA4 = cw.a(context, Config.ONLY_WIFI_META_NAME);
            if (TextUtils.isEmpty(strA4)) {
                return;
            }
            if ("true".equals(strA4)) {
                cp.a().a(context, true);
            } else if ("false".equals(strA4)) {
                cp.a().a(context, false);
            }
        } catch (Exception unused4) {
        }
    }

    public static void setAppKey(String str) {
        CooperService.instance().getHeadObject().e = str;
    }

    public static String getAppKey(Context context) {
        return CooperService.instance().getAppKey(context);
    }

    public static void setAppChannel(String str) {
        if (str == null || str.equals("")) {
            cg.c().c("[WARNING] The channel you have set is empty");
        }
        CooperService.instance().getHeadObject().l = str;
    }

    public static void setAppChannel(Context context, String str, boolean z) {
        if (str == null || str.equals("")) {
            cg.c().c("[WARNING] The channel you have set is empty");
        }
        CooperService.instance().getHeadObject().l = str;
        if (z && str != null && !str.equals("")) {
            cp.a().d(context, str);
            cp.a().b(context, true);
        }
        if (z) {
            return;
        }
        cp.a().d(context, "");
        cp.a().b(context, false);
    }
}
