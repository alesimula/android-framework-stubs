package com.android.internal.hidden_from_bootclasspath.com.android.server.telecom.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.server.telecom.flags.FeatureFlags {
    private java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.server.telecom.flags.FeatureFlags, ?>, ?> mGetGenericValueImpl;
    private java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.server.telecom.flags.FeatureFlags>> mGetValueImpl;
    private java.util.Set<java.lang.String> mReadOnlyFlagsSet;
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.server.telecom.flags.FeatureFlags>> p0) {}
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.server.telecom.flags.FeatureFlags>> p0, java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.server.telecom.flags.FeatureFlags, ?>, ?> p1) {}
    private boolean isOptimizationEnabled() { return false; }
    public boolean addCallUriForMissedCalls() { return false; }
    public boolean bulkStateUpdateCall() { return false; }
    public boolean businessCallComposer() { return false; }
    public boolean callDetailsIdChanges() { return false; }
    public boolean callSequencingCallResumeFailed() { return false; }
    public boolean callSequencingMetrics() { return false; }
    public boolean conferenceModifyMergeFail() { return false; }
    public boolean ensureAudioModeUpdatesOnForegroundCallChange() { return false; }
    public boolean filterVoipCallLogs() { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    protected <T extends java.lang.Object> T getGenericValue(java.lang.String p0, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.server.telecom.flags.FeatureFlags, T> p1) { return null; }
    public boolean getRegisteredPhoneAccounts() { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.server.telecom.flags.FeatureFlags> p1) { return false; }
    public boolean hdPlusCall() { return false; }
    public boolean integratedCallLogs() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    public boolean preventIllegalAudioProcessingExit() { return false; }
    public boolean reuseOriginalConnRemoteConfApi() { return false; }
    public boolean revertDisconnectingDuringMerge() { return false; }
    public boolean setMuteState() { return false; }
    public boolean supportDisplayNameCallLog() { return false; }
    public boolean telecomAppLabelProxyHsumAware() { return false; }
    public boolean telecomMainUserInBlockCheck() { return false; }
    public boolean telecomMainUserInGetRespondMessageApp() { return false; }
    public boolean telecomMainlineBlockedNumbersManager() { return false; }
    public boolean telecomResolveHiddenDependencies() { return false; }
    public boolean telephonyHasDefaultButTelecomDoesNot() { return false; }
    public boolean transactionalCsVerifier() { return false; }
    public boolean transactionalVideoState() { return false; }
    public boolean unregisterUnresolvableAccounts() { return false; }
    public boolean vibrationAccountsForMainSetting() { return false; }
    public boolean voipAppActionsSupport() { return false; }
    public boolean voipDndFocus() { return false; }
}
