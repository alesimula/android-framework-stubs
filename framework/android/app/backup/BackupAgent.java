package android.app.backup;

public abstract class BackupAgent extends android.content.ContextWrapper {
    private static final boolean DEBUG = false;
    private static final int DEFAULT_BACKUP_DESTINATION = 0;
    public static final int FLAG_CLIENT_SIDE_ENCRYPTION_ENABLED = 1;
    public static final int FLAG_CROSS_PLATFORM_DATA_TRANSFER_IOS = 8;
    public static final int FLAG_DEVICE_TO_DEVICE_TRANSFER = 2;
    public static final int FLAG_FAKE_CLIENT_SIDE_ENCRYPTION_ENABLED = -2147483648;
    public static final int FLAG_SKIP_RESTORE_FOR_LAUNCHED_APPS = 4;
    public static final int RESULT_ERROR = -1;
    public static final int RESULT_SUCCESS = 0;
    private static final java.lang.String TAG = "BackupAgent";
    public static final int TYPE_DIRECTORY = 2;
    public static final int TYPE_EOF = 0;
    public static final int TYPE_FILE = 1;
    public static final int TYPE_SYMLINK = 3;
    private volatile int mBackupDestination;
    private final android.os.IBinder mBinder = null;
    android.os.Handler mHandler;
    private volatile android.app.backup.BackupRestoreEventLogger mLogger;
    private android.os.UserHandle mUser;
    public BackupAgent() { super(null); }
    private void applyXmlFiltersAndDoFullBackupForDomain(java.lang.String p0, java.lang.String p1, java.util.Map<java.lang.String, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags>> p2, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags> p3, android.util.ArraySet<java.lang.String> p4, android.app.backup.FullBackupDataOutput p5) throws java.io.IOException {}
    private boolean areIncludeRequiredTransportFlagsSatisfied(int p0, int p1) { return false; }
    private int getBackupUserId() { return 0; }
    private java.util.Set<java.lang.String> getExtraExcludeDirsIfAny(android.content.Context p0) throws java.io.IOException { return null; }
    private boolean isFileEligibleForRestore(java.io.File p0) throws java.io.IOException { return false; }
    private boolean manifestExcludesContainFilePath(java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags> p0, java.lang.String p1) { return false; }
    private void waitForSharedPrefs() {}
    public void attach(android.content.Context p0) {}
    public final void clearBackupRestoreEventLogger() {}
    public final void fullBackupFile(java.io.File p0, android.app.backup.FullBackupDataOutput p1) {}
    protected final void fullBackupFileTree(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags> p3, android.util.ArraySet<java.lang.String> p4, android.app.backup.FullBackupDataOutput p5) {}
    public android.app.backup.BackupRestoreEventLogger getBackupRestoreEventLogger() { return null; }
    android.os.Handler getHandler() { return null; }
    public android.app.backup.BackupAgent.IncludeExcludeRules getIncludeExcludeRules(android.app.backup.FullBackup.BackupScheme p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public abstract void onBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException;
    public final android.os.IBinder onBind() { return null; }
    public void onCreate() {}
    public void onCreate(android.os.UserHandle p0) {}
    @java.lang.Deprecated
    public void onCreate(android.os.UserHandle p0, int p1) {}
    public void onCreate(android.os.UserHandle p0, int p1, int p2) {}
    @android.annotation.SystemApi
    public void onDelayedFullRestore(android.app.backup.DelayedRestoreRequest p0) {}
    @android.annotation.SystemApi
    public void onDelayedRestore(android.app.backup.DelayedRestoreRequest p0, android.app.backup.BackupDataInput p1, long p2, android.os.ParcelFileDescriptor p3) throws java.io.IOException {}
    public void onDestroy() {}
    public long onEstimateFullBackupBytes(long p0, int p1) throws java.io.IOException { return 0L; }
    public void onFullBackup(android.app.backup.FullBackupDataOutput p0) throws java.io.IOException {}
    public void onQuotaExceeded(long p0, long p1) {}
    public abstract void onRestore(android.app.backup.BackupDataInput p0, int p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException;
    public void onRestore(android.app.backup.BackupDataInput p0, long p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException {}
    public void onRestore(android.app.backup.BackupDataInput p0, long p1, android.os.ParcelFileDescriptor p2, java.util.Set<java.lang.String> p3) throws java.io.IOException {}
    public void onRestoreFile(android.app.backup.FullRestoreDataInput p0) throws java.io.IOException {}
    protected void onRestoreFile(android.os.ParcelFileDescriptor p0, long p1, int p2, java.lang.String p3, java.lang.String p4, long p5, long p6, long p7, int p8, java.lang.String p9) throws java.io.IOException {}
    public void onRestoreFile(android.os.ParcelFileDescriptor p0, long p1, java.io.File p2, int p3, long p4, long p5) throws java.io.IOException {}
    public void onRestoreFinished() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackupFileSystemObjectType {
    }

    private class BackupServiceBinder extends android.app.IBackupAgent.Stub {
        private static final java.lang.String BACKUP_DATA_CACHE_DIR = "backup_cache";
        private static final java.lang.String BACKUP_DATA_CACHE_FILENAME = "backup_data.cache";
        private static final java.lang.String TAG = "BackupServiceBinder";
        private BackupServiceBinder(android.app.backup.BackupAgent p0) { super(); }
        private void cacheDataForDelayedRestoreIfSupported(java.io.FileDescriptor p0) {}
        private static void clearUnconsumedDataFromPipe(android.os.ParcelFileDescriptor p0, long p1) {}
        private void doRestoreInternal(android.os.ParcelFileDescriptor p0, long p1, android.os.ParcelFileDescriptor p2, int p3, android.app.backup.IBackupManager p4, java.util.List<java.lang.String> p5) throws android.os.RemoteException {}
        private java.io.FileInputStream fetchCachedDataForDelayedRestore() { return null; }
        private java.io.File getBackupCacheDir() { return null; }
        private boolean isDelayedRestoreSupported() { return false; }
        public void clearBackupRestoreEventLogger() {}
        public void doBackup(android.os.ParcelFileDescriptor p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, long p3, android.app.backup.IBackupCallback p4, int p5) throws android.os.RemoteException {}
        public void doDelayedFullRestore(android.app.backup.DelayedRestoreRequest p0, android.app.backup.IBackupManager p1, int p2) {}
        public void doDelayedRestore(android.app.backup.DelayedRestoreRequest p0, android.os.ParcelFileDescriptor p1, android.app.backup.IBackupManager p2, long p3, int p4) {}
        public void doDelayedRestoreCachedDataExpired(int p0, android.app.backup.IBackupManager p1) {}
        public void doFullBackup(android.os.ParcelFileDescriptor p0, long p1, int p2, android.app.backup.IBackupManager p3, int p4) {}
        public void doMeasureFullBackup(long p0, int p1, android.app.backup.IBackupManager p2, int p3) {}
        public void doQuotaExceeded(long p0, long p1, android.app.backup.IBackupCallback p2) {}
        public void doRestore(android.os.ParcelFileDescriptor p0, long p1, android.os.ParcelFileDescriptor p2, int p3, android.app.backup.IBackupManager p4) throws android.os.RemoteException {}
        public void doRestoreFile(android.os.ParcelFileDescriptor p0, long p1, int p2, java.lang.String p3, java.lang.String p4, long p5, long p6, int p7, android.app.backup.IBackupManager p8, long p9, int p10, java.lang.String p11) throws android.os.RemoteException {}
        public void doRestoreFinished(int p0, android.app.backup.IBackupManager p1) {}
        public void doRestoreWithExcludedKeys(android.os.ParcelFileDescriptor p0, long p1, android.os.ParcelFileDescriptor p2, int p3, android.app.backup.IBackupManager p4, java.util.List<java.lang.String> p5) throws android.os.RemoteException {}
        public void fail(java.lang.String p0) {}
        public void getLoggerResults(com.android.internal.infra.AndroidFuture<java.util.List<android.app.backup.BackupRestoreEventLogger.DataTypeResult>> p0) {}
        public void getOperationType(com.android.internal.infra.AndroidFuture<java.lang.Integer> p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackupTransportFlags {
    }

    static class FailRunnable implements java.lang.Runnable {
        private java.lang.String mMessage;
        FailRunnable(java.lang.String p0) {}
        public void run() {}
    }

    public static class IncludeExcludeRules {
        private final java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags> mManifestExcludeSet = null;
        private final java.util.Map<java.lang.String, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags>> mManifestIncludeMap = null;
        public IncludeExcludeRules(java.util.Map<java.lang.String, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags>> p0, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags> p1) {}
        public static android.app.backup.BackupAgent.IncludeExcludeRules emptyRules() { return null; }
        private java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags> getExcludeSet() { return null; }
        private java.util.Map<java.lang.String, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags>> getIncludeMap() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    class SharedPrefsSynchronizer implements java.lang.Runnable {
        public final java.util.concurrent.CountDownLatch mLatch = null;
        SharedPrefsSynchronizer(android.app.backup.BackupAgent p0) {}
        public void run() {}
    }
}
