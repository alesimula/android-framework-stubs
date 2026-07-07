package android.widget;

@android.widget.RemoteViews.RemoteView
public class ListView extends android.widget.AbsListView {
    private static final float MAX_SCROLL_FACTOR = 0.33000001311302185f;
    private static final int MIN_SCROLL_PREVIEW_PIXELS = 2;
    static final int NO_POSITION = -1;
    static final java.lang.String TAG = "ListView";
    private boolean mAreAllItemsSelectable;
    private final android.widget.ListView.ArrowScrollFocusResult mArrowScrollFocusResult = null;
    android.graphics.drawable.Drawable mDivider;
    int mDividerHeight;
    private boolean mDividerIsOpaque;
    private android.graphics.Paint mDividerPaint;
    private android.widget.ListView.FocusSelector mFocusSelector;
    private boolean mFooterDividersEnabled;
    java.util.ArrayList<android.widget.ListView.FixedViewInfo> mFooterViewInfos;
    private boolean mHeaderDividersEnabled;
    java.util.ArrayList<android.widget.ListView.FixedViewInfo> mHeaderViewInfos;
    private boolean mIsCacheColorOpaque;
    private boolean mItemsCanFocus;
    private android.app.jank.JankTracker mJankTracker;
    android.graphics.drawable.Drawable mOverScrollFooter;
    android.graphics.drawable.Drawable mOverScrollHeader;
    private int mPreviousScrollState;
    private final android.graphics.Rect mTempRect = null;
    public ListView(android.content.Context p0) { super((android.content.Context)null); }
    public ListView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ListView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ListView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private android.view.View addViewAbove(android.view.View p0, int p1) { return null; }
    private android.view.View addViewBelow(android.view.View p0, int p1) { return null; }
    private void adjustViewsUpOrDown() {}
    private int amountToScroll(int p0, int p1) { return 0; }
    private int amountToScrollToNewFocus(int p0, android.view.View p1, int p2) { return 0; }
    private android.widget.ListView.ArrowScrollFocusResult arrowScrollFocused(int p0) { return null; }
    private boolean arrowScrollImpl(int p0) { return false; }
    private void clearRecycledState(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0) {}
    private boolean commonKey(int p0, int p1, android.view.KeyEvent p2) { return false; }
    private void correctTooHigh(int p0) {}
    private void correctTooLow(int p0) {}
    private android.view.accessibility.AccessibilityNodeInfo.CollectionInfo createCollectionInfo() { return null; }
    private int distanceToView(android.view.View p0) { return 0; }
    private void fillAboveAndBelow(android.view.View p0, int p1) {}
    private android.view.View fillDown(int p0, int p1) { return null; }
    private android.view.View fillFromMiddle(int p0, int p1) { return null; }
    private android.view.View fillFromSelection(int p0, int p1, int p2) { return null; }
    private android.view.View fillFromTop(int p0) { return null; }
    private android.view.View fillSpecific(int p0, int p1) { return null; }
    private android.view.View fillUp(int p0, int p1) { return null; }
    private int getArrowScrollPreviewLength() { return 0; }
    private int getBottomSelectionPixel(int p0, int p1, int p2) { return 0; }
    private int getTopSelectionPixel(int p0, int p1, int p2) { return 0; }
    private java.lang.String getWidgetStateFromScrollState(int p0) { return null; }
    private boolean handleHorizontalFocusWithinListItem(int p0) { return false; }
    private void handleNewSelectionChange(android.view.View p0, int p1, int p2, boolean p3) {}
    private void initializeScrollStateTracking(java.lang.String p0) {}
    private boolean isDirectChildHeaderOrFooter(android.view.View p0) { return false; }
    private boolean isViewAncestorOf(android.view.View p0, android.view.View p1) { return false; }
    private int lookForSelectablePositionOnScreen(int p0) { return 0; }
    private android.view.View makeAndAddView(int p0, int p1, boolean p2, int p3, boolean p4) { return null; }
    private void measureAndAdjustDown(android.view.View p0, int p1, int p2) {}
    private void measureItem(android.view.View p0) {}
    private void measureScrapChild(android.view.View p0, int p1, int p2, int p3) {}
    private android.view.View moveSelection(android.view.View p0, android.view.View p1, int p2, int p3, int p4) { return null; }
    private final int nextSelectedPositionForDirection(android.view.View p0, int p1, int p2) { return 0; }
    private int positionOfNewFocus(android.view.View p0) { return 0; }
    private void relayoutMeasuredItem(android.view.View p0) {}
    private void removeFixedViewInfo(android.view.View p0, java.util.ArrayList<android.widget.ListView.FixedViewInfo> p1) {}
    private void removeUnusedFixedViews(java.util.List<android.widget.ListView.FixedViewInfo> p0) {}
    private void scrollListItemsBy(int p0) {}
    private void setupChild(android.view.View p0, int p1, int p2, boolean p3, int p4, boolean p5, boolean p6) {}
    private boolean shouldAdjustHeightForDivider(int p0) { return false; }
    private boolean showingBottomFadingEdge() { return false; }
    private boolean showingTopFadingEdge() { return false; }
    public void addFooterView(android.view.View p0) {}
    public void addFooterView(android.view.View p0, java.lang.Object p1, boolean p2) {}
    public void addHeaderView(android.view.View p0) {}
    public void addHeaderView(android.view.View p0, java.lang.Object p1, boolean p2) {}
    public boolean areFooterDividersEnabled() { return false; }
    public boolean areHeaderDividersEnabled() { return false; }
    boolean arrowScroll(int p0) { return false; }
    protected boolean canAnimate() { return false; }
    protected void dispatchDataSetObserverOnChangedInternal() {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    protected boolean drawChild(android.graphics.Canvas p0, android.view.View p1, long p2) { return false; }
    void drawDivider(android.graphics.Canvas p0, android.graphics.Rect p1, int p2) {}
    void drawOverscrollFooter(android.graphics.Canvas p0, android.graphics.drawable.Drawable p1, android.graphics.Rect p2) {}
    void drawOverscrollHeader(android.graphics.Canvas p0, android.graphics.drawable.Drawable p1, android.graphics.Rect p2) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    void fillGap(boolean p0) {}
    int findMotionRow(int p0) { return 0; }
    android.view.View findViewByPredicateInHeadersOrFooters(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0, java.util.function.Predicate<android.view.View> p1, android.view.View p2) { return null; }
    protected <T extends android.view.View> T findViewByPredicateTraversal(java.util.function.Predicate<android.view.View> p0, android.view.View p1) { return null; }
    android.view.View findViewInHeadersOrFooters(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0, int p1) { return null; }
    protected <T extends android.view.View> T findViewTraversal(int p0) { return null; }
    android.view.View findViewWithTagInHeadersOrFooters(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0, java.lang.Object p1) { return null; }
    protected <T extends android.view.View> T findViewWithTagTraversal(java.lang.Object p0) { return null; }
    boolean fullScroll(int p0) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public android.widget.ListAdapter getAdapter() { return null; }
    @java.lang.Deprecated
    public long[] getCheckItemIds() { return null; }
    public android.graphics.drawable.Drawable getDivider() { return null; }
    public int getDividerHeight() { return 0; }
    public int getFooterViewsCount() { return 0; }
    public int getHeaderViewsCount() { return 0; }
    int getHeightForPosition(int p0) { return 0; }
    public boolean getItemsCanFocus() { return false; }
    public int getMaxScrollAmount() { return 0; }
    public android.graphics.drawable.Drawable getOverscrollFooter() { return null; }
    public android.graphics.drawable.Drawable getOverscrollHeader() { return null; }
    public boolean isOpaque() { return false; }
    protected void layoutChildren() {}
    int lookForSelectablePosition(int p0, boolean p1) { return 0; }
    int lookForSelectablePositionAfter(int p0, int p1, boolean p2) { return 0; }
    final int measureHeightOfChildren(int p0, int p1, int p2, int p3, int p4) { return 0; }
    protected void onDetachedFromWindow() {}
    protected void onFinishInflate() {}
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public void onInitializeAccessibilityNodeInfoForItem(android.view.View p0, int p1, android.view.accessibility.AccessibilityNodeInfo p2) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    protected void onMeasure(int p0, int p1) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    boolean pageScroll(int p0) { return false; }
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    @android.view.ViewDebug.ExportedProperty(category="list")
    protected boolean recycleOnMeasure() { return false; }
    public boolean removeFooterView(android.view.View p0) { return false; }
    public boolean removeHeaderView(android.view.View p0) { return false; }
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2) { return false; }
    void resetList() {}
    public void setAdapter(android.widget.ListAdapter p0) {}
    public void setCacheColorHint(int p0) {}
    public void setDivider(android.graphics.drawable.Drawable p0) {}
    public void setDividerHeight(int p0) {}
    public void setFooterDividersEnabled(boolean p0) {}
    public void setHeaderDividersEnabled(boolean p0) {}
    public void setItemsCanFocus(boolean p0) {}
    public void setOverscrollFooter(android.graphics.drawable.Drawable p0) {}
    public void setOverscrollHeader(android.graphics.drawable.Drawable p0) {}
    public void setSelection(int p0) {}
    public void setSelectionAfterHeaderView() {}
    void setSelectionInt(int p0) {}
    @android.view.RemotableViewMethod
    public void smoothScrollByOffset(int p0) {}
    @android.view.RemotableViewMethod
    public void smoothScrollToPosition(int p0) {}
    boolean trackMotionScroll(int p0, int p1) { return false; }
    protected android.widget.HeaderViewListAdapter wrapHeaderListAdapterInternal(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0, java.util.ArrayList<android.widget.ListView.FixedViewInfo> p1, android.widget.ListAdapter p2) { return null; }
    protected void wrapHeaderListAdapterInternal() {}

