package android.os;

public interface IUserManager extends android.os.IInterface {
    public void addUserRestrictionsListener(android.os.IUserRestrictionsListener p0) throws android.os.RemoteException;
    public boolean canAddMoreProfilesToUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean canAddMoreUsersOfType(java.lang.String p0) throws android.os.RemoteException;
    public boolean canHaveRestrictedProfile(int p0) throws android.os.RemoteException;
    public void clearSeedAccountData(int p0) throws android.os.RemoteException;
    public android.content.pm.UserInfo createProfileForUserEvenWhenDisallowedWithThrow(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException;
    public android.content.pm.UserInfo createProfileForUserWithThrow(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException;
    public android.content.pm.UserInfo createRestrictedProfileWithThrow(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.os.UserHandle createUserWithAttributes(java.lang.String p0, java.lang.String p1, int p2, android.graphics.Bitmap p3, java.lang.String p4, java.lang.String p5, android.os.PersistableBundle p6) throws android.os.RemoteException;
    public android.content.pm.UserInfo createUserWithThrow(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void evictCredentialEncryptionKey(int p0) throws android.os.RemoteException;
    public android.os.Bundle getApplicationRestrictions(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Bundle getApplicationRestrictionsForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getBootUser() throws android.os.RemoteException;
    public int getCommunalProfileId() throws android.os.RemoteException;
    public int getCredentialOwnerProfile(int p0) throws android.os.RemoteException;
    public int getCurrentAllowedNumberOfUsers(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Bundle getDefaultGuestRestrictions() throws android.os.RemoteException;
    public java.util.List<android.content.pm.UserInfo> getGuestUsers() throws android.os.RemoteException;
    public int getMainDisplayIdAssignedToUser(int p0) throws android.os.RemoteException;
    public int getMainUserId() throws android.os.RemoteException;
    public java.lang.String[] getPreInstallableSystemPackages(java.lang.String p0) throws android.os.RemoteException;
    public int getPreviousUserToEnterForeground() throws android.os.RemoteException;
    public android.content.pm.UserInfo getPrimaryUser() throws android.os.RemoteException;
    public int getProfileAccessibilityLabelResId(int p0) throws android.os.RemoteException;
    public int[] getProfileIds(int p0, boolean p1) throws android.os.RemoteException;
    public int[] getProfileIdsExcludingHidden(int p0, boolean p1) throws android.os.RemoteException;
    public int getProfileLabelResId(int p0) throws android.os.RemoteException;
    public android.content.pm.UserInfo getProfileParent(int p0) throws android.os.RemoteException;
    public int getProfileParentId(int p0) throws android.os.RemoteException;
    public java.lang.String getProfileType(int p0) throws android.os.RemoteException;
    public java.util.List<android.content.pm.UserInfo> getProfiles(int p0, boolean p1) throws android.os.RemoteException;
    public int getRemainingCreatableProfileCount(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getRemainingCreatableUserCount(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getSeedAccountName(int p0) throws android.os.RemoteException;
    public android.os.PersistableBundle getSeedAccountOptions(int p0) throws android.os.RemoteException;
    public java.lang.String getSeedAccountType(int p0) throws android.os.RemoteException;
    public java.lang.String getUserAccount(int p0) throws android.os.RemoteException;
    public int getUserBadgeColorResId(int p0) throws android.os.RemoteException;
    public int getUserBadgeDarkColorResId(int p0) throws android.os.RemoteException;
    public int getUserBadgeLabelResId(int p0) throws android.os.RemoteException;
    public int getUserBadgeNoBackgroundResId(int p0) throws android.os.RemoteException;
    public int getUserBadgeResId(int p0) throws android.os.RemoteException;
    public long getUserCreationTime(int p0) throws android.os.RemoteException;
    public int getUserHandle(int p0) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getUserIcon(int p0) throws android.os.RemoteException;
    public int getUserIconBadgeResId(int p0) throws android.os.RemoteException;
    public android.content.pm.UserInfo getUserInfo(int p0) throws android.os.RemoteException;
    public int getUserLogoutability(int p0) throws android.os.RemoteException;
    public java.lang.String getUserName() throws android.os.RemoteException;
    public android.content.pm.UserProperties getUserPropertiesCopy(int p0) throws android.os.RemoteException;
    public int getUserRemovability(int p0) throws android.os.RemoteException;
    public int getUserRestrictionSource(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.os.UserManager.EnforcingUser> getUserRestrictionSources(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.os.Bundle getUserRestrictions(int p0) throws android.os.RemoteException;
    public int getUserSerialNumber(int p0) throws android.os.RemoteException;
    public long getUserStartRealtime() throws android.os.RemoteException;
    public int getUserStatusBarIconResId(int p0) throws android.os.RemoteException;
    public int getUserSwitchability(int p0) throws android.os.RemoteException;
    public long getUserUnlockRealtime() throws android.os.RemoteException;
    public java.util.List<android.content.pm.UserInfo> getUsers(boolean p0) throws android.os.RemoteException;
    public int[] getVisibleUsers() throws android.os.RemoteException;
    public boolean hasBadge(int p0) throws android.os.RemoteException;
    public boolean hasBaseUserRestriction(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasRestrictedProfiles(int p0) throws android.os.RemoteException;
    public boolean hasUserRestriction(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasUserRestrictionOnAnyUser(java.lang.String p0) throws android.os.RemoteException;
    public boolean isAdminUser(int p0) throws android.os.RemoteException;
    public boolean isDemoUser(int p0) throws android.os.RemoteException;
    public boolean isForegroundUserAdmin() throws android.os.RemoteException;
    public boolean isHeadlessSystemUserMode() throws android.os.RemoteException;
    public boolean isMainUser(int p0) throws android.os.RemoteException;
    public boolean isPreCreated(int p0) throws android.os.RemoteException;
    public boolean isQuietModeEnabled(int p0) throws android.os.RemoteException;
    public boolean isRestricted(int p0) throws android.os.RemoteException;
    public boolean isSameProfileGroup(int p0, int p1) throws android.os.RemoteException;
    public boolean isSettingRestrictedForUser(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public boolean isUserForeground(int p0) throws android.os.RemoteException;
    public boolean isUserNameSet(int p0) throws android.os.RemoteException;
    public boolean isUserOfType(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isUserRunning(int p0) throws android.os.RemoteException;
    public boolean isUserSwitcherEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public boolean isUserTypeSupportedIncludingSystem(java.lang.String p0) throws android.os.RemoteException;
    public boolean isUserUnlocked(int p0) throws android.os.RemoteException;
    public boolean isUserUnlockingOrUnlocked(int p0) throws android.os.RemoteException;
    public boolean isUserVisible(int p0) throws android.os.RemoteException;
    public void logContextIssue(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public boolean markGuestForDeletion(int p0) throws android.os.RemoteException;
    public android.content.pm.UserInfo preCreateUserWithThrow(java.lang.String p0) throws android.os.RemoteException;
    public boolean removeUser(int p0) throws android.os.RemoteException;
    public boolean removeUserEvenWhenDisallowed(int p0) throws android.os.RemoteException;
    public int removeUserWhenPossible(int p0, boolean p1) throws android.os.RemoteException;
    public boolean requestQuietModeEnabled(java.lang.String p0, boolean p1, int p2, android.content.IntentSender p3, int p4) throws android.os.RemoteException;
    public void revokeUserAdmin(int p0) throws android.os.RemoteException;
    public void setApplicationRestrictions(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public void setBootUser(int p0) throws android.os.RemoteException;
    public void setDefaultGuestRestrictions(android.os.Bundle p0) throws android.os.RemoteException;
    public void setSeedAccountData(int p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException;
    public void setTemporaryActivitiesAllowlist(java.lang.String p0, java.util.List<android.content.ComponentName> p1) throws android.os.RemoteException;
    public void setUserAccount(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setUserAdmin(int p0) throws android.os.RemoteException;
    public void setUserEnabled(int p0) throws android.os.RemoteException;
    public boolean setUserEphemeral(int p0, boolean p1) throws android.os.RemoteException;
    public void setUserIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException;
    public void setUserName(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setUserRestriction(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean someUserHasAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean someUserHasSeedAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.os.IUserManager {
        public Default() {}
        public void addUserRestrictionsListener(android.os.IUserRestrictionsListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public boolean canAddMoreProfilesToUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean canAddMoreUsersOfType(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean canHaveRestrictedProfile(int p0) throws android.os.RemoteException { return false; }
        public void clearSeedAccountData(int p0) throws android.os.RemoteException {}
        public android.content.pm.UserInfo createProfileForUserEvenWhenDisallowedWithThrow(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException { return null; }
        public android.content.pm.UserInfo createProfileForUserWithThrow(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException { return null; }
        public android.content.pm.UserInfo createRestrictedProfileWithThrow(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.UserHandle createUserWithAttributes(java.lang.String p0, java.lang.String p1, int p2, android.graphics.Bitmap p3, java.lang.String p4, java.lang.String p5, android.os.PersistableBundle p6) throws android.os.RemoteException { return null; }
        public android.content.pm.UserInfo createUserWithThrow(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public void evictCredentialEncryptionKey(int p0) throws android.os.RemoteException {}
        public android.os.Bundle getApplicationRestrictions(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.Bundle getApplicationRestrictionsForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public int getBootUser() throws android.os.RemoteException { return 0; }
        public int getCommunalProfileId() throws android.os.RemoteException { return 0; }
        public int getCredentialOwnerProfile(int p0) throws android.os.RemoteException { return 0; }
        public int getCurrentAllowedNumberOfUsers(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public android.os.Bundle getDefaultGuestRestrictions() throws android.os.RemoteException { return null; }
        public java.util.List<android.content.pm.UserInfo> getGuestUsers() throws android.os.RemoteException { return null; }
        public int getMainDisplayIdAssignedToUser(int p0) throws android.os.RemoteException { return 0; }
        public int getMainUserId() throws android.os.RemoteException { return 0; }
        public java.lang.String[] getPreInstallableSystemPackages(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getPreviousUserToEnterForeground() throws android.os.RemoteException { return 0; }
        public android.content.pm.UserInfo getPrimaryUser() throws android.os.RemoteException { return null; }
        public int getProfileAccessibilityLabelResId(int p0) throws android.os.RemoteException { return 0; }
        public int[] getProfileIds(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public int[] getProfileIdsExcludingHidden(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public int getProfileLabelResId(int p0) throws android.os.RemoteException { return 0; }
        public android.content.pm.UserInfo getProfileParent(int p0) throws android.os.RemoteException { return null; }
        public int getProfileParentId(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getProfileType(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.content.pm.UserInfo> getProfiles(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public int getRemainingCreatableProfileCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int getRemainingCreatableUserCount(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getSeedAccountName(int p0) throws android.os.RemoteException { return null; }
        public android.os.PersistableBundle getSeedAccountOptions(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getSeedAccountType(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getUserAccount(int p0) throws android.os.RemoteException { return null; }
        public int getUserBadgeColorResId(int p0) throws android.os.RemoteException { return 0; }
        public int getUserBadgeDarkColorResId(int p0) throws android.os.RemoteException { return 0; }
        public int getUserBadgeLabelResId(int p0) throws android.os.RemoteException { return 0; }
        public int getUserBadgeNoBackgroundResId(int p0) throws android.os.RemoteException { return 0; }
        public int getUserBadgeResId(int p0) throws android.os.RemoteException { return 0; }
        public long getUserCreationTime(int p0) throws android.os.RemoteException { return 0L; }
        public int getUserHandle(int p0) throws android.os.RemoteException { return 0; }
        public android.os.ParcelFileDescriptor getUserIcon(int p0) throws android.os.RemoteException { return null; }
        public int getUserIconBadgeResId(int p0) throws android.os.RemoteException { return 0; }
        public android.content.pm.UserInfo getUserInfo(int p0) throws android.os.RemoteException { return null; }
        public int getUserLogoutability(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getUserName() throws android.os.RemoteException { return null; }
        public android.content.pm.UserProperties getUserPropertiesCopy(int p0) throws android.os.RemoteException { return null; }
        public int getUserRemovability(int p0) throws android.os.RemoteException { return 0; }
        public int getUserRestrictionSource(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public java.util.List<android.os.UserManager.EnforcingUser> getUserRestrictionSources(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle getUserRestrictions(int p0) throws android.os.RemoteException { return null; }
        public int getUserSerialNumber(int p0) throws android.os.RemoteException { return 0; }
        public long getUserStartRealtime() throws android.os.RemoteException { return 0L; }
        public int getUserStatusBarIconResId(int p0) throws android.os.RemoteException { return 0; }
        public int getUserSwitchability(int p0) throws android.os.RemoteException { return 0; }
        public long getUserUnlockRealtime() throws android.os.RemoteException { return 0L; }
        public java.util.List<android.content.pm.UserInfo> getUsers(boolean p0) throws android.os.RemoteException { return null; }
        public int[] getVisibleUsers() throws android.os.RemoteException { return null; }
        public boolean hasBadge(int p0) throws android.os.RemoteException { return false; }
        public boolean hasBaseUserRestriction(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean hasRestrictedProfiles(int p0) throws android.os.RemoteException { return false; }
        public boolean hasUserRestriction(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean hasUserRestrictionOnAnyUser(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isAdminUser(int p0) throws android.os.RemoteException { return false; }
        public boolean isDemoUser(int p0) throws android.os.RemoteException { return false; }
        public boolean isForegroundUserAdmin() throws android.os.RemoteException { return false; }
        public boolean isHeadlessSystemUserMode() throws android.os.RemoteException { return false; }
        public boolean isMainUser(int p0) throws android.os.RemoteException { return false; }
        public boolean isPreCreated(int p0) throws android.os.RemoteException { return false; }
        public boolean isQuietModeEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isRestricted(int p0) throws android.os.RemoteException { return false; }
        public boolean isSameProfileGroup(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isSettingRestrictedForUser(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException { return false; }
        public boolean isUserForeground(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserNameSet(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserOfType(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isUserRunning(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserSwitcherEnabled(boolean p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isUserTypeSupportedIncludingSystem(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isUserUnlocked(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserUnlockingOrUnlocked(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserVisible(int p0) throws android.os.RemoteException { return false; }
        public void logContextIssue(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public boolean markGuestForDeletion(int p0) throws android.os.RemoteException { return false; }
        public android.content.pm.UserInfo preCreateUserWithThrow(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean removeUser(int p0) throws android.os.RemoteException { return false; }
        public boolean removeUserEvenWhenDisallowed(int p0) throws android.os.RemoteException { return false; }
        public int removeUserWhenPossible(int p0, boolean p1) throws android.os.RemoteException { return 0; }
        public boolean requestQuietModeEnabled(java.lang.String p0, boolean p1, int p2, android.content.IntentSender p3, int p4) throws android.os.RemoteException { return false; }
        public void revokeUserAdmin(int p0) throws android.os.RemoteException {}
        public void setApplicationRestrictions(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public void setBootUser(int p0) throws android.os.RemoteException {}
        public void setDefaultGuestRestrictions(android.os.Bundle p0) throws android.os.RemoteException {}
        public void setSeedAccountData(int p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException {}
        public void setTemporaryActivitiesAllowlist(java.lang.String p0, java.util.List<android.content.ComponentName> p1) throws android.os.RemoteException {}
        public void setUserAccount(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setUserAdmin(int p0) throws android.os.RemoteException {}
        public void setUserEnabled(int p0) throws android.os.RemoteException {}
        public boolean setUserEphemeral(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public void setUserIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
        public void setUserName(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setUserRestriction(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
        public boolean someUserHasAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean someUserHasSeedAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IUserManager {
        public static final java.lang.String DESCRIPTOR = "android.os.IUserManager";
        static final int TRANSACTION_addUserRestrictionsListener = 55;
        static final int TRANSACTION_canAddMoreProfilesToUser = 31;
        static final int TRANSACTION_canAddMoreUsersOfType = 28;
        static final int TRANSACTION_canHaveRestrictedProfile = 45;
        static final int TRANSACTION_clearSeedAccountData = 71;
        static final int TRANSACTION_createProfileForUserEvenWhenDisallowedWithThrow = 78;
        static final int TRANSACTION_createProfileForUserWithThrow = 5;
        static final int TRANSACTION_createRestrictedProfileWithThrow = 6;
        static final int TRANSACTION_createUserWithAttributes = 66;
        static final int TRANSACTION_createUserWithThrow = 3;
        static final int TRANSACTION_evictCredentialEncryptionKey = 11;
        static final int TRANSACTION_getApplicationRestrictions = 58;
        static final int TRANSACTION_getApplicationRestrictionsForUser = 59;
        static final int TRANSACTION_getBootUser = 105;
        static final int TRANSACTION_getCommunalProfileId = 21;
        static final int TRANSACTION_getCredentialOwnerProfile = 1;
        static final int TRANSACTION_getCurrentAllowedNumberOfUsers = 27;
        static final int TRANSACTION_getDefaultGuestRestrictions = 61;
        static final int TRANSACTION_getGuestUsers = 64;
        static final int TRANSACTION_getMainDisplayIdAssignedToUser = 95;
        static final int TRANSACTION_getMainUserId = 19;
        static final int TRANSACTION_getPreInstallableSystemPackages = 7;
        static final int TRANSACTION_getPreviousUserToEnterForeground = 22;
        static final int TRANSACTION_getPrimaryUser = 18;
        static final int TRANSACTION_getProfileAccessibilityLabelResId = 89;
        static final int TRANSACTION_getProfileIds = 25;
        static final int TRANSACTION_getProfileIdsExcludingHidden = 106;
        static final int TRANSACTION_getProfileLabelResId = 88;
        static final int TRANSACTION_getProfileParent = 32;
        static final int TRANSACTION_getProfileParentId = 2;
        static final int TRANSACTION_getProfileType = 74;
        static final int TRANSACTION_getProfiles = 24;
        static final int TRANSACTION_getRemainingCreatableProfileCount = 30;
        static final int TRANSACTION_getRemainingCreatableUserCount = 29;
        static final int TRANSACTION_getSeedAccountName = 68;
        static final int TRANSACTION_getSeedAccountOptions = 70;
        static final int TRANSACTION_getSeedAccountType = 69;
        static final int TRANSACTION_getUserAccount = 38;
        static final int TRANSACTION_getUserBadgeColorResId = 84;
        static final int TRANSACTION_getUserBadgeDarkColorResId = 85;
        static final int TRANSACTION_getUserBadgeLabelResId = 83;
        static final int TRANSACTION_getUserBadgeNoBackgroundResId = 82;
        static final int TRANSACTION_getUserBadgeResId = 81;
        static final int TRANSACTION_getUserCreationTime = 40;
        static final int TRANSACTION_getUserHandle = 47;
        static final int TRANSACTION_getUserIcon = 17;
        static final int TRANSACTION_getUserIconBadgeResId = 80;
        static final int TRANSACTION_getUserInfo = 36;
        static final int TRANSACTION_getUserLogoutability = 43;
        static final int TRANSACTION_getUserName = 100;
        static final int TRANSACTION_getUserPropertiesCopy = 37;
        static final int TRANSACTION_getUserRemovability = 14;
        static final int TRANSACTION_getUserRestrictionSource = 48;
        static final int TRANSACTION_getUserRestrictionSources = 49;
        static final int TRANSACTION_getUserRestrictions = 50;
        static final int TRANSACTION_getUserSerialNumber = 46;
        static final int TRANSACTION_getUserStartRealtime = 101;
        static final int TRANSACTION_getUserStatusBarIconResId = 86;
        static final int TRANSACTION_getUserSwitchability = 41;
        static final int TRANSACTION_getUserUnlockRealtime = 102;
        static final int TRANSACTION_getUsers = 23;
        static final int TRANSACTION_getVisibleUsers = 94;
        static final int TRANSACTION_hasBadge = 87;
        static final int TRANSACTION_hasBaseUserRestriction = 51;
        static final int TRANSACTION_hasRestrictedProfiles = 98;
        static final int TRANSACTION_hasUserRestriction = 52;
        static final int TRANSACTION_hasUserRestrictionOnAnyUser = 53;
        static final int TRANSACTION_isAdminUser = 76;
        static final int TRANSACTION_isDemoUser = 75;
        static final int TRANSACTION_isForegroundUserAdmin = 96;
        static final int TRANSACTION_isHeadlessSystemUserMode = 34;
        static final int TRANSACTION_isMainUser = 20;
        static final int TRANSACTION_isPreCreated = 77;
        static final int TRANSACTION_isQuietModeEnabled = 65;
        static final int TRANSACTION_isRestricted = 44;
        static final int TRANSACTION_isSameProfileGroup = 33;
        static final int TRANSACTION_isSettingRestrictedForUser = 54;
        static final int TRANSACTION_isUserForeground = 92;
        static final int TRANSACTION_isUserNameSet = 97;
        static final int TRANSACTION_isUserOfType = 35;
        static final int TRANSACTION_isUserRunning = 91;
        static final int TRANSACTION_isUserSwitcherEnabled = 42;
        static final int TRANSACTION_isUserTypeSupportedIncludingSystem = 26;
        static final int TRANSACTION_isUserUnlocked = 90;
        static final int TRANSACTION_isUserUnlockingOrUnlocked = 79;
        static final int TRANSACTION_isUserVisible = 93;
        static final int TRANSACTION_logContextIssue = 108;
        static final int TRANSACTION_markGuestForDeletion = 63;
        static final int TRANSACTION_preCreateUserWithThrow = 4;
        static final int TRANSACTION_removeUser = 12;
        static final int TRANSACTION_removeUserEvenWhenDisallowed = 13;
        static final int TRANSACTION_removeUserWhenPossible = 62;
        static final int TRANSACTION_requestQuietModeEnabled = 99;
        static final int TRANSACTION_revokeUserAdmin = 10;
        static final int TRANSACTION_setApplicationRestrictions = 57;
        static final int TRANSACTION_setBootUser = 104;
        static final int TRANSACTION_setDefaultGuestRestrictions = 60;
        static final int TRANSACTION_setSeedAccountData = 67;
        static final int TRANSACTION_setTemporaryActivitiesAllowlist = 107;
        static final int TRANSACTION_setUserAccount = 39;
        static final int TRANSACTION_setUserAdmin = 9;
        static final int TRANSACTION_setUserEnabled = 8;
        static final int TRANSACTION_setUserEphemeral = 103;
        static final int TRANSACTION_setUserIcon = 16;
        static final int TRANSACTION_setUserName = 15;
        static final int TRANSACTION_setUserRestriction = 56;
        static final int TRANSACTION_someUserHasAccount = 73;
        static final int TRANSACTION_someUserHasSeedAccount = 72;
        public Stub() { super(); }
        public static android.os.IUserManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.IUserManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addUserRestrictionsListener(android.os.IUserRestrictionsListener p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public boolean canAddMoreProfilesToUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean canAddMoreUsersOfType(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean canHaveRestrictedProfile(int p0) throws android.os.RemoteException { return false; }
            public void clearSeedAccountData(int p0) throws android.os.RemoteException {}
            public android.content.pm.UserInfo createProfileForUserEvenWhenDisallowedWithThrow(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException { return null; }
            public android.content.pm.UserInfo createProfileForUserWithThrow(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException { return null; }
            public android.content.pm.UserInfo createRestrictedProfileWithThrow(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.os.UserHandle createUserWithAttributes(java.lang.String p0, java.lang.String p1, int p2, android.graphics.Bitmap p3, java.lang.String p4, java.lang.String p5, android.os.PersistableBundle p6) throws android.os.RemoteException { return null; }
            public android.content.pm.UserInfo createUserWithThrow(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public void evictCredentialEncryptionKey(int p0) throws android.os.RemoteException {}
            public android.os.Bundle getApplicationRestrictions(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.Bundle getApplicationRestrictionsForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public int getBootUser() throws android.os.RemoteException { return 0; }
            public int getCommunalProfileId() throws android.os.RemoteException { return 0; }
            public int getCredentialOwnerProfile(int p0) throws android.os.RemoteException { return 0; }
            public int getCurrentAllowedNumberOfUsers(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public android.os.Bundle getDefaultGuestRestrictions() throws android.os.RemoteException { return null; }
            public java.util.List<android.content.pm.UserInfo> getGuestUsers() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getMainDisplayIdAssignedToUser(int p0) throws android.os.RemoteException { return 0; }
            public int getMainUserId() throws android.os.RemoteException { return 0; }
            public java.lang.String[] getPreInstallableSystemPackages(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getPreviousUserToEnterForeground() throws android.os.RemoteException { return 0; }
            public android.content.pm.UserInfo getPrimaryUser() throws android.os.RemoteException { return null; }
            public int getProfileAccessibilityLabelResId(int p0) throws android.os.RemoteException { return 0; }
            public int[] getProfileIds(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public int[] getProfileIdsExcludingHidden(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public int getProfileLabelResId(int p0) throws android.os.RemoteException { return 0; }
            public android.content.pm.UserInfo getProfileParent(int p0) throws android.os.RemoteException { return null; }
            public int getProfileParentId(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getProfileType(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.content.pm.UserInfo> getProfiles(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public int getRemainingCreatableProfileCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int getRemainingCreatableUserCount(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getSeedAccountName(int p0) throws android.os.RemoteException { return null; }
            public android.os.PersistableBundle getSeedAccountOptions(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getSeedAccountType(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getUserAccount(int p0) throws android.os.RemoteException { return null; }
            public int getUserBadgeColorResId(int p0) throws android.os.RemoteException { return 0; }
            public int getUserBadgeDarkColorResId(int p0) throws android.os.RemoteException { return 0; }
            public int getUserBadgeLabelResId(int p0) throws android.os.RemoteException { return 0; }
            public int getUserBadgeNoBackgroundResId(int p0) throws android.os.RemoteException { return 0; }
            public int getUserBadgeResId(int p0) throws android.os.RemoteException { return 0; }
            public long getUserCreationTime(int p0) throws android.os.RemoteException { return 0L; }
            public int getUserHandle(int p0) throws android.os.RemoteException { return 0; }
            public android.os.ParcelFileDescriptor getUserIcon(int p0) throws android.os.RemoteException { return null; }
            public int getUserIconBadgeResId(int p0) throws android.os.RemoteException { return 0; }
            public android.content.pm.UserInfo getUserInfo(int p0) throws android.os.RemoteException { return null; }
            public int getUserLogoutability(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getUserName() throws android.os.RemoteException { return null; }
            public android.content.pm.UserProperties getUserPropertiesCopy(int p0) throws android.os.RemoteException { return null; }
            public int getUserRemovability(int p0) throws android.os.RemoteException { return 0; }
            public int getUserRestrictionSource(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public java.util.List<android.os.UserManager.EnforcingUser> getUserRestrictionSources(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle getUserRestrictions(int p0) throws android.os.RemoteException { return null; }
            public int getUserSerialNumber(int p0) throws android.os.RemoteException { return 0; }
            public long getUserStartRealtime() throws android.os.RemoteException { return 0L; }
            public int getUserStatusBarIconResId(int p0) throws android.os.RemoteException { return 0; }
            public int getUserSwitchability(int p0) throws android.os.RemoteException { return 0; }
            public long getUserUnlockRealtime() throws android.os.RemoteException { return 0L; }
            public java.util.List<android.content.pm.UserInfo> getUsers(boolean p0) throws android.os.RemoteException { return null; }
            public int[] getVisibleUsers() throws android.os.RemoteException { return null; }
            public boolean hasBadge(int p0) throws android.os.RemoteException { return false; }
            public boolean hasBaseUserRestriction(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean hasRestrictedProfiles(int p0) throws android.os.RemoteException { return false; }
            public boolean hasUserRestriction(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean hasUserRestrictionOnAnyUser(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isAdminUser(int p0) throws android.os.RemoteException { return false; }
            public boolean isDemoUser(int p0) throws android.os.RemoteException { return false; }
            public boolean isForegroundUserAdmin() throws android.os.RemoteException { return false; }
            public boolean isHeadlessSystemUserMode() throws android.os.RemoteException { return false; }
            public boolean isMainUser(int p0) throws android.os.RemoteException { return false; }
            public boolean isPreCreated(int p0) throws android.os.RemoteException { return false; }
            public boolean isQuietModeEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isRestricted(int p0) throws android.os.RemoteException { return false; }
            public boolean isSameProfileGroup(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isSettingRestrictedForUser(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException { return false; }
            public boolean isUserForeground(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserNameSet(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserOfType(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isUserRunning(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserSwitcherEnabled(boolean p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isUserTypeSupportedIncludingSystem(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isUserUnlocked(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserUnlockingOrUnlocked(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserVisible(int p0) throws android.os.RemoteException { return false; }
            public void logContextIssue(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public boolean markGuestForDeletion(int p0) throws android.os.RemoteException { return false; }
            public android.content.pm.UserInfo preCreateUserWithThrow(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean removeUser(int p0) throws android.os.RemoteException { return false; }
            public boolean removeUserEvenWhenDisallowed(int p0) throws android.os.RemoteException { return false; }
            public int removeUserWhenPossible(int p0, boolean p1) throws android.os.RemoteException { return 0; }
            public boolean requestQuietModeEnabled(java.lang.String p0, boolean p1, int p2, android.content.IntentSender p3, int p4) throws android.os.RemoteException { return false; }
            public void revokeUserAdmin(int p0) throws android.os.RemoteException {}
            public void setApplicationRestrictions(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
            public void setBootUser(int p0) throws android.os.RemoteException {}
            public void setDefaultGuestRestrictions(android.os.Bundle p0) throws android.os.RemoteException {}
            public void setSeedAccountData(int p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException {}
            public void setTemporaryActivitiesAllowlist(java.lang.String p0, java.util.List<android.content.ComponentName> p1) throws android.os.RemoteException {}
            public void setUserAccount(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setUserAdmin(int p0) throws android.os.RemoteException {}
            public void setUserEnabled(int p0) throws android.os.RemoteException {}
            public boolean setUserEphemeral(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public void setUserIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
            public void setUserName(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setUserRestriction(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
            public boolean someUserHasAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean someUserHasSeedAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        }
    }
}
