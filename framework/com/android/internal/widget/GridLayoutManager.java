package com.android.internal.widget;

public class GridLayoutManager extends com.android.internal.widget.LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final java.lang.String TAG = "GridLayoutManager";
    int[] mCachedBorders;
    final android.graphics.Rect mDecorInsets = null;
    boolean mPendingSpanCountChange;
    final android.util.SparseIntArray mPreLayoutSpanIndexCache = null;
    final android.util.SparseIntArray mPreLayoutSpanSizeCache = null;
    android.view.View[] mSet;
    int mSpanCount;
    com.android.internal.widget.GridLayoutManager.SpanSizeLookup mSpanSizeLookup;
    public GridLayoutManager(android.content.Context p0, int p1) { super((android.content.Context)null); }
    public GridLayoutManager(android.content.Context p0, int p1, int p2, boolean p3) { super((android.content.Context)null); }
    public GridLayoutManager(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void assignSpans(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, int p2, int p3, boolean p4) {}
    private void cachePreLayoutSpanMapping() {}
    private void calculateItemBorders(int p0) {}
    static int[] calculateItemBorders(int[] p0, int p1, int p2) { return null; }
    private void clearPreLayoutSpanMappingCache() {}
    private void ensureAnchorIsInCorrectSpan(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, com.android.internal.widget.LinearLayoutManager.AnchorInfo p2, int p3) {}
    private void ensureViewSet() {}
    private int getSpanGroupIndex(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, int p2) { return 0; }
    private int getSpanIndex(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, int p2) { return 0; }
    private int getSpanSize(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, int p2) { return 0; }
    private void guessMeasurement(float p0, int p1) {}
    private void measureChild(android.view.View p0, int p1, boolean p2) {}
    private void measureChildWithDecorationsAndMargin(android.view.View p0, int p1, int p2, boolean p3) {}
    private void updateMeasurements() {}
    public boolean checkLayoutParams(com.android.internal.widget.RecyclerView.LayoutParams p0) { return false; }
    void collectPrefetchPositionsForLayoutState(com.android.internal.widget.RecyclerView.State p0, com.android.internal.widget.LinearLayoutManager.LayoutState p1, com.android.internal.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry p2) {}
    android.view.View findReferenceChild(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, int p2, int p3, int p4) { return null; }
    public com.android.internal.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() { return null; }
    public com.android.internal.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context p0, android.util.AttributeSet p1) { return null; }
    public com.android.internal.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public int getColumnCountForAccessibility(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return 0; }
    public int getRowCountForAccessibility(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return 0; }
    int getSpaceForSpanRange(int p0, int p1) { return 0; }
    public int getSpanCount() { return 0; }
    public com.android.internal.widget.GridLayoutManager.SpanSizeLookup getSpanSizeLookup() { return null; }
    void layoutChunk(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, com.android.internal.widget.LinearLayoutManager.LayoutState p2, com.android.internal.widget.LinearLayoutManager.LayoutChunkResult p3) {}
    void onAnchorReady(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, com.android.internal.widget.LinearLayoutManager.AnchorInfo p2, int p3) {}
    public void onInitializeAccessibilityNodeInfoForItem(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, android.view.View p2, android.view.accessibility.AccessibilityNodeInfo p3) {}
    public void onItemsAdded(com.android.internal.widget.RecyclerView p0, int p1, int p2) {}
    public void onItemsChanged(com.android.internal.widget.RecyclerView p0) {}
    public void onItemsMoved(com.android.internal.widget.RecyclerView p0, int p1, int p2, int p3) {}
    public void onItemsRemoved(com.android.internal.widget.RecyclerView p0, int p1, int p2) {}
    public void onItemsUpdated(com.android.internal.widget.RecyclerView p0, int p1, int p2, java.lang.Object p3) {}
    public void onLayoutChildren(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) {}
    public void onLayoutCompleted(com.android.internal.widget.RecyclerView.State p0) {}
    public int scrollHorizontallyBy(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2) { return 0; }
    public int scrollVerticallyBy(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2) { return 0; }
    public void setMeasuredDimension(android.graphics.Rect p0, int p1, int p2) {}
    public void setSpanCount(int p0) {}
    public void setSpanSizeLookup(com.android.internal.widget.GridLayoutManager.SpanSizeLookup p0) {}
    public void setStackFromEnd(boolean p0) {}
    public boolean supportsPredictiveItemAnimations() { return false; }

    public static final class DefaultSpanSizeLookup extends com.android.internal.widget.GridLayoutManager.SpanSizeLookup {
        public DefaultSpanSizeLookup() { super(); }
        public int getSpanIndex(int p0, int p1) { return 0; }
        public int getSpanSize(int p0) { return 0; }
    }

    public static class LayoutParams extends com.android.internal.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        int mSpanIndex;
        int mSpanSize;
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(com.android.internal.widget.RecyclerView.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public int getSpanIndex() { return 0; }
        public int getSpanSize() { return 0; }
    }

    public static abstract class SpanSizeLookup {
        private boolean mCacheSpanIndices;
        final android.util.SparseIntArray mSpanIndexCache = null;
        public SpanSizeLookup() {}
        int findReferenceIndexFromCache(int p0) { return 0; }
        int getCachedSpanIndex(int p0, int p1) { return 0; }
        public int getSpanGroupIndex(int p0, int p1) { return 0; }
        public int getSpanIndex(int p0, int p1) { return 0; }
        public abstract int getSpanSize(int p0);
        public void invalidateSpanIndexCache() {}
        public boolean isSpanIndexCacheEnabled() { return false; }
        public void setSpanIndexCacheEnabled(boolean p0) {}
    }
}
