package android.hardware.biometrics;

public enum BiometricSourceType implements android.os.Parcelable {
    FACE,
    FINGERPRINT,
    IRIS;
    private static final android.hardware.biometrics.BiometricSourceType[] $VALUES = null;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.BiometricSourceType> CREATOR = null;
    private BiometricSourceType() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
