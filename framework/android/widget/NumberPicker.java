package android.widget;

public class NumberPicker extends android.widget.LinearLayout {
    private static final int DEFAULT_LAYOUT_RESOURCE_ID = 17367280;
    private static final long DEFAULT_LONG_PRESS_UPDATE_INTERVAL = 300L;
    private static final char[] DIGIT_CHARACTERS = null;
    private static final int SELECTOR_ADJUSTMENT_DURATION_MILLIS = 800;
    private static final int SELECTOR_MAX_FLING_VELOCITY_ADJUSTMENT = 8;
    private static final int SELECTOR_MIDDLE_ITEM_INDEX = 1;
    private static final int SELECTOR_WHEEL_ITEM_COUNT = 3;
    private static final int SIZE_UNSPECIFIED = -1;
    private static final int SNAP_SCROLL_DURATION = 300;
    private static final float TOP_AND_BOTTOM_FADING_EDGE_STRENGTH = 0.8999999761581421f;
    private static final int UNSCALED_DEFAULT_SELECTION_DIVIDERS_DISTANCE = 48;
    private static final int UNSCALED_DEFAULT_SELECTION_DIVIDER_HEIGHT = 2;
    private static final android.widget.NumberPicker.TwoDigitFormatter sTwoDigitFormatter = null;
    private android.widget.NumberPicker.AccessibilityNodeProviderImpl mAccessibilityNodeProvider;
    private final android.widget.Scroller mAdjustScroller = null;
    private android.widget.NumberPicker.BeginSoftInputOnLongPressCommand mBeginSoftInputOnLongPressCommand;
    private int mBottomSelectionDividerBottom;
    private android.widget.NumberPicker.ChangeCurrentByOneFromLongPressCommand mChangeCurrentByOneFromLongPressCommand;
    private final boolean mComputeMaxWidth = false;
    private int mCurrentScrollOffset;
    private final android.widget.ImageButton mDecrementButton = null;
    private boolean mDecrementVirtualButtonPressed;
    private java.lang.String[] mDisplayedValues;
    private final android.widget.Scroller mFlingScroller = null;
    private android.widget.NumberPicker.Formatter mFormatter;
    private final boolean mHasSelectorWheel = false;
    private boolean mHideWheelUntilFocused;
    private boolean mIgnoreMoveEvents;
    private final android.widget.ImageButton mIncrementButton = null;
    private boolean mIncrementVirtualButtonPressed;
    private int mInitialScrollOffset;
    private final android.widget.EditText mInputText = null;
    private long mLastDownEventTime;
    private float mLastDownEventY;
    private float mLastDownOrMoveEventY;
    private int mLastHandledDownDpadKeyCode;
    private int mLastHoveredChildVirtualViewId;
    private long mLongPressUpdateInterval;
    private final int mMaxHeight = 0;
    private int mMaxValue;
    private int mMaxWidth;
    private int mMaximumFlingVelocity;
    private final int mMinHeight = 0;
    private int mMinValue;
    private final int mMinWidth = 0;
    private final int mMinimumFlingVelocity = 0;
    private android.widget.NumberPicker.OnScrollListener mOnScrollListener;
    private android.widget.NumberPicker.OnValueChangeListener mOnValueChangeListener;
    private boolean mPerformClickOnTap;
    private final android.widget.NumberPicker.PressedStateHelper mPressedStateHelper = null;
    private int mPreviousScrollerY;
    private int mScrollState;
    private final android.graphics.drawable.Drawable mSelectionDivider = null;
    private int mSelectionDividerHeight;
    private final int mSelectionDividersDistance = 0;
    private int mSelectorElementHeight;
    private final android.util.SparseArray<java.lang.String> mSelectorIndexToStringCache = null;
    private final int[] mSelectorIndices = null;
    private int mSelectorTextGapHeight;
    private final android.graphics.Paint mSelectorWheelPaint = null;
    private android.widget.NumberPicker.SetSelectionCommand mSetSelectionCommand;
    private final int mSolidColor = 0;
    private final int mTapTimeoutMillis = 0;
    private final int mTextSize = 0;
    private int mTopSelectionDividerTop;
    private final int mTouchSlop = 0;
    private int mValue;
    private android.view.VelocityTracker mVelocityTracker;
    private final android.graphics.drawable.Drawable mVirtualButtonPressedDrawable = null;
    private boolean mWrapSelectorWheel;
    private boolean mWrapSelectorWheelPreferred;
    public NumberPicker(android.content.Context p0) { super((android.content.Context)null); }
    public NumberPicker(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NumberPicker(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NumberPicker(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void changeValueByOne(boolean p0) {}
    private void decrementSelectorIndices(int[] p0) {}
    private void ensureCachedScrollSelectorValue(int p0) {}
    private boolean ensureScrollWheelAdjusted() { return false; }
    private void fling(int p0) {}
    private java.lang.String formatNumber(int p0) { return null; }
    private static java.lang.String formatNumberWithLocale(int p0) { return null; }
    private int getSelectedPos(java.lang.String p0) { return 0; }
    public static final android.widget.NumberPicker.Formatter getTwoDigitFormatter() { return null; }
    private int getWrappedSelectorIndex(int p0) { return 0; }
    private void hideSoftInput() {}
    private void incrementSelectorIndices(int[] p0) {}
    private void initializeFadingEdges() {}
    private void initializeSelectorWheel() {}
    private void initializeSelectorWheelIndices() {}
    private int makeMeasureSpec(int p0, int p1) { return 0; }
    private boolean moveToFinalScrollerPosition(android.widget.Scroller p0) { return false; }
    private void notifyChange(int p0, int p1) {}
    private void onScrollStateChange(int p0) {}
    private void onScrollerFinished(android.widget.Scroller p0) {}
    private void postBeginSoftInputOnLongPressCommand() {}
    private void postChangeCurrentByOneFromLongPress(boolean p0, long p1) {}
    private void postSetSelectionCommand(int p0, int p1) {}
    private void removeAllCallbacks() {}
    private void removeBeginSoftInputCommand() {}
    private void removeChangeCurrentByOneFromLongPress() {}
    private int resolveSizeAndStateRespectingMinSize(int p0, int p1, int p2) { return 0; }
    private void setValueInternal(int p0, boolean p1) {}
    private void showSoftInput() {}
    private void tryComputeMaxWidth() {}
    private boolean updateInputTextView() { return false; }
    private void updateWrapSelectorWheel() {}
    private void validateInputTextView(android.view.View p0) {}
    public void computeScroll() {}
    protected int computeVerticalScrollExtent() { return 0; }
    protected int computeVerticalScrollOffset() { return 0; }
    protected int computeVerticalScrollRange() { return 0; }
    protected boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    protected void drawableStateChanged() {}
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() { return null; }
    protected float getBottomFadingEdgeStrength() { return 0.0f; }
    public java.lang.CharSequence getDisplayedValueForCurrentSelection() { return null; }
    public java.lang.String[] getDisplayedValues() { return null; }
    public int getMaxValue() { return 0; }
    public int getMinValue() { return 0; }
    public int getSelectionDividerHeight() { return 0; }
    public int getSolidColor() { return 0; }
    public int getTextColor() { return 0; }
    public float getTextSize() { return 0.0f; }
    protected float getTopFadingEdgeStrength() { return 0.0f; }
    public int getValue() { return 0; }
    public boolean getWrapSelectorWheel() { return false; }
    public void jumpDrawablesToCurrentState() {}
    protected void onDetachedFromWindow() {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public void onResolveDrawables(int p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean performClick() { return false; }
    public boolean performLongClick() { return false; }
    public void scrollBy(int p0, int p1) {}
    public void setDisplayedValues(java.lang.String[] p0) {}
    public void setEnabled(boolean p0) {}
    public void setFormatter(android.widget.NumberPicker.Formatter p0) {}
    public void setMaxValue(int p0) {}
    public void setMinValue(int p0) {}
    public void setOnLongPressUpdateInterval(long p0) {}
    public void setOnScrollListener(android.widget.NumberPicker.OnScrollListener p0) {}
    public void setOnValueChangedListener(android.widget.NumberPicker.OnValueChangeListener p0) {}
    public void setSelectionDividerHeight(int p0) {}
    public void setTextColor(int p0) {}
    public void setTextSize(float p0) {}
    public void setValue(int p0) {}
    public void setWrapSelectorWheel(boolean p0) {}

    class AccessibilityNodeProviderImpl extends android.view.accessibility.AccessibilityNodeProvider {
        private static final int UNDEFINED = -2147483648;
        private static final int VIRTUAL_VIEW_ID_DECREMENT = 3;
        private static final int VIRTUAL_VIEW_ID_INCREMENT = 1;
        private static final int VIRTUAL_VIEW_ID_INPUT = 2;
        private int mAccessibilityFocusedView;
        private final int[] mTempArray = null;
        private final android.graphics.Rect mTempRect = null;
        AccessibilityNodeProviderImpl(android.widget.NumberPicker p0) { super(); }
        private android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfoForNumberPicker(int p0, int p1, int p2, int p3) { return null; }
        private android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfoForVirtualButton(int p0, java.lang.String p1, int p2, int p3, int p4, int p5) { return null; }
        private android.view.accessibility.AccessibilityNodeInfo createAccessibiltyNodeInfoForInputText(int p0, int p1, int p2, int p3) { return null; }
        private void findAccessibilityNodeInfosByTextInChild(java.lang.String p0, int p1, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p2) {}
        private java.lang.String getVirtualDecrementButtonText() { return null; }
        private java.lang.String getVirtualIncrementButtonText() { return null; }
        private boolean hasVirtualDecrementButton() { return false; }
        private boolean hasVirtualIncrementButton() { return false; }
        private void sendAccessibilityEventForVirtualButton(int p0, int p1, java.lang.String p2) {}
        private void sendAccessibilityEventForVirtualText(int p0) {}
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int p0) { return null; }
        public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String p0, int p1) { return null; }
        public boolean performAction(int p0, int p1, android.os.Bundle p2) { return false; }
        public void sendAccessibilityEventForVirtualView(int p0, int p1) {}
    }

    class BeginSoftInputOnLongPressCommand implements java.lang.Runnable {
        BeginSoftInputOnLongPressCommand(android.widget.NumberPicker p0) {}
        public void run() {}
    }

    class ChangeCurrentByOneFromLongPressCommand implements java.lang.Runnable {
        private boolean mIncrement;
        ChangeCurrentByOneFromLongPressCommand(android.widget.NumberPicker p0) {}
        private void setStep(boolean p0) {}
        public void run() {}
    }

    public static class CustomEditText extends android.widget.EditText {
        public CustomEditText(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public void onEditorAction(int p0) {}
    }

    public static interface Formatter {
        public java.lang.String format(int p0);
    }

    class InputTextFilter extends android.text.method.NumberKeyListener {
        InputTextFilter(android.widget.NumberPicker p0) { super(); }
        public java.lang.CharSequence filter(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5) { return null; }
        protected char[] getAcceptedChars() { return null; }
        public int getInputType() { return 0; }
    }

    public static interface OnScrollListener {
        public static final int SCROLL_STATE_FLING = 2;
        public static final int SCROLL_STATE_IDLE = 0;
        public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
        public void onScrollStateChange(android.widget.NumberPicker p0, int p1);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ScrollState {
        }
    }

    public static interface OnValueChangeListener {
        public void onValueChange(android.widget.NumberPicker p0, int p1, int p2);
    }

    class PressedStateHelper implements java.lang.Runnable {
        public static final int BUTTON_DECREMENT = 2;
        public static final int BUTTON_INCREMENT = 1;
        private final int MODE_PRESS = 0;
        private final int MODE_TAPPED = 0;
        private int mManagedButton;
        private int mMode;
        PressedStateHelper(android.widget.NumberPicker p0) {}
        public void buttonPressDelayed(int p0) {}
        public void buttonTapped(int p0) {}
        public void cancel() {}
        public void run() {}
    }

    private static class SetSelectionCommand implements java.lang.Runnable {
        private final android.widget.EditText mInputText = null;
        private boolean mPosted;
        private int mSelectionEnd;
        private int mSelectionStart;
        public SetSelectionCommand(android.widget.EditText p0) {}
        public void cancel() {}
        public void post(int p0, int p1) {}
        public void run() {}
    }

    private static class TwoDigitFormatter implements android.widget.NumberPicker.Formatter {
        final java.lang.Object[] mArgs = null;
        final java.lang.StringBuilder mBuilder = null;
        java.util.Formatter mFmt;
        char mZeroDigit;
        TwoDigitFormatter() {}
        private java.util.Formatter createFormatter(java.util.Locale p0) { return null; }
        private static char getZeroDigit(java.util.Locale p0) { return 0; }
        private void init(java.util.Locale p0) {}
        public java.lang.String format(int p0) { return null; }
    }
}
