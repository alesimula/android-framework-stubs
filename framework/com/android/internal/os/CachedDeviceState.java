package com.android.internal.os;

public class CachedDeviceState {
    private volatile boolean mCharging;
    private final java.util.ArrayList<com.android.internal.os.CachedDeviceState.TimeInStateStopwatch> mOnBatteryStopwatches = null;
    private volatile boolean mScreenInteractive;
    private final java.lang.Object mStopwatchesLock = null;
    public CachedDeviceState() {}
    public CachedDeviceState(boolean p0, boolean p1) {}
    private void updateStopwatches(boolean p0) {}
    public com.android.internal.os.CachedDeviceState.Readonly getReadonlyClient() { return null; }
    public void setCharging(boolean p0) {}
    public void setScreenInteractive(boolean p0) {}

    public class Readonly {
        public Readonly(com.android.internal.os.CachedDeviceState p0) {}
        public com.android.internal.os.CachedDeviceState.TimeInStateStopwatch createTimeOnBatteryStopwatch() { return null; }
        public boolean isCharging() { return false; }
        public boolean isScreenInteractive() { return false; }
    }

    public class TimeInStateStopwatch implements java.lang.AutoCloseable {
        private final java.lang.Object mLock = null;
        private long mStartTimeMillis;
        private long mTotalTimeMillis;
        public TimeInStateStopwatch(com.android.internal.os.CachedDeviceState p0) {}
        private long elapsedTime() { return 0L; }
        private void start() {}
        private void stop() {}
        public void close() {}
        public long getMillis() { return 0L; }
        public boolean isRunning() { return false; }
        public void reset() {}
    }
}
