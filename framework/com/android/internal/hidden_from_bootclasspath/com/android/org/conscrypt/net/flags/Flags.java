package com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags;

public final class Flags {
    private static com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags.FeatureFlags FEATURE_FLAGS;
    public static final java.lang.String FLAG_DYNAMIC_NETWORK_SECURITY_POLICY = "com.android.org.conscrypt.net.flags.dynamic_network_security_policy";
    public static final java.lang.String FLAG_ENCRYPTED_CLIENT_HELLO_MODES = "com.android.org.conscrypt.net.flags.encrypted_client_hello_modes";
    public static final java.lang.String FLAG_ENCRYPTED_CLIENT_HELLO_PLATFORM = "com.android.org.conscrypt.net.flags.encrypted_client_hello_platform";
    public static final java.lang.String FLAG_NETWORK_SECURITY_CONFIG = "com.android.org.conscrypt.net.flags.network_security_config";
    public static final java.lang.String FLAG_NETWORK_SECURITY_CONFIG_LOCALHOST = "com.android.org.conscrypt.net.flags.network_security_config_localhost";
    public Flags() {}
    public static boolean dynamicNetworkSecurityPolicy() { return false; }
    public static boolean encryptedClientHelloModes() { return false; }
    public static boolean encryptedClientHelloPlatform() { return false; }
    public static boolean networkSecurityConfig() { return false; }
    public static boolean networkSecurityConfigLocalhost() { return false; }
}
