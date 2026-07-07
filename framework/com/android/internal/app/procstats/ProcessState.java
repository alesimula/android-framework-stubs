package com.android.internal.app.procstats;

public final class ProcessState {
    public static final java.util.Comparator<com.android.internal.app.procstats.ProcessState> COMPARATOR = null;
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_PARCEL = false;
    public static final int[] PROCESS_STATE_TO_STATE = null;
    private static final java.lang.String TAG = "ProcessStats";
    private boolean mActive;
    private long mAvgCachedKillPss;
    private com.android.internal.app.procstats.ProcessState mCommonProcess;
    android.util.ArrayMap<com.android.internal.app.procstats.AssociationState.SourceKey, com.android.internal.app.procstats.AssociationState.SourceState> mCommonSources;
    private int mCurCombinedState;
    private boolean mDead;
    private final com.android.internal.app.procstats.DurationsTable mDurations = null;
    private int mLastPssState;
    private long mLastPssTime;
    private long mMaxCachedKillPss;
    private long mMinCachedKillPss;
    private boolean mMultiPackage;
    private final java.lang.String mName = null;
    private int mNumActiveServices;
    private int mNumCachedKill;
    private int mNumExcessiveCpu;
    private int mNumStartedServices;
    private final java.lang.String mPackage = null;
    private final com.android.internal.app.procstats.PssTable mPssTable = null;
    private long mStartTime;
    private int mStateBeforeFrozen;
    private final com.android.internal.app.procstats.ProcessStats mStats = null;
    private long mTmpTotalTime;
    private long mTotalRunningDuration;
    private final long[] mTotalRunningPss = null;
    private long mTotalRunningStartTime;
    private final int mUid = 0;
    private final long mVersion = 0L;
    public com.android.internal.app.procstats.ProcessState tmpFoundSubProc;
    public int tmpNumInUse;
    public ProcessState(com.android.internal.app.procstats.ProcessState p0, java.lang.String p1, int p2, long p3, java.lang.String p4, long p5) {}
    public ProcessState(com.android.internal.app.procstats.ProcessStats p0, java.lang.String p1, int p2, long p3, java.lang.String p4) {}
    private void addCachedKill(int p0, long p1, long p2, long p3) {}
    private void dumpProcessSummaryDetails(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, int[] p3, int[] p4, int[] p5, long p6, long p7, boolean p8) {}
    public static void dumpPssSamples(java.io.PrintWriter p0, long[] p1, int p2) {}
    public static void dumpPssSamplesCheckin(java.io.PrintWriter p0, long[] p1, int p2) {}
    private void ensureNotDead() {}
    private com.android.internal.app.procstats.ProcessState pullFixedProc(android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ProcessStats.ProcessStateHolder> p0, int p1) { return null; }
    static void writeCompressedProcessName(android.util.proto.ProtoOutputStream p0, long p1, java.lang.String p2, java.lang.String p3, boolean p4) {}
    public void add(com.android.internal.app.procstats.ProcessState p0) {}
    public void addPss(long p0, long p1, long p2, boolean p3, int p4, long p5, android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ProcessStats.ProcessStateHolder> p6) {}
    public void aggregatePss(com.android.internal.app.procstats.ProcessStats.TotalMemoryUseCollection p0, long p1) {}
    public com.android.internal.app.procstats.ProcessState clone(long p0) { return null; }
    public void commitStateTime(long p0) {}
    public void computeProcessData(com.android.internal.app.procstats.ProcessStats.ProcessDataCollection p0, long p1) {}
    public long computeProcessTimeLocked(int[] p0, int[] p1, int[] p2, long p3) { return 0L; }
    public void decActiveServices(java.lang.String p0) {}
    public void decStartedServices(int p0, long p1, java.lang.String p2) {}
    public void dumpAggregatedProtoForStatsd(android.util.proto.ProtoOutputStream p0, long p1, java.lang.String p2, int p3, long p4, com.android.internal.app.ProcessMap<android.util.ArraySet<com.android.internal.app.procstats.ProcessStats.PackageState>> p5, android.util.SparseArray<android.util.ArraySet<java.lang.String>> p6) {}
    public void dumpAllPssCheckin(java.io.PrintWriter p0) {}
    public void dumpAllStateCheckin(java.io.PrintWriter p0, long p1) {}
    public void dumpCsv(java.io.PrintWriter p0, boolean p1, int[] p2, boolean p3, int[] p4, boolean p5, int[] p6, long p7) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1, java.lang.String p2, int p3, long p4) {}
    void dumpInternalLocked(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, long p3, long p4, boolean p5) {}
    public void dumpPackageProcCheckin(java.io.PrintWriter p0, java.lang.String p1, int p2, long p3, java.lang.String p4, long p5) {}
    public void dumpProcCheckin(java.io.PrintWriter p0, java.lang.String p1, int p2, long p3) {}
    public void dumpProcessState(java.io.PrintWriter p0, java.lang.String p1, int[] p2, int[] p3, int[] p4, long p5) {}
    public void dumpPss(java.io.PrintWriter p0, java.lang.String p1, int[] p2, int[] p3, int[] p4, long p5) {}
    public void dumpStateDurationToStatsd(int p0, com.android.internal.app.procstats.ProcessStats p1, com.android.internal.app.procstats.StatsEventOutput p2) {}
    public void dumpSummary(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, int[] p3, int[] p4, int[] p5, long p6, long p7) {}
    public int getCombinedState() { return 0; }
    public com.android.internal.app.procstats.ProcessState getCommonProcess() { return null; }
    public long getDuration(int p0, long p1) { return 0L; }
    public int getDurationsBucketCount() { return 0; }
    public java.lang.String getName() { return null; }
    com.android.internal.app.procstats.AssociationState.SourceState getOrCreateSourceState(com.android.internal.app.procstats.AssociationState.SourceKey p0) { return null; }
    public java.lang.String getPackage() { return null; }
    public long getPssAverage(int p0) { return 0L; }
    public long getPssMaximum(int p0) { return 0L; }
    public long getPssMinimum(int p0) { return 0L; }
    public long getPssRssAverage(int p0) { return 0L; }
    public long getPssRssMaximum(int p0) { return 0L; }
    public long getPssRssMinimum(int p0) { return 0L; }
    public long getPssSampleCount(int p0) { return 0L; }
    public long getPssUssAverage(int p0) { return 0L; }
    public long getPssUssMaximum(int p0) { return 0L; }
    public long getPssUssMinimum(int p0) { return 0L; }
    public long getTotalRunningDuration(long p0) { return 0L; }
    public int getUid() { return 0; }
    public long getVersion() { return 0L; }
    public boolean hasAnyData() { return false; }
    public void incActiveServices(java.lang.String p0) {}
    public void incStartedServices(int p0, long p1, java.lang.String p2) {}
    public boolean isActive() { return false; }
    public boolean isInUse() { return false; }
    public boolean isMultiPackage() { return false; }
    public void makeActive() {}
    public void makeDead() {}
    public void makeInactive() {}
    public void makeStandalone() {}
    public void onProcessFrozen(long p0, android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ProcessStats.ProcessStateHolder> p1) {}
    public void onProcessUnfrozen(long p0, android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ProcessStats.ProcessStateHolder> p1) {}
    public com.android.internal.app.procstats.ProcessState pullFixedProc(java.lang.String p0) { return null; }
    boolean readFromParcel(android.os.Parcel p0, int p1, boolean p2) { return false; }
    public void reportExcessiveCpu(android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ProcessStats.ProcessStateHolder> p0) {}
    public void resetSafely(long p0) {}
    void setCombinedState(int p0, long p1, android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ProcessStats.ProcessStateHolder> p2) {}
    void setCombinedStateIdv(int p0, long p1) {}
    public void setMultiPackage(boolean p0) {}
    public void setState(int p0, int p1, long p2, android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ProcessStats.ProcessStateHolder> p3) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, long p1) {}

    static class PssAggr {
        long pss;
        long samples;
        PssAggr() {}
        void add(long p0, long p1) {}
    }
}
