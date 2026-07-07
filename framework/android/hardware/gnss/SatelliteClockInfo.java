package android.hardware.gnss;

public class SatelliteClockInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.gnss.SatelliteClockInfo> CREATOR = null;
    public double satClkDriftMps;
    public double satHardwareCodeBiasMeters;
    public double satTimeCorrectionMeters;
    public SatelliteClockInfo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
