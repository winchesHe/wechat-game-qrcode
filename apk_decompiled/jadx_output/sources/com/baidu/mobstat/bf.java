package com.baidu.mobstat;

import java.security.InvalidKeyException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public class bf {
    private bh a;

    private bf() {
    }

    public static bf a() throws NoSuchPaddingException {
        bf bfVar = new bf();
        bh bhVar = new bh();
        bfVar.a = bhVar;
        bhVar.a("PKCS1Padding");
        return bfVar;
    }

    public void a(int i, bi biVar) throws InvalidKeyException {
        this.a.a(i, biVar, bg.a);
    }

    public final byte[] a(byte[] bArr) {
        if (bArr != null) {
            return this.a.a(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Null input buffer");
    }
}
