package android.service.notification;

public class ScheduleCalendar {
    public static final boolean DEBUG = Boolean.valueOf(false);
    public static final java.lang.String TAG = "ScheduleCalendar";
    private final java.util.Calendar mCalendar = null;
    private final android.util.ArraySet<java.lang.Integer> mDays = null;
    private android.service.notification.ZenModeConfig.ScheduleInfo mSchedule;
    public ScheduleCalendar() {}
    private long addDays(long p0, int p1) { return 0L; }
    private int getDayOfWeek(long p0) { return 0; }
    private long getNextTime(long p0, int p1, int p2, boolean p3) { return 0L; }
    private long getTime(long p0, int p1, int p2) { return 0L; }
    private boolean isInSchedule(int p0, long p1, long p2, long p3) { return false; }
    private void updateDays() {}
    public boolean exitAtAlarm() { return false; }
    public long getClosestActualTime(long p0, int p1, int p2) { return 0L; }
    public long getNextChangeTime(long p0) { return 0L; }
    public boolean isAlarmInSchedule(long p0, long p1) { return false; }
    public boolean isInSchedule(long p0) { return false; }
    public void maybeSetNextAlarm(long p0, long p1) {}
    public void setSchedule(android.service.notification.ZenModeConfig.ScheduleInfo p0) {}
    public void setTimeZone(java.util.TimeZone p0) {}
    public boolean shouldExitForAlarm(long p0) { return false; }
    public java.lang.String toString() { return null; }
}
