package com.android.internal.app.procstats;

public final class UidState {
    private static final java.lang.String TAG = "ProcessStats";
    private int mCurCombinedState;
    private final com.android.internal.app.procstats.DurationsTable mDurations = null;
    private android.util.ArraySet<com.android.internal.app.procstats.ProcessState> mProcesses;
    private long mStartTime;
    private final com.android.internal.app.procstats.ProcessStats mStats = null;
    private long mTotalRunningDuration;
    private long mTotalRunningStartTime;
    private final int mUid = 0;
    public UidState(com.android.internal.app.procstats.ProcessStats p0, int p1) {}
    private int calcCombinedState() { return 0; }
    private void setCombinedStateInner(int p0, long p1) {}
    public void add(com.android.internal.app.procstats.UidState p0) {}
    void addProcess(com.android.internal.app.procstats.ProcessState p0) {}
    void addProcess(com.android.internal.app.procstats.ProcessState p0, long p1) {}
    public com.android.internal.app.procstats.UidState clone() { return null; }
    public void commitStateTime(long p0) {}
    void dumpState(java.io.PrintWriter p0, java.lang.String p1, int[] p2, int[] p3, int[] p4, long p5) {}
    public long[] getAggregatedDurationsInStates() { return null; }
    public int getCombinedState() { return 0; }
    public long getDuration(int p0, long p1) { return 0L; }
    public int getDurationsBucketCount() { return 0; }
    public long getTotalRunningDuration(long p0) { return 0L; }
    public boolean hasPackage(java.lang.String p0) { return false; }
    public boolean isInUse() { return false; }
    boolean readFromParcel(android.os.Parcel p0) { return false; }
    void removeProcess(com.android.internal.app.procstats.ProcessState p0, long p1) {}
    public void resetSafely(long p0) {}
    public java.lang.String toString() { return null; }
    public void updateCombinedState(int p0, long p1) {}
    public void updateCombinedState(long p0) {}
    void writeToParcel(android.os.Parcel p0, long p1) {}
}
