package android.media;

public final class MediaRouter2 {
    private static final boolean DEBUG = Boolean.valueOf(false);
    static final int[] ROUTING_TYPES_REMOTE = null;
    public static final int SCANNING_STATE_NOT_SCANNING = 0;
    public static final int SCANNING_STATE_SCANNING_FULL = 2;
    public static final int SCANNING_STATE_WHILE_INTERACTIVE = 1;
    private static final java.lang.String TAG = "MR2";
    private static final int TRANSFER_TIMEOUT_MS = 30000;
    private static final java.util.Map<android.media.AppId, android.media.MediaRouter2> sAppToProxyRouterMap = null;
    private static android.media.MediaRouter2 sInstance;
    private static final java.lang.Object sRouterLock = null;
    private static android.media.IMediaRouterService sServiceInstrumentation;
    private static final java.util.function.Supplier<android.media.IMediaRouterService> sServiceSupplier = null;
    private static final java.lang.Object sSystemRouterLock = null;
    private final android.content.Context mContext = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter2.ControllerCallbackRecord> mControllerCallbackRecords = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter2.ControllerCreationRequest> mControllerCreationRequests = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter2.DeviceSuggestionsUpdatesCallbackRecord> mDeviceSuggestionsUpdatesCallbackRecords = null;
    private android.media.RouteDiscoveryPreference mDiscoveryPreference;
    private java.util.List<android.media.MediaRoute2Info> mFilteredRoutes;
    private final android.os.Handler mHandler = null;
    private final android.media.MediaRouter2.MediaRouter2Impl mImpl = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter2.RouteListingPreferenceCallbackRecord> mListingPreferenceCallbackRecords = null;
    private final java.lang.Object mLock = null;
    private final android.media.MediaRouter2.Logger mLog = null;
    private final android.media.IMediaRouterService mMediaRouterService = null;
    private final java.util.Set<java.lang.String> mMissingPermissions = null;
    private final java.util.concurrent.atomic.AtomicInteger mNextRequestId = null;
    private final java.util.Map<java.lang.String, android.media.MediaRouter2.RoutingController> mNonSystemRoutingControllers = null;
    private volatile android.media.MediaRouter2.OnGetControllerHintsListener mOnGetControllerHintsListener;
    private volatile android.util.ArrayMap<java.lang.String, android.media.MediaRoute2Info> mPreviousFilteredRoutes;
    private final java.util.Map<java.lang.String, android.media.MediaRoute2Info> mPreviousUnfilteredRoutes = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter2.RouteCallbackRecord> mRouteCallbackRecords = null;
    private android.media.RouteListingPreference mRouteListingPreference;
    private final java.util.Map<java.lang.String, android.media.MediaRoute2Info> mRoutes = null;
    private final android.util.SparseArray<android.media.MediaRouter2.ScanRequest> mScanRequestsMap = null;
    private int mStartScanActiveCount;
    private android.media.MediaRouter2.ScanToken mStartScanToken;
    private android.media.MediaRouter2.MediaRouter2Stub mStub;
    private final java.util.Map<java.lang.String, java.util.List<android.media.SuggestedDeviceInfo>> mSuggestedDeviceInfo = null;
    private final android.media.MediaRouter2.RoutingController mSystemController = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter2.TransferCallbackRecord> mTransferCallbackRecords = null;
    private MediaRouter2(android.content.Context p0) {}
    private MediaRouter2(android.content.Context p0, android.os.Looper p1, java.lang.String p2, android.os.UserHandle p3) {}
    private android.media.MediaRouter2.RoutingController addRoutingController(android.media.RoutingSessionInfo p0) { return null; }
    private static boolean checkCallerHasOnlyRevocablePermissions(android.content.Context p0) { return false; }
    private static android.media.RoutingSessionInfo ensureClientPackageNameForSystemSession(android.media.RoutingSessionInfo p0, java.lang.String p1) { return null; }
    private java.util.List<android.media.MediaRoute2Info> filterRoutesWithCompositePreferenceLocked(java.util.List<android.media.MediaRoute2Info> p0) { return null; }
    private static android.media.MediaRouter2 findOrCreateProxyInstanceForCallingUser(android.content.Context p0, java.lang.String p1, android.os.UserHandle p2, java.util.concurrent.Executor p3, java.lang.Runnable p4) { return null; }
    private android.media.MediaRouter2.RoutingController getCurrentController() { return null; }
    private java.util.Map<java.lang.String, java.util.List<android.media.SuggestedDeviceInfo>> getDeviceSuggestionsLocked() { return null; }
    public static android.media.MediaRouter2 getInstance(android.content.Context p0) { return null; }
    @android.annotation.SystemApi
    public static android.media.MediaRouter2 getInstance(android.content.Context p0, java.lang.String p1) { return null; }
    public static android.media.MediaRouter2 getInstance(android.content.Context p0, java.lang.String p1, android.os.UserHandle p2) { return null; }
    public static android.media.MediaRouter2 getInstance(android.content.Context p0, java.lang.String p1, java.util.concurrent.Executor p2, java.lang.Runnable p3) { return null; }
    private android.media.MediaRouter2.RoutingController getMatchingController(android.media.RoutingSessionInfo p0, java.lang.String p1) { return null; }
    private java.util.List<android.media.MediaRoute2Info> getRoutesWithIds(java.util.List<java.lang.String> p0) { return null; }
    private android.media.MediaRouter2.ScanningParams getScanningStateLocked(android.media.MediaRouter2.ScanToken p0, android.media.MediaRouter2.ScanRequest p1) { return null; }
    private java.util.List<android.media.MediaRoute2Info> getSortedRoutes(java.util.List<android.media.MediaRoute2Info> p0, java.util.List<java.lang.String> p1) { return null; }
    public static void instrument(android.media.IMediaRouterService p0) {}
    private void loadSystemRoutes(boolean p0) {}
    private void notifyCallbacksDeviceSuggestionRequested() {}
    private void notifyControllerUpdated(android.media.MediaRouter2.RoutingController p0, boolean p1) {}
    private void notifyDeviceSuggestionsUpdated(java.lang.String p0, java.util.List<android.media.SuggestedDeviceInfo> p1) {}
    private void notifyMissingPermissionsUpdated(java.util.Set<java.lang.String> p0) {}
    private void notifyPreferredFeaturesChanged(java.util.List<java.lang.String> p0) {}
    private void notifyRequestFailed(int p0) {}
    private void notifyRouteListingPreferenceUpdated(android.media.RouteListingPreference p0) {}
    private void notifyRoutesAdded(java.util.List<android.media.MediaRoute2Info> p0) {}
    private void notifyRoutesChanged(java.util.List<android.media.MediaRoute2Info> p0) {}
    private void notifyRoutesRemoved(java.util.List<android.media.MediaRoute2Info> p0) {}
    private void notifyRoutesUpdated(java.util.List<android.media.MediaRoute2Info> p0) {}
    private void notifyStop(android.media.MediaRouter2.RoutingController p0) {}
    private void notifyTransfer(android.media.MediaRouter2.RoutingController p0, android.media.MediaRouter2.RoutingController p1) {}
    private void notifyTransferFailure(android.media.MediaRoute2Info p0) {}
    public static void resetStateForTesting() {}
    private void updateDeviceSuggestions(java.lang.String p0, java.util.List<android.media.SuggestedDeviceInfo> p1, boolean p2) {}
    private boolean updateDiscoveryPreferenceIfNeededLocked() { return false; }
    public void cancelScanRequest(android.media.MediaRouter2.ScanToken p0) {}
    public void clearDeviceSuggestions() {}
    void createControllerOnHandler(int p0, android.media.RoutingSessionInfo p1) {}
    void dispatchControllerUpdatedIfNeededOnHandler(java.util.Map<java.lang.String, android.media.MediaRoute2Info> p0) {}
    void dispatchFilteredRoutesUpdatedOnHandler(java.util.List<android.media.MediaRoute2Info> p0) {}
    @android.annotation.SystemApi
    public java.util.List<android.media.MediaRoute2Info> getAllRoutes() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getClientPackageName() { return null; }
    public android.media.MediaRouter2.RoutingController getController(java.lang.String p0) { return null; }
    public java.util.List<android.media.MediaRouter2.RoutingController> getControllers() { return null; }
    public java.util.Map<java.lang.String, java.util.List<android.media.SuggestedDeviceInfo>> getDeviceSuggestions() { return null; }
    public java.util.Set<java.lang.String> getMissingPermissions() { return null; }
    public android.media.RouteListingPreference getRouteListingPreference() { return null; }
    public java.util.List<android.media.MediaRoute2Info> getRoutes() { return null; }
    public android.media.MediaRouter2.RoutingController getSystemController() { return null; }
    public java.util.Set<android.media.AppId> getSystemSessionOverridesAppIds() { return null; }
    public void notifyDeviceSuggestionRequested() {}
    void onRequestCreateControllerByManagerOnHandler(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1, long p2, android.media.RoutingChangeInfo p3) {}
    public void registerControllerCallback(java.util.concurrent.Executor p0, android.media.MediaRouter2.ControllerCallback p1) {}
    public void registerDeviceSuggestionsUpdatesCallback(java.util.concurrent.Executor p0, android.media.MediaRouter2.DeviceSuggestionsUpdatesCallback p1) {}
    public void registerRouteCallback(java.util.concurrent.Executor p0, android.media.MediaRouter2.RouteCallback p1, android.media.RouteDiscoveryPreference p2) {}
    public void registerRouteListingPreferenceUpdatedCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<android.media.RouteListingPreference> p1) {}
    public void registerSystemSessionOverridesListener(java.util.concurrent.Executor p0, android.media.MediaRouter2.SystemSessionOverridesListener p1) {}
    public void registerTransferCallback(java.util.concurrent.Executor p0, android.media.MediaRouter2.TransferCallback p1) {}
    void releaseControllerOnHandler(android.media.RoutingSessionInfo p0) {}
    void requestCreateController(android.media.MediaRouter2.RoutingController p0, android.media.MediaRoute2Info p1, long p2, android.media.RoutingChangeInfo p3) {}
    public android.media.MediaRouter2.ScanToken requestScan(android.media.MediaRouter2.ScanRequest p0) { return null; }
    public void setDeviceSuggestions(java.util.List<android.media.SuggestedDeviceInfo> p0) {}
    public void setOnGetControllerHintsListener(android.media.MediaRouter2.OnGetControllerHintsListener p0) {}
    public void setRouteListingPreference(android.media.RouteListingPreference p0) {}
    public void setRouteVolume(android.media.MediaRoute2Info p0, int p1) {}
    public boolean showSystemOutputSwitcher() { return false; }
    public boolean showSystemOutputSwitcher(android.media.session.MediaSession.Token p0) { return false; }
    @android.annotation.SystemApi
    public void startScan() {}
    public void stop() {}
    @android.annotation.SystemApi
    public void stopScan() {}
    void syncRoutesOnHandler(java.util.List<android.media.MediaRoute2Info> p0, android.media.RoutingSessionInfo p1) {}
    @android.annotation.SystemApi
    public void transfer(android.media.MediaRouter2.RoutingController p0, android.media.MediaRoute2Info p1) {}
    public void transfer(android.media.MediaRouter2.RoutingController p0, android.media.MediaRoute2Info p1, android.media.RoutingChangeInfo p2) {}
    public void transferTo(android.media.MediaRoute2Info p0) {}
    public void transferTo(android.media.MediaRoute2Info p0, android.media.RoutingChangeInfo p1) {}
    public void unregisterControllerCallback(android.media.MediaRouter2.ControllerCallback p0) {}
    public void unregisterDeviceSuggestionsUpdatesCallback(android.media.MediaRouter2.DeviceSuggestionsUpdatesCallback p0) {}
    public void unregisterRouteCallback(android.media.MediaRouter2.RouteCallback p0) {}
    public void unregisterRouteListingPreferenceUpdatedCallback(java.util.function.Consumer<android.media.RouteListingPreference> p0) {}
    public void unregisterSystemSessionOverridesListener(android.media.MediaRouter2.SystemSessionOverridesListener p0) {}
    public void unregisterTransferCallback(android.media.MediaRouter2.TransferCallback p0) {}
    void updateControllerOnHandler(android.media.RoutingSessionInfo p0) {}
    void updateFilteredRoutesLocked() {}
    void updateMissingPermissionsLocked(java.util.List<java.lang.String> p0) {}
    void updateRoutesOnHandler(java.util.List<android.media.MediaRoute2Info> p0, java.util.List<java.lang.String> p1) {}

    public static abstract class ControllerCallback {
        public ControllerCallback() {}
        public void onControllerUpdated(android.media.MediaRouter2.RoutingController p0) {}
        public void onControllerUpdated(android.media.MediaRouter2.RoutingController p0, boolean p1) {}
    }

    static final class ControllerCallbackRecord {
        public final android.media.MediaRouter2.ControllerCallback mCallback = null;
        public final java.util.concurrent.Executor mExecutor = null;
        ControllerCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.ControllerCallback p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    static final class ControllerCreationRequest {
        public final long mManagerRequestId = 0L;
        public final android.media.MediaRouter2.RoutingController mOldController = null;
        public final int mRequestId = 0;
        public final android.media.MediaRoute2Info mRoute = null;
        ControllerCreationRequest(int p0, long p1, android.media.MediaRoute2Info p2, android.media.MediaRouter2.RoutingController p3) {}
    }

    public static interface DeviceSuggestionsUpdatesCallback {
        public void onSuggestionsCleared(java.lang.String p0);
        public void onSuggestionsRequested();
        public void onSuggestionsUpdated(java.lang.String p0, java.util.List<android.media.SuggestedDeviceInfo> p1);
    }

    private static final class DeviceSuggestionsUpdatesCallbackRecord {
        public final android.media.MediaRouter2.DeviceSuggestionsUpdatesCallback mDeviceSuggestionsUpdatesCallback = null;
        public final java.util.concurrent.Executor mExecutor = null;
        DeviceSuggestionsUpdatesCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.DeviceSuggestionsUpdatesCallback p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static final class InstanceInvalidatedCallbackRecord {
        private final java.util.concurrent.Executor executor = null;
        private final java.lang.Runnable runnable = null;
        private InstanceInvalidatedCallbackRecord(java.util.concurrent.Executor p0, java.lang.Runnable p1) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public java.util.concurrent.Executor executor() { return null; }
        public final int hashCode() { return 0; }
        public java.lang.Runnable runnable() { return null; }
        public final java.lang.String toString() { return null; }
    }

    private class LocalMediaRouter2Impl implements android.media.MediaRouter2.MediaRouter2Impl {
        private final java.lang.String mPackageName = null;
        LocalMediaRouter2Impl(android.media.MediaRouter2 p0, java.lang.String p1) {}
        private boolean isValidActivityComponentName(android.content.ComponentName p0, java.lang.String p1) { return false; }
        private void registerRouterStubIfNeededLocked() throws android.os.RemoteException {}
        private void unregisterRouterStubIfNeededLocked(boolean p0) throws android.os.RemoteException {}
        private void validateRouteListingPreference(android.media.RouteListingPreference p0) {}
        private void verifyActivityComponentName(android.content.ComponentName p0, java.lang.String p1) {}
        public android.media.MediaRouter2.RouteCallbackRecord createRouteCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.RouteCallback p1, android.media.RouteDiscoveryPreference p2) { return null; }
        public void deselectRoute(android.media.MediaRoute2Info p0, android.media.RoutingSessionInfo p1, android.media.RoutingChangeInfo p2) {}
        public java.util.List<android.media.MediaRoute2Info> filterRoutesWithIndividualPreference(java.util.List<android.media.MediaRoute2Info> p0, android.media.RouteDiscoveryPreference p1) { return null; }
        public java.util.List<android.media.MediaRoute2Info> getAllRoutes() { return null; }
        public java.lang.String getClientPackageName() { return null; }
        public java.util.List<android.media.MediaRouter2.RoutingController> getControllers() { return null; }
        public java.util.Map<java.lang.String, java.util.List<android.media.SuggestedDeviceInfo>> getDeviceSuggestions() { return null; }
        public java.lang.String getPackageName() { return null; }
        public android.media.RoutingSessionInfo getSystemSessionInfo() { return null; }
        public java.util.Set<android.media.AppId> getSystemSessionOverridesAppIds() { return null; }
        public void notifyDeviceSuggestionRequested() {}
        public void registerRouteCallback() {}
        public void registerSystemSessionOverridesListener(java.util.concurrent.Executor p0, android.media.MediaRouter2.SystemSessionOverridesListener p1) {}
        public void releaseSession(boolean p0, boolean p1, android.media.MediaRouter2.RoutingController p2) {}
        public void selectRoute(android.media.MediaRoute2Info p0, android.media.RoutingSessionInfo p1, android.media.RoutingChangeInfo p2) {}
        public void setDeviceSuggestions(java.util.List<android.media.SuggestedDeviceInfo> p0) {}
        public void setOnGetControllerHintsListener(android.media.MediaRouter2.OnGetControllerHintsListener p0) {}
        public void setRouteListingPreference(android.media.RouteListingPreference p0) {}
        public void setRouteVolume(android.media.MediaRoute2Info p0, int p1) {}
        public void setSessionVolume(int p0, android.media.RoutingSessionInfo p1) {}
        public boolean showSystemOutputSwitcher(android.media.session.MediaSession.Token p0) { return false; }
        public void startScan() {}
        public void stop() {}
        public void stopScan() {}
        public void transfer(android.media.MediaRouter2.RoutingController p0, android.media.MediaRoute2Info p1, android.media.RoutingChangeInfo p2) {}
        public void transferTo(android.media.MediaRoute2Info p0, android.media.RoutingChangeInfo p1) {}
        public void unregisterRouteCallback() {}
        public void unregisterSystemSessionOverridesListener(android.media.MediaRouter2.SystemSessionOverridesListener p0) {}
        public void updateScanningState(int p0, java.util.Set<java.lang.Integer> p1) throws android.os.RemoteException {}
        public boolean wasTransferredBySelf(android.media.RoutingSessionInfo p0) { return false; }
    }

    private static class Logger {
        private final java.lang.String mPrefix = null;
        private Logger(java.lang.String p0) {}
        private void d(java.lang.String p0) {}
        private void e(java.lang.String p0) {}
        private void e(java.lang.String p0, java.lang.Throwable p1) {}
        private java.lang.String formatMessage(java.lang.String p0) { return null; }
        private void i(java.lang.String p0) {}
        private void v(java.lang.String p0) {}
        private void w(java.lang.String p0) {}
    }

    private static interface MediaRouter2Impl {
        public android.media.MediaRouter2.RouteCallbackRecord createRouteCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.RouteCallback p1, android.media.RouteDiscoveryPreference p2);
        public void deselectRoute(android.media.MediaRoute2Info p0, android.media.RoutingSessionInfo p1, android.media.RoutingChangeInfo p2);
        public java.util.List<android.media.MediaRoute2Info> filterRoutesWithIndividualPreference(java.util.List<android.media.MediaRoute2Info> p0, android.media.RouteDiscoveryPreference p1);
        public java.util.List<android.media.MediaRoute2Info> getAllRoutes();
        public java.lang.String getClientPackageName();
        public java.util.List<android.media.MediaRouter2.RoutingController> getControllers();
        public java.util.Map<java.lang.String, java.util.List<android.media.SuggestedDeviceInfo>> getDeviceSuggestions();
        public java.lang.String getPackageName();
        public android.media.RoutingSessionInfo getSystemSessionInfo();
        public java.util.Set<android.media.AppId> getSystemSessionOverridesAppIds();
        public void notifyDeviceSuggestionRequested();
        public void registerRouteCallback();
        public void registerSystemSessionOverridesListener(java.util.concurrent.Executor p0, android.media.MediaRouter2.SystemSessionOverridesListener p1);
        public void releaseSession(boolean p0, boolean p1, android.media.MediaRouter2.RoutingController p2);
        public void selectRoute(android.media.MediaRoute2Info p0, android.media.RoutingSessionInfo p1, android.media.RoutingChangeInfo p2);
        public void setDeviceSuggestions(java.util.List<android.media.SuggestedDeviceInfo> p0);
        public void setOnGetControllerHintsListener(android.media.MediaRouter2.OnGetControllerHintsListener p0);
        public void setRouteListingPreference(android.media.RouteListingPreference p0);
        public void setRouteVolume(android.media.MediaRoute2Info p0, int p1);
        public void setSessionVolume(int p0, android.media.RoutingSessionInfo p1);
        public boolean showSystemOutputSwitcher(android.media.session.MediaSession.Token p0);
        public void startScan();
        public void stop();
        public void stopScan();
        public void transfer(android.media.MediaRouter2.RoutingController p0, android.media.MediaRoute2Info p1, android.media.RoutingChangeInfo p2);
        public void transferTo(android.media.MediaRoute2Info p0, android.media.RoutingChangeInfo p1);
        public void unregisterRouteCallback();
        public void unregisterSystemSessionOverridesListener(android.media.MediaRouter2.SystemSessionOverridesListener p0);
        public void updateScanningState(int p0, java.util.Set<java.lang.Integer> p1) throws android.os.RemoteException;
        public boolean wasTransferredBySelf(android.media.RoutingSessionInfo p0);
    }

    class MediaRouter2Stub extends android.media.IMediaRouter2.Stub {
        MediaRouter2Stub(android.media.MediaRouter2 p0) { super(); }
        public void notifyDeviceSuggestionRequested() {}
        public void notifyDeviceSuggestionsUpdated(java.lang.String p0, java.util.List<android.media.SuggestedDeviceInfo> p1) {}
        public void notifyRouterRegistered(java.util.List<android.media.MediaRoute2Info> p0, android.media.RoutingSessionInfo p1) {}
        public void notifyRoutesUpdated(java.util.List<android.media.MediaRoute2Info> p0) {}
        public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) {}
        public void notifySessionInfoChanged(android.media.RoutingSessionInfo p0) {}
        public void notifySessionReleased(android.media.RoutingSessionInfo p0) {}
        public void requestCreateSessionByManager(long p0, android.media.RoutingSessionInfo p1, android.media.MediaRoute2Info p2, android.media.RoutingChangeInfo p3) {}
    }

    public static interface OnGetControllerHintsListener {
        public android.os.Bundle onGetControllerHints(android.media.MediaRoute2Info p0);
    }

    private class ProxyMediaRouter2Impl implements android.media.MediaRouter2.MediaRouter2Impl {
        private final android.media.IMediaRouter2Manager.Stub mClient = null;
        private final java.lang.String mClientPackageName = null;
        private final android.os.UserHandle mClientUser = null;
        private final java.util.List<android.media.MediaRouter2.InstanceInvalidatedCallbackRecord> mInstanceInvalidatedCallbackRecords = null;
        private final java.util.concurrent.atomic.AtomicBoolean mIsScanning = null;
        private java.util.Set<android.media.AppId> mLastSystemSessionSessionOverridesLocked;
        private final java.util.concurrent.atomic.AtomicInteger mScanRequestCount = null;
        private final java.util.concurrent.CopyOnWriteArraySet<android.media.MediaRouter2.SystemSessionOverridesListenerRecord> mSystemSessionOverridesListenerRecords = null;
        private final android.media.MediaRouter2.RequestTracker<android.media.MediaRouter2.ControllerCreationRequest> mTransferRequestTracker = null;
        private final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter2Manager.TransferRequest> mTransferRequests = null;
        ProxyMediaRouter2Impl(android.media.MediaRouter2 p0, android.content.Context p1, java.lang.String p2, android.os.UserHandle p3) {}
        private int createTransferRequest(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) { return 0; }
        private java.util.List<android.media.RoutingSessionInfo> getRoutingSessions() { return null; }
        static android.media.RoutingSessionInfo getSystemSessionInfoImpl(android.media.IMediaRouterService p0, java.lang.String p1, java.lang.String p2) { return null; }
        private void handleTransferTimeout(android.media.MediaRouter2Manager.TransferRequest p0) {}
        private void initSystemSessionOverridesSnapshot() throws android.os.RemoteException {}
        private boolean isSessionRelatedToTargetPackageName(android.media.RoutingSessionInfo p0) { return false; }
        private void notifyDeviceSuggestionRequestedHandler() {}
        private void notifySystemSessionOverridesChangedOnHandler(java.util.List<android.media.AppId> p0) {}
        private void onDeviceSuggestionsChangeHandler(java.lang.String p0, java.lang.String p1, java.util.List<android.media.SuggestedDeviceInfo> p2) {}
        private void onDiscoveryPreferenceChangedOnHandler(java.lang.String p0, android.media.RouteDiscoveryPreference p1) {}
        private void onInvalidateInstanceOnHandler() {}
        private void onRequestFailedOnHandler(int p0, int p1) {}
        private void onRouteListingPreferenceChangedOnHandler(java.lang.String p0, android.media.RouteListingPreference p1) {}
        private void onSessionCreatedOnHandler(int p0, android.media.RoutingSessionInfo p1) {}
        private void onSessionReleasedOnHandler(android.media.RoutingSessionInfo p0) {}
        private void onSessionUpdated(android.media.RoutingSessionInfo p0, boolean p1) {}
        private void onSessionUpdatedOnHandler(android.media.RoutingSessionInfo p0, boolean p1) {}
        private void onTransferFailed(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) {}
        private void onTransferred(android.media.RoutingSessionInfo p0, android.media.RoutingSessionInfo p1) {}
        private void releaseSession(android.media.RoutingSessionInfo p0) {}
        private void requestCreateSession(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1, android.media.RoutingChangeInfo p2) {}
        private void transferToRoute(android.media.MediaRouter2.RoutingController p0, android.media.MediaRoute2Info p1, android.os.UserHandle p2, java.lang.String p3, android.media.RoutingChangeInfo p4) {}
        public android.media.MediaRouter2.RouteCallbackRecord createRouteCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.RouteCallback p1, android.media.RouteDiscoveryPreference p2) { return null; }
        public void deselectRoute(android.media.MediaRoute2Info p0, android.media.RoutingSessionInfo p1, android.media.RoutingChangeInfo p2) {}
        public java.util.List<android.media.MediaRoute2Info> filterRoutesWithIndividualPreference(java.util.List<android.media.MediaRoute2Info> p0, android.media.RouteDiscoveryPreference p1) { return null; }
        public java.util.List<android.media.MediaRoute2Info> getAllRoutes() { return null; }
        public java.lang.String getClientPackageName() { return null; }
        public java.util.List<android.media.MediaRouter2.RoutingController> getControllers() { return null; }
        public java.util.Map<java.lang.String, java.util.List<android.media.SuggestedDeviceInfo>> getDeviceSuggestions() { return null; }
        public java.lang.String getPackageName() { return null; }
        public android.media.RoutingSessionInfo getSystemSessionInfo() { return null; }
        public java.util.Set<android.media.AppId> getSystemSessionOverridesAppIds() { return null; }
        public void notifyDeviceSuggestionRequested() {}
        public void registerInstanceInvalidatedCallback(java.util.concurrent.Executor p0, java.lang.Runnable p1) {}
        public void registerProxyRouter() {}
        public void registerRouteCallback() {}
        public void registerSystemSessionOverridesListener(java.util.concurrent.Executor p0, android.media.MediaRouter2.SystemSessionOverridesListener p1) {}
        public void releaseSession(boolean p0, boolean p1, android.media.MediaRouter2.RoutingController p2) {}
        public void selectRoute(android.media.MediaRoute2Info p0, android.media.RoutingSessionInfo p1, android.media.RoutingChangeInfo p2) {}
        public void setDeviceSuggestions(java.util.List<android.media.SuggestedDeviceInfo> p0) {}
        public void setOnGetControllerHintsListener(android.media.MediaRouter2.OnGetControllerHintsListener p0) {}
        public void setRouteListingPreference(android.media.RouteListingPreference p0) {}
        public void setRouteVolume(android.media.MediaRoute2Info p0, int p1) {}
        public void setSessionVolume(int p0, android.media.RoutingSessionInfo p1) {}
        public boolean showSystemOutputSwitcher(android.media.session.MediaSession.Token p0) { return false; }
        public void startScan() {}
        public void stop() {}
        public void stopScan() {}
        public void transfer(android.media.MediaRouter2.RoutingController p0, android.media.MediaRoute2Info p1, android.media.RoutingChangeInfo p2) {}
        public void transferTo(android.media.MediaRoute2Info p0, android.media.RoutingChangeInfo p1) {}
        public void unregisterRouteCallback() {}
        public void unregisterSystemSessionOverridesListener(android.media.MediaRouter2.SystemSessionOverridesListener p0) {}
        public void updateScanningState(int p0, java.util.Set<java.lang.Integer> p1) throws android.os.RemoteException {}
        public boolean wasTransferredBySelf(android.media.RoutingSessionInfo p0) { return false; }

        private class Client extends android.media.IMediaRouter2Manager.Stub {
            private Client(android.media.MediaRouter2.ProxyMediaRouter2Impl p0) { super(); }
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

        private class TransferRequestTrackerCallback extends android.media.MediaRouter2.RequestTracker.Callback<android.media.MediaRouter2.ControllerCreationRequest> {
            private TransferRequestTrackerCallback(android.media.MediaRouter2.ProxyMediaRouter2Impl p0) { super(); }
            public void onRequestCompleted(android.media.MediaRouter2.ControllerCreationRequest p0) {}
            public void onRequestTimeout(android.media.MediaRouter2.ControllerCreationRequest p0) {}
        }
    }

    private static class RequestTracker<T extends java.lang.Object> {
        private final android.media.MediaRouter2.RequestTracker.Callback<T> mCallback = null;
        private final android.os.Handler mHandler = null;
        private T mRequest;
        private java.lang.Runnable mRequestTimeoutRunnable;
        private final int mTimeoutMs = 0;
        RequestTracker(int p0, android.os.Handler p1, android.media.MediaRouter2.RequestTracker.Callback p2) {}
        private void cancelRequestTimeout() {}
        private void onTimeout() {}
        void complete() {}
        void track(T p0) {}

        private static class Callback<T extends java.lang.Object> {
            private Callback() {}
            void onRequestCompleted(T p0) {}
            void onRequestTimeout(T p0) {}
        }
    }

    public static abstract class RouteCallback {
        public RouteCallback() {}
        public void onMissingPermissionsUpdated(java.util.Set<java.lang.String> p0) {}
        @android.annotation.SystemApi
        public void onPreferredFeaturesChanged(java.util.List<java.lang.String> p0) {}
        @java.lang.Deprecated
        public void onRoutesAdded(java.util.List<android.media.MediaRoute2Info> p0) {}
        @java.lang.Deprecated
        public void onRoutesChanged(java.util.List<android.media.MediaRoute2Info> p0) {}
        @java.lang.Deprecated
        public void onRoutesRemoved(java.util.List<android.media.MediaRoute2Info> p0) {}
        public void onRoutesUpdated(java.util.List<android.media.MediaRoute2Info> p0) {}
    }

    static final class RouteCallbackRecord {
        public final java.util.concurrent.Executor mExecutor = null;
        public final android.media.RouteDiscoveryPreference mPreference = null;
        public final android.media.MediaRouter2.RouteCallback mRouteCallback = null;
        RouteCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.RouteCallback p1, android.media.RouteDiscoveryPreference p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static final class RouteListingPreferenceCallbackRecord {
        public final java.util.concurrent.Executor mExecutor = null;
        public final java.util.function.Consumer<android.media.RouteListingPreference> mRouteListingPreferenceCallback = null;
        RouteListingPreferenceCallbackRecord(java.util.concurrent.Executor p0, java.util.function.Consumer<android.media.RouteListingPreference> p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public class RoutingController {
        private static final int CONTROLLER_STATE_ACTIVE = 1;
        private static final int CONTROLLER_STATE_RELEASED = 3;
        private static final int CONTROLLER_STATE_RELEASING = 2;
        private static final int CONTROLLER_STATE_UNKNOWN = 0;
        private final java.lang.Object mControllerLock = null;
        private android.media.RoutingSessionInfo mSessionInfo;
        private int mState;
        RoutingController(android.media.MediaRouter2 p0, android.media.RoutingSessionInfo p1) {}
        RoutingController(android.media.MediaRouter2 p0, android.media.RoutingSessionInfo p1, int p2) {}
        private static boolean containsRouteInfoWithId(java.util.List<android.media.MediaRoute2Info> p0, java.lang.String p1) { return false; }
        public void deselectRoute(android.media.MediaRoute2Info p0) {}
        public void deselectRoute(android.media.MediaRoute2Info p0, android.media.RoutingChangeInfo p1) {}
        public android.os.Bundle getControlHints() { return null; }
        public java.util.List<android.media.MediaRoute2Info> getDeselectableRoutes() { return null; }
        public java.lang.String getId() { return null; }
        public java.lang.String getOriginalId() { return null; }
        public android.media.RoutingSessionInfo getRoutingSessionInfo() { return null; }
        public java.util.List<android.media.MediaRoute2Info> getSelectableRoutes() { return null; }
        public java.util.List<android.media.MediaRoute2Info> getSelectedRoutes() { return null; }
        public java.util.List<android.media.MediaRoute2Info> getTransferableRoutes() { return null; }
        public int getVolume() { return 0; }
        public int getVolumeHandling() { return 0; }
        public int getVolumeMax() { return 0; }
        public boolean isReleased() { return false; }
        public void release() {}
        void releaseInternal(boolean p0) {}
        boolean scheduleRelease() { return false; }
        public void selectRoute(android.media.MediaRoute2Info p0) {}
        public void selectRoute(android.media.MediaRoute2Info p0, android.media.RoutingChangeInfo p1) {}
        void setRoutingSessionInfo(android.media.RoutingSessionInfo p0) {}
        public void setVolume(int p0) {}
        public java.lang.String toString() { return null; }
        boolean tryTransferWithinProvider(android.media.MediaRoute2Info p0, android.media.RoutingChangeInfo p1) { return false; }
        public boolean wasTransferInitiatedBySelf() { return false; }
    }

    private static final class ScanningParams {
        private final java.util.Set<java.lang.Integer> routingTypes = null;
        private final int scanningState = 0;
        private ScanningParams(int p0, java.util.Set<java.lang.Integer> p1) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public java.util.Set<java.lang.Integer> routingTypes() { return null; }
        public int scanningState() { return 0; }
        public final java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScanningState {
    }

    public static final class ScanRequest {
        private final boolean mIsScreenOffScan = false;
        private final java.util.Set<java.lang.Integer> mRoutingTypes = null;
        private ScanRequest(boolean p0, java.util.Set<java.lang.Integer> p1) {}
        public java.util.Set<java.lang.Integer> getRoutingTypes() { return null; }
        public boolean isScreenOffScan() { return false; }

        public static final class Builder {
            private boolean mIsScreenOffScan;
            private java.util.Set<java.lang.Integer> mRoutingTypes;
            public Builder() {}
            public android.media.MediaRouter2.ScanRequest.Builder addRoutingType(int p0) { return null; }
            public android.media.MediaRouter2.ScanRequest build() { return null; }
            public android.media.MediaRouter2.ScanRequest.Builder setRoutingTypes(java.util.Set<java.lang.Integer> p0) { return null; }
            public android.media.MediaRouter2.ScanRequest.Builder setScreenOffScan(boolean p0) { return null; }
        }
    }

    public static final class ScanToken {
        private final int mId = 0;
        private ScanToken(int p0) {}
    }

    class SystemRoutingController extends android.media.MediaRouter2.RoutingController {
        SystemRoutingController(android.media.MediaRouter2 p0, android.media.RoutingSessionInfo p1) { super((android.media.MediaRouter2)null, (android.media.RoutingSessionInfo)null); }
        public boolean isReleased() { return false; }
        void releaseInternal(boolean p0) {}
        boolean scheduleRelease() { return false; }
    }

    public static interface SystemSessionOverridesListener {
        public void onSystemSessionOverridesChanged(java.util.Set<android.media.AppId> p0);
    }

    private static final class SystemSessionOverridesListenerRecord {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.media.MediaRouter2.SystemSessionOverridesListener mSystemSessionOverridesListener = null;
        private SystemSessionOverridesListenerRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.SystemSessionOverridesListener p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.util.concurrent.Executor mExecutor() { return null; }
        public android.media.MediaRouter2.SystemSessionOverridesListener mSystemSessionOverridesListener() { return null; }
        public final java.lang.String toString() { return null; }
    }

    public static abstract class TransferCallback {
        public TransferCallback() {}
        public void onRequestFailed(int p0) {}
        public void onStop(android.media.MediaRouter2.RoutingController p0) {}
        public void onTransfer(android.media.MediaRouter2.RoutingController p0, android.media.MediaRouter2.RoutingController p1) {}
        public void onTransferFailure(android.media.MediaRoute2Info p0) {}
    }

    static final class TransferCallbackRecord {
        public final java.util.concurrent.Executor mExecutor = null;
        public final android.media.MediaRouter2.TransferCallback mTransferCallback = null;
        TransferCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.TransferCallback p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
