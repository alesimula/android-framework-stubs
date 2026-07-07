package android.widget;

public class Editor {
    private static final int ACTION_MODE_MENU_ITEM_ORDER_ASSIST = 0;
    private static final int ACTION_MODE_MENU_ITEM_ORDER_AUTOFILL = 11;
    private static final int ACTION_MODE_MENU_ITEM_ORDER_COPY = 5;
    private static final int ACTION_MODE_MENU_ITEM_ORDER_CUT = 4;
    private static final int ACTION_MODE_MENU_ITEM_ORDER_LOOK_UP = 8;
    private static final int ACTION_MODE_MENU_ITEM_ORDER_PASTE = 6;
    private static final int ACTION_MODE_MENU_ITEM_ORDER_PASTE_AS_PLAIN_TEXT = 12;
    private static final int ACTION_MODE_MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
    private static final int ACTION_MODE_MENU_ITEM_ORDER_REPLACE = 10;
    private static final int ACTION_MODE_MENU_ITEM_ORDER_SECONDARY_ASSIST_ACTIONS_START = 50;
    private static final int ACTION_MODE_MENU_ITEM_ORDER_SELECT_ALL = 9;
    private static final int ACTION_MODE_MENU_ITEM_ORDER_SHARE = 7;
    private static final int CONTEXT_MENU_GROUP_CLIPBOARD = 2;
    private static final int CONTEXT_MENU_GROUP_MISC = 3;
    private static final int CONTEXT_MENU_GROUP_UNDO_REDO = 1;
    private static final int CONTEXT_MENU_ITEM_ORDER_REPLACE = 11;
    private static final int CURSOR_START_FLOAT_DISTANCE_PX = 20;
    private static final boolean DEBUG_UNDO = false;
    private static final int DELAY_BEFORE_HANDLE_FADES_OUT = 4000;
    private static final int DRAG_SHADOW_MAX_TEXT_LENGTH = 20;
    static final int EXTRACT_NOTHING = -2;
    static final int EXTRACT_UNKNOWN = -1;
    private static final int FLAG_MISSPELLED_OR_GRAMMAR_ERROR = 10;
    private static final boolean FLAG_USE_MAGNIFIER = true;
    public static final int HANDLE_TYPE_SELECTION_END = 1;
    public static final int HANDLE_TYPE_SELECTION_START = 0;
    private static final int LINE_CHANGE_SLOP_MAX_DP = 45;
    private static final int LINE_CHANGE_SLOP_MIN_DP = 8;
    private static final int MAX_LINE_HEIGHT_FOR_MAGNIFIER = 32;
    private static final int MIN_LINE_HEIGHT_FOR_MAGNIFIER = 20;
    private static final int RECENT_CUT_COPY_DURATION_MS = 15000;
    private static final java.lang.String TAG = "Editor";
    private static final java.lang.String UNDO_OWNER_TAG = "Editor";
    private static final int UNSET_LINE = -1;
    private static final int UNSET_X_VALUE = -1;
    private final android.widget.Editor.AccessibilitySmartActions mA11ySmartActions = null;
    boolean mAllowUndo;
    private final android.window.OnBackInvokedCallback mBackCallback = null;
    private boolean mBackCallbackRegistered;
    private android.widget.Editor.Blink mBlink;
    private int mBlinkInterval;
    private float mContextMenuAnchorX;
    private float mContextMenuAnchorY;
    private android.widget.Editor.CorrectionHighlighter mCorrectionHighlighter;
    boolean mCreatedWithASelection;
    private final android.widget.Editor.CursorAnchorInfoNotifier mCursorAnchorInfoNotifier = null;
    private float mCursorDragDirectionMinXYRatio;
    boolean mCursorVisible;
    android.view.ActionMode.Callback mCustomInsertionActionModeCallback;
    android.view.ActionMode.Callback mCustomSelectionActionModeCallback;
    private final android.widget.TextViewOnReceiveContentListener mDefaultOnReceiveContentListener = null;
    boolean mDiscardNextActionUp;
    private final int mDoubleTapTimeoutMillis = 0;
    private boolean mDrawCursorOnMagnifier;
    android.graphics.drawable.Drawable mDrawableForCursor;
    java.lang.CharSequence mError;
    private android.widget.Editor.ErrorPopup mErrorPopup;
    boolean mErrorWasChanged;
    private boolean mFlagCursorDragFromAnywhereEnabled;
    private boolean mFlagInsertionHandleGesturesEnabled;
    boolean mFrozenWithFocus;
    private final boolean mHapticTextHandleEnabled = false;
    private boolean mHasPendingRestartInputForSetText;
    boolean mIgnoreActionUpEvent;
    boolean mInBatchEditControllers;
    private float mInitialZoom;
    android.widget.Editor.InputContentType mInputContentType;
    android.widget.Editor.InputMethodState mInputMethodState;
    int mInputType;
    private android.widget.Editor.InsertModeController mInsertModeController;
    private java.lang.Runnable mInsertionActionModeRunnable;
    private boolean mInsertionControllerEnabled;
    android.widget.Editor.InsertionPointCursorController mInsertionPointCursorController;
    boolean mIsBeingLongClicked;
    boolean mIsBeingLongClickedByAccessibility;
    boolean mIsInsertionActionModeStartPending;
    android.text.method.KeyListener mKeyListener;
    private int mLastButtonState;
    private int mLineChangeSlopMax;
    private int mLineChangeSlopMin;
    private final float mLineSlopRatio = 0.0f;
    private android.widget.Editor.MagnifierMotionAnimator mMagnifierAnimator;
    private final android.view.ViewTreeObserver.OnDrawListener mMagnifierOnDrawListener = null;
    private int mMaxLineHeightForMagnifier;
    private int mMinLineHeightForMagnifier;
    private final boolean mNewMagnifierEnabled = false;
    private final android.view.MenuItem.OnMenuItemClickListener mOnContextMenuItemClickListener = null;
    private android.widget.Editor.PositionListener mPositionListener;
    private boolean mPreserveSelection;
    final android.widget.Editor.ProcessTextIntentActionsHandler mProcessTextIntentActionsHandler = null;
    private boolean mRenderCursorRegardlessTiming;
    private boolean mRequestingLinkActionMode;
    private boolean mRestartActionModeOnNextRefresh;
    boolean mSelectAllOnFocus;
    android.graphics.drawable.Drawable mSelectHandleCenter;
    android.graphics.drawable.Drawable mSelectHandleLeft;
    android.graphics.drawable.Drawable mSelectHandleRight;
    private android.widget.SelectionActionModeHelper mSelectionActionModeHelper;
    private boolean mSelectionControllerEnabled;
    android.widget.Editor.SelectionModifierCursorController mSelectionModifierCursorController;
    boolean mSelectionMoved;
    private long mShowCursor;
    private boolean mShowErrorAfterAttach;
    private final java.lang.Runnable mShowFloatingToolbar = null;
    boolean mShowSoftInputOnFocus;
    private java.lang.Runnable mShowSuggestionRunnable;
    private android.widget.Editor.SpanController mSpanController;
    android.widget.SpellChecker mSpellChecker;
    private final android.widget.Editor.SuggestionHelper mSuggestionHelper = null;
    android.text.style.SuggestionRangeSpan mSuggestionRangeSpan;
    private android.widget.Editor.SuggestionsPopupWindow mSuggestionsPopupWindow;
    private android.graphics.Rect mTempRect;
    private android.view.ActionMode mTextActionMode;
    boolean mTextIsSelectable;
    private android.widget.Editor.TextRenderNode[] mTextRenderNodes;
    private final android.widget.TextView mTextView = null;
    boolean mTouchFocusSelected;
    private final android.widget.EditorTouchState mTouchState = null;
    final android.widget.Editor.UndoInputFilter mUndoInputFilter = null;
    private final android.content.UndoManager mUndoManager = null;
    private android.content.UndoOwner mUndoOwner;
    private final java.lang.Runnable mUpdateMagnifierRunnable = null;
    private boolean mUpdateWordIteratorText;
    private android.text.method.WordIterator mWordIterator;
    private android.text.method.WordIterator mWordIteratorWithText;
    public Editor(android.widget.TextView p0) {}
    private void chooseSize(android.widget.PopupWindow p0, java.lang.CharSequence p1, android.widget.TextView p2) {}
    private int clampHorizontalPosition(android.graphics.drawable.Drawable p0, float p1) { return 0; }
    private android.widget.Magnifier.Builder createBuilderWithInlineMagnifierDefaults() { return null; }
    private void deleteSourceAfterLocalDrop(android.widget.Editor.DragLocalState p0, int p1, int p2) {}
    private void discardTextDisplayLists() {}
    private void downgradeEasyCorrectionSpans() {}
    private void drawCursor(android.graphics.Canvas p0, int p1) {}
    private void drawHardwareAccelerated(android.graphics.Canvas p0, android.text.Layout p1, java.util.List<android.graphics.Path> p2, java.util.List<android.graphics.Paint> p3, android.graphics.Path p4, android.graphics.Paint p5, int p6, boolean p7) {}
    private int drawHardwareAcceleratedInner(android.graphics.Canvas p0, android.text.Layout p1, android.graphics.Path p2, android.graphics.Paint p3, int p4, int[] p5, int[] p6, int p7, int p8, int p9) { return 0; }
    private void drawLayout(android.graphics.Canvas p0, android.text.Layout p1, java.util.List<android.graphics.Path> p2, java.util.List<android.graphics.Paint> p3, android.graphics.Path p4, android.graphics.Paint p5, int p6, boolean p7) {}
    private void ensureNoSelectionIfNonSelectable() {}
    private boolean extractTextInternal(android.view.inputmethod.ExtractedTextRequest p0, int p1, int p2, int p3, android.view.inputmethod.ExtractedText p4) { return false; }
    private boolean extractedTextModeWillBeStarted() { return false; }
    private android.text.style.SuggestionSpan findEquivalentSuggestionSpan(android.widget.Editor.SuggestionSpanInfo p0) { return null; }
    private int getAvailableDisplayListIndex(int[] p0, int p1, int p2) { return 0; }
    private long getCharClusterRange(int p0) { return 0L; }
    private int getErrorX() { return 0; }
    private int getErrorY() { return 0; }
    private android.view.inputmethod.InputMethodManager getInputMethodManager() { return null; }
    private int getLastTapPosition() { return 0; }
    private long getLastTouchOffsets() { return 0L; }
    private android.widget.Editor.MagnifierMotionAnimator getMagnifierAnimator() { return null; }
    private int getNextCursorOffset(int p0, boolean p1) { return 0; }
    private long getParagraphsRange(int p0, int p1) { return 0L; }
    private android.widget.Editor.PositionListener getPositionListener() { return null; }
    private android.widget.SelectionActionModeHelper getSelectionActionModeHelper() { return null; }
    private android.view.View.DragShadowBuilder getTextThumbnailBuilder(int p0, int p1) { return null; }
    private int getWordEnd(int p0) { return 0; }
    private android.text.method.WordIterator getWordIteratorWithText() { return null; }
    private int getWordStart(int p0) { return 0; }
    private void hideCursorControllers() {}
    private void hideError() {}
    private void hideSpanControllers() {}
    private void invalidateActionMode() {}
    private boolean isCursorInsideEasyCorrectionSpan() { return false; }
    private boolean isCursorVisible() { return false; }
    private boolean isOffsetVisible(int p0) { return false; }
    private boolean isPositionOnText(float p0, float p1) { return false; }
    private static boolean isValidRange(java.lang.CharSequence p0, int p1, int p2) { return false; }
    static void logCursor(java.lang.String p0, java.lang.String p1, java.lang.Object... p2) {}
    private boolean needsToSelectAllToSelectWordOrParagraph() { return false; }
    private void registerOnBackInvokedCallback() {}
    private void replaceWithSuggestion(android.widget.Editor.SuggestionInfo p0) {}
    private void resumeBlink() {}
    private boolean selectCurrentParagraph() { return false; }
    private boolean selectCurrentWordAndStartDrag() { return false; }
    private void sendUpdateSelection() {}
    private void setAssistContextMenuItems(android.view.Menu p0) {}
    private void setErrorIcon(android.graphics.drawable.Drawable p0) {}
    private boolean shouldBlink() { return false; }
    private boolean shouldFilterOutTouchEvent(android.view.MotionEvent p0) { return false; }
    private void showError() {}
    private void showFloatingToolbar() {}
    private void startDragAndDrop() {}
    private void suspendBlink() {}
    private void toggleInsertionActionMode() {}
    private boolean touchPositionIsInSelection() { return false; }
    private void unregisterOnBackInvokedCallback() {}
    private void updateCursorPosition(int p0, int p1, float p2) {}
    private void updateFloatingToolbarVisibility(android.view.MotionEvent p0) {}
    private void updateSpellCheckSpans(int p0, int p1, boolean p2) {}
    public void addSpanWatchers(android.text.Spannable p0) {}
    public void adjustIconSpacing(android.view.ContextMenu p0) {}
    void adjustInputType(boolean p0, boolean p1, boolean p2, boolean p3) {}
    void beforeSetText() {}
    public void beginBatchEdit() {}
    boolean canRedo() { return false; }
    boolean canUndo() { return false; }
    boolean checkField() { return false; }
    void createInputContentTypeIfNeeded() {}
    void createInputMethodStateIfNeeded() {}
    public void endBatchEdit() {}
    void ensureEndedBatchEdit() {}
    boolean enterInsertMode(int p0) { return false; }
    void exitInsertMode() {}
    boolean extractText(android.view.inputmethod.ExtractedTextRequest p0, android.view.inputmethod.ExtractedText p1) { return false; }
    void finishBatchEdit(android.widget.Editor.InputMethodState p0) {}
    void forgetUndoRedo() {}
    public int getCurrentLineAdjustedForSlop(android.text.Layout p0, int p1, float p2) { return 0; }
    public android.graphics.drawable.Drawable getCursorDrawable() { return null; }
    public android.widget.TextViewOnReceiveContentListener getDefaultOnReceiveContentListener() { return null; }
    public boolean getFlagCursorDragFromAnywhereEnabled() { return false; }
    public boolean getFlagInsertionHandleGesturesEnabled() { return false; }
    public android.widget.Editor.InsertionPointCursorController getInsertionController() { return null; }
    float getLastUpPositionX() { return 0.0f; }
    float getLastUpPositionY() { return 0.0f; }
    public android.widget.Editor.SelectionModifierCursorController getSelectionController() { return null; }
    android.view.ActionMode getTextActionMode() { return null; }
    android.widget.TextView getTextView() { return null; }
    public android.text.method.WordIterator getWordIterator() { return null; }
    boolean hasInsertionController() { return false; }
    boolean hasSelectionController() { return false; }
    void hideCursorAndSpanControllers() {}
    void hideFloatingToolbar(int p0) {}
    void hideInsertionPointCursorController() {}
    void invalidateActionModeAsync() {}
    void invalidateHandlesAndActionMode() {}
    void invalidateTextDisplayList() {}
    void invalidateTextDisplayList(android.text.Layout p0, int p1, int p2) {}
    public boolean isBlinking() { return false; }
    void loadCursorDrawable() {}
    void loadHandleDrawables(boolean p0) {}
    void makeBlink() {}
    void maybeFireScheduledRestartInputForSetText() {}
    void onAttachedToWindow() {}
    public void onCommitCorrection(android.view.inputmethod.CorrectionInfo p0) {}
    public void onCreateContextMenu(android.view.ContextMenu p0) {}
    void onDetachedFromWindow() {}
    void onDraw(android.graphics.Canvas p0, android.text.Layout p1, java.util.List<android.graphics.Path> p2, java.util.List<android.graphics.Paint> p3, android.graphics.Path p4, android.graphics.Paint p5, int p6) {}
    void onDrop(android.view.DragEvent p0) {}
    void onFocusChanged(boolean p0, int p1) {}
    void onInitializeSmartActionsAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
    void onLocaleChanged() {}
    void onScreenStateChanged(int p0) {}
    void onScrollChanged() {}
    final void onTextOperationUserChanged() {}
    public void onTouchEvent(android.view.MotionEvent p0) {}
    void onTouchUpEvent(android.view.MotionEvent p0) {}
    void onWindowFocusChanged(boolean p0) {}
    public boolean performLongClick(boolean p0) { return false; }
    boolean performSmartActionsAccessibilityAction(int p0) { return false; }
    void prepareCursorControllers() {}
    void redo() {}
    void refreshTextActionMode() {}
    void replace() {}
    boolean reportExtractedText() { return false; }
    void restoreInstanceState(android.os.ParcelableParcel p0) {}
    android.os.ParcelableParcel saveInstanceState() { return null; }
    void scheduleRestartInputForSetText() {}
    boolean selectCurrentWord() { return false; }
    void sendOnTextChanged(int p0, int p1, int p2) {}
    void setContextMenuAnchor(float p0, float p1) {}
    public void setCursorDragMinAngleFromVertical(int p0) {}
    public void setError(java.lang.CharSequence p0, android.graphics.drawable.Drawable p1) {}
    public void setFlagCursorDragFromAnywhereEnabled(boolean p0) {}
    public void setFlagInsertionHandleGesturesEnabled(boolean p0) {}
    void setFrame() {}
    public void setLineChangeSlopMinMaxForTesting(int p0, int p1) {}
    void setRestartActionModeOnNextRefresh(boolean p0) {}
    public void setShowCursorTime(long p0) {}
    public void setTextContextMenuItems(android.view.ContextMenu p0) {}
    public void setTextCursorBlinkIntervalMs(int p0) {}
    void setTransformationMethod(android.text.method.TransformationMethod p0) {}
    boolean shouldOfferToShowSuggestions() { return false; }
    public boolean shouldRenderCursor() { return false; }
    boolean startActionModeInternal(int p0) { return false; }
    void startInsertionActionMode() {}
    void startLinkActionModeAsync(int p0, int p1) {}
    void startSelectionActionModeAsync(boolean p0) {}
    protected void stopTextActionMode() {}
    void stopTextActionModeWithPreservingSelection() {}
    void undo() {}
    void updateCursorPosition() {}

