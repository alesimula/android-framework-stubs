package android.hardware.biometrics.events;

public final class AuthenticationStartedInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.events.AuthenticationStartedInfo> CREATOR = null;
    private final android.hardware.biometrics.BiometricSourceType mBiometricSourceType = null;
    private final int mRequestReason = 0;
    AuthenticationStartedInfo(android.hardware.biometrics.BiometricSourceType p0, int p1) {}
    AuthenticationStartedInfo(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.hardware.biometrics.BiometricSourceType getBiometricSourceType() { return null; }
    public int getRequestReason() { return 0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.hardware.biometrics.BiometricSourceType mBiometricSourceType;
        private long mBuilderFieldsSet;
        private int mRequestReason;
        public Builder(android.hardware.biometrics.BiometricSourceType p0, int p1) {}
        private void checkNotUsed() {}
        public android.hardware.biometrics.events.AuthenticationStartedInfo build() { return null; }
        public android.hardware.biometrics.events.AuthenticationStartedInfo.Builder setBiometricSourceType(android.hardware.biometrics.BiometricSourceType p0) { return null; }
        public android.hardware.biometrics.events.AuthenticationStartedInfo.Builder setRequestReason(int p0) { return null; }
    }
}
