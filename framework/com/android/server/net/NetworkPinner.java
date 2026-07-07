package com.android.server.net;

public class NetworkPinner {
    private static final java.lang.String TAG = null;
    private static com.android.server.net.NetworkPinner.Callback sCallback;
    protected static final java.lang.Object sLock = null;
    public NetworkPinner() {}
    private static void maybeInitConnectivityManager(android.content.Context p0) {}
    public static void pin(android.content.Context p0, android.net.NetworkRequest p1) {}
    public static void unpin() {}

    private static class Callback {
        private Callback() {}
        public void onAvailable(android.net.Network p0) {}
        public void onLost(android.net.Network p0) {}
    }
}
