package com.baidu.mobstat;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.baidu.mobstat.cl;
import com.baidu.mobstat.cs;
import com.baidu.mobstat.util.CuidUtil;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cw {
    private static String a;
    private static String b;
    private static String c;
    private static final Pattern d = Pattern.compile("\\s*|\t|\r|\n");

    public static String a(Context context, String str) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                return "";
            }
            Object obj = applicationInfo.metaData != null ? applicationInfo.metaData.get(str) : null;
            if (obj == null) {
                cg.c().a("can't find information in AndroidManifest.xml for key " + str);
                return "";
            }
            return obj.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(int i, Context context) {
        try {
            return cl.b.c(i, a(context).getBytes());
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(Context context) {
        return d.matcher(cx.a(context)).replaceAll("");
    }

    public static String b(int i, Context context) {
        return cl.b.c(i, CuidUtil.getOaid(context).getBytes());
    }

    public static String c(int i, final Context context) {
        String strR = cp.a().r(context);
        if (TextUtils.isEmpty(strR)) {
            strR = cp.a().s(context);
            da.a().a(context, new cz() { // from class: com.baidu.mobstat.cw.1
                @Override // com.baidu.mobstat.cz
                public void a(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    cp.a().n(context, str);
                }
            });
        }
        if (TextUtils.isEmpty(strR)) {
            strR = "";
        }
        return cl.b.c(i, strR.getBytes());
    }

    public static String d(int i, Context context) {
        return cl.b.c(i, CuidUtil.getIid(context).getBytes());
    }

    public static String e(int i, Context context) {
        return cl.b.c(i, CuidUtil.getGaid(context).getBytes());
    }

    public static String f(int i, Context context) {
        return cl.b.c(i, CuidUtil.getCuid3(context).getBytes());
    }

    public static String g(int i, Context context) {
        return cl.b.c(i, CuidUtil.getSsaid(context).getBytes());
    }

    public static String b(Context context) {
        return cs.a.a(a(context).getBytes()).toUpperCase(Locale.US);
    }

    public static int c(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            displayMetrics = e(context);
        } catch (Exception unused) {
        }
        return displayMetrics.widthPixels;
    }

    public static int d(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            displayMetrics = e(context);
        } catch (Exception unused) {
        }
        return displayMetrics.heightPixels;
    }

    public static DisplayMetrics e(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 1;
        }
    }

    public static String g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String h(int i, Context context) {
        if (!cu.a().c()) {
            return "";
        }
        String strI = i(context);
        return TextUtils.isEmpty(strI) ? "" : cl.b.c(i, strI.getBytes());
    }

    public static String h(Context context) {
        if (!cu.a().c()) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 23) {
            return i(context);
        }
        return d();
    }

    public static String i(Context context) {
        WifiInfo connectionInfo;
        if (!cu.a().c()) {
            return "";
        }
        try {
            if (cn.e(context, "android.permission.ACCESS_WIFI_STATE") && (connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo()) != null) {
                String macAddress = connectionInfo.getMacAddress();
                if (!TextUtils.isEmpty(macAddress)) {
                    return macAddress;
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private static String d() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : hardwareAddress) {
                        sb.append(String.format("%02x:", Byte.valueOf(b2)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String a(byte b2) {
        return ("00" + Integer.toHexString(b2) + Config.TRACE_TODAY_VISIT_SPLIT).substring(r2.length() - 3);
    }

    public static String i(int i, Context context) throws Throwable {
        if (!cu.a().c()) {
            return "";
        }
        String strJ = j(i, context);
        String strC = !TextUtils.isEmpty(strJ) ? cl.b.c(i, strJ.getBytes()) : null;
        return TextUtils.isEmpty(strC) ? "" : strC;
    }

    public static String j(int i, Context context) throws Throwable {
        if (!cu.a().c()) {
            return "";
        }
        String strA = a();
        if (TextUtils.isEmpty(strA)) {
            strA = k(i, context);
        }
        return TextUtils.isEmpty(strA) ? "" : strA;
    }

    public static String k(int i, Context context) throws SocketException {
        StringBuffer stringBuffer = new StringBuffer();
        byte[] hardwareAddress = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isAnyLocalAddress() && (inetAddressNextElement instanceof Inet4Address) && !inetAddressNextElement.isLoopbackAddress()) {
                            if (inetAddressNextElement.isSiteLocalAddress()) {
                                hardwareAddress = networkInterfaceNextElement.getHardwareAddress();
                            } else if (!inetAddressNextElement.isLinkLocalAddress()) {
                                hardwareAddress = networkInterfaceNextElement.getHardwareAddress();
                                break;
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (hardwareAddress != null) {
            for (byte b2 : hardwareAddress) {
                stringBuffer.append(a(b2));
            }
            return stringBuffer.substring(0, stringBuffer.length() - 1).replaceAll(Config.TRACE_TODAY_VISIT_SPLIT, "");
        }
        String strH = h(i, context);
        return strH != null ? strH.replaceAll(Config.TRACE_TODAY_VISIT_SPLIT, "") : strH;
    }

    public static String a() throws Throwable {
        InputStreamReader inputStreamReader;
        StringBuffer stringBuffer = new StringBuffer();
        InputStreamReader inputStreamReader2 = null;
        try {
            char[] cArr = new char[20];
            inputStreamReader = new InputStreamReader(new FileInputStream("/sys/class/net/eth0/address"));
            while (true) {
                try {
                    int i = inputStreamReader.read(cArr);
                    if (i == -1) {
                        break;
                    }
                    if (i != 20 || cArr[19] == '\r') {
                        for (int i2 = 0; i2 < i; i2++) {
                            char c2 = cArr[i2];
                            if (c2 != '\r') {
                                stringBuffer.append(c2);
                            }
                        }
                    } else {
                        System.out.print(cArr);
                    }
                } catch (Exception unused) {
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (Exception unused2) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStreamReader2 = inputStreamReader;
                    if (inputStreamReader2 != null) {
                        try {
                            inputStreamReader2.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            }
            String strReplaceAll = stringBuffer.toString().trim().replaceAll(Config.TRACE_TODAY_VISIT_SPLIT, "");
            try {
                inputStreamReader.close();
            } catch (Exception unused4) {
            }
            return strReplaceAll;
        } catch (Exception unused5) {
            inputStreamReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(Context context, int i) {
        String strJ = j(context);
        return TextUtils.isEmpty(strJ) ? "" : cl.b.c(i, strJ.getBytes());
    }

    public static String j(Context context) {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                return "";
            }
            String name = defaultAdapter.getName();
            return name != null ? name : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String l(int i, Context context) {
        if (!cu.a().c()) {
            return "";
        }
        String strK = k(context);
        return TextUtils.isEmpty(strK) ? "" : cl.b.c(i, strK.getBytes());
    }

    public static String k(Context context) {
        BluetoothAdapter defaultAdapter;
        if (!cu.a().c()) {
            return "";
        }
        String str = android.os.Build.BRAND;
        if ("4.1.1".equals(Build.VERSION.RELEASE) && "TCT".equals(str)) {
            return "";
        }
        try {
            if (cn.e(context, "android.permission.BLUETOOTH") && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
                String address = defaultAdapter.getAddress();
                if (address != null) {
                    return address;
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static String l(Context context) throws JSONException {
        if (!cu.a().c()) {
            return "";
        }
        String strM = m(context);
        return TextUtils.isEmpty(strM) ? "" : cl.a.a(strM.getBytes());
    }

    public static String m(int i, Context context) throws JSONException {
        if (!cu.a().c()) {
            return "";
        }
        String strM = m(context);
        return TextUtils.isEmpty(strM) ? "" : cl.b.d(i, strM.getBytes());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[Catch: Exception -> 0x0098, TryCatch #3 {Exception -> 0x0098, blocks: (B:26:0x004a, B:28:0x006b, B:29:0x006f, B:31:0x007f, B:35:0x008e), top: B:51:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m(android.content.Context r12) throws org.json.JSONException {
        /*
            java.lang.String r0 = ""
            if (r12 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = "android.permission.ACCESS_WIFI_STATE"
            boolean r1 = com.baidu.mobstat.cn.e(r12, r1)
            if (r1 != 0) goto Le
            return r0
        Le:
            r1 = 0
            java.lang.String r2 = "wifi"
            java.lang.Object r12 = r12.getSystemService(r2)     // Catch: java.lang.Throwable -> L22
            android.net.wifi.WifiManager r12 = (android.net.wifi.WifiManager) r12     // Catch: java.lang.Throwable -> L22
            android.net.wifi.WifiInfo r2 = r12.getConnectionInfo()     // Catch: java.lang.Throwable -> L22
            java.util.List r12 = r12.getScanResults()     // Catch: java.lang.Throwable -> L20
            goto L25
        L20:
            goto L24
        L22:
            r2 = r1
        L24:
            r12 = r1
        L25:
            if (r12 == 0) goto L35
            int r3 = r12.size()
            if (r3 == 0) goto L35
            com.baidu.mobstat.cw$2 r3 = new com.baidu.mobstat.cw$2
            r3.<init>()
            java.util.Collections.sort(r12, r3)
        L35:
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            r4 = 0
            r5 = 0
        L3c:
            java.lang.String r6 = "|"
            if (r12 == 0) goto L9b
            int r7 = r12.size()
            if (r5 >= r7) goto L9b
            r7 = 30
            if (r5 >= r7) goto L9b
            java.lang.Object r8 = r12.get(r5)     // Catch: java.lang.Exception -> L98
            android.net.wifi.ScanResult r8 = (android.net.wifi.ScanResult) r8     // Catch: java.lang.Exception -> L98
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L98
            r9.<init>()     // Catch: java.lang.Exception -> L98
            java.lang.String r10 = r8.BSSID     // Catch: java.lang.Exception -> L98
            r9.append(r10)     // Catch: java.lang.Exception -> L98
            r9.append(r6)     // Catch: java.lang.Exception -> L98
            java.lang.String r10 = r8.SSID     // Catch: java.lang.Exception -> L98
            java.lang.String r11 = "\\|"
            java.lang.String r10 = r10.replaceAll(r11, r0)     // Catch: java.lang.Exception -> L98
            int r11 = r10.length()     // Catch: java.lang.Exception -> L98
            if (r11 <= r7) goto L6f
            java.lang.String r10 = r10.substring(r4, r7)     // Catch: java.lang.Exception -> L98
        L6f:
            r9.append(r10)     // Catch: java.lang.Exception -> L98
            r9.append(r6)     // Catch: java.lang.Exception -> L98
            int r7 = r8.level     // Catch: java.lang.Exception -> L98
            r9.append(r7)     // Catch: java.lang.Exception -> L98
            r9.append(r6)     // Catch: java.lang.Exception -> L98
            if (r2 == 0) goto L8d
            java.lang.String r6 = r8.BSSID     // Catch: java.lang.Exception -> L98
            java.lang.String r7 = r2.getBSSID()     // Catch: java.lang.Exception -> L98
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> L98
            if (r6 == 0) goto L8d
            r6 = 1
            goto L8e
        L8d:
            r6 = 0
        L8e:
            r9.append(r6)     // Catch: java.lang.Exception -> L98
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Exception -> L98
            r3.put(r6)     // Catch: java.lang.Exception -> L98
        L98:
            int r5 = r5 + 1
            goto L3c
        L9b:
            int r12 = r3.length()
            if (r12 != 0) goto La2
            return r1
        La2:
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lcc
            r1.<init>()     // Catch: java.lang.Exception -> Lcc
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lcc
            r1.append(r7)     // Catch: java.lang.Exception -> Lcc
            r1.append(r6)     // Catch: java.lang.Exception -> Lcc
            r1.append(r4)     // Catch: java.lang.Exception -> Lcc
            java.lang.String r2 = "ap-list"
            r12.put(r2, r3)     // Catch: java.lang.Exception -> Lcc
            java.lang.String r2 = "meta-data"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lcc
            r12.put(r2, r1)     // Catch: java.lang.Exception -> Lcc
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Exception -> Lcc
            return r12
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mobstat.cw.m(android.content.Context):java.lang.String");
    }

    public static boolean n(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
            if (networkInfo == null || !networkInfo.isAvailable()) {
                return false;
            }
            return networkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    public static String o(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "";
            }
            String typeName = activeNetworkInfo.getTypeName();
            return (typeName.equals("WIFI") || activeNetworkInfo.getSubtypeName() == null) ? typeName : activeNetworkInfo.getSubtypeName();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String p(Context context) {
        return context != null ? context.getPackageName() : "";
    }

    public static String n(int i, Context context) {
        String strP = p(context);
        if (TextUtils.isEmpty(strP)) {
            return "";
        }
        try {
            return cl.b.c(i, strP.getBytes());
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        r0 = r2.processName;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String v(android.content.Context r5) {
        /*
            java.lang.String r0 = com.baidu.mobstat.cw.a
            if (r0 != 0) goto L38
            java.lang.String r1 = "activity"
            java.lang.Object r5 = r5.getSystemService(r1)     // Catch: java.lang.Exception -> L30
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch: java.lang.Exception -> L30
            java.util.List r5 = r5.getRunningAppProcesses()     // Catch: java.lang.Exception -> L30
            r1 = 0
        L11:
            if (r5 == 0) goto L31
            int r2 = r5.size()     // Catch: java.lang.Exception -> L30
            if (r1 >= r2) goto L31
            java.lang.Object r2 = r5.get(r1)     // Catch: java.lang.Exception -> L30
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L2d
            int r3 = r2.pid     // Catch: java.lang.Exception -> L30
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L30
            if (r3 != r4) goto L2d
            java.lang.String r5 = r2.processName     // Catch: java.lang.Exception -> L30
            r0 = r5
            goto L31
        L2d:
            int r1 = r1 + 1
            goto L11
        L30:
        L31:
            if (r0 != 0) goto L36
            java.lang.String r5 = ""
            r0 = r5
        L36:
            com.baidu.mobstat.cw.a = r0
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mobstat.cw.v(android.content.Context):java.lang.String");
    }

    private static String b(Context context, String str) {
        int iLastIndexOf;
        int i;
        if (str != null && (iLastIndexOf = str.lastIndexOf(58)) > 0 && (i = iLastIndexOf + 1) < str.length()) {
            return str.substring(i);
        }
        return null;
    }

    private static String c(Context context, String str) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return null;
        }
        String str2 = applicationInfo.processName;
        if (str2 == null || str2.equals(str)) {
            return null;
        }
        return str;
    }

    public static String q(Context context) {
        String str = b;
        if (str == null) {
            String strV = v(context);
            String strB = b(context, strV);
            if (TextUtils.isEmpty(strB)) {
                strB = c(context, strV);
            }
            str = strB == null ? "" : strB;
            b = str;
        }
        return str;
    }

    public static String r(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        ServiceInfo[] serviceInfoArr;
        String str;
        String strV = v(context);
        if (strV == null) {
            return "";
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo == null || (serviceInfoArr = packageInfo.services) == null) {
            return "";
        }
        int length = serviceInfoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str = "";
                break;
            }
            ServiceInfo serviceInfo = serviceInfoArr[i];
            if (strV.equals(serviceInfo.processName)) {
                str = serviceInfo.name;
                break;
            }
            i++;
        }
        return str == null ? "" : str;
    }

    public static boolean s(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
        } catch (Exception unused) {
            return false;
        }
    }

    public static String t(Context context) throws JSONException {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Config.MODEL, memoryInfo.availMem);
            jSONObject.put("l", memoryInfo.lowMemory);
            jSONObject.put("t", memoryInfo.threshold);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_mem", jSONArray);
            jSONObject2.put("meta-data", sb.toString());
            return cl.a.a(jSONObject2.toString().getBytes());
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b() throws Throwable {
        String str;
        String str2 = c;
        if (str2 != null) {
            return str2;
        }
        if (!TextUtils.isEmpty(b("ro.miui.ui.version.name"))) {
            str = "miui";
        } else if (!TextUtils.isEmpty(b("ro.build.version.opporom"))) {
            str = "coloros";
        } else if (!TextUtils.isEmpty(b("ro.build.version.emui"))) {
            str = "emui";
        } else if (TextUtils.isEmpty(b("ro.vivo.os.version"))) {
            str = !TextUtils.isEmpty(b("ro.smartisan.version")) ? "smartisan" : "";
        } else {
            str = "funtouch";
        }
        if (TextUtils.isEmpty(str)) {
            String strB = b("ro.build.display.id");
            if (!TextUtils.isEmpty(strB) && strB.contains("Flyme")) {
                str = "flyme";
            }
        }
        c = str;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r1 r5
      0x0032: PHI (r1v5 java.lang.String) = (r1v0 java.lang.String), (r1v9 java.lang.String) binds: [B:31:0x005d, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r5v6 java.lang.Process) = (r5v5 java.lang.Process), (r5v8 java.lang.Process) binds: [B:31:0x005d, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b(java.lang.String r5) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "getprop "
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L53
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L53
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L53
            r3.append(r5)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L53
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L53
            java.lang.Process r5 = r2.exec(r5)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L53
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3f
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3f
            java.io.InputStream r3 = r5.getInputStream()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3f
            r3 = 1024(0x400, float:1.435E-42)
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3f
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r0.close()     // Catch: java.lang.Exception -> L2f
            goto L30
        L2f:
        L30:
            if (r5 == 0) goto L60
        L32:
            r5.destroy()
            goto L60
        L36:
            r1 = move-exception
            goto L46
        L38:
            goto L56
        L3a:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L46
        L3f:
            r0 = r1
            goto L56
        L42:
            r5 = move-exception
            r0 = r1
            r1 = r5
            r5 = r0
        L46:
            if (r0 == 0) goto L4d
            r0.close()     // Catch: java.lang.Exception -> L4c
            goto L4d
        L4c:
        L4d:
            if (r5 == 0) goto L52
            r5.destroy()
        L52:
            throw r1
        L53:
            r5 = r1
            r0 = r5
        L56:
            if (r0 == 0) goto L5d
            r0.close()     // Catch: java.lang.Exception -> L5c
            goto L5d
        L5c:
        L5d:
            if (r5 == 0) goto L60
            goto L32
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mobstat.cw.b(java.lang.String):java.lang.String");
    }

    public static Boolean c() throws ClassNotFoundException {
        Object objInvoke;
        try {
            Class<?> cls = Class.forName("com.baidu.disasterrecovery.MtjAdapter");
            if (cls == null || (objInvoke = cls.getDeclaredMethod("shouldUploadOther", new Class[0]).invoke(null, new Object[0])) == null || !(objInvoke instanceof Boolean)) {
                return true;
            }
            return (Boolean) objInvoke;
        } catch (Exception unused) {
            return true;
        }
    }

    public static String u(Context context) {
        if (!cu.a().c()) {
            return "";
        }
        try {
            String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            return !TextUtils.isEmpty(deviceId) ? cl.b.c(1, deviceId.getBytes()) : deviceId;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(String str) {
        return cl.b.c(1, str.getBytes());
    }
}
