package android.app.privatecompute;

@android.annotation.SystemApi
public final class AuditLogDataEntry implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.privatecompute.AuditLogDataEntry> CREATOR = null;
    public static final int ENTRY_TYPE_BINDER_TRANSACTION = 1;
    public static final int ENTRY_TYPE_PCC_GATEWAY_NETWORK = 2;
    public static final int ENTRY_TYPE_PROACTIVE_ASSISTANCE = 3;
    public static final int ENTRY_TYPE_UNKNOWN = 0;
    public static final int FEATURE_PROACTIVE_ASSISTANCE = 1;
    public static final int FEATURE_UNSET = 0;
    private final long mAuditTimestampMillis = 0L;
    private final java.lang.String mAuditedPackageName = null;
    private final java.lang.String mEgressPackageName = null;
    private final java.lang.String mEgressedQuery = null;
    private final int mEntryType = 0;
    private final int mFeature = 0;
    private final java.lang.String mGatewayPackageName = null;
    private final java.lang.String mPaginationToken = null;
    private final java.lang.String mProactiveAssistanceQueryTriggerPackageName = null;
    private final java.lang.String mResponse = null;
    private AuditLogDataEntry(android.app.privatecompute.AuditLogDataEntry.Builder p0) {}
    private AuditLogDataEntry(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getAuditTimestampMillis() { return 0L; }
    public java.lang.String getAuditedPackageName() { return null; }
    public java.lang.String getEgressPackageName() { return null; }
    public java.lang.String getEgressedQuery() { return null; }
    public int getEntryType() { return 0; }
    public int getFeature() { return 0; }
    public java.lang.String getGatewayPackageName() { return null; }
    public java.lang.String getPaginationToken() { return null; }
    public java.lang.String getProactiveAssistanceQueryTriggerPackageName() { return null; }
    public java.lang.String getResponse() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AuditFeature {
    }

    @android.annotation.SystemApi
    public static final class Builder {
        private long mAuditTimestampMillis;
        private java.lang.String mAuditedPackageName;
        private java.lang.String mEgressPackageName;
        private java.lang.String mEgressedQuery;
        private int mEntryType;
        private int mFeature;
        private java.lang.String mGatewayPackageName;
        private java.lang.String mPaginationToken;
        private java.lang.String mProactiveAssistanceQueryTriggerPackageName;
        private java.lang.String mResponse;
        public Builder() {}
        public android.app.privatecompute.AuditLogDataEntry build() { return null; }
        public android.app.privatecompute.AuditLogDataEntry.Builder setAuditTimestampMillis(long p0) { return null; }
        public android.app.privatecompute.AuditLogDataEntry.Builder setAuditedPackageName(java.lang.String p0) { return null; }
        public android.app.privatecompute.AuditLogDataEntry.Builder setEgressPackageName(java.lang.String p0) { return null; }
        public android.app.privatecompute.AuditLogDataEntry.Builder setEgressedQuery(java.lang.String p0) { return null; }
        public android.app.privatecompute.AuditLogDataEntry.Builder setEntryType(int p0) { return null; }
        public android.app.privatecompute.AuditLogDataEntry.Builder setFeature(int p0) { return null; }
        public android.app.privatecompute.AuditLogDataEntry.Builder setGatewayPackageName(java.lang.String p0) { return null; }
        public android.app.privatecompute.AuditLogDataEntry.Builder setPaginationToken(java.lang.String p0) { return null; }
        public android.app.privatecompute.AuditLogDataEntry.Builder setProactiveAssistanceQueryTriggerPackageName(java.lang.String p0) { return null; }
        public android.app.privatecompute.AuditLogDataEntry.Builder setResponse(java.lang.String p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EntryType {
    }
}
