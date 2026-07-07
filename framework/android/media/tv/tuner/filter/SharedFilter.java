package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public final class SharedFilter implements java.lang.AutoCloseable {
    public static final int STATUS_INACCESSIBLE = 128;
    private static final java.lang.String TAG = "SharedFilter";
    private android.media.tv.tuner.filter.SharedFilterCallback mCallback;
    private java.lang.Object mCallbackLock;
    private java.util.concurrent.Executor mExecutor;
    private boolean mIsAccessible;
    private boolean mIsClosed;
    private java.lang.Object mLock;
    private long mNativeContext;
    private SharedFilter() {}
    private native int nativeFlushSharedFilter();
    private native int nativeSharedClose();
    private native int nativeSharedRead(byte[] p0, long p1, long p2);
    private native int nativeStartSharedFilter();
    private native int nativeStopSharedFilter();
    private void onFilterEvent(android.media.tv.tuner.filter.FilterEvent[] p0) {}
    private void onFilterStatus(int p0) {}
    public void close() {}
    public int flush() { return 0; }
    public android.media.tv.tuner.filter.SharedFilterCallback getCallback() { return null; }
    public int read(byte[] p0, long p1, long p2) { return 0; }
    public void setCallback(android.media.tv.tuner.filter.SharedFilterCallback p0, java.util.concurrent.Executor p1) {}
    public int start() { return 0; }
    public int stop() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
