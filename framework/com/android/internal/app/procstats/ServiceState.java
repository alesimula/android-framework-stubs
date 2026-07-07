package com.android.internal.app.procstats;

public final class ServiceState {
    private static final boolean DEBUG = false;
    public static final int SERVICE_BOUND = 2;
    public static final int SERVICE_COUNT = 5;
    public static final int SERVICE_EXEC = 3;
    public static final int SERVICE_FOREGROUND = 4;
    public static final int SERVICE_RUN = 0;
    public static final int SERVICE_STARTED = 1;
    private static final java.lang.String TAG = "ProcessStats";
    private int mBoundCount;
    private long mBoundStartTime;
    private int mBoundState;
    private final com.android.internal.app.procstats.DurationsTable mDurations = null;
    private int mExecCount;
    private long mExecStartTime;
    private int mExecState;
    private int mForegroundCount;
    private long mForegroundStartTime;
    private int mForegroundState;
    private final java.lang.String mName = null;
    private java.lang.Object mOwner;
    private final java.lang.String mPackage = null;
    private com.android.internal.app.procstats.ProcessState mProc;
    private final java.lang.String mProcessName = null;
    private boolean mRestarting;
    private int mRunCount;
    private long mRunStartTime;
    private int mRunState;
    private boolean mStarted;
    private int mStartedCount;
    private long mStartedStartTime;
    private int mStartedState;
    public ServiceState(com.android.internal.app.procstats.ProcessStats p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, com.android.internal.app.procstats.ProcessState p4) {}
    private void dumpStats(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, int p6, int p7, long p8, long p9, long p10, boolean p11) {}
    private void dumpTimeCheckin(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, int p3, long p4, java.lang.String p5, int p6, int p7, int p8, long p9, long p10) {}
    private void updateRunning(int p0, long p1) {}
    public void add(com.android.internal.app.procstats.ServiceState p0) {}
    public void applyNewOwner(java.lang.Object p0) {}
    public void clearCurrentOwner(java.lang.Object p0, boolean p1) {}
    public void commitStateTime(long p0) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1, long p2) {}
    public void dumpStats(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, long p4, long p5, boolean p6, boolean p7) {}
    public long dumpTime(java.io.PrintWriter p0, java.lang.String p1, int p2, int p3, long p4, long p5) { return 0L; }
    long dumpTimeInternal(java.io.PrintWriter p0, java.lang.String p1, int p2, int p3, long p4, long p5, boolean p6) { return 0L; }
    public void dumpTimesCheckin(java.io.PrintWriter p0, java.lang.String p1, int p2, long p3, java.lang.String p4, long p5) {}
    public long getDuration(int p0, int p1, long p2, int p3, long p4) { return 0L; }
    public java.lang.String getName() { return null; }
    public java.lang.String getPackage() { return null; }
    public com.android.internal.app.procstats.ProcessState getProcess() { return null; }
    public java.lang.String getProcessName() { return null; }
    public boolean isInUse() { return false; }
    public boolean isRestarting() { return false; }
    public boolean readFromParcel(android.os.Parcel p0) { return false; }
    public void resetSafely(long p0) {}
    public void setBound(boolean p0, int p1, long p2) {}
    public void setExecuting(boolean p0, int p1, long p2) {}
    public void setForeground(boolean p0, int p1, long p2) {}
    public void setMemFactor(int p0, long p1) {}
    public void setProcess(com.android.internal.app.procstats.ProcessState p0) {}
    public void setRestarting(boolean p0, int p1, long p2) {}
    public void setStarted(boolean p0, int p1, long p2) {}
    public java.lang.String toString() { return null; }
    public void updateStartedState(int p0, long p1) {}
    public void writeToParcel(android.os.Parcel p0, long p1) {}
    public void writeTypeToProto(android.util.proto.ProtoOutputStream p0, long p1, int p2, int p3, int p4, int p5, long p6, long p7) {}
}
