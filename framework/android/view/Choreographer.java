package android.view;

public final class Choreographer {
    public static final int CALLBACK_ANIMATION = 1;
    public static final int CALLBACK_COMMIT = 4;
    public static final int CALLBACK_INPUT = 0;
    public static final int CALLBACK_INSETS_ANIMATION = 2;
    private static final int CALLBACK_LAST = 4;
    private static final java.lang.String[] CALLBACK_TRACE_TITLES = null;
    public static final int CALLBACK_TRAVERSAL = 3;
    private static final boolean DEBUG_FRAMES = false;
    private static final boolean DEBUG_JANK = false;
    private static final long DEFAULT_FRAME_DELAY = Long.valueOf(0L);
    private static final java.lang.Object FRAME_CALLBACK_TOKEN = null;
    private static final int MSG_DO_FRAME = 0;
    private static final int MSG_DO_SCHEDULE_CALLBACK = 2;
    private static final int MSG_DO_SCHEDULE_VSYNC = 1;
    private static final int SKIPPED_FRAME_WARNING_LIMIT = Integer.valueOf(0);
    private static final java.lang.String TAG = "Choreographer";
    private static final boolean USE_BUFFER_STUFFING_RECOVERY = Boolean.valueOf(false);
    private static final boolean USE_FRAME_TIME = Boolean.valueOf(false);
    private static final boolean USE_VSYNC = Boolean.valueOf(false);
    private static final java.lang.Object VSYNC_CALLBACK_TOKEN = null;
    private static volatile long sFrameDelay;
    private static volatile android.view.Choreographer sMainInstance;
    private static final java.lang.ThreadLocal<android.view.Choreographer> sSfThreadInstance = null;
    private static final java.lang.ThreadLocal<android.view.Choreographer> sThreadInstance = null;
    private final android.view.animation.AnimationUtils.AnimationTime mAnimationTime = null;
    private final android.view.Choreographer.BufferStuffingState mBufferStuffingState = null;
    private android.view.Choreographer.CallbackRecord mCallbackPool;
    private final android.view.Choreographer.CallbackQueue[] mCallbackQueues = null;
    private boolean mCallbacksRunning;
    private final android.view.Choreographer.FrameDisplayEventReceiver mDisplayEventReceiver = null;
    private int mFPSDivisor;
    private final android.view.Choreographer.FrameData mFrameData = null;
    android.graphics.FrameInfo mFrameInfo;
    @java.lang.Deprecated
    private long mFrameIntervalNanos;
    private boolean mFrameScheduled;
    private final android.view.Choreographer.FrameHandler mHandler = null;
    private volatile boolean mInDoFrameCallback;
    private long mLastFrameIntervalNanos;
    private long mLastFrameTimeNanos;
    private long mLastNoOffsetFrameTimeNanos;
    private final android.view.DisplayEventReceiver.VsyncEventData mLastVsyncEventData = null;
    private final java.lang.Object mLock = null;
    private final android.os.Looper mLooper = null;
    private Choreographer(android.os.Looper p0) {}
    private Choreographer(android.os.Looper p0, long p1) {}
    private void dispose() {}
    private static long getDefaultFrameDelay() { return 0L; }
    private static long getDefaultFrameDelay$ravenwood() { return 0L; }
    public static long getFrameDelay() { return 0L; }
    public static android.view.Choreographer getInstance() { return null; }
    static android.view.Choreographer getInstanceForSurfaceControl(long p0, android.os.Looper p1) { return null; }
    public static android.view.Choreographer getMainThreadInstance() { return null; }
    private static float getRefreshRate() { return 0.0f; }
    private static float getRefreshRate$ravenwood() { return 0.0f; }
    @java.lang.Deprecated
    public static android.view.Choreographer getSfInstance() { return null; }
    private static boolean getUseVsync() { return false; }
    private static boolean getUseVsync$ravenwood() { return false; }
    private boolean hasPendingInput() { return false; }
    private static boolean isNoMoreResyncFlagEnabled() { return false; }
    private boolean isRunningOnLooperThreadLocked() { return false; }
    private android.view.Choreographer.CallbackRecord obtainCallbackLocked(long p0, java.lang.Object p1, java.lang.Object p2) { return null; }
    private void postCallbackDelayedInternal(int p0, java.lang.Object p1, java.lang.Object p2, long p3) {}
    private void recycleCallbackLocked(android.view.Choreographer.CallbackRecord p0) {}
    public static void releaseInstance() {}
    private void removeCallbacksInternal(int p0, java.lang.Object p1, java.lang.Object p2) {}
    private void scheduleFrameLocked(long p0) {}
    private void scheduleVsyncLocked() {}
    public static void setFrameDelay(long p0) {}
    public static long subtractFrameDelay(long p0) { return 0L; }
    private void traceMessage(java.lang.String p0) {}
    void doCallbacks(int p0) {}
    void doFrame(long p0, int p1, android.view.DisplayEventReceiver.VsyncEventData p2) {}
    void doFrameNoAnimationResync(long p0, android.view.DisplayEventReceiver.VsyncEventData p1) {}
    void doScheduleCallback(int p0) {}
    void doScheduleVsync() {}
    void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public long getExpectedPresentationTimeMillis() { return 0L; }
    public long getExpectedPresentationTimeNanos() { return 0L; }
    public long getFrameDeadline() { return 0L; }
    public long getFrameIntervalNanos() { return 0L; }
    public long getFrameTime() { return 0L; }
    public long getFrameTimeNanos() { return 0L; }
    public long getLastFrameTimeNanos() { return 0L; }
    public long getLatestExpectedPresentTimeNanos() { return 0L; }
    public android.os.Looper getLooper() { return null; }
    public long getVsyncId() { return 0L; }
    void invalidate() {}
    boolean isTheLooperSame(android.os.Looper p0) { return false; }
    public void onWaitForBufferRelease(long p0) {}
    public void postCallback(int p0, java.lang.Runnable p1, java.lang.Object p2) {}
    public void postCallbackDelayed(int p0, java.lang.Runnable p1, java.lang.Object p2, long p3) {}
    public void postFrameCallback(android.view.Choreographer.FrameCallback p0) {}
    public void postFrameCallbackDelayed(android.view.Choreographer.FrameCallback p0, long p1) {}
    public void postVsyncCallback(int p0, android.view.Choreographer.VsyncCallback p1) {}
    public void postVsyncCallback(android.view.Choreographer.VsyncCallback p0) {}
    public void removeCallbacks(int p0, java.lang.Runnable p1, java.lang.Object p2) {}
    public void removeFrameCallback(android.view.Choreographer.FrameCallback p0) {}
    public void removeVsyncCallback(int p0, android.view.Choreographer.VsyncCallback p1) {}
    public void removeVsyncCallback(android.view.Choreographer.VsyncCallback p0) {}
    void setFPSDivisor(int p0) {}
    android.view.Choreographer.BufferStuffingState.RecoveryAction updateBufferStuffingState(long p0, android.view.DisplayEventReceiver.VsyncEventData p1) { return null; }

