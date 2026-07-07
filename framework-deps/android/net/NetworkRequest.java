package android.net;

public class NetworkRequest {
    public NetworkRequest() {}
    public android.os.Parcelable.Creator CREATOR = null;
    public android.net.NetworkSpecifier getNetworkSpecifier() { return null; }
    public boolean hasCapability(int p0) { return false; }
    public boolean hasTransport(int p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        public Builder() {}
        public android.net.NetworkRequest.Builder addCapability(int p0) { return null; }
        public android.net.NetworkRequest.Builder removeCapability(int p0) { return null; }
        public android.net.NetworkRequest.Builder addTransportType(int p0) { return null; }
        public android.net.NetworkRequest build() { return null; }
    }
}
