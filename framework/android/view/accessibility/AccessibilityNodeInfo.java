package android.view.accessibility;

public class AccessibilityNodeInfo implements android.os.Parcelable {
    public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
    public static final java.lang.String ACTION_ARGUMENT_ACCESSIBLE_CLICKABLE_SPAN = "android.view.accessibility.action.ACTION_ARGUMENT_ACCESSIBLE_CLICKABLE_SPAN";
    public static final java.lang.String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final java.lang.String ACTION_ARGUMENT_DIRECTION_INT = "android.view.accessibility.action.ARGUMENT_DIRECTION_INT";
    public static final java.lang.String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final java.lang.String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final java.lang.String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final java.lang.String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final java.lang.String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    public static final java.lang.String ACTION_ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
    public static final java.lang.String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final java.lang.String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final java.lang.String ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT = "android.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";
    public static final java.lang.String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final java.lang.String ACTION_ARGUMENT_SELECTION_PARCELABLE = "android.view.accessibility.action.ARGUMENT_SELECTION_PARCELABLE";
    public static final java.lang.String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final java.lang.String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_COLLAPSE = 524288;
    public static final int ACTION_COPY = 16384;
    public static final int ACTION_CUT = 65536;
    public static final int ACTION_DISMISS = 1048576;
    public static final int ACTION_EXPAND = 262144;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_LONG_CLICK = 32;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
    public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
    public static final int ACTION_PASTE = 32768;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
    public static final int ACTION_SCROLL_BACKWARD = 8192;
    public static final int ACTION_SCROLL_FORWARD = 4096;
    public static final int ACTION_SELECT = 4;
    public static final int ACTION_SET_SELECTION = 131072;
    public static final int ACTION_SET_TEXT = 2097152;
    private static final int BOOLEAN_PROPERTY_ACCESSIBILITY_DATA_SENSITIVE = 33554432;
    private static final int BOOLEAN_PROPERTY_ACCESSIBILITY_FOCUSED = 1024;
    private static final int BOOLEAN_PROPERTY_CHECKABLE = 1;
    private static final int BOOLEAN_PROPERTY_CHECKED = 2;
    private static final int BOOLEAN_PROPERTY_CLICKABLE = 32;
    private static final int BOOLEAN_PROPERTY_CONTENT_INVALID = 65536;
    private static final int BOOLEAN_PROPERTY_CONTEXT_CLICKABLE = 131072;
    private static final int BOOLEAN_PROPERTY_DISMISSABLE = 16384;
    private static final int BOOLEAN_PROPERTY_EDITABLE = 4096;
    private static final int BOOLEAN_PROPERTY_ENABLED = 128;
    private static final int BOOLEAN_PROPERTY_FIELD_REQUIRED = 134217728;
    private static final int BOOLEAN_PROPERTY_FOCUSABLE = 4;
    private static final int BOOLEAN_PROPERTY_FOCUSED = 8;
    private static final int BOOLEAN_PROPERTY_IMPORTANCE = 262144;
    private static final int BOOLEAN_PROPERTY_IS_HEADING = 2097152;
    private static final int BOOLEAN_PROPERTY_IS_SHOWING_HINT = 1048576;
    private static final int BOOLEAN_PROPERTY_IS_TEXT_ENTRY_KEY = 4194304;
    private static final int BOOLEAN_PROPERTY_IS_TEXT_SELECTABLE = 8388608;
    private static final int BOOLEAN_PROPERTY_LONG_CLICKABLE = 64;
    private static final int BOOLEAN_PROPERTY_MULTI_LINE = 32768;
    private static final int BOOLEAN_PROPERTY_OPENS_POPUP = 8192;
    private static final int BOOLEAN_PROPERTY_PASSWORD = 256;
    private static final int BOOLEAN_PROPERTY_REQUEST_INITIAL_ACCESSIBILITY_FOCUS = 16777216;
    private static final int BOOLEAN_PROPERTY_SCREEN_READER_FOCUSABLE = 524288;
    private static final int BOOLEAN_PROPERTY_SCROLLABLE = 512;
    private static final int BOOLEAN_PROPERTY_SELECTED = 16;
    private static final int BOOLEAN_PROPERTY_SUPPORTS_GRANULAR_SCROLLING = 67108864;
    private static final int BOOLEAN_PROPERTY_VISIBLE_TO_USER = 2048;
    public static final int CHECKED_STATE_FALSE = 0;
    public static final int CHECKED_STATE_PARTIAL = 2;
    public static final int CHECKED_STATE_TRUE = 1;
    public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityNodeInfo> CREATOR = null;
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final android.view.accessibility.AccessibilityNodeInfo DEFAULT = null;
    public static final int EXPANDED_STATE_COLLAPSED = 1;
    public static final int EXPANDED_STATE_FULL = 3;
    public static final int EXPANDED_STATE_PARTIAL = 2;
    public static final int EXPANDED_STATE_UNDEFINED = 0;
    public static final java.lang.String EXTRA_DATA_RENDERING_INFO_KEY = "android.view.accessibility.extra.DATA_RENDERING_INFO_KEY";
    public static final java.lang.String EXTRA_DATA_REQUESTED_KEY = "android.view.accessibility.AccessibilityNodeInfo.extra_data_requested";
    public static final java.lang.String EXTRA_DATA_REQUEST_LAYOUT_BASED_ACTIONS_KEY = "android.view.accessibility.extra.DATA_REQUEST_LAYOUT_BASED_ACTIONS_KEY";
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
    public static final int EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH = 20000;
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_IN_WINDOW_KEY = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_IN_WINDOW_KEY";
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
    public static final int FLAG_PREFETCH_ANCESTORS = 1;
    public static final int FLAG_PREFETCH_DESCENDANTS_BREADTH_FIRST = 16;
    public static final int FLAG_PREFETCH_DESCENDANTS_DEPTH_FIRST = 8;
    public static final int FLAG_PREFETCH_DESCENDANTS_HYBRID = 4;
    public static final int FLAG_PREFETCH_DESCENDANTS_MASK = 28;
    public static final int FLAG_PREFETCH_MASK = 63;
    public static final int FLAG_PREFETCH_SIBLINGS = 2;
    public static final int FLAG_PREFETCH_UNINTERRUPTIBLE = 32;
    public static final int FLAG_REPORT_MASK = 896;
    public static final int FLAG_SERVICE_IS_ACCESSIBILITY_TOOL = 512;
    public static final int FLAG_SERVICE_REQUESTS_INCLUDE_NOT_IMPORTANT_VIEWS = 128;
    public static final int FLAG_SERVICE_REQUESTS_REPORT_VIEW_IDS = 256;
    public static final int FOCUS_ACCESSIBILITY = 2;
    public static final int FOCUS_INPUT = 1;
    private static final int INVALID_ACTIONS_MASK = -4194304;
    public static final int LAST_LEGACY_STANDARD_ACTION = 2097152;
    public static final int LEASHED_ITEM_ID = 2147483645;
    public static final long LEASHED_NODE_ID = Long.valueOf(0L);
    public static final int MAX_NUMBER_OF_PREFETCHED_NODES = 50;
    public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
    public static final int MOVEMENT_GRANULARITY_LINE = 4;
    public static final int MOVEMENT_GRANULARITY_PAGE = 16;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
    public static final int MOVEMENT_GRANULARITY_WORD = 2;
    public static final int ROOT_ITEM_ID = 2147483646;
    public static final long ROOT_NODE_ID = Long.valueOf(0L);
    private static final java.lang.String TAG = "AccessibilityNodeInfo";
    public static final int UNDEFINED_CONNECTION_ID = -1;
    public static final int UNDEFINED_ITEM_ID = 2147483647;
    public static final long UNDEFINED_NODE_ID = Long.valueOf(0L);
    public static final int UNDEFINED_SELECTION_INDEX = -1;
    private static final long VIRTUAL_DESCENDANT_ID_MASK = -4294967296L;
    private static final int VIRTUAL_DESCENDANT_ID_SHIFT = 32;
    private java.util.ArrayList<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> mActions;
    private int mBooleanProperties;
    private final android.graphics.Rect mBoundsInParent = null;
    private final android.graphics.Rect mBoundsInScreen = null;
    private final android.graphics.Rect mBoundsInWindow = null;
    private int mChecked;
    private android.util.LongArray mChildNodeIds;
    private java.lang.CharSequence mClassName;
    private android.view.accessibility.AccessibilityNodeInfo.CollectionInfo mCollectionInfo;
    private android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo mCollectionItemInfo;
    private int mConnectionId;
    private java.lang.CharSequence mContainerTitle;
    private java.lang.CharSequence mContentDescription;
    private int mDrawingOrderInParent;
    private int mEmbeddingHostWindowId;
    private java.lang.CharSequence mError;
    private int mExpandedState;
    private java.util.ArrayList<java.lang.String> mExtraDataKeys;
    private android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo mExtraRenderingInfo;
    private android.os.Bundle mExtras;
    private java.lang.CharSequence mHintText;
    private int mInputType;
    private long mLabelForId;
    private long mLabeledById;
    private android.util.LongArray mLabeledByIds;
    private android.os.IBinder mLeashedChild;
    private android.os.IBinder mLeashedParent;
    private long mLeashedParentNodeId;
    private int mLiveRegion;
    private int mMaxTextLength;
    private long mMinDurationBetweenContentChanges;
    private int mMovementGranularities;
    private java.lang.CharSequence mOriginalText;
    private java.lang.CharSequence mPackageName;
    private java.lang.CharSequence mPaneTitle;
    private long mParentNodeId;
    private android.view.accessibility.AccessibilityNodeInfo.RangeInfo mRangeInfo;
    private boolean mSealed;
    private android.view.accessibility.AccessibilityNodeInfo.Selection mSelection;
    private long mSourceNodeId;
    private java.lang.CharSequence mStateDescription;
    private android.view.accessibility.AccessibilityNodeInfo.StructuredDataInfo mStructuredDataInfo;
    private java.lang.CharSequence mSupplementalDescription;
    private java.lang.CharSequence mText;
    private int mTextSelectionEnd;
    private int mTextSelectionStart;
    private java.lang.CharSequence mTooltipText;
    private android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo mTouchDelegateInfo;
    private long mTraversalAfter;
    private long mTraversalBefore;
    private java.lang.String mUniqueId;
    private java.lang.String mViewIdResourceName;
    private int mWindowId;
    public AccessibilityNodeInfo() {}
    public AccessibilityNodeInfo(android.view.View p0) {}
    public AccessibilityNodeInfo(android.view.View p0, int p1) {}
    public AccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
    private void addActionUnchecked(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction p0) {}
    private void addChildInternal(android.view.View p0, int p1, boolean p2) {}
    private void addStandardActions(long p0) {}
    private static boolean canPerformRequestOverConnection(int p0, int p1, long p2) { return false; }
    private void enforceValidExpandedState(int p0) {}
    private void enforceValidFocusDirection(int p0) {}
    private void enforceValidFocusType(int p0) {}
    public static int getAccessibilityViewId(long p0) { return 0; }
    private static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction getActionSingleton(int p0) { return null; }
    private static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction getActionSingletonBySerializationFlag(long p0) { return null; }
    private static java.lang.String getActionSymbolicName(int p0) { return null; }
    private boolean getBooleanProperty(int p0) { return false; }
    private static java.lang.String getMovementGranularitySymbolicName(int p0) { return null; }
    private static android.view.accessibility.AccessibilityNodeInfo getNodeForAccessibilityId(int p0, int p1, long p2) { return null; }
    private static android.view.accessibility.AccessibilityNodeInfo getNodeForAccessibilityId(int p0, int p1, long p2, int p3) { return null; }
    private static android.view.accessibility.AccessibilityNodeInfo getNodeForAccessibilityId(int p0, android.os.IBinder p1, long p2) { return null; }
    private static android.view.accessibility.AccessibilityNodeInfo getNodeForAccessibilityId(int p0, android.os.IBinder p1, long p2, int p3) { return null; }
    public static int getVirtualDescendantId(long p0) { return 0; }
    private static java.lang.String idItemToString(int p0) { return null; }
    public static java.lang.String idToString(long p0) { return null; }
    private void init(android.view.accessibility.AccessibilityNodeInfo p0) {}
    private void initCopyInfos(android.view.accessibility.AccessibilityNodeInfo p0) {}
    private void initFromParcel(android.os.Parcel p0) {}
    private static boolean isDefaultStandardAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction p0) { return false; }
    public static long makeNodeId(int p0, int p1) { return 0L; }
    @java.lang.Deprecated
    public static android.view.accessibility.AccessibilityNodeInfo obtain() { return null; }
    @java.lang.Deprecated
    public static android.view.accessibility.AccessibilityNodeInfo obtain(android.view.View p0) { return null; }
    @java.lang.Deprecated
    public static android.view.accessibility.AccessibilityNodeInfo obtain(android.view.View p0, int p1) { return null; }
    @java.lang.Deprecated
    public static android.view.accessibility.AccessibilityNodeInfo obtain(android.view.accessibility.AccessibilityNodeInfo p0) { return null; }
    private java.lang.CharSequence replaceClickableSpan(java.lang.CharSequence p0) { return null; }
    private java.lang.CharSequence replaceReplacementSpan(java.lang.CharSequence p0) { return null; }
    private void setBooleanProperty(int p0, boolean p1) {}
    private static boolean usingDirectConnection(int p0) { return false; }
    @java.lang.Deprecated
    public void addAction(int p0) {}
    public void addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction p0) {}
    public void addChild(android.os.IBinder p0) {}
    public void addChild(android.view.View p0) {}
    public void addChild(android.view.View p0, int p1) {}
    public void addChildUnchecked(android.view.View p0) {}
    public void addLabeledBy(android.view.View p0) {}
    public void addLabeledBy(android.view.View p0, int p1) {}
    public boolean canOpenPopup() { return false; }
    public int describeContents() { return 0; }
    protected void enforceNotSealed() {}
    protected void enforceSealed() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String p0) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId(java.lang.String p0) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int p0) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo focusSearch(int p0) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> getActionList() { return null; }
    @java.lang.Deprecated
    public int getActions() { return 0; }
    public java.util.List<java.lang.String> getAvailableExtraData() { return null; }
    @java.lang.Deprecated
    public void getBoundsInParent(android.graphics.Rect p0) {}
    public android.graphics.Rect getBoundsInScreen() { return null; }
    public void getBoundsInScreen(android.graphics.Rect p0) {}
    public android.graphics.Rect getBoundsInWindow() { return null; }
    public void getBoundsInWindow(android.graphics.Rect p0) {}
    public int getChecked() { return 0; }
    public android.view.accessibility.AccessibilityNodeInfo getChild(int p0) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getChild(int p0, int p1) { return null; }
    public int getChildCount() { return 0; }
    public long getChildId(int p0) { return 0L; }
    public android.util.LongArray getChildNodeIds() { return null; }
    public java.lang.CharSequence getClassName() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo getCollectionInfo() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo getCollectionItemInfo() { return null; }
    public int getConnectionId() { return 0; }
    public java.lang.CharSequence getContainerTitle() { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public int getDrawingOrder() { return 0; }
    public java.lang.CharSequence getError() { return null; }
    public int getExpandedState() { return 0; }
    public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.CharSequence getHintText() { return null; }
    public int getInputType() { return 0; }
    @java.lang.Deprecated
    public android.view.accessibility.AccessibilityNodeInfo getLabelFor() { return null; }
    @java.lang.Deprecated
    public android.view.accessibility.AccessibilityNodeInfo getLabeledBy() { return null; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> getLabeledByList() { return null; }
    public android.os.IBinder getLeashedParent() { return null; }
    public long getLeashedParentNodeId() { return 0L; }
    public int getLiveRegion() { return 0; }
    public int getMaxTextLength() { return 0; }
    public java.time.Duration getMinDurationBetweenContentChanges() { return null; }
    public int getMovementGranularities() { return 0; }
    public java.lang.CharSequence getOriginalText() { return null; }
    public java.lang.CharSequence getPackageName() { return null; }
    public java.lang.CharSequence getPaneTitle() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getParent() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getParent(int p0) { return null; }
    public long getParentNodeId() { return 0L; }
    public android.view.accessibility.AccessibilityNodeInfo.RangeInfo getRangeInfo() { return null; }
    public int getRealWindowId() { return 0; }
    public android.view.accessibility.AccessibilityNodeInfo.Selection getSelection() { return null; }
    public long getSourceNodeId() { return 0L; }
    public java.lang.CharSequence getStateDescription() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo.StructuredDataInfo getStructuredDataInfo() { return null; }
    public java.lang.CharSequence getSupplementalDescription() { return null; }
    public java.lang.CharSequence getText() { return null; }
    public int getTextSelectionEnd() { return 0; }
    public int getTextSelectionStart() { return 0; }
    public java.lang.CharSequence getTooltipText() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getTraversalAfter() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getTraversalBefore() { return null; }
    public java.lang.String getUniqueId() { return null; }
    public java.lang.String getViewIdResourceName() { return null; }
    public android.view.accessibility.AccessibilityWindowInfo getWindow() { return null; }
    public int getWindowId() { return 0; }
    public boolean hasExtras() { return false; }
    public boolean hasRequestInitialAccessibilityFocus() { return false; }
    public int hashCode() { return 0; }
    public boolean isAccessibilityDataSensitive() { return false; }
    public boolean isAccessibilityFocused() { return false; }
    public boolean isCheckable() { return false; }
    @java.lang.Deprecated
    public boolean isChecked() { return false; }
    public boolean isClickable() { return false; }
    public boolean isContentInvalid() { return false; }
    public boolean isContextClickable() { return false; }
    public boolean isDismissable() { return false; }
    public boolean isEditable() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isFieldRequired() { return false; }
    public boolean isFocusable() { return false; }
    public boolean isFocused() { return false; }
    public boolean isGranularScrollingSupported() { return false; }
    public boolean isHeading() { return false; }
    public boolean isImportantForAccessibility() { return false; }
    public boolean isLongClickable() { return false; }
    public boolean isMultiLine() { return false; }
    public boolean isPassword() { return false; }
    public boolean isScreenReaderFocusable() { return false; }
    public boolean isScrollable() { return false; }
    public boolean isSealed() { return false; }
    public boolean isSelected() { return false; }
    public boolean isShowingHintText() { return false; }
    public boolean isTextEntryKey() { return false; }
    public boolean isTextSelectable() { return false; }
    public boolean isVisibleToUser() { return false; }
    public boolean performAction(int p0) { return false; }
    public boolean performAction(int p0, android.os.Bundle p1) { return false; }
    @java.lang.Deprecated
    public void recycle() {}
    public boolean refresh() { return false; }
    public boolean refresh(android.os.Bundle p0, boolean p1) { return false; }
    public boolean refreshWithExtraData(java.lang.String p0, android.os.Bundle p1) { return false; }
    @java.lang.Deprecated
    public void removeAction(int p0) {}
    public boolean removeAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction p0) { return false; }
    public void removeAllActions() {}
    public boolean removeChild(android.os.IBinder p0) { return false; }
    public boolean removeChild(android.view.View p0) { return false; }
    public boolean removeChild(android.view.View p0, int p1) { return false; }
    public boolean removeLabeledBy(android.view.View p0) { return false; }
    public boolean removeLabeledBy(android.view.View p0, int p1) { return false; }
    public void setAccessibilityDataSensitive(boolean p0) {}
    public void setAccessibilityFocused(boolean p0) {}
    public void setAvailableExtraData(java.util.List<java.lang.String> p0) {}
    @java.lang.Deprecated
    public void setBoundsInParent(android.graphics.Rect p0) {}
    public void setBoundsInScreen(android.graphics.Rect p0) {}
    public void setBoundsInWindow(android.graphics.Rect p0) {}
    public void setCanOpenPopup(boolean p0) {}
    public void setCheckable(boolean p0) {}
    public void setChecked(int p0) {}
    @java.lang.Deprecated
    public void setChecked(boolean p0) {}
    public void setClassName(java.lang.CharSequence p0) {}
    public void setClickable(boolean p0) {}
    public void setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo p0) {}
    public void setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo p0) {}
    public void setConnectionId(int p0) {}
    public void setContainerTitle(java.lang.CharSequence p0) {}
    public void setContentDescription(java.lang.CharSequence p0) {}
    public void setContentInvalid(boolean p0) {}
    public void setContextClickable(boolean p0) {}
    public void setDismissable(boolean p0) {}
    public void setDrawingOrder(int p0) {}
    public void setEditable(boolean p0) {}
    public void setEmbeddingHostWindowId(int p0) {}
    public void setEnabled(boolean p0) {}
    public void setError(java.lang.CharSequence p0) {}
    public void setExpandedState(int p0) {}
    public void setExtraRenderingInfo(android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo p0) {}
    public void setFieldRequired(boolean p0) {}
    public void setFocusable(boolean p0) {}
    public void setFocused(boolean p0) {}
    public void setGranularScrollingSupported(boolean p0) {}
    public void setHeading(boolean p0) {}
    public void setHintText(java.lang.CharSequence p0) {}
    public void setImportantForAccessibility(boolean p0) {}
    public void setInputType(int p0) {}
    @java.lang.Deprecated
    public void setLabelFor(android.view.View p0) {}
    @java.lang.Deprecated
    public void setLabelFor(android.view.View p0, int p1) {}
    @java.lang.Deprecated
    public void setLabeledBy(android.view.View p0) {}
    @java.lang.Deprecated
    public void setLabeledBy(android.view.View p0, int p1) {}
    public void setLeashedParent(android.os.IBinder p0, int p1) {}
    public void setLiveRegion(int p0) {}
    public void setLongClickable(boolean p0) {}
    public void setMaxTextLength(int p0) {}
    public void setMinDurationBetweenContentChanges(java.time.Duration p0) {}
    public void setMovementGranularities(int p0) {}
    public void setMultiLine(boolean p0) {}
    public void setPackageName(java.lang.CharSequence p0) {}
    public void setPaneTitle(java.lang.CharSequence p0) {}
    public void setParent(android.view.View p0) {}
    public void setParent(android.view.View p0, int p1) {}
    public void setPassword(boolean p0) {}
    public void setQueryFromAppProcessEnabled(android.view.View p0, boolean p1) {}
    public void setRangeInfo(android.view.accessibility.AccessibilityNodeInfo.RangeInfo p0) {}
    public void setRequestInitialAccessibilityFocus(boolean p0) {}
    public void setScreenReaderFocusable(boolean p0) {}
    public void setScrollable(boolean p0) {}
    public void setSealed(boolean p0) {}
    public void setSelected(boolean p0) {}
    public void setSelection(android.view.accessibility.AccessibilityNodeInfo.Selection p0) {}
    public void setShowingHintText(boolean p0) {}
    public void setSource(android.view.View p0) {}
    public void setSource(android.view.View p0, int p1) {}
    public void setSourceNodeId(long p0, int p1) {}
    public void setStateDescription(java.lang.CharSequence p0) {}
    public void setStructuredDataInfo(android.view.accessibility.AccessibilityNodeInfo.StructuredDataInfo p0) {}
    public void setSupplementalDescription(java.lang.CharSequence p0) {}
    public void setText(java.lang.CharSequence p0) {}
    public void setTextEntryKey(boolean p0) {}
    public void setTextSelectable(boolean p0) {}
    public void setTextSelection(int p0, int p1) {}
    public void setTooltipText(java.lang.CharSequence p0) {}
    public void setTouchDelegateInfo(android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo p0) {}
    public void setTraversalAfter(android.view.View p0) {}
    public void setTraversalAfter(android.view.View p0, int p1) {}
    public void setTraversalBefore(android.view.View p0) {}
    public void setTraversalBefore(android.view.View p0, int p1) {}
    public void setUniqueId(java.lang.String p0) {}
    public void setViewIdResourceName(java.lang.String p0) {}
    public void setVisibleToUser(boolean p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelNoRecycle(android.os.Parcel p0, int p1) {}

    public static final class AccessibilityAction implements android.os.Parcelable {
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_ACCESSIBILITY_FOCUS = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLEAR_ACCESSIBILITY_FOCUS = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLEAR_FOCUS = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLEAR_SELECTION = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLICK = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_COLLAPSE = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CONTEXT_CLICK = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_COPY = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CUT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_DISMISS = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_DRAG_CANCEL = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_DRAG_DROP = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_DRAG_START = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_EXPAND = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_FOCUS = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_HIDE_TOOLTIP = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_IME_ENTER = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_LONG_CLICK = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_MOVE_WINDOW = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_NEXT_AT_MOVEMENT_GRANULARITY = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_NEXT_HTML_ELEMENT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PAGE_DOWN = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PAGE_LEFT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PAGE_RIGHT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PAGE_UP = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PASTE = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PRESS_AND_HOLD = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PREVIOUS_HTML_ELEMENT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_BACKWARD = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_DOWN = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_FORWARD = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_IN_DIRECTION = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_LEFT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_RIGHT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_TO_POSITION = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_UP = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SELECT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SET_EXTENDED_SELECTION = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SET_PROGRESS = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SET_SELECTION = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SET_TEXT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SHOW_ON_SCREEN = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SHOW_TEXT_SUGGESTIONS = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SHOW_TOOLTIP = null;
        public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> CREATOR = null;
        public static final android.util.ArraySet<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> sStandardActions = null;
        private final int mActionId = 0;
        private final java.lang.CharSequence mLabel = null;
        public long mSerializationFlag;
        private AccessibilityAction(int p0) {}
        public AccessibilityAction(int p0, java.lang.CharSequence p1) {}
        private AccessibilityAction(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getId() { return 0; }
        public java.lang.CharSequence getLabel() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CheckedState {
    }

    public static final class CollectionInfo {
        public static final int SELECTION_MODE_MULTIPLE = 2;
        public static final int SELECTION_MODE_NONE = 0;
        public static final int SELECTION_MODE_SINGLE = 1;
        public static final int UNDEFINED = -1;
        private int mColumnCount;
        private boolean mHierarchical;
        private int mImportantForAccessibilityItemCount;
        private int mItemCount;
        private int mRowCount;
        private int mSelectionMode;
        public CollectionInfo(int p0, int p1, boolean p2) {}
        public CollectionInfo(int p0, int p1, boolean p2, int p3) {}
        public CollectionInfo(int p0, int p1, boolean p2, int p3, int p4, int p5) {}
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain(int p0, int p1, boolean p2) { return null; }
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain(int p0, int p1, boolean p2, int p3) { return null; }
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo p0) { return null; }
        public int getColumnCount() { return 0; }
        public int getImportantForAccessibilityItemCount() { return 0; }
        public int getItemCount() { return 0; }
        public int getRowCount() { return 0; }
        public int getSelectionMode() { return 0; }
        public boolean isHierarchical() { return false; }
        @java.lang.Deprecated
        void recycle() {}

        public static final class Builder {
            private int mColumnCount;
            private boolean mHierarchical;
            private int mImportantForAccessibilityItemCount;
            private int mItemCount;
            private int mRowCount;
            private int mSelectionMode;
            public Builder() {}
            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo build() { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setColumnCount(int p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setHierarchical(boolean p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setImportantForAccessibilityItemCount(int p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setItemCount(int p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setRowCount(int p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setSelectionMode(int p0) { return null; }
        }
    }

    public static final class CollectionItemInfo {
        public static final int SORT_DIRECTION_ASCENDING = 1;
        public static final int SORT_DIRECTION_DESCENDING = 2;
        public static final int SORT_DIRECTION_NONE = 0;
        public static final int SORT_DIRECTION_OTHER = 3;
        private int mColumnIndex;
        private int mColumnSpan;
        private java.lang.String mColumnTitle;
        private boolean mHeading;
        private int mRowIndex;
        private int mRowSpan;
        private java.lang.String mRowTitle;
        private boolean mSelected;
        private int mSortDirection;
        private CollectionItemInfo() {}
        public CollectionItemInfo(int p0, int p1, int p2, int p3, boolean p4) {}
        public CollectionItemInfo(int p0, int p1, int p2, int p3, boolean p4, boolean p5) {}
        public CollectionItemInfo(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4, int p5, boolean p6, boolean p7) {}
        public CollectionItemInfo(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4, int p5, boolean p6, boolean p7, int p8) {}
        private static void enforceValidSortDirection(int p0) {}
        @java.lang.Deprecated
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(int p0, int p1, int p2, int p3, boolean p4) { return null; }
        @java.lang.Deprecated
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(int p0, int p1, int p2, int p3, boolean p4, boolean p5) { return null; }
        @java.lang.Deprecated
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo p0) { return null; }
        @java.lang.Deprecated
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4, int p5, boolean p6, boolean p7) { return null; }
        public int getColumnIndex() { return 0; }
        public int getColumnSpan() { return 0; }
        public java.lang.String getColumnTitle() { return null; }
        public int getRowIndex() { return 0; }
        public int getRowSpan() { return 0; }
        public java.lang.String getRowTitle() { return null; }
        public int getSortDirection() { return 0; }
        public boolean isHeading() { return false; }
        public boolean isSelected() { return false; }
        @java.lang.Deprecated
        void recycle() {}

        public static final class Builder {
            private int mColumnIndex;
            private int mColumnSpan;
            private java.lang.String mColumnTitle;
            private boolean mHeading;
            private int mRowIndex;
            private int mRowSpan;
            private java.lang.String mRowTitle;
            private boolean mSelected;
            private int mSortDirection;
            public Builder() {}
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo build() { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setColumnIndex(int p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setColumnSpan(int p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setColumnTitle(java.lang.String p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setHeading(boolean p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setRowIndex(int p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setRowSpan(int p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setRowTitle(java.lang.String p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setSelected(boolean p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setSortDirection(int p0) { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SortDirection {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ExpandedState {
    }

    public static final class ExtraRenderingInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo> CREATOR = null;
        private static final int UNDEFINED_COLOR = 0;
        private static final int UNDEFINED_VALUE = -1;
        private float mAlpha;
        private int mBackgroundColor;
        private int mHintTextColor;
        private android.util.Size mLayoutSize;
        private int mLinkTextColor;
        private int mTextColor;
        private float mTextSizeInPx;
        private int mTextSizeUnit;
        private ExtraRenderingInfo() {}
        private ExtraRenderingInfo(android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo p0) {}
        private void initFromParcel(android.os.Parcel p0) {}
        @java.lang.Deprecated
        public static android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo obtain() { return null; }
        @java.lang.Deprecated
        private static android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo obtain(android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo p0) { return null; }
        public int describeContents() { return 0; }
        public float getAlpha() { return 0.0f; }
        public int getBackgroundColor() { return 0; }
        public int getHintTextColor() { return 0; }
        public android.util.Size getLayoutSize() { return null; }
        public int getLinkTextColor() { return 0; }
        public int getTextColor() { return 0; }
        public float getTextSizeInPx() { return 0.0f; }
        public int getTextSizeUnit() { return 0; }
        @java.lang.Deprecated
        void recycle() {}
        public void setLayoutSize(int p0, int p1) {}
        public void setTextSizeInPx(float p0) {}
        public void setTextSizeUnit(int p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private float mAlpha;
            private int mBackgroundColor;
            private int mHintTextColor;
            private android.util.Size mLayoutSize;
            private int mLinkTextColor;
            private int mTextColor;
            private float mTextSizeInPx;
            private int mTextSizeUnit;
            public Builder() {}
            public Builder(android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo p0) {}
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo build() { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder clearAlpha() { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder clearBackgroundColor() { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder clearHintTextColor() { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder clearLayoutSize() { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder clearLinkTextColor() { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder clearTextColor() { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder clearTextSizeInPx() { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder clearTextSizeUnit() { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder setAlpha(float p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder setBackgroundColor(int p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder setHintTextColor(int p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder setLayoutSize(int p0, int p1) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder setLinkTextColor(int p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder setTextColor(int p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder setTextSizeInPx(float p0) { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder setTextSizeUnit(int p0) { return null; }
        }
    }

    public static final class MathInfo extends android.view.accessibility.AccessibilityNodeInfo.StructuredDataInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityNodeInfo.MathInfo> CREATOR = null;
        public static final java.lang.String MATH_ATTRIBUTE_ARG = "arg";
        public static final java.lang.String MATH_ATTRIBUTE_INTENT = "intent";
        public static final java.lang.String MATH_TAG_FRACTION = "mfrac";
        public static final java.lang.String MATH_TAG_IDENTIFIER = "mi";
        public static final java.lang.String MATH_TAG_MATH = "math";
        public static final java.lang.String MATH_TAG_MULTISCRIPTS = "mmultiscripts";
        public static final java.lang.String MATH_TAG_NONE_SCRIPT = "none";
        public static final java.lang.String MATH_TAG_NUMBER = "mn";
        public static final java.lang.String MATH_TAG_OPERATOR = "mo";
        public static final java.lang.String MATH_TAG_OVER = "mover";
        public static final java.lang.String MATH_TAG_PRESCRIPT_DELIMITER = "mprescripts";
        public static final java.lang.String MATH_TAG_ROOT = "mroot";
        public static final java.lang.String MATH_TAG_ROW = "mrow";
        public static final java.lang.String MATH_TAG_SQUARE_ROOT = "msqrt";
        public static final java.lang.String MATH_TAG_STRING_LITERAL = "ms";
        public static final java.lang.String MATH_TAG_SUB = "msub";
        public static final java.lang.String MATH_TAG_SUB_SUP = "msubsup";
        public static final java.lang.String MATH_TAG_SUP = "msup";
        public static final java.lang.String MATH_TAG_TABLE = "mtable";
        public static final java.lang.String MATH_TAG_TABLE_CELL = "mtd";
        public static final java.lang.String MATH_TAG_TABLE_ROW = "mtr";
        public static final java.lang.String MATH_TAG_TEXT = "mtext";
        public static final java.lang.String MATH_TAG_UNDER = "munder";
        public static final java.lang.String MATH_TAG_UNDER_OVER = "munderover";
        private MathInfo(android.os.Parcel p0) { super(null); }
        private MathInfo(android.view.accessibility.AccessibilityNodeInfo.MathInfo p0) { super(null); }
        public MathInfo(java.lang.String p0) { super(null); }
        public int describeContents() { return 0; }
        public java.lang.String getAttribute(java.lang.String p0) { return null; }
        public java.lang.String getTag() { return null; }
        public void putAttribute(java.lang.String p0, java.lang.String p1) {}
        public void removeAttribute(java.lang.String p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface MathAttribute {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface MathTag {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PrefetchingStrategy {
    }

    public static final class RangeInfo {
        public static final android.view.accessibility.AccessibilityNodeInfo.RangeInfo INDETERMINATE = null;
        public static final int RANGE_TYPE_FLOAT = 1;
        public static final int RANGE_TYPE_INDETERMINATE = 3;
        public static final int RANGE_TYPE_INT = 0;
        public static final int RANGE_TYPE_PERCENT = 2;
        private float mCurrent;
        private float mMax;
        private float mMin;
        private int mType;
        public RangeInfo(int p0, float p1, float p2, float p3) {}
        @java.lang.Deprecated
        public static android.view.accessibility.AccessibilityNodeInfo.RangeInfo obtain(int p0, float p1, float p2, float p3) { return null; }
        public float getCurrent() { return 0.0f; }
        public float getMax() { return 0.0f; }
        public float getMin() { return 0.0f; }
        public int getType() { return 0; }
        @java.lang.Deprecated
        void recycle() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface RangeType {
        }
    }

    public static final class Selection implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityNodeInfo.Selection> CREATOR = null;
        private final android.view.accessibility.AccessibilityNodeInfo.SelectionPosition mEnd = null;
        private final android.view.accessibility.AccessibilityNodeInfo.SelectionPosition mStart = null;
        private Selection(android.os.Parcel p0) {}
        public Selection(android.view.accessibility.AccessibilityNodeInfo.SelectionPosition p0, android.view.accessibility.AccessibilityNodeInfo.SelectionPosition p1) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.view.accessibility.AccessibilityNodeInfo.SelectionPosition getEnd() { return null; }
        public android.view.accessibility.AccessibilityNodeInfo.SelectionPosition getStart() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class SelectionPosition implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityNodeInfo.SelectionPosition> CREATOR = null;
        public static final int OFFSET_TYPE_CHILD = 1;
        public static final int OFFSET_TYPE_TEXT = 0;
        private boolean mAttachedToSealedNode;
        private int mConnectionId;
        private final int mOffset = 0;
        private final int mOffsetType = 0;
        private final long mSourceNodeId = 0L;
        private int mWindowId;
        private SelectionPosition(long p0, int p1, int p2) {}
        private SelectionPosition(android.os.Parcel p0) {}
        public SelectionPosition(android.view.View p0, int p1) {}
        public SelectionPosition(android.view.View p0, int p1, int p2) {}
        public SelectionPosition(android.view.accessibility.AccessibilityNodeInfo p0, int p1) {}
        private void setConnectionId(int p0) {}
        private void setWindowId(int p0) {}
        private boolean usesNode(android.view.accessibility.AccessibilityNodeInfo p0) { return false; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.view.accessibility.AccessibilityNodeInfo getNode() { return null; }
        public int getOffset() { return 0; }
        public int getOffsetType() { return 0; }
        public android.view.View getView() { return null; }
        public int getVirtualDescendantId() { return 0; }
        public int hashCode() { return 0; }
        public void setAttachedToSealedNode(boolean p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private final int mOffset = 0;
            private int mOffsetType;
            private final long mSourceNodeId = 0L;
            public Builder(android.view.View p0, int p1) {}
            public Builder(android.view.View p0, int p1, int p2) {}
            public Builder(android.view.accessibility.AccessibilityNodeInfo p0, int p1) {}
            public android.view.accessibility.AccessibilityNodeInfo.SelectionPosition build() { return null; }
            public android.view.accessibility.AccessibilityNodeInfo.SelectionPosition.Builder setOffsetType(int p0) { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface OffsetType {
        }
    }

    public static abstract class StructuredDataInfo {
        private android.os.Bundle mAttributes;
        private final java.lang.String mTag = null;
        protected StructuredDataInfo(java.lang.String p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getAttribute(java.lang.String p0) { return null; }
        public java.util.Map<java.lang.String, java.lang.String> getAttributes() { return null; }
        protected android.os.Bundle getAttributesBundle() { return null; }
        public java.lang.String getTag() { return null; }
        public int hashCode() { return 0; }
        public void putAttribute(java.lang.String p0, java.lang.String p1) {}
        public void removeAttribute(java.lang.String p0) {}
        protected void setAttributesBundle(android.os.Bundle p0) {}
    }

    public static final class TouchDelegateInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo> CREATOR = null;
        private int mConnectionId;
        private android.util.ArrayMap<android.graphics.Region, java.lang.Long> mTargetMap;
        private int mWindowId;
        TouchDelegateInfo(android.util.ArrayMap<android.graphics.Region, java.lang.Long> p0, boolean p1) {}
        public TouchDelegateInfo(java.util.Map<android.graphics.Region, android.view.View> p0) {}
        private void setConnectionId(int p0) {}
        private void setWindowId(int p0) {}
        public int describeContents() { return 0; }
        public long getAccessibilityIdForRegion(android.graphics.Region p0) { return 0L; }
        public android.graphics.Region getRegionAt(int p0) { return null; }
        public int getRegionCount() { return 0; }
        public android.view.accessibility.AccessibilityNodeInfo getTargetForRegion(android.graphics.Region p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
