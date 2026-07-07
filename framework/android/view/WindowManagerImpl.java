package android.view;

public final class WindowManagerImpl implements android.view.WindowManager {
    private static final java.lang.String TAG = "WindowManager";
    public final android.content.Context mContext = null;
    private android.os.IBinder mDefaultToken;
    private android.view.WindowManagerImpl.DisplayEngagementModeCallbackImpl mDisplayEngagementModeCallback;
    private final android.util.ArrayMap<java.util.function.Consumer<android.view.WindowManager.DisplayEngagementModeState>, java.util.concurrent.Executor> mDisplayEngagementModeCallbacks = null;
    private final java.lang.Object mDisplayEngagementModeLock = null;
    private final android.util.ArrayMap<java.util.function.Consumer<android.view.WindowManager.EngagementControlRequest>, java.util.concurrent.Executor> mEngagementControlCallbacks = null;
    private android.view.WindowManagerImpl.EngagementControlRequestConsumerImpl mEngagementControlConsumer;
    private final java.lang.Object mEngagementControlLock = null;
    private final android.view.WindowManagerGlobal mGlobal = null;
    private final android.util.SparseIntArray mLastReportedEngagementModes = null;
    private final java.util.ArrayList<android.view.WindowManagerImpl.OnFpsCallbackListenerProxy> mOnFpsCallbackListenerProxies = null;
    private android.view.Window mParentWindow;
    private final android.os.IBinder mWindowContextToken = null;
    private final android.window.WindowMetricsController mWindowMetricsController = null;
    public WindowManagerImpl(android.content.Context p0) {}
    public WindowManagerImpl(android.content.Context p0, android.view.Window p1, android.os.IBinder p2) {}
    private void applyTokens(android.view.ViewGroup.LayoutParams p0) {}
    private void assertWindowContextTypeMatches(int p0) {}
    public static android.view.WindowManager createWindowContextWindowManager(android.content.Context p0) { return null; }
    private void fallbackWindowTypeIfNeeded(android.view.ViewGroup.LayoutParams p0, android.view.View p1) {}
    public void addCrossWindowBlurEnabledListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
    public void addCrossWindowBlurEnabledListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    public void addEngagementControlRequestConsumer(java.util.concurrent.Executor p0, java.util.function.Consumer<android.view.WindowManager.EngagementControlRequest> p1) {}
    public void addProposedRotationListener(java.util.concurrent.Executor p0, java.util.function.IntConsumer p1) {}
    public int addScreenRecordingCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) { return 0; }
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public android.view.WindowManager createLocalWindowManager(android.view.Window p0) { return null; }
    public android.view.KeyboardShortcutGroup getApplicationLaunchKeyboardShortcuts(int p0) { return null; }
    public android.graphics.Region getCurrentImeTouchRegion() { return null; }
    public android.view.WindowMetrics getCurrentWindowMetrics() { return null; }
    public android.view.Display getDefaultDisplay() { return null; }
    public android.os.IBinder getDefaultToken() { return null; }
    public int getDisplayEngagementMode(int p0) { return 0; }
    public int getDisplayImePolicy(int p0) { return 0; }
    public android.view.WindowMetrics getMaximumWindowMetrics() { return null; }
    public java.util.Set<android.view.WindowMetrics> getPossibleMaximumWindowMetrics(int p0) { return null; }
    public android.os.IBinder getSurfaceControlInputClientToken(android.view.SurfaceControl p0) { return null; }
    public void holdLock(android.os.IBinder p0, int p1) {}
    public boolean isCrossWindowBlurEnabled() { return false; }
    public boolean isEligibleForDesktopMode(int p0) { return false; }
    public boolean isGlobalKey(int p0) { return false; }
    public boolean isTaskSnapshotSupported() { return false; }
    public java.util.List<android.content.ComponentName> notifyScreenshotListeners(int p0) { return null; }
    public android.window.InputTransferToken registerBatchedSurfaceControlInputReceiver(android.window.InputTransferToken p0, android.view.SurfaceControl p1, android.view.Choreographer p2, android.view.SurfaceControlInputReceiver p3) { return null; }
    public void registerDisplayEngagementModeCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<android.view.WindowManager.DisplayEngagementModeState> p1) {}
    public void registerTaskFpsCallback(int p0, java.util.concurrent.Executor p1, android.window.TaskFpsCallback p2) {}
    public void registerTrustedPresentationListener(android.os.IBinder p0, android.window.TrustedPresentationThresholds p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public android.window.InputTransferToken registerUnbatchedSurfaceControlInputReceiver(android.window.InputTransferToken p0, android.view.SurfaceControl p1, android.os.Looper p2, android.view.SurfaceControlInputReceiver p3) { return null; }
    public void removeCrossWindowBlurEnabledListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    public void removeEngagementControlRequestConsumer(java.util.function.Consumer<android.view.WindowManager.EngagementControlRequest> p0) {}
    public void removeProposedRotationListener(java.util.function.IntConsumer p0) {}
    public void removeScreenRecordingCallback(java.util.function.Consumer<java.lang.Integer> p0) {}
    public void removeView(android.view.View p0) {}
    public void removeViewImmediate(android.view.View p0) {}
    public boolean replaceContentOnDisplayWithMirror(int p0, android.view.Window p1) { return false; }
    public boolean replaceContentOnDisplayWithSc(int p0, android.view.SurfaceControl p1) { return false; }
    public void requestAppKeyboardShortcuts(android.view.WindowManager.KeyboardShortcutsReceiver p0, int p1) {}
    public void requestEngagementControlState(int p0) {}
    public void requestImeKeyboardShortcuts(android.view.WindowManager.KeyboardShortcutsReceiver p0, int p1) {}
    public void setDefaultToken(android.os.IBinder p0) {}
    public void setDisplayEngagementMode(int p0, int p1) {}
    public void setDisplayImePolicy(int p0, int p1) {}
    public void setParentWindow(android.view.Window p0) {}
    public void setShouldShowWithInsecureKeyguard(int p0, boolean p1) {}
    public boolean shouldShowSystemDecors(int p0) { return false; }
    public android.graphics.Bitmap snapshotTaskForRecents(int p0) { return null; }
    public boolean transferTouchGesture(android.window.InputTransferToken p0, android.window.InputTransferToken p1) { return false; }
    public void unregisterDisplayEngagementModeCallback(java.util.function.Consumer<android.view.WindowManager.DisplayEngagementModeState> p0) {}
    public void unregisterSurfaceControlInputReceiver(android.view.SurfaceControl p0) {}
    public void unregisterTaskFpsCallback(android.window.TaskFpsCallback p0) {}
    public void unregisterTrustedPresentationListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    public void updateViewLayout(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}

    private class DisplayEngagementModeCallbackImpl extends android.window.IDisplayEngagementModeCallback.Stub {
        private DisplayEngagementModeCallbackImpl(android.view.WindowManagerImpl p0) { super(); }
        public void onEngagementModeChanged(int p0, int p1) {}
    }

    private class EngagementControlRequestConsumerImpl extends android.window.IEngagementControlRequestConsumer.Stub {
        private EngagementControlRequestConsumerImpl(android.view.WindowManagerImpl p0) { super(); }
        public void onEngagementControlRequest(int p0, int p1, int p2) {}
    }

    private static class OnFpsCallbackListenerProxy extends android.window.ITaskFpsCallback.Stub {
        private final android.window.TaskFpsCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private OnFpsCallbackListenerProxy(java.util.concurrent.Executor p0, android.window.TaskFpsCallback p1) { super(); }
        public void onFpsReported(float p0) {}
    }
}
