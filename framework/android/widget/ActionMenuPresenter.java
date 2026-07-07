package android.widget;

public class ActionMenuPresenter extends com.android.internal.view.menu.BaseMenuPresenter implements android.view.ActionProvider.SubUiVisibilityListener {
    private static final boolean ACTIONBAR_ANIMATIONS_ENABLED = false;
    private static final int ITEM_ANIMATION_DURATION = 150;
    private final android.util.SparseBooleanArray mActionButtonGroups = null;
    private android.widget.ActionMenuPresenter.ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private android.view.View.OnAttachStateChangeListener mAttachStateChangeListener;
    private boolean mExpandedActionViewsExclusive;
    private android.view.ViewTreeObserver.OnPreDrawListener mItemAnimationPreDrawListener;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    int mOpenSubMenuId;
    private android.widget.ActionMenuPresenter.OverflowMenuButton mOverflowButton;
    private android.widget.ActionMenuPresenter.OverflowPopup mOverflowPopup;
    private android.graphics.drawable.Drawable mPendingOverflowIcon;
    private boolean mPendingOverflowIconSet;
    private android.widget.ActionMenuPresenter.ActionMenuPopupCallback mPopupCallback;
    final android.widget.ActionMenuPresenter.PopupPresenterCallback mPopupPresenterCallback = null;
    private android.util.SparseArray<android.widget.ActionMenuPresenter.MenuItemLayoutInfo> mPostLayoutItems;
    private android.widget.ActionMenuPresenter.OpenOverflowRunnable mPostedOpenRunnable;
    private android.util.SparseArray<android.widget.ActionMenuPresenter.MenuItemLayoutInfo> mPreLayoutItems;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private java.util.List<android.widget.ActionMenuPresenter.ItemAnimationInfo> mRunningItemAnimations;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;
    public ActionMenuPresenter(android.content.Context p0) { super(null, 0, 0); }
    private void computeMenuItemAnimationInfo(boolean p0) {}
    private android.view.View findViewForItem(android.view.MenuItem p0) { return null; }
    private void runItemAnimations() {}
    private void setupItemAnimations() {}
    public void bindItemView(com.android.internal.view.menu.MenuItemImpl p0, com.android.internal.view.menu.MenuView.ItemView p1) {}
    public boolean dismissPopupMenus() { return false; }
    public boolean filterLeftoverView(android.view.ViewGroup p0, int p1) { return false; }
    public boolean flagActionItems() { return false; }
    public android.view.View getItemView(com.android.internal.view.menu.MenuItemImpl p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public com.android.internal.view.menu.MenuView getMenuView(android.view.ViewGroup p0) { return null; }
    public android.graphics.drawable.Drawable getOverflowIcon() { return null; }
    public boolean hideOverflowMenu() { return false; }
    public boolean hideSubMenus() { return false; }
    public void initForMenu(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1) {}
    public boolean isOverflowMenuShowPending() { return false; }
    public boolean isOverflowMenuShowing() { return false; }
    public boolean isOverflowReserved() { return false; }
    public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0) { return false; }
    public void onSubUiVisibilityChanged(boolean p0) {}
    public void setExpandedActionViewsExclusive(boolean p0) {}
    public void setItemLimit(int p0) {}
    public void setMenuView(android.widget.ActionMenuView p0) {}
    public void setOverflowIcon(android.graphics.drawable.Drawable p0) {}
    public void setReserveOverflow(boolean p0) {}
    public void setWidthLimit(int p0, boolean p1) {}
    public boolean shouldIncludeItem(int p0, com.android.internal.view.menu.MenuItemImpl p1) { return false; }
    public boolean showOverflowMenu() { return false; }
    public void updateMenuView(boolean p0) {}

    private class ActionButtonSubmenu extends com.android.internal.view.menu.MenuPopupHelper {
        public ActionButtonSubmenu(android.widget.ActionMenuPresenter p0, android.content.Context p1, com.android.internal.view.menu.SubMenuBuilder p2, android.view.View p3) { super((android.content.Context)null, (com.android.internal.view.menu.MenuBuilder)null); }
        protected void onDismiss() {}
    }

    private class ActionMenuPopupCallback extends com.android.internal.view.menu.ActionMenuItemView.PopupCallback {
        private ActionMenuPopupCallback(android.widget.ActionMenuPresenter p0) { super(); }
        public com.android.internal.view.menu.ShowableListMenu getPopup() { return null; }
    }

    private static class ItemAnimationInfo {
        static final int FADE_IN = 1;
        static final int FADE_OUT = 2;
        static final int MOVE = 0;
        int animType;
        android.animation.Animator animator;
        int id;
        android.widget.ActionMenuPresenter.MenuItemLayoutInfo menuItemLayoutInfo;
        ItemAnimationInfo(int p0, android.widget.ActionMenuPresenter.MenuItemLayoutInfo p1, android.animation.Animator p2, int p3) {}
    }

    private static class MenuItemLayoutInfo {
        int left;
        int top;
        android.view.View view;
        MenuItemLayoutInfo(android.view.View p0, boolean p1) {}
    }

    private class OpenOverflowRunnable implements java.lang.Runnable {
        private android.widget.ActionMenuPresenter.OverflowPopup mPopup;
        public OpenOverflowRunnable(android.widget.ActionMenuPresenter p0, android.widget.ActionMenuPresenter.OverflowPopup p1) {}
        public void run() {}
    }

    private class OverflowMenuButton extends android.widget.ImageButton implements android.widget.ActionMenuView.ActionMenuChildView {
        public OverflowMenuButton(android.widget.ActionMenuPresenter p0, android.content.Context p1) { super((android.content.Context)null); }
        public boolean needsDividerAfter() { return false; }
        public boolean needsDividerBefore() { return false; }
        public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
        public boolean performClick() { return false; }
        protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    }

    private class OverflowPopup extends com.android.internal.view.menu.MenuPopupHelper {
        public OverflowPopup(android.widget.ActionMenuPresenter p0, android.content.Context p1, com.android.internal.view.menu.MenuBuilder p2, android.view.View p3, boolean p4) { super((android.content.Context)null, (com.android.internal.view.menu.MenuBuilder)null); }
        protected void onDismiss() {}
    }

    private class PopupPresenterCallback implements com.android.internal.view.menu.MenuPresenter.Callback {
        private PopupPresenterCallback(android.widget.ActionMenuPresenter p0) {}
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
        public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0) { return false; }
    }

    private static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.widget.ActionMenuPresenter.SavedState> CREATOR = null;
        public int openSubMenuId;
        SavedState() {}
        SavedState(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
