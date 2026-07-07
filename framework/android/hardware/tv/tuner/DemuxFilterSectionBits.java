package android.hardware.tv.tuner;

public class DemuxFilterSectionBits implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterSectionBits> CREATOR = null;
    public byte[] filter;
    public byte[] mask;
    public byte[] mode;
    public DemuxFilterSectionBits() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
