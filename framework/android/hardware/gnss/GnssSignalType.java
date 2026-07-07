package android.hardware.gnss;

public class GnssSignalType implements android.os.Parcelable {
    public static final java.lang.String CODE_TYPE_A = "A";
    public static final java.lang.String CODE_TYPE_B = "B";
    public static final java.lang.String CODE_TYPE_C = "C";
    public static final java.lang.String CODE_TYPE_D = "D";
    public static final java.lang.String CODE_TYPE_I = "I";
    public static final java.lang.String CODE_TYPE_L = "L";
    public static final java.lang.String CODE_TYPE_M = "M";
    public static final java.lang.String CODE_TYPE_N = "N";
    public static final java.lang.String CODE_TYPE_P = "P";
    public static final java.lang.String CODE_TYPE_Q = "Q";
    public static final java.lang.String CODE_TYPE_S = "S";
    public static final java.lang.String CODE_TYPE_UNKNOWN = "UNKNOWN";
    public static final java.lang.String CODE_TYPE_W = "W";
    public static final java.lang.String CODE_TYPE_X = "X";
    public static final java.lang.String CODE_TYPE_Y = "Y";
    public static final java.lang.String CODE_TYPE_Z = "Z";
    public static final android.os.Parcelable.Creator<android.hardware.gnss.GnssSignalType> CREATOR = null;
    public double carrierFrequencyHz;
    public java.lang.String codeType;
    public int constellation;
    public GnssSignalType() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
