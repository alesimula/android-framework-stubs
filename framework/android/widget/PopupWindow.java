package android.widget;

public class PopupWindow {
    private static final int[] ABOVE_ANCHOR_STATE_SET = null;
    private static final int ANIMATION_STYLE_DEFAULT = -1;
    private static final int DEFAULT_ANCHORED_GRAVITY = 8388659;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    private boolean mAboveAnchor;
    private android.graphics.drawable.Drawable mAboveAnchorBackgroundDrawable;
    private boolean mAllowScrollingAnchorParent;
    private java.lang.ref.WeakReference<android.view.View> mAnchor;
    private java.lang.ref.WeakReference<android.view.View> mAnchorRoot;
    private int mAnchorXoff;
    private int mAnchorYoff;
    private int mAnchoredGravity;
    private int mAnimationStyle;
    private boolean mAttachedInDecor;
    private boolean mAttachedInDecorSet;
    private android.window.OnBackInvokedCallback mBackCallback;
    private android.graphics.drawable.Drawable mBackground;
    private android.view.View mBackgroundView;
    private android.graphics.drawable.Drawable mBelowAnchorBackgroundDrawable;
    private boolean mClipToScreen;
    private boolean mClippingEnabled;
    private android.view.View mContentView;
    private android.content.Context mContext;
    private android.widget.PopupWindow.PopupDecorView mDecorView;
    private float mElevation;
    private android.transition.Transition mEnterTransition;
    private android.graphics.Rect mEpicenterBounds;
    private android.transition.Transition mExitTransition;
    private boolean mFocusable;
    private int mGravity;
    private int mHeight;
    private int mHeightMode;
    private boolean mIgnoreCheekPress;
    private int mInputMethodMode;
    private boolean mIsAnchorRootAttached;
    private boolean mIsDropdown;
    private boolean mIsShowing;
    private boolean mIsTransitioningToDismiss;
    private int mLastHeight;
    private int mLastWidth;
    private boolean mLayoutInScreen;
    private boolean mLayoutInsetDecor;
    private boolean mNotTouchModal;
    private final android.view.View.OnAttachStateChangeListener mOnAnchorDetachedListener = null;
    private final android.view.View.OnAttachStateChangeListener mOnAnchorRootDetachedListener = null;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final android.view.View.OnLayoutChangeListener mOnLayoutChangeListener = null;
    private final android.view.ViewTreeObserver.OnScrollChangedListener mOnScrollChangedListener = null;
    private boolean mOutsideTouchable;
    private boolean mOverlapAnchor;
    private java.lang.ref.WeakReference<android.view.View> mParentRootView;
    private boolean mPopupViewInitialLayoutDirectionInherited;
    private int mSoftInputMode;
    private int mSplitTouchEnabled;
    private final android.graphics.Rect mTempRect = null;
    private final int[] mTmpAppLocation = null;
    private final int[] mTmpDrawingLocation = null;
    private final int[] mTmpScreenLocation = null;
    private android.view.View.OnTouchListener mTouchInterceptor;
    private boolean mTouchable;
    private int mWidth;
    private int mWidthMode;
    private int mWindowLayoutType;
    private android.view.WindowManager mWindowManager;
    public PopupWindow() {}
    public PopupWindow(int p0, int p1) {}
    public PopupWindow(android.content.Context p0) {}
    public PopupWindow(android.content.Context p0, android.util.AttributeSet p1) {}
    public PopupWindow(android.content.Context p0, android.util.AttributeSet p1, int p2) {}
    public PopupWindow(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) {}
    public PopupWindow(android.view.View p0) {}
    public PopupWindow(android.view.View p0, int p1, int p2) {}
    public PopupWindow(android.view.View p0, int p1, int p2, boolean p3) {}
    private void alignToAnchor() {}
    private int computeAnimationResource() { return 0; }
    private int computeFlags(int p0) { return 0; }
    private int computeGravity() { return 0; }
    private android.widget.PopupWindow.PopupBackgroundView createBackgroundView(android.view.View p0) { return null; }
    private android.widget.PopupWindow.PopupDecorView createDecorView(android.view.View p0) { return null; }
    private void dismissImmediate(android.view.View p0, android.view.ViewGroup p1, android.view.View p2) {}
    private android.view.View getAppRootView(android.view.View p0) { return null; }
    private android.transition.Transition getTransition(int p0) { return null; }
    private void invokePopup(android.view.WindowManager.LayoutParams p0) {}
    private boolean positionInDisplayHorizontal(android.view.WindowManager.LayoutParams p0, int p1, int p2, int p3, int p4, int p5, boolean p6) { return false; }
    private boolean positionInDisplayVertical(android.view.WindowManager.LayoutParams p0, int p1, int p2, int p3, int p4, int p5, boolean p6) { return false; }
    private void preparePopup(android.view.WindowManager.LayoutParams p0) {}
    private void setLayoutDirectionFromAnchor() {}
    private boolean tryFitHorizontal(android.view.WindowManager.LayoutParams p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, boolean p8) { return false; }
    private boolean tryFitVertical(android.view.WindowManager.LayoutParams p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, boolean p8) { return false; }
    private void unregisterBackCallback(android.window.OnBackInvokedDispatcher p0) {}
    private void update(android.view.View p0, boolean p1, int p2, int p3, int p4, int p5) {}
    protected void attachToAnchor(android.view.View p0, int p1, int p2, int p3) {}
    protected final android.view.WindowManager.LayoutParams createPopupLayoutParams(android.os.IBinder p0) { return null; }
    protected void detachFromAnchor() {}
    public void dismiss() {}
    protected boolean findDropDownPosition(android.view.View p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, boolean p7) { return false; }
    protected final boolean getAllowScrollingAnchorParent() { return false; }
    protected android.view.View getAnchor() { return null; }
    public int getAnimationStyle() { return 0; }
    public android.graphics.drawable.Drawable getBackground() { return null; }
    public android.view.View getContentView() { return null; }
    protected android.view.WindowManager.LayoutParams getDecorViewLayoutParams() { return null; }
    public float getElevation() { return 0.0f; }
    public android.transition.Transition getEnterTransition() { return null; }
    public android.graphics.Rect getEpicenterBounds() { return null; }
    public android.transition.Transition getExitTransition() { return null; }
    public int getHeight() { return 0; }
    public int getInputMethodMode() { return 0; }
    public int getMaxAvailableHeight(android.view.View p0) { return 0; }
    public int getMaxAvailableHeight(android.view.View p0, int p1) { return 0; }
    public int getMaxAvailableHeight(android.view.View p0, int p1, boolean p2) { return 0; }
    protected final android.widget.PopupWindow.OnDismissListener getOnDismissListener() { return null; }
    public boolean getOverlapAnchor() { return false; }
    public int getSoftInputMode() { return 0; }
    protected final android.graphics.Rect getTransitionEpicenter() { return null; }
    public int getWidth() { return 0; }
    public int getWindowLayoutType() { return 0; }
    protected boolean hasContentView() { return false; }
    protected boolean hasDecorView() { return false; }
    public boolean isAboveAnchor() { return false; }
    public boolean isAttachedInDecor() { return false; }
    @java.lang.Deprecated
    public boolean isClipToScreenEnabled() { return false; }
    public boolean isClippedToScreen() { return false; }
    public boolean isClippingEnabled() { return false; }
    public boolean isFocusable() { return false; }
    public boolean isLaidOutInScreen() { return false; }
    @java.lang.Deprecated
    public boolean isLayoutInScreenEnabled() { return false; }
    protected final boolean isLayoutInsetDecor() { return false; }
    public boolean isOutsideTouchable() { return false; }
    public boolean isShowing() { return false; }
    public boolean isSplitTouchEnabled() { return false; }
    public boolean isTouchModal() { return false; }
    public boolean isTouchable() { return false; }
    protected final boolean isTransitioningToDismiss() { return false; }
    void setAllowScrollingAnchorParent(boolean p0) {}
    public void setAnimationStyle(int p0) {}
    public void setAttachedInDecor(boolean p0) {}
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    @java.lang.Deprecated
    public void setClipToScreenEnabled(boolean p0) {}
    public void setClippingEnabled(boolean p0) {}
    public void setContentView(android.view.View p0) {}
    protected final void setDropDown(boolean p0) {}
    public void setElevation(float p0) {}
    public void setEnterTransition(android.transition.Transition p0) {}
    public void setEpicenterBounds(android.graphics.Rect p0) {}
    public void setExitTransition(android.transition.Transition p0) {}
    public void setFocusable(boolean p0) {}
    public void setHeight(int p0) {}
    public void setIgnoreCheekPress() {}
    public void setInputMethodMode(int p0) {}
    public void setIsClippedToScreen(boolean p0) {}
    public void setIsLaidOutInScreen(boolean p0) {}
    @java.lang.Deprecated
    public void setLayoutInScreenEnabled(boolean p0) {}
    public void setLayoutInsetDecor(boolean p0) {}
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener p0) {}
    public void setOutsideTouchable(boolean p0) {}
    public void setOverlapAnchor(boolean p0) {}
    protected final void setShowing(boolean p0) {}
    public void setSoftInputMode(int p0) {}
    public void setSplitTouchEnabled(boolean p0) {}
    public void setTouchInterceptor(android.view.View.OnTouchListener p0) {}
    public void setTouchModal(boolean p0) {}
    public void setTouchable(boolean p0) {}
    protected final void setTransitioningToDismiss(boolean p0) {}
    public void setWidth(int p0) {}
    @java.lang.Deprecated
    public void setWindowLayoutMode(int p0, int p1) {}
    public void setWindowLayoutType(int p0) {}
    public void showAsDropDown(android.view.View p0) {}
    public void showAsDropDown(android.view.View p0, int p1, int p2) {}
    public void showAsDropDown(android.view.View p0, int p1, int p2, int p3) {}
    public void showAtLocation(android.os.IBinder p0, int p1, int p2, int p3) {}
    public void showAtLocation(android.view.View p0, int p1, int p2, int p3) {}
    public void update() {}
    public void update(int p0, int p1) {}
    public void update(int p0, int p1, int p2, int p3) {}
    public void update(int p0, int p1, int p2, int p3, boolean p4) {}
    public void update(android.view.View p0, int p1, int p2) {}
    public void update(android.view.View p0, int p1, int p2, int p3, int p4) {}
    protected void update(android.view.View p0, android.view.WindowManager.LayoutParams p1) {}
    protected final void updateAboveAnchor(boolean p0) {}

    public static interface OnDismissListener {
        public void onDismiss();
    }

    private class PopupBackgroundView extends android.widget.FrameLayout {
        public PopupBackgroundView(android.widget.PopupWindow p0, android.content.Context p1) { super((android.content.Context)null); }
        protected int[] onCreateDrawableState(int p0) { return null; }
    }

    private class PopupDecorView extends android.widget.FrameLayout {
        private java.lang.Runnable mCleanupAfterExit;
        private final android.view.View.OnAttachStateChangeListener mOnAnchorRootDetachedListener = null;
        public PopupDecorView(android.widget.PopupWindow p0, android.content.Context p1) { super((android.content.Context)null); }
        private void startEnterTransition(android.transition.Transition p0) {}
        public void cancelTransitions() {}
        public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
        public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
        protected void onAttachedToWindow() {}
        protected void onDetachedFromWindow() {}
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        public void requestEnterTransition(android.transition.Transition p0) {}
        public void requestKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> p0, int p1) {}
        public void startExitTransition(android.transition.Transition p0, android.view.View p1, android.graphics.Rect p2, android.transition.Transition.TransitionListener p3) {}
    }
}
