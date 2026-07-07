package com.android.internal.hidden_from_bootclasspath.com.android.libcore;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.libcore.FeatureFlags {
    private java.util.Map<java.lang.String, java.lang.Boolean> mFinalizedFlags;
    private java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.libcore.FeatureFlags, ?>, ?> mGetGenericValueImpl;
    private java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.libcore.FeatureFlags>> mGetValueImpl;
    private java.util.Set<java.lang.String> mReadOnlyFlagsSet;
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.libcore.FeatureFlags>> p0) {}
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.libcore.FeatureFlags>> p0, java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.libcore.FeatureFlags, ?>, ?> p1) {}
    public boolean appinfo() { return false; }
    public boolean enablePccFrameworkSupport() { return false; }
    public boolean encryptedClientHelloModes() { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    protected <T extends java.lang.Object> T getGenericValue(java.lang.String p0, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.libcore.FeatureFlags, T> p1) { return null; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.libcore.FeatureFlags> p1) { return false; }
    public boolean hpkePublicApi() { return false; }
    public boolean hpkeVApis() { return false; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
    public boolean nativeMetrics() { return false; }
    public boolean networkSecurityPolicyEchApi() { return false; }
    public boolean networkSecurityPolicyReasonCtEnabledApi() { return false; }
    public boolean nicenessApis() { return false; }
    public boolean openjdk21Stringconcat() { return false; }
    public boolean openjdk21V1Apis() { return false; }
    public boolean openjdk21V2Apis() { return false; }
    public boolean openjdk25V1Apis() { return false; }
    public boolean openjdk25V2Apis() { return false; }
    public boolean osNoThrowApis() { return false; }
    public boolean postCleanupApis() { return false; }
    public boolean readOnlyDynamicCodeLoad() { return false; }
    public boolean vApis() { return false; }
    public boolean virtualThreadApiV1() { return false; }
}
