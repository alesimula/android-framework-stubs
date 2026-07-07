package com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags;

final class FeatureFlagsImpl implements com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags.FeatureFlags {
    private static final java.lang.String TAG = "FeatureFlagsImplExport";
    private static boolean dynamicNetworkSecurityPolicy;
    private static boolean encryptedClientHelloModes;
    private static boolean encryptedClientHelloPlatform;
    private static volatile boolean isCached;
    private static boolean networkSecurityConfig;
    private static boolean networkSecurityConfigLocalhost;
    FeatureFlagsImpl() {}
    private void init() {}
    public boolean dynamicNetworkSecurityPolicy() { return false; }
    public boolean encryptedClientHelloModes() { return false; }
    public boolean encryptedClientHelloPlatform() { return false; }
    public boolean networkSecurityConfig() { return false; }
    public boolean networkSecurityConfigLocalhost() { return false; }
}
