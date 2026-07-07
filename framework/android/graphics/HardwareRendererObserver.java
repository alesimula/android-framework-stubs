package android.graphics;

public final class HardwareRendererObserver {
    private final long[] mFrameMetrics = null;
    private final android.os.Handler mHandler = null;
    private final android.graphics.HardwareRendererObserver.OnFrameMetricsAvailableListener mListener = null;
    private com.android.internal.util.VirtualRefBasePtr mNativePtr;
    public HardwareRendererObserver(android.graphics.HardwareRendererObserver.OnFrameMetricsAvailableListener p0, long[] p1, android.os.Handler p2, boolean p3) {}
    static boolean invokeDataAvailable(java.lang.ref.WeakReference<android.graphics.HardwareRendererObserver> p0) { return false; }
    private static native long nCreateObserver(java.lang.ref.WeakReference<android.graphics.HardwareRendererObserver> p0, boolean p1);
    private static native int nGetNextBuffer(long p0, long[] p1);
    private void notifyDataAvailable() {}
    long getNativeInstance() { return 0L; }

    public static interface OnFrameMetricsAvailableListener {
        public void onFrameMetricsAvailable(int p0);
    }
}
