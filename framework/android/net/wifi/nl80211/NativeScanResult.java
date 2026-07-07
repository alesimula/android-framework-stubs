package android.net.wifi.nl80211;

@android.annotation.SystemApi
@java.lang.Deprecated
public final class NativeScanResult implements android.os.Parcelable {
    public static final int BSS_CAPABILITY_APSD = 2048;
    public static final int BSS_CAPABILITY_CF_POLLABLE = 4;
    public static final int BSS_CAPABILITY_CF_POLL_REQUEST = 8;
    public static final int BSS_CAPABILITY_CHANNEL_AGILITY = 128;
    public static final int BSS_CAPABILITY_DELAYED_BLOCK_ACK = 16384;
    public static final int BSS_CAPABILITY_DMG_ESS = 3;
    public static final int BSS_CAPABILITY_DMG_IBSS = 1;
    public static final int BSS_CAPABILITY_DSSS_OFDM = 8192;
    public static final int BSS_CAPABILITY_ESS = 1;
    public static final int BSS_CAPABILITY_IBSS = 2;
    public static final int BSS_CAPABILITY_IMMEDIATE_BLOCK_ACK = 32768;
    public static final int BSS_CAPABILITY_PBCC = 64;
    public static final int BSS_CAPABILITY_PRIVACY = 16;
    public static final int BSS_CAPABILITY_QOS = 512;
    public static final int BSS_CAPABILITY_RADIO_MANAGEMENT = 4096;
    public static final int BSS_CAPABILITY_SHORT_PREAMBLE = 32;
    public static final int BSS_CAPABILITY_SHORT_SLOT_TIME = 1024;
    public static final int BSS_CAPABILITY_SPECTRUM_MANAGEMENT = 256;
    public static final android.os.Parcelable.Creator<android.net.wifi.nl80211.NativeScanResult> CREATOR = null;
    private static final java.lang.String TAG = "NativeScanResult";
    public boolean associated;
    public byte[] bssid;
    public int capability;
    public int frequency;
    public byte[] infoElement;
    public java.util.List<android.net.wifi.nl80211.RadioChainInfo> radioChainInfos;
    public int signalMbm;
    public byte[] ssid;
    public long tsf;
    public NativeScanResult() {}
    public int describeContents() { return 0; }
    public android.net.MacAddress getBssid() { return null; }
    public int getCapabilities() { return 0; }
    public int getFrequencyMhz() { return 0; }
    public byte[] getInformationElements() { return null; }
    public java.util.List<android.net.wifi.nl80211.RadioChainInfo> getRadioChainInfos() { return null; }
    public int getSignalMbm() { return 0; }
    public byte[] getSsid() { return null; }
    public long getTsf() { return 0L; }
    public boolean isAssociated() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BssCapabilityBits {
    }
}
