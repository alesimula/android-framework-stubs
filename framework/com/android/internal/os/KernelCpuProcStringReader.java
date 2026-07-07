package com.android.internal.os;

public final class KernelCpuProcStringReader {
    private static final com.android.internal.os.KernelCpuProcStringReader ACTIVE_TIME_READER = null;
    private static final com.android.internal.os.KernelCpuProcStringReader CLUSTER_TIME_READER = null;
    private static final int ERROR_THRESHOLD = 5;
    private static final com.android.internal.os.KernelCpuProcStringReader FREQ_TIME_READER = null;
    private static final long FRESHNESS = 500L;
    private static final int MAX_BUFFER_SIZE = 1048576;
    private static final java.lang.String PROC_UID_ACTIVE_TIME = "/proc/uid_concurrent_active_time";
    private static final java.lang.String PROC_UID_CLUSTER_TIME = "/proc/uid_concurrent_policy_time";
    private static final java.lang.String PROC_UID_FREQ_TIME = "/proc/uid_time_in_state";
    private static final java.lang.String PROC_UID_USER_SYS_TIME = "/proc/uid_cputime/show_uid_stat";
    private static final java.lang.String TAG = null;
    private static final com.android.internal.os.KernelCpuProcStringReader USER_SYS_TIME_READER = null;
    private char[] mBuf;
    private final com.android.internal.os.Clock mClock = null;
    private int mErrors;
    private final java.nio.file.Path mFile = null;
    private long mLastReadTime;
    private final java.util.concurrent.locks.ReentrantReadWriteLock mLock = null;
    private final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock mReadLock = null;
    private int mSize;
    private final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock mWriteLock = null;
    public KernelCpuProcStringReader(java.lang.String p0) {}
    public KernelCpuProcStringReader(java.lang.String p0, com.android.internal.os.Clock p1) {}
    public static int asLongs(java.nio.CharBuffer p0, long[] p1) { return 0; }
    private boolean dataValid() { return false; }
    static com.android.internal.os.KernelCpuProcStringReader getActiveTimeReaderInstance() { return null; }
    static com.android.internal.os.KernelCpuProcStringReader getClusterTimeReaderInstance() { return null; }
    static com.android.internal.os.KernelCpuProcStringReader getFreqTimeReaderInstance() { return null; }
    static com.android.internal.os.KernelCpuProcStringReader getUserSysTimeReaderInstance() { return null; }
    private static boolean isNumber(char p0) { return false; }
    public com.android.internal.os.KernelCpuProcStringReader.ProcFileIterator open() { return null; }
    public com.android.internal.os.KernelCpuProcStringReader.ProcFileIterator open(boolean p0) { return null; }

    public final class ProcFileIterator implements java.lang.AutoCloseable {
        private int mPos;
        private final int mSize = 0;
        public ProcFileIterator(com.android.internal.os.KernelCpuProcStringReader p0, int p1) {}
        public void close() {}
        public boolean hasNextLine() { return false; }
        public java.nio.CharBuffer nextLine() { return null; }
        public int size() { return 0; }
    }
}
