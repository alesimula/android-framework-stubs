package android.app.smartspace;

@android.annotation.SystemApi
public final class SmartspaceSession implements java.lang.AutoCloseable {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = null;
    private final android.app.smartspace.ISmartspaceManager mInterface = null;
    private final java.util.concurrent.atomic.AtomicBoolean mIsClosed = null;
    private final android.util.ArrayMap<android.app.smartspace.SmartspaceSession.OnTargetsAvailableListener, android.app.smartspace.SmartspaceSession.CallbackWrapper> mRegisteredCallbacks = null;
    private final android.app.smartspace.SmartspaceSessionId mSessionId = null;
    SmartspaceSession(android.content.Context p0, android.app.smartspace.SmartspaceConfig p1) {}
    private void destroy() {}
    private static android.os.IBinder getToken() { return null; }
    public void addOnTargetsAvailableListener(java.util.concurrent.Executor p0, android.app.smartspace.SmartspaceSession.OnTargetsAvailableListener p1) {}
    public void close() {}
    protected void finalize() {}
    public void notifySmartspaceEvent(android.app.smartspace.SmartspaceTargetEvent p0) {}
    public void removeOnTargetsAvailableListener(android.app.smartspace.SmartspaceSession.OnTargetsAvailableListener p0) {}
    public void requestSmartspaceUpdate() {}

    static class CallbackWrapper extends android.app.smartspace.ISmartspaceCallback.Stub {
        private final java.util.function.Consumer<java.util.List<android.app.smartspace.SmartspaceTarget>> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        CallbackWrapper(java.util.concurrent.Executor p0, java.util.function.Consumer<java.util.List<android.app.smartspace.SmartspaceTarget>> p1) { super(); }
        public void onResult(android.content.pm.ParceledListSlice p0) {}
    }

    public static interface OnTargetsAvailableListener {
        public void onTargetsAvailable(java.util.List<android.app.smartspace.SmartspaceTarget> p0);
    }

    private static class Token {
        static final android.os.IBinder sBinder = null;
        private Token() {}
    }
}
