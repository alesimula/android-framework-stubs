package com.android.internal.widget;

final class GapWorker implements java.lang.Runnable {
    static final java.lang.ThreadLocal<com.android.internal.widget.GapWorker> sGapWorker = null;
    static java.util.Comparator<com.android.internal.widget.GapWorker.Task> sTaskComparator;
    long mFrameIntervalNs;
    long mPostTimeNs;
    java.util.ArrayList<com.android.internal.widget.RecyclerView> mRecyclerViews;
    private java.util.ArrayList<com.android.internal.widget.GapWorker.Task> mTasks;
    GapWorker() {}
    private void buildTaskList() {}
    private void flushTaskWithDeadline(com.android.internal.widget.GapWorker.Task p0, long p1) {}
    private void flushTasksWithDeadline(long p0) {}
    static boolean isPrefetchPositionAttached(com.android.internal.widget.RecyclerView p0, int p1) { return false; }
    private void prefetchInnerRecyclerViewWithDeadline(com.android.internal.widget.RecyclerView p0, long p1) {}
    private com.android.internal.widget.RecyclerView.ViewHolder prefetchPositionWithDeadline(com.android.internal.widget.RecyclerView p0, int p1, long p2) { return null; }
    public void add(com.android.internal.widget.RecyclerView p0) {}
    void postFromTraversal(com.android.internal.widget.RecyclerView p0, int p1, int p2) {}
    void prefetch(long p0) {}
    public void remove(com.android.internal.widget.RecyclerView p0) {}
    public void run() {}

    static class LayoutPrefetchRegistryImpl implements com.android.internal.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry {
        int mCount;
        int[] mPrefetchArray;
        int mPrefetchDx;
        int mPrefetchDy;
        LayoutPrefetchRegistryImpl() {}
        public void addPosition(int p0, int p1) {}
        void clearPrefetchPositions() {}
        void collectPrefetchPositionsFromView(com.android.internal.widget.RecyclerView p0, boolean p1) {}
        boolean lastPrefetchIncludedPosition(int p0) { return false; }
        void setPrefetchVector(int p0, int p1) {}
    }

    static class Task {
        public int distanceToItem;
        public boolean immediate;
        public int position;
        public com.android.internal.widget.RecyclerView view;
        public int viewVelocity;
        Task() {}
        public void clear() {}
    }
}
