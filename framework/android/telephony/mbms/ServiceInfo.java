package android.telephony.mbms;

public class ServiceInfo {
    static final int MAP_LIMIT = 1000;
    private final java.lang.String className = null;
    private final java.util.List<java.util.Locale> locales = null;
    private final java.util.Map<java.util.Locale, java.lang.String> names = null;
    private final java.lang.String serviceId = null;
    private final java.util.Date sessionEndTime = null;
    private final java.util.Date sessionStartTime = null;
    protected ServiceInfo(android.os.Parcel p0) {}
    public ServiceInfo(java.util.Map<java.util.Locale, java.lang.String> p0, java.lang.String p1, java.util.List<java.util.Locale> p2, java.lang.String p3, java.util.Date p4, java.util.Date p5) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<java.util.Locale> getLocales() { return null; }
    public java.lang.CharSequence getNameForLocale(java.util.Locale p0) { return null; }
    public java.util.Set<java.util.Locale> getNamedContentLocales() { return null; }
    public java.lang.String getServiceClassName() { return null; }
    public java.lang.String getServiceId() { return null; }
    public java.util.Date getSessionEndTime() { return null; }
    public java.util.Date getSessionStartTime() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
