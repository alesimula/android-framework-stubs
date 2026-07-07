package android.hardware.gnss.measurement_corrections;

public class ReflectingPlane implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.gnss.measurement_corrections.ReflectingPlane> CREATOR = null;
    public double altitudeMeters;
    public double latitudeDegrees;
    public double longitudeDegrees;
    public double reflectingPlaneAzimuthDegrees;
    public ReflectingPlane() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
