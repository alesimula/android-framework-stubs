package com.android.internal.os;

public final class BinderCallsStats implements com.android.internal.os.BinderInternal.Observer {
    private static final int CALL_SESSIONS_POOL_SIZE = 100;
    private static final int CALL_STATS_OBSERVER_DEBOUNCE_MILLIS = 5000;
    private static final java.lang.String DEBUG_ENTRY_PREFIX = "__DEBUG_";
    public static final boolean DEFAULT_COLLECT_LATENCY_DATA = true;
    public static final boolean DEFAULT_IGNORE_BATTERY_STATUS = false;
    public static final boolean DEFAULT_TRACK_DIRECT_CALLING_UID = true;
    public static final boolean DEFAULT_TRACK_SCREEN_INTERACTIVE = false;
    public static final boolean DETAILED_TRACKING_DEFAULT = true;
    public static final boolean ENABLED_DEFAULT = true;
    private static final java.lang.String EXCEPTION_COUNT_OVERFLOW_NAME = "overflow";
    public static final int MAX_BINDER_CALL_STATS_COUNT_DEFAULT = 1500;
    private static final int MAX_EXCEPTION_COUNT_SIZE = 50;
    private static final java.lang.Class<? extends android.os.Binder> OVERFLOW_BINDER = null;
    private static final int OVERFLOW_DIRECT_CALLING_UID = -1;
    private static final boolean OVERFLOW_SCREEN_INTERACTIVE = false;
    private static final int OVERFLOW_TRANSACTION_CODE = -1;
    public static final int PERIODIC_SAMPLING_INTERVAL_DEFAULT = 1000;
    public static final int SHARDING_MODULO_DEFAULT = 1;
    private static final java.lang.String TAG = "BinderCallsStats";
    private boolean mAddDebugEntries;
    private com.android.internal.os.CachedDeviceState.TimeInStateStopwatch mBatteryStopwatch;
    private final java.util.Queue<com.android.internal.os.BinderInternal.CallSession> mCallSessionsPool = null;
    private long mCallStatsCount;
    private com.android.internal.os.BinderInternal.CallStatsObserver mCallStatsObserver;
    private final android.os.Handler mCallStatsObserverHandler = null;
    private java.lang.Runnable mCallStatsObserverRunnable;
    private boolean mCollectLatencyData;
    private boolean mDetailedTracking;
    private com.android.internal.os.CachedDeviceState.Readonly mDeviceState;
    private final android.util.ArrayMap<java.lang.String, java.lang.Integer> mExceptionCounts = null;
    private boolean mIgnoreBatteryStatus;
    private final com.android.internal.os.BinderCallsStats.Injector mInjector = null;
    private com.android.internal.os.BinderLatencyObserver mLatencyObserver;
    private final java.lang.Object mLock = null;
    private int mMaxBinderCallStatsCount;
    private volatile android.util.IntArray mNativeTids;
    private final java.lang.Object mNativeTidsLock = null;
    private int mPeriodicSamplingInterval;
    private final java.util.Random mRandom = null;
    private boolean mRecordingAllTransactionsForUid;
    private android.util.ArraySet<java.lang.Integer> mSendUidsToObserver;
    private int mShardingModulo;
    private int mShardingOffset;
    private long mStartCurrentTime;
    private long mStartElapsedTime;
    private boolean mTrackDirectCallingUid;
    private boolean mTrackScreenInteractive;
    private final android.util.SparseArray<com.android.internal.os.BinderCallsStats.UidEntry> mUidEntries = null;
    public BinderCallsStats(com.android.internal.os.BinderCallsStats.Injector p0) {}
    public BinderCallsStats(com.android.internal.os.BinderCallsStats.Injector p0, int p1) {}
    private boolean canCollect() { return false; }
    private static int compareByBinderClassAndCode(com.android.internal.os.BinderCallsStats.ExportedCallStat p0, com.android.internal.os.BinderCallsStats.ExportedCallStat p1) { return 0; }
    private static int compareByCpuDesc(com.android.internal.os.BinderCallsStats.ExportedCallStat p0, com.android.internal.os.BinderCallsStats.ExportedCallStat p1) { return 0; }
    private com.android.internal.os.BinderCallsStats.ExportedCallStat createDebugEntry(java.lang.String p0, long p1) { return null; }
    private void dumpLocked(java.io.PrintWriter p0, com.android.internal.os.AppIdToPackageMap p1, int p2, boolean p3) {}
    private int getCallingUid() { return 0; }
    private long getElapsedRealtimeMicro() { return 0L; }
    private com.android.internal.os.BinderCallsStats.ExportedCallStat getExportedCallStat(int p0, com.android.internal.os.BinderCallsStats.CallStat p1) { return null; }
    public static <T extends java.lang.Object> java.util.List<T> getHighestValues(java.util.List<T> p0, java.util.function.ToDoubleFunction<T> p1, double p2) { return null; }
    private int getNativeTid() { return 0; }
    private long getThreadTimeMicro() { return 0L; }
    private com.android.internal.os.BinderCallsStats.UidEntry getUidEntry(int p0) { return null; }
    private void noteBinderThreadNativeIds() {}
    private void noteCallsStatsDelayed() {}
    private void noteNativeThreadId() {}
    private com.android.internal.os.BinderInternal.CallSession obtainCallSession() { return null; }
    private void processCallEnded(com.android.internal.os.BinderInternal.CallSession p0, int p1, int p2, int p3) {}
    private void resolveBinderMethodNames(java.util.ArrayList<com.android.internal.os.BinderCallsStats.ExportedCallStat> p0) {}
    private boolean shouldExport(com.android.internal.os.BinderCallsStats.ExportedCallStat p0, boolean p1) { return false; }
    private boolean shouldRecordDetailedData() { return false; }
    public static void startForBluetooth(android.content.Context p0) {}
    public void callEnded(com.android.internal.os.BinderInternal.CallSession p0, int p1, int p2, int p3) {}
    public com.android.internal.os.BinderInternal.CallSession callStarted(android.os.Binder p0, int p1, int p2) { return null; }
    public void callThrewException(com.android.internal.os.BinderInternal.CallSession p0, java.lang.Exception p1) {}
    public void dump(java.io.PrintWriter p0, com.android.internal.os.AppIdToPackageMap p1, int p2, boolean p3) {}
    public boolean getCollectLatencyData() { return false; }
    public android.util.ArrayMap<java.lang.String, java.lang.Integer> getExceptionCounts() { return null; }
    public java.util.ArrayList<com.android.internal.os.BinderCallsStats.ExportedCallStat> getExportedCallStats() { return null; }
    public java.util.ArrayList<com.android.internal.os.BinderCallsStats.ExportedCallStat> getExportedCallStats(int p0) { return null; }
    public java.util.ArrayList<com.android.internal.os.BinderCallsStats.ExportedCallStat> getExportedCallStats(int p0, boolean p1) { return null; }
    public java.util.ArrayList<com.android.internal.os.BinderCallsStats.ExportedCallStat> getExportedCallStats(boolean p0) { return null; }
    public android.util.ArrayMap<java.lang.String, java.lang.Integer> getExportedExceptionStats() { return null; }
    public com.android.internal.os.BinderLatencyObserver getLatencyObserver() { return null; }
    public int[] getNativeTids() { return null; }
    public android.util.SparseArray<com.android.internal.os.BinderCallsStats.UidEntry> getUidEntries() { return null; }
    public void recordAllCallsForWorkSourceUid(int p0) {}
    public void reset() {}
    public void setAddDebugEntries(boolean p0) {}
    public void setCallStatsObserver(com.android.internal.os.BinderInternal.CallStatsObserver p0) {}
    public void setCollectLatencyData(boolean p0) {}
    public void setDetailedTracking(boolean p0) {}
    public void setDeviceState(com.android.internal.os.CachedDeviceState.Readonly p0) {}
    public void setIgnoreBatteryStatus(boolean p0) {}
    public void setMaxBinderCallStats(int p0) {}
    public void setSamplingInterval(int p0) {}
    public void setShardingModulo(int p0) {}
    public void setTrackDirectCallerUid(boolean p0) {}
    public void setTrackScreenInteractive(boolean p0) {}

