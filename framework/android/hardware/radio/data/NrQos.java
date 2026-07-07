package android.hardware.radio.data;

public class NrQos implements android.os.Parcelable {
    public static final int AVERAGING_WINDOW_UNKNOWN = -1;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.NrQos> CREATOR = null;
    public static final byte FLOW_ID_RANGE_MAX = 63;
    public static final byte FLOW_ID_RANGE_MIN = 1;
    public int averagingWindowMillis;
    @java.lang.Deprecated
    public char averagingWindowMs;
    public android.hardware.radio.data.QosBandwidth downlink;
    public int fiveQi;
    public byte qfi;
    public android.hardware.radio.data.QosBandwidth uplink;
    public NrQos() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
