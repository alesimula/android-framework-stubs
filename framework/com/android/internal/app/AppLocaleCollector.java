package com.android.internal.app;

public class AppLocaleCollector implements com.android.internal.app.LocaleCollectorBase {
    private static final boolean ENABLED = true;
    private static final java.lang.String PROP_APP_LANGUAGE_SUGGESTION = "android.app.language.suggestion.enhanced";
    private static final java.lang.String TAG = null;
    private java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> mAllAppActiveLocales;
    private com.android.internal.app.LocaleStore.LocaleInfo mAppCurrentLocale;
    private final java.lang.String mAppPackageName = null;
    private final android.content.Context mContext = null;
    private java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> mImeLocales;
    public AppLocaleCollector(android.content.Context p0, java.lang.String p1) {}
    private java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> addImeSuggestionFlag(java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> p0) { return null; }
    private java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> addScript(java.util.Set<java.util.Locale> p0) { return null; }
    private boolean addSystemSuggestionFlag(com.android.internal.app.LocaleStore.LocaleInfo p0, java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> p1) { return false; }
    private java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> filterSameLanguageAndCountry(java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> p0, java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> p1) { return null; }
    private java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> filterSupportedLocales(java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> p0, java.util.HashSet<java.util.Locale> p1) { return null; }
    private android.view.inputmethod.InputMethodInfo getActiveIme(android.view.inputmethod.InputMethodManager p0) { return null; }
    private java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getSuggestedLocales(java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> p0) { return null; }
    private boolean shouldAddScript(java.util.Locale p0, java.util.Locale p1) { return false; }
    public java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getActiveImeLocales() { return null; }
    public java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getAllAppActiveLocales() { return null; }
    public com.android.internal.app.LocaleStore.LocaleInfo getAppCurrentLocale() { return null; }
    public com.android.internal.app.AppLocaleStore.AppLocaleResult getAppSupportedLocales() { return null; }
    public java.util.Set<java.lang.String> getIgnoredLocaleList(boolean p0) { return null; }
    public java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getSupportedLocaleList(com.android.internal.app.LocaleStore.LocaleInfo p0, boolean p1, boolean p2) { return null; }
    public java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getSystemCurrentLocales() { return null; }
    public java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getSystemSupportedLocale(java.util.Set<java.lang.String> p0, com.android.internal.app.LocaleStore.LocaleInfo p1, boolean p2) { return null; }
    public boolean hasSpecificPackageName() { return false; }
}
