package android.gesture;

public class GestureOverlayView extends android.widget.FrameLayout {
    private static final boolean DITHER_FLAG = true;
    private static final int FADE_ANIMATION_RATE = 16;
    private static final boolean GESTURE_RENDERING_ANTIALIAS = true;
    public static final int GESTURE_STROKE_TYPE_MULTIPLE = 1;
    public static final int GESTURE_STROKE_TYPE_SINGLE = 0;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    private int mCertainGestureColor;
    private int mCurrentColor;
    private android.gesture.Gesture mCurrentGesture;
    private float mCurveEndX;
    private float mCurveEndY;
    private long mFadeDuration;
    private boolean mFadeEnabled;
    private long mFadeOffset;
    private float mFadingAlpha;
    private boolean mFadingHasStarted;
    private final android.gesture.GestureOverlayView.FadeOutRunnable mFadingOut = null;
    private long mFadingStart;
    private final android.graphics.Paint mGesturePaint = null;
    private float mGestureStrokeAngleThreshold;
    private float mGestureStrokeLengthThreshold;
    private float mGestureStrokeSquarenessTreshold;
    private int mGestureStrokeType;
    private float mGestureStrokeWidth;
    private boolean mGestureVisible;
    private boolean mHandleGestureActions;
    private boolean mInterceptEvents;
    private final android.view.animation.AccelerateDecelerateInterpolator mInterpolator = null;
    private final android.graphics.Rect mInvalidRect = null;
    private int mInvalidateExtraBorder;
    private boolean mIsFadingOut;
    private boolean mIsGesturing;
    private boolean mIsListeningForGestures;
    private final java.util.ArrayList<android.gesture.GestureOverlayView.OnGestureListener> mOnGestureListeners = null;
    private final java.util.ArrayList<android.gesture.GestureOverlayView.OnGesturePerformedListener> mOnGesturePerformedListeners = null;
    private final java.util.ArrayList<android.gesture.GestureOverlayView.OnGesturingListener> mOnGesturingListeners = null;
    private int mOrientation;
    private final android.graphics.Path mPath = null;
    private boolean mPreviousWasGesturing;
    private boolean mResetGesture;
    private final java.util.ArrayList<android.gesture.GesturePoint> mStrokeBuffer = null;
    private float mTotalLength;
    private int mUncertainGestureColor;
    private float mX;
    private float mY;
    public GestureOverlayView(android.content.Context p0) { super((android.content.Context)null); }
    public GestureOverlayView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public GestureOverlayView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public GestureOverlayView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void cancelGesture(android.view.MotionEvent p0) {}
    private void clear(boolean p0, boolean p1, boolean p2) {}
    private void fireOnGesturePerformed() {}
    private void init() {}
    private boolean processEvent(android.view.MotionEvent p0) { return false; }
    private void setCurrentColor(int p0) {}
    private void setPaintAlpha(int p0) {}
    private void touchDown(android.view.MotionEvent p0) {}
    private android.graphics.Rect touchMove(android.view.MotionEvent p0) { return null; }
    private void touchUp(android.view.MotionEvent p0, boolean p1) {}
    public void addOnGestureListener(android.gesture.GestureOverlayView.OnGestureListener p0) {}
    public void addOnGesturePerformedListener(android.gesture.GestureOverlayView.OnGesturePerformedListener p0) {}
    public void addOnGesturingListener(android.gesture.GestureOverlayView.OnGesturingListener p0) {}
    public void cancelClearAnimation() {}
    public void cancelGesture() {}
    public void clear(boolean p0) {}
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public void draw(android.graphics.Canvas p0) {}
    public java.util.ArrayList<android.gesture.GesturePoint> getCurrentStroke() { return null; }
    public long getFadeOffset() { return 0L; }
    public android.gesture.Gesture getGesture() { return null; }
    public int getGestureColor() { return 0; }
    public android.graphics.Paint getGesturePaint() { return null; }
    public android.graphics.Path getGesturePath() { return null; }
    public android.graphics.Path getGesturePath(android.graphics.Path p0) { return null; }
    public float getGestureStrokeAngleThreshold() { return 0.0f; }
    public float getGestureStrokeLengthThreshold() { return 0.0f; }
    public float getGestureStrokeSquarenessTreshold() { return 0.0f; }
    public int getGestureStrokeType() { return 0; }
    public float getGestureStrokeWidth() { return 0.0f; }
    public int getOrientation() { return 0; }
    public int getUncertainGestureColor() { return 0; }
    public boolean isEventsInterceptionEnabled() { return false; }
    public boolean isFadeEnabled() { return false; }
    public boolean isGestureVisible() { return false; }
    public boolean isGesturing() { return false; }
    protected void onDetachedFromWindow() {}
    public void removeAllOnGestureListeners() {}
    public void removeAllOnGesturePerformedListeners() {}
    public void removeAllOnGesturingListeners() {}
    public void removeOnGestureListener(android.gesture.GestureOverlayView.OnGestureListener p0) {}
    public void removeOnGesturePerformedListener(android.gesture.GestureOverlayView.OnGesturePerformedListener p0) {}
    public void removeOnGesturingListener(android.gesture.GestureOverlayView.OnGesturingListener p0) {}
    public void setEventsInterceptionEnabled(boolean p0) {}
    public void setFadeEnabled(boolean p0) {}
    public void setFadeOffset(long p0) {}
    public void setGesture(android.gesture.Gesture p0) {}
    public void setGestureColor(int p0) {}
    public void setGestureStrokeAngleThreshold(float p0) {}
    public void setGestureStrokeLengthThreshold(float p0) {}
    public void setGestureStrokeSquarenessTreshold(float p0) {}
    public void setGestureStrokeType(int p0) {}
    public void setGestureStrokeWidth(float p0) {}
    public void setGestureVisible(boolean p0) {}
    public void setOrientation(int p0) {}
    public void setUncertainGestureColor(int p0) {}

    private class FadeOutRunnable implements java.lang.Runnable {
        boolean fireActionPerformed;
        boolean resetMultipleStrokes;
        private FadeOutRunnable(android.gesture.GestureOverlayView p0) {}
        public void run() {}
    }

    public static interface OnGestureListener {
        public void onGesture(android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);
        public void onGestureCancelled(android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);
        public void onGestureEnded(android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);
        public void onGestureStarted(android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);
    }

    public static interface OnGesturePerformedListener {
        public void onGesturePerformed(android.gesture.GestureOverlayView p0, android.gesture.Gesture p1);
    }

    public static interface OnGesturingListener {
        public void onGesturingEnded(android.gesture.GestureOverlayView p0);
        public void onGesturingStarted(android.gesture.GestureOverlayView p0);
    }
}
