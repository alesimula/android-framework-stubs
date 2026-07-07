package android.internal.aconfig.storage;

public class StorageFileProvider {
    private static final java.lang.String DEFAULT_BOOT_PATH = null;
    private static final android.internal.aconfig.storage.StorageFileProvider DEFAULT_INSTANCE = null;
    private static final java.lang.String DEFAULT_MAP_PATH = null;
    private static final java.lang.String FMAP_FILE_EXT = ".flag.map";
    private static final java.lang.String PMAP_FILE_EXT = ".package.map";
    private static final java.lang.String RAVENWOOD_STORAGE_FILE = "all_aconfig_declarations";
    private static final java.lang.String VAL_FILE_EXT = ".val";
    private final java.lang.String mBootPath = null;
    private final java.lang.String mMapPath = null;
    public StorageFileProvider(java.lang.String p0, java.lang.String p1) {}
    private static java.nio.file.Path buildPath(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    private static java.nio.file.Path buildPath$ravenwood(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public static android.internal.aconfig.storage.StorageFileProvider getDefaultProvider() { return null; }
    private static java.lang.String getStorageRoot() { return null; }
    private static java.lang.String getStorageRoot$ravenwood() { return null; }
    private static java.nio.MappedByteBuffer mapStorageFile(java.nio.file.Path p0, android.internal.aconfig.storage.FileType p1) { return null; }
    private static void quietlyDispose(java.io.Closeable p0) {}
    public android.internal.aconfig.storage.FlagTable getFlagTable(java.lang.String p0) { return null; }
    public android.internal.aconfig.storage.FlagValueList getFlagValueList(java.lang.String p0) { return null; }
    public android.internal.aconfig.storage.PackageTable getPackageTable(java.lang.String p0) { return null; }
    public java.util.List<java.lang.String> listContainers(java.lang.String[] p0) { return null; }
}
