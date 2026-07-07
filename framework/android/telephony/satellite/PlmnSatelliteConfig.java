package android.telephony.satellite;

@android.annotation.SystemApi
public final class PlmnSatelliteConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.PlmnSatelliteConfig> CREATOR = null;
    private java.util.Set<java.lang.Integer> mSupportedServices;
    private PlmnSatelliteConfig(android.os.Parcel p0) {}
    public PlmnSatelliteConfig(java.util.Set<java.lang.Integer> p0) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Set<java.lang.Integer> getSupportedServices() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
