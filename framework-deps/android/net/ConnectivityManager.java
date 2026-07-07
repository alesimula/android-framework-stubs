package android.net;

public class ConnectivityManager {
    public ConnectivityManager() {}
    public void onEarlyInit() {}
    public android.net.ProxyInfo getDefaultProxy() { return null; }
    public android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network p0) { return null; }
    public android.net.Network getActiveNetwork() { return null; }
    public android.net.NetworkInfo getNetworkInfo(android.net.Network p0) { return null; }
    public android.net.Network getBoundNetworkForProcess() { return null; }
    public boolean bindProcessToNetwork(android.net.Network p0) { return false; }
    public void registerNetworkCallback(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1) {}
    public void unregisterNetworkCallback(android.net.ConnectivityManager.NetworkCallback p0) {}

    public static class NetworkCallback {
        public NetworkCallback() {}
    }
}
