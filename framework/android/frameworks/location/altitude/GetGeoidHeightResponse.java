package android.frameworks.location.altitude;

public class GetGeoidHeightResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.frameworks.location.altitude.GetGeoidHeightResponse> CREATOR = null;
    public float additionalGeoidHeightErrorMeters;
    public double expirationDistanceMeters;
    public float geoidHeightErrorMeters;
    public double geoidHeightMeters;
    public boolean success;
    public GetGeoidHeightResponse() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
