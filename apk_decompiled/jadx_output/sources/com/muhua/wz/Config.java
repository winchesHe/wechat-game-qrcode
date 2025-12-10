package com.muhua.wz;

/* loaded from: classes.dex */
public class Config {
    public static final String KEY_BAIDU_TJ = "fd1ec7267f";
    private static final String TEST_PC_URL = "https://api-dev.cm.muhuakeji.com";
    private static final String TEST_URL = "https://dev-api.cm.muhuakeji.com";
    private static final String TEST_WEB_URL = "https://cmm-dev.muhuakeji.com";
    private static final String URL = "https://api.cm.muhuakeji.com";
    private static final String WEB_URL = "https://cmm.muhuakeji.com";

    public static String getBaseUrl() {
        return URL;
    }

    public static String getWebUrl() {
        return WEB_URL;
    }
}