    private static final class AccessibilitySmartActions {
        private final android.util.SparseArray<android.util.Pair<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction, android.app.RemoteAction>> mActions = null;
        private final android.widget.TextView mTextView = null;
        private AccessibilitySmartActions(android.widget.TextView p0) {}
        private void addAction(android.app.RemoteAction p0) {}
        private void reset() {}
        void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
        boolean performAccessibilityAction(int p0) { return false; }
    }

    public class AssistantCallbackHelper {
        private final java.util.Map<android.view.MenuItem, android.view.View.OnClickListener> mAssistClickHandlers = null;
        private final android.widget.SelectionActionModeHelper mHelper = null;
        private android.view.textclassifier.TextClassification mPrevTextClassification;
        public AssistantCallbackHelper(android.widget.Editor p0, android.widget.SelectionActionModeHelper p1) {}
        private android.view.MenuItem addAssistMenuItem(android.view.Menu p0, android.app.RemoteAction p1, int p2, int p3, int p4, android.view.MenuItem.OnMenuItemClickListener p5) { return null; }
        private void clearAssistMenuItems(android.view.Menu p0) {}
        private int createAssistMenuItemPendingIntentRequestCode() { return 0; }
        private boolean hasLegacyAssistItem(android.view.textclassifier.TextClassification p0) { return false; }
        private boolean shouldEnableAssistMenuItems() { return false; }
        public void clearCallbackHandlers() {}
        public android.view.View.OnClickListener getOnClickListener(android.view.MenuItem p0) { return null; }
        public boolean onAssistMenuItemClicked(android.view.MenuItem p0) { return false; }
        public void updateAssistMenuItems(android.view.Menu p0, android.view.MenuItem.OnMenuItemClickListener p1) {}
    }

