package android.app;

public final class LoadedApk {
    static final boolean $assertionsDisabled = false;
    static final boolean DEBUG = false;
    private static final boolean DEBUG_STORE_ENABLED = Boolean.valueOf(false);
    static final java.lang.String TAG = "LoadedApk";
    private static final android.util.ArrayMap<java.lang.String, android.app.Application> sApplications = null;
    private final android.app.ActivityThread mActivityThread = null;
    private android.app.AppComponentFactory mAppComponentFactory;
    private java.lang.String mAppDir;
    private android.app.Application mApplication;
    private android.content.pm.ApplicationInfo mApplicationInfo;
    private final java.lang.ClassLoader mBaseClassLoader = null;
    private java.lang.ClassLoader mClassLoader;
    private java.io.File mCredentialProtectedDataDirFile;
    private java.lang.String mDataDir;
    private java.io.File mDataDirFile;
    private java.lang.ClassLoader mDefaultClassLoader;
    private java.io.File mDeviceProtectedDataDirFile;
    private final android.view.DisplayAdjustments mDisplayAdjustments = null;
    private final boolean mIncludeCode = false;
    private java.lang.String[] mLegacyOverlayDirs;
    private java.lang.String mLibDir;
    private final java.lang.Object mLock = null;
    private java.lang.String[] mOverlayPaths;
    final java.lang.String mPackageName = null;
    private final android.util.ArrayMap<android.content.Context, android.util.ArrayMap<android.content.BroadcastReceiver, android.app.LoadedApk.ReceiverDispatcher>> mReceivers = null;
    private final boolean mRegisterPackage = false;
    private java.lang.String mResDir;
    android.content.res.Resources mResources;
    private final boolean mSecurityViolation = false;
    private final android.util.ArrayMap<android.content.Context, android.util.ArrayMap<android.content.ServiceConnection, android.app.LoadedApk.ServiceDispatcher>> mServices = null;
    private java.lang.String[] mSplitAppDirs;
    private java.lang.String[] mSplitClassLoaderNames;
    private android.app.LoadedApk.SplitDependencyLoaderImpl mSplitLoader;
    private java.lang.String[] mSplitNames;
    private java.lang.String[] mSplitResDirs;
    private final android.util.ArrayMap<android.content.Context, android.util.ArrayMap<android.content.ServiceConnection, android.app.LoadedApk.ServiceDispatcher>> mUnboundServices = null;
    private final android.util.ArrayMap<android.content.Context, android.util.ArrayMap<android.content.BroadcastReceiver, android.app.LoadedApk.ReceiverDispatcher>> mUnregisteredReceivers = null;
    LoadedApk(android.app.ActivityThread p0) {}
    public LoadedApk(android.app.ActivityThread p0, android.content.pm.ApplicationInfo p1, android.content.res.CompatibilityInfo p2, java.lang.ClassLoader p3, boolean p4, boolean p5, boolean p6) {}
    private static android.content.pm.ApplicationInfo adjustNativeLibraryPaths(android.content.pm.ApplicationInfo p0) { return null; }
    private static android.content.pm.ApplicationInfo adjustNativeLibraryPaths$ravenwood(android.content.pm.ApplicationInfo p0) { return null; }
    private android.os.StrictMode.ThreadPolicy allowThreadDiskReads() { return null; }
    private android.os.StrictMode.VmPolicy allowVmViolations() { return null; }
    private static void appendApkLibPathIfNeeded(java.lang.String p0, android.content.pm.ApplicationInfo p1, java.util.List<java.lang.String> p2) {}
    private static void appendSharedLibrariesLibPathsIfNeeded(java.util.List<android.content.pm.SharedLibraryInfo> p0, android.content.pm.ApplicationInfo p1, java.util.Set<java.lang.String> p2, java.util.List<java.lang.String> p3) {}
    private static void callNetworkSecurityConfigProviderHandleNewApplication(android.content.Context p0) {}
    private boolean canAccessDataDir() { return false; }
    private static void checkAndUpdateApkPaths(android.app.ActivityThread p0, android.content.pm.ApplicationInfo p1, boolean p2) {}
    public static void checkAndUpdateApkPaths(android.content.pm.ApplicationInfo p0) {}
    private android.app.AppComponentFactory createAppFactory(android.content.pm.ApplicationInfo p0, java.lang.ClassLoader p1) { return null; }
    private android.app.AppComponentFactory createAppFactory$ravenwood(android.content.pm.ApplicationInfo p0, java.lang.ClassLoader p1) { return null; }
    private void createOrUpdateClassLoaderLocked(java.util.List<java.lang.String> p0) {}
    private android.util.Pair<java.util.List<java.lang.ClassLoader>, java.util.List<java.lang.ClassLoader>> createSharedLibrariesLoaders(java.util.List<android.content.pm.SharedLibraryInfo> p0, boolean p1, java.lang.String p2, java.lang.String p3) { return null; }
    private java.lang.ClassLoader getClassLoader$ravenwood() { return null; }
    private static java.lang.String[] getLibrariesFor(java.lang.String p0) { return null; }
    private android.content.res.Resources getResourcesInner() { return null; }
    private android.app.IServiceConnection getServiceDispatcherCommon(android.content.ServiceConnection p0, android.content.Context p1, android.os.Handler p2, java.util.concurrent.Executor p3, long p4) { return null; }
    private java.lang.ClassLoader getSplitClassLoader$ravenwood(java.lang.String p0) { return null; }
    private void initializeJavaContextClassLoader() {}
    private android.app.Application makeApplicationInner(boolean p0, android.app.Instrumentation p1, boolean p2) { return null; }
    public static void makePaths(android.app.ActivityThread p0, android.content.pm.ApplicationInfo p1, java.util.List<java.lang.String> p2) {}
    public static void makePaths(android.app.ActivityThread p0, boolean p1, android.content.pm.ApplicationInfo p2, java.util.List<java.lang.String> p3, java.util.List<java.lang.String> p4) {}
    private void onNewApplicationFailed(java.lang.Exception p0, android.app.Application p1, java.lang.String p2) {}
    private void onNewApplicationFailed$ravenwood(java.lang.Exception p0, android.app.Application p1, java.lang.String p2) {}
    private void registerAppInfoToArt() {}
    private void rewriteRValues(java.lang.ClassLoader p0, java.lang.String p1, int p2) {}
    private boolean setApplicationInfo(android.content.pm.ApplicationInfo p0) { return false; }
    private void setInternalDataDirFiles(java.io.File p0, java.io.File p1) {}
    private void setThreadPolicy(android.os.StrictMode.ThreadPolicy p0) {}
    private void setVmPolicy(android.os.StrictMode.VmPolicy p0) {}
    private void throwForNewApplicationFailure(java.lang.Exception p0, android.app.Application p1, java.lang.String p2) {}
    public android.app.LoadedApk.LinkerNamespaceParams createLinkerNamespaceParams() { return null; }
    java.lang.ClassLoader createSharedLibraryLoader(android.content.pm.SharedLibraryInfo p0, boolean p1, java.lang.String p2, java.lang.String p3) { return null; }
    android.content.IIntentReceiver findRegisteredReceiverDispatcher(android.content.BroadcastReceiver p0, android.content.Context p1) { return null; }
    public android.content.IIntentReceiver forgetReceiverDispatcher(android.content.Context p0, android.content.BroadcastReceiver p1) { return null; }
    public final android.app.IServiceConnection forgetServiceDispatcher(android.content.Context p0, android.content.ServiceConnection p1) { return null; }
    public java.lang.String getAppDir() { return null; }
    public android.app.AppComponentFactory getAppFactory() { return null; }
    android.app.Application getApplication() { return null; }
    public android.content.pm.ApplicationInfo getApplicationInfo() { return null; }
    public android.content.res.AssetManager getAssets() { return null; }
    public java.lang.ClassLoader getClassLoader() { return null; }
    public android.content.res.CompatibilityInfo getCompatibilityInfo() { return null; }
    public java.io.File getCredentialProtectedDataDirFile() { return null; }
    public java.lang.String getDataDir() { return null; }
    public java.io.File getDataDirFile() { return null; }
    public java.io.File getDeviceProtectedDataDirFile() { return null; }
    public java.lang.String getLibDir() { return null; }
    public java.lang.String[] getOverlayDirs() { return null; }
    public java.lang.String[] getOverlayPaths() { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.content.IIntentReceiver getReceiverDispatcher(android.content.BroadcastReceiver p0, android.content.Context p1, android.os.Handler p2, android.app.Instrumentation p3, boolean p4) { return null; }
    public java.lang.String getResDir() { return null; }
    public android.content.res.Resources getResources() { return null; }
    public final android.app.IServiceConnection getServiceDispatcher(android.content.ServiceConnection p0, android.content.Context p1, android.os.Handler p2, long p3) { return null; }
    public final android.app.IServiceConnection getServiceDispatcher(android.content.ServiceConnection p0, android.content.Context p1, java.util.concurrent.Executor p2, long p3) { return null; }
    public java.lang.String[] getSplitAppDirs() { return null; }
    java.lang.ClassLoader getSplitClassLoader(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    java.lang.String[] getSplitPaths(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public java.lang.String[] getSplitResDirs() { return null; }
    public int getTargetSdkVersion() { return 0; }
    void installSystemApplicationInfo(android.content.pm.ApplicationInfo p0, java.lang.ClassLoader p1) {}
    public boolean isSecurityViolation() { return false; }
    public android.app.IServiceConnection lookupServiceDispatcher(android.content.ServiceConnection p0, android.content.Context p1) { return null; }
    public android.app.Application makeApplication(boolean p0, android.app.Instrumentation p1) { return null; }
    public android.app.Application makeApplicationInner(boolean p0, android.app.Instrumentation p1) { return null; }
    public void removeContextRegistrations(android.content.Context p0, java.lang.String p1, java.lang.String p2) {}
    public void setCompatibilityInfo(android.content.res.CompatibilityInfo p0) {}
    void setPccStorageDirPaths() {}
    void setSdkSandboxStorage(java.lang.String p0, java.lang.String p1) {}
    public void updateApplicationInfo(android.content.pm.ApplicationInfo p0, java.util.List<java.lang.String> p1) {}

    public static final class LinkerNamespaceParams {
        public final boolean isShared = false;
        public final java.lang.String libPath = null;
        public final java.lang.String nativeSharedLibs = null;
        public final java.lang.String permittedLibsDir = null;
        public final int targetSdkVersion = 0;
        public final java.lang.String zipPath = null;
        LinkerNamespaceParams(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, java.lang.String p5) {}
    }

    static final class ReceiverDispatcher {
        final android.os.Handler mActivityThread = null;
        final android.app.IApplicationThread mAppThread = null;
        final android.content.Context mContext = null;
        boolean mForgotten;
        final android.content.IIntentReceiver.Stub mIIntentReceiver = null;
        final android.app.Instrumentation mInstrumentation = null;
        final android.app.IntentReceiverLeaked mLocation = null;
        final android.content.BroadcastReceiver mReceiver = null;
        final boolean mRegistered = false;
        java.lang.RuntimeException mUnregisterLocation;
        ReceiverDispatcher(android.app.IApplicationThread p0, android.content.BroadcastReceiver p1, android.content.Context p2, android.os.Handler p3, android.app.Instrumentation p4, boolean p5) {}
        android.content.IIntentReceiver getIIntentReceiver() { return null; }
        android.content.BroadcastReceiver getIntentReceiver() { return null; }
        android.app.IntentReceiverLeaked getLocation() { return null; }
        java.lang.RuntimeException getUnregisterLocation() { return null; }
        public void performReceive(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, boolean p6, int p7, int p8, java.lang.String p9) {}
        void setUnregisterLocation(java.lang.RuntimeException p0) {}
        void validate(android.content.Context p0, android.os.Handler p1) {}

        final class Args extends android.content.BroadcastReceiver.PendingResult {
            private android.content.Intent mCurIntent;
            private boolean mDispatched;
            private boolean mRunCalled;
            public Args(android.app.LoadedApk.ReceiverDispatcher p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4, boolean p5, boolean p6, boolean p7, int p8, int p9, java.lang.String p10) { super(0, (java.lang.String)null, (android.os.Bundle)null, 0, false, false, (android.os.IBinder)null, 0, 0); }
            public final java.lang.Runnable getRunnable() { return null; }
        }

        static final class InnerReceiver extends android.content.IIntentReceiver.Stub {
            final android.app.IApplicationThread mApplicationThread = null;
            final java.lang.ref.WeakReference<android.app.LoadedApk.ReceiverDispatcher> mDispatcher = null;
            final android.app.LoadedApk.ReceiverDispatcher mStrongRef = null;
            InnerReceiver(android.app.IApplicationThread p0, android.app.LoadedApk.ReceiverDispatcher p1, boolean p2) { super(); }
            public void performReceive(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, int p6) {}
            public void performReceive(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, boolean p6, int p7, int p8, java.lang.String p9) {}
        }
    }

    static final class ServiceDispatcher {
        private final android.util.ArrayMap<android.content.ComponentName, android.app.LoadedApk.ServiceDispatcher.ConnectionInfo> mActiveConnections = null;
        private final java.util.concurrent.Executor mActivityExecutor = null;
        private final android.os.Handler mActivityThread = null;
        private final android.content.ServiceConnection mConnection = null;
        private final android.content.Context mContext = null;
        private final long mFlags = 0L;
        private boolean mForgotten;
        private final android.app.LoadedApk.ServiceDispatcher.InnerConnection mIServiceConnection = null;
        private final android.app.ServiceConnectionLeaked mLocation = null;
        private java.lang.RuntimeException mUnbindLocation;
        ServiceDispatcher(android.content.ServiceConnection p0, android.content.Context p1, android.os.Handler p2, long p3) {}
        ServiceDispatcher(android.content.ServiceConnection p0, android.content.Context p1, java.util.concurrent.Executor p2, long p3) {}
        public void connected(android.content.ComponentName p0, android.os.IBinder p1, android.app.IBinderSession p2, boolean p3) {}
        public void death(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void doConnected(android.content.ComponentName p0, android.os.IBinder p1, android.app.IBinderSession p2, boolean p3) {}
        public void doDeath(android.content.ComponentName p0, android.os.IBinder p1) {}
        void doForget() {}
        long getFlags() { return 0L; }
        android.app.IServiceConnection getIServiceConnection() { return null; }
        android.app.ServiceConnectionLeaked getLocation() { return null; }
        android.content.ServiceConnection getServiceConnection() { return null; }
        java.lang.RuntimeException getUnbindLocation() { return null; }
        void setUnbindLocation(java.lang.RuntimeException p0) {}
        void validate(android.content.Context p0, android.os.Handler p1, java.util.concurrent.Executor p2) {}

        private static class ConnectionInfo {
            android.os.IBinder binder;
            android.os.IBinder.DeathRecipient deathMonitor;
            private ConnectionInfo() {}
        }

        private final class DeathMonitor implements android.os.IBinder.DeathRecipient {
            final android.content.ComponentName mName = null;
            final android.os.IBinder mService = null;
            DeathMonitor(android.app.LoadedApk.ServiceDispatcher p0, android.content.ComponentName p1, android.os.IBinder p2) {}
            public void binderDied() {}
        }

        private static class InnerConnection extends android.app.IServiceConnection.Stub {
            final java.lang.ref.WeakReference<android.app.LoadedApk.ServiceDispatcher> mDispatcher = null;
            InnerConnection(android.app.LoadedApk.ServiceDispatcher p0) { super(); }
            public void connected(android.content.ComponentName p0, android.os.IBinder p1, android.app.IBinderSession p2, boolean p3) throws android.os.RemoteException {}
        }

        private final class RunConnection implements java.lang.Runnable {
            final android.app.IBinderSession mBinderSession = null;
            final int mCommand = 0;
            final boolean mDead = false;
            final android.content.ComponentName mName = null;
            final android.os.IBinder mService = null;
            RunConnection(android.app.LoadedApk.ServiceDispatcher p0, android.content.ComponentName p1, android.os.IBinder p2, android.app.IBinderSession p3, int p4, boolean p5) {}
            public void run() {}
        }
    }

    private class SplitDependencyLoaderImpl extends android.content.pm.split.SplitDependencyLoader<android.content.pm.PackageManager.NameNotFoundException> {
        private final java.lang.ClassLoader[] mCachedClassLoaders = null;
        private final java.lang.String[][] mCachedResourcePaths = null;
        SplitDependencyLoaderImpl(android.util.SparseArray<int[]> p0) { super(null); }
        private int ensureSplitLoaded(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
        protected void constructSplit(int p0, int[] p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException {}
        java.lang.ClassLoader getClassLoaderForSplit(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
        java.lang.String[] getSplitPathsForSplit(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
        protected boolean isSplitCached(int p0) { return false; }
    }

    private static class WarningContextClassLoader extends java.lang.ClassLoader {
        private static boolean warned;
        private WarningContextClassLoader() { super((java.lang.ClassLoader)null); }
        private void warn(java.lang.String p0) {}
        public void clearAssertionStatus() {}
        public java.net.URL getResource(java.lang.String p0) { return null; }
        public java.io.InputStream getResourceAsStream(java.lang.String p0) { return null; }
        public java.util.Enumeration<java.net.URL> getResources(java.lang.String p0) throws java.io.IOException { return null; }
        public java.lang.Class<?> loadClass(java.lang.String p0) throws java.lang.ClassNotFoundException { return null; }
        public void setClassAssertionStatus(java.lang.String p0, boolean p1) {}
        public void setDefaultAssertionStatus(boolean p0) {}
        public void setPackageAssertionStatus(java.lang.String p0, boolean p1) {}
    }
}
