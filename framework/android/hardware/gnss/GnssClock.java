package android.hardware.gnss;

public class GnssClock implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.gnss.GnssClock> CREATOR = null;
    public static final int HAS_BIAS = 8;
    public static final int HAS_BIAS_UNCERTAINTY = 16;
    public static final int HAS_DRIFT = 32;
    public static final int HAS_DRIFT_UNCERTAINTY = 64;
    public static final int HAS_FULL_BIAS = 4;
    public static final int HAS_LEAP_SECOND = 1;
    public static final int HAS_TIME_UNCERTAINTY = 2;
    public double biasNs;
    public double biasUncertaintyNs;
    public double driftNsps;
    public double driftUncertaintyNsps;
    public long fullBiasNs;
    public int gnssClockFlags;
    public int hwClockDiscontinuityCount;
    public int leapSecond;
    public android.hardware.gnss.GnssSignalType referenceSignalTypeForIsb;
    public long timeNs;
    public double timeUncertaintyNs;
    public GnssClock() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
