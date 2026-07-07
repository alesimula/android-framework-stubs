package android.timezone;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public final class CountryTimeZones {
    CountryTimeZones(com.android.i18n.timezone.CountryTimeZones p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getCountryIso() { return null; }
    public android.icu.util.TimeZone getDefaultTimeZone() { return null; }
    public java.lang.String getDefaultTimeZoneId() { return null; }
    public java.util.List<android.timezone.CountryTimeZones.TimeZoneMapping> getEffectiveTimeZoneMappingsAt(long p0) { return null; }
    public boolean hasUtcZone(long p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isDefaultTimeZoneBoosted() { return false; }
    public android.timezone.CountryTimeZones.OffsetResult lookupByOffsetWithBias(long p0, android.icu.util.TimeZone p1, int p2) { return null; }
    public android.timezone.CountryTimeZones.OffsetResult lookupByOffsetWithBias(long p0, android.icu.util.TimeZone p1, int p2, boolean p3) { return null; }
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final class OffsetResult {
        private final java.lang.String mCountryIsoCode = null;
        private final boolean mIsOnlyMatch = false;
        public OffsetResult(android.icu.util.TimeZone p0, java.lang.String p1, boolean p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getCountryIsoCode() { return null; }
        public android.icu.util.TimeZone getTimeZone() { return null; }
        public int hashCode() { return 0; }
        public boolean isOnlyMatch() { return false; }
        public java.lang.String toString() { return null; }
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final class TimeZoneMapping {
        TimeZoneMapping(com.android.i18n.timezone.CountryTimeZones.TimeZoneMapping p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public android.icu.util.TimeZone getTimeZone() { return null; }
        public java.lang.String getTimeZoneId() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
