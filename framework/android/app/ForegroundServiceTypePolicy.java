package android.app;

public abstract class ForegroundServiceTypePolicy {
    static final boolean DEBUG_FOREGROUND_SERVICE_TYPE_POLICY = false;
    private static final boolean DEFAULT_FGS_TYPE_FG_PERM_ENFORCEMENT_FLAG_VALUE = true;
    public static final long FGS_TYPE_DATA_SYNC_DEPRECATION_CHANGE_ID = 255039210L;
    public static final long FGS_TYPE_DATA_SYNC_DISABLED_CHANGE_ID = 255659651L;
    private static final java.lang.String FGS_TYPE_FG_PERM_ENFORCEMENT_FLAG = "fgs_type_fg_perm_enforcement_flag";
    public static final long FGS_TYPE_NONE_DEPRECATION_CHANGE_ID = 255042465L;
    public static final long FGS_TYPE_NONE_DISABLED_CHANGE_ID = 255038118L;
    public static final long FGS_TYPE_PERMISSION_CHANGE_ID = 254662522L;
    private static final java.lang.String FGS_TYPE_PERM_ENFORCEMENT_FLAG_CAMERA = "fgs_type_perm_enforcement_flag_camera";
    private static final java.lang.String FGS_TYPE_PERM_ENFORCEMENT_FLAG_CONNECTED_DEVICE = "fgs_type_perm_enforcement_flag_connected_device";
    private static final java.lang.String FGS_TYPE_PERM_ENFORCEMENT_FLAG_DATA_SYNC = "fgs_type_perm_enforcement_flag_data_sync";
    private static final java.lang.String FGS_TYPE_PERM_ENFORCEMENT_FLAG_HEALTH = "fgs_type_perm_enforcement_flag_health";
    private static final java.lang.String FGS_TYPE_PERM_ENFORCEMENT_FLAG_LOCATION = "fgs_type_perm_enforcement_flag_location";
    private static final java.lang.String FGS_TYPE_PERM_ENFORCEMENT_FLAG_MEDIA_PLAYBACK = "fgs_type_perm_enforcement_flag_media_playback";
    private static final java.lang.String FGS_TYPE_PERM_ENFORCEMENT_FLAG_MEDIA_PROJECTION = "fgs_type_perm_enforcement_flag_media_projection";
    private static final java.lang.String FGS_TYPE_PERM_ENFORCEMENT_FLAG_MICROPHONE = "fgs_type_perm_enforcement_flag_microphone";
    private static final java.lang.String FGS_TYPE_PERM_ENFORCEMENT_FLAG_PHONE_CALL = "fgs_type_perm_enforcement_flag_phone_call";
    private static final java.lang.String FGS_TYPE_PERM_ENFORCEMENT_FLAG_PREFIX = "fgs_type_perm_enforcement_flag_";
    private static final java.lang.String FGS_TYPE_PERM_ENFORCEMENT_FLAG_REMOTE_MESSAGING = "fgs_type_perm_enforcement_flag_remote_messaging";
    private static final java.lang.String FGS_TYPE_PERM_ENFORCEMENT_FLAG_SPECIAL_USE = "fgs_type_perm_enforcement_flag_special_use";
    private static final java.lang.String FGS_TYPE_PERM_ENFORCEMENT_FLAG_SYSTEM_EXEMPTED = "fgs_type_perm_enforcement_flag_system_exempted";
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_CAMERA = null;
    public static final int FGS_TYPE_POLICY_CHECK_DEPRECATED = 2;
    public static final int FGS_TYPE_POLICY_CHECK_DISABLED = 3;
    public static final int FGS_TYPE_POLICY_CHECK_OK = 1;
    public static final int FGS_TYPE_POLICY_CHECK_PERMISSION_DENIED_ENFORCED = 5;
    public static final int FGS_TYPE_POLICY_CHECK_PERMISSION_DENIED_PERMISSIVE = 4;
    public static final int FGS_TYPE_POLICY_CHECK_UNKNOWN = 0;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_CONNECTED_DEVICE = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_DATA_SYNC = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_FILE_MANAGEMENT = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_HEALTH = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_LOCATION = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_MANIFEST = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_MEDIA_PLAYBACK = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_MEDIA_PROCESSING = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_MEDIA_PROJECTION = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_MICROPHONE = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_NONE = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_PHONE_CALL = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_REMOTE_MESSAGING = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_SHORT_SERVICE = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_SPECIAL_USE = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_SYSTEM_EXEMPTED = null;
    static final java.lang.String TAG = "ForegroundServiceTypePolicy";
    private static android.app.ForegroundServiceTypePolicy sDefaultForegroundServiceTypePolicy;
    private static final java.lang.Object sLock = null;
    public ForegroundServiceTypePolicy() {}
    private static android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission[] getAllowedHealthPermissions() { return null; }
    public static android.app.ForegroundServiceTypePolicy getDefaultPolicy() { return null; }
    private static boolean isFgsTypeFgPermissionEnforcementEnabled() { return false; }
    public abstract int checkForegroundServiceTypePolicy(android.content.Context p0, java.lang.String p1, int p2, int p3, boolean p4, android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo p5);
    public abstract android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo getForegroundServiceTypePolicyInfo(int p0, int p1);
    public abstract void updatePermissionEnforcementFlagIfNecessary(java.lang.String p0);

