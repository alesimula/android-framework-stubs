package android.text.format;

@java.lang.Deprecated
public class Time {
    private static final int[] DAYS_PER_MONTH = null;
    public static final int EPOCH_JULIAN_DAY = 2440588;
    public static final int FRIDAY = 5;
    public static final int HOUR = 3;
    public static final int MINUTE = 2;
    public static final int MONDAY = 1;
    public static final int MONDAY_BEFORE_JULIAN_EPOCH = 2440585;
    public static final int MONTH = 5;
    public static final int MONTH_DAY = 4;
    public static final int SATURDAY = 6;
    public static final int SECOND = 1;
    public static final int SUNDAY = 0;
    public static final int THURSDAY = 4;
    public static final java.lang.String TIMEZONE_UTC = "UTC";
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int WEEK_DAY = 7;
    public static final int WEEK_NUM = 9;
    public static final int YEAR = 6;
    public static final int YEAR_DAY = 8;
    private static final java.lang.String Y_M_D = "%Y-%m-%d";
    private static final java.lang.String Y_M_D_T_H_M_S_000 = "%Y-%m-%dT%H:%M:%S.000";
    private static final java.lang.String Y_M_D_T_H_M_S_000_Z = "%Y-%m-%dT%H:%M:%S.000Z";
    private static final int[] sThursdayOffset = null;
    public boolean allDay;
    private android.text.format.Time.TimeCalculator calculator;
    public long gmtoff;
    public int hour;
    public int isDst;
    public int minute;
    public int month;
    public int monthDay;
    public int second;
    public java.lang.String timezone;
    public int weekDay;
    public int year;
    public int yearDay;
    public Time() {}
    public Time(android.text.format.Time p0) {}
    public Time(java.lang.String p0) {}
    private void checkChar(java.lang.String p0, int p1, char p2) {}
    public static int compare(android.text.format.Time p0, android.text.format.Time p1) { return 0; }
    private static int getChar(java.lang.String p0, int p1, int p2) { return 0; }
    public static java.lang.String getCurrentTimezone() { return null; }
    @java.lang.Deprecated
    public static int getJulianDay(long p0, long p1) { return 0; }
    public static int getJulianMondayFromWeeksSinceEpoch(int p0) { return 0; }
    public static int getWeeksSinceEpochFromJulianDay(int p0, int p1) { return 0; }
    private void initialize(java.lang.String p0) {}
    public static boolean isEpoch(android.text.format.Time p0) { return false; }
    private boolean parse3339Internal(java.lang.String p0) { return false; }
    private boolean parseInternal(java.lang.String p0) { return false; }
    public boolean after(android.text.format.Time p0) { return false; }
    public boolean before(android.text.format.Time p0) { return false; }
    public void clear(java.lang.String p0) {}
    public java.lang.String format(java.lang.String p0) { return null; }
    public java.lang.String format2445() { return null; }
    public java.lang.String format3339(boolean p0) { return null; }
    public int getActualMaximum(int p0) { return 0; }
    public int getWeekNumber() { return 0; }
    public long normalize(boolean p0) { return 0L; }
    public boolean parse(java.lang.String p0) { return false; }
    public boolean parse3339(java.lang.String p0) { return false; }
    public void set(int p0, int p1, int p2) {}
    public void set(int p0, int p1, int p2, int p3, int p4, int p5) {}
    public void set(long p0) {}
    public void set(android.text.format.Time p0) {}
    public long setJulianDay(int p0) { return 0L; }
    public void setToNow() {}
    public void switchTimezone(java.lang.String p0) {}
    public long toMillis(boolean p0) { return 0L; }
    public java.lang.String toString() { return null; }

    private static class TimeCalculator {
        public java.lang.String timezone;
        public TimeCalculator(java.lang.String p0) {}
        public static int compare(android.text.format.Time.TimeCalculator p0, android.text.format.Time.TimeCalculator p1) { return 0; }
        private static com.android.i18n.timezone.ZoneInfoData lookupZoneInfoData(java.lang.String p0) { return null; }
        private char toChar(int p0) { return 0; }
        private void updateZoneInfoFromTimeZone() {}
        public void copyFieldsFromTime(android.text.format.Time p0) {}
        public void copyFieldsToTime(android.text.format.Time p0) {}
        public java.lang.String format(java.lang.String p0) { return null; }
        public java.lang.String format2445(boolean p0) { return null; }
        public void setTimeInMillis(long p0) {}
        public void switchTimeZone(java.lang.String p0) {}
        public long toMillis(boolean p0) { return 0L; }
        public java.lang.String toStringInternal() { return null; }
    }
}
