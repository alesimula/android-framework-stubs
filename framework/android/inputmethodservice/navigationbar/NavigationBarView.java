package android.inputmethodservice.navigationbar;

public final class NavigationBarView extends android.widget.FrameLayout {
    private static final boolean DEBUG = false;
    private static final android.view.animation.Interpolator FAST_OUT_SLOW_IN = null;
    private static final java.lang.String TAG = "NavBarView";
    private android.inputmethodservice.navigationbar.KeyButtonDrawable mBackIcon;
    private final android.util.SparseArray<android.inputmethodservice.navigationbar.ButtonDispatcher> mButtonDispatchers = null;
    private android.content.res.Configuration mConfiguration;
    private int mCurrentRotation;
    android.view.View mCurrentView;
    private final int mDarkIconColor = 0;
    private android.inputmethodservice.navigationbar.DeadZone mDeadZone;
    private boolean mDeadZoneConsuming;
    int mDisabledFlags;
    private android.view.View mHorizontal;
    private android.inputmethodservice.navigationbar.KeyButtonDrawable mImeSwitcherIcon;
    private android.content.Context mLightContext;
    private final int mLightIconColor = 0;
    private final int mNavBarMode = 0;
    private int mNavbarFlags;
    private android.inputmethodservice.navigationbar.NavigationBarInflaterView mNavigationInflaterView;
    private android.content.res.Configuration mTmpLastConfiguration;
    public NavigationBarView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private android.inputmethodservice.navigationbar.KeyButtonDrawable getBackDrawable() { return null; }
    private android.view.Display getContextDisplay() { return null; }
    private android.inputmethodservice.navigationbar.KeyButtonDrawable getDrawable(int p0) { return null; }
    public static boolean isGesturalMode(int p0) { return false; }
    private void orientBackButton(android.inputmethodservice.navigationbar.KeyButtonDrawable p0) {}
    private void reloadNavIcons() {}
    private void reorient() {}
    private void resetViews() {}
    private boolean shouldDeadZoneConsumeTouchEvents(android.view.MotionEvent p0) { return false; }
    private void updateCurrentView() {}
    private void updateIcons(android.content.res.Configuration p0) {}
    private void updateNavButtonIcons() {}
    private void updateOrientationViews() {}
    public void forEachView(java.util.function.Consumer<android.view.View> p0) {}
    public android.inputmethodservice.navigationbar.ButtonDispatcher getBackButton() { return null; }
    public android.util.SparseArray<android.inputmethodservice.navigationbar.ButtonDispatcher> getButtonDispatchers() { return null; }
    public android.view.View getCurrentView() { return null; }
    public android.inputmethodservice.navigationbar.ButtonDispatcher getHomeHandle() { return null; }
    public android.inputmethodservice.navigationbar.ButtonDispatcher getImeSwitchButton() { return null; }
    protected void onAttachedToWindow() {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    protected void onDetachedFromWindow() {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public void onFinishInflate() {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void prepareNavButtons(android.inputmethodservice.navigationbar.NavigationBarView.ButtonClickListener p0) {}
    public void setDarkIntensity(float p0) {}
    public void setLayoutDirection(int p0) {}
    public void setNavbarFlags(int p0) {}

    public static interface ButtonClickListener {
        public void onImeSwitchButtonClick(android.view.View p0);
        public boolean onImeSwitchButtonLongClick(android.view.View p0);
    }
}
