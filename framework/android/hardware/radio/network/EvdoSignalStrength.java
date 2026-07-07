package android.hardware.radio.network;

public class EvdoSignalStrength implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.EvdoSignalStrength> CREATOR = null;
    @java.lang.Deprecated
    public int dbm;
    @java.lang.Deprecated
    public int ecio;
    @java.lang.Deprecated
    public int signalNoiseRatio;
    public EvdoSignalStrength() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
