package android.internal.aconfig.storage;

public class PackageTable {
    private static final int FINGERPRINT_BYTES = 8;
    private static final int NODE_SKIP_BYTES = 12;
    private java.nio.ByteBuffer mBuffer;
    private android.internal.aconfig.storage.PackageTable.Header mHeader;
    public PackageTable() {}
    public static android.internal.aconfig.storage.PackageTable fromBytes(java.nio.ByteBuffer p0) { return null; }
    public android.internal.aconfig.storage.PackageTable.Node get(java.lang.String p0) { return null; }
    public android.internal.aconfig.storage.PackageTable.Header getHeader() { return null; }
    public java.util.List<java.lang.String> getPackageList() { return null; }

    public static class Header {
        private int mBucketOffset;
        private java.lang.String mContainer;
        private int mFileSize;
        private android.internal.aconfig.storage.FileType mFileType;
        private int mNodeOffset;
        private int mNumPackages;
        private int mVersion;
        public Header() {}
        private static android.internal.aconfig.storage.PackageTable.Header fromBytes(android.internal.aconfig.storage.ByteBufferReader p0) { return null; }
        public int getBucketOffset() { return 0; }
        public java.lang.String getContainer() { return null; }
        public int getFileSize() { return 0; }
        public android.internal.aconfig.storage.FileType getFileType() { return null; }
        public int getNodeOffset() { return 0; }
        public int getNumPackages() { return 0; }
        public int getVersion() { return 0; }
    }

    public static class Node {
        private int mBooleanStartIndex;
        private boolean mHasPackageFingerprint;
        private boolean mHasRedactExportedReads;
        private int mNextOffset;
        private long mPackageFingerprint;
        private int mPackageId;
        private java.lang.String mPackageName;
        private boolean mRedactExportedReads;
        public Node() {}
        private static android.internal.aconfig.storage.PackageTable.Node fromBytes(android.internal.aconfig.storage.ByteBufferReader p0, int p1) { return null; }
        private static android.internal.aconfig.storage.PackageTable.Node fromBytesV1(android.internal.aconfig.storage.ByteBufferReader p0) { return null; }
        private static android.internal.aconfig.storage.PackageTable.Node fromBytesV2(android.internal.aconfig.storage.ByteBufferReader p0) { return null; }
        private static android.internal.aconfig.storage.PackageTable.Node fromBytesV3(android.internal.aconfig.storage.ByteBufferReader p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getBooleanStartIndex() { return 0; }
        public int getNextOffset() { return 0; }
        public long getPackageFingerprint() { return 0L; }
        public int getPackageId() { return 0; }
        public java.lang.String getPackageName() { return null; }
        public boolean getRedactExportedReads() { return false; }
        public boolean hasPackageFingerprint() { return false; }
        public boolean hasRedactExportedReads() { return false; }
        public int hashCode() { return 0; }
    }
}
