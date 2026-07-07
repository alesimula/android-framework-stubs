package android.accessibilityservice;

public final class TouchInteractionController {
    private static final int MAX_POINTER_COUNT = 32;
    public static final int STATE_CLEAR = 0;
    public static final int STATE_DELEGATING = 4;
    public static final int STATE_DRAGGING = 3;
    public static final int STATE_TOUCH_EXPLORING = 2;
    public static final int STATE_TOUCH_INTERACTING = 1;
    private android.util.ArrayMap<android.accessibilityservice.TouchInteractionController.Callback, java.util.concurrent.Executor> mCallbacks;
    private final int mDisplayId = 0;
    private final java.lang.Object mLock = null;
    private java.util.Queue<android.view.MotionEvent> mQueuedMotionEvents;
    private final android.accessibilityservice.AccessibilityService mService = null;
    private boolean mServiceDetectsGestures;
    private int mState;
    private boolean mStateChangeRequested;
    TouchInteractionController(android.accessibilityservice.AccessibilityService p0, java.lang.Object p1, int p2) {}
    private void sendEventToAllListeners(android.view.MotionEvent p0) {}
    private void setServiceDetectsGestures(boolean p0) {}
    public static java.lang.String stateToString(int p0) { return null; }
    private void validateTransitionRequest() {}
    public int getDisplayId() { return 0; }
    public int getMaxPointerCount() { return 0; }
    public int getState() { return 0; }
    void onMotionEvent(android.view.MotionEvent p0) {}
    void onStateChanged(int p0) {}
    public void performClick() {}
    public void performLongClickAndStartDrag() {}
    public void registerCallback(java.util.concurrent.Executor p0, android.accessibilityservice.TouchInteractionController.Callback p1) {}
    public void requestDelegating() {}
    public void requestDragging(int p0) {}
    public void requestTouchExploration() {}
    public void unregisterAllCallbacks() {}
    public boolean unregisterCallback(android.accessibilityservice.TouchInteractionController.Callback p0) { return false; }

    public static interface Callback {
        public void onMotionEvent(android.view.MotionEvent p0);
        public void onStateChanged(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface State {
    }
}
