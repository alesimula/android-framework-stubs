package android.widget;

class ExpandableListConnector extends android.widget.BaseAdapter implements android.widget.Filterable {
    private final android.database.DataSetObserver mDataSetObserver = null;
    private java.util.ArrayList<android.widget.ExpandableListConnector.GroupMetadata> mExpGroupMetadataList;
    private android.widget.ExpandableListAdapter mExpandableListAdapter;
    private int mMaxExpGroupCount;
    private int mTotalExpChildrenCount;
    public ExpandableListConnector(android.widget.ExpandableListAdapter p0) { super(); }
    private void refreshExpGroupMetadataList(boolean p0, boolean p1) {}
    public boolean areAllItemsEnabled() { return false; }
    boolean collapseGroup(int p0) { return false; }
    boolean collapseGroup(android.widget.ExpandableListConnector.PositionMetadata p0) { return false; }
    boolean expandGroup(int p0) { return false; }
    boolean expandGroup(android.widget.ExpandableListConnector.PositionMetadata p0) { return false; }
    int findGroupPosition(long p0, int p1) { return 0; }
    android.widget.ExpandableListAdapter getAdapter() { return null; }
    public int getCount() { return 0; }
    java.util.ArrayList<android.widget.ExpandableListConnector.GroupMetadata> getExpandedGroupMetadataList() { return null; }
    public android.widget.Filter getFilter() { return null; }
    android.widget.ExpandableListConnector.PositionMetadata getFlattenedPos(android.widget.ExpandableListPosition p0) { return null; }
    public java.lang.Object getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public int getItemViewType(int p0) { return 0; }
    android.widget.ExpandableListConnector.PositionMetadata getUnflattenedPos(int p0) { return null; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public int getViewTypeCount() { return 0; }
    public boolean hasStableIds() { return false; }
    public boolean isEmpty() { return false; }
    public boolean isEnabled(int p0) { return false; }
    public boolean isGroupExpanded(int p0) { return false; }
    public void setExpandableListAdapter(android.widget.ExpandableListAdapter p0) {}
    void setExpandedGroupMetadataList(java.util.ArrayList<android.widget.ExpandableListConnector.GroupMetadata> p0) {}
    public void setMaxExpGroupCount(int p0) {}

    static class GroupMetadata implements android.os.Parcelable, java.lang.Comparable<android.widget.ExpandableListConnector.GroupMetadata> {
        public static final android.os.Parcelable.Creator<android.widget.ExpandableListConnector.GroupMetadata> CREATOR = null;
        static final int REFRESH = -1;
        int flPos;
        long gId;
        int gPos;
        int lastChildFlPos;
        private GroupMetadata() {}
        static android.widget.ExpandableListConnector.GroupMetadata obtain(int p0, int p1, int p2, long p3) { return null; }
        public int compareTo(android.widget.ExpandableListConnector.GroupMetadata p0) { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    protected class MyDataSetObserver extends android.database.DataSetObserver {
        protected MyDataSetObserver(android.widget.ExpandableListConnector p0) { super(); }
        public void onChanged() {}
        public void onInvalidated() {}
    }

    public static class PositionMetadata {
        private static final int MAX_POOL_SIZE = 5;
        private static java.util.ArrayList<android.widget.ExpandableListConnector.PositionMetadata> sPool;
        public int groupInsertIndex;
        public android.widget.ExpandableListConnector.GroupMetadata groupMetadata;
        public android.widget.ExpandableListPosition position;
        private PositionMetadata() {}
        private static android.widget.ExpandableListConnector.PositionMetadata getRecycledOrCreate() { return null; }
        static android.widget.ExpandableListConnector.PositionMetadata obtain(int p0, int p1, int p2, int p3, android.widget.ExpandableListConnector.GroupMetadata p4, int p5) { return null; }
        private void resetState() {}
        public boolean isExpanded() { return false; }
        public void recycle() {}
    }
}
