package com.android.internal.view.menu;

final class CascadingMenuPopup extends com.android.internal.view.menu.MenuPopup implements com.android.internal.view.menu.MenuPresenter, android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {
    private static final int HORIZ_POSITION_LEFT = 0;
    private static final int HORIZ_POSITION_RIGHT = 1;
    private static final int SUBMENU_TIMEOUT_MS = 200;
    private android.view.View mAnchorView;
    private final android.view.View.OnAttachStateChangeListener mAttachStateChangeListener = null;
    private final android.content.Context mContext = null;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = null;
    private boolean mHasXOffset;
    private boolean mHasYOffset;
    private final int mItemLayout = 0;
    private int mLastPosition;
    private final android.widget.MenuItemHoverListener mMenuItemHoverListener = null;
    private final int mMenuMaxWidth = 0;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly = false;
    private final java.util.List<com.android.internal.view.menu.MenuBuilder> mPendingMenus = null;
    private final int mPopupStyleAttr = 0;
    private final int mPopupStyleRes = 0;
    private com.android.internal.view.menu.MenuPresenter.Callback mPresenterCallback;
    private int mRawDropDownGravity;
    private boolean mShouldCloseImmediately;
    private boolean mShowTitle;
    private final java.util.List<com.android.internal.view.menu.CascadingMenuPopup.CascadingMenuInfo> mShowingMenus = null;
    private android.view.View mShownAnchorView;
    private final android.os.Handler mSubMenuHoverHandler = null;
    private android.view.ViewTreeObserver mTreeObserver;
    private int mXOffset;
    private int mYOffset;
    public CascadingMenuPopup(android.content.Context p0, android.view.View p1, int p2, int p3, boolean p4) { super(); }
    private android.widget.MenuPopupWindow createPopupWindow() { return null; }
    private int findIndexOfAddedMenu(com.android.internal.view.menu.MenuBuilder p0) { return 0; }
    private android.view.MenuItem findMenuItemForSubmenu(com.android.internal.view.menu.MenuBuilder p0, com.android.internal.view.menu.MenuBuilder p1) { return null; }
    private android.view.View findParentViewForSubmenu(com.android.internal.view.menu.CascadingMenuPopup.CascadingMenuInfo p0, com.android.internal.view.menu.MenuBuilder p1) { return null; }
    private int getInitialMenuPosition() { return 0; }
    private int getNextMenuPosition(int p0) { return 0; }
    private void showMenu(com.android.internal.view.menu.MenuBuilder p0) {}
    public void addMenu(com.android.internal.view.menu.MenuBuilder p0) {}
    public void dismiss() {}
    public boolean flagActionItems() { return false; }
    public android.widget.ListView getListView() { return null; }
    public boolean isShowing() { return false; }
    public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
    public void onDismiss() {}
    public boolean onKey(android.view.View p0, int p1, android.view.KeyEvent p2) { return false; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0) { return false; }
    public void setAnchorView(android.view.View p0) {}
    public void setCallback(com.android.internal.view.menu.MenuPresenter.Callback p0) {}
    public void setForceShowIcon(boolean p0) {}
    public void setGravity(int p0) {}
    public void setHorizontalOffset(int p0) {}
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener p0) {}
    public void setShowTitle(boolean p0) {}
    public void setVerticalOffset(int p0) {}
    public void show() {}
    public void updateMenuView(boolean p0) {}

    private static class CascadingMenuInfo {
        public final com.android.internal.view.menu.MenuBuilder menu = null;
        public final int position = 0;
        public final android.widget.MenuPopupWindow window = null;
        public CascadingMenuInfo(android.widget.MenuPopupWindow p0, com.android.internal.view.menu.MenuBuilder p1, int p2) {}
        public android.widget.ListView getListView() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HorizPosition {
    }
}
