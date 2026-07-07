package android.os;

public class UserManagerCache {
    private static android.os.IpcDataCache<java.lang.Integer, int[]> sEnabledProfileIds;
    private static final java.lang.Object sEnabledProfileIdsLock = null;
    private static android.os.IpcDataCache<java.lang.Integer, int[]> sProfileIdsWithDisabled;
    private static final java.lang.Object sProfileIdsWithDisabledLock = null;
    private static android.os.IpcDataCache<android.os.UserHandle, android.os.UserHandle> sProfileParent;
    private static final java.lang.Object sProfileParentLock = null;
    private static android.os.IpcDataCache<java.lang.Integer, java.util.List<android.content.pm.UserInfo>> sProfiles;
    private static final java.lang.Object sProfilesLock = null;
    private static android.os.IpcDataCache<java.lang.Integer, android.content.pm.UserInfo> sUserInfo;
    private static final java.lang.Object sUserInfoLock = null;
    private static android.os.IpcDataCache<android.os.UserManager.QueryUserId, android.content.pm.UserProperties> sUserPropertiesFromQuery;
    private static final java.lang.Object sUserPropertiesFromQueryLock = null;
    private static android.os.IpcDataCache<android.util.Pair<java.lang.String, java.lang.Integer>, java.lang.Boolean> sUserRestrictionFromQuery;
    private static final java.lang.Object sUserRestrictionFromQueryLock = null;
    private static android.os.IpcDataCache<java.lang.Integer, java.lang.Boolean> sUserUnlocked;
    private static final java.lang.Object sUserUnlockedLock = null;
    private static android.os.IpcDataCache<java.lang.Integer, java.lang.Boolean> sUserUnlockingOrUnlocked;
    private static final java.lang.Object sUserUnlockingOrUnlockedLock = null;
    private android.os.IpcDataCache<android.os.UserHandle, java.lang.Boolean> mQuietModeEnabled;
    private final java.lang.Object mQuietModeEnabledLock = null;
    private android.os.IpcDataCache<java.lang.Integer, java.lang.Integer> mUserSerialNumber;
    private final java.lang.Object mUserSerialNumberLock = null;
    public UserManagerCache() {}
    public static int[] getEnabledProfileIds(android.os.IpcDataCache.RemoteCall<java.lang.Integer, int[]> p0, android.os.IpcDataCache.BypassCall<java.lang.Integer> p1, java.lang.Integer p2) { return null; }
    public static int[] getEnabledProfileIds(android.os.IpcDataCache.RemoteCall<java.lang.Integer, int[]> p0, java.lang.Integer p1) { return null; }
    public static int[] getProfileIdsWithDisabled(android.os.IpcDataCache.RemoteCall<java.lang.Integer, int[]> p0, android.os.IpcDataCache.BypassCall<java.lang.Integer> p1, java.lang.Integer p2) { return null; }
    public static int[] getProfileIdsWithDisabled(android.os.IpcDataCache.RemoteCall<java.lang.Integer, int[]> p0, java.lang.Integer p1) { return null; }
    public static android.os.UserHandle getProfileParent(android.os.IpcDataCache.RemoteCall<android.os.UserHandle, android.os.UserHandle> p0, android.os.IpcDataCache.BypassCall<android.os.UserHandle> p1, android.os.UserHandle p2) { return null; }
    public static android.os.UserHandle getProfileParent(android.os.IpcDataCache.RemoteCall<android.os.UserHandle, android.os.UserHandle> p0, android.os.UserHandle p1) { return null; }
    public static java.util.List<android.content.pm.UserInfo> getProfiles(android.os.IpcDataCache.RemoteCall<java.lang.Integer, java.util.List<android.content.pm.UserInfo>> p0, android.os.IpcDataCache.BypassCall<java.lang.Integer> p1, java.lang.Integer p2) { return null; }
    public static java.util.List<android.content.pm.UserInfo> getProfiles(android.os.IpcDataCache.RemoteCall<java.lang.Integer, java.util.List<android.content.pm.UserInfo>> p0, java.lang.Integer p1) { return null; }
    public static android.content.pm.UserInfo getUserInfo(android.os.IpcDataCache.RemoteCall<java.lang.Integer, android.content.pm.UserInfo> p0, android.os.IpcDataCache.BypassCall<java.lang.Integer> p1, java.lang.Integer p2) { return null; }
    public static android.content.pm.UserInfo getUserInfo(android.os.IpcDataCache.RemoteCall<java.lang.Integer, android.content.pm.UserInfo> p0, java.lang.Integer p1) { return null; }
    public static android.content.pm.UserProperties getUserPropertiesFromQuery(android.os.IpcDataCache.RemoteCall<android.os.UserManager.QueryUserId, android.content.pm.UserProperties> p0, android.os.IpcDataCache.BypassCall<android.os.UserManager.QueryUserId> p1, android.os.UserManager.QueryUserId p2) { return null; }
    public static android.content.pm.UserProperties getUserPropertiesFromQuery(android.os.IpcDataCache.RemoteCall<android.os.UserManager.QueryUserId, android.content.pm.UserProperties> p0, android.os.UserManager.QueryUserId p1) { return null; }
    public static java.lang.Boolean getUserRestrictionFromQuery(android.os.IpcDataCache.RemoteCall<android.util.Pair<java.lang.String, java.lang.Integer>, java.lang.Boolean> p0, android.os.IpcDataCache.BypassCall<android.util.Pair<java.lang.String, java.lang.Integer>> p1, android.util.Pair<java.lang.String, java.lang.Integer> p2) { return null; }
    public static java.lang.Boolean getUserRestrictionFromQuery(android.os.IpcDataCache.RemoteCall<android.util.Pair<java.lang.String, java.lang.Integer>, java.lang.Boolean> p0, android.util.Pair<java.lang.String, java.lang.Integer> p1) { return null; }
    public static void initCache() {}
    public static final void invalidateEnabledProfileIds() {}
    public static final void invalidateProfileIdsWithDisabled() {}
    public static final void invalidateProfileParent() {}
    public static final void invalidateProfiles() {}
    public static final void invalidateQuietModeEnabled() {}
    public static final void invalidateUserInfo() {}
    public static final void invalidateUserPropertiesFromQuery() {}
    public static final void invalidateUserRestrictionFromQuery() {}
    public static final void invalidateUserSerialNumber() {}
    public static final void invalidateUserUnlocked() {}
    public static final void invalidateUserUnlockingOrUnlocked() {}
    public static java.lang.Boolean isUserUnlocked(android.os.IpcDataCache.RemoteCall<java.lang.Integer, java.lang.Boolean> p0, android.os.IpcDataCache.BypassCall<java.lang.Integer> p1, java.lang.Integer p2) { return null; }
    public static java.lang.Boolean isUserUnlocked(android.os.IpcDataCache.RemoteCall<java.lang.Integer, java.lang.Boolean> p0, java.lang.Integer p1) { return null; }
    public static java.lang.Boolean isUserUnlockingOrUnlocked(android.os.IpcDataCache.RemoteCall<java.lang.Integer, java.lang.Boolean> p0, android.os.IpcDataCache.BypassCall<java.lang.Integer> p1, java.lang.Integer p2) { return null; }
    public static java.lang.Boolean isUserUnlockingOrUnlocked(android.os.IpcDataCache.RemoteCall<java.lang.Integer, java.lang.Boolean> p0, java.lang.Integer p1) { return null; }
    public java.lang.Integer getUserSerialNumber(android.os.IpcDataCache.RemoteCall<java.lang.Integer, java.lang.Integer> p0, android.os.IpcDataCache.BypassCall<java.lang.Integer> p1, java.lang.Integer p2) { return null; }
    public java.lang.Integer getUserSerialNumber(android.os.IpcDataCache.RemoteCall<java.lang.Integer, java.lang.Integer> p0, java.lang.Integer p1) { return null; }
    public java.lang.Boolean isQuietModeEnabled(android.os.IpcDataCache.RemoteCall<android.os.UserHandle, java.lang.Boolean> p0, android.os.IpcDataCache.BypassCall<android.os.UserHandle> p1, android.os.UserHandle p2) { return null; }
    public java.lang.Boolean isQuietModeEnabled(android.os.IpcDataCache.RemoteCall<android.os.UserHandle, java.lang.Boolean> p0, android.os.UserHandle p1) { return null; }
}
