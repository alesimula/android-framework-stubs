package com.android.internal.widget;

public class ActionBarContainer extends android.widget.FrameLayout {
    private android.view.View mActionBarView;
    private android.view.View mActionContextView;
    private android.graphics.drawable.Drawable mBackground;
    private int mHeight;
    private boolean mIsSplit;
    private boolean mIsStacked;
    private boolean mIsTransitioning;
    private android.graphics.drawable.Drawable mSplitBackground;
    private android.graphics.drawable.Drawable mStackedBackground;
    private android.view.View mTabContainer;
    public ActionBarContainer(android.content.Context p0) { super((android.content.Context)null); }
    public ActionBarContainer(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private int getMeasuredHeightWithMargins(android.view.View p0) { return 0; }
    private static boolean isCollapsed(android.view.View p0) { return false; }
    protected void drawableStateChanged() {}
    public android.view.View getTabContainer() { return null; }
    public void jumpDrawablesToCurrentState() {}
    public void onFinishInflate() {}
    public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void onMeasure(int p0, int p1) {}
    public void onResolveDrawables(int p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void setPrimaryBackground(android.graphics.drawable.Drawable p0) {}
    public void setSplitBackground(android.graphics.drawable.Drawable p0) {}
    public void setStackedBackground(android.graphics.drawable.Drawable p0) {}
    public void setTabContainer(com.android.internal.widget.ScrollingTabContainerView p0) {}
    public void setTransitioning(boolean p0) {}
    public void setVisibility(int p0) {}
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1, int p2) { return null; }
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }

    private class ActionBarBackgroundDrawable extends android.graphics.drawable.Drawable {
        private ActionBarBackgroundDrawable(com.android.internal.widget.ActionBarContainer p0) { super(); }
        public void draw(android.graphics.Canvas p0) {}
        public int getOpacity() { return 0; }
        public void getOutline(android.graphics.Outline p0) {}
        public void setAlpha(int p0) {}
        public void setColorFilter(android.graphics.ColorFilter p0) {}
    }
}
