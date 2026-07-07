package android.service.chooser;

public final class ChooserSession {
    public static final java.lang.String EXTRA_CHOOSER_SESSION = "com.android.extra.EXTRA_CHOOSER_INTERACTIVE_CALLBACK";
    public static final int STATE_CLOSED = 2;
    public static final int STATE_INITIALIZED = 0;
    public static final int STATE_STARTED = 1;
    private static final java.lang.String TAG = "ChooserSession";
    private final android.service.chooser.ChooserSession.ChooserSessionImpl mChooserSession = null;
    private final android.service.chooser.ChooserSessionToken mToken = null;
    ChooserSession() {}
    static boolean isSessionBinder(android.os.IBinder p0) { return false; }
    public void addStateListener(java.util.concurrent.Executor p0, android.service.chooser.ChooserSession.StateListener p1) {}
    public void endSession() {}
    android.os.IBinder getBinder() { return null; }
    public android.graphics.Rect getBounds() { return null; }
    public android.graphics.Rect getInitialRestingBounds() { return null; }
    public int getState() { return 0; }
    public android.service.chooser.ChooserSessionToken getToken() { return null; }
    public void removeStateListener(android.service.chooser.ChooserSession.StateListener p0) {}
    public void setMinimized(boolean p0) {}
    public void setTargetsEnabled(boolean p0) {}
    public void updateIntent(android.content.Intent p0) {}

    private static class BoundsInfo {
        private final android.graphics.Rect mBounds = null;
        private final android.graphics.Rect mDefaultBounds = null;
        private BoundsInfo(android.graphics.Rect p0, android.graphics.Rect p1) {}
        android.graphics.Rect getBounds() { return null; }
        android.graphics.Rect getDefaultBounds() { return null; }
    }

    private static class ChooserSessionImpl extends android.service.chooser.IChooserControllerCallback.Stub {
        private final java.util.concurrent.atomic.AtomicReference<android.service.chooser.ChooserSession.BoundsInfo> mBoundsInfo = null;
        private android.service.chooser.IChooserController mChooserController;
        private android.os.IBinder.DeathRecipient mChooserControllerLinkToDeath;
        private final java.lang.Object mListenerLock = null;
        private java.util.Map<android.service.chooser.ChooserSession.StateListener, android.service.chooser.ChooserSession.UpdateListenerWrapper> mListenerMap;
        private int mState;
        private final java.lang.Object mStateLock = null;
        private ChooserSessionImpl() { super(); }
        private static boolean areEqual(android.service.chooser.IChooserController p0, android.service.chooser.IChooserController p1) { return false; }
        private void connectController(android.service.chooser.IChooserController p0) {}
        private android.os.IBinder.DeathRecipient createDeathRecipient(android.service.chooser.IChooserController p0) { return null; }
        private void disconnectCurrentController() {}
        private void doClose(boolean p0) {}
        private boolean isActive() { return false; }
        private void notifyListeners(java.util.function.Consumer<android.service.chooser.ChooserSession.StateListener> p0) {}
        private static void safeUnlinkToDeath(android.os.IBinder p0, android.os.IBinder.DeathRecipient p1) {}
        private static void safeUpdateChooserIntent(android.service.chooser.IChooserController p0, android.content.Intent p1) {}
        public void addStateListener(java.util.concurrent.Executor p0, android.service.chooser.ChooserSession.StateListener p1) {}
        public void close() {}
        public android.service.chooser.IChooserController getChooserController() { return null; }
        public int getState() { return 0; }
        public void onBoundsChanged(android.graphics.Rect p0, android.graphics.Rect p1) {}
        public void onClosed() {}
        public void registerChooserController(android.service.chooser.IChooserController p0) {}
        public void removeStateListener(android.service.chooser.ChooserSession.StateListener p0) {}
        public void setMinimized(boolean p0) {}
        public void setTargetsEnabled(boolean p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }

    public static interface StateListener {
        public void onBoundsChanged(android.graphics.Rect p0);
        public void onStateChanged(int p0);
    }

    private static class UpdateListenerWrapper {
        public final java.util.concurrent.Executor executor = null;
        public final java.util.concurrent.atomic.AtomicBoolean isSubscribed = null;
        public final android.service.chooser.ChooserSession.StateListener listener = null;
        UpdateListenerWrapper(android.service.chooser.ChooserSession.StateListener p0, java.util.concurrent.Executor p1) {}
    }
}
