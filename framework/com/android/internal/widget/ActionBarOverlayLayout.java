package com.android.internal.widget;

public class ActionBarOverlayLayout extends android.view.ViewGroup implements com.android.internal.widget.DecorContentParent {
    public static final android.util.Property<com.android.internal.widget.ActionBarOverlayLayout, java.lang.Integer> ACTION_BAR_HIDE_OFFSET = null;
    static final int[] ATTRS = null;
    private static final android.graphics.Rect EMPTY_RECT = null;
    private static final java.lang.String TAG = "ActionBarOverlayLayout";
    private final int ACTION_BAR_ANIMATE_DELAY = 0;
    private com.android.internal.widget.ActionBarContainer mActionBarBottom;
    private boolean mActionBarExtendsIntoSystemInsets;
    private int mActionBarHeight;
    private com.android.internal.widget.ActionBarContainer mActionBarTop;
    private com.android.internal.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback mActionBarVisibilityCallback;
    private final java.lang.Runnable mAddActionBarHideOffset = null;
    private boolean mAnimatingForFling;
    private final android.graphics.Rect mBaseContentInsets = null;
    private android.view.WindowInsets mBaseInnerInsets;
    private final android.animation.Animator.AnimatorListener mBottomAnimatorListener = null;
    private android.view.View mContent;
    private final android.graphics.Rect mContentInsets = null;
    private android.view.ViewPropertyAnimator mCurrentActionBarBottomAnimator;
    private android.view.ViewPropertyAnimator mCurrentActionBarTopAnimator;
    private boolean mDecorFitsSystemWindows;
    private com.android.internal.widget.DecorToolbar mDecorToolbar;
    private android.widget.OverScroller mFlingEstimator;
    private boolean mHasNonEmbeddedTabs;
    private boolean mHideOnContentScroll;
    private int mHideOnContentScrollReference;
    private boolean mIgnoreWindowContentOverlay;
    private android.view.WindowInsets mInnerInsets;
    private final android.graphics.Rect mLastBaseContentInsets = null;
    private android.view.WindowInsets mLastBaseInnerInsets;
    private android.view.WindowInsets mLastInnerInsets;
    private int mLastSystemUiVisibility;
    private boolean mOverlayMode;
    private final java.lang.Runnable mRemoveActionBarHideOffset = null;
    private final android.graphics.Rect mSystemInsets = null;
    private final android.animation.Animator.AnimatorListener mTopAnimatorListener = null;
    private android.graphics.drawable.Drawable mWindowContentOverlay;
    private int mWindowVisibility;
    public ActionBarOverlayLayout(android.content.Context p0) { super((android.content.Context)null); }
    public ActionBarOverlayLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void addActionBarHideOffset() {}
    private com.android.internal.widget.DecorToolbar getDecorToolbar(android.view.View p0) { return null; }
    private void haltActionBarHideOffsetAnimations() {}
    private void init(android.content.Context p0) {}
    private void postAddActionBarHideOffset() {}
    private void postRemoveActionBarHideOffset() {}
    private void removeActionBarHideOffset() {}
    private boolean setMargin(android.view.View p0, int p1, int p2, int p3, int p4) { return false; }
    private boolean shouldHideActionBarOnFling(float p0, float p1) { return false; }
    public boolean canShowOverflowMenu() { return false; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    public void dismissPopups() {}
    public void draw(android.graphics.Canvas p0) {}
    protected com.android.internal.widget.ActionBarOverlayLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public com.android.internal.widget.ActionBarOverlayLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public int getActionBarHideOffset() { return 0; }
    public java.lang.CharSequence getTitle() { return null; }
    public boolean hasIcon() { return false; }
    public boolean hasLogo() { return false; }
    public boolean hideOverflowMenu() { return false; }
    public void initFeature(int p0) {}
    public boolean isHideOnContentScrollEnabled() { return false; }
    public boolean isInOverlayMode() { return false; }
    public boolean isOverflowMenuShowPending() { return false; }
    public boolean isOverflowMenuShowing() { return false; }
    public void notifyContentChanged() {}
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    protected void onDetachedFromWindow() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean onNestedFling(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    public void onNestedScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void onNestedScrollAccepted(android.view.View p0, android.view.View p1, int p2) {}
    public boolean onStartNestedScroll(android.view.View p0, android.view.View p1, int p2) { return false; }
    public void onStopNestedScroll(android.view.View p0) {}
    public void onWindowSystemUiVisibilityChanged(int p0) {}
    protected void onWindowVisibilityChanged(int p0) {}
    void pullChildren() {}
    public void restoreToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> p0) {}
    public void saveToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> p0) {}
    public void setActionBarHideOffset(int p0) {}
    public void setActionBarVisibilityCallback(com.android.internal.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback p0) {}
    public void setHasNonEmbeddedTabs(boolean p0) {}
    public void setHideOnContentScrollEnabled(boolean p0) {}
    public void setIcon(int p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public void setLogo(int p0) {}
    public void setMenu(android.view.Menu p0, com.android.internal.view.menu.MenuPresenter.Callback p1) {}
    public void setMenuPrepared() {}
    public void setOverlayMode(boolean p0) {}
    public void setShowingForActionMode(boolean p0) {}
    public void setUiOptions(int p0) {}
    public void setWindowCallback(android.view.Window.Callback p0) {}
    public void setWindowTitle(java.lang.CharSequence p0) {}
    public boolean shouldDelayChildPressedState() { return false; }
    public boolean showOverflowMenu() { return false; }

    public static interface ActionBarVisibilityCallback {
        public void enableContentAnimations(boolean p0);
        public void hideForSystem();
        public void onContentScrollStarted();
        public void onContentScrollStopped();
        public void onWindowVisibilityChanged(int p0);
        public void showForSystem();
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
    }
}