    private static class BufferStuffingState {
        private static final long MAX_BUFFER_STUFFING_DELAY_NS = 100000000L;
        public long accumulatedDelayNanos;
        public boolean isRecovering;
        public java.util.concurrent.atomic.AtomicBoolean isStuffed;
        public int numberWaitsForNextVsync;
        private BufferStuffingState() {}
        public boolean maxDelayReached() { return false; }
        public void reset() {}

        static enum RecoveryAction {
            DELAY_FRAME,
            NONE,
            OFFSET;
            private static final android.view.Choreographer.BufferStuffingState.RecoveryAction[] $VALUES = null;
            private RecoveryAction() {}
        }
    }

    private final class CallbackQueue {
        private android.view.Choreographer.CallbackRecord mHead;
        private CallbackQueue(android.view.Choreographer p0) {}
        public void addCallbackLocked(long p0, java.lang.Object p1, java.lang.Object p2) {}
        public android.view.Choreographer.CallbackRecord extractDueCallbacksLocked(long p0) { return null; }
        public boolean hasDueCallbacksLocked(long p0) { return false; }
        public void removeCallbacksLocked(java.lang.Object p0, java.lang.Object p1) {}
    }

    private static final class CallbackRecord {
        public java.lang.Object action;
        public long dueTime;
        public android.view.Choreographer.CallbackRecord next;
        public java.lang.Object token;
        private CallbackRecord() {}
        public void run(long p0) {}
        void run(android.view.Choreographer.FrameData p0) {}
    }

    public static interface FrameCallback {
        public void doFrame(long p0);
    }

    public static class FrameData {
        private long mFrameTimeNanos;
        private long mFrameTimeNanosForInput;
        private android.view.Choreographer.FrameTimeline[] mFrameTimelines;
        private boolean mInCallback;
        private int mPreferredFrameTimelineIndex;
        FrameData() {}
        public FrameData(long p0) {}
        private void allocateFrameTimelines(int p0) {}
        private void checkInCallback() {}
        public long getFrameTimeNanos() { return 0L; }
        public long getFrameTimeNanosForInput() { return 0L; }
        public android.view.Choreographer.FrameTimeline[] getFrameTimelines() { return null; }
        public android.view.Choreographer.FrameTimeline getPreferredFrameTimeline() { return null; }
        android.view.Choreographer.FrameTimeline resync(android.view.DisplayEventReceiver p0, long p1) { return null; }
        void setInCallback(boolean p0) {}
        android.view.Choreographer.FrameTimeline update(long p0, android.view.DisplayEventReceiver.VsyncEventData p1) { return null; }
        android.view.Choreographer.FrameTimeline update(long p0, android.view.DisplayEventReceiver p1, long p2) { return null; }
        void update(long p0, int p1) {}
    }

    private final class FrameDisplayEventReceiver extends android.view.DisplayEventReceiver implements java.lang.Runnable {
        private int mFrame;
        private boolean mHavePendingVsync;
        private final android.view.DisplayEventReceiver.VsyncEventData mLastVsyncEventData = null;
        private long mTimestampNanos;
        FrameDisplayEventReceiver(android.view.Choreographer p0, android.os.Looper p1, long p2) { super((android.os.Looper)null); }
        public void onVsync(long p0, long p1, int p2, android.view.DisplayEventReceiver.VsyncEventData p3) {}
        public void run() {}
    }

    private final class FrameHandler extends android.os.Handler {
        public FrameHandler(android.view.Choreographer p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static class FrameTimeline {
        private long mDeadlineNanos;
        private long mExpectedPresentationTimeNanos;
        private boolean mInCallback;
        private long mVsyncId;
        FrameTimeline() {}
        private void checkInCallback() {}
        public long getDeadlineNanos() { return 0L; }
        public long getExpectedPresentationTimeNanos() { return 0L; }
        public long getVsyncId() { return 0L; }
        void setInCallback(boolean p0) {}
        void update(long p0, long p1, long p2) {}
    }

    public static interface VsyncCallback {
        public void onVsync(android.view.Choreographer.FrameData p0);
    }
}
