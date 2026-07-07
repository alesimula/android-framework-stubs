package com.android.internal.widget;

public class AccountViewAdapter extends android.widget.BaseAdapter {
    private android.content.Context mContext;
    private java.util.List<com.android.internal.widget.AccountViewAdapter.AccountElements> mData;
    public AccountViewAdapter(android.content.Context p0, java.util.List<com.android.internal.widget.AccountViewAdapter.AccountElements> p1) { super(); }
    public int getCount() { return 0; }
    public java.lang.Object getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public void updateData(java.util.List<com.android.internal.widget.AccountViewAdapter.AccountElements> p0) {}

    public static class AccountElements {
        private android.graphics.drawable.Drawable mDrawable;
        private int mIcon;
        private java.lang.String mName;
        private java.lang.String mNumber;
        private AccountElements(int p0, android.graphics.drawable.Drawable p1, java.lang.String p2, java.lang.String p3) {}
        public AccountElements(int p0, java.lang.String p1, java.lang.String p2) {}
        public AccountElements(android.graphics.drawable.Drawable p0, java.lang.String p1, java.lang.String p2) {}
        public android.graphics.drawable.Drawable getDrawable() { return null; }
        public int getIcon() { return 0; }
        public java.lang.String getName() { return null; }
        public java.lang.String getNumber() { return null; }
    }
}
