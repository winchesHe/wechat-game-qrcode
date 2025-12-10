package com.facebook.stetho.inspector.database;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver;
import com.facebook.stetho.inspector.protocol.module.Database;
import com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class SqliteDatabaseDriver extends DatabaseDriver2<SqliteDatabaseDescriptor> {
    private static final String[] UNINTERESTING_FILENAME_SUFFIXES = {"-journal", "-shm", "-uid", "-wal"};
    private final DatabaseConnectionProvider mDatabaseConnectionProvider;
    private final DatabaseFilesProvider mDatabaseFilesProvider;

    @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver
    public /* bridge */ /* synthetic */ Database.ExecuteSQLResponse executeSQL(Object obj, String str, BaseDatabaseDriver.ExecuteResultHandler executeResultHandler) throws SQLiteException {
        return executeSQL((SqliteDatabaseDescriptor) obj, str, (BaseDatabaseDriver.ExecuteResultHandler<Database.ExecuteSQLResponse>) executeResultHandler);
    }

    @Deprecated
    public SqliteDatabaseDriver(Context context) {
        this(context, new DefaultDatabaseFilesProvider(context), new DefaultDatabaseConnectionProvider());
    }

    @Deprecated
    public SqliteDatabaseDriver(Context context, DatabaseFilesProvider databaseFilesProvider) {
        this(context, databaseFilesProvider, new DefaultDatabaseConnectionProvider());
    }

    public SqliteDatabaseDriver(Context context, DatabaseFilesProvider databaseFilesProvider, DatabaseConnectionProvider databaseConnectionProvider) {
        super(context);
        this.mDatabaseFilesProvider = databaseFilesProvider;
        this.mDatabaseConnectionProvider = databaseConnectionProvider;
    }

    @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver
    public List<SqliteDatabaseDescriptor> getDatabaseNames() {
        ArrayList arrayList = new ArrayList();
        List<File> databaseFiles = this.mDatabaseFilesProvider.getDatabaseFiles();
        Collections.sort(databaseFiles);
        Iterator<T> it = tidyDatabaseList(databaseFiles).iterator();
        while (it.hasNext()) {
            arrayList.add(new SqliteDatabaseDescriptor((File) it.next()));
        }
        return arrayList;
    }

    static List<File> tidyDatabaseList(List<File> list) {
        HashSet hashSet = new HashSet(list);
        ArrayList arrayList = new ArrayList();
        for (File file : list) {
            String path = file.getPath();
            String strRemoveSuffix = removeSuffix(path, UNINTERESTING_FILENAME_SUFFIXES);
            if (strRemoveSuffix.equals(path) || !hashSet.contains(new File(strRemoveSuffix))) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    private static String removeSuffix(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.endsWith(str2)) {
                return str.substring(0, str.length() - str2.length());
            }
        }
        return str;
    }

    @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver
    public List<String> getTableNames(SqliteDatabaseDescriptor sqliteDatabaseDescriptor) throws SQLiteException {
        SQLiteDatabase sQLiteDatabaseOpenDatabase = openDatabase(sqliteDatabaseDescriptor);
        try {
            Cursor cursorRawQuery = sQLiteDatabaseOpenDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type IN (?, ?)", new String[]{"table", "view"});
            try {
                ArrayList arrayList = new ArrayList();
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(cursorRawQuery.getString(0));
                }
                return arrayList;
            } finally {
                cursorRawQuery.close();
            }
        } finally {
            sQLiteDatabaseOpenDatabase.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse executeSQL(com.facebook.stetho.inspector.database.SqliteDatabaseDriver.SqliteDatabaseDescriptor r8, java.lang.String r9, com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver.ExecuteResultHandler<com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse> r10) throws android.database.sqlite.SQLiteException {
        /*
            r7 = this;
            com.facebook.stetho.common.Util.throwIfNull(r9)
            com.facebook.stetho.common.Util.throwIfNull(r10)
            android.database.sqlite.SQLiteDatabase r8 = r7.openDatabase(r8)
            java.lang.String r0 = getFirstWord(r9)     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = r0.toUpperCase()     // Catch: java.lang.Throwable -> L90
            int r1 = r0.hashCode()     // Catch: java.lang.Throwable -> L90
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case -2130463047: goto L51;
                case -1926899396: goto L47;
                case -1852692228: goto L3d;
                case -1785516855: goto L33;
                case -591179561: goto L29;
                case 2012838315: goto L1f;
                default: goto L1e;
            }     // Catch: java.lang.Throwable -> L90
        L1e:
            goto L5b
        L1f:
            java.lang.String r1 = "DELETE"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L5b
            r0 = 1
            goto L5c
        L29:
            java.lang.String r1 = "EXPLAIN"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L5b
            r0 = 5
            goto L5c
        L33:
            java.lang.String r1 = "UPDATE"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L5b
            r0 = 0
            goto L5c
        L3d:
            java.lang.String r1 = "SELECT"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L5b
            r0 = 3
            goto L5c
        L47:
            java.lang.String r1 = "PRAGMA"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L5b
            r0 = 4
            goto L5c
        L51:
            java.lang.String r1 = "INSERT"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L5b
            r0 = 2
            goto L5c
        L5b:
            r0 = -1
        L5c:
            if (r0 == 0) goto L86
            if (r0 == r6) goto L86
            if (r0 == r5) goto L7c
            if (r0 == r4) goto L72
            if (r0 == r3) goto L72
            if (r0 == r2) goto L72
            java.lang.Object r9 = r7.executeRawQuery(r8, r9, r10)     // Catch: java.lang.Throwable -> L90
            com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse r9 = (com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse) r9     // Catch: java.lang.Throwable -> L90
            r8.close()
            return r9
        L72:
            java.lang.Object r9 = r7.executeSelect(r8, r9, r10)     // Catch: java.lang.Throwable -> L90
            com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse r9 = (com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse) r9     // Catch: java.lang.Throwable -> L90
            r8.close()
            return r9
        L7c:
            java.lang.Object r9 = r7.executeInsert(r8, r9, r10)     // Catch: java.lang.Throwable -> L90
            com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse r9 = (com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse) r9     // Catch: java.lang.Throwable -> L90
            r8.close()
            return r9
        L86:
            java.lang.Object r9 = r7.executeUpdateDelete(r8, r9, r10)     // Catch: java.lang.Throwable -> L90
            com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse r9 = (com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse) r9     // Catch: java.lang.Throwable -> L90
            r8.close()
            return r9
        L90:
            r9 = move-exception
            r8.close()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.inspector.database.SqliteDatabaseDriver.executeSQL(com.facebook.stetho.inspector.database.SqliteDatabaseDriver$SqliteDatabaseDescriptor, java.lang.String, com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver$ExecuteResultHandler):com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse");
    }

    private static String getFirstWord(String str) {
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(32);
        return iIndexOf >= 0 ? strTrim.substring(0, iIndexOf) : strTrim;
    }

    private <T> T executeUpdateDelete(SQLiteDatabase sQLiteDatabase, String str, BaseDatabaseDriver.ExecuteResultHandler<T> executeResultHandler) {
        return executeResultHandler.handleUpdateDelete(sQLiteDatabase.compileStatement(str).executeUpdateDelete());
    }

    private <T> T executeInsert(SQLiteDatabase sQLiteDatabase, String str, BaseDatabaseDriver.ExecuteResultHandler<T> executeResultHandler) {
        return executeResultHandler.handleInsert(sQLiteDatabase.compileStatement(str).executeInsert());
    }

    private <T> T executeSelect(SQLiteDatabase sQLiteDatabase, String str, BaseDatabaseDriver.ExecuteResultHandler<T> executeResultHandler) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(str, null);
        try {
            return executeResultHandler.handleSelect(cursorRawQuery);
        } finally {
            cursorRawQuery.close();
        }
    }

    private <T> T executeRawQuery(SQLiteDatabase sQLiteDatabase, String str, BaseDatabaseDriver.ExecuteResultHandler<T> executeResultHandler) throws SQLException {
        sQLiteDatabase.execSQL(str);
        return executeResultHandler.handleRawQuery();
    }

    private SQLiteDatabase openDatabase(SqliteDatabaseDescriptor sqliteDatabaseDescriptor) throws SQLiteException {
        Util.throwIfNull(sqliteDatabaseDescriptor);
        return this.mDatabaseConnectionProvider.openDatabase(sqliteDatabaseDescriptor.file);
    }

    static class SqliteDatabaseDescriptor implements DatabaseDescriptor {
        public final File file;

        public SqliteDatabaseDescriptor(File file) {
            this.file = file;
        }

        @Override // com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor
        public String name() {
            return this.file.getName();
        }
    }
}
