package android.app.admin.dataleakprevention.reporting;

public final class PlainTextItem implements android.app.admin.dataleakprevention.reporting.DataTransferItem {
    private final boolean mSensitive = false;
    private final byte[] mSha256Hash = null;
    private final long mSizeBytes = 0L;
    private PlainTextItem(android.app.admin.dataleakprevention.reporting.PlainTextItem.Builder p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public byte[] getSha256Hash() { return null; }
    public long getSizeBytes() { return 0L; }
    public int hashCode() { return 0; }
    public boolean isSensitive() { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private boolean mSensitive;
        private byte[] mSha256Hash;
        private long mSizeBytes;
        public Builder() {}
        public android.app.admin.dataleakprevention.reporting.PlainTextItem build() { return null; }
        public android.app.admin.dataleakprevention.reporting.PlainTextItem.Builder setSensitive(boolean p0) { return null; }
        public android.app.admin.dataleakprevention.reporting.PlainTextItem.Builder setSha256Hash(byte[] p0) { return null; }
        public android.app.admin.dataleakprevention.reporting.PlainTextItem.Builder setSizeBytes(long p0) { return null; }
    }
}
