package android.net.wifi.nl80211;

@android.annotation.SystemApi
@java.lang.Deprecated
public final class DeviceWiphyCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.wifi.nl80211.DeviceWiphyCapabilities> CREATOR = null;
    private static final java.lang.String TAG = "DeviceWiphyCapabilities";
    private boolean m80211acSupported;
    private boolean m80211axSupported;
    private boolean m80211beSupported;
    private boolean m80211nSupported;
    private boolean mChannelWidth160MhzSupported;
    private boolean mChannelWidth320MhzSupported;
    private boolean mChannelWidth80p80MhzSupported;
    private int mMaxNumberAkms;
    private int mMaxNumberRxSpatialStreams;
    private int mMaxNumberTxSpatialStreams;
    public DeviceWiphyCapabilities() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getMaxNumberAkms() { return 0; }
    public int getMaxNumberRxSpatialStreams() { return 0; }
    public int getMaxNumberTxSpatialStreams() { return 0; }
    public int hashCode() { return 0; }
    public boolean isChannelWidthSupported(int p0) { return false; }
    public boolean isWifiStandardSupported(int p0) { return false; }
    public void setChannelWidthSupported(int p0, boolean p1) {}
    public void setMaxNumberAkms(int p0) {}
    public void setMaxNumberRxSpatialStreams(int p0) {}
    public void setMaxNumberTxSpatialStreams(int p0) {}
    public void setWifiStandardSupport(int p0, boolean p1) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
