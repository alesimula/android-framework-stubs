package android.telephony.satellite;

@android.annotation.SystemApi
public final class SatelliteCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteCapabilities> CREATOR = null;
    private java.util.Map<java.lang.Integer, android.telephony.satellite.AntennaPosition> mAntennaPositionMap;
    private boolean mIsPointingRequired;
    private int mMaxBytesPerOutgoingDatagram;
    private java.util.Set<java.lang.Integer> mSupportedRadioTechnologies;
    private SatelliteCapabilities(android.os.Parcel p0) {}
    public SatelliteCapabilities(java.util.Set<java.lang.Integer> p0, boolean p1, int p2, java.util.Map<java.lang.Integer, android.telephony.satellite.AntennaPosition> p3) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Map<java.lang.Integer, android.telephony.satellite.AntennaPosition> getAntennaPositionMap() { return null; }
    public int getMaxBytesPerOutgoingDatagram() { return 0; }
    public java.util.Set<java.lang.Integer> getSupportedRadioTechnologies() { return null; }
    public int hashCode() { return 0; }
    public boolean isPointingRequired() { return false; }
    public void setMaxBytesPerOutgoingDatagram(int p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
