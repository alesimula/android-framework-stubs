package com.android.internal.widget.remotecompose.core;

public class CalendarSystemClock implements com.android.internal.widget.remotecompose.core.RemoteClock {
    private final java.util.Calendar mCalendar = null;
    private final java.util.TimeZone mTimeZone = null;
    public CalendarSystemClock() {}
    public CalendarSystemClock(java.util.TimeZone p0) {}
    public java.lang.String getZoneId() { return null; }
    public long millis() { return 0L; }
    public long nanoTime() { return 0L; }
    public com.android.internal.widget.remotecompose.core.RemoteClock.TimeSnapshot snapshot(java.lang.Long p0) { return null; }

    static class CalendarTimeSnapshot implements com.android.internal.widget.remotecompose.core.RemoteClock.TimeSnapshot {
        private final java.util.Calendar mCal = null;
        private final long mMillis = 0L;
        private final java.util.TimeZone mTz = null;
        CalendarTimeSnapshot(long p0, java.util.Calendar p1, java.util.TimeZone p2) {}
        private java.util.Calendar getCalendar() { return null; }
        public int getDayOfMonth() { return 0; }
        public int getDayOfWeek() { return 0; }
        public int getDayOfYear() { return 0; }
        public int getHour() { return 0; }
        public long getMillis() { return 0L; }
        public int getMillisOfSecond() { return 0; }
        public int getMinute() { return 0; }
        public int getMonth() { return 0; }
        public int getOffsetSeconds() { return 0; }
        public int getSecond() { return 0; }
        public int getYear() { return 0; }
    }
}
