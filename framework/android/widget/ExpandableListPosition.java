package android.widget;

class ExpandableListPosition {
    public static final int CHILD = 1;
    public static final int GROUP = 2;
    private static final int MAX_POOL_SIZE = 5;
    private static java.util.ArrayList<android.widget.ExpandableListPosition> sPool;
    public int childPos;
    int flatListPos;
    public int groupPos;
    public int type;
    private ExpandableListPosition() {}
    private static android.widget.ExpandableListPosition getRecycledOrCreate() { return null; }
    static android.widget.ExpandableListPosition obtain(int p0, int p1, int p2, int p3) { return null; }
    static android.widget.ExpandableListPosition obtainChildPosition(int p0, int p1) { return null; }
    static android.widget.ExpandableListPosition obtainGroupPosition(int p0) { return null; }
    static android.widget.ExpandableListPosition obtainPosition(long p0) { return null; }
    private void resetState() {}
    long getPackedPosition() { return 0L; }
    public void recycle() {}
}
