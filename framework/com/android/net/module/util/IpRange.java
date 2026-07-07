package com.android.net.module.util;

public final class IpRange {
    private static final int SIGNUM_POSITIVE = 1;
    private final byte[] mEndAddr = null;
    private final byte[] mStartAddr = null;
    public IpRange(android.net.IpPrefix p0) {}
    public IpRange(java.net.InetAddress p0, java.net.InetAddress p1) {}
    private static java.math.BigInteger addrToBigInteger(byte[] p0) { return null; }
    private static java.net.InetAddress getAsInetAddress(byte[] p0) { return null; }
    private static java.util.List<android.net.IpPrefix> getSubsetPrefixes(android.net.IpPrefix p0) { return null; }
    public java.util.List<android.net.IpPrefix> asIpPrefixes() { return null; }
    public boolean containsRange(com.android.net.module.util.IpRange p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.net.InetAddress getEndAddr() { return null; }
    public java.net.InetAddress getStartAddr() { return null; }
    public int hashCode() { return 0; }
    public boolean overlapsRange(com.android.net.module.util.IpRange p0) { return false; }
}
