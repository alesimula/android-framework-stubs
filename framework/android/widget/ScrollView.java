package android.widget;

public class ScrollView extends android.widget.FrameLayout {
    static final int ANIMATED_SCROLL_GAP = 250;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final int INVALID_POINTER = -1;
    static final float MAX_SCROLL_FACTOR = 0.5f;
    private static final int SCROLL_STATE_FLING = 2;
    private static final int SCROLL_STATE_NONE = 0;
    private static final int SCROLL_STATE_SCROLLING = 1;
    private static final java.lang.String TAG = "ScrollView";
    private int mActivePointerId;
    private android.view.View mChildToScrollTo;
    private android.widget.DifferentialMotionFlingHelper mDifferentialMotionFlingHelper;
    public android.widget.EdgeEffect mEdgeGlowBottom;
    public android.widget.EdgeEffect mEdgeGlowTop;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    private boolean mFillViewport;
    private android.os.StrictMode.Span mFlingStrictSpan;
    private android.view.HapticScrollFeedbackProvider mHapticScrollFeedbackProvider;
    private boolean mIsBeingDragged;
    private boolean mIsLayoutDirty;
    private android.app.jank.JankTracker mJankTracker;
    private int mLastMotionY;
    private long mLastScroll;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private int mOverflingDistance;
    private int mOverscrollDistance;
    private android.widget.ScrollView.SavedState mSavedState;
    private final int[] mScrollConsumed = null;
    private final int[] mScrollOffset = null;
    private int mScrollState;
    private android.widget.ScrollView.ScrollStateChangeListener mScrollStateChangeListener;
    private android.os.StrictMode.Span mScrollStrictSpan;
    private boolean mScrollToTopEnabled;
    private android.widget.OverScroller mScroller;
    private boolean mSmoothScrollingEnabled;
    private final android.graphics.Rect mTempRect = null;
    private int mTouchSlop;
    private android.view.VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;
    public ScrollView(android.content.Context p0) { super((android.content.Context)null); }
    public ScrollView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ScrollView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ScrollView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private boolean canScroll() { return false; }
    private static int clamp(int p0, int p1, int p2) { return 0; }
    private int consumeFlingInStretch(int p0) { return 0; }
    private void doScrollY(int p0) {}
    private void endDrag() {}
    private android.view.View findFocusableViewInBounds(boolean p0, int p1, int p2) { return null; }
    private void flingWithNestedDispatch(int p0) {}
    private int getScrollRange() { return 0; }
    private java.lang.String getWidgetStateFromScrollState(int p0) { return null; }
    private boolean inChild(int p0, int p1) { return false; }
    private void initDifferentialFlingHelperIfNotExists() {}
    private void initHapticScrollFeedbackProviderIfNotExists() {}
    private void initJankTracking(java.lang.String p0) {}
    private void initOrResetVelocityTracker() {}
    private void initScrollView() {}
    private void initVelocityTrackerIfNotExists() {}
    private boolean isOffScreen(android.view.View p0) { return false; }
    private static boolean isViewDescendantOf(android.view.View p0, android.view.View p1) { return false; }
    private boolean isWithinDeltaOfScreen(android.view.View p0, int p1, int p2) { return false; }
    private void onSecondaryPointerUp(android.view.MotionEvent p0) {}
    private void recycleVelocityTracker() {}
    private boolean scrollAndFocus(int p0, int p1, int p2) { return false; }
    private boolean scrollToChildRect(android.graphics.Rect p0, boolean p1) { return false; }
    private void setScrollState(int p0) {}
    private boolean shouldAbsorb(android.widget.EdgeEffect p0, int p1) { return false; }
    private boolean shouldDisplayEdgeEffects() { return false; }
    public void addView(android.view.View p0) {}
    public void addView(android.view.View p0, int p1) {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public boolean arrowScroll(int p0) { return false; }
    public void computeScroll() {}
    protected int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect p0) { return 0; }
    protected int computeVerticalScrollOffset() { return 0; }
    protected int computeVerticalScrollRange() { return 0; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public void draw(android.graphics.Canvas p0) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    public boolean executeKeyEvent(android.view.KeyEvent p0) { return false; }
    public void fling(int p0) {}
    public boolean fullScroll(int p0) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public int getBottomEdgeEffectColor() { return 0; }
    protected float getBottomFadingEdgeStrength() { return 0.0f; }
    public int getMaxScrollAmount() { return 0; }
    public int getTopEdgeEffectColor() { return 0; }
    protected float getTopFadingEdgeStrength() { return 0.0f; }
    public boolean isFillViewport() { return false; }
    public boolean isScrollToTopEnabled() { return false; }
    public boolean isSmoothScrollingEnabled() { return false; }
    protected void measureChild(android.view.View p0, int p1, int p2) {}
    protected void measureChildWithMargins(android.view.View p0, int p1, int p2, int p3, int p4) {}
    protected void onDetachedFromWindow() {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean onNestedFling(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    public void onNestedScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void onNestedScrollAccepted(android.view.View p0, android.view.View p1, int p2) {}
    protected void onOverScrolled(int p0, int p1, boolean p2, boolean p3) {}
    protected boolean onRequestFocusInDescendants(int p0, android.graphics.Rect p1) { return false; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    public boolean onScrollToTop(int p0) { return false; }
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public boolean onStartNestedScroll(android.view.View p0, android.view.View p1, int p2) { return false; }
    public void onStopNestedScroll(android.view.View p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean pageScroll(int p0) { return false; }
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public void requestChildFocus(android.view.View p0, android.view.View p1) {}
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2) { return false; }
    public void requestDisallowInterceptTouchEvent(boolean p0) {}
    public void requestLayout() {}
    public void scrollTo(int p0, int p1) {}
    public void scrollToDescendant(android.view.View p0) {}
    public void setBottomEdgeEffectColor(int p0) {}
    public void setEdgeEffectColor(int p0) {}
    public void setFillViewport(boolean p0) {}
    public void setScrollToTopEnabled(boolean p0) {}
    public void setSmoothScrollingEnabled(boolean p0) {}
    public void setTopEdgeEffectColor(int p0) {}
    public boolean shouldDelayChildPressedState() { return false; }
    public final void smoothScrollBy(int p0, int p1) {}
    public final void smoothScrollTo(int p0, int p1) {}

    private class DifferentialFlingTarget implements android.widget.DifferentialMotionFlingHelper.DifferentialMotionFlingTarget {
        private DifferentialFlingTarget(android.widget.ScrollView p0) {}
        public float getScaledScrollFactor() { return 0.0f; }
        public boolean startDifferentialMotionFling(float p0) { return false; }
        public void stopDifferentialMotionFling() {}
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<android.widget.ScrollView.SavedState> CREATOR = null;
        public int scrollPosition;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static interface ScrollStateChangeListener {
        public void onScrollStateChanged(android.widget.ScrollView p0, int p1, int p2);
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.ScrollView> {
        private int mFillViewportId;
        private boolean mPropertiesMapped;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.ScrollView p0, android.view.inspector.PropertyReader p1) {}
    }
}
