package android.hardware.tv.tuner;

public class DemuxFilterSectionEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterSectionEvent> CREATOR = null;
    public long dataLength;
    public int sectionNum;
    public int tableId;
    public int version;
    public DemuxFilterSectionEvent() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
