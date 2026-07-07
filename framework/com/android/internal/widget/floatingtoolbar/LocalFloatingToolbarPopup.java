package com.android.internal.widget.floatingtoolbar;

public final class LocalFloatingToolbarPopup implements com.android.internal.widget.floatingtoolbar.FloatingToolbarPopup {
    private static final int MAX_OVERFLOW_SIZE = 4;
    private static final int MIN_OVERFLOW_SIZE = 2;
    private final android.graphics.drawable.Drawable mArrow = null;
    private final android.view.animation.AnimationSet mCloseOverflowAnimation = null;
    private final android.view.ViewGroup mContentContainer = null;
    private final android.content.Context mContext = null;
    private final android.graphics.Point mCoordsOnWindow = null;
    private final android.animation.AnimatorSet mDismissAnimation = null;
    private final android.view.animation.Interpolator mFastOutLinearInInterpolator = null;
    private final android.view.animation.Interpolator mFastOutSlowInInterpolator = null;
    private final android.animation.AnimatorSet mHideAnimation = null;
    private final int mIconTextSpacing = 0;
    private final android.view.ViewTreeObserver.OnComputeInternalInsetsListener mInsetsComputer = null;
    private boolean mIsOverflowOpen;
    private final int mLineHeight = 0;
    private final android.view.animation.Interpolator mLinearOutSlowInInterpolator = null;
    private final android.view.animation.Interpolator mLogAccelerateInterpolator = null;
    private final android.view.ViewGroup mMainPanel = null;
    private android.util.Size mMainPanelSize;
    private final int mMarginHorizontal = 0;
    private final int mMarginVertical = 0;
    private final android.view.View.OnClickListener mMenuItemButtonOnClickListener = null;
    private final java.util.Map<com.android.internal.widget.floatingtoolbar.LocalFloatingToolbarPopup.MenuItemRepr, android.view.MenuItem> mMenuItems = null;
    private android.view.MenuItem.OnMenuItemClickListener mOnMenuItemClickListener;
    private final android.view.animation.AnimationSet mOpenOverflowAnimation = null;
    private boolean mOpenOverflowUpwards;
    private final android.graphics.drawable.Drawable mOverflow = null;
    private final android.view.animation.Animation.AnimationListener mOverflowAnimationListener = null;
    private final android.widget.ImageButton mOverflowButton = null;
    private final android.util.Size mOverflowButtonSize = null;
    private final com.android.internal.widget.floatingtoolbar.LocalFloatingToolbarPopup.OverflowPanel mOverflowPanel = null;
    private android.util.Size mOverflowPanelSize;
    private final com.android.internal.widget.floatingtoolbar.LocalFloatingToolbarPopup.OverflowPanelViewHelper mOverflowPanelViewHelper = null;
    private final android.view.View mParent = null;
    private final android.widget.PopupWindow mPopupWindow = null;
    private final java.lang.Runnable mPreparePopupContentRTLHelper = null;
    private final android.graphics.Rect mPreviousContentRect = null;
    private final android.animation.AnimatorSet mShowAnimation = null;
    private int mState;
    private int mSuggestedWidth;
    private final int[] mTmpCoords = null;
    private final android.graphics.drawable.AnimatedVectorDrawable mToArrow = null;
    private final android.graphics.drawable.AnimatedVectorDrawable mToOverflow = null;
    private final android.graphics.Region mTouchableRegion = null;
    private int mTransitionDurationScale;
    private final android.graphics.Rect mViewPortOnScreen = null;
    private boolean mWidthChanged;
    public LocalFloatingToolbarPopup(android.content.Context p0, android.view.View p1) {}
    private static android.content.Context applyDefaultTheme(android.content.Context p0) { return null; }
    private int calculateOverflowHeight(int p0) { return 0; }
    private void cancelDismissAndHideAnimations() {}
    private void cancelOverflowAnimations() {}
    private void clearPanels() {}
    private void closeOverflow() {}
    private static android.view.ViewGroup createContentContainer(android.content.Context p0) { return null; }
    private static android.animation.AnimatorSet createEnterAnimation(android.view.View p0) { return null; }
    private static android.animation.AnimatorSet createExitAnimation(android.view.View p0, int p1, android.animation.Animator.AnimatorListener p2) { return null; }
    private android.view.ViewGroup createMainPanel() { return null; }
    private static android.view.View createMenuItemButton(android.content.Context p0, android.view.MenuItem p1, int p2, boolean p3) { return null; }
    private android.view.animation.Animation.AnimationListener createOverflowAnimationListener() { return null; }
    private android.widget.ImageButton createOverflowButton() { return null; }
    private com.android.internal.widget.floatingtoolbar.LocalFloatingToolbarPopup.OverflowPanel createOverflowPanel() { return null; }
    private static android.widget.PopupWindow createPopupWindow(android.view.ViewGroup p0) { return null; }
    private int getAdjustedDuration(int p0) { return 0; }
    private int getAdjustedToolbarWidth(int p0) { return 0; }
    private int getOverflowWidth() { return 0; }
    private boolean hasOverflow() { return false; }
    private boolean isInRTLMode() { return false; }
    private boolean isLayoutRequired(java.util.List<android.view.MenuItem> p0) { return false; }
    private boolean isOverflowAnimating() { return false; }
    private void layoutMenuItems(java.util.List<android.view.MenuItem> p0, android.view.MenuItem.OnMenuItemClickListener p1, int p2) {}
    private void layoutOverflowPanelItems(java.util.List<android.view.MenuItem> p0) {}
    private void maybeComputeTransitionDurationScale() {}
    private static android.util.Size measure(android.view.View p0) { return null; }
    private void openOverflow() {}
    private void positionContentYCoordinatesIfOpeningOverflowUpwards() {}
    private void preparePopupContent() {}
    private void refreshCoordinatesAndOverflowDirection(android.graphics.Rect p0) {}
    private void refreshViewPort() {}
    private void runDismissAnimation() {}
    private void runHideAnimation() {}
    private void runShowAnimation() {}
    private void setButtonTagAndClickListener(android.view.View p0, android.view.MenuItem p1) {}
    private void setContentAreaAsTouchableSurface() {}
    private static void setHeight(android.view.View p0, int p1) {}
    private void setPanelsStatesAtRestingPosition() {}
    private static void setSize(android.view.View p0, int p1, int p2) {}
    private static void setSize(android.view.View p0, android.util.Size p1) {}
    private void setTouchableSurfaceInsetsComputer() {}
    private static void setWidth(android.view.View p0, int p1) {}
    private void setZeroTouchableSurface() {}
    private void show(android.graphics.Rect p0) {}
    private void updateCoordinates(android.graphics.Rect p0) {}
    private static void updateMenuItemButton(android.view.View p0, android.view.MenuItem p1, int p2, boolean p3) {}
    private void updateMenuItems(java.util.List<android.view.MenuItem> p0, android.view.MenuItem.OnMenuItemClickListener p1) {}
    private void updateOverflowHeight(int p0) {}
    private void updatePopupSize() {}
    public void dismiss() {}
    public void hide() {}
    public boolean isHidden() { return false; }
    public boolean isShowing() { return false; }
    public java.util.List<android.view.MenuItem> layoutMainPanelItems(java.util.List<android.view.MenuItem> p0, int p1) { return null; }
    public boolean setOutsideTouchable(boolean p0, android.widget.PopupWindow.OnDismissListener p1) { return false; }
    public void setSuggestedWidth(int p0) {}
    public void setWidthChanged(boolean p0) {}
    public void show(java.util.List<android.view.MenuItem> p0, android.view.MenuItem.OnMenuItemClickListener p1, android.graphics.Rect p2) {}

