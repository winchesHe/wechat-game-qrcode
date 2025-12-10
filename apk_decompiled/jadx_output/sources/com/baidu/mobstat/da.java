package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class da {
    private static da a = new da();
    private static String b = "";

    public static da a() {
        return a;
    }

    public void a(Context context, final cz czVar) {
        String strA = dc.a(context);
        b = strA;
        if (TextUtils.isEmpty(strA)) {
            cy.a(context, new db() { // from class: com.baidu.mobstat.da.1
                @Override // com.baidu.mobstat.db
                public void a(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String unused = da.b = str;
                    cz czVar2 = czVar;
                    if (czVar2 != null) {
                        czVar2.a(da.b);
                    }
                }
            });
        } else if (czVar != null) {
            czVar.a(b);
        }
    }
}
