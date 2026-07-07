package android.permission;

public class PermissionUsageHelper implements android.app.AppOpsManager.OnOpActiveChangedListener, android.app.AppOpsManager.OnOpStartedListener {
    private static final long ADDITIONAL_RECENT_TIME_LOCATION_ONLY_MS = 5000L;
    private static final long ADDITIONAL_RUNNING_TIME_LOCATION_ONLY_MS = 5000L;
    private static final java.util.List<java.lang.String> CAMERA_OPS = null;
    private static final long DEFAULT_RECENT_TIME_MS = 15000L;
    private static final long DEFAULT_RUNNING_TIME_MS = 5000L;
    private static final java.util.List<java.lang.String> LOCATION_OPS = null;
    private static final java.lang.String LOG_TAG = null;
    private static final java.util.List<java.lang.String> MIC_OPS = null;
    private static final java.lang.String PROPERTY_CAMERA_MIC_ICONS_ENABLED = "camera_mic_icons_enabled";
    private static final java.lang.String RECENT_ACCESS_TIME_MS = "recent_access_time_ms";
    private static final java.lang.String RUNNING_ACCESS_TIME_MS = "running_access_time_ms";
    private static final java.lang.String SYSTEM_PKG = "android";
    private android.app.ActivityManager mActivityManager;
    private android.app.AppOpsManager mAppOpsManager;
    private final android.util.ArrayMap<java.lang.Integer, java.util.ArrayList<android.permission.PermissionUsageHelper.AccessChainLink>> mAttributionChains = null;
    private android.content.Context mContext;
    private android.content.pm.PackageManager mPkgManager;
    private android.util.ArrayMap<android.os.UserHandle, android.content.Context> mUserContexts;
    private android.companion.virtual.VirtualDeviceManager mVirtualDeviceManager;
    public PermissionUsageHelper(android.content.Context p0) {}
    private void addLinkToChainIfNotPresentLocked(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, int p4, int p5) {}
    private java.lang.CharSequence formatLabelList(java.util.List<java.lang.CharSequence> p0) { return null; }
    private static java.lang.String getGroupForOp(java.lang.String p0) { return null; }
    private java.util.Map<java.lang.String, java.util.List<android.permission.PermissionUsageHelper.OpUsage>> getOpUsagesByDevice(java.util.List<java.lang.String> p0, java.lang.String p1) { return null; }
    private static long getRecentThreshold(java.lang.Long p0) { return 0L; }
    private static long getRunningThreshold(java.lang.Long p0) { return 0L; }
    private android.util.ArrayMap<java.lang.String, java.lang.String> getSubattributionLabelsForPackage(java.lang.String p0, int p1) { return null; }
    private android.util.ArrayMap<android.permission.PermissionUsageHelper.OpUsage, java.lang.CharSequence> getUniqueUsagesWithLabels(java.lang.String p0, java.util.List<android.permission.PermissionUsageHelper.OpUsage> p1) { return null; }
    private android.content.Context getUserContext(android.os.UserHandle p0) { return null; }
    private boolean isBackgroundApp(int p0) { return false; }
    private boolean isLocationProvider(java.lang.String p0) { return false; }
    private boolean isSubattributionSupported(java.lang.String p0, int p1) { return false; }
    private boolean isSystemApp(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, int p3) { return false; }
    private static boolean shouldShowIndicators() { return false; }
    private boolean shouldShowPackage(java.lang.String p0) { return false; }
    private void updateSubattributionLabelsMap(java.util.List<android.permission.PermissionUsageHelper.OpUsage> p0, android.util.ArrayMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> p1) {}
    public java.util.List<android.permission.PermissionGroupUsage> getOpUsageDataForAllDevices(boolean p0) { return null; }
    public java.util.List<android.permission.PermissionGroupUsage> getOpUsageDataForIndicatorsByDevice(boolean p0, java.lang.String p1) { return null; }
    public void onOpActiveChanged(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, int p5, int p6) {}
    public void onOpActiveChanged(java.lang.String p0, int p1, java.lang.String p2, boolean p3) {}
    public void onOpStarted(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5) {}
    public void onOpStarted(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6, int p7, int p8) {}
    public void tearDown() {}

    private static class AccessChainLink {
        public final int flags = 0;
        public final android.permission.PermissionUsageHelper.OpUsage usage = null;
        AccessChainLink(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public boolean isEnd() { return false; }
        public boolean isStart() { return false; }
        public boolean packageAndOpEquals(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) { return false; }
    }

    private static class OpUsage {
        public final java.lang.String attributionTag = null;
        public final boolean isRunning = false;
        public final long lastAccessTime = 0L;
        public final java.lang.String op = null;
        public final java.lang.String packageName = null;
        public final android.permission.PermissionUsageHelper.OpUsage proxy = null;
        public final int uid = 0;
        OpUsage(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, long p4, boolean p5, android.permission.PermissionUsageHelper.OpUsage p6) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int getPackageIdHash() { return 0; }
        public android.os.UserHandle getUser() { return null; }
        public int hashCode() { return 0; }
    }
}
