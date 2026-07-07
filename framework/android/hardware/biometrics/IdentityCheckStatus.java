package android.hardware.biometrics;

public final class IdentityCheckStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.IdentityCheckStatus> CREATOR = null;
    private final boolean mIsIdentityCheckActive = false;
    private final boolean mIsIdentityCheckValueForTestAvailable = false;
    private IdentityCheckStatus(android.os.Parcel p0) {}
    private IdentityCheckStatus(boolean p0, boolean p1) {}
    public int describeContents() { return 0; }
    public boolean isIdentityCheckActive() { return false; }
    public boolean isIdentityCheckValueForTestAvailable() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mIsIdentityCheckActive;
        private boolean mIsIdentityCheckValueForTestAvailable;
        public Builder() {}
        public android.hardware.biometrics.IdentityCheckStatus build() { return null; }
        public android.hardware.biometrics.IdentityCheckStatus.Builder setIdentityCheckActive(boolean p0) { return null; }
        public android.hardware.biometrics.IdentityCheckStatus.Builder setIdentityCheckValueForTestAvailable(boolean p0) { return null; }
    }
}
