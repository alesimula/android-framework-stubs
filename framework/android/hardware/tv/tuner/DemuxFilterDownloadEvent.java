package android.hardware.tv.tuner;

public class DemuxFilterDownloadEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterDownloadEvent> CREATOR = null;
    public int dataLength;
    public int downloadId;
    public int itemFragmentIndex;
    public int itemId;
    public int lastItemFragmentIndex;
    public int mpuSequenceNumber;
    public DemuxFilterDownloadEvent() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
