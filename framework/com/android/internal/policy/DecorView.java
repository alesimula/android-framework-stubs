package com.android.internal.policy;

public class DecorView extends android.widget.FrameLayout implements com.android.internal.view.RootViewSurfaceTaker, android.view.WindowCallbacks {
    private static final boolean DEBUG_MEASURE = false;
    public static final com.android.internal.policy.DecorView.ColorViewAttributes NAVIGATION_BAR_COLOR_VIEW_ATTRIBUTES = null;
    private static final android.view.ViewOutlineProvider PIP_OUTLINE_PROVIDER = null;
    private static final int SCRIM_ALPHA = -872415232;
    private static final int SCRIM_LIGHT = -419430401;
    public static final com.android.internal.policy.DecorView.ColorViewAttributes STATUS_BAR_COLOR_VIEW_ATTRIBUTES = null;
    private static final boolean SWEEP_OPEN_MENU = false;
    private static final java.lang.String TAG = "DecorView";
    private final com.android.internal.policy.ActionModeController mActionModeController = null;
    private com.android.internal.policy.DecorView.AppJankStatsCallback mAppJankStatsCallback;
    private boolean mApplyFloatingHorizontalInsets;
    private boolean mApplyFloatingVerticalInsets;
    private com.android.internal.graphics.drawable.BackgroundBlurDrawable mBackgroundBlurDrawable;
    private final android.view.ViewTreeObserver.OnPreDrawListener mBackgroundBlurOnPreDrawListener = null;
    private int mBackgroundBlurRadius;
    private final com.android.internal.widget.BackgroundFallback mBackgroundFallback = null;
    private android.graphics.Insets mBackgroundInsets;
    private final android.graphics.Rect mBackgroundPadding = null;
    private final int mBarEnterExitDuration = 0;
    private boolean mChanging;
    android.view.ViewGroup mContentRoot;
    private boolean mCrossWindowBlurEnabled;
    private java.util.function.Consumer<java.lang.Boolean> mCrossWindowBlurEnabledListener;
    int mDefaultOpacity;
    private int mDownY;
    private boolean mDrawLegacyNavigationBarBackground;
    private boolean mDrawLegacyNavigationBarBackgroundHandled;
    private final android.graphics.Rect mDrawingBounds = null;
    private final int mFeatureId = 0;
    private final android.graphics.Rect mFloatingInsets = null;
    final boolean mForceWindowDrawsBarBackgrounds = false;
    private final android.graphics.Rect mFrameOffsets = null;
    private final android.graphics.Rect mFramePadding = null;
    private final android.view.animation.Interpolator mHideInterpolator = null;
    private boolean mIsInPictureInPictureMode;
    private com.android.internal.graphics.drawable.BackgroundBlurDrawable mLastBackgroundBlurDrawable;
    private android.graphics.Insets mLastBackgroundInsets;
    private int mLastBottomInset;
    private boolean mLastForceConsumingOpaqueCaptionBar;
    private int mLastForceConsumingTypes;
    private boolean mLastHasBottomStableInset;
    private boolean mLastHasLeftStableInset;
    private boolean mLastHasRightStableInset;
    private boolean mLastHasTopStableInset;
    private android.view.WindowInsets mLastInsets;
    private int mLastLeftInset;
    private android.graphics.drawable.Drawable mLastOriginalBackgroundDrawable;
    private android.view.ViewOutlineProvider mLastOutlineProvider;
    private int mLastRightInset;
    private int mLastSuppressScrimTypes;
    private int mLastTopInset;
    private int mLastWindowFlags;
    private final android.graphics.Paint mLegacyNavigationBarBackgroundPaint = null;
    java.lang.String mLogTag;
    private android.graphics.drawable.Drawable mMenuBackground;
    private final com.android.internal.policy.DecorView.ColorViewState mNavigationColorViewState = null;
    private int mOriginalBackgroundBlurRadius;
    private android.graphics.drawable.Drawable mOriginalBackgroundDrawable;
    private android.view.PendingInsetsController mPendingInsetsController;
    private android.graphics.drawable.Drawable mPendingWindowBackground;
    private int mRootScrollY;
    private final int mSemiTransparentBarColor = 0;
    private final android.view.animation.Interpolator mShowInterpolator = null;
    private final com.android.internal.policy.DecorView.ColorViewState mStatusColorViewState = null;
    private android.graphics.Rect mTempRect;
    private boolean mWatchingForMenu;
    private final com.android.internal.policy.WearGestureInterceptionDetector mWearGestureInterceptionDetector = null;
    private com.android.internal.policy.PhoneWindow mWindow;
    private boolean mWindowResizeCallbacksAdded;
    DecorView(android.content.Context p0, int p1, com.android.internal.policy.PhoneWindow p2, android.view.WindowManager.LayoutParams p3) { super((android.content.Context)null); }
    public static int calculateBarColor(int p0, int p1, int p2, int p3, int p4, int p5, boolean p6, boolean p7) { return 0; }
    private int calculateNavigationBarColor(int p0) { return 0; }
    private int calculateStatusBarColor(int p0) { return 0; }
    private float dipToPx(float p0) { return 0.0f; }
    private void drawLegacyNavigationBarBackground(android.graphics.RecordingCanvas p0) {}
    private void drawableChanged() {}
    private int getCurrentColor(com.android.internal.policy.DecorView.ColorViewState p0) { return 0; }
    public static int getNavBarSize(int p0, int p1, int p2) { return 0; }
    public static void getNavigationBarRect(int p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, float p4) {}
    private static java.lang.String getTitleSuffix(android.view.WindowManager.LayoutParams p0) { return null; }
    private boolean interceptBackProgress(android.view.MotionEvent p0) { return false; }
    private boolean isFillingScreen(android.content.res.Configuration p0) { return false; }
    public static boolean isNavBarToLeftEdge(int p0, int p1) { return false; }
    public static boolean isNavBarToRightEdge(int p0, int p1) { return false; }
    private boolean isOutOfBounds(int p0, int p1) { return false; }
    private boolean isOutOfInnerBounds(int p0, int p1) { return false; }
    private static void setColor(android.view.View p0, int p1, int p2, boolean p3, boolean p4) {}
    private boolean showContextMenuForChildInternal(android.view.View p0, float p1, float p2) { return false; }
    private void updateBackgroundBlurCorners() {}
    private void updateBackgroundBlurRadius() {}
    private void updateBackgroundDrawable() {}
    private void updateColorViewInt(com.android.internal.policy.DecorView.ColorViewState p0, int p1, int p2, int p3, boolean p4, boolean p5, int p6, boolean p7, boolean p8, int p9) {}
    private void updateColorViewTranslations() {}
    void clearContentView() {}
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    public void dispatchPointerCaptureChanged(boolean p0) {}
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public void draw(android.graphics.Canvas p0) {}
    void finishChanging() {}
    public int getAccessibilityViewId() { return 0; }
    public android.graphics.drawable.Drawable getBackground() { return null; }
    public android.graphics.drawable.Drawable getBackgroundFallback() { return null; }
    public android.app.jank.JankTracker getJankTracker() { return null; }
    android.view.View getNavigationBarBackgroundView() { return null; }
    public android.content.res.Resources getResources() { return null; }
    android.view.View getStatusBarBackgroundView() { return null; }
    public android.view.WindowInsetsController getWindowInsetsController() { return null; }
    protected boolean hasPrimaryActionMode() { return false; }
    public boolean isTransitionGroup() { return false; }
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    protected void onAttachedToWindow() {}
    public void onCloseSystemDialogs(java.lang.String p0) {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public boolean onContentDrawn(int p0, int p1, int p2, int p3) { return false; }
    protected void onDetachedFromWindow() {}
    public void onDraw(android.graphics.Canvas p0) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public void onMovedToDisplay(int p0, android.content.res.Configuration p1) {}
    public void onPostDraw(android.graphics.RecordingCanvas p0) {}
    public void onRequestDraw(boolean p0) {}
    void onResourcesLoaded(android.view.LayoutInflater p0, int p1) {}
    public void onRootViewScrollYChanged(int p0) {}
    public void onSystemBarAppearanceChanged(int p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void onWindowDragResizeEnd() {}
    public void onWindowDragResizeStart() {}
    public void onWindowFocusChanged(boolean p0) {}
    public void onWindowSystemUiVisibilityChanged(int p0) {}
    public android.view.PendingInsetsController providePendingInsetsController() { return null; }
    void removeBackgroundBlurDrawable() {}
    public void reportAppJankStats(android.app.jank.AppJankStats p0) {}
    public void requestKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> p0, int p1) {}
    public void sendAccessibilityEvent(int p0) {}
    public void setAppJankStatsCallback(com.android.internal.policy.DecorView.AppJankStatsCallback p0) {}
    void setBackgroundBlurRadius(int p0) {}
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    void setBackgroundFallback(android.graphics.drawable.Drawable p0) {}
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    public void setOutlineProvider(android.view.ViewOutlineProvider p0) {}
    public void setSurfaceFormat(int p0) {}
    public void setSurfaceKeepScreenOn(boolean p0) {}
    public void setSurfaceType(int p0) {}
    void setWindow(com.android.internal.policy.PhoneWindow p0) {}
    public void setWindowBackground(android.graphics.drawable.Drawable p0) {}
    public void setWindowFrame(android.graphics.drawable.Drawable p0) {}
    public boolean showContextMenuForChild(android.view.View p0) { return false; }
    public boolean showContextMenuForChild(android.view.View p0, float p1, float p2) { return false; }
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0) { return null; }
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0, int p1) { return null; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1) { return null; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1, int p2) { return null; }
    void startChanging() {}
    public boolean superDispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean superDispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean superDispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    public boolean superDispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean superDispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public java.lang.String toString() { return null; }
    android.view.WindowInsets updateColorViews(android.view.WindowInsets p0, boolean p1) { return null; }
    void updateLogTag(android.view.WindowManager.LayoutParams p0) {}
    public void updatePictureInPictureOutlineProvider(boolean p0) {}
    public android.view.InputQueue.Callback willYouTakeTheInputQueue() { return null; }
    public android.view.SurfaceHolder.Callback2 willYouTakeTheSurface() { return null; }

    public static interface AppJankStatsCallback {
        public android.app.jank.JankTracker getAppJankTracker();
    }

    public static class ColorViewAttributes {
        final int horizontalGravity = 0;
        final int id = 0;
        final int insetsType = 0;
        final int seascapeGravity = 0;
        final java.lang.String transitionName = null;
        final int translucentFlag = 0;
        final int verticalGravity = 0;
        private ColorViewAttributes(int p0, int p1, int p2, int p3, java.lang.String p4, int p5, int p6) {}
        public boolean isPresent(boolean p0, int p1, boolean p2) { return false; }
        public boolean isVisible(int p0, int p1, int p2, boolean p3) { return false; }
        public boolean isVisible(boolean p0, int p1, int p2, boolean p3) { return false; }
    }

    private static class ColorViewState {
        final com.android.internal.policy.DecorView.ColorViewAttributes attributes = null;
        int color;
        boolean present;
        int targetVisibility;
        android.view.View view;
        boolean visible;
        ColorViewState(com.android.internal.policy.DecorView.ColorViewAttributes p0) {}
    }
}
