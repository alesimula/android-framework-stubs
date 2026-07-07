package android.hardware.fingerprint;

public final class FingerprintAuthenticateOptions implements android.hardware.biometrics.AuthenticateOptions, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.fingerprint.FingerprintAuthenticateOptions> CREATOR = null;
    private java.lang.String mAttributionTag;
    private final int mDisplayState = 0;
    private final boolean mIgnoreEnrollmentState = false;
    private boolean mIsMandatoryBiometrics;
    private java.lang.String mOpPackageName;
    private int mSensorId;
    private final int mUserId = 0;
    private android.hardware.biometrics.common.AuthenticateReason.Vendor mVendorReason;
    FingerprintAuthenticateOptions(int p0, int p1, boolean p2, int p3, java.lang.String p4, java.lang.String p5, android.hardware.biometrics.common.AuthenticateReason.Vendor p6, boolean p7) {}
    FingerprintAuthenticateOptions(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static java.lang.String defaultAttributionTag() { return null; }
    private static int defaultDisplayState() { return 0; }
    private static boolean defaultIgnoreEnrollmentState() { return false; }
    private static java.lang.String defaultOpPackageName() { return null; }
    private static int defaultSensorId() { return 0; }
    private static int defaultUserId() { return 0; }
    private static android.hardware.biometrics.common.AuthenticateReason.Vendor defaultVendorReason() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getAttributionTag() { return null; }
    public int getDisplayState() { return 0; }
    public java.lang.String getOpPackageName() { return null; }
    public int getSensorId() { return 0; }
    public int getUserId() { return 0; }
    public android.hardware.biometrics.common.AuthenticateReason.Vendor getVendorReason() { return null; }
    public int hashCode() { return 0; }
    public boolean isIgnoreEnrollmentState() { return false; }
    public boolean isMandatoryBiometrics() { return false; }
    public android.hardware.fingerprint.FingerprintAuthenticateOptions setAttributionTag(java.lang.String p0) { return null; }
    public android.hardware.fingerprint.FingerprintAuthenticateOptions setIsMandatoryBiometrics(boolean p0) { return null; }
    public android.hardware.fingerprint.FingerprintAuthenticateOptions setOpPackageName(java.lang.String p0) { return null; }
    public android.hardware.fingerprint.FingerprintAuthenticateOptions setSensorId(int p0) { return null; }
    public android.hardware.fingerprint.FingerprintAuthenticateOptions setVendorReason(android.hardware.biometrics.common.AuthenticateReason.Vendor p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mAttributionTag;
        private long mBuilderFieldsSet;
        private int mDisplayState;
        private boolean mIgnoreEnrollmentState;
        private boolean mIsMandatoryBiometrics;
        private java.lang.String mOpPackageName;
        private int mSensorId;
        private int mUserId;
        private android.hardware.biometrics.common.AuthenticateReason.Vendor mVendorReason;
        public Builder() {}
        private void checkNotUsed() {}
        public android.hardware.fingerprint.FingerprintAuthenticateOptions build() { return null; }
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setAttributionTag(java.lang.String p0) { return null; }
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setDisplayState(int p0) { return null; }
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setIgnoreEnrollmentState(boolean p0) { return null; }
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setIsMandatoryBiometrics(boolean p0) { return null; }
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setOpPackageName(java.lang.String p0) { return null; }
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setSensorId(int p0) { return null; }
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setUserId(int p0) { return null; }
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setVendorReason(android.hardware.biometrics.common.AuthenticateReason.Vendor p0) { return null; }
    }
}
