package android.app.admin;

public interface IDevicePolicyManager extends android.os.IInterface {
    public void acknowledgeDeviceCompliant() throws android.os.RemoteException;
    public void acknowledgeNewUserDisclaimer(int p0) throws android.os.RemoteException;
    public void addCrossProfileIntentFilter(android.content.ComponentName p0, java.lang.String p1, android.content.IntentFilter p2, int p3) throws android.os.RemoteException;
    public boolean addCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int addOverrideApn(android.content.ComponentName p0, android.telephony.data.ApnSetting p1) throws android.os.RemoteException;
    public void addPersistentPreferredActivity(android.content.ComponentName p0, java.lang.String p1, android.content.IntentFilter p2, android.content.ComponentName p3) throws android.os.RemoteException;
    public void addResolvedDeviceWidePolicyCallback(java.lang.String p0, java.lang.String p1, android.app.admin.IDevicePolicyValueCallback p2) throws android.os.RemoteException;
    public boolean approveCaCert(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean bindDeviceAdminServiceAsUser(android.content.ComponentName p0, android.app.IApplicationThread p1, android.os.IBinder p2, android.content.Intent p3, android.app.IServiceConnection p4, long p5, int p6) throws android.os.RemoteException;
    public void calculateHasIncompatibleAccounts() throws android.os.RemoteException;
    public boolean canAdminGrantSensorsPermissions() throws android.os.RemoteException;
    public boolean canProfileOwnerResetPasswordWhenLocked(int p0) throws android.os.RemoteException;
    public boolean canUsbDataSignalingBeDisabled() throws android.os.RemoteException;
    public boolean checkDeviceIdentifierAccess(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public int checkProvisioningPrecondition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void choosePrivateKeyAlias(int p0, android.net.Uri p1, java.lang.String p2, android.os.IBinder p3) throws android.os.RemoteException;
    public void clearApplicationUserData(android.content.ComponentName p0, java.lang.String p1, android.content.pm.IPackageDataObserver p2) throws android.os.RemoteException;
    public void clearCrossProfileIntentFilters(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void clearDeviceOwner(java.lang.String p0) throws android.os.RemoteException;
    public void clearMultiuserDeviceManagement(java.lang.String p0) throws android.os.RemoteException;
    public void clearOrganizationIdForUser(int p0) throws android.os.RemoteException;
    public void clearPackagePersistentPreferredActivities(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void clearProfileOwner(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean clearResetPasswordToken(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void clearSystemUpdatePolicyFreezePeriodRecord() throws android.os.RemoteException;
    public android.content.Intent createAdminSupportIntent(java.lang.String p0) throws android.os.RemoteException;
    public android.os.UserHandle createAndManageUser(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, int p4) throws android.os.RemoteException;
    public android.os.UserHandle createAndProvisionManagedProfile(android.app.admin.ManagedProfileProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException;
    public android.os.UserHandle createManagedProfile(android.app.admin.ManagedProfileProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException;
    public void enableSystemApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int enableSystemAppWithIntent(android.content.ComponentName p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException;
    public void enforceCanManageCaCerts(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void finalizeCreateManagedProfile(android.app.admin.ManagedProfileProvisioningParams p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public void finalizeWorkProfileProvisioning(android.os.UserHandle p0, android.accounts.Account p1) throws android.os.RemoteException;
    public long forceNetworkLogs() throws android.os.RemoteException;
    public void forceRemoveActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public long forceSecurityLogs() throws android.os.RemoteException;
    public void forceSetMaxPolicyStorageLimit(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void forceUpdateUserSetupComplete(int p0) throws android.os.RemoteException;
    public boolean generateKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.security.keystore.ParcelableKeyGenParameterSpec p3, int p4, android.security.keymaster.KeymasterCertificateChain p5) throws android.os.RemoteException;
    public android.security.keymaster.KeymasterCertificateChain generateKeyPairWithScope(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.security.keystore.ParcelableKeyGenParameterSpec p3, int p4, int p5) throws android.os.RemoteException;
    public java.lang.String[] getAccountTypesWithManagementDisabled(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public java.util.List<android.content.ComponentName> getActiveAdmins(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAffiliationIds(android.content.ComponentName p0) throws android.os.RemoteException;
    public int getAggregatedPasswordComplexityForUser(int p0, boolean p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllCrossProfilePackages(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAlwaysOnVpnLockdownAllowlist(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.lang.String getAlwaysOnVpnPackage(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.lang.String getAlwaysOnVpnPackageForUser(int p0) throws android.os.RemoteException;
    public int getAppFunctionsPolicy(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int[] getApplicationExemptions(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Bundle getApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public android.os.Bundle getApplicationRestrictionsBySystem(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean getAutoTimeEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public int getAutoTimePolicy(java.lang.String p0) throws android.os.RemoteException;
    public boolean getAutoTimeRequired() throws android.os.RemoteException;
    public boolean getAutoTimeZoneEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public int getAutoTimeZonePolicy(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<android.os.UserHandle> getBindDeviceAdminTargetUsers(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean getBluetoothContactSharingDisabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean getBluetoothContactSharingDisabledForUser(int p0) throws android.os.RemoteException;
    public boolean getCameraDisabled(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public java.lang.String getCertInstallerPackage(android.content.ComponentName p0) throws android.os.RemoteException;
    public int getContentProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.app.admin.PackagePolicy getCredentialManagerPolicy(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCrossProfileCalendarPackages(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCrossProfileCalendarPackagesForUser(int p0) throws android.os.RemoteException;
    public boolean getCrossProfileCallerIdDisabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean getCrossProfileCallerIdDisabledForUser(int p0) throws android.os.RemoteException;
    public boolean getCrossProfileContactsSearchDisabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean getCrossProfileContactsSearchDisabledForUser(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCrossProfilePackages(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public int getCurrentFailedPasswordAttempts(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getDefaultCrossProfilePackages() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getDelegatePackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getDelegatedScopes(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.ComponentName getDeviceOwnerComponent(boolean p0) throws android.os.RemoteException;
    public android.content.ComponentName getDeviceOwnerComponentOnUser(int p0) throws android.os.RemoteException;
    public java.lang.CharSequence getDeviceOwnerLockScreenInfo() throws android.os.RemoteException;
    public java.lang.String getDeviceOwnerName() throws android.os.RemoteException;
    public java.lang.CharSequence getDeviceOwnerOrganizationName() throws android.os.RemoteException;
    public int getDeviceOwnerType(android.content.ComponentName p0) throws android.os.RemoteException;
    public int getDeviceOwnerUserId() throws android.os.RemoteException;
    public android.app.admin.DevicePolicyState getDevicePolicyState() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getDisallowedSystemApps(android.content.ComponentName p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean getDoNotAskCredentialsOnBoot() throws android.os.RemoteException;
    public android.app.admin.ParcelableResource getDrawable(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.CharSequence getEndUserSessionMessage(android.content.ComponentName p0) throws android.os.RemoteException;
    public android.app.admin.EnforcingAdmin getEnforcingAdmin(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.os.Bundle getEnforcingAdminAndUserDetails(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.app.admin.EnforcingAdmin> getEnforcingAdminsForPolicy(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.lang.String getEnrollmentSpecificId(java.lang.String p0) throws android.os.RemoteException;
    public android.app.admin.FactoryResetProtectionPolicy getFactoryResetProtectionPolicy(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.lang.String getFinancedDeviceKioskRoleHolder(java.lang.String p0) throws android.os.RemoteException;
    public boolean getForceEphemeralUsers(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.lang.String getGlobalPrivateDnsHost(android.content.ComponentName p0) throws android.os.RemoteException;
    public int getGlobalPrivateDnsMode(android.content.ComponentName p0) throws android.os.RemoteException;
    public android.content.ComponentName getGlobalProxyAdmin(int p0) throws android.os.RemoteException;
    public int getHeadlessDeviceOwnerMode(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public android.app.admin.ParcelableGranteeMap getKeyPairGrants(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getKeyguardDisabledFeatures(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public long getLastBugReportRequestTime() throws android.os.RemoteException;
    public long getLastNetworkLogRetrievalTime() throws android.os.RemoteException;
    public long getLastSecurityLogRetrievalTime() throws android.os.RemoteException;
    public int getLockTaskFeatures(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String[] getLockTaskPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public int getLogoutUserId() throws android.os.RemoteException;
    public java.lang.CharSequence getLongSupportMessage(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.lang.CharSequence getLongSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public android.app.admin.PackagePolicy getManagedProfileCallerIdAccessPolicy() throws android.os.RemoteException;
    public android.app.admin.PackagePolicy getManagedProfileContactsAccessPolicy() throws android.os.RemoteException;
    public long getManagedProfileMaximumTimeOff(android.content.ComponentName p0) throws android.os.RemoteException;
    public android.app.admin.ManagedSubscriptionsPolicy getManagedSubscriptionsPolicy() throws android.os.RemoteException;
    public int getMaxPolicyStorageLimit(java.lang.String p0) throws android.os.RemoteException;
    public int getMaximumFailedPasswordsForWipe(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public long getMaximumTimeToLock(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getMeteredDataDisabledPackages(android.content.ComponentName p0) throws android.os.RemoteException;
    public int getMinimumRequiredWifiSecurityLevel() throws android.os.RemoteException;
    public int getMtePolicy(java.lang.String p0) throws android.os.RemoteException;
    public int getMultiuserManagedDeviceProvisioningState() throws android.os.RemoteException;
    public int getNearbyAppStreamingPolicy(int p0, boolean p1) throws android.os.RemoteException;
    public int getNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException;
    public int getOrganizationColor(android.content.ComponentName p0) throws android.os.RemoteException;
    public int getOrganizationColorForUser(int p0) throws android.os.RemoteException;
    public java.lang.CharSequence getOrganizationName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.CharSequence getOrganizationNameForUser(int p0) throws android.os.RemoteException;
    public java.util.List<android.telephony.data.ApnSetting> getOverrideApns(android.content.ComponentName p0) throws android.os.RemoteException;
    public android.content.pm.StringParceledListSlice getOwnerInstalledCaCerts(android.os.UserHandle p0) throws android.os.RemoteException;
    public int getPasswordComplexity(boolean p0) throws android.os.RemoteException;
    public long getPasswordExpiration(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public long getPasswordExpirationTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordMinimumLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordMinimumLetters(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordMinimumLowerCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.app.admin.PasswordMetrics getPasswordMinimumMetrics(int p0, boolean p1) throws android.os.RemoteException;
    public int getPasswordMinimumNonLetter(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordMinimumNumeric(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordMinimumSymbols(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordMinimumUpperCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordQuality(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.app.admin.SystemUpdateInfo getPendingSystemUpdate(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public int getPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public int getPermissionPolicy(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPermittedAccessibilityServices(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPermittedAccessibilityServicesForUser(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPermittedInputMethods(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPermittedInputMethodsAsUser(int p0) throws android.os.RemoteException;
    public int getPersonalAppsSuspendedReasons(android.content.ComponentName p0) throws android.os.RemoteException;
    public android.app.admin.PolicyValueTransport getPolicy(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.util.List<android.os.UserHandle> getPolicyManagedProfiles(android.os.UserHandle p0) throws android.os.RemoteException;
    public int getPolicySizeForAdmin(java.lang.String p0, android.app.admin.EnforcingAdmin p1) throws android.os.RemoteException;
    public java.util.List<android.app.admin.PreferentialNetworkServiceConfig> getPreferentialNetworkServiceConfigs() throws android.os.RemoteException;
    public android.content.ComponentName getProfileOwnerAsUser(int p0) throws android.os.RemoteException;
    public java.lang.String getProfileOwnerName(int p0) throws android.os.RemoteException;
    public android.content.ComponentName getProfileOwnerOrDeviceOwnerSupervisionComponent(android.os.UserHandle p0) throws android.os.RemoteException;
    public int getProfileWithMinimumFailedPasswordsForWipe(int p0, boolean p1) throws android.os.RemoteException;
    public void getRemoveWarning(android.content.ComponentName p0, android.os.RemoteCallback p1, int p2) throws android.os.RemoteException;
    public int getRequiredPasswordComplexity(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public long getRequiredStrongAuthTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.app.admin.PolicyValueTransport getResolvedDeviceWidePolicy(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.app.admin.PolicyValueTransport getResolvedPerUserPolicy(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.content.ComponentName getRestrictionsProvider(int p0) throws android.os.RemoteException;
    public boolean getScreenCaptureDisabled(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.lang.CharSequence getShortSupportMessage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.CharSequence getShortSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public java.lang.CharSequence getStartUserSessionMessage(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean getStorageEncryption(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public int getStorageEncryptionStatus(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.app.admin.ParcelableResource getString(java.lang.String p0) throws android.os.RemoteException;
    public int[] getSubscriptionIds(java.lang.String p0) throws android.os.RemoteException;
    public android.app.admin.SystemUpdatePolicy getSystemUpdatePolicy() throws android.os.RemoteException;
    public android.os.PersistableBundle getTransferOwnershipBundle() throws android.os.RemoteException;
    public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1, int p2, boolean p3) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getUserControlDisabledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public int getUserProvisioningState(int p0) throws android.os.RemoteException;
    public android.os.Bundle getUserRestrictions(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public android.os.Bundle getUserRestrictionsGlobally(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getWifiMacAddress(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public android.app.admin.WifiSsidPolicy getWifiSsidPolicy(java.lang.String p0) throws android.os.RemoteException;
    public boolean hasDeviceOwner() throws android.os.RemoteException;
    public boolean hasGrantedPolicy(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException;
    public boolean hasKeyPair(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean hasKeyPairWithScope(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean hasLockdownAdminConfiguredNetworks(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean hasManagedProfileCallerIdAccess(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean hasManagedProfileContactsAccess(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean hasUserSetupCompleted() throws android.os.RemoteException;
    public boolean installCaCert(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException;
    public boolean installExistingPackage(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean installKeyPair(android.content.ComponentName p0, java.lang.String p1, byte[] p2, byte[] p3, byte[] p4, java.lang.String p5, boolean p6, boolean p7) throws android.os.RemoteException;
    public void installUpdateFromFile(android.content.ComponentName p0, java.lang.String p1, android.os.ParcelFileDescriptor p2, android.app.admin.StartInstallingUpdateCallback p3) throws android.os.RemoteException;
    public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean isActivePasswordSufficient(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean isActivePasswordSufficientForDeviceRequirement() throws android.os.RemoteException;
    public boolean isAdminActive(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public boolean isAffiliatedUser(int p0) throws android.os.RemoteException;
    public boolean isAlwaysOnVpnLockdownEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isAlwaysOnVpnLockdownEnabledForUser(int p0) throws android.os.RemoteException;
    public boolean isApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public boolean isAuditLogEnabled(java.lang.String p0) throws android.os.RemoteException;
    public boolean isBackupServiceEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isCaCertApproved(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isCallerApplicationRestrictionsManagingPackage(java.lang.String p0) throws android.os.RemoteException;
    public boolean isCallingUserAffiliated() throws android.os.RemoteException;
    public boolean isCommonCriteriaModeEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isComplianceAcknowledgementRequired() throws android.os.RemoteException;
    public boolean isCurrentInputMethodSetByOwner() throws android.os.RemoteException;
    public boolean isDeviceFinanced(java.lang.String p0) throws android.os.RemoteException;
    public boolean isDeviceManaged(java.lang.String p0) throws android.os.RemoteException;
    public boolean isDevicePotentiallyStolen(java.lang.String p0) throws android.os.RemoteException;
    public boolean isDeviceProvisioned() throws android.os.RemoteException;
    public boolean isDeviceProvisioningConfigApplied() throws android.os.RemoteException;
    public boolean isDpcDownloaded() throws android.os.RemoteException;
    public boolean isEphemeralUser(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isFactoryResetProtectionPolicySupported() throws android.os.RemoteException;
    public boolean isInputMethodPermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public boolean isKeyPairGrantedToWifiAuth(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isLockTaskPermitted(java.lang.String p0) throws android.os.RemoteException;
    public boolean isLogoutEnabled() throws android.os.RemoteException;
    public boolean isManagedKiosk() throws android.os.RemoteException;
    public boolean isManagedProfile(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isMasterVolumeMuted(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isMeteredDataDisabledPackageForUser(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean isNetworkLoggingEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isNewUserDisclaimerAcknowledged(int p0) throws android.os.RemoteException;
    public boolean isNotificationListenerServicePermitted(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isOrganizationOwnedDeviceWithManagedProfile() throws android.os.RemoteException;
    public boolean isOutgoingTransferAllowedForSubscription(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isOverrideApnEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isPackageAllowedToAccessCalendarForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isPackageAllowedToBypassDevicePolicyManagementRoleQualification(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isPackageSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isPasswordSufficientAfterProfileUnification(int p0, int p1) throws android.os.RemoteException;
    public boolean isProvisioningAllowed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isRemovingAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public boolean isResetPasswordTokenActive(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isSafeOperation(int p0) throws android.os.RemoteException;
    public boolean isSecondaryLockscreenEnabled(android.os.UserHandle p0) throws android.os.RemoteException;
    public boolean isSecurityLoggingEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isStatusBarDisabled(java.lang.String p0) throws android.os.RemoteException;
    public boolean isSubscriptionEnterpriseManaged(android.telephony.SubscriptionInfo p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isSupervisionComponent(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isUnattendedManagedKiosk() throws android.os.RemoteException;
    public boolean isUninstallBlocked(java.lang.String p0) throws android.os.RemoteException;
    public boolean isUninstallInQueue(java.lang.String p0) throws android.os.RemoteException;
    public boolean isUsbDataSignalingEnabled(java.lang.String p0) throws android.os.RemoteException;
    public boolean isUsingUnifiedPassword(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List<android.os.UserHandle> listForegroundAffiliatedUsers() throws android.os.RemoteException;
    public java.util.List<java.lang.String> listPolicyExemptApps() throws android.os.RemoteException;
    public void lockNow(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public int logoutUser(android.content.ComponentName p0) throws android.os.RemoteException;
    public int logoutUserInternal() throws android.os.RemoteException;
    public void notifyLockTaskModeChanged(boolean p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void notifyPendingSystemUpdate(android.app.admin.SystemUpdateInfo p0) throws android.os.RemoteException;
    public boolean packageHasActiveAdmins(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void provisionFullyManagedDevice(android.app.admin.FullyManagedDeviceProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException;
    public void provisionMultiuserManagedDevice(android.app.admin.MultiuserManagedDeviceProvisioningParamsTransport p0, java.lang.String p1, android.app.admin.IDeviceProvisioningCallback p2) throws android.os.RemoteException;
    public void provisionMultiuserManagedUser(android.app.admin.MultiuserManagedUserProvisioningParamsTransport p0, java.lang.String p1) throws android.os.RemoteException;
    public void reboot(android.content.ComponentName p0) throws android.os.RemoteException;
    public void removeActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public boolean removeCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean removeKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean removeKeyPairWithScope(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean removeManagedProfile(int p0) throws android.os.RemoteException;
    public boolean removeOverrideApn(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void removeResolvedDeviceWidePolicyCallback(java.lang.String p0, java.lang.String p1, android.app.admin.IDevicePolicyValueCallback p2) throws android.os.RemoteException;
    public boolean removeUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public void reportFailedBiometricAttempt(int p0) throws android.os.RemoteException;
    public void reportFailedPasswordAttempt(int p0, boolean p1) throws android.os.RemoteException;
    public void reportKeyguardDismissed(int p0) throws android.os.RemoteException;
    public void reportKeyguardSecured(int p0) throws android.os.RemoteException;
    public void reportPasswordChanged(android.app.admin.PasswordMetrics p0, int p1) throws android.os.RemoteException;
    public void reportSuccessfulBiometricAttempt(int p0) throws android.os.RemoteException;
    public void reportSuccessfulPasswordAttempt(int p0) throws android.os.RemoteException;
    public boolean requestBugreport(android.content.ComponentName p0) throws android.os.RemoteException;
    public void resetDefaultCrossProfileIntentFilters(int p0) throws android.os.RemoteException;
    public void resetDrawables(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public boolean resetPassword(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean resetPasswordWithToken(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException;
    public void resetShouldAllowBypassingDevicePolicyManagementRoleQualificationState() throws android.os.RemoteException;
    public void resetStrings(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public java.util.List<android.app.admin.NetworkEvent> retrieveNetworkLogs(android.content.ComponentName p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice retrievePreRebootSecurityLogs(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice retrieveSecurityLogs(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void sendLostModeLocationUpdate(com.android.internal.infra.AndroidFuture<java.lang.Boolean> p0) throws android.os.RemoteException;
    public void setAccountManagementDisabled(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException;
    public void setActiveAdmin(android.content.ComponentName p0, boolean p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void setAffiliationIds(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public boolean setAlwaysOnVpnPackage(android.content.ComponentName p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) throws android.os.RemoteException;
    public void setAppFunctionsPolicy(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setApplicationExemptions(java.lang.String p0, java.lang.String p1, int[] p2) throws android.os.RemoteException;
    public boolean setApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException;
    public void setApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3, boolean p4) throws android.os.RemoteException;
    public void setApplicationRestrictionsBySystem(java.lang.String p0, java.lang.String p1, int p2, android.os.Bundle p3) throws android.os.RemoteException;
    public boolean setApplicationRestrictionsManagingPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setAuditLogEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setAuditLogEventsCallback(java.lang.String p0, android.app.admin.IAuditLogEventsCallback p1) throws android.os.RemoteException;
    public void setAutoTimeEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void setAutoTimePolicy(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setAutoTimeRequired(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setAutoTimeZoneEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void setAutoTimeZonePolicy(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setBackupServiceEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setBluetoothContactSharingDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setCameraDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException;
    public void setCertInstallerPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setCommonCriteriaModeEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void setConfiguredNetworksLockdownState(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void setContentProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setCredentialManagerPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException;
    public void setCrossProfileCalendarPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public void setCrossProfileCallerIdDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setCrossProfileContactsSearchDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setCrossProfilePackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public void setCrossProfileWidgetProviders(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public void setDefaultDialerApplication(java.lang.String p0) throws android.os.RemoteException;
    public void setDefaultSmsApplication(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public void setDelegatedScopes(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    public boolean setDeviceOwner(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setDeviceOwnerLockScreenInfo(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException;
    public void setDeviceOwnerType(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setDeviceProvisioningConfigApplied() throws android.os.RemoteException;
    public void setDpcDownloaded(boolean p0) throws android.os.RemoteException;
    public void setDrawables(java.util.List<android.app.admin.DevicePolicyDrawableResource> p0) throws android.os.RemoteException;
    public void setEndUserSessionMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public void setFactoryResetProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, android.app.admin.FactoryResetProtectionPolicy p2) throws android.os.RemoteException;
    public void setForceEphemeralUsers(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public int setGlobalPrivateDns(android.content.ComponentName p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.content.ComponentName setGlobalProxy(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setGlobalSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    public boolean setKeyGrantForApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException;
    public boolean setKeyGrantToWifiAuth(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public boolean setKeyPairCertificate(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, byte[] p3, byte[] p4, boolean p5) throws android.os.RemoteException;
    public boolean setKeyguardDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setKeyguardDisabledFeatures(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public void setLocationEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setLockTaskFeatures(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setLockTaskPackages(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException;
    public void setLogoutEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setLongSupportMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public void setManagedProfileCallerIdAccessPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException;
    public void setManagedProfileContactsAccessPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException;
    public void setManagedProfileMaximumTimeOff(android.content.ComponentName p0, long p1) throws android.os.RemoteException;
    public void setManagedSubscriptionsPolicy(android.app.admin.ManagedSubscriptionsPolicy p0) throws android.os.RemoteException;
    public void setMasterVolumeMuted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setMaxPolicyStorageLimit(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setMaximumFailedPasswordsForWipe(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public void setMaximumTimeToLock(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException;
    public java.util.List<java.lang.String> setMeteredDataDisabledPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public void setMinimumRequiredWifiSecurityLevel(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setMtePolicy(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setMtePolicyBySystem(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setNearbyAppStreamingPolicy(int p0, boolean p1) throws android.os.RemoteException;
    public void setNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException;
    public void setNetworkLoggingEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void setNextOperationSafety(int p0, int p1) throws android.os.RemoteException;
    public void setOrganizationColor(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setOrganizationColorForUser(int p0, int p1) throws android.os.RemoteException;
    public void setOrganizationIdForUser(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setOrganizationName(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException;
    public void setOverrideApnsEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public java.lang.String[] setPackagesSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2, boolean p3) throws android.os.RemoteException;
    public void setPasswordExpirationTimeout(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException;
    public void setPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordMinimumLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordMinimumLetters(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordMinimumLowerCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordMinimumNonLetter(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordMinimumNumeric(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordMinimumSymbols(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordMinimumUpperCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordQuality(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, android.os.RemoteCallback p5) throws android.os.RemoteException;
    public void setPermissionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean setPermittedAccessibilityServices(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public boolean setPermittedInputMethods(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2, boolean p3) throws android.os.RemoteException;
    public void setPersonalAppsSuspended(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setPolicy(java.lang.String p0, java.lang.String p1, int p2, android.app.admin.PolicyValueTransport p3) throws android.os.RemoteException;
    public void setPreferentialNetworkServiceConfigs(java.util.List<android.app.admin.PreferentialNetworkServiceConfig> p0) throws android.os.RemoteException;
    public void setProfileEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setProfileName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setProfileOwner(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setProfileOwnerOnOrganizationOwnedDevice(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setRecommendedGlobalProxy(android.content.ComponentName p0, android.net.ProxyInfo p1) throws android.os.RemoteException;
    public void setRequiredPasswordComplexity(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setRequiredStrongAuthTimeout(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException;
    public boolean setResetPasswordToken(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException;
    public void setRestrictionsProvider(android.content.ComponentName p0, android.content.ComponentName p1) throws android.os.RemoteException;
    public void setScreenCaptureDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException;
    public void setSecondaryLockscreenEnabled(android.content.ComponentName p0, boolean p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public void setSecureSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setSecurityLoggingEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void setShortSupportMessage(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException;
    public void setStartUserSessionMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public boolean setStatusBarDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public int setStorageEncryption(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setStrings(java.util.List<android.app.admin.DevicePolicyStringResource> p0) throws android.os.RemoteException;
    public void setSystemSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public void setSystemUpdatePolicy(android.content.ComponentName p0, java.lang.String p1, android.app.admin.SystemUpdatePolicy p2) throws android.os.RemoteException;
    public boolean setTime(android.content.ComponentName p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    public boolean setTimeZone(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setTrustAgentConfiguration(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException;
    public void setUninstallBlocked(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public void setUsbDataSignalingEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setUserControlDisabledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    public void setUserIcon(android.content.ComponentName p0, android.graphics.Bitmap p1) throws android.os.RemoteException;
    public void setUserProvisioningState(int p0, int p1) throws android.os.RemoteException;
    public void setUserRestriction(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException;
    public void setUserRestrictionForUser(java.lang.String p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException;
    public void setUserRestrictionGlobally(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setUserRestrictionGloballyFromSystem(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void setWifiSsidPolicy(java.lang.String p0, android.app.admin.WifiSsidPolicy p1) throws android.os.RemoteException;
    public boolean shouldAllowBypassingDevicePolicyManagementRoleQualification() throws android.os.RemoteException;
    public void startManagedQuickContact(java.lang.String p0, long p1, boolean p2, long p3, android.content.Intent p4) throws android.os.RemoteException;
    public void startMultiuserManagedDeviceProvisioning() throws android.os.RemoteException;
    public int startUserInBackground(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public boolean startViewCalendarEventInManagedProfile(java.lang.String p0, long p1, long p2, long p3, boolean p4, int p5) throws android.os.RemoteException;
    public int stopUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public boolean switchUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public void transferOwnership(android.content.ComponentName p0, android.content.ComponentName p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public boolean triggerDevicePolicyEngineMigration(boolean p0) throws android.os.RemoteException;
    public void uninstallCaCerts(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException;
    public void uninstallPackageWithActiveAdmins(java.lang.String p0) throws android.os.RemoteException;
    public boolean updateOverrideApn(android.content.ComponentName p0, int p1, android.telephony.data.ApnSetting p2) throws android.os.RemoteException;
    public void wipeDataWithReason(java.lang.String p0, int p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException;

    public static class Default implements android.app.admin.IDevicePolicyManager {
        public Default() {}
        public void acknowledgeDeviceCompliant() throws android.os.RemoteException {}
        public void acknowledgeNewUserDisclaimer(int p0) throws android.os.RemoteException {}
        public void addCrossProfileIntentFilter(android.content.ComponentName p0, java.lang.String p1, android.content.IntentFilter p2, int p3) throws android.os.RemoteException {}
        public boolean addCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public int addOverrideApn(android.content.ComponentName p0, android.telephony.data.ApnSetting p1) throws android.os.RemoteException { return 0; }
        public void addPersistentPreferredActivity(android.content.ComponentName p0, java.lang.String p1, android.content.IntentFilter p2, android.content.ComponentName p3) throws android.os.RemoteException {}
        public void addResolvedDeviceWidePolicyCallback(java.lang.String p0, java.lang.String p1, android.app.admin.IDevicePolicyValueCallback p2) throws android.os.RemoteException {}
        public boolean approveCaCert(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
        public boolean bindDeviceAdminServiceAsUser(android.content.ComponentName p0, android.app.IApplicationThread p1, android.os.IBinder p2, android.content.Intent p3, android.app.IServiceConnection p4, long p5, int p6) throws android.os.RemoteException { return false; }
        public void calculateHasIncompatibleAccounts() throws android.os.RemoteException {}
        public boolean canAdminGrantSensorsPermissions() throws android.os.RemoteException { return false; }
        public boolean canProfileOwnerResetPasswordWhenLocked(int p0) throws android.os.RemoteException { return false; }
        public boolean canUsbDataSignalingBeDisabled() throws android.os.RemoteException { return false; }
        public boolean checkDeviceIdentifierAccess(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public int checkProvisioningPrecondition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void choosePrivateKeyAlias(int p0, android.net.Uri p1, java.lang.String p2, android.os.IBinder p3) throws android.os.RemoteException {}
        public void clearApplicationUserData(android.content.ComponentName p0, java.lang.String p1, android.content.pm.IPackageDataObserver p2) throws android.os.RemoteException {}
        public void clearCrossProfileIntentFilters(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
        public void clearDeviceOwner(java.lang.String p0) throws android.os.RemoteException {}
        public void clearMultiuserDeviceManagement(java.lang.String p0) throws android.os.RemoteException {}
        public void clearOrganizationIdForUser(int p0) throws android.os.RemoteException {}
        public void clearPackagePersistentPreferredActivities(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void clearProfileOwner(android.content.ComponentName p0) throws android.os.RemoteException {}
        public boolean clearResetPasswordToken(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void clearSystemUpdatePolicyFreezePeriodRecord() throws android.os.RemoteException {}
        public android.content.Intent createAdminSupportIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.UserHandle createAndManageUser(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, int p4) throws android.os.RemoteException { return null; }
        public android.os.UserHandle createAndProvisionManagedProfile(android.app.admin.ManagedProfileProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.os.UserHandle createManagedProfile(android.app.admin.ManagedProfileProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void enableSystemApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public int enableSystemAppWithIntent(android.content.ComponentName p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException { return 0; }
        public void enforceCanManageCaCerts(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
        public void finalizeCreateManagedProfile(android.app.admin.ManagedProfileProvisioningParams p0, android.os.UserHandle p1) throws android.os.RemoteException {}
        public void finalizeWorkProfileProvisioning(android.os.UserHandle p0, android.accounts.Account p1) throws android.os.RemoteException {}
        public long forceNetworkLogs() throws android.os.RemoteException { return 0L; }
        public void forceRemoveActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public long forceSecurityLogs() throws android.os.RemoteException { return 0L; }
        public void forceSetMaxPolicyStorageLimit(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void forceUpdateUserSetupComplete(int p0) throws android.os.RemoteException {}
        public boolean generateKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.security.keystore.ParcelableKeyGenParameterSpec p3, int p4, android.security.keymaster.KeymasterCertificateChain p5) throws android.os.RemoteException { return false; }
        public android.security.keymaster.KeymasterCertificateChain generateKeyPairWithScope(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.security.keystore.ParcelableKeyGenParameterSpec p3, int p4, int p5) throws android.os.RemoteException { return null; }
        public java.lang.String[] getAccountTypesWithManagementDisabled(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
        public java.util.List<android.content.ComponentName> getActiveAdmins(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getAffiliationIds(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public int getAggregatedPasswordComplexityForUser(int p0, boolean p1) throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getAllCrossProfilePackages(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getAlwaysOnVpnLockdownAllowlist(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.lang.String getAlwaysOnVpnPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.lang.String getAlwaysOnVpnPackageForUser(int p0) throws android.os.RemoteException { return null; }
        public int getAppFunctionsPolicy(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int[] getApplicationExemptions(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.Bundle getApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return null; }
        public android.os.Bundle getApplicationRestrictionsBySystem(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean getAutoTimeEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public int getAutoTimePolicy(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public boolean getAutoTimeRequired() throws android.os.RemoteException { return false; }
        public boolean getAutoTimeZoneEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public int getAutoTimeZonePolicy(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public java.util.List<android.os.UserHandle> getBindDeviceAdminTargetUsers(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean getBluetoothContactSharingDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean getBluetoothContactSharingDisabledForUser(int p0) throws android.os.RemoteException { return false; }
        public boolean getCameraDisabled(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return false; }
        public java.lang.String getCertInstallerPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public int getContentProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public android.app.admin.PackagePolicy getCredentialManagerPolicy(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getCrossProfileCalendarPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getCrossProfileCalendarPackagesForUser(int p0) throws android.os.RemoteException { return null; }
        public boolean getCrossProfileCallerIdDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean getCrossProfileCallerIdDisabledForUser(int p0) throws android.os.RemoteException { return false; }
        public boolean getCrossProfileContactsSearchDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean getCrossProfileContactsSearchDisabledForUser(int p0) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getCrossProfilePackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int getCurrentFailedPasswordAttempts(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getDefaultCrossProfilePackages() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getDelegatePackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getDelegatedScopes(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getDeviceOwnerComponent(boolean p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getDeviceOwnerComponentOnUser(int p0) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getDeviceOwnerLockScreenInfo() throws android.os.RemoteException { return null; }
        public java.lang.String getDeviceOwnerName() throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getDeviceOwnerOrganizationName() throws android.os.RemoteException { return null; }
        public int getDeviceOwnerType(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public int getDeviceOwnerUserId() throws android.os.RemoteException { return 0; }
        public android.app.admin.DevicePolicyState getDevicePolicyState() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getDisallowedSystemApps(android.content.ComponentName p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean getDoNotAskCredentialsOnBoot() throws android.os.RemoteException { return false; }
        public android.app.admin.ParcelableResource getDrawable(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getEndUserSessionMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public android.app.admin.EnforcingAdmin getEnforcingAdmin(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle getEnforcingAdminAndUserDetails(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.admin.EnforcingAdmin> getEnforcingAdminsForPolicy(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public java.lang.String getEnrollmentSpecificId(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.app.admin.FactoryResetProtectionPolicy getFactoryResetProtectionPolicy(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.lang.String getFinancedDeviceKioskRoleHolder(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean getForceEphemeralUsers(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public java.lang.String getGlobalPrivateDnsHost(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public int getGlobalPrivateDnsMode(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public android.content.ComponentName getGlobalProxyAdmin(int p0) throws android.os.RemoteException { return null; }
        public int getHeadlessDeviceOwnerMode(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.app.admin.ParcelableGranteeMap getKeyPairGrants(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int getKeyguardDisabledFeatures(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public long getLastBugReportRequestTime() throws android.os.RemoteException { return 0L; }
        public long getLastNetworkLogRetrievalTime() throws android.os.RemoteException { return 0L; }
        public long getLastSecurityLogRetrievalTime() throws android.os.RemoteException { return 0L; }
        public int getLockTaskFeatures(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public java.lang.String[] getLockTaskPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int getLogoutUserId() throws android.os.RemoteException { return 0; }
        public java.lang.CharSequence getLongSupportMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getLongSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
        public android.app.admin.PackagePolicy getManagedProfileCallerIdAccessPolicy() throws android.os.RemoteException { return null; }
        public android.app.admin.PackagePolicy getManagedProfileContactsAccessPolicy() throws android.os.RemoteException { return null; }
        public long getManagedProfileMaximumTimeOff(android.content.ComponentName p0) throws android.os.RemoteException { return 0L; }
        public android.app.admin.ManagedSubscriptionsPolicy getManagedSubscriptionsPolicy() throws android.os.RemoteException { return null; }
        public int getMaxPolicyStorageLimit(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getMaximumFailedPasswordsForWipe(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public long getMaximumTimeToLock(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
        public java.util.List<java.lang.String> getMeteredDataDisabledPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public int getMinimumRequiredWifiSecurityLevel() throws android.os.RemoteException { return 0; }
        public int getMtePolicy(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getMultiuserManagedDeviceProvisioningState() throws android.os.RemoteException { return 0; }
        public int getNearbyAppStreamingPolicy(int p0, boolean p1) throws android.os.RemoteException { return 0; }
        public int getNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException { return 0; }
        public int getOrganizationColor(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public int getOrganizationColorForUser(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.CharSequence getOrganizationName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getOrganizationNameForUser(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.telephony.data.ApnSetting> getOverrideApns(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public android.content.pm.StringParceledListSlice getOwnerInstalledCaCerts(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
        public int getPasswordComplexity(boolean p0) throws android.os.RemoteException { return 0; }
        public long getPasswordExpiration(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
        public long getPasswordExpirationTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
        public int getPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int getPasswordMinimumLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int getPasswordMinimumLetters(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int getPasswordMinimumLowerCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public android.app.admin.PasswordMetrics getPasswordMinimumMetrics(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public int getPasswordMinimumNonLetter(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int getPasswordMinimumNumeric(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int getPasswordMinimumSymbols(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int getPasswordMinimumUpperCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int getPasswordQuality(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public android.app.admin.SystemUpdateInfo getPendingSystemUpdate(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int getPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public int getPermissionPolicy(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getPermittedAccessibilityServices(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPermittedAccessibilityServicesForUser(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPermittedInputMethods(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPermittedInputMethodsAsUser(int p0) throws android.os.RemoteException { return null; }
        public int getPersonalAppsSuspendedReasons(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public android.app.admin.PolicyValueTransport getPolicy(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public java.util.List<android.os.UserHandle> getPolicyManagedProfiles(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
        public int getPolicySizeForAdmin(java.lang.String p0, android.app.admin.EnforcingAdmin p1) throws android.os.RemoteException { return 0; }
        public java.util.List<android.app.admin.PreferentialNetworkServiceConfig> getPreferentialNetworkServiceConfigs() throws android.os.RemoteException { return null; }
        public android.content.ComponentName getProfileOwnerAsUser(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getProfileOwnerName(int p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getProfileOwnerOrDeviceOwnerSupervisionComponent(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
        public int getProfileWithMinimumFailedPasswordsForWipe(int p0, boolean p1) throws android.os.RemoteException { return 0; }
        public void getRemoveWarning(android.content.ComponentName p0, android.os.RemoteCallback p1, int p2) throws android.os.RemoteException {}
        public int getRequiredPasswordComplexity(java.lang.String p0, boolean p1) throws android.os.RemoteException { return 0; }
        public long getRequiredStrongAuthTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
        public android.app.admin.PolicyValueTransport getResolvedDeviceWidePolicy(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.app.admin.PolicyValueTransport getResolvedPerUserPolicy(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getRestrictionsProvider(int p0) throws android.os.RemoteException { return null; }
        public boolean getScreenCaptureDisabled(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getShortSupportMessage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getShortSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getStartUserSessionMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean getStorageEncryption(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public int getStorageEncryptionStatus(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public android.app.admin.ParcelableResource getString(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int[] getSubscriptionIds(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.app.admin.SystemUpdatePolicy getSystemUpdatePolicy() throws android.os.RemoteException { return null; }
        public android.os.PersistableBundle getTransferOwnershipBundle() throws android.os.RemoteException { return null; }
        public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1, int p2, boolean p3) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getUserControlDisabledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int getUserProvisioningState(int p0) throws android.os.RemoteException { return 0; }
        public android.os.Bundle getUserRestrictions(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.os.Bundle getUserRestrictionsGlobally(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getWifiMacAddress(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.app.admin.WifiSsidPolicy getWifiSsidPolicy(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean hasDeviceOwner() throws android.os.RemoteException { return false; }
        public boolean hasGrantedPolicy(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean hasKeyPair(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean hasKeyPairWithScope(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean hasLockdownAdminConfiguredNetworks(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean hasManagedProfileCallerIdAccess(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean hasManagedProfileContactsAccess(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean hasUserSetupCompleted() throws android.os.RemoteException { return false; }
        public boolean installCaCert(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException { return false; }
        public boolean installExistingPackage(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean installKeyPair(android.content.ComponentName p0, java.lang.String p1, byte[] p2, byte[] p3, byte[] p4, java.lang.String p5, boolean p6, boolean p7) throws android.os.RemoteException { return false; }
        public void installUpdateFromFile(android.content.ComponentName p0, java.lang.String p1, android.os.ParcelFileDescriptor p2, android.app.admin.StartInstallingUpdateCallback p3) throws android.os.RemoteException {}
        public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isActivePasswordSufficient(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean isActivePasswordSufficientForDeviceRequirement() throws android.os.RemoteException { return false; }
        public boolean isAdminActive(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isAffiliatedUser(int p0) throws android.os.RemoteException { return false; }
        public boolean isAlwaysOnVpnLockdownEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isAlwaysOnVpnLockdownEnabledForUser(int p0) throws android.os.RemoteException { return false; }
        public boolean isApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return false; }
        public boolean isAuditLogEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isBackupServiceEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isCaCertApproved(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isCallerApplicationRestrictionsManagingPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isCallingUserAffiliated() throws android.os.RemoteException { return false; }
        public boolean isCommonCriteriaModeEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isComplianceAcknowledgementRequired() throws android.os.RemoteException { return false; }
        public boolean isCurrentInputMethodSetByOwner() throws android.os.RemoteException { return false; }
        public boolean isDeviceFinanced(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isDeviceManaged(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isDevicePotentiallyStolen(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isDeviceProvisioned() throws android.os.RemoteException { return false; }
        public boolean isDeviceProvisioningConfigApplied() throws android.os.RemoteException { return false; }
        public boolean isDpcDownloaded() throws android.os.RemoteException { return false; }
        public boolean isEphemeralUser(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isFactoryResetProtectionPolicySupported() throws android.os.RemoteException { return false; }
        public boolean isInputMethodPermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return false; }
        public boolean isKeyPairGrantedToWifiAuth(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isLockTaskPermitted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isLogoutEnabled() throws android.os.RemoteException { return false; }
        public boolean isManagedKiosk() throws android.os.RemoteException { return false; }
        public boolean isManagedProfile(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isMasterVolumeMuted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isMeteredDataDisabledPackageForUser(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isNetworkLoggingEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isNewUserDisclaimerAcknowledged(int p0) throws android.os.RemoteException { return false; }
        public boolean isNotificationListenerServicePermitted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isOrganizationOwnedDeviceWithManagedProfile() throws android.os.RemoteException { return false; }
        public boolean isOutgoingTransferAllowedForSubscription(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isOverrideApnEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isPackageAllowedToAccessCalendarForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isPackageAllowedToBypassDevicePolicyManagementRoleQualification(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isPackageSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isPasswordSufficientAfterProfileUnification(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isProvisioningAllowed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isRemovingAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isResetPasswordTokenActive(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isSafeOperation(int p0) throws android.os.RemoteException { return false; }
        public boolean isSecondaryLockscreenEnabled(android.os.UserHandle p0) throws android.os.RemoteException { return false; }
        public boolean isSecurityLoggingEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isStatusBarDisabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isSubscriptionEnterpriseManaged(android.telephony.SubscriptionInfo p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isSupervisionComponent(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isUnattendedManagedKiosk() throws android.os.RemoteException { return false; }
        public boolean isUninstallBlocked(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isUninstallInQueue(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isUsbDataSignalingEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isUsingUnifiedPassword(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.os.UserHandle> listForegroundAffiliatedUsers() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> listPolicyExemptApps() throws android.os.RemoteException { return null; }
        public void lockNow(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public int logoutUser(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public int logoutUserInternal() throws android.os.RemoteException { return 0; }
        public void notifyLockTaskModeChanged(boolean p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void notifyPendingSystemUpdate(android.app.admin.SystemUpdateInfo p0) throws android.os.RemoteException {}
        public boolean packageHasActiveAdmins(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void provisionFullyManagedDevice(android.app.admin.FullyManagedDeviceProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException {}
        public void provisionMultiuserManagedDevice(android.app.admin.MultiuserManagedDeviceProvisioningParamsTransport p0, java.lang.String p1, android.app.admin.IDeviceProvisioningCallback p2) throws android.os.RemoteException {}
        public void provisionMultiuserManagedUser(android.app.admin.MultiuserManagedUserProvisioningParamsTransport p0, java.lang.String p1) throws android.os.RemoteException {}
        public void reboot(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void removeActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public boolean removeCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean removeKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean removeKeyPairWithScope(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean removeManagedProfile(int p0) throws android.os.RemoteException { return false; }
        public boolean removeOverrideApn(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public void removeResolvedDeviceWidePolicyCallback(java.lang.String p0, java.lang.String p1, android.app.admin.IDevicePolicyValueCallback p2) throws android.os.RemoteException {}
        public boolean removeUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
        public void reportFailedBiometricAttempt(int p0) throws android.os.RemoteException {}
        public void reportFailedPasswordAttempt(int p0, boolean p1) throws android.os.RemoteException {}
        public void reportKeyguardDismissed(int p0) throws android.os.RemoteException {}
        public void reportKeyguardSecured(int p0) throws android.os.RemoteException {}
        public void reportPasswordChanged(android.app.admin.PasswordMetrics p0, int p1) throws android.os.RemoteException {}
        public void reportSuccessfulBiometricAttempt(int p0) throws android.os.RemoteException {}
        public void reportSuccessfulPasswordAttempt(int p0) throws android.os.RemoteException {}
        public boolean requestBugreport(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void resetDefaultCrossProfileIntentFilters(int p0) throws android.os.RemoteException {}
        public void resetDrawables(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public boolean resetPassword(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean resetPasswordWithToken(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException { return false; }
        public void resetShouldAllowBypassingDevicePolicyManagementRoleQualificationState() throws android.os.RemoteException {}
        public void resetStrings(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public java.util.List<android.app.admin.NetworkEvent> retrieveNetworkLogs(android.content.ComponentName p0, java.lang.String p1, long p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice retrievePreRebootSecurityLogs(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice retrieveSecurityLogs(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void sendLostModeLocationUpdate(com.android.internal.infra.AndroidFuture<java.lang.Boolean> p0) throws android.os.RemoteException {}
        public void setAccountManagementDisabled(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException {}
        public void setActiveAdmin(android.content.ComponentName p0, boolean p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setAffiliationIds(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public boolean setAlwaysOnVpnPackage(android.content.ComponentName p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) throws android.os.RemoteException { return false; }
        public void setAppFunctionsPolicy(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setApplicationExemptions(java.lang.String p0, java.lang.String p1, int[] p2) throws android.os.RemoteException {}
        public boolean setApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException { return false; }
        public void setApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3, boolean p4) throws android.os.RemoteException {}
        public void setApplicationRestrictionsBySystem(java.lang.String p0, java.lang.String p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public boolean setApplicationRestrictionsManagingPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void setAuditLogEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void setAuditLogEventsCallback(java.lang.String p0, android.app.admin.IAuditLogEventsCallback p1) throws android.os.RemoteException {}
        public void setAutoTimeEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void setAutoTimePolicy(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setAutoTimeRequired(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void setAutoTimeZoneEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void setAutoTimeZonePolicy(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setBackupServiceEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void setBluetoothContactSharingDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void setCameraDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException {}
        public void setCertInstallerPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setCommonCriteriaModeEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void setConfiguredNetworksLockdownState(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void setContentProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setCredentialManagerPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException {}
        public void setCrossProfileCalendarPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public void setCrossProfileCallerIdDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void setCrossProfileContactsSearchDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void setCrossProfilePackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public void setCrossProfileWidgetProviders(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public void setDefaultDialerApplication(java.lang.String p0) throws android.os.RemoteException {}
        public void setDefaultSmsApplication(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public void setDelegatedScopes(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        public boolean setDeviceOwner(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public void setDeviceOwnerLockScreenInfo(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
        public void setDeviceOwnerType(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public void setDeviceProvisioningConfigApplied() throws android.os.RemoteException {}
        public void setDpcDownloaded(boolean p0) throws android.os.RemoteException {}
        public void setDrawables(java.util.List<android.app.admin.DevicePolicyDrawableResource> p0) throws android.os.RemoteException {}
        public void setEndUserSessionMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public void setFactoryResetProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, android.app.admin.FactoryResetProtectionPolicy p2) throws android.os.RemoteException {}
        public void setForceEphemeralUsers(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public int setGlobalPrivateDns(android.content.ComponentName p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public android.content.ComponentName setGlobalProxy(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void setGlobalSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        public boolean setKeyGrantForApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return false; }
        public boolean setKeyGrantToWifiAuth(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean setKeyPairCertificate(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, byte[] p3, byte[] p4, boolean p5) throws android.os.RemoteException { return false; }
        public boolean setKeyguardDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return false; }
        public void setKeyguardDisabledFeatures(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void setLocationEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void setLockTaskFeatures(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setLockTaskPackages(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public void setLogoutEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void setLongSupportMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public void setManagedProfileCallerIdAccessPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException {}
        public void setManagedProfileContactsAccessPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException {}
        public void setManagedProfileMaximumTimeOff(android.content.ComponentName p0, long p1) throws android.os.RemoteException {}
        public void setManagedSubscriptionsPolicy(android.app.admin.ManagedSubscriptionsPolicy p0) throws android.os.RemoteException {}
        public void setMasterVolumeMuted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void setMaxPolicyStorageLimit(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setMaximumFailedPasswordsForWipe(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void setMaximumTimeToLock(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> setMeteredDataDisabledPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return null; }
        public void setMinimumRequiredWifiSecurityLevel(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setMtePolicy(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setMtePolicyBySystem(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setNearbyAppStreamingPolicy(int p0, boolean p1) throws android.os.RemoteException {}
        public void setNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException {}
        public void setNetworkLoggingEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void setNextOperationSafety(int p0, int p1) throws android.os.RemoteException {}
        public void setOrganizationColor(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public void setOrganizationColorForUser(int p0, int p1) throws android.os.RemoteException {}
        public void setOrganizationIdForUser(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setOrganizationName(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
        public void setOverrideApnsEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public java.lang.String[] setPackagesSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2, boolean p3) throws android.os.RemoteException { return null; }
        public void setPasswordExpirationTimeout(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException {}
        public void setPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setPasswordMinimumLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setPasswordMinimumLetters(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setPasswordMinimumLowerCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setPasswordMinimumNonLetter(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setPasswordMinimumNumeric(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setPasswordMinimumSymbols(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setPasswordMinimumUpperCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setPasswordQuality(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, android.os.RemoteCallback p5) throws android.os.RemoteException {}
        public void setPermissionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public boolean setPermittedAccessibilityServices(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return false; }
        public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return false; }
        public boolean setPermittedInputMethods(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2, boolean p3) throws android.os.RemoteException { return false; }
        public void setPersonalAppsSuspended(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void setPolicy(java.lang.String p0, java.lang.String p1, int p2, android.app.admin.PolicyValueTransport p3) throws android.os.RemoteException {}
        public void setPreferentialNetworkServiceConfigs(java.util.List<android.app.admin.PreferentialNetworkServiceConfig> p0) throws android.os.RemoteException {}
        public void setProfileEnabled(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void setProfileName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean setProfileOwner(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public void setProfileOwnerOnOrganizationOwnedDevice(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setRecommendedGlobalProxy(android.content.ComponentName p0, android.net.ProxyInfo p1) throws android.os.RemoteException {}
        public void setRequiredPasswordComplexity(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setRequiredStrongAuthTimeout(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException {}
        public boolean setResetPasswordToken(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException { return false; }
        public void setRestrictionsProvider(android.content.ComponentName p0, android.content.ComponentName p1) throws android.os.RemoteException {}
        public void setScreenCaptureDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException {}
        public void setSecondaryLockscreenEnabled(android.content.ComponentName p0, boolean p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public void setSecureSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setSecurityLoggingEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void setShortSupportMessage(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
        public void setStartUserSessionMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public boolean setStatusBarDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
        public int setStorageEncryption(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return 0; }
        public void setStrings(java.util.List<android.app.admin.DevicePolicyStringResource> p0) throws android.os.RemoteException {}
        public void setSystemSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public void setSystemUpdatePolicy(android.content.ComponentName p0, java.lang.String p1, android.app.admin.SystemUpdatePolicy p2) throws android.os.RemoteException {}
        public boolean setTime(android.content.ComponentName p0, java.lang.String p1, long p2) throws android.os.RemoteException { return false; }
        public boolean setTimeZone(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void setTrustAgentConfiguration(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException {}
        public void setUninstallBlocked(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public void setUsbDataSignalingEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void setUserControlDisabledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        public void setUserIcon(android.content.ComponentName p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
        public void setUserProvisioningState(int p0, int p1) throws android.os.RemoteException {}
        public void setUserRestriction(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException {}
        public void setUserRestrictionForUser(java.lang.String p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException {}
        public void setUserRestrictionGlobally(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setUserRestrictionGloballyFromSystem(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void setWifiSsidPolicy(java.lang.String p0, android.app.admin.WifiSsidPolicy p1) throws android.os.RemoteException {}
        public boolean shouldAllowBypassingDevicePolicyManagementRoleQualification() throws android.os.RemoteException { return false; }
        public void startManagedQuickContact(java.lang.String p0, long p1, boolean p2, long p3, android.content.Intent p4) throws android.os.RemoteException {}
        public void startMultiuserManagedDeviceProvisioning() throws android.os.RemoteException {}
        public int startUserInBackground(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
        public boolean startViewCalendarEventInManagedProfile(java.lang.String p0, long p1, long p2, long p3, boolean p4, int p5) throws android.os.RemoteException { return false; }
        public int stopUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
        public boolean switchUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
        public void transferOwnership(android.content.ComponentName p0, android.content.ComponentName p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public boolean triggerDevicePolicyEngineMigration(boolean p0) throws android.os.RemoteException { return false; }
        public void uninstallCaCerts(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public void uninstallPackageWithActiveAdmins(java.lang.String p0) throws android.os.RemoteException {}
        public boolean updateOverrideApn(android.content.ComponentName p0, int p1, android.telephony.data.ApnSetting p2) throws android.os.RemoteException { return false; }
        public void wipeDataWithReason(java.lang.String p0, int p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.admin.IDevicePolicyManager {
        public static final java.lang.String DESCRIPTOR = "android.app.admin.IDevicePolicyManager";
        static final int TRANSACTION_acknowledgeDeviceCompliant = 362;
        static final int TRANSACTION_acknowledgeNewUserDisclaimer = 174;
        static final int TRANSACTION_addCrossProfileIntentFilter = 146;
        static final int TRANSACTION_addCrossProfileWidgetProvider = 224;
        static final int TRANSACTION_addOverrideApn = 327;
        static final int TRANSACTION_addPersistentPreferredActivity = 127;
        static final int TRANSACTION_addResolvedDeviceWidePolicyCallback = 433;
        static final int TRANSACTION_approveCaCert = 108;
        static final int TRANSACTION_bindDeviceAdminServiceAsUser = 303;
        static final int TRANSACTION_calculateHasIncompatibleAccounts = 414;
        static final int TRANSACTION_canAdminGrantSensorsPermissions = 380;
        static final int TRANSACTION_canProfileOwnerResetPasswordWhenLocked = 364;
        static final int TRANSACTION_canUsbDataSignalingBeDisabled = 383;
        static final int TRANSACTION_checkDeviceIdentifierAccess = 99;
        static final int TRANSACTION_checkProvisioningPrecondition = 256;
        static final int TRANSACTION_choosePrivateKeyAlias = 115;
        static final int TRANSACTION_clearApplicationUserData = 315;
        static final int TRANSACTION_clearCrossProfileIntentFilters = 147;
        static final int TRANSACTION_clearDeviceOwner = 84;
        static final int TRANSACTION_clearMultiuserDeviceManagement = 70;
        static final int TRANSACTION_clearOrganizationIdForUser = 270;
        static final int TRANSACTION_clearPackagePersistentPreferredActivities = 128;
        static final int TRANSACTION_clearProfileOwner = 96;
        static final int TRANSACTION_clearResetPasswordToken = 310;
        static final int TRANSACTION_clearSystemUpdatePolicyFreezePeriodRecord = 244;
        static final int TRANSACTION_createAdminSupportIntent = 159;
        static final int TRANSACTION_createAndManageUser = 165;
        static final int TRANSACTION_createAndProvisionManagedProfile = 369;
        static final int TRANSACTION_createManagedProfile = 370;
        static final int TRANSACTION_enableSystemApp = 176;
        static final int TRANSACTION_enableSystemAppWithIntent = 177;
        static final int TRANSACTION_enforceCanManageCaCerts = 107;
        static final int TRANSACTION_finalizeCreateManagedProfile = 371;
        static final int TRANSACTION_finalizeWorkProfileProvisioning = 375;
        static final int TRANSACTION_forceNetworkLogs = 287;
        static final int TRANSACTION_forceRemoveActiveAdmin = 69;
        static final int TRANSACTION_forceSecurityLogs = 288;
        static final int TRANSACTION_forceSetMaxPolicyStorageLimit = 419;
        static final int TRANSACTION_forceUpdateUserSetupComplete = 297;
        static final int TRANSACTION_generateKeyPair = 113;
        static final int TRANSACTION_generateKeyPairWithScope = 430;
        static final int TRANSACTION_getAccountTypesWithManagementDisabled = 180;
        static final int TRANSACTION_getAccountTypesWithManagementDisabledAsUser = 181;
        static final int TRANSACTION_getActiveAdmins = 65;
        static final int TRANSACTION_getAffiliationIds = 280;
        static final int TRANSACTION_getAggregatedPasswordComplexityForUser = 29;
        static final int TRANSACTION_getAllCrossProfilePackages = 345;
        static final int TRANSACTION_getAlwaysOnVpnLockdownAllowlist = 126;
        static final int TRANSACTION_getAlwaysOnVpnPackage = 122;
        static final int TRANSACTION_getAlwaysOnVpnPackageForUser = 123;
        static final int TRANSACTION_getAppFunctionsPolicy = 425;
        static final int TRANSACTION_getApplicationExemptions = 403;
        static final int TRANSACTION_getApplicationRestrictions = 132;
        static final int TRANSACTION_getApplicationRestrictionsBySystem = 136;
        static final int TRANSACTION_getApplicationRestrictionsManagingPackage = 134;
        static final int TRANSACTION_getAutoTimeEnabled = 231;
        static final int TRANSACTION_getAutoTimePolicy = 233;
        static final int TRANSACTION_getAutoTimeRequired = 229;
        static final int TRANSACTION_getAutoTimeZoneEnabled = 235;
        static final int TRANSACTION_getAutoTimeZonePolicy = 237;
        static final int TRANSACTION_getBindDeviceAdminTargetUsers = 304;
        static final int TRANSACTION_getBluetoothContactSharingDisabled = 220;
        static final int TRANSACTION_getBluetoothContactSharingDisabledForUser = 221;
        static final int TRANSACTION_getCameraDisabled = 54;
        static final int TRANSACTION_getCertInstallerPackage = 120;
        static final int TRANSACTION_getContentProtectionPolicy = 416;
        static final int TRANSACTION_getCredentialManagerPolicy = 215;
        static final int TRANSACTION_getCrossProfileCalendarPackages = 340;
        static final int TRANSACTION_getCrossProfileCalendarPackagesForUser = 342;
        static final int TRANSACTION_getCrossProfileCallerIdDisabled = 205;
        static final int TRANSACTION_getCrossProfileCallerIdDisabledForUser = 206;
        static final int TRANSACTION_getCrossProfileContactsSearchDisabled = 208;
        static final int TRANSACTION_getCrossProfileContactsSearchDisabledForUser = 209;
        static final int TRANSACTION_getCrossProfilePackages = 344;
        static final int TRANSACTION_getCrossProfileWidgetProviders = 227;
        static final int TRANSACTION_getCurrentFailedPasswordAttempts = 31;
        static final int TRANSACTION_getDefaultCrossProfilePackages = 346;
        static final int TRANSACTION_getDelegatePackages = 118;
        static final int TRANSACTION_getDelegatedScopes = 117;
        static final int TRANSACTION_getDeviceOwnerComponent = 80;
        static final int TRANSACTION_getDeviceOwnerComponentOnUser = 81;
        static final int TRANSACTION_getDeviceOwnerLockScreenInfo = 101;
        static final int TRANSACTION_getDeviceOwnerName = 83;
        static final int TRANSACTION_getDeviceOwnerOrganizationName = 275;
        static final int TRANSACTION_getDeviceOwnerType = 378;
        static final int TRANSACTION_getDeviceOwnerUserId = 85;
        static final int TRANSACTION_getDevicePolicyState = 410;
        static final int TRANSACTION_getDisallowedSystemApps = 318;
        static final int TRANSACTION_getDoNotAskCredentialsOnBoot = 248;
        static final int TRANSACTION_getDrawable = 392;
        static final int TRANSACTION_getEndUserSessionMessage = 324;
        static final int TRANSACTION_getEnforcingAdmin = 161;
        static final int TRANSACTION_getEnforcingAdminAndUserDetails = 160;
        static final int TRANSACTION_getEnforcingAdminsForPolicy = 162;
        static final int TRANSACTION_getEnrollmentSpecificId = 367;
        static final int TRANSACTION_getFactoryResetProtectionPolicy = 43;
        static final int TRANSACTION_getFinancedDeviceKioskRoleHolder = 413;
        static final int TRANSACTION_getForceEphemeralUsers = 239;
        static final int TRANSACTION_getGlobalPrivateDnsHost = 336;
        static final int TRANSACTION_getGlobalPrivateDnsMode = 335;
        static final int TRANSACTION_getGlobalProxyAdmin = 47;
        static final int TRANSACTION_getHeadlessDeviceOwnerMode = 422;
        static final int TRANSACTION_getKeepUninstalledPackages = 258;
        static final int TRANSACTION_getKeyPairGrants = 351;
        static final int TRANSACTION_getKeyguardDisabledFeatures = 62;
        static final int TRANSACTION_getLastBugReportRequestTime = 307;
        static final int TRANSACTION_getLastNetworkLogRetrievalTime = 308;
        static final int TRANSACTION_getLastSecurityLogRetrievalTime = 306;
        static final int TRANSACTION_getLockTaskFeatures = 190;
        static final int TRANSACTION_getLockTaskPackages = 187;
        static final int TRANSACTION_getLogoutUserId = 172;
        static final int TRANSACTION_getLongSupportMessage = 265;
        static final int TRANSACTION_getLongSupportMessageForUser = 267;
        static final int TRANSACTION_getManagedProfileCallerIdAccessPolicy = 212;
        static final int TRANSACTION_getManagedProfileContactsAccessPolicy = 217;
        static final int TRANSACTION_getManagedProfileMaximumTimeOff = 360;
        static final int TRANSACTION_getManagedSubscriptionsPolicy = 408;
        static final int TRANSACTION_getMaxPolicyStorageLimit = 420;
        static final int TRANSACTION_getMaximumFailedPasswordsForWipe = 34;
        static final int TRANSACTION_getMaximumTimeToLock = 37;
        static final int TRANSACTION_getMeteredDataDisabledPackages = 326;
        static final int TRANSACTION_getMinimumRequiredWifiSecurityLevel = 385;
        static final int TRANSACTION_getMtePolicy = 406;
        static final int TRANSACTION_getMultiuserManagedDeviceProvisioningState = 87;
        static final int TRANSACTION_getNearbyAppStreamingPolicy = 60;
        static final int TRANSACTION_getNearbyNotificationStreamingPolicy = 58;
        static final int TRANSACTION_getOrganizationColor = 271;
        static final int TRANSACTION_getOrganizationColorForUser = 272;
        static final int TRANSACTION_getOrganizationName = 274;
        static final int TRANSACTION_getOrganizationNameForUser = 276;
        static final int TRANSACTION_getOverrideApns = 330;
        static final int TRANSACTION_getOwnerInstalledCaCerts = 314;
        static final int TRANSACTION_getPasswordComplexity = 26;
        static final int TRANSACTION_getPasswordExpiration = 22;
        static final int TRANSACTION_getPasswordExpirationTimeout = 21;
        static final int TRANSACTION_getPasswordHistoryLength = 19;
        static final int TRANSACTION_getPasswordMinimumLength = 4;
        static final int TRANSACTION_getPasswordMinimumLetters = 10;
        static final int TRANSACTION_getPasswordMinimumLowerCase = 8;
        static final int TRANSACTION_getPasswordMinimumMetrics = 17;
        static final int TRANSACTION_getPasswordMinimumNonLetter = 16;
        static final int TRANSACTION_getPasswordMinimumNumeric = 12;
        static final int TRANSACTION_getPasswordMinimumSymbols = 14;
        static final int TRANSACTION_getPasswordMinimumUpperCase = 6;
        static final int TRANSACTION_getPasswordQuality = 2;
        static final int TRANSACTION_getPendingSystemUpdate = 250;
        static final int TRANSACTION_getPermissionGrantState = 254;
        static final int TRANSACTION_getPermissionPolicy = 252;
        static final int TRANSACTION_getPermittedAccessibilityServices = 149;
        static final int TRANSACTION_getPermittedAccessibilityServicesForUser = 150;
        static final int TRANSACTION_getPermittedCrossProfileNotificationListeners = 157;
        static final int TRANSACTION_getPermittedInputMethods = 153;
        static final int TRANSACTION_getPermittedInputMethodsAsUser = 154;
        static final int TRANSACTION_getPersonalAppsSuspendedReasons = 358;
        static final int TRANSACTION_getPolicy = 427;
        static final int TRANSACTION_getPolicyManagedProfiles = 401;
        static final int TRANSACTION_getPolicySizeForAdmin = 421;
        static final int TRANSACTION_getPreferentialNetworkServiceConfigs = 185;
        static final int TRANSACTION_getProfileOwnerAsUser = 90;
        static final int TRANSACTION_getProfileOwnerName = 93;
        static final int TRANSACTION_getProfileOwnerOrDeviceOwnerSupervisionComponent = 91;
        static final int TRANSACTION_getProfileWithMinimumFailedPasswordsForWipe = 32;
        static final int TRANSACTION_getRemoveWarning = 67;
        static final int TRANSACTION_getRequiredPasswordComplexity = 28;
        static final int TRANSACTION_getRequiredStrongAuthTimeout = 39;
        static final int TRANSACTION_getResolvedDeviceWidePolicy = 428;
        static final int TRANSACTION_getResolvedPerUserPolicy = 429;
        static final int TRANSACTION_getRestrictionsProvider = 139;
        static final int TRANSACTION_getScreenCaptureDisabled = 56;
        static final int TRANSACTION_getSecondaryUsers = 173;
        static final int TRANSACTION_getShortSupportMessage = 263;
        static final int TRANSACTION_getShortSupportMessageForUser = 266;
        static final int TRANSACTION_getStartUserSessionMessage = 323;
        static final int TRANSACTION_getStorageEncryption = 50;
        static final int TRANSACTION_getStorageEncryptionStatus = 51;
        static final int TRANSACTION_getString = 397;
        static final int TRANSACTION_getSubscriptionIds = 417;
        static final int TRANSACTION_getSystemUpdatePolicy = 243;
        static final int TRANSACTION_getTransferOwnershipBundle = 320;
        static final int TRANSACTION_getTrustAgentConfiguration = 223;
        static final int TRANSACTION_getUserControlDisabledPackages = 355;
        static final int TRANSACTION_getUserProvisioningState = 277;
        static final int TRANSACTION_getUserRestrictions = 144;
        static final int TRANSACTION_getUserRestrictionsGlobally = 145;
        static final int TRANSACTION_getWifiMacAddress = 260;
        static final int TRANSACTION_getWifiSsidPolicy = 387;
        static final int TRANSACTION_hasDeviceOwner = 82;
        static final int TRANSACTION_hasGrantedPolicy = 71;
        static final int TRANSACTION_hasKeyPair = 112;
        static final int TRANSACTION_hasKeyPairWithScope = 432;
        static final int TRANSACTION_hasLockdownAdminConfiguredNetworks = 195;
        static final int TRANSACTION_hasManagedProfileCallerIdAccess = 213;
        static final int TRANSACTION_hasManagedProfileContactsAccess = 218;
        static final int TRANSACTION_hasUserSetupCompleted = 97;
        static final int TRANSACTION_installCaCert = 105;
        static final int TRANSACTION_installExistingPackage = 178;
        static final int TRANSACTION_installKeyPair = 110;
        static final int TRANSACTION_installUpdateFromFile = 338;
        static final int TRANSACTION_isAccessibilityServicePermittedByAdmin = 151;
        static final int TRANSACTION_isActivePasswordSufficient = 23;
        static final int TRANSACTION_isActivePasswordSufficientForDeviceRequirement = 24;
        static final int TRANSACTION_isAdminActive = 64;
        static final int TRANSACTION_isAffiliatedUser = 282;
        static final int TRANSACTION_isAlwaysOnVpnLockdownEnabled = 124;
        static final int TRANSACTION_isAlwaysOnVpnLockdownEnabledForUser = 125;
        static final int TRANSACTION_isApplicationHidden = 164;
        static final int TRANSACTION_isAuditLogEnabled = 290;
        static final int TRANSACTION_isBackupServiceEnabled = 299;
        static final int TRANSACTION_isCaCertApproved = 109;
        static final int TRANSACTION_isCallerApplicationRestrictionsManagingPackage = 137;
        static final int TRANSACTION_isCallingUserAffiliated = 281;
        static final int TRANSACTION_isCommonCriteriaModeEnabled = 357;
        static final int TRANSACTION_isComplianceAcknowledgementRequired = 363;
        static final int TRANSACTION_isCurrentInputMethodSetByOwner = 313;
        static final int TRANSACTION_isDeviceFinanced = 412;
        static final int TRANSACTION_isDeviceManaged = 86;
        static final int TRANSACTION_isDevicePotentiallyStolen = 388;
        static final int TRANSACTION_isDeviceProvisioned = 294;
        static final int TRANSACTION_isDeviceProvisioningConfigApplied = 295;
        static final int TRANSACTION_isDpcDownloaded = 393;
        static final int TRANSACTION_isEphemeralUser = 305;
        static final int TRANSACTION_isFactoryResetProtectionPolicySupported = 44;
        static final int TRANSACTION_isInputMethodPermittedByAdmin = 155;
        static final int TRANSACTION_isKeyPairGrantedToWifiAuth = 353;
        static final int TRANSACTION_isLockTaskPermitted = 188;
        static final int TRANSACTION_isLogoutEnabled = 317;
        static final int TRANSACTION_isManagedKiosk = 347;
        static final int TRANSACTION_isManagedProfile = 259;
        static final int TRANSACTION_isMasterVolumeMuted = 200;
        static final int TRANSACTION_isMeteredDataDisabledPackageForUser = 333;
        static final int TRANSACTION_isNetworkLoggingEnabled = 301;
        static final int TRANSACTION_isNewUserDisclaimerAcknowledged = 175;
        static final int TRANSACTION_isNotificationListenerServicePermitted = 158;
        static final int TRANSACTION_isOrganizationOwnedDeviceWithManagedProfile = 98;
        static final int TRANSACTION_isOutgoingTransferAllowedForSubscription = 423;
        static final int TRANSACTION_isOverrideApnEnabled = 332;
        static final int TRANSACTION_isPackageAllowedToAccessCalendarForUser = 341;
        static final int TRANSACTION_isPackageAllowedToBypassDevicePolicyManagementRoleQualification = 400;
        static final int TRANSACTION_isPackageSuspended = 103;
        static final int TRANSACTION_isPasswordSufficientAfterProfileUnification = 25;
        static final int TRANSACTION_isProvisioningAllowed = 255;
        static final int TRANSACTION_isRemovingAdmin = 240;
        static final int TRANSACTION_isResetPasswordTokenActive = 311;
        static final int TRANSACTION_isSafeOperation = 366;
        static final int TRANSACTION_isSecondaryLockscreenEnabled = 183;
        static final int TRANSACTION_isSecurityLoggingEnabled = 284;
        static final int TRANSACTION_isStatusBarDisabled = 247;
        static final int TRANSACTION_isSubscriptionEnterpriseManaged = 409;
        static final int TRANSACTION_isSupervisionComponent = 92;
        static final int TRANSACTION_isUnattendedManagedKiosk = 348;
        static final int TRANSACTION_isUninstallBlocked = 203;
        static final int TRANSACTION_isUninstallInQueue = 292;
        static final int TRANSACTION_isUsbDataSignalingEnabled = 382;
        static final int TRANSACTION_isUsingUnifiedPassword = 30;
        static final int TRANSACTION_listForegroundAffiliatedUsers = 389;
        static final int TRANSACTION_listPolicyExemptApps = 104;
        static final int TRANSACTION_lockNow = 40;
        static final int TRANSACTION_logoutUser = 170;
        static final int TRANSACTION_logoutUserInternal = 171;
        static final int TRANSACTION_notifyLockTaskModeChanged = 201;
        static final int TRANSACTION_notifyPendingSystemUpdate = 249;
        static final int TRANSACTION_packageHasActiveAdmins = 66;
        static final int TRANSACTION_provisionFullyManagedDevice = 372;
        static final int TRANSACTION_provisionMultiuserManagedDevice = 373;
        static final int TRANSACTION_provisionMultiuserManagedUser = 374;
        static final int TRANSACTION_reboot = 261;
        static final int TRANSACTION_removeActiveAdmin = 68;
        static final int TRANSACTION_removeCrossProfileWidgetProvider = 226;
        static final int TRANSACTION_removeKeyPair = 111;
        static final int TRANSACTION_removeKeyPairWithScope = 431;
        static final int TRANSACTION_removeManagedProfile = 376;
        static final int TRANSACTION_removeOverrideApn = 329;
        static final int TRANSACTION_removeResolvedDeviceWidePolicyCallback = 434;
        static final int TRANSACTION_removeUser = 166;
        static final int TRANSACTION_reportFailedBiometricAttempt = 75;
        static final int TRANSACTION_reportFailedPasswordAttempt = 73;
        static final int TRANSACTION_reportKeyguardDismissed = 77;
        static final int TRANSACTION_reportKeyguardSecured = 78;
        static final int TRANSACTION_reportPasswordChanged = 72;
        static final int TRANSACTION_reportSuccessfulBiometricAttempt = 76;
        static final int TRANSACTION_reportSuccessfulPasswordAttempt = 74;
        static final int TRANSACTION_requestBugreport = 52;
        static final int TRANSACTION_resetDefaultCrossProfileIntentFilters = 379;
        static final int TRANSACTION_resetDrawables = 391;
        static final int TRANSACTION_resetPassword = 35;
        static final int TRANSACTION_resetPasswordWithToken = 312;
        static final int TRANSACTION_resetShouldAllowBypassingDevicePolicyManagementRoleQualificationState = 398;
        static final int TRANSACTION_resetStrings = 396;
        static final int TRANSACTION_retrieveNetworkLogs = 302;
        static final int TRANSACTION_retrievePreRebootSecurityLogs = 286;
        static final int TRANSACTION_retrieveSecurityLogs = 285;
        static final int TRANSACTION_sendLostModeLocationUpdate = 45;
        static final int TRANSACTION_setAccountManagementDisabled = 179;
        static final int TRANSACTION_setActiveAdmin = 63;
        static final int TRANSACTION_setAffiliationIds = 279;
        static final int TRANSACTION_setAlwaysOnVpnPackage = 121;
        static final int TRANSACTION_setAppFunctionsPolicy = 424;
        static final int TRANSACTION_setApplicationExemptions = 402;
        static final int TRANSACTION_setApplicationHidden = 163;
        static final int TRANSACTION_setApplicationRestrictions = 131;
        static final int TRANSACTION_setApplicationRestrictionsBySystem = 135;
        static final int TRANSACTION_setApplicationRestrictionsManagingPackage = 133;
        static final int TRANSACTION_setAuditLogEnabled = 289;
        static final int TRANSACTION_setAuditLogEventsCallback = 291;
        static final int TRANSACTION_setAutoTimeEnabled = 230;
        static final int TRANSACTION_setAutoTimePolicy = 232;
        static final int TRANSACTION_setAutoTimeRequired = 228;
        static final int TRANSACTION_setAutoTimeZoneEnabled = 234;
        static final int TRANSACTION_setAutoTimeZonePolicy = 236;
        static final int TRANSACTION_setBackupServiceEnabled = 298;
        static final int TRANSACTION_setBluetoothContactSharingDisabled = 219;
        static final int TRANSACTION_setCameraDisabled = 53;
        static final int TRANSACTION_setCertInstallerPackage = 119;
        static final int TRANSACTION_setCommonCriteriaModeEnabled = 356;
        static final int TRANSACTION_setConfiguredNetworksLockdownState = 194;
        static final int TRANSACTION_setContentProtectionPolicy = 415;
        static final int TRANSACTION_setCredentialManagerPolicy = 214;
        static final int TRANSACTION_setCrossProfileCalendarPackages = 339;
        static final int TRANSACTION_setCrossProfileCallerIdDisabled = 204;
        static final int TRANSACTION_setCrossProfileContactsSearchDisabled = 207;
        static final int TRANSACTION_setCrossProfilePackages = 343;
        static final int TRANSACTION_setCrossProfileWidgetProviders = 225;
        static final int TRANSACTION_setDefaultDialerApplication = 130;
        static final int TRANSACTION_setDefaultSmsApplication = 129;
        static final int TRANSACTION_setDelegatedScopes = 116;
        static final int TRANSACTION_setDeviceOwner = 79;
        static final int TRANSACTION_setDeviceOwnerLockScreenInfo = 100;
        static final int TRANSACTION_setDeviceOwnerType = 377;
        static final int TRANSACTION_setDeviceProvisioningConfigApplied = 296;
        static final int TRANSACTION_setDpcDownloaded = 394;
        static final int TRANSACTION_setDrawables = 390;
        static final int TRANSACTION_setEndUserSessionMessage = 322;
        static final int TRANSACTION_setFactoryResetProtectionPolicy = 42;
        static final int TRANSACTION_setForceEphemeralUsers = 238;
        static final int TRANSACTION_setGlobalPrivateDns = 334;
        static final int TRANSACTION_setGlobalProxy = 46;
        static final int TRANSACTION_setGlobalSetting = 191;
        static final int TRANSACTION_setKeepUninstalledPackages = 257;
        static final int TRANSACTION_setKeyGrantForApp = 350;
        static final int TRANSACTION_setKeyGrantToWifiAuth = 352;
        static final int TRANSACTION_setKeyPairCertificate = 114;
        static final int TRANSACTION_setKeyguardDisabled = 245;
        static final int TRANSACTION_setKeyguardDisabledFeatures = 61;
        static final int TRANSACTION_setLocationEnabled = 196;
        static final int TRANSACTION_setLockTaskFeatures = 189;
        static final int TRANSACTION_setLockTaskPackages = 186;
        static final int TRANSACTION_setLogoutEnabled = 316;
        static final int TRANSACTION_setLongSupportMessage = 264;
        static final int TRANSACTION_setManagedProfileCallerIdAccessPolicy = 211;
        static final int TRANSACTION_setManagedProfileContactsAccessPolicy = 216;
        static final int TRANSACTION_setManagedProfileMaximumTimeOff = 361;
        static final int TRANSACTION_setManagedSubscriptionsPolicy = 407;
        static final int TRANSACTION_setMasterVolumeMuted = 199;
        static final int TRANSACTION_setMaxPolicyStorageLimit = 418;
        static final int TRANSACTION_setMaximumFailedPasswordsForWipe = 33;
        static final int TRANSACTION_setMaximumTimeToLock = 36;
        static final int TRANSACTION_setMeteredDataDisabledPackages = 325;
        static final int TRANSACTION_setMinimumRequiredWifiSecurityLevel = 384;
        static final int TRANSACTION_setMtePolicy = 404;
        static final int TRANSACTION_setMtePolicyBySystem = 405;
        static final int TRANSACTION_setNearbyAppStreamingPolicy = 59;
        static final int TRANSACTION_setNearbyNotificationStreamingPolicy = 57;
        static final int TRANSACTION_setNetworkLoggingEnabled = 300;
        static final int TRANSACTION_setNextOperationSafety = 365;
        static final int TRANSACTION_setOrganizationColor = 268;
        static final int TRANSACTION_setOrganizationColorForUser = 269;
        static final int TRANSACTION_setOrganizationIdForUser = 368;
        static final int TRANSACTION_setOrganizationName = 273;
        static final int TRANSACTION_setOverrideApnsEnabled = 331;
        static final int TRANSACTION_setPackagesSuspended = 102;
        static final int TRANSACTION_setPasswordExpirationTimeout = 20;
        static final int TRANSACTION_setPasswordHistoryLength = 18;
        static final int TRANSACTION_setPasswordMinimumLength = 3;
        static final int TRANSACTION_setPasswordMinimumLetters = 9;
        static final int TRANSACTION_setPasswordMinimumLowerCase = 7;
        static final int TRANSACTION_setPasswordMinimumNonLetter = 15;
        static final int TRANSACTION_setPasswordMinimumNumeric = 11;
        static final int TRANSACTION_setPasswordMinimumSymbols = 13;
        static final int TRANSACTION_setPasswordMinimumUpperCase = 5;
        static final int TRANSACTION_setPasswordQuality = 1;
        static final int TRANSACTION_setPermissionGrantState = 253;
        static final int TRANSACTION_setPermissionPolicy = 251;
        static final int TRANSACTION_setPermittedAccessibilityServices = 148;
        static final int TRANSACTION_setPermittedCrossProfileNotificationListeners = 156;
        static final int TRANSACTION_setPermittedInputMethods = 152;
        static final int TRANSACTION_setPersonalAppsSuspended = 359;
        static final int TRANSACTION_setPolicy = 426;
        static final int TRANSACTION_setPreferentialNetworkServiceConfigs = 184;
        static final int TRANSACTION_setProfileEnabled = 94;
        static final int TRANSACTION_setProfileName = 95;
        static final int TRANSACTION_setProfileOwner = 89;
        static final int TRANSACTION_setProfileOwnerOnOrganizationOwnedDevice = 337;
        static final int TRANSACTION_setRecommendedGlobalProxy = 48;
        static final int TRANSACTION_setRequiredPasswordComplexity = 27;
        static final int TRANSACTION_setRequiredStrongAuthTimeout = 38;
        static final int TRANSACTION_setResetPasswordToken = 309;
        static final int TRANSACTION_setRestrictionsProvider = 138;
        static final int TRANSACTION_setScreenCaptureDisabled = 55;
        static final int TRANSACTION_setSecondaryLockscreenEnabled = 182;
        static final int TRANSACTION_setSecureSetting = 193;
        static final int TRANSACTION_setSecurityLoggingEnabled = 283;
        static final int TRANSACTION_setShortSupportMessage = 262;
        static final int TRANSACTION_setStartUserSessionMessage = 321;
        static final int TRANSACTION_setStatusBarDisabled = 246;
        static final int TRANSACTION_setStorageEncryption = 49;
        static final int TRANSACTION_setStrings = 395;
        static final int TRANSACTION_setSystemSetting = 192;
        static final int TRANSACTION_setSystemUpdatePolicy = 242;
        static final int TRANSACTION_setTime = 197;
        static final int TRANSACTION_setTimeZone = 198;
        static final int TRANSACTION_setTrustAgentConfiguration = 222;
        static final int TRANSACTION_setUninstallBlocked = 202;
        static final int TRANSACTION_setUsbDataSignalingEnabled = 381;
        static final int TRANSACTION_setUserControlDisabledPackages = 354;
        static final int TRANSACTION_setUserIcon = 241;
        static final int TRANSACTION_setUserProvisioningState = 278;
        static final int TRANSACTION_setUserRestriction = 140;
        static final int TRANSACTION_setUserRestrictionForUser = 141;
        static final int TRANSACTION_setUserRestrictionGlobally = 142;
        static final int TRANSACTION_setUserRestrictionGloballyFromSystem = 143;
        static final int TRANSACTION_setWifiSsidPolicy = 386;
        static final int TRANSACTION_shouldAllowBypassingDevicePolicyManagementRoleQualification = 399;
        static final int TRANSACTION_startManagedQuickContact = 210;
        static final int TRANSACTION_startMultiuserManagedDeviceProvisioning = 88;
        static final int TRANSACTION_startUserInBackground = 168;
        static final int TRANSACTION_startViewCalendarEventInManagedProfile = 349;
        static final int TRANSACTION_stopUser = 169;
        static final int TRANSACTION_switchUser = 167;
        static final int TRANSACTION_transferOwnership = 319;
        static final int TRANSACTION_triggerDevicePolicyEngineMigration = 411;
        static final int TRANSACTION_uninstallCaCerts = 106;
        static final int TRANSACTION_uninstallPackageWithActiveAdmins = 293;
        static final int TRANSACTION_updateOverrideApn = 328;
        static final int TRANSACTION_wipeDataWithReason = 41;
        public Stub() { super(); }
        public static android.app.admin.IDevicePolicyManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        private boolean onTransact$addCrossProfileIntentFilter$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$addCrossProfileWidgetProvider$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$addPersistentPreferredActivity$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$addResolvedDeviceWidePolicyCallback$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$approveCaCert$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$bindDeviceAdminServiceAsUser$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$checkDeviceIdentifierAccess$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$choosePrivateKeyAlias$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$clearApplicationUserData$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$clearPackagePersistentPreferredActivities$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$createAndManageUser$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$enableSystemApp$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$enableSystemAppWithIntent$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$finalizeWorkProfileProvisioning$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$forceSetMaxPolicyStorageLimit$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$generateKeyPair$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$generateKeyPairWithScope$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getAccountTypesWithManagementDisabledAsUser$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getAppFunctionsPolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getApplicationRestrictions$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getApplicationRestrictionsBySystem$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getCameraDisabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getContentProtectionPolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getCurrentFailedPasswordAttempts$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getDisallowedSystemApps$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getDrawable$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getKeyguardDisabledFeatures$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getMaximumFailedPasswordsForWipe$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getMaximumTimeToLock$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPasswordExpiration$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPasswordExpirationTimeout$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPasswordHistoryLength$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPasswordMinimumLength$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPasswordMinimumLetters$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPasswordMinimumLowerCase$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPasswordMinimumNonLetter$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPasswordMinimumNumeric$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPasswordMinimumSymbols$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPasswordMinimumUpperCase$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPasswordQuality$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPermissionGrantState$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPermittedInputMethods$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPolicySizeForAdmin$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getRemoveWarning$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getRequiredStrongAuthTimeout$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getResolvedDeviceWidePolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getResolvedPerUserPolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getScreenCaptureDisabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getTrustAgentConfiguration$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getUserRestrictions$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$hasGrantedPolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$hasKeyPairWithScope$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$installCaCert$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$installExistingPackage$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$installKeyPair$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$installUpdateFromFile$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isAccessibilityServicePermittedByAdmin$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isActivePasswordSufficient$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isApplicationHidden$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isInputMethodPermittedByAdmin$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isMeteredDataDisabledPackageForUser$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isOutgoingTransferAllowedForSubscription$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isPackageAllowedToBypassDevicePolicyManagementRoleQualification$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isPackageSuspended$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isSubscriptionEnterpriseManaged$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$lockNow$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$notifyLockTaskModeChanged$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$provisionFullyManagedDevice$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$provisionMultiuserManagedDevice$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$provisionMultiuserManagedUser$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$removeCrossProfileWidgetProvider$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$removeKeyPair$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$removeKeyPairWithScope$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$removeResolvedDeviceWidePolicyCallback$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$resetPasswordWithToken$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$retrieveNetworkLogs$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setAccountManagementDisabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setActiveAdmin$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setAlwaysOnVpnPackage$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setAppFunctionsPolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setApplicationExemptions$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setApplicationHidden$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setApplicationRestrictions$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setApplicationRestrictionsBySystem$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setAutoTimeEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setAutoTimeZoneEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setCameraDisabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setCommonCriteriaModeEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setConfiguredNetworksLockdownState$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setContentProtectionPolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setDefaultSmsApplication$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setDelegatedScopes$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setDeviceOwner$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setDeviceOwnerLockScreenInfo$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setDeviceOwnerType$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setFactoryResetProtectionPolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setGlobalPrivateDns$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setGlobalProxy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setGlobalSetting$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setKeepUninstalledPackages$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setKeyGrantForApp$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setKeyGrantToWifiAuth$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setKeyPairCertificate$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setKeyguardDisabledFeatures$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setLockTaskFeatures$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setLockTaskPackages$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setMaxPolicyStorageLimit$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setMaximumFailedPasswordsForWipe$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setMaximumTimeToLock$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setMinimumRequiredWifiSecurityLevel$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setMtePolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setMtePolicyBySystem$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setNetworkLoggingEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setOrganizationIdForUser$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setOrganizationName$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPackagesSuspended$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPasswordExpirationTimeout$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPasswordHistoryLength$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPasswordMinimumLength$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPasswordMinimumLetters$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPasswordMinimumLowerCase$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPasswordMinimumNonLetter$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPasswordMinimumNumeric$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPasswordMinimumSymbols$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPasswordMinimumUpperCase$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPasswordQuality$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPermissionGrantState$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPermissionPolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPermittedInputMethods$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setProfileOwnerOnOrganizationOwnedDevice$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setRequiredPasswordComplexity$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setRequiredStrongAuthTimeout$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setResetPasswordToken$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setScreenCaptureDisabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSecondaryLockscreenEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSecureSetting$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSecurityLoggingEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setShortSupportMessage$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setStatusBarDisabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSystemSetting$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSystemUpdatePolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setTime$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setTimeZone$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setTrustAgentConfiguration$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setUninstallBlocked$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setUsbDataSignalingEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setUserControlDisabledPackages$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setUserRestriction$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setUserRestrictionForUser$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setUserRestrictionGloballyFromSystem$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setWifiSsidPolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$startManagedQuickContact$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$startViewCalendarEventInManagedProfile$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$transferOwnership$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$uninstallCaCerts$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$updateOverrideApn$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$wipeDataWithReason$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.admin.IDevicePolicyManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void acknowledgeDeviceCompliant() throws android.os.RemoteException {}
            public void acknowledgeNewUserDisclaimer(int p0) throws android.os.RemoteException {}
            public void addCrossProfileIntentFilter(android.content.ComponentName p0, java.lang.String p1, android.content.IntentFilter p2, int p3) throws android.os.RemoteException {}
            public boolean addCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public int addOverrideApn(android.content.ComponentName p0, android.telephony.data.ApnSetting p1) throws android.os.RemoteException { return 0; }
            public void addPersistentPreferredActivity(android.content.ComponentName p0, java.lang.String p1, android.content.IntentFilter p2, android.content.ComponentName p3) throws android.os.RemoteException {}
            public void addResolvedDeviceWidePolicyCallback(java.lang.String p0, java.lang.String p1, android.app.admin.IDevicePolicyValueCallback p2) throws android.os.RemoteException {}
            public boolean approveCaCert(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public android.os.IBinder asBinder() { return null; }
            public boolean bindDeviceAdminServiceAsUser(android.content.ComponentName p0, android.app.IApplicationThread p1, android.os.IBinder p2, android.content.Intent p3, android.app.IServiceConnection p4, long p5, int p6) throws android.os.RemoteException { return false; }
            public void calculateHasIncompatibleAccounts() throws android.os.RemoteException {}
            public boolean canAdminGrantSensorsPermissions() throws android.os.RemoteException { return false; }
            public boolean canProfileOwnerResetPasswordWhenLocked(int p0) throws android.os.RemoteException { return false; }
            public boolean canUsbDataSignalingBeDisabled() throws android.os.RemoteException { return false; }
            public boolean checkDeviceIdentifierAccess(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public int checkProvisioningPrecondition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void choosePrivateKeyAlias(int p0, android.net.Uri p1, java.lang.String p2, android.os.IBinder p3) throws android.os.RemoteException {}
            public void clearApplicationUserData(android.content.ComponentName p0, java.lang.String p1, android.content.pm.IPackageDataObserver p2) throws android.os.RemoteException {}
            public void clearCrossProfileIntentFilters(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
            public void clearDeviceOwner(java.lang.String p0) throws android.os.RemoteException {}
            public void clearMultiuserDeviceManagement(java.lang.String p0) throws android.os.RemoteException {}
            public void clearOrganizationIdForUser(int p0) throws android.os.RemoteException {}
            public void clearPackagePersistentPreferredActivities(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void clearProfileOwner(android.content.ComponentName p0) throws android.os.RemoteException {}
            public boolean clearResetPasswordToken(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void clearSystemUpdatePolicyFreezePeriodRecord() throws android.os.RemoteException {}
            public android.content.Intent createAdminSupportIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.UserHandle createAndManageUser(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, int p4) throws android.os.RemoteException { return null; }
            public android.os.UserHandle createAndProvisionManagedProfile(android.app.admin.ManagedProfileProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.os.UserHandle createManagedProfile(android.app.admin.ManagedProfileProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void enableSystemApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public int enableSystemAppWithIntent(android.content.ComponentName p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException { return 0; }
            public void enforceCanManageCaCerts(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
            public void finalizeCreateManagedProfile(android.app.admin.ManagedProfileProvisioningParams p0, android.os.UserHandle p1) throws android.os.RemoteException {}
            public void finalizeWorkProfileProvisioning(android.os.UserHandle p0, android.accounts.Account p1) throws android.os.RemoteException {}
            public long forceNetworkLogs() throws android.os.RemoteException { return 0L; }
            public void forceRemoveActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public long forceSecurityLogs() throws android.os.RemoteException { return 0L; }
            public void forceSetMaxPolicyStorageLimit(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void forceUpdateUserSetupComplete(int p0) throws android.os.RemoteException {}
            public boolean generateKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.security.keystore.ParcelableKeyGenParameterSpec p3, int p4, android.security.keymaster.KeymasterCertificateChain p5) throws android.os.RemoteException { return false; }
            public android.security.keymaster.KeymasterCertificateChain generateKeyPairWithScope(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.security.keystore.ParcelableKeyGenParameterSpec p3, int p4, int p5) throws android.os.RemoteException { return null; }
            public java.lang.String[] getAccountTypesWithManagementDisabled(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
            public java.util.List<android.content.ComponentName> getActiveAdmins(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getAffiliationIds(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public int getAggregatedPasswordComplexityForUser(int p0, boolean p1) throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getAllCrossProfilePackages(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getAlwaysOnVpnLockdownAllowlist(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.lang.String getAlwaysOnVpnPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.lang.String getAlwaysOnVpnPackageForUser(int p0) throws android.os.RemoteException { return null; }
            public int getAppFunctionsPolicy(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int[] getApplicationExemptions(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.Bundle getApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return null; }
            public android.os.Bundle getApplicationRestrictionsBySystem(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean getAutoTimeEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public int getAutoTimePolicy(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public boolean getAutoTimeRequired() throws android.os.RemoteException { return false; }
            public boolean getAutoTimeZoneEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public int getAutoTimeZonePolicy(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public java.util.List<android.os.UserHandle> getBindDeviceAdminTargetUsers(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean getBluetoothContactSharingDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean getBluetoothContactSharingDisabledForUser(int p0) throws android.os.RemoteException { return false; }
            public boolean getCameraDisabled(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return false; }
            public java.lang.String getCertInstallerPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public int getContentProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public android.app.admin.PackagePolicy getCredentialManagerPolicy(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getCrossProfileCalendarPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getCrossProfileCalendarPackagesForUser(int p0) throws android.os.RemoteException { return null; }
            public boolean getCrossProfileCallerIdDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean getCrossProfileCallerIdDisabledForUser(int p0) throws android.os.RemoteException { return false; }
            public boolean getCrossProfileContactsSearchDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean getCrossProfileContactsSearchDisabledForUser(int p0) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getCrossProfilePackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int getCurrentFailedPasswordAttempts(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getDefaultCrossProfilePackages() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getDelegatePackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getDelegatedScopes(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getDeviceOwnerComponent(boolean p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getDeviceOwnerComponentOnUser(int p0) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getDeviceOwnerLockScreenInfo() throws android.os.RemoteException { return null; }
            public java.lang.String getDeviceOwnerName() throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getDeviceOwnerOrganizationName() throws android.os.RemoteException { return null; }
            public int getDeviceOwnerType(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public int getDeviceOwnerUserId() throws android.os.RemoteException { return 0; }
            public android.app.admin.DevicePolicyState getDevicePolicyState() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getDisallowedSystemApps(android.content.ComponentName p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean getDoNotAskCredentialsOnBoot() throws android.os.RemoteException { return false; }
            public android.app.admin.ParcelableResource getDrawable(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getEndUserSessionMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public android.app.admin.EnforcingAdmin getEnforcingAdmin(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle getEnforcingAdminAndUserDetails(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.admin.EnforcingAdmin> getEnforcingAdminsForPolicy(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public java.lang.String getEnrollmentSpecificId(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.app.admin.FactoryResetProtectionPolicy getFactoryResetProtectionPolicy(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.lang.String getFinancedDeviceKioskRoleHolder(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean getForceEphemeralUsers(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public java.lang.String getGlobalPrivateDnsHost(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public int getGlobalPrivateDnsMode(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public android.content.ComponentName getGlobalProxyAdmin(int p0) throws android.os.RemoteException { return null; }
            public int getHeadlessDeviceOwnerMode(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<java.lang.String> getKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.app.admin.ParcelableGranteeMap getKeyPairGrants(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int getKeyguardDisabledFeatures(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public long getLastBugReportRequestTime() throws android.os.RemoteException { return 0L; }
            public long getLastNetworkLogRetrievalTime() throws android.os.RemoteException { return 0L; }
            public long getLastSecurityLogRetrievalTime() throws android.os.RemoteException { return 0L; }
            public int getLockTaskFeatures(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public java.lang.String[] getLockTaskPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int getLogoutUserId() throws android.os.RemoteException { return 0; }
            public java.lang.CharSequence getLongSupportMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getLongSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
            public android.app.admin.PackagePolicy getManagedProfileCallerIdAccessPolicy() throws android.os.RemoteException { return null; }
            public android.app.admin.PackagePolicy getManagedProfileContactsAccessPolicy() throws android.os.RemoteException { return null; }
            public long getManagedProfileMaximumTimeOff(android.content.ComponentName p0) throws android.os.RemoteException { return 0L; }
            public android.app.admin.ManagedSubscriptionsPolicy getManagedSubscriptionsPolicy() throws android.os.RemoteException { return null; }
            public int getMaxPolicyStorageLimit(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getMaximumFailedPasswordsForWipe(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public long getMaximumTimeToLock(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
            public java.util.List<java.lang.String> getMeteredDataDisabledPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public int getMinimumRequiredWifiSecurityLevel() throws android.os.RemoteException { return 0; }
            public int getMtePolicy(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getMultiuserManagedDeviceProvisioningState() throws android.os.RemoteException { return 0; }
            public int getNearbyAppStreamingPolicy(int p0, boolean p1) throws android.os.RemoteException { return 0; }
            public int getNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException { return 0; }
            public int getOrganizationColor(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public int getOrganizationColorForUser(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.CharSequence getOrganizationName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getOrganizationNameForUser(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.telephony.data.ApnSetting> getOverrideApns(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public android.content.pm.StringParceledListSlice getOwnerInstalledCaCerts(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
            public int getPasswordComplexity(boolean p0) throws android.os.RemoteException { return 0; }
            public long getPasswordExpiration(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
            public long getPasswordExpirationTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
            public int getPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int getPasswordMinimumLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int getPasswordMinimumLetters(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int getPasswordMinimumLowerCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public android.app.admin.PasswordMetrics getPasswordMinimumMetrics(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public int getPasswordMinimumNonLetter(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int getPasswordMinimumNumeric(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int getPasswordMinimumSymbols(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int getPasswordMinimumUpperCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int getPasswordQuality(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public android.app.admin.SystemUpdateInfo getPendingSystemUpdate(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int getPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public int getPermissionPolicy(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getPermittedAccessibilityServices(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPermittedAccessibilityServicesForUser(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPermittedInputMethods(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPermittedInputMethodsAsUser(int p0) throws android.os.RemoteException { return null; }
            public int getPersonalAppsSuspendedReasons(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public android.app.admin.PolicyValueTransport getPolicy(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public java.util.List<android.os.UserHandle> getPolicyManagedProfiles(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
            public int getPolicySizeForAdmin(java.lang.String p0, android.app.admin.EnforcingAdmin p1) throws android.os.RemoteException { return 0; }
            public java.util.List<android.app.admin.PreferentialNetworkServiceConfig> getPreferentialNetworkServiceConfigs() throws android.os.RemoteException { return null; }
            public android.content.ComponentName getProfileOwnerAsUser(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getProfileOwnerName(int p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getProfileOwnerOrDeviceOwnerSupervisionComponent(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
            public int getProfileWithMinimumFailedPasswordsForWipe(int p0, boolean p1) throws android.os.RemoteException { return 0; }
            public void getRemoveWarning(android.content.ComponentName p0, android.os.RemoteCallback p1, int p2) throws android.os.RemoteException {}
            public int getRequiredPasswordComplexity(java.lang.String p0, boolean p1) throws android.os.RemoteException { return 0; }
            public long getRequiredStrongAuthTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
            public android.app.admin.PolicyValueTransport getResolvedDeviceWidePolicy(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.app.admin.PolicyValueTransport getResolvedPerUserPolicy(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getRestrictionsProvider(int p0) throws android.os.RemoteException { return null; }
            public boolean getScreenCaptureDisabled(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getShortSupportMessage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getShortSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getStartUserSessionMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean getStorageEncryption(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public int getStorageEncryptionStatus(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public android.app.admin.ParcelableResource getString(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int[] getSubscriptionIds(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.app.admin.SystemUpdatePolicy getSystemUpdatePolicy() throws android.os.RemoteException { return null; }
            public android.os.PersistableBundle getTransferOwnershipBundle() throws android.os.RemoteException { return null; }
            public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1, int p2, boolean p3) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getUserControlDisabledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int getUserProvisioningState(int p0) throws android.os.RemoteException { return 0; }
            public android.os.Bundle getUserRestrictions(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
            public android.os.Bundle getUserRestrictionsGlobally(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getWifiMacAddress(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.app.admin.WifiSsidPolicy getWifiSsidPolicy(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean hasDeviceOwner() throws android.os.RemoteException { return false; }
            public boolean hasGrantedPolicy(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean hasKeyPair(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean hasKeyPairWithScope(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean hasLockdownAdminConfiguredNetworks(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean hasManagedProfileCallerIdAccess(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean hasManagedProfileContactsAccess(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean hasUserSetupCompleted() throws android.os.RemoteException { return false; }
            public boolean installCaCert(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException { return false; }
            public boolean installExistingPackage(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean installKeyPair(android.content.ComponentName p0, java.lang.String p1, byte[] p2, byte[] p3, byte[] p4, java.lang.String p5, boolean p6, boolean p7) throws android.os.RemoteException { return false; }
            public void installUpdateFromFile(android.content.ComponentName p0, java.lang.String p1, android.os.ParcelFileDescriptor p2, android.app.admin.StartInstallingUpdateCallback p3) throws android.os.RemoteException {}
            public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isActivePasswordSufficient(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean isActivePasswordSufficientForDeviceRequirement() throws android.os.RemoteException { return false; }
            public boolean isAdminActive(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isAffiliatedUser(int p0) throws android.os.RemoteException { return false; }
            public boolean isAlwaysOnVpnLockdownEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isAlwaysOnVpnLockdownEnabledForUser(int p0) throws android.os.RemoteException { return false; }
            public boolean isApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return false; }
            public boolean isAuditLogEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isBackupServiceEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isCaCertApproved(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isCallerApplicationRestrictionsManagingPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isCallingUserAffiliated() throws android.os.RemoteException { return false; }
            public boolean isCommonCriteriaModeEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isComplianceAcknowledgementRequired() throws android.os.RemoteException { return false; }
            public boolean isCurrentInputMethodSetByOwner() throws android.os.RemoteException { return false; }
            public boolean isDeviceFinanced(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isDeviceManaged(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isDevicePotentiallyStolen(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isDeviceProvisioned() throws android.os.RemoteException { return false; }
            public boolean isDeviceProvisioningConfigApplied() throws android.os.RemoteException { return false; }
            public boolean isDpcDownloaded() throws android.os.RemoteException { return false; }
            public boolean isEphemeralUser(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isFactoryResetProtectionPolicySupported() throws android.os.RemoteException { return false; }
            public boolean isInputMethodPermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return false; }
            public boolean isKeyPairGrantedToWifiAuth(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isLockTaskPermitted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isLogoutEnabled() throws android.os.RemoteException { return false; }
            public boolean isManagedKiosk() throws android.os.RemoteException { return false; }
            public boolean isManagedProfile(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isMasterVolumeMuted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isMeteredDataDisabledPackageForUser(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isNetworkLoggingEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isNewUserDisclaimerAcknowledged(int p0) throws android.os.RemoteException { return false; }
            public boolean isNotificationListenerServicePermitted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isOrganizationOwnedDeviceWithManagedProfile() throws android.os.RemoteException { return false; }
            public boolean isOutgoingTransferAllowedForSubscription(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isOverrideApnEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isPackageAllowedToAccessCalendarForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isPackageAllowedToBypassDevicePolicyManagementRoleQualification(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isPackageSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isPasswordSufficientAfterProfileUnification(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isProvisioningAllowed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isRemovingAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isResetPasswordTokenActive(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isSafeOperation(int p0) throws android.os.RemoteException { return false; }
            public boolean isSecondaryLockscreenEnabled(android.os.UserHandle p0) throws android.os.RemoteException { return false; }
            public boolean isSecurityLoggingEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isStatusBarDisabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isSubscriptionEnterpriseManaged(android.telephony.SubscriptionInfo p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isSupervisionComponent(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isUnattendedManagedKiosk() throws android.os.RemoteException { return false; }
            public boolean isUninstallBlocked(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isUninstallInQueue(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isUsbDataSignalingEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isUsingUnifiedPassword(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.os.UserHandle> listForegroundAffiliatedUsers() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> listPolicyExemptApps() throws android.os.RemoteException { return null; }
            public void lockNow(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public int logoutUser(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public int logoutUserInternal() throws android.os.RemoteException { return 0; }
            public void notifyLockTaskModeChanged(boolean p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void notifyPendingSystemUpdate(android.app.admin.SystemUpdateInfo p0) throws android.os.RemoteException {}
            public boolean packageHasActiveAdmins(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void provisionFullyManagedDevice(android.app.admin.FullyManagedDeviceProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException {}
            public void provisionMultiuserManagedDevice(android.app.admin.MultiuserManagedDeviceProvisioningParamsTransport p0, java.lang.String p1, android.app.admin.IDeviceProvisioningCallback p2) throws android.os.RemoteException {}
            public void provisionMultiuserManagedUser(android.app.admin.MultiuserManagedUserProvisioningParamsTransport p0, java.lang.String p1) throws android.os.RemoteException {}
            public void reboot(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void removeActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public boolean removeCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean removeKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean removeKeyPairWithScope(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean removeManagedProfile(int p0) throws android.os.RemoteException { return false; }
            public boolean removeOverrideApn(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public void removeResolvedDeviceWidePolicyCallback(java.lang.String p0, java.lang.String p1, android.app.admin.IDevicePolicyValueCallback p2) throws android.os.RemoteException {}
            public boolean removeUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
            public void reportFailedBiometricAttempt(int p0) throws android.os.RemoteException {}
            public void reportFailedPasswordAttempt(int p0, boolean p1) throws android.os.RemoteException {}
            public void reportKeyguardDismissed(int p0) throws android.os.RemoteException {}
            public void reportKeyguardSecured(int p0) throws android.os.RemoteException {}
            public void reportPasswordChanged(android.app.admin.PasswordMetrics p0, int p1) throws android.os.RemoteException {}
            public void reportSuccessfulBiometricAttempt(int p0) throws android.os.RemoteException {}
            public void reportSuccessfulPasswordAttempt(int p0) throws android.os.RemoteException {}
            public boolean requestBugreport(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void resetDefaultCrossProfileIntentFilters(int p0) throws android.os.RemoteException {}
            public void resetDrawables(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public boolean resetPassword(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean resetPasswordWithToken(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException { return false; }
            public void resetShouldAllowBypassingDevicePolicyManagementRoleQualificationState() throws android.os.RemoteException {}
            public void resetStrings(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public java.util.List<android.app.admin.NetworkEvent> retrieveNetworkLogs(android.content.ComponentName p0, java.lang.String p1, long p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice retrievePreRebootSecurityLogs(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice retrieveSecurityLogs(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void sendLostModeLocationUpdate(com.android.internal.infra.AndroidFuture<java.lang.Boolean> p0) throws android.os.RemoteException {}
            public void setAccountManagementDisabled(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException {}
            public void setActiveAdmin(android.content.ComponentName p0, boolean p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void setAffiliationIds(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public boolean setAlwaysOnVpnPackage(android.content.ComponentName p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) throws android.os.RemoteException { return false; }
            public void setAppFunctionsPolicy(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setApplicationExemptions(java.lang.String p0, java.lang.String p1, int[] p2) throws android.os.RemoteException {}
            public boolean setApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException { return false; }
            public void setApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3, boolean p4) throws android.os.RemoteException {}
            public void setApplicationRestrictionsBySystem(java.lang.String p0, java.lang.String p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public boolean setApplicationRestrictionsManagingPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void setAuditLogEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void setAuditLogEventsCallback(java.lang.String p0, android.app.admin.IAuditLogEventsCallback p1) throws android.os.RemoteException {}
            public void setAutoTimeEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void setAutoTimePolicy(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setAutoTimeRequired(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void setAutoTimeZoneEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void setAutoTimeZonePolicy(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setBackupServiceEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void setBluetoothContactSharingDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void setCameraDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException {}
            public void setCertInstallerPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setCommonCriteriaModeEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void setConfiguredNetworksLockdownState(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void setContentProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setCredentialManagerPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException {}
            public void setCrossProfileCalendarPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public void setCrossProfileCallerIdDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void setCrossProfileContactsSearchDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void setCrossProfilePackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public void setCrossProfileWidgetProviders(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public void setDefaultDialerApplication(java.lang.String p0) throws android.os.RemoteException {}
            public void setDefaultSmsApplication(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
            public void setDelegatedScopes(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
            public boolean setDeviceOwner(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public void setDeviceOwnerLockScreenInfo(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
            public void setDeviceOwnerType(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public void setDeviceProvisioningConfigApplied() throws android.os.RemoteException {}
            public void setDpcDownloaded(boolean p0) throws android.os.RemoteException {}
            public void setDrawables(java.util.List<android.app.admin.DevicePolicyDrawableResource> p0) throws android.os.RemoteException {}
            public void setEndUserSessionMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public void setFactoryResetProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, android.app.admin.FactoryResetProtectionPolicy p2) throws android.os.RemoteException {}
            public void setForceEphemeralUsers(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public int setGlobalPrivateDns(android.content.ComponentName p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public android.content.ComponentName setGlobalProxy(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void setGlobalSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
            public boolean setKeyGrantForApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return false; }
            public boolean setKeyGrantToWifiAuth(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean setKeyPairCertificate(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, byte[] p3, byte[] p4, boolean p5) throws android.os.RemoteException { return false; }
            public boolean setKeyguardDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return false; }
            public void setKeyguardDisabledFeatures(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void setLocationEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void setLockTaskFeatures(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setLockTaskPackages(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException {}
            public void setLogoutEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void setLongSupportMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public void setManagedProfileCallerIdAccessPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException {}
            public void setManagedProfileContactsAccessPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException {}
            public void setManagedProfileMaximumTimeOff(android.content.ComponentName p0, long p1) throws android.os.RemoteException {}
            public void setManagedSubscriptionsPolicy(android.app.admin.ManagedSubscriptionsPolicy p0) throws android.os.RemoteException {}
            public void setMasterVolumeMuted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void setMaxPolicyStorageLimit(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setMaximumFailedPasswordsForWipe(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void setMaximumTimeToLock(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> setMeteredDataDisabledPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return null; }
            public void setMinimumRequiredWifiSecurityLevel(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setMtePolicy(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setMtePolicyBySystem(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setNearbyAppStreamingPolicy(int p0, boolean p1) throws android.os.RemoteException {}
            public void setNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException {}
            public void setNetworkLoggingEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void setNextOperationSafety(int p0, int p1) throws android.os.RemoteException {}
            public void setOrganizationColor(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public void setOrganizationColorForUser(int p0, int p1) throws android.os.RemoteException {}
            public void setOrganizationIdForUser(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setOrganizationName(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
            public void setOverrideApnsEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public java.lang.String[] setPackagesSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2, boolean p3) throws android.os.RemoteException { return null; }
            public void setPasswordExpirationTimeout(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException {}
            public void setPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setPasswordMinimumLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setPasswordMinimumLetters(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setPasswordMinimumLowerCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setPasswordMinimumNonLetter(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setPasswordMinimumNumeric(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setPasswordMinimumSymbols(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setPasswordMinimumUpperCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setPasswordQuality(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, android.os.RemoteCallback p5) throws android.os.RemoteException {}
            public void setPermissionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public boolean setPermittedAccessibilityServices(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return false; }
            public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return false; }
            public boolean setPermittedInputMethods(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2, boolean p3) throws android.os.RemoteException { return false; }
            public void setPersonalAppsSuspended(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void setPolicy(java.lang.String p0, java.lang.String p1, int p2, android.app.admin.PolicyValueTransport p3) throws android.os.RemoteException {}
            public void setPreferentialNetworkServiceConfigs(java.util.List<android.app.admin.PreferentialNetworkServiceConfig> p0) throws android.os.RemoteException {}
            public void setProfileEnabled(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void setProfileName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean setProfileOwner(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public void setProfileOwnerOnOrganizationOwnedDevice(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setRecommendedGlobalProxy(android.content.ComponentName p0, android.net.ProxyInfo p1) throws android.os.RemoteException {}
            public void setRequiredPasswordComplexity(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setRequiredStrongAuthTimeout(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException {}
            public boolean setResetPasswordToken(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException { return false; }
            public void setRestrictionsProvider(android.content.ComponentName p0, android.content.ComponentName p1) throws android.os.RemoteException {}
            public void setScreenCaptureDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException {}
            public void setSecondaryLockscreenEnabled(android.content.ComponentName p0, boolean p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public void setSecureSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setSecurityLoggingEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void setShortSupportMessage(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
            public void setStartUserSessionMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public boolean setStatusBarDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
            public int setStorageEncryption(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return 0; }
            public void setStrings(java.util.List<android.app.admin.DevicePolicyStringResource> p0) throws android.os.RemoteException {}
            public void setSystemSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
            public void setSystemUpdatePolicy(android.content.ComponentName p0, java.lang.String p1, android.app.admin.SystemUpdatePolicy p2) throws android.os.RemoteException {}
            public boolean setTime(android.content.ComponentName p0, java.lang.String p1, long p2) throws android.os.RemoteException { return false; }
            public boolean setTimeZone(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void setTrustAgentConfiguration(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException {}
            public void setUninstallBlocked(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
            public void setUsbDataSignalingEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void setUserControlDisabledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
            public void setUserIcon(android.content.ComponentName p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
            public void setUserProvisioningState(int p0, int p1) throws android.os.RemoteException {}
            public void setUserRestriction(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException {}
            public void setUserRestrictionForUser(java.lang.String p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException {}
            public void setUserRestrictionGlobally(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setUserRestrictionGloballyFromSystem(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void setWifiSsidPolicy(java.lang.String p0, android.app.admin.WifiSsidPolicy p1) throws android.os.RemoteException {}
            public boolean shouldAllowBypassingDevicePolicyManagementRoleQualification() throws android.os.RemoteException { return false; }
            public void startManagedQuickContact(java.lang.String p0, long p1, boolean p2, long p3, android.content.Intent p4) throws android.os.RemoteException {}
            public void startMultiuserManagedDeviceProvisioning() throws android.os.RemoteException {}
            public int startUserInBackground(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
            public boolean startViewCalendarEventInManagedProfile(java.lang.String p0, long p1, long p2, long p3, boolean p4, int p5) throws android.os.RemoteException { return false; }
            public int stopUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
            public boolean switchUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
            public void transferOwnership(android.content.ComponentName p0, android.content.ComponentName p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public boolean triggerDevicePolicyEngineMigration(boolean p0) throws android.os.RemoteException { return false; }
            public void uninstallCaCerts(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException {}
            public void uninstallPackageWithActiveAdmins(java.lang.String p0) throws android.os.RemoteException {}
            public boolean updateOverrideApn(android.content.ComponentName p0, int p1, android.telephony.data.ApnSetting p2) throws android.os.RemoteException { return false; }
            public void wipeDataWithReason(java.lang.String p0, int p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException {}
        }
    }
}
