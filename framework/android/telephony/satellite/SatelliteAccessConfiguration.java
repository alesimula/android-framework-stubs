package android.telephony.satellite;

@android.annotation.SystemApi
public final class SatelliteAccessConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteAccessConfiguration> CREATOR = null;
    private java.util.List<java.lang.Integer> mCarrierIdList;
    private java.util.List<android.telephony.satellite.SatelliteInfo> mSatelliteInfoList;
    private java.util.List<java.lang.Integer> mTagIdList;
    public SatelliteAccessConfiguration(android.os.Parcel p0) {}
    public SatelliteAccessConfiguration(java.util.List<android.telephony.satellite.SatelliteInfo> p0, java.util.List<java.lang.Integer> p1) {}
    public SatelliteAccessConfiguration(java.util.List<android.telephony.satellite.SatelliteInfo> p0, java.util.List<java.lang.Integer> p1, java.util.List<java.lang.Integer> p2) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<java.lang.Integer> getCarrierIds() { return null; }
    public java.util.List<android.telephony.satellite.SatelliteInfo> getSatelliteInfos() { return null; }
    public java.util.List<java.lang.Integer> getTagIds() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
