package com.android.internal.jank;

public class FrameTracker implements android.view.SurfaceControl.OnJankDataListener {
    private static final int FLUSH_DELAY_MILLISECOND = 60;
    private static final long INVALID_ID = -1L;
    private static final double LOG2 = Double.valueOf(0.0);
    private static final int MAX_FLUSH_ATTEMPTS = 3;
    private static final int MAX_LENGTH_EVENT_DESC = 127;
    private static final int NANOS_IN_MILLISECOND = 1000000;
    private static final double NANOS_IN_SECOND = 1000000000.0;
    static final int REASON_CANCEL_NORMAL = 16;
    static final int REASON_CANCEL_NOT_BEGUN = 17;
    static final int REASON_CANCEL_SAME_VSYNC = 18;
    static final int REASON_CANCEL_TIMEOUT = 19;
    static final int REASON_END_NORMAL = 0;
    static final int REASON_END_SURFACE_DESTROYED = 1;
    static final int REASON_END_UNKNOWN = -1;
    private static final java.lang.String TAG = "FrameTracker";
    private static boolean sCopySurfaceControlEnabled;
    private long mBeginVsyncId;
    private boolean mCancelled;
    private final com.android.internal.jank.FrameTracker.ChoreographerWrapper mChoreographer = null;
    private final com.android.internal.jank.InteractionJankMonitor.Configuration mConfig = null;
    private final boolean mDeferMonitoring = false;
    private final int mDisplayId = 0;
    private long mEndVsyncId;
    private final android.os.Handler mHandler = null;
    private boolean mIsSurfaceControlCopied;
    private android.view.SurfaceControl.OnJankDataListenerRegistration mJankDataListenerRegistration;
    private final android.util.SparseArray<com.android.internal.jank.FrameTracker.JankInfo> mJankInfos = null;
    private final com.android.internal.jank.FrameTracker.FrameTrackerListener mListener = null;
    private boolean mMetricsFinalized;
    private final com.android.internal.jank.FrameTracker.StatsLogWrapper mStatsLog = null;
    private final android.view.ViewRootImpl.SurfaceChangedCallback mSurfaceChangedCallback = null;
    private android.view.SurfaceControl mSurfaceControl;
    private final com.android.internal.jank.FrameTracker.SurfaceControlWrapper mSurfaceControlWrapper = null;
    public final boolean mSurfaceOnly = false;
    private final int mTraceThresholdFrameTimeMillis = 0;
    private final int mTraceThresholdMissedFrames = 0;
    private boolean mTracingStarted;
    private final com.android.internal.jank.FrameTracker.ViewRootWrapper mViewRoot = null;
    private java.lang.Runnable mWaitForFinishTimedOut;
    public FrameTracker(com.android.internal.jank.InteractionJankMonitor.Configuration p0, com.android.internal.jank.FrameTracker.ViewRootWrapper p1, com.android.internal.jank.FrameTracker.SurfaceControlWrapper p2, com.android.internal.jank.FrameTracker.ChoreographerWrapper p3, com.android.internal.jank.FrameTracker.StatsLogWrapper p4, int p5, int p6, com.android.internal.jank.FrameTracker.FrameTrackerListener p7) {}
    private void beginInternal() {}
    private com.android.internal.jank.FrameTracker.JankInfo findJankInfo(long p0) { return null; }
    private void finish() {}
    private void finishTraced() {}
    private boolean hasReceivedCallbacksAfterEnd() { return false; }
    private boolean isInRange(long p0) { return false; }
    private void markCujUiThread() {}
    private void markEvent(java.lang.String p0, long p1) {}
    private void notifyCujEvent(java.lang.String p0, int p1) {}
    private void processJankInfos() {}
    public static void setCopySurfaceControlEnabled(boolean p0) {}
    private boolean shouldTriggerPerfetto(int p0, int p1) { return false; }
    public void begin() {}
    public boolean cancel(int p0) { return false; }
    public boolean end(int p0) { return false; }
    public void onJankDataAvailable(java.util.List<android.view.SurfaceControl.JankData> p0) {}
    public void postCallback(java.lang.Runnable p0) {}
    public void postTraceStartMarker(java.lang.Runnable p0) {}
    public void removeObservers() {}

    public static class ChoreographerWrapper {
        private final android.view.Choreographer mChoreographer = null;
        public ChoreographerWrapper(android.view.Choreographer p0) {}
        public long getVsyncId() { return 0L; }
    }

    public static interface FrameTrackerListener {
        public void onCujEvents(com.android.internal.jank.FrameTracker p0, java.lang.String p1, int p2);
        public void triggerPerfetto(com.android.internal.jank.InteractionJankMonitor.Configuration p0);
    }

    private static class JankInfo {
        long actualPresentDelta;
        long frameInterval;
        final long frameVsyncId = 0L;
        double jankScore;
        int jankTypeExperimental;
        int jankTypeLegacy;
        long presentDelay;
        int refreshRate;
        long totalDurationNanos;
        JankInfo(android.view.SurfaceControl.JankData p0) {}
        private static void appendJankType(java.lang.StringBuilder p0, int p1) {}
        public java.lang.String toString() { return null; }
        com.android.internal.jank.FrameTracker.JankInfo update(android.view.SurfaceControl.JankData p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Reasons {
    }

    public static class StatsLogWrapper {
        private final com.android.internal.jank.DisplayResolutionTracker mDisplayResolutionTracker = null;
        public StatsLogWrapper(com.android.internal.jank.DisplayResolutionTracker p0) {}
        public void write(int p0, int p1, int p2, int p3, long p4, long p5, long p6, long p7, long p8, long p9, long p10, float p11, float p12, float p13) {}
    }

    public static class SurfaceControlWrapper {
        public SurfaceControlWrapper() {}
        public android.view.SurfaceControl.OnJankDataListenerRegistration addJankStatsListener(android.view.SurfaceControl.OnJankDataListener p0, android.view.SurfaceControl p1) { return null; }
    }

    public static class ViewRootWrapper {
        private final android.view.ViewRootImpl mViewRoot = null;
        public ViewRootWrapper(android.view.ViewRootImpl p0) {}
        public void addSurfaceChangedCallback(android.view.ViewRootImpl.SurfaceChangedCallback p0) {}
        void addWindowCallbacks(android.view.WindowCallbacks p0) {}
        int dipToPx(int p0) { return 0; }
        public android.view.SurfaceControl getSurfaceControl() { return null; }
        android.view.View getView() { return null; }
        public void removeSurfaceChangedCallback(android.view.ViewRootImpl.SurfaceChangedCallback p0) {}
        void removeWindowCallbacks(android.view.WindowCallbacks p0) {}
        void requestInvalidateRootRenderNode() {}
    }
}
