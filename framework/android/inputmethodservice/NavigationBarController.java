package android.inputmethodservice;

public final class NavigationBarController implements android.view.Window.DecorCallback, android.inputmethodservice.navigationbar.NavigationBarView.ButtonClickListener {
    private static final int DEFAULT_COLOR_ADAPT_TRANSITION_TIME = 1700;
    private static final android.view.animation.Interpolator LEGACY_DECELERATE = null;
    private int mAppearance;
    private boolean mCustomImeSwitcherButtonRequestedVisible;
    private float mDarkIntensity;
    private final android.inputmethodservice.NavigationBarController.Delegate mDelegate = null;
    private boolean mDestroyed;
    private boolean mDrawLegacyNavigationBarBackground;
    private boolean mImeDrawsImeNavBar;
    private boolean mImeSwitcherButtonEnabled;
    private android.graphics.Insets mLastInsets;
    private android.inputmethodservice.navigationbar.NavigationBarFrame mNavigationBarFrame;
    private boolean mShowImeSwitcherButton;
    private final int[] mTempPos = null;
    private final android.graphics.Rect mTempRect = null;
    private android.animation.ValueAnimator mTintAnimator;
    public NavigationBarController(android.inputmethodservice.NavigationBarController.Delegate p0) {}
    private static float calculateTargetDarkIntensity(int p0, boolean p1) { return 0.0f; }
    private int getImeCaptionBarHeight(boolean p0) { return 0; }
    private android.graphics.Insets getSystemInsets() { return null; }
    private void installNavigationBarFrameIfNecessary() {}
    private void notifyCustomImeSwitcherButtonRequestedVisible() {}
    private void scheduleRelayout() {}
    private void setIconTintInternal(float p0) {}
    private boolean showImeSwitcherButtonInNavBar() { return false; }
    private void uninstallNavigationBarFrameIfNecessary() {}
    boolean isShown() { return false; }
    void onDestroy() {}
    public boolean onDrawLegacyNavigationBarBackgroundChanged(boolean p0) { return false; }
    public void onImeSwitchButtonClick(android.view.View p0) {}
    public boolean onImeSwitchButtonLongClick(android.view.View p0) { return false; }
    public void onNavButtonFlagsChanged(int p0) {}
    public void onSystemBarAppearanceChanged(int p0) {}
    void onViewInitialized() {}
    void onWindowCreated(android.view.Window p0) {}
    void onWindowShown() {}
    public void setNavigationBarFrameForTesting(android.inputmethodservice.navigationbar.NavigationBarFrame p0) {}
    java.lang.String toDebugString() { return null; }
    void updateInsets(android.inputmethodservice.InputMethodService.Insets p0) {}
    void updateTouchableInsets(android.inputmethodservice.InputMethodService.Insets p0, android.view.ViewTreeObserver.InternalInsetsInfo p1) {}

    public static interface Delegate {
        public android.content.Context getContext();
        public android.view.View getInputFrame();
        public android.content.res.Resources getResources();
        public android.view.Window getWindow();
        public boolean isExtractViewShown();
        public boolean isFullscreenMode();
        public void onCustomImeSwitcherButtonRequestedVisible(boolean p0);
        public void onImeSwitchButtonClickFromClient();
    }
}
