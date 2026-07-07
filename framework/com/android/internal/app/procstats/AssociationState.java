package com.android.internal.app.procstats;

public final class AssociationState {
    static final java.util.Comparator<android.util.Pair<com.android.internal.app.procstats.AssociationState.SourceKey, com.android.internal.app.procstats.AssociationState.SourceDumpContainer>> ASSOCIATION_COMPARATOR = null;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ProcessStats";
    private static final boolean VALIDATE_TIMES = false;
    private static final com.android.internal.app.procstats.AssociationState.SourceKey sTmpSourceKey = null;
    private final java.lang.String mName = null;
    private final com.android.internal.app.procstats.ProcessStats.PackageState mPackageState = null;
    private com.android.internal.app.procstats.ProcessState mProc;
    private final java.lang.String mProcessName = null;
    private final com.android.internal.app.procstats.ProcessStats mProcessStats = null;
    final android.util.ArrayMap<com.android.internal.app.procstats.AssociationState.SourceKey, com.android.internal.app.procstats.AssociationState.SourceState> mSources = null;
    private int mTotalActiveCount;
    private long mTotalActiveDuration;
    private int mTotalActiveNesting;
    private long mTotalActiveStartUptime;
    private int mTotalCount;
    private long mTotalDuration;
    private int mTotalNesting;
    private long mTotalStartUptime;
    public AssociationState(com.android.internal.app.procstats.ProcessStats p0, com.android.internal.app.procstats.ProcessStats.PackageState p1, java.lang.String p2, java.lang.String p3, com.android.internal.app.procstats.ProcessState p4) {}
    static java.util.ArrayList<android.util.Pair<com.android.internal.app.procstats.AssociationState.SourceKey, com.android.internal.app.procstats.AssociationState.SourceDumpContainer>> createSortedAssociations(long p0, long p1, android.util.ArrayMap<com.android.internal.app.procstats.AssociationState.SourceKey, com.android.internal.app.procstats.AssociationState.SourceState> p2) { return null; }
    static void dumpActiveDurationSummary(java.io.PrintWriter p0, com.android.internal.app.procstats.AssociationState.SourceState p1, long p2, long p3, boolean p4) {}
    static void dumpSources(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.ArrayList<android.util.Pair<com.android.internal.app.procstats.AssociationState.SourceKey, com.android.internal.app.procstats.AssociationState.SourceDumpContainer>> p4, long p5, long p6, java.lang.String p7, boolean p8, boolean p9) {}
    static long dumpTime(java.io.PrintWriter p0, java.lang.String p1, com.android.internal.app.procstats.AssociationState.SourceState p2, long p3, long p4, boolean p5, boolean p6) { return 0L; }
    public void add(com.android.internal.app.procstats.AssociationState p0) {}
    public void commitStateTime(long p0) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1, long p2) {}
    public void dumpStats(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.ArrayList<android.util.Pair<com.android.internal.app.procstats.AssociationState.SourceKey, com.android.internal.app.procstats.AssociationState.SourceDumpContainer>> p4, long p5, long p6, java.lang.String p7, boolean p8, boolean p9) {}
    public void dumpTimesCheckin(java.io.PrintWriter p0, java.lang.String p1, int p2, long p3, java.lang.String p4, long p5) {}
    public long getActiveDuration(long p0) { return 0L; }
    public java.lang.String getName() { return null; }
    public java.lang.String getPackage() { return null; }
    public com.android.internal.app.procstats.ProcessState getProcess() { return null; }
    public java.lang.String getProcessName() { return null; }
    public long getTotalDuration(long p0) { return 0L; }
    public int getUid() { return 0; }
    public boolean hasProcessOrPackage(java.lang.String p0) { return false; }
    public boolean isInUse() { return false; }
    public java.lang.String readFromParcel(com.android.internal.app.procstats.ProcessStats p0, android.os.Parcel p1, int p2) { return null; }
    public void resetSafely(long p0) {}
    public void setProcess(com.android.internal.app.procstats.ProcessState p0) {}
    public com.android.internal.app.procstats.AssociationState.SourceState startSource(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(com.android.internal.app.procstats.ProcessStats p0, android.os.Parcel p1, long p2) {}

    static final class SourceDumpContainer {
        public long mActiveTime;
        public final com.android.internal.app.procstats.AssociationState.SourceState mState = null;
        public long mTotalTime;
        public SourceDumpContainer(com.android.internal.app.procstats.AssociationState.SourceState p0) {}
    }

    public static final class SourceKey {
        java.lang.String mPackage;
        java.lang.String mProcess;
        int mUid;
        SourceKey(int p0, java.lang.String p1, java.lang.String p2) {}
        SourceKey(com.android.internal.app.procstats.ProcessStats p0, android.os.Parcel p1, int p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        void writeToParcel(com.android.internal.app.procstats.ProcessStats p0, android.os.Parcel p1) {}
    }

    public static final class SourceState implements android.os.Parcelable {
        int mActiveCount;
        long mActiveDuration;
        com.android.internal.app.procstats.DurationsTable mActiveDurations;
        int mActiveNesting;
        int mActiveProcState;
        long mActiveStartUptime;
        private final com.android.internal.app.procstats.AssociationState mAssociationState = null;
        private com.android.internal.app.procstats.AssociationState.SourceState mCommonSourceState;
        int mCount;
        long mDuration;
        boolean mInTrackingList;
        final com.android.internal.app.procstats.AssociationState.SourceKey mKey = null;
        int mNesting;
        int mProcState;
        int mProcStateSeq;
        private final com.android.internal.app.procstats.ProcessStats mProcessStats = null;
        long mStartUptime;
        private final com.android.internal.app.procstats.ProcessState mTargetProcess = null;
        long mTrackingUptime;
        SourceState(com.android.internal.app.procstats.ProcessStats p0, com.android.internal.app.procstats.AssociationState p1, com.android.internal.app.procstats.ProcessState p2, com.android.internal.app.procstats.AssociationState.SourceKey p3) {}
        private com.android.internal.app.procstats.AssociationState.SourceState getCommonSourceState(boolean p0) { return null; }
        private void stopTracking(long p0) {}
        private void stopTrackingProcState() {}
        void add(com.android.internal.app.procstats.AssociationState.SourceState p0) {}
        void commitStateTime(long p0) {}
        public int describeContents() { return 0; }
        public com.android.internal.app.procstats.AssociationState getAssociationState() { return null; }
        public java.lang.String getProcessName() { return null; }
        public int getUid() { return 0; }
        boolean isInUse() { return false; }
        void makeDurations() {}
        java.lang.String readFromParcel(android.os.Parcel p0) { return null; }
        void resetSafely(long p0) {}
        long start() { return 0L; }
        long start(long p0) { return 0L; }
        void startActive(long p0) {}
        long stop(long p0) { return 0L; }
        public void stop() {}
        void stopActive(long p0) {}
        boolean stopActiveIfNecessary(int p0, long p1) { return false; }
        public java.lang.String toString() { return null; }
        public void trackProcState(int p0, int p1, long p2) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
