package com.core.base.utils;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.baidu.mobstat.Config;
import java.io.File;

/* loaded from: classes.dex */
public class GetImgFromAlbum {
    public static String getRealPathFromUri(Context context, Uri uri) {
        if (uri == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return getRealPathFromUriAboveApiAndroidQ(context, uri);
        }
        return getRealPathFromUriAboveApiAndroidK(context, uri);
    }

    private static String getRealPathFromUriAboveApiAndroidQ(Context context, Uri uri) {
        Cursor cursorQuery;
        String realPathFromUriAboveApiAndroidK = getRealPathFromUriAboveApiAndroidK(context, uri);
        if (realPathFromUriAboveApiAndroidK != null) {
            return realPathFromUriAboveApiAndroidK;
        }
        try {
            cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=? ", new String[]{realPathFromUriAboveApiAndroidK}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("_id");
                        if (columnIndex == -1) {
                            return null;
                        }
                        int i = cursorQuery.getInt(columnIndex);
                        return String.valueOf(Uri.withAppendedPath(Uri.parse("content://media/external/images/media"), "" + i));
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            }
            if (!new File(realPathFromUriAboveApiAndroidK).exists()) {
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", realPathFromUriAboveApiAndroidK);
            return String.valueOf(context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues));
        } catch (Exception unused2) {
            cursorQuery = null;
        }
    }

    private static String getRealPathFromUriBelowApiAndroidK(Context context, Uri uri) {
        return getDataColumn(context, uri, null, null);
    }

    private static String getRealPathFromUriAboveApiAndroidK(Context context, Uri uri) {
        String dataColumn;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            if (isMediaDocument(uri)) {
                dataColumn = getDataColumn(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{documentId.split(Config.TRACE_TODAY_VISIT_SPLIT)[1]});
            } else {
                if (!isDownloadsDocument(uri)) {
                    return null;
                }
                dataColumn = getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
            }
            return dataColumn;
        }
        if ("content".equalsIgnoreCase(uri.getScheme())) {
            return getDataColumn(context, uri, null, null);
        }
        if ("file".equals(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    private static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursorQuery;
        String[] strArr2 = {"_data"};
        try {
            cursorQuery = context.getContentResolver().query(uri, strArr2, str, strArr, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                if (cursorQuery.moveToFirst()) {
                    return cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(strArr2[0]));
                }
                return null;
            } catch (Exception unused) {
                if (cursorQuery == null) {
                    return null;
                }
                cursorQuery.close();
                return null;
            }
        } catch (Exception unused2) {
            cursorQuery = null;
        }
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }
}
