package android.net;

@android.annotation.SystemApi
@java.lang.Deprecated
public class RssiCurve implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.RssiCurve> CREATOR = null;
    private static final int DEFAULT_ACTIVE_NETWORK_RSSI_BOOST = 25;
    public final int activeNetworkRssiBoost = 0;
    public final int bucketWidth = 0;
    public final byte[] rssiBuckets = null;
    public final int start = 0;
    public RssiCurve(int p0, int p1, byte[] p2) {}
    public RssiCurve(int p0, int p1, byte[] p2, int p3) {}
    private RssiCurve(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public byte lookupScore(int p0) { return 0; }
    public byte lookupScore(int p0, boolean p1) { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
