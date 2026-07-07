package android.os.flagging;

public class PlatformAconfigPackage {
    private static final java.lang.String BOOT_PATH = "/metadata/aconfig/boot/";
    private static final java.lang.String MAP_PATH = "/metadata/aconfig/maps/";
    public static final java.util.Set<java.lang.String> PLATFORM_PACKAGE_MAP_FILES = null;
    private static final java.lang.String TAG = "PlatformAconfigPackage";
    static final java.util.Map<java.lang.String, android.internal.aconfig.storage.TableUtils.StorageFilesBundle> sStorageFilesCache = null;
    private android.internal.aconfig.storage.FlagTable mFlagTable;
    private android.internal.aconfig.storage.FlagValueList mFlagValueList;
    private int mPackageBooleanStartOffset;
    private int mPackageId;
    private PlatformAconfigPackage() {}
    public static android.os.flagging.PlatformAconfigPackage load(java.lang.String p0) { return null; }
    private static java.nio.MappedByteBuffer mapStorageFile(java.lang.String p0) { return null; }
    private static void quietlyDispose(java.io.Closeable p0) {}
    public boolean getBooleanFlagValue(java.lang.String p0, boolean p1) { return false; }
}
