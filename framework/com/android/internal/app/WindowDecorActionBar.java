package com.android.internal.app;

public class WindowDecorActionBar extends android.app.ActionBar implements com.android.internal.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback {
    static final boolean $assertionsDisabled = false;
    private static final int CONTEXT_DISPLAY_NORMAL = 0;
    private static final int CONTEXT_DISPLAY_SPLIT = 1;
    private static final long FADE_IN_DURATION_MS = 200L;
    private static final long FADE_OUT_DURATION_MS = 100L;
    private static final int INVALID_POSITION = -1;
    private static final java.lang.String TAG = "WindowDecorActionBar";
    android.view.ActionMode mActionMode;
    private android.app.Activity mActivity;
    private com.android.internal.widget.ActionBarContainer mContainerView;
    private boolean mContentAnimations;
    private android.view.View mContentView;
    private android.content.Context mContext;
    private int mContextDisplayMode;
    private com.android.internal.widget.ActionBarContextView mContextView;
    private int mCurWindowVisibility;
    private android.animation.Animator mCurrentShowAnim;
    private com.android.internal.widget.DecorToolbar mDecorToolbar;
    android.view.ActionMode mDeferredDestroyActionMode;
    android.view.ActionMode.Callback mDeferredModeDestroyCallback;
    private android.app.Dialog mDialog;
    private boolean mDisplayHomeAsUpSet;
    private boolean mHasEmbeddedTabs;
    private boolean mHiddenByApp;
    private boolean mHiddenBySystem;
    final android.animation.Animator.AnimatorListener mHideListener = null;
    boolean mHideOnContentScroll;
    private boolean mLastMenuVisibility;
    private java.util.ArrayList<android.app.ActionBar.OnMenuVisibilityListener> mMenuVisibilityListeners;
    private boolean mNowShowing;
    private com.android.internal.widget.ActionBarOverlayLayout mOverlayLayout;
    private int mSavedTabPosition;
    private com.android.internal.app.WindowDecorActionBar.TabImpl mSelectedTab;
    private boolean mShowHideAnimationEnabled;
    final android.animation.Animator.AnimatorListener mShowListener = null;
    private boolean mShowingForMode;
    private com.android.internal.widget.ActionBarContainer mSplitView;
    private com.android.internal.widget.ScrollingTabContainerView mTabScrollView;
    private java.util.ArrayList<com.android.internal.app.WindowDecorActionBar.TabImpl> mTabs;
    private android.content.Context mThemedContext;
    final android.animation.ValueAnimator.AnimatorUpdateListener mUpdateListener = null;
    public WindowDecorActionBar(android.app.Activity p0) { super(); }
    public WindowDecorActionBar(android.app.Dialog p0) { super(); }
    public WindowDecorActionBar(android.view.View p0) { super(); }
    private static boolean checkShowingFlags(boolean p0, boolean p1, boolean p2) { return false; }
    private void cleanupTabs() {}
    private void configureTab(android.app.ActionBar.Tab p0, int p1) {}
    private void ensureTabsExist() {}
    private com.android.internal.widget.DecorToolbar getDecorToolbar(android.view.View p0) { return null; }
    private void hideForActionMode() {}
    private void init(android.view.View p0) {}
    private void setHasEmbeddedTabs(boolean p0) {}
    private boolean shouldAnimateContextView() { return false; }
    private void showForActionMode() {}
    private void updateVisibility(boolean p0) {}
    public void addOnMenuVisibilityListener(android.app.ActionBar.OnMenuVisibilityListener p0) {}
    public void addTab(android.app.ActionBar.Tab p0) {}
    public void addTab(android.app.ActionBar.Tab p0, int p1) {}
    public void addTab(android.app.ActionBar.Tab p0, int p1, boolean p2) {}
    public void addTab(android.app.ActionBar.Tab p0, boolean p1) {}
    void animateToMode(boolean p0) {}
    public boolean collapseActionView() { return false; }
    void completeDeferredDestroyActionMode() {}
    public void dispatchMenuVisibilityChanged(boolean p0) {}
    public void doHide(boolean p0) {}
    public void doShow(boolean p0) {}
    public void enableContentAnimations(boolean p0) {}
    public android.view.View getCustomView() { return null; }
    public int getDisplayOptions() { return 0; }
    public float getElevation() { return 0.0f; }
    public int getHeight() { return 0; }
    public int getHideOffset() { return 0; }
    public int getNavigationItemCount() { return 0; }
    public int getNavigationMode() { return 0; }
    public int getSelectedNavigationIndex() { return 0; }
    public android.app.ActionBar.Tab getSelectedTab() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public android.app.ActionBar.Tab getTabAt(int p0) { return null; }
    public int getTabCount() { return 0; }
    public android.content.Context getThemedContext() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public boolean hasIcon() { return false; }
    public boolean hasLogo() { return false; }
    public void hide() {}
    public void hideForSystem() {}
    public boolean isHideOnContentScrollEnabled() { return false; }
    public boolean isShowing() { return false; }
    public boolean isTitleTruncated() { return false; }
    public android.app.ActionBar.Tab newTab() { return null; }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onContentScrollStarted() {}
    public void onContentScrollStopped() {}
    public void onWindowVisibilityChanged(int p0) {}
    public void removeAllTabs() {}
    public void removeOnMenuVisibilityListener(android.app.ActionBar.OnMenuVisibilityListener p0) {}
    public void removeTab(android.app.ActionBar.Tab p0) {}
    public void removeTabAt(int p0) {}
    public void selectTab(android.app.ActionBar.Tab p0) {}
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setCustomView(int p0) {}
    public void setCustomView(android.view.View p0) {}
    public void setCustomView(android.view.View p0, android.app.ActionBar.LayoutParams p1) {}
    public void setDefaultDisplayHomeAsUpEnabled(boolean p0) {}
    public void setDisplayHomeAsUpEnabled(boolean p0) {}
    public void setDisplayOptions(int p0) {}
    public void setDisplayOptions(int p0, int p1) {}
    public void setDisplayShowCustomEnabled(boolean p0) {}
    public void setDisplayShowHomeEnabled(boolean p0) {}
    public void setDisplayShowTitleEnabled(boolean p0) {}
    public void setDisplayUseLogoEnabled(boolean p0) {}
    public void setElevation(float p0) {}
    public void setHideOffset(int p0) {}
    public void setHideOnContentScrollEnabled(boolean p0) {}
    public void setHomeActionContentDescription(int p0) {}
    public void setHomeActionContentDescription(java.lang.CharSequence p0) {}
    public void setHomeAsUpIndicator(int p0) {}
    public void setHomeAsUpIndicator(android.graphics.drawable.Drawable p0) {}
    public void setHomeButtonEnabled(boolean p0) {}
    public void setIcon(int p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public void setListNavigationCallbacks(android.widget.SpinnerAdapter p0, android.app.ActionBar.OnNavigationListener p1) {}
    public void setLogo(int p0) {}
    public void setLogo(android.graphics.drawable.Drawable p0) {}
    public void setNavigationMode(int p0) {}
    public void setSelectedNavigationItem(int p0) {}
    public void setShowHideAnimationEnabled(boolean p0) {}
    public void setSplitBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setStackedBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setSubtitle(int p0) {}
    public void setSubtitle(java.lang.CharSequence p0) {}
    public void setTitle(int p0) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public void setWindowTitle(java.lang.CharSequence p0) {}
    public void show() {}
    public void showForSystem() {}
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0) { return null; }

