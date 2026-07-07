package android.app;

class ContextImpl extends android.content.Context {
    static final java.lang.String CALLED_FROM_SYSTEM_PROCESS_MESSAGE_PREFIX = "Calling a method in the system process without a qualified user: ";
    private static final int CONTEXT_TYPE_ACTIVITY = 2;
    private static final int CONTEXT_TYPE_DISPLAY_CONTEXT = 1;
    private static final int CONTEXT_TYPE_NON_UI = 0;
    private static final int CONTEXT_TYPE_SYSTEM_OR_SYSTEM_UI = 4;
    private static final int CONTEXT_TYPE_WINDOW_CONTEXT = 3;
    private static final boolean DEBUG = false;
    static final byte STATE_INITIALIZING = 1;
    static final byte STATE_NOT_FOUND = 3;
    static final byte STATE_READY = 2;
    static final byte STATE_UNINITIALIZED = 0;
    static final java.lang.String SYSPROP_LOG_MESSAGE_ONLY_ISSUE = "debug.fw.ctx_log_message_only";
    private static final java.lang.String TAG = "ContextImpl";
    private static final java.lang.String XATTR_INODE_CACHE = "user.inode_cache";
    private static final java.lang.String XATTR_INODE_CODE_CACHE = "user.inode_code_cache";
    private static android.util.ArrayMap<java.lang.String, android.util.ArrayMap<java.io.File, android.app.SharedPreferencesImpl>> sSharedPrefsCache;
    private android.content.AttributionSource mAttributionSource;
    private android.view.autofill.AutofillManager.AutofillClient mAutofillClient;
    private android.content.AutofillOptions mAutofillOptions;
    private final java.lang.String mBasePackageName = null;
    private java.io.File mCacheDir;
    private final java.lang.Object mCacheDirLock = null;
    private java.lang.ClassLoader mClassLoader;
    private java.io.File mCodeCacheDir;
    private final java.lang.Object mCodeCacheDirLock = null;
    private android.content.ContentCaptureOptions mContentCaptureOptions;
    private final android.app.ContextImpl.ApplicationContentResolver mContentResolver = null;
    private int mContextType;
    private java.io.File mCratesDir;
    private final java.lang.Object mCratesDirLock = null;
    private java.io.File mDatabasesDir;
    private final java.lang.Object mDatabasesDirLock = null;
    private int mDeviceId;
    private java.util.ArrayList<android.app.ContextImpl.DeviceIdChangeListenerDelegate> mDeviceIdChangeListeners;
    private final java.lang.Object mDeviceIdListenerLock = null;
    private android.view.Display mDisplay;
    private final android.os.UserHandle mExplicitUser = null;
    private java.io.File mFilesDir;
    private final java.lang.Object mFilesDirLock = null;
    private final int mFlags = 0;
    private boolean mForceDisplayOverrideInResources;
    private boolean mIsConfigurationBasedContext;
    private boolean mIsExplicitDeviceId;
    private java.lang.Boolean mIsVisibleBackgroundUsersEnabled;
    final android.app.ActivityThread mMainThread = null;
    private final java.lang.Object mMiscDirsLock = null;
    private java.io.File mNoBackupFilesDir;
    private final java.lang.Object mNoBackupFilesDirLock = null;
    private final java.lang.String mOpPackageName = null;
    private android.content.Context mOuterContext;
    final android.app.LoadedApk mPackageInfo = null;
    private android.content.pm.PackageManager mPackageManager;
    private final android.content.ContextParams mParams = null;
    private java.io.File mPreferencesDir;
    private final java.lang.Object mPreferencesDirLock = null;
    private android.content.Context mReceiverRestrictedContext;
    private android.content.res.Resources mResources;
    private final android.app.ResourcesManager mResourcesManager = null;
    final java.lang.Object[] mServiceCache = null;
    final byte[] mServiceInitializationStateArray = null;
    private android.util.ArrayMap<java.lang.String, java.io.File> mSharedPrefsPaths;
    private java.lang.String mSplitName;
    private android.content.res.Resources.Theme mTheme;
    private final java.lang.Object mThemeLock = null;
    private int mThemeResource;
    private final android.os.IBinder mToken = null;
    private final android.os.UserHandle mUser = null;
    private ContextImpl(android.app.ContextImpl p0, android.app.ActivityThread p1, android.app.LoadedApk p2, android.content.ContextParams p3, java.lang.String p4, android.content.AttributionSource p5, java.lang.String p6, android.os.IBinder p7, android.os.UserHandle p8, int p9, java.lang.ClassLoader p10, java.lang.String p11, int p12, boolean p13) { super(); }
    private android.os.Bundle applyLaunchDisplayIfNeeded(android.os.Bundle p0) { return null; }
    private boolean bindServiceCommon(android.content.Intent p0, android.content.ServiceConnection p1, long p2, java.lang.String p3, android.os.Handler p4, java.util.concurrent.Executor p5, android.os.UserHandle p6) { return false; }
    private void checkMode(int p0) {}
    static android.app.ContextImpl createActivityContext(android.app.ActivityThread p0, android.app.LoadedApk p1, android.content.pm.ActivityInfo p2, android.os.IBinder p3, int p4, android.content.res.Configuration p5) { return null; }
    static android.app.ContextImpl createAppContext(android.app.ActivityThread p0, android.app.LoadedApk p1) { return null; }
    static android.app.ContextImpl createAppContext(android.app.ActivityThread p0, android.app.LoadedApk p1, java.lang.String p2) { return null; }
    private android.content.Context createApplicationContextAsUser(android.content.pm.ApplicationInfo p0, int p1, android.os.UserHandle p2) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    private android.content.AttributionSource createAttributionSource(java.lang.String p0, android.content.AttributionSource p1, java.util.Set<java.lang.String> p2, boolean p3, int p4) { return null; }
    private android.content.AttributionSource createAttributionSourceWithDeviceId(android.content.AttributionSource p0, int p1) { return null; }
    private static android.content.res.Resources createResources(android.os.IBinder p0, android.app.LoadedApk p1, java.lang.String p2, java.lang.Integer p3, android.content.res.Configuration p4, android.content.res.CompatibilityInfo p5, java.util.List<android.content.res.loader.ResourcesLoader> p6) { return null; }
    static android.app.ContextImpl createSystemContext(android.app.ActivityThread p0) { return null; }
    static android.app.ContextImpl createSystemContextInner(android.app.ActivityThread p0, android.app.LoadedApk p1) { return null; }
    static android.content.Context createSystemUiContext(android.app.ContextImpl p0, int p1) { return null; }
    private android.window.WindowContext createWindowContextInternal(android.view.Display p0, int p1, android.os.Bundle p2) { return null; }
    private static android.content.res.Resources createWindowContextResources(android.app.ContextImpl p0) { return null; }
    private void credentialProtectedSharedPrefsCheck() {}
    private void enforce(java.lang.String p0, int p1, boolean p2, int p3, java.lang.String p4) {}
    private void enforceForUri(int p0, int p1, boolean p2, int p3, android.net.Uri p4, java.lang.String p5) {}
    private java.io.File[] ensureExternalDirsExistOrFilter(java.io.File[] p0, boolean p1) { return null; }
    private java.io.File ensurePrivateCacheDirExists(java.io.File p0, java.lang.String p1) { return null; }
    private java.io.File ensurePrivateDirExists(java.io.File p0, int p1) { return null; }
    private java.io.File ensurePrivateDirExists(java.io.File p0, int p1, int p2, java.lang.String p3, int p4) { return null; }
    static java.io.File getCodeCacheDirBeforeBind(java.io.File p0) { return null; }
    private java.io.File getDatabasesDir() { return null; }
    private android.app.ContextImpl.DeviceIdChangeListenerDelegate getDeviceIdListener(java.util.function.IntConsumer p0) { return null; }
    static android.app.ContextImpl getImpl(android.content.Context p0) { return null; }
    private boolean getIsVisibleBackgroundUsersEnabled() { return false; }
    private static java.lang.String getNonContextCaller() { return null; }
    private java.io.File getPreferencesDir() { return null; }
    private android.util.ArrayMap<java.io.File, android.app.SharedPreferencesImpl> getSharedPreferencesCacheLocked() { return null; }
    private android.app.WallpaperManager getWallpaperManager() { return null; }
    private void initializeTheme() {}
    private boolean isAssociatedWithDisplay() { return false; }
    private static boolean isSystemOrSystemUI(android.content.Context p0) { return false; }
    private static void logException(java.lang.Exception p0, java.lang.String p1, java.lang.Object... p2) {}
    private void logStorageError(java.io.File p0, int p1, java.lang.Exception p2) {}
    private java.io.File makeFilename(java.io.File p0, java.lang.String p1) { return null; }
    private static int moveFiles(java.io.File p0, java.io.File p1, java.lang.String p2) { return 0; }
    private void notifyOnDeviceChangedListeners(int p0) {}
    private static void onPathAccess(java.lang.String p0) {}
    private android.content.AttributionSource registerAttributionSourceIfNeeded(android.content.AttributionSource p0, boolean p1) { return null; }
    private android.content.AttributionSource registerAttributionSourceIfNeeded$ravenwood(android.content.AttributionSource p0, boolean p1) { return null; }
    private android.content.Intent registerReceiverInternal(android.content.BroadcastReceiver p0, int p1, android.content.IntentFilter p2, java.lang.String p3, android.os.Handler p4, android.content.Context p5, int p6) { return null; }
    private int resolveUserId(android.net.Uri p0) { return 0; }
    private void sendOrderedBroadcastAsUserMultiplePermissions(android.content.Intent p0, android.os.UserHandle p1, java.lang.String[] p2, java.lang.String[] p3, int p4, android.os.Bundle p5, android.content.BroadcastReceiver p6, android.os.Handler p7, int p8, java.lang.String p9, android.os.Bundle p10) {}
    private void setDisplay(android.view.Display p0) {}
    static void setFilePermissionsFromMode(java.lang.String p0, int p1, int p2) {}
    private android.content.ComponentName startServiceCommon(android.content.Intent p0, boolean p1, android.os.UserHandle p2) { return null; }
    private boolean stopServiceCommon(android.content.Intent p0, android.os.UserHandle p1) { return false; }
    private void updateDeviceIdIfChanged(android.view.Display p0) {}
    private void updateResourceOverlayConstraints() {}
    private java.lang.String uriModeFlagToString(int p0) { return null; }
    private void validateServiceIntent(android.content.Intent p0) {}
    private void warnIfCallingFromSystemProcess() {}
    public boolean bindIsolatedService(android.content.Intent p0, int p1, java.lang.String p2, java.util.concurrent.Executor p3, android.content.ServiceConnection p4) { return false; }
    public boolean bindIsolatedService(android.content.Intent p0, android.content.Context.BindServiceFlags p1, java.lang.String p2, java.util.concurrent.Executor p3, android.content.ServiceConnection p4) { return false; }
    public boolean bindService(android.content.Intent p0, int p1, java.util.concurrent.Executor p2, android.content.ServiceConnection p3) { return false; }
    public boolean bindService(android.content.Intent p0, android.content.Context.BindServiceFlags p1, java.util.concurrent.Executor p2, android.content.ServiceConnection p3) { return false; }
    public boolean bindService(android.content.Intent p0, android.content.ServiceConnection p1, int p2) { return false; }
    public boolean bindService(android.content.Intent p0, android.content.ServiceConnection p1, android.content.Context.BindServiceFlags p2) { return false; }
    public boolean bindServiceAsUser(android.content.Intent p0, android.content.ServiceConnection p1, int p2, android.os.Handler p3, android.os.UserHandle p4) { return false; }
    public boolean bindServiceAsUser(android.content.Intent p0, android.content.ServiceConnection p1, int p2, android.os.UserHandle p3) { return false; }
    public boolean bindServiceAsUser(android.content.Intent p0, android.content.ServiceConnection p1, android.content.Context.BindServiceFlags p2, android.os.Handler p3, android.os.UserHandle p4) { return false; }
    public boolean bindServiceAsUser(android.content.Intent p0, android.content.ServiceConnection p1, android.content.Context.BindServiceFlags p2, android.os.UserHandle p3) { return false; }
    public boolean canLoadUnsafeResources() { return false; }
    public int checkCallingOrSelfPermission(java.lang.String p0) { return 0; }
    public int checkCallingOrSelfUriPermission(android.net.Uri p0, int p1) { return 0; }
    public int[] checkCallingOrSelfUriPermissions(java.util.List<android.net.Uri> p0, int p1) { return null; }
    public int checkCallingPermission(java.lang.String p0) { return 0; }
    public int checkCallingUriPermission(android.net.Uri p0, int p1) { return 0; }
    public int[] checkCallingUriPermissions(java.util.List<android.net.Uri> p0, int p1) { return null; }
    public int checkContentUriPermissionFull(android.net.Uri p0, int p1, int p2, int p3) { return 0; }
    public int checkPermission(java.lang.String p0, int p1, int p2) { return 0; }
    public int checkPermission(java.lang.String p0, int p1, int p2, android.os.IBinder p3) { return 0; }
    public int checkSelfPermission(java.lang.String p0) { return 0; }
    public int checkUriPermission(android.net.Uri p0, int p1, int p2, int p3) { return 0; }
    public int checkUriPermission(android.net.Uri p0, int p1, int p2, int p3, android.os.IBinder p4) { return 0; }
    public int checkUriPermission(android.net.Uri p0, java.lang.String p1, java.lang.String p2, int p3, int p4, int p5) { return 0; }
    public int[] checkUriPermissions(java.util.List<android.net.Uri> p0, int p1, int p2, int p3) { return null; }
    @java.lang.Deprecated
    public void clearWallpaper() throws java.io.IOException {}
    public void closeSystemDialogs() {}
    public android.content.Context createApplicationContext(android.content.pm.ApplicationInfo p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.Context createAttributionContext(java.lang.String p0) { return null; }
    public android.content.Context createConfigurationContext(android.content.res.Configuration p0) { return null; }
    public android.content.Context createContext(android.content.ContextParams p0) { return null; }
    public android.content.Context createContextAsUser(android.os.UserHandle p0, int p1) { return null; }
    public android.content.Context createContextForSdkInSandbox(android.content.pm.ApplicationInfo p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.Context createContextForSplit(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.Context createCredentialProtectedStorageContext() { return null; }
    public android.content.Context createDeviceContext(int p0) { return null; }
    public android.content.Context createDeviceProtectedStorageContext() { return null; }
    public android.content.Context createDisplayContext(android.view.Display p0) { return null; }
    public android.content.Context createPackageContext(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.Context createPackageContextAsUser(java.lang.String p0, int p1, android.os.UserHandle p2) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.Context createTokenContext(android.os.IBinder p0, android.view.Display p1) { return null; }
    public android.window.WindowContext createWindowContext(int p0, android.os.Bundle p1) { return null; }
    public android.window.WindowContext createWindowContext(android.view.Display p0, int p1, android.os.Bundle p2) { return null; }
    android.app.ContextImpl createWindowContextBase(android.os.IBinder p0, int p1) { return null; }
    public java.lang.String[] databaseList() { return null; }
    public boolean deleteDatabase(java.lang.String p0) { return false; }
    public boolean deleteFile(java.lang.String p0) { return false; }
    public boolean deleteSharedPreferences(java.lang.String p0) { return false; }
    public void destroy() {}
    public void enforceCallingOrSelfPermission(java.lang.String p0, java.lang.String p1) {}
    public void enforceCallingOrSelfUriPermission(android.net.Uri p0, int p1, java.lang.String p2) {}
    public void enforceCallingPermission(java.lang.String p0, java.lang.String p1) {}
    public void enforceCallingUriPermission(android.net.Uri p0, int p1, java.lang.String p2) {}
    public void enforcePermission(java.lang.String p0, int p1, int p2, java.lang.String p3) {}
    public void enforceUriPermission(android.net.Uri p0, int p1, int p2, int p3, java.lang.String p4) {}
    public void enforceUriPermission(android.net.Uri p0, java.lang.String p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6) {}
    public java.lang.String[] fileList() { return null; }
    public android.os.IBinder getActivityToken() { return null; }
    public android.content.Context getApplicationContext() { return null; }
    public android.content.pm.ApplicationInfo getApplicationInfo() { return null; }
    public android.content.res.AssetManager getAssets() { return null; }
    public int getAssociatedDisplayId() { return 0; }
    public android.content.AttributionSource getAttributionSource() { return null; }
    public java.lang.String getAttributionTag() { return null; }
    public android.view.autofill.AutofillManager.AutofillClient getAutofillClient() { return null; }
    public android.content.AutofillOptions getAutofillOptions() { return null; }
    public java.lang.String getBasePackageName() { return null; }
    public java.io.File getCacheDir() { return null; }
    public java.lang.ClassLoader getClassLoader() { return null; }
    public java.io.File getCodeCacheDir() { return null; }
    public android.content.ContentCaptureOptions getContentCaptureOptions() { return null; }
    public android.content.ContentResolver getContentResolver() { return null; }
    public java.io.File getCrateDir(java.lang.String p0) { return null; }
    public java.io.File getDataDir() { return null; }
    public java.io.File getDatabasePath(java.lang.String p0) { return null; }
    public int getDeviceId() { return 0; }
    public java.io.File getDir(java.lang.String p0, int p1) { return null; }
    public android.view.Display getDisplay() { return null; }
    public android.view.DisplayAdjustments getDisplayAdjustments(int p0) { return null; }
    public int getDisplayId() { return 0; }
    public android.view.Display getDisplayNoVerify() { return null; }
    android.view.Display getDisplayNoVerifyInner() { return null; }
    public java.io.File getExternalCacheDir() { return null; }
    public java.io.File[] getExternalCacheDirs() { return null; }
    public java.io.File getExternalFilesDir(java.lang.String p0) { return null; }
    public java.io.File[] getExternalFilesDirs(java.lang.String p0) { return null; }
    public java.io.File[] getExternalMediaDirs() { return null; }
    public java.io.File getFileStreamPath(java.lang.String p0) { return null; }
    public java.io.File getFilesDir() { return null; }
    public android.app.IApplicationThread getIApplicationThread() { return null; }
    public java.util.concurrent.Executor getMainExecutor() { return null; }
    public android.os.Looper getMainLooper() { return null; }
    public android.os.Handler getMainThreadHandler() { return null; }
    public java.io.File getNoBackupFilesDir() { return null; }
    public java.io.File getObbDir() { return null; }
    public java.io.File[] getObbDirs() { return null; }
    public java.lang.String getOpPackageName() { return null; }
    final android.content.Context getOuterContext() { return null; }
    public java.lang.String getPackageCodePath() { return null; }
    public android.content.pm.PackageManager getPackageManager() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getPackageResourcePath() { return null; }
    public android.content.ContextParams getParams() { return null; }
    public int getPermissionRequestState(java.lang.String p0) { return 0; }
    public java.io.File getPreloadsFileCache() { return null; }
    public android.os.IBinder getProcessToken() { return null; }
    final android.content.Context getReceiverRestrictedContext() { return null; }
    public java.util.List<android.content.IntentFilter> getRegisteredIntentFilters(android.content.BroadcastReceiver p0) { return null; }
    public android.content.res.Resources getResources() { return null; }
    public android.app.IServiceConnection getServiceDispatcher(android.content.ServiceConnection p0, android.os.Handler p1, long p2) { return null; }
    public android.content.SharedPreferences getSharedPreferences(java.io.File p0, int p1) { return null; }
    public android.content.SharedPreferences getSharedPreferences(java.lang.String p0, int p1) { return null; }
    public java.io.File getSharedPreferencesPath(java.lang.String p0) { return null; }
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    public java.lang.String getSystemServiceName(java.lang.Class<?> p0) { return null; }
    public android.content.res.Resources.Theme getTheme() { return null; }
    public int getThemeResId() { return 0; }
    public android.os.UserHandle getUser() { return null; }
    public int getUserId() { return 0; }
    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getWallpaper() { return null; }
    @java.lang.Deprecated
    public int getWallpaperDesiredMinimumHeight() { return 0; }
    @java.lang.Deprecated
    public int getWallpaperDesiredMinimumWidth() { return 0; }
    public android.os.IBinder getWindowContextToken() { return null; }
    public void grantUriPermission(java.lang.String p0, android.net.Uri p1, int p2) {}
    void installSystemApplicationInfo(android.content.pm.ApplicationInfo p0, java.lang.ClassLoader p1) {}
    public boolean isConfigurationContext() { return false; }
    public boolean isCredentialProtectedStorage() { return false; }
    public boolean isDeviceProtectedStorage() { return false; }
    public boolean isRestricted() { return false; }
    public boolean isUiContext() { return false; }
    public boolean moveDatabaseFrom(android.content.Context p0, java.lang.String p1) { return false; }
    public boolean moveSharedPreferencesFrom(android.content.Context p0, java.lang.String p1) { return false; }
    public java.io.FileInputStream openFileInput(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    public java.io.FileOutputStream openFileOutput(java.lang.String p0, int p1) throws java.io.FileNotFoundException { return null; }
    public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String p0, int p1, android.database.sqlite.SQLiteDatabase.CursorFactory p2) { return null; }
    public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String p0, int p1, android.database.sqlite.SQLiteDatabase.CursorFactory p2, android.database.DatabaseErrorHandler p3) { return null; }
    @java.lang.Deprecated
    public android.graphics.drawable.Drawable peekWallpaper() { return null; }
    final void performFinalCleanup(java.lang.String p0, java.lang.String p1) {}
    public void rebindService(android.content.ServiceConnection p0, android.content.Context.BindServiceFlags p1) {}
    public void registerDeviceIdChangeListener(java.util.concurrent.Executor p0, java.util.function.IntConsumer p1) {}
    public android.content.Intent registerReceiver(android.content.BroadcastReceiver p0, android.content.IntentFilter p1) { return null; }
    public android.content.Intent registerReceiver(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, int p2) { return null; }
    public android.content.Intent registerReceiver(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, java.lang.String p2, android.os.Handler p3) { return null; }
    public android.content.Intent registerReceiver(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, java.lang.String p2, android.os.Handler p3, int p4) { return null; }
    public android.content.Intent registerReceiverAsUser(android.content.BroadcastReceiver p0, android.os.UserHandle p1, android.content.IntentFilter p2, java.lang.String p3, android.os.Handler p4) { return null; }
    public android.content.Intent registerReceiverAsUser(android.content.BroadcastReceiver p0, android.os.UserHandle p1, android.content.IntentFilter p2, java.lang.String p3, android.os.Handler p4, int p5) { return null; }
    public android.content.Intent registerReceiverForAllUsers(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, java.lang.String p2, android.os.Handler p3) { return null; }
    public android.content.Intent registerReceiverForAllUsers(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, java.lang.String p2, android.os.Handler p3, int p4) { return null; }
    public void reloadSharedPreferences() {}
    @java.lang.Deprecated
    public void removeStickyBroadcast(android.content.Intent p0) {}
    @java.lang.Deprecated
    public void removeStickyBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1) {}
    public void revokeSelfPermissionsOnKill(java.util.Collection<java.lang.String> p0) {}
    public void revokeUriPermission(android.net.Uri p0, int p1) {}
    public void revokeUriPermission(java.lang.String p0, android.net.Uri p1, int p2) {}
    final void scheduleFinalCleanup(java.lang.String p0, java.lang.String p1) {}
    public void sendBroadcast(android.content.Intent p0) {}
    public void sendBroadcast(android.content.Intent p0, java.lang.String p1) {}
    public void sendBroadcast(android.content.Intent p0, java.lang.String p1, int p2) {}
    public void sendBroadcast(android.content.Intent p0, java.lang.String p1, android.os.Bundle p2) {}
    public void sendBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1) {}
    public void sendBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2) {}
    public void sendBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, int p3) {}
    public void sendBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, android.os.Bundle p3) {}
    public void sendBroadcastAsUserMultiplePermissions(android.content.Intent p0, android.os.UserHandle p1, java.lang.String[] p2) {}
    public void sendBroadcastMultiplePermissions(android.content.Intent p0, java.lang.String[] p1) {}
    public void sendBroadcastMultiplePermissions(android.content.Intent p0, java.lang.String[] p1, android.os.Bundle p2) {}
    public void sendBroadcastMultiplePermissions(android.content.Intent p0, java.lang.String[] p1, java.lang.String[] p2, java.lang.String[] p3, android.app.BroadcastOptions p4) {}
    public void sendOrderedBroadcast(android.content.Intent p0, int p1, java.lang.String p2, java.lang.String p3, android.content.BroadcastReceiver p4, android.os.Handler p5, java.lang.String p6, android.os.Bundle p7, android.os.Bundle p8) {}
    public void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1) {}
    public void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, int p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7) {}
    void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, int p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7, android.os.Bundle p8) {}
    public void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, android.content.BroadcastReceiver p2, android.os.Handler p3, int p4, java.lang.String p5, android.os.Bundle p6) {}
    public void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, android.os.Bundle p2) {}
    public void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, android.os.Bundle p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7) {}
    public void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, java.lang.String p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7) {}
    public void sendOrderedBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, int p3, android.content.BroadcastReceiver p4, android.os.Handler p5, int p6, java.lang.String p7, android.os.Bundle p8) {}
    public void sendOrderedBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, int p3, android.os.Bundle p4, android.content.BroadcastReceiver p5, android.os.Handler p6, int p7, java.lang.String p8, android.os.Bundle p9) {}
    public void sendOrderedBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7) {}
    public void sendOrderedBroadcastAsUserMultiplePermissions(android.content.Intent p0, android.os.UserHandle p1, java.lang.String[] p2, int p3, android.os.Bundle p4, android.content.BroadcastReceiver p5, android.os.Handler p6, int p7, java.lang.String p8, android.os.Bundle p9) {}
    public void sendOrderedBroadcastMultiplePermissions(android.content.Intent p0, java.lang.String[] p1, java.lang.String p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7, android.os.Bundle p8) {}
    public void sendOrderedBroadcastMultiplePermissions(android.content.Intent p0, java.lang.String[] p1, java.lang.String[] p2, java.lang.String p3, android.content.BroadcastReceiver p4, android.os.Handler p5, int p6, java.lang.String p7, android.os.Bundle p8, android.os.Bundle p9) {}
    @java.lang.Deprecated
    public void sendStickyBroadcast(android.content.Intent p0) {}
    @java.lang.Deprecated
    public void sendStickyBroadcast(android.content.Intent p0, android.os.Bundle p1) {}
    @java.lang.Deprecated
    public void sendStickyBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1) {}
    @java.lang.Deprecated
    public void sendStickyBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, android.os.Bundle p2) {}
    @java.lang.Deprecated
    public void sendStickyOrderedBroadcast(android.content.Intent p0, android.content.BroadcastReceiver p1, android.os.Handler p2, int p3, java.lang.String p4, android.os.Bundle p5) {}
    @java.lang.Deprecated
    public void sendStickyOrderedBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, android.content.BroadcastReceiver p2, android.os.Handler p3, int p4, java.lang.String p5, android.os.Bundle p6) {}
    public void setAutofillClient(android.view.autofill.AutofillManager.AutofillClient p0) {}
    public void setAutofillOptions(android.content.AutofillOptions p0) {}
    public void setContentCaptureOptions(android.content.ContentCaptureOptions p0) {}
    final void setOuterContext(android.content.Context p0) {}
    void setResources(android.content.res.Resources p0) {}
    public void setTheme(int p0) {}
    @java.lang.Deprecated
    public void setWallpaper(android.graphics.Bitmap p0) throws java.io.IOException {}
    @java.lang.Deprecated
    public void setWallpaper(java.io.InputStream p0) throws java.io.IOException {}
    public boolean shouldShowRequestPermissionRationale(java.lang.String p0) { return false; }
    public void startActivities(android.content.Intent[] p0) {}
    public void startActivities(android.content.Intent[] p0, android.os.Bundle p1) {}
    public int startActivitiesAsUser(android.content.Intent[] p0, android.os.Bundle p1, android.os.UserHandle p2) { return 0; }
    public void startActivity(android.content.Intent p0) {}
    public void startActivity(android.content.Intent p0, android.os.Bundle p1) {}
    public void startActivityAsUser(android.content.Intent p0, android.os.Bundle p1, android.os.UserHandle p2) {}
    public void startActivityAsUser(android.content.Intent p0, android.os.UserHandle p1) {}
    public android.content.ComponentName startForegroundService(android.content.Intent p0) { return null; }
    public android.content.ComponentName startForegroundServiceAsUser(android.content.Intent p0, android.os.UserHandle p1) { return null; }
    public boolean startInstrumentation(android.content.ComponentName p0, java.lang.String p1, android.os.Bundle p2) { return false; }
    public void startIntentSender(android.content.IntentSender p0, android.content.Intent p1, int p2, int p3, int p4) throws android.content.IntentSender.SendIntentException {}
    public void startIntentSender(android.content.IntentSender p0, android.content.Intent p1, int p2, int p3, int p4, android.os.Bundle p5) throws android.content.IntentSender.SendIntentException {}
    public android.content.ComponentName startService(android.content.Intent p0) { return null; }
    public android.content.ComponentName startServiceAsUser(android.content.Intent p0, android.os.UserHandle p1) { return null; }
    public boolean stopService(android.content.Intent p0) { return false; }
    public boolean stopServiceAsUser(android.content.Intent p0, android.os.UserHandle p1) { return false; }
    public void unbindService(android.content.ServiceConnection p0) {}
    public void unregisterDeviceIdChangeListener(java.util.function.IntConsumer p0) {}
    public void unregisterReceiver(android.content.BroadcastReceiver p0) {}
    public void updateDeviceId(int p0) {}
    public void updateDisplay(int p0) {}
    public void updateServiceBindings(java.util.Collection<android.content.Context.UpdateBindingParams> p0) {}
    public void updateServiceGroup(android.content.ServiceConnection p0, int p1, int p2) {}

    static final class ApplicationContentResolver extends android.content.ContentResolver {
        private final android.app.ActivityThread mMainThread = null;
        public ApplicationContentResolver(android.content.Context p0, android.app.ActivityThread p1) { super((android.content.Context)null); }
        protected android.content.IContentProvider acquireExistingProvider(android.content.Context p0, java.lang.String p1) { return null; }
        protected android.content.IContentProvider acquireProvider(android.content.Context p0, java.lang.String p1) { return null; }
        protected android.content.IContentProvider acquireUnstableProvider(android.content.Context p0, java.lang.String p1) { return null; }
        public void appNotRespondingViaProvider(android.content.IContentProvider p0) {}
        public boolean releaseProvider(android.content.IContentProvider p0) { return false; }
        public boolean releaseUnstableProvider(android.content.IContentProvider p0) { return false; }
        protected int resolveUserIdFromAuthority(java.lang.String p0) { return 0; }
        public void unstableProviderDied(android.content.IContentProvider p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ContextType {
    }

    private static class DeviceIdChangeListenerDelegate {
        final java.util.concurrent.Executor mExecutor = null;
        final java.util.function.IntConsumer mListener = null;
        DeviceIdChangeListenerDelegate(java.util.function.IntConsumer p0, java.util.concurrent.Executor p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ServiceInitializationState {
    }
}
