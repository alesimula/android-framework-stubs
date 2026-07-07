package android.window.sharedsurface;

public abstract class SharedAnimationProvider {
    private static final java.lang.String TAG = null;
    private final java.util.concurrent.Executor mExecutor = null;
    final java.lang.Object mLock = null;
    android.window.sharedsurface.SharedAnimationController mSharedAnimationController;
    private final java.util.List<android.window.sharedsurface.SharedAnimationFilter> mSharedAnimationFilters = null;
    private android.window.sharedsurface.SharedAnimationParams mSharedAnimationParams;
    public SharedAnimationProvider(java.util.concurrent.Executor p0) {}
    public SharedAnimationProvider(java.util.concurrent.Executor p0, android.window.sharedsurface.SharedAnimationParams p1) {}
    public final void addSharedAnimationFilter(android.window.sharedsurface.SharedAnimationFilter p0) {}
    public final android.window.sharedsurface.SharedAnimationParams getAnimationParameters() { return null; }
    public final java.util.List<android.window.sharedsurface.SharedAnimationFilter> getSharedAnimationFilters() { return null; }
    public abstract android.window.sharedsurface.SharedSurfaceHandlerInfo onSharingSurface(android.window.sharedsurface.SharedAnimationFilter p0, android.view.SurfaceControl p1, int p2, int p3, android.view.SurfaceControl.Transaction p4);
    public final void removeSharedAnimationFilter(android.window.sharedsurface.SharedAnimationFilter p0) {}
    public final void removeSharedAnimationParams() {}
    public void setSharedAnimationController(android.window.sharedsurface.SharedAnimationController p0) {}
    public final void updateSharedAnimationParams(android.window.sharedsurface.SharedAnimationParams p0) {}

    public static class SharedAnimationProviderWrapper extends android.window.sharedsurface.ISharedAnimationProvider.Stub {
        private final android.window.sharedsurface.SharedAnimationProvider mSharedAnimationProvider = null;
        public SharedAnimationProviderWrapper(android.window.sharedsurface.SharedAnimationProvider p0) { super(); }
        private static void notifyHandlerReady(android.window.sharedsurface.ISharedAnimationReady p0, android.window.sharedsurface.SharedSurfaceHandlerInfo p1) {}
        public void createSurfaceHandler(android.window.sharedsurface.SharedAnimationFilter p0, android.view.SurfaceControl p1, int p2, int p3, android.window.sharedsurface.ISharedAnimationReady p4) {}
    }
}
