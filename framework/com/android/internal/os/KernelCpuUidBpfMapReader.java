package com.android.internal.os;

public abstract class KernelCpuUidBpfMapReader {
    private static final com.android.internal.os.KernelCpuUidBpfMapReader ACTIVE_TIME_READER = null;
    private static final com.android.internal.os.KernelCpuUidBpfMapReader CLUSTER_TIME_READER = null;
    private static final int ERROR_THRESHOLD = 5;
    private static final com.android.internal.os.KernelCpuUidBpfMapReader FREQ_TIME_READER = null;
    private static final long FRESHNESS_MS = 500L;
    protected android.util.SparseArray<long[]> mData;
    private int mErrors;
    private long mLastReadTime;
    protected final java.util.concurrent.locks.ReentrantReadWriteLock mLock = null;
    protected final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock mReadLock = null;
    final java.lang.String mTag = null;
    protected final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock mWriteLock = null;
    public KernelCpuUidBpfMapReader() {}
    private boolean dataValid() { return false; }
    static com.android.internal.os.KernelCpuUidBpfMapReader getActiveTimeReaderInstance() { return null; }
    static com.android.internal.os.KernelCpuUidBpfMapReader getClusterTimeReaderInstance() { return null; }
    static com.android.internal.os.KernelCpuUidBpfMapReader getFreqTimeReaderInstance() { return null; }
    public abstract long[] getDataDimensions();
    public com.android.internal.os.KernelCpuUidBpfMapReader.BpfMapIterator open() { return null; }
    public com.android.internal.os.KernelCpuUidBpfMapReader.BpfMapIterator open(boolean p0) { return null; }
    protected abstract boolean readBpfData();
    public void removeUidsInRange(int p0, int p1) {}
    public boolean startTrackingBpfTimes() { return false; }

    public class BpfMapIterator implements java.lang.AutoCloseable {
        private int mPos;
        public BpfMapIterator(com.android.internal.os.KernelCpuUidBpfMapReader p0) {}
        public void close() {}
        public boolean getNextUid(long[] p0) { return false; }
    }

    public static class KernelCpuUidActiveTimeBpfMapReader extends com.android.internal.os.KernelCpuUidBpfMapReader {
        public KernelCpuUidActiveTimeBpfMapReader() { super(); }
        public final native long[] getDataDimensions();
        protected final native boolean readBpfData();
    }

    public static class KernelCpuUidClusterTimeBpfMapReader extends com.android.internal.os.KernelCpuUidBpfMapReader {
        public KernelCpuUidClusterTimeBpfMapReader() { super(); }
        public final native long[] getDataDimensions();
        protected final native boolean readBpfData();
    }

    public static class KernelCpuUidFreqTimeBpfMapReader extends com.android.internal.os.KernelCpuUidBpfMapReader {
        public KernelCpuUidFreqTimeBpfMapReader() { super(); }
        private final native boolean removeUidRange(int p0, int p1);
        public final long[] getDataDimensions() { return null; }
        protected final native boolean readBpfData();
        public void removeUidsInRange(int p0, int p1) {}
    }
}
