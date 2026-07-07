package android.view;

public abstract class DisplayEventReceiver {
    public static final int EVENT_REGISTRATION_FRAME_RATE_OVERRIDE_FLAG = 2;
    public static final int EVENT_REGISTRATION_MODE_CHANGED_FLAG = 1;
    public static final int EVENT_REGISTRATION_MODE_REJECTED_FLAG = 4;
    private static final java.lang.String TAG = "DisplayEventReceiver";
    private java.lang.Runnable mFreeNativeResources;
    private android.os.MessageQueue mMessageQueue;
    private long mReceiverPtr;
    private final android.view.DisplayEventReceiver.VsyncEventData mVsyncEventData = null;
    public DisplayEventReceiver(android.os.Looper p0) {}
    public DisplayEventReceiver(android.os.Looper p0, int p1) {}
    public DisplayEventReceiver(android.os.Looper p0, int p1, long p2) {}
    private void dispatchHdcpLevelsChanged(long p0, int p1, int p2) {}
    private void dispatchHotplug(long p0, long p1, boolean p2) {}
    private void dispatchHotplugConnectionError(long p0, int p1) {}
    private void dispatchModeChangedWithFrameRateOverrides(long p0, long p1, int p2, long p3, long p4, long p5, android.view.DisplayEventReceiver.FrameRateOverride[] p6, float[] p7) {}
    private void dispatchModeRejected(long p0, int p1) {}
    private void dispatchVsync(long p0, long p1, int p2) {}
    private static native long nativeGetDisplayEventReceiverFinalizer();
    private static native android.view.DisplayEventReceiver.VsyncEventData nativeGetLatestVsyncEventData(long p0);
    private static native long nativeInit(java.lang.ref.WeakReference<android.view.DisplayEventReceiver> p0, java.lang.ref.WeakReference<android.view.DisplayEventReceiver.VsyncEventData> p1, android.os.MessageQueue p2, int p3, long p4);
    private static native void nativeScheduleVsync(long p0);
    public void dispose() {}
    android.view.DisplayEventReceiver.VsyncEventData getLatestVsyncEventData() { return null; }
    public void onHdcpLevelsChanged(long p0, int p1, int p2) {}
    public void onHotplug(long p0, long p1, boolean p2) {}
    public void onHotplugConnectionError(long p0, int p1) {}
    public void onModeAndFrameRateOverridesChanged(long p0, long p1, int p2, long p3, long p4, long p5, android.view.DisplayEventReceiver.FrameRateOverride[] p6, float[] p7) {}
    public void onModeRejected(long p0, int p1) {}
    public void onVsync(long p0, long p1, int p2, android.view.DisplayEventReceiver.VsyncEventData p3) {}
    public void scheduleVsync() {}

    public static class FrameRateOverride {
        public final float frameRateHz = 0.0f;
        public final int uid = 0;
        public FrameRateOverride(int p0, float p1) {}
        public java.lang.String toString() { return null; }
    }

    public static final class VsyncEventData {
        static final int FRAME_TIMELINES_CAPACITY = 7;
        public long frameInterval;
        public final android.view.DisplayEventReceiver.VsyncEventData.FrameTimeline[] frameTimelines = null;
        public int frameTimelinesLength;
        public int numberQueuedBuffers;
        public int preferredFrameTimelineIndex;
        VsyncEventData() {}
        VsyncEventData(android.view.DisplayEventReceiver.VsyncEventData.FrameTimeline[] p0, int p1, int p2, long p3, int p4) {}
        void copyFrom(android.view.DisplayEventReceiver.VsyncEventData p0) {}
        public android.view.DisplayEventReceiver.VsyncEventData.FrameTimeline preferredFrameTimeline() { return null; }

        public static class FrameTimeline {
            public long deadline;
            public long expectedPresentationTime;
            public long vsyncId;
            FrameTimeline() {}
            FrameTimeline(long p0, long p1, long p2) {}
            void copyFrom(android.view.DisplayEventReceiver.VsyncEventData.FrameTimeline p0) {}
        }
    }
}
