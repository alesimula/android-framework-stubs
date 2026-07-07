package android.text.format;

class TimeFormatter {
    private static final int DAYSPERLYEAR = 366;
    private static final int DAYSPERNYEAR = 365;
    private static final int DAYSPERWEEK = 7;
    private static final int FORCE_LOWER_CASE = -1;
    private static final int HOURSPERDAY = 24;
    private static final int MINSPERHOUR = 60;
    private static final int MONSPERYEAR = 12;
    private static final int SECSPERMIN = 60;
    private static java.lang.String sDateOnlyFormat;
    private static java.lang.String sDateTimeFormat;
    private static java.util.Locale sLocale;
    private static java.lang.String sTimeOnlyFormat;
    private final java.lang.String dateOnlyFormat = null;
    private final java.lang.String dateTimeFormat = null;
    private java.util.Formatter numberFormatter;
    private java.lang.StringBuilder outputBuilder;
    private final java.lang.String timeOnlyFormat = null;
    public TimeFormatter() {}
    private static void append2DigitNumber(java.lang.StringBuilder p0, int p1) {}
    private static boolean brokenIsLower(char p0) { return false; }
    private static boolean brokenIsUpper(char p0) { return false; }
    private static char brokenToLower(char p0) { return 0; }
    private static char brokenToUpper(char p0) { return 0; }
    private void formatInternal(java.lang.String p0, com.android.i18n.timezone.WallTime p1, com.android.i18n.timezone.ZoneInfoData p2) {}
    private static java.lang.String getFormat(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return null; }
    private boolean handleToken(java.nio.CharBuffer p0, com.android.i18n.timezone.WallTime p1, com.android.i18n.timezone.ZoneInfoData p2) { return false; }
    private static boolean isLeap(int p0) { return false; }
    private java.lang.String localizeDigits(java.lang.String p0) { return null; }
    private void modifyAndAppend(java.lang.CharSequence p0, int p1) {}
    private void outputYear(int p0, boolean p1, boolean p2, int p3) {}
    public java.lang.String format(java.lang.String p0, com.android.i18n.timezone.WallTime p1, com.android.i18n.timezone.ZoneInfoData p2) { return null; }
    java.lang.String formatMillisWithFixedFormat(long p0) { return null; }
}
