package android.hardware.tv.tuner;

public class DemuxFilterMediaEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterMediaEvent> CREATOR = null;
    public long avDataId;
    public android.hardware.common.NativeHandle avMemory;
    public int dataGroupId;
    public long dataLength;
    public long dts;
    public android.hardware.tv.tuner.DemuxFilterMediaEventExtraMetaData extraMetaData;
    public int indexInDataGroup;
    public boolean isDtsPresent;
    public boolean isPesPrivateData;
    public boolean isPtsPresent;
    public boolean isSecureMemory;
    public int mpuSequenceNumber;
    public int numDataPieces;
    public long offset;
    public long pts;
    public android.hardware.tv.tuner.DemuxFilterScIndexMask scIndexMask;
    public int streamId;
    public DemuxFilterMediaEvent() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
