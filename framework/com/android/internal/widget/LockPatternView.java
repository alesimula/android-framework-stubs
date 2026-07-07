package com.android.internal.widget;

public class LockPatternView extends android.view.View {
    private static final int ALPHA_MAX_VALUE = 255;
    private static final int ASPECT_LOCK_HEIGHT = 2;
    private static final int ASPECT_LOCK_WIDTH = 1;
    private static final int ASPECT_SQUARE = 0;
    private static final int CELL_ACTIVATE = 0;
    private static final int CELL_DEACTIVATE = 1;
    public static final boolean DEBUG_A11Y = false;
    private static final int DOT_ACTIVATION_DURATION_MILLIS = 50;
    private static final int DOT_COUNT = 9;
    private static final int DOT_RADIUS_DECREASE_DURATION_MILLIS = 192;
    private static final int DOT_RADIUS_INCREASE_DURATION_MILLIS = 96;
    private static final float DRAG_THRESHOLD = 0.0f;
    private static final float FOCUS_RING_GAP = 6.0f;
    private static final float FOCUS_RING_WIDTH = 3.0f;
    private static final int LINE_END_ANIMATION_DURATION_MILLIS = 50;
    private static final int MILLIS_PER_CIRCLE_ANIMATING = 700;
    private static final float MIN_DOT_HIT_FACTOR = 0.20000000298023224f;
    private static final boolean PROFILE_DRAWING = false;
    private static final java.lang.String TAG = "LockPatternView";
    public static final int VIRTUAL_BASE_VIEW_ID = 1;
    private long mAnimatingPeriodStart;
    private int mAspect;
    private final com.android.internal.widget.LockPatternView.CellState[][] mCellStates = null;
    private boolean mClickInputSupported;
    private final android.graphics.Path mCurrentPath = null;
    private int mDotActivatedColor;
    private int mDotColor;
    private final float mDotHitFactor = 0.0f;
    private float mDotHitMaxRadius;
    private float mDotHitRadius;
    private int mDotSize;
    private int mDotSizeActivated;
    private boolean mDrawingProfilingStarted;
    private boolean mEnlargeVertex;
    private int mErrorColor;
    private final com.android.internal.widget.LockPatternView.PatternExploreByTouchHelper mExploreByTouchHelper = null;
    private com.android.internal.widget.LockPatternView.ExternalHapticsPlayer mExternalHapticsPlayer;
    private int mFadeAnimationAlpha;
    private boolean mFadeClear;
    private final android.graphics.LinearGradient mFadeOutGradientShader = null;
    private boolean mFadePattern;
    private final int mFadePatternAnimationDelayMs = 0;
    private final int mFadePatternAnimationDurationMs = 0;
    private final android.view.animation.Interpolator mFastOutSlowInInterpolator = null;
    private int mFocusColor;
    private final android.graphics.Paint mFocusPaint = null;
    private boolean mFocusVisible;
    private int mFocusedCellIndex;
    private float mInProgressX;
    private float mInProgressY;
    private boolean mInStealthMode;
    private boolean mInputEnabled;
    private com.android.internal.widget.LockPatternView.InputMode mInputMode;
    private final android.graphics.Rect mInvalidate = null;
    private boolean mKeepDotActivated;
    private final int mLineFadeOutAnimationDelayMs = 0;
    private final int mLineFadeOutAnimationDurationMs = 0;
    private long[] mLineFadeStart;
    private final android.view.animation.Interpolator mLinearOutSlowInInterpolator = null;
    private android.graphics.drawable.Drawable mNotSelectedDrawable;
    private com.android.internal.widget.LockPatternView.OnPatternListener mOnPatternListener;
    private final android.graphics.Paint mPaint = null;
    private final android.graphics.Paint mPathPaint = null;
    private int mPathWidth;
    private final java.util.ArrayList<com.android.internal.widget.LockPatternView.Cell> mPattern = null;
    private com.android.internal.widget.LockPatternView.DisplayMode mPatternDisplayMode;
    private final boolean[][] mPatternDrawLookup = null;
    private boolean mPatternInProgress;
    private final android.graphics.Path mPatternPath = null;
    private int mRegularColor;
    private android.graphics.drawable.Drawable mSelectedDrawable;
    private float mSquareHeight;
    private float mSquareWidth;
    private final android.view.animation.Interpolator mStandardAccelerateInterpolator = null;
    private int mSuccessColor;
    private final android.graphics.Rect mTmpInvalidateRect = null;
    private boolean mUseLockPatternDrawable;
    public LockPatternView(android.content.Context p0) { super((android.content.Context)null); }
    public LockPatternView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void addCellToPattern(com.android.internal.widget.LockPatternView.Cell p0) {}
    private boolean calculateFocusableState() { return false; }
    private float calculateLastSegmentAlpha(float p0, float p1, float p2, float p3) { return 0.0f; }
    private void cancelLineAnimations() {}
    private com.android.internal.widget.LockPatternView.Cell checkForNewHit(float p0, float p1) { return null; }
    private void clearPatternDrawLookup() {}
    private android.animation.Animator createDotActivationColorAnimation(com.android.internal.widget.LockPatternView.CellState p0, int p1, boolean p2) { return null; }
    private android.animation.Animator createDotRadiusAnimation(com.android.internal.widget.LockPatternView.CellState p0, int p1, boolean p2) { return null; }
    private android.animation.Animator createFadePatternAnimation() { return null; }
    private android.animation.Animator createLineDisappearingAnimation() { return null; }
    private android.animation.Animator createLineEndAnimation(com.android.internal.widget.LockPatternView.CellState p0, float p1, float p2, float p3, float p4) { return null; }
    private void deactivateLastCell() {}
    private com.android.internal.widget.LockPatternView.Cell detectAndAddHit(float p0, float p1) { return null; }
    private com.android.internal.widget.LockPatternView.Cell detectCellHit(float p0, float p1) { return null; }
    private void drawCellDrawable(android.graphics.Canvas p0, int p1, int p2, float p3, boolean p4) {}
    private void drawCircle(android.graphics.Canvas p0, float p1, float p2, float p3, boolean p4, float p5, float p6) {}
    private void drawFadingAwayLineSegment(android.graphics.Canvas p0, float p1, float p2, float p3, float p4, float p5) {}
    private void drawLinePoint(android.graphics.Canvas p0, com.android.internal.widget.LockPatternView.Cell p1) {}
    private void drawLineSegment(android.graphics.Canvas p0, float p1, float p2, float p3, float p4, long p5, long p6) {}
    private int findNextFocusableCell(int p0, int p1, boolean p2) { return 0; }
    private float getCenterXForColumn(int p0) { return 0.0f; }
    private float getCenterYForRow(int p0) { return 0.0f; }
    private int getCurrentColor(boolean p0) { return 0; }
    private int getDotColor() { return 0; }
    private void handleActionCancel() {}
    private void handleActionDown(android.view.MotionEvent p0) {}
    private boolean handleActionKeyboard(int p0) { return false; }
    private void handleActionMouseUp(float p0, float p1) {}
    private void handleActionMove(android.view.MotionEvent p0) {}
    private void handleActionUp() {}
    private boolean handleInputMode(com.android.internal.widget.LockPatternView.InputMode p0) { return false; }
    private static boolean isCellIndexInRange(int p0) { return false; }
    private boolean isCellIndexPartOfPattern(int p0) { return false; }
    private boolean isPatternFull() { return false; }
    private static boolean isVertex(int p0, int p1) { return false; }
    private void notifyCellAdded() {}
    private void notifyPatternCleared() {}
    private void notifyPatternDetected() {}
    private void notifyPatternStarted() {}
    private void resetPattern() {}
    private void resetPatternCellSize() {}
    private int resolveMeasured(int p0, int p1) { return 0; }
    private void setPatternInProgress(boolean p0) {}
    private void startCellActivatedAnimation(com.android.internal.widget.LockPatternView.Cell p0) {}
    private void startCellActivationAnimation(com.android.internal.widget.LockPatternView.Cell p0, int p1, boolean p2) {}
    private void startCellDeactivatedAnimation(com.android.internal.widget.LockPatternView.Cell p0, boolean p1) {}
    private void startCellStateAnimationHw(com.android.internal.widget.LockPatternView.CellState p0, float p1, float p2, float p3, float p4, float p5, float p6, long p7, long p8, android.view.animation.Interpolator p9, java.lang.Runnable p10) {}
    private void startCellStateAnimationSw(com.android.internal.widget.LockPatternView.CellState p0, float p1, float p2, float p3, float p4, float p5, float p6, long p7, long p8, android.view.animation.Interpolator p9, java.lang.Runnable p10) {}
    private void startFadePatternAnimation() {}
    private void startRtAlphaAnimation(com.android.internal.widget.LockPatternView.CellState p0, float p1, long p2, long p3, android.view.animation.Interpolator p4, android.animation.Animator.AnimatorListener p5) {}
    private void startRtFloatAnimation(android.graphics.CanvasProperty<java.lang.Float> p0, float p1, long p2, long p3, android.view.animation.Interpolator p4) {}
    private void switchInputMode(com.android.internal.widget.LockPatternView.InputMode p0) {}
    private void updateFocusable() {}
    private static boolean verifyMotionEventSourceType(android.view.MotionEvent p0, int p1) { return false; }
    public void clearPattern() {}
    public void disableInput() {}
    protected boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public void enableInput() {}
    public void fadeClearPattern() {}
    public com.android.internal.widget.LockPatternView.CellState[][] getCellStates() { return null; }
    public com.android.internal.widget.LockPatternView.InputMode getInputMode() { return null; }
    public boolean isEmpty() { return false; }
    public boolean isInStealthMode() { return false; }
    protected void onDraw(android.graphics.Canvas p0) {}
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean performHapticFeedback(int p0, int p1) { return false; }
    public void setClickInputSupported(boolean p0) {}
    public void setColors(int p0, int p1, int p2) {}
    public void setDisplayMode(com.android.internal.widget.LockPatternView.DisplayMode p0) {}
    public void setDotColors(int p0, int p1) {}
    public void setDotSizes(int p0, int p1) {}
    public void setEnableInput(boolean p0) {}
    public void setExternalHapticsPlayer(com.android.internal.widget.LockPatternView.ExternalHapticsPlayer p0) {}
    public void setFadePattern(boolean p0) {}
    public void setInStealthMode(boolean p0) {}
    public void setKeepDotActivated(boolean p0) {}
    public void setOnPatternListener(com.android.internal.widget.LockPatternView.OnPatternListener p0) {}
    public void setPathWidth(int p0) {}
    public void setPattern(com.android.internal.widget.LockPatternView.DisplayMode p0, java.util.List<com.android.internal.widget.LockPatternView.Cell> p1) {}
    public void startCellStateAnimation(com.android.internal.widget.LockPatternView.CellState p0, float p1, float p2, float p3, float p4, float p5, float p6, long p7, long p8, android.view.animation.Interpolator p9, java.lang.Runnable p10) {}

