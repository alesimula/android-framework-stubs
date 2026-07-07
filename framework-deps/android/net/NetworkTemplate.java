package android.net;

public class NetworkTemplate {
    public NetworkTemplate() {}
    public android.os.Parcelable.Creator CREATOR = null;
    public int getMatchRule() { return 0; }
    public java.util.Set getSubscriberIds() { return null; }
    public java.util.Set getWifiNetworkKeys() { return null; }
    public int getMeteredness() { return 0; }

    public static class Builder {
        public Builder(int p0) {}
        public android.net.NetworkTemplate.Builder setMeteredness(int p0) { return null; }
        public android.net.NetworkTemplate.Builder setSubscriberIds(java.util.Set p0) { return null; }
        public android.net.NetworkTemplate.Builder setWifiNetworkKeys(java.util.Set p0) { return null; }
        public android.net.NetworkTemplate build() { return null; }
    }
}
