package android.hardware.contexthub;

public class DataFlowAlertFds implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.DataFlowAlertFds> CREATOR = null;
    public android.os.ParcelFileDescriptor halAck;
    public android.os.ParcelFileDescriptor nonWaking;
    public android.os.ParcelFileDescriptor waking;
    public DataFlowAlertFds() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
