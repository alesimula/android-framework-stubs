package android.app;

public interface AppLockInternal {
    public android.util.SparseArray<java.util.Set<java.lang.String>> getAppLockEnabledPackages();
    public boolean isPackageAppLockEnabled(java.lang.String p0, int p1);
    public boolean isPackageLocked(java.lang.String p0, int p1);
    public void registerPackageLockedStateListener(android.app.AppLockInternal.PackageLockedStateListener p0);
    public void setAppLockEnabledPackageSuccessfullyAuthenticated(java.lang.String p0, int p1);
    public void unregisterPackageLockedStateListener(android.app.AppLockInternal.PackageLockedStateListener p0);

    public static interface PackageLockedStateListener {
        public void onPackageLockedStateChanged(java.lang.String p0, int p1, boolean p2);
    }
}
