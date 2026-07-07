package com.android.server.net;

public class NetlinkTracker extends com.android.server.net.BaseNetworkObserver {
    private static final boolean DBG = false;
    private final java.lang.String TAG = null;
    private final com.android.server.net.NetlinkTracker.Callback mCallback = null;
    private com.android.server.net.DnsServerRepository mDnsServerRepository;
    private final java.lang.String mInterfaceName = null;
    public NetlinkTracker(java.lang.String p0, com.android.server.net.NetlinkTracker.Callback p1) { super(); }
    private void maybeLog(java.lang.String p0, java.lang.Object p1) {}
    private void maybeLog(java.lang.String p0, java.lang.String p1, android.net.LinkAddress p2) {}
    public void addressRemoved(java.lang.String p0, android.net.LinkAddress p1) {}
    public void addressUpdated(java.lang.String p0, android.net.LinkAddress p1) {}
    public void clearLinkProperties() {}
    public android.net.LinkProperties getLinkProperties() { return null; }
    public void interfaceDnsServerInfo(java.lang.String p0, long p1, java.lang.String[] p2) {}
    public void interfaceRemoved(java.lang.String p0) {}
    public void routeRemoved(android.net.RouteInfo p0) {}
    public void routeUpdated(android.net.RouteInfo p0) {}

    public static interface Callback {
        public void update();
    }
}
