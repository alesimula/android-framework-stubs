package android.media;

public abstract class MediaRoute2ProviderService extends android.app.Service {
    public static final java.lang.String CATEGORY_SELF_SCAN_ONLY = "android.media.MediaRoute2ProviderService.SELF_SCAN_ONLY";
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final int MAX_REQUEST_IDS_SIZE = 500;
    public static final int REASON_FAILED_TO_REROUTE_SYSTEM_MEDIA = 6;
    public static final int REASON_INVALID_COMMAND = 4;
    public static final int REASON_NETWORK_ERROR = 2;
    public static final int REASON_REJECTED = 1;
    public static final int REASON_ROUTE_NOT_AVAILABLE = 3;
    public static final int REASON_UNIMPLEMENTED = 5;
    public static final int REASON_UNKNOWN_ERROR = 0;
    public static final long REQUEST_ID_NONE = 0L;
    public static final java.lang.String SERVICE_INTERFACE = "android.media.MediaRoute2ProviderService";
    private static final java.lang.String TAG = "MR2ProviderService";
    private final android.os.Handler mHandler = null;
    private volatile android.media.MediaRoute2ProviderInfo mProviderInfo;
    private android.media.IMediaRoute2ProviderServiceCallback mRemoteCallback;
    private final java.util.Deque<java.lang.Long> mRequestIds = null;
    private final java.lang.Object mRequestIdsLock = null;
    private final android.util.ArrayMap<java.lang.String, android.media.RoutingSessionInfo> mSessionInfos = null;
    private final java.lang.Object mSessionLock = null;
    private final java.util.concurrent.atomic.AtomicBoolean mSessionUpdateScheduled = null;
    private final java.util.concurrent.atomic.AtomicBoolean mStatePublishScheduled = null;
    private android.media.MediaRoute2ProviderService.MediaRoute2ProviderServiceStub mStub;
    public MediaRoute2ProviderService() { super(); }
    private void addRequestId(long p0) {}
    private void publishState() {}
    private boolean removeRequestId(long p0) { return false; }
    private void updateSessions() {}
    public final java.util.List<android.media.RoutingSessionInfo> getAllSessionInfo() { return null; }
    public final android.media.RoutingSessionInfo getSessionInfo(java.lang.String p0) { return null; }
    public final void notifyRequestFailed(long p0, int p1) {}
    public final void notifyRoutes(java.util.Collection<android.media.MediaRoute2Info> p0) {}
    public final void notifySessionCreated(long p0, android.media.RoutingSessionInfo p1) {}
    public final void notifySessionReleased(java.lang.String p0) {}
    public final void notifySessionUpdated(android.media.RoutingSessionInfo p0) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onCreateSession(long p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3);
    public void onCreateSession(android.media.MediaRoute2ProviderService.SessionCreationParams p0) {}
    public abstract void onDeselectRoute(long p0, java.lang.String p1, java.lang.String p2);
    public void onDiscoveryPreferenceChanged(android.media.RouteDiscoveryPreference p0) {}
    public void onDiscoveryPreferenceChanged(android.media.RouteDiscoveryPreference p0, java.util.Map<java.lang.String, android.media.RouteDiscoveryPreference> p1) {}
    public abstract void onReleaseSession(long p0, java.lang.String p1);
    public abstract void onSelectRoute(long p0, java.lang.String p1, java.lang.String p2);
    public abstract void onSetRouteVolume(long p0, java.lang.String p1, int p2);
    public abstract void onSetSessionVolume(long p0, java.lang.String p1, int p2);
    public abstract void onTransferToRoute(long p0, java.lang.String p1, java.lang.String p2);
    void schedulePublishState() {}
    void scheduleUpdateSessions() {}
    void setCallback(android.media.IMediaRoute2ProviderServiceCallback p0) {}

    final class MediaRoute2ProviderServiceStub extends android.media.IMediaRoute2ProviderService.Stub {
        MediaRoute2ProviderServiceStub(android.media.MediaRoute2ProviderService p0) { super(); }
        private boolean checkCallerIsSystem() { return false; }
        private boolean checkRouteIdIsValid(java.lang.String p0, java.lang.String p1) { return false; }
        private boolean checkSessionIdIsValid(java.lang.String p0, java.lang.String p1) { return false; }
        public void deselectRoute(long p0, java.lang.String p1, java.lang.String p2) {}
        public void releaseSession(long p0, java.lang.String p1, boolean p2) {}
        public void requestCreateSession(long p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) {}
        public void selectRoute(long p0, java.lang.String p1, java.lang.String p2) {}
        public void setCallback(android.media.IMediaRoute2ProviderServiceCallback p0) {}
        public void setRouteVolume(long p0, java.lang.String p1, int p2) {}
        public void setSessionVolume(long p0, java.lang.String p1, int p2) {}
        public void transferToRoute(long p0, java.lang.String p1, java.lang.String p2) {}
        public void updateDiscoveryPreference(android.media.RouteDiscoveryPreference p0, java.util.Map<java.lang.String, android.media.RouteDiscoveryPreference> p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Reason {
    }

    public static final class SessionCreationParams {
        private final java.lang.String mInitialRouteId = null;
        private final long mRequestId = 0L;
        private final android.os.Bundle mSessionHints = null;
        private final java.lang.String mTargetPackageName = null;
        private SessionCreationParams(long p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) {}
        public java.lang.String getInitiallySelectedRouteId() { return null; }
        public long getRequestId() { return 0L; }
        public android.os.Bundle getSessionHints() { return null; }
        public java.lang.String getTargetPackageName() { return null; }

        public static final class Builder {
            private final java.lang.String mInitialRouteId = null;
            private final long mRequestId = 0L;
            private android.os.Bundle mSessionHints;
            private final java.lang.String mTargetPackageName = null;
            public Builder(long p0, java.lang.String p1, java.lang.String p2) {}
            public android.media.MediaRoute2ProviderService.SessionCreationParams build() { return null; }
            public android.media.MediaRoute2ProviderService.SessionCreationParams.Builder setSessionHints(android.os.Bundle p0) { return null; }
        }
    }
}
