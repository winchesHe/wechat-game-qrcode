package com.baidu.mobstat;

import com.baidu.mobstat.af;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class ai extends ah {
    private a f;

    static class a {
        private Class<?> a;
        private Method b;
        private Method c;

        private a() {
            a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a(Object obj) throws af.a {
            try {
                return ((Long) this.c.invoke(obj, new Object[0])).longValue();
            } catch (Exception unused) {
                throw new af.a("");
            }
        }

        private void a() {
            try {
                this.a = Class.forName(af.a(ae.a()), true, Object.class.getClassLoader());
                this.b = af.a(this.a, af.a(ae.b()), new Class[]{byte[].class, Integer.TYPE, Integer.TYPE});
                this.c = af.a(this.a, af.a(ae.c()), null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Object obj, byte[] bArr, int i, int i2) throws IllegalAccessException, af.a, IllegalArgumentException, InvocationTargetException {
            try {
                this.b.invoke(obj, bArr, Integer.valueOf(i), Integer.valueOf(i2));
            } catch (Exception unused) {
                throw new af.a("");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object b() {
            return this.a.newInstance();
        }
    }

    public ai(int i, int i2) {
        this.a = 1099511627775L;
        this.b = 4;
        this.c = 32;
        this.d = i;
        this.e = i2;
        this.f = new a();
    }

    @Override // com.baidu.mobstat.ah
    public ac a(byte[] bArr, int i, int i2) {
        long jA;
        try {
            Object objB = this.f.b();
            this.f.a(objB, bArr, i, i2);
            jA = this.f.a(objB);
        } catch (Exception unused) {
            jA = 4294967295L;
        }
        return ac.a(new long[]{jA});
    }
}
