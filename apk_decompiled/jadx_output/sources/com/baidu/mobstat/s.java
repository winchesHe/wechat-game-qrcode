package com.baidu.mobstat;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import androidx.exifinterface.media.ExifInterface;
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
public abstract class s {
    public static final s a;
    public static final s b;
    public static final s c;
    public static final s d;
    private static final /* synthetic */ s[] f;
    private int e;

    public abstract void a(Context context);

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f.clone();
    }

    static {
        int i = 1;
        s sVar = new s("SERVICE", 0, i) { // from class: com.baidu.mobstat.s.1
            @Override // com.baidu.mobstat.s
            public void a(Context context) {
                if (t.a(context).b(context)) {
                    try {
                        Intent intent = new Intent(context, Class.forName("com.baidu.bottom.service.BottomService"));
                        intent.putExtra("SDK_PRODUCT_LY", "MS");
                        context.startService(intent);
                    } catch (Throwable th) {
                        cf.c().b(th);
                    }
                }
            }
        };
        a = sVar;
        int i2 = 2;
        s sVar2 = new s("NO_SERVICE", i, i2) { // from class: com.baidu.mobstat.s.2
            @Override // com.baidu.mobstat.s
            public void a(Context context) {
                Context applicationContext = context.getApplicationContext();
                a aVarA = t.a(context);
                aa aaVar = new aa();
                aaVar.a = false;
                aaVar.b = "M";
                aaVar.c = false;
                aVarA.a(applicationContext, aaVar.a());
            }
        };
        b = sVar2;
        int i3 = 3;
        s sVar3 = new s("RECEIVER", i2, i3) { // from class: com.baidu.mobstat.s.3
            @Override // com.baidu.mobstat.s
            public void a(Context context) {
                Context applicationContext = context.getApplicationContext();
                a aVarA = t.a(context);
                aa aaVar = new aa();
                aaVar.a = false;
                aaVar.b = "R";
                aaVar.c = false;
                aVarA.a(applicationContext, aaVar.a());
            }
        };
        c = sVar3;
        s sVar4 = new s("ERISED", i3, 4) { // from class: com.baidu.mobstat.s.4
            @Override // com.baidu.mobstat.s
            public void a(Context context) {
                Context applicationContext = context.getApplicationContext();
                a aVarA = t.a(context);
                aa aaVar = new aa();
                aaVar.a = false;
                aaVar.b = ExifInterface.LONGITUDE_EAST;
                aaVar.c = false;
                aVarA.a(applicationContext, aaVar.a());
            }
        };
        d = sVar4;
        f = new s[]{sVar, sVar2, sVar3, sVar4};
    }

    private s(String str, int i, int i2) {
        this.e = i2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.e);
    }

    public static s a(int i) {
        for (s sVar : values()) {
            if (sVar.e == i) {
                return sVar;
            }
        }
        return b;
    }

    public static boolean b(Context context) throws SecurityException {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            try {
                List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
                int i = 0;
                while (runningServices != null) {
                    if (i >= runningServices.size()) {
                        break;
                    }
                    if ("com.baidu.bottom.service.BottomService".equals(runningServices.get(i).service.getClassName())) {
                        return true;
                    }
                    i++;
                }
            } catch (Exception e) {
                cf.c().a(e);
            }
        }
        return false;
    }
}
