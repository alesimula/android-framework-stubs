package com.android.internal.policy;

public class DesktopModeCompatPolicy {
    private final java.util.List<java.lang.String> mConfigExemptPackages = null;
    private final java.util.List<java.lang.String> mConfigHomeFreeformActivities = null;
    private final java.util.List<java.lang.String> mConfigLaunchInFullscreenPackages = null;
    private final java.util.List<java.lang.String> mConfigTransparentExemptionIgnoreList = null;
    private final android.content.Context mContext = null;
    public java.util.function.Supplier<java.lang.String> mDefaultHomePackageSupplier;
    private final java.util.Map<java.lang.String, java.lang.Boolean> mPackageInfoCache = null;
    private android.content.pm.PackageManager mPackageManager;
    private final java.lang.String mSystemUiPackage = null;
    public DesktopModeCompatPolicy(android.content.Context p0) {}
    private android.content.pm.PackageManager getPackageManager() { return null; }
    private boolean hasFullscreenTransparentPermission(java.lang.String p0, int p1, android.content.pm.ActivityInfo p2) { return false; }
    private boolean hasPlatformSignature(android.content.pm.ActivityInfo p0) { return false; }
    private boolean isPackageExemptViaConfig(java.lang.String p0) { return false; }
    private boolean isPrivilegedApp(android.content.pm.ActivityInfo p0) { return false; }
    private boolean isSystemUiTask(java.lang.String p0) { return false; }
    private boolean isTransparentTask(boolean p0, int p1) { return false; }
    public java.lang.String getDefaultHomePackage(int p0) { return null; }
    public boolean isPackageLaunchInFullscreen(android.content.pm.ActivityInfo p0) { return false; }
    public boolean isPartOfDefaultHomePackageOrNoHomeAvailable(java.lang.String p0, int p1, java.lang.String p2) { return false; }
    public boolean isTopActivityExemptFromDesktopWindowing(android.app.TaskInfo p0) { return false; }
    public boolean isTopActivityExemptFromDesktopWindowing(com.android.internal.policy.WindowingExemptionsInfo p0) { return false; }
    public boolean isTransparentOverlay(android.app.TaskInfo p0) { return false; }
    public boolean isTransparentOverlay(boolean p0, int p1, int p2) { return false; }
    public boolean isTransparentTask(android.app.TaskInfo p0) { return false; }
    public void setDefaultHomePackageSupplier(java.util.function.Supplier<java.lang.String> p0) {}
    public boolean shouldDisableDesktopEntryPoints(android.app.TaskInfo p0) { return false; }
    public boolean shouldDisableDesktopEntryPoints(com.android.internal.policy.WindowingExemptionsInfo p0) { return false; }
    public boolean shouldExcludeCaptionFromAppBounds(android.app.TaskInfo p0) { return false; }
}
