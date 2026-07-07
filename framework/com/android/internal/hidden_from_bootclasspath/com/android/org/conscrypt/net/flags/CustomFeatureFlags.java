package com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags.FeatureFlags {
    private java.util.Map<java.lang.String, java.lang.Boolean> mFinalizedFlags;
    private java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags.FeatureFlags, ?>, ?> mGetGenericValueImpl;
    private java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags.FeatureFlags>> mGetValueImpl;
    private java.util.Set<java.lang.String> mReadOnlyFlagsSet;
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags.FeatureFlags>> p0) {}
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags.FeatureFlags>> p0, java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags.FeatureFlags, ?>, ?> p1) {}
    public boolean dynamicNetworkSecurityPolicy() { return false; }
    public boolean encryptedClientHelloModes() { return false; }
    public boolean encryptedClientHelloPlatform() { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    protected <T extends java.lang.Object> T getGenericValue(java.lang.String p0, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags.FeatureFlags, T> p1) { return null; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags.FeatureFlags> p1) { return false; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
    public boolean networkSecurityConfig() { return false; }
    public boolean networkSecurityConfigLocalhost() { return false; }
}
