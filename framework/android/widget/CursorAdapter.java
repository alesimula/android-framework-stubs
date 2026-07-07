package android.widget;

public abstract class CursorAdapter extends android.widget.BaseAdapter implements android.widget.Filterable, android.widget.CursorFilter.CursorFilterClient, android.widget.ThemedSpinnerAdapter {
    @java.lang.Deprecated
    public static final int FLAG_AUTO_REQUERY = 1;
    public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
    protected boolean mAutoRequery;
    protected android.widget.CursorAdapter.ChangeObserver mChangeObserver;
    protected android.content.Context mContext;
    protected android.database.Cursor mCursor;
    protected android.widget.CursorFilter mCursorFilter;
    protected android.database.DataSetObserver mDataSetObserver;
    protected boolean mDataValid;
    protected android.content.Context mDropDownContext;
    protected android.widget.FilterQueryProvider mFilterQueryProvider;
    protected int mRowIDColumn;
    @java.lang.Deprecated
    public CursorAdapter(android.content.Context p0, android.database.Cursor p1) { super(); }
    public CursorAdapter(android.content.Context p0, android.database.Cursor p1, int p2) { super(); }
    public CursorAdapter(android.content.Context p0, android.database.Cursor p1, boolean p2) { super(); }
    public abstract void bindView(android.view.View p0, android.content.Context p1, android.database.Cursor p2);
    public void changeCursor(android.database.Cursor p0) {}
    public java.lang.CharSequence convertToString(android.database.Cursor p0) { return null; }
    public int getCount() { return 0; }
    public android.database.Cursor getCursor() { return null; }
    public android.view.View getDropDownView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public android.content.res.Resources.Theme getDropDownViewTheme() { return null; }
    public android.widget.Filter getFilter() { return null; }
    public android.widget.FilterQueryProvider getFilterQueryProvider() { return null; }
    public java.lang.Object getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public boolean hasStableIds() { return false; }
    void init(android.content.Context p0, android.database.Cursor p1, int p2) {}
    @java.lang.Deprecated
    protected void init(android.content.Context p0, android.database.Cursor p1, boolean p2) {}
    public android.view.View newDropDownView(android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2) { return null; }
    public abstract android.view.View newView(android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2);
    protected void onContentChanged() {}
    public android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence p0) { return null; }
    public void setDropDownViewTheme(android.content.res.Resources.Theme p0) {}
    public void setFilterQueryProvider(android.widget.FilterQueryProvider p0) {}
    public android.database.Cursor swapCursor(android.database.Cursor p0) { return null; }

    private class ChangeObserver extends android.database.ContentObserver {
        public ChangeObserver(android.widget.CursorAdapter p0) { super((android.os.Handler)null); }
        public boolean deliverSelfNotifications() { return false; }
        public void onChange(boolean p0) {}
    }

    private class MyDataSetObserver extends android.database.DataSetObserver {
        private MyDataSetObserver(android.widget.CursorAdapter p0) { super(); }
        public void onChanged() {}
        public void onInvalidated() {}
    }
}
