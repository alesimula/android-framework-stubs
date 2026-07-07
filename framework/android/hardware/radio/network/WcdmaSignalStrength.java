package android.hardware.radio.network;

public class WcdmaSignalStrength implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.WcdmaSignalStrength> CREATOR = null;
    public int bitErrorRate;
    public int ecno;
    public int rscp;
    public int signalStrength;
    public WcdmaSignalStrength() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
