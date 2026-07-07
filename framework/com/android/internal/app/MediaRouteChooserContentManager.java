package com.android.internal.app;

public class MediaRouteChooserContentManager {
    private com.android.internal.app.MediaRouteChooserContentManager.RouteAdapter mAdapter;
    private boolean mAttachedToWindow;
    private final com.android.internal.app.MediaRouteChooserContentManager.MediaRouterCallback mCallback = null;
    android.content.Context mContext;
    com.android.internal.app.MediaRouteChooserContentManager.Delegate mDelegate;
    private int mRouteTypes;
    private final android.media.MediaRouter mRouter = null;
    private android.widget.Button mShareCastButton;
    private boolean mShareCastFeatureEnabled;
    private java.lang.String mShareCastPackage;
    private java.lang.String mShareCastRouteId;
    public MediaRouteChooserContentManager(android.content.Context p0, com.android.internal.app.MediaRouteChooserContentManager.Delegate p1) {}
    private android.media.MediaRouter.RouteInfo getShareCastRoute() { return null; }
    private boolean isShareCastRoute(android.media.MediaRouter.RouteInfo p0) { return false; }
    private void loadShareCastConfig() {}
    private void updateShareCastButton() {}
    public void bindViews(android.view.View p0) {}
    public int getRouteTypes() { return 0; }
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public boolean onFilterRoute(android.media.MediaRouter.RouteInfo p0) { return false; }
    public void refreshRoutes() {}
    public void setRouteTypes(int p0) {}

    public static interface Delegate {
        public void dismissView();
        public boolean showProgressBarWhenEmpty();
        default public boolean showShareCastButton() { return false; }
    }

    private final class MediaRouterCallback extends android.media.MediaRouter.SimpleCallback {
        private MediaRouterCallback(com.android.internal.app.MediaRouteChooserContentManager p0) { super(); }
        public void onRouteAdded(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteRemoved(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteSelected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2) {}
    }

    private final class RouteAdapter extends android.widget.ArrayAdapter<android.media.MediaRouter.RouteInfo> implements android.widget.AdapterView.OnItemClickListener {
        private final android.view.LayoutInflater mInflater = null;
        RouteAdapter(com.android.internal.app.MediaRouteChooserContentManager p0, android.content.Context p1) { super((android.content.Context)null, 0); }
        public boolean areAllItemsEnabled() { return false; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public boolean isEnabled(int p0) { return false; }
        public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
        public void update() {}
    }

    private static final class RouteComparator implements java.util.Comparator<android.media.MediaRouter.RouteInfo> {
        public static final com.android.internal.app.MediaRouteChooserContentManager.RouteComparator sInstance = null;
        private RouteComparator() {}
        public int compare(android.media.MediaRouter.RouteInfo p0, android.media.MediaRouter.RouteInfo p1) { return 0; }
    }
}
