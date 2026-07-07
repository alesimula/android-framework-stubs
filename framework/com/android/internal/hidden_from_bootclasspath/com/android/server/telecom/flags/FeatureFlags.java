package com.android.internal.hidden_from_bootclasspath.com.android.server.telecom.flags;

public interface FeatureFlags {
    public boolean addCallUriForMissedCalls();
    public boolean bulkStateUpdateCall();
    public boolean businessCallComposer();
    public boolean callDetailsIdChanges();
    public boolean callSequencingCallResumeFailed();
    public boolean callSequencingMetrics();
    public boolean conferenceModifyMergeFail();
    public boolean ensureAudioModeUpdatesOnForegroundCallChange();
    public boolean filterVoipCallLogs();
    public boolean getRegisteredPhoneAccounts();
    public boolean hdPlusCall();
    public boolean integratedCallLogs();
    public boolean preventIllegalAudioProcessingExit();
    public boolean reuseOriginalConnRemoteConfApi();
    public boolean revertDisconnectingDuringMerge();
    public boolean setMuteState();
    public boolean supportDisplayNameCallLog();
    public boolean telecomAppLabelProxyHsumAware();
    public boolean telecomMainUserInBlockCheck();
    public boolean telecomMainUserInGetRespondMessageApp();
    public boolean telecomMainlineBlockedNumbersManager();
    public boolean telecomResolveHiddenDependencies();
    public boolean telephonyHasDefaultButTelecomDoesNot();
    public boolean transactionalCsVerifier();
    public boolean transactionalVideoState();
    public boolean unregisterUnresolvableAccounts();
    public boolean vibrationAccountsForMainSetting();
    public boolean voipAppActionsSupport();
    public boolean voipDndFocus();
}
