package android.telephony.satellite.stub;

public class SatelliteCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.stub.SatelliteCapabilities> CREATOR = null;
    public int[] antennaPositionKeys;
    public android.telephony.satellite.AntennaPosition[] antennaPositionValues;
    public boolean isPointingRequired;
    public int maxBytesPerOutgoingDatagram;
    public int[] supportedRadioTechnologies;
    public SatelliteCapabilities() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
