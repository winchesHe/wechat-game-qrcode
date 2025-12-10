package com.baidu.mobstat;

import android.content.Context;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public abstract class k {
    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    private static final /* synthetic */ k[] g;
    private int f;

    public abstract j a(Context context);

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) g.clone();
    }

    static {
        int i = 0;
        k kVar = new k("AP_LIST", i, i) { // from class: com.baidu.mobstat.k.1
            @Override // com.baidu.mobstat.k
            public j a(Context context) {
                return new m(context);
            }
        };
        a = kVar;
        int i2 = 1;
        k kVar2 = new k("APP_LIST", i2, i2) { // from class: com.baidu.mobstat.k.2
            @Override // com.baidu.mobstat.k
            public j a(Context context) {
                return new p(context);
            }
        };
        b = kVar2;
        int i3 = 2;
        k kVar3 = new k("APP_TRACE", i3, i3) { // from class: com.baidu.mobstat.k.3
            @Override // com.baidu.mobstat.k
            public j a(Context context) {
                return new q(context);
            }
        };
        c = kVar3;
        int i4 = 3;
        k kVar4 = new k("APP_CHANGE", i4, i4) { // from class: com.baidu.mobstat.k.4
            @Override // com.baidu.mobstat.k
            public j a(Context context) {
                return new o(context);
            }
        };
        d = kVar4;
        int i5 = 4;
        k kVar5 = new k("APP_APK", i5, i5) { // from class: com.baidu.mobstat.k.5
            @Override // com.baidu.mobstat.k
            public j a(Context context) {
                return new n(context);
            }
        };
        e = kVar5;
        g = new k[]{kVar, kVar2, kVar3, kVar4, kVar5};
    }

    private k(String str, int i, int i2) {
        this.f = i2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.f);
    }

    public synchronized ArrayList<i> a(Context context, int i, int i2) {
        ArrayList<i> arrayList = new ArrayList<>();
        j jVarA = null;
        try {
            try {
                jVarA = a(context);
            } catch (Exception e2) {
                cf.c().b(e2);
                if (jVarA != null) {
                }
            }
            if (!jVarA.a()) {
                return arrayList;
            }
            arrayList = jVarA.a(i, i2);
            if (jVarA != null) {
                jVarA.close();
            }
            return arrayList;
        } finally {
            if (jVarA != null) {
                jVarA.close();
            }
        }
    }

    public synchronized long a(Context context, long j, String str) {
        long jA = -1;
        j jVarA = null;
        try {
            try {
                jVarA = a(context);
            } catch (Exception e2) {
                cf.c().b(e2);
                if (jVarA != null) {
                }
            }
            if (!jVarA.a()) {
                return -1L;
            }
            jA = jVarA.a(String.valueOf(j), str);
            if (jVarA != null) {
                jVarA.close();
            }
            return jA;
        } finally {
            if (jVarA != null) {
                jVarA.close();
            }
        }
    }

    public synchronized int a(Context context, ArrayList<Long> arrayList) {
        int i = 0;
        if (arrayList != null) {
            if (arrayList.size() != 0) {
                j jVarA = null;
                try {
                    try {
                        jVarA = a(context);
                    } catch (Exception e2) {
                        e = e2;
                    }
                    if (!jVarA.a()) {
                        return 0;
                    }
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i < size) {
                        try {
                            if (!jVarA.b(arrayList.get(i).longValue())) {
                                if (jVarA != null) {
                                    jVarA.close();
                                }
                                return i2;
                            }
                            i2++;
                            i++;
                        } catch (Exception e3) {
                            e = e3;
                            i = i2;
                            cf.c().b(e);
                            if (jVarA != null) {
                                jVarA.close();
                            }
                            i2 = i;
                            return i2;
                        }
                    }
                    if (jVarA != null) {
                        jVarA.close();
                    }
                    return i2;
                } finally {
                    if (jVarA != null) {
                        jVarA.close();
                    }
                }
            }
        }
        return 0;
    }

    public synchronized List<String> a(Context context, int i) {
        List<String> arrayList;
        arrayList = new ArrayList<>();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        ArrayList<i> arrayList3 = new ArrayList<>();
        a(context, arrayList, arrayList2, arrayList3, i, HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        if (arrayList3.size() != 0 && arrayList.size() == 0 && arrayList2.size() == 0) {
            i iVar = arrayList3.get(0);
            long jA = iVar.a();
            String strB = iVar.b();
            arrayList2.add(Long.valueOf(jA));
            arrayList.add(strB);
        }
        int iA = a(context, arrayList2);
        if (iA != arrayList.size()) {
            arrayList = arrayList.subList(0, iA);
        }
        return arrayList;
    }

    private int a(Context context, List<String> list, ArrayList<Long> arrayList, ArrayList<i> arrayList2, int i, int i2) {
        int iC = c(context);
        int i3 = 0;
        int i4 = 0;
        while (iC > 0) {
            if (iC < i2) {
                i2 = iC;
            }
            ArrayList<i> arrayListA = a(context, i2, i4);
            if (i4 == 0 && arrayListA.size() != 0) {
                arrayList2.add(arrayListA.get(0));
            }
            Iterator<i> it = arrayListA.iterator();
            while (it.hasNext()) {
                i next = it.next();
                long jA = next.a();
                String strB = next.b();
                int length = strB.length() + i3;
                if (length > i) {
                    break;
                }
                arrayList.add(Long.valueOf(jA));
                list.add(strB);
                i3 = length;
            }
            iC -= i2;
            i4 += i2;
        }
        return i3;
    }

    public synchronized boolean b(Context context) {
        return c(context) == 0;
    }

    public synchronized boolean b(Context context, int i) {
        return c(context) >= i;
    }

    private int c(Context context) {
        j jVarA = null;
        try {
            try {
                jVarA = a(context);
            } catch (Exception e2) {
                cf.c().b(e2);
                if (jVarA == null) {
                    return 0;
                }
            }
            if (jVarA.a()) {
                int iB = jVarA.b();
                if (jVarA != null) {
                    jVarA.close();
                }
                return iB;
            }
            if (jVarA == null) {
                return 0;
            }
            jVarA.close();
            return 0;
        } catch (Throwable th) {
            if (jVarA != null) {
                jVarA.close();
            }
            throw th;
        }
    }
}
