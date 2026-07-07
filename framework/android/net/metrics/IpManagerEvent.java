package android.net.metrics;

@android.annotation.SystemApi
@java.lang.Deprecated
public final class IpManagerEvent implements android.net.metrics.IpConnectivityLog.Event {
    public static final int COMPLETE_LIFECYCLE = 3;
    public static final android.os.Parcelable.Creator<android.net.metrics.IpManagerEvent> CREATOR = null;
    public static final int ERROR_INTERFACE_NOT_FOUND = 8;
    public static final int ERROR_INVALID_PROVISIONING = 7;
    public static final int ERROR_STARTING_IPREACHABILITYMONITOR = 6;
    public static final int ERROR_STARTING_IPV4 = 4;
    public static final int ERROR_STARTING_IPV6 = 5;
    public static final int PROVISIONING_FAIL = 2;
    public static final int PROVISIONING_OK = 1;
    public final long durationMs = 0L;
    public final int eventType = 0;
    public IpManagerEvent(int p0, long p1) {}
    private IpManagerEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    static final class Decoder {
        static final android.util.SparseArray<java.lang.String> constants = null;
        Decoder() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }
}
