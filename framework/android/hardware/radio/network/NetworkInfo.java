package android.hardware.radio.network;

public class NetworkInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.NetworkInfo> CREATOR = null;
    public int accessNetwork;
    public int[] arfcns;
    public boolean hasSamePriorityAsTn;
    public java.lang.String plmn;
    public int satelliteTechnology;
    public NetworkInfo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