    public static final class Cell {
        private static final com.android.internal.widget.LockPatternView.Cell[][] sCells = null;
        final int column = 0;
        final int row = 0;
        private Cell(int p0, int p1) {}
        private static void checkRange(int p0, int p1) {}
        private static com.android.internal.widget.LockPatternView.Cell[][] createCells() { return null; }
        public static com.android.internal.widget.LockPatternView.Cell of(int p0, int p1) { return null; }
        public int getColumn() { return 0; }
        public int getRow() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class CellState {
        float activationAnimationProgress;
        android.animation.Animator activationAnimator;
        float alpha;
        int col;
        android.animation.Animator deactivationAnimator;
        boolean hwAnimating;
        android.graphics.CanvasProperty<java.lang.Float> hwCenterX;
        android.graphics.CanvasProperty<java.lang.Float> hwCenterY;
        android.graphics.CanvasProperty<android.graphics.Paint> hwPaint;
        android.graphics.CanvasProperty<java.lang.Float> hwRadius;
        public float lineEndX;
        public float lineEndY;
        float radius;
        int row;
        float translationY;
        public CellState() {}
    }

    public static enum DisplayMode {
        Animate,
        Correct,
        Wrong;
        private static final com.android.internal.widget.LockPatternView.DisplayMode[] $VALUES = null;
        private DisplayMode() {}
    }

