package android.app.privatecompute;

@android.annotation.SystemApi
public final class AuditLogMetadata implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.privatecompute.AuditLogMetadata> CREATOR = null;
    private final long mDatabaseSizeBytes = 0L;
    private final long mLastAuditTimestampMillis = 0L;
    private AuditLogMetadata(android.app.privatecompute.AuditLogMetadata.Builder p0) {}
    private AuditLogMetadata(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getDatabaseSizeBytes() { return 0L; }
    public long getLastAuditTimestampMillis() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private long mDatabaseSizeBytes;
        private long mLastAuditTimestampMillis;
        public Builder() {}
        public android.app.privatecompute.AuditLogMetadata build() { return null; }
        public android.app.privatecompute.AuditLogMetadata.Builder setDatabaseSizeBytes(long p0) { return null; }
        public android.app.privatecompute.AuditLogMetadata.Builder setLastAuditTimestampMillis(long p0) { return null; }
    }
}
