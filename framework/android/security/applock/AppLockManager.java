package android.security.applock;

public final class AppLockManager {
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final java.lang.String TAG = "AppLockManager";
    private final android.util.ArrayMap<android.security.applock.AppLockManager.PackageLockedStateListener, android.security.applock.IPackageLockedStateListener> mListeners = null;
    private final android.security.applock.IAppLockManager mService = null;
    public AppLockManager(android.security.applock.IAppLockManager p0) {}
    public java.util.Set<java.lang.String> getPackagesWithVisibleAppLockOverlay(int p0) { return null; }
    public boolean isAppLockSupportedForDevice() { return false; }
    public boolean isAppLockSupportedForUser(int p0) { return false; }
    public boolean isPackageLocked(java.lang.String p0, int p1) { return false; }
    public void registerPackageLockedStateListener(java.util.concurrent.Executor p0, android.security.applock.AppLockManager.PackageLockedStateListener p1) {}
    public void setAppLockEnabledPackageSuccessfullyAuthenticated(java.lang.String p0, int p1) {}
    public void unregisterPackageLockedStateListener(android.security.applock.AppLockManager.PackageLockedStateListener p0) {}

    public static interface PackageLockedStateListener {
        public void onPackageLockedStateChanged(java.lang.String p0, int p1, boolean p2);
    }
}
