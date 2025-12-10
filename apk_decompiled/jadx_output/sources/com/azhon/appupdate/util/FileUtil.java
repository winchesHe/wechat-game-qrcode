package com.azhon.appupdate.util;

import com.baidu.mobstat.Config;
import com.muhua.wz.util.MD5Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/azhon/appupdate/util/FileUtil;", "", "()V", "Companion", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FileUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: FileUtil.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/azhon/appupdate/util/FileUtil$Companion;", "", "()V", "createDirDirectory", "", Config.FEED_LIST_ITEM_PATH, "", "md5", "file", "Ljava/io/File;", "appupdate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void createDirDirectory(String path) {
            Intrinsics.checkNotNullParameter(path, "path");
            File file = new File(path);
            if (file.exists()) {
                return;
            }
            file.mkdirs();
        }

        public final String md5(File file) throws NoSuchAlgorithmException, IOException {
            Intrinsics.checkNotNullParameter(file, "file");
            try {
                byte[] bArr = new byte[1024];
                MessageDigest messageDigest = MessageDigest.getInstance(MD5Util.TAG);
                FileInputStream fileInputStream = new FileInputStream(file);
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i != -1) {
                        messageDigest.update(bArr, 0, i);
                    } else {
                        fileInputStream.close();
                        String string = new BigInteger(1, messageDigest.digest()).toString(16);
                        Intrinsics.checkNotNullExpressionValue(string, "bigInt.toString(16)");
                        String upperCase = string.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        return upperCase;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
    }
}
