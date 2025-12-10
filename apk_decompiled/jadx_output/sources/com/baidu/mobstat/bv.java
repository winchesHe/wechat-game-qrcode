package com.baidu.mobstat;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings;
import android.system.ErrnoException;
import android.system.Os;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.android.common.util.DeviceId;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class bv {
    private Context a;
    private bl b;

    static class a {
        static boolean a(String str, int i) throws ErrnoException {
            try {
                Os.chmod(str, i);
                return true;
            } catch (Exception e) {
                bu.a(e);
                return false;
            }
        }
    }

    public bv(Context context, bl blVar) {
        this.a = context;
        this.b = blVar;
    }

    private br a(Context context) {
        List<aq> listB = this.b.b(context);
        br brVarB = null;
        if (listB != null) {
            File filesDir = context.getFilesDir();
            String name = "files";
            if (!"files".equals(filesDir.getName())) {
                Log.e("CuidV266Manager", "fetal error:: app files dir name is unexpectedly :: " + filesDir.getAbsolutePath());
                name = filesDir.getName();
            }
            for (aq aqVar : listB) {
                if (!aqVar.d) {
                    File file = new File(new File(aqVar.a.dataDir, name), "libcuid.so");
                    if (file.exists() && (brVarB = br.b(bu.a(file))) != null) {
                        break;
                    }
                }
            }
        }
        return brVarB;
    }

    private boolean a() {
        return c("android.permission.WRITE_SETTINGS");
    }

    private boolean a(String str, String str2) {
        try {
            return Settings.System.putString(this.a.getContentResolver(), str, str2);
        } catch (Exception e) {
            bu.a(e);
            return false;
        }
    }

    private br b() {
        File file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid2");
        if (file.exists()) {
            return br.b(bu.a(file));
        }
        return null;
    }

    private static void b(String str, String str2) {
        File file;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file2 = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig");
        File file3 = new File(file2, ".cuid");
        try {
            if (file2.exists() && !file2.isDirectory()) {
                Random random = new Random();
                File parentFile = file2.getParentFile();
                String name = file2.getName();
                do {
                    file = new File(parentFile, name + random.nextInt() + ".tmp");
                } while (file.exists());
                file2.renameTo(file);
                file.delete();
            }
            file2.mkdirs();
            FileWriter fileWriter = new FileWriter(file3, false);
            byte[] bArrA = ax.a();
            fileWriter.write(bm.a(at.a(bArrA, bArrA, (str + "=" + str2).getBytes()), "utf-8"));
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException | Exception unused) {
        }
    }

    private boolean b(String str) throws IOException {
        String absolutePath;
        int i;
        int i2 = (!DeviceId.sDataCuidInfoShable || Build.VERSION.SDK_INT >= 24) ? 0 : 1;
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            try {
                fileOutputStreamOpenFileOutput = this.a.openFileOutput("libcuid.so", i2);
                fileOutputStreamOpenFileOutput.write(str.getBytes());
                fileOutputStreamOpenFileOutput.flush();
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e) {
                        bu.a(e);
                    }
                }
                if (i2 == 0 && DeviceId.sDataCuidInfoShable) {
                    absolutePath = new File(this.a.getFilesDir(), "libcuid.so").getAbsolutePath();
                    i = 436;
                } else {
                    if (DeviceId.sDataCuidInfoShable) {
                        return true;
                    }
                    absolutePath = new File(this.a.getFilesDir(), "libcuid.so").getAbsolutePath();
                    i = 432;
                }
                return a.a(absolutePath, i);
            } catch (Throwable th) {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e2) {
                        bu.a(e2);
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            bu.a(e3);
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (Exception e4) {
                    bu.a(e4);
                }
            }
            return false;
        }
    }

    private br c() {
        return br.a(d("com.baidu.deviceid"), d("bd_setting_i"));
    }

    private boolean c(String str) {
        return this.a.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    private String d(String str) {
        try {
            return Settings.System.getString(this.a.getContentResolver(), str);
        } catch (Exception e) {
            bu.a(e);
            return null;
        }
    }

    private static void e(String str) {
        File file;
        File file2 = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig");
        File file3 = new File(file2, ".cuid2");
        try {
            if (file2.exists() && !file2.isDirectory()) {
                Random random = new Random();
                File parentFile = file2.getParentFile();
                String name = file2.getName();
                do {
                    file = new File(parentFile, name + random.nextInt() + ".tmp");
                } while (file.exists());
                file2.renameTo(file);
                file.delete();
            }
            file2.mkdirs();
            FileWriter fileWriter = new FileWriter(file3, false);
            fileWriter.write(str);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException | Exception unused) {
        }
    }

    private String f(String str) {
        return PropertyType.UID_PROPERTRY;
    }

    private br g(String str) throws IOException {
        String str2;
        String[] strArrSplit;
        String str3 = "";
        File file = new File(Environment.getExternalStorageDirectory(), "baidu/.cuid");
        if (!file.exists()) {
            file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid");
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append("\r\n");
            }
            bufferedReader.close();
            byte[] bArrA = ax.a();
            strArrSplit = new String(at.b(bArrA, bArrA, bm.a(sb.toString().getBytes()))).split("=");
        } catch (FileNotFoundException | IOException | Exception unused) {
        }
        if (strArrSplit == null || strArrSplit.length != 2) {
            str2 = "";
        } else {
            str2 = strArrSplit[0];
            try {
                str3 = strArrSplit[1];
            } catch (FileNotFoundException | IOException | Exception unused2) {
            }
        }
        return br.a(str3, str2);
    }

    public br a(String str) throws IOException {
        boolean z;
        br brVarA = a(this.a);
        if (brVarA == null) {
            brVarA = br.b(d("com.baidu.deviceid.v2"));
        }
        boolean zC = c("android.permission.READ_EXTERNAL_STORAGE");
        if (brVarA == null && zC) {
            brVarA = b();
        }
        if (brVarA == null) {
            brVarA = c();
        }
        if (brVarA == null && zC) {
            brVarA = g(f(""));
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f("");
        }
        if (brVarA != null) {
            brVarA.d();
        }
        return brVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c A[PHI: r6
      0x007c: PHI (r6v11 java.lang.String) = (r6v1 java.lang.String), (r6v1 java.lang.String), (r6v10 java.lang.String) binds: [B:27:0x007a, B:34:0x0091, B:33:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.baidu.mobstat.br r6) throws java.io.IOException {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r5.a
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "libcuid.so"
            r0.<init>(r1, r2)
            java.lang.String r6 = r6.c()
            boolean r1 = r0.exists()
            if (r1 != 0) goto L1b
        L17:
            r5.b(r6)
            goto L36
        L1b:
            java.lang.String r0 = com.baidu.mobstat.bu.a(r0)
            com.baidu.mobstat.br r0 = com.baidu.mobstat.br.b(r0)
            if (r0 == 0) goto L33
            boolean r1 = r0.d()
            if (r1 == 0) goto L36
            java.lang.String r0 = r0.c()
            r5.b(r0)
            goto L36
        L33:
            if (r0 != 0) goto L36
            goto L17
        L36:
            boolean r0 = r5.a()
            if (r0 == 0) goto L63
            java.lang.String r1 = "com.baidu.deviceid.v2"
            java.lang.String r2 = r5.d(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L4c
        L48:
            r5.a(r1, r6)
            goto L63
        L4c:
            com.baidu.mobstat.br r2 = com.baidu.mobstat.br.b(r2)
            if (r2 == 0) goto L60
            boolean r3 = r2.d()
            if (r3 == 0) goto L63
            java.lang.String r2 = r2.c()
            r5.a(r1, r2)
            goto L63
        L60:
            if (r2 != 0) goto L63
            goto L48
        L63:
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r1 = r5.c(r1)
            if (r1 == 0) goto L94
            java.io.File r2 = new java.io.File
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r4 = "backups/.SystemConfig/.cuid2"
            r2.<init>(r3, r4)
            boolean r2 = r2.exists()
            if (r2 != 0) goto L80
        L7c:
            e(r6)
            goto L94
        L80:
            com.baidu.mobstat.br r2 = r5.b()
            if (r2 == 0) goto L91
            boolean r6 = r2.d()
            if (r6 == 0) goto L94
            java.lang.String r6 = r2.c()
            goto L7c
        L91:
            if (r2 != 0) goto L94
            goto L7c
        L94:
            if (r0 == 0) goto Lbd
            java.lang.String r6 = "bd_setting_i"
            java.lang.String r0 = r5.d(r6)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto La4
            r2 = 0
            goto La8
        La4:
            int r2 = r0.length()
        La8:
            boolean r2 = com.baidu.mobstat.br.a(r2)
            if (r2 == 0) goto Lb4
            java.lang.String r0 = "O"
        Lb0:
            r5.a(r6, r0)
            goto Lbd
        Lb4:
            boolean r0 = com.baidu.mobstat.br.a(r0)
            if (r0 == 0) goto Lbd
            java.lang.String r0 = "0"
            goto Lb0
        Lbd:
            if (r1 == 0) goto Lea
            java.io.File r6 = new java.io.File
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = "backups/.SystemConfig/.cuid"
            r6.<init>(r0, r1)
            boolean r6 = r6.exists()
            if (r6 != 0) goto Ld1
            goto Lea
        Ld1:
            java.lang.String r6 = ""
            java.lang.String r6 = r5.f(r6)
            com.baidu.mobstat.br r6 = r5.g(r6)
            if (r6 == 0) goto Lea
            boolean r0 = r6.d()
            if (r0 == 0) goto Lea
            java.lang.String r0 = r6.b
            java.lang.String r6 = r6.a
            b(r0, r6)
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mobstat.bv.a(com.baidu.mobstat.br):void");
    }
}
