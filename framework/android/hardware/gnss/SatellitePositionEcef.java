package android.hardware.gnss;

public class SatellitePositionEcef implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.gnss.SatellitePositionEcef> CREATOR = null;
    public double posXMeters;
    public double posYMeters;
    public double posZMeters;
    public double ureMeters;
    public SatellitePositionEcef() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
