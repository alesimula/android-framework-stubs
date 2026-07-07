package android.hardware.gnss;

public class ElapsedRealtime implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.gnss.ElapsedRealtime> CREATOR = null;
    public static final int HAS_TIMESTAMP_NS = 1;
    public static final int HAS_TIME_UNCERTAINTY_NS = 2;
    public int flags;
    public double timeUncertaintyNs;
    public long timestampNs;
    public ElapsedRealtime() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
