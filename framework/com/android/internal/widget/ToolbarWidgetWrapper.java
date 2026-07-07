package com.android.internal.widget;

public class ToolbarWidgetWrapper implements com.android.internal.widget.DecorToolbar {
    private static final int AFFECTS_LOGO_MASK = 3;
    private static final long DEFAULT_FADE_DURATION_MS = 200L;
    private static final java.lang.String TAG = "ToolbarWidgetWrapper";
    private android.widget.ActionMenuPresenter mActionMenuPresenter;
    private android.view.View mCustomView;
    private int mDefaultNavigationContentDescription;
    private android.graphics.drawable.Drawable mDefaultNavigationIcon;
    private int mDefaultNavigationIconResId;
    private int mDisplayOpts;
    private java.lang.CharSequence mHomeDescription;
    private android.graphics.drawable.Drawable mIcon;
    private int mIconResId;
    private android.graphics.drawable.Drawable mLogo;
    private int mLogoResId;
    private boolean mMenuPrepared;
    private android.graphics.drawable.Drawable mNavIcon;
    private int mNavigationMode;
    private android.widget.Spinner mSpinner;
    private java.lang.CharSequence mSubtitle;
    private android.view.View mTabView;
    private java.lang.CharSequence mTitle;
    private boolean mTitleSet;
    private android.widget.Toolbar mToolbar;
    private android.view.Window.Callback mWindowCallback;
    public ToolbarWidgetWrapper(android.widget.Toolbar p0, boolean p1) {}
    public ToolbarWidgetWrapper(android.widget.Toolbar p0, boolean p1, int p2) {}
    private int detectDisplayOptions() { return 0; }
    private void ensureSpinner() {}
    private android.graphics.drawable.Drawable getDefaultNavigationIcon() { return null; }
    private android.graphics.drawable.Drawable getIcon() { return null; }
    private android.graphics.drawable.Drawable getLogo() { return null; }
    private void setTitleInt(java.lang.CharSequence p0) {}
    private void updateHomeAccessibility() {}
    private void updateNavigationIcon() {}
    private void updateToolbarLogo() {}
    public void animateToVisibility(int p0) {}
    public boolean canShowOverflowMenu() { return false; }
    public boolean canSplit() { return false; }
    public void collapseActionView() {}
    public void dismissPopupMenus() {}
    public android.content.Context getContext() { return null; }
    public android.view.View getCustomView() { return null; }
    public int getDisplayOptions() { return 0; }
    public int getDropdownItemCount() { return 0; }
    public int getDropdownSelectedPosition() { return 0; }
    public int getHeight() { return 0; }
    public android.view.Menu getMenu() { return null; }
    public int getNavigationMode() { return 0; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public android.view.ViewGroup getViewGroup() { return null; }
    public int getVisibility() { return 0; }
    public boolean hasEmbeddedTabs() { return false; }
    public boolean hasExpandedActionView() { return false; }
    public boolean hasIcon() { return false; }
    public boolean hasLogo() { return false; }
    public boolean hideOverflowMenu() { return false; }
    public void initIndeterminateProgress() {}
    public void initProgress() {}
    public boolean isOverflowMenuShowPending() { return false; }
    public boolean isOverflowMenuShowing() { return false; }
    public boolean isSplit() { return false; }
    public boolean isTitleTruncated() { return false; }
    public void restoreHierarchyState(android.util.SparseArray<android.os.Parcelable> p0) {}
    public void saveHierarchyState(android.util.SparseArray<android.os.Parcelable> p0) {}
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setCollapsible(boolean p0) {}
    public void setCustomView(android.view.View p0) {}
    public void setDefaultNavigationContentDescription(int p0) {}
    public void setDefaultNavigationIcon(android.graphics.drawable.Drawable p0) {}
    public void setDisplayOptions(int p0) {}
    public void setDropdownParams(android.widget.SpinnerAdapter p0, android.widget.AdapterView.OnItemSelectedListener p1) {}
    public void setDropdownSelectedPosition(int p0) {}
    public void setEmbeddedTabView(com.android.internal.widget.ScrollingTabContainerView p0) {}
    public void setHomeButtonEnabled(boolean p0) {}
    public void setIcon(int p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public void setLogo(int p0) {}
    public void setLogo(android.graphics.drawable.Drawable p0) {}
    public void setMenu(android.view.Menu p0, com.android.internal.view.menu.MenuPresenter.Callback p1) {}
    public void setMenuCallbacks(com.android.internal.view.menu.MenuPresenter.Callback p0, com.android.internal.view.menu.MenuBuilder.Callback p1) {}
    public void setMenuPrepared() {}
    public void setNavigationContentDescription(int p0) {}
    public void setNavigationContentDescription(java.lang.CharSequence p0) {}
    public void setNavigationIcon(int p0) {}
    public void setNavigationIcon(android.graphics.drawable.Drawable p0) {}
    public void setNavigationMode(int p0) {}
    public void setSplitToolbar(boolean p0) {}
    public void setSplitView(android.view.ViewGroup p0) {}
    public void setSplitWhenNarrow(boolean p0) {}
    public void setSubtitle(java.lang.CharSequence p0) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public void setVisibility(int p0) {}
    public void setWindowCallback(android.view.Window.Callback p0) {}
    public void setWindowTitle(java.lang.CharSequence p0) {}
    public android.animation.Animator setupAnimatorToVisibility(int p0, long p1) { return null; }
    public boolean showOverflowMenu() { return false; }
}
