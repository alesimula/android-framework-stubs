package android.view;

public class WindowManagerWrapper implements android.view.WindowManager {
    private final android.view.WindowManager mBase = null;
    public WindowManagerWrapper(android.view.WindowManager p0) {}
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
    @java.lang.Deprecated
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
}
