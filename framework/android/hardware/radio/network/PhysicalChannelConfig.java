package android.hardware.radio.network;

public class PhysicalChannelConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.PhysicalChannelConfig> CREATOR = null;
    public android.hardware.radio.network.PhysicalChannelConfigBand band;
    public int cellBandwidthDownlinkKhz;
    public int cellBandwidthUplinkKhz;
    public int[] contextIds;
    public int downlinkChannelNumber;
    public int physicalCellId;
    public int rat;
    public int status;
    public int uplinkChannelNumber;
    public PhysicalChannelConfig() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
