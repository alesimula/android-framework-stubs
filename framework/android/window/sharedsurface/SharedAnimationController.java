package android.window.sharedsurface;

public class SharedAnimationController implements android.window.sharedsurface.SharedSurfaceDispatcher {
    static final boolean DEBUG = false;
    static final java.lang.String TAG = null;
    private final android.os.Handler mHandler = null;
    private final java.lang.Object mLock = null;
    private final java.util.List<android.window.sharedsurface.SharedAnimationProvider> mPendingProviders = null;
    private final android.util.ArrayMap<android.window.sharedsurface.SharedAnimationProvider, java.lang.ref.WeakReference<android.window.sharedsurface.ISharedAnimationProvider>> mProviderMap = null;
    private android.view.IWindow mWindow;
    private android.view.IWindowSession mWindowSession;
    public SharedAnimationController(android.os.Looper p0) {}
    private boolean isWindowReadyLocked() { return false; }
    private void postAddSharedAnimationProvider(android.window.sharedsurface.SharedAnimationProvider p0) {}
    private void postRemoveSharedAnimationProvider(android.view.IWindowSession p0, android.window.sharedsurface.SharedAnimationProvider p1) {}
    private boolean validateFilters(android.window.sharedsurface.SharedAnimationProvider p0) { return false; }
    public void addSharedAnimationProvider(android.window.sharedsurface.SharedAnimationProvider p0) {}
    public void attachOnWindow(android.view.IWindowSession p0, android.view.IWindow p1) {}
    public android.app.ActivityOptions.SharedSurfaceAnimationInfo createSharedSurfaceAnimationInfo(android.window.sharedsurface.SharedAnimationProvider p0) { return null; }
    public void detachFromWindow() {}
    public void removeSharedAnimationProvider(android.window.sharedsurface.SharedAnimationProvider p0) {}
    void updateSharedAnimationFilter(android.window.sharedsurface.SharedAnimationProvider p0) {}
    public void updateSharedAnimationParams(android.window.sharedsurface.SharedAnimationProvider p0) {}
}
