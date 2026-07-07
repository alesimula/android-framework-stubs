package com.android.internal.os;

public class ProcessCpuTracker {
    private static final boolean DEBUG = false;
    private static final int[] LOAD_AVERAGE_FORMAT = null;
    private static final int[] PROCESS_FULL_STATS_FORMAT = null;
    static final int PROCESS_FULL_STAT_MAJOR_FAULTS = 2;
    static final int PROCESS_FULL_STAT_MINOR_FAULTS = 1;
    static final int PROCESS_FULL_STAT_STIME = 4;
    static final int PROCESS_FULL_STAT_UTIME = 3;
    static final int PROCESS_FULL_STAT_VSIZE = 5;
    private static final int[] PROCESS_SCHEDSTATS_FORMAT = null;
    static final int PROCESS_SCHEDSTAT_CPU_DELAY_TIME = 1;
    static final int PROCESS_SCHEDSTAT_CPU_TIME = 0;
    private static final int[] PROCESS_STATS_FORMAT = null;
    static final int PROCESS_STAT_MAJOR_FAULTS = 1;
    static final int PROCESS_STAT_MINOR_FAULTS = 0;
    static final int PROCESS_STAT_STIME = 3;
    static final int PROCESS_STAT_UTIME = 2;
    private static final int[] SYSTEM_CPU_FORMAT = null;
    private static final java.lang.String TAG = "ProcessCpuTracker";
    private static final boolean localLOGV = false;
    private static final java.util.Comparator<com.android.internal.os.ProcessCpuTracker.Stats> sLoadComparator = null;
    private long mBaseIdleTime;
    private long mBaseIoWaitTime;
    private long mBaseIrqTime;
    private long mBaseSoftIrqTime;
    private long mBaseSystemTime;
    private long mBaseUserTime;
    private int[] mCurPids;
    private int[] mCurThreadPids;
    private long mCurrentSampleRealTime;
    private long mCurrentSampleTime;
    private long mCurrentSampleWallTime;
    private boolean mFirst;
    private final boolean mIncludeThreads = false;
    private final long mJiffyMillis = 0L;
    private long mLastSampleRealTime;
    private long mLastSampleTime;
    private long mLastSampleWallTime;
    private float mLoad1;
    private float mLoad15;
    private float mLoad5;
    private final float[] mLoadAverageData = null;
    private final java.util.ArrayList<com.android.internal.os.ProcessCpuTracker.Stats> mProcStats = null;
    private final long[] mProcessFullStatsData = null;
    private final java.lang.String[] mProcessFullStatsStringData = null;
    private final long[] mProcessStatsData = null;
    private int mRelIdleTime;
    private int mRelIoWaitTime;
    private int mRelIrqTime;
    private int mRelSoftIrqTime;
    private boolean mRelStatsAreGood;
    private int mRelSystemTime;
    private int mRelUserTime;
    private final long[] mSystemCpuData = null;
    private final java.util.ArrayList<com.android.internal.os.ProcessCpuTracker.Stats> mWorkingProcs = null;
    private boolean mWorkingProcsSorted;
    public ProcessCpuTracker(boolean p0) {}
    private int[] collectStats(java.lang.String p0, int p1, boolean p2, int[] p3, java.util.ArrayList<com.android.internal.os.ProcessCpuTracker.Stats> p4) { return null; }
    private static void dumpProcessCpuProto(android.util.proto.ProtoOutputStream p0, com.android.internal.os.ProcessCpuTracker.Stats p1, com.android.internal.os.ProcessCpuTracker.Stats p2) {}
    private void getName(com.android.internal.os.ProcessCpuTracker.Stats p0, java.lang.String p1) {}
    private void printProcessCPU(java.io.PrintWriter p0, java.lang.String p1, int p2, java.lang.String p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11) {}
    private void printRatio(java.io.PrintWriter p0, long p1, long p2) {}
    private void updateLocked() {}
    final void buildWorkingProcs() {}
    public final int countStats() { return 0; }
    public final int countWorkingStats() { return 0; }
    public final void dumpProto(java.io.FileDescriptor p0) {}
    public long getCpuDelayTimeForPid(int p0) { return 0L; }
    public long getCpuTimeForPid(int p0) { return 0L; }
    public final int getLastIdleTime() { return 0; }
    public final int getLastIoWaitTime() { return 0; }
    public final int getLastIrqTime() { return 0; }
    public final int getLastSoftIrqTime() { return 0; }
    public final int getLastSystemTime() { return 0; }
    public final int getLastUserTime() { return 0; }
    public final com.android.internal.os.ProcessCpuTracker.Stats getStats(int p0) { return null; }
    public final java.util.List<com.android.internal.os.ProcessCpuTracker.Stats> getStats(com.android.internal.os.ProcessCpuTracker.FilterStats p0) { return null; }
    public final float getTotalCpuPercent() { return 0.0f; }
    public final com.android.internal.os.ProcessCpuTracker.Stats getWorkingStats(int p0) { return null; }
    public final boolean hasGoodLastStats() { return false; }
    public void init() {}
    public void onLoadChanged(float p0, float p1, float p2) {}
    public int onMeasureProcessName(java.lang.String p0) { return 0; }
    public final java.lang.String printCurrentLoad() { return null; }
    public final java.lang.String printCurrentState(long p0) { return null; }
    public final java.lang.String printCurrentState(long p0, int p1) { return null; }
    public void update() {}

    public static interface FilterStats {
        public boolean needed(com.android.internal.os.ProcessCpuTracker.Stats p0);
    }

    public static class Stats {
        public boolean active;
        public boolean added;
        public java.lang.String baseName;
        public long base_majfaults;
        public long base_minfaults;
        public long base_stime;
        public long base_uptime;
        public long base_utime;
        public android.os.BatteryStats.Uid.Proc batteryStats;
        final java.lang.String cmdlineFile = null;
        public boolean interesting;
        public java.lang.String name;
        public int nameWidth;
        public final int pid = 0;
        public int rel_majfaults;
        public int rel_minfaults;
        public int rel_stime;
        public long rel_uptime;
        public int rel_utime;
        public boolean removed;
        final java.lang.String statFile = null;
        final java.util.ArrayList<com.android.internal.os.ProcessCpuTracker.Stats> threadStats = null;
        final java.lang.String threadsDir = null;
        public final int uid = 0;
        public long vsize;
        public boolean working;
        final java.util.ArrayList<com.android.internal.os.ProcessCpuTracker.Stats> workingThreads = null;
        Stats(int p0, int p1, boolean p2) {}
        private static int getUid(java.lang.String p0) { return 0; }
    }
}
