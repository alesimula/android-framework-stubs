package android.hardware.biometrics.fingerprint.location;

public class UnderDisplayLocation implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.location.UnderDisplayLocation> CREATOR = null;
    public int sensorLocationXPixels;
    public int sensorLocationYPixels;
    public int sensorRadiusPixels;
    public UnderDisplayLocation() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
