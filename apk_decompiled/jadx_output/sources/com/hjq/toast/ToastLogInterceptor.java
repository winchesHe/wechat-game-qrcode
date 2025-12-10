package com.hjq.toast;

import android.util.Log;
import com.baidu.mobstat.Config;
import com.hjq.toast.config.IToastInterceptor;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public class ToastLogInterceptor implements IToastInterceptor {
    @Override // com.hjq.toast.config.IToastInterceptor
    public boolean intercept(CharSequence charSequence) {
        printToast(charSequence);
        return false;
    }

    protected void printToast(CharSequence charSequence) {
        if (isLogEnable()) {
            for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
                int lineNumber = stackTraceElement.getLineNumber();
                if (lineNumber > 0) {
                    try {
                        if (!filterClass(Class.forName(stackTraceElement.getClassName()))) {
                            printLog("(" + stackTraceElement.getFileName() + Config.TRACE_TODAY_VISIT_SPLIT + lineNumber + ") " + charSequence.toString());
                            return;
                        }
                        continue;
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    protected boolean isLogEnable() {
        return ToastUtils.isDebugMode();
    }

    protected void printLog(String str) {
        Log.i("ToastUtils", str);
    }

    protected boolean filterClass(Class<?> cls) {
        return ToastLogInterceptor.class.equals(cls) || ToastUtils.class.equals(cls) || cls.isInterface() || Modifier.isAbstract(cls.getModifiers());
    }
}