    private class Blink implements java.lang.Runnable {
        private boolean mCancelled;
        private Blink(android.widget.Editor p0) {}
        void cancel() {}
        public void run() {}
        void uncancel() {}
    }

    private class CorrectionHighlighter {
        private static final int FADE_OUT_DURATION = 400;
        private int mEnd;
        private long mFadingStartTime;
        private final android.graphics.Paint mPaint = null;
        private final android.graphics.Path mPath = null;
        private int mStart;
        private android.graphics.RectF mTempRectF;
        public CorrectionHighlighter(android.widget.Editor p0) {}
        private void invalidate(boolean p0) {}
        private void stopAnimation() {}
        private boolean updatePaint() { return false; }
        private boolean updatePath() { return false; }
        public void draw(android.graphics.Canvas p0, int p1) {}
        public void highlight(android.view.inputmethod.CorrectionInfo p0) {}
    }

    private final class CursorAnchorInfoNotifier implements android.widget.Editor.TextViewPositionListener {
        final android.view.inputmethod.CursorAnchorInfo.Builder mCursorAnchorInfoBuilder = null;
        final android.graphics.Matrix mViewToScreenMatrix = null;
        private CursorAnchorInfoNotifier(android.widget.Editor p0) {}
        public void updatePosition(int p0, int p1, boolean p2, boolean p3) {}
    }

