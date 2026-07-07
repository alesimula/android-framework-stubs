package android.hardware.tv.tuner;

public class DemuxTlvFilterSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxTlvFilterSettings> CREATOR = null;
    public android.hardware.tv.tuner.DemuxTlvFilterSettingsFilterSettings filterSettings;
    public boolean isCompressedIpPacket;
    public int packetType;
    public DemuxTlvFilterSettings() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
