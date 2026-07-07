package com.android.net.module.util;

public class ConnectivitySettingsUtils {
    public static final java.lang.String L4S_DEVELOPER_OPTION = "l4s_developer_option";
    public static final java.lang.String NETWORK_AVOID_BAD_WIFI = "network_avoid_bad_wifi";
    public static final java.lang.String NETWORK_CARRIER_AWARE_AVOID_BAD_WIFI = "network_carrier_aware_avoid_bad_wifi";
    public static final java.lang.String PRIVATE_DNS_DEFAULT_MODE = "private_dns_default_mode";
    public static final java.lang.String PRIVATE_DNS_MODE = "private_dns_mode";
    public static final int PRIVATE_DNS_MODE_OFF = 1;
    public static final java.lang.String PRIVATE_DNS_MODE_OFF_STRING = "off";
    public static final int PRIVATE_DNS_MODE_OPPORTUNISTIC = 2;
    public static final java.lang.String PRIVATE_DNS_MODE_OPPORTUNISTIC_STRING = "opportunistic";
    public static final int PRIVATE_DNS_MODE_PROVIDER_HOSTNAME = 3;
    public static final java.lang.String PRIVATE_DNS_MODE_PROVIDER_HOSTNAME_STRING = "hostname";
    public static final java.lang.String PRIVATE_DNS_SPECIFIER = "private_dns_specifier";
    public static final java.lang.String TAG = null;
    public ConnectivitySettingsUtils() {}
    public static java.lang.String getAvoidBadWifiSettingKey(int p0) { return null; }
    public static int getL4sDeveloperOptionSetting(android.content.Context p0) { return 0; }
    public static int getNetworkAvoidBadWifiIntegerSetting(android.content.Context p0, int p1) { return 0; }
    public static java.lang.String getNetworkAvoidBadWifiSetting(android.content.Context p0, int p1) { return null; }
    @java.lang.Deprecated
    public static java.lang.String getNetworkLegacyGlobalAvoidBadWifiSetting(android.content.Context p0) { return null; }
    public static java.lang.String getPrivateDnsHostname(android.content.Context p0) { return null; }
    public static int getPrivateDnsMode(android.content.Context p0) { return 0; }
    private static int getPrivateDnsModeAsInt(java.lang.String p0) { return 0; }
    public static java.lang.String getPrivateDnsModeAsString(int p0) { return null; }
    public static void setL4sDeveloperOptionSetting(android.content.Context p0, int p1) {}
    public static void setNetworkAvoidBadWifiSetting(android.content.Context p0, int p1, java.lang.String p2) {}
    @java.lang.Deprecated
    public static void setNetworkLegacyGlobalAvoidBadWifiSetting(android.content.Context p0, java.lang.String p1) {}
    public static void setPrivateDnsHostname(android.content.Context p0, java.lang.String p1) {}
    public static void setPrivateDnsMode(android.content.Context p0, int p1) {}
}
