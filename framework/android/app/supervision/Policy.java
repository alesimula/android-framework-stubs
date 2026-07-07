package android.app.supervision;

@android.annotation.SystemApi
public abstract class Policy implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.supervision.Policy> CREATOR = null;
    public static final java.lang.String PACKAGE_POLICY_IDENTIFIER = "package";
    private final long mVersion = 0L;
    Policy(long p0) {}
    Policy(android.os.Parcel p0) {}
    public java.lang.String getIdentifier() { return null; }
    public android.app.supervision.PolicyKey getPolicyKey() { return null; }
    public long getVersion() { return 0L; }
    public abstract android.app.supervision.Policy.Builder<? extends android.app.supervision.Policy, ?> toBuilder();
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static abstract class Builder<P extends android.app.supervision.Policy, B extends android.app.supervision.Policy.Builder<P, B>> {
        long mVersion;
        Builder() {}
        Builder(android.app.supervision.Policy p0) {}
        public P build() { return null; }
        abstract P performBuild();
        public B setVersion(long p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PolicyIdentifier {
    }
}
