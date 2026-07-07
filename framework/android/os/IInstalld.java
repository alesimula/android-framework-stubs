package android.os;

public interface IInstalld extends android.os.IInterface {
    public static final int FLAG_CLEAR_APP_DATA_KEEP_ART_PROFILES = 131072;
    public static final int FLAG_CLEAR_CACHE_ONLY = 16;
    public static final int FLAG_CLEAR_CODE_CACHE_ONLY = 32;
    public static final int FLAG_FORCE = 8192;
    public static final int FLAG_FREE_CACHE_DEFY_TARGET_FREE_BYTES = 2048;
    public static final int FLAG_FREE_CACHE_NOOP = 1024;
    public static final int FLAG_FREE_CACHE_V2 = 256;
    public static final int FLAG_FREE_CACHE_V2_DEFY_QUOTA = 512;
    public static final int FLAG_STORAGE_CE = 2;
    public static final int FLAG_STORAGE_DE = 1;
    public static final int FLAG_STORAGE_EXTERNAL = 4;
    public static final int FLAG_STORAGE_SDK = 8;
    public static final int FLAG_USE_QUOTA = 4096;
    public void cleanupInvalidPackageDirs(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void clearAppData(java.lang.String p0, java.lang.String p1, int p2, int p3, long p4, long p5) throws android.os.RemoteException;
    public void clearAppProfiles(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void controlDexOptBlocking(boolean p0) throws android.os.RemoteException;
    public void copyAppDataPath(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, int p7, android.os.IInstalld.IAppDataOperationCallback p8) throws android.os.RemoteException;
    public boolean copySystemProfile(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public android.os.CreateAppDataResult createAppData(android.os.CreateAppDataArgs p0) throws android.os.RemoteException;
    public android.os.CreateAppDataResult[] createAppDataBatched(android.os.CreateAppDataArgs[] p0) throws android.os.RemoteException;
    public android.os.IInstalld.IFsveritySetupAuthToken createFsveritySetupAuthToken(android.os.ParcelFileDescriptor p0, int p1) throws android.os.RemoteException;
    public void createOatDirs(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    public boolean createProfileSnapshot(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void createUserData(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public long deleteOdex(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void deleteReferenceProfile(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void destroyAppData(java.lang.String p0, java.lang.String p1, int p2, int p3, long p4, long p5) throws android.os.RemoteException;
    public void destroyAppDataSnapshot(java.lang.String p0, java.lang.String p1, int p2, long p3, int p4, int p5) throws android.os.RemoteException;
    public void destroyAppProfiles(java.lang.String p0) throws android.os.RemoteException;
    public void destroyCeSnapshotsNotSpecified(java.lang.String p0, int p1, int[] p2) throws android.os.RemoteException;
    public void destroyPccData(java.lang.String p0, java.lang.String p1, int p2, int p3, long p4) throws android.os.RemoteException;
    public void destroyProfileSnapshot(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void destroyUserData(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean dexopt(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5, int p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, boolean p11, int p12, java.lang.String p13, java.lang.String p14, java.lang.String p15) throws android.os.RemoteException;
    public boolean dumpProfiles(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException;
    public int enableFsverity(android.os.IInstalld.IFsveritySetupAuthToken p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void fixupAppData(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void freeCache(java.lang.String p0, long p1, int p2) throws android.os.RemoteException;
    public android.os.storage.CrateMetadata[] getAppCrates(java.lang.String p0, java.lang.String[] p1, int p2) throws android.os.RemoteException;
    public long[] getAppSize(java.lang.String p0, java.lang.String[] p1, int p2, int p3, int p4, int p5, long[] p6, java.lang.String[] p7) throws android.os.RemoteException;
    public long[] getExternalSize(java.lang.String p0, int p1, int p2, int[] p3) throws android.os.RemoteException;
    public int getOdexVisibility(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public android.os.storage.CrateMetadata[] getUserCrates(java.lang.String p0, int p1) throws android.os.RemoteException;
    public long[] getUserSize(java.lang.String p0, int p1, int p2, int[] p3, int[] p4) throws android.os.RemoteException;
    public void invalidateMounts() throws android.os.RemoteException;
    public boolean isQuotaSupported(java.lang.String p0) throws android.os.RemoteException;
    public void linkFile(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void linkNativeLibraryDirectory(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public int mergeProfiles(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void migrateAppData(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public void migrateLegacyObbData() throws android.os.RemoteException;
    public void moveAb(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void moveAppDataPath(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, int p7, android.os.IInstalld.IAppDataOperationCallback p8) throws android.os.RemoteException;
    public void moveCompleteApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, java.lang.String p7) throws android.os.RemoteException;
    public void onPrivateVolumeRemoved(java.lang.String p0) throws android.os.RemoteException;
    public boolean prepareAppProfile(java.lang.String p0, int p1, int p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException;
    public void reconcileSdkData(android.os.ReconcileSdkDataArgs p0) throws android.os.RemoteException;
    public boolean reconcileSecondaryDexFile(java.lang.String p0, java.lang.String p1, int p2, java.lang.String[] p3, java.lang.String p4, int p5) throws android.os.RemoteException;
    public void restoreAppDataSnapshot(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, int p6, int p7) throws android.os.RemoteException;
    public void restoreconAppData(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5) throws android.os.RemoteException;
    public void rmPackageDir(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void rmdex(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setAppQuota(java.lang.String p0, int p1, int p2, long p3) throws android.os.RemoteException;
    public void setFirstBoot() throws android.os.RemoteException;
    public long snapshotAppData(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void tryMountDataMirror(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.os.IInstalld {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void cleanupInvalidPackageDirs(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void clearAppData(java.lang.String p0, java.lang.String p1, int p2, int p3, long p4, long p5) throws android.os.RemoteException {}
        public void clearAppProfiles(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void controlDexOptBlocking(boolean p0) throws android.os.RemoteException {}
        public void copyAppDataPath(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, int p7, android.os.IInstalld.IAppDataOperationCallback p8) throws android.os.RemoteException {}
        public boolean copySystemProfile(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return false; }
        public android.os.CreateAppDataResult createAppData(android.os.CreateAppDataArgs p0) throws android.os.RemoteException { return null; }
        public android.os.CreateAppDataResult[] createAppDataBatched(android.os.CreateAppDataArgs[] p0) throws android.os.RemoteException { return null; }
        public android.os.IInstalld.IFsveritySetupAuthToken createFsveritySetupAuthToken(android.os.ParcelFileDescriptor p0, int p1) throws android.os.RemoteException { return null; }
        public void createOatDirs(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        public boolean createProfileSnapshot(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return false; }
        public void createUserData(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public long deleteOdex(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0L; }
        public void deleteReferenceProfile(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void destroyAppData(java.lang.String p0, java.lang.String p1, int p2, int p3, long p4, long p5) throws android.os.RemoteException {}
        public void destroyAppDataSnapshot(java.lang.String p0, java.lang.String p1, int p2, long p3, int p4, int p5) throws android.os.RemoteException {}
        public void destroyAppProfiles(java.lang.String p0) throws android.os.RemoteException {}
        public void destroyCeSnapshotsNotSpecified(java.lang.String p0, int p1, int[] p2) throws android.os.RemoteException {}
        public void destroyPccData(java.lang.String p0, java.lang.String p1, int p2, int p3, long p4) throws android.os.RemoteException {}
        public void destroyProfileSnapshot(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void destroyUserData(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public boolean dexopt(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5, int p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, boolean p11, int p12, java.lang.String p13, java.lang.String p14, java.lang.String p15) throws android.os.RemoteException { return false; }
        public boolean dumpProfiles(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return false; }
        public int enableFsverity(android.os.IInstalld.IFsveritySetupAuthToken p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void fixupAppData(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void freeCache(java.lang.String p0, long p1, int p2) throws android.os.RemoteException {}
        public android.os.storage.CrateMetadata[] getAppCrates(java.lang.String p0, java.lang.String[] p1, int p2) throws android.os.RemoteException { return null; }
        public long[] getAppSize(java.lang.String p0, java.lang.String[] p1, int p2, int p3, int p4, int p5, long[] p6, java.lang.String[] p7) throws android.os.RemoteException { return null; }
        public long[] getExternalSize(java.lang.String p0, int p1, int p2, int[] p3) throws android.os.RemoteException { return null; }
        public int getOdexVisibility(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public android.os.storage.CrateMetadata[] getUserCrates(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public long[] getUserSize(java.lang.String p0, int p1, int p2, int[] p3, int[] p4) throws android.os.RemoteException { return null; }
        public void invalidateMounts() throws android.os.RemoteException {}
        public boolean isQuotaSupported(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void linkFile(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void linkNativeLibraryDirectory(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public int mergeProfiles(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void migrateAppData(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
        public void migrateLegacyObbData() throws android.os.RemoteException {}
        public void moveAb(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void moveAppDataPath(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, int p7, android.os.IInstalld.IAppDataOperationCallback p8) throws android.os.RemoteException {}
        public void moveCompleteApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, java.lang.String p7) throws android.os.RemoteException {}
        public void onPrivateVolumeRemoved(java.lang.String p0) throws android.os.RemoteException {}
        public boolean prepareAppProfile(java.lang.String p0, int p1, int p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException { return false; }
        public void reconcileSdkData(android.os.ReconcileSdkDataArgs p0) throws android.os.RemoteException {}
        public boolean reconcileSecondaryDexFile(java.lang.String p0, java.lang.String p1, int p2, java.lang.String[] p3, java.lang.String p4, int p5) throws android.os.RemoteException { return false; }
        public void restoreAppDataSnapshot(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, int p6, int p7) throws android.os.RemoteException {}
        public void restoreconAppData(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
        public void rmPackageDir(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void rmdex(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setAppQuota(java.lang.String p0, int p1, int p2, long p3) throws android.os.RemoteException {}
        public void setFirstBoot() throws android.os.RemoteException {}
        public long snapshotAppData(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException { return 0L; }
        public void tryMountDataMirror(java.lang.String p0) throws android.os.RemoteException {}
    }

    public static interface IAppDataOperationCallback extends android.os.IInterface {
        public static final java.lang.String DESCRIPTOR = "android.os.IInstalld.IAppDataOperationCallback";
        public static final int STATUS_FAILURE = 3;
        public static final int STATUS_RUNNING = 1;
        public static final int STATUS_SUCCESS = 2;
        public static final int STATUS_UNKNOWN = 0;
        public void onStatusChanged(int p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException;

        public static class Default implements android.os.IInstalld.IAppDataOperationCallback {
            public Default() {}
            public android.os.IBinder asBinder() { return null; }
            public void onStatusChanged(int p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException {}
        }

        public static abstract class Stub extends android.os.Binder implements android.os.IInstalld.IAppDataOperationCallback {
            static final int TRANSACTION_onStatusChanged = 1;
            public Stub() { super(); }
            public static android.os.IInstalld.IAppDataOperationCallback asInterface(android.os.IBinder p0) { return null; }
            public static java.lang.String getDefaultTransactionName(int p0) { return null; }
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getTransactionName(int p0) { return null; }
            public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

            private static final class Proxy implements android.os.IInstalld.IAppDataOperationCallback {
                private android.os.IBinder mRemote;
                Proxy(android.os.IBinder p0) {}
                public android.os.IBinder asBinder() { return null; }
                public final java.lang.String getInterfaceDescriptor() { return null; }
                public void onStatusChanged(int p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException {}
            }
        }
    }

    public static interface IFsveritySetupAuthToken extends android.os.IInterface {
        public static final java.lang.String DESCRIPTOR = "android.os.IInstalld.IFsveritySetupAuthToken";

        public static class Default implements android.os.IInstalld.IFsveritySetupAuthToken {
            public Default() {}
            public android.os.IBinder asBinder() { return null; }
        }

        public static abstract class Stub extends android.os.Binder implements android.os.IInstalld.IFsveritySetupAuthToken {
            public Stub() { super(); }
            public static android.os.IInstalld.IFsveritySetupAuthToken asInterface(android.os.IBinder p0) { return null; }
            public static java.lang.String getDefaultTransactionName(int p0) { return null; }
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getTransactionName(int p0) { return null; }
            public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

            private static final class Proxy implements android.os.IInstalld.IFsveritySetupAuthToken {
                private android.os.IBinder mRemote;
                Proxy(android.os.IBinder p0) {}
                public android.os.IBinder asBinder() { return null; }
                public final java.lang.String getInterfaceDescriptor() { return null; }
            }
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IInstalld {
        public static final java.lang.String DESCRIPTOR = "android.os.IInstalld";
        static final int TRANSACTION_cleanupInvalidPackageDirs = 49;
        static final int TRANSACTION_clearAppData = 9;
        static final int TRANSACTION_clearAppProfiles = 26;
        static final int TRANSACTION_controlDexOptBlocking = 21;
        static final int TRANSACTION_copyAppDataPath = 53;
        static final int TRANSACTION_copySystemProfile = 25;
        static final int TRANSACTION_createAppData = 4;
        static final int TRANSACTION_createAppDataBatched = 5;
        static final int TRANSACTION_createFsveritySetupAuthToken = 51;
        static final int TRANSACTION_createOatDirs = 34;
        static final int TRANSACTION_createProfileSnapshot = 29;
        static final int TRANSACTION_createUserData = 1;
        static final int TRANSACTION_deleteOdex = 37;
        static final int TRANSACTION_deleteReferenceProfile = 28;
        static final int TRANSACTION_destroyAppData = 10;
        static final int TRANSACTION_destroyAppDataSnapshot = 44;
        static final int TRANSACTION_destroyAppProfiles = 27;
        static final int TRANSACTION_destroyCeSnapshotsNotSpecified = 45;
        static final int TRANSACTION_destroyPccData = 11;
        static final int TRANSACTION_destroyProfileSnapshot = 30;
        static final int TRANSACTION_destroyUserData = 2;
        static final int TRANSACTION_dexopt = 20;
        static final int TRANSACTION_dumpProfiles = 24;
        static final int TRANSACTION_enableFsverity = 52;
        static final int TRANSACTION_fixupAppData = 12;
        static final int TRANSACTION_freeCache = 32;
        static final int TRANSACTION_getAppCrates = 16;
        static final int TRANSACTION_getAppSize = 13;
        static final int TRANSACTION_getExternalSize = 15;
        static final int TRANSACTION_getOdexVisibility = 50;
        static final int TRANSACTION_getUserCrates = 17;
        static final int TRANSACTION_getUserSize = 14;
        static final int TRANSACTION_invalidateMounts = 39;
        static final int TRANSACTION_isQuotaSupported = 40;
        static final int TRANSACTION_linkFile = 35;
        static final int TRANSACTION_linkNativeLibraryDirectory = 33;
        static final int TRANSACTION_mergeProfiles = 23;
        static final int TRANSACTION_migrateAppData = 8;
        static final int TRANSACTION_migrateLegacyObbData = 48;
        static final int TRANSACTION_moveAb = 36;
        static final int TRANSACTION_moveAppDataPath = 54;
        static final int TRANSACTION_moveCompleteApp = 19;
        static final int TRANSACTION_onPrivateVolumeRemoved = 47;
        static final int TRANSACTION_prepareAppProfile = 41;
        static final int TRANSACTION_reconcileSdkData = 6;
        static final int TRANSACTION_reconcileSecondaryDexFile = 38;
        static final int TRANSACTION_restoreAppDataSnapshot = 43;
        static final int TRANSACTION_restoreconAppData = 7;
        static final int TRANSACTION_rmPackageDir = 31;
        static final int TRANSACTION_rmdex = 22;
        static final int TRANSACTION_setAppQuota = 18;
        static final int TRANSACTION_setFirstBoot = 3;
        static final int TRANSACTION_snapshotAppData = 42;
        static final int TRANSACTION_tryMountDataMirror = 46;
        public Stub() { super(); }
        public static android.os.IInstalld asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.IInstalld {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void cleanupInvalidPackageDirs(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void clearAppData(java.lang.String p0, java.lang.String p1, int p2, int p3, long p4, long p5) throws android.os.RemoteException {}
            public void clearAppProfiles(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void controlDexOptBlocking(boolean p0) throws android.os.RemoteException {}
            public void copyAppDataPath(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, int p7, android.os.IInstalld.IAppDataOperationCallback p8) throws android.os.RemoteException {}
            public boolean copySystemProfile(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return false; }
            public android.os.CreateAppDataResult createAppData(android.os.CreateAppDataArgs p0) throws android.os.RemoteException { return null; }
            public android.os.CreateAppDataResult[] createAppDataBatched(android.os.CreateAppDataArgs[] p0) throws android.os.RemoteException { return null; }
            public android.os.IInstalld.IFsveritySetupAuthToken createFsveritySetupAuthToken(android.os.ParcelFileDescriptor p0, int p1) throws android.os.RemoteException { return null; }
            public void createOatDirs(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
            public boolean createProfileSnapshot(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return false; }
            public void createUserData(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public long deleteOdex(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0L; }
            public void deleteReferenceProfile(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void destroyAppData(java.lang.String p0, java.lang.String p1, int p2, int p3, long p4, long p5) throws android.os.RemoteException {}
            public void destroyAppDataSnapshot(java.lang.String p0, java.lang.String p1, int p2, long p3, int p4, int p5) throws android.os.RemoteException {}
            public void destroyAppProfiles(java.lang.String p0) throws android.os.RemoteException {}
            public void destroyCeSnapshotsNotSpecified(java.lang.String p0, int p1, int[] p2) throws android.os.RemoteException {}
            public void destroyPccData(java.lang.String p0, java.lang.String p1, int p2, int p3, long p4) throws android.os.RemoteException {}
            public void destroyProfileSnapshot(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void destroyUserData(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public boolean dexopt(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5, int p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, boolean p11, int p12, java.lang.String p13, java.lang.String p14, java.lang.String p15) throws android.os.RemoteException { return false; }
            public boolean dumpProfiles(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return false; }
            public int enableFsverity(android.os.IInstalld.IFsveritySetupAuthToken p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void fixupAppData(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void freeCache(java.lang.String p0, long p1, int p2) throws android.os.RemoteException {}
            public android.os.storage.CrateMetadata[] getAppCrates(java.lang.String p0, java.lang.String[] p1, int p2) throws android.os.RemoteException { return null; }
            public long[] getAppSize(java.lang.String p0, java.lang.String[] p1, int p2, int p3, int p4, int p5, long[] p6, java.lang.String[] p7) throws android.os.RemoteException { return null; }
            public long[] getExternalSize(java.lang.String p0, int p1, int p2, int[] p3) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getOdexVisibility(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public android.os.storage.CrateMetadata[] getUserCrates(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public long[] getUserSize(java.lang.String p0, int p1, int p2, int[] p3, int[] p4) throws android.os.RemoteException { return null; }
            public void invalidateMounts() throws android.os.RemoteException {}
            public boolean isQuotaSupported(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void linkFile(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void linkNativeLibraryDirectory(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public int mergeProfiles(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void migrateAppData(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
            public void migrateLegacyObbData() throws android.os.RemoteException {}
            public void moveAb(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void moveAppDataPath(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, int p7, android.os.IInstalld.IAppDataOperationCallback p8) throws android.os.RemoteException {}
            public void moveCompleteApp(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, java.lang.String p7) throws android.os.RemoteException {}
            public void onPrivateVolumeRemoved(java.lang.String p0) throws android.os.RemoteException {}
            public boolean prepareAppProfile(java.lang.String p0, int p1, int p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException { return false; }
            public void reconcileSdkData(android.os.ReconcileSdkDataArgs p0) throws android.os.RemoteException {}
            public boolean reconcileSecondaryDexFile(java.lang.String p0, java.lang.String p1, int p2, java.lang.String[] p3, java.lang.String p4, int p5) throws android.os.RemoteException { return false; }
            public void restoreAppDataSnapshot(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, int p6, int p7) throws android.os.RemoteException {}
            public void restoreconAppData(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
            public void rmPackageDir(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void rmdex(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setAppQuota(java.lang.String p0, int p1, int p2, long p3) throws android.os.RemoteException {}
            public void setFirstBoot() throws android.os.RemoteException {}
            public long snapshotAppData(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException { return 0L; }
            public void tryMountDataMirror(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
