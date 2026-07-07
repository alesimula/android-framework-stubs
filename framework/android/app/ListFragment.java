package android.app;

@java.lang.Deprecated
public class ListFragment extends android.app.Fragment {
    android.widget.ListAdapter mAdapter;
    java.lang.CharSequence mEmptyText;
    android.view.View mEmptyView;
    private final android.os.Handler mHandler = null;
    android.widget.ListView mList;
    android.view.View mListContainer;
    boolean mListShown;
    private final android.widget.AdapterView.OnItemClickListener mOnClickListener = null;
    android.view.View mProgressContainer;
    private final java.lang.Runnable mRequestFocus = null;
    android.widget.TextView mStandardEmptyView;
    public ListFragment() { super(); }
    private void ensureList() {}
    private void setListShown(boolean p0, boolean p1) {}
    public android.widget.ListAdapter getListAdapter() { return null; }
    public android.widget.ListView getListView() { return null; }
    public long getSelectedItemId() { return 0L; }
    public int getSelectedItemPosition() { return 0; }
    public android.view.View onCreateView(android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2) { return null; }
    public void onDestroyView() {}
    public void onListItemClick(android.widget.ListView p0, android.view.View p1, int p2, long p3) {}
    public void onViewCreated(android.view.View p0, android.os.Bundle p1) {}
    public void setEmptyText(java.lang.CharSequence p0) {}
    public void setListAdapter(android.widget.ListAdapter p0) {}
    public void setListShown(boolean p0) {}
    public void setListShownNoAnimation(boolean p0) {}
    public void setSelection(int p0) {}
}
