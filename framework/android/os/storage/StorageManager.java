package android.os.storage;

public class StorageManager {
    public static final java.lang.String ACTION_CLEAR_APP_CACHE = "android.os.storage.action.CLEAR_APP_CACHE";
    public static final java.lang.String ACTION_MANAGE_STORAGE = "android.os.storage.action.MANAGE_STORAGE";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int APP_IO_BLOCKED_REASON_TRANSCODING = 1;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int APP_IO_BLOCKED_REASON_UNKNOWN = 0;
    public static final java.lang.String CACHE_RESERVE_PERCENT_HIGH_KEY = "cache_reserve_percent_high";
    public static final java.lang.String CACHE_RESERVE_PERCENT_LOW_KEY = "cache_reserve_percent_low";
    public static final int CRYPT_TYPE_DEFAULT = 1;
    public static final int CRYPT_TYPE_PASSWORD = 0;
    public static final int DEBUG_ADOPTABLE_FORCE_OFF = 2;
    public static final int DEBUG_ADOPTABLE_FORCE_ON = 1;
    public static final int DEBUG_SDCARDFS_FORCE_OFF = 8;
    public static final int DEBUG_SDCARDFS_FORCE_ON = 4;
    public static final int DEBUG_VIRTUAL_DISK = 16;
    public static final int DEFAULT_CACHE_RESERVE_PERCENT_HIGH = 10;
    public static final int DEFAULT_CACHE_RESERVE_PERCENT_LOW = 2;
    private static final long DEFAULT_FULL_THRESHOLD_BYTES = Long.valueOf(0L);
    public static final int DEFAULT_STORAGE_THRESHOLD_PERCENT_HIGH = 20;
    public static final int DEFAULT_STORAGE_THRESHOLD_PERCENT_LOW = 5;
    private static final long DEFAULT_THRESHOLD_MAX_BYTES = Long.valueOf(0L);
    public static final int ENCRYPTION_STATE_NONE = 1;
    public static final java.lang.String EXTRA_REQUESTED_BYTES = "android.os.storage.extra.REQUESTED_BYTES";
    public static final java.lang.String EXTRA_UUID = "android.os.storage.extra.UUID";
    private static final java.lang.String FAT_UUID_PREFIX = "fafafafa-fafa-5afa-8afa-fafa";
    @android.annotation.SystemApi
    public static final int FLAG_ALLOCATE_AGGRESSIVE = 1;
    public static final int FLAG_ALLOCATE_CACHE_ONLY = 16;
    public static final int FLAG_ALLOCATE_DEFY_ALL_RESERVED = 2;
    public static final int FLAG_ALLOCATE_DEFY_HALF_RESERVED = 4;
    public static final int FLAG_ALLOCATE_NON_CACHE_ONLY = 8;
    public static final int FLAG_FOR_WRITE = 256;
    public static final int FLAG_INCLUDE_INVISIBLE = 1024;
    public static final int FLAG_INCLUDE_RECENT = 2048;
    public static final int FLAG_INCLUDE_SHARED_PROFILE = 4096;
    public static final int FLAG_REAL_STATE = 512;
    public static final int FLAG_STORAGE_CE = 2;
    public static final int FLAG_STORAGE_DE = 1;
    public static final int FLAG_STORAGE_EXTERNAL = 4;
    public static final int FLAG_STORAGE_SDK = 8;
    public static final int FSTRIM_FLAG_DEEP = 1;
    private static final boolean LOCAL_LOGV = Boolean.valueOf(false);
    @android.annotation.SystemApi
    public static final int MOUNT_MODE_EXTERNAL_ANDROID_WRITABLE = 4;
    @android.annotation.SystemApi
    public static final int MOUNT_MODE_EXTERNAL_DEFAULT = 1;
    @android.annotation.SystemApi
    public static final int MOUNT_MODE_EXTERNAL_INSTALLER = 2;
    @android.annotation.SystemApi
    public static final int MOUNT_MODE_EXTERNAL_NONE = 0;
    @android.annotation.SystemApi
    public static final int MOUNT_MODE_EXTERNAL_PASS_THROUGH = 3;
    private static final java.util.regex.Pattern PATTERN_USER_ID = null;
    public static final int PROJECT_ID_EXT_DEFAULT = 1000;
    public static final int PROJECT_ID_EXT_MEDIA_AUDIO = 1001;
    public static final int PROJECT_ID_EXT_MEDIA_IMAGE = 1003;
    public static final int PROJECT_ID_EXT_MEDIA_VIDEO = 1002;
    public static final java.lang.String PROP_ADOPTABLE = "persist.sys.adoptable";
    public static final java.lang.String PROP_FORCED_SCOPED_STORAGE_WHITELIST = "forced_scoped_storage_whitelist";
    public static final java.lang.String PROP_HAS_ADOPTABLE = "vold.has_adoptable";
    public static final java.lang.String PROP_HAS_RESERVED = "vold.has_reserved";
    public static final java.lang.String PROP_PRIMARY_PHYSICAL = "ro.vold.primary_physical";
    public static final java.lang.String PROP_SDCARDFS = "persist.sys.sdcardfs";
    public static final java.lang.String PROP_VIRTUAL_DISK = "persist.sys.virtual_disk";
    @android.annotation.SystemApi
    public static final int QUOTA_TYPE_MEDIA_AUDIO = 2;
    @android.annotation.SystemApi
    public static final int QUOTA_TYPE_MEDIA_IMAGE = 1;
    @android.annotation.SystemApi
    public static final int QUOTA_TYPE_MEDIA_NONE = 0;
    @android.annotation.SystemApi
    public static final int QUOTA_TYPE_MEDIA_VIDEO = 3;
    public static final java.lang.String STORAGE_THRESHOLD_PERCENT_HIGH_KEY = "storage_threshold_percent_high";
    private static final java.lang.String TAG = "StorageManager";
    public static final java.util.UUID UUID_DEFAULT = null;
    public static final java.lang.String UUID_PRIMARY_PHYSICAL = "primary_physical";
    public static final java.util.UUID UUID_PRIMARY_PHYSICAL_ = null;
    public static final java.lang.String UUID_PRIVATE_INTERNAL = null;
    public static final java.lang.String UUID_SYSTEM = "system";
    public static final java.util.UUID UUID_SYSTEM_ = null;
    private static final int VOLUME_LIST_CACHE_MAX = 16;
    private static final java.lang.String XATTR_CACHE_GROUP = "user.cache_group";
    private static final java.lang.String XATTR_CACHE_TOMBSTONE = "user.cache_tombstone";
    private static volatile android.os.storage.IStorageManager sStorageManager;
    private static final android.app.PropertyInvalidatedCache<android.os.storage.StorageManager.VolumeListQuery, android.os.storage.StorageVolume[]> sVolumeListCache = null;
    private static final android.app.PropertyInvalidatedCache.QueryHandler<android.os.storage.StorageManager.VolumeListQuery, android.os.storage.StorageVolume[]> sVolumeListQuery = null;
    private final android.app.AppOpsManager mAppOps = null;
    private final android.content.Context mContext = null;
    private final java.util.ArrayList<android.os.storage.StorageManager.StorageEventListenerDelegate> mDelegates = null;
    private com.android.internal.os.FuseAppLoop mFuseAppLoop;
    private final java.lang.Object mFuseAppLoopLock = null;
    private final android.os.Looper mLooper = null;
    private final java.util.concurrent.atomic.AtomicInteger mNextNonce = null;
    private final android.os.storage.StorageManager.ObbActionListener mObbActionListener = null;
    private final android.content.ContentResolver mResolver = null;
    private final android.os.storage.IStorageManager mStorageManager = null;
    public StorageManager(android.content.Context p0, android.os.Looper p1) throws android.os.ServiceManager.ServiceNotFoundException {}
    private boolean checkExternalStoragePermissionAndAppOp(boolean p0, int p1, int p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, int p6) { return false; }
    public static boolean checkPermissionAndAppOp(android.content.Context p0, boolean p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, int p7) { return false; }
    private static boolean checkPermissionAndAppOp(android.content.Context p0, boolean p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, int p7, boolean p8) { return false; }
    private boolean checkPermissionAndAppOp(boolean p0, int p1, int p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, int p6) { return false; }
    public static boolean checkPermissionAndCheckOp(android.content.Context p0, boolean p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6) { return false; }
    public static java.lang.String convert(java.util.UUID p0) { return null; }
    public static java.util.UUID convert(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public static android.os.storage.StorageManager from(android.content.Context p0) { return null; }
    private int getNextNonce() { return 0; }
    private android.content.res.ObbInfo getObbInfo(java.lang.String p0) { return null; }
    public static android.util.Pair<java.lang.String, java.lang.Long> getPrimaryStoragePathAndSize() { return null; }
    public static android.os.storage.StorageVolume getPrimaryVolume(android.os.storage.StorageVolume[] p0) { return null; }
    private static long getProjectIdForUser(int p0, int p1) { return 0L; }
    public static android.os.storage.StorageVolume getStorageVolume(java.io.File p0, int p1) { return null; }
    private static android.os.storage.StorageVolume getStorageVolume(android.os.storage.StorageVolume[] p0, java.io.File p1) { return null; }
    public static android.os.storage.StorageVolume[] getVolumeList(int p0, int p1) { return null; }
    public static boolean hasAdoptable() { return false; }
    @android.annotation.SystemApi
    public static boolean hasIsolatedStorage() { return false; }
    public static void invalidateVolumeListCache() {}
    private static boolean isCacheBehavior(java.io.File p0, java.lang.String p1) throws java.io.IOException { return false; }
    public static boolean isCeStorageUnlocked(int p0) { return false; }
    public static boolean isEncrypted() { return false; }
    private static boolean isFatVolumeIdentifier(java.lang.String p0) { return false; }
    public static boolean isFileEncrypted() { return false; }
    @java.lang.Deprecated
    public static java.io.File maybeTranslateEmulatedPathToInternal(java.io.File p0) { return null; }
    private boolean noteAppOpAllowingLegacy(boolean p0, int p1, int p2, java.lang.String p3, java.lang.String p4, int p5) { return false; }
    private static void setCacheBehavior(java.io.File p0, java.lang.String p1, boolean p2) throws java.io.IOException {}
    private static native boolean setQuotaProjectId(java.lang.String p0, long p1);
    public void allocateBytes(java.io.FileDescriptor p0, long p1) throws java.io.IOException {}
    @android.annotation.SystemApi
    public void allocateBytes(java.io.FileDescriptor p0, long p1, int p2) throws java.io.IOException {}
    public void allocateBytes(java.util.UUID p0, long p1) throws java.io.IOException {}
    @android.annotation.SystemApi
    public void allocateBytes(java.util.UUID p0, long p1, int p2) throws java.io.IOException {}
    @java.lang.Deprecated
    public long benchmark(java.lang.String p0) { return 0L; }
    public void benchmark(java.lang.String p0, android.os.IVoldTaskListener p1) {}
    @java.lang.Deprecated
    public boolean checkPermissionReadImages(boolean p0, int p1, int p2, java.lang.String p3, java.lang.String p4) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public long computeStorageCacheBytes(java.io.File p0) { return 0L; }
    @java.lang.Deprecated
    public void disableUsbMassStorage() {}
    @java.lang.Deprecated
    public void enableUsbMassStorage() {}
    public android.os.storage.DiskInfo findDiskById(java.lang.String p0) { return null; }
    public android.os.storage.VolumeInfo findEmulatedForPrivate(android.os.storage.VolumeInfo p0) { return null; }
    public java.io.File findPathForUuid(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    public android.os.storage.VolumeInfo findPrivateForEmulated(android.os.storage.VolumeInfo p0) { return null; }
    public android.os.storage.VolumeRecord findRecordByUuid(java.lang.String p0) { return null; }
    public android.os.storage.VolumeInfo findVolumeById(java.lang.String p0) { return null; }
    public android.os.storage.VolumeInfo findVolumeByQualifiedUuid(java.lang.String p0) { return null; }
    public android.os.storage.VolumeInfo findVolumeByUuid(java.lang.String p0) { return null; }
    public void fixupAppDir(java.io.File p0) {}
    public void forgetVolume(java.lang.String p0) {}
    public void format(java.lang.String p0) {}
    public long getAllocatableBytes(java.util.UUID p0) throws java.io.IOException { return 0L; }
    @android.annotation.SystemApi
    public long getAllocatableBytes(java.util.UUID p0, int p1) throws java.io.IOException { return 0L; }
    public java.lang.String getBestVolumeDescription(android.os.storage.VolumeInfo p0) { return null; }
    public long getCacheQuotaBytes(java.util.UUID p0) throws java.io.IOException { return 0L; }
    public long getCacheSizeBytes(java.util.UUID p0) throws java.io.IOException { return 0L; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public java.lang.String getCloudMediaProvider() { return null; }
    public java.util.List<android.os.storage.DiskInfo> getDisks() { return null; }
    @android.annotation.SystemApi
    public int getExternalStorageMountMode(int p0, java.lang.String p1) { return 0; }
    public long getInternalStorageBlockDeviceSize() { return 0L; }
    @android.annotation.SystemApi
    public int getInternalStorageRemainingLifetime() { return 0; }
    public android.app.PendingIntent getManageSpaceActivityIntent(java.lang.String p0, int p1) { return null; }
    public java.lang.String getMountedObbPath(java.lang.String p0) { return null; }
    public android.os.storage.VolumeInfo getPrimaryPhysicalVolume() { return null; }
    public long getPrimaryStorageSize() { return 0L; }
    public java.lang.String getPrimaryStorageUuid() { return null; }
    public android.os.storage.StorageVolume getPrimaryStorageVolume() { return null; }
    public android.os.storage.StorageVolume getPrimaryVolume() { return null; }
    public int getProxyFileDescriptorMountPointId() { return 0; }
    public java.util.List<android.os.storage.StorageVolume> getRecentStorageVolumes() { return null; }
    public long getStorageBytesUntilLow(java.io.File p0) { return 0L; }
    public long getStorageCacheBytes(java.io.File p0, int p1) { return 0L; }
    public long getStorageFullBytes(java.io.File p0) { return 0L; }
    public long getStorageLowBytes(java.io.File p0) { return 0L; }
    public android.os.storage.StorageVolume getStorageVolume(android.net.Uri p0) { return null; }
    public android.os.storage.StorageVolume getStorageVolume(java.io.File p0) { return null; }
    public java.util.List<android.os.storage.StorageVolume> getStorageVolumes() { return null; }
    public java.util.List<android.os.storage.StorageVolume> getStorageVolumesIncludingSharedProfiles() { return null; }
    public java.util.UUID getUuidForPath(java.io.File p0) throws java.io.IOException { return null; }
    public android.os.storage.StorageVolume[] getVolumeList() { return null; }
    @java.lang.Deprecated
    public java.lang.String[] getVolumePaths() { return null; }
    public java.util.List<android.os.storage.VolumeRecord> getVolumeRecords() { return null; }
    @java.lang.Deprecated
    public java.lang.String getVolumeState(java.lang.String p0) { return null; }
    public java.util.List<android.os.storage.VolumeInfo> getVolumes() { return null; }
    public java.util.List<android.os.storage.VolumeInfo> getWritablePrivateVolumes() { return null; }
    public boolean isAllocationSupported(java.io.FileDescriptor p0) { return false; }
    public boolean isAppIoBlocked(java.util.UUID p0, int p1, int p2, int p3) { return false; }
    public boolean isCacheBehaviorGroup(java.io.File p0) throws java.io.IOException { return false; }
    public boolean isCacheBehaviorTombstone(java.io.File p0) throws java.io.IOException { return false; }
    public boolean isCheckpointSupported() { return false; }
    public boolean isEncrypted(java.io.File p0) { return false; }
    public boolean isObbMounted(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    public boolean isUsbMassStorageConnected() { return false; }
    @java.lang.Deprecated
    public boolean isUsbMassStorageEnabled() { return false; }
    public void lockCeStorage(int p0) {}
    public void mkdirs(java.io.File p0) {}
    public void mount(java.lang.String p0) {}
    public boolean mountObb(java.lang.String p0, java.lang.String p1, android.os.storage.OnObbStateChangeListener p2) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void notifyAppIoBlocked(java.util.UUID p0, int p1, int p2, int p3) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void notifyAppIoResumed(java.util.UUID p0, int p1, int p2, int p3) {}
    public android.os.ParcelFileDescriptor openProxyFileDescriptor(int p0, android.os.ProxyFileDescriptorCallback p1) throws java.io.IOException { return null; }
    public android.os.ParcelFileDescriptor openProxyFileDescriptor(int p0, android.os.ProxyFileDescriptorCallback p1, android.os.Handler p2) throws java.io.IOException { return null; }
    public android.os.ParcelFileDescriptor openProxyFileDescriptor(int p0, android.os.ProxyFileDescriptorCallback p1, android.os.Handler p2, java.util.concurrent.ThreadFactory p3) throws java.io.IOException { return null; }
    public void partitionMixed(java.lang.String p0, int p1) {}
    public void partitionPrivate(java.lang.String p0) {}
    public void partitionPublic(java.lang.String p0) {}
    public void registerListener(android.os.storage.StorageEventListener p0) {}
    public void registerStorageVolumeCallback(java.util.concurrent.Executor p0, android.os.storage.StorageManager.StorageVolumeCallback p1) {}
    public void setCacheBehaviorGroup(java.io.File p0, boolean p1) throws java.io.IOException {}
    public void setCacheBehaviorTombstone(java.io.File p0, boolean p1) throws java.io.IOException {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void setCloudMediaProvider(java.lang.String p0) {}
    public void setPrimaryStorageUuid(java.lang.String p0, android.content.pm.IPackageMoveObserver p1) {}
    public void setVolumeInited(java.lang.String p0, boolean p1) {}
    public void setVolumeNickname(java.lang.String p0, java.lang.String p1) {}
    public void setVolumeSnoozed(java.lang.String p0, boolean p1) {}
    public java.io.File translateAppToSystem(java.io.File p0, int p1, int p2) { return null; }
    public java.io.File translateSystemToApp(java.io.File p0, int p1, int p2) { return null; }
    public void unmount(java.lang.String p0) {}
    public boolean unmountObb(java.lang.String p0, boolean p1, android.os.storage.OnObbStateChangeListener p2) { return false; }
    public void unregisterListener(android.os.storage.StorageEventListener p0) {}
    public void unregisterStorageVolumeCallback(android.os.storage.StorageManager.StorageVolumeCallback p0) {}
    @android.annotation.SystemApi
    public void updateExternalStorageFileQuotaType(java.io.File p0, int p1) throws java.io.IOException {}
    public void wipeAdoptableDisks() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AllocateFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppIoBlockedReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MountMode {
    }

    private class ObbActionListener extends android.os.storage.IObbActionListener.Stub {
        private android.util.SparseArray<android.os.storage.StorageManager.ObbListenerDelegate> mListeners;
        private ObbActionListener(android.os.storage.StorageManager p0) { super(); }
        public int addListener(android.os.storage.OnObbStateChangeListener p0) { return 0; }
        public void onObbResult(java.lang.String p0, int p1, int p2) {}
    }

    private class ObbListenerDelegate {
        private final android.os.Handler mHandler = null;
        private final java.lang.ref.WeakReference<android.os.storage.OnObbStateChangeListener> mObbEventListenerRef = null;
        private final int nonce = 0;
        ObbListenerDelegate(android.os.storage.StorageManager p0, android.os.storage.OnObbStateChangeListener p1) {}
        android.os.storage.OnObbStateChangeListener getListener() { return null; }
        void sendObbStateChanged(java.lang.String p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface QuotaType {
    }

    private class StorageEventListenerDelegate extends android.os.storage.IStorageEventListener.Stub {
        final android.os.storage.StorageManager.StorageVolumeCallback mCallback = null;
        final java.util.concurrent.Executor mExecutor = null;
        final android.os.storage.StorageEventListener mListener = null;
        public StorageEventListenerDelegate(android.os.storage.StorageManager p0, java.util.concurrent.Executor p1, android.os.storage.StorageEventListener p2, android.os.storage.StorageManager.StorageVolumeCallback p3) { super(); }
        public void onDiskDestroyed(android.os.storage.DiskInfo p0) throws android.os.RemoteException {}
        public void onDiskScanned(android.os.storage.DiskInfo p0, int p1) {}
        public void onStorageStateChanged(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        public void onUsbMassStorageConnectionChanged(boolean p0) throws android.os.RemoteException {}
        public void onVolumeForgotten(java.lang.String p0) {}
        public void onVolumeRecordChanged(android.os.storage.VolumeRecord p0) {}
        public void onVolumeStateChanged(android.os.storage.VolumeInfo p0, int p1, int p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StorageFlags {
    }

    public static class StorageVolumeCallback {
        public StorageVolumeCallback() {}
        public void onStateChanged(android.os.storage.StorageVolume p0) {}
    }

    static final class VolumeListQuery {
        private final int mFlags = 0;
        private final java.lang.String mPackageName = null;
        private final int mUserId = 0;
        VolumeListQuery(int p0, java.lang.String p1, int p2) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public int mFlags() { return 0; }
        public java.lang.String mPackageName() { return null; }
        public int mUserId() { return 0; }
        public final java.lang.String toString() { return null; }
    }
}
