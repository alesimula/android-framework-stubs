package com.android.internal.os;

public class LooperStats implements android.os.Looper.Observer {
    public static final java.lang.String DEBUG_ENTRY_PREFIX = "__DEBUG_";
    public static final boolean DEFAULT_IGNORE_BATTERY_STATUS = false;
    private static final boolean DISABLED_SCREEN_STATE_TRACKING_VALUE = false;
    private static final int SESSION_POOL_SIZE = 50;
    private boolean mAddDebugEntries;
    private com.android.internal.os.CachedDeviceState.TimeInStateStopwatch mBatteryStopwatch;
    private com.android.internal.os.CachedDeviceState.Readonly mDeviceState;
    private final android.util.SparseArray<com.android.internal.os.LooperStats.Entry> mEntries = null;
    private final int mEntriesSizeCap = 0;
    private final com.android.internal.os.LooperStats.Entry mHashCollisionEntry = null;
    private boolean mIgnoreBatteryStatus;
    private final java.lang.Object mLock = null;
    private final com.android.internal.os.LooperStats.Entry mOverflowEntry = null;
    private int mSamplingInterval;
    private final java.util.concurrent.ConcurrentLinkedQueue<com.android.internal.os.LooperStats.DispatchSession> mSessionPool = null;
    private long mStartCurrentTime;
    private long mStartElapsedTime;
    private boolean mTrackScreenInteractive;
    public LooperStats(int p0, int p1) {}
    private com.android.internal.os.LooperStats.ExportedEntry createDebugEntry(java.lang.String p0, long p1) { return null; }
    private boolean deviceStateAllowsCollection() { return false; }
    private com.android.internal.os.LooperStats.Entry findEntry(android.os.Message p0, boolean p1) { return null; }
    private void maybeAddSpecialEntry(java.util.List<com.android.internal.os.LooperStats.ExportedEntry> p0, com.android.internal.os.LooperStats.Entry p1) {}
    private void recycleSession(com.android.internal.os.LooperStats.DispatchSession p0) {}
    public void dispatchingThrewException(java.lang.Object p0, android.os.Message p1, java.lang.Exception p2) {}
    public long getBatteryTimeMillis() { return 0L; }
    protected long getElapsedRealtimeMicro() { return 0L; }
    public java.util.List<com.android.internal.os.LooperStats.ExportedEntry> getEntries() { return null; }
    public long getStartElapsedTimeMillis() { return 0L; }
    public long getStartTimeMillis() { return 0L; }
    protected long getSystemUptimeMillis() { return 0L; }
    protected long getThreadTimeMicro() { return 0L; }
    public java.lang.Object messageDispatchStarting() { return null; }
    public void messageDispatched(java.lang.Object p0, android.os.Message p1) {}
    public void reset() {}
    public void setAddDebugEntries(boolean p0) {}
    public void setDeviceState(com.android.internal.os.CachedDeviceState.Readonly p0) {}
    public void setIgnoreBatteryStatus(boolean p0) {}
    public void setSamplingInterval(int p0) {}
    public void setTrackScreenInteractive(boolean p0) {}
    protected boolean shouldCollectDetailedData() { return false; }

    private static class DispatchSession {
        static final com.android.internal.os.LooperStats.DispatchSession NOT_SAMPLED = null;
        public long cpuStartMicro;
        public long startTimeMicro;
        public long systemUptimeMillis;
        private DispatchSession() {}
    }

    private static class Entry {
        public long cpuUsageMicro;
        public long delayMillis;
        public long exceptionCount;
        public final android.os.Handler handler = null;
        public final boolean isInteractive = false;
        public long maxCpuUsageMicro;
        public long maxDelayMillis;
        public long maxLatencyMicro;
        public long messageCount;
        public final java.lang.String messageName = null;
        public long recordedDelayMessageCount;
        public long recordedMessageCount;
        public long totalLatencyMicro;
        public final int workSourceUid = 0;
        Entry(android.os.Message p0, boolean p1) {}
        Entry(java.lang.String p0) {}
        static int idFor(android.os.Message p0, boolean p1) { return 0; }
        void reset() {}
    }

    public static class ExportedEntry {
        public final long cpuUsageMicros = 0L;
        public final long delayMillis = 0L;
        public final long exceptionCount = 0L;
        public final java.lang.String handlerClassName = null;
        public final boolean isInteractive = false;
        public final long maxCpuUsageMicros = 0L;
        public final long maxDelayMillis = 0L;
        public final long maxLatencyMicros = 0L;
        public final long messageCount = 0L;
        public final java.lang.String messageName = null;
        public final long recordedDelayMessageCount = 0L;
        public final long recordedMessageCount = 0L;
        public final java.lang.String threadName = null;
        public final long totalLatencyMicros = 0L;
        public final int workSourceUid = 0;
        ExportedEntry(com.android.internal.os.LooperStats.Entry p0) {}
    }
}
