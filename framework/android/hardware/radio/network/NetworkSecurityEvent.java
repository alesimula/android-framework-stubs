package android.hardware.radio.network;

public class NetworkSecurityEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.NetworkSecurityEvent> CREATOR = null;
    public int alertCategory;
    public int alertStatus;
    public int arfcn;
    public long cellId;
    public boolean isEmergency;
    public int physicalCellId;
    public java.lang.String plmn;
    public int rat;
    public int[] reasonCodes;
    public NetworkSecurityEvent() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
