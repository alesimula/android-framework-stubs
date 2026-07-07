package android.hardware.location;

@android.annotation.SystemApi
public final class ContextHubManager {
    public static final int AUTHORIZATION_DENIED = 0;
    public static final int AUTHORIZATION_DENIED_GRACE_PERIOD = 1;
    public static final int AUTHORIZATION_GRANTED = 2;
    public static final int EVENT_CLIENT_AUTHORIZATION = 7;
    public static final int EVENT_HUB_RESET = 6;
    public static final int EVENT_NANOAPP_ABORTED = 4;
    public static final int EVENT_NANOAPP_DISABLED = 3;
    public static final int EVENT_NANOAPP_ENABLED = 2;
    public static final int EVENT_NANOAPP_LOADED = 0;
    public static final int EVENT_NANOAPP_MESSAGE = 5;
    public static final int EVENT_NANOAPP_UNLOADED = 1;
    public static final java.lang.String EXTRA_CLIENT_AUTHORIZATION_STATE = "android.hardware.location.extra.CLIENT_AUTHORIZATION_STATE";
    public static final java.lang.String EXTRA_CONTEXT_HUB_INFO = "android.hardware.location.extra.CONTEXT_HUB_INFO";
    public static final java.lang.String EXTRA_EVENT_TYPE = "android.hardware.location.extra.EVENT_TYPE";
    public static final java.lang.String EXTRA_MESSAGE = "android.hardware.location.extra.MESSAGE";
    public static final java.lang.String EXTRA_NANOAPP_ABORT_CODE = "android.hardware.location.extra.NANOAPP_ABORT_CODE";
    public static final java.lang.String EXTRA_NANOAPP_ID = "android.hardware.location.extra.NANOAPP_ID";
    private static final java.lang.String TAG = "ContextHubManager";
    private android.hardware.location.ContextHubManager.Callback mCallback;
    private android.os.Handler mCallbackHandler;
    private final android.hardware.location.IContextHubCallback.Stub mClientCallback = null;
    private java.util.Map<android.hardware.contexthub.HubEndpointDiscoveryCallback, android.hardware.contexthub.IContextHubEndpointDiscoveryCallback> mDiscoveryCallbacks;
    @java.lang.Deprecated
    private android.hardware.location.ContextHubManager.ICallback mLocalCallback;
    private final android.os.Looper mMainLooper = null;
    private final android.hardware.location.IContextHubService mService = null;
    public ContextHubManager(android.hardware.location.IContextHubService p0, android.os.Looper p1) {}
    private android.hardware.location.IContextHubClientCallback createClientCallback(android.hardware.location.ContextHubClient p0, android.hardware.location.ContextHubClientCallback p1, java.util.concurrent.Executor p2) { return null; }
    private android.hardware.contexthub.IContextHubEndpointDiscoveryCallback createDiscoveryCallback(android.hardware.location.IContextHubService p0, java.util.concurrent.Executor p1, android.hardware.contexthub.HubEndpointDiscoveryCallback p2, java.lang.String p3) { return null; }
    private android.hardware.location.IContextHubTransactionCallback createQueryCallback(android.hardware.location.ContextHubTransaction<java.util.List<android.hardware.location.NanoAppState>> p0) { return null; }
    private java.util.List<android.hardware.contexthub.HubDiscoveryInfo> getMatchingEndpointDiscoveryList(android.hardware.contexthub.HubEndpointInfo[] p0, java.lang.String p1) { return null; }
    private void invokeOnMessageReceiptCallback(int p0, int p1, android.hardware.location.ContextHubMessage p2) {}
    public android.hardware.location.ContextHubClient createClient(android.content.Context p0, android.hardware.location.ContextHubInfo p1, android.app.PendingIntent p2, long p3) { return null; }
    public android.hardware.location.ContextHubClient createClient(android.content.Context p0, android.hardware.location.ContextHubInfo p1, java.util.concurrent.Executor p2, android.hardware.location.ContextHubClientCallback p3) { return null; }
    public android.hardware.location.ContextHubClient createClient(android.hardware.location.ContextHubInfo p0, android.app.PendingIntent p1, long p2) { return null; }
    public android.hardware.location.ContextHubClient createClient(android.hardware.location.ContextHubInfo p0, android.hardware.location.ContextHubClientCallback p1) { return null; }
    public android.hardware.location.ContextHubClient createClient(android.hardware.location.ContextHubInfo p0, android.hardware.location.ContextHubClientCallback p1, java.util.concurrent.Executor p2) { return null; }
    public android.hardware.location.ContextHubTransaction<java.lang.Void> disableNanoApp(android.hardware.location.ContextHubInfo p0, long p1) { return null; }
    public boolean disableTestMode() { return false; }
    public android.hardware.location.ContextHubTransaction<java.lang.Void> enableNanoApp(android.hardware.location.ContextHubInfo p0, long p1) { return null; }
    public boolean enableTestMode() { return false; }
    public java.util.List<android.hardware.contexthub.HubDiscoveryInfo> findEndpoints(long p0) { return null; }
    public java.util.List<android.hardware.contexthub.HubDiscoveryInfo> findEndpoints(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public int[] findNanoAppOnHub(int p0, android.hardware.location.NanoAppFilter p1) { return null; }
    @java.lang.Deprecated
    public int[] getContextHubHandles() { return null; }
    @java.lang.Deprecated
    public android.hardware.location.ContextHubInfo getContextHubInfo(int p0) { return null; }
    public java.util.List<android.hardware.location.ContextHubInfo> getContextHubs() { return null; }
    public java.util.List<android.hardware.location.HubInfo> getHubs() { return null; }
    @java.lang.Deprecated
    public android.hardware.location.NanoAppInstanceInfo getNanoAppInstanceInfo(int p0) { return null; }
    public long[] getPreloadedNanoAppIds(android.hardware.location.ContextHubInfo p0) { return null; }
    @java.lang.Deprecated
    public int loadNanoApp(int p0, android.hardware.location.NanoApp p1) { return 0; }
    public android.hardware.location.ContextHubTransaction<java.lang.Void> loadNanoApp(android.hardware.location.ContextHubInfo p0, android.hardware.location.NanoAppBinary p1) { return null; }
    public void openSession(android.hardware.contexthub.HubEndpoint p0, android.hardware.contexthub.HubEndpointInfo p1) {}
    public void openSession(android.hardware.contexthub.HubEndpoint p0, android.hardware.contexthub.HubEndpointInfo p1, java.lang.String p2) {}
    public android.hardware.location.ContextHubTransaction<java.util.List<android.hardware.location.NanoAppState>> queryNanoApps(android.hardware.location.ContextHubInfo p0) { return null; }
    @java.lang.Deprecated
    public int registerCallback(android.hardware.location.ContextHubManager.Callback p0) { return 0; }
    @java.lang.Deprecated
    public int registerCallback(android.hardware.location.ContextHubManager.Callback p0, android.os.Handler p1) { return 0; }
    @java.lang.Deprecated
    public int registerCallback(android.hardware.location.ContextHubManager.ICallback p0) { return 0; }
    public void registerEndpoint(android.hardware.contexthub.HubEndpoint p0) {}
    public void registerEndpointDiscoveryCallback(android.hardware.contexthub.HubEndpointDiscoveryCallback p0, long p1) {}
    public void registerEndpointDiscoveryCallback(android.hardware.contexthub.HubEndpointDiscoveryCallback p0, java.lang.String p1) {}
    public void registerEndpointDiscoveryCallback(java.util.concurrent.Executor p0, android.hardware.contexthub.HubEndpointDiscoveryCallback p1, long p2) {}
    public void registerEndpointDiscoveryCallback(java.util.concurrent.Executor p0, android.hardware.contexthub.HubEndpointDiscoveryCallback p1, java.lang.String p2) {}
    @java.lang.Deprecated
    public int sendMessage(int p0, int p1, android.hardware.location.ContextHubMessage p2) { return 0; }
    @java.lang.Deprecated
    public int unloadNanoApp(int p0) { return 0; }
    public android.hardware.location.ContextHubTransaction<java.lang.Void> unloadNanoApp(android.hardware.location.ContextHubInfo p0, long p1) { return null; }
    @java.lang.Deprecated
    public int unregisterCallback(android.hardware.location.ContextHubManager.Callback p0) { return 0; }
    @java.lang.Deprecated
    public int unregisterCallback(android.hardware.location.ContextHubManager.ICallback p0) { return 0; }
    public void unregisterEndpoint(android.hardware.contexthub.HubEndpoint p0) {}
    public void unregisterEndpointDiscoveryCallback(android.hardware.contexthub.HubEndpointDiscoveryCallback p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AuthorizationState {
    }

    @java.lang.Deprecated
    public static abstract class Callback {
        protected Callback() {}
        public abstract void onMessageReceipt(int p0, int p1, android.hardware.location.ContextHubMessage p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Event {
    }

    @java.lang.Deprecated
    public static interface ICallback {
        public void onMessageReceipt(int p0, int p1, android.hardware.location.ContextHubMessage p2);
    }
}
