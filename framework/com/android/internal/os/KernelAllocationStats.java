package com.android.internal.os;

public final class KernelAllocationStats {
    private KernelAllocationStats() {}
    public static native com.android.internal.os.KernelAllocationStats.ProcessDmabuf[] getDmabufAllocations();
    public static native int getDmabufSizeForProcessKb(int p0);
    public static native com.android.internal.os.KernelAllocationStats.ProcessGpuMem[] getGpuAllocations();
    public static native com.android.internal.os.KernelAllocationStats.SlabCacheStats[] getSlabInfoStats();

    public static final class ProcessDmabuf {
        public final int oomScore = 0;
        public final java.lang.String processName = null;
        public final int retainedBuffersCount = 0;
        public final int retainedSizeKb = 0;
        public final int surfaceFlingerCount = 0;
        public final int surfaceFlingerSizeKb = 0;
        public final int uid = 0;
        public ProcessDmabuf(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6) {}
    }

    public static final class ProcessGpuMem {
        public final int gpuMemoryKb = 0;
        public final int pid = 0;
        public ProcessGpuMem(int p0, int p1) {}
    }

    public static final class SlabCacheStats {
        public final java.lang.String name = null;
        public final int totalMemUsageKb = 0;
        public SlabCacheStats(java.lang.String p0, int p1) {}
    }
}
