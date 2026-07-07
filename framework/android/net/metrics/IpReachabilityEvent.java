package android.net.metrics;

@android.annotation.SystemApi
@java.lang.Deprecated
public final class IpReachabilityEvent implements android.net.metrics.IpConnectivityLog.Event {
    public static final android.os.Parcelable.Creator<android.net.metrics.IpReachabilityEvent> CREATOR = null;
    public static final int NUD_FAILED = 512;
    public static final int NUD_FAILED_ORGANIC = 1024;
    public static final int PROBE = 256;
    public static final int PROVISIONING_LOST = 768;
    public static final int PROVISIONING_LOST_ORGANIC = 1280;
    public final int eventType = 0;
    public IpReachabilityEvent(int p0) {}
    private IpReachabilityEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    static final class Decoder {
        static final android.util.SparseArray<java.lang.String> constants = null;
        Decoder() {}
    }
}
