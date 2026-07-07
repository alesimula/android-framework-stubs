package com.android.internal.app;

public class AppLocaleStore {
    private static final java.lang.String TAG = null;
    public AppLocaleStore() {}
    private static java.util.HashSet<java.util.Locale> filterNotMatchingLocale(java.util.HashSet<java.util.Locale> p0, java.util.HashSet<java.util.Locale> p1) { return null; }
    public static com.android.internal.app.AppLocaleStore.AppLocaleResult getAppSupportedLocales(android.content.Context p0, java.lang.String p1) { return null; }
    private static java.util.HashSet<java.util.Locale> getAssetLocales(android.content.Context p0, java.lang.String p1) { return null; }
    private static boolean hasInstallerInfo(android.content.Context p0, java.lang.String p1) { return false; }
    private static boolean isSystemApp(android.content.Context p0, java.lang.String p1) { return false; }
    private static boolean matchLanguageInSet(java.util.Locale p0, java.util.HashSet<java.util.Locale> p1) { return false; }

    public static class AppLocaleResult {
        public java.util.HashSet<java.util.Locale> mAppSupportedLocales;
        com.android.internal.app.AppLocaleStore.AppLocaleResult.LocaleStatus mLocaleStatus;
        public AppLocaleResult(com.android.internal.app.AppLocaleStore.AppLocaleResult.LocaleStatus p0, java.util.HashSet<java.util.Locale> p1) {}

        public static enum LocaleStatus {
            ASSET_LOCALE_IS_EMPTY,
            GET_SUPPORTED_LANGUAGE_FROM_ASSET,
            GET_SUPPORTED_LANGUAGE_FROM_LOCAL_CONFIG,
            NO_SUPPORTED_LANGUAGE_IN_APP,
            UNKNOWN_FAILURE;
            private static final com.android.internal.app.AppLocaleStore.AppLocaleResult.LocaleStatus[] $VALUES = null;
            private LocaleStatus() {}
        }
    }
}
