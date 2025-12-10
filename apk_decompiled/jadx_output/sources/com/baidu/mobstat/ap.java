package com.baidu.mobstat;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.baidu.mobstat.af;
import com.baidu.mobstat.am;
import com.baidu.mobstat.bw;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.UByte;

/* loaded from: classes.dex */
public class ap extends am {
    private Context d;
    private g e;

    static final class a implements Comparable<a> {
        private static final String[] a = {"read0", "read1", "read2", "read3", "access0", "access1", "access2", "access3", "sync0", "sync1", "sync2", "sync3", "open0", "open1", "open2", "open3"};
        private final int b;

        private a(int i) {
            this.b = i;
        }

        public static a a(byte b, boolean z) {
            int i = b & UByte.MAX_VALUE;
            return a(z ? i >> 4 : i & 15);
        }

        public static a a(int i) {
            if (i >= 0 && i < 16) {
                return new a(i);
            }
            throw new IllegalArgumentException("invalid idx " + i);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.b - aVar.b;
        }

        public String a() {
            return a[this.b];
        }

        public byte b() {
            return (byte) this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.b == ((a) obj).b;
        }

        public int hashCode() {
            return this.b;
        }
    }

    static class b {
        private Map<a, Integer> a = new HashMap();

        b() {
        }

        public List<a> a() {
            ArrayList arrayList = new ArrayList(this.a.entrySet());
            Collections.sort(arrayList, new Comparator<Map.Entry<a, Integer>>() { // from class: com.baidu.mobstat.ap.b.1
                @Override // java.util.Comparator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(Map.Entry<a, Integer> entry, Map.Entry<a, Integer> entry2) {
                    int iIntValue = entry2.getValue().intValue() - entry.getValue().intValue();
                    return iIntValue != 0 ? iIntValue : entry.getKey().compareTo(entry2.getKey());
                }
            });
            ArrayList arrayList2 = new ArrayList(6);
            int iMin = Math.min(6, arrayList.size());
            for (int i = 0; i < iMin; i++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i);
                if (((Integer) entry.getValue()).intValue() > 1) {
                    arrayList2.add(entry.getKey());
                }
            }
            return arrayList2;
        }

        public void a(a aVar) {
            Integer num = this.a.get(aVar);
            this.a.put(aVar, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
        }
    }

    class c {
        private int b;
        private a[] c;
        private int d;

        public c() {
            this.b = 33;
            this.c = new a[33];
        }

        public c(byte[] bArr) {
            this.b = 33;
            this.c = new a[33];
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            for (int i = 0; i < bArr.length; i++) {
                a aVarA = a.a(bArr[i], false);
                a aVarA2 = a.a(bArr[i], true);
                a(aVarA);
                a(aVarA2);
            }
        }

        private void b(int i) {
            a[] aVarArr = this.c;
            if (i - aVarArr.length > 0) {
                int length = aVarArr.length;
                int i2 = length + (length >> 1);
                if (i2 - i >= 0) {
                    i = i2;
                }
                this.c = (a[]) Arrays.copyOf(aVarArr, i);
            }
        }

        public int a() {
            return this.d;
        }

        public a a(int i) {
            if (i < this.d) {
                return this.c[i];
            }
            throw new IndexOutOfBoundsException("idx " + i + " size " + this.d);
        }

        public void a(a aVar) {
            b(this.d + 1);
            a[] aVarArr = this.c;
            int i = this.d;
            this.d = i + 1;
            aVarArr[i] = aVar;
        }

        public byte[] b() {
            int i;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i2 = 0;
            while (true) {
                i = this.d;
                if (i2 >= i / 2) {
                    break;
                }
                int i3 = i2 * 2;
                byteArrayOutputStream.write((byte) (((a(i3 + 1).b() & UByte.MAX_VALUE) << 4) | (a(i3).b() & UByte.MAX_VALUE)));
                i2++;
            }
            if (i % 2 != 0) {
                byteArrayOutputStream.write((byte) (a(i - 1).b() & UByte.MAX_VALUE));
            }
            return byteArrayOutputStream.toByteArray();
        }
    }

    static class d {
        private List<a> a = new ArrayList();

        static class a {
            private int a;
            private a b;

            public a(a aVar) {
                this.b = aVar;
            }

            public void a() {
                this.a++;
            }
        }

        d() {
        }

        public List<a> a() {
            ArrayList arrayList = new ArrayList(this.a);
            Collections.sort(arrayList, new Comparator<a>() { // from class: com.baidu.mobstat.ap.d.1
                @Override // java.util.Comparator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(a aVar, a aVar2) {
                    return aVar.a - aVar2.a;
                }
            });
            return arrayList;
        }

        public void a(a aVar) {
            this.a.add(new a(aVar));
        }
    }

    static class e {
        byte[] a;
        byte b;
        byte[] c;
        boolean d;
        String e;

        public e(byte[] bArr, byte b, byte[] bArr2, boolean z, String str) {
            this.a = bArr;
            this.b = b;
            this.c = bArr2;
            this.d = z;
            this.e = str;
        }

        public static e a(bw.a aVar) {
            try {
                byte[] bArrB = ap.b(aVar.a());
                if (bArrB.length > 16) {
                    return null;
                }
                return new e(bArrB, aVar.c().getBytes("UTF-8")[0], aVar.b() != null ? aVar.b().getBytes("UTF-8") : null, aVar.d(), aVar.e());
            } catch (Exception unused) {
                return null;
            }
        }

        public bw.a a() {
            try {
                String strA = bn.a(this.a, "", true);
                String str = new String(new byte[]{this.b}, "UTF-8");
                byte[] bArr = this.c;
                return bw.a(strA, str, bArr != null ? new String(bArr, "UTF-8") : null, this.d, this.e);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static class f {
        public int a;
        public int b;
        public int c = 16;

        f() {
        }

        public String toString() {
            return "";
        }
    }

    static class g {
        private Method a;
        private Method b;
        private Method c;
        private Method d;
        private Method e;

        g() {
        }

        public int a(Context context, Uri uri, int i, int i2, int i3) throws af.a {
            try {
                return ((Integer) this.a.invoke(context, uri, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3))).intValue();
            } catch (Exception e) {
                throw new af.a(e);
            }
        }

        void a() {
            try {
                this.a = af.a(Context.class, af.a(ae.d()), new Class[]{Uri.class, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                this.b = af.a(Context.class, af.a(ae.e()), new Class[]{String.class, Uri.class, Integer.TYPE});
                this.c = af.a(ContentResolver.class, af.a(ae.f()), new Class[]{Uri.class, Integer.TYPE});
                this.d = af.a(Context.class, af.a(ae.g()), new Class[]{Uri.class, Integer.TYPE});
                this.e = af.a(ContentResolver.class, af.a(ae.h()), new Class[]{Uri.class, Integer.TYPE});
            } catch (Exception unused) {
            }
        }

        public void a(ContentResolver contentResolver, Uri uri, int i) throws IllegalAccessException, af.a, IllegalArgumentException, InvocationTargetException {
            try {
                this.c.invoke(contentResolver, uri, Integer.valueOf(i));
            } catch (Exception e) {
                throw new af.a(e);
            }
        }

        public void a(Context context, Uri uri, int i) throws IllegalAccessException, af.a, IllegalArgumentException, InvocationTargetException {
            try {
                this.d.invoke(context, uri, Integer.valueOf(i));
            } catch (Exception e) {
                throw new af.a(e);
            }
        }

        public void a(Context context, String str, Uri uri, int i) throws IllegalAccessException, af.a, IllegalArgumentException, InvocationTargetException {
            try {
                this.b.invoke(context, str, uri, Integer.valueOf(i));
            } catch (Exception e) {
                throw new af.a(e);
            }
        }

        public void b(ContentResolver contentResolver, Uri uri, int i) throws IllegalAccessException, af.a, IllegalArgumentException, InvocationTargetException {
            try {
                this.e.invoke(contentResolver, uri, Integer.valueOf(i));
            } catch (Exception e) {
                throw new af.a(e);
            }
        }
    }

    public ap() {
        super("upc", 9000000L);
        g gVar = new g();
        this.e = gVar;
        gVar.a();
    }

    private a a(String str, int i, List<d.a> list, int i2, f fVar) {
        for (d.a aVar : list) {
            if (a(str, i, aVar.b, i2, fVar)) {
                aVar.a();
                return aVar.b;
            }
        }
        return null;
    }

    private String a(String str, int i, a aVar) {
        return String.format("content://%s/dat/v1/i%d/%s", c(str), Integer.valueOf(i), aVar.a());
    }

    private String a(String str, a aVar) {
        return String.format("content://%s/dic/v1/%s", c(str), aVar.a());
    }

    private String a(String str, String str2) {
        return String.format("content://%s/clo/v1/%s", c(str), str2);
    }

    private void a(UriMatcher uriMatcher) {
        uriMatcher.addURI(c(this.d.getPackageName()), "dat/v1/*/*", 1);
        uriMatcher.addURI(c(this.d.getPackageName()), "dic/v1/*", 2);
        uriMatcher.addURI(c(this.d.getPackageName()), "clo/v1/*", 3);
    }

    private boolean a(int i, a aVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return a(Uri.parse(a(this.d.getPackageName(), i, aVar)));
    }

    private boolean a(Uri uri) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Context context = this.d;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            this.e.a(context, context.getPackageName(), uri, 65);
            this.e.a(contentResolver, uri, 1);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean a(Uri uri, int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Context context = this.d;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            this.e.a(context, uri, i);
            this.e.b(contentResolver, uri, i);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean a(a aVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return a(Uri.parse(a(this.d.getPackageName(), aVar)));
    }

    private boolean a(c cVar, List<a> list) {
        int iIntValue;
        boolean z;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        ContentResolver contentResolver = this.d.getContentResolver();
        UriMatcher uriMatcher = new UriMatcher(-1);
        a(uriMatcher);
        List<UriPermission> persistedUriPermissions = contentResolver.getPersistedUriPermissions();
        if (persistedUriPermissions == null || persistedUriPermissions.size() == 0) {
            persistedUriPermissions = contentResolver.getOutgoingPersistedUriPermissions();
        }
        if (persistedUriPermissions == null || persistedUriPermissions.size() == 0) {
            return true;
        }
        for (UriPermission uriPermission : persistedUriPermissions) {
            Uri uri = uriPermission.getUri();
            int iMatch = uriMatcher.match(uri);
            List<String> pathSegments = uri.getPathSegments();
            if ((iMatch == 1 || iMatch == 2 || iMatch == 3) && uriPermission.isWritePermission()) {
                a(uri, uriPermission.isReadPermission() ? 3 : 2);
            } else if (iMatch == 1) {
                try {
                    iIntValue = Integer.valueOf(pathSegments.get(2).substring(1)).intValue();
                } catch (Exception unused) {
                    iIntValue = -1;
                }
                if (iIntValue >= 0 && iIntValue < cVar.a()) {
                    if (!cVar.a(iIntValue).a().equals(pathSegments.get(3))) {
                    }
                }
                a(uri, 1);
            } else if (iMatch == 2) {
                String str = pathSegments.get(2);
                Iterator<a> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (it.next().a().equals(str)) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    a(uri, 1);
                }
            } else if (iMatch == 3) {
                String str2 = pathSegments.get(2);
                if (!TextUtils.equals(str2, bw.b()) && !TextUtils.equals(str2, "yes")) {
                    a(uri, 1);
                }
            }
        }
        int iA = cVar.a();
        for (int i = 0; i < iA; i++) {
            if (!a(this.d.getPackageName(), i, cVar.a(i), Process.myUid(), (f) null)) {
                return true;
            }
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!a(this.d.getPackageName(), list.get(i2), Process.myUid())) {
                return true;
            }
        }
        if (!a(this.d.getPackageName(), Process.myUid())) {
            return true;
        }
        String strB = bw.b();
        return (TextUtils.isEmpty(strB) || a(this.d.getPackageName(), strB, Process.myUid())) ? false : true;
    }

    private boolean a(String str, int i) throws InterruptedException {
        int iA;
        Uri uri = Uri.parse(d(str));
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                iA = -1;
                break;
            }
            try {
                iA = this.e.a(this.d, uri, 0, i, 1);
                break;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(5L);
                } catch (Exception unused2) {
                }
                i2++;
            }
        }
        return iA == 0;
    }

    private boolean a(String str, int i, a aVar, int i2, f fVar) throws InterruptedException {
        int iA;
        Uri uri = Uri.parse(a(str, i, aVar));
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                iA = -1;
                break;
            }
            if (fVar != null) {
                try {
                    fVar.a++;
                } catch (Throwable unused) {
                    try {
                        Thread.sleep(5L);
                    } catch (Exception unused2) {
                    }
                    i3++;
                }
            }
            iA = this.e.a(this.d, uri, 0, i2, 1);
            break;
        }
        if (iA == 0) {
            return true;
        }
        if (fVar != null) {
            fVar.b++;
        }
        return false;
    }

    private boolean a(String str, a aVar, int i) throws InterruptedException {
        int iA;
        Uri uri = Uri.parse(a(str, aVar));
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                iA = -1;
                break;
            }
            try {
                iA = this.e.a(this.d, uri, 0, i, 1);
                break;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(5L);
                } catch (Exception unused2) {
                }
                i2++;
            }
        }
        return iA == 0;
    }

    private boolean a(String str, String str2, int i) throws InterruptedException {
        int iA;
        Uri uri = Uri.parse(a(str, str2));
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                iA = -1;
                break;
            }
            try {
                iA = this.e.a(this.d, uri, 0, i, 1);
                break;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(5L);
                } catch (Exception unused2) {
                }
                i2++;
            }
        }
        return iA == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    private String c(String str) {
        return str + ".cesium";
    }

    private String d(String str) {
        return String.format("content://%s/clo/v1/%s", c(str), "yes");
    }

    private boolean e(String str) {
        if (!TextUtils.isEmpty(str) && Build.VERSION.SDK_INT >= 26) {
            return a(Uri.parse(d(this.d.getPackageName()))) && a(Uri.parse(a(this.d.getPackageName(), str)));
        }
        return false;
    }

    @Override // com.baidu.mobstat.am
    public am.e a(am.d dVar, bw.a aVar) {
        e eVarA;
        if (Build.VERSION.SDK_INT >= 26 && (eVarA = e.a(aVar)) != null) {
            c cVar = new c(eVarA.a);
            cVar.a(a.a(eVarA.b, false));
            cVar.a(a.a(eVarA.b, true));
            if (eVarA.c != null) {
                for (byte b2 : eVarA.c) {
                    cVar.a(a.a(b2, false));
                    cVar.a(a.a(b2, true));
                }
            }
            b bVar = new b();
            for (int i = 0; i < cVar.a(); i++) {
                bVar.a(cVar.a(i));
            }
            List<a> listA = bVar.a();
            if (!a(cVar, listA)) {
                return am.e.a();
            }
            for (int iA = cVar.a() - 1; iA >= 0; iA--) {
                a(iA, cVar.a(iA));
            }
            Iterator<a> it = listA.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            e(bw.b());
            return am.e.a();
        }
        return am.e.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01a1  */
    @Override // com.baidu.mobstat.am
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.baidu.mobstat.am.g a(java.lang.String r21, com.baidu.mobstat.am.f r22) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mobstat.ap.a(java.lang.String, com.baidu.mobstat.am$f):com.baidu.mobstat.am$g");
    }

    @Override // com.baidu.mobstat.am
    public void a(am.c cVar) {
        this.d = this.a.a;
    }
}
