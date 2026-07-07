package com.android.internal.widget.remotecompose.core;

public class SystemClock implements com.android.internal.widget.remotecompose.core.RemoteClock {
    private final java.time.Clock mClock = null;
    public SystemClock() {}
    public SystemClock(java.time.Clock p0) {}
    public java.lang.String getZoneId() { return null; }
    public long millis() { return 0L; }
    public long nanoTime() { return 0L; }
    public com.android.internal.widget.remotecompose.core.RemoteClock.TimeSnapshot snapshot(java.lang.Long p0) { return null; }

    static class JavaTimeSnapshot implements com.android.internal.widget.remotecompose.core.RemoteClock.TimeSnapshot {
        private final java.time.ZonedDateTime mZdt = null;
        JavaTimeSnapshot(java.time.ZonedDateTime p0) {}
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
