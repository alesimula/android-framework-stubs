package android.content.pm.pkg;

@java.lang.Deprecated
class FrameworkPackageUserStateDefault implements android.content.pm.pkg.FrameworkPackageUserState {
    FrameworkPackageUserStateDefault() {}
    public android.content.pm.overlay.OverlayPaths getAllOverlayPaths() { return null; }
    public long getCeDataInode() { return 0L; }
    public java.util.Set<java.lang.String> getDisabledComponents() { return null; }
    public int getDistractionFlags() { return 0; }
    public java.util.Set<java.lang.String> getEnabledComponents() { return null; }
    public int getEnabledState() { return 0; }
    public java.lang.String getHarmfulAppWarning() { return null; }
    public int getInstallReason() { return 0; }
    public java.lang.String getLastDisableAppCaller() { return null; }
    public android.content.pm.overlay.OverlayPaths getOverlayPaths() { return null; }
    public java.util.Map<java.lang.String, android.content.pm.overlay.OverlayPaths> getSharedLibraryOverlayPaths() { return null; }
    public java.lang.String getSplashScreenTheme() { return null; }
    public int getUninstallReason() { return 0; }
    public boolean isComponentDisabled(java.lang.String p0) { return false; }
    public boolean isComponentEnabled(java.lang.String p0) { return false; }
    public boolean isHidden() { return false; }
    public boolean isInstalled() { return false; }
    public boolean isInstantApp() { return false; }
    public boolean isNotLaunched() { return false; }
    public boolean isStopped() { return false; }
    public boolean isSuspended() { return false; }
    public boolean isVirtualPreload() { return false; }
}
