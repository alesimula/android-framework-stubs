package com.android.internal.hidden_from_bootclasspath.com.android.permission.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.permission.flags.FeatureFlags {
    private java.util.Map<java.lang.String, java.lang.Boolean> mFinalizedFlags;
    private java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.permission.flags.FeatureFlags, ?>, ?> mGetGenericValueImpl;
    private java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.permission.flags.FeatureFlags>> mGetValueImpl;
    private java.util.Set<java.lang.String> mReadOnlyFlagsSet;
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.permission.flags.FeatureFlags>> p0) {}
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.permission.flags.FeatureFlags>> p0, java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.permission.flags.FeatureFlags, ?>, ?> p1) {}
    public boolean addBannersToPrivacySensitiveAppsForAaos() { return false; }
    public boolean appPermissionFragmentUsesPreferences() { return false; }
    public boolean archivingReadOnly() { return false; }
    public boolean crossUserRoleEnabled() { return false; }
    public boolean crossUserRoleUxBugfixEnabled() { return false; }
    public boolean defaultAppsRecommendationEnabled() { return false; }
    public boolean enableCoarseFineLocationPromptForAaos() { return false; }
    public boolean enhancedConfirmationBackportEnabled() { return false; }
    public boolean expressiveDesignEnabled() { return false; }
    public boolean fixSafetyCenterTouchTarget() { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    protected <T extends java.lang.Object> T getGenericValue(java.lang.String p0, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.permission.flags.FeatureFlags, T> p1) { return null; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.permission.flags.FeatureFlags> p1) { return false; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
    public boolean odadNotificationsSupported() { return false; }
    public boolean permissionTimelineAttributionLabelFix() { return false; }
    public boolean privateProfileSupported() { return false; }
    public boolean privateProfileTitleApi() { return false; }
    public boolean safetyCenterEnabledNoDeviceConfig() { return false; }
    public boolean safetyCenterIssueOnlyAffectsGroupStatus() { return false; }
    public boolean systemFinancedDeviceController() { return false; }
    public boolean wearComposeMaterial3() { return false; }
    public boolean wearPrivacyDashboardEnabledReadOnly() { return false; }
}
