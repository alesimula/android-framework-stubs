package com.android.i18n.timezone;

public class CountryTimeZones {
    public CountryTimeZones() {}
    public java.lang.String getCountryIso() { return null; }
    public android.icu.util.TimeZone getDefaultTimeZone() { return null; }
    public java.lang.String getDefaultTimeZoneId() { return null; }
    public java.util.List getEffectiveTimeZoneMappingsAt(long p0) { return null; }
    public boolean hasUtcZone(long p0) { return false; }
    public boolean isDefaultTimeZoneBoosted() { return false; }
    public com.android.i18n.timezone.CountryTimeZones.OffsetResult lookupByOffsetWithBias(long p0, android.icu.util.TimeZone p1, int p2) { return null; }
    public com.android.i18n.timezone.CountryTimeZones.OffsetResult lookupByOffsetWithBias(long p0, android.icu.util.TimeZone p1, int p2, boolean p3) { return null; }
    public java.util.List getTimeZoneMappings() { return null; }

    public static class TimeZoneMapping {
        public TimeZoneMapping() {}
        public android.icu.util.TimeZone getTimeZone() { return null; }
        public java.lang.String getTimeZoneId() { return null; }
        public boolean isShownInPickerAt(java.time.Instant p0) { return false; }
    }

    public static class OffsetResult {
        public OffsetResult() {}
        public android.icu.util.TimeZone getTimeZone() { return null; }
        public boolean isOnlyMatch() { return false; }
    }
}
