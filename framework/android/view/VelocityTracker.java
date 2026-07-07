package android.view;

public final class VelocityTracker {
    private static final int ACTIVE_POINTER_ID = -1;
    private static final java.util.Map<java.lang.String, java.lang.Integer> STRATEGIES = null;
    public static final int VELOCITY_TRACKER_STRATEGY_DEFAULT = -1;
    public static final int VELOCITY_TRACKER_STRATEGY_IMPULSE = 0;
    public static final int VELOCITY_TRACKER_STRATEGY_INT1 = 7;
    public static final int VELOCITY_TRACKER_STRATEGY_INT2 = 8;
    public static final int VELOCITY_TRACKER_STRATEGY_LEGACY = 9;
    public static final int VELOCITY_TRACKER_STRATEGY_LSQ1 = 1;
    public static final int VELOCITY_TRACKER_STRATEGY_LSQ2 = 2;
    public static final int VELOCITY_TRACKER_STRATEGY_LSQ3 = 3;
    public static final int VELOCITY_TRACKER_STRATEGY_WLSQ2_CENTRAL = 5;
    public static final int VELOCITY_TRACKER_STRATEGY_WLSQ2_DELTA = 4;
    public static final int VELOCITY_TRACKER_STRATEGY_WLSQ2_RECENT = 6;
    private static final android.util.Pools.SynchronizedPool<android.view.VelocityTracker> sPool = null;
    private long mPtr;
    private final int mStrategy = 0;
    private VelocityTracker(int p0) {}
    private static native void nativeAddMovement(long p0, android.view.MotionEvent p1);
    private static native void nativeClear(long p0);
    private static native void nativeComputeCurrentVelocity(long p0, int p1, float p2);
    private static native void nativeDispose(long p0);
    private static native float nativeGetVelocity(long p0, int p1, int p2);
    private static native long nativeInitialize(int p0);
    private static native boolean nativeIsAxisSupported(int p0);
    public static android.view.VelocityTracker obtain() { return null; }
    public static android.view.VelocityTracker obtain(int p0) { return null; }
    @java.lang.Deprecated
    public static android.view.VelocityTracker obtain(java.lang.String p0) { return null; }
    private static int toStrategyId(java.lang.String p0) { return 0; }
    public void addMovement(android.view.MotionEvent p0) {}
    public void clear() {}
    public void computeCurrentVelocity(int p0) {}
    public void computeCurrentVelocity(int p0, float p1) {}
    protected void finalize() throws java.lang.Throwable {}
    public float getAxisVelocity(int p0) { return 0.0f; }
    public float getAxisVelocity(int p0, int p1) { return 0.0f; }
    public int getStrategyId() { return 0; }
    public float getXVelocity() { return 0.0f; }
    public float getXVelocity(int p0) { return 0.0f; }
    public float getYVelocity() { return 0.0f; }
    public float getYVelocity(int p0) { return 0.0f; }
    public boolean isAxisSupported(int p0) { return false; }
    public void recycle() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VelocityTrackableMotionEventAxis {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VelocityTrackerStrategy {
    }
}
