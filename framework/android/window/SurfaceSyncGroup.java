package android.window;

public final class SurfaceSyncGroup {
    private static final boolean DEBUG = false;
    private static final int MAX_COUNT = 100;
    private static final java.lang.String TAG = "SurfaceSyncGroup";
    public static final int TRANSACTION_READY_TIMEOUT = Integer.valueOf(0);
    private static final java.util.concurrent.atomic.AtomicInteger sCounter = null;
    private static android.os.HandlerThread sHandlerThread;
    private static final java.lang.Object sHandlerThreadLock = null;
    private static java.util.function.Supplier<android.view.SurfaceControl.Transaction> sTransactionFactory;
    private java.lang.Runnable mAddedToSyncListener;
    private boolean mFinished;
    private android.os.Handler mHandler;
    private boolean mHasWMSync;
    public final android.window.ISurfaceSyncGroup mISurfaceSyncGroup = null;
    private final java.lang.Object mLock = null;
    private final java.lang.String mName = null;
    private android.window.ISurfaceSyncGroup mParentSyncGroup;
    private final android.util.ArraySet<android.window.ITransactionReadyCallback> mPendingSyncs = null;
    private android.window.ISurfaceSyncGroupCompletedListener mSurfaceSyncGroupCompletedListener;
    private final android.util.ArraySet<android.util.Pair<java.util.concurrent.Executor, java.lang.Runnable>> mSyncCompleteCallbacks = null;
    private boolean mSyncReady;
    private boolean mTimeoutAdded;
    private boolean mTimeoutDisabled;
    private final android.os.Binder mToken = null;
    private final java.lang.String mTrackName = null;
    private final android.view.SurfaceControl.Transaction mTransaction = null;
    private java.util.function.Consumer<android.view.SurfaceControl.Transaction> mTransactionReadyConsumer;
    public SurfaceSyncGroup(java.lang.String p0) {}
    public SurfaceSyncGroup(java.lang.String p0, java.util.function.Consumer<android.view.SurfaceControl.Transaction> p1) {}
    private boolean addLocalSync(android.window.ISurfaceSyncGroup p0, boolean p1) { return false; }
    private boolean addSyncToWm(android.os.IBinder p0, boolean p1, android.window.ISurfaceSyncGroupCompletedListener p2) { return false; }
    private void addTimeout() {}
    private void checkIfSyncIsComplete() {}
    private static android.window.SurfaceSyncGroup getSurfaceSyncGroup(android.window.ISurfaceSyncGroup p0) { return null; }
    private void invokeSyncCompleteCallbacks() {}
    private static boolean isLocalBinder(android.os.IBinder p0) { return false; }
    private void setTransactionCallbackFromParent(android.window.ISurfaceSyncGroup p0, android.window.ITransactionReadyCallback p1) {}
    public static void setTransactionFactory(java.util.function.Supplier<android.view.SurfaceControl.Transaction> p0) {}
    public boolean add(android.view.AttachedSurfaceControl p0, java.lang.Runnable p1) { return false; }
    public boolean add(android.view.SurfaceControlViewHost.SurfacePackage p0, java.lang.Runnable p1) { return false; }
    public boolean add(android.view.SurfaceView p0, java.util.function.Consumer<android.window.SurfaceSyncGroup.SurfaceViewFrameCallback> p1) { return false; }
    public boolean add(android.window.ISurfaceSyncGroup p0, boolean p1, java.lang.Runnable p2) { return false; }
    public boolean add(android.window.SurfaceSyncGroup p0, java.lang.Runnable p1) { return false; }
    public void addSyncCompleteCallback(java.util.concurrent.Executor p0, java.lang.Runnable p1) {}
    public void addTransaction(android.view.SurfaceControl.Transaction p0) {}
    public android.window.ITransactionReadyCallback createTransactionReadyCallback(boolean p0) { return null; }
    public java.lang.String getName() { return null; }
    public boolean isComplete() { return false; }
    public void markSyncReady() {}
    public void setAddedToSyncListener(java.lang.Runnable p0) {}
    public void toggleTimeout(boolean p0) {}

    private class ISurfaceSyncGroupImpl extends android.window.ISurfaceSyncGroup.Stub {
        private ISurfaceSyncGroupImpl(android.window.SurfaceSyncGroup p0) { super(); }
        public boolean addToSync(android.window.ISurfaceSyncGroup p0, boolean p1) { return false; }
        android.window.SurfaceSyncGroup getSurfaceSyncGroup() { return null; }
        public boolean onAddedToSyncGroup(android.os.IBinder p0, boolean p1) { return false; }
    }

    public static interface SurfaceViewFrameCallback {
        public void onFrameStarted();
    }
}
