package android.view;

public class ViewConfiguration {
    private static final int A11Y_SHORTCUT_KEY_TIMEOUT = 3000;
    private static final int A11Y_SHORTCUT_KEY_TIMEOUT_AFTER_CONFIRMATION = 1000;
    private static final long ACTION_MODE_HIDE_DURATION_DEFAULT = 2000L;
    private static final float AMBIGUOUS_GESTURE_MULTIPLIER = 2.0f;
    private static final int DEFAULT_KEY_REPEAT_DELAY_MS = 50;
    private static final int DEFAULT_KEY_REPEAT_TIMEOUT_MS = 400;
    public static final int DEFAULT_LONG_PRESS_TIMEOUT = 400;
    private static final int DEFAULT_MULTI_PRESS_TIMEOUT = 300;
    public static final int DEFAULT_TEXT_CURSOR_BLINK_INTERVAL_MS = 500;
    private static final int DOUBLE_TAP_MIN_TIME = 40;
    private static final int DOUBLE_TAP_SLOP = 100;
    private static final int DOUBLE_TAP_TIMEOUT = 300;
    private static final int DOUBLE_TAP_TOUCH_SLOP = 8;
    private static final int EDGE_SLOP = 12;
    private static final int FADING_EDGE_LENGTH = 12;
    private static final long FLING_ACCUMULATION_TIMEOUT_MS = 200L;
    private static final long FLING_ACCUMULATION_TIME_MS = 50L;
    private static final float FLING_DECELERATION_FACTOR = 1.7999999523162842f;
    private static final float FLING_DECELERATION_VELOCITY_THRESHOLD_DP = 600.0f;
    private static final float FLING_FINAL_APPROACH_DECELERATION_DP = 50.0f;
    private static final float FLING_MAX_VELOCITY_ACCUMULATED_DP = 5000.0f;
    private static final float FLING_VELOCITY_ACCUMULATION_THRESHOLD_DP = 7500.0f;
    private static final int GLOBAL_ACTIONS_KEY_TIMEOUT = 500;
    private static final int HANDWRITING_GESTURE_LINE_MARGIN = 16;
    private static final int HANDWRITING_SLOP = 2;
    private static final int HAS_PERMANENT_MENU_KEY_AUTODETECT = 0;
    private static final int HAS_PERMANENT_MENU_KEY_FALSE = 2;
    private static final int HAS_PERMANENT_MENU_KEY_TRUE = 1;
    private static final float HORIZONTAL_SCROLL_FACTOR = 64.0f;
    private static final int HOVER_TAP_SLOP = 20;
    private static final int HOVER_TOOLTIP_HIDE_SHORT_TIMEOUT = 3000;
    private static final int HOVER_TOOLTIP_HIDE_TIMEOUT = 15000;
    private static final int HOVER_TOOLTIP_SHOW_TIMEOUT = 500;
    private static final int JUMP_TAP_TIMEOUT = 500;
    private static final int LONG_PRESS_TOOLTIP_HIDE_TIMEOUT = 1500;
    @java.lang.Deprecated
    private static final int MAXIMUM_DRAWING_CACHE_SIZE = 1536000;
    private static final int MAXIMUM_FLING_VELOCITY = 8000;
    private static final int MINIMUM_FLING_VELOCITY = 50;
    private static final int MIN_SCROLLBAR_TOUCH_TARGET = 48;
    public static final int MIN_TEXT_CURSOR_BLINK_INTERVAL_MS = 333;
    public static final int NO_BLINK_TEXT_CURSOR_BLINK_INTERVAL_MS = 0;
    private static final int NO_FLING_MAX_VELOCITY = -2147483648;
    private static final int NO_FLING_MIN_VELOCITY = 2147483647;
    public static final int NO_HAPTIC_SCROLL_TICK_INTERVAL = 2147483647;
    private static final int OVERFLING_DISTANCE = 6;
    private static final int OVERSCROLL_DISTANCE = 0;
    private static final int PAGING_TOUCH_SLOP = 16;
    private static final int PRESSED_STATE_DURATION = 64;
    private static final int SCREENSHOT_CHORD_KEY_TIMEOUT = 0;
    private static final int SCROLL_BAR_DEFAULT_DELAY = 300;
    private static final int SCROLL_BAR_FADE_DURATION = 250;
    private static final int SCROLL_BAR_SIZE = 4;
    private static final float SCROLL_FRICTION = 0.014999999664723873f;
    private static final long SEND_RECURRING_ACCESSIBILITY_EVENTS_INTERVAL_MILLIS = 100L;
    private static final int SMART_SELECTION_INITIALIZED_TIMEOUT_IN_MILLISECOND = 200;
    private static final int SMART_SELECTION_INITIALIZING_TIMEOUT_IN_MILLISECOND = 500;
    private static final int TAP_TIMEOUT = 100;
    private static final int TOUCH_SLOP = 8;
    private static final float VERTICAL_SCROLL_FACTOR = 64.0f;
    private static final int WINDOW_TOUCH_SLOP = 16;
    private static final int ZOOM_CONTROLS_TIMEOUT = 3000;
    static final android.util.LongSparseArray<android.view.ViewConfiguration> sConfigurations = null;
    private static android.view.ViewConfiguration.ResourceCache sResourceCache;
    private final float mAmbiguousGestureMultiplier = 0.0f;
    private final boolean mConstructedWithContext = false;
    private int mDeviceId;
    private final int mDoubleTapMinTimeMillis = 0;
    private final int mDoubleTapSlop = 0;
    private final int mDoubleTapTimeoutMillis = 0;
    private final int mDoubleTapTouchSlop = 0;
    private final int mEdgeSlop = 0;
    private final int mFadingEdgeLength = 0;
    private final boolean mFadingMarqueeEnabled = false;
    private final long mFlingAccumulationTimeMillis = 0L;
    private final long mFlingAccumulationTimeoutMillis = 0L;
    private final float mFlingLaminarDeceleration = 0.0f;
    private final long mGlobalActionsKeyTimeout = 0L;
    private final int mHandwritingGestureLineMargin = 0;
    private final int mHandwritingSlop = 0;
    private final float mHorizontalScrollFactor = 0.0f;
    private final int mHoverSlop = 0;
    private final int mMaximumDrawingCacheSize = 0;
    private final int mMaximumFlingVelocity = 0;
    private final int mMaximumRotaryEncoderFlingVelocity = 0;
    private final int mMinScalingSpan = 0;
    private final int mMinScrollbarTouchTarget = 0;
    private final int mMinimumFlingVelocity = 0;
    private final int mMinimumRotaryEncoderFlingVelocity = 0;
    private final int mOverflingDistance = 0;
    private final int mOverscrollDistance = 0;
    private final int mPagingTouchSlop = 0;
    private final boolean mPreferKeepClearForFocusEnabled = false;
    private final boolean mRotaryEncoderHapticScrollFeedbackEnabled = false;
    private final int mRotaryEncoderHapticScrollFeedbackTickIntervalPixels = 0;
    private final boolean mRotaryNavigationEnabled = false;
    private final int mRotaryNavigationThresholdPixels = 0;
    private final float mScaledFlingAccumulationThreshold = 0.0f;
    private final float mScaledFlingDecelerationThreshold = 0.0f;
    private final float mScaledFlingFinalApproachDeceleration = 0.0f;
    private final float mScaledFlingMaximumAccumulatedVelocity = 0.0f;
    private final long mScreenshotChordKeyTimeout = 0L;
    private final float mScrollFriction = 0.0f;
    private final int mScrollbarSize = 0;
    private final boolean mShowMenuShortcutsWhenKeyboardPresent = false;
    private final int mSmartSelectionInitializedTimeout = 0;
    private final int mSmartSelectionInitializingTimeout = 0;
    private final int mTapTimeoutMillis = 0;
    private final int mTouchSlop = 0;
    private final float mVerticalScrollFactor = 0.0f;
    private final boolean mViewBasedRotaryEncoderScrollHapticsEnabledConfig = false;
    private final boolean mViewTouchScreenHapticScrollFeedbackEnabled = false;
    private final int mWindowTouchSlop = 0;
    private boolean sHasPermanentMenuKey;
    private boolean sHasPermanentMenuKeySet;
    @java.lang.Deprecated
    public ViewConfiguration() {}
    private ViewConfiguration(android.content.Context p0) {}
    private static long createKey(android.content.Context p0) { return 0L; }
    public static android.view.ViewConfiguration get(android.content.Context p0) { return null; }
    @java.lang.Deprecated
    public static float getAmbiguousGestureMultiplier() { return 0.0f; }
    public static long getDefaultActionModeHideDuration() { return 0L; }
    private static int getDisplayDensity(android.content.Context p0) { return 0; }
    public static int getDoubleTapMinTime() { return 0; }
    @java.lang.Deprecated
    public static int getDoubleTapSlop() { return 0; }
    public static int getDoubleTapTimeout() { return 0; }
    @java.lang.Deprecated
    public static int getEdgeSlop() { return 0; }
    @java.lang.Deprecated
    public static int getFadingEdgeLength() { return 0; }
    @java.lang.Deprecated
    public static long getGlobalActionKeyTimeout() { return 0L; }
    public static int getHoverTapSlop() { return 0; }
    public static int getHoverTooltipHideShortTimeout() { return 0; }
    public static int getHoverTooltipHideTimeout() { return 0; }
    public static int getHoverTooltipShowTimeout() { return 0; }
    public static int getJumpTapTimeout() { return 0; }
    public static int getKeyRepeatDelay() { return 0; }
    public static int getKeyRepeatTimeout() { return 0; }
    public static int getLongPressTimeout() { return 0; }
    public static int getLongPressTooltipHideTimeout() { return 0; }
    @java.lang.Deprecated
    public static int getMaximumDrawingCacheSize() { return 0; }
    @java.lang.Deprecated
    public static int getMaximumFlingVelocity() { return 0; }
    @java.lang.Deprecated
    public static int getMinimumFlingVelocity() { return 0; }
    public static int getMultiPressTimeout() { return 0; }
    public static int getPressedStateDuration() { return 0; }
    public static int getScrollBarFadeDuration() { return 0; }
    @java.lang.Deprecated
    public static int getScrollBarSize() { return 0; }
    public static int getScrollDefaultDelay() { return 0; }
    public static float getScrollFriction() { return 0.0f; }
    public static long getSendRecurringAccessibilityEventsInterval() { return 0L; }
    private int getSettingValue(java.lang.String p0, int p1) { return 0; }
    public static int getTapTimeout() { return 0; }
    @java.lang.Deprecated
    public static int getTouchSlop() { return 0; }
    @java.lang.Deprecated
    public static int getWindowTouchSlop() { return 0; }
    public static long getZoomControlsTimeout() { return 0L; }
    private static boolean isInputDeviceInfoValid(int p0, int p1, int p2) { return false; }
    public static void resetCacheForTesting() {}
    public static void setInstanceForTesting(android.content.Context p0, android.view.ViewConfiguration p1) {}
    public long getAccessibilityShortcutKeyTimeout() { return 0L; }
    public long getAccessibilityShortcutKeyTimeoutAfterConfirmation() { return 0L; }
    public long getDeviceGlobalActionKeyTimeout() { return 0L; }
    public int getDoubleTapMinTimeMillis() { return 0; }
    public int getDoubleTapTimeoutMillis() { return 0; }
    public long getFlingAccumulationTimeMillis() { return 0L; }
    public long getFlingAccumulationTimeoutMillis() { return 0L; }
    public float getFlingLaminarDeceleration() { return 0.0f; }
    public int getFocusTraversalThreshold(int p0, int p1, int p2) { return 0; }
    public int getHapticScrollFeedbackTickInterval(int p0, int p1, int p2) { return 0; }
    public int getLongPressTimeoutMillis() { return 0; }
    public int getMultiPressTimeoutMillis() { return 0; }
    public float getScaledAmbiguousGestureMultiplier() { return 0.0f; }
    public int getScaledDoubleTapSlop() { return 0; }
    public int getScaledDoubleTapTouchSlop() { return 0; }
    public int getScaledEdgeSlop() { return 0; }
    public int getScaledFadingEdgeLength() { return 0; }
    public float getScaledFlingAccumulationThreshold() { return 0.0f; }
    public float getScaledFlingDecelerationThreshold() { return 0.0f; }
    public float getScaledFlingFinalApproachDeceleration() { return 0.0f; }
    public float getScaledFlingMaximumAccumulatedVelocity() { return 0.0f; }
    public int getScaledHandwritingGestureLineMargin() { return 0; }
    public int getScaledHandwritingSlop() { return 0; }
    public float getScaledHorizontalScrollFactor() { return 0.0f; }
    public int getScaledHoverSlop() { return 0; }
    public int getScaledMaximumDrawingCacheSize() { return 0; }
    public int getScaledMaximumFlingVelocity() { return 0; }
    public int getScaledMaximumFlingVelocity(int p0, int p1, int p2) { return 0; }
    public int getScaledMinScrollbarTouchTarget() { return 0; }
    public int getScaledMinimumFlingVelocity() { return 0; }
    public int getScaledMinimumFlingVelocity(int p0, int p1, int p2) { return 0; }
    public int getScaledMinimumScalingSpan() { return 0; }
    public int getScaledOverflingDistance() { return 0; }
    public int getScaledOverscrollDistance() { return 0; }
    public int getScaledPagingTouchSlop() { return 0; }
    public int getScaledScrollBarSize() { return 0; }
    public int getScaledScrollFactor() { return 0; }
    public int getScaledTouchSlop() { return 0; }
    public float getScaledVerticalScrollFactor() { return 0.0f; }
    public int getScaledWindowTouchSlop() { return 0; }
    public long getScreenshotChordKeyTimeout() { return 0L; }
    public float getScrollFrictionAmount() { return 0.0f; }
    public int getSmartSelectionInitializedTimeout() { return 0; }
    public int getSmartSelectionInitializingTimeout() { return 0; }
    public int getTapTimeoutMillis() { return 0; }
    public int getTextCursorBlinkIntervalMillis() { return 0; }
    public boolean hasPermanentMenuKey() { return false; }
    public boolean isFadingMarqueeEnabled() { return false; }
    public boolean isFocusNavigationEnabled(int p0, int p1, int p2) { return false; }
    public boolean isHapticScrollFeedbackEnabled(int p0, int p1, int p2) { return false; }
    public boolean isPreferKeepClearForFocusEnabled() { return false; }
    public boolean isViewBasedRotaryEncoderHapticScrollFeedbackEnabled() { return false; }
    public boolean shouldShowMenuShortcutsWhenKeyboardPresent() { return false; }

