package android.hardware.biometrics.fingerprint;

public class SensorLocation implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.SensorLocation> CREATOR = null;
    public java.lang.String display;
    @java.lang.Deprecated
    public int displayId;
    public android.hardware.biometrics.fingerprint.SensorLocationData sensorLocationData;
    @java.lang.Deprecated
    public int sensorLocationX;
    @java.lang.Deprecated
    public int sensorLocationY;
    @java.lang.Deprecated
    public int sensorRadius;
    public byte sensorShape;
    public SensorLocation() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
