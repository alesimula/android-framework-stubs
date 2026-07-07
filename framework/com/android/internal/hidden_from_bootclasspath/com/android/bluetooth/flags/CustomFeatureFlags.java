package com.android.internal.hidden_from_bootclasspath.com.android.bluetooth.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.bluetooth.flags.FeatureFlags {
    private java.util.Map<java.lang.String, java.lang.Boolean> mFinalizedFlags;
    private java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.bluetooth.flags.FeatureFlags, ?>, ?> mGetGenericValueImpl;
    private java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.bluetooth.flags.FeatureFlags>> mGetValueImpl;
    private java.util.Set<java.lang.String> mReadOnlyFlagsSet;
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.bluetooth.flags.FeatureFlags>> p0) {}
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.bluetooth.flags.FeatureFlags>> p0, java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.bluetooth.flags.FeatureFlags, ?>, ?> p1) {}
    public boolean a2dpActionSwitchBufferSizeDeprecation() { return false; }
    public boolean a2dpCreateCodecTypeFromIdApi() { return false; }
    public boolean a2dpDisconnectReasonApi() { return false; }
    public boolean a2dpLdacApi() { return false; }
    public boolean addForceDisconnectApi() { return false; }
    public boolean addHearingAidClassOfDevice() { return false; }
    public boolean addNewLocalDisconnectReason() { return false; }
    public boolean apairing26q2PermissionImprovements() { return false; }
    public boolean autonomousRepairingInitiation() { return false; }
    public boolean bluetoothQualityReportV8() { return false; }
    public boolean deprecateConnectAudio() { return false; }
    public boolean enableGetBondStatus() { return false; }
    public boolean enforceBluetoothPrivilegedForHeadset() { return false; }
    public boolean enforceNonNullWorksource() { return false; }
    public boolean explicitUuidTransportApi() { return false; }
    public boolean gattConnSettings() { return false; }
    public boolean gattOffloadApi() { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    protected <T extends java.lang.Object> T getGenericValue(java.lang.String p0, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.bluetooth.flags.FeatureFlags, T> p1) { return null; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.bluetooth.flags.FeatureFlags> p1) { return false; }
    public boolean hfpGetCodecApi() { return false; }
    public boolean includePowerAndRssiInDistanceMeasurementResult() { return false; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
    public boolean leaudioAuracastLiveMicFeature() { return false; }
    public boolean leaudioBroadcastSinkFeature() { return false; }
    public boolean leaudioCodecIdSupport() { return false; }
    public boolean leaudioOverHdtPhyApi() { return false; }
    public boolean leaudioPeripheralFeature() { return false; }
    public boolean maxAdvertisingPower() { return false; }
    public boolean oppDevicePickerExtraIntentApis() { return false; }
    public boolean providePairingAlgo() { return false; }
    public boolean removeScanFilterBuilderException() { return false; }
    public boolean reportVendorEventsFromAcl() { return false; }
    public boolean rssiThresholdForLeConn() { return false; }
}
