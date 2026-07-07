package android.app.admin;

public class FreezePeriod {
    static final int DAYS_IN_YEAR = 365;
    private static final int SENTINEL_YEAR = 2001;
    private static final java.lang.String TAG = "FreezePeriod";
    private final java.time.MonthDay mEnd = null;
    private final int mEndDay = 0;
    private final java.time.MonthDay mStart = null;
    private final int mStartDay = 0;
    private FreezePeriod(int p0, int p1) {}
    public FreezePeriod(java.time.MonthDay p0, java.time.MonthDay p1) {}
    static java.util.List<android.app.admin.FreezePeriod> canonicalizePeriods(java.util.List<android.app.admin.FreezePeriod> p0) { return null; }
    private static int dayOfYearDisregardLeapYear(java.time.LocalDate p0) { return 0; }
    private static java.time.MonthDay dayOfYearToMonthDay(int p0) { return null; }
    public static int distanceWithoutLeapYear(java.time.LocalDate p0, java.time.LocalDate p1) { return 0; }
    static void validateAgainstPreviousFreezePeriod(java.util.List<android.app.admin.FreezePeriod> p0, java.time.LocalDate p1, java.time.LocalDate p2, java.time.LocalDate p3) {}
    static void validatePeriods(java.util.List<android.app.admin.FreezePeriod> p0) {}
    boolean after(java.time.LocalDate p0) { return false; }
    boolean contains(java.time.LocalDate p0) { return false; }
    int getEffectiveEndDay() { return 0; }
    public java.time.MonthDay getEnd() { return null; }
    int getLength() { return 0; }
    public java.time.MonthDay getStart() { return null; }
    boolean isWrapped() { return false; }
    android.util.Pair<java.time.LocalDate, java.time.LocalDate> toCurrentOrFutureRealDates(java.time.LocalDate p0) { return null; }
    public java.lang.String toString() { return null; }
}
