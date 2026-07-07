package android.os;

@android.annotation.SystemApi
public class SystemConfigManager {
    private static final java.lang.String TAG = null;
    private final android.os.ISystemConfig mInterface = null;
    public SystemConfigManager() {}
    public java.util.List<android.content.ComponentName> getDefaultVrComponents() { return null; }
    public java.util.Set<java.lang.String> getDisabledUntilUsedPreinstalledCarrierApps() { return null; }
    public java.util.Map<java.lang.String, java.util.List<android.os.CarrierAssociatedAppEntry>> getDisabledUntilUsedPreinstalledCarrierAssociatedAppEntries() { return null; }
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getDisabledUntilUsedPreinstalledCarrierAssociatedApps() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public java.util.List<android.content.ComponentName> getEnabledComponentOverrides(java.lang.String p0) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public java.util.Set<android.content.pm.SignedPackage> getEnhancedConfirmationTrustedInstallers() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public java.util.Set<android.content.pm.SignedPackage> getEnhancedConfirmationTrustedPackages() { return null; }
    public java.util.List<java.lang.String> getPreventUserDisablePackages() { return null; }
    public int[] getSystemPermissionUids(java.lang.String p0) { return null; }
}
