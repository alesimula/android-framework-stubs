package android.view;

public class ScaleGestureDetector {
    private static final int ANCHORED_SCALE_MODE_DOUBLE_TAP = 1;
    private static final int ANCHORED_SCALE_MODE_NONE = 0;
    private static final int ANCHORED_SCALE_MODE_STYLUS = 2;
    private static final float SCALE_FACTOR = 0.5f;
    private static final java.lang.String TAG = "ScaleGestureDetector";
    private static final long TOUCH_STABILIZE_TIME = 128L;
    private int mAnchoredScaleMode;
    private float mAnchoredScaleStartX;
    private float mAnchoredScaleStartY;
    private float mClassifiedPinchScaleFactor;
    private final android.content.Context mContext = null;
    private float mCurrSpan;
    private float mCurrSpanX;
    private float mCurrSpanY;
    private long mCurrTime;
    private boolean mEventBeforeOrAboveStartingGestureEvent;
    private float mFocusX;
    private float mFocusY;
    private android.view.GestureDetector mGestureDetector;
    private final android.os.Handler mHandler = null;
    private boolean mInProgress;
    private float mInitialSpan;
    private final android.view.InputEventConsistencyVerifier mInputEventConsistencyVerifier = null;
    private boolean mIsClassifiedPinchMode;
    private final android.view.ScaleGestureDetector.OnScaleGestureListener mListener = null;
    private int mMinSpan;
    private float mPrevSpan;
    private float mPrevSpanX;
    private float mPrevSpanY;
    private long mPrevTime;
    private boolean mQuickScaleEnabled;
    private int mSpanSlop;
    private boolean mStylusScaleEnabled;
    public ScaleGestureDetector(android.content.Context p0, int p1, int p2, android.os.Handler p3, android.view.ScaleGestureDetector.OnScaleGestureListener p4) {}
    public ScaleGestureDetector(android.content.Context p0, android.view.ScaleGestureDetector.OnScaleGestureListener p1) {}
    public ScaleGestureDetector(android.content.Context p0, android.view.ScaleGestureDetector.OnScaleGestureListener p1, android.os.Handler p2) {}
    private void callOnScale(float p0, float p1, float p2, float p3, float p4, long p5) {}
    private void endStream() {}
    private boolean handleClassifiedPinch(android.view.MotionEvent p0) { return false; }
    private boolean inAnchoredScaleMode() { return false; }
    private void startStream(float p0, float p1, float p2, float p3, float p4, long p5) {}
    public float getCurrentSpan() { return 0.0f; }
    public float getCurrentSpanX() { return 0.0f; }
    public float getCurrentSpanY() { return 0.0f; }
    public long getEventTime() { return 0L; }
    public float getFocusX() { return 0.0f; }
    public float getFocusY() { return 0.0f; }
    public float getPreviousSpan() { return 0.0f; }
    public float getPreviousSpanX() { return 0.0f; }
    public float getPreviousSpanY() { return 0.0f; }
    public float getScaleFactor() { return 0.0f; }
    public long getTimeDelta() { return 0L; }
    public boolean isInProgress() { return false; }
    public boolean isQuickScaleEnabled() { return false; }
    public boolean isStylusScaleEnabled() { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void setQuickScaleEnabled(boolean p0) {}
    public void setStylusScaleEnabled(boolean p0) {}

    public static interface OnScaleGestureListener {
        public boolean onScale(android.view.ScaleGestureDetector p0);
        public boolean onScaleBegin(android.view.ScaleGestureDetector p0);
        public void onScaleEnd(android.view.ScaleGestureDetector p0);
    }

    public static class SimpleOnScaleGestureListener implements android.view.ScaleGestureDetector.OnScaleGestureListener {
        public SimpleOnScaleGestureListener() {}
        public boolean onScale(android.view.ScaleGestureDetector p0) { return false; }
        public boolean onScaleBegin(android.view.ScaleGestureDetector p0) { return false; }
        public void onScaleEnd(android.view.ScaleGestureDetector p0) {}
    }
}