    public static final class CallStat {
        public final java.lang.Class<? extends android.os.Binder> binderClass = null;
        public long callCount;
        public final int callingUid = 0;
        public long cpuTimeMicros;
        public long exceptionCount;
        public long incrementalCallCount;
        public long latencyMicros;
        public long maxCpuTimeMicros;
        public long maxLatencyMicros;
        public long maxReplySizeBytes;
        public long maxRequestSizeBytes;
        public long recordedCallCount;
        public final boolean screenInteractive = false;
        public final int transactionCode = 0;
        public CallStat(int p0, java.lang.Class<? extends android.os.Binder> p1, int p2, boolean p3) {}
        public com.android.internal.os.BinderCallsStats.CallStat clone() { return null; }
        public java.lang.String toString() { return null; }
    }

    public static final class CallStatKey {
        public java.lang.Class<? extends android.os.Binder> binderClass;
        public int callingUid;
        private boolean screenInteractive;
        public int transactionCode;
        public CallStatKey() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static final class ExportedCallStat {
        java.lang.Class<? extends android.os.Binder> binderClass;
        public long callCount;
        public int callingUid;
        public java.lang.String className;
        public long cpuTimeMicros;
        public long exceptionCount;
        public long latencyMicros;
        public long maxCpuTimeMicros;
        public long maxLatencyMicros;
        public long maxReplySizeBytes;
        public long maxRequestSizeBytes;
        public java.lang.String methodName;
        public long recordedCallCount;
        public boolean screenInteractive;
        int transactionCode;
        public int workSourceUid;
        public ExportedCallStat() {}
    }

