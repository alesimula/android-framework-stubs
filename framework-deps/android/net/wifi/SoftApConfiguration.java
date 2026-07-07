package android.net.wifi;

public class SoftApConfiguration {
    public SoftApConfiguration() {}
    public java.lang.String getSsid() { return null; }
    public android.net.MacAddress getBssid() { return null; }
    public int getBand() { return 0; }
    public int getChannel() { return 0; }
    public boolean isHiddenSsid() { return false; }
    public int getSecurityType() { return 0; }
    public java.lang.String getPassphrase() { return null; }
    public int getMaxNumberOfClients() { return 0; }
    public boolean isClientControlByUserEnabled() { return false; }
    public boolean isAutoShutdownEnabled() { return false; }
    public long getShutdownTimeoutMillis() { return 0L; }
    public java.util.List getBlockedClientList() { return null; }
    public java.util.List getAllowedClientList() { return null; }

    public static class Builder {
        public Builder() {}
        public android.net.wifi.SoftApConfiguration.Builder setSsid(java.lang.String p0) { return null; }
        public android.net.wifi.SoftApConfiguration.Builder setBand(int p0) { return null; }
        public android.net.wifi.SoftApConfiguration.Builder setChannel(int p0, int p1) { return null; }
        public android.net.wifi.SoftApConfiguration.Builder setHiddenSsid(boolean p0) { return null; }
        public android.net.wifi.SoftApConfiguration.Builder setPassphrase(java.lang.String p0, int p1) { return null; }
        public android.net.wifi.SoftApConfiguration build() { return null; }
    }
}
