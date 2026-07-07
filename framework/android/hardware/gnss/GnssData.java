package android.hardware.gnss;

public class GnssData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.gnss.GnssData> CREATOR = null;
    public android.hardware.gnss.GnssClock clock;
    public android.hardware.gnss.ElapsedRealtime elapsedRealtime;
    public android.hardware.gnss.GnssData.GnssAgc[] gnssAgcs;
    public android.hardware.gnss.GnssMeasurement[] measurements;
    public GnssData() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class GnssAgc implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.gnss.GnssData.GnssAgc> CREATOR = null;
        public double agcLevelDb;
        public long carrierFrequencyHz;
        public int constellation;
        public GnssAgc() {}
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
