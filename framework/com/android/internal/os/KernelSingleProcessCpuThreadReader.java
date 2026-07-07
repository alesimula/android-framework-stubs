package com.android.internal.os;

public final class KernelSingleProcessCpuThreadReader {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "KernelSingleProcCpuThreadRdr";
    private final com.android.internal.os.KernelSingleProcessCpuThreadReader.CpuTimeInStateReader mCpuTimeInStateReader = null;
    private int mFrequencyCount;
    private boolean mIsTracking;
    private final int mPid = 0;
    private int[] mSelectedThreadNativeTids;
    public KernelSingleProcessCpuThreadReader(int p0, com.android.internal.os.KernelSingleProcessCpuThreadReader.CpuTimeInStateReader p1) throws java.io.IOException {}
    public static com.android.internal.os.KernelSingleProcessCpuThreadReader create(int p0) { return null; }
    private native int getCpuFrequencyCount(com.android.internal.os.KernelSingleProcessCpuThreadReader.CpuTimeInStateReader p0);
    private native boolean readProcessCpuUsage(int p0, long[] p1, long[] p2, com.android.internal.os.KernelSingleProcessCpuThreadReader.CpuTimeInStateReader p3);
    private native boolean startAggregatingThreadCpuTimes(int[] p0, com.android.internal.os.KernelSingleProcessCpuThreadReader.CpuTimeInStateReader p1);
    private native boolean startTrackingProcessCpuTimes(int p0, com.android.internal.os.KernelSingleProcessCpuThreadReader.CpuTimeInStateReader p1);
    public int getCpuFrequencyCount() { return 0; }
    public com.android.internal.os.KernelSingleProcessCpuThreadReader.ProcessCpuUsage getProcessCpuUsage() { return null; }
    public void setSelectedThreadIds(int[] p0) {}
    public void startTrackingThreadCpuTimes() {}

    public static interface CpuTimeInStateReader {
        public java.lang.String[] getAggregatedTaskCpuFreqTimes(int p0);
        public int getCpuFrequencyCount();
        public boolean startAggregatingTaskCpuTimes(int p0, int p1);
        public boolean startTrackingProcessCpuTimes(int p0);
    }

    public static class ProcessCpuUsage {
        public long[] selectedThreadCpuTimesMillis;
        public long[] threadCpuTimesMillis;
        public ProcessCpuUsage(int p0) {}
    }
}
