package android.window.sharedsurface;

public interface SharedSurfaceDispatcher {
    public void addSharedAnimationProvider(android.window.sharedsurface.SharedAnimationProvider p0);
    default public android.app.ActivityOptions.SharedSurfaceAnimationInfo createSharedSurfaceAnimationInfo(android.window.sharedsurface.SharedAnimationProvider p0) { return null; }
    public void removeSharedAnimationProvider(android.window.sharedsurface.SharedAnimationProvider p0);
}
