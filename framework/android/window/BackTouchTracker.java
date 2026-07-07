package android.window;

public class BackTouchTracker {
    private static final int LINEAR_DISTANCE = Integer.valueOf(0);
    private static final java.lang.String PREDICTIVE_BACK_LINEAR_DISTANCE_PROP = "persist.wm.debug.predictive_back_linear_distance";
    private boolean mGenerateProgressAllowed;
    private float mInitTouchX;
    private float mInitTouchY;
    private boolean mIsInterceptedMotionEvent;
    private float mLatestTouchX;
    private float mLatestTouchY;
    private float mLinearDistance;
    private float mMaxDistance;
    private float mNonLinearFactor;
    private boolean mShouldUpdateStartLocation;
    private float mStartThresholdX;
    private android.window.BackTouchTracker.TouchTrackerState mState;
    private int mSwipeEdge;
    private boolean mTriggerBack;
    public BackTouchTracker() {}
    public android.window.BackMotionEvent createProgressEvent() { return null; }
    public android.window.BackMotionEvent createProgressEvent(float p0) { return null; }
    public android.window.BackMotionEvent createStartEvent() { return null; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public float getLinearDistance() { return 0.0f; }
    public float getMaxDistance() { return 0.0f; }
    public float getNonLinearFactor() { return 0.0f; }
    public float getProgress(float p0) { return 0.0f; }
    public boolean getTriggerBack() { return false; }
    public boolean isActive() { return false; }
    public boolean isFinished() { return false; }
    public boolean isGenerateProgressAllowed() { return false; }
    public boolean isInInitialState() { return false; }
    public boolean isInterceptedMotionEvent() { return false; }
    public void reset() {}
    public void setGenerateProgressAllowed(boolean p0) {}
    public void setGestureStartLocation(float p0, float p1, int p2) {}
    public void setMotionEventIntercepted() {}
    public void setProgressThresholds(float p0, float p1, float p2) {}
    public void setShouldUpdateStartLocation(boolean p0) {}
    public void setState(android.window.BackTouchTracker.TouchTrackerState p0) {}
    public void setTriggerBack(boolean p0) {}
    public boolean shouldUpdateStartLocation() { return false; }
    public void update(float p0, float p1) {}
    public void updateStartLocation() {}
    public void updateSwipeEdge(int p0) {}

    public static enum TouchTrackerState {
        ACTIVE,
        FINISHED,
        INITIAL;
        private static final android.window.BackTouchTracker.TouchTrackerState[] $VALUES = null;
        private TouchTrackerState() {}
    }
}
