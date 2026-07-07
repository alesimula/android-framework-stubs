package android.service.dreams;

public class DreamService extends android.app.Service implements android.view.Window.Callback {
    public static final java.lang.String BUNDLE_KEY_ATTACH_ERROR = "android.service.dream.DreamService.attach_error";
    private static final boolean DEBUG = Boolean.valueOf(false);
    public static final boolean DEFAULT_SHOW_COMPLICATIONS = false;
    public static final boolean DEFAULT_USER_SELECTABLE = true;
    public static final int DREAM_CATEGORY_DEFAULT = 0;
    public static final int DREAM_CATEGORY_HOME_PANEL = 2;
    public static final int DREAM_CATEGORY_LOW_LIGHT = 1;
    public static final java.lang.String DREAM_META_DATA = "android.service.dream";
    private static final java.lang.String DREAM_META_DATA_ROOT_TAG = "dream";
    public static final java.lang.String DREAM_SERVICE = "dreams";
    static final java.lang.String EXTRA_DREAM_OVERLAY_COMPONENT = "android.service.dream.DreamService.dream_overlay_component";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.dreams.DreamService";
    private static final java.lang.String TAG = null;
    private android.app.Activity mActivity;
    private boolean mCanDoze;
    private boolean mDebug;
    private java.lang.Runnable mDispatchAfterOnAttachedToWindow;
    private float mDozeScreenBrightness;
    private int mDozeScreenState;
    private int mDozeScreenStateReason;
    private boolean mDozing;
    private android.service.dreams.utils.DreamAccessibility mDreamAccessibility;
    private android.content.ComponentName mDreamComponent;
    private final android.service.dreams.IDreamManager mDreamManager = null;
    private android.service.dreams.DreamService.DreamServiceWrapper mDreamServiceWrapper;
    private android.os.IBinder mDreamToken;
    private boolean mFinished;
    private boolean mFullscreen;
    private final android.os.Handler mHandler = null;
    private final android.service.dreams.DreamService.Injector mInjector = null;
    private boolean mInteractive;
    private android.service.dreams.IDreamOverlayCallback mOverlayCallback;
    private android.service.dreams.DreamOverlayConnectionHandler mOverlayConnection;
    private boolean mPreviewMode;
    private boolean mRedirectWake;
    private boolean mScreenBright;
    private boolean mShouldShowComplications;
    private boolean mStarted;
    private final java.lang.String mTag = null;
    private java.lang.Integer mTrackingConfirmKey;
    private boolean mUseNormalBrightnessForDoze;
    private boolean mWaking;
    private android.view.Window mWindow;
    private boolean mWindowless;
    public DreamService() { super(); }
    public DreamService(android.service.dreams.DreamService.Injector p0) { super(); }
    private int applyFlags(int p0, int p1, int p2) { return 0; }
    private void applyWindowFlags(int p0, int p1) {}
    private void attach(android.os.IBinder p0, boolean p1, boolean p2, android.os.IRemoteCallback p3) {}
    private static float clampAbsoluteBrightness(float p0) { return 0.0f; }
    private void comeToFront() {}
    private static android.content.ComponentName convertToComponentName(java.lang.String p0, android.content.pm.ServiceInfo p1, android.content.pm.PackageManager p2) { return null; }
    private void detach() {}
    private static java.lang.CharSequence fetchDreamLabel(android.content.pm.PackageManager p0, android.content.res.Resources p1, android.content.pm.ServiceInfo p2, boolean p3) { return null; }
    private static android.content.pm.ServiceInfo fetchServiceInfo(android.content.Context p0, android.content.ComponentName p1) { return null; }
    private static boolean fetchShouldShowComplications(android.content.pm.PackageManager p0, android.content.pm.ServiceInfo p1) { return false; }
    public static android.service.dreams.DreamService.DreamMetadata getDreamMetadata(android.content.Context p0, android.content.pm.ServiceInfo p1) { return null; }
    public static android.service.dreams.DreamService.DreamMetadata getDreamMetadata(android.content.pm.PackageManager p0, android.content.pm.ServiceInfo p1) { return null; }
    private boolean getWindowFlagValue(int p0, boolean p1) { return false; }
    private boolean isCallerSystemUi() { return false; }
    private void onActivityCreated(android.service.dreams.DreamActivity p0, android.os.IBinder p1) {}
    private void onActivityDestroyed() {}
    private void onWindowCreated(android.view.Window p0) {}
    public static void setDreamOverlayComponent(android.content.Intent p0, android.content.ComponentName p1) {}
    private void updateAccessibilityMessage() {}
    private void updateDoze() {}
    private void wakeUp(boolean p0) {}
    public void addContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public boolean canDoze() { return false; }
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    protected void dumpOnHandler(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public <T extends android.view.View> T findViewById(int p0) { return null; }
    public final void finish() {}
    public android.app.Activity getActivity() { return null; }
    public float getDozeScreenBrightness() { return 0.0f; }
    public int getDozeScreenState() { return 0; }
    public boolean getRedirectWake() { return false; }
    public boolean getUseNormalBrightnessForDoze() { return false; }
    public android.view.Window getWindow() { return null; }
    public android.view.WindowManager getWindowManager() { return null; }
    public boolean isDozing() { return false; }
    public boolean isFullscreen() { return false; }
    public boolean isInteractive() { return false; }
    public boolean isScreenBright() { return false; }
    public boolean isWindowless() { return false; }
    public void onActionModeFinished(android.view.ActionMode p0) {}
    public void onActionModeStarted(android.view.ActionMode p0) {}
    public void onAttachedToWindow() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onContentChanged() {}
    public void onCreate() {}
    public boolean onCreatePanelMenu(int p0, android.view.Menu p1) { return false; }
    public android.view.View onCreatePanelView(int p0) { return null; }
    public void onDestroy() {}
    public void onDetachedFromWindow() {}
    public void onDreamingStarted() {}
    public void onDreamingStopped() {}
    public boolean onMenuItemSelected(int p0, android.view.MenuItem p1) { return false; }
    public boolean onMenuOpened(int p0, android.view.Menu p1) { return false; }
    public void onPanelClosed(int p0, android.view.Menu p1) {}
    public boolean onPreparePanel(int p0, android.view.View p1, android.view.Menu p2) { return false; }
    public boolean onSearchRequested() { return false; }
    public boolean onSearchRequested(android.view.SearchEvent p0) { return false; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public void onWakeUp() {}
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams p0) {}
    public void onWindowFocusChanged(boolean p0) {}
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback p0) { return null; }
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback p0, int p1) { return null; }
    public final <T extends android.view.View> T requireViewById(int p0) { return null; }
    public void setContentView(int p0) {}
    public void setContentView(android.view.View p0) {}
    public void setContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void setDebug(boolean p0) {}
    public void setDozeScreenBrightness(float p0) {}
    public void setDozeScreenState(int p0) {}
    public void setDozeScreenState(int p0, int p1, boolean p2) {}
    public void setFullscreen(boolean p0) {}
    public void setInteractive(boolean p0) {}
    public void setScreenBright(boolean p0) {}
    public void setScreenBrightness(float p0) {}
    public void setWindowless(boolean p0) {}
    public void startDozing() {}
    public void stopDozing() {}
    public final void wakeUp() {}

    private static final class DefaultInjector implements android.service.dreams.DreamService.Injector {
        private java.lang.Class<?> mClassName;
        private android.content.Context mContext;
        private DefaultInjector() {}
        public android.service.dreams.DreamOverlayConnectionHandler createOverlayConnection(android.content.ComponentName p0, java.lang.Runnable p1) { return null; }
        public android.content.ComponentName getDreamActivityComponent() { return null; }
        public android.content.ComponentName getDreamComponent() { return null; }
        public android.service.dreams.IDreamManager getDreamManager() { return null; }
        public java.lang.String getDreamPackageName() { return null; }
        public android.os.Handler getHandler() { return null; }
        public android.content.pm.PackageManager getPackageManager() { return null; }
        public android.content.res.Resources getResources() { return null; }
        public android.content.pm.ServiceInfo getServiceInfo() { return null; }
        public void init(android.content.Context p0) {}
    }

    public static final class DreamActivityCallbacks extends android.os.Binder {
        private final android.os.IBinder mActivityDreamToken = null;
        private java.lang.ref.WeakReference<android.service.dreams.DreamService> mService;
        public DreamActivityCallbacks(android.os.IBinder p0, java.lang.ref.WeakReference<android.service.dreams.DreamService> p1) { super(); }
        public void onActivityCreated(android.service.dreams.DreamActivity p0) {}
        public void onActivityDestroyed() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface DreamCategory {
    }

    public static final class DreamMetadata {
        public final int dreamCategory = 0;
        public final android.graphics.drawable.Drawable previewImage = null;
        public final int previewImageResId = 0;
        public final android.content.ComponentName settingsActivity = null;
        public final boolean showComplications = false;
        public final boolean userSelectable = false;
        public DreamMetadata(android.content.ComponentName p0, android.graphics.drawable.Drawable p1, int p2, boolean p3, int p4, boolean p5) {}
    }

    static final class DreamServiceWrapper extends android.service.dreams.IDreamService.Stub {
        final java.lang.ref.WeakReference<android.service.dreams.DreamService> mService = null;
        DreamServiceWrapper(java.lang.ref.WeakReference<android.service.dreams.DreamService> p0) { super(); }
        private void post(java.util.function.Consumer<android.service.dreams.DreamService> p0) {}
        public void attach(android.os.IBinder p0, boolean p1, boolean p2, android.os.IRemoteCallback p3) {}
        public void comeToFront() {}
        public void detach() {}
        public void wakeUp() {}
    }

    public static interface Injector {
        public android.service.dreams.DreamOverlayConnectionHandler createOverlayConnection(android.content.ComponentName p0, java.lang.Runnable p1);
        public android.content.ComponentName getDreamActivityComponent();
        public android.content.ComponentName getDreamComponent();
        public android.service.dreams.IDreamManager getDreamManager();
        public java.lang.String getDreamPackageName();
        public android.os.Handler getHandler();
        public android.content.pm.PackageManager getPackageManager();
        public android.content.res.Resources getResources();
        public android.content.pm.ServiceInfo getServiceInfo();
        public void init(android.content.Context p0);
    }
}
