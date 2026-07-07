package android.view;

public class GestureDetector {
    private static final int LONG_PRESS = 2;
    private static final int SHOW_PRESS = 1;
    private static final int TAP = 3;
    private boolean mAlwaysInBiggerTapRegion;
    private boolean mAlwaysInTapRegion;
    private float mAmbiguousGestureMultiplier;
    private android.view.GestureDetector.OnContextClickListener mContextClickListener;
    private android.view.MotionEvent mCurrentDownEvent;
    private android.view.MotionEvent mCurrentMotionEvent;
    private boolean mDeferConfirmSingleTap;
    private android.view.GestureDetector.OnDoubleTapListener mDoubleTapListener;
    private int mDoubleTapMinTime;
    private int mDoubleTapSlopSquare;
    private int mDoubleTapTimeout;
    private int mDoubleTapTouchSlopSquare;
    private float mDownFocusX;
    private float mDownFocusY;
    private final android.os.Handler mHandler = null;
    private boolean mHasRecordedClassification;
    private boolean mIgnoreNextUpEvent;
    private boolean mInContextClick;
    private boolean mInLongPress;
    private final android.view.InputEventConsistencyVerifier mInputEventConsistencyVerifier = null;
    private boolean mIsDoubleTapping;
    private boolean mIsLongpressEnabled;
    private float mLastFocusX;
    private float mLastFocusY;
    private final android.view.GestureDetector.OnGestureListener mListener = null;
    private int mMaximumFlingVelocity;
    private int mMinimumFlingVelocity;
    private android.view.MotionEvent mPreviousUpEvent;
    private boolean mStillDown;
    private int mTapTimeout;
    private int mTouchSlopSquare;
    private android.view.VelocityTracker mVelocityTracker;
    private final int mVelocityTrackerStrategy = 0;
    private android.view.ViewConfiguration mViewConfiguration;
    public GestureDetector(android.content.Context p0, android.view.GestureDetector.OnGestureListener p1) {}
    public GestureDetector(android.content.Context p0, android.view.GestureDetector.OnGestureListener p1, android.os.Handler p2) {}
    public GestureDetector(android.content.Context p0, android.view.GestureDetector.OnGestureListener p1, android.os.Handler p2, int p3) {}
    public GestureDetector(android.content.Context p0, android.view.GestureDetector.OnGestureListener p1, android.os.Handler p2, boolean p3) {}
    @java.lang.Deprecated
    public GestureDetector(android.view.GestureDetector.OnGestureListener p0) {}
    @java.lang.Deprecated
    public GestureDetector(android.view.GestureDetector.OnGestureListener p0, android.os.Handler p1) {}
    private void cancel() {}
    private void cancelTaps() {}
    private void dispatchLongPress() {}
    private int getLongPressTimeoutMillis() { return 0; }
    private void init(android.content.Context p0) {}
    private boolean isConsideredDoubleTap(android.view.MotionEvent p0, android.view.MotionEvent p1, android.view.MotionEvent p2) { return false; }
    private void recordGestureClassification(int p0) {}
    private void recordGestureClassification(int p0, float p1) {}
    public boolean isLongpressEnabled() { return false; }
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void setContextClickListener(android.view.GestureDetector.OnContextClickListener p0) {}
    public void setIsLongpressEnabled(boolean p0) {}
    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener p0) {}

    private class GestureHandler extends android.os.Handler {
        GestureHandler(android.view.GestureDetector p0) { super(); }
        GestureHandler(android.view.GestureDetector p0, android.os.Handler p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface OnContextClickListener {
        public boolean onContextClick(android.view.MotionEvent p0);
    }

    public static interface OnDoubleTapListener {
        public boolean onDoubleTap(android.view.MotionEvent p0);
        public boolean onDoubleTapEvent(android.view.MotionEvent p0);
        public boolean onSingleTapConfirmed(android.view.MotionEvent p0);
    }

    public static interface OnGestureListener {
        public boolean onDown(android.view.MotionEvent p0);
        public boolean onFling(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3);
        public void onLongPress(android.view.MotionEvent p0);
        public boolean onScroll(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3);
        public void onShowPress(android.view.MotionEvent p0);
        public boolean onSingleTapUp(android.view.MotionEvent p0);
    }

    public static class SimpleOnGestureListener implements android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnContextClickListener {
        public SimpleOnGestureListener() {}
        public boolean onContextClick(android.view.MotionEvent p0) { return false; }
        public boolean onDoubleTap(android.view.MotionEvent p0) { return false; }
        public boolean onDoubleTapEvent(android.view.MotionEvent p0) { return false; }
        public boolean onDown(android.view.MotionEvent p0) { return false; }
        public boolean onFling(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3) { return false; }
        public void onLongPress(android.view.MotionEvent p0) {}
        public boolean onScroll(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3) { return false; }
        public void onShowPress(android.view.MotionEvent p0) {}
        public boolean onSingleTapConfirmed(android.view.MotionEvent p0) { return false; }
        public boolean onSingleTapUp(android.view.MotionEvent p0) { return false; }
    }
}
