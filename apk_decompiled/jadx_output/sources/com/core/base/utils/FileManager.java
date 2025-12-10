package com.core.base.utils;

import android.content.Context;
import android.graphics.Bitmap;
import com.core.base.Injection;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public class FileManager {
    private static volatile FileManager instance;
    private File mCacheFolder;

    public static FileManager getInstance() {
        if (instance == null) {
            synchronized (FileManager.class) {
                if (instance == null) {
                    instance = new FileManager();
                }
            }
        }
        return instance;
    }

    public FileManager() {
        this.mCacheFolder = null;
        this.mCacheFolder = getCacheDir();
    }

    public File saveImage(String str, Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        return saveImage(str, bitmap, compressFormat, 100);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.core.base.utils.FileManager] */
    public File saveImage(String str, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        if (!this.mCacheFolder.exists()) {
            this.mCacheFolder.mkdirs();
        }
        ?? r1 = this.mCacheFolder;
        File file = new File((File) r1, str);
        if (file.exists()) {
            file.delete();
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    if (BitmapUtils.saveBitmap(bitmap, file.getAbsolutePath(), compressFormat, i)) {
                        close(fileOutputStream);
                        return file;
                    }
                    close(fileOutputStream);
                    return null;
                } catch (FileNotFoundException e) {
                    e = e;
                    e.printStackTrace();
                    close(fileOutputStream);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                close(r1);
                throw th;
            }
        } catch (FileNotFoundException e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th3) {
            r1 = 0;
            th = th3;
            close(r1);
            throw th;
        }
    }

    public File saveByte2Image(String str, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        if (!this.mCacheFolder.exists()) {
            this.mCacheFolder.mkdirs();
        }
        File file = new File(this.mCacheFolder, str);
        Closeable closeable = null;
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            fileOutputStream.write(bArr);
            close(fileOutputStream);
        } catch (IOException e2) {
            e = e2;
            closeable = fileOutputStream;
            e.printStackTrace();
            close(closeable);
            return file;
        } catch (Throwable th2) {
            th = th2;
            closeable = fileOutputStream;
            close(closeable);
            throw th;
        }
        return file;
    }

    public File getCacheDir() {
        Context contextProvideApplicationContext = Injection.INSTANCE.provideApplicationContext();
        File externalFilesDir = contextProvideApplicationContext.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = contextProvideApplicationContext.getFilesDir();
        }
        if (externalFilesDir == null) {
            return null;
        }
        File file = new File(externalFilesDir, "cache");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public String getCachePath() {
        return getCacheDir() == null ? "" : getCacheDir().getAbsolutePath();
    }

    public void close(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            Lg.e("IOUtils", "error while close", e);
        }
    }

    public File getCacheFile(String str) throws IOException {
        if (!this.mCacheFolder.exists()) {
            this.mCacheFolder.mkdirs();
        }
        File file = new File(this.mCacheFolder, str);
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                return file;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return file;
            } catch (IOException e2) {
                e2.printStackTrace();
                return file;
            }
        } finally {
            close(null);
        }
    }

    public boolean copyFile(File file, String str) throws IOException {
        if (file != null && str != null) {
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
            }
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                FileChannel channel = new FileInputStream(file).getChannel();
                FileChannel channel2 = new FileOutputStream(file2).getChannel();
                channel.transferTo(0L, channel.size(), channel2);
                try {
                    channel.close();
                    channel2.close();
                    return true;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return true;
                }
            } catch (FileNotFoundException | IOException unused) {
            }
        }
        return false;
    }
}
