package com.android.net.module.util;

public class InterfaceParams {
    private static final int ETHER_MTU = 1500;
    private static final int IPV6_MIN_MTU = 1280;
    public final int defaultMtu = 0;
    public final boolean hasMacAddress = false;
    public final int index = 0;
    public final java.lang.String name = null;
    public InterfaceParams(java.lang.String p0, int p1, android.net.MacAddress p2) {}
    public InterfaceParams(java.lang.String p0, int p1, android.net.MacAddress p2, int p3) {}
    public InterfaceParams(java.lang.String p0, int p1, boolean p2, android.net.MacAddress p3, int p4) {}
    public static com.android.net.module.util.InterfaceParams getByName(java.lang.String p0) { return null; }
    private static android.net.MacAddress getMacAddress(java.net.NetworkInterface p0) { return null; }
    private static java.net.NetworkInterface getNetworkInterfaceByName(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
}
