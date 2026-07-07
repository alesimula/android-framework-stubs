package android.hardware.radio.network;

public class NetworkScanResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.NetworkScanResult> CREATOR = null;
    public static final int SCAN_STATUS_COMPLETE = 2;
    public static final int SCAN_STATUS_PARTIAL = 1;
    public int error;
    public android.hardware.radio.network.CellInfo[] networkInfos;
    public int status;
    public NetworkScanResult() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
