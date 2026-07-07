package com.android.internal.os;

public class KernelSingleUidTimeReader {
    private static final boolean DBG = false;
    private static final java.lang.String PROC_FILE_DIR = "/proc/uid/";
    private static final java.lang.String PROC_FILE_NAME = "/time_in_state";
    private static final java.lang.String TAG = null;
    public static final int TOTAL_READ_ERROR_COUNT = 5;
    private static final java.lang.String UID_TIMES_PROC_FILE = "/proc/uid_time_in_state";
    private boolean mBpfTimesAvailable;
    private final int mCpuFreqsCount = 0;
    private boolean mCpuFreqsCountVerified;
    private final com.android.internal.os.KernelSingleUidTimeReader.Injector mInjector = null;
    private android.util.SparseArray<long[]> mLastUidCpuTimeMs;
    private int mReadErrorCounter;
    private boolean mSingleUidCpuTimesAvailable;
    public KernelSingleUidTimeReader(int p0) {}
    public KernelSingleUidTimeReader(int p0, com.android.internal.os.KernelSingleUidTimeReader.Injector p1) {}
    private static final native boolean canReadBpfTimes();
    private long[] readCpuTimesFromByteBuffer(java.nio.ByteBuffer p0) { return null; }
    private void verifyCpuFreqsCount(int p0, java.lang.String p1) {}
    public void addDelta(int p0, com.android.internal.os.LongArrayMultiStateCounter p1, long p2) {}
    public void addDelta(int p0, com.android.internal.os.LongArrayMultiStateCounter p1, long p2, long[] p3) {}
    public long[] computeDelta(int p0, long[] p1) { return null; }
    public long[] getDeltaLocked(long[] p0, long[] p1) { return null; }
    public android.util.SparseArray<long[]> getLastUidCpuTimeMs() { return null; }
    public long[] readDeltaMs(int p0) { return null; }
    public void removeUid(int p0) {}
    public void removeUidsInRange(int p0, int p1) {}
    public void setAllUidsCpuTimesMs(android.util.SparseArray<long[]> p0) {}
    public void setSingleUidCpuTimesAvailable(boolean p0) {}
    public boolean singleUidCpuTimesAvailable() { return false; }

    public static class Injector {
        public Injector() {}
        private static native boolean addDeltaForTest(int p0, long p1, long p2, long[][] p3, long[] p4);
        private static native boolean addDeltaFromBpf(int p0, long p1, long p2, long[] p3);
        public boolean addDelta(int p0, com.android.internal.os.LongArrayMultiStateCounter p1, long p2, long[] p3) { return false; }
        public boolean addDeltaForTest(int p0, com.android.internal.os.LongArrayMultiStateCounter p1, long p2, long[][] p3, long[] p4) { return false; }
        public native long[] readBpfData(int p0);
        public byte[] readData(java.lang.String p0) throws java.io.IOException { return null; }
    }
}
