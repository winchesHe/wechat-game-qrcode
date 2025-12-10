package com.baidu.mobstat;

/* loaded from: classes.dex */
final class aj extends ah {
    public aj(int i, int i2) {
        this.a = 4294967295L;
        this.b = 4;
        this.c = 32;
        this.d = i;
        this.e = i2;
    }

    @Override // com.baidu.mobstat.ah
    public ac a(byte[] bArr, int i, int i2) {
        ak akVar = new ak();
        akVar.a(bArr, i, i2);
        return ac.a(new long[]{akVar.a()});
    }
}
