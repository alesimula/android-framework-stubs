package android.hardware.tv.tuner;

public class DemuxFilterTemiEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterTemiEvent> CREATOR = null;
    public byte[] descrData;
    public byte descrTag;
    public long pts;
    public DemuxFilterTemiEvent() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
