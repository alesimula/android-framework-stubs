package android.widget;

public abstract class AbsListView extends android.widget.AdapterView<android.widget.ListAdapter> implements android.text.TextWatcher, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.Filter.FilterListener, android.view.ViewTreeObserver.OnTouchModeChangeListener {
    private static final int CHECK_POSITION_SEARCH_DISTANCE = 20;
    public static final int CHOICE_MODE_MULTIPLE = 2;
    public static final int CHOICE_MODE_MULTIPLE_MODAL = 3;
    public static final int CHOICE_MODE_NONE = 0;
    public static final int CHOICE_MODE_SINGLE = 1;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final int INVALID_POINTER = -1;
    static final int LAYOUT_FORCE_BOTTOM = 3;
    static final int LAYOUT_FORCE_TOP = 1;
    static final int LAYOUT_MOVE_SELECTION = 6;
    static final int LAYOUT_NORMAL = 0;
    static final int LAYOUT_SET_SELECTION = 2;
    static final int LAYOUT_SPECIFIC = 4;
    static final int LAYOUT_SYNC = 5;
    static final int OVERSCROLL_LIMIT_DIVISOR = 3;
    private static final boolean PROFILE_FLINGING = false;
    private static final boolean PROFILE_SCROLLING = false;
    private static final java.lang.String TAG = "AbsListView";
    static final int TOUCH_MODE_DONE_WAITING = 2;
    static final int TOUCH_MODE_DOWN = 0;
    static final int TOUCH_MODE_FLING = 4;
    private static final int TOUCH_MODE_OFF = 1;
    private static final int TOUCH_MODE_ON = 0;
    static final int TOUCH_MODE_OVERFLING = 6;
    static final int TOUCH_MODE_OVERSCROLL = 5;
    static final int TOUCH_MODE_REST = -1;
    static final int TOUCH_MODE_SCROLL = 3;
    static final int TOUCH_MODE_TAP = 1;
    private static final int TOUCH_MODE_UNKNOWN = -1;
    public static final int TRANSCRIPT_MODE_ALWAYS_SCROLL = 2;
    public static final int TRANSCRIPT_MODE_DISABLED = 0;
    public static final int TRANSCRIPT_MODE_NORMAL = 1;
    private static boolean sContentCaptureReportingEnabledByDeviceConfig;
    static final android.view.animation.Interpolator sLinearInterpolator = null;
    private android.widget.AbsListView.ListItemAccessibilityDelegate mAccessibilityDelegate;
    private int mActivePointerId;
    android.widget.ListAdapter mAdapter;
    boolean mAdapterHasStableIds;
    private int mCacheColorHint;
    boolean mCachingActive;
    boolean mCachingStarted;
    android.util.SparseBooleanArray mCheckStates;
    android.util.LongSparseArray<java.lang.Integer> mCheckedIdStates;
    int mCheckedItemCount;
    android.view.ActionMode mChoiceActionMode;
    int mChoiceMode;
    private java.lang.Runnable mClearScrollingCache;
    private android.view.ContextMenu.ContextMenuInfo mContextMenuInfo;
    android.widget.AbsListView.AdapterDataSetObserver mDataSetObserver;
    private android.view.inputmethod.InputConnection mDefInputConnection;
    private boolean mDeferNotifyDataSetChanged;
    private float mDensityScale;
    private android.widget.DifferentialMotionFlingHelper mDifferentialMotionFlingHelper;
    private int mDirection;
    boolean mDrawSelectorOnTop;
    public android.widget.EdgeEffect mEdgeGlowBottom;
    public android.widget.EdgeEffect mEdgeGlowTop;
    private android.widget.FastScroller mFastScroll;
    boolean mFastScrollAlwaysVisible;
    boolean mFastScrollEnabled;
    private int mFastScrollStyle;
    private boolean mFiltered;
    private int mFirstPositionDistanceGuess;
    private boolean mFlingProfilingStarted;
    private android.widget.AbsListView.FlingRunnable mFlingRunnable;
    private android.os.StrictMode.Span mFlingStrictSpan;
    private boolean mForceTranscriptScroll;
    private boolean mGlobalLayoutListenerAddedFilter;
    private android.view.HapticScrollFeedbackProvider mHapticScrollFeedbackProvider;
    private boolean mHasPerformedLongPress;
    private boolean mIsChildViewEnabled;
    private boolean mIsDetaching;
    final boolean[] mIsScrap = null;
    private int mLastHandledItemCount;
    private int mLastPositionDistanceGuess;
    private int mLastScrollState;
    private int mLastTouchMode;
    int mLastY;
    int mLayoutMode;
    android.graphics.Rect mListPadding;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    int mMotionCorrection;
    int mMotionPosition;
    int mMotionViewNewTop;
    int mMotionViewOriginalTop;
    int mMotionX;
    int mMotionY;
    android.widget.AbsListView.MultiChoiceModeWrapper mMultiChoiceModeCallback;
    private int mNestedYOffset;
    private android.widget.AbsListView.OnScrollListener mOnScrollListener;
    private android.widget.AbsListView.OnScrollListener mOnScrollStateChangeListener;
    int mOverflingDistance;
    int mOverscrollDistance;
    int mOverscrollMax;
    private final java.lang.Thread mOwnerThread = null;
    private android.widget.AbsListView.CheckForKeyLongPress mPendingCheckForKeyLongPress;
    private android.widget.AbsListView.CheckForLongPress mPendingCheckForLongPress;
    private android.widget.AbsListView.CheckForTap mPendingCheckForTap;
    private android.widget.AbsListView.SavedState mPendingSync;
    private android.widget.AbsListView.PerformClick mPerformClick;
    android.widget.PopupWindow mPopup;
    private boolean mPopupHidden;
    java.lang.Runnable mPositionScrollAfterLayout;
    android.widget.AbsListView.AbsPositionScroller mPositionScroller;
    private int mPreviousOnScrollListenerState;
    private android.widget.AbsListView.InputConnectionWrapper mPublicInputConnection;
    final android.widget.AbsListView.RecycleBin mRecycler = null;
    private boolean mReportChildrenToContentCaptureOnNextUpdate;
    int mResurrectToPosition;
    private final int[] mScrollConsumed = null;
    android.view.View mScrollDown;
    private final int[] mScrollOffset = null;
    private boolean mScrollProfilingStarted;
    private android.os.StrictMode.Span mScrollStrictSpan;
    private boolean mScrollToTopEnabled;
    android.view.View mScrollUp;
    boolean mScrollingCacheEnabled;
    int mSelectedTop;
    int mSelectionBottomPadding;
    int mSelectionLeftPadding;
    int mSelectionRightPadding;
    int mSelectionTopPadding;
    android.graphics.drawable.Drawable mSelector;
    int mSelectorPosition;
    android.graphics.Rect mSelectorRect;
    private int[] mSelectorState;
    private boolean mSmoothScrollbarEnabled;
    boolean mStackFromBottom;
    private int mTapTimeoutMillis;
    android.widget.EditText mTextFilter;
    private boolean mTextFilterEnabled;
    private final float[] mTmpPoint = null;
    private android.graphics.Rect mTouchFrame;
    int mTouchMode;
    private java.lang.Runnable mTouchModeReset;
    private int mTouchSlop;
    private int mTranscriptMode;
    private float mVelocityScale;
    private android.view.VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;
    int mWidthMeasureSpec;
    public AbsListView(android.content.Context p0) { super((android.content.Context)null); }
    public AbsListView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AbsListView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AbsListView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private boolean acceptFilter() { return false; }
    private void addAccessibilityActionIfEnabled(android.view.accessibility.AccessibilityNodeInfo p0, boolean p1, android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction p2) {}
    private boolean canScrollDown() { return false; }
    private boolean canScrollUp() { return false; }
    private void clearScrollingCache() {}
    private int consumeFlingInStretch(int p0) { return 0; }
    private boolean contentFits() { return false; }
    private void createScrollingCache() {}
    private void createTextFilter(boolean p0) {}
    private void dismissPopup() {}
    private boolean doesTouchStopStretch() { return false; }
    private void drawSelector(android.graphics.Canvas p0) {}
    private void finishGlows() {}
    static int getDistance(android.graphics.Rect p0, android.graphics.Rect p1, int p2) { return 0; }
    private int[] getDrawableStateForSelector() { return null; }
    private android.widget.EditText getTextFilterInput() { return null; }
    private void initAbsListView() {}
    private void initDifferentialFlingHelperIfNotExists() {}
    private void initHapticScrollFeedbackProviderIfNotExists() {}
    private void initOrResetVelocityTracker() {}
    private void initVelocityTrackerIfNotExists() {}
    private void invalidateEdgeEffects() {}
    private boolean isItemClickable(android.view.View p0) { return false; }
    private boolean isOwnerThread() { return false; }
    private void onSecondaryPointerUp(android.view.MotionEvent p0) {}
    private void onTouchCancel() {}
    private void onTouchDown(android.view.MotionEvent p0) {}
    private void onTouchMove(android.view.MotionEvent p0, android.view.MotionEvent p1) {}
    private void onTouchUp(android.view.MotionEvent p0) {}
    private boolean performStylusButtonPressAction(android.view.MotionEvent p0) { return false; }
    private void positionPopup() {}
    private void positionSelector(int p0, android.view.View p1, boolean p2, float p3, float p4) {}
    private void recycleVelocityTracker() {}
    private int releaseGlow(int p0, int p1) { return 0; }
    private void reportActiveViewsToContentCapture() {}
    private void scrollIfNeeded(int p0, int p1, android.view.MotionEvent p2) {}
    private void setFastScrollerAlwaysVisibleUiThread(boolean p0) {}
    private void setFastScrollerEnabledUiThread(boolean p0) {}
    private void setItemViewLayoutParams(android.view.View p0, int p1) {}
    private static void setupDeviceConfigProperties() {}
    private boolean shouldAbsorb(android.widget.EdgeEffect p0, int p1) { return false; }
    private boolean shouldDisplayEdgeEffects() { return false; }
    private boolean showContextMenuForChildInternal(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    private boolean showContextMenuInternal(float p0, float p1, boolean p2) { return false; }
    private void showPopup() {}
    private boolean startScrollIfNeeded(int p0, int p1, android.view.MotionEvent p2) { return false; }
    private void stopEdgeGlowRecede(float p0) {}
    private void updateOnScreenCheckedViews() {}
    private void useDefaultSelector() {}
    public void addTouchables(java.util.ArrayList<android.view.View> p0) {}
    public void afterTextChanged(android.text.Editable p0) {}
    public void beforeTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public boolean canScrollList(int p0) { return false; }
    public boolean checkInputConnectionProxy(android.view.View p0) { return false; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    public void clearChoices() {}
    public void clearTextFilter() {}
    protected int computeVerticalScrollExtent() { return 0; }
    protected int computeVerticalScrollOffset() { return 0; }
    protected int computeVerticalScrollRange() { return 0; }
    void confirmCheckedPositionsById() {}
    android.view.ContextMenu.ContextMenuInfo createContextMenuInfo(android.view.View p0, int p1, long p2) { return null; }
    android.widget.AbsListView.AbsPositionScroller createPositionScroller() { return null; }
    public void deferNotifyDataSetChanged() {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    public void dispatchDrawableHotspotChanged(float p0, float p1) {}
    protected void dispatchSetPressed(boolean p0) {}
    public void draw(android.graphics.Canvas p0) {}
    protected void drawableStateChanged() {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    abstract void fillGap(boolean p0);
    int findClosestMotionRow(int p0) { return 0; }
    abstract int findMotionRow(int p0);
    public void fling(int p0) {}
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public android.widget.AbsListView.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    android.view.View getAccessibilityFocusedChild(android.view.View p0) { return null; }
    public int getBottomEdgeEffectColor() { return 0; }
    protected float getBottomFadingEdgeStrength() { return 0.0f; }
    protected int getBottomPaddingOffset() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public int getCacheColorHint() { return 0; }
    public int getCheckedItemCount() { return 0; }
    public long[] getCheckedItemIds() { return null; }
    public int getCheckedItemPosition() { return 0; }
    public android.util.SparseBooleanArray getCheckedItemPositions() { return null; }
    public int getChoiceMode() { return 0; }
    protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo() { return null; }
    public void getFocusedRect(android.graphics.Rect p0) {}
    int getFooterViewsCount() { return 0; }
    int getHeaderViewsCount() { return 0; }
    int getHeightForPosition(int p0) { return 0; }
    protected int getLeftPaddingOffset() { return 0; }
    public int getListPaddingBottom() { return 0; }
    public int getListPaddingLeft() { return 0; }
    public int getListPaddingRight() { return 0; }
    public int getListPaddingTop() { return 0; }
    protected int getRightPaddingOffset() { return 0; }
    @android.view.ViewDebug.ExportedProperty
    public android.view.View getSelectedView() { return null; }
    int getSelectionModeForAccessibility() { return 0; }
    public android.graphics.drawable.Drawable getSelector() { return null; }
    public int getSolidColor() { return 0; }
    public java.lang.CharSequence getTextFilter() { return null; }
    public int getTopEdgeEffectColor() { return 0; }
    protected float getTopFadingEdgeStrength() { return 0.0f; }
    protected int getTopPaddingOffset() { return 0; }
    public int getTranscriptMode() { return 0; }
    public int getVerticalScrollbarWidth() { return 0; }
    void handleBoundsChange() {}
    protected void handleDataChanged() {}
    protected boolean handleScrollBarDragging(android.view.MotionEvent p0) { return false; }
    public boolean hasTextFilter() { return false; }
    void hideSelector() {}
    protected void internalSetPadding(int p0, int p1, int p2, int p3) {}
    public void invalidateViews() {}
    void invokeOnItemScrollListener() {}
    public boolean isDrawSelectorOnTop() { return false; }
    public boolean isFastScrollAlwaysVisible() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isFastScrollEnabled() { return false; }
    protected boolean isInFilterMode() { return false; }
    public boolean isItemChecked(int p0) { return false; }
    protected boolean isPaddingOffsetRequired() { return false; }
    public boolean isScrollToTopEnabled() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isScrollingCacheEnabled() { return false; }
    public boolean isSelectedChildViewEnabled() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isSmoothScrollbarEnabled() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isStackFromBottom() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isTextFilterEnabled() { return false; }
    protected boolean isVerticalScrollBarHidden() { return false; }
    public void jumpDrawablesToCurrentState() {}
    void keyPressed() {}
    protected void layoutChildren() {}
    android.view.View obtainView(int p0, boolean[] p1) { return null; }
    protected void onAttachedToWindow() {}
    public void onCancelPendingInputEvents() {}
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p0) { return null; }
    protected void onDetachedFromWindow() {}
    protected void onDisplayHint(int p0) {}
    public void onFilterComplete(int p0) {}
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public void onGlobalLayout() {}
    public void onInitializeAccessibilityNodeInfoForItem(android.view.View p0, int p1, android.view.accessibility.AccessibilityNodeInfo p2) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean onInterceptHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean onNestedFling(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    public void onNestedScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void onNestedScrollAccepted(android.view.View p0, android.view.View p1, int p2) {}
    protected void onOverScrolled(int p0, int p1, boolean p2, boolean p3) {}
    public void onProvideContentCaptureStructure(android.view.ViewStructure p0, int p1) {}
    public boolean onRemoteAdapterConnected() { return false; }
    public void onRemoteAdapterDisconnected() {}
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public void onRtlPropertiesChanged(int p0) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public boolean onScrollToTop(int p0) { return false; }
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public boolean onStartNestedScroll(android.view.View p0, android.view.View p1, int p2) { return false; }
    public void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void onTouchModeChanged(boolean p0) {}
    public void onWindowFocusChanged(boolean p0) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public boolean performItemClick(android.view.View p0, int p1, long p2) { return false; }
    boolean performLongPress(android.view.View p0, int p1, long p2) { return false; }
    boolean performLongPress(android.view.View p0, int p1, long p2, float p3, float p4) { return false; }
    public int pointToPosition(int p0, int p1) { return 0; }
    public long pointToRowId(int p0, int p1) { return 0L; }
    void positionSelector(int p0, android.view.View p1) {}
    void positionSelectorLikeFocus(int p0, android.view.View p1) {}
    void positionSelectorLikeTouch(int p0, android.view.View p1, float p2, float p3) {}
    public void reclaimViews(java.util.List<android.view.View> p0) {}
    int reconcileSelectedPosition() { return 0; }
    void reportScrollStateChange(int p0) {}
    public void requestDisallowInterceptTouchEvent(boolean p0) {}
    public void requestLayout() {}
    void requestLayoutIfNecessary() {}
    void resetList() {}
    boolean resurrectSelection() { return false; }
    boolean resurrectSelectionIfNeeded() { return false; }
    public void scrollListBy(int p0) {}
    boolean sendToTextFilter(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public void setAdapter(android.widget.ListAdapter p0) {}
    public void setBottomEdgeEffectColor(int p0) {}
    public void setCacheColorHint(int p0) {}
    public void setChoiceMode(int p0) {}
    public void setDrawSelectorOnTop(boolean p0) {}
    public void setEdgeEffectColor(int p0) {}
    public void setFastScrollAlwaysVisible(boolean p0) {}
    public void setFastScrollEnabled(boolean p0) {}
    public void setFastScrollStyle(int p0) {}
    public void setFilterText(java.lang.String p0) {}
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    public void setFriction(float p0) {}
    public void setItemChecked(int p0, boolean p1) {}
    public void setMultiChoiceModeListener(android.widget.AbsListView.MultiChoiceModeListener p0) {}
    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener p0) {}
    protected void setOnScrollStateChangeListener(android.widget.AbsListView.OnScrollListener p0) {}
    public void setRecyclerListener(android.widget.AbsListView.RecyclerListener p0) {}
    public void setRemoteViewsAdapter(android.content.Intent p0) {}
    public void setScrollBarStyle(int p0) {}
    public void setScrollIndicators(android.view.View p0, android.view.View p1) {}
    public void setScrollToTopEnabled(boolean p0) {}
    public void setScrollingCacheEnabled(boolean p0) {}
    public void setSelectedChildViewEnabled(boolean p0) {}
    public void setSelectionFromTop(int p0, int p1) {}
    abstract void setSelectionInt(int p0);
    public void setSelector(int p0) {}
    public void setSelector(android.graphics.drawable.Drawable p0) {}
    public void setSmoothScrollbarEnabled(boolean p0) {}
    public void setStackFromBottom(boolean p0) {}
    public void setTextFilterEnabled(boolean p0) {}
    public void setTopEdgeEffectColor(int p0) {}
    public void setTranscriptMode(int p0) {}
    public void setVelocityScale(float p0) {}
    public void setVerticalScrollbarPosition(int p0) {}
    public final boolean shouldDrawSelector() { return false; }
    boolean shouldShowSelector() { return false; }
    public boolean showContextMenu() { return false; }
    public boolean showContextMenu(float p0, float p1) { return false; }
    public boolean showContextMenuForChild(android.view.View p0) { return false; }
    public boolean showContextMenuForChild(android.view.View p0, float p1, float p2) { return false; }
    public void smoothScrollBy(int p0, int p1) {}
    void smoothScrollBy(int p0, int p1, boolean p2, boolean p3) {}
    void smoothScrollByOffset(int p0) {}
    public void smoothScrollToPosition(int p0) {}
    public void smoothScrollToPosition(int p0, int p1) {}
    public void smoothScrollToPositionFromTop(int p0, int p1) {}
    public void smoothScrollToPositionFromTop(int p0, int p1, int p2) {}
    boolean touchModeDrawsInPressedState() { return false; }
    boolean trackMotionScroll(int p0, int p1) { return false; }
    void updateScrollIndicators() {}
    void updateSelectorState() {}
    public boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }

    static abstract class AbsPositionScroller {
        AbsPositionScroller() {}
        public abstract void start(int p0);
        public abstract void start(int p0, int p1);
        public abstract void startWithOffset(int p0, int p1);
        public abstract void startWithOffset(int p0, int p1, int p2);
        public abstract void stop();
    }

    class AdapterDataSetObserver extends android.widget.AdapterView<android.widget.ListAdapter>.AdapterDataSetObserver {
        AdapterDataSetObserver(android.widget.AbsListView p0) { super(null); }
        public void onChanged() {}
        public void onInvalidated() {}
    }

    private class CheckForKeyLongPress extends android.widget.AbsListView.WindowRunnnable implements java.lang.Runnable {
        private CheckForKeyLongPress(android.widget.AbsListView p0) { super(null); }
        public void run() {}
    }

    private class CheckForLongPress extends android.widget.AbsListView.WindowRunnnable implements java.lang.Runnable {
        private static final int INVALID_COORD = -1;
        private float mX;
        private float mY;
        private CheckForLongPress(android.widget.AbsListView p0) { super(null); }
        private void setCoords(float p0, float p1) {}
        public void run() {}
    }

    private final class CheckForTap implements java.lang.Runnable {
        float x;
        float y;
        private CheckForTap(android.widget.AbsListView p0) {}
        public void run() {}
    }

    private static class DeviceConfigChangeListener {
        private DeviceConfigChangeListener() {}
        public void onPropertiesChanged(android.provider.DeviceConfig.Properties p0) {}
    }

    private class DifferentialFlingTarget implements android.widget.DifferentialMotionFlingHelper.DifferentialMotionFlingTarget {
        private DifferentialFlingTarget(android.widget.AbsListView p0) {}
        public float getScaledScrollFactor() { return 0.0f; }
        public boolean startDifferentialMotionFling(float p0) { return false; }
        public void stopDifferentialMotionFling() {}
    }

    private class FlingRunnable implements java.lang.Runnable {
        private static final int FLYWHEEL_TIMEOUT = 40;
        private final java.lang.Runnable mCheckFlywheel = null;
        private int mLastFlingY;
        private final android.widget.OverScroller mScroller = null;
        private boolean mSuppressIdleStateChangeCall;
        FlingRunnable(android.widget.AbsListView p0) {}
        void edgeReached(int p0) {}
        void endFling() {}
        void flywheelTouch() {}
        float getSplineFlingDistance(int p0) { return 0.0f; }
        public void run() {}
        void start(int p0) {}
        void startOverfling(int p0) {}
        void startScroll(int p0, int p1, boolean p2, boolean p3) {}
        void startSpringback() {}
    }

    private class InputConnectionWrapper implements android.view.inputmethod.InputConnection {
        private final android.view.inputmethod.EditorInfo mOutAttrs = null;
        private android.view.inputmethod.InputConnection mTarget;
        public InputConnectionWrapper(android.widget.AbsListView p0, android.view.inputmethod.EditorInfo p1) {}
        private android.view.inputmethod.InputConnection getTarget() { return null; }
        public boolean beginBatchEdit() { return false; }
        public boolean clearMetaKeyStates(int p0) { return false; }
        public void closeConnection() {}
        public boolean commitCompletion(android.view.inputmethod.CompletionInfo p0) { return false; }
        public boolean commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2) { return false; }
        public boolean commitCorrection(android.view.inputmethod.CorrectionInfo p0) { return false; }
        public boolean commitText(java.lang.CharSequence p0, int p1) { return false; }
        public boolean deleteSurroundingText(int p0, int p1) { return false; }
        public boolean deleteSurroundingTextInCodePoints(int p0, int p1) { return false; }
        public boolean endBatchEdit() { return false; }
        public boolean finishComposingText() { return false; }
        public int getCursorCapsMode(int p0) { return 0; }
        public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1) { return null; }
        public android.os.Handler getHandler() { return null; }
        public java.lang.CharSequence getSelectedText(int p0) { return null; }
        public android.view.inputmethod.SurroundingText getSurroundingText(int p0, int p1, int p2) { return null; }
        public java.lang.CharSequence getTextAfterCursor(int p0, int p1) { return null; }
        public java.lang.CharSequence getTextBeforeCursor(int p0, int p1) { return null; }
        public boolean performContextMenuAction(int p0) { return false; }
        public boolean performEditorAction(int p0) { return false; }
        public boolean performPrivateCommand(java.lang.String p0, android.os.Bundle p1) { return false; }
        public boolean reportFullscreenMode(boolean p0) { return false; }
        public boolean requestCursorUpdates(int p0) { return false; }
        public boolean requestCursorUpdates(int p0, int p1) { return false; }
        public boolean sendKeyEvent(android.view.KeyEvent p0) { return false; }
        public boolean setComposingRegion(int p0, int p1) { return false; }
        public boolean setComposingText(java.lang.CharSequence p0, int p1) { return false; }
        public boolean setSelection(int p0, int p1) { return false; }
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        @android.view.ViewDebug.ExportedProperty(category="list")
        boolean forceAdd;
        boolean isEnabled;
        long itemId;
        @android.view.ViewDebug.ExportedProperty(category="list")
        boolean recycledHeaderFooter;
        int scrappedFromPosition;
        @android.view.ViewDebug.ExportedProperty(category="list", mapping={@android.view.ViewDebug.IntToString(from=-1, to="ITEM_VIEW_TYPE_IGNORE"), @android.view.ViewDebug.IntToString(from=-2, to="ITEM_VIEW_TYPE_HEADER_OR_FOOTER")})
        int viewType;
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, int p2) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    }

