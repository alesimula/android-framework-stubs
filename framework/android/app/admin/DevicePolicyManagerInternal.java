package android.app.admin;

public abstract class DevicePolicyManagerInternal {
    public DevicePolicyManagerInternal() {}
    public abstract void addOnCrossProfileWidgetProvidersChangeListener(android.app.admin.DevicePolicyManagerInternal.OnCrossProfileWidgetProvidersChangeListener p0);
    public abstract void broadcastIntentToManifestReceivers(android.content.Intent p0, android.os.UserHandle p1, boolean p2);
    public abstract boolean canSilentlyInstallPackage(java.lang.String p0, int p1);
    public abstract void clearHiddenApplicationsForRole(java.lang.String p0, int p1);
    public abstract android.content.Intent createShowAdminSupportIntent(int p0, boolean p1);
    public abstract android.content.Intent createUserRestrictionSupportIntent(int p0, java.lang.String p1);
    public abstract void enforceAuditLoggingPolicy(boolean p0);
    public abstract void enforceNetworkLoggingPolicy(int p0, boolean p1);
    public abstract void enforcePermission(java.lang.String p0, java.lang.String p1, int p2);
    public abstract void enforceSecurityLoggingPolicy(boolean p0);
    public abstract java.util.List<java.lang.String> getAllCrossProfilePackages(int p0);
    public abstract java.util.List<android.os.Bundle> getApplicationRestrictionsPerAdminForUser(java.lang.String p0, int p1);
    public abstract java.util.List<java.lang.String> getCrossProfileWidgetProviders(int p0);
    public abstract java.util.List<java.lang.String> getDefaultCrossProfilePackages();
    @java.lang.Deprecated
    public abstract android.content.ComponentName getDeviceOwnerComponent(boolean p0);
    public abstract int getDeviceOwnerUserId();
    protected abstract android.app.admin.DevicePolicyCache getDevicePolicyCache();
    public abstract int getMultiuserManagedDeviceProvisioningState();
    public abstract java.util.Set<java.lang.String> getPermittedInputMethodPackages(int p0);
    public abstract java.lang.CharSequence getPrintingDisabledReasonForUser(int p0);
    public abstract android.content.ComponentName getProfileOwnerAsUser(int p0);
    public abstract java.util.List<android.os.UserManager.EnforcingUser> getUserRestrictionSources(java.lang.String p0, int p1);
    public abstract boolean hasAffiliationWithDevice(int p0);
    public abstract boolean hasPermission(java.lang.String p0, java.lang.String p1, int p2);
    public abstract boolean isActiveDeviceOwner(int p0);
    public abstract boolean isActiveProfileOwner(int p0);
    public abstract boolean isDeviceOrProfileOwnerInCallingUser(java.lang.String p0);
    public abstract boolean isDeviceOrganizationManaged();
    public abstract boolean isDeviceProvisioned();
    public abstract boolean isUsbDataSignalingEnabled();
    public abstract boolean isUserAffiliatedWithDevice(int p0);
    public abstract boolean isUserOrganizationManaged(int p0);
    public abstract void notifyCrossProfileProvidersChanged(int p0, java.util.List<java.lang.String> p1);
    public abstract void removeLocalPoliciesForSystemEntities(int p0, java.util.List<java.lang.String> p1);
    public abstract void removePoliciesForAdmins(int p0, java.util.List<java.lang.String> p1);
    public abstract void reportSeparateProfileChallengeChanged(int p0);
    public abstract void resetOp(int p0, java.lang.String p1, int p2);
    public abstract void setApplicationHiddenBySystem(java.lang.String p0, java.lang.String p1, int p2, boolean p3);
    public abstract void setInternalEventsCallback(java.util.function.Consumer<java.util.List<android.app.admin.SecurityLog.SecurityEvent>> p0);
    public abstract void setUserRestrictionForUser(java.lang.String p0, java.lang.String p1, boolean p2, int p3);
    public abstract boolean supportsResetOp(int p0);

    public static interface OnCrossProfileWidgetProvidersChangeListener {
        public void onCrossProfileWidgetProvidersChanged(int p0, java.util.List<java.lang.String> p1);
    }
}
