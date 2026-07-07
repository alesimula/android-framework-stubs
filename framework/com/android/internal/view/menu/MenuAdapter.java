package com.android.internal.view.menu;

public class MenuAdapter extends android.widget.BaseAdapter {
    com.android.internal.view.menu.MenuBuilder mAdapterMenu;
    private int mExpandedIndex;
    private boolean mForceShowIcon;
    private final android.view.LayoutInflater mInflater = null;
    private final int mItemLayoutRes = 0;
    private final boolean mOverflowOnly = false;
    public MenuAdapter(com.android.internal.view.menu.MenuBuilder p0, android.view.LayoutInflater p1, boolean p2, int p3) { super(); }
    void findExpandedIndex() {}
    public com.android.internal.view.menu.MenuBuilder getAdapterMenu() { return null; }
    public int getCount() { return 0; }
    public boolean getForceShowIcon() { return false; }
    public com.android.internal.view.menu.MenuItemImpl getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public void notifyDataSetChanged() {}
    public void setForceShowIcon(boolean p0) {}
}