    static class AppOpPermission extends android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission {
        final int mOpCode = 0;
        AppOpPermission(int p0) { super(null); }
        public int checkPermission(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4) { return 0; }
    }

    public static class DefaultForegroundServiceTypePolicy extends android.app.ForegroundServiceTypePolicy {
        private final android.util.SparseArray<android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo> mForegroundServiceTypePolicies = null;
        private final android.util.ArrayMap<java.lang.String, android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo> mPermissionEnforcementToPolicyInfoMap = null;
        public DefaultForegroundServiceTypePolicy() { super(); }
        public int checkForegroundServiceTypePolicy(android.content.Context p0, java.lang.String p1, int p2, int p3, boolean p4, android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo p5) { return 0; }
        public android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo getForegroundServiceTypePolicyInfo(int p0, int p1) { return null; }
        public void updatePermissionEnforcementFlagIfNecessary(java.lang.String p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ForegroundServicePolicyCheckCode {
    }

    public static abstract class ForegroundServiceTypePermission {
        protected final java.lang.String mName = null;
        public ForegroundServiceTypePermission(java.lang.String p0) {}
        void addToList(android.content.Context p0, java.util.ArrayList<java.lang.String> p1) {}
        public abstract int checkPermission(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4);
        public java.lang.String toString() { return null; }
    }

    public static class ForegroundServiceTypePermissions {
        final boolean mAllOf = false;
        final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission[] mPermissions = null;
        public ForegroundServiceTypePermissions(android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission[] p0, boolean p1) {}
        public int checkPermissions(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4) { return 0; }
        public java.lang.String toString() { return null; }
        java.lang.String[] toStringArray(android.content.Context p0) { return null; }
    }

    public static final class ForegroundServiceTypePolicyInfo {
        private static final long INVALID_CHANGE_ID = 0L;
        final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermissions mAllOfPermissions = null;
        final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermissions mAnyOfPermissions = null;
        android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission mCustomPermission;
        final long mDeprecationChangeId = 0L;
        final long mDisabledChangeId = 0L;
        final boolean mForegroundOnlyPermission = false;
        final java.lang.String mPermissionEnforcementFlag = null;
        final boolean mPermissionEnforcementFlagDefaultValue = false;
        volatile boolean mPermissionEnforcementFlagValue;
        final int mType = 0;
        public ForegroundServiceTypePolicyInfo(int p0, long p1, long p2, android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermissions p3, android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermissions p4, java.lang.String p5, boolean p6, boolean p7) {}
        private void clearOverrideForTest(long p0, java.lang.String p1) throws android.os.RemoteException {}
        private static boolean isValidChangeId(long p0) { return false; }
        private void overrideChangeIdForTest(long p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
        private java.lang.StringBuilder toPermissionString(java.lang.StringBuilder p0) { return null; }
        private void updatePermissionEnforcementFlagIfNecessary(java.lang.String p0) {}
        public void clearTypeDisabledForTest(java.lang.String p0) throws android.os.RemoteException {}
        public int getForegroundServiceType() { return 0; }
        public java.lang.String getPermissionEnforcementFlagForTest() { return null; }
        public java.util.Optional<java.lang.String[]> getRequiredAllOfPermissionsForTest(android.content.Context p0) { return null; }
        public java.util.Optional<java.lang.String[]> getRequiredAnyOfPermissionsForTest(android.content.Context p0) { return null; }
        public boolean hasForegroundOnlyPermission() { return false; }
        boolean isTypeDeprecated(int p0) { return false; }
        public boolean isTypeDisabled(int p0) { return false; }
        public void setCustomPermission(android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission p0) {}
        public void setTypeDisabledForTest(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.lang.String toPermissionString() { return null; }
        public java.lang.String toString() { return null; }
    }

    static class RegularPermission extends android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission {
        RegularPermission(java.lang.String p0) { super(null); }
        public int checkPermission(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4) { return 0; }
        int checkPermission(android.content.Context p0, java.lang.String p1, int p2, int p3, java.lang.String p4, boolean p5, int p6) { return 0; }
    }

    static class RolePermission extends android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission {
        final java.lang.String mRole = null;
        RolePermission(java.lang.String p0) { super(null); }
        public int checkPermission(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4) { return 0; }
    }

    static class SystemDialerPermission extends android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission {
        SystemDialerPermission() { super(null); }
        public int checkPermission(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4) { return 0; }
    }

    static class UsbAccessoryPermission extends android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission {
        UsbAccessoryPermission() { super(null); }
        public int checkPermission(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4) { return 0; }
    }

    static class UsbDevicePermission extends android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission {
        UsbDevicePermission() { super(null); }
        public int checkPermission(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4) { return 0; }
    }
}
