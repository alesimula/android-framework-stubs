package android.animation;

public class AnimationLeakDetector {
    private static final java.lang.String DEBUG_LEAKS_CALLSTACKS_KEY = "persist.debug.animation_leaks.callstacks";
    private static final java.lang.String DEBUG_LEAKS_FORCE_ENABLE_KEY = "persist.debug.animation_leaks.force_enable";
    private static final java.lang.String DEBUG_LEAKS_THRESHOLD_MS_KEY = "persist.debug.animation_leaks.threshold_ms";
    private static final long LEAK_THRESHOLD_MS = 3600000L;
    private static final long NO_FRAME_TIME = -9223372036854775808L;
    private static final java.lang.String TAG = "AnimationLeakDetector";
    private static volatile boolean sCallstacksResolved;
    private static volatile boolean sEnableLeaksCallstacks;
    private final java.util.function.LongSupplier mClock = null;
    private long mLatestFrameTime;
    private long mPreviousFrameTime;
    private final long mThresholdMs = 0L;
    private final android.util.ArrayMap<android.animation.AnimationHandler.AnimationFrameCallback, android.animation.AnimationLeakDetector.LeakState> mTracked = null;
    AnimationLeakDetector() {}
    public AnimationLeakDetector(java.util.function.LongSupplier p0) {}
    private android.animation.AnimationLeakDetector.LeakState getOrCreateState(android.animation.AnimationHandler.AnimationFrameCallback p0) { return null; }
    private static java.lang.String getTraceEventName(android.animation.AnimationHandler.AnimationFrameCallback p0) { return null; }
    private static boolean isCallstackCaptureEnabled() { return false; }
    static boolean isEnabled() { return false; }
    private void reportLeakOnce(android.animation.AnimationHandler.AnimationFrameCallback p0, android.animation.AnimationLeakDetector.LeakState p1, long p2) {}
    void captureStartStackIfNeeded(android.animation.AnimationHandler.AnimationFrameCallback p0) {}
    public void detectLeaks(android.animation.AnimationHandler.AnimationFrameCallback p0, long p1) {}
    public void removeCallback(android.animation.AnimationHandler.AnimationFrameCallback p0) {}

    private static final class LeakState {
        long lastFrameTime;
        boolean reported;
        java.lang.StackTraceElement[] startStack;
        long startTimeMs;
        LeakState(long p0) {}
    }
}
