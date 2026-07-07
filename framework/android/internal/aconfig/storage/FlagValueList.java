package android.internal.aconfig.storage;

public class FlagValueList {
    private android.internal.aconfig.storage.FlagValueList.Header mHeader;
    private android.internal.aconfig.storage.ByteBufferReader mReader;
    public FlagValueList() {}
    public static android.internal.aconfig.storage.FlagValueList fromBytes(java.nio.ByteBuffer p0) { return null; }
    public boolean getBoolean(int p0) { return false; }
    public android.internal.aconfig.storage.FlagValueList.Header getHeader() { return null; }
    public int size() { return 0; }

    public static class Header {
        private int mBooleanValueOffset;
        private java.lang.String mContainer;
        private int mFileSize;
        private android.internal.aconfig.storage.FileType mFileType;
        private int mNumFlags;
        private int mVersion;
        public Header() {}
        public static android.internal.aconfig.storage.FlagValueList.Header fromBytes(android.internal.aconfig.storage.ByteBufferReader p0) { return null; }
        public int getBooleanValueOffset() { return 0; }
        public java.lang.String getContainer() { return null; }
        public int getFileSize() { return 0; }
        public android.internal.aconfig.storage.FileType getFileType() { return null; }
        public int getNumFlags() { return 0; }
        public int getVersion() { return 0; }
    }
}
