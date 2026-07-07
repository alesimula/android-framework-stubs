package android.hardware.biometrics.events;

public final class AuthenticationErrorInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.events.AuthenticationErrorInfo> CREATOR = null;
    private final android.hardware.biometrics.BiometricSourceType mBiometricSourceType = null;
    private final int mErrCode = 0;
    private final java.lang.String mErrString = null;
    private final int mRequestReason = 0;
    AuthenticationErrorInfo(android.hardware.biometrics.BiometricSourceType p0, int p1, java.lang.String p2, int p3) {}
    AuthenticationErrorInfo(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.hardware.biometrics.BiometricSourceType getBiometricSourceType() { return null; }
    public int getErrCode() { return 0; }
    public java.lang.String getErrString() { return null; }
    public int getRequestReason() { return 0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.hardware.biometrics.BiometricSourceType mBiometricSourceType;
        private long mBuilderFieldsSet;
        private int mErrCode;
        private java.lang.String mErrString;
        private int mRequestReason;
        public Builder(android.hardware.biometrics.BiometricSourceType p0, int p1, java.lang.String p2, int p3) {}
        private void checkNotUsed() {}
        public android.hardware.biometrics.events.AuthenticationErrorInfo build() { return null; }
        public android.hardware.biometrics.events.AuthenticationErrorInfo.Builder setBiometricSourceType(android.hardware.biometrics.BiometricSourceType p0) { return null; }
        public android.hardware.biometrics.events.AuthenticationErrorInfo.Builder setErrCode(int p0) { return null; }
        public android.hardware.biometrics.events.AuthenticationErrorInfo.Builder setErrString(java.lang.String p0) { return null; }
        public android.hardware.biometrics.events.AuthenticationErrorInfo.Builder setRequestReason(int p0) { return null; }
    }
}
