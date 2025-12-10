package com.baidu.mobstat;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.system.ErrnoException;
import android.system.Os;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes.dex */
public class CarUUID {
    private static final Pattern a = Pattern.compile("(\\w{32})");

    public static String optUUID(Context context) {
        String strB = b(context);
        if (strB != null) {
            return strB;
        }
        String strC = c(context);
        if (strC != null) {
            a(context, strC);
            return strC;
        }
        String strA = a(context);
        if (strA == null) {
            return "";
        }
        a(context, strA);
        return strA;
    }

    private static String a(Context context) {
        return UUID.randomUUID().toString().replace(HelpFormatter.DEFAULT_OPT_PREFIX, "");
    }

    private static String b(Context context) {
        return a(context.getFileStreamPath("libdueros_uuid.so"));
    }

    private static String c(Context context) {
        String strA;
        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(0);
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        for (ApplicationInfo applicationInfo2 : installedApplications) {
            if (!applicationInfo.packageName.equals(applicationInfo2.packageName) && (strA = a(new File(new File(applicationInfo2.dataDir, "files"), "libdueros_uuid.so"))) != null) {
                return strA;
            }
        }
        return null;
    }

    private static boolean a(Context context, String str) {
        boolean z = false;
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            fileOutputStreamOpenFileOutput = context.openFileOutput("libdueros_uuid.so", 0);
            if (a(fileOutputStreamOpenFileOutput, str)) {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                File fileStreamPath = context.getFileStreamPath("libdueros_uuid.so");
                if (a(new File(applicationInfo.dataDir), 457)) {
                    if (a(fileStreamPath, 484)) {
                        z = true;
                    }
                }
                ct.a(fileOutputStreamOpenFileOutput);
                return z;
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            ct.a(fileOutputStreamOpenFileOutput);
            throw th;
        }
        ct.a(fileOutputStreamOpenFileOutput);
        return false;
    }

    private static String a(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (file != null && file.exists()) {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception unused) {
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[1024];
                String str = new String(bArr, 0, fileInputStream.read(bArr));
                String str2 = a.matcher(str).matches() ? str : null;
                ct.a(fileInputStream);
                return str2;
            } catch (Exception unused2) {
                ct.a(fileInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                ct.a(fileInputStream2);
                throw th;
            }
        }
        return null;
    }

    private static boolean a(FileOutputStream fileOutputStream, String str) throws IOException {
        try {
            fileOutputStream.write(str.getBytes());
            fileOutputStream.flush();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(File file, int i) throws ErrnoException {
        try {
            Os.chmod(file.getAbsolutePath(), i);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
