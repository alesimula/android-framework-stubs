package com.android.internal.hidden_from_bootclasspath.android.nfc;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.nfc.FeatureFlags {
    private java.util.Map<java.lang.String, java.lang.Boolean> mFinalizedFlags;
    private java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.android.nfc.FeatureFlags, ?>, ?> mGetGenericValueImpl;
    private java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.nfc.FeatureFlags>> mGetValueImpl;
    private java.util.Set<java.lang.String> mReadOnlyFlagsSet;
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.nfc.FeatureFlags>> p0) {}
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.nfc.FeatureFlags>> p0, java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.android.nfc.FeatureFlags, ?>, ?> p1) {}
    public boolean enableCardEmulationEuicc() { return false; }
    public boolean enableNfcCharging() { return false; }
    public boolean enableNfcMainline() { return false; }
    public boolean enableNfcReaderOption() { return false; }
    public boolean enableNfcSetDiscoveryTech() { return false; }
    public boolean enableNfcUserRestriction() { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    protected <T extends java.lang.Object> T getGenericValue(java.lang.String p0, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.android.nfc.FeatureFlags, T> p1) { return null; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.nfc.FeatureFlags> p1) { return false; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
    public boolean nfcActionManageServicesSettings() { return false; }
    public boolean nfcApduServiceInfoConstructor() { return false; }
    public boolean nfcAssociatedRoleServices() { return false; }
    public boolean nfcCheckTagIntentPreference() { return false; }
    public boolean nfcEventListener() { return false; }
    public boolean nfcObserveMode() { return false; }
    public boolean nfcOemExtension() { return false; }
    public boolean nfcOverrideRecoverRoutingTable() { return false; }
    public boolean nfcPersistLog() { return false; }
    public boolean nfcReadPollingLoop() { return false; }
    public boolean nfcSetDefaultDiscTech() { return false; }
    public boolean nfcSetServiceEnabledForCategoryOther() { return false; }
    public boolean nfcStateChange() { return false; }
    public boolean nfcStateChangeSecurityLogEventEnabled() { return false; }
    public boolean nfcVendorCmd() { return false; }
    public boolean nfcWatchdog() { return false; }
    public boolean screenStateAttributeToggle() { return false; }
}
