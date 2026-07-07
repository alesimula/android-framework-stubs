package com.android.internal.os;

public final class MemcgProcMemoryUtil {
    private static final java.lang.String CGROUP_ROOT = "/sys/fs/cgroup";
    private static final int[] MEMCG_MEMORY_FORMAT = null;
    private static final int MEMCG_STAT_ANON_IDX = 0;
    private static final java.lang.String[] MEMCG_STAT_FIELDS = null;
    private static final int MEMCG_STAT_FILE_IDX = 1;
    private static final int MEMCG_STAT_FILE_MAPPED_IDX = 4;
    private static final int MEMCG_STAT_KERNEL_IDX = 2;
    private static final int MEMCG_STAT_PGMAJFAULT_IDX = 5;
    private static final int MEMCG_STAT_PGSCAN_DIRECT_IDX = 6;
    private static final int MEMCG_STAT_SHMEM_IDX = 3;
    private static final java.lang.String PROC_ROOT = "/proc/";
    private static final java.lang.String TAG = "MemcgProcMemoryUtil";
    private MemcgProcMemoryUtil() {}
    private static java.lang.String getCgroupPath(int p0, int p1) { return null; }
    public static com.android.internal.os.MemcgProcMemoryUtil.MemcgHighWaterMarkMemorySnapshot readHighWaterMarkMemorySnapshot(int p0, int p1) { return null; }
    private static com.android.internal.os.MemcgProcMemoryUtil.MemcgHighWaterMarkMemorySnapshot readMemcgHighWaterMarkMemorySnapshot(java.lang.String p0) { return null; }
    public static com.android.internal.os.MemcgProcMemoryUtil.MemcgMemorySnapshot readMemcgMemorySnapshot(int p0, int p1) { return null; }
    private static com.android.internal.os.MemcgProcMemoryUtil.MemcgMemorySnapshot readMemcgMemorySnapshot(java.lang.String p0) { return null; }
    public static com.android.internal.os.MemcgProcMemoryUtil.MemcgMemoryStatSnapshot readMemcgProcessStatSnapshot(int p0, int p1) { return null; }
    private static com.android.internal.os.MemcgProcMemoryUtil.MemcgMemoryStatSnapshot readMemcgStatSnapshot(java.lang.String p0) { return null; }
    private static java.lang.Long readSingleValueFromMemcgFile(java.nio.file.Path p0, java.lang.String p1, int[] p2) { return null; }

    public static final class MemcgHighWaterMarkMemorySnapshot {
        public long memcgMemoryPeakInBytes;
        public long memcgSwapMemoryPeakInBytes;
        public MemcgHighWaterMarkMemorySnapshot() {}
    }

    public static final class MemcgMemorySnapshot {
        public long memcgMemoryInBytes;
        public long memcgSwapMemoryInBytes;
        public MemcgMemorySnapshot() {}
    }

    public static final class MemcgMemoryStatSnapshot {
        public int anonInKiloBytes;
        public int directPageScanCount;
        public int fileInKiloBytes;
        public int fileMappedInKiloBytes;
        public int majorPageFaultCount;
        public int memorySwapInKiloBytes;
        public int shmemInKiloBytes;
        public int totalKernelInKiloBytes;
        public MemcgMemoryStatSnapshot() {}
    }
}
