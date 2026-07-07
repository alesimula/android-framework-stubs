package android.telephony.satellite.stub;

public class SatelliteNetworkInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.stub.SatelliteNetworkInfo> CREATOR = null;
    public android.telephony.satellite.stub.NetworkInfo[] allowedPlmns;
    public android.telephony.satellite.stub.NetworkInfo[] disallowedPlmns;
    public SatelliteNetworkInfo() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
