package com.baidu.mobstat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebView;
import android.widget.GridView;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.baidu.mobstat.ca;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cj {
    public static View a(Activity activity) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        return window.getDecorView();
    }

    public static String a(View view) throws ClassNotFoundException {
        String strC;
        Class<?> cls;
        if (view instanceof ListView) {
            strC = "ListView";
        } else {
            strC = view instanceof WebView ? "WebView" : "";
        }
        if (TextUtils.isEmpty(strC)) {
            String strA = a(view.getClass());
            if (!"android.widget".equals(strA) && !"android.view".equals(strA)) {
                try {
                    cls = Class.forName("androidx.recyclerview.widget.RecyclerView");
                } catch (Exception unused) {
                    cls = null;
                }
                if (cls != null && cls.isAssignableFrom(view.getClass())) {
                    strC = "RecyclerView";
                }
            }
        }
        if (TextUtils.isEmpty(strC)) {
            strC = c(view.getClass());
        }
        return TextUtils.isEmpty(strC) ? "Object" : strC;
    }

    private static String c(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        String strA = a(cls);
        if ("android.widget".equals(strA) || "android.view".equals(strA)) {
            return d(cls);
        }
        return c(cls.getSuperclass());
    }

    public static String a(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        Package r1 = cls.getPackage();
        String name = r1 != null ? r1.getName() : "";
        return name == null ? "" : name;
    }

    public static String a(View view, View view2) {
        if (view == null) {
            return String.valueOf(0);
        }
        if (view == view2) {
            return String.valueOf(0);
        }
        ViewParent parent = view.getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            return String.valueOf(0);
        }
        Class<?> cls = view.getClass();
        if (cls == null) {
            return String.valueOf(0);
        }
        String strB = b(cls);
        if (TextUtils.isEmpty(strB)) {
            return String.valueOf(0);
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int i = 0;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null) {
                if (childAt == view) {
                    break;
                }
                if (childAt.getClass() != null && strB.equals(b(childAt.getClass()))) {
                    i++;
                }
            }
        }
        return String.valueOf(i);
    }

    public static String a(View view, String str) {
        String strValueOf = "";
        if (TextUtils.isEmpty(str) || view == null) {
            return "";
        }
        Object parent = view.getParent();
        if (parent != null && (parent instanceof View)) {
            View view2 = (View) parent;
            try {
                if ("ListView".equals(str)) {
                    if ((view2 instanceof ListView) && view.getParent() != null) {
                        strValueOf = String.valueOf(((ListView) view2).getPositionForView(view));
                    }
                } else if ("GridView".equals(str)) {
                    if ((view2 instanceof GridView) && view.getParent() != null) {
                        strValueOf = String.valueOf(((GridView) view2).getPositionForView(view));
                    }
                } else if ("RecyclerView".equals(str)) {
                    strValueOf = String.valueOf(((RecyclerView) view2).getChildLayoutPosition(view));
                }
            } catch (Throwable unused) {
            }
        }
        return strValueOf;
    }

    public static String b(View view) throws ClassNotFoundException {
        ViewParent parent;
        Class<?> cls;
        String strValueOf;
        if (view == null || (parent = view.getParent()) == null || !(parent instanceof ViewGroup)) {
            return "";
        }
        String strA = a(parent.getClass());
        if ("android.widget".equals(strA) || "android.view".equals(strA)) {
            return "";
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        try {
            cls = Class.forName("androidx.viewpager.widget.ViewPager");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || !cls.isAssignableFrom(viewGroup.getClass())) {
            return "";
        }
        try {
            ViewPager viewPager = (ViewPager) viewGroup;
            ArrayList arrayList = new ArrayList();
            int childCount = viewPager.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewPager.getChildAt(i2);
                arrayList.add(childAt);
                if (c(childAt) != null) {
                    i++;
                }
            }
            if (arrayList.size() >= 2 && i >= 2) {
                try {
                    Collections.sort(arrayList, new Comparator<View>() { // from class: com.baidu.mobstat.cj.1
                        @Override // java.util.Comparator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public int compare(View view2, View view3) {
                            return view2.getLeft() - view3.getLeft();
                        }
                    });
                } catch (Exception unused2) {
                }
                int left = view.getLeft() / Math.abs(((View) arrayList.get(1)).getLeft() - ((View) arrayList.get(0)).getLeft());
                int count = viewPager.getAdapter().getCount();
                if (count != 0) {
                    left %= count;
                }
                strValueOf = String.valueOf(left);
            } else {
                strValueOf = String.valueOf(viewPager.getCurrentItem());
            }
            return strValueOf;
        } catch (Throwable unused3) {
            return "";
        }
    }

    public static Rect c(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        Rect rect = new Rect();
        if (a(view, rect) && rect.right > rect.left && rect.bottom > rect.top) {
            return rect;
        }
        return null;
    }

    private static boolean a(View view, Rect rect) {
        if (view == null || rect == null) {
            return false;
        }
        try {
            return view.getGlobalVisibleRect(rect);
        } catch (Exception unused) {
            return false;
        }
    }

    public static String d(View view) throws Resources.NotFoundException {
        int iLastIndexOf;
        int i;
        String strSubstring = null;
        try {
            if (view.getId() != 0) {
                strSubstring = view.getResources().getResourceName(view.getId());
            }
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(strSubstring) && strSubstring.contains(":id/") && (iLastIndexOf = strSubstring.lastIndexOf(":id/")) != -1 && (i = iLastIndexOf + 4) < strSubstring.length()) {
            strSubstring = strSubstring.substring(i);
        }
        return strSubstring == null ? "" : strSubstring;
    }

    public static JSONArray a(Activity activity, View view) throws JSONException {
        View viewA;
        JSONArray jSONArray = new JSONArray();
        if (activity == null || view == null) {
            return jSONArray;
        }
        try {
            viewA = a(activity);
        } catch (Exception unused) {
            viewA = null;
        }
        if (viewA == null) {
            return jSONArray;
        }
        while (view != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("p", f(view));
                String strB = b(view);
                if (TextUtils.isEmpty(strB)) {
                    String strA = "";
                    Object parent = view.getParent();
                    if (parent != null && (parent instanceof View)) {
                        strA = a((View) parent);
                    }
                    strB = a(view, strA);
                    if (TextUtils.isEmpty(strB)) {
                        strB = a(view, viewA);
                    }
                }
                jSONObject.put("i", strB);
                jSONObject.put("t", a(view));
                jSONArray.put(jSONObject);
                Object parent2 = view.getParent();
                if (parent2 == null || view == viewA || !(parent2 instanceof View) || g(view) || jSONArray.length() > 1000) {
                    break;
                }
                view = (View) parent2;
            } catch (Exception unused2) {
                jSONArray = new JSONArray();
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        try {
            for (int length = jSONArray.length() - 1; length >= 0; length--) {
                jSONArray2.put(jSONArray.get(length));
            }
        } catch (Exception unused3) {
        }
        return jSONArray2;
    }

    public static Map<String, String> e(View view) {
        Map<String, String> map;
        Object tag = view.getTag(-96000);
        if (tag != null && (tag instanceof Map)) {
            try {
                map = (Map) tag;
            } catch (Exception unused) {
                map = null;
            }
            if (map != null && map.size() != 0) {
                return map;
            }
        }
        return null;
    }

    public static String a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                sb.append("/" + jSONObject.getString("p") + "[" + jSONObject.getString("i") + "]");
            } catch (Exception unused) {
                return "";
            }
        }
        return sb.toString();
    }

    public static String b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                sb.append("/" + jSONObject.getString("p") + "[" + jSONObject.getString("i") + "]");
                String strOptString = jSONObject.optString("d");
                if (!TextUtils.isEmpty(strOptString)) {
                    sb.append("#" + strOptString);
                }
            } catch (Exception unused) {
                return "";
            }
        }
        return sb.toString();
    }

    public static String c(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                sb.append("/" + b(jSONObject.getString("p")) + "[" + jSONObject.getString("i") + "]");
            } catch (Exception unused) {
                return "";
            }
        }
        return sb.toString();
    }

    public static String d(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                sb.append("/" + b(jSONObject.getString("p")) + "[" + jSONObject.getString("i") + "]");
                String strOptString = jSONObject.optString("d");
                if (!TextUtils.isEmpty(strOptString)) {
                    sb.append("#" + strOptString);
                }
            } catch (Exception unused) {
                return "";
            }
        }
        return sb.toString();
    }

    private static String b(String str) {
        String strA = cd.a().a(str);
        if (TextUtils.isEmpty(strA)) {
            strA = ca.a().a(str, ca.a.a);
        }
        return strA == null ? "" : strA;
    }

    public static String a(String str) {
        String strA = ca.a().a(str, ca.a.b);
        return strA == null ? "" : strA;
    }

    public static String b(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        String strA = a(cls, false);
        if (!TextUtils.isEmpty(strA) && cls.isAnonymousClass()) {
            strA = strA + "$";
        }
        return strA == null ? "" : strA;
    }

    public static String f(View view) {
        Class<?> cls;
        if (view == null || (cls = view.getClass()) == null) {
            return "";
        }
        String strD = d(cls);
        if (!TextUtils.isEmpty(strD) && cls.isAnonymousClass()) {
            strD = strD + "$";
        }
        return strD == null ? "" : strD;
    }

    private static String a(Class<?> cls, boolean z) {
        if (!cls.isAnonymousClass()) {
            return z ? cls.getSimpleName() : cls.getName();
        }
        Class<? super Object> superclass = cls.getSuperclass();
        return superclass != null ? z ? superclass.getSimpleName() : superclass.getName() : "";
    }

    private static String d(Class<?> cls) {
        return a(cls, true);
    }

    private static boolean g(View view) {
        return view != null && "com.android.internal.policy".equals(a(view.getClass())) && "DecorView".equals(f(view));
    }

    public static String a(Context context) {
        ResolveInfo resolveInfoResolveActivity;
        ActivityInfo activityInfo;
        if (context == null) {
            return "";
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        try {
            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        } catch (Exception unused) {
            resolveInfoResolveActivity = null;
        }
        if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
            return "";
        }
        String str = activityInfo.packageName;
        return ("android".equals(str) || TextUtils.isEmpty(str)) ? "" : str;
    }

    public static boolean a(Context context, String str) {
        PackageManager packageManager;
        List<ResolveInfo> listQueryIntentActivities;
        if (context == null || TextUtils.isEmpty(str) || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        } catch (Exception unused) {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && str.equals(activityInfo.packageName)) {
                return true;
            }
        }
        return false;
    }
}
