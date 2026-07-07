package android.hardware.radio.data;

public class KeepaliveRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.KeepaliveRequest> CREATOR = null;
    public static final int TYPE_NATT_IPV4 = 0;
    public static final int TYPE_NATT_IPV6 = 1;
    public int cid;
    public byte[] destinationAddress;
    public int destinationPort;
    public int maxKeepaliveIntervalMillis;
    public byte[] sourceAddress;
    public int sourcePort;
    public int type;
    public KeepaliveRequest() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
