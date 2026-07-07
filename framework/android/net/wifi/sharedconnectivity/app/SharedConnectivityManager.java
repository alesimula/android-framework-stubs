package android.net.wifi.sharedconnectivity.app;

@android.annotation.SystemApi
public class SharedConnectivityManager {
    private static final boolean DEBUG = false;
    private static final long RECOVER_DELAYED_TIME_IN_MS = 10000L;
    private static final int RECOVER_MAXIMUM_RETRY_COUNT = 10;
    private static final java.lang.String TAG = null;
    private android.os.Handler mBackgroundHandler;
    private final android.content.BroadcastReceiver mBroadcastReceiver = null;
    private final java.util.Map<android.net.wifi.sharedconnectivity.app.SharedConnectivityClientCallback, android.net.wifi.sharedconnectivity.app.SharedConnectivityManager.SharedConnectivityCallbackProxy> mCallbackProxyCache = null;
    private final android.content.Context mContext = null;
    private long mDelayedTimeInMs;
    private android.os.HandlerThread mHandlerThread;
    private final java.lang.String mIntentAction = null;
    private android.os.Handler mMainHandler;
    private final java.lang.Object mProxyDataLock = null;
    private final java.util.Map<android.net.wifi.sharedconnectivity.app.SharedConnectivityClientCallback, android.net.wifi.sharedconnectivity.app.SharedConnectivityManager.SharedConnectivityCallbackProxy> mProxyMap = null;
    private int mRetryCredit;
    private android.net.wifi.sharedconnectivity.service.ISharedConnectivityService mService;
    private android.content.ServiceConnection mServiceConnection;
    private final java.lang.String mServicePackageName = null;
    private android.os.UserManager mUserManager;
    private SharedConnectivityManager(android.content.Context p0, java.lang.String p1, java.lang.String p2) {}
    private void bind() {}
    private void checkPermissions() {}
    public static android.net.wifi.sharedconnectivity.app.SharedConnectivityManager create(android.content.Context p0) { return null; }
    public static android.net.wifi.sharedconnectivity.app.SharedConnectivityManager create(android.content.Context p0, java.lang.String p1, java.lang.String p2) { return null; }
    private boolean isCallbackRegistered(android.net.wifi.sharedconnectivity.app.SharedConnectivityClientCallback p0) { return false; }
    private void registerCallbackInternal(android.net.wifi.sharedconnectivity.app.SharedConnectivityClientCallback p0, android.net.wifi.sharedconnectivity.app.SharedConnectivityManager.SharedConnectivityCallbackProxy p1) {}
    private void scheduleConnect() {}
    private void unbind() {}
    public boolean connectHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0) { return false; }
    public boolean connectKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0) { return false; }
    public boolean disconnectHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0) { return false; }
    public boolean forgetKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0) { return false; }
    public android.os.Handler getBackgroundHandler() { return null; }
    public android.content.BroadcastReceiver getBroadcastReceiver() { return null; }
    public android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus getHotspotNetworkConnectionStatus() { return null; }
    public java.util.List<android.net.wifi.sharedconnectivity.app.HotspotNetwork> getHotspotNetworks() { return null; }
    public android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus getKnownNetworkConnectionStatus() { return null; }
    public java.util.List<android.net.wifi.sharedconnectivity.app.KnownNetwork> getKnownNetworks() { return null; }
    public android.content.ServiceConnection getServiceConnection() { return null; }
    public android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState getSettingsState() { return null; }
    public void registerCallback(java.util.concurrent.Executor p0, android.net.wifi.sharedconnectivity.app.SharedConnectivityClientCallback p1) {}
    public void setService(android.os.IInterface p0) {}
    public boolean unregisterCallback(android.net.wifi.sharedconnectivity.app.SharedConnectivityClientCallback p0) { return false; }

    private static final class SharedConnectivityCallbackProxy extends android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback.Stub {
        private final android.net.wifi.sharedconnectivity.app.SharedConnectivityClientCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        SharedConnectivityCallbackProxy(java.util.concurrent.Executor p0, android.net.wifi.sharedconnectivity.app.SharedConnectivityClientCallback p1) { super(); }
        public void onHotspotNetworkConnectionStatusChanged(android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus p0) {}
        public void onHotspotNetworksUpdated(java.util.List<android.net.wifi.sharedconnectivity.app.HotspotNetwork> p0) {}
        public void onKnownNetworkConnectionStatusChanged(android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus p0) {}
        public void onKnownNetworksUpdated(java.util.List<android.net.wifi.sharedconnectivity.app.KnownNetwork> p0) {}
        public void onServiceConnected() {}
        public void onServiceDisconnected() {}
        public void onSharedConnectivitySettingsChanged(android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState p0) {}
    }
}
