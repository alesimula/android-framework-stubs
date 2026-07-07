package android.content.pm.verify.developer;

@android.annotation.SystemApi
public final class DeveloperVerificationStatus implements android.os.Parcelable {
    public static final int APP_METADATA_VERIFICATION_STATUS_BAD = 2;
    public static final int APP_METADATA_VERIFICATION_STATUS_GOOD = 1;
    public static final int APP_METADATA_VERIFICATION_STATUS_UNDEFINED = 0;
    public static final android.os.Parcelable.Creator<android.content.pm.verify.developer.DeveloperVerificationStatus> CREATOR = null;
    private final int mAppMetadataVerificationStatus = 0;
    private final java.lang.String mFailuresMessage = null;
    private final boolean mIsLiteVerification = false;
    private final boolean mIsVerified = false;
    private DeveloperVerificationStatus(android.os.Parcel p0) {}
    private DeveloperVerificationStatus(boolean p0, boolean p1, int p2, java.lang.String p3) {}
    public int describeContents() { return 0; }
    public int getAppMetadataVerificationStatus() { return 0; }
    public java.lang.String getFailureMessage() { return null; }
    public boolean isLiteVerification() { return false; }
    public boolean isVerified() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppMetadataVerificationStatus {
    }

    public static final class Builder {
        private int mAppMetadataVerificationStatus;
        private java.lang.String mFailuresMessage;
        private boolean mIsLiteVerification;
        private boolean mIsVerified;
        public Builder() {}
        public android.content.pm.verify.developer.DeveloperVerificationStatus build() { return null; }
        public android.content.pm.verify.developer.DeveloperVerificationStatus.Builder setAppMetadataVerificationStatus(int p0) { return null; }
        public android.content.pm.verify.developer.DeveloperVerificationStatus.Builder setFailureMessage(java.lang.String p0) { return null; }
        public android.content.pm.verify.developer.DeveloperVerificationStatus.Builder setLiteVerification(boolean p0) { return null; }
        public android.content.pm.verify.developer.DeveloperVerificationStatus.Builder setVerified(boolean p0) { return null; }
    }
}
