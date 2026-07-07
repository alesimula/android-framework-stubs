package android.content.pm;

public class PackagePartitions {
    public static final java.lang.String FINGERPRINT = null;
    public static final int PARTITION_ODM = 2;
    public static final int PARTITION_OEM = 3;
    public static final int PARTITION_PRODUCT = 4;
    public static final int PARTITION_SYSTEM = 0;
    public static final int PARTITION_SYSTEM_EXT = 5;
    public static final int PARTITION_VENDOR = 1;
    private static final java.util.ArrayList<android.content.pm.PackagePartitions.SystemPartition> SYSTEM_PARTITIONS = null;
    public PackagePartitions() {}
    private static java.io.File canonicalize(java.io.File p0) { return null; }
    private static java.lang.String getFingerprint() { return null; }
    public static <T extends java.lang.Object> java.util.ArrayList<T> getOrderedPartitions(java.util.function.Function<android.content.pm.PackagePartitions.SystemPartition, T> p0) { return null; }

    private static class DeferredCanonicalFile {
        private java.io.File mFile;
        private boolean mIsCanonical;
        private DeferredCanonicalFile(java.io.File p0) {}
        private DeferredCanonicalFile(java.io.File p0, java.lang.String p1) {}
        private java.io.File getFile() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PartitionType {
    }

    public static class SystemPartition {
        private final android.content.pm.PackagePartitions.DeferredCanonicalFile mAppFolder = null;
        private final android.content.pm.PackagePartitions.DeferredCanonicalFile mFolder = null;
        private final java.lang.String mName = null;
        private final java.io.File mNonConicalFolder = null;
        private final android.content.pm.PackagePartitions.DeferredCanonicalFile mOverlayFolder = null;
        private final android.content.pm.PackagePartitions.DeferredCanonicalFile mPrivAppFolder = null;
        public final int type = 0;
        public SystemPartition(android.content.pm.PackagePartitions.SystemPartition p0) {}
        private SystemPartition(java.io.File p0, int p1, java.lang.String p2, boolean p3, boolean p4) {}
        public SystemPartition(java.io.File p0, android.content.pm.PackagePartitions.SystemPartition p1) {}
        public boolean containsApp(java.io.File p0) { return false; }
        public boolean containsFile(java.io.File p0) { return false; }
        public boolean containsOverlay(java.io.File p0) { return false; }
        public boolean containsPath(java.lang.String p0) { return false; }
        public boolean containsPrivApp(java.io.File p0) { return false; }
        public java.io.File getAppFolder() { return null; }
        public java.io.File getFolder() { return null; }
        public java.lang.String getName() { return null; }
        public java.io.File getNonConicalFolder() { return null; }
        public java.io.File getOverlayFolder() { return null; }
        public java.io.File getPrivAppFolder() { return null; }
    }
}
