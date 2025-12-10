package com.baidu.mobstat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
class l extends SQLiteOpenHelper {
    private String a;
    private SQLiteDatabase b;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public l(Context context, String str) throws SQLiteException {
        super(context, y.e, (SQLiteDatabase.CursorFactory) null, 1);
        this.a = str;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
    }

    public synchronized boolean a() {
        boolean z;
        SQLiteDatabase sQLiteDatabase = this.b;
        z = false;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            try {
                this.b = getWritableDatabase();
            } catch (NullPointerException unused) {
                throw new NullPointerException("db path is null");
            }
        }
        SQLiteDatabase sQLiteDatabase2 = this.b;
        if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
            z = true;
        }
        return z;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public synchronized void close() {
        super.close();
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.b = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getReadableDatabase() {
        return super.getReadableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getWritableDatabase() {
        return super.getWritableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
    }

    public void a(String str) throws SQLException {
        getWritableDatabase().execSQL(str);
    }

    public final int b() {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.b.rawQuery("SELECT COUNT(*) FROM " + this.a, null);
            if (cursorRawQuery != null && cursorRawQuery.moveToNext()) {
                return cursorRawQuery.getInt(0);
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return 0;
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    public Cursor a(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        return this.b.query(this.a, strArr, str, strArr2, str2, str3, str4, str5);
    }

    public long a(String str, ContentValues contentValues) {
        return this.b.insert(this.a, str, contentValues);
    }

    public int a(String str, String[] strArr) {
        return this.b.delete(this.a, str, strArr);
    }
}
