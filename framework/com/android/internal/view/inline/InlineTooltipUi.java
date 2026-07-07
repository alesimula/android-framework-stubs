package com.android.internal.view.inline;

public final class InlineTooltipUi extends android.widget.PopupWindow implements java.lang.AutoCloseable {
    private static final int FIRST_TIME_SHOW_DEFAULT_DELAY_MS = 250;
    private static final java.lang.String TAG = "InlineTooltipUi";
    private final android.view.View.OnAttachStateChangeListener mAnchorOnAttachStateChangeListener = null;
    private final android.view.View.OnLayoutChangeListener mAnchoredOnLayoutChangeListener = null;
    private final android.view.ViewGroup mContentContainer = null;
    private boolean mDelayShowAtStart;
    private com.android.internal.view.inline.InlineTooltipUi.DelayShowRunnable mDelayShowTooltip;
    private boolean mDelaying;
    private boolean mHasEverDetached;
    private int mShowDelayConfigMs;
    private boolean mShowing;
    private final android.graphics.Rect mTmpRect = null;
    private android.view.WindowManager.LayoutParams mWindowLayoutParams;
    private final android.view.WindowManager mWm = null;
    public InlineTooltipUi(android.content.Context p0) { super(); }
    private void adjustPosition() {}
    private int getPreferHeight(android.view.View p0) { return 0; }
    private void hide() {}
    private void removeDelayShowTooltip(android.view.View p0) {}
    private void show(android.view.WindowManager.LayoutParams p0) {}
    private void updateInner(android.view.View p0) {}
    protected void attachToAnchor(android.view.View p0, int p1, int p2, int p3) {}
    public void close() {}
    protected void detachFromAnchor() {}
    public void dismiss() {}
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    protected boolean findDropDownPosition(android.view.View p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, boolean p7) { return false; }
    public int getAnimationStyle() { return 0; }
    public android.graphics.drawable.Drawable getBackground() { return null; }
    public android.view.View getContentView() { return null; }
    protected android.view.WindowManager.LayoutParams getDecorViewLayoutParams() { return null; }
    public float getElevation() { return 0.0f; }
    public android.transition.Transition getEnterTransition() { return null; }
    public android.transition.Transition getExitTransition() { return null; }
    protected boolean hasContentView() { return false; }
    protected boolean hasDecorView() { return false; }
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setContentView(android.view.View p0) {}
    public void setElevation(float p0) {}
    public void setEnterTransition(android.transition.Transition p0) {}
    public void setExitTransition(android.transition.Transition p0) {}
    public void setTooltipView(android.widget.inline.InlineContentView p0) {}
    public void setTouchInterceptor(android.view.View.OnTouchListener p0) {}
    public void showAsDropDown(android.view.View p0, int p1, int p2, int p3) {}
    public void update(android.view.View p0) {}
    protected void update(android.view.View p0, android.view.WindowManager.LayoutParams p1) {}

    private class DelayShowRunnable implements java.lang.Runnable {
        java.lang.ref.WeakReference<android.view.View> mAnchor;
        DelayShowRunnable(com.android.internal.view.inline.InlineTooltipUi p0, android.view.View p1) {}
        public void run() {}
        public void setAnchor(android.view.View p0) {}
    }
}
