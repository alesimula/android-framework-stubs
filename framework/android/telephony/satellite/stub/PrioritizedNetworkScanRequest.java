package android.telephony.satellite.stub;

public class PrioritizedNetworkScanRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.stub.PrioritizedNetworkScanRequest> CREATOR = null;
    public android.telephony.satellite.stub.NetworkInfo[] networkInfos;
    public int searchIntervalMs;
    public int validDurationSec;
    public PrioritizedNetworkScanRequest() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
