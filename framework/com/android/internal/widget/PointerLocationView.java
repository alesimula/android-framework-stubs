package com.android.internal.widget;

public class PointerLocationView extends android.view.View implements android.hardware.input.InputManager.InputDeviceListener, android.view.WindowManagerPolicyConstants.PointerEventListener {
    private static final java.lang.String ALT_STRATEGY_PROPERY_KEY = "debug.velocitytracker.alt";
    private static final com.android.internal.widget.PointerLocationView.PointerState EMPTY_POINTER_STATE = null;
    private static final java.lang.String GESTURE_EXCLUSION_PROP = "debug.pointerlocation.showexclusion";
    private static final java.lang.String TAG = null;
    private int mActivePointerId;
    private final android.view.VelocityTracker mAltVelocity = null;
    private boolean mCurDown;
    private int mCurNumPointers;
    private final android.graphics.Paint mCurrentPointPaint = null;
    private float mDensity;
    private final android.hardware.display.DisplayManager.DisplayListener mDisplayListener = null;
    private final android.hardware.display.DisplayManager mDisplayManager = null;
    private int mHeaderBottom;
    private int mHeaderPaddingTop;
    private final android.hardware.input.InputManager mIm = null;
    private int mMaxNumPointers;
    private final android.graphics.Paint mPaint = null;
    private final android.graphics.Paint mPathPaint = null;
    private final android.util.SparseArray<com.android.internal.widget.PointerLocationView.PointerState> mPointers = null;
    private boolean mPrintCoords;
    private final android.graphics.RectF mReusableOvalRect = null;
    private final android.graphics.Region mSystemGestureExclusion = null;
    private final android.view.ISystemGestureExclusionListener mSystemGestureExclusionListener = null;
    private final android.graphics.Paint mSystemGestureExclusionPaint = null;
    private final android.graphics.Path mSystemGestureExclusionPath = null;
    private final android.graphics.Region mSystemGestureExclusionRejected = null;
    private final android.graphics.Paint mSystemGestureExclusionRejectedPaint = null;
    private final android.graphics.Paint mTargetPaint = null;
    private final android.view.MotionEvent.PointerCoords mTempCoords = null;
    private final com.android.internal.widget.PointerLocationView.FasterStringBuilder mText = null;
    private final android.graphics.Paint mTextBackgroundPaint = null;
    private final android.graphics.Paint mTextLevelPaint = null;
    private final android.graphics.Paint.FontMetricsInt mTextMetrics = null;
    private final android.graphics.Paint mTextPaint = null;
    private android.graphics.Bitmap mTraceBitmap;
    private final android.graphics.Canvas mTraceCanvas = null;
    private final android.view.ViewConfiguration mVC = null;
    private final android.view.VelocityTracker mVelocity = null;
    private android.graphics.Insets mWaterfallInsets;
    public PointerLocationView(android.content.Context p0) { super((android.content.Context)null); }
    private void configureDensityDependentFactors() {}
    private void configureTraceBitmap() {}
    private void drawLabels(android.graphics.Canvas p0) {}
    private void drawOval(android.graphics.Canvas p0, float p1, float p2, float p3, float p4, float p5, android.graphics.Paint p6) {}
    private static int inverseRotation(int p0) { return 0; }
    private void logCoords(java.lang.String p0, int p1, int p2, android.view.MotionEvent.PointerCoords p3, int p4, android.view.MotionEvent p5) {}
    private void logInputDeviceState(int p0, java.lang.String p1) {}
    private void logInputDevices() {}
    private void logMotionEvent(java.lang.String p0, android.view.MotionEvent p1) {}
    private void rotateCanvasToUnrotatedDisplay(android.graphics.Canvas p0) {}
    private static boolean shouldLogKey(int p0) { return false; }
    private static boolean shouldShowSystemGestureExclusion() { return false; }
    private static int systemGestureExclusionOpacity() { return 0; }
    private void updateDrawTrace(com.android.internal.widget.PointerLocationView.PointerState p0) {}
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    protected void onAttachedToWindow() {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    protected void onDetachedFromWindow() {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public void onInputDeviceAdded(int p0) {}
    public void onInputDeviceChanged(int p0) {}
    public void onInputDeviceRemoved(int p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    protected void onMeasure(int p0, int p1) {}
    public void onPointerEvent(android.view.MotionEvent p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public void setPrintCoords(boolean p0) {}

    private static final class FasterStringBuilder {
        private char[] mChars;
        private int mLength;
        public FasterStringBuilder() {}
        private int reserve(int p0) { return 0; }
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder append(float p0, int p1) { return null; }
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder append(int p0) { return null; }
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder append(int p0, int p1) { return null; }
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder append(java.lang.String p0) { return null; }
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder clear() { return null; }
        public java.lang.String toString() { return null; }
    }

    public static class PointerState {
        private float mAltXVelocity;
        private float mAltYVelocity;
        private float mBoundingBottom;
        private float mBoundingLeft;
        private float mBoundingRight;
        private float mBoundingTop;
        private final android.view.MotionEvent.PointerCoords mCoords = null;
        private boolean mCurDown;
        private boolean mCurrentPointIsHistorical;
        private float mCurrentX;
        private float mCurrentY;
        private float mFirstX;
        private float mFirstY;
        private boolean mHasBoundingBox;
        private boolean mPreviousPointIsHistorical;
        private float mPreviousX;
        private float mPreviousY;
        private int mToolType;
        private float mXVelocity;
        private float mYVelocity;
        public PointerState() {}
        void addTrace(float p0, float p1, boolean p2) {}
    }
}
