package com.android.internal.content;

public abstract class PackageMonitor extends android.content.BroadcastReceiver {
    public static final int PACKAGE_PERMANENT_CHANGE = 3;
    public static final int PACKAGE_TEMPORARY_CHANGE = 2;
    public static final int PACKAGE_UNCHANGED = 0;
    public static final int PACKAGE_UPDATING = 1;
    static final java.lang.String TAG = "PackageMonitor";
    java.lang.String[] mAppearingPackages;
    int mChangeType;
    int mChangeUserId;
    java.lang.String[] mDisappearingPackages;
    private java.util.concurrent.Executor mExecutor;
    java.lang.String[] mModifiedComponents;
    java.lang.String[] mModifiedPackages;
    com.android.internal.content.PackageMonitor.PackageMonitorCallback mPackageMonitorCallback;
    android.content.Context mRegisteredContext;
    android.os.Handler mRegisteredHandler;
    boolean mSomePackagesChanged;
    final boolean mSupportsPackageRestartQuery = false;
    java.lang.String[] mTempArray;
    public PackageMonitor() { super(); }
    public PackageMonitor(boolean p0) { super(); }
    private android.content.IntentFilter getPackageFilter() { return null; }
    private void postHandlePackageEvent(android.content.Intent p0) {}
    public boolean anyPackagesAppearing() { return false; }
    public boolean anyPackagesDisappearing() { return false; }
    public boolean didSomePackagesChange() { return false; }
    public final void doHandlePackageEvent(android.content.Intent p0) {}
    public int getChangingUserId() { return 0; }
    java.lang.String getPackageName(android.content.Intent p0) { return null; }
    public android.os.Handler getRegisteredHandler() { return null; }
    public boolean isComponentModified(java.lang.String p0) { return false; }
    public int isPackageAppearing(java.lang.String p0) { return 0; }
    public int isPackageDisappearing(java.lang.String p0) { return 0; }
    public boolean isPackageModified(java.lang.String p0) { return false; }
    public boolean isReplacing() { return false; }
    public void onBeginPackageChanges() {}
    public void onFinishPackageChanges() {}
    public boolean onHandleForceStop(android.content.Intent p0, java.lang.String[] p1, int p2, boolean p3) { return false; }
    public boolean onHandleForceStop(android.content.Intent p0, java.lang.String[] p1, int p2, boolean p3, android.os.Bundle p4) { return false; }
    public void onPackageAdded(java.lang.String p0, int p1) {}
    public void onPackageAddedWithExtras(java.lang.String p0, int p1, android.os.Bundle p2) {}
    public void onPackageAppLockDisabled(java.lang.String p0) {}
    public void onPackageAppLockEnabled(java.lang.String p0) {}
    public void onPackageAppeared(java.lang.String p0, int p1) {}
    public void onPackageAppearedWithExtras(java.lang.String p0, android.os.Bundle p1) {}
    public boolean onPackageChanged(java.lang.String p0, int p1, java.lang.String[] p2) { return false; }
    public void onPackageChangedWithExtras(java.lang.String p0, android.os.Bundle p1) {}
    public void onPackageDataCleared(java.lang.String p0, int p1) {}
    public void onPackageDisappeared(java.lang.String p0, int p1) {}
    public void onPackageDisappearedWithExtras(java.lang.String p0, android.os.Bundle p1) {}
    public void onPackageModified(java.lang.String p0) {}
    public void onPackageModifiedWithExtras(java.lang.String p0, android.os.Bundle p1) {}
    public void onPackageRemoved(java.lang.String p0, int p1) {}
    public void onPackageRemovedAllUsers(java.lang.String p0, int p1) {}
    public void onPackageRemovedAllUsersWithExtras(java.lang.String p0, int p1, android.os.Bundle p2) {}
    public void onPackageRemovedWithExtras(java.lang.String p0, int p1, android.os.Bundle p2) {}
    public void onPackageStateChanged(java.lang.String p0, int p1) {}
    public void onPackageUnstopped(java.lang.String p0, int p1, android.os.Bundle p2) {}
    public void onPackageUpdateFinished(java.lang.String p0, int p1) {}
    public void onPackageUpdateFinishedWithExtras(java.lang.String p0, int p1, android.os.Bundle p2) {}
    public void onPackageUpdateStarted(java.lang.String p0, int p1) {}
    public void onPackageUpdateStartedWithExtras(java.lang.String p0, int p1, android.os.Bundle p2) {}
    public void onPackagesAvailable(java.lang.String[] p0) {}
    public void onPackagesSuspended(java.lang.String[] p0) {}
    public void onPackagesUnavailable(java.lang.String[] p0) {}
    public void onPackagesUnsuspended(java.lang.String[] p0) {}
    public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    public void onSomePackagesChanged() {}
    public void onUidRemoved(int p0) {}
    public void register(android.content.Context p0, android.os.Looper p1, android.os.UserHandle p2, boolean p3) {}
    public void register(android.content.Context p0, android.os.Looper p1, boolean p2) {}
    public void register(android.content.Context p0, android.os.UserHandle p1, android.os.Handler p2) {}
    public void unregister() {}

    private static final class PackageMonitorCallback extends android.os.IRemoteCallback.Stub {
        private final java.lang.ref.WeakReference<com.android.internal.content.PackageMonitor> mMonitorWeakReference = null;
        PackageMonitorCallback(com.android.internal.content.PackageMonitor p0) { super(); }
        private void onHandlePackageMonitorCallback(android.os.Bundle p0) {}
        public void sendResult(android.os.Bundle p0) throws android.os.RemoteException {}
    }
}
