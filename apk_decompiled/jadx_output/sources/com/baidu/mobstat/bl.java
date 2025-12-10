package com.baidu.mobstat;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import javax.crypto.NoSuchPaddingException;
import kotlin.UByte;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bl {
    private bi a;
    private List<aq> b;

    public bl() {
        a();
    }

    private static String a(byte[] bArr) {
        StringBuilder sb;
        if (bArr == null) {
            throw new IllegalArgumentException("Argument b ( byte array ) is null! ");
        }
        String string = "";
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & UByte.MAX_VALUE);
            if (hexString.length() == 1) {
                sb = new StringBuilder();
                sb.append(string);
                string = PropertyType.UID_PROPERTRY;
            } else {
                sb = new StringBuilder();
            }
            sb.append(string);
            sb.append(hexString);
            string = sb.toString();
        }
        return string.toLowerCase();
    }

    private void a() {
        this.a = new bj(bp.a(), bp.b());
    }

    private boolean a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        HashSet hashSet2 = new HashSet();
        for (String str2 : strArr2) {
            hashSet2.add(str2);
        }
        return hashSet.equals(hashSet2);
    }

    private static byte[] a(byte[] bArr, bi biVar) throws NoSuchPaddingException, InvalidKeyException {
        bf bfVarA = bf.a();
        bfVarA.a(2, biVar);
        return bfVarA.a(bArr);
    }

    private String[] a(Signature[] signatureArr) {
        int length = signatureArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = a(bo.a(signatureArr[i].toByteArray()));
        }
        return strArr;
    }

    List<aq> a(Context context, Intent intent, boolean z) throws JSONException, PackageManager.NameNotFoundException {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null) {
            for (ResolveInfo resolveInfo : listQueryBroadcastReceivers) {
                if (resolveInfo.activityInfo != null && resolveInfo.activityInfo.applicationInfo != null) {
                    try {
                        Bundle bundle = packageManager.getReceiverInfo(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name), 128).metaData;
                        if (bundle != null) {
                            String string = bundle.getString("galaxy_data");
                            if (!TextUtils.isEmpty(string)) {
                                byte[] bArrA = bm.a(string.getBytes("utf-8"));
                                JSONObject jSONObject = new JSONObject(new String(bArrA));
                                aq aqVar = new aq();
                                aqVar.b = jSONObject.getInt("priority");
                                aqVar.a = resolveInfo.activityInfo.applicationInfo;
                                if (context.getPackageName().equals(resolveInfo.activityInfo.applicationInfo.packageName)) {
                                    aqVar.d = true;
                                }
                                if (z) {
                                    String string2 = bundle.getString("galaxy_sf");
                                    if (!TextUtils.isEmpty(string2)) {
                                        PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.applicationInfo.packageName, 64);
                                        JSONArray jSONArray = jSONObject.getJSONArray("sigs");
                                        int length = jSONArray.length();
                                        String[] strArr = new String[length];
                                        for (int i = 0; i < length; i++) {
                                            strArr[i] = jSONArray.getString(i);
                                        }
                                        if (a(strArr, a(packageInfo.signatures))) {
                                            byte[] bArrA2 = a(bm.a(string2.getBytes()), this.a);
                                            if (bArrA2 != null && Arrays.equals(bArrA2, bo.a(bArrA))) {
                                                aqVar.c = true;
                                            }
                                        }
                                    }
                                }
                                arrayList.add(aqVar);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator<aq>() { // from class: com.baidu.mobstat.bl.1
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(aq aqVar2, aq aqVar3) {
                int i2 = aqVar3.b - aqVar2.b;
                if (i2 == 0) {
                    if (aqVar2.d && aqVar3.d) {
                        return 0;
                    }
                    if (aqVar2.d) {
                        return -1;
                    }
                    if (aqVar3.d) {
                        return 1;
                    }
                }
                return i2;
            }
        });
        return arrayList;
    }

    public boolean a(Context context) throws JSONException, PackageManager.NameNotFoundException {
        List<aq> listA = a(context, new Intent("com.baidu.intent.action.GALAXY").setPackage(context.getPackageName()), true);
        if (listA == null || listA.size() == 0) {
            for (int i = 0; i < 3; i++) {
                Log.w("CuidBuddyInfoManager", "galaxy lib host missing meta-data,make sure you know the right way to integrate galaxy");
            }
            return false;
        }
        aq aqVar = listA.get(0);
        boolean z = aqVar.c;
        if (!aqVar.c) {
            for (int i2 = 0; i2 < 3; i2++) {
                Log.w("CuidBuddyInfoManager", "galaxy config err, In the release version of the signature should be matched");
            }
        }
        return z;
    }

    List<aq> b(Context context) {
        List<aq> list = this.b;
        if (list != null) {
            return list;
        }
        a(context);
        List<aq> listA = a(context, new Intent("com.baidu.intent.action.GALAXY"), true);
        this.b = listA;
        return listA;
    }
}
