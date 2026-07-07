package com.android.internal.net;

public class VpnConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.net.VpnConfig> CREATOR = null;
    public static final java.lang.String DIALOGS_PACKAGE = "com.android.vpndialogs";
    public static final java.lang.String LEGACY_VPN = "[Legacy VPN]";
    public static final java.lang.String SERVICE_INTERFACE = "android.net.VpnService";
    public java.util.List<android.net.LinkAddress> addresses;
    public boolean allowBypass;
    public boolean allowIPv4;
    public boolean allowIPv6;
    public java.util.List<java.lang.String> allowedApplications;
    public boolean blocking;
    public android.app.PendingIntent configureIntent;
    public java.util.List<java.lang.String> disallowedApplications;
    public java.util.List<java.lang.String> dnsServers;
    public boolean excludeLocalRoutes;
    public java.lang.String interfaze;
    public boolean isMetered;
    public boolean legacy;
    public int mtu;
    public boolean requiresInternetValidation;
    public java.util.List<android.net.RouteInfo> routes;
    public java.util.List<java.lang.String> searchDomains;
    public java.lang.String session;
    public long startTime;
    public java.lang.String user;
    public VpnConfig() {}
    public VpnConfig(com.android.internal.net.VpnConfig p0) {}
    private static <T extends java.lang.Object> java.util.List<T> copyOf(java.util.List<T> p0) { return null; }
    public static android.content.Intent getIntentForConfirmation() { return null; }
    public static android.app.PendingIntent getIntentForStatusPanel(android.content.Context p0) { return null; }
    public static java.lang.CharSequence getVpnLabel(android.content.Context p0, java.lang.String p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    static <T extends java.lang.Object> java.lang.String toString(java.util.List<T> p0) { return null; }
    public void addLegacyAddresses(java.lang.String p0) {}
    public void addLegacyRoutes(java.lang.String p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
