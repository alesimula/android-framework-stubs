package android.text.format;

public final class Formatter {
    public static final int FLAG_CALCULATE_ROUNDED = 2;
    public static final int FLAG_IEC_UNITS = 8;
    public static final int FLAG_SHORTER = 1;
    public static final int FLAG_SI_UNITS = 4;
    private static final int MILLIS_PER_MINUTE = 60000;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    public Formatter() {}
    private static java.lang.String bidiWrap(android.content.Context p0, java.lang.String p1) { return null; }
    private static java.lang.String deleteFirstFromString(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.text.format.Formatter.BytesResult formatBytes(android.content.res.Resources p0, long p1, int p2) { return null; }
    public static java.lang.String formatFileSize(android.content.Context p0, long p1) { return null; }
    public static java.lang.String formatFileSize(android.content.Context p0, long p1, int p2) { return null; }
    @java.lang.Deprecated
    public static java.lang.String formatIpAddress(int p0) { return null; }
    private static java.lang.String formatMeasureShort(java.util.Locale p0, android.icu.text.NumberFormat p1, float p2, android.icu.util.MeasureUnit p3) { return null; }
    private static java.lang.String formatRoundedBytesResult(android.content.Context p0, android.text.format.Formatter.RoundedBytesResult p1) { return null; }
    public static java.lang.String formatShortElapsedTime(android.content.Context p0, long p1) { return null; }
    public static java.lang.String formatShortElapsedTimeRoundingUpToMinutes(android.content.Context p0, long p1) { return null; }
    public static java.lang.String formatShortFileSize(android.content.Context p0, long p1) { return null; }
    private static java.lang.String getByteSuffixOverride(android.content.res.Resources p0) { return null; }
    private static android.icu.text.NumberFormat getNumberFormatter(java.util.Locale p0, int p1) { return null; }
    private static java.util.Locale localeFromContext(android.content.Context p0) { return null; }

    public static class BytesResult {
        public final long roundedBytes = 0L;
        public final java.lang.String units = null;
        public final java.lang.String unitsContentDescription = null;
        public final java.lang.String value = null;
        public BytesResult(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3) {}
    }

    public static class RoundedBytesResult {
        public final int fractionDigits = 0;
        public final long roundedBytes = 0L;
        public final float value = 0.0f;
        private RoundedBytesResult(float p0, android.icu.util.MeasureUnit p1, int p2, long p3) {}
        public static android.text.format.Formatter.RoundedBytesResult roundBytes(long p0, int p1) { return null; }
    }
}
