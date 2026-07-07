package com.android.internal.widget;

public class WatchListDecorLayout extends android.widget.FrameLayout implements android.view.ViewTreeObserver.OnScrollChangedListener {
    private android.view.View mBottomPanel;
    private int mForegroundPaddingBottom;
    private int mForegroundPaddingLeft;
    private int mForegroundPaddingRight;
    private int mForegroundPaddingTop;
    private android.widget.ListView mListView;
    private final java.util.ArrayList<android.view.View> mMatchParentChildren = null;
    private android.view.ViewTreeObserver mObserver;
    private int mPendingScroll;
    private android.view.View mTopPanel;
    public WatchListDecorLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public WatchListDecorLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public WatchListDecorLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void applyMeasureToChild(android.view.View p0, int p1, int p2) {}
    private int getPaddingBottomWithForeground() { return 0; }
    private int getPaddingLeftWithForeground() { return 0; }
    private int getPaddingRightWithForeground() { return 0; }
    private int getPaddingTopWithForeground() { return 0; }
    private int measureAndGetHeight(android.view.View p0, int p1, int p2) { return 0; }
    private void setScrolling(android.view.View p0, float p1) {}
    protected void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    protected void onMeasure(int p0, int p1) {}
    public void onScrollChanged() {}
    public void setForegroundGravity(int p0) {}
}
