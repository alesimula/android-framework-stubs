package android.internal.aconfig.storage;

public class FlagTable {
    private java.nio.ByteBuffer mBuffer;
    private android.internal.aconfig.storage.FlagTable.Header mHeader;
    public FlagTable() {}
    public static android.internal.aconfig.storage.FlagTable fromBytes(java.nio.ByteBuffer p0) { return null; }
    private static byte[] makeKey(int p0, java.lang.String p1) { return null; }
    public android.internal.aconfig.storage.FlagTable.Node get(int p0, java.lang.String p1) { return null; }
    public android.internal.aconfig.storage.FlagTable.Header getHeader() { return null; }

    public static class Header {
        private int mBucketOffset;
        private java.lang.String mContainer;
        private int mFileSize;
        private android.internal.aconfig.storage.FileType mFileType;
        private int mNodeOffset;
        private int mNumFlags;
        private int mVersion;
        public Header() {}
        public static android.internal.aconfig.storage.FlagTable.Header fromBytes(android.internal.aconfig.storage.ByteBufferReader p0) { return null; }
        public int getBucketOffset() { return 0; }
        public java.lang.String getContainer() { return null; }
        public int getFileSize() { return 0; }
        public android.internal.aconfig.storage.FileType getFileType() { return null; }
        public int getNodeOffset() { return 0; }
        public int getNumFlags() { return 0; }
        public int getVersion() { return 0; }
    }

    public static class Node {
        private int mFlagIndex;
        private java.lang.String mFlagName;
        private android.internal.aconfig.storage.FlagType mFlagType;
        private int mNextOffset;
        private int mPackageId;
        public Node() {}
        public static android.internal.aconfig.storage.FlagTable.Node fromBytes(android.internal.aconfig.storage.ByteBufferReader p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getFlagIndex() { return 0; }
        public java.lang.String getFlagName() { return null; }
        public android.internal.aconfig.storage.FlagType getFlagType() { return null; }
        public int getNextOffset() { return 0; }
        public int getPackageId() { return 0; }
        public int hashCode() { return 0; }
    }
}
