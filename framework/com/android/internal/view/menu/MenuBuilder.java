package com.android.internal.view.menu;

public class MenuBuilder implements android.view.Menu {
    private static final java.lang.String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final java.lang.String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final java.lang.String PRESENTER_KEY = "android:menu:presenters";
    private static final java.lang.String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = null;
    private java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> mActionItems;
    private com.android.internal.view.menu.MenuBuilder.Callback mCallback;
    private final android.content.Context mContext = null;
    private android.view.ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private int mDefaultShowAsAction;
    private com.android.internal.view.menu.MenuItemImpl mExpandedItem;
    private android.util.SparseArray<android.os.Parcelable> mFrozenViewStates;
    private boolean mGroupDividerEnabled;
    android.graphics.drawable.Drawable mHeaderIcon;
    java.lang.CharSequence mHeaderTitle;
    android.view.View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing;
    private boolean mIsVisibleItemsStale;
    private java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> mItems;
    private boolean mItemsChangedWhileDispatchPrevented;
    private java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> mNonActionItems;
    private boolean mOptionalIconsVisible;
    private java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.android.internal.view.menu.MenuPresenter>> mPresenters;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mQwertyMode;
    private final android.content.res.Resources mResources = null;
    private boolean mShortcutsVisible;
    private java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> mTempShortcutItemList;
    private java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> mVisibleItems;
    public MenuBuilder(android.content.Context p0) {}
    private android.view.MenuItem addInternal(int p0, int p1, int p2, java.lang.CharSequence p3) { return null; }
    private com.android.internal.view.menu.MenuItemImpl createNewMenuItem(int p0, int p1, int p2, int p3, java.lang.CharSequence p4, int p5) { return null; }
    private void dispatchPresenterUpdate(boolean p0) {}
    private void dispatchRestoreInstanceState(android.os.Bundle p0) {}
    private void dispatchSaveInstanceState(android.os.Bundle p0) {}
    private boolean dispatchSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0, com.android.internal.view.menu.MenuPresenter p1) { return false; }
    private static int findInsertIndex(java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> p0, int p1) { return 0; }
    private static int getOrdering(int p0) { return 0; }
    private void removeItemAtInt(int p0, boolean p1) {}
    private void setHeaderInternal(int p0, java.lang.CharSequence p1, int p2, android.graphics.drawable.Drawable p3, android.view.View p4) {}
    private void setShortcutsVisibleInner(boolean p0) {}
    public android.view.MenuItem add(int p0) { return null; }
    public android.view.MenuItem add(int p0, int p1, int p2, int p3) { return null; }
    public android.view.MenuItem add(int p0, int p1, int p2, java.lang.CharSequence p3) { return null; }
    public android.view.MenuItem add(java.lang.CharSequence p0) { return null; }
    public int addIntentOptions(int p0, int p1, int p2, android.content.ComponentName p3, android.content.Intent[] p4, android.content.Intent p5, int p6, android.view.MenuItem[] p7) { return 0; }
    public void addMenuPresenter(com.android.internal.view.menu.MenuPresenter p0) {}
    public void addMenuPresenter(com.android.internal.view.menu.MenuPresenter p0, android.content.Context p1) {}
    public android.view.SubMenu addSubMenu(int p0) { return null; }
    public android.view.SubMenu addSubMenu(int p0, int p1, int p2, int p3) { return null; }
    public android.view.SubMenu addSubMenu(int p0, int p1, int p2, java.lang.CharSequence p3) { return null; }
    public android.view.SubMenu addSubMenu(java.lang.CharSequence p0) { return null; }
    public void changeMenuMode() {}
    public void clear() {}
    public void clearAll() {}
    public void clearHeader() {}
    public void close() {}
    public final void close(boolean p0) {}
    public boolean collapseItemActionView(com.android.internal.view.menu.MenuItemImpl p0) { return false; }
    boolean dispatchMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) { return false; }
    public boolean expandItemActionView(com.android.internal.view.menu.MenuItemImpl p0) { return false; }
    public int findGroupIndex(int p0) { return 0; }
    public int findGroupIndex(int p0, int p1) { return 0; }
    public android.view.MenuItem findItem(int p0) { return null; }
    public int findItemIndex(int p0) { return 0; }
    com.android.internal.view.menu.MenuItemImpl findItemWithShortcutForKey(int p0, android.view.KeyEvent p1) { return null; }
    void findItemsWithShortcutForKey(java.util.List<com.android.internal.view.menu.MenuItemImpl> p0, int p1, android.view.KeyEvent p2) {}
    public void flagActionItems() {}
    public java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> getActionItems() { return null; }
    protected java.lang.String getActionViewStatesKey() { return null; }
    public android.content.Context getContext() { return null; }
    public com.android.internal.view.menu.MenuItemImpl getExpandedItem() { return null; }
    public android.graphics.drawable.Drawable getHeaderIcon() { return null; }
    public java.lang.CharSequence getHeaderTitle() { return null; }
    public android.view.View getHeaderView() { return null; }
    public android.view.MenuItem getItem(int p0) { return null; }
    public java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> getNonActionItems() { return null; }
    boolean getOptionalIconsVisible() { return false; }
    android.content.res.Resources getResources() { return null; }
    public com.android.internal.view.menu.MenuBuilder getRootMenu() { return null; }
    public java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> getVisibleItems() { return null; }
    public boolean hasVisibleItems() { return false; }
    public boolean isGroupDividerEnabled() { return false; }
    boolean isQwertyMode() { return false; }
    public boolean isShortcutKey(int p0, android.view.KeyEvent p1) { return false; }
    public boolean isShortcutsVisible() { return false; }
    void onItemActionRequestChanged(com.android.internal.view.menu.MenuItemImpl p0) {}
    void onItemVisibleChanged(com.android.internal.view.menu.MenuItemImpl p0) {}
    public void onItemsChanged(boolean p0) {}
    public boolean performIdentifierAction(int p0, int p1) { return false; }
    public boolean performItemAction(android.view.MenuItem p0, int p1) { return false; }
    public boolean performItemAction(android.view.MenuItem p0, com.android.internal.view.menu.MenuPresenter p1, int p2) { return false; }
    public boolean performShortcut(int p0, android.view.KeyEvent p1, int p2) { return false; }
    public void removeGroup(int p0) {}
    public void removeItem(int p0) {}
    public void removeItemAt(int p0) {}
    public void removeMenuPresenter(com.android.internal.view.menu.MenuPresenter p0) {}
    public void restoreActionViewStates(android.os.Bundle p0) {}
    public void restorePresenterStates(android.os.Bundle p0) {}
    public void saveActionViewStates(android.os.Bundle p0) {}
    public void savePresenterStates(android.os.Bundle p0) {}
    public void setCallback(com.android.internal.view.menu.MenuBuilder.Callback p0) {}
    public void setCurrentMenuInfo(android.view.ContextMenu.ContextMenuInfo p0) {}
    public com.android.internal.view.menu.MenuBuilder setDefaultShowAsAction(int p0) { return null; }
    void setExclusiveItemChecked(android.view.MenuItem p0) {}
    public void setGroupCheckable(int p0, boolean p1, boolean p2) {}
    public void setGroupDividerEnabled(boolean p0) {}
    public void setGroupEnabled(int p0, boolean p1) {}
    public void setGroupVisible(int p0, boolean p1) {}
    protected com.android.internal.view.menu.MenuBuilder setHeaderIconInt(int p0) { return null; }
    protected com.android.internal.view.menu.MenuBuilder setHeaderIconInt(android.graphics.drawable.Drawable p0) { return null; }
    protected com.android.internal.view.menu.MenuBuilder setHeaderTitleInt(int p0) { return null; }
    protected com.android.internal.view.menu.MenuBuilder setHeaderTitleInt(java.lang.CharSequence p0) { return null; }
    protected com.android.internal.view.menu.MenuBuilder setHeaderViewInt(android.view.View p0) { return null; }
    public void setOptionalIconsVisible(boolean p0) {}
    public void setQwertyMode(boolean p0) {}
    public void setShortcutsVisible(boolean p0) {}
    public int size() { return 0; }
    public void startDispatchingItemsChanged() {}
    public void stopDispatchingItemsChanged() {}

    public static interface Callback {
        public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1);
        public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder p0);
    }

    public static interface ItemInvoker {
        public boolean invokeItem(com.android.internal.view.menu.MenuItemImpl p0);
    }
}
