package android.os.incremental;

public class IncrementalFileSystemControlParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.incremental.IncrementalFileSystemControlParcel> CREATOR = null;
    public android.os.ParcelFileDescriptor blocksWritten;
    public android.os.ParcelFileDescriptor cmd;
    public android.os.ParcelFileDescriptor log;
    public android.os.ParcelFileDescriptor pendingReads;
    public IncrementalFileSystemControlParcel() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
