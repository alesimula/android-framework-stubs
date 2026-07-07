package android.hardware.camera2.utils;

public class CloseableLock implements java.lang.AutoCloseable {
    private static final boolean VERBOSE = false;
    private final java.lang.String TAG = null;
    private volatile boolean mClosed;
    private final java.util.concurrent.locks.Condition mCondition = null;
    private boolean mExclusive;
    private final java.util.concurrent.locks.ReentrantLock mLock = null;
    private final java.lang.ThreadLocal<java.lang.Integer> mLockCount = null;
    private final java.lang.String mName = null;
    private int mSharedLocks;
    public CloseableLock() {}
    public CloseableLock(java.lang.String p0) {}
    private void log(java.lang.String p0) {}
    public android.hardware.camera2.utils.CloseableLock.ScopedLock acquireExclusiveLock() { return null; }
    public android.hardware.camera2.utils.CloseableLock.ScopedLock acquireLock() { return null; }
    public void close() {}
    public void releaseLock() {}

    public class ScopedLock implements java.lang.AutoCloseable {
        private ScopedLock(android.hardware.camera2.utils.CloseableLock p0) {}
        public void close() {}
    }
}
