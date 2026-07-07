package android.hardware.tv.tuner;

public class DemuxAlpFilterSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxAlpFilterSettings> CREATOR = null;
    public android.hardware.tv.tuner.DemuxAlpFilterSettingsFilterSettings filterSettings;
    public byte lengthType;
    public int packetType;
    public DemuxAlpFilterSettings() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
