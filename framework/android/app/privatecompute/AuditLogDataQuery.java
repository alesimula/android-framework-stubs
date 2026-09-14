package android.app.privatecompute;

@android.annotation.SystemApi
public final class AuditLogDataQuery implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.privatecompute.AuditLogDataQuery> CREATOR = null;
    static final java.lang.String DEFAULT_AUDITED_PACKAGE_NAME = null;
    static final int DEFAULT_FEATURE = 0;
    @android.annotation.SystemApi
    public static final int DEFAULT_MAX_NUMBER_OF_ENTRIES = 500;
    private final java.lang.String mAuditedPackageName = null;
    private final int mFeature = 0;
    private final boolean mHasFeature = false;
    private final int mMaxNumberOfEntries = 0;
    private final java.lang.String mPaginationToken = null;
    private AuditLogDataQuery(android.app.privatecompute.AuditLogDataQuery.Builder p0) {}
    private AuditLogDataQuery(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    @android.annotation.SystemApi
    public java.lang.String getAuditedPackageName() { return null; }
    @android.annotation.SystemApi
    public int getFeature() { return 0; }
    @android.annotation.SystemApi
    public int getMaxNumberOfEntries() { return 0; }
    @android.annotation.SystemApi
    public java.lang.String getPaginationToken() { return null; }
    @android.annotation.SystemApi
    public boolean hasFeature() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private java.lang.String mAuditedPackageName;
        private int mFeature;
        private boolean mHasFeature;
        private int mMaxNumberOfEntries;
        private java.lang.String mPaginationToken;
        public Builder() {}
        public android.app.privatecompute.AuditLogDataQuery build() { return null; }
        public android.app.privatecompute.AuditLogDataQuery.Builder clearFeature() { return null; }
        public android.app.privatecompute.AuditLogDataQuery.Builder setAuditedPackageName(java.lang.String p0) { return null; }
        public android.app.privatecompute.AuditLogDataQuery.Builder setFeature(int p0) { return null; }
        public android.app.privatecompute.AuditLogDataQuery.Builder setMaxNumberOfEntries(int p0) { return null; }
        public android.app.privatecompute.AuditLogDataQuery.Builder setPaginationToken(java.lang.String p0) { return null; }
    }
}
