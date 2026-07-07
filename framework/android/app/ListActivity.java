package android.app;

@java.lang.Deprecated
public class ListActivity extends android.app.Activity {
    protected android.widget.ListAdapter mAdapter;
    private boolean mFinishedStart;
    private android.os.Handler mHandler;
    protected android.widget.ListView mList;
    private android.widget.AdapterView.OnItemClickListener mOnClickListener;
    private java.lang.Runnable mRequestFocus;
    public ListActivity() { super(); }
    private void ensureList() {}
    public android.widget.ListAdapter getListAdapter() { return null; }
    public android.widget.ListView getListView() { return null; }
    public long getSelectedItemId() { return 0L; }
    public int getSelectedItemPosition() { return 0; }
    public void onContentChanged() {}
    protected void onDestroy() {}
    protected void onListItemClick(android.widget.ListView p0, android.view.View p1, int p2, long p3) {}
    protected void onRestoreInstanceState(android.os.Bundle p0) {}
    public void setListAdapter(android.widget.ListAdapter p0) {}
    public void setSelection(int p0) {}
}
