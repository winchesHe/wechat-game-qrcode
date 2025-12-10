package com.yourpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

import java.util.Iterator;
import java.util.Map;

/**
 * Android Intent 原生模块
 * 用于从 React Native 启动其他 Android 应用
 */
public class AndroidIntentModule extends ReactContextBaseJavaModule {
    private static final String MODULE_NAME = "AndroidIntentModule";
    private ReactApplicationContext reactContext;

    public AndroidIntentModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return MODULE_NAME;
    }

    /**
     * 启动 Activity
     */
    @ReactMethod
    public void startActivity(ReadableMap intentData, Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                promise.reject("NO_ACTIVITY", "当前没有活动的 Activity");
                return;
            }

            String packageName = intentData.getString("packageName");
            String className = intentData.getString("className");
            ReadableMap bundleMap = intentData.getMap("bundle");
            ReadableMap extrasMap = intentData.getMap("extras");
            int flags = intentData.hasKey("flags") ? intentData.getInt("flags") : 0;

            // 创建 Intent
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(packageName, className));
            
            // 设置 Bundle
            if (bundleMap != null) {
                Bundle bundle = readableMapToBundle(bundleMap);
                intent.putExtras(bundle);
            }

            // 设置 Extras
            if (extrasMap != null) {
                Iterator<Map.Entry<String, Object>> iterator = extrasMap.getEntryIterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, Object> entry = iterator.next();
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    
                    if (value instanceof String) {
                        intent.putExtra(key, (String) value);
                    } else if (value instanceof Integer) {
                        intent.putExtra(key, (Integer) value);
                    } else if (value instanceof Boolean) {
                        intent.putExtra(key, (Boolean) value);
                    } else if (value instanceof Double) {
                        intent.putExtra(key, ((Double) value).intValue());
                    }
                }
            }

            // 设置标志
            if (flags != 0) {
                intent.addFlags(flags);
            }

            // 启动 Activity
            currentActivity.startActivity(intent);
            promise.resolve(true);

        } catch (Exception e) {
            promise.reject("START_ACTIVITY_ERROR", e.getMessage(), e);
        }
    }

    /**
     * 检查应用是否已安装
     */
    @ReactMethod
    public void isAppInstalled(String packageName, Promise promise) {
        try {
            Context context = reactContext.getApplicationContext();
            boolean installed = isPackageInstalled(context, packageName);
            promise.resolve(installed);
        } catch (Exception e) {
            promise.reject("CHECK_INSTALL_ERROR", e.getMessage(), e);
        }
    }

    /**
     * 将 ReadableMap 转换为 Bundle
     */
    private Bundle readableMapToBundle(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        Iterator<Map.Entry<String, Object>> iterator = readableMap.getEntryIterator();
        
        while (iterator.hasNext()) {
            Map.Entry<String, Object> entry = iterator.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            
            if (value == null) {
                bundle.putString(key, null);
            } else if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else if (value instanceof Integer) {
                bundle.putInt(key, (Integer) value);
            } else if (value instanceof Boolean) {
                bundle.putBoolean(key, (Boolean) value);
            } else if (value instanceof Double) {
                bundle.putInt(key, ((Double) value).intValue());
            }
        }
        
        return bundle;
    }

    /**
     * 检查包是否已安装
     */
    private boolean isPackageInstalled(Context context, String packageName) {
        try {
            context.getPackageManager().getPackageInfo(packageName, 0);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

