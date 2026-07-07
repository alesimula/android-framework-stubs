package com.android.server.usage;

public interface AppStandbyInternal {
    public static com.android.server.usage.AppStandbyInternal newAppStandbyController(java.lang.ClassLoader p0, android.content.Context p1) { return null; }
    public void addActiveDeviceAdmin(java.lang.String p0, int p1);
    public void addListener(com.android.server.usage.AppStandbyInternal.AppIdleStateChangeListener p0);
    public void clearCarrierPrivilegedApps();
    public void clearLastUsedTimestampsForTest(java.lang.String p0, int p1);
    public void dumpState(java.lang.String[] p0, java.io.PrintWriter p1);
    public void dumpUsers(android.util.IndentingPrintWriter p0, int[] p1, java.util.List<java.lang.String> p2);
    public void flushToDisk();
    public int getAppId(java.lang.String p0);
    public int getAppMinStandbyBucket(java.lang.String p0, int p1, int p2, boolean p3);
    public int getAppStandbyBucket(java.lang.String p0, int p1, long p2, boolean p3);
    public long getAppStandbyBucketAndReason(java.lang.String p0, int p1, long p2);
    public int getAppStandbyBucketReason(java.lang.String p0, int p1, long p2);
    public java.util.List<android.app.usage.AppStandbyInfo> getAppStandbyBuckets(int p0);
    public java.lang.String getAppStandbyConstant(java.lang.String p0);
    public java.util.List<java.lang.String> getBroadcastResponseExemptedPermissions();
    public java.util.List<java.lang.String> getBroadcastResponseExemptedRoles();
    public int getBroadcastResponseFgThresholdState();
    public long getBroadcastResponseWindowDurationMs();
    public long getBroadcastSessionsDurationMs();
    public long getBroadcastSessionsWithResponseDurationMs();
    public long getEstimatedLaunchTime(java.lang.String p0, int p1);
    public int[] getIdleUidsForUser(int p0);
    public long getTimeSinceLastJobRun(java.lang.String p0, int p1);
    public long getTimeSinceLastUsedByUser(java.lang.String p0, int p1);
    public void initializeDefaultsForSystemApps(int p0);
    public boolean isActiveDeviceAdmin(java.lang.String p0, int p1);
    public boolean isAppIdleEnabled();
    public boolean isAppIdleFiltered(java.lang.String p0, int p1, int p2, long p3);
    public boolean isAppIdleFiltered(java.lang.String p0, int p1, long p2, boolean p3);
    public boolean isInParole();
    public void maybeUnrestrictApp(java.lang.String p0, int p1, int p2, int p3, int p4, int p5);
    public void onAdminDataAvailable();
    public void onBootPhase(int p0);
    public void onUserRemoved(int p0);
    public void postCheckIdleStates(int p0);
    public void postOneTimeCheckIdleStates();
    public void postReportContentProviderUsage(java.lang.String p0, java.lang.String p1, int p2);
    public void postReportExemptedSyncStart(java.lang.String p0, int p1);
    public void postReportSyncScheduled(java.lang.String p0, int p1, boolean p2);
    public void removeListener(com.android.server.usage.AppStandbyInternal.AppIdleStateChangeListener p0);
    public void restoreAppsToRare(java.util.Set<java.lang.String> p0, int p1);
    public void restrictApp(java.lang.String p0, int p1, int p2);
    public void restrictApp(java.lang.String p0, int p1, int p2, int p3);
    public void setActiveAdminApps(java.util.Set<java.lang.String> p0, int p1);
    public void setAdminProtectedPackages(java.util.Set<java.lang.String> p0, int p1);
    public void setAppIdleAsync(java.lang.String p0, boolean p1, int p2);
    public void setAppStandbyBucket(java.lang.String p0, int p1, int p2, int p3, int p4);
    public void setAppStandbyBuckets(java.util.List<android.app.usage.AppStandbyInfo> p0, int p1, int p2, int p3);
    public void setEstimatedLaunchTime(java.lang.String p0, int p1, long p2);
    public void setLastJobRunTime(java.lang.String p0, int p1, long p2);
    public boolean shouldNoteResponseEventForAllBroadcastSessions();

    public static abstract class AppIdleStateChangeListener {
        public AppIdleStateChangeListener() {}
        public abstract void onAppIdleStateChanged(java.lang.String p0, int p1, boolean p2, int p3, int p4);
        public void onParoleStateChanged(boolean p0) {}
        public void onUserInteractionStarted(java.lang.String p0, int p1) {}
    }
}
