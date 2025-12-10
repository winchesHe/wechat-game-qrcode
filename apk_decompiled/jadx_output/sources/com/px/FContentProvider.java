package com.px;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.cloudinject.feature.p019.C0242;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class FContentProvider extends ContentProvider {
    private ContentProvider mRealContentProvider;

    public FContentProvider() {
        try {
            this.mRealContentProvider = (ContentProvider) C0242.m2159().loadClass(getClass().getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return this.mRealContentProvider.onCreate();
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.mRealContentProvider.query(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return this.mRealContentProvider.getType(uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return this.mRealContentProvider.insert(uri, contentValues);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.mRealContentProvider.delete(uri, str, strArr);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.mRealContentProvider.update(uri, contentValues, str, strArr);
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, String str3, Bundle bundle) {
        return this.mRealContentProvider.call(str, str2, str3, bundle);
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        return this.mRealContentProvider.call(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public void onCallingPackageChanged() {
        this.mRealContentProvider.onCallingPackageChanged();
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mRealContentProvider.onConfigurationChanged(configuration);
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mRealContentProvider.onLowMemory();
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        this.mRealContentProvider.onTrimMemory(i);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return this.mRealContentProvider.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        return this.mRealContentProvider.query(uri, strArr, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public Uri canonicalize(Uri uri) {
        return this.mRealContentProvider.canonicalize(uri);
    }

    @Override // android.content.ContentProvider
    public Uri uncanonicalize(Uri uri) {
        return this.mRealContentProvider.uncanonicalize(uri);
    }

    @Override // android.content.ContentProvider
    public boolean refresh(Uri uri, Bundle bundle, CancellationSignal cancellationSignal) {
        return this.mRealContentProvider.refresh(uri, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues, Bundle bundle) {
        return this.mRealContentProvider.insert(uri, contentValues, bundle);
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return this.mRealContentProvider.bulkInsert(uri, contentValuesArr);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, Bundle bundle) {
        return this.mRealContentProvider.delete(uri, bundle);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, Bundle bundle) {
        return this.mRealContentProvider.update(uri, contentValues, bundle);
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return this.mRealContentProvider.openFile(uri, str);
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
        return this.mRealContentProvider.openFile(uri, str, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openAssetFile(Uri uri, String str) throws FileNotFoundException {
        return this.mRealContentProvider.openAssetFile(uri, str);
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
        return this.mRealContentProvider.openAssetFile(uri, str, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public String[] getStreamTypes(Uri uri, String str) {
        return this.mRealContentProvider.getStreamTypes(uri, str);
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) throws FileNotFoundException {
        return this.mRealContentProvider.openTypedAssetFile(uri, str, bundle);
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) throws FileNotFoundException {
        return this.mRealContentProvider.openTypedAssetFile(uri, str, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public <T> ParcelFileDescriptor openPipeHelper(Uri uri, String str, Bundle bundle, T t, ContentProvider.PipeDataWriter<T> pipeDataWriter) throws FileNotFoundException {
        return this.mRealContentProvider.openPipeHelper(uri, str, bundle, t, pipeDataWriter);
    }

    @Override // android.content.ContentProvider
    public ContentProviderResult[] applyBatch(String str, ArrayList<ContentProviderOperation> arrayList) throws OperationApplicationException {
        return this.mRealContentProvider.applyBatch(str, arrayList);
    }

    @Override // android.content.ContentProvider
    public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> arrayList) throws OperationApplicationException {
        return this.mRealContentProvider.applyBatch(arrayList);
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        this.mRealContentProvider.shutdown();
    }

    @Override // android.content.ContentProvider
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.mRealContentProvider.dump(fileDescriptor, printWriter, strArr);
    }
}
