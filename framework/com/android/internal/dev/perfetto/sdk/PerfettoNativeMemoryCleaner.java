package com.android.internal.dev.perfetto.sdk;

public class PerfettoNativeMemoryCleaner {
    private final com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner.AllocationStats mAllocationStats = null;
    private final java.lang.ref.Cleaner mCleaner = null;
    public PerfettoNativeMemoryCleaner() {}
    public PerfettoNativeMemoryCleaner(com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner.AllocationStats p0) {}
    private static native void applyNativeFunction(long p0, long p1);
    public final boolean isReportAllocationStats() { return false; }
    public void registerNativeAllocation(java.lang.Object p0, long p1, long p2) {}

    public static final class AllocationStats {
        private final java.util.Map<java.lang.String, java.lang.Integer> allocCount = null;
        private final java.util.Map<java.lang.String, java.lang.Integer> freeCount = null;
        public AllocationStats() {}
        public int getAllocCountForTarget(java.lang.String p0) { return 0; }
        public int getFreeCountForTarget(java.lang.String p0) { return 0; }
        void registerAlloc(java.lang.String p0) {}
        void registerFree(java.lang.String p0) {}
        public java.lang.String reportStats() { return null; }
        public void reset() {}
    }

    static final class FreeNativeMemoryRunnable implements java.lang.Runnable {
        private final com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner.AllocationStats mAllocationStats = null;
        private final java.lang.String mClsName = null;
        private final long mFreeFunctionPtr = 0L;
        private final long mPtr = 0L;
        public FreeNativeMemoryRunnable(long p0, long p1, java.lang.String p2, com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner.AllocationStats p3) {}
        public void run() {}
    }
}
