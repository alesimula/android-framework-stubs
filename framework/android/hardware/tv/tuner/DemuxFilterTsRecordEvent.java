package android.hardware.tv.tuner;

public class DemuxFilterTsRecordEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterTsRecordEvent> CREATOR = null;
    public long byteNumber;
    public int firstMbInSlice;
    public android.hardware.tv.tuner.DemuxPid pid;
    public long pts;
    public android.hardware.tv.tuner.DemuxFilterScIndexMask scIndexMask;
    public int tsIndexMask;
    public DemuxFilterTsRecordEvent() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
