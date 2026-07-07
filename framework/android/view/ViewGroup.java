package android.view;

public abstract class ViewGroup extends android.view.View implements android.view.ViewParent, android.view.ViewManager {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final int ARRAY_INITIAL_CAPACITY = 12;
    private static final int CHILD_LEFT_INDEX = 0;
    private static final int CHILD_TOP_INDEX = 1;
    protected static final int CLIP_TO_PADDING_MASK = 34;
    private static final boolean DBG = false;
    private static final int[] DESCENDANT_FOCUSABILITY_FLAGS = null;
    private static final int FLAG_ADD_STATES_FROM_CHILDREN = 8192;
    @java.lang.Deprecated
    private static final int FLAG_ALWAYS_DRAWN_WITH_CACHE = 16384;
    @java.lang.Deprecated
    private static final int FLAG_ANIMATION_CACHE = 64;
    static final int FLAG_ANIMATION_DONE = 16;
    @java.lang.Deprecated
    private static final int FLAG_CHILDREN_DRAWN_WITH_CACHE = 32768;
    static final int FLAG_CLEAR_TRANSFORMATION = 256;
    static final int FLAG_CLIP_CHILDREN = 1;
    private static final int FLAG_CLIP_TO_PADDING = 2;
    protected static final int FLAG_DISALLOW_INTERCEPT = 524288;
    static final int FLAG_INVALIDATE_REQUIRED = 4;
    static final int FLAG_IS_TRANSITION_GROUP = 16777216;
    static final int FLAG_IS_TRANSITION_GROUP_SET = 33554432;
    private static final int FLAG_LAYOUT_MODE_WAS_EXPLICITLY_SET = 8388608;
    private static final int FLAG_MASK_FOCUSABILITY = 393216;
    private static final int FLAG_NOTIFY_ANIMATION_LISTENER = 512;
    private static final int FLAG_NOTIFY_CHILDREN_ON_DRAWABLE_STATE_CHANGE = 65536;
    static final int FLAG_OPTIMIZE_INVALIDATE = 128;
    private static final int FLAG_PADDING_NOT_NULL = 32;
    private static final int FLAG_PREVENT_DISPATCH_ATTACHED_TO_WINDOW = 4194304;
    private static final int FLAG_PROPAGATED_FRAME_RATE = 1073741824;
    private static final int FLAG_RUN_ANIMATION = 8;
    private static final int FLAG_SHOW_CONTEXT_MENU_WITH_COORDS = 536870912;
    private static final int FLAG_SPLIT_MOTION_EVENTS = 2097152;
    private static final int FLAG_START_ACTION_MODE_FOR_CHILD_IS_NOT_TYPED = 268435456;
    private static final int FLAG_START_ACTION_MODE_FOR_CHILD_IS_TYPED = 134217728;
    protected static final int FLAG_SUPPORT_STATIC_TRANSFORMATIONS = 2048;
    static final int FLAG_TOUCHSCREEN_BLOCKS_FOCUS = 67108864;
    protected static final int FLAG_USE_CHILD_DRAWING_ORDER = 1024;
    public static final int FOCUS_AFTER_DESCENDANTS = 262144;
    public static final int FOCUS_BEFORE_DESCENDANTS = 131072;
    public static final int FOCUS_BLOCK_DESCENDANTS = 393216;
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static int LAYOUT_MODE_DEFAULT;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;
    private static final int LAYOUT_MODE_UNDEFINED = -1;
    @java.lang.Deprecated
    public static final int PERSISTENT_ALL_CACHES = 3;
    @java.lang.Deprecated
    public static final int PERSISTENT_ANIMATION_CACHE = 1;
    @java.lang.Deprecated
    public static final int PERSISTENT_NO_CACHE = 0;
    @java.lang.Deprecated
    public static final int PERSISTENT_SCROLLING_CACHE = 2;
    private static final android.view.ActionMode SENTINEL_ACTION_MODE = null;
    private static final java.lang.String TAG = "ViewGroup";
    private static float[] sDebugLines;
    private static boolean sRestrictViewGroupAccessibilityEventPopulation;
    private static boolean sToolkitViewGroupFrameRateApiFlagValue;
    private android.view.animation.Animation.AnimationListener mAnimationListener;
    android.graphics.Paint mCachePaint;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    private int mChildCountWithTransientState;
    private android.view.animation.Transformation mChildTransformation;
    int mChildUnhandledKeyListeners;
    private android.view.View[] mChildren;
    private int mChildrenCount;
    private java.util.HashSet<android.view.View> mChildrenInterestedInDrag;
    private android.view.View mCurrentDragChild;
    private android.view.DragEvent mCurrentDragStartEvent;
    private android.view.View mDefaultFocus;
    protected java.util.ArrayList<android.view.View> mDisappearingChildren;
    private android.view.ViewGroup.HoverTarget mFirstHoverTarget;
    private android.view.ViewGroup.TouchTarget mFirstTouchTarget;
    private android.view.View mFocused;
    android.view.View mFocusedInCluster;
    @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(equals=1, mask=1, name="CLIP_CHILDREN"), @android.view.ViewDebug.FlagToString(equals=2, mask=2, name="CLIP_TO_PADDING"), @android.view.ViewDebug.FlagToString(equals=32, mask=32, name="PADDING_NOT_NULL")}, formatToHexString=true)
    protected int mGroupFlags;
    private boolean mHoveredSelf;
    private int mInsetsAnimationDispatchMode;
    android.graphics.RectF mInvalidateRegion;
    android.view.animation.Transformation mInvalidationTransformation;
    private boolean mIsInterestedInDrag;
    @android.view.ViewDebug.ExportedProperty(category="events")
    private int mLastTouchDownIndex;
    @android.view.ViewDebug.ExportedProperty(category="events")
    private long mLastTouchDownTime;
    @android.view.ViewDebug.ExportedProperty(category="events")
    private float mLastTouchDownX;
    @android.view.ViewDebug.ExportedProperty(category="events")
    private float mLastTouchDownY;
    private android.view.animation.LayoutAnimationController mLayoutAnimationController;
    private boolean mLayoutCalledWhileSuppressed;
    private int mLayoutMode;
    private android.animation.LayoutTransition.TransitionListener mLayoutTransitionListener;
    private android.graphics.PointF mLocalPoint;
    private int mNestedScrollAxes;
    protected android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    protected int mPersistentDrawingCache;
    private java.util.ArrayList<android.view.View> mPreSortedChildren;
    boolean mSuppressLayout;
    private int[] mTempLocation;
    private android.graphics.Point mTempPoint;
    private float[] mTempPosition;
    private android.graphics.Rect mTempRect;
    private android.view.View mTooltipHoverTarget;
    private boolean mTooltipHoveredSelf;
    private android.util.IntArray mTransientIndices;
    private java.util.List<android.view.View> mTransientViews;
    private android.animation.LayoutTransition mTransition;
    private java.util.ArrayList<android.view.View> mTransitioningViews;
    private java.util.ArrayList<android.view.View> mVisibilityChangingChildren;
    public ViewGroup(android.content.Context p0) { super((android.content.Context)null); }
    public ViewGroup(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ViewGroup(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ViewGroup(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void addDisappearingView(android.view.View p0) {}
    private void addInArray(android.view.View p0, int p1) {}
    private android.view.ViewGroup.TouchTarget addTouchTarget(android.view.View p0, int p1) { return null; }
    private void addViewInner(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2, boolean p3) {}
    private static void applyOpToRegionByBounds(android.graphics.Region p0, android.view.View p1, android.graphics.Region.Op p2) {}
    private void bindLayoutAnimation(android.view.View p0) {}
    private android.view.WindowInsets brokenDispatchApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    private void cancelAndClearTouchTargets(android.view.MotionEvent p0) {}
    private void cancelHoverTarget(android.view.View p0) {}
    private void cancelTouchTarget(android.view.View p0) {}
    private void clearCachedLayoutMode() {}
    private void clearTouchTargets() {}
    private android.view.PointerIcon dispatchResolvePointerIcon(android.view.MotionEvent p0, int p1, android.view.View p2) { return null; }
    private boolean dispatchTooltipHoverEvent(android.view.MotionEvent p0, android.view.View p1) { return false; }
    private boolean dispatchTransformedGenericPointerEvent(android.view.MotionEvent p0, android.view.View p1) { return false; }
    private boolean dispatchTransformedTouchEvent(android.view.MotionEvent p0, boolean p1, android.view.View p2, int p3) { return false; }
    private static void drawCorner(android.graphics.Canvas p0, android.graphics.Paint p1, int p2, int p3, int p4, int p5, int p6) {}
    private static void drawRect(android.graphics.Canvas p0, android.graphics.Paint p1, int p2, int p3, int p4, int p5) {}
    private static void drawRectCorners(android.graphics.Canvas p0, int p1, int p2, int p3, int p4, android.graphics.Paint p5, int p6, int p7) {}
    private void exitHoverTargets() {}
    private void exitTooltipHoverTargets() {}
    private static void fillDifference(android.graphics.Canvas p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, android.graphics.Paint p9) {}
    private static void fillRect(android.graphics.Canvas p0, android.graphics.Paint p1, int p2, int p3, int p4, int p5) {}
    private android.view.View findChildWithAccessibilityFocus() { return null; }
    private int getAndVerifyPreorderedIndex(int p0, int p1, boolean p2) { return 0; }
    private static android.view.View getAndVerifyPreorderedView(java.util.ArrayList<android.view.View> p0, android.view.View[] p1, int p2) { return null; }
    private android.view.autofill.AutofillManager getAutofillManager() { return null; }
    public static int getChildMeasureSpec(int p0, int p1, int p2) { return 0; }
    private android.view.ViewGroup.ChildListForAutoFillOrContentCapture getChildrenForAutofill(int p0) { return null; }
    private android.view.ViewGroup.ChildListForAutoFillOrContentCapture getChildrenForContentCapture() { return null; }
    private android.graphics.PointF getLocalPoint() { return null; }
    private java.util.Comparator<android.view.View> getScrollToTopComparator(int p0) { return null; }
    private float[] getTempLocationF() { return null; }
    private android.graphics.Point getTempPoint() { return null; }
    private android.graphics.Rect getTempRect() { return null; }
    private android.view.ViewGroup.TouchTarget getTouchTarget(android.view.View p0) { return null; }
    private android.view.MotionEvent getTransformedMotionEvent(android.view.MotionEvent p0, android.view.View p1) { return null; }
    private boolean hasBooleanFlag(int p0) { return false; }
    private boolean hasChildWithZ() { return false; }
    private void initFromAttributes(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) {}
    private void initViewGroup() {}
    private boolean isOnTop(android.view.View p0, android.view.View p1, java.util.ArrayList<android.view.View> p2) { return false; }
    private android.view.WindowInsets newDispatchApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    private void notifyAnimationListener() {}
    private static android.view.MotionEvent obtainMotionEventNoHistoryOrSelf(android.view.MotionEvent p0) { return null; }
    private void populateChildrenForAutofill(java.util.ArrayList<android.view.View> p0, int p1) {}
    private void populateChildrenForContentCapture(java.util.ArrayList<android.view.View> p0) {}
    private static void projectToParentSpace(android.view.View p0, android.graphics.RectF p1) {}
    private void recreateChildDisplayList(android.view.View p0) {}
    private void removeFromArray(int p0) {}
    private void removeFromArray(int p0, int p1) {}
    private void removePointersFromTouchTargets(int p0) {}
    private void removeViewInternal(int p0, android.view.View p1) {}
    private boolean removeViewInternal(android.view.View p0) { return false; }
    private void removeViewsInternal(int p0, int p1) {}
    private static boolean resetCancelNextUpFlag(android.view.View p0) { return false; }
    private void resetTouchState() {}
    private boolean restoreFocusInClusterInternal(int p0) { return false; }
    private void setBooleanFlag(int p0, boolean p1) {}
    private void setLayoutMode(int p0, boolean p1) {}
    private void setTouchscreenBlocksFocusNoRefocus(boolean p0) {}
    private boolean shouldAlwaysIncludeWebview(android.view.autofill.AutofillManager p0) { return false; }
    private boolean shouldIncludeAllChildrenViewWithAutofillTypeNotNone(android.view.autofill.AutofillManager p0) { return false; }
    private boolean shouldIncludeAllChildrenViews(android.view.autofill.AutofillManager p0) { return false; }
    private boolean shouldIncludeInvisibleView(android.view.autofill.AutofillManager p0) { return false; }
    private static int sign(int p0) { return 0; }
    private void touchAccessibilityNodeProviderIfNeeded(android.view.View p0) {}
    public void addChildrenForAccessibility(java.util.ArrayList<android.view.View> p0) {}
    public void addExtraDataToAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0, java.lang.String p1, android.os.Bundle p2) {}
    public void addFocusables(java.util.ArrayList<android.view.View> p0, int p1, int p2) {}
    public void addKeyboardNavigationClusters(java.util.Collection<android.view.View> p0, int p1) {}
    public boolean addStatesFromChildren() { return false; }
    public void addTouchables(java.util.ArrayList<android.view.View> p0) {}
    public void addTransientView(android.view.View p0, int p1) {}
    public void addView(android.view.View p0) {}
    public void addView(android.view.View p0, int p1) {}
    public void addView(android.view.View p0, int p1, int p2) {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    protected boolean addViewInLayout(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) { return false; }
    protected boolean addViewInLayout(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2, boolean p3) { return false; }
    protected void attachLayoutAnimationParameters(android.view.View p0, android.view.ViewGroup.LayoutParams p1, int p2, int p3) {}
    protected void attachViewToParent(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public void bringChildToFront(android.view.View p0) {}
    java.util.ArrayList<android.view.View> buildOrderedChildList() { return null; }
    public java.util.ArrayList<android.view.View> buildTouchDispatchChildList() { return null; }
    void calculateAccessibilityDataSensitive() {}
    protected boolean canAnimate() { return false; }
    public void captureTransitioningViews(java.util.List<android.view.View> p0) {}
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    public void childDrawableStateChanged(android.view.View p0) {}
    public void childHasTransientStateChanged(android.view.View p0, boolean p1) {}
    protected void cleanupLayoutState(android.view.View p0) {}
    public void clearChildFocus(android.view.View p0) {}
    void clearDefaultFocus(android.view.View p0) {}
    public void clearDisappearingChildren() {}
    public void clearFocus() {}
    void clearFocusedInCluster() {}
    void clearFocusedInCluster(android.view.View p0) {}
    android.graphics.Insets computeOpticalInsets() { return null; }
    public android.graphics.Bitmap createSnapshot(android.view.ViewDebug.CanvasProvider p0, boolean p1) { return null; }
    protected void debug(int p0) {}
    void decrementChildUnhandledKeyListeners() {}
    protected void destroyHardwareResources() {}
    protected void detachAllViewsFromParent() {}
    protected void detachViewFromParent(int p0) {}
    protected void detachViewFromParent(android.view.View p0) {}
    protected void detachViewsFromParent(int p0, int p1) {}
    public boolean dispatchActivityResult(java.lang.String p0, int p1, int p2, android.content.Intent p3) { return false; }
    public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    void dispatchAttachedToWindow(android.view.View.AttachInfo p0, int p1) {}
    void dispatchCancelPendingInputEvents() {}
    public boolean dispatchCapturedPointerEvent(android.view.MotionEvent p0) { return false; }
    void dispatchCollectViewAttributes(android.view.View.AttachInfo p0, int p1) {}
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}
    public void dispatchCreateViewTranslationRequest(java.util.Map<android.view.autofill.AutofillId, long[]> p0, int[] p1, android.view.translation.TranslationCapability p2, java.util.List<android.view.translation.ViewTranslationRequest> p3) {}
    void dispatchDetachedFromWindow() {}
    public void dispatchDisplayHint(int p0) {}
    boolean dispatchDragEnterExitInPreN(android.view.DragEvent p0) { return false; }
    public boolean dispatchDragEvent(android.view.DragEvent p0) { return false; }
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    public void dispatchDrawableHotspotChanged(float p0, float p1) {}
    public void dispatchFinishTemporaryDetach() {}
    protected void dispatchFreezeSelfOnly(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected boolean dispatchGenericFocusedEvent(android.view.MotionEvent p0) { return false; }
    protected boolean dispatchGenericPointerEvent(android.view.MotionEvent p0) { return false; }
    protected void dispatchGetDisplayList() {}
    protected boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    void dispatchMovedToDisplay(android.view.Display p0, android.content.res.Configuration p1) {}
    public void dispatchPointerCaptureChanged(boolean p0) {}
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public void dispatchProvideAutofillStructure(android.view.ViewStructure p0, int p1) {}
    public void dispatchProvideContentCaptureStructure() {}
    public void dispatchProvideStructure(android.view.ViewStructure p0) {}
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    void dispatchScreenStateChanged(int p0) {}
    public void dispatchScrollCaptureSearch(android.graphics.Rect p0, android.graphics.Point p1, java.util.function.Consumer<android.view.ScrollCaptureTarget> p2) {}
    public boolean dispatchScrollToTop(int p0) { return false; }
    public void dispatchSetActivated(boolean p0) {}
    protected void dispatchSetPressed(boolean p0) {}
    public void dispatchSetSelected(boolean p0) {}
    public void dispatchStartTemporaryDetach() {}
    @java.lang.Deprecated
    public void dispatchSystemUiVisibilityChanged(int p0) {}
    protected void dispatchThawSelfOnly(android.util.SparseArray<android.os.Parcelable> p0) {}
    boolean dispatchTooltipHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    android.view.View dispatchUnhandledKeyEvent(android.view.KeyEvent p0) { return null; }
    public boolean dispatchUnhandledMove(android.view.View p0, int p1) { return false; }
    void dispatchViewAdded(android.view.View p0) {}
    void dispatchViewRemoved(android.view.View p0) {}
    boolean dispatchVisibilityAggregated(boolean p0) { return false; }
    protected void dispatchVisibilityChanged(android.view.View p0, int p1) {}
    public void dispatchWindowFocusChanged(boolean p0) {}
    public void dispatchWindowInsetsAnimationEnd(android.view.WindowInsetsAnimation p0) {}
    public void dispatchWindowInsetsAnimationPrepare(android.view.WindowInsetsAnimation p0) {}
    public android.view.WindowInsets dispatchWindowInsetsAnimationProgress(android.view.WindowInsets p0, java.util.List<android.view.WindowInsetsAnimation> p1) { return null; }
    public android.view.WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(android.view.WindowInsetsAnimation p0, android.view.WindowInsetsAnimation.Bounds p1) { return null; }
    @java.lang.Deprecated
    public void dispatchWindowSystemUiVisiblityChanged(int p0) {}
    public void dispatchWindowVisibilityChanged(int p0) {}
    protected boolean drawChild(android.graphics.Canvas p0, android.view.View p1, long p2) { return false; }
    protected void drawableStateChanged() {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    public void endViewTransition(android.view.View p0) {}
    public void findAutofillableViewsByTraversal(java.util.List<android.view.View> p0) {}
    public android.view.View findFocus() { return null; }
    android.view.View findFrontmostDroppableChildAt(float p0, float p1, android.graphics.PointF p2) { return null; }
    public void findNamedViews(java.util.Map<java.lang.String, android.view.View> p0) {}
    public android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcherForChild(android.view.View p0, android.view.View p1) { return null; }
    public android.view.View findViewByAccessibilityIdTraversal(int p0) { return null; }
    public android.view.View findViewByAutofillIdTraversal(int p0) { return null; }
    protected <T extends android.view.View> T findViewByPredicateTraversal(java.util.function.Predicate<android.view.View> p0, android.view.View p1) { return null; }
    protected <T extends android.view.View> T findViewTraversal(int p0) { return null; }
    protected <T extends android.view.View> T findViewWithTagTraversal(java.lang.Object p0) { return null; }
    public void findViewsWithText(java.util.ArrayList<android.view.View> p0, java.lang.CharSequence p1, int p2) {}
    void finishAnimatingView(android.view.View p0, android.view.animation.Animation p1) {}
    public android.view.View focusSearch(android.view.View p0, int p1) { return null; }
    public void focusableViewAvailable(android.view.View p0) {}
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.content.Context p0, android.util.AttributeSet p1) { return null; }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public android.view.View getChildAt(int p0) { return null; }
    public int getChildCount() { return 0; }
    public final int getChildDrawingOrder(int p0) { return 0; }
    protected int getChildDrawingOrder(int p0, int p1) { return 0; }
    public boolean getChildLocalHitRegion(android.view.View p0, android.graphics.Region p1, android.graphics.Matrix p2, boolean p3) { return false; }
    protected boolean getChildStaticTransformation(android.view.View p0, android.view.animation.Transformation p1) { return false; }
    android.view.animation.Transformation getChildTransformation() { return null; }
    public boolean getChildVisibleRect(android.view.View p0, android.graphics.Rect p1, android.graphics.Point p2) { return false; }
    public boolean getChildVisibleRect(android.view.View p0, android.graphics.Rect p1, android.graphics.Point p2, boolean p3) { return false; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean getClipChildren() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean getClipToPadding() { return false; }
    android.view.View getDeepestFocusedChild() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="focus", mapping={@android.view.ViewDebug.IntToString(from=131072, to="FOCUS_BEFORE_DESCENDANTS"), @android.view.ViewDebug.IntToString(from=262144, to="FOCUS_AFTER_DESCENDANTS"), @android.view.ViewDebug.IntToString(from=393216, to="FOCUS_BLOCK_DESCENDANTS")})
    public int getDescendantFocusability() { return 0; }
    public android.view.View getFocusedChild() { return null; }
    public android.view.animation.LayoutAnimationController getLayoutAnimation() { return null; }
    public android.view.animation.Animation.AnimationListener getLayoutAnimationListener() { return null; }
    public int getLayoutMode() { return 0; }
    public android.animation.LayoutTransition getLayoutTransition() { return null; }
    public int getNestedScrollAxes() { return 0; }
    int getNumChildrenForAccessibility() { return 0; }
    public android.view.ViewGroupOverlay getOverlay() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="drawing", mapping={@android.view.ViewDebug.IntToString(from=0, to="NONE"), @android.view.ViewDebug.IntToString(from=1, to="ANIMATION"), @android.view.ViewDebug.IntToString(from=2, to="SCROLLING"), @android.view.ViewDebug.IntToString(from=3, to="ALL")})
    @java.lang.Deprecated
    public int getPersistentDrawingCache() { return 0; }
    void getScrollIndicatorBounds(android.graphics.Rect p0) {}
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public boolean getTouchscreenBlocksFocus() { return false; }
    public android.view.View getTransientView(int p0) { return null; }
    public int getTransientViewCount() { return 0; }
    public int getTransientViewIndex(int p0) { return 0; }
    void handleFocusGainInternal(int p0, android.graphics.Rect p1) {}
    boolean hasDefaultFocus() { return false; }
    public boolean hasFocus() { return false; }
    boolean hasFocusable(boolean p0, boolean p1) { return false; }
    boolean hasFocusableChild(boolean p0) { return false; }
    protected boolean hasHoveredChild() { return false; }
    public boolean hasTransientState() { return false; }
    boolean hasUnhandledKeyListener() { return false; }
    public boolean hasWindowInsetsAnimationCallback() { return false; }
    void incrementChildUnhandledKeyListeners() {}
    public int indexOfChild(android.view.View p0) { return 0; }
    protected void internalSetPadding(int p0, int p1, int p2, int p3) {}
    @java.lang.Deprecated
    public final void invalidateChild(android.view.View p0, android.graphics.Rect p1) {}
    @java.lang.Deprecated
    public android.view.ViewParent invalidateChildInParent(int[] p0, android.graphics.Rect p1) { return null; }
    void invalidateInheritedLayoutMode(int p0) {}
    @java.lang.Deprecated
    public boolean isAlwaysDrawnWithCacheEnabled() { return false; }
    @java.lang.Deprecated
    public boolean isAnimationCacheEnabled() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    protected boolean isChildrenDrawingOrderEnabled() { return false; }
    @java.lang.Deprecated
    protected boolean isChildrenDrawnWithCacheEnabled() { return false; }
    boolean isLayoutModeOptical() { return false; }
    public boolean isLayoutSuppressed() { return false; }
    public boolean isMotionEventSplittingEnabled() { return false; }
    public final boolean isShowingContextMenuWithCoords() { return false; }
    protected boolean isTransformedTouchPointInView(float p0, float p1, android.view.View p2, android.graphics.PointF p3) { return false; }
    public boolean isTransitionGroup() { return false; }
    boolean isViewTransitioning(android.view.View p0) { return false; }
    public void jumpDrawablesToCurrentState() {}
    public final void layout(int p0, int p1, int p2, int p3) {}
    public void makeFrameworkOptionalFitsSystemWindows() {}
    public void makeOptionalFitsSystemWindows() {}
    protected void measureChild(android.view.View p0, int p1, int p2) {}
    protected void measureChildWithMargins(android.view.View p0, int p1, int p2, int p3, int p4) {}
    protected void measureChildren(int p0, int p1) {}
    boolean notifyChildOfDragStart(android.view.View p0) { return false; }
    public void notifySubtreeAccessibilityStateChanged(android.view.View p0, android.view.View p1, int p2) {}
    public void notifySubtreeAccessibilityStateChangedIfNeeded() {}
    public void offsetChildrenTopAndBottom(int p0) {}
    public final void offsetDescendantRectToMyCoords(android.view.View p0, android.graphics.Rect p1) {}
    void offsetRectBetweenParentAndChild(android.view.View p0, android.graphics.Rect p1, boolean p2, boolean p3) {}
    public final void offsetRectIntoDescendantCoords(android.view.View p0, android.graphics.Rect p1) {}
    protected void onAttachedToWindow() {}
    protected void onChildVisibilityChanged(android.view.View p0, int p1, int p2) {}
    protected int[] onCreateDrawableState(int p0) { return null; }
    protected void onDebugDraw(android.graphics.Canvas p0) {}
    protected void onDebugDrawMargins(android.graphics.Canvas p0, android.graphics.Paint p1) {}
    public void onDescendantInvalidated(android.view.View p0, android.view.View p1) {}
    public final void onDescendantUnbufferedRequested() {}
    protected void onDetachedFromWindow() {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean onInterceptHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    protected abstract void onLayout(boolean p0, int p1, int p2, int p3, int p4);
    public boolean onNestedFling(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    public boolean onNestedPreFling(android.view.View p0, float p1, float p2) { return false; }
    public boolean onNestedPrePerformAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
    public void onNestedPreScroll(android.view.View p0, int p1, int p2, int[] p3) {}
    public void onNestedScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void onNestedScrollAccepted(android.view.View p0, android.view.View p1, int p2) {}
    protected boolean onRequestFocusInDescendants(int p0, android.graphics.Rect p1) { return false; }
    public boolean onRequestSendAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) { return false; }
    public boolean onRequestSendAccessibilityEventInternal(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) { return false; }
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }
    protected void onSetLayoutParams(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public boolean onStartNestedScroll(android.view.View p0, android.view.View p1, int p2) { return false; }
    public void onStopNestedScroll(android.view.View p0) {}
    public void onViewAdded(android.view.View p0) {}
    public void onViewRemoved(android.view.View p0) {}
    void overrideFrameRate(float p0, boolean p1) {}
    protected boolean pointInHoveredChild(android.view.MotionEvent p0) { return false; }
    public void propagateRequestedFrameRate(float p0, boolean p1) {}
    public void recomputeViewAttributes(android.view.View p0) {}
    public void removeAllViews() {}
    public void removeAllViewsInLayout() {}
    protected void removeDetachedView(android.view.View p0, boolean p1) {}
    public void removeTransientView(android.view.View p0) {}
    public void removeView(android.view.View p0) {}
    public void removeViewAt(int p0) {}
    public void removeViewInLayout(android.view.View p0) {}
    public void removeViews(int p0, int p1) {}
    public void removeViewsInLayout(int p0, int p1) {}
    public void requestChildFocus(android.view.View p0, android.view.View p1) {}
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2) { return false; }
    public void requestDisallowInterceptTouchEvent(boolean p0) {}
    public boolean requestFocus(int p0, android.graphics.Rect p1) { return false; }
    public boolean requestSendAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) { return false; }
    public void requestTransitionStart(android.animation.LayoutTransition p0) {}
    public void requestTransparentRegion(android.view.View p0) {}
    protected void resetResolvedDrawables() {}
    public void resetResolvedLayoutDirection() {}
    public void resetResolvedPadding() {}
    public void resetResolvedTextAlignment() {}
    public void resetResolvedTextDirection() {}
    void resetSubtreeAccessibilityStateChanged() {}
    public void resetSubtreeAutofillIds() {}
    protected void resolveDrawables() {}
    public boolean resolveLayoutDirection() { return false; }
    public void resolveLayoutParams() {}
    public void resolvePadding() {}
    public boolean resolveRtlPropertiesIfNeeded() { return false; }
    public boolean resolveTextAlignment() { return false; }
    public boolean resolveTextDirection() { return false; }
    public boolean restoreDefaultFocus() { return false; }
    public boolean restoreFocusInCluster(int p0) { return false; }
    public boolean restoreFocusNotInCluster() { return false; }
    public void scheduleLayoutAnimation() {}
    public void setAddStatesFromChildren(boolean p0) {}
    @java.lang.Deprecated
    public void setAlwaysDrawnWithCacheEnabled(boolean p0) {}
    @java.lang.Deprecated
    public void setAnimationCacheEnabled(boolean p0) {}
    @java.lang.Deprecated
    protected void setChildrenDrawingCacheEnabled(boolean p0) {}
    protected void setChildrenDrawingOrderEnabled(boolean p0) {}
    @java.lang.Deprecated
    protected void setChildrenDrawnWithCacheEnabled(boolean p0) {}
    public void setClipChildren(boolean p0) {}
    public void setClipToPadding(boolean p0) {}
    void setDefaultFocus(android.view.View p0) {}
    public void setDescendantFocusability(int p0) {}
    public void setLayoutAnimation(android.view.animation.LayoutAnimationController p0) {}
    public void setLayoutAnimationListener(android.view.animation.Animation.AnimationListener p0) {}
    public void setLayoutMode(int p0) {}
    public void setLayoutTransition(android.animation.LayoutTransition p0) {}
    public void setMotionEventSplittingEnabled(boolean p0) {}
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener p0) {}
    @java.lang.Deprecated
    public void setPersistentDrawingCache(int p0) {}
    public void setRequestedFrameRate(float p0) {}
    protected void setStaticTransformationsEnabled(boolean p0) {}
    public void setTouchscreenBlocksFocus(boolean p0) {}
    public void setTransitionGroup(boolean p0) {}
    public void setWindowInsetsAnimationCallback(android.view.WindowInsetsAnimation.Callback p0) {}
    boolean shouldBlockFocusForTouchscreen() { return false; }
    public boolean shouldDelayChildPressedState() { return false; }
    public boolean showContextMenuForChild(android.view.View p0) { return false; }
    public boolean showContextMenuForChild(android.view.View p0, float p1, float p2) { return false; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1) { return null; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1, int p2) { return null; }
    public void startLayoutAnimation() {}
    public void startViewTransition(android.view.View p0) {}
    public void subtractObscuredTouchableRegion(android.graphics.Region p0, android.view.View p1) {}
    public void suppressLayout(boolean p0) {}
    public void transformPointToViewLocal(float[] p0, android.view.View p1) {}
    void unFocus(android.view.View p0) {}
    boolean updateLocalSystemUiVisibility(int p0, int p1) { return false; }
    public void updateViewLayout(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}

    static class ChildListForAccessibility {
        private static final int MAX_POOL_SIZE = 32;
        private static final android.util.Pools.SynchronizedPool<android.view.ViewGroup.ChildListForAccessibility> sPool = null;
        private final java.util.ArrayList<android.view.View> mChildren = null;
        private final java.util.ArrayList<android.view.ViewGroup.ViewLocationHolder> mHolders = null;
        ChildListForAccessibility() {}
        private void clear() {}
        private void init(android.view.ViewGroup p0, boolean p1) {}
        public static android.view.ViewGroup.ChildListForAccessibility obtain(android.view.ViewGroup p0, boolean p1) { return null; }
        private void sort(java.util.ArrayList<android.view.ViewGroup.ViewLocationHolder> p0) {}
        public android.view.View getChildAt(int p0) { return null; }
        public int getChildCount() { return 0; }
        public void recycle() {}
    }

    private static class ChildListForAutoFillOrContentCapture extends java.util.ArrayList<android.view.View> {
        private static final int MAX_POOL_SIZE = 32;
        private static final android.util.Pools.SimplePool<android.view.ViewGroup.ChildListForAutoFillOrContentCapture> sPool = null;
        private ChildListForAutoFillOrContentCapture() { super(); }
        public static android.view.ViewGroup.ChildListForAutoFillOrContentCapture obtain() { return null; }
        public void recycle() {}
    }

    private static final class HoverTarget {
        private static final int MAX_RECYCLED = 32;
        private static android.view.ViewGroup.HoverTarget sRecycleBin;
        private static final java.lang.Object sRecycleLock = null;
        private static int sRecycledCount;
        public android.view.View child;
        public android.view.ViewGroup.HoverTarget next;
        private HoverTarget() {}
        public static android.view.ViewGroup.HoverTarget obtain(android.view.View p0) { return null; }
        public void recycle() {}
    }

    public static class LayoutParams {
        @java.lang.Deprecated
        public static final int FILL_PARENT = -1;
        public static final int MATCH_PARENT = -1;
        public static final int WRAP_CONTENT = -2;
        @android.view.ViewDebug.ExportedProperty(category="layout", mapping={@android.view.ViewDebug.IntToString(from=-1, to="MATCH_PARENT"), @android.view.ViewDebug.IntToString(from=-2, to="WRAP_CONTENT")})
        public int height;
        public android.view.animation.LayoutAnimationController.AnimationParameters layoutAnimationParameters;
        @android.view.ViewDebug.ExportedProperty(category="layout", mapping={@android.view.ViewDebug.IntToString(from=-1, to="MATCH_PARENT"), @android.view.ViewDebug.IntToString(from=-2, to="WRAP_CONTENT")})
        public int width;
        LayoutParams() {}
        public LayoutParams(int p0, int p1) {}
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) {}
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) {}
        protected static java.lang.String sizeToString(int p0) { return null; }
        public java.lang.String debug(java.lang.String p0) { return null; }
        void encode(android.view.ViewHierarchyEncoder p0) {}
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
        public void onDebugDraw(android.view.View p0, android.graphics.Canvas p1, android.graphics.Paint p2) {}
        public void resolveLayoutDirection(int p0) {}
        protected void setBaseAttributes(android.content.res.TypedArray p0, int p1, int p2) {}

        public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.view.ViewGroup.LayoutParams> {
            private int mLayout_heightId;
            private int mLayout_widthId;
            private boolean mPropertiesMapped;
            public InspectionCompanion() {}
            public void mapProperties(android.view.inspector.PropertyMapper p0) {}
            public void readProperties(android.view.ViewGroup.LayoutParams p0, android.view.inspector.PropertyReader p1) {}
        }
    }

    public static class MarginLayoutParams extends android.view.ViewGroup.LayoutParams {
        public static final int DEFAULT_MARGIN_RELATIVE = -2147483648;
        private static final int DEFAULT_MARGIN_RESOLVED = 0;
        private static final int LAYOUT_DIRECTION_MASK = 3;
        private static final int LEFT_MARGIN_UNDEFINED_MASK = 4;
        private static final int NEED_RESOLUTION_MASK = 32;
        private static final int RIGHT_MARGIN_UNDEFINED_MASK = 8;
        private static final int RTL_COMPATIBILITY_MODE_MASK = 16;
        private static final int UNDEFINED_MARGIN = -2147483648;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public int bottomMargin;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        private int endMargin;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public int leftMargin;
        @android.view.ViewDebug.ExportedProperty(category="layout", flagMapping={@android.view.ViewDebug.FlagToString(equals=3, mask=3, name="LAYOUT_DIRECTION"), @android.view.ViewDebug.FlagToString(equals=4, mask=4, name="LEFT_MARGIN_UNDEFINED_MASK"), @android.view.ViewDebug.FlagToString(equals=8, mask=8, name="RIGHT_MARGIN_UNDEFINED_MASK"), @android.view.ViewDebug.FlagToString(equals=16, mask=16, name="RTL_COMPATIBILITY_MODE_MASK"), @android.view.ViewDebug.FlagToString(equals=32, mask=32, name="NEED_RESOLUTION_MASK")}, formatToHexString=true)
        byte mMarginFlags;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public int rightMargin;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        private int startMargin;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public int topMargin;
        public MarginLayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public MarginLayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public MarginLayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public MarginLayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        private void doResolveMargins() {}
        public final void copyMarginsFrom(android.view.ViewGroup.MarginLayoutParams p0) {}
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
        public int getLayoutDirection() { return 0; }
        public int getMarginEnd() { return 0; }
        public int getMarginStart() { return 0; }
        public boolean isLayoutRtl() { return false; }
        public boolean isMarginRelative() { return false; }
        public void onDebugDraw(android.view.View p0, android.graphics.Canvas p1, android.graphics.Paint p2) {}
        public void resolveLayoutDirection(int p0) {}
        public void setLayoutDirection(int p0) {}
        public void setMarginEnd(int p0) {}
        public void setMarginStart(int p0) {}
        public void setMargins(int p0, int p1, int p2, int p3) {}
        public void setMarginsRelative(int p0, int p1, int p2, int p3) {}

        public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.view.ViewGroup.MarginLayoutParams> {
            private int mLayout_marginBottomId;
            private int mLayout_marginLeftId;
            private int mLayout_marginRightId;
            private int mLayout_marginTopId;
            private boolean mPropertiesMapped;
            public InspectionCompanion() {}
            public void mapProperties(android.view.inspector.PropertyMapper p0) {}
            public void readProperties(android.view.ViewGroup.MarginLayoutParams p0, android.view.inspector.PropertyReader p1) {}
        }
    }

    public static interface OnHierarchyChangeListener {
        public void onChildViewAdded(android.view.View p0, android.view.View p1);
        public void onChildViewRemoved(android.view.View p0, android.view.View p1);
    }

    private static final class TouchTarget {
        public static final int ALL_POINTER_IDS = -1;
        private static final int MAX_RECYCLED = 32;
        private static android.view.ViewGroup.TouchTarget sRecycleBin;
        private static final java.lang.Object sRecycleLock = null;
        private static int sRecycledCount;
        public android.view.View child;
        public android.view.ViewGroup.TouchTarget next;
        public int pointerIdBits;
        private TouchTarget() {}
        public static android.view.ViewGroup.TouchTarget obtain(android.view.View p0, int p1) { return null; }
        public boolean isRecycled() { return false; }
        public void recycle() {}
    }

    static class ViewLocationHolder implements java.lang.Comparable<android.view.ViewGroup.ViewLocationHolder> {
        public static final int COMPARISON_STRATEGY_LOCATION = 2;
        public static final int COMPARISON_STRATEGY_STRIPE = 1;
        private static final int MAX_POOL_SIZE = 32;
        private static int sComparisonStrategy;
        private static final android.util.Pools.SynchronizedPool<android.view.ViewGroup.ViewLocationHolder> sPool = null;
        private int mLayoutDirection;
        private final android.graphics.Rect mLocation = null;
        private android.view.ViewGroup mRoot;
        public android.view.View mView;
        ViewLocationHolder() {}
        private void clear() {}
        private static int compareBoundsOfTree(android.view.ViewGroup.ViewLocationHolder p0, android.view.ViewGroup.ViewLocationHolder p1) { return 0; }
        private void init(android.view.ViewGroup p0, android.view.View p1) {}
        public static android.view.ViewGroup.ViewLocationHolder obtain(android.view.ViewGroup p0, android.view.View p1) { return null; }
        public static void setComparisonStrategy(int p0) {}
        public int compareTo(android.view.ViewGroup.ViewLocationHolder p0) { return 0; }
        public void recycle() {}
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.view.ViewGroup> {
        private int mAddStatesFromChildrenId;
        private int mAlwaysDrawnWithCacheId;
        private int mAnimationCacheId;
        private int mClipChildrenId;
        private int mClipToPaddingId;
        private int mDescendantFocusabilityId;
        private int mLayoutAnimationId;
        private int mLayoutModeId;
        private int mPersistentDrawingCacheId;
        private boolean mPropertiesMapped;
        private int mSplitMotionEventsId;
        private int mTouchscreenBlocksFocusId;
        private int mTransitionGroupId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.view.ViewGroup p0, android.view.inspector.PropertyReader p1) {}
    }
}
