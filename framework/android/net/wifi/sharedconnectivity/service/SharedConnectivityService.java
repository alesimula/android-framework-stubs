package android.net.wifi.sharedconnectivity.service;

@android.annotation.SystemApi
public abstract class SharedConnectivityService extends android.app.Service {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = null;
    private java.util.concurrent.CountDownLatch mCountDownLatch;
    private android.os.Handler mHandler;
    private android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus mHotspotNetworkConnectionStatus;
    private java.util.List<android.net.wifi.sharedconnectivity.app.HotspotNetwork> mHotspotNetworks;
    private android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus mKnownNetworkConnectionStatus;
    private java.util.List<android.net.wifi.sharedconnectivity.app.KnownNetwork> mKnownNetworks;
    private final android.os.RemoteCallbackList<android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback> mRemoteCallbackList = null;
    private android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState mSettingsState;
    public SharedConnectivityService() { super(); }
    public static boolean areHotspotNetworksEnabledForService(android.content.Context p0) { return false; }
    public static boolean areKnownNetworksEnabledForService(android.content.Context p0) { return false; }
    private void onRegisterCallback(android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback p0) {}
    private void onUnregisterCallback(android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback p0) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onBind() {}
    public abstract void onConnectHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0);
    public abstract void onConnectKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0);
    public abstract void onDisconnectHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0);
    public abstract void onForgetKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0);
    public final void setCountdownLatch(java.util.concurrent.CountDownLatch p0) {}
    public final void setHotspotNetworks(java.util.List<android.net.wifi.sharedconnectivity.app.HotspotNetwork> p0) {}
    public final void setKnownNetworks(java.util.List<android.net.wifi.sharedconnectivity.app.KnownNetwork> p0) {}
    public final void setSettingsState(android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState p0) {}
    public final void updateHotspotNetworkConnectionStatus(android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus p0) {}
    public final void updateKnownNetworkConnectionStatus(android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus p0) {}
}
