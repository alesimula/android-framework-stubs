package com.android.internal.os;

public final class ProcfsMemoryUtil {
    private static final int[] CMDLINE_OUT = null;
    private static final int[] DMABUF_FILE_FORMAT = null;
    private static final int[] OOM_SCORE_ADJ_OUT = null;
    private static final java.lang.String[] STATUS_KEYS = null;
    private static final java.lang.String[] VMSTAT_KEYS = null;
    private ProcfsMemoryUtil() {}
    public static android.util.SparseArray<java.lang.String> getProcessCmdlines() { return null; }
    public static java.lang.String readCmdlineFromProcfs() { return null; }
    public static java.lang.String readCmdlineFromProcfs(int p0) { return null; }
    private static java.lang.String readCmdlineFromProcfs(java.lang.String p0) { return null; }
    public static int readDmabufFromProcfs(com.android.internal.os.ProcfsMemoryUtil.DmaBufType p0) { return 0; }
    public static int readDmabufFromProcfs(com.android.internal.os.ProcfsMemoryUtil.DmaBufType p0, int p1) { return 0; }
    private static int readDmabufFromProcfs(com.android.internal.os.ProcfsMemoryUtil.DmaBufType p0, java.lang.String p1) { return 0; }
    public static com.android.internal.os.ProcfsMemoryUtil.MemorySnapshot readMemorySnapshotFromProcfs() { return null; }
    public static com.android.internal.os.ProcfsMemoryUtil.MemorySnapshot readMemorySnapshotFromProcfs(int p0) { return null; }
    private static com.android.internal.os.ProcfsMemoryUtil.MemorySnapshot readMemorySnapshotFromProcfs(java.lang.String p0) { return null; }
    public static int readOomScoreAdjFromProcfs() { return 0; }
    public static int readOomScoreAdjFromProcfs(int p0) { return 0; }
    private static int readOomScoreAdjFromProcfs(java.lang.String p0) { return 0; }
    public static com.android.internal.os.ProcfsMemoryUtil.VmStat readVmStat() { return null; }

    public static enum DmaBufType {
        PSS,
        RSS,
        RSS_HWM;
        private static final com.android.internal.os.ProcfsMemoryUtil.DmaBufType[] $VALUES = null;
        private DmaBufType() {}
    }

    public static final class MemorySnapshot {
        public int anonRssInKilobytes;
        public int rssHighWaterMarkInKilobytes;
        public int rssInKilobytes;
        public int rssShmemKilobytes;
        public int swapInKilobytes;
        public int uid;
        public MemorySnapshot() {}
    }

    public static final class VmStat {
        public int oomKillCount;
        public VmStat() {}
    }
}
