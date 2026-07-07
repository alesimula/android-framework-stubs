package android.widget;

@java.lang.Deprecated
public class Gallery extends android.widget.AbsSpinner implements android.view.GestureDetector.OnGestureListener {
    private static final int SCROLL_TO_FLING_UNCERTAINTY_TIMEOUT = 250;
    private static final java.lang.String TAG = "Gallery";
    private static final boolean localLOGV = false;
    private int mAnimationDuration;
    private android.widget.AdapterView.AdapterContextMenuInfo mContextMenuInfo;
    private java.lang.Runnable mDisableSuppressSelectionChangedRunnable;
    private int mDownTouchPosition;
    private android.view.View mDownTouchView;
    private android.widget.Gallery.FlingRunnable mFlingRunnable;
    private android.view.GestureDetector mGestureDetector;
    private int mGravity;
    private boolean mIsFirstScroll;
    private boolean mIsRtl;
    private int mLeftMost;
    private boolean mReceivedInvokeKeyDown;
    private int mRightMost;
    private int mSelectedCenterOffset;
    private android.view.View mSelectedChild;
    private boolean mShouldCallbackDuringFling;
    private boolean mShouldCallbackOnUnselectedItemClick;
    private boolean mShouldStopFling;
    private int mSpacing;
    private boolean mSuppressSelectionChanged;
    private float mUnselectedAlpha;
    public Gallery(android.content.Context p0) { super((android.content.Context)null); }
    public Gallery(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Gallery(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Gallery(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private int calculateTop(android.view.View p0, boolean p1) { return 0; }
    private void detachOffScreenChildren(boolean p0) {}
    private boolean dispatchLongPress(android.view.View p0, int p1, long p2, float p3, float p4, boolean p5) { return false; }
    private void dispatchPress(android.view.View p0) {}
    private void dispatchUnpress() {}
    private void fillToGalleryLeft() {}
    private void fillToGalleryLeftLtr() {}
    private void fillToGalleryLeftRtl() {}
    private void fillToGalleryRight() {}
    private void fillToGalleryRightLtr() {}
    private void fillToGalleryRightRtl() {}
    private int getCenterOfGallery() { return 0; }
    private static int getCenterOfView(android.view.View p0) { return 0; }
    private android.view.View makeAndAddView(int p0, int p1, int p2, boolean p3) { return null; }
    private void offsetChildrenLeftAndRight(int p0) {}
    private void onFinishedMovement() {}
    private void scrollIntoSlots() {}
    private boolean scrollToChild(int p0) { return false; }
    private void setSelectionToCenterChild() {}
    private void setUpChild(android.view.View p0, int p1, int p2, boolean p3) {}
    private boolean showContextMenuForChildInternal(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    private boolean showContextMenuInternal(float p0, float p1, boolean p2) { return false; }
    private void updateSelectedItemMetadata() {}
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected int computeHorizontalScrollExtent() { return 0; }
    protected int computeHorizontalScrollOffset() { return 0; }
    protected int computeHorizontalScrollRange() { return 0; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    protected void dispatchSetPressed(boolean p0) {}
    public void dispatchSetSelected(boolean p0) {}
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected int getChildDrawingOrder(int p0, int p1) { return 0; }
    int getChildHeight(android.view.View p0) { return 0; }
    protected boolean getChildStaticTransformation(android.view.View p0, android.view.animation.Transformation p1) { return false; }
    protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo() { return null; }
    int getLimitedMotionScrollAmount(boolean p0, int p1) { return 0; }
    void layout(int p0, boolean p1) {}
    boolean moveDirection(int p0) { return false; }
    protected void onAttachedToWindow() {}
    void onCancel() {}
    public boolean onDown(android.view.MotionEvent p0) { return false; }
    public boolean onFling(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3) { return false; }
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void onLongPress(android.view.MotionEvent p0) {}
    public boolean onScroll(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3) { return false; }
    public void onShowPress(android.view.MotionEvent p0) {}
    public boolean onSingleTapUp(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    void onUp() {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    void selectionChanged() {}
    public void setAnimationDuration(int p0) {}
    public void setCallbackDuringFling(boolean p0) {}
    public void setCallbackOnUnselectedItemClick(boolean p0) {}
    public void setGravity(int p0) {}
    void setSelectedPositionInt(int p0) {}
    public void setSpacing(int p0) {}
    public void setUnselectedAlpha(float p0) {}
    public boolean showContextMenu() { return false; }
    public boolean showContextMenu(float p0, float p1) { return false; }
    public boolean showContextMenuForChild(android.view.View p0) { return false; }
    public boolean showContextMenuForChild(android.view.View p0, float p1, float p2) { return false; }
    void trackMotionScroll(int p0) {}

    private class FlingRunnable implements java.lang.Runnable {
        private int mLastFlingX;
        private android.widget.Scroller mScroller;
        public FlingRunnable(android.widget.Gallery p0) {}
        private void endFling(boolean p0) {}
        private void startCommon() {}
        public void run() {}
        public void startUsingDistance(int p0) {}
        public void startUsingVelocity(int p0) {}
        public void stop(boolean p0) {}
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
    }
}
