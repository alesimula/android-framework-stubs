package android.frameworks.location.altitude;

public class AddMslAltitudeToLocationResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.frameworks.location.altitude.AddMslAltitudeToLocationResponse> CREATOR = null;
    public float mslAltitudeAccuracyMeters;
    public double mslAltitudeMeters;
    public boolean success;
    public AddMslAltitudeToLocationResponse() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
