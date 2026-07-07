package com.android.internal.view.menu;

public interface MenuPresenter {
    public boolean collapseItemActionView(com.android.internal.view.menu.MenuBuilder p0, com.android.internal.view.menu.MenuItemImpl p1);
    public boolean expandItemActionView(com.android.internal.view.menu.MenuBuilder p0, com.android.internal.view.menu.MenuItemImpl p1);
    public boolean flagActionItems();
    public int getId();
    public com.android.internal.view.menu.MenuView getMenuView(android.view.ViewGroup p0);
    public void initForMenu(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1);
    public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1);
    public void onRestoreInstanceState(android.os.Parcelable p0);
    public android.os.Parcelable onSaveInstanceState();
    public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0);
    public void setCallback(com.android.internal.view.menu.MenuPresenter.Callback p0);
    public void updateMenuView(boolean p0);

    public static interface Callback {
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1);
        public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0);
    }
}
