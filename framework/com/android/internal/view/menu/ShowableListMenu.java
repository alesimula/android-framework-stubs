package com.android.internal.view.menu;

public interface ShowableListMenu {
    public void dismiss();
    public android.widget.ListView getListView();
    public boolean isShowing();
    public void show();
}
