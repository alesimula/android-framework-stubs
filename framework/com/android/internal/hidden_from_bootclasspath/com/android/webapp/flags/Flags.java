package com.android.internal.hidden_from_bootclasspath.com.android.webapp.flags;

public final class Flags {
    private static com.android.internal.hidden_from_bootclasspath.com.android.webapp.flags.FeatureFlags FEATURE_FLAGS;
    public static final java.lang.String FLAG_ENABLE_WEB_APP_SERVICE_BY_DEFAULT = "com.android.webapp.flags.enable_web_app_service_by_default";
    public static final java.lang.String FLAG_ENABLE_WEB_APP_SERVICE_V2 = "com.android.webapp.flags.enable_web_app_service_v2";
    public Flags() {}
    public static boolean enableWebAppServiceByDefault() { return false; }
    public static boolean enableWebAppServiceV2() { return false; }
}