    public class ActionModeImpl extends android.view.ActionMode implements com.android.internal.view.menu.MenuBuilder.Callback {
        private final android.content.Context mActionModeContext = null;
        private android.view.ActionMode.Callback mCallback;
        private java.lang.ref.WeakReference<android.view.View> mCustomView;
        private final com.android.internal.view.menu.MenuBuilder mMenu = null;
        public ActionModeImpl(com.android.internal.app.WindowDecorActionBar p0, android.content.Context p1, android.view.ActionMode.Callback p2) { super(); }
        public boolean dispatchOnCreate() { return false; }
        public void finish() {}
        public android.view.View getCustomView() { return null; }
        public android.view.Menu getMenu() { return null; }
        public android.view.MenuInflater getMenuInflater() { return null; }
        public java.lang.CharSequence getSubtitle() { return null; }
        public java.lang.CharSequence getTitle() { return null; }
        public void invalidate() {}
        public boolean isTitleOptional() { return false; }
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
        public void onCloseSubMenu(com.android.internal.view.menu.SubMenuBuilder p0) {}
        public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) { return false; }
        public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder p0) {}
        public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0) { return false; }
        public void setCustomView(android.view.View p0) {}
        public void setSubtitle(int p0) {}
        public void setSubtitle(java.lang.CharSequence p0) {}
        public void setTitle(int p0) {}
        public void setTitle(java.lang.CharSequence p0) {}
        public void setTitleOptionalHint(boolean p0) {}
    }

    public class TabImpl extends android.app.ActionBar.Tab {
        private android.app.ActionBar.TabListener mCallback;
        private java.lang.CharSequence mContentDesc;
        private android.view.View mCustomView;
        private android.graphics.drawable.Drawable mIcon;
        private int mPosition;
        private java.lang.Object mTag;
        private java.lang.CharSequence mText;
        public TabImpl(com.android.internal.app.WindowDecorActionBar p0) { super(); }
        public android.app.ActionBar.TabListener getCallback() { return null; }
        public java.lang.CharSequence getContentDescription() { return null; }
        public android.view.View getCustomView() { return null; }
        public android.graphics.drawable.Drawable getIcon() { return null; }
        public int getPosition() { return 0; }
        public java.lang.Object getTag() { return null; }
        public java.lang.CharSequence getText() { return null; }
        public void select() {}
        public android.app.ActionBar.Tab setContentDescription(int p0) { return null; }
        public android.app.ActionBar.Tab setContentDescription(java.lang.CharSequence p0) { return null; }
        public android.app.ActionBar.Tab setCustomView(int p0) { return null; }
        public android.app.ActionBar.Tab setCustomView(android.view.View p0) { return null; }
        public android.app.ActionBar.Tab setIcon(int p0) { return null; }
        public android.app.ActionBar.Tab setIcon(android.graphics.drawable.Drawable p0) { return null; }
        public void setPosition(int p0) {}
        public android.app.ActionBar.Tab setTabListener(android.app.ActionBar.TabListener p0) { return null; }
        public android.app.ActionBar.Tab setTag(java.lang.Object p0) { return null; }
        public android.app.ActionBar.Tab setText(int p0) { return null; }
        public android.app.ActionBar.Tab setText(java.lang.CharSequence p0) { return null; }
    }
}
