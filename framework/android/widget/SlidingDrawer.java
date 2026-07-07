package android.widget;

@java.lang.Deprecated
public class SlidingDrawer extends android.view.ViewGroup {
    private static final int ANIMATION_FRAME_DURATION = 16;
    private static final int COLLAPSED_FULL_CLOSED = -10002;
    private static final int EXPANDED_FULL_OPEN = -10001;
    private static final float MAXIMUM_ACCELERATION = 2000.0f;
    private static final float MAXIMUM_MAJOR_VELOCITY = 200.0f;
    private static final float MAXIMUM_MINOR_VELOCITY = 150.0f;
    private static final float MAXIMUM_TAP_VELOCITY = 100.0f;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    private static final int TAP_THRESHOLD = 6;
    private static final int VELOCITY_UNITS = 1000;
    private boolean mAllowSingleTap;
    private boolean mAnimateOnClick;
    private float mAnimatedAcceleration;
    private float mAnimatedVelocity;
    private boolean mAnimating;
    private long mAnimationLastTime;
    private float mAnimationPosition;
    private int mBottomOffset;
    private android.view.View mContent;
    private final int mContentId = 0;
    private long mCurrentAnimationTime;
    private boolean mExpanded;
    private final android.graphics.Rect mFrame = null;
    private android.view.View mHandle;
    private int mHandleHeight;
    private final int mHandleId = 0;
    private int mHandleWidth;
    private final android.graphics.Rect mInvalidate = null;
    private boolean mLocked;
    private final int mMaximumAcceleration = 0;
    private final int mMaximumMajorVelocity = 0;
    private final int mMaximumMinorVelocity = 0;
    private final int mMaximumTapVelocity = 0;
    private android.widget.SlidingDrawer.OnDrawerCloseListener mOnDrawerCloseListener;
    private android.widget.SlidingDrawer.OnDrawerOpenListener mOnDrawerOpenListener;
    private android.widget.SlidingDrawer.OnDrawerScrollListener mOnDrawerScrollListener;
    private final java.lang.Runnable mSlidingRunnable = null;
    private final int mTapThreshold = 0;
    private int mTopOffset;
    private int mTouchDelta;
    private boolean mTracking;
    private android.view.VelocityTracker mVelocityTracker;
    private final int mVelocityUnits = 0;
    private boolean mVertical;
    public SlidingDrawer(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SlidingDrawer(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SlidingDrawer(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void animateClose(int p0, boolean p1) {}
    private void animateOpen(int p0, boolean p1) {}
    private void closeDrawer() {}
    private void doAnimation() {}
    private void incrementAnimation() {}
    private void moveHandle(int p0) {}
    private void openDrawer() {}
    private void performFling(int p0, float p1, boolean p2, boolean p3) {}
    private void prepareContent() {}
    private void prepareTracking(int p0) {}
    private void stopTracking(boolean p0) {}
    public void animateClose() {}
    public void animateOpen() {}
    public void animateToggle() {}
    public void close() {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public android.view.View getContent() { return null; }
    public android.view.View getHandle() { return null; }
    public boolean isMoving() { return false; }
    public boolean isOpened() { return false; }
    public void lock() {}
    protected void onFinishInflate() {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void open() {}
    public void setOnDrawerCloseListener(android.widget.SlidingDrawer.OnDrawerCloseListener p0) {}
    public void setOnDrawerOpenListener(android.widget.SlidingDrawer.OnDrawerOpenListener p0) {}
    public void setOnDrawerScrollListener(android.widget.SlidingDrawer.OnDrawerScrollListener p0) {}
    public void toggle() {}
    public void unlock() {}

    private class DrawerToggler implements android.view.View.OnClickListener {
        private DrawerToggler(android.widget.SlidingDrawer p0) {}
        public void onClick(android.view.View p0) {}
    }

    public static interface OnDrawerCloseListener {
        public void onDrawerClosed();
    }

    public static interface OnDrawerOpenListener {
        public void onDrawerOpened();
    }

    public static interface OnDrawerScrollListener {
        public void onScrollEnded();
        public void onScrollStarted();
    }
}
