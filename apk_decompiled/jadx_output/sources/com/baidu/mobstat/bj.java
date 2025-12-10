package com.baidu.mobstat;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class bj implements bi {
    private BigInteger a;
    private BigInteger b;

    public bj(byte[] bArr, byte[] bArr2) {
        this.a = new BigInteger(bArr);
        this.b = new BigInteger(bArr2);
    }

    @Override // com.baidu.mobstat.bi
    public BigInteger a() {
        return this.a;
    }

    @Override // com.baidu.mobstat.bi
    public BigInteger b() {
        return this.b;
    }
}