    class ListItemAccessibilityDelegate extends android.view.View.AccessibilityDelegate {
        ListItemAccessibilityDelegate(android.widget.AbsListView p0) { super(); }
        public void onInitializeAccessibilityNodeInfo(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        public boolean performAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
    }

    public static interface MultiChoiceModeListener extends android.view.ActionMode.Callback {
        public void onItemCheckedStateChanged(android.view.ActionMode p0, int p1, long p2, boolean p3);
    }

    class MultiChoiceModeWrapper implements android.widget.AbsListView.MultiChoiceModeListener {
        private android.widget.AbsListView.MultiChoiceModeListener mWrapped;
        MultiChoiceModeWrapper(android.widget.AbsListView p0) {}
        public boolean hasWrappedCallback() { return false; }
        public boolean onActionItemClicked(android.view.ActionMode p0, android.view.MenuItem p1) { return false; }
        public boolean onCreateActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
        public void onDestroyActionMode(android.view.ActionMode p0) {}
        public void onItemCheckedStateChanged(android.view.ActionMode p0, int p1, long p2, boolean p3) {}
        public boolean onPrepareActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
        public void setWrapped(android.widget.AbsListView.MultiChoiceModeListener p0) {}
    }

    public static interface OnScrollListener {
        public static final int SCROLL_STATE_FLING = 2;
        public static final int SCROLL_STATE_IDLE = 0;
        public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
        public void onScroll(android.widget.AbsListView p0, int p1, int p2, int p3);
        public void onScrollStateChanged(android.widget.AbsListView p0, int p1);
    }

