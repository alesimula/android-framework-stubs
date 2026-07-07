package com.android.internal.widget;

public class ResolverDrawerLayout extends android.view.ViewGroup implements com.android.internal.widget.DismissableView {
    private static final java.lang.String TAG = "ResolverDrawerLayout";
    private int mActivePointerId;
    private int mAlwaysShowHeight;
    private float mCollapseOffset;
    private int mCollapsibleHeight;
    private int mCollapsibleHeightReserved;
    private boolean mDismissLocked;
    private boolean mDismissOnScrollerFinished;
    private float mDragRemainder;
    private int mIgnoreOffsetTopLimitViewId;
    private float mInitialTouchX;
    private float mInitialTouchY;
    private boolean mIsDragging;
    private final boolean mIsMaxCollapsedHeightSmallExplicit = false;
    private float mLastTouchY;
    private int mMaxCollapsedHeight;
    private int mMaxCollapsedHeightSmall;
    private int mMaxWidth;
    private int mMaxWidthResId;
    private com.android.internal.logging.MetricsLogger mMetricsLogger;
    private final float mMinFlingVelocity = 0.0f;
    private android.widget.AbsListView mNestedListChild;
    private com.android.internal.widget.RecyclerView mNestedRecyclerChild;
    private com.android.internal.widget.ResolverDrawerLayout.OnCollapsedChangedListener mOnCollapsedChangedListener;
    private com.android.internal.widget.DismissableView.OnDismissListener mOnDismissedListener;
    private boolean mOpenOnClick;
    private boolean mOpenOnLayout;
    private com.android.internal.widget.ResolverDrawerLayout.RunOnDismissedListener mRunOnDismissedListener;
    private android.graphics.drawable.Drawable mScrollIndicatorDrawable;
    private final android.widget.OverScroller mScroller = null;
    private boolean mShowAtTop;
    private boolean mSmallCollapsed;
    private final android.graphics.Rect mTempRect = null;
    private int mTopOffset;
    private final android.view.ViewTreeObserver.OnTouchModeChangeListener mTouchModeChangeListener = null;
    private final int mTouchSlop = 0;
    private int mUncollapsibleHeight;
    private final android.view.VelocityTracker mVelocityTracker = null;
    public ResolverDrawerLayout(android.content.Context p0) { super((android.content.Context)null); }
    public ResolverDrawerLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ResolverDrawerLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    private void abortAnimation() {}
    private void dismiss() {}
    private float distanceInfluenceForSnapDuration(float p0) { return 0.0f; }
    private android.view.View findChildUnder(float p0, float p1) { return null; }
    private static android.view.View findChildUnder(android.view.ViewGroup p0, float p1, float p2) { return null; }
    private android.view.View findIgnoreOffsetLimitView() { return null; }
    private android.view.View findListChildUnder(float p0, float p1) { return null; }
    private int getMaxCollapsedHeight() { return 0; }
    private com.android.internal.logging.MetricsLogger getMetricsLogger() { return null; }
    private static boolean isChildUnder(android.view.View p0, float p1, float p2) { return false; }
    private boolean isDescendantClipped(android.view.View p0) { return false; }
    private boolean isDismissable() { return false; }
    private boolean isDragging() { return false; }
    private boolean isListChildUnderClipped(float p0, float p1) { return false; }
    private boolean isMoving() { return false; }
    private boolean isNestedListChildScrolled() { return false; }
    private boolean isNestedRecyclerChildScrolled() { return false; }
    private void onCollapsedChanged(boolean p0) {}
    private void onSecondaryPointerUp(android.view.MotionEvent p0) {}
    private boolean performAccessibilityActionCommon(int p0) { return false; }
    private float performDrag(float p0) { return 0.0f; }
    private void resetTouch() {}
    private void setCollapseOffset(float p0) {}
    private void smoothScrollTo(int p0, float p1) {}
    private boolean updateCollapseOffset(int p0, boolean p1) { return false; }
    public void computeScroll() {}
    void dispatchOnDismissed() {}
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public int getAlwaysShowHeight() { return 0; }
    public boolean getShowAtTop() { return false; }
    public boolean isCollapsed() { return false; }
    public boolean isSmallCollapsed() { return false; }
    protected void onAttachedToWindow() {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    protected void onDetachedFromWindow() {}
    public void onDrawForeground(android.graphics.Canvas p0) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean onNestedFling(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    public boolean onNestedPreFling(android.view.View p0, float p1, float p2) { return false; }
    public boolean onNestedPrePerformAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
    public void onNestedPreScroll(android.view.View p0, int p1, int p2, int[] p3) {}
    public void onNestedScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void onNestedScrollAccepted(android.view.View p0, android.view.View p1, int p2) {}
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    public boolean onStartNestedScroll(android.view.View p0, android.view.View p1, int p2) { return false; }
    public void onStopNestedScroll(android.view.View p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public void requestChildFocus(android.view.View p0, android.view.View p1) {}
    public void scrollNestedScrollableChildBackToTop() {}
    public void setCollapsed(boolean p0) {}
    public void setCollapsibleHeightReserved(int p0) {}
    public void setDismissLocked(boolean p0) {}
    public void setMaxCollapsedHeight(int p0) {}
    public void setOnCollapsedChangedListener(com.android.internal.widget.ResolverDrawerLayout.OnCollapsedChangedListener p0) {}
    public void setOnDismissListener(com.android.internal.widget.DismissableView.OnDismissListener p0) {}
    public void setShowAtTop(boolean p0) {}
    public void setSmallCollapsed(boolean p0) {}

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public boolean alwaysShow;
        public boolean hasNestedScrollIndicator;
        public boolean ignoreOffset;
        int mFixedTop;
        public int maxHeight;
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(com.android.internal.widget.ResolverDrawerLayout.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
    }

    public static interface OnCollapsedChangedListener {
        public void onCollapsedChanged(boolean p0);
    }

    private class RunOnDismissedListener implements java.lang.Runnable {
        private RunOnDismissedListener(com.android.internal.widget.ResolverDrawerLayout p0) {}
        public void run() {}
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.android.internal.widget.ResolverDrawerLayout.SavedState> CREATOR = null;
        private int mCollapsibleHeightReserved;
        boolean open;
        private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
