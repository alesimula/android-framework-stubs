package android.media.metrics;

public final class NetworkEvent extends android.media.metrics.Event implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.metrics.NetworkEvent> CREATOR = null;
    public static final int NETWORK_TYPE_2G = 4;
    public static final int NETWORK_TYPE_3G = 5;
    public static final int NETWORK_TYPE_4G = 6;
    public static final int NETWORK_TYPE_5G_NSA = 7;
    public static final int NETWORK_TYPE_5G_SA = 8;
    public static final int NETWORK_TYPE_ETHERNET = 3;
    public static final int NETWORK_TYPE_OFFLINE = 9;
    public static final int NETWORK_TYPE_OTHER = 1;
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int NETWORK_TYPE_WIFI = 2;
    private final int mNetworkType = 0;
    private final long mTimeSinceCreatedMillis = 0L;
    private NetworkEvent(int p0, long p1, android.os.Bundle p2) { super(); }
    private NetworkEvent(android.os.Parcel p0) { super(); }
    public static java.lang.String networkTypeToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.Bundle getMetricsBundle() { return null; }
    public int getNetworkType() { return 0; }
    public long getTimeSinceCreatedMillis() { return 0L; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.os.Bundle mMetricsBundle;
        private int mNetworkType;
        private long mTimeSinceCreatedMillis;
        public Builder() {}
        public android.media.metrics.NetworkEvent build() { return null; }
        public android.media.metrics.NetworkEvent.Builder setMetricsBundle(android.os.Bundle p0) { return null; }
        public android.media.metrics.NetworkEvent.Builder setNetworkType(int p0) { return null; }
        public android.media.metrics.NetworkEvent.Builder setTimeSinceCreatedMillis(long p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkType {
    }
}