    private static final class ResourceCache {
        private long mDefaultActionModeHideDuration;
        private int mDefaultTextCursorBlinkInterval;
        private int mDoubleTapMinTime;
        private int mDoubleTapTimeout;
        private int mHoverTapSlop;
        private int mJumpTapTimeout;
        private int mMinTextCursorBlinkInterval;
        private int mNoBlinkTextCursorBlinkInterval;
        private int mPressedStateDuration;
        private float mScrollFriction;
        private int mTapTimeout;
        private long mZoomControlsTimeout;
        private ResourceCache() {}
        private static android.content.res.Resources getCurrentResources() { return null; }
        public long getDefaultActionModeHideDuration() { return 0L; }
        public int getDefaultTextCursorBlinkInterval() { return 0; }
        public int getDoubleTapMinTime() { return 0; }
        public int getDoubleTapTimeout() { return 0; }
        public int getHoverTapSlop() { return 0; }
        public int getJumpTapTimeout() { return 0; }
        public int getMinTextCursorBlinkInterval() { return 0; }
        public int getNoBlinkTextCursorBlinkInterval() { return 0; }
        public int getPressedStateDuration() { return 0; }
        public float getScrollFriction() { return 0.0f; }
        public int getTapTimeout() { return 0; }
        public long getZoomControlsTimeout() { return 0L; }
    }
}
