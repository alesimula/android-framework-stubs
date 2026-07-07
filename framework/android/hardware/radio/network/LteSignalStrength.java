package android.hardware.radio.network;

public class LteSignalStrength implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.LteSignalStrength> CREATOR = null;
    public int cqi;
    public int cqiTableIndex;
    public int rsrp;
    public int rsrq;
    public int rssnr;
    public int signalStrength;
    public int timingAdvance;
    public LteSignalStrength() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
