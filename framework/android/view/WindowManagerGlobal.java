package android.view;

public final class WindowManagerGlobal {
    public static final int ADD_APP_EXITING = -4;
    public static final int ADD_BAD_APP_TOKEN = -1;
    public static final int ADD_BAD_SUBWINDOW_TOKEN = -2;
    public static final int ADD_DUPLICATE_ADD = -5;
    public static final int ADD_FLAG_APP_VISIBLE = 2;
    public static final int ADD_FLAG_IN_TOUCH_MODE = 1;
    public static final int ADD_INVALID_DISPLAY = -9;
    public static final int ADD_INVALID_TYPE = -10;
    public static final int ADD_INVALID_USER = -11;
    public static final int ADD_MULTIPLE_SINGLETON = -7;
    public static final int ADD_NOT_APP_TOKEN = -3;
    public static final int ADD_OKAY = 0;
    public static final int ADD_PERMISSION_DENIED = -8;
    public static final int ADD_STARTING_NOT_NEEDED = -6;
    public static final int RELAYOUT_INSETS_PENDING = 1;
    public static final int RELAYOUT_RES_BUFFER_SYNC = 16;
    public static final int RELAYOUT_RES_CANCEL_AND_REDRAW = 8;
    public static final int RELAYOUT_RES_FIRST_TIME = 1;
    public static final int RELAYOUT_RES_SURFACE_CHANGED = 2;
    public static final int RELAYOUT_RES_SURFACE_RESIZED = 4;
    private static final java.lang.String TAG = "WindowManager";
    private static android.view.WindowManagerGlobal sDefaultWindowManager;
    private static android.view.IWindowManager sWindowManagerService;
    private static android.view.IWindowSession sWindowSession;
    private final android.util.ArraySet<android.view.View> mDyingViews = null;
    private boolean mIsViewAnimationsDisabled;
    private final java.lang.Object mLock = null;
    private final java.util.ArrayList<android.view.WindowManager.LayoutParams> mParams = null;
    private java.util.WeakHashMap<android.os.IBinder, android.view.WindowManagerGlobal.ProposedRotationListenerDelegate> mProposedRotationListenerMap;
    private final java.util.ArrayList<android.view.ViewRootImpl> mRoots = null;
    private final android.util.SparseArray<android.view.WindowManagerGlobal.SurfaceControlInputReceiverInfo> mSurfaceControlInputReceivers = null;
    private java.lang.Runnable mSystemPropertyUpdater;
    private final android.view.WindowManagerGlobal.TrustedPresentationListener mTrustedPresentationListener = null;
    private float mValueAnimatorDurationScaleWithoutOverride;
    private java.util.function.Consumer<java.util.List<android.view.View>> mViewAnimationDisableRequestsListener;
    private final java.util.ArrayList<android.view.View> mViews = null;
    private final android.util.ListenerGroup<java.util.List<android.view.View>> mWindowViewsListenerGroup = null;
    private final java.util.ArrayList<android.view.ViewRootImpl> mWindowlessRoots = null;
    private WindowManagerGlobal() {}
    private static android.view.InputChannel createInputChannel(android.os.IBinder p0, android.window.InputTransferToken p1, android.view.SurfaceControl p2, android.window.InputTransferToken p3) { return null; }
    private int findViewLocked(android.view.View p0, boolean p1) { return 0; }
    public static android.view.WindowManagerGlobal getInstance() { return null; }
    public static android.view.IWindowManager getWindowManagerService() { return null; }
    private static java.lang.String getWindowName(android.view.ViewRootImpl p0) { return null; }
    public static android.view.IWindowSession getWindowSession() { return null; }
    public static void initialize() {}
    private void onAnimatorScaleChanged(float p0) {}
    public static android.view.IWindowSession peekWindowSession() { return null; }
    private static void removeInputChannel(android.os.IBinder p0) {}
    private void removeViewLocked(int p0, boolean p1) {}
    public static void setWindowManagerServiceForSystemProcess(android.view.IWindowManager p0) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1, android.view.Display p2, android.view.Window p3, int p4) {}
    public void addWindowViewsListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.util.List<android.view.View>> p1) {}
    public void addWindowlessRoot(android.view.ViewRootImpl p0) {}
    public boolean canApplyFallbackWindowType(int p0, android.view.View p1) { return false; }
    public void changeCanvasOpacity(android.os.IBinder p0, boolean p1) {}
    public void closeAll(android.os.IBinder p0, java.lang.String p1, java.lang.String p2) {}
    public void closeAllExceptView(android.os.IBinder p0, android.view.View p1, java.lang.String p2, java.lang.String p3) {}
    void doRemoveView(android.view.ViewRootImpl p0) {}
    public void dumpGfxInfo(java.io.FileDescriptor p0, java.lang.String[] p1) {}
    public android.view.View getRootView(java.lang.String p0) { return null; }
    public java.util.ArrayList<android.view.ViewRootImpl> getRootViews(android.os.IBinder p0) { return null; }
    android.os.IBinder getSurfaceControlInputClientToken(android.view.SurfaceControl p0) { return null; }
    public java.lang.String[] getViewRootNames() { return null; }
    public android.view.View getWindowView(android.os.IBinder p0) { return null; }
    public java.util.ArrayList<android.view.View> getWindowViews() { return null; }
    public android.view.SurfaceControl mirrorWallpaperSurface(int p0) { return null; }
    public void onAnimationDisableRequestChangedForViewRoot() {}
    android.window.InputTransferToken registerBatchedSurfaceControlInputReceiver(android.window.InputTransferToken p0, android.view.SurfaceControl p1, android.view.Choreographer p2, android.view.SurfaceControlInputReceiver p3) { return null; }
    public void registerProposedRotationListener(android.os.IBinder p0, java.util.concurrent.Executor p1, java.util.function.IntConsumer p2) {}
    public void registerTrustedPresentationListener(android.os.IBinder p0, android.window.TrustedPresentationThresholds p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    android.window.InputTransferToken registerUnbatchedSurfaceControlInputReceiver(android.window.InputTransferToken p0, android.view.SurfaceControl p1, android.os.Looper p2, android.view.SurfaceControlInputReceiver p3) { return null; }
    public void removeView(android.view.View p0, boolean p1) {}
    public void removeWindowViewsListener(java.util.function.Consumer<java.util.List<android.view.View>> p0) {}
    public void removeWindowlessRoot(android.view.ViewRootImpl p0) {}
    public void reportNewConfiguration(android.content.res.Configuration p0) {}
    public void setRecentsAppBehindSystemBars(boolean p0) {}
    public void setStoppedState(android.os.IBinder p0, boolean p1) {}
    boolean transferTouchGesture(android.window.InputTransferToken p0, android.window.InputTransferToken p1) { return false; }
    public void trimCaches(int p0) {}
    public void trimMemory(int p0) {}
    public void unregisterProposedRotationListener(android.os.IBinder p0, java.util.function.IntConsumer p1) {}
    void unregisterSurfaceControlInputReceiver(android.view.SurfaceControl p0) {}
    public void unregisterTrustedPresentationListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    public void updateViewLayout(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}

    private static class ProposedRotationListenerDelegate extends android.view.IRotationWatcher.Stub {
        int mLastRotation;
        private volatile android.view.WindowManagerGlobal.ProposedRotationListenerDelegate.ListenerWrapper[] mListenerArray;
        private final java.util.ArrayList<android.view.WindowManagerGlobal.ProposedRotationListenerDelegate.ListenerWrapper> mListeners = null;
        private ProposedRotationListenerDelegate() { super(); }
        boolean add(java.util.concurrent.Executor p0, java.util.function.IntConsumer p1) { return false; }
        public void onRotationChanged(int p0) {}
        boolean remove(java.util.function.IntConsumer p0) { return false; }

        static class ListenerWrapper {
            final java.util.concurrent.Executor mExecutor = null;
            final java.lang.ref.WeakReference<java.util.function.IntConsumer> mListener = null;
            ListenerWrapper(java.util.concurrent.Executor p0, java.util.function.IntConsumer p1) {}
        }
    }

    private static class SurfaceControlInputReceiverInfo {
        final android.os.IBinder mClientToken = null;
        final android.view.InputEventReceiver mInputEventReceiver = null;
        private SurfaceControlInputReceiverInfo(android.os.IBinder p0, android.view.InputEventReceiver p1) {}
    }

    private final class TrustedPresentationListener extends android.window.ITrustedPresentationListener.Stub {
        private static int sId;
        private final android.util.ArrayMap<java.util.function.Consumer<java.lang.Boolean>, android.util.Pair<java.lang.Integer, java.util.concurrent.Executor>> mListeners = null;
        private final java.lang.Object mTplLock = null;
        private TrustedPresentationListener(android.view.WindowManagerGlobal p0) { super(); }
        private void addListener(android.os.IBinder p0, android.window.TrustedPresentationThresholds p1, java.util.function.Consumer<java.lang.Boolean> p2, java.util.concurrent.Executor p3) {}
        private void removeListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
        public void onTrustedPresentationChanged(int[] p0, int[] p1) {}
    }
}
