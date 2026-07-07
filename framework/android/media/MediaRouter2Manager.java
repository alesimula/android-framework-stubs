package android.media;

public final class MediaRouter2Manager {
    private static final java.lang.String TAG = "MR2Manager";
    public static final int TRANSFER_TIMEOUT_MS = 30000;
    private static android.media.MediaRouter2Manager sInstance;
    private static final java.lang.Object sLock = null;
    final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter2Manager.CallbackRecord> mCallbackRecords = null;
    private final android.media.MediaRouter2Manager.Client mClient = null;
    private final android.content.Context mContext = null;
    final java.util.concurrent.ConcurrentMap<java.lang.String, android.media.RouteDiscoveryPreference> mDiscoveryPreferenceMap = null;
    final android.os.Handler mHandler = null;
    private final android.media.IMediaRouterService mMediaRouterService = null;
    private final android.media.session.MediaSessionManager mMediaSessionManager = null;
    private final java.util.concurrent.atomic.AtomicInteger mNextRequestId = null;
    private final java.util.concurrent.ConcurrentMap<java.lang.String, android.media.RouteListingPreference> mPackageToRouteListingPreferenceMap = null;
    private final java.util.Map<java.lang.String, android.media.MediaRoute2Info> mRoutes = null;
    private final java.lang.Object mRoutesLock = null;
    private final java.util.concurrent.atomic.AtomicInteger mScanRequestCount = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter2Manager.TransferRequest> mTransferRequests = null;
    private MediaRouter2Manager(android.content.Context p0) {}
    private boolean areSessionsMatched(android.media.session.MediaController p0, android.media.RoutingSessionInfo p1) { return false; }
    private int createTransferRequest(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) { return 0; }
    private java.util.List<android.media.MediaRoute2Info> getFilteredRoutes(android.media.RoutingSessionInfo p0, boolean p1, java.util.function.Predicate<android.media.MediaRoute2Info> p2) { return null; }
    public static android.media.MediaRouter2Manager getInstance(android.content.Context p0) { return null; }
    private java.util.List<android.media.MediaRoute2Info> getSortedRoutes(android.media.RouteDiscoveryPreference p0) { return null; }
    private void handleTransferTimeout(android.media.MediaRouter2Manager.TransferRequest p0) {}
    private void notifyRoutesUpdated() {}
    private void requestCreateSession(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) {}
    private void transferToRoute(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1, android.os.UserHandle p2, java.lang.String p3) {}
    private void updateRouteListingPreference(java.lang.String p0, android.media.RouteListingPreference p1) {}
    void createSessionOnHandler(int p0, android.media.RoutingSessionInfo p1) {}
    public void deselectRoute(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) {}
    public java.util.List<android.media.MediaRoute2Info> getAllRoutes() { return null; }
    public java.util.List<android.media.MediaRoute2Info> getAvailableRoutes(android.media.RoutingSessionInfo p0) { return null; }
    public java.util.List<android.media.MediaRoute2Info> getAvailableRoutes(java.lang.String p0) { return null; }
    public java.util.List<android.media.MediaRoute2Info> getDeselectableRoutes(android.media.RoutingSessionInfo p0) { return null; }
    public android.media.RouteDiscoveryPreference getDiscoveryPreference(java.lang.String p0) { return null; }
    public android.media.session.MediaController getMediaControllerForRoutingSession(android.media.RoutingSessionInfo p0) { return null; }
    public java.util.List<android.media.RoutingSessionInfo> getRemoteSessions() { return null; }
    public android.media.RouteListingPreference getRouteListingPreference(java.lang.String p0) { return null; }
    public android.media.RoutingSessionInfo getRoutingSessionForMediaController(android.media.session.MediaController p0) { return null; }
    public java.util.List<android.media.RoutingSessionInfo> getRoutingSessions(java.lang.String p0) { return null; }
    public java.util.List<android.media.MediaRoute2Info> getSelectableRoutes(android.media.RoutingSessionInfo p0) { return null; }
    public java.util.List<android.media.MediaRoute2Info> getSelectedRoutes(android.media.RoutingSessionInfo p0) { return null; }
    public android.media.RoutingSessionInfo getSystemRoutingSession(java.lang.String p0) { return null; }
    public java.util.List<android.media.MediaRoute2Info> getTransferableRoutes(android.media.RoutingSessionInfo p0) { return null; }
    public java.util.List<android.media.MediaRoute2Info> getTransferableRoutes(java.lang.String p0) { return null; }
    void handleFailureOnHandler(int p0, int p1) {}
    void handleSessionsUpdatedOnHandler(android.media.RoutingSessionInfo p0) {}
    void notifyRequestFailed(int p0) {}
    void notifySessionReleased(android.media.RoutingSessionInfo p0) {}
    void notifySessionUpdated(android.media.RoutingSessionInfo p0) {}
    void notifyTransferFailed(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) {}
    void notifyTransferred(android.media.RoutingSessionInfo p0, android.media.RoutingSessionInfo p1) {}
    public void registerCallback(java.util.concurrent.Executor p0, android.media.MediaRouter2Manager.Callback p1) {}
    public void registerScanRequest() {}
    public void releaseSession(android.media.RoutingSessionInfo p0) {}
    public void selectRoute(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) {}
    public void setRouteVolume(android.media.MediaRoute2Info p0, int p1) {}
    public void setSessionVolume(android.media.RoutingSessionInfo p0, int p1) {}
    public void transfer(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1, android.os.UserHandle p2, java.lang.String p3) {}
    public void transfer(java.lang.String p0, android.media.MediaRoute2Info p1, android.os.UserHandle p2) {}
    public void unregisterCallback(android.media.MediaRouter2Manager.Callback p0) {}
    public void unregisterScanRequest() {}
    void updateDiscoveryPreference(java.lang.String p0, android.media.RouteDiscoveryPreference p1) {}
    void updateRoutesOnHandler(java.util.List<android.media.MediaRoute2Info> p0) {}

