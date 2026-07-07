package com.android.net.module.util;

public final class LinkPropertiesUtils {
    public static final int MAX_MTU = 10000;
    public static final int MIN_MTU = 68;
    public static final int MIN_MTU_V6 = 1280;
    public LinkPropertiesUtils() {}
    public static com.android.net.module.util.LinkPropertiesUtils.CompareResult<android.net.LinkAddress> compareAddresses(android.net.LinkProperties p0, android.net.LinkProperties p1) { return null; }
    public static com.android.net.module.util.LinkPropertiesUtils.CompareResult<java.net.InetAddress> compareAllAddresses(android.net.LinkProperties p0, android.net.LinkProperties p1) { return null; }
    public static boolean isIdenticalAddresses(android.net.LinkProperties p0, android.net.LinkProperties p1) { return false; }
    public static boolean isIdenticalAllLinkAddresses(android.net.LinkProperties p0, android.net.LinkProperties p1) { return false; }
    public static boolean isIdenticalDnses(android.net.LinkProperties p0, android.net.LinkProperties p1) { return false; }
    public static boolean isIdenticalHttpProxy(android.net.LinkProperties p0, android.net.LinkProperties p1) { return false; }
    public static boolean isIdenticalInterfaceName(android.net.LinkProperties p0, android.net.LinkProperties p1) { return false; }
    public static boolean isIdenticalRoutes(android.net.LinkProperties p0, android.net.LinkProperties p1) { return false; }
    public static boolean isValidMtu(int p0, boolean p1) { return false; }

    public static class CompareOrUpdateResult<K extends java.lang.Object, T extends java.lang.Object> {
        public final java.util.List<T> added = null;
        public final java.util.List<T> removed = null;
        public final java.util.List<T> updated = null;
        public CompareOrUpdateResult(java.util.Collection<T> p0, java.util.Collection<T> p1, java.util.function.Function<T, K> p2) {}
        public java.lang.String toString() { return null; }
    }

    public static class CompareResult<T extends java.lang.Object> {
        public final java.util.List<T> added = null;
        public final java.util.List<T> removed = null;
        public CompareResult() {}
        public CompareResult(java.util.Collection<T> p0, java.util.Collection<T> p1) {}
        public java.lang.String toString() { return null; }
    }
}
