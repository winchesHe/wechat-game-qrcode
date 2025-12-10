package com.baidu.mobstat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import java.io.Closeable;
import java.util.ArrayList;

/* loaded from: classes.dex */
abstract class j implements Closeable {
    private l a;

    public abstract long a(String str, String str2);

    public abstract ArrayList<i> a(int i, int i2);

    public abstract boolean b(long j);

    public j(Context context, String str, String str2) {
        try {
            this.a = new l(context, str);
            if (context.getDatabasePath(y.e) != null) {
                a(str2);
            }
        } catch (Exception unused) {
        }
    }

    private void a(String str) throws SQLException {
        this.a.a(str);
    }

    public synchronized boolean a() {
        try {
        } catch (Exception e) {
            cf.c().b(e);
            return false;
        }
        return this.a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.a.close();
        } catch (Exception e) {
            cf.c().b(e);
        }
    }

    protected int b() {
        return this.a.b();
    }

    protected Cursor a(String str, int i, int i2) {
        return this.a.a(null, null, null, null, null, str + " desc", i2 + ", " + i);
    }

    protected Cursor a(String str, String str2, String str3, int i) {
        String str4 = str + "=? ";
        String[] strArr = {str2};
        return this.a.a(null, str4, strArr, null, null, str3 + " desc", i + "");
    }

    protected long a(ContentValues contentValues) {
        return this.a.a((String) null, contentValues);
    }

    protected boolean a(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("");
        return this.a.a("_id=? ", new String[]{sb.toString()}) > 0;
    }
}
