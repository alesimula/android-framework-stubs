package android.companion.virtual.computercontrol;

final class ComputerControlAccessibilityProxy extends android.view.accessibility.AccessibilityDisplayProxy implements java.lang.AutoCloseable {
    private boolean mClosed;
    private final android.os.Handler mHandler = null;
    private boolean mIsFirstFrameReceived;
    private android.companion.virtual.computercontrol.ComputerControlAccessibilityProxy.StabilitySignalTracker mStabilitySignalTracker;
    ComputerControlAccessibilityProxy(int p0, android.os.Handler p1) { super(0, null, null); }
    private static java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getAccessibilityServiceInfos() { return null; }
    void clearStabilityListener() {}
    public void close() {}
    android.companion.virtual.computercontrol.ComputerControlAccessibilityProxy.UnstablePeriod newUnstablePeriod(int p0) { return null; }
    public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    void onImageAvailable() {}
    void resetStabilityState(int p0) {}
    void setStabilityListener(long p0, java.util.concurrent.Executor p1, android.companion.virtual.computercontrol.ComputerControlSession.StabilityListener p2) {}

    private static final class EventIdleTracker {
        private final java.lang.Runnable mCallbackExecutor = null;
        private final long mEventIdleTimeoutMs = 0L;
        private final android.os.Handler mHandler = null;
        private android.companion.virtual.computercontrol.ComputerControlAccessibilityProxy.EventIdleTracker.Callback mPendingCallback;
        EventIdleTracker(android.os.Handler p0, long p1) {}
        boolean hasPendingCallback() { return false; }
        void onEvent() {}
        void registerOneShotIdleCallback(android.companion.virtual.computercontrol.ComputerControlAccessibilityProxy.EventIdleTracker.Callback p0) {}
        void reset() {}

        static interface Callback {
            public void onEventIdle();
        }
    }

    private static final class StabilitySignalTracker implements java.lang.AutoCloseable, android.companion.virtual.computercontrol.ComputerControlAccessibilityProxy.EventIdleTracker.Callback {
        private int mActiveUnstablePeriods;
        private final android.companion.virtual.computercontrol.ComputerControlAccessibilityProxy.EventIdleTracker mEventIdleTracker = null;
        private final android.os.Handler mHandler = null;
        private boolean mIsFirstFrameReceived;
        final android.companion.virtual.computercontrol.ComputerControlSession.StabilityListener mStabilityListener = null;
        private java.lang.Integer mUnstableReason;
        StabilitySignalTracker(long p0, android.os.Handler p1, android.companion.virtual.computercontrol.ComputerControlSession.StabilityListener p2, boolean p3) {}
        private void checkStability() {}
        public void close() {}
        android.companion.virtual.computercontrol.ComputerControlAccessibilityProxy.UnstablePeriod newUnstablePeriod(int p0) { return null; }
        void onAccessibilityEvent() {}
        public void onEventIdle() {}
        void onFirstFrameReceived() {}
        void resetStabilityState(int p0) {}
    }

    static interface UnstablePeriod extends java.lang.AutoCloseable {
        public void close();
    }
}
