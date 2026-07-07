package com.android.internal.widget.remotecompose.core;

public interface RemoteClock {
    public static final com.android.internal.widget.remotecompose.core.RemoteClock SYSTEM = null;
    public java.lang.String getZoneId();
    public long millis();
    public long nanoTime();
    public com.android.internal.widget.remotecompose.core.RemoteClock.TimeSnapshot snapshot(java.lang.Long p0);

    public static interface TimeSnapshot {
        default public float getContinuousSeconds() { return 0.0f; }
        public int getDayOfMonth();
        public int getDayOfWeek();
        public int getDayOfYear();
        default public int getEpochSeconds() { return 0; }
        public int getHour();
        public long getMillis();
        public int getMillisOfSecond();
        public int getMinute();
        public int getMonth();
        public int getOffsetSeconds();
        public int getSecond();
        default public float getTime(float p0) { return 0.0f; }
        default public float getTimeInMin() { return 0.0f; }
        default public float getTimeInSec() { return 0.0f; }
        public int getYear();
    }
}
