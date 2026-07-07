package com.android.internal.hidden_from_bootclasspath.android.telecom.flags;

public interface FeatureFlags {
    public boolean callConnectedIndicatorPreference();
    public boolean callDetailsGetAssociatedUserApi2();
    public boolean callEndpointRequestedApi();
    public boolean changeRttToAudio();
    public boolean deprecateSelfManagedCs();
    public boolean enableAudioProcessingUseCase();
    public boolean explicitCallTransfer();
    public boolean getLastKnownCellIdentity();
    public boolean integratedCallLogsStage2();
    public boolean isInExternalCall();
    public boolean isUsingCrs();
    public boolean isUsingUnidirectionalVideoService();
    public boolean isUsingVideoRingback();
    public boolean localVoicemail();
    public boolean multiPartyAnchorConf();
    public boolean optOutPremiumNetwork();
    public boolean placeCallToAlternateNumber();
    public boolean promoteExtraDoNotLogCallToSystemApi();
    public boolean rejectAsMissedApi();
    public boolean releaseIconAsApi();
    public boolean remotelyHostedProperty();
    public boolean sendOriginalNumberOnPlaceCall();
    public boolean telecomMainlineApi();
    public boolean unhideCapabilityTransfer();
}
