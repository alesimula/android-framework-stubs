package com.android.internal.widget;

public class RecyclerView extends android.view.ViewGroup implements com.android.internal.widget.ScrollingView, com.android.internal.widget.NestedScrollingChild {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = Boolean.valueOf(false);
    private static final boolean ALLOW_THREAD_GAP_WORK = Boolean.valueOf(false);
    private static final int[] CLIP_TO_PADDING_ATTR = null;
    static final boolean DEBUG = false;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = Boolean.valueOf(false);
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = Boolean.valueOf(false);
    static final long FOREVER_NS = 9223372036854775807L;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = Boolean.valueOf(false);
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final java.lang.Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = null;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = null;
    public static final long NO_ID = -1L;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = Boolean.valueOf(false);
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final java.lang.String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final java.lang.String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final java.lang.String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final java.lang.String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final java.lang.String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final java.lang.String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final java.lang.String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final java.lang.String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final java.lang.String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int VERTICAL = 1;
    static final android.view.animation.Interpolator sQuinticInterpolator = null;
    com.android.internal.widget.RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final android.view.accessibility.AccessibilityManager mAccessibilityManager = null;
    private com.android.internal.widget.RecyclerView.OnItemTouchListener mActiveOnItemTouchListener;
    com.android.internal.widget.RecyclerView.Adapter mAdapter;
    com.android.internal.widget.AdapterHelper mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private android.widget.EdgeEffect mBottomGlow;
    private com.android.internal.widget.RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
    com.android.internal.widget.ChildHelper mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    private int mDispatchScrollCounter;
    private int mEatRequestLayout;
    private int mEatenAccessibilityChangeFlags;
    boolean mFirstLayoutComplete;
    com.android.internal.widget.GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    boolean mIsAttached;
    com.android.internal.widget.RecyclerView.ItemAnimator mItemAnimator;
    private com.android.internal.widget.RecyclerView.ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private java.lang.Runnable mItemAnimatorRunner;
    final java.util.ArrayList<com.android.internal.widget.RecyclerView.ItemDecoration> mItemDecorations = null;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    com.android.internal.widget.RecyclerView.LayoutManager mLayout;
    boolean mLayoutFrozen;
    private int mLayoutOrScrollCounter;
    boolean mLayoutRequestEaten;
    private android.widget.EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity = 0;
    private final int mMinFlingVelocity = 0;
    private final int[] mMinMaxLayoutPositions = null;
    private final int[] mNestedOffsets = null;
    private final com.android.internal.widget.RecyclerView.RecyclerViewDataObserver mObserver = null;
    private java.util.List<com.android.internal.widget.RecyclerView.OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    private com.android.internal.widget.RecyclerView.OnFlingListener mOnFlingListener;
    private final java.util.ArrayList<com.android.internal.widget.RecyclerView.OnItemTouchListener> mOnItemTouchListeners = null;
    final java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> mPendingAccessibilityImportanceChange = null;
    private com.android.internal.widget.RecyclerView.SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    com.android.internal.widget.GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final com.android.internal.widget.RecyclerView.Recycler mRecycler = null;
    com.android.internal.widget.RecyclerView.RecyclerListener mRecyclerListener;
    private android.widget.EdgeEffect mRightGlow;
    private final int[] mScrollConsumed = null;
    private float mScrollFactor;
    private com.android.internal.widget.RecyclerView.OnScrollListener mScrollListener;
    private java.util.List<com.android.internal.widget.RecyclerView.OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset = null;
    private int mScrollPointerId;
    private int mScrollState;
    private boolean mScrollToTopEnabled;
    final com.android.internal.widget.RecyclerView.State mState = null;
    final android.graphics.Rect mTempRect = null;
    private final android.graphics.Rect mTempRect2 = null;
    final android.graphics.RectF mTempRectF = null;
    private android.widget.EdgeEffect mTopGlow;
    private int mTouchSlop;
    final java.lang.Runnable mUpdateChildViewsRunnable = null;
    private android.view.VelocityTracker mVelocityTracker;
    final com.android.internal.widget.RecyclerView.ViewFlinger mViewFlinger = null;
    private final com.android.internal.widget.ViewInfoStore.ProcessCallback mViewInfoProcessCallback = null;
    final com.android.internal.widget.ViewInfoStore mViewInfoStore = null;
    public RecyclerView(android.content.Context p0) { super((android.content.Context)null); }
    public RecyclerView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RecyclerView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    private void addAnimatingView(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    private void animateChange(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ViewHolder p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p3, boolean p4, boolean p5) {}
    private void cancelTouch() {}
    static void clearNestedRecyclerViewIfNotNested(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    private void createLayoutManager(android.content.Context p0, java.lang.String p1, android.util.AttributeSet p2, int p3, int p4) {}
    private boolean didChildRangeChange(int p0, int p1) { return false; }
    private void dispatchContentChangedIfNecessary() {}
    private void dispatchLayoutStep1() {}
    private void dispatchLayoutStep2() {}
    private void dispatchLayoutStep3() {}
    private boolean dispatchOnItemTouch(android.view.MotionEvent p0) { return false; }
    private boolean dispatchOnItemTouchIntercept(android.view.MotionEvent p0) { return false; }
    private void findMinMaxChildLayoutPositions(int[] p0) {}
    static com.android.internal.widget.RecyclerView findNestedRecyclerView(android.view.View p0) { return null; }
    private android.view.View findNextViewToFocus() { return null; }
    static com.android.internal.widget.RecyclerView.ViewHolder getChildViewHolderInt(android.view.View p0) { return null; }
    static void getDecoratedBoundsWithMarginsInt(android.view.View p0, android.graphics.Rect p1) {}
    private int getDeepestFocusedViewWithId(android.view.View p0) { return 0; }
    private java.lang.String getFullClassName(android.content.Context p0, java.lang.String p1) { return null; }
    private float getScrollFactor() { return 0.0f; }
    private void handleMissingPreInfoForChangeError(long p0, com.android.internal.widget.RecyclerView.ViewHolder p1, com.android.internal.widget.RecyclerView.ViewHolder p2) {}
    private boolean hasUpdatedView() { return false; }
    private void initChildrenHelper() {}
    private boolean isPreferredNextFocus(android.view.View p0, android.view.View p1, int p2) { return false; }
    private boolean isPreferredNextFocusAbsolute(android.view.View p0, android.view.View p1, int p2) { return false; }
    private void onPointerUp(android.view.MotionEvent p0) {}
    private boolean predictiveItemAnimationsEnabled() { return false; }
    private void processAdapterUpdatesAndSetAnimationFlags() {}
    private void pullGlows(float p0, float p1, float p2, float p3) {}
    private void recoverFocusFromState() {}
    private void releaseGlows() {}
    private int releaseHorizontalGlow(int p0, float p1) { return 0; }
    private int releaseVerticalGlow(int p0, float p1) { return 0; }
    private void resetFocusInfo() {}
    private void resetTouch() {}
    private void saveFocusInfo() {}
    private void setAdapterInternal(com.android.internal.widget.RecyclerView.Adapter p0, boolean p1, boolean p2) {}
    private boolean stopGlowAnimations(android.view.MotionEvent p0) { return false; }
    private void stopScrollersInternal() {}
    void absorbGlows(int p0, int p1) {}
    public void addFocusables(java.util.ArrayList<android.view.View> p0, int p1, int p2) {}
    public void addItemDecoration(com.android.internal.widget.RecyclerView.ItemDecoration p0) {}
    public void addItemDecoration(com.android.internal.widget.RecyclerView.ItemDecoration p0, int p1) {}
    public void addOnChildAttachStateChangeListener(com.android.internal.widget.RecyclerView.OnChildAttachStateChangeListener p0) {}
    public void addOnItemTouchListener(com.android.internal.widget.RecyclerView.OnItemTouchListener p0) {}
    public void addOnScrollListener(com.android.internal.widget.RecyclerView.OnScrollListener p0) {}
    void animateAppearance(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2) {}
    void animateDisappearance(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2) {}
    void assertInLayoutOrScroll(java.lang.String p0) {}
    void assertNotInLayoutOrScroll(java.lang.String p0) {}
    boolean canReuseUpdatedViewHolder(com.android.internal.widget.RecyclerView.ViewHolder p0) { return false; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    void clearOldPositions() {}
    public void clearOnChildAttachStateChangeListeners() {}
    public void clearOnScrollListeners() {}
    public int computeHorizontalScrollExtent() { return 0; }
    public int computeHorizontalScrollOffset() { return 0; }
    public int computeHorizontalScrollRange() { return 0; }
    public int computeVerticalScrollExtent() { return 0; }
    public int computeVerticalScrollOffset() { return 0; }
    public int computeVerticalScrollRange() { return 0; }
    void considerReleasingGlowsOnScroll(int p0, int p1) {}
    void consumePendingUpdateOperations() {}
    void defaultOnMeasure(int p0, int p1) {}
    void dispatchChildAttached(android.view.View p0) {}
    void dispatchChildDetached(android.view.View p0) {}
    void dispatchLayout() {}
    void dispatchOnScrollStateChanged(int p0) {}
    void dispatchOnScrolled(int p0, int p1) {}
    void dispatchPendingImportantForAccessibilityChanges() {}
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public boolean drawChild(android.graphics.Canvas p0, android.view.View p1, long p2) { return false; }
    void eatRequestLayout() {}
    void ensureBottomGlow() {}
    void ensureLeftGlow() {}
    void ensureRightGlow() {}
    void ensureTopGlow() {}
    public android.view.View findChildViewUnder(float p0, float p1) { return null; }
    public android.view.View findContainingItemView(android.view.View p0) { return null; }
    public com.android.internal.widget.RecyclerView.ViewHolder findContainingViewHolder(android.view.View p0) { return null; }
    public com.android.internal.widget.RecyclerView.ViewHolder findViewHolderForAdapterPosition(int p0) { return null; }
    public com.android.internal.widget.RecyclerView.ViewHolder findViewHolderForItemId(long p0) { return null; }
    public com.android.internal.widget.RecyclerView.ViewHolder findViewHolderForLayoutPosition(int p0) { return null; }
    @java.lang.Deprecated
    public com.android.internal.widget.RecyclerView.ViewHolder findViewHolderForPosition(int p0) { return null; }
    com.android.internal.widget.RecyclerView.ViewHolder findViewHolderForPosition(int p0, boolean p1) { return null; }
    public boolean fling(int p0, int p1) { return false; }
    public android.view.View focusSearch(android.view.View p0, int p1) { return null; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public com.android.internal.widget.RecyclerView.Adapter getAdapter() { return null; }
    int getAdapterPositionFor(com.android.internal.widget.RecyclerView.ViewHolder p0) { return 0; }
    public int getBaseline() { return 0; }
    long getChangedHolderKey(com.android.internal.widget.RecyclerView.ViewHolder p0) { return 0L; }
    public int getChildAdapterPosition(android.view.View p0) { return 0; }
    protected int getChildDrawingOrder(int p0, int p1) { return 0; }
    public long getChildItemId(android.view.View p0) { return 0L; }
    public int getChildLayoutPosition(android.view.View p0) { return 0; }
    @java.lang.Deprecated
    public int getChildPosition(android.view.View p0) { return 0; }
    public com.android.internal.widget.RecyclerView.ViewHolder getChildViewHolder(android.view.View p0) { return null; }
    public boolean getClipToPadding() { return false; }
    public com.android.internal.widget.RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() { return null; }
    public void getDecoratedBoundsWithMargins(android.view.View p0, android.graphics.Rect p1) {}
    public com.android.internal.widget.RecyclerView.ItemAnimator getItemAnimator() { return null; }
    android.graphics.Rect getItemDecorInsetsForChild(android.view.View p0) { return null; }
    public com.android.internal.widget.RecyclerView.LayoutManager getLayoutManager() { return null; }
    public int getMaxFlingVelocity() { return 0; }
    public int getMinFlingVelocity() { return 0; }
    long getNanoTime() { return 0L; }
    public com.android.internal.widget.RecyclerView.OnFlingListener getOnFlingListener() { return null; }
    public boolean getPreserveFocusAfterLayout() { return false; }
    public com.android.internal.widget.RecyclerView.RecycledViewPool getRecycledViewPool() { return null; }
    public int getScrollState() { return 0; }
    public boolean hasFixedSize() { return false; }
    public boolean hasPendingAdapterUpdates() { return false; }
    void initAdapterManager() {}
    void invalidateGlows() {}
    public void invalidateItemDecorations() {}
    boolean isAccessibilityEnabled() { return false; }
    public boolean isAnimating() { return false; }
    public boolean isAttachedToWindow() { return false; }
    public boolean isComputingLayout() { return false; }
    public boolean isLayoutFrozen() { return false; }
    public boolean isScrollToTopEnabled() { return false; }
    void jumpToPositionForSmoothScroller(int p0) {}
    void markItemDecorInsetsDirty() {}
    void markKnownViewsInvalid() {}
    public void offsetChildrenHorizontal(int p0) {}
    public void offsetChildrenVertical(int p0) {}
    void offsetPositionRecordsForInsert(int p0, int p1) {}
    void offsetPositionRecordsForMove(int p0, int p1) {}
    void offsetPositionRecordsForRemove(int p0, int p1, boolean p2) {}
    protected void onAttachedToWindow() {}
    public void onChildAttachedToWindow(android.view.View p0) {}
    public void onChildDetachedFromWindow(android.view.View p0) {}
    protected void onDetachedFromWindow() {}
    public void onDraw(android.graphics.Canvas p0) {}
    void onEnterLayoutOrScroll() {}
    void onExitLayoutOrScroll() {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    protected boolean onRequestFocusInDescendants(int p0, android.graphics.Rect p1) { return false; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    public void onScrollStateChanged(int p0) {}
    public boolean onScrollToTop(int p0) { return false; }
    public void onScrolled(int p0, int p1) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    void postAnimationRunner() {}
    void recordAnimationInfoIfBouncedHiddenView(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1) {}
    void removeAndRecycleViews() {}
    boolean removeAnimatingView(android.view.View p0) { return false; }
    protected void removeDetachedView(android.view.View p0, boolean p1) {}
    public void removeItemDecoration(com.android.internal.widget.RecyclerView.ItemDecoration p0) {}
    public void removeOnChildAttachStateChangeListener(com.android.internal.widget.RecyclerView.OnChildAttachStateChangeListener p0) {}
    public void removeOnItemTouchListener(com.android.internal.widget.RecyclerView.OnItemTouchListener p0) {}
    public void removeOnScrollListener(com.android.internal.widget.RecyclerView.OnScrollListener p0) {}
    void repositionShadowingViews() {}
    public void requestChildFocus(android.view.View p0, android.view.View p1) {}
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2) { return false; }
    public void requestDisallowInterceptTouchEvent(boolean p0) {}
    public void requestLayout() {}
    void resumeRequestLayout(boolean p0) {}
    void saveOldPositions() {}
    public void scrollBy(int p0, int p1) {}
    boolean scrollByInternal(int p0, int p1, android.view.MotionEvent p2) { return false; }
    public void scrollTo(int p0, int p1) {}
    public void scrollToPosition(int p0) {}
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent p0) {}
    public void setAccessibilityDelegateCompat(com.android.internal.widget.RecyclerViewAccessibilityDelegate p0) {}
    public void setAdapter(com.android.internal.widget.RecyclerView.Adapter p0) {}
    public void setChildDrawingOrderCallback(com.android.internal.widget.RecyclerView.ChildDrawingOrderCallback p0) {}
    boolean setChildImportantForAccessibilityInternal(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1) { return false; }
    public void setClipToPadding(boolean p0) {}
    void setDataSetChangedAfterLayout() {}
    public void setHasFixedSize(boolean p0) {}
    public void setItemAnimator(com.android.internal.widget.RecyclerView.ItemAnimator p0) {}
    public void setItemViewCacheSize(int p0) {}
    public void setLayoutFrozen(boolean p0) {}
    public void setLayoutManager(com.android.internal.widget.RecyclerView.LayoutManager p0) {}
    public void setOnFlingListener(com.android.internal.widget.RecyclerView.OnFlingListener p0) {}
    @java.lang.Deprecated
    public void setOnScrollListener(com.android.internal.widget.RecyclerView.OnScrollListener p0) {}
    public void setPreserveFocusAfterLayout(boolean p0) {}
    public void setRecycledViewPool(com.android.internal.widget.RecyclerView.RecycledViewPool p0) {}
    public void setRecyclerListener(com.android.internal.widget.RecyclerView.RecyclerListener p0) {}
    void setScrollState(int p0) {}
    public void setScrollToTopEnabled(boolean p0) {}
    public void setScrollingTouchSlop(int p0) {}
    public void setViewCacheExtension(com.android.internal.widget.RecyclerView.ViewCacheExtension p0) {}
    boolean shouldDeferAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public void smoothScrollBy(int p0, int p1) {}
    public void smoothScrollBy(int p0, int p1, android.view.animation.Interpolator p2) {}
    public void smoothScrollToPosition(int p0) {}
    public void stopScroll() {}
    public void swapAdapter(com.android.internal.widget.RecyclerView.Adapter p0, boolean p1) {}
    void viewRangeUpdate(int p0, int p1, java.lang.Object p2) {}

    public static abstract class Adapter<VH extends com.android.internal.widget.RecyclerView.ViewHolder> {
        private boolean mHasStableIds;
        private final com.android.internal.widget.RecyclerView.AdapterDataObservable mObservable = null;
        public Adapter() {}
        public final void bindViewHolder(VH p0, int p1) {}
        public final VH createViewHolder(android.view.ViewGroup p0, int p1) { return null; }
        public abstract int getItemCount();
        public long getItemId(int p0) { return 0L; }
        public int getItemViewType(int p0) { return 0; }
        public final boolean hasObservers() { return false; }
        public final boolean hasStableIds() { return false; }
        public final void notifyDataSetChanged() {}
        public final void notifyItemChanged(int p0) {}
        public final void notifyItemChanged(int p0, java.lang.Object p1) {}
        public final void notifyItemInserted(int p0) {}
        public final void notifyItemMoved(int p0, int p1) {}
        public final void notifyItemRangeChanged(int p0, int p1) {}
        public final void notifyItemRangeChanged(int p0, int p1, java.lang.Object p2) {}
        public final void notifyItemRangeInserted(int p0, int p1) {}
        public final void notifyItemRangeRemoved(int p0, int p1) {}
        public final void notifyItemRemoved(int p0) {}
        public void onAttachedToRecyclerView(com.android.internal.widget.RecyclerView p0) {}
        public abstract void onBindViewHolder(VH p0, int p1);
        public void onBindViewHolder(VH p0, int p1, java.util.List<java.lang.Object> p2) {}
        public abstract VH onCreateViewHolder(android.view.ViewGroup p0, int p1);
        public void onDetachedFromRecyclerView(com.android.internal.widget.RecyclerView p0) {}
        public boolean onFailedToRecycleView(VH p0) { return false; }
        public void onViewAttachedToWindow(VH p0) {}
        public void onViewDetachedFromWindow(VH p0) {}
        public void onViewRecycled(VH p0) {}
        public void registerAdapterDataObserver(com.android.internal.widget.RecyclerView.AdapterDataObserver p0) {}
        public void setHasStableIds(boolean p0) {}
        public void unregisterAdapterDataObserver(com.android.internal.widget.RecyclerView.AdapterDataObserver p0) {}
    }

    static class AdapterDataObservable extends android.database.Observable<com.android.internal.widget.RecyclerView.AdapterDataObserver> {
        AdapterDataObservable() { super(); }
        public boolean hasObservers() { return false; }
        public void notifyChanged() {}
        public void notifyItemMoved(int p0, int p1) {}
        public void notifyItemRangeChanged(int p0, int p1) {}
        public void notifyItemRangeChanged(int p0, int p1, java.lang.Object p2) {}
        public void notifyItemRangeInserted(int p0, int p1) {}
        public void notifyItemRangeRemoved(int p0, int p1) {}
    }

    public static abstract class AdapterDataObserver {
        public AdapterDataObserver() {}
        public void onChanged() {}
        public void onItemRangeChanged(int p0, int p1) {}
        public void onItemRangeChanged(int p0, int p1, java.lang.Object p2) {}
        public void onItemRangeInserted(int p0, int p1) {}
        public void onItemRangeMoved(int p0, int p1, int p2) {}
        public void onItemRangeRemoved(int p0, int p1) {}
    }

    public static interface ChildDrawingOrderCallback {
        public int onGetChildDrawingOrder(int p0, int p1);
    }

    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private long mAddDuration;
        private long mChangeDuration;
        private java.util.ArrayList<com.android.internal.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> mFinishedListeners;
        private com.android.internal.widget.RecyclerView.ItemAnimator.ItemAnimatorListener mListener;
        private long mMoveDuration;
        private long mRemoveDuration;
        public ItemAnimator() {}
        static int buildAdapterChangeFlagsForAnimations(com.android.internal.widget.RecyclerView.ViewHolder p0) { return 0; }
        public abstract boolean animateAppearance(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2);
        public abstract boolean animateChange(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ViewHolder p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p3);
        public abstract boolean animateDisappearance(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2);
        public abstract boolean animatePersistence(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2);
        public boolean canReuseUpdatedViewHolder(com.android.internal.widget.RecyclerView.ViewHolder p0) { return false; }
        public boolean canReuseUpdatedViewHolder(com.android.internal.widget.RecyclerView.ViewHolder p0, java.util.List<java.lang.Object> p1) { return false; }
        public final void dispatchAnimationFinished(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        public final void dispatchAnimationStarted(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        public final void dispatchAnimationsFinished() {}
        public abstract void endAnimation(com.android.internal.widget.RecyclerView.ViewHolder p0);
        public abstract void endAnimations();
        public long getAddDuration() { return 0L; }
        public long getChangeDuration() { return 0L; }
        public long getMoveDuration() { return 0L; }
        public long getRemoveDuration() { return 0L; }
        public abstract boolean isRunning();
        public final boolean isRunning(com.android.internal.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener p0) { return false; }
        public com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo obtainHolderInfo() { return null; }
        public void onAnimationFinished(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        public void onAnimationStarted(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        public com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo recordPostLayoutInformation(com.android.internal.widget.RecyclerView.State p0, com.android.internal.widget.RecyclerView.ViewHolder p1) { return null; }
        public com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo recordPreLayoutInformation(com.android.internal.widget.RecyclerView.State p0, com.android.internal.widget.RecyclerView.ViewHolder p1, int p2, java.util.List<java.lang.Object> p3) { return null; }
        public abstract void runPendingAnimations();
        public void setAddDuration(long p0) {}
        public void setChangeDuration(long p0) {}
        void setListener(com.android.internal.widget.RecyclerView.ItemAnimator.ItemAnimatorListener p0) {}
        public void setMoveDuration(long p0) {}
        public void setRemoveDuration(long p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface AdapterChanges {
        }

        public static interface ItemAnimatorFinishedListener {
            public void onAnimationsFinished();
        }

        static interface ItemAnimatorListener {
            public void onAnimationFinished(com.android.internal.widget.RecyclerView.ViewHolder p0);
        }

        public static class ItemHolderInfo {
            public int bottom;
            public int changeFlags;
            public int left;
            public int right;
            public int top;
            public ItemHolderInfo() {}
            public com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo setFrom(com.android.internal.widget.RecyclerView.ViewHolder p0) { return null; }
            public com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo setFrom(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1) { return null; }
        }
    }

    private class ItemAnimatorRestoreListener implements com.android.internal.widget.RecyclerView.ItemAnimator.ItemAnimatorListener {
        ItemAnimatorRestoreListener(com.android.internal.widget.RecyclerView p0) {}
        public void onAnimationFinished(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    }

    public static abstract class ItemDecoration {
        public ItemDecoration() {}
        @java.lang.Deprecated
        public void getItemOffsets(android.graphics.Rect p0, int p1, com.android.internal.widget.RecyclerView p2) {}
        public void getItemOffsets(android.graphics.Rect p0, android.view.View p1, com.android.internal.widget.RecyclerView p2, com.android.internal.widget.RecyclerView.State p3) {}
        @java.lang.Deprecated
        public void onDraw(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1) {}
        public void onDraw(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.State p2) {}
        @java.lang.Deprecated
        public void onDrawOver(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1) {}
        public void onDrawOver(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.State p2) {}
    }

    public static abstract class LayoutManager {
        boolean mAutoMeasure;
        com.android.internal.widget.ChildHelper mChildHelper;
        private int mHeight;
        private int mHeightMode;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        com.android.internal.widget.RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        com.android.internal.widget.RecyclerView.SmoothScroller mSmoothScroller;
        private int mWidth;
        private int mWidthMode;
        public LayoutManager() {}
        private void addViewInt(android.view.View p0, int p1, boolean p2) {}
        public static int chooseSize(int p0, int p1, int p2) { return 0; }
        private void detachViewInternal(int p0, android.view.View p1) {}
        public static int getChildMeasureSpec(int p0, int p1, int p2, int p3, boolean p4) { return 0; }
        @java.lang.Deprecated
        public static int getChildMeasureSpec(int p0, int p1, int p2, boolean p3) { return 0; }
        public static com.android.internal.widget.RecyclerView.LayoutManager.Properties getProperties(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { return null; }
        private static boolean isMeasurementUpToDate(int p0, int p1, int p2) { return false; }
        private void onSmoothScrollerStopped(com.android.internal.widget.RecyclerView.SmoothScroller p0) {}
        private void scrapOrRecycleView(com.android.internal.widget.RecyclerView.Recycler p0, int p1, android.view.View p2) {}
        public void addDisappearingView(android.view.View p0) {}
        public void addDisappearingView(android.view.View p0, int p1) {}
        public void addView(android.view.View p0) {}
        public void addView(android.view.View p0, int p1) {}
        public void assertInLayoutOrScroll(java.lang.String p0) {}
        public void assertNotInLayoutOrScroll(java.lang.String p0) {}
        public void attachView(android.view.View p0) {}
        public void attachView(android.view.View p0, int p1) {}
        public void attachView(android.view.View p0, int p1, com.android.internal.widget.RecyclerView.LayoutParams p2) {}
        public void calculateItemDecorationsForChild(android.view.View p0, android.graphics.Rect p1) {}
        public boolean canScrollHorizontally() { return false; }
        public boolean canScrollVertically() { return false; }
        public boolean checkLayoutParams(com.android.internal.widget.RecyclerView.LayoutParams p0) { return false; }
        public void collectAdjacentPrefetchPositions(int p0, int p1, com.android.internal.widget.RecyclerView.State p2, com.android.internal.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry p3) {}
        public void collectInitialPrefetchPositions(int p0, com.android.internal.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry p1) {}
        public int computeHorizontalScrollExtent(com.android.internal.widget.RecyclerView.State p0) { return 0; }
        public int computeHorizontalScrollOffset(com.android.internal.widget.RecyclerView.State p0) { return 0; }
        public int computeHorizontalScrollRange(com.android.internal.widget.RecyclerView.State p0) { return 0; }
        public int computeVerticalScrollExtent(com.android.internal.widget.RecyclerView.State p0) { return 0; }
        public int computeVerticalScrollOffset(com.android.internal.widget.RecyclerView.State p0) { return 0; }
        public int computeVerticalScrollRange(com.android.internal.widget.RecyclerView.State p0) { return 0; }
        public void detachAndScrapAttachedViews(com.android.internal.widget.RecyclerView.Recycler p0) {}
        public void detachAndScrapView(android.view.View p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
        public void detachAndScrapViewAt(int p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
        public void detachView(android.view.View p0) {}
        public void detachViewAt(int p0) {}
        void dispatchAttachedToWindow(com.android.internal.widget.RecyclerView p0) {}
        void dispatchDetachedFromWindow(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
        public void endAnimation(android.view.View p0) {}
        public android.view.View findContainingItemView(android.view.View p0) { return null; }
        public android.view.View findViewByPosition(int p0) { return null; }
        public abstract com.android.internal.widget.RecyclerView.LayoutParams generateDefaultLayoutParams();
        public com.android.internal.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context p0, android.util.AttributeSet p1) { return null; }
        public com.android.internal.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
        public int getBaseline() { return 0; }
        public int getBottomDecorationHeight(android.view.View p0) { return 0; }
        public android.view.View getChildAt(int p0) { return null; }
        public int getChildCount() { return 0; }
        public boolean getClipToPadding() { return false; }
        public int getColumnCountForAccessibility(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return 0; }
        public int getDecoratedBottom(android.view.View p0) { return 0; }
        public void getDecoratedBoundsWithMargins(android.view.View p0, android.graphics.Rect p1) {}
        public int getDecoratedLeft(android.view.View p0) { return 0; }
        public int getDecoratedMeasuredHeight(android.view.View p0) { return 0; }
        public int getDecoratedMeasuredWidth(android.view.View p0) { return 0; }
        public int getDecoratedRight(android.view.View p0) { return 0; }
        public int getDecoratedTop(android.view.View p0) { return 0; }
        public android.view.View getFocusedChild() { return null; }
        public int getHeight() { return 0; }
        public int getHeightMode() { return 0; }
        public int getItemCount() { return 0; }
        public int getItemViewType(android.view.View p0) { return 0; }
        public int getLayoutDirection() { return 0; }
        public int getLeftDecorationWidth(android.view.View p0) { return 0; }
        public int getMinimumHeight() { return 0; }
        public int getMinimumWidth() { return 0; }
        public int getPaddingBottom() { return 0; }
        public int getPaddingEnd() { return 0; }
        public int getPaddingLeft() { return 0; }
        public int getPaddingRight() { return 0; }
        public int getPaddingStart() { return 0; }
        public int getPaddingTop() { return 0; }
        public int getPosition(android.view.View p0) { return 0; }
        public int getRightDecorationWidth(android.view.View p0) { return 0; }
        public int getRowCountForAccessibility(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return 0; }
        public int getSelectionModeForAccessibility(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return 0; }
        public int getTopDecorationHeight(android.view.View p0) { return 0; }
        public void getTransformedBoundingBox(android.view.View p0, boolean p1, android.graphics.Rect p2) {}
        public int getWidth() { return 0; }
        public int getWidthMode() { return 0; }
        boolean hasFlexibleChildInBothOrientations() { return false; }
        public boolean hasFocus() { return false; }
        public void ignoreView(android.view.View p0) {}
        public boolean isAttachedToWindow() { return false; }
        public boolean isAutoMeasureEnabled() { return false; }
        public boolean isFocused() { return false; }
        public final boolean isItemPrefetchEnabled() { return false; }
        public boolean isLayoutHierarchical(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return false; }
        public boolean isMeasurementCacheEnabled() { return false; }
        public boolean isSmoothScrolling() { return false; }
        public void layoutDecorated(android.view.View p0, int p1, int p2, int p3, int p4) {}
        public void layoutDecoratedWithMargins(android.view.View p0, int p1, int p2, int p3, int p4) {}
        public void measureChild(android.view.View p0, int p1, int p2) {}
        public void measureChildWithMargins(android.view.View p0, int p1, int p2) {}
        public void moveView(int p0, int p1) {}
        public void offsetChildrenHorizontal(int p0) {}
        public void offsetChildrenVertical(int p0) {}
        public void onAdapterChanged(com.android.internal.widget.RecyclerView.Adapter p0, com.android.internal.widget.RecyclerView.Adapter p1) {}
        public boolean onAddFocusables(com.android.internal.widget.RecyclerView p0, java.util.ArrayList<android.view.View> p1, int p2, int p3) { return false; }
        public void onAttachedToWindow(com.android.internal.widget.RecyclerView p0) {}
        @java.lang.Deprecated
        public void onDetachedFromWindow(com.android.internal.widget.RecyclerView p0) {}
        public void onDetachedFromWindow(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
        public android.view.View onFocusSearchFailed(android.view.View p0, int p1, com.android.internal.widget.RecyclerView.Recycler p2, com.android.internal.widget.RecyclerView.State p3) { return null; }
        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
        public void onInitializeAccessibilityEvent(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, android.view.accessibility.AccessibilityEvent p2) {}
        void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
        public void onInitializeAccessibilityNodeInfo(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, android.view.accessibility.AccessibilityNodeInfo p2) {}
        void onInitializeAccessibilityNodeInfoForItem(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        public void onInitializeAccessibilityNodeInfoForItem(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, android.view.View p2, android.view.accessibility.AccessibilityNodeInfo p3) {}
        public android.view.View onInterceptFocusSearch(android.view.View p0, int p1) { return null; }
        public void onItemsAdded(com.android.internal.widget.RecyclerView p0, int p1, int p2) {}
        public void onItemsChanged(com.android.internal.widget.RecyclerView p0) {}
        public void onItemsMoved(com.android.internal.widget.RecyclerView p0, int p1, int p2, int p3) {}
        public void onItemsRemoved(com.android.internal.widget.RecyclerView p0, int p1, int p2) {}
        public void onItemsUpdated(com.android.internal.widget.RecyclerView p0, int p1, int p2) {}
        public void onItemsUpdated(com.android.internal.widget.RecyclerView p0, int p1, int p2, java.lang.Object p3) {}
        public void onLayoutChildren(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) {}
        public void onLayoutCompleted(com.android.internal.widget.RecyclerView.State p0) {}
        public void onMeasure(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, int p2, int p3) {}
        @java.lang.Deprecated
        public boolean onRequestChildFocus(com.android.internal.widget.RecyclerView p0, android.view.View p1, android.view.View p2) { return false; }
        public boolean onRequestChildFocus(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.State p1, android.view.View p2, android.view.View p3) { return false; }
        public void onRestoreInstanceState(android.os.Parcelable p0) {}
        public android.os.Parcelable onSaveInstanceState() { return null; }
        public void onScrollStateChanged(int p0) {}
        boolean performAccessibilityAction(int p0, android.os.Bundle p1) { return false; }
        public boolean performAccessibilityAction(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, int p2, android.os.Bundle p3) { return false; }
        boolean performAccessibilityActionForItem(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
        public boolean performAccessibilityActionForItem(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, android.view.View p2, int p3, android.os.Bundle p4) { return false; }
        public void postOnAnimation(java.lang.Runnable p0) {}
        public void removeAllViews() {}
        public void removeAndRecycleAllViews(com.android.internal.widget.RecyclerView.Recycler p0) {}
        void removeAndRecycleScrapInt(com.android.internal.widget.RecyclerView.Recycler p0) {}
        public void removeAndRecycleView(android.view.View p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
        public void removeAndRecycleViewAt(int p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
        public boolean removeCallbacks(java.lang.Runnable p0) { return false; }
        public void removeDetachedView(android.view.View p0) {}
        public void removeView(android.view.View p0) {}
        public void removeViewAt(int p0) {}
        public boolean requestChildRectangleOnScreen(com.android.internal.widget.RecyclerView p0, android.view.View p1, android.graphics.Rect p2, boolean p3) { return false; }
        public void requestLayout() {}
        public void requestSimpleAnimationsInNextLayout() {}
        public int scrollHorizontallyBy(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2) { return 0; }
        public void scrollToPosition(int p0) {}
        public int scrollVerticallyBy(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2) { return 0; }
        public void setAutoMeasureEnabled(boolean p0) {}
        void setExactMeasureSpecsFrom(com.android.internal.widget.RecyclerView p0) {}
        public final void setItemPrefetchEnabled(boolean p0) {}
        void setMeasureSpecs(int p0, int p1) {}
        public void setMeasuredDimension(int p0, int p1) {}
        public void setMeasuredDimension(android.graphics.Rect p0, int p1, int p2) {}
        void setMeasuredDimensionFromChildren(int p0, int p1) {}
        public void setMeasurementCacheEnabled(boolean p0) {}
        void setRecyclerView(com.android.internal.widget.RecyclerView p0) {}
        boolean shouldMeasureChild(android.view.View p0, int p1, int p2, com.android.internal.widget.RecyclerView.LayoutParams p3) { return false; }
        boolean shouldMeasureTwice() { return false; }
        boolean shouldReMeasureChild(android.view.View p0, int p1, int p2, com.android.internal.widget.RecyclerView.LayoutParams p3) { return false; }
        public void smoothScrollToPosition(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.State p1, int p2) {}
        public void startSmoothScroll(com.android.internal.widget.RecyclerView.SmoothScroller p0) {}
        public void stopIgnoringView(android.view.View p0) {}
        void stopSmoothScroller() {}
        public boolean supportsPredictiveItemAnimations() { return false; }

        public static interface LayoutPrefetchRegistry {
            public void addPosition(int p0, int p1);
        }

        public static class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;
            public Properties() {}
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        final android.graphics.Rect mDecorInsets = null;
        boolean mInsetsDirty;
        boolean mPendingInvalidate;
        com.android.internal.widget.RecyclerView.ViewHolder mViewHolder;
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(com.android.internal.widget.RecyclerView.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public int getViewAdapterPosition() { return 0; }
        public int getViewLayoutPosition() { return 0; }
        @java.lang.Deprecated
        public int getViewPosition() { return 0; }
        public boolean isItemChanged() { return false; }
        public boolean isItemRemoved() { return false; }
        public boolean isViewInvalid() { return false; }
        public boolean viewNeedsUpdate() { return false; }
    }

    public static interface OnChildAttachStateChangeListener {
        public void onChildViewAttachedToWindow(android.view.View p0);
        public void onChildViewDetachedFromWindow(android.view.View p0);
    }

    public static abstract class OnFlingListener {
        public OnFlingListener() {}
        public abstract boolean onFling(int p0, int p1);
    }

    public static interface OnItemTouchListener {
        public boolean onInterceptTouchEvent(com.android.internal.widget.RecyclerView p0, android.view.MotionEvent p1);
        public void onRequestDisallowInterceptTouchEvent(boolean p0);
        public void onTouchEvent(com.android.internal.widget.RecyclerView p0, android.view.MotionEvent p1);
    }

    public static abstract class OnScrollListener {
        public OnScrollListener() {}
        public void onScrollStateChanged(com.android.internal.widget.RecyclerView p0, int p1) {}
        public void onScrolled(com.android.internal.widget.RecyclerView p0, int p1, int p2) {}
    }

    public static class RecycledViewPool {
        private static final int DEFAULT_MAX_SCRAP = 5;
        private int mAttachCount;
        android.util.SparseArray<com.android.internal.widget.RecyclerView.RecycledViewPool.ScrapData> mScrap;
        public RecycledViewPool() {}
        private com.android.internal.widget.RecyclerView.RecycledViewPool.ScrapData getScrapDataForType(int p0) { return null; }
        void attach(com.android.internal.widget.RecyclerView.Adapter p0) {}
        public void clear() {}
        void detach() {}
        void factorInBindTime(int p0, long p1) {}
        void factorInCreateTime(int p0, long p1) {}
        public com.android.internal.widget.RecyclerView.ViewHolder getRecycledView(int p0) { return null; }
        public int getRecycledViewCount(int p0) { return 0; }
        void onAdapterChanged(com.android.internal.widget.RecyclerView.Adapter p0, com.android.internal.widget.RecyclerView.Adapter p1, boolean p2) {}
        public void putRecycledView(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        long runningAverage(long p0, long p1) { return 0L; }
        public void setMaxRecycledViews(int p0, int p1) {}
        int size() { return 0; }
        boolean willBindInTime(int p0, long p1, long p2) { return false; }
        boolean willCreateInTime(int p0, long p1, long p2) { return false; }

        static class ScrapData {
            long mBindRunningAverageNs;
            long mCreateRunningAverageNs;
            int mMaxScrap;
            java.util.ArrayList<com.android.internal.widget.RecyclerView.ViewHolder> mScrapHeap;
            ScrapData() {}
        }
    }

    public final class Recycler {
        static final int DEFAULT_CACHE_SIZE = 2;
        final java.util.ArrayList<com.android.internal.widget.RecyclerView.ViewHolder> mAttachedScrap = null;
        final java.util.ArrayList<com.android.internal.widget.RecyclerView.ViewHolder> mCachedViews = null;
        java.util.ArrayList<com.android.internal.widget.RecyclerView.ViewHolder> mChangedScrap;
        com.android.internal.widget.RecyclerView.RecycledViewPool mRecyclerPool;
        private int mRequestedCacheMax;
        private final java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> mUnmodifiableAttachedScrap = null;
        private com.android.internal.widget.RecyclerView.ViewCacheExtension mViewCacheExtension;
        int mViewCacheMax;
        public Recycler(com.android.internal.widget.RecyclerView p0) {}
        private void attachAccessibilityDelegate(android.view.View p0) {}
        private void invalidateDisplayListInt(android.view.ViewGroup p0, boolean p1) {}
        private void invalidateDisplayListInt(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        private boolean tryBindViewHolderByDeadline(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1, int p2, long p3) { return false; }
        void addViewHolderToRecycledViewPool(com.android.internal.widget.RecyclerView.ViewHolder p0, boolean p1) {}
        public void bindViewToPosition(android.view.View p0, int p1) {}
        public void clear() {}
        void clearOldPositions() {}
        void clearScrap() {}
        public int convertPreLayoutPositionToPostLayout(int p0) { return 0; }
        void dispatchViewRecycled(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        com.android.internal.widget.RecyclerView.ViewHolder getChangedScrapViewForPosition(int p0) { return null; }
        com.android.internal.widget.RecyclerView.RecycledViewPool getRecycledViewPool() { return null; }
        int getScrapCount() { return 0; }
        public java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> getScrapList() { return null; }
        com.android.internal.widget.RecyclerView.ViewHolder getScrapOrCachedViewForId(long p0, int p1, boolean p2) { return null; }
        com.android.internal.widget.RecyclerView.ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int p0, boolean p1) { return null; }
        android.view.View getScrapViewAt(int p0) { return null; }
        public android.view.View getViewForPosition(int p0) { return null; }
        android.view.View getViewForPosition(int p0, boolean p1) { return null; }
        void markItemDecorInsetsDirty() {}
        void markKnownViewsInvalid() {}
        void offsetPositionRecordsForInsert(int p0, int p1) {}
        void offsetPositionRecordsForMove(int p0, int p1) {}
        void offsetPositionRecordsForRemove(int p0, int p1, boolean p2) {}
        void onAdapterChanged(com.android.internal.widget.RecyclerView.Adapter p0, com.android.internal.widget.RecyclerView.Adapter p1, boolean p2) {}
        void quickRecycleScrapView(android.view.View p0) {}
        void recycleAndClearCachedViews() {}
        void recycleCachedViewAt(int p0) {}
        public void recycleView(android.view.View p0) {}
        void recycleViewHolderInternal(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        void recycleViewInternal(android.view.View p0) {}
        void scrapView(android.view.View p0) {}
        void setAdapterPositionsAsUnknown() {}
        void setRecycledViewPool(com.android.internal.widget.RecyclerView.RecycledViewPool p0) {}
        void setViewCacheExtension(com.android.internal.widget.RecyclerView.ViewCacheExtension p0) {}
        public void setViewCacheSize(int p0) {}
        com.android.internal.widget.RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline(int p0, boolean p1, long p2) { return null; }
        void unscrapView(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        void updateViewCacheSize() {}
        boolean validateViewHolderForOffsetPosition(com.android.internal.widget.RecyclerView.ViewHolder p0) { return false; }
        void viewRangeUpdate(int p0, int p1) {}
    }

    public static interface RecyclerListener {
        public void onViewRecycled(com.android.internal.widget.RecyclerView.ViewHolder p0);
    }

    private class RecyclerViewDataObserver extends com.android.internal.widget.RecyclerView.AdapterDataObserver {
        RecyclerViewDataObserver(com.android.internal.widget.RecyclerView p0) { super(); }
        public void onChanged() {}
        public void onItemRangeChanged(int p0, int p1, java.lang.Object p2) {}
        public void onItemRangeInserted(int p0, int p1) {}
        public void onItemRangeMoved(int p0, int p1, int p2) {}
        public void onItemRangeRemoved(int p0, int p1) {}
        void triggerUpdateProcessor() {}
    }

    public static class SavedState extends android.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.android.internal.widget.RecyclerView.SavedState> CREATOR = null;
        android.os.Parcelable mLayoutState;
        SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        void copyFrom(com.android.internal.widget.RecyclerView.SavedState p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class SimpleOnItemTouchListener implements com.android.internal.widget.RecyclerView.OnItemTouchListener {
        public SimpleOnItemTouchListener() {}
        public boolean onInterceptTouchEvent(com.android.internal.widget.RecyclerView p0, android.view.MotionEvent p1) { return false; }
        public void onRequestDisallowInterceptTouchEvent(boolean p0) {}
        public void onTouchEvent(com.android.internal.widget.RecyclerView p0, android.view.MotionEvent p1) {}
    }

    public static abstract class SmoothScroller {
        private com.android.internal.widget.RecyclerView.LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private com.android.internal.widget.RecyclerView mRecyclerView;
        private final com.android.internal.widget.RecyclerView.SmoothScroller.Action mRecyclingAction = null;
        private boolean mRunning;
        private int mTargetPosition;
        private android.view.View mTargetView;
        public SmoothScroller() {}
        private void onAnimation(int p0, int p1) {}
        public android.view.View findViewByPosition(int p0) { return null; }
        public int getChildCount() { return 0; }
        public int getChildPosition(android.view.View p0) { return 0; }
        public com.android.internal.widget.RecyclerView.LayoutManager getLayoutManager() { return null; }
        public int getTargetPosition() { return 0; }
        @java.lang.Deprecated
        public void instantScrollToPosition(int p0) {}
        public boolean isPendingInitialRun() { return false; }
        public boolean isRunning() { return false; }
        protected void normalize(android.graphics.PointF p0) {}
        protected void onChildAttachedToWindow(android.view.View p0) {}
        protected abstract void onSeekTargetStep(int p0, int p1, com.android.internal.widget.RecyclerView.State p2, com.android.internal.widget.RecyclerView.SmoothScroller.Action p3);
        protected abstract void onStart();
        protected abstract void onStop();
        protected abstract void onTargetFound(android.view.View p0, com.android.internal.widget.RecyclerView.State p1, com.android.internal.widget.RecyclerView.SmoothScroller.Action p2);
        public void setTargetPosition(int p0) {}
        void start(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.LayoutManager p1) {}
        protected final void stop() {}

        public static class Action {
            public static final int UNDEFINED_DURATION = -2147483648;
            private boolean mChanged;
            private int mConsecutiveUpdates;
            private int mDuration;
            private int mDx;
            private int mDy;
            private android.view.animation.Interpolator mInterpolator;
            private int mJumpToPosition;
            public Action(int p0, int p1) {}
            public Action(int p0, int p1, int p2) {}
            public Action(int p0, int p1, int p2, android.view.animation.Interpolator p3) {}
            private void validate() {}
            public int getDuration() { return 0; }
            public int getDx() { return 0; }
            public int getDy() { return 0; }
            public android.view.animation.Interpolator getInterpolator() { return null; }
            boolean hasJumpTarget() { return false; }
            public void jumpTo(int p0) {}
            void runIfNecessary(com.android.internal.widget.RecyclerView p0) {}
            public void setDuration(int p0) {}
            public void setDx(int p0) {}
            public void setDy(int p0) {}
            public void setInterpolator(android.view.animation.Interpolator p0) {}
            public void update(int p0, int p1, int p2, android.view.animation.Interpolator p3) {}
        }

        public static interface ScrollVectorProvider {
            public android.graphics.PointF computeScrollVectorForPosition(int p0);
        }
    }

    public static class State {
        static final int STEP_ANIMATIONS = 4;
        static final int STEP_LAYOUT = 2;
        static final int STEP_START = 1;
        private android.util.SparseArray<java.lang.Object> mData;
        int mDeletedInvisibleItemCountSincePreviousLayout;
        long mFocusedItemId;
        int mFocusedItemPosition;
        int mFocusedSubChildId;
        boolean mInPreLayout;
        boolean mIsMeasuring;
        int mItemCount;
        int mLayoutStep;
        int mPreviousLayoutItemCount;
        boolean mRunPredictiveAnimations;
        boolean mRunSimpleAnimations;
        boolean mStructureChanged;
        private int mTargetPosition;
        boolean mTrackOldChangeHolders;
        public State() {}
        void assertLayoutStep(int p0) {}
        public boolean didStructureChange() { return false; }
        public <T extends java.lang.Object> T get(int p0) { return null; }
        public int getItemCount() { return 0; }
        public int getTargetScrollPosition() { return 0; }
        public boolean hasTargetScrollPosition() { return false; }
        public boolean isMeasuring() { return false; }
        public boolean isPreLayout() { return false; }
        void prepareForNestedPrefetch(com.android.internal.widget.RecyclerView.Adapter p0) {}
        public void put(int p0, java.lang.Object p1) {}
        public void remove(int p0) {}
        com.android.internal.widget.RecyclerView.State reset() { return null; }
        public java.lang.String toString() { return null; }
        public boolean willRunPredictiveAnimations() { return false; }
        public boolean willRunSimpleAnimations() { return false; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface LayoutState {
        }
    }

    public static abstract class ViewCacheExtension {
        public ViewCacheExtension() {}
        public abstract android.view.View getViewForPositionAndType(com.android.internal.widget.RecyclerView.Recycler p0, int p1, int p2);
    }

    class ViewFlinger implements java.lang.Runnable {
        private boolean mEatRunOnAnimationRequest;
        android.view.animation.Interpolator mInterpolator;
        private int mLastFlingX;
        private int mLastFlingY;
        private boolean mReSchedulePostAnimationCallback;
        private android.widget.OverScroller mScroller;
        ViewFlinger(com.android.internal.widget.RecyclerView p0) {}
        private int computeScrollDuration(int p0, int p1, int p2, int p3) { return 0; }
        private void disableRunOnAnimationRequests() {}
        private float distanceInfluenceForSnapDuration(float p0) { return 0.0f; }
        private void enableRunOnAnimationRequests() {}
        public void fling(int p0, int p1) {}
        void postOnAnimation() {}
        public void run() {}
        public void smoothScrollBy(int p0, int p1) {}
        public void smoothScrollBy(int p0, int p1, int p2) {}
        public void smoothScrollBy(int p0, int p1, int p2, int p3) {}
        public void smoothScrollBy(int p0, int p1, int p2, android.view.animation.Interpolator p3) {}
        public void smoothScrollBy(int p0, int p1, android.view.animation.Interpolator p2) {}
        public void stop() {}
    }

    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final java.util.List<java.lang.Object> FULLUPDATE_PAYLOADS = null;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final android.view.View itemView = null;
        private int mFlags;
        private boolean mInChangeScrap;
        private int mIsRecyclableCount;
        long mItemId;
        int mItemViewType;
        java.lang.ref.WeakReference<com.android.internal.widget.RecyclerView> mNestedRecyclerView;
        int mOldPosition;
        com.android.internal.widget.RecyclerView mOwnerRecyclerView;
        java.util.List<java.lang.Object> mPayloads;
        int mPendingAccessibilityState;
        int mPosition;
        int mPreLayoutPosition;
        private com.android.internal.widget.RecyclerView.Recycler mScrapContainer;
        com.android.internal.widget.RecyclerView.ViewHolder mShadowedHolder;
        com.android.internal.widget.RecyclerView.ViewHolder mShadowingHolder;
        java.util.List<java.lang.Object> mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;
        public ViewHolder(android.view.View p0) {}
        private void createPayloadsIfNeeded() {}
        private boolean doesTransientStatePreventRecycling() { return false; }
        private void onEnteredHiddenState(com.android.internal.widget.RecyclerView p0) {}
        private void onLeftHiddenState(com.android.internal.widget.RecyclerView p0) {}
        private boolean shouldBeKeptAsChild() { return false; }
        void addChangePayload(java.lang.Object p0) {}
        void addFlags(int p0) {}
        void clearOldPosition() {}
        void clearPayload() {}
        void clearReturnedFromScrapFlag() {}
        void clearTmpDetachFlag() {}
        void flagRemovedAndOffsetPosition(int p0, int p1, boolean p2) {}
        public final int getAdapterPosition() { return 0; }
        public final long getItemId() { return 0L; }
        public final int getItemViewType() { return 0; }
        public final int getLayoutPosition() { return 0; }
        public final int getOldPosition() { return 0; }
        @java.lang.Deprecated
        public final int getPosition() { return 0; }
        java.util.List<java.lang.Object> getUnmodifiedPayloads() { return null; }
        boolean hasAnyOfTheFlags(int p0) { return false; }
        boolean isAdapterPositionUnknown() { return false; }
        boolean isBound() { return false; }
        boolean isInvalid() { return false; }
        public final boolean isRecyclable() { return false; }
        boolean isRemoved() { return false; }
        boolean isScrap() { return false; }
        boolean isTmpDetached() { return false; }
        boolean isUpdated() { return false; }
        boolean needsUpdate() { return false; }
        void offsetPosition(int p0, boolean p1) {}
        void resetInternal() {}
        void saveOldPosition() {}
        void setFlags(int p0, int p1) {}
        public final void setIsRecyclable(boolean p0) {}
        void setScrapContainer(com.android.internal.widget.RecyclerView.Recycler p0, boolean p1) {}
        boolean shouldIgnore() { return false; }
        void stopIgnoring() {}
        public java.lang.String toString() { return null; }
        void unScrap() {}
        boolean wasReturnedFromScrap() { return false; }
    }
}
