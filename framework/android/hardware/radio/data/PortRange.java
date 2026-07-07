package android.hardware.radio.data;

public class PortRange implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.PortRange> CREATOR = null;
    public static final int PORT_RANGE_MAX = 65535;
    public static final int PORT_RANGE_MIN = 20;
    public int end;
    public int start;
    public PortRange() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