    private static interface CursorController extends android.view.ViewTreeObserver.OnTouchModeChangeListener {
        public void hide();
        public boolean isActive();
        public boolean isCursorBeingModified();
        public void onDetached();
        public void show();
    }

    private static class DragLocalState {
        public int end;
        public android.widget.TextView sourceTextView;
        public int start;
        public DragLocalState(android.widget.TextView p0, int p1, int p2) {}
    }

    private static interface EasyEditDeleteListener {
        public void onDeleteClick(android.text.style.EasyEditSpan p0);
    }

    private class EasyEditPopupWindow extends android.widget.Editor.PinnedPopupWindow implements android.view.View.OnClickListener {
        private static final int POPUP_TEXT_LAYOUT = 17367378;
        private android.widget.TextView mDeleteTextView;
        private android.text.style.EasyEditSpan mEasyEditSpan;
        private android.widget.Editor.EasyEditDeleteListener mOnDeleteListener;
        private EasyEditPopupWindow(android.widget.Editor p0) { super(null); }
        private void setOnDeleteListener(android.widget.Editor.EasyEditDeleteListener p0) {}
        protected int clipVertically(int p0) { return 0; }
        protected void createPopupWindow() {}
        protected int getTextOffset() { return 0; }
        protected int getVerticalLocalPosition(int p0) { return 0; }
        public void hide() {}
        protected void initContentView() {}
        public void onClick(android.view.View p0) {}
        public void setEasyEditSpan(android.text.style.EasyEditSpan p0) {}
    }

