package android.net.metrics;

@android.annotation.SystemApi
@java.lang.Deprecated
public final class RaEvent implements android.net.metrics.IpConnectivityLog.Event {
    public static final android.os.Parcelable.Creator<android.net.metrics.RaEvent> CREATOR = null;
    private static final long NO_LIFETIME = -1L;
    public final long dnsslLifetime = 0L;
    public final long prefixPreferredLifetime = 0L;
    public final long prefixValidLifetime = 0L;
    public final long rdnssLifetime = 0L;
    public final long routeInfoLifetime = 0L;
    public final long routerLifetime = 0L;
    public RaEvent(long p0, long p1, long p2, long p3, long p4, long p5) {}
    private RaEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        long dnsslLifetime;
        long prefixPreferredLifetime;
        long prefixValidLifetime;
        long rdnssLifetime;
        long routeInfoLifetime;
        long routerLifetime;
        public Builder() {}
        private long updateLifetime(long p0, long p1) { return 0L; }
        public android.net.metrics.RaEvent build() { return null; }
        public android.net.metrics.RaEvent.Builder updateDnsslLifetime(long p0) { return null; }
        public android.net.metrics.RaEvent.Builder updatePrefixPreferredLifetime(long p0) { return null; }
        public android.net.metrics.RaEvent.Builder updatePrefixValidLifetime(long p0) { return null; }
        public android.net.metrics.RaEvent.Builder updateRdnssLifetime(long p0) { return null; }
        public android.net.metrics.RaEvent.Builder updateRouteInfoLifetime(long p0) { return null; }
        public android.net.metrics.RaEvent.Builder updateRouterLifetime(long p0) { return null; }
    }
}
