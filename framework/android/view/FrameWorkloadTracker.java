package android.view;

class FrameWorkloadTracker {
    FrameWorkloadTracker(android.view.Choreographer p0, android.os.Looper p1) {}
    public int getWatchdogTid() { return 0; }
    public void setCompletedStage(android.view.FrameWorkloadTracker.Stage p0, long p1, long p2) {}
    public void setFrameData(long p0, long p1, long p2) {}

    public static enum Stage {
        ANIMATION,
        CPU_END,
        GPU_END,
        INPUT,
        START_FRAME,
        TRAVERSAL;
        private static final android.view.FrameWorkloadTracker.Stage[] $VALUES = null;
        private Stage() {}
    }
}
