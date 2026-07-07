package android.hardware.radio.network;

public class GsmSignalStrength implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.GsmSignalStrength> CREATOR = null;
    public int bitErrorRate;
    public int signalStrength;
    public int timingAdvance;
    public GsmSignalStrength() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
