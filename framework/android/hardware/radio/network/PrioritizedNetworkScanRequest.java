package android.hardware.radio.network;

public class PrioritizedNetworkScanRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.PrioritizedNetworkScanRequest> CREATOR = null;
    public android.hardware.radio.network.NetworkInfo[] networkInfos;
    public int searchIntervalMs;
    public int validDurationSec;
    public PrioritizedNetworkScanRequest() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
