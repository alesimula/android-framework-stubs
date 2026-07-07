package android.widget;

class RemoteCollectionItemsAdapter extends android.widget.BaseAdapter {
    private android.widget.RemoteViews.ColorResources mColorResources;
    private android.widget.RemoteViews.InteractionHandler mInteractionHandler;
    private android.widget.RemoteViews.RemoteCollectionItems mItems;
    private android.util.SparseIntArray mLayoutIdToViewType;
    private boolean mOnLightBackground;
    private float mOriginalDensity;
    private final int mViewTypeCount = 0;
    RemoteCollectionItemsAdapter(android.widget.RemoteViews.RemoteCollectionItems p0, android.widget.RemoteViews.InteractionHandler p1, android.widget.RemoteViews.ColorResources p2, boolean p3, float p4) { super(); }
    private void initLayoutIdToViewType() {}
    public int getCount() { return 0; }
    public android.widget.RemoteViews getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public int getItemViewType(int p0) { return 0; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public int getViewTypeCount() { return 0; }
    public boolean hasStableIds() { return false; }
    void setData(android.widget.RemoteViews.RemoteCollectionItems p0, android.widget.RemoteViews.InteractionHandler p1, android.widget.RemoteViews.ColorResources p2, boolean p3, float p4) {}
}