    public static interface ExternalHapticsPlayer {
        public void performCellAddedFeedback();
    }

    public static enum InputMode {
        Click,
        Swipe;
        private static final com.android.internal.widget.LockPatternView.InputMode[] $VALUES = null;
        private InputMode() {}
    }

    public static interface OnPatternListener {
        @java.lang.Deprecated
        default public void onPatternCellAdded(java.util.List<com.android.internal.widget.LockPatternView.Cell> p0) {}
        default public void onPatternCellAdded(java.util.List<com.android.internal.widget.LockPatternView.Cell> p0, com.android.internal.widget.LockPatternView.InputMode p1) {}
        default public void onPatternCleared() {}
        @java.lang.Deprecated
        default public void onPatternDetected(java.util.List<com.android.internal.widget.LockPatternView.Cell> p0) {}
        default public void onPatternDetected(java.util.List<com.android.internal.widget.LockPatternView.Cell> p0, com.android.internal.widget.LockPatternView.InputMode p1) {}
        @java.lang.Deprecated
        default public void onPatternStart() {}
        default public void onPatternStart(com.android.internal.widget.LockPatternView.InputMode p0) {}
    }

    private final class PatternExploreByTouchHelper extends com.android.internal.widget.ExploreByTouchHelper {
        private android.view.accessibility.AccessibilityNodeProvider mAccessibilityNodeProvider;
        private android.graphics.Rect mTempRect;
        public PatternExploreByTouchHelper(com.android.internal.widget.LockPatternView p0, android.view.View p1) { super(null); }
        private android.graphics.Rect getBoundsForVirtualView(int p0) { return null; }
        private java.lang.CharSequence getTextForVirtualView(int p0) { return null; }
        private int getVirtualViewIdForHit(float p0, float p1) { return 0; }
        private boolean isClickable(int p0) { return false; }
        public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View p0) { return null; }
        protected int getVirtualViewAt(float p0, float p1) { return 0; }
        protected void getVisibleVirtualViews(android.util.IntArray p0) {}
        boolean onItemClicked(int p0) { return false; }
        protected boolean onPerformActionForVirtualView(int p0, int p1, android.os.Bundle p2) { return false; }
        public void onPopulateAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) {}
        protected void onPopulateEventForVirtualView(int p0, android.view.accessibility.AccessibilityEvent p1) {}
        protected void onPopulateNodeForVirtualView(int p0, android.view.accessibility.AccessibilityNodeInfo p1) {}

        class VirtualViewContainer {
            java.lang.CharSequence description;
            public VirtualViewContainer(com.android.internal.widget.LockPatternView.PatternExploreByTouchHelper p0, java.lang.CharSequence p1) {}
        }
    }

    private static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.android.internal.widget.LockPatternView.SavedState> CREATOR = null;
        private final int mDisplayMode = 0;
        private final boolean mInStealthMode = false;
        private final boolean mInputEnabled = false;
        private final int mInputMode = 0;
        private final boolean mPatternInProgress = false;
        private final java.lang.String mSerializedPattern = null;
        private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        private SavedState(android.os.Parcelable p0, java.lang.String p1, int p2, boolean p3, int p4, boolean p5, boolean p6) { super((android.os.Parcel)null); }
        int getDisplayMode() { return 0; }
        int getInputMode() { return 0; }
        java.lang.String getSerializedPattern() { return null; }
        boolean isInStealthMode() { return false; }
        boolean isInputEnabled() { return false; }
        boolean isPatternInProgress() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
