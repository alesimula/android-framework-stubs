package android.frameworks.location.altitude;

public class AddMslAltitudeToLocationRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.frameworks.location.altitude.AddMslAltitudeToLocationRequest> CREATOR = null;
    public double altitudeMeters;
    public double latitudeDegrees;
    public double longitudeDegrees;
    public float verticalAccuracyMeters;
    public AddMslAltitudeToLocationRequest() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
