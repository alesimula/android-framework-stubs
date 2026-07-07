package com.android.internal.os;

public abstract class KernelCpuUidTimeReader<T extends java.lang.Object> {
    protected static final boolean DEBUG = false;
    private static final long DEFAULT_MIN_TIME_BETWEEN_READ = 1000L;
    final com.android.internal.os.KernelCpuUidBpfMapReader mBpfReader = null;
    protected boolean mBpfTimesAvailable;
    private final com.android.internal.os.Clock mClock = null;
    private long mLastReadTimeMs;
    final android.util.SparseArray<T> mLastTimes = null;
    private long mMinTimeBetweenRead;
    final com.android.internal.os.KernelCpuProcStringReader mReader = null;
    final java.lang.String mTag = null;
    final boolean mThrottle = false;
    KernelCpuUidTimeReader(com.android.internal.os.KernelCpuProcStringReader p0, com.android.internal.os.KernelCpuUidBpfMapReader p1, boolean p2, com.android.internal.os.Clock p3) {}
    KernelCpuUidTimeReader(com.android.internal.os.KernelCpuProcStringReader p0, boolean p1, com.android.internal.os.Clock p2) {}
    public void readAbsolute(com.android.internal.os.KernelCpuUidTimeReader.Callback<T> p0) {}
    abstract void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<T> p0);
    public void readDelta(com.android.internal.os.KernelCpuUidTimeReader.Callback<T> p0) {}
    public void readDelta(boolean p0, com.android.internal.os.KernelCpuUidTimeReader.Callback<T> p1) {}
    abstract void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<T> p0, boolean p1);
    public void removeUid(int p0) {}
    public void removeUidsInRange(int p0, int p1) {}
    public void setThrottle(long p0) {}

    public static interface Callback<T extends java.lang.Object> {
        public void onUidCpuTime(int p0, T p1);
    }

    public static class KernelCpuUidActiveTimeReader extends com.android.internal.os.KernelCpuUidTimeReader<java.lang.Long> {
        private long[] mBuffer;
        private int mCores;
        public KernelCpuUidActiveTimeReader(com.android.internal.os.KernelCpuProcStringReader p0, com.android.internal.os.KernelCpuUidBpfMapReader p1, boolean p2) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidActiveTimeReader(boolean p0) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidActiveTimeReader(boolean p0, com.android.internal.os.Clock p1) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        private boolean checkPrecondition(com.android.internal.os.KernelCpuProcStringReader.ProcFileIterator p0) { return false; }
        private boolean checkPrecondition(com.android.internal.os.KernelCpuUidBpfMapReader.BpfMapIterator p0) { return false; }
        private void processUidAbsolute(com.android.internal.os.KernelCpuUidTimeReader.Callback<java.lang.Long> p0) {}
        private void processUidDelta(com.android.internal.os.KernelCpuUidTimeReader.Callback<java.lang.Long> p0) {}
        private static long sumActiveTime(long[] p0, double p1) { return 0L; }
        void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<java.lang.Long> p0) {}
        void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<java.lang.Long> p0, boolean p1) {}
    }

    public static class KernelCpuUidClusterTimeReader extends com.android.internal.os.KernelCpuUidTimeReader<long[]> {
        private long[] mBuffer;
        private int[] mCoresOnClusters;
        private long[] mCurTime;
        private long[] mDeltaTime;
        private int mNumClusters;
        private int mNumCores;
        public KernelCpuUidClusterTimeReader(com.android.internal.os.KernelCpuProcStringReader p0, com.android.internal.os.KernelCpuUidBpfMapReader p1, boolean p2) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidClusterTimeReader(boolean p0) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidClusterTimeReader(boolean p0, com.android.internal.os.Clock p1) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        private boolean checkPrecondition(com.android.internal.os.KernelCpuProcStringReader.ProcFileIterator p0) { return false; }
        private boolean checkPrecondition(com.android.internal.os.KernelCpuUidBpfMapReader.BpfMapIterator p0) { return false; }
        private void sumClusterTime() {}
        void processUidDelta(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
        void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
        void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0, boolean p1) {}
    }

    public static class KernelCpuUidFreqTimeReader extends com.android.internal.os.KernelCpuUidTimeReader<long[]> {
        private static final int MAX_ERROR_COUNT = 5;
        private static final java.lang.String UID_TIMES_PROC_FILE = "/proc/uid_time_in_state";
        private boolean mAllUidTimesAvailable;
        private long[] mBuffer;
        private long[] mCpuFreqs;
        private long[] mCurTimes;
        private long[] mDeltaTimes;
        private int mErrors;
        private int mFreqCount;
        private boolean mPerClusterTimesAvailable;
        private final java.nio.file.Path mProcFilePath = null;
        public KernelCpuUidFreqTimeReader(java.lang.String p0, com.android.internal.os.KernelCpuProcStringReader p1, com.android.internal.os.KernelCpuUidBpfMapReader p2, boolean p3) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        private KernelCpuUidFreqTimeReader(java.lang.String p0, com.android.internal.os.KernelCpuProcStringReader p1, com.android.internal.os.KernelCpuUidBpfMapReader p2, boolean p3, com.android.internal.os.Clock p4) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidFreqTimeReader(boolean p0) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidFreqTimeReader(boolean p0, com.android.internal.os.Clock p1) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        private boolean checkPrecondition(com.android.internal.os.KernelCpuProcStringReader.ProcFileIterator p0) { return false; }
        private boolean checkPrecondition(com.android.internal.os.KernelCpuUidBpfMapReader.BpfMapIterator p0) { return false; }
        private void copyToCurTimes() {}
        private android.util.IntArray extractClusterInfoFromProcFileFreqs() { return null; }
        private void processUidDelta(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
        private long[] readFreqs(java.lang.String p0) { return null; }
        private long[] readFreqsThroughBpf() { return null; }
        public boolean allUidTimesAvailable() { return false; }
        public android.util.SparseArray<long[]> getAllUidCpuFreqTimeMs() { return null; }
        public boolean isFastCpuTimesReader() { return false; }
        public void onSystemReady() {}
        public boolean perClusterTimesAvailable() { return false; }
        void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
        void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0, boolean p1) {}
    }

    public static class KernelCpuUidUserSysTimeReader extends com.android.internal.os.KernelCpuUidTimeReader<long[]> {
        private static final java.lang.String REMOVE_UID_PROC_FILE = "/proc/uid_cputime/remove_uid_range";
        private final long[] mBuffer = null;
        private final long[] mUsrSysTime = null;
        public KernelCpuUidUserSysTimeReader(com.android.internal.os.KernelCpuProcStringReader p0, boolean p1, com.android.internal.os.Clock p2) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidUserSysTimeReader(boolean p0) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        public KernelCpuUidUserSysTimeReader(boolean p0, com.android.internal.os.Clock p1) { super((com.android.internal.os.KernelCpuProcStringReader)null, false, (com.android.internal.os.Clock)null); }
        private void removeUidsFromKernelModule(int p0, int p1) {}
        void readAbsoluteImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0) {}
        void readDeltaImpl(com.android.internal.os.KernelCpuUidTimeReader.Callback<long[]> p0, boolean p1) {}
        public void removeUid(int p0) {}
        public void removeUidsInRange(int p0, int p1) {}
    }
}
