package android.hardware.radio.network;

public class NrSignalStrength implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.NrSignalStrength> CREATOR = null;
    public byte[] csiCqiReport;
    public int csiCqiTableIndex;
    public int csiRsrp;
    public int csiRsrq;
    public int csiSinr;
    public int ssRsrp;
    public int ssRsrq;
    public int ssSinr;
    public int timingAdvance;
    public NrSignalStrength() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
