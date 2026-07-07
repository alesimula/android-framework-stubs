package com.android.internal.app;

public class LocaleStore {
    private static final java.lang.String TAG = null;
    private static final int TIER_LANGUAGE = 1;
    private static final int TIER_NUMBERING = 3;
    private static final int TIER_REGION = 2;
    private static boolean sFullyInitialized;
    private static final java.util.HashMap<java.lang.String, com.android.internal.app.LocaleStore.LocaleInfo> sLocaleCache = null;
    private static java.util.Set<java.lang.String> sSimCountries;
    public LocaleStore() {}
    private static void addLocaleInfoToMap(java.util.Locale p0, com.android.internal.app.LocaleStore.LocaleInfo p1, java.util.HashMap<java.lang.String, com.android.internal.app.LocaleStore.LocaleInfo> p2) {}
    private static void addSuggestedLocalesForRegion(java.util.Locale p0) {}
    public static java.util.HashMap<java.lang.String, com.android.internal.app.LocaleStore.LocaleInfo> convertExplicitLocales(android.os.LocaleList p0, java.util.Collection<com.android.internal.app.LocaleStore.LocaleInfo> p1) { return null; }
    public static void fillCache(android.content.Context p0) {}
    public static com.android.internal.app.LocaleStore.LocaleInfo fromLocale(java.util.Locale p0) { return null; }
    public static com.android.internal.app.LocaleStore.LocaleInfo getAppActivatedLocaleInfo(android.content.Context p0, java.lang.String p1, boolean p2) { return null; }
    public static java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getLevelLocales(android.content.Context p0, java.util.Set<java.lang.String> p1, com.android.internal.app.LocaleStore.LocaleInfo p2, boolean p3) { return null; }
    public static java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getLevelLocales(android.content.Context p0, java.util.Set<java.lang.String> p1, com.android.internal.app.LocaleStore.LocaleInfo p2, boolean p3, android.os.LocaleList p4) { return null; }
    public static com.android.internal.app.LocaleStore.LocaleInfo getLocaleInfo(java.util.Locale p0) { return null; }
    private static com.android.internal.app.LocaleStore.LocaleInfo getLocaleInfo(java.util.Locale p0, java.util.HashMap<java.lang.String, com.android.internal.app.LocaleStore.LocaleInfo> p1) { return null; }
    private static int getLocaleTier(com.android.internal.app.LocaleStore.LocaleInfo p0) { return 0; }
    private static java.util.Locale getLocaleWithOnlyNumberingSystem(java.util.Locale p0) { return null; }
    private static java.util.Set<java.lang.String> getSimCountries(android.content.Context p0) { return null; }
    public static java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getSystemCurrentLocales() { return null; }
    public static com.android.internal.app.LocaleStore.LocaleInfo getSystemDefaultLocaleInfo(boolean p0) { return null; }
    private static java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getTierLocales(java.util.Set<java.lang.String> p0, com.android.internal.app.LocaleStore.LocaleInfo p1, boolean p2, java.util.HashMap<java.lang.String, com.android.internal.app.LocaleStore.LocaleInfo> p3) { return null; }
    private static boolean isShallIgnore(java.util.Set<java.lang.String> p0, com.android.internal.app.LocaleStore.LocaleInfo p1, boolean p2) { return false; }
    public static boolean isSimOrNwCountryAvailable() { return false; }
    private static android.os.LocaleList matchLocaleFromSupportedLocaleList(android.os.LocaleList p0, java.util.Collection<com.android.internal.app.LocaleStore.LocaleInfo> p1) { return null; }
    public static void updateSimCountries(android.content.Context p0) {}

    public static class LocaleInfo implements java.io.Serializable {
        public static final int SUGGESTION_TYPE_CFG = 2;
        public static final int SUGGESTION_TYPE_CURRENT = 4;
        public static final int SUGGESTION_TYPE_IME_LANGUAGE = 32;
        public static final int SUGGESTION_TYPE_NONE = 0;
        public static final int SUGGESTION_TYPE_OTHER_APP_LANGUAGE = 16;
        public static final int SUGGESTION_TYPE_SIM = 1;
        public static final int SUGGESTION_TYPE_SYSTEM_AVAILABLE_LANGUAGE = 64;
        public static final int SUGGESTION_TYPE_SYSTEM_LANGUAGE = 8;
        private java.lang.String mFullCountryNameNative;
        private java.lang.String mFullNameNative;
        private boolean mHasNumberingSystems;
        private final java.lang.String mId = null;
        private boolean mIsChecked;
        private boolean mIsPseudo;
        private boolean mIsTranslated;
        private java.lang.String mLangScriptKey;
        private final java.util.Locale mLocale = null;
        private final java.util.Locale mParent = null;
        public int mSuggestionFlags;
        private LocaleInfo(com.android.internal.app.LocaleStore.LocaleInfo p0) {}
        private LocaleInfo(java.lang.String p0) {}
        private LocaleInfo(java.util.Locale p0) {}
        private java.lang.String getLangScriptKey() { return null; }
        private static java.util.Locale getParent(java.util.Locale p0) { return null; }
        public void extendSuggestionOfType(int p0) {}
        public boolean getChecked() { return false; }
        java.lang.String getContentDescription(boolean p0) { return null; }
        java.lang.String getFullCountryNameInUiLanguage() { return null; }
        public java.lang.String getFullCountryNameNative() { return null; }
        public java.lang.String getFullNameInUiLanguage() { return null; }
        public java.lang.String getFullNameNative() { return null; }
        public java.lang.String getId() { return null; }
        java.lang.String getLabel(boolean p0) { return null; }
        public java.util.Locale getLocale() { return null; }
        java.lang.String getNumberingSystem() { return null; }
        public java.util.Locale getParent() { return null; }
        public boolean hasNumberingSystems() { return false; }
        public boolean isAppCurrentLocale() { return false; }
        public boolean isInCurrentSystemLocales() { return false; }
        public boolean isSuggested() { return false; }
        public boolean isSuggestionOfType(int p0) { return false; }
        public boolean isSystemLocale() { return false; }
        public boolean isTranslated() { return false; }
        public void setChecked(boolean p0) {}
        public void setTranslated(boolean p0) {}
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SuggestionType {
        }
    }
}