    private class PerformClick extends android.widget.AbsListView.WindowRunnnable implements java.lang.Runnable {
        int mClickMotionPosition;
        private PerformClick(android.widget.AbsListView p0) { super(null); }
        public void run() {}
    }

    class PositionScroller extends android.widget.AbsListView.AbsPositionScroller implements java.lang.Runnable {
        private static final int MOVE_DOWN_BOUND = 3;
        private static final int MOVE_DOWN_POS = 1;
        private static final int MOVE_OFFSET = 5;
        private static final int MOVE_UP_BOUND = 4;
        private static final int MOVE_UP_POS = 2;
        private static final int SCROLL_DURATION = 200;
        private int mBoundPos;
        private final int mExtraScroll = 0;
        private int mLastSeenPos;
        private int mMode;
        private int mOffsetFromTop;
        private int mScrollDuration;
        private int mTargetPos;
        PositionScroller(android.widget.AbsListView p0) { super(); }
        private void scrollToVisible(int p0, int p1, int p2) {}
        public void run() {}
        public void start(int p0) {}
        public void start(int p0, int p1) {}
        public void startWithOffset(int p0, int p1) {}
        public void startWithOffset(int p0, int p1, int p2) {}
        public void stop() {}
    }

    class RecycleBin {
        private android.view.View[] mActiveViews;
        private java.util.ArrayList<android.view.View> mCurrentScrap;
        private int mFirstActivePosition;
        private android.widget.AbsListView.RecyclerListener mRecyclerListener;
        private java.util.ArrayList<android.view.View>[] mScrapViews;
        private java.util.ArrayList<android.view.View> mSkippedScrap;
        private android.util.SparseArray<android.view.View> mTransientStateViews;
        private android.util.LongSparseArray<android.view.View> mTransientStateViewsById;
        private int mViewTypeCount;
        RecycleBin(android.widget.AbsListView p0) {}
        private void clearScrap(java.util.ArrayList<android.view.View> p0) {}
        private void clearScrapForRebind(android.view.View p0) {}
        private java.util.ArrayList<android.view.View> getSkippedScrap() { return null; }
        private void pruneScrapViews() {}
        private void removeDetachedView(android.view.View p0, boolean p1) {}
        private android.view.View retrieveFromScrap(java.util.ArrayList<android.view.View> p0, int p1) { return null; }
        void addScrapView(android.view.View p0, int p1) {}
        void clear() {}
        void clearTransientStateViews() {}
        void fillActiveViews(int p0, int p1) {}
        void fullyDetachScrapViews() {}
        android.view.View getActiveView(int p0) { return null; }
        android.view.View getScrapView(int p0) { return null; }
        android.view.View getTransientStateView(int p0) { return null; }
        public void markChildrenDirty() {}
        void reclaimScrapViews(java.util.List<android.view.View> p0) {}
        void removeSkippedScrap() {}
        void scrapActiveViews() {}
        void setCacheColorHint(int p0) {}
        public void setViewTypeCount(int p0) {}
        public boolean shouldRecycleViewType(int p0) { return false; }
    }

