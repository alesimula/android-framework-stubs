package com.android.net.module.util;

public final class MacAddressUtils {
    private static final int ETHER_ADDR_LEN = 6;
    private static final long LOCALLY_ASSIGNED_MASK = Long.valueOf(0L);
    private static final long MULTICAST_MASK = Long.valueOf(0L);
    private static final long NIC_MASK = Long.valueOf(0L);
    private static final long OUI_MASK = Long.valueOf(0L);
    private static final long VALID_LONG_MASK = 281474976710655L;
    public MacAddressUtils() {}
    public static byte[] byteAddrFromLongAddr(long p0) { return null; }
    public static android.net.MacAddress createRandomUnicastAddress() { return null; }
    public static android.net.MacAddress createRandomUnicastAddress(android.net.MacAddress p0, java.util.Random p1) { return null; }
    public static boolean isMacAddress(byte[] p0) { return false; }
    public static boolean isMulticastAddress(android.net.MacAddress p0) { return false; }
    public static long longAddrFromByteAddr(byte[] p0) { return 0L; }
}
