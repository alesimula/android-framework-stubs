package android.hardware.thermal;

public class CoolingDevice implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.thermal.CoolingDevice> CREATOR = null;
    public java.lang.String name;
    public long powerLimitMw;
    public long powerMw;
    public long timeWindowMs;
    public int type;
    public long value;
    public CoolingDevice() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
