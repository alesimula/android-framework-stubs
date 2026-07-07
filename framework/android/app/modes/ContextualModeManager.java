package android.app.modes;

@android.annotation.SystemApi
public final class ContextualModeManager {
    private static final java.lang.String TAG = "CtxModeManager";
    private final android.content.Context mContext = null;
    private final java.lang.Object mLock = null;
    private final java.util.Map<android.os.UserHandle, android.app.modes.ContextualModeManager.ContextualModeListenerStub> mModeListeners = null;
    private final java.util.Map<android.os.UserHandle, android.app.modes.ContextualModeManager.ContextualModeSyncListenerStub> mModeSyncListeners = null;
    private java.lang.Boolean mModeSyncSupported;
    private volatile android.app.modes.IContextualModeManager mService;
    public ContextualModeManager(android.content.Context p0) {}
    private android.app.modes.IContextualModeManager getService() { return null; }
    public java.util.List<android.app.modes.ContextualMode> getModes() { return null; }
    public java.util.List<android.app.modes.ContextualMode> getModes(android.os.UserHandle p0) { return null; }
    @android.annotation.SystemApi
    public boolean isModeSyncEnabled() { return false; }
    public boolean isModeSyncEnabled(android.os.UserHandle p0) { return false; }
    @android.annotation.SystemApi
    public boolean isModeSyncSupported() { return false; }
    public void mutateModes(android.app.modes.ContextualModesMutation p0) {}
    public void mutateModes(android.os.UserHandle p0, android.app.modes.ContextualModesMutation p1) {}
    public void registerModeListener(android.os.UserHandle p0, java.util.concurrent.Executor p1, android.app.modes.ContextualModeManager.ContextualModeListener p2) {}
    public void registerModeListener(java.util.concurrent.Executor p0, android.app.modes.ContextualModeManager.ContextualModeListener p1) {}
    public void registerModeSyncEnabledListener(android.os.UserHandle p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Boolean> p2) {}
    @android.annotation.SystemApi
    public void registerModeSyncEnabledListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
    public void setModeSyncEnabled(android.os.UserHandle p0, boolean p1) {}
    @android.annotation.SystemApi
    public void setModeSyncEnabled(boolean p0) {}
    public void unregisterModeListener(android.app.modes.ContextualModeManager.ContextualModeListener p0) {}
    @android.annotation.SystemApi
    public void unregisterModeSyncEnabledListener(java.util.function.Consumer<java.lang.Boolean> p0) {}

    public static interface ContextualModeListener {
        public void onModeRemoved(java.lang.String p0);
        public void onModesChanged(java.util.List<android.app.modes.ContextualMode> p0);
    }

    private class ContextualModeListenerStub extends android.app.modes.IContextualModeListener.Stub {
        final java.util.List<android.util.Pair<java.util.concurrent.Executor, android.app.modes.ContextualModeManager.ContextualModeListener>> mListeners = null;
        private ContextualModeListenerStub(android.app.modes.ContextualModeManager p0) { super(); }
        private void notifyListeners(java.util.function.Consumer<android.app.modes.ContextualModeManager.ContextualModeListener> p0) {}
        public void onModeRemoved(java.lang.String p0) {}
        public void onModesChanged(java.util.List<android.app.modes.ContextualMode> p0) {}
    }

    private class ContextualModeSyncListenerStub extends android.app.modes.IContextualModeSyncListener.Stub {
        final java.util.List<android.util.Pair<java.util.concurrent.Executor, java.util.function.Consumer<java.lang.Boolean>>> mListeners = null;
        private ContextualModeSyncListenerStub(android.app.modes.ContextualModeManager p0) { super(); }
        public void onModeSyncEnabledChanged(boolean p0) {}
    }
}
