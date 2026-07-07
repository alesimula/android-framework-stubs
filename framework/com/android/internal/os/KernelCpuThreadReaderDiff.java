package com.android.internal.os;

public class KernelCpuThreadReaderDiff {
    private static final int OTHER_THREADS_ID = -1;
    private static final java.lang.String OTHER_THREADS_NAME = "__OTHER_THREADS";
    private static final java.lang.String TAG = "KernelCpuThreadReaderDiff";
    private int mMinimumTotalCpuUsageMillis;
    private java.util.Map<com.android.internal.os.KernelCpuThreadReaderDiff.ThreadKey, int[]> mPreviousCpuUsage;
    private final com.android.internal.os.KernelCpuThreadReader mReader = null;
    public KernelCpuThreadReaderDiff(com.android.internal.os.KernelCpuThreadReader p0, int p1) {}
    private static void addToCpuUsage(int[] p0, int[] p1) {}
    private void applyThresholding(com.android.internal.os.KernelCpuThreadReader.ProcessCpuUsage p0) {}
    private static void changeToDiffs(java.util.Map<com.android.internal.os.KernelCpuThreadReaderDiff.ThreadKey, int[]> p0, com.android.internal.os.KernelCpuThreadReader.ProcessCpuUsage p1) {}
    private static int[] cpuTimeDiff(int[] p0, int[] p1) { return null; }
    private static java.util.Map<com.android.internal.os.KernelCpuThreadReaderDiff.ThreadKey, int[]> createCpuUsageMap(java.util.List<com.android.internal.os.KernelCpuThreadReader.ProcessCpuUsage> p0) { return null; }
    private static int totalCpuUsage(int[] p0) { return 0; }
    public int[] getCpuFrequenciesKhz() { return null; }
    public java.util.ArrayList<com.android.internal.os.KernelCpuThreadReader.ProcessCpuUsage> getProcessCpuUsageDiffed() { return null; }
    void setMinimumTotalCpuUsageMillis(int p0) {}

    private static class ThreadKey {
        private final int mProcessId = 0;
        private final int mProcessNameHash = 0;
        private final int mThreadId = 0;
        private final int mThreadNameHash = 0;
        ThreadKey(int p0, int p1, java.lang.String p2, java.lang.String p3) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
