package com.android.server.net;

class DnsServerRepository {
    public static final int NUM_CURRENT_SERVERS = 3;
    public static final int NUM_SERVERS = 12;
    public static final java.lang.String TAG = "DnsServerRepository";
    private java.util.ArrayList<com.android.server.net.DnsServerEntry> mAllServers;
    private java.util.Set<java.net.InetAddress> mCurrentServers;
    private java.util.HashMap<java.net.InetAddress, com.android.server.net.DnsServerEntry> mIndex;
    public DnsServerRepository() {}
    private boolean updateCurrentServers() { return false; }
    private boolean updateExistingEntry(java.net.InetAddress p0, long p1) { return false; }
    public boolean addServers(long p0, java.lang.String[] p1) { return false; }
    public void setDnsServersOn(android.net.LinkProperties p0) {}
}
