package android.timezone;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public final class TimeZoneFinder {
    private static android.timezone.TimeZoneFinder sInstance;
    private static final java.lang.Object sLock = null;
    private TimeZoneFinder(com.android.i18n.timezone.TimeZoneFinder p0) {}
    public static android.timezone.TimeZoneFinder getInstance() { return null; }
    public java.lang.String getIanaVersion() { return null; }
    public android.timezone.CountryTimeZones lookupCountryTimeZones(java.lang.String p0) { return null; }
}
