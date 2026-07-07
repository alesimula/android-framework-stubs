package android.hardware.biometrics.events;

public final class AuthenticationSucceededInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.events.AuthenticationSucceededInfo> CREATOR = null;
    private final android.hardware.biometrics.BiometricSourceType mBiometricSourceType = null;
    private final boolean mIsStrongBiometric = false;
    private final int mRequestReason = 0;
    private final int mUserId = 0;
    AuthenticationSucceededInfo(android.hardware.biometrics.BiometricSourceType p0, int p1, boolean p2, int p3) {}
    AuthenticationSucceededInfo(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.hardware.biometrics.BiometricSourceType getBiometricSourceType() { return null; }
    public int getRequestReason() { return 0; }
    public int getUserId() { return 0; }
    public int hashCode() { return 0; }
    public boolean isIsStrongBiometric() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.hardware.biometrics.BiometricSourceType mBiometricSourceType;
        private long mBuilderFieldsSet;
        private boolean mIsStrongBiometric;
        private int mRequestReason;
        private int mUserId;
        public Builder(android.hardware.biometrics.BiometricSourceType p0, int p1, boolean p2, int p3) {}
        private void checkNotUsed() {}
        public android.hardware.biometrics.events.AuthenticationSucceededInfo build() { return null; }
        public android.hardware.biometrics.events.AuthenticationSucceededInfo.Builder setBiometricSourceType(android.hardware.biometrics.BiometricSourceType p0) { return null; }
        public android.hardware.biometrics.events.AuthenticationSucceededInfo.Builder setIsStrongBiometric(boolean p0) { return null; }
        public android.hardware.biometrics.events.AuthenticationSucceededInfo.Builder setRequestReason(int p0) { return null; }
        public android.hardware.biometrics.events.AuthenticationSucceededInfo.Builder setUserId(int p0) { return null; }
    }
}
