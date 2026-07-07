package com.android.net.module.util;

public class LocationPermissionChecker {
    public static final int ERROR_LOCATION_MODE_OFF = 1;
    public static final int ERROR_LOCATION_PERMISSION_MISSING = 2;
    public static final int SUCCEEDED = 0;
    private static final java.lang.String TAG = "LocationPermissionChecker";
    private final android.app.AppOpsManager mAppOpsManager = null;
    private final android.content.Context mContext = null;
    public LocationPermissionChecker(android.content.Context p0) {}
    private boolean checkMainlineNetworkStackPermission(int p0) { return false; }
    private boolean checkNetworkSettingsPermission(int p0) { return false; }
    private boolean checkNetworkSetupWizardPermission(int p0) { return false; }
    private boolean checkNetworkStackPermission(int p0) { return false; }
    private void checkPackage(int p0, java.lang.String p1) throws java.lang.SecurityException {}
    private int getUidPermission(java.lang.String p0, int p1) { return 0; }
    private boolean isLocationModeEnabled() { return false; }
    private boolean isTargetSdkLessThan(java.lang.String p0, int p1, int p2) { return false; }
    private boolean noteAppOpAllowed(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) { return false; }
    public boolean checkCallersLocationPermission(java.lang.String p0, java.lang.String p1, int p2, boolean p3, java.lang.String p4) { return false; }
    public boolean checkLocationPermission(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) { return false; }
    public int checkLocationPermissionInternal(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) { return 0; }
    protected int getCurrentUser() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LocationPermissionCheckStatus {
    }
}
