package android.net.wifi.sharedconnectivity.app;

@android.annotation.SystemApi
public final class KnownNetwork implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.wifi.sharedconnectivity.app.KnownNetwork> CREATOR = null;
    public static final int NETWORK_SOURCE_CLOUD_SELF = 2;
    public static final int NETWORK_SOURCE_NEARBY_SELF = 1;
    public static final int NETWORK_SOURCE_UNKNOWN = 0;
    private final android.os.Bundle mExtras = null;
    private final android.net.wifi.sharedconnectivity.app.NetworkProviderInfo mNetworkProviderInfo = null;
    private final int mNetworkSource = 0;
    private final android.util.ArraySet<java.lang.Integer> mSecurityTypes = null;
    private final java.lang.String mSsid = null;
    private KnownNetwork(int p0, java.lang.String p1, android.util.ArraySet<java.lang.Integer> p2, android.net.wifi.sharedconnectivity.app.NetworkProviderInfo p3, android.os.Bundle p4) {}
    public static android.net.wifi.sharedconnectivity.app.KnownNetwork readFromParcel(android.os.Parcel p0) { return null; }
    private static void validate(int p0, java.lang.String p1, java.util.Set<java.lang.Integer> p2, android.net.wifi.sharedconnectivity.app.NetworkProviderInfo p3) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.Bundle getExtras() { return null; }
    public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo getNetworkProviderInfo() { return null; }
    public int getNetworkSource() { return 0; }
    public java.util.Set<java.lang.Integer> getSecurityTypes() { return null; }
    public java.lang.String getSsid() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.os.Bundle mExtras;
        private android.net.wifi.sharedconnectivity.app.NetworkProviderInfo mNetworkProviderInfo;
        private int mNetworkSource;
        private final android.util.ArraySet<java.lang.Integer> mSecurityTypes = null;
        private java.lang.String mSsid;
        public Builder() {}
        public android.net.wifi.sharedconnectivity.app.KnownNetwork.Builder addSecurityType(int p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.KnownNetwork build() { return null; }
        public android.net.wifi.sharedconnectivity.app.KnownNetwork.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.KnownNetwork.Builder setNetworkProviderInfo(android.net.wifi.sharedconnectivity.app.NetworkProviderInfo p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.KnownNetwork.Builder setNetworkSource(int p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.KnownNetwork.Builder setSsid(java.lang.String p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkSource {
    }
}
