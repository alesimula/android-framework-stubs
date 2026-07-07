package android.hardware.biometrics.fingerprint.location;

public class StandaloneLocation implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.location.StandaloneLocation> CREATOR = null;
    public byte location;
    public StandaloneLocation() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
