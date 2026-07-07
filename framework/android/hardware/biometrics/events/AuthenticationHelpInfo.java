package android.hardware.biometrics.events;

public final class AuthenticationHelpInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.events.AuthenticationHelpInfo> CREATOR = null;
    private final android.hardware.biometrics.BiometricSourceType mBiometricSourceType = null;
    private final int mHelpCode = 0;
    private final java.lang.String mHelpString = null;
    private final int mRequestReason = 0;
    AuthenticationHelpInfo(android.hardware.biometrics.BiometricSourceType p0, int p1, java.lang.String p2, int p3) {}
    AuthenticationHelpInfo(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.hardware.biometrics.BiometricSourceType getBiometricSourceType() { return null; }
    public int getHelpCode() { return 0; }
    public java.lang.String getHelpString() { return null; }
    public int getRequestReason() { return 0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.hardware.biometrics.BiometricSourceType mBiometricSourceType;
        private long mBuilderFieldsSet;
        private int mHelpCode;
        private java.lang.String mHelpString;
        private int mRequestReason;
        public Builder(android.hardware.biometrics.BiometricSourceType p0, int p1, java.lang.String p2, int p3) {}
        private void checkNotUsed() {}
        public android.hardware.biometrics.events.AuthenticationHelpInfo build() { return null; }
        public android.hardware.biometrics.events.AuthenticationHelpInfo.Builder setBiometricSourceType(android.hardware.biometrics.BiometricSourceType p0) { return null; }
        public android.hardware.biometrics.events.AuthenticationHelpInfo.Builder setHelpCode(int p0) { return null; }
        public android.hardware.biometrics.events.AuthenticationHelpInfo.Builder setHelpString(java.lang.String p0) { return null; }
        public android.hardware.biometrics.events.AuthenticationHelpInfo.Builder setRequestReason(int p0) { return null; }
    }
}
