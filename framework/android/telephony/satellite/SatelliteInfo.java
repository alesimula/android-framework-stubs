package android.telephony.satellite;

@android.annotation.SystemApi
public final class SatelliteInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteInfo> CREATOR = null;
    private java.util.List<java.lang.Integer> mBandList;
    private final java.util.List<android.telephony.satellite.EarfcnRange> mEarfcnRangeList = null;
    private java.util.UUID mId;
    private android.telephony.satellite.SatellitePosition mPosition;
    protected SatelliteInfo(android.os.Parcel p0) {}
    public SatelliteInfo(java.util.UUID p0, android.telephony.satellite.SatellitePosition p1, java.util.List<java.lang.Integer> p2, java.util.List<android.telephony.satellite.EarfcnRange> p3) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<java.lang.Integer> getBands() { return null; }
    public java.util.List<android.telephony.satellite.EarfcnRange> getEarfcnRanges() { return null; }
    public java.util.UUID getSatelliteId() { return null; }
    public android.telephony.satellite.SatellitePosition getSatellitePosition() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
