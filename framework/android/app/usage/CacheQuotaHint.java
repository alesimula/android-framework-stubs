package android.app.usage;

@android.annotation.SystemApi
public final class CacheQuotaHint implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.usage.CacheQuotaHint> CREATOR = null;
    public static final long QUOTA_NOT_SET = -1L;
    private final long mQuota = 0L;
    private final int mUid = 0;
    private final android.app.usage.UsageStats mUsageStats = null;
    private final java.lang.String mUuid = null;
    public CacheQuotaHint(android.app.usage.CacheQuotaHint.Builder p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getQuota() { return 0L; }
    public int getUid() { return 0; }
    public android.app.usage.UsageStats getUsageStats() { return null; }
    public java.lang.String getVolumeUuid() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mQuota;
        private int mUid;
        private android.app.usage.UsageStats mUsageStats;
        private java.lang.String mUuid;
        public Builder() {}
        public Builder(android.app.usage.CacheQuotaHint p0) {}
        public android.app.usage.CacheQuotaHint build() { return null; }
        public android.app.usage.CacheQuotaHint.Builder setQuota(long p0) { return null; }
        public android.app.usage.CacheQuotaHint.Builder setUid(int p0) { return null; }
        public android.app.usage.CacheQuotaHint.Builder setUsageStats(android.app.usage.UsageStats p0) { return null; }
        public android.app.usage.CacheQuotaHint.Builder setVolumeUuid(java.lang.String p0) { return null; }
    }
}
