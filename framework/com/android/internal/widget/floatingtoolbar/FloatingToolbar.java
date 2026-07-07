package com.android.internal.widget.floatingtoolbar;

public final class FloatingToolbar {
    public static final java.lang.String FLOATING_TOOLBAR_TAG = "floating_toolbar";
    private static final android.view.MenuItem.OnMenuItemClickListener NO_OP_MENUITEM_CLICK_LISTENER = null;
    private final android.view.View mContainerView = null;
    private final android.graphics.Rect mContentRect = null;
    private final android.content.Context mContext = null;
    private android.view.Menu mMenu;
    private android.view.MenuItem.OnMenuItemClickListener mMenuItemClickListener;
    private final java.util.Comparator<android.view.MenuItem> mMenuItemComparator = null;
    private final android.view.View.OnLayoutChangeListener mOrientationChangeHandler = null;
    private final com.android.internal.widget.floatingtoolbar.FloatingToolbarPopup mPopup = null;
    public FloatingToolbar(android.view.View p0) {}
    public FloatingToolbar(android.view.Window p0) {}
    private void doShow() {}
    private static java.util.List<android.view.MenuItem> getVisibleAndEnabledMenuItems(android.view.Menu p0) { return null; }
    private void registerOrientationHandler() {}
    private void unregisterOrientationHandler() {}
    public void dismiss() {}
    public void hide() {}
    public boolean isHidden() { return false; }
    public boolean isShowing() { return false; }
    public com.android.internal.widget.floatingtoolbar.FloatingToolbar setContentRect(android.graphics.Rect p0) { return null; }
    public com.android.internal.widget.floatingtoolbar.FloatingToolbar setMenu(android.view.Menu p0) { return null; }
    public com.android.internal.widget.floatingtoolbar.FloatingToolbar setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener p0) { return null; }
    public void setOutsideTouchable(boolean p0, android.widget.PopupWindow.OnDismissListener p1) {}
    public com.android.internal.widget.floatingtoolbar.FloatingToolbar setSuggestedWidth(int p0) { return null; }
    public com.android.internal.widget.floatingtoolbar.FloatingToolbar show() { return null; }
    public com.android.internal.widget.floatingtoolbar.FloatingToolbar updateLayout() { return null; }
}
