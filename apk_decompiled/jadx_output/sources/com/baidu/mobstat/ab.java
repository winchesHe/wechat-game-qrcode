package com.baidu.mobstat;

import java.util.Arrays;

/* loaded from: classes.dex */
public class ab {
    ah[] a = {new ai(8, 0), new aj(0, 1), new aj(1, 1), new ai(7, 1)};

    public byte[] a(byte[] bArr) {
        ag agVar = new ag();
        byte[] bArrA = ad.a(bArr, bArr.length + ((this.a.length + 1) * ag.a));
        ad.a(bArrA, agVar.a(), bArr.length);
        int i = 0;
        while (true) {
            ah[] ahVarArr = this.a;
            if (i >= ahVarArr.length) {
                return Arrays.copyOf(agVar.a(), ag.a);
            }
            ah ahVar = ahVarArr[i];
            i++;
            int length = bArr.length + (ag.a * i);
            agVar.a(ahVar.a(bArrA, 0, length), ahVar.a(), ahVar.b(), ahVar.c());
            ad.a(bArrA, agVar.a(), length);
        }
    }
}
