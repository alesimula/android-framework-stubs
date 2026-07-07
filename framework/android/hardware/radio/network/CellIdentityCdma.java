package android.hardware.radio.network;

public class CellIdentityCdma implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellIdentityCdma> CREATOR = null;
    @java.lang.Deprecated
    public int baseStationId;
    @java.lang.Deprecated
    public int latitude;
    @java.lang.Deprecated
    public int longitude;
    @java.lang.Deprecated
    public int networkId;
    @java.lang.Deprecated
    public android.hardware.radio.network.OperatorInfo operatorNames;
    @java.lang.Deprecated
    public int systemId;
    public CellIdentityCdma() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
