package com.android.internal.app.procstats;

public final class ProcessStats implements android.os.Parcelable {
    public static final int ADD_PSS_EXTERNAL = 3;
    public static final int ADD_PSS_EXTERNAL_SLOW = 4;
    public static final int ADD_PSS_INTERNAL_ALL_MEM = 1;
    public static final int ADD_PSS_INTERNAL_ALL_POLL = 2;
    public static final int ADD_PSS_INTERNAL_SINGLE = 0;
    public static final int ADJ_COUNT = 8;
    public static final int ADJ_MEM_FACTOR_COUNT = 4;
    public static final int ADJ_MEM_FACTOR_CRITICAL = 3;
    public static final int ADJ_MEM_FACTOR_LOW = 2;
    public static final int ADJ_MEM_FACTOR_MODERATE = 1;
    public static final int ADJ_MEM_FACTOR_NORMAL = 0;
    public static final int ADJ_NOTHING = -1;
    public static final int ADJ_SCREEN_MOD = 4;
    public static final int ADJ_SCREEN_OFF = 0;
    public static final int ADJ_SCREEN_ON = 4;
    public static final int[] ALL_MEM_ADJ = null;
    public static final int[] ALL_PROC_STATES = null;
    public static final int[] ALL_SCREEN_ADJ = null;
    static final java.util.Comparator<com.android.internal.app.procstats.ProcessStats.AssociationDumpContainer> ASSOCIATION_COMPARATOR = null;
    public static final int[] BACKGROUND_PROC_STATES = null;
    static final int[] BAD_TABLE = null;
    public static long COMMIT_PERIOD;
    public static long COMMIT_UPTIME_PERIOD;
    public static final android.os.Parcelable.Creator<com.android.internal.app.procstats.ProcessStats> CREATOR = null;
    static final boolean DEBUG = false;
    static final boolean DEBUG_PARCEL = false;
    public static final int FLAG_COMPLETE = 1;
    public static final int FLAG_SHUTDOWN = 2;
    public static final int FLAG_SYSPROPS = 4;
    private static final long INVERSE_PROC_STATE_WARNING_MIN_INTERVAL_MS = 10000L;
    private static final int MAGIC = 1347638356;
    public static final int[] NON_CACHED_PROC_STATES = null;
    public static final int[] OPTIONS = null;
    public static final java.lang.String[] OPTIONS_STR = null;
    private static final int PARCEL_VERSION = 41;
    public static final int PSS_AVERAGE = 2;
    public static final int PSS_COUNT = 10;
    public static final int PSS_MAXIMUM = 3;
    public static final int PSS_MINIMUM = 1;
    public static final int PSS_RSS_AVERAGE = 8;
    public static final int PSS_RSS_MAXIMUM = 9;
    public static final int PSS_RSS_MINIMUM = 7;
    public static final int PSS_SAMPLE_COUNT = 0;
    public static final int PSS_USS_AVERAGE = 5;
    public static final int PSS_USS_MAXIMUM = 6;
    public static final int PSS_USS_MINIMUM = 4;
    public static final int REPORT_ALL = 31;
    public static final int REPORT_PKG_ASC_STATS = 8;
    public static final int REPORT_PKG_PROC_STATS = 2;
    public static final int REPORT_PKG_STATS = 14;
    public static final int REPORT_PKG_SVC_STATS = 4;
    public static final int REPORT_PROC_STATS = 1;
    public static final int REPORT_UID_STATS = 16;
    public static final java.lang.String SERVICE_NAME = "procstats";
    public static final int STATE_BACKUP = 7;
    public static final int STATE_BOUND_FGS = 4;
    public static final int STATE_BOUND_TOP = 2;
    public static final int STATE_CACHED = 14;
    public static final int STATE_COUNT = 16;
    public static final int STATE_FGS = 3;
    public static final int STATE_FROZEN = 15;
    public static final int STATE_HEAVY_WEIGHT = 11;
    public static final int STATE_HOME = 12;
    public static final int STATE_IMPORTANT_BACKGROUND = 6;
    public static final int STATE_IMPORTANT_FOREGROUND = 5;
    public static final int STATE_LAST_ACTIVITY = 13;
    public static final int STATE_NOTHING = -1;
    public static final int STATE_PERSISTENT = 0;
    public static final int STATE_RECEIVER = 10;
    public static final int STATE_SERVICE = 8;
    public static final int STATE_SERVICE_RESTARTING = 9;
    public static final int STATE_TOP = 1;
    public static final int SYS_MEM_USAGE_CACHED_AVERAGE = 2;
    public static final int SYS_MEM_USAGE_CACHED_MAXIMUM = 3;
    public static final int SYS_MEM_USAGE_CACHED_MINIMUM = 1;
    public static final int SYS_MEM_USAGE_COUNT = 16;
    public static final int SYS_MEM_USAGE_FREE_AVERAGE = 5;
    public static final int SYS_MEM_USAGE_FREE_MAXIMUM = 6;
    public static final int SYS_MEM_USAGE_FREE_MINIMUM = 4;
    public static final int SYS_MEM_USAGE_KERNEL_AVERAGE = 11;
    public static final int SYS_MEM_USAGE_KERNEL_MAXIMUM = 12;
    public static final int SYS_MEM_USAGE_KERNEL_MINIMUM = 10;
    public static final int SYS_MEM_USAGE_NATIVE_AVERAGE = 14;
    public static final int SYS_MEM_USAGE_NATIVE_MAXIMUM = 15;
    public static final int SYS_MEM_USAGE_NATIVE_MINIMUM = 13;
    public static final int SYS_MEM_USAGE_SAMPLE_COUNT = 0;
    public static final int SYS_MEM_USAGE_ZRAM_AVERAGE = 8;
    public static final int SYS_MEM_USAGE_ZRAM_MAXIMUM = 9;
    public static final int SYS_MEM_USAGE_ZRAM_MINIMUM = 7;
    public static final java.lang.String TAG = "ProcessStats";
    private static final java.util.regex.Pattern sPageTypeRegex = null;
    android.util.ArrayMap<java.lang.String, java.lang.Integer> mCommonStringToIndex;
    public long mExternalPssCount;
    public long mExternalPssTime;
    public long mExternalSlowPssCount;
    public long mExternalSlowPssTime;
    public int mFlags;
    boolean mHasSwappedOutPss;
    java.util.ArrayList<java.lang.String> mIndexToCommonString;
    public long mInternalAllMemPssCount;
    public long mInternalAllMemPssTime;
    public long mInternalAllPollPssCount;
    public long mInternalAllPollPssTime;
    public long mInternalSinglePssCount;
    public long mInternalSinglePssTime;
    public int mMemFactor;
    public final long[] mMemFactorDurations = null;
    private long mNextInverseProcStateWarningUptime;
    public int mNumAggregated;
    public final com.android.internal.app.ProcessMap<android.util.LongSparseArray<com.android.internal.app.procstats.ProcessStats.PackageState>> mPackages = null;
    private final java.util.ArrayList<java.lang.String> mPageTypeLabels = null;
    private final java.util.ArrayList<java.lang.Integer> mPageTypeNodes = null;
    private final java.util.ArrayList<int[]> mPageTypeSizes = null;
    private final java.util.ArrayList<java.lang.String> mPageTypeZones = null;
    public final com.android.internal.app.ProcessMap<com.android.internal.app.procstats.ProcessState> mProcesses = null;
    public java.lang.String mReadError;
    boolean mRunning;
    java.lang.String mRuntime;
    private int mSkippedInverseProcStateWarningCount;
    public long mStartTime;
    public final com.android.internal.app.procstats.SysMemUsageTable mSysMemUsage = null;
    public final long[] mSysMemUsageArgs = null;
    public final com.android.internal.app.procstats.SparseMappingTable mTableData = null;
    public long mTimePeriodEndRealtime;
    public long mTimePeriodEndUptime;
    public long mTimePeriodStartClock;
    public java.lang.String mTimePeriodStartClockStr;
    public long mTimePeriodStartRealtime;
    public long mTimePeriodStartUptime;
    public final java.util.ArrayList<com.android.internal.app.procstats.AssociationState.SourceState> mTrackingAssociations = null;
    public final android.util.SparseArray<com.android.internal.app.procstats.UidState> mUidStates = null;
    public ProcessStats() {}
    public ProcessStats(android.os.Parcel p0) {}
    public ProcessStats(boolean p0) {}
    private void buildTimePeriodStartClockStr() {}
    private void collectProcessPackageMaps(java.lang.String p0, boolean p1, com.android.internal.app.ProcessMap<android.util.ArraySet<com.android.internal.app.procstats.ProcessStats.PackageState>> p2, android.util.SparseArray<android.util.ArraySet<java.lang.String>> p3) {}
    private void dumpFragmentationLocked(java.io.PrintWriter p0) {}
    private void dumpProtoPreamble(android.util.proto.ProtoOutputStream p0) {}
    private static boolean isSwapEnabled() { return false; }
    private boolean readCheckedInt(android.os.Parcel p0, int p1, java.lang.String p2) { return false; }
    private void readCompactedLongArray(android.os.Parcel p0, int p1, long[] p2, int p3) {}
    static byte[] readFully(java.io.InputStream p0, int[] p1) throws java.io.IOException { return null; }
    private void resetCommon() {}
    private static int[] splitAndParseNumbers(java.lang.String p0) { return null; }
    private void writeCompactedLongArray(android.os.Parcel p0, long[] p1, int p2) {}
    public void add(com.android.internal.app.procstats.ProcessStats p0) {}
    public void addSysMemUsage(long p0, long p1, long p2, long p3, long p4) {}
    public java.util.ArrayList<com.android.internal.app.procstats.ProcessState> collectProcessesLocked(int[] p0, int[] p1, int[] p2, int[] p3, long p4, java.lang.String p5, boolean p6) { return null; }
    public void computeTotalMemoryUse(com.android.internal.app.procstats.ProcessStats.TotalMemoryUseCollection p0, long p1) {}
    public int describeContents() { return 0; }
    public void dumpAggregatedProtoForStatsd(android.util.proto.ProtoOutputStream[] p0, long p1) {}
    public void dumpCheckinLocked(java.io.PrintWriter p0, java.lang.String p1, int p2) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1, int p2) {}
    public void dumpFilteredAssociationStatesProtoForProc(android.util.proto.ProtoOutputStream p0, long p1, long p2, com.android.internal.app.procstats.ProcessState p3, android.util.SparseArray<android.util.ArraySet<java.lang.String>> p4) {}
    void dumpFilteredSummaryLocked(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int[] p4, int[] p5, int[] p6, int[] p7, long p8, long p9, java.lang.String p10, boolean p11) {}
    public void dumpLocked(java.io.PrintWriter p0, java.lang.String p1, long p2, boolean p3, boolean p4, boolean p5, boolean p6, int p7) {}
    public void dumpProcessAssociation(int p0, com.android.internal.app.procstats.StatsEventOutput p1) {}
    public void dumpProcessState(int p0, com.android.internal.app.procstats.StatsEventOutput p1) {}
    public void dumpSummaryLocked(java.io.PrintWriter p0, java.lang.String p1, long p2, boolean p3) {}
    void dumpTotalsLocked(java.io.PrintWriter p0, long p1) {}
    public boolean evaluateSystemProperties(boolean p0) { return false; }
    void forEachAssociation(com.android.internal.util.function.QuintConsumer<com.android.internal.app.procstats.AssociationState, java.lang.Integer, java.lang.String, com.android.internal.app.procstats.AssociationState.SourceKey, com.android.internal.app.procstats.AssociationState.SourceState> p0) {}
    void forEachProcess(java.util.function.Consumer<com.android.internal.app.procstats.ProcessState> p0) {}
    public com.android.internal.app.procstats.AssociationState getAssociationStateLocked(java.lang.String p0, int p1, long p2, java.lang.String p3, java.lang.String p4) { return null; }
    public com.android.internal.app.procstats.ProcessStats.PackageState getPackageStateLocked(java.lang.String p0, int p1, long p2) { return null; }
    public com.android.internal.app.procstats.ProcessState getProcessStateLocked(com.android.internal.app.procstats.ProcessStats.PackageState p0, java.lang.String p1) { return null; }
    public com.android.internal.app.procstats.ProcessState getProcessStateLocked(java.lang.String p0, int p1, long p2, java.lang.String p3) { return null; }
    public com.android.internal.app.procstats.ServiceState getServiceStateLocked(java.lang.String p0, int p1, long p2, java.lang.String p3, java.lang.String p4) { return null; }
    long printMemoryCategory(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, double p3, long p4, long p5, int p6) { return 0L; }
    public void read(java.io.InputStream p0) {}
    java.lang.String readCommonString(android.os.Parcel p0, int p1) { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void reset() {}
    public void resetSafely() {}
    public void updateFragmentation() {}
    public void updateTrackingAssociationsLocked(int p0, long p1) {}
    void writeCommonString(android.os.Parcel p0, java.lang.String p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcel(android.os.Parcel p0, long p1, int p2) {}

    final class AssociationDumpContainer {
        long mActiveTime;
        java.util.ArrayList<android.util.Pair<com.android.internal.app.procstats.AssociationState.SourceKey, com.android.internal.app.procstats.AssociationState.SourceDumpContainer>> mSources;
        final com.android.internal.app.procstats.AssociationState mState = null;
        long mTotalTime;
        AssociationDumpContainer(com.android.internal.app.procstats.ProcessStats p0, com.android.internal.app.procstats.AssociationState p1) {}
    }

    public static final class PackageState {
        public final android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.AssociationState> mAssociations = null;
        public final java.lang.String mPackageName = null;
        public final com.android.internal.app.procstats.ProcessStats mProcessStats = null;
        public final android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ProcessState> mProcesses = null;
        public final android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ServiceState> mServices = null;
        public final int mUid = 0;
        public final long mVersionCode = 0L;
        public PackageState(com.android.internal.app.procstats.ProcessStats p0, java.lang.String p1, int p2, long p3) {}
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1, long p2, int p3) {}
        public com.android.internal.app.procstats.AssociationState getAssociationStateLocked(com.android.internal.app.procstats.ProcessState p0, java.lang.String p1) { return null; }
    }

    public static final class ProcessDataCollection {
        public long avgPss;
        public long avgRss;
        public long avgUss;
        public long maxPss;
        public long maxRss;
        public long maxUss;
        final int[] memStates = null;
        public long minPss;
        public long minRss;
        public long minUss;
        public long numPss;
        final int[] procStates = null;
        final int[] screenStates = null;
        public long totalTime;
        public ProcessDataCollection(int[] p0, int[] p1, int[] p2) {}
        void print(java.io.PrintWriter p0, long p1, boolean p2) {}
    }

    public static final class ProcessStateHolder {
        public final long appVersion = 0L;
        public com.android.internal.app.procstats.ProcessStats.PackageState pkg;
        public com.android.internal.app.procstats.ProcessState state;
        public ProcessStateHolder(long p0) {}
    }

    public static class TotalMemoryUseCollection {
        public boolean hasSwappedOutPss;
        final int[] memStates = null;
        public long[] processStatePss;
        public int[] processStateSamples;
        public long[] processStateTime;
        public double[] processStateWeight;
        final int[] screenStates = null;
        public double sysMemCachedWeight;
        public double sysMemFreeWeight;
        public double sysMemKernelWeight;
        public double sysMemNativeWeight;
        public int sysMemSamples;
        public long[] sysMemUsage;
        public double sysMemZRamWeight;
        public long totalTime;
        public TotalMemoryUseCollection(int[] p0, int[] p1) {}
    }
}
