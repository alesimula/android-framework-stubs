package android.permission;

@android.annotation.SystemApi
public final class PermissionManager {
    public static final java.lang.String ACTION_REVIEW_PERMISSION_DECISIONS = "android.permission.action.REVIEW_PERMISSION_DECISIONS";
    public static final java.lang.String CACHE_KEY_PACKAGE_INFO_CACHE = null;
    public static final long CANNOT_INSTALL_WITH_BAD_PERMISSION_GROUPS = 146211400L;
    public static final boolean DEBUG_DEVICE_PERMISSIONS = false;
    public static final boolean DEBUG_TRACE_GRANTS = false;
    public static final boolean DEBUG_TRACE_PERMISSION_UPDATES = false;
    public static final java.util.Set<java.lang.String> DEVICE_AWARE_PERMISSIONS = null;
    private static final long EXEMPTED_INDICATOR_ROLE_UPDATE_FREQUENCY_MS = 15000L;
    private static final int[] EXEMPTED_ROLES = null;
    public static final int EXPLICIT_SET_FLAGS = 32823;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PERMISSION_USAGES = "android.permission.extra.PERMISSION_USAGES";
    private static final java.lang.String[] INDICATOR_EXEMPTED_PACKAGES = null;
    public static final java.lang.String KILL_APP_REASON_GIDS_CHANGED = "permission grant or revoke changed gids";
    public static final java.lang.String KILL_APP_REASON_PERMISSIONS_REVOKED = "permissions revoked";
    private static final java.lang.String LOG_TAG = null;
    public static final java.lang.String LOG_TAG_TRACE_GRANTS = "PermissionGrantTrace";
    public static final int PERMISSION_GRANTED = 0;
    public static final int PERMISSION_HARD_DENIED = 2;
    public static final int PERMISSION_SOFT_DENIED = 1;
    private static final java.lang.String SYSTEM_PKG = "android";
    private static long sLastIndicatorUpdateTime;
    private static android.app.PropertyInvalidatedCache<android.permission.PermissionManager.PackageNamePermissionQuery, java.lang.Integer> sPackageNamePermissionCache;
    private static final android.app.PropertyInvalidatedCache<android.permission.PermissionManager.PermissionQuery, java.lang.Integer> sPermissionCache = null;
    private static final android.app.PropertyInvalidatedCache<android.permission.PermissionManager.PermissionRequestStateQuery, java.lang.Integer> sPermissionRequestStateCache = null;
    private static volatile boolean sShouldWarnMissingActivityManager;
    private final android.content.Context mContext = null;
    private java.util.List<android.permission.PermissionManager.SplitPermissionInfo> mEnabledSplitPermissionInfos;
    private final android.permission.LegacyPermissionManager mLegacyPermissionManager = null;
    private final android.content.pm.IPackageManager mPackageManager = null;
    private final android.util.ArrayMap<android.content.pm.PackageManager.OnPermissionsChangedListener, android.permission.IOnPermissionsChangeListener> mPermissionListeners = null;
    private final android.permission.IPermissionManager mPermissionManager = null;
    private android.permission.PermissionUsageHelper mUsageHelper;
    public PermissionManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    private static int checkPackageNamePermissionUncached(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) { return 0; }
    public static int checkPermission(java.lang.String p0, int p1, int p2, int p3) { return 0; }
    private static int checkPermissionUncached(java.lang.String p0, int p1, int p2, int p3) { return 0; }
    public static void disablePackageNamePermissionCache() {}
    public static void disablePermissionCache() {}
    public static java.util.Set<java.lang.String> getIndicatorExemptedPackages(android.content.Context p0) { return null; }
    private int getPermissionFlagsInternal(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.UserHandle p3) { return 0; }
    private static int getPermissionRequestStateUncached(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    private java.lang.String getPersistentDeviceId(int p0) { return null; }
    private void grantRuntimePermissionInternal(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.UserHandle p3) {}
    public static int resolveDeviceIdForPermissionCheck(android.content.Context p0, int p1, java.lang.String p2) { return 0; }
    private void revokeRuntimePermissionInternal(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.UserHandle p3, java.lang.String p4) {}
    public static boolean shouldShowPackageForIndicatorCached(android.content.Context p0, java.lang.String p1) { return false; }
    public static boolean shouldTraceGrant(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    private java.util.List<android.permission.PermissionManager.SplitPermissionInfo> splitPermissionInfoListToNonParcelableList(java.util.List<android.content.pm.permission.SplitPermissionInfoParcelable> p0) { return null; }
    public static java.util.List<android.content.pm.permission.SplitPermissionInfoParcelable> splitPermissionInfoListToParcelableList(java.util.List<android.permission.PermissionManager.SplitPermissionInfo> p0) { return null; }
    public static void updateIndicatorExemptedPackages(android.content.Context p0) {}
    private void updatePermissionFlagsInternal(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4, android.os.UserHandle p5) {}
    public boolean addAllowlistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    public void addOnPermissionsChangeListener(android.content.pm.PackageManager.OnPermissionsChangedListener p0) {}
    public boolean addPermission(android.content.pm.PermissionInfo p0, boolean p1) { return false; }
    @android.annotation.SystemApi
    public int checkDeviceIdentifierAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) { return 0; }
    public int checkPackageNamePermission(java.lang.String p0, java.lang.String p1, int p2, int p3) { return 0; }
    @android.annotation.SystemApi
    public int checkPermission(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return 0; }
    public int checkPermissionForDataDelivery(java.lang.String p0, android.content.AttributionSource p1, java.lang.String p2) { return 0; }
    public int checkPermissionForDataDeliveryFromDataSource(java.lang.String p0, android.content.AttributionSource p1, java.lang.String p2) { return 0; }
    public int checkPermissionForPreflight(java.lang.String p0, android.content.AttributionSource p1) { return 0; }
    public int checkPermissionForStartDataDelivery(java.lang.String p0, android.content.AttributionSource p1, java.lang.String p2) { return 0; }
    public void finishDataDelivery(java.lang.String p0, android.content.AttributionSource p1) {}
    public java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int p0) { return null; }
    @android.annotation.SystemApi
    public java.util.Map<java.lang.String, android.permission.PermissionManager.PermissionState> getAllPermissionStates(java.lang.String p0, java.lang.String p1) { return null; }
    public java.util.Set<java.lang.String> getAllowlistedRestrictedPermissions(java.lang.String p0, int p1) { return null; }
    @android.annotation.SystemApi
    public java.util.Set<java.lang.String> getAutoRevokeExemptionGrantedPackages() { return null; }
    @android.annotation.SystemApi
    public java.util.Set<java.lang.String> getAutoRevokeExemptionRequestedPackages() { return null; }
    public java.util.List<android.permission.PermissionGroupUsage> getIndicatorAppOpUsageData() { return null; }
    public java.util.List<android.permission.PermissionGroupUsage> getIndicatorAppOpUsageData(boolean p0) { return null; }
    public int getPermissionFlags(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { return 0; }
    @android.annotation.SystemApi
    public int getPermissionFlags(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return 0; }
    public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) { return null; }
    public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String p0, int p1) { return null; }
    public int getPermissionRequestState(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    public int getRegisteredAttributionSourceCountForTest(int p0) { return 0; }
    @android.annotation.SystemApi
    public int getRuntimePermissionsVersion() { return 0; }
    public java.util.List<android.permission.PermissionManager.SplitPermissionInfo> getSplitPermissions() { return null; }
    public java.util.List<android.permission.PermissionManager.SplitPermissionInfo> getSplitPermissions(boolean p0) { return null; }
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) {}
    @android.annotation.SystemApi
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void initializeUsageHelper() {}
    public boolean isAutoRevokeExempted(java.lang.String p0) { return false; }
    public boolean isPermissionRevokedByPolicy(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean isRegisteredAttributionSource(android.content.AttributionSource p0) { return false; }
    public java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String p0, int p1) { return null; }
    public android.content.AttributionSource registerAttributionSource(android.content.AttributionSource p0) { return null; }
    public boolean removeAllowlistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    public void removeOnPermissionsChangeListener(android.content.pm.PackageManager.OnPermissionsChangedListener p0) {}
    public void removePermission(java.lang.String p0) {}
    public void revokePostNotificationPermissionWithoutKillForTest(java.lang.String p0, int p1) {}
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, java.lang.String p3) {}
    @android.annotation.SystemApi
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    public boolean setAutoRevokeExempted(java.lang.String p0, boolean p1) { return false; }
    @android.annotation.SystemApi
    public void setRuntimePermissionsVersion(int p0) {}
    public boolean shouldShowRequestPermissionRationale(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void startOneTimePermissionSession(java.lang.String p0, long p1, int p2, int p3) {}
    @android.annotation.SystemApi
    public void startOneTimePermissionSession(java.lang.String p0, long p1, long p2, int p3, int p4) {}
    @android.annotation.SystemApi
    public void stopOneTimePermissionSession(java.lang.String p0) {}
    public void tearDownUsageHelper() {}
    public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, int p2, int p3, android.os.UserHandle p4) {}
    @android.annotation.SystemApi
    public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) {}

    private final class OnPermissionsChangeListenerDelegate extends android.permission.IOnPermissionsChangeListener.Stub implements android.os.Handler.Callback {
        private static final int MSG_PERMISSIONS_CHANGED = 1;
        private final android.os.Handler mHandler = null;
        private final android.content.pm.PackageManager.OnPermissionsChangedListener mListener = null;
        public OnPermissionsChangeListenerDelegate(android.permission.PermissionManager p0, android.content.pm.PackageManager.OnPermissionsChangedListener p1, android.os.Looper p2) { super(); }
        public boolean handleMessage(android.os.Message p0) { return false; }
        public void onPermissionsChanged(int p0, java.lang.String p1) {}
    }

    private static final class PackageNamePermissionQuery {
        final java.lang.String permName = null;
        final java.lang.String persistentDeviceId = null;
        final java.lang.String pkgName = null;
        final int userId = 0;
        PackageNamePermissionQuery(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    private static final class PermissionQuery {
        final int deviceId = 0;
        final java.lang.String permission = null;
        final int pid = 0;
        final int uid = 0;
        PermissionQuery(java.lang.String p0, int p1, int p2, int p3) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    private static final class PermissionRequestStateQuery {
        final int mDeviceId = 0;
        final java.lang.String mPackageName = null;
        final java.lang.String mPermission = null;
        PermissionRequestStateQuery(java.lang.String p0, java.lang.String p1, int p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PermissionResult {
    }

    @android.annotation.SystemApi
    public static final class PermissionState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.permission.PermissionManager.PermissionState> CREATOR = null;
        private final int mFlags = 0;
        private final boolean mGranted = false;
        private PermissionState(android.os.Parcel p0) {}
        public PermissionState(boolean p0, int p1) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getFlags() { return 0; }
        public int hashCode() { return 0; }
        public boolean isGranted() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class SplitPermissionInfo {
        private final android.content.pm.permission.SplitPermissionInfoParcelable mSplitPermissionInfoParcelable = null;
        private SplitPermissionInfo(android.content.pm.permission.SplitPermissionInfoParcelable p0) {}
        public SplitPermissionInfo(java.lang.String p0, java.util.List<java.lang.String> p1, int p2, java.lang.String p3, boolean p4) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getFeatureFlag() { return null; }
        public java.util.List<java.lang.String> getNewPermissions() { return null; }
        public java.lang.String getSplitPermission() { return null; }
        public int getTargetSdk() { return 0; }
        public int hashCode() { return 0; }
        public boolean isFeatureFlagNegated() { return false; }
    }
}
