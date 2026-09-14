package android.app.admin.dataleakprevention.reporting;

public final class FileItem implements android.app.admin.dataleakprevention.reporting.DataTransferItem {
    private final java.lang.String mMimeType = null;
    private final byte[] mSha256Hash = null;
    private final long mSizeBytes = 0L;
    private final android.net.Uri mUri = null;
    private FileItem(android.app.admin.dataleakprevention.reporting.FileItem.Builder p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getMimeType() { return null; }
    public byte[] getSha256Hash() { return null; }
    public long getSizeBytes() { return 0L; }
    public android.net.Uri getUri() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private java.lang.String mMimeType;
        private byte[] mSha256Hash;
        private long mSizeBytes;
        private android.net.Uri mUri;
        public Builder() {}
        public android.app.admin.dataleakprevention.reporting.FileItem build() { return null; }
        public android.app.admin.dataleakprevention.reporting.FileItem.Builder setMimeType(java.lang.String p0) { return null; }
        public android.app.admin.dataleakprevention.reporting.FileItem.Builder setSha256Hash(byte[] p0) { return null; }
        public android.app.admin.dataleakprevention.reporting.FileItem.Builder setSizeBytes(long p0) { return null; }
        public android.app.admin.dataleakprevention.reporting.FileItem.Builder setUri(android.net.Uri p0) { return null; }
    }
}
