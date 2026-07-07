package android.hardware.gnss.V1_0;

public final class GnssLocation {
    public double altitudeMeters;
    public float bearingAccuracyDegrees;
    public float bearingDegrees;
    public short gnssLocationFlags;
    public float horizontalAccuracyMeters;
    public double latitudeDegrees;
    public double longitudeDegrees;
    public float speedAccuracyMetersPerSecond;
    public float speedMetersPerSec;
    public long timestamp;
    public float verticalAccuracyMeters;
    public GnssLocation() {}
    public static final java.util.ArrayList<android.hardware.gnss.V1_0.GnssLocation> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.gnss.V1_0.GnssLocation> p1) {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void readFromParcel(android.os.HwParcel p0) {}
    public final java.lang.String toString() { return null; }
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
}
