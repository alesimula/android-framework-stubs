package com.android.internal.widget;

public interface DecorContentParent {
    public boolean canShowOverflowMenu();
    public void dismissPopups();
    public java.lang.CharSequence getTitle();
    public boolean hasIcon();
    public boolean hasLogo();
    public boolean hideOverflowMenu();
    public void initFeature(int p0);
    public boolean isOverflowMenuShowPending();
    public boolean isOverflowMenuShowing();
    public void notifyContentChanged();
    public void restoreToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> p0);
    public void saveToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> p0);
    public void setIcon(int p0);
    public void setIcon(android.graphics.drawable.Drawable p0);
    public void setLogo(int p0);
    public void setMenu(android.view.Menu p0, com.android.internal.view.menu.MenuPresenter.Callback p1);
    public void setMenuPrepared();
    public void setUiOptions(int p0);
    public void setWindowCallback(android.view.Window.Callback p0);
    public void setWindowTitle(java.lang.CharSequence p0);
    public boolean showOverflowMenu();
}
