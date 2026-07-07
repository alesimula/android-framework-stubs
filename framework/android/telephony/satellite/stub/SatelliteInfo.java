package android.telephony.satellite.stub;

public class SatelliteInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.stub.SatelliteInfo> CREATOR = null;
    public int[] bands;
    public android.telephony.satellite.stub.EarfcnRange[] earfcnRanges;
    public android.telephony.satellite.stub.UUID id;
    public android.telephony.satellite.stub.SatellitePosition position;
    public SatelliteInfo() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
