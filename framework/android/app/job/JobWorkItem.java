package android.app.job;

public final class JobWorkItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.job.JobWorkItem> CREATOR = null;
    public static final int SIZE_BYTES_UNKNOWN = -1;
    int mDeliveryCount;
    private int mEstimatedSizeBytes;
    private final android.os.PersistableBundle mExtras = null;
    java.lang.Object mGrants;
    final android.content.Intent mIntent = null;
    private final long mMinimumChunkBytes = 0L;
    private final long mNetworkDownloadBytes = 0L;
    private final long mNetworkUploadBytes = 0L;
    int mWorkId;
    private JobWorkItem(android.app.job.JobWorkItem.Builder p0) {}
    public JobWorkItem(android.content.Intent p0) {}
    public JobWorkItem(android.content.Intent p0, long p1, long p2) {}
    public JobWorkItem(android.content.Intent p0, long p1, long p2, long p3) {}
    JobWorkItem(android.os.Parcel p0) {}
    public void bumpDeliveryCount() {}
    public int describeContents() { return 0; }
    public void enforceValidity(boolean p0) {}
    public int getDeliveryCount() { return 0; }
    public long getEstimatedNetworkDownloadBytes() { return 0L; }
    public long getEstimatedNetworkUploadBytes() { return 0L; }
    public int getEstimatedSizeBytes() { return 0; }
    public android.os.PersistableBundle getExtras() { return null; }
    public java.lang.Object getGrants() { return null; }
    public android.content.Intent getIntent() { return null; }
    public long getMinimumNetworkChunkBytes() { return 0L; }
    public int getWorkId() { return 0; }
    public void setGrants(java.lang.Object p0) {}
    public void setWorkId(int p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mDeliveryCount;
        private int mEstimatedSizeBytes;
        private android.os.PersistableBundle mExtras;
        private android.content.Intent mIntent;
        private long mMinimumNetworkChunkBytes;
        private long mNetworkDownloadBytes;
        private long mNetworkUploadBytes;
        public Builder() {}
        public android.app.job.JobWorkItem build() { return null; }
        public android.app.job.JobWorkItem build(boolean p0) { return null; }
        public android.app.job.JobWorkItem.Builder setDeliveryCount(int p0) { return null; }
        public android.app.job.JobWorkItem.Builder setEstimatedNetworkBytes(long p0, long p1) { return null; }
        public android.app.job.JobWorkItem.Builder setEstimatedSizeBytes(int p0) { return null; }
        public android.app.job.JobWorkItem.Builder setExtras(android.os.PersistableBundle p0) { return null; }
        public android.app.job.JobWorkItem.Builder setIntent(android.content.Intent p0) { return null; }
        public android.app.job.JobWorkItem.Builder setMinimumNetworkChunkBytes(long p0) { return null; }
    }
}