    public static interface Callback {
        default public void onDiscoveryPreferenceChanged(java.lang.String p0, android.media.RouteDiscoveryPreference p1) {}
        default public void onPreferredFeaturesChanged(java.lang.String p0, java.util.List<java.lang.String> p1) {}
        default public void onRequestFailed(int p0) {}
        default public void onRouteListingPreferenceUpdated(java.lang.String p0, android.media.RouteListingPreference p1) {}
        default public void onRoutesUpdated() {}
        default public void onSessionReleased(android.media.RoutingSessionInfo p0) {}
        default public void onSessionUpdated(android.media.RoutingSessionInfo p0) {}
        default public void onTransferFailed(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) {}
        default public void onTransferred(android.media.RoutingSessionInfo p0, android.media.RoutingSessionInfo p1) {}
    }

    final class CallbackRecord {
        public final android.media.MediaRouter2Manager.Callback mCallback = null;
        public final java.util.concurrent.Executor mExecutor = null;
        CallbackRecord(android.media.MediaRouter2Manager p0, java.util.concurrent.Executor p1, android.media.MediaRouter2Manager.Callback p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    class Client extends android.media.IMediaRouter2Manager.Stub {
        Client(android.media.MediaRouter2Manager p0) { super(); }
        public void invalidateInstance() {}
        public void notifyDeviceSuggestionRequested() {}
        public void notifyDeviceSuggestionsUpdated(java.lang.String p0, java.lang.String p1, java.util.List<android.media.SuggestedDeviceInfo> p2) {}
        public void notifyDiscoveryPreferenceChanged(java.lang.String p0, android.media.RouteDiscoveryPreference p1) {}
        public void notifyRequestFailed(int p0, int p1) {}
        public void notifyRouteListingPreferenceChange(java.lang.String p0, android.media.RouteListingPreference p1) {}
        public void notifyRoutesUpdated(java.util.List<android.media.MediaRoute2Info> p0, java.util.List<java.lang.String> p1) {}
        public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) {}
        public void notifySessionReleased(android.media.RoutingSessionInfo p0) {}
        public void notifySessionUpdated(android.media.RoutingSessionInfo p0, boolean p1) {}
        public void notifySystemSessionOverridesChanged(java.util.List<android.media.AppId> p0) {}
    }

    static final class TransferRequest {
        public final android.media.RoutingSessionInfo mOldSessionInfo = null;
        public final int mRequestId = 0;
        public final android.media.MediaRoute2Info mTargetRoute = null;
        TransferRequest(int p0, android.media.RoutingSessionInfo p1, android.media.MediaRoute2Info p2) {}
    }
}
