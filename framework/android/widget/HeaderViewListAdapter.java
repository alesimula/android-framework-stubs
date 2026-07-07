package android.widget;

public class HeaderViewListAdapter implements android.widget.WrapperListAdapter, android.widget.Filterable {
    static final java.util.ArrayList<android.widget.ListView.FixedViewInfo> EMPTY_INFO_LIST = null;
    private final android.widget.ListAdapter mAdapter = null;
    boolean mAreAllFixedViewsSelectable;
    java.util.ArrayList<android.widget.ListView.FixedViewInfo> mFooterViewInfos;
    java.util.ArrayList<android.widget.ListView.FixedViewInfo> mHeaderViewInfos;
    private final boolean mIsFilterable = false;
    public HeaderViewListAdapter(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0, java.util.ArrayList<android.widget.ListView.FixedViewInfo> p1, android.widget.ListAdapter p2) {}
    private boolean areAllListInfosSelectable(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0) { return false; }
    public boolean areAllItemsEnabled() { return false; }
    public int getCount() { return 0; }
    public android.widget.Filter getFilter() { return null; }
    public int getFootersCount() { return 0; }
    public int getHeadersCount() { return 0; }
    public java.lang.Object getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public int getItemViewType(int p0) { return 0; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public int getViewTypeCount() { return 0; }
    public android.widget.ListAdapter getWrappedAdapter() { return null; }
    public boolean hasStableIds() { return false; }
    public boolean isEmpty() { return false; }
    public boolean isEnabled(int p0) { return false; }
    public void registerDataSetObserver(android.database.DataSetObserver p0) {}
    public boolean removeFooter(android.view.View p0) { return false; }
    public boolean removeHeader(android.view.View p0) { return false; }
    public void unregisterDataSetObserver(android.database.DataSetObserver p0) {}
}