    private static class ArrowScrollFocusResult {
        private int mAmountToScroll;
        private int mSelectedPosition;
        private ArrowScrollFocusResult() {}
        public int getAmountToScroll() { return 0; }
        public int getSelectedPosition() { return 0; }
        void populate(int p0, int p1) {}
    }

    public class FixedViewInfo {
        public java.lang.Object data;
        public boolean isSelectable;
        public android.view.View view;
        public FixedViewInfo(android.widget.ListView p0) {}
    }

    private class FocusSelector implements java.lang.Runnable {
        private static final int STATE_REQUEST_FOCUS = 3;
        private static final int STATE_SET_SELECTION = 1;
        private static final int STATE_WAIT_FOR_LAYOUT = 2;
        private int mAction;
        private int mPosition;
        private int mPositionTop;
        private FocusSelector(android.widget.ListView p0) {}
        void onLayoutComplete() {}
        public void run() {}
        java.lang.Runnable setupFocusIfValid(int p0) { return null; }
        android.widget.ListView.FocusSelector setupForSetSelection(int p0, int p1) { return null; }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.ListView> {
        private int mDividerHeightId;
        private int mDividerId;
        private int mFooterDividersEnabledId;
        private int mHeaderDividersEnabledId;
        private boolean mPropertiesMapped;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.ListView p0, android.view.inspector.PropertyReader p1) {}
    }
}