    public static class Injector {
        public Injector() {}
        public int getCallingUid() { return 0; }
        public long getElapsedRealtimeMicro() { return 0L; }
        public android.os.Handler getHandler() { return null; }
        public com.android.internal.os.BinderLatencyObserver getLatencyObserver(int p0) { return null; }
        public int getNativeTid() { return 0; }
        public java.util.Random getRandomGenerator() { return null; }
        public long getThreadTimeMicro() { return 0L; }
    }

    private static class OverflowBinder extends android.os.Binder {
        private OverflowBinder() { super(); }
    }

    public static final class SettingsObserver extends android.database.ContentObserver {
        public static final java.lang.String SETTINGS_COLLECT_LATENCY_DATA_KEY = "collect_latency_data";
        public static final java.lang.String SETTINGS_DETAILED_TRACKING_KEY = "detailed_tracking";
        public static final java.lang.String SETTINGS_ENABLED_KEY = "enabled";
        public static final java.lang.String SETTINGS_IGNORE_BATTERY_STATUS_KEY = "ignore_battery_status";
        public static final java.lang.String SETTINGS_LATENCY_HISTOGRAM_BUCKET_COUNT_KEY = "latency_histogram_bucket_count";
        public static final java.lang.String SETTINGS_LATENCY_HISTOGRAM_BUCKET_SCALE_FACTOR_KEY = "latency_histogram_bucket_scale_factor";
        public static final java.lang.String SETTINGS_LATENCY_HISTOGRAM_FIRST_BUCKET_SIZE_KEY = "latency_histogram_first_bucket_size";
        public static final java.lang.String SETTINGS_LATENCY_OBSERVER_PUSH_INTERVAL_MINUTES_KEY = "latency_observer_push_interval_minutes";
        public static final java.lang.String SETTINGS_LATENCY_OBSERVER_SAMPLING_INTERVAL_KEY = "latency_observer_sampling_interval";
        public static final java.lang.String SETTINGS_LATENCY_OBSERVER_SHARDING_MODULO_KEY = "latency_observer_sharding_modulo";
        public static final java.lang.String SETTINGS_MAX_CALL_STATS_KEY = "max_call_stats_count";
        public static final java.lang.String SETTINGS_SAMPLING_INTERVAL_KEY = "sampling_interval";
        public static final java.lang.String SETTINGS_SHARDING_MODULO_KEY = "sharding_modulo";
        public static final java.lang.String SETTINGS_TRACK_DIRECT_CALLING_UID_KEY = "track_calling_uid";
        public static final java.lang.String SETTINGS_TRACK_SCREEN_INTERACTIVE_KEY = "track_screen_state";
        public static final java.lang.String SETTINGS_UPLOAD_DATA_KEY = "upload_data";
        private final com.android.internal.os.BinderCallsStats mBinderCallsStats = null;
        private final android.content.Context mContext = null;
        private boolean mEnabled;
        private final android.util.KeyValueListParser mParser = null;
        private final android.net.Uri mUri = null;
        public SettingsObserver(android.content.Context p0, com.android.internal.os.BinderCallsStats p1) { super((android.os.Handler)null); }
        public static void configureLatencyObserver(android.util.KeyValueListParser p0, com.android.internal.os.BinderLatencyObserver p1) {}
        void onChange() {}
        public void onChange(boolean p0, android.net.Uri p1, int p2) {}
    }

    public static final class UidEntry {
        public long callCount;
        public long cpuTimeMicros;
        public long incrementalCallCount;
        private android.util.ArrayMap<com.android.internal.os.BinderCallsStats.CallStatKey, com.android.internal.os.BinderCallsStats.CallStat> mCallStats;
        private com.android.internal.os.BinderCallsStats.CallStatKey mTempKey;
        public boolean recordAllTransactions;
        public long recordedCallCount;
        public int workSourceUid;
        UidEntry(int p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        com.android.internal.os.BinderCallsStats.CallStat get(int p0, java.lang.Class<? extends android.os.Binder> p1, int p2, boolean p3) { return null; }
        public java.util.Collection<com.android.internal.os.BinderCallsStats.CallStat> getCallStatsList() { return null; }
        com.android.internal.os.BinderCallsStats.CallStat getOrCreate(int p0, java.lang.Class<? extends android.os.Binder> p1, int p2, boolean p3, boolean p4) { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
