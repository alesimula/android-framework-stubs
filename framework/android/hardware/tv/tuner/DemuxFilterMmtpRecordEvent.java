package android.hardware.tv.tuner;

public class DemuxFilterMmtpRecordEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterMmtpRecordEvent> CREATOR = null;
    public long byteNumber;
    public int firstMbInSlice;
    public int mpuSequenceNumber;
    public long pts;
    public int scHevcIndexMask;
    public int tsIndexMask;
    public DemuxFilterMmtpRecordEvent() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
