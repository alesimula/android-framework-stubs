package android.app;

public class MediaRouteActionProvider extends android.view.ActionProvider {
    private static final java.lang.String TAG = "MediaRouteActionProvider";
    private android.app.MediaRouteButton mButton;
    private final android.app.MediaRouteActionProvider.MediaRouterCallback mCallback = null;
    private final android.content.Context mContext = null;
    private android.view.View.OnClickListener mExtendedSettingsListener;
    private int mRouteTypes;
    private final android.media.MediaRouter mRouter = null;
    public MediaRouteActionProvider(android.content.Context p0) { super(null); }
    private void refreshRoute() {}
    public boolean isVisible() { return false; }
    public android.view.View onCreateActionView() { return null; }
    public android.view.View onCreateActionView(android.view.MenuItem p0) { return null; }
    public boolean onPerformDefaultAction() { return false; }
    public boolean overridesItemVisibility() { return false; }
    public void setExtendedSettingsClickListener(android.view.View.OnClickListener p0) {}
    public void setRouteTypes(int p0) {}

    private static class MediaRouterCallback extends android.media.MediaRouter.SimpleCallback {
        private final java.lang.ref.WeakReference<android.app.MediaRouteActionProvider> mProviderWeak = null;
        public MediaRouterCallback(android.app.MediaRouteActionProvider p0) { super(); }
        private void refreshRoute(android.media.MediaRouter p0) {}
        public void onRouteAdded(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteRemoved(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
    }
}
