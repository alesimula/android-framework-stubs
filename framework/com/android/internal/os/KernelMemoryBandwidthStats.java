package com.android.internal.os;

public final class KernelMemoryBandwidthStats {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "KernelMemoryBandwidthStats";
    private static final java.lang.String mSysfsFile = "/sys/kernel/memory_state_time/show_stat";
    protected final android.util.LongSparseLongArray mBandwidthEntries = null;
    private boolean mStatsDoNotExist;
    public KernelMemoryBandwidthStats() {}
    public android.util.LongSparseLongArray getBandwidthEntries() { return null; }
    public void parseStats(java.io.BufferedReader p0) throws java.io.IOException {}
    public void updateStats() {}
}
