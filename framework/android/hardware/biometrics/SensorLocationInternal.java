package android.hardware.biometrics;

public class SensorLocationInternal implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.SensorLocationInternal> CREATOR = null;
    public static final android.hardware.biometrics.SensorLocationInternal DEFAULT = null;
    public final java.lang.String displayId = null;
    public final android.hardware.biometrics.fingerprint.SensorLocationData sensorLocationData = null;
    public final int sensorLocationX = 0;
    public final int sensorLocationY = 0;
    public final int sensorRadius = 0;
    protected SensorLocationInternal(android.os.Parcel p0) {}
    public SensorLocationInternal(java.lang.String p0, int p1, int p2, int p3) {}
    public SensorLocationInternal(java.lang.String p0, int p1, int p2, int p3, android.hardware.biometrics.fingerprint.SensorLocationData p4) {}
    public int describeContents() { return 0; }
    public byte getPhysicalSensorLocation() { return 0; }
    public android.graphics.Rect getRect() { return null; }
    public byte getStandalonePhysicalLocation() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
