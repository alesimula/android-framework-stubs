package android.app;

public class LocaleConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.LocaleConfig> CREATOR = null;
    public static final int STATUS_NOT_SPECIFIED = 1;
    public static final int STATUS_PARSING_FAILED = 2;
    public static final int STATUS_SUCCESS = 0;
    private static final java.lang.String TAG = "LocaleConfig";
    public static final java.lang.String TAG_LOCALE = "locale";
    public static final java.lang.String TAG_LOCALE_CONFIG = "locale-config";
    private java.util.Locale mDefaultLocale;
    private android.os.LocaleList mLocales;
    private int mStatus;
    public LocaleConfig(android.content.Context p0) {}
    private LocaleConfig(android.content.Context p0, boolean p1) {}
    public LocaleConfig(android.content.pm.ApplicationInfo p0, android.content.res.Resources p1) {}
    public LocaleConfig(android.os.LocaleList p0) {}
    private LocaleConfig(android.os.Parcel p0) {}
    public static android.app.LocaleConfig fromContextIgnoringOverride(android.content.Context p0) { return null; }
    private static boolean getAllowOverride() { return false; }
    private void parseLocaleConfig(int p0, android.content.res.Resources p1) {}
    public boolean containsLocale(java.util.Locale p0) { return false; }
    public int describeContents() { return 0; }
    public java.util.Locale getDefaultLocale() { return null; }
    public int getStatus() { return 0; }
    public android.os.LocaleList getSupportedLocales() { return null; }
    public boolean isSameLocaleConfig(android.app.LocaleConfig p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