    private static final class LogAccelerateInterpolator implements android.view.animation.Interpolator {
        private static final int BASE = 100;
        private static final float LOGS_SCALE = Float.valueOf(0.0f);
        private LogAccelerateInterpolator() {}
        private static float computeLog(float p0, int p1) { return 0.0f; }
        public float getInterpolation(float p0) { return 0.0f; }
    }

    public static final class MenuItemRepr {
        public final int groupId = 0;
        public final int itemId = 0;
        private final android.graphics.drawable.Drawable mIcon = null;
        public final java.lang.String title = null;
        private MenuItemRepr(int p0, int p1, java.lang.CharSequence p2, android.graphics.drawable.Drawable p3) {}
        public static com.android.internal.widget.floatingtoolbar.LocalFloatingToolbarPopup.MenuItemRepr of(android.view.MenuItem p0) { return null; }
        public static boolean reprEquals(java.util.Collection<android.view.MenuItem> p0, java.util.Collection<android.view.MenuItem> p1) { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static final class OverflowPanel extends android.widget.ListView {
        private final com.android.internal.widget.floatingtoolbar.LocalFloatingToolbarPopup mPopup = null;
        OverflowPanel(com.android.internal.widget.floatingtoolbar.LocalFloatingToolbarPopup p0) { super((android.content.Context)null); }
        protected boolean awakenScrollBars() { return false; }
        public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
        protected void onMeasure(int p0, int p1) {}
    }

    private static final class OverflowPanelViewHelper {
        private final android.view.View mCalculator = null;
        private final android.content.Context mContext = null;
        private final int mIconTextSpacing = 0;
        private final int mSidePadding = 0;
        OverflowPanelViewHelper(android.content.Context p0, int p1) {}
        private android.view.View createMenuButton(android.view.MenuItem p0) { return null; }
        private boolean shouldShowIcon(android.view.MenuItem p0) { return false; }
        public int calculateWidth(android.view.MenuItem p0) { return 0; }
        public android.view.View getView(android.view.MenuItem p0, int p1, android.view.View p2) { return null; }
    }
}
