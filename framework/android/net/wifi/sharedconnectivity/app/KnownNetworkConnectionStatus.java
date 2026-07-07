package android.net.wifi.sharedconnectivity.app;

@android.annotation.SystemApi
public final class KnownNetworkConnectionStatus implements android.os.Parcelable {
    public static final int CONNECTION_STATUS_SAVED = 1;
    public static final int CONNECTION_STATUS_SAVE_FAILED = 2;
    public static final int CONNECTION_STATUS_UNKNOWN = 0;
    public static final android.os.Parcelable.Creator<android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus> CREATOR = null;
    private final android.os.Bundle mExtras = null;
    private final android.net.wifi.sharedconnectivity.app.KnownNetwork mKnownNetwork = null;
    private final int mStatus = 0;
    private KnownNetworkConnectionStatus(int p0, android.net.wifi.sharedconnectivity.app.KnownNetwork p1, android.os.Bundle p2) {}
    public static android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus readFromParcel(android.os.Parcel p0) { return null; }
    private static void validate(int p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.Bundle getExtras() { return null; }
    public android.net.wifi.sharedconnectivity.app.KnownNetwork getKnownNetwork() { return null; }
    public int getStatus() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.os.Bundle mExtras;
        private android.net.wifi.sharedconnectivity.app.KnownNetwork mKnownNetwork;
        private int mStatus;
        public Builder() {}
        public android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus build() { return null; }
        public android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus.Builder setKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus.Builder setStatus(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionStatus {
    }
}
