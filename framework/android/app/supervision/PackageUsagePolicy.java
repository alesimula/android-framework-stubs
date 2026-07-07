package android.app.supervision;

@android.annotation.SystemApi
public final class PackageUsagePolicy extends android.app.supervision.Policy {
    public static final android.os.Parcelable.Creator<android.app.supervision.PackageUsagePolicy> CREATOR = null;
    public static final int TYPE_ALLOWED = 0;
    public static final int TYPE_BLOCKED = 1;
    public static final int TYPE_TIME_LIMIT = 2;
    private final java.lang.String mPackageName = null;
    private final java.time.Duration mTimeLimit = null;
    private final int mType = 0;
    private PackageUsagePolicy(long p0, java.lang.String p1, int p2, java.time.Duration p3) { super(0L); }
    PackageUsagePolicy(android.os.Parcel p0) { super(0L); }
    public static boolean isTypeValid(int p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getPackageName() { return null; }
    public android.app.supervision.PolicyKey getPolicyKey() { return null; }
    public java.time.Duration getTimeLimit() { return null; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public android.app.supervision.PackageUsagePolicy.Builder toBuilder() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder extends android.app.supervision.Policy.Builder<android.app.supervision.PackageUsagePolicy, android.app.supervision.PackageUsagePolicy.Builder> {
        private java.lang.String mPackageName;
        private java.time.Duration mTimeLimit;
        private int mType;
        public Builder(android.app.supervision.PackageUsagePolicy p0) { super(); }
        public Builder(java.lang.String p0, int p1) { super(); }
        android.app.supervision.PackageUsagePolicy performBuild() { return null; }
        public android.app.supervision.PackageUsagePolicy.Builder setPackageName(java.lang.String p0) { return null; }
        public android.app.supervision.PackageUsagePolicy.Builder setTimeLimit(java.time.Duration p0) { return null; }
        public android.app.supervision.PackageUsagePolicy.Builder setType(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
