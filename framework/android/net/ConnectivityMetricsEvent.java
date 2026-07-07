package android.net;

public final class ConnectivityMetricsEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.ConnectivityMetricsEvent> CREATOR = null;
    public android.os.Parcelable data;
    public java.lang.String ifname;
    public int netId;
    public long timestamp;
    public long transports;
    public ConnectivityMetricsEvent() {}
    private ConnectivityMetricsEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
