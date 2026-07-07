package android.hardware.contexthub;

public class DataFlowInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.DataFlowInfo> CREATOR = null;
    public android.hardware.contexthub.DataFlowAlertFds alertFds;
    public java.lang.String debugName;
    public long metadataOffsetBytes;
    public android.hardware.contexthub.SharedDataRegion region;
    public DataFlowInfo() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
