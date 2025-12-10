package com.baidu.mobstat;

/* loaded from: classes.dex */
class ag {
    public static int a = 5;
    public static int b = 40;
    private ac c;

    public ag() {
        ac acVar = new ac(b);
        this.c = acVar;
        acVar.a(0, b, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.baidu.mobstat.ac r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            com.baidu.mobstat.ac r0 = r3.c
            int r1 = r5 + r6
            com.baidu.mobstat.ac r0 = r0.c(r5, r1)
            if (r7 == 0) goto L20
            r1 = 1
            if (r7 == r1) goto L1c
            r1 = 2
            if (r7 == r1) goto L18
            r1 = 3
            if (r7 == r1) goto L14
            goto L1c
        L14:
            r0.b(r4)
            goto L23
        L18:
            r0.d(r4)
            goto L23
        L1c:
            r0.c(r4)
            goto L23
        L20:
            r0.a(r4)
        L23:
            r4 = 0
        L24:
            if (r4 >= r6) goto L34
            com.baidu.mobstat.ac r7 = r3.c
            int r1 = r5 + r4
            boolean r2 = r0.c(r4)
            r7.a(r1, r2)
            int r4 = r4 + 1
            goto L24
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mobstat.ag.a(com.baidu.mobstat.ac, int, int, int):void");
    }

    public byte[] a() {
        return this.c.a();
    }
}
