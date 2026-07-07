package android.view;

public class ViewRootInsetsControllerHost implements android.view.InsetsController.Host {
    private final java.lang.String TAG = null;
    private android.view.SyncRtSurfaceTransactionApplier mApplier;
    private final android.view.ViewRootImpl mViewRoot = null;
    public ViewRootInsetsControllerHost(android.view.ViewRootImpl p0) {}
    private boolean isVisibleToUser() { return false; }
    public void addOnPreDrawRunnable(java.lang.Runnable p0) {}
    public void applySurfaceParams(android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p0) {}
    public int dipToPx(int p0) { return 0; }
    public void dispatchWindowInsetsAnimationEnd(android.view.WindowInsetsAnimation p0, boolean p1, boolean p2, boolean p3) {}
    public void dispatchWindowInsetsAnimationPrepare(android.view.WindowInsetsAnimation p0, boolean p1, boolean p2, boolean p3) {}
    public android.view.WindowInsets dispatchWindowInsetsAnimationProgress(android.view.WindowInsets p0, android.view.InsetsState p1, java.util.List<android.view.WindowInsetsAnimation> p2, boolean p3, boolean p4, boolean p5, int p6) { return null; }
    public android.view.WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(android.view.WindowInsetsAnimation p0, android.view.WindowInsetsAnimation.Bounds p1, boolean p2, boolean p3, boolean p4) { return null; }
    public android.os.Handler getHandler() { return null; }
    public android.view.inputmethod.InputMethodManager getInputMethodManager() { return null; }
    public android.content.Context getRootViewContext() { return null; }
    public java.lang.String getRootViewTitle() { return null; }
    public int getSystemBarsAppearance() { return 0; }
    public int getSystemBarsBehavior() { return 0; }
    public android.content.res.CompatibilityInfo.Translator getTranslator() { return null; }
    public android.os.IBinder getWindowToken() { return null; }
    public boolean hasAnimationCallbacks() { return false; }
    public boolean isHandlingPointerEvent() { return false; }
    public void notifyInsetsChanged() {}
    public void postInsetsAnimationCallback(java.lang.Runnable p0) {}
    public void releaseSurfaceControlFromRt(android.view.SurfaceControl p0) {}
    public void setSystemBarsAppearance(int p0, int p1) {}
    public void setSystemBarsBehavior(int p0) {}
    public void updateAnimatingTypes(int p0, android.view.inputmethod.ImeTracker.Token p1) {}
    public void updateCompatSysUiVisibility(int p0, int p1, int p2) {}
    public void updateRequestedVisibleTypes(int p0, android.view.inputmethod.ImeTracker.Token p1) {}
    public void updateWindowInsetsInfo() {}
    public boolean usesSyncedInsetsAnimationByDefault() { return false; }
}
