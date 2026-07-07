package android.net;

@android.annotation.RestrictedForEnvironment(environments="SDK Runtime", from=34)
public class VpnManager {
    public static final java.lang.String ACTION_VPN_MANAGER_EVENT = "android.net.action.VPN_MANAGER_EVENT";
    public static final java.lang.String CATEGORY_EVENT_ALWAYS_ON_STATE_CHANGED = "android.net.category.EVENT_ALWAYS_ON_STATE_CHANGED";
    public static final java.lang.String CATEGORY_EVENT_DEACTIVATED_BY_USER = "android.net.category.EVENT_DEACTIVATED_BY_USER";
    public static final java.lang.String CATEGORY_EVENT_IKE_ERROR = "android.net.category.EVENT_IKE_ERROR";
    public static final java.lang.String CATEGORY_EVENT_NETWORK_ERROR = "android.net.category.EVENT_NETWORK_ERROR";
    public static final int ERROR_CLASS_NOT_RECOVERABLE = 1;
    public static final int ERROR_CLASS_RECOVERABLE = 2;
    public static final int ERROR_CODE_NETWORK_IO = 3;
    public static final int ERROR_CODE_NETWORK_LOST = 2;
    public static final int ERROR_CODE_NETWORK_PROTOCOL_TIMEOUT = 1;
    public static final int ERROR_CODE_NETWORK_UNKNOWN_HOST = 0;
    public static final java.lang.String EXTRA_ERROR_CLASS = "android.net.extra.ERROR_CLASS";
    public static final java.lang.String EXTRA_ERROR_CODE = "android.net.extra.ERROR_CODE";
    public static final java.lang.String EXTRA_SESSION_KEY = "android.net.extra.SESSION_KEY";
    public static final java.lang.String EXTRA_TIMESTAMP_MILLIS = "android.net.extra.TIMESTAMP_MILLIS";
    public static final java.lang.String EXTRA_UNDERLYING_LINK_PROPERTIES = "android.net.extra.UNDERLYING_LINK_PROPERTIES";
    public static final java.lang.String EXTRA_UNDERLYING_NETWORK = "android.net.extra.UNDERLYING_NETWORK";
    public static final java.lang.String EXTRA_UNDERLYING_NETWORK_CAPABILITIES = "android.net.extra.UNDERLYING_NETWORK_CAPABILITIES";
    public static final java.lang.String EXTRA_VPN_PROFILE_STATE = "android.net.extra.VPN_PROFILE_STATE";
    public static final java.lang.String NOTIFICATION_CHANNEL_VPN = "VPN";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int TYPE_VPN_LEGACY = 3;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int TYPE_VPN_NONE = -1;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int TYPE_VPN_OEM = 4;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int TYPE_VPN_OEM_LEGACY = 6;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int TYPE_VPN_OEM_SERVICE = 5;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int TYPE_VPN_PLATFORM = 2;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int TYPE_VPN_SERVICE = 1;
    private final android.content.Context mContext = null;
    private final android.net.IVpnManager mService = null;
    public VpnManager(android.content.Context p0, android.net.IVpnManager p1) {}
    private static android.content.Intent getIntentForConfirmation() { return null; }
    public void deleteProvisionedVpnProfile() {}
    public void factoryReset() {}
    public java.lang.String getAlwaysOnVpnPackageForUser(int p0) { return null; }
    public java.util.List<java.lang.String> getAppExclusionList(int p0, java.lang.String p1) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public java.util.List<java.lang.String> getAppExclusionList(android.os.UserHandle p0, java.lang.String p1) { return null; }
    public byte[] getFromVpnProfileStore(java.lang.String p0) { return null; }
    public com.android.internal.net.LegacyVpnInfo getLegacyVpnInfo(int p0) { return null; }
    public android.net.VpnProfileState getProvisionedVpnProfileState() { return null; }
    public com.android.internal.net.VpnConfig getVpnConfig(int p0) { return null; }
    public java.util.List<java.lang.String> getVpnLockdownAllowlist(int p0) { return null; }
    public boolean isAlwaysOnVpnPackageSupportedForUser(int p0, java.lang.String p1) { return false; }
    public boolean isVpnLockdownEnabled(int p0) { return false; }
    public java.lang.String[] listFromVpnProfileStore(java.lang.String p0) { return null; }
    public boolean prepareVpn(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    public android.content.Intent provisionVpnProfile(android.net.PlatformVpnProfile p0) { return null; }
    public boolean putIntoVpnProfileStore(java.lang.String p0, byte[] p1) { return false; }
    public boolean removeFromVpnProfileStore(java.lang.String p0) { return false; }
    public boolean setAlwaysOnVpnPackageForUser(int p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) { return false; }
    public boolean setAppExclusionList(int p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public boolean setAppExclusionList(android.os.UserHandle p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return false; }
    public void setVpnPackageAuthorization(java.lang.String p0, int p1, int p2) {}
    public void startLegacyVpn(com.android.internal.net.VpnProfile p0) {}
    @java.lang.Deprecated
    public void startProvisionedVpnProfile() {}
    public java.lang.String startProvisionedVpnProfileSession() { return null; }
    public void stopProvisionedVpnProfile() {}
    public boolean updateLockdownVpn() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VpnType {
    }
}
