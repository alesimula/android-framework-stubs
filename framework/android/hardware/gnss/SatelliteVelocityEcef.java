package android.hardware.gnss;

public class SatelliteVelocityEcef implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.gnss.SatelliteVelocityEcef> CREATOR = null;
    public double ureRateMps;
    public double velXMps;
    public double velYMps;
    public double velZMps;
    public SatelliteVelocityEcef() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
