package com.android.internal.hidden_from_bootclasspath.android.telecom.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.telecom.flags.FeatureFlags {
    private java.util.Map<java.lang.String, java.lang.Boolean> mFinalizedFlags;
    private java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.android.telecom.flags.FeatureFlags, ?>, ?> mGetGenericValueImpl;
    private java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.telecom.flags.FeatureFlags>> mGetValueImpl;
    private java.util.Set<java.lang.String> mReadOnlyFlagsSet;
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.telecom.flags.FeatureFlags>> p0) {}
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.telecom.flags.FeatureFlags>> p0, java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.android.telecom.flags.FeatureFlags, ?>, ?> p1) {}
    public boolean callConnectedIndicatorPreference() { return false; }
    public boolean callDetailsGetAssociatedUserApi2() { return false; }
    public boolean callEndpointRequestedApi() { return false; }
    public boolean changeRttToAudio() { return false; }
    public boolean deprecateSelfManagedCs() { return false; }
    public boolean enableAudioProcessingUseCase() { return false; }
    public boolean explicitCallTransfer() { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    protected <T extends java.lang.Object> T getGenericValue(java.lang.String p0, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.android.telecom.flags.FeatureFlags, T> p1) { return null; }
    public boolean getLastKnownCellIdentity() { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.telecom.flags.FeatureFlags> p1) { return false; }
    public boolean integratedCallLogsStage2() { return false; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
    public boolean isInExternalCall() { return false; }
    public boolean isUsingCrs() { return false; }
    public boolean isUsingUnidirectionalVideoService() { return false; }
    public boolean isUsingVideoRingback() { return false; }
    public boolean localVoicemail() { return false; }
    public boolean multiPartyAnchorConf() { return false; }
    public boolean optOutPremiumNetwork() { return false; }
    public boolean placeCallToAlternateNumber() { return false; }
    public boolean promoteExtraDoNotLogCallToSystemApi() { return false; }
    public boolean rejectAsMissedApi() { return false; }
    public boolean releaseIconAsApi() { return false; }
    public boolean remotelyHostedProperty() { return false; }
    public boolean sendOriginalNumberOnPlaceCall() { return false; }
    public boolean telecomMainlineApi() { return false; }
    public boolean unhideCapabilityTransfer() { return false; }
}
