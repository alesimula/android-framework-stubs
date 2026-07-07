package android.companion;

public final class WifiDeviceFilter implements android.companion.DeviceFilter<android.net.wifi.ScanResult> {
    public static final android.os.Parcelable.Creator<android.companion.WifiDeviceFilter> CREATOR = null;
    static com.android.internal.util.Parcelling<java.util.regex.Pattern> sParcellingForNamePattern;
    private final java.util.regex.Pattern mNamePattern = null;
    private WifiDeviceFilter(android.companion.WifiDeviceFilter.Builder p0) {}
    WifiDeviceFilter(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.net.MacAddress getBssid() { return null; }
    public android.net.MacAddress getBssidMask() { return null; }
    public java.lang.String getDeviceDisplayName(android.net.wifi.ScanResult p0) { return null; }
    public int getMediumType() { return 0; }
    public java.util.regex.Pattern getNamePattern() { return null; }
    public int hashCode() { return 0; }
    public boolean matches(android.net.wifi.ScanResult p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mBuilderFieldsSet;
        private java.util.regex.Pattern mNamePattern;
        public Builder() {}
        private void checkNotUsed() {}
        public android.companion.WifiDeviceFilter build() { return null; }
        public android.companion.WifiDeviceFilter.Builder setBssid(android.net.MacAddress p0) { return null; }
        public android.companion.WifiDeviceFilter.Builder setBssidMask(android.net.MacAddress p0) { return null; }
        public android.companion.WifiDeviceFilter.Builder setNamePattern(java.util.regex.Pattern p0) { return null; }
    }
}
