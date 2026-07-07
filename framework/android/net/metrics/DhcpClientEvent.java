package android.net.metrics;

@android.annotation.SystemApi
@java.lang.Deprecated
public final class DhcpClientEvent implements android.net.metrics.IpConnectivityLog.Event {
    public static final android.os.Parcelable.Creator<android.net.metrics.DhcpClientEvent> CREATOR = null;
    public final int durationMs = 0;
    public final java.lang.String msg = null;
    private DhcpClientEvent(android.os.Parcel p0) {}
    private DhcpClientEvent(java.lang.String p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mDurationMs;
        private java.lang.String mMsg;
        public Builder() {}
        public android.net.metrics.DhcpClientEvent build() { return null; }
        public android.net.metrics.DhcpClientEvent.Builder setDurationMs(int p0) { return null; }
        public android.net.metrics.DhcpClientEvent.Builder setMsg(java.lang.String p0) { return null; }
    }
}
