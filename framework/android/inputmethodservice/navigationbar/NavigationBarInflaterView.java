package android.inputmethodservice.navigationbar;

public final class NavigationBarInflaterView extends android.widget.FrameLayout {
    private static final java.lang.String ABSOLUTE_SUFFIX = "A";
    private static final java.lang.String ABSOLUTE_VERTICAL_CENTERED_SUFFIX = "C";
    public static final java.lang.String BACK = "back";
    public static final java.lang.String BUTTON_SEPARATOR = ",";
    public static final java.lang.String CLIPBOARD = "clipboard";
    private static final java.lang.String CONFIG_NAV_BAR_LAYOUT_HANDLE = "back[70AC];home_handle;ime_switcher[70AC]";
    public static final java.lang.String CONTEXTUAL = "contextual";
    public static final java.lang.String GRAVITY_SEPARATOR = ";";
    public static final java.lang.String HOME = "home";
    public static final java.lang.String HOME_HANDLE = "home_handle";
    public static final java.lang.String IME_SWITCHER = "ime_switcher";
    public static final java.lang.String KEY = "key";
    public static final java.lang.String KEY_CODE_END = ")";
    public static final java.lang.String KEY_CODE_START = "(";
    public static final java.lang.String KEY_IMAGE_DELIM = ":";
    public static final java.lang.String LEFT = "left";
    public static final java.lang.String MENU_IME_ROTATE = "menu_ime";
    public static final java.lang.String NAVSPACE = "space";
    public static final java.lang.String NAV_BAR_LEFT = "sysui_nav_bar_left";
    public static final java.lang.String NAV_BAR_RIGHT = "sysui_nav_bar_right";
    public static final java.lang.String NAV_BAR_VIEWS = "sysui_nav_bar";
    public static final java.lang.String RECENT = "recent";
    public static final java.lang.String RIGHT = "right";
    public static final java.lang.String SIZE_MOD_END = "]";
    public static final java.lang.String SIZE_MOD_START = "[";
    private static final java.lang.String TAG = "NavBarInflater";
    private static final java.lang.String WEIGHT_CENTERED_SUFFIX = "WC";
    private static final java.lang.String WEIGHT_SUFFIX = "W";
    private boolean mAlternativeOrder;
    android.util.SparseArray<android.inputmethodservice.navigationbar.ButtonDispatcher> mButtonDispatchers;
    protected android.widget.FrameLayout mHorizontal;
    protected android.view.LayoutInflater mLandscapeInflater;
    private android.view.View mLastLandscape;
    private android.view.View mLastPortrait;
    protected android.view.LayoutInflater mLayoutInflater;
    public NavigationBarInflaterView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void addAll(android.inputmethodservice.navigationbar.ButtonDispatcher p0, android.view.ViewGroup p1) {}
    private void addGravitySpacer(android.widget.LinearLayout p0) {}
    private void addToDispatchers(android.view.View p0) {}
    private android.view.View applySize(android.view.View p0, java.lang.String p1, boolean p2, boolean p3) { return null; }
    private void clearAllChildren(android.view.ViewGroup p0) {}
    private void clearViews() {}
    private static float convertDpToPx(android.content.Context p0, float p1) { return 0.0f; }
    private android.view.ViewGroup.LayoutParams copy(android.view.ViewGroup.LayoutParams p0) { return null; }
    private static java.lang.String extractButton(java.lang.String p0) { return null; }
    private static java.lang.String extractSize(java.lang.String p0) { return null; }
    private void inflateButtons(java.lang.String[] p0, android.view.ViewGroup p1, boolean p2, boolean p3) {}
    private void inflateChildren() {}
    private void initiallyFill(android.inputmethodservice.navigationbar.ButtonDispatcher p0) {}
    private void updateAlternativeOrder() {}
    private void updateAlternativeOrder(android.view.View p0) {}
    void createInflaters() {}
    android.view.View createView(java.lang.String p0, android.view.ViewGroup p1, android.view.LayoutInflater p2) { return null; }
    java.lang.String getDefaultLayout() { return null; }
    protected android.view.View inflateButton(java.lang.String p0, android.view.ViewGroup p1, boolean p2, boolean p3) { return null; }
    protected void inflateLayout(java.lang.String p0) {}
    protected void onFinishInflate() {}
    void setAlternativeOrder(boolean p0) {}
    void setButtonDispatchers(android.util.SparseArray<android.inputmethodservice.navigationbar.ButtonDispatcher> p0) {}
    void updateButtonDispatchersCurrentView() {}
}
