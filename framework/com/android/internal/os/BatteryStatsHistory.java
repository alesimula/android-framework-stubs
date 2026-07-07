package com.android.internal.os;

public class BatteryStatsHistory {
    static final int BATTERY_LEVEL2_TEMP_MASK = -65536;
    static final int BATTERY_LEVEL2_TEMP_SHIFT = 16;
    static final int BATTERY_LEVEL2_VOLT_MASK = 65535;
    static final int BATTERY_LEVEL2_VOLT_SHIFT = 0;
    static final int BATTERY_LEVEL_DETAILS_FLAG = 1;
    static final int BATTERY_LEVEL_LEVEL_MASK = -16777216;
    static final int BATTERY_LEVEL_LEVEL_SHIFT = 24;
    static final int BATTERY_LEVEL_OVERFLOW_FLAG = 2;
    static final int BATTERY_LEVEL_TEMP_MASK = 16744448;
    static final int BATTERY_LEVEL_TEMP_SHIFT = 15;
    static final int BATTERY_LEVEL_VOLT_MASK = 32764;
    static final int BATTERY_LEVEL_VOLT_SHIFT = 2;
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_LOG_ENABLED = false;
    private static final java.lang.String DEBUG_LOG_FILE = "/data/system/battery-history/debuglog.txt";
    static final int DELTA_BATTERY_CHARGE_FLAG = 16777216;
    static final int DELTA_BATTERY_LEVEL_FLAG = 524288;
    static final int DELTA_EVENT_FLAG = 8388608;
    static final int DELTA_STATE2_FLAG = 2097152;
    static final int DELTA_STATE_FLAG = 1048576;
    static final int DELTA_STATE_MASK = -33554432;
    static final int DELTA_TIME_ABS = 524285;
    static final int DELTA_TIME_INT = 524286;
    static final int DELTA_TIME_LONG = 524287;
    static final int DELTA_TIME_MASK = 524287;
    static final int DELTA_WAKELOCK_FLAG = 4194304;
    static final int EXTENSION_POWER_STATS_DESCRIPTOR_FLAG = 1;
    static final int EXTENSION_POWER_STATS_FLAG = 2;
    static final int EXTENSION_PROCESS_STATE_CHANGE_FLAG = 4;
    private static final int EXTRA_BUFFER_SIZE_WHEN_DIR_LOCKED = 100000;
    static final int HISTORY_TAG_INDEX_LIMIT = 32766;
    private static final int MAX_HISTORY_TAG_STRING_LENGTH = 1024;
    static final int STATE1_TRACE_MASK = 1073741823;
    static final int STATE2_TRACE_MASK = -1;
    static final int STATE_BATTERY_HEALTH_MASK = 7;
    static final int STATE_BATTERY_HEALTH_SHIFT = 26;
    static final int STATE_BATTERY_MASK = -16777216;
    static final int STATE_BATTERY_PLUG_MASK = 3;
    static final int STATE_BATTERY_PLUG_SHIFT = 24;
    static final int STATE_BATTERY_STATUS_MASK = 7;
    static final int STATE_BATTERY_STATUS_SHIFT = 29;
    private static final java.lang.String TAG = "BatteryStatsHistory";
    static final int TAG_FIRST_OCCURRENCE_FLAG = 32768;
    private static final int VERSION = 214;
    private com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment mActiveFragment;
    private final com.android.internal.os.Clock mClock = null;
    private long mDebugLogBaseMonotonicTime;
    private long mDebugLogBaseTimeUtc;
    private final com.android.internal.os.BatteryStatsHistory.EventLogger mEventLogger = null;
    private boolean mHaveBatteryLevel;
    private final android.os.BatteryStats.HistoryItem mHistoryAddTmp = null;
    private final android.os.Parcel mHistoryBuffer = null;
    private int mHistoryBufferLastPos;
    private long mHistoryBufferStartTime;
    private final android.os.BatteryStats.HistoryItem mHistoryCur = null;
    private final android.os.BatteryStats.HistoryItem mHistoryLastLastWritten = null;
    private final android.os.BatteryStats.HistoryItem mHistoryLastWritten = null;
    private long mHistoryMonotonicEndTime;
    private java.util.List<android.os.Parcel> mHistoryParcels;
    private final java.util.HashMap<android.os.BatteryStats.HistoryTag, java.lang.Integer> mHistoryTagPool = null;
    private android.util.SparseArray<android.os.BatteryStats.HistoryTag> mHistoryTags;
    private int mIteratorCookie;
    private int mMaxHistoryBufferSize;
    private final com.android.internal.os.MonotonicClock mMonotonicClock = null;
    private long mMonotonicHistorySize;
    private boolean mMutable;
    private int mNextHistoryTagIdx;
    private int mNumHistoryTagChars;
    private boolean mRecordingHistory;
    private final com.android.internal.os.BatteryStatsHistory.BatteryHistoryStore mStore = null;
    private int mTraceLastState;
    private int mTraceLastState2;
    private com.android.internal.os.BatteryStatsHistory.TraceDelegate mTracer;
    private long mTrackRunningHistoryElapsedRealtimeMs;
    private long mTrackRunningHistoryUptimeMs;
    private final com.android.internal.os.BatteryStatsHistory mWritableHistory = null;
    private final java.util.concurrent.locks.ReentrantLock mWriteLock = null;
    private final android.util.ArraySet<com.android.internal.os.PowerStats.Descriptor> mWrittenPowerStatsDescriptors = null;
    private BatteryStatsHistory(android.os.Parcel p0) {}
    public BatteryStatsHistory(android.os.Parcel p0, int p1, com.android.internal.os.BatteryStatsHistory.BatteryHistoryStore p2, com.android.internal.os.Clock p3, com.android.internal.os.MonotonicClock p4, com.android.internal.os.BatteryStatsHistory.TraceDelegate p5, com.android.internal.os.BatteryStatsHistory.EventLogger p6) {}
    private BatteryStatsHistory(android.os.Parcel p0, int p1, com.android.internal.os.BatteryStatsHistory.BatteryHistoryStore p2, com.android.internal.os.Clock p3, com.android.internal.os.MonotonicClock p4, com.android.internal.os.BatteryStatsHistory.TraceDelegate p5, com.android.internal.os.BatteryStatsHistory.EventLogger p6, com.android.internal.os.BatteryStatsHistory p7) {}
    private int buildBatteryLevelInt(android.os.BatteryStats.HistoryItem p0, android.os.BatteryStats.HistoryItem p1) { return 0; }
    private int buildExtendedBatteryLevelInt(android.os.BatteryStats.HistoryItem p0) { return 0; }
    private int buildStateInt(android.os.BatteryStats.HistoryItem p0) { return 0; }
    public static com.android.internal.os.BatteryStatsHistory createFromBatteryUsageStatsParcel(android.os.Parcel p0) { return null; }
    private void debugLog(int p0, android.os.BatteryStats.HistoryItem p1, android.os.BatteryStats.HistoryItem p2, java.lang.String p3, boolean p4) {}
    private void debugLog(android.os.BatteryStats.HistoryItem p0, android.os.BatteryStats.HistoryItem p1, java.lang.String p2, boolean p3) {}
    private void debugLog(java.io.PrintWriter p0, android.os.BatteryStats.HistoryItem p1, android.os.BatteryStats.HistoryItem p2, java.lang.String p3, boolean p4) {}
    private void ensureHistoryTagArray() {}
    private void initHistoryBuffer() {}
    private boolean maybeFlushBufferAndWriteHistoryItem(android.os.BatteryStats.HistoryItem p0, long p1, long p2) { return false; }
    private void readFromParcel(android.os.Parcel p0, boolean p1) {}
    private void recordTraceCounters(int p0, int p1, int p2, android.os.BatteryStats.BitDescription[] p3) {}
    private void recordTraceEvents(int p0, android.os.BatteryStats.HistoryTag p1) {}
    private void setActiveFragment(com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment p0) {}
    private int setBitField(int p0, int p1, int p2, int p3) { return 0; }
    private boolean signedValueFits(int p0, int p1, int p2) { return false; }
    private void startNextFragmentLocked(long p0) {}
    private boolean verifyVersion(android.os.Parcel p0) { return false; }
    private void writeHistory(boolean p0) {}
    private void writeHistoryBuffer(android.os.Parcel p0) {}
    private void writeHistoryDelta(android.os.Parcel p0, android.os.BatteryStats.HistoryItem p1, android.os.BatteryStats.HistoryItem p2) {}
    private void writeHistoryItem(long p0, long p1, android.os.BatteryStats.HistoryItem p2) {}
    private void writeHistoryItem(long p0, long p1, android.os.BatteryStats.HistoryItem p2, byte p3) {}
    private int writeHistoryTag(android.os.BatteryStats.HistoryTag p0) { return 0; }
    private void writeParcelLocked(android.os.Parcel p0, com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment p1, boolean p2) {}
    private void writeToParcel(android.os.Parcel p0, boolean p1, long p2) {}
    public void commitCurrentHistoryBatchLocked() {}
    public void continueRecordingHistory() {}
    public com.android.internal.os.BatteryStatsHistory copy() { return null; }
    public void dump(java.io.PrintWriter p0, long p1, long p2) {}
    public void forceRecordAllHistory() {}
    public com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment getActiveFragment() { return null; }
    public com.android.internal.os.BatteryStatsHistory.BatteryHistoryStore getBatteryHistoryStore() { return null; }
    public int getEstimatedItemCount() { return 0; }
    public int getHistoryStringPoolBytes() { return 0; }
    public int getHistoryStringPoolSize() { return 0; }
    public java.lang.String getHistoryTagPoolString(int p0) { return null; }
    public int getHistoryTagPoolUid(int p0) { return 0; }
    public int getHistoryUsedSize() { return 0; }
    public long getMonotonicHistorySize() { return 0L; }
    java.util.Queue<com.android.internal.os.BatteryStatsHistory.BatteryHistoryParcelContainer> getParcelContainers(long p0, long p1) { return null; }
    public long getStartTime() { return 0L; }
    public boolean isReadOnly() { return false; }
    public boolean isRecordingHistory() { return false; }
    public boolean isResetEnabled() { return false; }
    public com.android.internal.os.BatteryStatsHistoryIterator iterate(long p0, long p1) { return null; }
    void iteratorFinished() {}
    public boolean maybeUpdateWakelockTag(long p0, long p1, java.lang.String p2, int p3) { return false; }
    public boolean readFragmentToParcel(android.os.Parcel p0, com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment p1) { return false; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void readHistoryBuffer(android.os.Parcel p0) throws android.os.ParcelFormatException {}
    public boolean readSummary() { return false; }
    public void readSummaryFromParcel(android.os.Parcel p0) {}
    public void recordBatteryState(long p0, long p1, int p2, boolean p3) {}
    public void recordCurrentTimeChange(long p0, long p1, long p2) {}
    public void recordDataConnectionTypeChangeEvent(long p0, long p1, int p2) {}
    public void recordDeviceIdleEvent(long p0, long p1, int p2) {}
    public void recordEvent(long p0, long p1, int p2, java.lang.String p3, int p4) {}
    public void recordGpsSignalQualityEvent(long p0, long p1, int p2) {}
    public void recordHistoryStepDetails(android.os.BatteryStats.HistoryStepDetails p0, long p1, long p2) {}
    public void recordNrStateChangeEvent(long p0, long p1, int p2) {}
    public void recordPhoneStateChangeEvent(long p0, long p1, int p2, int p3, int p4, int p5) {}
    public void recordPowerStats(long p0, long p1, com.android.internal.os.PowerStats p2) {}
    public void recordProcessStateChange(long p0, long p1, int p2, int p3) {}
    public void recordScreenBrightnessEvent(long p0, long p1, int p2) {}
    public void recordShutdownEvent(long p0, long p1, long p2) {}
    public void recordState2StartEvent(long p0, long p1, int p2) {}
    public void recordState2StartEvent(long p0, long p1, int p2, int p3, java.lang.String p4) {}
    public void recordState2StopEvent(long p0, long p1, int p2) {}
    public void recordState2StopEvent(long p0, long p1, int p2, int p3, java.lang.String p4) {}
    public void recordStateChangeEvent(long p0, long p1, int p2, int p3) {}
    public void recordStateStartEvent(long p0, long p1, int p2) {}
    public void recordStateStartEvent(long p0, long p1, int p2, int p3, java.lang.String p4) {}
    public void recordStateStopEvent(long p0, long p1, int p2) {}
    public void recordStateStopEvent(long p0, long p1, int p2, int p3, java.lang.String p4) {}
    public void recordWakelockStartEvent(long p0, long p1, java.lang.String p2, int p3) {}
    public void recordWakelockStopEvent(long p0, long p1, java.lang.String p2, int p3) {}
    public void recordWakeupEvent(long p0, long p1, java.lang.String p2) {}
    public void recordWifiConsumedCharge(long p0, long p1, double p2) {}
    public void recordWifiSignalStrengthChangeEvent(long p0, long p1, int p2) {}
    public void recordWifiSupplicantStateChangeEvent(long p0, long p1, int p2) {}
    public void reset() {}
    public void setBatteryState(int p0, int p1, int p2, int p3, int p4, int p5, int p6) {}
    public void setBatteryState(boolean p0, int p1, int p2, int p3) {}
    public void setChargingState(boolean p0) {}
    public void setHistoryRecordingEnabled(boolean p0) {}
    public void setMaxHistoryBufferSize(int p0) {}
    public void setPluggedInState(boolean p0) {}
    public void startNextFragment(long p0) {}
    public void startRecordingHistory(long p0, long p1, boolean p2) {}
    public void writeAllHistoryItem(long p0, long p1, android.os.BatteryStats.HistoryItem p2) {}
    public void writeHistory() {}
    public void writeHistoryItem(long p0, long p1) {}
    public void writeSummaryToParcel(android.os.Parcel p0, boolean p1) {}
    public void writeToBatteryUsageStatsParcel(android.os.Parcel p0, long p1) {}
    public void writeToParcel(android.os.Parcel p0) {}

    public static abstract class BatteryHistoryFragment implements java.lang.Comparable<com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment> {
        public final long monotonicTimeMs = 0L;
        public BatteryHistoryFragment(long p0) {}
        public int compareTo(com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment p0) { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    class BatteryHistoryParcelContainer {
        private com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment mFragment;
        private long mMonotonicStartTime;
        private android.os.Parcel mParcel;
        private boolean mParcelReadyForReading;
        BatteryHistoryParcelContainer(com.android.internal.os.BatteryStatsHistory p0, android.os.Parcel p1, long p2) {}
        BatteryHistoryParcelContainer(com.android.internal.os.BatteryStatsHistory p0, com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment p1) {}
        void close() {}
        long getMonotonicStartTime() { return 0L; }
        android.os.Parcel getParcel() { return null; }
    }

    public static interface BatteryHistoryStore {
        public com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment createFragment(long p0);
        public com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment getEarliestFragment();
        public java.util.List<com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment> getFragments();
        public com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment getLatestFragment();
        public int getMaxHistorySize();
        public int getSize();
        public boolean hasCompletedFragments();
        public boolean isLocked();
        public void lock();
        public byte[] readFragment(com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment p0);
        public void reset();
        public boolean tryLock();
        public void unlock();
        public void writeFragment(com.android.internal.os.BatteryStatsHistory.BatteryHistoryFragment p0, byte[] p1, boolean p2);
    }

    public static class EventLogger {
        public EventLogger() {}
        public void writeCommitSysConfigFile(long p0) {}
    }

    public static class TraceDelegate {
        private final android.util.ArrayMap<java.lang.String, java.lang.Integer> mPendingProperties = null;
        private final boolean mShouldSetProperty = false;
        private final java.lang.Runnable mWriteRunnable = null;
        public TraceDelegate() {}
        private void writePendingProperties() {}
        public void traceCounter(java.lang.String p0, int p1) {}
        public void traceInstantEvent(java.lang.String p0, java.lang.String p1) {}
        public boolean tracingEnabled() { return false; }
    }

    public static final class VarintParceler {
        public VarintParceler() {}
        public void readLongArray(android.os.Parcel p0, long[] p1) {}
        public void writeLongArray(android.os.Parcel p0, long[] p1) {}
    }
}
