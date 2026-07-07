package android.inputmethodservice;

@java.lang.Deprecated
public class KeyboardView extends android.view.View implements android.view.View.OnClickListener {
    private static final int DEBOUNCE_TIME = 70;
    private static final boolean DEBUG = false;
    private static final int DELAY_AFTER_PREVIEW = 70;
    private static final int DELAY_BEFORE_PREVIEW = 0;
    private static final int[] KEY_DELETE = null;
    private static final int[] LONG_PRESSABLE_STATE_SET = null;
    private static int MAX_NEARBY_KEYS;
    private static final int MSG_LONGPRESS = 4;
    private static final int MSG_REMOVE_PREVIEW = 2;
    private static final int MSG_REPEAT = 3;
    private static final int MSG_SHOW_PREVIEW = 1;
    private static final int MULTITAP_INTERVAL = 800;
    private static final int NOT_A_KEY = -1;
    private static final int REPEAT_INTERVAL = 50;
    private static final int REPEAT_START_DELAY = 400;
    private boolean mAbortKey;
    private android.view.accessibility.AccessibilityManager mAccessibilityManager;
    private android.media.AudioManager mAudioManager;
    private float mBackgroundDimAmount;
    private android.graphics.Bitmap mBuffer;
    private android.graphics.Canvas mCanvas;
    private android.graphics.Rect mClipRegion;
    private final int[] mCoordinates = null;
    private int mCurrentKey;
    private int mCurrentKeyIndex;
    private long mCurrentKeyTime;
    private android.graphics.Rect mDirtyRect;
    private boolean mDisambiguateSwipe;
    private int[] mDistances;
    private int mDownKey;
    private long mDownTime;
    private boolean mDrawPending;
    private android.view.GestureDetector mGestureDetector;
    android.os.Handler mHandler;
    private boolean mHeadsetRequiredToHearPasswordsAnnounced;
    private boolean mInMultiTap;
    private android.inputmethodservice.Keyboard.Key mInvalidatedKey;
    private android.graphics.drawable.Drawable mKeyBackground;
    private int[] mKeyIndices;
    private int mKeyTextColor;
    private int mKeyTextSize;
    private android.inputmethodservice.Keyboard mKeyboard;
    private android.inputmethodservice.KeyboardView.OnKeyboardActionListener mKeyboardActionListener;
    private boolean mKeyboardChanged;
    private android.inputmethodservice.Keyboard.Key[] mKeys;
    private int mLabelTextSize;
    private int mLastCodeX;
    private int mLastCodeY;
    private int mLastKey;
    private long mLastKeyTime;
    private long mLastMoveTime;
    private int mLastSentIndex;
    private long mLastTapTime;
    private int mLastX;
    private int mLastY;
    private android.inputmethodservice.KeyboardView mMiniKeyboard;
    private java.util.Map<android.inputmethodservice.Keyboard.Key, android.view.View> mMiniKeyboardCache;
    private android.view.View mMiniKeyboardContainer;
    private int mMiniKeyboardOffsetX;
    private int mMiniKeyboardOffsetY;
    private boolean mMiniKeyboardOnScreen;
    private int mOldPointerCount;
    private float mOldPointerX;
    private float mOldPointerY;
    private android.graphics.Rect mPadding;
    private android.graphics.Paint mPaint;
    private android.widget.PopupWindow mPopupKeyboard;
    private int mPopupLayout;
    private android.view.View mPopupParent;
    private int mPopupPreviewX;
    private int mPopupPreviewY;
    private int mPopupX;
    private int mPopupY;
    private boolean mPossiblePoly;
    private boolean mPreviewCentered;
    private int mPreviewHeight;
    private java.lang.StringBuilder mPreviewLabel;
    private int mPreviewOffset;
    private android.widget.PopupWindow mPreviewPopup;
    private android.widget.TextView mPreviewText;
    private int mPreviewTextSizeLarge;
    private boolean mProximityCorrectOn;
    private int mProximityThreshold;
    private int mRepeatKeyIndex;
    private int mShadowColor;
    private float mShadowRadius;
    private boolean mShowPreview;
    private boolean mShowTouchPoints;
    private int mStartX;
    private int mStartY;
    private int mSwipeThreshold;
    private android.inputmethodservice.KeyboardView.SwipeTracker mSwipeTracker;
    private int mTapCount;
    private int mVerticalCorrection;
    public KeyboardView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public KeyboardView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public KeyboardView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private java.lang.CharSequence adjustCase(java.lang.CharSequence p0) { return null; }
    private void checkMultiTap(long p0, int p1) {}
    private void computeProximityThreshold(android.inputmethodservice.Keyboard p0) {}
    private void detectAndSendKey(int p0, int p1, int p2, long p3) {}
    private void dismissPopupKeyboard() {}
    private int getKeyIndices(int p0, int p1, int[] p2) { return 0; }
    private java.lang.CharSequence getPreviewText(android.inputmethodservice.Keyboard.Key p0) { return null; }
    private void initGestureDetector() {}
    private void onBufferDraw() {}
    private boolean onModifiedTouchEvent(android.view.MotionEvent p0, boolean p1) { return false; }
    private boolean openPopupIfRequired(android.view.MotionEvent p0) { return false; }
    private void removeMessages() {}
    private boolean repeatKey() { return false; }
    private void resetMultiTap() {}
    private void sendAccessibilityEventForUnicodeCharacter(int p0, int p1) {}
    private void showKey(int p0) {}
    private void showPreview(int p0) {}
    public void closing() {}
    public android.inputmethodservice.Keyboard getKeyboard() { return null; }
    protected android.inputmethodservice.KeyboardView.OnKeyboardActionListener getOnKeyboardActionListener() { return null; }
    public boolean handleBack() { return false; }
    public void invalidateAllKeys() {}
    public void invalidateKey(int p0) {}
    public boolean isPreviewEnabled() { return false; }
    public boolean isProximityCorrectionEnabled() { return false; }
    public boolean isShifted() { return false; }
    protected void onAttachedToWindow() {}
    public void onClick(android.view.View p0) {}
    public void onDetachedFromWindow() {}
    public void onDraw(android.graphics.Canvas p0) {}
    public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    protected boolean onLongPress(android.inputmethodservice.Keyboard.Key p0) { return false; }
    public void onMeasure(int p0, int p1) {}
    public void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void setKeyboard(android.inputmethodservice.Keyboard p0) {}
    public void setOnKeyboardActionListener(android.inputmethodservice.KeyboardView.OnKeyboardActionListener p0) {}
    public void setPopupOffset(int p0, int p1) {}
    public void setPopupParent(android.view.View p0) {}
    public void setPreviewEnabled(boolean p0) {}
    public void setProximityCorrectionEnabled(boolean p0) {}
    public boolean setShifted(boolean p0) { return false; }
    public void setVerticalCorrection(int p0) {}
    protected void swipeDown() {}
    protected void swipeLeft() {}
    protected void swipeRight() {}
    protected void swipeUp() {}

    public static interface OnKeyboardActionListener {
        public void onKey(int p0, int[] p1);
        public void onPress(int p0);
        public void onRelease(int p0);
        public void onText(java.lang.CharSequence p0);
        public void swipeDown();
        public void swipeLeft();
        public void swipeRight();
        public void swipeUp();
    }

    private static class SwipeTracker {
        static final int LONGEST_PAST_TIME = 200;
        static final int NUM_PAST = 4;
        final long[] mPastTime = null;
        final float[] mPastX = null;
        final float[] mPastY = null;
        float mXVelocity;
        float mYVelocity;
        private SwipeTracker() {}
        private void addPoint(float p0, float p1, long p2) {}
        public void addMovement(android.view.MotionEvent p0) {}
        public void clear() {}
        public void computeCurrentVelocity(int p0) {}
        public void computeCurrentVelocity(int p0, float p1) {}
        public float getXVelocity() { return 0.0f; }
        public float getYVelocity() { return 0.0f; }
    }
}
