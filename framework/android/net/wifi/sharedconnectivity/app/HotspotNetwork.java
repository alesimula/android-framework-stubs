package android.net.wifi.sharedconnectivity.app;

@android.annotation.SystemApi
public final class HotspotNetwork implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.wifi.sharedconnectivity.app.HotspotNetwork> CREATOR = null;
    public static final int NETWORK_TYPE_CELLULAR = 1;
    public static final int NETWORK_TYPE_ETHERNET = 3;
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int NETWORK_TYPE_WIFI = 2;
    private final long mDeviceId = 0L;
    private final android.os.Bundle mExtras = null;
    private final java.lang.String mHotspotBssid = null;
    private final android.util.ArraySet<java.lang.Integer> mHotspotSecurityTypes = null;
    private final java.lang.String mHotspotSsid = null;
    private final java.lang.String mNetworkName = null;
    private final android.net.wifi.sharedconnectivity.app.NetworkProviderInfo mNetworkProviderInfo = null;
    private final int mNetworkType = 0;
    private HotspotNetwork(long p0, android.net.wifi.sharedconnectivity.app.NetworkProviderInfo p1, int p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, android.util.ArraySet<java.lang.Integer> p6, android.os.Bundle p7) {}
    public static android.net.wifi.sharedconnectivity.app.HotspotNetwork readFromParcel(android.os.Parcel p0) { return null; }
    private static void validate(long p0, int p1, java.lang.String p2, android.net.wifi.sharedconnectivity.app.NetworkProviderInfo p3) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getDeviceId() { return 0L; }
    public android.os.Bundle getExtras() { return null; }
    public int getHostNetworkType() { return 0; }
    public java.lang.String getHotspotBssid() { return null; }
    public java.util.Set<java.lang.Integer> getHotspotSecurityTypes() { return null; }
    public java.lang.String getHotspotSsid() { return null; }
    public java.lang.String getNetworkName() { return null; }
    public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo getNetworkProviderInfo() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mDeviceId;
        private android.os.Bundle mExtras;
        private java.lang.String mHotspotBssid;
        private final android.util.ArraySet<java.lang.Integer> mHotspotSecurityTypes = null;
        private java.lang.String mHotspotSsid;
        private java.lang.String mNetworkName;
        private android.net.wifi.sharedconnectivity.app.NetworkProviderInfo mNetworkProviderInfo;
        private int mNetworkType;
        public Builder() {}
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder addHotspotSecurityType(int p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork build() { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder setDeviceId(long p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder setHostNetworkType(int p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder setHotspotBssid(java.lang.String p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder setHotspotSsid(java.lang.String p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder setNetworkName(java.lang.String p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder setNetworkProviderInfo(android.net.wifi.sharedconnectivity.app.NetworkProviderInfo p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkType {
    }
}