    public static interface RecyclerListener {
        public void onMovedToScrapHeap(android.view.View p0);
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<android.widget.AbsListView.SavedState> CREATOR = null;
        android.util.LongSparseArray<java.lang.Integer> checkIdState;
        android.util.SparseBooleanArray checkState;
        int checkedItemCount;
        java.lang.String filter;
        long firstId;
        int height;
        boolean inActionMode;
        int position;
        long selectedId;
        int viewTop;
        private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static interface SelectionBoundsAdjuster {
        public void adjustListItemSelectionBounds(android.graphics.Rect p0);
    }

    private class WindowRunnnable {
        private int mOriginalAttachCount;
        private WindowRunnnable(android.widget.AbsListView p0) {}
        public void rememberWindowAttachCount() {}
        public boolean sameWindow() { return false; }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.AbsListView> {
        private int mCacheColorHintId;
        private int mChoiceModeId;
        private int mDrawSelectorOnTopId;
        private int mFastScrollEnabledId;
        private int mListSelectorId;
        private boolean mPropertiesMapped;
        private int mScrollingCacheId;
        private int mSmoothScrollbarId;
        private int mStackFromBottomId;
        private int mTextFilterEnabledId;
        private int mTranscriptModeId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.AbsListView p0, android.view.inspector.PropertyReader p1) {}
    }
}
