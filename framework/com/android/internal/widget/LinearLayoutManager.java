package com.android.internal.widget;

public class LinearLayoutManager extends com.android.internal.widget.RecyclerView.LayoutManager implements com.android.internal.widget.helper.ItemTouchHelper.ViewDropHandler, com.android.internal.widget.RecyclerView.SmoothScroller.ScrollVectorProvider {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = -2147483648;
    private static final float MAX_SCROLL_FACTOR = 0.3333333432674408f;
    private static final java.lang.String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final com.android.internal.widget.LinearLayoutManager.AnchorInfo mAnchorInfo = null;
    private int mInitialItemPrefetchCount;
    private boolean mLastStackFromEnd;
    private final com.android.internal.widget.LinearLayoutManager.LayoutChunkResult mLayoutChunkResult = null;
    private com.android.internal.widget.LinearLayoutManager.LayoutState mLayoutState;
    int mOrientation;
    com.android.internal.widget.OrientationHelper mOrientationHelper;
    com.android.internal.widget.LinearLayoutManager.SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;
    public LinearLayoutManager(android.content.Context p0) { super(); }
    public LinearLayoutManager(android.content.Context p0, int p1, boolean p2) { super(); }
    public LinearLayoutManager(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super(); }
    private int computeScrollExtent(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    private int computeScrollOffset(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    private int computeScrollRange(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    private android.view.View findFirstReferenceChild(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return null; }
    private android.view.View findFirstVisibleChildClosestToEnd(boolean p0, boolean p1) { return null; }
    private android.view.View findFirstVisibleChildClosestToStart(boolean p0, boolean p1) { return null; }
    private android.view.View findLastReferenceChild(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return null; }
    private android.view.View findReferenceChildClosestToEnd(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return null; }
    private android.view.View findReferenceChildClosestToStart(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return null; }
    private int fixLayoutEndGap(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2, boolean p3) { return 0; }
    private int fixLayoutStartGap(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2, boolean p3) { return 0; }
    private android.view.View getChildClosestToEnd() { return null; }
    private android.view.View getChildClosestToStart() { return null; }
    private void layoutForPredictiveAnimations(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, int p2, int p3) {}
    private void logChildren() {}
    private void recycleByLayoutState(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.LinearLayoutManager.LayoutState p1) {}
    private void recycleChildren(com.android.internal.widget.RecyclerView.Recycler p0, int p1, int p2) {}
    private void recycleViewsFromEnd(com.android.internal.widget.RecyclerView.Recycler p0, int p1) {}
    private void recycleViewsFromStart(com.android.internal.widget.RecyclerView.Recycler p0, int p1) {}
    private void resolveShouldLayoutReverse() {}
    private boolean updateAnchorFromChildren(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, com.android.internal.widget.LinearLayoutManager.AnchorInfo p2) { return false; }
    private boolean updateAnchorFromPendingData(com.android.internal.widget.RecyclerView.State p0, com.android.internal.widget.LinearLayoutManager.AnchorInfo p1) { return false; }
    private void updateAnchorInfoForLayout(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, com.android.internal.widget.LinearLayoutManager.AnchorInfo p2) {}
    private void updateLayoutState(int p0, int p1, boolean p2, com.android.internal.widget.RecyclerView.State p3) {}
    private void updateLayoutStateToFillEnd(int p0, int p1) {}
    private void updateLayoutStateToFillEnd(com.android.internal.widget.LinearLayoutManager.AnchorInfo p0) {}
    private void updateLayoutStateToFillStart(int p0, int p1) {}
    private void updateLayoutStateToFillStart(com.android.internal.widget.LinearLayoutManager.AnchorInfo p0) {}
    public void assertNotInLayoutOrScroll(java.lang.String p0) {}
    public boolean canScrollHorizontally() { return false; }
    public boolean canScrollVertically() { return false; }
    public void collectAdjacentPrefetchPositions(int p0, int p1, com.android.internal.widget.RecyclerView.State p2, com.android.internal.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry p3) {}
    public void collectInitialPrefetchPositions(int p0, com.android.internal.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry p1) {}
    void collectPrefetchPositionsForLayoutState(com.android.internal.widget.RecyclerView.State p0, com.android.internal.widget.LinearLayoutManager.LayoutState p1, com.android.internal.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry p2) {}
    public int computeHorizontalScrollExtent(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    public int computeHorizontalScrollOffset(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    public int computeHorizontalScrollRange(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    public android.graphics.PointF computeScrollVectorForPosition(int p0) { return null; }
    public int computeVerticalScrollExtent(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    public int computeVerticalScrollOffset(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    public int computeVerticalScrollRange(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    int convertFocusDirectionToLayoutDirection(int p0) { return 0; }
    com.android.internal.widget.LinearLayoutManager.LayoutState createLayoutState() { return null; }
    void ensureLayoutState() {}
    int fill(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.LinearLayoutManager.LayoutState p1, com.android.internal.widget.RecyclerView.State p2, boolean p3) { return 0; }
    public int findFirstCompletelyVisibleItemPosition() { return 0; }
    public int findFirstVisibleItemPosition() { return 0; }
    public int findLastCompletelyVisibleItemPosition() { return 0; }
    public int findLastVisibleItemPosition() { return 0; }
    android.view.View findOneVisibleChild(int p0, int p1, boolean p2, boolean p3) { return null; }
    android.view.View findReferenceChild(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, int p2, int p3, int p4) { return null; }
    public android.view.View findViewByPosition(int p0) { return null; }
    public com.android.internal.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() { return null; }
    protected int getExtraLayoutSpace(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    public int getInitialItemPrefetchCount() { return 0; }
    public int getOrientation() { return 0; }
    public boolean getRecycleChildrenOnDetach() { return false; }
    public boolean getReverseLayout() { return false; }
    public boolean getStackFromEnd() { return false; }
    protected boolean isLayoutRTL() { return false; }
    public boolean isSmoothScrollbarEnabled() { return false; }
    void layoutChunk(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, com.android.internal.widget.LinearLayoutManager.LayoutState p2, com.android.internal.widget.LinearLayoutManager.LayoutChunkResult p3) {}
    void onAnchorReady(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, com.android.internal.widget.LinearLayoutManager.AnchorInfo p2, int p3) {}
    public void onDetachedFromWindow(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
    public android.view.View onFocusSearchFailed(android.view.View p0, int p1, com.android.internal.widget.RecyclerView.Recycler p2, com.android.internal.widget.RecyclerView.State p3) { return null; }
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public void onLayoutChildren(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) {}
    public void onLayoutCompleted(com.android.internal.widget.RecyclerView.State p0) {}
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void prepareForDrop(android.view.View p0, android.view.View p1, int p2, int p3) {}
    boolean resolveIsInfinite() { return false; }
    int scrollBy(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2) { return 0; }
    public int scrollHorizontallyBy(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2) { return 0; }
    public void scrollToPosition(int p0) {}
    public void scrollToPositionWithOffset(int p0, int p1) {}
    public int scrollVerticallyBy(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2) { return 0; }
    public void setInitialPrefetchItemCount(int p0) {}
    public void setOrientation(int p0) {}
    public void setRecycleChildrenOnDetach(boolean p0) {}
    public void setReverseLayout(boolean p0) {}
    public void setSmoothScrollbarEnabled(boolean p0) {}
    public void setStackFromEnd(boolean p0) {}
    boolean shouldMeasureTwice() { return false; }
    public void smoothScrollToPosition(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.State p1, int p2) {}
    public boolean supportsPredictiveItemAnimations() { return false; }
    void validateChildOrder() {}

    class AnchorInfo {
        int mCoordinate;
        boolean mLayoutFromEnd;
        int mPosition;
        boolean mValid;
        AnchorInfo(com.android.internal.widget.LinearLayoutManager p0) {}
        void assignCoordinateFromPadding() {}
        public void assignFromView(android.view.View p0) {}
        public void assignFromViewAndKeepVisibleRect(android.view.View p0) {}
        boolean isViewValidAsAnchor(android.view.View p0, com.android.internal.widget.RecyclerView.State p1) { return false; }
        void reset() {}
        public java.lang.String toString() { return null; }
    }

    protected static class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;
        protected LayoutChunkResult() {}
        void resetInternal() {}
    }

    static class LayoutState {
        static final int INVALID_LAYOUT = -2147483648;
        static final int ITEM_DIRECTION_HEAD = -1;
        static final int ITEM_DIRECTION_TAIL = 1;
        static final int LAYOUT_END = 1;
        static final int LAYOUT_START = -1;
        static final int SCROLLING_OFFSET_NaN = -2147483648;
        static final java.lang.String TAG = "LLM#LayoutState";
        int mAvailable;
        int mCurrentPosition;
        int mExtra;
        boolean mInfinite;
        boolean mIsPreLayout;
        int mItemDirection;
        int mLastScrollDelta;
        int mLayoutDirection;
        int mOffset;
        boolean mRecycle;
        java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> mScrapList;
        int mScrollingOffset;
        LayoutState() {}
        private android.view.View nextViewFromScrapList() { return null; }
        public void assignPositionFromScrapList() {}
        public void assignPositionFromScrapList(android.view.View p0) {}
        boolean hasMore(com.android.internal.widget.RecyclerView.State p0) { return false; }
        void log() {}
        android.view.View next(com.android.internal.widget.RecyclerView.Recycler p0) { return null; }
        public android.view.View nextViewInLimitedList(android.view.View p0) { return null; }
    }

    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.android.internal.widget.LinearLayoutManager.SavedState> CREATOR = null;
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;
        public SavedState() {}
        SavedState(android.os.Parcel p0) {}
        public SavedState(com.android.internal.widget.LinearLayoutManager.SavedState p0) {}
        public int describeContents() { return 0; }
        boolean hasValidAnchor() { return false; }
        void invalidateAnchor() {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