    public static class EditOperation extends android.content.UndoOperation<android.widget.Editor> {
        public static final android.os.Parcelable.ClassLoaderCreator<android.widget.Editor.EditOperation> CREATOR = null;
        private static final int TYPE_DELETE = 1;
        private static final int TYPE_INSERT = 0;
        private static final int TYPE_REPLACE = 2;
        private boolean mFrozen;
        private boolean mIsComposition;
        private int mNewCursorPos;
        private java.lang.String mNewText;
        private int mOldCursorPos;
        private java.lang.String mOldText;
        private int mStart;
        private int mType;
        public EditOperation(android.os.Parcel p0, java.lang.ClassLoader p1) { super((android.content.UndoOwner)null); }
        public EditOperation(android.widget.Editor p0, java.lang.String p1, int p2, java.lang.String p3, boolean p4) { super((android.content.UndoOwner)null); }
        private int getNewTextEnd() { return 0; }
        private int getOldTextEnd() { return 0; }
        private java.lang.String getTypeString() { return null; }
        private boolean mergeDeleteWith(android.widget.Editor.EditOperation p0) { return false; }
        private boolean mergeInsertWith(android.widget.Editor.EditOperation p0) { return false; }
        private boolean mergeReplaceWith(android.widget.Editor.EditOperation p0) { return false; }
        private boolean mergeWith(android.widget.Editor.EditOperation p0) { return false; }
        private static void modifyText(android.text.Editable p0, int p1, int p2, java.lang.CharSequence p3, int p4, int p5) {}
        public void commit() {}
        public void forceMergeWith(android.widget.Editor.EditOperation p0) {}
        public void redo() {}
        public java.lang.String toString() { return null; }
        public void undo() {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static class ErrorPopup extends android.widget.PopupWindow {
        private boolean mAbove;
        private int mPopupInlineErrorAboveBackgroundId;
        private int mPopupInlineErrorBackgroundId;
        private final android.widget.TextView mView = null;
        ErrorPopup(android.widget.TextView p0, int p1, int p2) { super(); }
        private int getResourceId(int p0, int p1) { return 0; }
        void fixDirection(boolean p0) {}
        public void update(int p0, int p1, int p2, int p3, boolean p4) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HandleType {
    }

    public abstract class HandleView extends android.view.View implements android.widget.Editor.TextViewPositionListener {
        private static final int HISTORY_SIZE = 5;
        private static final int TOUCH_UP_FILTER_DELAY_AFTER = 150;
        private static final int TOUCH_UP_FILTER_DELAY_BEFORE = 350;
        private final android.widget.PopupWindow mContainer = null;
        private float mCurrentDragInitialTouchRawX;
        protected android.graphics.drawable.Drawable mDrawable;
        protected android.graphics.drawable.Drawable mDrawableLtr;
        protected android.graphics.drawable.Drawable mDrawableRtl;
        protected int mHorizontalGravity;
        protected int mHotspotX;
        private final int mIdealFingerToCursorOffset = 0;
        private final float mIdealVerticalOffset = 0.0f;
        private boolean mIsDragging;
        private int mLastParentX;
        private int mLastParentXOnScreen;
        private int mLastParentY;
        private int mLastParentYOnScreen;
        private int mMinSize;
        private int mNumberPreviousOffsets;
        private boolean mPositionHasChanged;
        private int mPositionX;
        private int mPositionY;
        protected int mPrevLine;
        protected int mPreviousLineTouched;
        protected int mPreviousOffset;
        private int mPreviousOffsetIndex;
        private final int[] mPreviousOffsets = null;
        private final long[] mPreviousOffsetsTimes = null;
        private float mTextViewScaleX;
        private float mTextViewScaleY;
        private float mTouchOffsetY;
        private float mTouchToWindowOffsetX;
        private float mTouchToWindowOffsetY;
        private HandleView(android.widget.Editor p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, int p3) { super((android.content.Context)null); }
        private void addPositionToTouchUpFilter(int p0) {}
        private boolean checkForTransforms() { return false; }
        private void filterOnTouchUp(boolean p0) {}
        private int getHorizontalOffset() { return 0; }
        private android.widget.Editor.HandleView getOtherSelectionHandle() { return null; }
        private boolean handleOverlapsMagnifier(android.widget.Editor.HandleView p0, android.graphics.Rect p1) { return false; }
        private boolean obtainMagnifierShowCoordinates(android.view.MotionEvent p0, android.graphics.PointF p1) { return false; }
        private void setVisible(boolean p0) {}
        private boolean shouldShow() { return false; }
        private void startTouchUpFilter(int p0) {}
        private boolean tooLargeTextForMagnifier() { return false; }
        private void updateHandlesVisibility() {}
        protected void dismiss() {}
        protected final void dismissMagnifier() {}
        public abstract int getCurrentCursorOffset();
        int getCursorHorizontalPosition(android.text.Layout p0, int p1) { return 0; }
        protected int getCursorOffset() { return 0; }
        public float getHorizontal(android.text.Layout p0, int p1) { return 0.0f; }
        protected abstract int getHorizontalGravity(boolean p0);
        protected abstract int getHotspotX(android.graphics.drawable.Drawable p0, boolean p1);
        final int getIdealFingerToCursorOffset() { return 0; }
        public float getIdealVerticalOffset() { return 0.0f; }
        public int getLineForOffset(android.text.Layout p0, int p1) { return 0; }
        protected abstract int getMagnifierHandleTrigger();
        protected int getOffsetAtCoordinate(android.text.Layout p0, int p1, float p2) { return 0; }
        protected final int getPreferredHeight() { return 0; }
        protected final int getPreferredWidth() { return 0; }
        public void hide() {}
        public void invalidate() {}
        protected boolean isAtRtlRun(android.text.Layout p0, int p1) { return false; }
        public boolean isDragging() { return false; }
        public boolean isShowing() { return false; }
        public boolean offsetHasBeenChanged() { return false; }
        public void onDetached() {}
        protected void onDraw(android.graphics.Canvas p0) {}
        void onHandleMoved() {}
        protected void onMeasure(int p0, int p1) {}
        protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        protected void positionAtCursorOffset(int p0, boolean p1, boolean p2) {}
        void setDrawables(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1) {}
        public void show() {}
        protected void updateDrawable(boolean p0) {}
        protected final void updateMagnifier(android.view.MotionEvent p0) {}
        protected abstract void updatePosition(float p0, float p1, boolean p2);
        public void updatePosition(int p0, int p1, boolean p2, boolean p3) {}
        protected abstract void updateSelection(int p0);
    }

    static class InputContentType {
        boolean enterDown;
        android.os.Bundle extras;
        int imeActionId;
        java.lang.CharSequence imeActionLabel;
        android.os.LocaleList imeHintLocales;
        int imeOptions;
        android.widget.TextView.OnEditorActionListener onEditorActionListener;
        java.lang.String privateImeOptions;
        InputContentType() {}
    }

    static class InputMethodState {
        int mBatchEditNesting;
        int mChangedDelta;
        int mChangedEnd;
        int mChangedStart;
        boolean mContentChanged;
        boolean mCursorChanged;
        final android.view.inputmethod.ExtractedText mExtractedText = null;
        android.view.inputmethod.ExtractedTextRequest mExtractedTextRequest;
        boolean mIsCommittingText;
        boolean mIsConversionSuggestionSelected;
        boolean mSelectionModeChanged;
        int mUpdateCursorAnchorInfoFilter;
        int mUpdateCursorAnchorInfoMode;
        InputMethodState() {}
    }

    private class InsertionHandleView extends android.widget.Editor.HandleView {
        private final int mDeltaHeight = 0;
        private final int mDrawableOpacity = 0;
        private java.lang.Runnable mHider;
        private boolean mIsInActionMode;
        private boolean mIsTouchDown;
        private float mLastDownRawX;
        private float mLastDownRawY;
        private long mLastUpTime;
        private boolean mOffsetChanged;
        private int mOffsetDown;
        private boolean mPendingDismissOnUp;
        private float mTouchDownX;
        private float mTouchDownY;
        InsertionHandleView(android.widget.Editor p0, android.graphics.drawable.Drawable p1) { super(null, null, null, 0); }
        private void hideAfterDelay() {}
        private void removeHiderCallback() {}
        private boolean touchThrough(android.view.MotionEvent p0) { return false; }
        private android.view.MotionEvent transformEventForTouchThrough(android.view.MotionEvent p0) { return null; }
        public void dismiss() {}
        public int getCurrentCursorOffset() { return 0; }
        int getCursorHorizontalPosition(android.text.Layout p0, int p1) { return 0; }
        protected int getCursorOffset() { return 0; }
        protected int getHorizontalGravity(boolean p0) { return 0; }
        protected int getHotspotX(android.graphics.drawable.Drawable p0, boolean p1) { return 0; }
        protected int getMagnifierHandleTrigger() { return 0; }
        public boolean isShowing() { return false; }
        public void onDetached() {}
        void onHandleMoved() {}
        protected void onMeasure(int p0, int p1) {}
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        public void show() {}
        protected void updateDrawable(boolean p0) {}
        protected void updatePosition(float p0, float p1, boolean p2) {}
        public void updateSelection(int p0) {}
    }

    public class InsertionPointCursorController implements android.widget.Editor.CursorController {
        private android.widget.Editor.InsertionHandleView mHandle;
        private boolean mIsDraggingCursor;
        private boolean mIsTouchSnappedToHandleDuringDrag;
        private int mPrevLineDuringDrag;
        public InsertionPointCursorController(android.widget.Editor p0) {}
        private void endCursorDrag(android.view.MotionEvent p0) {}
        private int getLineDuringDrag(android.view.MotionEvent p0) { return 0; }
        private boolean isFromStylus(android.view.MotionEvent p0) { return false; }
        private void performCursorDrag(android.view.MotionEvent p0) {}
        private void positionCursorDuringDrag(android.view.MotionEvent p0) {}
        private void reloadHandleDrawable() {}
        private void startCursorDrag(android.view.MotionEvent p0) {}
        public android.widget.Editor.InsertionHandleView getHandle() { return null; }
        public void hide() {}
        public void invalidateHandle() {}
        public boolean isActive() { return false; }
        public boolean isCursorBeingModified() { return false; }
        public void onDetached() {}
        public void onTouchEvent(android.view.MotionEvent p0) {}
        public void onTouchModeChanged(boolean p0) {}
        public void show() {}
    }

    private static final class InsertModeController {
        private final android.graphics.Paint mHighlightPaint = null;
        private final android.graphics.Path mHighlightPath = null;
        private android.text.method.InsertModeTransformationMethod mInsertModeTransformationMethod;
        private boolean mIsInsertModeActive;
        private final android.widget.TextView mTextView = null;
        private boolean mUpdatingTransformationMethod;
        InsertModeController(android.widget.TextView p0) {}
        private void setTransformationMethod(android.text.method.TransformationMethod p0, boolean p1) {}
        void beforeSetText() {}
        boolean enterInsertMode(int p0) { return false; }
        void exitInsertMode() {}
        void exitInsertMode(boolean p0) {}
        void onDraw(android.graphics.Canvas p0) {}
        void updateTransformationMethod(android.text.method.TransformationMethod p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface MagnifierHandleTrigger {
        public static final int INSERTION = 0;
        public static final int SELECTION_END = 2;
        public static final int SELECTION_START = 1;
    }

    private static class MagnifierMotionAnimator {
        private static final long DURATION = 100L;
        private float mAnimationCurrentX;
        private float mAnimationCurrentY;
        private float mAnimationStartX;
        private float mAnimationStartY;
        private final android.animation.ValueAnimator mAnimator = null;
        private float mLastX;
        private float mLastY;
        private final android.widget.Magnifier mMagnifier = null;
        private boolean mMagnifierIsShowing;
        private MagnifierMotionAnimator(android.widget.Magnifier p0) {}
        private void dismiss() {}
        private void show(float p0, float p1) {}
        private void update() {}
    }

    private abstract class PinnedPopupWindow implements android.widget.Editor.TextViewPositionListener {
        int mClippingLimitLeft;
        int mClippingLimitRight;
        protected android.view.ViewGroup mContentView;
        protected android.widget.PopupWindow mPopupWindow;
        int mPositionX;
        int mPositionY;
        public PinnedPopupWindow(android.widget.Editor p0) {}
        private void computeLocalPosition() {}
        private void updatePosition(int p0, int p1) {}
        protected abstract int clipVertically(int p0);
        protected abstract void createPopupWindow();
        protected abstract int getTextOffset();
        protected abstract int getVerticalLocalPosition(int p0);
        public void hide() {}
        protected abstract void initContentView();
        public boolean isShowing() { return false; }
        protected void measureContent() {}
        protected void setUp() {}
        public void show() {}
        public void updatePosition(int p0, int p1, boolean p2, boolean p3) {}
    }

    private class PositionListener implements android.view.ViewTreeObserver.OnPreDrawListener {
        private static final int MAXIMUM_NUMBER_OF_LISTENERS = 7;
        private boolean[] mCanMove;
        private int mNumberOfListeners;
        private boolean mPositionHasChanged;
        private android.widget.Editor.TextViewPositionListener[] mPositionListeners;
        private int mPositionX;
        private int mPositionXOnScreen;
        private int mPositionY;
        private int mPositionYOnScreen;
        private boolean mScrollHasChanged;
        final int[] mTempCoords = null;
        private PositionListener(android.widget.Editor p0) {}
        private void updatePosition() {}
        public void addSubscriber(android.widget.Editor.TextViewPositionListener p0, boolean p1) {}
        public int getPositionX() { return 0; }
        public int getPositionXOnScreen() { return 0; }
        public int getPositionY() { return 0; }
        public int getPositionYOnScreen() { return 0; }
        public boolean onPreDraw() { return false; }
        public void onScrollChanged() {}
        public void removeSubscriber(android.widget.Editor.TextViewPositionListener p0) {}
    }

    static final class ProcessTextIntentActionsHandler {
        private final android.util.SparseArray<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> mAccessibilityActions = null;
        private final android.util.SparseArray<android.content.Intent> mAccessibilityIntents = null;
        private final android.content.Context mContext = null;
        private final android.widget.Editor mEditor = null;
        private final android.content.pm.PackageManager mPackageManager = null;
        private final java.lang.String mPackageName = null;
        private final java.util.List<android.content.pm.ResolveInfo> mSupportedActivities = null;
        private final android.widget.TextView mTextView = null;
        private ProcessTextIntentActionsHandler(android.widget.Editor p0) {}
        private android.content.Intent createProcessTextIntent() { return null; }
        private android.content.Intent createProcessTextIntentForResolveInfo(android.content.pm.ResolveInfo p0) { return null; }
        private boolean fireIntent(android.content.Intent p0) { return false; }
        private java.lang.CharSequence getLabel(android.content.pm.ResolveInfo p0) { return null; }
        private boolean isSupportedActivity(android.content.pm.ResolveInfo p0) { return false; }
        private void loadSupportedActivities() {}
        public void initializeAccessibilityActions() {}
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
        public void onInitializeMenu(android.view.Menu p0) {}
        public boolean performAccessibilityAction(int p0) { return false; }
        public boolean performMenuItemAction(android.view.MenuItem p0) { return false; }
    }

    public final class SelectionHandleView extends android.widget.Editor.HandleView {
        private final int mHandleType = 0;
        private boolean mInWord;
        private boolean mLanguageDirectionChanged;
        private float mPrevX;
        private final float mTextViewEdgeSlop = 0.0f;
        private final int[] mTextViewLocation = null;
        private float mTouchWordDelta;
        public SelectionHandleView(android.widget.Editor p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, int p3, int p4) { super(null, null, null, 0); }
        private float getHorizontal(android.text.Layout p0, int p1, boolean p2) { return 0.0f; }
        private boolean isStartHandle() { return false; }
        private void positionAndAdjustForCrossingHandles(int p0, boolean p1) {}
        private boolean positionNearEdgeOfScrollingView(float p0, boolean p1) { return false; }
        public int getCurrentCursorOffset() { return 0; }
        public float getHorizontal(android.text.Layout p0, int p1) { return 0.0f; }
        protected int getHorizontalGravity(boolean p0) { return 0; }
        protected int getHotspotX(android.graphics.drawable.Drawable p0, boolean p1) { return 0; }
        protected int getMagnifierHandleTrigger() { return 0; }
        protected int getOffsetAtCoordinate(android.text.Layout p0, int p1, float p2) { return 0; }
        protected boolean isAtRtlRun(android.text.Layout p0, int p1) { return false; }
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        protected void positionAtCursorOffset(int p0, boolean p1, boolean p2) {}
        protected void updatePosition(float p0, float p1, boolean p2) {}
        protected void updateSelection(int p0) {}
    }

    public class SelectionModifierCursorController implements android.widget.Editor.CursorController {
        private static final int DRAG_ACCELERATOR_MODE_CHARACTER = 1;
        private static final int DRAG_ACCELERATOR_MODE_INACTIVE = 0;
        private static final int DRAG_ACCELERATOR_MODE_PARAGRAPH = 3;
        private static final int DRAG_ACCELERATOR_MODE_WORD = 2;
        private int mDragAcceleratorMode;
        private android.widget.Editor.SelectionHandleView mEndHandle;
        private boolean mGestureStayedInTapRegion;
        private boolean mHaventMovedEnoughToStartDrag;
        private int mLineSelectionIsOn;
        private int mMaxTouchOffset;
        private int mMinTouchOffset;
        private android.widget.Editor.SelectionHandleView mStartHandle;
        private int mStartOffset;
        private boolean mSwitchedLines;
        SelectionModifierCursorController(android.widget.Editor p0) {}
        private void initHandles() {}
        private void reloadHandleDrawables() {}
        private void resetDragAcceleratorState() {}
        private boolean selectCurrentParagraphAndStartDrag() { return false; }
        private void updateCharacterBasedSelection(android.view.MotionEvent p0) {}
        private void updateMinAndMaxOffsets(android.view.MotionEvent p0) {}
        private void updateParagraphBasedSelection(android.view.MotionEvent p0) {}
        private void updateSelection(android.view.MotionEvent p0) {}
        private void updateSelectionInternal(int p0, int p1, boolean p2) {}
        private void updateWordBasedSelection(android.view.MotionEvent p0) {}
        public void enterDrag(int p0) {}
        public int getMaxTouchOffset() { return 0; }
        public int getMinTouchOffset() { return 0; }
        public void hide() {}
        public void invalidateHandles() {}
        public boolean isActive() { return false; }
        public boolean isCursorBeingModified() { return false; }
        public boolean isDragAcceleratorActive() { return false; }
        public boolean isSelectionStartDragged() { return false; }
        public void onDetached() {}
        public void onTouchEvent(android.view.MotionEvent p0) {}
        public void onTouchModeChanged(boolean p0) {}
        public void resetTouchOffsets() {}
        public void show() {}
    }

    private class SpanController implements android.text.SpanWatcher {
        private static final int DISPLAY_TIMEOUT_MS = 3000;
        private java.lang.Runnable mHidePopup;
        private android.widget.Editor.EasyEditPopupWindow mPopupWindow;
        private SpanController(android.widget.Editor p0) {}
        private boolean isNonIntermediateSelectionSpan(android.text.Spannable p0, java.lang.Object p1) { return false; }
        private void sendEasySpanNotification(int p0, android.text.style.EasyEditSpan p1) {}
        public void hide() {}
        public void onSpanAdded(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
        public void onSpanChanged(android.text.Spannable p0, java.lang.Object p1, int p2, int p3, int p4, int p5) {}
        public void onSpanRemoved(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
    }

    private class SuggestionHelper {
        private final java.util.HashMap<android.text.style.SuggestionSpan, java.lang.Integer> mSpansLengths = null;
        private final java.util.Comparator<android.text.style.SuggestionSpan> mSuggestionSpanComparator = null;
        private SuggestionHelper(android.widget.Editor p0) {}
        private android.text.style.SuggestionSpan[] getSortedSuggestionSpans() { return null; }
        public int getSuggestionInfo(android.widget.Editor.SuggestionInfo[] p0, android.widget.Editor.SuggestionSpanInfo p1) { return 0; }

        private class SuggestionSpanComparator implements java.util.Comparator<android.text.style.SuggestionSpan> {
            private SuggestionSpanComparator(android.widget.Editor.SuggestionHelper p0) {}
            private int compareFlag(int p0, int p1, int p2) { return 0; }
            public int compare(android.text.style.SuggestionSpan p0, android.text.style.SuggestionSpan p1) { return 0; }
        }
    }

    private static final class SuggestionInfo {
        int mSuggestionEnd;
        int mSuggestionIndex;
        final android.widget.Editor.SuggestionSpanInfo mSuggestionSpanInfo = null;
        int mSuggestionStart;
        final android.text.SpannableStringBuilder mText = null;
        private SuggestionInfo() {}
        void clear() {}
        void setSpanInfo(android.text.style.SuggestionSpan p0, int p1, int p2) {}
    }

    private static final class SuggestionSpanInfo {
        int mSpanEnd;
        int mSpanStart;
        android.text.style.SuggestionSpan mSuggestionSpan;
        private SuggestionSpanInfo() {}
        void clear() {}
    }

    private final class SuggestionsPopupWindow extends android.widget.Editor.PinnedPopupWindow implements android.widget.AdapterView.OnItemClickListener {
        private static final int MAX_NUMBER_SUGGESTIONS = 5;
        private static final java.lang.String USER_DICTIONARY_EXTRA_LOCALE = "locale";
        private static final java.lang.String USER_DICTIONARY_EXTRA_WORD = "word";
        private android.widget.TextView mAddToDictionaryButton;
        private int mContainerMarginTop;
        private int mContainerMarginWidth;
        private android.widget.LinearLayout mContainerView;
        private android.content.Context mContext;
        private boolean mCursorWasVisibleBeforeSuggestions;
        private android.widget.TextView mDeleteButton;
        private android.text.style.TextAppearanceSpan mHighlightSpan;
        private boolean mIsShowingUp;
        private final android.widget.Editor.SuggestionSpanInfo mMisspelledSpanInfo = null;
        private int mNumberOfSuggestions;
        private android.widget.Editor.SuggestionInfo[] mSuggestionInfos;
        private android.widget.ListView mSuggestionListView;
        private android.widget.Editor.SuggestionsPopupWindow.SuggestionAdapter mSuggestionsAdapter;
        public SuggestionsPopupWindow(android.widget.Editor p0) { super(null); }
        private android.content.Context applyDefaultTheme(android.content.Context p0) { return null; }
        private void hideWithCleanUp() {}
        private void highlightTextDifferences(android.widget.Editor.SuggestionInfo p0, int p1, int p2) {}
        private boolean updateSuggestions() { return false; }
        protected int clipVertically(int p0) { return 0; }
        protected void createPopupWindow() {}
        protected int getTextOffset() { return 0; }
        protected int getVerticalLocalPosition(int p0) { return 0; }
        protected void initContentView() {}
        public boolean isShowingUp() { return false; }
        protected void measureContent() {}
        public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
        public void onParentLostFocus() {}
        protected void setUp() {}
        public void show() {}

        private class CustomPopupWindow extends android.widget.PopupWindow {
            private CustomPopupWindow(android.widget.Editor.SuggestionsPopupWindow p0) { super(); }
            public void dismiss() {}
        }

        private class SuggestionAdapter extends android.widget.BaseAdapter {
            private android.view.LayoutInflater mInflater;
            private SuggestionAdapter(android.widget.Editor.SuggestionsPopupWindow p0) { super(); }
            public int getCount() { return 0; }
            public java.lang.Object getItem(int p0) { return null; }
            public long getItemId(int p0) { return 0L; }
            public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        }
    }

    static @interface TextActionMode {
        public static final int INSERTION = 1;
        public static final int SELECTION = 0;
        public static final int TEXT_LINK = 2;
    }

    private class TextActionModeCallback extends android.view.ActionMode.Callback2 {
        private final int mHandleHeight = 0;
        private final boolean mHasSelection = false;
        private final android.widget.Editor.AssistantCallbackHelper mHelper = null;
        private final android.graphics.RectF mSelectionBounds = null;
        private final android.graphics.Path mSelectionPath = null;
        TextActionModeCallback(android.widget.Editor p0, int p1) { super(); }
        private android.view.ActionMode.Callback getCustomCallback() { return null; }
        private void populateMenuWithItems(android.view.Menu p0) {}
        private void updateReplaceItem(android.view.Menu p0) {}
        private void updateSelectAllItem(android.view.Menu p0) {}
        public boolean onActionItemClicked(android.view.ActionMode p0, android.view.MenuItem p1) { return false; }
        public boolean onCreateActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
        public void onDestroyActionMode(android.view.ActionMode p0) {}
        public void onGetContentRect(android.view.ActionMode p0, android.view.View p1, android.graphics.Rect p2) {}
        public boolean onPrepareActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
    }

    private static class TextRenderNode {
        boolean isDirty;
        boolean needsToBeShifted;
        android.graphics.RenderNode renderNode;
        public TextRenderNode(java.lang.String p0) {}
        boolean needsRecord() { return false; }
    }

    private static interface TextViewPositionListener {
        public void updatePosition(int p0, int p1, boolean p2, boolean p3);
    }

    public static class UndoInputFilter implements android.text.InputFilter {
        private static final int MERGE_EDIT_MODE_FORCE_MERGE = 0;
        private static final int MERGE_EDIT_MODE_NEVER_MERGE = 1;
        private static final int MERGE_EDIT_MODE_NORMAL = 2;
        private final android.widget.Editor mEditor = null;
        private boolean mExpanding;
        private boolean mHasComposition;
        private boolean mIsUserEdit;
        private boolean mPreviousOperationWasInSameBatchEdit;
        public UndoInputFilter(android.widget.Editor p0) {}
        private boolean canUndoEdit(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5) { return false; }
        private android.widget.Editor.EditOperation getLastEdit() { return null; }
        private void handleEdit(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5, boolean p6) {}
        private static boolean isComposition(java.lang.CharSequence p0) { return false; }
        private boolean isInTextWatcher() { return false; }
        private void recordEdit(android.widget.Editor.EditOperation p0, int p1) {}
        public void beginBatchEdit() {}
        public void endBatchEdit() {}
        public java.lang.CharSequence filter(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5) { return null; }
        void freezeLastEdit() {}
        public void restoreInstanceState(android.os.Parcel p0) {}
        public void saveInstanceState(android.os.Parcel p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        private static @interface MergeMode {
        }
    }
}
