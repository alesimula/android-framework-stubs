package com.android.internal.widget.floatingtoolbar;

public final class RemoteFloatingToolbarPopup implements com.android.internal.widget.floatingtoolbar.FloatingToolbarPopup {
    private static final boolean DEBUG = Boolean.valueOf(false);
    public static final java.lang.String TRACE_TRACK_NAME = "RemoteFloatingToolbarPopup";
    private final android.graphics.Rect mContentRect = null;
    private final android.content.Context mContext = null;
    private final int[] mCoordsOnScreen = null;
    private final int[] mCoordsOnWindow = null;
    private boolean mHasShowToolbarBeenTraced;
    private final android.view.ViewTreeObserver.OnComputeInternalInsetsListener mInsetsComputer = null;
    private final boolean mIsLightTheme = false;
    private boolean mIsNewSurfaceViewNeeded;
    private android.view.MenuItem.OnMenuItemClickListener mMenuItemClickListener;
    private java.util.List<android.view.MenuItem> mMenuItems;
    private int mNextSequenceNumber;
    private final android.view.View mParent = null;
    private final android.util.SparseArray<android.view.MenuItem.OnMenuItemClickListener> mPendingMenuItemClickListeners = null;
    private final android.util.SparseArray<java.util.List<android.view.MenuItem>> mPendingMenuItems = null;
    private final android.util.SparseArray<android.view.selectiontoolbar.ShowInfo> mPendingShowInfos = null;
    private final android.widget.PopupWindow mPopupWindow = null;
    private final com.android.internal.widget.floatingtoolbar.RemoteFloatingToolbarPopup.SelectionToolbarCallbackImpl mSelectionToolbarCallback = null;
    private final android.view.selectiontoolbar.SelectionToolbarManager mSelectionToolbarManager = null;
    private int mState;
    private int mSuggestedWidth;
    private final android.graphics.Region mTouchableRegion = null;
    private final int mTraceCookie = 0;
    private boolean mWidthChanged;
    public RemoteFloatingToolbarPopup(android.content.Context p0, android.view.View p1) {}
    public static boolean areMenuItemsEqual(java.util.Collection<android.view.MenuItem> p0, java.util.Collection<android.view.MenuItem> p1) { return false; }
    private static android.graphics.drawable.Icon convertDrawableToIcon(android.graphics.drawable.Drawable p0) { return null; }
    private static android.widget.PopupWindow createPopupWindow(android.content.Context p0) { return null; }
    private android.graphics.Point getCoordinatesInWindow(int p0, int p1) { return null; }
    private static int getPriorityFromMenuItem(android.view.MenuItem p0) { return 0; }
    private static java.util.List<android.view.selectiontoolbar.ToolbarMenuItem> getToolbarMenuItems(java.util.List<android.view.MenuItem> p0) { return null; }
    private boolean isLatestPendingOrCurrent(java.util.List<android.view.MenuItem> p0, android.graphics.Rect p1) { return false; }
    private boolean isLightTheme(android.content.Context p0) { return false; }
    private void onInvisible() {}
    private void onMenuItemClicked(int p0) {}
    private void onShow(android.view.selectiontoolbar.WidgetInfo p0) {}
    private void onUpdated(android.view.selectiontoolbar.WidgetInfo p0) {}
    private void resetCoords() {}
    private void runOnUiThread(java.lang.Runnable p0) {}
    private void updateForWidgetInfo(android.view.selectiontoolbar.WidgetInfo p0) {}
    private void updatePopupWindowContent(android.view.selectiontoolbar.WidgetInfo p0) {}
    private void updateTouchableRegion(android.view.selectiontoolbar.WidgetInfo p0) {}
    public void dismiss() {}
    public void hide() {}
    public boolean isHidden() { return false; }
    public boolean isShowing() { return false; }
    public boolean setOutsideTouchable(boolean p0, android.widget.PopupWindow.OnDismissListener p1) { return false; }
    public void setSuggestedWidth(int p0) {}
    public void setWidthChanged(boolean p0) {}
    public void show(java.util.List<android.view.MenuItem> p0, android.view.MenuItem.OnMenuItemClickListener p1, android.graphics.Rect p2) {}

    private static class SelectionToolbarCallbackImpl extends android.view.selectiontoolbar.ISelectionToolbarCallback.Stub {
        private final java.lang.ref.WeakReference<com.android.internal.widget.floatingtoolbar.RemoteFloatingToolbarPopup> mRemotePopup = null;
        SelectionToolbarCallbackImpl(com.android.internal.widget.floatingtoolbar.RemoteFloatingToolbarPopup p0) { super(); }
        public void onInvisible() {}
        public void onMenuItemClicked(int p0) {}
        public void onShown(android.view.selectiontoolbar.WidgetInfo p0) {}
        public void onUpdated(android.view.selectiontoolbar.WidgetInfo p0) {}
    }
}
